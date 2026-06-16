// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dtsai20260401;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dtsai20260401.models.*;
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
     * @param request the request parameters of DescribeDocParserJobResult  DescribeDocParserJobResultRequest
     * @return DescribeDocParserJobResultResponse
     */
    CompletableFuture<DescribeDocParserJobResultResponse> describeDocParserJobResult(DescribeDocParserJobResultRequest request);

    /**
     * @param request the request parameters of DescribeDocParserJobStatus  DescribeDocParserJobStatusRequest
     * @return DescribeDocParserJobStatusResponse
     */
    CompletableFuture<DescribeDocParserJobStatusResponse> describeDocParserJobStatus(DescribeDocParserJobStatusRequest request);

    /**
     * @param request the request parameters of WebFetch  WebFetchRequest
     * @return WebFetchResponse
     */
    CompletableFuture<WebFetchResponse> webFetch(WebFetchRequest request);

    /**
     * @param request the request parameters of WebSearch  WebSearchRequest
     * @return WebSearchResponse
     */
    CompletableFuture<WebSearchResponse> webSearch(WebSearchRequest request);

}
