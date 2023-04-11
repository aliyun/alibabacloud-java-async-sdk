// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20181012;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.alimt20181012.models.*;
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

    CompletableFuture<CreateImageTranslateTaskResponse> createImageTranslateTask(CreateImageTranslateTaskRequest request);

    CompletableFuture<GetBatchTranslateResponse> getBatchTranslate(GetBatchTranslateRequest request);

    CompletableFuture<GetDetectLanguageResponse> getDetectLanguage(GetDetectLanguageRequest request);

    CompletableFuture<GetDocTranslateTaskResponse> getDocTranslateTask(GetDocTranslateTaskRequest request);

    CompletableFuture<GetImageDiagnoseResponse> getImageDiagnose(GetImageDiagnoseRequest request);

    CompletableFuture<GetImageTranslateResponse> getImageTranslate(GetImageTranslateRequest request);

    CompletableFuture<GetImageTranslateTaskResponse> getImageTranslateTask(GetImageTranslateTaskRequest request);

    CompletableFuture<GetTitleDiagnoseResponse> getTitleDiagnose(GetTitleDiagnoseRequest request);

    CompletableFuture<GetTitleGenerateResponse> getTitleGenerate(GetTitleGenerateRequest request);

    CompletableFuture<GetTitleIntelligenceResponse> getTitleIntelligence(GetTitleIntelligenceRequest request);

    CompletableFuture<GetTranslateImageBatchResultResponse> getTranslateImageBatchResult(GetTranslateImageBatchResultRequest request);

    CompletableFuture<GetTranslateReportResponse> getTranslateReport(GetTranslateReportRequest request);

    CompletableFuture<OpenAlimtServiceResponse> openAlimtService(OpenAlimtServiceRequest request);

    CompletableFuture<TranslateResponse> translate(TranslateRequest request);

    CompletableFuture<TranslateECommerceResponse> translateECommerce(TranslateECommerceRequest request);

    CompletableFuture<TranslateGeneralResponse> translateGeneral(TranslateGeneralRequest request);

    CompletableFuture<TranslateImageResponse> translateImage(TranslateImageRequest request);

    CompletableFuture<TranslateImageBatchResponse> translateImageBatch(TranslateImageBatchRequest request);

}
