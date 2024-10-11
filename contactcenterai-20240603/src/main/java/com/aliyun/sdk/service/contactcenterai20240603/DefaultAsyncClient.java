// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.contactcenterai20240603;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.contactcenterai20240603.models.*;
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
        this.product = "ContactCenterAI";
        this.version = "2024-06-03";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AnalyzeConversation  AnalyzeConversationRequest
     * @return AnalyzeConversationResponse
     */
    @Override
    public CompletableFuture<AnalyzeConversationResponse> analyzeConversation(AnalyzeConversationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AnalyzeConversation").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/ccai/app/{appId}/analyze_conversation").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AnalyzeConversationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AnalyzeConversationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public <ReturnT> CompletableFuture<ReturnT> analyzeConversationWithAsyncResponseHandler(AnalyzeConversationRequest request, AsyncResponseHandler<AnalyzeConversationResponse, ReturnT> responseHandler) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AnalyzeConversation").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/ccai/app/{appId}/analyze_conversation").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withResponseHandler(responseHandler).withOutput(AnalyzeConversationResponse.create());
            return this.handler.execute(params)
                    .thenCompose((output) -> CompletableFuture.completedFuture(responseHandler.transform((AnalyzeConversationResponse)output)));
        } catch (Exception e) {
            CompletableFuture<ReturnT> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<AnalyzeConversationResponseBody> analyzeConversationWithResponseIterable(AnalyzeConversationRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("AnalyzeConversation").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/ccai/app/{appId}/analyze_conversation").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
        AnalyzeConversationResponseBodyIterator iterator = AnalyzeConversationResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * @param request the request parameters of CreateConversationAnalysisTask  CreateConversationAnalysisTaskRequest
     * @return CreateConversationAnalysisTaskResponse
     */
    @Override
    public CompletableFuture<CreateConversationAnalysisTaskResponse> createConversationAnalysisTask(CreateConversationAnalysisTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateConversationAnalysisTask").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/ccai/app/{appId}/createConversationAnalysisTask").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateConversationAnalysisTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateConversationAnalysisTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateTask  CreateTaskRequest
     * @return CreateTaskResponse
     */
    @Override
    public CompletableFuture<CreateTaskResponse> createTask(CreateTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateTask").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/ccai/app/{appId}/createTask").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTaskResult  GetTaskResultRequest
     * @return GetTaskResultResponse
     */
    @Override
    public CompletableFuture<GetTaskResultResponse> getTaskResult(GetTaskResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTaskResult").setMethod(HttpMethod.GET).setPathRegex("/ccai/app/getTaskResult").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTaskResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTaskResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RunCompletion  RunCompletionRequest
     * @return RunCompletionResponse
     */
    @Override
    public CompletableFuture<RunCompletionResponse> runCompletion(RunCompletionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RunCompletion").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/ccai/app/{appId}/completion").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RunCompletionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RunCompletionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<RunCompletionResponseBody> runCompletionWithResponseIterable(RunCompletionRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("RunCompletion").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/ccai/app/{appId}/completion").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
        RunCompletionResponseBodyIterator iterator = RunCompletionResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * @param request the request parameters of RunCompletionMessage  RunCompletionMessageRequest
     * @return RunCompletionMessageResponse
     */
    @Override
    public CompletableFuture<RunCompletionMessageResponse> runCompletionMessage(RunCompletionMessageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RunCompletionMessage").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/ccai/app/{appId}/completion_message").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RunCompletionMessageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RunCompletionMessageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<RunCompletionMessageResponseBody> runCompletionMessageWithResponseIterable(RunCompletionMessageRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("RunCompletionMessage").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/ccai/app/{appId}/completion_message").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
        RunCompletionMessageResponseBodyIterator iterator = RunCompletionMessageResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

}
