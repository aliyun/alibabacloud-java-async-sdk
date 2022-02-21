// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ess20140828.models.*;
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

    CompletableFuture<AttachAlbServerGroupsResponse> attachAlbServerGroups(AttachAlbServerGroupsRequest request);

    CompletableFuture<AttachDBInstancesResponse> attachDBInstances(AttachDBInstancesRequest request);

    CompletableFuture<AttachInstancesResponse> attachInstances(AttachInstancesRequest request);

    CompletableFuture<AttachLoadBalancersResponse> attachLoadBalancers(AttachLoadBalancersRequest request);

    CompletableFuture<AttachVServerGroupsResponse> attachVServerGroups(AttachVServerGroupsRequest request);

    CompletableFuture<CompleteLifecycleActionResponse> completeLifecycleAction(CompleteLifecycleActionRequest request);

    CompletableFuture<CreateAlarmResponse> createAlarm(CreateAlarmRequest request);

    CompletableFuture<CreateLifecycleHookResponse> createLifecycleHook(CreateLifecycleHookRequest request);

    CompletableFuture<CreateNotificationConfigurationResponse> createNotificationConfiguration(CreateNotificationConfigurationRequest request);

    CompletableFuture<CreateScalingConfigurationResponse> createScalingConfiguration(CreateScalingConfigurationRequest request);

    CompletableFuture<CreateScalingGroupResponse> createScalingGroup(CreateScalingGroupRequest request);

    CompletableFuture<CreateScalingRuleResponse> createScalingRule(CreateScalingRuleRequest request);

    CompletableFuture<CreateScheduledTaskResponse> createScheduledTask(CreateScheduledTaskRequest request);

    CompletableFuture<DeactivateScalingConfigurationResponse> deactivateScalingConfiguration(DeactivateScalingConfigurationRequest request);

    CompletableFuture<DeleteAlarmResponse> deleteAlarm(DeleteAlarmRequest request);

    CompletableFuture<DeleteLifecycleHookResponse> deleteLifecycleHook(DeleteLifecycleHookRequest request);

    CompletableFuture<DeleteNotificationConfigurationResponse> deleteNotificationConfiguration(DeleteNotificationConfigurationRequest request);

    CompletableFuture<DeleteScalingConfigurationResponse> deleteScalingConfiguration(DeleteScalingConfigurationRequest request);

    CompletableFuture<DeleteScalingGroupResponse> deleteScalingGroup(DeleteScalingGroupRequest request);

    CompletableFuture<DeleteScalingRuleResponse> deleteScalingRule(DeleteScalingRuleRequest request);

    CompletableFuture<DeleteScheduledTaskResponse> deleteScheduledTask(DeleteScheduledTaskRequest request);

    CompletableFuture<DescribeAlarmsResponse> describeAlarms(DescribeAlarmsRequest request);

    CompletableFuture<DescribeLifecycleActionsResponse> describeLifecycleActions(DescribeLifecycleActionsRequest request);

    CompletableFuture<DescribeLifecycleHooksResponse> describeLifecycleHooks(DescribeLifecycleHooksRequest request);

    CompletableFuture<DescribeLimitationResponse> describeLimitation(DescribeLimitationRequest request);

    CompletableFuture<DescribeNotificationConfigurationsResponse> describeNotificationConfigurations(DescribeNotificationConfigurationsRequest request);

    CompletableFuture<DescribeNotificationTypesResponse> describeNotificationTypes(DescribeNotificationTypesRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeScalingActivitiesResponse> describeScalingActivities(DescribeScalingActivitiesRequest request);

    CompletableFuture<DescribeScalingActivityDetailResponse> describeScalingActivityDetail(DescribeScalingActivityDetailRequest request);

    CompletableFuture<DescribeScalingConfigurationsResponse> describeScalingConfigurations(DescribeScalingConfigurationsRequest request);

    CompletableFuture<DescribeScalingGroupsResponse> describeScalingGroups(DescribeScalingGroupsRequest request);

    CompletableFuture<DescribeScalingInstancesResponse> describeScalingInstances(DescribeScalingInstancesRequest request);

    CompletableFuture<DescribeScalingRulesResponse> describeScalingRules(DescribeScalingRulesRequest request);

    CompletableFuture<DescribeScheduledTasksResponse> describeScheduledTasks(DescribeScheduledTasksRequest request);

    CompletableFuture<DetachAlbServerGroupsResponse> detachAlbServerGroups(DetachAlbServerGroupsRequest request);

    CompletableFuture<DetachDBInstancesResponse> detachDBInstances(DetachDBInstancesRequest request);

    CompletableFuture<DetachInstancesResponse> detachInstances(DetachInstancesRequest request);

    CompletableFuture<DetachLoadBalancersResponse> detachLoadBalancers(DetachLoadBalancersRequest request);

    CompletableFuture<DetachVServerGroupsResponse> detachVServerGroups(DetachVServerGroupsRequest request);

    CompletableFuture<DisableAlarmResponse> disableAlarm(DisableAlarmRequest request);

    CompletableFuture<DisableScalingGroupResponse> disableScalingGroup(DisableScalingGroupRequest request);

    CompletableFuture<EnableAlarmResponse> enableAlarm(EnableAlarmRequest request);

    CompletableFuture<EnableScalingGroupResponse> enableScalingGroup(EnableScalingGroupRequest request);

    CompletableFuture<EnterStandbyResponse> enterStandby(EnterStandbyRequest request);

    CompletableFuture<ExecuteScalingRuleResponse> executeScalingRule(ExecuteScalingRuleRequest request);

    CompletableFuture<ExitStandbyResponse> exitStandby(ExitStandbyRequest request);

    CompletableFuture<ListTagKeysResponse> listTagKeys(ListTagKeysRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ListTagValuesResponse> listTagValues(ListTagValuesRequest request);

    CompletableFuture<ModifyAlarmResponse> modifyAlarm(ModifyAlarmRequest request);

    CompletableFuture<ModifyLifecycleHookResponse> modifyLifecycleHook(ModifyLifecycleHookRequest request);

    CompletableFuture<ModifyNotificationConfigurationResponse> modifyNotificationConfiguration(ModifyNotificationConfigurationRequest request);

    CompletableFuture<ModifyScalingConfigurationResponse> modifyScalingConfiguration(ModifyScalingConfigurationRequest request);

    CompletableFuture<ModifyScalingGroupResponse> modifyScalingGroup(ModifyScalingGroupRequest request);

    CompletableFuture<ModifyScalingRuleResponse> modifyScalingRule(ModifyScalingRuleRequest request);

    CompletableFuture<ModifyScheduledTaskResponse> modifyScheduledTask(ModifyScheduledTaskRequest request);

    CompletableFuture<RebalanceInstancesResponse> rebalanceInstances(RebalanceInstancesRequest request);

    CompletableFuture<RecordLifecycleActionHeartbeatResponse> recordLifecycleActionHeartbeat(RecordLifecycleActionHeartbeatRequest request);

    CompletableFuture<RemoveInstancesResponse> removeInstances(RemoveInstancesRequest request);

    CompletableFuture<ResumeProcessesResponse> resumeProcesses(ResumeProcessesRequest request);

    CompletableFuture<ScaleWithAdjustmentResponse> scaleWithAdjustment(ScaleWithAdjustmentRequest request);

    CompletableFuture<SetGroupDeletionProtectionResponse> setGroupDeletionProtection(SetGroupDeletionProtectionRequest request);

    CompletableFuture<SetInstanceHealthResponse> setInstanceHealth(SetInstanceHealthRequest request);

    CompletableFuture<SetInstancesProtectionResponse> setInstancesProtection(SetInstancesProtectionRequest request);

    CompletableFuture<SuspendProcessesResponse> suspendProcesses(SuspendProcessesRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<VerifyAuthenticationResponse> verifyAuthentication(VerifyAuthenticationRequest request);

    CompletableFuture<VerifyUserResponse> verifyUser(VerifyUserRequest request);

}
