// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.green20170823.models.*;
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

    CompletableFuture<AuditItemSubmitResponse> auditItemSubmit(AuditItemSubmitRequest request);

    CompletableFuture<CreatCustomOcrTemplateResponse> creatCustomOcrTemplate(CreatCustomOcrTemplateRequest request);

    CompletableFuture<CreateAuditCallbackResponse> createAuditCallback(CreateAuditCallbackRequest request);

    CompletableFuture<CreateBizTypeResponse> createBizType(CreateBizTypeRequest request);

    CompletableFuture<CreateCdiBagResponse> createCdiBag(CreateCdiBagRequest request);

    CompletableFuture<CreateCdiBaseBagResponse> createCdiBaseBag(CreateCdiBaseBagRequest request);

    CompletableFuture<CreateImageLibResponse> createImageLib(CreateImageLibRequest request);

    CompletableFuture<CreateKeywordResponse> createKeyword(CreateKeywordRequest request);

    CompletableFuture<CreateKeywordLibResponse> createKeywordLib(CreateKeywordLibRequest request);

    CompletableFuture<CreateWebSiteInstanceResponse> createWebSiteInstance(CreateWebSiteInstanceRequest request);

    CompletableFuture<CreateWebsiteIndexPageBaselineResponse> createWebsiteIndexPageBaseline(CreateWebsiteIndexPageBaselineRequest request);

    CompletableFuture<DeleteBizTypeResponse> deleteBizType(DeleteBizTypeRequest request);

    CompletableFuture<DeleteCustomOcrTemplateResponse> deleteCustomOcrTemplate(DeleteCustomOcrTemplateRequest request);

    CompletableFuture<DeleteImageFromLibResponse> deleteImageFromLib(DeleteImageFromLibRequest request);

    CompletableFuture<DeleteImageLibResponse> deleteImageLib(DeleteImageLibRequest request);

    CompletableFuture<DeleteKeywordResponse> deleteKeyword(DeleteKeywordRequest request);

    CompletableFuture<DeleteKeywordLibResponse> deleteKeywordLib(DeleteKeywordLibRequest request);

    CompletableFuture<DeleteNotificationContactsResponse> deleteNotificationContacts(DeleteNotificationContactsRequest request);

    CompletableFuture<DescribeAppInfoResponse> describeAppInfo(DescribeAppInfoRequest request);

    CompletableFuture<DescribeAuditCallbackResponse> describeAuditCallback(DescribeAuditCallbackRequest request);

    CompletableFuture<DescribeAuditCallbackListResponse> describeAuditCallbackList(DescribeAuditCallbackListRequest request);

    CompletableFuture<DescribeAuditContentResponse> describeAuditContent(DescribeAuditContentRequest request);

    CompletableFuture<DescribeAuditContentItemResponse> describeAuditContentItem(DescribeAuditContentItemRequest request);

    CompletableFuture<DescribeAuditRangeResponse> describeAuditRange(DescribeAuditRangeRequest request);

    CompletableFuture<DescribeAuditSettingResponse> describeAuditSetting(DescribeAuditSettingRequest request);

    CompletableFuture<DescribeBizTypeImageLibResponse> describeBizTypeImageLib(DescribeBizTypeImageLibRequest request);

    CompletableFuture<DescribeBizTypeSettingResponse> describeBizTypeSetting(DescribeBizTypeSettingRequest request);

    CompletableFuture<DescribeBizTypeTextLibResponse> describeBizTypeTextLib(DescribeBizTypeTextLibRequest request);

    CompletableFuture<DescribeBizTypesResponse> describeBizTypes(DescribeBizTypesRequest request);

    CompletableFuture<DescribeCloudMonitorServicesResponse> describeCloudMonitorServices(DescribeCloudMonitorServicesRequest request);

    CompletableFuture<DescribeCustomOcrTemplateResponse> describeCustomOcrTemplate(DescribeCustomOcrTemplateRequest request);

    CompletableFuture<DescribeImageFromLibResponse> describeImageFromLib(DescribeImageFromLibRequest request);

    CompletableFuture<DescribeImageLibResponse> describeImageLib(DescribeImageLibRequest request);

    CompletableFuture<DescribeImageUploadInfoResponse> describeImageUploadInfo(DescribeImageUploadInfoRequest request);

    CompletableFuture<DescribeKeywordResponse> describeKeyword(DescribeKeywordRequest request);

    CompletableFuture<DescribeKeywordLibResponse> describeKeywordLib(DescribeKeywordLibRequest request);

    CompletableFuture<DescribeNotificationSettingResponse> describeNotificationSetting(DescribeNotificationSettingRequest request);

    CompletableFuture<DescribeOpenApiRcpStatsResponse> describeOpenApiRcpStats(DescribeOpenApiRcpStatsRequest request);

    CompletableFuture<DescribeOpenApiUsageResponse> describeOpenApiUsage(DescribeOpenApiUsageRequest request);

    CompletableFuture<DescribeOssCallbackSettingResponse> describeOssCallbackSetting(DescribeOssCallbackSettingRequest request);

    CompletableFuture<DescribeOssIncrementCheckSettingResponse> describeOssIncrementCheckSetting(DescribeOssIncrementCheckSettingRequest request);

    CompletableFuture<DescribeOssIncrementOverviewResponse> describeOssIncrementOverview(DescribeOssIncrementOverviewRequest request);

    CompletableFuture<DescribeOssIncrementStatsResponse> describeOssIncrementStats(DescribeOssIncrementStatsRequest request);

    CompletableFuture<DescribeOssResultItemsResponse> describeOssResultItems(DescribeOssResultItemsRequest request);

    CompletableFuture<DescribeOssStockStatusResponse> describeOssStockStatus(DescribeOssStockStatusRequest request);

    CompletableFuture<DescribeSdkUrlResponse> describeSdkUrl(DescribeSdkUrlRequest request);

    CompletableFuture<DescribeUpdatePackageResultResponse> describeUpdatePackageResult(DescribeUpdatePackageResultRequest request);

    CompletableFuture<DescribeUploadInfoResponse> describeUploadInfo(DescribeUploadInfoRequest request);

    CompletableFuture<DescribeUsageBillResponse> describeUsageBill(DescribeUsageBillRequest request);

    CompletableFuture<DescribeUserBizTypesResponse> describeUserBizTypes(DescribeUserBizTypesRequest request);

    CompletableFuture<DescribeUserStatusResponse> describeUserStatus(DescribeUserStatusRequest request);

    CompletableFuture<DescribeViewContentResponse> describeViewContent(DescribeViewContentRequest request);

    CompletableFuture<DescribeWebsiteIndexPageBaselineResponse> describeWebsiteIndexPageBaseline(DescribeWebsiteIndexPageBaselineRequest request);

    CompletableFuture<DescribeWebsiteInstanceResponse> describeWebsiteInstance(DescribeWebsiteInstanceRequest request);

    CompletableFuture<DescribeWebsiteInstanceIdResponse> describeWebsiteInstanceId(DescribeWebsiteInstanceIdRequest request);

    CompletableFuture<DescribeWebsiteInstanceKeyUrlResponse> describeWebsiteInstanceKeyUrl(DescribeWebsiteInstanceKeyUrlRequest request);

    CompletableFuture<DescribeWebsiteScanResultResponse> describeWebsiteScanResult(DescribeWebsiteScanResultRequest request);

    CompletableFuture<DescribeWebsiteScanResultDetailResponse> describeWebsiteScanResultDetail(DescribeWebsiteScanResultDetailRequest request);

    CompletableFuture<DescribeWebsiteStatResponse> describeWebsiteStat(DescribeWebsiteStatRequest request);

    CompletableFuture<DescribeWebsiteVerifyInfoResponse> describeWebsiteVerifyInfo(DescribeWebsiteVerifyInfoRequest request);

    CompletableFuture<ExportKeywordsResponse> exportKeywords(ExportKeywordsRequest request);

    CompletableFuture<ExportOpenApiRcpStatsResponse> exportOpenApiRcpStats(ExportOpenApiRcpStatsRequest request);

    CompletableFuture<ExportOssResultResponse> exportOssResult(ExportOssResultRequest request);

    CompletableFuture<GetAuditItemDetailResponse> getAuditItemDetail(GetAuditItemDetailRequest request);

    CompletableFuture<GetAuditItemListResponse> getAuditItemList(GetAuditItemListRequest request);

    CompletableFuture<GetAuditUserConfResponse> getAuditUserConf(GetAuditUserConfRequest request);

    CompletableFuture<ImportKeywordsResponse> importKeywords(ImportKeywordsRequest request);

    CompletableFuture<MarkAuditContentResponse> markAuditContent(MarkAuditContentRequest request);

    CompletableFuture<MarkAuditContentItemResponse> markAuditContentItem(MarkAuditContentItemRequest request);

    CompletableFuture<MarkOssResultResponse> markOssResult(MarkOssResultRequest request);

    CompletableFuture<MarkWebsiteScanResultResponse> markWebsiteScanResult(MarkWebsiteScanResultRequest request);

    CompletableFuture<RefundCdiBagResponse> refundCdiBag(RefundCdiBagRequest request);

    CompletableFuture<RefundCdiBaseBagResponse> refundCdiBaseBag(RefundCdiBaseBagRequest request);

    CompletableFuture<RefundWebSiteInstanceResponse> refundWebSiteInstance(RefundWebSiteInstanceRequest request);

    CompletableFuture<RenewWebSiteInstanceResponse> renewWebSiteInstance(RenewWebSiteInstanceRequest request);

    CompletableFuture<SendVerifyCodeToEmailResponse> sendVerifyCodeToEmail(SendVerifyCodeToEmailRequest request);

    CompletableFuture<SendVerifyCodeToPhoneResponse> sendVerifyCodeToPhone(SendVerifyCodeToPhoneRequest request);

    CompletableFuture<SendWebsiteFeedbackResponse> sendWebsiteFeedback(SendWebsiteFeedbackRequest request);

    CompletableFuture<UpdateAppPackageResponse> updateAppPackage(UpdateAppPackageRequest request);

    CompletableFuture<UpdateAuditCallbackResponse> updateAuditCallback(UpdateAuditCallbackRequest request);

    CompletableFuture<UpdateAuditRangeResponse> updateAuditRange(UpdateAuditRangeRequest request);

    CompletableFuture<UpdateAuditSettingResponse> updateAuditSetting(UpdateAuditSettingRequest request);

    CompletableFuture<UpdateBizTypeResponse> updateBizType(UpdateBizTypeRequest request);

    CompletableFuture<UpdateBizTypeImageLibResponse> updateBizTypeImageLib(UpdateBizTypeImageLibRequest request);

    CompletableFuture<UpdateBizTypeSettingResponse> updateBizTypeSetting(UpdateBizTypeSettingRequest request);

    CompletableFuture<UpdateBizTypeTextLibResponse> updateBizTypeTextLib(UpdateBizTypeTextLibRequest request);

    CompletableFuture<UpdateCustomOcrTemplateResponse> updateCustomOcrTemplate(UpdateCustomOcrTemplateRequest request);

    CompletableFuture<UpdateKeywordLibResponse> updateKeywordLib(UpdateKeywordLibRequest request);

    CompletableFuture<UpdateNotificationSettingResponse> updateNotificationSetting(UpdateNotificationSettingRequest request);

    CompletableFuture<UpdateOssCallbackSettingResponse> updateOssCallbackSetting(UpdateOssCallbackSettingRequest request);

    CompletableFuture<UpdateOssIncrementCheckSettingResponse> updateOssIncrementCheckSetting(UpdateOssIncrementCheckSettingRequest request);

    CompletableFuture<UpdateOssStockStatusResponse> updateOssStockStatus(UpdateOssStockStatusRequest request);

    CompletableFuture<UpdateWebsiteInstanceResponse> updateWebsiteInstance(UpdateWebsiteInstanceRequest request);

    CompletableFuture<UpdateWebsiteInstanceKeyUrlResponse> updateWebsiteInstanceKeyUrl(UpdateWebsiteInstanceKeyUrlRequest request);

    CompletableFuture<UpdateWebsiteInstanceStatusResponse> updateWebsiteInstanceStatus(UpdateWebsiteInstanceStatusRequest request);

    CompletableFuture<UpgradeCdiBaseBagResponse> upgradeCdiBaseBag(UpgradeCdiBaseBagRequest request);

    CompletableFuture<UploadImageToLibResponse> uploadImageToLib(UploadImageToLibRequest request);

    CompletableFuture<VerifyCustomOcrTemplateResponse> verifyCustomOcrTemplate(VerifyCustomOcrTemplateRequest request);

    CompletableFuture<VerifyEmailResponse> verifyEmail(VerifyEmailRequest request);

    CompletableFuture<VerifyPhoneResponse> verifyPhone(VerifyPhoneRequest request);

    CompletableFuture<VerifyWebsiteInstanceResponse> verifyWebsiteInstance(VerifyWebsiteInstanceRequest request);

}
