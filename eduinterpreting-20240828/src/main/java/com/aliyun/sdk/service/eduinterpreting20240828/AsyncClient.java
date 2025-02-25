// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eduinterpreting20240828;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.eduinterpreting20240828.models.*;
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
     * @param request the request parameters of RecognizeAudio  RecognizeAudioRequest
     * @return RecognizeAudioResponse
     */
    CompletableFuture<RecognizeAudioResponse> recognizeAudio(RecognizeAudioRequest request);

    /**
     * @param request the request parameters of SubmitEvaluationTask  SubmitEvaluationTaskRequest
     * @return SubmitEvaluationTaskResponse
     */
    CompletableFuture<SubmitEvaluationTaskResponse> submitEvaluationTask(SubmitEvaluationTaskRequest request);

}
