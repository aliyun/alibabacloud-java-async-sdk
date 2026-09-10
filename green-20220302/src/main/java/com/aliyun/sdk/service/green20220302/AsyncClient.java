// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220302;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.green20220302.models.*;
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
     * @param request the request parameters of DescribeFileModerationResult  DescribeFileModerationResultRequest
     * @return DescribeFileModerationResultResponse
     */
    CompletableFuture<DescribeFileModerationResultResponse> describeFileModerationResult(DescribeFileModerationResultRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Billing information: This operation is not billed.</li>
     * <li>QPS limit: This operation is limited to 100 queries per second (QPS) for each user. If you exceed this limit, your API calls are throttled, which may affect your business. We recommend that you call this operation at a reasonable rate.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeImageModerationResult  DescribeImageModerationResultRequest
     * @return DescribeImageModerationResultResponse
     */
    CompletableFuture<DescribeImageModerationResultResponse> describeImageModerationResult(DescribeImageModerationResultRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation must be used with the enhanced image moderation API. After you call the enhanced image moderation API operation, you can call this API operation to obtain additional detection information. This API operation is free of charge.</p>
     * 
     * @param request the request parameters of DescribeImageResultExt  DescribeImageResultExtRequest
     * @return DescribeImageResultExtResponse
     */
    CompletableFuture<DescribeImageResultExtResponse> describeImageResultExt(DescribeImageResultExtRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Billing information: This API call is free.</li>
     * <li>Query timeout: Wait 30 seconds after you submit an asynchronous moderation task before querying the result. Do not wait longer than 24 hours, or the result will be automatically deleted.</li>
     * <li>This API has a per-user rate limiting limit of 10 requests per second. Exceeding this limit triggers rate limiting, which may affect your service. Call the API responsibly.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeMultimodalModerationResult  DescribeMultimodalModerationResultRequest
     * @return DescribeMultimodalModerationResultResponse
     */
    CompletableFuture<DescribeMultimodalModerationResultResponse> describeMultimodalModerationResult(DescribeMultimodalModerationResultRequest request);

    /**
     * @param request the request parameters of DescribeUploadToken  DescribeUploadTokenRequest
     * @return DescribeUploadTokenResponse
     */
    CompletableFuture<DescribeUploadTokenResponse> describeUploadToken(DescribeUploadTokenRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Billing information: This operation is free of charge.</li>
     * <li>Query timeout: We recommend that you set the query interval to 480 seconds (query the results 480 seconds after you submit the asynchronous moderation task). The maximum timeout period is 3 days. After this period, the results are automatically deleted.</li>
     * <li>The QPS limit for this operation is 100 queries per second (QPS) per user. If the limit is exceeded, your API calls will be throttled, which may affect your business. Make sure you call the operation at a reasonable rate.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeUrlModerationResult  DescribeUrlModerationResultRequest
     * @return DescribeUrlModerationResultResponse
     */
    CompletableFuture<DescribeUrlModerationResultResponse> describeUrlModerationResult(DescribeUrlModerationResultRequest request);

    /**
     * @param request the request parameters of FileModeration  FileModerationRequest
     * @return FileModerationResponse
     */
    CompletableFuture<FileModerationResponse> fileModeration(FileModerationRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>The following image formats are supported: PNG, JPG, JPEG, BMP, WEBP, TIFF, ICO, HEIC, and SVG.</li>
     * <li>The image size cannot exceed 10 MB. The recommended image resolution is greater than 200 × 200 pixels. A low resolution may compromise the accuracy of the Content Moderation algorithm.</li>
     * <li>The timeout period for image downloads is 3 seconds. If an image download exceeds this duration, a download timeout error is returned.</li>
     * </ul>
     * 
     * @param request the request parameters of ImageAsyncModeration  ImageAsyncModerationRequest
     * @return ImageAsyncModerationResponse
     */
    CompletableFuture<ImageAsyncModerationResponse> imageAsyncModeration(ImageAsyncModerationRequest request);

    /**
     * @param request the request parameters of ImageBatchModeration  ImageBatchModerationRequest
     * @return ImageBatchModerationResponse
     */
    CompletableFuture<ImageBatchModerationResponse> imageBatchModeration(ImageBatchModerationRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, complete the following steps:</p>
     * <ol>
     * <li><a href="https://common-buy.aliyun.com/?commodityCode=lvwang_cip_public_cn">Activate AI Guardrails-Enhanced Edition</a>.</li>
     * <li>Understand the <a href="https://help.aliyun.com/document_detail/467826.html?#section-h06-qz6-1pt">billing methods and pricing</a> of the enhanced image moderation feature.</li>
     * <li>For more information about API usage and parameters, see the <a href="https://help.aliyun.com/document_detail/467829.html">API reference</a>.</li>
     * </ol>
     * 
     * @param request the request parameters of ImageModeration  ImageModerationRequest
     * @return ImageModerationResponse
     */
    CompletableFuture<ImageModerationResponse> imageModeration(ImageModerationRequest request);

    /**
     * @param request the request parameters of ImageQueueModeration  ImageQueueModerationRequest
     * @return ImageQueueModerationResponse
     */
    CompletableFuture<ImageQueueModerationResponse> imageQueueModeration(ImageQueueModerationRequest request);

    /**
     * @param request the request parameters of ManualCallback  ManualCallbackRequest
     * @return ManualCallbackResponse
     */
    CompletableFuture<ManualCallbackResponse> manualCallback(ManualCallbackRequest request);

    /**
     * @param request the request parameters of ManualModeration  ManualModerationRequest
     * @return ManualModerationResponse
     */
    CompletableFuture<ManualModerationResponse> manualModeration(ManualModerationRequest request);

    /**
     * @param request the request parameters of ManualModerationResult  ManualModerationResultRequest
     * @return ManualModerationResultResponse
     */
    CompletableFuture<ManualModerationResultResponse> manualModerationResult(ManualModerationResultRequest request);

    /**
     * <b>description</b> :
     * <p>The content moderation agent.</p>
     * 
     * @param request the request parameters of MultiModalAgent  MultiModalAgentRequest
     * @return MultiModalAgentResponse
     */
    CompletableFuture<MultiModalAgentResponse> multiModalAgent(MultiModalAgentRequest request);

    /**
     * <b>description</b> :
     * <p>The content moderation Agent.</p>
     * 
     * @param request the request parameters of MultiModalAgentSSE  MultiModalAgentSSERequest
     * @return MultiModalAgentSSEResponse
     */
    CompletableFuture<MultiModalAgentSSEResponse> multiModalAgentSSE(MultiModalAgentSSERequest request);

    ResponseIterable<MultiModalAgentSSEResponseBody> multiModalAgentSSEWithResponseIterable(MultiModalAgentSSERequest request);

    /**
     * @param request the request parameters of MultiModalGuard  MultiModalGuardRequest
     * @return MultiModalGuardResponse
     */
    CompletableFuture<MultiModalGuardResponse> multiModalGuard(MultiModalGuardRequest request);

    /**
     * <b>description</b> :
     * <p>If an API is subject to billing, add the following sentence in bold: &quot;Before using this API, ensure that you fully understand the billing methods and pricing of the XXX product.&quot; The word &quot;pricing&quot; must be a hyperlink to https\://www\.aliyun.com/price/product#/ecs/detail.</p>
     * 
     * @param request the request parameters of MultiModalGuardAsync  MultiModalGuardAsyncRequest
     * @return MultiModalGuardAsyncResponse
     */
    CompletableFuture<MultiModalGuardAsyncResponse> multiModalGuardAsync(MultiModalGuardAsyncRequest request);

    /**
     * <b>description</b> :
     * <p>If the API incurs fees, add the following bold statement as the first sentence: <strong>Before using this operation, make sure that you fully understand the billing methods and <a href="https://www.aliyun.com/price/product#/ecs/detail">pricing</a> of XXX.</strong></p>
     * 
     * @param request the request parameters of MultiModalGuardAsyncResult  MultiModalGuardAsyncResultRequest
     * @return MultiModalGuardAsyncResultResponse
     */
    CompletableFuture<MultiModalGuardAsyncResultResponse> multiModalGuardAsyncResult(MultiModalGuardAsyncResultRequest request);

    /**
     * @param request the request parameters of MultiModalGuardForBase64  MultiModalGuardForBase64Request
     * @return MultiModalGuardForBase64Response
     */
    CompletableFuture<MultiModalGuardForBase64Response> multiModalGuardForBase64(MultiModalGuardForBase64Request request);

    /**
     * @param request the request parameters of MultiModalGuardWs  MultiModalGuardWsRequest
     * @return MultiModalGuardWsResponse
     */
    CompletableFuture<MultiModalGuardWsResponse> multiModalGuardWs(MultiModalGuardWsRequest request);

    /**
     * <b>description</b> :
     * <p>The asynchronous URL moderation service supports two billing methods: pay-as-you-go and resource plan usage.</p>
     * <ul>
     * <li>After you activate the enhanced text moderation service, the default billing method is pay-as-you-go. You are billed daily based on actual usage. No charges apply if you do not invoke the service.</li>
     * <li>If your moderation volume is large or your moderation needs are relatively stable, purchase a resource plan in advance. Larger resource plans offer greater discounts. You can stack multiple resource plans.</li>
     * </ul>
     * 
     * @param request the request parameters of MultimodalAsyncModeration  MultimodalAsyncModerationRequest
     * @return MultimodalAsyncModerationResponse
     */
    CompletableFuture<MultimodalAsyncModerationResponse> multimodalAsyncModeration(MultimodalAsyncModerationRequest request);

    /**
     * <b>description</b> :
     * <p>Before you use this operation, review the <a href="https://help.aliyun.com/document_detail/464388.html?#section-itm-m2s-ugq">billing methods and pricing</a> for Text Moderation Plus.</p>
     * 
     * @param request the request parameters of TextModeration  TextModerationRequest
     * @return TextModerationResponse
     */
    CompletableFuture<TextModerationResponse> textModeration(TextModerationRequest request);

    /**
     * <b>description</b> :
     * <p>Before you use this API, <a href="https://common-buy.aliyun.com/?commodityCode=lvwang_cip_public_cn">activate AI Guardrails Pro</a> and make sure that you understand the <a href="https://help.aliyun.com/document_detail/2671445.html?#section-6od-32j-99n">billing methods and pricing</a> for Text Moderation Plus.</p>
     * 
     * @param request the request parameters of TextModerationPlus  TextModerationPlusRequest
     * @return TextModerationPlusResponse
     */
    CompletableFuture<TextModerationPlusResponse> textModerationPlus(TextModerationPlusRequest request);

    /**
     * <b>description</b> :
     * <p>The URL asynchronous moderation service supports the pay-as-you-go and resource plan billing methods.</p>
     * <ul>
     * <li>After you activate the enhanced edition of Text Moderation, the default billing method is pay-as-you-go. You are charged CNY 30 per 10,000 calls based on your daily usage. No fees are incurred if you do not call the service.</li>
     * <li>If you have many moderation requests or relatively fixed moderation requirements, we recommend that you purchase resource plans in advance. The larger the resource plan you purchase, the greater the discount you receive. You can purchase and use multiple resource plans.</li>
     * </ul>
     * 
     * @param request the request parameters of UrlAsyncModeration  UrlAsyncModerationRequest
     * @return UrlAsyncModerationResponse
     */
    CompletableFuture<UrlAsyncModerationResponse> urlAsyncModeration(UrlAsyncModerationRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you have activated the <a href="https://common-buy.aliyun.com/?commodityCode=lvwang_cip_public_cn">enhanced Content Moderation</a> service and understand the <a href="https://help.aliyun.com/document_detail/2505807.html">billing methods</a> and <a href="https://www.aliyun.com/price/product?#/lvwang/detail/cdibag">pricing</a> of the enhanced video moderation feature.</p>
     * 
     * @param request the request parameters of VideoModeration  VideoModerationRequest
     * @return VideoModerationResponse
     */
    CompletableFuture<VideoModerationResponse> videoModeration(VideoModerationRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, you must activate Content Moderation Enhanced Edition. Activation link: <a href="https://common-buy.aliyun.com/?spm=a2c4g.11186623.0.0.14652963KTpjic&commodityCode=lvwang_cip_public_cn">https://common-buy.aliyun.com/?spm=a2c4g.11186623.0.0.14652963KTpjic&amp;commodityCode=lvwang_cip_public_cn</a>. You must grant the required RAM access policy (such as AliyunYundunGreenWebFullAccess) and use the correct endpoint (green-cip.{region}.aliyuncs.com).</p>
     * 
     * @param request the request parameters of VideoModerationCancel  VideoModerationCancelRequest
     * @return VideoModerationCancelResponse
     */
    CompletableFuture<VideoModerationCancelResponse> videoModerationCancel(VideoModerationCancelRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is not billed. Set the polling interval to 30 seconds (query results 30 seconds after submitting the asynchronous detection task). The maximum query window is 24 hours. After 24 hours, results are automatically deleted.</p>
     * 
     * @param request the request parameters of VideoModerationResult  VideoModerationResultRequest
     * @return VideoModerationResultResponse
     */
    CompletableFuture<VideoModerationResultResponse> videoModerationResult(VideoModerationResultRequest request);

    /**
     * @param request the request parameters of VoiceModeration  VoiceModerationRequest
     * @return VoiceModerationResponse
     */
    CompletableFuture<VoiceModerationResponse> voiceModeration(VoiceModerationRequest request);

    /**
     * @param request the request parameters of VoiceModerationCancel  VoiceModerationCancelRequest
     * @return VoiceModerationCancelResponse
     */
    CompletableFuture<VoiceModerationCancelResponse> voiceModerationCancel(VoiceModerationCancelRequest request);

    /**
     * @param request the request parameters of VoiceModerationResult  VoiceModerationResultRequest
     * @return VoiceModerationResultResponse
     */
    CompletableFuture<VoiceModerationResultResponse> voiceModerationResult(VoiceModerationResultRequest request);

}
