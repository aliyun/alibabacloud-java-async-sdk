// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imageprocess20200320;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.imageprocess20200320.models.*;
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
     * @param request the request parameters of FeedbackSession  FeedbackSessionRequest
     * @return FeedbackSessionResponse
     */
    CompletableFuture<FeedbackSessionResponse> feedbackSession(FeedbackSessionRequest request);

    /**
     * @param request the request parameters of GenerateReport  GenerateReportRequest
     * @return GenerateReportResponse
     */
    CompletableFuture<GenerateReportResponse> generateReport(GenerateReportRequest request);

    /**
     * @param request the request parameters of GetAsyncJobResult  GetAsyncJobResultRequest
     * @return GetAsyncJobResultResponse
     */
    CompletableFuture<GetAsyncJobResultResponse> getAsyncJobResult(GetAsyncJobResultRequest request);

}
