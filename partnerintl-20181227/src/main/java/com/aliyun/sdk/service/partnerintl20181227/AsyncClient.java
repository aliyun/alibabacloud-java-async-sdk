// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.partnerintl20181227;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.partnerintl20181227.models.*;
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

    CompletableFuture<DescribeProductResponse> describeProduct(DescribeProductRequest request);

    CompletableFuture<QueryCommodityByServiceIdResponse> queryCommodityByServiceId(QueryCommodityByServiceIdRequest request);

    CompletableFuture<QueryCommodityBySupplierUidResponse> queryCommodityBySupplierUid(QueryCommodityBySupplierUidRequest request);

    CompletableFuture<QueryCommodityInfoResponse> queryCommodityInfo(QueryCommodityInfoRequest request);

    CompletableFuture<QueryImageIdResponse> queryImageId(QueryImageIdRequest request);

    CompletableFuture<QuerySupplierDetailBySupplierUidResponse> querySupplierDetailBySupplierUid(QuerySupplierDetailBySupplierUidRequest request);

}
