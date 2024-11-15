// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchplat20240529;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.searchplat20240529.models.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;

import java.util.concurrent.CompletableFuture;

public interface AsyncClient extends SdkAutoCloseable {

    static DefaultAsyncClientBuilder builder() {
        return new DefaultAsyncClientBuilder();
    }

    static AsyncClient create() {
        return builder().build();
    }

    /**
     * @param request the request parameters of CreateDocumentAnalyzeTask  CreateDocumentAnalyzeTaskRequest
     * @return CreateDocumentAnalyzeTaskResponse
     */
    CompletableFuture<CreateDocumentAnalyzeTaskResponse> createDocumentAnalyzeTask(CreateDocumentAnalyzeTaskRequest request);

    /**
     * @param request the request parameters of CreateImageAnalyzeTask  CreateImageAnalyzeTaskRequest
     * @return CreateImageAnalyzeTaskResponse
     */
    CompletableFuture<CreateImageAnalyzeTaskResponse> createImageAnalyzeTask(CreateImageAnalyzeTaskRequest request);

    /**
     * @param request the request parameters of GetDocumentAnalyzeTaskStatus  GetDocumentAnalyzeTaskStatusRequest
     * @return GetDocumentAnalyzeTaskStatusResponse
     */
    CompletableFuture<GetDocumentAnalyzeTaskStatusResponse> getDocumentAnalyzeTaskStatus(GetDocumentAnalyzeTaskStatusRequest request);

    /**
     * @param request the request parameters of GetDocumentRank  GetDocumentRankRequest
     * @return GetDocumentRankResponse
     */
    CompletableFuture<GetDocumentRankResponse> getDocumentRank(GetDocumentRankRequest request);

    /**
     * @param request the request parameters of GetDocumentSplit  GetDocumentSplitRequest
     * @return GetDocumentSplitResponse
     */
    CompletableFuture<GetDocumentSplitResponse> getDocumentSplit(GetDocumentSplitRequest request);

    /**
     * @param request the request parameters of GetEmbeddingTuning  GetEmbeddingTuningRequest
     * @return GetEmbeddingTuningResponse
     */
    CompletableFuture<GetEmbeddingTuningResponse> getEmbeddingTuning(GetEmbeddingTuningRequest request);

    /**
     * @param request the request parameters of GetImageAnalyzeTaskStatus  GetImageAnalyzeTaskStatusRequest
     * @return GetImageAnalyzeTaskStatusResponse
     */
    CompletableFuture<GetImageAnalyzeTaskStatusResponse> getImageAnalyzeTaskStatus(GetImageAnalyzeTaskStatusRequest request);

    /**
     * @param request the request parameters of GetQueryAnalysis  GetQueryAnalysisRequest
     * @return GetQueryAnalysisResponse
     */
    CompletableFuture<GetQueryAnalysisResponse> getQueryAnalysis(GetQueryAnalysisRequest request);

    /**
     * @param request the request parameters of GetTextEmbedding  GetTextEmbeddingRequest
     * @return GetTextEmbeddingResponse
     */
    CompletableFuture<GetTextEmbeddingResponse> getTextEmbedding(GetTextEmbeddingRequest request);

    /**
     * @param request the request parameters of GetTextGeneration  GetTextGenerationRequest
     * @return GetTextGenerationResponse
     */
    CompletableFuture<GetTextGenerationResponse> getTextGeneration(GetTextGenerationRequest request);

    /**
     * @param request the request parameters of GetTextSparseEmbedding  GetTextSparseEmbeddingRequest
     * @return GetTextSparseEmbeddingResponse
     */
    CompletableFuture<GetTextSparseEmbeddingResponse> getTextSparseEmbedding(GetTextSparseEmbeddingRequest request);

}
