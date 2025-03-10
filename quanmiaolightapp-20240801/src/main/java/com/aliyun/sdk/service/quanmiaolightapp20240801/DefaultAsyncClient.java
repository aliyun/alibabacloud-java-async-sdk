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

    /**
     * @param request the request parameters of GenerateBroadcastNews  GenerateBroadcastNewsRequest
     * @return GenerateBroadcastNewsResponse
     */
    @Override
    public CompletableFuture<GenerateBroadcastNewsResponse> generateBroadcastNews(GenerateBroadcastNewsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GenerateBroadcastNews").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/quanmiao/lightapp/GenerateBroadcastNews").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateBroadcastNewsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateBroadcastNewsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GenerateOutputFormat  GenerateOutputFormatRequest
     * @return GenerateOutputFormatResponse
     */
    @Override
    public CompletableFuture<GenerateOutputFormatResponse> generateOutputFormat(GenerateOutputFormatRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GenerateOutputFormat").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/quanmiao/lightapp/generateOutputFormat").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateOutputFormatResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateOutputFormatResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTagMiningAnalysisTask  GetTagMiningAnalysisTaskRequest
     * @return GetTagMiningAnalysisTaskResponse
     */
    @Override
    public CompletableFuture<GetTagMiningAnalysisTaskResponse> getTagMiningAnalysisTask(GetTagMiningAnalysisTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTagMiningAnalysisTask").setMethod(HttpMethod.GET).setPathRegex("/{workspaceId}/quanmiao/lightapp/getTagMiningAnalysisTask").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTagMiningAnalysisTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTagMiningAnalysisTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetVideoAnalysisConfig  GetVideoAnalysisConfigRequest
     * @return GetVideoAnalysisConfigResponse
     */
    @Override
    public CompletableFuture<GetVideoAnalysisConfigResponse> getVideoAnalysisConfig(GetVideoAnalysisConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetVideoAnalysisConfig").setMethod(HttpMethod.GET).setPathRegex("/{workspaceId}/quanmiao/lightapp/videoAnalysis/getVideoAnalysisConfig").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetVideoAnalysisConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetVideoAnalysisConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetVideoAnalysisTask  GetVideoAnalysisTaskRequest
     * @return GetVideoAnalysisTaskResponse
     */
    @Override
    public CompletableFuture<GetVideoAnalysisTaskResponse> getVideoAnalysisTask(GetVideoAnalysisTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetVideoAnalysisTask").setMethod(HttpMethod.GET).setPathRegex("/{workspaceId}/quanmiao/lightapp/videoAnalysis/getVideoAnalysisTask").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetVideoAnalysisTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetVideoAnalysisTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListHotTopicSummaries  ListHotTopicSummariesRequest
     * @return ListHotTopicSummariesResponse
     */
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

    /**
     * @param request the request parameters of RunHotTopicChat  RunHotTopicChatRequest
     * @return RunHotTopicChatResponse
     */
    @Override
    public CompletableFuture<RunHotTopicChatResponse> runHotTopicChat(RunHotTopicChatRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RunHotTopicChat").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/quanmiao/lightapp/runHotTopicChat").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RunHotTopicChatResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RunHotTopicChatResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public <ReturnT> CompletableFuture<ReturnT> runHotTopicChatWithAsyncResponseHandler(RunHotTopicChatRequest request, AsyncResponseHandler<RunHotTopicChatResponse, ReturnT> responseHandler) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RunHotTopicChat").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/quanmiao/lightapp/runHotTopicChat").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withResponseHandler(responseHandler).withOutput(RunHotTopicChatResponse.create());
            return this.handler.execute(params)
                    .thenCompose((output) -> CompletableFuture.completedFuture(responseHandler.transform((RunHotTopicChatResponse)output)));
        } catch (Exception e) {
            CompletableFuture<ReturnT> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<RunHotTopicChatResponseBody> runHotTopicChatWithResponseIterable(RunHotTopicChatRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("RunHotTopicChat").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/quanmiao/lightapp/runHotTopicChat").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
        RunHotTopicChatResponseBodyIterator iterator = RunHotTopicChatResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * @param request the request parameters of RunHotTopicSummary  RunHotTopicSummaryRequest
     * @return RunHotTopicSummaryResponse
     */
    @Override
    public CompletableFuture<RunHotTopicSummaryResponse> runHotTopicSummary(RunHotTopicSummaryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RunHotTopicSummary").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/quanmiao/lightapp/runHotTopicSummary").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RunHotTopicSummaryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RunHotTopicSummaryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public <ReturnT> CompletableFuture<ReturnT> runHotTopicSummaryWithAsyncResponseHandler(RunHotTopicSummaryRequest request, AsyncResponseHandler<RunHotTopicSummaryResponse, ReturnT> responseHandler) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RunHotTopicSummary").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/quanmiao/lightapp/runHotTopicSummary").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withResponseHandler(responseHandler).withOutput(RunHotTopicSummaryResponse.create());
            return this.handler.execute(params)
                    .thenCompose((output) -> CompletableFuture.completedFuture(responseHandler.transform((RunHotTopicSummaryResponse)output)));
        } catch (Exception e) {
            CompletableFuture<ReturnT> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<RunHotTopicSummaryResponseBody> runHotTopicSummaryWithResponseIterable(RunHotTopicSummaryRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("RunHotTopicSummary").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/quanmiao/lightapp/runHotTopicSummary").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
        RunHotTopicSummaryResponseBodyIterator iterator = RunHotTopicSummaryResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * @param request the request parameters of RunMarketingInformationExtract  RunMarketingInformationExtractRequest
     * @return RunMarketingInformationExtractResponse
     */
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

    /**
     * @param request the request parameters of RunMarketingInformationWriting  RunMarketingInformationWritingRequest
     * @return RunMarketingInformationWritingResponse
     */
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

    /**
     * @param request the request parameters of RunNetworkContentAudit  RunNetworkContentAuditRequest
     * @return RunNetworkContentAuditResponse
     */
    @Override
    public CompletableFuture<RunNetworkContentAuditResponse> runNetworkContentAudit(RunNetworkContentAuditRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RunNetworkContentAudit").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/quanmiao/lightapp/runNetworkContentAudit").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RunNetworkContentAuditResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RunNetworkContentAuditResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public <ReturnT> CompletableFuture<ReturnT> runNetworkContentAuditWithAsyncResponseHandler(RunNetworkContentAuditRequest request, AsyncResponseHandler<RunNetworkContentAuditResponse, ReturnT> responseHandler) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RunNetworkContentAudit").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/quanmiao/lightapp/runNetworkContentAudit").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withResponseHandler(responseHandler).withOutput(RunNetworkContentAuditResponse.create());
            return this.handler.execute(params)
                    .thenCompose((output) -> CompletableFuture.completedFuture(responseHandler.transform((RunNetworkContentAuditResponse)output)));
        } catch (Exception e) {
            CompletableFuture<ReturnT> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<RunNetworkContentAuditResponseBody> runNetworkContentAuditWithResponseIterable(RunNetworkContentAuditRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("RunNetworkContentAudit").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/quanmiao/lightapp/runNetworkContentAudit").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
        RunNetworkContentAuditResponseBodyIterator iterator = RunNetworkContentAuditResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * @param request the request parameters of RunScriptChat  RunScriptChatRequest
     * @return RunScriptChatResponse
     */
    @Override
    public CompletableFuture<RunScriptChatResponse> runScriptChat(RunScriptChatRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RunScriptChat").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/quanmiao/lightapp/runScriptChat").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RunScriptChatResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RunScriptChatResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public <ReturnT> CompletableFuture<ReturnT> runScriptChatWithAsyncResponseHandler(RunScriptChatRequest request, AsyncResponseHandler<RunScriptChatResponse, ReturnT> responseHandler) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RunScriptChat").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/quanmiao/lightapp/runScriptChat").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withResponseHandler(responseHandler).withOutput(RunScriptChatResponse.create());
            return this.handler.execute(params)
                    .thenCompose((output) -> CompletableFuture.completedFuture(responseHandler.transform((RunScriptChatResponse)output)));
        } catch (Exception e) {
            CompletableFuture<ReturnT> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<RunScriptChatResponseBody> runScriptChatWithResponseIterable(RunScriptChatRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("RunScriptChat").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/quanmiao/lightapp/runScriptChat").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
        RunScriptChatResponseBodyIterator iterator = RunScriptChatResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * @param request the request parameters of RunScriptContinue  RunScriptContinueRequest
     * @return RunScriptContinueResponse
     */
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

    /**
     * @param request the request parameters of RunScriptPlanning  RunScriptPlanningRequest
     * @return RunScriptPlanningResponse
     */
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

    /**
     * @param request the request parameters of RunScriptRefine  RunScriptRefineRequest
     * @return RunScriptRefineResponse
     */
    @Override
    public CompletableFuture<RunScriptRefineResponse> runScriptRefine(RunScriptRefineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RunScriptRefine").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/quanmiao/lightapp/runScriptRefine").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RunScriptRefineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RunScriptRefineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public <ReturnT> CompletableFuture<ReturnT> runScriptRefineWithAsyncResponseHandler(RunScriptRefineRequest request, AsyncResponseHandler<RunScriptRefineResponse, ReturnT> responseHandler) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RunScriptRefine").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/quanmiao/lightapp/runScriptRefine").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withResponseHandler(responseHandler).withOutput(RunScriptRefineResponse.create());
            return this.handler.execute(params)
                    .thenCompose((output) -> CompletableFuture.completedFuture(responseHandler.transform((RunScriptRefineResponse)output)));
        } catch (Exception e) {
            CompletableFuture<ReturnT> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<RunScriptRefineResponseBody> runScriptRefineWithResponseIterable(RunScriptRefineRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("RunScriptRefine").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/quanmiao/lightapp/runScriptRefine").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
        RunScriptRefineResponseBodyIterator iterator = RunScriptRefineResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * @param request the request parameters of RunStyleWriting  RunStyleWritingRequest
     * @return RunStyleWritingResponse
     */
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

    /**
     * @param request the request parameters of RunTagMiningAnalysis  RunTagMiningAnalysisRequest
     * @return RunTagMiningAnalysisResponse
     */
    @Override
    public CompletableFuture<RunTagMiningAnalysisResponse> runTagMiningAnalysis(RunTagMiningAnalysisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RunTagMiningAnalysis").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/quanmiao/lightapp/runTagMiningAnalysis").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RunTagMiningAnalysisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RunTagMiningAnalysisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public <ReturnT> CompletableFuture<ReturnT> runTagMiningAnalysisWithAsyncResponseHandler(RunTagMiningAnalysisRequest request, AsyncResponseHandler<RunTagMiningAnalysisResponse, ReturnT> responseHandler) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RunTagMiningAnalysis").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/quanmiao/lightapp/runTagMiningAnalysis").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withResponseHandler(responseHandler).withOutput(RunTagMiningAnalysisResponse.create());
            return this.handler.execute(params)
                    .thenCompose((output) -> CompletableFuture.completedFuture(responseHandler.transform((RunTagMiningAnalysisResponse)output)));
        } catch (Exception e) {
            CompletableFuture<ReturnT> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<RunTagMiningAnalysisResponseBody> runTagMiningAnalysisWithResponseIterable(RunTagMiningAnalysisRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("RunTagMiningAnalysis").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/quanmiao/lightapp/runTagMiningAnalysis").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
        RunTagMiningAnalysisResponseBodyIterator iterator = RunTagMiningAnalysisResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * @param request the request parameters of RunVideoAnalysis  RunVideoAnalysisRequest
     * @return RunVideoAnalysisResponse
     */
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

    /**
     * @param request the request parameters of SubmitTagMiningAnalysisTask  SubmitTagMiningAnalysisTaskRequest
     * @return SubmitTagMiningAnalysisTaskResponse
     */
    @Override
    public CompletableFuture<SubmitTagMiningAnalysisTaskResponse> submitTagMiningAnalysisTask(SubmitTagMiningAnalysisTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SubmitTagMiningAnalysisTask").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/quanmiao/lightapp/submitTagMiningAnalysisTask").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitTagMiningAnalysisTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitTagMiningAnalysisTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitVideoAnalysisTask  SubmitVideoAnalysisTaskRequest
     * @return SubmitVideoAnalysisTaskResponse
     */
    @Override
    public CompletableFuture<SubmitVideoAnalysisTaskResponse> submitVideoAnalysisTask(SubmitVideoAnalysisTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SubmitVideoAnalysisTask").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/quanmiao/lightapp/videoAnalysis/submitVideoAnalysisTask").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitVideoAnalysisTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitVideoAnalysisTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateVideoAnalysisConfig  UpdateVideoAnalysisConfigRequest
     * @return UpdateVideoAnalysisConfigResponse
     */
    @Override
    public CompletableFuture<UpdateVideoAnalysisConfigResponse> updateVideoAnalysisConfig(UpdateVideoAnalysisConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateVideoAnalysisConfig").setMethod(HttpMethod.PUT).setPathRegex("/{workspaceId}/quanmiao/lightapp/videoAnalysis/updateVideoAnalysisConfig").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateVideoAnalysisConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateVideoAnalysisConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
