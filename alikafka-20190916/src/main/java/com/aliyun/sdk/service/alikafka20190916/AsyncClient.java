// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.alikafka20190916.models.*;
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

    CompletableFuture<CreatePostPayOrderResponse> createPostPayOrder(CreatePostPayOrderRequest request);

    /**
      * The maximum traffic for the instance. We recommend that you do not configure this parameter.
      * *   You must configure at least one of the **IoMax** and **IoMaxSpec** parameters. If both parameters are configured, the value of the **IoMaxSpec** parameter takes effect. We recommend that you configure only the **IoMaxSpec** parameter.
      * *   For more information about the valid values, see [Billing](~~84737~~).
      *
     */
    CompletableFuture<CreatePrePayOrderResponse> createPrePayOrder(CreatePrePayOrderRequest request);

    CompletableFuture<CreateSaslUserResponse> createSaslUser(CreateSaslUserRequest request);

    /**
      * The description of the topic.
      * *   The description can contain only letters, digits, hyphens (-), and underscores (\\_).
      * *   The description must be 3 to 64 characters in length.
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

    /**
      * The region ID of the instance.
      *
     */
    CompletableFuture<ReleaseInstanceResponse> releaseInstance(ReleaseInstanceRequest request);

    CompletableFuture<StartInstanceResponse> startInstance(StartInstanceRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpdateAllowedIpResponse> updateAllowedIp(UpdateAllowedIpRequest request);

    CompletableFuture<UpdateConsumerOffsetResponse> updateConsumerOffset(UpdateConsumerOffsetRequest request);

    /**
      * The region ID of the instance.
      *
     */
    CompletableFuture<UpdateInstanceConfigResponse> updateInstanceConfig(UpdateInstanceConfigRequest request);

    /**
      * ## **Permissions**
      * A RAM user must be granted the required permissions before the RAM user call the **UpgradeInstanceVersion** operation. For information about how to grant permissions, see [RAM policies](~~185815~~).
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
      * The size of the disk.
      * *   The disk size that you specify must be greater than or equal to the current disk size of the instance.
      * *   For more information about the valid values, see [Billing overview](~~84737~~).
      *
     */
    CompletableFuture<UpgradePrePayOrderResponse> upgradePrePayOrder(UpgradePrePayOrderRequest request);

}
