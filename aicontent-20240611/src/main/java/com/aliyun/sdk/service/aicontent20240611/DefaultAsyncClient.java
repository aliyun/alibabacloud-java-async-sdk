// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.aicontent20240611.models.*;
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
        this.product = "AiContent";
        this.version = "20240611";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AliyunConsoleOpenApiQueryAliyunConsoleServcieList  AliyunConsoleOpenApiQueryAliyunConsoleServcieListRequest
     * @return AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse
     */
    @Override
    public CompletableFuture<AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse> aliyunConsoleOpenApiQueryAliyunConsoleServcieList(AliyunConsoleOpenApiQueryAliyunConsoleServcieListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AliyunConsoleOpenApiQueryAliyunConsoleServcieList").setMethod(HttpMethod.GET).setPathRegex("/api/v1/aliyunconsole/queryAliyunConsoleServcieList").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AliyunConsoleOpenApiQueryAliyunConsoleServiceList  AliyunConsoleOpenApiQueryAliyunConsoleServiceListRequest
     * @return AliyunConsoleOpenApiQueryAliyunConsoleServiceListResponse
     */
    @Override
    public CompletableFuture<AliyunConsoleOpenApiQueryAliyunConsoleServiceListResponse> aliyunConsoleOpenApiQueryAliyunConsoleServiceList(AliyunConsoleOpenApiQueryAliyunConsoleServiceListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AliyunConsoleOpenApiQueryAliyunConsoleServiceList").setMethod(HttpMethod.GET).setPathRegex("/api/v1/aliyunconsole/queryAliyunConsoleServiceList").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AliyunConsoleOpenApiQueryAliyunConsoleServiceListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AliyunConsoleOpenApiQueryAliyunConsoleServiceListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PersonalizedTextToImageAddInferenceJob  PersonalizedTextToImageAddInferenceJobRequest
     * @return PersonalizedTextToImageAddInferenceJobResponse
     */
    @Override
    public CompletableFuture<PersonalizedTextToImageAddInferenceJobResponse> personalizedTextToImageAddInferenceJob(PersonalizedTextToImageAddInferenceJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PersonalizedTextToImageAddInferenceJob").setMethod(HttpMethod.POST).setPathRegex("/api/v1/personalizedtxt2img/addPreModelInferenceJob").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PersonalizedTextToImageAddInferenceJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PersonalizedTextToImageAddInferenceJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PersonalizedTextToImageQueryImageAsset  PersonalizedTextToImageQueryImageAssetRequest
     * @return PersonalizedTextToImageQueryImageAssetResponse
     */
    @Override
    public CompletableFuture<PersonalizedTextToImageQueryImageAssetResponse> personalizedTextToImageQueryImageAsset(PersonalizedTextToImageQueryImageAssetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PersonalizedTextToImageQueryImageAsset").setMethod(HttpMethod.GET).setPathRegex("/api/v1/personalizedtxt2img/queryImageAssetFromImageId").setBodyType(BodyType.ANY).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PersonalizedTextToImageQueryImageAssetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PersonalizedTextToImageQueryImageAssetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PersonalizedTextToImageQueryPreModelInferenceJobInfo  PersonalizedTextToImageQueryPreModelInferenceJobInfoRequest
     * @return PersonalizedTextToImageQueryPreModelInferenceJobInfoResponse
     */
    @Override
    public CompletableFuture<PersonalizedTextToImageQueryPreModelInferenceJobInfoResponse> personalizedTextToImageQueryPreModelInferenceJobInfo(PersonalizedTextToImageQueryPreModelInferenceJobInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PersonalizedTextToImageQueryPreModelInferenceJobInfo").setMethod(HttpMethod.GET).setPathRegex("/api/v1/personalizedtxt2img/queryPreModelInferenceJobInfo").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PersonalizedTextToImageQueryPreModelInferenceJobInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PersonalizedTextToImageQueryPreModelInferenceJobInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of Personalizedtxt2imgAddInferenceJob  Personalizedtxt2imgAddInferenceJobRequest
     * @return Personalizedtxt2imgAddInferenceJobResponse
     */
    @Override
    public CompletableFuture<Personalizedtxt2imgAddInferenceJobResponse> personalizedtxt2imgAddInferenceJob(Personalizedtxt2imgAddInferenceJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("Personalizedtxt2imgAddInferenceJob").setMethod(HttpMethod.POST).setPathRegex("/api/v1/personalizedtxt2img/addInferenceJob").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(Personalizedtxt2imgAddInferenceJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<Personalizedtxt2imgAddInferenceJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of Personalizedtxt2imgAddModelTrainJob  Personalizedtxt2imgAddModelTrainJobRequest
     * @return Personalizedtxt2imgAddModelTrainJobResponse
     */
    @Override
    public CompletableFuture<Personalizedtxt2imgAddModelTrainJobResponse> personalizedtxt2imgAddModelTrainJob(Personalizedtxt2imgAddModelTrainJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("Personalizedtxt2imgAddModelTrainJob").setMethod(HttpMethod.POST).setPathRegex("/api/v1/personalizedtxt2img/addModelTrainJob").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(Personalizedtxt2imgAddModelTrainJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<Personalizedtxt2imgAddModelTrainJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of Personalizedtxt2imgQueryImageAsset  Personalizedtxt2imgQueryImageAssetRequest
     * @return Personalizedtxt2imgQueryImageAssetResponse
     */
    @Override
    public CompletableFuture<Personalizedtxt2imgQueryImageAssetResponse> personalizedtxt2imgQueryImageAsset(Personalizedtxt2imgQueryImageAssetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("Personalizedtxt2imgQueryImageAsset").setMethod(HttpMethod.GET).setPathRegex("/api/v1/personalizedtxt2img/queryImageAsset").setBodyType(BodyType.ANY).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(Personalizedtxt2imgQueryImageAssetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<Personalizedtxt2imgQueryImageAssetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of Personalizedtxt2imgQueryInferenceJobInfo  Personalizedtxt2imgQueryInferenceJobInfoRequest
     * @return Personalizedtxt2imgQueryInferenceJobInfoResponse
     */
    @Override
    public CompletableFuture<Personalizedtxt2imgQueryInferenceJobInfoResponse> personalizedtxt2imgQueryInferenceJobInfo(Personalizedtxt2imgQueryInferenceJobInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("Personalizedtxt2imgQueryInferenceJobInfo").setMethod(HttpMethod.GET).setPathRegex("/api/v1/personalizedtxt2img/queryInferenceJobInfo").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(Personalizedtxt2imgQueryInferenceJobInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<Personalizedtxt2imgQueryInferenceJobInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of Personalizedtxt2imgQueryModelTrainJobList  Personalizedtxt2imgQueryModelTrainJobListRequest
     * @return Personalizedtxt2imgQueryModelTrainJobListResponse
     */
    @Override
    public CompletableFuture<Personalizedtxt2imgQueryModelTrainJobListResponse> personalizedtxt2imgQueryModelTrainJobList(Personalizedtxt2imgQueryModelTrainJobListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("Personalizedtxt2imgQueryModelTrainJobList").setMethod(HttpMethod.GET).setPathRegex("/api/v1/personalizedtxt2img/queryModelTrainJobList").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(Personalizedtxt2imgQueryModelTrainJobListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<Personalizedtxt2imgQueryModelTrainJobListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of Personalizedtxt2imgQueryModelTrainStatus  Personalizedtxt2imgQueryModelTrainStatusRequest
     * @return Personalizedtxt2imgQueryModelTrainStatusResponse
     */
    @Override
    public CompletableFuture<Personalizedtxt2imgQueryModelTrainStatusResponse> personalizedtxt2imgQueryModelTrainStatus(Personalizedtxt2imgQueryModelTrainStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("Personalizedtxt2imgQueryModelTrainStatus").setMethod(HttpMethod.GET).setPathRegex("/api/v1/personalizedtxt2img/queryModelTrainStatus").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(Personalizedtxt2imgQueryModelTrainStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<Personalizedtxt2imgQueryModelTrainStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
