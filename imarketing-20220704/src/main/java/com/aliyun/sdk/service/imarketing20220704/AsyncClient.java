// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imarketing20220704;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.imarketing20220704.models.*;
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

    CompletableFuture<CancelOrderResponse> cancelOrder(CancelOrderRequest request);

    CompletableFuture<ConfirmSampleReceivedResponse> confirmSampleReceived(ConfirmSampleReceivedRequest request);

    CompletableFuture<ConfirmSampleShippedResponse> confirmSampleShipped(ConfirmSampleShippedRequest request);

    CompletableFuture<CreateDeviceResponse> createDevice(CreateDeviceRequest request);

    CompletableFuture<DeleteCreativeInfoResponse> deleteCreativeInfo(DeleteCreativeInfoRequest request);

    CompletableFuture<GetAdvertisingForE2Response> getAdvertisingForE2(GetAdvertisingForE2Request request);

    CompletableFuture<GetBrandPageResponse> getBrandPage(GetBrandPageRequest request);

    CompletableFuture<GetBusinessIdResponse> getBusinessId(GetBusinessIdRequest request);

    CompletableFuture<GetCreativeInfoResponse> getCreativeInfo(GetCreativeInfoRequest request);

    CompletableFuture<GetLeadsListPageResponse> getLeadsListPage(GetLeadsListPageRequest request);

    CompletableFuture<GetMainPartPageResponse> getMainPartPage(GetMainPartPageRequest request);

    CompletableFuture<GetOssUploadSignatureResponse> getOssUploadSignature(GetOssUploadSignatureRequest request);

    CompletableFuture<GetRelatedByCreativeIdResponse> getRelatedByCreativeId(GetRelatedByCreativeIdRequest request);

    CompletableFuture<GetUserFinishedAdResponse> getUserFinishedAd(GetUserFinishedAdRequest request);

    CompletableFuture<ListAdvertisingResponse> listAdvertising(ListAdvertisingRequest request);

    CompletableFuture<ListSpecificAdResponse> listSpecificAd(ListSpecificAdRequest request);

    CompletableFuture<QueryAuditResultResponse> queryAuditResult(QueryAuditResultRequest request);

    CompletableFuture<QueryBenefitGrantResultResponse> queryBenefitGrantResult(QueryBenefitGrantResultRequest request);

    CompletableFuture<QueryFinanceUserInfoResponse> queryFinanceUserInfo(QueryFinanceUserInfoRequest request);

    CompletableFuture<QueryOrderResponse> queryOrder(QueryOrderRequest request);

    CompletableFuture<ReportImpressionResponse> reportImpression(ReportImpressionRequest request);

    CompletableFuture<ReportTranslateResponse> reportTranslate(ReportTranslateRequest request);

    CompletableFuture<SendSmsResponse> sendSms(SendSmsRequest request);

    CompletableFuture<SyncInfoResponse> syncInfo(SyncInfoRequest request);

    CompletableFuture<UpdateAdxCreativeContentResponse> updateAdxCreativeContent(UpdateAdxCreativeContentRequest request);

    CompletableFuture<VerifyAdvertisingResponse> verifyAdvertising(VerifyAdvertisingRequest request);

    CompletableFuture<VerifySmsCodeResponse> verifySmsCode(VerifySmsCodeRequest request);

}
