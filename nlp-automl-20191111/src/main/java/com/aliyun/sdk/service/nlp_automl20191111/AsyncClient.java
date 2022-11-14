// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlp_automl20191111;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.nlp_automl20191111.models.*;
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

    CompletableFuture<CreateAsyncPredictResponse> createAsyncPredict(CreateAsyncPredictRequest request);

    CompletableFuture<GetAsyncPredictResponse> getAsyncPredict(GetAsyncPredictRequest request);

    CompletableFuture<GetPredictResultResponse> getPredictResult(GetPredictResultRequest request);

    CompletableFuture<RunPreTrainServiceResponse> runPreTrainService(RunPreTrainServiceRequest request);

}
