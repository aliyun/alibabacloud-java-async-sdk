// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.amqp_open20191212.models.*;
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

    CompletableFuture<CreateBindingResponse> createBinding(CreateBindingRequest request);

    CompletableFuture<CreateExchangeResponse> createExchange(CreateExchangeRequest request);

    CompletableFuture<CreateQueueResponse> createQueue(CreateQueueRequest request);

    CompletableFuture<CreateVirtualHostResponse> createVirtualHost(CreateVirtualHostRequest request);

    CompletableFuture<DeleteBindingResponse> deleteBinding(DeleteBindingRequest request);

    CompletableFuture<DeleteExchangeResponse> deleteExchange(DeleteExchangeRequest request);

    CompletableFuture<DeleteQueueResponse> deleteQueue(DeleteQueueRequest request);

    CompletableFuture<DeleteVirtualHostResponse> deleteVirtualHost(DeleteVirtualHostRequest request);

    CompletableFuture<GetMetadataAmountResponse> getMetadataAmount(GetMetadataAmountRequest request);

    CompletableFuture<ListBindingsResponse> listBindings(ListBindingsRequest request);

    CompletableFuture<ListDownStreamBindingsResponse> listDownStreamBindings(ListDownStreamBindingsRequest request);

    CompletableFuture<ListExchangeUpStreamBindingsResponse> listExchangeUpStreamBindings(ListExchangeUpStreamBindingsRequest request);

    CompletableFuture<ListExchangesResponse> listExchanges(ListExchangesRequest request);

    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    CompletableFuture<ListQueueConsumersResponse> listQueueConsumers(ListQueueConsumersRequest request);

    CompletableFuture<ListQueueUpStreamBindingsResponse> listQueueUpStreamBindings(ListQueueUpStreamBindingsRequest request);

    CompletableFuture<ListQueuesResponse> listQueues(ListQueuesRequest request);

    CompletableFuture<ListVirtualHostsResponse> listVirtualHosts(ListVirtualHostsRequest request);

    CompletableFuture<UpdateInstanceNameResponse> updateInstanceName(UpdateInstanceNameRequest request);

}
