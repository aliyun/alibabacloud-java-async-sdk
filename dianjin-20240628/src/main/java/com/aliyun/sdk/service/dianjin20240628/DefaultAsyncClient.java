// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.dianjin20240628.models.*;
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
        this.product = "DianJin";
        this.version = "2024-06-28";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of CreateAnnualDocSummaryTask  CreateAnnualDocSummaryTaskRequest
     * @return CreateAnnualDocSummaryTaskResponse
     */
    @Override
    public CompletableFuture<CreateAnnualDocSummaryTaskResponse> createAnnualDocSummaryTask(CreateAnnualDocSummaryTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateAnnualDocSummaryTask").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/api/task/summary/doc/annual").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAnnualDocSummaryTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAnnualDocSummaryTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDialog  CreateDialogRequest
     * @return CreateDialogResponse
     */
    @Override
    public CompletableFuture<CreateDialogResponse> createDialog(CreateDialogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateDialog").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/api/virtualHuman/dialog/create").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDialogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDialogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDialogAnalysisTask  CreateDialogAnalysisTaskRequest
     * @return CreateDialogAnalysisTaskResponse
     */
    @Override
    public CompletableFuture<CreateDialogAnalysisTaskResponse> createDialogAnalysisTask(CreateDialogAnalysisTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateDialogAnalysisTask").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/api/virtualHuman/dialog/analysis/submit").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDialogAnalysisTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDialogAnalysisTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDocsSummaryTask  CreateDocsSummaryTaskRequest
     * @return CreateDocsSummaryTaskResponse
     */
    @Override
    public CompletableFuture<CreateDocsSummaryTaskResponse> createDocsSummaryTask(CreateDocsSummaryTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateDocsSummaryTask").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/api/task/summary/docs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDocsSummaryTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDocsSummaryTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateFinReportSummaryTask  CreateFinReportSummaryTaskRequest
     * @return CreateFinReportSummaryTaskResponse
     */
    @Override
    public CompletableFuture<CreateFinReportSummaryTaskResponse> createFinReportSummaryTask(CreateFinReportSummaryTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateFinReportSummaryTask").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/api/task/summary").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateFinReportSummaryTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateFinReportSummaryTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateLibrary  CreateLibraryRequest
     * @return CreateLibraryResponse
     */
    @Override
    public CompletableFuture<CreateLibraryResponse> createLibrary(CreateLibraryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateLibrary").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/api/library/create").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLibraryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLibraryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreatePdfTranslateTask  CreatePdfTranslateTaskRequest
     * @return CreatePdfTranslateTaskResponse
     */
    @Override
    public CompletableFuture<CreatePdfTranslateTaskResponse> createPdfTranslateTask(CreatePdfTranslateTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreatePdfTranslateTask").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/api/task/pdfTranslate").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePdfTranslateTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePdfTranslateTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreatePredefinedDocument  CreatePredefinedDocumentRequest
     * @return CreatePredefinedDocumentResponse
     */
    @Override
    public CompletableFuture<CreatePredefinedDocumentResponse> createPredefinedDocument(CreatePredefinedDocumentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreatePredefinedDocument").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/api/library/document/createPredefinedDocument").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePredefinedDocumentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePredefinedDocumentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateQualityCheckTask  CreateQualityCheckTaskRequest
     * @return CreateQualityCheckTaskResponse
     */
    @Override
    public CompletableFuture<CreateQualityCheckTaskResponse> createQualityCheckTask(CreateQualityCheckTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateQualityCheckTask").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/api/qualitycheck/task/submit").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateQualityCheckTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateQualityCheckTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDocument  DeleteDocumentRequest
     * @return DeleteDocumentResponse
     */
    @Override
    public CompletableFuture<DeleteDocumentResponse> deleteDocument(DeleteDocumentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteDocument").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/api/library/document/delete").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDocumentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDocumentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteLibrary  DeleteLibraryRequest
     * @return DeleteLibraryResponse
     */
    @Override
    public CompletableFuture<DeleteLibraryResponse> deleteLibrary(DeleteLibraryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteLibrary").setMethod(HttpMethod.DELETE).setPathRegex("/{workspaceId}/api/library/delete").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLibraryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLibraryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EvictTask  EvictTaskRequest
     * @return EvictTaskResponse
     */
    @Override
    public CompletableFuture<EvictTaskResponse> evictTask(EvictTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("EvictTask").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/api/task/evict").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EvictTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EvictTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GenDocQaResult  GenDocQaResultRequest
     * @return GenDocQaResultResponse
     */
    @Override
    public CompletableFuture<GenDocQaResultResponse> genDocQaResult(GenDocQaResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GenDocQaResult").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/api/virtualHuman/qa/parse").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenDocQaResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenDocQaResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAppConfig  GetAppConfigRequest
     * @return GetAppConfigResponse
     */
    @Override
    public CompletableFuture<GetAppConfigResponse> getAppConfig(GetAppConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAppConfig").setMethod(HttpMethod.GET).setPathRegex("/{workspaceId}/api/app/config").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAppConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAppConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetChatQuestionResp  GetChatQuestionRespRequest
     * @return GetChatQuestionRespResponse
     */
    @Override
    public CompletableFuture<GetChatQuestionRespResponse> getChatQuestionResp(GetChatQuestionRespRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetChatQuestionResp").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/api/virtualHuman/chat/query").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetChatQuestionRespResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetChatQuestionRespResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDialogAnalysisResult  GetDialogAnalysisResultRequest
     * @return GetDialogAnalysisResultResponse
     */
    @Override
    public CompletableFuture<GetDialogAnalysisResultResponse> getDialogAnalysisResult(GetDialogAnalysisResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDialogAnalysisResult").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/api/virtualHuman/dialog/analysis").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDialogAnalysisResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDialogAnalysisResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDialogDetail  GetDialogDetailRequest
     * @return GetDialogDetailResponse
     */
    @Override
    public CompletableFuture<GetDialogDetailResponse> getDialogDetail(GetDialogDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDialogDetail").setMethod(HttpMethod.GET).setPathRegex("/{workspaceId}/api/virtualHuman/dialog/detail").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDialogDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDialogDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDocumentChunkList  GetDocumentChunkListRequest
     * @return GetDocumentChunkListResponse
     */
    @Override
    public CompletableFuture<GetDocumentChunkListResponse> getDocumentChunkList(GetDocumentChunkListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDocumentChunkList").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/api/library/getDocumentChunk").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDocumentChunkListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDocumentChunkListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDocumentList  GetDocumentListRequest
     * @return GetDocumentListResponse
     */
    @Override
    public CompletableFuture<GetDocumentListResponse> getDocumentList(GetDocumentListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDocumentList").setMethod(HttpMethod.GET).setPathRegex("/{workspaceId}/api/library/listDocument").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDocumentListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDocumentListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDocumentUrl  GetDocumentUrlRequest
     * @return GetDocumentUrlResponse
     */
    @Override
    public CompletableFuture<GetDocumentUrlResponse> getDocumentUrl(GetDocumentUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDocumentUrl").setMethod(HttpMethod.GET).setPathRegex("/{workspaceId}/api/library/document/url").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDocumentUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDocumentUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetFilterDocumentList  GetFilterDocumentListRequest
     * @return GetFilterDocumentListResponse
     */
    @Override
    public CompletableFuture<GetFilterDocumentListResponse> getFilterDocumentList(GetFilterDocumentListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetFilterDocumentList").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/api/library/filterDocument").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFilterDocumentListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFilterDocumentListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHistoryListByBizType  GetHistoryListByBizTypeRequest
     * @return GetHistoryListByBizTypeResponse
     */
    @Override
    public CompletableFuture<GetHistoryListByBizTypeResponse> getHistoryListByBizType(GetHistoryListByBizTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetHistoryListByBizType").setMethod(HttpMethod.GET).setPathRegex("/{workspaceId}/api/history/list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHistoryListByBizTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHistoryListByBizTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLibrary  GetLibraryRequest
     * @return GetLibraryResponse
     */
    @Override
    public CompletableFuture<GetLibraryResponse> getLibrary(GetLibraryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetLibrary").setMethod(HttpMethod.GET).setPathRegex("/{workspaceId}/api/library/get").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLibraryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLibraryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLibraryList  GetLibraryListRequest
     * @return GetLibraryListResponse
     */
    @Override
    public CompletableFuture<GetLibraryListResponse> getLibraryList(GetLibraryListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetLibraryList").setMethod(HttpMethod.GET).setPathRegex("/{workspaceId}/api/library/list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLibraryListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLibraryListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetParseResult  GetParseResultRequest
     * @return GetParseResultResponse
     */
    @Override
    public CompletableFuture<GetParseResultResponse> getParseResult(GetParseResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetParseResult").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/api/library/document/getParseResult").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetParseResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetParseResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetQualityCheckTaskResult  GetQualityCheckTaskResultRequest
     * @return GetQualityCheckTaskResultResponse
     */
    @Override
    public CompletableFuture<GetQualityCheckTaskResultResponse> getQualityCheckTaskResult(GetQualityCheckTaskResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetQualityCheckTaskResult").setMethod(HttpMethod.GET).setPathRegex("/{workspaceId}/api/qualitycheck/task/query").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetQualityCheckTaskResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetQualityCheckTaskResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSummaryTaskResult  GetSummaryTaskResultRequest
     * @return GetSummaryTaskResultResponse
     */
    @Override
    public CompletableFuture<GetSummaryTaskResultResponse> getSummaryTaskResult(GetSummaryTaskResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetSummaryTaskResult").setMethod(HttpMethod.GET).setPathRegex("/{workspaceId}/api/task/summary/result").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSummaryTaskResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSummaryTaskResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTaskResult  GetTaskResultRequest
     * @return GetTaskResultResponse
     */
    @Override
    public CompletableFuture<GetTaskResultResponse> getTaskResult(GetTaskResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTaskResult").setMethod(HttpMethod.GET).setPathRegex("/{workspaceId}/api/task/result").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTaskResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTaskResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTaskStatus  GetTaskStatusRequest
     * @return GetTaskStatusResponse
     */
    @Override
    public CompletableFuture<GetTaskStatusResponse> getTaskStatus(GetTaskStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTaskStatus").setMethod(HttpMethod.GET).setPathRegex("/{workspaceId}/api/task/status").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTaskStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTaskStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InvokePlugin  InvokePluginRequest
     * @return InvokePluginResponse
     */
    @Override
    public CompletableFuture<InvokePluginResponse> invokePlugin(InvokePluginRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InvokePlugin").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/api/plugin/invoke").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InvokePluginResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InvokePluginResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PreviewDocument  PreviewDocumentRequest
     * @return PreviewDocumentResponse
     */
    @Override
    public CompletableFuture<PreviewDocumentResponse> previewDocument(PreviewDocumentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PreviewDocument").setMethod(HttpMethod.GET).setPathRegex("/{workspaceId}/api/library/document/preview").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PreviewDocumentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PreviewDocumentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ReIndex  ReIndexRequest
     * @return ReIndexResponse
     */
    @Override
    public CompletableFuture<ReIndexResponse> reIndex(ReIndexRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ReIndex").setMethod(HttpMethod.PUT).setPathRegex("/{workspaceId}/api/library/document/reIndex").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReIndexResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReIndexResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RealTimeDialog  RealTimeDialogRequest
     * @return RealTimeDialogResponse
     */
    @Override
    public CompletableFuture<RealTimeDialogResponse> realTimeDialog(RealTimeDialogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RealTimeDialog").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/api/realtime/dialog/chat").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RealTimeDialogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RealTimeDialogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<RealTimeDialogResponseBody> realTimeDialogWithResponseIterable(RealTimeDialogRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("RealTimeDialog").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/api/realtime/dialog/chat").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
        RealTimeDialogResponseBodyIterator iterator = RealTimeDialogResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * @param request the request parameters of RealtimeDialogAssist  RealtimeDialogAssistRequest
     * @return RealtimeDialogAssistResponse
     */
    @Override
    public CompletableFuture<RealtimeDialogAssistResponse> realtimeDialogAssist(RealtimeDialogAssistRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RealtimeDialogAssist").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/api/realtime/dialog/assist").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RealtimeDialogAssistResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RealtimeDialogAssistResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RebuildTask  RebuildTaskRequest
     * @return RebuildTaskResponse
     */
    @Override
    public CompletableFuture<RebuildTaskResponse> rebuildTask(RebuildTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RebuildTask").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/api/task/rebuild").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RebuildTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RebuildTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecallDocument  RecallDocumentRequest
     * @return RecallDocumentResponse
     */
    @Override
    public CompletableFuture<RecallDocumentResponse> recallDocument(RecallDocumentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RecallDocument").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/api/library/recallDocument").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecallDocumentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecallDocumentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeIntention  RecognizeIntentionRequest
     * @return RecognizeIntentionResponse
     */
    @Override
    public CompletableFuture<RecognizeIntentionResponse> recognizeIntention(RecognizeIntentionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RecognizeIntention").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/api/recog/intent").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeIntentionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeIntentionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RunAgent  RunAgentRequest
     * @return RunAgentResponse
     */
    @Override
    public CompletableFuture<RunAgentResponse> runAgent(RunAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RunAgent").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/api/bot/thread/run").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RunAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RunAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public <ReturnT> CompletableFuture<ReturnT> runAgentWithAsyncResponseHandler(RunAgentRequest request, AsyncResponseHandler<RunAgentResponse, ReturnT> responseHandler) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RunAgent").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/api/bot/thread/run").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withResponseHandler(responseHandler).withOutput(RunAgentResponse.create());
            return this.handler.execute(params)
                    .thenCompose((output) -> CompletableFuture.completedFuture(responseHandler.transform((RunAgentResponse)output)));
        } catch (Exception e) {
            CompletableFuture<ReturnT> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<RunAgentResponseBody> runAgentWithResponseIterable(RunAgentRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("RunAgent").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/api/bot/thread/run").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
        RunAgentResponseBodyIterator iterator = RunAgentResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * @param request the request parameters of RunChatResultGeneration  RunChatResultGenerationRequest
     * @return RunChatResultGenerationResponse
     */
    @Override
    public CompletableFuture<RunChatResultGenerationResponse> runChatResultGeneration(RunChatResultGenerationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RunChatResultGeneration").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/api/run/chat/generation").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RunChatResultGenerationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RunChatResultGenerationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<RunChatResultGenerationResponseBody> runChatResultGenerationWithResponseIterable(RunChatResultGenerationRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("RunChatResultGeneration").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/api/run/chat/generation").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
        RunChatResultGenerationResponseBodyIterator iterator = RunChatResultGenerationResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * @param request the request parameters of RunLibraryChatGeneration  RunLibraryChatGenerationRequest
     * @return RunLibraryChatGenerationResponse
     */
    @Override
    public CompletableFuture<RunLibraryChatGenerationResponse> runLibraryChatGeneration(RunLibraryChatGenerationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RunLibraryChatGeneration").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/api/run/library/chat/generation").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RunLibraryChatGenerationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RunLibraryChatGenerationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<RunLibraryChatGenerationResponseBody> runLibraryChatGenerationWithResponseIterable(RunLibraryChatGenerationRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("RunLibraryChatGeneration").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/api/run/library/chat/generation").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
        RunLibraryChatGenerationResponseBodyIterator iterator = RunLibraryChatGenerationResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * @param request the request parameters of SubmitChatQuestion  SubmitChatQuestionRequest
     * @return SubmitChatQuestionResponse
     */
    @Override
    public CompletableFuture<SubmitChatQuestionResponse> submitChatQuestion(SubmitChatQuestionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SubmitChatQuestion").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/api/virtualHuman/chat/submit").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitChatQuestionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitChatQuestionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateDocument  UpdateDocumentRequest
     * @return UpdateDocumentResponse
     */
    @Override
    public CompletableFuture<UpdateDocumentResponse> updateDocument(UpdateDocumentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateDocument").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/api/library/document/updateDocument").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDocumentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDocumentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateDocumentChunk  UpdateDocumentChunkRequest
     * @return UpdateDocumentChunkResponse
     */
    @Override
    public CompletableFuture<UpdateDocumentChunkResponse> updateDocumentChunk(UpdateDocumentChunkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateDocumentChunk").setMethod(HttpMethod.PUT).setPathRegex("/{workspaceId}/api/library/updateDocumentChunk").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDocumentChunkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDocumentChunkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateLibrary  UpdateLibraryRequest
     * @return UpdateLibraryResponse
     */
    @Override
    public CompletableFuture<UpdateLibraryResponse> updateLibrary(UpdateLibraryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateLibrary").setMethod(HttpMethod.PUT).setPathRegex("/{workspaceId}/api/library/update").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLibraryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLibraryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateQaLibrary  UpdateQaLibraryRequest
     * @return UpdateQaLibraryResponse
     */
    @Override
    public CompletableFuture<UpdateQaLibraryResponse> updateQaLibrary(UpdateQaLibraryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateQaLibrary").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/api/virtualHuman/qa/upload").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateQaLibraryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateQaLibraryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
