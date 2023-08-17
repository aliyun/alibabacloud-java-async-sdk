// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.docmind_api20220729;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.docmind_api20220729.models.*;
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

    CompletableFuture<GetSingleDocumentExtractResultResponse> getSingleDocumentExtractResult(GetSingleDocumentExtractResultRequest request);

    CompletableFuture<ReClassifyTradeDocumentExtractResponse> reClassifyTradeDocumentExtract(ReClassifyTradeDocumentExtractRequest request);

    CompletableFuture<RetryTradeDocumentExtractResponse> retryTradeDocumentExtract(RetryTradeDocumentExtractRequest request);

}
