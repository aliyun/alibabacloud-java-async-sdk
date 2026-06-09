// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edututor20250707;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.edututor20250707.models.*;
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
     * @param request the request parameters of AnswerSSE  AnswerSSERequest
     * @return AnswerSSEResponse
     */
    CompletableFuture<AnswerSSEResponse> answerSSE(AnswerSSERequest request);

<ReturnT> CompletableFuture<ReturnT> answerSSEWithAsyncResponseHandler(AnswerSSERequest request, AsyncResponseHandler<AnswerSSEResponse, ReturnT> responseHandler);

    ResponseIterable<AnswerSSEResponseBody> answerSSEWithResponseIterable(AnswerSSERequest request);

    /**
     * @param request the request parameters of CutQuestions  CutQuestionsRequest
     * @return CutQuestionsResponse
     */
    CompletableFuture<CutQuestionsResponse> cutQuestions(CutQuestionsRequest request);

}
