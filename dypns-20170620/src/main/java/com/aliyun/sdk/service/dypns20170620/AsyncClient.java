// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypns20170620;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dypns20170620.models.*;
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
     * @param request the request parameters of ConfigVerifySceneAppInfo  ConfigVerifySceneAppInfoRequest
     * @return ConfigVerifySceneAppInfoResponse
     */
    CompletableFuture<ConfigVerifySceneAppInfoResponse> configVerifySceneAppInfo(ConfigVerifySceneAppInfoRequest request);

    /**
     * @param request the request parameters of CopyScheme  CopySchemeRequest
     * @return CopySchemeResponse
     */
    CompletableFuture<CopySchemeResponse> copyScheme(CopySchemeRequest request);

    /**
     * @param request the request parameters of CopyVerifyScheme  CopyVerifySchemeRequest
     * @return CopyVerifySchemeResponse
     */
    CompletableFuture<CopyVerifySchemeResponse> copyVerifyScheme(CopyVerifySchemeRequest request);

    /**
     * @param request the request parameters of CreateDypnsSmsVerifyCallBackTest  CreateDypnsSmsVerifyCallBackTestRequest
     * @return CreateDypnsSmsVerifyCallBackTestResponse
     */
    CompletableFuture<CreateDypnsSmsVerifyCallBackTestResponse> createDypnsSmsVerifyCallBackTest(CreateDypnsSmsVerifyCallBackTestRequest request);

    /**
     * @param request the request parameters of CreateDypnsSmsVerifyMessageCallBack  CreateDypnsSmsVerifyMessageCallBackRequest
     * @return CreateDypnsSmsVerifyMessageCallBackResponse
     */
    CompletableFuture<CreateDypnsSmsVerifyMessageCallBackResponse> createDypnsSmsVerifyMessageCallBack(CreateDypnsSmsVerifyMessageCallBackRequest request);

    /**
     * @param request the request parameters of CreateDypnsSmsVerifyMessageQueue  CreateDypnsSmsVerifyMessageQueueRequest
     * @return CreateDypnsSmsVerifyMessageQueueResponse
     */
    CompletableFuture<CreateDypnsSmsVerifyMessageQueueResponse> createDypnsSmsVerifyMessageQueue(CreateDypnsSmsVerifyMessageQueueRequest request);

    /**
     * @param request the request parameters of CreateFileByBiz  CreateFileByBizRequest
     * @return CreateFileByBizResponse
     */
    CompletableFuture<CreateFileByBizResponse> createFileByBiz(CreateFileByBizRequest request);

    /**
     * @param request the request parameters of CreateGateVerifyExportLog  CreateGateVerifyExportLogRequest
     * @return CreateGateVerifyExportLogResponse
     */
    CompletableFuture<CreateGateVerifyExportLogResponse> createGateVerifyExportLog(CreateGateVerifyExportLogRequest request);

    /**
     * @param request the request parameters of CreateGraphicAuthSchemeConfig  CreateGraphicAuthSchemeConfigRequest
     * @return CreateGraphicAuthSchemeConfigResponse
     */
    CompletableFuture<CreateGraphicAuthSchemeConfigResponse> createGraphicAuthSchemeConfig(CreateGraphicAuthSchemeConfigRequest request);

    /**
     * @param request the request parameters of CreateProduct  CreateProductRequest
     * @return CreateProductResponse
     */
    CompletableFuture<CreateProductResponse> createProduct(CreateProductRequest request);

    /**
     * @param request the request parameters of CreateSchemeConfig  CreateSchemeConfigRequest
     * @return CreateSchemeConfigResponse
     */
    CompletableFuture<CreateSchemeConfigResponse> createSchemeConfig(CreateSchemeConfigRequest request);

    /**
     * @param request the request parameters of CreateSmsSign  CreateSmsSignRequest
     * @return CreateSmsSignResponse
     */
    CompletableFuture<CreateSmsSignResponse> createSmsSign(CreateSmsSignRequest request);

    /**
     * @param request the request parameters of CreateSmsTemplate  CreateSmsTemplateRequest
     * @return CreateSmsTemplateResponse
     */
    CompletableFuture<CreateSmsTemplateResponse> createSmsTemplate(CreateSmsTemplateRequest request);

    /**
     * @param request the request parameters of CreateSmsVerifyStatisticRecordsExportTask  CreateSmsVerifyStatisticRecordsExportTaskRequest
     * @return CreateSmsVerifyStatisticRecordsExportTaskResponse
     */
    CompletableFuture<CreateSmsVerifyStatisticRecordsExportTaskResponse> createSmsVerifyStatisticRecordsExportTask(CreateSmsVerifyStatisticRecordsExportTaskRequest request);

    /**
     * @param request the request parameters of CreateVerifyScheme  CreateVerifySchemeRequest
     * @return CreateVerifySchemeResponse
     */
    CompletableFuture<CreateVerifySchemeResponse> createVerifyScheme(CreateVerifySchemeRequest request);

    /**
     * @param request the request parameters of CreatetVerifySmsExportTask  CreatetVerifySmsExportTaskRequest
     * @return CreatetVerifySmsExportTaskResponse
     */
    CompletableFuture<CreatetVerifySmsExportTaskResponse> createtVerifySmsExportTask(CreatetVerifySmsExportTaskRequest request);

    /**
     * @param request the request parameters of DeleteScene  DeleteSceneRequest
     * @return DeleteSceneResponse
     */
    CompletableFuture<DeleteSceneResponse> deleteScene(DeleteSceneRequest request);

    /**
     * @param request the request parameters of DeleteScheme  DeleteSchemeRequest
     * @return DeleteSchemeResponse
     */
    CompletableFuture<DeleteSchemeResponse> deleteScheme(DeleteSchemeRequest request);

    /**
     * @param request the request parameters of GetDownLoadFileUrl  GetDownLoadFileUrlRequest
     * @return GetDownLoadFileUrlResponse
     */
    CompletableFuture<GetDownLoadFileUrlResponse> getDownLoadFileUrl(GetDownLoadFileUrlRequest request);

    /**
     * @param request the request parameters of GetEnterpriseInfo  GetEnterpriseInfoRequest
     * @return GetEnterpriseInfoResponse
     */
    CompletableFuture<GetEnterpriseInfoResponse> getEnterpriseInfo(GetEnterpriseInfoRequest request);

    /**
     * @param request the request parameters of GetOpenSubProductStatus  GetOpenSubProductStatusRequest
     * @return GetOpenSubProductStatusResponse
     */
    CompletableFuture<GetOpenSubProductStatusResponse> getOpenSubProductStatus(GetOpenSubProductStatusRequest request);

    /**
     * @param request the request parameters of GetOssUploadForEnterprise  GetOssUploadForEnterpriseRequest
     * @return GetOssUploadForEnterpriseResponse
     */
    CompletableFuture<GetOssUploadForEnterpriseResponse> getOssUploadForEnterprise(GetOssUploadForEnterpriseRequest request);

    /**
     * @param request the request parameters of GetOssUploadSign  GetOssUploadSignRequest
     * @return GetOssUploadSignResponse
     */
    CompletableFuture<GetOssUploadSignResponse> getOssUploadSign(GetOssUploadSignRequest request);

    /**
     * @param request the request parameters of GetScheme  GetSchemeRequest
     * @return GetSchemeResponse
     */
    CompletableFuture<GetSchemeResponse> getScheme(GetSchemeRequest request);

    /**
     * @param request the request parameters of GetSmsCodeLimitConfig  GetSmsCodeLimitConfigRequest
     * @return GetSmsCodeLimitConfigResponse
     */
    CompletableFuture<GetSmsCodeLimitConfigResponse> getSmsCodeLimitConfig(GetSmsCodeLimitConfigRequest request);

    /**
     * @param request the request parameters of GetSmsSign  GetSmsSignRequest
     * @return GetSmsSignResponse
     */
    CompletableFuture<GetSmsSignResponse> getSmsSign(GetSmsSignRequest request);

    /**
     * @param request the request parameters of ListAuditPassEnterpriseInfo  ListAuditPassEnterpriseInfoRequest
     * @return ListAuditPassEnterpriseInfoResponse
     */
    CompletableFuture<ListAuditPassEnterpriseInfoResponse> listAuditPassEnterpriseInfo(ListAuditPassEnterpriseInfoRequest request);

    /**
     * @param request the request parameters of ListCertificate  ListCertificateRequest
     * @return ListCertificateResponse
     */
    CompletableFuture<ListCertificateResponse> listCertificate(ListCertificateRequest request);

    /**
     * @param request the request parameters of ListEnterpriseInfo  ListEnterpriseInfoRequest
     * @return ListEnterpriseInfoResponse
     */
    CompletableFuture<ListEnterpriseInfoResponse> listEnterpriseInfo(ListEnterpriseInfoRequest request);

    /**
     * @param request the request parameters of ListScheme  ListSchemeRequest
     * @return ListSchemeResponse
     */
    CompletableFuture<ListSchemeResponse> listScheme(ListSchemeRequest request);

    /**
     * @param request the request parameters of ListSmsSign  ListSmsSignRequest
     * @return ListSmsSignResponse
     */
    CompletableFuture<ListSmsSignResponse> listSmsSign(ListSmsSignRequest request);

    /**
     * @param request the request parameters of ListSmsTemplate  ListSmsTemplateRequest
     * @return ListSmsTemplateResponse
     */
    CompletableFuture<ListSmsTemplateResponse> listSmsTemplate(ListSmsTemplateRequest request);

    /**
     * @param request the request parameters of OpenCommonProduct  OpenCommonProductRequest
     * @return OpenCommonProductResponse
     */
    CompletableFuture<OpenCommonProductResponse> openCommonProduct(OpenCommonProductRequest request);

    /**
     * @param request the request parameters of QueryCommonBilling  QueryCommonBillingRequest
     * @return QueryCommonBillingResponse
     */
    CompletableFuture<QueryCommonBillingResponse> queryCommonBilling(QueryCommonBillingRequest request);

    /**
     * @param request the request parameters of QueryCommonCustInfo  QueryCommonCustInfoRequest
     * @return QueryCommonCustInfoResponse
     */
    CompletableFuture<QueryCommonCustInfoResponse> queryCommonCustInfo(QueryCommonCustInfoRequest request);

    /**
     * @param request the request parameters of QueryCommonStatistic  QueryCommonStatisticRequest
     * @return QueryCommonStatisticResponse
     */
    CompletableFuture<QueryCommonStatisticResponse> queryCommonStatistic(QueryCommonStatisticRequest request);

    /**
     * @param request the request parameters of QueryCommonStatisticPreview  QueryCommonStatisticPreviewRequest
     * @return QueryCommonStatisticPreviewResponse
     */
    CompletableFuture<QueryCommonStatisticPreviewResponse> queryCommonStatisticPreview(QueryCommonStatisticPreviewRequest request);

    /**
     * @param request the request parameters of QueryDayuMigrateStatus  QueryDayuMigrateStatusRequest
     * @return QueryDayuMigrateStatusResponse
     */
    CompletableFuture<QueryDayuMigrateStatusResponse> queryDayuMigrateStatus(QueryDayuMigrateStatusRequest request);

    /**
     * @param request the request parameters of QueryDictDataItem  QueryDictDataItemRequest
     * @return QueryDictDataItemResponse
     */
    CompletableFuture<QueryDictDataItemResponse> queryDictDataItem(QueryDictDataItemRequest request);

    /**
     * @param request the request parameters of QueryGateVerifyBilling  QueryGateVerifyBillingRequest
     * @return QueryGateVerifyBillingResponse
     */
    CompletableFuture<QueryGateVerifyBillingResponse> queryGateVerifyBilling(QueryGateVerifyBillingRequest request);

    /**
     * @param request the request parameters of QueryGateVerifyRecordList  QueryGateVerifyRecordListRequest
     * @return QueryGateVerifyRecordListResponse
     */
    CompletableFuture<QueryGateVerifyRecordListResponse> queryGateVerifyRecordList(QueryGateVerifyRecordListRequest request);

    /**
     * @param request the request parameters of QueryGateVerifyStatistic  QueryGateVerifyStatisticRequest
     * @return QueryGateVerifyStatisticResponse
     */
    CompletableFuture<QueryGateVerifyStatisticResponse> queryGateVerifyStatistic(QueryGateVerifyStatisticRequest request);

    /**
     * @param request the request parameters of QueryPnsConfig  QueryPnsConfigRequest
     * @return QueryPnsConfigResponse
     */
    CompletableFuture<QueryPnsConfigResponse> queryPnsConfig(QueryPnsConfigRequest request);

    /**
     * @param request the request parameters of QueryPnsPackageDetail  QueryPnsPackageDetailRequest
     * @return QueryPnsPackageDetailResponse
     */
    CompletableFuture<QueryPnsPackageDetailResponse> queryPnsPackageDetail(QueryPnsPackageDetailRequest request);

    /**
     * @param request the request parameters of QueryPnsPackageList  QueryPnsPackageListRequest
     * @return QueryPnsPackageListResponse
     */
    CompletableFuture<QueryPnsPackageListResponse> queryPnsPackageList(QueryPnsPackageListRequest request);

    /**
     * @param request the request parameters of QueryPnsPackageStatistics  QueryPnsPackageStatisticsRequest
     * @return QueryPnsPackageStatisticsResponse
     */
    CompletableFuture<QueryPnsPackageStatisticsResponse> queryPnsPackageStatistics(QueryPnsPackageStatisticsRequest request);

    /**
     * @param request the request parameters of QuerySceneList  QuerySceneListRequest
     * @return QuerySceneListResponse
     */
    CompletableFuture<QuerySceneListResponse> querySceneList(QuerySceneListRequest request);

    /**
     * @param request the request parameters of QuerySdkVersion  QuerySdkVersionRequest
     * @return QuerySdkVersionResponse
     */
    CompletableFuture<QuerySdkVersionResponse> querySdkVersion(QuerySdkVersionRequest request);

    /**
     * @param request the request parameters of QueryTagStatus  QueryTagStatusRequest
     * @return QueryTagStatusResponse
     */
    CompletableFuture<QueryTagStatusResponse> queryTagStatus(QueryTagStatusRequest request);

    /**
     * @param request the request parameters of RemoveGateVerifyExportLog  RemoveGateVerifyExportLogRequest
     * @return RemoveGateVerifyExportLogResponse
     */
    CompletableFuture<RemoveGateVerifyExportLogResponse> removeGateVerifyExportLog(RemoveGateVerifyExportLogRequest request);

    /**
     * @param request the request parameters of SubmitEnterpriseInfo  SubmitEnterpriseInfoRequest
     * @return SubmitEnterpriseInfoResponse
     */
    CompletableFuture<SubmitEnterpriseInfoResponse> submitEnterpriseInfo(SubmitEnterpriseInfoRequest request);

    /**
     * @param request the request parameters of UpdateExportLogState  UpdateExportLogStateRequest
     * @return UpdateExportLogStateResponse
     */
    CompletableFuture<UpdateExportLogStateResponse> updateExportLogState(UpdateExportLogStateRequest request);

    /**
     * @param request the request parameters of UpdateSmsCodeLimitConfig  UpdateSmsCodeLimitConfigRequest
     * @return UpdateSmsCodeLimitConfigResponse
     */
    CompletableFuture<UpdateSmsCodeLimitConfigResponse> updateSmsCodeLimitConfig(UpdateSmsCodeLimitConfigRequest request);

}
