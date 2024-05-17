// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ecs20140526.models.*;
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

    CompletableFuture<AcceptInquiredSystemEventResponse> acceptInquiredSystemEvent(AcceptInquiredSystemEventRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ActivateRouterInterfaceResponse> activateRouterInterface(ActivateRouterInterfaceRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<AddBandwidthPackageIpsResponse> addBandwidthPackageIps(AddBandwidthPackageIpsRequest request);

    /**
      * When you call this operation, take note of the following items:
      * *   Up to 20 tags can be added to each ECS resource.
      * *   `Tag.N.Key` must match `Tag.N.Value` based on the value of N.
      * *   If you add a tag that has the same key (`Tag.N.Key`) as an existing tag on the specified resource, the new tag value (`Tag.N.Value`) overwrites the original tag value.
      *
     */
    CompletableFuture<AddTagsResponse> addTags(AddTagsRequest request);

    /**
      * Before you create a dedicated host, you can call the [DescribeAvailableResource](~~66186~~) operation to query the resources available in a specific region or zone.
      * We recommend that you understand the billing methods of resources before you create a dedicated host. You are charged for resources used by the created dedicated host. For more information, see [Billing overview](~~68978~~).
      * *   You can create up to 100 pay-as-you-go or subscription dedicated hosts at a time.
      * *   After a dedicated host is created, you can use the returned dedicated host ID as the value of a request parameter to call the [DescribeDedicatedHosts](~~134242~~) operation to query the state of the dedicated host.
      * *   After you submit a request to create a dedicated host, an error is returned if a specific parameter is invalid or if the requested resources are insufficient. For more information about error causes, see the "Error codes" section of this topic.
      * *   After a dedicated host is created, you can call the [ModifyInstanceDeployment](~~134248~~) operation to migrate ECS instances from a shared host to the dedicated host. You can also migrate ECS instances from another dedicated host to the created dedicated host.
      *
     */
    CompletableFuture<AllocateDedicatedHostsResponse> allocateDedicatedHosts(AllocateDedicatedHostsRequest request);

    /**
      * @deprecated
      * > This operation has been upgraded. We recommend that you do not use it. For information about the new version of this operation, see [AllocateEipAddress](~~120192~~).
      *
     */
    CompletableFuture<AllocateEipAddressResponse> allocateEipAddress(AllocateEipAddressRequest request);

    /**
      * Take note of the following items:
      * *   The instance to which you want to assign a public IP address must be in the **Running** or **Stopped** state.````
      * *   If `OperationLocks` in the response of the DescribeInstances operation contains `"LockReason" : "security"` for an instance, the instance is [locked for security reasons](~~25695~~) and cannot be assigned a public IP address.
      * *   You can assign only one public IP address to an instance. If the instance already has a public IP address, the `AllocatedAlready` error is returned.
      * *   After you assign a public IP address to an instance, you must restart the instance ([RebootInstance](~~25502~~)) or start the instance ([StartInstance](~~25500~~)) to make the public IP address take effect.
      * If an instance resides in a virtual private cloud (VPC), you can assign a public IP address to the instance or associate an elastic IP address (EIP) with the instance. For more information, see [AssociateEipAddress](~~36017~~).
      * > After you associate an EIP with an instance that resides in a VPC, you cannot assign a public IP address to the instance.
      *
     */
    CompletableFuture<AllocatePublicIpAddressResponse> allocatePublicIpAddress(AllocatePublicIpAddressRequest request);

    /**
      * *   Each disk can have only one automatic snapshot policy.
      * *   Each automatic snapshot policy can be applied to multiple disks.
      *
     */
    CompletableFuture<ApplyAutoSnapshotPolicyResponse> applyAutoSnapshotPolicy(ApplyAutoSnapshotPolicyRequest request);

    /**
      * ## [](#)Usage notes
      * You can specify IPv6 addresses in the CIDR block of the vSwitch to which the ENI is connected. You can also specify the number of IPv6 addresses that the system assigns to the ENI. Take note of the following items:
      * *   IPv6 must be enabled on the vSwitch to which the ENI is connected. For more information, see [Enable IPv6 for a vSwitch](~~98923~~).
      * *   The ENI must be in the Available (Available) or InUse (InUse) state.
      * *   If you want to assign IPv6 addresses to a primary ENI, make sure that the Elastic Compute Service (ECS) instance to which the ENI is attached is in the Running (Running) or Stopped (Stopped) state.
      * *   The maximum number of IPv6 addresses that can be assigned to an ENI varies based on the instance type of the instance to which the ENI is attached.
      *     *   If the ENI is in the Available (Available) state, up to 10 IPv6 addresses can be assigned to the ENI.
      *     *   If the ENI is attached to an ECS instance, the maximum number of IPv6 addresses that can be assigned to the ENI varies based on the instance type. For more information, see [Overview of instance families](~~25378~~).
      * *   After the operation is called, you can obtain the IPv6 addresses that are assigned to the ENI from the response.
      *
     */
    CompletableFuture<AssignIpv6AddressesResponse> assignIpv6Addresses(AssignIpv6AddressesRequest request);

    /**
      * ## [](#)Usage notes
      * *   The ENI to which you want to assign secondary private IP addresses must be in the Available (Available) or InUse (InUse) state.
      * *   When you assign private IP addresses to a primary ENI, the Elastic Compute Service (ECS) instance to which the ENI is attached must be in the Running (Running) or Stopped (Stopped) state.
      * *   When an ENI is in the Available state, you can assign up to 49 secondary private IP addresses to the ENI. When an ENI is attached to an instance, the number of secondary private IP addresses that can be assigned to the ENI varies based on the instance type. For more information, see [Overview of instance families](~~25378~~).
      * *   After the operation is called, you can obtain the assigned secondary private IP addresses from the response.
      *
     */
    CompletableFuture<AssignPrivateIpAddressesResponse> assignPrivateIpAddresses(AssignPrivateIpAddressesRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<AssociateEipAddressResponse> associateEipAddress(AssociateEipAddressRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<AssociateHaVipResponse> associateHaVip(AssociateHaVipRequest request);

    /**
      * When you call this operation, take note of the following items:
      * *   The instance that you want to connect to a VPC must be in the **Running** or **Stopped** state.
      * *   The ClassicLink feature must be enabled for the destination VPC. For more information, see [Create a ClassicLink connection](~~65413~~).
      * *   The instance and the VPC must reside in the same region.
      *
     */
    CompletableFuture<AttachClassicLinkVpcResponse> attachClassicLinkVpc(AttachClassicLinkVpcRequest request);

    /**
      * When you call this operation, take note of the following items:
      * *   The disk that you want to attach must be in the **Available** state.``
      * *   When the disk is attached as a data disk, take note of the following items:
      *     *   The instance must be in the **Running** or **Stopped** state.````
      *     *   If the disk was separately purchased, the billing method of the disk must be pay-as-you-go.
      *     *   If the disk is a system disk detached from an instance, no limits apply to the billing method of the disk.
      * *   When the disk is attached as a system disk, take note of the following items:
      *     *   The instance must be the original instance from which the system disk was detached.
      *     *   The instance must be in the **Stopped** state.``
      *     *   The logon credentials must be configured.
      * *   If the response contains `{"OperationLocks": {"LockReason" : "security"}}` when you query the information of the instance, the instance is locked for security reasons and all operations are prohibited on the instance.
      *
     */
    CompletableFuture<AttachDiskResponse> attachDisk(AttachDiskRequest request);

    CompletableFuture<AttachInstanceRamRoleResponse> attachInstanceRamRole(AttachInstanceRamRoleRequest request);

    /**
      * Take note of the following items:
      * *   SSH key pairs are not supported on Windows instances.
      * *   If an SSH key pair is bound to an instance, authentication by using the username and password is disabled for the instance.
      * *   If you bind an SSH key pair to an instance in the **running** state, you must call the [RebootInstance](~~25502~~) operation to restart the instance for the key pair to take effect.
      * *   If you bind an SSH key pair to an instance in the **stopped** state, you must call the [StartInstance](~~25500~~) operation to start the instance for the key pair to take effect.
      * *   If an instance is already bound to an SSH key pair, the new SSH key pair will replace the original one.
      *
     */
    CompletableFuture<AttachKeyPairResponse> attachKeyPair(AttachKeyPairRequest request);

    /**
      * Take note of the following items:
      * *   The ENI must be in the **Available** state. You can attach an ENI to only one instance that resides in the same zone and VPC as the ENI.``
      * *   The instance must be in the Running or Stopped state. When you attach ENIs to instances of specific instance types, make sure that the instances are in the Stopped state. For more information, see the "Instance types of the ECS instances that must be in the Stopped (Stopped) state" section in the [Bind an ENI](~~58503~~) topic.
      *     **
      *     **Note**If the last start time of the instance (including the start time of the instance if it is a new instance, the last restart time of the instance, and the last reactivation time of the instance) is before April 1st, 2018 and the instance is in the Running state, you must call the RebootInstance operation to restart the instance. If you do not call the RebootInstance operation to restart the instance, you cannot attach the ENI to the instance.
      * *   You can attach multiple ENIs to one instance. For more information, see [ENI overview](~~58496~~).
      * *   The vSwitch to which the ENI is connected must be in the same zone and VPC as the vSwitch to which the instance is connected.
      * *   This operation is an asynchronous operation. After you call this operation to attach an ENI, you can view the status or events of the ENI to check whether the ENI is attached. The following figure shows the transitions between the statuses of the ENI.
      * ![](https://static-aliyun-doc.oss-cn-hangzhou.aliyuncs.com/file-manage-files/zh-CN/20221124/esgu/AttachNetworkInterface.jpg) If the ENI is in the Attaching state, the ENI attachment request is sent and the ENI is being attached to the specified instance. If the ENI is in the InUse state, the ENI is attached to the specified instance. If the ENI is in the Available state, the ENI failed to be attached.
      * **For examples on how to call this operation, see **[Attach an ENI](~~471550~~).
      *
     */
    CompletableFuture<AttachNetworkInterfaceResponse> attachNetworkInterface(AttachNetworkInterfaceRequest request);

    /**
      * Take note of the following items:
      * *   The total number of outbound and inbound rules in each security group cannot exceed 200. For more information, see the "Security group limits" section in [Limits](~~25412#SecurityGroupQuota1~~).
      * *   The valid values of Priority range from 1 to 100. A smaller value indicates a higher priority.
      * *   When multiple security group rules have the same priority, drop rules take precedence.
      * *   The source can be a CIDR block that is specified by SourceCidrIp, Ipv6SourceCidrIp, or SourcePrefixListId. The source can also be Elastic Compute Service (ECS) instances in a security group that is specified by SourceGroupId.
      * *   You cannot reference security groups as sources or destinations in the rules of advanced security groups.
      * *   You can reference up to 20 security groups as sources or destinations in the rules of each basic security group.
      * *   If the specified security group rule already exists in the security group, the call is successful but no security group rule is created.
      * *   Parameters and their `Permissions.N`-prefixed counterparts cannot be specified at the same time. We recommend that you use the `Permissions.N`-prefixed parameters.
      * *   You can determine a security group rule by specifying one of the following groups of parameters. You cannot determine a security group rule by specifying only one parameter.
      *     *   Parameters used to specify an inbound security group rule that controls access from a specific CIDR block: IpProtocol, PortRange, SourcePortRange (optional), NicType, Policy, and SourceCidrIp. For a security group of the Virtual Private Cloud (VPC) type, you must set NicType to intranet. For a security group of the classic network type, you can set NicType to either internet or intranet. Sample request:
      *             http(s)://ecs.aliyuncs.com/?Action=AuthorizeSecurityGroup
      *             &SecurityGroupId=sg-bp67acfmxazb4p****
      *             &Permissions.1.SourceCidrIp=10.0.0.0/8
      *             &Permissions.1.IpProtocol=TCP
      *             &Permissions.1.PortRange=22/22
      *             &Permissions.1.NicType=intranet
      *             &Permissions.1.Policy=Accept
      *             &<Common request parameters>
      *     *   Parameters used to determine an inbound security group rule that controls access from a security group: IpProtocol, PortRange, SourcePortRange (optional), NicType, Policy, SourceGroupOwnerAccount, and SourceGroupId. In this case, you must set NicType to intranet. For mutual access between security groups in the classic network, you can allow or deny another security group within the same region access to your security group. The security group that is allowed access to your security group can belong to your own Alibaba Cloud account or another Alibaba Cloud account specified by SourceGroupOwnerAccount. For mutual access between security groups in VPCs, you can allow or deny another security group within the same VPC access to your security group. Sample request:
      *             http(s)://ecs.aliyuncs.com/?Action=AuthorizeSecurityGroup
      *             &SecurityGroupId=sg-bp67acfmxazb4p****
      *             &Permissions.1.SourceGroupId=sg-1651FBB**
      *             &Permissions.1.SourceGroupOwnerAccount=test@aliyun.com
      *             &Permissions.1.IpProtocol=TCP
      *             &Permissions.1.PortRange=22/22
      *             &Permissions.1.NicType=intranet
      *             &Permissions.1.Policy=Drop
      *             &<Common request parameters>
      *     *   Parameters used to determine an inbound security group rule that controls access from a prefix list: IpProtocol, PortRange, SourcePortRange (optional), NicType, Policy, and SourcePrefixListId. In this case, prefix lists support only security groups in VPCs. NicType must be set to intranet. Sample request:
      *             http(s)://ecs.aliyuncs.com/?Action=AuthorizeSecurityGroup
      *             &SecurityGroupId=sg-bp67acfmxazb4p****
      *             &Permissions.1.SourcePrefixListId=pl-x1j1k5ykzqlixdcy****
      *             &Permissions.1.SourceGroupOwnerAccount=test@aliyun.com
      *             &Permissions.1.IpProtocol=TCP
      *             &Permissions.1.PortRange=22/22
      *             &Permissions.1.NicType=intranet
      *             &Permissions.1.Policy=Drop
      *             &<Common request parameters>
      * *   For information about examples on security group rule settings, see [Security groups for different use cases](~~25475~~) and [Security group quintuple rules](~~97439~~).
      *
     */
    CompletableFuture<AuthorizeSecurityGroupResponse> authorizeSecurityGroup(AuthorizeSecurityGroupRequest request);

    /**
      * In the security group-related API documents, outbound traffic refers to the traffic that is sent by the source device and received at the destination device.
      * When you call this operation, take note of the following items:
      * *   The total number of inbound and outbound security group rules in each security group cannot exceed 200. For more information, see the "Security group limits" section in [](~~25412#SecurityGroupQuota1~~).
      * *   You can set Policy to accept or drop for each security group rule to allow or deny access.
      * *   The valid value of Priority ranges from 1 to 100. A smaller value indicates a higher priority.
      * *   When several security group rules have the same priority, drop rules take precedence.
      * *   The destination can be a CIDR block specified by DestCidrIp, Ipv6DestCidrIp, or DestPrefixListId or can be Elastic Compute Service (ECS) instances in a security group specified by DestGroupId.
      * *   For advanced security groups, security groups cannot be used as authorization objects.
      * *   For each basic security group, a maximum of 20 security groups can be used as authorization objects.
      * *   If the specified security group rule exists in the security group, the call is successful but no security group rule is created.
      * *   The `Permissions.N` prefix is added to some parameters to generate new parameters. Original parameters and corresponding parameters prefixed with Permissions.N cannot be configured together. We recommend that you use parameters prefixed with `Permissions.N`.
      * *   You can determine a security group rule by configuring one of the following groups of parameters. You cannot determine a security group rule by configuring only one parameter.
      *     *   Parameters used to specify a security group rule that controls access to a specified CIDR block: IpProtocol, PortRange, SourcePortRange (optional), NicType, Policy, and DestCidrIp. Sample request:
      *             http(s)://ecs.aliyuncs.com/?Action=AuthorizeSecurityGroupEgress
      *             &SecurityGroupId=sg-bp67acfmxazb4ph***
      *             &Permissions.1.IpProtocol=ICMP
      *             &Permissions.1.DestCidrIp=10.0.0.0/8
      *             &Permissions.1.PortRange=-1/-1
      *             &Permissions.1.NicType=intranet
      *             &Permissions.1.Policy=Accept
      *             &<Common request parameters>
      *     *   Parameters used to specify a security group rule that controls access to a security group: IpProtocol, PortRange, SourcePortRange (optional), NicType, Policy, DestGroupOwnerAccount, and DestGroupId. Sample request:
      *             http(s)://ecs.aliyuncs.com/?Action=AuthorizeSecurityGroupEgress
      *             &SecurityGroupId=sg-bp67acfmxazb4ph***
      *             &Permissions.1.DestGroupId=sg-bp67acfmxazb4pi***
      *             &Permissions.1.DestGroupOwnerAccount=Test@aliyun.com
      *             &Permissions.1.IpProtocol=TCP
      *             &Permissions.1.PortRange=22/22
      *             &Permissions.1.NicType=intranet
      *             &Permissions.1.Policy=Drop
      *             &<Common request parameters>
      *     *   Parameters used to specify a security group rule that controls access to a prefix list: IpProtocol, PortRange, SourcePortRange (optional), NicType, Policy, and DestPrefixListId. In this case, prefix lists support only security groups in virtual private clouds (VPCs). NicType must be set to intranet. Sample request:
      *             http(s)://ecs.aliyuncs.com/?Action=AuthorizeSecurityGroupEgress
      *             &SecurityGroupId=sg-bp67acfmxazb4ph***
      *             &Permissions.1.DestPrefixListId=pl-x1j1k5ykzqlixdcy****
      *             &Permissions.1.DestGroupOwnerAccount=Test@aliyun.com
      *             &Permissions.1.IpProtocol=TCP
      *             &Permissions.1.PortRange=22/22
      *             &Permissions.1.NicType=intranet
      *             &Permissions.1.Policy=Drop
      *             &<Common request parameters>
      *
     */
    CompletableFuture<AuthorizeSecurityGroupEgressResponse> authorizeSecurityGroupEgress(AuthorizeSecurityGroupEgressRequest request);

    CompletableFuture<CancelAutoSnapshotPolicyResponse> cancelAutoSnapshotPolicy(CancelAutoSnapshotPolicyRequest request);

    /**
      * When you call this operation, take note of the following items:
      * *   After you cancel an image copy task, the image copy created in the destination region is deleted, and the copied image remains unchanged.
      * *   If the image copy task is complete, the CancelCopyImage operation fails, and an error is returned.
      *
     */
    CompletableFuture<CancelCopyImageResponse> cancelCopyImage(CancelCopyImageRequest request);

    /**
      * Before you call this operation, make sure that the image build task to be canceled is in the BUILDING, DISTRIBUTING, or RELEASING state.
      *
     */
    CompletableFuture<CancelImagePipelineExecutionResponse> cancelImagePipelineExecution(CancelImagePipelineExecutionRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<CancelPhysicalConnectionResponse> cancelPhysicalConnection(CancelPhysicalConnectionRequest request);

    CompletableFuture<CancelSimulatedSystemEventsResponse> cancelSimulatedSystemEvents(CancelSimulatedSystemEventsRequest request);

    CompletableFuture<CancelTaskResponse> cancelTask(CancelTaskRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ConnectRouterInterfaceResponse> connectRouterInterface(ConnectRouterInterfaceRequest request);

    /**
      * ## [](#)Usage notes
      * After a public IP address is converted into an EIP, the EIP is billed separately. Make sure that you fully understand the billing methods of EIPs. For more information, see [Billing overview](~~122035~~).
      * When you call this operation, make sure that the ECS instance meets the following requirements:
      * *   The instance is in the **Stopped** (`Stopped`) or **Running** (`Running`) state.
      * *   The instance has no EIPs associated.
      * *   The instance has no configuration change tasks that have not taken effect.
      * *   The public bandwidth of the instance is not 0 Mbit/s.
      * *   If the instance is a subscription instance, the billing method for network usage of the instance must be `pay-by-traffic`. The public IP address of a subscription instance that uses the `pay-by-bandwidth` billing method for network usage cannot be converted into an EIP. This requirement does not apply to pay-as-you-go instances. For more information, see [Change the billing method for network usage](~~178883~~).
      * *   If the instance is a subscription instance that resides in a VPC, the instance does not expire within 24 hours.
      *
     */
    CompletableFuture<ConvertNatPublicIpToEipResponse> convertNatPublicIpToEip(ConvertNatPublicIpToEipRequest request);

    /**
      * ## [](#)Usage notes
      * After you copy a custom image to the destination region, you can use the image copy (new image) to create ECS instances by calling the RunInstances operation or replace the system disks of instances by calling the ReplaceSystemDisk operation in the destination region.
      * Take note of the following items:
      * *   Only custom images that are in the `Available` state can be copied.
      * *   Custom images that you want to copy must belong to your Alibaba Cloud account or be shared to you by others, and cannot be copied across accounts.
      * *   When an image is being copied, the image cannot be deleted by calling the [DeleteImage](~~25537~~) operation. However, you can cancel the ongoing image copy task by calling the [CancelCopyImage](~~25539~~) operation.
      * *   A region can have only one ongoing image copy task at a time. Other image copy tasks queue up to run in sequence after the ongoing task is completed.
      * *   You can configure `ResourceGroupId` to specify the resource group to which to assign the new image. If you do not configure `ResourceGroupId`, the new image is assigned to the default resource group.
      *
     */
    CompletableFuture<CopyImageResponse> copyImage(CopyImageRequest request);

    /**
      * ## [](#)Usage notes
      * Take note of the following items:
      * *   New snapshots (snapshot copies) cannot be used to roll back the disks for which source snapshots (copied snapshots) were created.
      * *   Local snapshots cannot be copied.
      *
     */
    CompletableFuture<CopySnapshotResponse> copySnapshot(CopySnapshotRequest request);

    /**
      * After you use an activation code to register a server that is not provided by Alibaba Cloud as an Alibaba Cloud managed instance, you can use various online services of Alibaba Cloud, such as Cloud Assistant, CloudOps Orchestration Service (OOS), and Apsara Devops, on the managed instance. 
      * If a server is not provided by Alibaba Cloud, you can register the server as an Alibaba Cloud managed instance only if the server has Internet connectivity and runs an operating system of one of the following versions: 
      * - Alibaba Cloud Linux 2, Alibaba Cloud Linux 3, and later
      * - CentOS 6, CentOS 7, CentOS 8, and later
      * - Debian 8, Debian 9, Debian 10, and later
      * - Ubuntu 12, Ubuntu 14, Ubuntu 16, Ubuntu 18, and later
      * - CoreOS
      * - OpenSUSE
      * - Red Hat 5, Red Hat 6, Red Hat 7, and later
      * - SUSE Linux Enterprise Server (SLES) 11, SLES 12, SLES 15, and later
      * - Windows Server 2012, Windows Server 2016, Windows Server 2019, and later
      * You can have up to 5,000 activation codes per Alibaba Cloud region. When the number of activation codes exceeds 1,000, the usage of the activation codes must be greater than 50% before you can proceed to create more activation codes. 
      * >To query the usage of activation codes, go to the Cloud Assistant page in the Elastic Compute Service (ECS) console, click the Manage Instances tab, and then click Register Instance.
      *
     */
    CompletableFuture<CreateActivationResponse> createActivation(CreateActivationRequest request);

    /**
      * ## [](#)Usage notes
      * *   Auto Provisioning is a service that allows quick deployment of an instance cluster that consists of preemptible instances and pay-as-you-go instances. Auto Provisioning supports push-button deployment of instance clusters across different billing methods, instance families, and zones. For more information, see [Use auto provisioning group-related API operations to create multiple ECS instances at the same time](~~200772~~).
      * *   Auto Provisioning uses auto provisioning groups to schedule and maintain computing resources. You can use auto provisioning groups to obtain a steady supply of computing resources. This helps reduce the impact on compute capacity when preemptible instances are reclaimed.
      * *   Auto Provisioning is provided free of charge. However, you are charged for instance resources that are created in auto provisioning groups. For more information, see [Overview of preemptible instances](~~52088~~) and [Pay-as-you-go](~~40653~~).
      * *   When you specify both a launch template (`LaunchTemplateId`) and extended configurations (`LaunchConfiguration.*` parameters), LaunchTemplateId takes precedence.
      *
     */
    CompletableFuture<CreateAutoProvisioningGroupResponse> createAutoProvisioningGroup(CreateAutoProvisioningGroupRequest request);

    /**
      * ## [](#)Usage notes
      * When you call this operation to create an automatic snapshot policy, you can specify the days of the week on which to create automatic snapshots, the retention period of the automatic snapshots, and whether to enable cross-region replication for the snapshots in the policy to meet your diverse data backup requirements. After the automatic snapshot policy is created, call the [ApplyAutoSnapshotPolicy](~~25531~~) operation to apply the policy to disks. If you want to modify the automatic snapshot policy, call the [ModifyAutoSnapshotPolicyEx](~~25529~~) operation.
      * Take note of the following items:
      * *   You can create up to 100 automatic snapshot policies per region for a single Alibaba Cloud account.
      * *   If an automatic snapshot is being created when the time scheduled for creating another automatic snapshot is due, the new snapshot task is skipped. This may occur when a disk contains a large volume of data. For example, you have scheduled snapshots to be created at 09:00:00, 10:00:00, 11:00:00, and 12:00:00 for a disk. The system starts to create a snapshot for the disk at 09:00:00. The process takes 80 minutes to complete because the disk contains a large volume of data and ends at 10:20:00. In this case, the system does not create a snapshot at 10:00, but creates a snapshot at 11:00.
      * *   For information about how to copy a snapshot from one region to another region, see the "Background information" section in [Copy a snapshot](~~159441~~).
      *
     */
    CompletableFuture<CreateAutoSnapshotPolicyResponse> createAutoSnapshotPolicy(CreateAutoSnapshotPolicyRequest request);

    /**
      * When you create a capacity reservation, you can specify attributes such as a zone and an instance type. The system uses a private pool to reserve resources that match the specified attributes. For more information, see [Overview of Immediate Capacity Reservation](~~193633~~).
      * *   Currently, only immediate capacity reservations are supported. Immediate capacity reservations take effect immediately after you purchase them. After you purchase an immediate capacity reservation, you are charged for the specified instance type based on the pay-as-you-go billing method regardless of whether you use the capacity reservation to create pay-as-you-go instances. Billing stops when you manually release the capacity reservation or when the capacity reservation expires and is automatically released.
      *     *   You can call the [CreateInstance](~~25499~~) or [RunInstances](~~63440~~) operation to specify private pool attributes when you create instances. To modify the attributes of a private pool, you can call the [ModifyInstanceAttachmentAttributes](~~190006~~) operation. If an instance matches a private pool associated with a capacity reservation, you are charged based on the configurations of the instance such as the instance type, disks, and public bandwidth.
      *     *   Before you use a private pool associated with a capacity reservation to create pay-as-you-go instances, you are charged only for the specified instance type.
      * *   You can apply savings plans or regional reserved instances to offset hourly billing of unused immediate capacity reservations, and hourly fees of the instances that match the immediate capacity reservations. However, you cannot use zonal reserved instances to offset the hourly fees. We recommend that you purchase reserved instances or savings plans before you purchase immediate capacity reservations. This way, you can access resources free of charge within the coverage of the reserved instances or savings plans.
      * > You can call the CreateCapacityReservation operation to create only immediate capacity reservations. You can create immediate or scheduled capacity reservations in the Elastic Compute Service (ECS) console. For more information, see [Overview](~~193626#section-oil-qh5-xvx~~).
      *
     */
    CompletableFuture<CreateCapacityReservationResponse> createCapacityReservation(CreateCapacityReservationRequest request);

    /**
      * ## [](#)Usage notes
      * *   You can create commands of the following types:
      *     *   Batch commands (RunBatScript), applicable to Windows instances
      *     *   PowerShell commands (RunPowerShellScript), applicable to Windows instances
      *     *   Shell commands (RunShellScript), applicable to Linux instances
      * *   You can specify the Timeout parameter to set the maximum timeout period for executions of a command on Elastic Compute Service (ECS) instances. If an execution times out, [Cloud Assistant Agent](~~64921~~) forcefully terminates the command process by canceling the process ID (PID) of the command.
      *     *   For a one-time task, when the execution times out, the state of the command ([InvokeRecordStatus](~~64845~~)) becomes Failed.
      *     *   For a scheduled task, take note of the following items:
      *         *   The timeout period takes effect on each execution.
      *         *   When an execution times out, the state ([InvokeRecordStatus](~~64845~~)) of the command becomes Failed.
      *         *   The timeout of one execution does not affect the subsequent executions.
      * *   You can retain up to 500 to 50,000 Cloud Assistant commands in each region. You can also apply for a quota increase. For information about how to query and increase quotas, see [Manage quotas](~~184116~~).
      * *   You can use WorkingDir to specify the execution directory of a Cloud Assistant command. For Linux instances, the default execution directory of Cloud Assistant commands is the home directory of the root user, which is `/root`. For Windows instances, the default execution directory of Cloud Assistant commands is the directory where the Cloud Assistant Agent process resides, such as `C:\\Windows\\System32`.
      * *   You can enable the custom parameter feature for a Cloud Assistant command by setting EnableParameter to true. When you set CommandContent, you can define custom parameters in the {{parameter}} format. Then, when the [InvokeCommand](~~64841~~) operation is called, the key-value pairs of custom parameters are passed in. For example, if a command is `echo {{name}}`, the Parameters parameter can be used to pass in the `<name, Jack>` key-value pair when the InvokeCommand operation is called. The name key of the custom parameter is automatically replaced by the paired Jack value to generate a new command. As a result, the `echo Jack` command is run.
      *
     */
    CompletableFuture<CreateCommandResponse> createCommand(CreateCommandRequest request);

    CompletableFuture<CreateDedicatedHostClusterResponse> createDedicatedHostCluster(CreateDedicatedHostClusterRequest request);

    /**
      * @deprecated
      * You can call this operation to file a demand for an ECS instance type. Alibaba Cloud provides the requested resources based on your demand.
      * You can file demands only for I/O optimized instance types and instances of the virtual private cloud (VPC) type.
      * > This operation is in internal preview and has not been officially released. We recommend that you do not call this operation.
      *
     */
    CompletableFuture<CreateDemandResponse> createDemand(CreateDemandRequest request);

    CompletableFuture<CreateDeploymentSetResponse> createDeploymentSet(CreateDeploymentSetRequest request);

    CompletableFuture<CreateDiagnosticMetricSetResponse> createDiagnosticMetricSet(CreateDiagnosticMetricSetRequest request);

    CompletableFuture<CreateDiagnosticReportResponse> createDiagnosticReport(CreateDiagnosticReportRequest request);

    /**
      * *   When you create a disk, you can enable the multi-attach (`MultiAttach`) feature for the disk. Before you enable the multi-attach feature, we recommend that you familiarize yourself with the multi-attach feature and its limits. For more information, see [NVMe protocol](~~256487~~) and [Use the multi-attach feature](~~262105~~).
      * *   You can create a basic disk, an ultra disk, a standard SSD, or an enhanced SSD (ESSD).
      * *   When you create disks, you may be charged for the resources used. We recommend that you familiarize yourself with the Elastic Compute Service (ECS) billing methods before you proceed. For more information, see [Billing overview](~~25398~~).
      * *   By default, `DeleteAutoSnapshot` is set to `true` when a disk is created. This indicates that when the disk is released, the automatic snapshots of the disk are also deleted. You can call the [ModifyDiskAttribute](~~25517~~) operation to modify the parameter value.
      * *   If you do not configure the performance level when you create an ESSD, the performance level for the ESSD is PL1 by default. You can call the [ModifyDiskSpec](~~123780~~) operation to modify the performance level of the ESSD.
      * *   By default, for a disk that is created by calling this operation, the `Portable` attribute is set to `true` and the billing method is pay-as-you-go.
      *
     */
    CompletableFuture<CreateDiskResponse> createDisk(CreateDiskRequest request);

    /**
      * Elasticity Assurance provides a new way to purchase and use resources with flexibility and assurance. It offers assured resource reservations for pay-as-you-go Elastic Compute Service (ECS) instances. For more information, see [Overview of Elasticity Assurance](~~193630~~).
      * *   Elasticity assurances are not refundable after purchase.
      * *   Elasticity assurances are applicable to only pay-as-you-go ECS instances.
      * *   Elasticity assurances support only the unlimited mode. Therefore, you can set `AssuranceTimes` only to `Unlimited`. Elasticity assurances in unlimited mode can be applied an unlimited number of times within their effective period and take effect immediately after they are purchased.
      *
     */
    CompletableFuture<CreateElasticityAssuranceResponse> createElasticityAssurance(CreateElasticityAssuranceRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<CreateForwardEntryResponse> createForwardEntry(CreateForwardEntryRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<CreateHaVipResponse> createHaVip(CreateHaVipRequest request);

    CompletableFuture<CreateHpcClusterResponse> createHpcCluster(CreateHpcClusterRequest request);

    /**
      * ## [](#)Usage notes
      * Take note of the following items:
      * *   You can use the created custom image only if the image is in the Available (Available) state.
      * *   If the response contains `{"OperationLocks": {"LockReason" : "security"}}` when you query the information of an instance, the instance is locked for security reasons. No operations are allowed on the instance.
      * *   To optimize the image, we recommend that you specify DetectionStrategy when you create the image. For more information, see [Overview of image check](~~439819~~).
      * You can call the CreateImage operation to create a custom image by using one of the following methods. The following request parameters are sorted by priority: `InstanceId` > `DiskDeviceMapping` > `SnapshotId`. If your request contains two or more of these parameters, the custom image is created based on the parameter that has a higher priority.
      * *   **Method 1**: Create a custom image from an instance. You need to only specify the ID of the instance by using `InstanceId`. The instance must be in the Running (`Running`) or Stopped (`Stopped`) state. After you call the CreateImage operation, a snapshot is created for each disk of the instance. When you create a custom image from a running instance, cache data may not be written to disks. In this case, the data of the custom image may be slightly different from the data of the instance. We recommend that you stop instances by calling the [StopInstances](~~155372~~) operation before you create custom images from the instances.
      * *   **Method 2**: Create a custom image from the system disk snapshot of an instance. You need to only specify the ID of the system disk snapshot by using `SnapshotId`. The specified system disk snapshot must be created after July 15, 2013.
      * *   **Method 3**: Create a custom image from multiple disk snapshots. You must specify data mappings between the snapshots and the disks to be created by using the parameters that start with `DiskDeviceMapping`.
      * When you use Method 3 to create a custom image, take note of the following items:
      * *   You can specify only one snapshot to use to create the system disk in the custom image. The device name of the system disk must be /dev/xvda.
      * *   You can specify up to 16 snapshots to use to create data disks in the custom image. The device names of the data disks are unique and range from /dev/xvdb to /dev/xvdz in alphabetical order.
      * *   You can leave `SnapshotId` empty. In this case, an empty data disk with the specified size is created.
      * *   The specified disk snapshot must be created after July 15, 2013.
      *
     */
    CompletableFuture<CreateImageResponse> createImage(CreateImageRequest request);

    /**
      * Take note of the following items:
      * *   Only custom image components can be created.
      * *   The images must run Linux operating systems. This indicates that you must set `SystemType` to Linux.
      * *   You must set the image component type to image build component by setting the `ComponentType` parameter to Build.
      * *   You can use Dockerfile to edit the content of image components, and then pass the edited content into the `Content` parameter. The content size must not be greater than 16 KB. `FROM` commands cannot be used in image components. An image component supports up to 127 commands. For information about supported commands, see [Description of commands supported by Image Builder](~~200206~~).
      * You can use image components to create image templates in the Elastic Compute Service (ECS) console, but cannot call API operations to use image components to create image templates. For more information, see [Overview of Image Builder](~~197410~~).
      *
     */
    CompletableFuture<CreateImageComponentResponse> createImageComponent(CreateImageComponentRequest request);

    /**
      * You can use image templates to specify custom image content and create images across regions and accounts. When you call this operation, take note of the following items:
      * *   You can create only custom image templates.
      * *   You can configure only public, custom, or shared Linux images or image families as the source images when you create image templates.
      * *   When you use an image template to create an image, you must create an intermediate Elastic Compute Service (ECS) instance to help create the image. The intermediate instance is billed by using the pay-as-you-go billing method. For more information, see [Pay-as-you-go](~~40653~~).
      * For the `BuildContent` parameter that specifies the content of image templates, take note of the following items:
      * *   If the `BuildContent` value contains `FROM` commands, the `FROM` commands override the values of `BaseImageType` that specifies the type of the source images and `BaseImage` that specifies the source image.
      * *   If the `BuildContent` value does not contain `FROM` commands, the system creates a `FROM` command that consists of the `BaseImageType` and `BaseImage` values in the format of `<BaseImageType>:<BaseImage>` and adds the command to the first line of the template content.
      * *   You can use Dockerfile to edit the content of image templates and then pass the edited content into the `BuildContent` parameter. The content of an image template cannot exceed 16 KB in size and can contain up to 127 commands. For information about commands supported by image templates, see [Description of commands supported by Image Builder](~~200206~~).
      * You can use image components to create image templates in the ECS console, but cannot call API operations to use image components to create image templates. For more information, see [Overview of Image Builder](~~197410~~).
      *
     */
    CompletableFuture<CreateImagePipelineResponse> createImagePipeline(CreateImagePipelineRequest request);

    /**
      * ## [](#)Usage notes
      * >  You can call the [DescribeAvailableResource](~~66186~~) operation to query available resources in a specific region or zone. If you want to batch create instances that automatically enter the Running state after they are created, we recommend that you call the [RunInstances](~~63440~~) operation.
      * Take note of the following items:
      * *   **Billing**:
      *     *   You must familiarize yourself with ECS billing methods before you create an instance because you may be charged for the resources used by the instance. For more information, see [Billing overview](~~25398~~).
      *     *   If you create a subscription instance (`PrePaid`), available coupons in your account are used by default.
      * *   **Instance type**:
      *     *   You can use the `IoOptimized` parameter to specify whether to create an I/O optimized instance.
      *     *   Instance type selection: See [Instance families](~~25378~~) or call the [DescribeInstanceTypes](~~25620~~) operation to query the performance data of instance types, or see [Best practices for instance type selection](~~58291~~) to learn about how to select instance types.
      *     *   Query of available resources: Call the [DescribeAvailableResource](~~66186~~) operation to query resources available in a specific region or zone.
      * >  If the `QuotaExceed.ElasticQuota` error is returned when you call this operation, it indicates that the maximum number of instances of the specified instance type in the region has been reached, or the maximum number of vCPUs for all instance types in a zone has been reached. You can go to the [ECS console](https://ecs.console.aliyun.com/?spm=a2c8b.12215451.favorites.decs.5e3a336aMGTtzy#/privileges/quota) or [Quota Center](https://quotas.console.aliyun.com/products/ecs/quotas) to request a quota increase.
      * *   **Image**:
      *     *   The image determines the system disk configurations of the new instance. The system disk of the new instance is a clone of the specified image.
      *     *   If you want to create instances with 512 MiB of memory, you cannot use Windows Server images except for Windows Server Semi-Annual Channel images.
      *     *   If you want to create instances with 4 GiB or more of memory, you cannot use 32-bit OS image.
      * *   **Network type**:
      *     *   Each instance that resides in a virtual private cloud (VPC) must be connected to only a single vSwitch.
      *     *   If `VSwitchId` is specified, the security group specified by `SecurityGroupId` and the vSwitch specified by `VSwitchId` must belong to the same VPC.
      *     *   The value of `PrivateIpAddress` varies based on the value of `VSwitchId`. `PrivateIpAddress` cannot be separately specified. If `VSwitchId` and `PrivateIpAddress` are specified, the IP address specified by `PrivateIpAddress` must be an idle IP address in the CIDR block of the specified vSwitch.
      * *   **Public bandwidth**:
      *     *   Starting November 27, 2020, the maximum bandwidth value that is available for you to create ECS instances or change ECS instance configurations is subject to the throttling policy of your account. To increase the bandwidth limit, submit a ticket. The throttling policy imposes the following constraints: In a single region, the total maximum bandwidth value of all instances that use the pay-by-traffic billing method for network usage cannot exceed 5 Gbit/s and the total maximum bandwidth value of all instances that use the pay-by-bandwidth billing method for network usage cannot exceed 50 Gbit/s.
      *     *   If you call the `CreateInstance` operation to create an instance, no public IP addresses are assigned to the instance. You can call the [AllocatePublicIpAddress](~~25544~~) operation to assign a public IP address to an instance.
      *     *   Network usage fees vary based on the settings of `InternetChargeType` and `InternetMaxBandwidthOut`.
      *     *   The value of `InternetMaxBandwidthIn` does not affect billing because inbound data traffic is free of charge.
      *     *   If `InternetChargeType` is set to PayByBandwidth, `InternetMaxBandwidthOut` specifies the fixed bandwidth. A fixed bandwidth is a specified amount of public bandwidth allocated to an instance that uses the pay-by-bandwidth billing method for network usage.
      *     *   If `InternetChargeType` is set to PayByTraffic, `InternetMaxBandwidthOut` specifies the peak bandwidth. A peak bandwidth is the maximum amount of public bandwidth that an instance can consume when the instance uses the pay-by-traffic billing method for network usage. Network usage costs are calculated based on the volume of network traffic.
      * *   **Security group**:
      *     *   If no security groups are available in the region where you want to create an instance, you must call the [CreateSecurityGroup](~~25553~~) operation to create a security group in that region first.
      *     *   The maximum number of instances that a security group can contain varies based on the security group type. For more information, see the "Security group limits" section in the [Limits](~~25412~~) topic.
      *     *   Instances in the same security group can communicate with each other over the internal network. By default, instances in different security groups cannot communicate with each other. You can allow communication between instances by allowing mutual access between the security groups to which the instances belong. For more information, see [AuthorizeSecurityGroup](~~25554~~) and [AuthorizeSecurityGroupEgress](~~25560~~).
      * *   **Storage**:
      *     *   The instance is assigned a system disk whose capacity varies based on the size of the specified image. The size of the system disk must be at least `20 GiB` and greater than or equal to the image size. For information about system disk categories, see the description of `SystemDisk.Category`.
      *     *   The system disk of an I/O optimized instance can only be an enhanced SSD (ESSD) (`cloud_essd`), a standard SSD (`cloud_ssd`), or an ultra disk (`cloud_efficiency`).
      *     *   The maximum size of a data disk varies based on the disk category. For more information, see the description of `DataDisk.N.Size`.
      *     *   Up to 16 data disks can be added to an instance. Mount points /dev/xvd\\[b-z] are automatically assigned to data disks in ascending alphanumeric order.
      * >  If the `QuotaExceed.DiskCapacity` error is returned when you call this operation, it indicates that the maximum capacity of the disks of the selected disk category in the specified zone has been reached. You can go to the [Quota Center](https://quotas.console.aliyun.com/products/disk/quotas) to query and request a quota increase.
      * *   **User data**: If the instance type supports user data, you can use the UserData parameter to pass in user data.[](~~49121~~) User data is encoded in Base64. We recommend that you do not pass in confidential information (such as passwords or private keys) in plaintext as user data. This is because the system does not encrypt `UserData` values when API requests are transmitted. If you must pass in confidential information, we recommend that you encrypt and encode the information in Base64 before you pass in the information. Then decode and decrypt the information in the same way within the instance.
      * *   **Others**: When you call API operations by using Alibaba Cloud CLI or SDKs, you must delete periods (.) from some request parameters before you use the parameters. For example, use `SystemDiskCategory` instead of `SystemDisk.Category` as a request parameter.
      *
     */
    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    /**
      * ## Description
      * In addition to calling CreateKeyPair, you can create a key pair by using a third-party key pair generation tool and call the [ImportKeyPair](~~51774~~) operation to upload the key pair to an Alibaba Cloud region.
      * A maximum of 500 key pairs can be created in each region. For more information, see [Limits](~~25412~~).
      *
     */
    CompletableFuture<CreateKeyPairResponse> createKeyPair(CreateKeyPairRequest request);

    /**
      * ## Description
      * Launch templates contain preset configurations used to create instances, such as the region, image ID, instance type, security group ID, and public bandwidth settings. If a specific parameter is not included in a launch template, you must manually specify the parameter when you use the launch template to create an instance.
      * After you create a launch template (`CreateLaunchTemplate`), its version number is set to 1 by default. You can create multiple versions (`CreateLaunchTemplateVersion`) for the launch template. Version numbers start from 1 and increment by one. If you do not specify a template version number when you use a launch template to create instances ([RunInstances](~~63440~~)), the default version is used.
      * When you call this operation, take note of the following items:
      * *   You can create up to 30 launch templates in each region. Each launch template can have up to 30 versions.
      * *   Most parameters in launch templates are optional. When you create a launch template, ECS does not verify the existence or validity of specified parameter values. The validity of the parameter values are verified only when you use the launch template to create instances.
      * *   If you set a specific parameter in a launch template, you cannot filter out this parameter when you use the launch template to create instances ([RunInstances](~~63440~~)). For example, if you set the `HostName` parameter to LocalHost in a launch template and do not set the `HostName` parameter when you call the `RunInstances` operation to create instances from the launch template, the created instance still has a hostname of `LocalHost`. If you want to overwrite the `LocalHost` value of HostName provided by the launch template, you can set `HostName` to MyHost or another value when you call the `RunInstances` operation.
      *
     */
    CompletableFuture<CreateLaunchTemplateResponse> createLaunchTemplate(CreateLaunchTemplateRequest request);

    /**
      * ## [](#)Usage notes
      * If you want to modify the parameters of a launch template version, you can create another version with different parameter settings for the launch template. You can create up to 30 versions for each launch template.
      *
     */
    CompletableFuture<CreateLaunchTemplateVersionResponse> createLaunchTemplateVersion(CreateLaunchTemplateVersionRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<CreateNatGatewayResponse> createNatGateway(CreateNatGatewayRequest request);

    /**
      * ## [](#)Usage notes
      * Take note of the following items:
      * *   This operation is a synchronous operation. After an ENI is created, it immediately enters the Available (`Available`) state and can be attached to an Elastic Compute Service (ECS) instance.
      * *   If NetworkInterfaceId is empty in the response, no ENI is created. Call the operation again to create an ENI.
      * *   An ENI can be attached only to a single instance that resides in a virtual private cloud (VPC).
      * *   When an ENI is detached from an instance and attached to another instance, the attributes of the ENI remain unchanged and network traffic is redirected to the new instance.
      * *   When you call this operation to create an ENI, you can assign up to 49 secondary private IP addresses to the ENI.
      * *   If you want to assign IPv6 addresses when you create an ENI, make sure that IPv6 is enabled for the vSwitch with which you want to associate the ENI. For more information, see [What is an IPv6 gateway?](~~98896~~)
      * *   A quota is imposed on the number of ENIs that can be created per Alibaba Cloud region per account. You can view the quota in the ECS console. For more information, see [View and increase resource quotas](~~184115~~).
      * **For information about examples on how to call this operation, see** [Create an ENI](~~471552~~).
      *
     */
    CompletableFuture<CreateNetworkInterfaceResponse> createNetworkInterface(CreateNetworkInterfaceRequest request);

    CompletableFuture<CreateNetworkInterfacePermissionResponse> createNetworkInterfacePermission(CreateNetworkInterfacePermissionRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<CreatePhysicalConnectionResponse> createPhysicalConnection(CreatePhysicalConnectionRequest request);

    /**
      * *   A prefix list is a collection of network prefixes (CIDR blocks) and can be referenced to configure network rules for other resources. For more information, see [Overview](~~206223~~).
      * *   When you create a prefix list, take note of the following items:
      *     *   You must specify an IP address family (IPv4 or IPv6) for the prefix list, and cannot change the IP address family after the prefix list is created. You cannot combine IPv4 and IPv6 CIDR blocks in a single prefix list.
      *     *   You must specify the maximum number of entries that the prefix list can contain. You cannot modify the maximum number of entries after the prefix list is created.
      *     *   You can specify entries for the prefix list. Each entry consists of a CIDR block and the description for the CIDR block. The total number of entries cannot exceed the maximum number of entries that you specified.
      * *   For more information about the limits on prefix lists and other resources, see [Limits](~~25412~~).
      * *   You can create Resource Access Management (RAM) users and grant them minimum permissions. This eliminates the need to share the AccessKey pair of your Alibaba Cloud account with other users and reduces security risks for your enterprises. For information about how to grant permissions on prefix lists to RAM users, see [Grant a RAM user permissions on prefix lists](~~206175~~)
      *
     */
    CompletableFuture<CreatePrefixListResponse> createPrefixList(CreatePrefixListRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<CreateRouteEntryResponse> createRouteEntry(CreateRouteEntryRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<CreateRouterInterfaceResponse> createRouterInterface(CreateRouterInterfaceRequest request);

    CompletableFuture<CreateSavingsPlanResponse> createSavingsPlan(CreateSavingsPlanRequest request);

    /**
      * ## [](#)Usage notes
      * Take note of the following items:
      * *   You can create up to 100 security groups in a single Alibaba Cloud region.
      * *   To create a security group of the Virtual Private Cloud (VPC) type, you must specify VpcId.
      *
     */
    CompletableFuture<CreateSecurityGroupResponse> createSecurityGroup(CreateSecurityGroupRequest request);

    /**
      * You can use the ECS console, call [ECS API](~~63962~~) operations, or use CloudMonitor to view the scheduled simulated system events.
      * The following descriptions provide the lifecycle of a simulated system event:
      * *   Scheduled: The state of the simulated system event is automatically changed to Scheduled after it is scheduled.
      * *   Executed: The state of the simulated system event is automatically changed to Executed at the time specified by the NotBefore parameter if no manual intervention is involved.
      * *   Canceled: The state of the simulated system event is changed to Canceled if you cancel the event by calling the [CancelSimulatedSystemEvents](~~88808~~) operation.
      * *   Avoided: The state of the simulated system event generated from maintenance-triggered instance restart can be changed to Avoided if you restart the instance before the scheduled time of the simulated system event. The maintenance-triggered instance restart is indicated by the SystemMaintenance.Reboot value. For more information, see [RebootInstance](~~25502~~).
      *
     */
    CompletableFuture<CreateSimulatedSystemEventsResponse> createSimulatedSystemEvents(CreateSimulatedSystemEventsRequest request);

    /**
      * ## [](#)Usage notes
      * The local snapshot feature is replaced by the instant access feature. Take note of the following items:
      * *   If you have used the local snapshot feature before December 14, 2020, you can use the Category parameter.
      * *   If you have not used the local snapshot feature before December 14, 2020, new snapshots of your enhanced SSDs (ESSDs) at performance levels 0, 1, 2, and 3 (PL0, PL1, PL2, and PL3 ESSDs) and ESSD AutoPL disks are instantly available after creation without the need for additional configurations, regardless of whether the snapshots are manually or automatically created. The InstantAccess, InstantAccessRetentionDays, and DisableInstantAccess parameters in this operation that are related to the instant access feature no longer take effect. Available is added to the response parameters of the DescribeSnapshots and DescribeSnapshotGroup operations to indicate whether the snapshot is available.
      * In the following scenarios, you cannot create snapshots for a disk:
      * *   The number of manual snapshots of the disk has reached 256.
      * *   A snapshot is being created for the disk.
      * *   The Elastic Compute Service (ECS) instance to which the disk is attached has never been started.
      * *   The ECS instance to which the disk is attached is not in the **Stopped** (`Stopped`) or **Running** (`Running`) state.
      * *   If the response contains `{"OperationLocks": {"LockReason" : "security"}}` when you query the information of the instance, the instance is locked for security reasons and all operations are prohibited on it.
      * When you create a snapshot, take note of the following items:
      * *   If a snapshot is being created, you cannot use this snapshot to create a custom image by calling the [CreateImage](~~25535~~) operation.
      * *   When a snapshot is being created for a disk that is attached to an ECS instance, do not change the instance state.
      * *   You can create snapshots for a disk that is in the **Expired** (`Expired`) state. If the release time scheduled for a disk arrives while a snapshot is being created for the disk, the snapshot is in the **Creating** (`Creating` state and is deleted when the disk is released.
      *
     */
    CompletableFuture<CreateSnapshotResponse> createSnapshot(CreateSnapshotRequest request);

    /**
      * ## [](#)Usage notes
      * You can specify `InstanceId` to create a snapshot-consistent group for disks on a specific (ECS instance. You can also specify `DiskId.N` to create a snapshot-consistent group for multiple disks on multiple ECS instances within the same zone.
      * >  You cannot specify both `DiskId.N` and `ExcludeDiskId.N` in the same request. If `InstanceId` is specified, you can use `DiskId.N` to specify only disks on the ECS instance specified by InstanceId and cannot use DiskId.N to specify disks across ECS instances.
      * Take note of the following items:
      * *   The disks for which you want to create a snapshot must be in the **In Use** (`In_use`) or **Unattached** (`Available`) state.
      *     *   If a disk is in the **In Use** (`In_use`) state, make sure that the ECS instance to which the disk is attached is in the **Running** (`Running`) or **Stopped** (`Stopped`) state.
      *     *   If a disk is in the **Unattached** (`Available`) state, make sure that the disk has been attached to ECS instances. Snapshots cannot be created for disks that have never been attached to an ECS instance.
      * *   Snapshot-consistent groups can be used to create snapshots only for enhanced SSDs (ESSDs).
      * *   A snapshot-consistent group can contain snapshots of up to 16 disks, including system disks and data disks, and cannot exceed 32 TiB in size.
      * *   Snapshots that you created are stored indefinitely until you delete the snapshots. We recommend that you delete unnecessary snapshots on a regular basis to prevent excess snapshot storage fees.
      * *   Snapshot-consistent groups cannot be created for disks for which multi-attach feature is enabled. If disks for which the multi-attach feature is enabled are attached to an ECS instance, specify the `ExcludeDiskId.N` parameter to exclude the disks.
      * For more information about the snapshot-consistent group feature, see [Create a snapshot-consistent group](~~199625~~).
      *
     */
    CompletableFuture<CreateSnapshotGroupResponse> createSnapshotGroup(CreateSnapshotGroupRequest request);

    /**
      * A storage set can distribute disks or Shared Block Storage devices to different locations. You can specify the number of partitions in a storage set. A larger number of partitions indicate more discrete distribution of disks or Shared Block Storage devices.
      * When you call this operation, take note of the following items:
      * *   The number of storage sets that you can create in a region is limited. You can call the [DescribeAccountAttributes](~~73772~~) operation to query the limit.
      * *   The number of partitions in a zone is limited. You can call the [DescribeAccountAttributes](~~73772~~) operation to query the limit.
      *
     */
    CompletableFuture<CreateStorageSetResponse> createStorageSet(CreateStorageSetRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<CreateVSwitchResponse> createVSwitch(CreateVSwitchRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<CreateVirtualBorderRouterResponse> createVirtualBorderRouter(CreateVirtualBorderRouterRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<CreateVpcResponse> createVpc(CreateVpcRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DeactivateRouterInterfaceResponse> deactivateRouterInterface(DeactivateRouterInterfaceRequest request);

    /**
      * $.parameters[4].schema.description
      *
     */
    CompletableFuture<DeleteActivationResponse> deleteActivation(DeleteActivationRequest request);

    CompletableFuture<DeleteAutoProvisioningGroupResponse> deleteAutoProvisioningGroup(DeleteAutoProvisioningGroupRequest request);

    CompletableFuture<DeleteAutoSnapshotPolicyResponse> deleteAutoSnapshotPolicy(DeleteAutoSnapshotPolicyRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DeleteBandwidthPackageResponse> deleteBandwidthPackage(DeleteBandwidthPackageRequest request);

    CompletableFuture<DeleteCommandResponse> deleteCommand(DeleteCommandRequest request);

    CompletableFuture<DeleteDedicatedHostClusterResponse> deleteDedicatedHostCluster(DeleteDedicatedHostClusterRequest request);

    /**
      * @deprecated
      * >  This operation is in internal preview and has not been officially released. We recommend that you avoid using this operation.
      *
     */
    CompletableFuture<DeleteDemandResponse> deleteDemand(DeleteDemandRequest request);

    CompletableFuture<DeleteDeploymentSetResponse> deleteDeploymentSet(DeleteDeploymentSetRequest request);

    CompletableFuture<DeleteDiagnosticMetricSetsResponse> deleteDiagnosticMetricSets(DeleteDiagnosticMetricSetsRequest request);

    /**
      * You can call this operation to delete the diagnostic reports that are no longer needed.
      *
     */
    CompletableFuture<DeleteDiagnosticReportsResponse> deleteDiagnosticReports(DeleteDiagnosticReportsRequest request);

    /**
      * When you call this operation, take note of the following items:
      * *   Manual snapshots of the disk are retained.
      * *   You can call the [ModifyDiskAttribute](~~25517~~) operation to configure whether to retain automatic snapshots of the disk or release the snapshots along with the disk. We recommend that you delete the snapshots that are no longer needed to maintain a sufficient quota for new automatic snapshots.
      * *   The disk must be in the Unattached (Available) state.
      * *   If the specified DiskId parameter does not exist, the request is ignored.
      *
     */
    CompletableFuture<DeleteDiskResponse> deleteDisk(DeleteDiskRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DeleteForwardEntryResponse> deleteForwardEntry(DeleteForwardEntryRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DeleteHaVipResponse> deleteHaVip(DeleteHaVipRequest request);

    CompletableFuture<DeleteHpcClusterResponse> deleteHpcCluster(DeleteHpcClusterRequest request);

    CompletableFuture<DeleteImageResponse> deleteImage(DeleteImageRequest request);

    /**
      * Only custom image components can be deleted.
      *
     */
    CompletableFuture<DeleteImageComponentResponse> deleteImageComponent(DeleteImageComponentRequest request);

    /**
      * If an image build task based on an image template is in the BUILDING, DISTRIBUTING, RELEASING, or CANCELLING state, you cannot delete the image template. You can delete the image template only when the image build task is in the SUCCESS, FAILED, or CANCELLED state. You can call the DescribeImagePipelineExecutions operation to query the details of an image build task.
      *
     */
    CompletableFuture<DeleteImagePipelineResponse> deleteImagePipeline(DeleteImagePipelineRequest request);

    /**
      * ## [](#)Usage notes
      * *   After an ECS instance is released, all the physical resources used by the instance are recycled. Relevant data is erased and cannot be restored.
      * *   When you release an ECS instance, take note of the following items for the disks attached to the instance:
      *     *   The disks for which `DeleteWithInstance` is set to false are retained as pay-as-you-go disks after the instance is released.
      *     *   The disks for which `DeleteWithInstance` is set to true are released along with the instance.
      *     *   For disks for which `DeleteAutoSnapshot` is set to false, the automatic snapshots of the disks are retained after the instance is released.
      *     *   For disks for which `DeleteAutoSnapshot` is set to true, the automatic snapshots of the disks are released along with the instance.
      *     *   Manual snapshots of the disks are retained.
      *     *   If `OperationLocks` in the response contains `"LockReason" : "security"` when you query the information of the instance, the instance is locked for security reasons. In this case, even if `DeleteWithInstance` is set to `false` for the disks that are attached to the instance, the system ignores the DeleteWithInstance value and releases the disks along with the instance. For more information, see [API behavior when an instance is locked for security reasons](~~25695~~).
      *
     */
    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    /**
      * ## [](#)Usage notes
      * *   After an ECS instance is released, all the physical resources used by the instance are recycled. Relevant data is erased and cannot be restored.
      * *   When you release an ECS instance, take note of the following items for the disks attached to the instance:
      *     *   The disks for which `DeleteWithInstance` is set to false are retained as pay-as-you-go disks after the instance is released.
      *     *   The disks for which `DeleteWithInstance` is set to true are released along with the instance.
      *     *   If `DeleteAutoSnapshot` is set to false for a disk attached to the instance, the automatic snapshots of the disk are retained when the instance is released.
      *     *   If `DeleteAutoSnapshot` is set to true for a disk attached to the instance, the automatic snapshots of the disk are released along with the instance.
      *     *   Manual snapshots of the disks are retained.
      *     *   If `OperationLocks` in the response contains `"LockReason" : "security"` when you query the information of the instance, the instance is locked for security reasons. In this case, even if `DeleteWithInstance` is set to `false` for the disks that are attached to the instance, the system ignores the DeleteWithInstance value and releases the disks along with the instance. For more information, see [API behavior when an instance is locked for security reasons](~~25695~~).
      *
     */
    CompletableFuture<DeleteInstancesResponse> deleteInstances(DeleteInstancesRequest request);

    /**
      * When you call this operation, take note of the following items:
      * *   After an SSH key pair is deleted, you cannot query the SSH key pair by calling the [DescribeKeyPairs](~~51773~~) operation.
      * *   If an SSH key pair is bound to one or more Elastic Compute Service (ECS) instances, the SSH key pair cannot be deleted.
      *
     */
    CompletableFuture<DeleteKeyPairsResponse> deleteKeyPairs(DeleteKeyPairsRequest request);

    CompletableFuture<DeleteLaunchTemplateResponse> deleteLaunchTemplate(DeleteLaunchTemplateRequest request);

    CompletableFuture<DeleteLaunchTemplateVersionResponse> deleteLaunchTemplateVersion(DeleteLaunchTemplateVersionRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DeleteNatGatewayResponse> deleteNatGateway(DeleteNatGatewayRequest request);

    /**
      * Take note of the following items:
      * *   The ENI to be deleted must be in the Available state.
      * *   If the ENI to be deleted is attached to an Elastic Compute Service (ECS) instance, you must detach the ENI from the instance before you can delete the ENI. To detach the ENI, you can call the [DetachNetworkInterface](~~58514~~) operation.
      * *   After an ENI is deleted, the following situations occur:
      *     *   All private IP addresses (including primary and secondary private IP addresses) of the ENI are automatically released.
      *     *   The ENI is automatically removed from all security groups.
      * *   The DeleteNetworkInterface operation is an asynchronous operation. After this operation is called to delete an ENI, you can check the status or events of the ENI to determine whether the ENI is deleted. The following figure shows the transitions between the states of the ENI.![](https://static-aliyun-doc.oss-cn-hangzhou.aliyuncs.com/file-manage-files/zh-CN/20221208/xual/DeleteNetworkInterface.jpg)
      *     *   If the ENI is in the Deleting state, the ENI deletion request is sent and the ENI is being deleted.
      *     *   If the ENI is not found, the ENI is deleted.
      *     *   If the ENI is stuck in the Deleting state, the ENI fails to be deleted. You can re-initiate the request to delete the ENI.
      * **For information about examples on how to call the DeleteNetworkInterface operation, see **[Delete an ENI](~~471553~~).
      *
     */
    CompletableFuture<DeleteNetworkInterfaceResponse> deleteNetworkInterface(DeleteNetworkInterfaceRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DeleteNetworkInterfacePermissionResponse> deleteNetworkInterfacePermission(DeleteNetworkInterfacePermissionRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DeletePhysicalConnectionResponse> deletePhysicalConnection(DeletePhysicalConnectionRequest request);

    /**
      * If a prefix list is associated with resources, you cannot delete the prefix list. You must disassociate the prefix list from the resources before you delete the prefix list. You can call the [DescribePrefixListAssociations](~~204724~~) operation to query resources that are associated with a specific prefix list.
      *
     */
    CompletableFuture<DeletePrefixListResponse> deletePrefixList(DeletePrefixListRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DeleteRouteEntryResponse> deleteRouteEntry(DeleteRouteEntryRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DeleteRouterInterfaceResponse> deleteRouterInterface(DeleteRouterInterfaceRequest request);

    /**
      * ## [](#)Usage notes
      * Take note of the following items:
      * *   Before you delete a security group, make sure that the security group does not contain instances and is not referenced by other security groups. Otherwise, the DeleteSecurityGroup request fails. You can call the [DescribeSecurityGroupReferences](~~57320~~) operation to query the reference details of the security group.
      * *   If the InvalidOperation.DeletionProtection error code is returned when you call the DeleteSecurityGroup operation to delete a security group or if a deletion protection-related message appears when you delete a security group in the Elastic Compute Service (ECS) console, the deletion protection feature is enabled for the security group. When you create a Container Service for Kubernetes (ACK) cluster, the deletion protection feature is enabled for an associated security group to prevent accidental deletion. You cannot manually disable the deletion protection feature for the security group. The deletion protection feature can be automatically disabled only after the ACK cluster is deleted. For more information, see [Disable deletion protection for a security group](~~353191~~).
      *
     */
    CompletableFuture<DeleteSecurityGroupResponse> deleteSecurityGroup(DeleteSecurityGroupRequest request);

    /**
      * Take note of the following items:
      * *   If the snapshot does not exist, the request is ignored.
      * *   If the snapshot has been used to create custom images, the snapshot cannot be deleted. You need to call the [DeleteImage](~~25537~~) operation to delete the custom images before you can delete the snapshot.
      * *   If the snapshot has been used to create disks and `Force` is not specified or is set to `false`, the snapshot cannot be deleted directly. If you want to delete the snapshot, set `Force` to true to forcibly delete the snapshot. The disks created from the snapshot cannot be re-initialized after the snapshot is forcibly deleted.
      *
     */
    CompletableFuture<DeleteSnapshotResponse> deleteSnapshot(DeleteSnapshotRequest request);

    /**
      * If you have custom images that were created from a disk snapshot contained in a snapshot-consistent group, the disk snapshot is retained when the snapshot-consistent group is deleted. Before you can delete the disk snapshot, you must call the [DeleteImage](~~25537~~) operation to delete the custom images. After the custom images are deleted, you can call the [DeleteSnapshot](~~25525~~) operation to delete the disk snapshot.
      *
     */
    CompletableFuture<DeleteSnapshotGroupResponse> deleteSnapshotGroup(DeleteSnapshotGroupRequest request);

    CompletableFuture<DeleteStorageSetResponse> deleteStorageSet(DeleteStorageSetRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DeleteVSwitchResponse> deleteVSwitch(DeleteVSwitchRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DeleteVirtualBorderRouterResponse> deleteVirtualBorderRouter(DeleteVirtualBorderRouterRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DeleteVpcResponse> deleteVpc(DeleteVpcRequest request);

    CompletableFuture<DeregisterManagedInstanceResponse> deregisterManagedInstance(DeregisterManagedInstanceRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribeAccessPointsResponse> describeAccessPoints(DescribeAccessPointsRequest request);

    /**
      * After you [create](https://account.alibabacloud.com/register/intl_register.htm) an Alibaba Cloud account, you can create a specific number of ECS instances in different regions within the account. For more information, see [Limits](~~25412~~).
      * You can apply for a quota increase in the [Quota Center console](https://quotas.console.aliyun.com/products).
      *
     */
    CompletableFuture<DescribeAccountAttributesResponse> describeAccountAttributes(DescribeAccountAttributesRequest request);

    /**
      * You can use one of the following methods to check the responses:
      * - Method 1: When you call the DescribeActivations operation to retrieve the first page of results during a paged query, use MaxResults to specify the maximum number of entries to return in the call. The return value of NextToken is a pagination token, which you can use in the next request to retrieve a new page of results. When you call the DescribeActivations operation to retrieve a new page of results, set NextToken to the NextToken value returned in the previous call and use MaxResults to specify the maximum number of entries to return in this call.
      * - Method 2: Use PageSize to specify the number of entries to return on each page, and then use PageNumber to specify the number of the page to return. You can use only one of the preceding methods. If you specify MaxResults or NextToken, the PageSize and PageNumber request parameters do not take effect and the TotalCount response parameter is invalid.
      *
     */
    CompletableFuture<DescribeActivationsResponse> describeActivations(DescribeActivationsRequest request);

    CompletableFuture<DescribeAutoProvisioningGroupHistoryResponse> describeAutoProvisioningGroupHistory(DescribeAutoProvisioningGroupHistoryRequest request);

    CompletableFuture<DescribeAutoProvisioningGroupInstancesResponse> describeAutoProvisioningGroupInstances(DescribeAutoProvisioningGroupInstancesRequest request);

    CompletableFuture<DescribeAutoProvisioningGroupsResponse> describeAutoProvisioningGroups(DescribeAutoProvisioningGroupsRequest request);

    CompletableFuture<DescribeAutoSnapshotPolicyExResponse> describeAutoSnapshotPolicyEx(DescribeAutoSnapshotPolicyExRequest request);

    /**
      * The value of the `DestinationResource` parameter determines whether you need to specify additional parameters. The following sequence provides the order by which resources are filtered. You cannot query a higher order resource by specifying a lower order resource.
      * *   Sequence: `Zone > IoOptimized > InstanceType = Network = ddh > SystemDisk > DataDisk`
      * *   Examples:
      *     *   If you set `DestinationResource` to `DataDisk`, you must specify the `InstanceType` parameter or set the `ResourceType` parameter to `disk`.
      *     *   If you set `DestinationResource` to `SystemDisk`, you must specify the `InstanceType` parameter.
      *     *   If you set `DestinationResource` to `InstanceType`, you must specify the `IoOptimized` and `InstanceType` parameters.
      *     *   If you want to query available ecs.g5.large resources in all zones of the China (Hangzhou) region, you must set RegionId to cn-hangzhou, DestinationResource to InstanceType, IoOptimized to optimized, and InstanceType to ecs.g5.large.``
      *     *   If you want to query the zones where ecs.g5.large resources are available in the China (Hangzhou) region, you must set RegionId to cn-hangzhou, DestinationResource to Zone, IoOptimized to optimized, and InstanceType to ecs.g5.large.``
      *
     */
    CompletableFuture<DescribeAvailableResourceResponse> describeAvailableResource(DescribeAvailableResourceRequest request);

    CompletableFuture<DescribeBandwidthLimitationResponse> describeBandwidthLimitation(DescribeBandwidthLimitationRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribeBandwidthPackagesResponse> describeBandwidthPackages(DescribeBandwidthPackagesRequest request);

    CompletableFuture<DescribeCapacityReservationInstancesResponse> describeCapacityReservationInstances(DescribeCapacityReservationInstancesRequest request);

    CompletableFuture<DescribeCapacityReservationsResponse> describeCapacityReservations(DescribeCapacityReservationsRequest request);

    /**
      * Take note of the following items:
      * *   This operation applies only to instances that reside in the classic network.
      * *   You can query a maximum of 100 instances that reside in the classic network at a time.
      * *   At least one of the `VpcId` and `InstanceId` parameters must be configured.
      *
     */
    CompletableFuture<DescribeClassicLinkInstancesResponse> describeClassicLinkInstances(DescribeClassicLinkInstancesRequest request);

    CompletableFuture<DescribeCloudAssistantSettingsResponse> describeCloudAssistantSettings(DescribeCloudAssistantSettingsRequest request);

    /**
      * - Before you run commands on or send files to instances, especially new instances, we recommend that you query the status of Cloud Assistant on the instances by calling this operation and checking the return value of CloudAssistantStatus. Run commands on or send files to the instances only when the return value is true.
      * - You can use one of the following methods to check the responses:
      *   - Method 1: When you call the DescribeCloudAssistantStatus operation to retrieve the first page of results during a paged query, use MaxResults to specify the maximum number of entries to return in the call. The return value of NextToken is a pagination token, which you can use in the next request to retrieve a new page of results. When you call the DescribeCloudAssistantStatus operation to retrieve a new page of results, set NextToken to the NextToken value returned in the previous call and set MaxResults to specify the maximum number of entries to return in this call. 
      *   - Method 2: Use PageSize to specify the number of entries to return on each page and then use PageNumber to specify the number of the page to return. You can use only one of the preceding methods. If you specify MaxResults or NextToken, the PageSize and PageNumber request parameters do not take effect and the TotalCount response parameter is invalid.
      *
     */
    CompletableFuture<DescribeCloudAssistantStatusResponse> describeCloudAssistantStatus(DescribeCloudAssistantStatusRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribeClustersResponse> describeClusters(DescribeClustersRequest request);

    /**
      * If you specify only the `Action` and `RegionId` parameters, all the available commands (`CommandId`) that you created in the specified region are queried by default. 
      * You can use one of the following methods to check the responses:
      * - Method 1: During a paged query, when you call the DescribeCommands operation to retrieve the first page of results, set MaxResults to specify the maximum number of entries to return in the call. The return value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. When you call the DescribeCommands operation to retrieve a new page of results, set NextToken to the NextToken value returned in the previous call and set MaxResults to specify the maximum number of entries to return in this call. 
      * - Method 2: Use PageSize to specify the number of entries to return on each page and then use PageNumber to specify the number of the page to return. You can use only one of the preceding methods. If you specify MaxResults or NextToken, the PageSize and PageNumber request parameters do not take effect and the TotalCount response parameter is invalid.
      *
     */
    CompletableFuture<DescribeCommandsResponse> describeCommands(DescribeCommandsRequest request);

    CompletableFuture<DescribeDedicatedHostAutoRenewResponse> describeDedicatedHostAutoRenew(DescribeDedicatedHostAutoRenewRequest request);

    /**
      * You can specify multiple request parameters to be queried. Specified parameters have logical AND relations. Only the specified parameters are included in the filter conditions. However, if `DedicatedHostClusterIds` is set to an empty JSON array (`[]`), it is regarded as a valid filter condition and an empty result is returned.
      *
     */
    CompletableFuture<DescribeDedicatedHostClustersResponse> describeDedicatedHostClusters(DescribeDedicatedHostClustersRequest request);

    CompletableFuture<DescribeDedicatedHostTypesResponse> describeDedicatedHostTypes(DescribeDedicatedHostTypesRequest request);

    /**
      * ## [](#)Usage notes
      * You can use one of the following methods to query the information about dedicated hosts:
      * *   Specify `DedicatedHostIds` to query the details of specified dedicated hosts.
      * *   Specify `DedicatedHostClusterId` to query the details of dedicated hosts in a dedicated host cluster.
      *
     */
    CompletableFuture<DescribeDedicatedHostsResponse> describeDedicatedHosts(DescribeDedicatedHostsRequest request);

    /**
      * @deprecated
      * You can call this operation to query the details of resources that you filed with Alibaba Cloud, including the types, delivery status, and consumption details of the resources.
      * By default, the demands for I/O optimized instances of the Virtual Private Cloud (VPC) type are queried.
      * For information about how to create (CreateDemand), modify (ModifyDemand), and delete (DeleteDemand) demands for ECS resources, contact your account manager.
      *
     */
    CompletableFuture<DescribeDemandsResponse> describeDemands(DescribeDemandsRequest request);

    /**
      * ## [](#)Usage notes
      * For information about instance families, see [Overview of instance families](~~25378~~).
      *
     */
    CompletableFuture<DescribeDeploymentSetSupportedInstanceTypeFamilyResponse> describeDeploymentSetSupportedInstanceTypeFamily(DescribeDeploymentSetSupportedInstanceTypeFamilyRequest request);

    CompletableFuture<DescribeDeploymentSetsResponse> describeDeploymentSets(DescribeDeploymentSetsRequest request);

    CompletableFuture<DescribeDiagnosticMetricSetsResponse> describeDiagnosticMetricSets(DescribeDiagnosticMetricSetsRequest request);

    CompletableFuture<DescribeDiagnosticMetricsResponse> describeDiagnosticMetrics(DescribeDiagnosticMetricsRequest request);

    CompletableFuture<DescribeDiagnosticReportAttributesResponse> describeDiagnosticReportAttributes(DescribeDiagnosticReportAttributesRequest request);

    CompletableFuture<DescribeDiagnosticReportsResponse> describeDiagnosticReports(DescribeDiagnosticReportsRequest request);

    /**
      * ## [](#)Usage notes
      * You can query the following monitoring data of a disk: the read IOPS, write IOPS, read bandwidth (byte/s), write bandwidth (byte/s), read latency (microseconds), and write latency (microseconds).
      * Take note of the following items:
      * *   You can query the monitoring data only of the disks that are in the In Use (`In_Use`) state. For more information, see [Disk states](~~25689~~).
      *     **
      *     **Note** Some information may be missing from the monitoring data of a disk because the disk is not in the In Use (`In_Use`) state and the system cannot obtain the relevant information.
      * *   Up to 400 monitoring data entries can be returned at a time. Make sure that the `TotalCount` value does not exceed 400. The value is calculated by using the following formula: `TotalCount = (EndTime - StartTime)/Period`. If the TotalCount value is greater than 400, the `InvalidParameter.TooManyDataQueried` error is returned.
      * *   You can query the monitoring data in the last 30 days. If the value of `StartTime` is more than 30 days earlier than the current time, an error is returned.
      *
     */
    CompletableFuture<DescribeDiskMonitorDataResponse> describeDiskMonitorData(DescribeDiskMonitorDataRequest request);

    /**
      * ### [](#)Usage notes
      * *   You can specify multiple request parameters such as `RegionId`, `ZoneId`, `DiskIds`, and `InstanceId` as filters. The specified parameters are evaluated by using the "AND" operator. If you specify more than one filter, the records that match all filters are returned.
      * *   The value of `DiskIds` is a JSON array. If you do not specify DiskIds, the parameter is not used as a filter condition. If you set `DiskIds` to an empty JSON array, the parameter is regarded as a valid filter, and an empty result is returned.
      * *   You can use one of the following methods to check the responses:
      *     *   Method 1: Use `NextToken` to specify the pagination token. Set the value to the `NextToken` value that is obtained from the previous query. Then, use `MaxResults` to specify the maximum number of entries to return on each page.
      *     *   Method 2: Use `PageSize` to specify the number of entries to return on each page, and then use `PageNumber` to specify the number of the page to return.
      *     You can use only one of the preceding methods. If a large number of entries are to be returned, we recommend that you use Method 1. If `NextToken` is specified, `PageSize` and `PageNumber` do not take effect and `TotalCount` in the response is invalid.
      * *   You can attach a disk for which the multi-attach feature is enabled to multiple instances. You can query the attachment information of the disk based on the `Attachment` values in the response.
      * When you call an API operation by using Alibaba Cloud CLI, you must specify request parameter values of different data types in the required formats. For more information, see [Parameter format overview](~~110340~~).
      *
     */
    CompletableFuture<DescribeDisksResponse> describeDisks(DescribeDisksRequest request);

    /**
      * *   The full status information about an EBS device includes the lifecycle status specified by the `Status` parameter, health status specified by the `HealthStatus` parameter, and event type specified by the `EventType` parameter of the EBS device. You can filter the results based on these parameters.
      * *   The release time, scheduled execution time, and actual execution time of each EBS device event are identical. If you specify a period of time by using the `EventTime.Start` and `EventTime.End` parameters, all events that occurred within this period are queried. You can query events that occurred within the last seven days.
      *
     */
    CompletableFuture<DescribeDisksFullStatusResponse> describeDisksFullStatus(DescribeDisksFullStatusRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribeEipAddressesResponse> describeEipAddresses(DescribeEipAddressesRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribeEipMonitorDataResponse> describeEipMonitorData(DescribeEipMonitorDataRequest request);

    /**
      * When an elasticity assurance expires, data about the association between the instances and the private pool generated by the elasticity assurance becomes invalid. When you call this operation to query the expired elasticity assurance, no value is returned.
      *
     */
    CompletableFuture<DescribeElasticityAssuranceInstancesResponse> describeElasticityAssuranceInstances(DescribeElasticityAssuranceInstancesRequest request);

    CompletableFuture<DescribeElasticityAssurancesResponse> describeElasticityAssurances(DescribeElasticityAssurancesRequest request);

    /**
      * ## [](#)Usage notes
      * The monitoring data of a secondary ENI includes the amount of traffic sent and received over the internal network, the number of packets sent and received by the secondary ENI, and the number of sent and received packets that are dropped by the secondary ENI. Specific information may be missing from the returned monitoring data. This may be because the system cannot obtain the relevant information. For example, if the instance to which the secondary ENI is attached is in the Stopped state or if the secondary ENI is not attached to an instance and is in the Available state, the monitoring data of the secondary ENI cannot be obtained. Take note of the following items:
      * *   Up to 400 monitoring data entries can be returned at a time. Make sure that the `TotalCount` value does not exceed 400. The value is calculated by using the following formula: `TotalCount = (EndTime - StartTime)/Period`. If the TotalCount value is greater than 400, the `InvalidParameter.TooManyDataQueried` error is returned.
      * *   You can query the monitoring data in the last 30 days. If the value of `StartTime` is more than 30 days earlier than the current time, an error is returned.
      *
     */
    CompletableFuture<DescribeEniMonitorDataResponse> describeEniMonitorData(DescribeEniMonitorDataRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribeForwardTableEntriesResponse> describeForwardTableEntries(DescribeForwardTableEntriesRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribeHaVipsResponse> describeHaVips(DescribeHaVipsRequest request);

    CompletableFuture<DescribeHpcClustersResponse> describeHpcClusters(DescribeHpcClustersRequest request);

    /**
      * You can use `NextToken` to configure the query token. Set the value to the `NextToken` value that is returned in the previous call to the DescribeImageComponents operation. Then, use `MaxResults` to specify the maximum number of entries to return on each page.
      *
     */
    CompletableFuture<DescribeImageComponentsResponse> describeImageComponents(DescribeImageComponentsRequest request);

    /**
      * ## Description
      * *   This API operation only returns the available custom images that are newly created in the specified image family. Public images, Alibaba Cloud Marketplace images, community images, or shared images are not queried.
      * *   If no available custom images exist in the specified image family, the response is empty.
      *
     */
    CompletableFuture<DescribeImageFromFamilyResponse> describeImageFromFamily(DescribeImageFromFamilyRequest request);

    /**
      * *   The image template that is specified by the `ImagePipelineId` parameter cannot be a deleted image template. When an image template is deleted, the corresponding image creation task is deleted.
      * *   You must specify `ImagePipelineId` or `ExecutionId`.
      * *   You can configure the query token by using the `NextToken` parameter. Set the value of NextToken to the value of `NextToken` that was returned the last time you called the `DescribeImagePipelineExecutions` operation. Then, use the `MaxResults` parameter to specify the maximum number of entries to return on each page to query the details of the image creation task.
      *
     */
    CompletableFuture<DescribeImagePipelineExecutionsResponse> describeImagePipelineExecutions(DescribeImagePipelineExecutionsRequest request);

    /**
      * ## Description
      * You can use `NextToken` to configure the query token. Set the value to the `NextToken` value that is returned in the last call to the `DescribeImagePipelines` operation. Then, use `MaxResults` to specify the maximum number of entries to return on each page.
      *
     */
    CompletableFuture<DescribeImagePipelinesResponse> describeImagePipelines(DescribeImagePipelinesRequest request);

    CompletableFuture<DescribeImageSharePermissionResponse> describeImageSharePermission(DescribeImageSharePermissionRequest request);

    CompletableFuture<DescribeImageSupportInstanceTypesResponse> describeImageSupportInstanceTypes(DescribeImageSupportInstanceTypesRequest request);

    /**
      * ## [](#)Usage notes
      * *   You can query your custom images, public images provided by Alibaba Cloud, Alibaba Cloud Marketplace images, and shared images from other Alibaba Cloud accounts.
      * *   This is a paginated query. The response contains the total number of available images and the images on the returned page. By default,10 entries are displayed on each page.
      * *   When you call an API operation by using Alibaba Cloud CLI, you must specify request parameter values of different data types in the required formats. For more information, see [Parameter formats](~~110340~~).
      * *   If you set ImageOwnerAlias to system or others when you call the DescribeImages operation to query public images that are provided by Alibaba Cloud or shared images, Resource Access Management (RAM) policies are ignored in the request. For more information, see [RAM authorization](~~25497~~).
      *
     */
    CompletableFuture<DescribeImagesResponse> describeImages(DescribeImagesRequest request);

    /**
      * A private pool is generated after an elasticity assurance or a capacity reservation is created. The private pool is associated with information about the instances that are created by using the private pool. You can configure a private pool when you create an instance. This way, the instance matches the elasticity assurance or capacity reservation that is associated with the private pool.
      * When a private pool expires, data about the association between instances and the private pool becomes invalid. If you call this operation to query the information about the private pool, empty values are returned.
      *
     */
    CompletableFuture<DescribeInstanceAttachmentAttributesResponse> describeInstanceAttachmentAttributes(DescribeInstanceAttachmentAttributesRequest request);

    CompletableFuture<DescribeInstanceAttributeResponse> describeInstanceAttribute(DescribeInstanceAttributeRequest request);

    /**
      * *   Before you configure auto-renewal or manual renewal for subscription instances, you can query the auto-renewal status of the instances.
      * *   This operation is applicable to only subscription instances. An error is returned if you call this operation on pay-as-you-go instances.
      *
     */
    CompletableFuture<DescribeInstanceAutoRenewAttributeResponse> describeInstanceAutoRenewAttribute(DescribeInstanceAutoRenewAttributeRequest request);

    /**
      * *   You can query system events that were completed within the last 30 days. No limits apply to the time range for querying uncompleted system events.
      * *   You can also specify InstanceEventCycleStatus to query the system events that are in the Scheduled, Executing, or Inquiring state.
      *
     */
    CompletableFuture<DescribeInstanceHistoryEventsResponse> describeInstanceHistoryEvents(DescribeInstanceHistoryEventsRequest request);

    /**
      * This operation is used to query the specified maintenance policy of an instance, which contains the following maintenance attributes:
      * *   Maintenance window: the time period that you specify for maintenance.
      * *   Maintenance action: the action that you specify in response to instance shutdown.
      *
     */
    CompletableFuture<DescribeInstanceMaintenanceAttributesResponse> describeInstanceMaintenanceAttributes(DescribeInstanceMaintenanceAttributesRequest request);

    /**
      * *   Pricing information can be queried for unexpired subscription ECS instances only when you upgrade their configurations. The pricing information cannot be queried when the instance configurations are downgraded.
      * *   Pricing information cannot be queried for pay-as-you-go ECS instances when you change their configurations. Prices of existing pay-as-you-go ECS instances whose configurations are changed are the same as those of new pay-as-you-go instances. You can call the [DescribePrice](~~107829~~) operation to query the latest prices of ECS instances.
      * *   Before you upgrade the configurations of an instance, we recommend that you call the [DescribeResourcesModification](~~66187~~) operation to query the instance types available for configuration upgrades in a specified zone.
      *
     */
    CompletableFuture<DescribeInstanceModificationPriceResponse> describeInstanceModificationPrice(DescribeInstanceModificationPriceRequest request);

    /**
      * ## [](#)Usage notes
      * Take note of the following items:
      * *   Up to 400 monitoring data entries can be returned at a time. Make sure that the `TotalCount` value does not exceed 400. The value is calculated by using the following formula: `TotalCount = (EndTime - StartTime)/Period`. If the TotalCount value is greater than 400, the `InvalidParameter.TooManyDataQueried` error is returned.
      * *   You can query the monitoring data in the last 30 days. If the value of `StartTime` is more than 30 days earlier than the current time, an error is returned.
      * *   In some scenarios, such as when the instance is in the Stopped state, the system cannot obtain the relevant information and specific information may be missing from the returned monitoring data.
      * *   You cannot call this operation to obtain the CPU basic monitoring information of an ECS bare metal instance. To obtain the CPU monitoring information of an ECS bare metal instance, install the CloudMonitor agent on the instance. For more information, see [InstallCloudMonitor](~~183482~~).
      *
     */
    CompletableFuture<DescribeInstanceMonitorDataResponse> describeInstanceMonitorData(DescribeInstanceMonitorDataRequest request);

    /**
      * ## Description
      * When you call an API operation by using Alibaba Cloud CLI, you must specify request parameter values of different data types in required formats. For more information, see [Parameter format overview](~~110340~~).
      *
     */
    CompletableFuture<DescribeInstanceRamRoleResponse> describeInstanceRamRole(DescribeInstanceRamRoleRequest request);

    /**
      * *   For information about the lifecycle states of an ECS instance, see [Instance states](~~25687~~).
      * *   You can also call this operation to query the list of ECS instances.
      *
     */
    CompletableFuture<DescribeInstanceStatusResponse> describeInstanceStatus(DescribeInstanceStatusRequest request);

    CompletableFuture<DescribeInstanceTopologyResponse> describeInstanceTopology(DescribeInstanceTopologyRequest request);

    CompletableFuture<DescribeInstanceTypeFamiliesResponse> describeInstanceTypeFamilies(DescribeInstanceTypeFamiliesRequest request);

    /**
      * ## [](#)Usage notes
      * Take note of the following items:
      * *   MaxResults specifies the maximum number of entries per page. The maximum value of this parameter is changed from 1600 to 100. As of November 15, 2023, only 100 can be used as the maximum value of MaxResults. If you called the DescribeInstanceTypes operation in 2022, you can use 1600 as the maximum value before November 15, 2023. If you do not specify NextToken when you call the DescribeInstanceTypes operation, only the first page of results that contains up to 100 entries is returned. If you want to retrieve more results, specify NextToken to perform paged queries, or specify filter conditions to filter results.
      * *   We recommend that you specify MaxResults and NextToken to perform paged queries. The first time you call the DescribeInstanceTypes operation, set MaxResults to limit the maximum number of entries that can be returned in a single call. If the number of entries to return exceeds the specified MaxResults value, the response includes a NextToken value. You can set NextToken to the return value and specify MaxResults in your next request to DescribeInstanceTypes to retrieve the next page of results.
      * *   The DescribeInstanceTypes operation is used to query only the specifications and performance information of instance types. To query instance types that are available in a specific region, call the [DescribeAvailableResource](~~66186~~) operation.
      * *   To use special instance types such as instance types that are unavailable for purchase, [submit a ticket](https://workorder-intl.console.aliyun.com/#/ticket/createIndex).
      *
     */
    CompletableFuture<DescribeInstanceTypesResponse> describeInstanceTypes(DescribeInstanceTypesRequest request);

    /**
      * ## [](#)Usage notes
      * Take note of the following items:
      * *   The **keepalive** time of a connection to a VNC management terminal is 300 seconds. If you do not interact with the VNC management terminal for 300 seconds, the VNC management terminal is automatically disconnected.
      * *   If the connection is interrupted, you must recall this operation to obtain a new logon address that is specified by `VncUrl` and use the new logon address to construct a URL that can be used to reconnect to the VNC management terminal. You can reconnect to a VNC management terminal for a maximum of 30 times per minute.
      * *   You need to add the `vncUrl=\\*\\*\\*\\*`, `instanceId=\\*\\*\\*\\*`, and `isWindows=true/false` parameters to the end of the link `https://g.alicdn.com/aliyun/ecs-console-vnc2/0.0.8/index.html?` and use an ampersand (`&`) between the parameters.
      *     *   `vncUrl`: the value of `VncUrl` that is returned after a successful call of this operation.
      *     *   `instanceId`: the ID of your instance.
      *     *   `isWindows`: specifies whether the operating system of your instance is Windows. A value of `true` indicates that the operating system is Windows. A value of `false` indicates that the operating system is not Windows.
      * >  You can connect to an instance without a VNC logon password. Therefore, you do not need to configure the `password` parameter.
      * Sample URL:
      *     https://g.alicdn.com/aliyun/ecs-console-vnc2/0.0.8/index.html?vncUrl=ws%3A%2F%****&instanceId=i-wz9hhwq5a6tm****&isWindows=true
      *
     */
    CompletableFuture<DescribeInstanceVncUrlResponse> describeInstanceVncUrl(DescribeInstanceVncUrlRequest request);

    /**
      * * You can specify multiple request parameters to be queried. Specified parameters have logical AND relations. Only the specified parameters are included in the filter conditions. However, if InstanceIds is set to an empty JSON array, it is regarded as a valid filter condition and an empty result is returned.
      * * If you are using a Resource Access Management (RAM) user or RAM role that does not have the permissions to call this operation, an empty list is returned. You can include the `DryRun` parameter in your request to check whether the empty list is caused by lack of permissions.
      * * When you call an API operation by using Alibaba Cloud CLI, you must specify request parameter values of different data types in required formats. For more information, see [Parameter format overview](~~110340~~).
      * * You can use one of the following methods to check the responses:
      *     * Method 1: During a paged query, when you call the DescribeInstances operation to retrieve the first page of results, set `MaxResults` to specify the maximum number of entries to return in the call. The return value of `NextToken` is a pagination token, which can be used in the next call to retrieve a new page of results. When you call the DescribeInstances operation to retrieve a new page of results, set `NextToken` to the `NextToken` value returned in the previous call and set `MaxResults` to specify the maximum number of entries to return in this call.
      *     * Method 2: Use `PageSize` to specify the number of entries to return on each page and then use `PageNumber` to specify the number of the page to return.
      *         You can use only one of the preceding methods. If a large number of entries are to be returned, we recommend that you use method 1. When `MaxResults` or `NextToken` is specified, the `PageSize` and `PageNumber` request parameters do not take effect and the `TotalCount` response parameter is invalid.
      *
     */
    CompletableFuture<DescribeInstancesResponse> describeInstances(DescribeInstancesRequest request);

    /**
      * The response includes instance states and instance system events that are in the Scheduled state.
      * You can specify a period of time to query events that occurred within the period of time.
      *
     */
    CompletableFuture<DescribeInstancesFullStatusResponse> describeInstancesFullStatus(DescribeInstancesFullStatusRequest request);

    /**
      * ## [](#)Usage notes
      * *   After you run a command, the command may fail to run or may return unexpected results. You can call this operation to query the execution results of a command.
      * *   You can query information about command executions within the last four weeks. Up to 100,000 pieces of execution information can be retained.
      * *   You can use one of the following methods to check the responses:
      *     *   Method 1: During a paged query, when you call the DescribeInvocationResults operation to retrieve the first page of results, set `MaxResults` to specify the maximum number of entries to return in the call. The return value of `NextToken` is a pagination token, which can be used in the next request to retrieve a new page of results. When you call the DescribeInvocationResults operation to retrieve a new page of results, set `NextToken` to the `NextToken` value returned in the previous call and set `MaxResults` to specify the maximum number of entries to return in this call.
      *     *   Method 2: Use `PageSize` to specify the number of entries to return on each page and then use `PageNumber` to specify the number of the page to return. You can use only one of the preceding methods. If you specify `MaxResults` or `NextToken`, the `PageSize` and `PageNumber` request parameters do not take effect and the `TotalCount` response parameter is invalid.
      *
     */
    CompletableFuture<DescribeInvocationResultsResponse> describeInvocationResults(DescribeInvocationResultsRequest request);

    /**
      * ## [](#)Usage notes
      * *   After you run a command, the command may not succeed or return the expected results. You can call this operation to query the execution results.
      * *   You can query information about command executions within the last four weeks. Up to 100,000 pieces of execution information can be retained.
      * *   You can use one of the following methods to check the responses:
      *     *   Method 1: During a paged query, when you call the DescribeInvocations operation to retrieve the first page of results, use `MaxResults` to specify the maximum number of entries to return in the call. The return value of `NextToken` is a pagination token, which you can use in the next request to retrieve a new page of results. When you call the DescribeInvocations operation to retrieve a new page of results, set `NextToken` to the `NextToken` value returned in the previous call and set `MaxResults` to specify the maximum number of entries to return in this call.
      *     *   Method 2: Use `PageSize` to specify the number of entries to return on each page, and then use `PageNumber` to specify the number of the page to return. You can use only one of the preceding methods. If you specify `MaxResults` or `NextToken`, the `PageSize` and `PageNumber` request parameters do not take effect and the `TotalCount` response parameter is invalid.
      *
     */
    CompletableFuture<DescribeInvocationsResponse> describeInvocations(DescribeInvocationsRequest request);

    CompletableFuture<DescribeKeyPairsResponse> describeKeyPairs(DescribeKeyPairsRequest request);

    /**
      * ## Debugging
      * [OpenAPI Explorer automatically calculates the signature value. For your convenience, we recommend that you call this operation in OpenAPI Explorer. OpenAPI Explorer dynamically generates the sample code of the operation for different SDKs.](https://api.aliyun.com/#product=Ecs\\&api=DescribeLaunchTemplateVersions\\&type=RPC\\&version=2014-05-26)
      *
     */
    CompletableFuture<DescribeLaunchTemplateVersionsResponse> describeLaunchTemplateVersions(DescribeLaunchTemplateVersionsRequest request);

    CompletableFuture<DescribeLaunchTemplatesResponse> describeLaunchTemplates(DescribeLaunchTemplatesRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribeLimitationResponse> describeLimitation(DescribeLimitationRequest request);

    /**
      * You can use one of the following methods to check the responses:
      * - Method 1: When you call the DescribeInstances operation to retrieve the first page of results during a paged query, use MaxResults to specify the maximum number of entries to return in the call. The return value of NextToken is a pagination token, which you can use in the next request to retrieve a new page of results. When you call the DescribeInstances operation to retrieve a new page of results, set NextToken to the NextToken value returned in the previous call and use MaxResults to specify the maximum number of entries to return in the call.
      * - Method 2: Use PageSize to specify the number of entries to return on each page, and then use PageNumber to specify the number of the page to return. You can use only one of the preceding methods. If you specify MaxResults or NextToken, the PageSize and PageNumber request parameters do not take effect and the TotalCount response parameter is invalid.
      *
     */
    CompletableFuture<DescribeManagedInstancesResponse> describeManagedInstances(DescribeManagedInstancesRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribeNatGatewaysResponse> describeNatGateways(DescribeNatGatewaysRequest request);

    /**
      * ## Debugging
      * [OpenAPI Explorer automatically calculates the signature value. For your convenience, we recommend that you call this operation in OpenAPI Explorer. OpenAPI Explorer dynamically generates the sample code of the operation for different SDKs.](https://api.aliyun.com/#product=Ecs\\&api=DescribeNetworkInterfaceAttribute\\&type=RPC\\&version=2014-05-26)
      *
     */
    CompletableFuture<DescribeNetworkInterfaceAttributeResponse> describeNetworkInterfaceAttribute(DescribeNetworkInterfaceAttributeRequest request);

    CompletableFuture<DescribeNetworkInterfacePermissionsResponse> describeNetworkInterfacePermissions(DescribeNetworkInterfacePermissionsRequest request);

    /**
      * ## [](#)Usage notes
      * The `DescribeNetworkInterfaces` operation supports paged queries. During a paged query, when you call the DescribeNetworkInterfaces operation to retrieve the first page of results, set `MaxResults` to specify the maximum number of entries to return in the call. The return value of `NextToken` is a pagination token that can be used in the next call to retrieve a new page of results. When you call the DescribeNetworkInterfaces operation to retrieve a new page of results, set `NextToken` to the `NextToken` value returned in the previous call and set `MaxResults` to specify the maximum number of entries to return in this call.
      * >  If you specify `MaxResults` or `NextToken`, the system uses the preceding paged query method to return results. Otherwise, the system returns results based on the combination of `PageNumber` and `PageSize`.
      *
     */
    CompletableFuture<DescribeNetworkInterfacesResponse> describeNetworkInterfaces(DescribeNetworkInterfacesRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribeNewProjectEipMonitorDataResponse> describeNewProjectEipMonitorData(DescribeNewProjectEipMonitorDataRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribePhysicalConnectionsResponse> describePhysicalConnections(DescribePhysicalConnectionsRequest request);

    CompletableFuture<DescribePrefixListAssociationsResponse> describePrefixListAssociations(DescribePrefixListAssociationsRequest request);

    CompletableFuture<DescribePrefixListAttributesResponse> describePrefixListAttributes(DescribePrefixListAttributesRequest request);

    /**
      * ## Description
      * You can specify the `AddressFamily`, `PrefixListId.N`, and `PrefixListName` request parameters to be queried. Specified parameters have logical AND relations. Only the specified parameters are included in the filter conditions.
      *
     */
    CompletableFuture<DescribePrefixListsResponse> describePrefixLists(DescribePrefixListsRequest request);

    /**
      * *   The required parameters vary based on the type of resource whose prices you want to query.
      *     *   When `ResourceType` is set to instance, you must specify `InstanceType`.
      *     *   When `ResourceType` is set to disk, you must specify `DataDisk.1.Category` and `DataDisk.1.Size`. When `ResourceType` is set to disk, only pay-as-you-go prices of cloud disks are returned. In this case, `PriceUnit` can be set only to `Hour`.
      *     *   When `ResourceType` is set to ddh, you must specify `DedicatedHostType`.
      *     *   When `ResourceType` is set to ElasticityAssurance, you must specify `InstanceType`.
      *     *   When `ResourceType` is set to CapacityReservation, you must specify `InstanceType`.
      * *   When `ResourceType` is set to bandwidth, only the pay-by-traffic (`PayByTraffic`) prices of network usage is returned.
      * *   When `ResourceType` is set to instance, the prices of up to four data disks can be queried.
      * *   By default, `ChargeType` is set to `PostPaid`. You can specify `PriceUnit` to query the prices of ECS resources that have different billing cycles.
      *
     */
    CompletableFuture<DescribePriceResponse> describePrice(DescribePriceRequest request);

    CompletableFuture<DescribeRecommendInstanceTypeResponse> describeRecommendInstanceType(DescribeRecommendInstanceTypeRequest request);

    /**
      * ****
      *
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
      * *   You can call this operation to query the price for renewing a subscription instance for a specific period of time or to a synchronized expiration date.
      * *   Take note of the following items:
      *     *   If you specify only the required parameters, the price for renewing an instance for one month is queried by default.
      *     *   The renewal period-related parameter pair (`Period` and `PeriodUnit`) and the synchronized expiration date-related parameter (`ExpectedRenewDay`) are mutually exclusive. You cannot set these parameters together to query the prices for renewing a specified instance for a period of time and to a synchronized expiration date at the same time.
      *
     */
    CompletableFuture<DescribeRenewalPriceResponse> describeRenewalPrice(DescribeRenewalPriceRequest request);

    CompletableFuture<DescribeReservedInstanceAutoRenewAttributeResponse> describeReservedInstanceAutoRenewAttribute(DescribeReservedInstanceAutoRenewAttributeRequest request);

    CompletableFuture<DescribeReservedInstancesResponse> describeReservedInstances(DescribeReservedInstancesRequest request);

    CompletableFuture<DescribeResourceByTagsResponse> describeResourceByTags(DescribeResourceByTagsRequest request);

    /**
      * ## Debugging
      * [OpenAPI Explorer automatically calculates the signature value. For your convenience, we recommend that you call this operation in OpenAPI Explorer. OpenAPI Explorer dynamically generates the sample code of the operation for different SDKs.](https://api.aliyun.com/#product=Ecs\\&api=DescribeResourcesModification\\&type=RPC\\&version=2014-05-26)
      *
     */
    CompletableFuture<DescribeResourcesModificationResponse> describeResourcesModification(DescribeResourcesModificationRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribeRouteTablesResponse> describeRouteTables(DescribeRouteTablesRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribeRouterInterfacesResponse> describeRouterInterfaces(DescribeRouterInterfacesRequest request);

    CompletableFuture<DescribeSavingsPlanEstimationResponse> describeSavingsPlanEstimation(DescribeSavingsPlanEstimationRequest request);

    CompletableFuture<DescribeSavingsPlanPriceResponse> describeSavingsPlanPrice(DescribeSavingsPlanPriceRequest request);

    CompletableFuture<DescribeSecurityGroupAttributeResponse> describeSecurityGroupAttribute(DescribeSecurityGroupAttributeRequest request);

    /**
      * When you call this operation, take note of the following items:
      * *   A security group can be referenced by the inbound or outbound rules of other security groups.
      * *   Up to 100 entries can be returned each time.
      * *   If a security group cannot be deleted by calling the [DeleteSecurityGroup](~~25558~~) operation, you can call the DescribeSecurityGroupReferences operation to check whether the security group is referenced by the rules of other security groups. If the security group is referenced by the rules of other security groups, you must remove the reference before you can delete the security group.
      *
     */
    CompletableFuture<DescribeSecurityGroupReferencesResponse> describeSecurityGroupReferences(DescribeSecurityGroupReferencesRequest request);

    /**
      * ## [](#)Usage notes
      * Take note of the following items:
      * *   The basic information about security groups includes their IDs and descriptions. The response returns security groups in descending order of the IDs of the security groups.
      * *   We recommend that you use `MaxResults` and `NextToken` for a paged query. We recommend that you use `MaxResults` to specify the maximum number of entries to return for each request. The return value of `NextToken` is a pagination token, which can be used in the next request to retrieve a new page of results. When you call the DescribeSecurityGroups operation to retrieve a new page of results, set `NextToken` to the `NextToken` value that is returned in the previous call and set `MaxResults` to specify the maximum number of entries to return in this call. If the return value of `NextToken` is empty, the current page of results is the last page and no more results are to be returned.
      * *   When you use Alibaba Cloud CLI to call an API operation, you must specify request parameter values of different data types in required formats. For more information, see [Parameter format overview](~~110340~~).
      *
     */
    CompletableFuture<DescribeSecurityGroupsResponse> describeSecurityGroups(DescribeSecurityGroupsRequest request);

    /**
      * ## Usage notes
      * *   When you send a file, the file may fail to be sent to specified Elastic Compute Service (ECS) instances. You can call this operation to check the file sending results.
      * *   You can call this operation to query the file sending records within the last six weeks.
      * - You can use one of the following methods to check the responses:
      *   - Method 1: During a paged query, when you call the DescribeSendFileResults operation to retrieve the first page of results, set MaxResults to specify the maximum number of entries to return in the call. The return value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. When you call the DescribeSendFileResults operation to retrieve a new page of results, set NextToken to the NextToken value returned in the previous call and set MaxResults to specify the maximum number of entries to return in this call. 
      *   - Method 2: Use PageSize to specify the number of entries to return on each page and then use PageNumber to specify the number of the page to return. You can use only one of the preceding methods. If you specify MaxResults or NextToken, the PageSize and PageNumber request parameters do not take effect and the TotalCount response parameter is invalid.
      *
     */
    CompletableFuture<DescribeSendFileResultsResponse> describeSendFileResults(DescribeSendFileResultsRequest request);

    /**
      * ## [](#)Usage notes
      * You can specify multiple request parameters to be queried, such as `InstanceId`, `SnapshotGroupId.N`, and `Status.N`. Specified parameters have logical AND relations. Only the specified parameters are included in the filter conditions.
      *
     */
    CompletableFuture<DescribeSnapshotGroupsResponse> describeSnapshotGroups(DescribeSnapshotGroupsRequest request);

    /**
      * ## [](#)Usage notes
      * Take note of the following items:
      * *   You can specify multiple request parameters, such as `RegionId`, `DiskIds`, and `InstanceId`, to query snapshot chains. Specified parameters have logical AND relations.
      * *   Only the specified parameters are used as filter conditions. If the `DiskIds` and `SnapshotLinkIds` parameters are set to empty JSON arrays, the values are considered as valid filter conditions. In this case, an empty result is returned.
      *
     */
    CompletableFuture<DescribeSnapshotLinksResponse> describeSnapshotLinks(DescribeSnapshotLinksRequest request);

    /**
      * ## [](#)Usage notes
      * Take note of the following items:
      * *   Up to 400 monitoring data entries can be returned at a time. Make sure that the `TotalCount` value does not exceed 400. The value is calculated by using the following formula: `TotalCount = (EndTime - StartTime)/Period`. If the TotalCount value is greater than 400, the `InvalidParameter.TooManyDataQueried` error is returned.
      * *   You can query the monitoring data of snapshot sizes in the last 30 days. If the value of `StartTime` is more than 30 days earlier than the current time, an error is returned.
      *
     */
    CompletableFuture<DescribeSnapshotMonitorDataResponse> describeSnapshotMonitorData(DescribeSnapshotMonitorDataRequest request);

    CompletableFuture<DescribeSnapshotPackageResponse> describeSnapshotPackage(DescribeSnapshotPackageRequest request);

    /**
      * You can configure multiple request parameters such as `InstanceId`, `DiskId`, and `SnapshotIds` to query snapshots. Configured parameters have logical AND relations. Only the configured parameters are included in the filter conditions.
      * When you use Alibaba Cloud CLI to call an API operation, you must specify request parameter values of different data types in required formats. For more information, see [Parameter format overview](~~110340~~).
      *
     */
    CompletableFuture<DescribeSnapshotsResponse> describeSnapshots(DescribeSnapshotsRequest request);

    /**
      * ## [](#)Usage notes
      * If you want to view the snapshot usage of each disk in the current region, we recommend that you call the [DescribeSnapshotLinks](~~55837~~) operation to query snapshot chain information.
      *
     */
    CompletableFuture<DescribeSnapshotsUsageResponse> describeSnapshotsUsage(DescribeSnapshotsUsageRequest request);

    /**
      * *   You can call this operation to query information that is generated for preemptible instances in the last 30 days and select suitable instance types based on the query results. The information that you can query includes:
      *     *   Average release rate of preemptible instances
      *     *   Percentage of the average preemptible instance price relative to the pay-as-you-go instance price
      *     *   Average preemptible instance price that is calculated based on the preceding percentage
      * *   This operation is applicable only to I/O optimized preemptible instances that reside in virtual private clouds (VPCs).
      * *   You can use one of the following methods to query information that is generated for preemptible instances in the last 30 days:
      *     *   Configure `Cores` and `Memory` or `MinCores` and `MinMemory` to query information about an instance type that meets the specified vCPU and memory requirements.
      *     *   Configure the `InstanceTypes.N` parameter to query information about a specified instance type.
      *     *   Configure `Cores` and `Memory` or `MinCores` and `MinMemory`, and then configure `InstanceTypeFamily` or `InstanceFamilyLevel` to query information about an instance type that meets the specified vCPU and memory requirements within the specified instance family or at a specified instance family level.
      *
     */
    CompletableFuture<DescribeSpotAdviceResponse> describeSpotAdvice(DescribeSpotAdviceRequest request);

    CompletableFuture<DescribeSpotPriceHistoryResponse> describeSpotPriceHistory(DescribeSpotPriceHistoryRequest request);

    CompletableFuture<DescribeStorageCapacityUnitsResponse> describeStorageCapacityUnits(DescribeStorageCapacityUnitsRequest request);

    CompletableFuture<DescribeStorageSetDetailsResponse> describeStorageSetDetails(DescribeStorageSetDetailsRequest request);

    CompletableFuture<DescribeStorageSetsResponse> describeStorageSets(DescribeStorageSetsRequest request);

    /**
      * If a tag key that has no tag value is specified, all tags that contain the tag key are returned. If a tag key-value pair is specified, only tags that exactly match the key-value pair are returned.
      *
     */
    CompletableFuture<DescribeTagsResponse> describeTags(DescribeTagsRequest request);

    CompletableFuture<DescribeTaskAttributeResponse> describeTaskAttribute(DescribeTaskAttributeRequest request);

    /**
      * ## Debugging
      * [OpenAPI Explorer automatically calculates the signature value. For your convenience, we recommend that you call this operation in OpenAPI Explorer. OpenAPI Explorer dynamically generates the sample code of the operation for different SDKs.](https://api.aliyun.com/#product=Ecs\\&api=DescribeTasks\\&type=RPC\\&version=2014-05-26)
      *
     */
    CompletableFuture<DescribeTasksResponse> describeTasks(DescribeTasksRequest request);

    /**
      * You can query the session records of Session Manager that were generated in the last four weeks.
      *
     */
    CompletableFuture<DescribeTerminalSessionsResponse> describeTerminalSessions(DescribeTerminalSessionsRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribeUserBusinessBehaviorResponse> describeUserBusinessBehavior(DescribeUserBusinessBehaviorRequest request);

    /**
      * *   The returned custom data is encoded in Base64.
      * *   If no user data is configured for the ECS instance, an empty result is returned.
      *
     */
    CompletableFuture<DescribeUserDataResponse> describeUserData(DescribeUserDataRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribeVRoutersResponse> describeVRouters(DescribeVRoutersRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribeVSwitchesResponse> describeVSwitches(DescribeVSwitchesRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribeVirtualBorderRoutersResponse> describeVirtualBorderRouters(DescribeVirtualBorderRoutersRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribeVirtualBorderRoutersForPhysicalConnectionResponse> describeVirtualBorderRoutersForPhysicalConnection(DescribeVirtualBorderRoutersForPhysicalConnectionRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribeVpcsResponse> describeVpcs(DescribeVpcsRequest request);

    /**
      * When you call this operation, only a list of zones and some resource information of each zone are returned. If you want to query instance types and disk categories that are available for purchase in a specific zone, we recommend that you call the [DescribeAvailableResource](~~66186~~) operation.
      *
     */
    CompletableFuture<DescribeZonesResponse> describeZones(DescribeZonesRequest request);

    CompletableFuture<DetachClassicLinkVpcResponse> detachClassicLinkVpc(DetachClassicLinkVpcRequest request);

    /**
      * When you call this operation, take note of the following items:
      * *   The disk that you want to detach must be in the `In_Use` state.
      * *   The instance from which you want to detach a pay-as-you-go data disk must be in the **Running** or **Stopped** state.````
      * *   The instance from which you want to detach a system disk must be in the **Stopped** state.``
      * *   If the `OperationLocks` parameter in the response contains `"LockReason" : "security"`, the instance is locked for security reasons and no operations are allowed on the instance.
      * *   DetachDisk is an asynchronous operation. After you call the operation, a disk is detached from an instance in approximately 1 minute.
      *
     */
    CompletableFuture<DetachDiskResponse> detachDisk(DetachDiskRequest request);

    CompletableFuture<DetachInstanceRamRoleResponse> detachInstanceRamRole(DetachInstanceRamRoleRequest request);

    /**
      * When you call this operation, take note of the following items:
      * *   After you unbind an SSH key pair from an instance, you must call the [RebootInstance](~~25502~~) operation to restart the instance to allow the unbind operation to take effect.
      * *   After you unbind an SSH key pair from an instance, the username and password authentication method is selected for the instance.
      *
     */
    CompletableFuture<DetachKeyPairResponse> detachKeyPair(DetachKeyPairRequest request);

    /**
      * Take note of the following items:
      * *   You cannot detach the primary ENI of an instance.
      * *   Make sure that the ENI to be detached is in the Detaching (Unbinding) or InUse (Bound) state.
      * *   Make sure that the instance from which you want to detach an ENI is in the Running (Running) or Stopped (Stopped) state.
      * *   The DetachNetworkInterface operation is an asynchronous operation. After this operation is called to detach an ENI, you can check the status or events of the ENI to determine whether the ENI is detached. The following figure shows the transitions between the states of the ENI.![](https://help-static-aliyun-doc.aliyuncs.com/file-manage-files/en-US/20230223/uemr/DetachNetworkInterface.png)
      *     *   If the ENI is in the Detaching state, the ENI detachment request is sent and the ENI is being detached from the associated instance.
      *     *   If the ENI is in the Available state, the ENI is detached from the associated instance.
      *     *   If the ENI is stuck in the Detaching state, the ENI may fail to be detached from the associated instance due to specific reasons. For example, the ENI may fail to be detached because the operating system of the instance did not respond to the ENI detachment request. If this issue occurs, you can re-initiate the request to detach the ENI. If the issue persists, restart the instance.
      * For information about examples on how to call the DetachNetworkInterface operation, see [Detach an ENI from an ECS instance](~~471551~~).
      *
     */
    CompletableFuture<DetachNetworkInterfaceResponse> detachNetworkInterface(DetachNetworkInterfaceRequest request);

    /**
      * The region ID. The following regions are supported: China (Qingdao), China (Beijing), China (Zhangjiakou), China (Hohhot), China (Hangzhou), China (Shanghai), China (Shenzhen), China (Heyuan), and China (Hong Kong).
      * You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
      *
     */
    CompletableFuture<DisableActivationResponse> disableActivation(DisableActivationRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<EipFillParamsResponse> eipFillParams(EipFillParamsRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<EipFillProductResponse> eipFillProduct(EipFillProductRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<EipNotifyPaidResponse> eipNotifyPaid(EipNotifyPaidRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<EnablePhysicalConnectionResponse> enablePhysicalConnection(EnablePhysicalConnectionRequest request);

    /**
      * ## [](#)Usage notes
      * Before you export images, take note of the following items:
      * *   Make sure that you are familiar with the prerequisites and precautions. For more information, see [Export a custom image](~~58181~~).
      * *   The `ImageFormat` parameter is available only for the following regions: India (Mumbai), Japan (Tokyo), Australia (Sydney), Indonesia (Jakarta), Germany (Frankfurt), UAE (Dubai), US (Virginia), UK (London), Singapore, Malaysia (Kuala Lumpur), and US (Silicon Valley). By default, custom images are exported in the RAW format in regions where ImageFormat is unsupported.
      * *   Use Resource Access Management (RAM) to grant Elastic Compute Service (ECS) the permissions to write data to OSS. To complete the authorization, perform the following operations:
      *     *   Create a role named `AliyunECSImageExportDefaultRole`, and attach the following policy to the role:
      *                {
      *                  "Statement": [
      *                    {
      *                      "Action": "sts:AssumeRole",
      *                      "Effect": "Allow",
      *                      "Principal": {
      *                        "Service": [
      *                          "ecs.aliyuncs.com"
      *                        ]
      *                      }
      *                    }
      *                  ],
      *                  "Version": "1"
      *                }
      *     *   Attach the `AliyunECSImageExportRolePolicy` system policy to the `AliyunECSImageExportDefaultRole` role. This policy is the default policy that grants ECS the permissions to export images. For more information, go to the [Cloud Resource Access Authorization](https://ram.console.aliyun.com/?spm=5176.2020520101.0.0.64c64df5dfpmdY#/role/authorize?request=%7B%22Requests%22:%20%7B%22request1%22:%20%7B%22RoleName%22:%20%22AliyunECSImageImportDefaultRole%22,%20%22TemplateId%22:%20%22ECSImportRole%22%7D,%20%22request2%22:%20%7B%22RoleName%22:%20%22AliyunECSImageExportDefaultRole%22,%20%22TemplateId%22:%20%22ECSExportRole%22%7D%7D,%20%22ReturnUrl%22:%20%22https:%2F%2Fecs.console.aliyun.com%2F%22,%20%22Service%22:%20%22ECS%22%7D) page. You can also create a custom policy that contains the following content and attach the policy to the role:
      *                  {
      *                    "Version": "1",
      *                    "Statement": [
      *                      {
      *                        "Action": [
      *                          "oss:GetObject",
      *                          "oss:PutObject",
      *                          "oss:DeleteObject",
      *                          "oss:GetBucketLocation",
      *                          "oss:GetBucketInfo",
      *                          "oss:AbortMultipartUpload",
      *                          "oss:ListMultipartUploads",
      *                          "oss:ListParts"
      *                        ],
      *                        "Resource": "*",
      *                        "Effect": "Allow"
      *                      }
      *                    ]
      *                  }
      * After you export the images, take note of the following items:
      * Each exported custom image is stored in the specified OSS bucket. You can download the custom image. For more information, see [Download objects](~~31912~~).
      *
     */
    CompletableFuture<ExportImageResponse> exportImage(ExportImageRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ExportSnapshotResponse> exportSnapshot(ExportSnapshotRequest request);

    /**
      * *   ECS is a virtualized cloud-based service and cannot be connected to display devices. Alibaba Cloud caches system command outputs for the last start, restart, or shutdown of ECS instances. You can call the GetInstanceConsoleOutput operation to query the command outputs.
      * *   For instances of the retired instance types, you cannot obtain command outputs. For more information, see [Retired instance types](~~55263~~).
      * *   You cannot obtain the command outputs of Windows instances.
      *
     */
    CompletableFuture<GetInstanceConsoleOutputResponse> getInstanceConsoleOutput(GetInstanceConsoleOutputRequest request);

    /**
      * After ECS returns a Base64-encoded instance screenshot in the JPG format, you must decode the screenshot. We recommend that you call this operation for troubleshooting and diagnosis. When you call this operation, take note of the following items:
      * *   The instance must be in the Running state.
      * *   For instances of the retired instance types, you cannot obtain screenshots. For more information, see [Retired instance types](~~55263~~).
      * *   If you call this operation on an instance for multiple times, the call interval must be at least 10 seconds. Otherwise, the `Throttling` error is returned.
      *
     */
    CompletableFuture<GetInstanceScreenshotResponse> getInstanceScreenshot(GetInstanceScreenshotRequest request);

    /**
      * ### [](#)Usage notes
      * Take note of the following items:
      * *   Before you import an image, you must upload the image to an Object Storage Service (OSS) bucket. For more information, see [Upload objects](~~31886~~).
      * *   In specific scenarios, you may want to create a custom image based on the operating system data of a source server, import the image to Alibaba Cloud, and then create an ECS instance from the image. The source server can be a physical server, a virtual machine, or a cloud host. If the virtio driver is not installed on the source server, the created ECS instance may be unable to start. To prevent this issue, verify that the virtio driver is installed on the source server before you import the image to Alibaba Cloud. For more information, see [Install the virtio driver](~~62423~~).
      * *   Before you import images for the first time, you must use Resource Access Management (RAM) to authorize ECS to access your OSS buckets. If ECS is not authorized to access your OSS buckets, the `NoSetRoletoECSServiceAccount` or `InvalidOperation.CloudBoxImageImportRoleRequired` error code is returned when you call the ImportImage operation. The authorization configuration varies based on whether the image files are imported from a cloud box.
      *     *   **If the image files are not imported from a cloud box**, you can complete the authorization on the [Cloud Resource Access Authorization](https://ram.console.aliyun.com/?spm=5176.2020520101image.0.0.2ffa4df57kSoHX#/role/authorize?request=%7B%22Requests%22%3A%20%7B%22request1%22%3A%20%7B%22RoleName%22%3A%20%22AliyunECSImageImportDefaultRole%22%2C%20%22TemplateId%22%3A%20%22ECSImportRole%22%7D%2C%20%22request2%22%3A%20%7B%22RoleName%22%3A%20%22AliyunECSImageExportDefaultRole%22%2C%20%22TemplateId%22%3A%20%22ECSExportRole%22%7D%7D%2C%20%22ReturnUrl%22%3A%20%22https%3A//ecs.console.aliyun.com/%22%2C%20%22Service%22%3A%20%22ECS%22%7D) page of the RAM console. You can also complete the authorization by using a RAM role and RAM policies. The following example shows the policies and permissions required for specific steps in the authorization procedure. For more information, see [Control access to ECS resources by using RAM users](~~25481~~).
      *         1.  Create a RAM role named `AliyunECSImageImportDefaultRole`. You must use this exact role name. Otherwise, the image cannot be imported. Configure the following trust policy for the role:
      *                 {
      *                 	"Statement": [
      *                 	{
      *                 		"Action": "sts:AssumeRole",
      *                 		"Effect": "Allow",
      *                 		"Principal": {
      *                 		"Service": [
      *                 			"ecs.aliyuncs.com"
      *                 		]
      *                 		}
      *                 	}
      *                 ],
      *                 	"Version": "1"
      *                 }
      *         2.  Attach the `AliyunECSImageImportRolePolicy` system policy to the RAM role. You can also create a custom policy that contains the following content and attach the policy to the role:
      *             ```
      *             {
      *             	"Version": "1",
      *             	"Statement": [
      *             	{
      *             		"Action": [
      *             				"oss:GetObject",
      *             				"oss:GetBucketLocation",
      *             				"oss:GetBucketInfo"
      *             	],
      *             			"Resource": "*",
      *             			"Effect": "Allow"
      *             			}
      *             	]
      *             }
      *             ```
      *     *   **If the image files are imported from a cloud box**, you can complete the authorization on the [Cloud Resource Access Authorization](https://ram.console.aliyun.com/role/authorize?request=%7B%22ReturnUrl%22%3A%22https%3A%2F%2Fecs.console.aliyun.com%2F%22%2C%22Services%22%3A%5B%7B%22Roles%22%3A%5B%7B%22RoleName%22%3A%22AliyunECSCloudBoxImageImportDefaultRole%22%2C%22TemplateId%22%3A%22AliyunECSCloudBoxImageImportDefaultRole%22%7D%5D%2C%22Service%22%3A%22ECS%22%7D%5D%7D) page of the RAM console. You can also complete the authorization by using a RAM role and RAM policies. The following example shows the policies and permissions required for specific steps in the authorization procedure. For more information, see [Control access to ECS resources by using RAM users](~~25481~~).
      *         1.  Create a RAM role named `AliyunECSCloudBoxImageImportDefaultRole`. You must use this exact role name. Otherwise, the image cannot be imported. Configure the following trust policy for the role:
      *                 {
      *                 	"Statement": [
      *                 	{
      *                 		"Action": "sts:AssumeRole",
      *                 		"Effect": "Allow",
      *                 		"Principal": {
      *                 		"Service": [
      *                 			"ecs.aliyuncs.com"
      *                 		]
      *                 		}
      *                 	}
      *                 ],
      *                 	"Version": "1"
      *                 }
      *         2.  Attach the `AliyunECSCloudBoxImageImportRolePolicy` system policy to the RAM role. You can also create a custom policy that contains the following content and attach the policy to the role:
      *             ```
      *             {
      *             	"Version": "1",
      *             	"Statement": [
      *             	{
      *             		"Action": [
      *             				"oss-cloudbox:GetObject",
      *             				"oss-cloudbox:GetBucketLocation",
      *             				"oss-cloudbox:GetBucketInfo"
      *             	],
      *             			"Resource": "*",
      *             			"Effect": "Allow"
      *             			}
      *             	]
      *             }
      *             ```
      * *   You cannot delete an image that is being imported. However, you can call the [CancelTask](~~25624~~) operation to cancel the image import task.
      * *   You can import an image only to the same region as the OSS bucket to which the image file is uploaded.
      * *   The valid values of N in `DiskDeviceMapping.N` range from 1 to 17. When N is set to 1, the disk is a system disk. When N is set to a value from 2 to 17, the disk is a data disk. When N is set to a value greater than 17, parameters prefixed with DiskDeviceMapping.N are ignored.
      * *   When you set `Architecture` to `arm64` or when you set `Platform` to `CentOS Stream`, `Anolis`, `AlmaLinux`, `UOS`, `Kylin`, or `Rocky Linux`, take note of the following items:
      *     *   To ensure that the password can be set or the key pair can be modified for an imported image, make sure that the image meets the following requirements before you import it:
      *         *   The kernel of the operating system supports the `CONFIG_FW_CFG_SYSFS` feature. By default, Linux community kernel 4.6 and later and CentOS kernel 3.10.0-826.el7 and later support the CONFIG_FW_CFG_SYSFS feature. You can run the `grep -nr CONFIG_FW_CFG_SYSFS /boot/config-$(uname -r)` command on the source server of the image. If the command output contains `CONFIG_FW_CFG_SYSFS=y`, the kernel of the image supports the `CONFIG_FW_CFG_SYSFS` feature.
      *         *   Alibaba Cloud cloud-init of the latest version is installed on the operating system. If the version of cloud-init is 19.1, the minor version must be 19.1.3 or later. If the version of cloud-init is 0.7.6a in some early versions of operating systems, the minor version must be 0.7.6a15 or later. For more information, see [Install cloud-init](~~57803~~).
      *         *   The operating system supports the SHA-512 encryption algorithm.
      *     *   If you want an imported image to support the resizing of disks and file systems, make sure that the image meets the following requirements before you import it:
      *         *   The kernel version of the operating system is later than 3.6.
      *         *   The image supports the growpart command. To support this command, you must install the `cloud-utils-growpart` package. The methods of installing the package vary based on operating systems. For more information, see [Extend the partitions and file systems of disks on a Linux instance](~~25451~~).
      *         *   The image supports the resize2fs command. To support this command, you must install the `e2fsprogs` package. By default, the package is installed on the operating system. If the package is not installed, install it.
      *         *   Alibaba Cloud cloud-init of the latest version is installed on the operating system. If the version of cloud-init is 19.1, the minor version must be 19.1.3 or later. If the version of cloud-init is 0.7.6a in some early versions of operating systems, the minor version must be 0.7.6a15 or later. For more information, see [Install cloud-init](~~57803~~).
      * *   If the image that you want to import uses the Arm64 architecture, configure the real-time clock (RTC) to use the Coordinated Universal Time (UTC) time standard. For more information, see [Linux time and time zones](~~405080~~).
      * *   When you import images, we recommend that you specify DetectionStrategy. This way, you can optimize the images based on the image check results. For more information, see [Overview of image check](~~439819~~).
      *
     */
    CompletableFuture<ImportImageResponse> importImage(ImportImageRequest request);

    /**
      * Take note of the following items:
      * *   A maximum of 500 key pairs can be created in each region.
      * *   The key pair to be imported must support one of the following encryption methods:
      *     *   rsa
      *     *   dsa
      *     *   ssh-rsa
      *     *   ssh-dss
      *     *   ecdsa
      *     *   <ssh-rsa-cert-v00@openssh.com>
      *     *   <ssh-dss-cert-v00@openssh.com>
      *     *   <ssh-rsa-cert-v01@openssh.com>
      *     *   <ssh-dss-cert-v01@openssh.com>
      *     *   <ecdsa-sha2-nistp256-cert-v01@openssh.com>
      *     *   <ecdsa-sha2-nistp384-cert-v01@openssh.com>
      *     *   <ecdsa-sha2-nistp521-cert-v01@openssh.com>
      *
     */
    CompletableFuture<ImportKeyPairResponse> importKeyPair(ImportKeyPairRequest request);

    /**
      * ## [](#)Usage notes
      * After you call the InstallCloudAssistant operation to install Cloud Assistant Agent on an ECS instance, call the [RebootInstance](~~25502~~) operation to restart the instance to make the installation take effect.
      *
     */
    CompletableFuture<InstallCloudAssistantResponse> installCloudAssistant(InstallCloudAssistantRequest request);

    /**
      * ## [](#)Usage notes
      * *   The ECS instances on which you want to run the Cloud Assistant command must meet the following requirements. If multiple ECS instances are specified and one of the instances does not meet the requirements for running the command, the call fails. You must specify instances that meet the requirements and call the InvokeCommand operation again.
      *     *   The instances are in the Running (`Running`) state. You can call the [DescribeInstances](~~25506~~) operation to query the status of instances.
      *     *   Cloud Assistant Agent is installed on the instances. For more information, see [Install Cloud Assistant Agent](~~64921~~).
      *     *   If the command is a PowerShell command, make sure that the instances have the PowerShell module configured.
      * *   You can configure the command to run only once on the instances.
      * *   You can configure the command to run on the instances based on a schedule.
      *     *   The schedule is specified by Frequency. The results of each execution of the command do not affect the next execution of the command.
      *     *   When you use a cron expression to specify a schedule, you can specify a time zone based on your business requirements. If you do not specify a time zone, the schedule is determined by the system time of the instances. Make sure that the time or time zone of the instances meets your business requirements. For more information, see [Manage the time synchronization service](~~92704~~).
      *     To ensure that scheduled tasks can run as expected, make sure that the version of Cloud Assistant Agent is not earlier than the following versions. A scheduled task can run a command at a fixed interval, only once at a specific time, or at specific times based on a cron expression in a specified year or time zone. If the ClientNeedUpgrade error code is returned, you must upgrade Cloud Assistant Agent to the latest version. For more information, see [Upgrade or disable upgrades for Cloud Assistant Agent](~~134383~~).
      *     *   Linux: 2.2.3.282
      *     *   Windows: 2.1.3.282
      * *   Command executions may fail due to instance status exceptions, network exceptions, or exceptions on Cloud Assistant Agent. If a command execution fails, no execution information is generated. For more information, see [Check execution results and troubleshoot common issues](~~87029~~).
      * *   If you enable the custom parameter feature when you create the command, you must specify custom parameters (`Parameters`) to run the command.
      * *   Before you run the command on instances, especially new instances, we recommend that you call the [DescribeCloudAssistantStatus](~~87346~~) operation to query the status of Cloud Assistant Agent on the instances and run the command when the value of CloudAssistantStatus in the response is true for the instances.
      *
     */
    CompletableFuture<InvokeCommandResponse> invokeCommand(InvokeCommandRequest request);

    /**
      * ## [](#)Usage notes
      * A resource is a cloud service entity that you create on Alibaba Cloud, such as an ECS instance, an elastic network interface (ENI), or an image. A resource group is a collection of infrastructure for projects, environments, or stacks. In a resource group, you can manage resources and monitor and run tasks in a centralized manner without the need to switch between Alibaba Cloud services.
      *
     */
    CompletableFuture<JoinResourceGroupResponse> joinResourceGroup(JoinResourceGroupRequest request);

    /**
      * ## [](#)Usage notes
      * >  This operation is not recommended. We recommend that you call the [ModifyInstanceAttribute](~~25503~~) operation to add an instance to or remove an instance from a security group, and call the [ModifyNetworkInterfaceAttribute](~~58513~~) operation to add an ENI to or remove an ENI from a security group.
      * Take note of the following items:
      * *   Before you add an instance to a security group, the instance must be in the **Stopped** (Stopped) or **Running** (Running) state.
      * *   An instance can be added to up to five security groups by default.
      * *   To add an instance to more security groups, [submit a ticket](https://workorder-intl.console.aliyun.com/#/ticket/createIndex). An instance can be added to up to 16 security groups.
      * *   A basic security group can contain up to 2,000 instances. An advanced security group can contain up to 65,536 instances.
      * *   The security group and the instance must reside in the same region.
      * *   The security group and the instance must be of the same network type. If the network type is virtual private cloud (VPC), the security group and the instance must reside in the same VPC.
      * *   An instance and an ENI cannot be added to a security group at the same time. You cannot specify `InstanceId` and `NetworkInterfaceId` at the same time in a request.
      *
     */
    CompletableFuture<JoinSecurityGroupResponse> joinSecurityGroup(JoinSecurityGroupRequest request);

    /**
      * > This operation is not recommended. We recommend that you call the [ModifyInstanceAttribute](~~25503~~) operation to add an instance to or remove an instance from a security group, and call the [ModifyNetworkInterfaceAttribute](~~58513~~) operation to add an ENI to or remove an ENI from a security group.
      * When you call this operation, take note of the following items:
      * *   Before you remove an instance from a security group, the instance must be in the **Stopped** or **Running** state.
      * *   An instance must belong to at least one security group. Therefore, if the instance that you want to remove belongs to only one security group, the LeaveSecurityGroup operation fails.
      * *   You cannot remove an instance and an ENI from a security group at the same time. This indicates that you cannot configure both `InstanceId` and `NetworkInterfaceId` in a request.
      *
     */
    CompletableFuture<LeaveSecurityGroupResponse> leaveSecurityGroup(LeaveSecurityGroupRequest request);

    /**
      * ## Usage notes
      * - Before you call this operation to query the status of Cloud Assistant plug-ins on ECS instances, make sure that the versions of Cloud Assistant Agent on the instances are not earlier than the following ones:
      *   *   2.2.3.344 for Linux instances
      *   *   2.1.3.344 for Windows instances
      * - You can use one of the following methods to check the responses:
      *   - Method 1: When you call the ListPluginStatus operation to retrieve the first page of results during a paged query, use MaxResults to specify the maximum number of entries to return in the call. The return value of NextToken is a pagination token, which you can use in the next request to retrieve a new page of results. When you call the ListPluginStatus operation to retrieve a new page of results, set NextToken to the NextToken value returned in the previous call and use MaxResults to specify the maximum number of entries to return in this call. 
      *   - Method 2: Use PageSize to specify the number of entries to return on each page, and then use PageNumber to specify the number of the page to return. You can use only one of the preceding methods. If you specify MaxResults or NextToken, the PageSize and PageNumber request parameters do not take effect and the TotalCount response parameter is invalid.
      *
     */
    CompletableFuture<ListPluginStatusResponse> listPluginStatus(ListPluginStatusRequest request);

    /**
      * You must specify at least one of the following parameters or parameter pairs in a request to determine a query object:
      * *   `ResourceId.N`
      * *   `Tag.N` parameter pair (`Tag.N.Key` and `Tag.N.Value`)
      * *   `TagFilter.N`
      * If one of the following sets of request parameters is specified as filter conditions, only ECS resources that meet all of the specified filter conditions are returned:
      * *   Set 1: `Tag.N.Key, Tag.N.Value`, and `ResourceId.N`
      * *   Set 2: `TagFilter.N.TagKey, TagFilter.N.TagValues.N`, and `ResourceId.N`
      *
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
      * Before you call this operation, take note of the following items:
      * *   If you modify the capacity or capacity-related settings of an auto-provisioning group, the group executes a scheduling task after the group is modified.
      * *   You cannot modify an auto-provisioning group when the group is being deleted.
      *
     */
    CompletableFuture<ModifyAutoProvisioningGroupResponse> modifyAutoProvisioningGroup(ModifyAutoProvisioningGroupRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ModifyAutoSnapshotPolicyResponse> modifyAutoSnapshotPolicy(ModifyAutoSnapshotPolicyRequest request);

    CompletableFuture<ModifyAutoSnapshotPolicyExResponse> modifyAutoSnapshotPolicyEx(ModifyAutoSnapshotPolicyExRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ModifyBandwidthPackageSpecResponse> modifyBandwidthPackageSpec(ModifyBandwidthPackageSpecRequest request);

    CompletableFuture<ModifyCapacityReservationResponse> modifyCapacityReservation(ModifyCapacityReservationRequest request);

    CompletableFuture<ModifyCloudAssistantSettingsResponse> modifyCloudAssistantSettings(ModifyCloudAssistantSettingsRequest request);

    /**
      * You can modify a command when it is run. After the command is modified, the new command content applies to subsequent executions.
      * You cannot modify the command type. For example, you cannot change a shell command (RunShellScript) to a batch command (RunBatScript).
      *
     */
    CompletableFuture<ModifyCommandResponse> modifyCommand(ModifyCommandRequest request);

    /**
      * ## Description
      * *   All the Elastic Compute Service (ECS) instances that are hosted on a dedicated host must be in the Stopped (`Stopped`) state before you can modify the CPU overcommit ratio of the dedicated host.
      * *   Modifications to the CPU overcommit ratio of a dedicated host do not affect the operation of the dedicated host. After the CPU overcommit ratio is modified, the number of allocated vCPUs on the dedicated host cannot exceed the new total number of vCPUs. Otherwise, ECS instances that use the excess vCPUs cannot start.
      *
     */
    CompletableFuture<ModifyDedicatedHostAttributeResponse> modifyDedicatedHostAttribute(ModifyDedicatedHostAttributeRequest request);

    /**
      * ## Usage notes
      * A pay-as-you-go dedicated host can be automatically released at the specified time. Before you release a pay-as-you-go dedicated host, make sure that the host is no longer required and all necessary application data is backed up.
      *
     */
    CompletableFuture<ModifyDedicatedHostAutoReleaseTimeResponse> modifyDedicatedHostAutoReleaseTime(ModifyDedicatedHostAutoReleaseTimeRequest request);

    /**
      * *   If you enable auto-renewal for your subscription dedicated host, the system attempts to deduct the renewal payment at 08:00:00 (UTC+8) nine days before the dedicated host expires to renew the dedicated host. If this deduction attempt fails, the system attempt to deduct the payment at the same point in time the next day. The system attempts to deduct the payment once every day until the dedicated host expires or until the payment is deducted. Make sure that your account balance is sufficient.
      * *   Subscription dedicated hosts can be automatically renewed along with the subscription Elastic Compute Service (ECS) instances hosted on the dedicated hosts. For more information, see the description of the AutoRenewWithEcs parameter.
      *
     */
    CompletableFuture<ModifyDedicatedHostAutoRenewAttributeResponse> modifyDedicatedHostAutoRenewAttribute(ModifyDedicatedHostAutoRenewAttributeRequest request);

    CompletableFuture<ModifyDedicatedHostClusterAttributeResponse> modifyDedicatedHostClusterAttribute(ModifyDedicatedHostClusterAttributeRequest request);

    CompletableFuture<ModifyDedicatedHostsChargeTypeResponse> modifyDedicatedHostsChargeType(ModifyDedicatedHostsChargeTypeRequest request);

    /**
      * @deprecated
      * You can call this operation to modify the demand information of instance types. Alibaba Cloud provides the requested resources based on your demand. You can file demands only for I/O optimized instance types and instances of the virtual private cloud (VPC) type. Parameters except `DemandName` and `DemandDescription` can be modified only for demands that are in the Rejected state.
      * > This operation is in invitational preview and is not publicly available.
      *
     */
    CompletableFuture<ModifyDemandResponse> modifyDemand(ModifyDemandRequest request);

    CompletableFuture<ModifyDeploymentSetAttributeResponse> modifyDeploymentSetAttribute(ModifyDeploymentSetAttributeRequest request);

    CompletableFuture<ModifyDiagnosticMetricSetResponse> modifyDiagnosticMetricSet(ModifyDiagnosticMetricSetRequest request);

    /**
      * ## [](#)Usage notes
      * *   When you call this operation to modify the attributes of a disk, if you set DeleteWithInstance to false and the instance to which the disk is attached is locked for security reasons, the DeleteWithInstance settings of the disk are ignored and the disk is released together with the instance. If `"LockReason" : "security"` is displayed in the response when you query the information about an instance, the instance is locked for security reasons.
      * *   You can use `DiskIds.N` to specify multiple block storage devices and batch modify the attributes of the devices, including the names and descriptions of the devices and whether to release the devices together with the associated instances.
      *
     */
    CompletableFuture<ModifyDiskAttributeResponse> modifyDiskAttribute(ModifyDiskAttributeRequest request);

    /**
      * # [](#)Usage notes
      * After you change the billing method, the payment (if any) is automatically completed. Maintain sufficient balance in your account. Otherwise, your order becomes invalid and must be canceled. If your account balance is insufficient, you can set AutoPay to false to generate an unpaid order. Then, you can go to the [Orders page](https://usercenter2-intl.aliyun.com/order/list) in the Expenses and Costs console and pay for the order.
      * Take note of the following items:
      * *   Only pay-as-you-go disks can be attached to pay-as-you-go instances, and the billing methods of the disks cannot be changed.
      * *   The instance cannot be in the Stopped state due to expiration.
      * *   The price difference is refunded to the payment account that you used. Vouchers that have been redeemed are nonrefundable.
      * *   You cannot change the billing method again within 5 minutes of a successful change.
      *
     */
    CompletableFuture<ModifyDiskChargeTypeResponse> modifyDiskChargeType(ModifyDiskChargeTypeRequest request);

    /**
      * ### [](#)Usage notes
      * >  The Dedicated Block Storage Cluster feature is available in the following regions: China (Hangzhou), China (Shanghai), China (Beijing), China (Zhangjiakou), China (Ulanqab), China (Shenzhen), China (Heyuan), Indonesia (Jakarta), Germany (Frankfurt), and China South 1 Finance.
      * Before you call the ModifyDiskDeployment operation, make sure that you fully understand the billing methods and prices of disks and dedicated block storage clusters. In addition, make sure that the dedicated block storage clusters are unexpired and your account has no overdue payments. For more information, see [Dedicated block storage cluster](~~208883~~) and [Block storage devices](~~179022~~).
      * Take note of the following items:
      * *   The disks and a dedicated block storage cluster to which you want to migrate the disk must be in the same zone.
      * *   You can migrate only pay-as-you-go disks. If you want to migrate subscription disks, change the disks to pay-as-you-go disks first. For more information, see [Change the billing method of a disk](~~145018~~).
      * *   The specifications of disks that you want to migrate to a destination block storage cluster must the same as the disk specifications that the destination dedicated block storage cluster supports. During migration, you can change the specifications of the disks to ensure specification consistency.
      * *   The disk must be in the **In Use** (In_Use) or **Available** (Available) state.
      * *   If the disk is attached to an Elastic Compute Service (ECS) instance, the instance must be in the **Running** (Running) or **Stopped** (Stopped) state. The ECS instance cannot be in the Expired state.
      * *   The performance level of an enhanced SSD (ESSD) is limited by the ESSD disk size. If you cannot upgrade the performance level of an ESSD, you can resize the ESSD. For more information, see [ResizeDisk](~~25522~~) and [ESSDs](~~122389~~).
      * *   An account can perform up to five disk migration tasks in the same region at the same time.
      * *   When a disk is being migrated, you cannot cancel the migration task, create snapshots for the disk, change the disk configurations, resize the disk, mount the disk, unmount the disk, or re-initialize the disk.
      * >  After you migrate a disk to a destination cluster by calling the ModifyDiskDeployment operation, the billing method, disk specifications, and capabilities of the destination cluster take effect immediately on the disk. Alibaba Cloud charges the disk based on the disk category and performance level. For more information, see [Dedicated block storage cluster](~~208883~~) and [Block storage devices](~~179022~~).
      *
     */
    CompletableFuture<ModifyDiskDeploymentResponse> modifyDiskDeployment(ModifyDiskDeploymentRequest request);

    /**
      * ## Usage notes
      * Take note of the following items:
      * *   To modify the performance level of an ESSD, take note of the following items:
      *     *   For a subscription ESSD, you can only upgrade its performance level.
      *     *   For a pay-as-you-go ESSD, you can upgrade or downgrade its performance level. However, you cannot downgrade the performance level to PL0.
      *     *   The ESSD must be in the **In Use** (In_Use) or **Unattached** (Available) state.
      *     *   If the ESSD is attached to an Elastic Compute Service (ECS) instance, the instance must be in the **Running** (Running) or **Stopped** (Stopped) state. The instance cannot be in the Expired state or stopped due to an overdue payment.
      *     *   If you cannot upgrade the performance level of the ESSD due to the capacity limit, resize the ESSD by calling the [ResizeDisk](~~25522~~) operation and then try again. For more information, see [ESSDs](~~122389~~).
      * *   For information about the limits on changing the category of a disk, see the "Limits" section of the [Change the category of a disk](~~161980~~) topic.
      * The new disk category or performance level takes effect immediately after this operation is performed. Alibaba Cloud calculates the bill based on the new disk category and performance level.
      *
     */
    CompletableFuture<ModifyDiskSpecResponse> modifyDiskSpec(ModifyDiskSpecRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ModifyEipAddressAttributeResponse> modifyEipAddressAttribute(ModifyEipAddressAttributeRequest request);

    CompletableFuture<ModifyElasticityAssuranceResponse> modifyElasticityAssurance(ModifyElasticityAssuranceRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ModifyForwardEntryResponse> modifyForwardEntry(ModifyForwardEntryRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ModifyHaVipAttributeResponse> modifyHaVipAttribute(ModifyHaVipAttributeRequest request);

    CompletableFuture<ModifyHpcClusterAttributeResponse> modifyHpcClusterAttribute(ModifyHpcClusterAttributeRequest request);

    CompletableFuture<ModifyImageAttributeResponse> modifyImageAttribute(ModifyImageAttributeRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ModifyImageShareGroupPermissionResponse> modifyImageShareGroupPermission(ModifyImageShareGroupPermissionRequest request);

    /**
      * ## [](#)Usage notes
      * Take note of the following items:
      * *   You can share only your own custom images to other Alibaba Cloud accounts.
      * *   You can share a custom image to up to 10 Alibaba Cloud accounts at a time. You can specify up to 10 Alibaba Cloud account IDs by using AddAccount.N or RemoveAccount.N. If you specify more than 10 account IDs, the system processes only the first 10 account IDs. The excess account IDs are ignored.
      * *   You can share a custom image to up to 50 Alibaba Cloud accounts.
      * *   If an Elastic Compute Service (ECS) instance was created ([RunInstances](~~63440~~)) from a shared image, you cannot re-initialize the instance ([ReInitDisk](~~25519~~)) after the image owner unshares or deletes the image ([DeleteImage](~~25537~~)).
      * When you publish or unpublish a community image, take note of the following items:
      * *   Alibaba Cloud provides only the platform on which community images can be published and managed. The owner of a community image is responsible for the quality and updates of the image. Make sure that you acknowledge and agree to the Community Image Agreement. Otherwise, you cannot publish community images. For more information, see [Publish a community image](~~208370~~).
      * *   You cannot publish encrypted images as community images.
      * *   Community images are publicly available. A community image is available to all Alibaba Cloud accounts in the region where the image resides.
      * *   You cannot share, export, or copy community images.
      * *   After you unpublish a community image, the image is no longer available to other Alibaba Cloud accounts. If an image is shared to other Alibaba Cloud accounts before it is unpublished, the image remains available to the accounts.
      *
     */
    CompletableFuture<ModifyImageSharePermissionResponse> modifyImageSharePermission(ModifyImageSharePermissionRequest request);

    /**
      * A private pool is generated after an elasticity assurance or a capacity reservation is created. The private pool is associated with information about the instances that are created by using the resources in the private pool. When you create ECS instances, you can configure the instances to use private pool resources, matching them to active elasticity assurances or capacity reservations.
      * *   This operation does not require you to restart the instances for the changes to take effect.
      * *   When you call the following operations on an instance, the system attempts to match the instance with active private pools. If the instance is configured to a specific private pool. the call may fail because the private pool is no longer active or does not have sufficient resources. If the call fails, call the ModifyInstanceAttachmentAttributes operation to change the match mode of the private pool to `Open`.
      *     *   StartInstance: starts an instance that is stopped in economical mode.
      *     *   ReActivateInstances
      *     *   ModifyInstanceChargeType
      *     *   ModifyPrepayInstanceSpec
      *     *   ReplaceSystemDisk
      *
     */
    CompletableFuture<ModifyInstanceAttachmentAttributesResponse> modifyInstanceAttachmentAttributes(ModifyInstanceAttachmentAttributesRequest request);

    /**
      * ## [](#)Usage notes
      * If the response contains `{"OperationLocks": {"LockReason" : "security"}}` when you query the information of an instance, the instance is locked for security reasons. No operations are allowed on the instance.
      * Take note of the following items:
      * *   If you change the hostname (`HostName`), restart the instance in the ECS console or by calling the [RebootInstance](~~25502~~) operation for the new hostname to take effect. For information about how to restart an instance in the ECS console, see [Restart an instance](~~25440~~). The new hostname may not take effect if you restart the instance from within the operating system.
      * *   If you reset the password (`Password`), take note of the following items:
      *     *   The instance cannot be in the **Starting** (`Starting`) state.
      *     *   After you reset the password, restart the instance in the ECS console or by calling the [RebootInstance](~~25502~~) operation for the new password to take effect. For information about how to restart an instance in the ECS console, see [Restart an instance](~~25440~~). The new password does not take effect if you restart the instance from within the operating system.
      * *   If you modify user data (`UserData`), take note of the following items:
      *     *   The instance must be in the **Stopped** (`Stopped`) state.
      *     *   The instance must meet the limits for user data. For more information, see [Instance user data](~~49121~~).
      *     **
      *     **Note** After you restart the instance, the new user data is displayed but not run as scripts.
      * *   If you change the security groups (`SecurityGroupIds.N`), take note of the following items:
      *     *   You can move an instance to a security group of a different type. If you want to move an instance to a security group of a different type, you must familiarize yourself with the differences between the rule configurations of the two security group types to prevent impacts on the instance network.
      *     *   Security groups of instances in the classic network cannot be changed. For more information, see the description of `SecurityGroupIds.N`.
      * *   If you change the number of queues supported by the primary elastic network interface (ENI) (`NetworkInterfaceQueueNumber`), take note of the following items:
      *     *   The instance must be in the Stopped (`Stopped`) state.
      *     *   The value of this parameter cannot exceed the maximum number of queues allowed per ENI.
      *     *   The total number of queues for all ENIs on the instance cannot exceed the queue quota for the instance type. To query the maximum number of queues per ENI and the queue quota for an instance type, you can call the [DescribeInstanceTypes](~~25620~~) operation and view the values of the `MaximumQueueNumberPerEni` and `TotalEniQueueQuantity` response parameters.
      *     *   If you set this parameter to -1, the value is reset to the default value for the instance type. To query the default number of queues supported per primary ENI for an instance type, you can call the [DescribeInstanceTypes](~~25620~~) operation and view the value of the `PrimaryEniQueueNumber` response parameter.
      * *   If you enable or disable the Jumbo Frames feature (`EnableJumboFrame`), take note of the following items: For more information, see [MTUs](~~200512~~).
      *     *   The instance must be in the Running (`Running`) or Stopped (`Stopped`) state.
      *     *   The instance must reside in a virtual private cloud (VPC).
      *     *   After the Jumbo Frames feature is enabled, the MTU value of the instance is set to 8500. After the Jumbo Frames feature is disabled, the MTU value of the instance is set to 1500.
      *
     */
    CompletableFuture<ModifyInstanceAttributeResponse> modifyInstanceAttribute(ModifyInstanceAttributeRequest request);

    CompletableFuture<ModifyInstanceAutoReleaseTimeResponse> modifyInstanceAutoReleaseTime(ModifyInstanceAutoReleaseTimeRequest request);

    /**
      * Before you call this operation, make sure that you are familiar with the billing methods and pricing of Elastic Compute Service (ECS). For more information, see the [Elastic Compute Service](https://www.alibabacloud.com/product/ecs#pricing) product page.
      * *   The payment for auto-renewal of an instance is automatically deducted at 08:00:00 (UTC+8) nine days before the instance expires.
      * *   If the deduction fails, Alibaba Cloud attempts to deduct the payment every day until the payment is deducted or until the instance is locked after the nine-day period ends. Make sure that your account balance or credit balance is sufficient.
      *
     */
    CompletableFuture<ModifyInstanceAutoRenewAttributeResponse> modifyInstanceAutoRenewAttribute(ModifyInstanceAutoRenewAttributeRequest request);

    /**
      * Before you call this operation, make sure that you are familiar with the billing methods and pricing of Elastic Compute Service (ECS). For more information, see the [Elastic Compute Service](https://www.alibabacloud.com/product/ecs#pricing) product page.
      * Take note of the following items:
      * *   The instances must be in the **Running** (`Running`) or **Stopped** (`Stopped`) state, and you cannot have overdue payments for them.
      * *   After you change the billing method, outstanding payments are automatically completed. Make sure that your account balance is sufficient. Otherwise, your order becomes invalid and is canceled. If your account balance is insufficient, you can set `AutoPay` to `false` to generate an unpaid order. Then, you can log on to the [ECS console](https://ecs.console.aliyun.com/) to pay for the order.
      * *   **Change the billing method from subscription to pay-as-you-go**:
      *     *   Your ECS usage determines whether the billing method of an instance can be changed from subscription to pay-as-you-go.
      *     *   After you change the billing method of an instance from subscription to pay-as-you-go, the new billing method remains in effect for the remaining lifecycle of the instance. The price difference is refunded to the payment account that you used. Vouchers that have been redeemed are not refundable.
      *     *   **Refund rule**: You have a quota for the total refund amount each month, and unused balance of this quota is not carried forward into the next month. After you use up the refund quota of the current month, you can change the billing method only in the next month. The refund amount incurred when you change the billing method is calculated based on the following formula: **Number of vCPUs × (Number of remaining days × 24 ± Number of remaining or elapsed hours)**.
      * *   **Change the billing method from pay-as-you-go to subscription**:
      *     *   You can change the billing method of all data disks that are attached to an instance from pay-as-you-go to subscription.
      *     *   This operation cannot be called for a pay-as-you-go instance that has an automatic release time set.
      *
     */
    CompletableFuture<ModifyInstanceChargeTypeResponse> modifyInstanceChargeType(ModifyInstanceChargeTypeRequest request);

    /**
      * Take note of the following items:
      * *   The instance must be in the **Stopped** (Stopped) state. The instance is automatically restarted after it is migrated.
      * *   The network type of the instance must be Virtual Private Cloud (VPC).
      * *   The instance and the destination dedicated host to which to migrate the instance must belong to the same account and reside in the same region and zone.
      * *   A pay-as-you-go instance can be migrated to a subscription dedicated host. A subscription instance can be migrated only between subscription dedicated hosts. The expiration date of the subscription instance cannot be later than that of the destination dedicated host.
      * *   You can migrate only pay-as-you-go instances from a shared host to a dedicated host. You cannot migrate subscription instances or preemptible instances from a shared host to a dedicated host.
      * *   You can redeploy an instance to a specific dedicated host cluster.
      *
     */
    CompletableFuture<ModifyInstanceDeploymentResponse> modifyInstanceDeployment(ModifyInstanceDeploymentRequest request);

    /**
      * This operation is used to modify the maintenance policy of an instance. The maintenance policy consists of the following maintenance attributes:
      * *   Maintenance window: the time period that you specify for maintenance.
      * *   Maintenance action: the action that you specify in response to instance shutdown.
      *
     */
    CompletableFuture<ModifyInstanceMaintenanceAttributesResponse> modifyInstanceMaintenanceAttributes(ModifyInstanceMaintenanceAttributesRequest request);

    CompletableFuture<ModifyInstanceMetadataOptionsResponse> modifyInstanceMetadataOptions(ModifyInstanceMetadataOptionsRequest request);

    /**
      * Take note of the following items:
      * *   From November 27, 2020, the maximum bandwidth value available for you to create ECS instances or to change ECS instance configurations is subject to the throttling policy for your account. To increase the maximum bandwidth value, submit a ticket. The following throttling policies apply:
      *     *   Within a single region, the sum of actual peak bandwidths of all ECS instances that use the pay-by-traffic billing method for network usage cannot exceed 5 Gbit/s.
      *     *   Within a single region, the sum of actual peak bandwidths of all ECS instances that use the pay-by-bandwidth billing method for network usage cannot exceed 50 Gbit/s.
      * *   If you upgrade the outbound public bandwidth (InternetMaxBandwidthOut) of a subscription (PrePaid) instance from 0 Mbit/s when you modify the bandwidth configurations of the instance, a public IP address is automatically assigned to the instance.
      * *   If you upgrade the outbound public bandwidth (InternetMaxBandwidthOut) of a pay-as-you-go (PostPaid) instance from 0 Mbit/s when you modify the bandwidth configurations of the instance, no public IP address is assigned to the instance. You must set `AllocatePublicIp` to true or call the [AllocatePublicIpAddress](~~25544~~) operation to assign a public IP address to the instance.
      * *   An instance in the classic network must be in the Stopped state before you can upgrade its outbound public bandwidth (InternetMaxBandwidthOut) from 0 Mbit/s.
      * *   After the bandwidth is upgraded, AutoPay is set to true by default and the payment is automatically made. Make sure that your account balance is sufficient. Otherwise, your order becomes invalid and must be canceled. If your account balance is insufficient, you can set AutoPay to false. In this case, when you call the ModifyInstanceNetworkSpec operation, an unpaid order is generated. Then, you can log on to the ECS console to pay for the order.
      * *   The price difference is refunded to the payment account that you used. Vouchers or coupons that have been redeemed cannot be returned.
      *
     */
    CompletableFuture<ModifyInstanceNetworkSpecResponse> modifyInstanceNetworkSpec(ModifyInstanceNetworkSpecRequest request);

    /**
      * ## [](#)Usage notes
      * For information about how to use ECS SDK for Python to change resource configurations, see [Query available resources for configuration changes](~~109517~~).
      * Take note of the following items:
      * *   Make sure that you have no overdue payments in your account.
      * *   You can adjust the public bandwidth of an instance only when the instance is in the **Running** (`Running`) or **Stopped** (`Stopped`) state.
      * *   Before you change the instance type of a pay-as-you-go instance, call the [DescribeResourcesModification](~~66187~~) operation to query compatible instance types.
      * *   You can change the instance type of an instance only when the instance is in the **Stopped** (`Stopped`) state.
      * *   The instance type and the public bandwidth of an instance cannot be changed together.
      * *   Starting November 27, 2020, the maximum bandwidth value that is available for you to create ECS instances or change ECS instance configurations is subject to the throttling policy of your account. To increase the maximum bandwidth value, submit a ticket. The following throttling policies apply:
      *     *   In each region, the sum of actual maximum bandwidths of all ECS instances that use the pay-by-traffic billing method for network usage cannot exceed 5 Gbit/s.
      *     *   In each region, the sum of actual maximum bandwidths of all ECS instances that use the pay-by-bandwidth billing method for network usage cannot exceed 50 Gbit/s.
      *
     */
    CompletableFuture<ModifyInstanceSpecResponse> modifyInstanceSpec(ModifyInstanceSpecRequest request);

    /**
      * *   The password must be six characters in length and can contain only uppercase letters, lowercase letters, and digits.
      * *   After you modify the VNC password of an instance, take note of the following items:
      *     *   If the instance is I/O optimized, the new password takes effect immediately.
      *     *   If the instance is not I/O optimized, you must [restart the instance](~~25440~~) by using the ECS console or by calling the [RebootInstance](~~25502~~) operation for the new password to take effect.
      *
     */
    CompletableFuture<ModifyInstanceVncPasswdResponse> modifyInstanceVncPasswd(ModifyInstanceVncPasswdRequest request);

    /**
      * ## [](#)Usage notes
      * The instance that you want to manage must be in the **Stopped** (`Stopped`) state.
      * *   When you call this operation to change the private IP address or vSwitch of an instance, take note of the following items:
      *     *   If the instance is a new instance, you must restart the instance before you call this operation.
      *     *   After the private IP address or vSwitch of the instance is changed, you must restart the instance before you can recall this operation.
      * *   When you call this operation to change the VPC of an instance, take note of the following items:
      *     *   **Instance:**
      *         *   The instance cannot be associated with Server Load Balancer (SLB) instances.
      *         *   The instance cannot be in the Locked, To Be Released, Expired, Expired and Being Recycled, or Overdue and Being Recycled state. For more information, see [Instance lifecycle](~~25380~~).
      *         *   The instance cannot be used in other Alibaba Cloud services. For example, the instance cannot be in the process of being migrated or having its VPC changed, or the databases deployed on the instance cannot be managed by Data Transmission Service (DTS).
      *     *   **Network:**
      *         *   The cut-through mode or the multi-elastic IP address (EIP)-to-elastic network interface (ENI) mode cannot be enabled for the instance.
      *         *   The instance cannot be associated with a high-availability virtual IP address (HAVIP).
      *         *   The vSwitch of the instance cannot be associated with a custom route table.
      *         *   Global Accelerator (GA) cannot be activated for the instance.
      *         *   The instance cannot have secondary ENIs.
      *         *   The instance cannot be assigned an IPv6 address.
      *         *   The primary ENI of the instance cannot be associated with multiple IP addresses.
      *         *   The new vSwitch that you specify must belong to the new VPC.
      *         *   The original and new vSwitches must reside in the same zone.
      *         *   If you assign a private IP address to the primary ENI of the instance, the private IP address must be an idle IP address within the CIDR block of the new vSwitch. If you do not assign a private IP address to the primary ENI of the instance, a private IP address is randomly assigned to the ENI. Make sure that sufficient IP addresses are available in the CIDR block of the new vSwitch.
      *         *   The Alibaba Cloud account that owns the new VPC cannot share the VPC with other accounts.
      *     *   **Security group (SecurityGroupId.N):**
      *         *   All security groups must be of the same type.
      *         *   The valid values of N vary based on the maximum number of security groups to which an instance can belong. For more information, see the "Security group limits" section in [Limits](~~25412~~).
      *         *   The security groups that you specify must belong to the new VPC.
      *         *   You can switch the instance to security groups of a different type. To ensure network connectivity, we recommend that you understand the differences in rule configurations of the two security group types before you switch an instance to security groups of a different type. For more information, see [Overview](~~25387~~).
      *
     */
    CompletableFuture<ModifyInstanceVpcAttributeResponse> modifyInstanceVpcAttribute(ModifyInstanceVpcAttributeRequest request);

    /**
      * *   You can modify the execution information of a task that runs a command in one of the following modes. To query the execution mode of a command, you can call the [DescribeInvocations](~~2679916~~) operation and check the `RepeatMode` value in the response.
      *     *   Period: The task runs the command on a schedule.
      *     *   NextRebootOnly: The task runs the command the next time the associated instances start.
      *     *   EveryReboot: The task runs the command every time the associated instances start.
      * *   You can modify the execution information of a command task in one of the following execution states. To query the execution status of a command, you can call the [DescribeInvocations](~~2679916~~) operation and check the `InvocationStatus` value.
      *     *   Pending: The command is being verified or sent. When the execution state on at least one instance is Pending, the overall execution state is Pending.
      *     *   Running: The command is being run on instances. When the execution state on at least one instance is Running, the overall execution state is Running.
      *     *   Scheduled: The command that is set to run on a schedule is sent and waiting to be run. When the execution state on at least one instance is Scheduled, the overall execution state is Scheduled.
      *     *   Stopping: The command task is being stopped. When the execution state on at least one instance is Stopping, the overall execution state is Stopping.
      * *   Before you modify the execution information of a scheduled task, such as the command content, custom parameters, and execution frequency, make sure that the version of Cloud Assistant Agent on the ECS instances or managed instances associated with the task is later than the following versions:
      *     *   Linux: 2.2.3.541
      *     *   Windows: 2.1.3.541
      *     *   If the `InvalidOperation.CloudAssistantVersionUnsupported` error code is returned in the response, update Cloud Assistant Agent to the latest version.
      * *   You cannot modify `CommandContent` for a common Cloud Assistant command.
      * *   If you modify the `CommandContent` value of a command and set `KeepCommand` to `true` when you call the [InvokeCommand](~~64841~~) or [RunCommand](~~141751~~) operation to run the command, a new command is added and retained. The new command consumes the quota for Cloud Assistant commands. You can retain up to 500 to 50,000 Cloud Assistant commands in each region. You can apply for a quota increase. For information about how to query and increase quotas, see [Manage quotas](~~184116~~).
      *
     */
    CompletableFuture<ModifyInvocationAttributeResponse> modifyInvocationAttribute(ModifyInvocationAttributeRequest request);

    /**
      * ## Debugging
      * [OpenAPI Explorer automatically calculates the signature value. For your convenience, we recommend that you call this operation in OpenAPI Explorer. OpenAPI Explorer dynamically generates the sample code of the operation for different SDKs.](https://api.aliyun.com/#product=Ecs\\&api=ModifyLaunchTemplateDefaultVersion\\&type=RPC\\&version=2014-05-26)
      *
     */
    CompletableFuture<ModifyLaunchTemplateDefaultVersionResponse> modifyLaunchTemplateDefaultVersion(ModifyLaunchTemplateDefaultVersionRequest request);

    /**
      * The region ID. The following regions are supported: China (Qingdao), China (Beijing), China (Zhangjiakou), China (Hohhot), China (Hangzhou), China (Shanghai), China (Shenzhen), China (Heyuan), and China (Hong Kong).
      * You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
      *
     */
    CompletableFuture<ModifyManagedInstanceResponse> modifyManagedInstance(ModifyManagedInstanceRequest request);

    CompletableFuture<ModifyNetworkInterfaceAttributeResponse> modifyNetworkInterfaceAttribute(ModifyNetworkInterfaceAttributeRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ModifyPhysicalConnectionAttributeResponse> modifyPhysicalConnectionAttribute(ModifyPhysicalConnectionAttributeRequest request);

    /**
      * *   The specified CIDR block must be valid. For example, 10.0.0.0/8 is a valid CIDR block while 10.0.0.1/8 is not. For more information, see the [What is CIDR?](~~40637~~#section-jua-0tj-q5m) section in the "Network FAQ" topic.
      * *   When you add or delete an entry, you cannot specify duplicate CIDR blocks. Examples:
      *     *   For IPv4 CIDR blocks, you cannot specify the 10.0.0.0/8 CIDR block in two entries. You cannot specify the 10.0.0.1/32 CIDR block in one entry and the 10.0.0.1 CIDR block in another entry. The two CIDR blocks are the same.
      *     *   For IPv6 CIDR blocks, you cannot specify the 2001:fd01:0:0:0:0:0:0/32 CIDR block in one entry and the 2001:fd01::/32 CIDR block in another entry. The two CIDR blocks are the same.
      * *   The CIDR block in an entry to be added cannot the same as that in an entry to be deleted. For example, when you add an entry in which the 10.0.0.0/8 CIDR block is specified, make sure the 10.0.0.0/8 CIDR block is not specified in an entry to be deleted.
      * *   If you want to modify the description of an entry, you must specify the CIDR block (`AddEntry.N.Cidr`) and new description (`AddEntry.N.Description`) for the entry.
      *
     */
    CompletableFuture<ModifyPrefixListResponse> modifyPrefixList(ModifyPrefixListRequest request);

    /**
      * ## [](#)Usage notes
      * Before you call this operation, we recommend that you familiarize yourself with the billing methods, pricing schedule, and refund rules of [ECS](https://www.alibabacloud.com/product/ecs#pricing). For information about the refund rules, see [Rules for unsubscribing from resources](~~476339~~).
      * Before you change the instance type of a subscription instance, call the [DescribeResourcesModification](~~66187~~) operation to query the instance types to which you can change the instance. You can use ECS SDK for Python. For more information, see [Query available resources for configuration changes](~~109517~~).
      * Take note of the following items:
      * *   To change the instance type of an expired instance, you must first renew the instance.
      * *   When you downgrade the instance type of an instance, take note of the following items:
      *     *   The instance must be in the **Stopped** (`Stopped`) state.
      *     *   The price difference is refunded to the payment account you used. Vouchers that have been redeemed are not refundable.
      * *   The operation is asynchronous. Wait 5 to 10 seconds for the instance type change to complete. Then, restart the instance by calling the RebootInstance operation or by using the ECS console for the instance type change to take effect. If you restart only the operating system of the instance, the instance type change does not take effect.
      *     *   If the instance is in the **Stopped** state, you only need to start the instance. You do not need to restart the instance after it enters the Running state.
      *     *   If `RebootWhenFinished` is set to true for the instance, you do not need to restart the instance.
      *
     */
    CompletableFuture<ModifyPrepayInstanceSpecResponse> modifyPrepayInstanceSpec(ModifyPrepayInstanceSpecRequest request);

    CompletableFuture<ModifyReservedInstanceAttributeResponse> modifyReservedInstanceAttribute(ModifyReservedInstanceAttributeRequest request);

    CompletableFuture<ModifyReservedInstanceAutoRenewAttributeResponse> modifyReservedInstanceAutoRenewAttribute(ModifyReservedInstanceAutoRenewAttributeRequest request);

    /**
      * The region ID of the reserved instance.
      * You can call the [DescribeRegions](~~25609~~) operation to query the most recent list of regions.
      *
     */
    CompletableFuture<ModifyReservedInstancesResponse> modifyReservedInstances(ModifyReservedInstancesRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ModifyRouterInterfaceAttributeResponse> modifyRouterInterfaceAttribute(ModifyRouterInterfaceAttributeRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ModifyRouterInterfaceSpecResponse> modifyRouterInterfaceSpec(ModifyRouterInterfaceSpecRequest request);

    CompletableFuture<ModifySecurityGroupAttributeResponse> modifySecurityGroupAttribute(ModifySecurityGroupAttributeRequest request);

    /**
      * ## [](#)Usage notes
      * In security group-related API documents, inbound traffic refers to the traffic that is sent by the source device and received at the destination device.
      * Take note of the following items:
      * *   An authorization object in a security group rule can be of one of the following types: IP address or CIDR block, security group, or prefix list. You cannot call this operation to change the type of an existing authorization object. For example, if an authorization object is an IP address, you can change the authorization object to another IP address or a CIDR block, but you cannot change the authorization object to a security group or prefix list.
      * *   You cannot change the IP address family of an existing authorization object. For example, if an authorization object is an IPv4 CIDR block, you cannot change the authorization object to an IPv6 CIDR block. If an authorization object is a prefix list of the IPv4 address family, you cannot change the authorization object to a prefix list of the IPv6 address family.
      * *   The modified security group rule cannot be the same as other existing rules.
      * *   You cannot delete the value of a non-empty parameter. If you want to delete the values of non-empty parameters, we recommend that you create another rule and delete the original rule.
      *
     */
    CompletableFuture<ModifySecurityGroupEgressRuleResponse> modifySecurityGroupEgressRule(ModifySecurityGroupEgressRuleRequest request);

    /**
      * Take note of the following items:
      * *   When InnerAccessPolicy is set to Accept for a security group, the instances in the security group can communicate with each other. In this case, the Accept internal access control policy takes precedence over user-created security group rules to keep instances in the security group accessible to each other.
      * *   When InnerAccessPolicy is set to Drop for a security group, the instances in the security group are isolated from each other. In this case, user-created security group rules take precedence over the Drop internal access control policy and can be used to allow access between the instances. For example, you can call the [AuthorizeSecurityGroup](~~25554~~) operation to create an inbound security group rule that allows the instances in the security group to communicate with each other.
      * *   You can call the [DescribeSecurityGroupAttribute](~~25555~~) operation to query the internal access policy of a security group.
      *
     */
    CompletableFuture<ModifySecurityGroupPolicyResponse> modifySecurityGroupPolicy(ModifySecurityGroupPolicyRequest request);

    /**
      * ## [](#)Usage notes
      * In security group-related API documents, inbound traffic refers to the traffic that is sent by the source device and received at the destination device.
      * Take note of the following items:
      * *   An authorization object in a security group rule can be one of the following types: IP address or CIDR block, security group, or prefix list. You cannot call this operation to change the type of an existing authorization object. For example, if an authorization object is an IP address, you can change the authorization object to another IP address or a CIDR block, but you cannot change the authorization object to a security group or prefix list.
      * *   You cannot change the IP address family of an existing authorization object. For example, if an authorization object is an IPv4 CIDR block, you cannot change the authorization object to an IPv6 CIDR block. If an authorization object is a prefix list of the IPv4 address family, you cannot change the authorization object to a prefix list of the IPv6 address family.
      * *   The new security group rule after modification cannot be the same as other existing rules.
      * *   You cannot delete the value of a non-empty parameter. If you want to delete the values of non-empty parameters, we recommend that you create another rule and delete the original rule.
      *
     */
    CompletableFuture<ModifySecurityGroupRuleResponse> modifySecurityGroupRule(ModifySecurityGroupRuleRequest request);

    CompletableFuture<ModifySnapshotAttributeResponse> modifySnapshotAttribute(ModifySnapshotAttributeRequest request);

    CompletableFuture<ModifySnapshotGroupResponse> modifySnapshotGroup(ModifySnapshotGroupRequest request);

    CompletableFuture<ModifyStorageCapacityUnitAttributeResponse> modifyStorageCapacityUnitAttribute(ModifyStorageCapacityUnitAttributeRequest request);

    CompletableFuture<ModifyStorageSetAttributeResponse> modifyStorageSetAttribute(ModifyStorageSetAttributeRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ModifyUserBusinessBehaviorResponse> modifyUserBusinessBehavior(ModifyUserBusinessBehaviorRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ModifyVRouterAttributeResponse> modifyVRouterAttribute(ModifyVRouterAttributeRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ModifyVSwitchAttributeResponse> modifyVSwitchAttribute(ModifyVSwitchAttributeRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ModifyVirtualBorderRouterAttributeResponse> modifyVirtualBorderRouterAttribute(ModifyVirtualBorderRouterAttributeRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ModifyVpcAttributeResponse> modifyVpcAttribute(ModifyVpcAttributeRequest request);

    /**
      * ## [](#)Usage notes
      * *   Before you call this operation, make sure that you fully understand the billing method of reserved instances. For more information, see [Reserved instances](~~100371~~).
      * *   Before you purchase a reserved instance, you can call the [DescribeAvailableResource](~~66186~~) operation to query available instance resources.
      *
     */
    CompletableFuture<PurchaseReservedInstancesOfferingResponse> purchaseReservedInstancesOffering(PurchaseReservedInstancesOfferingRequest request);

    /**
      * Before you call this operation, make sure that you are familiar with the billing and pricing of SCUs. For more information, see [Storage capacity units](~~137897~~).
      *
     */
    CompletableFuture<PurchaseStorageCapacityUnitResponse> purchaseStorageCapacityUnit(PurchaseStorageCapacityUnitRequest request);

    /**
      * When you call this operation, take note of the following items:
      * *   The instance must be in the `Stopped` state.****
      * *   If an instance has overdue payments for more than 15 days, the instance is stopped and released, and data on the instance can no longer be recovered. You must complete the overdue payments and reactivate the instance within 15 days. If you cannot reactivate an instance that resides in a virtual private cloud (VPC), wait a few minutes and try again.
      * *   After the operation is called, the instance enters the `Starting` state.****
      * *   You cannot call this operation on ECS instances that are locked for security reasons. If `OperationLocks` in the response returned for the DescribeInstances operation contains `LockReason: security`, the instance is locked for security reasons. For more information, see [API behavior when an instance is locked for security reasons](~~25695~~).
      *
     */
    CompletableFuture<ReActivateInstancesResponse> reActivateInstances(ReActivateInstancesRequest request);

    /**
      * When you call this operation, take note of the following points:
      * *   The disk that you want to re-initialize must be in the **In Use** (In_use) state and the instance to which the disk is attached must be in the **Stopped** (Stopped) state.
      * *   If the instance has never been started since it was created, the disks attached to it cannot be re-initialized.
      * *   If a local snapshot has been created for a disk, the disk cannot be re-initialized.
      * *   When a system disk is re-initialized, it is restored to the state of the image from which it was created. If the source image is deleted, the system disk cannot be re-initialized.
      * *   When a separately created data disk is re-initialized, it is restored to an empty data disk.
      * *   When a data disk that was created from a snapshot is re-initialized, the disk is restored to the state of the snapshot.
      * > If the source snapshot is deleted, the disk cannot be re-initialized and an error is returned.
      *
     */
    CompletableFuture<ReInitDiskResponse> reInitDisk(ReInitDiskRequest request);

    /**
      * *   Only instances that are in the `Running` state can be restarted.****
      * *   After an instance is restarted, the status of the instance changes to `Starting`.****
      * *   An instance can be forcibly restarted. A forced restart (`ForceStop`) is equivalent to performing a hard restart. This operation can cause data loss if data in the instance is not written to the disk.
      * *   If you call the DescribeInstances operation to query the details of an instance and `OperationLocks` in the response contains "LockReason": "security", the instance is locked for security reasons and cannot be restarted. For more information, see [API behavior when an instance is locked for security reasons](~~25695~~).
      *
     */
    CompletableFuture<RebootInstanceResponse> rebootInstance(RebootInstanceRequest request);

    /**
      * *   The ECS instances must be in the `Running` state.****
      * *   You can use the `BatchOptimization` parameter to specify the batch operation mode and restart multiple instances at a time.
      * *   Instances can be forcefully restarted. A forced restart (`ForceReboot`) is equivalent to powering off a traditional server and then restarting the server. If data in the instance operating system is not written to block storage devices when the operation is called, the data may be lost.
      * *   If OperationLocks in the response of the DescribeInstances operation contains `"LockReason" : "security"` for an instance, the instance is locked for security reasons and all operations are prohibited on it.
      *
     */
    CompletableFuture<RebootInstancesResponse> rebootInstances(RebootInstancesRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<RecoverVirtualBorderRouterResponse> recoverVirtualBorderRouter(RecoverVirtualBorderRouterRequest request);

    /**
      * If a dedicated host is in the UnderAssessment state, we recommend that you call this operation to migrate ECS instances away from the dedicated host to prevent permanent failures. You can call the [DescribeDedicatedHosts](~~134242~~) operation to query the status of a dedicated host.
      *
     */
    CompletableFuture<RedeployDedicatedHostResponse> redeployDedicatedHost(RedeployDedicatedHostRequest request);

    /**
      * RedeployInstance is an asynchronous operation. This operation migrates data before it restarts the instance. After the instance is redeployed, the instance enters the `Running` state. If the instance fails to be redeployed, the instance returns to the original physical server and the state before redeployment.
      * Take note of the following items:
      * * The instance must be in the Running or Stopped state. After the instance is redeployed, the following changes occur to the status of the instance:
      *   * If the instance is in the `Running` state before redeployment, the instance enters the `Stopping` state.
      *   * If the instance is in the `Stopped` state before redeployment, the instance enters the `Starting` state.
      * * If an instance is deployed on a dedicated host, you cannot redeploy the instance.
      * * If the `OperationLocks` parameter in the response of the DescribeInstances operation contains `"LockReason" : "security"` for an instance, the instance is locked for security reasons and cannot be redeployed.
      * * If you receive notifications about simulated events that are created by calling the CreateSimulatedSystemEvent operation for an instance, you cannot redeploy the instance.
      * * If the damaged local disk is isolated but the **SystemMaintenance.RebootAndReInitErrorDisk** event is not sent when you handle a local disk-related system event for an instance, you can still call the RedeployInstance operation to redeploy the instance. The SystemMaintenance.RebootAndReInitErrorDisk event indicates that the instance is restarted and the damaged disks are reinitialized due to system maintenance. For more information, see [System events for ECS instances equipped with local disks](~~107693~~).
      * The following table describes the system events that you can handle by calling the RedeployInstance operation. The table also provides possible event status.
      * |System event|Event status|
      * |---|---|
      * |Instance restart due to system maintenance (SystemMaintenance.Reboot)|Inquiring and Scheduled|
      * |Instance redeployment due to system maintenance (SystemMaintenance.Redeploy)|Inquiring and Scheduled|
      * |Instance restart and replacement of damaged disks due to system maintenance (SystemMaintenance.RebootAndIsolateErrorDisk)|Inquiring|
      * |Instance restart and re-initialization of damaged disks due to system maintenance (SystemMaintenance.RebootAndReInitErrorDisk)|Inquiring|
      * |Instance redeployment due to system errors (SystemFailure.Redeploy)|Inquiring and Scheduled|
      * |For ECS instances that use only local disks: instance restart due to a system error (SystemFailure.Reboot)|Executing|
      * |Isolation of damaged disks due to system maintenance (SystemMaintenance.IsolateErrorDisk)|Inquiring|
      * |Re-initialization of damaged disks due to system maintenance (SystemMaintenance.ReInitErrorDisk)|Inquiring|
      * **Note**When instances that use local disks are redeployed, the local disks are re-initialized and data on the local disks is cleared.
      *
     */
    CompletableFuture<RedeployInstanceResponse> redeployInstance(RedeployInstanceRequest request);

    /**
      * If the release mode of a capacity reservation that takes effect immediately is set to manual release, you can call this operation to release the capacity reservation.
      *
     */
    CompletableFuture<ReleaseCapacityReservationResponse> releaseCapacityReservation(ReleaseCapacityReservationRequest request);

    /**
      * ## Usage notes
      * Before you release a pay-as-you-go dedicated host, make sure that no ECS instances are deployed on the dedicated host.
      *
     */
    CompletableFuture<ReleaseDedicatedHostResponse> releaseDedicatedHost(ReleaseDedicatedHostRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ReleaseEipAddressResponse> releaseEipAddress(ReleaseEipAddressRequest request);

    CompletableFuture<ReleasePublicIpAddressResponse> releasePublicIpAddress(ReleasePublicIpAddressRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<RemoveBandwidthPackageIpsResponse> removeBandwidthPackageIps(RemoveBandwidthPackageIpsRequest request);

    CompletableFuture<RemoveTagsResponse> removeTags(RemoveTagsRequest request);

    /**
      * Valid vouchers can be applied when you renew the subscription plan dedicated hosts. In order to use vouchers, make sure that your account supports the credit card payment method.
      *
     */
    CompletableFuture<RenewDedicatedHostsResponse> renewDedicatedHosts(RenewDedicatedHostsRequest request);

    /**
      * *   Before you call this operation, make sure that you are familiar with the billing methods and pricing of ECS. For more information, see the [Elastic Compute Service](https://www.alibabacloud.com/product/ecs#pricing) product page.
      * *   You can call this operation to renew a subscription instance for a specific period of time or to a synchronized expiration date.
      * *   You cannot call this operation to renew a subscription instance for a specific period of time and to a synchronized expiration date at the same time. The parameter pair (`Period` and `PeriodUnit`) that is related to the renewal period and `ExpectedRenewDay` are mutually exclusive.
      * *   Your account must have sufficient credits.
      *
     */
    CompletableFuture<RenewInstanceResponse> renewInstance(RenewInstanceRequest request);

    /**
      * The IDs of the reserved instances.
      *
     */
    CompletableFuture<RenewReservedInstancesResponse> renewReservedInstances(RenewReservedInstancesRequest request);

    /**
      * ## [](#)Usage notes
      * Take note of the following items:
      * *   The category of the system disk cannot be changed.
      * *   The billing method of the system disk cannot be changed.
      * *   The instance must be in the `Stopped` state.
      *     **
      *     **Note** The operation is applicable only to instances of the Virtual Private Cloud (VPC) type. If the instance is a pay-as-you-go instance and economical mode is enabled by default for the instance, you must disable economical mode and enable standard mode when you stop the instance. This prevents the instance from being unable to restart due to insufficient ECS resources after the system disk is replaced. For more information, see [StopInstance](~~25501~~).
      * *   The ECS instance cannot be locked for security reasons. If the value of `OperationLocks` in the DescribeInstances response contains `"LockReason": "security"` for an instance, the instance is locked for security reasons. For more information, see [API behavior when an instance is locked for security reasons](~~25695~~).
      * *   No unpaid orders are associated with the instance.
      * *   You can configure `SystemDisk.Size` to specify the capacity of the new system disk.
      * After you call the ReplaceSystemDisk operation, you can use one of the following methods to check whether the system disk is replaced:
      * *   Call the [DescribeDisks](~~25514~~) operation to query the status of the new system disk. If the new system disk is in the In Use state, the system disk is replaced.
      * *   Call the [DescribeInstances](~~25506~~) operation to query the status of the instance whose system disk is replaced. If the `OperationLocks` parameter is empty, the system disk is replaced.
      *
     */
    CompletableFuture<ReplaceSystemDiskResponse> replaceSystemDisk(ReplaceSystemDiskRequest request);

    CompletableFuture<ReportInstancesStatusResponse> reportInstancesStatus(ReportInstancesStatusRequest request);

    /**
      * When you call this operation, take note of the following items:
      * *   The disk must be in the In Use (In_Use) or Unattached (Available) state.
      * *   The Elastic Compute Service (ECS) instance to which the disk is attached must be in the Stopped (Stopped) state. You can call the [StopInstances](~~155372~~) operation to stop an instance.
      * *   The snapshot specified by the SnapshotId parameter must be created from the disk specified by the DiskId parameter.
      * *   When you call the [DescribeInstances](~~25506~~) operation to query instance information and the response contains `{"OperationLocks": {"LockReason" : "security"}}`, then this indicates that the instance is locked for security reasons and no operations can be performed on the instance.
      *
     */
    CompletableFuture<ResetDiskResponse> resetDisk(ResetDiskRequest request);

    /**
      * This operation will be removed in the future. We recommend that you call the [ResetDisk](~~25520~~) operation to roll back a disk.
      *
     */
    CompletableFuture<ResetDisksResponse> resetDisks(ResetDisksRequest request);

    /**
      * ## [](#)Usage notes
      * >  Before you call this operation to resize a disk, you must check the partition format of the disk. A master boot record (MBR) disk cannot be resized to a size that is larger than 2 TiB. If you resize an MBR disk to a size that is larger than 2 TiB, data may be lost. If you want to resize an MBR disk to a size that is larger than 2 TiB, we recommend that you perform the following steps: Create another data disk that is larger than 2 TiB in size, partition and format the new data disk to GUID partition table (GPT), and then copy data from the MBR disk to the new GPT data disk. For more information, see [Step 1: Resize a disk to extend its capacity](~~44986~~).
      * *   You can resize the following categories of disks: basic disks (`cloud`), ultra disks (`cloud_efficiency`), SSDs (`cloud_ssd`), enhanced SSDs (ESSDs)(`cloud_essd`), and ESSD AutoPL disks (cloud_auto).
      * *   A disk cannot be resized when a snapshot is being created for the disk.
      * *   The Elastic Compute Service (ECS) instance to which the disk is attached must be in the **Running** (`Running`) or **Stopped** (`Stopped`) state.
      * *   After you resize a disk, the partitions and file systems of the disk are not changed. You must allocate the storage space on the disk after the disk is resized.
      * *   Disks for which the multi-attach feature is enabled support online resizing and offline resizing. Before you resize the disks offline, make sure that the instances to which the disks are attached are in the **Stopped** (`Stopped`) state.
      *
     */
    CompletableFuture<ResizeDiskResponse> resizeDisk(ResizeDiskRequest request);

    /**
      * In the security group-related API documents, inbound traffic refers to the traffic sent by the source and received by the destination.
      * When you call this operation, you can use one of the following groups of parameters to specify the security group rules that you want to delete:
      * *   Parameters used to specify the IDs of security group rules. We recommend that you specify the IDs of security group rules to delete the rules. - If the security group rule ID that you specify does not exist, an error is reported. - You cannot specify the parameters that are no longer available and their Permissions.N-prefixed counterparts at the same time. - Sample request:
      *         http(s)://ecs.aliyuncs.com/?Action=RevokeSecurityGroup
      *         &SecurityGroupId=sg-bp67acfmxazb4p****
      *         &SecurityGroupRuleId.1=sgr-bpdfmk****
      *         &SecurityGroupRuleId.2=sgr-bpdfmg****
      *         &<Common request parameters>
      * *   Parameters that are prefixed with Permissions.N.
      *     *   If no security group rule matches the specified parameters, the call to RevokeSecurityGroup is successful but no security group rules are deleted.
      *     *   You cannot specify SecurityGroupRuleId.N or the parameters that are not prefixed with Permissions.N.
      *     *   You can determine an inbound security group rule by specifying one of the following groups of parameters. You cannot determine an inbound security group rule by specifying only one parameter.
      *     *   Parameters used to determine an inbound security group rule that controls access from a CIDR block: IpProtocol, PortRange, SourcePortRange (optional), NicType, Policy, DestCidrIp (optional), and SourceCidrIp. Sample request:
      *             http(s)://ecs.aliyuncs.com/?Action=RevokeSecurityGroup
      *             &SecurityGroupId=sg-bp67acfmxazb4p****
      *             &Permissions.1.SourceCidrIp=10.0.0.0/8
      *             &Permissions.1.IpProtocol=TCP
      *             &Permissions.1.PortRange=80/80
      *             &Permissions.1.NicType=intranet
      *             &Permissions.1.Policy=accept
      *             &<Common request parameters>
      *     *   Parameters used to determine an inbound security group rule that controls access from another security group: IpProtocol, PortRange, SourcePortRange (optional), NicType, Policy, DestCidrIp (optional), and SourceGroupId. Sample request:
      *             http(s)://ecs.aliyuncs.com/?Action=RevokeSecurityGroup
      *             &SecurityGroupId=sg-bp67acfmxazb4p****
      *             &Permissions.1.SourceGroupId=sg-bp67acfmxa123b****
      *             &Permissions.1.IpProtocol=TCP
      *             &Permissions.1.PortRange=80/80
      *             &Permissions.1.NicType=intranet
      *             &Permissions.1.Policy=accept
      *             &<Common request parameters>
      *     *   Parameters used to determine an inbound security group rule that controls access from a prefix list: IpProtocol, PortRange, SourcePortRange (optional), NicType, Policy, DestCidrIp (optional), and SourcePrefixListId. Sample request:
      *             http(s)://ecs.aliyuncs.com/?Action=RevokeSecurityGroup
      *             &SecurityGroupId=sg-bp67acfmxazb4p****
      *             &Permissions.1.SourcePrefixListId=pl-x1j1k5ykzqlixdcy****
      *             &Permissions.1.IpProtocol=TCP
      *             &Permissions.1.PortRange=80/80
      *             &Permissions.1.NicType=intranet
      *             &Permissions.1.Policy=accept
      *             &<Common request parameters>
      *
     */
    CompletableFuture<RevokeSecurityGroupResponse> revokeSecurityGroup(RevokeSecurityGroupRequest request);

    /**
      * In the security group-related API documents, outbound traffic refers to the traffic sent by the source and received by the destination.
      * When you call this operation, you can use one of the following groups of parameters to specify the security group rules that you want to delete:
      * *   Parameters used to specify the IDs of security group rules. We recommend that you specify the IDs of security group rules to delete the rules. - If the security group rule ID that you specify does not exist, an error is reported. - You cannot specify the parameters that are no longer available and their Permissions.N-prefixed counterparts at the same time. - Sample request:
      *         http(s)://ecs.aliyuncs.com/?Action=RevokeSecurityGroupEgress
      *         &SecurityGroupId=sg-bp67acfmxazb4p****
      *         &SecurityGroupRuleId.1=sgr-bpdfmk****
      *         &SecurityGroupRuleId.2=sgr-bpdfmg****
      *         &<Common request parameters>
      * *   Parameters that are prefixed with Permissions.N.
      *     *   If no security group rule matches the specified parameters, the call to RevokeSecurityGroupEgress is successful but no security group rules are deleted.
      *     *   You cannot specify SecurityGroupRuleId.N or the parameters that are not prefixed with Permissions.N.
      *     *   You can determine a security group rule by specifying one of the following groups of parameters. You cannot determine a security group rule by specifying only one parameter.
      *         *   Parameters used to determine an outbound security group rule that controls access to a CIDR block: IpProtocol, PortRange, SourcePortRange (optional), NicType, Policy, SourceCidrIp (optional), and DestCidrIp. Sample request:
      *                 http(s)://ecs.aliyuncs.com/?Action=RevokeSecurityGroupEgress
      *                 &SecurityGroupId=sg-bp67acfmxazb4ph***
      *                 &Permissions.1.IpProtocol=TCP
      *                 &Permissions.1.DestCidrIp=10.0.0.0/8
      *                 &Permissions.1.PortRange=-22/22
      *                 &Permissions.1.NicType=intranet
      *                 &Permissions.1.Policy=accept
      *                 &<Common request parameters>
      *         *   Parameters used to determine an outbound security group rule that controls access to another security group: IpProtocol, PortRange, SourcePortRange (optional), NicType, Policy, SourceCidrIp (optional), and DestGroupId. Sample request:
      *                 http(s)://ecs.aliyuncs.com/?Action=RevokeSecurityGroupEgress
      *                 &SecurityGroupId=sg-bp67acfmxazb4ph***
      *                 &Permissions.1.DestGroupId=sg-bp67acfmxa123b****
      *                 &Permissions.1.IpProtocol=TCP
      *                 &Permissions.1.PortRange=22/22
      *                 &Permissions.1.NicType=intranet
      *                 &Permissions.1.Policy=accept
      *                 &<Common request parameters>
      *         *   Parameters used to determine an outbound security group rule that controls access to a prefix list: IpProtocol, PortRange, SourcePortRange (optional), NicType, Policy, SourceCidrIp (optional), and DestPrefixListId. Sample request:
      *                 http(s)://ecs.aliyuncs.com/?Action=RevokeSecurityGroupEgress
      *                 &SecurityGroupId=sg-bp67acfmxazb4ph***
      *                 &Permissions.1.IpProtocol=TCP
      *                 &Permissions.1.DestPrefixListId=pl-x1j1k5ykzqlixdcy****
      *                 &Permissions.1.PortRange=-22/22
      *                 &Permissions.1.NicType=intranet
      *                 &Permissions.1.Policy=accept
      *                 &<Common request parameters>
      *
     */
    CompletableFuture<RevokeSecurityGroupEgressResponse> revokeSecurityGroupEgress(RevokeSecurityGroupEgressRequest request);

    /**
      * ## [](#)Usage notes
      * Unlike the [CreateCommand](~~64844~~) and [InvokeCommand](~~64841~~) operations, the RunCommand operation can be used to create and run a command in a single request.
      * Take note of the following items:
      * *   The instances on which you want to run a command must be in the Running (`Running`) state. You can call the [DescribeInstances](~~25506~~) operation to query the status of instances.
      * *   [Cloud Assistant Agent](~~64921~~) must be installed on the instances.
      * *   Before you run a PowerShell command on a Windows instance, make sure that the PowerShell module is installed on the instance.
      * *   When you use a cron expression to specify a schedule, you can specify a time zone based on your business requirements. If you do not specify a time zone, the schedule is determined by the system time of the instances. Make sure that the time or time zone of the instances meets your business requirements. For information about time zones, see [Configure the NTP service for ECS instances that run CentOS 6](~~92803~~) or [Configure the NTP service for Windows instances](~~51890~~).
      * *   You can set `Timeout` to specify the timeout period for executions of the command on ECS instances. If an execution times out, Cloud Assistant Agent forcefully terminates the command process.
      *     *   When the one-time execution of the command times out, the execution state ([InvokeRecordStatus](~~64845~~)) of the command becomes Failed.
      *     *   For a scheduled task, the timeout period takes effect on each execution of the command. When a command execution times out, the subsequent executions of the command are not affected. When a scheduled execution of the command times out, the execution state ([InvokeRecordStatus](~~64845~~)) of the command becomes Failed.
      *     To ensure that scheduled tasks can run as expected, make sure that the version of Cloud Assistant Agent is not earlier than the following ones. A scheduled task can run a command at a specified interval, only once at a specified time, or at designated times based on a cron expression in a specified year or time zone. If the `ClientNeedUpgrade` error code is returned, you must update Cloud Assistant Agent to the latest version. For more information, see [Upgrade or disable upgrades of Cloud Assistant Agent](~~134383~~).
      *         - Linux: 2.2.3.282.
      *         - Windows: 2.1.3.282.
      * *   Command executions may fail due to instance status exceptions, network exceptions, or exceptions on Cloud Assistant Agent. If a command execution fails, no execution information is generated. For more information, see the [Command errors and solutions](~~87029~~) section in the "Check execution results and troubleshoot common issues" topic.
      * *   If you set `EnableParameter` to true, the custom parameter feature is enabled. When you configure `CommandContent`, you can define custom parameters in the `{{parameter}}` format. Then, when the command is run, the key-value pairs of the custom parameters are passed in.
      * *   You can retain up to 500 to 50,000 Cloud Assistant commands in each region. You can also apply for a quota increase. For information about how to query and increase quotas, see [Manage quotas](~~184116~~).
      * *   Before you run a command on instances, especially new instances, we recommend that you call the [DescribeCloudAssistantStatus](~~87346~~) operation to query the status of Cloud Assistant Agent on the instances and run the command when the value of CloudAssistantStatus in the response is true for the instances.
      *
     */
    CompletableFuture<RunCommandResponse> runCommand(RunCommandRequest request);

    /**
      * ## [](#)Usage notes
      * *   **Preparations**:
      *     *   Cost estimation: Learn about the billing methods of ECS resources. For more information, see [Billing overview](~~25398~~).
      *     *   Instance type selection: Call the [DescribeInstanceTypes](~~25620~~) operation to query the performance data of instance types, or see [Best practices for selecting instance types](~~58291~~) to learn about how to select instance types.
      *     *   Query of available resources: Call the [DescribeAvailableResource](~~66186~~) operation to query resources available in a specific region or zone.
      *     *   Network planning: Make sure that you have security groups available for use. For more information, see [CreateSecurityGroup](~~25553~~). Before you create an instance of the Virtual Private Cloud (VPC) type, [create a VPC](~~65430~~) in the region where you want to create the instance.
      * *   **Comparison with CreateInstance**:
      *     RunInstances has the following advantages over CreateInstance:
      *     *   You can call the RunInstances operation to create up to 100 instances at a time, instead of repeatedly calling the CreateInstance operation.
      *     *   After an instance is created, the instance enters the `Starting` state and then transitions to the `Running` state. You do not need to call the [StartInstance](~~25500~~) operation to start the instance.
      *     *   When you create an instance, you can specify `InternetMaxBandwidthOut` to assign a public IP address to the instance, without the need to call the [AllocatePublicIpAddress](~~25544~~) operation.
      *     *   You can use `AutoReleaseTime` to set the time when to automatically release the instances, without the need to call the [ModifyInstanceAutoReleaseTime](~~47576~~) operation.
      *     *   You can specify `LaunchTemplateId` and `LaunchTemplateVersion` to use a launch template. This way, you do not need to configure a large number of parameters every time you create instances.
      *     *   You can specify `UniqueSuffix` to batch configure sequential names or hostnames for multiple instances for easy management and retrieval.
      *     *   When you call the RunInstances operation to create instances, you can configure the enclave-based confidential computing mode and the trusted system mode for the instances.
      *     *   You can set `NetworkOptions.EnableJumboFrame` to true to enable the Jumbo Frames feature when you create instances. For more information, see [MTUs](~~200512~~).
      * *   **Considerations**:
      *     *   You can create up to 100 instances at a time.
      *     *   You can use `AutoReleaseTime` to set the time when to automatically release the instances.
      *     *   After you create instances and obtain their IDs, you can call the [DescribeInstances](~~25506~~) operation to check the status of the instances.
      *     *   By default, instances automatically start after they are created. Instances are ready for use when they are in the Running (`Running`) state.
      *     *   Starting November 27, 2020, the maximum bandwidth value that is available for you to create ECS instances or change ECS instance configurations is subject to the throttling policy of your account. To increase the maximum bandwidth value, submit a ticket. The throttling policy imposes the following constraints: In a single region, the total maximum bandwidth value of all instances that use the pay-by-traffic billing method for network usage cannot exceed 5 Gbit/s and the total maximum bandwidth value of all instances that use the pay-by-bandwidth billing method for network usage cannot exceed 50 Gbit/s.
      *     *   Different from the [CreateInstance](~~25499~~) operation, the `RunInstances` operation allows the system to assign public IP addresses to new instances if you set `InternetMaxBandwidthOut` to a value greater than 0.
      *     *   When you call the RunInstances operation to create an instance, you can use one of the following methods to attach a primary elastic network interface (ENI) to the instance. Take note that you can use only one of the methods to configure the primary ENI in each call. Otherwise, the call fails and an error message is returned.
      *         *   Specify parameters such as `SecurityGroupId`, `VSwitchId`, `PrivateIpAddress`, `NetworkInterfaceQueueNumber`, and `Ipv6AddressCount` to configure the primary ENI.
      *         *   Specify parameters that start with `NetworkInterface.N.` to configure the primary and secondary ENIs. If `NetworkInterface.N.InstanceType` is set to `Primary`, the primary ENI is attached to the instance. If `NetworkInterface.N.InstanceType` is set to `Secondary` or left empty, the secondary ENI is attached to the instance.
      *     *   If a parameter is invalid or available resources are insufficient, an error is returned after you call the RunInstances operation. For more information, see the "Error codes" section of this topic.
      *         *   If the maximum number of instances of the specified instance type that can be created in the specified region or the maximum number of vCPUs for all instance types in a zone is exceeded, the `QuotaExceed.ElasticQuota` error is returned when you call the operation. You can go to the [ECS console](https://ecs.console.aliyun.com/?spm=a2c8b.12215451.favorites.decs.5e3a336aMGTtzy#/privileges/quota) or the [Quota Center](https://quotas.console.aliyun.com/products/ecs/quotas) to request a quota increase.
      *         *   If the capacity of disks that belong to the specified disk category exceeds the quota limit for the specified zone, the `QuotaExceed.DiskCapacity` error is returned when you call the operation. You can go to the [Quota Center](https://quotas.console.aliyun.com/products/disk/quotas) to view and increase the disk capacity quota.
      * *   **Best practices**:
      *     *   We recommend that you use auto provisioning groups in the following scenarios: Resources are insufficient to create more than 100 instances at a time, you want to quickly create instances regardless of resource configurations such as instance types or zones, or you want to create instances to consume a specific total number of vCPUs regardless of the number of instances. You can call the [CreateAutoProvisioningGroup](~~122738~~) operation to create an auto provisioning group to deploy an instance cluster across different zones, different billing methods, and instance families. For more information, see [Use auto provisioning group-related API operations to batch create ECS instances](~~200772~~).
      *     *   You can call the `RunInstances` operation to batch create instances. To better manage and search for the instances, we recommend that you add tags to the instances by specifying `Tag.N.Key` and `Tag.N.Value`. You can also append incremental suffixes (`UniqueSuffix`) to the hostname (`HostName`) and to the instance name (`InstanceName`).
      *     *   A launch template contains parameters required to create an instance so that you do not have to specify these parameters every time you create instances. You can call the [CreateLaunchTemplate](~~74686~~) operation to create a launch template. Then, in your request to call the `RunInstances` operation, you can specify `LaunchTemplateId` and `LaunchTemplateVersion` to use the launch template.
      * ### [](#-1)Example 1: Create a subscription instance
      * Use the aliyun\\_3\\_x64\\_20G_alibase\\_20221102.vhd image to create a one-month subscription instance of the ecs.g7.large instance type in the China (Hangzhou) region, and enable auto-renewal to renew the instance for one month on expiration. The instance uses a 40 GiB enhanced SSD (ESSD) as the system disk and a 100 GiB ESSD as a data disk and is automatically assigned private and public IP addresses. The outbound public bandwidth of the instance is 10 Mbit/s. The instance name is ECS-test and the logon password of the instance is ECS@test1234.
      *     http(s)://ecs.aliyuncs.com/?Action=RunInstances
      *     &RegionId=cn-hangzhou
      *     &ImageId=aliyun_3_x64_20G_alibase_20221102.vhd
      *     &InstanceType=ecs.g7.large
      *     &SecurityGroupId=sg-bp150uqocpf9jj70****
      *     &VSwitchId=vsw-bp1qo7s91cbch5i4l****
      *     &InstanceChargeType=PrePaid
      *     &SystemDisk.Size=40
      *     &DataDisk.1.Size=100
      *     &DataDisk.1.Category=cloud_essd
      *     &SystemDisk.Category=cloud_essd
      *     &Amount=1
      *     &Period=1
      *     &PeriodUnit=Month
      *     &AutoRenew=true
      *     &AutoRenewPeriod=1
      *     &HostName=ECS-test
      *     &Password=ECS@test1234
      *     &InternetMaxBandwidthOut=10
      *     &<Common request parameters>
      * ### [](#-2)Example 2: Create a pay-as-you-go instance
      * Use the aliyun\\_3\\_x64\\_20G_alibase\\_20221102.vhd image to create a pay-as-you-go instance of the ecs.g7.large instance type in the China (Hangzhou) region. The instance uses a 40 GiB ESSD as the system disk and a 100 GiB ESSD as a data disk and is automatically assigned private and public IP addresses. The outbound public bandwidth of the instance is 10 Mbit/s. The instance name is ECS-test and the logon password of the instance is ECS@test1234.
      *     http(s)://ecs.aliyuncs.com/?Action=RunInstances
      *     &RegionId=cn-hangzhou
      *     &ImageId=aliyun_3_x64_20G_alibase_20221102.vhd
      *     &InstanceType=ecs.g7.large
      *     &SecurityGroupId=sg-bp150uqocpf9jj70****
      *     &VSwitchId=vsw-bp1qo7s91cbch5i4l****
      *     &InstanceChargeType=PostPaid
      *     &SystemDisk.Size=40
      *     &DataDisk.1.Size=100
      *     &DataDisk.1.Category=cloud_essd
      *     &SystemDisk.Category=cloud_essd
      *     &HostName=ECS-test
      *     &Password=ECS@test1234
      *     &InternetMaxBandwidthOut=10
      *     &<Common request parameters>
      * ### [](#-3)Example 3: Create a preemptible instance
      * Use the aliyun\\_3\\_x64\\_20G_alibase\\_20221102.vhd image to create a preemptible instance of the ecs.g7.large instance type that has a 1-hour protection period in the China (Hangzhou) region. The market price of the instance type at the time of purchase is automatically used as the bidding price. The instance uses a 40 GiB ESSD as the system disk and a 100 GiB ESSD as a data disk and is automatically assigned private and public IP addresses. The outbound public bandwidth of the instance is 10 Mbit/s. The instance name is ECS-test and the logon password of the instance is ECS@test1234.
      *     http(s)://ecs.aliyuncs.com/?Action=RunInstances
      *     &RegionId=cn-hangzhou
      *     &ImageId=aliyun_3_x64_20G_alibase_20221102.vhd
      *     &InstanceType=ecs.g7.large
      *     &SecurityGroupId=sg-bp150uqocpf9jj70****
      *     &VSwitchId=vsw-bp1qo7s91cbch5i4l****
      *     &InstanceChargeType=PostPaid
      *     &SystemDisk.Size=40
      *     &DataDisk.1.Size=100
      *     &DataDisk.1.Category=cloud_essd
      *     &SystemDisk.Category=cloud_essd
      *     &HostName=ECS-test
      *     &Password=ECS@test1234
      *     &InternetMaxBandwidthOut=10
      *     &SpotStrategy=SpotAsPriceGo
      *     &SpotDuration=1
      *     &<Common request parameters>
      * ### [](#-4)Example 4: Create a subscription instance on a dedicated host
      * Use the aliyun\\_3\\_x64\\_20G_alibase\\_20221102.vhd image to create a one-month subscription instance of the ecs.g7.large instance type on the dh-bp12w10wll9xcjq2\\*\\*\\*\\* dedicated host in the China (Hangzhou) region. The instance uses a 40 GiB ESSD as the system disk and a 100 GiB ESSD as a data disk and is automatically assigned private and public IP addresses. The outbound public bandwidth of the instance is 10 Mbit/s. The instance name is ECS-test and the logon password of the instance is ECS@test1234.
      *     http(s)://ecs.aliyuncs.com/?Action=RunInstances
      *     &RegionId=cn-hangzhou
      *     &ImageId=aliyun_3_x64_20G_alibase_20221102.vhd
      *     &InstanceType=ecs.g7.large
      *     &SecurityGroupId=sg-bp150uqocpf9jj70****
      *     &VSwitchId=vsw-bp1qo7s91cbch5i4l****
      *     &InstanceChargeType=PrePaid
      *     &Amount=1
      *     &Period=1
      *     &PeriodUnit=Month
      *     &SystemDisk.Size=40
      *     &DataDisk.1.Size=100
      *     &DataDisk.1.Category=cloud_essd
      *     &SystemDisk.Category=cloud_essd
      *     &HostName=ECS-test
      *     &Password=ECS@test1234
      *     &InternetMaxBandwidthOut=10
      *     &DedicatedHostId=dh-bp12w10wll9xcjq2****
      *     &<Common request parameters>
      *
     */
    CompletableFuture<RunInstancesResponse> runInstances(RunInstancesRequest request);

    /**
      * ## Usage notes
      * *   The instances to which to send a file must be in the Running (`Running`) state.
      * *   [Cloud Assistant Agent must be installed on the instances.](~~64921~~)
      * *   Only Cloud Assistant Agent versions that are later than the following ones support file sending. If the `ClientNeedUpgrade` error code is returned, update Cloud Assistant Agent to the latest version.
      *     *   For Linux instances, the version of Cloud Assistant Agent must be later than 1.0.2.569.
      *     *   For Windows instances, the version of Cloud Assistant Agent must be later than 1.0.0.149.
      * *   The file that you want to send must not exceed 32 KB in size after it is encoded in Base64.
      * *   The file may fail to be sent due to instance exceptions, network exceptions, or exceptions on Cloud Assistant Agent. Call the [DescribeSendFileResults](~~184117~~) operation or see [Check execution results and troubleshoot common issues](~~87029~~) for troubleshooting.
      *
     */
    CompletableFuture<SendFileResponse> sendFile(SendFileRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<StartElasticityAssuranceResponse> startElasticityAssurance(StartElasticityAssuranceRequest request);

    /**
      * *   After you create an image template, you can call the StartImagePipelineExecution operation to create a pipeline task. The system creates, copies, and shares images based on the parameters configured in the image template.
      * *   You can execute only one pipeline task for each image template.
      *
     */
    CompletableFuture<StartImagePipelineExecutionResponse> startImagePipelineExecution(StartImagePipelineExecutionRequest request);

    /**
      * $.parameters[2].schema.example
      *
     */
    CompletableFuture<StartInstanceResponse> startInstance(StartInstanceRequest request);

    /**
      * ## [](#)Usage notes
      * Take note of the following items:
      * *   The instances to be started must be in the **Stopped** (`Stopped`) state.
      * *   If the response contains `{"OperationLocks": {"LockReason" : "security"}}` when you query the information of an instance, the instance is locked for security reasons. No operations are allowed on the instance.
      * *   You can use `BatchOptimization` to specify the batch operation mode and restart multiple instances at a time.
      *
     */
    CompletableFuture<StartInstancesResponse> startInstances(StartInstancesRequest request);

    /**
      * ## [](#)Usage notes
      * When you use custom code to connect to an ECS instance that serves as a client, you can call this operation to obtain the WebSocket URL that is used to connect to the instance. Take note of the following items:
      * *   The ECS instance must be in the Running state.
      * *   Cloud Assistant Agent must be installed on the ECS instance. You can call the [DescribeCloudAssistantStatus](~~87346~~) operation to check whether Cloud Assistant Agent is installed on the ECS instance and query the version number of the installed Cloud Assistant Agent.
      *     *   If Cloud Assistant Agent is not installed on the ECS instance, call the [InstallCloudAssistant](~~85916~~) operation to install Cloud Assistant Agent.
      *     *   The Cloud Assistant Agent versions that are later than the following ones support the session management feature. If you need to upgrade the Cloud Assistant Agent version, follow the instructions in [Upgrade or disable upgrades for Cloud Assistant Agent](~~134383~~).
      *         *   Linux operating system: 2.2.3.256
      *         *   Windows operating system: 2.1.3.256
      * *   Each WebSocket URL returned by the StartTerminalSession operation remains valid for 10 minutes.
      * *   Up to 1,000 sessions can be created and available in a region. Each ECS instance can have up to 20 sessions in the connected state.
      *
     */
    CompletableFuture<StartTerminalSessionResponse> startTerminalSession(StartTerminalSessionRequest request);

    /**
      * *   If you call the DescribeInstances operation to query the details of an instance and `OperationLocks` in the response contains `"LockReason": "security"`, the instance is locked for security reasons and cannot be stopped. For more information, see [API behavior when an instance is locked for security reasons](~~25695~~).
      * *   If the economical mode is enabled, you can set `StoppedMode` to KeepCharging to switch to the standard mode. This allows an instance that is stopped in standard mode to retain its instance type resources and public IP address. However, you continue to be charged for the instance.
      *
     */
    CompletableFuture<StopInstanceResponse> stopInstance(StopInstanceRequest request);

    /**
      * ## [](#)Usage notes
      * *   If the response contains `{"OperationLocks": {"LockReason" : "security"}}` when you query the information of an instance, the instance is locked for security reasons. No operations are allowed on the instance.
      * *   After you enable economical mode for a pay-as-you-go instance that resides in a virtual private cloud (VPC), you can set `StoppedMode` to KeepCharging. This way, the pay-as-you-go instance continues to be billed after the instance is stopped. The instance type resources and public IP address of the instance are retained.
      * *   Batch operations are supported. You can use `BatchOptimization` to specify the batch operation mode.
      *
     */
    CompletableFuture<StopInstancesResponse> stopInstances(StopInstancesRequest request);

    /**
      * ## [](#)Usage notes
      * *   If you stop the process of a command that runs only once, the executions that have started are not interrupted. The executions that have not started are canceled.
      * *   If you stop the process of a command that runs on a schedule, the executions that have started are not interrupted. Subsequent executions are not scheduled.
      *
     */
    CompletableFuture<StopInvocationResponse> stopInvocation(StopInvocationRequest request);

    /**
      * Before you add tags to a resource, Alibaba Cloud checks the number of existing tags of the resource. If the maximum number of tags is reached, an error message is returned. For more information, see the "Tag limits" section in [Limits](~~25412~~).
      *
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<TerminatePhysicalConnectionResponse> terminatePhysicalConnection(TerminatePhysicalConnectionRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<TerminateVirtualBorderRouterResponse> terminateVirtualBorderRouter(TerminateVirtualBorderRouterRequest request);

    /**
      * ## [](#)Usage notes
      * Take note of the following items:
      * *   The ENI must be in the **Available** (Available) or **InUse** (InUse) state.
      * *   If the ENI is a primary ENI, the Elastic Compute Service (ECS) instance to which the ENI is attached must be in the **Running** (Running) or **Stopped** (Stopped) state.
      *
     */
    CompletableFuture<UnassignIpv6AddressesResponse> unassignIpv6Addresses(UnassignIpv6AddressesRequest request);

    /**
      * ## Usage notes
      * - The ENI from which to unassign secondary private IP addresses must be in the **Available** (Available) or **Bound** (InUse) state.
      * - If the ENI is a primary ENI, the Elastic Compute Service (ECS) instance to which the ENI is attached must be in the **Running** (Running) or **Stopped** (Stopped) state.
      *
     */
    CompletableFuture<UnassignPrivateIpAddressesResponse> unassignPrivateIpAddresses(UnassignPrivateIpAddressesRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<UnassociateEipAddressResponse> unassociateEipAddress(UnassociateEipAddressRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<UnassociateHaVipResponse> unassociateHaVip(UnassociateHaVipRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

}
