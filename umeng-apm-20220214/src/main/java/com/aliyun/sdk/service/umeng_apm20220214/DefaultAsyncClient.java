// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_apm20220214;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.umeng_apm20220214.models.*;
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
        this.product = "umeng-apm";
        this.version = "2022-02-14";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of DeleteSymRecords  DeleteSymRecordsRequest
     * @return DeleteSymRecordsResponse
     */
    @Override
    public CompletableFuture<DeleteSymRecordsResponse> deleteSymRecords(DeleteSymRecordsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteSymRecords").setMethod(HttpMethod.POST).setPathRegex("/deleteSymRecords").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSymRecordsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSymRecordsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetH5PageTrend  GetH5PageTrendRequest
     * @return GetH5PageTrendResponse
     */
    @Override
    public CompletableFuture<GetH5PageTrendResponse> getH5PageTrend(GetH5PageTrendRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetH5PageTrend").setMethod(HttpMethod.GET).setPathRegex("/stat/getH5PageTrend").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetH5PageTrendResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetH5PageTrendResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLaunchTrend  GetLaunchTrendRequest
     * @return GetLaunchTrendResponse
     */
    @Override
    public CompletableFuture<GetLaunchTrendResponse> getLaunchTrend(GetLaunchTrendRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetLaunchTrend").setMethod(HttpMethod.GET).setPathRegex("/stat/getLaunchTrend").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLaunchTrendResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLaunchTrendResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetNativePageTrend  GetNativePageTrendRequest
     * @return GetNativePageTrendResponse
     */
    @Override
    public CompletableFuture<GetNativePageTrendResponse> getNativePageTrend(GetNativePageTrendRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetNativePageTrend").setMethod(HttpMethod.GET).setPathRegex("/stat/getNativePageTrend").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetNativePageTrendResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetNativePageTrendResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetNetworkTrend  GetNetworkTrendRequest
     * @return GetNetworkTrendResponse
     */
    @Override
    public CompletableFuture<GetNetworkTrendResponse> getNetworkTrend(GetNetworkTrendRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetNetworkTrend").setMethod(HttpMethod.GET).setPathRegex("/stat/getNetworkTrend").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetNetworkTrendResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetNetworkTrendResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetStatTrend  GetStatTrendRequest
     * @return GetStatTrendResponse
     */
    @Override
    public CompletableFuture<GetStatTrendResponse> getStatTrend(GetStatTrendRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetStatTrend").setMethod(HttpMethod.GET).setPathRegex("/stat/getStatTrend").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetStatTrendResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetStatTrendResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSymUploadParam  GetSymUploadParamRequest
     * @return GetSymUploadParamResponse
     */
    @Override
    public CompletableFuture<GetSymUploadParamResponse> getSymUploadParam(GetSymUploadParamRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetSymUploadParam").setMethod(HttpMethod.GET).setPathRegex("/getSymUploadParam").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSymUploadParamResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSymUploadParamResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTodayStatTrend  GetTodayStatTrendRequest
     * @return GetTodayStatTrendResponse
     */
    @Override
    public CompletableFuture<GetTodayStatTrendResponse> getTodayStatTrend(GetTodayStatTrendRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTodayStatTrend").setMethod(HttpMethod.GET).setPathRegex("/stat/getTodayStatTrend").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTodayStatTrendResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTodayStatTrendResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateAlertPlan  UpdateAlertPlanRequest
     * @return UpdateAlertPlanResponse
     */
    @Override
    public CompletableFuture<UpdateAlertPlanResponse> updateAlertPlan(UpdateAlertPlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateAlertPlan").setMethod(HttpMethod.POST).setPathRegex("/updateAlertPlan").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAlertPlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAlertPlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
