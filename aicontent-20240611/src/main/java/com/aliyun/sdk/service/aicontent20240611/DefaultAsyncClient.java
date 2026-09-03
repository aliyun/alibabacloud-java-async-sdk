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
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("cn-shanghai", "aicontent.aliyuncs.com"),
            new TeaPair("public", "aicontent.aliyuncs.com")
        );
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
     * @param request the request parameters of ModelRouterBatchBindModelGroup  ModelRouterBatchBindModelGroupRequest
     * @return ModelRouterBatchBindModelGroupResponse
     */
    @Override
    public CompletableFuture<ModelRouterBatchBindModelGroupResponse> modelRouterBatchBindModelGroup(ModelRouterBatchBindModelGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterBatchBindModelGroup").setMethod(HttpMethod.POST).setPathRegex("/api/v1/modelRouter/open/clients/batch-bind-model-group").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterBatchBindModelGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterBatchBindModelGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterBatchCreateMemberApiKeys  ModelRouterBatchCreateMemberApiKeysRequest
     * @return ModelRouterBatchCreateMemberApiKeysResponse
     */
    @Override
    public CompletableFuture<ModelRouterBatchCreateMemberApiKeysResponse> modelRouterBatchCreateMemberApiKeys(ModelRouterBatchCreateMemberApiKeysRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterBatchCreateMemberApiKeys").setMethod(HttpMethod.POST).setPathRegex("/api/v1/modelRouter/open/clients/{id}/member-apikeys").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterBatchCreateMemberApiKeysResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterBatchCreateMemberApiKeysResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterBatchCreateModel  ModelRouterBatchCreateModelRequest
     * @return ModelRouterBatchCreateModelResponse
     */
    @Override
    public CompletableFuture<ModelRouterBatchCreateModelResponse> modelRouterBatchCreateModel(ModelRouterBatchCreateModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterBatchCreateModel").setMethod(HttpMethod.POST).setPathRegex("/api/v1/modelRouter/open/models/batch").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterBatchCreateModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterBatchCreateModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterBatchDisableMemberApiKeys  ModelRouterBatchDisableMemberApiKeysRequest
     * @return ModelRouterBatchDisableMemberApiKeysResponse
     */
    @Override
    public CompletableFuture<ModelRouterBatchDisableMemberApiKeysResponse> modelRouterBatchDisableMemberApiKeys(ModelRouterBatchDisableMemberApiKeysRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterBatchDisableMemberApiKeys").setMethod(HttpMethod.POST).setPathRegex("/api/v1/modelRouter/open/clients/{id}/member-apikeys/disable").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterBatchDisableMemberApiKeysResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterBatchDisableMemberApiKeysResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterBatchResetMemberAuthorization  ModelRouterBatchResetMemberAuthorizationRequest
     * @return ModelRouterBatchResetMemberAuthorizationResponse
     */
    @Override
    public CompletableFuture<ModelRouterBatchResetMemberAuthorizationResponse> modelRouterBatchResetMemberAuthorization(ModelRouterBatchResetMemberAuthorizationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterBatchResetMemberAuthorization").setMethod(HttpMethod.POST).setPathRegex("/api/v1/modelRouter/open/clients/{id}/member-authorizations/reset").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterBatchResetMemberAuthorizationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterBatchResetMemberAuthorizationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterBatchSetMemberAuthorization  ModelRouterBatchSetMemberAuthorizationRequest
     * @return ModelRouterBatchSetMemberAuthorizationResponse
     */
    @Override
    public CompletableFuture<ModelRouterBatchSetMemberAuthorizationResponse> modelRouterBatchSetMemberAuthorization(ModelRouterBatchSetMemberAuthorizationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterBatchSetMemberAuthorization").setMethod(HttpMethod.POST).setPathRegex("/api/v1/modelRouter/open/clients/{id}/member-authorizations").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterBatchSetMemberAuthorizationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterBatchSetMemberAuthorizationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterBillingCostTabs  ModelRouterBillingCostTabsRequest
     * @return ModelRouterBillingCostTabsResponse
     */
    @Override
    public CompletableFuture<ModelRouterBillingCostTabsResponse> modelRouterBillingCostTabs(ModelRouterBillingCostTabsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterBillingCostTabs").setMethod(HttpMethod.GET).setPathRegex("/api/v1/modelRouter/open/billing/cost/tabs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterBillingCostTabsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterBillingCostTabsResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of ModelRouterConfigureClientBalance  ModelRouterConfigureClientBalanceRequest
     * @return ModelRouterConfigureClientBalanceResponse
     */
    @Override
    public CompletableFuture<ModelRouterConfigureClientBalanceResponse> modelRouterConfigureClientBalance(ModelRouterConfigureClientBalanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterConfigureClientBalance").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/modelRouter/open/clients/{id}/balance").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterConfigureClientBalanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterConfigureClientBalanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterConfigureMemberBalance  ModelRouterConfigureMemberBalanceRequest
     * @return ModelRouterConfigureMemberBalanceResponse
     */
    @Override
    public CompletableFuture<ModelRouterConfigureMemberBalanceResponse> modelRouterConfigureMemberBalance(ModelRouterConfigureMemberBalanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterConfigureMemberBalance").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/modelRouter/open/clients/{clientId}/members/{id}/balance").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterConfigureMemberBalanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterConfigureMemberBalanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
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
     * @param request the request parameters of ModelRouterCreateBalanceTransaction  ModelRouterCreateBalanceTransactionRequest
     * @return ModelRouterCreateBalanceTransactionResponse
     */
    @Override
    public CompletableFuture<ModelRouterCreateBalanceTransactionResponse> modelRouterCreateBalanceTransaction(ModelRouterCreateBalanceTransactionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterCreateBalanceTransaction").setMethod(HttpMethod.POST).setPathRegex("/api/v1/modelRouter/open/clients/{id}/balance/transactions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterCreateBalanceTransactionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterCreateBalanceTransactionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterCreateBillingRule  ModelRouterCreateBillingRuleRequest
     * @return ModelRouterCreateBillingRuleResponse
     */
    @Override
    public CompletableFuture<ModelRouterCreateBillingRuleResponse> modelRouterCreateBillingRule(ModelRouterCreateBillingRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterCreateBillingRule").setMethod(HttpMethod.POST).setPathRegex("/api/v1/modelRouter/open/billing/rules").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterCreateBillingRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterCreateBillingRuleResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of ModelRouterCreateMemberApiKey  ModelRouterCreateMemberApiKeyRequest
     * @return ModelRouterCreateMemberApiKeyResponse
     */
    @Override
    public CompletableFuture<ModelRouterCreateMemberApiKeyResponse> modelRouterCreateMemberApiKey(ModelRouterCreateMemberApiKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterCreateMemberApiKey").setMethod(HttpMethod.POST).setPathRegex("/api/v1/modelRouter/open/clients/{clientId}/members/{id}/apikeys").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterCreateMemberApiKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterCreateMemberApiKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterCreateMemberBalanceTransaction  ModelRouterCreateMemberBalanceTransactionRequest
     * @return ModelRouterCreateMemberBalanceTransactionResponse
     */
    @Override
    public CompletableFuture<ModelRouterCreateMemberBalanceTransactionResponse> modelRouterCreateMemberBalanceTransaction(ModelRouterCreateMemberBalanceTransactionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterCreateMemberBalanceTransaction").setMethod(HttpMethod.POST).setPathRegex("/api/v1/modelRouter/open/clients/{clientId}/members/{id}/balance/transactions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterCreateMemberBalanceTransactionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterCreateMemberBalanceTransactionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterCreateMemberSubscription  ModelRouterCreateMemberSubscriptionRequest
     * @return ModelRouterCreateMemberSubscriptionResponse
     */
    @Override
    public CompletableFuture<ModelRouterCreateMemberSubscriptionResponse> modelRouterCreateMemberSubscription(ModelRouterCreateMemberSubscriptionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterCreateMemberSubscription").setMethod(HttpMethod.POST).setPathRegex("/api/v1/modelRouter/open/clients/{clientId}/members/{id}/balance/subscription").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterCreateMemberSubscriptionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterCreateMemberSubscriptionResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of ModelRouterCreateModelGroup  ModelRouterCreateModelGroupRequest
     * @return ModelRouterCreateModelGroupResponse
     */
    @Override
    public CompletableFuture<ModelRouterCreateModelGroupResponse> modelRouterCreateModelGroup(ModelRouterCreateModelGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterCreateModelGroup").setMethod(HttpMethod.POST).setPathRegex("/api/v1/modelRouter/open/model-groups").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterCreateModelGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterCreateModelGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterCreateSubscription  ModelRouterCreateSubscriptionRequest
     * @return ModelRouterCreateSubscriptionResponse
     */
    @Override
    public CompletableFuture<ModelRouterCreateSubscriptionResponse> modelRouterCreateSubscription(ModelRouterCreateSubscriptionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterCreateSubscription").setMethod(HttpMethod.POST).setPathRegex("/api/v1/modelRouter/open/clients/{id}/balance/subscription").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterCreateSubscriptionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterCreateSubscriptionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterCreateUser  ModelRouterCreateUserRequest
     * @return ModelRouterCreateUserResponse
     */
    @Override
    public CompletableFuture<ModelRouterCreateUserResponse> modelRouterCreateUser(ModelRouterCreateUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterCreateUser").setMethod(HttpMethod.POST).setPathRegex("/api/v1/modelRouter/open/users").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterCreateUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterCreateUserResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of ModelRouterDeleteModelGroup  ModelRouterDeleteModelGroupRequest
     * @return ModelRouterDeleteModelGroupResponse
     */
    @Override
    public CompletableFuture<ModelRouterDeleteModelGroupResponse> modelRouterDeleteModelGroup(ModelRouterDeleteModelGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterDeleteModelGroup").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/modelRouter/open/model-groups/{groupId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterDeleteModelGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterDeleteModelGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterDeleteUser  ModelRouterDeleteUserRequest
     * @return ModelRouterDeleteUserResponse
     */
    @Override
    public CompletableFuture<ModelRouterDeleteUserResponse> modelRouterDeleteUser(ModelRouterDeleteUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterDeleteUser").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/modelRouter/open/users/{id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterDeleteUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterDeleteUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterExportMemberBalanceOrders  ModelRouterExportMemberBalanceOrdersRequest
     * @return ModelRouterExportMemberBalanceOrdersResponse
     */
    @Override
    public CompletableFuture<ModelRouterExportMemberBalanceOrdersResponse> modelRouterExportMemberBalanceOrders(ModelRouterExportMemberBalanceOrdersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterExportMemberBalanceOrders").setMethod(HttpMethod.GET).setPathRegex("/api/v1/modelRouter/open/clients/{clientId}/members/{id}/balance/orders/export").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterExportMemberBalanceOrdersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterExportMemberBalanceOrdersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterGetBillingBillSummary  ModelRouterGetBillingBillSummaryRequest
     * @return ModelRouterGetBillingBillSummaryResponse
     */
    @Override
    public CompletableFuture<ModelRouterGetBillingBillSummaryResponse> modelRouterGetBillingBillSummary(ModelRouterGetBillingBillSummaryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterGetBillingBillSummary").setMethod(HttpMethod.GET).setPathRegex("/api/v1/modelRouter/open/billing/bills/summary").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterGetBillingBillSummaryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterGetBillingBillSummaryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterGetClientBalance  ModelRouterGetClientBalanceRequest
     * @return ModelRouterGetClientBalanceResponse
     */
    @Override
    public CompletableFuture<ModelRouterGetClientBalanceResponse> modelRouterGetClientBalance(ModelRouterGetClientBalanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterGetClientBalance").setMethod(HttpMethod.GET).setPathRegex("/api/v1/modelRouter/open/clients/{id}/balance").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterGetClientBalanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterGetClientBalanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterGetClientBalanceLogs  ModelRouterGetClientBalanceLogsRequest
     * @return ModelRouterGetClientBalanceLogsResponse
     */
    @Override
    public CompletableFuture<ModelRouterGetClientBalanceLogsResponse> modelRouterGetClientBalanceLogs(ModelRouterGetClientBalanceLogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterGetClientBalanceLogs").setMethod(HttpMethod.GET).setPathRegex("/api/v1/modelRouter/open/clients/{id}/balance/logs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterGetClientBalanceLogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterGetClientBalanceLogsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterGetDeptBalanceSummary  ModelRouterGetDeptBalanceSummaryRequest
     * @return ModelRouterGetDeptBalanceSummaryResponse
     */
    @Override
    public CompletableFuture<ModelRouterGetDeptBalanceSummaryResponse> modelRouterGetDeptBalanceSummary(ModelRouterGetDeptBalanceSummaryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterGetDeptBalanceSummary").setMethod(HttpMethod.GET).setPathRegex("/api/v1/modelRouter/open/clients/{id}/balance-summary").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterGetDeptBalanceSummaryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterGetDeptBalanceSummaryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterGetMemberApiKeys  ModelRouterGetMemberApiKeysRequest
     * @return ModelRouterGetMemberApiKeysResponse
     */
    @Override
    public CompletableFuture<ModelRouterGetMemberApiKeysResponse> modelRouterGetMemberApiKeys(ModelRouterGetMemberApiKeysRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterGetMemberApiKeys").setMethod(HttpMethod.GET).setPathRegex("/api/v1/modelRouter/open/clients/{clientId}/members/{id}/apikeys").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterGetMemberApiKeysResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterGetMemberApiKeysResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterGetMemberBalance  ModelRouterGetMemberBalanceRequest
     * @return ModelRouterGetMemberBalanceResponse
     */
    @Override
    public CompletableFuture<ModelRouterGetMemberBalanceResponse> modelRouterGetMemberBalance(ModelRouterGetMemberBalanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterGetMemberBalance").setMethod(HttpMethod.GET).setPathRegex("/api/v1/modelRouter/open/clients/{clientId}/members/{id}/balance").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterGetMemberBalanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterGetMemberBalanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterGetMemberBalanceLogs  ModelRouterGetMemberBalanceLogsRequest
     * @return ModelRouterGetMemberBalanceLogsResponse
     */
    @Override
    public CompletableFuture<ModelRouterGetMemberBalanceLogsResponse> modelRouterGetMemberBalanceLogs(ModelRouterGetMemberBalanceLogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterGetMemberBalanceLogs").setMethod(HttpMethod.GET).setPathRegex("/api/v1/modelRouter/open/clients/{clientId}/members/{id}/balance/logs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterGetMemberBalanceLogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterGetMemberBalanceLogsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterGetUserRoles  ModelRouterGetUserRolesRequest
     * @return ModelRouterGetUserRolesResponse
     */
    @Override
    public CompletableFuture<ModelRouterGetUserRolesResponse> modelRouterGetUserRoles(ModelRouterGetUserRolesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterGetUserRoles").setMethod(HttpMethod.GET).setPathRegex("/api/v1/modelRouter/open/users/{id}/roles").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterGetUserRolesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterGetUserRolesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterListBalanceOrders  ModelRouterListBalanceOrdersRequest
     * @return ModelRouterListBalanceOrdersResponse
     */
    @Override
    public CompletableFuture<ModelRouterListBalanceOrdersResponse> modelRouterListBalanceOrders(ModelRouterListBalanceOrdersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterListBalanceOrders").setMethod(HttpMethod.GET).setPathRegex("/api/v1/modelRouter/open/clients/{id}/balance/orders").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterListBalanceOrdersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterListBalanceOrdersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterListDeptMembers  ModelRouterListDeptMembersRequest
     * @return ModelRouterListDeptMembersResponse
     */
    @Override
    public CompletableFuture<ModelRouterListDeptMembersResponse> modelRouterListDeptMembers(ModelRouterListDeptMembersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterListDeptMembers").setMethod(HttpMethod.GET).setPathRegex("/api/v1/modelRouter/open/clients/{id}/members").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterListDeptMembersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterListDeptMembersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterListMemberBalanceOrders  ModelRouterListMemberBalanceOrdersRequest
     * @return ModelRouterListMemberBalanceOrdersResponse
     */
    @Override
    public CompletableFuture<ModelRouterListMemberBalanceOrdersResponse> modelRouterListMemberBalanceOrders(ModelRouterListMemberBalanceOrdersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterListMemberBalanceOrders").setMethod(HttpMethod.GET).setPathRegex("/api/v1/modelRouter/open/clients/{clientId}/members/{id}/balance/orders").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterListMemberBalanceOrdersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterListMemberBalanceOrdersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterListMemberSubscriptions  ModelRouterListMemberSubscriptionsRequest
     * @return ModelRouterListMemberSubscriptionsResponse
     */
    @Override
    public CompletableFuture<ModelRouterListMemberSubscriptionsResponse> modelRouterListMemberSubscriptions(ModelRouterListMemberSubscriptionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterListMemberSubscriptions").setMethod(HttpMethod.GET).setPathRegex("/api/v1/modelRouter/open/clients/{clientId}/members/{id}/balance/subscription").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterListMemberSubscriptionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterListMemberSubscriptionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterListSubscriptions  ModelRouterListSubscriptionsRequest
     * @return ModelRouterListSubscriptionsResponse
     */
    @Override
    public CompletableFuture<ModelRouterListSubscriptionsResponse> modelRouterListSubscriptions(ModelRouterListSubscriptionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterListSubscriptions").setMethod(HttpMethod.GET).setPathRegex("/api/v1/modelRouter/open/clients/{id}/balance/subscription").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterListSubscriptionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterListSubscriptionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterMiguDownloadSource  ModelRouterMiguDownloadSourceRequest
     * @return ModelRouterMiguDownloadSourceResponse
     */
    @Override
    public CompletableFuture<ModelRouterMiguDownloadSourceResponse> modelRouterMiguDownloadSource(ModelRouterMiguDownloadSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterMiguDownloadSource").setMethod(HttpMethod.GET).setPathRegex("/api/v1/modelRouter/open/pipeline/api/aigc/source/download").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterMiguDownloadSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterMiguDownloadSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterMiguUploadSource  ModelRouterMiguUploadSourceRequest
     * @return ModelRouterMiguUploadSourceResponse
     */
    @Override
    public CompletableFuture<ModelRouterMiguUploadSourceResponse> modelRouterMiguUploadSource(ModelRouterMiguUploadSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterMiguUploadSource").setMethod(HttpMethod.POST).setPathRegex("/api/v1/modelRouter/open/pipeline/api/aigc/source/upload").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterMiguUploadSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterMiguUploadSourceResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of ModelRouterQueryBillingCostBreakdown  ModelRouterQueryBillingCostBreakdownRequest
     * @return ModelRouterQueryBillingCostBreakdownResponse
     */
    @Override
    public CompletableFuture<ModelRouterQueryBillingCostBreakdownResponse> modelRouterQueryBillingCostBreakdown(ModelRouterQueryBillingCostBreakdownRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterQueryBillingCostBreakdown").setMethod(HttpMethod.GET).setPathRegex("/api/v1/modelRouter/open/billing/cost/breakdown").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterQueryBillingCostBreakdownResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterQueryBillingCostBreakdownResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterQueryBillingDetails  ModelRouterQueryBillingDetailsRequest
     * @return ModelRouterQueryBillingDetailsResponse
     */
    @Override
    public CompletableFuture<ModelRouterQueryBillingDetailsResponse> modelRouterQueryBillingDetails(ModelRouterQueryBillingDetailsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterQueryBillingDetails").setMethod(HttpMethod.GET).setPathRegex("/api/v1/modelRouter/open/billing/details").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterQueryBillingDetailsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterQueryBillingDetailsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterQueryBillingRuleList  ModelRouterQueryBillingRuleListRequest
     * @return ModelRouterQueryBillingRuleListResponse
     */
    @Override
    public CompletableFuture<ModelRouterQueryBillingRuleListResponse> modelRouterQueryBillingRuleList(ModelRouterQueryBillingRuleListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterQueryBillingRuleList").setMethod(HttpMethod.GET).setPathRegex("/api/v1/modelRouter/open/billing/rules").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterQueryBillingRuleListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterQueryBillingRuleListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterQueryClientDiscountLogs  ModelRouterQueryClientDiscountLogsRequest
     * @return ModelRouterQueryClientDiscountLogsResponse
     */
    @Override
    public CompletableFuture<ModelRouterQueryClientDiscountLogsResponse> modelRouterQueryClientDiscountLogs(ModelRouterQueryClientDiscountLogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterQueryClientDiscountLogs").setMethod(HttpMethod.GET).setPathRegex("/api/v1/modelRouter/open/clients/{id}/discount-logs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterQueryClientDiscountLogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterQueryClientDiscountLogsResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of ModelRouterQueryClientTree  ModelRouterQueryClientTreeRequest
     * @return ModelRouterQueryClientTreeResponse
     */
    @Override
    public CompletableFuture<ModelRouterQueryClientTreeResponse> modelRouterQueryClientTree(ModelRouterQueryClientTreeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterQueryClientTree").setMethod(HttpMethod.GET).setPathRegex("/api/v1/modelRouter/open/clients/tree").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterQueryClientTreeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterQueryClientTreeResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of ModelRouterQueryCostModelDetail  ModelRouterQueryCostModelDetailRequest
     * @return ModelRouterQueryCostModelDetailResponse
     */
    @Override
    public CompletableFuture<ModelRouterQueryCostModelDetailResponse> modelRouterQueryCostModelDetail(ModelRouterQueryCostModelDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterQueryCostModelDetail").setMethod(HttpMethod.GET).setPathRegex("/api/v1/modelRouter/open/billing/cost/model-detail").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterQueryCostModelDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterQueryCostModelDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterQueryCostModelList  ModelRouterQueryCostModelListRequest
     * @return ModelRouterQueryCostModelListResponse
     */
    @Override
    public CompletableFuture<ModelRouterQueryCostModelListResponse> modelRouterQueryCostModelList(ModelRouterQueryCostModelListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterQueryCostModelList").setMethod(HttpMethod.GET).setPathRegex("/api/v1/modelRouter/open/billing/cost/models").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterQueryCostModelListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterQueryCostModelListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterQueryCostOverviewMetrics  ModelRouterQueryCostOverviewMetricsRequest
     * @return ModelRouterQueryCostOverviewMetricsResponse
     */
    @Override
    public CompletableFuture<ModelRouterQueryCostOverviewMetricsResponse> modelRouterQueryCostOverviewMetrics(ModelRouterQueryCostOverviewMetricsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterQueryCostOverviewMetrics").setMethod(HttpMethod.GET).setPathRegex("/api/v1/modelRouter/open/billing/cost/overview").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterQueryCostOverviewMetricsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterQueryCostOverviewMetricsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterQueryCostTrendMetrics  ModelRouterQueryCostTrendMetricsRequest
     * @return ModelRouterQueryCostTrendMetricsResponse
     */
    @Override
    public CompletableFuture<ModelRouterQueryCostTrendMetricsResponse> modelRouterQueryCostTrendMetrics(ModelRouterQueryCostTrendMetricsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterQueryCostTrendMetrics").setMethod(HttpMethod.GET).setPathRegex("/api/v1/modelRouter/open/billing/cost/trend").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterQueryCostTrendMetricsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterQueryCostTrendMetricsResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of ModelRouterQueryModelGroup  ModelRouterQueryModelGroupRequest
     * @return ModelRouterQueryModelGroupResponse
     */
    @Override
    public CompletableFuture<ModelRouterQueryModelGroupResponse> modelRouterQueryModelGroup(ModelRouterQueryModelGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterQueryModelGroup").setMethod(HttpMethod.GET).setPathRegex("/api/v1/modelRouter/open/model-groups/{groupId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterQueryModelGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterQueryModelGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterQueryModelGroupClients  ModelRouterQueryModelGroupClientsRequest
     * @return ModelRouterQueryModelGroupClientsResponse
     */
    @Override
    public CompletableFuture<ModelRouterQueryModelGroupClientsResponse> modelRouterQueryModelGroupClients(ModelRouterQueryModelGroupClientsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterQueryModelGroupClients").setMethod(HttpMethod.GET).setPathRegex("/api/v1/modelRouter/open/model-groups/{groupId}/clients").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterQueryModelGroupClientsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterQueryModelGroupClientsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterQueryModelGroupList  ModelRouterQueryModelGroupListRequest
     * @return ModelRouterQueryModelGroupListResponse
     */
    @Override
    public CompletableFuture<ModelRouterQueryModelGroupListResponse> modelRouterQueryModelGroupList(ModelRouterQueryModelGroupListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterQueryModelGroupList").setMethod(HttpMethod.GET).setPathRegex("/api/v1/modelRouter/open/model-groups").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterQueryModelGroupListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterQueryModelGroupListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterQueryModelGroupModels  ModelRouterQueryModelGroupModelsRequest
     * @return ModelRouterQueryModelGroupModelsResponse
     */
    @Override
    public CompletableFuture<ModelRouterQueryModelGroupModelsResponse> modelRouterQueryModelGroupModels(ModelRouterQueryModelGroupModelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterQueryModelGroupModels").setMethod(HttpMethod.GET).setPathRegex("/api/v1/modelRouter/open/model-groups/{groupId}/models").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterQueryModelGroupModelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterQueryModelGroupModelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterQueryModelGroupUsers  ModelRouterQueryModelGroupUsersRequest
     * @return ModelRouterQueryModelGroupUsersResponse
     */
    @Override
    public CompletableFuture<ModelRouterQueryModelGroupUsersResponse> modelRouterQueryModelGroupUsers(ModelRouterQueryModelGroupUsersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterQueryModelGroupUsers").setMethod(HttpMethod.GET).setPathRegex("/api/v1/modelRouter/open/model-groups/{groupId}/users").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterQueryModelGroupUsersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterQueryModelGroupUsersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterQueryModelGroupsByApiKey  ModelRouterQueryModelGroupsByApiKeyRequest
     * @return ModelRouterQueryModelGroupsByApiKeyResponse
     */
    @Override
    public CompletableFuture<ModelRouterQueryModelGroupsByApiKeyResponse> modelRouterQueryModelGroupsByApiKey(ModelRouterQueryModelGroupsByApiKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterQueryModelGroupsByApiKey").setMethod(HttpMethod.GET).setPathRegex("/api/v1/modelRouter/open/apikeys/{id}/model-groups").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterQueryModelGroupsByApiKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterQueryModelGroupsByApiKeyResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of ModelRouterQueryUsageBreakdown  ModelRouterQueryUsageBreakdownRequest
     * @return ModelRouterQueryUsageBreakdownResponse
     */
    @Override
    public CompletableFuture<ModelRouterQueryUsageBreakdownResponse> modelRouterQueryUsageBreakdown(ModelRouterQueryUsageBreakdownRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterQueryUsageBreakdown").setMethod(HttpMethod.GET).setPathRegex("/api/v1/modelRouter/open/usage/breakdown").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterQueryUsageBreakdownResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterQueryUsageBreakdownResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterQueryUserList  ModelRouterQueryUserListRequest
     * @return ModelRouterQueryUserListResponse
     */
    @Override
    public CompletableFuture<ModelRouterQueryUserListResponse> modelRouterQueryUserList(ModelRouterQueryUserListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterQueryUserList").setMethod(HttpMethod.GET).setPathRegex("/api/v1/modelRouter/open/users").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterQueryUserListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterQueryUserListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterResetMemberAuthorization  ModelRouterResetMemberAuthorizationRequest
     * @return ModelRouterResetMemberAuthorizationResponse
     */
    @Override
    public CompletableFuture<ModelRouterResetMemberAuthorizationResponse> modelRouterResetMemberAuthorization(ModelRouterResetMemberAuthorizationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterResetMemberAuthorization").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/modelRouter/open/clients/{clientId}/members/{id}/authorization").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterResetMemberAuthorizationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterResetMemberAuthorizationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterSaveFlowConfig  ModelRouterSaveFlowConfigRequest
     * @return ModelRouterSaveFlowConfigResponse
     */
    @Override
    public CompletableFuture<ModelRouterSaveFlowConfigResponse> modelRouterSaveFlowConfig(ModelRouterSaveFlowConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterSaveFlowConfig").setMethod(HttpMethod.POST).setPathRegex("/api/v1/modelRouter/open/flow-config").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterSaveFlowConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterSaveFlowConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterSearchClientTree  ModelRouterSearchClientTreeRequest
     * @return ModelRouterSearchClientTreeResponse
     */
    @Override
    public CompletableFuture<ModelRouterSearchClientTreeResponse> modelRouterSearchClientTree(ModelRouterSearchClientTreeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterSearchClientTree").setMethod(HttpMethod.GET).setPathRegex("/api/v1/modelRouter/open/clients/tree/search").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterSearchClientTreeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterSearchClientTreeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterSetMemberAuthorization  ModelRouterSetMemberAuthorizationRequest
     * @return ModelRouterSetMemberAuthorizationResponse
     */
    @Override
    public CompletableFuture<ModelRouterSetMemberAuthorizationResponse> modelRouterSetMemberAuthorization(ModelRouterSetMemberAuthorizationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterSetMemberAuthorization").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/modelRouter/open/clients/{clientId}/members/{id}/authorization").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterSetMemberAuthorizationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterSetMemberAuthorizationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterSetUserRoles  ModelRouterSetUserRolesRequest
     * @return ModelRouterSetUserRolesResponse
     */
    @Override
    public CompletableFuture<ModelRouterSetUserRolesResponse> modelRouterSetUserRoles(ModelRouterSetUserRolesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterSetUserRoles").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/modelRouter/open/users/{id}/roles").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterSetUserRolesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterSetUserRolesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterStopMemberSubscription  ModelRouterStopMemberSubscriptionRequest
     * @return ModelRouterStopMemberSubscriptionResponse
     */
    @Override
    public CompletableFuture<ModelRouterStopMemberSubscriptionResponse> modelRouterStopMemberSubscription(ModelRouterStopMemberSubscriptionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterStopMemberSubscription").setMethod(HttpMethod.POST).setPathRegex("/api/v1/modelRouter/open/clients/{clientId}/members/{id}/balance/subscription/stop").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterStopMemberSubscriptionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterStopMemberSubscriptionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterStopSubscription  ModelRouterStopSubscriptionRequest
     * @return ModelRouterStopSubscriptionResponse
     */
    @Override
    public CompletableFuture<ModelRouterStopSubscriptionResponse> modelRouterStopSubscription(ModelRouterStopSubscriptionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterStopSubscription").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/modelRouter/open/clients/{id}/balance/subscription/stop").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterStopSubscriptionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterStopSubscriptionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterTransferToMember  ModelRouterTransferToMemberRequest
     * @return ModelRouterTransferToMemberResponse
     */
    @Override
    public CompletableFuture<ModelRouterTransferToMemberResponse> modelRouterTransferToMember(ModelRouterTransferToMemberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterTransferToMember").setMethod(HttpMethod.POST).setPathRegex("/api/v1/modelRouter/open/clients/{clientId}/members/{id}/transfer").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterTransferToMemberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterTransferToMemberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterUpdateApiKeyStatus  ModelRouterUpdateApiKeyStatusRequest
     * @return ModelRouterUpdateApiKeyStatusResponse
     */
    @Override
    public CompletableFuture<ModelRouterUpdateApiKeyStatusResponse> modelRouterUpdateApiKeyStatus(ModelRouterUpdateApiKeyStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterUpdateApiKeyStatus").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/modelRouter/open/apikeys/{id}/status").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterUpdateApiKeyStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterUpdateApiKeyStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterUpdateBillingRule  ModelRouterUpdateBillingRuleRequest
     * @return ModelRouterUpdateBillingRuleResponse
     */
    @Override
    public CompletableFuture<ModelRouterUpdateBillingRuleResponse> modelRouterUpdateBillingRule(ModelRouterUpdateBillingRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterUpdateBillingRule").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/modelRouter/open/billing/rules/{id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterUpdateBillingRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterUpdateBillingRuleResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of ModelRouterUpdateModelGroup  ModelRouterUpdateModelGroupRequest
     * @return ModelRouterUpdateModelGroupResponse
     */
    @Override
    public CompletableFuture<ModelRouterUpdateModelGroupResponse> modelRouterUpdateModelGroup(ModelRouterUpdateModelGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterUpdateModelGroup").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/modelRouter/open/model-groups/{groupId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterUpdateModelGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterUpdateModelGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModelRouterUpdateUser  ModelRouterUpdateUserRequest
     * @return ModelRouterUpdateUserResponse
     */
    @Override
    public CompletableFuture<ModelRouterUpdateUserResponse> modelRouterUpdateUser(ModelRouterUpdateUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModelRouterUpdateUser").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/modelRouter/open/users/{id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModelRouterUpdateUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModelRouterUpdateUserResponse> future = new CompletableFuture<>();
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
