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
     * <b>description</b> :
     * <p>This operation is available only for cluster instances that use cloud disks.</p>
     * 
     * @param request the request parameters of AddShardingNode  AddShardingNodeRequest
     * @return AddShardingNodeResponse
     */
    CompletableFuture<AddShardingNodeResponse> addShardingNode(AddShardingNodeRequest request);

    /**
     * <b>description</b> :
     * <p>Clients can bypass proxy nodes and use private endpoints to connect to cluster instances. This is similar to the connection to native Redis clusters. The direct connection mode can reduce communication overheads and the response time of Tair (Redis OSS-compatible).
     * To call this operation, make sure that the instance meets the following requirements:</p>
     * <ul>
     * <li>The instance is a cluster instance.</li>
     * <li>The instance is deployed in classic mode.</li>
     * <li>The instance is deployed in a virtual private cloud (VPC). If the instance is deployed in the classic network, you can call the <a href="https://help.aliyun.com/document_detail/473797.html">SwitchNetwork</a> operation to change the network type to VPC.</li>
     * <li>SSL encryption is disabled for the instance. If SSL encryption is enabled, you can call the <a href="https://help.aliyun.com/document_detail/473838.html">ModifyInstanceSSL</a> operation to disable SSL encryption.</li>
     * </ul>
     * 
     * @param request the request parameters of AllocateDirectConnection  AllocateDirectConnectionRequest
     * @return AllocateDirectConnectionResponse
     */
    CompletableFuture<AllocateDirectConnectionResponse> allocateDirectConnection(AllocateDirectConnectionRequest request);

    /**
     * <b>description</b> :
     * <p>You can also apply for public endpoints in the ApsaraDB for Redis console. For more information, see <a href="https://help.aliyun.com/document_detail/43850.html">Use a public endpoint to connect to an ApsaraDB for Redis instance</a>.</p>
     * 
     * @param request the request parameters of AllocateInstancePublicConnection  AllocateInstancePublicConnectionRequest
     * @return AllocateInstancePublicConnectionResponse
     */
    CompletableFuture<AllocateInstancePublicConnectionResponse> allocateInstancePublicConnection(AllocateInstancePublicConnectionRequest request);

    /**
     * <b>description</b> :
     * <p>O\&amp;M events cannot be canceled in the following scenarios:</p>
     * <ul>
     * <li>The allowCancel parameter is set to 0.</li>
     * <li>The current time is later than the start time of the O\&amp;M event.</li>
     * <li>The state value of the O\&amp;M event is not 3.</li>
     * </ul>
     * 
     * @param request the request parameters of CancelActiveOperationTasks  CancelActiveOperationTasksRequest
     * @return CancelActiveOperationTasksResponse
     */
    CompletableFuture<CancelActiveOperationTasksResponse> cancelActiveOperationTasks(CancelActiveOperationTasksRequest request);

    /**
     * <b>description</b> :
     * <p>  For information about Transparent Data Encryption (TDE) and the usage notes of TDE, see <a href="https://help.aliyun.com/document_detail/265913.html">Enable TDE</a>.</p>
     * <ul>
     * <li>If the Tair (Redis OSS-compatible) instance is authorized to use KMS, you can call the <a href="https://help.aliyun.com/document_detail/473859.html">ModifyInstanceTDE</a> operation to enable TDE.</li>
     * </ul>
     * 
     * @param request the request parameters of CheckCloudResourceAuthorized  CheckCloudResourceAuthorizedRequest
     * @return CheckCloudResourceAuthorizedResponse
     */
    CompletableFuture<CheckCloudResourceAuthorizedResponse> checkCloudResourceAuthorized(CheckCloudResourceAuthorizedRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is supported only for instances that are compatible with Redis 4.0 or later.</p>
     * <ul>
     * <li>The instance must be in the running state.</li>
     * <li>You can create up to 18 accounts for an instance.<blockquote>
     * <p> For more information about how to create an account in the console, see <a href="https://help.aliyun.com/document_detail/92665.html">Manage database accounts</a>.</p>
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
     * <p>You can also back up an instance in the Tair (Redis OSS-compatible) console. For more information, see <a href="https://help.aliyun.com/document_detail/43886.html">Backup and recovery</a>.</p>
     * 
     * @param request the request parameters of CreateBackup  CreateBackupRequest
     * @return CreateBackupResponse
     */
    CompletableFuture<CreateBackupResponse> createBackup(CreateBackupRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is no longer available. Use the new operation. For more information, see <a href="https://help.aliyun.com/document_detail/184226.html">Real-time key statistics and offline key analysis</a>.</p>
     * 
     * @param request the request parameters of CreateCacheAnalysisTask  CreateCacheAnalysisTaskRequest
     * @return CreateCacheAnalysisTaskResponse
     */
    CompletableFuture<CreateCacheAnalysisTaskResponse> createCacheAnalysisTask(CreateCacheAnalysisTaskRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to convert an existing instance to the first child instance of a distributed instance. After the instance is converted, the distributed instance is created. Before you call this operation, make sure that the following requirements are met:</p>
     * <ul>
     * <li>The instance that you want to convert must be a Tair <a href="https://help.aliyun.com/document_detail/126164.html">DRAM-based</a> instance that uses the classic deployment mode.</li>
     * <li>If the existing instance is a cluster instance, the direct connection mode must be disabled for the instance. For more information, see <a href="https://help.aliyun.com/document_detail/150047.html">Release a private endpoint</a>.<blockquote>
     * <p> You can also call the <a href="https://help.aliyun.com/document_detail/473757.html">CreateInstance</a> operation to create an instance that is specified as the first child instance of a distributed instance. After the child instance is created, the distributed instance to which the child instance belongs is created.</p>
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
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and <a href="https://help.aliyun.com/document_detail/54532.html">pricing</a> of Tair (Redis OSS-compatible).
     * You can call this operation to create a Tair (Redis OSS-compatible) instance or a classic Tair DRAM-based instance. To create a cloud-native Tair instance, call the <a href="https://help.aliyun.com/document_detail/473770.html">CreateTairInstance</a> operation.</p>
     * <blockquote>
     * <p>For more information about how to create an instance that meets your requirements in the Tair (Redis OSS-compatible) console, see <a href="https://help.aliyun.com/document_detail/26351.html">Step 1: Create an instance</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateInstance  CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and <a href="https://help.aliyun.com/document_detail/54532.html">pricing</a> of Tair (Redis OSS-compatible).</p>
     * <blockquote>
     * <p> You can call this operation to create classic Redis Open-Source Edition instances or classic Tair DRAM-based instances. We recommend that you use an API operation for creating a single instance:</p>
     * </blockquote>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/473757.html">CreateInstance</a>: creates a Redis Open-Source instance or a classic Tair DRAM-based instance.</li>
     * <li><a href="https://help.aliyun.com/document_detail/473770.html">CreateTairInstance</a>: creates a Tair (Enterprise Edition) instance. The instance can be a DRAM-based, persistent memory-optimized, or ESSD/SSD-based instance.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateInstances  CreateInstancesRequest
     * @return CreateInstancesResponse
     */
    CompletableFuture<CreateInstancesResponse> createInstances(CreateInstancesRequest request);

    /**
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
     * <b>description</b> :
     * <p>For information about instance selection, see <a href="https://help.aliyun.com/document_detail/223808.html">Instructions for selecting an appropriate Tair (Redis OSS-compatible) instance</a>.
     * Before you call this operation, make sure that you understand the billing methods and <a href="https://help.aliyun.com/document_detail/54532.html">pricing</a> of Tair (Redis OSS-compatible).</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>For information about how to create an instance in the console, see <a href="https://help.aliyun.com/document_detail/26351.html">Step 1: Create an instance</a>.</li>
     * <li>To create other types of instances, such as Redis Open-Source Edition instances or <a href="https://help.aliyun.com/document_detail/126164.html">Tair DRAM-based</a> instances, you can call the <a href="https://help.aliyun.com/document_detail/473757.html">CreateInstance</a> operation.</li>
     * </ul>
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
     * <p>  This operation is supported only for instances that are compatible with Redis 4.0 or later.</p>
     * <ul>
     * <li>The instance must be in the Running state.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteAccount  DeleteAccountRequest
     * @return DeleteAccountResponse
     */
    CompletableFuture<DeleteAccountResponse> deleteAccount(DeleteAccountRequest request);

    /**
     * @param request the request parameters of DeleteBackup  DeleteBackupRequest
     * @return DeleteBackupResponse
     */
    CompletableFuture<DeleteBackupResponse> deleteBackup(DeleteBackupRequest request);

    /**
     * <b>description</b> :
     * <p>Before you delete an IP whitelist template, you must unbind (disassociate) the instances that are currently associated with the template.</p>
     * 
     * @param request the request parameters of DeleteGlobalSecurityIPGroup  DeleteGlobalSecurityIPGroupRequest
     * @return DeleteGlobalSecurityIPGroupResponse
     */
    CompletableFuture<DeleteGlobalSecurityIPGroupResponse> deleteGlobalSecurityIPGroup(DeleteGlobalSecurityIPGroupRequest request);

    /**
     * <b>description</b> :
     * <p>For more information about how to perform the corresponding operation in the console, see <a href="https://help.aliyun.com/document_detail/43882.html">Release an instance</a>.
     * Before you call this operation, make sure that the following requirements are met:</p>
     * <ul>
     * <li>The instance is in the running state.</li>
     * <li>The instance is charged on a pay-as-you-go basis.<blockquote>
     * <p> You cannot call this operation to release a subscription instance, which is automatically released when it expires. To release a subscription instance before it expires, submit a ticket.</p>
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
     * <b>description</b> :
     * <p>You can also remove data shards from an instance in the Tair (Redis OSS-compatible) console. For more information, see <a href="https://help.aliyun.com/document_detail/198082.html">Adjust the number of shards for an instance with cloud disks</a>.\
     * Before you call this operation, make sure that the instance meets the following requirements:</p>
     * <ul>
     * <li>The instance is a persistent memory-optimized instance in the cluster architecture. For more information about persistent memory-optimized instances, see <a href="https://help.aliyun.com/document_detail/183956.html">Persistent memory-optimized instances</a>.</li>
     * <li>The instance has more than one data shard.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteShardingNode  DeleteShardingNodeRequest
     * @return DeleteShardingNodeResponse
     */
    CompletableFuture<DeleteShardingNodeResponse> deleteShardingNode(DeleteShardingNodeRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> Only Tair (Redis OSS-compatible) instances of Redis 4.0 or later are supported.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeAccounts  DescribeAccountsRequest
     * @return DescribeAccountsResponse
     */
    CompletableFuture<DescribeAccountsResponse> describeAccounts(DescribeAccountsRequest request);

    /**
     * <b>description</b> :
     * <p>After you have called this API operation and queried the information about a specific O&amp;M task, you can also call the <a href="https://help.aliyun.com/document_detail/473864.html">ModifyActiveOperationTask</a> operation to modify the scheduled switchover time of the O&amp;M task.</p>
     * 
     * @param request the request parameters of DescribeActiveOperationTask  DescribeActiveOperationTaskRequest
     * @return DescribeActiveOperationTaskResponse
     */
    CompletableFuture<DescribeActiveOperationTaskResponse> describeActiveOperationTask(DescribeActiveOperationTaskRequest request);

    /**
     * @param request the request parameters of DescribeActiveOperationTasks  DescribeActiveOperationTasksRequest
     * @return DescribeActiveOperationTasksResponse
     */
    CompletableFuture<DescribeActiveOperationTasksResponse> describeActiveOperationTasks(DescribeActiveOperationTasksRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, you must enable the audit log feature for the instance. For more information, see <a href="https://help.aliyun.com/document_detail/473829.html">ModifyAuditLogConfig</a> or <a href="https://help.aliyun.com/document_detail/102015.html">Enable the audit log feature</a>.</p>
     * 
     * @param request the request parameters of DescribeAuditLogConfig  DescribeAuditLogConfigRequest
     * @return DescribeAuditLogConfigResponse
     */
    CompletableFuture<DescribeAuditLogConfigResponse> describeAuditLogConfig(DescribeAuditLogConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, you must enable the audit log feature for the instance. For more information, see <a href="https://help.aliyun.com/document_detail/473829.html">ModifyAuditLogConfig</a>.</p>
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
     * @param request the request parameters of DescribeBackups  DescribeBackupsRequest
     * @return DescribeBackupsResponse
     */
    CompletableFuture<DescribeBackupsResponse> describeBackups(DescribeBackupsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Tair (Redis OSS-compatible) has optimized the cache analytics feature to improve user experience. This API operation is phased out. You can use the new API operation for cache analytics. For more information, see <a href="https://help.aliyun.com/document_detail/186019.html">API operations for cache analytics are upgraded</a>.
     * Before you call this operation, make sure that the instance meets the following requirements:</p>
     * </blockquote>
     * <ul>
     * <li>The engine version of the instance is Redis 4.0 or later.</li>
     * <li>The instance uses the latest minor version. For more information about how to check whether to update the minor version of an instance, see <a href="https://help.aliyun.com/document_detail/129203.html">How do I check whether the minor version of a Tair (Redis OSS-compatible) instance is the latest?</a></li>
     * </ul>
     * 
     * @param request the request parameters of DescribeCacheAnalysisReport  DescribeCacheAnalysisReportRequest
     * @return DescribeCacheAnalysisReportResponse
     */
    CompletableFuture<DescribeCacheAnalysisReportResponse> describeCacheAnalysisReport(DescribeCacheAnalysisReportRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Tair (Redis OSS-compatible) has optimized the cache analytics feature to improve user experience. This API operation is phased out. You can use the new API operation for cache analytics. For more information, see <a href="https://help.aliyun.com/document_detail/186019.html">API operations for cache analytics are upgraded</a>.
     * Before you call this operation, make sure that the instance meets the following requirements:</p>
     * </blockquote>
     * <ul>
     * <li>The engine version of the instance is Redis 4.0 or later.</li>
     * <li>The instance uses the latest minor version. For more information about how to check whether to update the minor version of an instance, see <a href="https://help.aliyun.com/document_detail/129203.html">How do I check whether the minor version of a Tair (Redis OSS-compatible) instance is the latest?</a></li>
     * </ul>
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
     * <p>This API operation is applicable only to Tair (Redis OSS-compatible) instances that use <a href="https://help.aliyun.com/document_detail/188068.html">cloud disks</a> and the <a href="https://help.aliyun.com/document_detail/52228.html">cluster architecture</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeClusterMemberInfo  DescribeClusterMemberInfoRequest
     * @return DescribeClusterMemberInfoResponse
     */
    CompletableFuture<DescribeClusterMemberInfoResponse> describeClusterMemberInfo(DescribeClusterMemberInfoRequest request);

    /**
     * @param request the request parameters of DescribeDBInstanceNetInfo  DescribeDBInstanceNetInfoRequest
     * @return DescribeDBInstanceNetInfoResponse
     */
    CompletableFuture<DescribeDBInstanceNetInfoResponse> describeDBInstanceNetInfo(DescribeDBInstanceNetInfoRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Only instances that use cloud disks support this operation.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDBNodeDirectVipInfo  DescribeDBNodeDirectVipInfoRequest
     * @return DescribeDBNodeDirectVipInfoResponse
     */
    CompletableFuture<DescribeDBNodeDirectVipInfoResponse> describeDBNodeDirectVipInfo(DescribeDBNodeDirectVipInfoRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>If you want to query the information about Tair (Redis OSS-compatible) instances that are not deployed in a dedicated cluster, call the <a href="https://help.aliyun.com/document_detail/473779.html">DescribeInstanceAttribute</a> operation.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDedicatedClusterInstanceList  DescribeDedicatedClusterInstanceListRequest
     * @return DescribeDedicatedClusterInstanceListResponse
     */
    CompletableFuture<DescribeDedicatedClusterInstanceListResponse> describeDedicatedClusterInstanceList(DescribeDedicatedClusterInstanceListRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, TDE must be enabled for the Tair (Redis OSS-compatible) instance by using a custom key. For more information, see <a href="https://help.aliyun.com/document_detail/473859.html">ModifyInstanceTDE</a>.</p>
     * <blockquote>
     * <p>For more information about TDE, see <a href="https://help.aliyun.com/document_detail/265913.html">Enable TDE</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeEncryptionKey  DescribeEncryptionKeyRequest
     * @return DescribeEncryptionKeyResponse
     */
    CompletableFuture<DescribeEncryptionKeyResponse> describeEncryptionKey(DescribeEncryptionKeyRequest request);

    /**
     * <b>description</b> :
     * <p>  You can specify a custom key when you call the <a href="https://help.aliyun.com/document_detail/473859.html">ModifyInstanceTDE</a> operation to enable Transparent Data Encryption (TDE). You can call the DescribeEncryptionKeyList operation to query the custom keys that are in use. To create a custom key, you can call the <a href="https://help.aliyun.com/document_detail/28947.html">CreateKey</a> operation of Key Management Service (KMS).</p>
     * <ul>
     * <li>For more information about TDE and the usage notes of TDE, see <a href="https://help.aliyun.com/document_detail/265913.html">Enable TDE</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeEncryptionKeyList  DescribeEncryptionKeyListRequest
     * @return DescribeEncryptionKeyListResponse
     */
    CompletableFuture<DescribeEncryptionKeyListResponse> describeEncryptionKeyList(DescribeEncryptionKeyListRequest request);

    /**
     * <b>description</b> :
     * <h2>Debugging</h2>
     * <p><a href="https://api.aliyun.com/#product=R-kvstore%5C&api=DescribeEngineVersion%5C&type=RPC%5C&version=2015-01-01">OpenAPI Explorer automatically calculates the signature value. For your convenience, we recommend that you call this operation in OpenAPI Explorer. OpenAPI Explorer dynamically generates the sample code of the operation for different SDKs.</a></p>
     * 
     * @param request the request parameters of DescribeEngineVersion  DescribeEngineVersionRequest
     * @return DescribeEngineVersionResponse
     */
    CompletableFuture<DescribeEngineVersionResponse> describeEngineVersion(DescribeEngineVersionRequest request);

    /**
     * <b>description</b> :
     * <h2>Debugging</h2>
     * <p><a href="https://api.aliyun.com/#product=R-kvstore%5C&api=DescribeGlobalDistributeCache%5C&type=RPC%5C&version=2015-01-01">OpenAPI Explorer automatically calculates the signature value. For your convenience, we recommend that you call this operation in OpenAPI Explorer. OpenAPI Explorer dynamically generates the sample code of the operation for different SDKs.</a></p>
     * 
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
     * <b>description</b> :
     * <p>You can also query the performance monitoring data of an instance in the Tair console. For more information, see <a href="https://help.aliyun.com/document_detail/43887.html">Metrics</a>.</p>
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
     * <b>description</b> :
     * <p>This operation is available only for instances that use cloud disks.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/473847.html">DescribeParameters</a> operation to query the parameter settings of instances that use local disks.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeInstanceConfig  DescribeInstanceConfigRequest
     * @return DescribeInstanceConfigResponse
     */
    CompletableFuture<DescribeInstanceConfigResponse> describeInstanceConfig(DescribeInstanceConfigRequest request);

    /**
     * <b>description</b> :
     * <p>SSL encryption is supported for Tair (Redis OSS-compatible) 2.8 standard master-replica instances, Tair (Redis OSS-compatible) 2.8 master-replica cluster instances, and Tair (Redis OSS-compatible) 4.0 master-replica cluster instances. You can enable SSL encryption to enhance data transmission security.
     * You can use one of the following methods to enable or disable SSL encryption or update the SSL certificate for a Tair (Redis OSS-compatible) instance:</p>
     * <ul>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/473838.html">ModifyInstanceSSL</a> operation.</li>
     * <li>Enable or disable SSL encryption or update the SSL certificate in the Tair (Redis OSS-compatible) console. For more information, see <a href="https://help.aliyun.com/document_detail/84898.html">Configure SSL encryption</a>.<blockquote>
     * <p>After SSL encryption is enabled, the instance may respond slower.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeInstanceSSL  DescribeInstanceSSLRequest
     * @return DescribeInstanceSSLResponse
     */
    CompletableFuture<DescribeInstanceSSLResponse> describeInstanceSSL(DescribeInstanceSSLRequest request);

    /**
     * <b>description</b> :
     * <p>For more information about TDE and the usage notes of TDE, see <a href="https://help.aliyun.com/document_detail/265913.html">Enable TDE</a>.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/473859.html">ModifyInstanceTDE</a> to enable or disable TDE.</p>
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
     * <p>If you do not specify the InstanceIds parameter when you call this operation, the overview information of all instances is returned.</p>
     * <blockquote>
     * <p>This operation returns non-paged results.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeInstancesOverview  DescribeInstancesOverviewRequest
     * @return DescribeInstancesOverviewResponse
     */
    CompletableFuture<DescribeInstancesOverviewResponse> describeInstancesOverview(DescribeInstancesOverviewRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/473771.html">EnableAdditionalBandwidth</a> operation to increase the internal bandwidth of an instance.</p>
     * 
     * @param request the request parameters of DescribeIntranetAttribute  DescribeIntranetAttributeRequest
     * @return DescribeIntranetAttributeResponse
     */
    CompletableFuture<DescribeIntranetAttributeResponse> describeIntranetAttribute(DescribeIntranetAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>This parameter is supported only for cluster and read/write splitting instances.</p>
     * 
     * @param request the request parameters of DescribeLogicInstanceTopology  DescribeLogicInstanceTopologyRequest
     * @return DescribeLogicInstanceTopologyResponse
     */
    CompletableFuture<DescribeLogicInstanceTopologyResponse> describeLogicInstanceTopology(DescribeLogicInstanceTopologyRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> To improve user experience, Tair has upgraded the monitoring metrics. The DescribeMonitorItems operation is phased out. For more information, see <a href="https://help.aliyun.com/document_detail/189893.html">The DescribeMonitorItems operation of Tair (Redis OSS-compatible) is phased out</a>.
     * After you call this operation to retrieve a list of metrics for a specified instance, you can call the <a href="https://help.aliyun.com/document_detail/473827.html">DescribeHistoryMonitorValues</a> operation to query the monitoring history of the instance.</p>
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
     * <p>After you call this operation to query the parameters and default values of an instance, you can call the <a href="https://help.aliyun.com/document_detail/473844.html">ModifyInstanceConfig</a> operation to reconfigure the parameters of the instance.</p>
     * 
     * @param request the request parameters of DescribeParameterTemplates  DescribeParameterTemplatesRequest
     * @return DescribeParameterTemplatesResponse
     */
    CompletableFuture<DescribeParameterTemplatesResponse> describeParameterTemplates(DescribeParameterTemplatesRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is applicable only to classic instances.</p>
     * <blockquote>
     * <p> If the instance is deployed in cloud-native mode, you can use the <a href="https://help.aliyun.com/document_detail/473846.html">DescribeInstanceConfig</a> operation to query the configuration and operational parameters of the instance.</p>
     * </blockquote>
     * 
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
     * <p>For more information about how to view the operational logs of an instance in the Tair (Redis OSS-compatible) console, see <a href="https://help.aliyun.com/document_detail/101713.html">View active logs</a>.
     * This operation can be called up to 100 times per minute.</p>
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
     * <p>You can also query slow logs in the Tair (Redis OSS-compatible) console. For more information, see <a href="https://help.aliyun.com/document_detail/95874.html">Query slow logs of an instance</a>. This operation can be called up to 100 times per minute.</p>
     * 
     * @param request the request parameters of DescribeSlowLogRecords  DescribeSlowLogRecordsRequest
     * @return DescribeSlowLogRecordsResponse
     */
    CompletableFuture<DescribeSlowLogRecordsResponse> describeSlowLogRecords(DescribeSlowLogRecordsRequest request);

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
     * @param request the request parameters of DescribeTairKVCacheInferInstances  DescribeTairKVCacheInferInstancesRequest
     * @return DescribeTairKVCacheInferInstancesResponse
     */
    CompletableFuture<DescribeTairKVCacheInferInstancesResponse> describeTairKVCacheInferInstances(DescribeTairKVCacheInferInstancesRequest request);

    /**
     * @param request the request parameters of DescribeZones  DescribeZonesRequest
     * @return DescribeZonesResponse
     */
    CompletableFuture<DescribeZonesResponse> describeZones(DescribeZonesRequest request);

    /**
     * <b>description</b> :
     * <p>If you enable the bandwidth auto scaling feature and call this operation at the same time, bandwidth auto scaling takes precedence. During bandwidth scale-back, the instance is scaled back to the default bandwidth of the instance type. For more information about the limits, costs, and FAQ about this feature, see <a href="https://help.aliyun.com/document_detail/102588.html">Adjust the bandwidth of an instance</a>.</p>
     * <blockquote>
     * <p> Before you call this operation, you can call the <a href="https://help.aliyun.com/document_detail/473782.html">DescribeRoleZoneInfo</a> operation to query the current bandwidth of each data node in an instance.</p>
     * </blockquote>
     * 
     * @param request the request parameters of EnableAdditionalBandwidth  EnableAdditionalBandwidthRequest
     * @return EnableAdditionalBandwidthResponse
     */
    CompletableFuture<EnableAdditionalBandwidthResponse> enableAdditionalBandwidth(EnableAdditionalBandwidthRequest request);

    /**
     * <b>description</b> :
     * <p>For more information about how to clear the expired keys in the Tair (Redis OSS-compatible) console, see <a href="https://help.aliyun.com/document_detail/43881.html">Clear data</a>.</p>
     * <blockquote>
     * <p> Expired keys cannot be recovered after they are deleted. Exercise caution when you call this operation.</p>
     * </blockquote>
     * 
     * @param request the request parameters of FlushExpireKeys  FlushExpireKeysRequest
     * @return FlushExpireKeysResponse
     */
    CompletableFuture<FlushExpireKeysResponse> flushExpireKeys(FlushExpireKeysRequest request);

    /**
     * @param request the request parameters of FlushInstance  FlushInstanceRequest
     * @return FlushInstanceResponse
     */
    CompletableFuture<FlushInstanceResponse> flushInstance(FlushInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>Each Tair (Redis OSS-compatible) instance can contain up to 256 databases named from DB0 to DB255. Each database does not have a separate memory usage limit. The memory capacity that a database can use is subject to the total memory limit of the instance. You can execute the <code>SELECT</code> statement to switch between databases. For more information, see <a href="https://help.aliyun.com/document_detail/38688.html">What is the size of each database on a Tair (Redis OSS-compatible) instance, and how can I choose databases?</a></p>
     * <blockquote>
     * <p> This operation is available only for cloud-native instances that use cloud disks.</p>
     * </blockquote>
     * 
     * @param request the request parameters of FlushInstanceForDB  FlushInstanceForDBRequest
     * @return FlushInstanceForDBResponse
     */
    CompletableFuture<FlushInstanceForDBResponse> flushInstanceForDB(FlushInstanceForDBRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>Only Tair (Redis OSS-compatible) instances of Redis 4.0 or later are supported.</li>
     * <li>The Tair (Redis OSS-compatible) instance must be in the running state.</li>
     * </ul>
     * 
     * @param request the request parameters of GrantAccountPrivilege  GrantAccountPrivilegeRequest
     * @return GrantAccountPrivilegeResponse
     */
    CompletableFuture<GrantAccountPrivilegeResponse> grantAccountPrivilege(GrantAccountPrivilegeRequest request);

    /**
     * <b>description</b> :
     * <p>The log management feature of Tair (Redis OSS-compatible) requires the resources of <a href="https://help.aliyun.com/document_detail/48869.html">Simple Log Service</a>. To use the log management feature, you can call this operation to assign the AliyunServiceRoleForKvstore service-linked role to Tair (Redis OSS-compatible). For more information, see <a href="https://help.aliyun.com/document_detail/184337.html">Service-linked role of Tair (Redis OSS-compatible)</a>.</p>
     * 
     * @param request the request parameters of InitializeKvstorePermission  InitializeKvstorePermissionRequest
     * @return InitializeKvstorePermissionResponse
     */
    CompletableFuture<InitializeKvstorePermissionResponse> initializeKvstorePermission(InitializeKvstorePermissionRequest request);

    /**
     * <b>description</b> :
     * <p>You can also query the relationships between instances and tags in the Tair (Redis OSS-compatible) console. For more information, see <a href="https://help.aliyun.com/document_detail/119160.html">Filter Tair (Redis OSS-compatible) instances by tag</a> and <a href="https://help.aliyun.com/document_detail/134038.html">View tags bound to an instance</a>.</p>
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
     * @param request the request parameters of MasterNodeShutDownFailOver  MasterNodeShutDownFailOverRequest
     * @return MasterNodeShutDownFailOverResponse
     */
    CompletableFuture<MasterNodeShutDownFailOverResponse> masterNodeShutDownFailOver(MasterNodeShutDownFailOverRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, you must release the public endpoint (if any) of the instance. For more information, see <a href="https://help.aliyun.com/document_detail/106272.html">Migrate an instance across zones</a>.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>If the network type of an Tair (Redis OSS-compatible) instance is switched from classic network to Virtual Private Cloud (VPC), and the classic network endpoint is retained, you can migrate the instance across zones only after the classic network endpoint is released upon expiration.</li>
     * <li>After the instance is migrated, the endpoint of the instance remains unchanged. However, the virtual IP address (VIP) is changed. We recommend that you use the endpoint instead of the VIP to connect to the instance.</li>
     * </ul>
     * 
     * @param request the request parameters of MigrateToOtherZone  MigrateToOtherZoneRequest
     * @return MigrateToOtherZoneResponse
     */
    CompletableFuture<MigrateToOtherZoneResponse> migrateToOtherZone(MigrateToOtherZoneRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is supported only for instances that run Redis 4.0 or later.</p>
     * 
     * @param request the request parameters of ModifyAccountDescription  ModifyAccountDescriptionRequest
     * @return ModifyAccountDescriptionResponse
     */
    CompletableFuture<ModifyAccountDescriptionResponse> modifyAccountDescription(ModifyAccountDescriptionRequest request);

    /**
     * @param request the request parameters of ModifyAccountPassword  ModifyAccountPasswordRequest
     * @return ModifyAccountPasswordResponse
     */
    CompletableFuture<ModifyAccountPasswordResponse> modifyAccountPassword(ModifyAccountPasswordRequest request);

    /**
     * <b>description</b> :
     * <p>You can receive notifications for Tair (Redis OSS-compatible) events such as instance migration and version upgrade by text message, phone call, email, internal message, or by using the console. You can also change the scheduled switchover time of a task by using the console. For more information, see <a href="https://help.aliyun.com/document_detail/187022.html">Query or manage pending events</a>.</p>
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
     * <p>Before you call this operation, make sure that you understand the billing methods and <a href="https://help.aliyun.com/document_detail/54532.html">pricing</a> of the audit log feature.
     * Before you call this operation, make sure that the Tair (Redis OSS-compatible) instance meets the following requirements:</p>
     * <ul>
     * <li>The instance is a Tair (Redis OSS-compatible) Community Edition instance or Tair <a href="https://help.aliyun.com/document_detail/126164.html">DRAM-based instance</a>.</li>
     * <li>The engine version of the instance is Redis 4.0 or later, and the latest minor version is used. You can call the <a href="https://help.aliyun.com/document_detail/473781.html">DescribeEngineVersion</a> operation to check whether the instance uses the latest major version and minor version.</li>
     * </ul>
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
     * <p>You can also modify the endpoint or port number of an instance in the Tair (Redis OSS-compatible) console. For more information, see <a href="https://help.aliyun.com/document_detail/85683.html">Change the endpoint or port number of an instance</a>.</p>
     * 
     * @param request the request parameters of ModifyDBInstanceConnectionString  ModifyDBInstanceConnectionStringRequest
     * @return ModifyDBInstanceConnectionStringResponse
     */
    CompletableFuture<ModifyDBInstanceConnectionStringResponse> modifyDBInstanceConnectionString(ModifyDBInstanceConnectionStringRequest request);

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
     * <p>You can also modify the information of an instance in the Tair (Redis OSS-compatible) console. For more information, see <a href="https://help.aliyun.com/document_detail/43874.html">Change or reset the password</a>.</p>
     * 
     * @param request the request parameters of ModifyInstanceAttribute  ModifyInstanceAttributeRequest
     * @return ModifyInstanceAttributeResponse
     */
    CompletableFuture<ModifyInstanceAttributeResponse> modifyInstanceAttribute(ModifyInstanceAttributeRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Auto-renewal is triggered seven days before the expiration date of the instance.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyInstanceAutoRenewalAttribute  ModifyInstanceAutoRenewalAttributeRequest
     * @return ModifyInstanceAutoRenewalAttributeResponse
     */
    CompletableFuture<ModifyInstanceAutoRenewalAttributeResponse> modifyInstanceAutoRenewalAttribute(ModifyInstanceAutoRenewalAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you understand the billing methods and pricing of instance bandwidth. Tair (Redis OSS-compatible) charges fees per hour based on the amount and usage duration of the extra bandwidth that you purchase. The fees vary based on the region that you select. For more information, see <a href="https://help.aliyun.com/document_detail/54532.html">Billable items</a>.</p>
     * <ul>
     * <li>The bandwidth of an instance or a shard can be increased by up to six times the default bandwidth of the instance, but the increase in bandwidth cannot exceed 192 Mbit/s. For example, if the default bandwidth of a Tair DRAM-based master-replica instance equipped with 2 GB of memory is 96 Mbit/s, you can increase the bandwidth of the instance by up to 192 Mbit/s. As a result, the maximum bandwidth of the instance is 288 Mbit/s. If the default bandwidth of a Redis Open-Source Edition master-replica instance equipped with 256 MB of memory is 10 Mbit/s, you can increase the bandwidth of the instance by up to 60 Mbit/s. As a result, the maximum bandwidth of the instance is 70 Mbit/s.</li>
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
     * <p>You can also modify the maintenance window of an instance in the Tair (Redis OSS-compatible) console. For more information, see <a href="https://help.aliyun.com/document_detail/55252.html">Set a maintenance window</a>.</p>
     * 
     * @param request the request parameters of ModifyInstanceMaintainTime  ModifyInstanceMaintainTimeRequest
     * @return ModifyInstanceMaintainTimeResponse
     */
    CompletableFuture<ModifyInstanceMaintainTimeResponse> modifyInstanceMaintainTime(ModifyInstanceMaintainTimeRequest request);

    /**
     * <b>description</b> :
     * <p>For more information about the precautions and impacts of the upgrade, see <a href="https://help.aliyun.com/document_detail/101764.html">Upgrade the major version</a>.</p>
     * 
     * @param request the request parameters of ModifyInstanceMajorVersion  ModifyInstanceMajorVersionRequest
     * @return ModifyInstanceMajorVersionResponse
     */
    CompletableFuture<ModifyInstanceMajorVersionResponse> modifyInstanceMajorVersion(ModifyInstanceMajorVersionRequest request);

    /**
     * <b>description</b> :
     * <p>The procedure to update the minor version of an instance varies based on types of Tair (Redis OSS-compatible) instances. For more information, see <a href="https://help.aliyun.com/document_detail/56450.html">Upgrade the minor version</a>.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>Before you call this operation, you can call the <a href="https://help.aliyun.com/document_detail/473781.html">DescribeEngineVersion</a> operation to query the minor version of the current instance.</li>
     * <li>When you switch your workloads over from the original instance to a new instance or from the master node to the replica node in the original instance, you may experience disconnections that last a few seconds. The original instance stays in the read-only state within 60 seconds until all data is synchronized. We recommend that you upgrade the original instance during off-peak hours and make sure that your application is configured to automatically reconnect to the original instance.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyInstanceMinorVersion  ModifyInstanceMinorVersionRequest
     * @return ModifyInstanceMinorVersionResponse
     */
    CompletableFuture<ModifyInstanceMinorVersionResponse> modifyInstanceMinorVersion(ModifyInstanceMinorVersionRequest request);

    /**
     * <b>description</b> :
     * <p>You can also perform this operation in the Tair (Redis OSS-compatible) console. For more information, see <a href="https://help.aliyun.com/document_detail/60062.html">Change the expiration time for the endpoint of the classic network</a>.</p>
     * <blockquote>
     * <p>For more information about how to switch the network type of a Tair (Redis OSS-compatible) instance from classic network to VPC, see <a href="https://help.aliyun.com/document_detail/473797.html">SwitchNetwork</a>.</p>
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
     * <p>You can also configure SSL encryption in the console. For more information, see <a href="https://help.aliyun.com/document_detail/84898.html">Configure SSL encryption</a>.</p>
     * <blockquote>
     * <p> To specify the earliest supported SSL version, you can call the <a href="https://help.aliyun.com/document_detail/473844.html">ModifyInstanceConfig</a> operation to modify the required parameter.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyInstanceSSL  ModifyInstanceSSLRequest
     * @return ModifyInstanceSSLResponse
     */
    CompletableFuture<ModifyInstanceSSLResponse> modifyInstanceSSL(ModifyInstanceSSLRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> For more information about the procedure, impacts, limits, and fees of this operation, see <a href="https://help.aliyun.com/document_detail/26353.html">Change the configurations of an instance</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyInstanceSpec  ModifyInstanceSpecRequest
     * @return ModifyInstanceSpecResponse
     */
    CompletableFuture<ModifyInstanceSpecResponse> modifyInstanceSpec(ModifyInstanceSpecRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>For more information about TDE and the impact of TDE, see <a href="https://help.aliyun.com/document_detail/265913.html">Enable TDE</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyInstanceTDE  ModifyInstanceTDERequest
     * @return ModifyInstanceTDEResponse
     */
    CompletableFuture<ModifyInstanceTDEResponse> modifyInstanceTDE(ModifyInstanceTDERequest request);

    /**
     * <b>description</b> :
     * <p>When the password-free access feature is enabled, Elastic Compute Service (ECS) instances in the same virtual private cloud (VPC) can connect to the Tair instance without a password. You can also use the username and password to connect to the Tair instance.</p>
     * <blockquote>
     * <p>The Tair instance is deployed in a VPC. For more information, see <a href="https://help.aliyun.com/document_detail/85168.html">Enable password-free access</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyInstanceVpcAuthMode  ModifyInstanceVpcAuthModeRequest
     * @return ModifyInstanceVpcAuthModeResponse
     */
    CompletableFuture<ModifyInstanceVpcAuthModeResponse> modifyInstanceVpcAuthMode(ModifyInstanceVpcAuthModeRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>This operation is applicable only to an instance that is deployed in a dedicated cluster. To adjust the bandwidth of a standard instance, call the <a href="https://help.aliyun.com/document_detail/473771.html">EnableAdditionalBandwidth</a> operation.</li>
     * </ul>
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
     * <p> Resource Group allows you to sort resources owned by your Alibaba Cloud account into groups. This simplifies the resource and permission management within your Alibaba Cloud account. For more information, see <a href="https://help.aliyun.com/document_detail/94475.html">What is Resource Management?</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyResourceGroup  ModifyResourceGroupRequest
     * @return ModifyResourceGroupResponse
     */
    CompletableFuture<ModifyResourceGroupResponse> modifyResourceGroup(ModifyResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>After you call this operation, the security groups that are added to the whitelists of the Tair instance are deleted, and the security group specified by the <strong>SecurityGroupId</strong> parameter is added to the whitelists. For more information about how to reset security groups in the Tair console, see <a href="https://help.aliyun.com/document_detail/148267.html">Add security groups</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifySecurityGroupConfiguration  ModifySecurityGroupConfigurationRequest
     * @return ModifySecurityGroupConfigurationResponse
     */
    CompletableFuture<ModifySecurityGroupConfigurationResponse> modifySecurityGroupConfiguration(ModifySecurityGroupConfigurationRequest request);

    /**
     * <b>description</b> :
     * <p>You can also modify the whitelists of an instance in the Tair (Redis OSS-compatible) console. For more information, see <a href="https://help.aliyun.com/document_detail/56464.html">Configure a whitelist for an instance</a>.</p>
     * 
     * @param request the request parameters of ModifySecurityIps  ModifySecurityIpsRequest
     * @return ModifySecurityIpsResponse
     */
    CompletableFuture<ModifySecurityIpsResponse> modifySecurityIps(ModifySecurityIpsRequest request);

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
     * <p>In direct connection mode, clients can bypass proxy nodes and use private endpoints to connect to ApsaraDB for Redis instances. This is similar to the connection to a native Redis cluster. The direct connection mode can reduce communication overheads and the response time of ApsaraDB for Redis. For more information, see <a href="https://help.aliyun.com/document_detail/146901.html">Enable the direct connection mode</a>.</p>
     * 
     * @param request the request parameters of ReleaseDirectConnection  ReleaseDirectConnectionRequest
     * @return ReleaseDirectConnectionResponse
     */
    CompletableFuture<ReleaseDirectConnectionResponse> releaseDirectConnection(ReleaseDirectConnectionRequest request);

    /**
     * <b>description</b> :
     * <p>You can also release the public endpoint for an instance in the Tair (Redis OSS-compatible) console. For more information, see <a href="https://help.aliyun.com/document_detail/125424.html">Release public endpoints</a>.</p>
     * 
     * @param request the request parameters of ReleaseInstancePublicConnection  ReleaseInstancePublicConnectionRequest
     * @return ReleaseInstancePublicConnectionResponse
     */
    CompletableFuture<ReleaseInstancePublicConnectionResponse> releaseInstancePublicConnection(ReleaseInstancePublicConnectionRequest request);

    /**
     * <b>description</b> :
     * <p>The operation that you want to perform. Set the value to <strong>RemoveSubInstance</strong>.</p>
     * 
     * @param request the request parameters of RemoveSubInstance  RemoveSubInstanceRequest
     * @return RemoveSubInstanceResponse
     */
    CompletableFuture<RemoveSubInstanceResponse> removeSubInstance(RemoveSubInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>You can adjust the bandwidth of an instance in the Tair (Redis OSS-compatible) console. For more information, see <a href="https://help.aliyun.com/document_detail/102588.html">Adjust the bandwidth of an instance</a>. You can also call the <a href="https://help.aliyun.com/document_detail/473771.html">EnableAdditionalBandwidth</a> operation to purchase bandwidth for an instance.</p>
     * 
     * @param request the request parameters of RenewAdditionalBandwidth  RenewAdditionalBandwidthRequest
     * @return RenewAdditionalBandwidthResponse
     */
    CompletableFuture<RenewAdditionalBandwidthResponse> renewAdditionalBandwidth(RenewAdditionalBandwidthRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is applicable only to subscription instances.</p>
     * 
     * @param request the request parameters of RenewInstance  RenewInstanceRequest
     * @return RenewInstanceResponse
     */
    CompletableFuture<RenewInstanceResponse> renewInstance(RenewInstanceRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> Only Tair (Redis OSS-compatible) instances of Redis 4.0 or later are supported.</p>
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
     * <p>  If your instance is a <a href="https://help.aliyun.com/document_detail/126164.html">DRAM-based instance</a> or a <a href="https://help.aliyun.com/document_detail/183956.html">persistent memory-optimized instance</a> and has the <a href="https://help.aliyun.com/document_detail/148479.html">data flashback</a> feature enabled, you can call this operation to restore the entire instance or specific keys to a specific point in time accurate to the second. This way, you can achieve more fine-grained data restoration.</p>
     * <ul>
     * <li>For other types of instances, we recommend that you call the <a href="https://help.aliyun.com/document_detail/473757.html">CreateInstance</a> or <a href="https://help.aliyun.com/document_detail/473770.html">CreateTairInstance</a> operation to restore the backup data to a new instance.</li>
     * </ul>
     * 
     * @param request the request parameters of RestoreInstance  RestoreInstanceRequest
     * @return RestoreInstanceResponse
     */
    CompletableFuture<RestoreInstanceResponse> restoreInstance(RestoreInstanceRequest request);

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
     * <p>For more information about nearby access to applications that are deployed across zones, see <a href="https://help.aliyun.com/document_detail/164222.html">Switch node roles</a>.
     * The instance must be a Redis Open-Source Edition instance or Tair (Enterprise Edition) <a href="https://help.aliyun.com/document_detail/126164.html">DRAM-based</a> instance that uses local disks.
     * A call to this operation has the following impacts on your instance:</p>
     * </blockquote>
     * <ul>
     * <li>The data shards in the instance may change to the read-only state and experience transient connections within seconds. Make sure that your application is configured to automatically reconnect to the instance.</li>
     * <li>If the instance enters the switching state, you cannot manage this instance. For example, you cannot modify the instance configurations or migrate the instance to another zone.</li>
     * </ul>
     * 
     * @param request the request parameters of SwitchInstanceHA  SwitchInstanceHARequest
     * @return SwitchInstanceHAResponse
     */
    CompletableFuture<SwitchInstanceHAResponse> switchInstanceHA(SwitchInstanceHARequest request);

    /**
     * <b>description</b> :
     * <p>For more information about the proxy mode, see <a href="https://help.aliyun.com/document_detail/142959.html">Features of proxy servers</a>. Before you call this operation, make sure that the following requirements are met:</p>
     * <ul>
     * <li>The instance is created by using a dedicated cluster. For more information, see <a href="https://help.aliyun.com/document_detail/141455.html">What is ApsaraDB for MyBase?</a></li>
     * <li>The instance uses the <a href="https://help.aliyun.com/document_detail/52228.html">cluster architecture</a>.<blockquote>
     * <p> Before you call the SwitchInstanceProxy operation, you must call the <a href="https://help.aliyun.com/document_detail/473867.html">DescribeDedicatedClusterInstanceList</a> operation and view the value of the <strong>ProxyCount</strong> response parameter to check whether the proxy mode is enabled. A value of 0 indicates that the proxy mode is disabled. A value that is greater than 0 indicates that the proxy mode is enabled.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of SwitchInstanceProxy  SwitchInstanceProxyRequest
     * @return SwitchInstanceProxyResponse
     */
    CompletableFuture<SwitchInstanceProxyResponse> switchInstanceProxy(SwitchInstanceProxyRequest request);

    /**
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
     * @param request the request parameters of SyncDtsStatus  SyncDtsStatusRequest
     * @return SyncDtsStatusResponse
     */
    CompletableFuture<SyncDtsStatusResponse> syncDtsStatus(SyncDtsStatusRequest request);

    /**
     * <b>description</b> :
     * <p>If you have a large number of instances, you can create multiple tags and add these tags to the instances. Then, you can filter instances by tag.</p>
     * <ul>
     * <li>A tag consists of a key and a value. Each key must be unique in a region for an Alibaba Cloud account. Different keys can be mapped to the same value.</li>
     * <li>If the tag that you specify does not exist, this tag is automatically created and added to the specified instance.</li>
     * <li>If the key of the specified tag is the same as that of an existing tag, the specified tag overwrites the existing tag.</li>
     * <li>You can add up to 20 tags to each instance.</li>
     * <li>You can add tags to up to 50 instances in each request.
     * You can also add tags to instances in the Tair (Redis OSS-compatible) console. For more information, see <a href="https://help.aliyun.com/document_detail/118779.html">Create a tag</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand relevant precautions and billing rules. For more information, see the following topics:</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/54542.html">Change the billing method to subscription</a>.</li>
     * <li><a href="https://help.aliyun.com/document_detail/211549.html">Change the billing method to pay-as-you-go</a>.</li>
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
     * <p>For more information about how to change the billing method in the Tair (Redis OSS-compatible) console, see <a href="https://help.aliyun.com/document_detail/54542.html">Switch to subscription</a>.</p>
     * <blockquote>
     * <p> You cannot change the billing method of a Tair (Redis OSS-compatible) instance from subscription to pay-as-you-go.</p>
     * </blockquote>
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
     * <p>  You can remove up to 20 tags at a time.</p>
     * <ul>
     * <li>If a tag is removed from an instance and is not added to other instances, the tag is deleted.
     * You can also remove tags from instances in the Tair (Redis OSS-compatible) console. For more information, see <a href="https://help.aliyun.com/document_detail/119157.html">Remove a tag</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

}
