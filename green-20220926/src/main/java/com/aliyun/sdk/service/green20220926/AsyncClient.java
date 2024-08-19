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

    CompletableFuture<AddImageLibResponse> addImageLib(AddImageLibRequest request);

    CompletableFuture<AddImages2LibResponse> addImages2Lib(AddImages2LibRequest request);

    CompletableFuture<AddKeywordLibResponse> addKeywordLib(AddKeywordLibRequest request);

    CompletableFuture<AddKeywordsResponse> addKeywords(AddKeywordsRequest request);

    CompletableFuture<AddKeywordsToLibResponse> addKeywordsToLib(AddKeywordsToLibRequest request);

    CompletableFuture<CancelStockOssCheckTaskResponse> cancelStockOssCheckTask(CancelStockOssCheckTaskRequest request);

    CompletableFuture<CopyServiceConfigResponse> copyServiceConfig(CopyServiceConfigRequest request);

    CompletableFuture<CreatStockOssCheckTaskResponse> creatStockOssCheckTask(CreatStockOssCheckTaskRequest request);

    CompletableFuture<CreatePreCheckResponse> createPreCheck(CreatePreCheckRequest request);

    CompletableFuture<DeleteImagesFromLibResponse> deleteImagesFromLib(DeleteImagesFromLibRequest request);

    CompletableFuture<DeleteKeywordResponse> deleteKeyword(DeleteKeywordRequest request);

    CompletableFuture<DeleteKeywordLibResponse> deleteKeywordLib(DeleteKeywordLibRequest request);

    CompletableFuture<ExportCipStatsResponse> exportCipStats(ExportCipStatsRequest request);

    CompletableFuture<ExportKeywordResponse> exportKeyword(ExportKeywordRequest request);

    CompletableFuture<ExportResultResponse> exportResult(ExportResultRequest request);

    CompletableFuture<ExportScanResultResponse> exportScanResult(ExportScanResultRequest request);

    CompletableFuture<ExportTextScanResultResponse> exportTextScanResult(ExportTextScanResultRequest request);

    CompletableFuture<GetBackupBucketsListResponse> getBackupBucketsList(GetBackupBucketsListRequest request);

    CompletableFuture<GetBackupConfigResponse> getBackupConfig(GetBackupConfigRequest request);

    CompletableFuture<GetBackupStatusResponse> getBackupStatus(GetBackupStatusRequest request);

    CompletableFuture<GetBucketsListResponse> getBucketsList(GetBucketsListRequest request);

    CompletableFuture<GetCipStatsResponse> getCipStats(GetCipStatsRequest request);

    CompletableFuture<GetExecuteTimeResponse> getExecuteTime(GetExecuteTimeRequest request);

    CompletableFuture<GetImageSceneLabelListConfResponse> getImageSceneLabelListConf(GetImageSceneLabelListConfRequest request);

    CompletableFuture<GetJobNameListResponse> getJobNameList(GetJobNameListRequest request);

    CompletableFuture<GetKeywordImportResultResponse> getKeywordImportResult(GetKeywordImportResultRequest request);

    CompletableFuture<GetOssCheckStatusResponse> getOssCheckStatus(GetOssCheckStatusRequest request);

    CompletableFuture<GetScanNumResponse> getScanNum(GetScanNumRequest request);

    CompletableFuture<GetScanResultResponse> getScanResult(GetScanResultRequest request);

    CompletableFuture<GetServiceConfResponse> getServiceConf(GetServiceConfRequest request);

    CompletableFuture<GetServiceConfigResponse> getServiceConfig(GetServiceConfigRequest request);

    CompletableFuture<GetServiceLabelConfigResponse> getServiceLabelConfig(GetServiceLabelConfigRequest request);

    CompletableFuture<GetStockOssCheckTasksListResponse> getStockOssCheckTasksList(GetStockOssCheckTasksListRequest request);

    CompletableFuture<GetTextScanResultResponse> getTextScanResult(GetTextScanResultRequest request);

    CompletableFuture<GetUploadInfoResponse> getUploadInfo(GetUploadInfoRequest request);

    CompletableFuture<GetUserBuyStatusResponse> getUserBuyStatus(GetUserBuyStatusRequest request);

    CompletableFuture<ListImageLibResponse> listImageLib(ListImageLibRequest request);

    CompletableFuture<ListImagesFromLibResponse> listImagesFromLib(ListImagesFromLibRequest request);

    CompletableFuture<ListKeywordLibsResponse> listKeywordLibs(ListKeywordLibsRequest request);

    CompletableFuture<ListKeywordsResponse> listKeywords(ListKeywordsRequest request);

    CompletableFuture<ListOssCheckResultResponse> listOssCheckResult(ListOssCheckResultRequest request);

    CompletableFuture<ListServiceConfigsResponse> listServiceConfigs(ListServiceConfigsRequest request);

    CompletableFuture<ModifyServiceInfoResponse> modifyServiceInfo(ModifyServiceInfoRequest request);

    CompletableFuture<UpdateBackupConfigResponse> updateBackupConfig(UpdateBackupConfigRequest request);

    CompletableFuture<UpdateImageLibResponse> updateImageLib(UpdateImageLibRequest request);

    CompletableFuture<UpdateImageLibFreeInspectionResponse> updateImageLibFreeInspection(UpdateImageLibFreeInspectionRequest request);

    CompletableFuture<UpdateKeywordLibResponse> updateKeywordLib(UpdateKeywordLibRequest request);

    CompletableFuture<UpdateScanResultFeedbackResponse> updateScanResultFeedback(UpdateScanResultFeedbackRequest request);

    CompletableFuture<UpdateServiceConfigResponse> updateServiceConfig(UpdateServiceConfigRequest request);

}
