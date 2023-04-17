// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ecs20140526.models.*;
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
      * Before you create a dedicated host, you can call the [DescribeAvailableResource](~~66186~~) operation to query the available resources in a specific region or zone.
      * We recommend that you understand the billing methods of resources before you create a dedicated host. You are charged for resources used by the created dedicated host. For more information, see [Billing overview](~~68978~~).
      * * You can create up to 100 pay-as-you-go or subscription dedicated hosts at a time.
      * * After a dedicated host is created, you can use its ID that is returned by the system as the value of a request parameter to call the [DescribeDedicatedHosts](~~134242~~) operation to query the state of the dedicated host.
      * * After you submit a request to create a dedicated host, an error is returned if a specific parameter is invalid or the requested resources are insufficient. For more information about error reasons, see the "Error codes" section in this topic.
      * * After a dedicated host is created, you can call the [ModifyInstanceDeployment](~~134248~~) operation to migrate ECS instances from a shared host to the dedicated host. You can also migrate ECS instances from another dedicated host to the created dedicated host.
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
      * When you call this operation, take note of the following items:
      * *   The instance to which to assign a public IP address must be in the **Running** (`Running`) or **Stopped** (`Stopped`) state.
      * *   If `OperationLocks` in the DescribeInstances response contains `"LockReason" : "security"` for an instance, the instance is [locked for security reasons](~~25695~~) and cannot be assigned a public IP address.
      * *   You can assign only a single public IP address to an instance. If the instance already has a public IP address, the `AllocatedAlready` error code is returned.
      * *   After you assign a public IP address to an instance, you must restart the instance ([RebootInstance](~~25502~~)) or start the instance ([StartInstance](~~25500~~)) for the public IP address to take effect.
      * If an instance is located in a virtual private cloud (VPC), you can assign a public IP address to the instance or associate an elastic IP address (EIP) with the instance. For more information, see [AssociateEipAddress](~~36017~~).
      * > After an EIP is associated with an instance located in a VPC, no public IP addresses can be assigned to the instance.
      *
     */
    CompletableFuture<AllocatePublicIpAddressResponse> allocatePublicIpAddress(AllocatePublicIpAddressRequest request);

    /**
      * *   Each disk can have only one automatic snapshot policy applied.
      * *   Each automatic snapshot policy can be applied to multiple disks.
      *
     */
    CompletableFuture<ApplyAutoSnapshotPolicyResponse> applyAutoSnapshotPolicy(ApplyAutoSnapshotPolicyRequest request);

    /**
      * You can specify IPv6 addresses that are in the CIDR block of the vSwitch with which the ENI is associated, or specify the number of IPv6 addresses to automatically generate for the ENI. When you call this operation, take note of the following items:
      * *   IPv6 must be enabled for the vSwitch with which the ENI is associated. For more information, see [Enable IPv6 for a vSwitch](~~98923~~).
      * *   The ENI must be in the Available (Available) or InUse (InUse) state.
      * *   If you want to assign IPv6 addresses to a primary ENI, make sure that the instance to which the ENI is attached is in the Running (Running) or Stopped (Stopped) state.
      * *   The maximum number of IPv6 addresses that can be assigned to an ENI varies per instance type.
      *     *   If the ENI is in the Available (Available) state, it can be assigned a maximum of 10 IPv6 addresses.
      *     *   If the ENI is already attached to an Elastic Compute Service (ECS) instance, the maximum number of IPv6 addresses that can be assigned to the ENI varies based on the instance type. For more information, see [Overview of instance families](~~25378~~).
      * *   After the operation is called, you can obtain the IPv6 addresses that are assigned to the ENI from the response.
      *
     */
    CompletableFuture<AssignIpv6AddressesResponse> assignIpv6Addresses(AssignIpv6AddressesRequest request);

    /**
      * *   The ENI to which you want to assign secondary private IP addresses must be in the Available or InUse state.
      * *   When you assign secondary private IP addresses to a primary ENI, the instance to which the ENI is attached must be in the Running or Stopped state.
      * *   When an ENI is in the Available state, you can assign up to 50 secondary private IP addresses to it. When an ENI is attached to an instance, the number of secondary private IP addresses that can be assigned to the ENI is subject to the instance type. For more information, see [Instance families](~~25378~~).
      * *   After you call this operation for an ENI, you can obtain the secondary private IP addresses that are assigned to the ENI from the response.
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
      * ## Description
      * When you call this operation, take note of the following items:
      * *   The instance to be connected must be in the **Running** state or **Stopped** state.
      * *   The ClassicLink feature must be enabled for the target VPC. For more information, see [Enable ClassicLink](~~65413~~).
      * *   The instance and the VPC must be in the same region.
      *
     */
    CompletableFuture<AttachClassicLinkVpcResponse> attachClassicLinkVpc(AttachClassicLinkVpcRequest request);

    /**
      * When you call this operation, take note of the following points:
      * *   The disk to be attached must be in the **Unattached** (`Available`) state.
      * *   When the disk is attached as a data disk, take note of the following items:
      *     *   The instance must be in the **Running** (`Running`) or **Stopped** (`Stopped`) state.
      *     *   If the disk was separately purchased, the billing method of the disk must be pay-as-you-go.
      *     *   If the disk is a system disk detached from an instance, no limits apply to the billing method of the disk.
      * *   When the disk is attached as a system disk, take note of the following items:
      *     *   The instance must be the original instance from which the system disk was detached.
      *     *   The instance must be in the **Stopped** (`Stopped`) state.
      *     *   The logon credentials must be configured.
      * *   If the response contains `{"OperationLocks": {"LockReason" : "security"}}` when you query the information of the instance, the instance is locked for security reasons and all operations are prohibited on it.
      * *   Disks for which the multi-attach feature is enabled can be attached only to instances that support the NVMe protocol. For more information, see [NVMe protocol](~~256487~~) and [Use the multi-attach feature](~~262105~~).
      *
     */
    CompletableFuture<AttachDiskResponse> attachDisk(AttachDiskRequest request);

    CompletableFuture<AttachInstanceRamRoleResponse> attachInstanceRamRole(AttachInstanceRamRoleRequest request);

    /**
      * When you call this operation, take note of the following items:
      * *   SSH key pairs are not supported on Windows instances.
      * *   If an SSH key pair is attached to an instance, the username and password authentication method is disabled for the instance.
      * *   If you attach an SSH key pair to an instance in the **Running** state, you must call the [RebootInstance](~~25502~~) operation to restart the instance for the key pair to take effect.
      * *   If you attach an SSH key pair to an instance in the **Stopped** state, you must call the [StartInstance](~~25500~~) operation to start the instance for the key pair to take effect.
      * *   If an instance already has an SSH key pair attached, the new SSH key pair will replace the original one.
      *
     */
    CompletableFuture<AttachKeyPairResponse> attachKeyPair(AttachKeyPairRequest request);

    /**
      * When you call this operation, take note of the following items:
      * *   The ENI must be in the **Available** (`Available`) state. Each ENI can be attached to only a single instance that resides in the same zone and VPC as the ENI.
      * *   The instance must be in the Running (Running) or Stopped (Stopped) state. When you attach ENIs to instances of some instance types, make sure that the instances are in the Stopped (Stopped) state. For more information, see the "Instance types of the ECS instances that must be in the Stopped (Stopped) state" section in [Bind an ENI](~~58503~~).
      *     > If the last start time of the instance (including the start time of the instance if it is newly purchased, the last restart time of the instance, and the last reactivation time of the instance) is before April 1, 2018 and the instance stays in the Running state, you must call the RebootInstance operation to restart the instance. If you do not call the RebootInstance operation to restart the instance, the ENI cannot be attached to the instance.
      * *   You can attach multiple ENIs to a single instance. For more information, see [ENI overview](~~58496~~).
      * *   The vSwitch to which the ENI is connected must be in the same zone and VPC as the vSwitch to which the instance is connected.
      * *   This operation is an asynchronous operation. After this operation is called to attach an ENI, you can check the status or events of the ENI to determine whether the ENI is attached. The following figure shows the transitions between the states of the ENI.
      * ![](https://static-aliyun-doc.oss-cn-hangzhou.aliyuncs.com/file-manage-files/en-US/20230223/vqky/AttachNetworkInterface.png) 
      * If the ENI is in the Attaching state, the ENI attachment request is sent and the ENI is being attached to the specified instance. If the ENI is in the InUse state, the ENI is attached to the specified instance. If the ENI is in the Available state, the ENI fails to be attached.
      * **For information about examples on how to call this operation, see** [Attach an ENI](~~471550~~).
      *
     */
    CompletableFuture<AttachNetworkInterfaceResponse> attachNetworkInterface(AttachNetworkInterfaceRequest request);

    /**
      * When you call this operation, take note of the following items:
      * *   The total number of inbound and outbound security group rules in each security group cannot exceed 200. For more information, see the "Security group limits" section in [Limits](~~25412#SecurityGroupQuota1~~).
      * *   The valid value of Priority ranges from 1 to 100. A smaller value indicates a higher priority.
      * *   When multiple security group rules have the same priority, drop rules take precedence.
      * *   The source can be a CIDR block specified by SourceCidrIp, Ipv6SourceCidrIp, or SourcePrefixListId or can be Elastic Compute Service (ECS) instances in a security group specified by SourceGroupId.
      * *   Security groups cannot be referenced as authorization objects in rules of advanced security groups.
      * *   Up to 20 security groups can be referenced as authorization objects in the rules of each basic security group.
      * *   If the specified security group rule exists in the security group, the call is successful but no security group rule is created.
      * *   The `Permissions.N` prefix is added to some parameters to generate new parameters. Original parameters andparameters prefixed with Permissions.N cannot be specified together. We recommend that you use parameters prefixed with `Permissions.N`.
      * *   You can determine a security group rule by specifying one of the following groups of parameters. You cannot determine a security group rule by specifying only one parameter.
      *     *   Parameters used to specify an inbound security group rule that controls access from a specific CIDR block: IpProtocol, PortRange, SourcePortRange (optional), NicType, Policy, and SourceCidrIp. For a security group of the Virtual Private Cloud (VPC) type, you must set the NicType parameter to intranet. For a security group of the classic network type, you can set the NicType parameter to either internet or intranet. Sample request:
      *             http(s)://ecs.aliyuncs.com/?Action=AuthorizeSecurityGroup
      *             &SecurityGroupId=sg-bp67acfmxazb4p****
      *             &Permissions.1.SourceCidrIp=10.0.0.0/8
      *             &Permissions.1.IpProtocol=TCP
      *             &Permissions.1.PortRange=22/22
      *             &Permissions.1.NicType=intranet
      *             &Permissions.1.Policy=Accept
      *             &<Common request parameters>
      *     *   Parameters used to specify an inbound security group rule that controls access from a security group: IpProtocol, PortRange, SourcePortRange (optional), NicType, Policy, SourceGroupOwnerAccount, and SourceGroupId. In this case, you must set the NicType parameter to intranet. For access control between security groups in the classic network, you can allow or deny other security groups within the same region to access your security group. The security groups that are allowed to access your security group can belong to your own Alibaba Cloud account or another Alibaba Cloud account specified by the SourceGroupOwnerAccount parameter. For access control between security groups in VPCs, you can allow or deny another security group within the same VPC to access your security group. Sample request:
      *             http(s)://ecs.aliyuncs.com/?Action=AuthorizeSecurityGroup
      *             &SecurityGroupId=sg-bp67acfmxazb4p****
      *             &Permissions.1.SourceGroupId=sg-1651FBB**
      *             &Permissions.1.SourceGroupOwnerAccount=test@aliyun.com
      *             &Permissions.1.IpProtocol=TCP
      *             &Permissions.1.PortRange=22/22
      *             &Permissions.1.NicType=intranet
      *             &Permissions.1.Policy=Drop
      *             &<Common request parameters>
      *     *   Parameters used to specify an outbound security group rule that controls access to a prefix list: IpProtocol, PortRange, SourcePortRange (optional), NicType, Policy, and DestPrefixListId. In this case, prefix lists support only security groups in VPCs. NicType must be set to intranet. Sample request:
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
      * When you call this operation, take note of the following items:
      * *   The total number of inbound and outbound security group rules in each security group cannot exceed 200. For more information, see the "Security group limits" section in [](~~25412#SecurityGroupQuota1~~).
      * *   You can set Policy to accept or drop for each security group rule to allow or deny access.
      * *   The valid value of Priority ranges from 1 to 100. A smaller value indicates a higher priority.
      * *   When several security group rules have the same priority, drop rules take precedence.
      * *   The destination can be a CIDR block specified by DestCidrIp, Ipv6DestCidrIp, or DestPrefixListId or can be Elastic Compute Service (ECS) instances in a security group specified by DestGroupId.
      * *   Security groups cannot be referenced as authorization objects in the rules of advanced security groups.
      * *   Up to 20 security groups can be referenced as authorization objects in the rules of each basic security group.
      * *   If the specified security group rule exists in the security group, the call is successful but no security group rule is created.
      * *   The `Permissions.N` prefix is added to certain parameters to generate new parameters. Original parameters and parameters prefixed with Permissions.N cannot be specified together. We recommend that you use parameters prefixed with `Permissions.N`.
      * *   You can determine a security group rule by specifying one of the following groups of parameters. You cannot determine a security group rule by specifying only one parameter.
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
      * *   If the image copy task is complete, the CancelCopyImage operation fails and an error is returned.
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
      * After a public IP address is converted to an EIP, the EIP is billed separately. Make sure that you understand the billing methods of EIPs. For more information, see [Billing overview](~~122035~~).
      * Before you call this operation, make sure that the following requirements are met:
      * *   The instance is in the **Stopped** (`Stopped`) or **Running** (`Running`) state.
      * *   No EIPs are associated with the instance.
      * *   The instance has no configuration change tasks that have not taken effect.
      * *   The public bandwidth of the instance is not 0 Mbit/s.
      * *   The instance uses the pay-by-traffic billing method for network usage.
      * *   If the instance is a subscription instance that resides in a VPC, the instance does not expire within 24 hours.
      *
     */
    CompletableFuture<ConvertNatPublicIpToEipResponse> convertNatPublicIpToEip(ConvertNatPublicIpToEipRequest request);

    /**
      * After you copy a custom image (source image) to the destination region, you can use the image copy to create ECS instances by calling the RunInstances operation or replace the system disks of ECS instances by calling the ReplaceSystemDisk operation in the destination region.
      * Before you call the CopyImage operation, take note of the following items:
      * *   You can copy only custom images that are in the `Available` state.
      * *   Custom images that you want to copy must belong to your Alibaba Cloud account or be shared with you by others, and cannot be copied across accounts.
      * *   When an image is being copied, the copied image cannot be deleted by calling the [DeleteImage](~~25537~~) operation. However, you can cancel the running copying task by calling the [CancelCopyImage](~~25539~~) operation.
      * *   A region can have only one image copying task running at a time. Other image copying tasks queue up for the current task to complete before the tasks run in sequence.
      * *   You can configure the `ResourceGroupId` parameter to specify the resource group to which to assign the image copy. If you do not configure the `ResourceGroupId` parameter, the image copy is assigned to the default resource group.
      *
     */
    CompletableFuture<CopyImageResponse> copyImage(CopyImageRequest request);

    /**
      * When you call this operation, take note of the following items:
      * *   New snapshots (copies) cannot be used to roll back disks from which the source snapshots (originals) were created.
      * *   Encrypted snapshots cannot be copied.
      * *   Local snapshots cannot be copied.
      *
     */
    CompletableFuture<CopySnapshotResponse> copySnapshot(CopySnapshotRequest request);

    /**
      * After you use an activation code to register a server that is not provided by Alibaba Cloud as an Alibaba Cloud managed instance, you can use a variety of online services provided by Alibaba Cloud in the managed instance, such as Cloud Assistant, Operation Orchestration Service (OOS), and Apsara Devops.
      * A server that is not provided by Alibaba Cloud can be registered as an Alibaba Cloud managed instance only when the server can access the Internet and runs an operating system of one of the following versions:
      * *   Alibaba Cloud Linux 2, Alibaba Cloud Linux 3, and later
      * *   CentOS 6, CentOS 7, CentOS 8, and later
      * *   Debian 8, Debian 9, Debian 10, and later
      * *   Ubuntu 12, Ubuntu 14, Ubuntu 16, Ubuntu 18, and later
      * *   CoreOS
      * *   OpenSUSE
      * *   Red Hat 5, Red Hat 6, Red Hat 7, and later
      * *   SUSE Linux Enterprise Server (SLES) 11, SLES 12, SLES 15, and later
      * *   Windows Server 2012, Windows Server 2016, Windows Server 2019, and later
      * You can create up to 5,000 activation codes for managed instances within an Alibaba Cloud region. When the number of activation codes exceeds 1,000, the usage of activation codes must be greater than 50% before you can proceed to create more activation codes.
      * > You can go to the **Cloud Assistant** page in the Elastic Compute Service (ECS) console and click **Register Instance** on the **Managed Instances** tab to check the usage of activation codes.
      *
     */
    CompletableFuture<CreateActivationResponse> createActivation(CreateActivationRequest request);

    /**
      * * Auto Provisioning is a service that allows quick deployment of an instance cluster that consists of preemptible and pay-as-you-go instances. Auto Provisioning supports one-click deployment of instance clusters across different billing methods, instance families, and zones. For more information, see [Use auto provisioning group-related API operations to create multiple ECS instances at the same time](~~200772~~).
      * * Auto Provisioning uses auto provisioning groups to schedule and maintain computing resources. You can use auto provisioning groups to obtain a steady supply of computing resources. This helps reduce the impact on computing capacity when preemptible instances are reclaimed.
      * * Auto Provisioning is provided free-of-charge. However, you are charged for instance resources that are created in auto provisioning groups. For more information about the billing, see [Overview](~~52088~~) and [Pay-as-you-go](~~40653~~).
      * * When you specify both the `LaunchTemplateId` and `LaunchConfiguration.*` parameters, the LaunchTemplateId parameter takes precedence.
      *
     */
    CompletableFuture<CreateAutoProvisioningGroupResponse> createAutoProvisioningGroup(CreateAutoProvisioningGroupRequest request);

    /**
      * When you call this operation to create an automatic snapshot policy, you can specify the days of the week on which to create automatic snapshots, the retention period of the automatic snapshots, and cross-region replication for snapshots in the policy to meet your diverse data backup requirements. After you create an automatic snapshot policy, you must call the [ApplyAutoSnapshotPolicy](~~25531~~) operation to apply it to disks. If you want to modify the automatic snapshot policy, you must call the [ModifyAutoSnapshotPolicyEx](~~25529~~) operation.
      * When you call this operation, take note of the following items:
      * *   You can create a maximum of 100 automatic snapshot policies within each region for a single Alibaba Cloud account.
      * *   If an automatic snapshot is being created when the time scheduled for creating another automatic snapshot is due, the new snapshot task is skipped. This may occur when a disk contains a large volume of data. For example, you have scheduled snapshots to be created at 09:00:00, 10:00:00, 11:00:00, and 12:00:00 for a disk. The system starts to create a snapshot for the disk at 09:00:00. The process takes 80 minutes because the disk contains a large volume of data and ends at 10:20:00. The system skips the automatic snapshot task scheduled for 10:00:00 and creates the next automatic snapshot for the disk at 11:00:00.
      * *   For information about how to copy a snapshot from one region to another, see the "Background information" section in [Copy a snapshot](~~159441~~).
      *
     */
    CompletableFuture<CreateAutoSnapshotPolicyResponse> createAutoSnapshotPolicy(CreateAutoSnapshotPolicyRequest request);

    /**
      * When you create a capacity reservation, you can specify attributes such as a zone and an instance type. Then, the system uses a private pool to reserve resources that match the specified attributes. For more information, see [Overview of Immediate Capacity Reservation](~~193633~~).
      * *   Currently, only immediate capacity reservations are supported. Immediate capacity reservations take effect as soon as they are purchased. After you purchase an immediate capacity reservation, the specified instance type is billed on a pay-as-you-go basis regardless of whether the capacity reservation is actually used to create pay-as-you-go instances. Billing stops until you manually release the capacity reservation or until the capacity reservation expires and is automatically released.
      *     *   You can call the [CreateInstance](~~25499~~) or [RunInstances](~~63440~~) operation to specify private pool attributes when you create instances. You can also call the [ModifyInstanceAttachmentAttributes](~~190006~~) operation to modify the attributes of a private pool. When an instance matches a private pool associated with a capacity reservation, you are charged based on the configurations of the instance, such as the instance type, disks, and public bandwidth.
      *     *   Before a capacity reservation is used to create pay-as-you-go instances, you are charged only for the specified instance type.
      * *   Savings plans or regional reserved instances can be applied to offset the hourly bills of the unused capacity of immediate capacity reservations and the hourly bills of the instances that are matched to immediate capacity reservations. Zonal reserved instances cannot be applied to offset these bills. We recommend that you purchase reserved instances or savings plans before you purchase immediate capacity reservations. This way, you can have guaranteed access to resources for free within the coverage of the reserved instances or savings plans.
      * > The CreateCapacityReservation operation can be called to create only immediate capacity reservations. You can use the ECS console to create immediate or scheduled capacity reservations. For more information, see [Overview](~~193626#section-oil-qh5-xvx~~).
      *
     */
    CompletableFuture<CreateCapacityReservationResponse> createCapacityReservation(CreateCapacityReservationRequest request);

    /**
      * *   You can create commands of the following types:
      *     *   RunBatScript: batch commands. These commands are applicable to Windows instances.
      *     *   RunPowerShellScript: PowerShell commands. These commands are applicable to Windows instances.
      *     *   RunShellScript: shell commands. These commands are applicable to Linux instances.
      * *   You can specify the TimeOut parameter to set the maximum timeout period for executions of a command on Elastic Compute Service (ECS) instances. If an execution times out, the Cloud Assistant client forcefully terminates the command process by canceling the process ID (PID) of the command. For more information, see [Install the Cloud Assistant client](~~64921~~).
      *     *   When the one-time execution of a command times out, the execution state ([InvokeRecordStatus](~~64845~~)) of the command becomes Failed.
      *     *   For a scheduled task, take note of the following items:
      *         *   The timeout period takes effect on each execution of the command.
      *         *   When a scheduled execution of a command times out, the execution state ([InvokeRecordStatus](~~64845~~)) of the command becomes Failed.
      *         *   The timeout of one execution does not affect the subsequent executions of the command.
      * *   You can retain up to 500 to 10,000 Cloud Assistant commands in each region.
      * *   You can use the WorkingDir parameter to specify the working directory of a Cloud Assistant command. For Linux instances, the default working directory of a command is the home directory of the root user, which is `/root`. For Windows instances, the default working directory of a command is the directory where the Cloud Assistant client process resides, such as `C:\\Windows\\System32`.
      * *   You can enable the custom parameter feature for a Cloud Assistant command by setting EnableParameter to true when you create the command. When you configure the CommandContent parameter, you can define custom parameters in the {{parameter}} format. Then, when the [InvokeCommand](~~64841~~) operation is called, the key-value pairs of custom parameters are passed in. For example, assume that the command content is `echo {{name}}`. You can use the Parameters parameter to pass in the `<name, Jack>` key-value pair when the InvokeCommand operation is called. The name key of the custom parameter is automatically replaced by the paired Jack value to generate a new command. Therefore, the `echo Jack` command is actually run.
      *
     */
    CompletableFuture<CreateCommandResponse> createCommand(CreateCommandRequest request);

    CompletableFuture<CreateDedicatedHostClusterResponse> createDedicatedHostCluster(CreateDedicatedHostClusterRequest request);

    /**
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
      * ## Description
      * *   You can enable the multi-attach feature when you create a disk. We recommend that you first understand this feature and its limits. For more information, see [NVMe protocol](~~256487~~) and [Use the multi-attach feature](~~262105~~).
      * <!---->
      * *   The disk can be a basic disk, an ultra disk, a standard SSD, or an enhanced SSD (ESSD).
      * *   When you create disks, you may be charged for the resources used. We recommend that you understand the Elastic Compute Service (ECS) billing methods before you create a disk. For more information, see [Billing overview](~~25398~~).
      * *   By default, the `DeleteAutoSnapshot` parameter is set to `true` when a disk is created. This indicates that when the disk is released, its automatic snapshots are also deleted. You can call the [ModifyDiskAttribute](~~25517~~) operation to modify the parameter.
      * *   If you do not configure the performance level when you create an ESSD, the performance level for the ESSD is PL1 by default. You can call the [ModifyDiskSpec](~~123780~~) operation to modify the performance level of the ESSD.
      * *   By default, for a disk that is created by calling the CreateDisk operation, the `Portable` attribute is set to `true` and the billing method is pay-as-you-go.
      *
     */
    CompletableFuture<CreateDiskResponse> createDisk(CreateDiskRequest request);

    /**
      * Elasticity Assurance provides a new method to purchase and use resources with flexibility and assurance. It offers assured resource reservations for pay-as-you-go Elastic Compute Service (ECS) instances. For more information, see [Overview of Elasticity Assurance](~~193630~~).
      * *   Elasticity assurances are not refundable after purchase.
      * *   Elasticity assurances are applicable to only pay-as-you-go ECS instances.
      * *   Elasticity assurances only support the unlimited mode. Therefore, you can set `AssuranceTimes` only to `Unlimited`. Elasticity assurances in unlimited mode take effect immediately after they are purchased and can be applied an unlimited number of times within their effective duration.
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
      * When you call this operation, take note of the following items:
      * *   You can use the created custom image only if the image is in the Available (Available) state.
      * *   If the response contains `{"OperationLocks": {"LockReason" : "security"}}`, the instance is locked to ensure security. No operations are allowed on the instance.
      * You can call the CreateImage operation to create a custom image by using one of the following methods. The following request parameters are sorted by priority: `InstanceId` > `DiskDeviceMapping` > `SnapshotId`. If your request contains two or more of these parameters, the custom image is created based on the parameter that has a higher priority.
      * *   **Method 1**: Create a custom image from an instance. You need to only specify the ID of the instance by using the `InstanceId` parameter. The instance must be in the Running (`Running`) or Stopped (`Stopped`) state. After you call the CreateImage operation, a snapshot is created for each disk of the instance. When you create a custom image from a running instance, specific cache data may not be written to the disks. In this case, the data of the custom image may be slightly different from the data of the instance. We recommend that you create custom images from instances after you stop the instances by calling the [StopInstances](~~155372~~) operation.
      * *   **Method 2**: Create a custom image from the system disk snapshot of an instance. You need to only specify the ID of the system disk snapshot by using the `SnapshotId` parameter. The specified system disk snapshot must be created after July 15, 2013.
      * *   **Method 3**: Create a custom image from multiple disk snapshots. You must specify the data mapping between the disks and the snapshots by calling the `DiskDeviceMapping` operation.
      * When you use Method 3 to create a custom image, take note of the following items:
      * *   You can specify only one system disk snapshot. The device name of the system disk must be /dev/xvda.
      * *   You can specify multiple data disk snapshots. The device names of the data disks are unique and in alphabetical order from /dev/xvdb to /dev/xvdz.
      * *   You can leave the `SnapshotId` parameter empty. In this case, an empty data disk that has a specified size is created.
      * *   The specified disk snapshot must be created after July 15, 2013.
      *
     */
    CompletableFuture<CreateImageResponse> createImage(CreateImageRequest request);

    /**
      * When you call this operation, take note of the following items:
      * * Only custom image components can be created.
      * * Image components can be used to create only Linux images, so you must set the `SystemType` parameter to Linux.
      * * You must configure the image component type to image building component by setting the `ComponentType` parameter to Build.
      * * You can use Dockerfile to edit the content of image components and then pass the edited content into the `Content` parameter. The content cannot be greater than 16 KB in size and can contain up to 127 commands. `FROM` commands cannot be used in image components. For information about the commands that are supported, see [Commands supported by Image Builder](~~200206~~).
      * You can use image components to create image templates in the Elastic Compute Service (ECS) console, but cannot call API operations to use image components to create image templates. For more information, see [Overview](~~197410~~).
      *
     */
    CompletableFuture<CreateImageComponentResponse> createImageComponent(CreateImageComponentRequest request);

    /**
      * You can use image templates to specify custom image content and create images across regions and accounts. When you create an image template, take note of the following items:
      * *   You can create only custom image templates.
      * *   You can specify only public, custom, or shared Linux images or image families as source images when you create image templates.
      * *   When you use an image template to create an image, you must create an intermediate instance. You are charged for the intermediate instance based on the pay-as-you-go billing method. For more information, see [Pay-as-you-go](~~40653~~).
      * For the `BuildContent` parameter that specifies the content of image templates, take note of the following items:
      * *   If the value of the `BuildContent` parameter contains `FROM` commands, the `FROM` commands override the values of the `BaseImageType` parameter that specifies the type of the source image and the `BaseImage` parameter that specifies the source image.
      * *   If the value of the `BuildContent` parameter does not contain `FROM` commands, the system creates a `FROM` command that consists of the values of the `BaseImageType` and `BaseImage` parameters in the `<BaseImageType>:<BaseImage>` format and adds the command to the first line of the image template content.
      * *   You can use Dockerfile to modify the content of image templates and pass the modified content to the `BuildContent` parameter. The content cannot exceed 16 KB in size and can contain up to 127 commands. For information about the commands that are supported by image templates, see [Description of commands supported by Image Builder](~~200206~~).
      * You can use image components to create image templates in the Elastic Compute Service (ECS) console. You cannot call API operations to use image components to create image templates. For more information, see [Overview of creating an image](~~197410~~).
      *
     */
    CompletableFuture<CreateImagePipelineResponse> createImagePipeline(CreateImagePipelineRequest request);

    /**
      * > You can call the [DescribeAvailableResource](~~66186~~) operation to query available resources in a specific region or zone. If you want to batch create instances that automatically enter the Running state after they are created, we recommend that you call the [RunInstances](~~63440~~) operation.
      * When you call this operation, take note of the following items:
      * * **Billing**:
      *     * You must fully understand the ECS billing methods before you create an instance because you may be charged for resources used by the instance. For more information, see [Billing overview](~~25398~~).
      *     * If you create a subscription instance (`PrePaid`), available coupons within your account are used by default.
      * * **Instance type**:
      *     * You can use the `IoOptimized` parameter to specify whether to create an I/O optimized instance.
      *     * Select an instance type. See [Instance families](~~25378~~) or call the [DescribeInstanceTypes](~~25620~~) operation to query the performance data of an instance type, or see [Best practices for instance type selection](~~58291~~) to learn about how to select instance types.
      *     * Query available resources. Call the [DescribeAvailableResource](~~66186~~) operation to query available resources in a specific region or zone.
      * > If the `QuotaExceed.ElasticQuota` error is returned when you call this operation, it indicates that you have reached the maximum number of instances of the specified instance type that can be created within the specified region or the maximum number of vCPUs for all instance types in a zone. You can go to the [ECS console](https://ecs.console.aliyun.com/?spm=a2c8b.12215451.favorites.decs.5e3a336aMGTtzy#/privileges/quota) or [Quota Center](https://quotas.console.aliyun.com/products/ecs/quotas) to request a quota increase.
      * * **Image**:
      *     * The image determines the system disk configurations of the new instance. The system disk of the new instance is a clone of the specified image.
      *     * If you want to create instances with 512 MiB of memory, you cannot use Windows Server images except for Windows Server Semi-Annual Channel images.
      *     * If you want to create instances with 4 GiB or more of memory, you cannot use 32-bit OS image.
      * * **Network type**:
      *     * Each instance that resides in a virtual private cloud (VPC) must be connected to only a single vSwitch.
      *     * If the `VSwitchId` parameter is specified, the security group specified by `SecurityGroupId` and the vSwitch specified by `VSwitchId` must belong to the same VPC.
      *     * The value of `PrivateIpAddress` depends on that of `VSwitchId` and cannot be separately specified.`` If both the `VSwitchId` and `PrivateIpAddress` parameters are specified, the IP address specified by `PrivateIpAddress` must be available in the CIDR block of the specified vSwitch.
      * * **Public bandwidth**:
      *     * As of November 27, 2020, the maximum bandwidth value available for you to create ECS instances or to change ECS instance configurations is subject to the throttling policy for your account. To increase the maximum bandwidth value, submit a ticket. The throttling policy imposes the following constraints: Within a single region, the total maximum bandwidth value of all instances that use the pay-by-traffic billing method for network usage cannot exceed 5 Gbit/s and that of all instances that use the pay-by-bandwidth billing method for network usage cannot exceed 50 Gbit/s.
      *     * If you call the `CreateInstance` operation to create an instance, no public IP addresses are assigned to the instance. You can call the [AllocatePublicIpAddress](~~25544~~) operation to manually assign public IP addresses to instances.
      *     * Network usage fees are determined based on the settings of `InternetChargeType` and `InternetMaxBandwidthOut`.
      *     * The `InternetMaxBandwidthIn` value is irrelevant to billing because inbound data traffic is free of charge.
      *     * If `InternetChargeType` is set to PayByBandwidth, `InternetMaxBandwidthOut` specifies the fixed bandwidth value. A fixed bandwidth is a specified amount of public bandwidth allocated to an instance that uses the pay-by-bandwidth billing method for network usage.
      *     * If `InternetChargeType` is set to PayByTraffic, `InternetMaxBandwidthOut` specifies the peak bandwidth value. A peak bandwidth is the maximum amount of public bandwidth that an instance can consume when it uses the pay-by-traffic billing method for network usage. Network usage costs are calculated based on the volume of network traffic.
      * * **Security group**:
      *     * If no security groups are available in the region where you want to create an instance, you must call the [CreateSecurityGroup](~~25553~~) operation to create a security group in that region first.
      *     * The maximum number of instances that a security group can contain varies based on the security group type. For more information, see the "Security group limits" section in [Limits](~~25412~~).
      *     * Instances in the same security group can communicate with each other over the internal network. By default, instances in different security groups cannot communicate with each other. You can allow communication between instances by allowing mutual access between their security groups. For more information, see [AuthorizeSecurityGroup](~~25554~~) and [AuthorizeSecurityGroupEgress](~~25560~~).
      * * **Storage**:
      *     * The instance is assigned a system disk whose size is determined based on the specified image. The size of the system disk must be at least `20 GiB` and greater than or equal to the image size. For more information about system disk categories, see the description of the `SystemDisk.Category` parameter.
      *     * The system disk of an I/O optimized instance can only be an enhanced SSD (ESSD) (`cloud_essd`), a standard SSD (`cloud_ssd`), or an ultra disk (`cloud_efficiency`).
      *     * The maximum size of a data disk varies based on its category. For more information, see the description of the `DataDisk.N.Size` parameter.
      *     * A maximum of 16 data disks can be attached to each instance. The mount points of data disks are allocated by the system in alphabetical order from /dev/xvdb to /dev/xvdz.
      * * **User data**: If the instance type supports [user data](~~49121~~), you can use the UserData parameter to pass in user data. User data is encoded in Base64. We recommend that you do not pass in confidential information (such as passwords or private keys) in plaintext as user data. This is because the system does not encrypt `UserData` values when API requests are transmitted. If you must pass in confidential information, we recommend that you encrypt and encode the information in Base64 and then decode and decrypt the information in the same way within the instance.
      * * **Others**: When you call API operations by using Alibaba Cloud CLI or SDKs, you must delete periods (.) from some request parameters before you use the parameters. For example, use `SystemDiskCategory` instead of `SystemDisk.Category` as a request parameter.
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
      * ## Description
      * If you want to modify the parameters of a launch template version, you can create another version with different parameter settings for the launch template. A maximum of 30 versions can be created for each launch template.
      *
     */
    CompletableFuture<CreateLaunchTemplateVersionResponse> createLaunchTemplateVersion(CreateLaunchTemplateVersionRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<CreateNatGatewayResponse> createNatGateway(CreateNatGatewayRequest request);

    /**
      * ## Description
      * When you call this operation, take note of the following items:
      * *   This operation is a synchronous operation. After an ENI is created, it immediately enters the Available state and can be attached to an Elastic Compute Service (ECS) instance.
      * *   If the NetworkInterfaceId parameter is empty in the response, it indicates that no ENI is created. Call the operation again to create an ENI.
      * *   An ENI can be attached only to a single instance that resides in a virtual private cloud (VPC).
      * *   When an ENI is detached from an instance and then attached to another instance, the attributes of the ENI remain unchanged and network traffic is directed to the new instance.
      * *   If you want to assign IPv6 addresses when you create an ENI, make sure that IPv6 has been enabled for the vSwitch with which to associate the ENI. For more information, see [What is an IPv6 gateway?](~~98896~~)
      * *   A quota is imposed on the number of ENIs that can be created per Alibaba Cloud region per account. You can view the quota in the ECS console. For more information, see [View and increase resource quotas](~~184115~~).
      * **For information about examples on how to call this operation, see **[Create an ENI](~~471552~~).
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
      * ## Description
      * *   A prefix list is a set of one or more network prefixes (CIDR blocks). You can reference prefix lists to configure network rules for other network resources. For more information, see [Overview](~~206223~~).
      * *   When you create a prefix list, take note of the following items:
      *     *   You must specify an IP address family (IPv4 or IPv6) for the prefix list, and cannot change the IP address family after the prefix list is created. You cannot combine IPv4 and IPv6 CIDR blocks in a single prefix list.
      *     *   You must specify the maximum number of entries that the prefix list can contain. You cannot modify the maximum number of entries after the prefix list is created.
      *     *   You can specify one or more entries for the prefix list. Each entry consists of a CIDR block and a description for the CIDR block. The total number of your specified entries cannot exceed the maximum number.
      * *   For more information about the limits on prefix lists and other resources, see [Limits](~~25412~~).
      * *   You can create RAM users and grant them minimum permissions. This eliminates the need to share the AccessKey pair of your Alibaba Cloud account with other users and reduces security risks for your enterprises. For information about how to grant permissions on prefix lists to RAM users, see [Grant permissions on prefix lists to RAM users](~~206175~~)
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

    /**
      * When you call this operation, take note of the following items:
      * *   You can create up to 100 security groups in each Alibaba Cloud region.
      * *   To create a security group of the Virtual Private Cloud (VPC) type, you must specify the VpcId parameter.
      *
     */
    CompletableFuture<CreateSecurityGroupResponse> createSecurityGroup(CreateSecurityGroupRequest request);

    /**
      * You can use the ECS console, call [ECS API](~~63962~~) operations, or use CloudMonitor to view the scheduled simulated system events.
      * A simulated system event can transition between the following lifecycle states:
      * *   Scheduled: The state of the simulated system event is automatically changed to Scheduled after it is scheduled.
      * *   Executed: The state of the simulated system event is automatically changed to Executed at the time specified by the NotBefore parameter if no manual intervention is involved.
      * *   Canceled: The state of the simulated system event is changed to Canceled if you cancel the event by calling the [CancelSimulatedSystemEvents](~~88808~~) operation.
      * *   Avoided: The state of the simulated system event generated from maintenance-triggered instance restart can be changed to Avoided if you restart the instance before the scheduled time of the simulated system event. The maintenance-triggered instance restart is indicated by the SystemMaintenance.Reboot value. For more information, see [RebootInstance](~~25502~~).
      *
     */
    CompletableFuture<CreateSimulatedSystemEventsResponse> createSimulatedSystemEvents(CreateSimulatedSystemEventsRequest request);

    /**
      * The local snapshot feature is replaced by the instant access feature.
      * *   If you used the local snapshot feature before December 14, 2020, you can use the `Category` or `InstantAccess` parameter as expected and must take note of the following items:
      *     *   The `Category` and `InstantAccess` parameters cannot be specified at the same time.
      *     *   If you do not specify the `Category` or `InstantAccess` parameter, regular snapshots are created.
      * *   If you did not use the local snapshot feature before December 14, 2020, you can use the `InstantAccess` parameter but cannot use the `Category` parameter.
      * You cannot create snapshots for a disk in the following scenarios:
      * *   The number of manual snapshots of the disk has reached 256.
      * *   A snapshot is being created for the disk.
      * *   The instance to which the disk is attached has never been started.
      * *   The ECS instance to which the disk is attached is not in the **Stopped** (`Stopped`) or **Running** (`Running`) state.
      * *   If the response contains `{"OperationLocks": {"LockReason" : "security"}}`, the instance is locked for security reasons. No operations are allowed on the instance.
      * When you create a snapshot, take note of the following items:
      * *   If a snapshot is being created, you cannot use this snapshot to create a custom image by calling the [CreateImage](~~25535~~) operation.
      * *   When a snapshot is being created for a disk that is attached to an instance, do not change the instance state.
      * *   You can create snapshots for a disk that is in the **Expired** (`Expired`) state. If the release time that is scheduled for a disk arrives when a snapshot is being created for the disk, the snapshot is in the **Creating** (`Creating`) state and is deleted when the disk is released.
      *
     */
    CompletableFuture<CreateSnapshotResponse> createSnapshot(CreateSnapshotRequest request);

    /**
      * You can specify `InstanceId` to create a snapshot-consistent group for the specified disks in an instance. You can also specify `DiskId.N` to create a snapshot-consistent group for multiple disks that are attached to multiple instances within the same zone.
      * > You cannot specify both `DiskId.N` and `ExcludeDiskId.N`. If `InstanceId` is set, you can use `DiskId.N` to specify only disks attached to the instance specified by InstanceId. You cannot use DiskId.N to specify disks attached to multiple instances.
      * When you call this operation, take note of the following items:
      * *   The disk for which you want to create a snapshot must be in the **In Use** (`In_use`) or **Unattached** (`Available`) state.
      *     *   If the disk is in the **In Use** (`In_use`) state, the instance to which the disk is attached must be in the **Running** or **Stopped** state.````
      *     *   If the disk is in the **Unattached** (`Available`) state, make sure that the disk has been attached to an ECS instance. Snapshots cannot be created for disks that have never been attached to ECS instances.
      * *   The snapshot-consistent group feature can be used to create snapshots only for enhanced SSDs (ESSDs).
      * *   A single snapshot-consistent group can contain snapshots of up to 16 disks including the system disk and data disks. A single snapshot-consistent group cannot exceed 32 TiB in size.
      * *   Snapshots that you created by using the snapshot-consistent group feature are retained until they are deleted. We recommend that you delete unnecessary snapshots on a regular basis to prevent them from incurring excessive fees.
      * *   Snapshot-consistent groups cannot be created for disks that have the multi-attach feature enabled. If disks that have the multi-attach feature enabled are attached to an instance, you must set the `ExcludeDiskId.N` parameter to exclude these disks.
      * For information about the snapshot-consistent group feature and its billing, see [Create a snapshot-consistent group](~~199625~~).
      *
     */
    CompletableFuture<CreateSnapshotGroupResponse> createSnapshotGroup(CreateSnapshotGroupRequest request);

    /**
      * A storage set can distribute disks or Shared Block Storage devices to different locations. You can specify the number of partitions in a storage set. A larger number of partitions indicate more discrete distribution of disks or Shared Block Storage devices.
      * When you call this operation, take note of the following items:
      * *   A limitation exists on the number of storage sets that you can create in a region. You can call the [DescribeAccountAttributes](~~73772~~) operation to query the allowed number of storage sets in a region.
      * *   A limitation exists on the number of partitions in a zone. You can call the [DescribeAccountAttributes](~~73772~~) operation to query the allowed number of storage sets in a zone.
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
      * ## Description
      * Before you call this operation to delete an activation code, make sure that the activation code has never been used to register managed instances.
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
      * ## Description
      * When you call this operation to release a pay-as-you-go data disk, take note of the following items:
      * *   Manual snapshots of the disk are retained.
      * *   You can call the [ModifyDiskAttribute](~~25517~~) operation to configure whether to release automatic snapshots together with the disk. We recommend that you delete unneeded snapshots to maintain an enough snapshot quota for new automatic snapshots.
      * *   The disk must be in the Unattached (Available) state.
      * *   If the specified disk does not exist, the request is ignored.
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
      * ## Description
      * If an image build task based on an image template is in the BUILDING, DISTRIBUTING, RELEASING, or CANCELLING state, you cannot delete the template. You can delete the template only when the image build task is in the SUCCESS, FAILED, or CANCELLED state. You can call the DescribeImagePipelineExecutions operation to query the details of an image build task.
      *
     */
    CompletableFuture<DeleteImagePipelineResponse> deleteImagePipeline(DeleteImagePipelineRequest request);

    /**
      * ## Description
      * *   After an instance is released, all the physical resources used by the instance are recycled. Relevant data is erased and cannot be restored.
      * *   Disks attached to the instance:
      *     *   The disks for which `DeleteWithInstance` is set to false are retained as pay-as-you-go disks.
      *     *   The disks for which `DeleteWithInstance` is set to true are released along with the instance.
      *     *   For disks for which `DeleteAutoSnapshot` is set to false, the automatic snapshots of the disks are retained.
      *     *   For disks for which `DeleteAutoSnapshot` is set to true, the automatic snapshots of the disks are released.
      *     *   Manual snapshots of the disks are retained.
      *     *   If `OperationLocks` in the response contains `"LockReason" : "security"` for an instance, the instance is locked for security reasons. For more information, see [API behavior when an instance is locked for security reasons](~~25695~~). Even if `DeleteWithInstance` is set to `false` for the data disks that are attached to the instance, this parameter is ignored and the data disks are released along with the instance.
      *
     */
    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    /**
      * *   After an instance is released, all the physical resources used by the instance are recycled. Relevant data is erased and cannot be recovered.
      * *   Disks attached to the instance:
      *     *   The disks for which `DeleteWithInstance` is set to false are retained as pay-as-you-go disks.
      *     *   The disks for which `DeleteWithInstance` is set to true are released along with the instance.
      *     *   For disks for which `DeleteAutoSnapshot` is set to false, the automatic snapshots of the disks are retained.
      *     *   For disks for which `DeleteAutoSnapshot` is set to true, the automatic snapshots of the disks are released.
      *     *   Manual snapshots of the disks are retained.
      *     *   If `OperationLocks` in the DescribeInstances response contains `"LockReason" : "security"` for an instance, the instance is locked for security reasons. Even if the `DeleteWithInstance` parameter is set to `false` for the data disks that are attached to the instance, this parameter is ignored and the data disks are released along with the instance. For more information, see [API behavior when an instance is locked for security reasons](~~25695~~).
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
      * ## Description
      * *   The ENI must be in the Available state.
      * *   If the ENI is bound to an ECS instance, you must unbind the ENI from the ECS instance ([DetachNetworkInterface](~~58514~~)) before you can delete the ENI.
      * *   After an ENI is deleted:
      *     *   All the private IP addresses (including primary and secondary private IP addresses) of the ENI are automatically released. 
      *     *   The ENI is automatically removed from its security groups.
      * *   This operation is an asynchronous operation. After this operation is called to delete an ENI, you can check the state or events of the ENI to determine whether the ENI is deleted. The following figure shows the transitions between the states of the ENI.
      *     
      *     ![](https://static-aliyun-doc.oss-cn-hangzhou.aliyuncs.com/file-manage-files/en-US/20230223/krcd/DeleteNetworkInterface.png)
      *     *   If the ENI is in the Deleting state, the ENI deletion request is sent and the ENI is being deleted.
      *     *   If the ENI is not found, the ENI is deleted.
      *     *   If the ENI is stuck in the Deleting state, the ENI fails to be deleted and you can re-initiate the request to delete the ENI. 
      * For information about examples on how to call this operation, see [Delete an ENI](~~471553~~).
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
      * ## Description
      * If a prefix list is associated with resources, you cannot delete the prefix list. You must disassociate the prefix list from the resources before you can delete the prefix list. You can call the [DescribePrefixListAssociations](https://www.alibabacloud.com/help/en/elastic-compute-service/latest/describeprefixlistassociations) operation to query resources that are associated with a specific prefix list.
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
      * Before you delete a security group, make sure that no instances are present in the security group and that the security group is not referenced by other security groups [DescribeSecurityGroupReferences](~~57320~~)). Otherwise, the DeleteSecurityGroup request fails.
      *
     */
    CompletableFuture<DeleteSecurityGroupResponse> deleteSecurityGroup(DeleteSecurityGroupRequest request);

    /**
      * When you call this operation, take note of the following items:
      * *   If the specified snapshot does not exist, the request is ignored.
      * *   If a snapshot has been used to create custom images, the snapshot cannot be deleted. You must call the [DeleteImage](~~25537~~) operation to delete the custom images before you can delete the snapshot.
      * *   If the specified snapshot has been used to create disks and the `Force` parameter is not specified or is set to `false`, the snapshot cannot be deleted directly. If you want to delete the snapshot, set the `Force` parameter to true to forcefully delete the snapshot. The disks created from the snapshot cannot be re-initialized after the snapshot is forcefully deleted.
      *
     */
    CompletableFuture<DeleteSnapshotResponse> deleteSnapshot(DeleteSnapshotRequest request);

    /**
      * ## Description
      * If you have custom images that were created from a disk snapshot contained in a snapshot-consistent group, the disk snapshot is retained when the snapshot-consistent group is deleted. Before you can delete the disk snapshot, you must call the [DeleteImage](~~25537~~) operation to delete the custom images. Then, you can call the [DeleteSnapshot](~~25525~~) operation to delete the disk snapshot.
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
      * You can apply for a quota increase in the [Quota Center console](https://ecs.console.aliyun.com/?#/privilegeQuotaV2/region/cn-hangzhou?subTab=userQuota).
      *
     */
    CompletableFuture<DescribeAccountAttributesResponse> describeAccountAttributes(DescribeAccountAttributesRequest request);

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
      * When you call this operation, take note of the following items:
      * *   This operation applies only to instances that reside in the classic network.
      * *   You can query up to 100 instances that reside in the classic network at a time.
      * *   At least one of the `VpcId` and `InstanceId` parameters must be specified.
      *
     */
    CompletableFuture<DescribeClassicLinkInstancesResponse> describeClassicLinkInstances(DescribeClassicLinkInstancesRequest request);

    CompletableFuture<DescribeCloudAssistantStatusResponse> describeCloudAssistantStatus(DescribeCloudAssistantStatusRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribeClustersResponse> describeClusters(DescribeClustersRequest request);

    /**
      * If you specify only the `Action` and `RegionId` parameters to call this operation, all the available commands (`CommandId`) that you created in the specified region are queried by default.
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
      * ## Description
      * You can use one of the following methods to query the details of one or more dedicated hosts:
      * *   Specify the `DedicatedHostIds` parameter to query the details of specified dedicated hosts.
      * *   Specify the `DedicatedHostClusterId` parameter to query the details of the dedicated hosts in a dedicated host cluster.
      *
     */
    CompletableFuture<DescribeDedicatedHostsResponse> describeDedicatedHosts(DescribeDedicatedHostsRequest request);

    /**
      * You can call this operation to query the details of resources you filed with Alibaba Cloud, including the types, delivery status, and consumption details of the resources.
      * By default, the filing tickets of I/O optimized VPC-type instances are queried.
      * For information about how to create (CreateDemand), modify (ModifyDemand), and delete (DeleteDemand) filing tickets on ECS resources, contact your account manager.
      *
     */
    CompletableFuture<DescribeDemandsResponse> describeDemands(DescribeDemandsRequest request);

    /**
      * For more information about instance families, see [Instance families](~~25378~~).
      *
     */
    CompletableFuture<DescribeDeploymentSetSupportedInstanceTypeFamilyResponse> describeDeploymentSetSupportedInstanceTypeFamily(DescribeDeploymentSetSupportedInstanceTypeFamilyRequest request);

    CompletableFuture<DescribeDeploymentSetsResponse> describeDeploymentSets(DescribeDeploymentSetsRequest request);

    CompletableFuture<DescribeDiagnosticMetricSetsResponse> describeDiagnosticMetricSets(DescribeDiagnosticMetricSetsRequest request);

    CompletableFuture<DescribeDiagnosticMetricsResponse> describeDiagnosticMetrics(DescribeDiagnosticMetricsRequest request);

    CompletableFuture<DescribeDiagnosticReportAttributesResponse> describeDiagnosticReportAttributes(DescribeDiagnosticReportAttributesRequest request);

    CompletableFuture<DescribeDiagnosticReportsResponse> describeDiagnosticReports(DescribeDiagnosticReportsRequest request);

    /**
      * The monitoring data includes read IOPS, write IOPS, read bandwidth (byte/s), write bandwidth (byte/s), read latency (microseconds), and write latency (microseconds) of the disk.
      * When you call this operation, take note of the following items:
      * *   Only the monitoring data of disks that are in the Running (`In_use`) state can be queried. For more information, see [Disk states](~~25689~~).
      *     > Some information may be missing from the monitoring data of a disk because the disk is not in the In Use (`In_Use`) state and the system cannot obtain the relevant information.
      * *   Up to 400 monitoring data entries can be returned at a time. An error is returned if the value calculated based on the following formula is greater than 400: `(EndTime - StartTime)/Period`.
      * *   You can query the monitoring data in the previous 30 days. If the value of `StartTime` is more than 30 days before the current time, an error is returned.
      *
     */
    CompletableFuture<DescribeDiskMonitorDataResponse> describeDiskMonitorData(DescribeDiskMonitorDataRequest request);

    /**
      * * You can specify multiple request parameters such as `RegionId`, `ZoneId`, `DiskIds`, and `InstanceId` to be queried. Specified parameters have logical AND relations. Only the specified parameters are included in the filter conditions.
      * * The `DiskIds` value is a JSON array. If DiskIds is not specified, it is not used as a filter condition. If `DiskIds` is set to an empty JSON array, it is regarded as a valid filter condition, and an empty result is returned.
      * * You can use one of the following methods to check the responses:
      *     * Method 1: Use `NextToken` to configure the query token. Set the value to the `NextToken` value that is returned in the last call to the DescribeDisks operation. Then, use `MaxResults` to specify the maximum number of entries to return on each page.
      *     * Method 2: Use `PageSize` to specify the number of entries to return on each page and then use `PageNumber` to specify the number of the page to return.
      *         You can use only one of the preceding methods. If a large number of entries are to be returned, we recommend that you use method 1. When `NextToken` is specified, `PageSize` and `PageNumber` do not take effect and `TotalCount` in the response is invalid.
      * * A disk that has the multi-attach feature enabled can be attached to multiple instances. You can query the attachment information of the disk based on the `Attachment` values in the response.
      * When you call an API operation by using Alibaba Cloud CLI, you must specify request parameter values of different data types in required formats. For more information, see [Parameter format overview](~~110340~~).
      *
     */
    CompletableFuture<DescribeDisksResponse> describeDisks(DescribeDisksRequest request);

    /**
      * *   The full status information of an EBS device includes the lifecycle status provided by the `Status` parameter, health status provided by the `HealthStatus` parameter, and event type provided by the `EventType` parameter of the EBS device. You can filter the results based on these parameters.
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
      * ## Description
      * The monitored data includes traffic sent and received over the internal network, the number of packets sent and received by the secondary ENI, and the number of dropped packets sent and received by the secondary ENI. Specific information may be missing from the returned monitored data. This is because the system cannot obtain the relevant information. For example, if the instance to which the secondary ENI is bound is in the Stopped state, or if the secondary ENI is not bound to an instance and is in the Available state, the monitored data of the secondary ENI cannot be obtained. When you call this operation, take note of the following items:
      * *   Up to 400 monitored data entries can be returned at a time. If the value calculated by using the (EndTime - StartTime)/Period formula is greater than 400, an error is returned.
      * *   Only the monitored data within the last 30 days can be queried. If the value of the StartTime parameter is earlier than 30 days from the time when you call this operation, an error is returned.
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
      * You can use `NextToken` to configure the query token. Set the value to the `NextToken` value that is returned in the last call to the DescribeImageComponents operation. Then, use `MaxResults` to specify the maximum number of entries to return on each page.
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
      * * The image template specified by the `ImagePipelineId` parameter cannot be a deleted image template. The corresponding build task is deleted when an image template is deleted.
      * * You must set the `ImagePipelineId` parameter to specify the ID of an image template or the `ExecutionId` parameter to specify the ID of a build task.
      * * You can configure the query token by using the `NextToken` parameter. Set the value of NextToken to the `NextToken` value that was returned when you last called the `DescribeImagePipelineExecutions` operation. Then, use the `MaxResults` parameter to configure the maximum number of entries to return on each page to query the details of the image build task.
      *
     */
    CompletableFuture<DescribeImagePipelineExecutionsResponse> describeImagePipelineExecutions(DescribeImagePipelineExecutionsRequest request);

    /**
      * You can use `NextToken` to configure the query token. Set the value to the `NextToken` value that is returned in the last call to the `DescribeImagePipelines` operation. Then, use `MaxResults` to specify the maximum number of entries to return on each page.
      *
     */
    CompletableFuture<DescribeImagePipelinesResponse> describeImagePipelines(DescribeImagePipelinesRequest request);

    CompletableFuture<DescribeImageSharePermissionResponse> describeImageSharePermission(DescribeImageSharePermissionRequest request);

    CompletableFuture<DescribeImageSupportInstanceTypesResponse> describeImageSupportInstanceTypes(DescribeImageSupportInstanceTypesRequest request);

    /**
      * ## Description
      * *   You can query public images provided by Alibaba Cloud, Alibaba Cloud Marketplace images, custom images in your repository, and shared images from other Alibaba Cloud accounts.
      * *   This is a paginated query. The response contains the total number of available images and the images on the returned page. By default, 10 entries are displayed on each page.
      * *   When you call an API operation by using Alibaba Cloud CLI, you must specify request parameter values of different data types in required formats. For more information, see [Parameter format overview](~~110340~~).
      *
     */
    CompletableFuture<DescribeImagesResponse> describeImages(DescribeImagesRequest request);

    /**
      * A private pool is generated after an elasticity assurance or a capacity reservation is created. The private pool is associated with the attributes of matching instances. You can configure a private pool when you create an instance, so that the instance matches the elasticity assurance or capacity reservation that is associated with the private pool.
      * When a private pool expires, data about the association between instances and the private pool becomes invalid. In this case, a call to this operation returns empty values related to private pools.
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
      * ## Description
      * *   You can query system events that were finished within the last 30 days. The time range for querying unfinished system events is unlimited.
      * *   You can also specify the InstanceEventCycleStatus.N parameter to query the system events that are in the Scheduled, Executing, or Inquiring state.
      *
     */
    CompletableFuture<DescribeInstanceHistoryEventsResponse> describeInstanceHistoryEvents(DescribeInstanceHistoryEventsRequest request);

    /**
      * This operation is used to query the specified maintenance policy of an instance, which contains the following maintenance attributes:
      * *   Maintenance window: the time period that you specify for maintenance.
      * *   Maintenance action: the policy that you specify in response to instance shutdown.
      *
     */
    CompletableFuture<DescribeInstanceMaintenanceAttributesResponse> describeInstanceMaintenanceAttributes(DescribeInstanceMaintenanceAttributesRequest request);

    /**
      * ## Description
      * *   Pricing information can be queried for unexpired subscription ECS instances only when you upgrade their configurations. The pricing information cannot be queried when the instance configurations are downgraded.
      * *   Pricing information cannot be queried for pay-as-you-go ECS instances when you change their configurations. Prices of existing pay-as-you-go ECS instances whose configurations are changed are the same as those of new pay-as-you-go instances. You can call the [DescribePrice](~~107829~~) operation to query the latest prices of ECS instances.
      * *   Before you upgrade the configurations of an instance, we recommend that you call the [DescribeResourcesModification](~~66187~~) operation to query the instance types available for configuration upgrades in a specified zone.
      *
     */
    CompletableFuture<DescribeInstanceModificationPriceResponse> describeInstanceModificationPrice(DescribeInstanceModificationPriceRequest request);

    /**
      * When you call this operation, take note of the following items:
      * *   Up to 400 monitoring data entries can be returned at a time. An error is returned if the value calculated based on the following formula is greater than 400: `(EndTime − StartTime)/Period`.
      * *   You can query the monitoring data of the last 30 days. If the value of the `StartTime` parameter is more than 30 days earlier than the current time, an error is returned.
      * *   In some scenarios, such as when the instance is in the Stopped state, the system cannot obtain the relevant information and a portion may be missing from the returned monitoring data.
      *
     */
    CompletableFuture<DescribeInstanceMonitorDataResponse> describeInstanceMonitorData(DescribeInstanceMonitorDataRequest request);

    /**
      * When you call an API operation by using Alibaba Cloud CLI, you must specify request parameter values of different data types in required formats. For more information, see [Parameter format overview](~~110340~~).
      *
     */
    CompletableFuture<DescribeInstanceRamRoleResponse> describeInstanceRamRole(DescribeInstanceRamRoleRequest request);

    /**
      * * For information about the lifecycle states of an ECS instance, see [Instance states](~~25687~~).
      * * You can also call this operation to query the list of ECS instances.
      *
     */
    CompletableFuture<DescribeInstanceStatusResponse> describeInstanceStatus(DescribeInstanceStatusRequest request);

    /**
      * > The DescribeInstanceTopology operation is in invitational preview and is not commercially available.
      *
     */
    CompletableFuture<DescribeInstanceTopologyResponse> describeInstanceTopology(DescribeInstanceTopologyRequest request);

    CompletableFuture<DescribeInstanceTypeFamiliesResponse> describeInstanceTypeFamilies(DescribeInstanceTypeFamiliesRequest request);

    /**
      * ## Description
      * Before you call this operation, take note of the following items:
      * *   The MaxResults parameter specifies the maximum number of entries to return on each page. The maximum value of this parameter is changed from 1600 to 100. If you called this operation in 2022, you can continue to use 1600 as the maximum value of MaxResults until November 15, 2023. As of November 15, 2023, only 100 can be used as the maximum value of MaxResults. If you do not specify the NextToken parameter when you call the DescribeInstanceTypes operation, only the first page of results that contains up to 100 entries is returned. If you want to retrieve more results, specify the NextToken parameter to perform paged queries, or specify filter conditions to filter results. For information about the best practices for using DescribeInstanceTypes, see [Compare the specifications of instance types](https://help.aliyun.com/practice_detail/461278) .
      * *   We recommend that you specify the MaxResults and NextToken parameters to perform paged queries. The first time you call the DescribeInstanceTypes operation, specify MaxResults to limit the maximum number of entries to return in the call. If the number of entries to return exceeds the specified value of MaxResults, the response includes a NextToken value. You can set NextToken to the return value and specify MaxResults in your next request to DescribeInstanceTypes to retrieve the next page of results.
      * *   The DescribeInstanceTypes operation is used to query only the specifications and performance information of instance types. To query instance types that are available in a specific region, call the [DescribeAvailableResource](~~66186~~) operation.
      * *   To use special instance types such as instance types that are unavailable for purchase, [submit a ticket](https://selfservice.console.aliyun.com/ticket/createIndex.htm).
      *
     */
    CompletableFuture<DescribeInstanceTypesResponse> describeInstanceTypes(DescribeInstanceTypesRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribeInstanceVncPasswdResponse> describeInstanceVncPasswd(DescribeInstanceVncPasswdRequest request);

    /**
      * When you call this operation, take note of the following items:
      * *   The URL returned is valid only for 15 seconds. If a connection is not established within 15 seconds after a successful query, the URL expires and you must query it again.
      * *   The **KeepAlive** time of a connection to a VNC management terminal is 60 seconds. If you do not interact with the VNC management terminal within 60 seconds, the VNC management terminal is automatically disconnected.
      * *   After the VNC management terminal is disconnected, you can only reconnect to the VNC management terminal a maximum of 30 times a minute.
      * *   You need to add `vncUrl`, `instanceId`, `isWindows`, and `password` parameters at the end of the URL `https://g.alicdn.com/aliyun/ecs-console-vnc2/0.0.8/index.html?`. Separate each parameter with an ampersand (`&`).``
      *     *   `vncUrl:` the value of the `VncUrl` parameter that is returned after a successful query.
      *     *   `instanceId:` the ID of your instance.
      *     *   `isWindows:` specifies whether the operating system of the instance is Windows. Set the parameter to `true` if the operating system is Windows. Set the parameter to `false` if the operating system is not Windows.
      *     *   `password:` Optional. A six-character password that is used to connect to the VNC management terminal. It can contain digits and letters. If you specify this parameter, you do not need to enter your password again when the connection is being established.
      *         Examples:
      *         ```
      *         ```
      * <https://g.alicdn.com/aliyun/ecs-console-vnc2/0.0.8/index.html?vncUrl=ws%3A%2F%\\\\*\\\\*\\\\*\\\\*&instanceId=i-wz9hhwq5a6tm\\\\*\\\\*\\\\*\\\\*&isWindows=true> \\`\\`\\`
      *     or:
      *         ```
      * <https://g.alicdn.com/aliyun/ecs-console-vnc2/0.0.8/index.html?vncUrl=ws%3A%2F%\\\\*\\\\*\\\\*\\\\*&instanceId=i-wz9hhwq5a6tm\\\\*\\\\*\\\\*\\\\*&isWindows=true&password=\\\\*\\\\*\\\\*\\\\>\\* \\`\\`\\`
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
      * If a period is specified, events are queried based on the specified period.
      *
     */
    CompletableFuture<DescribeInstancesFullStatusResponse> describeInstancesFullStatus(DescribeInstancesFullStatusRequest request);

    /**
      * *   After you run a command, the command may not succeed or return the expected results. You can call this operation to query the actual execution results.
      * *   You can query information about command executions within the last four weeks. A maximum of 100,000 pieces of execution information can be retained.
      *
     */
    CompletableFuture<DescribeInvocationResultsResponse> describeInvocationResults(DescribeInvocationResultsRequest request);

    /**
      * *   After you run a command, the command may not succeed or return the expected results. You can call this operation to query the execution results.
      * *   You can query information about command executions within the last four weeks. A maximum of 100,000 pieces of execution information can be retained.
      *
     */
    CompletableFuture<DescribeInvocationsResponse> describeInvocations(DescribeInvocationsRequest request);

    CompletableFuture<DescribeKeyPairsResponse> describeKeyPairs(DescribeKeyPairsRequest request);

    CompletableFuture<DescribeLaunchTemplateVersionsResponse> describeLaunchTemplateVersions(DescribeLaunchTemplateVersionsRequest request);

    CompletableFuture<DescribeLaunchTemplatesResponse> describeLaunchTemplates(DescribeLaunchTemplatesRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribeLimitationResponse> describeLimitation(DescribeLimitationRequest request);

    CompletableFuture<DescribeManagedInstancesResponse> describeManagedInstances(DescribeManagedInstancesRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribeNatGatewaysResponse> describeNatGateways(DescribeNatGatewaysRequest request);

    CompletableFuture<DescribeNetworkInterfaceAttributeResponse> describeNetworkInterfaceAttribute(DescribeNetworkInterfaceAttributeRequest request);

    CompletableFuture<DescribeNetworkInterfacePermissionsResponse> describeNetworkInterfacePermissions(DescribeNetworkInterfacePermissionsRequest request);

    /**
      * The `DescribeNetworkInterfaces` operation supports multiple pagination mechanisms. We recommend that you set `MaxResults` to specify the maximum number of entries to return in each request. The returned value of `NextToken` is a pagination token, which can be used in the next request to retrieve a new page of results. When you perform the next request, set `NextToken` to the `NextToken` value returned in the previous call and set `MaxResults` to specify the maximum number of entries to return in this call.
      * > If you specify `MaxResults` or `NextToken`, the system returns results based on the preceding pagination mechanism. Otherwise, the system paginates the results based on the `PageNumber` and `PageSize` parameters.
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
      * ## Description
      * *   The required parameters vary based on the types of resources whose prices you want to query.
      *     *   When the `ResourceType` parameter is set to instance, you must specify the `InstanceType` parameter.
      *     *   When the `ResourceType` parameter is set to disk, you must specify both the `DataDisk.1.Category` and `DataDisk.1.Size` parameters. When the `ResourceType` parameter is set to disk, only pay-as-you-go prices of cloud disks are returned. In this scenario, the `PriceUnit` parameter must be set to `Hour`.
      *     *   When the `ResourceType` parameter is set to ddh, you must specify the `DedicatedHostType` parameter.
      *     *   When the `ResourceType` parameter is set to ElasticityAssurance, you must specify the `InstanceType` parameter.
      *     *   When the `ResourceType` parameter is set to CapacityReservation, you must specify the `InstanceType` parameter.
      * *   When the `ResourceType` parameter is set to bandwidth, only the pay-by-traffic (`PayByTraffic`) price for network usage is returned.
      * *   When the `ResourceType` parameter is set to instance, the prices of up to four data disks can be queried.
      * *   By default, the `ChargeType` parameter is set to `PostPaid`. You can specify the `PriceUnit` parameter to query the prices of ECS resources that have different billing cycles.
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
      * ## Description
      * *   You can call this operation to query the price for renewing a subscription instance for a specific period of time or to a synchronized expiration date.
      * *   Take note of the following items:
      *     *   If you set only the required parameters, the price for renewing a specified instance for one month is queried by default.
      *     *   The renewal period-related parameter pair (`Period` and `PeriodUnit`) and the synchronized expiration date-related parameter (`ExpectedRenewDay`) are mutually exclusive. You cannot set these parameters together to query the prices for renewing a specified instance for a period of time and to a synchronized expiration date at the same time.
      *
     */
    CompletableFuture<DescribeRenewalPriceResponse> describeRenewalPrice(DescribeRenewalPriceRequest request);

    CompletableFuture<DescribeReservedInstanceAutoRenewAttributeResponse> describeReservedInstanceAutoRenewAttribute(DescribeReservedInstanceAutoRenewAttributeRequest request);

    CompletableFuture<DescribeReservedInstancesResponse> describeReservedInstances(DescribeReservedInstancesRequest request);

    CompletableFuture<DescribeResourceByTagsResponse> describeResourceByTags(DescribeResourceByTagsRequest request);

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
      * Before you call this operation, take note of the following items:
      * *   The basic information of security groups includes the IDs and descriptions. The response returns security groups in descending order based on their IDs.
      * *   We recommend that you use the NextToken and MaxResults parameters for a paged query. We recommend that you use the MaxResults parameter to specify the maximum number of entries to return in each request. The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. When you perform the next request, set the NextToken parameter to the NextToken value that is returned in the previous call and use the MaxResults parameter to specify the maximum number of entries to return in this request. If the returned value of the NextToken parameter is empty, the current page of results is the last page and no more results are to be returned.
      * *   When you use Alibaba Cloud CLI to call an API operation, you must specify request parameter values of different data types in the required formats. For more information, see [Parameter format overview](~~110340~~).
      *
     */
    CompletableFuture<DescribeSecurityGroupsResponse> describeSecurityGroups(DescribeSecurityGroupsRequest request);

    /**
      * ## Usage notes
      * *   When you send a file, the file may fail to be sent to specified Elastic Compute Service (ECS) instances. You can call this operation to check whether the file is successfully sent.
      * *   You can call this operation to query the records of files sent in the last six weeks.
      *
     */
    CompletableFuture<DescribeSendFileResultsResponse> describeSendFileResults(DescribeSendFileResultsRequest request);

    /**
      * You can specify multiple request parameters such as `InstanceId`, `SnapshotGroupId.N`, and `Status.N` to be queried. Specified parameters have logical AND relations. Only the specified parameters are included in the filter conditions.
      *
     */
    CompletableFuture<DescribeSnapshotGroupsResponse> describeSnapshotGroups(DescribeSnapshotGroupsRequest request);

    /**
      * When you call this operation, take note of the following items:
      * *   You can specify multiple request parameters such as `RegionId`, `DiskIds`, and `InstanceId` to be queried. Specified parameters have logical AND relations.
      * *   Only the specified parameters are used as filter conditions. If the `DiskIds` and `SnapshotLinkIds` parameters are set to empty JSON arrays, they are regarded as valid filter conditions and an empty result is returned.
      *
     */
    CompletableFuture<DescribeSnapshotLinksResponse> describeSnapshotLinks(DescribeSnapshotLinksRequest request);

    /**
      * When you call this operation, take note of the following items:
      * *   Up to 400 entries of monitoring data can be returned at a time. If the result of the `(EndTime - StartTime)/Period` formula is greater than 400, an error is returned.
      * *   Only the monitored data within the last 30 days can be queried. If the value of `StartTime` is more than 30 days earlier than when you call this operation, an error is returned.
      *
     */
    CompletableFuture<DescribeSnapshotMonitorDataResponse> describeSnapshotMonitorData(DescribeSnapshotMonitorDataRequest request);

    CompletableFuture<DescribeSnapshotPackageResponse> describeSnapshotPackage(DescribeSnapshotPackageRequest request);

    /**
      * ## Description
      * You can specify multiple request parameters such as `InstanceId`, `DiskId`, and `SnapshotIds` to be queried. Specified parameters have logical AND relations. Only the specified parameters are included in the filter conditions.
      * When you use Alibaba Cloud CLI to call an API operation, you must specify request parameter values of different data types in required formats. For more information, see [Parameter format overview](~~110340~~).
      *
     */
    CompletableFuture<DescribeSnapshotsResponse> describeSnapshots(DescribeSnapshotsRequest request);

    /**
      * If you want to view the snapshot usage information about each disk in the current region, we recommend that you call the [DescribeSnapshotLinks](~~55837~~) operation to query snapshot chain information.
      *
     */
    CompletableFuture<DescribeSnapshotsUsageResponse> describeSnapshotsUsage(DescribeSnapshotsUsageRequest request);

    /**
      * *   You can call this operation to query information that is generated for preemptible instances in the last 30 days and select suitable instance types based on the returned results. The information that you can query by calling this operation includes:
      *     *   Average release rate of preemptible instances.
      *     *   The discount rate of the average preemptible instance price relative to the pay-as-you-go instance price.
      *     *   Average preemptible instance price that is calculated based on the preceding percentage.
      * *   This operation is applicable only to I/O optimized preemptible instances that are located in virtual private clouds (VPCs).
      * *   You can use one of the following methods to specify instance types:
      *     *   Set the `Cores` and `Memory` parameters or the `MinCores` and `MinMemory` parameters to query information of instance types that have the specified number of vCPUs and memory size.
      *     *   Set the `InstanceTypes.N parameter` to query information of the specified instance types.
      *     *   Set the `Cores` and `Memory` parameters or the `MinCores` and `MinMemory` parameters, and set the `InstanceTypeFamily` or `InstanceFamilyLevel` parameter to query information of the instance types that have the specified number of vCPUs and memory size within the specified instance family or at the specified instance family level.
      *
     */
    CompletableFuture<DescribeSpotAdviceResponse> describeSpotAdvice(DescribeSpotAdviceRequest request);

    CompletableFuture<DescribeSpotPriceHistoryResponse> describeSpotPriceHistory(DescribeSpotPriceHistoryRequest request);

    CompletableFuture<DescribeStorageCapacityUnitsResponse> describeStorageCapacityUnits(DescribeStorageCapacityUnitsRequest request);

    CompletableFuture<DescribeStorageSetDetailsResponse> describeStorageSetDetails(DescribeStorageSetDetailsRequest request);

    CompletableFuture<DescribeStorageSetsResponse> describeStorageSets(DescribeStorageSetsRequest request);

    /**
      * If a tag key is specified and no tag values are specified, all tags that contain the tag key are returned. If a tag key-value pair is specified, only tags that exactly match the key-value pair are returned.
      *
     */
    CompletableFuture<DescribeTagsResponse> describeTags(DescribeTagsRequest request);

    CompletableFuture<DescribeTaskAttributeResponse> describeTaskAttribute(DescribeTaskAttributeRequest request);

    CompletableFuture<DescribeTasksResponse> describeTasks(DescribeTasksRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribeUserBusinessBehaviorResponse> describeUserBusinessBehavior(DescribeUserBusinessBehaviorRequest request);

    /**
      * ## Description
      * *   The returned user data is encoded in Base64.
      * *   If the instance does not have user data configured, an empty result is returned.
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
      * *   The disk that you want to detach must be in the In Use (`In_Use`) state.
      * *   The instance from which you want to detach a data disk must be in the **Running** (`Running`) or **Stopped** (`Stopped`) state.
      * *   The instance from which you want to detach the system disk must be in the **Stopped** (`Stopped`) state.
      * *   If the `OperationLocks` parameter in the response contains `"LockReason" : "security"` when you query the instance information, the instance is locked for security reasons and all operations do not take effect on the instance.
      * *   DetachDisk is an asynchronous operation. It takes about 1 minute for a disk to be detached from an instance after the operation is called.
      *
     */
    CompletableFuture<DetachDiskResponse> detachDisk(DetachDiskRequest request);

    CompletableFuture<DetachInstanceRamRoleResponse> detachInstanceRamRole(DetachInstanceRamRoleRequest request);

    /**
      * When you call this operation, take note of the following items:
      * *   After you detach an SSH key pair from an instance, you must call the [RebootInstance](~~25502~~) operation to restart the instance for the detach operation to take effect.
      * *   The username and password authentication method is automatically selected for an instance after you unbind an SSH key pair from the instance.
      *
     */
    CompletableFuture<DetachKeyPairResponse> detachKeyPair(DetachKeyPairRequest request);

    /**
      * ## Description
      * When you call this operation, take note of the following items:
      * *   Primary ENIs cannot be detached from ECS instances.
      * *   The ENI must be in the Detaching (Detaching) or InUse (InUse) state.
      * *   The instance must be in the Running (Running) or Stopped (Stopped) state.
      * *   This operation is an asynchronous operation. After this operation is called to detach an ENI, you can check the state or events of the ENI to determine whether the ENI is detached. The following figure shows the transitions between the states of the ENI.
      * ![](https://static-aliyun-doc.oss-cn-hangzhou.aliyuncs.com/file-manage-files/en-US/20230223/uemr/DetachNetworkInterface.png)
      *     *   If the ENI is in the Detaching state, the ENI detachment request is sent and the ENI is being detached from its associated instance.
      *     *   If the ENI is in the Available state, the ENI is detached from its associated instance.
      *     *   If the ENI is stuck in the Detaching state, the ENI may fail to be detached from the associated instance due to specific reasons. For example, the ENI may fail to be detached because the operating system did not respond to the ENI detachment request. If this occurs, you can re-initiate the request to detach the ENI. If the problem persists, restart the instance.
      * **For information about examples on how to call this operation, see **[Detach an ENI](~~471551~~).
      *
     */
    CompletableFuture<DetachNetworkInterfaceResponse> detachNetworkInterface(DetachNetworkInterfaceRequest request);

    /**
      * ## Description
      * To prevent an activation code from being leaked, you can call the DisableActivation operation to disable the activation code. Disabled activation codes cannot be used to register new managed instances. However, managed instances that are already registered are not affected.
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
      * Before you export a custom image, complete the following operations:
      * *   Understand the prerequisites and precautions. For more information, see [Export images](~~58181~~).
      * *   Use Resource Access Management (RAM) to create a RAM role for ECS and grant ECS the permissions to write data to OSS. Perform the following steps:
      *     1.  Create a role named `AliyunECSImageExportDefaultRole` and configure the following trust policy for the role:
      *              {
      *                "Statement": [
      *                  {
      *                    "Action": "sts:AssumeRole",
      *                    "Effect": "Allow",
      *                    "Principal": {
      *                      "Service": [
      *                        "ecs.aliyuncs.com"
      *                      ]
      *                    }
      *                  }
      *                ],
      *                "Version": "1"
      *              }
      *     2.  Attach the `AliyunECSImageExportRolePolicy` system policy to the `AliyunECSImageExportDefaultRole` role. This policy is the default policy that grants ECS the permissions to export images. For more information, go to the [Cloud Resource Access Authorization](https://ram.console.aliyun.com/?spm=5176.2020520101.0.0.64c64df5dfpmdY#/role/authorize?request=%7B%22Requests%22:%20%7B%22request1%22:%20%7B%22RoleName%22:%20%22AliyunECSImageImportDefaultRole%22,%20%22TemplateId%22:%20%22ECSImportRole%22%7D,%20%22request2%22:%20%7B%22RoleName%22:%20%22AliyunECSImageExportDefaultRole%22,%20%22TemplateId%22:%20%22ECSExportRole%22%7D%7D,%20%22ReturnUrl%22:%20%22https:%2F%2Fecs.console.aliyun.com%2F%22,%20%22Service%22:%20%22ECS%22%7D) page. You can also create a custom policy that contains the following content and attach the policy to the role:
      *              {
      *                "Version": "1",
      *                "Statement": [
      *                  {
      *                    "Action": [
      *                      "oss:GetObject",
      *                      "oss:PutObject",
      *                      "oss:DeleteObject",
      *                      "oss:GetBucketLocation",
      *                      "oss:GetBucketInfo",
      *                      "oss:AbortMultipartUpload",
      *                      "oss:ListMultipartUploads",
      *                      "oss:ListParts"
      *                    ],
      *                    "Resource": "*",
      *                    "Effect": "Allow"
      *                  }
      *                ]
      *              }
      * After you export a custom image, the following situation occurs:
      * The custom image is stored in the specified OSS bucket. You can download the custom image. For more information, see [Download objects](~~31912~~).
      *
     */
    CompletableFuture<ExportImageResponse> exportImage(ExportImageRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ExportSnapshotResponse> exportSnapshot(ExportSnapshotRequest request);

    /**
      * *   ECS is a virtualized cloud-based service and cannot be connected to display devices. However, Alibaba Cloud caches system command outputs for the last start, restart, or shutdown of ECS instances. You can call the GetInstanceConsoleOutput operation to obtain the command outputs.
      * *   The command outputs of instances that use the retired instance types cannot be obtained. For more information, see [Retired instance types](~~55263~~).
      * *   The command outputs of Windows instances cannot be obtained.
      *
     */
    CompletableFuture<GetInstanceConsoleOutputResponse> getInstanceConsoleOutput(GetInstanceConsoleOutputRequest request);

    /**
      * ECS returns an instance screenshot that is in the JPG format and encoded in Base64. You must manually decode the screenshot. We recommend that you call this operation for troubleshooting and diagnosis. When you call this operation, take note of the following items:
      * *   The instance must be in the Running state.
      * *   You cannot obtain screenshots of instances whose instance types have been retired. For more information, see [Retired instance types](~~55263~~).
      * *   If you want to call this operation on the same instance multiple times, you must wait at least 10 seconds between each call. Otherwise, the `Throttling` error code is returned.
      *
     */
    CompletableFuture<GetInstanceScreenshotResponse> getInstanceScreenshot(GetInstanceScreenshotRequest request);

    /**
      * When you call this operation, take note of the following items:
      * *   Before you can import an image, you must upload the image to an Object Storage Service (OSS) bucket. For more information, see [Upload objects](~~31886~~).
      * *   In some scenarios, you may want to create a custom image from an existing server and create an ECS instance from the image. The source server can be a physical server, a virtual machine, or a cloud host. However, you must make sure that the virtio driver is installed on the source server, otherwise the ECS instance created from the resulting image may be unable to start. For more information, see [Install the virtio driver](~~62423~~).
      * *   If this is the first time you import images to ECS, you must use Resource Access Management (RAM) to grant ECS the permissions to access your OSS buckets. Otherwise, the `NoSetRoletoECSServiceAcount` error code is returned when you call the ImportImage operation. The [Cloud Resource Access Authorization](https://ram.console.aliyun.com/?spm=5176.2020520101image.0.0.2ffa4df57kSoHX#/role/authorize?request=%7B%22Requests%22%3A%20%7B%22request1%22%3A%20%7B%22RoleName%22%3A%20%22AliyunECSImageImportDefaultRole%22%2C%20%22TemplateId%22%3A%20%22ECSImportRole%22%7D%2C%20%22request2%22%3A%20%7B%22RoleName%22%3A%20%22AliyunECSImageExportDefaultRole%22%2C%20%22TemplateId%22%3A%20%22ECSExportRole%22%7D%7D%2C%20%22ReturnUrl%22%3A%20%22https%3A//ecs.console.aliyun.com/%22%2C%20%22Service%22%3A%20%22ECS%22%7D) page of the RAM console provides a convenient push-button authorization function for this operation. You can also perform the authorization by using a RAM role and RAM policies. The following examples show the policies and permissions required for some steps in the authorization procedure. For more information, see [Control access to resources by using RAM users](~~25481~~).
      *     1.  Create a role named `AliyunECSImageImportDefaultRole`. You must use this exact name. Otherwise, the image cannot be imported. Configure the following trust policy for the role:
      *             {
      *             	"Statement": [
      *             	{
      *             		"Action": "sts:AssumeRole",
      *             		"Effect": "Allow",
      *             		"Principal": {
      *             		"Service": [
      *             			"ecs.aliyuncs.com"
      *             		]
      *             		}
      *             	}
      *             ],
      *             	"Version": "1"
      *             }
      *     2.  Attach the `AliyunECSImageImportRolePolicy` system policy to the role. You can also create a custom policy that contains the following content and attach the policy to the role:
      *         ```
      *         {
      *         	"Version": "1",
      *         	"Statement": [
      *         	{
      *         		"Action": [
      *         				"oss:GetObject",
      *         				"oss:GetBucketLocation",
      *         				"oss:GetBucketInfo"
      *         	],
      *         			"Resource": "*",
      *         			"Effect": "Allow"
      *         			}
      *         	]
      *         }
      *         ```
      * *   You cannot delete an image that is being imported. However, you can call the [CancelTask](~~25624~~) operation to cancel the image import task.
      * *   Make sure that the image is imported to the same region where the OSS bucket resides.
      * *   The valid values of N in the `DiskDeviceMapping.N` parameter range from 1 to 17. When N is set to 1, the disk is a system disk. When N is set to a value from 2 to 17, the disk is a data disk.
      * *   When you set the `Architecture` parameter to `arm64` or when you set the `Platform` parameter to `CentOS Stream`, `Anolis`, `AlmaLinux`, `UOS`, `Kylin`, or `Rocky Linux`, take note of the following items:
      *     *   If you need to set the password or modify the key pair for the imported image, make sure that the image meets the following requirements:
      *         *   The kernel of the operating system supports the `CONFIG_FW_CFG_SYSFS` feature. By default, this feature is supported by Linux community kernel 4.6 and later and CentOS kernel 3.10.0-826.el7 and later. You can run the `grep -nr CONFIG_FW_CFG_SYSFS /boot/config-$(uname -r)` command on the source server of the image. If the command output contains `CONFIG_FW_CFG_SYSFS=y`, the operating system kernel in this image supports the `CONFIG_FW_CFG_SYSFS` feature.
      *         *   The operating system is installed with the latest version of Alibaba Cloud cloud-init. The version of cloud-init 19.1 must be 19.1.3 or later. The version of cloud-init 0.7.6a in some early versions of operating systems must be 0.7.6a15 or later. For more information, see [Install cloud-init](~~57803~~).
      *         *   The operating system supports the SHA-512 encryption algorithm.
      *     *   If you want use the imported image to resize disks and file systems, make sure that the image meets the following requirements:
      *         *   The kernel version of the operating system is later than 3.6.
      *         *   The image supports the growpart command. The `cloud-utils-growpart` package is required to use this command. The methods for installing this package vary based on the operating systems. For more information, see [Resize partitions and file systems of Linux system disks](~~111738~~).
      *         *   The image must support the resize2fs command. The`e2fsprogs` package is required to use this command. By default, the package is installed on the operating system. If the package is not installed, install it.
      *         *   The operating system is installed with the latest version of Alibaba Cloud cloud-init. The version of cloud-init 19.1 must be 19.1.3 or later. The version of cloud-init 0.7.6a in some early versions of operating systems must be 0.7.6a15 or later. For more information, see [Install cloud-init](~~57803~~).
      * *   If the image that you want to import uses the ARM64 architecture, you must set the real-time clock (RTC) to use the Coordinated Universal Time (UTC) time standard. For more information, see [Linux time and time zones](https://icms.alibaba-inc.com/content/ecs/image?l=1\\&m=4656\\&n=3385033).
      *
     */
    CompletableFuture<ImportImageResponse> importImage(ImportImageRequest request);

    /**
      * When you call this operation, take note of the following items:
      * * A maximum of 500 key pairs can be created in each region.
      * * The key pair that you wan to import must support one of the following encryption methods:
      *     * rsa
      *     * dsa
      *     * ssh-rsa
      *     * ssh-dss
      *     * ecdsa
      *     * ssh-rsa-cert-v00@openssh.com
      *     * ssh-dss-cert-v00@openssh.com
      *     * ssh-rsa-cert-v01@openssh.com
      *     * ssh-dss-cert-v01@openssh.com
      *     * ecdsa-sha2-nistp256-cert-v01@openssh.com
      *     * ecdsa-sha2-nistp384-cert-v01@openssh.com
      *     * ecdsa-sha2-nistp521-cert-v01@openssh.com
      *
     */
    CompletableFuture<ImportKeyPairResponse> importKeyPair(ImportKeyPairRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ImportSnapshotResponse> importSnapshot(ImportSnapshotRequest request);

    /**
      * After you call the InstallCloudAssistant operation and then the [RebootInstance](~~25502~~) operation, the Cloud Assistant client is installed and takes effect.
      *
     */
    CompletableFuture<InstallCloudAssistantResponse> installCloudAssistant(InstallCloudAssistantRequest request);

    /**
      * *   The ECS instances on which you want to run the Cloud Assistant command must meet the following requirements. If you specify multiple ECS instances and one of the instances does not meet the requirements to run the command, the call fails. Specify instances that meet the requirements and call the InvokeCommand operation again.
      *     *   The network type is virtual private cloud (VPC). For more information, see [What is a VPC?](~~34217~~)
      *     *   The instances are in the Running (`Running`) state.
      *     *   The Cloud Assistant client is installed on the instances. For more information, see [Install the Cloud Assistant client](~~64921~~).
      *     *   Before you run PowerShell commands, make sure that the PowerShell module is configured for the instances.
      * *   If you set the `Timed` parameter to false, the command is run only once.
      * *   If you set the `Timed` parameter to true, the command is run on a schedule.
      *     *   The schedule is specified by the `Frequency` parameter. The execution results of a command do not affect the next command execution.
      *     *   If you want to specify a schedule by using a cron expression, you can specify a time zone based on your business requirements. If you do not specify a time zone, the schedule is determined by the system time of the instance. Make sure that the time or time zone of the instance meets your business requirements. For more information, see [Configure the NTP service and time zone for Linux instances](~~92803~~) or [Configure the NTP service for Windows instances](~~51890~~).
      *     To ensure that scheduled tasks can run as expected, make sure that the version of the Cloud Assistant client is not earlier than the following versions. A scheduled task can run a command at a specified interval, only once at a specified time, or at specific times based on a cron expression that includes a specific year or time zone. If the `ClientNeedUpgrade` error code is returned, you must update the Cloud Assistant client to the latest version. For more information, see [Upgrade or disable upgrades for the Cloud Assistant client](~~134383~~).
      *           - Linux: 2.2.3.282 
      *           - Windows: 2.1.3.282 
      * *   Command executions may fail due to instance status exceptions, network exceptions, or exceptions on the Cloud Assistant client. If an execution fails, no execution information is generated.
      * *   If you enable the custom parameter feature by setting the EnableParameter parameter to true when you create a command, you must specify custom parameters (`Parameters`) when you run the command.
      *
     */
    CompletableFuture<InvokeCommandResponse> invokeCommand(InvokeCommandRequest request);

    /**
      * A resource is a cloud service entity that you create in Alibaba Cloud, such as an ECS instance, elastic network interface (ENI), or image. A resource group is a collection of infrastructure for projects, environments, or stacks. In a resource group, you can manage resources and monitor and run tasks in a centralized manner without switching between Alibaba Cloud services.
      *
     */
    CompletableFuture<JoinResourceGroupResponse> joinResourceGroup(JoinResourceGroupRequest request);

    /**
      * > This operation is not recommended. We recommend that you call the [ModifyInstanceAttribute](~~25503~~) operation to add instances to or remove instances from a security group, and call the [ModifyNetworkInterfaceAttribute](~~58513~~) operation to add ENIs to or remove ENIs from a security group.
      * When you call this operation, take note of the following items:
      * *   Before you add an instance to a security group, the instance must be in the **Stopped** (Stopped) or **Running** (Running) state.
      * *   An instance can be added to up to five security groups.
      * *   To add an instance to more security groups, [submit a ticket](https://selfservice.console.aliyun.com/ticket/createIndex.htm). An instance can be added to up to 16 security groups.
      * *
      * *   A basic security group can contain up to 2,000 instances. An advanced security group can contain up to 65,536 instances.
      * *   The security group and the instance must belong to the same region.
      * *   The security group and the instance must be of the same network type. If the network type is Virtual Private Cloud (VPC), the security group and the instance must be in the same VPC.
      * *   An instance and an ENI cannot be added to a security group at the same time. You cannot specify the `InstanceId` and `NetworkInterfaceId` parameters at the same time.
      *
     */
    CompletableFuture<JoinSecurityGroupResponse> joinSecurityGroup(JoinSecurityGroupRequest request);

    /**
      * > This operation is not recommended. We recommend that you call the [ModifyInstanceAttribute](~~25503~~) operation to add instances to or remove instances from a security group, and call the [ModifyNetworkInterfaceAttribute](~~58513~~) operation to add ENIs to or remove ENIs from a security group.
      * When you call this operation, take note of the following items:
      * *   Before you remove an instance from a security group, the instance must be in the **Stopped** (Stopped) or **Running** (Running) state.
      * *   An instance must belong to at least one security group. Therefore, if the instance to be removed belongs to only a single security group, the LeaveSecurityGroup request fails.
      * *   An instance and an ENI cannot be removed from a security group at the same time. The `InstanceId` and `NetworkInterfaceId` parameters cannot be specified at the same time.
      *
     */
    CompletableFuture<LeaveSecurityGroupResponse> leaveSecurityGroup(LeaveSecurityGroupRequest request);

    /**
      * Before you call this operation to query the states of Cloud Assistant plug-ins on ECS instances, make sure that the versions of the Cloud Assistant client installed on the instances are not earlier than the following ones:
      * - 2.2.3.344 for Linux instances
      * - 2.1.3.344 for Windows instances
      *
     */
    CompletableFuture<ListPluginStatusResponse> listPluginStatus(ListPluginStatusRequest request);

    /**
      * Specify at least one of the following parameters or parameter pairs in a request to determine a query object:
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
      * *   If you modify the capacity or capacity-related settings of an auto provisioning group, the group executes a scheduling task once after the group is modified.
      * *   You cannot modify an auto provisioning group when the group is being deleted.
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

    /**
      * You can modify a command when it is being executed. After the command is modified, the new command content applies to subsequent executions.
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
      * The pay-as-you-go dedicated host is automatically released at the specified time. Make sure that the dedicated host is no longer needed and that its data is backed up.
      *
     */
    CompletableFuture<ModifyDedicatedHostAutoReleaseTimeResponse> modifyDedicatedHostAutoReleaseTime(ModifyDedicatedHostAutoReleaseTimeRequest request);

    /**
      * ## Description
      * *   If you enable auto-renewal for your subscription dedicated host, the dedicated host is automatically renewed nine days before expiration. The renewal fees are automatically paid at 08:00:00 (UTC+8). If the fees are not paid, they are paid at the same point in time the next day. Automatic payment stops after the fees are paid or after the dedicated host expires and is locked. Make sure that you have sufficient balance within your account.
      * *   Subscription dedicated hosts can be automatically renewed along with the subscription Elastic Compute Service (ECS) instances hosted on the dedicated hosts. For more information, see the description of the AutoRenewWithEcs parameter.
      *
     */
    CompletableFuture<ModifyDedicatedHostAutoRenewAttributeResponse> modifyDedicatedHostAutoRenewAttribute(ModifyDedicatedHostAutoRenewAttributeRequest request);

    CompletableFuture<ModifyDedicatedHostClusterAttributeResponse> modifyDedicatedHostClusterAttribute(ModifyDedicatedHostClusterAttributeRequest request);

    CompletableFuture<ModifyDedicatedHostsChargeTypeResponse> modifyDedicatedHostsChargeType(ModifyDedicatedHostsChargeTypeRequest request);

    /**
      * You can call this operation to modify the demand information about instance types. Alibaba Cloud provides the requested resources based on your demand. You can file demands only for I/O optimized instance types and instances of the virtual private cloud (VPC) type. Parameters except `DemandName` and `DemandDescription` can be modified only for demands that are in the Rejected state.
      * > This operation is in internal preview and has not been officially released. We recommend that you do not use this operation.
      *
     */
    CompletableFuture<ModifyDemandResponse> modifyDemand(ModifyDemandRequest request);

    CompletableFuture<ModifyDeploymentSetAttributeResponse> modifyDeploymentSetAttribute(ModifyDeploymentSetAttributeRequest request);

    CompletableFuture<ModifyDiagnosticMetricSetResponse> modifyDiagnosticMetricSet(ModifyDiagnosticMetricSetRequest request);

    /**
      * *   When you call this operation to modify the attributes of a disk, if you set the DeleteWithInstance parameter to false and the instance to which the disk is attached is locked for security reasons, the DeleteWithInstance parameter of the disk is ignored and the disk is released together with the instance. If `"LockReason" : "security"` is included in the response when you query the information about an instance, the instance is locked for security reasons.
      * *   You can use the `DiskIds.N` parameter to specify multiple disks. This way, you can modify the attributes of the disks at the same time, including names, descriptions, and whether to release the disks together with the associated instances.
      *
     */
    CompletableFuture<ModifyDiskAttributeResponse> modifyDiskAttribute(ModifyDiskAttributeRequest request);

    /**
      * After you change the billing method, the payment (if any) is automatically completed. Maintain a sufficient account balance. Otherwise, your order becomes invalid and is canceled. If your account balance is insufficient, you can set the AutoPay parameter to false to generate an unpaid order. Then, you can log on to the [ECS console](https://ecs.console.aliyun.com/) to pay for the order.
      * When you call this operation, take note of the following items:
      * *   You can change the billing method from subscription to pay-as-you-go for disks that are attached to a subscription instance.
      * *   You can change the billing method from pay-as-you-go to subscription for data disks that are attached to a subscription or pay-as-you-go instance.
      * *   The instance cannot be in the Stopped state due to overdue payments.
      * *   You can change the billing method of each disk up to three times. Up to three refunds can be made for the price differences for each disk.
      * *   The price difference is refunded to the payment account that you used. Vouchers that have been redeemed are not refundable.
      * *   You cannot change the billing method again within 5 minutes of a successful change.
      * *   The billing method of disks with the multi-attach feature enabled must be pay-as-you-go and cannot be changed to subscription.
      *
     */
    CompletableFuture<ModifyDiskChargeTypeResponse> modifyDiskChargeType(ModifyDiskChargeTypeRequest request);

    CompletableFuture<ModifyDiskDeploymentResponse> modifyDiskDeployment(ModifyDiskDeploymentRequest request);

    /**
      * ## Description
      * When you call this operation, take note of the following items:
      * *   To modify the performance level of an ESSD, take note of the following items:
      *     *   For a subscription ESSD, you can only upgrade its performance level.
      *     *   For a pay-as-you-go ESSD, You can upgrade or downgrade its performance level. However, you cannot downgrade the performance level to PL0.
      *     *   The ESSD must be in the **In Use** (In_Use) or **Unattached** (Available) state.
      *     *   If the ESSD is attached to an ECS instance, the instance must be in the **Running** (Running) or **Stopped** (Stopped) state. The instance cannot be in the Expired state or stopped due to an overdue payment.
      *     *   If you cannot upgrade the performance level of the ESSD due to its capacity, resize the ESSD by calling the [ResizeDisk](~~25522~~) operation and then try again. For more information, see [Enhanced SSDs](~~122389~~).
      * *   For more information about the limits on changing the category of a disk, see the "Limits" section of the [Change the category of a disk](~~161980~~) topic.
      * The new disk category or performance level takes effect immediately after this operation is executed. Alibaba Cloud calculates the bill based on the new disk category and performance level.
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
      * When you call this operation, take note of the following items:
      * *   You can share only your custom images with other Alibaba Cloud accounts.
      * *   You can share a custom image with up to 10 Alibaba Cloud accounts in a request. You can specify up to 10 Alibaba Cloud account IDs by using the AddAccount.N parameter or the RemoveAccount.N parameter. If you specify more than 10 account IDs, the parameter value does not take effect.
      * *   You can share a custom image with up to 50 Alibaba Cloud accounts in total.
      * *   After you create an instance from a shared custom image by calling the [RunInstances](~~63440~~) operation, you cannot call the [ReInitDisk](~~25519~~) operation to reinitialize the system disk of the instance if the image owner unshares the image or calls the [DeleteImage](~~25537~~) operation to delete the image.
      * To publish or unpublish a community image, take note of the following items:
      * *   Alibaba Cloud provides only the platform where the community images can be published and managed. The owner of a community image is responsible for the quality and updates of the image. Make sure that you read and agree to the Community Image Agreement. Otherwise, you cannot publish community images. For more information, see [Publish a community image](~~208370~~)
      * *   You cannot publish encrypted images as community images.
      * *   All community images are publicly available. All Alibaba Cloud accounts that reside in the same region as a community image can access the image.
      * *   You cannot share, export, or copy community images.
      * *   After a community image is unpublished, the image is no longer available to Alibaba Cloud accounts. If you share a custom image with specific Alibaba cloud accounts and then publish the image as a community image, the image is still shared with the accounts.
      *
     */
    CompletableFuture<ModifyImageSharePermissionResponse> modifyImageSharePermission(ModifyImageSharePermissionRequest request);

    /**
      * A private pool is generated after an elasticity assurance or a capacity reservation is created. The private pool is associated with information about instances that are created by using the private pool. You can also use a private pool when you create an ECS instance, so that the instance can be matched to the elasticity assurance or capacity reservation associated with the private pool.
      * *   After you call this operation to modify the attributes of the private pool for an instance, you do not need to restart the instance.
      * *   When you call the following operations, the system rematches the instance with private pools. If the instance already matches a specified private pool, the call to an operation may fail when the private pool capacity is used up or because the private pool expires. If the call fails, call the ModifyInstanceAttachmentAttributes operation to change the match mode of the private pool to `Open`.
      *     *   StartInstance
      *     *   ReActivateInstances
      *     *   ModifyInstanceChargeType
      *     *   ModifyPrepayInstanceSpec
      *     *   ReplaceSystemDisk
      *
     */
    CompletableFuture<ModifyInstanceAttachmentAttributesResponse> modifyInstanceAttachmentAttributes(ModifyInstanceAttachmentAttributesRequest request);

    /**
      * If the response contains `{"OperationLocks": {"LockReason" : "security"}}` when you query the information of an instance, the instance is locked for security reasons and all operations are prohibited on it.
      * When you call this operation, take note of the following items:
      * *   Modify the hostname (`HostName`): After the hostname is modified, you must restart the instance by performing the operations described in [Restart an instance](~~25440~~) in the ECS console or by calling the [RebootInstance](~~25502~~) operation for the new hostname to take effect. The new hostname does not take effect if you restart the instance from within the operating system.
      * *   Reset the password (`Password`):
      *     *   The instance must not be in the **Starting** (`Starting`) state.
      *     *   After the password is reset, you must restart the instance by performing the operations described in [Restart an instance](~~25440~~) in the ECS console or by calling the [RebootInstance](~~25502~~) operation for the new password to take effect. The new password does not take effect if you restart the instance from within the operating system.
      * *   Modify user data (`UserData`):
      *     *   The instance must be in the **Stopped** (`Stopped`) state.
      *     *   The instance must meet the conditions on user data. For more information, see [Overview of ECS instance user data](~~49121~~).
      * *   Change the security group (`SecurityGroupIds.N`):
      *     *   You can move an instance to a security group of a different type. Before you move an instance to a security group of a different type, we recommend that you evaluate the differences in rule configurations of the two security group types. This helps prevent business continuity issues when you switch security groups.
      *     *   Security groups of instances in the classic network cannot be changed. For more information, see the description of the `SecurityGroupIds.N` parameter.
      * *   Modify the number of queues supported by the primary elastic network interface (ENI) (`NetworkInterfaceQueueNumber`):
      *     *   The instance must be in the Stopped (`Stopped`) state.
      *     *   The value of this parameter cannot exceed the maximum number of queues per ENI allowed for the instance type.
      *     *   The total number of queues for all ENIs on the instance cannot exceed the queue quota for the instance type. To obtain the maximum number of queues per ENI and the queue quota for an instance type, you can call the [DescribeInstanceTypes](~~25620~~) operation to query the `MaximumQueueNumberPerEni` and `TotalEniQueueQuantity` parameters.
      *     *   If you set the NetworkInterfaceQueueNumber parameter to -1, the value is reset to the default value for the instance type. To obtain the default number of queues supported by the primary ENI for an instance type, you can call the [DescribeInstanceTypes](~~25620~~) operation to query the `PrimaryEniQueueNumber` parameter.
      *
     */
    CompletableFuture<ModifyInstanceAttributeResponse> modifyInstanceAttribute(ModifyInstanceAttributeRequest request);

    CompletableFuture<ModifyInstanceAutoReleaseTimeResponse> modifyInstanceAutoReleaseTime(ModifyInstanceAutoReleaseTimeRequest request);

    /**
      * Before you call this operation, make sure that you are familiar with the billing methods and pricing schedule of Elastic Compute Service (ECS). For more information, see the [Elastic Compute Service](https://www.alibabacloud.com/product/ecs#pricing) product page.
      * *   The payment for auto-renewal is deducted automatically at 08:00:00 (UTC+8) nine days before the instance expires.
      * *   If the first deduction attempt fails, Alibaba Cloud attempts to deduct the payment each day until the payment is deducted or until the instance is locked after the nine-day period ends. Make sure that your account balance or credit balance is sufficient.
      *
     */
    CompletableFuture<ModifyInstanceAutoRenewAttributeResponse> modifyInstanceAutoRenewAttribute(ModifyInstanceAutoRenewAttributeRequest request);

    /**
      * Before you call this operation, make sure that you are familiar with the billing methods and pricing of ECS. For more information, see the [Elastic Compute Service](https://www.alibabacloud.com/product/ecs#pricing) product page.
      * When you call this operation, take note of the following items:
      * *   The instances must be in the **Running** (`Running`) or **Stopped** (`Stopped`) state, and you cannot have overdue payments associated with them.
      * *   After you change the billing method, the payment (if any) is automatically completed. Make sure that the balance in your account is sufficient. Otherwise, your order becomes invalid and is canceled. If your account balance is insufficient, you can set the `AutoPay` parameter to `false` to generate an unpaid order. Then, you can log on to the [ECS console](https://ecs.console.aliyun.com/) to pay for the order.
      * *   **Change the billing method from subscription to pay-as-you-go**:
      *     *   Your ECS usage determines whether the billing method of an instance can be changed from subscription to pay-as-you-go.
      *     *   After you change the billing method of an instance from subscription to pay-as-you-go, the new billing method remains in effect for the remaining lifecycle of the instance. The price difference is refunded to the payment account that you used. Vouchers that have been redeemed are not refundable.
      *     *   **Refund rule**: You have a quota for the total refund amount each month, and the unused balance of this quota is not carried over to the next month. If you use up the refund quota of the current month, you can change the billing method only in the next month. The refund amount incurred after you change the billing method is calculated based on the following formula: **Number of vCPUs × (Number of remaining days × 24 ± Number of remaining or elapsed hours)**.
      * *   **Change the billing method from pay-as-you-go to subscription**:
      *     *   You can change the billing method of all data disks that are attached to an instance from pay-as-you-go to subscription.
      *     *   This operation cannot be called for a pay-as-you-go instance that has an automatic release time set.
      *
     */
    CompletableFuture<ModifyInstanceChargeTypeResponse> modifyInstanceChargeType(ModifyInstanceChargeTypeRequest request);

    /**
      * When you call this operation for an ECS instance, take note of the following items:
      * *   The ECS instance must be in the **Stopped** state. The instance is automatically restarted after it is migrated.
      * *   The network type of the instance must be Virtual Private Cloud (VPC).
      * *   The instance and the destination dedicated host to which to migrate the instance must belong to the same account and reside in the same region and zone.
      * *   A pay-as-you-go instance can be migrated to a subscription dedicated host. A subscription instance can be migrated only between subscription dedicated hosts. The expiration date of the subscription instance cannot be later than that of the destination dedicated host.
      * *   You can migrate only pay-as-you-go instances from a shared host to a dedicated host. You cannot migrate subscription or preemptible instances from a shared host to a dedicated host.
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
      * When you call this operation, take note of the following items:
      * *   As of November 27, 2020, the maximum bandwidth value available for you to create ECS instances or to change ECS instance configurations is subject to throttling policies for your account. To increase the maximum bandwidth value, submit a ticket. The following throttling policies apply:
      *     *   Within a single region, the sum of actual peak bandwidths of all ECS instances that use the pay-by-traffic billing method for network usage cannot exceed 5 Gbit/s.
      *     *   Within a single region, the sum of actual peak bandwidths of all ECS instances that use the pay-by-bandwidth billing method for network usage cannot exceed 50 Gbit/s.
      * *   If you upgrade the outbound public bandwidth (InternetMaxBandwidthOut) of a subscription (PrePaid) instance from 0 Mbit/s when you modify the bandwidth configurations of the instance, a public IP address is automatically assigned to the instance.
      * *   If you upgrade the outbound public bandwidth (InternetMaxBandwidthOut) of a pay-as-you-go (PostPaid) instance from 0 Mbit/s when you modify the bandwidth configurations of the instance, no public IP address is automatically assigned to the instance. You must call the [AllocatePublicIpAddress](~~25544~~) operation to assign a public IP address to the instance.
      * *   An instance in the classic network must be in the Stopped state before you can upgrade the outbound public bandwidth (InternetMaxBandwidthOut) of the instance from 0 Mbit/s.
      * *   After the bandwidth is upgraded, AutoPay is set to true by default and the payment is automatically made. Maintain a sufficient account balance. Otherwise, your order becomes invalid and must be canceled. If your account balance is insufficient, you can set AutoPay to false. When you call the ModifyInstanceNetworkSpec operation, an unpaid order is generated. Then, you can log on to the ECS console to pay for the order.
      * *   The price difference is refunded to the payment account that you used. Vouchers or coupons that have been redeemed cannot be returned.
      *
     */
    CompletableFuture<ModifyInstanceNetworkSpecResponse> modifyInstanceNetworkSpec(ModifyInstanceNetworkSpecRequest request);

    /**
      * ## Description
      * Before you call this operation, make sure that you understand the billing methods and pricing schedule of ECS. For more information, visit the [Elastic Compute Service](https://www.aliyun.com/price/product#/ecs/detail) product page.
      * For information about ECS SDK for Python used to change resource configurations, see [Query available resources for configuration changes](~~109517~~).
      * When you call this operation, take note of the following items:
      * *   You must have no overdue payments in your account.
      * *   You can adjust the public bandwidth of an instance only when the instance is in the **Running** (`Running`) or **Stopped** (`Stopped`) state.
      * *   Before you change the instance type of a pay-as-you-go instance, you can call the [DescribeResourcesModification](~~66187~~) operation to query the instance types to which you can change.
      * *   You can change the instance type of an instance only when the instance is in the **Stopped** (`Stopped`) state.
      * *   The instance type and the public bandwidth of an instance cannot be changed together.
      * *   As of November 27, 2020, the maximum bandwidth value available for you to create ECS instances or to change ECS instance configurations is subject to throttling policies for your account. To increase the maximum bandwidth value, submit a ticket. The following throttling policies apply:
      *     *   Within a single region, the sum of actual maximum bandwidths of all ECS instances that use the pay-by-traffic billing method for network usage cannot exceed 5 Gbit/s.
      *     *   Within a single region, the sum of actual maximum bandwidths of all ECS instances that use the pay-by-bandwidth billing method for network usage cannot exceed 50 Gbit/s.
      *
     */
    CompletableFuture<ModifyInstanceSpecResponse> modifyInstanceSpec(ModifyInstanceSpecRequest request);

    /**
      * *   The password must be six characters in length and can contain only uppercase letters, lowercase letters, and digits.
      * *   After you modify the VNC password of an instance, take note of the following items:
      *     *   If the instance is I/O optimized, the new password takes effect immediately.
      *     *   If the instance is non-I/O optimized, you must [restart the instance](~~25440~~) by using the ECS console or by calling the [RebootInstance](~~25502~~) operation for the new password to take effect.
      *
     */
    CompletableFuture<ModifyInstanceVncPasswdResponse> modifyInstanceVncPasswd(ModifyInstanceVncPasswdRequest request);

    /**
      * The instance must be in the **Stopped** state.``
      * *   When you call this operation to modify the private IP address or vSwitch of an instance, take note of the following items:
      *     *   If the instance is newly created, you must restart the instance before you can call this operation.
      *     *   After you modify the private IP address or vSwitch of an instance, you must restart the instance before you can call this operation again.
      * *   When you call this operation to modify the VPC of an instance, take note of the following items:
      *     *   **Instance:**
      *         *   The instance cannot be associated with Server Load Balancer (SLB) instances.
      *         *   The instance cannot be in the Locked, To Be Released, Expired, Expired and Being Recycled, or Overdue and Being Recycled state. For more information, see [ECS instance lifecycle](~~25380~~).
      *         *   The instance cannot be in-use or used in conjunction with other cloud services. For example, the instance cannot be in the process of being migrated or having its VPC changed, or the databases deployed on the instance cannot be managed by Data Transmission Service (DTS).
      *     *   **Network:**
      *         *   The cut-through mode or multi-elastic IP address (EIP) to elastic network interface (ENI) mode must be disabled.
      *         *   The instance cannot be associated with a high-availability virtual IP address (HAVIP).
      *         *   The vSwitch of the instance cannot be associated with a custom route table.
      *         *   The instance cannot have Global Accelerator (GA) activated.
      *         *   The instance cannot have secondary ENIs bound.
      *         *   The instance cannot have IPv6 addresses assigned.
      *         *   The primary ENI of the instance cannot be associated with multiple IP addresses.
      *         *   The vSwitch specified by the VSwitchId parameter must belong to the new VPC.
      *         *   The new and original vSwitches must reside within the same zone.
      *         *   If the private IP address of the primary ENI is specified, the private IP address must be available and within the CIDR block of the vSwitch. If the private IP address is not specified, the system randomly assigns one. The available IP addresses in the CIDR block of the new vSwitch must be sufficient.
      *         *   If advanced features are enabled in the new VPC, take note of the instance families that do not support advanced VPC features. For more information, see [Instance families that do not support advanced VPC features](~~163466~~).
      *         *   The Alibaba Cloud account that owns the new VPC cannot share the VPC with other accounts.
      *     *   **Security group (SecurityGroupId.N):**
      *         *   All security groups must be of the same type.
      *         *   The valid values of N depend on the maximum number of security groups to which an instance can belong. For more information, see [Limits](~~25412~~).
      *         *   The specified security groups must belong to the new VPC.
      *         *   You can switch the instance to a security group of a different type. If you want to switch an instance to a security group of a different type, you must understand the differences between the rule configurations of the two security group types to avoid impacts on the instance network. For more information, see [Overview](~~25387~~).
      *
     */
    CompletableFuture<ModifyInstanceVpcAttributeResponse> modifyInstanceVpcAttribute(ModifyInstanceVpcAttributeRequest request);

    CompletableFuture<ModifyLaunchTemplateDefaultVersionResponse> modifyLaunchTemplateDefaultVersion(ModifyLaunchTemplateDefaultVersionRequest request);

    /**
      * ## Description
      * The ModifyManagedInstance operation can be called to modify only the name of a single managed instance.
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
      * ## Description
      * *   The specified CIDR block must be valid. For example, 10.0.0.0/8 is a valid CIDR block while 10.0.0.1/8 is not. For more information, see the [What is CIDR?](https://www.alibabacloud.com/help/doc-detail/40637.htm#section-jua-0tj-q5m) section in Network FAQ.
      * *   When you add or delete an entry, you cannot specify duplicate CIDR blocks. Examples:
      *     *   For IPv4 CIDR blocks, you cannot specify the 10.0.0.0/8 CIDR block in two entries. You cannot specify the 10.0.0.1/32 CIDR block in one entry and the 10.0.0.1 CIDR block in another entry. These two CIDR blocks are the same.
      *     *   For IPv6 CIDR blocks, you cannot specify the 2001:fd01:0:0:0:0:0:0/32 CIDR block in one entry and the 2001:fd01::/32 CIDR block in another entry. These two CIDR blocks are the same.
      * *   The CIDR block in an entry to be added cannot the same as that in an entry to be deleted. For example, when you add an entry in which the 10.0.0.0/8 CIDR block is specified, the entry to be deleted cannot have the 10.0.0.0/8 CIDR block specified.
      * *   If you want to modify the description of an entry, you must specify the CIDR block (`AddEntry.N.Cidr`) and new description (`AddEntry.N.Description`) in the entry.
      *
     */
    CompletableFuture<ModifyPrefixListResponse> modifyPrefixList(ModifyPrefixListRequest request);

    /**
      * Before you call this operation, make sure that you understand the billing methods, pricing schedule, and refund policies of [ECS](https://www.alibabacloud.com/product/ecs#pricing). For more information, see [Request a refund for the downgrade of resource specifications](~~201955~~).
      * Before you change the instance type of a subscription instance, you can call the [DescribeResourcesModification](~~66187~~) operation to query the instance types to which you can change. You can use ECS SDK for Python to query the instance types to which you can change. For more information, see [Query available resources for configuration changes](~~109517~~).
      * When you call this operation, take note of the following items:
      * *   The instance type of an expired instance cannot be changed. You can renew the instance and try again.
      * *   When you downgrade the instance type of an instance, take note of the following items:
      *     *   The instance must be in the **Stopped** state.``
      *     *   You must specify the operation type by setting `OperatorType` to downgrade.
      *     *   You can downgrade the configurations of an instance up to three times. Therefore, a maximum of three refunds for price difference can be made for an instance. Downgrade operations include instance type downgrades, bandwidth configuration downgrades, and the change of the disk billing method from subscription to pay-as-you-go.
      *     *   The price difference is refunded to the payment account you used. Vouchers that have been redeemed are not refundable.
      * *   This operation is asynchronous. It takes 5 to 10 seconds for the instance type to change. You must restart the instance by calling the RebootInstance operation or by using the ECS console for the instance type change to take effect. If you restart only the operating system of the instance, the instance type change does not take effect.
      *     *   If the instance is in the **Stopped** state, you only need to start the instance. You do not need to restart the instance after it enters the Running state.
      *     *   If `RebootWhenFinished` is set to true for the instance, you do not need to manually restart the instance.
      *
     */
    CompletableFuture<ModifyPrepayInstanceSpecResponse> modifyPrepayInstanceSpec(ModifyPrepayInstanceSpecRequest request);

    CompletableFuture<ModifyReservedInstanceAttributeResponse> modifyReservedInstanceAttribute(ModifyReservedInstanceAttributeRequest request);

    CompletableFuture<ModifyReservedInstanceAutoRenewAttributeResponse> modifyReservedInstanceAutoRenewAttribute(ModifyReservedInstanceAutoRenewAttributeRequest request);

    /**
      * ## Description
      * When you call this operation, take note of the following items:
      * *   For information about limits on reserved instances, see the "Limits" section in [Reserved instance overview](~~100370~~).
      * *   Before you call this operation to split a reserved instance, make sure that you fully understand the limits on splitting a reserved instance. For more information, see [Split a reserved instance](~~100375~~).
      * *   Before you call this operation to merge reserved instances, make sure that you fully understand the limits on merging reserved instances. For more information, see [Merge reserved instances](~~132229~~).
      * *   Before you call this operation to modify a reserved instance, make sure that you fully understand the limits and methods of modifying a reserved instance. For more information, see [Modify a reserved instance](~~132230~~).
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
      * ## Description
      * When you modify the rules of a security group by specifying the rule IDs, take note of the following limits:
      * *   If the type of the authorization object (source or destination) is IP address or CIDR block, security group, or prefix list, the type cannot be changed. If the original authorization object is an IP address, you can change it to another IP address or a CIDR block, but not to a security group or prefix list.
      * *   The IP address family of the authorization object cannot be changed. For example, if the original authorization object is an IPv4 CIDR block, you cannot change it to an IPv6 CIDR block. If the original authorization object is an IPv4 prefix list, you cannot change it to an IPv6 prefix list.
      * *   The modified security group rule cannot be the same as other existing rules.
      * *   If you want to delete the values of non-empty parameters for the rule, we recommend that you create a new rule and delete the original rule.
      *
     */
    CompletableFuture<ModifySecurityGroupEgressRuleResponse> modifySecurityGroupEgressRule(ModifySecurityGroupEgressRuleRequest request);

    /**
      * When you call this operation, take note of the following items:
      * *   When InnerAccessPolicy is set to Accept for a security group, the instances in the security group can communicate with each other. In this case, the Accept internal access control policy takes precedence over user-created security group rules to keep instances in the security group accessible to each other.
      * *   When InnerAccessPolicy is set to Drop for a security group, the instances in the security group are isolated from each other. In this case, user-created security group rules take precedence over the Drop internal access control policy and can be used to allow access between the instances. For example, you can call the [AuthorizeSecurityGroup](~~25554~~) operation to create an inbound security group rule that allows the instances in the security group to communicate with each other.
      * *   You can call the [DescribeSecurityGroupAttribute](~~25555~~) operation to query the internal access policy of a security group.
      *
     */
    CompletableFuture<ModifySecurityGroupPolicyResponse> modifySecurityGroupPolicy(ModifySecurityGroupPolicyRequest request);

    /**
      * When you modify a security group rule by specifying its ID, take note of the following items:
      * *   If the type of the authorization object (source or destination) is IP address or CIDR block, security group, or prefix list, the authorization object type cannot be changed. The type of an existing security group authorization object cannot be modified. If the original authorization object is an IP address, you can change it to another IP address or a CIDR block, but not to a security group or prefix list.
      * *   The IP address family of the authorization object cannot be changed. For example, if the original authorization object is an IPv4 CIDR block, you cannot change it to an IPv6 CIDR block. If the original authorization object is an IPv4 prefix list, you cannot change it to an IPv6 prefix list.
      * *   The modified security group rule cannot be the same as other existing rules.
      * *   If you want to delete the values of non-empty parameters for the rule, we recommend that you create a new rule and delete the original rule.
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
      * *   Before you call this operation, make sure that you are familiar with the billing method of reserved instances. For more information, see [Reserved instances](~~100371~~).
      * *   Before you purchase a reserved instance, you can call the [DescribeAvailableResource](~~66186~~) operation to query available instance resources.
      *
     */
    CompletableFuture<PurchaseReservedInstancesOfferingResponse> purchaseReservedInstancesOffering(PurchaseReservedInstancesOfferingRequest request);

    /**
      * Before you call this operation, make sure that you understand the billing methods and pricing of SCUs. For more information, see [Storage capacity units](~~137897~~).
      *
     */
    CompletableFuture<PurchaseStorageCapacityUnitResponse> purchaseStorageCapacityUnit(PurchaseStorageCapacityUnitRequest request);

    /**
      * When you call this operation, take note of the following points:
      * *   The instance must be in the **Expired** (`Stopped`) or **Overdue and Being Recycled** (`Stopped`) state.
      * *   To continue using instances in these states, you must reactivate the instances within 15 days of settling any overdue payments. If you do not reactivate the instance within the aforementioned time, data on the instance can no longer be recovered. This operation may fail on pay-as-you-go instance of the Virtual Private Cloud (VPC) type. To solve this problem, try again several minutes later or [submit a ticket](https://selfservice.console.aliyun.com/ticket/createIndex.htm).
      * *   After you settle all overdue payments, make sure that the total of your balance, vouchers, and coupons within your Alibaba Cloud account is 100 RMB or more. Otherwise, you may not be able to reactivate the instance. For more information, see [Reboot an instance](~~34374~~).
      * *   After the operation is called, the instance enters the `Starting` state.
      * *   You cannot call this operation on ECS instances that are locked for security reasons. An instance is locked for security reasons if `OperationLocks` in the response returned when you query information of the instance contains `"LockReason": "security"`. For more information, see [API behavior when an instance is locked for security reasons](~~25695~~).
      *
     */
    CompletableFuture<ReActivateInstancesResponse> reActivateInstances(ReActivateInstancesRequest request);

    /**
      * When you call this operation, take note of the following items:
      * *   The disk that you want to re-initialize must be in the **In Use** (In_use) state and the instance to which the disk is attached must be in the **Stopped** (Stopped) state.
      * *   If the instance has never been started since it was created, the disks attached to it cannot be re-initialized.
      * *   If a local snapshot has been created for a disk, the disk cannot be re-initialized.
      * *   Disks that have the multi-attach feature enabled cannot be re-initialized.
      * *   When a system disk is re-initialized, it is restored to the state of the image from which it was created. If the source image is deleted, the system disk cannot be re-initialized.
      * *   When a separately created data disk is re-initialized, it is restored to an empty data disk.
      * *   When a data disk that was created from a snapshot is re-initialized, the disk is restored to the state of the snapshot.
      * > If the source snapshot is deleted, the disk cannot be re-initialized and an error is returned.
      *
     */
    CompletableFuture<ReInitDiskResponse> reInitDisk(ReInitDiskRequest request);

    /**
      * *   The ECS instance to which you want to restart must be in the **Running** (`Running`) state.
      * *   After this operation is called, the status of the instance changes to `Starting`.****
      * *   An instance can be forcefully restarted. A forced restart (`ForceReboot`) is equivalent to powering off a traditional server and then starting the server. If data in the instance operating system is not written to block storage devices when the operation is called, the data is lost.
      * *   If `OperationLocks` in the DescribeInstances response contains "LockReason" : "security" for an instance, the instance is locked for security reasons and cannot be restarted. For more information, see [API behavior when an instance is locked for security reasons](~~25695~~).
      *
     */
    CompletableFuture<RebootInstanceResponse> rebootInstance(RebootInstanceRequest request);

    /**
      * *   The ECS instances to which you want to restart are in the **Running** (`Running`) state.
      * *   You can restart multiple instances at a time and use the `BatchOptimization` parameter to specify the batch operation mode.
      * *   Instances can be forcefully restarted. A force restart (`ForceStop`) is equivalent to powering off traditional servers to restart them. This operation may lead to data loss if data in the instance operating system is not written to block storage devices.
      * *   If the response contains `{"OperationLocks": {"LockReason" : "security"}}` when you query the information of the instance, the instance is locked for security reasons and all operations are prohibited on it.
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
      * RedeployInstance is an asynchronous operation. This operation migrates data before it restarts the instance. After the instance is redeployed, the instance enters the Running (`Running`) state. If the instance fails to be redeployed, the instance returns to the original physical server and the state before redeployment.
      * When you call this operation, take note of the following items:
      * * The instance must be in the Running (Running) or Stopped (Stopped) state. After the instance is redeployed, the following changes occur to the status of the instance:
      *   * If the instance is in the Running (`Running`) state, the instance enters the Stopping (`Stopping`) state.
      *   * If the instance is in the Stopped (`Stopped`) state, the instance enters the Starting (`Starting`) state.
      * * If an instance is deployed on a dedicated host, you cannot redeploy the instance.
      * * If the `OperationLocks` parameter in the DescribeInstances response contains `"LockReason" : "security"` for an instance, the instance is locked for security reasons and cannot be redeployed.
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

    CompletableFuture<ReleaseCapacityReservationResponse> releaseCapacityReservation(ReleaseCapacityReservationRequest request);

    /**
      * Before you release a pay-as-you-go dedicated host, make sure that no Elastic Compute Service (ECS) instances are deployed on the dedicated host.
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
      * ## Description
      * When you renew the subscription dedicated hosts, deductible vouchers are used first by default. Make sure that your account supports credit card payments or balance payments.
      *
     */
    CompletableFuture<RenewDedicatedHostsResponse> renewDedicatedHosts(RenewDedicatedHostsRequest request);

    /**
      * *   Before you call this operation, make sure that you are familiar with the billing methods and pricing schedule of ECS. For more information, see the [Elastic Compute Service](https://www.alibabacloud.com/product/ecs#pricing) product page.
      * *   You can call this operation to renew a subscription ECS instance for a period of time or to a synchronized expiration date.
      * *   You cannot renew a subscription instance for a specific period of time and to a synchronized expiration date at the same time by calling this operation. The parameter pair (`Period` and `PeriodUnit`) that is related to the renewal period and the `ExpectedRenewDay` parameter are mutually exclusive.
      * *   Your account must have sufficient credits.
      *
     */
    CompletableFuture<RenewInstanceResponse> renewInstance(RenewInstanceRequest request);

    /**
      * *   Before you call this operation, make sure that you fully understand the billing method of reserved instances. For more information, see [Reserved instances](~~100371~~).
      * *   You can call the [DescribeReservedInstances](~~100065~~) operation to query the reserved instances that you purchased.
      *
     */
    CompletableFuture<RenewReservedInstancesResponse> renewReservedInstances(RenewReservedInstancesRequest request);

    /**
      * When you call this operation, take note of the following items:
      * *   You must specify the `ImageId` parameter or the `DiskId` parameter. You cannot specify both parameters in the same request. Otherwise, the request fails and an error message is returned.````
      * > You can use the `DiskId` parameter to replace the operating system of an instance. This feature is in invitational preview. To use this feature, [submit a ticket](https://workorder-intl.console.aliyun.com/console.htm).
      * *   The category of the system disk cannot be changed.
      * *   The billing method of the system disk cannot be changed.
      * *   The instance must be in the `Stopped` state.
      *     **
      *     **Note**This item is applicable only to instances in virtual private clouds (VPCs). If the instance is a pay-as-you-go instance and the economical mode is enabled by default for the instance, you must set the stop mode to the standard mode when you stop the instance. This prevents instance restart failures caused by insufficient resources after the system disk is replaced. For more information, see [StopInstance](~~25501~~).
      * *   If the response contains `{"OperationLocks": {"LockReason" : "security"}}`, the instance is locked for security reasons. No operations are allowed on the instance.`` For more information, see [API behavior when an instance is locked for security reasons](~~25695~~).
      * *   You cannot have unpaid orders that are associated with the instance.
      * *   You can configure the `SystemDisk.Size` parameter to specify the capacity of the new system disk.
      * After you call this operation, you can use one of the following methods to check whether the system disk is replaced:
      * *   Call the [DescribeDisks](~~25514~~) operation to query the state of the new system disk. If the new system disk is in the In_use state, the system disk is replaced.
      * *   Call the [DescribeInstances](~~25506~~) operation to query the state of the instance whose system disk is replaced. If `OperationLocks` in the response is empty, the system disk is replaced.
      *
     */
    CompletableFuture<ReplaceSystemDiskResponse> replaceSystemDisk(ReplaceSystemDiskRequest request);

    CompletableFuture<ReportInstancesStatusResponse> reportInstancesStatus(ReportInstancesStatusRequest request);

    /**
      * When you call this operation, take note of the following items:
      * *   The disk must be in the In Use (In_Use) or Unattached (Available) state.
      * *   The Elastic Compute Service (ECS) instance to which the disk is attached must be in the Stopped (Stopped) state. You can call the [StopInstances](~~155372~~) operation to stop an instance.
      * *   The snapshot specified by the SnapshotId parameter must be created from the disk specified by the DiskId parameter.
      * *   When you call the [DescribeInstances](~~25506~~) operation to query instance information, if the response contains `{"OperationLocks": {"LockReason" : "security"}}` for an instance, the instance is locked for security reasons and no operations can be performed on the instance.
      *
     */
    CompletableFuture<ResetDiskResponse> resetDisk(ResetDiskRequest request);

    /**
      * This operation will be removed in the future. We recommend that you call the [ResetDisk](~~25520~~) operation to roll back a disk.
      *
     */
    CompletableFuture<ResetDisksResponse> resetDisks(ResetDisksRequest request);

    /**
      * ## Description
      * >  Before you call this operation to resize a disk, you must check the partition format of the disk. You cannot resize a master boot record (MBR) disk to greater than or equal to 2 TiB without data loss. To resize an MBR disk to greater than or equal to 2 TiB in size, we recommend that you create and attach a new data disk with the desired size. Then, you can partition and format the new data disk to GUID partition table (GPT) and copy data from the MBR disk to the new GPT data disk. For more information, see [Resize disks offline](~~44986~~).
      * *   You can resize the following categories of disks: basic disks (`cloud`), ultra disks (`cloud_efficiency`), standard SSDs (`cloud_ssd`), and enhanced SSDs (ESSDs) (`cloud_essd`).
      * *   You cannot resize a disk when a snapshot is being created for the disk.
      * *   The instance to which the disk to be resized is attached must be in the **Running** (`Running`) or **Stopped** (`Stopped`) state.
      * *   After you resize a disk, its partitions and file systems are not changed. You must manually allocate the storage space on the disk after it is resized.
      * *   Disks for which the multi-attach feature is enabled can only be resized offline. Before you resize the disks, make sure that instances to which the disks are attached are in the **Stopped** (`Stopped`) state.
      *
     */
    CompletableFuture<ResizeDiskResponse> resizeDisk(ResizeDiskRequest request);

    /**
      * When you call this operation, you can use one of the following groups of parameters to specify the security group rules that you want to delete:
      * * Parameters used to specify the IDs of security group rules. We recommend that you specify the IDs of security group rules to delete the rules. - If the specified security group rule ID does not exist, an error is reported. - Parameters that are no longer used and their Permissions.N-prefixed counterparts cannot be specified at the same time. - Sample request:
      *         http(s)://ecs.aliyuncs.com/?Action=RevokeSecurityGroup
      *         &SecurityGroupId=sg-bp67acfmxazb4p****
      *         &SecurityGroupRuleId.1=sgr-bpdfmk****
      *         &SecurityGroupRuleId.2=sgr-bpdfmg****
      *         &<Common request parameters>
      * *   Parameters prefixed with Permissions.N.
      *     *   If no security group rule matches the specified parameters, the call to RevokeSecurityGroup is successful but no security group rule is deleted.
      *     *   Security group rule IDs and parameters without the Permissions.N prefix cannot be specified.
      *     *   You can determine an inbound rule by specifying one of the following groups of parameters. You cannot determine a security group rule by specifying only one parameter.
      *     *   Parameters used to determine an inbound security group rule that controls access from a specified CIDR block: SecurityGroupId, Permissions.N.IpProtocol, Permissions.N.PortRange, Permissions.N.SourcePortRange, Permissions.N.NicType, Permissions.N.Policy, Permissions.N.DestCidrIp, and Permissions.N.SourceCidrIp. The Permissions.N.SourcePortRange and Permissions.N.DestCidrIp parameters are optional. Sample request:
      *         ```
      *         http(s)://ecs.aliyuncs.com/?Action=RevokeSecurityGroup&SecurityGroupId=sg-bp67acfmxazb4p****&Permissions.1.SourceCidrIp=10.0.0.0/8&Permissions.1.IpProtocol=TCP&Permissions.1.PortRange=80/80&Permissions.1.NicType=intranet&Permissions.1.Policy=accept&<Common request parameters>
      *         ```
      *     *   Parameters used to determine an inbound security group rule that controls access from a security group: SecurityGroupId, Permissions.N.IpProtocol, Permissions.N.PortRange, Permissions.N.SourcePortRange, Permissions.N.NicType, Permissions.N.Policy, Permissions.N.DestCidrIp, and Permissions.N.SourceGroupId. The Permissions.N.SourcePortRange and Permissions.N.DestCidrIp parameters are optional. Sample request:
      *         ```
      *         http(s)://ecs.aliyuncs.com/?Action=RevokeSecurityGroup \\&SecurityGroupId=sg-bp67acfmxazb4p****&Permissions.1.SourceGroupId=sg-bp67acfmxa123b****&Permissions.1.IpProtocol=TCP&Permissions.1.PortRange=80/80&Permissions.1.NicType=intranet&Permissions.1.Policy=accept&<Common request parameters>
      *         ```
      *     *   Parameters used to delete an inbound security group rule that controls access from a prefix list. SecurityGroupId, Permissions.N.IpProtocol, Permissions.N.PortRange, Permissions.N.SourcePortRange, Permissions.N.NicType, Permissions.N.Policy, Permissions.N.DestCidrIp, and Permissions.N.SourcePrefixListId. The Permissions.N.SourcePortRange and Permissions.N.DestCidrIp parameters are optional. Sample request:
      *         ```
      *         http(s)://ecs.aliyuncs.com/?Action=RevokeSecurityGroup&SecurityGroupId=sg-bp67acfmxazb4p****&Permissions.1.SourcePrefixListId=pl-x1j1k5ykzqlixdcy****&Permissions.1.IpProtocol=TCP&Permissions.1.PortRange=80/80&Permissions.1.NicType=intranet&Permissions.1.Policy=accept&<Common request parameters>
      *         ```
      *
     */
    CompletableFuture<RevokeSecurityGroupResponse> revokeSecurityGroup(RevokeSecurityGroupRequest request);

    /**
      * ## Description
      * In the security group-related API documents, outbound traffic refers to the traffic sent by the source and received by the destination.
      * When you call this operation, take note of the following items:
      * *   The `Permissions.N` prefix is added to some parameters to generate new parameters. Original parameters and corresponding parameters prefixed with Permissions.N cannot be specified together. We recommend that you use parameters prefixed with `Permissions.N`.
      * *   If the specified outbound security group rule does not exist, the call to RevokeSecurityGroupEgress is successful but no security group rule is deleted.
      * *   You can determine a security group rule by specifying one of the following groups of parameters. You cannot determine a security group rule by specifying only one parameter.
      *     *   Parameters used to delete an outbound security group rule that controls access to a specified CIDR block: IpProtocol, PortRange, SourcePortRange (optional), NicType, Policy, DestCidrIp, and SourceCidrIp (optional).
      *         ```
      *                 http(s)://ecs.aliyuncs.com/?Action=RevokeSecurityGroupEgress
      *                 &SecurityGroupId=sg-bp67acfmxazb4ph***
      *                 &Permissions.1.IpProtocol=TCP
      *                 &Permissions.1.DestCidrIp=10.0.0.0/8
      *                 &Permissions.1.PortRange=-22/22
      *                 &Permissions.1.NicType=intranet
      *                 &Permissions.1.Policy=accept
      *                 &<Common request parameters>
      *                 
      *         ```
      *     *   Parameters used to delete an outbound security group rule that controls access to another security group: IpProtocol, PortRange, SourcePortRange (optional), NicType, Policy, SourceCidrIp (optional), and DestGroupId.
      *         ```
      *                 http(s)://ecs.aliyuncs.com/?Action=RevokeSecurityGroupEgress
      *                 &SecurityGroupId=sg-bp67acfmxazb4ph***
      *                 &Permissions.1.DestGroupId=sg-bp67acfmxa123b****
      *                 &Permissions.1.IpProtocol=TCP
      *                 &Permissions.1.PortRange=22/22
      *                 &Permissions.1.NicType=intranet
      *                 &Permissions.1.Policy=accept
      *                 &<Common request parameters>
      *                 
      *         ```
      *     *   Parameters used to delete an outbound security group rule that controls access to a prefix list: IpProtocol, PortRange, SourcePortRange (optional), NicType, Policy, SourceCidrIp (optional), and DestPrefixListId.
      *         ```
      *                 http(s)://ecs.aliyuncs.com/?Action=RevokeSecurityGroupEgress
      *                 &SecurityGroupId=sg-bp67acfmxazb4ph***
      *                 &Permissions.1.IpProtocol=TCP
      *                 &Permissions.1.DestPrefixListId=pl-x1j1k5ykzqlixdcy****
      *                 &Permissions.1.PortRange=-22/22
      *                 &Permissions.1.NicType=intranet
      *                 &Permissions.1.Policy=accept
      *                 &<Common request parameters>
      *                 
      *         ```
      *
     */
    CompletableFuture<RevokeSecurityGroupEgressResponse> revokeSecurityGroupEgress(RevokeSecurityGroupEgressRequest request);

    /**
      * Compared with the [CreateCommand](~~64844~~) and [InvokeCommand](~~64841~~) operations, you can call the RunCommand operation once to create and run a command.
      * When you call this operation, take note of the following items:
      * *   The instances on which you want to run a command must reside in a virtual private cloud (VPC).
      * *   The instances must be in the `Running` state.
      * *   The Cloud Assistant client must be installed on the instances. For more information, see [InstallCloudAssistant](~~85916~~).
      * *   Before you run a PowerShell command on a Windows instance, make sure that the PowerShell module is installed on the instance.
      * *   If you want to specify a schedule by using a cron expression, you can specify a time zone based on your business requirements. If you do not specify a time zone, the schedule is determined by the system time of the instance. Make sure that the time or time zone of the instance meets your business requirements. For information about time zones, see [Configure the NTP service for ECS instances that run CentOS 6](~~92803~~) or [Configure the NTP service for Windows instances](~~51890~~).
      * *   You can specify the `TimeOut` parameter to specify a timeout period for executions of the command on instances. If an execution times out, the Cloud Assistant client forcibly terminates the command process.
      *     *   If the one-time execution of a command times out, the execution state of the command changes to Failed. You can call the [InvokeRecordStatus](~~64845~~) operation to query the command execution state.
      *     *   For a scheduled task, the timeout period takes effect on each execution of the command. When a command execution times out, the subsequent executions of the command are not affected. If a scheduled execution of a command times out, the execution state of the command changes to Failed. You can call the [InvokeRecordStatus](~~64845~~) operation to query the command execution state.
      *     To ensure that scheduled tasks can run as expected, make sure that the version of the Cloud Assistant client is not earlier than the following versions. A scheduled task can run a command at a specific interval, only once at a specific time, or at specific times based on a cron expression that includes a specific year or time zone. If the `ClientNeedUpgrade` error code is returned, you must update the Cloud Assistant client to the latest version. For more information, see [Upgrade or disable upgrades for the Cloud Assistant client](~~134383~~).
      *           - Linux: 2.2.3.282 
      *           - Windows: 2.1.3.282 
      * *   Command executions may fail due to instance status exceptions, network exceptions, or exceptions on the Cloud Assistant client. If an execution fails, no execution information is generated.
      * *   If you set the `EnableParameter` parameter to true, the custom parameter feature is enabled. If you specify the `CommandContent` parameter, you can specify custom parameters in the `{{parameter}}` format. After the command is run, the key-value pairs of the custom parameters are passed in.
      * *   You can retain up to 500 to 10,000 Cloud Assistant commands in each region based on your ECS usage. You can call the [DescribeAccountAttribute](~~73772~~) operation to query quotas.
      *
     */
    CompletableFuture<RunCommandResponse> runCommand(RunCommandRequest request);

    /**
      * * **Preparations**:
      *     * The real-name verification is complete. For more information, see [Real-name verification](~~48263~~).
      *     * Cost estimation: Learn about the billing methods of ECS resources. For more information, see [Billing overview](~~25398~~).
      *     * Instance type selection: Call the [DescribeInstanceTypes](~~25620~~) operation to query the performance data of instance types, or see [Best practices for instance type selection](~~58291~~) to learn about how to select instance types.
      *     * Query for available resources: Call the [DescribeAvailableResource](~~66186~~) operation to query available resources in a specific region or zone.
      *     * Network planning: Make sure that you have security groups available for use. For more information, see [CreateSecurityGroup](~~25553~~). Before you create an instance of the Virtual Private Cloud (VPC) type, create a VPC in the region where you want to create the instance. For more information, see [Create a VPC](~~65430~~).
      * * **Precautions**:
      *     * You can create a maximum of 100 instances at a time.
      *     * You can use the `AutoReleaseTime` parameter to set the time when you want the instances to be automatically released.
      *     * After instances are created, you can call the [DescribeInstances](~~25506~~) operation to check their states.
      *     * By default, instances automatically start after they are created. Instances are ready for use when they are in the Running (`Running`) state.
      *     * As of November 27, 2020, the maximum bandwidth value available for you to create ECS instances or to change ECS instance configurations is subject to the throttling policy for your account. To increase the maximum bandwidth value, submit a ticket. The throttling policy imposes the following constraints: Within a single region, the total maximum bandwidth value of all instances that use the pay-by-traffic billing method for network usage cannot exceed 5 Gbit/s and that of all instances that use the pay-by-bandwidth billing method for network usage cannot exceed 50 Gbit/s.
      *     * Different from the [CreateInstance](~~25499~~) operation, the `RunInstances` operation allows the system to assign public IP addresses to the new instances if you set the `InternetMaxBandwidthOut` parameter to a value greater than 0.
      *     * When you call the RunInstances operation to create an instance, you can use one of the following methods to bind a primary elastic network interface (ENI) to the instance. Note that you can use only one of the methods to configure the primary ENI in each call. Otherwise, the call fails and an error message is returned. Specify parameters such as `SecurityGroupId`, `VSwitchId`, `PrivateIpAddress`, `NetworkInterfaceQueueNumber`, and `Ipv6AddressCount` to configure the primary ENI. Specify parameters that start with `NetworkInterface.N.` to configure the primary and secondary ENIs. If `NetworkInterface.N.InstanceType` is set to `Primary`, the primary ENI is bound to the instance. If `NetworkInterface.N.InstanceType` is set to `Secondary` or left empty, a secondary ENI is bound to the instance.
      *     * After you call this operation, an error is returned if a parameter is invalid or if available resources are insufficient. For more information, see the "Error codes" section of this topic.
      * > If the `QuotaExceed.ElasticQuota` error is returned when you call this operation, you have reached the maximum number of instances of the specified instance type that can be created within the specified region or the maximum number of vCPUs for all instance types in a zone. You can go to the [ECS console](https://ecs.console.aliyun.com/?spm=a2c8b.12215451.favorites.decs.5e3a336aMGTtzy#/privileges/quota) or [Quota Center](https://quotas.console.aliyun.com/products/ecs/quotas) to request a quota increase.
      * * **Best practices**:
      *     * We recommend that you use auto provisioning groups in the following scenarios: Resources are insufficient to create more than 100 instances at a time, you want to quickly create instances regardless of resource configurations such as instance types or zones, or you want to create instances to consume a specific total number of vCPUs regardless of the number of the instances. You can call the [CreateAutoProvisioningGroup](~~122738~~) operation to create an auto provisioning group to deploy an instance cluster across different billing methods, instance families, and zones. For more information, see [Use auto provisioning group-related API operations to create multiple ECS instances at the same time](~~200772~~).
      *     * You can call the `RunInstances` operation to batch create instances. To better manage and search for these instances, we recommend that you specify tags for the instances by using the `Tag.N.Key` and `Tag.N.Value` parameters. You can also append incremental suffixes (`UniqueSuffix`) to the hostname (`HostName`) and to the instance name (`InstanceName`).
      *     * A launch template contains parameters required to create an instance so that you do not have to specify these parameters every time you create instances. You can call the [CreateLaunchTemplate](~~74686~~) operation to create a launch template. Then, in your request to call the `RunInstances` operation, you can specify the `LaunchTemplateId` and `LaunchTemplateVersion` parameters to use the launch template.
      *     * When you create an instance in the [ECS console](https://ecs.console.aliyun.com/), you can view the best practices for calling the `RunInstances` operation. In the Preview step, click View Open API in the Configurations Selected section. In the dialog box that appears, the left-side **API Workflow** section shows the operations and request parameters that are related to the `RunInstances` operation. The right-side section shows SDK examples for the **Java** and **Python** programming languages.
      *
     */
    CompletableFuture<RunInstancesResponse> runInstances(RunInstancesRequest request);

    /**
      * * The instances to which to send a file must be in the Running (`Running`) state.
      * * The Cloud Assistant client must be installed on the instances. For information about how to install the Cloud Assistant client, see [InstallCloudAssistant](~~85916~~).
      * * Only the Cloud Assistant client versions that are later than the following ones support file sending. If the `ClientNeedUpgrade` error code is returned, you must upgrade the Cloud Assistant client to the latest version. For more information, see [Update or disable updates for the Cloud Assistant client](~~134383~~).
      *     * For Linux instances, the version of the Cloud Assistant client must be later than 1.0.2.569.
      *     * For Windows instances, the version of the Cloud Assistant client must be later than 1.0.0.149.
      * * The file to be sent must not exceed 32 KB in size after it is encoded in Base64.
      * * The file may fail to be sent due to exceptions on the instances, network, or the Cloud Assistance client. Call the [DescribeSendFileResults](~~~~) operation to troubleshoot the issues.
      *
     */
    CompletableFuture<SendFileResponse> sendFile(SendFileRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<StartElasticityAssuranceResponse> startElasticityAssurance(StartElasticityAssuranceRequest request);

    /**
      * * After an image template is created, you must call the StartImagePipelineExecution operation to execute an image creation task. The system creates, distributes, and shares an image based on the parameters configured in the image template.
      * * Only one image creation task can be executed at a time based on a single image template. You can call the CancelImagePipelineExecution operation multiple times to cancel multiple image creation tasks at a time. If you cancel some image creation tasks, the other tasks are not affected.
      *
     */
    CompletableFuture<StartImagePipelineExecutionResponse> startImagePipelineExecution(StartImagePipelineExecutionRequest request);

    /**
      * ## Usage notes
      * When you call this operation, take note of the following items:
      * *   The instances that you want to start must be in the **Stopped** (`Stopped`) state.
      * *   If the response contains `{"OperationLocks"`: `{"LockReason" : "security"}}` for an instance when you query the information of the instance, the instance is locked for [security reasons](~~25695~~) and cannot be started.
      *
     */
    CompletableFuture<StartInstanceResponse> startInstance(StartInstanceRequest request);

    /**
      * When you call this operation, take note of the following items:
      * *   The ECS instances that you want to start must be in the **Stopped** (`Stopped`) state.
      * *   If the response contains `{"OperationLocks": {"LockReason" : "security"}}`, the ECS instance is locked to ensure security. No operations are allowed on the ECS instance.
      * *   You can start multiple ECS instances at the same time and use the `BatchOptimization` parameter to specify the batch operation mode.
      *
     */
    CompletableFuture<StartInstancesResponse> startInstances(StartInstancesRequest request);

    /**
      * ## Description
      * The session management feature is in public preview. To use this feature, log on with your Alibaba Cloud account and activate this feature.  
      * When you use custom code to connect to an ECS instance that serves as a client, you can call this operation to obtain the WebSocket URL that is used to connect to the instance. Before you call this operation to create a session to an ECS instance, take note of the following items: 
      * - The ECS instance must be in the Running (Running) state.
      * - The Cloud Assistant client must be installed on the ECS instance. You can call the [DescribeCloudAssistantStatus](https://www.alibabacloud.com/help/en/elastic-compute-service/latest/describecloudassistantstatus) operation to check whether the Cloud Assistant client is installed on the ECS instance and query the version number of the installed Cloud Assistant client.    - If the Cloud Assistant client is not installed on the ECS instance, call the [InstallCloudAssistant](https://www.alibabacloud.com/help/en/elastic-compute-service/latest/installcloudassistant) operation to install the client.
      *   - Only the Cloud Assistant client versions that are later than the following ones support the session management feature. You can upgrade your Cloud Assistant client. For information about how to upgrade the Cloud Assistant client, see [Update or disable updates for the Cloud Assistant client](https://www.alibabacloud.com/help/en/elastic-compute-service/latest/update-or-disable-updates-for-the-cloud-assistant-client).      - For Linux operating systems: V2.2.3.256
      *     - For Windows operating systems: V2.1.3.256
      * - Each WebSocket URL returned by the StartTerminalSession operation remains valid for 10 minutes.
      * - Up to 1,000 sessions can be created and available per region. Each ECS instance can have up to 10 sessions in the connected state.
      *
     */
    CompletableFuture<StartTerminalSessionResponse> startTerminalSession(StartTerminalSessionRequest request);

    /**
      * *   If the response contains `{"OperationLocks": {"LockReason" : "security"}}`, the instance is locked for security reasons. No operations are allowed on the instance. ``For more information, see [API behavior when an instance is locked for security reasons](~~25695~~).
      * *   If economical mode is enabled, you can set `StoppedMode` to KeepCharging to switch to standard mode. This allows an instance that is stopped in standard mode to retain its instance type resources and public IP address. However, you continue to be charged for the instance.
      *
     */
    CompletableFuture<StopInstanceResponse> stopInstance(StopInstanceRequest request);

    /**
      * *   If you call the DescribeInstances operation and the response contains `{"OperationLocks": {"LockReason" : "security"}}`, the instances are locked for security reasons and cannot be stopped.
      * *   If the economical mode is enabled for pay-as-you-go instances, you can set `StoppedMode` to KeepCharging to enable the standard mode for the instances. Then, after the instances are stopped in standard mode, you continue to be charged for them, and their instance type resources and public IP addresses are retained.
      * *   Batch operations are supported. You can use the `BatchOptimization` parameter to specify the batch operation mode.
      *
     */
    CompletableFuture<StopInstancesResponse> stopInstances(StopInstancesRequest request);

    /**
      * *   If you stop the process of a command that runs only once, the executions that have started are not interrupted. The executions that have not started are canceled.
      * *   If you stop the process of a scheduled invocation command, the executions that have started are not interrupted. However, the execution does not start in the next period.
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
      * When you call this operation, take note of the following items:
      * *   The ENI must be in the **Available** (Available) or **InUse** (InUse) state.
      * *   If the ENI is a primary ENI, the Elastic Compute Service (ECS) instance to which the ENI is attached must be in the **Running** (Running) or **Stopped** (Stopped) state.
      *
     */
    CompletableFuture<UnassignIpv6AddressesResponse> unassignIpv6Addresses(UnassignIpv6AddressesRequest request);

    /**
      * *   The ENI from which to unassign secondary private IP addresses must be in the **Available** (Available) or **InUse** (InUse) state.
      * *   If the ENI is a primary ENI, the Elastic Compute Service (ECS) instance to which the ENI is attached must be in the **Running** (Running) or **Stopped** (Stopped) state.
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
