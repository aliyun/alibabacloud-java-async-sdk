// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimath20241114;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.aimath20241114.models.*;
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
     * @param request the request parameters of GenAnalysis  GenAnalysisRequest
     * @return GenAnalysisResponse
     */
    CompletableFuture<GenAnalysisResponse> genAnalysis(GenAnalysisRequest request);

    ResponseIterable<GenAnalysisResponseBody> genAnalysisWithResponseIterable(GenAnalysisRequest request);

    /**
     * @param request the request parameters of GenStep  GenStepRequest
     * @return GenStepResponse
     */
    CompletableFuture<GenStepResponse> genStep(GenStepRequest request);

    ResponseIterable<GenStepResponseBody> genStepWithResponseIterable(GenStepRequest request);

    /**
     * @param request the request parameters of GlobalConfirm  GlobalConfirmRequest
     * @return GlobalConfirmResponse
     */
    CompletableFuture<GlobalConfirmResponse> globalConfirm(GlobalConfirmRequest request);

    /**
     * @param request the request parameters of UpdateAnalysis  UpdateAnalysisRequest
     * @return UpdateAnalysisResponse
     */
    CompletableFuture<UpdateAnalysisResponse> updateAnalysis(UpdateAnalysisRequest request);

    /**
     * @param request the request parameters of UpdateStep  UpdateStepRequest
     * @return UpdateStepResponse
     */
    CompletableFuture<UpdateStepResponse> updateStep(UpdateStepRequest request);

}
