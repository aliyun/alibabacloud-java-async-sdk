// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dds20151201.models.*;
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
     * <p>This operation applies only to replica set instances and sharded cluster instances that use cloud disks.</p>
     * 
     * @param request the request parameters of AllocateDBInstanceSrvNetworkAddress  AllocateDBInstanceSrvNetworkAddressRequest
     * @return AllocateDBInstanceSrvNetworkAddressResponse
     */
    CompletableFuture<AllocateDBInstanceSrvNetworkAddressResponse> allocateDBInstanceSrvNetworkAddress(AllocateDBInstanceSrvNetworkAddressRequest request);

    /**
     * <b>description</b> :
     * <p>This operation applies only to sharded cluster instances. For more details, see <a href="https://help.aliyun.com/document_detail/134037.html">Apply for an endpoint for a shard or ConfigServer node</a>.</p>
     * <blockquote>
     * <p>The allocated endpoint supports only internal network access. If you require public network access, invoke the <a href="https://help.aliyun.com/document_detail/67602.html">AllocatePublicNetworkAddress</a> operation to apply for a public endpoint.</p>
     * </blockquote>
     * 
     * @param request the request parameters of AllocateNodePrivateNetworkAddress  AllocateNodePrivateNetworkAddressRequest
     * @return AllocateNodePrivateNetworkAddressResponse
     */
    CompletableFuture<AllocateNodePrivateNetworkAddressResponse> allocateNodePrivateNetworkAddress(AllocateNodePrivateNetworkAddressRequest request);

    /**
     * @param request the request parameters of AllocatePublicNetworkAddress  AllocatePublicNetworkAddressRequest
     * @return AllocatePublicNetworkAddressResponse
     */
    CompletableFuture<AllocatePublicNetworkAddressResponse> allocatePublicNetworkAddress(AllocatePublicNetworkAddressRequest request);

    /**
     * <b>description</b> :
     * <p>Scenarios where O&amp;M events cannot be canceled:</p>
     * <ul>
     * <li>The event cannot be canceled (AllowCancel is 0).</li>
     * <li>The current time is later than the start time of the O&amp;M event.</li>
     * <li>The status of the O&amp;M event is not Pending Execution (Status is not 3).</li>
     * </ul>
     * 
     * @param request the request parameters of CancelActiveOperationTasks  CancelActiveOperationTasksRequest
     * @return CancelActiveOperationTasksResponse
     */
    CompletableFuture<CancelActiveOperationTasksResponse> cancelActiveOperationTasks(CancelActiveOperationTasksRequest request);

    /**
     * <b>description</b> :
     * <p>Before you invoke the <a href="https://help.aliyun.com/document_detail/131267.html">ModifyDBInstanceTDE</a> operation to enable transparent data encryption (TDE), invoke this operation to query the authorization of the KMS key for the MongoDB instance.</p>
     * 
     * @param request the request parameters of CheckCloudResourceAuthorized  CheckCloudResourceAuthorizedRequest
     * @return CheckCloudResourceAuthorizedResponse
     */
    CompletableFuture<CheckCloudResourceAuthorizedResponse> checkCloudResourceAuthorized(CheckCloudResourceAuthorizedRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is applicable to replica set instances or sharded cluster instances.</p>
     * <blockquote>
     * <p>After you call this operation to confirm that the conditions for data restoration are met, you can call the <a href="https://help.aliyun.com/document_detail/61763.html">CreateDBInstance</a> operation to restore data to a new instance.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CheckRecoveryCondition  CheckRecoveryConditionRequest
     * @return CheckRecoveryConditionResponse
     */
    CompletableFuture<CheckRecoveryConditionResponse> checkRecoveryCondition(CheckRecoveryConditionRequest request);

    /**
     * @param request the request parameters of CheckServiceLinkedRole  CheckServiceLinkedRoleRequest
     * @return CheckServiceLinkedRoleResponse
     */
    CompletableFuture<CheckServiceLinkedRoleResponse> checkServiceLinkedRole(CheckServiceLinkedRoleRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Shard accounts can be created only for ApsaraDB for MongoDB sharded cluster instances with cloud disks.</li>
     * <li>Shard accounts are granted fixed read-only permissions.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateAccount  CreateAccountRequest
     * @return CreateAccountResponse
     */
    CompletableFuture<CreateAccountResponse> createAccount(CreateAccountRequest request);

    /**
     * <b>description</b> :
     * <p>The instance status must be running when you invoke the CreateBackup operation.</p>
     * 
     * @param request the request parameters of CreateBackup  CreateBackupRequest
     * @return CreateBackupResponse
     */
    CompletableFuture<CreateBackupResponse> createBackup(CreateBackupRequest request);

    /**
     * <b>description</b> :
     * <p>Before using this operation, make sure you understand the billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://www.aliyun.com/price/product#/mongodb/detail">pricing</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing">pricing</a> of ApsaraDB for MongoDB.
     * For information about instance specifications, see <a href="https://help.aliyun.com/document_detail/57141.html">Instance specifications</a>.
     * To create a sharded cluster instance, call the <a href="https://help.aliyun.com/document_detail/61884.html">CreateShardingDBInstance</a> operation.</p>
     * 
     * @param request the request parameters of CreateDBInstance  CreateDBInstanceRequest
     * @return CreateDBInstanceResponse
     */
    CompletableFuture<CreateDBInstanceResponse> createDBInstance(CreateDBInstanceRequest request);

    /**
     * @param request the request parameters of CreateGlobalSecurityIPGroup  CreateGlobalSecurityIPGroupRequest
     * @return CreateGlobalSecurityIPGroupResponse
     */
    CompletableFuture<CreateGlobalSecurityIPGroupResponse> createGlobalSecurityIPGroup(CreateGlobalSecurityIPGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that you fully understand the billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://www.aliyun.com/price/product#/mongodb/detail">pricing</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing">pricing</a> of ApsaraDB for MongoDB.
     * This operation is applicable only to sharded cluster instances.</p>
     * 
     * @param request the request parameters of CreateNode  CreateNodeRequest
     * @return CreateNodeResponse
     */
    CompletableFuture<CreateNodeResponse> createNode(CreateNodeRequest request);

    /**
     * <b>description</b> :
     * <p>Make sure that you fully understand the billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://www.aliyun.com/price/product#/mongodb/detail">pricing</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing">pricing</a> of ApsaraDB for MongoDB before you call this operation.
     * This operation is applicable only to ApsaraDB for MongoDB sharded cluster instances.</p>
     * 
     * @param request the request parameters of CreateNodeBatch  CreateNodeBatchRequest
     * @return CreateNodeBatchResponse
     */
    CompletableFuture<CreateNodeBatchResponse> createNodeBatch(CreateNodeBatchRequest request);

    /**
     * @param request the request parameters of CreateNodeRoleTag  CreateNodeRoleTagRequest
     * @return CreateNodeRoleTagResponse
     */
    CompletableFuture<CreateNodeRoleTagResponse> createNodeRoleTag(CreateNodeRoleTagRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before calling this operation, make sure that you fully understand the billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://www.aliyun.com/price/product#/mongodb/detail">pricing</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing">pricing</a> of ApsaraDB for MongoDB.</li>
     * <li>For more information about the specifications of ApsaraDB for MongoDB instances, see <a href="https://help.aliyun.com/document_detail/57141.html">Instance specifications</a>.</li>
     * <li>To create a standalone instance or a replica set instance, call the <a href="https://help.aliyun.com/document_detail/61763.html">CreateDBInstance</a> operation.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateShardingDBInstance  CreateShardingDBInstanceRequest
     * @return CreateShardingDBInstanceResponse
     */
    CompletableFuture<CreateShardingDBInstanceResponse> createShardingDBInstance(CreateShardingDBInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>Only manual backups can be deleted.
     * Only MongoDB instances with cloud disks are supported.</p>
     * 
     * @param request the request parameters of DeleteBackup  DeleteBackupRequest
     * @return DeleteBackupResponse
     */
    CompletableFuture<DeleteBackupResponse> deleteBackup(DeleteBackupRequest request);

    /**
     * <b>description</b> :
     * <p>The instance must meet the following conditions:</p>
     * <ul>
     * <li>The instance status is running.</li>
     * <li>The billing method of the instance is pay-as-you-go.<blockquote>
     * <p>After an instance is released, its data cannot be recovered. Proceed with caution.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteDBInstance  DeleteDBInstanceRequest
     * @return DeleteDBInstanceResponse
     */
    CompletableFuture<DeleteDBInstanceResponse> deleteDBInstance(DeleteDBInstanceRequest request);

    /**
     * @param request the request parameters of DeleteGlobalSecurityIPGroup  DeleteGlobalSecurityIPGroupRequest
     * @return DeleteGlobalSecurityIPGroupResponse
     */
    CompletableFuture<DeleteGlobalSecurityIPGroupResponse> deleteGlobalSecurityIPGroup(DeleteGlobalSecurityIPGroupRequest request);

    /**
     * <b>description</b> :
     * <p>When you invoke this operation, the instance must meet the following requirements: </p>
     * <ul>
     * <li>The instance status is Running.</li>
     * <li>The instance is a sharded cluster instance.</li>
     * <li>The billing method of the instance is pay-as-you-go.</li>
     * <li>The number of shard or mongos nodes in the instance is greater than 2.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteNode  DeleteNodeRequest
     * @return DeleteNodeResponse
     */
    CompletableFuture<DeleteNodeResponse> deleteNode(DeleteNodeRequest request);

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
     * @param request the request parameters of DescribeActiveOperationTaskRegion  DescribeActiveOperationTaskRegionRequest
     * @return DescribeActiveOperationTaskRegionResponse
     */
    CompletableFuture<DescribeActiveOperationTaskRegionResponse> describeActiveOperationTaskRegion(DescribeActiveOperationTaskRegionRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is no longer updated and will be unavailable.</p>
     * 
     * @param request the request parameters of DescribeActiveOperationTaskType  DescribeActiveOperationTaskTypeRequest
     * @return DescribeActiveOperationTaskTypeResponse
     */
    CompletableFuture<DescribeActiveOperationTaskTypeResponse> describeActiveOperationTaskType(DescribeActiveOperationTaskTypeRequest request);

    /**
     * @param request the request parameters of DescribeActiveOperationTasks  DescribeActiveOperationTasksRequest
     * @return DescribeActiveOperationTasksResponse
     */
    CompletableFuture<DescribeActiveOperationTasksResponse> describeActiveOperationTasks(DescribeActiveOperationTasksRequest request);

    /**
     * <b>description</b> :
     * <p>Queries advanced backup policies. This operation is supported only for cloud disk replica set and cloud disk sharded cluster instances.</p>
     * 
     * @param request the request parameters of DescribeAdvancedBackupPolicy  DescribeAdvancedBackupPolicyRequest
     * @return DescribeAdvancedBackupPolicyResponse
     */
    CompletableFuture<DescribeAdvancedBackupPolicyResponse> describeAdvancedBackupPolicy(DescribeAdvancedBackupPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>Queries whether advanced backup is enabled. This operation supports only cloud disk replica set instances and cloud disk sharded cluster instances.</p>
     * 
     * @param request the request parameters of DescribeAdvancedBackupStatus  DescribeAdvancedBackupStatusRequest
     * @return DescribeAdvancedBackupStatusResponse
     */
    CompletableFuture<DescribeAdvancedBackupStatusResponse> describeAdvancedBackupStatus(DescribeAdvancedBackupStatusRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>The instance must be in the running state when you call this operation.</li>
     * <li>This operation is applicable only to <strong>general-purpose local-disk</strong> and <strong>dedicated local-disk</strong> instances.</li>
     * <li>You can call this operation up to 30 times per minute. To call this operation at a higher frequency, use a Logstore. For more information, see <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeAuditLogFilter  DescribeAuditLogFilterRequest
     * @return DescribeAuditLogFilterResponse
     */
    CompletableFuture<DescribeAuditLogFilterResponse> describeAuditLogFilter(DescribeAuditLogFilterRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>The instance must be in the running state.</li>
     * <li>This operation is available only for <strong>General-purpose Local Disk Edition</strong> and <strong>Dedicated Local Disk Edition</strong> instances.</li>
     * <li>You can call this operation up to 30 times per minute. Calls that exceed this limit are throttled. To make frequent calls, use Log Service. For more information, see <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeAuditPolicy  DescribeAuditPolicyRequest
     * @return DescribeAuditPolicyResponse
     */
    CompletableFuture<DescribeAuditPolicyResponse> describeAuditPolicy(DescribeAuditPolicyRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>The audit log feature must be enabled for the instance before you call this operation. Otherwise, the returned audit log content is empty.</li>
     * <li>This operation applies to instances of the <strong>General-purpose local disk</strong> and <strong>Dedicated local disk</strong> specification types.</li>
     * <li>This operation can be called up to 30 times per minute. Calls that exceed this limit are throttled. Do not call this operation at a high frequency. If high-frequency calls are required, use a Logstore. For more information, see <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeAuditRecords  DescribeAuditRecordsRequest
     * @return DescribeAuditRecordsResponse
     */
    CompletableFuture<DescribeAuditRecordsResponse> describeAuditRecords(DescribeAuditRecordsRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the zones in which an ApsaraDB for MongoDB instance can be deployed under specified purchase conditions. The region ID is required in the purchase condition.</p>
     * 
     * @param request the request parameters of DescribeAvailabilityZones  DescribeAvailabilityZonesRequest
     * @return DescribeAvailabilityZonesResponse
     */
    CompletableFuture<DescribeAvailabilityZonesResponse> describeAvailabilityZones(DescribeAvailabilityZonesRequest request);

    /**
     * @param request the request parameters of DescribeAvailableEngineVersion  DescribeAvailableEngineVersionRequest
     * @return DescribeAvailableEngineVersionResponse
     */
    CompletableFuture<DescribeAvailableEngineVersionResponse> describeAvailableEngineVersion(DescribeAvailableEngineVersionRequest request);

    /**
     * @param request the request parameters of DescribeAvailableResource  DescribeAvailableResourceRequest
     * @return DescribeAvailableResourceResponse
     */
    CompletableFuture<DescribeAvailableResourceResponse> describeAvailableResource(DescribeAvailableResourceRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/61763.html">CreateDBInstance</a> operation to restore a database for an ApsaraDB for MongoDB instance. For more information, see <a href="https://help.aliyun.com/document_detail/112274.html">Restore one database of an ApsaraDB for MongoDB instance</a>.
     * Before you call this operation, make sure that the instance meets the following requirements:</p>
     * <ul>
     * <li>The instance was created after March 26, 2019.</li>
     * <li>The instance is located in the China (Qingdao), China (Beijing), China (Zhangjiakou), China (Hohhot), China (Hangzhou), China (Shanghai), China (Shenzhen), or Singapore region. Other regions are not supported.</li>
     * <li>The instance is a replica set instance.</li>
     * <li>The instance runs MongoDB 3.4, MongoDB 4.0, or MongoDB 4.2. In addition, the instance uses local disks to store data.</li>
     * <li>The storage engine of the instance is WiredTiger.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeBackupDBs  DescribeBackupDBsRequest
     * @return DescribeBackupDBsResponse
     */
    CompletableFuture<DescribeBackupDBsResponse> describeBackupDBs(DescribeBackupDBsRequest request);

    /**
     * @param request the request parameters of DescribeBackupPolicy  DescribeBackupPolicyRequest
     * @return DescribeBackupPolicyResponse
     */
    CompletableFuture<DescribeBackupPolicyResponse> describeBackupPolicy(DescribeBackupPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>Backup usage for a sharded cluster is billed on a per-shard basis. You can use this operation to query the backup usage for a single shard.</p>
     * 
     * @param request the request parameters of DescribeBackupStorage  DescribeBackupStorageRequest
     * @return DescribeBackupStorageResponse
     */
    CompletableFuture<DescribeBackupStorageResponse> describeBackupStorage(DescribeBackupStorageRequest request);

    /**
     * @param request the request parameters of DescribeBackupTasks  DescribeBackupTasksRequest
     * @return DescribeBackupTasksResponse
     */
    CompletableFuture<DescribeBackupTasksResponse> describeBackupTasks(DescribeBackupTasksRequest request);

    /**
     * @param request the request parameters of DescribeBackups  DescribeBackupsRequest
     * @return DescribeBackupsResponse
     */
    CompletableFuture<DescribeBackupsResponse> describeBackups(DescribeBackupsRequest request);

    /**
     * @param request the request parameters of DescribeBinlogFiles  DescribeBinlogFilesRequest
     * @return DescribeBinlogFilesResponse
     */
    CompletableFuture<DescribeBinlogFilesResponse> describeBinlogFiles(DescribeBinlogFilesRequest request);

    /**
     * <b>description</b> :
     * <p>For sharded cluster instances that use cloud disks and were created before October 19, 2023, you must first call the <a href="https://help.aliyun.com/document_detail/2587931.html">TransferClusterBackup</a> operation to convert shard backups to cluster backups.
     * Sharded cluster instances that use cloud disks and were created after October 19, 2023 use cluster backups by default.</p>
     * 
     * @param request the request parameters of DescribeClusterBackups  DescribeClusterBackupsRequest
     * @return DescribeClusterBackupsResponse
     */
    CompletableFuture<DescribeClusterBackupsResponse> describeClusterBackups(DescribeClusterBackupsRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>The MongoDB instance must be a sharded cluster instance that runs major engine version 4.4 or later and uses standard SSDs as the storage pattern.</li>
     * <li>Only instances created before October 19, 2023 need to invoke the TransferClusterBackup operation to switch to the cluster backup mode. Instances that have been switched to the cluster backup mode or sharded cluster instances with cloud disks created on or after October 19, 2023 can directly invoke this operation.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeClusterRecoverTime  DescribeClusterRecoverTimeRequest
     * @return DescribeClusterRecoverTimeResponse
     */
    CompletableFuture<DescribeClusterRecoverTimeResponse> describeClusterRecoverTime(DescribeClusterRecoverTimeRequest request);

    /**
     * @param request the request parameters of DescribeDBInstanceAttribute  DescribeDBInstanceAttributeRequest
     * @return DescribeDBInstanceAttributeResponse
     */
    CompletableFuture<DescribeDBInstanceAttributeResponse> describeDBInstanceAttribute(DescribeDBInstanceAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>When you invoke the DescribeDBInstanceEncryptionKey operation, transparent data encryption (TDE) must be enabled for the instance by using Bring Your Own Key (BYOK). You can invoke <a href="https://help.aliyun.com/document_detail/131267.html">ModifyDBInstanceTDE</a> to enable TDE.</p>
     * 
     * @param request the request parameters of DescribeDBInstanceEncryptionKey  DescribeDBInstanceEncryptionKeyRequest
     * @return DescribeDBInstanceEncryptionKeyResponse
     */
    CompletableFuture<DescribeDBInstanceEncryptionKeyResponse> describeDBInstanceEncryptionKey(DescribeDBInstanceEncryptionKeyRequest request);

    /**
     * @param request the request parameters of DescribeDBInstanceMonitor  DescribeDBInstanceMonitorRequest
     * @return DescribeDBInstanceMonitorResponse
     */
    CompletableFuture<DescribeDBInstanceMonitorResponse> describeDBInstanceMonitor(DescribeDBInstanceMonitorRequest request);

    /**
     * @param request the request parameters of DescribeDBInstancePerformance  DescribeDBInstancePerformanceRequest
     * @return DescribeDBInstancePerformanceResponse
     */
    CompletableFuture<DescribeDBInstancePerformanceResponse> describeDBInstancePerformance(DescribeDBInstancePerformanceRequest request);

    /**
     * <b>description</b> :
     * <p>To use this operation, the instance must meet the following requirements:</p>
     * <ul>
     * <li>The instance status is Running.</li>
     * <li>The instance is a replica set instance or a sharded cluster instance.<ul>
     * <li>The replica set instance must be version 3.4 or later.</li>
     * <li>The sharded cluster instance must use Enhanced SSDs (ESSDs).</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDBInstanceSSL  DescribeDBInstanceSSLRequest
     * @return DescribeDBInstanceSSLResponse
     */
    CompletableFuture<DescribeDBInstanceSSLResponse> describeDBInstanceSSL(DescribeDBInstanceSSLRequest request);

    /**
     * @param request the request parameters of DescribeDBInstanceSpecInfo  DescribeDBInstanceSpecInfoRequest
     * @return DescribeDBInstanceSpecInfoResponse
     */
    CompletableFuture<DescribeDBInstanceSpecInfoResponse> describeDBInstanceSpecInfo(DescribeDBInstanceSpecInfoRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that the ApsaraDB for MongoDB instance meets the following requirements:</p>
     * <ul>
     * <li>The instance is a replica set or sharded cluster instance.</li>
     * <li>The instance uses local physical disks to store data.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDBInstanceSwitchLog  DescribeDBInstanceSwitchLogRequest
     * @return DescribeDBInstanceSwitchLogResponse
     */
    CompletableFuture<DescribeDBInstanceSwitchLogResponse> describeDBInstanceSwitchLog(DescribeDBInstanceSwitchLogRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>For more information about this feature, see <a href="https://help.aliyun.com/document_detail/131048.html">Settings for transparent data encryption TDE</a>.
     * When you invoke this operation, the instance must meet the following conditions:</p>
     * </blockquote>
     * <ul>
     * <li>The instance is a replica set instance or a sharded cluster instance.</li>
     * <li>The storage DPI engine of the instance is WiredTiger.</li>
     * <li>The database DPI engine version of the instance is 4.0 or 4.2. If the database DPI engine version is earlier than the required version, you can invoke the <a href="https://help.aliyun.com/document_detail/67608.html">UpgradeDBInstanceEngineVersion</a> operation to upgrade the database DPI engine version.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDBInstanceTDEInfo  DescribeDBInstanceTDEInfoRequest
     * @return DescribeDBInstanceTDEInfoResponse
     */
    CompletableFuture<DescribeDBInstanceTDEInfoResponse> describeDBInstanceTDEInfo(DescribeDBInstanceTDEInfoRequest request);

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;By default, this operation queries the list of replica set instances (including single-node instances). If the request parameter <strong>DBInstanceType</strong> is not specified, the default value of this parameter is <strong>replicate</strong>. To query the list of sharded cluster instances, set <strong>DBInstanceType</strong> to <strong>sharding</strong>. To query the list of Serverless instances, set <strong>DBInstanceType</strong> to <strong>serverless</strong>.
     * &lt;props=&quot;intl&quot;&gt;By default, this operation queries the list of replica set instances (including single-node instances). If the request parameter <strong>DBInstanceType</strong> is not specified, the default value of this parameter is <strong>replicate</strong>. To query the list of sharded cluster instances, set <strong>DBInstanceType</strong> to <strong>sharding</strong>.</p>
     * 
     * @param request the request parameters of DescribeDBInstances  DescribeDBInstancesRequest
     * @return DescribeDBInstancesResponse
     */
    CompletableFuture<DescribeDBInstancesResponse> describeDBInstances(DescribeDBInstancesRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>If you do not specify any instances, the operation returns overview information for all instances in the destination region associated with your Alibaba Cloud account.</li>
     * <li>The results of this operation are not paginated.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDBInstancesOverview  DescribeDBInstancesOverviewRequest
     * @return DescribeDBInstancesOverviewResponse
     */
    CompletableFuture<DescribeDBInstancesOverviewResponse> describeDBInstancesOverview(DescribeDBInstancesOverviewRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation applies to instances of the <strong>General-purpose Local Disk</strong> and <strong>Dedicated Local Disk</strong> specification types.</li>
     * <li>This operation is limited to 30 calls per minute. Exceeding this limit triggers throttling. Do not call this operation at a high frequency. For high-frequency access, use Logstore. For more information, see <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeErrorLogRecords  DescribeErrorLogRecordsRequest
     * @return DescribeErrorLogRecordsResponse
     */
    CompletableFuture<DescribeErrorLogRecordsResponse> describeErrorLogRecords(DescribeErrorLogRecordsRequest request);

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
     * <b>description</b> :
     * <p>This operation is applicable to subscription instances.</p>
     * 
     * @param request the request parameters of DescribeInstanceAutoRenewalAttribute  DescribeInstanceAutoRenewalAttributeRequest
     * @return DescribeInstanceAutoRenewalAttributeResponse
     */
    CompletableFuture<DescribeInstanceAutoRenewalAttributeResponse> describeInstanceAutoRenewalAttribute(DescribeInstanceAutoRenewalAttributeRequest request);

    /**
     * @param request the request parameters of DescribeInstanceRecoverTime  DescribeInstanceRecoverTimeRequest
     * @return DescribeInstanceRecoverTimeResponse
     */
    CompletableFuture<DescribeInstanceRecoverTimeResponse> describeInstanceRecoverTime(DescribeInstanceRecoverTimeRequest request);

    /**
     * @param request the request parameters of DescribeKernelReleaseNotes  DescribeKernelReleaseNotesRequest
     * @return DescribeKernelReleaseNotesResponse
     */
    CompletableFuture<DescribeKernelReleaseNotesResponse> describeKernelReleaseNotes(DescribeKernelReleaseNotesRequest request);

    /**
     * <b>description</b> :
     * <p>Queried keys are available only for disk encryption.</p>
     * 
     * @param request the request parameters of DescribeKmsKeys  DescribeKmsKeysRequest
     * @return DescribeKmsKeysResponse
     */
    CompletableFuture<DescribeKmsKeysResponse> describeKmsKeys(DescribeKmsKeysRequest request);

    /**
     * <b>description</b> :
     * <p>This API applies to General-purpose and Dedicated instances that use local disks.
     * You can enable the audit log feature for ApsaraDB for MongoDB as needed. For more information, see <a href="https://help.aliyun.com/document_detail/59903.html">Enable audit logs</a>.</p>
     * <ul>
     * <li>As of January 6, 2022, the official version of the audit log feature is being rolled out to all regions. New requests for the free trial version are no longer accepted. For more information, see <a href="~~377480~~">[Notice] ApsaraDB for MongoDB launches pay-as-you-go audit logs and discontinues the free trial</a>.</li>
     * <li>The official version of the audit log feature is pay-as-you-go. Charges are based on storage usage and retention period. For pricing details, see &lt;props=&quot;china&quot;&gt;<a href="https://www.aliyun.com/price/product?#/mongodb/detail/badds">ApsaraDB for MongoDB pricing</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing">ApsaraDB for MongoDB pricing</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeMongoDBLogConfig  DescribeMongoDBLogConfigRequest
     * @return DescribeMongoDBLogConfigResponse
     */
    CompletableFuture<DescribeMongoDBLogConfigResponse> describeMongoDBLogConfig(DescribeMongoDBLogConfigRequest request);

    /**
     * @param request the request parameters of DescribeParameterModificationHistory  DescribeParameterModificationHistoryRequest
     * @return DescribeParameterModificationHistoryResponse
     */
    CompletableFuture<DescribeParameterModificationHistoryResponse> describeParameterModificationHistory(DescribeParameterModificationHistoryRequest request);

    /**
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
     * <b>description</b> :
     * <p>Queries the vSwitches that are available in a specified region and zone. Use this before creating an ApsaraDB for MongoDB instance to select a vSwitch.</p>
     * 
     * @param request the request parameters of DescribeRdsVSwitchs  DescribeRdsVSwitchsRequest
     * @return DescribeRdsVSwitchsResponse
     */
    CompletableFuture<DescribeRdsVSwitchsResponse> describeRdsVSwitchs(DescribeRdsVSwitchsRequest request);

    /**
     * <b>description</b> :
     * <p>Queries available VPCs in a specified region and zone. Use this before creating an ApsaraDB for MongoDB instance to select a VPC.</p>
     * 
     * @param request the request parameters of DescribeRdsVpcs  DescribeRdsVpcsRequest
     * @return DescribeRdsVpcsResponse
     */
    CompletableFuture<DescribeRdsVpcsResponse> describeRdsVpcs(DescribeRdsVpcsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>To query available regions and zones in which an ApsaraDB for MongoDB instance can be created, call the <a href="https://help.aliyun.com/document_detail/149719.html">DescribeAvailableResource</a> operation.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * <b>description</b> :
     * <p>This operation applies to subscription MongoDB instances.</p>
     * 
     * @param request the request parameters of DescribeRenewalPrice  DescribeRenewalPriceRequest
     * @return DescribeRenewalPriceResponse
     */
    CompletableFuture<DescribeRenewalPriceResponse> describeRenewalPrice(DescribeRenewalPriceRequest request);

    /**
     * <b>description</b> :
     * <p>This operation applies to replica set instances and single-node instances. It does not apply to sharded cluster instances.</p>
     * 
     * @param request the request parameters of DescribeReplicaSetRole  DescribeReplicaSetRoleRequest
     * @return DescribeReplicaSetRoleResponse
     */
    CompletableFuture<DescribeReplicaSetRoleResponse> describeReplicaSetRole(DescribeReplicaSetRoleRequest request);

    /**
     * @param request the request parameters of DescribeRestoreDBInstanceList  DescribeRestoreDBInstanceListRequest
     * @return DescribeRestoreDBInstanceListResponse
     */
    CompletableFuture<DescribeRestoreDBInstanceListResponse> describeRestoreDBInstanceList(DescribeRestoreDBInstanceListRequest request);

    /**
     * @param request the request parameters of DescribeRoleTagStatus  DescribeRoleTagStatusRequest
     * @return DescribeRoleTagStatusResponse
     */
    CompletableFuture<DescribeRoleTagStatusResponse> describeRoleTagStatus(DescribeRoleTagStatusRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/123825.html">View the zone of a node</a>.
     * This operation is applicable to replica set instances and sharded cluster instances. Standalone instances are not supported.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeRoleZoneInfo  DescribeRoleZoneInfoRequest
     * @return DescribeRoleZoneInfoResponse
     */
    CompletableFuture<DescribeRoleZoneInfoResponse> describeRoleZoneInfo(DescribeRoleZoneInfoRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is applicable to instances of the <strong>shared local disk</strong>, <strong>dedicated local disk</strong>, and <strong>cloud disk</strong> specification types.</li>
     * <li>This operation is limited to 30 calls per minute. If this limit is exceeded, the calls are throttled. Do not call this operation at a high frequency. If you need to call this operation at a high frequency, use a Logstore. For more information, see <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * </ul>
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
     * <p>This API is for sharded cluster instances only.</p>
     * 
     * @param request the request parameters of DescribeShardingNetworkAddress  DescribeShardingNetworkAddressRequest
     * @return DescribeShardingNetworkAddressResponse
     */
    CompletableFuture<DescribeShardingNetworkAddressResponse> describeShardingNetworkAddress(DescribeShardingNetworkAddressRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is applicable only to <strong>general-purpose local-disk</strong> and <strong>dedicated local-disk</strong> instances.</li>
     * <li>You can call this operation up to 30 times per minute. To call this operation at a higher frequency, use a Logstore. For more information, see <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * </ul>
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
     * <b>description</b> :
     * <p>You can use the custom keys obtained by calling DescribeUserEncryptionKeyList to enable transparent data encryption (TDE). For more information, see <a href="https://help.aliyun.com/document_detail/131267.html">ModifyDBInstanceTDE</a>.</p>
     * 
     * @param request the request parameters of DescribeUserEncryptionKeyList  DescribeUserEncryptionKeyListRequest
     * @return DescribeUserEncryptionKeyListResponse
     */
    CompletableFuture<DescribeUserEncryptionKeyListResponse> describeUserEncryptionKeyList(DescribeUserEncryptionKeyListRequest request);

    /**
     * @param request the request parameters of DescribeVpcsForMongoDB  DescribeVpcsForMongoDBRequest
     * @return DescribeVpcsForMongoDBResponse
     */
    CompletableFuture<DescribeVpcsForMongoDBResponse> describeVpcsForMongoDB(DescribeVpcsForMongoDBRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that the instance meets the following requirements:</p>
     * <ul>
     * <li>The instance is a replica set instance or a sharded cluster instance that uses local disks.</li>
     * <li>The billing method of the instance is subscription.</li>
     * <li>The instance has expired and is in the <strong>Locking</strong> state.
     * **
     * <strong>Warning</strong> Data cannot be restored after the instance is destroyed. Proceed with caution.</li>
     * </ul>
     * 
     * @param request the request parameters of DestroyInstance  DestroyInstanceRequest
     * @return DestroyInstanceResponse
     */
    CompletableFuture<DestroyInstanceResponse> destroyInstance(DestroyInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>This operation evaluates resources for ApsaraDB for MongoDB replica set and sharded cluster instances. It supports resource evaluation for creating replica set and sharded cluster instances, changing instance specifications, and adding nodes to sharded cluster instances.</p>
     * <blockquote>
     * <p>You can call this operation up to 200 times per minute. Exceeding this limit triggers throttling.</p>
     * </blockquote>
     * 
     * @param request the request parameters of EvaluateResource  EvaluateResourceRequest
     * @return EvaluateResourceResponse
     */
    CompletableFuture<EvaluateResourceResponse> evaluateResource(EvaluateResourceRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>The MigrateAvailableZone operation does not support standalone instances. It is applicable to active cloud disk instances and local disk instances.</li>
     * <li>The transparent data encryption (TDE) feature is not enabled for the instance.</li>
     * <li>The destination zone and the current zone of the instance are in the same region.</li>
     * <li>If the instance is deployed in a VPC, make sure that a vSwitch is created in the destination zone before you migrate the zone. For more information, see <a href="https://help.aliyun.com/document_detail/65387.html">Create a vSwitch</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of MigrateAvailableZone  MigrateAvailableZoneRequest
     * @return MigrateAvailableZoneResponse
     */
    CompletableFuture<MigrateAvailableZoneResponse> migrateAvailableZone(MigrateAvailableZoneRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is applicable to replica set instances. Standalone instances and sharded cluster instances are not supported.</li>
     * <li>Transparent Data Encryption (TDE) is not enabled for the instance.</li>
     * <li>The destination zone and the current zone of the instance must be in the same region.</li>
     * <li>If the instance is deployed in a virtual private cloud (VPC), make sure that a vSwitch is created in the destination zone before you migrate the instance. For more information, see <a href="https://help.aliyun.com/document_detail/65387.html">Create a vSwitch</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of MigrateToOtherZone  MigrateToOtherZoneRequest
     * @return MigrateToOtherZoneResponse
     */
    CompletableFuture<MigrateToOtherZoneResponse> migrateToOtherZone(MigrateToOtherZoneRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is not supported for sharded cluster instances.</p>
     * 
     * @param request the request parameters of ModifyAccountDescription  ModifyAccountDescriptionRequest
     * @return ModifyAccountDescriptionResponse
     */
    CompletableFuture<ModifyAccountDescriptionResponse> modifyAccountDescription(ModifyAccountDescriptionRequest request);

    /**
     * @param request the request parameters of ModifyActiveOperationMaintenanceConfig  ModifyActiveOperationMaintenanceConfigRequest
     * @return ModifyActiveOperationMaintenanceConfigResponse
     */
    CompletableFuture<ModifyActiveOperationMaintenanceConfigResponse> modifyActiveOperationMaintenanceConfig(ModifyActiveOperationMaintenanceConfigRequest request);

    /**
     * @param request the request parameters of ModifyActiveOperationTasks  ModifyActiveOperationTasksRequest
     * @return ModifyActiveOperationTasksResponse
     */
    CompletableFuture<ModifyActiveOperationTasksResponse> modifyActiveOperationTasks(ModifyActiveOperationTasksRequest request);

    /**
     * <b>description</b> :
     * <p>Geo-redundancy applies only to cloud disk replica set and cloud disk sharded instances.</p>
     * 
     * @param request the request parameters of ModifyAdvancedBackupPolicy  ModifyAdvancedBackupPolicyRequest
     * @return ModifyAdvancedBackupPolicyResponse
     */
    CompletableFuture<ModifyAdvancedBackupPolicyResponse> modifyAdvancedBackupPolicy(ModifyAdvancedBackupPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>Enables advanced backup. This feature is supported only for cloud disk replica set and sharded cluster instances.</p>
     * 
     * @param request the request parameters of ModifyAdvancedBackupStatus  ModifyAdvancedBackupStatusRequest
     * @return ModifyAdvancedBackupStatusResponse
     */
    CompletableFuture<ModifyAdvancedBackupStatusResponse> modifyAdvancedBackupStatus(ModifyAdvancedBackupStatusRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>The instance must be in the Running instance status when you invoke this operation.</li>
     * <li>This operation is limited to 30 calls per minute. If this limit is exceeded, the calls are throttled. Do not invoke this operation at a high frequency. If you require high-frequency calls, use a Logstore. For details, see <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyAuditLogFilter  ModifyAuditLogFilterRequest
     * @return ModifyAuditLogFilterResponse
     */
    CompletableFuture<ModifyAuditLogFilterResponse> modifyAuditLogFilter(ModifyAuditLogFilterRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is limited to 30 calls per minute. If this limit is exceeded, the request is throttled. Do not call this operation at a high frequency. For high-frequency calls, use a Logstore. For more information, see <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyAuditPolicy  ModifyAuditPolicyRequest
     * @return ModifyAuditPolicyResponse
     */
    CompletableFuture<ModifyAuditPolicyResponse> modifyAuditPolicy(ModifyAuditPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>You can modify the TTL only for manual backups.
     * This operation is applicable only to MongoDB instances that use cloud disks.</p>
     * 
     * @param request the request parameters of ModifyBackupExpireTime  ModifyBackupExpireTimeRequest
     * @return ModifyBackupExpireTimeResponse
     */
    CompletableFuture<ModifyBackupExpireTimeResponse> modifyBackupExpireTime(ModifyBackupExpireTimeRequest request);

    /**
     * <b>description</b> :
     * <p>Cross-region backup is applicable only to replica set and sharded cluster instances that use cloud disks.</p>
     * 
     * @param request the request parameters of ModifyBackupPolicy  ModifyBackupPolicyRequest
     * @return ModifyBackupPolicyResponse
     */
    CompletableFuture<ModifyBackupPolicyResponse> modifyBackupPolicy(ModifyBackupPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is applicable only to pay-as-you-go instances.</p>
     * 
     * @param request the request parameters of ModifyDBInstanceAttribute  ModifyDBInstanceAttributeRequest
     * @return ModifyDBInstanceAttributeResponse
     */
    CompletableFuture<ModifyDBInstanceAttributeResponse> modifyDBInstanceAttribute(ModifyDBInstanceAttributeRequest request);

    /**
     * @param request the request parameters of ModifyDBInstanceConfig  ModifyDBInstanceConfigRequest
     * @return ModifyDBInstanceConfigResponse
     */
    CompletableFuture<ModifyDBInstanceConfigResponse> modifyDBInstanceConfig(ModifyDBInstanceConfigRequest request);

    /**
     * <b>description</b> :
     * <p>The instance types that support modifying the endpoint and port are as follows:</p>
     * <ul>
     * <li>You can modify the endpoints of instances with local disks and cloud disks.</li>
     * <li>For sharded cluster instances, you can modify only the endpoints of Mongos nodes.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBInstanceConnectionString  ModifyDBInstanceConnectionStringRequest
     * @return ModifyDBInstanceConnectionStringResponse
     */
    CompletableFuture<ModifyDBInstanceConnectionStringResponse> modifyDBInstanceConnectionString(ModifyDBInstanceConnectionStringRequest request);

    /**
     * @param request the request parameters of ModifyDBInstanceDescription  ModifyDBInstanceDescriptionRequest
     * @return ModifyDBInstanceDescriptionResponse
     */
    CompletableFuture<ModifyDBInstanceDescriptionResponse> modifyDBInstanceDescription(ModifyDBInstanceDescriptionRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This feature is not supported for instances with less than 40 GB of disk space.</li>
     * <li>You can change the disk type only to an ESSD AutoPL disk (cloud_auto).</li>
     * <li>The interval between two consecutive modifications to the provisioned input/output operations per second (IOPS) of an instance must be longer than one hour. For more information, see <a href="https://help.aliyun.com/document_detail/413275.html">Modify the performance of an ESSD AutoPL disk</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBInstanceDiskType  ModifyDBInstanceDiskTypeRequest
     * @return ModifyDBInstanceDiskTypeResponse
     */
    CompletableFuture<ModifyDBInstanceDiskTypeResponse> modifyDBInstanceDiskType(ModifyDBInstanceDiskTypeRequest request);

    /**
     * @param request the request parameters of ModifyDBInstanceMaintainTime  ModifyDBInstanceMaintainTimeRequest
     * @return ModifyDBInstanceMaintainTimeResponse
     */
    CompletableFuture<ModifyDBInstanceMaintainTimeResponse> modifyDBInstanceMaintainTime(ModifyDBInstanceMaintainTimeRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Due to changes in the monitoring collection granularity adjustment feature, this operation is only applicable to the previous version of the MongoDB console.
     * To use this operation, the instance must meet the following requirements:</p>
     * </blockquote>
     * <ul>
     * <li>A replica set or sharded cluster instance is used.</li>
     * <li>MongoDB 3.4 (the latest minor version) or MongoDB 4.0 is selected.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBInstanceMonitor  ModifyDBInstanceMonitorRequest
     * @return ModifyDBInstanceMonitorResponse
     */
    CompletableFuture<ModifyDBInstanceMonitorResponse> modifyDBInstanceMonitor(ModifyDBInstanceMonitorRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, the instance must meet the following conditions:</p>
     * <ul>
     * <li>The instance is in the Running state.</li>
     * <li>The network type of the instance is hybrid access mode.<blockquote>
     * <p>This operation is applicable to replica set instances and sharded cluster instances. Standalone instances are not supported.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBInstanceNetExpireTime  ModifyDBInstanceNetExpireTimeRequest
     * @return ModifyDBInstanceNetExpireTimeResponse
     */
    CompletableFuture<ModifyDBInstanceNetExpireTimeResponse> modifyDBInstanceNetExpireTime(ModifyDBInstanceNetExpireTimeRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation applies to replica set instances and sharded cluster instances. Single-node instances are not supported. Only the transform from the classic network type to the VPC network type is supported.</li>
     * <li>This operation supports only instances that run MongoDB 4.2 or earlier and use local disks.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBInstanceNetworkType  ModifyDBInstanceNetworkTypeRequest
     * @return ModifyDBInstanceNetworkTypeResponse
     */
    CompletableFuture<ModifyDBInstanceNetworkTypeResponse> modifyDBInstanceNetworkType(ModifyDBInstanceNetworkTypeRequest request);

    /**
     * <b>description</b> :
     * <p>When you call the ModifyDBInstanceSSL operation, the instance must meet the following conditions: </p>
     * <ul>
     * <li>The instance is in the Running state.</li>
     * <li>The instance is a replica set or sharded cluster instance.<ul>
     * <li>The MongoDB version of a replica set instance must be 3.4 or later.</li>
     * <li>The storage mode of a sharded cluster instance must be ESSD cloud disk.<blockquote>
     * <p>When you enable, update, or disable SSL, the instance restarts once. Perform this operation during off-peak hours.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBInstanceSSL  ModifyDBInstanceSSLRequest
     * @return ModifyDBInstanceSSLResponse
     */
    CompletableFuture<ModifyDBInstanceSSLResponse> modifyDBInstanceSSL(ModifyDBInstanceSSLRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you fully understand the billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://www.aliyun.com/price/product#/mongodb/detail">pricing</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing">pricing</a> of ApsaraDB for MongoDB.
     * This operation is applicable only to ApsaraDB for MongoDB &lt;props=&quot;china&quot;&gt;<ph>standalone instances, replica set instances, and serverless instances</ph>&lt;props=&quot;intl&quot;&gt;<ph>standalone instances and replica set instances</ph>. To modify the configurations of a sharded cluster instance, call the <a href="https://help.aliyun.com/document_detail/61923.html">ModifyNodeSpec</a>, <a href="https://help.aliyun.com/document_detail/61911.html">CreateNode</a>, <a href="https://help.aliyun.com/document_detail/61922.html">DeleteNode</a>, or <a href="https://help.aliyun.com/document_detail/61816.html">ModifyNodeSpecBatch</a> operation based on your business requirements.</p>
     * 
     * @param request the request parameters of ModifyDBInstanceSpec  ModifyDBInstanceSpecRequest
     * @return ModifyDBInstanceSpecResponse
     */
    CompletableFuture<ModifyDBInstanceSpecResponse> modifyDBInstanceSpec(ModifyDBInstanceSpecRequest request);

    /**
     * <b>description</b> :
     * <p>Transparent Data Encryption (TDE) performs real-time I/O encryption and decryption on data files. Data is encrypted before it is written to the disk and decrypted when it is read from the disk into the memory. For more information, see <a href="https://help.aliyun.com/document_detail/131048.html">Configure TDE</a>.</p>
     * <blockquote>
     * <p>You cannot disable TDE after it is enabled.
     * When you call this operation, the instance must meet the following requirements:</p>
     * </blockquote>
     * <ul>
     * <li>The instance is a replica set instance or a sharded cluster instance.</li>
     * <li>The storage engine of the instance is WiredTiger.</li>
     * <li>The storage type of the instance is local disk.</li>
     * <li>The database version of the instance is 4.0 or 4.2. If the database version is earlier than 4.0, you can call the <a href="https://help.aliyun.com/document_detail/67608.html">UpgradeDBInstanceEngineVersion</a> operation to upgrade the database version.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBInstanceTDE  ModifyDBInstanceTDERequest
     * @return ModifyDBInstanceTDEResponse
     */
    CompletableFuture<ModifyDBInstanceTDEResponse> modifyDBInstanceTDE(ModifyDBInstanceTDERequest request);

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
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you fully understand the billing methods and <a href="https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing">pricing</a>.
     * This operation is applicable to subscription instances.</p>
     * <blockquote>
     * <p> When auto-renewal is enabled, your payment will be collected nine days before the expiration date of ApsaraDB for MongoDB. Ensure that your account has sufficient balance.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyInstanceAutoRenewalAttribute  ModifyInstanceAutoRenewalAttributeRequest
     * @return ModifyInstanceAutoRenewalAttributeResponse
     */
    CompletableFuture<ModifyInstanceAutoRenewalAttributeResponse> modifyInstanceAutoRenewalAttribute(ModifyInstanceAutoRenewalAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that the ApsaraDB for MongoDB instance meets the following requirements:</p>
     * <ul>
     * <li>The instance is a replica set or sharded cluster instance.</li>
     * <li>The database engine version of the instance is 4.0 (with the minor version of mongodb_20190408_3.0.11 or later) or 4.2. You can call the <a href="https://help.aliyun.com/document_detail/62010.html">DescribeDBInstanceAttribute</a> operation to view the database engine version of the instance. If necessary, you can call the <a href="https://help.aliyun.com/document_detail/67608.html">UpgradeDBInstanceEngineVersion</a> operation to upgrade the database engine version of the instance.</li>
     * <li>The network type of the instance must be VPC. If the network type of the instance is classic network, you must call the <a href="https://help.aliyun.com/document_detail/62138.html">ModifyDBInstanceNetworkType</a> operation to change the network type to VPC.</li>
     * <li>You can only disable but not enable password-free access over VPC.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyInstanceVpcAuthMode  ModifyInstanceVpcAuthModeRequest
     * @return ModifyInstanceVpcAuthModeResponse
     */
    CompletableFuture<ModifyInstanceVpcAuthModeResponse> modifyInstanceVpcAuthMode(ModifyInstanceVpcAuthModeRequest request);

    /**
     * <b>description</b> :
     * <p>Make sure that you fully understand the billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://www.aliyun.com/price/product#/mongodb/detail">pricing</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing">pricing</a> of ApsaraDB for MongoDB before you call this operation.</p>
     * <blockquote>
     * <p>This operation is applicable only to sharded cluster instances.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyNodeSpec  ModifyNodeSpecRequest
     * @return ModifyNodeSpecResponse
     */
    CompletableFuture<ModifyNodeSpecResponse> modifyNodeSpec(ModifyNodeSpecRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you fully understand the billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://www.aliyun.com/price/product#/mongodb/detail">pricing</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing">pricing</a> of ApsaraDB for MongoDB.
     *  This operation is applicable only to ApsaraDB for MongoDB sharded cluster instances.
     * When you perform batch upgrade or decrease the quota on multiple sharded cluster instances, the target specifications are subject to certain constraints. For example, for storage capacity expansion, the target capacity must be greater than or equal to the current capacity. If the specifications of multiple sharded cluster instances are inconsistent, the system randomly selects the specifications of one sharded cluster instance to construct the constraints, which may cause the upgrade or decrease the quota to fail.
     * If the batch upgrade or decrease the quota process is not Normal, we recommend that you use the ModifyNodeSpec operation to perform an Upgrade/Downgrade on a single sharded cluster instance.</p>
     * 
     * @param request the request parameters of ModifyNodeSpecBatch  ModifyNodeSpecBatchRequest
     * @return ModifyNodeSpecBatchResponse
     */
    CompletableFuture<ModifyNodeSpecBatchResponse> modifyNodeSpecBatch(ModifyNodeSpecBatchRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>When you call this operation, the instance status must be running.</li>
     * <li>If you call this operation to modify specific instance parameters that require a restart to take effect, the instance is automatically restarted after the operation is called. You can call the <a href="https://help.aliyun.com/document_detail/67618.html">DescribeParameterTemplates</a> operation to identify which parameters require an instance restart to take effect after modification.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyParameters  ModifyParametersRequest
     * @return ModifyParametersResponse
     */
    CompletableFuture<ModifyParametersResponse> modifyParameters(ModifyParametersRequest request);

    /**
     * <b>description</b> :
     * <p>Resource Management allows you to build an organizational structure for resources based on your business requirements. You can use resource directories, folders, accounts, and resource groups to hierarchically organize and manage resources. For more information, see <a href="https://help.aliyun.com/document_detail/94475.html">What is Resource Management?</a></p>
     * 
     * @param request the request parameters of ModifyResourceGroup  ModifyResourceGroupRequest
     * @return ModifyResourceGroupResponse
     */
    CompletableFuture<ModifyResourceGroupResponse> modifyResourceGroup(ModifyResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>For a sharded cluster instance, the bound ECS security group takes effect only for mongos nodes.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifySecurityGroupConfiguration  ModifySecurityGroupConfigurationRequest
     * @return ModifySecurityGroupConfigurationResponse
     */
    CompletableFuture<ModifySecurityGroupConfigurationResponse> modifySecurityGroupConfiguration(ModifySecurityGroupConfigurationRequest request);

    /**
     * @param request the request parameters of ModifySecurityIps  ModifySecurityIpsRequest
     * @return ModifySecurityIpsResponse
     */
    CompletableFuture<ModifySecurityIpsResponse> modifySecurityIps(ModifySecurityIpsRequest request);

    /**
     * <b>description</b> :
     * <p>This operation applies only to replica set instances and sharded cluster instances that use disks.</p>
     * 
     * @param request the request parameters of ModifySrvNetworkAddress  ModifySrvNetworkAddressRequest
     * @return ModifySrvNetworkAddressResponse
     */
    CompletableFuture<ModifySrvNetworkAddressResponse> modifySrvNetworkAddress(ModifySrvNetworkAddressRequest request);

    /**
     * <b>description</b> :
     * <p>The actions performed by this operation for a task vary based on the current state of the task. The supported actions for a task can be obtained from the value of the actionInfo parameter in the DescribeHistoryTasks operation.</p>
     * 
     * @param request the request parameters of ModifyTaskInfo  ModifyTaskInfoRequest
     * @return ModifyTaskInfoResponse
     */
    CompletableFuture<ModifyTaskInfoResponse> modifyTaskInfo(ModifyTaskInfoRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation releases the internal endpoint of a shard or Configserver node for a sharded cluster instance. For more information, see <a href="https://help.aliyun.com/document_detail/134067.html">Release the endpoint of a shard or Configserver node</a>.</li>
     * <li>To release the public endpoint of a shard or Configserver node for a sharded cluster instance, call the <a href="https://help.aliyun.com/document_detail/67604.html">ReleasePublicNetworkAddress</a> operation.</li>
     * </ul>
     * 
     * @param request the request parameters of ReleaseNodePrivateNetworkAddress  ReleaseNodePrivateNetworkAddressRequest
     * @return ReleaseNodePrivateNetworkAddressResponse
     */
    CompletableFuture<ReleaseNodePrivateNetworkAddressResponse> releaseNodePrivateNetworkAddress(ReleaseNodePrivateNetworkAddressRequest request);

    /**
     * @param request the request parameters of ReleasePublicNetworkAddress  ReleasePublicNetworkAddressRequest
     * @return ReleasePublicNetworkAddressResponse
     */
    CompletableFuture<ReleasePublicNetworkAddressResponse> releasePublicNetworkAddress(ReleasePublicNetworkAddressRequest request);

    /**
     * <b>description</b> :
     * <p>Make sure that you fully understand the billing methods and pricing of ApsaraDB for MongoDB before you call this operation. For more information about the pricing of ApsaraDB for MongoDB, visit the <a href="https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing">pricing tab of the product buy page</a>.
     * This operation is only applicable to instances that use the subscription billing method.</p>
     * 
     * @param request the request parameters of RenewDBInstance  RenewDBInstanceRequest
     * @return RenewDBInstanceResponse
     */
    CompletableFuture<RenewDBInstanceResponse> renewDBInstance(RenewDBInstanceRequest request);

    /**
     * @param request the request parameters of ResetAccountPassword  ResetAccountPasswordRequest
     * @return ResetAccountPasswordResponse
     */
    CompletableFuture<ResetAccountPasswordResponse> resetAccountPassword(ResetAccountPasswordRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to restart an instance, or a specific shard or mongos node in a sharded cluster instance.</p>
     * 
     * @param request the request parameters of RestartDBInstance  RestartDBInstanceRequest
     * @return RestartDBInstanceResponse
     */
    CompletableFuture<RestartDBInstanceResponse> restartDBInstance(RestartDBInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>Limits:</p>
     * <ul>
     * <li>The instance is in the running state.</li>
     * <li>The instance is a standard replica set or sharded cluster instance.</li>
     * </ul>
     * 
     * @param request the request parameters of RestartNode  RestartNodeRequest
     * @return RestartNodeResponse
     */
    CompletableFuture<RestartNodeResponse> restartNode(RestartNodeRequest request);

    /**
     * <b>description</b> :
     * <p>The instance must be running when you call this operation.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>This operation is applicable to replica set instances and sharded cluster instances, but cannot be performed on standalone instances.</li>
     * <li>On replica set instances, the switch is performed between instances. On sharded cluster instances, the switch is performed between shards.</li>
     * </ul>
     * 
     * @param request the request parameters of SwitchDBInstanceHA  SwitchDBInstanceHARequest
     * @return SwitchDBInstanceHAResponse
     */
    CompletableFuture<SwitchDBInstanceHAResponse> switchDBInstanceHA(SwitchDBInstanceHARequest request);

    /**
     * <b>description</b> :
     * <p>If you have a large number of instances, you can create multiple tags, bind the tags to the instances, and filter the instances by tag.</p>
     * <ul>
     * <li>A tag consists of a key and a value. Each key must be unique in a region for an Alibaba Cloud account. Different keys can be mapped to the same value.</li>
     * <li>If the tag that you specify does not exist, this tag is automatically created and bound to the specified instance.</li>
     * <li>If a tag that has the same key is already bound to the instance, the new tag overwrites the existing tag.</li>
     * <li>You can bind up to 20 tags to each instance.</li>
     * <li>You can bind tags to up to 50 instances each time you call the operation.</li>
     * </ul>
     * 
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>The instance is an ApsaraDB for MongoDB sharded cluster instance that runs MongoDB 4.4 or later and uses enhanced SSDs (ESSDs) to store data.</li>
     * <li>You can call the TransferClusterBackup operation only for instances that are created before October 19, 2023 to switch the instances to the cluster backup mode. Cloud disk-based sharded cluster instances that are created on or after October 19, 2023 are set to the cluster backup mode by default.</li>
     * </ul>
     * 
     * @param request the request parameters of TransferClusterBackup  TransferClusterBackupRequest
     * @return TransferClusterBackupResponse
     */
    CompletableFuture<TransferClusterBackupResponse> transferClusterBackup(TransferClusterBackupRequest request);

    /**
     * <b>description</b> :
     * <p>Ensure that you fully understand the billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://www.aliyun.com/price/product#/mongodb/detail">pricing</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing">pricing</a> of ApsaraDB for MongoDB before you call this operation.
     * When you call this operation, the instance must meet the following requirements:</p>
     * <ul>
     * <li>The instance status is Running.</li>
     * <li>The instance does not have unpaid orders for billing method transform.</li>
     * <li>The instance type is not a legacy instance type (an instance type that is no longer available). For more information about legacy instance types, see <a href="https://help.aliyun.com/document_detail/57141.html">Instance types</a>.<blockquote>
     * <p>To change the billing method of an instance of a legacy instance type, call the <a href="https://help.aliyun.com/document_detail/61816.html">ModifyDBInstanceSpec</a> or <a href="https://help.aliyun.com/document_detail/61923.html">ModifyNodeSpec</a> operation to change the instance type first.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of TransformInstanceChargeType  TransformInstanceChargeTypeRequest
     * @return TransformInstanceChargeTypeResponse
     */
    CompletableFuture<TransformInstanceChargeTypeResponse> transformInstanceChargeType(TransformInstanceChargeTypeRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and <a href="https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing">pricing</a>.
     * A subscription instance cannot be changed to a pay-as-you-go instance. To avoid wasting resources, proceed with caution.
     * Before you call this API operation, make sure that the ApsaraDB for MongoDB instance meets the following requirements:</p>
     * <ul>
     * <li>The instance is in the running state.</li>
     * <li>The billing method of the instance is pay-as-you-go.</li>
     * <li>The instance has no unpaid subscription orders.</li>
     * <li>The instance type is available for purchase. For more information about unavailable instance types, see <a href="https://help.aliyun.com/document_detail/57141.html">Instance types</a>.<blockquote>
     * <p>To change the billing method of an instance whose instance type is no longer available to subscription, call the <a href="https://help.aliyun.com/document_detail/61816.html">ModifyDBInstanceSpec</a> or <a href="https://help.aliyun.com/document_detail/61923.html">ModifyNodeSpec</a> operation to first change the instance type.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of TransformToPrePaid  TransformToPrePaidRequest
     * @return TransformToPrePaidResponse
     */
    CompletableFuture<TransformToPrePaidResponse> transformToPrePaid(TransformToPrePaidRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>You can remove up to 20 tags at a time.</li>
     * <li>If you remove a tag from all instances, the tag is automatically deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>The instance must be in the running state when you call this operation.</p>
     * <blockquote>
     * <ul>
     * <li><p>The available database versions depend on the storage engine used by the instance. For more information, see <a href="https://help.aliyun.com/document_detail/398673.html">Upgrades of MongoDB major versions</a>. You can also call the <a href="https://help.aliyun.com/document_detail/141355.html">DescribeAvailableEngineVersion</a> operation to query the available database versions.</p>
     * </li>
     * <li><p>You cannot downgrade the MongoDB version of an instance after you upgrade it.</p>
     * </li>
     * <li><p>The instance is automatically restarted for two to three times during the upgrade process. Make sure that you upgrade the instance during off-peak hours.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of UpgradeDBInstanceEngineVersion  UpgradeDBInstanceEngineVersionRequest
     * @return UpgradeDBInstanceEngineVersionResponse
     */
    CompletableFuture<UpgradeDBInstanceEngineVersionResponse> upgradeDBInstanceEngineVersion(UpgradeDBInstanceEngineVersionRequest request);

    /**
     * <b>description</b> :
     * <p>When you call the UpgradeDBInstanceKernelVersion operation, the instance must be in the Running state.</p>
     * <blockquote>
     * <ul>
     * <li>The UpgradeDBInstanceKernelVersion operation is applicable to replica set and sharded cluster instances, but not to standalone instances.</li>
     * <li>The instance will be restarted once during the upgrade. Call this operation during off-peak hours.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of UpgradeDBInstanceKernelVersion  UpgradeDBInstanceKernelVersionRequest
     * @return UpgradeDBInstanceKernelVersionResponse
     */
    CompletableFuture<UpgradeDBInstanceKernelVersionResponse> upgradeDBInstanceKernelVersion(UpgradeDBInstanceKernelVersionRequest request);

}
