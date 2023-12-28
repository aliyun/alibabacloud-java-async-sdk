// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yicconsole20240118;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.yicconsole20240118.models.*;
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

    CompletableFuture<CheckPayOrderResponse> checkPayOrder(CheckPayOrderRequest request);

    CompletableFuture<CheckRefundResponse> checkRefund(CheckRefundRequest request);

    CompletableFuture<PayOrderResponse> payOrder(PayOrderRequest request);

    CompletableFuture<PrepaidCeaseResponse> prepaidCease(PrepaidCeaseRequest request);

    CompletableFuture<RefundResponse> refund(RefundRequest request);

}
