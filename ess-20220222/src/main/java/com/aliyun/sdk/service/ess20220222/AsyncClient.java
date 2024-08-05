// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ess20220222.models.*;
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
      * Before you use a YAML configuration file to manage scaling configurations of the Elastic Container Instance type, you must take note of the following items:
      * *   If you include a scaling configuration ID within your request, the system updates the scaling configuration based on the YAML configuration file.
      * *   If you do not include a scaling configuration ID within your request, the system creates a scaling configuration of the Elastic Container Instance type based on the YAML configuration file.
      *
     */
    CompletableFuture<ApplyEciScalingConfigurationResponse> applyEciScalingConfiguration(ApplyEciScalingConfigurationRequest request);

    /**
      * You can call the ApplyScalingGroup operation to create scaling groups of the Elastic Container Instance type with ease. The resources of the scaling groups are defined in Kubernetes Deployment YAML files. You can also call this operation to extend annotations for elastic container instances in Kubernetes Deployment YAML files. For more information, see "Supported annotations" in this topic.
      * Mapping between YAML files and scaling groups: You can map the triplet of namespace, kind, and name in a YAML file to a scaling group name. A YAML file and a scaling group have a one-to-one mapping relationship in a region. For example, if you use the Kubernetes Deployment YAML file whose name is NGINX in the default namespace to create a scaling group in a region, the unique name of the mapped scaling group is k8s\\_default\\_Deployment\\_nginx.
      * You can use a Kubernetes Deployment YAML file to manage a scaling group based on the following logic:
      * * If an existing scaling group has a mapping relationship with your Kubernetes Deployment YAML file, you can update the scaling group by using the YAML file.
      * * If no scaling group that has a mapping relationship with your Kubernetes Deployment YAML file exists, you can create a scaling group with ease by using the YAML file.
      * ### Precautions
      * 1. If you do not specify a virtual private cloud (VPC), vSwitch, security group, or annotation in your Kubernetes Deployment YAML file, the system creates a default VPC that has default vSwitches and uses the default security group ess-default-sg of Auto Scaling. By default, the security group rule allows traffic on Transmission Control Protocol (TCP)-based port 22 and port 3389 and enables Internet Control Message Protocol (ICMP) for IPv4 addresses. If you want to enable other ports or protocols, you can create custom security group rules.
      * 2. If you want to use a public image, you must enable the Internet access feature and configure the k8s.aliyun.com/eci-with-eip pod annotation to enable the elastic IP address (EIP) feature.
      * 3. After you call the ApplyScalingGroup operation to apply a Kubernetes Deployment YAML file, the scaling group immediately enters the Enabled state and the scaling configuration immediately enters the Active state. If the number of replicas that you specified in the YAML file is grater than 0, elastic container instances are automatically created.
      * ### Supported annotations
      * For more information about annotations, see [ECI Pod Annotation](~~186939~~).
      * |Annotation|Example|Description|
      * |---|---|---|
      * |k8s.aliyun.com/ess-scaling-group-min-size|1|The minimum size of the scaling group that you want to create. Default value: 0.|
      * |k8s.aliyun.com/ess-scaling-group-max-size|20|The maximum size of the scaling group that you want to create. Default value: maximum number of replicas or 30, whichever is greater.|
      * |k8s.aliyun.com/eci-ntp-server|100.100.*.*|The IP address of the Network Time Protocol (NTP) server.|
      * |k8s.aliyun.com/eci-use-specs|2-4Gi|The specifications of 2 vCPUs and 4 GB memory. For more information, see [Create pods by specifying multiple specifications](~~451267~~).|
      * |k8s.aliyun.com/eci-vswitch|vsw-bp1xpiowfm5vo8o3c\\*\\*\\*\\*|The ID of the vSwitch. You can specify multiple vSwitches to specify multiple zones.|
      * |k8s.aliyun.com/eci-security-group|sg-bp1dktddjsg5nktv\\*\\*\\*\\*|The ID of the security group. Before you configure this annotation, take note of the following requirements:<ul data-sourcepos="26:74-26:168"><li data-sourcepos="26:78-26:114">You can specify one or more security groups. You can specify up to five security groups for each scaling group.</li><li data-sourcepos="26:114-26:140">If you specify multiple security groups, the security groups must belong to the same VPC.</li><li data-sourcepos="26:140-26:163">If you specify multiple security groups, the security groups must be of the same type.</li></ul>|
      * |k8s.aliyun.com/eci-sls-enable|"false"|If you set the value to false, the log collection feature is disabled.
      * If you do not want to use Custom Resource Definition (CRD) for Simple Log Service to collect logs of specific pods, you can configure this annotation for the pods and set the value to false. This prevents resource wastes caused by Logtails created by the system.|
      * |k8s.aliyun.com/eci-spot-strategy|SpotAsPriceGo|The bidding policy for the preemptible instance. Valid values:<ul data-sourcepos="28:69-28:204"><li data-sourcepos="28:73-28:158">SpotWithPriceLimit: The instance is created as a preemptible instance for which you specify the maximum hourly price If you set the value to SpotWithPriceLimit, you must configure the k8s.aliyun.com/eci-spot-price-limit annotation.</li><li data-sourcepos="28:158-28:199">SpotAsPriceGo: The instance is a preemptible instance for which the market price at the time of purchase is used as the bid price.</li></ul>|
      * |k8s.aliyun.com/eci-spot-price-limit|"0.5"|The maximum hourly price of the preemptible instance. This value can be accurate to up to three decimal places.
      * This annotation takes effect only when you set the k8s.aliyun.com/eci-spot-strategy annotation to SpotWithPriceLimit.|
      * |k8s.aliyun.com/eci-with-eip|"true"|If you set the value to true, an EIP is automatically created and bound to each elastic container instance.|
      * |k8s.aliyun.com/eci-data-cache-bucket|default|The bucket of the specified DataCache. If you want to use a DataCache to create a pod, you must configure this annotation.|
      * |k8s.aliyun.com/eci-data-cache-pl|PL1|The performance level (PL) of the cloud disk that you want to create by using the specified DataCache.
      * By default, enhanced SSDs (ESSDs) are created. Default value: PL1.|
      * |k8s.aliyun.com/eci-data-cache-provisionedIops|"40000"|The provisioned read/write IOPS of the ESSD AutoPL disk. Valid values: 0 to min{50000, 1000 × Capacity - Baseline IOPS}. Baseline IOPS = min{1,800 + 50 × Capacity, 50,000}. For more information, see [ESSD AutoPL](~~368372~~).
      * If you configure this annotation, the cloud disk that is created by using the specified DataCache is of the ESSD AutoPL type.|
      * |k8s.aliyun.com/eci-data-cache-burstingEnabled|"true"|Specifies whether the Burst feature is enabled for the ESSD AutoPL disk. For more information, see [ESSD AutoPL](~~368372~~).
      * If you configure this annotation, the cloud disk that is created by using the specified DataCache is of the ESSD AutoPL type.|
      * |k8s.aliyun.com/eci-custom-tags|"env:test,name:alice"|The tags that you want to add to each elastic container instance. You can add up to three tags for each elastic container instance. Separate a tag key and a tag value with a colon (:). Separate multiple tags with commas (,).|
      *
     */
    CompletableFuture<ApplyScalingGroupResponse> applyScalingGroup(ApplyScalingGroupRequest request);

    /**
      * Before you call the operation to attach an ALB server group to your scaling group, make sure that the following requirements are met:
      * *   The scaling group and the ALB server group share the same virtual private cloud (VPC).
      * *   The ALB server group is in the Available state.
      *
     */
    CompletableFuture<AttachAlbServerGroupsResponse> attachAlbServerGroups(AttachAlbServerGroupsRequest request);

    /**
      * Before you associate an ApsaraDB RDS instance with a scaling group, make sure that the ApsaraDB RDS instance meets the following requirements:
      * *   The ApsaraDB RDS instance and the scaling group must belong to the same Alibaba Cloud account.
      * *   The ApsaraDB RDS instance must be unlocked. For more information about the lock policy, see [ApsaraDB RDS usage notes](~~41872~~).
      * *   The ApsaraDB RDS instance must be in the Running state.
      * After an ApsaraDB RDS instance is associated with the scaling group, the default IP address whitelist of the ApsaraDB RDS instance can contain no more than 1,000 IP addresses. For more information, see [Set the whitelist](~~43185~~).
      *
     */
    CompletableFuture<AttachDBInstancesResponse> attachDBInstances(AttachDBInstancesRequest request);

    /**
      * Before you call this operation, take note of the following items:
      * *   The scaling group is in the Active state.
      * *   No scaling activities in the scaling group are in progress.
      * The ECS instances or the elastic container instances that you want to add to a scaling group must meet the following requirements:
      * *   The instances reside in the same region as the scaling group.
      * *   The instances must be in the Running state.
      * *   The instances are not added to other scaling groups.
      * *   The instances use the subscription or pay-as-you-go billing method, or are preemptible instances.
      * *   If the VswitchID parameter is specified for a scaling group, the instances that are in the classic network or those that are not in the same virtual private cloud (VPC) as the specified vSwitch cannot be added to the scaling group.
      * *   If the VswitchID parameter is not specified for a scaling group, the instances that are in VPCs cannot be added to the scaling group.
      * If no scaling activities in the specified scaling group are in progress, the operation can trigger scaling activities even before the cooldown time expires.
      * A successful call indicates that Auto Scaling accepts the request. However, the scaling activity may still fail. You can obtain the status of a scaling activity by using the value of the ScalingActivityId parameter in the response.
      * If the sum of the number of instances that you want to add and the number of existing instances in the scaling group is greater than the value of the MaxSize parameter, the call fails.
      * Instances that are manually added by calling the AttachInstances operation are not associated with the active scaling configuration of the scaling group.
      *
     */
    CompletableFuture<AttachInstancesResponse> attachInstances(AttachInstancesRequest request);

    /**
      * Before you call this operation, make sure that the following requirements are met:
      * *   The load balancer and the scaling group belong to the same Alibaba Cloud account and region.
      * *   The load balancer is in the `Running` state.
      * *   At least one listener is configured for the load balancer, and the health check feature is enabled for the load balancer.
      * *   If the network type of the load balancer and the scaling group is virtual private cloud (VPC), they use the same VPC.
      * *   If the network type of the scaling group is VPC, and that of the load balancer is classic network and a backend server of the load balancer uses a VPC, the scaling group and the backend server use the same VPC.
      * *   The attachment of load balancers ensures that the cumulative number of load balancers attached to the scaling group stays within the predefined maximum limit. For information about the load balancer quota, see [Limits](~~25863~~).
      *
     */
    CompletableFuture<AttachLoadBalancersResponse> attachLoadBalancers(AttachLoadBalancersRequest request);

    CompletableFuture<AttachServerGroupsResponse> attachServerGroups(AttachServerGroupsRequest request);

    /**
      * *   Before you call this operation, make sure that the following requirements are met:
      *     *   The CLB instance and the scaling group belong to the same Alibaba Cloud account.
      *     *   The CLB instance and the scaling group reside in the same region.
      *     *   The CLB instance is in the Running state.
      *     *   The CLB instance is configured with at least one listener. The health check feature is enabled for the CLB instance.
      *     *   If the network type of both the CLB instance and the scaling group is virtual private cloud (VPC), they use the same VPC.
      *     *   If the network type of the scaling group is VPC and the network type of the CLB instance is classic network, any backend server of the CLB instance within a VPC setup shares the same VPC as the scaling group.
      *     *   The vServer groups that you want to attach to the scaling group belong to the CLB instance.
      *     *   The operation to attach vServer groups does not result in the total number of vServer groups exceeding the predefined quota limit. For information about the vServer group quota, see [Limits](~~25863~~).
      * *   When you call this operation to attach vServer groups, you must specify the following parameters:
      *     *   LoadBalancerId: the ID of the CLB instance
      *     *   VServerGroupId: the ID of the vServer group
      *     *   Port: the port number of the vServer group
      *     **
      *     **Note** If you attempt to attach the same vServer group to a scaling group multiple times over the identical port, the system regards each attempt as a separate vServer group attachment to the scaling group. In your request, if you include the same vServer group ID coupled with the same port number multiple times, only the first configuration of the vServer group and port number pairing is considered valid. Subsequent vServer group and port number parings are disregarded.
      *
     */
    CompletableFuture<AttachVServerGroupsResponse> attachVServerGroups(AttachVServerGroupsRequest request);

    /**
      * *   A resource is an entity of cloud services that you create on Alibaba Cloud. For example, a scaling group is a resource.
      * *   A resource group serves as a powerful organizational tool within your Alibaba Cloud account, enabling you to manage and monitor multiple resources collectively. It effectively addresses complexities surrounding resource categorization and permission control under a single Alibaba Cloud account, thereby enhancing management efficiency and control. For more information, see [What is resource management?](~~94475~~)
      *
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
      * When you manually cut short the timeout period of a lifecycle hook, Auto Scaling proceeds with one of the following actions based on the predefined settings: responding to the scaling request, aborting the scaling request, and initiating a rollback process.
      *
     */
    CompletableFuture<CompleteLifecycleActionResponse> completeLifecycleAction(CompleteLifecycleActionRequest request);

    /**
      * *   If you set MetricType to custom, you must report your custom metrics to CloudMonitor before you can create event-triggered tasks by using the custom metrics. For more information, see [Event-triggered tasks of the custom monitoring type](~~74861~~).
      * *   When you create an event-triggered task, you must specify MetricName, Dimensions.DimensionKey, and Dimensions.DimensionValue to determine the range of statistics that you want to aggregate for the metrics of the scaling group. For example, you can specify user_id and scaling_group for an event-triggered task to aggregate monitoring data of all ECS instances or elastic container instances in a scaling group within an Alibaba Cloud account.
      *     *   If you create an event-triggered task of the custom monitoring type, you can specify only custom metrics in the task.
      *     *   If you create an event-triggered task of the system monitoring type, you can specify the system metrics described in [Event-triggered tasks of the system monitoring type](~~74854~~) in the task.
      * >  user_id and scaling_group are automatically populated. You need to only specify device and state. For more information, see `Dimensions.DimensionKey` and `Dimensions.DimensionValue` in the "Request parameters" section of this topic.
      *
     */
    CompletableFuture<CreateAlarmResponse> createAlarm(CreateAlarmRequest request);

    /**
      * A scaling configuration is a template that is used to create elastic container instances during scale-out activities.
      * You can specify the Cpu and Memory parameters to determine the range of instance types. If you specify the parameters, Auto Scaling determines the available instance types based on factors such as I/O optimization requirements and zones. Auto Scaling preferentially creates elastic container instances of the instance type that is provided at the lowest price. This scaling mode is available only if Scaling Policy is set to Cost Optimization Policy and no instance type is specified in the scaling configuration.
      *
     */
    CompletableFuture<CreateEciScalingConfigurationResponse> createEciScalingConfiguration(CreateEciScalingConfigurationRequest request);

    /**
      * You can create up to six lifecycle hooks for each scaling group. After a lifecycle hook is created for a scaling group, Elastic Compute Service (ECS) instances in the scaling group waits to be added to or removed from the scaling group during scaling activities. You can use the HeartbeatTimeout parameter to specify the timeout period of the lifecycle hook. During the timeout period of a lifecycle hook, you can perform custom operations such as initialize ECS instance configurations and download ECS instance data on the ECS instances for which the lifecycle hook is applied.
      * During a scale-out activity and the timeout period of a lifecycle hook, the private IP addresses of ECS instances wait to be added to the associated whitelist that manages access to the ApsaraDB RDS instance. The ECS instances also wait to be added to the backend server group of the associated Classic Load Balancer (CLB) instance. After the lifecycle hook times out, the private IP addresses of the ECS instances are added to the whitelist that manages access to the associated ApsaraDB RDS instance. The ECS instances are also added to the backend server group of the associated CLB instance. During a scale-in activity and the timeout period of a lifecycle hook, the private IP addresses of ECS instances wait to be removed from the whitelist that manages access to the associated ApsaraDB RDS instance. The ECS instances also wait to be removed from the backend server group of the associated CLB instance. After the lifecycle hook times out, the private IP addresses of the ECS instances are removed from the whitelist that manages access to the associated ApsaraDB RDS instance. The ECS instances are also removed from the backend server group of the associated CLB instance.
      * You can configure a notification method for a lifecycle hook. When the lifecycle hook is triggered, a notification can be sent to the specified Message Service (MNS) topic or queue, or an operation can be performed based on the specified Operation Orchestration Service (OOS) template. If you want to configure an OOS template, you must create a Resource Access Management (RAM) role for OOS. For more information, see [Grant RAM permissions to OOS](~~120810~~).
      * > If your scaling group has existing ECS instances and you configured an OOS template that is used to add the private IP addresses of ECS instances to or remove the private IP addresses of ECS instances from the whitelists that manage access to cloud databases that are not ApsaraDB RDS databases, you must manually add the private IP addresses of the ECS instances to or remove the private IP addresses of the ECS instances from the whitelists that manage access to the cloud databases.
      *
     */
    CompletableFuture<CreateLifecycleHookResponse> createLifecycleHook(CreateLifecycleHookRequest request);

    /**
      * ## Description
      * You can configure CloudMonitor system events, Message Service (MNS) queues, or MNS topics to receive notifications. When a specified type of scaling activity or resource change occurs in a scaling group, Auto Scaling sends notifications by using CloudMonitor or MNS.
      *
     */
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
      * A scaling group is a group of Elastic Compute Service (ECS) instances that can be used for similar purposes.
      * You can create only a limited number of scaling groups in a region. To check the quota of the scaling groups, go to Quota Center.
      * A scaling group does not immediately take effect after you create the scaling group. You can call the [EnableScalingGroup](~~25939~~) operation to enable a scaling group. You can trigger scaling events and execute scaling rules only in scaling groups that are in the Enabled state.
      * If you want to attach a Classic Load Balancer (CLB, formerly known as SLB) instance and an ApsaraDB RDS instance to the scaling group that you want to create, the scaling group, the CLB instance, and the ApsaraDB RDS instance must reside in the same region. For more information, see [Regions and zones](~~40654~~).
      * If you attach a CLB instance to the scaling group that you want to create, Auto Scaling automatically adds the ECS instances in the scaling group to the backend server groups of the CLB instance. You can specify the following types of server groups to add ECS instances:
      * *   Default server group: ECS instances in this group process frontend requests. If no listeners are configured for vServer groups or primary/secondary server groups, the frontend requests are forwarded to the ECS instances in the default server group.
      * *   vServer group: If you want to forward different requests to different backend servers, or you want to forward requests based on domain names or URLs, you can specify vServer groups.
      * >  If you specify both the default server group and multiple server groups simultaneously, Auto Scaling adds the ECS instances in your scaling group to these server groups concurrently.
      * The default weight of each ECS instance as a backend server is 50. If you want to attach a CLB instance to the scaling group that you want to create, make sure that the CLB instance meets the following requirements:
      * *   The CLB instance is in the Active state. You can call the [DescribeLoadBalancers](~~2401696~~) operation to query the status of CLB instances.
      * *   Health check must be enabled on all listener ports configured for the CLB instance. Otherwise, the scaling group will fail to be created.
      * If you attach Application Load Balancer (ALB) or Network Load Balancer (NLB) server groups to the scaling group that you want to create, Auto Scaling adds the ECS instances in your scaling group to the ALB or NLB server groups to process the access requests forwarded by the corresponding ALB or NLB instances. You can attach multiple ALB or NLB server groups to a scaling group. Make sure that the ALB or NLB server groups belong to the same virtual private cloud (VPC). For more information, see [AttachAlbServerGroups](~~266800~~) or [AttachServerGroups](~~600535~~).
      * If you attach an ApsaraDB RDS instance to the scaling group that you want to create, Auto Scaling automatically adds the private IP addresses of the ECS instances in your scaling group to the IP address whitelist of the ApsaraDB RDS instance. Before you attach an ApsaraDB RDS instance to your scaling group, make sure that the ApsaraDB RDS instance meets the following requirements:
      * *   The ApsaraDB RDS instance is in the Running state. You can call the [DescribeDBInstances](~~610396~~) state to query the status of ApsaraDB RDS instances.
      * *   The number of IP addresses in the IP address whitelist of the ApsaraDB RDS instance does not reach its upper limit. For more information, see [Configure a whitelist](~~43185~~).
      * If you set MultiAZPolicy for the scaling group that you want to create to COST_OPTIMIZED, the following rules apply:
      * *   If you use OnDemandBaseCapacity, OnDemandPercentageAboveBaseCapacity, and SpotInstancePools to specify the instance allocation mode under the cost optimization policy, Auto Scaling prioritizes the implementation of the specified instance allocation mode during scale-out events.
      * *   If you do not specify OnDemandBaseCapacity, OnDemandPercentageAboveBaseCapacity, or SpotInstancePools, Auto Scaling preferentially creates instances of the lowest-priced instance type based on the cost optimization policy.
      * If you set `Tags.Propagate` to true, the following rules will apply:
      * *   Tags that you add to the scaling group cannot be propagated to existing instances in the scaling group. Tags that you add to the scaling group are propagated to only new instances.
      * *   If you specify instance tags in the scaling configuration that is used to create instances and propagate the tags that you add to the scaling group to the instances, all tags exist at the same time.
      * *   If the tag key that you specify in a scaling configuration and the tag key that you add to the scaling group of the scaling configuration are the same, the tag value that you specify in the scaling configuration is preferentially used.
      *
     */
    CompletableFuture<CreateScalingGroupResponse> createScalingGroup(CreateScalingGroupRequest request);

    /**
      * A scaling rule defines the specific scaling action. For example, you can use a scaling rule to define N instances to add or remove. If the execution of a scaling rule causes the total number of Elastic Compute Service (ECS) instances or elastic container instances in the scaling group to drop below the value of MinSize or to exceed the value of MaxSize, Auto Scaling adjusts the number of instances to add or remove, which ensures that the total number of instances stays within the valid range. Take note that Auto Scaling does not adjust the number of instances that you defined in the scaling rule. Examples:
      * *   The maximum number of instances (MaxSize) that can be contained in a scaling group is 3 and the current number of instances (Total Capacity) in the scaling group is 2. In this example, the Add3 scaling rule is created to add three ECS instances to the scaling group. However, after you execute Add3, Auto Scaling adds only one ECS instance to the scaling group. In addition, the number of ECS instances to add in the Add3 scaling rule remains unchanged.
      * *   The minimum number of instances (MinSize) that must be contained in a scaling group is 2 and the current number of instances (Total Capacity) is 3. In this example, the Remove5 scaling rule is created to remove five ECS instances from the scaling group. However, after you execute Remove5, Auto Scaling only removes one ECS instance from the scaling group. In addition, the number of ECS instances to remove in the Remove5 scaling rule remains unchanged.
      * Before you call this operation, take note of the following items:
      * *   If you set AdjustmentType to TotalCapacity, the total number of ECS instances or elastic container instances in your scaling group will be adjusted to a specified number when the scaling rule that you create by calling this operation is executed. You must set AdjustmentValue to an integer that is greater than 0.
      * *   If you set AdjustmentType to QuantityChangeInCapacity or PercentChangeInCapacity, a positive value of AdjustmentValue specifies that a specific number of ECS instances or elastic container instances will be added to your scaling group, and a negative value of AdjustmentValue specifies that a specific number of ECS instances or elastic container instances will be removed from the scaling group.
      * *   If you set AdjustmentType to PercentChangeInCapacity, Auto Scaling calculates the number of ECS instances or elastic container instances to add or remove by multiplying the current capacity of the scaling group (Total Capacity) by AdjustmentValue divided by 100, rounding off the result to determine the final adjustment count.
      * *   If you specify a cooldown period for a scaling rule, the cooldown period of the scaling rule takes effect after you execute the scaling rule. If you do not specify a cooldown period for a scaling rule, the value of DefaultCooldown of the scaling group takes effect after you execute the scaling rule.
      * *   You can create only a limited number of scaling rules for a scaling group. For more information, see [Limits](~~25863~~).
      * *   The following API operations may use the unique identifier of a scaling rule (ScalingRuleAri) that is returned after you call the CreateScalingRule operation:
      *     *   ExecuteScalingRule: You can call this operation to manually execute a scaling rule. In this operation, you can set ScalingRuleAri to the unique identifier of the scaling rule that you want to execute.
      *     *   CreateScheduledTask: You can call this operation to create a scheduled task for a scaling rule. In this operation, you can set ScalingRuleAri to the unique identifier of the scaling rule for which you want to create a scheduled task.
      *
     */
    CompletableFuture<CreateScalingRuleResponse> createScalingRule(CreateScalingRuleRequest request);

    /**
      * *   If the scaling rule of a scheduled task fails to be executed due to an ongoing scaling activity in the scaling group or because the scaling group is disabled, the scheduled task is automatically retried during the time window specified by `LaunchExpirationTime`. If the scheduled task still fails after the specified time window ends, the task is automatically skipped.
      * *   If several scheduled tasks concurrently attempt to execute the same scaling rule within a scaling group, the following rules apply:
      *     *   Scaling groups with **Expected Number of Instances** configured: The scaling activities incurred by the scheduled tasks are parallel scaling activities. In a proximate time window, Auto Scaling can trigger several scheduled tasks and then execute multiple parallel scaling activities at the same time.
      *     *   Scaling groups with **Expected Number of Instances** not configured: The scaling activity incurred by the earliest scheduled task is executed. Considering that a scaling group allows for no more than one ongoing scaling activity simultaneously, other scheduled tasks will spontaneously invoke retries within the time window specified by `LaunchExpirationTime`. Upon completion of the first scheduled task, any retries invoked by other tasks within the time window specified by `LaunchExpirationTime` lead to continuous enforcement of the scaling rule, with each iteration generating a distinct scaling activity.
      * *   You can use one of the following methods to specify the scaling mode:
      *     *   ScheduledAction: Specify an existing scaling rule that you want Auto Scaling to execute when the scheduled task is triggered.
      *     *   ScalingGroupId: Specify the minimum number, maximum number, or expected number of instances for the scaling group for which you create the scheduled task.
      *     **
      *     **Note** You cannot specify ScheduledAction and ScalingGroupId at the same time.
      *
     */
    CompletableFuture<CreateScheduledTaskResponse> createScheduledTask(CreateScheduledTaskRequest request);

    /**
      * *   You can call this operation to deactivate a scaling configuration only in a disabled scaling group.
      *
     */
    CompletableFuture<DeactivateScalingConfigurationResponse> deactivateScalingConfiguration(DeactivateScalingConfigurationRequest request);

    CompletableFuture<DeleteAlarmResponse> deleteAlarm(DeleteAlarmRequest request);

    /**
      * You cannot call this operation to delete a scaling configuration in the following scenarios:
      * *   The scaling configuration is in the Active state.
      * *   The scaling group contains elastic container instances created from the scaling configuration.
      *
     */
    CompletableFuture<DeleteEciScalingConfigurationResponse> deleteEciScalingConfiguration(DeleteEciScalingConfigurationRequest request);

    /**
      * If you delete an effective lifecycle hook before its timeout period ends, the instances on which the lifecycle hook takes effect exits the Pending state ahead of schedule. You can use the following methods to delete a lifecycle hook:
      * *   Include `LifecycleHookId` within your request to specify the lifecycle hook that you want to delete. In this case, `ScalingGroupId` and `LifecycleHookName` are ignored.
      * *   Include `ScalingGroupId` and `LifecycleHookName` within your request to specify the lifecycle hook that you want to delete.
      *
     */
    CompletableFuture<DeleteLifecycleHookResponse> deleteLifecycleHook(DeleteLifecycleHookRequest request);

    CompletableFuture<DeleteNotificationConfigurationResponse> deleteNotificationConfiguration(DeleteNotificationConfigurationRequest request);

    /**
      * You cannot delete a scaling configuration in one of the following scenarios:
      * *   The scaling configuration in your scaling group is in the Active state.
      * *   The scaling group contains ECS instances that were created based on the scaling configuration.
      *
     */
    CompletableFuture<DeleteScalingConfigurationResponse> deleteScalingConfiguration(DeleteScalingConfigurationRequest request);

    /**
      * Before you call the DeleteScalingGroup operation, take note of the following items:
      * *   If you delete a scaling group, the scaling configurations, scaling rules, scaling activities, and scaling requests related to the scaling group are also deleted.
      * *   If you delete a scaling group, the scheduled tasks and event-triggered tasks of the scaling group are not deleted. The Server Load Balancer (SLB) instances and ApsaraDB RDS instances that are attached to the scaling group are also not deleted.
      * *   If the scaling group that you want to delete contains ECS instances or elastic container instances that are in the In Service state, Auto Scaling stops the instances and then removes all manually added instances from the scaling group or releases all automatically created instances in the scaling group before the scaling group is deleted.
      *     **
      *     **Note** Before you delete a scaling group, make sure that the Deletion Protection feature is disabled. If you have enabled the Deletion Protection feature for a scaling group, disable the feature on the Modify Scaling Group page before you delete the scaling group.
      * *   If you do not disable the Deletion Protection feature for a scaling group, you cannot delete the scaling group by using the Auto Scaling console or calling this operation. The Deletion Protection feature is an effective measure to safeguard scaling groups against unintended deletion.
      * *   Prior to deleting a scaling group, make sure that your ECS instances within the scaling group are safeguarded against unintended release. Even if you have already enabled the Release Protection feature for the ECS instances, you must manually put these ECS instances into the Protected state. Doing so guarantees that the ECS instances will not be forcibly released during the deletion process of the scaling group, providing an extra layer of security.
      *     **
      *     **Note** Before you delete a scaling group, we recommend that you enable the Deletion Protection feature for ECS instances that you want to retain. This action guarantees that the ECS instances are not forcibly released after you delete the scaling group. For more information, see [SetInstancesProtection](~~459342~~).
      *
     */
    CompletableFuture<DeleteScalingGroupResponse> deleteScalingGroup(DeleteScalingGroupRequest request);

    CompletableFuture<DeleteScalingRuleResponse> deleteScalingRule(DeleteScalingRuleRequest request);

    CompletableFuture<DeleteScheduledTaskResponse> deleteScheduledTask(DeleteScheduledTaskRequest request);

    CompletableFuture<DescribeAlarmsResponse> describeAlarms(DescribeAlarmsRequest request);

    CompletableFuture<DescribeAlertConfigurationResponse> describeAlertConfiguration(DescribeAlertConfigurationRequest request);

    CompletableFuture<DescribeEciScalingConfigurationDetailResponse> describeEciScalingConfigurationDetail(DescribeEciScalingConfigurationDetailRequest request);

    CompletableFuture<DescribeEciScalingConfigurationsResponse> describeEciScalingConfigurations(DescribeEciScalingConfigurationsRequest request);

    /**
      * If a scaling activity is executed and a lifecycle hook is created for the scaling activity, the lifecycle hook triggers a lifecycle action. A lifecycle action can be in one of the following states:
      * *   If a lifecycle action is in the Pending state, Elastic Compute Service (ECS) instances are waiting to be added to a scaling group or waiting to be removed from a scaling group.
      * *   If a lifecycle action is in the Timeout state, the lifecycle hook that triggers the lifecycle action expires and ECS instances are added to or removed from a scaling group.
      * *   If a lifecycle action is in the Completed state, you manually end the lifecycle hook that triggers the lifecycle action ahead of schedule.
      * If you do not specify the action to perform, such as execute a specific OOS template, after a lifecycle hook ends, you can call this operation to obtain the token of the lifecycle action that corresponds to the lifecycle hook. Then, you can specify a custom action to perform after the lifecycle hook ends.
      *
     */
    CompletableFuture<DescribeLifecycleActionsResponse> describeLifecycleActions(DescribeLifecycleActionsRequest request);

    /**
      * You can use one of the following methods to query lifecycle hooks:
      * *   Specify a list of lifecycle hook IDs by using the LifecycleHookIds parameter. In this case, you do not need to specify the ScalingGroupId and LifecycleHookName parameters.
      * *   Specify the scaling group ID by using the ScalingGroupId parameter.
      * *   Specify the scaling group ID by using the ScalingGroupId parameter and the lifecycle hook name by using the LifecycleHookName parameter at the same time.
      *
     */
    CompletableFuture<DescribeLifecycleHooksResponse> describeLifecycleHooks(DescribeLifecycleHooksRequest request);

    CompletableFuture<DescribeLimitationResponse> describeLimitation(DescribeLimitationRequest request);

    CompletableFuture<DescribeNotificationConfigurationsResponse> describeNotificationConfigurations(DescribeNotificationConfigurationsRequest request);

    CompletableFuture<DescribeNotificationTypesResponse> describeNotificationTypes(DescribeNotificationTypesRequest request);

    CompletableFuture<DescribePatternTypesResponse> describePatternTypes(DescribePatternTypesRequest request);

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

    CompletableFuture<DescribeScalingGroupDetailResponse> describeScalingGroupDetail(DescribeScalingGroupDetailRequest request);

    CompletableFuture<DescribeScalingGroupsResponse> describeScalingGroups(DescribeScalingGroupsRequest request);

    CompletableFuture<DescribeScalingInstancesResponse> describeScalingInstances(DescribeScalingInstancesRequest request);

    /**
      * You can specify a scaling group ID to query all scaling rules in the scaling group. You can also specify the scaling rule ID, name, unique identifier, and type in the request parameters as filter conditions.
      *
     */
    CompletableFuture<DescribeScalingRulesResponse> describeScalingRules(DescribeScalingRulesRequest request);

    /**
      * You can query scheduled tasks by scaling rule, task ID, or task name.
      *
     */
    CompletableFuture<DescribeScheduledTasksResponse> describeScheduledTasks(DescribeScheduledTasksRequest request);

    CompletableFuture<DetachAlbServerGroupsResponse> detachAlbServerGroups(DetachAlbServerGroupsRequest request);

    CompletableFuture<DetachDBInstancesResponse> detachDBInstances(DetachDBInstancesRequest request);

    /**
      * *   Before you call the DetachInstances operation, make sure that the following conditions are met:
      *     *   The specified scaling group is enabled.
      *     *   The specified scaling group does not have any ongoing scaling activities.
      *     **
      *     **Note** If the specified scaling group does not have any ongoing scaling activities, the operation can bypass the cooldown period of the scaling group and immediately trigger scaling activities.
      * *   Before you call this operation, take note of the following items:
      *     *   The ECS instances, elastic container instances, or Alibaba Cloud-hosted third-party instances that are removed from a scaling group by using this operation can run independently. If needed, you can call the [AttachInstances](~~25954~~) operation to re-add these instances to a scaling group.
      *     *   The ECS instances, elastic container instances, or Alibaba Cloud-hosted third-party instances that are removed from a scaling group by using this operation are not stopped or released.
      *     *   A successful call only means that Auto Scaling accepts your request. Scaling activities can be triggered as expected, but their successful execution is not guaranteed. You can query the status of a scaling activity based on the ScalingActivityId response parameter.
      *     *   The removal of ECS instances, elastic container instances, or Alibaba Cloud-hosted third-party instances must not result in the overall number of instances within the specified scaling group falling below the minimum capacity threshold (MinSize); otherwise, an error will be reported.
      *
     */
    CompletableFuture<DetachInstancesResponse> detachInstances(DetachInstancesRequest request);

    CompletableFuture<DetachLoadBalancersResponse> detachLoadBalancers(DetachLoadBalancersRequest request);

    CompletableFuture<DetachServerGroupsResponse> detachServerGroups(DetachServerGroupsRequest request);

    /**
      * *   When you call the DetachVServerGroups operation, you must use the following parameters to specify the vServer groups that you want to detach from your scaling group:
      *     *   LoadBalancerId: the ID of the load balancer
      *     *   VServerGroupId: the ID of the vServer group
      *     *   Port: the port number of the vServer group
      * *   When the vServer group specified by the request parameters matches that attached to your scaling group, this operation yields a favorable result. Otherwise, the request is ignored and no error is reported.
      * *   Before you call this operation, you must make sure that the load balancer has ceased routing the access traffic to the instances in the scaling group. Failure to do so may lead to service requests being dropped or lost during the detachment process.
      *
     */
    CompletableFuture<DetachVServerGroupsResponse> detachVServerGroups(DetachVServerGroupsRequest request);

    /**
      * Before you disable an event-triggered task, make sure that the task is in the `Normal`, `Alert`, or `Insufficient Data` state.
      *
     */
    CompletableFuture<DisableAlarmResponse> disableAlarm(DisableAlarmRequest request);

    /**
      * Before you call this operation to disable a scaling group, take note of the following items:
      * *   If scaling activities are being executed in the specified scaling group when you call this operation, these activities will continue until they are complete. However, scaling activities that are triggered after this operation is called will be rejected.
      * *   This operation can be called only when the scaling group is in the Active state.
      *
     */
    CompletableFuture<DisableScalingGroupResponse> disableScalingGroup(DisableScalingGroupRequest request);

    CompletableFuture<EnableAlarmResponse> enableAlarm(EnableAlarmRequest request);

    /**
      * *   You can call this operation to enable a scaling group only if the scaling group is in the Inactive state and contains an instance configuration source such as a launch temple or a scaling configuration. The instance configuration source can also be the Elastic Compute Service (ECS) instance that you specified when you created the scaling group. If the preceding requirements are not met, the operation will fail.
      *     **
      *     **Note** A scaling group can have only one active instance configuration source at a time. When you call this operation to enable a scaling group, you can specify a scaling configuration or a launch template for the scaling group. If the scaling group already have an instance configuration source defined prior to your calling, the scaling configuration or launch template specified within your request will supersede the existing scaling configuration or launch template.
      * *   If you specify InstanceId.N to add to the scaling group within your request, Auto Scaling will check whether the addition of InstanceId.N will cause the total number of ECS instances in the scaling group to fall outside the boundaries specified by MinSize and MaxSize after you call this operation.
      *     *   If the call results in the total number of ECS instances dropping below the value of MinSize, Auto Scaling proactively creates pay-as-you-go ECS instances to ensure that the total number reaches the minimum threshold. For example, if you set MinSize to 5 when you created a scaling group and include InstanceId.N within your request to add two ECS instances when you attempt to enable the scaling group, Auto Scaling creates three more ECS instances in the scaling group after the two ECS instances are added.
      *     *   If the call results in the total number of ECS instances exceeding the value of MaxSize, the operation fails.
      *
     */
    CompletableFuture<EnableScalingGroupResponse> enableScalingGroup(EnableScalingGroupRequest request);

    /**
      * ## Description
      * *   If you call the operation to put an ECS instance in a scaling group that is associated with a Classic Load Balancer (CLB) instance into the Standby state, the weight of the ECS instance as a backend server of the CLB instance is set to 0.
      * *   You can remove an instance that is in the Standby state from a scaling group, and then release the instance.
      * *   ECS instances that are in the Standby state are not removed from the scaling group during scale-in activities triggered by event-triggered tasks.
      * *   If Auto Scaling considers an ECS instance that is in the Standby state unhealthy, for example, the ECS instance is being stopped or being restarted, Auto Scaling does not update the health status of the ECS instance or trigger scale-in activities to remove the ECS instance from the scaling group. Auto Scaling updates the health status of the ECS instance only when the ECS instance is no longer in the Standby state.
      *
     */
    CompletableFuture<EnterStandbyResponse> enterStandby(EnterStandbyRequest request);

    /**
      * Before you call this operation, take note of the following items:
      * *   The scaling group is in the Active state.
      * *   No scaling activities in the scaling group are in progress.
      * If no scaling activities in the scaling group are in progress, the operation can trigger scaling activities even before the cooldown time expires.
      * A successful call indicates that Auto Scaling accepts the request. However, the scaling activity may still fail. You can obtain the status of a scaling activity by using the value of the ScalingActivityId parameter in the response.
      * If the addition of a specified number of Elastic Compute Service (ECS) instances to a scaling group causes the total number of ECS instances in the scaling group to exceed the maximum number of instances allowed, Auto Scaling adds only a specific number of ECS instances to ensure that the total number of instances is equal to the maximum number of instances.
      * If the removal of a specified number of ECS instances from a scaling group causes the total number of ECS instances in the scaling group to drop below the minimum number of instances allowed, Auto Scaling removes only a specific number of ECS instances to ensure that the total number of instances is equal to the minimum number of instances.
      * You can specify only a limited number of ECS instances in each adjustment. For more information, see the description of the AdjustmentValue parameter in the CreateScalingRule topic.
      *
     */
    CompletableFuture<ExecuteScalingRuleResponse> executeScalingRule(ExecuteScalingRuleRequest request);

    /**
      * After ECS instances or elastic container instances are removed from the Standby state, the following rules apply:
      * *   The ECS instances or elastic container instances enter the In Service state.
      * *   The default weight of each ECS instance or elastic container instance as a backend server of the attached load balancer is 50.
      * *   If you stop or restart the ECS instances or elastic container instances, the health check status of the instances will be updated.
      * *   When a scale-in event is triggered, Auto Scaling may remove the ECS instances or elastic container instances from the scaling group.
      *
     */
    CompletableFuture<ExitStandbyResponse> exitStandby(ExitStandbyRequest request);

    CompletableFuture<ListTagKeysResponse> listTagKeys(ListTagKeysRequest request);

    /**
      * *   Specify at least one of the following request parameters: `ResourceIds` and `Tags`. `Tags.Key` and `Tags.Value` are used to specify the query objects.
      * *   If you provide both `ResourceIds` and `Tags` in your request, the response will exclusively include Auto Scaling resources that satisfy the criteria set by these parameters, ensuring targeted and precise information retrieval.
      *
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ListTagValuesResponse> listTagValues(ListTagValuesRequest request);

    /**
      * *   If you set the MetricType parameter to custom, you must report your custom metrics to CloudMonitor before you can create event-triggered tasks by using the custom metrics. For more information, see [Custom monitoring event-triggered tasks](~~74861~~).
      * *   When you create an event-triggered task, you must specify the MetricName, DimensionKey, and DimensionValue parameters to determine the range of statistics that you want to aggregate for the metrics of the scaling group. For example, you can specify the user_id and scaling_group dimensions for an event-triggered task to aggregate monitoring data of all Elastic Compute Service (ECS) instances or elastic container instances in a scaling group within an Alibaba Cloud account.
      *     *   If you set the MetricType parameter to custom, the valid values are your custom metrics.
      *     *   For information about the metrics that are supported if you set the MetricType parameter to system, see[ Event-triggered task for system monitoring](~~74854~~).
      * > The user_id and scaling_group dimensions are automatically populated. You need to only specify the device and state dimensions. For more information, see the `DimensionKey` and `DimensionValue` parameters in the "Request parameters" section of this topic.
      *
     */
    CompletableFuture<ModifyAlarmResponse> modifyAlarm(ModifyAlarmRequest request);

    CompletableFuture<ModifyAlertConfigurationResponse> modifyAlertConfiguration(ModifyAlertConfigurationRequest request);

    /**
      * *   If you want to change the name of a scaling configuration in a scaling group, make sure that the new name is unique within the scaling group.
      * *   You can call the [ModifyEciScalingConfiguration](~~459378~~) operation to verify the modification result.
      *
     */
    CompletableFuture<ModifyEciScalingConfigurationResponse> modifyEciScalingConfiguration(ModifyEciScalingConfigurationRequest request);

    CompletableFuture<ModifyInstanceAttributeResponse> modifyInstanceAttribute(ModifyInstanceAttributeRequest request);

    /**
      * You can use one of the following methods to locate the lifecycle hook that you want to modify:
      * *   Specify LifecycleHookId. In this case, ScalingGroupId and LifecycleHookName are ignored.
      * *   Specify ScalingGroupId and LifecycleHookName. Each lifecycle hook within a scaling group has a unique name.
      *
     */
    CompletableFuture<ModifyLifecycleHookResponse> modifyLifecycleHook(ModifyLifecycleHookRequest request);

    CompletableFuture<ModifyNotificationConfigurationResponse> modifyNotificationConfiguration(ModifyNotificationConfigurationRequest request);

    /**
      * You can change the name of a scaling configuration in a scaling group. The name must be unique within the scaling group.
      *
     */
    CompletableFuture<ModifyScalingConfigurationResponse> modifyScalingConfiguration(ModifyScalingConfigurationRequest request);

    /**
      * *   You cannot modify the following parameters by calling this operation:
      *     *   RegionId
      *     *   LoadBalancerId
      *     **
      *     **Note** If you want to modify the load balancer settings of your scaling group, you can call the AttachLoadBalancers operation or the DetachLoadBalancers operation.
      *     *   DBInstanceId
      *     **
      *     **Note** If you want to modify the ApsaraDB RDS instance settings of your scaling group, you can call the AttachDBInstances operation or the DetachDBInstances operation.
      * *   You can call this operation to modify a scaling group only when the scaling group is in the `Active` or `Inactive` state.
      * *   Enabling a new scaling configuration in the scaling group will not impact existing Elastic Compute Service (ECS) instances or elastic container instances that were provisioned based on the previous scaling configuration. These instances will continue to run as expected.
      * *   If the modification of the MaxSize setting leads to the total number of ECS instances or elastic container instances in the scaling group exceeding the new maximum limit, Auto Scaling proactively removes the surplus instances to restore the total number to match the new maximum limit.
      * *   If the modification of the MinSize setting leads to the total number of ECS instances or elastic container instances in the scaling group exceeding the new minimum threshold, Auto Scaling proactively adds more instances to the scaling group to ensure that the total number aligns with the new minimum threshold.
      * *   If the modification of the DesiredCapacity setting leads to the total number of ECS instances or elastic container instances in the scaling group not matching the new desired capacity, Auto Scaling proactively adjusts the total number of instances to ensure that the total number aligns with the new desired capacity.
      *
     */
    CompletableFuture<ModifyScalingGroupResponse> modifyScalingGroup(ModifyScalingGroupRequest request);

    CompletableFuture<ModifyScalingRuleResponse> modifyScalingRule(ModifyScalingRuleRequest request);

    /**
      * You can use the following parameters to specify the scaling method of a scheduled task:
      * *   If you use the `ScheduledAction` parameter, you must select an existing scaling rule for the scheduled task.
      * *   If you use the `ScalingGroupId` parameter, you must specify the minimum number, maximum number, or expected number of instances in the scheduled task.
      * > You cannot specify the `ScheduledAction` and `ScalingGroupId` parameters at the same time.
      *
     */
    CompletableFuture<ModifyScheduledTaskResponse> modifyScheduledTask(ModifyScheduledTaskRequest request);

    /**
      * ## [](#)Usage notes
      * Auto Scaling creates new ECS instances to replace the existing ECS instances to fulfill the rebalancing purpose. Auto Scaling starts the new ECS instances before stopping the existing ECS instances. The rebalancing operation does not affect the performance or service availability of your application.
      * *   This operation is supported by only multi-zone scaling groups whose `MultiAZPolicy` is set to `BALANCE`.
      * *   A rebalancing operation is required only when the distribution of the instances of a multi-zone scaling group is significantly unbalanced. In a rebalancing activity, Auto Scaling replaces up to 20 ECS instances to rectify the unbalanced distribution.
      * *   During the execution of a rebalancing operation, if the number of instances in the scaling group approaches or hits the value of MaxSize but the rebalancing operation needs to continue, Auto Scaling allows the total number of ECS instances to momentarily exceed the value of MaxSize by 10%. This temporary surplus condition persists for a duration until equilibrium in the distribution of ECS instances is achieved. Typically, it takes 1 to 6 minutes.
      *     **
      *     **Note** If the 10% increment of the maximum number of instances in a scaling group yield a non-integer value, the decimal portion is always rounded up to ensure an additional instance is accounted for. For example, you have a scaling group that holds a maximum of 15 ECS instances. During a rebalancing operation, Auto Scaling would permit the total number of instances to momentarily surpass this limit by 2, instead of the calculated 10% (which is 1.5).
      *
     */
    CompletableFuture<RebalanceInstancesResponse> rebalanceInstances(RebalanceInstancesRequest request);

    /**
      * You can call this operation only when the desired ECS instance enters a Pending state.\\
      * An ECS instance can stay in a Pending state for up to six hours. Each time an ECS instance enters a Pending state, you can extend the time window during which the ECS instance stays in a Pending state up to 20 times.
      *
     */
    CompletableFuture<RecordLifecycleActionHeartbeatResponse> recordLifecycleActionHeartbeat(RecordLifecycleActionHeartbeatRequest request);

    /**
      * *   Before you call this operation, make sure that the following requirements are met:
      *     *   The scaling group is in the Active state.
      *     *   No scaling activity is in progress within the scaling group.
      * > If no scaling activity is in progress within the scaling group, you can call the operation even within the cooldown period.
      * *   If an ECS instance is automatically created by Auto Scaling, or if an ECS instance is manually added to a scaling group and managed by the scaling group, the ECS instance is stopped in economical mode or is released after the instance is removed from the scaling group.
      * *   If an ECS instance is manually added to a scaling group and is not managed by the scaling group, the ECS instance is not stopped or released after the instance is removed from the scaling group.
      * *   If the difference between the number of existing ECS instances specified by the TotalCapacity parameter and the number of ECS instances that you call this operation to remove is less than the value of the MinSize parameter, the call fails.
      * A successful call only means that Auto Scaling accepts the request. The scaling activity may still fail. You can obtain the status of a scaling activity based on the value of the ScalingActivityId parameter in the response.
      *
     */
    CompletableFuture<RemoveInstancesResponse> removeInstances(RemoveInstancesRequest request);

    CompletableFuture<ResumeProcessesResponse> resumeProcesses(ResumeProcessesRequest request);

    /**
      * *   Before you call this operation, take note of the following items:
      *     *   The scaling group is in the Active state.
      *     *   The scaling group has no ongoing scaling activities.
      * *   If no scaling activities in the scaling group are in progress, the operation can trigger scaling activities before the cooldown period of the scaling group expires.
      * *   If the addition of a specific number of Elastic Compute Service (ECS) instances to the scaling group causes the total number of ECS instances in the scaling group to exceed the maximum allowed number, Auto Scaling adds ECS instances to the scaling group until the total number of instances is equal to the maximum allowed number.
      * *   If the removal of a specific number of ECS instances from the scaling group causes the total number of ECS instances in the scaling group to be less than the minimum allowed number, Auto Scaling removes ECS instances from the scaling group until the total number of instances is equal to the minimum allowed number.
      * A successful call indicates that Auto Scaling accepts the request. However, the scaling activity may still fail. You can obtain the status of a scaling activity based on the value of `ScalingActivityId` in the response.
      *
     */
    CompletableFuture<ScaleWithAdjustmentResponse> scaleWithAdjustment(ScaleWithAdjustmentRequest request);

    CompletableFuture<SetGroupDeletionProtectionResponse> setGroupDeletionProtection(SetGroupDeletionProtectionRequest request);

    /**
      * Auto Scaling detects and removes unhealthy ECS instances or elastic container instances from the corresponding scaling groups. If you want to retain a specific instance in the corresponding scaling group, you can put the instance into the Standby or Protected state. For more information, see [EnterStandby](~~EnterStandby~~) and [SetInstancesProtection](~~SetInstancesProtection~~).
      *
     */
    CompletableFuture<SetInstanceHealthResponse> setInstanceHealth(SetInstanceHealthRequest request);

    /**
      * Once ECS instances enter the Protected state, they become subject to the following restrictions:
      * *   ECS instances will persist in the Protected state, unless you deliberately remove them from this state.
      * *   Even in scenarios where automatic scale-in actions are initiated due to fluctuations in the number of ECS instances or the execution of event-triggered tasks, Auto Scaling does not remove ECS instances that are in the Protected state from their respective scaling groups. Only after being manually removed from their respective scaling groups can ECS instances that are in the Protected state be released. For more information, see [Remove an ECS instance](~~25955~~).
      * *   ECS instances in the Protected state maintain their existing health status even when they undergo stopping or restarting processes.
      *
     */
    CompletableFuture<SetInstancesProtectionResponse> setInstancesProtection(SetInstancesProtectionRequest request);

    CompletableFuture<SuspendProcessesResponse> suspendProcesses(SuspendProcessesRequest request);

    /**
      * *   You can attach up to 20 tags to a scaling group.
      *     **
      *     **Note** Before you attach tags to a specific Auto Scaling resource, Alibaba Cloud automatically verifies the current number of tags attached to that resource. In the event the proposed addition would exceed the maximum allowed number of tags, an error message will be promptly returned after you call this operation.
      * *   If you set `Tags.Propagate` to `true`, any tags attached to your scaling group will be automatically propagated to new instances that are subsequently created in the scaling group, without affecting existing instances.
      * *   If both the scaling configuration and the scaling group have tags attached, and tag propagation from the scaling group is enabled, the tags of newly created instances comply with the following rules:
      *     *   Instances set to join the scaling group will inherit the following tags: tags attached to the scaling configuration that initiates the instance creation and tags attached to the scaling group that are allowed to propagate to these instances upon instance creation.
      *     *   If the tag keys of the scaling configuration and those attached to the scaling group and propagated to the instances are identical, the tags attached to the scaling group and propagated to the instances will be overwritten by the tags of the scaling configuration.
      *
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<VerifyAuthenticationResponse> verifyAuthentication(VerifyAuthenticationRequest request);

    CompletableFuture<VerifyUserResponse> verifyUser(VerifyUserRequest request);

}
