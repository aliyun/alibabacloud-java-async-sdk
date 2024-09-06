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

    CompletableFuture<DescribeFileModerationResultResponse> describeFileModerationResult(DescribeFileModerationResultRequest request);

    /**
      * *   Billing: This operation is free of charge.
      * *   QPS limit: You can call this operation up to 100 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeImageModerationResultResponse> describeImageModerationResult(DescribeImageModerationResultRequest request);

    CompletableFuture<DescribeImageResultExtResponse> describeImageResultExt(DescribeImageResultExtRequest request);

    CompletableFuture<DescribeUploadTokenResponse> describeUploadToken(DescribeUploadTokenRequest request);

    /**
      * *   Billing: This operation is free of charge.
      * *   Query timeout: We recommend that you query moderation results at least 480 seconds after you send an asynchronous moderation request. Content Moderation retains moderation results for up to 3 days. After 3 days, the results are deleted.
      * *   You can call this operation up to 100 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeUrlModerationResultResponse> describeUrlModerationResult(DescribeUrlModerationResultRequest request);

    CompletableFuture<FileModerationResponse> fileModeration(FileModerationRequest request);

    CompletableFuture<ImageAsyncModerationResponse> imageAsyncModeration(ImageAsyncModerationRequest request);

    /**
      * **Before you call this operation, make sure that you are familiar with the [billing](~~467826~~)[](https://www.aliyun.com/price/product?#/lvwang/detail/cdibag) of Image Moderation 2.0.
      *
     */
    CompletableFuture<ImageModerationResponse> imageModeration(ImageModerationRequest request);

    CompletableFuture<TextModerationResponse> textModeration(TextModerationRequest request);

    /**
      * Before you call this operation, make sure that you have [activated the Content Moderation 2.0 service](https://common-buy.aliyun.com/?commodityCode=lvwang_cip_public_cn) and are familiar with the [billing](https://help.aliyun.com/document_detail/2671445.html?#section-6od-32j-99n) of the Text Moderation 2.0 Plus service.
      *
     */
    CompletableFuture<TextModerationPlusResponse> textModerationPlus(TextModerationPlusRequest request);

    CompletableFuture<UrlAsyncModerationResponse> urlAsyncModeration(UrlAsyncModerationRequest request);

    CompletableFuture<VideoModerationResponse> videoModeration(VideoModerationRequest request);

    CompletableFuture<VideoModerationCancelResponse> videoModerationCancel(VideoModerationCancelRequest request);

    CompletableFuture<VideoModerationResultResponse> videoModerationResult(VideoModerationResultRequest request);

    CompletableFuture<VoiceModerationResponse> voiceModeration(VoiceModerationRequest request);

    CompletableFuture<VoiceModerationCancelResponse> voiceModerationCancel(VoiceModerationCancelRequest request);

    CompletableFuture<VoiceModerationResultResponse> voiceModerationResult(VoiceModerationResultRequest request);

}
