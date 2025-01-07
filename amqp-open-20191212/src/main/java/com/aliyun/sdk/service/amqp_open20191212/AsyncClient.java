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
     * @param request the request parameters of CreateAccount  CreateAccountRequest
     * @return CreateAccountResponse
     */
    CompletableFuture<CreateAccountResponse> createAccount(CreateAccountRequest request);

    /**
     * @param request the request parameters of CreateBinding  CreateBindingRequest
     * @return CreateBindingResponse
     */
    CompletableFuture<CreateBindingResponse> createBinding(CreateBindingRequest request);

    /**
     * @param request the request parameters of CreateExchange  CreateExchangeRequest
     * @return CreateExchangeResponse
     */
    CompletableFuture<CreateExchangeResponse> createExchange(CreateExchangeRequest request);

    /**
     * <b>description</b> :
     * <p>*Before you call this operation, make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/606747.html">billing methods and pricing</a> of ApsaraMQ for RabbitMQ.</p>
     * 
     * @param request the request parameters of CreateInstance  CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    /**
     * @param request the request parameters of CreateQueue  CreateQueueRequest
     * @return CreateQueueResponse
     */
    CompletableFuture<CreateQueueResponse> createQueue(CreateQueueRequest request);

    /**
     * @param request the request parameters of CreateVirtualHost  CreateVirtualHostRequest
     * @return CreateVirtualHostResponse
     */
    CompletableFuture<CreateVirtualHostResponse> createVirtualHost(CreateVirtualHostRequest request);

    /**
     * @param request the request parameters of DeleteAccount  DeleteAccountRequest
     * @return DeleteAccountResponse
     */
    CompletableFuture<DeleteAccountResponse> deleteAccount(DeleteAccountRequest request);

    /**
     * @param request the request parameters of DeleteBinding  DeleteBindingRequest
     * @return DeleteBindingResponse
     */
    CompletableFuture<DeleteBindingResponse> deleteBinding(DeleteBindingRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>You cannot delete exchanges of the <strong>headers</strong> and <strong>x-jms-topic</strong> types.</li>
     * <li>You cannot delete built-in exchanges in a vhost. These exchanges are amq.direct, amq.topic, and amq.fanout.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteExchange  DeleteExchangeRequest
     * @return DeleteExchangeResponse
     */
    CompletableFuture<DeleteExchangeResponse> deleteExchange(DeleteExchangeRequest request);

    /**
     * @param request the request parameters of DeleteQueue  DeleteQueueRequest
     * @return DeleteQueueResponse
     */
    CompletableFuture<DeleteQueueResponse> deleteQueue(DeleteQueueRequest request);

    /**
     * <b>description</b> :
     * <p>Before you delete a vhost, make sure that all exchanges and queues in the vhost are deleted.</p>
     * 
     * @param request the request parameters of DeleteVirtualHost  DeleteVirtualHostRequest
     * @return DeleteVirtualHostResponse
     */
    CompletableFuture<DeleteVirtualHostResponse> deleteVirtualHost(DeleteVirtualHostRequest request);

    /**
     * @param request the request parameters of GetInstance  GetInstanceRequest
     * @return GetInstanceResponse
     */
    CompletableFuture<GetInstanceResponse> getInstance(GetInstanceRequest request);

    /**
     * @param request the request parameters of GetMetadataAmount  GetMetadataAmountRequest
     * @return GetMetadataAmountResponse
     */
    CompletableFuture<GetMetadataAmountResponse> getMetadataAmount(GetMetadataAmountRequest request);

    /**
     * @param request the request parameters of ListAccounts  ListAccountsRequest
     * @return ListAccountsResponse
     */
    CompletableFuture<ListAccountsResponse> listAccounts(ListAccountsRequest request);

    /**
     * @param request the request parameters of ListBindings  ListBindingsRequest
     * @return ListBindingsResponse
     */
    CompletableFuture<ListBindingsResponse> listBindings(ListBindingsRequest request);

    /**
     * @param request the request parameters of ListDownStreamBindings  ListDownStreamBindingsRequest
     * @return ListDownStreamBindingsResponse
     */
    CompletableFuture<ListDownStreamBindingsResponse> listDownStreamBindings(ListDownStreamBindingsRequest request);

    /**
     * @param request the request parameters of ListExchangeUpStreamBindings  ListExchangeUpStreamBindingsRequest
     * @return ListExchangeUpStreamBindingsResponse
     */
    CompletableFuture<ListExchangeUpStreamBindingsResponse> listExchangeUpStreamBindings(ListExchangeUpStreamBindingsRequest request);

    /**
     * @param request the request parameters of ListExchanges  ListExchangesRequest
     * @return ListExchangesResponse
     */
    CompletableFuture<ListExchangesResponse> listExchanges(ListExchangesRequest request);

    /**
     * @param request the request parameters of ListInstances  ListInstancesRequest
     * @return ListInstancesResponse
     */
    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>ApsaraMQ for RabbitMQ allows you to query only online consumers.</p>
     * 
     * @param request the request parameters of ListQueueConsumers  ListQueueConsumersRequest
     * @return ListQueueConsumersResponse
     */
    CompletableFuture<ListQueueConsumersResponse> listQueueConsumers(ListQueueConsumersRequest request);

    /**
     * @param request the request parameters of ListQueueUpStreamBindings  ListQueueUpStreamBindingsRequest
     * @return ListQueueUpStreamBindingsResponse
     */
    CompletableFuture<ListQueueUpStreamBindingsResponse> listQueueUpStreamBindings(ListQueueUpStreamBindingsRequest request);

    /**
     * @param request the request parameters of ListQueues  ListQueuesRequest
     * @return ListQueuesResponse
     */
    CompletableFuture<ListQueuesResponse> listQueues(ListQueuesRequest request);

    /**
     * @param request the request parameters of ListVirtualHosts  ListVirtualHostsRequest
     * @return ListVirtualHostsResponse
     */
    CompletableFuture<ListVirtualHostsResponse> listVirtualHosts(ListVirtualHostsRequest request);

    /**
     * @param request the request parameters of UpdateInstance  UpdateInstanceRequest
     * @return UpdateInstanceResponse
     */
    CompletableFuture<UpdateInstanceResponse> updateInstance(UpdateInstanceRequest request);

    /**
     * @param request the request parameters of UpdateInstanceName  UpdateInstanceNameRequest
     * @return UpdateInstanceNameResponse
     */
    CompletableFuture<UpdateInstanceNameResponse> updateInstanceName(UpdateInstanceNameRequest request);

}
