// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trusted_server20200613;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.trusted_server20200613.models.*;
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

    CompletableFuture<DescribeBootResponse> describeBoot(DescribeBootRequest request);

    CompletableFuture<DescribeEventsResponse> describeEvents(DescribeEventsRequest request);

    CompletableFuture<DescribeInstanceResponse> describeInstance(DescribeInstanceRequest request);

    CompletableFuture<GenerateAikcertResponse> generateAikcert(GenerateAikcertRequest request);

    CompletableFuture<GenerateNonceResponse> generateNonce(GenerateNonceRequest request);

    CompletableFuture<IgnoreEventsResponse> ignoreEvents(IgnoreEventsRequest request);

    CompletableFuture<ProduceAikcertResponse> produceAikcert(ProduceAikcertRequest request);

    CompletableFuture<PutMessageResponse> putMessage(PutMessageRequest request);

    CompletableFuture<RegisterMessageResponse> registerMessage(RegisterMessageRequest request);

    CompletableFuture<TrustEventsResponse> trustEvents(TrustEventsRequest request);

    CompletableFuture<UnregisterMessageResponse> unregisterMessage(UnregisterMessageRequest request);

    CompletableFuture<VerifyMessageResponse> verifyMessage(VerifyMessageRequest request);

}
