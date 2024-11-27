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
     * <p>  Billing: This operation is free of charge.</p>
     * <ul>
     * <li>QPS limit: You can call this operation up to 100 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeImageModerationResult  DescribeImageModerationResultRequest
     * @return DescribeImageModerationResultResponse
     */
    CompletableFuture<DescribeImageModerationResultResponse> describeImageModerationResult(DescribeImageModerationResultRequest request);

    /**
     * @param request the request parameters of DescribeImageResultExt  DescribeImageResultExtRequest
     * @return DescribeImageResultExtResponse
     */
    CompletableFuture<DescribeImageResultExtResponse> describeImageResultExt(DescribeImageResultExtRequest request);

    /**
     * @param request the request parameters of DescribeUploadToken  DescribeUploadTokenRequest
     * @return DescribeUploadTokenResponse
     */
    CompletableFuture<DescribeUploadTokenResponse> describeUploadToken(DescribeUploadTokenRequest request);

    /**
     * <b>description</b> :
     * <p>  Billing: This operation is free of charge.</p>
     * <ul>
     * <li>Query timeout: We recommend that you query moderation results at least 480 seconds after you send an asynchronous moderation request. Content Moderation retains moderation results for up to 3 days. After 3 days, the results are deleted.</li>
     * <li>You can call this operation up to 100 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</li>
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
     * <p>*Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/467826.html">billing</a><a href="https://www.aliyun.com/price/product?#/lvwang/detail/cdibag"></a> of Image Moderation 2.0.</p>
     * 
     * @param request the request parameters of ImageModeration  ImageModerationRequest
     * @return ImageModerationResponse
     */
    CompletableFuture<ImageModerationResponse> imageModeration(ImageModerationRequest request);

    /**
     * @param request the request parameters of TextModeration  TextModerationRequest
     * @return TextModerationResponse
     */
    CompletableFuture<TextModerationResponse> textModeration(TextModerationRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you have <a href="https://common-buy.aliyun.com/?commodityCode=lvwang_cip_public_cn">activated the Content Moderation 2.0 service</a> and are familiar with the <a href="https://help.aliyun.com/document_detail/2671445.html?#section-6od-32j-99n">billing</a> of the Text Moderation 2.0 Plus service.</p>
     * 
     * @param request the request parameters of TextModerationPlus  TextModerationPlusRequest
     * @return TextModerationPlusResponse
     */
    CompletableFuture<TextModerationPlusResponse> textModerationPlus(TextModerationPlusRequest request);

    /**
     * @param request the request parameters of UrlAsyncModeration  UrlAsyncModerationRequest
     * @return UrlAsyncModerationResponse
     */
    CompletableFuture<UrlAsyncModerationResponse> urlAsyncModeration(UrlAsyncModerationRequest request);

    /**
     * @param request the request parameters of VideoModeration  VideoModerationRequest
     * @return VideoModerationResponse
     */
    CompletableFuture<VideoModerationResponse> videoModeration(VideoModerationRequest request);

    /**
     * @param request the request parameters of VideoModerationCancel  VideoModerationCancelRequest
     * @return VideoModerationCancelResponse
     */
    CompletableFuture<VideoModerationCancelResponse> videoModerationCancel(VideoModerationCancelRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is free of charge. We recommend that you query moderation results at least 30 seconds after you send an asynchronous moderation request. Content Moderation retains moderation results for at most 24 hours. After 24 hours, the results are deleted.</p>
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
