// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbai20240820;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.polardbai20240820.models.*;
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
     * @param request the request parameters of Predict  PredictRequest
     * @return PredictResponse
     */
    CompletableFuture<PredictResponse> predict(PredictRequest request);

    /**
     * @param request the request parameters of PredictSse  PredictSseRequest
     * @return PredictSseResponse
     */
    CompletableFuture<PredictSseResponse> predictSse(PredictSseRequest request);

<ReturnT> CompletableFuture<ReturnT> predictSseWithAsyncResponseHandler(PredictSseRequest request, AsyncResponseHandler<PredictSseResponse, ReturnT> responseHandler);

    ResponseIterable<PredictSseResponseBody> predictSseWithResponseIterable(PredictSseRequest request);

}
