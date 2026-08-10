// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.codesec20260401;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.codesec20260401.models.*;
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
     * @param request the request parameters of DescribeProjects  DescribeProjectsRequest
     * @return DescribeProjectsResponse
     */
    CompletableFuture<DescribeProjectsResponse> describeProjects(DescribeProjectsRequest request);

    /**
     * @param request the request parameters of DescribeScanResultsByEngine  DescribeScanResultsByEngineRequest
     * @return DescribeScanResultsByEngineResponse
     */
    CompletableFuture<DescribeScanResultsByEngineResponse> describeScanResultsByEngine(DescribeScanResultsByEngineRequest request);

    /**
     * @param request the request parameters of DescribeScans  DescribeScansRequest
     * @return DescribeScansResponse
     */
    CompletableFuture<DescribeScansResponse> describeScans(DescribeScansRequest request);

}
