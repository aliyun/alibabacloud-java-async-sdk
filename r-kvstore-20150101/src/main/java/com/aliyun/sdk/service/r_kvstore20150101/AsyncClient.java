// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.r_kvstore20150101.models.*;
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
     * @param request the request parameters of AddShardingNode  AddShardingNodeRequest
     * @return AddShardingNodeResponse
     */
    CompletableFuture<AddShardingNodeResponse> addShardingNode(AddShardingNodeRequest request);

    /**
     * <b>description</b> :
     * <p>Clients can use the direct connection endpoint to bypass the proxy and connect to the cluster instance in the same way as they connect to a native Redis cluster. This reduces link overhead and further improves the response speed of the Tair (Redis® OSS-Compatible) database service.
     * To call this operation, the instance must meet the following conditions:</p>
     * <ul>
     * <li>The instance uses the cluster architecture.</li>
     * <li>The deployment mode is classic.</li>
     * <li>The network type of the instance is VPC. If the instance is connected to the classic network, you can call the <a href="https://help.aliyun.com/document_detail/473797.html">SwitchNetwork</a> operation to switch the network type to VPC.</li>
     * <li>The Secure Sockets Layer (SSL) encryption feature is disabled for the instance. If the Secure Sockets Layer (SSL) encryption feature is enabled, you can call the <a href="https://help.aliyun.com/document_detail/473838.html">ModifyInstanceSSL</a> operation to shut down the feature.</li>
     * </ul>
     * 
     * @param request the request parameters of AllocateDirectConnection  AllocateDirectConnectionRequest
     * @return AllocateDirectConnectionResponse
     */
    CompletableFuture<AllocateDirectConnectionResponse> allocateDirectConnection(AllocateDirectConnectionRequest request);

    /**
     * <b>description</b> :
     * <p>For the corresponding console operation, see <a href="https://help.aliyun.com/document_detail/124920.html">Apply for a public endpoint</a>.</p>
     * 
     * @param request the request parameters of AllocateInstancePublicConnection  AllocateInstancePublicConnectionRequest
     * @return AllocateInstancePublicConnectionResponse
     */
    CompletableFuture<AllocateInstancePublicConnectionResponse> allocateInstancePublicConnection(AllocateInstancePublicConnectionRequest request);

    /**
     * <b>description</b> :
     * <p>Scenarios where O&amp;M events cannot be canceled:</p>
     * <ul>
     * <li>allowCancel is 0.</li>
     * <li>The current time is later than the start time of the O&amp;M event.</li>
     * <li>The status of the O&amp;M event is not 3 (Pending execution).</li>
     * </ul>
     * 
     * @param request the request parameters of CancelActiveOperationTasks  CancelActiveOperationTasksRequest
     * @return CancelActiveOperationTasksResponse
     */
    CompletableFuture<CancelActiveOperationTasksResponse> cancelActiveOperationTasks(CancelActiveOperationTasksRequest request);

    /**
     * @param request the request parameters of CancelInspectionTask  CancelInspectionTaskRequest
     * @return CancelInspectionTaskResponse
     */
    CompletableFuture<CancelInspectionTaskResponse> cancelInspectionTask(CancelInspectionTaskRequest request);

    /**
     * <b>description</b> :
     * <p>For more information about Transparent Data Encryption (TDE) and precautions, see <a href="https://help.aliyun.com/document_detail/265913.html">Enable TDE</a>.</p>
     * <ul>
     * <li>After you call this operation to confirm the authorization, you can call the <a href="https://help.aliyun.com/document_detail/473859.html">ModifyInstanceTDE</a> operation to enable TDE.</li>
     * </ul>
     * 
     * @param request the request parameters of CheckCloudResourceAuthorized  CheckCloudResourceAuthorizedRequest
     * @return CheckCloudResourceAuthorizedResponse
     */
    CompletableFuture<CheckCloudResourceAuthorizedResponse> checkCloudResourceAuthorized(CheckCloudResourceAuthorizedRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is supported only by instances that are compatible with Redis 4.0 or later.</p>
     * <ul>
     * <li>This API operation requires the instance to be in the Running state. </li>
     * <li>You can create up to 18 accounts for each instance.<blockquote>
     * <p>For the corresponding console operation, see <a href="https://help.aliyun.com/document_detail/92665.html">Account management</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateAccount  CreateAccountRequest
     * @return CreateAccountResponse
     */
    CompletableFuture<CreateAccountResponse> createAccount(CreateAccountRequest request);

    /**
     * <b>description</b> :
     * <p>For the corresponding console operation, refer to <a href="https://help.aliyun.com/document_detail/43886.html">Backup and recovery</a>.</p>
     * 
     * @param request the request parameters of CreateBackup  CreateBackupRequest
     * @return CreateBackupResponse
     */
    CompletableFuture<CreateBackupResponse> createBackup(CreateBackupRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is deprecated. Use the <a href="https://help.aliyun.com/document_detail/184226.html">Real-time top key statistics and offline full key analysis</a> operation instead.</p>
     * 
     * @param request the request parameters of CreateCacheAnalysisTask  CreateCacheAnalysisTaskRequest
     * @return CreateCacheAnalysisTaskResponse
     */
    CompletableFuture<CreateCacheAnalysisTaskResponse> createCacheAnalysisTask(CreateCacheAnalysisTaskRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to convert an existing instance into the first child instance of a distributed instance. After the conversion, the distributed instance to which the instance belongs is created.
     * The instance to be converted must meet the following requirements:</p>
     * <ul>
     * <li>The instance to be converted is a Tair <a href="https://help.aliyun.com/document_detail/126164.html">memory-optimized</a> (Classic Edition) instance.</li>
     * <li>If the instance to be converted uses the cluster architecture, the direct connection mode must be disabled. For more information, see <a href="https://help.aliyun.com/document_detail/150047.html">Release a direct connection endpoint</a>.<blockquote>
     * <p>You can also call the <a href="https://help.aliyun.com/document_detail/473757.html">CreateInstance</a> operation to purchase a new instance as the first child instance of a distributed instance. After the child instance is created, the distributed instance to which the child instance belongs is created.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateGlobalDistributeCache  CreateGlobalDistributeCacheRequest
     * @return CreateGlobalDistributeCacheResponse
     */
    CompletableFuture<CreateGlobalDistributeCacheResponse> createGlobalDistributeCache(CreateGlobalDistributeCacheRequest request);

    /**
     * @param request the request parameters of CreateGlobalSecurityIPGroup  CreateGlobalSecurityIPGroupRequest
     * @return CreateGlobalSecurityIPGroupResponse
     */
    CompletableFuture<CreateGlobalSecurityIPGroupResponse> createGlobalSecurityIPGroup(CreateGlobalSecurityIPGroupRequest request);

    /**
     * @param request the request parameters of CreateInspectionSchedule  CreateInspectionScheduleRequest
     * @return CreateInspectionScheduleResponse
     */
    CompletableFuture<CreateInspectionScheduleResponse> createInspectionSchedule(CreateInspectionScheduleRequest request);

    /**
     * @param request the request parameters of CreateInspectionTask  CreateInspectionTaskRequest
     * @return CreateInspectionTaskResponse
     */
    CompletableFuture<CreateInspectionTaskResponse> createInspectionTask(CreateInspectionTaskRequest request);

    /**
     * <b>description</b> :
     * <p>Make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/54532.html">pricing</a> of ApsaraDB for Redis (Tair) before you call this operation.
     * This operation allows you to create a Redis Community Edition instance or a Tair memory-optimized instance with the classic architecture. To create a Tair instance with the cloud-native architecture, call the <a href="https://help.aliyun.com/document_detail/473770.html">CreateTairInstance</a> operation.</p>
     * <blockquote>
     * <p>For information about how to create a Redis instance and select instance types in the console, see <a href="https://help.aliyun.com/document_detail/26351.html">Create a Redis instance</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateInstance  CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    /**
     * @param request the request parameters of CreateInstanceMultiVIP  CreateInstanceMultiVIPRequest
     * @return CreateInstanceMultiVIPResponse
     */
    CompletableFuture<CreateInstanceMultiVIPResponse> createInstanceMultiVIP(CreateInstanceMultiVIPRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/54532.html">pricing</a> of the ApsaraDB for Tair (Redis-compatible) database.</p>
     * <blockquote>
     * <p>This operation only supports creating Classic Edition instances.
     * Use the following API operations to create a single instance:</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/473757.html">CreateInstance</a>: Creates an open-source Redis instance or a Tair memory-optimized Classic Edition instance.</li>
     * <li><a href="https://help.aliyun.com/document_detail/473770.html">CreateTairInstance</a>: Creates a Tair cloud-native instance (including memory-optimized, persistent memory-optimized, and disk-optimized instances).</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of CreateInstances  CreateInstancesRequest
     * @return CreateInstancesResponse
     */
    CompletableFuture<CreateInstancesResponse> createInstances(CreateInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>Parameter templates apply only to instances in cloud-native deployment mode (formerly cloud disk instances).</p>
     * 
     * @param request the request parameters of CreateParameterGroup  CreateParameterGroupRequest
     * @return CreateParameterGroupResponse
     */
    CompletableFuture<CreateParameterGroupResponse> createParameterGroup(CreateParameterGroupRequest request);

    /**
     * @param request the request parameters of CreateTCInstance  CreateTCInstanceRequest
     * @return CreateTCInstanceResponse
     */
    CompletableFuture<CreateTCInstanceResponse> createTCInstance(CreateTCInstanceRequest request);

    /**
     * @param request the request parameters of CreateTairAIGatewayInstance  CreateTairAIGatewayInstanceRequest
     * @return CreateTairAIGatewayInstanceResponse
     */
    CompletableFuture<CreateTairAIGatewayInstanceResponse> createTairAIGatewayInstance(CreateTairAIGatewayInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>For selection reference, see <a href="https://help.aliyun.com/document_detail/223808.html">Must-read for selecting the ApsaraDB Tair database (Redis OSS-compatible)</a>.
     * Make sure you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/54532.html">pricing</a> of the ApsaraDB Tair database (Redis OSS-compatible) before you invoke this operation.</p>
     * <blockquote>
     * <ul>
     * <li>For console operations, see <a href="https://help.aliyun.com/document_detail/26351.html">Create a Tair instance</a>.</li>
     * <li>To create other types of instances, such as open-source or <a href="https://help.aliyun.com/document_detail/126164.html">Tair memory-optimized</a> classic edition instances, you can invoke the <a href="https://help.aliyun.com/document_detail/473757.html">CreateInstance</a> operation.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of CreateTairInstance  CreateTairInstanceRequest
     * @return CreateTairInstanceResponse
     */
    CompletableFuture<CreateTairInstanceResponse> createTairInstance(CreateTairInstanceRequest request);

    /**
     * @param request the request parameters of CreateTairKVCacheVNode  CreateTairKVCacheVNodeRequest
     * @return CreateTairKVCacheVNodeResponse
     */
    CompletableFuture<CreateTairKVCacheVNodeResponse> createTairKVCacheVNode(CreateTairKVCacheVNodeRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>Before calling this operation, make sure that you understand the billing methods and <a href="https://help.aliyun.com/document_detail/54532.htm">pricing details</a> of ApsaraDB for Redis.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateTairSkvDdbTable  CreateTairSkvDdbTableRequest
     * @return CreateTairSkvDdbTableResponse
     */
    CompletableFuture<CreateTairSkvDdbTableResponse> createTairSkvDdbTable(CreateTairSkvDdbTableRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>Before you call this operation, make sure that you understand the billing methods and <a href="https://help.aliyun.com/document_detail/54532.htm">pricing details</a> of ApsaraDB for Redis.</li>
     * <li>To create a Tair Serverless KV table instance, use the <code>CreateTairSkvDdbTable</code> operation.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateTairSkvDdbWorkspace  CreateTairSkvDdbWorkspaceRequest
     * @return CreateTairSkvDdbWorkspaceResponse
     */
    CompletableFuture<CreateTairSkvDdbWorkspaceResponse> createTairSkvDdbWorkspace(CreateTairSkvDdbWorkspaceRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is supported only for instances that are compatible with Redis 4.0 or later.</p>
     * <ul>
     * <li>You can call this operation only when the instance is in the Running state.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteAccount  DeleteAccountRequest
     * @return DeleteAccountResponse
     */
    CompletableFuture<DeleteAccountResponse> deleteAccount(DeleteAccountRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is supported only for cloud-native instances.</p>
     * 
     * @param request the request parameters of DeleteBackup  DeleteBackupRequest
     * @return DeleteBackupResponse
     */
    CompletableFuture<DeleteBackupResponse> deleteBackup(DeleteBackupRequest request);

    /**
     * <b>description</b> :
     * <p>Before deleting an IP address whitelist template, disassociate the instances that are associated with the template.</p>
     * 
     * @param request the request parameters of DeleteGlobalSecurityIPGroup  DeleteGlobalSecurityIPGroupRequest
     * @return DeleteGlobalSecurityIPGroupResponse
     */
    CompletableFuture<DeleteGlobalSecurityIPGroupResponse> deleteGlobalSecurityIPGroup(DeleteGlobalSecurityIPGroupRequest request);

    /**
     * <b>description</b> :
     * <p>For the corresponding console operation, see <a href="https://help.aliyun.com/document_detail/43882.html">Release an instance</a>.
     * When you invoke this operation, the instance must meet the following conditions:</p>
     * <ul>
     * <li>The instance status is Running.</li>
     * <li>The payer of the instance uses the pay-as-you-go billing method.<blockquote>
     * <p>You cannot invoke this operation to delete an upfront (subscription) instance. An upfront instance is subject to automatic release upon expiration. To delete an upfront instance in advance, use the console.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteInspectionSchedule  DeleteInspectionScheduleRequest
     * @return DeleteInspectionScheduleResponse
     */
    CompletableFuture<DeleteInspectionScheduleResponse> deleteInspectionSchedule(DeleteInspectionScheduleRequest request);

    /**
     * <b>description</b> :
     * <p>For the corresponding console operation, see <a href="https://help.aliyun.com/document_detail/43882.html">Release an instance</a>.
     * When you invoke this operation, the instance must meet the following conditions:</p>
     * <ul>
     * <li>The instance status is Running.</li>
     * <li>The payer of the instance uses the pay-as-you-go billing method.<blockquote>
     * <p>You cannot invoke this operation to manually delete an upfront (subscription) instance. Such instances undergo automatic release upon expiration. To release an upfront instance in advance, use the console.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteInstance  DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    /**
     * @param request the request parameters of DeleteParameterGroup  DeleteParameterGroupRequest
     * @return DeleteParameterGroupResponse
     */
    CompletableFuture<DeleteParameterGroupResponse> deleteParameterGroup(DeleteParameterGroupRequest request);

    /**
     * @param request the request parameters of DeleteShardingNode  DeleteShardingNodeRequest
     * @return DeleteShardingNodeResponse
     */
    CompletableFuture<DeleteShardingNodeResponse> deleteShardingNode(DeleteShardingNodeRequest request);

    /**
     * @param request the request parameters of DescribeAccounts  DescribeAccountsRequest
     * @return DescribeAccountsResponse
     */
    CompletableFuture<DescribeAccountsResponse> describeAccounts(DescribeAccountsRequest request);

    /**
     * @param request the request parameters of DescribeActiveOperationMaintenanceConfig  DescribeActiveOperationMaintenanceConfigRequest
     * @return DescribeActiveOperationMaintenanceConfigResponse
     */
    CompletableFuture<DescribeActiveOperationMaintenanceConfigResponse> describeActiveOperationMaintenanceConfig(DescribeActiveOperationMaintenanceConfigRequest request);

    /**
     * <b>description</b> :
     * <p>After you call this operation to query existing O&amp;M tasks, you can call <a href="https://help.aliyun.com/document_detail/473864.html">ModifyActiveOperationTask</a> to modify the scheduled switchover time of an O&amp;M task.</p>
     * 
     * @param request the request parameters of DescribeActiveOperationTask  DescribeActiveOperationTaskRequest
     * @return DescribeActiveOperationTaskResponse
     */
    CompletableFuture<DescribeActiveOperationTaskResponse> describeActiveOperationTask(DescribeActiveOperationTaskRequest request);

    /**
     * @param request the request parameters of DescribeActiveOperationTaskCount  DescribeActiveOperationTaskCountRequest
     * @return DescribeActiveOperationTaskCountResponse
     */
    CompletableFuture<DescribeActiveOperationTaskCountResponse> describeActiveOperationTaskCount(DescribeActiveOperationTaskCountRequest request);

    /**
     * @param request the request parameters of DescribeActiveOperationTasks  DescribeActiveOperationTasksRequest
     * @return DescribeActiveOperationTasksResponse
     */
    CompletableFuture<DescribeActiveOperationTasksResponse> describeActiveOperationTasks(DescribeActiveOperationTasksRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, the audit log feature must be enabled for the instance. For more information, see <a href="https://help.aliyun.com/document_detail/473829.html">ModifyAuditLogConfig</a> or <a href="https://help.aliyun.com/document_detail/102015.html">Audit logs</a>.</p>
     * 
     * @param request the request parameters of DescribeAuditLogConfig  DescribeAuditLogConfigRequest
     * @return DescribeAuditLogConfigResponse
     */
    CompletableFuture<DescribeAuditLogConfigResponse> describeAuditLogConfig(DescribeAuditLogConfigRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, the audit log feature must be enabled for the instance. For more information, see <a href="https://help.aliyun.com/document_detail/473829.html">ModifyAuditLogConfig</a>.</p>
     * 
     * @param request the request parameters of DescribeAuditRecords  DescribeAuditRecordsRequest
     * @return DescribeAuditRecordsResponse
     */
    CompletableFuture<DescribeAuditRecordsResponse> describeAuditRecords(DescribeAuditRecordsRequest request);

    /**
     * @param request the request parameters of DescribeAvailableResource  DescribeAvailableResourceRequest
     * @return DescribeAvailableResourceResponse
     */
    CompletableFuture<DescribeAvailableResourceResponse> describeAvailableResource(DescribeAvailableResourceRequest request);

    /**
     * @param request the request parameters of DescribeBackupPolicy  DescribeBackupPolicyRequest
     * @return DescribeBackupPolicyResponse
     */
    CompletableFuture<DescribeBackupPolicyResponse> describeBackupPolicy(DescribeBackupPolicyRequest request);

    /**
     * @param request the request parameters of DescribeBackupTasks  DescribeBackupTasksRequest
     * @return DescribeBackupTasksResponse
     */
    CompletableFuture<DescribeBackupTasksResponse> describeBackupTasks(DescribeBackupTasksRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is not applicable to cloud-native cluster architecture instances. To query the backup sets of such instances, use the <a href="https://help.aliyun.com/document_detail/2679168.html">DescribeClusterBackupList</a> operation.</p>
     * 
     * @param request the request parameters of DescribeBackups  DescribeBackupsRequest
     * @return DescribeBackupsResponse
     */
    CompletableFuture<DescribeBackupsResponse> describeBackups(DescribeBackupsRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is deprecated. Use the new operation <a href="https://help.aliyun.com/document_detail/184226.html">Real-time top key statistics and offline full key analysis</a> instead.</p>
     * 
     * @param request the request parameters of DescribeCacheAnalysisReport  DescribeCacheAnalysisReportRequest
     * @return DescribeCacheAnalysisReportResponse
     */
    CompletableFuture<DescribeCacheAnalysisReportResponse> describeCacheAnalysisReport(DescribeCacheAnalysisReportRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is deprecated. Use the new API operation <a href="https://help.aliyun.com/document_detail/184226.html">Real-time top key statistics and offline full key analysis</a>.</p>
     * 
     * @param request the request parameters of DescribeCacheAnalysisReportList  DescribeCacheAnalysisReportListRequest
     * @return DescribeCacheAnalysisReportListResponse
     */
    CompletableFuture<DescribeCacheAnalysisReportListResponse> describeCacheAnalysisReportList(DescribeCacheAnalysisReportListRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is applicable only to cloud-native instances.</p>
     * 
     * @param request the request parameters of DescribeClusterBackupList  DescribeClusterBackupListRequest
     * @return DescribeClusterBackupListResponse
     */
    CompletableFuture<DescribeClusterBackupListResponse> describeClusterBackupList(DescribeClusterBackupListRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is applicable only to <a href="https://help.aliyun.com/document_detail/188068.html">cloud-native instances</a> in the <a href="https://help.aliyun.com/document_detail/52228.html">cluster architecture</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeClusterMemberInfo  DescribeClusterMemberInfoRequest
     * @return DescribeClusterMemberInfoResponse
     */
    CompletableFuture<DescribeClusterMemberInfoResponse> describeClusterMemberInfo(DescribeClusterMemberInfoRequest request);

    /**
     * @param request the request parameters of DescribeDBInstanceMonitor  DescribeDBInstanceMonitorRequest
     * @return DescribeDBInstanceMonitorResponse
     */
    CompletableFuture<DescribeDBInstanceMonitorResponse> describeDBInstanceMonitor(DescribeDBInstanceMonitorRequest request);

    /**
     * @param request the request parameters of DescribeDBInstanceNetInfo  DescribeDBInstanceNetInfoRequest
     * @return DescribeDBInstanceNetInfoResponse
     */
    CompletableFuture<DescribeDBInstanceNetInfoResponse> describeDBInstanceNetInfo(DescribeDBInstanceNetInfoRequest request);

    /**
     * <b>description</b> :
     * <p><notice>Only cloud-native instances support this operation.</notice></p>
     * 
     * @param request the request parameters of DescribeDBNodeDirectVipInfo  DescribeDBNodeDirectVipInfoRequest
     * @return DescribeDBNodeDirectVipInfoResponse
     */
    CompletableFuture<DescribeDBNodeDirectVipInfoResponse> describeDBNodeDirectVipInfo(DescribeDBNodeDirectVipInfoRequest request);

    /**
     * @param request the request parameters of DescribeDbInstanceConnectivity  DescribeDbInstanceConnectivityRequest
     * @return DescribeDbInstanceConnectivityResponse
     */
    CompletableFuture<DescribeDbInstanceConnectivityResponse> describeDbInstanceConnectivity(DescribeDbInstanceConnectivityRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>To query the information about instances that are not in a dedicated cluster, call <a href="https://help.aliyun.com/document_detail/473779.html">DescribeInstanceAttribute</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDedicatedClusterInstanceList  DescribeDedicatedClusterInstanceListRequest
     * @return DescribeDedicatedClusterInstanceListResponse
     */
    CompletableFuture<DescribeDedicatedClusterInstanceListResponse> describeDedicatedClusterInstanceList(DescribeDedicatedClusterInstanceListRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, the instance must have Transparent Data Encryption (TDE) enabled by using a custom key. For more information about the related operation, see <a href="https://help.aliyun.com/document_detail/473859.html">ModifyInstanceTDE</a>.</p>
     * <blockquote>
     * <p>For more information about TDE and precautions, see <a href="https://help.aliyun.com/document_detail/265913.html">Enable TDE</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeEncryptionKey  DescribeEncryptionKeyRequest
     * @return DescribeEncryptionKeyResponse
     */
    CompletableFuture<DescribeEncryptionKeyResponse> describeEncryptionKey(DescribeEncryptionKeyRequest request);

    /**
     * <b>description</b> :
     * <p>When you invoke <a href="https://help.aliyun.com/document_detail/473859.html">ModifyInstanceTDE</a> to enable transparent data encryption (TDE), you can use custom keys. This operation helps you query the custom keys used by the instance. To create a custom key, invoke the <a href="https://help.aliyun.com/document_detail/28947.html">CreateKey</a> operation of Key Management Service (KMS).</p>
     * <ul>
     * <li>For more information and precautions about transparent data encryption (TDE), see <a href="https://help.aliyun.com/document_detail/265913.html">Enable transparent data encryption (TDE)</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeEncryptionKeyList  DescribeEncryptionKeyListRequest
     * @return DescribeEncryptionKeyListResponse
     */
    CompletableFuture<DescribeEncryptionKeyListResponse> describeEncryptionKeyList(DescribeEncryptionKeyListRequest request);

    /**
     * @param request the request parameters of DescribeEngineVersion  DescribeEngineVersionRequest
     * @return DescribeEngineVersionResponse
     */
    CompletableFuture<DescribeEngineVersionResponse> describeEngineVersion(DescribeEngineVersionRequest request);

    /**
     * @param request the request parameters of DescribeGlobalDistributeCache  DescribeGlobalDistributeCacheRequest
     * @return DescribeGlobalDistributeCacheResponse
     */
    CompletableFuture<DescribeGlobalDistributeCacheResponse> describeGlobalDistributeCache(DescribeGlobalDistributeCacheRequest request);

    /**
     * @param request the request parameters of DescribeGlobalSecurityIPGroup  DescribeGlobalSecurityIPGroupRequest
     * @return DescribeGlobalSecurityIPGroupResponse
     */
    CompletableFuture<DescribeGlobalSecurityIPGroupResponse> describeGlobalSecurityIPGroup(DescribeGlobalSecurityIPGroupRequest request);

    /**
     * @param request the request parameters of DescribeGlobalSecurityIPGroupRelation  DescribeGlobalSecurityIPGroupRelationRequest
     * @return DescribeGlobalSecurityIPGroupRelationResponse
     */
    CompletableFuture<DescribeGlobalSecurityIPGroupRelationResponse> describeGlobalSecurityIPGroupRelation(DescribeGlobalSecurityIPGroupRelationRequest request);

    /**
     * @param request the request parameters of DescribeHistoryEvents  DescribeHistoryEventsRequest
     * @return DescribeHistoryEventsResponse
     */
    CompletableFuture<DescribeHistoryEventsResponse> describeHistoryEvents(DescribeHistoryEventsRequest request);

    /**
     * @param request the request parameters of DescribeHistoryEventsStat  DescribeHistoryEventsStatRequest
     * @return DescribeHistoryEventsStatResponse
     */
    CompletableFuture<DescribeHistoryEventsStatResponse> describeHistoryEventsStat(DescribeHistoryEventsStatRequest request);

    /**
     * <b>description</b> :
     * <p>For the console operation that corresponds to this API, see <a href="https://help.aliyun.com/document_detail/43887.html">Performance monitoring</a>.</p>
     * 
     * @param request the request parameters of DescribeHistoryMonitorValues  DescribeHistoryMonitorValuesRequest
     * @return DescribeHistoryMonitorValuesResponse
     */
    CompletableFuture<DescribeHistoryMonitorValuesResponse> describeHistoryMonitorValues(DescribeHistoryMonitorValuesRequest request);

    /**
     * @param request the request parameters of DescribeHistoryTasks  DescribeHistoryTasksRequest
     * @return DescribeHistoryTasksResponse
     */
    CompletableFuture<DescribeHistoryTasksResponse> describeHistoryTasks(DescribeHistoryTasksRequest request);

    /**
     * @param request the request parameters of DescribeHistoryTasksStat  DescribeHistoryTasksStatRequest
     * @return DescribeHistoryTasksStatResponse
     */
    CompletableFuture<DescribeHistoryTasksStatResponse> describeHistoryTasksStat(DescribeHistoryTasksStatRequest request);

    /**
     * @param request the request parameters of DescribeInspectionScheduleReports  DescribeInspectionScheduleReportsRequest
     * @return DescribeInspectionScheduleReportsResponse
     */
    CompletableFuture<DescribeInspectionScheduleReportsResponse> describeInspectionScheduleReports(DescribeInspectionScheduleReportsRequest request);

    /**
     * @param request the request parameters of DescribeInspectionSchedules  DescribeInspectionSchedulesRequest
     * @return DescribeInspectionSchedulesResponse
     */
    CompletableFuture<DescribeInspectionSchedulesResponse> describeInspectionSchedules(DescribeInspectionSchedulesRequest request);

    /**
     * @param request the request parameters of DescribeInspectionTaskReport  DescribeInspectionTaskReportRequest
     * @return DescribeInspectionTaskReportResponse
     */
    CompletableFuture<DescribeInspectionTaskReportResponse> describeInspectionTaskReport(DescribeInspectionTaskReportRequest request);

    /**
     * @param request the request parameters of DescribeInspectionTasks  DescribeInspectionTasksRequest
     * @return DescribeInspectionTasksResponse
     */
    CompletableFuture<DescribeInspectionTasksResponse> describeInspectionTasks(DescribeInspectionTasksRequest request);

    /**
     * @param request the request parameters of DescribeInstanceAttribute  DescribeInstanceAttributeRequest
     * @return DescribeInstanceAttributeResponse
     */
    CompletableFuture<DescribeInstanceAttributeResponse> describeInstanceAttribute(DescribeInstanceAttributeRequest request);

    /**
     * @param request the request parameters of DescribeInstanceAutoRenewalAttribute  DescribeInstanceAutoRenewalAttributeRequest
     * @return DescribeInstanceAutoRenewalAttributeResponse
     */
    CompletableFuture<DescribeInstanceAutoRenewalAttributeResponse> describeInstanceAutoRenewalAttribute(DescribeInstanceAutoRenewalAttributeRequest request);

    /**
     * @param request the request parameters of DescribeInstanceConfig  DescribeInstanceConfigRequest
     * @return DescribeInstanceConfigResponse
     */
    CompletableFuture<DescribeInstanceConfigResponse> describeInstanceConfig(DescribeInstanceConfigRequest request);

    /**
     * <b>description</b> :
     * <p>For more information about multiple load balancers, see.</p>
     * 
     * @param request the request parameters of DescribeInstanceMultiVIP  DescribeInstanceMultiVIPRequest
     * @return DescribeInstanceMultiVIPResponse
     */
    CompletableFuture<DescribeInstanceMultiVIPResponse> describeInstanceMultiVIP(DescribeInstanceMultiVIPRequest request);

    /**
     * @param request the request parameters of DescribeInstanceSSL  DescribeInstanceSSLRequest
     * @return DescribeInstanceSSLResponse
     */
    CompletableFuture<DescribeInstanceSSLResponse> describeInstanceSSL(DescribeInstanceSSLRequest request);

    /**
     * <b>description</b> :
     * <p>For detailed information and precautions about Transparent Data Encryption (TDE), see <a href="https://help.aliyun.com/document_detail/265913.html">Enable TDE</a>.</p>
     * <blockquote>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/473859.html">ModifyInstanceTDE</a> to enable or disable TDE.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeInstanceTDEStatus  DescribeInstanceTDEStatusRequest
     * @return DescribeInstanceTDEStatusResponse
     */
    CompletableFuture<DescribeInstanceTDEStatusResponse> describeInstanceTDEStatus(DescribeInstanceTDEStatusRequest request);

    /**
     * @param request the request parameters of DescribeInstances  DescribeInstancesRequest
     * @return DescribeInstancesResponse
     */
    CompletableFuture<DescribeInstancesResponse> describeInstances(DescribeInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>If you do not specify request parameters, the overview information of all instances is returned.</p>
     * <blockquote>
     * <p>The response of this operation is not paginated.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeInstancesOverview  DescribeInstancesOverviewRequest
     * @return DescribeInstancesOverviewResponse
     */
    CompletableFuture<DescribeInstancesOverviewResponse> describeInstancesOverview(DescribeInstancesOverviewRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/473771.html">EnableAdditionalBandwidth</a> operation to purchase bandwidth for an instance.</p>
     * 
     * @param request the request parameters of DescribeIntranetAttribute  DescribeIntranetAttributeRequest
     * @return DescribeIntranetAttributeResponse
     */
    CompletableFuture<DescribeIntranetAttributeResponse> describeIntranetAttribute(DescribeIntranetAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is supported only by instances that use the cluster or read/write splitting architecture.</p>
     * 
     * @param request the request parameters of DescribeLogicInstanceTopology  DescribeLogicInstanceTopologyRequest
     * @return DescribeLogicInstanceTopologyResponse
     */
    CompletableFuture<DescribeLogicInstanceTopologyResponse> describeLogicInstanceTopology(DescribeLogicInstanceTopologyRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>To improve user experience, the ApsaraDB for Tair (Redis® OSS-Compatible) database has upgraded its performance monitoring feature, and this API operation will be taken offline. For more information, see <a href="https://help.aliyun.com/document_detail/189893.html">Notice: The DescribeMonitorItems API operation for ApsaraDB for Tair (Redis® OSS-Compatible) is taken offline</a>.
     * After you invoke this API operation to obtain the list of monitoring metrics, you can invoke the <a href="https://help.aliyun.com/document_detail/473827.html">DescribeHistoryMonitorValues</a> API operation to query the historical monitoring information of the instance.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeMonitorItems  DescribeMonitorItemsRequest
     * @return DescribeMonitorItemsResponse
     */
    CompletableFuture<DescribeMonitorItemsResponse> describeMonitorItems(DescribeMonitorItemsRequest request);

    /**
     * @param request the request parameters of DescribeParameterGroup  DescribeParameterGroupRequest
     * @return DescribeParameterGroupResponse
     */
    CompletableFuture<DescribeParameterGroupResponse> describeParameterGroup(DescribeParameterGroupRequest request);

    /**
     * @param request the request parameters of DescribeParameterGroupSupportParam  DescribeParameterGroupSupportParamRequest
     * @return DescribeParameterGroupSupportParamResponse
     */
    CompletableFuture<DescribeParameterGroupSupportParamResponse> describeParameterGroupSupportParam(DescribeParameterGroupSupportParamRequest request);

    /**
     * @param request the request parameters of DescribeParameterGroupTemplateList  DescribeParameterGroupTemplateListRequest
     * @return DescribeParameterGroupTemplateListResponse
     */
    CompletableFuture<DescribeParameterGroupTemplateListResponse> describeParameterGroupTemplateList(DescribeParameterGroupTemplateListRequest request);

    /**
     * @param request the request parameters of DescribeParameterGroups  DescribeParameterGroupsRequest
     * @return DescribeParameterGroupsResponse
     */
    CompletableFuture<DescribeParameterGroupsResponse> describeParameterGroups(DescribeParameterGroupsRequest request);

    /**
     * @param request the request parameters of DescribeParameterModificationHistory  DescribeParameterModificationHistoryRequest
     * @return DescribeParameterModificationHistoryResponse
     */
    CompletableFuture<DescribeParameterModificationHistoryResponse> describeParameterModificationHistory(DescribeParameterModificationHistoryRequest request);

    /**
     * <b>description</b> :
     * <p>After you call this operation to query the parameter list and default values, you can call the <a href="https://help.aliyun.com/document_detail/473844.html">ModifyInstanceConfig</a> operation to modify the parameters of the instance based on your business requirements.</p>
     * 
     * @param request the request parameters of DescribeParameterTemplates  DescribeParameterTemplatesRequest
     * @return DescribeParameterTemplatesResponse
     */
    CompletableFuture<DescribeParameterTemplatesResponse> describeParameterTemplates(DescribeParameterTemplatesRequest request);

    /**
     * @param request the request parameters of DescribeParameters  DescribeParametersRequest
     * @return DescribeParametersResponse
     */
    CompletableFuture<DescribeParametersResponse> describeParameters(DescribeParametersRequest request);

    /**
     * @param request the request parameters of DescribePrice  DescribePriceRequest
     * @return DescribePriceResponse
     */
    CompletableFuture<DescribePriceResponse> describePrice(DescribePriceRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * @param request the request parameters of DescribeRoleZoneInfo  DescribeRoleZoneInfoRequest
     * @return DescribeRoleZoneInfoResponse
     */
    CompletableFuture<DescribeRoleZoneInfoResponse> describeRoleZoneInfo(DescribeRoleZoneInfoRequest request);

    /**
     * <b>description</b> :
     * <p>For the corresponding console operation, see <a href="https://help.aliyun.com/document_detail/101713.html">Query running logs</a>.
     * The maximum number of calls to the DescribeRunningLogRecords operation is 100 per minute.</p>
     * 
     * @param request the request parameters of DescribeRunningLogRecords  DescribeRunningLogRecordsRequest
     * @return DescribeRunningLogRecordsResponse
     */
    CompletableFuture<DescribeRunningLogRecordsResponse> describeRunningLogRecords(DescribeRunningLogRecordsRequest request);

    /**
     * @param request the request parameters of DescribeSecurityGroupConfiguration  DescribeSecurityGroupConfigurationRequest
     * @return DescribeSecurityGroupConfigurationResponse
     */
    CompletableFuture<DescribeSecurityGroupConfigurationResponse> describeSecurityGroupConfiguration(DescribeSecurityGroupConfigurationRequest request);

    /**
     * @param request the request parameters of DescribeSecurityIps  DescribeSecurityIpsRequest
     * @return DescribeSecurityIpsResponse
     */
    CompletableFuture<DescribeSecurityIpsResponse> describeSecurityIps(DescribeSecurityIpsRequest request);

    /**
     * <b>description</b> :
     * <p>You can invoke this operation to query whether the authorization of the service-linked role named AliyunServiceRoleForKvstore is associated with the ApsaraDB Tair (Redis® OSS-Compatible) database within the current account. For more information, see <a href="https://help.aliyun.com/document_detail/184337.html">Service-linked role associated with ApsaraDB Tair (Redis® OSS-Compatible)</a>.</p>
     * 
     * @param request the request parameters of DescribeServiceLinkedRoleExists  DescribeServiceLinkedRoleExistsRequest
     * @return DescribeServiceLinkedRoleExistsResponse
     */
    CompletableFuture<DescribeServiceLinkedRoleExistsResponse> describeServiceLinkedRoleExists(DescribeServiceLinkedRoleExistsRequest request);

    /**
     * <b>description</b> :
     * <p>For the corresponding console operation, see <a href="https://help.aliyun.com/document_detail/95874.html">Query slow logs</a>.
     * The rate limit for the DescribeSlowLogRecords operation is 100 calls per minute.</p>
     * 
     * @param request the request parameters of DescribeSlowLogRecords  DescribeSlowLogRecordsRequest
     * @return DescribeSlowLogRecordsResponse
     */
    CompletableFuture<DescribeSlowLogRecordsResponse> describeSlowLogRecords(DescribeSlowLogRecordsRequest request);

    /**
     * @param request the request parameters of DescribeTags  DescribeTagsRequest
     * @return DescribeTagsResponse
     */
    CompletableFuture<DescribeTagsResponse> describeTags(DescribeTagsRequest request);

    /**
     * @param request the request parameters of DescribeTairAIGatewayInstances  DescribeTairAIGatewayInstancesRequest
     * @return DescribeTairAIGatewayInstancesResponse
     */
    CompletableFuture<DescribeTairAIGatewayInstancesResponse> describeTairAIGatewayInstances(DescribeTairAIGatewayInstancesRequest request);

    /**
     * @param request the request parameters of DescribeTairAIGatewayParameters  DescribeTairAIGatewayParametersRequest
     * @return DescribeTairAIGatewayParametersResponse
     */
    CompletableFuture<DescribeTairAIGatewayParametersResponse> describeTairAIGatewayParameters(DescribeTairAIGatewayParametersRequest request);

    /**
     * @param request the request parameters of DescribeTairAIGatewayPluginSwitch  DescribeTairAIGatewayPluginSwitchRequest
     * @return DescribeTairAIGatewayPluginSwitchResponse
     */
    CompletableFuture<DescribeTairAIGatewayPluginSwitchResponse> describeTairAIGatewayPluginSwitch(DescribeTairAIGatewayPluginSwitchRequest request);

    /**
     * @param request the request parameters of DescribeTairKVCacheCustomInstanceAttribute  DescribeTairKVCacheCustomInstanceAttributeRequest
     * @return DescribeTairKVCacheCustomInstanceAttributeResponse
     */
    CompletableFuture<DescribeTairKVCacheCustomInstanceAttributeResponse> describeTairKVCacheCustomInstanceAttribute(DescribeTairKVCacheCustomInstanceAttributeRequest request);

    /**
     * @param request the request parameters of DescribeTairKVCacheCustomInstanceHistoryMonitorValues  DescribeTairKVCacheCustomInstanceHistoryMonitorValuesRequest
     * @return DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponse
     */
    CompletableFuture<DescribeTairKVCacheCustomInstanceHistoryMonitorValuesResponse> describeTairKVCacheCustomInstanceHistoryMonitorValues(DescribeTairKVCacheCustomInstanceHistoryMonitorValuesRequest request);

    /**
     * @param request the request parameters of DescribeTairKVCacheCustomInstances  DescribeTairKVCacheCustomInstancesRequest
     * @return DescribeTairKVCacheCustomInstancesResponse
     */
    CompletableFuture<DescribeTairKVCacheCustomInstancesResponse> describeTairKVCacheCustomInstances(DescribeTairKVCacheCustomInstancesRequest request);

    /**
     * @param request the request parameters of DescribeTairKVCacheInferInstanceAttribute  DescribeTairKVCacheInferInstanceAttributeRequest
     * @return DescribeTairKVCacheInferInstanceAttributeResponse
     */
    CompletableFuture<DescribeTairKVCacheInferInstanceAttributeResponse> describeTairKVCacheInferInstanceAttribute(DescribeTairKVCacheInferInstanceAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>This operation queries inference operator instances, virtual cluster instances, and cache service instances of Tair KVCache.</p>
     * 
     * @param request the request parameters of DescribeTairKVCacheInferInstances  DescribeTairKVCacheInferInstancesRequest
     * @return DescribeTairKVCacheInferInstancesResponse
     */
    CompletableFuture<DescribeTairKVCacheInferInstancesResponse> describeTairKVCacheInferInstances(DescribeTairKVCacheInferInstancesRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>When you call this operation, you must specify the <code>InstanceId</code> parameter.</li>
     * <li>The response includes the basic information of each table, such as the table ID, name, bandwidth, and maximum number of connections.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeTairSkvDdbTable  DescribeTairSkvDdbTableRequest
     * @return DescribeTairSkvDdbTableResponse
     */
    CompletableFuture<DescribeTairSkvDdbTableResponse> describeTairSkvDdbTable(DescribeTairSkvDdbTableRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation queries the table schema and configuration information of a Tair Serverless KV table instance.</li>
     * <li>You must specify the <code>InstanceId</code> parameter when you call this operation, and set it to the ID of the instance that you want to query.</li>
     * <li>The <code>BackupId</code> parameter specifies the backup set of the table to query.</li>
     * <li>The returned data includes the time-to-live (TTL) specifications and detailed table schema definitions.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeTairSkvDdbTableSchema  DescribeTairSkvDdbTableSchemaRequest
     * @return DescribeTairSkvDdbTableSchemaResponse
     */
    CompletableFuture<DescribeTairSkvDdbTableSchemaResponse> describeTairSkvDdbTableSchema(DescribeTairSkvDdbTableSchemaRequest request);

    /**
     * @param request the request parameters of DescribeTaskDetail  DescribeTaskDetailRequest
     * @return DescribeTaskDetailResponse
     */
    CompletableFuture<DescribeTaskDetailResponse> describeTaskDetail(DescribeTaskDetailRequest request);

    /**
     * @param request the request parameters of DescribeZones  DescribeZonesRequest
     * @return DescribeZonesResponse
     */
    CompletableFuture<DescribeZonesResponse> describeZones(DescribeZonesRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, the instances must exist in the recycle bin. For more information, see <a href="https://help.aliyun.com/document_detail/86114.html">Instance recycle bin</a>.</p>
     * <blockquote>
     * <p>After you call this operation, the instances and their data backups in the recycle bin are permanently deleted.
     * <danger>After this operation is performed, the data of the instances is permanently deleted and cannot be recovered. Proceed with caution.</danger></p>
     * </blockquote>
     * 
     * @param request the request parameters of DestroyInstance  DestroyInstanceRequest
     * @return DestroyInstanceResponse
     */
    CompletableFuture<DestroyInstanceResponse> destroyInstance(DestroyInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>If you enable the elastic bandwidth scaling feature for the instance when calling this operation, the elastic bandwidth scaling feature takes precedence. During an elastic bandwidth scale-down, the bandwidth reverts to the default bandwidth of the instance type. For more information about the limits, billing, and FAQs of this feature, see <a href="https://help.aliyun.com/document_detail/102588.html">Adjust instance bandwidth</a>.</p>
     * <blockquote>
     * <p>Before calling this operation, you can call <a href="https://help.aliyun.com/document_detail/473782.html">DescribeRoleZoneInfo</a> to query the current bandwidth of each data node in the instance.</p>
     * </blockquote>
     * 
     * @param request the request parameters of EnableAdditionalBandwidth  EnableAdditionalBandwidthRequest
     * @return EnableAdditionalBandwidthResponse
     */
    CompletableFuture<EnableAdditionalBandwidthResponse> enableAdditionalBandwidth(EnableAdditionalBandwidthRequest request);

    /**
     * <b>description</b> :
     * <p>For the corresponding console operation, see <a href="https://help.aliyun.com/document_detail/43881.html">Clear data</a>.</p>
     * <blockquote>
     * <p>Expired keys cannot be recovered after they are cleared. Use this API operation with caution.</p>
     * </blockquote>
     * 
     * @param request the request parameters of FlushExpireKeys  FlushExpireKeysRequest
     * @return FlushExpireKeysResponse
     */
    CompletableFuture<FlushExpireKeysResponse> flushExpireKeys(FlushExpireKeysRequest request);

    /**
     * <b>description</b> :
     * <p>For the corresponding operation in the console, refer to <a href="https://help.aliyun.com/document_detail/43881.html">Clear data</a>.</p>
     * <blockquote>
     * <p>Before calling this API to delete data, back up your data or confirm that no backup is required.</p>
     * </blockquote>
     * 
     * @param request the request parameters of FlushInstance  FlushInstanceRequest
     * @return FlushInstanceResponse
     */
    CompletableFuture<FlushInstanceResponse> flushInstance(FlushInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>An ApsaraDB Tair (Redis® OSS-Compatible) instance supports 256 databases, from DB0 to DB255. Each database does not have a separate memory usage limit. The memory capacity available for a database is constrained by the total memory of the instance. You can use the <code>SELECT</code> command to switch databases. For more information, see <a href="https://help.aliyun.com/document_detail/38688.html">Tair DB</a>.</p>
     * <blockquote>
     * <p>This operation is supported only by cloud-native instances (formerly cloud disk instances) in a cluster architecture.</p>
     * </blockquote>
     * 
     * @param request the request parameters of FlushInstanceForDB  FlushInstanceForDBRequest
     * @return FlushInstanceForDBResponse
     */
    CompletableFuture<FlushInstanceForDBResponse> flushInstanceForDB(FlushInstanceForDBRequest request);

    /**
     * @param request the request parameters of GrantAccountPrivilege  GrantAccountPrivilegeRequest
     * @return GrantAccountPrivilegeResponse
     */
    CompletableFuture<GrantAccountPrivilegeResponse> grantAccountPrivilege(GrantAccountPrivilegeRequest request);

    /**
     * <b>description</b> :
     * <p>The log management feature of the ApsaraDB for Tair (Redis® OSS-Compatible) database requires resources from <a href="https://help.aliyun.com/document_detail/48869.html">Simple Log Service</a>. Before using the log management feature, invoke this operation to associate the service-linked role named AliyunServiceRoleForKvstore with the ApsaraDB for Tair (Redis® OSS-Compatible) database and grant the required authorization. For more information, see <a href="https://help.aliyun.com/document_detail/184337.html">Service-linked role for ApsaraDB for Tair (Redis® OSS-Compatible)</a>.</p>
     * 
     * @param request the request parameters of InitializeKvstorePermission  InitializeKvstorePermissionRequest
     * @return InitializeKvstorePermissionResponse
     */
    CompletableFuture<InitializeKvstorePermissionResponse> initializeKvstorePermission(InitializeKvstorePermissionRequest request);

    /**
     * <b>description</b> :
     * <p>For the corresponding console operations of this API, refer to <a href="https://help.aliyun.com/document_detail/119160.html">Filter instances by tag</a> and <a href="https://help.aliyun.com/document_detail/134038.html">View tags bound to an instance</a>.</p>
     * 
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of LockDBInstanceWrite  LockDBInstanceWriteRequest
     * @return LockDBInstanceWriteResponse
     */
    CompletableFuture<LockDBInstanceWriteResponse> lockDBInstanceWrite(LockDBInstanceWriteRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>When you call this operation, the specified node is shut down. The instance automatically triggers a primary/secondary switchover to promote the secondary node to the primary node.</li>
     * <li>The node with the simulated failure automatically recovers later.</li>
     * <li>This operation is not supported for single-node (single-replica) instances.</li>
     * </ul>
     * 
     * @param request the request parameters of MasterNodeShutDownFailOver  MasterNodeShutDownFailOverRequest
     * @return MasterNodeShutDownFailOverResponse
     */
    CompletableFuture<MasterNodeShutDownFailOverResponse> masterNodeShutDownFailOver(MasterNodeShutDownFailOverRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, you must release the public endpoint. For more information, see <a href="https://help.aliyun.com/document_detail/106272.html">Migrate an instance across zones</a>.</p>
     * <blockquote>
     * <ul>
     * <li>If the instance was switched from the classic network to a VPC and the classic network endpoint is retained, you must wait until the classic network endpoint expires and is released before you can migrate the instance across zones.</li>
     * <li>After the migration, the endpoint of the instance remains unchanged, but the virtual IP address (VIP) changes. Use the endpoint instead of the VIP to connect to the instance in your business applications.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of MigrateToOtherZone  MigrateToOtherZoneRequest
     * @return MigrateToOtherZoneResponse
     */
    CompletableFuture<MigrateToOtherZoneResponse> migrateToOtherZone(MigrateToOtherZoneRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation supports only instances that are compatible with Redis 4.0 or later.</p>
     * 
     * @param request the request parameters of ModifyAccountDescription  ModifyAccountDescriptionRequest
     * @return ModifyAccountDescriptionResponse
     */
    CompletableFuture<ModifyAccountDescriptionResponse> modifyAccountDescription(ModifyAccountDescriptionRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is supported only for Tair Serverless KV instances.</p>
     * 
     * @param request the request parameters of ModifyAccountParameter  ModifyAccountParameterRequest
     * @return ModifyAccountParameterResponse
     */
    CompletableFuture<ModifyAccountParameterResponse> modifyAccountParameter(ModifyAccountParameterRequest request);

    /**
     * @param request the request parameters of ModifyAccountPassword  ModifyAccountPasswordRequest
     * @return ModifyAccountPasswordResponse
     */
    CompletableFuture<ModifyAccountPasswordResponse> modifyAccountPassword(ModifyAccountPasswordRequest request);

    /**
     * @param request the request parameters of ModifyActiveOperationMaintainConfig  ModifyActiveOperationMaintainConfigRequest
     * @return ModifyActiveOperationMaintainConfigResponse
     */
    CompletableFuture<ModifyActiveOperationMaintainConfigResponse> modifyActiveOperationMaintainConfig(ModifyActiveOperationMaintainConfigRequest request);

    /**
     * <b>description</b> :
     * <p>O&amp;M events for ApsaraDB for Tair (Redis® OSS-Compatible) database instances, such as instance migration and version upgrades, are notified through SMS, voice calls, emails, or internal messages, as well as in the console. You can invoke this operation to modify the scheduled switchover time. Alternatively, you can modify it in the console. For more information, see <a href="https://help.aliyun.com/document_detail/187022.html">Query or manage pending events</a>.</p>
     * 
     * @param request the request parameters of ModifyActiveOperationTask  ModifyActiveOperationTaskRequest
     * @return ModifyActiveOperationTaskResponse
     */
    CompletableFuture<ModifyActiveOperationTaskResponse> modifyActiveOperationTask(ModifyActiveOperationTaskRequest request);

    /**
     * @param request the request parameters of ModifyActiveOperationTasks  ModifyActiveOperationTasksRequest
     * @return ModifyActiveOperationTasksResponse
     */
    CompletableFuture<ModifyActiveOperationTasksResponse> modifyActiveOperationTasks(ModifyActiveOperationTasksRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/54532.html">pricing</a> of audit logs.</p>
     * 
     * @param request the request parameters of ModifyAuditLogConfig  ModifyAuditLogConfigRequest
     * @return ModifyAuditLogConfigResponse
     */
    CompletableFuture<ModifyAuditLogConfigResponse> modifyAuditLogConfig(ModifyAuditLogConfigRequest request);

    /**
     * @param request the request parameters of ModifyBackupExpireTime  ModifyBackupExpireTimeRequest
     * @return ModifyBackupExpireTimeResponse
     */
    CompletableFuture<ModifyBackupExpireTimeResponse> modifyBackupExpireTime(ModifyBackupExpireTimeRequest request);

    /**
     * @param request the request parameters of ModifyBackupPolicy  ModifyBackupPolicyRequest
     * @return ModifyBackupPolicyResponse
     */
    CompletableFuture<ModifyBackupPolicyResponse> modifyBackupPolicy(ModifyBackupPolicyRequest request);

    /**
     * @param request the request parameters of ModifyDBInstanceAutoUpgrade  ModifyDBInstanceAutoUpgradeRequest
     * @return ModifyDBInstanceAutoUpgradeResponse
     */
    CompletableFuture<ModifyDBInstanceAutoUpgradeResponse> modifyDBInstanceAutoUpgrade(ModifyDBInstanceAutoUpgradeRequest request);

    /**
     * <b>description</b> :
     * <p>For the corresponding console operation, see <a href="https://help.aliyun.com/document_detail/85683.html">Modify endpoints</a>.</p>
     * 
     * @param request the request parameters of ModifyDBInstanceConnectionString  ModifyDBInstanceConnectionStringRequest
     * @return ModifyDBInstanceConnectionStringResponse
     */
    CompletableFuture<ModifyDBInstanceConnectionStringResponse> modifyDBInstanceConnectionString(ModifyDBInstanceConnectionStringRequest request);

    /**
     * @param request the request parameters of ModifyDBInstanceMonitor  ModifyDBInstanceMonitorRequest
     * @return ModifyDBInstanceMonitorResponse
     */
    CompletableFuture<ModifyDBInstanceMonitorResponse> modifyDBInstanceMonitor(ModifyDBInstanceMonitorRequest request);

    /**
     * @param request the request parameters of ModifyEventInfo  ModifyEventInfoRequest
     * @return ModifyEventInfoResponse
     */
    CompletableFuture<ModifyEventInfoResponse> modifyEventInfo(ModifyEventInfoRequest request);

    /**
     * @param request the request parameters of ModifyGlobalSecurityIPGroup  ModifyGlobalSecurityIPGroupRequest
     * @return ModifyGlobalSecurityIPGroupResponse
     */
    CompletableFuture<ModifyGlobalSecurityIPGroupResponse> modifyGlobalSecurityIPGroup(ModifyGlobalSecurityIPGroupRequest request);

    /**
     * @param request the request parameters of ModifyGlobalSecurityIPGroupName  ModifyGlobalSecurityIPGroupNameRequest
     * @return ModifyGlobalSecurityIPGroupNameResponse
     */
    CompletableFuture<ModifyGlobalSecurityIPGroupNameResponse> modifyGlobalSecurityIPGroupName(ModifyGlobalSecurityIPGroupNameRequest request);

    /**
     * @param request the request parameters of ModifyGlobalSecurityIPGroupRelation  ModifyGlobalSecurityIPGroupRelationRequest
     * @return ModifyGlobalSecurityIPGroupRelationResponse
     */
    CompletableFuture<ModifyGlobalSecurityIPGroupRelationResponse> modifyGlobalSecurityIPGroupRelation(ModifyGlobalSecurityIPGroupRelationRequest request);

    /**
     * @param request the request parameters of ModifyInspectionSchedule  ModifyInspectionScheduleRequest
     * @return ModifyInspectionScheduleResponse
     */
    CompletableFuture<ModifyInspectionScheduleResponse> modifyInspectionSchedule(ModifyInspectionScheduleRequest request);

    /**
     * @param request the request parameters of ModifyInstanceAttribute  ModifyInstanceAttributeRequest
     * @return ModifyInstanceAttributeResponse
     */
    CompletableFuture<ModifyInstanceAttributeResponse> modifyInstanceAttribute(ModifyInstanceAttributeRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Auto-renewal is triggered 7 days before the instance expires.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyInstanceAutoRenewalAttribute  ModifyInstanceAutoRenewalAttributeRequest
     * @return ModifyInstanceAutoRenewalAttributeResponse
     */
    CompletableFuture<ModifyInstanceAutoRenewalAttributeResponse> modifyInstanceAutoRenewalAttribute(ModifyInstanceAutoRenewalAttributeRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before calling this operation, make sure that you fully understand the bandwidth billing method and pricing of the instance. Tair (Redis® OSS-Compatible) charges hourly fees based on the increased bandwidth and usage duration. Billing standards vary by region. For more information, see <a href="https://help.aliyun.com/document_detail/54532.html">Billable items</a>.</li>
     * <li>An instance or a single shard supports an additional bandwidth increase of up to 6 times the default bandwidth of the original instance, with a maximum increase limit of 192 MB/s. For example, the default bandwidth of a 2 GB standard-architecture Tair memory-optimized instance is 96 MB/s. The bandwidth for this specification can be increased by up to 192 MB/s, resulting in a maximum instance bandwidth of 288 MB/s. The default bandwidth of a 256 MB standard-architecture open-source Redis instance is 10 MB/s. The bandwidth for this specification can be increased by up to 60 MB/s, resulting in a maximum instance bandwidth of 70 MB/s.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyInstanceBandwidth  ModifyInstanceBandwidthRequest
     * @return ModifyInstanceBandwidthResponse
     */
    CompletableFuture<ModifyInstanceBandwidthResponse> modifyInstanceBandwidth(ModifyInstanceBandwidthRequest request);

    /**
     * @param request the request parameters of ModifyInstanceConfig  ModifyInstanceConfigRequest
     * @return ModifyInstanceConfigResponse
     */
    CompletableFuture<ModifyInstanceConfigResponse> modifyInstanceConfig(ModifyInstanceConfigRequest request);

    /**
     * <b>description</b> :
     * <p>For the corresponding console operation, see <a href="https://help.aliyun.com/document_detail/55252.html">Set the maintenance window</a>.</p>
     * 
     * @param request the request parameters of ModifyInstanceMaintainTime  ModifyInstanceMaintainTimeRequest
     * @return ModifyInstanceMaintainTimeResponse
     */
    CompletableFuture<ModifyInstanceMaintainTimeResponse> modifyInstanceMaintainTime(ModifyInstanceMaintainTimeRequest request);

    /**
     * <b>description</b> :
     * <p>For precautions and impacts of this API operation, see <a href="https://help.aliyun.com/document_detail/101764.html">Upgrade the major version</a>.</p>
     * 
     * @param request the request parameters of ModifyInstanceMajorVersion  ModifyInstanceMajorVersionRequest
     * @return ModifyInstanceMajorVersionResponse
     */
    CompletableFuture<ModifyInstanceMajorVersionResponse> modifyInstanceMajorVersion(ModifyInstanceMajorVersionRequest request);

    /**
     * <b>description</b> :
     * <p>The upgrade process varies based on the architecture. For more information, see <a href="https://help.aliyun.com/document_detail/56450.html">Minor engine version upgrade principles</a>.</p>
     * <blockquote>
     * <ul>
     * <li>Before calling this operation, you can call <a href="https://help.aliyun.com/document_detail/473781.html">DescribeEngineVersion</a> to query the current minor engine version of the instance.</li>
     * <li>During an instance switchover or primary/secondary switchover, the instance remains in a read-only state for up to 60 seconds while waiting for data to be fully synchronized. Transient disconnections that last for a few seconds may also occur. Perform the upgrade during off-peak hours and ensure that your application is configured with a reconnection mechanism.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyInstanceMinorVersion  ModifyInstanceMinorVersionRequest
     * @return ModifyInstanceMinorVersionResponse
     */
    CompletableFuture<ModifyInstanceMinorVersionResponse> modifyInstanceMinorVersion(ModifyInstanceMinorVersionRequest request);

    /**
     * <b>description</b> :
     * <p>For the corresponding console operation of this API operation, refer to <a href="https://help.aliyun.com/document_detail/60062.html">Modify the validity period of the original classic network endpoint</a>.</p>
     * <blockquote>
     * <p>For information about how to switch an instance from the classic network to a VPC, refer to <a href="https://help.aliyun.com/document_detail/473797.html">SwitchNetwork</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyInstanceNetExpireTime  ModifyInstanceNetExpireTimeRequest
     * @return ModifyInstanceNetExpireTimeResponse
     */
    CompletableFuture<ModifyInstanceNetExpireTimeResponse> modifyInstanceNetExpireTime(ModifyInstanceNetExpireTimeRequest request);

    /**
     * @param request the request parameters of ModifyInstanceParameter  ModifyInstanceParameterRequest
     * @return ModifyInstanceParameterResponse
     */
    CompletableFuture<ModifyInstanceParameterResponse> modifyInstanceParameter(ModifyInstanceParameterRequest request);

    /**
     * <b>description</b> :
     * <p>For the corresponding console operation, see <a href="https://help.aliyun.com/document_detail/84898.html">Settings for Secure Sockets Layer (SSL) encryption</a>.</p>
     * <blockquote>
     * <p>To specify the minimum SSL version, you can invoke the <a href="https://help.aliyun.com/document_detail/473844.html">ModifyInstanceConfig</a> operation to modify the parameter.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyInstanceSSL  ModifyInstanceSSLRequest
     * @return ModifyInstanceSSLResponse
     */
    CompletableFuture<ModifyInstanceSSLResponse> modifyInstanceSSL(ModifyInstanceSSLRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>For information about the execution process, impacts, feature limits, and billing of changing instance specifications, see <a href="https://help.aliyun.com/document_detail/26353.html">Change the configurations of an instance</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyInstanceSpec  ModifyInstanceSpecRequest
     * @return ModifyInstanceSpecResponse
     */
    CompletableFuture<ModifyInstanceSpecResponse> modifyInstanceSpec(ModifyInstanceSpecRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>For detailed information about Transparent Data Encryption (TDE) and the impacts of enabling it, see <a href="https://help.aliyun.com/document_detail/265913.html">Enable Transparent Data Encryption (TDE)</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyInstanceTDE  ModifyInstanceTDERequest
     * @return ModifyInstanceTDEResponse
     */
    CompletableFuture<ModifyInstanceTDEResponse> modifyInstanceTDE(ModifyInstanceTDERequest request);

    /**
     * <b>description</b> :
     * <p>For information about how to perform this operation in the console, see <a href="https://help.aliyun.com/document_detail/85168.html">Enable password-free access</a>.</p>
     * 
     * @param request the request parameters of ModifyInstanceVpcAuthMode  ModifyInstanceVpcAuthModeRequest
     * @return ModifyInstanceVpcAuthModeResponse
     */
    CompletableFuture<ModifyInstanceVpcAuthModeResponse> modifyInstanceVpcAuthMode(ModifyInstanceVpcAuthModeRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>This operation applies only to instances created in dedicated clusters&lt;props=&quot;china&quot;&gt;. For information about the related console operations and limits, see <a href="https://help.aliyun.com/document_detail/206257.html">Modify bandwidth policies</a>. To adjust the bandwidth of a regular instance, call the <a href="https://help.aliyun.com/document_detail/473771.html">EnableAdditionalBandwidth</a> operation.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyIntranetAttribute  ModifyIntranetAttributeRequest
     * @return ModifyIntranetAttributeResponse
     */
    CompletableFuture<ModifyIntranetAttributeResponse> modifyIntranetAttribute(ModifyIntranetAttributeRequest request);

    /**
     * @param request the request parameters of ModifyParameterGroup  ModifyParameterGroupRequest
     * @return ModifyParameterGroupResponse
     */
    CompletableFuture<ModifyParameterGroupResponse> modifyParameterGroup(ModifyParameterGroupRequest request);

    /**
     * <b>description</b> :
     * <p>You can also perform this operation in the <a href="https://resourcemanager.console.aliyun.com/resource-center">Resource Management</a> console. For more information, see <a href="https://help.aliyun.com/document_detail/94487.html">Transfer resources across resource groups</a>.</p>
     * <blockquote>
     * <p>A resource group is a mechanism for grouping and managing resources within an Alibaba Cloud account. Resource groups help you simplify resource grouping and authorization management within a single Alibaba Cloud account. For more information, see <a href="https://help.aliyun.com/document_detail/94475.html">What is Resource Management</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyResourceGroup  ModifyResourceGroupRequest
     * @return ModifyResourceGroupResponse
     */
    CompletableFuture<ModifyResourceGroupResponse> modifyResourceGroup(ModifyResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Calling this operation overwrites the existing security groups in the instance whitelist and adds the security groups specified in the <strong>SecurityGroupId</strong> parameter to the whitelist. For the corresponding console operation, see <a href="https://help.aliyun.com/document_detail/148267.html">Add security groups</a>.</p>
     * 
     * @param request the request parameters of ModifySecurityGroupConfiguration  ModifySecurityGroupConfigurationRequest
     * @return ModifySecurityGroupConfigurationResponse
     */
    CompletableFuture<ModifySecurityGroupConfigurationResponse> modifySecurityGroupConfiguration(ModifySecurityGroupConfigurationRequest request);

    /**
     * <b>description</b> :
     * <p>For the corresponding console operation, see <a href="https://help.aliyun.com/document_detail/56464.html">Configure the IP whitelist</a>.</p>
     * 
     * @param request the request parameters of ModifySecurityIps  ModifySecurityIpsRequest
     * @return ModifySecurityIpsResponse
     */
    CompletableFuture<ModifySecurityIpsResponse> modifySecurityIps(ModifySecurityIpsRequest request);

    /**
     * @param request the request parameters of ModifyTairAIGatewayParameter  ModifyTairAIGatewayParameterRequest
     * @return ModifyTairAIGatewayParameterResponse
     */
    CompletableFuture<ModifyTairAIGatewayParameterResponse> modifyTairAIGatewayParameter(ModifyTairAIGatewayParameterRequest request);

    /**
     * @param request the request parameters of ModifyTairAIGatewayPluginSwitch  ModifyTairAIGatewayPluginSwitchRequest
     * @return ModifyTairAIGatewayPluginSwitchResponse
     */
    CompletableFuture<ModifyTairAIGatewayPluginSwitchResponse> modifyTairAIGatewayPluginSwitch(ModifyTairAIGatewayPluginSwitchRequest request);

    /**
     * @param request the request parameters of ModifyTairKVCacheCustomInstanceAttribute  ModifyTairKVCacheCustomInstanceAttributeRequest
     * @return ModifyTairKVCacheCustomInstanceAttributeResponse
     */
    CompletableFuture<ModifyTairKVCacheCustomInstanceAttributeResponse> modifyTairKVCacheCustomInstanceAttribute(ModifyTairKVCacheCustomInstanceAttributeRequest request);

    /**
     * @param request the request parameters of ModifyTaskInfo  ModifyTaskInfoRequest
     * @return ModifyTaskInfoResponse
     */
    CompletableFuture<ModifyTaskInfoResponse> modifyTaskInfo(ModifyTaskInfoRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is supported only for instances that use the cluster architecture in proxy mode or the read/write splitting architecture. For more information, see <a href="https://help.aliyun.com/document_detail/164224.html">Restart or rebuild proxy nodes</a>.</p>
     * 
     * @param request the request parameters of RebootProxy  RebootProxyRequest
     * @return RebootProxyResponse
     */
    CompletableFuture<RebootProxyResponse> rebootProxy(RebootProxyRequest request);

    /**
     * <b>description</b> :
     * <p>Clients can use the direct connection endpoint to bypass proxies and connect to an ApsaraDB for Tair (Redis® OSS-Compatible) database cluster in the same way as connecting to a native Redis cluster. This reduces link overhead and further improves the response speed of the instance. For more information, see <a href="https://help.aliyun.com/document_detail/146901.html">Enable direct connection access</a>.</p>
     * 
     * @param request the request parameters of ReleaseDirectConnection  ReleaseDirectConnectionRequest
     * @return ReleaseDirectConnectionResponse
     */
    CompletableFuture<ReleaseDirectConnectionResponse> releaseDirectConnection(ReleaseDirectConnectionRequest request);

    /**
     * <b>description</b> :
     * <p>For the corresponding console operation, see <a href="https://help.aliyun.com/document_detail/125424.html">Release a public endpoint</a>.</p>
     * 
     * @param request the request parameters of ReleaseInstancePublicConnection  ReleaseInstancePublicConnectionRequest
     * @return ReleaseInstancePublicConnectionResponse
     */
    CompletableFuture<ReleaseInstancePublicConnectionResponse> releaseInstancePublicConnection(ReleaseInstancePublicConnectionRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>After the conversion is complete, the child instance becomes a regular instance. You can find and manage the instance in the instance list of the corresponding region.</p>
     * </blockquote>
     * 
     * @param request the request parameters of RemoveSubInstance  RemoveSubInstanceRequest
     * @return RemoveSubInstanceResponse
     */
    CompletableFuture<RemoveSubInstanceResponse> removeSubInstance(RemoveSubInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is deprecated. You can purchase bandwidth for an instance by using the console (<a href="https://help.aliyun.com/document_detail/102588.html">Adjust instance bandwidth</a>) or by calling the <a href="https://help.aliyun.com/document_detail/473771.html">EnableAdditionalBandwidth</a> operation.</p>
     * 
     * @param request the request parameters of RenewAdditionalBandwidth  RenewAdditionalBandwidthRequest
     * @return RenewAdditionalBandwidthResponse
     */
    CompletableFuture<RenewAdditionalBandwidthResponse> renewAdditionalBandwidth(RenewAdditionalBandwidthRequest request);

    /**
     * @param request the request parameters of RenewInstance  RenewInstanceRequest
     * @return RenewInstanceResponse
     */
    CompletableFuture<RenewInstanceResponse> renewInstance(RenewInstanceRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is supported only by Redis instances of version 4.0 or later.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ResetAccountPassword  ResetAccountPasswordRequest
     * @return ResetAccountPasswordResponse
     */
    CompletableFuture<ResetAccountPasswordResponse> resetAccountPassword(ResetAccountPasswordRequest request);

    /**
     * @param request the request parameters of ResetTairKVCacheCustomInstancePassword  ResetTairKVCacheCustomInstancePasswordRequest
     * @return ResetTairKVCacheCustomInstancePasswordResponse
     */
    CompletableFuture<ResetTairKVCacheCustomInstancePasswordResponse> resetTairKVCacheCustomInstancePassword(ResetTairKVCacheCustomInstancePasswordRequest request);

    /**
     * @param request the request parameters of ResizeTairKVCacheCustomInstanceDisk  ResizeTairKVCacheCustomInstanceDiskRequest
     * @return ResizeTairKVCacheCustomInstanceDiskResponse
     */
    CompletableFuture<ResizeTairKVCacheCustomInstanceDiskResponse> resizeTairKVCacheCustomInstanceDisk(ResizeTairKVCacheCustomInstanceDiskRequest request);

    /**
     * @param request the request parameters of RestartInstance  RestartInstanceRequest
     * @return RestartInstanceResponse
     */
    CompletableFuture<RestartInstanceResponse> restartInstance(RestartInstanceRequest request);

    /**
     * @param request the request parameters of RestartTairKVCacheCustomInstance  RestartTairKVCacheCustomInstanceRequest
     * @return RestartTairKVCacheCustomInstanceResponse
     */
    CompletableFuture<RestartTairKVCacheCustomInstanceResponse> restartTairKVCacheCustomInstance(RestartTairKVCacheCustomInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>If your instance is a Tair (Enterprise Edition) memory-optimized instance with the classic architecture, you can call this operation to restore specified keys in the current instance to a specific point in time accurate to seconds. This enables more fine-grained data restoration.</p>
     * <ul>
     * <li>For other types of instances, call the <a href="https://help.aliyun.com/document_detail/473757.html">CreateInstance</a> or <a href="https://help.aliyun.com/document_detail/473770.html">CreateTairInstance</a> operation to restore backup data to a new instance.</li>
     * </ul>
     * 
     * @param request the request parameters of RestoreInstance  RestoreInstanceRequest
     * @return RestoreInstanceResponse
     */
    CompletableFuture<RestoreInstanceResponse> restoreInstance(RestoreInstanceRequest request);

    /**
     * @param request the request parameters of RetryInspectionTask  RetryInspectionTaskRequest
     * @return RetryInspectionTaskResponse
     */
    CompletableFuture<RetryInspectionTaskResponse> retryInspectionTask(RetryInspectionTaskRequest request);

    /**
     * @param request the request parameters of StartTairKVCacheCustomInstance  StartTairKVCacheCustomInstanceRequest
     * @return StartTairKVCacheCustomInstanceResponse
     */
    CompletableFuture<StartTairKVCacheCustomInstanceResponse> startTairKVCacheCustomInstance(StartTairKVCacheCustomInstanceRequest request);

    /**
     * @param request the request parameters of StopTairKVCacheCustomInstance  StopTairKVCacheCustomInstanceRequest
     * @return StopTairKVCacheCustomInstanceResponse
     */
    CompletableFuture<StopTairKVCacheCustomInstanceResponse> stopTairKVCacheCustomInstance(StopTairKVCacheCustomInstanceRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>For more information about nearest access for applications in multi-zone scenarios, see <a href="https://help.aliyun.com/document_detail/164222.html">Scenario examples</a>.
     * When you call this operation, the instance must be of the high-availability or dual-replica type.
     * Calling this operation has the following impacts:</p>
     * </blockquote>
     * <ul>
     * <li>After the node role switchover is triggered, the data node on which the switchover is performed will enter a read-only state for a few seconds and experience transient disconnections. Make sure that your application has a reconnection mechanism.</li>
     * <li>While the instance is in the switching state, you cannot perform instance-level operations, such as modifying configurations or migrating zones.</li>
     * </ul>
     * 
     * @param request the request parameters of SwitchInstanceHA  SwitchInstanceHARequest
     * @return SwitchInstanceHAResponse
     */
    CompletableFuture<SwitchInstanceHAResponse> switchInstanceHA(SwitchInstanceHARequest request);

    /**
     * <b>description</b> :
     * <p>For more information about the proxy mode, see <a href="https://help.aliyun.com/document_detail/142959.html">Proxy features</a>.
     * To call this operation, the following conditions must be met:</p>
     * <ul>
     * <li>The instance is created in a dedicated cluster. For more information, see <a href="https://help.aliyun.com/document_detail/141455.html">ApsaraDB MyBase</a>.</li>
     * <li>The instance uses the <a href="https://help.aliyun.com/document_detail/52228.html">cluster architecture</a>.<blockquote>
     * <p>Before calling this operation, call the <a href="https://help.aliyun.com/document_detail/473867.html">DescribeDedicatedClusterInstanceList</a> operation and check the value of the <strong>ProxyCount</strong> response parameter to determine whether the proxy mode is enabled for the instance. For example, a value of 0 indicates that the proxy mode is disabled, and a value greater than 0 indicates that the proxy mode is enabled.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of SwitchInstanceProxy  SwitchInstanceProxyRequest
     * @return SwitchInstanceProxyResponse
     */
    CompletableFuture<SwitchInstanceProxyResponse> switchInstanceProxy(SwitchInstanceProxyRequest request);

    /**
     * <b>description</b> :
     * <p>This operation supports only cloud-native architecture instances.</p>
     * 
     * @param request the request parameters of SwitchInstanceToTargetZone  SwitchInstanceToTargetZoneRequest
     * @return SwitchInstanceToTargetZoneResponse
     */
    CompletableFuture<SwitchInstanceToTargetZoneResponse> switchInstanceToTargetZone(SwitchInstanceToTargetZoneRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is applicable only to multi-zone (dual-zone) cluster architecture instances.</li>
     * <li>The node where the failure is simulated automatically recovers later. However, the primary node is located in the secondary zone and the secondary node is located in the primary zone, which may result in cross-data center access between the instance and other workloads. To resolve this issue, you can manually switch zones on the Service Availability page in the console.</li>
     * </ul>
     * 
     * @param request the request parameters of SwitchInstanceZoneFailOver  SwitchInstanceZoneFailOverRequest
     * @return SwitchInstanceZoneFailOverResponse
     */
    CompletableFuture<SwitchInstanceZoneFailOverResponse> switchInstanceZoneFailOver(SwitchInstanceZoneFailOverRequest request);

    /**
     * @param request the request parameters of SwitchNetwork  SwitchNetworkRequest
     * @return SwitchNetworkResponse
     */
    CompletableFuture<SwitchNetworkResponse> switchNetwork(SwitchNetworkRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation applies only to Classic Edition instances.</li>
     * <li>After the data migration or synchronization task is completed, you can call this operation again to remove the specification change restrictions.</li>
     * </ul>
     * 
     * @param request the request parameters of SyncDtsStatus  SyncDtsStatusRequest
     * @return SyncDtsStatusResponse
     */
    CompletableFuture<SyncDtsStatusResponse> syncDtsStatus(SyncDtsStatusRequest request);

    /**
     * <b>description</b> :
     * <p>If you manage a large number of instances, you can create multiple labels and attach different labels to instances for categorization. You can then filter instances by label.</p>
     * <ul>
     * <li>A label consists of a key-value pair. Keys must be unique within the same account and region, whereas values have no such restriction.</li>
     * <li>If the label in Settings does not exist, automatic creation of the label is performed and it is attached to the target instances.</li>
     * <li>If an instance already has a label with the same key attached, the new label overwrites the existing one.</li>
     * <li>You can attach up to 20 labels to each instance.</li>
     * <li>You can attach labels to up to 50 instances each time you invoke the API.
     * For the corresponding console operation, see <a href="https://help.aliyun.com/document_detail/118779.html">Create a label</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the precautions and billing instructions. For more information, see:</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/54542.html">Change the billing method from pay-as-you-go to subscription</a>.</li>
     * <li><a href="https://help.aliyun.com/document_detail/211549.html">Change the billing method from subscription to pay-as-you-go</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of TransformInstanceChargeType  TransformInstanceChargeTypeRequest
     * @return TransformInstanceChargeTypeResponse
     */
    CompletableFuture<TransformInstanceChargeTypeResponse> transformInstanceChargeType(TransformInstanceChargeTypeRequest request);

    /**
     * @param request the request parameters of TransformToEcs  TransformToEcsRequest
     * @return TransformToEcsResponse
     */
    CompletableFuture<TransformToEcsResponse> transformToEcs(TransformToEcsRequest request);

    /**
     * <b>description</b> :
     * <p>For the corresponding console operation, refer to <a href="https://help.aliyun.com/document_detail/54542.html">Change the billing method to subscription</a>.</p>
     * 
     * @param request the request parameters of TransformToPrePaid  TransformToPrePaidRequest
     * @return TransformToPrePaidResponse
     */
    CompletableFuture<TransformToPrePaidResponse> transformToPrePaid(TransformToPrePaidRequest request);

    /**
     * @param request the request parameters of UnlockDBInstanceWrite  UnlockDBInstanceWriteRequest
     * @return UnlockDBInstanceWriteResponse
     */
    CompletableFuture<UnlockDBInstanceWriteResponse> unlockDBInstanceWrite(UnlockDBInstanceWriteRequest request);

    /**
     * <b>description</b> :
     * <p>You can remove a maximum of 20 tags at a time.</p>
     * <ul>
     * <li>If a tag is removed from an instance and is not attached to any other instances, the tag is automatically deleted.
     * For the corresponding console operation, see <a href="https://help.aliyun.com/document_detail/119157.html">Remove tags</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>The upgrade process and impact vary based on the architecture. For more information, see <a href="https://help.aliyun.com/document_detail/56450.html">Principles of minor version updates</a>.</p>
     * <blockquote>
     * <ul>
     * <li>Before you call this operation, you can call <a href="https://help.aliyun.com/document_detail/473781.html">DescribeEngineVersion</a> to query the current minor version of the proxy node.</li>
     * <li>Upgrades cause connection interruptions. Perform upgrades during off-peak hours and ensure that your applications have a reconnection mechanism. For more information about the impact, see <a href="https://help.aliyun.com/document_detail/56450.html">Principles of minor version updates</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of UpgradeProxy  UpgradeProxyRequest
     * @return UpgradeProxyResponse
     */
    CompletableFuture<UpgradeProxyResponse> upgradeProxy(UpgradeProxyRequest request);

}
