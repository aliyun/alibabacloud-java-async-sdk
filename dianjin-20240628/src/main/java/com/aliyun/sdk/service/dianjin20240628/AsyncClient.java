// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dianjin20240628.models.*;
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
     * @param request the request parameters of CommercializeFetch  CommercializeFetchRequest
     * @return CommercializeFetchResponse
     */
    CompletableFuture<CommercializeFetchResponse> commercializeFetch(CommercializeFetchRequest request);

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
    CompletableFuture<CreateAnnualDocSummaryTaskResponse> createAnnualDocSummaryTask(CreateAnnualDocSummaryTaskRequest request);

    /**
     * @param request the request parameters of CreateDialog  CreateDialogRequest
     * @return CreateDialogResponse
     */
    CompletableFuture<CreateDialogResponse> createDialog(CreateDialogRequest request);

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
    CompletableFuture<CreateDialogAnalysisTaskResponse> createDialogAnalysisTask(CreateDialogAnalysisTaskRequest request);

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
    CompletableFuture<CreateDocsSummaryTaskResponse> createDocsSummaryTask(CreateDocsSummaryTaskRequest request);

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
    CompletableFuture<CreateFinReportSummaryTaskResponse> createFinReportSummaryTask(CreateFinReportSummaryTaskRequest request);

    /**
     * @param request the request parameters of CreateImageDetectionTask  CreateImageDetectionTaskRequest
     * @return CreateImageDetectionTaskResponse
     */
    CompletableFuture<CreateImageDetectionTaskResponse> createImageDetectionTask(CreateImageDetectionTaskRequest request);

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
    CompletableFuture<CreateLibraryResponse> createLibrary(CreateLibraryRequest request);

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
    CompletableFuture<CreatePdfTranslateTaskResponse> createPdfTranslateTask(CreatePdfTranslateTaskRequest request);

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
    CompletableFuture<CreatePredefinedDocumentResponse> createPredefinedDocument(CreatePredefinedDocumentRequest request);

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
    CompletableFuture<CreateQualityCheckTaskResponse> createQualityCheckTask(CreateQualityCheckTaskRequest request);

    /**
     * @param request the request parameters of CreateVideoCreationTask  CreateVideoCreationTaskRequest
     * @return CreateVideoCreationTaskResponse
     */
    CompletableFuture<CreateVideoCreationTaskResponse> createVideoCreationTask(CreateVideoCreationTaskRequest request);

    /**
     * @param request the request parameters of DashscopeAsyncTaskFinishEvent  DashscopeAsyncTaskFinishEventRequest
     * @return DashscopeAsyncTaskFinishEventResponse
     */
    CompletableFuture<DashscopeAsyncTaskFinishEventResponse> dashscopeAsyncTaskFinishEvent(DashscopeAsyncTaskFinishEventRequest request);

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
    CompletableFuture<DeleteDocumentResponse> deleteDocument(DeleteDocumentRequest request);

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
    CompletableFuture<DeleteLibraryResponse> deleteLibrary(DeleteLibraryRequest request);

    /**
     * @param request the request parameters of EndToEndRealTimeDialog  EndToEndRealTimeDialogRequest
     * @return EndToEndRealTimeDialogResponse
     */
    CompletableFuture<EndToEndRealTimeDialogResponse> endToEndRealTimeDialog(EndToEndRealTimeDialogRequest request);

    /**
     * @param request the request parameters of EvictTask  EvictTaskRequest
     * @return EvictTaskResponse
     */
    CompletableFuture<EvictTaskResponse> evictTask(EvictTaskRequest request);

    /**
     * @param request the request parameters of ExchangeEntitlement  ExchangeEntitlementRequest
     * @return ExchangeEntitlementResponse
     */
    CompletableFuture<ExchangeEntitlementResponse> exchangeEntitlement(ExchangeEntitlementRequest request);

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
    CompletableFuture<GenDocQaResultResponse> genDocQaResult(GenDocQaResultRequest request);

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
    CompletableFuture<GetAppConfigResponse> getAppConfig(GetAppConfigRequest request);

    /**
     * @param request the request parameters of GetChatQuestionResp  GetChatQuestionRespRequest
     * @return GetChatQuestionRespResponse
     */
    CompletableFuture<GetChatQuestionRespResponse> getChatQuestionResp(GetChatQuestionRespRequest request);

    /**
     * @param request the request parameters of GetDialogAnalysisResult  GetDialogAnalysisResultRequest
     * @return GetDialogAnalysisResultResponse
     */
    CompletableFuture<GetDialogAnalysisResultResponse> getDialogAnalysisResult(GetDialogAnalysisResultRequest request);

    /**
     * @param request the request parameters of GetDialogDetail  GetDialogDetailRequest
     * @return GetDialogDetailResponse
     */
    CompletableFuture<GetDialogDetailResponse> getDialogDetail(GetDialogDetailRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API retrieves conversation records between customers and service agents, along with intent analysis results generated by the model.</p>
     * 
     * @param request the request parameters of GetDialogLog  GetDialogLogRequest
     * @return GetDialogLogResponse
     */
    CompletableFuture<GetDialogLogResponse> getDialogLog(GetDialogLogRequest request);

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
    CompletableFuture<GetDocumentChunkListResponse> getDocumentChunkList(GetDocumentChunkListRequest request);

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
    CompletableFuture<GetDocumentListResponse> getDocumentList(GetDocumentListRequest request);

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
    CompletableFuture<GetDocumentUrlResponse> getDocumentUrl(GetDocumentUrlRequest request);

    /**
     * <b>description</b> :
     * <p>Prerequisites
     * You have activated Alibaba Cloud Model Studio and Tongyi Dianjin.
     * To obtain the workspace ID, see <a href="https://help.aliyun.com/zh/model-studio/developer-reference/get-app-id-and-workspace?spm=openapi-amp.newDocPublishment.0.0.2eb8281foUVd15#2612f896detsz:~:text=%E6%9F%A5%E7%9C%8BAPI%2DKEY%E3%80%82-,%E8%8E%B7%E5%8F%96APP%2DID%E5%92%8CWORKSPACE,-%E8%BF%9B%E5%85%A5%E6%88%91%E7%9A%84%E5%BA%94%E7%94%A8">the document about obtaining the workspace ID</a>.</p>
     * 
     * @param request the request parameters of GetFilterDocumentList  GetFilterDocumentListRequest
     * @return GetFilterDocumentListResponse
     */
    CompletableFuture<GetFilterDocumentListResponse> getFilterDocumentList(GetFilterDocumentListRequest request);

    /**
     * @param request the request parameters of GetHistoryListByBizType  GetHistoryListByBizTypeRequest
     * @return GetHistoryListByBizTypeResponse
     */
    CompletableFuture<GetHistoryListByBizTypeResponse> getHistoryListByBizType(GetHistoryListByBizTypeRequest request);

    /**
     * @param request the request parameters of GetImageDetectionTaskResult  GetImageDetectionTaskResultRequest
     * @return GetImageDetectionTaskResultResponse
     */
    CompletableFuture<GetImageDetectionTaskResultResponse> getImageDetectionTaskResult(GetImageDetectionTaskResultRequest request);

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
    CompletableFuture<GetLibraryResponse> getLibrary(GetLibraryRequest request);

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
    CompletableFuture<GetLibraryListResponse> getLibraryList(GetLibraryListRequest request);

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
    CompletableFuture<GetParseResultResponse> getParseResult(GetParseResultRequest request);

    /**
     * @param request the request parameters of GetQualityCheckTaskResult  GetQualityCheckTaskResultRequest
     * @return GetQualityCheckTaskResultResponse
     */
    CompletableFuture<GetQualityCheckTaskResultResponse> getQualityCheckTaskResult(GetQualityCheckTaskResultRequest request);

    /**
     * @param request the request parameters of GetReportResponse  GetReportResponseRequest
     * @return GetReportResponseResponse
     */
    CompletableFuture<GetReportResponseResponse> getReportResponse(GetReportResponseRequest request);

    /**
     * @param request the request parameters of GetReportTaskStatus  GetReportTaskStatusRequest
     * @return GetReportTaskStatusResponse
     */
    CompletableFuture<GetReportTaskStatusResponse> getReportTaskStatus(GetReportTaskStatusRequest request);

    /**
     * @param request the request parameters of GetSummaryTaskResult  GetSummaryTaskResultRequest
     * @return GetSummaryTaskResultResponse
     */
    CompletableFuture<GetSummaryTaskResultResponse> getSummaryTaskResult(GetSummaryTaskResultRequest request);

    /**
     * @param request the request parameters of GetTaskResult  GetTaskResultRequest
     * @return GetTaskResultResponse
     */
    CompletableFuture<GetTaskResultResponse> getTaskResult(GetTaskResultRequest request);

    /**
     * @param request the request parameters of GetTaskStatus  GetTaskStatusRequest
     * @return GetTaskStatusResponse
     */
    CompletableFuture<GetTaskStatusResponse> getTaskStatus(GetTaskStatusRequest request);

    /**
     * @param request the request parameters of GetUsage  GetUsageRequest
     * @return GetUsageResponse
     */
    CompletableFuture<GetUsageResponse> getUsage(GetUsageRequest request);

    /**
     * @param request the request parameters of GetVideoCreationTaskResult  GetVideoCreationTaskResultRequest
     * @return GetVideoCreationTaskResultResponse
     */
    CompletableFuture<GetVideoCreationTaskResultResponse> getVideoCreationTaskResult(GetVideoCreationTaskResultRequest request);

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
    CompletableFuture<InvokePluginResponse> invokePlugin(InvokePluginRequest request);

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
    CompletableFuture<PreviewDocumentResponse> previewDocument(PreviewDocumentRequest request);

    /**
     * @param request the request parameters of QueryAmount  QueryAmountRequest
     * @return QueryAmountResponse
     */
    CompletableFuture<QueryAmountResponse> queryAmount(QueryAmountRequest request);

    /**
     * @param request the request parameters of QueryApiKeys  QueryApiKeysRequest
     * @return QueryApiKeysResponse
     */
    CompletableFuture<QueryApiKeysResponse> queryApiKeys(QueryApiKeysRequest request);

    /**
     * @param request the request parameters of QueryRedemptionRecords  QueryRedemptionRecordsRequest
     * @return QueryRedemptionRecordsResponse
     */
    CompletableFuture<QueryRedemptionRecordsResponse> queryRedemptionRecords(QueryRedemptionRecordsRequest request);

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
    CompletableFuture<ReIndexResponse> reIndex(ReIndexRequest request);

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
    CompletableFuture<RealTimeDialogResponse> realTimeDialog(RealTimeDialogRequest request);

    ResponseIterable<RealTimeDialogResponseBody> realTimeDialogWithResponseIterable(RealTimeDialogRequest request);

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
    CompletableFuture<RealtimeDialogAssistResponse> realtimeDialogAssist(RealtimeDialogAssistRequest request);

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
    CompletableFuture<RebuildTaskResponse> rebuildTask(RebuildTaskRequest request);

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
    CompletableFuture<RecallDocumentResponse> recallDocument(RecallDocumentRequest request);

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
    CompletableFuture<RecognizeIntentionResponse> recognizeIntention(RecognizeIntentionRequest request);

    /**
     * @param request the request parameters of RetryReportTask  RetryReportTaskRequest
     * @return RetryReportTaskResponse
     */
    CompletableFuture<RetryReportTaskResponse> retryReportTask(RetryReportTaskRequest request);

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
    CompletableFuture<RunAgentResponse> runAgent(RunAgentRequest request);

<ReturnT> CompletableFuture<ReturnT> runAgentWithAsyncResponseHandler(RunAgentRequest request, AsyncResponseHandler<RunAgentResponse, ReturnT> responseHandler);

    ResponseIterable<RunAgentResponseBody> runAgentWithResponseIterable(RunAgentRequest request);

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
    CompletableFuture<RunChatResultGenerationResponse> runChatResultGeneration(RunChatResultGenerationRequest request);

    ResponseIterable<RunChatResultGenerationResponseBody> runChatResultGenerationWithResponseIterable(RunChatResultGenerationRequest request);

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
    CompletableFuture<RunDialogAnalysisResponse> runDialogAnalysis(RunDialogAnalysisRequest request);

<ReturnT> CompletableFuture<ReturnT> runDialogAnalysisWithAsyncResponseHandler(RunDialogAnalysisRequest request, AsyncResponseHandler<RunDialogAnalysisResponse, ReturnT> responseHandler);

    ResponseIterable<RunDialogAnalysisResponseBody> runDialogAnalysisWithResponseIterable(RunDialogAnalysisRequest request);

    /**
     * @param request the request parameters of RunLibraryChatGeneration  RunLibraryChatGenerationRequest
     * @return RunLibraryChatGenerationResponse
     */
    CompletableFuture<RunLibraryChatGenerationResponse> runLibraryChatGeneration(RunLibraryChatGenerationRequest request);

    ResponseIterable<RunLibraryChatGenerationResponseBody> runLibraryChatGenerationWithResponseIterable(RunLibraryChatGenerationRequest request);

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
    CompletableFuture<SubmitChatQuestionResponse> submitChatQuestion(SubmitChatQuestionRequest request);

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
    CompletableFuture<UpdateDocumentResponse> updateDocument(UpdateDocumentRequest request);

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
    CompletableFuture<UpdateDocumentChunkResponse> updateDocumentChunk(UpdateDocumentChunkRequest request);

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
    CompletableFuture<UpdateLibraryResponse> updateLibrary(UpdateLibraryRequest request);

    /**
     * @param request the request parameters of UpdateQaLibrary  UpdateQaLibraryRequest
     * @return UpdateQaLibraryResponse
     */
    CompletableFuture<UpdateQaLibraryResponse> updateQaLibrary(UpdateQaLibraryRequest request);

}
