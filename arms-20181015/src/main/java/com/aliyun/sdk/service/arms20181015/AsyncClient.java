// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20181015;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.arms20181015.models.*;
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
     * @param request the request parameters of ARMSQueryDataSet  ARMSQueryDataSetRequest
     * @return ARMSQueryDataSetResponse
     */
    CompletableFuture<ARMSQueryDataSetResponse> aRMSQueryDataSet(ARMSQueryDataSetRequest request);

    /**
     * @param request the request parameters of MetricQuery  MetricQueryRequest
     * @return MetricQueryResponse
     */
    CompletableFuture<MetricQueryResponse> metricQuery(MetricQueryRequest request);

}
