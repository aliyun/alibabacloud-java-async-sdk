// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.alikafka20190916.models.*;
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

    CompletableFuture<ConvertPostPayOrderResponse> convertPostPayOrder(ConvertPostPayOrderRequest request);

    CompletableFuture<CreateAclResponse> createAcl(CreateAclRequest request);

    CompletableFuture<CreateConsumerGroupResponse> createConsumerGroup(CreateConsumerGroupRequest request);

    /**
      * Before you call this operation, make sure that you understand the billing method and pricing of pay-as-you-go Message Queue for Apache Kafka instances. For more information, see [Billing](~~84737~~).
      *
     */
    CompletableFuture<CreatePostPayOrderResponse> createPostPayOrder(CreatePostPayOrderRequest request);

    /**
      * *   Before you call this operation, make sure that you understand the billing methods and pricing of subscription ApsaraMQ for Kafka instances. For more information, see [Billing](~~84737~~).
      * *   If you create an ApsaraMQ for Kafka instance by calling this operation, the subscription duration is one month and the auto-renewal feature is enabled by default. The auto-renewal cycle is also one month. If you want to change the auto-renewal cycle or disable the auto-renewal feature, you can go to the [Renewal](https://renew.console.aliyun.com/#/ecs) page in the Alibaba Cloud Management Console.
      *
     */
    CompletableFuture<CreatePrePayOrderResponse> createPrePayOrder(CreatePrePayOrderRequest request);

    CompletableFuture<CreateSaslUserResponse> createSaslUser(CreateSaslUserRequest request);

    /**
      * *   Each Alibaba Cloud account can call this operation up to once per second.
      * *   The maximum number of topics that you can create in an instance is determined by the specification of the instance.
      *
     */
    CompletableFuture<CreateTopicResponse> createTopic(CreateTopicRequest request);

    CompletableFuture<DeleteAclResponse> deleteAcl(DeleteAclRequest request);

    CompletableFuture<DeleteConsumerGroupResponse> deleteConsumerGroup(DeleteConsumerGroupRequest request);

    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    CompletableFuture<DeleteSaslUserResponse> deleteSaslUser(DeleteSaslUserRequest request);

    CompletableFuture<DeleteTopicResponse> deleteTopic(DeleteTopicRequest request);

    CompletableFuture<DescribeAclsResponse> describeAcls(DescribeAclsRequest request);

    CompletableFuture<DescribeSaslUsersResponse> describeSaslUsers(DescribeSaslUsersRequest request);

    CompletableFuture<GetAllInstanceIdListResponse> getAllInstanceIdList(GetAllInstanceIdListRequest request);

    CompletableFuture<GetAllowedIpListResponse> getAllowedIpList(GetAllowedIpListRequest request);

    CompletableFuture<GetConsumerListResponse> getConsumerList(GetConsumerListRequest request);

    CompletableFuture<GetConsumerProgressResponse> getConsumerProgress(GetConsumerProgressRequest request);

    CompletableFuture<GetInstanceListResponse> getInstanceList(GetInstanceListRequest request);

    CompletableFuture<GetQuotaTipResponse> getQuotaTip(GetQuotaTipRequest request);

    CompletableFuture<GetTopicListResponse> getTopicList(GetTopicListRequest request);

    CompletableFuture<GetTopicStatusResponse> getTopicStatus(GetTopicStatusRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ModifyInstanceNameResponse> modifyInstanceName(ModifyInstanceNameRequest request);

    CompletableFuture<ModifyPartitionNumResponse> modifyPartitionNum(ModifyPartitionNumRequest request);

    CompletableFuture<ModifyTopicRemarkResponse> modifyTopicRemark(ModifyTopicRemarkRequest request);

    CompletableFuture<QueryMessageResponse> queryMessage(QueryMessageRequest request);

    /**
      * You cannot call this operation to release a subscription Message Queue for Apache Kafka instance.
      *
     */
    CompletableFuture<ReleaseInstanceResponse> releaseInstance(ReleaseInstanceRequest request);

    /**
      * >  You can call this operation up to twice per second.
      *
     */
    CompletableFuture<StartInstanceResponse> startInstance(StartInstanceRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpdateAllowedIpResponse> updateAllowedIp(UpdateAllowedIpRequest request);

    /**
      * You can call this operation to reset the consumer offsets of the subscribed topics of a consumer group. You can specify a timestamp or an offset to reset a consumer offset. You can implement the following features by configuring a combination of different parameters:
      * *   Reset the consumer offsets of one or all subscribed topics of a consumer group to the latest offset. This way, you can consume messages in the topics from the latest offset.
      * *   Reset the consumer offsets of one or all subscribed topics of a consumer group to a specific point in time. This way, you can consume messages in the topics from the specified point in time.
      * *   Reset the consumer offset of one subscribed topic of a consumer group to a specific offset in a specific partition. This way, you can consume messages from the specified offset in the specified partition.
      *
     */
    CompletableFuture<UpdateConsumerOffsetResponse> updateConsumerOffset(UpdateConsumerOffsetRequest request);

    /**
      * ## **Permissions**
      * If a RAM user wants to call the **UpdateInstanceConfig** operation, the RAM user must be granted the required permissions. For more information about how to grant permissions, see [RAM policies](~~185815~~).
      * |API|Action|Resource|
      * |---|---|---|
      * |UpdateInstanceConfig|alikafka: UpdateInstance|acs:alikafka:*:*:{instanceId}|
      *
     */
    CompletableFuture<UpdateInstanceConfigResponse> updateInstanceConfig(UpdateInstanceConfigRequest request);

    CompletableFuture<UpdateTopicConfigResponse> updateTopicConfig(UpdateTopicConfigRequest request);

    /**
      * ## **Permissions**
      * A RAM user must be granted the required permissions before the RAM user calls the **UpgradeInstanceVersion** operation. For information about how to grant permissions, see [RAM policies](~~185815~~).
      * |API|Action|Resource|
      * |---|---|---|
      * |UpgradeInstanceVersion|UpdateInstance|acs:alikafka:*:*:{instanceId}|
      * ## **QPS limits**
      * You can send a maximum of two queries per second (QPS).
      *
     */
    CompletableFuture<UpgradeInstanceVersionResponse> upgradeInstanceVersion(UpgradeInstanceVersionRequest request);

    /**
      * Before you call this operation, make sure that you understand the billing method and pricing of pay-as-you-go Message Queue for Apache Kafka instances. For more information, see [Billing](~~84737~~).
      *
     */
    CompletableFuture<UpgradePostPayOrderResponse> upgradePostPayOrder(UpgradePostPayOrderRequest request);

    /**
      * Before you call this operation, make sure that you understand the billing method and pricing of subscription Message Queue for Apache Kafka instances. For more information, see [Billing overview](~~84737~~).
      *
     */
    CompletableFuture<UpgradePrePayOrderResponse> upgradePrePayOrder(UpgradePrePayOrderRequest request);

}
