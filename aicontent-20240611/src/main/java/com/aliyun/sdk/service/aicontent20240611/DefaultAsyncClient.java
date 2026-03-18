// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.aicontent20240611.models.*;
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
     * @param request the request parameters of AITeacherExpansionPracticeTaskGenerate  AITeacherExpansionPracticeTaskGenerateRequest
     * @return AITeacherExpansionPracticeTaskGenerateResponse
     */
    @Override
    public CompletableFuture<AITeacherExpansionPracticeTaskGenerateResponse> aITeacherExpansionPracticeTaskGenerate(AITeacherExpansionPracticeTaskGenerateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AITeacherExpansionPracticeTaskGenerate").setMethod(HttpMethod.POST).setPathRegex("/api/v1/aiteacher/expansionPractice/generateTask").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AITeacherExpansionPracticeTaskGenerateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AITeacherExpansionPracticeTaskGenerateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AITeacherSyncPracticeTaskGenerate  AITeacherSyncPracticeTaskGenerateRequest
     * @return AITeacherSyncPracticeTaskGenerateResponse
     */
    @Override
    public CompletableFuture<AITeacherSyncPracticeTaskGenerateResponse> aITeacherSyncPracticeTaskGenerate(AITeacherSyncPracticeTaskGenerateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AITeacherSyncPracticeTaskGenerate").setMethod(HttpMethod.POST).setPathRegex("/api/v1/aiteacher/syncPractice/generateTask").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AITeacherSyncPracticeTaskGenerateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AITeacherSyncPracticeTaskGenerateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AliyunConsoleOpenApiQueryAliyunConsoleServiceList").setMethod(HttpMethod.GET).setPathRegex("/api/v1/aliyunConsole/queryAliyunConsoleServiceList").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AliyunConsoleOpenApiQueryAliyunConsoleServiceListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AliyunConsoleOpenApiQueryAliyunConsoleServiceListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AliyunConsoleOpenApiQueryPaidResource  AliyunConsoleOpenApiQueryPaidResourceRequest
     * @return AliyunConsoleOpenApiQueryPaidResourceResponse
     */
    @Override
    public CompletableFuture<AliyunConsoleOpenApiQueryPaidResourceResponse> aliyunConsoleOpenApiQueryPaidResource(AliyunConsoleOpenApiQueryPaidResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AliyunConsoleOpenApiQueryPaidResource").setMethod(HttpMethod.GET).setPathRegex("/api/v1/aliyunConsole/queryPaidResource").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AliyunConsoleOpenApiQueryPaidResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AliyunConsoleOpenApiQueryPaidResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CountOralEvaluationStatisticsCalls  CountOralEvaluationStatisticsCallsRequest
     * @return CountOralEvaluationStatisticsCallsResponse
     */
    @Override
    public CompletableFuture<CountOralEvaluationStatisticsCallsResponse> countOralEvaluationStatisticsCalls(CountOralEvaluationStatisticsCallsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CountOralEvaluationStatisticsCalls").setMethod(HttpMethod.POST).setPathRegex("/api/v1/aliyunConsole/countOralEvaluationStatisticsCalls").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CountOralEvaluationStatisticsCallsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CountOralEvaluationStatisticsCallsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CountOralEvaluationStatisticsConcurrent  CountOralEvaluationStatisticsConcurrentRequest
     * @return CountOralEvaluationStatisticsConcurrentResponse
     */
    @Override
    public CompletableFuture<CountOralEvaluationStatisticsConcurrentResponse> countOralEvaluationStatisticsConcurrent(CountOralEvaluationStatisticsConcurrentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CountOralEvaluationStatisticsConcurrent").setMethod(HttpMethod.POST).setPathRegex("/api/v1/aliyunConsole/countOralEvaluationStatisticsConcurrent").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CountOralEvaluationStatisticsConcurrentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CountOralEvaluationStatisticsConcurrentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CountOralEvaluationStatisticsError  CountOralEvaluationStatisticsErrorRequest
     * @return CountOralEvaluationStatisticsErrorResponse
     */
    @Override
    public CompletableFuture<CountOralEvaluationStatisticsErrorResponse> countOralEvaluationStatisticsError(CountOralEvaluationStatisticsErrorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CountOralEvaluationStatisticsError").setMethod(HttpMethod.POST).setPathRegex("/api/v1/aliyunConsole/countOralEvaluationStatisticsError").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CountOralEvaluationStatisticsErrorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CountOralEvaluationStatisticsErrorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateAccessWarrant  CreateAccessWarrantRequest
     * @return CreateAccessWarrantResponse
     */
    @Override
    public CompletableFuture<CreateAccessWarrantResponse> createAccessWarrant(CreateAccessWarrantRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateAccessWarrant").setMethod(HttpMethod.POST).setPathRegex("/api/v1/aliyunConsole/createAccessWarrant").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAccessWarrantResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAccessWarrantResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateProject  CreateProjectRequest
     * @return CreateProjectResponse
     */
    @Override
    public CompletableFuture<CreateProjectResponse> createProject(CreateProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateProject").setMethod(HttpMethod.POST).setPathRegex("/api/v1/aliyunConsole/createProject").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExecuteAITeacherChineseCompositionTutoringWorkflowRun  ExecuteAITeacherChineseCompositionTutoringWorkflowRunRequest
     * @return ExecuteAITeacherChineseCompositionTutoringWorkflowRunResponse
     */
    @Override
    public CompletableFuture<ExecuteAITeacherChineseCompositionTutoringWorkflowRunResponse> executeAITeacherChineseCompositionTutoringWorkflowRun(ExecuteAITeacherChineseCompositionTutoringWorkflowRunRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExecuteAITeacherChineseCompositionTutoringWorkflowRun").setMethod(HttpMethod.POST).setPathRegex("/pop/api/v1/intelligentAgent/chineseCompositionTutoring/workflowRun").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExecuteAITeacherChineseCompositionTutoringWorkflowRunResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExecuteAITeacherChineseCompositionTutoringWorkflowRunResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<ExecuteAITeacherChineseCompositionTutoringWorkflowRunResponseBody> executeAITeacherChineseCompositionTutoringWorkflowRunWithResponseIterable(ExecuteAITeacherChineseCompositionTutoringWorkflowRunRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("ExecuteAITeacherChineseCompositionTutoringWorkflowRun").setMethod(HttpMethod.POST).setPathRegex("/pop/api/v1/intelligentAgent/chineseCompositionTutoring/workflowRun").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
        ExecuteAITeacherChineseCompositionTutoringWorkflowRunResponseBodyIterator iterator = ExecuteAITeacherChineseCompositionTutoringWorkflowRunResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * @param request the request parameters of ExecuteAITeacherEnglishCompositionTutoringWorkflowRun  ExecuteAITeacherEnglishCompositionTutoringWorkflowRunRequest
     * @return ExecuteAITeacherEnglishCompositionTutoringWorkflowRunResponse
     */
    @Override
    public CompletableFuture<ExecuteAITeacherEnglishCompositionTutoringWorkflowRunResponse> executeAITeacherEnglishCompositionTutoringWorkflowRun(ExecuteAITeacherEnglishCompositionTutoringWorkflowRunRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExecuteAITeacherEnglishCompositionTutoringWorkflowRun").setMethod(HttpMethod.POST).setPathRegex("/pop/api/v1/intelligentAgent/englishCompositionTutoring/workflowRun").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExecuteAITeacherEnglishCompositionTutoringWorkflowRunResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExecuteAITeacherEnglishCompositionTutoringWorkflowRunResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<ExecuteAITeacherEnglishCompositionTutoringWorkflowRunResponseBody> executeAITeacherEnglishCompositionTutoringWorkflowRunWithResponseIterable(ExecuteAITeacherEnglishCompositionTutoringWorkflowRunRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("ExecuteAITeacherEnglishCompositionTutoringWorkflowRun").setMethod(HttpMethod.POST).setPathRegex("/pop/api/v1/intelligentAgent/englishCompositionTutoring/workflowRun").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
        ExecuteAITeacherEnglishCompositionTutoringWorkflowRunResponseBodyIterator iterator = ExecuteAITeacherEnglishCompositionTutoringWorkflowRunResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * @param request the request parameters of ExecuteAITeacherEnglishParaphraseChatMessage  ExecuteAITeacherEnglishParaphraseChatMessageRequest
     * @return ExecuteAITeacherEnglishParaphraseChatMessageResponse
     */
    @Override
    public CompletableFuture<ExecuteAITeacherEnglishParaphraseChatMessageResponse> executeAITeacherEnglishParaphraseChatMessage(ExecuteAITeacherEnglishParaphraseChatMessageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExecuteAITeacherEnglishParaphraseChatMessage").setMethod(HttpMethod.POST).setPathRegex("/pop/api/v1/intelligentAgent/englishParaphrase/chatMessage").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExecuteAITeacherEnglishParaphraseChatMessageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExecuteAITeacherEnglishParaphraseChatMessageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<ExecuteAITeacherEnglishParaphraseChatMessageResponseBody> executeAITeacherEnglishParaphraseChatMessageWithResponseIterable(ExecuteAITeacherEnglishParaphraseChatMessageRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("ExecuteAITeacherEnglishParaphraseChatMessage").setMethod(HttpMethod.POST).setPathRegex("/pop/api/v1/intelligentAgent/englishParaphrase/chatMessage").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
        ExecuteAITeacherEnglishParaphraseChatMessageResponseBodyIterator iterator = ExecuteAITeacherEnglishParaphraseChatMessageResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * @param request the request parameters of ExecuteAITeacherExpansionDialogue  ExecuteAITeacherExpansionDialogueRequest
     * @return ExecuteAITeacherExpansionDialogueResponse
     */
    @Override
    public CompletableFuture<ExecuteAITeacherExpansionDialogueResponse> executeAITeacherExpansionDialogue(ExecuteAITeacherExpansionDialogueRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExecuteAITeacherExpansionDialogue").setMethod(HttpMethod.POST).setPathRegex("/api/v1/aiteacher/expansionPractice/executeExpansionTraining").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExecuteAITeacherExpansionDialogueResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExecuteAITeacherExpansionDialogueResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExecuteAITeacherExpansionDialogueRefine  ExecuteAITeacherExpansionDialogueRefineRequest
     * @return ExecuteAITeacherExpansionDialogueRefineResponse
     */
    @Override
    public CompletableFuture<ExecuteAITeacherExpansionDialogueRefineResponse> executeAITeacherExpansionDialogueRefine(ExecuteAITeacherExpansionDialogueRefineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExecuteAITeacherExpansionDialogueRefine").setMethod(HttpMethod.POST).setPathRegex("/api/v1/aiteacher/expansionPractice/refineByContext").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExecuteAITeacherExpansionDialogueRefineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExecuteAITeacherExpansionDialogueRefineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExecuteAITeacherExpansionDialogueTranslate  ExecuteAITeacherExpansionDialogueTranslateRequest
     * @return ExecuteAITeacherExpansionDialogueTranslateResponse
     */
    @Override
    public CompletableFuture<ExecuteAITeacherExpansionDialogueTranslateResponse> executeAITeacherExpansionDialogueTranslate(ExecuteAITeacherExpansionDialogueTranslateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExecuteAITeacherExpansionDialogueTranslate").setMethod(HttpMethod.POST).setPathRegex("/api/v1/aiteacher/expansionPractice/translate").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExecuteAITeacherExpansionDialogueTranslateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExecuteAITeacherExpansionDialogueTranslateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExecuteAITeacherGrammarCheck  ExecuteAITeacherGrammarCheckRequest
     * @return ExecuteAITeacherGrammarCheckResponse
     */
    @Override
    public CompletableFuture<ExecuteAITeacherGrammarCheckResponse> executeAITeacherGrammarCheck(ExecuteAITeacherGrammarCheckRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExecuteAITeacherGrammarCheck").setMethod(HttpMethod.POST).setPathRegex("/api/v1/aiteacher/common/grammarChecking").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExecuteAITeacherGrammarCheckResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExecuteAITeacherGrammarCheckResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExecuteAITeacherSyncDialogue  ExecuteAITeacherSyncDialogueRequest
     * @return ExecuteAITeacherSyncDialogueResponse
     */
    @Override
    public CompletableFuture<ExecuteAITeacherSyncDialogueResponse> executeAITeacherSyncDialogue(ExecuteAITeacherSyncDialogueRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExecuteAITeacherSyncDialogue").setMethod(HttpMethod.POST).setPathRegex("/api/v1/aiteacher/syncPractice/executeSyncTraining").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExecuteAITeacherSyncDialogueResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExecuteAITeacherSyncDialogueResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExecuteAITeacherSyncDialogueTranslate  ExecuteAITeacherSyncDialogueTranslateRequest
     * @return ExecuteAITeacherSyncDialogueTranslateResponse
     */
    @Override
    public CompletableFuture<ExecuteAITeacherSyncDialogueTranslateResponse> executeAITeacherSyncDialogueTranslate(ExecuteAITeacherSyncDialogueTranslateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExecuteAITeacherSyncDialogueTranslate").setMethod(HttpMethod.POST).setPathRegex("/api/v1/aiteacher/syncPractice/translate").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExecuteAITeacherSyncDialogueTranslateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExecuteAITeacherSyncDialogueTranslateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExecuteTextbookAssistantDialogue  ExecuteTextbookAssistantDialogueRequest
     * @return ExecuteTextbookAssistantDialogueResponse
     */
    @Override
    public CompletableFuture<ExecuteTextbookAssistantDialogueResponse> executeTextbookAssistantDialogue(ExecuteTextbookAssistantDialogueRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExecuteTextbookAssistantDialogue").setMethod(HttpMethod.POST).setPathRegex("/api/v1/textbookAssistant/dialogue/ExecuteDialogue").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExecuteTextbookAssistantDialogueResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExecuteTextbookAssistantDialogueResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExecuteTextbookAssistantDifficulty  ExecuteTextbookAssistantDifficultyRequest
     * @return ExecuteTextbookAssistantDifficultyResponse
     */
    @Override
    public CompletableFuture<ExecuteTextbookAssistantDifficultyResponse> executeTextbookAssistantDifficulty(ExecuteTextbookAssistantDifficultyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExecuteTextbookAssistantDifficulty").setMethod(HttpMethod.POST).setPathRegex("/api/v1/textbookAssistant/dialogue/ExecuteDifficulty").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExecuteTextbookAssistantDifficultyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExecuteTextbookAssistantDifficultyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExecuteTextbookAssistantGrammarCheck  ExecuteTextbookAssistantGrammarCheckRequest
     * @return ExecuteTextbookAssistantGrammarCheckResponse
     */
    @Override
    public CompletableFuture<ExecuteTextbookAssistantGrammarCheckResponse> executeTextbookAssistantGrammarCheck(ExecuteTextbookAssistantGrammarCheckRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExecuteTextbookAssistantGrammarCheck").setMethod(HttpMethod.POST).setPathRegex("/api/v1/textbookAssistant/dialogue/ExecuteGrammarCheck").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExecuteTextbookAssistantGrammarCheckResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExecuteTextbookAssistantGrammarCheckResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExecuteTextbookAssistantRefineByContext  ExecuteTextbookAssistantRefineByContextRequest
     * @return ExecuteTextbookAssistantRefineByContextResponse
     */
    @Override
    public CompletableFuture<ExecuteTextbookAssistantRefineByContextResponse> executeTextbookAssistantRefineByContext(ExecuteTextbookAssistantRefineByContextRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExecuteTextbookAssistantRefineByContext").setMethod(HttpMethod.POST).setPathRegex("/api/v1/textbookAssistant/dialogue/RefineByContext").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExecuteTextbookAssistantRefineByContextResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExecuteTextbookAssistantRefineByContextResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExecuteTextbookAssistantRetryConversation  ExecuteTextbookAssistantRetryConversationRequest
     * @return ExecuteTextbookAssistantRetryConversationResponse
     */
    @Override
    public CompletableFuture<ExecuteTextbookAssistantRetryConversationResponse> executeTextbookAssistantRetryConversation(ExecuteTextbookAssistantRetryConversationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExecuteTextbookAssistantRetryConversation").setMethod(HttpMethod.POST).setPathRegex("/api/v1/textbookAssistant/dialogue/RetryConversation").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExecuteTextbookAssistantRetryConversationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExecuteTextbookAssistantRetryConversationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExecuteTextbookAssistantSseDialogue  ExecuteTextbookAssistantSseDialogueRequest
     * @return ExecuteTextbookAssistantSseDialogueResponse
     */
    @Override
    public CompletableFuture<ExecuteTextbookAssistantSseDialogueResponse> executeTextbookAssistantSseDialogue(ExecuteTextbookAssistantSseDialogueRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExecuteTextbookAssistantSseDialogue").setMethod(HttpMethod.POST).setPathRegex("/api/v1/textbookAssistant/dialogue/ExecuteSseDialogue").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExecuteTextbookAssistantSseDialogueResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExecuteTextbookAssistantSseDialogueResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<ExecuteTextbookAssistantSseDialogueResponseBody> executeTextbookAssistantSseDialogueWithResponseIterable(ExecuteTextbookAssistantSseDialogueRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("ExecuteTextbookAssistantSseDialogue").setMethod(HttpMethod.POST).setPathRegex("/api/v1/textbookAssistant/dialogue/ExecuteSseDialogue").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
        ExecuteTextbookAssistantSseDialogueResponseBodyIterator iterator = ExecuteTextbookAssistantSseDialogueResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * @param request the request parameters of ExecuteTextbookAssistantStartConversation  ExecuteTextbookAssistantStartConversationRequest
     * @return ExecuteTextbookAssistantStartConversationResponse
     */
    @Override
    public CompletableFuture<ExecuteTextbookAssistantStartConversationResponse> executeTextbookAssistantStartConversation(ExecuteTextbookAssistantStartConversationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExecuteTextbookAssistantStartConversation").setMethod(HttpMethod.POST).setPathRegex("/api/v1/textbookAssistant/dialogue/StartConversation").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExecuteTextbookAssistantStartConversationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExecuteTextbookAssistantStartConversationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExecuteTextbookAssistantSuggestion  ExecuteTextbookAssistantSuggestionRequest
     * @return ExecuteTextbookAssistantSuggestionResponse
     */
    @Override
    public CompletableFuture<ExecuteTextbookAssistantSuggestionResponse> executeTextbookAssistantSuggestion(ExecuteTextbookAssistantSuggestionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExecuteTextbookAssistantSuggestion").setMethod(HttpMethod.POST).setPathRegex("/api/v1/textbookAssistant/dialogue/Suggestion").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExecuteTextbookAssistantSuggestionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExecuteTextbookAssistantSuggestionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExecuteTextbookAssistantTranslate  ExecuteTextbookAssistantTranslateRequest
     * @return ExecuteTextbookAssistantTranslateResponse
     */
    @Override
    public CompletableFuture<ExecuteTextbookAssistantTranslateResponse> executeTextbookAssistantTranslate(ExecuteTextbookAssistantTranslateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExecuteTextbookAssistantTranslate").setMethod(HttpMethod.POST).setPathRegex("/api/v1/textbookAssistant/dialogue/ExecuteTranslate").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExecuteTextbookAssistantTranslateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExecuteTextbookAssistantTranslateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAITeacherExpansionDialogueSuggestion  GetAITeacherExpansionDialogueSuggestionRequest
     * @return GetAITeacherExpansionDialogueSuggestionResponse
     */
    @Override
    public CompletableFuture<GetAITeacherExpansionDialogueSuggestionResponse> getAITeacherExpansionDialogueSuggestion(GetAITeacherExpansionDialogueSuggestionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAITeacherExpansionDialogueSuggestion").setMethod(HttpMethod.POST).setPathRegex("/api/v1/aiteacher/expansionPractice/suggestion").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAITeacherExpansionDialogueSuggestionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAITeacherExpansionDialogueSuggestionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAITeacherSyncDialogueSuggestion  GetAITeacherSyncDialogueSuggestionRequest
     * @return GetAITeacherSyncDialogueSuggestionResponse
     */
    @Override
    public CompletableFuture<GetAITeacherSyncDialogueSuggestionResponse> getAITeacherSyncDialogueSuggestion(GetAITeacherSyncDialogueSuggestionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAITeacherSyncDialogueSuggestion").setMethod(HttpMethod.POST).setPathRegex("/api/v1/aiteacher/syncPractice/suggestion").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAITeacherSyncDialogueSuggestionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAITeacherSyncDialogueSuggestionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTextbookAssistantToken  GetTextbookAssistantTokenRequest
     * @return GetTextbookAssistantTokenResponse
     */
    @Override
    public CompletableFuture<GetTextbookAssistantTokenResponse> getTextbookAssistantToken(GetTextbookAssistantTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTextbookAssistantToken").setMethod(HttpMethod.POST).setPathRegex("/api/v1/textbookAssistant/teachingResource/GetToken").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTextbookAssistantTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTextbookAssistantTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTextbookAssistantArticleDetails  ListTextbookAssistantArticleDetailsRequest
     * @return ListTextbookAssistantArticleDetailsResponse
     */
    @Override
    public CompletableFuture<ListTextbookAssistantArticleDetailsResponse> listTextbookAssistantArticleDetails(ListTextbookAssistantArticleDetailsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTextbookAssistantArticleDetails").setMethod(HttpMethod.POST).setPathRegex("/api/v1/textbookAssistant/teachingResource/ListArticleDetails").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTextbookAssistantArticleDetailsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTextbookAssistantArticleDetailsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTextbookAssistantArticles  ListTextbookAssistantArticlesRequest
     * @return ListTextbookAssistantArticlesResponse
     */
    @Override
    public CompletableFuture<ListTextbookAssistantArticlesResponse> listTextbookAssistantArticles(ListTextbookAssistantArticlesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTextbookAssistantArticles").setMethod(HttpMethod.POST).setPathRegex("/api/v1/textbookAssistant/teachingResource/ListArticles").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTextbookAssistantArticlesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTextbookAssistantArticlesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTextbookAssistantBookDirectories  ListTextbookAssistantBookDirectoriesRequest
     * @return ListTextbookAssistantBookDirectoriesResponse
     */
    @Override
    public CompletableFuture<ListTextbookAssistantBookDirectoriesResponse> listTextbookAssistantBookDirectories(ListTextbookAssistantBookDirectoriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTextbookAssistantBookDirectories").setMethod(HttpMethod.POST).setPathRegex("/api/v1/textbookAssistant/teachingResource/ListBookDirectories").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTextbookAssistantBookDirectoriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTextbookAssistantBookDirectoriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTextbookAssistantBooks  ListTextbookAssistantBooksRequest
     * @return ListTextbookAssistantBooksResponse
     */
    @Override
    public CompletableFuture<ListTextbookAssistantBooksResponse> listTextbookAssistantBooks(ListTextbookAssistantBooksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTextbookAssistantBooks").setMethod(HttpMethod.POST).setPathRegex("/api/v1/textbookAssistant/teachingResource/ListBooks").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTextbookAssistantBooksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTextbookAssistantBooksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTextbookAssistantGradeVolumes  ListTextbookAssistantGradeVolumesRequest
     * @return ListTextbookAssistantGradeVolumesResponse
     */
    @Override
    public CompletableFuture<ListTextbookAssistantGradeVolumesResponse> listTextbookAssistantGradeVolumes(ListTextbookAssistantGradeVolumesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTextbookAssistantGradeVolumes").setMethod(HttpMethod.POST).setPathRegex("/api/v1/textbookAssistant/teachingResource/ListGradeVolumes").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTextbookAssistantGradeVolumesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTextbookAssistantGradeVolumesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTextbookAssistantSceneDetails  ListTextbookAssistantSceneDetailsRequest
     * @return ListTextbookAssistantSceneDetailsResponse
     */
    @Override
    public CompletableFuture<ListTextbookAssistantSceneDetailsResponse> listTextbookAssistantSceneDetails(ListTextbookAssistantSceneDetailsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTextbookAssistantSceneDetails").setMethod(HttpMethod.POST).setPathRegex("/api/v1/textbookAssistant/teachingResource/ListSceneDetails").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTextbookAssistantSceneDetailsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTextbookAssistantSceneDetailsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterChatCompletions  ModelRouterChatCompletionsRequest
     * @return ModelRouterChatCompletionsResponse
     */
    @Override
    public CompletableFuture<ModelRouterChatCompletionsResponse> modelRouterChatCompletions(ModelRouterChatCompletionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterChatCompletions").setMethod(HttpMethod.POST).setPathRegex("/api/v1/modelRouter/open/chat/completions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterChatCompletionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterChatCompletionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public <ReturnT> CompletableFuture<ReturnT> modelRouterChatCompletionsWithAsyncResponseHandler(ModelRouterChatCompletionsRequest request, AsyncResponseHandler<ModelRouterChatCompletionsResponse, ReturnT> responseHandler) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterChatCompletions").setMethod(HttpMethod.POST).setPathRegex("/api/v1/modelRouter/open/chat/completions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withResponseHandler(responseHandler).withOutput(ModelRouterChatCompletionsResponse.create());
            return this.handler.execute(params)
                    .thenCompose((output) -> CompletableFuture.completedFuture(responseHandler.transform((ModelRouterChatCompletionsResponse)output)));
        } catch (Exception e) {
            CompletableFuture<ReturnT> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<ModelRouterChatCompletionsResponseBody> modelRouterChatCompletionsWithResponseIterable(ModelRouterChatCompletionsRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("ModelRouterChatCompletions").setMethod(HttpMethod.POST).setPathRegex("/api/v1/modelRouter/open/chat/completions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
        ModelRouterChatCompletionsResponseBodyIterator iterator = ModelRouterChatCompletionsResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * @param request the request parameters of ModelRouterCopyApiKey  ModelRouterCopyApiKeyRequest
     * @return ModelRouterCopyApiKeyResponse
     */
    @Override
    public CompletableFuture<ModelRouterCopyApiKeyResponse> modelRouterCopyApiKey(ModelRouterCopyApiKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterCopyApiKey").setMethod(HttpMethod.GET).setPathRegex("/api/v1/modelRouter/open/apikeys/{id}/copy").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterCopyApiKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterCopyApiKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterCreateApiKey  ModelRouterCreateApiKeyRequest
     * @return ModelRouterCreateApiKeyResponse
     */
    @Override
    public CompletableFuture<ModelRouterCreateApiKeyResponse> modelRouterCreateApiKey(ModelRouterCreateApiKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterCreateApiKey").setMethod(HttpMethod.POST).setPathRegex("/api/v1/modelRouter/open/apikeys").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterCreateApiKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterCreateApiKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterCreateClient  ModelRouterCreateClientRequest
     * @return ModelRouterCreateClientResponse
     */
    @Override
    public CompletableFuture<ModelRouterCreateClientResponse> modelRouterCreateClient(ModelRouterCreateClientRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterCreateClient").setMethod(HttpMethod.POST).setPathRegex("/api/v1/modelRouter/open/clients").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterCreateClientResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterCreateClientResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterCreateConversation  ModelRouterCreateConversationRequest
     * @return ModelRouterCreateConversationResponse
     */
    @Override
    public CompletableFuture<ModelRouterCreateConversationResponse> modelRouterCreateConversation(ModelRouterCreateConversationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterCreateConversation").setMethod(HttpMethod.POST).setPathRegex("/api/v1/modelRouter/open/conversations").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterCreateConversationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterCreateConversationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterCreateModel  ModelRouterCreateModelRequest
     * @return ModelRouterCreateModelResponse
     */
    @Override
    public CompletableFuture<ModelRouterCreateModelResponse> modelRouterCreateModel(ModelRouterCreateModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterCreateModel").setMethod(HttpMethod.POST).setPathRegex("/api/v1/modelRouter/open/models").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterCreateModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterCreateModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterDeleteApiKey  ModelRouterDeleteApiKeyRequest
     * @return ModelRouterDeleteApiKeyResponse
     */
    @Override
    public CompletableFuture<ModelRouterDeleteApiKeyResponse> modelRouterDeleteApiKey(ModelRouterDeleteApiKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterDeleteApiKey").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/modelRouter/open/apikeys/{id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterDeleteApiKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterDeleteApiKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterDeleteClient  ModelRouterDeleteClientRequest
     * @return ModelRouterDeleteClientResponse
     */
    @Override
    public CompletableFuture<ModelRouterDeleteClientResponse> modelRouterDeleteClient(ModelRouterDeleteClientRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterDeleteClient").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/modelRouter/open/clients/{id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterDeleteClientResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterDeleteClientResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterDeleteConversation  ModelRouterDeleteConversationRequest
     * @return ModelRouterDeleteConversationResponse
     */
    @Override
    public CompletableFuture<ModelRouterDeleteConversationResponse> modelRouterDeleteConversation(ModelRouterDeleteConversationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterDeleteConversation").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/modelRouter/open/conversations/{id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterDeleteConversationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterDeleteConversationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterDeleteModel  ModelRouterDeleteModelRequest
     * @return ModelRouterDeleteModelResponse
     */
    @Override
    public CompletableFuture<ModelRouterDeleteModelResponse> modelRouterDeleteModel(ModelRouterDeleteModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterDeleteModel").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/modelRouter/open/models/{id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterDeleteModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterDeleteModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterQueryApiKey  ModelRouterQueryApiKeyRequest
     * @return ModelRouterQueryApiKeyResponse
     */
    @Override
    public CompletableFuture<ModelRouterQueryApiKeyResponse> modelRouterQueryApiKey(ModelRouterQueryApiKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterQueryApiKey").setMethod(HttpMethod.GET).setPathRegex("/api/v1/modelRouter/open/apikeys/{id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterQueryApiKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterQueryApiKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterQueryApiKeyList  ModelRouterQueryApiKeyListRequest
     * @return ModelRouterQueryApiKeyListResponse
     */
    @Override
    public CompletableFuture<ModelRouterQueryApiKeyListResponse> modelRouterQueryApiKeyList(ModelRouterQueryApiKeyListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterQueryApiKeyList").setMethod(HttpMethod.GET).setPathRegex("/api/v1/modelRouter/open/apikeys").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterQueryApiKeyListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterQueryApiKeyListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterQueryClientList  ModelRouterQueryClientListRequest
     * @return ModelRouterQueryClientListResponse
     */
    @Override
    public CompletableFuture<ModelRouterQueryClientListResponse> modelRouterQueryClientList(ModelRouterQueryClientListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterQueryClientList").setMethod(HttpMethod.GET).setPathRegex("/api/v1/modelRouter/open/clients").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterQueryClientListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterQueryClientListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterQueryConversation  ModelRouterQueryConversationRequest
     * @return ModelRouterQueryConversationResponse
     */
    @Override
    public CompletableFuture<ModelRouterQueryConversationResponse> modelRouterQueryConversation(ModelRouterQueryConversationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterQueryConversation").setMethod(HttpMethod.GET).setPathRegex("/api/v1/modelRouter/open/conversations/{id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterQueryConversationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterQueryConversationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterQueryConversationList  ModelRouterQueryConversationListRequest
     * @return ModelRouterQueryConversationListResponse
     */
    @Override
    public CompletableFuture<ModelRouterQueryConversationListResponse> modelRouterQueryConversationList(ModelRouterQueryConversationListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterQueryConversationList").setMethod(HttpMethod.GET).setPathRegex("/api/v1/modelRouter/open/conversations").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterQueryConversationListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterQueryConversationListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterQueryModel  ModelRouterQueryModelRequest
     * @return ModelRouterQueryModelResponse
     */
    @Override
    public CompletableFuture<ModelRouterQueryModelResponse> modelRouterQueryModel(ModelRouterQueryModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterQueryModel").setMethod(HttpMethod.GET).setPathRegex("/api/v1/modelRouter/open/models/{id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterQueryModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterQueryModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterQueryModelList  ModelRouterQueryModelListRequest
     * @return ModelRouterQueryModelListResponse
     */
    @Override
    public CompletableFuture<ModelRouterQueryModelListResponse> modelRouterQueryModelList(ModelRouterQueryModelListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterQueryModelList").setMethod(HttpMethod.GET).setPathRegex("/api/v1/modelRouter/open/models").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterQueryModelListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterQueryModelListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterQueryModelWithApiKey  ModelRouterQueryModelWithApiKeyRequest
     * @return ModelRouterQueryModelWithApiKeyResponse
     */
    @Override
    public CompletableFuture<ModelRouterQueryModelWithApiKeyResponse> modelRouterQueryModelWithApiKey(ModelRouterQueryModelWithApiKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterQueryModelWithApiKey").setMethod(HttpMethod.GET).setPathRegex("/api/v1/modelRouter/open/models/{id}/with-api-key").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterQueryModelWithApiKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterQueryModelWithApiKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterQueryNacosProviders  ModelRouterQueryNacosProvidersRequest
     * @return ModelRouterQueryNacosProvidersResponse
     */
    @Override
    public CompletableFuture<ModelRouterQueryNacosProvidersResponse> modelRouterQueryNacosProviders(ModelRouterQueryNacosProvidersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterQueryNacosProviders").setMethod(HttpMethod.GET).setPathRegex("/api/v1/modelRouter/open/nacos/providers").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterQueryNacosProvidersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterQueryNacosProvidersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterQueryNacosTags  ModelRouterQueryNacosTagsRequest
     * @return ModelRouterQueryNacosTagsResponse
     */
    @Override
    public CompletableFuture<ModelRouterQueryNacosTagsResponse> modelRouterQueryNacosTags(ModelRouterQueryNacosTagsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterQueryNacosTags").setMethod(HttpMethod.GET).setPathRegex("/api/v1/modelRouter/open/nacos/tags").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterQueryNacosTagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterQueryNacosTagsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterQueryObservationCharts  ModelRouterQueryObservationChartsRequest
     * @return ModelRouterQueryObservationChartsResponse
     */
    @Override
    public CompletableFuture<ModelRouterQueryObservationChartsResponse> modelRouterQueryObservationCharts(ModelRouterQueryObservationChartsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterQueryObservationCharts").setMethod(HttpMethod.GET).setPathRegex("/api/v1/modelRouter/open/observation/charts").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterQueryObservationChartsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterQueryObservationChartsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterQueryObservationLogs  ModelRouterQueryObservationLogsRequest
     * @return ModelRouterQueryObservationLogsResponse
     */
    @Override
    public CompletableFuture<ModelRouterQueryObservationLogsResponse> modelRouterQueryObservationLogs(ModelRouterQueryObservationLogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterQueryObservationLogs").setMethod(HttpMethod.GET).setPathRegex("/api/v1/modelRouter/open/observation/logs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterQueryObservationLogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterQueryObservationLogsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterQueryObservationMetrics  ModelRouterQueryObservationMetricsRequest
     * @return ModelRouterQueryObservationMetricsResponse
     */
    @Override
    public CompletableFuture<ModelRouterQueryObservationMetricsResponse> modelRouterQueryObservationMetrics(ModelRouterQueryObservationMetricsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterQueryObservationMetrics").setMethod(HttpMethod.GET).setPathRegex("/api/v1/modelRouter/open/observation/metrics").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterQueryObservationMetricsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterQueryObservationMetricsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterUpdateClient  ModelRouterUpdateClientRequest
     * @return ModelRouterUpdateClientResponse
     */
    @Override
    public CompletableFuture<ModelRouterUpdateClientResponse> modelRouterUpdateClient(ModelRouterUpdateClientRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterUpdateClient").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/modelRouter/open/clients/{id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterUpdateClientResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterUpdateClientResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterUpdateConversation  ModelRouterUpdateConversationRequest
     * @return ModelRouterUpdateConversationResponse
     */
    @Override
    public CompletableFuture<ModelRouterUpdateConversationResponse> modelRouterUpdateConversation(ModelRouterUpdateConversationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterUpdateConversation").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/modelRouter/open/conversations/{id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterUpdateConversationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterUpdateConversationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterUpdateModel  ModelRouterUpdateModelRequest
     * @return ModelRouterUpdateModelResponse
     */
    @Override
    public CompletableFuture<ModelRouterUpdateModelResponse> modelRouterUpdateModel(ModelRouterUpdateModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterUpdateModel").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/modelRouter/open/models/{id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterUpdateModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterUpdateModelResponse> future = new CompletableFuture<>();
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

    /**
     * @param request the request parameters of QueryApplicationAccessId  QueryApplicationAccessIdRequest
     * @return QueryApplicationAccessIdResponse
     */
    @Override
    public CompletableFuture<QueryApplicationAccessIdResponse> queryApplicationAccessId(QueryApplicationAccessIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryApplicationAccessId").setMethod(HttpMethod.GET).setPathRegex("/api/v1/aliyunConsole/queryApplicationAccessId").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryApplicationAccessIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryApplicationAccessIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryProject  QueryProjectRequest
     * @return QueryProjectResponse
     */
    @Override
    public CompletableFuture<QueryProjectResponse> queryProject(QueryProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryProject").setMethod(HttpMethod.GET).setPathRegex("/api/v1/aliyunConsole/queryProject").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryProjectList  QueryProjectListRequest
     * @return QueryProjectListResponse
     */
    @Override
    public CompletableFuture<QueryProjectListResponse> queryProjectList(QueryProjectListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryProjectList").setMethod(HttpMethod.GET).setPathRegex("/api/v1/aliyunConsole/queryProjectList").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryProjectListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryProjectListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryPurchasedService  QueryPurchasedServiceRequest
     * @return QueryPurchasedServiceResponse
     */
    @Override
    public CompletableFuture<QueryPurchasedServiceResponse> queryPurchasedService(QueryPurchasedServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryPurchasedService").setMethod(HttpMethod.GET).setPathRegex("/api/v1/aliyunConsole/queryPurchasedService").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryPurchasedServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryPurchasedServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateProject  UpdateProjectRequest
     * @return UpdateProjectResponse
     */
    @Override
    public CompletableFuture<UpdateProjectResponse> updateProject(UpdateProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateProject").setMethod(HttpMethod.POST).setPathRegex("/api/v1/aliyunConsole/updateProject").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
