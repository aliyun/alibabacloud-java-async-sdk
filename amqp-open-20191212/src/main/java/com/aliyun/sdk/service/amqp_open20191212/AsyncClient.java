// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.amqp_open20191212.models.*;
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
      *
     */
    CompletableFuture<CreateAccountResponse> createAccount(CreateAccountRequest request);

    CompletableFuture<CreateBindingResponse> createBinding(CreateBindingRequest request);

    CompletableFuture<CreateExchangeResponse> createExchange(CreateExchangeRequest request);

    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    CompletableFuture<CreateQueueResponse> createQueue(CreateQueueRequest request);

    CompletableFuture<CreateVirtualHostResponse> createVirtualHost(CreateVirtualHostRequest request);

    CompletableFuture<DeleteAccountResponse> deleteAccount(DeleteAccountRequest request);

    CompletableFuture<DeleteBindingResponse> deleteBinding(DeleteBindingRequest request);

    /**
      * ## [](#)Usage notes
      * *   You cannot delete exchanges of the **headers** and **x-jms-topic** types.
      * *   You cannot delete built-in exchanges in a vhost. These exchanges are amq.direct, amq.topic, and amq.fanout.
      *
     */
    CompletableFuture<DeleteExchangeResponse> deleteExchange(DeleteExchangeRequest request);

    CompletableFuture<DeleteQueueResponse> deleteQueue(DeleteQueueRequest request);

    /**
      * Before you delete a vhost, make sure that all exchanges and queues in the vhost are deleted.
      *
     */
    CompletableFuture<DeleteVirtualHostResponse> deleteVirtualHost(DeleteVirtualHostRequest request);

    CompletableFuture<GetMetadataAmountResponse> getMetadataAmount(GetMetadataAmountRequest request);

    CompletableFuture<ListAccountsResponse> listAccounts(ListAccountsRequest request);

    CompletableFuture<ListBindingsResponse> listBindings(ListBindingsRequest request);

    CompletableFuture<ListDownStreamBindingsResponse> listDownStreamBindings(ListDownStreamBindingsRequest request);

    CompletableFuture<ListExchangeUpStreamBindingsResponse> listExchangeUpStreamBindings(ListExchangeUpStreamBindingsRequest request);

    CompletableFuture<ListExchangesResponse> listExchanges(ListExchangesRequest request);

    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    /**
      * ApsaraMQ for RabbitMQ allows you to query only online consumers.
      *
     */
    CompletableFuture<ListQueueConsumersResponse> listQueueConsumers(ListQueueConsumersRequest request);

    CompletableFuture<ListQueueUpStreamBindingsResponse> listQueueUpStreamBindings(ListQueueUpStreamBindingsRequest request);

    CompletableFuture<ListQueuesResponse> listQueues(ListQueuesRequest request);

    CompletableFuture<ListVirtualHostsResponse> listVirtualHosts(ListVirtualHostsRequest request);

    CompletableFuture<UpdateInstanceResponse> updateInstance(UpdateInstanceRequest request);

    CompletableFuture<UpdateInstanceNameResponse> updateInstanceName(UpdateInstanceNameRequest request);

}
