// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_dbaudit20191209;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.yundun_dbaudit20191209.models.*;
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
     * @param request the request parameters of ClearInstanceStorage  ClearInstanceStorageRequest
     * @return ClearInstanceStorageResponse
     */
    CompletableFuture<ClearInstanceStorageResponse> clearInstanceStorage(ClearInstanceStorageRequest request);

    /**
     * @param request the request parameters of DescribeInstanceAttribute  DescribeInstanceAttributeRequest
     * @return DescribeInstanceAttributeResponse
     */
    CompletableFuture<DescribeInstanceAttributeResponse> describeInstanceAttribute(DescribeInstanceAttributeRequest request);

    /**
     * @param request the request parameters of DescribeInstanceStorage  DescribeInstanceStorageRequest
     * @return DescribeInstanceStorageResponse
     */
    CompletableFuture<DescribeInstanceStorageResponse> describeInstanceStorage(DescribeInstanceStorageRequest request);

    /**
     * @param request the request parameters of DescribeInstances  DescribeInstancesRequest
     * @return DescribeInstancesResponse
     */
    CompletableFuture<DescribeInstancesResponse> describeInstances(DescribeInstancesRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

}
