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

    /**
     * <b>description</b> :
     * <p>  Before you share a custom image, make sure that all sensitive data and files are removed from the image.</p>
     * <ul>
     * <li>The IDs of the Alibaba Cloud accounts with which you want to share the image is obtained. Move the pointer over the profile in the upper-right corner of the Simple Application Server console. In the card that appears, if Main Account is displayed, the showed account ID is the Alibaba Cloud account ID.</li>
     * </ul>
     * 
     * @param request the request parameters of AddCustomImageShareAccount  AddCustomImageShareAccountRequest
     * @return AddCustomImageShareAccountResponse
     */
    CompletableFuture<AddCustomImageShareAccountResponse> addCustomImageShareAccount(AddCustomImageShareAccountRequest request);

    /**
     * <b>description</b> :
     * <p>By default, no public endpoints are assigned to Simple Database Service instances. If you want to access the databases of a Simple Database Service instance over the Internet by using Simple Container Service or Data Management (DMS), you must apply for a public endpoint for the Simple Database Service instance.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/347607.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of AllocatePublicConnection  AllocatePublicConnectionRequest
     * @return AllocatePublicConnectionResponse
     */
    CompletableFuture<AllocatePublicConnectionResponse> allocatePublicConnection(AllocatePublicConnectionRequest request);

    /**
     * <b>description</b> :
     * <p>If the port range, protocol, and source IP address of a firewall rule in a firewall template are the same as the port range, protocol, and source IP address of an existing rule, the new rule overwrites the existing rule regardless of whether the existing rule is enabled or disabled.</p>
     * 
     * @param request the request parameters of ApplyFirewallTemplate  ApplyFirewallTemplateRequest
     * @return ApplyFirewallTemplateResponse
     */
    CompletableFuture<ApplyFirewallTemplateResponse> applyFirewallTemplate(ApplyFirewallTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>You can bind only one key pair to a simple application server in the Simple Application Server console. If a simple application server has a key pair bound, the new key pair overwrites the original key pair.</p>
     * 
     * @param request the request parameters of AttachKeyPair  AttachKeyPairRequest
     * @return AttachKeyPairResponse
     */
    CompletableFuture<AttachKeyPairResponse> attachKeyPair(AttachKeyPairRequest request);

    /**
     * @param request the request parameters of CreateCommand  CreateCommandRequest
     * @return CreateCommandResponse
     */
    CompletableFuture<CreateCommandResponse> createCommand(CreateCommandRequest request);

    /**
     * <b>description</b> :
     * <p>A custom image is created based on a snapshot of a simple application server. You can use a custom image to create multiple simple application servers that have the same configurations. You can also share custom images to ECS and use the shared images to create ECS instances or replace the OSs of existing ECS instances. For more information about custom images, see <a href="https://help.aliyun.com/document_detail/199375.html">Overview of custom images</a>.
     * You must create a system disk snapshot of a simple application server before you create a custom image based on the snapshot. For more information, see <a href="https://help.aliyun.com/document_detail/190452.html">CreateSnapshot</a>.</p>
     * <blockquote>
     * <p>If you need the data on the data disk of a simple application server when you create a custom image, create a snapshot for the data disk first.
     * Before you create a custom image, take note of the following items:</p>
     * </blockquote>
     * <ul>
     * <li>The custom image and the corresponding simple application server must reside in the same region.</li>
     * <li>The maximum number of custom images that can be maintained in an Alibaba Cloud account is triple the number of simple application servers in the account. The value cannot be greater than 15.</li>
     * <li>You can directly create a custom image only based on the system disk snapshot of a simple application server. If you want a custom image to contain the data on the data disk of the simple application server, you must select a data disk snapshot when you create the custom image.</li>
     * <li>If a simple application server is released due to expiration or refunds, the custom images that are created based on a snapshot of the server are also released.</li>
     * <li>If you reset a simple application server by changing the application system or OS of the server or replacing the image of the server, the disk data on the server is cleared. Back up the disk data as needed.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/347607.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of CreateCustomImage  CreateCustomImageRequest
     * @return CreateCustomImageResponse
     */
    CompletableFuture<CreateCustomImageResponse> createCustomImage(CreateCustomImageRequest request);

    /**
     * <b>description</b> :
     * <p>Firewalls serve to control network access to simple application servers and isolate security domains in the cloud. By default, SSH port 22, HTTP port 80, and HTTPS port 443 are enabled for simple application servers. Other ports are disabled. You can add firewall rules to enable more ports.</p>
     * <h3>QPS limits</h3>
     * <p>You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/347607.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of CreateFirewallRule  CreateFirewallRuleRequest
     * @return CreateFirewallRuleResponse
     */
    CompletableFuture<CreateFirewallRuleResponse> createFirewallRule(CreateFirewallRuleRequest request);

    /**
     * <b>description</b> :
     * <p>Firewalls serve to control network access to simple application servers and isolate security domains in the cloud. By default, SSH port 22, HTTP port 80, and HTTPS port 443 are enabled for simple application servers. Other ports are disabled. You can add firewall rules to enable more ports.</p>
     * 
     * @param request the request parameters of CreateFirewallRules  CreateFirewallRulesRequest
     * @return CreateFirewallRulesResponse
     */
    CompletableFuture<CreateFirewallRulesResponse> createFirewallRules(CreateFirewallRulesRequest request);

    /**
     * <b>description</b> :
     * <p>Simple Application Server supports the firewall template feature that provides multiple firewall rules. You can use a template to add a group of firewall rules to one or more simple application servers at a time. This improves the efficiency of setting firewall rules.</p>
     * 
     * @param request the request parameters of CreateFirewallTemplate  CreateFirewallTemplateRequest
     * @return CreateFirewallTemplateResponse
     */
    CompletableFuture<CreateFirewallTemplateResponse> createFirewallTemplate(CreateFirewallTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>Adding firewall rules to a firewall template does not affect the firewall rules that have been applied to simple application servers..</p>
     * 
     * @param request the request parameters of CreateFirewallTemplateRules  CreateFirewallTemplateRulesRequest
     * @return CreateFirewallTemplateRulesResponse
     */
    CompletableFuture<CreateFirewallTemplateRulesResponse> createFirewallTemplateRules(CreateFirewallTemplateRulesRequest request);

    /**
     * @param request the request parameters of CreateInstanceKeyPair  CreateInstanceKeyPairRequest
     * @return CreateInstanceKeyPairResponse
     */
    CompletableFuture<CreateInstanceKeyPairResponse> createInstanceKeyPair(CreateInstanceKeyPairRequest request);

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, we recommend that you understand the billing of Simple Application Server. For more information, see <a href="https://help.aliyun.com/document_detail/58623.html">Billable items</a>.</p>
     * <ul>
     * <li>A maximum of 20 simple application servers can be maintained in an Alibaba Cloud account.</li>
     * <li>When you call this operation to create simple application servers, make sure that the balance in your account is sufficient to pay for the servers. If the balance in your account is insufficient, the servers cannot be created.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/347607.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of CreateInstances  CreateInstancesRequest
     * @return CreateInstancesResponse
     */
    CompletableFuture<CreateInstancesResponse> createInstances(CreateInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>Alibaba Cloud SSH key pairs offer a secure and efficient logon authentication mechanism, facilitating both verification and encrypted communication within the SSH protocol framework. An SSH key pair is essentially constituted by a public key and a private key. Tailored for Linux-based simple application servers, this security measure enhances security and convenience, effectively addressing your heightened security requirements.</p>
     * <ul>
     * <li>The key pair logon method is only valid for Linux-based simple application servers.</li>
     * <li>A maximum of 10 key pairs can be created in a region for an Alibaba Cloud account.</li>
     * <li>Only RSA 2048-bit key pairs can be created in the Simple Application Server console.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateKeyPair  CreateKeyPairRequest
     * @return CreateKeyPairResponse
     */
    CompletableFuture<CreateKeyPairResponse> createKeyPair(CreateKeyPairRequest request);

    /**
     * <b>description</b> :
     * <p>A snapshot is a point-in-time backup of a disk. Snapshots can be used to back up data, recover data after accidental operations on instances, recover data after network attacks, and create custom images.</p>
     * <blockquote>
     * <p>You are not charged for creating snapshots for disks of simple application servers.</p>
     * </blockquote>
     * <h3>Precautions</h3>
     * <ul>
     * <li>You can create up to three snapshots for disks of each simple application server.</li>
     * <li>The maximum number of snapshots that can be retained in an Alibaba Cloud account is triple the number of simple application servers that you maintain. The value cannot be greater than 15.</li>
     * <li>If a simple application server is automatically released due to expiration, the snapshots created for the server are deleted.</li>
     * <li>If you reset the simple application server after you create a snapshot for a server, the snapshot is retained but cannot be used to roll back the disks of the server.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/347607.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of CreateSnapshot  CreateSnapshotRequest
     * @return CreateSnapshotResponse
     */
    CompletableFuture<CreateSnapshotResponse> createSnapshot(CreateSnapshotRequest request);

    /**
     * <b>description</b> :
     * <p>You cannot delete commands that are being run.</p>
     * 
     * @param request the request parameters of DeleteCommand  DeleteCommandRequest
     * @return DeleteCommandResponse
     */
    CompletableFuture<DeleteCommandResponse> deleteCommand(DeleteCommandRequest request);

    /**
     * <b>description</b> :
     * <p>You can delete a custom image that you no longer need. After the custom image is deleted, you cannot use the custom image to reset the simple application servers that were created based on the custom image.</p>
     * <blockquote>
     * <p>If a custom image is shared to Elastic Compute Service (ECS), you must unshare the image before you can delete it. After you unshare the custom image, you cannot query the custom image by using the ECS console or by calling ECS API operations. If you need to use the custom image in ECS, we recommend that you copy the image before you delete it. For more information, see <a href="https://help.aliyun.com/document_detail/199378.html">Copy a shared image of a simple application server in the ECS console</a>.</p>
     * </blockquote>
     * <h3>QPS limit</h3>
     * <p>You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/347607.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DeleteCustomImage  DeleteCustomImageRequest
     * @return DeleteCustomImageResponse
     */
    CompletableFuture<DeleteCustomImageResponse> deleteCustomImage(DeleteCustomImageRequest request);

    /**
     * <b>description</b> :
     * <p>If a custom image is shared, you must unshare the image before you can delete it. After a custom image is unshared, you cannot query the custom image by using the Elastic Compute Service (ECS) console or by calling an ECS API operation. If you want to use a custom image to create ECS instances, we recommend that you copy the custom image before you delete it. For more information, see the &quot;Copy custom images&quot; topic.</p>
     * 
     * @param request the request parameters of DeleteCustomImages  DeleteCustomImagesRequest
     * @return DeleteCustomImagesResponse
     */
    CompletableFuture<DeleteCustomImagesResponse> deleteCustomImages(DeleteCustomImagesRequest request);

    /**
     * <b>description</b> :
     * <p>After a firewall rule is deleted, your business deployed on the simple application server may become inaccessible. Before you delete a firewall rule, make sure that the firewall rule is no longer needed by the simple application server.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/347607.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DeleteFirewallRule  DeleteFirewallRuleRequest
     * @return DeleteFirewallRuleResponse
     */
    CompletableFuture<DeleteFirewallRuleResponse> deleteFirewallRule(DeleteFirewallRuleRequest request);

    /**
     * <b>description</b> :
     * <p>After a firewall rule is deleted, your business deployed on the simple application server may become inaccessible. Before you delete a firewall rule, make sure that the firewall rule is no longer needed by the simple application server.</p>
     * 
     * @param request the request parameters of DeleteFirewallRules  DeleteFirewallRulesRequest
     * @return DeleteFirewallRulesResponse
     */
    CompletableFuture<DeleteFirewallRulesResponse> deleteFirewallRules(DeleteFirewallRulesRequest request);

    /**
     * <b>description</b> :
     * <p>Deletion of firewall rules does not affect the firewall rules that have been applied to simple application servers.</p>
     * 
     * @param request the request parameters of DeleteFirewallTemplateRules  DeleteFirewallTemplateRulesRequest
     * @return DeleteFirewallTemplateRulesResponse
     */
    CompletableFuture<DeleteFirewallTemplateRulesResponse> deleteFirewallTemplateRules(DeleteFirewallTemplateRulesRequest request);

    /**
     * <b>description</b> :
     * <p>Deleting a firewall template does not affect the firewall rules that have been applied to simple application servers. You can delete firewall templates that you no longer need.</p>
     * 
     * @param request the request parameters of DeleteFirewallTemplates  DeleteFirewallTemplatesRequest
     * @return DeleteFirewallTemplatesResponse
     */
    CompletableFuture<DeleteFirewallTemplatesResponse> deleteFirewallTemplates(DeleteFirewallTemplatesRequest request);

    /**
     * @param request the request parameters of DeleteInstanceKeyPair  DeleteInstanceKeyPairRequest
     * @return DeleteInstanceKeyPairResponse
     */
    CompletableFuture<DeleteInstanceKeyPairResponse> deleteInstanceKeyPair(DeleteInstanceKeyPairRequest request);

    /**
     * <b>description</b> :
     * <p>You must unbind SSH key pairs that you no longer use from simple application servers before you delete the SSH key pairs.</p>
     * 
     * @param request the request parameters of DeleteKeyPairs  DeleteKeyPairsRequest
     * @return DeleteKeyPairsResponse
     */
    CompletableFuture<DeleteKeyPairsResponse> deleteKeyPairs(DeleteKeyPairsRequest request);

    /**
     * <b>description</b> :
     * <p>You can delete a snapshot if you no longer need it.</p>
     * <blockquote>
     * <p>If a custom image was created based on the snapshot, delete the custom image before you delete the snapshot.</p>
     * </blockquote>
     * <h3>QPS limit</h3>
     * <p>You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/347607.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DeleteSnapshot  DeleteSnapshotRequest
     * @return DeleteSnapshotResponse
     */
    CompletableFuture<DeleteSnapshotResponse> deleteSnapshot(DeleteSnapshotRequest request);

    /**
     * @param request the request parameters of DeleteSnapshots  DeleteSnapshotsRequest
     * @return DeleteSnapshotsResponse
     */
    CompletableFuture<DeleteSnapshotsResponse> deleteSnapshots(DeleteSnapshotsRequest request);

    /**
     * @param request the request parameters of DescribeCloudAssistantAttributes  DescribeCloudAssistantAttributesRequest
     * @return DescribeCloudAssistantAttributesResponse
     */
    CompletableFuture<DescribeCloudAssistantAttributesResponse> describeCloudAssistantAttributes(DescribeCloudAssistantAttributesRequest request);

    /**
     * <b>description</b> :
     * <p>By default, the Cloud Assistant client is installed on simple application servers. If you have manually uninstalled the client, you must reinstall the client. Otherwise, you cannot run commands on the servers.</p>
     * 
     * @param request the request parameters of DescribeCloudAssistantStatus  DescribeCloudAssistantStatusRequest
     * @return DescribeCloudAssistantStatusResponse
     */
    CompletableFuture<DescribeCloudAssistantStatusResponse> describeCloudAssistantStatus(DescribeCloudAssistantStatusRequest request);

    /**
     * @param request the request parameters of DescribeCloudMonitorAgentStatuses  DescribeCloudMonitorAgentStatusesRequest
     * @return DescribeCloudMonitorAgentStatusesResponse
     */
    CompletableFuture<DescribeCloudMonitorAgentStatusesResponse> describeCloudMonitorAgentStatuses(DescribeCloudMonitorAgentStatusesRequest request);

    /**
     * @param request the request parameters of DescribeCommandInvocations  DescribeCommandInvocationsRequest
     * @return DescribeCommandInvocationsResponse
     */
    CompletableFuture<DescribeCommandInvocationsResponse> describeCommandInvocations(DescribeCommandInvocationsRequest request);

    /**
     * @param request the request parameters of DescribeCommands  DescribeCommandsRequest
     * @return DescribeCommandsResponse
     */
    CompletableFuture<DescribeCommandsResponse> describeCommands(DescribeCommandsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the error logs of databases in a Simple Database Service instance and locate faults based on the error logs.
     * \### QPS limit You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/347607.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DescribeDatabaseErrorLogs  DescribeDatabaseErrorLogsRequest
     * @return DescribeDatabaseErrorLogsResponse
     */
    CompletableFuture<DescribeDatabaseErrorLogsResponse> describeDatabaseErrorLogs(DescribeDatabaseErrorLogsRequest request);

    /**
     * <b>description</b> :
     * <p>After you create a Simple Database Service instance, you can query the details about the vCPU, memory, disk size, storage IOPS (input/output operations per second), and total current connection number of the instance.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/347607.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DescribeDatabaseInstanceMetricData  DescribeDatabaseInstanceMetricDataRequest
     * @return DescribeDatabaseInstanceMetricDataResponse
     */
    CompletableFuture<DescribeDatabaseInstanceMetricDataResponse> describeDatabaseInstanceMetricData(DescribeDatabaseInstanceMetricDataRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the information about parameters of a Simple Database Service instance.</p>
     * 
     * @param request the request parameters of DescribeDatabaseInstanceParameters  DescribeDatabaseInstanceParametersRequest
     * @return DescribeDatabaseInstanceParametersResponse
     */
    CompletableFuture<DescribeDatabaseInstanceParametersResponse> describeDatabaseInstanceParameters(DescribeDatabaseInstanceParametersRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the details of Simple Database Service instances in a region, including the IDs, names, plans, database versions, public endpoint, internal endpoint, creation time, and expiration time of the instances.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/347607.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DescribeDatabaseInstances  DescribeDatabaseInstancesRequest
     * @return DescribeDatabaseInstancesResponse
     */
    CompletableFuture<DescribeDatabaseInstancesResponse> describeDatabaseInstances(DescribeDatabaseInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>You can query the slow query log details of a Simple Database Service instance and locate faults based on the log details.</p>
     * <blockquote>
     * <p>Slow query log details are retained for 7 days.</p>
     * </blockquote>
     * <h3>QPS limit</h3>
     * <p>You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/347607.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DescribeDatabaseSlowLogRecords  DescribeDatabaseSlowLogRecordsRequest
     * @return DescribeDatabaseSlowLogRecordsResponse
     */
    CompletableFuture<DescribeDatabaseSlowLogRecordsResponse> describeDatabaseSlowLogRecords(DescribeDatabaseSlowLogRecordsRequest request);

    /**
     * @param request the request parameters of DescribeFirewallTemplateApplyResults  DescribeFirewallTemplateApplyResultsRequest
     * @return DescribeFirewallTemplateApplyResultsResponse
     */
    CompletableFuture<DescribeFirewallTemplateApplyResultsResponse> describeFirewallTemplateApplyResults(DescribeFirewallTemplateApplyResultsRequest request);

    /**
     * @param request the request parameters of DescribeFirewallTemplateRulesApplyResult  DescribeFirewallTemplateRulesApplyResultRequest
     * @return DescribeFirewallTemplateRulesApplyResultResponse
     */
    CompletableFuture<DescribeFirewallTemplateRulesApplyResultResponse> describeFirewallTemplateRulesApplyResult(DescribeFirewallTemplateRulesApplyResultRequest request);

    /**
     * @param request the request parameters of DescribeFirewallTemplates  DescribeFirewallTemplatesRequest
     * @return DescribeFirewallTemplatesResponse
     */
    CompletableFuture<DescribeFirewallTemplatesResponse> describeFirewallTemplates(DescribeFirewallTemplatesRequest request);

    /**
     * @param request the request parameters of DescribeInstanceKeyPair  DescribeInstanceKeyPairRequest
     * @return DescribeInstanceKeyPairResponse
     */
    CompletableFuture<DescribeInstanceKeyPairResponse> describeInstanceKeyPair(DescribeInstanceKeyPairRequest request);

    /**
     * @param request the request parameters of DescribeInstancePasswordsSetting  DescribeInstancePasswordsSettingRequest
     * @return DescribeInstancePasswordsSettingResponse
     */
    CompletableFuture<DescribeInstancePasswordsSettingResponse> describeInstancePasswordsSetting(DescribeInstancePasswordsSettingRequest request);

    /**
     * @param request the request parameters of DescribeInstanceVncUrl  DescribeInstanceVncUrlRequest
     * @return DescribeInstanceVncUrlResponse
     */
    CompletableFuture<DescribeInstanceVncUrlResponse> describeInstanceVncUrl(DescribeInstanceVncUrlRequest request);

    /**
     * <b>description</b> :
     * <p>  After you execute a command, the command may not succeed or return the expected results. You can call this operation to query the execution result of a command.</p>
     * <ul>
     * <li>You can query the execution results that were generated within the last two weeks. A maximum of 100,000 entries of execution results can be retained.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeInvocationResult  DescribeInvocationResultRequest
     * @return DescribeInvocationResultResponse
     */
    CompletableFuture<DescribeInvocationResultResponse> describeInvocationResult(DescribeInvocationResultRequest request);

    /**
     * <b>description</b> :
     * <p>  After you execute a command, the command may not succeed or return the expected results. You can call this operation to query the actual execution results.</p>
     * <ul>
     * <li>You can query the execution results that were generated within the last two weeks. Up to 100,000 entries of execution results can be retained.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeInvocations  DescribeInvocationsRequest
     * @return DescribeInvocationsResponse
     */
    CompletableFuture<DescribeInvocationsResponse> describeInvocations(DescribeInvocationsRequest request);

    /**
     * @param request the request parameters of DescribeMonitorData  DescribeMonitorDataRequest
     * @return DescribeMonitorDataResponse
     */
    CompletableFuture<DescribeMonitorDataResponse> describeMonitorData(DescribeMonitorDataRequest request);

    /**
     * @param request the request parameters of DescribeSecurityAgentStatus  DescribeSecurityAgentStatusRequest
     * @return DescribeSecurityAgentStatusResponse
     */
    CompletableFuture<DescribeSecurityAgentStatusResponse> describeSecurityAgentStatus(DescribeSecurityAgentStatusRequest request);

    /**
     * <b>description</b> :
     * <p>If you want to change the SSH key pairs that are bound to your simple application servers or your end user no longer needs to access a specific simple application server, you can unbind the SSH key pairs from simple application servers to improve the security of the simple application servers or restrict access to the specific simple application server.</p>
     * 
     * @param request the request parameters of DetachKeyPair  DetachKeyPairRequest
     * @return DetachKeyPairResponse
     */
    CompletableFuture<DetachKeyPairResponse> detachKeyPair(DetachKeyPairRequest request);

    /**
     * @param request the request parameters of DisableFirewallRule  DisableFirewallRuleRequest
     * @return DisableFirewallRuleResponse
     */
    CompletableFuture<DisableFirewallRuleResponse> disableFirewallRule(DisableFirewallRuleRequest request);

    /**
     * @param request the request parameters of EnableFirewallRule  EnableFirewallRuleRequest
     * @return EnableFirewallRuleResponse
     */
    CompletableFuture<EnableFirewallRuleResponse> enableFirewallRule(EnableFirewallRuleRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to import an existing key pair to the Simple Application Server console. This way, you can use the key pair to log on to simple application servers. The existing key pair that you want to import must use a supported encryption method. For more information, see <a href="https://help.aliyun.com/document_detail/59085.html">Q2: Which encryption methods must be used by key pairs when I import existing key pairs to the Simple Application Server console?</a></p>
     * 
     * @param request the request parameters of ImportKeyPair  ImportKeyPairRequest
     * @return ImportKeyPairResponse
     */
    CompletableFuture<ImportKeyPairResponse> importKeyPair(ImportKeyPairRequest request);

    /**
     * <b>description</b> :
     * <p>To run commands on your simple application servers, you must install the Cloud Assistant client on your servers. You can call the <a href="https://help.aliyun.com/document_detail/439512.html">DescribeCloudAssistantStatus</a> operation to check whether the Cloud Assistant client is installed on your simple application servers. If you have not installed the Cloud Assistant client, you can call the InstallCloudAssistant operation to install the client. Then, you can call the <a href="https://help.aliyun.com/document_detail/190443.html">RebootInstance</a> operation to restart the servers to allow the client to take effect.</p>
     * 
     * @param request the request parameters of InstallCloudAssistant  InstallCloudAssistantRequest
     * @return InstallCloudAssistantResponse
     */
    CompletableFuture<InstallCloudAssistantResponse> installCloudAssistant(InstallCloudAssistantRequest request);

    /**
     * @param request the request parameters of InstallCloudMonitorAgent  InstallCloudMonitorAgentRequest
     * @return InstallCloudMonitorAgentResponse
     */
    CompletableFuture<InstallCloudMonitorAgentResponse> installCloudMonitorAgent(InstallCloudMonitorAgentRequest request);

    /**
     * <b>description</b> :
     * <p>  The simple application servers for which you want to call the operation must meet the following conditions. If a simple application server cannot meet the conditions, you must call this operation again.
     *     *   The simple application servers are in the <code>Running</code> state. You can call the <a href="https://help.aliyun.com/document_detail/2361065.html">ListInstances</a> operation to query the status of simple application servers.
     *     *   Cloud Assistant Agent is installed on the simple application servers. For more information, see <a href="https://help.aliyun.com/document_detail/2361030.html">InstallCloudAssistant</a>.
     *     *   If you run a PowerShell command, make sure that the PowerShell module is configured for the simple application servers.</p>
     * <ul>
     * <li>The command may fail to be run due to the abnormal states of simple application servers, network exceptions, or exceptions in Cloud Assistant Agent. If the command fails to be run, no execution information is generated.</li>
     * <li>If you enable the custom parameter feature when you create a command, you must set the <code>Parameters</code> parameter to specify custom parameters when you run the command.</li>
     * <li>When you call this operation, you can select only one common command or a custom command that you have created.</li>
     * </ul>
     * 
     * @param request the request parameters of InvokeCommand  InvokeCommandRequest
     * @return InvokeCommandResponse
     */
    CompletableFuture<InvokeCommandResponse> invokeCommand(InvokeCommandRequest request);

    /**
     * @param request the request parameters of ListCustomImageShareAccounts  ListCustomImageShareAccountsRequest
     * @return ListCustomImageShareAccountsResponse
     */
    CompletableFuture<ListCustomImageShareAccountsResponse> listCustomImageShareAccounts(ListCustomImageShareAccountsRequest request);

    /**
     * @param request the request parameters of ListCustomImages  ListCustomImagesRequest
     * @return ListCustomImagesResponse
     */
    CompletableFuture<ListCustomImagesResponse> listCustomImages(ListCustomImagesRequest request);

    /**
     * <b>description</b> :
     * <p>You can specify multiple request parameters that you want to query, such as <code>InstanceId</code>, <code>DiskIds</code>, and <code>ResourceGroupId</code>. Specified request parameters have logical AND relations. Only the specified parameters are included in the filter conditions.</p>
     * <h3><a href="#qps-"></a>QPS limits</h3>
     * <p>You can call this operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/347607.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of ListDisks  ListDisksRequest
     * @return ListDisksResponse
     */
    CompletableFuture<ListDisksResponse> listDisks(ListDisksRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the ListFirewallRules operation to query the firewall rule details of a simple application server, including the port range, firewall rule ID, and transport layer protocol.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/347607.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of ListFirewallRules  ListFirewallRulesRequest
     * @return ListFirewallRulesResponse
     */
    CompletableFuture<ListFirewallRulesResponse> listFirewallRules(ListFirewallRulesRequest request);

    /**
     * <b>description</b> :
     * <p>You can query information about images in a region, including the IDs, names, and types of the images.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/347607.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of ListImages  ListImagesRequest
     * @return ListImagesResponse
     */
    CompletableFuture<ListImagesResponse> listImages(ListImagesRequest request);

    /**
     * <b>description</b> :
     * <p>If the plan of your simple application server does not meet your business requirements, you can call the ListInstancePlansModification operation to obtain a list of plans to which you can upgrade your simple application server. Then, you can call the <a href="https://help.aliyun.com/document_detail/190445.html">UpgradeInstance</a> operation to upgrade the server.</p>
     * <blockquote>
     * <p>We recommend that you create snapshots for the disks of your simple application server to back up data before you upgrade the server. For more information, see <a href="https://help.aliyun.com/document_detail/190452.html">CreateSnapshot</a>.
     * For the precautions about plan upgrade, see <a href="https://help.aliyun.com/document_detail/61433.html">Upgrade a simple application server</a>.</p>
     * </blockquote>
     * <h3>QPS limit</h3>
     * <p>You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/347607.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of ListInstancePlansModification  ListInstancePlansModificationRequest
     * @return ListInstancePlansModificationResponse
     */
    CompletableFuture<ListInstancePlansModificationResponse> listInstancePlansModification(ListInstancePlansModificationRequest request);

    /**
     * @param request the request parameters of ListInstanceStatus  ListInstanceStatusRequest
     * @return ListInstanceStatusResponse
     */
    CompletableFuture<ListInstanceStatusResponse> listInstanceStatus(ListInstanceStatusRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the details of simple application servers in a specified region, including the names, public IP addresses, internal IP addresses, creation time, and expiration time of the servers.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/347607.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of ListInstances  ListInstancesRequest
     * @return ListInstancesResponse
     */
    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>You can query the details of data transfer plans of simple application servers, including the data transfer quota, used amount and unused amount of the data transfer quota, and excess data transfers beyond the quota in the current month.
     * Simple Application Server provides data transfer quotas in plans. Plan prices include prices of data transfer quotas. You are charged for data transfers that exceed the quotas. Take note of the following items:</p>
     * <ul>
     * <li>Only outbound data transfers of simple application servers over the Internet are calculated. Outbound data transfers include the data transfer quota and the excess data transfers beyond the quota. Inbound data transfers of simple application servers over the Internet are not calculated.</li>
     * <li>Outbound data transfers from simple application servers to other Alibaba Cloud services over the Internet first consume data transfer quotas. If the quotas are exhausted, you are charged for excess data transfers.</li>
     * <li>You are not charged for data transfers between simple application servers within the same virtual private cloud (VPC).
     * For more information, see <a href="https://help.aliyun.com/document_detail/86281.html">Quotas and billing of data transfers</a>.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/347607.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of ListInstancesTrafficPackages  ListInstancesTrafficPackagesRequest
     * @return ListInstancesTrafficPackagesResponse
     */
    CompletableFuture<ListInstancesTrafficPackagesResponse> listInstancesTrafficPackages(ListInstancesTrafficPackagesRequest request);

    /**
     * @param request the request parameters of ListKeyPairs  ListKeyPairsRequest
     * @return ListKeyPairsResponse
     */
    CompletableFuture<ListKeyPairsResponse> listKeyPairs(ListKeyPairsRequest request);

    /**
     * <b>description</b> :
     * <p>You can query the details of all plans provided by Simple Application Server in a region, including the IDs, prices, disk sizes, and disk categories of the plans.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/347607.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of ListPlans  ListPlansRequest
     * @return ListPlansResponse
     */
    CompletableFuture<ListPlansResponse> listPlans(ListPlansRequest request);

    /**
     * <b>description</b> :
     * <p>The query results include all the Alibaba Cloud regions where Simple Application Server is supported on the international site (alibabacloud.com) and the China site (aliyun.com).</p>
     * <h3>QPS limit</h3>
     * <p>You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/347607.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of ListRegions  ListRegionsRequest
     * @return ListRegionsResponse
     */
    CompletableFuture<ListRegionsResponse> listRegions(ListRegionsRequest request);

    /**
     * <b>description</b> :
     * <p>You can specify multiple request parameters that you want to query, such as <code>InstanceId</code>, <code>DiskId</code>, <code>SnapshotIds</code>, and <code>ResourceGroupId</code>. Specified parameters have logical AND relations. Only the specified parameters are included in the filter conditions.</p>
     * <h3><a href="#qps-"></a>QPS limits</h3>
     * <p>You can call this operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/347607.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of ListSnapshots  ListSnapshotsRequest
     * @return ListSnapshotsResponse
     */
    CompletableFuture<ListSnapshotsResponse> listSnapshots(ListSnapshotsRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>After you create a simple application server, you can log on to the simple application server to build environments and applications on the server.</p>
     * 
     * @param request the request parameters of LoginInstance  LoginInstanceRequest
     * @return LoginInstanceResponse
     */
    CompletableFuture<LoginInstanceResponse> loginInstance(LoginInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify the description of a Simple Database Service instance.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/347607.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of ModifyDatabaseInstanceDescription  ModifyDatabaseInstanceDescriptionRequest
     * @return ModifyDatabaseInstanceDescriptionResponse
     */
    CompletableFuture<ModifyDatabaseInstanceDescriptionResponse> modifyDatabaseInstanceDescription(ModifyDatabaseInstanceDescriptionRequest request);

    /**
     * <b>description</b> :
     * <p>After you create a Simple Database Service instance, you can view the parameters of the instance or modify the parameters of the instance based on your business requirements.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/347607.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of ModifyDatabaseInstanceParameter  ModifyDatabaseInstanceParameterRequest
     * @return ModifyDatabaseInstanceParameterResponse
     */
    CompletableFuture<ModifyDatabaseInstanceParameterResponse> modifyDatabaseInstanceParameter(ModifyDatabaseInstanceParameterRequest request);

    /**
     * @param request the request parameters of ModifyFirewallRule  ModifyFirewallRuleRequest
     * @return ModifyFirewallRuleResponse
     */
    CompletableFuture<ModifyFirewallRuleResponse> modifyFirewallRule(ModifyFirewallRuleRequest request);

    /**
     * <b>description</b> :
     * <p>Modifying a firewall template does not affect the firewall rules that have been applied to simple application servers.</p>
     * 
     * @param request the request parameters of ModifyFirewallTemplate  ModifyFirewallTemplateRequest
     * @return ModifyFirewallTemplateResponse
     */
    CompletableFuture<ModifyFirewallTemplateResponse> modifyFirewallTemplate(ModifyFirewallTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>You can share a custom image with ECS. If the configurations of your simple application server cannot meet your business requirements, or you want to use ECS instances to deploy your business, you can share your custom image with ECS to transfer your business from Simple Application Server to ECS.</p>
     * <blockquote>
     * <p>The shared image in ECS resides in the same region as the custom image in Simple Application Server.
     * You can unshare a custom image based on your business requirements or when you want to delete the custom image. Take note of the following items:</p>
     * </blockquote>
     * <ul>
     * <li>After you unshare a custom image, you cannot query or use the custom image in the ECS console or by calling ECS API operations.</li>
     * <li>After you unshare a custom image, you cannot re-initialize the disks of the ECS instances that were created based on the shared image.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/347607.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of ModifyImageShareStatus  ModifyImageShareStatusRequest
     * @return ModifyImageShareStatusResponse
     */
    CompletableFuture<ModifyImageShareStatusResponse> modifyImageShareStatus(ModifyImageShareStatusRequest request);

    /**
     * @param request the request parameters of ModifyInstanceVncPassword  ModifyInstanceVncPasswordRequest
     * @return ModifyInstanceVncPasswordResponse
     */
    CompletableFuture<ModifyInstanceVncPasswordResponse> modifyInstanceVncPassword(ModifyInstanceVncPasswordRequest request);

    /**
     * <b>description</b> :
     * <p>  Only simple application servers that are in the Running state can be restarted.</p>
     * <ul>
     * <li>After you restart a simple application server, it enters the Starting state.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/347607.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of RebootInstance  RebootInstanceRequest
     * @return RebootInstanceResponse
     */
    CompletableFuture<RebootInstanceResponse> rebootInstance(RebootInstanceRequest request);

    /**
     * @param request the request parameters of RebootInstances  RebootInstancesRequest
     * @return RebootInstancesResponse
     */
    CompletableFuture<RebootInstancesResponse> rebootInstances(RebootInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>If you no longer need to use a public endpoint to access a Simple Database Service instance, you can release the public endpoint.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/347607.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of ReleasePublicConnection  ReleasePublicConnectionRequest
     * @return ReleasePublicConnectionResponse
     */
    CompletableFuture<ReleasePublicConnectionResponse> releasePublicConnection(ReleasePublicConnectionRequest request);

    /**
     * @param request the request parameters of RemoveCustomImageShareAccount  RemoveCustomImageShareAccountRequest
     * @return RemoveCustomImageShareAccountResponse
     */
    CompletableFuture<RemoveCustomImageShareAccountResponse> removeCustomImageShareAccount(RemoveCustomImageShareAccountRequest request);

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, we recommend that you understand the billing of Simple Application Server. For more information, see <a href="https://help.aliyun.com/document_detail/58623.html">Billable items</a>.</p>
     * <ul>
     * <li>When you call this operation to renew a server, make sure that the balance in your account is sufficient. If the balance in your account is insufficient, the server cannot be renewed.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/347607.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of RenewInstance  RenewInstanceRequest
     * @return RenewInstanceResponse
     */
    CompletableFuture<RenewInstanceResponse> renewInstance(RenewInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>If the password of your Simple Database Service instance is not strong, you can call this operation to change the password of the administrator account of the instance. To ensure security of the instance, we recommend that you regularly change the password of the instance.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/347607.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of ResetDatabaseAccountPassword  ResetDatabaseAccountPasswordRequest
     * @return ResetDatabaseAccountPasswordResponse
     */
    CompletableFuture<ResetDatabaseAccountPasswordResponse> resetDatabaseAccountPassword(ResetDatabaseAccountPasswordRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation to roll back a disk only if the associated simple application server is in the Stopped state.</p>
     * <ul>
     * <li>After a disk is rolled back, all data changes that are made from when the snapshot was created to when the disk is rolled back are lost. Back up disk data based on your needs before you roll back the disk.</li>
     * </ul>
     * <h3>Precautions</h3>
     * <p>After you reset a simple application server, the disk data on the server is deleted. Snapshots created before the resetting operation are retained but cannot be used to roll back the disks of the server.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/347607.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of ResetDisk  ResetDiskRequest
     * @return ResetDiskResponse
     */
    CompletableFuture<ResetDiskResponse> resetDisk(ResetDiskRequest request);

    /**
     * <b>description</b> :
     * <p>You can reset a simple application server to re-install its application system or OS and re-initialize the server. You can reset a simple application server by resetting the current system or replacing the image.
     * You can use one of the following methods to reset a simple application server:</p>
     * <ul>
     * <li>Reset the current system. You can re-install the operating system without replacing the image.</li>
     * <li>Replace the image. You can select an Alibaba Cloud image or a custom image that is different from the existing image of the server to reinstall the OS of the server.</li>
     * </ul>
     * <h3>Precautions</h3>
     * <ul>
     * <li>After you reset a simple application server, the disk data on the server is cleared. Back up the data as needed.</li>
     * <li>After you reset a simple application server, the monitoring operations that are performed on the server may fail. In this case, you can use one of the following methods to install the CloudMonitor agent on the server:<ul>
     * <li>Connect to the server: For more information, see <a href="https://help.aliyun.com/document_detail/183482.html">Manually install the CloudMonitor agent for C++ on an ECS instance</a>.</li>
     * <li>Use Command Assistant: For more information, see <a href="https://help.aliyun.com/document_detail/438681.html">Use Command Assistant</a>. You can obtain the command that can be used to install CloudMonitor from the &quot;Common commands&quot; section of the <a href="https://help.aliyun.com/document_detail/438681.html">Use Command Assistant</a> topic.</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>Limits</h3>
     * <ul>
     * <li>Snapshots that are created before a server is reset are retained, but the snapshots cannot be used to roll back the disks of the server.</li>
     * <li>You cannot reset simple application servers that were created based on custom images that contain data of data disks.</li>
     * <li>Before you reset a simple application server by replacing the existing image with a custom image, take note of the following items:<ul>
     * <li>The custom image must reside in the same region as the current server.</li>
     * <li>The custom image cannot be created based on the current server. If you want to recover the data on the server, you can use a snapshot of the server to roll back the disks of the server.</li>
     * <li>If your simple application server resides outside the Chinese mainland, you cannot switch the OS of the server between Windows Server and Linux. You cannot use a Windows Server custom image to reset a Linux simple application server. You also cannot use a Linux custom image to reset a Windows Server simple application server. You can switch the OSs of simple application servers only between Windows Server OSs or between Linux distributions.</li>
     * <li>The following limits apply to the disks attached to the simple application server:<ul>
     * <li>If the custom image contains a system disk and a data disk but only a system disk is attached to the simple application server and no data disk is attached, you cannot use the custom image to reset the simple application server.</li>
     * <li>If the system disk size of the custom image is greater than the system disk size of the simple application server, you cannot directly use the custom image to reset the simple application server.</li>
     * <li>Only if the system disk size of the simple application server is greater than or equal to the system disk size of the custom image, you can use the custom image to reset the simple application server. To increase the system disk size of your simple application server, you can upgrade the server. For more information, see Upgrade a simple application server.</li>
     * <li>If the data disk size of the custom image is greater than the data disk size of the simple application server, you cannot use the custom image to reset the simple application server.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/347607.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of ResetSystem  ResetSystemRequest
     * @return ResetSystemResponse
     */
    CompletableFuture<ResetSystemResponse> resetSystem(ResetSystemRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to restart a Simple Database Service instance that is in the Running state.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/347607.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of RestartDatabaseInstance  RestartDatabaseInstanceRequest
     * @return RestartDatabaseInstanceResponse
     */
    CompletableFuture<RestartDatabaseInstanceResponse> restartDatabaseInstance(RestartDatabaseInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>Command Assistant is an automated O\&amp;M tool for Simple Application Server. You can maintain simple application servers by running shell, PowerShell, and batch commands in the Simple Application Server console without remotely logging on to the servers.
     * Before you use Command Assistant, take note of the following items:</p>
     * <ul>
     * <li>The simple application server must be in the Running state.</li>
     * <li>The Cloud Assistant client is installed on the server. By default, the Cloud Assistant client is installed on simple application servers. If you have manually uninstalled the client, you must reinstall it. For more information, see <a href="https://help.aliyun.com/document_detail/64921.html">Install the Cloud Assistant Agent</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of RunCommand  RunCommandRequest
     * @return RunCommandResponse
     */
    CompletableFuture<RunCommandResponse> runCommand(RunCommandRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to start a Simple Database Service instance that is in the Stopped state.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/347607.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of StartDatabaseInstance  StartDatabaseInstanceRequest
     * @return StartDatabaseInstanceResponse
     */
    CompletableFuture<StartDatabaseInstanceResponse> startDatabaseInstance(StartDatabaseInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to start a simple application server that is in the Stopped state.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/347607.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of StartInstance  StartInstanceRequest
     * @return StartInstanceResponse
     */
    CompletableFuture<StartInstanceResponse> startInstance(StartInstanceRequest request);

    /**
     * @param request the request parameters of StartInstances  StartInstancesRequest
     * @return StartInstancesResponse
     */
    CompletableFuture<StartInstancesResponse> startInstances(StartInstancesRequest request);

    /**
     * @param request the request parameters of StartTerminalSession  StartTerminalSessionRequest
     * @return StartTerminalSessionResponse
     */
    CompletableFuture<StartTerminalSessionResponse> startTerminalSession(StartTerminalSessionRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to stop a Simple Database Service instance that is in the Running state. After the instance is stopped, you cannot log on to or access the instance.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/347607.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of StopDatabaseInstance  StopDatabaseInstanceRequest
     * @return StopDatabaseInstanceResponse
     */
    CompletableFuture<StopDatabaseInstanceResponse> stopDatabaseInstance(StopDatabaseInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>You can stop a simple application server that you do not use for the time being.</p>
     * <blockquote>
     * <p> Stopping a simple application server may interrupt your business. We recommend that you perform the stop operation during off-peak hours.</p>
     * </blockquote>
     * <h3>QPS limit</h3>
     * <p>You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/347607.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of StopInstance  StopInstanceRequest
     * @return StopInstanceResponse
     */
    CompletableFuture<StopInstanceResponse> stopInstance(StopInstanceRequest request);

    /**
     * @param request the request parameters of StopInstances  StopInstancesRequest
     * @return StopInstancesResponse
     */
    CompletableFuture<StopInstancesResponse> stopInstances(StopInstancesRequest request);

    /**
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
     * @param request the request parameters of UpdateCommandAttribute  UpdateCommandAttributeRequest
     * @return UpdateCommandAttributeResponse
     */
    CompletableFuture<UpdateCommandAttributeResponse> updateCommandAttribute(UpdateCommandAttributeRequest request);

    /**
     * @param request the request parameters of UpdateDiskAttribute  UpdateDiskAttributeRequest
     * @return UpdateDiskAttributeResponse
     */
    CompletableFuture<UpdateDiskAttributeResponse> updateDiskAttribute(UpdateDiskAttributeRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>After you change the password of a simple application server, you must restart the server by calling the <a href="https://help.aliyun.com/document_detail/190443.html">RebootInstance</a> operation to allow the new password to take effect.</p>
     * <h3>QPS limits</h3>
     * <p>You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/347607.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of UpdateInstanceAttribute  UpdateInstanceAttributeRequest
     * @return UpdateInstanceAttributeResponse
     */
    CompletableFuture<UpdateInstanceAttributeResponse> updateInstanceAttribute(UpdateInstanceAttributeRequest request);

    /**
     * @param request the request parameters of UpdateSnapshotAttribute  UpdateSnapshotAttributeRequest
     * @return UpdateSnapshotAttributeResponse
     */
    CompletableFuture<UpdateSnapshotAttributeResponse> updateSnapshotAttribute(UpdateSnapshotAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>  The plan of a simple application server cannot be downgraded, but can only be upgraded. For more information about plans, see <a href="https://help.aliyun.com/document_detail/58623.html">Billable items</a>.</p>
     * <ul>
     * <li>When you call this operation to upgrade a server, make sure that the balance in your account is sufficient. If the balance in your account is insufficient, the server cannot be upgraded.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this API operation up to 10 times per minute per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/347607.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of UpgradeInstance  UpgradeInstanceRequest
     * @return UpgradeInstanceResponse
     */
    CompletableFuture<UpgradeInstanceResponse> upgradeInstance(UpgradeInstanceRequest request);

    /**
     * @param request the request parameters of UploadInstanceKeyPair  UploadInstanceKeyPairRequest
     * @return UploadInstanceKeyPairResponse
     */
    CompletableFuture<UploadInstanceKeyPairResponse> uploadInstanceKeyPair(UploadInstanceKeyPairRequest request);

}
