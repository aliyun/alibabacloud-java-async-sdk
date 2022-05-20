// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mns_open20220119;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.mns_open20220119.models.*;
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

    CompletableFuture<CreateQueueResponse> createQueue(CreateQueueRequest request);

    CompletableFuture<CreateTopicResponse> createTopic(CreateTopicRequest request);

    CompletableFuture<DeleteQueueResponse> deleteQueue(DeleteQueueRequest request);

    CompletableFuture<DeleteTopicResponse> deleteTopic(DeleteTopicRequest request);

    CompletableFuture<GetQueueAttributesResponse> getQueueAttributes(GetQueueAttributesRequest request);

    CompletableFuture<GetSubscriptionAttributesResponse> getSubscriptionAttributes(GetSubscriptionAttributesRequest request);

    CompletableFuture<GetTopicAttributesResponse> getTopicAttributes(GetTopicAttributesRequest request);

    CompletableFuture<ListQueueResponse> listQueue(ListQueueRequest request);

    CompletableFuture<ListSubscriptionByTopicResponse> listSubscriptionByTopic(ListSubscriptionByTopicRequest request);

    CompletableFuture<ListTopicResponse> listTopic(ListTopicRequest request);

    CompletableFuture<SetQueueAttributesResponse> setQueueAttributes(SetQueueAttributesRequest request);

    CompletableFuture<SetSubscriptionAttributesResponse> setSubscriptionAttributes(SetSubscriptionAttributesRequest request);

    CompletableFuture<SetTopicAttributesResponse> setTopicAttributes(SetTopicAttributesRequest request);

    CompletableFuture<SubscribeResponse> subscribe(SubscribeRequest request);

    CompletableFuture<UnsubscribeResponse> unsubscribe(UnsubscribeRequest request);

}
