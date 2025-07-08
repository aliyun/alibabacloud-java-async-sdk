// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dysms20170620.models.*;
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
     * @param request the request parameters of AddDomain  AddDomainRequest
     * @return AddDomainResponse
     */
    CompletableFuture<AddDomainResponse> addDomain(AddDomainRequest request);

    /**
     * @param request the request parameters of AddDomainNew  AddDomainNewRequest
     * @return AddDomainNewResponse
     */
    CompletableFuture<AddDomainNewResponse> addDomainNew(AddDomainNewRequest request);

    /**
     * @param request the request parameters of ApplyExportSmsSendRecordNew  ApplyExportSmsSendRecordNewRequest
     * @return ApplyExportSmsSendRecordNewResponse
     */
    CompletableFuture<ApplyExportSmsSendRecordNewResponse> applyExportSmsSendRecordNew(ApplyExportSmsSendRecordNewRequest request);

    /**
     * @param request the request parameters of BatchCreateSmsSign  BatchCreateSmsSignRequest
     * @return BatchCreateSmsSignResponse
     */
    CompletableFuture<BatchCreateSmsSignResponse> batchCreateSmsSign(BatchCreateSmsSignRequest request);

    /**
     * @param request the request parameters of BatchDeleteExportSendRecordNew  BatchDeleteExportSendRecordNewRequest
     * @return BatchDeleteExportSendRecordNewResponse
     */
    CompletableFuture<BatchDeleteExportSendRecordNewResponse> batchDeleteExportSendRecordNew(BatchDeleteExportSendRecordNewRequest request);

    /**
     * @param request the request parameters of BatchDeleteTaskNew  BatchDeleteTaskNewRequest
     * @return BatchDeleteTaskNewResponse
     */
    CompletableFuture<BatchDeleteTaskNewResponse> batchDeleteTaskNew(BatchDeleteTaskNewRequest request);

    /**
     * @param request the request parameters of CalculateSmsLengthNew  CalculateSmsLengthNewRequest
     * @return CalculateSmsLengthNewResponse
     */
    CompletableFuture<CalculateSmsLengthNewResponse> calculateSmsLengthNew(CalculateSmsLengthNewRequest request);

    /**
     * @param request the request parameters of CancelSmsSign  CancelSmsSignRequest
     * @return CancelSmsSignResponse
     */
    CompletableFuture<CancelSmsSignResponse> cancelSmsSign(CancelSmsSignRequest request);

    /**
     * @param request the request parameters of CancelSmsTemplate  CancelSmsTemplateRequest
     * @return CancelSmsTemplateResponse
     */
    CompletableFuture<CancelSmsTemplateResponse> cancelSmsTemplate(CancelSmsTemplateRequest request);

    /**
     * @param request the request parameters of CancelSmsTemplateNew  CancelSmsTemplateNewRequest
     * @return CancelSmsTemplateNewResponse
     */
    CompletableFuture<CancelSmsTemplateNewResponse> cancelSmsTemplateNew(CancelSmsTemplateNewRequest request);

    /**
     * @param request the request parameters of CheckSmsSignNew  CheckSmsSignNewRequest
     * @return CheckSmsSignNewResponse
     */
    CompletableFuture<CheckSmsSignNewResponse> checkSmsSignNew(CheckSmsSignNewRequest request);

    /**
     * @param request the request parameters of CreateAlicomProduct  CreateAlicomProductRequest
     * @return CreateAlicomProductResponse
     */
    CompletableFuture<CreateAlicomProductResponse> createAlicomProduct(CreateAlicomProductRequest request);

    /**
     * @param request the request parameters of CreateAuthorization  CreateAuthorizationRequest
     * @return CreateAuthorizationResponse
     */
    CompletableFuture<CreateAuthorizationResponse> createAuthorization(CreateAuthorizationRequest request);

    /**
     * @param request the request parameters of CreateCardMessageCallback  CreateCardMessageCallbackRequest
     * @return CreateCardMessageCallbackResponse
     */
    CompletableFuture<CreateCardMessageCallbackResponse> createCardMessageCallback(CreateCardMessageCallbackRequest request);

    /**
     * @param request the request parameters of CreateCardMessageQueue  CreateCardMessageQueueRequest
     * @return CreateCardMessageQueueResponse
     */
    CompletableFuture<CreateCardMessageQueueResponse> createCardMessageQueue(CreateCardMessageQueueRequest request);

    /**
     * @param request the request parameters of CreateDigitalSmsTemplateNew  CreateDigitalSmsTemplateNewRequest
     * @return CreateDigitalSmsTemplateNewResponse
     */
    CompletableFuture<CreateDigitalSmsTemplateNewResponse> createDigitalSmsTemplateNew(CreateDigitalSmsTemplateNewRequest request);

    /**
     * @deprecated OpenAPI CreateFileByBiz is deprecated  * @param request  the request parameters of CreateFileByBiz  CreateFileByBizRequest
     * @return CreateFileByBizResponse
     */
    @Deprecated
    CompletableFuture<CreateFileByBizResponse> createFileByBiz(CreateFileByBizRequest request);

    /**
     * @param request the request parameters of CreateFlowLimit  CreateFlowLimitRequest
     * @return CreateFlowLimitResponse
     */
    CompletableFuture<CreateFlowLimitResponse> createFlowLimit(CreateFlowLimitRequest request);

    /**
     * @param request the request parameters of CreateFlowLimitNew  CreateFlowLimitNewRequest
     * @return CreateFlowLimitNewResponse
     */
    CompletableFuture<CreateFlowLimitNewResponse> createFlowLimitNew(CreateFlowLimitNewRequest request);

    /**
     * @param request the request parameters of CreateMessageCallbackNew  CreateMessageCallbackNewRequest
     * @return CreateMessageCallbackNewResponse
     */
    CompletableFuture<CreateMessageCallbackNewResponse> createMessageCallbackNew(CreateMessageCallbackNewRequest request);

    /**
     * @param request the request parameters of CreateMessageCallbackTestNew  CreateMessageCallbackTestNewRequest
     * @return CreateMessageCallbackTestNewResponse
     */
    CompletableFuture<CreateMessageCallbackTestNewResponse> createMessageCallbackTestNew(CreateMessageCallbackTestNewRequest request);

    /**
     * @param request the request parameters of CreateMessageQueueNew  CreateMessageQueueNewRequest
     * @return CreateMessageQueueNewResponse
     */
    CompletableFuture<CreateMessageQueueNewResponse> createMessageQueueNew(CreateMessageQueueNewRequest request);

    /**
     * @param request the request parameters of CreatePhoneWhiteList  CreatePhoneWhiteListRequest
     * @return CreatePhoneWhiteListResponse
     */
    CompletableFuture<CreatePhoneWhiteListResponse> createPhoneWhiteList(CreatePhoneWhiteListRequest request);

    /**
     * @param request the request parameters of CreatePhoneWhiteListNew  CreatePhoneWhiteListNewRequest
     * @return CreatePhoneWhiteListNewResponse
     */
    CompletableFuture<CreatePhoneWhiteListNewResponse> createPhoneWhiteListNew(CreatePhoneWhiteListNewRequest request);

    /**
     * @param request the request parameters of CreatePkgThreshold  CreatePkgThresholdRequest
     * @return CreatePkgThresholdResponse
     */
    CompletableFuture<CreatePkgThresholdResponse> createPkgThreshold(CreatePkgThresholdRequest request);

    /**
     * @param request the request parameters of CreatePkgThresholdNew  CreatePkgThresholdNewRequest
     * @return CreatePkgThresholdNewResponse
     */
    CompletableFuture<CreatePkgThresholdNewResponse> createPkgThresholdNew(CreatePkgThresholdNewRequest request);

    /**
     * @param request the request parameters of CreatePrevLimitNew  CreatePrevLimitNewRequest
     * @return CreatePrevLimitNewResponse
     */
    CompletableFuture<CreatePrevLimitNewResponse> createPrevLimitNew(CreatePrevLimitNewRequest request);

    /**
     * @param request the request parameters of CreateProduct  CreateProductRequest
     * @return CreateProductResponse
     */
    CompletableFuture<CreateProductResponse> createProduct(CreateProductRequest request);

    /**
     * @param request the request parameters of CreateProductNew  CreateProductNewRequest
     * @return CreateProductNewResponse
     */
    CompletableFuture<CreateProductNewResponse> createProductNew(CreateProductNewRequest request);

    /**
     * @param request the request parameters of CreateShortUrlNew  CreateShortUrlNewRequest
     * @return CreateShortUrlNewResponse
     */
    CompletableFuture<CreateShortUrlNewResponse> createShortUrlNew(CreateShortUrlNewRequest request);

    /**
     * @param request the request parameters of CreateSmsDetectTaskNew  CreateSmsDetectTaskNewRequest
     * @return CreateSmsDetectTaskNewResponse
     */
    CompletableFuture<CreateSmsDetectTaskNewResponse> createSmsDetectTaskNew(CreateSmsDetectTaskNewRequest request);

    /**
     * @param request the request parameters of CreateSmsInternalApply  CreateSmsInternalApplyRequest
     * @return CreateSmsInternalApplyResponse
     */
    CompletableFuture<CreateSmsInternalApplyResponse> createSmsInternalApply(CreateSmsInternalApplyRequest request);

    /**
     * @param request the request parameters of CreateSmsProductForChannelCust  CreateSmsProductForChannelCustRequest
     * @return CreateSmsProductForChannelCustResponse
     */
    CompletableFuture<CreateSmsProductForChannelCustResponse> createSmsProductForChannelCust(CreateSmsProductForChannelCustRequest request);

    /**
     * @param request the request parameters of CreateSmsSaasTask  CreateSmsSaasTaskRequest
     * @return CreateSmsSaasTaskResponse
     */
    CompletableFuture<CreateSmsSaasTaskResponse> createSmsSaasTask(CreateSmsSaasTaskRequest request);

    /**
     * @param request the request parameters of CreateSmsSaasTaskNew  CreateSmsSaasTaskNewRequest
     * @return CreateSmsSaasTaskNewResponse
     */
    CompletableFuture<CreateSmsSaasTaskNewResponse> createSmsSaasTaskNew(CreateSmsSaasTaskNewRequest request);

    /**
     * @param request the request parameters of CreateSmsSendFailDetailsDownload  CreateSmsSendFailDetailsDownloadRequest
     * @return CreateSmsSendFailDetailsDownloadResponse
     */
    CompletableFuture<CreateSmsSendFailDetailsDownloadResponse> createSmsSendFailDetailsDownload(CreateSmsSendFailDetailsDownloadRequest request);

    /**
     * @param request the request parameters of CreateSmsSign  CreateSmsSignRequest
     * @return CreateSmsSignResponse
     */
    CompletableFuture<CreateSmsSignResponse> createSmsSign(CreateSmsSignRequest request);

    /**
     * @param request the request parameters of CreateSmsSignNew  CreateSmsSignNewRequest
     * @return CreateSmsSignNewResponse
     */
    CompletableFuture<CreateSmsSignNewResponse> createSmsSignNew(CreateSmsSignNewRequest request);

    /**
     * @param request the request parameters of CreateSmsTemplateNew  CreateSmsTemplateNewRequest
     * @return CreateSmsTemplateNewResponse
     */
    CompletableFuture<CreateSmsTemplateNewResponse> createSmsTemplateNew(CreateSmsTemplateNewRequest request);

    /**
     * @param request the request parameters of CreateWarningThreshold  CreateWarningThresholdRequest
     * @return CreateWarningThresholdResponse
     */
    CompletableFuture<CreateWarningThresholdResponse> createWarningThreshold(CreateWarningThresholdRequest request);

    /**
     * @param request the request parameters of CreateWarningThresholdNew  CreateWarningThresholdNewRequest
     * @return CreateWarningThresholdNewResponse
     */
    CompletableFuture<CreateWarningThresholdNewResponse> createWarningThresholdNew(CreateWarningThresholdNewRequest request);

    /**
     * @param request the request parameters of DelCardSendExportInfo  DelCardSendExportInfoRequest
     * @return DelCardSendExportInfoResponse
     */
    CompletableFuture<DelCardSendExportInfoResponse> delCardSendExportInfo(DelCardSendExportInfoRequest request);

    /**
     * @param request the request parameters of DeleteCardMessageCallback  DeleteCardMessageCallbackRequest
     * @return DeleteCardMessageCallbackResponse
     */
    CompletableFuture<DeleteCardMessageCallbackResponse> deleteCardMessageCallback(DeleteCardMessageCallbackRequest request);

    /**
     * @param request the request parameters of DeleteCardMessageQueue  DeleteCardMessageQueueRequest
     * @return DeleteCardMessageQueueResponse
     */
    CompletableFuture<DeleteCardMessageQueueResponse> deleteCardMessageQueue(DeleteCardMessageQueueRequest request);

    /**
     * @param request the request parameters of DeleteContacts  DeleteContactsRequest
     * @return DeleteContactsResponse
     */
    CompletableFuture<DeleteContactsResponse> deleteContacts(DeleteContactsRequest request);

    /**
     * @param request the request parameters of DeleteContactsNew  DeleteContactsNewRequest
     * @return DeleteContactsNewResponse
     */
    CompletableFuture<DeleteContactsNewResponse> deleteContactsNew(DeleteContactsNewRequest request);

    /**
     * @param request the request parameters of DeleteDigitalTemplateNew  DeleteDigitalTemplateNewRequest
     * @return DeleteDigitalTemplateNewResponse
     */
    CompletableFuture<DeleteDigitalTemplateNewResponse> deleteDigitalTemplateNew(DeleteDigitalTemplateNewRequest request);

    /**
     * @param request the request parameters of DeleteMessageCallbackNew  DeleteMessageCallbackNewRequest
     * @return DeleteMessageCallbackNewResponse
     */
    CompletableFuture<DeleteMessageCallbackNewResponse> deleteMessageCallbackNew(DeleteMessageCallbackNewRequest request);

    /**
     * @param request the request parameters of DeleteMessageQueueNew  DeleteMessageQueueNewRequest
     * @return DeleteMessageQueueNewResponse
     */
    CompletableFuture<DeleteMessageQueueNewResponse> deleteMessageQueueNew(DeleteMessageQueueNewRequest request);

    /**
     * @param request the request parameters of DeleteOrCanceleTask  DeleteOrCanceleTaskRequest
     * @return DeleteOrCanceleTaskResponse
     */
    CompletableFuture<DeleteOrCanceleTaskResponse> deleteOrCanceleTask(DeleteOrCanceleTaskRequest request);

    /**
     * @param request the request parameters of DeleteOrCanceleTaskNew  DeleteOrCanceleTaskNewRequest
     * @return DeleteOrCanceleTaskNewResponse
     */
    CompletableFuture<DeleteOrCanceleTaskNewResponse> deleteOrCanceleTaskNew(DeleteOrCanceleTaskNewRequest request);

    /**
     * @param request the request parameters of DeletePhoneWhiteList  DeletePhoneWhiteListRequest
     * @return DeletePhoneWhiteListResponse
     */
    CompletableFuture<DeletePhoneWhiteListResponse> deletePhoneWhiteList(DeletePhoneWhiteListRequest request);

    /**
     * @param request the request parameters of DeletePhoneWhiteListNew  DeletePhoneWhiteListNewRequest
     * @return DeletePhoneWhiteListNewResponse
     */
    CompletableFuture<DeletePhoneWhiteListNewResponse> deletePhoneWhiteListNew(DeletePhoneWhiteListNewRequest request);

    /**
     * @param request the request parameters of DeleteShortUrlNew  DeleteShortUrlNewRequest
     * @return DeleteShortUrlNewResponse
     */
    CompletableFuture<DeleteShortUrlNewResponse> deleteShortUrlNew(DeleteShortUrlNewRequest request);

    /**
     * @param request the request parameters of DeleteSmsTemplateNew  DeleteSmsTemplateNewRequest
     * @return DeleteSmsTemplateNewResponse
     */
    CompletableFuture<DeleteSmsTemplateNewResponse> deleteSmsTemplateNew(DeleteSmsTemplateNewRequest request);

    /**
     * @param request the request parameters of ExportCardSmsHistory  ExportCardSmsHistoryRequest
     * @return ExportCardSmsHistoryResponse
     */
    CompletableFuture<ExportCardSmsHistoryResponse> exportCardSmsHistory(ExportCardSmsHistoryRequest request);

    /**
     * @param request the request parameters of ExportCardSmsStatistics  ExportCardSmsStatisticsRequest
     * @return ExportCardSmsStatisticsResponse
     */
    CompletableFuture<ExportCardSmsStatisticsResponse> exportCardSmsStatistics(ExportCardSmsStatisticsRequest request);

    /**
     * @param request the request parameters of ExportCardSmsStatisticsSend  ExportCardSmsStatisticsSendRequest
     * @return ExportCardSmsStatisticsSendResponse
     */
    CompletableFuture<ExportCardSmsStatisticsSendResponse> exportCardSmsStatisticsSend(ExportCardSmsStatisticsSendRequest request);

    /**
     * @param request the request parameters of ExportTmpEffectReportData  ExportTmpEffectReportDataRequest
     * @return ExportTmpEffectReportDataResponse
     */
    CompletableFuture<ExportTmpEffectReportDataResponse> exportTmpEffectReportData(ExportTmpEffectReportDataRequest request);

    /**
     * @param request the request parameters of GetLetterOfAuthorization  GetLetterOfAuthorizationRequest
     * @return GetLetterOfAuthorizationResponse
     */
    CompletableFuture<GetLetterOfAuthorizationResponse> getLetterOfAuthorization(GetLetterOfAuthorizationRequest request);

    /**
     * @param request the request parameters of ListPushMsg  ListPushMsgRequest
     * @return ListPushMsgResponse
     */
    CompletableFuture<ListPushMsgResponse> listPushMsg(ListPushMsgRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of OpenShortUrlProduct  OpenShortUrlProductRequest
     * @return OpenShortUrlProductResponse
     */
    CompletableFuture<OpenShortUrlProductResponse> openShortUrlProduct(OpenShortUrlProductRequest request);

    /**
     * @param request the request parameters of OpenShortUrlProductNew  OpenShortUrlProductNewRequest
     * @return OpenShortUrlProductNewResponse
     */
    CompletableFuture<OpenShortUrlProductNewResponse> openShortUrlProductNew(OpenShortUrlProductNewRequest request);

    /**
     * @param request the request parameters of OpencPrevFlagNew  OpencPrevFlagNewRequest
     * @return OpencPrevFlagNewResponse
     */
    CompletableFuture<OpencPrevFlagNewResponse> opencPrevFlagNew(OpencPrevFlagNewRequest request);

    /**
     * @param request the request parameters of QueryAnyParamTemplateUser  QueryAnyParamTemplateUserRequest
     * @return QueryAnyParamTemplateUserResponse
     */
    CompletableFuture<QueryAnyParamTemplateUserResponse> queryAnyParamTemplateUser(QueryAnyParamTemplateUserRequest request);

    /**
     * @param request the request parameters of QueryAuthorization  QueryAuthorizationRequest
     * @return QueryAuthorizationResponse
     */
    CompletableFuture<QueryAuthorizationResponse> queryAuthorization(QueryAuthorizationRequest request);

    /**
     * @param request the request parameters of QueryBillingStatistics  QueryBillingStatisticsRequest
     * @return QueryBillingStatisticsResponse
     */
    CompletableFuture<QueryBillingStatisticsResponse> queryBillingStatistics(QueryBillingStatisticsRequest request);

    /**
     * @param request the request parameters of QueryCardMessageQueue  QueryCardMessageQueueRequest
     * @return QueryCardMessageQueueResponse
     */
    CompletableFuture<QueryCardMessageQueueResponse> queryCardMessageQueue(QueryCardMessageQueueRequest request);

    /**
     * @param request the request parameters of QueryCardSendExportInfo  QueryCardSendExportInfoRequest
     * @return QueryCardSendExportInfoResponse
     */
    CompletableFuture<QueryCardSendExportInfoResponse> queryCardSendExportInfo(QueryCardSendExportInfoRequest request);

    /**
     * @param request the request parameters of QueryCardSmsHistory  QueryCardSmsHistoryRequest
     * @return QueryCardSmsHistoryResponse
     */
    CompletableFuture<QueryCardSmsHistoryResponse> queryCardSmsHistory(QueryCardSmsHistoryRequest request);

    /**
     * @param request the request parameters of QueryCardSmsHistoryDetail  QueryCardSmsHistoryDetailRequest
     * @return QueryCardSmsHistoryDetailResponse
     */
    CompletableFuture<QueryCardSmsHistoryDetailResponse> queryCardSmsHistoryDetail(QueryCardSmsHistoryDetailRequest request);

    /**
     * @param request the request parameters of QueryCardSmsStatistics  QueryCardSmsStatisticsRequest
     * @return QueryCardSmsStatisticsResponse
     */
    CompletableFuture<QueryCardSmsStatisticsResponse> queryCardSmsStatistics(QueryCardSmsStatisticsRequest request);

    /**
     * @param request the request parameters of QueryCardSmsStatisticsList  QueryCardSmsStatisticsListRequest
     * @return QueryCardSmsStatisticsListResponse
     */
    CompletableFuture<QueryCardSmsStatisticsListResponse> queryCardSmsStatisticsList(QueryCardSmsStatisticsListRequest request);

    /**
     * @param request the request parameters of QueryCardSmsStatisticsSend  QueryCardSmsStatisticsSendRequest
     * @return QueryCardSmsStatisticsSendResponse
     */
    CompletableFuture<QueryCardSmsStatisticsSendResponse> queryCardSmsStatisticsSend(QueryCardSmsStatisticsSendRequest request);

    /**
     * @param request the request parameters of QueryCardSmsStatisticsSendList  QueryCardSmsStatisticsSendListRequest
     * @return QueryCardSmsStatisticsSendListResponse
     */
    CompletableFuture<QueryCardSmsStatisticsSendListResponse> queryCardSmsStatisticsSendList(QueryCardSmsStatisticsSendListRequest request);

    /**
     * @param request the request parameters of QueryCommonCustInfo  QueryCommonCustInfoRequest
     * @return QueryCommonCustInfoResponse
     */
    CompletableFuture<QueryCommonCustInfoResponse> queryCommonCustInfo(QueryCommonCustInfoRequest request);

    /**
     * @param request the request parameters of QueryContactsList  QueryContactsListRequest
     * @return QueryContactsListResponse
     */
    CompletableFuture<QueryContactsListResponse> queryContactsList(QueryContactsListRequest request);

    /**
     * @param request the request parameters of QueryContactsListNew  QueryContactsListNewRequest
     * @return QueryContactsListNewResponse
     */
    CompletableFuture<QueryContactsListNewResponse> queryContactsListNew(QueryContactsListNewRequest request);

    /**
     * @param request the request parameters of QueryDailyBillInfoLeafNew  QueryDailyBillInfoLeafNewRequest
     * @return QueryDailyBillInfoLeafNewResponse
     */
    CompletableFuture<QueryDailyBillInfoLeafNewResponse> queryDailyBillInfoLeafNew(QueryDailyBillInfoLeafNewRequest request);

    /**
     * @param request the request parameters of QueryDigitalTemplateDetail  QueryDigitalTemplateDetailRequest
     * @return QueryDigitalTemplateDetailResponse
     */
    CompletableFuture<QueryDigitalTemplateDetailResponse> queryDigitalTemplateDetail(QueryDigitalTemplateDetailRequest request);

    /**
     * @param request the request parameters of QueryDigitalTemplateDetailNew  QueryDigitalTemplateDetailNewRequest
     * @return QueryDigitalTemplateDetailNewResponse
     */
    CompletableFuture<QueryDigitalTemplateDetailNewResponse> queryDigitalTemplateDetailNew(QueryDigitalTemplateDetailNewRequest request);

    /**
     * @param request the request parameters of QueryDigitalTemplateLastRange  QueryDigitalTemplateLastRangeRequest
     * @return QueryDigitalTemplateLastRangeResponse
     */
    CompletableFuture<QueryDigitalTemplateLastRangeResponse> queryDigitalTemplateLastRange(QueryDigitalTemplateLastRangeRequest request);

    /**
     * @param request the request parameters of QueryDigitalTemplateLastRangeNew  QueryDigitalTemplateLastRangeNewRequest
     * @return QueryDigitalTemplateLastRangeNewResponse
     */
    CompletableFuture<QueryDigitalTemplateLastRangeNewResponse> queryDigitalTemplateLastRangeNew(QueryDigitalTemplateLastRangeNewRequest request);

    /**
     * @param request the request parameters of QueryDigitalTemplatePageList  QueryDigitalTemplatePageListRequest
     * @return QueryDigitalTemplatePageListResponse
     */
    CompletableFuture<QueryDigitalTemplatePageListResponse> queryDigitalTemplatePageList(QueryDigitalTemplatePageListRequest request);

    /**
     * @param request the request parameters of QueryDigitalTemplatePageListNew  QueryDigitalTemplatePageListNewRequest
     * @return QueryDigitalTemplatePageListNewResponse
     */
    CompletableFuture<QueryDigitalTemplatePageListNewResponse> queryDigitalTemplatePageListNew(QueryDigitalTemplatePageListNewRequest request);

    /**
     * @param request the request parameters of QueryDomainList  QueryDomainListRequest
     * @return QueryDomainListResponse
     */
    CompletableFuture<QueryDomainListResponse> queryDomainList(QueryDomainListRequest request);

    /**
     * @param request the request parameters of QueryDomainListNew  QueryDomainListNewRequest
     * @return QueryDomainListNewResponse
     */
    CompletableFuture<QueryDomainListNewResponse> queryDomainListNew(QueryDomainListNewRequest request);

    /**
     * @param request the request parameters of QueryExportSendRecordListNew  QueryExportSendRecordListNewRequest
     * @return QueryExportSendRecordListNewResponse
     */
    CompletableFuture<QueryExportSendRecordListNewResponse> queryExportSendRecordListNew(QueryExportSendRecordListNewRequest request);

    /**
     * @param request the request parameters of QueryFailDetailDownload  QueryFailDetailDownloadRequest
     * @return QueryFailDetailDownloadResponse
     */
    CompletableFuture<QueryFailDetailDownloadResponse> queryFailDetailDownload(QueryFailDetailDownloadRequest request);

    /**
     * @param request the request parameters of QueryFailDetailDownloadNew  QueryFailDetailDownloadNewRequest
     * @return QueryFailDetailDownloadNewResponse
     */
    CompletableFuture<QueryFailDetailDownloadNewResponse> queryFailDetailDownloadNew(QueryFailDetailDownloadNewRequest request);

    /**
     * @param request the request parameters of QueryFlowLimit  QueryFlowLimitRequest
     * @return QueryFlowLimitResponse
     */
    CompletableFuture<QueryFlowLimitResponse> queryFlowLimit(QueryFlowLimitRequest request);

    /**
     * @param request the request parameters of QueryFlowLimitNew  QueryFlowLimitNewRequest
     * @return QueryFlowLimitNewResponse
     */
    CompletableFuture<QueryFlowLimitNewResponse> queryFlowLimitNew(QueryFlowLimitNewRequest request);

    /**
     * @param request the request parameters of QueryIndexColRecord  QueryIndexColRecordRequest
     * @return QueryIndexColRecordResponse
     */
    CompletableFuture<QueryIndexColRecordResponse> queryIndexColRecord(QueryIndexColRecordRequest request);

    /**
     * @param request the request parameters of QueryLearningStatusNew  QueryLearningStatusNewRequest
     * @return QueryLearningStatusNewResponse
     */
    CompletableFuture<QueryLearningStatusNewResponse> queryLearningStatusNew(QueryLearningStatusNewRequest request);

    /**
     * @param request the request parameters of QueryMarketingAssistantStatus  QueryMarketingAssistantStatusRequest
     * @return QueryMarketingAssistantStatusResponse
     */
    CompletableFuture<QueryMarketingAssistantStatusResponse> queryMarketingAssistantStatus(QueryMarketingAssistantStatusRequest request);

    /**
     * @param request the request parameters of QueryMessageCallbackNew  QueryMessageCallbackNewRequest
     * @return QueryMessageCallbackNewResponse
     */
    CompletableFuture<QueryMessageCallbackNewResponse> queryMessageCallbackNew(QueryMessageCallbackNewRequest request);

    /**
     * @param request the request parameters of QueryMessageQueueNew  QueryMessageQueueNewRequest
     * @return QueryMessageQueueNewResponse
     */
    CompletableFuture<QueryMessageQueueNewResponse> queryMessageQueueNew(QueryMessageQueueNewRequest request);

    /**
     * @param request the request parameters of QueryMonthlyBillInfoLeafNew  QueryMonthlyBillInfoLeafNewRequest
     * @return QueryMonthlyBillInfoLeafNewResponse
     */
    CompletableFuture<QueryMonthlyBillInfoLeafNewResponse> queryMonthlyBillInfoLeafNew(QueryMonthlyBillInfoLeafNewRequest request);

    /**
     * @param request the request parameters of QueryMonthlyBillRental  QueryMonthlyBillRentalRequest
     * @return QueryMonthlyBillRentalResponse
     */
    CompletableFuture<QueryMonthlyBillRentalResponse> queryMonthlyBillRental(QueryMonthlyBillRentalRequest request);

    /**
     * @param request the request parameters of QueryMonthlyBillRentalNew  QueryMonthlyBillRentalNewRequest
     * @return QueryMonthlyBillRentalNewResponse
     */
    CompletableFuture<QueryMonthlyBillRentalNewResponse> queryMonthlyBillRentalNew(QueryMonthlyBillRentalNewRequest request);

    /**
     * @param request the request parameters of QueryMsgCount  QueryMsgCountRequest
     * @return QueryMsgCountResponse
     */
    CompletableFuture<QueryMsgCountResponse> queryMsgCount(QueryMsgCountRequest request);

    /**
     * @param request the request parameters of QueryOpenStatus  QueryOpenStatusRequest
     * @return QueryOpenStatusResponse
     */
    CompletableFuture<QueryOpenStatusResponse> queryOpenStatus(QueryOpenStatusRequest request);

    /**
     * @param request the request parameters of QueryOpencFlagNew  QueryOpencFlagNewRequest
     * @return QueryOpencFlagNewResponse
     */
    CompletableFuture<QueryOpencFlagNewResponse> queryOpencFlagNew(QueryOpencFlagNewRequest request);

    /**
     * @param request the request parameters of QueryPhoneWhiteList  QueryPhoneWhiteListRequest
     * @return QueryPhoneWhiteListResponse
     */
    CompletableFuture<QueryPhoneWhiteListResponse> queryPhoneWhiteList(QueryPhoneWhiteListRequest request);

    /**
     * @param request the request parameters of QueryPhoneWhiteListNew  QueryPhoneWhiteListNewRequest
     * @return QueryPhoneWhiteListNewResponse
     */
    CompletableFuture<QueryPhoneWhiteListNewResponse> queryPhoneWhiteListNew(QueryPhoneWhiteListNewRequest request);

    /**
     * @param request the request parameters of QueryPkgThreshold  QueryPkgThresholdRequest
     * @return QueryPkgThresholdResponse
     */
    CompletableFuture<QueryPkgThresholdResponse> queryPkgThreshold(QueryPkgThresholdRequest request);

    /**
     * @param request the request parameters of QueryPkgThresholdNew  QueryPkgThresholdNewRequest
     * @return QueryPkgThresholdNewResponse
     */
    CompletableFuture<QueryPkgThresholdNewResponse> queryPkgThresholdNew(QueryPkgThresholdNewRequest request);

    /**
     * @param request the request parameters of QueryPrevLimitNew  QueryPrevLimitNewRequest
     * @return QueryPrevLimitNewResponse
     */
    CompletableFuture<QueryPrevLimitNewResponse> queryPrevLimitNew(QueryPrevLimitNewRequest request);

    /**
     * @param request the request parameters of QuerySaasRecord  QuerySaasRecordRequest
     * @return QuerySaasRecordResponse
     */
    CompletableFuture<QuerySaasRecordResponse> querySaasRecord(QuerySaasRecordRequest request);

    /**
     * @param request the request parameters of QuerySaasRecordNew  QuerySaasRecordNewRequest
     * @return QuerySaasRecordNewResponse
     */
    CompletableFuture<QuerySaasRecordNewResponse> querySaasRecordNew(QuerySaasRecordNewRequest request);

    /**
     * @param request the request parameters of QuerySendDetailsByPhoneNum  QuerySendDetailsByPhoneNumRequest
     * @return QuerySendDetailsByPhoneNumResponse
     */
    CompletableFuture<QuerySendDetailsByPhoneNumResponse> querySendDetailsByPhoneNum(QuerySendDetailsByPhoneNumRequest request);

    /**
     * @param request the request parameters of QuerySendDetailsByPhoneNumNew  QuerySendDetailsByPhoneNumNewRequest
     * @return QuerySendDetailsByPhoneNumNewResponse
     */
    CompletableFuture<QuerySendDetailsByPhoneNumNewResponse> querySendDetailsByPhoneNumNew(QuerySendDetailsByPhoneNumNewRequest request);

    /**
     * @param request the request parameters of QuerySendFailDetails  QuerySendFailDetailsRequest
     * @return QuerySendFailDetailsResponse
     */
    CompletableFuture<QuerySendFailDetailsResponse> querySendFailDetails(QuerySendFailDetailsRequest request);

    /**
     * @param request the request parameters of QuerySendFailDetailsNew  QuerySendFailDetailsNewRequest
     * @return QuerySendFailDetailsNewResponse
     */
    CompletableFuture<QuerySendFailDetailsNewResponse> querySendFailDetailsNew(QuerySendFailDetailsNewRequest request);

    /**
     * @param request the request parameters of QuerySendToGlobeStatus  QuerySendToGlobeStatusRequest
     * @return QuerySendToGlobeStatusResponse
     */
    CompletableFuture<QuerySendToGlobeStatusResponse> querySendToGlobeStatus(QuerySendToGlobeStatusRequest request);

    /**
     * @param request the request parameters of QueryShortUrlDetailNew  QueryShortUrlDetailNewRequest
     * @return QueryShortUrlDetailNewResponse
     */
    CompletableFuture<QueryShortUrlDetailNewResponse> queryShortUrlDetailNew(QueryShortUrlDetailNewRequest request);

    /**
     * @param request the request parameters of QueryShortUrlListNew  QueryShortUrlListNewRequest
     * @return QueryShortUrlListNewResponse
     */
    CompletableFuture<QueryShortUrlListNewResponse> queryShortUrlListNew(QueryShortUrlListNewRequest request);

    /**
     * @param request the request parameters of QueryShortUrlStatus  QueryShortUrlStatusRequest
     * @return QueryShortUrlStatusResponse
     */
    CompletableFuture<QueryShortUrlStatusResponse> queryShortUrlStatus(QueryShortUrlStatusRequest request);

    /**
     * @param request the request parameters of QuerySlsStatusNew  QuerySlsStatusNewRequest
     * @return QuerySlsStatusNewResponse
     */
    CompletableFuture<QuerySlsStatusNewResponse> querySlsStatusNew(QuerySlsStatusNewRequest request);

    /**
     * @param request the request parameters of QuerySmsBaseScreenNew  QuerySmsBaseScreenNewRequest
     * @return QuerySmsBaseScreenNewResponse
     */
    CompletableFuture<QuerySmsBaseScreenNewResponse> querySmsBaseScreenNew(QuerySmsBaseScreenNewRequest request);

    /**
     * @param request the request parameters of QuerySmsDetectCounts  QuerySmsDetectCountsRequest
     * @return QuerySmsDetectCountsResponse
     */
    CompletableFuture<QuerySmsDetectCountsResponse> querySmsDetectCounts(QuerySmsDetectCountsRequest request);

    /**
     * @param request the request parameters of QuerySmsDetectCountsNew  QuerySmsDetectCountsNewRequest
     * @return QuerySmsDetectCountsNewResponse
     */
    CompletableFuture<QuerySmsDetectCountsNewResponse> querySmsDetectCountsNew(QuerySmsDetectCountsNewRequest request);

    /**
     * @param request the request parameters of QuerySmsDetectList  QuerySmsDetectListRequest
     * @return QuerySmsDetectListResponse
     */
    CompletableFuture<QuerySmsDetectListResponse> querySmsDetectList(QuerySmsDetectListRequest request);

    /**
     * @param request the request parameters of QuerySmsDetectListNew  QuerySmsDetectListNewRequest
     * @return QuerySmsDetectListNewResponse
     */
    CompletableFuture<QuerySmsDetectListNewResponse> querySmsDetectListNew(QuerySmsDetectListNewRequest request);

    /**
     * @param request the request parameters of QuerySmsPackageDetail  QuerySmsPackageDetailRequest
     * @return QuerySmsPackageDetailResponse
     */
    CompletableFuture<QuerySmsPackageDetailResponse> querySmsPackageDetail(QuerySmsPackageDetailRequest request);

    /**
     * @param request the request parameters of QuerySmsPackageDetailNew  QuerySmsPackageDetailNewRequest
     * @return QuerySmsPackageDetailNewResponse
     */
    CompletableFuture<QuerySmsPackageDetailNewResponse> querySmsPackageDetailNew(QuerySmsPackageDetailNewRequest request);

    /**
     * @param request the request parameters of QuerySmsPackageNew  QuerySmsPackageNewRequest
     * @return QuerySmsPackageNewResponse
     */
    CompletableFuture<QuerySmsPackageNewResponse> querySmsPackageNew(QuerySmsPackageNewRequest request);

    /**
     * @param request the request parameters of QuerySmsPackageOrderList  QuerySmsPackageOrderListRequest
     * @return QuerySmsPackageOrderListResponse
     */
    CompletableFuture<QuerySmsPackageOrderListResponse> querySmsPackageOrderList(QuerySmsPackageOrderListRequest request);

    /**
     * @param request the request parameters of QuerySmsPackageOrderListNew  QuerySmsPackageOrderListNewRequest
     * @return QuerySmsPackageOrderListNewResponse
     */
    CompletableFuture<QuerySmsPackageOrderListNewResponse> querySmsPackageOrderListNew(QuerySmsPackageOrderListNewRequest request);

    /**
     * @param request the request parameters of QuerySmsPackageSummary  QuerySmsPackageSummaryRequest
     * @return QuerySmsPackageSummaryResponse
     */
    CompletableFuture<QuerySmsPackageSummaryResponse> querySmsPackageSummary(QuerySmsPackageSummaryRequest request);

    /**
     * @param request the request parameters of QuerySmsPackageSummaryNew  QuerySmsPackageSummaryNewRequest
     * @return QuerySmsPackageSummaryNewResponse
     */
    CompletableFuture<QuerySmsPackageSummaryNewResponse> querySmsPackageSummaryNew(QuerySmsPackageSummaryNewRequest request);

    /**
     * @param request the request parameters of QuerySmsSaasTaskDetail  QuerySmsSaasTaskDetailRequest
     * @return QuerySmsSaasTaskDetailResponse
     */
    CompletableFuture<QuerySmsSaasTaskDetailResponse> querySmsSaasTaskDetail(QuerySmsSaasTaskDetailRequest request);

    /**
     * @param request the request parameters of QuerySmsSaasTaskDetailNew  QuerySmsSaasTaskDetailNewRequest
     * @return QuerySmsSaasTaskDetailNewResponse
     */
    CompletableFuture<QuerySmsSaasTaskDetailNewResponse> querySmsSaasTaskDetailNew(QuerySmsSaasTaskDetailNewRequest request);

    /**
     * @param request the request parameters of QuerySmsSaasTaskList  QuerySmsSaasTaskListRequest
     * @return QuerySmsSaasTaskListResponse
     */
    CompletableFuture<QuerySmsSaasTaskListResponse> querySmsSaasTaskList(QuerySmsSaasTaskListRequest request);

    /**
     * @param request the request parameters of QuerySmsSaasTaskListNew  QuerySmsSaasTaskListNewRequest
     * @return QuerySmsSaasTaskListNewResponse
     */
    CompletableFuture<QuerySmsSaasTaskListNewResponse> querySmsSaasTaskListNew(QuerySmsSaasTaskListNewRequest request);

    /**
     * @param request the request parameters of QuerySmsSendFailDetailsUrl  QuerySmsSendFailDetailsUrlRequest
     * @return QuerySmsSendFailDetailsUrlResponse
     */
    CompletableFuture<QuerySmsSendFailDetailsUrlResponse> querySmsSendFailDetailsUrl(QuerySmsSendFailDetailsUrlRequest request);

    /**
     * @param request the request parameters of QuerySmsSendFailDetailsUrlNew  QuerySmsSendFailDetailsUrlNewRequest
     * @return QuerySmsSendFailDetailsUrlNewResponse
     */
    CompletableFuture<QuerySmsSendFailDetailsUrlNewResponse> querySmsSendFailDetailsUrlNew(QuerySmsSendFailDetailsUrlNewRequest request);

    /**
     * @param request the request parameters of QuerySmsSignDetailBySignIdNew  QuerySmsSignDetailBySignIdNewRequest
     * @return QuerySmsSignDetailBySignIdNewResponse
     */
    CompletableFuture<QuerySmsSignDetailBySignIdNewResponse> querySmsSignDetailBySignIdNew(QuerySmsSignDetailBySignIdNewRequest request);

    /**
     * @param request the request parameters of QuerySmsSignLastRange  QuerySmsSignLastRangeRequest
     * @return QuerySmsSignLastRangeResponse
     */
    CompletableFuture<QuerySmsSignLastRangeResponse> querySmsSignLastRange(QuerySmsSignLastRangeRequest request);

    /**
     * @param request the request parameters of QuerySmsSignLastRangeNew  QuerySmsSignLastRangeNewRequest
     * @return QuerySmsSignLastRangeNewResponse
     */
    CompletableFuture<QuerySmsSignLastRangeNewResponse> querySmsSignLastRangeNew(QuerySmsSignLastRangeNewRequest request);

    /**
     * @param request the request parameters of QuerySmsSignList  QuerySmsSignListRequest
     * @return QuerySmsSignListResponse
     */
    CompletableFuture<QuerySmsSignListResponse> querySmsSignList(QuerySmsSignListRequest request);

    /**
     * @param request the request parameters of QuerySmsSignListNew  QuerySmsSignListNewRequest
     * @return QuerySmsSignListNewResponse
     */
    CompletableFuture<QuerySmsSignListNewResponse> querySmsSignListNew(QuerySmsSignListNewRequest request);

    /**
     * @param request the request parameters of QuerySmsSignValid  QuerySmsSignValidRequest
     * @return QuerySmsSignValidResponse
     */
    CompletableFuture<QuerySmsSignValidResponse> querySmsSignValid(QuerySmsSignValidRequest request);

    /**
     * @param request the request parameters of QuerySmsSignValidNew  QuerySmsSignValidNewRequest
     * @return QuerySmsSignValidNewResponse
     */
    CompletableFuture<QuerySmsSignValidNewResponse> querySmsSignValidNew(QuerySmsSignValidNewRequest request);

    /**
     * @param request the request parameters of QuerySmsStatistics  QuerySmsStatisticsRequest
     * @return QuerySmsStatisticsResponse
     */
    CompletableFuture<QuerySmsStatisticsResponse> querySmsStatistics(QuerySmsStatisticsRequest request);

    /**
     * @param request the request parameters of QuerySmsStatisticsByTemplate  QuerySmsStatisticsByTemplateRequest
     * @return QuerySmsStatisticsByTemplateResponse
     */
    CompletableFuture<QuerySmsStatisticsByTemplateResponse> querySmsStatisticsByTemplate(QuerySmsStatisticsByTemplateRequest request);

    /**
     * @param request the request parameters of QuerySmsStatisticsByTemplateNew  QuerySmsStatisticsByTemplateNewRequest
     * @return QuerySmsStatisticsByTemplateNewResponse
     */
    CompletableFuture<QuerySmsStatisticsByTemplateNewResponse> querySmsStatisticsByTemplateNew(QuerySmsStatisticsByTemplateNewRequest request);

    /**
     * @param request the request parameters of QuerySmsStatisticsNew  QuerySmsStatisticsNewRequest
     * @return QuerySmsStatisticsNewResponse
     */
    CompletableFuture<QuerySmsStatisticsNewResponse> querySmsStatisticsNew(QuerySmsStatisticsNewRequest request);

    /**
     * @param request the request parameters of QuerySmsStatisticsUrl  QuerySmsStatisticsUrlRequest
     * @return QuerySmsStatisticsUrlResponse
     */
    CompletableFuture<QuerySmsStatisticsUrlResponse> querySmsStatisticsUrl(QuerySmsStatisticsUrlRequest request);

    /**
     * @param request the request parameters of QuerySmsStatisticsUrlNew  QuerySmsStatisticsUrlNewRequest
     * @return QuerySmsStatisticsUrlNewResponse
     */
    CompletableFuture<QuerySmsStatisticsUrlNewResponse> querySmsStatisticsUrlNew(QuerySmsStatisticsUrlNewRequest request);

    /**
     * @param request the request parameters of QuerySmsStep  QuerySmsStepRequest
     * @return QuerySmsStepResponse
     */
    CompletableFuture<QuerySmsStepResponse> querySmsStep(QuerySmsStepRequest request);

    /**
     * @param request the request parameters of QuerySmsTemplateByCode  QuerySmsTemplateByCodeRequest
     * @return QuerySmsTemplateByCodeResponse
     */
    CompletableFuture<QuerySmsTemplateByCodeResponse> querySmsTemplateByCode(QuerySmsTemplateByCodeRequest request);

    /**
     * @param request the request parameters of QuerySmsTemplateByCodeNew  QuerySmsTemplateByCodeNewRequest
     * @return QuerySmsTemplateByCodeNewResponse
     */
    CompletableFuture<QuerySmsTemplateByCodeNewResponse> querySmsTemplateByCodeNew(QuerySmsTemplateByCodeNewRequest request);

    /**
     * @param request the request parameters of QuerySmsTemplateLastRange  QuerySmsTemplateLastRangeRequest
     * @return QuerySmsTemplateLastRangeResponse
     */
    CompletableFuture<QuerySmsTemplateLastRangeResponse> querySmsTemplateLastRange(QuerySmsTemplateLastRangeRequest request);

    /**
     * @param request the request parameters of QuerySmsTemplateLastRangeNew  QuerySmsTemplateLastRangeNewRequest
     * @return QuerySmsTemplateLastRangeNewResponse
     */
    CompletableFuture<QuerySmsTemplateLastRangeNewResponse> querySmsTemplateLastRangeNew(QuerySmsTemplateLastRangeNewRequest request);

    /**
     * @param request the request parameters of QuerySmsTemplateList  QuerySmsTemplateListRequest
     * @return QuerySmsTemplateListResponse
     */
    CompletableFuture<QuerySmsTemplateListResponse> querySmsTemplateList(QuerySmsTemplateListRequest request);

    /**
     * @param request the request parameters of QuerySmsTemplateListNew  QuerySmsTemplateListNewRequest
     * @return QuerySmsTemplateListNewResponse
     */
    CompletableFuture<QuerySmsTemplateListNewResponse> querySmsTemplateListNew(QuerySmsTemplateListNewRequest request);

    /**
     * @param request the request parameters of QuerySmsUserTags  QuerySmsUserTagsRequest
     * @return QuerySmsUserTagsResponse
     */
    CompletableFuture<QuerySmsUserTagsResponse> querySmsUserTags(QuerySmsUserTagsRequest request);

    /**
     * @param request the request parameters of QuerySmsUserTagsNew  QuerySmsUserTagsNewRequest
     * @return QuerySmsUserTagsNewResponse
     */
    CompletableFuture<QuerySmsUserTagsNewResponse> querySmsUserTagsNew(QuerySmsUserTagsNewRequest request);

    /**
     * @param request the request parameters of QueryStandarTemplateCollections  QueryStandarTemplateCollectionsRequest
     * @return QueryStandarTemplateCollectionsResponse
     */
    CompletableFuture<QueryStandarTemplateCollectionsResponse> queryStandarTemplateCollections(QueryStandarTemplateCollectionsRequest request);

    /**
     * @param request the request parameters of QueryStandarTemplateCollectionsNew  QueryStandarTemplateCollectionsNewRequest
     * @return QueryStandarTemplateCollectionsNewResponse
     */
    CompletableFuture<QueryStandarTemplateCollectionsNewResponse> queryStandarTemplateCollectionsNew(QueryStandarTemplateCollectionsNewRequest request);

    /**
     * @param request the request parameters of QueryStandardProtocol  QueryStandardProtocolRequest
     * @return QueryStandardProtocolResponse
     */
    CompletableFuture<QueryStandardProtocolResponse> queryStandardProtocol(QueryStandardProtocolRequest request);

    /**
     * @param request the request parameters of QueryStandardProtocolListNew  QueryStandardProtocolListNewRequest
     * @return QueryStandardProtocolListNewResponse
     */
    CompletableFuture<QueryStandardProtocolListNewResponse> queryStandardProtocolListNew(QueryStandardProtocolListNewRequest request);

    /**
     * @param request the request parameters of QueryTagResources  QueryTagResourcesRequest
     * @return QueryTagResourcesResponse
     */
    CompletableFuture<QueryTagResourcesResponse> queryTagResources(QueryTagResourcesRequest request);

    /**
     * @param request the request parameters of QueryTagResourcesNew  QueryTagResourcesNewRequest
     * @return QueryTagResourcesNewResponse
     */
    CompletableFuture<QueryTagResourcesNewResponse> queryTagResourcesNew(QueryTagResourcesNewRequest request);

    /**
     * @param request the request parameters of QueryTmpEffectReportData  QueryTmpEffectReportDataRequest
     * @return QueryTmpEffectReportDataResponse
     */
    CompletableFuture<QueryTmpEffectReportDataResponse> queryTmpEffectReportData(QueryTmpEffectReportDataRequest request);

    /**
     * @param request the request parameters of QueryTmpEffectReportDayData  QueryTmpEffectReportDayDataRequest
     * @return QueryTmpEffectReportDayDataResponse
     */
    CompletableFuture<QueryTmpEffectReportDayDataResponse> queryTmpEffectReportDayData(QueryTmpEffectReportDayDataRequest request);

    /**
     * @param request the request parameters of QueryUsertagExistence  QueryUsertagExistenceRequest
     * @return QueryUsertagExistenceResponse
     */
    CompletableFuture<QueryUsertagExistenceResponse> queryUsertagExistence(QueryUsertagExistenceRequest request);

    /**
     * @param request the request parameters of QueryWarningThreshold  QueryWarningThresholdRequest
     * @return QueryWarningThresholdResponse
     */
    CompletableFuture<QueryWarningThresholdResponse> queryWarningThreshold(QueryWarningThresholdRequest request);

    /**
     * @param request the request parameters of QueryWarningThresholdNew  QueryWarningThresholdNewRequest
     * @return QueryWarningThresholdNewResponse
     */
    CompletableFuture<QueryWarningThresholdNewResponse> queryWarningThresholdNew(QueryWarningThresholdNewRequest request);

    /**
     * @param request the request parameters of QueryWorkOrdAuditListNew  QueryWorkOrdAuditListNewRequest
     * @return QueryWorkOrdAuditListNewResponse
     */
    CompletableFuture<QueryWorkOrdAuditListNewResponse> queryWorkOrdAuditListNew(QueryWorkOrdAuditListNewRequest request);

    /**
     * @param request the request parameters of SaveContactsNew  SaveContactsNewRequest
     * @return SaveContactsNewResponse
     */
    CompletableFuture<SaveContactsNewResponse> saveContactsNew(SaveContactsNewRequest request);

    /**
     * @param request the request parameters of SaveLearningStatusNew  SaveLearningStatusNewRequest
     * @return SaveLearningStatusNewResponse
     */
    CompletableFuture<SaveLearningStatusNewResponse> saveLearningStatusNew(SaveLearningStatusNewRequest request);

    /**
     * @param request the request parameters of SelectTagResource  SelectTagResourceRequest
     * @return SelectTagResourceResponse
     */
    CompletableFuture<SelectTagResourceResponse> selectTagResource(SelectTagResourceRequest request);

    /**
     * @param request the request parameters of SelectTagResourceNew  SelectTagResourceNewRequest
     * @return SelectTagResourceNewResponse
     */
    CompletableFuture<SelectTagResourceNewResponse> selectTagResourceNew(SelectTagResourceNewRequest request);

    /**
     * @param request the request parameters of SendSmsTest  SendSmsTestRequest
     * @return SendSmsTestResponse
     */
    CompletableFuture<SendSmsTestResponse> sendSmsTest(SendSmsTestRequest request);

    /**
     * @param request the request parameters of SendSmsTestNew  SendSmsTestNewRequest
     * @return SendSmsTestNewResponse
     */
    CompletableFuture<SendSmsTestNewResponse> sendSmsTestNew(SendSmsTestNewRequest request);

    /**
     * @param request the request parameters of SendVerification  SendVerificationRequest
     * @return SendVerificationResponse
     */
    CompletableFuture<SendVerificationResponse> sendVerification(SendVerificationRequest request);

    /**
     * @param request the request parameters of SendVerificationNew  SendVerificationNewRequest
     * @return SendVerificationNewResponse
     */
    CompletableFuture<SendVerificationNewResponse> sendVerificationNew(SendVerificationNewRequest request);

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @param request the request parameters of TagResourcesNew  TagResourcesNewRequest
     * @return TagResourcesNewResponse
     */
    CompletableFuture<TagResourcesNewResponse> tagResourcesNew(TagResourcesNewRequest request);

    /**
     * @param request the request parameters of TagResourcesSystemTags  TagResourcesSystemTagsRequest
     * @return TagResourcesSystemTagsResponse
     */
    CompletableFuture<TagResourcesSystemTagsResponse> tagResourcesSystemTags(TagResourcesSystemTagsRequest request);

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * @param request the request parameters of UntagResourcesNew  UntagResourcesNewRequest
     * @return UntagResourcesNewResponse
     */
    CompletableFuture<UntagResourcesNewResponse> untagResourcesNew(UntagResourcesNewRequest request);

    /**
     * @param request the request parameters of UntagResourcesSystemTags  UntagResourcesSystemTagsRequest
     * @return UntagResourcesSystemTagsResponse
     */
    CompletableFuture<UntagResourcesSystemTagsResponse> untagResourcesSystemTags(UntagResourcesSystemTagsRequest request);

    /**
     * @param request the request parameters of UpdateIpWhiteListNew  UpdateIpWhiteListNewRequest
     * @return UpdateIpWhiteListNewResponse
     */
    CompletableFuture<UpdateIpWhiteListNewResponse> updateIpWhiteListNew(UpdateIpWhiteListNewRequest request);

    /**
     * @param request the request parameters of UpdatePartnerTemplateNew  UpdatePartnerTemplateNewRequest
     * @return UpdatePartnerTemplateNewResponse
     */
    CompletableFuture<UpdatePartnerTemplateNewResponse> updatePartnerTemplateNew(UpdatePartnerTemplateNewRequest request);

    /**
     * @param request the request parameters of UpdateSlsStatusNew  UpdateSlsStatusNewRequest
     * @return UpdateSlsStatusNewResponse
     */
    CompletableFuture<UpdateSlsStatusNewResponse> updateSlsStatusNew(UpdateSlsStatusNewRequest request);

    /**
     * @param request the request parameters of UploadCardRes  UploadCardResRequest
     * @return UploadCardResResponse
     */
    CompletableFuture<UploadCardResResponse> uploadCardRes(UploadCardResRequest request);

    /**
     * @param request the request parameters of UploadCardResWithDyncParam  UploadCardResWithDyncParamRequest
     * @return UploadCardResWithDyncParamResponse
     */
    CompletableFuture<UploadCardResWithDyncParamResponse> uploadCardResWithDyncParam(UploadCardResWithDyncParamRequest request);

    /**
     * @param request the request parameters of ValidatYunSmsId  ValidatYunSmsIdRequest
     * @return ValidatYunSmsIdResponse
     */
    CompletableFuture<ValidatYunSmsIdResponse> validatYunSmsId(ValidatYunSmsIdRequest request);

}
