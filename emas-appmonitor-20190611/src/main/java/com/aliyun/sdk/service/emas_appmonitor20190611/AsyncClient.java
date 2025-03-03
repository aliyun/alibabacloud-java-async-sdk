// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emas_appmonitor20190611;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.emas_appmonitor20190611.models.*;
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
     * @param request the request parameters of GetError  GetErrorRequest
     * @return GetErrorResponse
     */
    CompletableFuture<GetErrorResponse> getError(GetErrorRequest request);

    /**
     * @param request the request parameters of GetErrors  GetErrorsRequest
     * @return GetErrorsResponse
     */
    CompletableFuture<GetErrorsResponse> getErrors(GetErrorsRequest request);

    /**
     * @param request the request parameters of GetIssue  GetIssueRequest
     * @return GetIssueResponse
     */
    CompletableFuture<GetIssueResponse> getIssue(GetIssueRequest request);

    /**
     * @param request the request parameters of GetIssues  GetIssuesRequest
     * @return GetIssuesResponse
     */
    CompletableFuture<GetIssuesResponse> getIssues(GetIssuesRequest request);

}
