// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20181015;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.alikafka20181015.models.*;
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

    CompletableFuture<CreateConsumerGroupResponse> createConsumerGroup(CreateConsumerGroupRequest request);

    CompletableFuture<CreateTopicResponse> createTopic(CreateTopicRequest request);

    CompletableFuture<DeleteConsumerGroupResponse> deleteConsumerGroup(DeleteConsumerGroupRequest request);

    CompletableFuture<DeleteTopicResponse> deleteTopic(DeleteTopicRequest request);

    CompletableFuture<GetConsumerListResponse> getConsumerList(GetConsumerListRequest request);

    CompletableFuture<GetConsumerProgressResponse> getConsumerProgress(GetConsumerProgressRequest request);

    CompletableFuture<GetInstanceListResponse> getInstanceList(GetInstanceListRequest request);

    CompletableFuture<GetTopicListResponse> getTopicList(GetTopicListRequest request);

    CompletableFuture<GetTopicStatusResponse> getTopicStatus(GetTopicStatusRequest request);

}
