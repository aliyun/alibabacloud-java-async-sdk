// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bss20140714;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.bss20140714.models.*;
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
     * @param request the request parameters of CreateOrder  CreateOrderRequest
     * @return CreateOrderResponse
     */
    CompletableFuture<CreateOrderResponse> createOrder(CreateOrderRequest request);

    /**
     * @param request the request parameters of DescribeCashDetail  DescribeCashDetailRequest
     * @return DescribeCashDetailResponse
     */
    CompletableFuture<DescribeCashDetailResponse> describeCashDetail(DescribeCashDetailRequest request);

    /**
     * @param request the request parameters of DescribeCouponList  DescribeCouponListRequest
     * @return DescribeCouponListResponse
     */
    CompletableFuture<DescribeCouponListResponse> describeCouponList(DescribeCouponListRequest request);

    /**
     * @param request the request parameters of OpenCallback  OpenCallbackRequest
     * @return OpenCallbackResponse
     */
    CompletableFuture<OpenCallbackResponse> openCallback(OpenCallbackRequest request);

    /**
     * @param request the request parameters of QueryForCssOrder  QueryForCssOrderRequest
     * @return QueryForCssOrderResponse
     */
    CompletableFuture<QueryForCssOrderResponse> queryForCssOrder(QueryForCssOrderRequest request);

    /**
     * @param request the request parameters of vnoBatchRefundOrder  VnoBatchRefundOrderRequest
     * @return VnoBatchRefundOrderResponse
     */
    CompletableFuture<VnoBatchRefundOrderResponse> vnoBatchRefundOrder(VnoBatchRefundOrderRequest request);

}
