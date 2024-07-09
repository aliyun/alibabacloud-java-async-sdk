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

}
