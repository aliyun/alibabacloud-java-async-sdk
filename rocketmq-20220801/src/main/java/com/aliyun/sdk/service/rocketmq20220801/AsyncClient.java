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
     * @param request the request parameters of CreateAgentConversation  CreateAgentConversationRequest
     * @return CreateAgentConversationResponse
     */
    CompletableFuture<CreateAgentConversationResponse> createAgentConversation(CreateAgentConversationRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: The OpenAPI operations provided by Alibaba Cloud are management APIs used to manage and query Alibaba Cloud service resources. Use these operations only in the management link. Do not use them in the core data link for sending and receiving messages, as this may introduce risks to the link.</p>
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
     * <p>Notice: The OpenAPI provided by Alibaba Cloud is a management and control API used to manage and query resources of Alibaba Cloud services. Integrate it only into the management and control link. Do not rely on OpenAPI in the core data link for message sending and receiving. Otherwise, risks may occur on the link.</p>
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
     * @param request the request parameters of CreateInstanceInspection  CreateInstanceInspectionRequest
     * @return CreateInstanceInspectionResponse
     */
    CompletableFuture<CreateInstanceInspectionResponse> createInstanceInspection(CreateInstanceInspectionRequest request);

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
     * @param request the request parameters of DeleteAgentConversation  DeleteAgentConversationRequest
     * @return DeleteAgentConversationResponse
     */
    CompletableFuture<DeleteAgentConversationResponse> deleteAgentConversation(DeleteAgentConversationRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: OpenAPI operations provided by Alibaba Cloud are management API operations used to manage and query resources of Alibaba Cloud services. Integrate these operations only into management workflows. Do not rely on OpenAPI operations in the core data link for message sending and receiving. Otherwise, risks may occur in the workflows.
     * After you delete a specified consumer group, consumer clients with the identity of the consumer group cannot consume messages. Invoke this operation with caution.</p>
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
     * @param request the request parameters of DeleteInstanceInspection  DeleteInstanceInspectionRequest
     * @return DeleteInstanceInspectionResponse
     */
    CompletableFuture<DeleteInstanceInspectionResponse> deleteInstanceInspection(DeleteInstanceInspectionRequest request);

    /**
     * @param request the request parameters of DeleteInstanceIpWhitelist  DeleteInstanceIpWhitelistRequest
     * @return DeleteInstanceIpWhitelistResponse
     */
    CompletableFuture<DeleteInstanceIpWhitelistResponse> deleteInstanceIpWhitelist(DeleteInstanceIpWhitelistRequest request);

    /**
     * <b>description</b> :
     * <p>Deleting a topic clears all publish-subscribe relationships under the topic. Call this operation with caution.</p>
     * 
     * @param request the request parameters of DeleteTopic  DeleteTopicRequest
     * @return DeleteTopicResponse
     */
    CompletableFuture<DeleteTopicResponse> deleteTopic(DeleteTopicRequest request);

    /**
     * @param request the request parameters of ExecuteMigrationOperation  ExecuteMigrationOperationRequest
     * @return ExecuteMigrationOperationResponse
     */
    CompletableFuture<ExecuteMigrationOperationResponse> executeMigrationOperation(ExecuteMigrationOperationRequest request);

    /**
     * @param request the request parameters of FinishMigrationStage  FinishMigrationStageRequest
     * @return FinishMigrationStageResponse
     */
    CompletableFuture<FinishMigrationStageResponse> finishMigrationStage(FinishMigrationStageRequest request);

    /**
     * @param request the request parameters of GetAgentConversation  GetAgentConversationRequest
     * @return GetAgentConversationResponse
     */
    CompletableFuture<GetAgentConversationResponse> getAgentConversation(GetAgentConversationRequest request);

    /**
     * @param request the request parameters of GetAgentConversationEvents  GetAgentConversationEventsRequest
     * @return GetAgentConversationEventsResponse
     */
    CompletableFuture<GetAgentConversationEventsResponse> getAgentConversationEvents(GetAgentConversationEventsRequest request);

<ReturnT> CompletableFuture<ReturnT> getAgentConversationEventsWithAsyncResponseHandler(GetAgentConversationEventsRequest request, AsyncResponseHandler<GetAgentConversationEventsResponse, ReturnT> responseHandler);

    ResponseIterable<String> getAgentConversationEventsWithResponseIterable(GetAgentConversationEventsRequest request);

    /**
     * @param request the request parameters of GetAgentConversationTimeline  GetAgentConversationTimelineRequest
     * @return GetAgentConversationTimelineResponse
     */
    CompletableFuture<GetAgentConversationTimelineResponse> getAgentConversationTimeline(GetAgentConversationTimelineRequest request);

    /**
     * @param request the request parameters of GetConsumeTimespan  GetConsumeTimespanRequest
     * @return GetConsumeTimespanResponse
     */
    CompletableFuture<GetConsumeTimespanResponse> getConsumeTimespan(GetConsumeTimespanRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: The OpenAPI provided by Alibaba Cloud is a management and control API used to manage and query related resources of Alibaba Cloud services. It is recommended only for integration in management and control data links. Using OpenAPI in the core data link for message sending and receiving is strictly prohibited. Otherwise, risks may occur in the data link.</p>
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
     * <b>description</b> :
     * <p>Before querying, make sure you have created a Global Replicator backup plan. Before using Global Replicator, your account must have the AliyunServiceRoleForRMQDisasterRecovery service-linked role. This role is used to grant authorization for ApsaraMQ for RocketMQ to access the EventBridge event bus. The system typically creates this role automatically the first time you use the associated feature. If automatic creation failed, create the role manually.</p>
     * 
     * @param request the request parameters of GetDisasterRecoveryPlan  GetDisasterRecoveryPlanRequest
     * @return GetDisasterRecoveryPlanResponse
     */
    CompletableFuture<GetDisasterRecoveryPlanResponse> getDisasterRecoveryPlan(GetDisasterRecoveryPlanRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: The OpenAPI operations provided by Alibaba Cloud are management APIs used to manage and query Alibaba Cloud service resources. Use them only in management and control workflows. Do not rely on OpenAPI in core data link workflows for message sending and receiving, as this may introduce risks to the data link.</notice></p>
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
     * @param request the request parameters of GetInstanceInspection  GetInstanceInspectionRequest
     * @return GetInstanceInspectionResponse
     */
    CompletableFuture<GetInstanceInspectionResponse> getInstanceInspection(GetInstanceInspectionRequest request);

    /**
     * @param request the request parameters of GetInstanceInspectionReport  GetInstanceInspectionReportRequest
     * @return GetInstanceInspectionReportResponse
     */
    CompletableFuture<GetInstanceInspectionReportResponse> getInstanceInspectionReport(GetInstanceInspectionReportRequest request);

    /**
     * @param request the request parameters of GetInstanceInspectionRun  GetInstanceInspectionRunRequest
     * @return GetInstanceInspectionRunResponse
     */
    CompletableFuture<GetInstanceInspectionRunResponse> getInstanceInspectionRun(GetInstanceInspectionRunRequest request);

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
     * @param request the request parameters of ListAgentConversations  ListAgentConversationsRequest
     * @return ListAgentConversationsResponse
     */
    CompletableFuture<ListAgentConversationsResponse> listAgentConversations(ListAgentConversationsRequest request);

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
     * <p>Notice: The OpenAPI provided by Alibaba Cloud is a management and control API used to manage and query related resources of Alibaba Cloud services. It is recommended only for integration in management and control links. Using OpenAPI in the core data link for message sending and receiving is strictly prohibited. Otherwise, risks may occur in the link.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListConsumerGroups  ListConsumerGroupsRequest
     * @return ListConsumerGroupsResponse
     */
    CompletableFuture<ListConsumerGroupsResponse> listConsumerGroups(ListConsumerGroupsRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, create a Global Replicator backup plan and add topic mapping items to the plan. Then use the corresponding planId, itemId, and source instance ID to query consumer offset synchronization checkpoints. To use Global Replicator, make sure that your account has the AliyunServiceRoleForRMQDisasterRecovery service-linked role. The system typically performs automatic creation of this role when you first use the associated feature.</p>
     * 
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
     * @param request the request parameters of ListInspectionTemplates  ListInspectionTemplatesRequest
     * @return ListInspectionTemplatesResponse
     */
    CompletableFuture<ListInspectionTemplatesResponse> listInspectionTemplates(ListInspectionTemplatesRequest request);

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
     * @param request the request parameters of ListInstanceInspectionResources  ListInstanceInspectionResourcesRequest
     * @return ListInstanceInspectionResourcesResponse
     */
    CompletableFuture<ListInstanceInspectionResourcesResponse> listInstanceInspectionResources(ListInstanceInspectionResourcesRequest request);

    /**
     * @param request the request parameters of ListInstanceInspectionRuns  ListInstanceInspectionRunsRequest
     * @return ListInstanceInspectionRunsResponse
     */
    CompletableFuture<ListInstanceInspectionRunsResponse> listInstanceInspectionRuns(ListInstanceInspectionRunsRequest request);

    /**
     * @param request the request parameters of ListInstanceInspections  ListInstanceInspectionsRequest
     * @return ListInstanceInspectionsResponse
     */
    CompletableFuture<ListInstanceInspectionsResponse> listInstanceInspections(ListInstanceInspectionsRequest request);

    /**
     * @param request the request parameters of ListInstanceIpWhitelist  ListInstanceIpWhitelistRequest
     * @return ListInstanceIpWhitelistResponse
     */
    CompletableFuture<ListInstanceIpWhitelistResponse> listInstanceIpWhitelist(ListInstanceIpWhitelistRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: The OpenAPI operations provided by Alibaba Cloud are management API operations that are used to manage and query resources of Alibaba Cloud services. Integrate OpenAPI operations only into the management data link. Do not use OpenAPI operations in the core data link for sending and receiving messages. Otherwise, risks may occur on the data link.</p>
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
     * @param request the request parameters of ListMigrationOperations  ListMigrationOperationsRequest
     * @return ListMigrationOperationsResponse
     */
    CompletableFuture<ListMigrationOperationsResponse> listMigrationOperations(ListMigrationOperationsRequest request);

    /**
     * @param request the request parameters of ListMigrations  ListMigrationsRequest
     * @return ListMigrationsResponse
     */
    CompletableFuture<ListMigrationsResponse> listMigrations(ListMigrationsRequest request);

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
     * @param request the request parameters of RespondAgentConversationAction  RespondAgentConversationActionRequest
     * @return RespondAgentConversationActionResponse
     */
    CompletableFuture<RespondAgentConversationActionResponse> respondAgentConversationAction(RespondAgentConversationActionRequest request);

    /**
     * @param request the request parameters of RunInstanceInspection  RunInstanceInspectionRequest
     * @return RunInstanceInspectionResponse
     */
    CompletableFuture<RunInstanceInspectionResponse> runInstanceInspection(RunInstanceInspectionRequest request);

    /**
     * @param request the request parameters of SendAgentConversationMessage  SendAgentConversationMessageRequest
     * @return SendAgentConversationMessageResponse
     */
    CompletableFuture<SendAgentConversationMessageResponse> sendAgentConversationMessage(SendAgentConversationMessageRequest request);

<ReturnT> CompletableFuture<ReturnT> sendAgentConversationMessageWithAsyncResponseHandler(SendAgentConversationMessageRequest request, AsyncResponseHandler<SendAgentConversationMessageResponse, ReturnT> responseHandler);

    ResponseIterable<String> sendAgentConversationMessageWithResponseIterable(SendAgentConversationMessageRequest request);

    /**
     * @param request the request parameters of StartDisasterRecoveryItem  StartDisasterRecoveryItemRequest
     * @return StartDisasterRecoveryItemResponse
     */
    CompletableFuture<StartDisasterRecoveryItemResponse> startDisasterRecoveryItem(StartDisasterRecoveryItemRequest request);

    /**
     * @param request the request parameters of SteerAgentConversation  SteerAgentConversationRequest
     * @return SteerAgentConversationResponse
     */
    CompletableFuture<SteerAgentConversationResponse> steerAgentConversation(SteerAgentConversationRequest request);

    /**
     * @param request the request parameters of StopAgentConversation  StopAgentConversationRequest
     * @return StopAgentConversationResponse
     */
    CompletableFuture<StopAgentConversationResponse> stopAgentConversation(StopAgentConversationRequest request);

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
     * @param request the request parameters of UpdateAgentConversation  UpdateAgentConversationRequest
     * @return UpdateAgentConversationResponse
     */
    CompletableFuture<UpdateAgentConversationResponse> updateAgentConversation(UpdateAgentConversationRequest request);

    /**
     * @param request the request parameters of UpdateAgentConversationShareScope  UpdateAgentConversationShareScopeRequest
     * @return UpdateAgentConversationShareScopeResponse
     */
    CompletableFuture<UpdateAgentConversationShareScopeResponse> updateAgentConversationShareScope(UpdateAgentConversationShareScopeRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: The OpenAPI provided by Alibaba Cloud is a management and control API used to manage and query resources of Alibaba Cloud services. It is recommended only for integration in management and control links. Do not use OpenAPI in the core data link for sending and receiving messages. Otherwise, risks may occur on the data link.</p>
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
     * <p>Notice: The OpenAPI provided by Alibaba Cloud is a management and control API used to manage and query resources of Alibaba Cloud services. It is recommended only for integration in management and control paths. Do not use OpenAPI in the core data link for sending and receiving messages. Otherwise, risks may occur on the link.</p>
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
     * @param request the request parameters of UpdateInstanceInspection  UpdateInstanceInspectionRequest
     * @return UpdateInstanceInspectionResponse
     */
    CompletableFuture<UpdateInstanceInspectionResponse> updateInstanceInspection(UpdateInstanceInspectionRequest request);

    /**
     * @param request the request parameters of UpdateTopic  UpdateTopicRequest
     * @return UpdateTopicResponse
     */
    CompletableFuture<UpdateTopicResponse> updateTopic(UpdateTopicRequest request);

    /**
     * @param request the request parameters of UploadAgentConversationLog  UploadAgentConversationLogRequest
     * @return UploadAgentConversationLogResponse
     */
    CompletableFuture<UploadAgentConversationLogResponse> uploadAgentConversationLog(UploadAgentConversationLogRequest request);

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
