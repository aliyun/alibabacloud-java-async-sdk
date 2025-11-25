// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.anytrans20250707;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.anytrans20250707.models.*;
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
        this.product = "AnyTrans";
        this.version = "2025-07-07";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of BatchTranslate  BatchTranslateRequest
     * @return BatchTranslateResponse
     */
    @Override
    public CompletableFuture<BatchTranslateResponse> batchTranslate(BatchTranslateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("BatchTranslate").setMethod(HttpMethod.POST).setPathRegex("/anytrans/translate/batch").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchTranslateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchTranslateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchTranslateForHtml  BatchTranslateForHtmlRequest
     * @return BatchTranslateForHtmlResponse
     */
    @Override
    public CompletableFuture<BatchTranslateForHtmlResponse> batchTranslateForHtml(BatchTranslateForHtmlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("BatchTranslateForHtml").setMethod(HttpMethod.POST).setPathRegex("/anytrans/translate/batchForHtml").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchTranslateForHtmlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchTranslateForHtmlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDocTranslateTask  GetDocTranslateTaskRequest
     * @return GetDocTranslateTaskResponse
     */
    @Override
    public CompletableFuture<GetDocTranslateTaskResponse> getDocTranslateTask(GetDocTranslateTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDocTranslateTask").setMethod(HttpMethod.POST).setPathRegex("/anytrans/translate/doc/get").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDocTranslateTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDocTranslateTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHtmlTranslateTask  GetHtmlTranslateTaskRequest
     * @return GetHtmlTranslateTaskResponse
     */
    @Override
    public CompletableFuture<GetHtmlTranslateTaskResponse> getHtmlTranslateTask(GetHtmlTranslateTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetHtmlTranslateTask").setMethod(HttpMethod.POST).setPathRegex("/anytrans/translate/html/get").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHtmlTranslateTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHtmlTranslateTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetImageTranslateTask  GetImageTranslateTaskRequest
     * @return GetImageTranslateTaskResponse
     */
    @Override
    public CompletableFuture<GetImageTranslateTaskResponse> getImageTranslateTask(GetImageTranslateTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetImageTranslateTask").setMethod(HttpMethod.POST).setPathRegex("/anytrans/translate/image/get").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetImageTranslateTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetImageTranslateTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLongTextTranslateTask  GetLongTextTranslateTaskRequest
     * @return GetLongTextTranslateTaskResponse
     */
    @Override
    public CompletableFuture<GetLongTextTranslateTaskResponse> getLongTextTranslateTask(GetLongTextTranslateTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetLongTextTranslateTask").setMethod(HttpMethod.POST).setPathRegex("/anytrans/translate/longText/get").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLongTextTranslateTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLongTextTranslateTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitDocTranslateTask  SubmitDocTranslateTaskRequest
     * @return SubmitDocTranslateTaskResponse
     */
    @Override
    public CompletableFuture<SubmitDocTranslateTaskResponse> submitDocTranslateTask(SubmitDocTranslateTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SubmitDocTranslateTask").setMethod(HttpMethod.POST).setPathRegex("/anytrans/translate/doc/submit").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitDocTranslateTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitDocTranslateTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitHtmlTranslateTask  SubmitHtmlTranslateTaskRequest
     * @return SubmitHtmlTranslateTaskResponse
     */
    @Override
    public CompletableFuture<SubmitHtmlTranslateTaskResponse> submitHtmlTranslateTask(SubmitHtmlTranslateTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SubmitHtmlTranslateTask").setMethod(HttpMethod.POST).setPathRegex("/anytrans/translate/html/submit").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitHtmlTranslateTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitHtmlTranslateTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitImageTranslateTask  SubmitImageTranslateTaskRequest
     * @return SubmitImageTranslateTaskResponse
     */
    @Override
    public CompletableFuture<SubmitImageTranslateTaskResponse> submitImageTranslateTask(SubmitImageTranslateTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SubmitImageTranslateTask").setMethod(HttpMethod.POST).setPathRegex("/anytrans/translate/image/submit").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitImageTranslateTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitImageTranslateTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitLongTextTranslateTask  SubmitLongTextTranslateTaskRequest
     * @return SubmitLongTextTranslateTaskResponse
     */
    @Override
    public CompletableFuture<SubmitLongTextTranslateTaskResponse> submitLongTextTranslateTask(SubmitLongTextTranslateTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SubmitLongTextTranslateTask").setMethod(HttpMethod.POST).setPathRegex("/anytrans/translate/longText/submit").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitLongTextTranslateTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitLongTextTranslateTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TermEdit  TermEditRequest
     * @return TermEditResponse
     */
    @Override
    public CompletableFuture<TermEditResponse> termEdit(TermEditRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TermEdit").setMethod(HttpMethod.POST).setPathRegex("/anytrans/translate/intervene/edit").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TermEditResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TermEditResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TermQuery  TermQueryRequest
     * @return TermQueryResponse
     */
    @Override
    public CompletableFuture<TermQueryResponse> termQuery(TermQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TermQuery").setMethod(HttpMethod.POST).setPathRegex("/anytrans/translate/intervene/query").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TermQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TermQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TextTranslate  TextTranslateRequest
     * @return TextTranslateResponse
     */
    @Override
    public CompletableFuture<TextTranslateResponse> textTranslate(TextTranslateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TextTranslate").setMethod(HttpMethod.POST).setPathRegex("/anytrans/translate/text").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TextTranslateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TextTranslateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
