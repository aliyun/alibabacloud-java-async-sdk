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
     * @param request the request parameters of CreateMemory  CreateMemoryRequest
     * @return CreateMemoryResponse
     */
    CompletableFuture<CreateMemoryResponse> createMemory(CreateMemoryRequest request);

    /**
     * @param request the request parameters of CreateMemorySkill  CreateMemorySkillRequest
     * @return CreateMemorySkillResponse
     */
    CompletableFuture<CreateMemorySkillResponse> createMemorySkill(CreateMemorySkillRequest request);

    /**
     * @param request the request parameters of CreateVideoSegmentationTask  CreateVideoSegmentationTaskRequest
     * @return CreateVideoSegmentationTaskResponse
     */
    CompletableFuture<CreateVideoSegmentationTaskResponse> createVideoSegmentationTask(CreateVideoSegmentationTaskRequest request);

    /**
     * @param request the request parameters of CreateVideoSnapshotTask  CreateVideoSnapshotTaskRequest
     * @return CreateVideoSnapshotTaskResponse
     */
    CompletableFuture<CreateVideoSnapshotTaskResponse> createVideoSnapshotTask(CreateVideoSnapshotTaskRequest request);

    /**
     * @param request the request parameters of CreateVideoSummarizationTask  CreateVideoSummarizationTaskRequest
     * @return CreateVideoSummarizationTaskResponse
     */
    CompletableFuture<CreateVideoSummarizationTaskResponse> createVideoSummarizationTask(CreateVideoSummarizationTaskRequest request);

    /**
     * @param request the request parameters of DeleteMemory  DeleteMemoryRequest
     * @return DeleteMemoryResponse
     */
    CompletableFuture<DeleteMemoryResponse> deleteMemory(DeleteMemoryRequest request);

    /**
     * @param request the request parameters of DeleteMemorySkill  DeleteMemorySkillRequest
     * @return DeleteMemorySkillResponse
     */
    CompletableFuture<DeleteMemorySkillResponse> deleteMemorySkill(DeleteMemorySkillRequest request);

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
     * @param request the request parameters of GetImageObjectDetection  GetImageObjectDetectionRequest
     * @return GetImageObjectDetectionResponse
     */
    CompletableFuture<GetImageObjectDetectionResponse> getImageObjectDetection(GetImageObjectDetectionRequest request);

    /**
     * @param request the request parameters of GetMemory  GetMemoryRequest
     * @return GetMemoryResponse
     */
    CompletableFuture<GetMemoryResponse> getMemory(GetMemoryRequest request);

    /**
     * @param request the request parameters of GetMemoryHealth  GetMemoryHealthRequest
     * @return GetMemoryHealthResponse
     */
    CompletableFuture<GetMemoryHealthResponse> getMemoryHealth(GetMemoryHealthRequest request);

    /**
     * @param request the request parameters of GetMemorySkill  GetMemorySkillRequest
     * @return GetMemorySkillResponse
     */
    CompletableFuture<GetMemorySkillResponse> getMemorySkill(GetMemorySkillRequest request);

    /**
     * @param request the request parameters of GetMemoryTask  GetMemoryTaskRequest
     * @return GetMemoryTaskResponse
     */
    CompletableFuture<GetMemoryTaskResponse> getMemoryTask(GetMemoryTaskRequest request);

    /**
     * @param request the request parameters of GetMultiModalEmbedding  GetMultiModalEmbeddingRequest
     * @return GetMultiModalEmbeddingResponse
     */
    CompletableFuture<GetMultiModalEmbeddingResponse> getMultiModalEmbedding(GetMultiModalEmbeddingRequest request);

    /**
     * @param request the request parameters of GetMultiModalReranker  GetMultiModalRerankerRequest
     * @return GetMultiModalRerankerResponse
     */
    CompletableFuture<GetMultiModalRerankerResponse> getMultiModalReranker(GetMultiModalRerankerRequest request);

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
     * @param request the request parameters of GetVideoSegmentationTaskStatus  GetVideoSegmentationTaskStatusRequest
     * @return GetVideoSegmentationTaskStatusResponse
     */
    CompletableFuture<GetVideoSegmentationTaskStatusResponse> getVideoSegmentationTaskStatus(GetVideoSegmentationTaskStatusRequest request);

    /**
     * @param request the request parameters of GetVideoSnapshotTaskStatus  GetVideoSnapshotTaskStatusRequest
     * @return GetVideoSnapshotTaskStatusResponse
     */
    CompletableFuture<GetVideoSnapshotTaskStatusResponse> getVideoSnapshotTaskStatus(GetVideoSnapshotTaskStatusRequest request);

    /**
     * @param request the request parameters of GetVideoSummarizationTaskStatus  GetVideoSummarizationTaskStatusRequest
     * @return GetVideoSummarizationTaskStatusResponse
     */
    CompletableFuture<GetVideoSummarizationTaskStatusResponse> getVideoSummarizationTaskStatus(GetVideoSummarizationTaskStatusRequest request);

    /**
     * @param request the request parameters of GetWebSearch  GetWebSearchRequest
     * @return GetWebSearchResponse
     */
    CompletableFuture<GetWebSearchResponse> getWebSearch(GetWebSearchRequest request);

    /**
     * @param request the request parameters of SearchMemory  SearchMemoryRequest
     * @return SearchMemoryResponse
     */
    CompletableFuture<SearchMemoryResponse> searchMemory(SearchMemoryRequest request);

    /**
     * @param request the request parameters of UpdateMemory  UpdateMemoryRequest
     * @return UpdateMemoryResponse
     */
    CompletableFuture<UpdateMemoryResponse> updateMemory(UpdateMemoryRequest request);

    /**
     * @param request the request parameters of UpdateMemorySkill  UpdateMemorySkillRequest
     * @return UpdateMemorySkillResponse
     */
    CompletableFuture<UpdateMemorySkillResponse> updateMemorySkill(UpdateMemorySkillRequest request);

}
