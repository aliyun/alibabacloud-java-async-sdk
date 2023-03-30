// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.documentautoml20221229;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.documentautoml20221229.models.*;
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

    CompletableFuture<CreateModelAsyncPredictResponse> createModelAsyncPredict(CreateModelAsyncPredictRequest request);

    CompletableFuture<GetModelAsyncPredictResponse> getModelAsyncPredict(GetModelAsyncPredictRequest request);

    CompletableFuture<PredictClassifierModelResponse> predictClassifierModel(PredictClassifierModelRequest request);

    CompletableFuture<PredictModelResponse> predictModel(PredictModelRequest request);

    CompletableFuture<PredictTemplateModelResponse> predictTemplateModel(PredictTemplateModelRequest request);

}
