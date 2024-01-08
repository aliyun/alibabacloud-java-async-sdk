// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220302;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.green20220302.models.*;
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

    CompletableFuture<DescribeImageModerationResultResponse> describeImageModerationResult(DescribeImageModerationResultRequest request);

    CompletableFuture<DescribeImageResultExtResponse> describeImageResultExt(DescribeImageResultExtRequest request);

    CompletableFuture<DescribeUploadTokenResponse> describeUploadToken(DescribeUploadTokenRequest request);

    CompletableFuture<FileModerationResponse> fileModeration(FileModerationRequest request);

    CompletableFuture<ImageAsyncModerationResponse> imageAsyncModeration(ImageAsyncModerationRequest request);

    CompletableFuture<ImageModerationResponse> imageModeration(ImageModerationRequest request);

    CompletableFuture<TextModerationResponse> textModeration(TextModerationRequest request);

    CompletableFuture<TextModerationPlusResponse> textModerationPlus(TextModerationPlusRequest request);

    CompletableFuture<VideoModerationResponse> videoModeration(VideoModerationRequest request);

    CompletableFuture<VideoModerationCancelResponse> videoModerationCancel(VideoModerationCancelRequest request);

    CompletableFuture<VideoModerationResultResponse> videoModerationResult(VideoModerationResultRequest request);

    CompletableFuture<VoiceModerationResponse> voiceModeration(VoiceModerationRequest request);

    CompletableFuture<VoiceModerationCancelResponse> voiceModerationCancel(VoiceModerationCancelRequest request);

    CompletableFuture<VoiceModerationResultResponse> voiceModerationResult(VoiceModerationResultRequest request);

}
