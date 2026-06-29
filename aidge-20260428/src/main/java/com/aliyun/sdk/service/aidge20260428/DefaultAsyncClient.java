// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aidge20260428;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.aidge20260428.models.*;
import darabonba.core.utils.*;
import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;

import java.util.concurrent.CompletableFuture;


/**
 * <p>Main client.</p>
 */
public final class DefaultAsyncClient implements AsyncClient {

    protected final String product;
    protected final String version;
    protected final String endpointRule;
    protected final java.util.Map<String, String> endpointMap;
    protected final TeaRequest REQUEST;
    protected final TeaAsyncHandler handler;

    protected DefaultAsyncClient(ClientConfiguration configuration) {
        this.handler = new TeaAsyncHandler(configuration);
        this.product = "Aidge";
        this.version = "2026-04-28";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("cn-beijing", "aidge.cn-beijing.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AssetOptimizeLite  AssetOptimizeLiteRequest
     * @return AssetOptimizeLiteResponse
     */
    @Override
    public CompletableFuture<AssetOptimizeLiteResponse> assetOptimizeLite(AssetOptimizeLiteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssetOptimizeLite").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssetOptimizeLiteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssetOptimizeLiteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AssetOptimizePro  AssetOptimizeProRequest
     * @return AssetOptimizeProResponse
     */
    @Override
    public CompletableFuture<AssetOptimizeProResponse> assetOptimizePro(AssetOptimizeProRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssetOptimizePro").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssetOptimizeProResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssetOptimizeProResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CategoryAttributeMatch  CategoryAttributeMatchRequest
     * @return CategoryAttributeMatchResponse
     */
    @Override
    public CompletableFuture<CategoryAttributeMatchResponse> categoryAttributeMatch(CategoryAttributeMatchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CategoryAttributeMatch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CategoryAttributeMatchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CategoryAttributeMatchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CategoryMatch  CategoryMatchRequest
     * @return CategoryMatchResponse
     */
    @Override
    public CompletableFuture<CategoryMatchResponse> categoryMatch(CategoryMatchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CategoryMatch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CategoryMatchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CategoryMatchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DocumentTranslate  DocumentTranslateRequest
     * @return DocumentTranslateResponse
     */
    @Override
    public CompletableFuture<DocumentTranslateResponse> documentTranslate(DocumentTranslateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DocumentTranslate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DocumentTranslateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DocumentTranslateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ImageCropping  ImageCroppingRequest
     * @return ImageCroppingResponse
     */
    @Override
    public CompletableFuture<ImageCroppingResponse> imageCropping(ImageCroppingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ImageCropping").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ImageCroppingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ImageCroppingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ImageMatting  ImageMattingRequest
     * @return ImageMattingResponse
     */
    @Override
    public CompletableFuture<ImageMattingResponse> imageMatting(ImageMattingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ImageMatting").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ImageMattingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ImageMattingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ImageRecognition  ImageRecognitionRequest
     * @return ImageRecognitionResponse
     */
    @Override
    public CompletableFuture<ImageRecognitionResponse> imageRecognition(ImageRecognitionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ImageRecognition").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ImageRecognitionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ImageRecognitionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ImageRemove  ImageRemoveRequest
     * @return ImageRemoveResponse
     */
    @Override
    public CompletableFuture<ImageRemoveResponse> imageRemove(ImageRemoveRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ImageRemove").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ImageRemoveResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ImageRemoveResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ImageTranslationPlus  ImageTranslationPlusRequest
     * @return ImageTranslationPlusResponse
     */
    @Override
    public CompletableFuture<ImageTranslationPlusResponse> imageTranslationPlus(ImageTranslationPlusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ImageTranslationPlus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ImageTranslationPlusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ImageTranslationPlusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ImageTranslationPro  ImageTranslationProRequest
     * @return ImageTranslationProResponse
     */
    @Override
    public CompletableFuture<ImageTranslationProResponse> imageTranslationPro(ImageTranslationProRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ImageTranslationPro").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ImageTranslationProResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ImageTranslationProResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ImageTranslationStandard  ImageTranslationStandardRequest
     * @return ImageTranslationStandardResponse
     */
    @Override
    public CompletableFuture<ImageTranslationStandardResponse> imageTranslationStandard(ImageTranslationStandardRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ImageTranslationStandard").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ImageTranslationStandardResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ImageTranslationStandardResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of LanguageDetect  LanguageDetectRequest
     * @return LanguageDetectResponse
     */
    @Override
    public CompletableFuture<LanguageDetectResponse> languageDetect(LanguageDetectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("LanguageDetect").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(LanguageDetectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<LanguageDetectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of MaterialInspection  MaterialInspectionRequest
     * @return MaterialInspectionResponse
     */
    @Override
    public CompletableFuture<MaterialInspectionResponse> materialInspection(MaterialInspectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("MaterialInspection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MaterialInspectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MaterialInspectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PackageWeightSizeCheck  PackageWeightSizeCheckRequest
     * @return PackageWeightSizeCheckResponse
     */
    @Override
    public CompletableFuture<PackageWeightSizeCheckResponse> packageWeightSizeCheck(PackageWeightSizeCheckRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PackageWeightSizeCheck").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PackageWeightSizeCheckResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PackageWeightSizeCheckResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryAsyncTaskResult  QueryAsyncTaskResultRequest
     * @return QueryAsyncTaskResultResponse
     */
    @Override
    public CompletableFuture<QueryAsyncTaskResultResponse> queryAsyncTaskResult(QueryAsyncTaskResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryAsyncTaskResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryAsyncTaskResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryAsyncTaskResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SizeChartDetect  SizeChartDetectRequest
     * @return SizeChartDetectResponse
     */
    @Override
    public CompletableFuture<SizeChartDetectResponse> sizeChartDetect(SizeChartDetectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SizeChartDetect").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SizeChartDetectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SizeChartDetectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SizeChartExtract  SizeChartExtractRequest
     * @return SizeChartExtractResponse
     */
    @Override
    public CompletableFuture<SizeChartExtractResponse> sizeChartExtract(SizeChartExtractRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SizeChartExtract").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SizeChartExtractResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SizeChartExtractResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TextCorrect  TextCorrectRequest
     * @return TextCorrectResponse
     */
    @Override
    public CompletableFuture<TextCorrectResponse> textCorrect(TextCorrectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TextCorrect").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TextCorrectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TextCorrectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TextTranslate  TextTranslateRequest
     * @return TextTranslateResponse
     */
    @Override
    public CompletableFuture<TextTranslateResponse> textTranslate(TextTranslateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TextTranslate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TextTranslateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TextTranslateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of VisionFlow  VisionFlowRequest
     * @return VisionFlowResponse
     */
    @Override
    public CompletableFuture<VisionFlowResponse> visionFlow(VisionFlowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("VisionFlow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(VisionFlowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<VisionFlowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
