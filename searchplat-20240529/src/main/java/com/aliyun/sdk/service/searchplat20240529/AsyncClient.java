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

    CompletableFuture<CreateDocumentAnalyzeTaskResponse> createDocumentAnalyzeTask(CreateDocumentAnalyzeTaskRequest request);

    CompletableFuture<CreateImageAnalyzeTaskResponse> createImageAnalyzeTask(CreateImageAnalyzeTaskRequest request);

    CompletableFuture<GetDocumentAnalyzeTaskStatusResponse> getDocumentAnalyzeTaskStatus(GetDocumentAnalyzeTaskStatusRequest request);

    CompletableFuture<GetDocumentRankResponse> getDocumentRank(GetDocumentRankRequest request);

    CompletableFuture<GetDocumentSplitResponse> getDocumentSplit(GetDocumentSplitRequest request);

    CompletableFuture<GetImageAnalyzeTaskStatusResponse> getImageAnalyzeTaskStatus(GetImageAnalyzeTaskStatusRequest request);

    CompletableFuture<GetQueryAnalysisResponse> getQueryAnalysis(GetQueryAnalysisRequest request);

    CompletableFuture<GetTextEmbeddingResponse> getTextEmbedding(GetTextEmbeddingRequest request);

    CompletableFuture<GetTextGenerationResponse> getTextGeneration(GetTextGenerationRequest request);

    CompletableFuture<GetTextSparseEmbeddingResponse> getTextSparseEmbedding(GetTextSparseEmbeddingRequest request);

}
