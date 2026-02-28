// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.iot20180120.models.*;
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
        this.product = "Iot";
        this.version = "2018-01-20";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("ap-northeast-2-pop", "iot.aliyuncs.com"),
            new TeaPair("ap-south-1", "iot.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "iot.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "iot.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "iot.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "iot.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "iot.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "iot.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "iot.aliyuncs.com"),
            new TeaPair("cn-chengdu", "iot.aliyuncs.com"),
            new TeaPair("cn-edge-1", "iot.aliyuncs.com"),
            new TeaPair("cn-fujian", "iot.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "iot.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "iot.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "iot.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "iot.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "iot.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "iot.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "iot.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "iot.aliyuncs.com"),
            new TeaPair("cn-hongkong", "iot.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "iot.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "iot.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "iot.aliyuncs.com"),
            new TeaPair("cn-qingdao", "iot.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "iot.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "iot.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "iot.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "iot.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "iot.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "iot.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "iot.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "iot.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "iot.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "iot.aliyuncs.com"),
            new TeaPair("cn-wuhan", "iot.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "iot.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "iot.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "iot.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "iot.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "iot.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "iot.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "iot.aliyuncs.com"),
            new TeaPair("eu-west-1", "iot.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "iot.aliyuncs.com"),
            new TeaPair("me-east-1", "iot.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "iot.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AddDataForApiSource  AddDataForApiSourceRequest
     * @return AddDataForApiSourceResponse
     */
    @Override
    public CompletableFuture<AddDataForApiSourceResponse> addDataForApiSource(AddDataForApiSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddDataForApiSource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddDataForApiSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddDataForApiSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddDeviceToSharePromotion  AddDeviceToSharePromotionRequest
     * @return AddDeviceToSharePromotionResponse
     */
    @Override
    public CompletableFuture<AddDeviceToSharePromotionResponse> addDeviceToSharePromotion(AddDeviceToSharePromotionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddDeviceToSharePromotion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddDeviceToSharePromotionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddDeviceToSharePromotionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddPowerStation  AddPowerStationRequest
     * @return AddPowerStationResponse
     */
    @Override
    public CompletableFuture<AddPowerStationResponse> addPowerStation(AddPowerStationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddPowerStation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddPowerStationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddPowerStationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddShareTaskDevice  AddShareTaskDeviceRequest
     * @return AddShareTaskDeviceResponse
     */
    @Override
    public CompletableFuture<AddShareTaskDeviceResponse> addShareTaskDevice(AddShareTaskDeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddShareTaskDevice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddShareTaskDeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddShareTaskDeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AsyncRRpc  AsyncRRpcRequest
     * @return AsyncRRpcResponse
     */
    @Override
    public CompletableFuture<AsyncRRpcResponse> asyncRRpc(AsyncRRpcRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AsyncRRpc").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AsyncRRpcResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AsyncRRpcResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AttachDestination  AttachDestinationRequest
     * @return AttachDestinationResponse
     */
    @Override
    public CompletableFuture<AttachDestinationResponse> attachDestination(AttachDestinationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachDestination").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachDestinationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachDestinationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AttachParserDataSource  AttachParserDataSourceRequest
     * @return AttachParserDataSourceResponse
     */
    @Override
    public CompletableFuture<AttachParserDataSourceResponse> attachParserDataSource(AttachParserDataSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachParserDataSource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachParserDataSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachParserDataSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchAddDataForApiSource  BatchAddDataForApiSourceRequest
     * @return BatchAddDataForApiSourceResponse
     */
    @Override
    public CompletableFuture<BatchAddDataForApiSourceResponse> batchAddDataForApiSource(BatchAddDataForApiSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchAddDataForApiSource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchAddDataForApiSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchAddDataForApiSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>In addition to the preceding operation-specific request parameters, you must specify common request parameters when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/30561.html">Common request parameters</a>.</p>
     * 
     * @param request the request parameters of BatchAddDeviceGroupRelations  BatchAddDeviceGroupRelationsRequest
     * @return BatchAddDeviceGroupRelationsResponse
     */
    @Override
    public CompletableFuture<BatchAddDeviceGroupRelationsResponse> batchAddDeviceGroupRelations(BatchAddDeviceGroupRelationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchAddDeviceGroupRelations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchAddDeviceGroupRelationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchAddDeviceGroupRelationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can attach up to 10 sub-devices to a gateway in a single call.</p>
     * <ul>
     * <li>The API operation caller must be the gateway owner.</li>
     * <li>If you specify a sub-device that is already attached to a gateway, the original gateway is replaced with the specified gateway.</li>
     * <li>If one of the specified sub-devices fails to establish a topological relationship with the gateway, the system rolls back, and all specified sub-devices fail to establish topological relationships with the gateway.</li>
     * <li>After you call this operation to establish topological relationships between sub-devices and the gateway, IoT Platform uses the <code>/sys/${productKey}/${deviceName}/thing/topo/change</code> topic to push information that includes the result of this operation to the gateway. For more information, see <a href="https://help.aliyun.com/document_detail/89299.html">Notify gateways of changes of topological relationships</a>.</li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 10 times per second per Alibaba Cloud account. </p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of BatchAddThingTopo  BatchAddThingTopoRequest
     * @return BatchAddThingTopoResponse
     */
    @Override
    public CompletableFuture<BatchAddThingTopoResponse> batchAddThingTopo(BatchAddThingTopoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchAddThingTopo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchAddThingTopoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchAddThingTopoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>In addition to the preceding operation-specific request parameters, you must specify common request parameters when you call this operation. For more information about common request parameters, see <a href="https://help.aliyun.com/document_detail/30561.html">Common parameters</a>.</p>
     * 
     * @param request the request parameters of BatchBindDeviceToEdgeInstanceWithDriver  BatchBindDeviceToEdgeInstanceWithDriverRequest
     * @return BatchBindDeviceToEdgeInstanceWithDriverResponse
     */
    @Override
    public CompletableFuture<BatchBindDeviceToEdgeInstanceWithDriverResponse> batchBindDeviceToEdgeInstanceWithDriver(BatchBindDeviceToEdgeInstanceWithDriverRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchBindDeviceToEdgeInstanceWithDriver").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchBindDeviceToEdgeInstanceWithDriverResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchBindDeviceToEdgeInstanceWithDriverResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchBindDevicesIntoProject  BatchBindDevicesIntoProjectRequest
     * @return BatchBindDevicesIntoProjectResponse
     */
    @Override
    public CompletableFuture<BatchBindDevicesIntoProjectResponse> batchBindDevicesIntoProject(BatchBindDevicesIntoProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchBindDevicesIntoProject").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchBindDevicesIntoProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchBindDevicesIntoProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchBindProductsIntoProject  BatchBindProductsIntoProjectRequest
     * @return BatchBindProductsIntoProjectResponse
     */
    @Override
    public CompletableFuture<BatchBindProductsIntoProjectResponse> batchBindProductsIntoProject(BatchBindProductsIntoProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchBindProductsIntoProject").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchBindProductsIntoProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchBindProductsIntoProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation with the <strong>BatchRegisterDeviceWithApplyId</strong> operation to register multiple devices under a product. Each device carries a unique DeviceName.
     * Procedure:
     * 1\. Call this operation to specify the DeviceNames of the devices to be registered. IoT Platform returns an application ID (<strong>ApplyId</strong>). A successful response indicates that the request to verify the DeviceNames is submitted. The actual registration process is asynchronously implemented and takes some minutes.
     * 2\. Call the <a href="https://help.aliyun.com/document_detail/69483.html">QueryBatchRegisterDeviceStatus</a> operation to query the name setting result.
     * 3\. Call the <a href="https://help.aliyun.com/document_detail/69514.html">BatchRegisterDeviceWithApplyId</a> operation to register multiple devices.
     * 4\. Optional. Call the <a href="https://help.aliyun.com/document_detail/69483.html">QueryBatchRegisterDeviceStatus</a> operation to view the registration result.
     * 5\. Call the <a href="https://help.aliyun.com/document_detail/69518.html">QueryPageByApplyId</a> operation to query the information about the registered devices.</p>
     * <h2>Limits</h2>
     * <ul>
     * <li>You can specify a maximum of 10,000 DeviceNames in a single call.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).  &gt;  RAM users of an Alibaba Cloud account share the quota of the account.</li>
     * </ul>
     * 
     * @param request the request parameters of BatchCheckDeviceNames  BatchCheckDeviceNamesRequest
     * @return BatchCheckDeviceNamesResponse
     */
    @Override
    public CompletableFuture<BatchCheckDeviceNamesResponse> batchCheckDeviceNames(BatchCheckDeviceNamesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchCheckDeviceNames").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchCheckDeviceNamesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchCheckDeviceNamesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <blockquote>
     * <p>The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of BatchCheckImportDevice  BatchCheckImportDeviceRequest
     * @return BatchCheckImportDeviceResponse
     */
    @Override
    public CompletableFuture<BatchCheckImportDeviceResponse> batchCheckImportDevice(BatchCheckImportDeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchCheckImportDevice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchCheckImportDeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchCheckImportDeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The invalid device models returned if the call fails.</p>
     * 
     * @param request the request parameters of BatchCheckVehicleDevice  BatchCheckVehicleDeviceRequest
     * @return BatchCheckVehicleDeviceResponse
     */
    @Override
    public CompletableFuture<BatchCheckVehicleDeviceResponse> batchCheckVehicleDevice(BatchCheckVehicleDeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchCheckVehicleDevice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchCheckVehicleDeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchCheckVehicleDeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of five queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of BatchClearEdgeInstanceDeviceConfig  BatchClearEdgeInstanceDeviceConfigRequest
     * @return BatchClearEdgeInstanceDeviceConfigResponse
     */
    @Override
    public CompletableFuture<BatchClearEdgeInstanceDeviceConfigResponse> batchClearEdgeInstanceDeviceConfig(BatchClearEdgeInstanceDeviceConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchClearEdgeInstanceDeviceConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchClearEdgeInstanceDeviceConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchClearEdgeInstanceDeviceConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchCreateSoundCodeLabel  BatchCreateSoundCodeLabelRequest
     * @return BatchCreateSoundCodeLabelResponse
     */
    @Override
    public CompletableFuture<BatchCreateSoundCodeLabelResponse> batchCreateSoundCodeLabel(BatchCreateSoundCodeLabelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchCreateSoundCodeLabel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchCreateSoundCodeLabelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchCreateSoundCodeLabelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchCreateSoundCodeLabelWithLabels  BatchCreateSoundCodeLabelWithLabelsRequest
     * @return BatchCreateSoundCodeLabelWithLabelsResponse
     */
    @Override
    public CompletableFuture<BatchCreateSoundCodeLabelWithLabelsResponse> batchCreateSoundCodeLabelWithLabels(BatchCreateSoundCodeLabelWithLabelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchCreateSoundCodeLabelWithLabels").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchCreateSoundCodeLabelWithLabelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchCreateSoundCodeLabelWithLabelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of BatchDeleteDeviceGroupRelations  BatchDeleteDeviceGroupRelationsRequest
     * @return BatchDeleteDeviceGroupRelationsResponse
     */
    @Override
    public CompletableFuture<BatchDeleteDeviceGroupRelationsResponse> batchDeleteDeviceGroupRelations(BatchDeleteDeviceGroupRelationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchDeleteDeviceGroupRelations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchDeleteDeviceGroupRelationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchDeleteDeviceGroupRelationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchDeleteEdgeInstanceChannel  BatchDeleteEdgeInstanceChannelRequest
     * @return BatchDeleteEdgeInstanceChannelResponse
     */
    @Override
    public CompletableFuture<BatchDeleteEdgeInstanceChannelResponse> batchDeleteEdgeInstanceChannel(BatchDeleteEdgeInstanceChannelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchDeleteEdgeInstanceChannel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchDeleteEdgeInstanceChannelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchDeleteEdgeInstanceChannelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchGetDeviceBindStatus  BatchGetDeviceBindStatusRequest
     * @return BatchGetDeviceBindStatusResponse
     */
    @Override
    public CompletableFuture<BatchGetDeviceBindStatusResponse> batchGetDeviceBindStatus(BatchGetDeviceBindStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchGetDeviceBindStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchGetDeviceBindStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchGetDeviceBindStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation, you can perform the following operations:</p>
     * <ul>
     * <li>You can specify a value for the <strong>ProductKey</strong> parameter and multiple values for the <strong>DeviceName</strong> parameter to query the status of devices that belong to a product.</li>
     * <li>You can specify multiple values for the <strong>IotId</strong> parameter to query the status of devices that belong to different products.****<blockquote>
     * <p>You can query the status of up to 50 devices in a call.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 50 queries per second (QPS). </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of BatchGetDeviceState  BatchGetDeviceStateRequest
     * @return BatchGetDeviceStateResponse
     */
    @Override
    public CompletableFuture<BatchGetDeviceStateResponse> batchGetDeviceState(BatchGetDeviceStateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchGetDeviceState").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchGetDeviceStateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchGetDeviceStateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>A single Alibaba Cloud account can run a maximum of 5 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of BatchGetEdgeDriver  BatchGetEdgeDriverRequest
     * @return BatchGetEdgeDriverResponse
     */
    @Override
    public CompletableFuture<BatchGetEdgeDriverResponse> batchGetEdgeDriver(BatchGetEdgeDriverRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchGetEdgeDriver").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchGetEdgeDriverResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchGetEdgeDriverResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchGetEdgeInstanceChannel  BatchGetEdgeInstanceChannelRequest
     * @return BatchGetEdgeInstanceChannelResponse
     */
    @Override
    public CompletableFuture<BatchGetEdgeInstanceChannelResponse> batchGetEdgeInstanceChannel(BatchGetEdgeInstanceChannelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchGetEdgeInstanceChannel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchGetEdgeInstanceChannelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchGetEdgeInstanceChannelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchGetEdgeInstanceDeviceChannel  BatchGetEdgeInstanceDeviceChannelRequest
     * @return BatchGetEdgeInstanceDeviceChannelResponse
     */
    @Override
    public CompletableFuture<BatchGetEdgeInstanceDeviceChannelResponse> batchGetEdgeInstanceDeviceChannel(BatchGetEdgeInstanceDeviceChannelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchGetEdgeInstanceDeviceChannel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchGetEdgeInstanceDeviceChannelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchGetEdgeInstanceDeviceChannelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of five queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of BatchGetEdgeInstanceDeviceConfig  BatchGetEdgeInstanceDeviceConfigRequest
     * @return BatchGetEdgeInstanceDeviceConfigResponse
     */
    @Override
    public CompletableFuture<BatchGetEdgeInstanceDeviceConfigResponse> batchGetEdgeInstanceDeviceConfig(BatchGetEdgeInstanceDeviceConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchGetEdgeInstanceDeviceConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchGetEdgeInstanceDeviceConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchGetEdgeInstanceDeviceConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchGetEdgeInstanceDeviceDriver  BatchGetEdgeInstanceDeviceDriverRequest
     * @return BatchGetEdgeInstanceDeviceDriverResponse
     */
    @Override
    public CompletableFuture<BatchGetEdgeInstanceDeviceDriverResponse> batchGetEdgeInstanceDeviceDriver(BatchGetEdgeInstanceDeviceDriverRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchGetEdgeInstanceDeviceDriver").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchGetEdgeInstanceDeviceDriverResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchGetEdgeInstanceDeviceDriverResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of BatchGetEdgeInstanceDriverConfigs  BatchGetEdgeInstanceDriverConfigsRequest
     * @return BatchGetEdgeInstanceDriverConfigsResponse
     */
    @Override
    public CompletableFuture<BatchGetEdgeInstanceDriverConfigsResponse> batchGetEdgeInstanceDriverConfigs(BatchGetEdgeInstanceDriverConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchGetEdgeInstanceDriverConfigs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchGetEdgeInstanceDriverConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchGetEdgeInstanceDriverConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchGrayMigrationDevice  BatchGrayMigrationDeviceRequest
     * @return BatchGrayMigrationDeviceResponse
     */
    @Override
    public CompletableFuture<BatchGrayMigrationDeviceResponse> batchGrayMigrationDevice(BatchGrayMigrationDeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchGrayMigrationDevice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchGrayMigrationDeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchGrayMigrationDeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>Before you call this operation, make sure that an MQTT gateway and the related product are created and the <strong>ProductKey</strong> of the product is obtained. For more information, see <a href="https://help.aliyun.com/document_detail/433804.html">Create an MQTT gateway</a>.</p>
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 10 times per second per account.</p>
     * <blockquote>
     * <p>The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of BatchImportDevice  BatchImportDeviceRequest
     * @return BatchImportDeviceResponse
     */
    @Override
    public CompletableFuture<BatchImportDeviceResponse> batchImportDevice(BatchImportDeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchImportDevice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchImportDeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchImportDeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Indicates whether the call was successful. Valid values: </p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * @param request the request parameters of BatchImportVehicleDevice  BatchImportVehicleDeviceRequest
     * @return BatchImportVehicleDeviceResponse
     */
    @Override
    public CompletableFuture<BatchImportVehicleDeviceResponse> batchImportVehicleDevice(BatchImportVehicleDeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchImportVehicleDevice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchImportVehicleDeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchImportVehicleDeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to publish a message to a maximum of 100 devices of a product at a time.</p>
     * <ul>
     * <li>The BatchPub operation cannot be used to send commands of setting properties or calling services. If you need to set properties, use the <a href="https://help.aliyun.com/document_detail/69579.html">SetDeviceProperty</a> or <a href="https://help.aliyun.com/document_detail/96243.html">SetDevicesProperty</a> operation. If you need to call services, use the <a href="https://help.aliyun.com/document_detail/69584.html">InvokeThingService</a> or <a href="https://help.aliyun.com/document_detail/96242.html">InvokeThingsService</a> operation.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of BatchPub  BatchPubRequest
     * @return BatchPubResponse
     */
    @Override
    public CompletableFuture<BatchPubResponse> batchPub(BatchPubRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchPub").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchPubResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchPubResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>You can query a maximum of 100 devices in a single call.</li>
     * <li>You can query the details of devices that belong only to the current Alibaba Cloud account. If you specify a device that does not belong to the current account, an error message is returned.</li>
     * <li>If you specify multiple devices and some devices do not exist, only the details of existing devices are returned.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 5 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of BatchQueryDeviceDetail  BatchQueryDeviceDetailRequest
     * @return BatchQueryDeviceDetailResponse
     */
    @Override
    public CompletableFuture<BatchQueryDeviceDetailResponse> batchQueryDeviceDetail(BatchQueryDeviceDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchQueryDeviceDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchQueryDeviceDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchQueryDeviceDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can use one of the following methods to register multiple devices:</p>
     * <ul>
     * <li>If you want to generate random DeviceNames, call the BatchRegisterDevice operation.
     * Perform the following steps to register devices and view the result:
     * 1\. Call the BatchRegisterDevice operation to register multiple devices. A successful response indicates that the registration request is submitted. The actual registration process is asynchronously implemented and takes some minutes.
     * 2\. Call the <a href="https://help.aliyun.com/document_detail/69483.html">QueryBatchRegisterDeviceStatus</a> operation to query the device registration result.
     * 3\. Call the <a href="https://help.aliyun.com/document_detail/69518.html">QueryPageByApplyId</a> operation to view the details of registered devices. The details include the DeviceName, DeviceSecret, and IotId parameters.</li>
     * <li>If you want to specify custom DeviceNames, call the BatchRegisterDeviceWithApplyId operation. For more information, see <a href="https://help.aliyun.com/document_detail/69514.html">BatchRegisterDeviceWithApplyId</a>.</li>
     * </ul>
     * <h2>Limits</h2>
     * <ul>
     * <li>You can create a maximum of 10,000 devices in a single call.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).  &gt;  RAM users of an Alibaba Cloud account share the quota of the account.</li>
     * </ul>
     * 
     * @param request the request parameters of BatchRegisterDevice  BatchRegisterDeviceRequest
     * @return BatchRegisterDeviceResponse
     */
    @Override
    public CompletableFuture<BatchRegisterDeviceResponse> batchRegisterDevice(BatchRegisterDeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchRegisterDevice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchRegisterDeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchRegisterDeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can use one of the following methods to register multiple devices at a time:</p>
     * <ul>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/69473.html">BatchRegisterDevice</a> operation to generate random DeviceNames.</li>
     * <li>Call the BatchRegisterDeviceWithApplyId and <strong>BatchCheckDeviceNames</strong> operations to specify custom DeviceNames. Procedure:
     * Call the <a href="https://help.aliyun.com/document_detail/69482.html">BatchCheckDeviceNames</a> operation and specify the names of devices that you want to register. If the DeviceNames are valid, IoT Platform returns an application ID that is specified by the <strong>ApplyId</strong> parameter. You can query the DeviceName setting results, device registration results, and device details by <strong>ApplyId</strong>.
     * Call the <a href="https://help.aliyun.com/document_detail/69483.html">QueryBatchRegisterDeviceStatus</a> operation to query the name setting result.
     * Call the BatchRegisterDeviceWithApplyId operation to register multiple devices. The successful result that is returned by this operation indicates that only the batch registration request is submitted. In actual scenarios, the registration process takes a few minutes.
     * Optional. Call the <a href="https://help.aliyun.com/document_detail/69483.html">QueryBatchRegisterDeviceStatus</a> operation to query the device registration result.
     * Call the <a href="https://help.aliyun.com/document_detail/69518.html">QueryPageByApplyId</a> operation to view the details of devices that are registered in batches.</li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 500 queries per second (QPS). </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of BatchRegisterDeviceWithApplyId  BatchRegisterDeviceWithApplyIdRequest
     * @return BatchRegisterDeviceWithApplyIdResponse
     */
    @Override
    public CompletableFuture<BatchRegisterDeviceWithApplyIdResponse> batchRegisterDeviceWithApplyId(BatchRegisterDeviceWithApplyIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchRegisterDeviceWithApplyId").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchRegisterDeviceWithApplyIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchRegisterDeviceWithApplyIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchSetEdgeInstanceDeviceChannel  BatchSetEdgeInstanceDeviceChannelRequest
     * @return BatchSetEdgeInstanceDeviceChannelResponse
     */
    @Override
    public CompletableFuture<BatchSetEdgeInstanceDeviceChannelResponse> batchSetEdgeInstanceDeviceChannel(BatchSetEdgeInstanceDeviceChannelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchSetEdgeInstanceDeviceChannel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchSetEdgeInstanceDeviceChannelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchSetEdgeInstanceDeviceChannelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchSetEdgeInstanceDeviceConfig  BatchSetEdgeInstanceDeviceConfigRequest
     * @return BatchSetEdgeInstanceDeviceConfigResponse
     */
    @Override
    public CompletableFuture<BatchSetEdgeInstanceDeviceConfigResponse> batchSetEdgeInstanceDeviceConfig(BatchSetEdgeInstanceDeviceConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchSetEdgeInstanceDeviceConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchSetEdgeInstanceDeviceConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchSetEdgeInstanceDeviceConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of five queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of BatchUnbindDeviceFromEdgeInstance  BatchUnbindDeviceFromEdgeInstanceRequest
     * @return BatchUnbindDeviceFromEdgeInstanceResponse
     */
    @Override
    public CompletableFuture<BatchUnbindDeviceFromEdgeInstanceResponse> batchUnbindDeviceFromEdgeInstance(BatchUnbindDeviceFromEdgeInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchUnbindDeviceFromEdgeInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchUnbindDeviceFromEdgeInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchUnbindDeviceFromEdgeInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchUnbindProjectDevices  BatchUnbindProjectDevicesRequest
     * @return BatchUnbindProjectDevicesResponse
     */
    @Override
    public CompletableFuture<BatchUnbindProjectDevicesResponse> batchUnbindProjectDevices(BatchUnbindProjectDevicesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchUnbindProjectDevices").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchUnbindProjectDevicesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchUnbindProjectDevicesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchUnbindProjectProducts  BatchUnbindProjectProductsRequest
     * @return BatchUnbindProjectProductsResponse
     */
    @Override
    public CompletableFuture<BatchUnbindProjectProductsResponse> batchUnbindProjectProducts(BatchUnbindProjectProductsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchUnbindProjectProducts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchUnbindProjectProductsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchUnbindProjectProductsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of BatchUpdateDeviceNickname  BatchUpdateDeviceNicknameRequest
     * @return BatchUpdateDeviceNicknameResponse
     */
    @Override
    public CompletableFuture<BatchUpdateDeviceNicknameResponse> batchUpdateDeviceNickname(BatchUpdateDeviceNicknameRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchUpdateDeviceNickname").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchUpdateDeviceNicknameResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchUpdateDeviceNicknameResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BindApplicationToEdgeInstance  BindApplicationToEdgeInstanceRequest
     * @return BindApplicationToEdgeInstanceResponse
     */
    @Override
    public CompletableFuture<BindApplicationToEdgeInstanceResponse> bindApplicationToEdgeInstance(BindApplicationToEdgeInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BindApplicationToEdgeInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BindApplicationToEdgeInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BindApplicationToEdgeInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of five queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of BindDriverToEdgeInstance  BindDriverToEdgeInstanceRequest
     * @return BindDriverToEdgeInstanceResponse
     */
    @Override
    public CompletableFuture<BindDriverToEdgeInstanceResponse> bindDriverToEdgeInstance(BindDriverToEdgeInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BindDriverToEdgeInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BindDriverToEdgeInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BindDriverToEdgeInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of BindGatewayToEdgeInstance  BindGatewayToEdgeInstanceRequest
     * @return BindGatewayToEdgeInstanceResponse
     */
    @Override
    public CompletableFuture<BindGatewayToEdgeInstanceResponse> bindGatewayToEdgeInstance(BindGatewayToEdgeInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BindGatewayToEdgeInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BindGatewayToEdgeInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BindGatewayToEdgeInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>Before you call this operation, make sure that the following steps are complete:</p>
     * <ol>
     * <li>A license is purchased. For more information, see <a href="https://help.aliyun.com/document_detail/427935.html">Purchase a license</a>.</li>
     * <li>The license is bound to a product. The devices to which you want to bind the license belong to the product. For more information, see <a href="https://help.aliyun.com/document_detail/427956.html">BindLicenseProduct</a> or <a href="https://help.aliyun.com/document_detail/427937.html">Bind a license to a product</a>.</li>
     * </ol>
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 10 times per second per account.</p>
     * <blockquote>
     * <p>The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of BindLicenseDevice  BindLicenseDeviceRequest
     * @return BindLicenseDeviceResponse
     */
    @Override
    public CompletableFuture<BindLicenseDeviceResponse> bindLicenseDevice(BindLicenseDeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BindLicenseDevice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BindLicenseDeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BindLicenseDeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BindLicenseProduct  BindLicenseProductRequest
     * @return BindLicenseProductResponse
     */
    @Override
    public CompletableFuture<BindLicenseProductResponse> bindLicenseProduct(BindLicenseProductRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BindLicenseProduct").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BindLicenseProductResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BindLicenseProductResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BindRoleToEdgeInstance  BindRoleToEdgeInstanceRequest
     * @return BindRoleToEdgeInstanceResponse
     */
    @Override
    public CompletableFuture<BindRoleToEdgeInstanceResponse> bindRoleToEdgeInstance(BindRoleToEdgeInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BindRoleToEdgeInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BindRoleToEdgeInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BindRoleToEdgeInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BindSceneRuleToEdgeInstance  BindSceneRuleToEdgeInstanceRequest
     * @return BindSceneRuleToEdgeInstanceResponse
     */
    @Override
    public CompletableFuture<BindSceneRuleToEdgeInstanceResponse> bindSceneRuleToEdgeInstance(BindSceneRuleToEdgeInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BindSceneRuleToEdgeInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BindSceneRuleToEdgeInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BindSceneRuleToEdgeInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CancelJob  CancelJobRequest
     * @return CancelJobResponse
     */
    @Override
    public CompletableFuture<CancelJobResponse> cancelJob(CancelJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>You can cancel only the dynamic update policy that is attached to a dynamic update batch. This operation is not applicable to static update batches.
     * After the operation is successful, the <strong>JobStatus</strong> parameter is set to CANCELED.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CancelOTAStrategyByJob  CancelOTAStrategyByJobRequest
     * @return CancelOTAStrategyByJobResponse
     */
    @Override
    public CompletableFuture<CancelOTAStrategyByJobResponse> cancelOTAStrategyByJob(CancelOTAStrategyByJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelOTAStrategyByJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelOTAStrategyByJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelOTAStrategyByJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation can cancel device update tasks only when the tasks are in the to be pushed, pushed, or in upgrade state.</p>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 10 queries per second (QPS). </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CancelOTATaskByDevice  CancelOTATaskByDeviceRequest
     * @return CancelOTATaskByDeviceResponse
     */
    @Override
    public CompletableFuture<CancelOTATaskByDeviceResponse> cancelOTATaskByDevice(CancelOTATaskByDeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelOTATaskByDevice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelOTATaskByDeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelOTATaskByDeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation, make sure that you specify at least one of the CancelScheduledTask, CancelQueuedTask, CancelInProgressTask, CancelNotifiedTask, and CancelUnconfirmedTask parameters. Otherwise, the request will fail.</p>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of five queries per second (QPS). </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CancelOTATaskByJob  CancelOTATaskByJobRequest
     * @return CancelOTATaskByJobResponse
     */
    @Override
    public CompletableFuture<CancelOTATaskByJobResponse> cancelOTATaskByJob(CancelOTATaskByJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelOTATaskByJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelOTATaskByJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelOTATaskByJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CancelReleaseProduct  CancelReleaseProductRequest
     * @return CancelReleaseProductResponse
     */
    @Override
    public CompletableFuture<CancelReleaseProductResponse> cancelReleaseProduct(CancelReleaseProductRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelReleaseProduct").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelReleaseProductResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelReleaseProductResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CheckBindLicenseDeviceProgress  CheckBindLicenseDeviceProgressRequest
     * @return CheckBindLicenseDeviceProgressResponse
     */
    @Override
    public CompletableFuture<CheckBindLicenseDeviceProgressResponse> checkBindLicenseDeviceProgress(CheckBindLicenseDeviceProgressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckBindLicenseDeviceProgress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckBindLicenseDeviceProgressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckBindLicenseDeviceProgressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Each time you call this operation, you must specify the identifiers of properties whose desired values you want to delete for the <strong>Identifies</strong> parameter. If you do not configure the <strong>Identifies</strong> parameter, the call fails.</p>
     * <ul>
     * <li>You can specify up to 10 property identifiers for the <strong>Identifies</strong> parameter in a single call.</li>
     * <li>After you call this operation to deletes the desired values of properties of a device, you can call the <a href="https://help.aliyun.com/document_detail/107566.html">QueryDeviceDesiredProperty</a> operation to query the desired values of properties of the device. In this case, the QueryDeviceDesiredProperty operation returns the <strong>Identifier</strong> parameter instead of the <strong>Value</strong> parameter.</li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 50 times per second per account. </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ClearDeviceDesiredProperty  ClearDeviceDesiredPropertyRequest
     * @return ClearDeviceDesiredPropertyResponse
     */
    @Override
    public CompletableFuture<ClearDeviceDesiredPropertyResponse> clearDeviceDesiredProperty(ClearDeviceDesiredPropertyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ClearDeviceDesiredProperty").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ClearDeviceDesiredPropertyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ClearDeviceDesiredPropertyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ClearEdgeInstanceDriverConfigs  ClearEdgeInstanceDriverConfigsRequest
     * @return ClearEdgeInstanceDriverConfigsResponse
     */
    @Override
    public CompletableFuture<ClearEdgeInstanceDriverConfigsResponse> clearEdgeInstanceDriverConfigs(ClearEdgeInstanceDriverConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ClearEdgeInstanceDriverConfigs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ClearEdgeInstanceDriverConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ClearEdgeInstanceDriverConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CloseDeviceTunnel  CloseDeviceTunnelRequest
     * @return CloseDeviceTunnelResponse
     */
    @Override
    public CompletableFuture<CloseDeviceTunnelResponse> closeDeviceTunnel(CloseDeviceTunnelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloseDeviceTunnel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloseDeviceTunnelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloseDeviceTunnelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of five queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CloseEdgeInstanceDeployment  CloseEdgeInstanceDeploymentRequest
     * @return CloseEdgeInstanceDeploymentResponse
     */
    @Override
    public CompletableFuture<CloseEdgeInstanceDeploymentResponse> closeEdgeInstanceDeployment(CloseEdgeInstanceDeploymentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloseEdgeInstanceDeployment").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloseEdgeInstanceDeploymentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloseEdgeInstanceDeploymentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>To confirm update tasks in a scheduled update batch, you must call this operation within the specified time range.</p>
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 20 queries per second (QPS). </p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ConfirmOTATask  ConfirmOTATaskRequest
     * @return ConfirmOTATaskResponse
     */
    @Override
    public CompletableFuture<ConfirmOTATaskResponse> confirmOTATask(ConfirmOTATaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ConfirmOTATask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ConfirmOTATaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ConfirmOTATaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  If a destination product is published, you must call the <a href="https://help.aliyun.com/document_detail/213875.html">CancelReleaseProduct</a> operation to unpublish the product before you can copy a TSL model.</p>
     * <ul>
     * <li>The categories of the source product and destination product must be the same. The product category is indicated by the <strong>CategoryKey</strong> parameter. You can call the <a href="https://help.aliyun.com/document_detail/69272.html">QueryProduct</a> operation and view the <strong>CategoryKey</strong> parameter of a product in the returned result.</li>
     * <li>You must specify the version of the TSL model that you want to copy by using the <strong>SourceModelVersion</strong> parameter in the request. Otherwise, the CopyThingModel operation fails.</li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to five queries per second (QPS). </p>
     * <blockquote>
     * <p> The Resource Access Management (RAM) users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CopyThingModel  CopyThingModelRequest
     * @return CopyThingModelResponse
     */
    @Override
    public CompletableFuture<CopyThingModelResponse> copyThingModel(CopyThingModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CopyThingModel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CopyThingModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CopyThingModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CopyThingModelAsync  CopyThingModelAsyncRequest
     * @return CopyThingModelAsyncResponse
     */
    @Override
    public CompletableFuture<CopyThingModelAsyncResponse> copyThingModelAsync(CopyThingModelAsyncRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CopyThingModelAsync").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CopyThingModelAsyncResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CopyThingModelAsyncResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>You can call this operation to query the shared speeches that were broadcasted six hours ago. For example, if a speech was broadcasted at 07:15, you can query the speech after 13:15.</p>
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 100 times per second per account.</p>
     * <blockquote>
     * <p>The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CountSpeechBroadcastHour  CountSpeechBroadcastHourRequest
     * @return CountSpeechBroadcastHourResponse
     */
    @Override
    public CompletableFuture<CountSpeechBroadcastHourResponse> countSpeechBroadcastHour(CountSpeechBroadcastHourRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CountSpeechBroadcastHour").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CountSpeechBroadcastHourResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CountSpeechBroadcastHourResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 5 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateConsumerGroup  CreateConsumerGroupRequest
     * @return CreateConsumerGroupResponse
     */
    @Override
    public CompletableFuture<CreateConsumerGroupResponse> createConsumerGroup(CreateConsumerGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateConsumerGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateConsumerGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateConsumerGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 5 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateConsumerGroupSubscribeRelation  CreateConsumerGroupSubscribeRelationRequest
     * @return CreateConsumerGroupSubscribeRelationResponse
     */
    @Override
    public CompletableFuture<CreateConsumerGroupSubscribeRelationResponse> createConsumerGroupSubscribeRelation(CreateConsumerGroupSubscribeRelationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateConsumerGroupSubscribeRelation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateConsumerGroupSubscribeRelationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateConsumerGroupSubscribeRelationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDataAPIService  CreateDataAPIServiceRequest
     * @return CreateDataAPIServiceResponse
     */
    @Override
    public CompletableFuture<CreateDataAPIServiceResponse> createDataAPIService(CreateDataAPIServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDataAPIService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDataAPIServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDataAPIServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>Before you call this operation, perform the following steps: First, create a data source. For information about how to create a data source, see Step 1 to Step 6 in the <a href="https://help.aliyun.com/document_detail/270932.html">Create a data source</a> topic. Second, go to the <strong>Data Source</strong> tab on the <strong>Message Forwarding</strong> page of the instance that you want to manage in the IoT Platform console. Then, view and record the ID of the <strong>data source</strong> that you created.</p>
     * <blockquote>
     * <p> If you set Topic to a custom topic for a product or device that uses the open source Message Queuing Telemetry Transport (MQTT) protocol, you must specify ScopeType and ProductKey. If ScopeType is set to DEVICE, you must also specify DeviceName.</p>
     * </blockquote>
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 10 times per second per account.</p>
     * <blockquote>
     * <p>The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateDataSourceItem  CreateDataSourceItemRequest
     * @return CreateDataSourceItemResponse
     */
    @Override
    public CompletableFuture<CreateDataSourceItemResponse> createDataSourceItem(CreateDataSourceItemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDataSourceItem").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDataSourceItemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDataSourceItemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDestination  CreateDestinationRequest
     * @return CreateDestinationResponse
     */
    @Override
    public CompletableFuture<CreateDestinationResponse> createDestination(CreateDestinationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDestination").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDestinationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDestinationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>To distribute devices, perform the following steps:
     * 1\. Asynchronously call this operation to create a device distribution task and obtain the <strong>JobId</strong> parameter.
     * 2\. Use <strong>JobId</strong> as a request parameter and repeatedly call the <a href="https://help.aliyun.com/document_detail/199536.html">QueryDeviceDistributeJob</a> operation to obtain the <strong>Status</strong> parameter.</p>
     * <blockquote>
     * <p> You must control the frequency of calls based on the QPS limit of the QueryDeviceDistributeJob operation.
     * If either of the following values is returned for the <strong>Status</strong> parameter, the distribution task ends:</p>
     * </blockquote>
     * <ul>
     * <li><strong>2</strong>: The device distribution task is completed. This return value does not indicate that the devices are distributed. To obtain the distribution result of each device, perform the next step.</li>
     * <li><strong>3</strong>: The distribution is unexpectedly interrupted. After you process the error, you can initiate a device distribution task again.
     * 3\. Use <strong>JobId</strong> that is returned in Step 1 as a request parameter and call the <a href="https://help.aliyun.com/document_detail/199533.html">QueryDeviceDistributeDetail</a> operation to obtain the <strong>File</strong> parameter. The File parameter indicates the file URL of the distribution result.<blockquote>
     * <p> The file URL is valid for 10 minutes.
     * 4\. Obtain the distribution result by using the file URL. The <strong>Code</strong> parameter indicates whether a device is distributed. If the value of the <strong>Code</strong> parameter is 200, the device is distributed.
     * If the distribution fails, you can perform the preceding steps to distribute devices again.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h2>Limits</h2>
     * <ul>
     * <li>This operation can be called only by using the following <strong>endpoint</strong>: <code>iot.cn-shanghai.aliyuncs.com</code>.</li>
     * <li>You cannot call this operation to distribute devices across accounts.</li>
     * <li>Each Alibaba Cloud account can create a maximum of 10 tasks to distribute products or devices. For more information about how to create a product distribution task, see <a href="/help/en/iot-platform/latest/createproductdistributejob">CreateProductDistributeJob</a>.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 2 queries per second (QPS).  &gt;  RAM users of an Alibaba Cloud account share the quota of the account.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateDeviceDistributeJob  CreateDeviceDistributeJobRequest
     * @return CreateDeviceDistributeJobResponse
     */
    @Override
    public CompletableFuture<CreateDeviceDistributeJobResponse> createDeviceDistributeJob(CreateDeviceDistributeJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDeviceDistributeJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDeviceDistributeJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDeviceDistributeJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDeviceDynamicGroup  CreateDeviceDynamicGroupRequest
     * @return CreateDeviceDynamicGroupResponse
     */
    @Override
    public CompletableFuture<CreateDeviceDynamicGroupResponse> createDeviceDynamicGroup(CreateDeviceDynamicGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDeviceDynamicGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDeviceDynamicGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDeviceDynamicGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 500 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateDeviceGroup  CreateDeviceGroupRequest
     * @return CreateDeviceGroupResponse
     */
    @Override
    public CompletableFuture<CreateDeviceGroupResponse> createDeviceGroup(CreateDeviceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDeviceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDeviceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDeviceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDeviceTunnel  CreateDeviceTunnelRequest
     * @return CreateDeviceTunnelResponse
     */
    @Override
    public CompletableFuture<CreateDeviceTunnelResponse> createDeviceTunnel(CreateDeviceTunnelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDeviceTunnel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDeviceTunnelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDeviceTunnelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDownloadDataJob  CreateDownloadDataJobRequest
     * @return CreateDownloadDataJobResponse
     */
    @Override
    public CompletableFuture<CreateDownloadDataJobResponse> createDownloadDataJob(CreateDownloadDataJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDownloadDataJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDownloadDataJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDownloadDataJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>A single Alibaba Cloud account can run a maximum of 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateEdgeDriver  CreateEdgeDriverRequest
     * @return CreateEdgeDriverResponse
     */
    @Override
    public CompletableFuture<CreateEdgeDriverResponse> createEdgeDriver(CreateEdgeDriverRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateEdgeDriver").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateEdgeDriverResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateEdgeDriverResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateEdgeDriverVersion  CreateEdgeDriverVersionRequest
     * @return CreateEdgeDriverVersionResponse
     */
    @Override
    public CompletableFuture<CreateEdgeDriverVersionResponse> createEdgeDriverVersion(CreateEdgeDriverVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateEdgeDriverVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateEdgeDriverVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateEdgeDriverVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>A single Alibaba Cloud account can run a maximum of 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateEdgeInstance  CreateEdgeInstanceRequest
     * @return CreateEdgeInstanceResponse
     */
    @Override
    public CompletableFuture<CreateEdgeInstanceResponse> createEdgeInstance(CreateEdgeInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateEdgeInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateEdgeInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateEdgeInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateEdgeInstanceChannel  CreateEdgeInstanceChannelRequest
     * @return CreateEdgeInstanceChannelResponse
     */
    @Override
    public CompletableFuture<CreateEdgeInstanceChannelResponse> createEdgeInstanceChannel(CreateEdgeInstanceChannelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateEdgeInstanceChannel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateEdgeInstanceChannelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateEdgeInstanceChannelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of five queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateEdgeInstanceDeployment  CreateEdgeInstanceDeploymentRequest
     * @return CreateEdgeInstanceDeploymentResponse
     */
    @Override
    public CompletableFuture<CreateEdgeInstanceDeploymentResponse> createEdgeInstanceDeployment(CreateEdgeInstanceDeploymentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateEdgeInstanceDeployment").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateEdgeInstanceDeploymentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateEdgeInstanceDeploymentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateEdgeInstanceMessageRouting  CreateEdgeInstanceMessageRoutingRequest
     * @return CreateEdgeInstanceMessageRoutingResponse
     */
    @Override
    public CompletableFuture<CreateEdgeInstanceMessageRoutingResponse> createEdgeInstanceMessageRouting(CreateEdgeInstanceMessageRoutingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateEdgeInstanceMessageRouting").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateEdgeInstanceMessageRoutingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateEdgeInstanceMessageRoutingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of five queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateEdgeOssPreSignedAddress  CreateEdgeOssPreSignedAddressRequest
     * @return CreateEdgeOssPreSignedAddressResponse
     */
    @Override
    public CompletableFuture<CreateEdgeOssPreSignedAddressResponse> createEdgeOssPreSignedAddress(CreateEdgeOssPreSignedAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateEdgeOssPreSignedAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateEdgeOssPreSignedAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateEdgeOssPreSignedAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateJob  CreateJobRequest
     * @return CreateJobResponse
     */
    @Override
    public CompletableFuture<CreateJobResponse> createJob(CreateJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>You can call this operation to create up to 500 devices.</p>
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 50 times per second per account.</p>
     * <blockquote>
     * <p>The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateLoRaNodesTask  CreateLoRaNodesTaskRequest
     * @return CreateLoRaNodesTaskResponse
     */
    @Override
    public CompletableFuture<CreateLoRaNodesTaskResponse> createLoRaNodesTask(CreateLoRaNodesTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateLoRaNodesTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLoRaNodesTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLoRaNodesTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>In addition to the preceding operation-specific request parameters, you must specify common request parameters when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/30561.html">Common parameters</a>.</p>
     * 
     * @param request the request parameters of CreateOTADynamicUpgradeJob  CreateOTADynamicUpgradeJobRequest
     * @return CreateOTADynamicUpgradeJobResponse
     */
    @Override
    public CompletableFuture<CreateOTADynamicUpgradeJobResponse> createOTADynamicUpgradeJob(CreateOTADynamicUpgradeJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateOTADynamicUpgradeJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateOTADynamicUpgradeJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateOTADynamicUpgradeJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation to create an OTA update package, you must call the <a href="https://help.aliyun.com/document_detail/147310.html">GenerateOTAUploadURL</a> operation to generate the information about the files that you want to add to the OTA update package and call the Object Storage Service (OSS) <a href="https://help.aliyun.com/document_detail/31988.html">PostObject</a> operation to upload the files.</p>
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can have up to 500 update packages. </p>
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 10 times per second per account. </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateOTAFirmware  CreateOTAFirmwareRequest
     * @return CreateOTAFirmwareResponse
     */
    @Override
    public CompletableFuture<CreateOTAFirmwareResponse> createOTAFirmware(CreateOTAFirmwareRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateOTAFirmware").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateOTAFirmwareResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateOTAFirmwareResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>OTA modules are the updatable units of the devices that belong to the same product. The default module indicates the entire firmware of a device. You can call this operation to create a custom OTA module.</p>
     * <ul>
     * <li>You can create a maximum of 10 custom OTA modules for each product.</li>
     * <li>After an OTA module is created, you cannot modify its name. You can call the <a href="https://help.aliyun.com/document_detail/186061.html">UpdateOTAModule</a> operation to modify the module alias and description.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateOTAModule  CreateOTAModuleRequest
     * @return CreateOTAModuleResponse
     */
    @Override
    public CompletableFuture<CreateOTAModuleResponse> createOTAModule(CreateOTAModuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateOTAModule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateOTAModuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateOTAModuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  If you specify that an update package does not need to be verified when you call the <a href="https://help.aliyun.com/document_detail/147311.html">CreateOTAFirmware</a> operation, you must make sure that the update package is verified before you call the CreateOTAStaticUpgradeJob operation to create an update batch. For more information about how to create a task to verify an update package, see <a href="https://help.aliyun.com/document_detail/147480.html">CreateOTAVerifyJob</a>.</p>
     * <ul>
     * <li>You can initiate update tasks for a maximum of 200 devices in each call. If you use a device list file, you can initiate update tasks for a maximum of 1,000,000 devices. However, you must call the <a href="https://help.aliyun.com/document_detail/186062.html">GenerateDeviceNameListURL</a> operation to generate a URL for the device list file. Then, you can perform the operations as prompted to upload the device list file.</li>
     * <li>When you initiate update tasks for multiple devices, the devices that already have the destination firmware versions are skipped.</li>
     * <li>Each device can be in the pending or updating status only in one update task. If you initiate another update task for a device that is in the pending or updating status, the update task fails.</li>
     * <li>You can create multiple static update batches by using a single update package.</li>
     * <li>Downloading update packages through the MQTT protocol is supported only in the China (Shanghai) region.</li>
     * </ul>
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 20 queries per second (QPS). </p>
     * <blockquote>
     * <p> The Resource Access Management (RAM) users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateOTAStaticUpgradeJob  CreateOTAStaticUpgradeJobRequest
     * @return CreateOTAStaticUpgradeJobResponse
     */
    @Override
    public CompletableFuture<CreateOTAStaticUpgradeJobResponse> createOTAStaticUpgradeJob(CreateOTAStaticUpgradeJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateOTAStaticUpgradeJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateOTAStaticUpgradeJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateOTAStaticUpgradeJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You must verify an update package before you push the package to devices for a batch update. Only verified update packages can be used to update devices in batches. You can call the <a href="https://help.aliyun.com/document_detail/147461.html">QueryOTAFirmware</a> operation to view the status of a verification task.</p>
     * <ul>
     * <li>You cannot initiate a verification task for an update package that is being verified or has been verified.</li>
     * <li>You can specify a maximum of 10 devices for a verification task.</li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 10 queries per second (QPS). </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateOTAVerifyJob  CreateOTAVerifyJobRequest
     * @return CreateOTAVerifyJobResponse
     */
    @Override
    public CompletableFuture<CreateOTAVerifyJobResponse> createOTAVerifyJob(CreateOTAVerifyJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateOTAVerifyJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateOTAVerifyJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateOTAVerifyJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateParser  CreateParserRequest
     * @return CreateParserResponse
     */
    @Override
    public CompletableFuture<CreateParserResponse> createParser(CreateParserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateParser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateParserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateParserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateParserDataSource  CreateParserDataSourceRequest
     * @return CreateParserDataSourceResponse
     */
    @Override
    public CompletableFuture<CreateParserDataSourceResponse> createParserDataSource(CreateParserDataSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateParserDataSource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateParserDataSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateParserDataSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If a Thing Specification Language (TSL) model is required to create a product, you must set the <strong>AliyunCommodityCode</strong> parameter to iothub_senior and configure the <strong>DataFormat</strong> parameter.******** For more information, see the &quot;<strong>Request parameters</strong>&quot; section of this topic.</p>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 50 queries per second (QPS). </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateProduct  CreateProductRequest
     * @return CreateProductResponse
     */
    @Override
    public CompletableFuture<CreateProductResponse> createProduct(CreateProductRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateProduct").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateProductResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateProductResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation can be called only by using the following <strong>endpoint</strong>: <code>iot.cn-shanghai.aliyuncs.com</code>.</p>
     * <ul>
     * <li>You cannot call this operation to distribute a product across accounts.</li>
     * <li>A product distribution task does not distribute the devices under the product.</li>
     * <li>After a product is distributed, you cannot modify its TSL model and scripts.</li>
     * <li>Each Alibaba Cloud account can create a maximum of 10 tasks to distribute products or devices. For more information about how to create a device distribution task, see <a href="https://help.aliyun.com/document_detail/199390.html">CreateDeviceDistributeJob</a>.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 2 queries per second (QPS).
     * **
     * <strong>Note</strong> RAM users of an Alibaba Cloud account share the quota of the account.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateProductDistributeJob  CreateProductDistributeJobRequest
     * @return CreateProductDistributeJobResponse
     */
    @Override
    public CompletableFuture<CreateProductDistributeJobResponse> createProductDistributeJob(CreateProductDistributeJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateProductDistributeJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateProductDistributeJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateProductDistributeJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can create a maximum of 10 tags for a product in a single call.</p>
     * <ul>
     * <li>Each product can have a maximum of 100 tags.<blockquote>
     * <p>You must specify the tag keys and tag values. Otherwise, the call fails. For description about the tag values, see the &quot;<strong>Request parameters</strong>&quot; section of this topic.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 500 queries per second (QPS). </p>
     * <blockquote>
     * <p> The Resource Access Management (RAM) users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateProductTags  CreateProductTagsRequest
     * @return CreateProductTagsResponse
     */
    @Override
    public CompletableFuture<CreateProductTagsResponse> createProductTags(CreateProductTagsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateProductTags").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateProductTagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateProductTagsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 1 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateProductTopic  CreateProductTopicRequest
     * @return CreateProductTopicResponse
     */
    @Override
    public CompletableFuture<CreateProductTopicResponse> createProductTopic(CreateProductTopicRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateProductTopic").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateProductTopicResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateProductTopicResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation, you must specify the <strong>ProductKey</strong> parameter in the request.</p>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 50 queries per second (QPS). </p>
     * <blockquote>
     * <p> The Resource Access Management (RAM) users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateRule  CreateRuleRequest
     * @return CreateRuleResponse
     */
    @Override
    public CompletableFuture<CreateRuleResponse> createRule(CreateRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>Destination Alibaba Cloud services that are supported by the rules engine vary based on regions. For more information about the regions and destination cloud services that are supported by the rules engine, see <a href="https://help.aliyun.com/document_detail/85669.html">Regions and zones</a>.</li>
     * <li>You can create a maximum of 10 rule actions for each rule.</li>
     * <li>You can call this API operation to define rule actions to forward data to an IoT Platform topic, AMQP consumer group, or Alibaba Cloud service. The supported Alibaba Cloud services include Message Service (MNS), Function Compute, and Tablestore. If you need to forward data to ApsaraDB RDS, you must use the <a href="https://iot.console.aliyun.com">IoT Platform console</a>.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateRuleAction  CreateRuleActionRequest
     * @return CreateRuleActionResponse
     */
    @Override
    public CompletableFuture<CreateRuleActionResponse> createRuleAction(CreateRuleActionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateRuleAction").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRuleActionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRuleActionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSceneRule  CreateSceneRuleRequest
     * @return CreateSceneRuleResponse
     */
    @Override
    public CompletableFuture<CreateSceneRuleResponse> createSceneRule(CreateSceneRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSceneRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSceneRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSceneRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSchedulePeriod  CreateSchedulePeriodRequest
     * @return CreateSchedulePeriodResponse
     */
    @Override
    public CompletableFuture<CreateSchedulePeriodResponse> createSchedulePeriod(CreateSchedulePeriodRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSchedulePeriod").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSchedulePeriodResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSchedulePeriodResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSharePromotionActivity  CreateSharePromotionActivityRequest
     * @return CreateSharePromotionActivityResponse
     */
    @Override
    public CompletableFuture<CreateSharePromotionActivityResponse> createSharePromotionActivity(CreateSharePromotionActivityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSharePromotionActivity").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSharePromotionActivityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSharePromotionActivityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSharePromotionSpeechModel  CreateSharePromotionSpeechModelRequest
     * @return CreateSharePromotionSpeechModelResponse
     */
    @Override
    public CompletableFuture<CreateSharePromotionSpeechModelResponse> createSharePromotionSpeechModel(CreateSharePromotionSpeechModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSharePromotionSpeechModel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSharePromotionSpeechModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSharePromotionSpeechModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSoundCode  CreateSoundCodeRequest
     * @return CreateSoundCodeResponse
     */
    @Override
    public CompletableFuture<CreateSoundCodeResponse> createSoundCode(CreateSoundCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSoundCode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSoundCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSoundCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSoundCodeLabel  CreateSoundCodeLabelRequest
     * @return CreateSoundCodeLabelResponse
     */
    @Override
    public CompletableFuture<CreateSoundCodeLabelResponse> createSoundCodeLabel(CreateSoundCodeLabelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSoundCodeLabel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSoundCodeLabelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSoundCodeLabelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSoundCodeSchedule  CreateSoundCodeScheduleRequest
     * @return CreateSoundCodeScheduleResponse
     */
    @Override
    public CompletableFuture<CreateSoundCodeScheduleResponse> createSoundCodeSchedule(CreateSoundCodeScheduleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSoundCodeSchedule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSoundCodeScheduleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSoundCodeScheduleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSpeech  CreateSpeechRequest
     * @return CreateSpeechResponse
     */
    @Override
    public CompletableFuture<CreateSpeechResponse> createSpeech(CreateSpeechRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSpeech").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSpeechResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSpeechResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateStudioAppDomainOpen  CreateStudioAppDomainOpenRequest
     * @return CreateStudioAppDomainOpenResponse
     */
    @Override
    public CompletableFuture<CreateStudioAppDomainOpenResponse> createStudioAppDomainOpen(CreateStudioAppDomainOpenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateStudioAppDomainOpen").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateStudioAppDomainOpenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateStudioAppDomainOpenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Server-side subscriptions are categorized into the following two types:</p>
     * <ul>
     * <li>MNS subscription: pushes subscribed messages to MNS queues. Your server applications listen to MNS queues to receive device messages. For more information, see <a href="https://help.aliyun.com/document_detail/68948.html">Configure MNS server-side subscriptions</a>. You can call this operation to create an MNS subscription.</li>
     * <li>AMQP subscription: pushes subscribed messages to your server by using the AMQP channel. For more information, see <a href="https://help.aliyun.com/document_detail/142376.html">Configure AMQP server-side subscriptions</a>. To configure an AMQP subscription, perform the following steps:
     * 1\. Call the <a href="https://help.aliyun.com/document_detail/170388.html">CreateConsumerGroup</a> operation to create a consumer group and obtain the returned consumer group ID. Messages are pushed to the consumer group. The AMQP client carries the consumer group ID when the client connected to IoT Platform. For more information, see <a href="https://help.aliyun.com/document_detail/142489.html">Connect an AMQP client to IoT Platform</a>.
     * 2\. Call the CreateSubscribeRelation operation to create an AMQP subscription.
     * 3\. Optional. Call the <a href="https://help.aliyun.com/document_detail/170354.html">CreateConsumerGroupSubscribeRelation</a> operation to add a consumer group to the AMQP subscription. You can also call the <a href="https://help.aliyun.com/document_detail/170357.html">DeleteConsumerGroupSubscribeRelation</a> operation to remove a consumer group from an AMQP subscription.
     * 4\. Optional. Call the <a href="https://help.aliyun.com/document_detail/170358.html">QueryConsumerGroupStatus</a> operation to query the status of a consumer group, including online client information, message consumption rate, number of accumulated messages, and last message consumption time. You can also call the <a href="https://help.aliyun.com/document_detail/170355.html">ResetConsumerGroupPosition</a> operation to clear the accumulated messages of the consumer group.</li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to five times per second per account. </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateSubscribeRelation  CreateSubscribeRelationRequest
     * @return CreateSubscribeRelationResponse
     */
    @Override
    public CompletableFuture<CreateSubscribeRelationResponse> createSubscribeRelation(CreateSubscribeRelationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSubscribeRelation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSubscribeRelationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSubscribeRelationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>If a product is published, you must call the <a href="https://help.aliyun.com/document_detail/213875.html">CancelReleaseProduct</a> operation to unpublish the product before you call this operation.</li>
     * <li>Before you call the operation, you can use the <a href="https://github.com/everit-org/json-schema?spm=a2c4g.11186623.2.23.575832d9zD7fZb">json-schema</a> library to verify the input parameters in <strong>ThingModelJson</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/150457.html">Data structure of ThingModelJson</a>.</li>
     * <li>You can call this operation to add a maximum of 10 TSL features. TSL features include properties, services, and events.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 5 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateThingModel  CreateThingModelRequest
     * @return CreateThingModelResponse
     */
    @Override
    public CompletableFuture<CreateThingModelResponse> createThingModel(CreateThingModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateThingModel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateThingModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateThingModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>A data parsing script is used to convert data submitted by devices into the JSON format. The data submitted by devices is in a custom format. You can write a script in JavaScript, Python 2.7, and PHP 7.2. For more information, see <a href="https://help.aliyun.com/document_detail/149963.html">Submit scripts for data parsing</a>.</p>
     * <blockquote>
     * <p>If the data format is <strong>Alink JSON</strong>, the CreateThingScript operation is not supported. Alink JSON is a standard data format that is defined by IoT Connectivity Alliance (ICA).</p>
     * </blockquote>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS). </p>
     * <blockquote>
     * <p> The Resource Access Management (RAM) users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateThingScript  CreateThingScriptRequest
     * @return CreateThingScriptResponse
     */
    @Override
    public CompletableFuture<CreateThingScriptResponse> createThingScript(CreateThingScriptRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateThingScript").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateThingScriptResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateThingScriptResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateTopicConfig  CreateTopicConfigRequest
     * @return CreateTopicConfigResponse
     */
    @Override
    public CompletableFuture<CreateTopicConfigResponse> createTopicConfig(CreateTopicConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateTopicConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTopicConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTopicConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>You can specify a maximum of 100 destination topics for a source topic.</li>
     * <li>The device to which the source topic belongs must be activated.</li>
     * <li>The source and destination topics support only custom topics.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateTopicRouteTable  CreateTopicRouteTableRequest
     * @return CreateTopicRouteTableResponse
     */
    @Override
    public CompletableFuture<CreateTopicRouteTableResponse> createTopicRouteTable(CreateTopicRouteTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateTopicRouteTable").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTopicRouteTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTopicRouteTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call the <a href="https://help.aliyun.com/document_detail/371985.html">QueryClientIds</a> operation to view the ClientIDs of a device and obtain the number of ClientIDs.</p>
     * <ul>
     * <li>After you call the DeleteClientIds operation, all ClientIDs of the device are deleted and cannot be resumed. To obtain a new ClientID, you can register the device again.</li>
     * </ul>
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS). </p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteClientIds  DeleteClientIdsRequest
     * @return DeleteClientIdsResponse
     */
    @Override
    public CompletableFuture<DeleteClientIdsResponse> deleteClientIds(DeleteClientIdsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteClientIds").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteClientIdsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteClientIdsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>You cannot delete the default consumer group provided by IoT Platform.</li>
     * <li>If the consumer group is associated with an AMQP subscription, you must disassociate the consumer group from the subscription. If the subscription has multiple consumer groups, you can call the <a href="https://help.aliyun.com/document_detail/170357.html">DeleteConsumerGroupSubscribeRelation</a> operation to remove the consumer group from the subscription. If the subscription has only one consumer group, you can call the <a href="https://help.aliyun.com/document_detail/170351.html">UpdateSubscribeRelation</a> operation to change the consumer group or call the <a href="https://help.aliyun.com/document_detail/170353.html">DeleteSubscribeRelation</a> operation to delete the subscription.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 5 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteConsumerGroup  DeleteConsumerGroupRequest
     * @return DeleteConsumerGroupResponse
     */
    @Override
    public CompletableFuture<DeleteConsumerGroupResponse> deleteConsumerGroup(DeleteConsumerGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteConsumerGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteConsumerGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteConsumerGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>If the AMQP subscription has only one consumer group, you cannot call this operation to remove the consumer group.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 5 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteConsumerGroupSubscribeRelation  DeleteConsumerGroupSubscribeRelationRequest
     * @return DeleteConsumerGroupSubscribeRelationResponse
     */
    @Override
    public CompletableFuture<DeleteConsumerGroupSubscribeRelationResponse> deleteConsumerGroupSubscribeRelation(DeleteConsumerGroupSubscribeRelationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteConsumerGroupSubscribeRelation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteConsumerGroupSubscribeRelationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteConsumerGroupSubscribeRelationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDataSourceItem  DeleteDataSourceItemRequest
     * @return DeleteDataSourceItemResponse
     */
    @Override
    public CompletableFuture<DeleteDataSourceItemResponse> deleteDataSourceItem(DeleteDataSourceItemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDataSourceItem").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDataSourceItemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDataSourceItemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDestination  DeleteDestinationRequest
     * @return DeleteDestinationResponse
     */
    @Override
    public CompletableFuture<DeleteDestinationResponse> deleteDestination(DeleteDestinationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDestination").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDestinationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDestinationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  When you call this operation with an Alibaba Cloud account, IoT Platform sends a verification code by text message to confirm your identity.</p>
     * <ul>
     * <li>When you call this operation with a RAM user, IoT Platform does not send a verification code. To ensure device security, you can create custom permission policies to perform fine-grained permission management. For more information, see <a href="https://help.aliyun.com/document_detail/47485.html">Mapping of IoT Platform operations and RAM policies</a> and <a href="https://help.aliyun.com/document_detail/47495.html">Custom permissions</a>.
     * <strong>Warning</strong></li>
     * <li>After a device is deleted, the device ID (<strong>IotId</strong>) becomes invalid, and all other information associated with the device is deleted. In addition, you can no longer perform an operation on the device.</li>
     * <li>Before you delete a device in the IoT Platform console, make sure that the corresponding actual device is offline. Otherwise, after the device is deleted from IoT Platform, the actual device continues to initiate connection requests to IoT Platform. If the number of requests exceeds the upper limit, IoT Platform starts request throttling. In this case, access of other devices within your Alibaba Cloud account is affected.</li>
     * <li>After you delete a device, the certificate of the device becomes invalid and cannot be restored. Proceed with caution.</li>
     * </ul>
     * <hr>
     * <ul>
     * <li>You must specify a value for the <strong>IotId</strong> parameter or values for the <strong>ProductKey</strong> and <strong>DeviceName</strong> parameters to identify a device.</li>
     * <li>If you specify a gateway and the number of sub-devices that belong to the gateway exceeds 2,000, you can call this operation to create a device job to delete the topological relationships in an asynchronous manner. The operation returns the <strong>JobId</strong> parameter.</li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 50 times per second per account. </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteDevice  DeleteDeviceRequest
     * @return DeleteDeviceResponse
     */
    @Override
    public CompletableFuture<DeleteDeviceResponse> deleteDevice(DeleteDeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDevice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation can be called only by using the following <strong>endpoint</strong>: <code>iot.cn-shanghai.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Each Alibaba Cloud account can run a maximum of 2 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteDeviceDistributeJob  DeleteDeviceDistributeJobRequest
     * @return DeleteDeviceDistributeJobResponse
     */
    @Override
    public CompletableFuture<DeleteDeviceDistributeJobResponse> deleteDeviceDistributeJob(DeleteDeviceDistributeJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDeviceDistributeJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDeviceDistributeJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDeviceDistributeJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDeviceDynamicGroup  DeleteDeviceDynamicGroupRequest
     * @return DeleteDeviceDynamicGroupResponse
     */
    @Override
    public CompletableFuture<DeleteDeviceDynamicGroupResponse> deleteDeviceDynamicGroup(DeleteDeviceDynamicGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDeviceDynamicGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDeviceDynamicGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDeviceDynamicGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 500 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteDeviceFile  DeleteDeviceFileRequest
     * @return DeleteDeviceFileResponse
     */
    @Override
    public CompletableFuture<DeleteDeviceFileResponse> deleteDeviceFile(DeleteDeviceFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDeviceFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDeviceFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDeviceFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 500 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteDeviceGroup  DeleteDeviceGroupRequest
     * @return DeleteDeviceGroupResponse
     */
    @Override
    public CompletableFuture<DeleteDeviceGroupResponse> deleteDeviceGroup(DeleteDeviceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDeviceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDeviceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDeviceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 500 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteDeviceProp  DeleteDevicePropRequest
     * @return DeleteDevicePropResponse
     */
    @Override
    public CompletableFuture<DeleteDevicePropResponse> deleteDeviceProp(DeleteDevicePropRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDeviceProp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDevicePropResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDevicePropResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDeviceSpeech  DeleteDeviceSpeechRequest
     * @return DeleteDeviceSpeechResponse
     */
    @Override
    public CompletableFuture<DeleteDeviceSpeechResponse> deleteDeviceSpeech(DeleteDeviceSpeechRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDeviceSpeech").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDeviceSpeechResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDeviceSpeechResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDeviceTunnel  DeleteDeviceTunnelRequest
     * @return DeleteDeviceTunnelResponse
     */
    @Override
    public CompletableFuture<DeleteDeviceTunnelResponse> deleteDeviceTunnel(DeleteDeviceTunnelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDeviceTunnel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDeviceTunnelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDeviceTunnelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>You are not allowed to delete a driver that has a published version.</li>
     * <li>Each Alibaba Cloud account can run a maximum of five queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteEdgeDriver  DeleteEdgeDriverRequest
     * @return DeleteEdgeDriverResponse
     */
    @Override
    public CompletableFuture<DeleteEdgeDriverResponse> deleteEdgeDriver(DeleteEdgeDriverRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteEdgeDriver").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteEdgeDriverResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteEdgeDriverResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>You are not allowed to delete a published driver version.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).<blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteEdgeDriverVersion  DeleteEdgeDriverVersionRequest
     * @return DeleteEdgeDriverVersionResponse
     */
    @Override
    public CompletableFuture<DeleteEdgeDriverVersionResponse> deleteEdgeDriverVersion(DeleteEdgeDriverVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteEdgeDriverVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteEdgeDriverVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteEdgeDriverVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Each Alibaba Cloud account can run a maximum of five queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteEdgeInstance  DeleteEdgeInstanceRequest
     * @return DeleteEdgeInstanceResponse
     */
    @Override
    public CompletableFuture<DeleteEdgeInstanceResponse> deleteEdgeInstance(DeleteEdgeInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteEdgeInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteEdgeInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteEdgeInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteEdgeInstanceMessageRouting  DeleteEdgeInstanceMessageRoutingRequest
     * @return DeleteEdgeInstanceMessageRoutingResponse
     */
    @Override
    public CompletableFuture<DeleteEdgeInstanceMessageRoutingResponse> deleteEdgeInstanceMessageRouting(DeleteEdgeInstanceMessageRoutingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteEdgeInstanceMessageRouting").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteEdgeInstanceMessageRoutingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteEdgeInstanceMessageRoutingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteJob  DeleteJobRequest
     * @return DeleteJobResponse
     */
    @Override
    public CompletableFuture<DeleteJobResponse> deleteJob(DeleteJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteOTAFirmware  DeleteOTAFirmwareRequest
     * @return DeleteOTAFirmwareResponse
     */
    @Override
    public CompletableFuture<DeleteOTAFirmwareResponse> deleteOTAFirmware(DeleteOTAFirmwareRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteOTAFirmware").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteOTAFirmwareResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteOTAFirmwareResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>The default module cannot be deleted.</li>
     * <li>If an update package exists in an OTA module, you cannot delete the OTA module.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteOTAModule  DeleteOTAModuleRequest
     * @return DeleteOTAModuleResponse
     */
    @Override
    public CompletableFuture<DeleteOTAModuleResponse> deleteOTAModule(DeleteOTAModuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteOTAModule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteOTAModuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteOTAModuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteParser  DeleteParserRequest
     * @return DeleteParserResponse
     */
    @Override
    public CompletableFuture<DeleteParserResponse> deleteParser(DeleteParserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteParser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteParserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteParserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteParserDataSource  DeleteParserDataSourceRequest
     * @return DeleteParserDataSourceResponse
     */
    @Override
    public CompletableFuture<DeleteParserDataSourceResponse> deleteParserDataSource(DeleteParserDataSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteParserDataSource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteParserDataSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteParserDataSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeletePowerStation  DeletePowerStationRequest
     * @return DeletePowerStationResponse
     */
    @Override
    public CompletableFuture<DeletePowerStationResponse> deletePowerStation(DeletePowerStationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeletePowerStation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePowerStationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePowerStationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>After a product is deleted, the ProductKey of the product is invalid. The related information about the product is also deleted. You cannot perform the required operations on the product.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 500 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteProduct  DeleteProductRequest
     * @return DeleteProductResponse
     */
    @Override
    public CompletableFuture<DeleteProductResponse> deleteProduct(DeleteProductRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteProduct").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteProductResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteProductResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>You can delete a maximum of 10 tags in a single call.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 500 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteProductTags  DeleteProductTagsRequest
     * @return DeleteProductTagsResponse
     */
    @Override
    public CompletableFuture<DeleteProductTagsResponse> deleteProductTags(DeleteProductTagsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteProductTags").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteProductTagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteProductTagsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteProductTopic  DeleteProductTopicRequest
     * @return DeleteProductTopicResponse
     */
    @Override
    public CompletableFuture<DeleteProductTopicResponse> deleteProductTopic(DeleteProductTopicRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteProductTopic").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteProductTopicResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteProductTopicResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteRule  DeleteRuleRequest
     * @return DeleteRuleResponse
     */
    @Override
    public CompletableFuture<DeleteRuleResponse> deleteRule(DeleteRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteRuleAction  DeleteRuleActionRequest
     * @return DeleteRuleActionResponse
     */
    @Override
    public CompletableFuture<DeleteRuleActionResponse> deleteRuleAction(DeleteRuleActionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteRuleAction").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRuleActionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRuleActionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteSceneRule  DeleteSceneRuleRequest
     * @return DeleteSceneRuleResponse
     */
    @Override
    public CompletableFuture<DeleteSceneRuleResponse> deleteSceneRule(DeleteSceneRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSceneRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSceneRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSceneRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteSchedulePeriod  DeleteSchedulePeriodRequest
     * @return DeleteSchedulePeriodResponse
     */
    @Override
    public CompletableFuture<DeleteSchedulePeriodResponse> deleteSchedulePeriod(DeleteSchedulePeriodRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSchedulePeriod").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSchedulePeriodResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSchedulePeriodResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteShareTaskDevice  DeleteShareTaskDeviceRequest
     * @return DeleteShareTaskDeviceResponse
     */
    @Override
    public CompletableFuture<DeleteShareTaskDeviceResponse> deleteShareTaskDevice(DeleteShareTaskDeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteShareTaskDevice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteShareTaskDeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteShareTaskDeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteSoundCode  DeleteSoundCodeRequest
     * @return DeleteSoundCodeResponse
     */
    @Override
    public CompletableFuture<DeleteSoundCodeResponse> deleteSoundCode(DeleteSoundCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSoundCode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSoundCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSoundCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteSoundCodeLabel  DeleteSoundCodeLabelRequest
     * @return DeleteSoundCodeLabelResponse
     */
    @Override
    public CompletableFuture<DeleteSoundCodeLabelResponse> deleteSoundCodeLabel(DeleteSoundCodeLabelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSoundCodeLabel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSoundCodeLabelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSoundCodeLabelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteSoundCodeSchedule  DeleteSoundCodeScheduleRequest
     * @return DeleteSoundCodeScheduleResponse
     */
    @Override
    public CompletableFuture<DeleteSoundCodeScheduleResponse> deleteSoundCodeSchedule(DeleteSoundCodeScheduleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSoundCodeSchedule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSoundCodeScheduleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSoundCodeScheduleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteSpeech  DeleteSpeechRequest
     * @return DeleteSpeechResponse
     */
    @Override
    public CompletableFuture<DeleteSpeechResponse> deleteSpeech(DeleteSpeechRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSpeech").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSpeechResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSpeechResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteStudioAppDomainOpen  DeleteStudioAppDomainOpenRequest
     * @return DeleteStudioAppDomainOpenResponse
     */
    @Override
    public CompletableFuture<DeleteStudioAppDomainOpenResponse> deleteStudioAppDomainOpen(DeleteStudioAppDomainOpenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteStudioAppDomainOpen").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteStudioAppDomainOpenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteStudioAppDomainOpenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 5 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteSubscribeRelation  DeleteSubscribeRelationRequest
     * @return DeleteSubscribeRelationResponse
     */
    @Override
    public CompletableFuture<DeleteSubscribeRelationResponse> deleteSubscribeRelation(DeleteSubscribeRelationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSubscribeRelation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSubscribeRelationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSubscribeRelationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  If a product is published, you must call the <a href="https://help.aliyun.com/document_detail/213875.html">CancelReleaseProduct</a> operation to unpublish the product before you call the DeleteThingModel operation.</p>
     * <ul>
     * <li>If an existing feature or custom TSL module in a product is not published, you can call the DeleteThingModel operation to remove the feature or delete the custom TSL module.</li>
     * <li>When you call the DeleteThingModel operation, you must specify a value for the <strong>ProductKey</strong> parameter. The following list describes how the DeleteThingModel operation works:<ul>
     * <li>If you specify a value only for the <strong>ProductKey</strong> parameter, the operation deletes all custom TSL modules and removes all features in the default TSL module from the specified product.</li>
     * <li>If you specify values only for the <strong>ProductKey</strong> and <strong>FunctionBlockId</strong> parameters, the operation deletes the specified custom TSL module from the specified product.</li>
     * <li>If you specify a value for the <strong>ProductKey</strong> parameter and a value for the <strong>PropertyIdentifier.N</strong>, <strong>ServiceIdentifier.N</strong>, or <strong>EventIdentifier.N</strong> parameter, the operation removes one or more specified features from the default TSL module of the specified product. The operation removes the specified features only if the features exist. If the value that you specified for the <strong>PropertyIdentifier.N</strong>, <strong>ServiceIdentifier.N</strong>, or <strong>EventIdentifier.N</strong> parameter does not exist in the default TSL module, the operation returns the same result as when you specify a value only for the <strong>ProductKey</strong> parameter.</li>
     * <li>If you specify values for the <strong>ProductKey</strong> and <strong>FunctionBlockId</strong> parameters and a value for the <strong>PropertyIdentifier.N</strong>, <strong>ServiceIdentifier.N</strong>, or <strong>EventIdentifier.N</strong> parameter, the operation removes one or more specified features from a specified custom TSL module in a specified product. The operation removes the specified features only if the features exist. If the value that you specified for the <strong>PropertyIdentifier.N</strong>, <strong>ServiceIdentifier.N</strong>, or <strong>EventIdentifier.N</strong> parameter does not exist, the operation returns the same result as when you specify values only for the <strong>ProductKey</strong> and <strong>FunctionBlockId</strong> parameters.<blockquote>
     * <p>You must specify up to 10 identifiers for the <strong>PropertyIdentifier.N</strong>, <strong>ServiceIdentifier.N</strong>, or <strong>EventIdentifier.N</strong> parameter.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * <li>After you call the DeleteThingModel operation to remove one or more features from a product, you must call the <a href="https://help.aliyun.com/document_detail/150311.html">PublishThingModel</a> operation to re-publish the TSL model of the product. This way, the change takes effect.</li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 5 queries per second (QPS). </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteThingModel  DeleteThingModelRequest
     * @return DeleteThingModelResponse
     */
    @Override
    public CompletableFuture<DeleteThingModelResponse> deleteThingModel(DeleteThingModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteThingModel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteThingModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteThingModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteTopicConfig  DeleteTopicConfigRequest
     * @return DeleteTopicConfigResponse
     */
    @Override
    public CompletableFuture<DeleteTopicConfigResponse> deleteTopicConfig(DeleteTopicConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteTopicConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTopicConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTopicConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteTopicRouteTable  DeleteTopicRouteTableRequest
     * @return DeleteTopicRouteTableResponse
     */
    @Override
    public CompletableFuture<DeleteTopicRouteTableResponse> deleteTopicRouteTable(DeleteTopicRouteTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteTopicRouteTable").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTopicRouteTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTopicRouteTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteUserDefineTableDataByPrimaryKey  DeleteUserDefineTableDataByPrimaryKeyRequest
     * @return DeleteUserDefineTableDataByPrimaryKeyResponse
     */
    @Override
    public CompletableFuture<DeleteUserDefineTableDataByPrimaryKeyResponse> deleteUserDefineTableDataByPrimaryKey(DeleteUserDefineTableDataByPrimaryKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteUserDefineTableDataByPrimaryKey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteUserDefineTableDataByPrimaryKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteUserDefineTableDataByPrimaryKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DetachDestination  DetachDestinationRequest
     * @return DetachDestinationResponse
     */
    @Override
    public CompletableFuture<DetachDestinationResponse> detachDestination(DetachDestinationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachDestination").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetachDestinationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetachDestinationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DetachParserDataSource  DetachParserDataSourceRequest
     * @return DetachParserDataSourceResponse
     */
    @Override
    public CompletableFuture<DetachParserDataSourceResponse> detachParserDataSource(DetachParserDataSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachParserDataSource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetachParserDataSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetachParserDataSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DisableDeviceTunnel  DisableDeviceTunnelRequest
     * @return DisableDeviceTunnelResponse
     */
    @Override
    public CompletableFuture<DisableDeviceTunnelResponse> disableDeviceTunnel(DisableDeviceTunnelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableDeviceTunnel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableDeviceTunnelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableDeviceTunnelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DisableDeviceTunnelShare  DisableDeviceTunnelShareRequest
     * @return DisableDeviceTunnelShareResponse
     */
    @Override
    public CompletableFuture<DisableDeviceTunnelShareResponse> disableDeviceTunnelShare(DisableDeviceTunnelShareRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableDeviceTunnelShare").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableDeviceTunnelShareResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableDeviceTunnelShareResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DisableSceneRule  DisableSceneRuleRequest
     * @return DisableSceneRuleResponse
     */
    @Override
    public CompletableFuture<DisableSceneRuleResponse> disableSceneRule(DisableSceneRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableSceneRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableSceneRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableSceneRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>After a device is disabled, you cannot connect the device to IoT Platform. You can perform device-specific operations on the device. However, the information about the device is still retained in IoT Platform. You can use the <a href="https://help.aliyun.com/document_detail/69603.html">EnableThing</a> API operation to connect the disabled device to IoT Platform again.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 500 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DisableThing  DisableThingRequest
     * @return DisableThingResponse
     */
    @Override
    public CompletableFuture<DisableThingResponse> disableThing(DisableThingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableThing").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableThingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableThingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnableDeviceTunnel  EnableDeviceTunnelRequest
     * @return EnableDeviceTunnelResponse
     */
    @Override
    public CompletableFuture<EnableDeviceTunnelResponse> enableDeviceTunnel(EnableDeviceTunnelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableDeviceTunnel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableDeviceTunnelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableDeviceTunnelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnableDeviceTunnelShare  EnableDeviceTunnelShareRequest
     * @return EnableDeviceTunnelShareResponse
     */
    @Override
    public CompletableFuture<EnableDeviceTunnelShareResponse> enableDeviceTunnelShare(EnableDeviceTunnelShareRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableDeviceTunnelShare").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableDeviceTunnelShareResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableDeviceTunnelShareResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnableSceneRule  EnableSceneRuleRequest
     * @return EnableSceneRuleResponse
     */
    @Override
    public CompletableFuture<EnableSceneRuleResponse> enableSceneRule(EnableSceneRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableSceneRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableSceneRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableSceneRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 500 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of EnableThing  EnableThingRequest
     * @return EnableThingResponse
     */
    @Override
    public CompletableFuture<EnableThingResponse> enableThing(EnableThingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableThing").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableThingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableThingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation can be used with other operations to upload a device list file. Procedure:</p>
     * <ol>
     * <li>Call this operation to generate the information of a device list file that you want to upload to OSS.<br>The response parameters of this API operation include:
     * The following request parameters of the OSS <a href="/help/en/object-storage-service/latest/postobject">PostObject</a> operation that is used to upload the device list file: <strong>Key</strong>, <strong>AccessKeyId</strong>, <strong>Signature</strong>, and <strong>Policy</strong>.  </li>
     * <li>Use an <a href="/help/en/object-storage-service/latest/sdk-code-samples-overview">OSS SDK</a> to call the <a href="/help/en/object-storage-service/latest/postobject">PostObject</a> operation to upload the device list file within 1 minute after a response is returned. For more information about sample code, see the &quot;Usage of response parameters&quot; section in this topic.  <blockquote>
     * <p> The parameter information that is returned by this operation is valid for 1 minute. You must upload the device list file within 1 minute.  3. After you upload the device list file, call the <a href="/help/en/iot-platform/latest/e1qtmo">CreateOTAStaticUpgradeJob</a> operation of IoT Platform to create a static update batch within 60 minutes.<br>If you upload device list files but you do not call the CreateOTAStaticUpgradeJob operation to create a static update batch, the system automatically deletes the uploaded files. The system deletes files on a regular basis.</p>
     * </blockquote>
     * </li>
     * </ol>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 10 queries per second (QPS). </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the Alibaba Cloud account. </p>
     * </blockquote>
     * <h2>Requirements</h2>
     * <ul>
     * <li>A device list file contains the names of devices. Separate multiple device names with line feeds. Each line contains only one device name. A device list file must be in the CSV format. The maximum size of a device list file is 5 MB.</li>
     * <li>Each device list file can contain up to 10,000 names for the devices in a product that is related to an update package. If the number of device names in a device list file exceeds the limit, an error occurs when you use the file to create a static update batch.</li>
     * </ul>
     * 
     * @param request the request parameters of GenerateDeviceNameListURL  GenerateDeviceNameListURLRequest
     * @return GenerateDeviceNameListURLResponse
     */
    @Override
    public CompletableFuture<GenerateDeviceNameListURLResponse> generateDeviceNameListURL(GenerateDeviceNameListURLRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GenerateDeviceNameListURL").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateDeviceNameListURLResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateDeviceNameListURLResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GenerateFileUploadURL  GenerateFileUploadURLRequest
     * @return GenerateFileUploadURLResponse
     */
    @Override
    public CompletableFuture<GenerateFileUploadURLResponse> generateFileUploadURL(GenerateFileUploadURLRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GenerateFileUploadURL").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateFileUploadURLResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateFileUploadURLResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation can be used together with other operations to create an update package. Procedure:
     * 1\. Call this API operation to generate the details of an update package file that you want to upload to OSS.
     * The following section describes the response parameters of this API operation:</p>
     * <ul>
     * <li>The following request parameters of the OSS <a href="https://help.aliyun.com/document_detail/31988.html">PostObject</a> operation that is used to upload the update package file: <strong>Key</strong>, <strong>OSSAccessKeyId</strong>, <strong>Signature</strong>, and <strong>Policy</strong>.</li>
     * <li>The following request parameter of the <a href="https://help.aliyun.com/document_detail/147311.html">CreateOTAFirmware</a> operation that is used to create the update package: <strong>FirmwareUrl</strong>.
     * 2\. Use an <a href="https://help.aliyun.com/document_detail/52834.html">OSS SDK</a> to call the <a href="https://help.aliyun.com/document_detail/31988.html">PostObject</a> operation to upload the update package file. For more information about sample code, see the &quot;Usage of response parameters&quot; section.<blockquote>
     * <p>The parameter information that is returned by this operation is valid for 1 minute. You must upload the update package file within 1 minute. The maximum size of the uploaded update package file is 1,000 MB.
     * 3\. After the update package file is uploaded, call the <a href="https://help.aliyun.com/document_detail/147311.html">CreateOTAFirmware</a> operation to create an update package within 60 minutes.
     * If update package files are uploaded but you do not call the CreateOTAFirmware operation to create update packages for the files, the uploaded files are automatically deleted by the system on a regular basis.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 10 queries per second (QPS). </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GenerateOTAUploadURL  GenerateOTAUploadURLRequest
     * @return GenerateOTAUploadURLResponse
     */
    @Override
    public CompletableFuture<GenerateOTAUploadURLResponse> generateOTAUploadURL(GenerateOTAUploadURLRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GenerateOTAUploadURL").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateOTAUploadURLResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateOTAUploadURLResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDataAPIServiceDetail  GetDataAPIServiceDetailRequest
     * @return GetDataAPIServiceDetailResponse
     */
    @Override
    public CompletableFuture<GetDataAPIServiceDetailResponse> getDataAPIServiceDetail(GetDataAPIServiceDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDataAPIServiceDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDataAPIServiceDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDataAPIServiceDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDestination  GetDestinationRequest
     * @return GetDestinationResponse
     */
    @Override
    public CompletableFuture<GetDestinationResponse> getDestination(GetDestinationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDestination").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDestinationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDestinationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 500 times per second per account.</p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetDeviceShadow  GetDeviceShadowRequest
     * @return GetDeviceShadowResponse
     */
    @Override
    public CompletableFuture<GetDeviceShadowResponse> getDeviceShadow(GetDeviceShadowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDeviceShadow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDeviceShadowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDeviceShadowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 500 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetDeviceStatus  GetDeviceStatusRequest
     * @return GetDeviceStatusResponse
     */
    @Override
    public CompletableFuture<GetDeviceStatusResponse> getDeviceStatus(GetDeviceStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDeviceStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDeviceStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDeviceStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDeviceTunnelShareStatus  GetDeviceTunnelShareStatusRequest
     * @return GetDeviceTunnelShareStatusResponse
     */
    @Override
    public CompletableFuture<GetDeviceTunnelShareStatusResponse> getDeviceTunnelShareStatus(GetDeviceTunnelShareStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDeviceTunnelShareStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDeviceTunnelShareStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDeviceTunnelShareStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDeviceTunnelStatus  GetDeviceTunnelStatusRequest
     * @return GetDeviceTunnelStatusResponse
     */
    @Override
    public CompletableFuture<GetDeviceTunnelStatusResponse> getDeviceTunnelStatus(GetDeviceTunnelStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDeviceTunnelStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDeviceTunnelStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDeviceTunnelStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDownloadFile  GetDownloadFileRequest
     * @return GetDownloadFileResponse
     */
    @Override
    public CompletableFuture<GetDownloadFileResponse> getDownloadFile(GetDownloadFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDownloadFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDownloadFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDownloadFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetEdgeDriverVersion  GetEdgeDriverVersionRequest
     * @return GetEdgeDriverVersionResponse
     */
    @Override
    public CompletableFuture<GetEdgeDriverVersionResponse> getEdgeDriverVersion(GetEdgeDriverVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetEdgeDriverVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetEdgeDriverVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetEdgeDriverVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetEdgeInstance  GetEdgeInstanceRequest
     * @return GetEdgeInstanceResponse
     */
    @Override
    public CompletableFuture<GetEdgeInstanceResponse> getEdgeInstance(GetEdgeInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetEdgeInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetEdgeInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetEdgeInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of five queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetEdgeInstanceDeployment  GetEdgeInstanceDeploymentRequest
     * @return GetEdgeInstanceDeploymentResponse
     */
    @Override
    public CompletableFuture<GetEdgeInstanceDeploymentResponse> getEdgeInstanceDeployment(GetEdgeInstanceDeploymentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetEdgeInstanceDeployment").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetEdgeInstanceDeploymentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetEdgeInstanceDeploymentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetEdgeInstanceMessageRouting  GetEdgeInstanceMessageRoutingRequest
     * @return GetEdgeInstanceMessageRoutingResponse
     */
    @Override
    public CompletableFuture<GetEdgeInstanceMessageRoutingResponse> getEdgeInstanceMessageRouting(GetEdgeInstanceMessageRoutingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetEdgeInstanceMessageRouting").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetEdgeInstanceMessageRoutingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetEdgeInstanceMessageRoutingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetGatewayBySubDevice  GetGatewayBySubDeviceRequest
     * @return GetGatewayBySubDeviceResponse
     */
    @Override
    public CompletableFuture<GetGatewayBySubDeviceResponse> getGatewayBySubDevice(GetGatewayBySubDeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetGatewayBySubDevice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetGatewayBySubDeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetGatewayBySubDeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>You can call this API operation up to 50 times per second per account.</p>
     * <blockquote>
     * <p>The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetLoraNodesTask  GetLoraNodesTaskRequest
     * @return GetLoraNodesTaskResponse
     */
    @Override
    public CompletableFuture<GetLoraNodesTaskResponse> getLoraNodesTask(GetLoraNodesTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetLoraNodesTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLoraNodesTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLoraNodesTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetParser  GetParserRequest
     * @return GetParserResponse
     */
    @Override
    public CompletableFuture<GetParserResponse> getParser(GetParserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetParser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetParserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetParserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetParserDataSource  GetParserDataSourceRequest
     * @return GetParserDataSourceResponse
     */
    @Override
    public CompletableFuture<GetParserDataSourceResponse> getParserDataSource(GetParserDataSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetParserDataSource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetParserDataSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetParserDataSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetRule  GetRuleRequest
     * @return GetRuleResponse
     */
    @Override
    public CompletableFuture<GetRuleResponse> getRule(GetRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>In addition to the preceding operation-specific request parameters, you must specify common request parameters when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/30561.html">Common request parameters</a>.</p>
     * 
     * @param request the request parameters of GetRuleAction  GetRuleActionRequest
     * @return GetRuleActionResponse
     */
    @Override
    public CompletableFuture<GetRuleActionResponse> getRuleAction(GetRuleActionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetRuleAction").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRuleActionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRuleActionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSceneRule  GetSceneRuleRequest
     * @return GetSceneRuleResponse
     */
    @Override
    public CompletableFuture<GetSceneRuleResponse> getSceneRule(GetSceneRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSceneRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSceneRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSceneRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetShareSpeechModelAudio  GetShareSpeechModelAudioRequest
     * @return GetShareSpeechModelAudioResponse
     */
    @Override
    public CompletableFuture<GetShareSpeechModelAudioResponse> getShareSpeechModelAudio(GetShareSpeechModelAudioRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetShareSpeechModelAudio").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetShareSpeechModelAudioResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetShareSpeechModelAudioResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetShareTaskByDeviceOpen  GetShareTaskByDeviceOpenRequest
     * @return GetShareTaskByDeviceOpenResponse
     */
    @Override
    public CompletableFuture<GetShareTaskByDeviceOpenResponse> getShareTaskByDeviceOpen(GetShareTaskByDeviceOpenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetShareTaskByDeviceOpen").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetShareTaskByDeviceOpenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetShareTaskByDeviceOpenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSoundCodeAudio  GetSoundCodeAudioRequest
     * @return GetSoundCodeAudioResponse
     */
    @Override
    public CompletableFuture<GetSoundCodeAudioResponse> getSoundCodeAudio(GetSoundCodeAudioRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSoundCodeAudio").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSoundCodeAudioResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSoundCodeAudioResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSoundCodeSchedule  GetSoundCodeScheduleRequest
     * @return GetSoundCodeScheduleResponse
     */
    @Override
    public CompletableFuture<GetSoundCodeScheduleResponse> getSoundCodeSchedule(GetSoundCodeScheduleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSoundCodeSchedule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSoundCodeScheduleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSoundCodeScheduleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSpeechDeviceDetail  GetSpeechDeviceDetailRequest
     * @return GetSpeechDeviceDetailResponse
     */
    @Override
    public CompletableFuture<GetSpeechDeviceDetailResponse> getSpeechDeviceDetail(GetSpeechDeviceDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSpeechDeviceDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSpeechDeviceDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSpeechDeviceDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to three times per second per account.</p>
     * <blockquote>
     * <p>The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetSpeechLicenseDeviceStatistics  GetSpeechLicenseDeviceStatisticsRequest
     * @return GetSpeechLicenseDeviceStatisticsResponse
     */
    @Override
    public CompletableFuture<GetSpeechLicenseDeviceStatisticsResponse> getSpeechLicenseDeviceStatistics(GetSpeechLicenseDeviceStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSpeechLicenseDeviceStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSpeechLicenseDeviceStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSpeechLicenseDeviceStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSpeechVoice  GetSpeechVoiceRequest
     * @return GetSpeechVoiceResponse
     */
    @Override
    public CompletableFuture<GetSpeechVoiceResponse> getSpeechVoice(GetSpeechVoiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSpeechVoice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSpeechVoiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSpeechVoiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetStudioAppTokenOpen  GetStudioAppTokenOpenRequest
     * @return GetStudioAppTokenOpenResponse
     */
    @Override
    public CompletableFuture<GetStudioAppTokenOpenResponse> getStudioAppTokenOpen(GetStudioAppTokenOpenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetStudioAppTokenOpen").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetStudioAppTokenOpenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetStudioAppTokenOpenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetThingModelStatusInner  GetThingModelStatusInnerRequest
     * @return GetThingModelStatusInnerResponse
     */
    @Override
    public CompletableFuture<GetThingModelStatusInnerResponse> getThingModelStatusInner(GetThingModelStatusInnerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetThingModelStatusInner").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetThingModelStatusInnerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetThingModelStatusInnerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>In addition to the preceding operation-specific request parameters, you must specify common request parameters when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/30561.html">Common request parameters</a>.</p>
     * 
     * @param request the request parameters of GetThingModelTsl  GetThingModelTslRequest
     * @return GetThingModelTslResponse
     */
    @Override
    public CompletableFuture<GetThingModelTslResponse> getThingModelTsl(GetThingModelTslRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetThingModelTsl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetThingModelTslResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetThingModelTslResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 20 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetThingModelTslPublished  GetThingModelTslPublishedRequest
     * @return GetThingModelTslPublishedResponse
     */
    @Override
    public CompletableFuture<GetThingModelTslPublishedResponse> getThingModelTslPublished(GetThingModelTslPublishedRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetThingModelTslPublished").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetThingModelTslPublishedResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetThingModelTslPublishedResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  A data parsing script is used to convert the custom-formatted data to JSON data after the data is submitted by a device. You can write a script in JavaScript, Python 2.7, and PHP 7.2. For more information, see <a href="https://help.aliyun.com/document_detail/149963.html">Submit scripts for data parsing</a>.</p>
     * <ul>
     * <li>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetThingScript  GetThingScriptRequest
     * @return GetThingScriptResponse
     */
    @Override
    public CompletableFuture<GetThingScriptResponse> getThingScript(GetThingScriptRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetThingScript").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetThingScriptResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetThingScriptResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 2 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetThingTemplate  GetThingTemplateRequest
     * @return GetThingTemplateResponse
     */
    @Override
    public CompletableFuture<GetThingTemplateResponse> getThingTemplate(GetThingTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetThingTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetThingTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetThingTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can initiate a maximum of 500 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetThingTopo  GetThingTopoRequest
     * @return GetThingTopoResponse
     */
    @Override
    public CompletableFuture<GetThingTopoResponse> getThingTopo(GetThingTopoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetThingTopo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetThingTopoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetThingTopoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GisQueryDeviceLocation  GisQueryDeviceLocationRequest
     * @return GisQueryDeviceLocationResponse
     */
    @Override
    public CompletableFuture<GisQueryDeviceLocationResponse> gisQueryDeviceLocation(GisQueryDeviceLocationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GisQueryDeviceLocation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GisQueryDeviceLocationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GisQueryDeviceLocationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GisSearchDeviceTrace  GisSearchDeviceTraceRequest
     * @return GisSearchDeviceTraceResponse
     */
    @Override
    public CompletableFuture<GisSearchDeviceTraceResponse> gisSearchDeviceTrace(GisSearchDeviceTraceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GisSearchDeviceTrace").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GisSearchDeviceTraceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GisSearchDeviceTraceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ImportDTData  ImportDTDataRequest
     * @return ImportDTDataResponse
     */
    @Override
    public CompletableFuture<ImportDTDataResponse> importDTData(ImportDTDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ImportDTData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ImportDTDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ImportDTDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>Before you call this operation, make sure that an MQTT gateway and the related product are created and the <strong>ProductKey</strong> of the product is obtained. For more information, see <a href="https://help.aliyun.com/document_detail/433804.html">Create an MQTT gateway</a>.</p>
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 50 times per second per account.</p>
     * <blockquote>
     * <p>The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ImportDevice  ImportDeviceRequest
     * @return ImportDeviceResponse
     */
    @Override
    public CompletableFuture<ImportDeviceResponse> importDevice(ImportDeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ImportDevice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ImportDeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ImportDeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>If a product is published, you must call the <a href="https://help.aliyun.com/document_detail/213875.html">CancelReleaseProduct</a> operation to unpublish the product before you call this operation.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 5 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ImportThingModelTsl  ImportThingModelTslRequest
     * @return ImportThingModelTslResponse
     */
    @Override
    public CompletableFuture<ImportThingModelTslResponse> importThingModelTsl(ImportThingModelTslRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ImportThingModelTsl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ImportThingModelTslResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ImportThingModelTslResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InvokeDataAPIService  InvokeDataAPIServiceRequest
     * @return InvokeDataAPIServiceResponse
     */
    @Override
    public CompletableFuture<InvokeDataAPIServiceResponse> invokeDataAPIService(InvokeDataAPIServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("InvokeDataAPIService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InvokeDataAPIServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InvokeDataAPIServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you define a service in a Thing Specification Language (TSL) model, the mode in which the service is called is specified. When you call a service by using this operation, IoT Platform uses a call mode based on the value of the <strong>Identifier</strong> parameter.</p>
     * <ul>
     * <li>Synchronous mode: IoT Platform sends a revert-remote procedure call (RRPC) request to a device. Then, the device synchronously returns an RRPC response. For more information about how to use an RRPC, see <a href="https://help.aliyun.com/document_detail/90567.html">What is RRPC?</a></li>
     * <li>Asynchronous mode: IoT Platform sends an RRPC request to a device. Then, the device asynchronously returns an RRPC response. For more information about topics, see <a href="https://help.aliyun.com/document_detail/89301.html">Device properties, events, and services</a>.<blockquote>
     * <p>If you set the Checksum Type parameter to <strong>Verification-free</strong> when you create a product, the asynchronous mode is used.
     * When the device receives the service call, the device returns a response to the service caller. When you configure the device, you must specify the response logic and response parameters. The data formats of response parameters must comply with the Alink protocol. Example:</p>
     * </blockquote>
     * </li>
     * </ul>
     * <pre><code>{
     *     &quot;id&quot;: &quot;58***89&quot;,
     *     &quot;code&quot;: 200,
     *     &quot;data&quot;: {},
     *     &quot;message&quot;: &quot;success&quot;,
     *     &quot;localizedMsg&quot;: &quot;localizedMsg&quot;
     * }
     * </code></pre>
     * <blockquote>
     * <ul>
     * <li>The <strong>id</strong> parameter specifies the unique identifier of the request. The ID is generated by IoT Platform. The device can obtain the ID from the request parameters and then return the ID.</li>
     * <li>The <strong>code</strong> parameter specifies the result of the service call. The value of the parameter is an integer.</li>
     * <li>The <strong>data</strong> parameter specifies the result of the service call. This parameter is returned to the service caller. You can configure the parameters that you want to include in the returned result. The data must be in the JSON format.</li>
     * <li>The <strong>message</strong> and <strong>localizedMsg</strong> parameters are optional.</li>
     * <li>Link SDK for C of IoT Platform provides an example on how to use a TSL model. For more information, see <a href="https://help.aliyun.com/document_detail/258239.html">Call device services</a>.</li>
     * </ul>
     * </blockquote>
     * <h2>Limits</h2>
     * <p>If you synchronously call a service, the timeout period is 8 seconds. If a server does not receive a response within 8 seconds, a timeout error occurs. No limit is imposed on the timeout period of asynchronous calls. </p>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 500 queries per second (QPS). </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of InvokeThingService  InvokeThingServiceRequest
     * @return InvokeThingServiceResponse
     */
    @Override
    public CompletableFuture<InvokeThingServiceResponse> invokeThingService(InvokeThingServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("InvokeThingService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InvokeThingServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InvokeThingServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can only asynchronously call this operation.
     * When the device receives the service call, the device returns a response to the service caller. When you configure the device, you must specify the response logic and response parameters. The data formats of response parameters must comply with the Alink protocol. Example:</p>
     * <pre><code>{
     *     &quot;id&quot;: &quot;58***89&quot;,
     *     &quot;code&quot;: 200,
     *     &quot;data&quot;: {},
     *     &quot;message&quot;: &quot;success&quot;,
     *     &quot;localizedMsg&quot;: &quot;localizedMsg&quot;
     * }
     * </code></pre>
     * <blockquote>
     * <ul>
     * <li>The <strong>id</strong> parameter specifies the unique identifier of the request. The ID is generated by IoT Platform. The device can obtain the ID from the request parameters and return the ID.</li>
     * <li>The <strong>code</strong> parameter specifies the result of the service call. The value of the parameter is an integer.</li>
     * <li>The <strong>data</strong> parameter specifies the result of the service call. This parameter is returned to the service caller. You can specify the parameters included in the returned result. The data must be in JSON format.</li>
     * <li>The <strong>message</strong> and <strong>localizedMsg</strong> parameters are optional.</li>
     * <li>Link SDK for C of IoT Platform provides an example on how to use a TSL model. For more information, see <a href="https://help.aliyun.com/document_detail/258239.html">Call device services</a>.</li>
     * </ul>
     * </blockquote>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 10 queries per second (QPS). </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of InvokeThingsService  InvokeThingsServiceRequest
     * @return InvokeThingsServiceResponse
     */
    @Override
    public CompletableFuture<InvokeThingsServiceResponse> invokeThingsService(InvokeThingsServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("InvokeThingsService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InvokeThingsServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InvokeThingsServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAnalyticsData  ListAnalyticsDataRequest
     * @return ListAnalyticsDataResponse
     */
    @Override
    public CompletableFuture<ListAnalyticsDataResponse> listAnalyticsData(ListAnalyticsDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAnalyticsData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAnalyticsDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAnalyticsDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 10 times per second per account.</p>
     * <blockquote>
     * <p>The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListDataSourceItem  ListDataSourceItemRequest
     * @return ListDataSourceItemResponse
     */
    @Override
    public CompletableFuture<ListDataSourceItemResponse> listDataSourceItem(ListDataSourceItemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDataSourceItem").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataSourceItemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataSourceItemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDestination  ListDestinationRequest
     * @return ListDestinationResponse
     */
    @Override
    public CompletableFuture<ListDestinationResponse> listDestination(ListDestinationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDestination").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDestinationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDestinationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If you use an Enterprise Edition instance, you must specify the <strong>IotInstanceId</strong> parameter when you call this operation. Otherwise, the call fails.</p>
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to five times per second per account. </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListDeviceDistributeJob  ListDeviceDistributeJobRequest
     * @return ListDeviceDistributeJobResponse
     */
    @Override
    public CompletableFuture<ListDeviceDistributeJobResponse> listDeviceDistributeJob(ListDeviceDistributeJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDeviceDistributeJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDeviceDistributeJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDeviceDistributeJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation can be called only by using the following <strong>endpoint</strong>: <code>iot.cn-shanghai.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Each Alibaba Cloud account can run a maximum of 5 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * <li>Multiple Alibaba Cloud accounts can run a maximum of 200 QPS at the same time.</li>
     * </ul>
     * 
     * @param request the request parameters of ListDistributedDevice  ListDistributedDeviceRequest
     * @return ListDistributedDeviceResponse
     */
    @Override
    public CompletableFuture<ListDistributedDeviceResponse> listDistributedDevice(ListDistributedDeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDistributedDevice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDistributedDeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDistributedDeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation only by using the following <strong>endpoint</strong>: <code>iot.cn-shanghai.aliyuncs.com</code>.</p>
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to five times per second per account. </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListDistributedProduct  ListDistributedProductRequest
     * @return ListDistributedProductResponse
     */
    @Override
    public CompletableFuture<ListDistributedProductResponse> listDistributedProduct(ListDistributedProductRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDistributedProduct").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDistributedProductResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDistributedProductResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListJob  ListJobRequest
     * @return ListJobResponse
     */
    @Override
    public CompletableFuture<ListJobResponse> listJob(ListJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListOTAFirmware  ListOTAFirmwareRequest
     * @return ListOTAFirmwareResponse
     */
    @Override
    public CompletableFuture<ListOTAFirmwareResponse> listOTAFirmware(ListOTAFirmwareRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListOTAFirmware").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListOTAFirmwareResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListOTAFirmwareResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListOTAJobByDevice  ListOTAJobByDeviceRequest
     * @return ListOTAJobByDeviceResponse
     */
    @Override
    public CompletableFuture<ListOTAJobByDeviceResponse> listOTAJobByDevice(ListOTAJobByDeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListOTAJobByDevice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListOTAJobByDeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListOTAJobByDeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListOTAJobByFirmware  ListOTAJobByFirmwareRequest
     * @return ListOTAJobByFirmwareResponse
     */
    @Override
    public CompletableFuture<ListOTAJobByFirmwareResponse> listOTAJobByFirmware(ListOTAJobByFirmwareRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListOTAJobByFirmware").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListOTAJobByFirmwareResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListOTAJobByFirmwareResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListOTAModuleByProduct  ListOTAModuleByProductRequest
     * @return ListOTAModuleByProductResponse
     */
    @Override
    public CompletableFuture<ListOTAModuleByProductResponse> listOTAModuleByProduct(ListOTAModuleByProductRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListOTAModuleByProduct").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListOTAModuleByProductResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListOTAModuleByProductResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListOTAModuleVersionsByDevice  ListOTAModuleVersionsByDeviceRequest
     * @return ListOTAModuleVersionsByDeviceResponse
     */
    @Override
    public CompletableFuture<ListOTAModuleVersionsByDeviceResponse> listOTAModuleVersionsByDevice(ListOTAModuleVersionsByDeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListOTAModuleVersionsByDevice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListOTAModuleVersionsByDeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListOTAModuleVersionsByDeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListOTATaskByJob  ListOTATaskByJobRequest
     * @return ListOTATaskByJobResponse
     */
    @Override
    public CompletableFuture<ListOTATaskByJobResponse> listOTATaskByJob(ListOTATaskByJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListOTATaskByJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListOTATaskByJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListOTATaskByJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListOTAUnfinishedTaskByDevice  ListOTAUnfinishedTaskByDeviceRequest
     * @return ListOTAUnfinishedTaskByDeviceResponse
     */
    @Override
    public CompletableFuture<ListOTAUnfinishedTaskByDeviceResponse> listOTAUnfinishedTaskByDevice(ListOTAUnfinishedTaskByDeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListOTAUnfinishedTaskByDevice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListOTAUnfinishedTaskByDeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListOTAUnfinishedTaskByDeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListParser  ListParserRequest
     * @return ListParserResponse
     */
    @Override
    public CompletableFuture<ListParserResponse> listParser(ListParserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListParser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListParserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListParserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListParserDataSource  ListParserDataSourceRequest
     * @return ListParserDataSourceResponse
     */
    @Override
    public CompletableFuture<ListParserDataSourceResponse> listParserDataSource(ListParserDataSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListParserDataSource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListParserDataSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListParserDataSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListParserDestination  ListParserDestinationRequest
     * @return ListParserDestinationResponse
     */
    @Override
    public CompletableFuture<ListParserDestinationResponse> listParserDestination(ListParserDestinationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListParserDestination").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListParserDestinationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListParserDestinationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPowerStation  ListPowerStationRequest
     * @return ListPowerStationResponse
     */
    @Override
    public CompletableFuture<ListPowerStationResponse> listPowerStation(ListPowerStationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPowerStation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPowerStationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPowerStationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>Each Alibaba Cloud account can run a maximum of 500 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * <li>You can specify a tag key or a tag key-value pair for search.</li>
     * <li>If you specify multiple tags, the logical relationship among these tags is <strong>OR</strong>.</li>
     * </ul>
     * 
     * @param request the request parameters of ListProductByTags  ListProductByTagsRequest
     * @return ListProductByTagsResponse
     */
    @Override
    public CompletableFuture<ListProductByTagsResponse> listProductByTags(ListProductByTagsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListProductByTags").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListProductByTagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListProductByTagsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 500 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListProductTags  ListProductTagsRequest
     * @return ListProductTagsResponse
     */
    @Override
    public CompletableFuture<ListProductTagsResponse> listProductTags(ListProductTagsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListProductTags").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListProductTagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListProductTagsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 20 times per second per account.</p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListRule  ListRuleRequest
     * @return ListRuleResponse
     */
    @Override
    public CompletableFuture<ListRuleResponse> listRule(ListRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 50 queries per second (QPS).</p>
     * <blockquote>
     * <p> The Resource Access Management (RAM) users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListRuleActions  ListRuleActionsRequest
     * @return ListRuleActionsResponse
     */
    @Override
    public CompletableFuture<ListRuleActionsResponse> listRuleActions(ListRuleActionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListRuleActions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRuleActionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRuleActionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTask  ListTaskRequest
     * @return ListTaskResponse
     */
    @Override
    public CompletableFuture<ListTaskResponse> listTask(ListTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can manage TSL models by version. After you import a TSL model by calling the <a href="https://help.aliyun.com/document_detail/150320.html">ImportThingModelTsl</a> operation, copy a TSL model by calling the <a href="https://help.aliyun.com/document_detail/150322.html">CopyThingModel</a> operation, or edit a TSL model, you must publish the TSL model by calling the <a href="https://help.aliyun.com/document_detail/150311.html">PublishThingModel</a> operation. Then, the TSL model can be used. Each time a TSL model of a product is published, a new version is generated.</p>
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS). </p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListThingModelVersion  ListThingModelVersionRequest
     * @return ListThingModelVersionResponse
     */
    @Override
    public CompletableFuture<ListThingModelVersionResponse> listThingModelVersion(ListThingModelVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListThingModelVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListThingModelVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListThingModelVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>IoT Platform provides product categories that have defined TSL models, such as street lamps, vehicle location cards, and water immersion detectors.
     * When you call the <a href="https://help.aliyun.com/document_detail/69123.html">CreateProduct</a> operation to create a product, you can set the CategoryKey parameter to specify a product category. The product that you create references the standardized TSL model of the specified category.</p>
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 5 queries per second (QPS). </p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListThingTemplates  ListThingTemplatesRequest
     * @return ListThingTemplatesResponse
     */
    @Override
    public CompletableFuture<ListThingTemplatesResponse> listThingTemplates(ListThingTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListThingTemplates").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListThingTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListThingTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyOTAFirmware  ModifyOTAFirmwareRequest
     * @return ModifyOTAFirmwareResponse
     */
    @Override
    public CompletableFuture<ModifyOTAFirmwareResponse> modifyOTAFirmware(ModifyOTAFirmwareRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyOTAFirmware").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyOTAFirmwareResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyOTAFirmwareResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyPowerStation  ModifyPowerStationRequest
     * @return ModifyPowerStationResponse
     */
    @Override
    public CompletableFuture<ModifyPowerStationResponse> modifyPowerStation(ModifyPowerStationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyPowerStation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyPowerStationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyPowerStationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>A successful response indicates that the command to add topological relationships is sent to the gateway. It does not indicate that the topological relationships are added.
     * When you develop the gateway, you must subscribe to the topic that is used to send notifications when you add topological relationships. For more information about the topic and message format, see <a href="https://help.aliyun.com/document_detail/89299.html">Manage topological relationships</a>.</p>
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 500 queries per second (QPS). </p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of NotifyAddThingTopo  NotifyAddThingTopoRequest
     * @return NotifyAddThingTopoResponse
     */
    @Override
    public CompletableFuture<NotifyAddThingTopoResponse> notifyAddThingTopo(NotifyAddThingTopoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("NotifyAddThingTopo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(NotifyAddThingTopoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<NotifyAddThingTopoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OpenIotService  OpenIotServiceRequest
     * @return OpenIotServiceResponse
     */
    @Override
    public CompletableFuture<OpenIotServiceResponse> openIotService(OpenIotServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OpenIotService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OpenIotServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OpenIotServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PackageSoundCodeLabelBatchAudio  PackageSoundCodeLabelBatchAudioRequest
     * @return PackageSoundCodeLabelBatchAudioResponse
     */
    @Override
    public CompletableFuture<PackageSoundCodeLabelBatchAudioResponse> packageSoundCodeLabelBatchAudio(PackageSoundCodeLabelBatchAudioRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PackageSoundCodeLabelBatchAudio").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PackageSoundCodeLabelBatchAudioResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PackageSoundCodeLabelBatchAudioResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <blockquote>
     * <p>The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of PageQuerySharedSpeechOpen  PageQuerySharedSpeechOpenRequest
     * @return PageQuerySharedSpeechOpenResponse
     */
    @Override
    public CompletableFuture<PageQuerySharedSpeechOpenResponse> pageQuerySharedSpeechOpen(PageQuerySharedSpeechOpenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PageQuerySharedSpeechOpen").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PageQuerySharedSpeechOpenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PageQuerySharedSpeechOpenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>You can call this operation to query only shared speech broadcasting data six hours ago. For example, if a shared speech was broadcasted at 07:15, you can query the speech after 13:15.</p>
     * <h2>QPS limits</h2>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <blockquote>
     * <p>The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of PageQuerySpeechBroadcastHour  PageQuerySpeechBroadcastHourRequest
     * @return PageQuerySpeechBroadcastHourResponse
     */
    @Override
    public CompletableFuture<PageQuerySpeechBroadcastHourResponse> pageQuerySpeechBroadcastHour(PageQuerySpeechBroadcastHourRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PageQuerySpeechBroadcastHour").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PageQuerySpeechBroadcastHourResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PageQuerySpeechBroadcastHourResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Before you call this operation, a receipt template must be available in the Letter Sending Service console. Otherwise, the request fails.</p>
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 50 times per second per account.</p>
     * <blockquote>
     * <p>The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of PrintByTemplate  PrintByTemplateRequest
     * @return PrintByTemplateResponse
     */
    @Override
    public CompletableFuture<PrintByTemplateResponse> printByTemplate(PrintByTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PrintByTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PrintByTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PrintByTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation does not support device property settings and service invocations.</p>
     * <ul>
     * <li>To set properties, call the <a href="https://help.aliyun.com/document_detail/69579.html">SetDeviceProperty</a> or <a href="https://help.aliyun.com/document_detail/96243.html">SetDevicesProperty</a> operation.</li>
     * <li>To invoke a service, call the <a href="https://help.aliyun.com/document_detail/69584.html">InvokeThingService</a> or <a href="https://help.aliyun.com/document_detail/96242.html">InvokeThingsService</a> operation.</li>
     * </ul>
     * <h2>QPS limit</h2>
     * <p>You can call this API operation up to 1,600 times per second per account. </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of Pub  PubRequest
     * @return PubResponse
     */
    @Override
    public CompletableFuture<PubResponse> pub(PubRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("Pub").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PubResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PubResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can use the <strong>TopicFullName</strong> parameter in the <strong>request</strong> to specify the devices to which you want to broadcast messages. For more information, see the description about the <strong>TopicFullName</strong> parameter in this topic.</p>
     * <h2>QPS limits</h2>
     * <ul>
     * <li>Each Alibaba Cloud account can run only one query per second (QPS) to broadcast a message to devices that subscribe to a topic.</li>
     * <li>Each Alibaba Cloud account can run only one query per minute (QPM) to broadcast a message to all online devices of a product.      &gt;  The RAM users of an Alibaba Cloud account share the quota of the account.</li>
     * </ul>
     * 
     * @param request the request parameters of PubBroadcast  PubBroadcastRequest
     * @return PubBroadcastResponse
     */
    @Override
    public CompletableFuture<PubBroadcastResponse> pubBroadcast(PubBroadcastRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PubBroadcast").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PubBroadcastResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PubBroadcastResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PublishScript  PublishScriptRequest
     * @return PublishScriptResponse
     */
    @Override
    public CompletableFuture<PublishScriptResponse> publishScript(PublishScriptRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PublishScript").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PublishScriptResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PublishScriptResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PublishStudioApp  PublishStudioAppRequest
     * @return PublishStudioAppResponse
     */
    @Override
    public CompletableFuture<PublishStudioAppResponse> publishStudioApp(PublishStudioAppRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PublishStudioApp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PublishStudioAppResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PublishStudioAppResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>If a product is published, you must call the <a href="https://help.aliyun.com/document_detail/213875.html">CancelReleaseProduct</a> operation to unpublish the product before you call this operation.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 5 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of PublishThingModel  PublishThingModelRequest
     * @return PublishThingModelResponse
     */
    @Override
    public CompletableFuture<PublishThingModelResponse> publishThingModel(PublishThingModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PublishThingModel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PublishThingModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PublishThingModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PublishThingModelAsync  PublishThingModelAsyncRequest
     * @return PublishThingModelAsyncResponse
     */
    @Override
    public CompletableFuture<PublishThingModelAsyncResponse> publishThingModelAsync(PublishThingModelAsyncRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PublishThingModelAsync").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PublishThingModelAsyncResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PublishThingModelAsyncResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PublishThingModelAsyncInner  PublishThingModelAsyncInnerRequest
     * @return PublishThingModelAsyncInnerResponse
     */
    @Override
    public CompletableFuture<PublishThingModelAsyncInnerResponse> publishThingModelAsyncInner(PublishThingModelAsyncInnerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PublishThingModelAsyncInner").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PublishThingModelAsyncInnerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PublishThingModelAsyncInnerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PushSpeech  PushSpeechRequest
     * @return PushSpeechResponse
     */
    @Override
    public CompletableFuture<PushSpeechResponse> pushSpeech(PushSpeechRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PushSpeech").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PushSpeechResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PushSpeechResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 30 times per second per account.</p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryBatchRegisterDeviceStatus  QueryBatchRegisterDeviceStatusRequest
     * @return QueryBatchRegisterDeviceStatusResponse
     */
    @Override
    public CompletableFuture<QueryBatchRegisterDeviceStatusResponse> queryBatchRegisterDeviceStatus(QueryBatchRegisterDeviceStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryBatchRegisterDeviceStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryBatchRegisterDeviceStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryBatchRegisterDeviceStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>You can call this API operation up to 10 times per second per account.</p>
     * <blockquote>
     * <p>The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryCertUrlByApplyId  QueryCertUrlByApplyIdRequest
     * @return QueryCertUrlByApplyIdResponse
     */
    @Override
    public CompletableFuture<QueryCertUrlByApplyIdResponse> queryCertUrlByApplyId(QueryCertUrlByApplyIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryCertUrlByApplyId").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryCertUrlByApplyIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryCertUrlByApplyIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryClientIds  QueryClientIdsRequest
     * @return QueryClientIdsResponse
     */
    @Override
    public CompletableFuture<QueryClientIdsResponse> queryClientIds(QueryClientIdsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryClientIds").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryClientIdsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryClientIdsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 5 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryConsumerGroupByGroupId  QueryConsumerGroupByGroupIdRequest
     * @return QueryConsumerGroupByGroupIdResponse
     */
    @Override
    public CompletableFuture<QueryConsumerGroupByGroupIdResponse> queryConsumerGroupByGroupId(QueryConsumerGroupByGroupIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryConsumerGroupByGroupId").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryConsumerGroupByGroupIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryConsumerGroupByGroupIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 5 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryConsumerGroupList  QueryConsumerGroupListRequest
     * @return QueryConsumerGroupListResponse
     */
    @Override
    public CompletableFuture<QueryConsumerGroupListResponse> queryConsumerGroupList(QueryConsumerGroupListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryConsumerGroupList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryConsumerGroupListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryConsumerGroupListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 5 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryConsumerGroupStatus  QueryConsumerGroupStatusRequest
     * @return QueryConsumerGroupStatusResponse
     */
    @Override
    public CompletableFuture<QueryConsumerGroupStatusResponse> queryConsumerGroupStatus(QueryConsumerGroupStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryConsumerGroupStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryConsumerGroupStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryConsumerGroupStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryCustomTimelineTableStatus  QueryCustomTimelineTableStatusRequest
     * @return QueryCustomTimelineTableStatusResponse
     */
    @Override
    public CompletableFuture<QueryCustomTimelineTableStatusResponse> queryCustomTimelineTableStatus(QueryCustomTimelineTableStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryCustomTimelineTableStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryCustomTimelineTableStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryCustomTimelineTableStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryDetailSceneRuleLog  QueryDetailSceneRuleLogRequest
     * @return QueryDetailSceneRuleLogResponse
     */
    @Override
    public CompletableFuture<QueryDetailSceneRuleLogResponse> queryDetailSceneRuleLog(QueryDetailSceneRuleLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDetailSceneRuleLog").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDetailSceneRuleLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDetailSceneRuleLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The QueryDevice operation can return up to one million devices each time you call the operation.</p>
     * <h2>QPS limits</h2>
     * <ul>
     * <li>You can call this API operation up to 50 times per second per account. &gt;  The RAM users of an Alibaba Cloud account share the quota of the Alibaba Cloud account.</li>
     * <li>If the product of the value of the <strong>CurrentPage</strong> parameter and the value of the <strong>PageSize</strong> parameter is greater than or equal to 100,000, the queries per second (QPS) of this operation decreases. 
     * In this case, you can call this API operation up to two times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryDevice  QueryDeviceRequest
     * @return QueryDeviceResponse
     */
    @Override
    public CompletableFuture<QueryDeviceResponse> queryDevice(QueryDeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDevice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can query devices on Enterprise Edition instances only in the China (Shanghai) and Japan (Tokyo) regions.</p>
     * <ul>
     * <li>The QueryDeviceBySQL operation can return up to 10,000 devices each time you call the operation. For more information, see the &quot;<code>Syntax of LIMIT clauses</code>&quot; section of this topic.</li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 10 times per second per account. </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryDeviceBySQL  QueryDeviceBySQLRequest
     * @return QueryDeviceBySQLResponse
     */
    @Override
    public CompletableFuture<QueryDeviceBySQLResponse> queryDeviceBySQL(QueryDeviceBySQLRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDeviceBySQL").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDeviceBySQLResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDeviceBySQLResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>After the status of a device changes, the new status is applied within 10 seconds. After the new status is applied, you can search for the device by using the new status. Before the new status is applied, you can search for the device by using the previous status.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of QueryDeviceByStatus  QueryDeviceByStatusRequest
     * @return QueryDeviceByStatusResponse
     */
    @Override
    public CompletableFuture<QueryDeviceByStatusResponse> queryDeviceByStatus(QueryDeviceByStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDeviceByStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDeviceByStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDeviceByStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>You can specify a maximum of 10 tags in a single call.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 5 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of QueryDeviceByTags  QueryDeviceByTagsRequest
     * @return QueryDeviceByTagsResponse
     */
    @Override
    public CompletableFuture<QueryDeviceByTagsResponse> queryDeviceByTags(QueryDeviceByTagsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDeviceByTags").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDeviceByTagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDeviceByTagsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryDeviceCert  QueryDeviceCertRequest
     * @return QueryDeviceCertResponse
     */
    @Override
    public CompletableFuture<QueryDeviceCertResponse> queryDeviceCert(QueryDeviceCertRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDeviceCert").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDeviceCertResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDeviceCertResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  The desired values of read-only properties cannot be queried.</p>
     * <ul>
     * <li>You can query the desired values of up to 10 properties in a single call.</li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 50 times per second per account. </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryDeviceDesiredProperty  QueryDeviceDesiredPropertyRequest
     * @return QueryDeviceDesiredPropertyResponse
     */
    @Override
    public CompletableFuture<QueryDeviceDesiredPropertyResponse> queryDeviceDesiredProperty(QueryDeviceDesiredPropertyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDeviceDesiredProperty").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDeviceDesiredPropertyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDeviceDesiredPropertyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 50 queries per second (QPS).</p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryDeviceDetail  QueryDeviceDetailRequest
     * @return QueryDeviceDetailResponse
     */
    @Override
    public CompletableFuture<QueryDeviceDetailResponse> queryDeviceDetail(QueryDeviceDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDeviceDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDeviceDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDeviceDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation can be called only by using the following <strong>endpoint</strong>: <code>iot.cn-shanghai.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Each Alibaba Cloud account can run a maximum of 5 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of QueryDeviceDistributeDetail  QueryDeviceDistributeDetailRequest
     * @return QueryDeviceDistributeDetailResponse
     */
    @Override
    public CompletableFuture<QueryDeviceDistributeDetailResponse> queryDeviceDistributeDetail(QueryDeviceDistributeDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDeviceDistributeDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDeviceDistributeDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDeviceDistributeDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation can be called only by using the following <strong>endpoint</strong>: <code>iot.cn-shanghai.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of QueryDeviceDistributeJob  QueryDeviceDistributeJobRequest
     * @return QueryDeviceDistributeJobResponse
     */
    @Override
    public CompletableFuture<QueryDeviceDistributeJobResponse> queryDeviceDistributeJob(QueryDeviceDistributeJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDeviceDistributeJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDeviceDistributeJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDeviceDistributeJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can query only the event records that are generated in the previous 30 days.</p>
     * <blockquote>
     * <p> The storage period of an event record is calculated from the day when the record is generated.</p>
     * </blockquote>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 50 queries per second (QPS). </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryDeviceEventData  QueryDeviceEventDataRequest
     * @return QueryDeviceEventDataResponse
     */
    @Override
    public CompletableFuture<QueryDeviceEventDataResponse> queryDeviceEventData(QueryDeviceEventDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDeviceEventData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDeviceEventDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDeviceEventDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 500 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryDeviceFile  QueryDeviceFileRequest
     * @return QueryDeviceFileResponse
     */
    @Override
    public CompletableFuture<QueryDeviceFileResponse> queryDeviceFile(QueryDeviceFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDeviceFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDeviceFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDeviceFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>The returned file information for this operation call does not contain download URLs. To obtain the download URL of a file, call <a href="https://help.aliyun.com/document_detail/112002.html">QueryDeviceFile</a>.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 500 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of QueryDeviceFileList  QueryDeviceFileListRequest
     * @return QueryDeviceFileListResponse
     */
    @Override
    public CompletableFuture<QueryDeviceFileListResponse> queryDeviceFileList(QueryDeviceFileListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDeviceFileList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDeviceFileListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDeviceFileListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>You can add a device to a maximum of 10 groups.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of QueryDeviceGroupByDevice  QueryDeviceGroupByDeviceRequest
     * @return QueryDeviceGroupByDeviceResponse
     */
    @Override
    public CompletableFuture<QueryDeviceGroupByDeviceResponse> queryDeviceGroupByDevice(QueryDeviceGroupByDeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDeviceGroupByDevice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDeviceGroupByDeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDeviceGroupByDeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 5 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryDeviceGroupByTags  QueryDeviceGroupByTagsRequest
     * @return QueryDeviceGroupByTagsResponse
     */
    @Override
    public CompletableFuture<QueryDeviceGroupByTagsResponse> queryDeviceGroupByTags(QueryDeviceGroupByTagsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDeviceGroupByTags").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDeviceGroupByTagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDeviceGroupByTagsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 30 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryDeviceGroupInfo  QueryDeviceGroupInfoRequest
     * @return QueryDeviceGroupInfoResponse
     */
    @Override
    public CompletableFuture<QueryDeviceGroupInfoResponse> queryDeviceGroupInfo(QueryDeviceGroupInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDeviceGroupInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDeviceGroupInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDeviceGroupInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 100 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryDeviceGroupList  QueryDeviceGroupListRequest
     * @return QueryDeviceGroupListResponse
     */
    @Override
    public CompletableFuture<QueryDeviceGroupListResponse> queryDeviceGroupList(QueryDeviceGroupListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDeviceGroupList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDeviceGroupListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDeviceGroupListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 500 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryDeviceGroupTagList  QueryDeviceGroupTagListRequest
     * @return QueryDeviceGroupTagListResponse
     */
    @Override
    public CompletableFuture<QueryDeviceGroupTagListResponse> queryDeviceGroupTagList(QueryDeviceGroupTagListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDeviceGroupTagList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDeviceGroupTagListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDeviceGroupTagListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>In addition to the preceding operation-specific request parameters, you must specify common request parameters when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/30561.html">Common request parameters</a>.</p>
     * 
     * @param request the request parameters of QueryDeviceInfo  QueryDeviceInfoRequest
     * @return QueryDeviceInfoResponse
     */
    @Override
    public CompletableFuture<QueryDeviceInfoResponse> queryDeviceInfo(QueryDeviceInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDeviceInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDeviceInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDeviceInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 5 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryDeviceListByDeviceGroup  QueryDeviceListByDeviceGroupRequest
     * @return QueryDeviceListByDeviceGroupResponse
     */
    @Override
    public CompletableFuture<QueryDeviceListByDeviceGroupResponse> queryDeviceListByDeviceGroup(QueryDeviceListByDeviceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDeviceListByDeviceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDeviceListByDeviceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDeviceListByDeviceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>You can query only the event records that are generated in the last 30 days.<blockquote>
     * <p> The storage period of an event record is calculated from the day when the record is generated.</p>
     * </blockquote>
     * </li>
     * <li>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).<blockquote>
     * <p>Resource Access Management (RAM) users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of QueryDeviceOriginalEventData  QueryDeviceOriginalEventDataRequest
     * @return QueryDeviceOriginalEventDataResponse
     */
    @Override
    public CompletableFuture<QueryDeviceOriginalEventDataResponse> queryDeviceOriginalEventData(QueryDeviceOriginalEventDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDeviceOriginalEventData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDeviceOriginalEventDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDeviceOriginalEventDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can query only the property records that are generated within the previous 30 days.</p>
     * <blockquote>
     * <p> The data of a property is stored from the day when the data is generated.</p>
     * </blockquote>
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 50 times per second per account. </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryDeviceOriginalPropertyData  QueryDeviceOriginalPropertyDataRequest
     * @return QueryDeviceOriginalPropertyDataResponse
     */
    @Override
    public CompletableFuture<QueryDeviceOriginalPropertyDataResponse> queryDeviceOriginalPropertyData(QueryDeviceOriginalPropertyDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDeviceOriginalPropertyData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDeviceOriginalPropertyDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDeviceOriginalPropertyDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).</p>
     * <blockquote>
     * <p> Resource Access Management (RAM) users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryDeviceOriginalPropertyStatus  QueryDeviceOriginalPropertyStatusRequest
     * @return QueryDeviceOriginalPropertyStatusResponse
     */
    @Override
    public CompletableFuture<QueryDeviceOriginalPropertyStatusResponse> queryDeviceOriginalPropertyStatus(QueryDeviceOriginalPropertyStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDeviceOriginalPropertyStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDeviceOriginalPropertyStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDeviceOriginalPropertyStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>You can query only the service call records that are generated in the last 30 days.<blockquote>
     * <p> The storage period of a service call record is calculated from the day when the service is called.</p>
     * </blockquote>
     * </li>
     * <li>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).<blockquote>
     * <p>Resource Access Management (RAM) users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of QueryDeviceOriginalServiceData  QueryDeviceOriginalServiceDataRequest
     * @return QueryDeviceOriginalServiceDataResponse
     */
    @Override
    public CompletableFuture<QueryDeviceOriginalServiceDataResponse> queryDeviceOriginalServiceData(QueryDeviceOriginalServiceDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDeviceOriginalServiceData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDeviceOriginalServiceDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDeviceOriginalServiceDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryDeviceProp  QueryDevicePropRequest
     * @return QueryDevicePropResponse
     */
    @Override
    public CompletableFuture<QueryDevicePropResponse> queryDeviceProp(QueryDevicePropRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDeviceProp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDevicePropResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDevicePropResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to query property records within a specified period, the number of records for a property at a point in time may reach the limit.**** The limit is specified by the <strong>PageSize</strong> parameter. In this case, the query stops. Some records of other properties may be not returned.**** You can check whether all records of a property are returned based on the NextValid repsonse parameter: </p>
     * <ul>
     * <li>If the value of the <strong>NextValid</strong> parameter is true, unretrieved records exist in the period that is indicated by the <strong>NextTime</strong> and <strong>EndTime</strong> parameter.<br>You can use the value of the <strong>NextTime</strong> response parameter as the value of the StartTime request parameter and call this operation again to query the rest records. You can call this operation multiple times until the value of the <strong>NextValid</strong> parameter is false.  &gt;  To retrieve all property records within a specified period, you can set the <strong>PageSize</strong> parameter to the maximum value. Then, call this operation multiple times until the value of the <strong>NextValid</strong> parameter is false.</li>
     * <li>If the value of the <strong>NextValid</strong> parameter is false, all property records are returned.</li>
     * </ul>
     * <h2>Limits</h2>
     * <ul>
     * <li>A maximum of 10 properties can be queried at a time. A maximum of 100 records can be queried for each property.</li>
     * <li>You can query property data that is generated within the last 30 days.<blockquote>
     * <p>The storage period of a property record is calculated from the day when the property record was generated.</p>
     * </blockquote>
     * </li>
     * <li>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of QueryDevicePropertiesData  QueryDevicePropertiesDataRequest
     * @return QueryDevicePropertiesDataResponse
     */
    @Override
    public CompletableFuture<QueryDevicePropertiesDataResponse> queryDevicePropertiesData(QueryDevicePropertiesDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDevicePropertiesData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDevicePropertiesDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDevicePropertiesDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If a device or a digital twin node has multiple properties, you can call this operation to query the data of the properties multiple times. You must specify a value for the <strong>Identifier</strong> parameter each time you call the operation. You can also call the <a href="https://help.aliyun.com/document_detail/99237.html">QueryDevicePropertiesData</a> operation and specify multiple values for the <strong>Identifier</strong> parameter to query the data of the properties.</p>
     * <h2>Limits</h2>
     * <p>You can query only property data that is generated within the previous 30 days. </p>
     * <blockquote>
     * <p> The data of a property is stored from the day when the data is generated.</p>
     * </blockquote>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 50 queries per second (QPS). </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryDevicePropertyData  QueryDevicePropertyDataRequest
     * @return QueryDevicePropertyDataResponse
     */
    @Override
    public CompletableFuture<QueryDevicePropertyDataResponse> queryDevicePropertyData(QueryDevicePropertyDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDevicePropertyData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDevicePropertyDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDevicePropertyDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>To query the property data of a digital twin node, you must set the <strong>IotId</strong> parameter to the ID of the digital twin node.</p>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 200 queries per second (QPS). </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryDevicePropertyStatus  QueryDevicePropertyStatusRequest
     * @return QueryDevicePropertyStatusResponse
     */
    @Override
    public CompletableFuture<QueryDevicePropertyStatusResponse> queryDevicePropertyStatus(QueryDevicePropertyStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDevicePropertyStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDevicePropertyStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDevicePropertyStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryDeviceProvisioning  QueryDeviceProvisioningRequest
     * @return QueryDeviceProvisioningResponse
     */
    @Override
    public CompletableFuture<QueryDeviceProvisioningResponse> queryDeviceProvisioning(QueryDeviceProvisioningRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDeviceProvisioning").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDeviceProvisioningResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDeviceProvisioningResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can query only the service call records of the previous 30 days.</p>
     * <blockquote>
     * <p> The storage period of a service call record is calculated from the day when the service is called.</p>
     * </blockquote>
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 50 times per second per account. </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryDeviceServiceData  QueryDeviceServiceDataRequest
     * @return QueryDeviceServiceDataResponse
     */
    @Override
    public CompletableFuture<QueryDeviceServiceDataResponse> queryDeviceServiceData(QueryDeviceServiceDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDeviceServiceData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDeviceServiceDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDeviceServiceDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryDeviceSpeech  QueryDeviceSpeechRequest
     * @return QueryDeviceSpeechResponse
     */
    @Override
    public CompletableFuture<QueryDeviceSpeechResponse> queryDeviceSpeech(QueryDeviceSpeechRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDeviceSpeech").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDeviceSpeechResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDeviceSpeechResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryDeviceStatistics  QueryDeviceStatisticsRequest
     * @return QueryDeviceStatisticsResponse
     */
    @Override
    public CompletableFuture<QueryDeviceStatisticsResponse> queryDeviceStatistics(QueryDeviceStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDeviceStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDeviceStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDeviceStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>You can call this operation up to 100 times per second per account.</p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryDeviceSubTopic  QueryDeviceSubTopicRequest
     * @return QueryDeviceSubTopicResponse
     */
    @Override
    public CompletableFuture<QueryDeviceSubTopicResponse> queryDeviceSubTopic(QueryDeviceSubTopicRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDeviceSubTopic").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDeviceSubTopicResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDeviceSubTopicResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryDeviceTunnel  QueryDeviceTunnelRequest
     * @return QueryDeviceTunnelResponse
     */
    @Override
    public CompletableFuture<QueryDeviceTunnelResponse> queryDeviceTunnel(QueryDeviceTunnelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDeviceTunnel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDeviceTunnelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDeviceTunnelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryDevicesHotStorageData  QueryDevicesHotStorageDataRequest
     * @return QueryDevicesHotStorageDataResponse
     */
    @Override
    public CompletableFuture<QueryDevicesHotStorageDataResponse> queryDevicesHotStorageData(QueryDevicesHotStorageDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDevicesHotStorageData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDevicesHotStorageDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDevicesHotStorageDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryDevicesHotStorageDataStatus  QueryDevicesHotStorageDataStatusRequest
     * @return QueryDevicesHotStorageDataStatusResponse
     */
    @Override
    public CompletableFuture<QueryDevicesHotStorageDataStatusResponse> queryDevicesHotStorageDataStatus(QueryDevicesHotStorageDataStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDevicesHotStorageDataStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDevicesHotStorageDataStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDevicesHotStorageDataStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>The dynamic group feature is available for public instances and Enterprise Edition instances in the China (Shanghai) region. For more information, see <a href="https://help.aliyun.com/document_detail/147356.html">Manage instances</a>.</li>
     * <li>Each Alibaba Cloud account can run up to 50 queries per second (QPS).
     * **
     * <strong>Note</strong>The RAM users of an Alibaba Cloud account share the quota of the account.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryDynamicGroupDevices  QueryDynamicGroupDevicesRequest
     * @return QueryDynamicGroupDevicesResponse
     */
    @Override
    public CompletableFuture<QueryDynamicGroupDevicesResponse> queryDynamicGroupDevices(QueryDynamicGroupDevicesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDynamicGroupDevices").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDynamicGroupDevicesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDynamicGroupDevicesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>A single Alibaba Cloud account can run a maximum of 5 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryEdgeDriver  QueryEdgeDriverRequest
     * @return QueryEdgeDriverResponse
     */
    @Override
    public CompletableFuture<QueryEdgeDriverResponse> queryEdgeDriver(QueryEdgeDriverRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryEdgeDriver").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryEdgeDriverResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryEdgeDriverResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryEdgeDriverVersion  QueryEdgeDriverVersionRequest
     * @return QueryEdgeDriverVersionResponse
     */
    @Override
    public CompletableFuture<QueryEdgeDriverVersionResponse> queryEdgeDriverVersion(QueryEdgeDriverVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryEdgeDriverVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryEdgeDriverVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryEdgeDriverVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>In addition to the preceding exclusive request parameters, you must specify common request parameters when calling this API operation. For more information about common request parameters, see <a href="https://help.aliyun.com/document_detail/30561.html">Common parameters</a>.</p>
     * 
     * @param request the request parameters of QueryEdgeInstance  QueryEdgeInstanceRequest
     * @return QueryEdgeInstanceResponse
     */
    @Override
    public CompletableFuture<QueryEdgeInstanceResponse> queryEdgeInstance(QueryEdgeInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryEdgeInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryEdgeInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryEdgeInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryEdgeInstanceChannel  QueryEdgeInstanceChannelRequest
     * @return QueryEdgeInstanceChannelResponse
     */
    @Override
    public CompletableFuture<QueryEdgeInstanceChannelResponse> queryEdgeInstanceChannel(QueryEdgeInstanceChannelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryEdgeInstanceChannel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryEdgeInstanceChannelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryEdgeInstanceChannelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryEdgeInstanceDevice  QueryEdgeInstanceDeviceRequest
     * @return QueryEdgeInstanceDeviceResponse
     */
    @Override
    public CompletableFuture<QueryEdgeInstanceDeviceResponse> queryEdgeInstanceDevice(QueryEdgeInstanceDeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryEdgeInstanceDevice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryEdgeInstanceDeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryEdgeInstanceDeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryEdgeInstanceDeviceByDriver  QueryEdgeInstanceDeviceByDriverRequest
     * @return QueryEdgeInstanceDeviceByDriverResponse
     */
    @Override
    public CompletableFuture<QueryEdgeInstanceDeviceByDriverResponse> queryEdgeInstanceDeviceByDriver(QueryEdgeInstanceDeviceByDriverRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryEdgeInstanceDeviceByDriver").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryEdgeInstanceDeviceByDriverResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryEdgeInstanceDeviceByDriverResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryEdgeInstanceDriver  QueryEdgeInstanceDriverRequest
     * @return QueryEdgeInstanceDriverResponse
     */
    @Override
    public CompletableFuture<QueryEdgeInstanceDriverResponse> queryEdgeInstanceDriver(QueryEdgeInstanceDriverRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryEdgeInstanceDriver").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryEdgeInstanceDriverResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryEdgeInstanceDriverResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryEdgeInstanceGateway  QueryEdgeInstanceGatewayRequest
     * @return QueryEdgeInstanceGatewayResponse
     */
    @Override
    public CompletableFuture<QueryEdgeInstanceGatewayResponse> queryEdgeInstanceGateway(QueryEdgeInstanceGatewayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryEdgeInstanceGateway").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryEdgeInstanceGatewayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryEdgeInstanceGatewayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryEdgeInstanceHistoricDeployment  QueryEdgeInstanceHistoricDeploymentRequest
     * @return QueryEdgeInstanceHistoricDeploymentResponse
     */
    @Override
    public CompletableFuture<QueryEdgeInstanceHistoricDeploymentResponse> queryEdgeInstanceHistoricDeployment(QueryEdgeInstanceHistoricDeploymentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryEdgeInstanceHistoricDeployment").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryEdgeInstanceHistoricDeploymentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryEdgeInstanceHistoricDeploymentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryEdgeInstanceMessageRouting  QueryEdgeInstanceMessageRoutingRequest
     * @return QueryEdgeInstanceMessageRoutingResponse
     */
    @Override
    public CompletableFuture<QueryEdgeInstanceMessageRoutingResponse> queryEdgeInstanceMessageRouting(QueryEdgeInstanceMessageRoutingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryEdgeInstanceMessageRouting").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryEdgeInstanceMessageRoutingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryEdgeInstanceMessageRoutingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryEdgeInstanceSceneRule  QueryEdgeInstanceSceneRuleRequest
     * @return QueryEdgeInstanceSceneRuleResponse
     */
    @Override
    public CompletableFuture<QueryEdgeInstanceSceneRuleResponse> queryEdgeInstanceSceneRule(QueryEdgeInstanceSceneRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryEdgeInstanceSceneRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryEdgeInstanceSceneRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryEdgeInstanceSceneRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 50 times per second per account.</p>
     * <blockquote>
     * <p>The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryImportedDeviceByApplyId  QueryImportedDeviceByApplyIdRequest
     * @return QueryImportedDeviceByApplyIdResponse
     */
    @Override
    public CompletableFuture<QueryImportedDeviceByApplyIdResponse> queryImportedDeviceByApplyId(QueryImportedDeviceByApplyIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryImportedDeviceByApplyId").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryImportedDeviceByApplyIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryImportedDeviceByApplyIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryJob  QueryJobRequest
     * @return QueryJobResponse
     */
    @Override
    public CompletableFuture<QueryJobResponse> queryJob(QueryJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryJobStatistics  QueryJobStatisticsRequest
     * @return QueryJobStatisticsResponse
     */
    @Override
    public CompletableFuture<QueryJobStatisticsResponse> queryJobStatistics(QueryJobStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryJobStatistics").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryJobStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryJobStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 10 times per second per account.</p>
     * <blockquote>
     * <p>The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryLicenseDeviceList  QueryLicenseDeviceListRequest
     * @return QueryLicenseDeviceListResponse
     */
    @Override
    public CompletableFuture<QueryLicenseDeviceListResponse> queryLicenseDeviceList(QueryLicenseDeviceListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryLicenseDeviceList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryLicenseDeviceListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryLicenseDeviceListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryLoRaJoinPermissions  QueryLoRaJoinPermissionsRequest
     * @return QueryLoRaJoinPermissionsResponse
     */
    @Override
    public CompletableFuture<QueryLoRaJoinPermissionsResponse> queryLoRaJoinPermissions(QueryLoRaJoinPermissionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryLoRaJoinPermissions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryLoRaJoinPermissionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryLoRaJoinPermissionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryMessageInfo  QueryMessageInfoRequest
     * @return QueryMessageInfoResponse
     */
    @Override
    public CompletableFuture<QueryMessageInfoResponse> queryMessageInfo(QueryMessageInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryMessageInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryMessageInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryMessageInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 20 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryOTAFirmware  QueryOTAFirmwareRequest
     * @return QueryOTAFirmwareResponse
     */
    @Override
    public CompletableFuture<QueryOTAFirmwareResponse> queryOTAFirmware(QueryOTAFirmwareRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryOTAFirmware").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryOTAFirmwareResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryOTAFirmwareResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>After you call the <a href="https://help.aliyun.com/document_detail/147480.html">CreateOTAVerifyJob</a>, <a href="https://help.aliyun.com/document_detail/147496.html">CreateOTAStaticUpgradeJob</a>, or <a href="https://help.aliyun.com/document_detail/147887.html">CreateOTADynamicUpgradeJob</a> API operation to create an update batch, the <strong>JobId</strong> parameter is returned. You can use this parameter to query the details of the update batch.</p>
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS). </p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryOTAJob  QueryOTAJobRequest
     * @return QueryOTAJobResponse
     */
    @Override
    public CompletableFuture<QueryOTAJobResponse> queryOTAJob(QueryOTAJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryOTAJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryOTAJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryOTAJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryPageByApplyId  QueryPageByApplyIdRequest
     * @return QueryPageByApplyIdResponse
     */
    @Override
    public CompletableFuture<QueryPageByApplyIdResponse> queryPageByApplyId(QueryPageByApplyIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryPageByApplyId").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryPageByApplyIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryPageByApplyIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryProduct  QueryProductRequest
     * @return QueryProductResponse
     */
    @Override
    public CompletableFuture<QueryProductResponse> queryProduct(QueryProductRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryProduct").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryProductResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryProductResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 30 times per second per account.</p>
     * <blockquote>
     * <p>The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryProductCertInfo  QueryProductCertInfoRequest
     * @return QueryProductCertInfoResponse
     */
    @Override
    public CompletableFuture<QueryProductCertInfoResponse> queryProductCertInfo(QueryProductCertInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryProductCertInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryProductCertInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryProductCertInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <ul>
     * <li>Each Alibaba Cloud account can run up to 50 queries per second (QPS).<blockquote>
     * <p>The RAM users of an Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * </li>
     * <li>If the product of the value of the <strong>CurrentPage</strong> parameter and the value of the <strong>PageSize</strong> parameter is greater than or equal to 100,000, the QPS of this operation decreases.
     * In this case, each Alibaba Cloud account can run up to 2 QPS.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryProductList  QueryProductListRequest
     * @return QueryProductListResponse
     */
    @Override
    public CompletableFuture<QueryProductListResponse> queryProductList(QueryProductListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryProductList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryProductListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryProductListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 3 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryProductTopic  QueryProductTopicRequest
     * @return QueryProductTopicResponse
     */
    @Override
    public CompletableFuture<QueryProductTopicResponse> queryProductTopic(QueryProductTopicRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryProductTopic").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryProductTopicResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryProductTopicResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to three times per second per account.</p>
     * <blockquote>
     * <p>The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryProjectShareDeviceList  QueryProjectShareDeviceListRequest
     * @return QueryProjectShareDeviceListResponse
     */
    @Override
    public CompletableFuture<QueryProjectShareDeviceListResponse> queryProjectShareDeviceList(QueryProjectShareDeviceListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryProjectShareDeviceList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryProjectShareDeviceListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryProjectShareDeviceListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QuerySceneRule  QuerySceneRuleRequest
     * @return QuerySceneRuleResponse
     */
    @Override
    public CompletableFuture<QuerySceneRuleResponse> querySceneRule(QuerySceneRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QuerySceneRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySceneRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySceneRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QuerySchedulePeriodList  QuerySchedulePeriodListRequest
     * @return QuerySchedulePeriodListResponse
     */
    @Override
    public CompletableFuture<QuerySchedulePeriodListResponse> querySchedulePeriodList(QuerySchedulePeriodListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QuerySchedulePeriodList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySchedulePeriodListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySchedulePeriodListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryShareProductNameByProductKey  QueryShareProductNameByProductKeyRequest
     * @return QueryShareProductNameByProductKeyResponse
     */
    @Override
    public CompletableFuture<QueryShareProductNameByProductKeyResponse> queryShareProductNameByProductKey(QueryShareProductNameByProductKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryShareProductNameByProductKey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryShareProductNameByProductKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryShareProductNameByProductKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QuerySharePromotionActivityAuditResult  QuerySharePromotionActivityAuditResultRequest
     * @return QuerySharePromotionActivityAuditResultResponse
     */
    @Override
    public CompletableFuture<QuerySharePromotionActivityAuditResultResponse> querySharePromotionActivityAuditResult(QuerySharePromotionActivityAuditResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QuerySharePromotionActivityAuditResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySharePromotionActivityAuditResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySharePromotionActivityAuditResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to three times per second per account.</p>
     * <blockquote>
     * <p>The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryShareTaskDeviceList  QueryShareTaskDeviceListRequest
     * @return QueryShareTaskDeviceListResponse
     */
    @Override
    public CompletableFuture<QueryShareTaskDeviceListResponse> queryShareTaskDeviceList(QueryShareTaskDeviceListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryShareTaskDeviceList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryShareTaskDeviceListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryShareTaskDeviceListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QuerySolutionDeviceGroupPage  QuerySolutionDeviceGroupPageRequest
     * @return QuerySolutionDeviceGroupPageResponse
     */
    @Override
    public CompletableFuture<QuerySolutionDeviceGroupPageResponse> querySolutionDeviceGroupPage(QuerySolutionDeviceGroupPageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QuerySolutionDeviceGroupPage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySolutionDeviceGroupPageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySolutionDeviceGroupPageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QuerySoundCodeLabelBatchFailedResult  QuerySoundCodeLabelBatchFailedResultRequest
     * @return QuerySoundCodeLabelBatchFailedResultResponse
     */
    @Override
    public CompletableFuture<QuerySoundCodeLabelBatchFailedResultResponse> querySoundCodeLabelBatchFailedResult(QuerySoundCodeLabelBatchFailedResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QuerySoundCodeLabelBatchFailedResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySoundCodeLabelBatchFailedResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySoundCodeLabelBatchFailedResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QuerySoundCodeLabelBatchList  QuerySoundCodeLabelBatchListRequest
     * @return QuerySoundCodeLabelBatchListResponse
     */
    @Override
    public CompletableFuture<QuerySoundCodeLabelBatchListResponse> querySoundCodeLabelBatchList(QuerySoundCodeLabelBatchListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QuerySoundCodeLabelBatchList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySoundCodeLabelBatchListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySoundCodeLabelBatchListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QuerySoundCodeLabelList  QuerySoundCodeLabelListRequest
     * @return QuerySoundCodeLabelListResponse
     */
    @Override
    public CompletableFuture<QuerySoundCodeLabelListResponse> querySoundCodeLabelList(QuerySoundCodeLabelListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QuerySoundCodeLabelList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySoundCodeLabelListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySoundCodeLabelListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QuerySoundCodeList  QuerySoundCodeListRequest
     * @return QuerySoundCodeListResponse
     */
    @Override
    public CompletableFuture<QuerySoundCodeListResponse> querySoundCodeList(QuerySoundCodeListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QuerySoundCodeList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySoundCodeListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySoundCodeListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QuerySoundCodeScheduleList  QuerySoundCodeScheduleListRequest
     * @return QuerySoundCodeScheduleListResponse
     */
    @Override
    public CompletableFuture<QuerySoundCodeScheduleListResponse> querySoundCodeScheduleList(QuerySoundCodeScheduleListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QuerySoundCodeScheduleList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySoundCodeScheduleListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySoundCodeScheduleListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QuerySpeech  QuerySpeechRequest
     * @return QuerySpeechResponse
     */
    @Override
    public CompletableFuture<QuerySpeechResponse> querySpeech(QuerySpeechRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QuerySpeech").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySpeechResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySpeechResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QuerySpeechDevice  QuerySpeechDeviceRequest
     * @return QuerySpeechDeviceResponse
     */
    @Override
    public CompletableFuture<QuerySpeechDeviceResponse> querySpeechDevice(QuerySpeechDeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QuerySpeechDevice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySpeechDeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySpeechDeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QuerySpeechLicenseAvailableQuota  QuerySpeechLicenseAvailableQuotaRequest
     * @return QuerySpeechLicenseAvailableQuotaResponse
     */
    @Override
    public CompletableFuture<QuerySpeechLicenseAvailableQuotaResponse> querySpeechLicenseAvailableQuota(QuerySpeechLicenseAvailableQuotaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QuerySpeechLicenseAvailableQuota").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySpeechLicenseAvailableQuotaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySpeechLicenseAvailableQuotaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to three times per second per account.</p>
     * <blockquote>
     * <p>The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QuerySpeechLicenseDeviceList  QuerySpeechLicenseDeviceListRequest
     * @return QuerySpeechLicenseDeviceListResponse
     */
    @Override
    public CompletableFuture<QuerySpeechLicenseDeviceListResponse> querySpeechLicenseDeviceList(QuerySpeechLicenseDeviceListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QuerySpeechLicenseDeviceList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySpeechLicenseDeviceListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySpeechLicenseDeviceListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QuerySpeechList  QuerySpeechListRequest
     * @return QuerySpeechListResponse
     */
    @Override
    public CompletableFuture<QuerySpeechListResponse> querySpeechList(QuerySpeechListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QuerySpeechList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySpeechListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySpeechListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QuerySpeechPushJob  QuerySpeechPushJobRequest
     * @return QuerySpeechPushJobResponse
     */
    @Override
    public CompletableFuture<QuerySpeechPushJobResponse> querySpeechPushJob(QuerySpeechPushJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QuerySpeechPushJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySpeechPushJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySpeechPushJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QuerySpeechPushJobDevice  QuerySpeechPushJobDeviceRequest
     * @return QuerySpeechPushJobDeviceResponse
     */
    @Override
    public CompletableFuture<QuerySpeechPushJobDeviceResponse> querySpeechPushJobDevice(QuerySpeechPushJobDeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QuerySpeechPushJobDevice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySpeechPushJobDeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySpeechPushJobDeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QuerySpeechPushJobSpeech  QuerySpeechPushJobSpeechRequest
     * @return QuerySpeechPushJobSpeechResponse
     */
    @Override
    public CompletableFuture<QuerySpeechPushJobSpeechResponse> querySpeechPushJobSpeech(QuerySpeechPushJobSpeechRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QuerySpeechPushJobSpeech").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySpeechPushJobSpeechResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySpeechPushJobSpeechResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryStudioAppDomainListOpen  QueryStudioAppDomainListOpenRequest
     * @return QueryStudioAppDomainListOpenResponse
     */
    @Override
    public CompletableFuture<QueryStudioAppDomainListOpenResponse> queryStudioAppDomainListOpen(QueryStudioAppDomainListOpenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryStudioAppDomainListOpen").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryStudioAppDomainListOpenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryStudioAppDomainListOpenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryStudioAppList  QueryStudioAppListRequest
     * @return QueryStudioAppListResponse
     */
    @Override
    public CompletableFuture<QueryStudioAppListResponse> queryStudioAppList(QueryStudioAppListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryStudioAppList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryStudioAppListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryStudioAppListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryStudioAppPageListOpen  QueryStudioAppPageListOpenRequest
     * @return QueryStudioAppPageListOpenResponse
     */
    @Override
    public CompletableFuture<QueryStudioAppPageListOpenResponse> queryStudioAppPageListOpen(QueryStudioAppPageListOpenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryStudioAppPageListOpen").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryStudioAppPageListOpenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryStudioAppPageListOpenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryStudioProjectList  QueryStudioProjectListRequest
     * @return QueryStudioProjectListResponse
     */
    @Override
    public CompletableFuture<QueryStudioProjectListResponse> queryStudioProjectList(QueryStudioProjectListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryStudioProjectList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryStudioProjectListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryStudioProjectListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 5 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QuerySubscribeRelation  QuerySubscribeRelationRequest
     * @return QuerySubscribeRelationResponse
     */
    @Override
    public CompletableFuture<QuerySubscribeRelationResponse> querySubscribeRelation(QuerySubscribeRelationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QuerySubscribeRelation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySubscribeRelationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySubscribeRelationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QuerySummarySceneRuleLog  QuerySummarySceneRuleLogRequest
     * @return QuerySummarySceneRuleLogResponse
     */
    @Override
    public CompletableFuture<QuerySummarySceneRuleLogResponse> querySummarySceneRuleLog(QuerySummarySceneRuleLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QuerySummarySceneRuleLog").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySummarySceneRuleLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySummarySceneRuleLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QuerySuperDeviceGroup  QuerySuperDeviceGroupRequest
     * @return QuerySuperDeviceGroupResponse
     */
    @Override
    public CompletableFuture<QuerySuperDeviceGroupResponse> querySuperDeviceGroup(QuerySuperDeviceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QuerySuperDeviceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySuperDeviceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySuperDeviceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryTask  QueryTaskRequest
     * @return QueryTaskResponse
     */
    @Override
    public CompletableFuture<QueryTaskResponse> queryTask(QueryTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>TSL features include properties, services, and events.
     * If you add custom modules to a TSL model and the value of the <strong>FunctionBlockId</strong> parameter is empty, you can obtain the TSL features of each custom module. If the value of the FunctionBlockId parameter is not empty, you can obtain the TSL features of a specified custom module.
     * For more information about the data format of the <strong>ThingModelJson</strong> parameter, see <a href="https://help.aliyun.com/document_detail/150457.html">Data structure of ThingModelJson</a>.</p>
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS). </p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryThingModel  QueryThingModelRequest
     * @return QueryThingModelResponse
     */
    @Override
    public CompletableFuture<QueryThingModelResponse> queryThingModel(QueryThingModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryThingModel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryThingModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryThingModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 20 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryThingModelExtendConfig  QueryThingModelExtendConfigRequest
     * @return QueryThingModelExtendConfigResponse
     */
    @Override
    public CompletableFuture<QueryThingModelExtendConfigResponse> queryThingModelExtendConfig(QueryThingModelExtendConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryThingModelExtendConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryThingModelExtendConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryThingModelExtendConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 20 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryThingModelExtendConfigPublished  QueryThingModelExtendConfigPublishedRequest
     * @return QueryThingModelExtendConfigPublishedResponse
     */
    @Override
    public CompletableFuture<QueryThingModelExtendConfigPublishedResponse> queryThingModelExtendConfigPublished(QueryThingModelExtendConfigPublishedRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryThingModelExtendConfigPublished").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryThingModelExtendConfigPublishedResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryThingModelExtendConfigPublishedResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryThingModelPublished  QueryThingModelPublishedRequest
     * @return QueryThingModelPublishedResponse
     */
    @Override
    public CompletableFuture<QueryThingModelPublishedResponse> queryThingModelPublished(QueryThingModelPublishedRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryThingModelPublished").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryThingModelPublishedResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryThingModelPublishedResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryTopicConfig  QueryTopicConfigRequest
     * @return QueryTopicConfigResponse
     */
    @Override
    public CompletableFuture<QueryTopicConfigResponse> queryTopicConfig(QueryTopicConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryTopicConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryTopicConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryTopicConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>In addition to the preceding operation-specific request parameters, you must specify common request parameters when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/30561.html">Common request parameters</a>.</p>
     * 
     * @param request the request parameters of QueryTopicReverseRouteTable  QueryTopicReverseRouteTableRequest
     * @return QueryTopicReverseRouteTableResponse
     */
    @Override
    public CompletableFuture<QueryTopicReverseRouteTableResponse> queryTopicReverseRouteTable(QueryTopicReverseRouteTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryTopicReverseRouteTable").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryTopicReverseRouteTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryTopicReverseRouteTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryTopicRouteTable  QueryTopicRouteTableRequest
     * @return QueryTopicRouteTableResponse
     */
    @Override
    public CompletableFuture<QueryTopicRouteTableResponse> queryTopicRouteTable(QueryTopicRouteTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryTopicRouteTable").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryTopicRouteTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryTopicRouteTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query the information about a device of a JT/T 808 gateway product.</p>
     * <ul>
     * <li>When you call this operation, you must specify a <strong>ProductKey</strong> and a <strong>DeviceName</strong>. Otherwise, the call fails.</li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 50 times per second per account. </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryVehicleDevice  QueryVehicleDeviceRequest
     * @return QueryVehicleDeviceResponse
     */
    @Override
    public CompletableFuture<QueryVehicleDeviceResponse> queryVehicleDevice(QueryVehicleDeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryVehicleDevice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryVehicleDeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryVehicleDeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If the device fails to send a response within the timeout period after you call the operation, IoT Platform considers that the call fails even if the device receives the message. The timeout period is specified by the <strong>Timeout</strong> parameter.</p>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 1000 queries per second (QPS). </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of RRpc  RRpcRequest
     * @return RRpcResponse
     */
    @Override
    public CompletableFuture<RRpcResponse> rRpc(RRpcRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RRpc").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RRpcResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RRpcResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to five times per second per account.</p>
     * <blockquote>
     * <p>The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ReBindLicenseDevice  ReBindLicenseDeviceRequest
     * @return ReBindLicenseDeviceResponse
     */
    @Override
    public CompletableFuture<ReBindLicenseDeviceResponse> reBindLicenseDevice(ReBindLicenseDeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReBindLicenseDevice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReBindLicenseDeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReBindLicenseDeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RefreshDeviceTunnelSharePassword  RefreshDeviceTunnelSharePasswordRequest
     * @return RefreshDeviceTunnelSharePasswordResponse
     */
    @Override
    public CompletableFuture<RefreshDeviceTunnelSharePasswordResponse> refreshDeviceTunnelSharePassword(RefreshDeviceTunnelSharePasswordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RefreshDeviceTunnelSharePassword").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RefreshDeviceTunnelSharePasswordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RefreshDeviceTunnelSharePasswordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RefreshStudioAppTokenOpen  RefreshStudioAppTokenOpenRequest
     * @return RefreshStudioAppTokenOpenResponse
     */
    @Override
    public CompletableFuture<RefreshStudioAppTokenOpenResponse> refreshStudioAppTokenOpen(RefreshStudioAppTokenOpenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RefreshStudioAppTokenOpen").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RefreshStudioAppTokenOpenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RefreshStudioAppTokenOpenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If you call this operation to register a device under a product, the device is added to the product in the IoT Platform console. After the device is registered, IoT Platform issues the IotId parameter to the device. This parameter is a globally unique identifier (GUID) of the device. To perform operations on a device, you must use the IotId parameter to identify the device.
     * You can also use a combination of the ProductKey and DeviceName parameters to identify a device. A ProductKey is issued by IoT Platform to a product when you create the product. A DeviceName is specified or randomly generated when you create a device. The IotId parameter has a higher priority than a combination of the ProductKey and DeviceName parameters.
     * For information about how to register multiple devices under a product at the same time, see <a href="https://help.aliyun.com/document_detail/69514.html">BatchRegisterDeviceWithApplyId</a>.</p>
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 30 queries per second (QPS). </p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of RegisterDevice  RegisterDeviceRequest
     * @return RegisterDeviceResponse
     */
    @Override
    public CompletableFuture<RegisterDeviceResponse> registerDevice(RegisterDeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RegisterDevice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RegisterDeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RegisterDeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ReleaseEdgeDriverVersion  ReleaseEdgeDriverVersionRequest
     * @return ReleaseEdgeDriverVersionResponse
     */
    @Override
    public CompletableFuture<ReleaseEdgeDriverVersionResponse> releaseEdgeDriverVersion(ReleaseEdgeDriverVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReleaseEdgeDriverVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReleaseEdgeDriverVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReleaseEdgeDriverVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  After a product is published, you cannot call the <a href="https://help.aliyun.com/document_detail/150323.html">CreateThingModel</a>, <a href="https://help.aliyun.com/document_detail/151240.html">UpdateThingModel</a>, <a href="https://help.aliyun.com/document_detail/150320.html">ImportThingModelTSL</a>, <a href="https://help.aliyun.com/document_detail/150311.html">PublishThingModel</a>, <a href="https://help.aliyun.com/document_detail/150312.html">DeleteThingModel</a>, or <a href="https://help.aliyun.com/document_detail/150322.html">CopyThingModel</a> operation to edit the Thing Specification Language (TSL) model of the product. To edit the TSL model, you must call the <a href="https://help.aliyun.com/document_detail/213875.html">CancelReleaseProduct</a> operation to unpublish the product.</p>
     * <ul>
     * <li>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ReleaseProduct  ReleaseProductRequest
     * @return ReleaseProductResponse
     */
    @Override
    public CompletableFuture<ReleaseProductResponse> releaseProduct(ReleaseProductRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReleaseProduct").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReleaseProductResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReleaseProductResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  If you specify a gateway, this operation removes the topological relationships between the gateway and all attached sub-devices.</p>
     * <ul>
     * <li>If you specify a sub-device, this operation removes the topological relationship between the sub-device and the gateway to which the sub-device is attached.</li>
     * </ul>
     * <h1>QPS limits</h1>
     * <p>Each Alibaba Cloud account can run up to 500 queries per second (QPS). </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of RemoveThingTopo  RemoveThingTopoRequest
     * @return RemoveThingTopoResponse
     */
    @Override
    public CompletableFuture<RemoveThingTopoResponse> removeThingTopo(RemoveThingTopoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveThingTopo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveThingTopoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveThingTopoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ReplaceEdgeInstanceGateway  ReplaceEdgeInstanceGatewayRequest
     * @return ReplaceEdgeInstanceGatewayResponse
     */
    @Override
    public CompletableFuture<ReplaceEdgeInstanceGatewayResponse> replaceEdgeInstanceGateway(ReplaceEdgeInstanceGatewayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReplaceEdgeInstanceGateway").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReplaceEdgeInstanceGatewayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReplaceEdgeInstanceGatewayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RerunJob  RerunJobRequest
     * @return RerunJobResponse
     */
    @Override
    public CompletableFuture<RerunJobResponse> rerunJob(RerunJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RerunJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RerunJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RerunJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 5 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ResetConsumerGroupPosition  ResetConsumerGroupPositionRequest
     * @return ResetConsumerGroupPositionResponse
     */
    @Override
    public CompletableFuture<ResetConsumerGroupPositionResponse> resetConsumerGroupPosition(ResetConsumerGroupPositionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResetConsumerGroupPosition").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResetConsumerGroupPositionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResetConsumerGroupPositionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ResetDeviceTimeline  ResetDeviceTimelineRequest
     * @return ResetDeviceTimelineResponse
     */
    @Override
    public CompletableFuture<ResetDeviceTimelineResponse> resetDeviceTimeline(ResetDeviceTimelineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResetDeviceTimeline").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResetDeviceTimelineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResetDeviceTimelineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  After you use dynamic registration to obtain the device certificate information of a directly connected device and activate the device, you can call this operation to reset the dynamic registration status of the status to unregistered in the IoT Platform console. Then, you can use dynamic registration again to obtain the device certificate information. The device certificate information includes ProductKey, DeviceName, and DeviceSecret.</p>
     * <blockquote>
     * <p>This operation is called to reset the dynamic registration status instead of activation status of a device. After you call the operation to reset the dynamic registration status of a device, the status of the device in the IoT Platform console is not reset to inactive.</p>
     * </blockquote>
     * <ul>
     * <li>If you specify a gateway and the number of sub-devices that belong to the gateway exceeds 2,000, you can call this operation to create a device job to delete the topological relationships in an asynchronous manner. The operation returns the <strong>JobId</strong> parameter.</li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 500 queries per second (QPS). </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ResetThing  ResetThingRequest
     * @return ResetThingResponse
     */
    @Override
    public CompletableFuture<ResetThingResponse> resetThing(ResetThingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResetThing").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResetThingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResetThingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RetrySoundCodeLabelBatch  RetrySoundCodeLabelBatchRequest
     * @return RetrySoundCodeLabelBatchResponse
     */
    @Override
    public CompletableFuture<RetrySoundCodeLabelBatchResponse> retrySoundCodeLabelBatch(RetrySoundCodeLabelBatchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RetrySoundCodeLabelBatch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RetrySoundCodeLabelBatchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RetrySoundCodeLabelBatchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If the update task requires confirmation, you must make sure that it has been confirmed before you call this operation. You can call the <a href="https://help.aliyun.com/document_detail/254666.html">ConfirmOTATask</a> operation to confirm update tasks.</p>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 20 queries per second (QPS). </p>
     * <blockquote>
     * <p> The Resource Access Management (RAM) users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ReupgradeOTATask  ReupgradeOTATaskRequest
     * @return ReupgradeOTATaskResponse
     */
    @Override
    public CompletableFuture<ReupgradeOTATaskResponse> reupgradeOTATask(ReupgradeOTATaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReupgradeOTATask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReupgradeOTATaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReupgradeOTATaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  A device can have a maximum of 100 tags.</p>
     * <ul>
     * <li>You can modify or add a maximum of 100 tags at a time.</li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 50 queries per second (QPS). </p>
     * <blockquote>
     * <p> The Resource Access Management (RAM) users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of SaveDeviceProp  SaveDevicePropRequest
     * @return SaveDevicePropResponse
     */
    @Override
    public CompletableFuture<SaveDevicePropResponse> saveDeviceProp(SaveDevicePropRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveDeviceProp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveDevicePropResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveDevicePropResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveScript  SaveScriptRequest
     * @return SaveScriptResponse
     */
    @Override
    public CompletableFuture<SaveScriptResponse> saveScript(SaveScriptRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveScript").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveScriptResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveScriptResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You cannot query the desired values of read-only properties.</p>
     * <ul>
     * <li>You can specify up to 10 desired property values in a call.</li>
     * <li>After a device is created, the value of the <strong>Version</strong> parameter is 0. If you want to configure the <strong>Version</strong> parameter the first time you specify a desired property value, set the <strong>Version</strong> parameter to 0.<blockquote>
     * <p>If the Thing Specification Language (TSL) data is of the float or double type, the parameter values that correspond to the TSL data contain at least one decimal place. Examples: 10.0 and 11.1.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 50 queries per second (QPS). </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of SetDeviceDesiredProperty  SetDeviceDesiredPropertyRequest
     * @return SetDeviceDesiredPropertyResponse
     */
    @Override
    public CompletableFuture<SetDeviceDesiredPropertyResponse> setDeviceDesiredProperty(SetDeviceDesiredPropertyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetDeviceDesiredProperty").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetDeviceDesiredPropertyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetDeviceDesiredPropertyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>A device group can have a maximum of 100 tags.</p>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 50 queries per second (QPS). </p>
     * <blockquote>
     * <p> The Resource Access Management (RAM) users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of SetDeviceGroupTags  SetDeviceGroupTagsRequest
     * @return SetDeviceGroupTagsResponse
     */
    @Override
    public CompletableFuture<SetDeviceGroupTagsResponse> setDeviceGroupTags(SetDeviceGroupTagsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetDeviceGroupTags").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetDeviceGroupTagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetDeviceGroupTagsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>After IoT Platform sends a request to configure device properties, the device receives and processes the request in an asynchronous manner. When you call this operation, a successful response indicates that IoT Platform sent a request. The response does not indicate that the device received and processed the request. After the device SDK responds to the request, the device properties are configured.</p>
     * <blockquote>
     * <p>If the Thing Specification Language (TSL) data is of the float or double type, the parameter values that correspond to the TSL data contain at least one decimal place. Examples: 10.0 and 11.1.</p>
     * </blockquote>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 500 queries per second (QPS). </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of SetDeviceProperty  SetDevicePropertyRequest
     * @return SetDevicePropertyResponse
     */
    @Override
    public CompletableFuture<SetDevicePropertyResponse> setDeviceProperty(SetDevicePropertyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetDeviceProperty").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetDevicePropertyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetDevicePropertyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If the Thing Specification Language (TSL) data is of the float or double type, the parameter values that correspond to the TSL data contain at least one decimal place. Examples: 10.0 and 11.1.</p>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 10 queries per second (QPS). </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of SetDevicesProperty  SetDevicesPropertyRequest
     * @return SetDevicesPropertyResponse
     */
    @Override
    public CompletableFuture<SetDevicesPropertyResponse> setDevicesProperty(SetDevicesPropertyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetDevicesProperty").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetDevicesPropertyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetDevicesPropertyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetEdgeInstanceDriverConfigs  SetEdgeInstanceDriverConfigsRequest
     * @return SetEdgeInstanceDriverConfigsResponse
     */
    @Override
    public CompletableFuture<SetEdgeInstanceDriverConfigsResponse> setEdgeInstanceDriverConfigs(SetEdgeInstanceDriverConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetEdgeInstanceDriverConfigs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetEdgeInstanceDriverConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetEdgeInstanceDriverConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 30 times per second per account.</p>
     * <blockquote>
     * <p>The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of SetProductCertInfo  SetProductCertInfoRequest
     * @return SetProductCertInfoResponse
     */
    @Override
    public CompletableFuture<SetProductCertInfoResponse> setProductCertInfo(SetProductCertInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetProductCertInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetProductCertInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetProductCertInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetStudioProjectCooperation  SetStudioProjectCooperationRequest
     * @return SetStudioProjectCooperationResponse
     */
    @Override
    public CompletableFuture<SetStudioProjectCooperationResponse> setStudioProjectCooperation(SetStudioProjectCooperationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetStudioProjectCooperation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetStudioProjectCooperationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetStudioProjectCooperationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetupStudioAppAuthModeOpen  SetupStudioAppAuthModeOpenRequest
     * @return SetupStudioAppAuthModeOpenResponse
     */
    @Override
    public CompletableFuture<SetupStudioAppAuthModeOpenResponse> setupStudioAppAuthModeOpen(SetupStudioAppAuthModeOpenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetupStudioAppAuthModeOpen").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetupStudioAppAuthModeOpenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetupStudioAppAuthModeOpenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 50 times per second per account.</p>
     * <blockquote>
     * <p>The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ShareSpeechByCombination  ShareSpeechByCombinationRequest
     * @return ShareSpeechByCombinationResponse
     */
    @Override
    public CompletableFuture<ShareSpeechByCombinationResponse> shareSpeechByCombination(ShareSpeechByCombinationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ShareSpeechByCombination").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ShareSpeechByCombinationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ShareSpeechByCombinationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SpeechByCombination  SpeechByCombinationRequest
     * @return SpeechByCombinationResponse
     */
    @Override
    public CompletableFuture<SpeechByCombinationResponse> speechByCombination(SpeechByCombinationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SpeechByCombination").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SpeechByCombinationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SpeechByCombinationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SpeechBySynthesis  SpeechBySynthesisRequest
     * @return SpeechBySynthesisResponse
     */
    @Override
    public CompletableFuture<SpeechBySynthesisResponse> speechBySynthesis(SpeechBySynthesisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SpeechBySynthesis").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SpeechBySynthesisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SpeechBySynthesisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartPTDetection  StartPTDetectionRequest
     * @return StartPTDetectionResponse
     */
    @Override
    public CompletableFuture<StartPTDetectionResponse> startPTDetection(StartPTDetectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartPTDetection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartPTDetectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartPTDetectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartParser  StartParserRequest
     * @return StartParserResponse
     */
    @Override
    public CompletableFuture<StartParserResponse> startParser(StartParserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartParser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartParserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartParserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>You must verify that the rule has SQL statements configured before you start the rule. If you do not set an SQL statement when you create the rule, call the <a href="https://help.aliyun.com/document_detail/69513.html">UpdateRule</a> operation to add an SQL statement and update the rule.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of StartRule  StartRuleRequest
     * @return StartRuleResponse
     */
    @Override
    public CompletableFuture<StartRuleResponse> startRule(StartRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopParser  StopParserRequest
     * @return StopParserResponse
     */
    @Override
    public CompletableFuture<StopParserResponse> stopParser(StopParserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopParser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopParserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopParserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of StopRule  StopRuleRequest
     * @return StopRuleResponse
     */
    @Override
    public CompletableFuture<StopRuleResponse> stopRule(StopRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  The device that needs to subscribe to topics must be connected to IoT Platform and online.</p>
     * <ul>
     * <li>You can call this operation to subscribe to the topics of a specified device. You can specify a maximum of 10 topics in a single call.</li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run up to 10 queries per second (QPS). </p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of SubscribeTopic  SubscribeTopicRequest
     * @return SubscribeTopicResponse
     */
    @Override
    public CompletableFuture<SubscribeTopicResponse> subscribeTopic(SubscribeTopicRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubscribeTopic").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubscribeTopicResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubscribeTopicResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SyncSpeechByCombination  SyncSpeechByCombinationRequest
     * @return SyncSpeechByCombinationResponse
     */
    @Override
    public CompletableFuture<SyncSpeechByCombinationResponse> syncSpeechByCombination(SyncSpeechByCombinationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SyncSpeechByCombination").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SyncSpeechByCombinationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SyncSpeechByCombinationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TestSpeech  TestSpeechRequest
     * @return TestSpeechResponse
     */
    @Override
    public CompletableFuture<TestSpeechResponse> testSpeech(TestSpeechRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TestSpeech").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TestSpeechResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TestSpeechResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TestSwitch  TestSwitchRequest
     * @return TestSwitchResponse
     */
    @Override
    public CompletableFuture<TestSwitchResponse> testSwitch(TestSwitchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TestSwitch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TestSwitchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TestSwitchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/371985.html">QueryClientIds</a> operation to view the ClientIDs of a device.</p>
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS). </p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of TransformClientId  TransformClientIdRequest
     * @return TransformClientIdResponse
     */
    @Override
    public CompletableFuture<TransformClientIdResponse> transformClientId(TransformClientIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TransformClientId").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TransformClientIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TransformClientIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TriggerSceneRule  TriggerSceneRuleRequest
     * @return TriggerSceneRuleResponse
     */
    @Override
    public CompletableFuture<TriggerSceneRuleResponse> triggerSceneRule(TriggerSceneRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TriggerSceneRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TriggerSceneRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TriggerSceneRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UnbindApplicationFromEdgeInstance  UnbindApplicationFromEdgeInstanceRequest
     * @return UnbindApplicationFromEdgeInstanceResponse
     */
    @Override
    public CompletableFuture<UnbindApplicationFromEdgeInstanceResponse> unbindApplicationFromEdgeInstance(UnbindApplicationFromEdgeInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnbindApplicationFromEdgeInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnbindApplicationFromEdgeInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnbindApplicationFromEdgeInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of five queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UnbindDriverFromEdgeInstance  UnbindDriverFromEdgeInstanceRequest
     * @return UnbindDriverFromEdgeInstanceResponse
     */
    @Override
    public CompletableFuture<UnbindDriverFromEdgeInstanceResponse> unbindDriverFromEdgeInstance(UnbindDriverFromEdgeInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnbindDriverFromEdgeInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnbindDriverFromEdgeInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnbindDriverFromEdgeInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>A license is bound with a product. For more information, see <a href="https://help.aliyun.com/document_detail/427956.html">BindLicenseProduct</a> or <a href="https://help.aliyun.com/document_detail/427937.html">Bind a license to a product</a>.</p>
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 10 times per second per account.</p>
     * <blockquote>
     * <p>The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UnbindLicenseProduct  UnbindLicenseProductRequest
     * @return UnbindLicenseProductResponse
     */
    @Override
    public CompletableFuture<UnbindLicenseProductResponse> unbindLicenseProduct(UnbindLicenseProductRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnbindLicenseProduct").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnbindLicenseProductResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnbindLicenseProductResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UnbindRoleFromEdgeInstance  UnbindRoleFromEdgeInstanceRequest
     * @return UnbindRoleFromEdgeInstanceResponse
     */
    @Override
    public CompletableFuture<UnbindRoleFromEdgeInstanceResponse> unbindRoleFromEdgeInstance(UnbindRoleFromEdgeInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnbindRoleFromEdgeInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnbindRoleFromEdgeInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnbindRoleFromEdgeInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UnbindSceneRuleFromEdgeInstance  UnbindSceneRuleFromEdgeInstanceRequest
     * @return UnbindSceneRuleFromEdgeInstanceResponse
     */
    @Override
    public CompletableFuture<UnbindSceneRuleFromEdgeInstanceResponse> unbindSceneRuleFromEdgeInstance(UnbindSceneRuleFromEdgeInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnbindSceneRuleFromEdgeInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnbindSceneRuleFromEdgeInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnbindSceneRuleFromEdgeInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UnsubscribeTopic  UnsubscribeTopicRequest
     * @return UnsubscribeTopicResponse
     */
    @Override
    public CompletableFuture<UnsubscribeTopicResponse> unsubscribeTopic(UnsubscribeTopicRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnsubscribeTopic").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnsubscribeTopicResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnsubscribeTopicResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>You cannot modify the default consumer group provided by IoT Platform.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 5 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of UpdateConsumerGroup  UpdateConsumerGroupRequest
     * @return UpdateConsumerGroupResponse
     */
    @Override
    public CompletableFuture<UpdateConsumerGroupResponse> updateConsumerGroup(UpdateConsumerGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateConsumerGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateConsumerGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateConsumerGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateDestination  UpdateDestinationRequest
     * @return UpdateDestinationResponse
     */
    @Override
    public CompletableFuture<UpdateDestinationResponse> updateDestination(UpdateDestinationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDestination").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDestinationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDestinationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateDeviceGroup  UpdateDeviceGroupRequest
     * @return UpdateDeviceGroupResponse
     */
    @Override
    public CompletableFuture<UpdateDeviceGroupResponse> updateDeviceGroup(UpdateDeviceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDeviceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDeviceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDeviceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 500 times per second per account.</p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateDeviceShadow  UpdateDeviceShadowRequest
     * @return UpdateDeviceShadowResponse
     */
    @Override
    public CompletableFuture<UpdateDeviceShadowResponse> updateDeviceShadow(UpdateDeviceShadowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDeviceShadow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDeviceShadowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDeviceShadowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>If a request parameter is not specified, the original value of the parameter will be cleared for the driver version.</li>
     * <li>You are not allowed to update a published driver version.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of UpdateEdgeDriverVersion  UpdateEdgeDriverVersionRequest
     * @return UpdateEdgeDriverVersionResponse
     */
    @Override
    public CompletableFuture<UpdateEdgeDriverVersionResponse> updateEdgeDriverVersion(UpdateEdgeDriverVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateEdgeDriverVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateEdgeDriverVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateEdgeDriverVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of five queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateEdgeInstance  UpdateEdgeInstanceRequest
     * @return UpdateEdgeInstanceResponse
     */
    @Override
    public CompletableFuture<UpdateEdgeInstanceResponse> updateEdgeInstance(UpdateEdgeInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateEdgeInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateEdgeInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateEdgeInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateEdgeInstanceChannel  UpdateEdgeInstanceChannelRequest
     * @return UpdateEdgeInstanceChannelResponse
     */
    @Override
    public CompletableFuture<UpdateEdgeInstanceChannelResponse> updateEdgeInstanceChannel(UpdateEdgeInstanceChannelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateEdgeInstanceChannel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateEdgeInstanceChannelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateEdgeInstanceChannelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateEdgeInstanceMessageRouting  UpdateEdgeInstanceMessageRoutingRequest
     * @return UpdateEdgeInstanceMessageRoutingResponse
     */
    @Override
    public CompletableFuture<UpdateEdgeInstanceMessageRoutingResponse> updateEdgeInstanceMessageRouting(UpdateEdgeInstanceMessageRoutingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateEdgeInstanceMessageRouting").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateEdgeInstanceMessageRoutingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateEdgeInstanceMessageRoutingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateJob  UpdateJobRequest
     * @return UpdateJobResponse
     */
    @Override
    public CompletableFuture<UpdateJobResponse> updateJob(UpdateJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateOTAJob  UpdateOTAJobRequest
     * @return UpdateOTAJobResponse
     */
    @Override
    public CompletableFuture<UpdateOTAJobResponse> updateOTAJob(UpdateOTAJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateOTAJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateOTAJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateOTAJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateOTAModule  UpdateOTAModuleRequest
     * @return UpdateOTAModuleResponse
     */
    @Override
    public CompletableFuture<UpdateOTAModuleResponse> updateOTAModule(UpdateOTAModuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateOTAModule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateOTAModuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateOTAModuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateParser  UpdateParserRequest
     * @return UpdateParserResponse
     */
    @Override
    public CompletableFuture<UpdateParserResponse> updateParser(UpdateParserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateParser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateParserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateParserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateParserDataSource  UpdateParserDataSourceRequest
     * @return UpdateParserDataSourceResponse
     */
    @Override
    public CompletableFuture<UpdateParserDataSourceResponse> updateParserDataSource(UpdateParserDataSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateParserDataSource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateParserDataSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateParserDataSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limits</h2>
     * <p>You can call this API operation up to 10 times per second per account.</p>
     * <blockquote>
     * <p> The RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateProduct  UpdateProductRequest
     * @return UpdateProductResponse
     */
    @Override
    public CompletableFuture<UpdateProductResponse> updateProduct(UpdateProductRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateProduct").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateProductResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateProductResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Message deduplication rules</h2>
     * <p>Based on the rules that you set, IoT Platform determines whether to use the rules engine or server-side subscriptions to forward property data that is submitted by devices to a specified destination.
     * The triggering conditions of rules are related by the logic AND relation. For example, if you set the PropertyValueFilter=true and PropertyTimestampFilter=true conditions, the rule to remove duplicate messages is triggered only when both of the conditions are met.</p>
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 5 queries per second (QPS). </p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateProductFilterConfig  UpdateProductFilterConfigRequest
     * @return UpdateProductFilterConfigResponse
     */
    @Override
    public CompletableFuture<UpdateProductFilterConfigResponse> updateProductFilterConfig(UpdateProductFilterConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateProductFilterConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateProductFilterConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateProductFilterConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can update a maximum of 10 tags in a single call.</p>
     * <blockquote>
     * <p>You must specify the tag keys and tag values. Otherwise, the call fails. For description about the tag values, see the &quot;<strong>Request parameters</strong>&quot; section of this topic.</p>
     * </blockquote>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 500 queries per second (QPS). </p>
     * <blockquote>
     * <p> The Resource Access Management (RAM) users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateProductTags  UpdateProductTagsRequest
     * @return UpdateProductTagsResponse
     */
    @Override
    public CompletableFuture<UpdateProductTagsResponse> updateProductTags(UpdateProductTagsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateProductTags").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateProductTagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateProductTagsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateProductTopic  UpdateProductTopicRequest
     * @return UpdateProductTopicResponse
     */
    @Override
    public CompletableFuture<UpdateProductTopicResponse> updateProductTopic(UpdateProductTopicRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateProductTopic").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateProductTopicResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateProductTopicResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateRule  UpdateRuleRequest
     * @return UpdateRuleResponse
     */
    @Override
    public CompletableFuture<UpdateRuleResponse> updateRule(UpdateRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 50 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateRuleAction  UpdateRuleActionRequest
     * @return UpdateRuleActionResponse
     */
    @Override
    public CompletableFuture<UpdateRuleActionResponse> updateRuleAction(UpdateRuleActionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateRuleAction").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateRuleActionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateRuleActionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateSceneRule  UpdateSceneRuleRequest
     * @return UpdateSceneRuleResponse
     */
    @Override
    public CompletableFuture<UpdateSceneRuleResponse> updateSceneRule(UpdateSceneRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateSceneRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSceneRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSceneRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateSchedulePeriod  UpdateSchedulePeriodRequest
     * @return UpdateSchedulePeriodResponse
     */
    @Override
    public CompletableFuture<UpdateSchedulePeriodResponse> updateSchedulePeriod(UpdateSchedulePeriodRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateSchedulePeriod").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSchedulePeriodResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSchedulePeriodResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateSoundCode  UpdateSoundCodeRequest
     * @return UpdateSoundCodeResponse
     */
    @Override
    public CompletableFuture<UpdateSoundCodeResponse> updateSoundCode(UpdateSoundCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateSoundCode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSoundCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSoundCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateSoundCodeLabel  UpdateSoundCodeLabelRequest
     * @return UpdateSoundCodeLabelResponse
     */
    @Override
    public CompletableFuture<UpdateSoundCodeLabelResponse> updateSoundCodeLabel(UpdateSoundCodeLabelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateSoundCodeLabel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSoundCodeLabelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSoundCodeLabelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateSoundCodeSchedule  UpdateSoundCodeScheduleRequest
     * @return UpdateSoundCodeScheduleResponse
     */
    @Override
    public CompletableFuture<UpdateSoundCodeScheduleResponse> updateSoundCodeSchedule(UpdateSoundCodeScheduleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateSoundCodeSchedule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSoundCodeScheduleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSoundCodeScheduleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateSpeech  UpdateSpeechRequest
     * @return UpdateSpeechResponse
     */
    @Override
    public CompletableFuture<UpdateSpeechResponse> updateSpeech(UpdateSpeechRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateSpeech").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSpeechResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSpeechResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Each Alibaba Cloud account can run a maximum of 5 queries per second (QPS).</p>
     * <blockquote>
     * <p> RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateSubscribeRelation  UpdateSubscribeRelationRequest
     * @return UpdateSubscribeRelationResponse
     */
    @Override
    public CompletableFuture<UpdateSubscribeRelationResponse> updateSubscribeRelation(UpdateSubscribeRelationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateSubscribeRelation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSubscribeRelationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSubscribeRelationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <ul>
     * <li>If a product is published, you must call the <a href="https://help.aliyun.com/document_detail/213875.html">CancelReleaseProduct</a> operation to unpublish the product before you call this operation.</li>
     * <li>When you call this operation, you can use the <a href="https://github.com/everit-org/json-schema?spm=a2c4g.11186623.2.23.575832d9zD7fZb">json-schema</a> library to verify the input parameters in <strong>ThingModelJson</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/150457.html">Data structure of ThingModelJson</a>.</li>
     * <li>You can call this operation to update only one feature. TSL features include properties, services, and events.</li>
     * <li>Each Alibaba Cloud account can run a maximum of 5 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of UpdateThingModel  UpdateThingModelRequest
     * @return UpdateThingModelResponse
     */
    @Override
    public CompletableFuture<UpdateThingModelResponse> updateThingModel(UpdateThingModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateThingModel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateThingModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateThingModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  A data parsing script is used to convert the custom-formatted data to JSON data after the data is submitted by a device. You can write a script in JavaScript, Python 2.7, and PHP 7.2. For more information, see <a href="https://help.aliyun.com/document_detail/149963.html">Submit scripts for data parsing</a>.</p>
     * <ul>
     * <li>Each Alibaba Cloud account can run a maximum of 10 queries per second (QPS).<blockquote>
     * <p>RAM users of an Alibaba Cloud account share the quota of the account.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of UpdateThingScript  UpdateThingScriptRequest
     * @return UpdateThingScriptResponse
     */
    @Override
    public CompletableFuture<UpdateThingScriptResponse> updateThingScript(UpdateThingScriptRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateThingScript").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateThingScriptResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateThingScriptResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateTopicConfig  UpdateTopicConfigRequest
     * @return UpdateTopicConfigResponse
     */
    @Override
    public CompletableFuture<UpdateTopicConfigResponse> updateTopicConfig(UpdateTopicConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateTopicConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTopicConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTopicConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of WriteDevicesHotStorageData  WriteDevicesHotStorageDataRequest
     * @return WriteDevicesHotStorageDataResponse
     */
    @Override
    public CompletableFuture<WriteDevicesHotStorageDataResponse> writeDevicesHotStorageData(WriteDevicesHotStorageDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("WriteDevicesHotStorageData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(WriteDevicesHotStorageDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<WriteDevicesHotStorageDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
