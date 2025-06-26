// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oms20160615;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.oms20160615.models.*;
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
        this.product = "Oms";
        this.version = "2016-06-15";
        this.endpointRule = "central";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("ap-southeast-1", "oms.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "pre-oms.cn-hangzhou.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of DeleteDomainPart  DeleteDomainPartRequest
     * @return DeleteDomainPartResponse
     */
    @Override
    public CompletableFuture<DeleteDomainPartResponse> deleteDomainPart(DeleteDomainPartRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDomainPart").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDomainPartResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDomainPartResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDomainPartByProxy  DeleteDomainPartByProxyRequest
     * @return DeleteDomainPartByProxyResponse
     */
    @Override
    public CompletableFuture<DeleteDomainPartByProxyResponse> deleteDomainPartByProxy(DeleteDomainPartByProxyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDomainPartByProxy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDomainPartByProxyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDomainPartByProxyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMeasureData  DeleteMeasureDataRequest
     * @return DeleteMeasureDataResponse
     */
    @Override
    public CompletableFuture<DeleteMeasureDataResponse> deleteMeasureData(DeleteMeasureDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteMeasureData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMeasureDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMeasureDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDomainPart  GetDomainPartRequest
     * @return GetDomainPartResponse
     */
    @Override
    public CompletableFuture<GetDomainPartResponse> getDomainPart(GetDomainPartRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDomainPart").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDomainPartResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDomainPartResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDomainPartByProxy  GetDomainPartByProxyRequest
     * @return GetDomainPartByProxyResponse
     */
    @Override
    public CompletableFuture<GetDomainPartByProxyResponse> getDomainPartByProxy(GetDomainPartByProxyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDomainPartByProxy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDomainPartByProxyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDomainPartByProxyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetIncrementMeasureDataByProxy  GetIncrementMeasureDataByProxyRequest
     * @return GetIncrementMeasureDataByProxyResponse
     */
    @Override
    public CompletableFuture<GetIncrementMeasureDataByProxyResponse> getIncrementMeasureDataByProxy(GetIncrementMeasureDataByProxyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetIncrementMeasureDataByProxy").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetIncrementMeasureDataByProxyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetIncrementMeasureDataByProxyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMeasureData  GetMeasureDataRequest
     * @return GetMeasureDataResponse
     */
    @Override
    public CompletableFuture<GetMeasureDataResponse> getMeasureData(GetMeasureDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMeasureData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMeasureDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMeasureDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetReadyFlag  GetReadyFlagRequest
     * @return GetReadyFlagResponse
     */
    @Override
    public CompletableFuture<GetReadyFlagResponse> getReadyFlag(GetReadyFlagRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetReadyFlag").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetReadyFlagResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetReadyFlagResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetReadyFlagByProxy  GetReadyFlagByProxyRequest
     * @return GetReadyFlagByProxyResponse
     */
    @Override
    public CompletableFuture<GetReadyFlagByProxyResponse> getReadyFlagByProxy(GetReadyFlagByProxyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetReadyFlagByProxy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetReadyFlagByProxyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetReadyFlagByProxyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PutDomainPart  PutDomainPartRequest
     * @return PutDomainPartResponse
     */
    @Override
    public CompletableFuture<PutDomainPartResponse> putDomainPart(PutDomainPartRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PutDomainPart").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PutDomainPartResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PutDomainPartResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PutDomainPartByProxy  PutDomainPartByProxyRequest
     * @return PutDomainPartByProxyResponse
     */
    @Override
    public CompletableFuture<PutDomainPartByProxyResponse> putDomainPartByProxy(PutDomainPartByProxyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PutDomainPartByProxy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PutDomainPartByProxyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PutDomainPartByProxyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PutMeasureData  PutMeasureDataRequest
     * @return PutMeasureDataResponse
     */
    @Override
    public CompletableFuture<PutMeasureDataResponse> putMeasureData(PutMeasureDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PutMeasureData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PutMeasureDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PutMeasureDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PutMeasureDataByProxy  PutMeasureDataByProxyRequest
     * @return PutMeasureDataByProxyResponse
     */
    @Override
    public CompletableFuture<PutMeasureDataByProxyResponse> putMeasureDataByProxy(PutMeasureDataByProxyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PutMeasureDataByProxy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PutMeasureDataByProxyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PutMeasureDataByProxyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PutReadyFlag  PutReadyFlagRequest
     * @return PutReadyFlagResponse
     */
    @Override
    public CompletableFuture<PutReadyFlagResponse> putReadyFlag(PutReadyFlagRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PutReadyFlag").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PutReadyFlagResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PutReadyFlagResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PutReadyFlagByProxy  PutReadyFlagByProxyRequest
     * @return PutReadyFlagByProxyResponse
     */
    @Override
    public CompletableFuture<PutReadyFlagByProxyResponse> putReadyFlagByProxy(PutReadyFlagByProxyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PutReadyFlagByProxy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PutReadyFlagByProxyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PutReadyFlagByProxyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
