// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchplat20240529;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.searchplat20240529.models.*;
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
        this.product = "Searchplat";
        this.version = "2024-05-29";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of CreateAudioAsrTask  CreateAudioAsrTaskRequest
     * @return CreateAudioAsrTaskResponse
     */
    @Override
    public CompletableFuture<CreateAudioAsrTaskResponse> createAudioAsrTask(CreateAudioAsrTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateAudioAsrTask").setMethod(HttpMethod.POST).setPathRegex("/v3/openapi/workspaces/{workspace_name}/audio-asr/{service_id}/async").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAudioAsrTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAudioAsrTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDocumentAnalyzeTask  CreateDocumentAnalyzeTaskRequest
     * @return CreateDocumentAnalyzeTaskResponse
     */
    @Override
    public CompletableFuture<CreateDocumentAnalyzeTaskResponse> createDocumentAnalyzeTask(CreateDocumentAnalyzeTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateDocumentAnalyzeTask").setMethod(HttpMethod.POST).setPathRegex("/v3/openapi/workspaces/{workspace_name}/document-analyze/{service_id}/async").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDocumentAnalyzeTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDocumentAnalyzeTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateImageAnalyzeTask  CreateImageAnalyzeTaskRequest
     * @return CreateImageAnalyzeTaskResponse
     */
    @Override
    public CompletableFuture<CreateImageAnalyzeTaskResponse> createImageAnalyzeTask(CreateImageAnalyzeTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateImageAnalyzeTask").setMethod(HttpMethod.POST).setPathRegex("/v3/openapi/workspaces/{workspace_name}/image-analyze/{service_id}/async").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateImageAnalyzeTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateImageAnalyzeTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateVideoSnapshotTask  CreateVideoSnapshotTaskRequest
     * @return CreateVideoSnapshotTaskResponse
     */
    @Override
    public CompletableFuture<CreateVideoSnapshotTaskResponse> createVideoSnapshotTask(CreateVideoSnapshotTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateVideoSnapshotTask").setMethod(HttpMethod.POST).setPathRegex("/v3/openapi/workspaces/{workspace_name}/video-snapshot/{service_id}/async").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVideoSnapshotTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVideoSnapshotTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAudioAsrTaskStatus  GetAudioAsrTaskStatusRequest
     * @return GetAudioAsrTaskStatusResponse
     */
    @Override
    public CompletableFuture<GetAudioAsrTaskStatusResponse> getAudioAsrTaskStatus(GetAudioAsrTaskStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAudioAsrTaskStatus").setMethod(HttpMethod.GET).setPathRegex("/v3/openapi/workspaces/{workspace_name}/audio-asr/{service_id}/async/task-status").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAudioAsrTaskStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAudioAsrTaskStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDocumentAnalyzeTaskStatus  GetDocumentAnalyzeTaskStatusRequest
     * @return GetDocumentAnalyzeTaskStatusResponse
     */
    @Override
    public CompletableFuture<GetDocumentAnalyzeTaskStatusResponse> getDocumentAnalyzeTaskStatus(GetDocumentAnalyzeTaskStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDocumentAnalyzeTaskStatus").setMethod(HttpMethod.GET).setPathRegex("/v3/openapi/workspaces/{workspace_name}/document-analyze/{service_id}/async/task-status").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDocumentAnalyzeTaskStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDocumentAnalyzeTaskStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDocumentRank  GetDocumentRankRequest
     * @return GetDocumentRankResponse
     */
    @Override
    public CompletableFuture<GetDocumentRankResponse> getDocumentRank(GetDocumentRankRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDocumentRank").setMethod(HttpMethod.POST).setPathRegex("/v3/openapi/workspaces/{workspace_name}/ranker/{service_id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDocumentRankResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDocumentRankResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDocumentSplit  GetDocumentSplitRequest
     * @return GetDocumentSplitResponse
     */
    @Override
    public CompletableFuture<GetDocumentSplitResponse> getDocumentSplit(GetDocumentSplitRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDocumentSplit").setMethod(HttpMethod.POST).setPathRegex("/v3/openapi/workspaces/{workspace_name}/document-split/{service_id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDocumentSplitResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDocumentSplitResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetEmbeddingTuning  GetEmbeddingTuningRequest
     * @return GetEmbeddingTuningResponse
     */
    @Override
    public CompletableFuture<GetEmbeddingTuningResponse> getEmbeddingTuning(GetEmbeddingTuningRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetEmbeddingTuning").setMethod(HttpMethod.POST).setPathRegex("/v3/openapi/workspaces/{workspace_name}/embedding-tuning/{service_id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetEmbeddingTuningResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetEmbeddingTuningResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetImageAnalyzeTaskStatus  GetImageAnalyzeTaskStatusRequest
     * @return GetImageAnalyzeTaskStatusResponse
     */
    @Override
    public CompletableFuture<GetImageAnalyzeTaskStatusResponse> getImageAnalyzeTaskStatus(GetImageAnalyzeTaskStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetImageAnalyzeTaskStatus").setMethod(HttpMethod.GET).setPathRegex("/v3/openapi/workspaces/{workspace_name}/image-analyze/{service_id}/async/task-status").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetImageAnalyzeTaskStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetImageAnalyzeTaskStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMultiModalEmbedding  GetMultiModalEmbeddingRequest
     * @return GetMultiModalEmbeddingResponse
     */
    @Override
    public CompletableFuture<GetMultiModalEmbeddingResponse> getMultiModalEmbedding(GetMultiModalEmbeddingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMultiModalEmbedding").setMethod(HttpMethod.POST).setPathRegex("/v3/openapi/workspaces/{workspace_name}/multi-modal-embedding/{service_id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMultiModalEmbeddingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMultiModalEmbeddingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPrediction  GetPredictionRequest
     * @return GetPredictionResponse
     */
    @Override
    public CompletableFuture<GetPredictionResponse> getPrediction(GetPredictionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetPrediction").setMethod(HttpMethod.POST).setPathRegex("/v3/openapi/deployments/{deployment_id}/predict").setBodyType(BodyType.STRING).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPredictionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPredictionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetQueryAnalysis  GetQueryAnalysisRequest
     * @return GetQueryAnalysisResponse
     */
    @Override
    public CompletableFuture<GetQueryAnalysisResponse> getQueryAnalysis(GetQueryAnalysisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetQueryAnalysis").setMethod(HttpMethod.POST).setPathRegex("/v3/openapi/workspaces/{workspace_name}/query-analyze/{service_id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetQueryAnalysisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetQueryAnalysisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTextEmbedding  GetTextEmbeddingRequest
     * @return GetTextEmbeddingResponse
     */
    @Override
    public CompletableFuture<GetTextEmbeddingResponse> getTextEmbedding(GetTextEmbeddingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTextEmbedding").setMethod(HttpMethod.POST).setPathRegex("/v3/openapi/workspaces/{workspace_name}/text-embedding/{service_id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTextEmbeddingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTextEmbeddingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTextGeneration  GetTextGenerationRequest
     * @return GetTextGenerationResponse
     */
    @Override
    public CompletableFuture<GetTextGenerationResponse> getTextGeneration(GetTextGenerationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTextGeneration").setMethod(HttpMethod.POST).setPathRegex("/v3/openapi/workspaces/{workspace_name}/text-generation/{service_id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTextGenerationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTextGenerationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTextSparseEmbedding  GetTextSparseEmbeddingRequest
     * @return GetTextSparseEmbeddingResponse
     */
    @Override
    public CompletableFuture<GetTextSparseEmbeddingResponse> getTextSparseEmbedding(GetTextSparseEmbeddingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTextSparseEmbedding").setMethod(HttpMethod.POST).setPathRegex("/v3/openapi/workspaces/{workspace_name}/text-sparse-embedding/{service_id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTextSparseEmbeddingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTextSparseEmbeddingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetVideoSnapshotTaskStatus  GetVideoSnapshotTaskStatusRequest
     * @return GetVideoSnapshotTaskStatusResponse
     */
    @Override
    public CompletableFuture<GetVideoSnapshotTaskStatusResponse> getVideoSnapshotTaskStatus(GetVideoSnapshotTaskStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetVideoSnapshotTaskStatus").setMethod(HttpMethod.GET).setPathRegex("/v3/openapi/workspaces/{workspace_name}/video-snapshot/{service_id}/async/task-status").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetVideoSnapshotTaskStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetVideoSnapshotTaskStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetWebSearch  GetWebSearchRequest
     * @return GetWebSearchResponse
     */
    @Override
    public CompletableFuture<GetWebSearchResponse> getWebSearch(GetWebSearchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetWebSearch").setMethod(HttpMethod.POST).setPathRegex("/v3/openapi/workspaces/{workspace_name}/web-search/{service_id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetWebSearchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetWebSearchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
