// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailianmodelonchip20240816;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.bailianmodelonchip20240816.models.*;
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
        this.product = "BailianModelOnChip";
        this.version = "2024-08-16";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of ActiveInteractionCreate  ActiveInteractionCreateRequest
     * @return ActiveInteractionCreateResponse
     */
    @Override
    public CompletableFuture<ActiveInteractionCreateResponse> activeInteractionCreate(ActiveInteractionCreateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ActiveInteractionCreate").setMethod(HttpMethod.POST).setPathRegex("/open/api/v1/active/interaction/create").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ActiveInteractionCreateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ActiveInteractionCreateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ActiveInteractionEuCreate  ActiveInteractionEuCreateRequest
     * @return ActiveInteractionEuCreateResponse
     */
    @Override
    public CompletableFuture<ActiveInteractionEuCreateResponse> activeInteractionEuCreate(ActiveInteractionEuCreateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ActiveInteractionEuCreate").setMethod(HttpMethod.POST).setPathRegex("/open/api/eu/active/interaction/create").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ActiveInteractionEuCreateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ActiveInteractionEuCreateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeviceRegister  DeviceRegisterRequest
     * @return DeviceRegisterResponse
     */
    @Override
    public CompletableFuture<DeviceRegisterResponse> deviceRegister(DeviceRegisterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeviceRegister").setMethod(HttpMethod.POST).setPathRegex("/open/api/device/v1/register").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeviceRegisterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeviceRegisterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetToken  GetTokenRequest
     * @return GetTokenResponse
     */
    @Override
    public CompletableFuture<GetTokenResponse> getToken(GetTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetToken").setMethod(HttpMethod.POST).setPathRegex("/open/api/auth/v1/token/get").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelTypeDetermine  ModelTypeDetermineRequest
     * @return ModelTypeDetermineResponse
     */
    @Override
    public CompletableFuture<ModelTypeDetermineResponse> modelTypeDetermine(ModelTypeDetermineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelTypeDetermine").setMethod(HttpMethod.POST).setPathRegex("/open/api/v1/model/type/determine").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelTypeDetermineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelTypeDetermineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OmniRealtimeConversationEU  OmniRealtimeConversationEURequest
     * @return OmniRealtimeConversationEUResponse
     */
    @Override
    public CompletableFuture<OmniRealtimeConversationEUResponse> omniRealtimeConversationEU(OmniRealtimeConversationEURequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("OmniRealtimeConversationEU").setMethod(HttpMethod.POST).setPathRegex("/open/api/eu/active/interaction/audio").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OmniRealtimeConversationEUResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OmniRealtimeConversationEUResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
