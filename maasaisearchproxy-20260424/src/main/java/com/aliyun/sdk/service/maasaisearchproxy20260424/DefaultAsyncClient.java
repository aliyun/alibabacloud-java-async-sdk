// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maasaisearchproxy20260424;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.maasaisearchproxy20260424.models.*;
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
        this.product = "MaasAISearchProxy";
        this.version = "2026-04-24";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of OpenDatasetImportData  OpenDatasetImportDataRequest
     * @return OpenDatasetImportDataResponse
     */
    @Override
    public CompletableFuture<OpenDatasetImportDataResponse> openDatasetImportData(OpenDatasetImportDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("OpenDatasetImportData").setMethod(HttpMethod.POST).setPathRegex("/api/v1/dataset/open/upsert").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OpenDatasetImportDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OpenDatasetImportDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OpenDatasetResourceUrl  OpenDatasetResourceUrlRequest
     * @return OpenDatasetResourceUrlResponse
     */
    @Override
    public CompletableFuture<OpenDatasetResourceUrlResponse> openDatasetResourceUrl(OpenDatasetResourceUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("OpenDatasetResourceUrl").setMethod(HttpMethod.POST).setPathRegex("/api/v1/dataset/open/resources").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OpenDatasetResourceUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OpenDatasetResourceUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of WebSearch  WebSearchRequest
     * @return WebSearchResponse
     */
    @Override
    public CompletableFuture<WebSearchResponse> webSearch(WebSearchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("WebSearch").setMethod(HttpMethod.POST).setPathRegex("/api/web-search").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(WebSearchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<WebSearchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
