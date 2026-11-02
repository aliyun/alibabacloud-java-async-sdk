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
     * @param request the request parameters of AddUserDefinedSg  AddUserDefinedSgRequest
     * @return AddUserDefinedSgResponse
     */
    CompletableFuture<AddUserDefinedSgResponse> addUserDefinedSg(AddUserDefinedSgRequest request);

    /**
     * @param request the request parameters of BatchDeleteTopics  BatchDeleteTopicsRequest
     * @return BatchDeleteTopicsResponse
     */
    CompletableFuture<BatchDeleteTopicsResponse> batchDeleteTopics(BatchDeleteTopicsRequest request);

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
     * @param request the request parameters of CreatePostPayInstance  CreatePostPayInstanceRequest
     * @return CreatePostPayInstanceResponse
     */
    CompletableFuture<CreatePostPayInstanceResponse> createPostPayInstance(CreatePostPayInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you fully understand the billing methods and pricing of pay-as-you-go instances. For more information, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing overview</a>.</p>
     * 
     * @param request the request parameters of CreatePostPayOrder  CreatePostPayOrderRequest
     * @return CreatePostPayOrderResponse
     */
    CompletableFuture<CreatePostPayOrderResponse> createPostPayOrder(CreatePostPayOrderRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you call this operation, make sure that you fully understand the billing methods and pricing of subscription instances. For more information, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</li>
     * <li>After you call this operation, the default subscription duration of the purchased subscription instance is one month, and auto-renewal is enabled by default with an auto-renewal epoch of one month. To modify the auto-renewal epoch or disable auto-renewal, go to the <a href="https://renew.console.aliyun.com/#/ecs">Renewal Management</a> page in the Alibaba Cloud Management Console. &lt;props=&quot;china&quot;&gt;For more information, see <a href="https://help.aliyun.com/document_detail/37128.html">Configure auto-renewal</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreatePrePayInstance  CreatePrePayInstanceRequest
     * @return CreatePrePayInstanceResponse
     */
    CompletableFuture<CreatePrePayInstanceResponse> createPrePayInstance(CreatePrePayInstanceRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you call this operation, make sure that you fully understand the billing methods and pricing of subscription instances. For more information, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing overview</a>.</li>
     * <li>After you call this operation, the default subscription duration of the purchased subscription instance is one month, and auto-renewal is enabled by default with an auto-renewal epoch of one month. To modify the auto-renewal epoch or disable auto-renewal, go to the <a href="https://renew.console.aliyun.com/#/ecs">Renewal Management</a> page in the Alibaba Cloud Management Console. &lt;props=&quot;china&quot;&gt;For more information, see <a href="https://help.aliyun.com/document_detail/37128.html">Auto-renewal settings</a>.</li>
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
     * <h6>Only serverless instances are supported.</h6>
     * 
     * @param request the request parameters of CreateScheduledScalingRule  CreateScheduledScalingRuleRequest
     * @return CreateScheduledScalingRuleResponse
     */
    CompletableFuture<CreateScheduledScalingRuleResponse> createScheduledScalingRule(CreateScheduledScalingRuleRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>The maximum request frequency per user is 20 QPS.</li>
     * <li>The maximum number of topics that can be created for each instance depends on the instance edition you purchased.</li>
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
     * <h6>Only serverless instances are supported.</h6>
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
     * @param request the request parameters of DeleteUserDefinedSg  DeleteUserDefinedSgRequest
     * @return DeleteUserDefinedSgResponse
     */
    CompletableFuture<DeleteUserDefinedSgResponse> deleteUserDefinedSg(DeleteUserDefinedSgRequest request);

    /**
     * @param request the request parameters of DescribeAclResourceName  DescribeAclResourceNameRequest
     * @return DescribeAclResourceNameResponse
     */
    CompletableFuture<DescribeAclResourceNameResponse> describeAclResourceName(DescribeAclResourceNameRequest request);

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
     * @param request the request parameters of DowngradePostPayOrder  DowngradePostPayOrderRequest
     * @return DowngradePostPayOrderResponse
     */
    CompletableFuture<DowngradePostPayOrderResponse> downgradePostPayOrder(DowngradePostPayOrderRequest request);

    /**
     * @param request the request parameters of DowngradePrePayOrder  DowngradePrePayOrderRequest
     * @return DowngradePrePayOrderResponse
     */
    CompletableFuture<DowngradePrePayOrderResponse> downgradePrePayOrder(DowngradePrePayOrderRequest request);

    /**
     * <b>description</b> :
     * <p>Currently, only reserved instances support this API operation.
     * Serverless instances are not supported.</p>
     * 
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
     * @param request the request parameters of FailoverTest  FailoverTestRequest
     * @return FailoverTestResponse
     */
    CompletableFuture<FailoverTestResponse> failoverTest(FailoverTestRequest request);

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
     * <h6><strong>Only serverless instances are supported.</strong></h6>
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
     * <b>description</b> :
     * <ul>
     * <li>The collected IP information is obtained from the sampled logs of API requests sent from clients to the server through Kafka.</li>
     * <li>The count indicates the number of connections from the same IP address to different ports recorded by the server within the specified time range.</li>
     * <li>If the minor version of your server is not the latest, the sampled logs may not be accurate enough, which ultimately leads to inaccurate collected IP information. Therefore, upgrade the minor version of your server as soon as possible.</li>
     * </ul>
     * 
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
     * @param request the request parameters of GetRiskList  GetRiskListRequest
     * @return GetRiskListResponse
     */
    CompletableFuture<GetRiskListResponse> getRiskList(GetRiskListRequest request);

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
     * @param request the request parameters of ListRebalanceInfo  ListRebalanceInfoRequest
     * @return ListRebalanceInfoResponse
     */
    CompletableFuture<ListRebalanceInfoResponse> listRebalanceInfo(ListRebalanceInfoRequest request);

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
     * <h6>Only serverless instances are supported.</h6>
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
     * @param request the request parameters of ModifyUserDefinedSg  ModifyUserDefinedSgRequest
     * @return ModifyUserDefinedSgResponse
     */
    CompletableFuture<ModifyUserDefinedSgResponse> modifyUserDefinedSg(ModifyUserDefinedSgRequest request);

    /**
     * @param request the request parameters of QueryMessage  QueryMessageRequest
     * @return QueryMessageResponse
     */
    CompletableFuture<QueryMessageResponse> queryMessage(QueryMessageRequest request);

    /**
     * <b>description</b> :
     * <p>You cannot use this operation to release subscription instances.</p>
     * 
     * @param request the request parameters of ReleaseInstance  ReleaseInstanceRequest
     * @return ReleaseInstanceResponse
     */
    CompletableFuture<ReleaseInstanceResponse> releaseInstance(ReleaseInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation only when the instance is in the Stopped state.</p>
     * 
     * @param request the request parameters of ReopenInstance  ReopenInstanceRequest
     * @return ReopenInstanceResponse
     */
    CompletableFuture<ReopenInstanceResponse> reopenInstance(ReopenInstanceRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The request frequency is limited to 2 queries per second (QPS) for each user.</p>
     * </blockquote>
     * 
     * @param request the request parameters of StartInstance  StartInstanceRequest
     * @return StartInstanceResponse
     */
    CompletableFuture<StartInstanceResponse> startInstance(StartInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>Stopping subscription instances is not currently supported. To stop a subscription instance, submit a ticket.</p>
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
     * <p>This operation resets the consumer offset of a specified consumer group. You can reset the consumer offset by timestamp or by a specific offset value. Using different parameter combinations, you can perform the following tasks:</p>
     * <ul>
     * <li>Consume messages from the latest offset by setting the consumer offset to the latest position. This is supported for a single topic or all topics.</li>
     * <li>Consume messages from the offset of a specified time point by providing a timestamp. This is supported for a single topic or all topics.</li>
     * <li>Reset the consumer offset for a specific partition by providing the target partition ID and consumer offset. This is supported only for a single topic.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateConsumerOffset  UpdateConsumerOffsetRequest
     * @return UpdateConsumerOffsetResponse
     */
    CompletableFuture<UpdateConsumerOffsetResponse> updateConsumerOffset(UpdateConsumerOffsetRequest request);

    /**
     * <b>description</b> :
     * <h2><strong>Permission information</strong></h2>
     * <p>RAM users must obtain authorization before they can call the <strong>UpdateInstanceConfig</strong> operation. For more information, see <a href="https://help.aliyun.com/document_detail/185815.html">RAM access policies</a>.</p>
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
     * <h2><strong>Permission description</strong></h2>
     * <p>RAM users must be authorized before they can call the <strong>UpgradeInstanceVersion</strong> API. For more information about authorization, see <a href="https://help.aliyun.com/document_detail/185815.html">RAM access policy</a>.</p>
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
     * <p>The request frequency is limited to 2 queries per second (QPS) for a single user.</p>
     * 
     * @param request the request parameters of UpgradeInstanceVersion  UpgradeInstanceVersionRequest
     * @return UpgradeInstanceVersionResponse
     */
    CompletableFuture<UpgradeInstanceVersionResponse> upgradeInstanceVersion(UpgradeInstanceVersionRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you fully understand the billing methods and pricing of pay-as-you-go instances. For more information, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * 
     * @param request the request parameters of UpgradePostPayOrder  UpgradePostPayOrderRequest
     * @return UpgradePostPayOrderResponse
     */
    CompletableFuture<UpgradePostPayOrderResponse> upgradePostPayOrder(UpgradePostPayOrderRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you fully understand the billing method and pricing of subscription instances. For more information, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
     * 
     * @param request the request parameters of UpgradePrePayOrder  UpgradePrePayOrderRequest
     * @return UpgradePrePayOrderResponse
     */
    CompletableFuture<UpgradePrePayOrderResponse> upgradePrePayOrder(UpgradePrePayOrderRequest request);

}
