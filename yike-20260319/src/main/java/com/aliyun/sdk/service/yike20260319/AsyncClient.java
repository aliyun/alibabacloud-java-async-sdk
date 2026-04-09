// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260319;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.yike20260319.models.*;
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
     * @param request the request parameters of BatchGetYikeAIAppJob  BatchGetYikeAIAppJobRequest
     * @return BatchGetYikeAIAppJobResponse
     */
    CompletableFuture<BatchGetYikeAIAppJobResponse> batchGetYikeAIAppJob(BatchGetYikeAIAppJobRequest request);

    /**
     * @param request the request parameters of CreateYikeAssetUpload  CreateYikeAssetUploadRequest
     * @return CreateYikeAssetUploadResponse
     */
    CompletableFuture<CreateYikeAssetUploadResponse> createYikeAssetUpload(CreateYikeAssetUploadRequest request);

    /**
     * @param request the request parameters of GetYikeAIAppJob  GetYikeAIAppJobRequest
     * @return GetYikeAIAppJobResponse
     */
    CompletableFuture<GetYikeAIAppJobResponse> getYikeAIAppJob(GetYikeAIAppJobRequest request);

    /**
     * @param request the request parameters of GetYikeStoryboardJob  GetYikeStoryboardJobRequest
     * @return GetYikeStoryboardJobResponse
     */
    CompletableFuture<GetYikeStoryboardJobResponse> getYikeStoryboardJob(GetYikeStoryboardJobRequest request);

    /**
     * @param request the request parameters of SubmitYikeAIAppJob  SubmitYikeAIAppJobRequest
     * @return SubmitYikeAIAppJobResponse
     */
    CompletableFuture<SubmitYikeAIAppJobResponse> submitYikeAIAppJob(SubmitYikeAIAppJobRequest request);

    /**
     * @param request the request parameters of SubmitYikeStoryboardJob  SubmitYikeStoryboardJobRequest
     * @return SubmitYikeStoryboardJobResponse
     */
    CompletableFuture<SubmitYikeStoryboardJobResponse> submitYikeStoryboardJob(SubmitYikeStoryboardJobRequest request);

}
