// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.et_industry_openapi20200824;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.et_industry_openapi20200824.models.*;
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
        this.product = "et-industry-openapi";
        this.version = "2020-08-24";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("cn-hangzhou", "et-industry.cn-hangzhou.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of GetMqttConnect  GetMqttConnectRequest
     * @return GetMqttConnectResponse
     */
    @Override
    public CompletableFuture<GetMqttConnectResponse> getMqttConnect(GetMqttConnectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMqttConnect").setMethod(HttpMethod.POST).setPathRegex("/api/igate/collaboration/pop/getmqttconnect").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMqttConnectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMqttConnectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetNonce  GetNonceRequest
     * @return GetNonceResponse
     */
    @Override
    public CompletableFuture<GetNonceResponse> getNonce(GetNonceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetNonce").setMethod(HttpMethod.POST).setPathRegex("/api/igate/collaboration/pop/getnonce").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetNonceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetNonceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMeasurePointListByNodeCodePage  ListMeasurePointListByNodeCodePageRequest
     * @return ListMeasurePointListByNodeCodePageResponse
     */
    @Override
    public CompletableFuture<ListMeasurePointListByNodeCodePageResponse> listMeasurePointListByNodeCodePage(ListMeasurePointListByNodeCodePageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMeasurePointListByNodeCodePage").setMethod(HttpMethod.POST).setPathRegex("/api/igate/node/pop/measurepointlistbynodecodepage").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMeasurePointListByNodeCodePageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMeasurePointListByNodeCodePageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of MultiFieldBatchUpload  MultiFieldBatchUploadRequest
     * @return MultiFieldBatchUploadResponse
     */
    @Override
    public CompletableFuture<MultiFieldBatchUploadResponse> multiFieldBatchUpload(MultiFieldBatchUploadRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("MultiFieldBatchUpload").setMethod(HttpMethod.POST).setPathRegex("/api/igate/timeseries/upload/pop/multifieldbatchv2").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MultiFieldBatchUploadResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MultiFieldBatchUploadResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of MultiSourcePointBatchUpload  MultiSourcePointBatchUploadRequest
     * @return MultiSourcePointBatchUploadResponse
     */
    @Override
    public CompletableFuture<MultiSourcePointBatchUploadResponse> multiSourcePointBatchUpload(MultiSourcePointBatchUploadRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("MultiSourcePointBatchUpload").setMethod(HttpMethod.POST).setPathRegex("/api/igate/timeseries/upload/pop/sourcepointbatchv2").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MultiSourcePointBatchUploadResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MultiSourcePointBatchUploadResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryFieldLatestBySourcePoint  QueryFieldLatestBySourcePointRequest
     * @return QueryFieldLatestBySourcePointResponse
     */
    @Override
    public CompletableFuture<QueryFieldLatestBySourcePointResponse> queryFieldLatestBySourcePoint(QueryFieldLatestBySourcePointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryFieldLatestBySourcePoint").setMethod(HttpMethod.POST).setPathRegex("/api/igate/timeseries/query/pop/multifieldlatestbysourcepoint").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryFieldLatestBySourcePointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryFieldLatestBySourcePointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryIndustryDeviceData  QueryIndustryDeviceDataRequest
     * @return QueryIndustryDeviceDataResponse
     */
    @Override
    public CompletableFuture<QueryIndustryDeviceDataResponse> queryIndustryDeviceData(QueryIndustryDeviceDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryIndustryDeviceData").setMethod(HttpMethod.POST).setPathRegex("/api/igate/timeseries/query/pop/multifieldlatest").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryIndustryDeviceDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryIndustryDeviceDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryIndustryDeviceLimitsData  QueryIndustryDeviceLimitsDataRequest
     * @return QueryIndustryDeviceLimitsDataResponse
     */
    @Override
    public CompletableFuture<QueryIndustryDeviceLimitsDataResponse> queryIndustryDeviceLimitsData(QueryIndustryDeviceLimitsDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryIndustryDeviceLimitsData").setMethod(HttpMethod.POST).setPathRegex("/api/igate/timeseries/query/pop/multifieldrange").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryIndustryDeviceLimitsDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryIndustryDeviceLimitsDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryIndustryDeviceStatusData  QueryIndustryDeviceStatusDataRequest
     * @return QueryIndustryDeviceStatusDataResponse
     */
    @Override
    public CompletableFuture<QueryIndustryDeviceStatusDataResponse> queryIndustryDeviceStatusData(QueryIndustryDeviceStatusDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryIndustryDeviceStatusData").setMethod(HttpMethod.POST).setPathRegex("/api/igate/timeseries/query/pop/multifieldrangestatus").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryIndustryDeviceStatusDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryIndustryDeviceStatusDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SourcePointBatch  SourcePointBatchRequest
     * @return SourcePointBatchResponse
     */
    @Override
    public CompletableFuture<SourcePointBatchResponse> sourcePointBatch(SourcePointBatchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SourcePointBatch").setMethod(HttpMethod.POST).setPathRegex("/api/igate/timeseries/upload/pop/sourcepointbatch").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SourcePointBatchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SourcePointBatchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UploadIndustryDeviceData  UploadIndustryDeviceDataRequest
     * @return UploadIndustryDeviceDataResponse
     */
    @Override
    public CompletableFuture<UploadIndustryDeviceDataResponse> uploadIndustryDeviceData(UploadIndustryDeviceDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UploadIndustryDeviceData").setMethod(HttpMethod.POST).setPathRegex("/api/igate/timeseries/upload/pop/multifieldbatch").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UploadIndustryDeviceDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UploadIndustryDeviceDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
