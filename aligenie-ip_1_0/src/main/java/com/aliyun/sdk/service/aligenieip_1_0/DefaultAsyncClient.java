// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.aligenieip_1_0.models.*;
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
        this.product = "AliGenie";
        this.version = "ip_1.0";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AddCartoon  AddCartoonRequest
     * @return AddCartoonResponse
     */
    @Override
    public CompletableFuture<AddCartoonResponse> addCartoon(AddCartoonRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddCartoon").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/addCartoon").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddCartoonResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddCartoonResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddCustomQA  AddCustomQARequest
     * @return AddCustomQAResponse
     */
    @Override
    public CompletableFuture<AddCustomQAResponse> addCustomQA(AddCustomQARequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddCustomQA").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/addCustomQA").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddCustomQAResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddCustomQAResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddCustomQAV2  AddCustomQAV2Request
     * @return AddCustomQAV2Response
     */
    @Override
    public CompletableFuture<AddCustomQAV2Response> addCustomQAV2(AddCustomQAV2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddCustomQAV2").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/addQAV2").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddCustomQAV2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddCustomQAV2Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddMessageTemplate  AddMessageTemplateRequest
     * @return AddMessageTemplateResponse
     */
    @Override
    public CompletableFuture<AddMessageTemplateResponse> addMessageTemplate(AddMessageTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddMessageTemplate").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/addMessageTemplate").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddMessageTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddMessageTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddOrUpdateDisPlayModes  AddOrUpdateDisPlayModesRequest
     * @return AddOrUpdateDisPlayModesResponse
     */
    @Override
    public CompletableFuture<AddOrUpdateDisPlayModesResponse> addOrUpdateDisPlayModes(AddOrUpdateDisPlayModesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddOrUpdateDisPlayModes").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/addOrUpdateDisPlayModes").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddOrUpdateDisPlayModesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddOrUpdateDisPlayModesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddOrUpdateHotelSetting  AddOrUpdateHotelSettingRequest
     * @return AddOrUpdateHotelSettingResponse
     */
    @Override
    public CompletableFuture<AddOrUpdateHotelSettingResponse> addOrUpdateHotelSetting(AddOrUpdateHotelSettingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddOrUpdateHotelSetting").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/addOrUpdateHotelSetting").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddOrUpdateHotelSettingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddOrUpdateHotelSettingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddOrUpdateScreenSaver  AddOrUpdateScreenSaverRequest
     * @return AddOrUpdateScreenSaverResponse
     */
    @Override
    public CompletableFuture<AddOrUpdateScreenSaverResponse> addOrUpdateScreenSaver(AddOrUpdateScreenSaverRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddOrUpdateScreenSaver").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/addOrUpdateScreenSaver").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddOrUpdateScreenSaverResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddOrUpdateScreenSaverResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddOrUpdateWelcomeText  AddOrUpdateWelcomeTextRequest
     * @return AddOrUpdateWelcomeTextResponse
     */
    @Override
    public CompletableFuture<AddOrUpdateWelcomeTextResponse> addOrUpdateWelcomeText(AddOrUpdateWelcomeTextRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddOrUpdateWelcomeText").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/addOrUpdateWelcomeText").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddOrUpdateWelcomeTextResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddOrUpdateWelcomeTextResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AuditHotel  AuditHotelRequest
     * @return AuditHotelResponse
     */
    @Override
    public CompletableFuture<AuditHotelResponse> auditHotel(AuditHotelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AuditHotel").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/auditHotel").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AuditHotelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AuditHotelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchAddHotelRoom  BatchAddHotelRoomRequest
     * @return BatchAddHotelRoomResponse
     */
    @Override
    public CompletableFuture<BatchAddHotelRoomResponse> batchAddHotelRoom(BatchAddHotelRoomRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("BatchAddHotelRoom").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/batchAddHotelRoom").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchAddHotelRoomResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchAddHotelRoomResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchDeleteHotelRoom  BatchDeleteHotelRoomRequest
     * @return BatchDeleteHotelRoomResponse
     */
    @Override
    public CompletableFuture<BatchDeleteHotelRoomResponse> batchDeleteHotelRoom(BatchDeleteHotelRoomRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("BatchDeleteHotelRoom").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/batchDeleteHotelRoom").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchDeleteHotelRoomResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchDeleteHotelRoomResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CheckoutWithAK  CheckoutWithAKRequest
     * @return CheckoutWithAKResponse
     */
    @Override
    public CompletableFuture<CheckoutWithAKResponse> checkoutWithAK(CheckoutWithAKRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CheckoutWithAK").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/checkoutWithAK").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckoutWithAKResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckoutWithAKResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChildAccountAuth  ChildAccountAuthRequest
     * @return ChildAccountAuthResponse
     */
    @Override
    public CompletableFuture<ChildAccountAuthResponse> childAccountAuth(ChildAccountAuthRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ChildAccountAuth").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/childAccountAuth").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChildAccountAuthResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChildAccountAuthResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ControlRoomDevice  ControlRoomDeviceRequest
     * @return ControlRoomDeviceResponse
     */
    @Override
    public CompletableFuture<ControlRoomDeviceResponse> controlRoomDevice(ControlRoomDeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ControlRoomDevice").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/controlRoomDevice").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ControlRoomDeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ControlRoomDeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateHotel  CreateHotelRequest
     * @return CreateHotelResponse
     */
    @Override
    public CompletableFuture<CreateHotelResponse> createHotel(CreateHotelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateHotel").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/createHotel").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateHotelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateHotelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateHotelAlarm  CreateHotelAlarmRequest
     * @return CreateHotelAlarmResponse
     */
    @Override
    public CompletableFuture<CreateHotelAlarmResponse> createHotelAlarm(CreateHotelAlarmRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateHotelAlarm").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/createHotelAlarm").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateHotelAlarmResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateHotelAlarmResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateRcuScene  CreateRcuSceneRequest
     * @return CreateRcuSceneResponse
     */
    @Override
    public CompletableFuture<CreateRcuSceneResponse> createRcuScene(CreateRcuSceneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateRcuScene").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/createRcuScene").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRcuSceneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRcuSceneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteCartoon  DeleteCartoonRequest
     * @return DeleteCartoonResponse
     */
    @Override
    public CompletableFuture<DeleteCartoonResponse> deleteCartoon(DeleteCartoonRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteCartoon").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/deleteCartoon").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCartoonResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCartoonResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteCustomQA  DeleteCustomQARequest
     * @return DeleteCustomQAResponse
     */
    @Override
    public CompletableFuture<DeleteCustomQAResponse> deleteCustomQA(DeleteCustomQARequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteCustomQA").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/deleteCustomQA").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCustomQAResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCustomQAResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteHotelAlarm  DeleteHotelAlarmRequest
     * @return DeleteHotelAlarmResponse
     */
    @Override
    public CompletableFuture<DeleteHotelAlarmResponse> deleteHotelAlarm(DeleteHotelAlarmRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteHotelAlarm").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/deleteHotelAlarm").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteHotelAlarmResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteHotelAlarmResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteHotelSceneBookItem  DeleteHotelSceneBookItemRequest
     * @return DeleteHotelSceneBookItemResponse
     */
    @Override
    public CompletableFuture<DeleteHotelSceneBookItemResponse> deleteHotelSceneBookItem(DeleteHotelSceneBookItemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteHotelSceneBookItem").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/deleteHotelSceneBookItem").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteHotelSceneBookItemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteHotelSceneBookItemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteHotelSetting  DeleteHotelSettingRequest
     * @return DeleteHotelSettingResponse
     */
    @Override
    public CompletableFuture<DeleteHotelSettingResponse> deleteHotelSetting(DeleteHotelSettingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteHotelSetting").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/deleteHotelSetting").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteHotelSettingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteHotelSettingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMessageTemplate  DeleteMessageTemplateRequest
     * @return DeleteMessageTemplateResponse
     */
    @Override
    public CompletableFuture<DeleteMessageTemplateResponse> deleteMessageTemplate(DeleteMessageTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteMessageTemplate").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/deleteMessageTemplate").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMessageTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMessageTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteRcuScene  DeleteRcuSceneRequest
     * @return DeleteRcuSceneResponse
     */
    @Override
    public CompletableFuture<DeleteRcuSceneResponse> deleteRcuScene(DeleteRcuSceneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteRcuScene").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/deleteRcuScene").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRcuSceneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRcuSceneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeviceControl  DeviceControlRequest
     * @return DeviceControlResponse
     */
    @Override
    public CompletableFuture<DeviceControlResponse> deviceControl(DeviceControlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeviceControl").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/deviceControl").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeviceControlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeviceControlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExecuteScene  ExecuteSceneRequest
     * @return ExecuteSceneResponse
     */
    @Override
    public CompletableFuture<ExecuteSceneResponse> executeScene(ExecuteSceneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExecuteScene").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/executeScene").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExecuteSceneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExecuteSceneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetBasicInfoQA  GetBasicInfoQARequest
     * @return GetBasicInfoQAResponse
     */
    @Override
    public CompletableFuture<GetBasicInfoQAResponse> getBasicInfoQA(GetBasicInfoQARequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetBasicInfoQA").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/getBasicInfoQA").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetBasicInfoQAResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetBasicInfoQAResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCartoon  GetCartoonRequest
     * @return GetCartoonResponse
     */
    @Override
    public CompletableFuture<GetCartoonResponse> getCartoon(GetCartoonRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetCartoon").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/getCartoon").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCartoonResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCartoonResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHotelContactByGenieDevice  GetHotelContactByGenieDeviceRequest
     * @return GetHotelContactByGenieDeviceResponse
     */
    @Override
    public CompletableFuture<GetHotelContactByGenieDeviceResponse> getHotelContactByGenieDevice(GetHotelContactByGenieDeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetHotelContactByGenieDevice").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/getHotelContactByGenieDevice").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHotelContactByGenieDeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHotelContactByGenieDeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHotelContactByNumber  GetHotelContactByNumberRequest
     * @return GetHotelContactByNumberResponse
     */
    @Override
    public CompletableFuture<GetHotelContactByNumberResponse> getHotelContactByNumber(GetHotelContactByNumberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetHotelContactByNumber").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/getHotelContactByNumber").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHotelContactByNumberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHotelContactByNumberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHotelContacts  GetHotelContactsRequest
     * @return GetHotelContactsResponse
     */
    @Override
    public CompletableFuture<GetHotelContactsResponse> getHotelContacts(GetHotelContactsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetHotelContacts").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/getHotelContacts").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHotelContactsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHotelContactsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHotelHomeBackImageAndModes  GetHotelHomeBackImageAndModesRequest
     * @return GetHotelHomeBackImageAndModesResponse
     */
    @Override
    public CompletableFuture<GetHotelHomeBackImageAndModesResponse> getHotelHomeBackImageAndModes(GetHotelHomeBackImageAndModesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetHotelHomeBackImageAndModes").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/getHotelHomeBackImageAndModes").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHotelHomeBackImageAndModesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHotelHomeBackImageAndModesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHotelNotice  GetHotelNoticeRequest
     * @return GetHotelNoticeResponse
     */
    @Override
    public CompletableFuture<GetHotelNoticeResponse> getHotelNotice(GetHotelNoticeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetHotelNotice").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/getHotelNotice").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHotelNoticeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHotelNoticeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHotelNoticeV2  GetHotelNoticeV2Request
     * @return GetHotelNoticeV2Response
     */
    @Override
    public CompletableFuture<GetHotelNoticeV2Response> getHotelNoticeV2(GetHotelNoticeV2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetHotelNoticeV2").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/getHotelNoticeV2").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHotelNoticeV2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHotelNoticeV2Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHotelOrderDetail  GetHotelOrderDetailRequest
     * @return GetHotelOrderDetailResponse
     */
    @Override
    public CompletableFuture<GetHotelOrderDetailResponse> getHotelOrderDetail(GetHotelOrderDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetHotelOrderDetail").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/getHotelOrderDetail").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHotelOrderDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHotelOrderDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHotelRoomDevice  GetHotelRoomDeviceRequest
     * @return GetHotelRoomDeviceResponse
     */
    @Override
    public CompletableFuture<GetHotelRoomDeviceResponse> getHotelRoomDevice(GetHotelRoomDeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetHotelRoomDevice").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/getHotelRoomDevice").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHotelRoomDeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHotelRoomDeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHotelSampleUtterances  GetHotelSampleUtterancesRequest
     * @return GetHotelSampleUtterancesResponse
     */
    @Override
    public CompletableFuture<GetHotelSampleUtterancesResponse> getHotelSampleUtterances(GetHotelSampleUtterancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetHotelSampleUtterances").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/getHotelSampleUtterances").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHotelSampleUtterancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHotelSampleUtterancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHotelSceneItemDetail  GetHotelSceneItemDetailRequest
     * @return GetHotelSceneItemDetailResponse
     */
    @Override
    public CompletableFuture<GetHotelSceneItemDetailResponse> getHotelSceneItemDetail(GetHotelSceneItemDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetHotelSceneItemDetail").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/getHotelSceneItemDetail").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHotelSceneItemDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHotelSceneItemDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHotelScreenSaver  GetHotelScreenSaverRequest
     * @return GetHotelScreenSaverResponse
     */
    @Override
    public CompletableFuture<GetHotelScreenSaverResponse> getHotelScreenSaver(GetHotelScreenSaverRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetHotelScreenSaver").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/getHotelScreenSaver").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHotelScreenSaverResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHotelScreenSaverResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHotelScreenSaverStyle  GetHotelScreenSaverStyleRequest
     * @return GetHotelScreenSaverStyleResponse
     */
    @Override
    public CompletableFuture<GetHotelScreenSaverStyleResponse> getHotelScreenSaverStyle(GetHotelScreenSaverStyleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetHotelScreenSaverStyle").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/getHotelScreenSaverStyle").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHotelScreenSaverStyleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHotelScreenSaverStyleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHotelSetting  GetHotelSettingRequest
     * @return GetHotelSettingResponse
     */
    @Override
    public CompletableFuture<GetHotelSettingResponse> getHotelSetting(GetHotelSettingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetHotelSetting").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/getHotelSetting").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHotelSettingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHotelSettingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetRelationProductList  GetRelationProductListRequest
     * @return GetRelationProductListResponse
     */
    @Override
    public CompletableFuture<GetRelationProductListResponse> getRelationProductList(GetRelationProductListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetRelationProductList").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/getRelationProductList").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRelationProductListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRelationProductListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetUnionId  GetUnionIdRequest
     * @return GetUnionIdResponse
     */
    @Override
    public CompletableFuture<GetUnionIdResponse> getUnionId(GetUnionIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetUnionId").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/getUnionId").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUnionIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUnionIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetWelcomeTextAndMusic  GetWelcomeTextAndMusicRequest
     * @return GetWelcomeTextAndMusicResponse
     */
    @Override
    public CompletableFuture<GetWelcomeTextAndMusicResponse> getWelcomeTextAndMusic(GetWelcomeTextAndMusicRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetWelcomeTextAndMusic").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/getWelcomeTextAndMusic").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetWelcomeTextAndMusicResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetWelcomeTextAndMusicResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of HotelQrBind  HotelQrBindRequest
     * @return HotelQrBindResponse
     */
    @Override
    public CompletableFuture<HotelQrBindResponse> hotelQrBind(HotelQrBindRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("HotelQrBind").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/hotelQrBind").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(HotelQrBindResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<HotelQrBindResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ImportHotelConfig  ImportHotelConfigRequest
     * @return ImportHotelConfigResponse
     */
    @Override
    public CompletableFuture<ImportHotelConfigResponse> importHotelConfig(ImportHotelConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ImportHotelConfig").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/importHotelConfig").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ImportHotelConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ImportHotelConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ImportRoomControlDevices  ImportRoomControlDevicesRequest
     * @return ImportRoomControlDevicesResponse
     */
    @Override
    public CompletableFuture<ImportRoomControlDevicesResponse> importRoomControlDevices(ImportRoomControlDevicesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ImportRoomControlDevices").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/importRoomControlDevices").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ImportRoomControlDevicesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ImportRoomControlDevicesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ImportRoomGenieScenes  ImportRoomGenieScenesRequest
     * @return ImportRoomGenieScenesResponse
     */
    @Override
    public CompletableFuture<ImportRoomGenieScenesResponse> importRoomGenieScenes(ImportRoomGenieScenesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ImportRoomGenieScenes").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/importRoomGenieScenes").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ImportRoomGenieScenesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ImportRoomGenieScenesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InsertHotelSceneBookItem  InsertHotelSceneBookItemRequest
     * @return InsertHotelSceneBookItemResponse
     */
    @Override
    public CompletableFuture<InsertHotelSceneBookItemResponse> insertHotelSceneBookItem(InsertHotelSceneBookItemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InsertHotelSceneBookItem").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/insertHotelSceneBookItem").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InsertHotelSceneBookItemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InsertHotelSceneBookItemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InvokeRobotPush  InvokeRobotPushRequest
     * @return InvokeRobotPushResponse
     */
    @Override
    public CompletableFuture<InvokeRobotPushResponse> invokeRobotPush(InvokeRobotPushRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InvokeRobotPush").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/invokeRobotPush").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InvokeRobotPushResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InvokeRobotPushResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAllProvinces  ListAllProvincesRequest
     * @return ListAllProvincesResponse
     */
    @Override
    public CompletableFuture<ListAllProvincesResponse> listAllProvinces(ListAllProvincesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAllProvinces").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/listAllProvinces").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAllProvincesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAllProvincesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCitiesByProvince  ListCitiesByProvinceRequest
     * @return ListCitiesByProvinceResponse
     */
    @Override
    public CompletableFuture<ListCitiesByProvinceResponse> listCitiesByProvince(ListCitiesByProvinceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListCitiesByProvince").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/listCitiesByProvince").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCitiesByProvinceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCitiesByProvinceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCustomQA  ListCustomQARequest
     * @return ListCustomQAResponse
     */
    @Override
    public CompletableFuture<ListCustomQAResponse> listCustomQA(ListCustomQARequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListCustomQA").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/listCustomQA").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCustomQAResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCustomQAResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDialogueTemplate  ListDialogueTemplateRequest
     * @return ListDialogueTemplateResponse
     */
    @Override
    public CompletableFuture<ListDialogueTemplateResponse> listDialogueTemplate(ListDialogueTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDialogueTemplate").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/listDialogueTemplate").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDialogueTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDialogueTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListHotelAlarm  ListHotelAlarmRequest
     * @return ListHotelAlarmResponse
     */
    @Override
    public CompletableFuture<ListHotelAlarmResponse> listHotelAlarm(ListHotelAlarmRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListHotelAlarm").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/getHotelAlarmList").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListHotelAlarmResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListHotelAlarmResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListHotelControlDevice  ListHotelControlDeviceRequest
     * @return ListHotelControlDeviceResponse
     */
    @Override
    public CompletableFuture<ListHotelControlDeviceResponse> listHotelControlDevice(ListHotelControlDeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListHotelControlDevice").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/listHotelControlDevice").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListHotelControlDeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListHotelControlDeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListHotelInfo  ListHotelInfoRequest
     * @return ListHotelInfoResponse
     */
    @Override
    public CompletableFuture<ListHotelInfoResponse> listHotelInfo(ListHotelInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListHotelInfo").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/listHotelInfo").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListHotelInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListHotelInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListHotelMessageTemplate  ListHotelMessageTemplateRequest
     * @return ListHotelMessageTemplateResponse
     */
    @Override
    public CompletableFuture<ListHotelMessageTemplateResponse> listHotelMessageTemplate(ListHotelMessageTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListHotelMessageTemplate").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/listHotelMessageTemplate").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListHotelMessageTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListHotelMessageTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListHotelOrder  ListHotelOrderRequest
     * @return ListHotelOrderResponse
     */
    @Override
    public CompletableFuture<ListHotelOrderResponse> listHotelOrder(ListHotelOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListHotelOrder").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/listHotelOrder").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListHotelOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListHotelOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListHotelRooms  ListHotelRoomsRequest
     * @return ListHotelRoomsResponse
     */
    @Override
    public CompletableFuture<ListHotelRoomsResponse> listHotelRooms(ListHotelRoomsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListHotelRooms").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/listHotelRooms").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListHotelRoomsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListHotelRoomsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListHotelSceneBookItems  ListHotelSceneBookItemsRequest
     * @return ListHotelSceneBookItemsResponse
     */
    @Override
    public CompletableFuture<ListHotelSceneBookItemsResponse> listHotelSceneBookItems(ListHotelSceneBookItemsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListHotelSceneBookItems").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/listHotelSceneBookItems").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListHotelSceneBookItemsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListHotelSceneBookItemsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListHotelSceneItem  ListHotelSceneItemRequest
     * @return ListHotelSceneItemResponse
     */
    @Override
    public CompletableFuture<ListHotelSceneItemResponse> listHotelSceneItem(ListHotelSceneItemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListHotelSceneItem").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/listHotelSceneItem").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListHotelSceneItemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListHotelSceneItemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListHotelSceneItems  ListHotelSceneItemsRequest
     * @return ListHotelSceneItemsResponse
     */
    @Override
    public CompletableFuture<ListHotelSceneItemsResponse> listHotelSceneItems(ListHotelSceneItemsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListHotelSceneItems").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/listHotelSceneItems").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListHotelSceneItemsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListHotelSceneItemsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListHotelServiceCategory  ListHotelServiceCategoryRequest
     * @return ListHotelServiceCategoryResponse
     */
    @Override
    public CompletableFuture<ListHotelServiceCategoryResponse> listHotelServiceCategory(ListHotelServiceCategoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListHotelServiceCategory").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/listHotelServiceCategory").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListHotelServiceCategoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListHotelServiceCategoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListHotels  ListHotelsRequest
     * @return ListHotelsResponse
     */
    @Override
    public CompletableFuture<ListHotelsResponse> listHotels(ListHotelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListHotels").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/listHotels").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListHotelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListHotelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListInfraredDeviceBrands  ListInfraredDeviceBrandsRequest
     * @return ListInfraredDeviceBrandsResponse
     */
    @Override
    public CompletableFuture<ListInfraredDeviceBrandsResponse> listInfraredDeviceBrands(ListInfraredDeviceBrandsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListInfraredDeviceBrands").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/listInfraredDeviceBrands").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInfraredDeviceBrandsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInfraredDeviceBrandsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListInfraredRemoteControllers  ListInfraredRemoteControllersRequest
     * @return ListInfraredRemoteControllersResponse
     */
    @Override
    public CompletableFuture<ListInfraredRemoteControllersResponse> listInfraredRemoteControllers(ListInfraredRemoteControllersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListInfraredRemoteControllers").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/listInfraredRemoteControllers").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInfraredRemoteControllersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInfraredRemoteControllersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSTBServiceProviders  ListSTBServiceProvidersRequest
     * @return ListSTBServiceProvidersResponse
     */
    @Override
    public CompletableFuture<ListSTBServiceProvidersResponse> listSTBServiceProviders(ListSTBServiceProvidersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSTBServiceProviders").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/listSTBServiceProviders").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSTBServiceProvidersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSTBServiceProvidersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSceneCategory  ListSceneCategoryRequest
     * @return ListSceneCategoryResponse
     */
    @Override
    public CompletableFuture<ListSceneCategoryResponse> listSceneCategory(ListSceneCategoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSceneCategory").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/listSceneCategory").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSceneCategoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSceneCategoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListServiceQA  ListServiceQARequest
     * @return ListServiceQAResponse
     */
    @Override
    public CompletableFuture<ListServiceQAResponse> listServiceQA(ListServiceQARequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListServiceQA").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/listServiceQA").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListServiceQAResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListServiceQAResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTickets  ListTicketsRequest
     * @return ListTicketsResponse
     */
    @Override
    public CompletableFuture<ListTicketsResponse> listTickets(ListTicketsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTickets").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/listTickets").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTicketsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTicketsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PageGetHotelRoomDevices  PageGetHotelRoomDevicesRequest
     * @return PageGetHotelRoomDevicesResponse
     */
    @Override
    public CompletableFuture<PageGetHotelRoomDevicesResponse> pageGetHotelRoomDevices(PageGetHotelRoomDevicesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PageGetHotelRoomDevices").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/pageGetHotelRoomDevices").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PageGetHotelRoomDevicesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PageGetHotelRoomDevicesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PmsEventReport  PmsEventReportRequest
     * @return PmsEventReportResponse
     */
    @Override
    public CompletableFuture<PmsEventReportResponse> pmsEventReport(PmsEventReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PmsEventReport").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/pmsEventReport").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PmsEventReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PmsEventReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PushHotelMessage  PushHotelMessageRequest
     * @return PushHotelMessageResponse
     */
    @Override
    public CompletableFuture<PushHotelMessageResponse> pushHotelMessage(PushHotelMessageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PushHotelMessage").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/pushHotelMessage").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PushHotelMessageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PushHotelMessageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PushVoiceBoxCommands  PushVoiceBoxCommandsRequest
     * @return PushVoiceBoxCommandsResponse
     */
    @Override
    public CompletableFuture<PushVoiceBoxCommandsResponse> pushVoiceBoxCommands(PushVoiceBoxCommandsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PushVoiceBoxCommands").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/pushVoiceBoxCommands").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PushVoiceBoxCommandsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PushVoiceBoxCommandsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PushWelcome  PushWelcomeRequest
     * @return PushWelcomeResponse
     */
    @Override
    public CompletableFuture<PushWelcomeResponse> pushWelcome(PushWelcomeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PushWelcome").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/pushWelcome").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PushWelcomeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PushWelcomeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PushWelcomeTextAndMusic  PushWelcomeTextAndMusicRequest
     * @return PushWelcomeTextAndMusicResponse
     */
    @Override
    public CompletableFuture<PushWelcomeTextAndMusicResponse> pushWelcomeTextAndMusic(PushWelcomeTextAndMusicRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PushWelcomeTextAndMusic").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/pushWelcomeTextAndMusic").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PushWelcomeTextAndMusicResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PushWelcomeTextAndMusicResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryDeviceStatus  QueryDeviceStatusRequest
     * @return QueryDeviceStatusResponse
     */
    @Override
    public CompletableFuture<QueryDeviceStatusResponse> queryDeviceStatus(QueryDeviceStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryDeviceStatus").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/queryDeviceStatus").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDeviceStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDeviceStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryHotelRoomDetail  QueryHotelRoomDetailRequest
     * @return QueryHotelRoomDetailResponse
     */
    @Override
    public CompletableFuture<QueryHotelRoomDetailResponse> queryHotelRoomDetail(QueryHotelRoomDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryHotelRoomDetail").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/queryHotelRoomDetail").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryHotelRoomDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryHotelRoomDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryRoomControlDevices  QueryRoomControlDevicesRequest
     * @return QueryRoomControlDevicesResponse
     */
    @Override
    public CompletableFuture<QueryRoomControlDevicesResponse> queryRoomControlDevices(QueryRoomControlDevicesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryRoomControlDevices").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/queryRoomControlDevices").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryRoomControlDevicesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryRoomControlDevicesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryRoomControlDevicesAndStatus  QueryRoomControlDevicesAndStatusRequest
     * @return QueryRoomControlDevicesAndStatusResponse
     */
    @Override
    public CompletableFuture<QueryRoomControlDevicesAndStatusResponse> queryRoomControlDevicesAndStatus(QueryRoomControlDevicesAndStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryRoomControlDevicesAndStatus").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/queryRoomControlDevicesAndStatus").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryRoomControlDevicesAndStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryRoomControlDevicesAndStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryRoomStatus  QueryRoomStatusRequest
     * @return QueryRoomStatusResponse
     */
    @Override
    public CompletableFuture<QueryRoomStatusResponse> queryRoomStatus(QueryRoomStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryRoomStatus").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/queryRoomStatus").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryRoomStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryRoomStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QuerySceneList  QuerySceneListRequest
     * @return QuerySceneListResponse
     */
    @Override
    public CompletableFuture<QuerySceneListResponse> querySceneList(QuerySceneListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QuerySceneList").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/querySceneList").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySceneListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySceneListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RemoveChildAccountAuth  RemoveChildAccountAuthRequest
     * @return RemoveChildAccountAuthResponse
     */
    @Override
    public CompletableFuture<RemoveChildAccountAuthResponse> removeChildAccountAuth(RemoveChildAccountAuthRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RemoveChildAccountAuth").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/removeChildAccountAuth").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveChildAccountAuthResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveChildAccountAuthResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RemoveHotel  RemoveHotelRequest
     * @return RemoveHotelResponse
     */
    @Override
    public CompletableFuture<RemoveHotelResponse> removeHotel(RemoveHotelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RemoveHotel").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/removeHotel").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveHotelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveHotelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ResetWelcomeTextAndMusic  ResetWelcomeTextAndMusicRequest
     * @return ResetWelcomeTextAndMusicResponse
     */
    @Override
    public CompletableFuture<ResetWelcomeTextAndMusicResponse> resetWelcomeTextAndMusic(ResetWelcomeTextAndMusicRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ResetWelcomeTextAndMusic").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/resetWelcomeTextAndMusic").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResetWelcomeTextAndMusicResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResetWelcomeTextAndMusicResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RoomCheckOut  RoomCheckOutRequest
     * @return RoomCheckOutResponse
     */
    @Override
    public CompletableFuture<RoomCheckOutResponse> roomCheckOut(RoomCheckOutRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RoomCheckOut").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/roomCheckOut").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RoomCheckOutResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RoomCheckOutResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitHotelOrder  SubmitHotelOrderRequest
     * @return SubmitHotelOrderResponse
     */
    @Override
    public CompletableFuture<SubmitHotelOrderResponse> submitHotelOrder(SubmitHotelOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SubmitHotelOrder").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/submitHotelOrder").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitHotelOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitHotelOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SyncDeviceStatusWithAk  SyncDeviceStatusWithAkRequest
     * @return SyncDeviceStatusWithAkResponse
     */
    @Override
    public CompletableFuture<SyncDeviceStatusWithAkResponse> syncDeviceStatusWithAk(SyncDeviceStatusWithAkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SyncDeviceStatusWithAk").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/syncDeviceStatusWithAk").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SyncDeviceStatusWithAkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SyncDeviceStatusWithAkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateBasicInfoQA  UpdateBasicInfoQARequest
     * @return UpdateBasicInfoQAResponse
     */
    @Override
    public CompletableFuture<UpdateBasicInfoQAResponse> updateBasicInfoQA(UpdateBasicInfoQARequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateBasicInfoQA").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/updateBasicInfoQA").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateBasicInfoQAResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateBasicInfoQAResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateCustomQA  UpdateCustomQARequest
     * @return UpdateCustomQAResponse
     */
    @Override
    public CompletableFuture<UpdateCustomQAResponse> updateCustomQA(UpdateCustomQARequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateCustomQA").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/updateCustomQA").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateCustomQAResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateCustomQAResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateHotel  UpdateHotelRequest
     * @return UpdateHotelResponse
     */
    @Override
    public CompletableFuture<UpdateHotelResponse> updateHotel(UpdateHotelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateHotel").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/updateHotel").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateHotelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateHotelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateHotelAlarm  UpdateHotelAlarmRequest
     * @return UpdateHotelAlarmResponse
     */
    @Override
    public CompletableFuture<UpdateHotelAlarmResponse> updateHotelAlarm(UpdateHotelAlarmRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateHotelAlarm").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/updateHotelAlarm").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateHotelAlarmResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateHotelAlarmResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateHotelSceneBookItem  UpdateHotelSceneBookItemRequest
     * @return UpdateHotelSceneBookItemResponse
     */
    @Override
    public CompletableFuture<UpdateHotelSceneBookItemResponse> updateHotelSceneBookItem(UpdateHotelSceneBookItemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateHotelSceneBookItem").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/updateHotelSceneBookItem").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateHotelSceneBookItemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateHotelSceneBookItemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateHotelSceneItem  UpdateHotelSceneItemRequest
     * @return UpdateHotelSceneItemResponse
     */
    @Override
    public CompletableFuture<UpdateHotelSceneItemResponse> updateHotelSceneItem(UpdateHotelSceneItemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateHotelSceneItem").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/updateHotelSceneItem").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateHotelSceneItemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateHotelSceneItemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateMessageTemplate  UpdateMessageTemplateRequest
     * @return UpdateMessageTemplateResponse
     */
    @Override
    public CompletableFuture<UpdateMessageTemplateResponse> updateMessageTemplate(UpdateMessageTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateMessageTemplate").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/updateMessageTemplate").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMessageTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMessageTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateRcuScene  UpdateRcuSceneRequest
     * @return UpdateRcuSceneResponse
     */
    @Override
    public CompletableFuture<UpdateRcuSceneResponse> updateRcuScene(UpdateRcuSceneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateRcuScene").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/updateRcuScene").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateRcuSceneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateRcuSceneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateServiceQA  UpdateServiceQARequest
     * @return UpdateServiceQAResponse
     */
    @Override
    public CompletableFuture<UpdateServiceQAResponse> updateServiceQA(UpdateServiceQARequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateServiceQA").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/updateServiceQA").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateServiceQAResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateServiceQAResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateTicket  UpdateTicketRequest
     * @return UpdateTicketResponse
     */
    @Override
    public CompletableFuture<UpdateTicketResponse> updateTicket(UpdateTicketRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateTicket").setMethod(HttpMethod.POST).setPathRegex("/v1.0/ip/updateTicket").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTicketResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTicketResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
