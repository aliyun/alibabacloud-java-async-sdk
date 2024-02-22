// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20210728;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.mts20210728.models.*;
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

    CompletableFuture<QueryCopyrightResponse> queryCopyright(QueryCopyrightRequest request);

    CompletableFuture<QueryCopyrightExtractResponse> queryCopyrightExtract(QueryCopyrightExtractRequest request);

    CompletableFuture<QueryTraceAbResponse> queryTraceAb(QueryTraceAbRequest request);

    CompletableFuture<QueryTraceExtractResponse> queryTraceExtract(QueryTraceExtractRequest request);

    CompletableFuture<QueryTraceMuResponse> queryTraceMu(QueryTraceMuRequest request);

    CompletableFuture<SubmitCopyrightExtractResponse> submitCopyrightExtract(SubmitCopyrightExtractRequest request);

    CompletableFuture<SubmitCopyrightJobResponse> submitCopyrightJob(SubmitCopyrightJobRequest request);

    CompletableFuture<SubmitImageCopyrightResponse> submitImageCopyright(SubmitImageCopyrightRequest request);

    CompletableFuture<SubmitTraceAbResponse> submitTraceAb(SubmitTraceAbRequest request);

    CompletableFuture<SubmitTraceExtractResponse> submitTraceExtract(SubmitTraceExtractRequest request);

    CompletableFuture<SubmitTracemuResponse> submitTracemu(SubmitTracemuRequest request);

}
