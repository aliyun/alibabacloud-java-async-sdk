// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20181012;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.alimt20181012.models.*;
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
     * @param request the request parameters of CreateAsyncTranslate  CreateAsyncTranslateRequest
     * @return CreateAsyncTranslateResponse
     */
    CompletableFuture<CreateAsyncTranslateResponse> createAsyncTranslate(CreateAsyncTranslateRequest request);

    /**
     * @param request the request parameters of CreateImageTranslateTask  CreateImageTranslateTaskRequest
     * @return CreateImageTranslateTaskResponse
     */
    CompletableFuture<CreateImageTranslateTaskResponse> createImageTranslateTask(CreateImageTranslateTaskRequest request);

    /**
     * @param request the request parameters of GetAsyncTranslate  GetAsyncTranslateRequest
     * @return GetAsyncTranslateResponse
     */
    CompletableFuture<GetAsyncTranslateResponse> getAsyncTranslate(GetAsyncTranslateRequest request);

    /**
     * @param request the request parameters of GetBatchTranslate  GetBatchTranslateRequest
     * @return GetBatchTranslateResponse
     */
    CompletableFuture<GetBatchTranslateResponse> getBatchTranslate(GetBatchTranslateRequest request);

    /**
     * @param request the request parameters of GetBatchTranslateByVPC  GetBatchTranslateByVPCRequest
     * @return GetBatchTranslateByVPCResponse
     */
    CompletableFuture<GetBatchTranslateByVPCResponse> getBatchTranslateByVPC(GetBatchTranslateByVPCRequest request);

    /**
     * @param request the request parameters of GetDetectLanguage  GetDetectLanguageRequest
     * @return GetDetectLanguageResponse
     */
    CompletableFuture<GetDetectLanguageResponse> getDetectLanguage(GetDetectLanguageRequest request);

    /**
     * @param request the request parameters of GetDetectLanguageVpc  GetDetectLanguageVpcRequest
     * @return GetDetectLanguageVpcResponse
     */
    CompletableFuture<GetDetectLanguageVpcResponse> getDetectLanguageVpc(GetDetectLanguageVpcRequest request);

    /**
     * @param request the request parameters of GetDocTranslateTask  GetDocTranslateTaskRequest
     * @return GetDocTranslateTaskResponse
     */
    CompletableFuture<GetDocTranslateTaskResponse> getDocTranslateTask(GetDocTranslateTaskRequest request);

    /**
     * @param request the request parameters of GetImageDiagnose  GetImageDiagnoseRequest
     * @return GetImageDiagnoseResponse
     */
    CompletableFuture<GetImageDiagnoseResponse> getImageDiagnose(GetImageDiagnoseRequest request);

    /**
     * @param request the request parameters of GetImageTranslate  GetImageTranslateRequest
     * @return GetImageTranslateResponse
     */
    CompletableFuture<GetImageTranslateResponse> getImageTranslate(GetImageTranslateRequest request);

    /**
     * @param request the request parameters of GetImageTranslateTask  GetImageTranslateTaskRequest
     * @return GetImageTranslateTaskResponse
     */
    CompletableFuture<GetImageTranslateTaskResponse> getImageTranslateTask(GetImageTranslateTaskRequest request);

    /**
     * @param request the request parameters of GetTitleDiagnose  GetTitleDiagnoseRequest
     * @return GetTitleDiagnoseResponse
     */
    CompletableFuture<GetTitleDiagnoseResponse> getTitleDiagnose(GetTitleDiagnoseRequest request);

    /**
     * @param request the request parameters of GetTitleGenerate  GetTitleGenerateRequest
     * @return GetTitleGenerateResponse
     */
    CompletableFuture<GetTitleGenerateResponse> getTitleGenerate(GetTitleGenerateRequest request);

    /**
     * @param request the request parameters of GetTitleIntelligence  GetTitleIntelligenceRequest
     * @return GetTitleIntelligenceResponse
     */
    CompletableFuture<GetTitleIntelligenceResponse> getTitleIntelligence(GetTitleIntelligenceRequest request);

    /**
     * @param request the request parameters of GetTranslateImageBatchResult  GetTranslateImageBatchResultRequest
     * @return GetTranslateImageBatchResultResponse
     */
    CompletableFuture<GetTranslateImageBatchResultResponse> getTranslateImageBatchResult(GetTranslateImageBatchResultRequest request);

    /**
     * @param request the request parameters of GetTranslateReport  GetTranslateReportRequest
     * @return GetTranslateReportResponse
     */
    CompletableFuture<GetTranslateReportResponse> getTranslateReport(GetTranslateReportRequest request);

    /**
     * @param request the request parameters of OpenAlimtService  OpenAlimtServiceRequest
     * @return OpenAlimtServiceResponse
     */
    CompletableFuture<OpenAlimtServiceResponse> openAlimtService(OpenAlimtServiceRequest request);

    /**
     * @param request the request parameters of Translate  TranslateRequest
     * @return TranslateResponse
     */
    CompletableFuture<TranslateResponse> translate(TranslateRequest request);

    /**
     * @deprecated OpenAPI TranslateECommerce is deprecated, please use alimt::2018-10-12::Translate instead.  * @param request  the request parameters of TranslateECommerce  TranslateECommerceRequest
     * @return TranslateECommerceResponse
     */
    @Deprecated
    CompletableFuture<TranslateECommerceResponse> translateECommerce(TranslateECommerceRequest request);

    /**
     * @param request the request parameters of TranslateGeneral  TranslateGeneralRequest
     * @return TranslateGeneralResponse
     */
    CompletableFuture<TranslateGeneralResponse> translateGeneral(TranslateGeneralRequest request);

    /**
     * @param request the request parameters of TranslateGeneralVpc  TranslateGeneralVpcRequest
     * @return TranslateGeneralVpcResponse
     */
    CompletableFuture<TranslateGeneralVpcResponse> translateGeneralVpc(TranslateGeneralVpcRequest request);

    /**
     * @param request the request parameters of TranslateImage  TranslateImageRequest
     * @return TranslateImageResponse
     */
    CompletableFuture<TranslateImageResponse> translateImage(TranslateImageRequest request);

    /**
     * @param request the request parameters of TranslateImageBatch  TranslateImageBatchRequest
     * @return TranslateImageBatchResponse
     */
    CompletableFuture<TranslateImageBatchResponse> translateImageBatch(TranslateImageBatchRequest request);

    /**
     * @param request the request parameters of TranslateSearch  TranslateSearchRequest
     * @return TranslateSearchResponse
     */
    CompletableFuture<TranslateSearchResponse> translateSearch(TranslateSearchRequest request);

}
