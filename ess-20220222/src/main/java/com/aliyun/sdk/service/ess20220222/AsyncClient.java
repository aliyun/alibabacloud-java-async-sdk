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
     * <p>Before you use a YAML configuration file to manage scaling configurations of the Elastic Container Instance type, you must take note of the following items:</p>
     * <ul>
     * <li>If you include a scaling configuration ID within your request, the system updates the scaling configuration based on the YAML configuration file.</li>
     * <li>If you do not include a scaling configuration ID within your request, the system creates a scaling configuration of the Elastic Container Instance type based on the YAML configuration file.</li>
     * </ul>
     * 
     * @param request the request parameters of ApplyEciScalingConfiguration  ApplyEciScalingConfigurationRequest
     * @return ApplyEciScalingConfigurationResponse
     */
    CompletableFuture<ApplyEciScalingConfigurationResponse> applyEciScalingConfiguration(ApplyEciScalingConfigurationRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the ApplyScalingGroup operation to create scaling groups of the Elastic Container Instance type with ease. The resources of the scaling groups are defined in Kubernetes Deployment YAML files. You can also call this operation to extend annotations for elastic container instances in Kubernetes Deployment YAML files. For more information, see &quot;Supported annotations&quot; in this topic.
     * Mapping between YAML files and scaling groups: You can map the triplet of namespace, kind, and name in a YAML file to a scaling group name. A YAML file and a scaling group have a one-to-one mapping relationship in a region. For example, if you use the Kubernetes Deployment YAML file whose name is NGINX in the default namespace to create a scaling group in a region, the unique name of the mapped scaling group is k8s_default_Deployment_nginx.
     * You can use a Kubernetes Deployment YAML file to manage a scaling group based on the following logic:</p>
     * <ul>
     * <li>If an existing scaling group has a mapping relationship with your Kubernetes Deployment YAML file, you can update the scaling group by using the YAML file.</li>
     * <li>If no scaling group that has a mapping relationship with your Kubernetes Deployment YAML file exists, you can create a scaling group with ease by using the YAML file.</li>
     * </ul>
     * <ol>
     * <li>If you do not specify a virtual private cloud (VPC), vSwitch, security group, or annotation in your Kubernetes Deployment YAML file, the system creates a default VPC that has default vSwitches and uses the default security group ess-default-sg of Auto Scaling. By default, the security group rule allows traffic on Transmission Control Protocol (TCP)-based port 22 and port 3389 and enables Internet Control Message Protocol (ICMP) for IPv4 addresses. If you want to enable other ports or protocols, you can create custom security group rules.</li>
     * <li>If you want to use a public image, you must enable the Internet access feature and configure the k8s.aliyun.com/eci-with-eip pod annotation to enable the elastic IP address (EIP) feature.</li>
     * <li>After you call the ApplyScalingGroup operation to apply a Kubernetes Deployment YAML file, the scaling group immediately enters the Enabled state and the scaling configuration immediately enters the Active state. If the number of replicas that you specified in the YAML file is grater than 0, elastic container instances are automatically created.</li>
     * </ol>
     * <h3>Supported annotations</h3>
     * <p>For more information about annotations, see <a href="https://help.aliyun.com/document_detail/186939.html">ECI Pod Annotation</a>.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Annotation</th>
     * <th>Example</th>
     * <th>Description</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>k8s.aliyun.com/ess-scaling-group-min-size</td>
     * <td>1</td>
     * <td>The minimum size of the scaling group that you want to create. Default value: 0.</td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/ess-scaling-group-max-size</td>
     * <td>20</td>
     * <td>The maximum size of the scaling group that you want to create. Default value: maximum number of replicas or 30, whichever is greater.</td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-ntp-server</td>
     * <td>100.100.<em>.</em></td>
     * <td>The IP address of the Network Time Protocol (NTP) server.</td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-use-specs</td>
     * <td>2-4Gi</td>
     * <td>The specifications of 2 vCPUs and 4 GiB of memory. For more information, see <a href="https://help.aliyun.com/document_detail/451267.html">Create pods by specifying multiple specifications</a>.</td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-vswitch</td>
     * <td>vsw-bp1xpiowfm5vo8o3c\<em>\</em>\<em>\</em></td>
     * <td>The ID of the vSwitch. You can specify multiple vSwitches to specify multiple zones.</td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-security-group</td>
     * <td>sg-bp1dktddjsg5nktv\<em>\</em>\<em>\</em></td>
     * <td>The ID of the security group. Before you configure this annotation, take note of the following requirements:<ul data-sourcepos="26:74-26:168"><li data-sourcepos="26:78-26:114">You can specify one or more security groups. You can specify up to five security groups for each scaling group.</li><li data-sourcepos="26:114-26:140">If you specify multiple security groups, the security groups must belong to the same VPC.</li><li data-sourcepos="26:140-26:163">If you specify multiple security groups, the security groups must be of the same type.</li></ul></td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-sls-enable</td>
     * <td>&quot;false&quot;</td>
     * <td>If you set the value to false, the log collection feature is disabled.</td>
     * </tr>
     * <tr>
     * <td>If you do not want to use Custom Resource Definition (CRD) for Simple Log Service to collect logs of specific pods, you can configure this annotation for the pods and set the value to false. This prevents resource wastes caused by Logtails created by the system.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-spot-strategy</td>
     * <td>SpotAsPriceGo</td>
     * <td>The bidding policy for preemptible instances. Valid values:<ul data-sourcepos="28:69-28:204"><li data-sourcepos="28:73-28:158">SpotWithPriceLimit: The instances are created as preemptible instances with a maximum hourly price. If you set the value to SpotWithPriceLimit, you must configure the k8s.aliyun.com/eci-spot-price-limit annotation.</li><li data-sourcepos="28:158-28:199">SpotAsPriceGo: The instances are created as preemptible instances for which the market price at the time of purchase is automatically used as the bid price.</li></ul></td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-spot-price-limit</td>
     * <td>&quot;0.5&quot;</td>
     * <td>The maximum hourly price of preemptible instances. This value can be accurate to up to three decimal places.</td>
     * </tr>
     * <tr>
     * <td>This annotation takes effect only when you set the k8s.aliyun.com/eci-spot-strategy annotation to SpotWithPriceLimit.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-with-eip</td>
     * <td>&quot;true&quot;</td>
     * <td>If you set the value to true, an elastic IP address (EIP) is automatically created and bound to each elastic container instance.</td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-data-cache-bucket</td>
     * <td>default</td>
     * <td>The bucket of data caches. If you want to create a pod based on data caches, you must configure this annotation.</td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-data-cache-pl</td>
     * <td>PL1</td>
     * <td>The performance level (PL) of the cloud disk that you want to create based on data caches.</td>
     * </tr>
     * <tr>
     * <td>By default, enterprise SSDs (ESSDs) are created. Default value: PL1.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-data-cache-provisionedIops</td>
     * <td>&quot;40000&quot;</td>
     * <td>The provisioned read/write IOPS of the ESSD AutoPL disk. Valid values: 0 to min{50000, 1000 × Capacity - Baseline IOPS}. Baseline IOPS = min{1,800 + 50 × Capacity, 50,000}. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</td>
     * </tr>
     * <tr>
     * <td>If you configure this annotation, the cloud disk that is created based on data caches is of the ESSD AutoPL type.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-data-cache-burstingEnabled</td>
     * <td>&quot;true&quot;</td>
     * <td>Specifies whether the Burst feature is enabled for the ESSD AutoPL disk. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL disks</a>.</td>
     * </tr>
     * <tr>
     * <td>If you configure this annotation, the cloud disk that is created based on data caches is of the ESSD AutoPL type.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>k8s.aliyun.com/eci-custom-tags</td>
     * <td>&quot;env:test,name:alice&quot;</td>
     * <td>The tags that you want to add to each elastic container instance. You can add up to three tags for each elastic container instance. Separate a tag key and a tag value with a colon (:). Separate multiple tags with commas (,).</td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of ApplyScalingGroup  ApplyScalingGroupRequest
     * @return ApplyScalingGroupResponse
     */
    CompletableFuture<ApplyScalingGroupResponse> applyScalingGroup(ApplyScalingGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call the operation to attach an ALB server group to your scaling group, make sure that the following requirements are met:</p>
     * <ul>
     * <li>The scaling group and the ALB server group share the same virtual private cloud (VPC).</li>
     * <li>The ALB server group is in the Available state.</li>
     * </ul>
     * 
     * @param request the request parameters of AttachAlbServerGroups  AttachAlbServerGroupsRequest
     * @return AttachAlbServerGroupsResponse
     */
    CompletableFuture<AttachAlbServerGroupsResponse> attachAlbServerGroups(AttachAlbServerGroupsRequest request);

    /**
     * <b>description</b> :
     * <p>Before you attach an ApsaraDB RDS instance to a scaling group, make sure that the ApsaraDB RDS instance meets the following requirements:</p>
     * <ul>
     * <li>The ApsaraDB RDS instance and the scaling group belong to the same Alibaba Cloud account.</li>
     * <li>The ApsaraDB RDS instance is unlocked. For information about the lock policy, see <a href="https://help.aliyun.com/document_detail/41872.html">ApsaraDB RDS usage notes</a>.</li>
     * <li>The ApsaraDB RDS instance is in the Running state.</li>
     * <li>The ApsaraDB RDS instance exists in the Alibaba Cloud account.</li>
     * <li>If you reattach an ApsaraDB RDS instance to a scaling group, the total number of attached ApsaraDB RDS instances of the scaling group remains unchanged. But Auto Scaling adds the private IP addresses of all Elastic Compute Service (ECS) instances in the scaling group to the IP address whitelist of the ApsaraDB RDS instance.<blockquote>
     * <p> After you attach an ApsaraDB RDS instance to a scaling group, make sure that the number of IP addresses in the default whitelist of the ApsaraDB RDS instance is limited to 1,000. For information about IP address whitelists, see <a href="https://help.aliyun.com/document_detail/96118.html">Configure an IP address whitelist</a>.</p>
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
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>The scaling group is in the Active state.</li>
     * <li>No scaling activities in the scaling group are in progress.
     * The ECS instances or the elastic container instances that you want to add to a scaling group must meet the following requirements:</li>
     * <li>The instances reside in the same region as the scaling group.</li>
     * <li>The instances must be in the Running state.</li>
     * <li>The instances are not added to other scaling groups.</li>
     * <li>The instances use the subscription or pay-as-you-go billing method, or are preemptible instances.</li>
     * <li>If the VswitchID parameter is specified for a scaling group, the instances that are in the classic network or those that are not in the same virtual private cloud (VPC) as the specified vSwitch cannot be added to the scaling group.</li>
     * <li>If the VswitchID parameter is not specified for a scaling group, the instances that are in VPCs cannot be added to the scaling group.
     * If no scaling activities in the specified scaling group are in progress, the operation can trigger scaling activities even before the cooldown time expires.
     * A successful call indicates that Auto Scaling accepts the request. However, the scaling activity may still fail. You can obtain the status of a scaling activity by using the value of the ScalingActivityId parameter in the response.
     * If the sum of the number of instances that you want to add and the number of existing instances in the scaling group is greater than the value of the MaxSize parameter, the call fails.
     * Instances that are manually added by calling the AttachInstances operation are not associated with the active scaling configuration of the scaling group.</li>
     * </ul>
     * 
     * @param request the request parameters of AttachInstances  AttachInstancesRequest
     * @return AttachInstancesResponse
     */
    CompletableFuture<AttachInstancesResponse> attachInstances(AttachInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that the following requirements are met:</p>
     * <ul>
     * <li>The load balancer and the scaling group belong to the same Alibaba Cloud account and region.</li>
     * <li>The load balancer is in the <code>Running</code> state.</li>
     * <li>At least one listener is configured for the load balancer, and the health check feature is enabled for the load balancer.</li>
     * <li>If the network type of the load balancer and the scaling group is virtual private cloud (VPC), they use the same VPC.</li>
     * <li>If the network type of the scaling group is VPC, and that of the load balancer is classic network and a backend server of the load balancer uses a VPC, the scaling group and the backend server use the same VPC.</li>
     * <li>The attachment of load balancers ensures that the cumulative number of load balancers attached to the scaling group stays within the predefined maximum limit. For information about the load balancer quota, see <a href="https://help.aliyun.com/document_detail/25863.html">Limits</a>.</li>
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
     * <p>  Before you call this operation, make sure that the following requirements are met:
     *     *   The CLB instance and the scaling group belong to the same Alibaba Cloud account.
     *     *   The CLB instance and the scaling group reside in the same region.
     *     *   The CLB instance is in the Running state.
     *     *   The CLB instance is configured with at least one listener. The health check feature is enabled for the CLB instance.
     *     *   If the network type of both the CLB instance and the scaling group is virtual private cloud (VPC), they use the same VPC.
     *     *   If the network type of the scaling group is VPC and the network type of the CLB instance is classic network, any backend server of the CLB instance within a VPC setup shares the same VPC as the scaling group.
     *     *   The vServer groups that you want to attach to the scaling group belong to the CLB instance.
     *     *   The operation to attach vServer groups does not result in the total number of vServer groups exceeding the predefined quota limit. For information about the vServer group quota, see <a href="https://help.aliyun.com/document_detail/25863.html">Limits</a>.</p>
     * <ul>
     * <li>When you call this operation to attach vServer groups, you must specify the following parameters:<ul>
     * <li>LoadBalancerId: the ID of the CLB instance</li>
     * <li>VServerGroupId: the ID of the vServer group</li>
     * <li>Port: the port number of the vServer group
     * **
     * <strong>Note</strong> If you attempt to attach the same vServer group to a scaling group multiple times over the identical port, the system regards each attempt as a separate vServer group attachment to the scaling group. In your request, if you include the same vServer group ID coupled with the same port number multiple times, only the first configuration of the vServer group and port number pairing is considered valid. Subsequent vServer group and port number parings are disregarded.</li>
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
     * <p>  You cannot call this operation to cancel instance refresh tasks that are being rolled back.</p>
     * 
     * @param request the request parameters of CancelInstanceRefresh  CancelInstanceRefreshRequest
     * @return CancelInstanceRefreshResponse
     */
    CompletableFuture<CancelInstanceRefreshResponse> cancelInstanceRefresh(CancelInstanceRefreshRequest request);

    /**
     * <b>description</b> :
     * <p>  A resource is an entity of cloud services that you create on Alibaba Cloud. For example, a scaling group is a resource.</p>
     * <ul>
     * <li>A resource group serves as a powerful organizational tool within your Alibaba Cloud account, enabling you to manage and monitor multiple resources collectively. It effectively addresses complexities surrounding resource categorization and permission control under a single Alibaba Cloud account, thereby enhancing management efficiency and control. For more information, see <a href="https://help.aliyun.com/document_detail/94475.html">What is resource management?</a></li>
     * </ul>
     * 
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>When you manually cut short the timeout period of a lifecycle hook, Auto Scaling proceeds with one of the following actions based on the predefined settings: responding to the scaling request, aborting the scaling request, and initiating a rollback process.</p>
     * 
     * @param request the request parameters of CompleteLifecycleAction  CompleteLifecycleActionRequest
     * @return CompleteLifecycleActionResponse
     */
    CompletableFuture<CompleteLifecycleActionResponse> completeLifecycleAction(CompleteLifecycleActionRequest request);

    /**
     * <b>description</b> :
     * <p>  If you set MetricType to custom, you must report your custom metrics to CloudMonitor before you can create event-triggered tasks by using the custom metrics. For more information, see <a href="https://help.aliyun.com/document_detail/74861.html">Event-triggered tasks of the custom monitoring type</a>.</p>
     * <ul>
     * <li>When you create an event-triggered task, you must specify MetricName, Dimensions.DimensionKey, and Dimensions.DimensionValue to determine the range of statistics that you want to aggregate for the metrics of the scaling group. For example, you can specify user_id and scaling_group for an event-triggered task to aggregate monitoring data of all ECS instances or elastic container instances in a scaling group within an Alibaba Cloud account.<ul>
     * <li>If you create an event-triggered task of the custom monitoring type, you can specify only custom metrics in the task.</li>
     * <li>If you create an event-triggered task of the system monitoring type, you can specify the system metrics described in <a href="https://help.aliyun.com/document_detail/74854.html">Event-triggered tasks of the system monitoring type</a> in the task.<blockquote>
     * <p> user_id and scaling_group are automatically populated. You need to only specify device and state. For more information, see <code>Dimensions.DimensionKey</code> and <code>Dimensions.DimensionValue</code> in the &quot;Request parameters&quot; section of this topic.</p>
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
     * <p>A scaling configuration is a template that is used to create elastic container instances during scale-out events.
     * You can specify CPU and Memory to determine the range of instance types. Then, Auto Scaling determines the available instance types based on factors such as I/O optimization requirements and zones. Auto Scaling preferentially creates elastic container instances by using the lowest-priced instance type. This method applies only if you set Scaling Policy to Cost Optimization Policy and no instance type is specified in the scaling configuration.</p>
     * 
     * @param request the request parameters of CreateEciScalingConfiguration  CreateEciScalingConfigurationRequest
     * @return CreateEciScalingConfigurationResponse
     */
    CompletableFuture<CreateEciScalingConfigurationResponse> createEciScalingConfiguration(CreateEciScalingConfigurationRequest request);

    /**
     * <b>description</b> :
     * <p>You can create up to six lifecycle hooks for each scaling group. After a lifecycle hook is created for a scaling group, Elastic Compute Service (ECS) instances in the scaling group waits to be added to or removed from the scaling group during scaling activities. You can use the HeartbeatTimeout parameter to specify the timeout period of the lifecycle hook. During the timeout period of a lifecycle hook, you can perform custom operations such as initialize ECS instance configurations and download ECS instance data on the ECS instances for which the lifecycle hook is applied.
     * During a scale-out activity and the timeout period of a lifecycle hook, the private IP addresses of ECS instances wait to be added to the associated whitelist that manages access to the ApsaraDB RDS instance. The ECS instances also wait to be added to the backend server group of the associated Classic Load Balancer (CLB) instance. After the lifecycle hook times out, the private IP addresses of the ECS instances are added to the whitelist that manages access to the associated ApsaraDB RDS instance. The ECS instances are also added to the backend server group of the associated CLB instance. During a scale-in activity and the timeout period of a lifecycle hook, the private IP addresses of ECS instances wait to be removed from the whitelist that manages access to the associated ApsaraDB RDS instance. The ECS instances also wait to be removed from the backend server group of the associated CLB instance. After the lifecycle hook times out, the private IP addresses of the ECS instances are removed from the whitelist that manages access to the associated ApsaraDB RDS instance. The ECS instances are also removed from the backend server group of the associated CLB instance.
     * You can configure a notification method for a lifecycle hook. When the lifecycle hook is triggered, a notification can be sent to the specified Message Service (MNS) topic or queue, or an operation can be performed based on the specified Operation Orchestration Service (OOS) template. If you want to configure an OOS template, you must create a Resource Access Management (RAM) role for OOS. For more information, see <a href="https://help.aliyun.com/document_detail/120810.html">Grant RAM permissions to OOS</a>.</p>
     * <blockquote>
     * <p>If your scaling group has existing ECS instances and you configured an OOS template that is used to add the private IP addresses of ECS instances to or remove the private IP addresses of ECS instances from the whitelists that manage access to cloud databases that are not ApsaraDB RDS databases, you must manually add the private IP addresses of the ECS instances to or remove the private IP addresses of the ECS instances from the whitelists that manage access to the cloud databases.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateLifecycleHook  CreateLifecycleHookRequest
     * @return CreateLifecycleHookResponse
     */
    CompletableFuture<CreateLifecycleHookResponse> createLifecycleHook(CreateLifecycleHookRequest request);

    /**
     * <b>description</b> :
     * <p>  You can enable a CloudMonitor system event, Message Service (MNS) queue, or MNS topic to receive notifications. When a scaling event of the specified type or resource change occurs in your scaling group, Auto Scaling automatically sends notifications to CloudMonitor or MNS.</p>
     * <ul>
     * <li>You cannot specify the same recipient for notifications of different event types in a scaling group.
     * For example, you cannot enable the same CloudMonitor system event, MNS topic, or MNS queue to receive notifications of different event types in a scaling group.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateNotificationConfiguration  CreateNotificationConfigurationRequest
     * @return CreateNotificationConfigurationResponse
     */
    CompletableFuture<CreateNotificationConfigurationResponse> createNotificationConfiguration(CreateNotificationConfigurationRequest request);

    /**
     * <b>description</b> :
     * <p>Auto Scaling automatically creates Elastic Compute Service (ECS) instances based on the specified scaling configuration. ECS instances can be created in the following modes:</p>
     * <ul>
     * <li>InstancePatternInfos: intelligent configuration mode. In this mode, you need to only specify the number of vCPUs, memory size, instance family, and maximum price. Auto Scaling selects the instance type that has the lowest price based on the configurations to create ECS instances. This mode is available only for scaling groups that reside in virtual private clouds (VPCs). This mode reduces scale-out failures caused by insufficient inventory of instance types.</li>
     * <li>InstanceType: In this mode, you must specify one instance type.</li>
     * <li>InstanceTypes: In this mode, you can specify more than one instance type.</li>
     * <li>InstanceTypeOverrides: In this mode, you can specify multiple instance types and weights for the instance types.</li>
     * <li>Cpu and Memory: In this mode, you must specify the number of vCPUs and the memory size. Auto Scaling determines the range of available instance types based on factors such as I/O optimization requirements and zones. Then, Auto Scaling creates ECS instances by using the lowest-priced instance type. This mode is available only if Scaling Policy is set to Cost Optimization Policy and no instance type is specified in the scaling configuration.<blockquote>
     * <p>You cannot specify InstanceType, InstanceTypes, InstanceTypeOverrides, and Cpu and Memory at the same time. You can specify InstanceType and InstancePatternInfos or specify InstanceTypes and InstancePatternInfo at the same time. If you specify InstanceType and InstancePatternInfos or specify InstanceTypes and InstancePatternInfos at the same time, Auto Scaling preferentially uses the instance types that are specified by InstanceType or InstanceTypes for scale-outs. If the instance types that are specified by InstanceType or InstanceTypes do not have sufficient inventory, Auto Scaling uses the instance types that are specified by InstancePatternInfos for scale-outs.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateScalingConfiguration  CreateScalingConfigurationRequest
     * @return CreateScalingConfigurationResponse
     */
    CompletableFuture<CreateScalingConfigurationResponse> createScalingConfiguration(CreateScalingConfigurationRequest request);

    /**
     * <b>description</b> :
     * <p>A scaling group is a group of Elastic Compute Service (ECS) instances that can be used for similar purposes.
     * You can create only a limited number of scaling groups in a region. To check the quota of the scaling groups, go to Quota Center.
     * A scaling group does not immediately take effect after you create the scaling group. You can call the <a href="https://help.aliyun.com/document_detail/25939.html">EnableScalingGroup</a> operation to enable a scaling group. You can trigger scaling events and execute scaling rules only in scaling groups that are in the Enabled state.
     * If you want to attach a Classic Load Balancer (CLB, formerly known as SLB) instance and an ApsaraDB RDS instance to the scaling group that you want to create, the scaling group, the CLB instance, and the ApsaraDB RDS instance must reside in the same region. For more information, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.
     * If you attach a CLB instance to the scaling group that you want to create, Auto Scaling automatically adds the ECS instances in the scaling group to the backend server groups of the CLB instance. You can specify the following types of server groups to add ECS instances:</p>
     * <ul>
     * <li>Default server group: ECS instances in this group process frontend requests. If no listeners are configured for vServer groups or primary/secondary server groups, the frontend requests are forwarded to the ECS instances in the default server group.</li>
     * <li>vServer group: If you want to forward different requests to different backend servers, or you want to forward requests based on domain names or URLs, you can specify vServer groups.<blockquote>
     * <p> If you specify both the default server group and multiple server groups simultaneously, Auto Scaling adds the ECS instances in your scaling group to these server groups concurrently.
     * The default weight of each ECS instance as a backend server is 50. If you want to attach a CLB instance to the scaling group that you want to create, make sure that the CLB instance meets the following requirements:</p>
     * </blockquote>
     * </li>
     * <li>The CLB instance is in the Active state. You can call the <a href="https://help.aliyun.com/document_detail/2401696.html">DescribeLoadBalancers</a> operation to query the status of CLB instances.</li>
     * <li>Health check must be enabled on all listener ports configured for the CLB instance. Otherwise, the scaling group will fail to be created.
     * If you attach Application Load Balancer (ALB) or Network Load Balancer (NLB) server groups to the scaling group that you want to create, Auto Scaling adds the ECS instances in your scaling group to the ALB or NLB server groups to process the access requests forwarded by the corresponding ALB or NLB instances. You can attach multiple ALB or NLB server groups to a scaling group. Make sure that the ALB or NLB server groups belong to the same virtual private cloud (VPC). For more information, see <a href="https://help.aliyun.com/document_detail/266800.html">AttachAlbServerGroups</a> or <a href="https://help.aliyun.com/document_detail/600535.html">AttachServerGroups</a>.
     * If you attach an ApsaraDB RDS instance to the scaling group that you want to create, Auto Scaling automatically adds the private IP addresses of the ECS instances in your scaling group to the IP address whitelist of the ApsaraDB RDS instance. Before you attach an ApsaraDB RDS instance to your scaling group, make sure that the ApsaraDB RDS instance meets the following requirements:</li>
     * <li>The ApsaraDB RDS instance is in the Running state. You can call the <a href="https://help.aliyun.com/document_detail/610396.html">DescribeDBInstances</a> state to query the status of ApsaraDB RDS instances.</li>
     * <li>The number of IP addresses in the IP address whitelist of the ApsaraDB RDS instance does not reach its upper limit. For more information, see <a href="https://help.aliyun.com/document_detail/43185.html">Configure a whitelist</a>.
     * If you set MultiAZPolicy for the scaling group that you want to create to COST_OPTIMIZED, the following rules apply:</li>
     * <li>If you use OnDemandBaseCapacity, OnDemandPercentageAboveBaseCapacity, and SpotInstancePools to specify the instance allocation mode under the cost optimization policy, Auto Scaling prioritizes the implementation of the specified instance allocation mode during scale-out events.</li>
     * <li>If you do not specify OnDemandBaseCapacity, OnDemandPercentageAboveBaseCapacity, or SpotInstancePools, Auto Scaling preferentially creates instances of the lowest-priced instance type based on the cost optimization policy.
     * If you set <code>Tags.Propagate</code> to true, the following rules will apply:</li>
     * <li>Tags that you add to the scaling group cannot be propagated to existing instances in the scaling group. Tags that you add to the scaling group are propagated to only new instances.</li>
     * <li>If you specify instance tags in the scaling configuration that is used to create instances and propagate the tags that you add to the scaling group to the instances, all tags exist at the same time.</li>
     * <li>If the tag key that you specify in a scaling configuration and the tag key that you add to the scaling group of the scaling configuration are the same, the tag value that you specify in the scaling configuration is preferentially used.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateScalingGroup  CreateScalingGroupRequest
     * @return CreateScalingGroupResponse
     */
    CompletableFuture<CreateScalingGroupResponse> createScalingGroup(CreateScalingGroupRequest request);

    /**
     * <b>description</b> :
     * <p>A scaling rule defines the specific scaling action. For example, you can use a scaling rule to define N instances to add or remove. If the execution of a scaling rule causes the total number of Elastic Compute Service (ECS) instances or elastic container instances in the scaling group to drop below the value of MinSize or to exceed the value of MaxSize, Auto Scaling adjusts the number of instances to add or remove, which ensures that the total number of instances stays within the valid range. Take note that Auto Scaling does not adjust the number of instances that you defined in the scaling rule. Examples:</p>
     * <ul>
     * <li>The maximum number of instances (MaxSize) that can be contained in a scaling group is 3 and the current number of instances (Total Capacity) in the scaling group is 2. In this example, the Add3 scaling rule is created to add three ECS instances to the scaling group. However, after you execute Add3, Auto Scaling adds only one ECS instance to the scaling group. In addition, the number of ECS instances to add in the Add3 scaling rule remains unchanged.</li>
     * <li>The minimum number of instances (MinSize) that must be contained in a scaling group is 2 and the current number of instances (Total Capacity) is 3. In this example, the Remove5 scaling rule is created to remove five ECS instances from the scaling group. However, after you execute Remove5, Auto Scaling only removes one ECS instance from the scaling group. In addition, the number of ECS instances to remove in the Remove5 scaling rule remains unchanged.
     * Before you call this operation, take note of the following items:</li>
     * <li>If you set AdjustmentType to TotalCapacity, the total number of ECS instances or elastic container instances in your scaling group will be adjusted to a specified number when the scaling rule that you create by calling this operation is executed. You must set AdjustmentValue to an integer that is greater than 0.</li>
     * <li>If you set AdjustmentType to QuantityChangeInCapacity or PercentChangeInCapacity, a positive value of AdjustmentValue specifies that a specific number of ECS instances or elastic container instances will be added to your scaling group, and a negative value of AdjustmentValue specifies that a specific number of ECS instances or elastic container instances will be removed from the scaling group.</li>
     * <li>If you set AdjustmentType to PercentChangeInCapacity, Auto Scaling calculates the number of ECS instances or elastic container instances to add or remove by multiplying the current capacity of the scaling group (Total Capacity) by AdjustmentValue divided by 100, rounding off the result to determine the final adjustment count.</li>
     * <li>If you specify a cooldown period for a scaling rule, the cooldown period of the scaling rule takes effect after you execute the scaling rule. If you do not specify a cooldown period for a scaling rule, the value of DefaultCooldown of the scaling group takes effect after you execute the scaling rule.</li>
     * <li>You can create only a limited number of scaling rules for a scaling group. For more information, see <a href="https://help.aliyun.com/document_detail/25863.html">Limits</a>.</li>
     * <li>The following API operations may use the unique identifier of a scaling rule (ScalingRuleAri) that is returned after you call the CreateScalingRule operation:<ul>
     * <li>ExecuteScalingRule: You can call this operation to manually execute a scaling rule. In this operation, you can set ScalingRuleAri to the unique identifier of the scaling rule that you want to execute.</li>
     * <li>CreateScheduledTask: You can call this operation to create a scheduled task for a scaling rule. In this operation, you can set ScalingRuleAri to the unique identifier of the scaling rule for which you want to create a scheduled task.</li>
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
     * <p>  If the scaling rule of a scheduled task fails to be executed due to an ongoing scaling activity in the scaling group or because the scaling group is disabled, the scheduled task is automatically retried during the time window specified by <code>LaunchExpirationTime</code>. If the scheduled task still fails after the specified time window ends, the task is automatically skipped.</p>
     * <ul>
     * <li>If several scheduled tasks concurrently attempt to execute the same scaling rule within a scaling group, the following rules apply:<ul>
     * <li>Scaling groups with <strong>Expected Number of Instances</strong> configured: The scaling activities incurred by the scheduled tasks are parallel scaling activities. In a proximate time window, Auto Scaling can trigger several scheduled tasks and then execute multiple parallel scaling activities at the same time.</li>
     * <li>Scaling groups with <strong>Expected Number of Instances</strong> not configured: The scaling activity incurred by the earliest scheduled task is executed. Considering that a scaling group allows for no more than one ongoing scaling activity simultaneously, other scheduled tasks will spontaneously invoke retries within the time window specified by <code>LaunchExpirationTime</code>. Upon completion of the first scheduled task, any retries invoked by other tasks within the time window specified by <code>LaunchExpirationTime</code> lead to continuous enforcement of the scaling rule, with each iteration generating a distinct scaling activity.</li>
     * </ul>
     * </li>
     * <li>You can use one of the following methods to specify the scaling mode:<ul>
     * <li>ScheduledAction: Specify an existing scaling rule that you want Auto Scaling to execute when the scheduled task is triggered.</li>
     * <li>ScalingGroupId: Specify the minimum number, maximum number, or expected number of instances for the scaling group for which you create the scheduled task.
     * **
     * <strong>Note</strong> You cannot specify ScheduledAction and ScalingGroupId at the same time.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateScheduledTask  CreateScheduledTaskRequest
     * @return CreateScheduledTaskResponse
     */
    CompletableFuture<CreateScheduledTaskResponse> createScheduledTask(CreateScheduledTaskRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation to deactivate a scaling configuration only in a disabled scaling group.</p>
     * 
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
     * <p>You can use one of the following methods to query lifecycle hooks:</p>
     * <ul>
     * <li>Specify a list of lifecycle hook IDs by using the LifecycleHookIds parameter. In this case, you do not need to specify the ScalingGroupId and LifecycleHookName parameters.</li>
     * <li>Specify the scaling group ID by using the ScalingGroupId parameter.</li>
     * <li>Specify the scaling group ID by using the ScalingGroupId parameter and the lifecycle hook name by using the LifecycleHookName parameter at the same time.</li>
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
     * <p>  You can query all scaling activities in a scaling group by specifying ScalingGroupId.</p>
     * <ul>
     * <li>You can filter query results based on the status of scaling activities.</li>
     * <li>You can query scaling activities within the last 30 days.</li>
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
     * <b>description</b> :
     * <p>You can specify a scaling group ID to query all scaling rules in the scaling group. You can also specify the scaling rule ID, name, unique identifier, and type in the request parameters as filter conditions.</p>
     * 
     * @param request the request parameters of DescribeScalingRules  DescribeScalingRulesRequest
     * @return DescribeScalingRulesResponse
     */
    CompletableFuture<DescribeScalingRulesResponse> describeScalingRules(DescribeScalingRulesRequest request);

    /**
     * <b>description</b> :
     * <p>You can query scheduled tasks by scaling rule, task ID, or task name.</p>
     * 
     * @param request the request parameters of DescribeScheduledTasks  DescribeScheduledTasksRequest
     * @return DescribeScheduledTasksResponse
     */
    CompletableFuture<DescribeScheduledTasksResponse> describeScheduledTasks(DescribeScheduledTasksRequest request);

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
     * <p>  If you set the MetricType parameter to custom, you must report your custom metrics to CloudMonitor before you can create event-triggered tasks by using the custom metrics. For more information, see <a href="https://help.aliyun.com/document_detail/74861.html">Custom monitoring event-triggered tasks</a>.</p>
     * <ul>
     * <li>When you create an event-triggered task, you must specify the MetricName, DimensionKey, and DimensionValue parameters to determine the range of statistics that you want to aggregate for the metrics of the scaling group. For example, you can specify the user_id and scaling_group dimensions for an event-triggered task to aggregate monitoring data of all Elastic Compute Service (ECS) instances or elastic container instances in a scaling group within an Alibaba Cloud account.<ul>
     * <li>If you set the MetricType parameter to custom, the valid values are your custom metrics.</li>
     * <li>For information about the metrics that are supported if you set the MetricType parameter to system, see<a href="https://help.aliyun.com/document_detail/74854.html"> Event-triggered task for system monitoring</a>.<blockquote>
     * <p>The user_id and scaling_group dimensions are automatically populated. You need to only specify the device and state dimensions. For more information, see the <code>DimensionKey</code> and <code>DimensionValue</code> parameters in the &quot;Request parameters&quot; section of this topic.</p>
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
     * <p>  If you want to change the name of a scaling configuration in a scaling group, make sure that the new name is unique within the scaling group.</p>
     * <ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/459378.html">ModifyEciScalingConfiguration</a> operation to check the modification result.</li>
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
     * <p>You can use one of the following methods to locate the lifecycle hook that you want to modify:</p>
     * <ul>
     * <li>Specify LifecycleHookId. In this case, ScalingGroupId and LifecycleHookName are ignored.</li>
     * <li>Specify ScalingGroupId and LifecycleHookName. Each lifecycle hook within a scaling group has a unique name.</li>
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
     * <p>  If you want to change the name of a scaling configuration in a scaling group, make sure that the new name is unique within the scaling group.</p>
     * <ul>
     * <li>If you want to bind a primary elastic network interface (ENI) when you call this operation, you must use one of the following methods. If you use the following methods at the same time, the call fails and an error is reported. In addition, if you use one of the following methods to modify the ENI information when you call this operation, the ENI information configured by using the other method is cleared.<ul>
     * <li>You can specify SecurityGroupId, SecurityGroupIds, and Ipv6AddressCount to configure ENI-related information.</li>
     * <li>You can specify NetworkInterfaces to configure primary and secondary ENIs. You must use NetworkInterface to specify at least one primary ENI. If you set NetworkInterface.InstanceType to Primary, it specifies that a primary ENI is configured. If you set NetworkInterface.InstanceType to Secondary or leave it empty, it specifies that a secondary ENI is configured.</li>
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
     * <p>  You cannot modify the following parameters by calling this operation:
     *     *   RegionId
     *     *   LoadBalancerId
     *     **
     *     <strong>Note</strong> If you want to modify the load balancer settings of your scaling group, you can call the AttachLoadBalancers operation or the DetachLoadBalancers operation.
     *     *   DBInstanceId
     *     **
     *     <strong>Note</strong> If you want to modify the ApsaraDB RDS instance settings of your scaling group, you can call the AttachDBInstances operation or the DetachDBInstances operation.</p>
     * <ul>
     * <li>You can call this operation to modify a scaling group only when the scaling group is in the <code>Active</code> or <code>Inactive</code> state.</li>
     * <li>Enabling a new scaling configuration in the scaling group will not impact existing Elastic Compute Service (ECS) instances or elastic container instances that were provisioned based on the previous scaling configuration. These instances will continue to run as expected.</li>
     * <li>If the modification of the MaxSize setting leads to the total number of ECS instances or elastic container instances in the scaling group exceeding the new maximum limit, Auto Scaling proactively removes the surplus instances to restore the total number to match the new maximum limit.</li>
     * <li>If the modification of the MinSize setting leads to the total number of ECS instances or elastic container instances in the scaling group exceeding the new minimum threshold, Auto Scaling proactively adds more instances to the scaling group to ensure that the total number aligns with the new minimum threshold.</li>
     * <li>If the modification of the DesiredCapacity setting leads to the total number of ECS instances or elastic container instances in the scaling group not matching the new desired capacity, Auto Scaling proactively adjusts the total number of instances to ensure that the total number aligns with the new desired capacity.</li>
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
     * <p>You can use the following parameters to specify the scaling method of a scheduled task:</p>
     * <ul>
     * <li>If you use the <code>ScheduledAction</code> parameter, you must select an existing scaling rule for the scheduled task.</li>
     * <li>If you use the <code>ScalingGroupId</code> parameter, you must specify the minimum number, maximum number, or expected number of instances in the scheduled task.<blockquote>
     * <p>You cannot specify the <code>ScheduledAction</code> and <code>ScalingGroupId</code> parameters at the same time.</p>
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
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Auto Scaling creates new ECS instances to replace the existing ECS instances to fulfill the rebalancing purpose. Auto Scaling starts the new ECS instances before stopping the existing ECS instances. The rebalancing operation does not affect the performance or service availability of your application.</p>
     * <ul>
     * <li>This operation is supported by only multi-zone scaling groups whose <code>MultiAZPolicy</code> is set to <code>BALANCE</code>.</li>
     * <li>A rebalancing operation is required only when the distribution of the instances of a multi-zone scaling group is significantly unbalanced. In a rebalancing activity, Auto Scaling replaces up to 20 ECS instances to rectify the unbalanced distribution.</li>
     * <li>During the execution of a rebalancing operation, if the number of instances in the scaling group approaches or hits the value of MaxSize but the rebalancing operation needs to continue, Auto Scaling allows the total number of ECS instances to momentarily exceed the value of MaxSize by 10%. This temporary surplus condition persists for a duration until equilibrium in the distribution of ECS instances is achieved. Typically, it takes 1 to 6 minutes.
     * **
     * <strong>Note</strong> If the 10% increment of the maximum number of instances in a scaling group yield a non-integer value, the decimal portion is always rounded up to ensure an additional instance is accounted for. For example, you have a scaling group that holds a maximum of 15 ECS instances. During a rebalancing operation, Auto Scaling would permit the total number of instances to momentarily surpass this limit by 2, instead of the calculated 10% (which is 1.5).</li>
     * </ul>
     * 
     * @param request the request parameters of RebalanceInstances  RebalanceInstancesRequest
     * @return RebalanceInstancesResponse
     */
    CompletableFuture<RebalanceInstancesResponse> rebalanceInstances(RebalanceInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation only when the desired ECS instance enters a Pending state.\
     * An ECS instance can stay in a Pending state for up to six hours. Each time an ECS instance enters a Pending state, you can extend the time window during which the ECS instance stays in a Pending state up to 20 times.</p>
     * 
     * @param request the request parameters of RecordLifecycleActionHeartbeat  RecordLifecycleActionHeartbeatRequest
     * @return RecordLifecycleActionHeartbeatResponse
     */
    CompletableFuture<RecordLifecycleActionHeartbeatResponse> recordLifecycleActionHeartbeat(RecordLifecycleActionHeartbeatRequest request);

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that the following requirements are met:
     *     *   The scaling group is in the Active state.
     *     *   No scaling activity is in progress within the scaling group.</p>
     * <blockquote>
     * <p>If no scaling activity is in progress within the scaling group, you can call the operation even within the cooldown period.</p>
     * </blockquote>
     * <ul>
     * <li>If an ECS instance is automatically created by Auto Scaling, or if an ECS instance is manually added to a scaling group and managed by the scaling group, the ECS instance is stopped in economical mode or is released after the instance is removed from the scaling group.</li>
     * <li>If an ECS instance is manually added to a scaling group and is not managed by the scaling group, the ECS instance is not stopped or released after the instance is removed from the scaling group.</li>
     * <li>If the difference between the number of existing ECS instances specified by the TotalCapacity parameter and the number of ECS instances that you call this operation to remove is less than the value of the MinSize parameter, the call fails.
     * A successful call only means that Auto Scaling accepts the request. The scaling activity may still fail. You can obtain the status of a scaling activity based on the value of the ScalingActivityId parameter in the response.</li>
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
     * @param request the request parameters of RollbackInstanceRefresh  RollbackInstanceRefreshRequest
     * @return RollbackInstanceRefreshResponse
     */
    CompletableFuture<RollbackInstanceRefreshResponse> rollbackInstanceRefresh(RollbackInstanceRefreshRequest request);

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, take note of the following items:
     *     *   The scaling group is in the Active state.
     *     *   The scaling group has no ongoing scaling activities.</p>
     * <ul>
     * <li>If no scaling activities in the scaling group are in progress, the operation can trigger scaling activities before the cooldown period of the scaling group expires.</li>
     * <li>If the addition of a specific number of Elastic Compute Service (ECS) instances to the scaling group causes the total number of ECS instances in the scaling group to exceed the maximum allowed number, Auto Scaling adds ECS instances to the scaling group until the total number of instances is equal to the maximum allowed number.</li>
     * <li>If the removal of a specific number of ECS instances from the scaling group causes the total number of ECS instances in the scaling group to be less than the minimum allowed number, Auto Scaling removes ECS instances from the scaling group until the total number of instances is equal to the minimum allowed number.
     * A successful call indicates that Auto Scaling accepts the request. However, the scaling activity may still fail. You can obtain the status of a scaling activity based on the value of <code>ScalingActivityId</code> in the response.</li>
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
     * <p>Auto Scaling detects and removes unhealthy ECS instances or elastic container instances from the corresponding scaling groups. If you want to retain a specific instance in the corresponding scaling group, you can put the instance into the Standby or Protected state. For more information, see <a href="~~EnterStandby~~">EnterStandby</a> and <a href="~~SetInstancesProtection~~">SetInstancesProtection</a>.</p>
     * 
     * @param request the request parameters of SetInstanceHealth  SetInstanceHealthRequest
     * @return SetInstanceHealthResponse
     */
    CompletableFuture<SetInstanceHealthResponse> setInstanceHealth(SetInstanceHealthRequest request);

    /**
     * <b>description</b> :
     * <p>Once ECS instances enter the Protected state, they become subject to the following restrictions:</p>
     * <ul>
     * <li>ECS instances will persist in the Protected state, unless you deliberately remove them from this state.</li>
     * <li>Even in scenarios where automatic scale-in actions are initiated due to fluctuations in the number of ECS instances or the execution of event-triggered tasks, Auto Scaling does not remove ECS instances that are in the Protected state from their respective scaling groups. Only after being manually removed from their respective scaling groups can ECS instances that are in the Protected state be released. For more information, see <a href="https://help.aliyun.com/document_detail/459393.html">Remove an ECS instance</a>.</li>
     * <li>ECS instances in the Protected state maintain their health status even when they undergo stopping or restarting processes.</li>
     * </ul>
     * 
     * @param request the request parameters of SetInstancesProtection  SetInstancesProtectionRequest
     * @return SetInstancesProtectionResponse
     */
    CompletableFuture<SetInstancesProtectionResponse> setInstancesProtection(SetInstancesProtectionRequest request);

    /**
     * <b>description</b> :
     * <p>  Only one instance refresh task can be executed at a time in a scaling group.</p>
     * <ul>
     * <li>Instance refresh tasks are currently supported only by scaling groups of the Elastic Compute Service (ECS) type and using <strong>the priority policy</strong>. Scaling groups that use the number of vCPUs as the method to calculate the group capacity or scaling groups whose instance reclaim mode is <strong>Economical Mode</strong> or <strong>Forcibly Recycle</strong> do not support instance refresh tasks.</li>
     * <li>During the execution of an instance refresh task, scaling events can be complete as expected. Take note that instances that are scaled out use the desired configurations provided by the instance refresh task.</li>
     * <li>Instance refresh tasks does not take effect on instances that are manually added and instances that are in the Standby and Protected states.</li>
     * </ul>
     * 
     * @param request the request parameters of StartInstanceRefresh  StartInstanceRefreshRequest
     * @return StartInstanceRefreshResponse
     */
    CompletableFuture<StartInstanceRefreshResponse> startInstanceRefresh(StartInstanceRefreshRequest request);

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
