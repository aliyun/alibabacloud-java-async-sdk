// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbai20251013;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.polardbai20251013.models.*;
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
     * @param request the request parameters of ChatBIConfigCreate  ChatBIConfigCreateRequest
     * @return ChatBIConfigCreateResponse
     */
    CompletableFuture<ChatBIConfigCreateResponse> chatBIConfigCreate(ChatBIConfigCreateRequest request);

    /**
     * @param request the request parameters of ChatBIConfigDelete  ChatBIConfigDeleteRequest
     * @return ChatBIConfigDeleteResponse
     */
    CompletableFuture<ChatBIConfigDeleteResponse> chatBIConfigDelete(ChatBIConfigDeleteRequest request);

    /**
     * @param request the request parameters of ChatBIConfigDeleteEntry  ChatBIConfigDeleteEntryRequest
     * @return ChatBIConfigDeleteEntryResponse
     */
    CompletableFuture<ChatBIConfigDeleteEntryResponse> chatBIConfigDeleteEntry(ChatBIConfigDeleteEntryRequest request);

    /**
     * @param request the request parameters of ChatBIConfigQueryEntries  ChatBIConfigQueryEntriesRequest
     * @return ChatBIConfigQueryEntriesResponse
     */
    CompletableFuture<ChatBIConfigQueryEntriesResponse> chatBIConfigQueryEntries(ChatBIConfigQueryEntriesRequest request);

    /**
     * @param request the request parameters of ChatBIConfigQueryTables  ChatBIConfigQueryTablesRequest
     * @return ChatBIConfigQueryTablesResponse
     */
    CompletableFuture<ChatBIConfigQueryTablesResponse> chatBIConfigQueryTables(ChatBIConfigQueryTablesRequest request);

    /**
     * @param request the request parameters of ChatBIConfigUpdateEntry  ChatBIConfigUpdateEntryRequest
     * @return ChatBIConfigUpdateEntryResponse
     */
    CompletableFuture<ChatBIConfigUpdateEntryResponse> chatBIConfigUpdateEntry(ChatBIConfigUpdateEntryRequest request);

    /**
     * @param request the request parameters of ChatBIFileTemplateDownload  ChatBIFileTemplateDownloadRequest
     * @return ChatBIFileTemplateDownloadResponse
     */
    CompletableFuture<ChatBIFileTemplateDownloadResponse> chatBIFileTemplateDownload(ChatBIFileTemplateDownloadRequest request);

    /**
     * @param request the request parameters of ChatBIFileUpload  ChatBIFileUploadRequest
     * @return ChatBIFileUploadResponse
     */
    CompletableFuture<ChatBIFileUploadResponse> chatBIFileUpload(ChatBIFileUploadRequest request);

    /**
     * @param request the request parameters of ChatBIFileUploadCallback  ChatBIFileUploadCallbackRequest
     * @return ChatBIFileUploadCallbackResponse
     */
    CompletableFuture<ChatBIFileUploadCallbackResponse> chatBIFileUploadCallback(ChatBIFileUploadCallbackRequest request);

    /**
     * @param request the request parameters of ChatBIPatternCreate  ChatBIPatternCreateRequest
     * @return ChatBIPatternCreateResponse
     */
    CompletableFuture<ChatBIPatternCreateResponse> chatBIPatternCreate(ChatBIPatternCreateRequest request);

    /**
     * @param request the request parameters of ChatBIPatternDelete  ChatBIPatternDeleteRequest
     * @return ChatBIPatternDeleteResponse
     */
    CompletableFuture<ChatBIPatternDeleteResponse> chatBIPatternDelete(ChatBIPatternDeleteRequest request);

    /**
     * @param request the request parameters of ChatBIPatternDeleteEntry  ChatBIPatternDeleteEntryRequest
     * @return ChatBIPatternDeleteEntryResponse
     */
    CompletableFuture<ChatBIPatternDeleteEntryResponse> chatBIPatternDeleteEntry(ChatBIPatternDeleteEntryRequest request);

    /**
     * @param request the request parameters of ChatBIPatternIndexCreate  ChatBIPatternIndexCreateRequest
     * @return ChatBIPatternIndexCreateResponse
     */
    CompletableFuture<ChatBIPatternIndexCreateResponse> chatBIPatternIndexCreate(ChatBIPatternIndexCreateRequest request);

    /**
     * @param request the request parameters of ChatBIPatternIndexDelete  ChatBIPatternIndexDeleteRequest
     * @return ChatBIPatternIndexDeleteResponse
     */
    CompletableFuture<ChatBIPatternIndexDeleteResponse> chatBIPatternIndexDelete(ChatBIPatternIndexDeleteRequest request);

    /**
     * @param request the request parameters of ChatBIPatternIndexQueryTables  ChatBIPatternIndexQueryTablesRequest
     * @return ChatBIPatternIndexQueryTablesResponse
     */
    CompletableFuture<ChatBIPatternIndexQueryTablesResponse> chatBIPatternIndexQueryTables(ChatBIPatternIndexQueryTablesRequest request);

    /**
     * @param request the request parameters of ChatBIPatternQueryEntries  ChatBIPatternQueryEntriesRequest
     * @return ChatBIPatternQueryEntriesResponse
     */
    CompletableFuture<ChatBIPatternQueryEntriesResponse> chatBIPatternQueryEntries(ChatBIPatternQueryEntriesRequest request);

    /**
     * @param request the request parameters of ChatBIPatternQueryTables  ChatBIPatternQueryTablesRequest
     * @return ChatBIPatternQueryTablesResponse
     */
    CompletableFuture<ChatBIPatternQueryTablesResponse> chatBIPatternQueryTables(ChatBIPatternQueryTablesRequest request);

    /**
     * @param request the request parameters of ChatBIPatternUpdateEntry  ChatBIPatternUpdateEntryRequest
     * @return ChatBIPatternUpdateEntryResponse
     */
    CompletableFuture<ChatBIPatternUpdateEntryResponse> chatBIPatternUpdateEntry(ChatBIPatternUpdateEntryRequest request);

    /**
     * @param request the request parameters of ChatBIPredictSse  ChatBIPredictSseRequest
     * @return ChatBIPredictSseResponse
     */
    CompletableFuture<ChatBIPredictSseResponse> chatBIPredictSse(ChatBIPredictSseRequest request);

    ResponseIterable<ChatBIPredictSseResponseBody> chatBIPredictSseWithResponseIterable(ChatBIPredictSseRequest request);

    /**
     * @param request the request parameters of ChatBISchemaIndexCreate  ChatBISchemaIndexCreateRequest
     * @return ChatBISchemaIndexCreateResponse
     */
    CompletableFuture<ChatBISchemaIndexCreateResponse> chatBISchemaIndexCreate(ChatBISchemaIndexCreateRequest request);

    /**
     * @param request the request parameters of ChatBISchemaIndexDelete  ChatBISchemaIndexDeleteRequest
     * @return ChatBISchemaIndexDeleteResponse
     */
    CompletableFuture<ChatBISchemaIndexDeleteResponse> chatBISchemaIndexDelete(ChatBISchemaIndexDeleteRequest request);

    /**
     * @param request the request parameters of ChatBISchemaIndexQueryTables  ChatBISchemaIndexQueryTablesRequest
     * @return ChatBISchemaIndexQueryTablesResponse
     */
    CompletableFuture<ChatBISchemaIndexQueryTablesResponse> chatBISchemaIndexQueryTables(ChatBISchemaIndexQueryTablesRequest request);

    /**
     * @param request the request parameters of ChatBIUpdateTableValidationColumns  ChatBIUpdateTableValidationColumnsRequest
     * @return ChatBIUpdateTableValidationColumnsResponse
     */
    CompletableFuture<ChatBIUpdateTableValidationColumnsResponse> chatBIUpdateTableValidationColumns(ChatBIUpdateTableValidationColumnsRequest request);

    /**
     * @param request the request parameters of CreateMultimodalDataset  CreateMultimodalDatasetRequest
     * @return CreateMultimodalDatasetResponse
     */
    CompletableFuture<CreateMultimodalDatasetResponse> createMultimodalDataset(CreateMultimodalDatasetRequest request);

    /**
     * @param request the request parameters of CreateMultimodalDatasetEmbedding  CreateMultimodalDatasetEmbeddingRequest
     * @return CreateMultimodalDatasetEmbeddingResponse
     */
    CompletableFuture<CreateMultimodalDatasetEmbeddingResponse> createMultimodalDatasetEmbedding(CreateMultimodalDatasetEmbeddingRequest request);

    /**
     * @param request the request parameters of CreateMultimodalSearchTask  CreateMultimodalSearchTaskRequest
     * @return CreateMultimodalSearchTaskResponse
     */
    CompletableFuture<CreateMultimodalSearchTaskResponse> createMultimodalSearchTask(CreateMultimodalSearchTaskRequest request);

    /**
     * @param request the request parameters of DeleteMultimodalDataset  DeleteMultimodalDatasetRequest
     * @return DeleteMultimodalDatasetResponse
     */
    CompletableFuture<DeleteMultimodalDatasetResponse> deleteMultimodalDataset(DeleteMultimodalDatasetRequest request);

    /**
     * @param request the request parameters of DeleteMultimodalEmbedding  DeleteMultimodalEmbeddingRequest
     * @return DeleteMultimodalEmbeddingResponse
     */
    CompletableFuture<DeleteMultimodalEmbeddingResponse> deleteMultimodalEmbedding(DeleteMultimodalEmbeddingRequest request);

    /**
     * @param request the request parameters of DownloadMultimodalSearchTaskResultMetadata  DownloadMultimodalSearchTaskResultMetadataRequest
     * @return DownloadMultimodalSearchTaskResultMetadataResponse
     */
    CompletableFuture<DownloadMultimodalSearchTaskResultMetadataResponse> downloadMultimodalSearchTaskResultMetadata(DownloadMultimodalSearchTaskResultMetadataRequest request);

    /**
     * @param request the request parameters of ListMultimodalDataset  ListMultimodalDatasetRequest
     * @return ListMultimodalDatasetResponse
     */
    CompletableFuture<ListMultimodalDatasetResponse> listMultimodalDataset(ListMultimodalDatasetRequest request);

    /**
     * @param request the request parameters of ListMultimodalEmbeddingModel  ListMultimodalEmbeddingModelRequest
     * @return ListMultimodalEmbeddingModelResponse
     */
    CompletableFuture<ListMultimodalEmbeddingModelResponse> listMultimodalEmbeddingModel(ListMultimodalEmbeddingModelRequest request);

    /**
     * @param request the request parameters of ListMultimodalSearchTask  ListMultimodalSearchTaskRequest
     * @return ListMultimodalSearchTaskResponse
     */
    CompletableFuture<ListMultimodalSearchTaskResponse> listMultimodalSearchTask(ListMultimodalSearchTaskRequest request);

    /**
     * @param request the request parameters of UpdateMultimodalDataset  UpdateMultimodalDatasetRequest
     * @return UpdateMultimodalDatasetResponse
     */
    CompletableFuture<UpdateMultimodalDatasetResponse> updateMultimodalDataset(UpdateMultimodalDatasetRequest request);

    /**
     * @param request the request parameters of UploadOSSMultimodalDataset  UploadOSSMultimodalDatasetRequest
     * @return UploadOSSMultimodalDatasetResponse
     */
    CompletableFuture<UploadOSSMultimodalDatasetResponse> uploadOSSMultimodalDataset(UploadOSSMultimodalDatasetRequest request);

}
