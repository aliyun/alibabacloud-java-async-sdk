// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.swas_open20200601.models.*;
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

    CompletableFuture<AddCustomImageShareAccountResponse> addCustomImageShareAccount(AddCustomImageShareAccountRequest request);

    /**
      * By default, no public endpoints are assigned to Simple Database Service instances. If you want to access the databases of a Simple Database Service instance over the Internet by using Simple Container Service or Data Management (DMS), you must apply for a public endpoint for the Simple Database Service instance.
      * ### QPS limit
      * You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits](~~347607~~).
      *
     */
    CompletableFuture<AllocatePublicConnectionResponse> allocatePublicConnection(AllocatePublicConnectionRequest request);

    /**
      * If the port range, protocol, and source IP address of a firewall rule in a firewall template are the same as the port range, protocol, and source IP address of an existing rule, the new rule overwrites the existing rule regardless of whether the existing rule is enabled or disabled.
      *
     */
    CompletableFuture<ApplyFirewallTemplateResponse> applyFirewallTemplate(ApplyFirewallTemplateRequest request);

    /**
      * You can bind only one key pair to a simple application server in the Simple Application Server console. If a simple application server has a key pair bound, the new key pair overwrites the original key pair.
      *
     */
    CompletableFuture<AttachKeyPairResponse> attachKeyPair(AttachKeyPairRequest request);

    CompletableFuture<CreateCommandResponse> createCommand(CreateCommandRequest request);

    /**
      * A custom image is created based on a snapshot of a simple application server. You can use a custom image to create multiple simple application servers that have the same configurations. You can also share custom images to ECS and use the shared images to create ECS instances or replace the OSs of existing ECS instances. For more information about custom images, see [Overview of custom images](~~199375~~).
      * You must create a system disk snapshot of a simple application server before you create a custom image based on the snapshot. For more information, see [CreateSnapshot](~~190452~~).
      * > If you need the data on the data disk of a simple application server when you create a custom image, create a snapshot for the data disk first.
      * Before you create a custom image, take note of the following items:
      * *   The custom image and the corresponding simple application server must reside in the same region.
      * *   The maximum number of custom images that can be maintained in an Alibaba Cloud account is triple the number of simple application servers in the account. The value cannot be greater than 15.
      * *   You can directly create a custom image only based on the system disk snapshot of a simple application server. If you want a custom image to contain the data on the data disk of the simple application server, you must select a data disk snapshot when you create the custom image.
      * *   If a simple application server is released due to expiration or refunds, the custom images that are created based on a snapshot of the server are also released.
      * *   If you reset a simple application server by changing the application system or OS of the server or replacing the image of the server, the disk data on the server is cleared. Back up the disk data as needed.
      * ### QPS limit
      * You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits](~~347607~~).
      *
     */
    CompletableFuture<CreateCustomImageResponse> createCustomImage(CreateCustomImageRequest request);

    /**
      * Firewalls serve to control network access to simple application servers and isolate security domains in the cloud. By default, SSH port 22, HTTP port 80, and HTTPS port 443 are enabled for simple application servers. Other ports are disabled. You can add firewall rules to enable more ports.
      * ### QPS limits
      * You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits](~~347607~~).
      *
     */
    CompletableFuture<CreateFirewallRuleResponse> createFirewallRule(CreateFirewallRuleRequest request);

    /**
      * Firewalls serve to control network access to simple application servers and isolate security domains in the cloud. By default, SSH port 22, HTTP port 80, and HTTPS port 443 are enabled for simple application servers. Other ports are disabled. You can add firewall rules to enable more ports.
      *
     */
    CompletableFuture<CreateFirewallRulesResponse> createFirewallRules(CreateFirewallRulesRequest request);

    /**
      * Simple Application Server supports the firewall template feature that provides multiple firewall rules. You can use a template to add a group of firewall rules to one or more simple application servers at a time. This improves the efficiency of setting firewall rules.
      *
     */
    CompletableFuture<CreateFirewallTemplateResponse> createFirewallTemplate(CreateFirewallTemplateRequest request);

    /**
      * Adding firewall rules to a firewall template does not affect the firewall rules that have been applied to simple application servers..
      *
     */
    CompletableFuture<CreateFirewallTemplateRulesResponse> createFirewallTemplateRules(CreateFirewallTemplateRulesRequest request);

    CompletableFuture<CreateInstanceKeyPairResponse> createInstanceKeyPair(CreateInstanceKeyPairRequest request);

    /**
      * *   Before you call this operation, we recommend that you understand the billing of Simple Application Server. For more information, see [Billable items](~~58623~~).
      * *   A maximum of 20 simple application servers can be maintained in an Alibaba Cloud account.
      * *   When you call this operation to create simple application servers, make sure that the balance in your account is sufficient to pay for the servers. If the balance in your account is insufficient, the servers cannot be created.
      * ### QPS limit
      * You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits](~~347607~~).
      *
     */
    CompletableFuture<CreateInstancesResponse> createInstances(CreateInstancesRequest request);

    /**
      * Alibaba Cloud SSH key pairs offer a secure and efficient logon authentication mechanism, facilitating both verification and encrypted communication within the SSH protocol framework. An SSH key pair is essentially constituted by a public key and a private key. Tailored for Linux-based simple application servers, this security measure enhances security and convenience, effectively addressing your heightened security requirements.
      * *   The key pair logon method is only valid for Linux-based simple application servers.
      * *   A maximum of 10 key pairs can be created in a region for an Alibaba Cloud account.
      * *   Only RSA 2048-bit key pairs can be created in the Simple Application Server console.
      *
     */
    CompletableFuture<CreateKeyPairResponse> createKeyPair(CreateKeyPairRequest request);

    /**
      * A snapshot is a point-in-time backup of a disk. Snapshots can be used to back up data, recover data after accidental operations on instances, recover data after network attacks, and create custom images.
      * > You are not charged for creating snapshots for disks of simple application servers.
      * ### Precautions
      * *   You can create up to three snapshots for disks of each simple application server.
      * *   The maximum number of snapshots that can be retained in an Alibaba Cloud account is triple the number of simple application servers that you maintain. The value cannot be greater than 15.
      * *   If a simple application server is automatically released due to expiration, the snapshots created for the server are deleted.
      * *   If you reset the simple application server after you create a snapshot for a server, the snapshot is retained but cannot be used to roll back the disks of the server.
      * ### QPS limit
      * You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits](~~347607~~).
      *
     */
    CompletableFuture<CreateSnapshotResponse> createSnapshot(CreateSnapshotRequest request);

    /**
      * You cannot delete commands that are being run.
      *
     */
    CompletableFuture<DeleteCommandResponse> deleteCommand(DeleteCommandRequest request);

    /**
      * You can delete a custom image that you no longer need. After the custom image is deleted, you cannot use the custom image to reset the simple application servers that were created based on the custom image.
      * > If a custom image is shared to Elastic Compute Service (ECS), you must unshare the image before you can delete it. After you unshare the custom image, you cannot query the custom image by using the ECS console or by calling ECS API operations. If you need to use the custom image in ECS, we recommend that you copy the image before you delete it. For more information, see [Copy a shared image of a simple application server in the ECS console](~~199378~~).
      * ### QPS limit
      * You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits](~~347607~~).
      *
     */
    CompletableFuture<DeleteCustomImageResponse> deleteCustomImage(DeleteCustomImageRequest request);

    /**
      * If a custom image is shared, you must unshare the image before you can delete it. After a custom image is unshared, you cannot query the custom image by using the Elastic Compute Service (ECS) console or by calling an ECS API operation. If you want to use a custom image to create ECS instances, we recommend that you copy the custom image before you delete it. For more information, see the "Copy custom images" topic.
      *
     */
    CompletableFuture<DeleteCustomImagesResponse> deleteCustomImages(DeleteCustomImagesRequest request);

    /**
      * After a firewall rule is deleted, your business deployed on the simple application server may become inaccessible. Before you delete a firewall rule, make sure that the firewall rule is no longer needed by the simple application server.
      * ### QPS limit
      * You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits](~~347607~~).
      *
     */
    CompletableFuture<DeleteFirewallRuleResponse> deleteFirewallRule(DeleteFirewallRuleRequest request);

    /**
      * After a firewall rule is deleted, your business deployed on the simple application server may become inaccessible. Before you delete a firewall rule, make sure that the firewall rule is no longer needed by the simple application server.
      *
     */
    CompletableFuture<DeleteFirewallRulesResponse> deleteFirewallRules(DeleteFirewallRulesRequest request);

    /**
      * Deletion of firewall rules does not affect the firewall rules that have been applied to simple application servers.
      *
     */
    CompletableFuture<DeleteFirewallTemplateRulesResponse> deleteFirewallTemplateRules(DeleteFirewallTemplateRulesRequest request);

    /**
      * Deleting a firewall template does not affect the firewall rules that have been applied to simple application servers. You can delete firewall templates that you no longer need.
      *
     */
    CompletableFuture<DeleteFirewallTemplatesResponse> deleteFirewallTemplates(DeleteFirewallTemplatesRequest request);

    CompletableFuture<DeleteInstanceKeyPairResponse> deleteInstanceKeyPair(DeleteInstanceKeyPairRequest request);

    /**
      * You must unbind SSH key pairs that you no longer use from simple application servers before you delete the SSH key pairs.
      *
     */
    CompletableFuture<DeleteKeyPairsResponse> deleteKeyPairs(DeleteKeyPairsRequest request);

    /**
      * You can delete a snapshot if you no longer need it.
      * > If a custom image was created based on the snapshot, delete the custom image before you delete the snapshot.
      * ### QPS limit
      * You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits](~~347607~~).
      *
     */
    CompletableFuture<DeleteSnapshotResponse> deleteSnapshot(DeleteSnapshotRequest request);

    CompletableFuture<DeleteSnapshotsResponse> deleteSnapshots(DeleteSnapshotsRequest request);

    CompletableFuture<DescribeCloudAssistantAttributesResponse> describeCloudAssistantAttributes(DescribeCloudAssistantAttributesRequest request);

    /**
      * By default, the Cloud Assistant client is installed on simple application servers. If you have manually uninstalled the client, you must reinstall the client. Otherwise, you cannot run commands on the servers.
      *
     */
    CompletableFuture<DescribeCloudAssistantStatusResponse> describeCloudAssistantStatus(DescribeCloudAssistantStatusRequest request);

    CompletableFuture<DescribeCloudMonitorAgentStatusesResponse> describeCloudMonitorAgentStatuses(DescribeCloudMonitorAgentStatusesRequest request);

    CompletableFuture<DescribeCommandInvocationsResponse> describeCommandInvocations(DescribeCommandInvocationsRequest request);

    CompletableFuture<DescribeCommandsResponse> describeCommands(DescribeCommandsRequest request);

    /**
      * You can call this operation to query the error logs of databases in a Simple Database Service instance and locate faults based on the error logs.
      * \\### QPS limit You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits](~~347607~~).
      *
     */
    CompletableFuture<DescribeDatabaseErrorLogsResponse> describeDatabaseErrorLogs(DescribeDatabaseErrorLogsRequest request);

    /**
      * After you create a Simple Database Service instance, you can query the details about the vCPU, memory, disk size, storage IOPS (input/output operations per second), and total current connection number of the instance.
      * ### QPS limit
      * You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits](~~347607~~).
      *
     */
    CompletableFuture<DescribeDatabaseInstanceMetricDataResponse> describeDatabaseInstanceMetricData(DescribeDatabaseInstanceMetricDataRequest request);

    /**
      * You can call this operation to query the information about parameters of a Simple Database Service instance.
      *
     */
    CompletableFuture<DescribeDatabaseInstanceParametersResponse> describeDatabaseInstanceParameters(DescribeDatabaseInstanceParametersRequest request);

    /**
      * You can call this operation to query the details of Simple Database Service instances in a region, including the IDs, names, plans, database versions, public endpoint, internal endpoint, creation time, and expiration time of the instances.
      * ### QPS limit
      * You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits](~~347607~~).
      *
     */
    CompletableFuture<DescribeDatabaseInstancesResponse> describeDatabaseInstances(DescribeDatabaseInstancesRequest request);

    /**
      * You can query the slow query log details of a Simple Database Service instance and locate faults based on the log details.
      * > Slow query log details are retained for 7 days.
      * ### QPS limit
      * You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits](~~347607~~).
      *
     */
    CompletableFuture<DescribeDatabaseSlowLogRecordsResponse> describeDatabaseSlowLogRecords(DescribeDatabaseSlowLogRecordsRequest request);

    CompletableFuture<DescribeFirewallTemplateApplyResultsResponse> describeFirewallTemplateApplyResults(DescribeFirewallTemplateApplyResultsRequest request);

    CompletableFuture<DescribeFirewallTemplateRulesApplyResultResponse> describeFirewallTemplateRulesApplyResult(DescribeFirewallTemplateRulesApplyResultRequest request);

    CompletableFuture<DescribeFirewallTemplatesResponse> describeFirewallTemplates(DescribeFirewallTemplatesRequest request);

    CompletableFuture<DescribeInstanceKeyPairResponse> describeInstanceKeyPair(DescribeInstanceKeyPairRequest request);

    CompletableFuture<DescribeInstancePasswordsSettingResponse> describeInstancePasswordsSetting(DescribeInstancePasswordsSettingRequest request);

    CompletableFuture<DescribeInstanceVncUrlResponse> describeInstanceVncUrl(DescribeInstanceVncUrlRequest request);

    /**
      * *   After you execute a command, the command may not succeed or return the expected results. You can call this operation to query the execution result of a command.
      * *   You can query the execution results that were generated within the last two weeks. A maximum of 100,000 entries of execution results can be retained.
      *
     */
    CompletableFuture<DescribeInvocationResultResponse> describeInvocationResult(DescribeInvocationResultRequest request);

    /**
      * *   After you execute a command, the command may not succeed or return the expected results. You can call this operation to query the actual execution results.
      * *   You can query the execution results that were generated within the last two weeks. Up to 100,000 entries of execution results can be retained.
      *
     */
    CompletableFuture<DescribeInvocationsResponse> describeInvocations(DescribeInvocationsRequest request);

    CompletableFuture<DescribeMonitorDataResponse> describeMonitorData(DescribeMonitorDataRequest request);

    CompletableFuture<DescribeSecurityAgentStatusResponse> describeSecurityAgentStatus(DescribeSecurityAgentStatusRequest request);

    /**
      * If you want to change the SSH key pairs that are bound to your simple application servers or your end user no longer needs to access a specific simple application server, you can unbind the SSH key pairs from simple application servers to improve the security of the simple application servers or restrict access to the specific simple application server.
      *
     */
    CompletableFuture<DetachKeyPairResponse> detachKeyPair(DetachKeyPairRequest request);

    CompletableFuture<DisableFirewallRuleResponse> disableFirewallRule(DisableFirewallRuleRequest request);

    CompletableFuture<EnableFirewallRuleResponse> enableFirewallRule(EnableFirewallRuleRequest request);

    /**
      * You can call this operation to import an existing key pair to the Simple Application Server console. This way, you can use the key pair to log on to simple application servers. The existing key pair that you want to import must use a supported encryption method. For more information, see [Q2: Which encryption methods must be used by key pairs when I import existing key pairs to the Simple Application Server console?](~~59085~~)
      *
     */
    CompletableFuture<ImportKeyPairResponse> importKeyPair(ImportKeyPairRequest request);

    /**
      * To run commands on your simple application servers, you must install the Cloud Assistant client on your servers. You can call the [DescribeCloudAssistantStatus](~~439512~~) operation to check whether the Cloud Assistant client is installed on your simple application servers. If you have not installed the Cloud Assistant client, you can call the InstallCloudAssistant operation to install the client. Then, you can call the [RebootInstance](~~190443~~) operation to restart the servers to allow the client to take effect.
      *
     */
    CompletableFuture<InstallCloudAssistantResponse> installCloudAssistant(InstallCloudAssistantRequest request);

    CompletableFuture<InstallCloudMonitorAgentResponse> installCloudMonitorAgent(InstallCloudMonitorAgentRequest request);

    /**
      * *   The simple application servers for which you want to call the operation must meet the following conditions. If a simple application server cannot meet the conditions, you must call this operation again.
      *     *   The simple application servers are in the `Running` state. You can call the [ListInstances](~~2361065~~) operation to query the status of simple application servers.
      *     *   Cloud Assistant Agent is installed on the simple application servers. For more information, see [InstallCloudAssistant](~~2361030~~).
      *     *   If you run a PowerShell command, make sure that the PowerShell module is configured for the simple application servers.
      * *   The command may fail to be run due to the abnormal states of simple application servers, network exceptions, or exceptions in Cloud Assistant Agent. If the command fails to be run, no execution information is generated.
      * *   If you enable the custom parameter feature when you create a command, you must set the `Parameters` parameter to specify custom parameters when you run the command.
      * *   When you call this operation, you can select only one common command or a custom command that you have created.
      *
     */
    CompletableFuture<InvokeCommandResponse> invokeCommand(InvokeCommandRequest request);

    CompletableFuture<ListCustomImageShareAccountsResponse> listCustomImageShareAccounts(ListCustomImageShareAccountsRequest request);

    CompletableFuture<ListCustomImagesResponse> listCustomImages(ListCustomImagesRequest request);

    /**
      * You can specify multiple request parameters that you want to query, such as `InstanceId`, `DiskIds`, and `ResourceGroupId`. Specified request parameters have logical AND relations. Only the specified parameters are included in the filter conditions.
      * ### [](#qps-)QPS limits
      * You can call this operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits](~~347607~~).
      *
     */
    CompletableFuture<ListDisksResponse> listDisks(ListDisksRequest request);

    /**
      * You can call the ListFirewallRules operation to query the firewall rule details of a simple application server, including the port range, firewall rule ID, and transport layer protocol.
      * ### QPS limit
      * You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits](~~347607~~).
      *
     */
    CompletableFuture<ListFirewallRulesResponse> listFirewallRules(ListFirewallRulesRequest request);

    /**
      * You can query information about images in a region, including the IDs, names, and types of the images.
      * ### QPS limit
      * You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits](~~347607~~).
      *
     */
    CompletableFuture<ListImagesResponse> listImages(ListImagesRequest request);

    /**
      * If the plan of your simple application server does not meet your business requirements, you can call the ListInstancePlansModification operation to obtain a list of plans to which you can upgrade your simple application server. Then, you can call the [UpgradeInstance](~~190445~~) operation to upgrade the server.
      * > We recommend that you create snapshots for the disks of your simple application server to back up data before you upgrade the server. For more information, see [CreateSnapshot](~~190452~~).
      * For the precautions about plan upgrade, see [Upgrade a simple application server](~~61433~~).
      * ### QPS limit
      * You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits](~~347607~~).
      *
     */
    CompletableFuture<ListInstancePlansModificationResponse> listInstancePlansModification(ListInstancePlansModificationRequest request);

    CompletableFuture<ListInstanceStatusResponse> listInstanceStatus(ListInstanceStatusRequest request);

    /**
      * You can call this operation to query the details of simple application servers in a specified region, including the names, public IP addresses, internal IP addresses, creation time, and expiration time of the servers.
      * ### QPS limit
      * You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits](~~347607~~).
      *
     */
    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    /**
      * You can query the details of data transfer plans of simple application servers, including the data transfer quota, used amount and unused amount of the data transfer quota, and excess data transfers beyond the quota in the current month.
      * Simple Application Server provides data transfer quotas in plans. Plan prices include prices of data transfer quotas. You are charged for data transfers that exceed the quotas. Take note of the following items:
      * *   Only outbound data transfers of simple application servers over the Internet are calculated. Outbound data transfers include the data transfer quota and the excess data transfers beyond the quota. Inbound data transfers of simple application servers over the Internet are not calculated.
      * *   Outbound data transfers from simple application servers to other Alibaba Cloud services over the Internet first consume data transfer quotas. If the quotas are exhausted, you are charged for excess data transfers.
      * *   You are not charged for data transfers between simple application servers within the same virtual private cloud (VPC).
      * For more information, see [Quotas and billing of data transfers](~~86281~~).
      * ### QPS limit
      * You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits](~~347607~~).
      *
     */
    CompletableFuture<ListInstancesTrafficPackagesResponse> listInstancesTrafficPackages(ListInstancesTrafficPackagesRequest request);

    CompletableFuture<ListKeyPairsResponse> listKeyPairs(ListKeyPairsRequest request);

    /**
      * You can query the details of all plans provided by Simple Application Server in a region, including the IDs, prices, disk sizes, and disk categories of the plans.
      * ### QPS limit
      * You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits](~~347607~~).
      *
     */
    CompletableFuture<ListPlansResponse> listPlans(ListPlansRequest request);

    /**
      * The query results include all the Alibaba Cloud regions where Simple Application Server is supported on the international site (alibabacloud.com) and the China site (aliyun.com).
      * ### QPS limit
      * You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits](~~347607~~).
      *
     */
    CompletableFuture<ListRegionsResponse> listRegions(ListRegionsRequest request);

    /**
      * You can specify multiple request parameters that you want to query, such as `InstanceId`, `DiskId`, `SnapshotIds`, and `ResourceGroupId`. Specified parameters have logical AND relations. Only the specified parameters are included in the filter conditions.
      * ### [](#qps-)QPS limits
      * You can call this operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits](~~347607~~).
      *
     */
    CompletableFuture<ListSnapshotsResponse> listSnapshots(ListSnapshotsRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
      * After you create a simple application server, you can log on to the simple application server to build environments and applications on the server.
      *
     */
    CompletableFuture<LoginInstanceResponse> loginInstance(LoginInstanceRequest request);

    /**
      * You can call this operation to modify the description of a Simple Database Service instance.
      * ### QPS limit
      * You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits](~~347607~~).
      *
     */
    CompletableFuture<ModifyDatabaseInstanceDescriptionResponse> modifyDatabaseInstanceDescription(ModifyDatabaseInstanceDescriptionRequest request);

    /**
      * After you create a Simple Database Service instance, you can view the parameters of the instance or modify the parameters of the instance based on your business requirements.
      * ### QPS limit
      * You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits](~~347607~~).
      *
     */
    CompletableFuture<ModifyDatabaseInstanceParameterResponse> modifyDatabaseInstanceParameter(ModifyDatabaseInstanceParameterRequest request);

    CompletableFuture<ModifyFirewallRuleResponse> modifyFirewallRule(ModifyFirewallRuleRequest request);

    /**
      * Modifying a firewall template does not affect the firewall rules that have been applied to simple application servers.
      *
     */
    CompletableFuture<ModifyFirewallTemplateResponse> modifyFirewallTemplate(ModifyFirewallTemplateRequest request);

    /**
      * You can share a custom image with ECS. If the configurations of your simple application server cannot meet your business requirements, or you want to use ECS instances to deploy your business, you can share your custom image with ECS to transfer your business from Simple Application Server to ECS.
      * > The shared image in ECS resides in the same region as the custom image in Simple Application Server.
      * You can unshare a custom image based on your business requirements or when you want to delete the custom image. Take note of the following items:
      * *   After you unshare a custom image, you cannot query or use the custom image in the ECS console or by calling ECS API operations.
      * *   After you unshare a custom image, you cannot re-initialize the disks of the ECS instances that were created based on the shared image.
      * ### QPS limit
      * You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits](~~347607~~).
      *
     */
    CompletableFuture<ModifyImageShareStatusResponse> modifyImageShareStatus(ModifyImageShareStatusRequest request);

    CompletableFuture<ModifyInstanceVncPasswordResponse> modifyInstanceVncPassword(ModifyInstanceVncPasswordRequest request);

    /**
      * *   Only simple application servers that are in the Running state can be restarted.
      * *   After you restart a simple application server, it enters the Starting state.
      * ### QPS limit
      * You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits](~~347607~~).
      *
     */
    CompletableFuture<RebootInstanceResponse> rebootInstance(RebootInstanceRequest request);

    CompletableFuture<RebootInstancesResponse> rebootInstances(RebootInstancesRequest request);

    /**
      * If you no longer need to use a public endpoint to access a Simple Database Service instance, you can release the public endpoint.
      * ### QPS limit
      * You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits](~~347607~~).
      *
     */
    CompletableFuture<ReleasePublicConnectionResponse> releasePublicConnection(ReleasePublicConnectionRequest request);

    CompletableFuture<RemoveCustomImageShareAccountResponse> removeCustomImageShareAccount(RemoveCustomImageShareAccountRequest request);

    /**
      * *   Before you call this operation, we recommend that you understand the billing of Simple Application Server. For more information, see [Billable items](~~58623~~).
      * *   When you call this operation to renew a server, make sure that the balance in your account is sufficient. If the balance in your account is insufficient, the server cannot be renewed.
      * ### QPS limit
      * You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits](~~347607~~).
      *
     */
    CompletableFuture<RenewInstanceResponse> renewInstance(RenewInstanceRequest request);

    /**
      * If the password of your Simple Database Service instance is not strong, you can call this operation to change the password of the administrator account of the instance. To ensure security of the instance, we recommend that you regularly change the password of the instance.
      * ### QPS limit
      * You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits](~~347607~~).
      *
     */
    CompletableFuture<ResetDatabaseAccountPasswordResponse> resetDatabaseAccountPassword(ResetDatabaseAccountPasswordRequest request);

    /**
      * *   You can call this operation to roll back a disk only if the associated simple application server is in the Stopped state.
      * *   After a disk is rolled back, all data changes that are made from when the snapshot was created to when the disk is rolled back are lost. Back up disk data based on your needs before you roll back the disk.
      * ### Precautions
      * After you reset a simple application server, the disk data on the server is deleted. Snapshots created before the resetting operation are retained but cannot be used to roll back the disks of the server.
      * ### QPS limit
      * You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits](~~347607~~).
      *
     */
    CompletableFuture<ResetDiskResponse> resetDisk(ResetDiskRequest request);

    /**
      * You can reset a simple application server to re-install its application system or OS and re-initialize the server. You can reset a simple application server by resetting the current system or replacing the image.
      * You can use one of the following methods to reset a simple application server:
      * *   Reset the current system. You can re-install the operating system without replacing the image.
      * *   Replace the image. You can select an Alibaba Cloud image or a custom image that is different from the existing image of the server to reinstall the OS of the server.
      * ### Precautions
      * *   After you reset a simple application server, the disk data on the server is cleared. Back up the data as needed.
      * *   After you reset a simple application server, the monitoring operations that are performed on the server may fail. In this case, you can use one of the following methods to install the CloudMonitor agent on the server:
      *     *   Connect to the server: For more information, see [Manually install the CloudMonitor agent for C++ on an ECS instance](~~183482~~).
      *     *   Use Command Assistant: For more information, see [Use Command Assistant](~~438681~~). You can obtain the command that can be used to install CloudMonitor from the "Common commands" section of the [Use Command Assistant](~~438681~~) topic.
      * ### Limits
      * *   Snapshots that are created before a server is reset are retained, but the snapshots cannot be used to roll back the disks of the server.
      * *   You cannot reset simple application servers that were created based on custom images that contain data of data disks.
      * *   Before you reset a simple application server by replacing the existing image with a custom image, take note of the following items:
      *     *   The custom image must reside in the same region as the current server.
      *     *   The custom image cannot be created based on the current server. If you want to recover the data on the server, you can use a snapshot of the server to roll back the disks of the server.
      *     *   If your simple application server resides outside the Chinese mainland, you cannot switch the OS of the server between Windows Server and Linux. You cannot use a Windows Server custom image to reset a Linux simple application server. You also cannot use a Linux custom image to reset a Windows Server simple application server. You can switch the OSs of simple application servers only between Windows Server OSs or between Linux distributions.
      *     *   The following limits apply to the disks attached to the simple application server:
      *         *   If the custom image contains a system disk and a data disk but only a system disk is attached to the simple application server and no data disk is attached, you cannot use the custom image to reset the simple application server.
      *         *   If the system disk size of the custom image is greater than the system disk size of the simple application server, you cannot directly use the custom image to reset the simple application server.
      *         *   Only if the system disk size of the simple application server is greater than or equal to the system disk size of the custom image, you can use the custom image to reset the simple application server. To increase the system disk size of your simple application server, you can upgrade the server. For more information, see Upgrade a simple application server.
      *         *   If the data disk size of the custom image is greater than the data disk size of the simple application server, you cannot use the custom image to reset the simple application server.
      * ### QPS limit
      * You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits](~~347607~~).
      *
     */
    CompletableFuture<ResetSystemResponse> resetSystem(ResetSystemRequest request);

    /**
      * You can call this operation to restart a Simple Database Service instance that is in the Running state.
      * ### QPS limit
      * You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits](~~347607~~).
      *
     */
    CompletableFuture<RestartDatabaseInstanceResponse> restartDatabaseInstance(RestartDatabaseInstanceRequest request);

    /**
      * Command Assistant is an automated O\\&M tool for Simple Application Server. You can maintain simple application servers by running shell, PowerShell, and batch commands in the Simple Application Server console without remotely logging on to the servers.
      * Before you use Command Assistant, take note of the following items:
      * *   The simple application server must be in the Running state.
      * *   The Cloud Assistant client is installed on the server. By default, the Cloud Assistant client is installed on simple application servers. If you have manually uninstalled the client, you must reinstall it. For more information, see [Install the Cloud Assistant Agent](~~64921~~).
      *
     */
    CompletableFuture<RunCommandResponse> runCommand(RunCommandRequest request);

    /**
      * You can call this operation to start a Simple Database Service instance that is in the Stopped state.
      * ### QPS limit
      * You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits](~~347607~~).
      *
     */
    CompletableFuture<StartDatabaseInstanceResponse> startDatabaseInstance(StartDatabaseInstanceRequest request);

    /**
      * You can call this operation to start a simple application server that is in the Stopped state.
      * ### QPS limit
      * You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits](~~347607~~).
      *
     */
    CompletableFuture<StartInstanceResponse> startInstance(StartInstanceRequest request);

    CompletableFuture<StartInstancesResponse> startInstances(StartInstancesRequest request);

    CompletableFuture<StartTerminalSessionResponse> startTerminalSession(StartTerminalSessionRequest request);

    /**
      * You can call this operation to stop a Simple Database Service instance that is in the Running state. After the instance is stopped, you cannot log on to or access the instance.
      * ### QPS limit
      * You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits](~~347607~~).
      *
     */
    CompletableFuture<StopDatabaseInstanceResponse> stopDatabaseInstance(StopDatabaseInstanceRequest request);

    /**
      * You can stop a simple application server that you do not use for the time being.
      * >  Stopping a simple application server may interrupt your business. We recommend that you perform the stop operation during off-peak hours.
      * ### QPS limit
      * You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits](~~347607~~).
      *
     */
    CompletableFuture<StopInstanceResponse> stopInstance(StopInstanceRequest request);

    CompletableFuture<StopInstancesResponse> stopInstances(StopInstancesRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpdateCommandAttributeResponse> updateCommandAttribute(UpdateCommandAttributeRequest request);

    CompletableFuture<UpdateDiskAttributeResponse> updateDiskAttribute(UpdateDiskAttributeRequest request);

    /**
      * ## Usage notes
      * After you change the password of a simple application server, you must restart the server by calling the [RebootInstance](~~190443~~) operation to allow the new password to take effect.
      * ### QPS limits
      * You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits](~~347607~~).
      *
     */
    CompletableFuture<UpdateInstanceAttributeResponse> updateInstanceAttribute(UpdateInstanceAttributeRequest request);

    CompletableFuture<UpdateSnapshotAttributeResponse> updateSnapshotAttribute(UpdateSnapshotAttributeRequest request);

    /**
      * *   The plan of a simple application server cannot be downgraded, but can only be upgraded. For more information about plans, see [Billable items](~~58623~~).
      * *   When you call this operation to upgrade a server, make sure that the balance in your account is sufficient. If the balance in your account is insufficient, the server cannot be upgraded.
      * ### QPS limit
      * You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits](~~347607~~).
      *
     */
    CompletableFuture<UpgradeInstanceResponse> upgradeInstance(UpgradeInstanceRequest request);

    CompletableFuture<UploadInstanceKeyPairResponse> uploadInstanceKeyPair(UploadInstanceKeyPairRequest request);

}
