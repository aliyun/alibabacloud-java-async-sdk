// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.swas_open20200601.models.*;
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

    CompletableFuture<AllocatePublicConnectionResponse> allocatePublicConnection(AllocatePublicConnectionRequest request);

    /**
      * A custom image is created based on a snapshot of a simple application server. You can use custom images to create multiple simple application servers that have the same configurations. You can also share custom images with ECS and use the shared images to create ECS instances or replace the OSs of existing ECS instances.
      * For more information about custom images, see [Overview of custom images](~~199375~~).
      * You must create a system disk snapshot of a simple application server before you create a custom image of the simple application server. For more information, see [CreateSnapshot](~~190452~~).
      * >  If you need the data on the data disk of a simple application server when you create a custom image, create a snapshot for the data disk first.
      * When you create a custom image, take note of the following items:
      * *   The custom image and the corresponding simple application server reside in the same region.
      * *   The maximum number of custom images that can be retained in an Alibaba Cloud account is triple of the number of simple application servers that you created. The value cannot be greater than 15.
      * *   You can directly create a custom image only based on the system disk snapshot of a simple application server. If you want a custom image to contain the data on the data disk of the simple application server, you must select a data disk snapshot when you create the custom image.
      * *   If a simple application server is released due to expiration or refunds, the custom images that are created based on the server are also released.
      * *   If you reset a simple application sever, the disk data on the server is cleared. You must back up the data as needed.
      * ## QPS limits
      * You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits](/help/en/simple-application-server/latest/qps-limit-1).
      *
     */
    CompletableFuture<CreateCustomImageResponse> createCustomImage(CreateCustomImageRequest request);

    /**
      * Firewalls serve to control network access to simple application servers and isolate security domains in the cloud. By default, Secure Shell (SSH) port 22, HTTP port 80, and HTTPS port 443 are enabled for simple application servers. Other ports are disabled. You can add firewall rules to enable more ports.
      *
     */
    CompletableFuture<CreateFirewallRuleResponse> createFirewallRule(CreateFirewallRuleRequest request);

    CompletableFuture<CreateFirewallRulesResponse> createFirewallRules(CreateFirewallRulesRequest request);

    CompletableFuture<CreateInstanceKeyPairResponse> createInstanceKeyPair(CreateInstanceKeyPairRequest request);

    /**
      * *   Before you call this operation, we recommend that you understand the billing of Simple Application Server. For more information, see [Billable items](~~58623~~).
      * *   A maximum of 20 simple application servers can be created within an Alibaba Cloud account.
      * *   When you call this operation to create simple application servers, make sure that the balance in your account is sufficient to pay for the servers. If the balance in your account is insufficient, the servers cannot be created.
      * ## QPS limits
      * The queries per second (QPS) limit for a single user for the API operation is 10 calls per minute. If the number of calls to the API operation per minute exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation. For more information, see [QPS limit](/help/en/simple-application-server/latest/qps-limit-1).
      *
     */
    CompletableFuture<CreateInstancesResponse> createInstances(CreateInstancesRequest request);

    /**
      * A snapshot is a point-in-time backup of a disk. Snapshots can be used to back up data, recover data after accidental instance releases, recover data after network attacks, and create custom images.
      * >  You are not charged for creating snapshots for simple application servers.
      * ## Precautions
      * - You can create up to three snapshots for disks of each simple application server.
      * - The maximum number of snapshots that can be retained in an Alibaba Cloud account is triple of the number of simple application servers that are created. The value cannot be greater than 15.
      * - If a simple application server is automatically released due to expiration, the snapshots created for the server are deleted.
      * - If you create a snapshot for a simple application server before you reset the server, the snapshot is retained after you reset the server but the snapshot cannot be used to roll back the disks of the server.
      * ## QPS limits
      * You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits](/help/en/simple-application-server/latest/qps-limit-1).
      *
     */
    CompletableFuture<CreateSnapshotResponse> createSnapshot(CreateSnapshotRequest request);

    /**
      * You can delete a custom image that you no longer need. After the custom image is deleted, the simple application servers that were created from the custom image cannot be reset by using the custom image.
      * >  If a custom image is shared, you must unshare the image before you can delete it. After a custom image is unshared, you cannot query the custom image by using the Elastic Compute Service (ECS) console or by calling ECS API operations. If you need to use the custom image in ECS, we recommend that you copy the image before you delete it. For more information, see [Copy custom images](~~199378~~).
      * ## QPS limits
      * The queries per second (QPS) limit for a single user for the API operation is 10 calls per minute. If the number of calls to the API operation per minute exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation. For more information, see [QPS limit](/help/en/simple-application-server/latest/qps-limit-1).
      *
     */
    CompletableFuture<DeleteCustomImageResponse> deleteCustomImage(DeleteCustomImageRequest request);

    /**
      * After a firewall rule is deleted, your business deployed on the simple application server may become inaccessible. Before you delete a firewall rule, make sure that the firewall rule is no longer needed by the simple application server.
      * ## QPS limits
      * You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits](/help/en/simple-application-server/latest/qps-limit-1).
      *
     */
    CompletableFuture<DeleteFirewallRuleResponse> deleteFirewallRule(DeleteFirewallRuleRequest request);

    CompletableFuture<DeleteInstanceKeyPairResponse> deleteInstanceKeyPair(DeleteInstanceKeyPairRequest request);

    /**
      * You can delete a snapshot that is no longer needed.
      * >  If a custom image was created from the snapshot, delete the custom image before you delete the snapshot.
      * ## QPS limits
      * The queries per second (QPS) limit for a single user for the API operation is 10 calls per minute. If the number of calls to the API operation per minute exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation. For more information, see [QPS limit](/help/en/simple-application-server/latest/qps-limit-1).
      *
     */
    CompletableFuture<DeleteSnapshotResponse> deleteSnapshot(DeleteSnapshotRequest request);

    CompletableFuture<DeleteSnapshotsResponse> deleteSnapshots(DeleteSnapshotsRequest request);

    /**
      * By default, the Cloud Assistant client is installed on your simple application server. If you have manually uninstalled the client, you must reinstall the client. Otherwise, you cannot run commands on the server.
      *
     */
    CompletableFuture<DescribeCloudAssistantStatusResponse> describeCloudAssistantStatus(DescribeCloudAssistantStatusRequest request);

    CompletableFuture<DescribeCloudMonitorAgentStatusesResponse> describeCloudMonitorAgentStatuses(DescribeCloudMonitorAgentStatusesRequest request);

    CompletableFuture<DescribeDatabaseErrorLogsResponse> describeDatabaseErrorLogs(DescribeDatabaseErrorLogsRequest request);

    CompletableFuture<DescribeDatabaseInstanceMetricDataResponse> describeDatabaseInstanceMetricData(DescribeDatabaseInstanceMetricDataRequest request);

    CompletableFuture<DescribeDatabaseInstanceParametersResponse> describeDatabaseInstanceParameters(DescribeDatabaseInstanceParametersRequest request);

    CompletableFuture<DescribeDatabaseInstancesResponse> describeDatabaseInstances(DescribeDatabaseInstancesRequest request);

    CompletableFuture<DescribeDatabaseSlowLogRecordsResponse> describeDatabaseSlowLogRecords(DescribeDatabaseSlowLogRecordsRequest request);

    CompletableFuture<DescribeInstanceKeyPairResponse> describeInstanceKeyPair(DescribeInstanceKeyPairRequest request);

    CompletableFuture<DescribeInstancePasswordsSettingResponse> describeInstancePasswordsSetting(DescribeInstancePasswordsSettingRequest request);

    CompletableFuture<DescribeInstanceVncUrlResponse> describeInstanceVncUrl(DescribeInstanceVncUrlRequest request);

    /**
      * *   After you run a command, the command may not succeed or return the expected results. You can call this operation to query the actual execution results.
      * *   You can query the execution information that is generated within the last two weeks. Up to 100,000 lines of execution information can be retained.
      *
     */
    CompletableFuture<DescribeInvocationResultResponse> describeInvocationResult(DescribeInvocationResultRequest request);

    /**
      * *   After you run a command, the command may not succeed or deliver the expected results. You can call this operation to query the actual execution results.
      * *   You can query the execution information that is generated within the last two weeks. Up to 100,000 lines of execution information can be retained.
      *
     */
    CompletableFuture<DescribeInvocationsResponse> describeInvocations(DescribeInvocationsRequest request);

    CompletableFuture<DescribeMonitorDataResponse> describeMonitorData(DescribeMonitorDataRequest request);

    CompletableFuture<DescribeSecurityAgentStatusResponse> describeSecurityAgentStatus(DescribeSecurityAgentStatusRequest request);

    CompletableFuture<DisableFirewallRuleResponse> disableFirewallRule(DisableFirewallRuleRequest request);

    CompletableFuture<EnableFirewallRuleResponse> enableFirewallRule(EnableFirewallRuleRequest request);

    /**
      * To run commands, you must install the Cloud Assistant client on your simple application server. You can call the [DescribeCloudAssistantStatus](~~439512~~) operation to query whether the Cloud Assistant client is installed on your simple application server. If you have not installed the Cloud Assistant client, you can call the InstallCloudAssistant operation to install the client. Then, you can call the [RebootInstance](~~190443~~) operation to restart the server to allow the installation to take effect.
      *
     */
    CompletableFuture<InstallCloudAssistantResponse> installCloudAssistant(InstallCloudAssistantRequest request);

    CompletableFuture<InstallCloudMonitorAgentResponse> installCloudMonitorAgent(InstallCloudMonitorAgentRequest request);

    CompletableFuture<ListCustomImagesResponse> listCustomImages(ListCustomImagesRequest request);

    /**
      * ## Usage notes
      * You can specify multiple request parameters such as `InstanceId` and `DiskIds`. Specified parameters have logical AND relations. Only the specified parameters are included in the filter conditions.
      *
     */
    CompletableFuture<ListDisksResponse> listDisks(ListDisksRequest request);

    /**
      * You can call the ListFirewallRules operation to query the firewall rule details of a specified simple application server, including the port range, firewall rule ID, and transport layer protocol.
      * ## QPS limits
      * You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits](/help/en/simple-application-server/latest/qps-limit-1).
      *
     */
    CompletableFuture<ListFirewallRulesResponse> listFirewallRules(ListFirewallRulesRequest request);

    /**
      * You can query details about one or more images in a specified region, including the IDs, names, and types of the images.
      * ## QPS limits
      * The queries per second (QPS) limit for a single user for the API operation is 10 calls per minute. If the number of your calls per second exceeds the limit, throttling is triggered. This may affect your business. We recommend that you take note of the limit when you call this operation. For more information, see [QPS limit](/help/en/simple-application-server/latest/qps-limit-1).
      *
     */
    CompletableFuture<ListImagesResponse> listImages(ListImagesRequest request);

    /**
      * If the plans of your simple application server do not meet your business requirements, you can call the ListInstancePlansModification operation to obtain a list of plans that can be upgraded for your simple application server. Then, you can call the [UpgradeInstance](~~190445~~) operation to upgrade the plans.
      * >  We recommend that you create snapshots for the disks of your simple application server to back up data before you upgrade the plans. For more information, see [CreateSnapshot](~~190452~~).
      * For the precautions about plan upgrade, see [Upgrade configurations](~~61433~~).
      * ## QPS limits
      * The queries per second (QPS) limit for a single user for the API operation is 10 calls per minute. If the number of calls to the API operation per minute exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation. For more information, see [QPS limit](/help/en/simple-application-server/latest/qps-limit-1).
      *
     */
    CompletableFuture<ListInstancePlansModificationResponse> listInstancePlansModification(ListInstancePlansModificationRequest request);

    CompletableFuture<ListInstanceStatusResponse> listInstanceStatus(ListInstanceStatusRequest request);

    /**
      * You can call this operation to query the details of one or more simple application servers in a specified region, including the names, public IP addresses, internal IP addresses, creation time, and expiration time of the servers.
      * ## QPS limits
      * The queries per second (QPS) limit for a single user for the API operation is 10 calls per minute. If the number of calls to the API operation per minute exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation. For more information, see [QPS limit](/help/en/simple-application-server/latest/qps-limit-1).
      *
     */
    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    /**
      * You can query the details of data transfer plans for one or more simple application servers, including the data transfer quota, used data transfer quota, unused data transfer quota, and excess data transfers in the current month.
      * Simple Application Server provides data transfer quotas in plans. The prices for data transfers within quotas are included in the plans. You are charged for data transfers that exceed the quotas. Take note of the following items:
      * *   You are charged only for outbound data transfers from simple application servers over the Internet. You are not charged for inbound data transfers to simple application servers over the Internet.
      * *   Outbound data transfers from simple application servers to other Alibaba Cloud services over the Internet consume the data transfer quotas that are included in plans. If the quotas are exceeded, you are charged for the excess data transfers.
      * *   You are not charged for data transfers between simple application servers within the same virtual private cloud (VPC).
      * For more information, see [Quotas and billing of data transfers](~~86281~~).
      * ## QPS limits
      * The queries per second (QPS) limit for a single user for the API operation is 10 calls per minute. If the number of calls to the API operation per minute exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation. For more information, see [QPS limit](/help/en/simple-application-server/latest/qps-limit-1).
      *
     */
    CompletableFuture<ListInstancesTrafficPackagesResponse> listInstancesTrafficPackages(ListInstancesTrafficPackagesRequest request);

    /**
      * You can query the details of all plans provided by Simple Application Server in a specified region, including the IDs, prices, disk sizes, and disk categories of the plans.
      * ## QPS limits
      * You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits](/help/en/simple-application-server/latest/qps-limit-1).
      *
     */
    CompletableFuture<ListPlansResponse> listPlans(ListPlansRequest request);

    /**
      * The query results include all the Alibaba Cloud regions where Simple Application Server is available on the International site (alibabacloud.com) and the China site (aliyun.com).
      * ## QPS limits
      * The queries per second (QPS) limit for a single user for the API operation is 10 calls per minute. If the number of calls to the API operation per minute exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation. For more information, see [QPS limit](/help/en/simple-application-server/latest/qps-limit-1).
      *
     */
    CompletableFuture<ListRegionsResponse> listRegions(ListRegionsRequest request);

    /**
      * ## Description
      * You can configure multiple request parameters such as `InstanceId`, `DiskId`, and `SnapshotIds` to query snapshots. Configured parameters have logical AND relations. Only the configured parameters are included in the filter conditions.
      * ### QPS limits
      * You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits](~~347607~~).
      *
     */
    CompletableFuture<ListSnapshotsResponse> listSnapshots(ListSnapshotsRequest request);

    /**
      * After you create a simple application server, you can log on to the simple application server to build environments and applications on the server.
      *
     */
    CompletableFuture<LoginInstanceResponse> loginInstance(LoginInstanceRequest request);

    CompletableFuture<ModifyDatabaseInstanceDescriptionResponse> modifyDatabaseInstanceDescription(ModifyDatabaseInstanceDescriptionRequest request);

    CompletableFuture<ModifyDatabaseInstanceParameterResponse> modifyDatabaseInstanceParameter(ModifyDatabaseInstanceParameterRequest request);

    CompletableFuture<ModifyFirewallRuleResponse> modifyFirewallRule(ModifyFirewallRuleRequest request);

    /**
      * You can share a custom image to ECS. When the configurations of your simple application server cannot meet your business requirements, or you want to use ECS instances to deploy your business, you can share your custom image to ECS to transfer your business from Simple Application Server to ECS.
      * >  The region in which the shared image resides in ECS is the same as the region in which the custom image resides in Simple Application Server.
      * You can unshare a custom image based on your business requirements or when you want to delete the custom image.
      * Take note of the following items:
      * *   After you unshare a custom image, you cannot query or use the custom image in the ECS console or by calling ECS API operations.
      * *   After you unshare a custom image, the system disks of the ECS instances that were created from the shared image cannot be re-initialized.
      * ## QPS limits
      * The queries per second (QPS) limit for a single user for the API operation is 10 calls per minute. If the number of calls to the API operation per minute exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation. For more information, see [QPS limit](/help/en/simple-application-server/latest/qps-limit-1).
      *
     */
    CompletableFuture<ModifyImageShareStatusResponse> modifyImageShareStatus(ModifyImageShareStatusRequest request);

    CompletableFuture<ModifyInstanceVncPasswordResponse> modifyInstanceVncPassword(ModifyInstanceVncPasswordRequest request);

    /**
      * *   You can restart simple application server instances that are only in the Running (Running) state.
      * *   After you restart a simple application server, it enters the Starting (Starting) state.
      * ## QPS limits
      * The queries per second (QPS) limit for a single user for the API operation is 10 calls per minute. If the number of calls to the API operation per minute exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation. For more information, see [QPS limit](/help/en/simple-application-server/latest/qps-limit-1).
      *
     */
    CompletableFuture<RebootInstanceResponse> rebootInstance(RebootInstanceRequest request);

    CompletableFuture<RebootInstancesResponse> rebootInstances(RebootInstancesRequest request);

    CompletableFuture<ReleasePublicConnectionResponse> releasePublicConnection(ReleasePublicConnectionRequest request);

    /**
      * *   Before you call this operation, we recommend that you understand the billing of Simple Application Server. For more information, see [Billable items](~~58623~~).
      * *   When you call this operation to renew a server, make sure that the balance in your account is sufficient. If the balance in your account is insufficient, the server cannot be renewed.
      * ## QPS limits
      * The queries per second (QPS) limit for a single user for the API operation is 10 calls per minute. If the number of calls to the API operation per minute exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation. For more information, see [QPS limit](/help/en/simple-application-server/latest/qps-limit-1).
      *
     */
    CompletableFuture<RenewInstanceResponse> renewInstance(RenewInstanceRequest request);

    CompletableFuture<ResetDatabaseAccountPasswordResponse> resetDatabaseAccountPassword(ResetDatabaseAccountPasswordRequest request);

    /**
      * *   You can call this operation to roll back a disk only when the associated simple application server is in the Stopped state.
      * *   After a disk is rolled back, all data changes that are made from when the snapshot was created to when the disk is rolled back are lost. Back up disk data based on your needs before you roll back the disk.
      * ## Precautions
      * If you reset a simple application server, the disk data on the server is deleted. Snapshots created before the resetting are retained but cannot be used to roll back the disks of the server.  
      * ## QPS limits
      * You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits](/help/en/simple-application-server/latest/qps-limit-1).
      *
     */
    CompletableFuture<ResetDiskResponse> resetDisk(ResetDiskRequest request);

    /**
      * You can reset a simple application server to re-install its applications or operating system and re-initialize the server. You can reset a simple application server by resetting the operating system or replacing the image.
      * You can use one of the following methods to reset a simple application server:
      * *   Reset the operating system. You can re-install the operating system without the need to replace the image.
      * *   Replace the image. You can replace the existing image on the simple application server by using another Alibaba Cloud image or a custom image. This effectively replaces the operating system.
      * ## Precautions
      * - If you reset a simple application sever, the disk data on the server is cleared. You must back up the data as needed.
      * - After you reset a simple application server, the monitoring operations that are performed on the server may fail. You can use one of the following methods to install the CloudMonitor agent on the server:    - Connect to the server: For more information, see [Manually install plug-ins for Alibaba Cloud hosts](/help/en/cloudmonitor/latest/install-and-uninstall-the-cloudmonitor-agent-for-cpp).
      *   - Use Command Assistant: For more information, see [Use Command Assistant](/help/en/simple-application-server/latest/cloud-assistant). You can obtain the commands that are used to install CloudMonitor from the "Common commands" section in the [Use Command Assistant](/help/en/simple-application-server/latest/cloud-assistant) topic.
      * ## Limits
      * - If a simple application server is reset, snapshots that are created before the server is reset are retained, but the snapshots cannot be used to roll back the disks of the server.
      * - If a simple application server was created based on a custom image that contains data of a data disk, the server cannot be reset.
      * - If you reset a simple application server by replacing the existing image with a custom image,   - The custom image must reside in the same region as the current server.
      *   - The custom image cannot be created from the current server. If you want to recover the data on the server, you can use a snapshot that is created from the server to roll back the disks.
      *   - If your simple application server resides in a region outside the Chinese mainland, you cannot switch the operating system of the server between Windows Server and Linux. You cannot use a Windows Server custom image to reset a Linux simple application server. Similarly, you cannot use a Linux custom image to reset a Windows Server simple application server. You can switch the operating system of simple application servers only between Windows Server operating systems or between Linux distributions.
      *   - The following limits apply to the disks on the simple application server:     - If the custom image contains a system disk and data disks, but the simple application server is not attached with a data disk but attached only with a system disk, you cannot use the custom image to reset the simple application server.
      *     - If the system disk size of the custom image is greater than the system disk size of the simple application server, you cannot directly use the custom image to reset the simple application server.
      *     - When the system disk size of the simple application server is greater than or equal to the system disk size of the custom image, you can use the custom image to reset the simple application server. To increase the system disk size of the server, you can upgrade the simple application server. For more information, see Upgrade configurations.
      *     - If the data disk size of the custom image is greater than the data disk size of the simple application server, you cannot use the custom image to reset the simple application server.
      * ## QPS limits
      * You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits](/help/en/simple-application-server/latest/qps-limit-1).
      *
     */
    CompletableFuture<ResetSystemResponse> resetSystem(ResetSystemRequest request);

    CompletableFuture<RestartDatabaseInstanceResponse> restartDatabaseInstance(RestartDatabaseInstanceRequest request);

    /**
      * Command Assistant is a Simple Application Server-specific automated O\\&M tool. You can manage simple application servers by running shell, PowerShell, and batch commands in the Simple Application Server console without logging on to the servers.
      * When you use Command Assistant, the following conditions must be met:
      * *   The simple application server must be in the Running state.
      * *   The Cloud Assistant client is installed on the server. By default, the Cloud Assistant client is installed on simple application servers. If you manually uninstall the client, you must reinstall it. For more information, see [Install the Cloud Assistant client](~~64921~~).
      *
     */
    CompletableFuture<RunCommandResponse> runCommand(RunCommandRequest request);

    CompletableFuture<StartDatabaseInstanceResponse> startDatabaseInstance(StartDatabaseInstanceRequest request);

    /**
      * If your simple application server is in the Stopped state, you can call the StartInstance operation to start the server.
      * ## QPS limits
      * The queries per second (QPS) limit for a single user for the API operation is 10 calls per minute. If the number of calls to the API operation per minute exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation. For more information, see [QPS limit](/help/en/simple-application-server/latest/qps-limit-1).
      *
     */
    CompletableFuture<StartInstanceResponse> startInstance(StartInstanceRequest request);

    CompletableFuture<StartInstancesResponse> startInstances(StartInstancesRequest request);

    CompletableFuture<StartTerminalSessionResponse> startTerminalSession(StartTerminalSessionRequest request);

    CompletableFuture<StopDatabaseInstanceResponse> stopDatabaseInstance(StopDatabaseInstanceRequest request);

    /**
      * You can stop simple application servers that are not used for the time being.
      * >  The stopping of simple application server may interrupt your business. We recommend that you perform the stop operation during off-peak hours.
      * ## QPS limits
      * You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits](/help/en/simple-application-server/latest/qps-limit-1).
      *
     */
    CompletableFuture<StopInstanceResponse> stopInstance(StopInstanceRequest request);

    CompletableFuture<StopInstancesResponse> stopInstances(StopInstancesRequest request);

    CompletableFuture<UpdateDiskAttributeResponse> updateDiskAttribute(UpdateDiskAttributeRequest request);

    /**
      * After you change the password of a simple application server, you must restart the server by calling the [RebootInstance](~~190443~~) operation for the new password to take effect.
      * ## QPS limits
      * The queries per second (QPS) limit for a single user for the API operation is 10 calls per minute. If the number of calls to the API operation per minute exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation. For more information, see [QPS limit](/help/en/simple-application-server/latest/qps-limit-1).
      *
     */
    CompletableFuture<UpdateInstanceAttributeResponse> updateInstanceAttribute(UpdateInstanceAttributeRequest request);

    CompletableFuture<UpdateSnapshotAttributeResponse> updateSnapshotAttribute(UpdateSnapshotAttributeRequest request);

    /**
      * *   The plans of simple application servers can only be upgraded. For more information about plans, see [Billable items](~~58623~~).
      * *   When you call this operation to upgrade a server, make sure that the balance in your account is sufficient. If the balance in your account is insufficient, the server cannot be upgraded.
      * ## QPS limits
      * The queries per second (QPS) limit for a single user for the API operation is 10 calls per minute. If the number of calls to the API operation per minute exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation. For more information, see [QPS limit](/help/en/simple-application-server/latest/qps-limit-1).
      *
     */
    CompletableFuture<UpgradeInstanceResponse> upgradeInstance(UpgradeInstanceRequest request);

    CompletableFuture<UploadInstanceKeyPairResponse> uploadInstanceKeyPair(UploadInstanceKeyPairRequest request);

}
