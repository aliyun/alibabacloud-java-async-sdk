// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260707;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.yike20260707.models.*;
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
     * @param request the request parameters of GetMediaComprehensionJob  GetMediaComprehensionJobRequest
     * @return GetMediaComprehensionJobResponse
     */
    CompletableFuture<GetMediaComprehensionJobResponse> getMediaComprehensionJob(GetMediaComprehensionJobRequest request);

    /**
     * @param request the request parameters of SubmitMediaComprehensionJob  SubmitMediaComprehensionJobRequest
     * @return SubmitMediaComprehensionJobResponse
     */
    CompletableFuture<SubmitMediaComprehensionJobResponse> submitMediaComprehensionJob(SubmitMediaComprehensionJobRequest request);

}
