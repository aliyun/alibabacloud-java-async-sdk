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

    /**
     * @param request the request parameters of AddDisasterRecoveryItem  AddDisasterRecoveryItemRequest
     * @return AddDisasterRecoveryItemResponse
     */
    CompletableFuture<AddDisasterRecoveryItemResponse> addDisasterRecoveryItem(AddDisasterRecoveryItemRequest request);

    /**
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateConsumerGroup  CreateConsumerGroupRequest
     * @return CreateConsumerGroupResponse
     */
    CompletableFuture<CreateConsumerGroupResponse> createConsumerGroup(CreateConsumerGroupRequest request);

    /**
     * @param request the request parameters of CreateDisasterRecoveryPlan  CreateDisasterRecoveryPlanRequest
     * @return CreateDisasterRecoveryPlanResponse
     */
    CompletableFuture<CreateDisasterRecoveryPlanResponse> createDisasterRecoveryPlan(CreateDisasterRecoveryPlanRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateInstance  CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    /**
     * @param request the request parameters of CreateInstanceAccount  CreateInstanceAccountRequest
     * @return CreateInstanceAccountResponse
     */
    CompletableFuture<CreateInstanceAccountResponse> createInstanceAccount(CreateInstanceAccountRequest request);

    /**
     * @param request the request parameters of CreateInstanceAcl  CreateInstanceAclRequest
     * @return CreateInstanceAclResponse
     */
    CompletableFuture<CreateInstanceAclResponse> createInstanceAcl(CreateInstanceAclRequest request);

    /**
     * @param request the request parameters of CreateInstanceIpWhitelist  CreateInstanceIpWhitelistRequest
     * @return CreateInstanceIpWhitelistResponse
     */
    CompletableFuture<CreateInstanceIpWhitelistResponse> createInstanceIpWhitelist(CreateInstanceIpWhitelistRequest request);

    /**
     * @param request the request parameters of CreateTopic  CreateTopicRequest
     * @return CreateTopicResponse
     */
    CompletableFuture<CreateTopicResponse> createTopic(CreateTopicRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
     * After you delete a consumer group, the consumer client associated with the consumer group cannot consume messages. Exercise caution when you call this operation.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteConsumerGroup  DeleteConsumerGroupRequest
     * @return DeleteConsumerGroupResponse
     */
    CompletableFuture<DeleteConsumerGroupResponse> deleteConsumerGroup(DeleteConsumerGroupRequest request);

    /**
     * @param request the request parameters of DeleteConsumerGroupSubscription  DeleteConsumerGroupSubscriptionRequest
     * @return DeleteConsumerGroupSubscriptionResponse
     */
    CompletableFuture<DeleteConsumerGroupSubscriptionResponse> deleteConsumerGroupSubscription(DeleteConsumerGroupSubscriptionRequest request);

    /**
     * @param request the request parameters of DeleteDisasterRecoveryItem  DeleteDisasterRecoveryItemRequest
     * @return DeleteDisasterRecoveryItemResponse
     */
    CompletableFuture<DeleteDisasterRecoveryItemResponse> deleteDisasterRecoveryItem(DeleteDisasterRecoveryItemRequest request);

    /**
     * @param request the request parameters of DeleteDisasterRecoveryPlan  DeleteDisasterRecoveryPlanRequest
     * @return DeleteDisasterRecoveryPlanResponse
     */
    CompletableFuture<DeleteDisasterRecoveryPlanResponse> deleteDisasterRecoveryPlan(DeleteDisasterRecoveryPlanRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * <ul>
     * <li>After an instance is deleted, the instance cannot be restored. Exercise caution when you call this operation.</li>
     * <li>This operation is used to delete a pay-as-you-go instance. A subscription instance is automatically released after it expires. You do not need to manually delete a subscription instance.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteInstance  DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    /**
     * @param request the request parameters of DeleteInstanceAccount  DeleteInstanceAccountRequest
     * @return DeleteInstanceAccountResponse
     */
    CompletableFuture<DeleteInstanceAccountResponse> deleteInstanceAccount(DeleteInstanceAccountRequest request);

    /**
     * @param request the request parameters of DeleteInstanceAcl  DeleteInstanceAclRequest
     * @return DeleteInstanceAclResponse
     */
    CompletableFuture<DeleteInstanceAclResponse> deleteInstanceAcl(DeleteInstanceAclRequest request);

    /**
     * @param request the request parameters of DeleteInstanceIpWhitelist  DeleteInstanceIpWhitelistRequest
     * @return DeleteInstanceIpWhitelistResponse
     */
    CompletableFuture<DeleteInstanceIpWhitelistResponse> deleteInstanceIpWhitelist(DeleteInstanceIpWhitelistRequest request);

    /**
     * <b>description</b> :
     * <p>If you delete the topic, the publishing and subscription relationships that are established based on the topic are cleared. Exercise caution when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteTopic  DeleteTopicRequest
     * @return DeleteTopicResponse
     */
    CompletableFuture<DeleteTopicResponse> deleteTopic(DeleteTopicRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetConsumerGroup  GetConsumerGroupRequest
     * @return GetConsumerGroupResponse
     */
    CompletableFuture<GetConsumerGroupResponse> getConsumerGroup(GetConsumerGroupRequest request);

    /**
     * @param request the request parameters of GetConsumerGroupLag  GetConsumerGroupLagRequest
     * @return GetConsumerGroupLagResponse
     */
    CompletableFuture<GetConsumerGroupLagResponse> getConsumerGroupLag(GetConsumerGroupLagRequest request);

    /**
     * @param request the request parameters of GetConsumerGroupSubscription  GetConsumerGroupSubscriptionRequest
     * @return GetConsumerGroupSubscriptionResponse
     */
    CompletableFuture<GetConsumerGroupSubscriptionResponse> getConsumerGroupSubscription(GetConsumerGroupSubscriptionRequest request);

    /**
     * @param request the request parameters of GetConsumerStack  GetConsumerStackRequest
     * @return GetConsumerStackResponse
     */
    CompletableFuture<GetConsumerStackResponse> getConsumerStack(GetConsumerStackRequest request);

    /**
     * @param request the request parameters of GetDisasterRecoveryItem  GetDisasterRecoveryItemRequest
     * @return GetDisasterRecoveryItemResponse
     */
    CompletableFuture<GetDisasterRecoveryItemResponse> getDisasterRecoveryItem(GetDisasterRecoveryItemRequest request);

    /**
     * @param request the request parameters of GetDisasterRecoveryPlan  GetDisasterRecoveryPlanRequest
     * @return GetDisasterRecoveryPlanResponse
     */
    CompletableFuture<GetDisasterRecoveryPlanResponse> getDisasterRecoveryPlan(GetDisasterRecoveryPlanRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetInstance  GetInstanceRequest
     * @return GetInstanceResponse
     */
    CompletableFuture<GetInstanceResponse> getInstance(GetInstanceRequest request);

    /**
     * @param request the request parameters of GetInstanceAccount  GetInstanceAccountRequest
     * @return GetInstanceAccountResponse
     */
    CompletableFuture<GetInstanceAccountResponse> getInstanceAccount(GetInstanceAccountRequest request);

    /**
     * @param request the request parameters of GetInstanceAcl  GetInstanceAclRequest
     * @return GetInstanceAclResponse
     */
    CompletableFuture<GetInstanceAclResponse> getInstanceAcl(GetInstanceAclRequest request);

    /**
     * @param request the request parameters of GetInstanceIpWhitelist  GetInstanceIpWhitelistRequest
     * @return GetInstanceIpWhitelistResponse
     */
    CompletableFuture<GetInstanceIpWhitelistResponse> getInstanceIpWhitelist(GetInstanceIpWhitelistRequest request);

    /**
     * @param request the request parameters of GetMessageDetail  GetMessageDetailRequest
     * @return GetMessageDetailResponse
     */
    CompletableFuture<GetMessageDetailResponse> getMessageDetail(GetMessageDetailRequest request);

    /**
     * @param request the request parameters of GetTopic  GetTopicRequest
     * @return GetTopicResponse
     */
    CompletableFuture<GetTopicResponse> getTopic(GetTopicRequest request);

    /**
     * @param request the request parameters of GetTrace  GetTraceRequest
     * @return GetTraceResponse
     */
    CompletableFuture<GetTraceResponse> getTrace(GetTraceRequest request);

    /**
     * @param request the request parameters of ListAvailableZones  ListAvailableZonesRequest
     * @return ListAvailableZonesResponse
     */
    CompletableFuture<ListAvailableZonesResponse> listAvailableZones(ListAvailableZonesRequest request);

    /**
     * @param request the request parameters of ListConsumerConnections  ListConsumerConnectionsRequest
     * @return ListConsumerConnectionsResponse
     */
    CompletableFuture<ListConsumerConnectionsResponse> listConsumerConnections(ListConsumerConnectionsRequest request);

    /**
     * @param request the request parameters of ListConsumerGroupSubscriptions  ListConsumerGroupSubscriptionsRequest
     * @return ListConsumerGroupSubscriptionsResponse
     */
    CompletableFuture<ListConsumerGroupSubscriptionsResponse> listConsumerGroupSubscriptions(ListConsumerGroupSubscriptionsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListConsumerGroups  ListConsumerGroupsRequest
     * @return ListConsumerGroupsResponse
     */
    CompletableFuture<ListConsumerGroupsResponse> listConsumerGroups(ListConsumerGroupsRequest request);

    /**
     * @param request the request parameters of ListDisasterRecoveryCheckpoints  ListDisasterRecoveryCheckpointsRequest
     * @return ListDisasterRecoveryCheckpointsResponse
     */
    CompletableFuture<ListDisasterRecoveryCheckpointsResponse> listDisasterRecoveryCheckpoints(ListDisasterRecoveryCheckpointsRequest request);

    /**
     * @param request the request parameters of ListDisasterRecoveryItems  ListDisasterRecoveryItemsRequest
     * @return ListDisasterRecoveryItemsResponse
     */
    CompletableFuture<ListDisasterRecoveryItemsResponse> listDisasterRecoveryItems(ListDisasterRecoveryItemsRequest request);

    /**
     * @param request the request parameters of ListDisasterRecoveryPlans  ListDisasterRecoveryPlansRequest
     * @return ListDisasterRecoveryPlansResponse
     */
    CompletableFuture<ListDisasterRecoveryPlansResponse> listDisasterRecoveryPlans(ListDisasterRecoveryPlansRequest request);

    /**
     * @param request the request parameters of ListInstanceAccount  ListInstanceAccountRequest
     * @return ListInstanceAccountResponse
     */
    CompletableFuture<ListInstanceAccountResponse> listInstanceAccount(ListInstanceAccountRequest request);

    /**
     * @param request the request parameters of ListInstanceAcl  ListInstanceAclRequest
     * @return ListInstanceAclResponse
     */
    CompletableFuture<ListInstanceAclResponse> listInstanceAcl(ListInstanceAclRequest request);

    /**
     * @param request the request parameters of ListInstanceIpWhitelist  ListInstanceIpWhitelistRequest
     * @return ListInstanceIpWhitelistResponse
     */
    CompletableFuture<ListInstanceIpWhitelistResponse> listInstanceIpWhitelist(ListInstanceIpWhitelistRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListInstances  ListInstancesRequest
     * @return ListInstancesResponse
     */
    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    /**
     * @param request the request parameters of ListMessages  ListMessagesRequest
     * @return ListMessagesResponse
     */
    CompletableFuture<ListMessagesResponse> listMessages(ListMessagesRequest request);

    /**
     * @param request the request parameters of ListMetricMeta  ListMetricMetaRequest
     * @return ListMetricMetaResponse
     */
    CompletableFuture<ListMetricMetaResponse> listMetricMeta(ListMetricMetaRequest request);

    /**
     * @param request the request parameters of ListRegions  ListRegionsRequest
     * @return ListRegionsResponse
     */
    CompletableFuture<ListRegionsResponse> listRegions(ListRegionsRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of ListTopicSubscriptions  ListTopicSubscriptionsRequest
     * @return ListTopicSubscriptionsResponse
     */
    CompletableFuture<ListTopicSubscriptionsResponse> listTopicSubscriptions(ListTopicSubscriptionsRequest request);

    /**
     * @param request the request parameters of ListTopics  ListTopicsRequest
     * @return ListTopicsResponse
     */
    CompletableFuture<ListTopicsResponse> listTopics(ListTopicsRequest request);

    /**
     * @param request the request parameters of ListTraces  ListTracesRequest
     * @return ListTracesResponse
     */
    CompletableFuture<ListTracesResponse> listTraces(ListTracesRequest request);

    /**
     * @param request the request parameters of ResetConsumeOffset  ResetConsumeOffsetRequest
     * @return ResetConsumeOffsetResponse
     */
    CompletableFuture<ResetConsumeOffsetResponse> resetConsumeOffset(ResetConsumeOffsetRequest request);

    /**
     * @param request the request parameters of StartDisasterRecoveryItem  StartDisasterRecoveryItemRequest
     * @return StartDisasterRecoveryItemResponse
     */
    CompletableFuture<StartDisasterRecoveryItemResponse> startDisasterRecoveryItem(StartDisasterRecoveryItemRequest request);

    /**
     * @param request the request parameters of StopDisasterRecoveryItem  StopDisasterRecoveryItemRequest
     * @return StopDisasterRecoveryItemResponse
     */
    CompletableFuture<StopDisasterRecoveryItemResponse> stopDisasterRecoveryItem(StopDisasterRecoveryItemRequest request);

    /**
     * @param request the request parameters of SyncDisasterRecoveryCheckpoint  SyncDisasterRecoveryCheckpointRequest
     * @return SyncDisasterRecoveryCheckpointResponse
     */
    CompletableFuture<SyncDisasterRecoveryCheckpointResponse> syncDisasterRecoveryCheckpoint(SyncDisasterRecoveryCheckpointRequest request);

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateConsumerGroup  UpdateConsumerGroupRequest
     * @return UpdateConsumerGroupResponse
     */
    CompletableFuture<UpdateConsumerGroupResponse> updateConsumerGroup(UpdateConsumerGroupRequest request);

    /**
     * @param request the request parameters of UpdateDisasterRecoveryItem  UpdateDisasterRecoveryItemRequest
     * @return UpdateDisasterRecoveryItemResponse
     */
    CompletableFuture<UpdateDisasterRecoveryItemResponse> updateDisasterRecoveryItem(UpdateDisasterRecoveryItemRequest request);

    /**
     * @param request the request parameters of UpdateDisasterRecoveryPlan  UpdateDisasterRecoveryPlanRequest
     * @return UpdateDisasterRecoveryPlanResponse
     */
    CompletableFuture<UpdateDisasterRecoveryPlanResponse> updateDisasterRecoveryPlan(UpdateDisasterRecoveryPlanRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateInstance  UpdateInstanceRequest
     * @return UpdateInstanceResponse
     */
    CompletableFuture<UpdateInstanceResponse> updateInstance(UpdateInstanceRequest request);

    /**
     * @param request the request parameters of UpdateInstanceAccount  UpdateInstanceAccountRequest
     * @return UpdateInstanceAccountResponse
     */
    CompletableFuture<UpdateInstanceAccountResponse> updateInstanceAccount(UpdateInstanceAccountRequest request);

    /**
     * @param request the request parameters of UpdateInstanceAcl  UpdateInstanceAclRequest
     * @return UpdateInstanceAclResponse
     */
    CompletableFuture<UpdateInstanceAclResponse> updateInstanceAcl(UpdateInstanceAclRequest request);

    /**
     * @param request the request parameters of UpdateTopic  UpdateTopicRequest
     * @return UpdateTopicResponse
     */
    CompletableFuture<UpdateTopicResponse> updateTopic(UpdateTopicRequest request);

    /**
     * @param request the request parameters of VerifyConsumeMessage  VerifyConsumeMessageRequest
     * @return VerifyConsumeMessageResponse
     */
    CompletableFuture<VerifyConsumeMessageResponse> verifyConsumeMessage(VerifyConsumeMessageRequest request);

    /**
     * @param request the request parameters of VerifySendMessage  VerifySendMessageRequest
     * @return VerifySendMessageResponse
     */
    CompletableFuture<VerifySendMessageResponse> verifySendMessage(VerifySendMessageRequest request);

}
