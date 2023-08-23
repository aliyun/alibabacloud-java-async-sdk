// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ess20220222.models.*;
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

    CompletableFuture<AttachServerGroupsResponse> attachServerGroups(AttachServerGroupsRequest request);

    CompletableFuture<AttachVServerGroupsResponse> attachVServerGroups(AttachVServerGroupsRequest request);

    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
      * If you set the LifecycleActionResult parameter for a lifecycle hook of a scaling group to CONTINUE in the operation, Auto Scaling continues to complete the scaling activity in the scaling group after the lifecycle hook times out. If you set the LifecycleActionResult parameter to ABANDON, Auto Scaling stops the scaling activity in the scaling group after the lifecycle hook times out.
      *
     */
    CompletableFuture<CompleteLifecycleActionResponse> completeLifecycleAction(CompleteLifecycleActionRequest request);

    CompletableFuture<CreateAlarmResponse> createAlarm(CreateAlarmRequest request);

    /**
      * A scaling configuration is a template that is used to create elastic container instances during scale-out activities.
      * You can specify the Cpu and Memory parameters to determine the range of instance types. If you specify the parameters, Auto Scaling determines the available instance types based on factors such as I/O optimization requirements and zones. Auto Scaling preferentially creates elastic container instances of the instance type that is provided at the lowest price. This scaling mode is available only if Scaling Policy is set to Cost Optimization Policy and no instance type is specified in the scaling configuration.
      *
     */
    CompletableFuture<CreateEciScalingConfigurationResponse> createEciScalingConfiguration(CreateEciScalingConfigurationRequest request);

    /**
      * You can create up to six lifecycle hooks for each scaling group. Elastic Compute Service (ECS) instances are not immediately added to or removed from scaling groups that have effective lifecycle hooks during scaling activities. The ECS instances are added to or removed from the scaling groups only after the lifecycle hooks time out. The period of time before the lifecycle hooks time out is specified by the HeartbeatTimeout parameter. Before lifecycle hooks time out, you can initialize the configurations of ECS instances and query data on the ECS instances.
      * If lifecycle hooks take effect for scale-out activities, the private IP addresses of ECS instances are added to the IP address whitelists of the associated ApsaraDB RDS instances and the ECS instances are added to the backend server groups of the associated Server Load Balancer (SLB) instances only after the lifecycle hooks time out. If lifecycle hooks take effect for scale-in activities, the private IP addresses of ECS instances are removed from the IP address whitelists of the disassociated ApsaraDB RDS instances and the ECS instances are removed from the backend server groups of the disassociated SLB instances only after the lifecycle hooks time out.
      * You can configure a notification method for a lifecycle hook. When the lifecycle hook takes effect, a notification can be sent by using a Message Service (MNS) topic, an MNS queue, or an Operation Orchestration Service (OOS) template. If you want to configure an OOS template, you must create a RAM role for OOS. For more information, see [Grant RAM permissions to OOS](~~120810~~).
      * > If your scaling group contains ECS instances and you configure an OOS template to add the private IP addresses of the ECS instances to or remove the private IP addresses of the ECS instances from the IP address whitelists of cloud databases other than ApsaraDB RDS databases, you must manually add the private IP addresses of the ECS instances to the IP address whitelists of the cloud databases.
      *
     */
    CompletableFuture<CreateLifecycleHookResponse> createLifecycleHook(CreateLifecycleHookRequest request);

    CompletableFuture<CreateNotificationConfigurationResponse> createNotificationConfiguration(CreateNotificationConfigurationRequest request);

    /**
      * Auto Scaling automatically creates Elastic Compute Service (ECS) instances based on the specified scaling configuration. ECS instances can be created in the following modes:
      * *   InstancePatternInfos: intelligent configuration mode. In this mode, you need to only specify the number of vCPUs, memory size, instance family, and maximum price. Auto Scaling selects the instance type that has the lowest price based on the configurations to create ECS instances. This mode is available only for scaling groups that reside in virtual private clouds (VPCs). This mode reduces scale-out failures caused by insufficient inventory of instance types.
      * *   InstanceType: In this mode, you must specify one instance type.
      * *   InstanceTypes: In this mode, you can specify more than one instance type.
      * *   InstanceTypeOverrides: In this mode, you can specify multiple instance types and weights for the instance types.
      * *   Cpu and Memory: In this mode, you must specify the number of vCPUs and the memory size. Auto Scaling determines the range of available instance types based on factors such as I/O optimization requirements and zones. Then, Auto Scaling creates ECS instances by using the lowest-priced instance type. This mode is available only if Scaling Policy is set to Cost Optimization Policy and no instance type is specified in the scaling configuration.
      * > You cannot specify InstanceType, InstanceTypes, InstanceTypeOverrides, and Cpu and Memory at the same time. You can specify InstanceType and InstancePatternInfos or specify InstanceTypes and InstancePatternInfo at the same time. If you specify InstanceType and InstancePatternInfos or specify InstanceTypes and InstancePatternInfos at the same time, Auto Scaling preferentially uses the instance types that are specified by InstanceType or InstanceTypes for scale-outs. If the instance types that are specified by InstanceType or InstanceTypes do not have sufficient inventory, Auto Scaling uses the instance types that are specified by InstancePatternInfos for scale-outs.
      *
     */
    CompletableFuture<CreateScalingConfigurationResponse> createScalingConfiguration(CreateScalingConfigurationRequest request);

    /**
      * A scaling group is a group of Elastic Compute Service (ECS) instances that can be used in similar business scenarios.
      * You can create only a limited number of scaling groups in a region. Go to Quota Center to check the quota of the scaling groups.
      * A scaling group does not immediately take effect after you create the scaling group. You must call the EnableScalingGroup operation to enable the scaling group. After you enable the scaling group, Auto Scaling can execute scaling rules to trigger scaling activities in the scaling group.
      * The Classic Load Balancer (CLB) instances and ApsaraDB RDS instances that you want to associate with a scaling group must reside in the same region as the scaling group. CLB instances are formerly known as Server Load Balancer (SLB) instances. For more information, see the "Regions and zones" topic.
      * If you associate a CLB instance when you create a scaling group, Auto Scaling automatically adds ECS instances in the scaling group to the backend server group of the associated CLB instance. You can specify a server group to which ECS instances can be added. You can add ECS instances to the following types of server groups:
      * *   Default server group: a group of ECS instances that are used to receive requests. If you do not specify a vServer group or a primary/secondary server group for a listener, requests are forwarded to the ECS instances in the default server group.
      * *   vServer group: If you want to forward requests to backend servers that are not in the default server group or configure domain name-based or URL-based forwarding rules, you can use vServer groups.
      * > If you specify the default server group and multiple vServer groups at the same time, ECS instances are added to all specified server groups.
      * The default weight of an ECS instance that is added as a backend server of a CLB instance is 50. The CLB instance that you want to associate with your scaling group must meet the following requirements:
      * *   The CLB instance must be in the Active state. You can call the DescribeLoadBalancers operation to query the state of the CLB instance.
      * *   The health check feature must be enabled on all listener ports that are configured for the CLB instance. Otherwise, the scaling group fails to be created.
      * If you associate an Application Load Balancer (ALB) server group with a scaling group, Auto Scaling automatically adds ECS instances that are in the scaling group to the ALB server group to process requests distributed by the ALB instance to which the ALB server group belongs. You can specify multiple ALB server groups. The server groups must reside in the same virtual private cloud (VPC) as the scaling group. For more information, see the "AttachAlbServerGroups" topic.
      * If you associate an ApsaraDB RDS instance with a scaling group, Auto Scaling automatically adds the private IP addresses of the ECS instances in the scaling group to the IP address whitelist of the ApsaraDB RDS instance. The ApsaraDB RDS instance that you want to associate with your scaling group must meet the following requirements:
      * *   The ApsaraDB RDS instance must be in the Running state. You can call the DescribeDBInstances operation to query the state of the ApsaraDB RDS instance.
      * *   The number of IP addresses in the IP address whitelist of the ApsaraDB RDS instance cannot exceed the upper limit. For more information, see the "Configure whitelists" topic.
      * If you set the MultiAZPolicy parameter of the scaling group to COST_OPTIMIZED, take note of the following items:
      * *   You can use the OnDemandBaseCapacity, OnDemandPercentageAboveBaseCapacity, and SpotInstancePools parameters to specify the instance allocation method based on the cost optimization policy. This instance allocation method is prioritized during scaling.
      * *   If you do not specify the OnDemandBaseCapacity, OnDemandPercentageAboveBaseCapacity, or SpotInstancePools parameter, the instance types that are provided at the lowest price are used to create instances based on the cost optimization policy.
      * If you set the `Tags.Propagate` parameter of the scaling group to true, the following rules apply:
      * *   Tags that you add to the scaling group cannot be propagated to existing instances in the scaling group. Tags that you add to the scaling group are propagated to only new instances.
      * *   If you specify instance tags in the scaling configuration that is used to create instances and propagate the tags that you add to the scaling group to the instances, all tags exist at the same time.
      * *   If the tag key that you specify in a scaling configuration and the tag key that you add to the scaling group of the scaling configuration are the same, the tag value that you specify in the scaling configuration is preferentially used.
      *
     */
    CompletableFuture<CreateScalingGroupResponse> createScalingGroup(CreateScalingGroupRequest request);

    /**
      * A scaling rule defines a specific scaling activity, such as adding or removing N instances. If the number of Elastic Compute Service (ECS) instances in a scaling group is less than the minimum number allowed or greater than the maximum number allowed after a scaling rule is executed, Auto Scaling calculates the number of ECS instances that need to be added or removed. This ensures that the number of ECS instances can be maintained within the valid range after the scaling rule is executed. Examples:
      * *   If your scaling group contains two ECS instances and allows up to three ECS instances, only one ECS instance is added to your scaling group after you execute a scale-out rule in which three ECS instances are specified.
      * *   If your scaling group contains three ECS instances and requires at least two ECS instances, only one ECS instance is removed from your scaling group after you execute a scale-in rule in which five ECS instances are specified.
      * Before you call this operation, take note of the following items:
      * *   If you set AdjustmentType to TotalCapacity, the number of ECS instances in the scaling group is adjusted to the specified value. The value of AdjustmentValue must be greater than or equal to 0.
      * *   If you set AdjustmentType to QuantityChangeInCapacity, a positive value of AdjustmentValue specifies the number of ECS instances that are added to the scaling group, and a negative value of AdjustmentValue specifies the number of ECS instances that are removed from the scaling group.
      * *   If you set AdjustmentType to PercentChangeInCapacity, Auto Scaling uses the following formula to calculate a value, and then rounds the value to the nearest integer to obtain the number of ECS instances that need to be scaled: Value of TotalCapacity × Value of AdjustmentValue/100.
      * *   If you specify a cooldown period for the scaling rule, the specified cooldown period takes effect after the rule is executed. Otherwise, the value of DefaultCooldown of the scaling group takes effect.
      * *   You can create only a limited number of scaling rules for a scaling group. For more information, see the "Limits" topic.
      * *   The unique identifier (ScalingRuleAri) of a scaling rule can be used by the following operations:
      *     *   ExecuteScalingRule: You can call this operation to manually execute a specific scaling rule. In this operation, you can set ScalingRuleAri to the unique identifier of the scaling rule that you want to execute.
      *     *   CreateScheduledTask: You can call this operation to create a scheduled task. In this operation, you can set ScalingRuleAri to the unique identifier of the scaling rule that you want to associate with the scheduled task.
      *
     */
    CompletableFuture<CreateScalingRuleResponse> createScalingRule(CreateScalingRuleRequest request);

    CompletableFuture<CreateScheduledTaskResponse> createScheduledTask(CreateScheduledTaskRequest request);

    CompletableFuture<DeactivateScalingConfigurationResponse> deactivateScalingConfiguration(DeactivateScalingConfigurationRequest request);

    CompletableFuture<DeleteAlarmResponse> deleteAlarm(DeleteAlarmRequest request);

    CompletableFuture<DeleteEciScalingConfigurationResponse> deleteEciScalingConfiguration(DeleteEciScalingConfigurationRequest request);

    CompletableFuture<DeleteLifecycleHookResponse> deleteLifecycleHook(DeleteLifecycleHookRequest request);

    CompletableFuture<DeleteNotificationConfigurationResponse> deleteNotificationConfiguration(DeleteNotificationConfigurationRequest request);

    CompletableFuture<DeleteScalingConfigurationResponse> deleteScalingConfiguration(DeleteScalingConfigurationRequest request);

    CompletableFuture<DeleteScalingGroupResponse> deleteScalingGroup(DeleteScalingGroupRequest request);

    CompletableFuture<DeleteScalingRuleResponse> deleteScalingRule(DeleteScalingRuleRequest request);

    CompletableFuture<DeleteScheduledTaskResponse> deleteScheduledTask(DeleteScheduledTaskRequest request);

    CompletableFuture<DescribeAlarmsResponse> describeAlarms(DescribeAlarmsRequest request);

    CompletableFuture<DescribeEciScalingConfigurationsResponse> describeEciScalingConfigurations(DescribeEciScalingConfigurationsRequest request);

    CompletableFuture<DescribeLifecycleActionsResponse> describeLifecycleActions(DescribeLifecycleActionsRequest request);

    CompletableFuture<DescribeLifecycleHooksResponse> describeLifecycleHooks(DescribeLifecycleHooksRequest request);

    CompletableFuture<DescribeLimitationResponse> describeLimitation(DescribeLimitationRequest request);

    CompletableFuture<DescribeNotificationConfigurationsResponse> describeNotificationConfigurations(DescribeNotificationConfigurationsRequest request);

    CompletableFuture<DescribeNotificationTypesResponse> describeNotificationTypes(DescribeNotificationTypesRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
      * You can specify a scaling group ID to query all scaling activities in the scaling group.
      * You can filter query results based on the status of scaling activities.
      * You can query scaling activities that are executed in the previous 30 days.
      *
     */
    CompletableFuture<DescribeScalingActivitiesResponse> describeScalingActivities(DescribeScalingActivitiesRequest request);

    CompletableFuture<DescribeScalingActivityDetailResponse> describeScalingActivityDetail(DescribeScalingActivityDetailRequest request);

    CompletableFuture<DescribeScalingConfigurationsResponse> describeScalingConfigurations(DescribeScalingConfigurationsRequest request);

    CompletableFuture<DescribeScalingGroupsResponse> describeScalingGroups(DescribeScalingGroupsRequest request);

    CompletableFuture<DescribeScalingInstancesResponse> describeScalingInstances(DescribeScalingInstancesRequest request);

    /**
      * You can specify a scaling group ID to query the information about all scaling rules in a scaling group. You can also specify the scaling rule ID, name, unique identifier, or type in the request parameters as filter conditions.
      *
     */
    CompletableFuture<DescribeScalingRulesResponse> describeScalingRules(DescribeScalingRulesRequest request);

    CompletableFuture<DescribeScheduledTasksResponse> describeScheduledTasks(DescribeScheduledTasksRequest request);

    CompletableFuture<DetachAlbServerGroupsResponse> detachAlbServerGroups(DetachAlbServerGroupsRequest request);

    CompletableFuture<DetachDBInstancesResponse> detachDBInstances(DetachDBInstancesRequest request);

    CompletableFuture<DetachInstancesResponse> detachInstances(DetachInstancesRequest request);

    CompletableFuture<DetachLoadBalancersResponse> detachLoadBalancers(DetachLoadBalancersRequest request);

    CompletableFuture<DetachServerGroupsResponse> detachServerGroups(DetachServerGroupsRequest request);

    CompletableFuture<DetachVServerGroupsResponse> detachVServerGroups(DetachVServerGroupsRequest request);

    CompletableFuture<DisableAlarmResponse> disableAlarm(DisableAlarmRequest request);

    CompletableFuture<DisableScalingGroupResponse> disableScalingGroup(DisableScalingGroupRequest request);

    CompletableFuture<EnableAlarmResponse> enableAlarm(EnableAlarmRequest request);

    /**
      * You can call this operation to enable a scaling group that is in the Inactive state and has an instance configuration source. The instance configuration source can be a scaling configuration, a launch template, or an Elastic Compute Service (ECS) instance that you specified when you created the scaling group. If a scaling group is not in the Inactive state or does not have an active instance configuration source, you cannot call this operation to enable the scaling group.
      * > A scaling group can have only one active instance configuration source. When you call this operation to enable a scaling group, you can specify a scaling configuration or a launch template for the scaling group. If an instance configuration source has been configured for the scaling group before you call this operation, the scaling configuration or launch template that you specify in the request overwrites the original scaling configuration or launch template.
      * If you specify a value for the InstanceIds parameter when you call the operation, Auto Scaling checks whether the total number of ECS instances is within the range allowed in the scaling group after you call the operation.
      * *   If the total number of ECS instances is less than the minimum number of instances required in the scaling group after you call the operation, Auto Scaling automatically creates the required number of pay-as-you-go ECS instances and adds the instances to the scaling group to reach the minimum number. For example, if the minimum number of instances required in your scaling group is five, and you specify the InstanceIds parameter to add two ECS instances to the scaling group, Auto Scaling automatically creates three instances in the scaling group after the two instances are added.
      * *   If the value of the TotalCapacity parameter is greater than the value of the MaxSize parameter, the call fails.
      *
     */
    CompletableFuture<EnableScalingGroupResponse> enableScalingGroup(EnableScalingGroupRequest request);

    CompletableFuture<EnterStandbyResponse> enterStandby(EnterStandbyRequest request);

    CompletableFuture<ExecuteScalingRuleResponse> executeScalingRule(ExecuteScalingRuleRequest request);

    CompletableFuture<ExitStandbyResponse> exitStandby(ExitStandbyRequest request);

    CompletableFuture<ListTagKeysResponse> listTagKeys(ListTagKeysRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ListTagValuesResponse> listTagValues(ListTagValuesRequest request);

    /**
      * *   If you set MetricType to custom, you must report your custom metrics to CloudMonitor before you can create event-triggered tasks by using the custom metrics. For more information, see [Custom monitoring event-triggered tasks](~~74861~~).
      * *   When you create an event-triggered task, you must specify MetricName, DimensionKey, and DimensionValue to determine the range of statistics that you want to aggregate for the metrics of the scaling group. For example, you can specify the user_id and scaling_group dimensions for an event-triggered task to aggregate monitoring data of all Elastic Compute Service (ECS) instances in a scaling group within an Alibaba Cloud account.
      *     *   If you set MetricType to custom, the valid values are your custom metrics.
      *     *   For information about the metrics that are supported if you set MetricType to system, see [Event-triggered task for system monitoring](~~74854~~).
      * > The user_id and scaling_group dimensions are automatically populated. You need to only specify the device and state dimensions. For more information, see `DimensionKey` and `DimensionValue` in the "Request parameters" section of this topic.
      *
     */
    CompletableFuture<ModifyAlarmResponse> modifyAlarm(ModifyAlarmRequest request);

    /**
      * If you want to change the name of a scaling configuration in a scaling group, make sure that the new name is unique within the scaling group.
      *
     */
    CompletableFuture<ModifyEciScalingConfigurationResponse> modifyEciScalingConfiguration(ModifyEciScalingConfigurationRequest request);

    /**
      * You can use one of the following methods to specify the lifecycle hook that you want to modify:
      * *   Specify the lifecycle hook ID by using the LifecycleHookId parameter. When you use this method, the ScalingGroupId and LifecycleHookName parameters are ignored.
      * *   Specify the scaling group ID by using the ScalingGroupId parameter and specify the lifecycle hook name by using the LifecycleHookName parameter.
      *
     */
    CompletableFuture<ModifyLifecycleHookResponse> modifyLifecycleHook(ModifyLifecycleHookRequest request);

    CompletableFuture<ModifyNotificationConfigurationResponse> modifyNotificationConfiguration(ModifyNotificationConfigurationRequest request);

    /**
      * You can change the name of a scaling configuration in a scaling group. The name must be unique within the scaling group.
      *
     */
    CompletableFuture<ModifyScalingConfigurationResponse> modifyScalingConfiguration(ModifyScalingConfigurationRequest request);

    CompletableFuture<ModifyScalingGroupResponse> modifyScalingGroup(ModifyScalingGroupRequest request);

    CompletableFuture<ModifyScalingRuleResponse> modifyScalingRule(ModifyScalingRuleRequest request);

    CompletableFuture<ModifyScheduledTaskResponse> modifyScheduledTask(ModifyScheduledTaskRequest request);

    CompletableFuture<RebalanceInstancesResponse> rebalanceInstances(RebalanceInstancesRequest request);

    CompletableFuture<RecordLifecycleActionHeartbeatResponse> recordLifecycleActionHeartbeat(RecordLifecycleActionHeartbeatRequest request);

    CompletableFuture<RemoveInstancesResponse> removeInstances(RemoveInstancesRequest request);

    CompletableFuture<ResumeProcessesResponse> resumeProcesses(ResumeProcessesRequest request);

    /**
      * The ID of the scaling activity.
      *
     */
    CompletableFuture<ScaleWithAdjustmentResponse> scaleWithAdjustment(ScaleWithAdjustmentRequest request);

    CompletableFuture<SetGroupDeletionProtectionResponse> setGroupDeletionProtection(SetGroupDeletionProtectionRequest request);

    /**
      * Configures the health check feature for Elastic Compute Service (ECS) instances.
      *
     */
    CompletableFuture<SetInstanceHealthResponse> setInstanceHealth(SetInstanceHealthRequest request);

    /**
      * Puts one or more Elastic Compute Service (ECS) instances into the Protected state.
      *
     */
    CompletableFuture<SetInstancesProtectionResponse> setInstancesProtection(SetInstancesProtectionRequest request);

    CompletableFuture<SuspendProcessesResponse> suspendProcesses(SuspendProcessesRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<VerifyAuthenticationResponse> verifyAuthentication(VerifyAuthenticationRequest request);

    CompletableFuture<VerifyUserResponse> verifyUser(VerifyUserRequest request);

}
