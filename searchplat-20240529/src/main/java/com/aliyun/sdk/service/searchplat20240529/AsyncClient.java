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
     * @param request the request parameters of CreateAudioAsrTask  CreateAudioAsrTaskRequest
     * @return CreateAudioAsrTaskResponse
     */
    CompletableFuture<CreateAudioAsrTaskResponse> createAudioAsrTask(CreateAudioAsrTaskRequest request);

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
     * @param request the request parameters of CreateVideoSnapshotTask  CreateVideoSnapshotTaskRequest
     * @return CreateVideoSnapshotTaskResponse
     */
    CompletableFuture<CreateVideoSnapshotTaskResponse> createVideoSnapshotTask(CreateVideoSnapshotTaskRequest request);

    /**
     * @param request the request parameters of GetAudioAsrTaskStatus  GetAudioAsrTaskStatusRequest
     * @return GetAudioAsrTaskStatusResponse
     */
    CompletableFuture<GetAudioAsrTaskStatusResponse> getAudioAsrTaskStatus(GetAudioAsrTaskStatusRequest request);

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
     * @param request the request parameters of GetMultiModalEmbedding  GetMultiModalEmbeddingRequest
     * @return GetMultiModalEmbeddingResponse
     */
    CompletableFuture<GetMultiModalEmbeddingResponse> getMultiModalEmbedding(GetMultiModalEmbeddingRequest request);

    /**
     * @param request the request parameters of GetPrediction  GetPredictionRequest
     * @return GetPredictionResponse
     */
    CompletableFuture<GetPredictionResponse> getPrediction(GetPredictionRequest request);

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

    /**
     * @param request the request parameters of GetVideoSnapshotTaskStatus  GetVideoSnapshotTaskStatusRequest
     * @return GetVideoSnapshotTaskStatusResponse
     */
    CompletableFuture<GetVideoSnapshotTaskStatusResponse> getVideoSnapshotTaskStatus(GetVideoSnapshotTaskStatusRequest request);

    /**
     * @param request the request parameters of GetWebSearch  GetWebSearchRequest
     * @return GetWebSearchResponse
     */
    CompletableFuture<GetWebSearchResponse> getWebSearch(GetWebSearchRequest request);

}
