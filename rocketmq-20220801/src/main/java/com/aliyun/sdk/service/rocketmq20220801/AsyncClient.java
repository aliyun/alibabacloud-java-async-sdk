// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.rocketmq20220801.models.*;
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

    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
      * > API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      *
     */
    CompletableFuture<CreateConsumerGroupResponse> createConsumerGroup(CreateConsumerGroupRequest request);

    /**
      * > API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      *
     */
    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    CompletableFuture<CreateInstanceAccountResponse> createInstanceAccount(CreateInstanceAccountRequest request);

    CompletableFuture<CreateInstanceAclResponse> createInstanceAcl(CreateInstanceAclRequest request);

    CompletableFuture<CreateInstanceIpWhitelistResponse> createInstanceIpWhitelist(CreateInstanceIpWhitelistRequest request);

    CompletableFuture<CreateTopicResponse> createTopic(CreateTopicRequest request);

    /**
      * > API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * After you delete a consumer group, the consumer client associated with the consumer group cannot consume messages. Exercise caution when you call this operation.
      *
     */
    CompletableFuture<DeleteConsumerGroupResponse> deleteConsumerGroup(DeleteConsumerGroupRequest request);

    CompletableFuture<DeleteConsumerGroupSubscriptionResponse> deleteConsumerGroupSubscription(DeleteConsumerGroupSubscriptionRequest request);

    /**
      * > API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * *   After an instance is deleted, the instance cannot be restored. Exercise caution when you call this operation.
      * *   This operation is used to delete a pay-as-you-go instance. A subscription instance is automatically released after it expires. You do not need to manually delete a subscription instance.
      *
     */
    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    CompletableFuture<DeleteInstanceAccountResponse> deleteInstanceAccount(DeleteInstanceAccountRequest request);

    CompletableFuture<DeleteInstanceAclResponse> deleteInstanceAcl(DeleteInstanceAclRequest request);

    CompletableFuture<DeleteInstanceIpWhitelistResponse> deleteInstanceIpWhitelist(DeleteInstanceIpWhitelistRequest request);

    /**
      * If you delete the topic, the publishing and subscription relationships that are established based on the topic are cleared. Exercise caution when you call this operation.
      *
     */
    CompletableFuture<DeleteTopicResponse> deleteTopic(DeleteTopicRequest request);

    /**
      * > API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      *
     */
    CompletableFuture<GetConsumerGroupResponse> getConsumerGroup(GetConsumerGroupRequest request);

    CompletableFuture<GetConsumerGroupLagResponse> getConsumerGroupLag(GetConsumerGroupLagRequest request);

    CompletableFuture<GetConsumerGroupSubscriptionResponse> getConsumerGroupSubscription(GetConsumerGroupSubscriptionRequest request);

    CompletableFuture<GetConsumerStackResponse> getConsumerStack(GetConsumerStackRequest request);

    /**
      * > API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      *
     */
    CompletableFuture<GetInstanceResponse> getInstance(GetInstanceRequest request);

    CompletableFuture<GetInstanceAccountResponse> getInstanceAccount(GetInstanceAccountRequest request);

    CompletableFuture<GetMessageDetailResponse> getMessageDetail(GetMessageDetailRequest request);

    CompletableFuture<GetTopicResponse> getTopic(GetTopicRequest request);

    CompletableFuture<GetTraceResponse> getTrace(GetTraceRequest request);

    CompletableFuture<ListAvailableZonesResponse> listAvailableZones(ListAvailableZonesRequest request);

    CompletableFuture<ListConsumerConnectionsResponse> listConsumerConnections(ListConsumerConnectionsRequest request);

    CompletableFuture<ListConsumerGroupSubscriptionsResponse> listConsumerGroupSubscriptions(ListConsumerGroupSubscriptionsRequest request);

    /**
      * > API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      *
     */
    CompletableFuture<ListConsumerGroupsResponse> listConsumerGroups(ListConsumerGroupsRequest request);

    CompletableFuture<ListInstanceAccountResponse> listInstanceAccount(ListInstanceAccountRequest request);

    CompletableFuture<ListInstanceAclResponse> listInstanceAcl(ListInstanceAclRequest request);

    CompletableFuture<ListInstanceIpWhitelistResponse> listInstanceIpWhitelist(ListInstanceIpWhitelistRequest request);

    /**
      * > API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      *
     */
    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    CompletableFuture<ListMessagesResponse> listMessages(ListMessagesRequest request);

    CompletableFuture<ListRegionsResponse> listRegions(ListRegionsRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ListTopicSubscriptionsResponse> listTopicSubscriptions(ListTopicSubscriptionsRequest request);

    CompletableFuture<ListTopicsResponse> listTopics(ListTopicsRequest request);

    CompletableFuture<ListTracesResponse> listTraces(ListTracesRequest request);

    CompletableFuture<ResetConsumeOffsetResponse> resetConsumeOffset(ResetConsumeOffsetRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
      * > API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      *
     */
    CompletableFuture<UpdateConsumerGroupResponse> updateConsumerGroup(UpdateConsumerGroupRequest request);

    /**
      * > API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      *
     */
    CompletableFuture<UpdateInstanceResponse> updateInstance(UpdateInstanceRequest request);

    CompletableFuture<UpdateInstanceAccountResponse> updateInstanceAccount(UpdateInstanceAccountRequest request);

    CompletableFuture<UpdateInstanceAclResponse> updateInstanceAcl(UpdateInstanceAclRequest request);

    CompletableFuture<UpdateTopicResponse> updateTopic(UpdateTopicRequest request);

    CompletableFuture<VerifyConsumeMessageResponse> verifyConsumeMessage(VerifyConsumeMessageRequest request);

    CompletableFuture<VerifySendMessageResponse> verifySendMessage(VerifySendMessageRequest request);

}
