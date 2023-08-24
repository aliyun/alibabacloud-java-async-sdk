// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.r_kvstore20150101.models.*;
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
      * The ID of the instance.
      *
     */
    CompletableFuture<AllocateDirectConnectionResponse> allocateDirectConnection(AllocateDirectConnectionRequest request);

    /**
      * r-bp1zxszhcgatnx****
      *
     */
    CompletableFuture<AllocateInstancePublicConnectionResponse> allocateInstancePublicConnection(AllocateInstancePublicConnectionRequest request);

    /**
      * The operation that you want to perform. Set the value to **CheckCloudResourceAuthorized**.
      *
     */
    CompletableFuture<CheckCloudResourceAuthorizedResponse> checkCloudResourceAuthorized(CheckCloudResourceAuthorizedRequest request);

    /**
      * The name of the account.
      *
     */
    CompletableFuture<CreateAccountResponse> createAccount(CreateAccountRequest request);

    /**
      * The ID of the backup job.
      *
     */
    CompletableFuture<CreateBackupResponse> createBackup(CreateBackupRequest request);

    /**
      * The operation that you want to perform. Set the value to **CreateCacheAnalysisTask**.
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
      * Before you call this operation, make sure that you are familiar with the billing methods and [pricing](~~54532~~) of ApsaraDB for Redis.
      * You can call this operation to create an ApsaraDB for Redis instance that uses local or cloud disks or an ApsaraDB for Redis Enhanced Edition (Tair) DRAM-based instance that uses local disks. To create a Tair instance that uses cloud disks, call the [CreateTairInstance](~~208271~~) operation.
      * > You can also create an instance in the ApsaraDB for Redis console. For more information, see [Create an instance](~~26351~~).
      *
     */
    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    /**
      * Before you call this operation, make sure that you understand the billing methods and [pricing](~~54532~~) of ApsaraDB for Redis.
      * >  For more information about how to create an instance that meets your requirements in the ApsaraDB for Redis console, see [Step 1: Create an ApsaraDB for Redis instance](~~26351~~).
      * To create an ApsaraDB for Redis Enhanced Edition (Tair) instance that uses cloud disks, call [CreateTairInstance](~~208271~~).
      *
     */
    CompletableFuture<CreateInstancesResponse> createInstances(CreateInstancesRequest request);

    /**
      * For more information about instance selection, see [Select an ApsaraDB for Redis instance](~~223808~~).
      * Before you call this operation, make sure that you are familiar with the billing methods and [pricing](~~54532~~) of ApsaraDB for Redis.
      * > 
      * *   For more information about how to create an ApsaraDB for Redis Enhanced Edition (Tair) instance that uses cloud disks in the ApsaraDB for Redis console, see [Create an ApsaraDB for Redis instance](~~443863~~).
      * *   To create an instance of another edition or series such as a Community Edition instance or Tair [DRAM-based instance](~~126164~~) that uses local disks, call [CreateInstance](~~60873~~).
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
      * Details about returned accounts of the instance.
      *
     */
    CompletableFuture<DescribeAccountsResponse> describeAccounts(DescribeAccountsRequest request);

    /**
      * Specifies whether to return the historical tasks. Valid values:
      * *   **0**: returns the current task. This is the default value.
      * *   **1**: returns the historical tasks.
      *
     */
    CompletableFuture<DescribeActiveOperationTaskResponse> describeActiveOperationTask(DescribeActiveOperationTaskRequest request);

    /**
      * >  You can call the [ModifyAuditLogConfig](~~130206~~) operation to enable or disable the audit log feature for an ApsaraDB for Redis instance. For more information, see [Enable the new audit log feature](~~102015~~).
      * Before you call this API operation, make sure that the ApsaraDB for Redis instance meets the following requirements:
      * *   The instance is an instance of the ApsaraDB for Redis Community Edition or a performance-enhanced instance of the ApsaraDB for Redis Enhanced Edition (Tair). For more information, see [Performance-enhanced instances](~~126164~~).
      * *   The engine version of the instance is Redis 4.0 or later, and the latest minor version is used. You can call the [DescribeEngineVersion](~~95268~~) operation to check whether the instance uses the latest major version and minor version.
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
      * The number of entries returned on the current page.
      *
     */
    CompletableFuture<DescribeCacheAnalysisReportResponse> describeCacheAnalysisReport(DescribeCacheAnalysisReportRequest request);

    /**
      * The operation that you want to perform. Set the value to **DescribeCacheAnalysisReportList**.
      *
     */
    CompletableFuture<DescribeCacheAnalysisReportListResponse> describeCacheAnalysisReportList(DescribeCacheAnalysisReportListRequest request);

    /**
      * > This API operation is applicable only to ApsaraDB for Redis instances that use [cloud disks](~~188068~~) and the [cluster architecture](~~52228~~).
      *
     */
    CompletableFuture<DescribeClusterMemberInfoResponse> describeClusterMemberInfo(DescribeClusterMemberInfoRequest request);

    CompletableFuture<DescribeDBInstanceNetInfoResponse> describeDBInstanceNetInfo(DescribeDBInstanceNetInfoRequest request);

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
      * The ID of the request.
      *
     */
    CompletableFuture<DescribeEncryptionKeyListResponse> describeEncryptionKeyList(DescribeEncryptionKeyListRequest request);

    CompletableFuture<DescribeEngineVersionResponse> describeEngineVersion(DescribeEngineVersionRequest request);

    CompletableFuture<DescribeGlobalDistributeCacheResponse> describeGlobalDistributeCache(DescribeGlobalDistributeCacheRequest request);

    CompletableFuture<DescribeGlobalSecurityIPGroupResponse> describeGlobalSecurityIPGroup(DescribeGlobalSecurityIPGroupRequest request);

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
      * r-bp1zxszhcgatnx****
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
      * The maximum number of connections.
      *
     */
    CompletableFuture<DescribeLogicInstanceTopologyResponse> describeLogicInstanceTopology(DescribeLogicInstanceTopologyRequest request);

    /**
      * >  ApsaraDB for Redis has upgraded the monitoring metrics. The DescribeMonitorItems operation is phased out. For more information, see [The DescribeMonitorItems operation supported by ApsaraDB for Redis is phased out](~~189893~~).
      * After you call this operation to retrieve a list of metrics for a specified ApsaraDB for Redis instance, you can call the [DescribeHistoryMonitorValues](~~61107~~) operation to query monitoring history of the instance.
      *
     */
    CompletableFuture<DescribeMonitorItemsResponse> describeMonitorItems(DescribeMonitorItemsRequest request);

    CompletableFuture<DescribeParameterModificationHistoryResponse> describeParameterModificationHistory(DescribeParameterModificationHistoryRequest request);

    /**
      * An array that consists of the details about the parameters returned.
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
      * The progress of the task. Unit: %.
      *
     */
    CompletableFuture<DescribeTasksResponse> describeTasks(DescribeTasksRequest request);

    CompletableFuture<DescribeZonesResponse> describeZones(DescribeZonesRequest request);

    /**
      * For more information about the fees, limits, and answers to some frequently asked questions about bandwidth adjustments, see [Adjust the bandwidth of an ApsaraDB for Redis instance](~~102588~~).
      * >  Before you call this operation, you can call the [DescribeRoleZoneInfo](~~190794~~) operation to query the bandwidth of each data shard in the instance.
      *
     */
    CompletableFuture<EnableAdditionalBandwidthResponse> enableAdditionalBandwidth(EnableAdditionalBandwidthRequest request);

    /**
      * The time when the minor version is upgraded. Valid values:
      * *   **Immediately**: immediately deletes expired keys.
      * *   **MaintainTime:**deletes expired key in the maintenance window.
      * >  You can call the [ModifyInstanceMaintainTime](~~61000~~) operation to modify the maintenance window of an ApsaraDB for Redis instance.
      *
     */
    CompletableFuture<FlushExpireKeysResponse> flushExpireKeys(FlushExpireKeysRequest request);

    /**
      * The ID of the instance.
      *
     */
    CompletableFuture<FlushInstanceResponse> flushInstance(FlushInstanceRequest request);

    CompletableFuture<FlushInstanceForDBResponse> flushInstanceForDB(FlushInstanceForDBRequest request);

    /**
      * The name of the account. You can call the [DescribeAccounts](~~95802~~) operation to obtain the name of the account.
      *
     */
    CompletableFuture<GrantAccountPrivilegeResponse> grantAccountPrivilege(GrantAccountPrivilegeRequest request);

    /**
      * The ID of the request.
      *
     */
    CompletableFuture<InitializeKvstorePermissionResponse> initializeKvstorePermission(InitializeKvstorePermissionRequest request);

    /**
      * You can also query the relationships between instances and tags in the ApsaraDB for Redis console. For more information, see [Filter ApsaraDB for Redis instances by tag](~~119160~~) and [View tags bound to an instance](~~134038~~).
      *
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
      * The ID of the request.
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
      * 11111,22222
      *
     */
    CompletableFuture<ModifyActiveOperationTaskResponse> modifyActiveOperationTask(ModifyActiveOperationTaskRequest request);

    /**
      * Specifies whether to enable the audit log feature. Default value: true. Valid values:
      * *   **true**: enables the audit log feature.
      * *   **false**: disables the audit log feature.
      * > If the instance uses the [cluster architecture](~~52228~~) or [read/write splitting architecture](~~62870~~), the audit log feature is enabled or disabled for both the data nodes and proxy nodes. You cannot separately enable the audit log feature for the data nodes or proxy nodes.
      *
     */
    CompletableFuture<ModifyAuditLogConfigResponse> modifyAuditLogConfig(ModifyAuditLogConfigRequest request);

    CompletableFuture<ModifyBackupPolicyResponse> modifyBackupPolicy(ModifyBackupPolicyRequest request);

    /**
      * You can also modify the endpoint or port number of an instance in the ApsaraDB for Redis console. For more information, see [Change the endpoint or port number of an instance](~~85683~~).
      *
     */
    CompletableFuture<ModifyDBInstanceConnectionStringResponse> modifyDBInstanceConnectionString(ModifyDBInstanceConnectionStringRequest request);

    /**
      * uW8+nsrp
      *
     */
    CompletableFuture<ModifyInstanceAttributeResponse> modifyInstanceAttribute(ModifyInstanceAttributeRequest request);

    /**
      * > Auto-renewal is triggered seven days before the expiration date of the instance.
      *
     */
    CompletableFuture<ModifyInstanceAutoRenewalAttributeResponse> modifyInstanceAutoRenewalAttribute(ModifyInstanceAutoRenewalAttributeRequest request);

    CompletableFuture<ModifyInstanceConfigResponse> modifyInstanceConfig(ModifyInstanceConfigRequest request);

    CompletableFuture<ModifyInstanceMaintainTimeResponse> modifyInstanceMaintainTime(ModifyInstanceMaintainTimeRequest request);

    /**
      * r-bp1zxszhcgatnx****
      *
     */
    CompletableFuture<ModifyInstanceMajorVersionResponse> modifyInstanceMajorVersion(ModifyInstanceMajorVersionRequest request);

    /**
      * The ID of the instance.
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
      * Modifies SSL encryption configurations. Valid values:
      * *   **Disable**: The SSL encryption is disabled.
      * *   **Enable**: The SSL encryption is enabled.
      * *   **Update**: The SSL certificate is updated.
      *
     */
    CompletableFuture<ModifyInstanceSSLResponse> modifyInstanceSSL(ModifyInstanceSSLRequest request);

    /**
      * The ID of the promotional event or business information.
      *
     */
    CompletableFuture<ModifyInstanceSpecResponse> modifyInstanceSpec(ModifyInstanceSpecRequest request);

    /**
      * > For more information about TDE and the impact of TDE, see [Enable TDE](~~265913~~).
      *
     */
    CompletableFuture<ModifyInstanceTDEResponse> modifyInstanceTDE(ModifyInstanceTDERequest request);

    /**
      * The ID of the request.
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
      * The ID of the request.
      *
     */
    CompletableFuture<ModifySecurityGroupConfigurationResponse> modifySecurityGroupConfiguration(ModifySecurityGroupConfigurationRequest request);

    /**
      * The IP addresses in the whitelist group. Up to 1,000 IP addresses can be specified in each whitelist. Separate multiple IP addresses with a comma (,). You can add 0.0.0.0/0, IP addresses such as 10.23.12.24, and Classless Inter-Domain Routing (CIDR) blocks such as 10.23.12.24/24 to the whitelist group. In CIDR block 10.23.12.24/24, /24 specifies the length of the prefix in the IP addresses. The prefix length ranges from 1 to 32.
      *
     */
    CompletableFuture<ModifySecurityIpsResponse> modifySecurityIps(ModifySecurityIpsRequest request);

    /**
      * In direct connection mode, clients can bypass proxy nodes and use private endpoints to connect to ApsaraDB for Redis instances. This is similar to the connection to a native Redis cluster. The direct connection mode can reduce communication overheads and the response time of ApsaraDB for Redis. For more information, see [Enable the direct connection mode](~~146901~~).
      *
     */
    CompletableFuture<ReleaseDirectConnectionResponse> releaseDirectConnection(ReleaseDirectConnectionRequest request);

    /**
      * The ID of the request.
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
      * r-bp1zxszhcgatnx****
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
      * 1
      *
     */
    CompletableFuture<TransformInstanceChargeTypeResponse> transformInstanceChargeType(TransformInstanceChargeTypeRequest request);

    /**
      * The ID of the instance. You can call the [DescribeInstances](~~60933~~) operation to query the ID of the instance.
      *
     */
    CompletableFuture<TransformToPrePaidResponse> transformToPrePaid(TransformToPrePaidRequest request);

    /**
      * *   You can remove up to 20 tags at a time.
      * *   If a tag is removed from an instance and is not added to other instances, the tag is deleted.
      * You can also remove tags from instances in the ApsaraDB for Redis console. For more information, see [Remove a tag](~~119157~~).
      *
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

}
