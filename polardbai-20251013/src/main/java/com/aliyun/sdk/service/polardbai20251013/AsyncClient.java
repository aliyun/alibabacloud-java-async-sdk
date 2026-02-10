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
     * @param request the request parameters of AddOSSMultimodalFineTuneDataset  AddOSSMultimodalFineTuneDatasetRequest
     * @return AddOSSMultimodalFineTuneDatasetResponse
     */
    CompletableFuture<AddOSSMultimodalFineTuneDatasetResponse> addOSSMultimodalFineTuneDataset(AddOSSMultimodalFineTuneDatasetRequest request);

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
     * @param request the request parameters of CreateMultimodalFineTuneDataset  CreateMultimodalFineTuneDatasetRequest
     * @return CreateMultimodalFineTuneDatasetResponse
     */
    CompletableFuture<CreateMultimodalFineTuneDatasetResponse> createMultimodalFineTuneDataset(CreateMultimodalFineTuneDatasetRequest request);

    /**
     * @param request the request parameters of CreateMultimodalLabelStudioService  CreateMultimodalLabelStudioServiceRequest
     * @return CreateMultimodalLabelStudioServiceResponse
     */
    CompletableFuture<CreateMultimodalLabelStudioServiceResponse> createMultimodalLabelStudioService(CreateMultimodalLabelStudioServiceRequest request);

    /**
     * @param request the request parameters of CreateMultimodalSearchTask  CreateMultimodalSearchTaskRequest
     * @return CreateMultimodalSearchTaskResponse
     */
    CompletableFuture<CreateMultimodalSearchTaskResponse> createMultimodalSearchTask(CreateMultimodalSearchTaskRequest request);

    /**
     * @param request the request parameters of CreateMultimodalSearchTaskResultFineTuneDataset  CreateMultimodalSearchTaskResultFineTuneDatasetRequest
     * @return CreateMultimodalSearchTaskResultFineTuneDatasetResponse
     */
    CompletableFuture<CreateMultimodalSearchTaskResultFineTuneDatasetResponse> createMultimodalSearchTaskResultFineTuneDataset(CreateMultimodalSearchTaskResultFineTuneDatasetRequest request);

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
     * @param request the request parameters of DeleteMultimodalFineTuneDataset  DeleteMultimodalFineTuneDatasetRequest
     * @return DeleteMultimodalFineTuneDatasetResponse
     */
    CompletableFuture<DeleteMultimodalFineTuneDatasetResponse> deleteMultimodalFineTuneDataset(DeleteMultimodalFineTuneDatasetRequest request);

    /**
     * @param request the request parameters of DeleteMultimodalLabelStudioService  DeleteMultimodalLabelStudioServiceRequest
     * @return DeleteMultimodalLabelStudioServiceResponse
     */
    CompletableFuture<DeleteMultimodalLabelStudioServiceResponse> deleteMultimodalLabelStudioService(DeleteMultimodalLabelStudioServiceRequest request);

    /**
     * @param request the request parameters of DeleteOSSMultimodalFineTuneDataset  DeleteOSSMultimodalFineTuneDatasetRequest
     * @return DeleteOSSMultimodalFineTuneDatasetResponse
     */
    CompletableFuture<DeleteOSSMultimodalFineTuneDatasetResponse> deleteOSSMultimodalFineTuneDataset(DeleteOSSMultimodalFineTuneDatasetRequest request);

    /**
     * @param request the request parameters of DownloadMultimodalSearchTaskResultMetadata  DownloadMultimodalSearchTaskResultMetadataRequest
     * @return DownloadMultimodalSearchTaskResultMetadataResponse
     */
    CompletableFuture<DownloadMultimodalSearchTaskResultMetadataResponse> downloadMultimodalSearchTaskResultMetadata(DownloadMultimodalSearchTaskResultMetadataRequest request);

    /**
     * @param request the request parameters of GetUserToken  GetUserTokenRequest
     * @return GetUserTokenResponse
     */
    CompletableFuture<GetUserTokenResponse> getUserToken(GetUserTokenRequest request);

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
     * @param request the request parameters of ListMultimodalEmbeddingModelMode  ListMultimodalEmbeddingModelModeRequest
     * @return ListMultimodalEmbeddingModelModeResponse
     */
    CompletableFuture<ListMultimodalEmbeddingModelModeResponse> listMultimodalEmbeddingModelMode(ListMultimodalEmbeddingModelModeRequest request);

    /**
     * @param request the request parameters of ListMultimodalFineTuneDataset  ListMultimodalFineTuneDatasetRequest
     * @return ListMultimodalFineTuneDatasetResponse
     */
    CompletableFuture<ListMultimodalFineTuneDatasetResponse> listMultimodalFineTuneDataset(ListMultimodalFineTuneDatasetRequest request);

    /**
     * @param request the request parameters of ListMultimodalLabelStudioService  ListMultimodalLabelStudioServiceRequest
     * @return ListMultimodalLabelStudioServiceResponse
     */
    CompletableFuture<ListMultimodalLabelStudioServiceResponse> listMultimodalLabelStudioService(ListMultimodalLabelStudioServiceRequest request);

    /**
     * @param request the request parameters of ListMultimodalSearchModel  ListMultimodalSearchModelRequest
     * @return ListMultimodalSearchModelResponse
     */
    CompletableFuture<ListMultimodalSearchModelResponse> listMultimodalSearchModel(ListMultimodalSearchModelRequest request);

    /**
     * @param request the request parameters of ListMultimodalSearchTask  ListMultimodalSearchTaskRequest
     * @return ListMultimodalSearchTaskResponse
     */
    CompletableFuture<ListMultimodalSearchTaskResponse> listMultimodalSearchTask(ListMultimodalSearchTaskRequest request);

    /**
     * @param request the request parameters of ListMultimodalSearchTaskResult  ListMultimodalSearchTaskResultRequest
     * @return ListMultimodalSearchTaskResultResponse
     */
    CompletableFuture<ListMultimodalSearchTaskResultResponse> listMultimodalSearchTaskResult(ListMultimodalSearchTaskResultRequest request);

    /**
     * @param request the request parameters of UpdateMultimodalDataset  UpdateMultimodalDatasetRequest
     * @return UpdateMultimodalDatasetResponse
     */
    CompletableFuture<UpdateMultimodalDatasetResponse> updateMultimodalDataset(UpdateMultimodalDatasetRequest request);

    /**
     * @param request the request parameters of UpdateMultimodalFineTuneDataset  UpdateMultimodalFineTuneDatasetRequest
     * @return UpdateMultimodalFineTuneDatasetResponse
     */
    CompletableFuture<UpdateMultimodalFineTuneDatasetResponse> updateMultimodalFineTuneDataset(UpdateMultimodalFineTuneDatasetRequest request);

    /**
     * @param request the request parameters of UpdateMultimodalLabelStudioServiceWhiteList  UpdateMultimodalLabelStudioServiceWhiteListRequest
     * @return UpdateMultimodalLabelStudioServiceWhiteListResponse
     */
    CompletableFuture<UpdateMultimodalLabelStudioServiceWhiteListResponse> updateMultimodalLabelStudioServiceWhiteList(UpdateMultimodalLabelStudioServiceWhiteListRequest request);

    /**
     * @param request the request parameters of UploadOSSMultimodalDataset  UploadOSSMultimodalDatasetRequest
     * @return UploadOSSMultimodalDatasetResponse
     */
    CompletableFuture<UploadOSSMultimodalDatasetResponse> uploadOSSMultimodalDataset(UploadOSSMultimodalDatasetRequest request);

    /**
     * @param request the request parameters of ValidateDatabaseUserToken  ValidateDatabaseUserTokenRequest
     * @return ValidateDatabaseUserTokenResponse
     */
    CompletableFuture<ValidateDatabaseUserTokenResponse> validateDatabaseUserToken(ValidateDatabaseUserTokenRequest request);

    /**
     * @param request the request parameters of ValidateUserToken  ValidateUserTokenRequest
     * @return ValidateUserTokenResponse
     */
    CompletableFuture<ValidateUserTokenResponse> validateUserToken(ValidateUserTokenRequest request);

}
