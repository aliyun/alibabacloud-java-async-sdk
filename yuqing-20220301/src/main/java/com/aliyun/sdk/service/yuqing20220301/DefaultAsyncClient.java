// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yuqing20220301;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.yuqing20220301.models.*;
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
        this.product = "Yuqing";
        this.version = "2022-03-01";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of CloseProduct  CloseProductRequest
     * @return CloseProductResponse
     */
    @Override
    public CompletableFuture<CloseProductResponse> closeProduct(CloseProductRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CloseProduct").setMethod(HttpMethod.POST).setPathRegex("/openapi/aliyun/closeProduct.json").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloseProductResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloseProductResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ConsoleApiProxy  ConsoleApiProxyRequest
     * @return ConsoleApiProxyResponse
     */
    @Override
    public CompletableFuture<ConsoleApiProxyResponse> consoleApiProxy(ConsoleApiProxyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ConsoleApiProxy").setMethod(HttpMethod.POST).setPathRegex("/openapi/aliyun/consoleApiProxy.json").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ConsoleApiProxyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ConsoleApiProxyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI ConsoleProxy is deprecated  * @param request  the request parameters of ConsoleProxy  ConsoleProxyRequest
     * @return ConsoleProxyResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<ConsoleProxyResponse> consoleProxy(ConsoleProxyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ConsoleProxy").setMethod(HttpMethod.POST).setPathRegex("/openapi/aliyun/consoleProxy.json").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ConsoleProxyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ConsoleProxyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAnalysisTaskResult  GetAnalysisTaskResultRequest
     * @return GetAnalysisTaskResultResponse
     */
    @Override
    public CompletableFuture<GetAnalysisTaskResultResponse> getAnalysisTaskResult(GetAnalysisTaskResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAnalysisTaskResult").setMethod(HttpMethod.GET).setPathRegex("/openapi/aliyun/getAnalysisComponentResult.json").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAnalysisTaskResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAnalysisTaskResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OpenProduct  OpenProductRequest
     * @return OpenProductResponse
     */
    @Override
    public CompletableFuture<OpenProductResponse> openProduct(OpenProductRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("OpenProduct").setMethod(HttpMethod.POST).setPathRegex("/openapi/aliyun/openProduct.json").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OpenProductResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OpenProductResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryProductInstanceList  QueryProductInstanceListRequest
     * @return QueryProductInstanceListResponse
     */
    @Override
    public CompletableFuture<QueryProductInstanceListResponse> queryProductInstanceList(QueryProductInstanceListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryProductInstanceList").setMethod(HttpMethod.GET).setPathRegex("/openapi/aliyun/queryProductInstanceList.json").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryProductInstanceListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryProductInstanceListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryYuqingMessage  QueryYuqingMessageRequest
     * @return QueryYuqingMessageResponse
     */
    @Override
    public CompletableFuture<QueryYuqingMessageResponse> queryYuqingMessage(QueryYuqingMessageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryYuqingMessage").setMethod(HttpMethod.POST).setPathRegex("/openapi/aliyun/queryYuqingMessage.json").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryYuqingMessageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryYuqingMessageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitAnalysisTask  SubmitAnalysisTaskRequest
     * @return SubmitAnalysisTaskResponse
     */
    @Override
    public CompletableFuture<SubmitAnalysisTaskResponse> submitAnalysisTask(SubmitAnalysisTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SubmitAnalysisTask").setMethod(HttpMethod.POST).setPathRegex("/openapi/aliyun/submitAnalysisComponent.json").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitAnalysisTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitAnalysisTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
