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

    /**
     * @param request the request parameters of CreateConsumerGroup  CreateConsumerGroupRequest
     * @return CreateConsumerGroupResponse
     */
    CompletableFuture<CreateConsumerGroupResponse> createConsumerGroup(CreateConsumerGroupRequest request);

    /**
     * @param request the request parameters of CreateTopic  CreateTopicRequest
     * @return CreateTopicResponse
     */
    CompletableFuture<CreateTopicResponse> createTopic(CreateTopicRequest request);

    /**
     * @param request the request parameters of DeleteConsumerGroup  DeleteConsumerGroupRequest
     * @return DeleteConsumerGroupResponse
     */
    CompletableFuture<DeleteConsumerGroupResponse> deleteConsumerGroup(DeleteConsumerGroupRequest request);

    /**
     * @param request the request parameters of DeleteTopic  DeleteTopicRequest
     * @return DeleteTopicResponse
     */
    CompletableFuture<DeleteTopicResponse> deleteTopic(DeleteTopicRequest request);

    /**
     * @param request the request parameters of GetConsumerList  GetConsumerListRequest
     * @return GetConsumerListResponse
     */
    CompletableFuture<GetConsumerListResponse> getConsumerList(GetConsumerListRequest request);

    /**
     * @param request the request parameters of GetConsumerProgress  GetConsumerProgressRequest
     * @return GetConsumerProgressResponse
     */
    CompletableFuture<GetConsumerProgressResponse> getConsumerProgress(GetConsumerProgressRequest request);

    /**
     * @param request the request parameters of GetInstanceList  GetInstanceListRequest
     * @return GetInstanceListResponse
     */
    CompletableFuture<GetInstanceListResponse> getInstanceList(GetInstanceListRequest request);

    /**
     * @param request the request parameters of GetTopicList  GetTopicListRequest
     * @return GetTopicListResponse
     */
    CompletableFuture<GetTopicListResponse> getTopicList(GetTopicListRequest request);

    /**
     * @param request the request parameters of GetTopicStatus  GetTopicStatusRequest
     * @return GetTopicStatusResponse
     */
    CompletableFuture<GetTopicStatusResponse> getTopicStatus(GetTopicStatusRequest request);

}
