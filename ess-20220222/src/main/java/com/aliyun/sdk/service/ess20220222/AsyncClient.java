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
     * <b>description</b> :
     * <p>When you manage ECI scaling configurations by using YAML configuration files, take note of the following items:</p>
     * <ul>
     * <li>If you specify the ID of an ECI scaling configuration, the system updates the ECI scaling configuration based on the YAML configuration file.</li>
     * <li>If you do not specify the ID of an ECI scaling configuration, the system creates an ECI scaling configuration based on the YAML configuration file.</li>
     * </ul>
     * 
     * @param request the request parameters of ApplyEciScalingConfiguration  ApplyEciScalingConfigurationRequest
     * @return ApplyEciScalingConfigurationResponse
     */
    CompletableFuture<ApplyEciScalingConfigurationResponse> applyEciScalingConfiguration(ApplyEciScalingConfigurationRequest request);

    /**
     * <b>description</b> :
     * <p>The ApplyScalingGroup operation supports the Kubernetes Deployment resource definition format to quickly create Elastic Container Instance (ECI) scaling groups. It also supports ECI extended annotations for Kubernetes YAML. For more information, see the &quot;Supported annotations&quot; section.
     * Mapping between YAML configurations and scaling groups: A scaling group name is mapped by the namespace, kind, and name tuple in the YAML definition. In the same region, the same YAML configuration can only be mapped to the same scaling group. Example: If you use a Deployment YAML configuration with the name nginx in the default namespace, it is mapped to a scaling group named k8s_default_Deployment_nginx in the same region.
     * Logic for managing scaling groups based on YAML configurations:</p>
     * <ul>
     * <li>If the scaling group mapped to the YAML configuration exists, the scaling group is updated based on the YAML configuration.</li>
     * <li>If the scaling group mapped to the YAML configuration does not exist, a corresponding scaling group is created based on the YAML configuration.</li>
     * </ul>
     * <h3>Precautions</h3>
     * <ol>
     * <li>If the YAML configuration does not specify the VPC, vSwitch, and security group annotations, the system performs automatic creation of a default VPC, creates a default vSwitch in the VPC, and creates the default Auto Scaling security group ess-default-sg. By default, the security group policy allows traffic on TCP ports 22 and 3389, and the ICMP (IPv4) protocol. If you have other port and protocol requirements, you can modify the security group policy.</li>
     * <li>When you use a public image, you must enable public network access and configure the Settings for the k8s.aliyun.com/eci-with-eip pod annotation to enable the elastic IP address (EIP).</li>
     * <li>After the ApplyScalingGroup operation applies the YAML configuration, the scaling group and scaling configuration take effect immediately. If replicas is set to a value greater than 0, automatic creation of resources is triggered.</li>
     * </ol>
     * <h3>Supported annotations</h3>
     * <p>The annotations are referenced from <a href="https://help.aliyun.com/document_detail/186939.html">ECI Pod Annotation</a>.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Parameter</th>
     * <th>Example</th>
     * <th>Description</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>k8s.aliyun.com/ess-scaling-group-min-size</td>
     * <td>1</td>
     * <td>The minimum number of instances in the scaling group. Default value: 0.</td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/ess-scaling-group-max-size</td>
     * <td>20</td>
     * <td>The maximum number of instances in the scaling group. Default value: max(replicas, 30).</td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-ntp-server</td>
     * <td>100.100.<em>.</em></td>
     * <td>The NTP server.</td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-use-specs</td>
     * <td>2-4Gi</td>
     * <td>The instance specifications, such as 2 vCPUs and 4 GiB of memory. For more information, see <a href="https://help.aliyun.com/document_detail/451267.html">Create a pod by using multiple instance types</a>.</td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-vswitch</td>
     * <td>vsw-bp1xpiowfm5vo8o3c****</td>
     * <td>The ID of the vSwitch. You can specify multiple vSwitches to implement the multi-active zone feature.</td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-security-group</td>
     * <td>sg-bp1dktddjsg5nktv****</td>
     * <td>The ID of the security group. Requirements: <ul><li>You can specify one or more security groups. A maximum of five security groups can be specified.</li><li>The specified security groups must belong to the same VPC.</li><li>The specified security groups must be of the same type.</li></ul></td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-sls-enable</td>
     * <td>&quot;false&quot;</td>
     * <td>Specifies whether to shutdown log collection. A value of false indicates that log collection is shutdown. <p>When you collect logs by using Simple Log Service CRDs, if you do not need to collect logs for specific pods, you can configure this annotation to shutdown the log collection feature. This prevents the system from performing automatic creation of Logtail and wasting resources.</p></td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-spot-strategy</td>
     * <td>SpotAsPriceGo</td>
     * <td>The bidding policy for the spot instance. Valid values: <ul><li>SpotWithPriceLimit: You use custom Settings for the maximum hourly price of the spot instance. In this case, you must set k8s.aliyun.com/eci-spot-price-limit.</li><li>SpotAsPriceGo: The system automatically places bids based on the actual price of the current marketplace.</li></ul></td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-spot-price-limit</td>
     * <td>&quot;0.5&quot;</td>
     * <td>The maximum hourly price for the spot instance. The value is accurate to three decimal places. <p>This parameter takes effect only when the Settings of k8s.aliyun.com/eci-spot-strategy are SpotWithPriceLimit.</p></td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-with-eip</td>
     * <td>&quot;true&quot;</td>
     * <td>Specifies whether to perform automatic creation and attach an EIP. A value of true indicates that an EIP is automatically created and attached.</td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-data-cache-bucket</td>
     * <td>default</td>
     * <td>The bucket of DataCache. This parameter is required when you use DataCache to create a pod.</td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-data-cache-pl</td>
     * <td>PL1</td>
     * <td>The performance level (PL) of the cloud disk created based on DataCache. <p>By default, an ESSD standard SSD is used, and the default PL is PL1.</p></td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-data-cache-provisionedIops</td>
     * <td>&quot;40000&quot;</td>
     * <td>The provisioned read and write IOPS of the ESSD AutoPL cloud disk. Valid values: 0 to min{50000, 1000 × Capacity - Baseline performance}. Baseline performance = min{1800 + 50 × Capacity, 50000}. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL cloud disks</a>. <p>If this annotation is added, the cloud disk created based on DataCache is an ESSD AutoPL cloud disk.</p></td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-data-cache-burstingEnabled</td>
     * <td>&quot;true&quot;</td>
     * <td>Specifies whether to enable the burst feature for the ESSD AutoPL cloud disk. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL cloud disks</a>. <p>If this annotation is added, the cloud disk created based on DataCache is an ESSD AutoPL cloud disk.</p></td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-custom-tags</td>
     * <td>&quot;env:test,name:alice&quot;</td>
     * <td>The label string attached to the pod. You can attach up to three labels. Separate the label key and label value with a half-width colon character, and separate multiple labels with a half-width comma character.</td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of ApplyScalingGroup  ApplyScalingGroupRequest
     * @return ApplyScalingGroupResponse
     */
    CompletableFuture<ApplyScalingGroupResponse> applyScalingGroup(ApplyScalingGroupRequest request);

    /**
     * <b>description</b> :
     * <p>When you add ALB server groups to a scaling group, the following conditions must be met:</p>
     * <ul>
     * <li>The network type of the scaling group must be VPC, and the scaling group must be in the same VPC as the ALB server groups.</li>
     * <li>The ALB server groups must be in the Available state.</li>
     * </ul>
     * 
     * @param request the request parameters of AttachAlbServerGroups  AttachAlbServerGroupsRequest
     * @return AttachAlbServerGroupsResponse
     */
    CompletableFuture<AttachAlbServerGroupsResponse> attachAlbServerGroups(AttachAlbServerGroupsRequest request);

    /**
     * <b>description</b> :
     * <p>The following conditions must be met when you attach RDS instances to a scaling group:</p>
     * <ul>
     * <li>The RDS instances and the scaling group must belong to the same account.</li>
     * <li>The RDS instances must not be locked. For more information about the locking policy, see <a href="https://help.aliyun.com/document_detail/41872.html">Usage notes for ApsaraDB RDS</a>.</li>
     * <li>The RDS instances must be in the Running state.</li>
     * <li>The RDS instances must be owned by your current account and must not be deleted.</li>
     * <li>If you attach an RDS instance that already exists in the scaling group to the scaling group again, the number of RDS instances in the scaling group does not change. However, the system attempts to add the private IP addresses of all ECS instances in the current scaling group to the IP address whitelist of the RDS instance.<blockquote>
     * <p>After you attach RDS instances, the default whitelist group of the RDS instances can contain a maximum of 1,000 IP addresses. For more information about IP address whitelists, see <a href="https://help.aliyun.com/document_detail/96118.html">Configure an IP address whitelist</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of AttachDBInstances  AttachDBInstancesRequest
     * @return AttachDBInstancesResponse
     */
    CompletableFuture<AttachDBInstancesResponse> attachDBInstances(AttachDBInstancesRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you invoke this operation, make sure that the following conditions are met:<ul>
     * <li>The scaling group is in the Active state.</li>
     * <li>No scaling activities are in progress in the scaling group.</li>
     * </ul>
     * </li>
     * <li>Limits on ECS instances or ECI instances to be added to the scaling group:<ul>
     * <li>The instances must be in the same region as the scaling group.</li>
     * <li>The instances must be in the Running state.</li>
     * <li>The instances must not be added to other scaling groups.</li>
     * <li>The billing method of the instances must be subscription, pay-as-you-go, or spot instance.</li>
     * <li>If a vSwitch ID is specified for the scaling group, classic network-connected ECS instances or ECI instances, or ECS instances or ECI instances in other VPCs cannot be added to the scaling group.</li>
     * <li>If no vSwitch ID is specified for the scaling group, VPC-connected ECS instances or ECI instances cannot be added to the scaling group.</li>
     * </ul>
     * </li>
     * <li>Limits on managed instances to be added to the scaling group:<ul>
     * <li>The instances must be in the same region as the scaling group.</li>
     * <li>Only managed instances that are not added to any scaling group can be added to an ECS scaling group.</li>
     * <li>Managed instances do not support lifecycle hooks, association with load balancing, or the health check feature.</li>
     * <li>After managed instances are added to an ECS scaling group, the scaling group does not manage the lifecycle of the managed instances.</li>
     * <li>Managed instances can only be manually added to or removed from the scaling group. Removed managed instances are not released.</li>
     * </ul>
     * </li>
     * <li>Precautions for using this operation:<ul>
     * <li>If no scaling activities are in progress in the scaling group, this operation can bypass the cooldown time and be executed directly.</li>
     * <li>A successful response only indicates that Auto Scaling accepted the request of the operation invocation and the scaling activity can be executed. It does not mean that the scaling activity will be executed successfully. You must use the returned ScalingActivityId to check the execution status of the scaling activity.</li>
     * <li>If the sum of the number of instances specified in this operation and the current number of instances in the scaling group (Total Capacity) is greater than the maximum number of instances (MaxSize), the operation invocation fails.</li>
     * <li>ECS instances, ECI instances, or managed instances manually added by using this operation are not associated with the active scaling configuration of the scaling group.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of AttachInstances  AttachInstancesRequest
     * @return AttachInstancesResponse
     */
    CompletableFuture<AttachInstancesResponse> attachInstances(AttachInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>The following conditions must be met when adding load balancing instances to a scaling group:</p>
     * <ul>
     * <li>The load balancing instances and the scaling group must belong to the same account and region.</li>
     * <li>The load balancing instances must be in the <code>Running</code> state.</li>
     * <li>Each load balancing instance must be configured with at least one listener and have health checks enabled.</li>
     * <li>If the network type of both the load balancing instances and the scaling group is VPC, they must be in the same VPC.</li>
     * <li>If the network type of the scaling group is VPC and the network type of the load balancing instances is classic network, and the backend servers of the load balancing instances include VPC-connected instances, the VPC-connected instances must be in the same VPC as the scaling group.</li>
     * <li>The number of load balancing instances associated with the scaling group does not exceed the quota. For more information about the quota, see <a href="https://help.aliyun.com/document_detail/25863.html">Limits</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of AttachLoadBalancers  AttachLoadBalancersRequest
     * @return AttachLoadBalancersResponse
     */
    CompletableFuture<AttachLoadBalancersResponse> attachLoadBalancers(AttachLoadBalancersRequest request);

    /**
     * @param request the request parameters of AttachServerGroups  AttachServerGroupsRequest
     * @return AttachServerGroupsResponse
     */
    CompletableFuture<AttachServerGroupsResponse> attachServerGroups(AttachServerGroupsRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>To add vServer groups to a scaling group, the following conditions must be met:<ul>
     * <li>The CLB instance and the scaling group must belong to the same account.</li>
     * <li>The CLB instance and the scaling group must be in the same region.</li>
     * <li>The CLB instance must be in the Running state.</li>
     * <li>The CLB instance must be configured with at least one listener and health checks must be enabled.</li>
     * <li>If the network types of both the CLB instance and the scaling group are VPC, they must be in the same VPC.</li>
     * <li>If the network type of the scaling group is VPC and the network type of the CLB instance is classic network, and the vServer group contains VPC-connected instances, the instances must be in the same VPC as the scaling group.</li>
     * <li>The vServer groups to be added must belong to the corresponding CLB instance.</li>
     * <li>The number of vServer groups in the scaling group does not exceed the quota. For more information about the quota, see <a href="https://help.aliyun.com/document_detail/25863.html">Limits</a>.</li>
     * </ul>
     * </li>
     * <li>When you add vServer groups to a scaling group, you must specify the following properties:<ul>
     * <li>CLB instance ID (LoadBalancerId)</li>
     * <li>vServer group ID (VServerGroupId)</li>
     * <li>vServer group port number (Port)<blockquote>
     * <p>If you add the same vServer group to a scaling group by using different port numbers, the system considers that multiple vServer groups are added to the scaling group. If both the vServer group ID and the port number in the request parameters are duplicated, the system uses the first configured group by default and ignores the other vServer groups.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of AttachVServerGroups  AttachVServerGroupsRequest
     * @return AttachVServerGroupsResponse
     */
    CompletableFuture<AttachVServerGroupsResponse> attachVServerGroups(AttachVServerGroupsRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>You cannot cancel an instance refresh task that is being rolled back.</li>
     * </ul>
     * 
     * @param request the request parameters of CancelInstanceRefresh  CancelInstanceRefreshRequest
     * @return CancelInstanceRefreshResponse
     */
    CompletableFuture<CancelInstanceRefreshResponse> cancelInstanceRefresh(CancelInstanceRefreshRequest request);

    /**
     * @param request the request parameters of CancelScalingGroupZoneShift  CancelScalingGroupZoneShiftRequest
     * @return CancelScalingGroupZoneShiftResponse
     */
    CompletableFuture<CancelScalingGroupZoneShiftResponse> cancelScalingGroupZoneShift(CancelScalingGroupZoneShiftRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>A resource is a cloud service entity that you create in Alibaba Cloud. For example, a scaling group is a resource.</li>
     * <li>A resource group is a mechanism for grouping and managing resources within an Alibaba Cloud account. It helps you resolve the complexities of resource grouping and authorization management within a single cloud account. For more information, see <a href="https://help.aliyun.com/document_detail/94475.html">What is Resource Management</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Allows you to specify the next action after the wait state ends: continue the scaling activity (CONTINUE), abandon the scaling activity (ABANDON), or perform a rollback (ROLLBACK).</p>
     * 
     * @param request the request parameters of CompleteLifecycleAction  CompleteLifecycleActionRequest
     * @return CompleteLifecycleActionResponse
     */
    CompletableFuture<CompleteLifecycleActionResponse> completeLifecycleAction(CompleteLifecycleActionRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>If you create an event-triggered task of the custom monitoring type (MetricType=custom), you must first report custom metric data to CloudMonitor. For more information, see <a href="https://help.aliyun.com/document_detail/74861.html">Custom monitoring event-triggered tasks</a>.</li>
     * <li>When you create an event-triggered task, you must specify a metric (MetricName) and configure dimension information (Dimensions.DimensionKey and Dimensions.DimensionValue) to determine the aggregation scope of the metric data in the scaling group. For example, you can specify user_id and scaling_group to aggregate the metric data of all ECS or ECI instances for a specific user in a specific scaling group.<ul>
     * <li>The metrics for custom monitoring event-triggered tasks (MetricType=custom) depend on your custom metrics.</li>
     * <li>For more information about the metrics supported by system monitoring event-triggered tasks (MetricType=system), see <a href="https://help.aliyun.com/document_detail/74854.html">System monitoring event-triggered tasks</a>.<blockquote>
     * <p>In the dimension information, user_id and scaling_group are automatically populated by the system, while device and state must be manually specified. For more information, see the Dimensions.DimensionKey and Dimensions.DimensionValue parameters.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateAlarm  CreateAlarmRequest
     * @return CreateAlarmResponse
     */
    CompletableFuture<CreateAlarmResponse> createAlarm(CreateAlarmRequest request);

    /**
     * @param request the request parameters of CreateDiagnoseReport  CreateDiagnoseReportRequest
     * @return CreateDiagnoseReportResponse
     */
    CompletableFuture<CreateDiagnoseReportResponse> createDiagnoseReport(CreateDiagnoseReportRequest request);

    /**
     * <b>description</b> :
     * <p>The scaling configuration specifies the template for ECI instances used during scale-out activities.
     * The Cpu and Memory parameters specify the range of vCPUs and memory to define the instance type. Auto Scaling determines the available instance types based on factors such as I/O optimization and zone, and creates the most cost-effective instance based on price sorting. This method applies only when the scaling policy of the scaling group is set to cost optimization and no instance type is specified in the scaling configuration.</p>
     * 
     * @param request the request parameters of CreateEciScalingConfiguration  CreateEciScalingConfigurationRequest
     * @return CreateEciScalingConfigurationResponse
     */
    CompletableFuture<CreateEciScalingConfigurationResponse> createEciScalingConfiguration(CreateEciScalingConfigurationRequest request);

    /**
     * <b>description</b> :
     * <p>You can create up to 10 lifecycle hooks in a scaling group. When a scaling activity occurs in a scaling group that has lifecycle hooks, the lifecycle hooks suspend the scaling activity for a period of time. You can specify the wait time by using the HeartbeatTimeout parameter. During the wait time, you can perform operations such as initializing the configurations of ECS instances and obtaining ECS instance data.
     * During a scale-out activity, ECS instances enter the wait state after they are added to the whitelist of an ApsaraDB RDS instance, and are added to the backend server group of a Server Load Balancer (SLB) instance after the wait state ends. During a scale-in activity, ECS instances enter the wait state after they are removed from the backend server group of the SLB instance, and are removed from the whitelist of the ApsaraDB RDS instance after the wait state ends.
     * You can configure notification methods for lifecycle hooks. Supported notification methods include Message Service (MNS) topics, MNS queues, and Operation Orchestration Service (OOS) templates. If you configure an OOS template, you must create a Resource Access Management (RAM) role for OOS. For more information, see <a href="https://help.aliyun.com/document_detail/120810.html">Grant RAM permissions to OOS</a>.</p>
     * <blockquote>
     * <p>If the scaling group contains existing ECS instances and the configured OOS template is used to add or remove instances from the whitelist of a cloud database other than ApsaraDB RDS, you must manually add the existing ECS instances to the whitelist of the cloud database.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateLifecycleHook  CreateLifecycleHookRequest
     * @return CreateLifecycleHookResponse
     */
    CompletableFuture<CreateLifecycleHookResponse> createLifecycleHook(CreateLifecycleHookRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can configure the notification Settings to receive messages from cloud monitoring system events, Simple Message Queue (formerly MNS) queues, or Simple Message Queue (formerly MNS) topics. When a scaling event or resource change of a specified type occurs in a scaling group, Auto Scaling notifies cloud monitoring or Simple Message Queue (formerly MNS).</li>
     * <li>Different event notifications within the same scaling group cannot use the same destination.
     * For example, different event notifications cannot use the same cloud monitoring system event, the same MNS topic, or the same MNS queue at the same time.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateNotificationConfiguration  CreateNotificationConfigurationRequest
     * @return CreateNotificationConfigurationResponse
     */
    CompletableFuture<CreateNotificationConfigurationResponse> createNotificationConfiguration(CreateNotificationConfigurationRequest request);

    /**
     * <b>description</b> :
     * <p>A scaling configuration specifies the ECS instance template used during scale-out. The following instance configuration methods are supported:</p>
     * <ul>
     * <li>InstancePatternInfos: the intelligent configuration mode. You do not need to specify exact network types. You only need to specify the number of vCPUs, memory size, instance family level, and maximum price based on your business requirements. The system automatically filters network types that meet the requirements and preferentially selects the network type with the lowest price to create ECS instances. This mode applies only to scaling groups in a VPC and effectively reduces the chance of insufficient network type inventory during scale-out.</li>
     * <li>InstanceType: specifies a single instance type.</li>
     * <li>InstanceTypes: specifies multiple instance types.</li>
     * <li>InstanceTypeOverrides: specifies multiple instance types and configures weights for different instance types.</li>
     * <li>Cpu and Memory: specifies the range of instance types by defining the number of vCPUs and memory size. Auto Scaling determines the available instance types based on factors such as I/O optimization and zone, and creates instances with the lowest price. This method applies only when the scaling policy of the scaling group is set to cost optimization and no instance type is specified in the scaling configuration.</li>
     * <li>You can use one of the following methods to bind the primary ENI. Note that you can use only one method to configure the primary ENI in a single call. Using both methods at the same time causes the call to fail and returns an error message.<ul>
     * <li>Directly set the configuration information of the primary ENI by using parameters such as SecurityGroupId, SecurityGroupIds, and Ipv6AddressCount.</li>
     * <li>Set the configuration information of the primary ENI and secondary ENIs by using NetworkInterfaces. When you use the NetworkInterface parameter, you must set the primary ENI information. If NetworkInterface.InstanceType is set to Primary, it indicates the primary ENI. If NetworkInterface.InstanceType is set to Secondary or left empty, it indicates a secondary ENI.<blockquote>
     * <p>You cannot specify InstanceType, InstanceTypes, InstanceTypeOverrides, and Cpu and Memory at the same time. However, you can specify InstanceType or InstanceTypes together with InstancePatternInfos. When InstanceType or InstanceTypes is specified together with InstancePatternInfos, Auto Scaling preferentially uses the specified instance types for scale-out. If the specified instance types are out of stock, Auto Scaling uses the instance types that match the InstancePatternInfos configuration.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateScalingConfiguration  CreateScalingConfigurationRequest
     * @return CreateScalingConfigurationResponse
     */
    CompletableFuture<CreateScalingConfigurationResponse> createScalingConfiguration(CreateScalingConfigurationRequest request);

    /**
     * <b>description</b> :
     * <p>A scaling group is a collection of ECS instances that share the same application scenarios.
     * The number of scaling groups that you can create in a region depends on your Auto Scaling usage. Go to Quota Center to check the quota for the total number of scaling groups.
     * A scaling group does not take effect immediately after it is created. You must invoke the <a href="https://help.aliyun.com/document_detail/25939.html">EnableScalingGroup</a> operation to enable the scaling group before it can trigger scaling activities and execute scaling rules.
     * The scaling group, the associated Classic Load Balancer (CLB) instances, and the associated ApsaraDB RDS instances must reside in the same region. For more information, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.
     * If you associate CLB instances with the scaling group, Auto Scaling automatically adds the ECS instances in the scaling group to the backend server groups of the CLB instances. You can specify the server groups to which the ECS instances are added. The following types of server groups are supported:</p>
     * <ul>
     * <li>Default server group: contains ECS instances that accept frontend requests. If a listener is not configured with a virtual server group or a primary/secondary server group, requests are forwarded to the ECS instances in the default server group by default.</li>
     * <li>Virtual server group: used when you need to forward different requests to different backend servers, or forward requests based on domain names and URLs.<blockquote>
     * <p>If you specify both the default server group and multiple virtual server groups, the ECS instances are added to all these server groups.
     * After an instance is added to a backend server group of a CLB instance, the default weight of the instance is 50. The CLB instance must meet the following conditions:</p>
     * </blockquote>
     * </li>
     * <li>The CLB instance must be in the Active state. You can call the <a href="https://help.aliyun.com/document_detail/2401696.html">DescribeLoadBalancers</a> operation to check the status of the CLB instance.</li>
     * <li>Health checks must be enabled for all listeners configured on the CLB instance. Otherwise, the scaling group fails to be created.
     * If you associate Application Load Balancer (ALB) server groups, Network Load Balancer (NLB) server groups, or Gateway Load Balancer (GWLB) server groups with the scaling group, Auto Scaling automatically adds the ECS instances in the scaling group as backend servers to the ALB, NLB, or GWLB server groups to process access requests distributed by the ALB, NLB, or GWLB instances. You can specify multiple ALB, NLB, or GWLB server groups, but the server groups must belong to the same VPC as the scaling group. For more information, see <a href="https://help.aliyun.com/document_detail/266800.html">AttachAlbServerGroups</a> or <a href="https://help.aliyun.com/document_detail/600535.html">AttachServerGroups</a>.
     * If you associate ApsaraDB RDS instances with the scaling group, Auto Scaling automatically adds the internal IP addresses of the ECS instances in the scaling group to the whitelists of the ApsaraDB RDS instances. The ApsaraDB RDS instances must meet the following conditions:</li>
     * <li>The ApsaraDB RDS instance must be in the Running state. You can call the <a href="https://help.aliyun.com/document_detail/610396.html">DescribeDBInstances</a> operation to check the status of the ApsaraDB RDS instance.</li>
     * <li>The number of IP addresses in the whitelist of the ApsaraDB RDS instance cannot exceed the upper limit. For more information, see <a href="https://help.aliyun.com/document_detail/43185.html">Configure a whitelist</a> in the ApsaraDB RDS documentation.
     * If the MultiAZPolicy parameter of the scaling group is set to COST_OPTIMIZED:</li>
     * <li>If the OnDemandBaseCapacity, OnDemandPercentageAboveBaseCapacity, and SpotInstancePools parameters are specified, the instance allocation method under the cost optimization policy is specified. This allocation method is prioritized during scale-out and scale-in.</li>
     * <li>If the OnDemandBaseCapacity, OnDemandPercentageAboveBaseCapacity, or SpotInstancePools parameter is not specified, instances are created based on the lowest cost under the cost optimization policy. In this mode, you cannot create instances by using elasticity assurances or capacity reservations, and you cannot specify the vSwitch to which secondary elastic network interfaces (ENIs) belong.
     * If you configure propagatable tags for the scaling group, which means <code>Tags.Propagate</code> is set to true:</li>
     * <li>Tags on the scaling group are propagated only to newly created instances, not to existing instances in the scaling group.</li>
     * <li>If you specify instance tags in the scaling configuration and choose to propagate the tags of the scaling group to the instances, all tags coexist.</li>
     * <li>If a tag in the scaling configuration and a propagatable tag in the scaling group have the same tag key, the tag value in the scaling configuration takes precedence.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateScalingGroup  CreateScalingGroupRequest
     * @return CreateScalingGroupResponse
     */
    CompletableFuture<CreateScalingGroupResponse> createScalingGroup(CreateScalingGroupRequest request);

    /**
     * <b>description</b> :
     * <p>A scaling rule defines specific scale-out or scale-in operations, such as adding or removing N instances. If executing a scaling rule causes the number of ECS or ECI instances in the scaling group to fall below MinSize or exceed MaxSize, Auto Scaling automatically adjusts the number of ECS or ECI instances to be added or removed so that the total number of instances reaches MinSize or MaxSize. However, the configured value of the scaling rule remains unchanged. Examples:</p>
     * <ul>
     * <li>For a scaling group with MaxSize set to 3 and a current total capacity of 2, if the scaling rule specifies adding 3 ECS instances, only 1 ECS instance is added during actual execution, but the configured value of the scaling rule remains 3.</li>
     * <li>For a scaling group with MinSize set to 2 and a current total capacity of 3, if the scaling rule specifies removing 5 ECS instances, only 1 ECS instance is removed during actual execution, but the configured value of the scaling rule remains 5.
     * Note the following parameter descriptions:</li>
     * <li>If AdjustmentType is set to TotalCapacity, the number of ECS or ECI instances in the scaling group is adjusted to the specified number. The corresponding AdjustmentValue must be greater than or equal to 0.</li>
     * <li>If AdjustmentType is set to QuantityChangeInCapacity or PercentChangeInCapacity, a positive AdjustmentValue indicates to increase instances, and a negative value indicates to decrease instances.</li>
     * <li>If AdjustmentType is set to PercentChangeInCapacity, Auto Scaling calculates the number of ECS instances or ECI instances to be added or removed by using the formula: Current total capacity × AdjustmentValue / 100, and uses the rounding principle to confirm the number of ECS instances or ECI instances to increase or decrease.</li>
     * <li>If a cooldown time (Cooldown) is specified for the scaling rule, the scaling group enters the cooldown state for the specified duration after the scaling activity triggered by the rule is completed. If no cooldown time is specified for the scaling rule, the default cooldown time (DefaultCooldown) of the scaling group is used.</li>
     * <li>The number of scaling rules that can be created in a scaling group is limited. For more information, see <a href="https://help.aliyun.com/document_detail/25863.html">Limits</a>.</li>
     * <li>The returned unique identifier of the scaling rule (ScalingRuleAri) can be used in the following API operations:<ul>
     * <li>Specify it in the ScalingRuleAri parameter of the ExecuteScalingRule operation to manually execute the scaling rule.</li>
     * <li>Specify it in the ScheduledAction parameter of the CreateScheduledTask operation to execute the scaling rule on a schedule.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateScalingRule  CreateScalingRuleRequest
     * @return CreateScalingRuleResponse
     */
    CompletableFuture<CreateScalingRuleResponse> createScalingRule(CreateScalingRuleRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>If a scheduled node has failed to trigger the execution of the scaling rule because a scaling activity is in progress or the scaling group is disabled, the scheduled node automatically retries within the <code>LaunchExpirationTime</code> period. Otherwise, the scheduled trigger is canceled.</li>
     * <li>If multiple scheduled nodes trigger scaling rules for the same scaling group at approximately the same time, the details of the triggered scaling activities are as follows:<ul>
     * <li><strong>Scaling groups with Settings for the expected number of instances</strong>: Scaling activities triggered by multiple scheduled nodes are of the parallel scaling activity type. For example, if multiple scheduled nodes are executed at approximately the same time, the scaling group can trigger multiple parallel scaling activity executions simultaneously.</li>
     * <li><strong>Scaling groups without Settings for the expected number of instances</strong>: The earliest triggered scheduled node executes the scaling activity first. Because a scaling group can run only one scaling activity at a time, subsequent scheduled nodes automatically retry within the <code>LaunchExpirationTime</code> period. If a subsequent scheduled node is still retrying within the <code>LaunchExpirationTime</code> period after the previous scaling activity is completed, the scaling rule of the scheduled node is executed and the corresponding scaling activity is triggered.</li>
     * </ul>
     * </li>
     * <li>Scheduled nodes support the following two scaling methods:<ul>
     * <li>Specify the scaling rule to be executed by using the ScheduledAction parameter.</li>
     * <li>Specify the number of instances in the scaling group by using the ScalingGroupId parameter.<blockquote>
     * <p>You cannot specify both ScheduledAction and ScalingGroupId at the same time.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateScheduledTask  CreateScheduledTaskRequest
     * @return CreateScheduledTaskResponse
     */
    CompletableFuture<CreateScheduledTaskResponse> createScheduledTask(CreateScheduledTaskRequest request);

    /**
     * @param request the request parameters of DeactivateScalingConfiguration  DeactivateScalingConfigurationRequest
     * @return DeactivateScalingConfigurationResponse
     */
    CompletableFuture<DeactivateScalingConfigurationResponse> deactivateScalingConfiguration(DeactivateScalingConfigurationRequest request);

    /**
     * @param request the request parameters of DeleteAlarm  DeleteAlarmRequest
     * @return DeleteAlarmResponse
     */
    CompletableFuture<DeleteAlarmResponse> deleteAlarm(DeleteAlarmRequest request);

    /**
     * @param request the request parameters of DeleteDiagnoseReport  DeleteDiagnoseReportRequest
     * @return DeleteDiagnoseReportResponse
     */
    CompletableFuture<DeleteDiagnoseReportResponse> deleteDiagnoseReport(DeleteDiagnoseReportRequest request);

    /**
     * <b>description</b> :
     * <p>You cannot call this operation to delete a scaling configuration in the following scenarios:</p>
     * <ul>
     * <li>The scaling configuration is in the Active state.</li>
     * <li>The scaling group contains elastic container instances created from the scaling configuration.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteEciScalingConfiguration  DeleteEciScalingConfigurationRequest
     * @return DeleteEciScalingConfigurationResponse
     */
    CompletableFuture<DeleteEciScalingConfigurationResponse> deleteEciScalingConfiguration(DeleteEciScalingConfigurationRequest request);

    /**
     * <b>description</b> :
     * <p>If you delete an effective lifecycle hook before its timeout period ends, the instances on which the lifecycle hook takes effect exits the Pending state ahead of schedule. You can use the following methods to delete a lifecycle hook:</p>
     * <ul>
     * <li>Include <code>LifecycleHookId</code> within your request to specify the lifecycle hook that you want to delete. In this case, <code>ScalingGroupId</code> and <code>LifecycleHookName</code> are ignored.</li>
     * <li>Include <code>ScalingGroupId</code> and <code>LifecycleHookName</code> within your request to specify the lifecycle hook that you want to delete.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteLifecycleHook  DeleteLifecycleHookRequest
     * @return DeleteLifecycleHookResponse
     */
    CompletableFuture<DeleteLifecycleHookResponse> deleteLifecycleHook(DeleteLifecycleHookRequest request);

    /**
     * @param request the request parameters of DeleteNotificationConfiguration  DeleteNotificationConfigurationRequest
     * @return DeleteNotificationConfigurationResponse
     */
    CompletableFuture<DeleteNotificationConfigurationResponse> deleteNotificationConfiguration(DeleteNotificationConfigurationRequest request);

    /**
     * <b>description</b> :
     * <p>You cannot delete a scaling configuration in one of the following scenarios:</p>
     * <ul>
     * <li>The scaling configuration in your scaling group is in the Active state.</li>
     * <li>The scaling group contains ECS instances that were created based on the scaling configuration.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteScalingConfiguration  DeleteScalingConfigurationRequest
     * @return DeleteScalingConfigurationResponse
     */
    CompletableFuture<DeleteScalingConfigurationResponse> deleteScalingConfiguration(DeleteScalingConfigurationRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call the DeleteScalingGroup operation, take note of the following items:</p>
     * <ul>
     * <li>If you delete a scaling group, the scaling configurations, scaling rules, scaling activities, and scaling requests related to the scaling group are also deleted.</li>
     * <li>If you delete a scaling group, the scheduled tasks and event-triggered tasks of the scaling group are not deleted. The Server Load Balancer (SLB) instances and ApsaraDB RDS instances that are attached to the scaling group are also not deleted.</li>
     * <li>If the scaling group that you want to delete contains ECS instances or elastic container instances that are in the In Service state, Auto Scaling stops the instances and then removes all manually added instances from the scaling group or releases all automatically created instances in the scaling group before the scaling group is deleted.
     * **
     * <strong>Note</strong> Before you delete a scaling group, make sure that the Deletion Protection feature is disabled. If you have enabled the Deletion Protection feature for a scaling group, disable the feature on the Modify Scaling Group page before you delete the scaling group.</li>
     * <li>If you do not disable the Deletion Protection feature for a scaling group, you cannot delete the scaling group by using the Auto Scaling console or calling this operation. The Deletion Protection feature is an effective measure to safeguard scaling groups against unintended deletion.</li>
     * <li>Prior to deleting a scaling group, make sure that your ECS instances within the scaling group are safeguarded against unintended release. Even if you have already enabled the Release Protection feature for the ECS instances, you must manually put these ECS instances into the Protected state. Doing so guarantees that the ECS instances will not be forcibly released during the deletion process of the scaling group, providing an extra layer of security.
     * **
     * <strong>Note</strong> Before you delete a scaling group, we recommend that you enable the Deletion Protection feature for ECS instances that you want to retain. This action guarantees that the ECS instances are not forcibly released after you delete the scaling group. For more information, see <a href="https://help.aliyun.com/document_detail/459342.html">SetInstancesProtection</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteScalingGroup  DeleteScalingGroupRequest
     * @return DeleteScalingGroupResponse
     */
    CompletableFuture<DeleteScalingGroupResponse> deleteScalingGroup(DeleteScalingGroupRequest request);

    /**
     * @param request the request parameters of DeleteScalingRule  DeleteScalingRuleRequest
     * @return DeleteScalingRuleResponse
     */
    CompletableFuture<DeleteScalingRuleResponse> deleteScalingRule(DeleteScalingRuleRequest request);

    /**
     * @param request the request parameters of DeleteScheduledTask  DeleteScheduledTaskRequest
     * @return DeleteScheduledTaskResponse
     */
    CompletableFuture<DeleteScheduledTaskResponse> deleteScheduledTask(DeleteScheduledTaskRequest request);

    /**
     * @param request the request parameters of DeleteWarmPool  DeleteWarmPoolRequest
     * @return DeleteWarmPoolResponse
     */
    CompletableFuture<DeleteWarmPoolResponse> deleteWarmPool(DeleteWarmPoolRequest request);

    /**
     * @param request the request parameters of DescribeAlarms  DescribeAlarmsRequest
     * @return DescribeAlarmsResponse
     */
    CompletableFuture<DescribeAlarmsResponse> describeAlarms(DescribeAlarmsRequest request);

    /**
     * @param request the request parameters of DescribeAlertConfiguration  DescribeAlertConfigurationRequest
     * @return DescribeAlertConfigurationResponse
     */
    CompletableFuture<DescribeAlertConfigurationResponse> describeAlertConfiguration(DescribeAlertConfigurationRequest request);

    /**
     * @param request the request parameters of DescribeCandidateInstanceType  DescribeCandidateInstanceTypeRequest
     * @return DescribeCandidateInstanceTypeResponse
     */
    CompletableFuture<DescribeCandidateInstanceTypeResponse> describeCandidateInstanceType(DescribeCandidateInstanceTypeRequest request);

    /**
     * @param request the request parameters of DescribeDiagnoseReports  DescribeDiagnoseReportsRequest
     * @return DescribeDiagnoseReportsResponse
     */
    CompletableFuture<DescribeDiagnoseReportsResponse> describeDiagnoseReports(DescribeDiagnoseReportsRequest request);

    /**
     * @param request the request parameters of DescribeEciScalingConfigurationDetail  DescribeEciScalingConfigurationDetailRequest
     * @return DescribeEciScalingConfigurationDetailResponse
     */
    CompletableFuture<DescribeEciScalingConfigurationDetailResponse> describeEciScalingConfigurationDetail(DescribeEciScalingConfigurationDetailRequest request);

    /**
     * @param request the request parameters of DescribeEciScalingConfigurations  DescribeEciScalingConfigurationsRequest
     * @return DescribeEciScalingConfigurationsResponse
     */
    CompletableFuture<DescribeEciScalingConfigurationsResponse> describeEciScalingConfigurations(DescribeEciScalingConfigurationsRequest request);

    /**
     * @param request the request parameters of DescribeElasticStrength  DescribeElasticStrengthRequest
     * @return DescribeElasticStrengthResponse
     */
    CompletableFuture<DescribeElasticStrengthResponse> describeElasticStrength(DescribeElasticStrengthRequest request);

    /**
     * @param request the request parameters of DescribeInstanceCreateAndDeleteStatistics  DescribeInstanceCreateAndDeleteStatisticsRequest
     * @return DescribeInstanceCreateAndDeleteStatisticsResponse
     */
    CompletableFuture<DescribeInstanceCreateAndDeleteStatisticsResponse> describeInstanceCreateAndDeleteStatistics(DescribeInstanceCreateAndDeleteStatisticsRequest request);

    /**
     * @param request the request parameters of DescribeInstanceRefreshes  DescribeInstanceRefreshesRequest
     * @return DescribeInstanceRefreshesResponse
     */
    CompletableFuture<DescribeInstanceRefreshesResponse> describeInstanceRefreshes(DescribeInstanceRefreshesRequest request);

    /**
     * <b>description</b> :
     * <p>If a scaling activity is executed and a lifecycle hook is created for the scaling activity, the lifecycle hook triggers a lifecycle action. A lifecycle action can be in one of the following states:</p>
     * <ul>
     * <li>If a lifecycle action is in the Pending state, Elastic Compute Service (ECS) instances are waiting to be added to a scaling group or waiting to be removed from a scaling group.</li>
     * <li>If a lifecycle action is in the Timeout state, the lifecycle hook that triggers the lifecycle action expires and ECS instances are added to or removed from a scaling group.</li>
     * <li>If a lifecycle action is in the Completed state, you manually end the lifecycle hook that triggers the lifecycle action ahead of schedule.
     * If you do not specify the action to perform, such as execute a specific OOS template, after a lifecycle hook ends, you can call this operation to obtain the token of the lifecycle action that corresponds to the lifecycle hook. Then, you can specify a custom action to perform after the lifecycle hook ends.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeLifecycleActions  DescribeLifecycleActionsRequest
     * @return DescribeLifecycleActionsResponse
     */
    CompletableFuture<DescribeLifecycleActionsResponse> describeLifecycleActions(DescribeLifecycleActionsRequest request);

    /**
     * <b>description</b> :
     * <p>You can query lifecycle hooks in the following three ways:</p>
     * <ul>
     * <li>Specify a list of lifecycle hook IDs (LifecycleHookIds). In this case, the ScalingGroupId and LifecycleHookName parameters are ignored.</li>
     * <li>Specify a scaling group ID (ScalingGroupId).</li>
     * <li>Specify both a scaling group ID (ScalingGroupId) and a lifecycle hook name (LifecycleHookName).</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeLifecycleHooks  DescribeLifecycleHooksRequest
     * @return DescribeLifecycleHooksResponse
     */
    CompletableFuture<DescribeLifecycleHooksResponse> describeLifecycleHooks(DescribeLifecycleHooksRequest request);

    /**
     * @param request the request parameters of DescribeLimitation  DescribeLimitationRequest
     * @return DescribeLimitationResponse
     */
    CompletableFuture<DescribeLimitationResponse> describeLimitation(DescribeLimitationRequest request);

    /**
     * @param request the request parameters of DescribeNotificationConfigurations  DescribeNotificationConfigurationsRequest
     * @return DescribeNotificationConfigurationsResponse
     */
    CompletableFuture<DescribeNotificationConfigurationsResponse> describeNotificationConfigurations(DescribeNotificationConfigurationsRequest request);

    /**
     * @param request the request parameters of DescribeNotificationTypes  DescribeNotificationTypesRequest
     * @return DescribeNotificationTypesResponse
     */
    CompletableFuture<DescribeNotificationTypesResponse> describeNotificationTypes(DescribeNotificationTypesRequest request);

    /**
     * @param request the request parameters of DescribePatternTypes  DescribePatternTypesRequest
     * @return DescribePatternTypesResponse
     */
    CompletableFuture<DescribePatternTypesResponse> describePatternTypes(DescribePatternTypesRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can specify a scaling group ID to query all scaling activity records in the scaling group.</li>
     * <li>You can filter query results by the status of the scaling activity.</li>
     * <li>You can query the scaling activity that occurred within the last 30 days.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeScalingActivities  DescribeScalingActivitiesRequest
     * @return DescribeScalingActivitiesResponse
     */
    CompletableFuture<DescribeScalingActivitiesResponse> describeScalingActivities(DescribeScalingActivitiesRequest request);

    /**
     * @param request the request parameters of DescribeScalingActivityDetail  DescribeScalingActivityDetailRequest
     * @return DescribeScalingActivityDetailResponse
     */
    CompletableFuture<DescribeScalingActivityDetailResponse> describeScalingActivityDetail(DescribeScalingActivityDetailRequest request);

    /**
     * @param request the request parameters of DescribeScalingActivityStatistics  DescribeScalingActivityStatisticsRequest
     * @return DescribeScalingActivityStatisticsResponse
     */
    CompletableFuture<DescribeScalingActivityStatisticsResponse> describeScalingActivityStatistics(DescribeScalingActivityStatisticsRequest request);

    /**
     * @param request the request parameters of DescribeScalingConfigurations  DescribeScalingConfigurationsRequest
     * @return DescribeScalingConfigurationsResponse
     */
    CompletableFuture<DescribeScalingConfigurationsResponse> describeScalingConfigurations(DescribeScalingConfigurationsRequest request);

    /**
     * @param request the request parameters of DescribeScalingGroupDetail  DescribeScalingGroupDetailRequest
     * @return DescribeScalingGroupDetailResponse
     */
    CompletableFuture<DescribeScalingGroupDetailResponse> describeScalingGroupDetail(DescribeScalingGroupDetailRequest request);

    /**
     * @param request the request parameters of DescribeScalingGroupDiagnoseDetails  DescribeScalingGroupDiagnoseDetailsRequest
     * @return DescribeScalingGroupDiagnoseDetailsResponse
     */
    CompletableFuture<DescribeScalingGroupDiagnoseDetailsResponse> describeScalingGroupDiagnoseDetails(DescribeScalingGroupDiagnoseDetailsRequest request);

    /**
     * @param request the request parameters of DescribeScalingGroups  DescribeScalingGroupsRequest
     * @return DescribeScalingGroupsResponse
     */
    CompletableFuture<DescribeScalingGroupsResponse> describeScalingGroups(DescribeScalingGroupsRequest request);

    /**
     * @param request the request parameters of DescribeScalingInstances  DescribeScalingInstancesRequest
     * @return DescribeScalingInstancesResponse
     */
    CompletableFuture<DescribeScalingInstancesResponse> describeScalingInstances(DescribeScalingInstancesRequest request);

    /**
     * @param request the request parameters of DescribeScalingRules  DescribeScalingRulesRequest
     * @return DescribeScalingRulesResponse
     */
    CompletableFuture<DescribeScalingRulesResponse> describeScalingRules(DescribeScalingRulesRequest request);

    /**
     * <b>description</b> :
     * <p>You can query scheduled tasks by scheduled task ID, scheduled task name, or the scaling rule executed by the scheduled task.</p>
     * 
     * @param request the request parameters of DescribeScheduledTasks  DescribeScheduledTasksRequest
     * @return DescribeScheduledTasksResponse
     */
    CompletableFuture<DescribeScheduledTasksResponse> describeScheduledTasks(DescribeScheduledTasksRequest request);

    /**
     * @param request the request parameters of DescribeWarmPoolInstances  DescribeWarmPoolInstancesRequest
     * @return DescribeWarmPoolInstancesResponse
     */
    CompletableFuture<DescribeWarmPoolInstancesResponse> describeWarmPoolInstances(DescribeWarmPoolInstancesRequest request);

    /**
     * @param request the request parameters of DetachAlbServerGroups  DetachAlbServerGroupsRequest
     * @return DetachAlbServerGroupsResponse
     */
    CompletableFuture<DetachAlbServerGroupsResponse> detachAlbServerGroups(DetachAlbServerGroupsRequest request);

    /**
     * @param request the request parameters of DetachDBInstances  DetachDBInstancesRequest
     * @return DetachDBInstancesResponse
     */
    CompletableFuture<DetachDBInstancesResponse> detachDBInstances(DetachDBInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>  Before you call the DetachInstances operation, make sure that the following conditions are met:
     *     *   The specified scaling group is enabled.
     *     *   The specified scaling group does not have any ongoing scaling activities.
     *     **
     *     <strong>Note</strong> If the specified scaling group does not have any ongoing scaling activities, the operation can bypass the cooldown period of the scaling group and immediately trigger scaling activities.</p>
     * <ul>
     * <li>Before you call this operation, take note of the following items:<ul>
     * <li>The ECS instances, elastic container instances, or Alibaba Cloud-hosted third-party instances that are removed from a scaling group by using this operation can run independently. If needed, you can call the <a href="https://help.aliyun.com/document_detail/25954.html">AttachInstances</a> operation to re-add these instances to a scaling group.</li>
     * <li>The ECS instances, elastic container instances, or Alibaba Cloud-hosted third-party instances that are removed from a scaling group by using this operation are not stopped or released.</li>
     * <li>A successful call only means that Auto Scaling accepts your request. Scaling activities can be triggered as expected, but their successful execution is not guaranteed. You can query the status of a scaling activity based on the ScalingActivityId response parameter.</li>
     * <li>The removal of ECS instances, elastic container instances, or Alibaba Cloud-hosted third-party instances must not result in the overall number of instances within the specified scaling group falling below the minimum capacity threshold (MinSize); otherwise, an error will be reported.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DetachInstances  DetachInstancesRequest
     * @return DetachInstancesResponse
     */
    CompletableFuture<DetachInstancesResponse> detachInstances(DetachInstancesRequest request);

    /**
     * @param request the request parameters of DetachLoadBalancers  DetachLoadBalancersRequest
     * @return DetachLoadBalancersResponse
     */
    CompletableFuture<DetachLoadBalancersResponse> detachLoadBalancers(DetachLoadBalancersRequest request);

    /**
     * @param request the request parameters of DetachServerGroups  DetachServerGroupsRequest
     * @return DetachServerGroupsResponse
     */
    CompletableFuture<DetachServerGroupsResponse> detachServerGroups(DetachServerGroupsRequest request);

    /**
     * <b>description</b> :
     * <p>  When you call the DetachVServerGroups operation, you must use the following parameters to specify the vServer groups that you want to detach from your scaling group:
     *     *   LoadBalancerId: the ID of the load balancer
     *     *   VServerGroupId: the ID of the vServer group
     *     *   Port: the port number of the vServer group</p>
     * <ul>
     * <li>When the vServer group specified by the request parameters matches that attached to your scaling group, this operation yields a favorable result. Otherwise, the request is ignored and no error is reported.</li>
     * <li>Before you call this operation, you must make sure that the load balancer has ceased routing the access traffic to the instances in the scaling group. Failure to do so may lead to service requests being dropped or lost during the detachment process.</li>
     * </ul>
     * 
     * @param request the request parameters of DetachVServerGroups  DetachVServerGroupsRequest
     * @return DetachVServerGroupsResponse
     */
    CompletableFuture<DetachVServerGroupsResponse> detachVServerGroups(DetachVServerGroupsRequest request);

    /**
     * <b>description</b> :
     * <p>Before you disable an event-triggered task, make sure that the task is in the <code>Normal</code>, <code>Alert</code>, or <code>Insufficient Data</code> state.</p>
     * 
     * @param request the request parameters of DisableAlarm  DisableAlarmRequest
     * @return DisableAlarmResponse
     */
    CompletableFuture<DisableAlarmResponse> disableAlarm(DisableAlarmRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation to disable a scaling group, take note of the following items:</p>
     * <ul>
     * <li>If scaling activities are being executed in the specified scaling group when you call this operation, these activities will continue until they are complete. However, scaling activities that are triggered after this operation is called will be rejected.</li>
     * <li>This operation can be called only when the scaling group is in the Active state.</li>
     * </ul>
     * 
     * @param request the request parameters of DisableScalingGroup  DisableScalingGroupRequest
     * @return DisableScalingGroupResponse
     */
    CompletableFuture<DisableScalingGroupResponse> disableScalingGroup(DisableScalingGroupRequest request);

    /**
     * @param request the request parameters of EnableAlarm  EnableAlarmRequest
     * @return EnableAlarmResponse
     */
    CompletableFuture<EnableAlarmResponse> enableAlarm(EnableAlarmRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation to enable a scaling group only if the scaling group is in the Inactive state and contains an instance configuration source such as a launch temple or a scaling configuration. The instance configuration source can also be the Elastic Compute Service (ECS) instance that you specified when you created the scaling group. If the preceding requirements are not met, the operation will fail.
     *     **
     *     <strong>Note</strong> A scaling group can have only one active instance configuration source at a time. When you call this operation to enable a scaling group, you can specify a scaling configuration or a launch template for the scaling group. If the scaling group already have an instance configuration source defined prior to your calling, the scaling configuration or launch template specified within your request will supersede the existing scaling configuration or launch template.</p>
     * <ul>
     * <li>If you specify InstanceId.N to add to the scaling group within your request, Auto Scaling will check whether the addition of InstanceId.N will cause the total number of ECS instances in the scaling group to fall outside the boundaries specified by MinSize and MaxSize after you call this operation.<ul>
     * <li>If the call results in the total number of ECS instances dropping below the value of MinSize, Auto Scaling proactively creates pay-as-you-go ECS instances to ensure that the total number reaches the minimum threshold. For example, if you set MinSize to 5 when you created a scaling group and include InstanceId.N within your request to add two ECS instances when you attempt to enable the scaling group, Auto Scaling creates three more ECS instances in the scaling group after the two ECS instances are added.</li>
     * <li>If the call results in the total number of ECS instances exceeding the value of MaxSize, the operation fails.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of EnableScalingGroup  EnableScalingGroupRequest
     * @return EnableScalingGroupResponse
     */
    CompletableFuture<EnableScalingGroupResponse> enableScalingGroup(EnableScalingGroupRequest request);

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <ul>
     * <li>If you call the operation to put an ECS instance in a scaling group that is associated with a Classic Load Balancer (CLB) instance into the Standby state, the weight of the ECS instance as a backend server of the CLB instance is set to 0.</li>
     * <li>You can remove an instance that is in the Standby state from a scaling group, and then release the instance.</li>
     * <li>ECS instances that are in the Standby state are not removed from the scaling group during scale-in activities triggered by event-triggered tasks.</li>
     * <li>If Auto Scaling considers an ECS instance that is in the Standby state unhealthy, for example, the ECS instance is being stopped or being restarted, Auto Scaling does not update the health status of the ECS instance or trigger scale-in activities to remove the ECS instance from the scaling group. Auto Scaling updates the health status of the ECS instance only when the ECS instance is no longer in the Standby state.</li>
     * </ul>
     * 
     * @param request the request parameters of EnterStandby  EnterStandbyRequest
     * @return EnterStandbyResponse
     */
    CompletableFuture<EnterStandbyResponse> enterStandby(EnterStandbyRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>The scaling group is in the Active state.</li>
     * <li>No scaling activities in the scaling group are in progress.
     * If no scaling activities in the scaling group are in progress, the operation can trigger scaling activities even before the cooldown time expires.
     * A successful call indicates that Auto Scaling accepts the request. However, the scaling activity may still fail. You can obtain the status of a scaling activity by using the value of the ScalingActivityId parameter in the response.
     * If the addition of a specified number of Elastic Compute Service (ECS) instances to a scaling group causes the total number of ECS instances in the scaling group to exceed the maximum number of instances allowed, Auto Scaling adds only a specific number of ECS instances to ensure that the total number of instances is equal to the maximum number of instances.
     * If the removal of a specified number of ECS instances from a scaling group causes the total number of ECS instances in the scaling group to drop below the minimum number of instances allowed, Auto Scaling removes only a specific number of ECS instances to ensure that the total number of instances is equal to the minimum number of instances.
     * You can specify only a limited number of ECS instances in each adjustment. For more information, see the description of the AdjustmentValue parameter in the CreateScalingRule topic.</li>
     * </ul>
     * 
     * @param request the request parameters of ExecuteScalingRule  ExecuteScalingRuleRequest
     * @return ExecuteScalingRuleResponse
     */
    CompletableFuture<ExecuteScalingRuleResponse> executeScalingRule(ExecuteScalingRuleRequest request);

    /**
     * <b>description</b> :
     * <p>After ECS instances or elastic container instances are removed from the Standby state, the following rules apply:</p>
     * <ul>
     * <li>The ECS instances or elastic container instances enter the In Service state.</li>
     * <li>The default weight of each ECS instance or elastic container instance as a backend server of the attached load balancer is 50.</li>
     * <li>If you stop or restart the ECS instances or elastic container instances, the health check status of the instances will be updated.</li>
     * <li>When a scale-in event is triggered, Auto Scaling may remove the ECS instances or elastic container instances from the scaling group.</li>
     * </ul>
     * 
     * @param request the request parameters of ExitStandby  ExitStandbyRequest
     * @return ExitStandbyResponse
     */
    CompletableFuture<ExitStandbyResponse> exitStandby(ExitStandbyRequest request);

    /**
     * @param request the request parameters of ListTagKeys  ListTagKeysRequest
     * @return ListTagKeysResponse
     */
    CompletableFuture<ListTagKeysResponse> listTagKeys(ListTagKeysRequest request);

    /**
     * <b>description</b> :
     * <p>  Specify at least one of the following request parameters: <code>ResourceIds</code> and <code>Tags</code>. <code>Tags.Key</code> and <code>Tags.Value</code> are used to specify the query objects.</p>
     * <ul>
     * <li>If you provide both <code>ResourceIds</code> and <code>Tags</code> in your request, the response will exclusively include Auto Scaling resources that satisfy the criteria set by these parameters, ensuring targeted and precise information retrieval.</li>
     * </ul>
     * 
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of ListTagValues  ListTagValuesRequest
     * @return ListTagValuesResponse
     */
    CompletableFuture<ListTagValuesResponse> listTagValues(ListTagValuesRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>If you create an event-triggered task of the custom monitoring type (MetricType=custom), you must first report custom monitoring metrics to CloudMonitor. For more information, see <a href="https://help.aliyun.com/document_detail/74861.html">Event-triggered tasks for custom monitoring</a>.</li>
     * <li>When you create an event-triggered task, you must specify a metric (MetricName) and configure dimension information (Dimension.N.DimensionKey and Dimension.N.DimensionValue) to determine the aggregation scope of the metric data in the scaling group. For example, you can specify user_id and scaling_group to aggregate the metric data of all ECS instances or elastic container instances in the scaling group of the specified user.<ul>
     * <li>The metrics of a custom monitoring event-triggered task (MetricType=custom) depend on your custom monitoring metrics.</li>
     * <li>For more information about the metrics supported by system monitoring event-triggered tasks (MetricType=system), see <a href="https://help.aliyun.com/document_detail/74854.html">Event-triggered tasks for system monitoring</a>.<blockquote>
     * <p>In the dimension information, user_id and scaling_group are automatically populated by the system. You must manually specify device and state. For more information, see the Dimension.N.DimensionKey and Dimension.N.DimensionValue parameters.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ModifyAlarm  ModifyAlarmRequest
     * @return ModifyAlarmResponse
     */
    CompletableFuture<ModifyAlarmResponse> modifyAlarm(ModifyAlarmRequest request);

    /**
     * @param request the request parameters of ModifyAlertConfiguration  ModifyAlertConfigurationRequest
     * @return ModifyAlertConfigurationResponse
     */
    CompletableFuture<ModifyAlertConfigurationResponse> modifyAlertConfiguration(ModifyAlertConfigurationRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>If you modify the name of the scaling configuration, ensure that no other scaling configuration in the same scaling group has the same name.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/459374.html">DescribeEciScalingConfigurations</a> operation to query and verify the modification result.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyEciScalingConfiguration  ModifyEciScalingConfigurationRequest
     * @return ModifyEciScalingConfigurationResponse
     */
    CompletableFuture<ModifyEciScalingConfigurationResponse> modifyEciScalingConfiguration(ModifyEciScalingConfigurationRequest request);

    /**
     * @param request the request parameters of ModifyInstanceAttribute  ModifyInstanceAttributeRequest
     * @return ModifyInstanceAttributeResponse
     */
    CompletableFuture<ModifyInstanceAttributeResponse> modifyInstanceAttribute(ModifyInstanceAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>You can specify the lifecycle hook to be modified in one of the following ways:</p>
     * <ul>
     * <li>Specify only the lifecycle hook ID (LifecycleHookId). In this case, the ScalingGroupId and LifecycleHookName parameters are ignored.</li>
     * <li>Specify both the scaling group ID (ScalingGroupId) and the lifecycle hook name (LifecycleHookName). The lifecycle hook name is unique within a scaling group.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyLifecycleHook  ModifyLifecycleHookRequest
     * @return ModifyLifecycleHookResponse
     */
    CompletableFuture<ModifyLifecycleHookResponse> modifyLifecycleHook(ModifyLifecycleHookRequest request);

    /**
     * @param request the request parameters of ModifyNotificationConfiguration  ModifyNotificationConfigurationRequest
     * @return ModifyNotificationConfigurationResponse
     */
    CompletableFuture<ModifyNotificationConfigurationResponse> modifyNotificationConfiguration(ModifyNotificationConfigurationRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>If you modify the name of a scaling configuration, ensure that no other scaling configuration in the same scaling group has the same name.</li>
     * <li>You can bind a primary network interface card (NIC) by using one of the following methods. However, you can use only one method in a single request. If you use both methods, the request fails and an error message is returned. When you modify the scaling configuration by using one method, the NIC configuration set by the other method is cleared.<ul>
     * <li>Directly configure the primary NIC by using parameters such as SecurityGroupId, SecurityGroupIds, and Ipv6AddressCount.</li>
     * <li>Configure the primary NIC and secondary NICs by using the NetworkInterfaces parameter. When you use the NetworkInterfaces parameter, you must configure the primary NIC. If NetworkInterface.InstanceType is set to Primary, the primary NIC is configured. If NetworkInterface.InstanceType is set to Secondary or left empty, a secondary NIC is configured.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ModifyScalingConfiguration  ModifyScalingConfigurationRequest
     * @return ModifyScalingConfigurationResponse
     */
    CompletableFuture<ModifyScalingConfigurationResponse> modifyScalingConfiguration(ModifyScalingConfigurationRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>The following parameters cannot be modified:<ul>
     * <li>RegionId.</li>
     * <li>LoadBalancerId.<blockquote>
     * <p>To modify load balancing instances, use the AttachLoadBalancers and DetachLoadBalancers operations.</p>
     * </blockquote>
     * </li>
     * <li>DBInstanceId.<blockquote>
     * <p>To modify ApsaraDB RDS instances, use the AttachDBInstances and DetachDBInstances operations.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * <li>You can call this operation only when the scaling group is in the Active or Inactive state.</li>
     * <li>Activating a new scaling configuration does not affect the running ECS instances or elastic container instances that were created by using earlier scaling configurations.</li>
     * <li>If you modify the MaxSize parameter and the number of ECS instances or elastic container instances in the scaling group exceeds the value of MaxSize, Auto Scaling automatically removes ECS instances or elastic container instances from the scaling group until the number of instances equals the value of MaxSize.</li>
     * <li>If you modify the MinSize parameter and the number of ECS instances or elastic container instances in the scaling group is less than the value of MinSize, Auto Scaling automatically adds ECS instances or elastic container instances to the scaling group until the number of instances equals the value of MinSize.</li>
     * <li>If the DesiredCapacity parameter is configured for the scaling group and you modify the value of DesiredCapacity, and the current number of ECS instances or elastic container instances in the scaling group is different from the value of DesiredCapacity, Auto Scaling automatically adds or removes ECS instances or elastic container instances until the number of instances equals the value of DesiredCapacity.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyScalingGroup  ModifyScalingGroupRequest
     * @return ModifyScalingGroupResponse
     */
    CompletableFuture<ModifyScalingGroupResponse> modifyScalingGroup(ModifyScalingGroupRequest request);

    /**
     * @param request the request parameters of ModifyScalingRule  ModifyScalingRuleRequest
     * @return ModifyScalingRuleResponse
     */
    CompletableFuture<ModifyScalingRuleResponse> modifyScalingRule(ModifyScalingRuleRequest request);

    /**
     * <b>description</b> :
     * <p>Scheduled tasks support two scaling methods:</p>
     * <ul>
     * <li>Specify the scaling rule to execute by using the ScheduledAction parameter.</li>
     * <li>Specify the number of instances in the scaling group by using the ScalingGroupId parameter.<blockquote>
     * <p>You cannot specify both ScheduledAction and ScalingGroupId at the same time.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ModifyScheduledTask  ModifyScheduledTaskRequest
     * @return ModifyScheduledTaskResponse
     */
    CompletableFuture<ModifyScheduledTaskResponse> modifyScheduledTask(ModifyScheduledTaskRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Warm pools are supported only for ECS scaling groups.</li>
     * <li>Warm pools are supported only when the reclaim mode of the scaling group is set to release or forcerelease.</li>
     * </ul>
     * 
     * @param request the request parameters of PutWarmPool  PutWarmPoolRequest
     * @return PutWarmPoolResponse
     */
    CompletableFuture<PutWarmPoolResponse> putWarmPool(PutWarmPoolRequest request);

    /**
     * @param request the request parameters of QueryHistoricalMetric  QueryHistoricalMetricRequest
     * @return QueryHistoricalMetricResponse
     */
    CompletableFuture<QueryHistoricalMetricResponse> queryHistoricalMetric(QueryHistoricalMetricRequest request);

    /**
     * @param request the request parameters of QueryPredictiveMetric  QueryPredictiveMetricRequest
     * @return QueryPredictiveMetricResponse
     */
    CompletableFuture<QueryPredictiveMetricResponse> queryPredictiveMetric(QueryPredictiveMetricRequest request);

    /**
     * @param request the request parameters of QueryPredictiveTaskInfo  QueryPredictiveTaskInfoRequest
     * @return QueryPredictiveTaskInfoResponse
     */
    CompletableFuture<QueryPredictiveTaskInfoResponse> queryPredictiveTaskInfo(QueryPredictiveTaskInfoRequest request);

    /**
     * @param request the request parameters of QueryPredictiveValue  QueryPredictiveValueRequest
     * @return QueryPredictiveValueResponse
     */
    CompletableFuture<QueryPredictiveValueResponse> queryPredictiveValue(QueryPredictiveValueRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Rebalancing compensates for unbalanced zones by creating new ECS instances to replace existing ones. New ECS instances are started before existing ones are stopped. Rebalancing does not affect the performance or availability of your applications.</p>
     * <ul>
     * <li>This operation is supported only for multi-zone scaling groups whose <code>MultiAZPolicy</code> is set to <code>BALANCE</code>. It is used to balance the distribution of ECS instances across multiple zones.</li>
     * <li>You can perform a rebalancing operation only when the instance distribution in the scaling group is severely unbalanced. A single rebalancing activity can replace up to 20 ECS instances.</li>
     * <li>During a rebalancing activity, if the number of instances in the scaling group approaches or reaches the specified maximum number of ECS instances (MaxSize) but the distribution still needs to be balanced, Auto Scaling allows the number of ECS instances to temporarily exceed MaxSize by 10%. This temporary excess lasts until the distribution is balanced, typically for 1 to 6 minutes. <blockquote>
     * <p>If 10% of the maximum number of instances in the scaling group is not an integer, the decimal part is rounded up to allow an excess of 1 instance. For example, if the maximum number of instances in the scaling group is 15, 10% is 1.5, and the temporary excess allowed is 2 instances.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of RebalanceInstances  RebalanceInstancesRequest
     * @return RebalanceInstancesResponse
     */
    CompletableFuture<RebalanceInstancesResponse> rebalanceInstances(RebalanceInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to extend the wait time only when the ECS instance is suspended.
     * The wait time of an ECS instance cannot exceed 6 hours, and each wait state can be extended up to 20 times.</p>
     * 
     * @param request the request parameters of RecordLifecycleActionHeartbeat  RecordLifecycleActionHeartbeatRequest
     * @return RecordLifecycleActionHeartbeatResponse
     */
    CompletableFuture<RecordLifecycleActionHeartbeatResponse> recordLifecycleActionHeartbeat(RecordLifecycleActionHeartbeatRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you invoke this operation, ensure that the following conditions are met:<ul>
     * <li>The scaling group is enabled (Active).</li>
     * <li>No scaling activity is being executed in the scaling group.<blockquote>
     * <p>If no scaling activity is being executed in the scaling group, this operation can bypass the cooldown time (DefaultCooldown) and be executed directly.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * <li>If an ECS instance is created through automatic creation by Auto Scaling, or was manually added and managed by the scaling group, the ECS instance triggers the economical mode or is released when you delete it from the scaling group.</li>
     * <li>If an ECS instance was manually added and is not managed by the scaling group, the ECS instance is not stopped or released when you delete it from the scaling group.</li>
     * <li>If the number of instances in the scaling group (TotalCapacity) minus the number of instances specified in this operation is less than the minimum number of instances (MinSize) in the scaling group, the request to invoke this operation fails.
     * A successful response only indicates that the Auto Scaling service has accepted the request and the scaling activity can be executed. It does not mean that the scaling activity will be executed successfully. You must check the execution status of the scaling activity by using the returned ScalingActivityId.</li>
     * </ul>
     * 
     * @param request the request parameters of RemoveInstances  RemoveInstancesRequest
     * @return RemoveInstancesResponse
     */
    CompletableFuture<RemoveInstancesResponse> removeInstances(RemoveInstancesRequest request);

    /**
     * @param request the request parameters of ResumeInstanceRefresh  ResumeInstanceRefreshRequest
     * @return ResumeInstanceRefreshResponse
     */
    CompletableFuture<ResumeInstanceRefreshResponse> resumeInstanceRefresh(ResumeInstanceRefreshRequest request);

    /**
     * @param request the request parameters of ResumeProcesses  ResumeProcessesRequest
     * @return ResumeProcessesResponse
     */
    CompletableFuture<ResumeProcessesResponse> resumeProcesses(ResumeProcessesRequest request);

    /**
     * <b>description</b> :
     * <h2>前提条件</h2>
     * <p>被回滚的实例刷新任务必须在启动时（调用 StartInstanceRefresh）设置了 <code>DesiredConfiguration</code> 参数。未设置 <code>DesiredConfiguration</code> 的实例刷新任务不支持回滚，调用本接口会返回 <code>UnsupportedOperation.DesiredConfiguration</code> 错误；如需回滚此类任务，请先取消该任务，再以 <code>DesiredConfiguration</code> 重新启动实例刷新后执行回滚。</p>
     * 
     * @param request the request parameters of RollbackInstanceRefresh  RollbackInstanceRefreshRequest
     * @return RollbackInstanceRefreshResponse
     */
    CompletableFuture<RollbackInstanceRefreshResponse> rollbackInstanceRefresh(RollbackInstanceRefreshRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you call this operation, ensure that the following conditions are met:<ul>
     * <li>The scaling group is in the Active state.</li>
     * <li>No scaling activities are in progress in the scaling group.</li>
     * </ul>
     * </li>
     * <li>If no scaling activities are in progress in the scaling group, this operation can bypass the cooldown time and directly execute a scaling activity.</li>
     * <li>If the number of ECS instances to be added specified in the scaling rule plus the current number of instances in the scaling group (Total Capacity) exceeds the maximum number of instances (MaxSize), the scaling activity is executed with Total Capacity set to MaxSize.</li>
     * <li>If the current number of instances in the scaling group (Total Capacity) minus the number of ECS instances to be removed specified in the scaling rule is less than the minimum number of instances (MinSize), the scaling activity is executed with Total Capacity set to MinSize.
     * A successful response only indicates that Auto Scaling accepted the request and can execute the scaling activity. It does not guarantee that the scaling activity will be successfully executed. You must use the returned <code>ScalingActivityId</code> to check the execution status of the scaling activity.</li>
     * </ul>
     * 
     * @param request the request parameters of ScaleWithAdjustment  ScaleWithAdjustmentRequest
     * @return ScaleWithAdjustmentResponse
     */
    CompletableFuture<ScaleWithAdjustmentResponse> scaleWithAdjustment(ScaleWithAdjustmentRequest request);

    /**
     * @param request the request parameters of SetGroupDeletionProtection  SetGroupDeletionProtectionRequest
     * @return SetGroupDeletionProtectionResponse
     */
    CompletableFuture<SetGroupDeletionProtectionResponse> setGroupDeletionProtection(SetGroupDeletionProtectionRequest request);

    /**
     * <b>description</b> :
     * <p>A scaling group detects and removes ECS instances or ECI instances that are in the unhealthy state. To retain specific ECS or ECI instances, put the instances into the standby state or protection status. For more information, see <a href="https://help.aliyun.com/document_detail/459345.html">EnterStandby</a> and <a href="https://help.aliyun.com/document_detail/459342.html">SetInstancesProtection</a>.</p>
     * 
     * @param request the request parameters of SetInstanceHealth  SetInstanceHealthRequest
     * @return SetInstanceHealthResponse
     */
    CompletableFuture<SetInstanceHealthResponse> setInstanceHealth(SetInstanceHealthRequest request);

    /**
     * <b>description</b> :
     * <p>After the protection status is enabled for an ECS instance:</p>
     * <ul>
     * <li>The instance remains in this state until you disable the protection status.</li>
     * <li>The protected ECS instance is not removed even if changes in the number of instances in the scaling group or monitoring tasks trigger a scaling activity for automatic scale-in. You must remove the ECS instance before you can release it. For more information, see <a href="https://help.aliyun.com/document_detail/459393.html">Remove ECS instances</a>.</li>
     * <li>The health check status of the ECS instance is not updated when the instance is stopped or restarted.</li>
     * </ul>
     * 
     * @param request the request parameters of SetInstancesProtection  SetInstancesProtectionRequest
     * @return SetInstancesProtectionResponse
     */
    CompletableFuture<SetInstancesProtectionResponse> setInstancesProtection(SetInstancesProtectionRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>A scaling group can have only one running instance refresh node at a time.</li>
     * <li>This feature is supported only for ECS scaling groups that use the <strong>priority policy</strong> as the scale-out policy. Scaling groups that use the <strong>number of vCPUs to calculate the capacity of the scaling group</strong> and scaling groups whose instance revoke pattern is set to <strong>shutdown revoke pattern</strong> or <strong>forced shutdown revoke pattern</strong> do not support this feature.</li>
     * <li>During an instance refresh, normal scale-out and scale-in activities can be performed. However, scale-out activities use the desired configuration specified for the instance refresh.</li>
     * <li>Instances that are manually added to the scaling group, or are in the standby state or protection status are ignored by the instance refresh node and are not refreshed.</li>
     * </ul>
     * 
     * @param request the request parameters of StartInstanceRefresh  StartInstanceRefreshRequest
     * @return StartInstanceRefreshResponse
     */
    CompletableFuture<StartInstanceRefreshResponse> startInstanceRefresh(StartInstanceRefreshRequest request);

    /**
     * @param request the request parameters of StartScalingGroupZoneShift  StartScalingGroupZoneShiftRequest
     * @return StartScalingGroupZoneShiftResponse
     */
    CompletableFuture<StartScalingGroupZoneShiftResponse> startScalingGroupZoneShift(StartScalingGroupZoneShiftRequest request);

    /**
     * <b>description</b> :
     * <p>  You cannot call this operation to suspend an instance refresh task that is being rolled back.</p>
     * 
     * @param request the request parameters of SuspendInstanceRefresh  SuspendInstanceRefreshRequest
     * @return SuspendInstanceRefreshResponse
     */
    CompletableFuture<SuspendInstanceRefreshResponse> suspendInstanceRefresh(SuspendInstanceRefreshRequest request);

    /**
     * @param request the request parameters of SuspendProcesses  SuspendProcessesRequest
     * @return SuspendProcessesResponse
     */
    CompletableFuture<SuspendProcessesResponse> suspendProcesses(SuspendProcessesRequest request);

    /**
     * <b>description</b> :
     * <p>  You can attach up to 20 tags to a scaling group.
     *     **
     *     <strong>Note</strong> Before you attach tags to a specific Auto Scaling resource, Alibaba Cloud automatically verifies the current number of tags attached to that resource. In the event the proposed addition would exceed the maximum allowed number of tags, an error message will be promptly returned after you call this operation.</p>
     * <ul>
     * <li>If you set <code>Tags.Propagate</code> to <code>true</code>, any tags attached to your scaling group will be automatically propagated to new instances that are subsequently created in the scaling group, without affecting existing instances.</li>
     * <li>If both the scaling configuration and the scaling group have tags attached, and tag propagation from the scaling group is enabled, the tags of newly created instances comply with the following rules:<ul>
     * <li>Instances set to join the scaling group will inherit the following tags: tags attached to the scaling configuration that initiates the instance creation and tags attached to the scaling group that are allowed to propagate to these instances upon instance creation.</li>
     * <li>If the tag keys of the scaling configuration and those attached to the scaling group and propagated to the instances are identical, the tags attached to the scaling group and propagated to the instances will be overwritten by the tags of the scaling configuration.</li>
     * </ul>
     * </li>
     * </ul>
     * 
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
     * @param request the request parameters of VerifyAuthentication  VerifyAuthenticationRequest
     * @return VerifyAuthenticationResponse
     */
    CompletableFuture<VerifyAuthenticationResponse> verifyAuthentication(VerifyAuthenticationRequest request);

    /**
     * @param request the request parameters of VerifyUser  VerifyUserRequest
     * @return VerifyUserResponse
     */
    CompletableFuture<VerifyUserResponse> verifyUser(VerifyUserRequest request);

}
