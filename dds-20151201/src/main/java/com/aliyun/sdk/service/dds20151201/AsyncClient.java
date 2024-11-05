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
     * <p>This operation is applicable only to sharded cluster instances. For more information, see <a href="https://help.aliyun.com/document_detail/134037.html">Apply for an endpoint for a shard or Configserver node</a>.</p>
     * <blockquote>
     * <p> The allocated endpoints can be used only for internal access. To gain Internet access, you must call the <a href="https://help.aliyun.com/document_detail/67602.html">AllocatePublicNetworkAddress</a> operation to apply for public endpoints.</p>
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
     * <p>Before you enable Transparent Data Encryption (TDE) by calling the <a href="https://help.aliyun.com/document_detail/131267.html">ModifyDBInstanceTDE</a> operation, you can call this operation to check whether KMS keys are authorized to ApsaraDB for MongoDB instances.</p>
     * 
     * @param request the request parameters of CheckCloudResourceAuthorized  CheckCloudResourceAuthorizedRequest
     * @return CheckCloudResourceAuthorizedResponse
     */
    CompletableFuture<CheckCloudResourceAuthorizedResponse> checkCloudResourceAuthorized(CheckCloudResourceAuthorizedRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is applicable to replica set instances and sharded cluster instances.</p>
     * <blockquote>
     * <p> After you call this operation to confirm that the data of the instance can be restored, you can call the <a href="https://help.aliyun.com/document_detail/61763.html">CreateDBInstance</a> operation to restore data to a new instance.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CheckRecoveryCondition  CheckRecoveryConditionRequest
     * @return CheckRecoveryConditionResponse
     */
    CompletableFuture<CheckRecoveryConditionResponse> checkRecoveryCondition(CheckRecoveryConditionRequest request);

    /**
     * <b>description</b> :
     * <p>  You can create an account for shard nodes only in an ApsaraDB for MongoDB sharded cluster instance that uses cloud disks.</p>
     * <ul>
     * <li>The account is granted read-only permissions.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateAccount  CreateAccountRequest
     * @return CreateAccountResponse
     */
    CompletableFuture<CreateAccountResponse> createAccount(CreateAccountRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, the instance must be in the Running state.</p>
     * 
     * @param request the request parameters of CreateBackup  CreateBackupRequest
     * @return CreateBackupResponse
     */
    CompletableFuture<CreateBackupResponse> createBackup(CreateBackupRequest request);

    /**
     * <b>description</b> :
     * <p>Make sure that you fully understand the billing methods and <a href="https://www.alibabacloud.com/product/apsaradb-for-mongodb/pricing">pricing</a> of ApsaraDB for MongoDB before you call this operation.
     * For more information about the instance types of ApsaraDB for MongoDB instances, see <a href="https://www.alibabacloud.com/help/en/mongodb/product-overview/instance-types-1">Instance types</a>.
     * To create sharded cluster instances, you can call the <a href="~~CreateShardingDBInstance~~">CreateShardingDBInstance</a> operation.</p>
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
     * <p>Before you call this operation, make sure that you understand the billing methods and <a href="https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing">pricing</a> of ApsaraDB for MongoDB.
     * This operation applies only to sharded cluster instances.</p>
     * 
     * @param request the request parameters of CreateNode  CreateNodeRequest
     * @return CreateNodeResponse
     */
    CompletableFuture<CreateNodeResponse> createNode(CreateNodeRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you fully understand the billing methods and <a href="https://www.alibabacloud.com/product/apsaradb-for-mongodb/pricing">pricing</a> of ApsaraDB for MongoDB. 
     * This operation is applicable only to sharded cluster instances.</p>
     * 
     * @param request the request parameters of CreateNodeBatch  CreateNodeBatchRequest
     * @return CreateNodeBatchResponse
     */
    CompletableFuture<CreateNodeBatchResponse> createNodeBatch(CreateNodeBatchRequest request);

    /**
     * <b>description</b> :
     * <p>  Make sure that you fully understand the billing methods and <a href="https://www.alibabacloud.com/product/apsaradb-for-mongodb/pricing">pricing</a> of ApsaraDB for MongoDB before you call this operation.</p>
     * <ul>
     * <li>For more information about the instance types of ApsaraDB for MongoDB, see <a href="https://help.aliyun.com/document_detail/57141.html">Instance types</a>.</li>
     * <li>To create standalone instances and replica set instances, you can call the <a href="https://help.aliyun.com/document_detail/61763.html">CreateDBInstance</a> operation.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateShardingDBInstance  CreateShardingDBInstanceRequest
     * @return CreateShardingDBInstanceResponse
     */
    CompletableFuture<CreateShardingDBInstanceResponse> createShardingDBInstance(CreateShardingDBInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that the instance meets the following requirements</p>
     * <ul>
     * <li>The instance is in the Running state.</li>
     * <li>The billing method of the instance is pay-as-you-go.<blockquote>
     * <p>After an instance is released, all data in the instance is cleared and cannot be recovered. Proceed with caution.</p>
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
     * <p>Before you call this operation, make sure that the instance meets the following requirements:</p>
     * <ul>
     * <li>The instance is in the Running state.</li>
     * <li>The instance is a sharded cluster instance.</li>
     * <li>The billing method of the instance is pay-as-you-go.</li>
     * <li>The number of the shard or mongos nodes in the instance is greater than two.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteNode  DeleteNodeRequest
     * @return DeleteNodeResponse
     */
    CompletableFuture<DeleteNodeResponse> deleteNode(DeleteNodeRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> This operation can be used to query only the information of the root account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeAccounts  DescribeAccountsRequest
     * @return DescribeAccountsResponse
     */
    CompletableFuture<DescribeAccountsResponse> describeAccounts(DescribeAccountsRequest request);

    /**
     * @param request the request parameters of DescribeActiveOperationTaskCount  DescribeActiveOperationTaskCountRequest
     * @return DescribeActiveOperationTaskCountResponse
     */
    CompletableFuture<DescribeActiveOperationTaskCountResponse> describeActiveOperationTaskCount(DescribeActiveOperationTaskCountRequest request);

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
     * <p>  The instance must be in the running state when you call this operation.</p>
     * <ul>
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
     * <p>  The instance must be in the running state when you call this operation.</p>
     * <ul>
     * <li>This operation is applicable only to <strong>general-purpose local-disk</strong> and <strong>dedicated local-disk</strong> instances.</li>
     * <li>You can call this operation up to 30 times per minute. To call this operation at a higher frequency, use a Logstore. For more information, see <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeAuditPolicy  DescribeAuditPolicyRequest
     * @return DescribeAuditPolicyResponse
     */
    CompletableFuture<DescribeAuditPolicyResponse> describeAuditPolicy(DescribeAuditPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>  When you call this operation, ensure that the audit log feature of the instance is enabled. Otherwise, the operation returns an empty audit log.</p>
     * <ul>
     * <li>This operation is applicable only to <strong>general-purpose local-disk</strong> and <strong>dedicated local-disk</strong> instances.</li>
     * <li>You can call this operation up to 30 times per minute. To call this operation at a higher frequency, use a Logstore. For more information, see <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
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
     * <b>description</b> :
     * <p>For a sharded cluster instance that is created before October 19, 2023 and uses cloud disks, you must call the <a href="https://help.aliyun.com/document_detail/2587931.html">TransferClusterBackup</a> operation to switch the instance from the shard backup mode to the cluster backup mode before you call the DescribeClusterBackups operation.
     * By default, cloud disk-based sharded cluster instances that are created after October 19, 2023 are in the cluster backup mode.</p>
     * 
     * @param request the request parameters of DescribeClusterBackups  DescribeClusterBackupsRequest
     * @return DescribeClusterBackupsResponse
     */
    CompletableFuture<DescribeClusterBackupsResponse> describeClusterBackups(DescribeClusterBackupsRequest request);

    /**
     * <b>description</b> :
     * <p>  The instance is an ApsaraDB for MongoDB sharded cluster instance that runs MongoDB 4.4 or later and uses enhanced SSDs (ESSDs) to store data.</p>
     * <ul>
     * <li>You can call the TransferClusterBackup operation only for instances that are created before October 19, 2023 to switch the instances to the cluster backup mode. The DescribeClusterRecoverTime operation is applicable only to instances that are switched to the cluster backup mode or instances that are created on or after October 19, 2023.</li>
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
     * <p>When you call the DescribeDBInstanceEncryptionKey operation, the instance must have transparent data encryption (TDE) enabled in BYOK mode. You can call the <a href="https://help.aliyun.com/document_detail/131267.html">ModifyDBInstanceTDE</a> operation to enable TDE.</p>
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
     * <p>Before you call this operation, make sure that the following requirements are met:</p>
     * <ul>
     * <li>The instance is in the Running state.</li>
     * <li>The instance is a replica set instance.</li>
     * <li>The instance runs MongoDB 3.4 or later.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDBInstanceSSL  DescribeDBInstanceSSLRequest
     * @return DescribeDBInstanceSSLResponse
     */
    CompletableFuture<DescribeDBInstanceSSLResponse> describeDBInstanceSSL(DescribeDBInstanceSSLRequest request);

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
     * <p> For more information about TDE, see <a href="https://help.aliyun.com/document_detail/131048.html">TDE</a>.
     * Before you call this operation, make sure that the instance meets the following requirements:</p>
     * </blockquote>
     * <ul>
     * <li>The instance is a replica set or sharded cluster instance.</li>
     * <li>The storage engine of the instance is WiredTiger.</li>
     * <li>The database engine version of the instance is 4.0 or 4.2. If the database engine version is earlier than 4.0, you can call the <a href="https://help.aliyun.com/document_detail/67608.html">UpgradeDBInstanceEngineVersion</a> operation to upgrade the database engine.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDBInstanceTDEInfo  DescribeDBInstanceTDEInfoRequest
     * @return DescribeDBInstanceTDEInfoResponse
     */
    CompletableFuture<DescribeDBInstanceTDEInfoResponse> describeDBInstanceTDEInfo(DescribeDBInstanceTDEInfoRequest request);

    /**
     * <b>description</b> :
     * <p>The list of replica set and standalone instances is displayed when the <strong>DBInstanceType</strong> parameter uses the default value <strong>replicate</strong>. To query a list of sharded cluster instances, you must set the <strong>DBInstanceType</strong> parameter to <strong>sharding</strong>.</p>
     * 
     * @param request the request parameters of DescribeDBInstances  DescribeDBInstancesRequest
     * @return DescribeDBInstancesResponse
     */
    CompletableFuture<DescribeDBInstancesResponse> describeDBInstances(DescribeDBInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>  If you do not specify an instance when you call this operation, the overview information of all instances in a specific region within this account is returned.</p>
     * <ul>
     * <li>Paged query is disabled for this operation.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDBInstancesOverview  DescribeDBInstancesOverviewRequest
     * @return DescribeDBInstancesOverviewResponse
     */
    CompletableFuture<DescribeDBInstancesOverviewResponse> describeDBInstancesOverview(DescribeDBInstancesOverviewRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is applicable only to <strong>general-purpose local-disk</strong> and <strong>dedicated local-disk</strong> instances.</p>
     * <ul>
     * <li>You can call this operation up to 30 times per minute. To call this operation at a higher frequency, use a Logstore. For more information, see <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
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
     * <p>This operation is applicable only to <strong>general-purpose local-disk</strong> and <strong>dedicated local-disk</strong> instances.
     * This operation depends on the audit log feature of ApsaraDB for MongoDB. You can enable the audit log feature based on your business requirements. For more information, see <a href="https://help.aliyun.com/document_detail/59903.html">Enable the audit log feature</a>.</p>
     * <ul>
     * <li>Starting from January 6, 2022, the official edition of the audit log feature has been launched in all regions, and new applications for the free trial edition have ended. For more information, see <a href="https://help.aliyun.com/document_detail/377480.html">Notice on official launch of the pay-as-you-go audit log feature and no more application for the free trial edition</a></li>
     * <li>You are charged for the official edition of the audit log feature based on the storage capacity that is consumed by audit logs and the retention period of the audit logs. For more information, see <a href="https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing">Pricing of ApsaraDB for MongoDB instances</a>.</li>
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
     * <blockquote>
     * <p> To query available regions and zones in which an ApsaraDB for MongoDB instance can be created, call the <a href="https://help.aliyun.com/document_detail/149719.html">DescribeAvailableResource</a> operation.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is applicable to subscription instances.</p>
     * 
     * @param request the request parameters of DescribeRenewalPrice  DescribeRenewalPriceRequest
     * @return DescribeRenewalPriceResponse
     */
    CompletableFuture<DescribeRenewalPriceResponse> describeRenewalPrice(DescribeRenewalPriceRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is applicable to replica set instances and standalone instances, but not to sharded cluster instances.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/123825.html">View the zone of a node</a>.
     * This operation is applicable to replica set instances and sharded cluster instances, but cannot be performed on standalone instances.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeRoleZoneInfo  DescribeRoleZoneInfoRequest
     * @return DescribeRoleZoneInfoResponse
     */
    CompletableFuture<DescribeRoleZoneInfoResponse> describeRoleZoneInfo(DescribeRoleZoneInfoRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is applicable only to <strong>general-purpose local-disk</strong> and <strong>dedicated local-disk</strong> instances.</p>
     * <ul>
     * <li>You can call this operation up to 30 times per minute. To call this operation at a higher frequency, use a Logstore. For more information, see <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
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
     * <p>This operation is applicable only to sharded cluster instances.</p>
     * 
     * @param request the request parameters of DescribeShardingNetworkAddress  DescribeShardingNetworkAddressRequest
     * @return DescribeShardingNetworkAddressResponse
     */
    CompletableFuture<DescribeShardingNetworkAddressResponse> describeShardingNetworkAddress(DescribeShardingNetworkAddressRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is applicable only to <strong>general-purpose local-disk</strong> and <strong>dedicated local-disk</strong> instances.</p>
     * <ul>
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
     * <p>You can use the custom key obtained by calling the DescribeUserEncryptionKeyList operation to enable TDE. For more information, see <a href="https://help.aliyun.com/document_detail/131267.html">ModifyDBInstanceTDE</a>.</p>
     * 
     * @param request the request parameters of DescribeUserEncryptionKeyList  DescribeUserEncryptionKeyListRequest
     * @return DescribeUserEncryptionKeyListResponse
     */
    CompletableFuture<DescribeUserEncryptionKeyListResponse> describeUserEncryptionKeyList(DescribeUserEncryptionKeyListRequest request);

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
     * <p>This operation is applicable to replica set instances and sharded cluster instances. You can call this operation to check whether resources are sufficient for creating an instance, upgrading a replica set or sharded cluster instance, or upgrading a single node of the sharded cluster instance.</p>
     * <blockquote>
     * <p>You can call this operation a maximum of 200 times per minute.</p>
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
     * <p>  This operation is available only for replica set instances that run MongoDB 4.2 or earlier and sharded cluster instances.</p>
     * <ul>
     * <li>If you have applied for a public endpoint for the ApsaraDB for MongoDB instance, you must call the <a href="https://help.aliyun.com/document_detail/67604.html">ReleasePublicNetworkAddress</a> operation to release the public endpoint before you call the MigrateAvailableZone operation.</li>
     * <li>Transparent data encryption (TDE) is disabled for the ApsaraDB for MongoDB instance.</li>
     * <li>The source zone and the destination zone belong to the same region.</li>
     * <li>A vSwitch is created in the destination zone. This prerequisite must be met if the instance resides in a virtual private cloud (VPC). For more information about how to create a vSwitch, see <a href="https://help.aliyun.com/document_detail/65387.html">Work with vSwitches</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of MigrateAvailableZone  MigrateAvailableZoneRequest
     * @return MigrateAvailableZoneResponse
     */
    CompletableFuture<MigrateAvailableZoneResponse> migrateAvailableZone(MigrateAvailableZoneRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is applicable only to replica set instances, but not to standalone instances or sharded cluster instances.</p>
     * <blockquote>
     * <p> If you have applied for a public endpoint of the instance, you must first call the <a href="https://help.aliyun.com/document_detail/67604.html">ReleasePublicNetworkAddress</a> operation to release the public endpoint.</p>
     * </blockquote>
     * 
     * @param request the request parameters of MigrateToOtherZone  MigrateToOtherZoneRequest
     * @return MigrateToOtherZoneResponse
     */
    CompletableFuture<MigrateToOtherZoneResponse> migrateToOtherZone(MigrateToOtherZoneRequest request);

    /**
     * @param request the request parameters of ModifyAccountDescription  ModifyAccountDescriptionRequest
     * @return ModifyAccountDescriptionResponse
     */
    CompletableFuture<ModifyAccountDescriptionResponse> modifyAccountDescription(ModifyAccountDescriptionRequest request);

    /**
     * @param request the request parameters of ModifyActiveOperationTasks  ModifyActiveOperationTasksRequest
     * @return ModifyActiveOperationTasksResponse
     */
    CompletableFuture<ModifyActiveOperationTasksResponse> modifyActiveOperationTasks(ModifyActiveOperationTasksRequest request);

    /**
     * <b>description</b> :
     * <p>  The instance must be in the running state when you call this operation.</p>
     * <ul>
     * <li>This operation is applicable only to <strong>general-purpose local-disk</strong> or <strong>dedicated local-disk</strong> instances.</li>
     * <li>You can call this operation up to 30 times per minute. To call this operation at a higher frequency, use a Logstore. For more information, see <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyAuditLogFilter  ModifyAuditLogFilterRequest
     * @return ModifyAuditLogFilterResponse
     */
    CompletableFuture<ModifyAuditLogFilterResponse> modifyAuditLogFilter(ModifyAuditLogFilterRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is applicable only to <strong>general-purpose local-disk</strong> and <strong>dedicated local-disk</strong> instances.</p>
     * <ul>
     * <li>You can call this operation up to 30 times per minute. To call this operation at a higher frequency, use a Logstore. For more information, see <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyAuditPolicy  ModifyAuditPolicyRequest
     * @return ModifyAuditPolicyResponse
     */
    CompletableFuture<ModifyAuditPolicyResponse> modifyAuditPolicy(ModifyAuditPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>Cross-regional backup only supports  MongoDB sharded cluster instance and MongoDB replica set.</p>
     * 
     * @param request the request parameters of ModifyBackupPolicy  ModifyBackupPolicyRequest
     * @return ModifyBackupPolicyResponse
     */
    CompletableFuture<ModifyBackupPolicyResponse> modifyBackupPolicy(ModifyBackupPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>You can modify the connection strings and ports of the following instances:</p>
     * <ul>
     * <li>You can modify the connection strings of instances that use local or cloud disks.</li>
     * <li>You can only modify the ports of instances that use cloud disks.</li>
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
     * <p> This operation is applicable only to the ApsaraDB for MongoDB console of the previous version due to the change in the feature of adjusting collection intervals of monitoring data.
     * Before you call this operation, make sure that the following requirements are met:</p>
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
     * <p>Before you call this operation, make sure that the instance meets the following requirements:</p>
     * <ul>
     * <li>The instance is in the Running state.</li>
     * <li>The network of the instance is in hybrid access mode.<blockquote>
     * <p> This operation is supported by replica set instances and sharded cluster instances. This operation is not supported by standalone instances.</p>
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
     * <p>This operation is applicable to replica set instances and sharded cluster instances, but not standalone instances. You can call this operation to change the network of an instance from a classic network to a VPC.</p>
     * 
     * @param request the request parameters of ModifyDBInstanceNetworkType  ModifyDBInstanceNetworkTypeRequest
     * @return ModifyDBInstanceNetworkTypeResponse
     */
    CompletableFuture<ModifyDBInstanceNetworkTypeResponse> modifyDBInstanceNetworkType(ModifyDBInstanceNetworkTypeRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage</h2>
     * <p>Before you call this operation, make sure that the following requirements are met:</p>
     * <ul>
     * <li>The instance is in the running state.</li>
     * <li>The instance is a replica set instance.</li>
     * <li>The engine version of the instance is 3.4 or 4.0.<blockquote>
     * <p> When you enable or disable SSL encryption or update the SSL certificate, the instance restarts. We recommend that you call this operation during off-peak hours.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBInstanceSSL  ModifyDBInstanceSSLRequest
     * @return ModifyDBInstanceSSLResponse
     */
    CompletableFuture<ModifyDBInstanceSSLResponse> modifyDBInstanceSSL(ModifyDBInstanceSSLRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and <a href="https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing">pricing</a> of ApsaraDB for MongoDB.
     * This operation applies only to standalone and replica set instances. To modify the specifications of sharded cluster instances, you can call the <a href="https://help.aliyun.com/document_detail/61911.html">ModifyNodeSpec</a>, <a href="https://help.aliyun.com/document_detail/61922.html">CreateNode</a>, <a href="https://help.aliyun.com/document_detail/61816.html">DeleteNode</a>, or <a href="https://help.aliyun.com/document_detail/61923.html">ModifyNodeSpecBatch</a> operation.</p>
     * 
     * @param request the request parameters of ModifyDBInstanceSpec  ModifyDBInstanceSpecRequest
     * @return ModifyDBInstanceSpecResponse
     */
    CompletableFuture<ModifyDBInstanceSpecResponse> modifyDBInstanceSpec(ModifyDBInstanceSpecRequest request);

    /**
     * <b>description</b> :
     * <p>TDE allows you to perform real-time I/O encryption and decryption on data files. Data is encrypted before it is written to a disk and is decrypted when it is read from the disk to the memory. For more information, see <a href="https://help.aliyun.com/document_detail/131048.html">Configure TDE</a>.</p>
     * <blockquote>
     * <p> TDE cannot be disabled after it is enabled.
     * Before you call this operation, make sure that the ApsaraDB for MongoDB instance meets the following requirements:</p>
     * </blockquote>
     * <ul>
     * <li>A replica set or sharded cluster instance is used.</li>
     * <li>The storage engine of the instance is WiredTiger.</li>
     * <li>The instance uses local disks to store data.</li>
     * <li>The database engine version of the instance is 4.0 or 4.2. If the database engine version is earlier than 4.0, you can call the <a href="https://help.aliyun.com/document_detail/67608.html">UpgradeDBInstanceEngineVersion</a> operation to upgrade the database engine.</li>
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
     * <p>Before you call this operation, make sure that you understand the billing methods and <a href="https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing">pricing</a> of ApsaraDB for MongoDB.</p>
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
     * <p>Make sure that you fully understand the billing methods and <a href="https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing">pricing</a> of ApsaraDB for MongoDB before you call this operation.
     * This operation is applicable only to sharded cluster instances.
     * When you upgrade or downgrade the configurations of multiple sharded cluster instances in batches, the specifications of the instances are limited. For example, if you want to expand the storage capacity of the instances, the storage capacity of the instances after expansion must be greater than the current capacity. When the specifications of multiple sharded cluster instances are different, limits are defined based on the specifications of a random sharded cluster instance. In this case, you may be unable to upgrade or downgrade the configurations of the instances. In this case, we recommend that you call the ModifyNodeSpec operation to individually change the configurations of each sharded cluster instance.</p>
     * 
     * @param request the request parameters of ModifyNodeSpecBatch  ModifyNodeSpecBatchRequest
     * @return ModifyNodeSpecBatchResponse
     */
    CompletableFuture<ModifyNodeSpecBatchResponse> modifyNodeSpecBatch(ModifyNodeSpecBatchRequest request);

    /**
     * <b>description</b> :
     * <p>  The instance must be in the Running state when you call this operation.</p>
     * <ul>
     * <li>If you call this operation to modify specific instance parameters and the modification for part of the parameters can take effect only after an instance restart, the instance is automatically restarted after this operation is called. You can call the <a href="https://help.aliyun.com/document_detail/67618.html">DescribeParameterTemplates</a> operation to query the parameters that take effect only after the instance is restarted.</li>
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
     * <p> For a sharded cluster instance, the bound ECS security group takes effect only for mongos nodes.</p>
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
     * <p>The actions performed by this operation for a task vary based on the current state of the task. The supported actions for a task can be obtained from the value of the actionInfo parameter in the DescribeHistoryTasks operation.</p>
     * 
     * @param request the request parameters of ModifyTaskInfo  ModifyTaskInfoRequest
     * @return ModifyTaskInfoResponse
     */
    CompletableFuture<ModifyTaskInfoResponse> modifyTaskInfo(ModifyTaskInfoRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation can be used to release the internal endpoint of a shard or Configserver node in a sharded cluster instance. For more information, see <a href="https://help.aliyun.com/document_detail/134067.html">Release the endpoint of a shard or Configserver node</a>.</p>
     * <ul>
     * <li>To release the public endpoint of a shard or Configserver node in a sharded cluster instance, you can call the <a href="https://help.aliyun.com/document_detail/67604.html">ReleasePublicNetworkAddress</a> operation.</li>
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
     * <b>description</b> :
     * <blockquote>
     * <p> This operation can be used to reset only the password of the root account of an instance.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ResetAccountPassword  ResetAccountPasswordRequest
     * @return ResetAccountPasswordResponse
     */
    CompletableFuture<ResetAccountPasswordResponse> resetAccountPassword(ResetAccountPasswordRequest request);

    /**
     * <b>description</b> :
     * <p>This operation can also be used to restart an instance, or restart a shard or mongos node in a sharded cluster instance.</p>
     * 
     * @param request the request parameters of RestartDBInstance  RestartDBInstanceRequest
     * @return RestartDBInstanceResponse
     */
    CompletableFuture<RestartDBInstanceResponse> restartDBInstance(RestartDBInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to restart a node in a replica set instance or a child instance in a sharded cluster instance.</p>
     * <blockquote>
     * <p> When you call this operation, the instance must meet the following requirements:</p>
     * </blockquote>
     * <ul>
     * <li>The instance is in the Running state.</li>
     * <li>The instance is a replica set or sharded cluster instance of the standard edition.</li>
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
     * <p>  The instance is an ApsaraDB for MongoDB sharded cluster instance that runs MongoDB 4.4 or later and uses enhanced SSDs (ESSDs) to store data.</p>
     * <ul>
     * <li>You can call the TransferClusterBackup operation only for instances that are created before October 19, 2023 to switch the instances to the cluster backup mode. Cloud disk-based sharded cluster instances that are created on or after October 19, 2023 are set to the cluster backup mode by default.</li>
     * </ul>
     * 
     * @param request the request parameters of TransferClusterBackup  TransferClusterBackupRequest
     * @return TransferClusterBackupResponse
     */
    CompletableFuture<TransferClusterBackupResponse> transferClusterBackup(TransferClusterBackupRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and <a href="https://www.alibabacloud.com/product/apsaradb-for-mongodb/pricing">pricing</a> of ApsaraDB for MongoDB
     * Before you call this API operation, make sure that the ApsaraDB for MongoDB instance meets the following requirements:</p>
     * <ul>
     * <li>The instance is in the Running state.</li>
     * <li>Your instance has no unpaid billing method change orders.</li>
     * <li>The instance type is available for purchase. For more information about unavailable instance types, see <a href="https://help.aliyun.com/document_detail/57141.html">Instance types</a>.<blockquote>
     * <p>To change the billing method of an instance whose instance type is no longer available to purchase, call the <a href="https://help.aliyun.com/document_detail/61816.html">ModifyDBInstanceSpec</a> or <a href="https://help.aliyun.com/document_detail/61923.html">ModifyNodeSpec</a> operation to change the instance type first.</p>
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
     * <p> To change the billing method of an instance whose instance type is no longer available to subscription, call the <a href="https://help.aliyun.com/document_detail/61816.html">ModifyDBInstanceSpec</a> or <a href="https://help.aliyun.com/document_detail/61923.html">ModifyNodeSpec</a> operation to first change the instance type.</p>
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
     * <li>The available database versions depend on the storage engine used by the instance. For more information, see <a href="https://help.aliyun.com/document_detail/398673.html">Upgrades of MongoDB major versions</a>. You can also call the <a href="https://help.aliyun.com/document_detail/141355.html">DescribeAvailableEngineVersion</a> operation to query the available database versions.</li>
     * <li>You cannot downgrade the MongoDB version of an instance after you upgrade it.</li>
     * <li>The instance is automatically restarted for two to three times during the upgrade process. Make sure that you upgrade the instance during off-peak hours.</li>
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
