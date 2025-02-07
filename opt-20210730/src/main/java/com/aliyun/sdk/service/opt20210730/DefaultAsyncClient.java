// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opt20210730;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.opt20210730.models.*;
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
        this.product = "opt";
        this.version = "2021-07-30";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of GetOpenStatus  GetOpenStatusRequest
     * @return GetOpenStatusResponse
     */
    @Override
    public CompletableFuture<GetOpenStatusResponse> getOpenStatus(GetOpenStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetOpenStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetOpenStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetOpenStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetOrderInfo  GetOrderInfoRequest
     * @return GetOrderInfoResponse
     */
    @Override
    public CompletableFuture<GetOrderInfoResponse> getOrderInfo(GetOrderInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetOrderInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetOrderInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetOrderInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetOrderUsage  GetOrderUsageRequest
     * @return GetOrderUsageResponse
     */
    @Override
    public CompletableFuture<GetOrderUsageResponse> getOrderUsage(GetOrderUsageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetOrderUsage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetOrderUsageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetOrderUsageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
