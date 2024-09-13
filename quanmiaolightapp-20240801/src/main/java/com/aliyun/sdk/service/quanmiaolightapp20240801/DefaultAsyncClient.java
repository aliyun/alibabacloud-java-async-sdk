// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quanmiaolightapp20240801;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.quanmiaolightapp20240801.models.*;
import darabonba.core.sse.SSEHttpResponseHandler;
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
        this.product = "QuanMiaoLightApp";
        this.version = "2024-08-01";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    @Override
    public CompletableFuture<ListHotTopicSummariesResponse> listHotTopicSummaries(ListHotTopicSummariesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListHotTopicSummaries").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/quanmiao/lightapp/listHotTopicSummaries").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListHotTopicSummariesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListHotTopicSummariesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<RunMarketingInformationExtractResponse> runMarketingInformationExtract(RunMarketingInformationExtractRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RunMarketingInformationExtract").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/quanmiao/lightapp/runMarketingInformationExtract").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RunMarketingInformationExtractResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RunMarketingInformationExtractResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public <ReturnT> CompletableFuture<ReturnT> runMarketingInformationExtractWithAsyncResponseHandler(RunMarketingInformationExtractRequest request, AsyncResponseHandler<RunMarketingInformationExtractResponse, ReturnT> responseHandler) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RunMarketingInformationExtract").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/quanmiao/lightapp/runMarketingInformationExtract").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withResponseHandler(responseHandler).withOutput(RunMarketingInformationExtractResponse.create());
            return this.handler.execute(params)
                    .thenCompose((output) -> CompletableFuture.completedFuture(responseHandler.transform((RunMarketingInformationExtractResponse)output)));
        } catch (Exception e) {
            CompletableFuture<ReturnT> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<RunMarketingInformationExtractResponseBody> runMarketingInformationExtractWithResponseIterable(RunMarketingInformationExtractRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("RunMarketingInformationExtract").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/quanmiao/lightapp/runMarketingInformationExtract").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
        RunMarketingInformationExtractResponseBodyIterator iterator = RunMarketingInformationExtractResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    @Override
    public CompletableFuture<RunMarketingInformationWritingResponse> runMarketingInformationWriting(RunMarketingInformationWritingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RunMarketingInformationWriting").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/quanmiao/lightapp/runMarketingInformationWriting").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RunMarketingInformationWritingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RunMarketingInformationWritingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public <ReturnT> CompletableFuture<ReturnT> runMarketingInformationWritingWithAsyncResponseHandler(RunMarketingInformationWritingRequest request, AsyncResponseHandler<RunMarketingInformationWritingResponse, ReturnT> responseHandler) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RunMarketingInformationWriting").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/quanmiao/lightapp/runMarketingInformationWriting").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withResponseHandler(responseHandler).withOutput(RunMarketingInformationWritingResponse.create());
            return this.handler.execute(params)
                    .thenCompose((output) -> CompletableFuture.completedFuture(responseHandler.transform((RunMarketingInformationWritingResponse)output)));
        } catch (Exception e) {
            CompletableFuture<ReturnT> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<RunMarketingInformationWritingResponseBody> runMarketingInformationWritingWithResponseIterable(RunMarketingInformationWritingRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("RunMarketingInformationWriting").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/quanmiao/lightapp/runMarketingInformationWriting").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
        RunMarketingInformationWritingResponseBodyIterator iterator = RunMarketingInformationWritingResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    @Override
    public CompletableFuture<RunScriptContinueResponse> runScriptContinue(RunScriptContinueRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RunScriptContinue").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/quanmiao/lightapp/runScriptContinue").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RunScriptContinueResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RunScriptContinueResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public <ReturnT> CompletableFuture<ReturnT> runScriptContinueWithAsyncResponseHandler(RunScriptContinueRequest request, AsyncResponseHandler<RunScriptContinueResponse, ReturnT> responseHandler) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RunScriptContinue").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/quanmiao/lightapp/runScriptContinue").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withResponseHandler(responseHandler).withOutput(RunScriptContinueResponse.create());
            return this.handler.execute(params)
                    .thenCompose((output) -> CompletableFuture.completedFuture(responseHandler.transform((RunScriptContinueResponse)output)));
        } catch (Exception e) {
            CompletableFuture<ReturnT> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<RunScriptContinueResponseBody> runScriptContinueWithResponseIterable(RunScriptContinueRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("RunScriptContinue").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/quanmiao/lightapp/runScriptContinue").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
        RunScriptContinueResponseBodyIterator iterator = RunScriptContinueResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    @Override
    public CompletableFuture<RunScriptPlanningResponse> runScriptPlanning(RunScriptPlanningRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RunScriptPlanning").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/quanmiao/lightapp/runScriptPlanning").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RunScriptPlanningResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RunScriptPlanningResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public <ReturnT> CompletableFuture<ReturnT> runScriptPlanningWithAsyncResponseHandler(RunScriptPlanningRequest request, AsyncResponseHandler<RunScriptPlanningResponse, ReturnT> responseHandler) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RunScriptPlanning").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/quanmiao/lightapp/runScriptPlanning").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withResponseHandler(responseHandler).withOutput(RunScriptPlanningResponse.create());
            return this.handler.execute(params)
                    .thenCompose((output) -> CompletableFuture.completedFuture(responseHandler.transform((RunScriptPlanningResponse)output)));
        } catch (Exception e) {
            CompletableFuture<ReturnT> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<RunScriptPlanningResponseBody> runScriptPlanningWithResponseIterable(RunScriptPlanningRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("RunScriptPlanning").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/quanmiao/lightapp/runScriptPlanning").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
        RunScriptPlanningResponseBodyIterator iterator = RunScriptPlanningResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    @Override
    public CompletableFuture<RunStyleWritingResponse> runStyleWriting(RunStyleWritingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RunStyleWriting").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/quanmiao/lightapp/runStyleWriting").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RunStyleWritingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RunStyleWritingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public <ReturnT> CompletableFuture<ReturnT> runStyleWritingWithAsyncResponseHandler(RunStyleWritingRequest request, AsyncResponseHandler<RunStyleWritingResponse, ReturnT> responseHandler) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RunStyleWriting").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/quanmiao/lightapp/runStyleWriting").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withResponseHandler(responseHandler).withOutput(RunStyleWritingResponse.create());
            return this.handler.execute(params)
                    .thenCompose((output) -> CompletableFuture.completedFuture(responseHandler.transform((RunStyleWritingResponse)output)));
        } catch (Exception e) {
            CompletableFuture<ReturnT> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<RunStyleWritingResponseBody> runStyleWritingWithResponseIterable(RunStyleWritingRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("RunStyleWriting").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/quanmiao/lightapp/runStyleWriting").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
        RunStyleWritingResponseBodyIterator iterator = RunStyleWritingResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    @Override
    public CompletableFuture<RunVideoAnalysisResponse> runVideoAnalysis(RunVideoAnalysisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RunVideoAnalysis").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/quanmiao/lightapp/runVideoAnalysis").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RunVideoAnalysisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RunVideoAnalysisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public <ReturnT> CompletableFuture<ReturnT> runVideoAnalysisWithAsyncResponseHandler(RunVideoAnalysisRequest request, AsyncResponseHandler<RunVideoAnalysisResponse, ReturnT> responseHandler) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RunVideoAnalysis").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/quanmiao/lightapp/runVideoAnalysis").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withResponseHandler(responseHandler).withOutput(RunVideoAnalysisResponse.create());
            return this.handler.execute(params)
                    .thenCompose((output) -> CompletableFuture.completedFuture(responseHandler.transform((RunVideoAnalysisResponse)output)));
        } catch (Exception e) {
            CompletableFuture<ReturnT> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<RunVideoAnalysisResponseBody> runVideoAnalysisWithResponseIterable(RunVideoAnalysisRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("RunVideoAnalysis").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/quanmiao/lightapp/runVideoAnalysis").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
        RunVideoAnalysisResponseBodyIterator iterator = RunVideoAnalysisResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

}
