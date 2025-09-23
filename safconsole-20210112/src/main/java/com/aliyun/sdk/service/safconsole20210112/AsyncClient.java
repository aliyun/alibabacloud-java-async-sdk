// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safconsole20210112;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.safconsole20210112.models.*;
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
     * @param request the request parameters of RevokeFeedback  RevokeFeedbackRequest
     * @return RevokeFeedbackResponse
     */
    CompletableFuture<RevokeFeedbackResponse> revokeFeedback(RevokeFeedbackRequest request);

    /**
     * @param request the request parameters of SendFeedback  SendFeedbackRequest
     * @return SendFeedbackResponse
     */
    CompletableFuture<SendFeedbackResponse> sendFeedback(SendFeedbackRequest request);

    /**
     * @param request the request parameters of UploadSampleApi  UploadSampleApiRequest
     * @return UploadSampleApiResponse
     */
    CompletableFuture<UploadSampleApiResponse> uploadSampleApi(UploadSampleApiRequest request);

}
