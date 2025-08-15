// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intlmarket20250812;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.intlmarket20250812.models.*;
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
     * @param request the request parameters of DescribePrice  DescribePriceRequest
     * @return DescribePriceResponse
     */
    CompletableFuture<DescribePriceResponse> describePrice(DescribePriceRequest request);

}
