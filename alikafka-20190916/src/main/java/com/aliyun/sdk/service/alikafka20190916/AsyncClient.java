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

    /**
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
     * @param request the request parameters of ConvertPostPayOrder  ConvertPostPayOrderRequest
     * @return ConvertPostPayOrderResponse
     */
    CompletableFuture<ConvertPostPayOrderResponse> convertPostPayOrder(ConvertPostPayOrderRequest request);

    /**
     * @param request the request parameters of CreateAcl  CreateAclRequest
     * @return CreateAclResponse
     */
    CompletableFuture<CreateAclResponse> createAcl(CreateAclRequest request);

    /**
     * @param request the request parameters of CreateConsumerGroup  CreateConsumerGroupRequest
     * @return CreateConsumerGroupResponse
     */
    CompletableFuture<CreateConsumerGroupResponse> createConsumerGroup(CreateConsumerGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing method and pricing of pay-as-you-go Message Queue for Apache Kafka instances. For more information, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * 
     * @param request the request parameters of CreatePostPayOrder  CreatePostPayOrderRequest
     * @return CreatePostPayOrderResponse
     */
    CompletableFuture<CreatePostPayOrderResponse> createPostPayOrder(CreatePostPayOrderRequest request);

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you understand the billing methods and pricing of subscription ApsaraMQ for Kafka instances. For more information, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * <ul>
     * <li>If you create an ApsaraMQ for Kafka instance by calling this operation, the subscription duration is one month and the auto-renewal feature is enabled by default. The auto-renewal cycle is also one month. If you want to change the auto-renewal cycle or disable the auto-renewal feature, you can go to the <a href="https://renew.console.aliyun.com/#/ecs">Renewal</a> page in the Alibaba Cloud Management Console.</li>
     * </ul>
     * 
     * @param request the request parameters of CreatePrePayOrder  CreatePrePayOrderRequest
     * @return CreatePrePayOrderResponse
     */
    CompletableFuture<CreatePrePayOrderResponse> createPrePayOrder(CreatePrePayOrderRequest request);

    /**
     * @param request the request parameters of CreateSaslUser  CreateSaslUserRequest
     * @return CreateSaslUserResponse
     */
    CompletableFuture<CreateSaslUserResponse> createSaslUser(CreateSaslUserRequest request);

    /**
     * <b>description</b> :
     * <h6><a href="#-v3-serverless-"></a>This operation is supported only by serverless ApsaraMQ for Kafka V3 instances.</h6>
     * 
     * @param request the request parameters of CreateScheduledScalingRule  CreateScheduledScalingRuleRequest
     * @return CreateScheduledScalingRuleResponse
     */
    CompletableFuture<CreateScheduledScalingRuleResponse> createScheduledScalingRule(CreateScheduledScalingRuleRequest request);

    /**
     * <b>description</b> :
     * <p>  Each Alibaba Cloud account can call this operation up to once per second.</p>
     * <ul>
     * <li>The maximum number of topics that you can create in an instance is determined by the specification of the instance.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateTopic  CreateTopicRequest
     * @return CreateTopicResponse
     */
    CompletableFuture<CreateTopicResponse> createTopic(CreateTopicRequest request);

    /**
     * @param request the request parameters of DeleteAcl  DeleteAclRequest
     * @return DeleteAclResponse
     */
    CompletableFuture<DeleteAclResponse> deleteAcl(DeleteAclRequest request);

    /**
     * @param request the request parameters of DeleteConsumerGroup  DeleteConsumerGroupRequest
     * @return DeleteConsumerGroupResponse
     */
    CompletableFuture<DeleteConsumerGroupResponse> deleteConsumerGroup(DeleteConsumerGroupRequest request);

    /**
     * @param request the request parameters of DeleteInstance  DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    /**
     * @param request the request parameters of DeleteSaslUser  DeleteSaslUserRequest
     * @return DeleteSaslUserResponse
     */
    CompletableFuture<DeleteSaslUserResponse> deleteSaslUser(DeleteSaslUserRequest request);

    /**
     * <b>description</b> :
     * <h6><a href="#-v3-serverless-"></a>This operation is supported only by serverless ApsaraMQ for Kafka V3 instance.</h6>
     * 
     * @param request the request parameters of DeleteScheduledScalingRule  DeleteScheduledScalingRuleRequest
     * @return DeleteScheduledScalingRuleResponse
     */
    CompletableFuture<DeleteScheduledScalingRuleResponse> deleteScheduledScalingRule(DeleteScheduledScalingRuleRequest request);

    /**
     * @param request the request parameters of DeleteTopic  DeleteTopicRequest
     * @return DeleteTopicResponse
     */
    CompletableFuture<DeleteTopicResponse> deleteTopic(DeleteTopicRequest request);

    /**
     * @param request the request parameters of DescribeAcls  DescribeAclsRequest
     * @return DescribeAclsResponse
     */
    CompletableFuture<DescribeAclsResponse> describeAcls(DescribeAclsRequest request);

    /**
     * @param request the request parameters of DescribeSaslUsers  DescribeSaslUsersRequest
     * @return DescribeSaslUsersResponse
     */
    CompletableFuture<DescribeSaslUsersResponse> describeSaslUsers(DescribeSaslUsersRequest request);

    /**
     * @param request the request parameters of EnableAutoGroupCreation  EnableAutoGroupCreationRequest
     * @return EnableAutoGroupCreationResponse
     */
    CompletableFuture<EnableAutoGroupCreationResponse> enableAutoGroupCreation(EnableAutoGroupCreationRequest request);

    /**
     * @param request the request parameters of EnableAutoTopicCreation  EnableAutoTopicCreationRequest
     * @return EnableAutoTopicCreationResponse
     */
    CompletableFuture<EnableAutoTopicCreationResponse> enableAutoTopicCreation(EnableAutoTopicCreationRequest request);

    /**
     * @param request the request parameters of GetAllInstanceIdList  GetAllInstanceIdListRequest
     * @return GetAllInstanceIdListResponse
     */
    CompletableFuture<GetAllInstanceIdListResponse> getAllInstanceIdList(GetAllInstanceIdListRequest request);

    /**
     * @param request the request parameters of GetAllowedIpList  GetAllowedIpListRequest
     * @return GetAllowedIpListResponse
     */
    CompletableFuture<GetAllowedIpListResponse> getAllowedIpList(GetAllowedIpListRequest request);

    /**
     * <b>description</b> :
     * <h6><a href="#-v3-serverless-"></a>**This operation is supported only by serverless ApsaraMQ for Kafka V3 instances.</h6>
     * 
     * @param request the request parameters of GetAutoScalingConfiguration  GetAutoScalingConfigurationRequest
     * @return GetAutoScalingConfigurationResponse
     */
    CompletableFuture<GetAutoScalingConfigurationResponse> getAutoScalingConfiguration(GetAutoScalingConfigurationRequest request);

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
     * @param request the request parameters of GetKafkaClientIp  GetKafkaClientIpRequest
     * @return GetKafkaClientIpResponse
     */
    CompletableFuture<GetKafkaClientIpResponse> getKafkaClientIp(GetKafkaClientIpRequest request);

    /**
     * @param request the request parameters of GetQuotaTip  GetQuotaTipRequest
     * @return GetQuotaTipResponse
     */
    CompletableFuture<GetQuotaTipResponse> getQuotaTip(GetQuotaTipRequest request);

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

    /**
     * @param request the request parameters of GetTopicSubscribeStatus  GetTopicSubscribeStatusRequest
     * @return GetTopicSubscribeStatusResponse
     */
    CompletableFuture<GetTopicSubscribeStatusResponse> getTopicSubscribeStatus(GetTopicSubscribeStatusRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of ModifyInstanceName  ModifyInstanceNameRequest
     * @return ModifyInstanceNameResponse
     */
    CompletableFuture<ModifyInstanceNameResponse> modifyInstanceName(ModifyInstanceNameRequest request);

    /**
     * @param request the request parameters of ModifyPartitionNum  ModifyPartitionNumRequest
     * @return ModifyPartitionNumResponse
     */
    CompletableFuture<ModifyPartitionNumResponse> modifyPartitionNum(ModifyPartitionNumRequest request);

    /**
     * <b>description</b> :
     * <h6><a href="#-v3-serverless-"></a>This operation is supported only by serverless ApsaraMQ for Kafka V3 instances.</h6>
     * 
     * @param request the request parameters of ModifyScheduledScalingRule  ModifyScheduledScalingRuleRequest
     * @return ModifyScheduledScalingRuleResponse
     */
    CompletableFuture<ModifyScheduledScalingRuleResponse> modifyScheduledScalingRule(ModifyScheduledScalingRuleRequest request);

    /**
     * @param request the request parameters of ModifyTopicRemark  ModifyTopicRemarkRequest
     * @return ModifyTopicRemarkResponse
     */
    CompletableFuture<ModifyTopicRemarkResponse> modifyTopicRemark(ModifyTopicRemarkRequest request);

    /**
     * @param request the request parameters of QueryMessage  QueryMessageRequest
     * @return QueryMessageResponse
     */
    CompletableFuture<QueryMessageResponse> queryMessage(QueryMessageRequest request);

    /**
     * <b>description</b> :
     * <p>You cannot call this operation to release a subscription Message Queue for Apache Kafka instance.</p>
     * 
     * @param request the request parameters of ReleaseInstance  ReleaseInstanceRequest
     * @return ReleaseInstanceResponse
     */
    CompletableFuture<ReleaseInstanceResponse> releaseInstance(ReleaseInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation only if your instance is in the Stopped state.</p>
     * 
     * @param request the request parameters of ReopenInstance  ReopenInstanceRequest
     * @return ReopenInstanceResponse
     */
    CompletableFuture<ReopenInstanceResponse> reopenInstance(ReopenInstanceRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this operation up to twice per second.</p>
     * </blockquote>
     * 
     * @param request the request parameters of StartInstance  StartInstanceRequest
     * @return StartInstanceResponse
     */
    CompletableFuture<StartInstanceResponse> startInstance(StartInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>You cannot stop a subscription ApsaraMQ for Kafka instance. If you want to stop a subscription ApsaraMQ for Kafka instance, submit a ticket.</p>
     * 
     * @param request the request parameters of StopInstance  StopInstanceRequest
     * @return StopInstanceResponse
     */
    CompletableFuture<StopInstanceResponse> stopInstance(StopInstanceRequest request);

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
     * @param request the request parameters of UpdateAllowedIp  UpdateAllowedIpRequest
     * @return UpdateAllowedIpResponse
     */
    CompletableFuture<UpdateAllowedIpResponse> updateAllowedIp(UpdateAllowedIpRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to reset the consumer offset of a specific consumer group. You can use the timestamp or offset parameter to reset the consumer offset of a consumer group. You can implement the following features by configuring a combination of different parameters:</p>
     * <ul>
     * <li>Reset the consumer offsets of one or all subscribed topics of a consumer group to the latest offset. This way, you can consume messages in the topics from the latest offset.</li>
     * <li>Reset the consumer offsets of one or all subscribed topics of a consumer group to a specific point in time. This way, you can consume messages in the topics from the specified point in time.</li>
     * <li>Reset the consumer offset of one subscribed topic of a consumer group to a specific offset in a specific partition. This way, you can consume messages from the specified offset in the specified partition.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateConsumerOffset  UpdateConsumerOffsetRequest
     * @return UpdateConsumerOffsetResponse
     */
    CompletableFuture<UpdateConsumerOffsetResponse> updateConsumerOffset(UpdateConsumerOffsetRequest request);

    /**
     * <b>description</b> :
     * <h2><strong>Permissions</strong></h2>
     * <p>If a RAM user wants to call the <strong>UpdateInstanceConfig</strong> operation, the RAM user must be granted the required permissions. For more information about how to grant permissions, see <a href="https://help.aliyun.com/document_detail/185815.html">RAM policies</a>.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>API</th>
     * <th>Action</th>
     * <th>Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>UpdateInstanceConfig</td>
     * <td>alikafka: UpdateInstance</td>
     * <td>acs:alikafka:<em>:</em>:{instanceId}</td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of UpdateInstanceConfig  UpdateInstanceConfigRequest
     * @return UpdateInstanceConfigResponse
     */
    CompletableFuture<UpdateInstanceConfigResponse> updateInstanceConfig(UpdateInstanceConfigRequest request);

    /**
     * @param request the request parameters of UpdateTopicConfig  UpdateTopicConfigRequest
     * @return UpdateTopicConfigResponse
     */
    CompletableFuture<UpdateTopicConfigResponse> updateTopicConfig(UpdateTopicConfigRequest request);

    /**
     * <b>description</b> :
     * <h2><strong>Permissions</strong></h2>
     * <p>A RAM user must be granted the required permissions before the RAM user calls the <strong>UpgradeInstanceVersion</strong> operation. For information about how to grant permissions, see <a href="https://help.aliyun.com/document_detail/185815.html">RAM policies</a>.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>API</th>
     * <th>Action</th>
     * <th>Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>UpgradeInstanceVersion</td>
     * <td>UpdateInstance</td>
     * <td>acs:alikafka:<em>:</em>:{instanceId}</td>
     * </tr>
     * </tbody></table>
     * <h2><strong>QPS limits</strong></h2>
     * <p>You can send a maximum of two queries per second (QPS).</p>
     * 
     * @param request the request parameters of UpgradeInstanceVersion  UpgradeInstanceVersionRequest
     * @return UpgradeInstanceVersionResponse
     */
    CompletableFuture<UpgradeInstanceVersionResponse> upgradeInstanceVersion(UpgradeInstanceVersionRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing method and pricing of pay-as-you-go Message Queue for Apache Kafka instances. For more information, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * 
     * @param request the request parameters of UpgradePostPayOrder  UpgradePostPayOrderRequest
     * @return UpgradePostPayOrderResponse
     */
    CompletableFuture<UpgradePostPayOrderResponse> upgradePostPayOrder(UpgradePostPayOrderRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing method and pricing of subscription Message Queue for Apache Kafka instances. For more information, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing overview</a>.</p>
     * 
     * @param request the request parameters of UpgradePrePayOrder  UpgradePrePayOrderRequest
     * @return UpgradePrePayOrderResponse
     */
    CompletableFuture<UpgradePrePayOrderResponse> upgradePrePayOrder(UpgradePrePayOrderRequest request);

}
