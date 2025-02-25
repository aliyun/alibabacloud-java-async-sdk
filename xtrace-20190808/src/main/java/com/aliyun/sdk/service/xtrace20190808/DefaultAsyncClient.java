// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtrace20190808;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.xtrace20190808.models.*;
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
        this.product = "xtrace";
        this.version = "2019-08-08";
        this.endpointRule = "regional";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of CheckCommercialStatus  CheckCommercialStatusRequest
     * @return CheckCommercialStatusResponse
     */
    @Override
    public CompletableFuture<CheckCommercialStatusResponse> checkCommercialStatus(CheckCommercialStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckCommercialStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckCommercialStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckCommercialStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTagKey  GetTagKeyRequest
     * @return GetTagKeyResponse
     */
    @Override
    public CompletableFuture<GetTagKeyResponse> getTagKey(GetTagKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetTagKey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTagKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTagKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTagVal  GetTagValRequest
     * @return GetTagValResponse
     */
    @Override
    public CompletableFuture<GetTagValResponse> getTagVal(GetTagValRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetTagVal").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTagValResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTagValResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTrace  GetTraceRequest
     * @return GetTraceResponse
     */
    @Override
    public CompletableFuture<GetTraceResponse> getTrace(GetTraceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetTrace").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTraceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTraceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListIpOrHosts  ListIpOrHostsRequest
     * @return ListIpOrHostsResponse
     */
    @Override
    public CompletableFuture<ListIpOrHostsResponse> listIpOrHosts(ListIpOrHostsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListIpOrHosts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListIpOrHostsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListIpOrHostsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListServices  ListServicesRequest
     * @return ListServicesResponse
     */
    @Override
    public CompletableFuture<ListServicesResponse> listServices(ListServicesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListServices").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListServicesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListServicesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSpanNames  ListSpanNamesRequest
     * @return ListSpanNamesResponse
     */
    @Override
    public CompletableFuture<ListSpanNamesResponse> listSpanNames(ListSpanNamesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSpanNames").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSpanNamesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSpanNamesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OpenXtraceService  OpenXtraceServiceRequest
     * @return OpenXtraceServiceResponse
     */
    @Override
    public CompletableFuture<OpenXtraceServiceResponse> openXtraceService(OpenXtraceServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OpenXtraceService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OpenXtraceServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OpenXtraceServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryMetric  QueryMetricRequest
     * @return QueryMetricResponse
     */
    @Override
    public CompletableFuture<QueryMetricResponse> queryMetric(QueryMetricRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryMetric").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryMetricResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryMetricResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SearchTraces  SearchTracesRequest
     * @return SearchTracesResponse
     */
    @Override
    public CompletableFuture<SearchTracesResponse> searchTraces(SearchTracesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SearchTraces").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SearchTracesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SearchTracesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
