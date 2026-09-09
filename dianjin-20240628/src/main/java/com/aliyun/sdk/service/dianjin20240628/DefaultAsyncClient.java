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
        this.endpointRule = "regional";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of CommercializeFetch  CommercializeFetchRequest
     * @return CommercializeFetchResponse
     */
    @Override
    public CompletableFuture<CommercializeFetchResponse> commercializeFetch(CommercializeFetchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CommercializeFetch").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/spi/path/{cjfCode}/api/support/{zjfCode}/firefly/commercializeFetch").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CommercializeFetchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CommercializeFetchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you use this operation, review the billing methods and pricing for Alibaba Cloud Tongyi Dianjin.
     * Prerequisites
     * You have activated Alibaba Cloud Model Studio and Tongyi Dianjin.
     * Obtain your <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace ID</a>.</p>
     * 
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
     * <b>description</b> :
     * <p>Before you use this API, review the billing methods and pricing for DianJin.
     * Prerequisites
     * You have activated Alibaba Cloud Model Studio and DianJin.
     * Obtain a workspace ID. For more information, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">Get a workspace ID</a>.</p>
     * 
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
     * <b>description</b> :
     * <p>Before you use this API, review the billing methods and pricing for Alibaba Cloud Tongyi Dianjin.
     * Prerequisites
     * You have activated Alibaba Cloud Model Studio and Tongyi Dianjin.
     * You have obtained a <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identifier</a>.</p>
     * 
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
     * <b>description</b> :
     * <p>Before using this API, review the pricing and billing methods for Alibaba Cloud Gold products.
     * <strong>Prerequisites</strong></p>
     * <ul>
     * <li>Enable Alibaba Cloud Model Studio and Alibaba Cloud Gold services.</li>
     * <li>Obtain the workspace ID. For more information, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identity</a>.</li>
     * </ul>
     * 
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
     * @param request the request parameters of CreateImageDetectionTask  CreateImageDetectionTaskRequest
     * @return CreateImageDetectionTaskResponse
     */
    @Override
    public CompletableFuture<CreateImageDetectionTaskResponse> createImageDetectionTask(CreateImageDetectionTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateImageDetectionTask").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/api/imageDetect/task/submit").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateImageDetectionTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateImageDetectionTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>Prerequisites</em>*</p>
     * <ul>
     * <li>You have activated Alibaba Cloud Model Studio and Tongyi Dianjin.</li>
     * <li>Obtain the workspace ID: Retrieve the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identifier</a>.</li>
     * </ul>
     * 
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
     * <b>description</b> :
     * <p>Before you use this operation, review the billing methods and pricing for Alibaba Cloud Tongyi Dianjin.
     * <strong>Prerequisites</strong></p>
     * <ul>
     * <li>You have activated Alibaba Cloud Model Studio and Tongyi Dianjin.</li>
     * <li>You have obtained a workspace ID. To obtain your <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace ID</a>.</li>
     * </ul>
     * 
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
     * <b>description</b> :
     * <p>Before using this API, review the billing methods and pricing for Tongyi Dianjin.
     * <strong>Prerequisites</strong></p>
     * <ul>
     * <li>Activate Alibaba Cloud Model Studio and Tongyi Dianjin.</li>
     * <li>Obtain a workspace ID. For more information, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">Get a workspace identity</a>.</li>
     * </ul>
     * 
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
     * <b>description</b> :
     * <p>Before using this API, review the pricing and billing methods for the Tongyi Dianjin product.
     * Prerequisites
     * Activate Alibaba Cloud Model Studio and Tongyi Dianjin services.
     * Obtain the workspaceId: Retrieve the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identity</a>.</p>
     * 
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
     * @param request the request parameters of CreateVideoCreationTask  CreateVideoCreationTaskRequest
     * @return CreateVideoCreationTaskResponse
     */
    @Override
    public CompletableFuture<CreateVideoCreationTaskResponse> createVideoCreationTask(CreateVideoCreationTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateVideoCreationTask").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/api/videoCreation/task/create").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVideoCreationTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVideoCreationTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DashscopeAsyncTaskFinishEvent  DashscopeAsyncTaskFinishEventRequest
     * @return DashscopeAsyncTaskFinishEventResponse
     */
    @Override
    public CompletableFuture<DashscopeAsyncTaskFinishEventResponse> dashscopeAsyncTaskFinishEvent(DashscopeAsyncTaskFinishEventRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DashscopeAsyncTaskFinishEvent").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/event/dashscopeAsyncTaskFinish").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DashscopeAsyncTaskFinishEventResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DashscopeAsyncTaskFinishEventResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>Prerequisites</em>*</p>
     * <ul>
     * <li>You have activated Alibaba Cloud Model Studio and Tongyi Dianjin services.</li>
     * <li>Obtain your workspace ID: retrieve your <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identifier</a>.</li>
     * </ul>
     * 
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
     * <b>description</b> :
     * <p><em>Prerequisites</em>*</p>
     * <ul>
     * <li>Activate Alibaba Cloud Model Studio and Tongyi Dianjin services.</li>
     * <li>Obtain your workspaceId. For more information, refer to the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identifier</a>.</li>
     * </ul>
     * 
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
     * @param request the request parameters of EndToEndRealTimeDialog  EndToEndRealTimeDialogRequest
     * @return EndToEndRealTimeDialogResponse
     */
    @Override
    public CompletableFuture<EndToEndRealTimeDialogResponse> endToEndRealTimeDialog(EndToEndRealTimeDialogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("EndToEndRealTimeDialog").setMethod(HttpMethod.GET).setPathRegex("/{workspaceId}/ws/realtime/dialog").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EndToEndRealTimeDialogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EndToEndRealTimeDialogResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of ExchangeEntitlement  ExchangeEntitlementRequest
     * @return ExchangeEntitlementResponse
     */
    @Override
    public CompletableFuture<ExchangeEntitlementResponse> exchangeEntitlement(ExchangeEntitlementRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExchangeEntitlement").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/api/v1/tenants/{tenantId}/redeem").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExchangeEntitlementResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExchangeEntitlementResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you use this API, make sure you understand the billing methods and pricing of the Tongyi Dianjin product.
     * Prerequisites
     * Activate Alibaba Cloud Model Studio and the Tongyi Dianjin service.
     * Obtain a workspace ID. For more information, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">Get a workspace ID</a>.</p>
     * 
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
     * <b>description</b> :
     * <p><em>Prerequisites</em>*</p>
     * <ul>
     * <li>You have activated Alibaba Cloud Model Studio and Tongyi Gold services.</li>
     * <li>You can obtain the workspace ID. For details, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%E3%80%9DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identity</a>.</li>
     * </ul>
     * 
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
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API retrieves conversation records between customers and service agents, along with intent analysis results generated by the model.</p>
     * 
     * @param request the request parameters of GetDialogLog  GetDialogLogRequest
     * @return GetDialogLogResponse
     */
    @Override
    public CompletableFuture<GetDialogLogResponse> getDialogLog(GetDialogLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDialogLog").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/api/dialog/log").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDialogLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDialogLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>Prerequisites</em>*</p>
     * <ul>
     * <li>Activate Alibaba Cloud Model Studio and Tongyi Gold Service.</li>
     * <li>Obtain the workspaceId and the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%B3">workspace identity</a>.</li>
     * </ul>
     * 
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
     * <b>description</b> :
     * <p><em>Prerequisites</em>*</p>
     * <ul>
     * <li>You have activated Alibaba Cloud Model Studio and the Tongyi Gold Point service.</li>
     * <li>You have obtained a workspace ID. For more information, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">Get a workspace ID</a>.</li>
     * </ul>
     * 
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
     * <b>description</b> :
     * <p><em>Prerequisites</em>*</p>
     * <ul>
     * <li>You have activated Alibaba Cloud Model Studio and Tongyi Dianjin.</li>
     * <li>Obtain the workspace ID. For more information, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">Get the workspace ID</a>.</li>
     * </ul>
     * 
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
     * <b>description</b> :
     * <p>Prerequisites
     * You have activated Alibaba Cloud Model Studio and Tongyi Dianjin.
     * To obtain the workspace ID, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">the document about obtaining the workspace ID</a>.</p>
     * 
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
     * @param request the request parameters of GetImageDetectionTaskResult  GetImageDetectionTaskResultRequest
     * @return GetImageDetectionTaskResultResponse
     */
    @Override
    public CompletableFuture<GetImageDetectionTaskResultResponse> getImageDetectionTaskResult(GetImageDetectionTaskResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetImageDetectionTaskResult").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/api/imageDetect/task/query").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetImageDetectionTaskResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetImageDetectionTaskResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>Prerequisites</em>*</p>
     * <ul>
     * <li>Activate the Alibaba Cloud Model Studio and Tongyi Dianjin services.</li>
     * <li>Obtain a <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identifier</a>.</li>
     * </ul>
     * 
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
     * <b>description</b> :
     * <p>Prerequisites</p>
     * <ul>
     * <li>You must activate Alibaba Cloud Model Studio and Tongyi Dianjin services.</li>
     * <li>Obtain the workspaceId. For more information, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identity</a>.</li>
     * </ul>
     * 
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
     * <b>description</b> :
     * <p><em>Prerequisites</em>*</p>
     * <ul>
     * <li>You have activated Alibaba Cloud Model Studio and Tongyi Gold services.</li>
     * <li>Obtain the workspace ID. For more information, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">the workspace identity document</a>.</li>
     * </ul>
     * 
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
     * @param request the request parameters of GetReportResponse  GetReportResponseRequest
     * @return GetReportResponseResponse
     */
    @Override
    public CompletableFuture<GetReportResponseResponse> getReportResponse(GetReportResponseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetReportResponse").setMethod(HttpMethod.GET).setPathRegex("/{workspaceId}/api/firefly/v1/{sceneCode}/{fundProduct}/tasks/{outRequestNo}/report").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetReportResponseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetReportResponseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetReportTaskStatus  GetReportTaskStatusRequest
     * @return GetReportTaskStatusResponse
     */
    @Override
    public CompletableFuture<GetReportTaskStatusResponse> getReportTaskStatus(GetReportTaskStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetReportTaskStatus").setMethod(HttpMethod.GET).setPathRegex("/{workspaceId}/api/firefly/v1/{sceneCode}/{fundProduct}/tasks/{outRequestNo}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetReportTaskStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetReportTaskStatusResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of GetUsage  GetUsageRequest
     * @return GetUsageResponse
     */
    @Override
    public CompletableFuture<GetUsageResponse> getUsage(GetUsageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetUsage").setMethod(HttpMethod.GET).setPathRegex("/{workspaceId}/api/v1/tenants/{tenantId}/usage").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUsageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUsageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetVideoCreationTaskResult  GetVideoCreationTaskResultRequest
     * @return GetVideoCreationTaskResultResponse
     */
    @Override
    public CompletableFuture<GetVideoCreationTaskResultResponse> getVideoCreationTaskResult(GetVideoCreationTaskResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetVideoCreationTaskResult").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/api/videoCreation/task/query").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetVideoCreationTaskResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetVideoCreationTaskResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>Prerequisites</em>*</p>
     * <ul>
     * <li>You have activated Alibaba Cloud Model Studio and Tongyi Dianjin services.</li>
     * <li>Obtain the workspace ID. For more information, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">Get the workspace ID</a>.</li>
     * </ul>
     * 
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
     * <b>description</b> :
     * <p><em>Prerequisites</em>*</p>
     * <ul>
     * <li>You must activate Alibaba Cloud Model Studio and Tongyi Gold services.</li>
     * <li>Obtain the workspace ID. For more information, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identity</a>.</li>
     * </ul>
     * 
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
     * @param request the request parameters of QueryAmount  QueryAmountRequest
     * @return QueryAmountResponse
     */
    @Override
    public CompletableFuture<QueryAmountResponse> queryAmount(QueryAmountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryAmount").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/api/v1/aigcRevenue/query").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryAmountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryAmountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryApiKeys  QueryApiKeysRequest
     * @return QueryApiKeysResponse
     */
    @Override
    public CompletableFuture<QueryApiKeysResponse> queryApiKeys(QueryApiKeysRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryApiKeys").setMethod(HttpMethod.GET).setPathRegex("/{workspaceId}/api/v1/tenants/{tenantId}/apikeys").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryApiKeysResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryApiKeysResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryRedemptionRecords  QueryRedemptionRecordsRequest
     * @return QueryRedemptionRecordsResponse
     */
    @Override
    public CompletableFuture<QueryRedemptionRecordsResponse> queryRedemptionRecords(QueryRedemptionRecordsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryRedemptionRecords").setMethod(HttpMethod.GET).setPathRegex("/{workspaceId}/api/v1/tenants/{tenantId}/redemption-records").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryRedemptionRecordsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryRedemptionRecordsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you use this operation, review the billing method and pricing for Tongyi Dianjin.
     * <strong>Prerequisites</strong></p>
     * <ul>
     * <li>You have activated Alibaba Cloud Model Studio and Tongyi Dianjin.</li>
     * <li>You have obtained a workspace ID: Retrieve the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identifier</a>.</li>
     * </ul>
     * 
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
     * <b>description</b> :
     * <p>Before using this API, make sure you understand the billing methods and pricing of the Tongyi Gold service.
     * Prerequisites
     * Alibaba Cloud Model Studio and the Tongyi Gold service are activated.
     * Obtain a workspaceId. For more information, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">Get an app ID and workspace</a>.</p>
     * 
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
     * <b>description</b> :
     * <p>Before you use this API, make sure that you understand the billing methods and <a href="https://help.aliyun.com/zh/model-studio/tongyi-dianjin-overview?spm=a2c4g.11186623.help-menu-2400256.d_1_6_6_0.15e77499sSMTGb">pricing</a> of Alibaba Cloud Model Studio DianJin.
     * Prerequisites
     * Activate the Alibaba Cloud Model Studio and Model Studio DianJin services.
     * Obtain the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identity</a> to use as your workspaceId.</p>
     * 
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
     * <b>description</b> :
     * <p>Before you use this API, review the billing methods and pricing for the Dianjin service.
     * Prerequisites
     * You have activated Alibaba Cloud Model Studio and the Dianjin service.
     * You have obtained a workspace ID. For more information, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">Get an app ID and workspace</a>.</p>
     * 
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
     * <b>description</b> :
     * <p><em>Prerequisites</em>*</p>
     * <ul>
     * <li>Activate the Alibaba Cloud Model Studio service and the Tongyi Dianjin service.</li>
     * <li>Obtain the workspace ID. Obtain the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%93%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identity</a>.</li>
     * </ul>
     * 
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
     * <b>description</b> :
     * <p>Before you use this operation, review the billing methods and pricing of Alibaba Cloud Tongyi Dianjin.
     * <strong>Prerequisites</strong></p>
     * <ul>
     * <li>You have activated Alibaba Cloud Model Studio and Tongyi Dianjin.</li>
     * <li>You have obtained a <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace ID</a>.</li>
     * </ul>
     * 
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
     * @param request the request parameters of RetryReportTask  RetryReportTaskRequest
     * @return RetryReportTaskResponse
     */
    @Override
    public CompletableFuture<RetryReportTaskResponse> retryReportTask(RetryReportTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RetryReportTask").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/api/firefly/v1/{sceneCode}/{fundProduct}/tasks/{outRequestNo}/retry").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RetryReportTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RetryReportTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you use this API, review the billing model and pricing for Tongyi Dianjin.
     * Prerequisites
     * You have activated Alibaba Cloud Model Studio and Tongyi Dianjin.
     * Obtain a workspace ID: <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">Obtain your workspace ID</a>.</p>
     * 
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
     * <b>description</b> :
     * <p>Before you use this API, review the billing method and pricing for Alibaba Cloud Tongyi Dianjin.
     * <strong>Prerequisites</strong></p>
     * <ul>
     * <li>Activate Alibaba Cloud Model Studio and Tongyi Dianjin.</li>
     * <li>Obtain your workspace ID: retrieve your <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identifier</a>.</li>
     * </ul>
     * 
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
     * <b>description</b> :
     * <p>Before you use this API, make sure that you understand the billing methods and pricing for Tongyi Gold.
     * Prerequisites
     * You have activated Alibaba Cloud Model Studio and Tongyi Gold.
     * You must have a workspace ID. For more information, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identity</a>.</p>
     * 
     * @param request the request parameters of RunDialogAnalysis  RunDialogAnalysisRequest
     * @return RunDialogAnalysisResponse
     */
    @Override
    public CompletableFuture<RunDialogAnalysisResponse> runDialogAnalysis(RunDialogAnalysisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RunDialogAnalysis").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/api/virtualHuman/dialog/stream/analysis").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RunDialogAnalysisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RunDialogAnalysisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public <ReturnT> CompletableFuture<ReturnT> runDialogAnalysisWithAsyncResponseHandler(RunDialogAnalysisRequest request, AsyncResponseHandler<RunDialogAnalysisResponse, ReturnT> responseHandler) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RunDialogAnalysis").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/api/virtualHuman/dialog/stream/analysis").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withResponseHandler(responseHandler).withOutput(RunDialogAnalysisResponse.create());
            return this.handler.execute(params)
                    .thenCompose((output) -> CompletableFuture.completedFuture(responseHandler.transform((RunDialogAnalysisResponse)output)));
        } catch (Exception e) {
            CompletableFuture<ReturnT> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<RunDialogAnalysisResponseBody> runDialogAnalysisWithResponseIterable(RunDialogAnalysisRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("RunDialogAnalysis").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/api/virtualHuman/dialog/stream/analysis").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
        RunDialogAnalysisResponseBodyIterator iterator = RunDialogAnalysisResponseBodyIterator.create();
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
     * <b>description</b> :
     * <p>Review the pricing and billing details for the Tongyi Dianjin product before you use this API.
     * Prerequisites
     * Activate Alibaba Cloud Model Studio and Tongyi Dianjin.
     * Obtain the \<code>workspaceId\\</code>: Retrieve the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identity</a>.</p>
     * 
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
     * <b>description</b> :
     * <p><em>Prerequisites</em>*</p>
     * <ul>
     * <li>Activate the Alibaba Cloud Model Studio service and the Tongyi Gold service.</li>
     * <li>Obtain your workspace ID. For more information, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identity</a>.</li>
     * </ul>
     * 
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
     * <b>description</b> :
     * <p>Before using this API, ensure you understand the billing methods and pricing of the Tongyi Gold product.
     * Prerequisites
     * You must activate Alibaba Cloud Model Studio and Tongyi Gold services.
     * Obtain the workspaceId. For more information, see the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">workspace identity</a>.</p>
     * 
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
     * <b>description</b> :
     * <p><em>Prerequisites</em>*</p>
     * <ul>
     * <li>You have activated Alibaba Cloud Model Studio and Tongyi Dianjin.</li>
     * <li>Obtain the workspace ID. For more information, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">Get the workspace ID</a>.</li>
     * </ul>
     * 
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
