// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.green20220926.models.*;
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
     * @param request the request parameters of AddAnswerSample  AddAnswerSampleRequest
     * @return AddAnswerSampleResponse
     */
    CompletableFuture<AddAnswerSampleResponse> addAnswerSample(AddAnswerSampleRequest request);

    /**
     * @param request the request parameters of AddImageLib  AddImageLibRequest
     * @return AddImageLibResponse
     */
    CompletableFuture<AddImageLibResponse> addImageLib(AddImageLibRequest request);

    /**
     * @param request the request parameters of AddImages2Lib  AddImages2LibRequest
     * @return AddImages2LibResponse
     */
    CompletableFuture<AddImages2LibResponse> addImages2Lib(AddImages2LibRequest request);

    /**
     * @param request the request parameters of AddKeywordLib  AddKeywordLibRequest
     * @return AddKeywordLibResponse
     */
    CompletableFuture<AddKeywordLibResponse> addKeywordLib(AddKeywordLibRequest request);

    /**
     * @param request the request parameters of AddKeywords  AddKeywordsRequest
     * @return AddKeywordsResponse
     */
    CompletableFuture<AddKeywordsResponse> addKeywords(AddKeywordsRequest request);

    /**
     * @param request the request parameters of AddKeywordsToLib  AddKeywordsToLibRequest
     * @return AddKeywordsToLibResponse
     */
    CompletableFuture<AddKeywordsToLibResponse> addKeywordsToLib(AddKeywordsToLibRequest request);

    /**
     * @param request the request parameters of CancelStockOssCheckTask  CancelStockOssCheckTaskRequest
     * @return CancelStockOssCheckTaskResponse
     */
    CompletableFuture<CancelStockOssCheckTaskResponse> cancelStockOssCheckTask(CancelStockOssCheckTaskRequest request);

    /**
     * @param request the request parameters of CopyServiceConfig  CopyServiceConfigRequest
     * @return CopyServiceConfigResponse
     */
    CompletableFuture<CopyServiceConfigResponse> copyServiceConfig(CopyServiceConfigRequest request);

    /**
     * @param request the request parameters of CreatStockOssCheckTask  CreatStockOssCheckTaskRequest
     * @return CreatStockOssCheckTaskResponse
     */
    CompletableFuture<CreatStockOssCheckTaskResponse> creatStockOssCheckTask(CreatStockOssCheckTaskRequest request);

    /**
     * @param request the request parameters of CreateAnswerLib  CreateAnswerLibRequest
     * @return CreateAnswerLibResponse
     */
    CompletableFuture<CreateAnswerLibResponse> createAnswerLib(CreateAnswerLibRequest request);

    /**
     * @param request the request parameters of CreateCallback  CreateCallbackRequest
     * @return CreateCallbackResponse
     */
    CompletableFuture<CreateCallbackResponse> createCallback(CreateCallbackRequest request);

    /**
     * @param request the request parameters of CreatePreCheck  CreatePreCheckRequest
     * @return CreatePreCheckResponse
     */
    CompletableFuture<CreatePreCheckResponse> createPreCheck(CreatePreCheckRequest request);

    /**
     * @param request the request parameters of DeleteAnswerLib  DeleteAnswerLibRequest
     * @return DeleteAnswerLibResponse
     */
    CompletableFuture<DeleteAnswerLibResponse> deleteAnswerLib(DeleteAnswerLibRequest request);

    /**
     * @param request the request parameters of DeleteAnswerSample  DeleteAnswerSampleRequest
     * @return DeleteAnswerSampleResponse
     */
    CompletableFuture<DeleteAnswerSampleResponse> deleteAnswerSample(DeleteAnswerSampleRequest request);

    /**
     * @param request the request parameters of DeleteCallback  DeleteCallbackRequest
     * @return DeleteCallbackResponse
     */
    CompletableFuture<DeleteCallbackResponse> deleteCallback(DeleteCallbackRequest request);

    /**
     * @param request the request parameters of DeleteFeatureConfig  DeleteFeatureConfigRequest
     * @return DeleteFeatureConfigResponse
     */
    CompletableFuture<DeleteFeatureConfigResponse> deleteFeatureConfig(DeleteFeatureConfigRequest request);

    /**
     * @param request the request parameters of DeleteImagesFromLib  DeleteImagesFromLibRequest
     * @return DeleteImagesFromLibResponse
     */
    CompletableFuture<DeleteImagesFromLibResponse> deleteImagesFromLib(DeleteImagesFromLibRequest request);

    /**
     * @param request the request parameters of DeleteKeyword  DeleteKeywordRequest
     * @return DeleteKeywordResponse
     */
    CompletableFuture<DeleteKeywordResponse> deleteKeyword(DeleteKeywordRequest request);

    /**
     * @param request the request parameters of DeleteKeywordLib  DeleteKeywordLibRequest
     * @return DeleteKeywordLibResponse
     */
    CompletableFuture<DeleteKeywordLibResponse> deleteKeywordLib(DeleteKeywordLibRequest request);

    /**
     * @param request the request parameters of ExportAnswerSample  ExportAnswerSampleRequest
     * @return ExportAnswerSampleResponse
     */
    CompletableFuture<ExportAnswerSampleResponse> exportAnswerSample(ExportAnswerSampleRequest request);

    /**
     * @param request the request parameters of ExportCipStats  ExportCipStatsRequest
     * @return ExportCipStatsResponse
     */
    CompletableFuture<ExportCipStatsResponse> exportCipStats(ExportCipStatsRequest request);

    /**
     * @param request the request parameters of ExportKeyword  ExportKeywordRequest
     * @return ExportKeywordResponse
     */
    CompletableFuture<ExportKeywordResponse> exportKeyword(ExportKeywordRequest request);

    /**
     * @param request the request parameters of ExportOssCheckStat  ExportOssCheckStatRequest
     * @return ExportOssCheckStatResponse
     */
    CompletableFuture<ExportOssCheckStatResponse> exportOssCheckStat(ExportOssCheckStatRequest request);

    /**
     * @param request the request parameters of ExportResult  ExportResultRequest
     * @return ExportResultResponse
     */
    CompletableFuture<ExportResultResponse> exportResult(ExportResultRequest request);

    /**
     * @param request the request parameters of ExportScanResult  ExportScanResultRequest
     * @return ExportScanResultResponse
     */
    CompletableFuture<ExportScanResultResponse> exportScanResult(ExportScanResultRequest request);

    /**
     * @param request the request parameters of ExportTextScanResult  ExportTextScanResultRequest
     * @return ExportTextScanResultResponse
     */
    CompletableFuture<ExportTextScanResultResponse> exportTextScanResult(ExportTextScanResultRequest request);

    /**
     * @param request the request parameters of GetAnswerImportProgress  GetAnswerImportProgressRequest
     * @return GetAnswerImportProgressResponse
     */
    CompletableFuture<GetAnswerImportProgressResponse> getAnswerImportProgress(GetAnswerImportProgressRequest request);

    /**
     * @param request the request parameters of GetBackupBucketsList  GetBackupBucketsListRequest
     * @return GetBackupBucketsListResponse
     */
    CompletableFuture<GetBackupBucketsListResponse> getBackupBucketsList(GetBackupBucketsListRequest request);

    /**
     * @param request the request parameters of GetBackupConfig  GetBackupConfigRequest
     * @return GetBackupConfigResponse
     */
    CompletableFuture<GetBackupConfigResponse> getBackupConfig(GetBackupConfigRequest request);

    /**
     * @param request the request parameters of GetBackupStatus  GetBackupStatusRequest
     * @return GetBackupStatusResponse
     */
    CompletableFuture<GetBackupStatusResponse> getBackupStatus(GetBackupStatusRequest request);

    /**
     * @param request the request parameters of GetBucketsList  GetBucketsListRequest
     * @return GetBucketsListResponse
     */
    CompletableFuture<GetBucketsListResponse> getBucketsList(GetBucketsListRequest request);

    /**
     * @param request the request parameters of GetCipStats  GetCipStatsRequest
     * @return GetCipStatsResponse
     */
    CompletableFuture<GetCipStatsResponse> getCipStats(GetCipStatsRequest request);

    /**
     * @param request the request parameters of GetExecuteTime  GetExecuteTimeRequest
     * @return GetExecuteTimeResponse
     */
    CompletableFuture<GetExecuteTimeResponse> getExecuteTime(GetExecuteTimeRequest request);

    /**
     * @param request the request parameters of GetFeatureConfig  GetFeatureConfigRequest
     * @return GetFeatureConfigResponse
     */
    CompletableFuture<GetFeatureConfigResponse> getFeatureConfig(GetFeatureConfigRequest request);

    /**
     * @param request the request parameters of GetImageSceneLabelConf  GetImageSceneLabelConfRequest
     * @return GetImageSceneLabelConfResponse
     */
    CompletableFuture<GetImageSceneLabelConfResponse> getImageSceneLabelConf(GetImageSceneLabelConfRequest request);

    /**
     * @param request the request parameters of GetImageSceneLabelListConf  GetImageSceneLabelListConfRequest
     * @return GetImageSceneLabelListConfResponse
     */
    CompletableFuture<GetImageSceneLabelListConfResponse> getImageSceneLabelListConf(GetImageSceneLabelListConfRequest request);

    /**
     * @param request the request parameters of GetJobNameList  GetJobNameListRequest
     * @return GetJobNameListResponse
     */
    CompletableFuture<GetJobNameListResponse> getJobNameList(GetJobNameListRequest request);

    /**
     * @param request the request parameters of GetKeywordImportResult  GetKeywordImportResultRequest
     * @return GetKeywordImportResultResponse
     */
    CompletableFuture<GetKeywordImportResultResponse> getKeywordImportResult(GetKeywordImportResultRequest request);

    /**
     * @param request the request parameters of GetKeywordLib  GetKeywordLibRequest
     * @return GetKeywordLibResponse
     */
    CompletableFuture<GetKeywordLibResponse> getKeywordLib(GetKeywordLibRequest request);

    /**
     * @param request the request parameters of GetOssCheckStat  GetOssCheckStatRequest
     * @return GetOssCheckStatResponse
     */
    CompletableFuture<GetOssCheckStatResponse> getOssCheckStat(GetOssCheckStatRequest request);

    /**
     * @param request the request parameters of GetOssCheckStatus  GetOssCheckStatusRequest
     * @return GetOssCheckStatusResponse
     */
    CompletableFuture<GetOssCheckStatusResponse> getOssCheckStatus(GetOssCheckStatusRequest request);

    /**
     * @param request the request parameters of GetScanNum  GetScanNumRequest
     * @return GetScanNumResponse
     */
    CompletableFuture<GetScanNumResponse> getScanNum(GetScanNumRequest request);

    /**
     * @param request the request parameters of GetScanResult  GetScanResultRequest
     * @return GetScanResultResponse
     */
    CompletableFuture<GetScanResultResponse> getScanResult(GetScanResultRequest request);

    /**
     * @param request the request parameters of GetServiceConf  GetServiceConfRequest
     * @return GetServiceConfResponse
     */
    CompletableFuture<GetServiceConfResponse> getServiceConf(GetServiceConfRequest request);

    /**
     * @param request the request parameters of GetServiceConfig  GetServiceConfigRequest
     * @return GetServiceConfigResponse
     */
    CompletableFuture<GetServiceConfigResponse> getServiceConfig(GetServiceConfigRequest request);

    /**
     * @param request the request parameters of GetServiceLabelConfig  GetServiceLabelConfigRequest
     * @return GetServiceLabelConfigResponse
     */
    CompletableFuture<GetServiceLabelConfigResponse> getServiceLabelConfig(GetServiceLabelConfigRequest request);

    /**
     * @param request the request parameters of GetStockOssCheckTasksList  GetStockOssCheckTasksListRequest
     * @return GetStockOssCheckTasksListResponse
     */
    CompletableFuture<GetStockOssCheckTasksListResponse> getStockOssCheckTasksList(GetStockOssCheckTasksListRequest request);

    /**
     * @param request the request parameters of GetTextScanResult  GetTextScanResultRequest
     * @return GetTextScanResultResponse
     */
    CompletableFuture<GetTextScanResultResponse> getTextScanResult(GetTextScanResultRequest request);

    /**
     * @param request the request parameters of GetUploadInfo  GetUploadInfoRequest
     * @return GetUploadInfoResponse
     */
    CompletableFuture<GetUploadInfoResponse> getUploadInfo(GetUploadInfoRequest request);

    /**
     * @param request the request parameters of GetUserBuyStatus  GetUserBuyStatusRequest
     * @return GetUserBuyStatusResponse
     */
    CompletableFuture<GetUserBuyStatusResponse> getUserBuyStatus(GetUserBuyStatusRequest request);

    /**
     * @param request the request parameters of ListAnswerLib  ListAnswerLibRequest
     * @return ListAnswerLibResponse
     */
    CompletableFuture<ListAnswerLibResponse> listAnswerLib(ListAnswerLibRequest request);

    /**
     * @param request the request parameters of ListCallback  ListCallbackRequest
     * @return ListCallbackResponse
     */
    CompletableFuture<ListCallbackResponse> listCallback(ListCallbackRequest request);

    /**
     * @param request the request parameters of ListImageLib  ListImageLibRequest
     * @return ListImageLibResponse
     */
    CompletableFuture<ListImageLibResponse> listImageLib(ListImageLibRequest request);

    /**
     * @param request the request parameters of ListImagesFromLib  ListImagesFromLibRequest
     * @return ListImagesFromLibResponse
     */
    CompletableFuture<ListImagesFromLibResponse> listImagesFromLib(ListImagesFromLibRequest request);

    /**
     * @param request the request parameters of ListKeywordLibs  ListKeywordLibsRequest
     * @return ListKeywordLibsResponse
     */
    CompletableFuture<ListKeywordLibsResponse> listKeywordLibs(ListKeywordLibsRequest request);

    /**
     * @param request the request parameters of ListKeywords  ListKeywordsRequest
     * @return ListKeywordsResponse
     */
    CompletableFuture<ListKeywordsResponse> listKeywords(ListKeywordsRequest request);

    /**
     * @param request the request parameters of ListOssCheckResult  ListOssCheckResultRequest
     * @return ListOssCheckResultResponse
     */
    CompletableFuture<ListOssCheckResultResponse> listOssCheckResult(ListOssCheckResultRequest request);

    /**
     * @param request the request parameters of ListServiceConfigs  ListServiceConfigsRequest
     * @return ListServiceConfigsResponse
     */
    CompletableFuture<ListServiceConfigsResponse> listServiceConfigs(ListServiceConfigsRequest request);

    /**
     * @param request the request parameters of ModifyAnswerLib  ModifyAnswerLibRequest
     * @return ModifyAnswerLibResponse
     */
    CompletableFuture<ModifyAnswerLibResponse> modifyAnswerLib(ModifyAnswerLibRequest request);

    /**
     * @param request the request parameters of ModifyCallback  ModifyCallbackRequest
     * @return ModifyCallbackResponse
     */
    CompletableFuture<ModifyCallbackResponse> modifyCallback(ModifyCallbackRequest request);

    /**
     * @param request the request parameters of ModifyFeatureConfig  ModifyFeatureConfigRequest
     * @return ModifyFeatureConfigResponse
     */
    CompletableFuture<ModifyFeatureConfigResponse> modifyFeatureConfig(ModifyFeatureConfigRequest request);

    /**
     * @param request the request parameters of ModifyServiceInfo  ModifyServiceInfoRequest
     * @return ModifyServiceInfoResponse
     */
    CompletableFuture<ModifyServiceInfoResponse> modifyServiceInfo(ModifyServiceInfoRequest request);

    /**
     * @param request the request parameters of QueryAnswerSampleByPage  QueryAnswerSampleByPageRequest
     * @return QueryAnswerSampleByPageResponse
     */
    CompletableFuture<QueryAnswerSampleByPageResponse> queryAnswerSampleByPage(QueryAnswerSampleByPageRequest request);

    /**
     * @param request the request parameters of QueryCallback  QueryCallbackRequest
     * @return QueryCallbackResponse
     */
    CompletableFuture<QueryCallbackResponse> queryCallback(QueryCallbackRequest request);

    /**
     * @param request the request parameters of QueryCallbackByPage  QueryCallbackByPageRequest
     * @return QueryCallbackByPageResponse
     */
    CompletableFuture<QueryCallbackByPageResponse> queryCallbackByPage(QueryCallbackByPageRequest request);

    /**
     * @param request the request parameters of UpdateBackupConfig  UpdateBackupConfigRequest
     * @return UpdateBackupConfigResponse
     */
    CompletableFuture<UpdateBackupConfigResponse> updateBackupConfig(UpdateBackupConfigRequest request);

    /**
     * @param request the request parameters of UpdateImageLib  UpdateImageLibRequest
     * @return UpdateImageLibResponse
     */
    CompletableFuture<UpdateImageLibResponse> updateImageLib(UpdateImageLibRequest request);

    /**
     * @param request the request parameters of UpdateImageLibFreeInspection  UpdateImageLibFreeInspectionRequest
     * @return UpdateImageLibFreeInspectionResponse
     */
    CompletableFuture<UpdateImageLibFreeInspectionResponse> updateImageLibFreeInspection(UpdateImageLibFreeInspectionRequest request);

    /**
     * @param request the request parameters of UpdateKeywordLib  UpdateKeywordLibRequest
     * @return UpdateKeywordLibResponse
     */
    CompletableFuture<UpdateKeywordLibResponse> updateKeywordLib(UpdateKeywordLibRequest request);

    /**
     * @param request the request parameters of UpdateScanResultFeedback  UpdateScanResultFeedbackRequest
     * @return UpdateScanResultFeedbackResponse
     */
    CompletableFuture<UpdateScanResultFeedbackResponse> updateScanResultFeedback(UpdateScanResultFeedbackRequest request);

    /**
     * @param request the request parameters of UpdateServiceConfig  UpdateServiceConfigRequest
     * @return UpdateServiceConfigResponse
     */
    CompletableFuture<UpdateServiceConfigResponse> updateServiceConfig(UpdateServiceConfigRequest request);

}
