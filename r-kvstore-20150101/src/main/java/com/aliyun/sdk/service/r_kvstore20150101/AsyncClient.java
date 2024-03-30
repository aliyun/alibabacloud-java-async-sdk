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
      * This operation is available only for cluster instances that use cloud disks.
      *
     */
    CompletableFuture<AddShardingNodeResponse> addShardingNode(AddShardingNodeRequest request);

    /**
      * In direct connection mode, you can use private endpoints to bypass proxy nodes and connect to ApsaraDB for Redis instances from clients in the same manner as you connect to native Redis clusters. The direct connection mode can reduce communication overheads and accelerate the response speed. For more information, see [Enable the direct connection mode](~~146901~~).
      * To call this operation, the instance must meet the following requirements:
      * *   The instance is an ApsaraDB for Redis cluster instance.
      * *   The instance is a Community Edition instance that runs Redis 4.0 or 5.0, or an Enhanced Edition instance (Tair) that runs Redis 5.0.
      * *   The instance is deployed in a virtual private cloud (VPC). If the instance is deployed in the classic network, call the [SwitchNetwork](~~61005~~) operation to change the network type to VPC.
      * *   SSL encryption is disabled for the instance. If SSL encryption is enabled, you can call the [ModifyInstanceSSL](~~96194~~) operation to disable it.
      * *   The vSwitch to which the instance is connected has sufficient IP addresses to be allocated. For more information, see [Obtain the number of available IP addresses in the vSwitch to which an ApsaraDB for Redis instance is connected](~~183151~~).
      *
     */
    CompletableFuture<AllocateDirectConnectionResponse> allocateDirectConnection(AllocateDirectConnectionRequest request);

    /**
      * You can also apply for public endpoints in the ApsaraDB for Redis console. For more information, see [Use a public endpoint to connect to an ApsaraDB for Redis instance](~~43850~~).
      *
     */
    CompletableFuture<AllocateInstancePublicConnectionResponse> allocateInstancePublicConnection(AllocateInstancePublicConnectionRequest request);

    /**
      * *   For information about Transparent Data Encryption (TDE) and the usage notes of TDE, see [Enable TDE](~~265913~~).
      * *   If the ApsaraDB for Redis instance is authorized to use KMS, you can call the [ModifyInstanceTDE](~~302337~~) operation to enable TDE.
      *
     */
    CompletableFuture<CheckCloudResourceAuthorizedResponse> checkCloudResourceAuthorized(CheckCloudResourceAuthorizedRequest request);

    /**
      * > 
      * *   This operation is supported only for ApsaraDB for Redis instances that run Redis 4.0 or later.
      * *   The ApsaraDB for Redis instance for which you want to call this operation must be in the running state.
      * *   You can create up to 18 accounts for an ApsaraDB for Redis instance.
      * You can also create an account in the ApsaraDB for Redis console. For more information, see [Manage database accounts](~~92665~~).
      *
     */
    CompletableFuture<CreateAccountResponse> createAccount(CreateAccountRequest request);

    /**
      * You can also back up an instance in the ApsaraDB for Redis console. For more information, see [Backup and recovery](~~43886~~).
      *
     */
    CompletableFuture<CreateBackupResponse> createBackup(CreateBackupRequest request);

    /**
      * > ApsaraDB for Redis has optimized the cache analytics feature to improve user experience. This API operation is phased out. You can use the new API operation for cache analytics. For more information, see [API operations for cache analytics are upgraded](~~186019~~).
      * Before you call this operation, make sure that the instance meets the following requirements:
      * *   The engine version of the instance is Redis 4.0 or later.
      * *   The instance is a Community Edition instance or an Enhanced Edition (Tair) [DRAM-based instance](~~126164~~).
      * This feature is unavailable for cloud disk-based cluster instances. For more information, see [Comparison between ApsaraDB for Redis instances that use local disks and those that use cloud disks](~~188068~~).
      * *   The instance is of the latest minor version. For more information about whether you must update the minor version of an instance, see [How do I check whether the minor version of an ApsaraDB for Redis instance is the latest?](~~129203~~)
      * After you call this operation, you can call the [DescribeCacheAnalysisReport](~~128808~~) operation to view the analytic results.
      *
     */
    CompletableFuture<CreateCacheAnalysisTaskResponse> createCacheAnalysisTask(CreateCacheAnalysisTaskRequest request);

    /**
      * You cannot directly create a distributed instance. If you require a distributed instance, you must call this operation to convert an existing instance to the first child instance of the distributed instance. After the instance is converted, the distributed instance is created. Before you call this operation, make sure that the following requirements are met:
      * *   A [DRAM-based instance](~~126164~~) of Enhanced Edition is used.
      * *   If the existing instance is a cluster instance, the direct connection mode must be disabled for the instance. For more information, see [Release a private endpoint](~~150047~~).
      * > You can also call the [CreateInstance](~~60873~~) operation to create an instance that is specified as the first child instance of a distributed instance. After the child instance is created, the distributed instance to which the child instance belongs is created.
      *
     */
    CompletableFuture<CreateGlobalDistributeCacheResponse> createGlobalDistributeCache(CreateGlobalDistributeCacheRequest request);

    CompletableFuture<CreateGlobalSecurityIPGroupResponse> createGlobalSecurityIPGroup(CreateGlobalSecurityIPGroupRequest request);

    /**
      * Before you call this operation, make sure that you understand the billing methods and [pricing](~~54532~~) of ApsaraDB for Redis.
      * You can call this operation to create an ApsaraDB for Redis instance or a classic Tair DRAM-based instance. To create a cloud-native Tair instance, call the [CreateTairInstance](~~208271~~) operation.
      * > For more information about how to create an instance that meets your requirements in the ApsaraDB for Redis console, see [Step 1: Create an ApsaraDB for Redis instance](~~26351~~).
      *
     */
    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    /**
      * Before you call this operation, make sure that you understand the billing methods and [pricing](~~54532~~) of ApsaraDB for Redis.
      * >  For more information about how to create an instance that meets your requirements in the ApsaraDB for Redis console, see Step 1: Create an ApsaraDB for Redis instance.[](~~26351~~)
      * This operation can only be used to create ApsaraDB for Redis Community Edition instances and ApsaraDB for Redis Enhanced Edition (Tair) DRAM-based classic instances.
      *
     */
    CompletableFuture<CreateInstancesResponse> createInstances(CreateInstancesRequest request);

    /**
      * For information about instance selection, see [Select an ApsaraDB for Redis instance](~~223808~~).
      * Before you call this operation, make sure that you are familiar with the billing methods and [pricing](~~54532~~) of ApsaraDB for Redis.
      * *   For information about how to create a Tair instance in the Tair console, see [Create a Tair instance](~~443863~~).
      * *   If you want to create other types of instances, such as Community Edition instances or [Tair DRAM-based](~~126164~~) instances, you can call the [CreateInstance](~~60873~~) operation.
      *
     */
    CompletableFuture<CreateTairInstanceResponse> createTairInstance(CreateTairInstanceRequest request);

    /**
      * *   This operation is supported only for ApsaraDB for Redis instances that run Redis 4.0.
      * *   The ApsaraDB for Redis instance must be in the Running state.
      *
     */
    CompletableFuture<DeleteAccountResponse> deleteAccount(DeleteAccountRequest request);

    /**
      * Before you delete an IP whitelist template, you must unbind (disassociate) the instances that are currently associated with the template.
      *
     */
    CompletableFuture<DeleteGlobalSecurityIPGroupResponse> deleteGlobalSecurityIPGroup(DeleteGlobalSecurityIPGroupRequest request);

    /**
      * For more information about how to perform the corresponding operation in the console, see [Release an instance](~~43882~~).
      * Before you call this operation, make sure that the following requirements are met:
      * *   The instance is in the running state.
      * *   The instance is charged on a pay-as-you-go basis.
      * >  You cannot call this operation to release a subscription instance, which is automatically released when it expires. To release a subscription instance before it expires, submit a ticket.
      *
     */
    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    /**
      * You can also remove data shards from an instance in the ApsaraDB for Redis console. For more information, see [Adjust the number of shards for an ApsaraDB for Redis instance with cloud disks](~~198082~~).\\
      * Before you call this operation, make sure that the instance meets the following requirements:
      * *   The instance is a persistent memory-optimized instance in the cluster architecture. For more information about persistent memory-optimized instances, see [Persistent memory-optimized instances](~~183956~~).
      * *   The instance has more than one data shard.
      *
     */
    CompletableFuture<DeleteShardingNodeResponse> deleteShardingNode(DeleteShardingNodeRequest request);

    /**
      * >  Only ApsaraDB for Redis instances of Redis 4.0 or later are supported.
      *
     */
    CompletableFuture<DescribeAccountsResponse> describeAccounts(DescribeAccountsRequest request);

    /**
      * After you have called this API operation and queried the information about a specific O&M task, you can also call the [ModifyActiveOperationTask](~~ModifyActiveOperationTask~~) operation to modify the scheduled switchover time of the O&M task.
      *
     */
    CompletableFuture<DescribeActiveOperationTaskResponse> describeActiveOperationTask(DescribeActiveOperationTaskRequest request);

    /**
      * > You can call the [ModifyAuditLogConfig](~~130206~~) operation to enable or disable the audit log feature for an ApsaraDB for Redis instance. For more information, see [Enable the new audit log feature](~~102015~~).
      * Before you call this operation, make sure that the ApsaraDB for Redis instance meets the following requirements:
      * *   The instance is an ApsaraDB for Redis Community Edition instance or ApsaraDB for Redis Enhanced Edition (Tair) [DRAM-based instance](~~126164~~).
      * *   The engine version of the instance is Redis 4.0 or later, and the latest minor version is used. You can call the [DescribeEngineVersion](~~95268~~) operation to check whether the instance uses the latest minor version.
      * *   The audit log feature is enabled for the instance. For more information, see [ModifyAuditLogConfig](~~130206~~).
      *
     */
    CompletableFuture<DescribeAuditLogConfigResponse> describeAuditLogConfig(DescribeAuditLogConfigRequest request);

    /**
      * This operation can be called up to 100 times per minute. You can also query audit logs in the ApsaraDB for Redis console. For more information, see [Query audit logs of an instance](~~101937~~).
      * Before you call this operation, make sure that the instance meets the following requirements:
      * *   The instance is an ApsaraDB for Redis Community Edition instance or an ApsaraDB for Redis Enhanced Edition (Tair) DRAM-based instance.
      * *   The engine version of the instance is Redis 4.0 or later.
      * *   The audit log feature is enabled for the instance. For more information, see [ModifyAuditLogConfig](~~130206~~).
      *
     */
    CompletableFuture<DescribeAuditRecordsResponse> describeAuditRecords(DescribeAuditRecordsRequest request);

    CompletableFuture<DescribeAvailableResourceResponse> describeAvailableResource(DescribeAvailableResourceRequest request);

    CompletableFuture<DescribeBackupPolicyResponse> describeBackupPolicy(DescribeBackupPolicyRequest request);

    CompletableFuture<DescribeBackupTasksResponse> describeBackupTasks(DescribeBackupTasksRequest request);

    CompletableFuture<DescribeBackupsResponse> describeBackups(DescribeBackupsRequest request);

    /**
      * > ApsaraDB for Redis has optimized the cache analytics feature to improve user experience. This API operation is phased out. You can use the new API operation for cache analytics. For more information, see [API operations for cache analytics are upgraded](~~186019~~).
      * Before you call this operation, make sure that the instance meets the following requirements:
      * *   The engine version of the instance is Redis 4.0 or later.
      * *   The instance uses the latest minor version. For more information about how to check whether to update the minor version of an instance, see [How do I check whether the minor version of an ApsaraDB for Redis instance is the latest?](~~129203~~)
      *
     */
    CompletableFuture<DescribeCacheAnalysisReportResponse> describeCacheAnalysisReport(DescribeCacheAnalysisReportRequest request);

    /**
      * > ApsaraDB for Redis has optimized the cache analytics feature to improve user experience. This API operation is phased out. You can use the new API operation for cache analytics. For more information, see [API operations for cache analytics are upgraded](~~186019~~).
      * Before you call this operation, make sure that the instance meets the following requirements:
      * *   The engine version of the instance is Redis 4.0 or later.
      * *   The instance uses the latest minor version. For more information about how to check whether to update the minor version of an instance, see [How do I check whether the minor version of an ApsaraDB for Redis instance is the latest?](~~129203~~)
      *
     */
    CompletableFuture<DescribeCacheAnalysisReportListResponse> describeCacheAnalysisReportList(DescribeCacheAnalysisReportListRequest request);

    CompletableFuture<DescribeClusterBackupListResponse> describeClusterBackupList(DescribeClusterBackupListRequest request);

    /**
      * > This API operation is applicable only to ApsaraDB for Redis instances that use [cloud disks](~~188068~~) and the [cluster architecture](~~52228~~).
      *
     */
    CompletableFuture<DescribeClusterMemberInfoResponse> describeClusterMemberInfo(DescribeClusterMemberInfoRequest request);

    CompletableFuture<DescribeDBInstanceNetInfoResponse> describeDBInstanceNetInfo(DescribeDBInstanceNetInfoRequest request);

    /**
      * > Only instances that use cloud disks support this operation.
      *
     */
    CompletableFuture<DescribeDBNodeDirectVipInfoResponse> describeDBNodeDirectVipInfo(DescribeDBNodeDirectVipInfoRequest request);

    /**
      * > If you want to query the information about ApsaraDB for Redis instances that are not deployed in a dedicated cluster, call the [DescribeInstanceAttribute](~~60996~~) operation.
      *
     */
    CompletableFuture<DescribeDedicatedClusterInstanceListResponse> describeDedicatedClusterInstanceList(DescribeDedicatedClusterInstanceListRequest request);

    /**
      * Before you call this operation, TDE must be enabled for the ApsaraDB for Redis instance by using a custom key. For more information, see [ModifyInstanceTDE](~~302337~~).
      * > For more information about TDE, see [Enable TDE](~~265913~~).
      *
     */
    CompletableFuture<DescribeEncryptionKeyResponse> describeEncryptionKey(DescribeEncryptionKeyRequest request);

    /**
      * *   You can specify a custom key when you call the [ModifyInstanceTDE](~~302337~~) operation to enable Transparent Data Encryption (TDE). You can call the DescribeEncryptionKeyList operation to query the custom keys that are in use. To create a custom key, you can call the [CreateKey](~~28947~~) operation of Key Management Service (KMS).
      * *   For more information about TDE and the usage notes of TDE, see [Enable TDE](~~265913~~).
      *
     */
    CompletableFuture<DescribeEncryptionKeyListResponse> describeEncryptionKeyList(DescribeEncryptionKeyListRequest request);

    /**
      * ## Debugging
      * [OpenAPI Explorer automatically calculates the signature value. For your convenience, we recommend that you call this operation in OpenAPI Explorer. OpenAPI Explorer dynamically generates the sample code of the operation for different SDKs.](https://api.aliyun.com/#product=R-kvstore\\&api=DescribeEngineVersion\\&type=RPC\\&version=2015-01-01)
      *
     */
    CompletableFuture<DescribeEngineVersionResponse> describeEngineVersion(DescribeEngineVersionRequest request);

    /**
      * ## Debugging
      * [OpenAPI Explorer automatically calculates the signature value. For your convenience, we recommend that you call this operation in OpenAPI Explorer. OpenAPI Explorer dynamically generates the sample code of the operation for different SDKs.](https://api.aliyun.com/#product=R-kvstore\\&api=DescribeGlobalDistributeCache\\&type=RPC\\&version=2015-01-01)
      *
     */
    CompletableFuture<DescribeGlobalDistributeCacheResponse> describeGlobalDistributeCache(DescribeGlobalDistributeCacheRequest request);

    CompletableFuture<DescribeGlobalSecurityIPGroupResponse> describeGlobalSecurityIPGroup(DescribeGlobalSecurityIPGroupRequest request);

    CompletableFuture<DescribeGlobalSecurityIPGroupRelationResponse> describeGlobalSecurityIPGroupRelation(DescribeGlobalSecurityIPGroupRelationRequest request);

    /**
      * You can also query the performance monitoring data of an instance in the ApsaraDB for Redis console. For more information, see [Metrics](~~43887~~).
      *
     */
    CompletableFuture<DescribeHistoryMonitorValuesResponse> describeHistoryMonitorValues(DescribeHistoryMonitorValuesRequest request);

    CompletableFuture<DescribeHistoryTasksResponse> describeHistoryTasks(DescribeHistoryTasksRequest request);

    CompletableFuture<DescribeInstanceAttributeResponse> describeInstanceAttribute(DescribeInstanceAttributeRequest request);

    CompletableFuture<DescribeInstanceAutoRenewalAttributeResponse> describeInstanceAutoRenewalAttribute(DescribeInstanceAutoRenewalAttributeRequest request);

    /**
      * This operation is available only for instances that use cloud disks.
      * > You can call the [DescribeParameters](~~473847~~) operation to query the parameter settings of instances that use local disks.
      *
     */
    CompletableFuture<DescribeInstanceConfigResponse> describeInstanceConfig(DescribeInstanceConfigRequest request);

    /**
      * SSL encryption is supported for ApsaraDB for Redis 2.8 standard master-replica instances, ApsaraDB for Redis 2.8 master-replica cluster instances, and ApsaraDB for Redis 4.0 master-replica cluster instances. You can enable SSL encryption to enhance data transmission security.
      * You can use one of the following methods to enable or disable SSL encryption or update the SSL certificate for an ApsaraDB for Redis instance:
      * *   Call the [ModifyInstanceSSL](~~96194~~) operation.
      * *   Enable or disable SSL encryption or update the SSL certificate in the ApsaraDB for Redis console. For more information, see [Configure SSL encryption](~~84898~~).
      * > After SSL encryption is enabled, the instance may respond slower.
      *
     */
    CompletableFuture<DescribeInstanceSSLResponse> describeInstanceSSL(DescribeInstanceSSLRequest request);

    /**
      * For more information about TDE and the usage notes of TDE, see [Enable TDE](~~265913~~).
      * >  You can call the [ModifyInstanceTDE](~~302337~~) to enable or disable TDE.
      *
     */
    CompletableFuture<DescribeInstanceTDEStatusResponse> describeInstanceTDEStatus(DescribeInstanceTDEStatusRequest request);

    CompletableFuture<DescribeInstancesResponse> describeInstances(DescribeInstancesRequest request);

    /**
      * If you do not specify the InstanceIds parameter when you call this operation, the overview information of all instances is returned.
      * > This operation returns non-paged results.
      *
     */
    CompletableFuture<DescribeInstancesOverviewResponse> describeInstancesOverview(DescribeInstancesOverviewRequest request);

    /**
      * You can call the [EnableAdditionalBandwidth](~~206173~~) operation to increase the internal bandwidth of an instance.
      *
     */
    CompletableFuture<DescribeIntranetAttributeResponse> describeIntranetAttribute(DescribeIntranetAttributeRequest request);

    /**
      * This parameter is supported only for cluster and read/write splitting instances.
      *
     */
    CompletableFuture<DescribeLogicInstanceTopologyResponse> describeLogicInstanceTopology(DescribeLogicInstanceTopologyRequest request);

    /**
      * >  ApsaraDB for Redis has upgraded the monitoring metrics. The DescribeMonitorItems operation is phased out. For more information, see [The DescribeMonitorItems operation supported by ApsaraDB for Redis is phased out](~~189893~~).
      * After you call this operation to retrieve a list of metrics for a specified ApsaraDB for Redis instance, you can call the [DescribeHistoryMonitorValues](~~DescribeHistoryMonitorValues~~) operation to query monitoring history of the instance.
      *
     */
    CompletableFuture<DescribeMonitorItemsResponse> describeMonitorItems(DescribeMonitorItemsRequest request);

    CompletableFuture<DescribeParameterModificationHistoryResponse> describeParameterModificationHistory(DescribeParameterModificationHistoryRequest request);

    /**
      * After you call this operation to query the parameters and default values of an instance, you can call the [ModifyInstanceConfig](~~61113~~) operation to reconfigure the parameters of the instance.
      *
     */
    CompletableFuture<DescribeParameterTemplatesResponse> describeParameterTemplates(DescribeParameterTemplatesRequest request);

    /**
      * This operation is available only for instances that use local disks.
      * > You can call the [DescribeInstanceConfig](~~473846~~) operation to query the parameter settings of instances that use cloud disks.
      *
     */
    CompletableFuture<DescribeParametersResponse> describeParameters(DescribeParametersRequest request);

    CompletableFuture<DescribePriceResponse> describePrice(DescribePriceRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeRoleZoneInfoResponse> describeRoleZoneInfo(DescribeRoleZoneInfoRequest request);

    /**
      * For more information about how to view the operational logs of an instance in the ApsaraDB for Redis console, see [View active logs](~~101713~~).
      * This operation can be called up to 100 times per minute.
      *
     */
    CompletableFuture<DescribeRunningLogRecordsResponse> describeRunningLogRecords(DescribeRunningLogRecordsRequest request);

    CompletableFuture<DescribeSecurityGroupConfigurationResponse> describeSecurityGroupConfiguration(DescribeSecurityGroupConfigurationRequest request);

    CompletableFuture<DescribeSecurityIpsResponse> describeSecurityIps(DescribeSecurityIpsRequest request);

    /**
      * You can also query slow logs in the ApsaraDB for Redis console. For more information, see [Query slow logs of an instance](~~95874~~). This operation can be called up to 100 times per minute.
      *
     */
    CompletableFuture<DescribeSlowLogRecordsResponse> describeSlowLogRecords(DescribeSlowLogRecordsRequest request);

    /**
      * You can call this operation to query the progress of a task when you perform time-consuming operations. You can also log on to the ApsaraDB for Redis console and click the Tasks icon in the upper-right corner of the **Instance Information** page to view the progress of the current task.
      *
     */
    CompletableFuture<DescribeTasksResponse> describeTasks(DescribeTasksRequest request);

    CompletableFuture<DescribeZonesResponse> describeZones(DescribeZonesRequest request);

    /**
      * When you call this operation, make sure that your instance is an ApsaraDB for Redis Community Edition instance or an ApsaraDB for Redis Enhanced Edition (Tair) [DRAM-based instance](~~126164~~), and that the instance is deployed in classic mode. For more information, see [Comparison between cloud-native instances and classic instances](~~188068~~).
      * If you enable the bandwidth auto scaling feature and call this operation at the same time, bandwidth auto scaling takes precedence. During bandwidth scale-back, the instance is scaled back to the default bandwidth of the instance type. For more information about the limits, costs, and FAQ about this feature, see [Adjust the bandwidth of an instance](~~102588~~).
      * >  Before you call this operation, you can call the [DescribeRoleZoneInfo](~~190794~~) operation to query the current bandwidth of each data node in an instance.
      *
     */
    CompletableFuture<EnableAdditionalBandwidthResponse> enableAdditionalBandwidth(EnableAdditionalBandwidthRequest request);

    /**
      * For more information about how to clear the expired keys in the ApsaraDB for Redis console, see [Clear data](~~43881~~).
      * >  Expired keys cannot be recovered after they are deleted. Exercise caution when you call this operation.
      *
     */
    CompletableFuture<FlushExpireKeysResponse> flushExpireKeys(FlushExpireKeysRequest request);

    CompletableFuture<FlushInstanceResponse> flushInstance(FlushInstanceRequest request);

    /**
      * Each ApsaraDB for Redis or Tair instance can contain up to 256 databases. Each database does not have a separate memory usage limit. The memory capacity that a database can use is subject to the total memory limit of the instance. You can execute the `SELECT` statement to switch between databases. For more information, see [What is the size of each database on an ApsaraDB for Redis instance, and how can I choose databases?](~~38688~~)
      * >  This operation is available only for cloud-native instances that use cloud disks.
      *
     */
    CompletableFuture<FlushInstanceForDBResponse> flushInstanceForDB(FlushInstanceForDBRequest request);

    /**
      * > 
      * *   Only ApsaraDB for Redis instances of Redis 4.0 or later are supported.
      * *   The ApsaraDB for Redis instance must be in the running state.
      *
     */
    CompletableFuture<GrantAccountPrivilegeResponse> grantAccountPrivilege(GrantAccountPrivilegeRequest request);

    /**
      * The log management feature of ApsaraDB for Redis requires the resources of [Log Service](~~48869~~). To use the log management feature of ApsaraDB for Redis, you can call this operation to associate the RAM role named AliyunServiceRoleForKvstore with the ApsaraDB for Redis instance. For more information, see [Associated RAM roles of ApsaraDB for Redis](~~184337~~).
      *
     */
    CompletableFuture<InitializeKvstorePermissionResponse> initializeKvstorePermission(InitializeKvstorePermissionRequest request);

    /**
      * You can also query the relationships between instances and tags in the ApsaraDB for Redis console. For more information, see [Filter ApsaraDB for Redis instances by tag](~~119160~~) and [View tags bound to an instance](~~134038~~).
      *
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<LockDBInstanceWriteResponse> lockDBInstanceWrite(LockDBInstanceWriteRequest request);

    /**
      * For more information about how to migrate an instance across zones in the ApsaraDB for Redis console, see [Migrate an instance across zones](~~106272~~).
      * > *   If the network type of an ApsaraDB for Redis instance is switched from classic network to Virtual Private Cloud (VPC), and the endpoint of the classic network is retained, you can migrate the instance across zones only after the classic network endpoint is released upon expiration.
      * > *   After the data is migrated, the endpoint of an instance remains unchanged. However, the virtual IP address (VIP) is changed. We recommend that you use the endpoint instead of the VIP to connect to the instance.
      *
     */
    CompletableFuture<MigrateToOtherZoneResponse> migrateToOtherZone(MigrateToOtherZoneRequest request);

    /**
      * > This operation is supported only for instances that run Redis 4.0 or later.
      *
     */
    CompletableFuture<ModifyAccountDescriptionResponse> modifyAccountDescription(ModifyAccountDescriptionRequest request);

    CompletableFuture<ModifyAccountPasswordResponse> modifyAccountPassword(ModifyAccountPasswordRequest request);

    /**
      * You can receive notifications for ApsaraDB for Redis events such as instance migration and version upgrade by text message, phone call, email, internal message, or by using the ApsaraDB for Redis console. You can also change the scheduled switchover time of a task in the ApsaraDB for Redis console. For more information, see [Query or manage pending events](~~187022~~).
      *
     */
    CompletableFuture<ModifyActiveOperationTaskResponse> modifyActiveOperationTask(ModifyActiveOperationTaskRequest request);

    /**
      * Before you call this operation, make sure that you understand the billing methods and [pricing](~~54532~~) of the audit log feature.
      * Before you call this operation, make sure that the ApsaraDB for Redis instance meets the following requirements:
      * *   The instance is an ApsaraDB for Redis Community Edition instance or ApsaraDB for Redis Enhanced Edition (Tair) [DRAM-based instance](~~126164~~).
      * *   The engine version of the instance is Redis 4.0 or later, and the latest minor version is used. You can call the [DescribeEngineVersion](~~95268~~) operation to check whether the instance uses the latest major version and minor version.
      *
     */
    CompletableFuture<ModifyAuditLogConfigResponse> modifyAuditLogConfig(ModifyAuditLogConfigRequest request);

    CompletableFuture<ModifyBackupPolicyResponse> modifyBackupPolicy(ModifyBackupPolicyRequest request);

    /**
      * You can also modify the endpoint or port number of an instance in the ApsaraDB for Redis console. For more information, see [Change the endpoint or port number of an instance](~~85683~~).
      *
     */
    CompletableFuture<ModifyDBInstanceConnectionStringResponse> modifyDBInstanceConnectionString(ModifyDBInstanceConnectionStringRequest request);

    CompletableFuture<ModifyGlobalSecurityIPGroupResponse> modifyGlobalSecurityIPGroup(ModifyGlobalSecurityIPGroupRequest request);

    CompletableFuture<ModifyGlobalSecurityIPGroupNameResponse> modifyGlobalSecurityIPGroupName(ModifyGlobalSecurityIPGroupNameRequest request);

    CompletableFuture<ModifyGlobalSecurityIPGroupRelationResponse> modifyGlobalSecurityIPGroupRelation(ModifyGlobalSecurityIPGroupRelationRequest request);

    /**
      * You can also modify the information of an instance in the ApsaraDB for Redis console. For more information, see [Change or reset the password](~~43874~~).
      *
     */
    CompletableFuture<ModifyInstanceAttributeResponse> modifyInstanceAttribute(ModifyInstanceAttributeRequest request);

    /**
      * > Auto-renewal is triggered seven days before the expiration date of the instance.
      *
     */
    CompletableFuture<ModifyInstanceAutoRenewalAttributeResponse> modifyInstanceAutoRenewalAttribute(ModifyInstanceAutoRenewalAttributeRequest request);

    CompletableFuture<ModifyInstanceConfigResponse> modifyInstanceConfig(ModifyInstanceConfigRequest request);

    /**
      * You can also modify the maintenance window of an instance in the ApsaraDB for Redis console. For more information, see [Set a maintenance window](~~55252~~).
      *
     */
    CompletableFuture<ModifyInstanceMaintainTimeResponse> modifyInstanceMaintainTime(ModifyInstanceMaintainTimeRequest request);

    /**
      * For more information about how to perform the corresponding operation in the console, see [Upgrade the major version](~~101764~~).
      *
     */
    CompletableFuture<ModifyInstanceMajorVersionResponse> modifyInstanceMajorVersion(ModifyInstanceMajorVersionRequest request);

    /**
      * The procedure to update the minor version of an instance varies based on types of ApsaraDB for Redis instances. For more information, see [Upgrade the minor version](~~56450~~).
      * > 
      * *   Before you call this operation, you can call the [DescribeEngineVersion](~~95268~~) operation to query the minor version of the current instance.
      * *   When you switch your workloads over from the original instance to a new instance or from the master node to the replica node in the original instance, you may experience disconnections that last a few seconds. The original instance stays in the read-only state within 60 seconds until all data is synchronized. We recommend that you upgrade the original instance during off-peak hours and make sure that your application is configured to automatically reconnect to the original instance.
      *
     */
    CompletableFuture<ModifyInstanceMinorVersionResponse> modifyInstanceMinorVersion(ModifyInstanceMinorVersionRequest request);

    /**
      * You can also perform this operation in the ApsaraDB for Redis console. For more information, see [Change the expiration time for the endpoint of the classic network](~~60062~~).
      * > For more information about how to switch the network type of an ApsaraDB for Redis instance from classic network to VPC, see [SwitchNetwork](~~61005~~).
      *
     */
    CompletableFuture<ModifyInstanceNetExpireTimeResponse> modifyInstanceNetExpireTime(ModifyInstanceNetExpireTimeRequest request);

    CompletableFuture<ModifyInstanceParameterResponse> modifyInstanceParameter(ModifyInstanceParameterRequest request);

    /**
      * You can also modify SSL encryption configurations in the ApsaraDB for Redis console. For more information, see [Configure SSL encryption](~~84898~~).
      * >  To specify the earliest supported SSL version, you can call the [ModifyInstanceConfig](~~ModifyInstanceConfig~~) operation to modify the required parameter.
      *
     */
    CompletableFuture<ModifyInstanceSSLResponse> modifyInstanceSSL(ModifyInstanceSSLRequest request);

    /**
      * >  For more information about the procedure, impacts, limits, and fees of this operation, see [Change the configurations of an instance](~~26353~~).
      *
     */
    CompletableFuture<ModifyInstanceSpecResponse> modifyInstanceSpec(ModifyInstanceSpecRequest request);

    /**
      * > For more information about TDE and the impact of TDE, see [Enable TDE](~~265913~~).
      *
     */
    CompletableFuture<ModifyInstanceTDEResponse> modifyInstanceTDE(ModifyInstanceTDERequest request);

    /**
      * When the password-free access feature is enabled, Elastic Compute Service (ECS) instances in the same virtual private cloud (VPC) can connect to the ApsaraDB for Redis instance without a password. You can also use the username and password to connect to the ApsaraDB for Redis instance.
      * > The ApsaraDB for Redis instance is deployed in a VPC. For more information, see [Enable password-free access](~~85168~~).
      *
     */
    CompletableFuture<ModifyInstanceVpcAuthModeResponse> modifyInstanceVpcAuthMode(ModifyInstanceVpcAuthModeRequest request);

    /**
      * > 
      * *   This operation is applicable only to an ApsaraDB for Redis instance that is deployed in a dedicated cluster. To adjust the bandwidth of a standard ApsaraDB for Redis instance, call the [EnableAdditionalBandwidth](~~206173~~) operation.
      *
     */
    CompletableFuture<ModifyIntranetAttributeResponse> modifyIntranetAttribute(ModifyIntranetAttributeRequest request);

    /**
      * Resource groups allow you to sort resources owned by your Alibaba Cloud account into groups. This simplifies resource and permission management within your Alibaba Cloud account. For more information, see [What is Resource Management?](~~94475~~)
      * > For more information about resource group API operations, see [Resource Management API overview](~~160024~~).
      *
     */
    CompletableFuture<ModifyResourceGroupResponse> modifyResourceGroup(ModifyResourceGroupRequest request);

    /**
      * > After you call this operation, the security groups that are added to the whitelists of the ApsaraDB for Redis instance are deleted, and the security group specified by the **SecurityGroupId** parameter is added to the whitelists. For more information about how to reset security groups in the ApsaraDB for Redis console, see [Add security groups](~~148267~~).
      *
     */
    CompletableFuture<ModifySecurityGroupConfigurationResponse> modifySecurityGroupConfiguration(ModifySecurityGroupConfigurationRequest request);

    /**
      * You can also modify the whitelists of an instance in the ApsaraDB for Redis console. For more information, see [Configure a whitelist for an instance](~~56464~~).
      *
     */
    CompletableFuture<ModifySecurityIpsResponse> modifySecurityIps(ModifySecurityIpsRequest request);

    /**
      * In direct connection mode, clients can bypass proxy nodes and use private endpoints to connect to ApsaraDB for Redis instances. This is similar to the connection to a native Redis cluster. The direct connection mode can reduce communication overheads and the response time of ApsaraDB for Redis. For more information, see [Enable the direct connection mode](~~146901~~).
      *
     */
    CompletableFuture<ReleaseDirectConnectionResponse> releaseDirectConnection(ReleaseDirectConnectionRequest request);

    /**
      * For more information about how to perform the API operation in the ApsaraDB for Redis console, see [Release public endpoints](~~125424~~).
      *
     */
    CompletableFuture<ReleaseInstancePublicConnectionResponse> releaseInstancePublicConnection(ReleaseInstancePublicConnectionRequest request);

    /**
      * The operation that you want to perform. Set the value to **RemoveSubInstance**.
      *
     */
    CompletableFuture<RemoveSubInstanceResponse> removeSubInstance(RemoveSubInstanceRequest request);

    /**
      * Before you call this operation, make sure that you understand the billing methods and [pricing](~~54532~~) of ApsaraDB for Redis.
      * You can adjust the bandwidth of an instance in the ApsaraDB for Redis console. For more information, see [Adjust the bandwidth of an ApsaraDB for Redis instance](~~102588~~). You can also call the [EnableAdditionalBandwidth](~~206173~~) operation to adjust the bandwidth of an instance. If you want to continue using the bandwidth that you purchase after the validity period of the bandwidth, you must call the RenewAdditionalBandwidth operation to renew the bandwidth before the bandwidth expires.
      * > Before you call this operation, you can call the [DescribeIntranetAttribute](~~128715~~) operation, which returns the expiration time of the purchased bandwidth in the **BandwidthExpireTime** parameter.
      *
     */
    CompletableFuture<RenewAdditionalBandwidthResponse> renewAdditionalBandwidth(RenewAdditionalBandwidthRequest request);

    /**
      * This operation is applicable only to subscription instances.
      *
     */
    CompletableFuture<RenewInstanceResponse> renewInstance(RenewInstanceRequest request);

    /**
      * >  Only ApsaraDB for Redis instances of Redis 4.0 or later are supported.
      *
     */
    CompletableFuture<ResetAccountPasswordResponse> resetAccountPassword(ResetAccountPasswordRequest request);

    CompletableFuture<RestartInstanceResponse> restartInstance(RestartInstanceRequest request);

    /**
      * *   If your instance is a [persistent memory-optimized instance](~~443828~~) or [DRAM-based instance](~~443827~~) that is compatible with Redis 5.0 and the [data flashback](~~443784~~) feature is enabled, you can call this operation to restore the data of a specified key to a specified point in time that is accurate to the second. Other keys are not affected. This way, you can achieve more fine-grained data restoration.
      * *   For other instance series, this operation overwrites the existing data of your instance with the backup data. Proceed with caution. We recommend that you call the [CreateInstance](~~60873~~) operation to create an instance. Then, you can restore data to the new instance.
      *
     */
    CompletableFuture<RestoreInstanceResponse> restoreInstance(RestoreInstanceRequest request);

    /**
      * > For more information about nearby access to applications that are deployed across zones, see [Switch node roles](~~164222~~).
      * The instance must be an ApsaraDB for Redis Community Edition instance or Enhanced Edition (Tair) [DRAM-based](~~126164~~) instance that uses local disks.
      * A call to this operation has the following impacts on your instance:
      * *   The data shards in the instance may change to the read-only state and experience transient connections within seconds. Make sure that your application is configured to automatically reconnect to the instance.
      * *   If the instance enters the switching state, you cannot manage this instance. For example, you cannot modify the instance configurations or migrate the instance to another zone.
      *
     */
    CompletableFuture<SwitchInstanceHAResponse> switchInstanceHA(SwitchInstanceHARequest request);

    /**
      * For more information about the proxy mode, see [Features of proxy nodes](~~142959~~). Before you call this operation, make sure that the following requirements are met:
      * *   Your ApsaraDB for Redis instance is created by using a dedicated cluster. For more information, see [What is ApsaraDB MyBase?](~~141455~~)
      * *   The instance uses the cluster architecture. For more information about the cluster architecture, see [Cluster master-replica instances](~~52228~~).
      * > Before you call the SwitchInstanceProxy operation, you must call the [DescribeDedicatedClusterInstanceList](~~229522~~) operation and view the value of the **ProxyCount** response parameter to check whether the proxy mode is enabled. A value of 0 indicates that the proxy mode is disabled. A value that is greater than 0 indicates that the proxy mode is enabled.
      *
     */
    CompletableFuture<SwitchInstanceProxyResponse> switchInstanceProxy(SwitchInstanceProxyRequest request);

    CompletableFuture<SwitchNetworkResponse> switchNetwork(SwitchNetworkRequest request);

    CompletableFuture<SyncDtsStatusResponse> syncDtsStatus(SyncDtsStatusRequest request);

    /**
      * If you have a large number of instances, you can create multiple tags and add these tags to the instances. Then, you can filter instances by tag.
      * *   A tag consists of a key and a value. Each key must be unique in a region for an Alibaba Cloud account. Different keys can be mapped to the same value.
      * *   If the tag that you specify does not exist, this tag is automatically created and added to the specified instance.
      * *   If the key of the specified tag is the same as that of an existing tag, the specified tag overwrites the existing tag.
      * *   You can add up to 20 tags to each instance.
      * *   You can add tags to up to 50 instances in each request.
      * You can also add tags to instances in the ApsaraDB for Redis console. For more information, see [Create a tag](~~118779~~).
      *
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
      * Before you call this operation, make sure that you understand relevant precautions and billing rules. For more information, see the following topics:
      * *   [Change the billing method to subscription](~~54542~~).
      * *   [Change the billing method to pay-as-you-go](~~211549~~).
      *
     */
    CompletableFuture<TransformInstanceChargeTypeResponse> transformInstanceChargeType(TransformInstanceChargeTypeRequest request);

    /**
      * For more information about how to change the billing method in the ApsaraDB for Redis console, see [Switch to subscription](~~54542~~).
      * >  You cannot change the billing method of an ApsaraDB for Redis instance from subscription to pay-as-you-go.
      *
     */
    CompletableFuture<TransformToPrePaidResponse> transformToPrePaid(TransformToPrePaidRequest request);

    CompletableFuture<UnlockDBInstanceWriteResponse> unlockDBInstanceWrite(UnlockDBInstanceWriteRequest request);

    /**
      * *   You can remove up to 20 tags at a time.
      * *   If a tag is removed from an instance and is not added to other instances, the tag is deleted.
      * You can also remove tags from instances in the ApsaraDB for Redis console. For more information, see [Remove a tag](~~119157~~).
      *
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

}
