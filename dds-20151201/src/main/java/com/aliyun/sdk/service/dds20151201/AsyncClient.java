// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dds20151201.models.*;
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
      * This operation applies only to sharded cluster instances. For more information, see [Apply for an endpoint for a shard or Configserver node](~~134037~~).
      * >  The requested endpoint can only be accessed over the internal network. If you want to access the endpoint over the Internet, call the [AllocatePublicNetworkAddress](~~67602~~) operation to apply for a public endpoint.
      *
     */
    CompletableFuture<AllocateNodePrivateNetworkAddressResponse> allocateNodePrivateNetworkAddress(AllocateNodePrivateNetworkAddressRequest request);

    CompletableFuture<AllocatePublicNetworkAddressResponse> allocatePublicNetworkAddress(AllocatePublicNetworkAddressRequest request);

    /**
      * Before you enable Transparent Data Encryption (TDE) by calling the [ModifyDBInstanceTDE](~~131267~~) operation, you can call this operation to check whether KMS keys are authorized to ApsaraDB for MongoDB instances.
      *
     */
    CompletableFuture<CheckCloudResourceAuthorizedResponse> checkCloudResourceAuthorized(CheckCloudResourceAuthorizedRequest request);

    /**
      * This operation is applicable to replica set instances or sharded cluster instances.
      * >  After you confirm that the data recovery conditions are met by calling this operation, you can call the [CreateDBInstance](~~61763~~) operation to restore data to a new instance.
      *
     */
    CompletableFuture<CheckRecoveryConditionResponse> checkRecoveryCondition(CheckRecoveryConditionRequest request);

    /**
      * ## Usage
      * When you call this operation, the instance must be in the Running state.
      *
     */
    CompletableFuture<CreateBackupResponse> createBackup(CreateBackupRequest request);

    /**
      * Make sure that you fully understand the billing methods and [pricing](https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing) of ApsaraDB for MongoDB before you call this operation.
      * For more information about the instance types of ApsaraDB for MongoDB instances, see [Instance types](~~57141~~).
      * To create sharded cluster instances, you can call the [CreateShardingDBInstance](~~61884~~) operation.
      *
     */
    CompletableFuture<CreateDBInstanceResponse> createDBInstance(CreateDBInstanceRequest request);

    /**
      * Before you call this operation, make sure that you fully understand the billing methods and [pricing](https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing) of ApsaraDB for MongoDB.
      * This operation is applicable only to sharded cluster instances.
      *
     */
    CompletableFuture<CreateNodeResponse> createNode(CreateNodeRequest request);

    /**
      * Before you call this operation, make sure that you fully understand the billing methods and [pricing](https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing) of ApsaraDB for MongoDB.
      * This operation is applicable only to sharded cluster instances.
      *
     */
    CompletableFuture<CreateNodeBatchResponse> createNodeBatch(CreateNodeBatchRequest request);

    /**
      * *   Make sure that you fully understand the billing methods and [pricing](https://www.aliyun.com/price/product#/mongodb/detail) of ApsaraDB for MongoDB before you call this operation.
      * *   For more information about the instance types of ApsaraDB for MongoDB instances, see [Instance types](~~57141~~).
      * *   To create standalone and replica set instances, you can call the [CreateDBInstance](~~61763~~) operation.
      *
     */
    CompletableFuture<CreateShardingDBInstanceResponse> createShardingDBInstance(CreateShardingDBInstanceRequest request);

    /**
      * Ensure that the instance meets the following conditions when you call this operation:
      * *   The instance is in the running state.
      * *   The billing method of the instance is pay-as-you-go.
      * >  After an instance is released, all the data in the instance is lost and cannot be retrieved. Exercise caution when you release instances.
      *
     */
    CompletableFuture<DeleteDBInstanceResponse> deleteDBInstance(DeleteDBInstanceRequest request);

    /**
      * Before you call this operation, make sure that the following requirements are met:
      * *   The instance is in the running state.
      * *   The instance is a sharded cluster instance.
      * *   The billing method of the instance is pay-as-you-go.
      * *   The number of the shard or mongos nodes in the instance is greater than two.
      *
     */
    CompletableFuture<DeleteNodeResponse> deleteNode(DeleteNodeRequest request);

    /**
      * >  This operation can query only the information of the root account.
      *
     */
    CompletableFuture<DescribeAccountsResponse> describeAccounts(DescribeAccountsRequest request);

    CompletableFuture<DescribeActiveOperationTaskCountResponse> describeActiveOperationTaskCount(DescribeActiveOperationTaskCountRequest request);

    CompletableFuture<DescribeActiveOperationTaskTypeResponse> describeActiveOperationTaskType(DescribeActiveOperationTaskTypeRequest request);

    /**
      * *   The instance must be in the running state when you call this operation.
      * *   This operation is applicable only to **general-purpose local-disk** and **dedicated local-disk** instances.
      * *   You can call this operation up to 30 times per minute. To call this operation at a higher frequency, use a Logstore. For more information, see [Manage a Logstore](~~48990~~).
      *
     */
    CompletableFuture<DescribeAuditLogFilterResponse> describeAuditLogFilter(DescribeAuditLogFilterRequest request);

    /**
      * *   The instance must be in the running state when you call this operation.
      * *   This operation is applicable only to **general-purpose local-disk** and **dedicated local-disk** instances.
      * *   You can call this operation up to 30 times per minute. To call this operation at a higher frequency, use a Logstore. For more information, see [Manage a Logstore](~~48990~~).
      *
     */
    CompletableFuture<DescribeAuditPolicyResponse> describeAuditPolicy(DescribeAuditPolicyRequest request);

    /**
      * *   When you call this operation, ensure that the audit log feature of the instance is enabled. Otherwise, the operation returns an empty audit log.
      * *   This operation is applicable only to **general-purpose local-disk** and **dedicated local-disk** instances.
      * *   You can call this operation up to 30 times per minute. To call this operation at a higher frequency, use a Logstore. For more information, see [Manage a Logstore](~~48990~~).
      *
     */
    CompletableFuture<DescribeAuditRecordsResponse> describeAuditRecords(DescribeAuditRecordsRequest request);

    CompletableFuture<DescribeAvailableEngineVersionResponse> describeAvailableEngineVersion(DescribeAvailableEngineVersionRequest request);

    CompletableFuture<DescribeAvailableResourceResponse> describeAvailableResource(DescribeAvailableResourceRequest request);

    /**
      * ## Precautions
      * You can call the [CreateDBInstance](~~61763~~) operation to restore a database for an ApsaraDB for MongoDB instance. For more information, see [Restore one or more databases of an ApsaraDB for MongoDB instance](~~112274~~).
      * Before you call this operation, make sure that the ApsaraDB for MongoDB instance meets the following requirements:
      * *   The instance was created after March 26, 2019.
      * *   The instance is located in the China (Qingdao), China (Beijing), China (Zhangjiakou), China (Hohhot), China (Hangzhou), China (Shanghai), China (Shenzhen), or Singapore (Singapore) region. Other regions are not supported.
      * *   The instance is a replica set instance.
      * *   The version of the database engine is 3.4, 4.0, or 4.2.
      * *   The storage engine of the instance is WiredTiger.
      *
     */
    CompletableFuture<DescribeBackupDBsResponse> describeBackupDBs(DescribeBackupDBsRequest request);

    CompletableFuture<DescribeBackupPolicyResponse> describeBackupPolicy(DescribeBackupPolicyRequest request);

    CompletableFuture<DescribeBackupsResponse> describeBackups(DescribeBackupsRequest request);

    CompletableFuture<DescribeDBInstanceAttributeResponse> describeDBInstanceAttribute(DescribeDBInstanceAttributeRequest request);

    /**
      * ## Usage
      * When you call the DescribeDBInstanceEncryptionKey operation, the instance must have transparent data encryption (TDE) enabled in BYOK mode. You can call the [ModifyDBInstanceTDE](~~131267~~) operation to enable TDE.
      *
     */
    CompletableFuture<DescribeDBInstanceEncryptionKeyResponse> describeDBInstanceEncryptionKey(DescribeDBInstanceEncryptionKeyRequest request);

    CompletableFuture<DescribeDBInstanceMonitorResponse> describeDBInstanceMonitor(DescribeDBInstanceMonitorRequest request);

    CompletableFuture<DescribeDBInstancePerformanceResponse> describeDBInstancePerformance(DescribeDBInstancePerformanceRequest request);

    /**
      * Before you call this operation, make sure that the following requirements are met:
      * *   The instance is in the Running state.
      * *   The instance is a replica set instance.
      * *   The instance runs MongoDB 3.4 or later.
      *
     */
    CompletableFuture<DescribeDBInstanceSSLResponse> describeDBInstanceSSL(DescribeDBInstanceSSLRequest request);

    /**
      * >  For more information about this function, see [~~131048~~](~~131048~~)Configure TDE.
      * Before you call this operation, make sure that the following requirements are met:
      * *   A replica set or sharded cluster instance is used.
      * *   The storage engine of the instance is WiredTiger.
      * *   The database engine version of the instance is 4.0 or 4.2. If the database engine version of your instance is earlier than 4.0, you can call [UpgradeDBInstanceEngineVersion](~~67608~~) to upgrade the database engine.
      *
     */
    CompletableFuture<DescribeDBInstanceTDEInfoResponse> describeDBInstanceTDEInfo(DescribeDBInstanceTDEInfoRequest request);

    /**
      * The list of replica set and standalone instances is displayed when the **DBInstanceType** parameter uses the default value **replicate**. To query the list of sharded cluster instances, you must set the **DBInstanceType** parameter to **sharding**.
      *
     */
    CompletableFuture<DescribeDBInstancesResponse> describeDBInstances(DescribeDBInstancesRequest request);

    /**
      * *   If you do not specify an instance when you call this operation, the overview information of all instances in the specified region within this account is returned.
      * *   Paged query is disabled for this operation.
      *
     */
    CompletableFuture<DescribeDBInstancesOverviewResponse> describeDBInstancesOverview(DescribeDBInstancesOverviewRequest request);

    /**
      * *   This operation is applicable only to **general-purpose local-disk** and **dedicated local-disk** instances.
      * *   You can call this operation up to 30 times per minute. To call this operation at a higher frequency, use a Logstore. For more information, see [Manage a Logstore](~~48990~~).
      *
     */
    CompletableFuture<DescribeErrorLogRecordsResponse> describeErrorLogRecords(DescribeErrorLogRecordsRequest request);

    /**
      * This operation is applicable to subscription instances.
      *
     */
    CompletableFuture<DescribeInstanceAutoRenewalAttributeResponse> describeInstanceAutoRenewalAttribute(DescribeInstanceAutoRenewalAttributeRequest request);

    CompletableFuture<DescribeKernelReleaseNotesResponse> describeKernelReleaseNotes(DescribeKernelReleaseNotesRequest request);

    /**
      * This operation is applicable only to **general-purpose local-disk** and **dedicated local-disk** instances.
      * This operation depends on the audit log feature of ApsaraDB for MongoDB. You can enable the audit log feature based on your business needs. For more information, see [Enable the audit log feature](~~59903~~)
      * *   Starting from January 6, 2022, the official edition of the audit log feature has been launched in all regions, and new applications for the free trial edition have ended. For more information, see [Notice on official launch of the pay-as-you-go audit log feature and no more application for the free trial edition](~~377480~~)
      * *   The official edition is charged based on the storage usage and retention period. For more information, see the [Pricing](https://www.alibabacloud.com/product/apsaradb-for-mongodb/pricing) tab of the ApsaraDB for MongoDB product page.
      *
     */
    CompletableFuture<DescribeMongoDBLogConfigResponse> describeMongoDBLogConfig(DescribeMongoDBLogConfigRequest request);

    CompletableFuture<DescribeParameterModificationHistoryResponse> describeParameterModificationHistory(DescribeParameterModificationHistoryRequest request);

    CompletableFuture<DescribeParameterTemplatesResponse> describeParameterTemplates(DescribeParameterTemplatesRequest request);

    CompletableFuture<DescribeParametersResponse> describeParameters(DescribeParametersRequest request);

    CompletableFuture<DescribePriceResponse> describePrice(DescribePriceRequest request);

    /**
      * >  To query available regions and zones where ApsaraDB for MongoDB instances can be created, call the [DescribeAvailableResource](~~149719~~) operation.
      *
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
      * This operation is applicable to subscription instances.
      *
     */
    CompletableFuture<DescribeRenewalPriceResponse> describeRenewalPrice(DescribeRenewalPriceRequest request);

    /**
      * This operation is applicable to replica set instances and standalone instances, but not to sharded cluster instances.
      *
     */
    CompletableFuture<DescribeReplicaSetRoleResponse> describeReplicaSetRole(DescribeReplicaSetRoleRequest request);

    /**
      * >  For more information, see [View the zone of a node](~~123825~~).
      * This operation is applicable only to replica set and sharded cluster instances, but not to standalone instances.
      *
     */
    CompletableFuture<DescribeRoleZoneInfoResponse> describeRoleZoneInfo(DescribeRoleZoneInfoRequest request);

    /**
      * *   This operation is applicable only to **general-purpose local-disk** and **dedicated local-disk** instances.
      * *   You can call this operation up to 30 times per minute. To call this operation at a higher frequency, use a Logstore. For more information, see [Manage a Logstore](~~48990~~).
      *
     */
    CompletableFuture<DescribeRunningLogRecordsResponse> describeRunningLogRecords(DescribeRunningLogRecordsRequest request);

    CompletableFuture<DescribeSecurityGroupConfigurationResponse> describeSecurityGroupConfiguration(DescribeSecurityGroupConfigurationRequest request);

    CompletableFuture<DescribeSecurityIpsResponse> describeSecurityIps(DescribeSecurityIpsRequest request);

    /**
      * This operation supports sharded cluster instances only.
      *
     */
    CompletableFuture<DescribeShardingNetworkAddressResponse> describeShardingNetworkAddress(DescribeShardingNetworkAddressRequest request);

    /**
      * *   This operation is applicable only to **general-purpose local-disk** or **dedicated local-disk** instances.
      * *   You can call this operation up to 30 times per minute. To call this operation at a higher frequency, use a Logstore. For more information, see [Manage a Logstore](~~48990~~).
      *
     */
    CompletableFuture<DescribeSlowLogRecordsResponse> describeSlowLogRecords(DescribeSlowLogRecordsRequest request);

    CompletableFuture<DescribeTagsResponse> describeTags(DescribeTagsRequest request);

    /**
      * You can use the custom key obtained by calling the DescribeUserEncryptionKeyList operation to enable TDE. For more information, see [ModifyDBInstanceTDE](~~131267~~).
      *
     */
    CompletableFuture<DescribeUserEncryptionKeyListResponse> describeUserEncryptionKeyList(DescribeUserEncryptionKeyListRequest request);

    /**
      * Before you call this API operation, make sure that the ApsaraDB for MongoDB instance meets the following requirements:
      * *   The billing method of the instance is subscription.
      * *   The instance has expired and is in the **Locking** state.
      *
     */
    CompletableFuture<DestroyInstanceResponse> destroyInstance(DestroyInstanceRequest request);

    /**
      * This operation is applicable to replica set instances and sharded cluster instances. You can call this operation to check whether resources are sufficient for creating an instance, upgrading an instance, or upgrading a single node of a sharded cluster instance.
      * > You can call this operation a maximum of 200 times per minute.
      *
     */
    CompletableFuture<EvaluateResourceResponse> evaluateResource(EvaluateResourceRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
      * ## Precautions
      * *   This operation is available only for replica set instances that run MongoDB 4.2 or earlier and sharded cluster instances.
      * *   If you have applied for a public endpoint for the ApsaraDB for MongoDB instance, you must call the [ReleasePublicNetworkAddress](~~67604~~) operation to release the public endpoint before you call the MigrateAvailableZone operation.
      * *   Transparent data encryption (TDE) is disabled for the instance.
      * *   The source zone and the destination zone belong to the same region.
      * *   A vSwitch is created in the destination zone. This prerequisite must be met if the instance resides in a virtual private cloud (VPC). For more information about how to create a vSwitch, see [Work with vSwitches](~~65387~~).
      *
     */
    CompletableFuture<MigrateAvailableZoneResponse> migrateAvailableZone(MigrateAvailableZoneRequest request);

    /**
      * This operation is applicable only to replica set instances, but not to standalone instances or sharded cluster instances.
      * >  If you have applied for a public endpoint of the instance, you must first call the [ReleasePublicNetworkAddress](~~67604~~) operation to release the public endpoint.
      *
     */
    CompletableFuture<MigrateToOtherZoneResponse> migrateToOtherZone(MigrateToOtherZoneRequest request);

    CompletableFuture<ModifyAccountDescriptionResponse> modifyAccountDescription(ModifyAccountDescriptionRequest request);

    /**
      * *   The instance must be in the running state when you call this operation.
      * *   This operation is applicable only to **general-purpose local-disk** and **dedicated local-disk** instances.
      * *   You can call this operation up to 30 times per minute. To call this operation at a higher frequency, use a Logstore. For more information, see [Manage a Logstore](~~48990~~).
      *
     */
    CompletableFuture<ModifyAuditLogFilterResponse> modifyAuditLogFilter(ModifyAuditLogFilterRequest request);

    /**
      * *   This operation is applicable only to **general-purpose local-disk** and **dedicated local-disk** instances.
      * *   You can call this operation up to 30 times per minute. To call this operation at a higher frequency, use a Logstore. For more information, see [Manage a Logstore](~~48990~~).
      *
     */
    CompletableFuture<ModifyAuditPolicyResponse> modifyAuditPolicy(ModifyAuditPolicyRequest request);

    CompletableFuture<ModifyBackupPolicyResponse> modifyBackupPolicy(ModifyBackupPolicyRequest request);

    CompletableFuture<ModifyDBInstanceConnectionStringResponse> modifyDBInstanceConnectionString(ModifyDBInstanceConnectionStringRequest request);

    CompletableFuture<ModifyDBInstanceDescriptionResponse> modifyDBInstanceDescription(ModifyDBInstanceDescriptionRequest request);

    CompletableFuture<ModifyDBInstanceMaintainTimeResponse> modifyDBInstanceMaintainTime(ModifyDBInstanceMaintainTimeRequest request);

    /**
      * >  operation is currently unavailable.
      * Before you call this operation, make sure that the following requirements are met:
      * *   A replica set or sharded cluster instance is used.
      * *   MongoDB 3.4 (the latest minor version) or 4.0 must be selected.
      *
     */
    CompletableFuture<ModifyDBInstanceMonitorResponse> modifyDBInstanceMonitor(ModifyDBInstanceMonitorRequest request);

    /**
      * Before you call this operation, make sure that the following requirements are met:
      * *   The instance is in the running state.
      * *   The network of the instance is in hybrid access mode.
      * >  This operation is applicable only to replica set and sharded cluster instances, but not to standalone instances.
      *
     */
    CompletableFuture<ModifyDBInstanceNetExpireTimeResponse> modifyDBInstanceNetExpireTime(ModifyDBInstanceNetExpireTimeRequest request);

    /**
      * This operation is applicable only to replica set instances and sharded cluster instances.
      *
     */
    CompletableFuture<ModifyDBInstanceNetworkTypeResponse> modifyDBInstanceNetworkType(ModifyDBInstanceNetworkTypeRequest request);

    /**
      * ## Usage
      * Before you call this operation, make sure that the following requirements are met:
      * *   The instance is in the running state.
      * *   The instance is a replica set instance.
      * *   The engine version of the instance is \\<ph props="intl">3.4 or 4.0\\</ph>\\<ph props="china">3.4, 4.0, or 4.2\\</ph>.
      * >  When you enable or disable SSL encryption or update the SSL certificate, the instance restarts. We recommend that you call this operation during off-peak hours.
      *
     */
    CompletableFuture<ModifyDBInstanceSSLResponse> modifyDBInstanceSSL(ModifyDBInstanceSSLRequest request);

    /**
      * Before you call this operation, make sure that you understand the billing methods and [pricing](https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing) of ApsaraDB for MongoDB.
      * This operation applies only to standalone and replica set instances. To modify the specifications of sharded cluster instances, you can call the [ModifyNodeSpec](~~61911~~), [CreateNode](~~61922~~), [DeleteNode](~~61816~~), or [ModifyNodeSpecBatch](~~61923~~) operation.
      *
     */
    CompletableFuture<ModifyDBInstanceSpecResponse> modifyDBInstanceSpec(ModifyDBInstanceSpecRequest request);

    /**
      * TDE can be used to perform real-time I/O encryption and decryption on data files. Data is encrypted before being written to disks, and decrypted before being read from disks to the memory. For more information, see [Configure TDE](~~131048~~).
      * >  After TDE is enabled, it cannot be disabled.
      * Before you call this operation, make sure that the following requirements are met:
      * *   A replica set or sharded cluster instance is used.
      * *   The storage engine of the instance is WiredTiger.
      * *   The database engine version of the instance is 4.0 or 4.2. If the database engine version is earlier than 4.0, you can call the [UpgradeDBInstanceEngineVersion](~~67608~~) operation to upgrade the database engine.
      *
     */
    CompletableFuture<ModifyDBInstanceTDEResponse> modifyDBInstanceTDE(ModifyDBInstanceTDERequest request);

    /**
      * Before you call this operation, make sure that you fully understand the billing methods and [pricing](https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing).
      * This operation is applicable to subscription instances.
      * >  When auto-renewal is enabled, your payment will be collected nine days before the expiration date of ApsaraDB for MongoDB. Ensure that your account has sufficient balance.
      *
     */
    CompletableFuture<ModifyInstanceAutoRenewalAttributeResponse> modifyInstanceAutoRenewalAttribute(ModifyInstanceAutoRenewalAttributeRequest request);

    /**
      * Before you call this operation, make sure that the following requirements are met:
      * *   A replica set or sharded cluster instance is used.
      * *   The database version of the instance is 4.0 (with the minor version of mongodb\\_20190408\\_3.0.11 or later) or 4.2. You can call the [DescribeDBInstanceAttribute](~~62010~~) operation to view the database engine version of the instance. If necessary, you can call the [UpgradeDBInstanceEngineVersion](~~67608~~) operation to upgrade the database engine.
      * *   The instance is in a VPC. If the network type is Classic Network, you can call the [ModifyDBInstanceNetworkType](~~62138~~) operation to switch the network type to VPC.
      *
     */
    CompletableFuture<ModifyInstanceVpcAuthModeResponse> modifyInstanceVpcAuthMode(ModifyInstanceVpcAuthModeRequest request);

    /**
      * Before you call this operation, make sure that you understand the billing methods and [pricing](https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing) of ApsaraDB for MongoDB.
      * > This operation is applicable only to sharded cluster instances.
      *
     */
    CompletableFuture<ModifyNodeSpecResponse> modifyNodeSpec(ModifyNodeSpecRequest request);

    /**
      * Before you call this operation, make sure that you understand the billing methods and pricing of ApsaraDB for MongoDB. For more information, go to the Pricing tab of the ApsaraDB for MongoDB product page at [the international site (alibabacloud.com)](https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing).
      * This operation is applicable only to sharded cluster instances.
      *
     */
    CompletableFuture<ModifyNodeSpecBatchResponse> modifyNodeSpecBatch(ModifyNodeSpecBatchRequest request);

    /**
      * ## Precautions
      * *   The instance must be in the Running state when you call this operation.
      * *   If you call this operation to modify specific instance parameters and the modification for part of the parameters can take effect only after an instance restart, the instance is automatically restarted after this operation is called. You can call the [DescribeParameterTemplates](~~67618~~) operation to query the parameters that take effect only after the instance is restarted.
      *
     */
    CompletableFuture<ModifyParametersResponse> modifyParameters(ModifyParametersRequest request);

    /**
      * Resource Management enables you to build an organizational structure for resources based on your business needs. You can use a resource directory, folders, accounts, and resource groups to hierarchically organize and manage resources. For more information, see [What is Resource Management?](~~94475~~)
      *
     */
    CompletableFuture<ModifyResourceGroupResponse> modifyResourceGroup(ModifyResourceGroupRequest request);

    /**
      * >  For a sharded cluster instance, the bound ECS security group takes effect only for mongos nodes.
      *
     */
    CompletableFuture<ModifySecurityGroupConfigurationResponse> modifySecurityGroupConfiguration(ModifySecurityGroupConfigurationRequest request);

    CompletableFuture<ModifySecurityIpsResponse> modifySecurityIps(ModifySecurityIpsRequest request);

    /**
      * *   This operation can be used to release the internal endpoint of a shard or Configserver node in a sharded cluster instance. For more information, see [Release the endpoint of a shard or Configserver node](~~134067~~).
      * *   To release the public endpoint of a shard or Configserver node in a sharded cluster instance, you can call the [ReleasePublicNetworkAddress](~~67604~~) operation.
      *
     */
    CompletableFuture<ReleaseNodePrivateNetworkAddressResponse> releaseNodePrivateNetworkAddress(ReleaseNodePrivateNetworkAddressRequest request);

    CompletableFuture<ReleasePublicNetworkAddressResponse> releasePublicNetworkAddress(ReleasePublicNetworkAddressRequest request);

    /**
      * Make sure that you fully understand the billing methods and [pricing](https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing) of ApsaraDB for MongoDB before you call this operation.
      * This parameter is only applicable to Subscription instances.
      *
     */
    CompletableFuture<RenewDBInstanceResponse> renewDBInstance(RenewDBInstanceRequest request);

    /**
      * >  This operation can reset only the password of the root account of an instance.
      *
     */
    CompletableFuture<ResetAccountPasswordResponse> resetAccountPassword(ResetAccountPasswordRequest request);

    /**
      * This operation can also be used to restart a shard or mongos node in a sharded cluster instance.
      *
     */
    CompletableFuture<RestartDBInstanceResponse> restartDBInstance(RestartDBInstanceRequest request);

    /**
      * This operation is applicable to replica set instances, but cannot be called on standalone instances or sharded cluster instances. You can use the following methods to clone an instance: [Create an instance from a backup](~~55013~~) to clone a standalone instance. Call the [CreateShardingDBInstance](~~61884~~) operation to clone a sharded cluster instance.
      * >  This operation overwrites the data of the current instance, and the data cannot be recovered. Exercise caution when performing this operation.
      *
     */
    CompletableFuture<RestoreDBInstanceResponse> restoreDBInstance(RestoreDBInstanceRequest request);

    /**
      * The instance must be in the running state when you call this operation.
      * > * This operation is applicable to replica set instances and sharded cluster instances, but cannot be performed on standalone instances.
      * > * On replica set instances, the switch is performed between instances. On sharded cluster instances, the switch is performed between shards.
      *
     */
    CompletableFuture<SwitchDBInstanceHAResponse> switchDBInstanceHA(SwitchDBInstanceHARequest request);

    /**
      * You can create multiple tags and bind them to multiple instances. This allows you to classify and filter instances by tag.
      * *   A tag consists of a key and a value. Each key must be unique in a region for an Alibaba Cloud account. Different keys can have the same value.
      * *   If the tag you specify does not exist, this tag is automatically created and bound to the specified instance.
      * *   If a tag that has the same key is already bound to the instance, the new tag overwrites the existing tag.
      * *   You can bind up to 20 tags to each instance.
      * *   You can bind tags to up to 50 instances each time you call the operation.
      *
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
      * Before you call this operation, make sure that you understand the billing methods and [pricing](https://www.aliyun.com/price/product#/mongodb/detail) of ApsaraDB for MongoDB.
      * Before you call this API operation, make sure that the ApsaraDB for MongoDB instance meets the following requirements:
      * *   The instance is in the Running state.
      * *   Your instance has no unpaid billing method change orders.
      * *   The instance type is available for purchase. For more information about unavailable instance types, see [Instance types](~~57141~~).
      * > To change the billing method of an instance whose instance type is no longer available to purchase, call the [ModifyDBInstanceSpec](~~61816~~) or [ModifyNodeSpec](~~61923~~) operation to first change the instance type.
      *
     */
    CompletableFuture<TransformInstanceChargeTypeResponse> transformInstanceChargeType(TransformInstanceChargeTypeRequest request);

    /**
      * Before you call this operation, make sure that you understand the billing methods and [pricing](https://www.alibabacloud.com/zh/product/apsaradb-for-mongodb/pricing).
      * A subscription instance cannot be changed to a pay-as-you-go instance. To avoid wasting resources, proceed with caution.
      * Before you call this API operation, make sure that the ApsaraDB for MongoDB instance meets the following requirements:
      * *   The instance is in the running state.
      * *   The billing method of the instance is pay-as-you-go.
      * *   The instance has no unpaid subscription orders.
      * *   The instance type is available for purchase. For more information about unavailable instance types, see [Instance types](~~57141~~).
      * >  To change the billing method of an instance whose instance type is no longer available to subscription, call the [ModifyDBInstanceSpec](~~61816~~) or [ModifyNodeSpec](~~61923~~) operation to first change the instance type.
      *
     */
    CompletableFuture<TransformToPrePaidResponse> transformToPrePaid(TransformToPrePaidRequest request);

    /**
      * - You can remove up to 20 tags at a time.
      * - If you remove a tag from all instances, the tag is automatically deleted.
      *
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
      * The instance must be in the running state when you call this operation.
      * > * The available database versions depend on the storage engine used by the instance. For more information, see [Upgrades of MongoDB major versions](~~398673~~). You can also call the [DescribeAvailableEngineVersion](~~141355~~) operation to query the available database versions.
      * > * You cannot downgrade the MongoDB version of an instance after you upgrade it.
      * > * The instance is automatically restarted for two to three times during the upgrade process. Make sure that you upgrade the instance during off-peak hours.
      *
     */
    CompletableFuture<UpgradeDBInstanceEngineVersionResponse> upgradeDBInstanceEngineVersion(UpgradeDBInstanceEngineVersionRequest request);

    /**
      * When you call the UpgradeDBInstanceKernelVersion operation, the instance must be in the Running state.
      * > * The UpgradeDBInstanceKernelVersion operation is applicable to replica set and sharded cluster instances, but not to standalone instances.
      * > * The instance will be restarted once during the upgrade. Call this operation during off-peak hours.
      *
     */
    CompletableFuture<UpgradeDBInstanceKernelVersionResponse> upgradeDBInstanceKernelVersion(UpgradeDBInstanceKernelVersionRequest request);

}
