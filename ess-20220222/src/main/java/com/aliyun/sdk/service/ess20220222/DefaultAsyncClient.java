// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.ess20220222.models.*;
import darabonba.core.utils.*;
import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;

import java.util.concurrent.CompletableFuture;


/**
 * <p>Main client.</p>
 */
public final class DefaultAsyncClient implements AsyncClient {

    protected final String product;
    protected final String version;
    protected final String endpointRule;
    protected final java.util.Map<String, String> endpointMap;
    protected final TeaRequest REQUEST;
    protected final TeaAsyncHandler handler;

    protected DefaultAsyncClient(ClientConfiguration configuration) {
        this.handler = new TeaAsyncHandler(configuration);
        this.product = "Ess";
        this.version = "2022-02-22";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("cn-qingdao", "ess.aliyuncs.com"),
            new TeaPair("cn-beijing", "ess.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "ess.aliyuncs.com"),
            new TeaPair("cn-shanghai", "ess.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "ess.aliyuncs.com"),
            new TeaPair("cn-hongkong", "ess.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "ess.aliyuncs.com"),
            new TeaPair("us-east-1", "ess.aliyuncs.com"),
            new TeaPair("us-west-1", "ess.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "ess.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "ess.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "ess.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "ess.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "ess.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "ess.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "ess.aliyuncs.com"),
            new TeaPair("cn-edge-1", "ess.aliyuncs.com"),
            new TeaPair("cn-fujian", "ess.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "ess.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "ess.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "ess.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "ess.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "ess.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "ess.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "ess.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "ess.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "ess.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "ess.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "ess.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "ess.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "ess.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "ess.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "ess.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "ess.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "ess.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "ess.aliyuncs.com"),
            new TeaPair("cn-wuhan", "ess.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "ess.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "ess.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "ess.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "ess.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "ess.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "ess.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "ess.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    @Override
    public CompletableFuture<ApplyScalingGroupResponse> applyScalingGroup(ApplyScalingGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ApplyScalingGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ApplyScalingGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ApplyScalingGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Before you associate an ALB server group with a scaling group, make sure that the following requirements are met:
      * *   The scaling group resides in a virtual private cloud (VPC). The scaling group and the ALB server group must reside in the same VPC.
      * *   The ALB server group is in the Available state.
      * *   You can associate only a limited number of ALB server groups with a scaling group. To view the quota or manually request a quota increase, go to [Quota Center](https://quotas.console.aliyun.com/products/ess/quotas).
      *
     */
    @Override
    public CompletableFuture<AttachAlbServerGroupsResponse> attachAlbServerGroups(AttachAlbServerGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachAlbServerGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachAlbServerGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachAlbServerGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Before you associate an ApsaraDB RDS instance with a scaling group, make sure that the ApsaraDB RDS instance meets the following requirements:
      * *   The ApsaraDB RDS instance and the scaling group must belong to the same Alibaba Cloud account.
      * *   The ApsaraDB RDS instance must be unlocked. For more information about the lock policy, see [ApsaraDB RDS usage notes](~~41872~~).
      * *   The ApsaraDB RDS instance must be in the Running state.
      * After an ApsaraDB RDS instance is associated with the scaling group, the default IP address whitelist of the ApsaraDB RDS instance can contain no more than 1,000 IP addresses. For more information, see [Set the whitelist](~~43185~~).
      *
     */
    @Override
    public CompletableFuture<AttachDBInstancesResponse> attachDBInstances(AttachDBInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachDBInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachDBInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachDBInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<AttachInstancesResponse> attachInstances(AttachInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Before you call this operation to attach a CLB instance to your scaling group, take note of the following items:
      * *   The CLB instance and the scaling group must belong to the same Alibaba Cloud account.
      * *   The CLB instance and the scaling group must reside in the same region.
      * *   The CLB instance must be in the Running state.
      * *   The CLB instance must be configured with at least one listener. Health check is enabled for the CLB instance.
      * *   The CLB instance and the scaling group must be in the same virtual private cloud (VPC) if their network type is VPC.
      * *   If the network type of the scaling group is VPC, the network type of the CLB instance is classic network, and the CLB backend server groups contain instances of the VPC network type, the instances and the scaling group must be in the same VPC.
      * *   You can attach only a limited number of CLB instances to a scaling group. Fore more information, see [Limits](~~25863~~).
      *
     */
    @Override
    public CompletableFuture<AttachLoadBalancersResponse> attachLoadBalancers(AttachLoadBalancersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachLoadBalancers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachLoadBalancersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachLoadBalancersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<AttachServerGroupsResponse> attachServerGroups(AttachServerGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachServerGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachServerGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachServerGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Before you call this operation to attach a vServer group to your scaling group, take note of the following items:
      * *   The CLB instance and the scaling group must belong to the same Alibaba Cloud account.
      * *   The CLB instance and the scaling group must reside in the same region.
      * *   The CLB instance must be in the Running state.
      * *   The CLB instance must be configured with at least one listener. Health check is enabled for the CLB instance.
      * *   The CLB instance and the scaling group must be in the same VPC if their network type is VPC.
      * *   If the network type of the scaling group is VPC, the network type of the CLB instance is classic network, and the vServer groups of the CLB instance contain instances of the VPC network type, the instances and the scaling group must be in the same VPC.
      * *   The vServer group that you want to attach to your scaling group must belong to the CLB instance.
      * *   You can attach only a limited number of vServer groups to a scaling group. For information about the quota on vServer groups, see [Limits](~~25863~~).
      * When you call this operation, you must specify the following parameters:
      * *   LoadBalancerId: the ID of the CLB instance.
      * *   VServerGroupId: the ID of the vServer group.
      * *   Port: the port number of the vServer group.
      * If a vServer group is attached to a scaling group by using different ports, Auto Scaling considers that more than one vServer group is attached to the scaling group. If multiple vServer groups with the same group ID and port number are specified in the request parameters, only the first vServer group is used. The other vServer groups are ignored.
      *
     */
    @Override
    public CompletableFuture<AttachVServerGroupsResponse> attachVServerGroups(AttachVServerGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachVServerGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachVServerGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachVServerGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChangeResourceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChangeResourceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChangeResourceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * If you set the LifecycleActionResult parameter for a lifecycle hook of a scaling group to CONTINUE in the operation, Auto Scaling continues to complete the scaling activity in the scaling group after the lifecycle hook times out. If you set the LifecycleActionResult parameter to ABANDON, Auto Scaling stops the scaling activity in the scaling group after the lifecycle hook times out.
      *
     */
    @Override
    public CompletableFuture<CompleteLifecycleActionResponse> completeLifecycleAction(CompleteLifecycleActionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CompleteLifecycleAction").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CompleteLifecycleActionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CompleteLifecycleActionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateAlarmResponse> createAlarm(CreateAlarmRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAlarm").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAlarmResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAlarmResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * A scaling configuration is a template that is used to create elastic container instances during scale-out activities.
      * You can specify the Cpu and Memory parameters to determine the range of instance types. If you specify the parameters, Auto Scaling determines the available instance types based on factors such as I/O optimization requirements and zones. Auto Scaling preferentially creates elastic container instances of the instance type that is provided at the lowest price. This scaling mode is available only if Scaling Policy is set to Cost Optimization Policy and no instance type is specified in the scaling configuration.
      *
     */
    @Override
    public CompletableFuture<CreateEciScalingConfigurationResponse> createEciScalingConfiguration(CreateEciScalingConfigurationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateEciScalingConfiguration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateEciScalingConfigurationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateEciScalingConfigurationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can create up to six lifecycle hooks for each scaling group. Elastic Compute Service (ECS) instances are not immediately added to or removed from scaling groups that have effective lifecycle hooks during scaling activities. The ECS instances are added to or removed from the scaling groups only after the lifecycle hooks time out. The period of time before the lifecycle hooks time out is specified by the HeartbeatTimeout parameter. Before lifecycle hooks time out, you can initialize the configurations of ECS instances and query data on the ECS instances.
      * If lifecycle hooks take effect for scale-out activities, the private IP addresses of ECS instances are added to the IP address whitelists of the associated ApsaraDB RDS instances and the ECS instances are added to the backend server groups of the associated Server Load Balancer (SLB) instances only after the lifecycle hooks time out. If lifecycle hooks take effect for scale-in activities, the private IP addresses of ECS instances are removed from the IP address whitelists of the disassociated ApsaraDB RDS instances and the ECS instances are removed from the backend server groups of the disassociated SLB instances only after the lifecycle hooks time out.
      * You can configure a notification method for a lifecycle hook. When the lifecycle hook takes effect, a notification can be sent by using a Message Service (MNS) topic, an MNS queue, or an Operation Orchestration Service (OOS) template. If you want to configure an OOS template, you must create a RAM role for OOS. For more information, see [Grant RAM permissions to OOS](~~120810~~).
      * > If your scaling group contains ECS instances and you configure an OOS template to add the private IP addresses of the ECS instances to or remove the private IP addresses of the ECS instances from the IP address whitelists of cloud databases other than ApsaraDB RDS databases, you must manually add the private IP addresses of the ECS instances to the IP address whitelists of the cloud databases.
      *
     */
    @Override
    public CompletableFuture<CreateLifecycleHookResponse> createLifecycleHook(CreateLifecycleHookRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateLifecycleHook").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLifecycleHookResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLifecycleHookResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * You can configure CloudMonitor system events, Message Service (MNS) queues, or MNS topics to receive notifications. When a specified type of scaling activity or resource change occurs in a scaling group, Auto Scaling sends notifications by using CloudMonitor or MNS.
      *
     */
    @Override
    public CompletableFuture<CreateNotificationConfigurationResponse> createNotificationConfiguration(CreateNotificationConfigurationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateNotificationConfiguration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateNotificationConfigurationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateNotificationConfigurationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CreateScalingConfigurationResponse> createScalingConfiguration(CreateScalingConfigurationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateScalingConfiguration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateScalingConfigurationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateScalingConfigurationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CreateScalingGroupResponse> createScalingGroup(CreateScalingGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateScalingGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateScalingGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateScalingGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * A scaling rule defines a specific scaling activity, such as adding or removing N instances. If the number of Elastic Compute Service (ECS) instances in a scaling group is less than the minimum number allowed or greater than the maximum number allowed after a scaling rule is executed, Auto Scaling adjusts the number of ECS instances that you want to add or remove. This way, the number of ECS instances can be maintained within the valid range after the scaling rule is executed. The number of ECS instances that is specified in the scaling rule remains unchanged. Example:
      * *   If your scaling group contains two ECS instances and allows up to three ECS instances, only one ECS instance is added to your scaling group after you execute a scale-out rule in which three ECS instances are specified. The number of ECS instances that is specified in the scaling rule remains unchanged.
      * *   If your scaling group contains three ECS instances and requires at least two ECS instances, only one ECS instance is removed from your scaling group after you execute a scale-in rule in which five ECS instances are specified. The number of ECS instances that is specified in the scaling rule remains unchanged.
      * Before you call this operation, take note of the following items:
      * *   If you set the AdjustmentType parameter to TotalCapacity, the number of ECS instances in the scaling group is adjusted to the specified value. The value of the AdjustmentValue parameter must be greater than or equal to 0.
      * *   If you set the AdjustmentType parameter to QuantityChangeInCapacity or PercentChangeInCapacity, a positive value of AdjustmentValue specifies the number of ECS instances that are added to the scaling group, and a negative value of AdjustmentValue specifies the number of ECS instances that are removed from the scaling group.
      * *   If you set the AdjustmentType parameter to PercentChangeInCapacity, Auto Scaling uses the following formula to calculate a value, and then rounds the value to the nearest integer to obtain the number of ECS instances that need to be scaled: Value of TotalCapacity × Value of AdjustmentValue/100.
      * *   If the cooldown time is specified in a scaling rule, the specified time applies to the scaling group after the rule is executed. Otherwise, the value of the DefaultCooldown parameter of the scaling group applies to the scaling group.
      * *   You can create only a limited number of scaling rules for a scaling group. For more information, see the "Limits" topic.
      * *   The unique identifier (ScalingRuleAri) of a scaling rule can be used by the following operations:
      *     *   ExecuteScalingRule: You can call this operation to manually execute a specific scaling rule by setting the ScalingRuleAri parameter to the unique identifier of the scaling rule.
      *     *   CreateScheduledTask: You can call this operation to create a scheduled task for a specific scaling rule by setting the ScheduledAction parameter to the unique identifier of the scaling rule.
      *
     */
    @Override
    public CompletableFuture<CreateScalingRuleResponse> createScalingRule(CreateScalingRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateScalingRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateScalingRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateScalingRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   If a scheduled task fails to trigger a scaling activity due to an ongoing scaling activity in a scaling group or because the scaling group is disabled, the scheduled task is automatically retried during the period that is specified by the LaunchExpirationTime parameter. If the scheduled task still fails to trigger a scaling activity after the period ends, the task is automatically skipped.
      * *   If multiple tasks are scheduled at similar points in time to trigger scaling activities in the same scaling group, the earliest task triggers the scaling activity first. Other tasks trigger scaling activities within their launch expiration time. Only one scaling activity can be triggered in a scaling group at a time.`` If the previous scaling activity is complete and another scheduled task attempts to trigger a scaling activity, Auto Scaling executes the scaling rule that is specified in the scheduled task and then triggers a scaling activity.``
      * *   A scheduled task supports the following scaling methods:
      *     *   `ScheduledAction`: Specify an existing scaling rule that you want Auto Scaling to execute when the scheduled task is triggered.
      *     *   `ScalingGroupId`: Specify the minimum number, maximum number, or expected number of instances for the scaling group for which you created the scheduled task.
      * > You cannot specify the `ScheduledAction` and ScalingGroupId parameters at the same time.
      *
     */
    @Override
    public CompletableFuture<CreateScheduledTaskResponse> createScheduledTask(CreateScheduledTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateScheduledTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateScheduledTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateScheduledTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeactivateScalingConfigurationResponse> deactivateScalingConfiguration(DeactivateScalingConfigurationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeactivateScalingConfiguration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeactivateScalingConfigurationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeactivateScalingConfigurationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteAlarmResponse> deleteAlarm(DeleteAlarmRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAlarm").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAlarmResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAlarmResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You cannot delete a scaling configuration that is used to create elastic container instances in the following scenarios:
      * *   The scaling configuration is in the Active state.
      * *   The scaling group contains elastic container instances that are created based on the scaling configuration.
      *
     */
    @Override
    public CompletableFuture<DeleteEciScalingConfigurationResponse> deleteEciScalingConfiguration(DeleteEciScalingConfigurationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteEciScalingConfiguration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteEciScalingConfigurationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteEciScalingConfigurationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteLifecycleHookResponse> deleteLifecycleHook(DeleteLifecycleHookRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLifecycleHook").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLifecycleHookResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLifecycleHookResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteNotificationConfigurationResponse> deleteNotificationConfiguration(DeleteNotificationConfigurationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteNotificationConfiguration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteNotificationConfigurationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteNotificationConfigurationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You cannot delete a scaling configuration in one of the following scenarios:
      * *   The scaling configuration in your scaling group is in the Active state.
      * *   The scaling group contains ECS instances that were created based on the scaling configuration.
      *
     */
    @Override
    public CompletableFuture<DeleteScalingConfigurationResponse> deleteScalingConfiguration(DeleteScalingConfigurationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteScalingConfiguration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteScalingConfigurationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteScalingConfigurationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteScalingGroupResponse> deleteScalingGroup(DeleteScalingGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteScalingGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteScalingGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteScalingGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteScalingRuleResponse> deleteScalingRule(DeleteScalingRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteScalingRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteScalingRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteScalingRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteScheduledTaskResponse> deleteScheduledTask(DeleteScheduledTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteScheduledTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteScheduledTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteScheduledTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeAlarmsResponse> describeAlarms(DescribeAlarmsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAlarms").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAlarmsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAlarmsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeEciScalingConfigurationsResponse> describeEciScalingConfigurations(DescribeEciScalingConfigurationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeEciScalingConfigurations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeEciScalingConfigurationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeEciScalingConfigurationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * If a scaling activity is executed and a lifecycle hook is created for the scaling activity, the lifecycle hook triggers a lifecycle action. A lifecycle action can be in one of the following states:
      * *   If a lifecycle action is in the Pending state, Elastic Compute Service (ECS) instances are waiting to be added to a scaling group or waiting to be removed from a scaling group.
      * *   If a lifecycle action is in the Timeout state, the lifecycle hook that triggers the lifecycle action expires and ECS instances are added to or removed from a scaling group.
      * *   If a lifecycle action is in the Completed state, you manually end the lifecycle hook that triggers the lifecycle action ahead of schedule.
      * If you do not specify the action to perform, such as execute a specific OOS template, after a lifecycle hook ends, you can call this operation to obtain the token of the lifecycle action that corresponds to the lifecycle hook. Then, you can specify a custom action to perform after the lifecycle hook ends.
      *
     */
    @Override
    public CompletableFuture<DescribeLifecycleActionsResponse> describeLifecycleActions(DescribeLifecycleActionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLifecycleActions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLifecycleActionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLifecycleActionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeLifecycleHooksResponse> describeLifecycleHooks(DescribeLifecycleHooksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLifecycleHooks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLifecycleHooksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLifecycleHooksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeLimitationResponse> describeLimitation(DescribeLimitationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLimitation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLimitationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLimitationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeNotificationConfigurationsResponse> describeNotificationConfigurations(DescribeNotificationConfigurationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeNotificationConfigurations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeNotificationConfigurationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeNotificationConfigurationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeNotificationTypesResponse> describeNotificationTypes(DescribeNotificationTypesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeNotificationTypes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeNotificationTypesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeNotificationTypesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRegions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRegionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRegionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can specify a scaling group ID to query all scaling activities in the scaling group.
      * You can filter query results based on the status of scaling activities.
      * You can query scaling activities that are executed in the previous 30 days.
      *
     */
    @Override
    public CompletableFuture<DescribeScalingActivitiesResponse> describeScalingActivities(DescribeScalingActivitiesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeScalingActivities").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeScalingActivitiesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeScalingActivitiesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeScalingActivityDetailResponse> describeScalingActivityDetail(DescribeScalingActivityDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeScalingActivityDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeScalingActivityDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeScalingActivityDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeScalingConfigurationsResponse> describeScalingConfigurations(DescribeScalingConfigurationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeScalingConfigurations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeScalingConfigurationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeScalingConfigurationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeScalingGroupsResponse> describeScalingGroups(DescribeScalingGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeScalingGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeScalingGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeScalingGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeScalingInstancesResponse> describeScalingInstances(DescribeScalingInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeScalingInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeScalingInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeScalingInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can specify a scaling group ID to query all scaling rules in the scaling group. You can also specify the scaling rule ID, name, unique identifier, and type in the request parameters as filter conditions.
      *
     */
    @Override
    public CompletableFuture<DescribeScalingRulesResponse> describeScalingRules(DescribeScalingRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeScalingRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeScalingRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeScalingRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeScheduledTasksResponse> describeScheduledTasks(DescribeScheduledTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeScheduledTasks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeScheduledTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeScheduledTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DetachAlbServerGroupsResponse> detachAlbServerGroups(DetachAlbServerGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachAlbServerGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetachAlbServerGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetachAlbServerGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DetachDBInstancesResponse> detachDBInstances(DetachDBInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachDBInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetachDBInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetachDBInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * After ECS instances or elastic container instances are removed from a scaling group, you can call the AttachInstances operation to add the ECS instances or elastic container instances that are removed from the scaling group to other scaling groups.
      * After you remove an ECS instance or elastic container instance by calling the DetachInstances operation, the instance is not stopped or released.
      * Before you call this operation, make sure that the following conditions are met:
      * *   The specified scaling group is enabled.
      * *   No scaling activities in the specified scaling group are in progress.
      * > If no scaling activities in the specified scaling group are in progress, the operation can trigger scaling activities even before the cooldown time expires.
      * A successful call indicates only that Auto Scaling accepts the request. However, the scaling activity may still fail. You can obtain the status of a scaling activity based on the value of the ScalingActivityId parameter in the response.
      * The number of ECS instances or elastic container instances in a scaling group after you remove a specific number of instances from the scaling group must be equal to or greater than the value of the MinSize parameter. Otherwise, an error is reported when you call the DetachInstances operation.
      *
     */
    @Override
    public CompletableFuture<DetachInstancesResponse> detachInstances(DetachInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetachInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetachInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DetachLoadBalancersResponse> detachLoadBalancers(DetachLoadBalancersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachLoadBalancers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetachLoadBalancersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetachLoadBalancersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DetachServerGroupsResponse> detachServerGroups(DetachServerGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachServerGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetachServerGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetachServerGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can use the following parameters to specify the vServer groups that you want to detach from your scaling group.
      * *   LoadBalancerId: the ID of the Classic Load Balancer (CLB) instance.
      * *   VServerGroupId: the ID of the vServer group.
      * *   Port: the port number of the vServer group.
      * If the vServer group that is specified in this call matches the vServer group associated with your scaling group, the vServer group can be detached. Otherwise, the request for detaching the vServer group is ignored, and no error is reported.
      *
     */
    @Override
    public CompletableFuture<DetachVServerGroupsResponse> detachVServerGroups(DetachVServerGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachVServerGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetachVServerGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetachVServerGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DisableAlarmResponse> disableAlarm(DisableAlarmRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableAlarm").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableAlarmResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableAlarmResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DisableScalingGroupResponse> disableScalingGroup(DisableScalingGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableScalingGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableScalingGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableScalingGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<EnableAlarmResponse> enableAlarm(EnableAlarmRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableAlarm").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableAlarmResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableAlarmResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can call this operation to enable a scaling group that is in the Inactive state and has an instance configuration source. The instance configuration source can be a scaling configuration, a launch template, or an Elastic Compute Service (ECS) instance that you specified when you created the scaling group. If a scaling group is not in the Inactive state or does not have an active instance configuration source, you cannot call this operation to enable the scaling group.
      * > A scaling group can have only one active instance configuration source. When you call this operation to enable a scaling group, you can specify a scaling configuration or a launch template for the scaling group. If an instance configuration source has been configured for the scaling group before you call this operation, the scaling configuration or launch template that you specify in the request overwrites the original scaling configuration or launch template.
      * If you specify a value for the InstanceIds parameter when you call the operation, Auto Scaling checks whether the total number of ECS instances is within the range allowed in the scaling group after you call the operation.
      * *   If the total number of ECS instances is less than the minimum number of instances required in the scaling group after you call the operation, Auto Scaling automatically creates the required number of pay-as-you-go ECS instances and adds the instances to the scaling group to reach the minimum number. For example, if the minimum number of instances required in your scaling group is five, and you specify the InstanceIds parameter to add two ECS instances to the scaling group, Auto Scaling automatically creates three instances in the scaling group after the two instances are added.
      * *   If the value of the TotalCapacity parameter is greater than the value of the MaxSize parameter, the call fails.
      *
     */
    @Override
    public CompletableFuture<EnableScalingGroupResponse> enableScalingGroup(EnableScalingGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableScalingGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableScalingGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableScalingGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<EnterStandbyResponse> enterStandby(EnterStandbyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnterStandby").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnterStandbyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnterStandbyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ExecuteScalingRuleResponse> executeScalingRule(ExecuteScalingRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ExecuteScalingRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExecuteScalingRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExecuteScalingRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ExitStandbyResponse> exitStandby(ExitStandbyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ExitStandby").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExitStandbyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExitStandbyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListTagKeysResponse> listTagKeys(ListTagKeysRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTagKeys").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTagKeysResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTagKeysResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListTagValuesResponse> listTagValues(ListTagValuesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTagValues").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTagValuesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTagValuesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   If you set MetricType to custom, you must report your custom metrics to CloudMonitor before you can create event-triggered tasks by using the custom metrics. For more information, see [Custom monitoring event-triggered tasks](~~74861~~).
      * *   When you create an event-triggered task, you must specify MetricName, DimensionKey, and DimensionValue to determine the range of statistics that you want to aggregate for the metrics of the scaling group. For example, you can specify the user_id and scaling_group dimensions for an event-triggered task to aggregate monitoring data of all Elastic Compute Service (ECS) instances in a scaling group within an Alibaba Cloud account.
      *     *   If you set MetricType to custom, the valid values are your custom metrics.
      *     *   For information about the metrics that are supported if you set MetricType to system, see [Event-triggered task for system monitoring](~~74854~~).
      * > The user_id and scaling_group dimensions are automatically populated. You need to only specify the device and state dimensions. For more information, see `DimensionKey` and `DimensionValue` in the "Request parameters" section of this topic.
      *
     */
    @Override
    public CompletableFuture<ModifyAlarmResponse> modifyAlarm(ModifyAlarmRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyAlarm").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyAlarmResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyAlarmResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * If you want to change the name of a scaling configuration in a scaling group, make sure that the new name is unique within the scaling group.
      *
     */
    @Override
    public CompletableFuture<ModifyEciScalingConfigurationResponse> modifyEciScalingConfiguration(ModifyEciScalingConfigurationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyEciScalingConfiguration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyEciScalingConfigurationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyEciScalingConfigurationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can use one of the following methods to specify the lifecycle hook that you want to modify:
      * *   Specify the lifecycle hook ID by using the LifecycleHookId parameter. When you use this method, the ScalingGroupId and LifecycleHookName parameters are ignored.
      * *   Specify the scaling group ID by using the ScalingGroupId parameter and specify the lifecycle hook name by using the LifecycleHookName parameter.
      *
     */
    @Override
    public CompletableFuture<ModifyLifecycleHookResponse> modifyLifecycleHook(ModifyLifecycleHookRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyLifecycleHook").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyLifecycleHookResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyLifecycleHookResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyNotificationConfigurationResponse> modifyNotificationConfiguration(ModifyNotificationConfigurationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyNotificationConfiguration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyNotificationConfigurationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyNotificationConfigurationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can change the name of a scaling configuration in a scaling group. The name must be unique within the scaling group.
      *
     */
    @Override
    public CompletableFuture<ModifyScalingConfigurationResponse> modifyScalingConfiguration(ModifyScalingConfigurationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyScalingConfiguration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyScalingConfigurationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyScalingConfigurationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   You cannot call this operation to modify the settings of the following parameters:
      *     *   RegionId
      *     *   LoadBalancerId
      * > If you want to change the CLB instances that are associated with your scaling group, call the AttachLoadBalancers and DetachLoadBalancers operations.
      *     *   DBInstanceId
      *     **
      *     **Note**If you want to change the ApsaraDB RDS instances that are associated with your scaling group, call the AttachDBInstances and DetachDBInstances operations.
      * *   You can modify only scaling groups that are in the Active or Inactive state.
      * *   If you enable a new scaling configuration, Elastic Compute Service (ECS) instances that are created based on the previous scaling configuration still run as expected in the scaling group.
      * *   If the total number of instances in the scaling group is greater than the allowed maximum number after you change the value of the MaxSize parameter, Auto Scaling automatically removes instances from the scaling group to ensure that the number of instances is within the new range.
      * *   If the total number of instances in the scaling group is less than the allowed minimum number after you change the value of the MinSize parameter, Auto Scaling automatically adds instances to the scaling group to ensure that the number of instances is within the new range.
      * *   If the total number of instances in the scaling group does not match the expected number of instances after you change the value of the DesiredCapacity parameter, Auto Scaling automatically adds instances to or removes instances from the scaling group to ensure that the number of instances matches the value of the DesiredCapacity parameter.
      *
     */
    @Override
    public CompletableFuture<ModifyScalingGroupResponse> modifyScalingGroup(ModifyScalingGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyScalingGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyScalingGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyScalingGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyScalingRuleResponse> modifyScalingRule(ModifyScalingRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyScalingRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyScalingRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyScalingRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can use the following parameters to specify the scaling method of a scheduled task:
      * *   If you use the `ScheduledAction` parameter, you must select an existing scaling rule for the scheduled task.
      * *   If you use the `ScalingGroupId` parameter, you must specify the minimum number, maximum number, or expected number of instances in the scheduled task.
      * > You cannot specify the `ScheduledAction` and `ScalingGroupId` parameters at the same time.
      *
     */
    @Override
    public CompletableFuture<ModifyScheduledTaskResponse> modifyScheduledTask(ModifyScheduledTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyScheduledTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyScheduledTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyScheduledTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<RebalanceInstancesResponse> rebalanceInstances(RebalanceInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RebalanceInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RebalanceInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RebalanceInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can call this operation to prolong the length of a lifecycle hook up to 20 times. Take note that the total length of a lifecycle hook cannot exceed 6 hours.
      *
     */
    @Override
    public CompletableFuture<RecordLifecycleActionHeartbeatResponse> recordLifecycleActionHeartbeat(RecordLifecycleActionHeartbeatRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecordLifecycleActionHeartbeat").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecordLifecycleActionHeartbeatResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecordLifecycleActionHeartbeatResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<RemoveInstancesResponse> removeInstances(RemoveInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ResumeProcessesResponse> resumeProcesses(ResumeProcessesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResumeProcesses").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResumeProcessesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResumeProcessesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Compared with the ExecuteScalingRule operation, the ScaleWithAdjustment operation does not require a scaling rule to be created in advance. Before you call the ScaleWithAdjustment operation, take note of the following items:
      * *   The following conditions must be met:
      *     *   The scaling group is in the Active state.
      *     *   No scaling activities in the scaling group are in progress.
      * *   If no scaling activities in the scaling group are in progress, the operation can trigger scaling activities even before the cooldown time expires.
      * *   If the addition of a specified number of Elastic Compute Service (ECS) instances to a scaling group causes the total number of ECS instances in the scaling group to exceed the maximum number of instances allowed, Auto Scaling adds only a specific number of ECS instances to ensure that the total number of instances is equal to the maximum number of instances.
      * *   If the removal of a specified number of ECS instances from a scaling group causes the total number of ECS instances in the scaling group to drop below the minimum number of instances allowed, Auto Scaling removes only a specific number of ECS instances to ensure that the total number of instances is equal to the minimum number of instances.
      * A successful call indicates that Auto Scaling accepts the request. However, the scaling activity may still fail. You can obtain the status of a scaling activity by using the value of the `ScalingActivityId` parameter in the response.
      *
     */
    @Override
    public CompletableFuture<ScaleWithAdjustmentResponse> scaleWithAdjustment(ScaleWithAdjustmentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ScaleWithAdjustment").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ScaleWithAdjustmentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ScaleWithAdjustmentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<SetGroupDeletionProtectionResponse> setGroupDeletionProtection(SetGroupDeletionProtectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetGroupDeletionProtection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetGroupDeletionProtectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetGroupDeletionProtectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Configures the health check feature for Elastic Compute Service (ECS) instances.
      *
     */
    @Override
    public CompletableFuture<SetInstanceHealthResponse> setInstanceHealth(SetInstanceHealthRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetInstanceHealth").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetInstanceHealthResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetInstanceHealthResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Puts one or more Elastic Compute Service (ECS) instances into the Protected state.
      *
     */
    @Override
    public CompletableFuture<SetInstancesProtectionResponse> setInstancesProtection(SetInstancesProtectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetInstancesProtection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetInstancesProtectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetInstancesProtectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<SuspendProcessesResponse> suspendProcesses(SuspendProcessesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SuspendProcesses").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SuspendProcessesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SuspendProcessesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UntagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UntagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UntagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<VerifyAuthenticationResponse> verifyAuthentication(VerifyAuthenticationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("VerifyAuthentication").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(VerifyAuthenticationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<VerifyAuthenticationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<VerifyUserResponse> verifyUser(VerifyUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("VerifyUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(VerifyUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<VerifyUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
