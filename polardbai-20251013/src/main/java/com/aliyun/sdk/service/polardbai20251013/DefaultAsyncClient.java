// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbai20251013;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.polardbai20251013.models.*;
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
        this.product = "PolardbAI";
        this.version = "2025-10-13";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of ChatBIConfigCreate  ChatBIConfigCreateRequest
     * @return ChatBIConfigCreateResponse
     */
    @Override
    public CompletableFuture<ChatBIConfigCreateResponse> chatBIConfigCreate(ChatBIConfigCreateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChatBIConfigCreate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChatBIConfigCreateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChatBIConfigCreateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChatBIConfigDelete  ChatBIConfigDeleteRequest
     * @return ChatBIConfigDeleteResponse
     */
    @Override
    public CompletableFuture<ChatBIConfigDeleteResponse> chatBIConfigDelete(ChatBIConfigDeleteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChatBIConfigDelete").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChatBIConfigDeleteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChatBIConfigDeleteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChatBIConfigDeleteEntry  ChatBIConfigDeleteEntryRequest
     * @return ChatBIConfigDeleteEntryResponse
     */
    @Override
    public CompletableFuture<ChatBIConfigDeleteEntryResponse> chatBIConfigDeleteEntry(ChatBIConfigDeleteEntryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChatBIConfigDeleteEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChatBIConfigDeleteEntryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChatBIConfigDeleteEntryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChatBIConfigQueryEntries  ChatBIConfigQueryEntriesRequest
     * @return ChatBIConfigQueryEntriesResponse
     */
    @Override
    public CompletableFuture<ChatBIConfigQueryEntriesResponse> chatBIConfigQueryEntries(ChatBIConfigQueryEntriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChatBIConfigQueryEntries").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChatBIConfigQueryEntriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChatBIConfigQueryEntriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChatBIConfigQueryTables  ChatBIConfigQueryTablesRequest
     * @return ChatBIConfigQueryTablesResponse
     */
    @Override
    public CompletableFuture<ChatBIConfigQueryTablesResponse> chatBIConfigQueryTables(ChatBIConfigQueryTablesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChatBIConfigQueryTables").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChatBIConfigQueryTablesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChatBIConfigQueryTablesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChatBIConfigUpdateEntry  ChatBIConfigUpdateEntryRequest
     * @return ChatBIConfigUpdateEntryResponse
     */
    @Override
    public CompletableFuture<ChatBIConfigUpdateEntryResponse> chatBIConfigUpdateEntry(ChatBIConfigUpdateEntryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChatBIConfigUpdateEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChatBIConfigUpdateEntryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChatBIConfigUpdateEntryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChatBIFileTemplateDownload  ChatBIFileTemplateDownloadRequest
     * @return ChatBIFileTemplateDownloadResponse
     */
    @Override
    public CompletableFuture<ChatBIFileTemplateDownloadResponse> chatBIFileTemplateDownload(ChatBIFileTemplateDownloadRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChatBIFileTemplateDownload").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChatBIFileTemplateDownloadResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChatBIFileTemplateDownloadResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChatBIFileUpload  ChatBIFileUploadRequest
     * @return ChatBIFileUploadResponse
     */
    @Override
    public CompletableFuture<ChatBIFileUploadResponse> chatBIFileUpload(ChatBIFileUploadRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChatBIFileUpload").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChatBIFileUploadResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChatBIFileUploadResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChatBIFileUploadCallback  ChatBIFileUploadCallbackRequest
     * @return ChatBIFileUploadCallbackResponse
     */
    @Override
    public CompletableFuture<ChatBIFileUploadCallbackResponse> chatBIFileUploadCallback(ChatBIFileUploadCallbackRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChatBIFileUploadCallback").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChatBIFileUploadCallbackResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChatBIFileUploadCallbackResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChatBIPatternCreate  ChatBIPatternCreateRequest
     * @return ChatBIPatternCreateResponse
     */
    @Override
    public CompletableFuture<ChatBIPatternCreateResponse> chatBIPatternCreate(ChatBIPatternCreateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChatBIPatternCreate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChatBIPatternCreateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChatBIPatternCreateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChatBIPatternDelete  ChatBIPatternDeleteRequest
     * @return ChatBIPatternDeleteResponse
     */
    @Override
    public CompletableFuture<ChatBIPatternDeleteResponse> chatBIPatternDelete(ChatBIPatternDeleteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChatBIPatternDelete").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChatBIPatternDeleteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChatBIPatternDeleteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChatBIPatternDeleteEntry  ChatBIPatternDeleteEntryRequest
     * @return ChatBIPatternDeleteEntryResponse
     */
    @Override
    public CompletableFuture<ChatBIPatternDeleteEntryResponse> chatBIPatternDeleteEntry(ChatBIPatternDeleteEntryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChatBIPatternDeleteEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChatBIPatternDeleteEntryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChatBIPatternDeleteEntryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChatBIPatternIndexCreate  ChatBIPatternIndexCreateRequest
     * @return ChatBIPatternIndexCreateResponse
     */
    @Override
    public CompletableFuture<ChatBIPatternIndexCreateResponse> chatBIPatternIndexCreate(ChatBIPatternIndexCreateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChatBIPatternIndexCreate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChatBIPatternIndexCreateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChatBIPatternIndexCreateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChatBIPatternIndexDelete  ChatBIPatternIndexDeleteRequest
     * @return ChatBIPatternIndexDeleteResponse
     */
    @Override
    public CompletableFuture<ChatBIPatternIndexDeleteResponse> chatBIPatternIndexDelete(ChatBIPatternIndexDeleteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChatBIPatternIndexDelete").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChatBIPatternIndexDeleteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChatBIPatternIndexDeleteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChatBIPatternIndexQueryTables  ChatBIPatternIndexQueryTablesRequest
     * @return ChatBIPatternIndexQueryTablesResponse
     */
    @Override
    public CompletableFuture<ChatBIPatternIndexQueryTablesResponse> chatBIPatternIndexQueryTables(ChatBIPatternIndexQueryTablesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChatBIPatternIndexQueryTables").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChatBIPatternIndexQueryTablesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChatBIPatternIndexQueryTablesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChatBIPatternQueryEntries  ChatBIPatternQueryEntriesRequest
     * @return ChatBIPatternQueryEntriesResponse
     */
    @Override
    public CompletableFuture<ChatBIPatternQueryEntriesResponse> chatBIPatternQueryEntries(ChatBIPatternQueryEntriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChatBIPatternQueryEntries").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChatBIPatternQueryEntriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChatBIPatternQueryEntriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChatBIPatternQueryTables  ChatBIPatternQueryTablesRequest
     * @return ChatBIPatternQueryTablesResponse
     */
    @Override
    public CompletableFuture<ChatBIPatternQueryTablesResponse> chatBIPatternQueryTables(ChatBIPatternQueryTablesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChatBIPatternQueryTables").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChatBIPatternQueryTablesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChatBIPatternQueryTablesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChatBIPatternUpdateEntry  ChatBIPatternUpdateEntryRequest
     * @return ChatBIPatternUpdateEntryResponse
     */
    @Override
    public CompletableFuture<ChatBIPatternUpdateEntryResponse> chatBIPatternUpdateEntry(ChatBIPatternUpdateEntryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChatBIPatternUpdateEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChatBIPatternUpdateEntryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChatBIPatternUpdateEntryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChatBIPredictSse  ChatBIPredictSseRequest
     * @return ChatBIPredictSseResponse
     */
    @Override
    public CompletableFuture<ChatBIPredictSseResponse> chatBIPredictSse(ChatBIPredictSseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChatBIPredictSse").setMethod(HttpMethod.POST).setPathRegex("/v2/openapi/chatbi/predictSse").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChatBIPredictSseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChatBIPredictSseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<ChatBIPredictSseResponseBody> chatBIPredictSseWithResponseIterable(ChatBIPredictSseRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("ChatBIPredictSse").setMethod(HttpMethod.POST).setPathRegex("/v2/openapi/chatbi/predictSse").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
        ChatBIPredictSseResponseBodyIterator iterator = ChatBIPredictSseResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * @param request the request parameters of ChatBISchemaIndexCreate  ChatBISchemaIndexCreateRequest
     * @return ChatBISchemaIndexCreateResponse
     */
    @Override
    public CompletableFuture<ChatBISchemaIndexCreateResponse> chatBISchemaIndexCreate(ChatBISchemaIndexCreateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChatBISchemaIndexCreate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChatBISchemaIndexCreateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChatBISchemaIndexCreateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChatBISchemaIndexDelete  ChatBISchemaIndexDeleteRequest
     * @return ChatBISchemaIndexDeleteResponse
     */
    @Override
    public CompletableFuture<ChatBISchemaIndexDeleteResponse> chatBISchemaIndexDelete(ChatBISchemaIndexDeleteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChatBISchemaIndexDelete").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChatBISchemaIndexDeleteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChatBISchemaIndexDeleteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChatBISchemaIndexQueryTables  ChatBISchemaIndexQueryTablesRequest
     * @return ChatBISchemaIndexQueryTablesResponse
     */
    @Override
    public CompletableFuture<ChatBISchemaIndexQueryTablesResponse> chatBISchemaIndexQueryTables(ChatBISchemaIndexQueryTablesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChatBISchemaIndexQueryTables").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChatBISchemaIndexQueryTablesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChatBISchemaIndexQueryTablesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChatBIUpdateTableValidationColumns  ChatBIUpdateTableValidationColumnsRequest
     * @return ChatBIUpdateTableValidationColumnsResponse
     */
    @Override
    public CompletableFuture<ChatBIUpdateTableValidationColumnsResponse> chatBIUpdateTableValidationColumns(ChatBIUpdateTableValidationColumnsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChatBIUpdateTableValidationColumns").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChatBIUpdateTableValidationColumnsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChatBIUpdateTableValidationColumnsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateMultimodalDataset  CreateMultimodalDatasetRequest
     * @return CreateMultimodalDatasetResponse
     */
    @Override
    public CompletableFuture<CreateMultimodalDatasetResponse> createMultimodalDataset(CreateMultimodalDatasetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateMultimodalDataset").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMultimodalDatasetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMultimodalDatasetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateMultimodalDatasetEmbedding  CreateMultimodalDatasetEmbeddingRequest
     * @return CreateMultimodalDatasetEmbeddingResponse
     */
    @Override
    public CompletableFuture<CreateMultimodalDatasetEmbeddingResponse> createMultimodalDatasetEmbedding(CreateMultimodalDatasetEmbeddingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateMultimodalDatasetEmbedding").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMultimodalDatasetEmbeddingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMultimodalDatasetEmbeddingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateMultimodalSearchTask  CreateMultimodalSearchTaskRequest
     * @return CreateMultimodalSearchTaskResponse
     */
    @Override
    public CompletableFuture<CreateMultimodalSearchTaskResponse> createMultimodalSearchTask(CreateMultimodalSearchTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateMultimodalSearchTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMultimodalSearchTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMultimodalSearchTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMultimodalDataset  DeleteMultimodalDatasetRequest
     * @return DeleteMultimodalDatasetResponse
     */
    @Override
    public CompletableFuture<DeleteMultimodalDatasetResponse> deleteMultimodalDataset(DeleteMultimodalDatasetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteMultimodalDataset").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMultimodalDatasetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMultimodalDatasetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMultimodalEmbedding  DeleteMultimodalEmbeddingRequest
     * @return DeleteMultimodalEmbeddingResponse
     */
    @Override
    public CompletableFuture<DeleteMultimodalEmbeddingResponse> deleteMultimodalEmbedding(DeleteMultimodalEmbeddingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteMultimodalEmbedding").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMultimodalEmbeddingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMultimodalEmbeddingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DownloadMultimodalSearchTaskResultMetadata  DownloadMultimodalSearchTaskResultMetadataRequest
     * @return DownloadMultimodalSearchTaskResultMetadataResponse
     */
    @Override
    public CompletableFuture<DownloadMultimodalSearchTaskResultMetadataResponse> downloadMultimodalSearchTaskResultMetadata(DownloadMultimodalSearchTaskResultMetadataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DownloadMultimodalSearchTaskResultMetadata").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DownloadMultimodalSearchTaskResultMetadataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DownloadMultimodalSearchTaskResultMetadataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMultimodalDataset  ListMultimodalDatasetRequest
     * @return ListMultimodalDatasetResponse
     */
    @Override
    public CompletableFuture<ListMultimodalDatasetResponse> listMultimodalDataset(ListMultimodalDatasetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListMultimodalDataset").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMultimodalDatasetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMultimodalDatasetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMultimodalEmbeddingModel  ListMultimodalEmbeddingModelRequest
     * @return ListMultimodalEmbeddingModelResponse
     */
    @Override
    public CompletableFuture<ListMultimodalEmbeddingModelResponse> listMultimodalEmbeddingModel(ListMultimodalEmbeddingModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListMultimodalEmbeddingModel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMultimodalEmbeddingModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMultimodalEmbeddingModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMultimodalSearchTask  ListMultimodalSearchTaskRequest
     * @return ListMultimodalSearchTaskResponse
     */
    @Override
    public CompletableFuture<ListMultimodalSearchTaskResponse> listMultimodalSearchTask(ListMultimodalSearchTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListMultimodalSearchTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMultimodalSearchTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMultimodalSearchTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateMultimodalDataset  UpdateMultimodalDatasetRequest
     * @return UpdateMultimodalDatasetResponse
     */
    @Override
    public CompletableFuture<UpdateMultimodalDatasetResponse> updateMultimodalDataset(UpdateMultimodalDatasetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateMultimodalDataset").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMultimodalDatasetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMultimodalDatasetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UploadOSSMultimodalDataset  UploadOSSMultimodalDatasetRequest
     * @return UploadOSSMultimodalDatasetResponse
     */
    @Override
    public CompletableFuture<UploadOSSMultimodalDatasetResponse> uploadOSSMultimodalDataset(UploadOSSMultimodalDatasetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UploadOSSMultimodalDataset").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UploadOSSMultimodalDatasetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UploadOSSMultimodalDatasetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
