// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20200618;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cloudauth20200618.models.*;
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

    CompletableFuture<DescribeSmartVerifyResponse> describeSmartVerify(DescribeSmartVerifyRequest request);

    CompletableFuture<DescribeSmsDetailResponse> describeSmsDetail(DescribeSmsDetailRequest request);

    CompletableFuture<InitSmartVerifyResponse> initSmartVerify(InitSmartVerifyRequest request);

    CompletableFuture<SendSmsResponse> sendSms(SendSmsRequest request);

}
