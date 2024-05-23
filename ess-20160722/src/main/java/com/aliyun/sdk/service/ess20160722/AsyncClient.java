// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20160722;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ess20160722.models.*;
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
      * @deprecated
      *
     */
    CompletableFuture<AttachInstancesResponse> attachInstances(AttachInstancesRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<CreateScalingConfigurationResponse> createScalingConfiguration(CreateScalingConfigurationRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<CreateScalingGroupResponse> createScalingGroup(CreateScalingGroupRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<CreateScalingRuleResponse> createScalingRule(CreateScalingRuleRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<CreateScheduledTaskResponse> createScheduledTask(CreateScheduledTaskRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DeleteScalingConfigurationResponse> deleteScalingConfiguration(DeleteScalingConfigurationRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DeleteScalingGroupResponse> deleteScalingGroup(DeleteScalingGroupRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DeleteScalingRuleResponse> deleteScalingRule(DeleteScalingRuleRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DeleteScheduledTaskResponse> deleteScheduledTask(DeleteScheduledTaskRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribeAccountAttributesResponse> describeAccountAttributes(DescribeAccountAttributesRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribeCapacityHistoryResponse> describeCapacityHistory(DescribeCapacityHistoryRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribeLimitationResponse> describeLimitation(DescribeLimitationRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribeScalingActivitiesResponse> describeScalingActivities(DescribeScalingActivitiesRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribeScalingActivityDetailResponse> describeScalingActivityDetail(DescribeScalingActivityDetailRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribeScalingConfigurationsResponse> describeScalingConfigurations(DescribeScalingConfigurationsRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribeScalingGroupsResponse> describeScalingGroups(DescribeScalingGroupsRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribeScalingInstancesResponse> describeScalingInstances(DescribeScalingInstancesRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribeScalingRulesResponse> describeScalingRules(DescribeScalingRulesRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribeScheduledTasksResponse> describeScheduledTasks(DescribeScheduledTasksRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DetachInstancesResponse> detachInstances(DetachInstancesRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DisableScalingGroupResponse> disableScalingGroup(DisableScalingGroupRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<EnableScalingGroupResponse> enableScalingGroup(EnableScalingGroupRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ExecuteScalingRuleResponse> executeScalingRule(ExecuteScalingRuleRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ModifyScalingGroupResponse> modifyScalingGroup(ModifyScalingGroupRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ModifyScalingRuleResponse> modifyScalingRule(ModifyScalingRuleRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ModifyScheduledTaskResponse> modifyScheduledTask(ModifyScheduledTaskRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<RemoveInstancesResponse> removeInstances(RemoveInstancesRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<VerifyAuthenticationResponse> verifyAuthentication(VerifyAuthenticationRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<VerifyUserResponse> verifyUser(VerifyUserRequest request);

}
