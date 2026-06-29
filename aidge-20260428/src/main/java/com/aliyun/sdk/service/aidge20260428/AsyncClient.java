// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aidge20260428;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.aidge20260428.models.*;
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
     * @param request the request parameters of AssetOptimizeLite  AssetOptimizeLiteRequest
     * @return AssetOptimizeLiteResponse
     */
    CompletableFuture<AssetOptimizeLiteResponse> assetOptimizeLite(AssetOptimizeLiteRequest request);

    /**
     * @param request the request parameters of AssetOptimizePro  AssetOptimizeProRequest
     * @return AssetOptimizeProResponse
     */
    CompletableFuture<AssetOptimizeProResponse> assetOptimizePro(AssetOptimizeProRequest request);

    /**
     * @param request the request parameters of CategoryAttributeMatch  CategoryAttributeMatchRequest
     * @return CategoryAttributeMatchResponse
     */
    CompletableFuture<CategoryAttributeMatchResponse> categoryAttributeMatch(CategoryAttributeMatchRequest request);

    /**
     * @param request the request parameters of CategoryMatch  CategoryMatchRequest
     * @return CategoryMatchResponse
     */
    CompletableFuture<CategoryMatchResponse> categoryMatch(CategoryMatchRequest request);

    /**
     * @param request the request parameters of DocumentTranslate  DocumentTranslateRequest
     * @return DocumentTranslateResponse
     */
    CompletableFuture<DocumentTranslateResponse> documentTranslate(DocumentTranslateRequest request);

    /**
     * @param request the request parameters of ImageCropping  ImageCroppingRequest
     * @return ImageCroppingResponse
     */
    CompletableFuture<ImageCroppingResponse> imageCropping(ImageCroppingRequest request);

    /**
     * @param request the request parameters of ImageMatting  ImageMattingRequest
     * @return ImageMattingResponse
     */
    CompletableFuture<ImageMattingResponse> imageMatting(ImageMattingRequest request);

    /**
     * @param request the request parameters of ImageRecognition  ImageRecognitionRequest
     * @return ImageRecognitionResponse
     */
    CompletableFuture<ImageRecognitionResponse> imageRecognition(ImageRecognitionRequest request);

    /**
     * @param request the request parameters of ImageRemove  ImageRemoveRequest
     * @return ImageRemoveResponse
     */
    CompletableFuture<ImageRemoveResponse> imageRemove(ImageRemoveRequest request);

    /**
     * @param request the request parameters of ImageTranslationPlus  ImageTranslationPlusRequest
     * @return ImageTranslationPlusResponse
     */
    CompletableFuture<ImageTranslationPlusResponse> imageTranslationPlus(ImageTranslationPlusRequest request);

    /**
     * @param request the request parameters of ImageTranslationPro  ImageTranslationProRequest
     * @return ImageTranslationProResponse
     */
    CompletableFuture<ImageTranslationProResponse> imageTranslationPro(ImageTranslationProRequest request);

    /**
     * @param request the request parameters of ImageTranslationStandard  ImageTranslationStandardRequest
     * @return ImageTranslationStandardResponse
     */
    CompletableFuture<ImageTranslationStandardResponse> imageTranslationStandard(ImageTranslationStandardRequest request);

    /**
     * @param request the request parameters of LanguageDetect  LanguageDetectRequest
     * @return LanguageDetectResponse
     */
    CompletableFuture<LanguageDetectResponse> languageDetect(LanguageDetectRequest request);

    /**
     * @param request the request parameters of MaterialInspection  MaterialInspectionRequest
     * @return MaterialInspectionResponse
     */
    CompletableFuture<MaterialInspectionResponse> materialInspection(MaterialInspectionRequest request);

    /**
     * @param request the request parameters of PackageWeightSizeCheck  PackageWeightSizeCheckRequest
     * @return PackageWeightSizeCheckResponse
     */
    CompletableFuture<PackageWeightSizeCheckResponse> packageWeightSizeCheck(PackageWeightSizeCheckRequest request);

    /**
     * @param request the request parameters of QueryAsyncTaskResult  QueryAsyncTaskResultRequest
     * @return QueryAsyncTaskResultResponse
     */
    CompletableFuture<QueryAsyncTaskResultResponse> queryAsyncTaskResult(QueryAsyncTaskResultRequest request);

    /**
     * @param request the request parameters of SizeChartDetect  SizeChartDetectRequest
     * @return SizeChartDetectResponse
     */
    CompletableFuture<SizeChartDetectResponse> sizeChartDetect(SizeChartDetectRequest request);

    /**
     * @param request the request parameters of SizeChartExtract  SizeChartExtractRequest
     * @return SizeChartExtractResponse
     */
    CompletableFuture<SizeChartExtractResponse> sizeChartExtract(SizeChartExtractRequest request);

    /**
     * @param request the request parameters of TextCorrect  TextCorrectRequest
     * @return TextCorrectResponse
     */
    CompletableFuture<TextCorrectResponse> textCorrect(TextCorrectRequest request);

    /**
     * @param request the request parameters of TextTranslate  TextTranslateRequest
     * @return TextTranslateResponse
     */
    CompletableFuture<TextTranslateResponse> textTranslate(TextTranslateRequest request);

    /**
     * @param request the request parameters of VisionFlow  VisionFlowRequest
     * @return VisionFlowResponse
     */
    CompletableFuture<VisionFlowResponse> visionFlow(VisionFlowRequest request);

}
