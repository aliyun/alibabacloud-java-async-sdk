// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.rds20140815.models.*;
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
      * ## Prerequisites
      * Before you call the ActivateMigrationTargetInstance operation, make sure that a cloud migration task is created by calling the [CreateCloudMigrationTask](~~411690~~) operation. In addition, make sure that the value that is returned for the **MigrateStage** parameter from the call of the [DescribeCloudMigrationResult](~~412150~~) operation is **increment**.
      *
     */
    CompletableFuture<ActivateMigrationTargetInstanceResponse> activateMigrationTargetInstance(ActivateMigrationTargetInstanceRequest request);

    /**
      * This operation has the following limits:
      * *   Each tag consists of a TagKey and a TagValue. The TagKey is required, and the TagValue is optional.
      * *   The values of TagKey and TagValue cannot start with aliyun.
      * *   The values of TagKey and TagValue are not case-sensitive.
      * *   The maximum length of a TagKey is 64 characters, and the maximum length of a TagValue is 128 characters.
      * *   Each instance can be bound to a maximum of 10 tags. Each tag that is bound to the same instance must have a unique TagKey. If you bind a new tag to the instance and the TagKey of the new tag is the same as that of an existing tag, the new tag overwrites the existing tag.
      *
     */
    CompletableFuture<AddTagsToResourceResponse> addTagsToResource(AddTagsToResourceRequest request);

    /**
      * ###
      * You can apply for only one public endpoint for an instance.
      *
     */
    CompletableFuture<AllocateInstancePublicConnectionResponse> allocateInstancePublicConnection(AllocateInstancePublicConnectionRequest request);

    /**
      * If read-only instances are attached to a primary ApsaraDB RDS for SQL Server instance, you can call this operation to apply for a unified read-only routing endpoint for the primary instance. After you apply for a read-only routing endpoint for a primary instance, the existing endpoints of the primary instance and its read-only instances remain valid. In addition, you can still apply for internal and public endpoints.
      * Before you call this operation, make sure that the following requirements are met:
      * *   If the instance runs MySQL, the instance uses a shared proxy.
      * *   The instance is in the Running state.
      * *   Read-only instances are attached to the primary instance.
      * *   The instance does not have an ongoing Data Transmission Service (DTS) migration task.
      * *   The instance runs one of the following database versions and RDS editions:
      *     *   SQL Server (cluster edition)
      *     *   MySQL 5.7 on RDS High-availability Edition with local SSDs
      *     *   MySQL 5.6
      *
     */
    CompletableFuture<AllocateReadWriteSplittingConnectionResponse> allocateReadWriteSplittingConnection(AllocateReadWriteSplittingConnectionRequest request);

    /**
      * When the [read/write splitting](~~51073~~) feature is enabled, this operation is used to calculate system-assigned read weights. For more information about custom read weights, see [DescribeDBInstanceNetInfo](~~26237~~).
      * Before you call this operation, make sure that the following requirements are met:
      * *   The shared proxy feature is enabled for your ApsaraDB RDS for MySQL instance.
      * *   The instance must run one of the following database engine versions and RDS editions:
      *     *   MySQL 5.7 on RDS High-availability Edition (with local SSDs)
      *     *   MySQL 5.6
      *     *   SQL Server on RDS Cluster Edition
      *
     */
    CompletableFuture<CalculateDBInstanceWeightResponse> calculateDBInstanceWeight(CalculateDBInstanceWeightRequest request);

    /**
      * This operation is supported for instances that run SQL Server and belong to the dedicated or dedicated host instance family. For more information about how to start a migration task, see [ImportDatabaseBetweenInstances](~~26301~~).
      * > This operation is not supported for instances that run SQL Server 2017 on RDS Cluster Edition.
      *
     */
    CompletableFuture<CancelImportResponse> cancelImport(CancelImportRequest request);

    CompletableFuture<CheckAccountNameAvailableResponse> checkAccountNameAvailable(CheckAccountNameAvailableRequest request);

    CompletableFuture<CheckCloudResourceAuthorizedResponse> checkCloudResourceAuthorized(CheckCloudResourceAuthorizedRequest request);

    /**
      * Before you call this operation, make sure that the source instance runs one of the following database engines:
      * *   MySQL. For more information, see [Back up an ApsaraDB RDS for MySQL instance across regions](~~120824~~).
      * *   SQL Server. For more information, see [Back up an ApsaraDB RDS for SQL Server instance across regions](~~187923~~).
      * *   PostgreSQL. For more information, see [Back up an ApsaraDB RDS for PostgreSQL instance across regions](~~206671~~).
      *
     */
    CompletableFuture<CheckCreateDdrDBInstanceResponse> checkCreateDdrDBInstance(CheckCreateDdrDBInstanceRequest request);

    CompletableFuture<CheckDBNameAvailableResponse> checkDBNameAvailable(CheckDBNameAvailableRequest request);

    CompletableFuture<CheckInstanceExistResponse> checkInstanceExist(CheckInstanceExistRequest request);

    CompletableFuture<CheckServiceLinkedRoleResponse> checkServiceLinkedRole(CheckServiceLinkedRoleRequest request);

    /**
      * Before you call this operation, make sure that the following requirements are met:
      * *   The original instance is in the Running state.
      * *   The original instance does not have ongoing migration tasks.
      * *   The log backup feature is enabled for the original instance to support point-in-time recovery.
      * *   If you want to clone the original instance by using backup sets, the original instance must have at least one backup set.
      * > ApsaraDB RDS allows you to create a cloned instance by using the credentials of your RAM user. Make sure that your RAM user is granted the permissions that are required to clone an instance. For more information, see [Use RAM to manage ApsaraDB RDS permissions](~~58932~~).
      * Take note of the following information:
      * *   The new instance has the same IP address whitelist, SQL Explorer (SQL Audit), alert threshold, backup, and parameter settings as the original instance.
      * *   The data and account information of the new instance is the same as that indicated by the backup set or point in time used for restoration of the original instance.
      *
     */
    CompletableFuture<CloneDBInstanceResponse> cloneDBInstance(CloneDBInstanceRequest request);

    /**
      * You can configure a number of parameters at a time by using a parameter template and then apply the parameter template to an instance. For more information, see [Use a parameter template to configure the parameters of ApsaraDB RDS for MySQL instances](~~130565~~) or [Use a parameter template to configure the parameters of ApsaraDB RDS for PostgreSQL instances](~~457176~~).
      * > This operation is supported only when your instance runs MySQL or PostgreSQL.
      *
     */
    CompletableFuture<CloneParameterGroupResponse> cloneParameterGroup(CloneParameterGroupRequest request);

    /**
      * After you call the QueryNotify operation to query notifications for an instance, you can call this operation to mark the notifications as confirmed. For more information, see [Query notifications for an ApsaraDB RDS instance](~~427959~~).
      *
     */
    CompletableFuture<ConfirmNotifyResponse> confirmNotify(ConfirmNotifyRequest request);

    /**
      * This operation is phased out.
      *
     */
    CompletableFuture<CopyDatabaseResponse> copyDatabase(CopyDatabaseRequest request);

    /**
      * You can also call this operation to restore specific databases to an existing instance by point in time or backup set. For more information, see [Restore the data of an ApsaraDB RDS for SQL Server instance](~~95722~~).
      * Before you call this operation, make sure that the following requirements are met:
      * *   The source and destination instances belong to the same account.
      * *   The source and destination instances run the same version of database engine.
      * *   The source and destination instances reside in the same region and use the same network type. The instances can reside in different zones.
      * *   The source and destination instances do not have databases whose names are the same.
      * *   The available storage of the destination instance is larger than the total size of the databases that you want to replicate from the source instance.
      * > This operation is supported only for instances that run SQL Server 2012 and later.
      *
     */
    CompletableFuture<CopyDatabaseBetweenInstancesResponse> copyDatabaseBetweenInstances(CopyDatabaseBetweenInstancesRequest request);

    /**
      * Before you call this operation, make sure that the following requirements are met:
      * *   The instance is in the Running state.
      * *   The database is in the Running state.
      * *   The number of accounts that are created on the instance does not exceed the upper limit. For more information, see [Limits](~~41872~~).
      * > 
      * *   This operation is supported for instances that run MySQL, MariaDB, PostgreSQL, and SQL Server. However, if the instance runs SQL Server 2017 or SQL Server 2019 on RDS Cluster Edition, this operation is not supported.
      * *   You can create multiple privileged accounts and standard accounts on an instance that runs PostgreSQL.
      *
     */
    CompletableFuture<CreateAccountResponse> createAccount(CreateAccountRequest request);

    /**
      * This operation uses the backup feature of ApsaraDB RDS to create a backup set. You can also use an operation of Database Backup (DBS) to create a backup set. For more information, see [List of operations by function of DBS](~~437245~~).
      * Before you call this operation, make sure that the following requirements are met:
      * *   The original instance is in the Running state.
      * *   The instance does not have ongoing backup tasks.
      * *   The number of backup files that are created per day for an instance cannot exceed 20.
      *
     */
    CompletableFuture<CreateBackupResponse> createBackup(CreateBackupRequest request);

    /**
      * ## Prerequisites
      * The RDS instance meets the following requirements:
      * * The RDS instance and the self-managed PostgreSQL instance run the same PostgreSQL version, which can be PostgreSQL 10, PostgreSQL 11, PostgreSQL 12, PostgreSQL 13, PostgreSQL 14, or PostgreSQL 15.
      * * The RDS instance is a primary instance. Read-only RDS instances do not support cloud migration.
      * * The RDS instance uses cloud disks.
      * * The RDS instance is empty. The available storage of the RDS instance is greater than or equal to the size of the data in the self-managed PostgreSQL instance.
      * The self-managed PostgreSQL instance meets the following requirements:
      * * Network configurations
      * |Migration source|Network configuration|
      * |:---|---|
      * |Self-managed ECS-based PostgreSQL Database|If the self-managed PostgreSQL instance resides on an Elastic Compute Service (ECS) instance, the ECS instance and the RDS instance must reside in the same virtual private cloud (VPC). If the ECS instance and the RDS instance reside in different VPCs, use Cloud Enterprise Network (CEN) to connect the VPCs. For more information, see [What is CEN?](~~181681~~)|
      * |Self-managed PostgreSQL database in a data center (within the same VPC as the destination database)|The data center is able to communicate with the VPC to which the destination RDS instance belongs. For more information, see [Connect a data center to a VPC](~~97768~~).|
      * * If the self-managed PostgreSQL instance resides on an ECS instance, an ECS security group is configured. For more information, see [(Optional) Configure an ECS security group on a self-managed PostgreSQL instance](~~369726~~).
      * * The configurations that are described in [Configure a self-managed PostgreSQL instance to listen to remote connections](~~369727~~) are complete.
      * * The configurations that are described in [Create an account for cloud migration on a self-managed PostgreSQL instance](~~369500~~) are complete.
      * * The configurations that are described in [Update the pg\\_hba.conf file of a self-managed PostgreSQL instance](~~369728~~) are complete.
      * * The configurations that are described in [Configure the firewall of the server on which a self-managed PostgreSQL instance resides](~~369729~~) are complete.
      *
     */
    CompletableFuture<CreateCloudMigrationPrecheckTaskResponse> createCloudMigrationPrecheckTask(CreateCloudMigrationPrecheckTaskRequest request);

    /**
      * ## Prerequisites
      * Before you call this operation, make sure that the ApsaraDB RDS for PostgreSQL instance passes the cloud migration assessment.
      *
     */
    CompletableFuture<CreateCloudMigrationTaskResponse> createCloudMigrationTask(CreateCloudMigrationTaskRequest request);

    /**
      * Before you call this operation, make sure that you understand the billing methods and pricing of ApsaraDB RDS. For more information, see [Billable items, billing methods, and pricing](~~45020~~).
      * For more information about ApsaraDB RDS instance types, see [Primary ApsaraDB RDS instance types](~~26312~~).
      *
     */
    CompletableFuture<CreateDBInstanceResponse> createDBInstance(CreateDBInstanceRequest request);

    /**
      * ## Background information
      * *   This operation is suitable only for ApsaraDB RDS for MySQL instances that run RDS Cluster Edition.
      * *   Each type of endpoint can contain an internal endpoint and an external endpoint. When you create any type of endpoint, an internal endpoint is automatically created for the endpoint.
      * *   If the instance runs MySQL, you must specify VPCId, VSwitchId, and NodeItems.
      *
     */
    CompletableFuture<CreateDBInstanceEndpointResponse> createDBInstanceEndpoint(CreateDBInstanceEndpointRequest request);

    /**
      * ## Background information
      * *   This operation is suitable only for ApsaraDB RDS for MySQL instances that run RDS Cluster Edition.
      * *   You can create a public endpoint of an endpoint type only when no public endpoint is created for this endpoint type.
      * *   The node weights and other configurations are the same as those of the internal endpoint of this endpoint type. Only one public endpoint and one internal endpoint can be created for each endpoint type.
      *
     */
    CompletableFuture<CreateDBInstanceEndpointAddressResponse> createDBInstanceEndpointAddress(CreateDBInstanceEndpointAddressRequest request);

    /**
      * **Before you call this operation, make sure that you understand the billing methods and pricing of ApsaraDB RDS. For more information, see [Pricing, billable items, and billing methods](~~45020~~).**
      * You can call this operation only for instances that are moved to the recycle bin. For more information about instances that can be moved to the recycle bin, see [Recycle bin](~~96065~~).
      *
     */
    CompletableFuture<CreateDBInstanceForRebuildResponse> createDBInstanceForRebuild(CreateDBInstanceForRebuildRequest request);

    /**
      * ## Background information
      * This operation is suitable only for ApsaraDB RDS for MySQL instances that run RDS Cluster Edition. These RDS instances are referred to as RDS clusters.
      *
     */
    CompletableFuture<CreateDBNodesResponse> createDBNodes(CreateDBNodesRequest request);

    /**
      * After you enable the dedicated proxy feature for an ApsaraDB RDS for MySQL instance or enable the database proxy feature for an ApsaraDB RDS for PostgreSQL instance, a default proxy endpoint is created. You can call this operation to create proxy endpoints of different network types. For more information, see [Activate and configure the database proxy feature for an ApsaraDB RDS for PostgreSQL instance](~~418272~~) and [What are database proxies?](~~138705~~)
      * > 
      * *   The following network types are supported for ApsaraDB RDS for MySQL instances that use local disks: virtual private cloud (VPC), Classic, and Public.
      * *   The following network types are supported for instances that use cloud disks: VPC and Public. If you want to create a proxy endpoint of the public network type, you must configure IP address whitelists for the instance and its read-only instances to ensure connectivity between the client and the instance. You can call the [ModifySecurityIps](~~26242~~) operation to configure an IP address whitelist for an instance.
      *
     */
    CompletableFuture<CreateDBProxyEndpointAddressResponse> createDBProxyEndpointAddress(CreateDBProxyEndpointAddressRequest request);

    /**
      * If you want to perform data management tasks such as data change and schema design, use Data Management (DMS). For more information, see [List of operations by function of DMS](~~97965~~).
      * Before you call this operation, make sure that the following requirements are met:
      * *   The instance is in the Running state.
      * *   The maximum number of databases that can be created on an instance is not reached. You can call the [DescribeDBInstanceAttribute](~~26231~~) operation to query the maximum number of databases that can be created on an instance.
      * *   The instance is not a read-only instance.
      * > This operation is not supported for instances that run PostgreSQL with local SSDs or SQL Server 2017 (cluster edition). You can execute the CREATE DATABASE statement to create a database.
      *
     */
    CompletableFuture<CreateDatabaseResponse> createDatabase(CreateDatabaseRequest request);

    /**
      * Before you call this operation, you can call the [CheckCreateDdrDBInstance](~~121721~~) operation to check whether the data of the source instance can be restored from a cross-region backup set.
      * Before you call this operation, make sure that the instance runs one of the following database engines:
      * *   MySQL. For more information, see [Back up an ApsaraDB RDS for MySQL instance across regions](~~120824~~).
      * *   SQL Server. For more information, see [Back up an ApsaraDB RDS for SQL Server instance across regions](~~187923~~).
      * *   PostgreSQL. For more information, see [Enable cross-region backups for an ApsaraDB RDS for PostgreSQL instance](~~206671~~).
      *
     */
    CompletableFuture<CreateDdrInstanceResponse> createDdrInstance(CreateDdrInstanceRequest request);

    /**
      * > This operation is no longer maintained. You can use the CreateDiagnosticReport operation of Database Autonomy Service (DAS) to create a diagnostic report.
      * After you call this operation to create a diagnostic report, you can call the DescribeDiagnosticReportList operation to download the diagnostic report.
      *
     */
    CompletableFuture<CreateDiagnosticReportResponse> createDiagnosticReport(CreateDiagnosticReportRequest request);

    /**
      * ### Prerequisites
      * *   Your Alibaba Cloud account is used.
      * *   The balance in your Alibaba Cloud account is greater than or equal to USD 100.
      * *   A primary ApsaraDB RDS for MySQL instance is created, and the instance is not running as a node in a global active database cluster. You can call the [CreateDBInstance](~~26228~~) operation to create an instance.
      * > You must create a primary ApsaraDB RDS for MySQL instance in one of the following regions: China (Hangzhou), China (Shanghai), China (Qingdao), China (Beijing), China (Zhangjiakou), China (Shenzhen), and China (Chengdu).
      * For more information, see [Create and release an ApsaraDB RDS global active database cluster](~~328592~~).
      *
     */
    CompletableFuture<CreateGADInstanceResponse> createGADInstance(CreateGADInstanceRequest request);

    /**
      * ## Prerequisites
      * An ApsaraDB RDS global active database cluster is created. You can call the [CreateGADInstance](~~336893~~) operation to create a global active database cluster.
      * For more information, see [Add unit nodes to or move unit nodes from an ApsaraDB RDS global active database cluster](~~331851~~).
      *
     */
    CompletableFuture<CreateGadInstanceMemberResponse> createGadInstanceMember(CreateGadInstanceMemberRequest request);

    CompletableFuture<CreateMigrateTaskResponse> createMigrateTask(CreateMigrateTaskRequest request);

    /**
      * This operation is used to migrate backup data to the cloud. Before you call this operation, make sure that you understand the descriptions in [Migrate the full backup data of a self-managed SQL Server database to an ApsaraDB RDS instance that runs SQL Server 2008 R2](~~95737~~), [Migrate the full backup data of a self-managed SQL Server database to an ApsaraDB RDS instance that runs SQL Server 2012, SQL Server 2014, SQL Server 2016, SQL Server 2017, or SQL Server 2019](~~95738~~), and [Migrate the incremental backup data of a self-managed SQL Server database to an ApsaraDB RDS instance that runs SQL Server 2012, SQL Server 2014, SQL Server 2016, SQL Server 2017, or SQL Server 2019](~~95736~~).
      *
     */
    CompletableFuture<CreateOnlineDatabaseTaskResponse> createOnlineDatabaseTask(CreateOnlineDatabaseTaskRequest request);

    /**
      * You can configure a number of parameters at a time by using a parameter template and then apply the parameter template to an instance. For more information, see [Use a parameter template to configure the parameters of ApsaraDB RDS for MySQL instances](~~130565~~) and [Use a parameter template to configure the parameters of ApsaraDB RDS for PostgreSQL instances](~~457176~~).
      * > This operation is supported only when your instance runs MySQL or PostgreSQL.
      *
     */
    CompletableFuture<CreateParameterGroupResponse> createParameterGroup(CreateParameterGroupRequest request);

    /**
      * **Before you call this operation, take note of the following limits:**
      * *   The primary instance cannot belong to a dedicated cluster and must run one of the following database engine versions and RDS editions:
      *     *   MySQL 8.0 on RDS High-availability Edition or RDS Enterprise Edition.
      *     *   MySQL 5.7 on RDS High-availability Edition or RDS Enterprise Edition.
      *     *   MySQL 5.6.
      *     *   SQL Server 2017 on RDS Cluster Edition.
      *     *   PostgreSQL 10, PostgreSQL 11, PostgreSQL 12, PostgreSQL 13, PostgreSQL 14, or PostgreSQL 15 on RDS High-availability Edition. If the primary instance runs PostgreSQL 10, the instance must use local disks and must be a dedicated instance that provides at least 8 cores and 32 GB of memory.
      * *   If the primary instance runs MySQL, you can create up to 10 read-only instances.
      * *   If the primary instance runs SQL Server, you can create up to seven read-only instances.
      * *   If the primary instance runs PostgreSQL with local disks, you can create up to five read-only instances. If the primary instance runs PostgreSQL with cloud disks, you can create up to 32 read-only instances.
      *
     */
    CompletableFuture<CreateReadOnlyDBInstanceResponse> createReadOnlyDBInstance(CreateReadOnlyDBInstanceRequest request);

    CompletableFuture<CreateSecretResponse> createSecret(CreateSecretRequest request);

    /**
      * ApsaraDB RDS supports the following service-linked roles:
      * *   The AliyunServiceRoleForRdsPgsqlOnEcs role is used for ApsaraDB RDS for PostgreSQL instances.
      * *   The AliyunServiceRoleForRDSProxyOnEcs role is used for the database proxy feature of ApsaraDB RDS instances.
      *
     */
    CompletableFuture<CreateServiceLinkedRoleResponse> createServiceLinkedRole(CreateServiceLinkedRoleRequest request);

    /**
      * You can create a temporary instance based on a backup file or a point in time within the past seven days.
      * Before you call this operation, make sure that the following requirements are met:
      * *   Your instance runs SQL Server 2008 R2.
      * *   Your instance is in the Running state.
      * *   Your instance does not have ongoing migration tasks.
      * *   The last creation of a backup file is completed.
      * > After a temporary instance is created, the temporary instance inherits the data in the backup file.
      *
     */
    CompletableFuture<CreateTempDBInstanceResponse> createTempDBInstance(CreateTempDBInstanceRequest request);

    /**
      * This operation is available only for ApsaraDB RDS for SQL Server instances.
      *
     */
    CompletableFuture<DeleteADSettingResponse> deleteADSetting(DeleteADSettingRequest request);

    /**
      * Before you call this operation, make sure that the instance is in the Running state. If the instance is not in the Running state, the operation fails.
      * > 
      * *   This operation is not supported for instances that run SQL Server 2017 EE, PostgreSQL with local SSDs.
      * *   If you want to delete an account from an instance that runs PostgreSQL with standard SSDs or enhanced SSDs (ESSDs) and the account has permissions on specific objects such as databases and tables, this operation reports the "`Some objects depend on account`" error. Before you can delete the account, you must remove the permissions from the account.
      *
     */
    CompletableFuture<DeleteAccountResponse> deleteAccount(DeleteAccountRequest request);

    /**
      * Backup sets of only the instance itself are deleted. Backup sets of the associated instances such as read-only, disaster recovery, and cloned instances are not deleted.
      * Before you call this operation, make sure that the following requirements are met:
      * *   The instance is in the Running state.
      * *   The instance runs PostgreSQL or MySQL on RDS High-availability.
      * *   If the log backup feature is disabled, instances cannot be restored by point in time. You can delete data backup sets that are retained for more than seven days.
      * *   If the log backup feature is enabled and the log backup retention period is shorter than the data backup retention period, you can delete the data backup files that are retained for a period longer than the log backup retention period.
      *
     */
    CompletableFuture<DeleteBackupResponse> deleteBackup(DeleteBackupRequest request);

    /**
      * This operation is available for users whose accounts are added to the whitelist of an ApsaraDB RDS for SQL Server instance. If your account is not added to the whitelist of the instance, you can join the Database Backup (DBS) DingTalk group whose ID is 35585947 and contact the on-duty engineer to add your account to the whitelist.
      *
     */
    CompletableFuture<DeleteBackupFileResponse> deleteBackupFile(DeleteBackupFileRequest request);

    CompletableFuture<DeleteDBInstanceResponse> deleteDBInstance(DeleteDBInstanceRequest request);

    CompletableFuture<DeleteDBInstanceEndpointResponse> deleteDBInstanceEndpoint(DeleteDBInstanceEndpointRequest request);

    /**
      * ## Background information
      * *   This operation is suitable only for ApsaraDB RDS for MySQL instances that run RDS Cluster Edition.
      * *   You can delete only the public endpoint of each endpoint type from the instance. If you want to delete an internal endpoint of any endpoint type, you can delete the type of endpoint.
      *
     */
    CompletableFuture<DeleteDBInstanceEndpointAddressResponse> deleteDBInstanceEndpointAddress(DeleteDBInstanceEndpointAddressRequest request);

    /**
      * ## Background information
      * This operation is suitable only for ApsaraDB RDS for MySQL instances that run RDS Cluster Edition. These RDS instances are referred to as RDS clusters.
      *
     */
    CompletableFuture<DeleteDBNodesResponse> deleteDBNodes(DeleteDBNodesRequest request);

    CompletableFuture<DeleteDBProxyEndpointAddressResponse> deleteDBProxyEndpointAddress(DeleteDBProxyEndpointAddressRequest request);

    /**
      * Before you call this operation, make sure that the following requirements are met:
      * *   The instance is in the Running state.
      * *   The instance is a primary instance.
      * *   The instance runs MySQL, SQL Server, or MariaDB.
      * > This operation is not supported for instances that run PostgreSQL. You can execute the DROP DATABASE statement to drop a database from an ApsaraDB RDS for PostgreSQL instance.
      *
     */
    CompletableFuture<DeleteDatabaseResponse> deleteDatabase(DeleteDatabaseRequest request);

    /**
      * ## Precautions
      * *   A global active database cluster cannot be restored after it is deleted. Proceed with caution when you delete a global active database cluster.
      * *   If you delete a global active database cluster, the system removes all nodes and Data Transmission Service (DTS) synchronization tasks from the cluster. However, the system does not release the ApsaraDB RDS for MySQL instances that run as nodes in the cluster. If you no longer need the ApsaraDB RDS for MySQL instances, you can call the [DeleteDBInstance](~~26229~~) to delete the instances one after another.
      *
     */
    CompletableFuture<DeleteGadInstanceResponse> deleteGadInstance(DeleteGadInstanceRequest request);

    /**
      * You can apply a parameter template to an instance to manage a number of parameters at a time. For more information, see [Use a parameter template to configure the parameters of ApsaraDB RDS for MySQL instances](~~130565~~) or [Use a parameter template to configure the parameters of ApsaraDB RDS for PostgreSQL instances](~~457176~~).
      * > 
      * *   If you delete a parameter template, the instances to which the parameter template is applied are not affected.
      * *   Before you can delete a parameter template in ApsaraDB RDS for PostgreSQL, you must apply another parameter template to the ApsaraDB RDS for PostgreSQL instances to which the parameter template is applied. You can call the [DescribeParameterGroup](~~144842~~) operation to query the instances to which a parameter template is applied.
      *
     */
    CompletableFuture<DeleteParameterGroupResponse> deleteParameterGroup(DeleteParameterGroupRequest request);

    CompletableFuture<DeleteSecretResponse> deleteSecret(DeleteSecretRequest request);

    /**
      * *   This operation is available only for ApsaraDB RDS for PostgreSQL instances.
      * *   A replication slot can be deleted only when SlotStatus is **INACTIVE**. You can call the DescribeSlots operation to query the status of a replication slot.
      *
     */
    CompletableFuture<DeleteSlotResponse> deleteSlot(DeleteSlotRequest request);

    /**
      * > 
      * *   A full backup file contains the data of a self-managed MySQL database. You can restore the data of a self-managed MySQL database from a full backup file to an ApsaraDB RDS for MySQL instance. For more information, see [Migrate the data of a self-managed MySQL 5.7 instance to the cloud](~~251779~~).
      * *   This operation deletes full backup files only from the ApsaraDB RDS console. This operation does not affect the full backup files that are stored as objects in Object Storage Service (OSS) buckets. After you call this operation to delete a full backup file, you can call the [ImportUserBackupFile](~~260266~~) operation to reimport the full backup file.
      *
     */
    CompletableFuture<DeleteUserBackupFileResponse> deleteUserBackupFile(DeleteUserBackupFileRequest request);

    /**
      * This operation is suitable only for the instances that run MySQL or SQL Server. For more information about how to run a migration task, see [ImportDatabaseBetweenInstances](~~26301~~).
      *
     */
    CompletableFuture<DescibeImportsFromDatabaseResponse> descibeImportsFromDatabase(DescibeImportsFromDatabaseRequest request);

    /**
      * This operation is available only for ApsaraDB RDS for SQL Server instances.
      *
     */
    CompletableFuture<DescribeADInfoResponse> describeADInfo(DescribeADInfoRequest request);

    /**
      * > This operation is not supported for instances that run SQL Server 2017 on RDS Cluster Edition.
      *
     */
    CompletableFuture<DescribeAccountsResponse> describeAccounts(DescribeAccountsRequest request);

    /**
      * The event history feature enables you to view the events that occurred in a region over a specific time range. The events include instance creation and parameter reconfiguration. For more information, see [Event history](~~129759~~).
      *
     */
    CompletableFuture<DescribeActionEventPolicyResponse> describeActionEventPolicy(DescribeActionEventPolicyRequest request);

    /**
      * After you call this operation and obtain the information about a specific O\\&M task, you can call the [ModifyActiveOperationTask](~~611454~~) operation to modify the scheduled switching time of the O\\&M task. You can also view the task and modify the scheduled switching time on the Task Center page of the ApsaraDB RDS console.
      *
     */
    CompletableFuture<DescribeActiveOperationTasksResponse> describeActiveOperationTasks(DescribeActiveOperationTasksRequest request);

    CompletableFuture<DescribeAnalyticdbByPrimaryDBInstanceResponse> describeAnalyticdbByPrimaryDBInstance(DescribeAnalyticdbByPrimaryDBInstanceRequest request);

    CompletableFuture<DescribeAvailableClassesResponse> describeAvailableClasses(DescribeAvailableClassesRequest request);

    /**
      * Before you call this operation, make sure that the instance runs one of the following database engines:
      * *   MySQL. For more information, see [Back up an ApsaraDB RDS for MySQL instance across regions](~~120824~~).
      * *   SQL Server. For more information, see [Back up an ApsaraDB RDS for SQL Server instance across regions](~~187923~~).
      * *   PostgreSQL. For more information, see [Back up an ApsaraDB RDS for PostgreSQL instance across regions](~~206671~~).
      *
     */
    CompletableFuture<DescribeAvailableCrossRegionResponse> describeAvailableCrossRegion(DescribeAvailableCrossRegionRequest request);

    /**
      * ### Prerequisites
      * The instance runs PostgreSQL.
      * For more information, see [View the Enhanced Monitoring metrics of an ApsaraDB RDS for PostgreSQL instance](~~299200~~).
      *
     */
    CompletableFuture<DescribeAvailableMetricsResponse> describeAvailableMetrics(DescribeAvailableMetricsRequest request);

    /**
      * To query the time range to which you can restore data by using a common backup file, see [DescribeBackups](~~26273~~).
      * Before you call this operation, make sure that the instance runs one of the following database engines:
      * *   MySQL. For more information, see [Back up an ApsaraDB RDS for MySQL instance across regions](~~120824~~).
      * *   PostgreSQL. For more information, see [Back up an ApsaraDB RDS for PostgreSQL instance across regions](~~206671~~).
      *
     */
    CompletableFuture<DescribeAvailableRecoveryTimeResponse> describeAvailableRecoveryTime(DescribeAvailableRecoveryTimeRequest request);

    CompletableFuture<DescribeAvailableZonesResponse> describeAvailableZones(DescribeAvailableZonesRequest request);

    /**
      * > This operation is phased out.
      *
     */
    CompletableFuture<DescribeBackupDatabaseResponse> describeBackupDatabase(DescribeBackupDatabaseRequest request);

    CompletableFuture<DescribeBackupPolicyResponse> describeBackupPolicy(DescribeBackupPolicyRequest request);

    CompletableFuture<DescribeBackupTasksResponse> describeBackupTasks(DescribeBackupTasksRequest request);

    /**
      * > A backup set can be used to restore data only when **BackupStatus** of the backup set is **Success**.
      *
     */
    CompletableFuture<DescribeBackupsResponse> describeBackups(DescribeBackupsRequest request);

    /**
      * *   If the return value of the **DownloadLink** parameter is NULL, ApsaraDB RDS does not provide a URL for you to download binary log files.
      * *   If the return value of the **DownloadLink** parameter is not NULL, ApsaraDB RDS provides a URL for you to download binary log files. The expiration time of the URL is specified by the **LinkExpiredTime** parameter. You must download the binary log files before the expiration time.
      * *   Each binary log file that is returned by this operation contains the log entries that are generated over the time range specified by the StartTime and EndTime parameters.
      * > This operation is not supported for instances that run SQL Server.
      *
     */
    CompletableFuture<DescribeBinlogFilesResponse> describeBinlogFiles(DescribeBinlogFilesRequest request);

    CompletableFuture<DescribeCharacterSetNameResponse> describeCharacterSetName(DescribeCharacterSetNameRequest request);

    /**
      * ## Prerequisites
      * Before you call the DescribeCloudMigrationPrecheckResult operation, make sure that the CreateCloudMigrationPrecheckTask operation is called to create a cloud migration assessment task for the ApsaraDB RDS for PostgreSQL instance.
      *
     */
    CompletableFuture<DescribeCloudMigrationPrecheckResultResponse> describeCloudMigrationPrecheckResult(DescribeCloudMigrationPrecheckResultRequest request);

    /**
      * ## Prerequisites
      * Before you call the DescribeCloudMigrationResult operation, make sure that cloud migration tasks are created by calling the [CreateCloudMigrationTask](~~411690~~) operation.
      *
     */
    CompletableFuture<DescribeCloudMigrationResultResponse> describeCloudMigrationResult(DescribeCloudMigrationResultRequest request);

    /**
      * >  This operation is supported only for instances that run SQL Server 2012 or later.
      *
     */
    CompletableFuture<DescribeCollationTimeZonesResponse> describeCollationTimeZones(DescribeCollationTimeZonesRequest request);

    /**
      * ApsaraDB RDS for MySQL instances support cross-region backup and restoration. For more information, see [Back up an ApsaraDB RDS for MySQL instance across regions](~~120824~~) and [Restore the data of an ApsaraDB RDS for MySQL instance across regions](~~120875~~).
      * Before you call this operation, make sure that the instance runs one of the following database engines:
      * *   MySQL. For more information, see [Back up an ApsaraDB RDS for MySQL instance across regions](~~120824~~).
      * *   SQL Server. For more information, see [Back up an ApsaraDB RDS for SQL Server instance across regions](~~187923~~).
      * *   PostgreSQL. For more information, see [Enable cross-region backups for an ApsaraDB RDS for PostgreSQL instance](~~206671~~).
      *
     */
    CompletableFuture<DescribeCrossBackupMetaListResponse> describeCrossBackupMetaList(DescribeCrossBackupMetaListRequest request);

    /**
      * Before you call this operation, make sure that the instance runs one of the following database engines:
      * *   MySQL. For more information, see [Back up an ApsaraDB RDS for MySQL instance across regions](~~120824~~).
      * *   SQL Server. For more information, see [Back up an ApsaraDB RDS for SQL Server instance across regions](~~187923~~).
      * *   PostgreSQL. For more information, see [Enable cross-region backups for an ApsaraDB RDS for PostgreSQL instance](~~206671~~).
      *
     */
    CompletableFuture<DescribeCrossRegionBackupDBInstanceResponse> describeCrossRegionBackupDBInstance(DescribeCrossRegionBackupDBInstanceRequest request);

    /**
      * For more information about how to query the cross-region log backup files of an RDS instance, see [DescribeCrossRegionLogBackupFiles](~~121734~~).
      * Before you call this operation, make sure that the instance runs one of the following database engines:
      * *   MySQL. For more information, see [Back up an ApsaraDB RDS for MySQL instance across regions](~~120824~~).
      * *   SQL Server. For more information, see [Back up an ApsaraDB RDS for SQL Server instance across regions](~~187923~~).
      * *   PostgreSQL. For more information, see [Back up an ApsaraDB RDS for PostgreSQL instance across regions](~~206671~~).
      *
     */
    CompletableFuture<DescribeCrossRegionBackupsResponse> describeCrossRegionBackups(DescribeCrossRegionBackupsRequest request);

    /**
      * For more information about how to query the cross-region data backup files of an RDS instance, see [DescribeCrossRegionBackups](~~121733~~).
      * Before you call this operation, make sure that the instance runs one of the following database engine versions and RDS editions:
      * *   MySQL 8.0 on RDS High-availability Edition (with local SSDs)
      * *   MySQL 5.7 on RDS High-availability Edition (with local SSDs)
      * *   MySQL 5.6
      *
     */
    CompletableFuture<DescribeCrossRegionLogBackupFilesResponse> describeCrossRegionLogBackupFiles(DescribeCrossRegionLogBackupFilesRequest request);

    CompletableFuture<DescribeDBInstanceAttributeResponse> describeDBInstanceAttribute(DescribeDBInstanceAttributeRequest request);

    CompletableFuture<DescribeDBInstanceByTagsResponse> describeDBInstanceByTags(DescribeDBInstanceByTagsRequest request);

    /**
      * This operation is phased out.
      *
     */
    CompletableFuture<DescribeDBInstanceDetailResponse> describeDBInstanceDetail(DescribeDBInstanceDetailRequest request);

    CompletableFuture<DescribeDBInstanceEncryptionKeyResponse> describeDBInstanceEncryptionKey(DescribeDBInstanceEncryptionKeyRequest request);

    /**
      * ## Background information
      * *   An ApsaraDB RDS for MySQL instance that runs RDS Cluster Edition is created. The instance is referred to as a cluster.
      * *   This operation is suitable only for ApsaraDB RDS for MySQL instances that run RDS Cluster Edition.
      *
     */
    CompletableFuture<DescribeDBInstanceEndpointsResponse> describeDBInstanceEndpoints(DescribeDBInstanceEndpointsRequest request);

    CompletableFuture<DescribeDBInstanceHAConfigResponse> describeDBInstanceHAConfig(DescribeDBInstanceHAConfigRequest request);

    CompletableFuture<DescribeDBInstanceIPArrayListResponse> describeDBInstanceIPArrayList(DescribeDBInstanceIPArrayListRequest request);

    /**
      * ApsaraDB RDS instances are deployed based on ECS instances. This operation is used to query the hostname of the ECS instance where an ApsaraDB RDS instance resides. The hostname is required when you [configure a distributed transaction whitelist](~~124321~~).
      * This operation is applicable to instances that run one of the following SQL Server versions on RDS High-availability Edition: SQL Server 2012 SE, SQL Server 2012 EE, SQL Server 2014 SE, SQL Server 2016 SE, SQL Server 2016 EE, and SQL Server 2017 SE.
      *
     */
    CompletableFuture<DescribeDBInstanceIpHostnameResponse> describeDBInstanceIpHostname(DescribeDBInstanceIpHostnameRequest request);

    /**
      * ### Prerequisites
      * The instance runs PostgreSQL.
      * For more information, see [View the Enhanced Monitoring metrics of an ApsaraDB RDS for PostgreSQL instance](~~299200~~).
      *
     */
    CompletableFuture<DescribeDBInstanceMetricsResponse> describeDBInstanceMetrics(DescribeDBInstanceMetricsRequest request);

    /**
      * >  This operation is not supported for RDS instances that run PostgreSQL. The monitoring frequency of such an instance varies based on the query time range. For more information, see [Query performance metrics](~~26280~~).
      *
     */
    CompletableFuture<DescribeDBInstanceMonitorResponse> describeDBInstanceMonitor(DescribeDBInstanceMonitorRequest request);

    CompletableFuture<DescribeDBInstanceNetInfoResponse> describeDBInstanceNetInfo(DescribeDBInstanceNetInfoRequest request);

    CompletableFuture<DescribeDBInstanceNetInfoForChannelResponse> describeDBInstanceNetInfoForChannel(DescribeDBInstanceNetInfoForChannelRequest request);

    /**
      * You can query the performance of an instance over a specific time range based on its performance metrics. Performance metrics are generated by using one of the following methods based on the database engine and version, RDS edition, [monitoring frequency](~~26200~~) ([ModifyDBInstanceMonitor](~~26282~~)), and query time range:
      * *   For instances that do not run MySQL on RDS High-availability Edition with standard SSDs or enhanced SSDs (ESSDs) and those that do not run MariaDB:
      *     *   5-second monitoring frequency
      *         *   If the query time range is greater than seven days, performance metrics are collected at 1-day intervals.
      *         *   If the query time range is greater than one day but less than or equal to seven days, performance metrics are collected at 1-hour intervals.
      *         *   If the query time range is greater than or equal to an hour but less than or equal to one day, performance metrics are collected at 1-minute intervals.
      *         *   If the query time range is less than an hour, performance metrics are collected at 5-second intervals.
      *     *   60-second monitoring frequency
      *         *   If the query time range is greater than 30 days, performance metrics are collected at 1-day intervals.
      *         *   If the query time range is greater than seven days but less than or equal to 30 days, performance metrics are collected at 1-hour intervals.
      *         *   If the query time range is less than or equal to seven days, performance metrics are collected at 1-minute intervals.
      *     *   300-second monitoring frequency
      *         *   If the query time range is greater than 30 days, performance metrics are collected at 1-day intervals.
      *         *   If the query time range is greater than seven days but less than or equal to 30 days, performance metrics are collected at 1-hour intervals.
      *         *   If the query time range is less than or equal to seven days, performance metrics are collected at 5-minute intervals.
      * *   For instances that are running MySQL on RDS High-availability Edition with standard SSDs or ESSDs and those that are running MariaDB:
      *     *   If the query time range is greater than 30 days, performance metrics are collected at 1-day intervals.
      *     *   If the query time range is greater than seven days but less than or equal to 30 days, performance metrics are collected at 1-hour intervals.
      *     *   If the query time range is less than or equal to seven days, performance metrics are collected at 1-minute intervals.
      * *   For instances that run PostgreSQL with local SSDs, standard SSDs, or ESSDs:
      *     *   If the query time range is less than or equal to an hour, performance metrics are collected at 5-second intervals.
      *     *   If the query time range is less than or equal to 2 hours, performance metrics are collected at 10-second intervals.
      *     *   If the query time range is less than or equal to 6 hours, performance metrics are collected at 30-second intervals.
      *     *   If the query time range is less than or equal to 12 hours, performance metrics are collected at 1-minute intervals.
      *     *   If the query time range is less than or equal to one day, performance metrics are collected at 2-minute intervals.
      *     *   If the query time range is less than or equal to five days, performance metrics are collected at 10-minute intervals.
      *     *   If the query time range is less than or equal to 15 days, performance metrics are collected at 30-minute intervals.
      *     *   If the query time range is less than or equal to 30 days, performance metrics are collected at 1-hour intervals.
      *
     */
    CompletableFuture<DescribeDBInstancePerformanceResponse> describeDBInstancePerformance(DescribeDBInstancePerformanceRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribeDBInstancePromoteActivityResponse> describeDBInstancePromoteActivity(DescribeDBInstancePromoteActivityRequest request);

    /**
      * This operation is used to query the original settings of shared proxies rather than the latest settings of dedicated proxies. For more information about how to query the settings of dedicated proxies, see [DescribeDBProxy](~~141055~~).
      * Before you call this operation, make sure that the following requirements are met:
      * *   The shared proxy feature must be enabled for the primary instance.
      * *   The read/write splitting feature must be enabled for the primary instance.
      *
     */
    CompletableFuture<DescribeDBInstanceProxyConfigurationResponse> describeDBInstanceProxyConfiguration(DescribeDBInstanceProxyConfigurationRequest request);

    /**
      * Before you call this operation, make sure that your instance is one of the following instances:
      * *   ApsaraDB RDS for MySQL instances that do not run RDS Basic Edition
      * *   ApsaraDB RDS for SQL Server instances
      * *   ApsaraDB RDS for PostgreSQL instances that use cloud disks
      *
     */
    CompletableFuture<DescribeDBInstanceSSLResponse> describeDBInstanceSSL(DescribeDBInstanceSSLRequest request);

    /**
      * This operation is used to view the [Transparent Data Encryption (TDE)](~~96121~~) configuration of an instance.
      * The TDE feature is enabled for the instance by calling the [ModifyDBInstanceTDE](~~26256~~) operation.
      *
     */
    CompletableFuture<DescribeDBInstanceTDEResponse> describeDBInstanceTDE(DescribeDBInstanceTDERequest request);

    /**
      * You can use one of the following methods to check the response:
      * *   Method 1: Use **MaxResults** to specify the number of entries per page. Then, use **NextToken** to specify the token that is used to display the next page. **NextToken** is set to the value that is returned from the most recent call of the **DescribeDBInstances** operation for **NextToken**.
      *     > The first time you call the DescribeDBInstances operation to perform a paged query, you need only to specify **MaxResults**. In this case, the operation returns the data of the first page and the value of **NextToken**.
      * *   Method 2: Use **PageSize** to specify the number of entries per page. Then, use **PageNumber** to display the next page.
      * > You can use only one of the preceding methods. If a large number of entries are returned, we recommend that you use Method 1 to increase the query speed.
      *
     */
    CompletableFuture<DescribeDBInstancesResponse> describeDBInstances(DescribeDBInstancesRequest request);

    /**
      * @deprecated
      * This operation is no longer available. You can call the DescribeDBInstanceAttribute operation to query information about an instance.
      *
     */
    CompletableFuture<DescribeDBInstancesAsCsvResponse> describeDBInstancesAsCsv(DescribeDBInstancesAsCsvRequest request);

    /**
      * > This operation is available only for subscription instances.
      *
     */
    CompletableFuture<DescribeDBInstancesByExpireTimeResponse> describeDBInstancesByExpireTime(DescribeDBInstancesByExpireTimeRequest request);

    /**
      * This operation is phased out.
      *
     */
    CompletableFuture<DescribeDBInstancesByPerformanceResponse> describeDBInstancesByPerformance(DescribeDBInstancesByPerformanceRequest request);

    /**
      * This operation is phased out.
      *
     */
    CompletableFuture<DescribeDBInstancesForCloneResponse> describeDBInstancesForClone(DescribeDBInstancesForCloneRequest request);

    /**
      * Before you purchase or upgrade an ApsaraDB RDS for MySQL instance or an ApsaraDB RDS for PostgreSQL instance, you can call the DescribeDBMiniEngineVersions operation to query the minor engine versions that are available for the instance.
      *
     */
    CompletableFuture<DescribeDBMiniEngineVersionsResponse> describeDBMiniEngineVersions(DescribeDBMiniEngineVersionsRequest request);

    /**
      * Before you call the ModifyDBProxyEndpoint operation, make sure that the [ModifyDBProxy](~~141054~~) operation is called to enable the database proxy feature for the instance.
      * *   The dedicated proxy feature of ApsaraDB RDS for MySQL provides capabilities such as read/write splitting and short-lived connection optimization. For more information, see [What are database proxies?](~~138705~~)
      * *   The database proxy feature of ApsaraDB RDS for PostgreSQL supports read/write splitting. For more information, see [What are database proxies?](~~412194~~)
      *
     */
    CompletableFuture<DescribeDBProxyResponse> describeDBProxy(DescribeDBProxyRequest request);

    /**
      * Before you call the DescribeDBProxyEndpoint operation, make sure that the [ModifyDBProxy](~~141054~~) operation is called to enable the database proxy feature for the instance.
      * *   The dedicated proxy feature of ApsaraDB RDS for MySQL provides capabilities such as read/write splitting and short-lived connection optimization. For more information, see [What are database proxies?](~~138705~~)
      * *   The database proxy feature of ApsaraDB RDS for PostgreSQL supports read/write splitting. For more information, see [What are database proxies?](~~412194~~)
      *
     */
    CompletableFuture<DescribeDBProxyEndpointResponse> describeDBProxyEndpoint(DescribeDBProxyEndpointRequest request);

    /**
      * Before you call the DescribeDBProxyPerformance operation, make sure that the [ModifyDBProxy](~~141054~~) operation is called to enable the database proxy feature for the instance.
      * *   The dedicated proxy feature of ApsaraDB RDS for MySQL provides capabilities such as read/write splitting and short-lived connection optimization. For more information, see [What are database proxies?](~~138705~~)
      * *   The database proxy feature of ApsaraDB RDS for PostgreSQL supports read/write splitting. For more information, see [What are database proxies?](~~412194~~)
      *
     */
    CompletableFuture<DescribeDBProxyPerformanceResponse> describeDBProxyPerformance(DescribeDBProxyPerformanceRequest request);

    /**
      * For more information, see [Configure a distributed transaction whitelist](~~124321~~).
      * This operation is applicable to instances that run one of the following SQL Server versions on RDS High-Availability Edition: SQL Server 2012 SE, SQL Server 2012 EE, SQL Server 2014 SE, SQL Server 2016 SE, SQL Server 2016 EE, and SQL Server 2017 SE.
      *
     */
    CompletableFuture<DescribeDTCSecurityIpHostsForSQLServerResponse> describeDTCSecurityIpHostsForSQLServer(DescribeDTCSecurityIpHostsForSQLServerRequest request);

    /**
      * >  If the specified request parameters are invalid, no database information is returned.
      *
     */
    CompletableFuture<DescribeDatabasesResponse> describeDatabases(DescribeDatabasesRequest request);

    /**
      * Dedicated clusters allow you to manage a number of instances at a time. You can create multiple dedicated clusters in a single region. Each dedicated cluster consists of multiple hosts. You can create multiple instances on each host. For more information, see [What is ApsaraDB MyBase?](~~141455~~)
      *
     */
    CompletableFuture<DescribeDedicatedHostGroupsResponse> describeDedicatedHostGroups(DescribeDedicatedHostGroupsRequest request);

    /**
      * Dedicated clusters allow you to manage a number of instances at a time. You can create multiple dedicated clusters in a single region. Each dedicated cluster consists of multiple hosts. You can create multiple instances on each host. For more information, see [What is ApsaraDB MyBase?](~~141455~~)
      *
     */
    CompletableFuture<DescribeDedicatedHostsResponse> describeDedicatedHosts(DescribeDedicatedHostsRequest request);

    /**
      * This operation is supported for instances that run MySQL with local SSDs. For more information about how to retain the data backup files of an instance after the instance is released, see [Configure automatic backup](~~98818~~).
      *
     */
    CompletableFuture<DescribeDetachedBackupsResponse> describeDetachedBackups(DescribeDetachedBackupsRequest request);

    /**
      * > This operation is no longer maintained. You can use the [DescribeDiagnosticReportList](~~443006~~) operation of Database Autonomy Service (DAS) to query a list of diagnostic reports.
      * *   The returned diagnosis reports include data collection time, data generation time, and download URLs. The system retains the reports for 15 days.
      * *   This operation is not suitable for instances that run SQL Server 2017 on RDS Cluster Edition.
      *
     */
    CompletableFuture<DescribeDiagnosticReportListResponse> describeDiagnosticReportList(DescribeDiagnosticReportListRequest request);

    /**
      * Error logs contain the time when they were generated and the error messages.
      *
     */
    CompletableFuture<DescribeErrorLogsResponse> describeErrorLogs(DescribeErrorLogsRequest request);

    /**
      * The event history feature enables you to view the events that occurred within a region over a specific time range. Historical events include instance creation and parameter modification. For more information, see [View the event history of an ApsaraDB RDS instance](~~129759~~).
      * Before you call this operation, make sure that the event history feature is enabled. Otherwise, this operation fails.
      *
     */
    CompletableFuture<DescribeEventsResponse> describeEvents(DescribeEventsRequest request);

    CompletableFuture<DescribeGadInstancesResponse> describeGadInstances(DescribeGadInstancesRequest request);

    /**
      * By default, Alibaba Cloud uses persistent connections to check the availability of an instance. For more information, see [What is availability detection?](~~207467~~)
      *
     */
    CompletableFuture<DescribeHADiagnoseConfigResponse> describeHADiagnoseConfig(DescribeHADiagnoseConfigRequest request);

    /**
      * After a primary/secondary switchover is complete, the primary instance is demoted to the secondary instance and the secondary instance is promoted to primary. For more information, see [Switch workloads over between primary and secondary ApsaraDB RDS instances](~~96054~~).
      * When you call this operation, you must make sure that the instance runs RDS High-availability Edition, RDS Enterprise Edition, and RDS Cluster Edition. RDS Cluster Edition is supported for ApsaraDB RDS for MySQL and ApsaraDB RDS for SQL Server.
      *
     */
    CompletableFuture<DescribeHASwitchConfigResponse> describeHASwitchConfig(DescribeHASwitchConfigRequest request);

    CompletableFuture<DescribeHistoryTasksResponse> describeHistoryTasks(DescribeHistoryTasksRequest request);

    CompletableFuture<DescribeHostWebShellResponse> describeHostWebShell(DescribeHostWebShellRequest request);

    CompletableFuture<DescribeInstanceAutoRenewalAttributeResponse> describeInstanceAutoRenewalAttribute(DescribeInstanceAutoRenewalAttributeRequest request);

    /**
      * Before you call this operation, make sure that the instance runs one of the following database engines:
      * *   MySQL. For more information, see [Back up an ApsaraDB RDS for MySQL instance across regions](~~120824~~).
      * *   SQL Server. For more information, see [Back up an ApsaraDB RDS for SQL Server instance across regions](~~187923~~).
      * *   PostgreSQL. For more information, see [Enable cross-region backups for an ApsaraDB RDS for PostgreSQL instance](~~206671~~).
      *
     */
    CompletableFuture<DescribeInstanceCrossBackupPolicyResponse> describeInstanceCrossBackupPolicy(DescribeInstanceCrossBackupPolicyRequest request);

    CompletableFuture<DescribeInstanceKeywordsResponse> describeInstanceKeywords(DescribeInstanceKeywordsRequest request);

    CompletableFuture<DescribeLocalAvailableRecoveryTimeResponse> describeLocalAvailableRecoveryTime(DescribeLocalAvailableRecoveryTimeRequest request);

    CompletableFuture<DescribeLogBackupFilesResponse> describeLogBackupFiles(DescribeLogBackupFilesRequest request);

    /**
      * Before you call the [RestoreTable](~~131510~~) operation to restore individual databases or tables of an ApsaraDB RDS for MySQL instance, you can call this operation to query the information about the databases and tables that can be restored. For more information, see [Restore individual databases and tables of an ApsaraDB RDS for MySQL instance](~~103175~~).
      * > This operation is supported only when the instance runs MySQL 8.0, MySQL 5.7, or MySQL 5.6 on RDS High-availability Edition with local disks.
      *
     */
    CompletableFuture<DescribeMetaListResponse> describeMetaList(DescribeMetaListRequest request);

    CompletableFuture<DescribeMigrateTaskByIdResponse> describeMigrateTaskById(DescribeMigrateTaskByIdRequest request);

    /**
      * This operation allows you to query the migration tasks that are created for the instance over the last week.
      * > 
      * *   This operation is supported only for migration tasks that are created to migrate full backup files.
      * *   This operation is not supported for instances that run SQL Server 2017 on RDS Cluster Edition.
      *
     */
    CompletableFuture<DescribeMigrateTasksResponse> describeMigrateTasks(DescribeMigrateTasksRequest request);

    CompletableFuture<DescribeModifyPGHbaConfigLogResponse> describeModifyPGHbaConfigLog(DescribeModifyPGHbaConfigLogRequest request);

    CompletableFuture<DescribeModifyParameterLogResponse> describeModifyParameterLog(DescribeModifyParameterLogRequest request);

    /**
      * >  This operation is not supported for instances that run SQL Server 2017 EE or SQL Server 2019 EE.
      *
     */
    CompletableFuture<DescribeOssDownloadsResponse> describeOssDownloads(DescribeOssDownloadsRequest request);

    CompletableFuture<DescribePGHbaConfigResponse> describePGHbaConfig(DescribePGHbaConfigRequest request);

    /**
      * You can configure a number of parameters at a time by using a parameter template and then apply the parameter template to instances. For more information, see [Use a parameter template to configure the parameters of ApsaraDB RDS for MySQL instances](~~130565~~) or [Use a parameter template to configure the parameters of ApsaraDB RDS for PostgreSQL instances](~~457176~~).
      * >  You can apply parameter templates only to ApsaraDB RDS for MySQL instances and ApsaraDB RDS for PostgreSQL instances.
      *
     */
    CompletableFuture<DescribeParameterGroupResponse> describeParameterGroup(DescribeParameterGroupRequest request);

    /**
      * You can configure a number of parameters at a time by using a parameter template and then apply the parameter template to instances. For more information, see [Use a parameter template to configure the parameters of ApsaraDB RDS for MySQL instances](~~130565~~) or [Use a parameter template to configure the parameters of ApsaraDB RDS for PostgreSQL instances](~~457176~~).
      * >  You can apply parameter templates only to ApsaraDB RDS for MySQL instances and ApsaraDB RDS for PostgreSQL instances.
      *
     */
    CompletableFuture<DescribeParameterGroupsResponse> describeParameterGroups(DescribeParameterGroupsRequest request);

    /**
      * Before you call this operation, make sure that the instance runs one of the following database engines:
      * *   MySQL 5.5, 5.6, 5.7, and 8.0
      * *   SQL Server 2008 R2
      * *   PostgreSQL 9.4, 10, 11, and 12
      * *   MariaDB 10.3
      *
     */
    CompletableFuture<DescribeParameterTemplatesResponse> describeParameterTemplates(DescribeParameterTemplatesRequest request);

    /**
      * Before you call this operation, make sure that the instance runs one of the following database engines:
      * *   MySQL 5.5, MySQL 5.6, MySQL 5.7, or MySQL 8.0
      * *   SQL Server 2008 R2
      * *   PostgreSQL 10, PostgreSQL 11, PostgreSQL 12, PostgreSQL 13, PostgreSQL 14, or PostgreSQL 15
      * *   MariaDB 10.3
      *
     */
    CompletableFuture<DescribeParametersResponse> describeParameters(DescribeParametersRequest request);

    CompletableFuture<DescribePriceResponse> describePrice(DescribePriceRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribeRdsResourceSettingsResponse> describeRdsResourceSettings(DescribeRdsResourceSettingsRequest request);

    /**
      * Before you call this operation, make sure that the following requirements are met:
      * *   The primary instance must run the MySQL or PostgreSQL database engine.
      * *   The primary instance must be attached with a read-only instance.
      *
     */
    CompletableFuture<DescribeReadDBInstanceDelayResponse> describeReadDBInstanceDelay(DescribeReadDBInstanceDelayRequest request);

    CompletableFuture<DescribeRegionInfosResponse> describeRegionInfos(DescribeRegionInfosRequest request);

    /**
      * Before you call the [CreateDBInstance](~~26228~~) operation to create an RDS instance, you can call the DescribeRegions operation to query the available regions and zones.
      * >  If a zone supports the multi-zone deployment method, the value of the ZoneId parameter for the zone contains an MAZ part. Examples: cn-hangzhou-MAZ6(b,f) and cn-hangzhou-MAZ5(b,e,f).
      *
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
      * This operation is supported only for subscription instances.
      *
     */
    CompletableFuture<DescribeRenewalPriceResponse> describeRenewalPrice(DescribeRenewalPriceRequest request);

    CompletableFuture<DescribeResourceUsageResponse> describeResourceUsage(DescribeResourceUsageRequest request);

    /**
      * This operation is applicable to the following database engine versions:
      * *   MySQL
      * *   SQL Server 2008 R2
      * *   PostgreSQL
      *
     */
    CompletableFuture<DescribeSQLCollectorPolicyResponse> describeSQLCollectorPolicy(DescribeSQLCollectorPolicyRequest request);

    /**
      * The SQL explorer feature must be enabled for the instance.
      * The instance must run MySQL. For more information, see [SQL Explorer](~~96123~~).
      *
     */
    CompletableFuture<DescribeSQLCollectorRetentionResponse> describeSQLCollectorRetention(DescribeSQLCollectorRetentionRequest request);

    /**
      * Before you call this operation, make sure that the instance runs one of the following database engines:
      * *   MySQL
      * *   SQL Server 2008 R2
      * *   PostgreSQL
      * > 
      * *   The DescribeSQLLogFiles operation cannot be called to query the log files that are generated by SQL Explorer Trial Edition for an ApsaraDB RDS for MySQL instance.
      * *   The DescribeSQLLogFiles operation cannot be called to query the log files that are generated by the SQL Explorer feature and manually exported from the ApsaraDB RDS console. The DescribeSQLLogFiles operation can be called to query the SQL Explorer log files that are generated by calling the [DescribeSQLLogRecords](~~610533~~) operation with the request parameter **Form** set to **File**.
      *
     */
    CompletableFuture<DescribeSQLLogFilesResponse> describeSQLLogFiles(DescribeSQLLogFilesRequest request);

    /**
      * Before you call this operation, make sure that the instance runs one of the following database engines:
      * *   MySQL
      * *   SQL Server
      * *   PostgreSQL
      * > 
      * *   You can call this operation up to 1,000 times per minute per account. The calls initiated by using both your Alibaba Cloud account and RAM users within your Alibaba Cloud account are counted.
      * *   This operation cannot be used to query the logs that are generated by SQL Explorer Trial Edition for an ApsaraDB RDS for MySQL instance.
      * *   When you call this operation and set the **Form** parameter to **File** to generate an audit file, a maximum of 1 million log entries can be recorded in the audit file, and you cannot filter log entries by keyword.
      *
     */
    CompletableFuture<DescribeSQLLogRecordsResponse> describeSQLLogRecords(DescribeSQLLogRecordsRequest request);

    CompletableFuture<DescribeSQLLogReportListResponse> describeSQLLogReportList(DescribeSQLLogReportListRequest request);

    CompletableFuture<DescribeSecretsResponse> describeSecrets(DescribeSecretsRequest request);

    /**
      * After an RDS instance is added to an ECS security group, all ECS instances in the security group can access the RDS instance. For more information, see [Configure a whitelist for an RDS instance](~~96118~~).
      *
     */
    CompletableFuture<DescribeSecurityGroupConfigurationResponse> describeSecurityGroupConfiguration(DescribeSecurityGroupConfigurationRequest request);

    /**
      * This operation is available only for ApsaraDB RDS for PostgreSQL instances.
      *
     */
    CompletableFuture<DescribeSlotsResponse> describeSlots(DescribeSlotsRequest request);

    /**
      * The unique ID of the SQL statement.
      *
     */
    CompletableFuture<DescribeSlowLogRecordsResponse> describeSlowLogRecords(DescribeSlowLogRecordsRequest request);

    /**
      * Before you call this operation, make sure that the instance runs one of the following database engine versions:
      * *   All MySQL versions except MySQL 5.7 that is used with RDS Basic edition
      * *   SQL Server 2008 R2
      * *   MariaDB 10.3
      * >  Slow query logs are not collected in real time and may show a latency of 6 hours to 8 hours.
      *
     */
    CompletableFuture<DescribeSlowLogsResponse> describeSlowLogs(DescribeSlowLogsRequest request);

    /**
      * This operation is supported only for instances that run SQL Server.
      *
     */
    CompletableFuture<DescribeSupportOnlineResizeDiskResponse> describeSupportOnlineResizeDisk(DescribeSupportOnlineResizeDiskRequest request);

    /**
      * Before you call this operation, make sure that the following requirements are met:
      * *   If an instance ID is specified, all tags that are added to this instance are queried, and other filter conditions are invalid.
      * *   If you specify only TagKey, the results that match the specified TagKey are returned. If you specify both TagKey and TagValue, the results that match both the specified TagKey and TagValue are returned.
      *
     */
    CompletableFuture<DescribeTagsResponse> describeTags(DescribeTagsRequest request);

    /**
      * This operation is phased out.
      *
     */
    CompletableFuture<DescribeTasksResponse> describeTasks(DescribeTasksRequest request);

    /**
      * Before you upgrade the major engine version of an ApsaraDB RDS for PostgreSQL instance, you must perform an upgrade check and make sure that the check result is **Success**. You can call this operation to query the upgrade check report.  
      * If the check result is **Fail**, you must handle the errors that occurred. For more information about how to handle common errors, see [Introduction to the check report for a major engine version upgrade to an ApsaraDB RDS for PostgreSQL instance](https://www.alibabacloud.com/help/en/apsaradb-for-rds/latest/introduction-to-the-check-report-of-a-major-engine-version-upgrade-for-an-apsaradb-rds-for-postgresql-instance).
      *
     */
    CompletableFuture<DescribeUpgradeMajorVersionPrecheckTaskResponse> describeUpgradeMajorVersionPrecheckTask(DescribeUpgradeMajorVersionPrecheckTaskRequest request);

    CompletableFuture<DescribeUpgradeMajorVersionTasksResponse> describeUpgradeMajorVersionTasks(DescribeUpgradeMajorVersionTasksRequest request);

    CompletableFuture<DescribeVSwitchesResponse> describeVSwitches(DescribeVSwitchesRequest request);

    /**
      * The DestroyDBInstance operation is phased out.
      *
     */
    CompletableFuture<DestroyDBInstanceResponse> destroyDBInstance(DestroyDBInstanceRequest request);

    /**
      * ## Precautions
      * This operation can be used to remove only unit nodes.
      *
     */
    CompletableFuture<DetachGadInstanceMemberResponse> detachGadInstanceMember(DetachGadInstanceMemberRequest request);

    CompletableFuture<GetDBInstanceTopologyResponse> getDBInstanceTopology(GetDBInstanceTopologyRequest request);

    /**
      * ApsaraDB RDS provides the dedicated proxy feature. You can configure SSL encryption for the dedicated proxy endpoint of an instance. This allows you to ensure the data security of the instance. For more information about the dedicated proxy feature, see [Dedicated proxy](~~138705~~).
      * Before you call this operation, make sure that the following requirements are met:
      * *   The dedicated proxy feature must be enabled for the instance.
      * *   The minor engine version that the dedicated proxies of the instance run must be 1.12.8 or later.
      * *   The minor engine version of the instance must be 20200831 or later, and the instance must run the following MySQL versions and RDS editions:
      *     *   MySQL 8.0 on RDS High-availability Edition with local SSDs
      *     *   MySQL 5.7 on RDS High-availability Edition with local SSDs
      *     *   MySQL 5.6 on RDS High-availability Edition with local SSDs
      *
     */
    CompletableFuture<GetDbProxyInstanceSslResponse> getDbProxyInstanceSsl(GetDbProxyInstanceSslRequest request);

    /**
      * Each account can be granted permissions on one or more databases. Before you call this operation, make sure that the instance is in the Running state.
      * > This operation is not supported for instances that run SQL Server 2017 on RDS Cluster Edition or run PostgreSQL with local disks.
      *
     */
    CompletableFuture<GrantAccountPrivilegeResponse> grantAccountPrivilege(GrantAccountPrivilegeRequest request);

    /**
      * When you seek help from Alibaba Cloud technical support to troubleshoot instance exceptions, you need to grant permissions to the service account of your instance. The service account is used by Alibaba Cloud technical support to perform operations on the databases of your instance.
      * This operation is available only when your instance runs one of the following database engines:
      * *   MySQL
      * *   SQL Server
      * *   PostgreSQL
      * For more information, see [Grant permissions to the service account of an ApsaraDB RDS for MySQL instance](~~96102~~), [Grant permissions to the service account of an ApsaraDB RDS for SQL Server instance](~~95693~~), and [Grant permissions to the service account of an ApsaraDB RDS for PostgreSQL instance](~~146887~~).
      *
     */
    CompletableFuture<GrantOperatorPermissionResponse> grantOperatorPermission(GrantOperatorPermissionRequest request);

    /**
      * We recommend that you use Data Transmission Service (DTS). DTS provides data migration, subscription, and synchronization features that allow you to establish stable, secure transmission links. For more information, see [DTS API overview](~~49456~~).
      * During the migration, the source instance is in the **Migrating** state, and the destination instance is in the **Importing** state.
      * Before you call this operation, make sure that the following requirements are met:
      * *   The source and destination instances must run SQL Server and belong to the dedicated or dedicated host instance family. For more information about the supported instance types, see [Primary instance types](~~26312~~).
      * *   The source and destination instances must be created by using the same user credentials.
      * *   The instance is in the Running state.
      * *   The source and destination databases must be in the Running state.
      * *   The remaining storage of the destination instance must be greater than the storage capacity of the source instance.
      * > 
      * *   This operation is not supported for instances that run SQL Server 2017 on RDS Cluster Edition.
      * *   You can migrate the data of multiple databases at a time.
      *
     */
    CompletableFuture<ImportDatabaseBetweenInstancesResponse> importDatabaseBetweenInstances(ImportDatabaseBetweenInstancesRequest request);

    /**
      * > A full backup file contains the data of a self-managed MySQL database. You can restore the data of a self-managed MySQL database from a full backup file to an ApsaraDB RDS for MySQL instance.
      * Before you call this operation, make sure that the following requirements are met:
      * *   The self-managed MySQL database runs MySQL 5.7 and is backed up by using XtraBackup. The name of the backup file ends with `_qp.xb`. For more information, see [Migrate the data of a self-managed MySQL 5.7 instance to the cloud](~~251779~~).
      * *   The full backup file of the self-managed MySQL database is uploaded to an Object Storage Service (OSS) bucket in the region of the ApsaraDB RDS for MySQL instance. For more information, see [Migrate the data of a self-managed MySQL 5.7 instance to the cloud](~~251779~~).
      * > This operation is supported only for MySQL 5.7.
      *
     */
    CompletableFuture<ImportUserBackupFileResponse> importUserBackupFile(ImportUserBackupFileRequest request);

    CompletableFuture<ListClassesResponse> listClasses(ListClassesRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
      * > 
      * *   A full backup file contains the data of a self-managed MySQL database. You can restore the data of a self-managed MySQL database from a full backup file to an ApsaraDB RDS for MySQL instance. For more information, see [Migrate the data of a self-managed MySQL 5.7 instance to the cloud](~~251779~~).
      * *   Before you call the [CreateDBInstance](~~26228~~) operation to create an ApsaraDB RDS for MySQL instance into which you want to import full backup files, you can call this operation to query the IDs of full backup files.
      * *   You can call the [ImportUserBackupFile](~~260266~~) operation to import a full backup file into an ApsaraDB RDS for MySQL instance.
      *
     */
    CompletableFuture<ListUserBackupFilesResponse> listUserBackupFiles(ListUserBackupFilesRequest request);

    /**
      * You cannot use a locked account to log on to the corresponding instance. You must first unlock the account. For more information, see [Lock and delete an account](~~147649~~).
      *
     */
    CompletableFuture<LockAccountResponse> lockAccount(LockAccountRequest request);

    CompletableFuture<MigrateConnectionToOtherZoneResponse> migrateConnectionToOtherZone(MigrateConnectionToOtherZoneRequest request);

    /**
      * Dedicated clusters allow you to manage a number of instances at a time. You can create multiple dedicated clusters in a single region. Each dedicated cluster consists of multiple hosts. You can create multiple instances on each host. For more information, see [What is ApsaraDB MyBase?](~~141455~~)
      *
     */
    CompletableFuture<MigrateDBInstanceResponse> migrateDBInstance(MigrateDBInstanceRequest request);

    /**
      * *   In standard whitelist mode, IP addresses in the whitelist apply to both the classic network and VPCs. To minimize security risks, we recommend that you use the enhanced whitelist mode.
      * *   In enhanced whitelist mode, IP addresses in the whitelist are divided into VPC IP addresses and IP addresses of the classic network and Internet.
      * > 
      * *   You cannot change the whitelist mode from the enhanced whitelist mode to the standard whitelist mode.
      * *   This operation is not supported for instances that run SQL Server and MariaDB.
      *
     */
    CompletableFuture<MigrateSecurityIPModeResponse> migrateSecurityIPMode(MigrateSecurityIPModeRequest request);

    /**
      * The prerequisites for this operation vary based on the database engine of the instance. For more information, see the following topics:
      * *   [RDS MySQL](~~96053~~)
      * *   [RDS PostgreSQL](~~96746~~)
      * *   [RDS SQL Server](~~95658~~)
      * > This operation allows you to migrate an instance across zones in the same region. This operation does not allow you to migrate an instance across zones in different regions. For example, you cannot migrate an instance from a zone in the China (Hangzhou) region to a zone in the China (Qingdao) region.
      *
     */
    CompletableFuture<MigrateToOtherZoneResponse> migrateToOtherZone(MigrateToOtherZoneRequest request);

    /**
      * This operation is available only for ApsaraDB RDS for SQL Server instances.
      *
     */
    CompletableFuture<ModifyADInfoResponse> modifyADInfo(ModifyADInfoRequest request);

    /**
      * > This operation is not supported for instances that run SQL Server 2017 on RDS Cluster Edition or run PostgreSQL.
      *
     */
    CompletableFuture<ModifyAccountDescriptionResponse> modifyAccountDescription(ModifyAccountDescriptionRequest request);

    /**
      * The event history feature enables you to view historical events that occurred in a region over a specific time range. These events include instance creation and parameter reconfiguration. For more information, see [Event history](~~129759~~).
      *
     */
    CompletableFuture<ModifyActionEventPolicyResponse> modifyActionEventPolicy(ModifyActionEventPolicyRequest request);

    /**
      * O\\&M tasks such as instance migration and version upgrades are notified by text message, phone call, email, internal message, or in the ApsaraDB RDS console. You can call this operation to change the scheduled switching time. You can also view the task and change the switching time on the Task Center page.
      *
     */
    CompletableFuture<ModifyActiveOperationTasksResponse> modifyActiveOperationTasks(ModifyActiveOperationTasksRequest request);

    /**
      * Before you call this operation, make sure that the following requirements are met:
      * *   The instance is not a read-only instance.
      * *   The instance is in the Running state.
      *
     */
    CompletableFuture<ModifyBackupPolicyResponse> modifyBackupPolicy(ModifyBackupPolicyRequest request);

    /**
      * > This operation is phased out.
      *
     */
    CompletableFuture<ModifyCollationTimeZoneResponse> modifyCollationTimeZone(ModifyCollationTimeZoneRequest request);

    /**
      * > This operation is not applicable to instances that run PostgreSQL.
      *
     */
    CompletableFuture<ModifyDBDescriptionResponse> modifyDBDescription(ModifyDBDescriptionRequest request);

    /**
      * This operation is supported only for instances that run MySQL.
      *
     */
    CompletableFuture<ModifyDBInstanceAutoUpgradeMinorVersionResponse> modifyDBInstanceAutoUpgradeMinorVersion(ModifyDBInstanceAutoUpgradeMinorVersionRequest request);

    CompletableFuture<ModifyDBInstanceConfigResponse> modifyDBInstanceConfig(ModifyDBInstanceConfigRequest request);

    /**
      * > The API has been taken offline
      *
     */
    CompletableFuture<ModifyDBInstanceConnectionModeResponse> modifyDBInstanceConnectionMode(ModifyDBInstanceConnectionModeRequest request);

    /**
      * ApsaraDB RDS provides the internal and public endpoints. ApsaraDB RDS also allows hybrid access by using both a virtual private cloud (VPC) endpoint and a classic network endpoint.
      * > 
      * *   You can change only the prefix of an endpoint.
      * *   The read/write splitting endpoint cannot be changed.
      *
     */
    CompletableFuture<ModifyDBInstanceConnectionStringResponse> modifyDBInstanceConnectionString(ModifyDBInstanceConnectionStringRequest request);

    CompletableFuture<ModifyDBInstanceDelayedReplicationTimeResponse> modifyDBInstanceDelayedReplicationTime(ModifyDBInstanceDelayedReplicationTimeRequest request);

    /**
      * For more information, see [Enable or disable the release protection feature for an ApsaraDB RDS for MySQL instance](~~414512~~).
      *
     */
    CompletableFuture<ModifyDBInstanceDeletionProtectionResponse> modifyDBInstanceDeletionProtection(ModifyDBInstanceDeletionProtectionRequest request);

    CompletableFuture<ModifyDBInstanceDescriptionResponse> modifyDBInstanceDescription(ModifyDBInstanceDescriptionRequest request);

    /**
      * ## Background information
      * *   This operation is suitable only for ApsaraDB RDS for MySQL instances that run RDS Cluster Edition.
      * *   When you modify information about the endpoint of an instance, you can modify the settings only of common parameters of the endpoint, such as the weight and description. This operation is called to manage an endpoint.
      *
     */
    CompletableFuture<ModifyDBInstanceEndpointResponse> modifyDBInstanceEndpoint(ModifyDBInstanceEndpointRequest request);

    /**
      * ## Background information
      * *   This operation is suitable only for ApsaraDB RDS for MySQL instances that run RDS Cluster Edition.
      * *   You can modify the following information about the endpoint of an instance: the public and internal endpoints, the public and internal ports, and the virtual private cloud (VPC), vSwitch, and IP address of the internal endpoint.
      * *   The VPC and vSwitch must be modified at the same time. If you specify the VPC, vSwitch, and IP address of the internal endpoint, you do not need to specify the endpoint and port. If you specify the endpoint and port of the internal endpoint, you do not need to specify the VPC, vSwitch, and IP address.
      *
     */
    CompletableFuture<ModifyDBInstanceEndpointAddressResponse> modifyDBInstanceEndpointAddress(ModifyDBInstanceEndpointAddressRequest request);

    CompletableFuture<ModifyDBInstanceHAConfigResponse> modifyDBInstanceHAConfig(ModifyDBInstanceHAConfigRequest request);

    /**
      * You can set the maintenance time to a period of time during off-peak hours. Alibaba Cloud performs routine maintenance within the maintenance time to minimize impacts on your business.
      *
     */
    CompletableFuture<ModifyDBInstanceMaintainTimeResponse> modifyDBInstanceMaintainTime(ModifyDBInstanceMaintainTimeRequest request);

    /**
      * ## Prerequisites
      * Before you call this operation, make sure that the instance runs PostgreSQL.
      * For more information, see [View the Enhanced Monitoring metrics of an ApsaraDB RDS for PostgreSQL instance](~~299200~~).
      *
     */
    CompletableFuture<ModifyDBInstanceMetricsResponse> modifyDBInstanceMetrics(ModifyDBInstanceMetricsRequest request);

    /**
      * Before you call this operation, make sure that you understand the billing methods and pricing of ApsaraDB RDS. For more information, see [Billable items, billing methods, and pricing](~~45020~~).
      * Alibaba Cloud provides different monitoring frequencies for different instances. For more information, see [Set monitoring frequencies](~~26200~~).
      * > * If your want to set the monitoring frequency to every few seconds, you are charged additional fees. For more information, see [Billable items, billing methods, and pricing](~~45020~~).
      * > * This operation is not supported for ApsaraDB RDS for PostgreSQL instances. The monitoring frequency of an ApsaraDB RDS for PostgreSQL instance varies based on the query time range. For more information, see [Query performance metrics](~~26280~~).
      *
     */
    CompletableFuture<ModifyDBInstanceMonitorResponse> modifyDBInstanceMonitor(ModifyDBInstanceMonitorRequest request);

    /**
      * When an ApsaraDB for RDS instance is in the hybrid access mode, which uses both a VPC endpoint and a classic network endpoint, this operation is used to extend the expiration time of the classic network endpoint.
      *
     */
    CompletableFuture<ModifyDBInstanceNetworkExpireTimeResponse> modifyDBInstanceNetworkExpireTime(ModifyDBInstanceNetworkExpireTimeRequest request);

    /**
      * ## Prerequisites
      * The network type of the instance is classic network.
      *
     */
    CompletableFuture<ModifyDBInstanceNetworkTypeResponse> modifyDBInstanceNetworkType(ModifyDBInstanceNetworkTypeRequest request);

    /**
      * This operation is used to change only the billing method of an instance from pay-as-you-go to subscription.
      * The following requirements must be met:
      * *   The instance belongs to the current account.
      * *   The instance uses one of the most recent instance types. For more information, see [Instance types](~~26312~~).
      *     **
      *     **Note**You cannot change the billing method of an instance that uses a phased-out instance type from pay-as-you-go to subscription. If you want to change the billing method of an instance that uses a phased-out instance type from pay-as-you-go to subscription, you must change the instance type of the instance to one of the most recent instance types. Then, you can change the billing method of the instance from pay-as-you-go to subscription. To change the instance type of an instance, you can change the instance specifications of the instance. For more information, see [Change the specifications of an ApsaraDB RDS instance](~~96061~~).
      * *   The instance uses the pay-as-you-go billing method and is in the Running state.
      * *   Your Alibaba Cloud account has no unpaid orders for the instance for which you want to change the billing method.
      *
     */
    CompletableFuture<ModifyDBInstancePayTypeResponse> modifyDBInstancePayType(ModifyDBInstancePayTypeRequest request);

    /**
      * > This operation is phased out.
      *
     */
    CompletableFuture<ModifyDBInstanceProxyConfigurationResponse> modifyDBInstanceProxyConfiguration(ModifyDBInstanceProxyConfigurationRequest request);

    /**
      * This operation is used to configure SSL encryption for an instance. For more information, see [](~~32474~~).
      * > 
      * *   Before you call this operation, make sure that your instance is one of the following instances:
      *     *   ApsaraDB RDS for MySQL instances that do not run RDS Basic Edition
      *     *   ApsaraDB RDS for SQL Server instances
      *     *   ApsaraDB RDS for PostgreSQL instances that use cloud disks
      * *   SSL encryption is not supported for the connections to the read/write splitting endpoint of an instance.
      *
     */
    CompletableFuture<ModifyDBInstanceSSLResponse> modifyDBInstanceSSL(ModifyDBInstanceSSLRequest request);

    /**
      * Before you call this operation, make sure that the following requirements are met:
      * *   The instance is in the Running state.
      * *   The instance has no ongoing backup tasks.
      * *   At least one of DBInstanceClass and DBInstanceStorage is specified in the request.
      * *   If you want to decrease the storage capacity, the new storage capacity that you specify must be greater than or equal to 1.1 times the used storage.
      * *   The instance is a primary instance or read-only instance.
      * > If you want to upgrade the RDS edition of the instance, you must select an instance type that supports the new RDS edition. For example, if you want to upgrade the RDS edition of the instance from RDS Basic Edition to RDS High-availability Edition, you must select an instance type that supports RDS High-availability Edition.
      *
     */
    CompletableFuture<ModifyDBInstanceSpecResponse> modifyDBInstanceSpec(ModifyDBInstanceSpecRequest request);

    /**
      * TDE can perform real-time I/O encryption and decryption on data files. TDE encrypts data before the data is written to a disk, and decrypts data before the data is read from a disk and written to the memory. For more information, see [Configure TDE for an ApsaraDB RDS for MySQL instance](~~96121~~).
      * Before you call this operation, make sure that the following requirements are met:
      * *   Key Management Service (KMS) is activated. If KMS is not activated, you can activate KMS when you enable TDE.
      * *   The instance must run one of the following database engine versions and RDS editions:
      *     *   MySQL 8.0 (with a minor engine version of 20191015 or later) on RDS High-availability Edition with local disks
      *     *   MySQL 5.7 (with a minor engine version of 20191015 or later) on RDS High-availability Edition with local disks
      *     *   MySQL 5.6
      *     *   SQL Server 2019 SE or an Enterprise Edition of SQL Server
      *     *   PostgreSQL 10, PostgreSQL 11, PostgreSQL 12, PostgreSQL 13, PostgreSQL 14, PostgreSQL 15 with cloud disks and a minor engine version of 20221030 or later
      *
     */
    CompletableFuture<ModifyDBInstanceTDEResponse> modifyDBInstanceTDE(ModifyDBInstanceTDERequest request);

    /**
      * *   The dedicated proxy feature of ApsaraDB RDS for MySQL provides capabilities such as read/write splitting and short-lived connection optimization. For more information, see [What are database proxies?](~~138705~~)
      * *   The database proxy feature of ApsaraDB RDS for PostgreSQL supports read/write splitting. For more information, see [What are database proxies?](~~412194~~)
      * Before you call this operation, make sure that the following requirements are met:
      * If the instance runs MySQL, the instance must run one of the following MySQL versions and RDS editions:
      * *   MySQL 8.0 with a minor engine version of 20191204 or later on RDS Enterprise Edition
      * *   MySQL 8.0 with a minor engine version of 20190915 or later on RDS High-availability Edition
      * *   MySQL 5.7 with a minor engine version of 20191128 or later on RDS Enterprise Edition
      * *   MySQL 5.7 with a minor engine version of 20190925 or later on RDS High-availability Edition
      * *   MySQL 5.6 with a minor engine version of 20200229 or later on RDS High-availability Edition
      * If the instance runs PostgreSQL, the instance must meet the following requirements:
      * *   The instance runs PostgreSQL 10, PostgreSQL 11, PostgreSQL 12, PostgreSQL 13, PostgreSQL 14, or PostgreSQL 15.
      * *   The instance uses cloud disks.
      * *   The instance runs RDS High-availability Edition.
      * *   The instance is a primary instance.
      *
     */
    CompletableFuture<ModifyDBProxyResponse> modifyDBProxy(ModifyDBProxyRequest request);

    /**
      * Before you call the ModifyDBProxyEndpoint operation, make sure that the [ModifyDBProxy](~~141054~~) operation is called to enable the database proxy feature for the instance.
      * *   The dedicated proxy feature of ApsaraDB RDS for MySQL provides capabilities such as read/write splitting and short-lived connection optimization. For more information, see [What are database proxies?](~~138705~~)
      * *   The database proxy feature of ApsaraDB RDS for PostgreSQL supports read/write splitting. For more information, see [What are database proxies?](~~412194~~)
      *
     */
    CompletableFuture<ModifyDBProxyEndpointResponse> modifyDBProxyEndpoint(ModifyDBProxyEndpointRequest request);

    /**
      * After you enable the database proxy feature, a default proxy endpoint is generated. The proxy terminal feature is bound to the default proxy endpoint. You can create, modify, or delete a proxy endpoint.
      *
     */
    CompletableFuture<ModifyDBProxyEndpointAddressResponse> modifyDBProxyEndpointAddress(ModifyDBProxyEndpointAddressRequest request);

    /**
      * Before you call the ModifyDBProxyInstance operation, make sure that the [ModifyDBProxy](~~141054~~) operation is called to enable the database proxy feature for the instance.
      * *   The dedicated proxy feature of ApsaraDB RDS for MySQL provides capabilities such as read/write splitting and short-lived connection optimization. For more information, see [What are database proxies?](~~138705~~)
      * *   The database proxy feature of ApsaraDB RDS for PostgreSQL supports read/write splitting. For more information, see [What are database proxies?](~~412194~~)
      *
     */
    CompletableFuture<ModifyDBProxyInstanceResponse> modifyDBProxyInstance(ModifyDBProxyInstanceRequest request);

    /**
      * Distributed transaction whitelists allow for distributed transactions between an Elastic Compute Service (ECS) instance and an RDS instance. For more information, see [Configure a distributed transaction whitelist](~~124321~~).
      * This operation is applicable to instances that run one of the following SQL Server versions in the RDS High-Availability Edition: 2012 SE, 2012 EE, 2014 SE, 2016 SE, 2016 EE, and 2017 SE.
      *
     */
    CompletableFuture<ModifyDTCSecurityIpHostsForSQLServerResponse> modifyDTCSecurityIpHostsForSQLServer(ModifyDTCSecurityIpHostsForSQLServerRequest request);

    /**
      * This operation is supported for ApsaraDB RDS for MySQL instances that run RDS High-availability Edition and use standard SSDs or enhanced SSDs (ESSDs) and ApsaraDB RDS for PostgreSQL instances that use standard SSDs or ESSDs. If the available storage reaches the specified threshold, ApsaraDB RDS increases the storage capacity of the instance to meet your storage requirements. In most cases, no transient connections occur during the expansion process. For more information, see [Configure automatic storage expansion for an ApsaraDB RDS for MySQL instance](~~173826~~) and [Configure automatic storage expansion for an ApsaraDB RDS for PostgreSQL instance](~~432496~~).
      * >  If an automatic storage expansion is triggered, ApsaraDB RDS increases the storage capacity based on the larger value between 15% of the purchased storage capacity and 5 GB.
      *
     */
    CompletableFuture<ModifyDasInstanceConfigResponse> modifyDasInstanceConfig(ModifyDasInstanceConfigRequest request);

    /**
      * The system provides the dedicated proxy feature. You can configure SSL encryption for the dedicated proxy endpoint of an instance. This allows you to ensure the data security of the instance. For more information about the dedicated proxy feature, see [Dedicated proxy](~~138705~~).
      * Before you call this operation, make sure that the following requirements are met:
      * *   The dedicated proxy feature is enabled for the instance.
      * *   The minor engine version that the dedicated proxies of the instance run is 1.12.8 or later.
      * *   Your RDS instance runs one of the following MySQL versions:
      *     *   MySQL 8.0 on RDS High-availability Edition with local disks. The minor engine version is 20200831 or later.
      *     *   MySQL 5.7 on RDS High-availability Edition with local disks. The minor engine version is 20200831 or later.
      *     *   MySQL 5.6 on RDS High-availability Edition with local disks. The minor engine version is 20200831 or later.
      * > Calling this operation causes your instance to restart. Proceed with caution.
      *
     */
    CompletableFuture<ModifyDbProxyInstanceSslResponse> modifyDbProxyInstanceSsl(ModifyDbProxyInstanceSslRequest request);

    /**
      * By default, Alibaba Cloud uses persistent connections to check the availability of an instance. For more information, see [What is availability detection?](~~207467~~)
      *
     */
    CompletableFuture<ModifyHADiagnoseConfigResponse> modifyHADiagnoseConfig(ModifyHADiagnoseConfigRequest request);

    /**
      * After a switchover is complete, the original primary RDS instance runs as the secondary RDS instance. For more information, see [Switch workloads over between primary and secondary ApsaraDB RDS for MySQL instances](~~96054~~).
      * Before you call this operation, make sure that the instance does not run the RDS Basic Edition.
      *
     */
    CompletableFuture<ModifyHASwitchConfigResponse> modifyHASwitchConfig(ModifyHASwitchConfigRequest request);

    /**
      * If you enable auto-renewal for your instance, you do not need to manually renew your subscription or be concerned about business interruptions caused by subscription expiration. For more information, see [Configure auto-renewal](~~96049~~).
      *
     */
    CompletableFuture<ModifyInstanceAutoRenewalAttributeResponse> modifyInstanceAutoRenewalAttribute(ModifyInstanceAutoRenewalAttributeRequest request);

    /**
      * Before you call this operation, make sure that the instance runs one of the following database engines:
      * *   MySQL. For more information, see [Back up an ApsaraDB RDS for MySQL instance across regions](~~120824~~).
      * *   SQL Server. For more information, see [Back up an ApsaraDB RDS for SQL Server instance across regions](~~187923~~).
      * *   PostgreSQL. For more information, see [Enable cross-region backups for an ApsaraDB RDS for PostgreSQL instance](~~206671~~).
      *
     */
    CompletableFuture<ModifyInstanceCrossBackupPolicyResponse> modifyInstanceCrossBackupPolicy(ModifyInstanceCrossBackupPolicyRequest request);

    /**
      * ApsaraDB RDS for PostgreSQL allows you to modify the pg_hba.conf file based on your business requirements. For more information, see [Introduction to the pg_hba.conf file](https://www.postgresql.org/docs/11/auth-pg-hba-conf.html).
      * You can modify the information of the Active Directory (AD) domain controller in the pg_hba.conf file of an instance. Then, you can connect the instance to a self-managed AD domain. For more information, see [Connect an ApsaraDB RDS for PostgreSQL instance to a self-managed AD domain](~~349288~~).
      *
     */
    CompletableFuture<ModifyPGHbaConfigResponse> modifyPGHbaConfig(ModifyPGHbaConfigRequest request);

    /**
      * You can modify the parameters directly or by using a parameter template. After you submit the parameter modification request, ApsaraDB RDS starts a task to apply the new parameter values to the instance. If a new parameter value takes effect only after the instance restarts, ApsaraDB RDS restarts the instance. For information about configurable parameters, see [Configure the parameters of an ApsaraDB RDS for MySQL instance](~~96063~~).
      * > Before the system runs a parameter modification task, the system checks whether the parameters exist, whether they are configurable, and whether the new parameter values are valid.
      *
     */
    CompletableFuture<ModifyParameterResponse> modifyParameter(ModifyParameterRequest request);

    /**
      * You can configure a number of parameters at a time by using a parameter template and then apply the parameter template to an instance. For more information, see [Use a parameter template to configure the parameters of ApsaraDB RDS for MySQL instances](~~130565~~) or [Use a parameter template to configure the parameters of ApsaraDB RDS for PostgreSQL instances](~~457176~~).
      * > This operation is supported only when your instance runs MySQL or PostgreSQL.
      *
     */
    CompletableFuture<ModifyParameterGroupResponse> modifyParameterGroup(ModifyParameterGroupRequest request);

    /**
      * Before you call this operation, make sure that the following requirements are met:
      * *   The shared proxy feature is enabled for your ApsaraDB RDS for MySQL instance.
      * *   The read/write splitting feature is enabled for your ApsaraDB RDS for MySQL instance.
      * *   The instance must run one of the following database engine versions and RDS editions:
      *     *   MySQL 5.7 on RDS High-availability Edition (with local disks)
      *     *   MySQL 5.6
      *     *   SQL Server on RDS Cluster Edition
      *
     */
    CompletableFuture<ModifyReadWriteSplittingConnectionResponse> modifyReadWriteSplittingConnection(ModifyReadWriteSplittingConnectionRequest request);

    /**
      * You can specify the latency at which your primary RDS instance replicates data to a read-only instance. For more information, see [Set a replication delay for an RDS MySQL read-only instance](~~96056~~).
      *
     */
    CompletableFuture<ModifyReadonlyInstanceDelayReplicationTimeResponse> modifyReadonlyInstanceDelayReplicationTime(ModifyReadonlyInstanceDelayReplicationTimeRequest request);

    /**
      * Resource Management enables you to build an organizational structure for resources based on your business needs. You can use a resource directory, folders, accounts, and resource groups to hierarchically organize and manage resources. For more information, see [What is Resource Management?](~~94475~~)
      *
     */
    CompletableFuture<ModifyResourceGroupResponse> modifyResourceGroup(ModifyResourceGroupRequest request);

    /**
      * Before you call this operation, make sure that the instance runs one of the following database engines:
      * *   MySQL
      * *   SQL Server
      * *   PostgreSQL
      * > If you call this operation by using the credentials of a RAM user, the RAM user must have the read and write permissions such as AliyunRDSFullAccess on the instance. If the RAM user does not have the read and write permissions on the instance, the system displays a message stating that you do not have the permissions to call this operation. For more information about how to grant permissions to a RAM user, see [Use RAM to manage ApsaraDB RDS permissions](~~58932~~).
      *
     */
    CompletableFuture<ModifySQLCollectorPolicyResponse> modifySQLCollectorPolicy(ModifySQLCollectorPolicyRequest request);

    /**
      * The SQL explorer must be enabled for the instance.
      * The instance must run MySQL. For more information, see [SQL Explorer](~~96123~~).
      * >  After you shorten the log backup retention period, log backpack files that are stored longer than the specified log backup retention period are immediately deleted.
      *
     */
    CompletableFuture<ModifySQLCollectorRetentionResponse> modifySQLCollectorRetention(ModifySQLCollectorRetentionRequest request);

    /**
      * After an RDS instance is added to an ECS security group, all ECS instances in the security group can access the RDS instance. For more information, see [Configure a whitelist for an RDS instance](~~96118~~).
      *
     */
    CompletableFuture<ModifySecurityGroupConfigurationResponse> modifySecurityGroupConfiguration(ModifySecurityGroupConfigurationRequest request);

    /**
      * An IP address whitelist contains the IP addresses and CIDR blocks that are granted access to the instance. For more information about how to configure an IP address whitelist, see [Configure an IP address whitelist for an ApsaraDB RDS instance](~~96118~~).
      * > Before you call this operation, make sure that the instance is in the Running state. If the instance is not in the Running state, the operation fails.
      *
     */
    CompletableFuture<ModifySecurityIpsResponse> modifySecurityIps(ModifySecurityIpsRequest request);

    /**
      * ApsaraDB RDS automatically uploads log backup files to Object Storage Service (OSS) buckets. If the remaining storage of an instance is insufficient, you can upload the log backup files of the instance to OSS buckets. After you upload the log backup files of an instance, ApsaraDB RDS deletes these files from the instance to release storage. This operation is called to upload log backup files from an instance to OSS buckets and then delete these files from the instance. If the instance runs SQL Server, transaction log backup files are compressed before they are uploaded. For more information about log backups, see [Back up an ApsaraDB RDS for MySQL instance](~~98818~~) or [Back up an ApsaraDB RDS for SQL Server instance](~~95717~~).
      * > 
      * *   This operation is available only for instances that run MySQL or SQL Server.
      * *   When you upload log backup files, the data restoration feature is not affected.
      * *   This operation is called to release storage. The backup storage usage is not reduced.
      * *   The OSS buckets to which log backup files are uploaded are provided by ApsaraDB RDS. You do not need to purchase these OSS buckets. In addition, you cannot access these OSS buckets.
      *
     */
    CompletableFuture<PurgeDBInstanceLogResponse> purgeDBInstanceLog(PurgeDBInstanceLogRequest request);

    /**
      * The notifications are highlighted at the top of the ApsaraDB RDS console. The notifications include renewal reminders and reminders of instance creation failures.
      * After you call this operation to query notifications, you can call the [ConfirmNotify](~~428005~~) operation to mark the notifications as confirmed, which means that you understand the content of the notifications.
      *
     */
    CompletableFuture<QueryNotifyResponse> queryNotify(QueryNotifyRequest request);

    /**
      * Dedicated clusters allow you to manage a number of instances at a time. You can create multiple dedicated clusters in a single region. Each dedicated cluster consists of multiple hosts. You can create multiple instances on each host. For more information, see [What is ApsaraDB MyBase?](~~141455~~)
      *
     */
    CompletableFuture<RebuildDBInstanceResponse> rebuildDBInstance(RebuildDBInstanceRequest request);

    /**
      * ## Prerequisites
      * A disaster recovery instance is created.
      *
     */
    CompletableFuture<ReceiveDBInstanceResponse> receiveDBInstance(ReceiveDBInstanceRequest request);

    /**
      * You can call this operation to restore databases to a new instance or an existing instance. If you want to restore databases to an existing instance, we recommend that you call the [Copy databases](~~88810~~) operation.
      * If you want to restore databases to a new instance, you must create an instance and then restore specific or all databases to the new instance.
      * *   If you specify the name of a database, only the specified database is restored to the new instance.
      * *   If you do not specify the name of a database, all databases are restored to the new instance.
      * > This operation is supported only for instances that run SQL Server 2012 or later.
      *
     */
    CompletableFuture<RecoveryDBInstanceResponse> recoveryDBInstance(RecoveryDBInstanceRequest request);

    CompletableFuture<ReleaseInstanceConnectionResponse> releaseInstanceConnection(ReleaseInstanceConnectionRequest request);

    /**
      * To ensure data security, you can release the public endpoint when you do not need to access the database from the Internet.
      *
     */
    CompletableFuture<ReleaseInstancePublicConnectionResponse> releaseInstancePublicConnection(ReleaseInstancePublicConnectionRequest request);

    /**
      * Before you call this operation, make sure that the following requirements are met:
      * *   If the instance runs MySQL, the instance uses a shared proxy.
      * *   The read/write splitting feature is enabled for the instance.
      * *   The instance runs one of the following database versions and RDS editions:
      *     *   MySQL 5.7 on RDS High-availability Edition with local SSDs
      *     *   MySQL 5.6
      *     *   SQL Server (cluster edition)
      *
     */
    CompletableFuture<ReleaseReadWriteSplittingConnectionResponse> releaseReadWriteSplittingConnection(ReleaseReadWriteSplittingConnectionRequest request);

    /**
      * This operation has the following limits:
      * *   A maximum of 10 tags can be unbound in a single request.
      * *   If a tag is unbound from all of the instances to which the tag has been bound, the tag is automatically deleted.
      * *   If you specify only a TagKey, all tags that match the TagKey condition are unbound.
      * *   You must specify at least a TagKey or a set of a TagKey and a TagValue.
      *
     */
    CompletableFuture<RemoveTagsFromResourceResponse> removeTagsFromResource(RemoveTagsFromResourceRequest request);

    /**
      * Before you call this operation, make sure that you understand the billing methods and pricing of ApsaraDB RDS. For more information, see [Billable items, billing methods, and pricing](~~45020~~).
      * Before you call this operation, make sure that the following requirements are met:
      * *   The instance is a subscription instance.
      * *   Your account supports credit card payments or balance payments.
      *     **
      *     **Note**By default, coupons available for your account are preferentially used for payment.
      *
     */
    CompletableFuture<RenewInstanceResponse> renewInstance(RenewInstanceRequest request);

    /**
      * **
      * **This operation is not supported for instances that run SQL Server 2008 R2 because they do not have privileged accounts.
      *
     */
    CompletableFuture<ResetAccountResponse> resetAccount(ResetAccountRequest request);

    /**
      * Before you call this operation, make sure that the instance is in the Running state.
      * > If the instance runs SQL Server 2017 on RDS Cluster Edition or runs PostgreSQL, you cannot call this operation to reset the passwords of accounts that are created by using SQL statements.
      *
     */
    CompletableFuture<ResetAccountPasswordResponse> resetAccountPassword(ResetAccountPasswordRequest request);

    /**
      * If a large number of transactions need to be submitted or rolled back, the restart process may be delayed for a minute.\\
      * Before you call this operation, make sure that the following requirements are met:
      * *   The instance is in the Running state.
      * *   The instance does not have ongoing backup tasks.
      *
     */
    CompletableFuture<RestartDBInstanceResponse> restartDBInstance(RestartDBInstanceRequest request);

    CompletableFuture<RestoreDdrTableResponse> restoreDdrTable(RestoreDdrTableRequest request);

    /**
      * ApsaraDB RDS for MySQL supports the restoration of individual databases and tables. If you delete databases or tables from an instance, you can restore the databases or tables by using a backup file. For more information, see [Restore individual databases and tables of an ApsaraDB RDS for MySQL instance](~~103175~~).
      * Before you call this operation, make sure that the following requirements are met:
      * *   The instance is in the Running state.
      * *   The instance does not have ongoing migration tasks.
      * *   If you want to restore data to a specific point in time, make sure that the log backup feature is enabled for the instance. For more information, see [Back up an ApsaraDB RDS for MySQL instance](~~98818~~).
      * *   The restoration of individual databases or tables is enabled, and new backups are created. For more information, see [Restore individual databases and tables of an ApsaraDB RDS for MySQL instance](~~103175~~).
      * *   The names that you want to use for the restored tables do not exist in the instance.
      * > This operation is supported only for instances that run MySQL.
      *
     */
    CompletableFuture<RestoreTableResponse> restoreTable(RestoreTableRequest request);

    /**
      * Before you call this operation, make sure that the following requirements are met:
      * *   The instance is in the Running state.
      * *   The database is in the Running state.
      * > 
      * *   The permissions that can be revoked include SELECT, INSERT, UPDATE, DELETE, CREATE, DROP, REFERENCES, INDEX, ALTER, CREATE TEMPORARY TABLES, LOCK TABLES, EXECUTE, CREATE VIEW, SHOW VIEW, CREATE ROUTINE, ALTER ROUTINE, EVENT, and TRIGGER.
      * *   This operation is not supported for instances that run SQL Server 2017 on RDS Cluster Edition or PostgreSQL.
      *
     */
    CompletableFuture<RevokeAccountPrivilegeResponse> revokeAccountPrivilege(RevokeAccountPrivilegeRequest request);

    /**
      * After Alibaba Cloud technical support resolves the issues on your instance, you can revoke permissions from the service account of your instance.
      * This operation is available only when your instance runs one of the following database engines:
      * *   MySQL
      * *   SQL Server
      * *   PostgreSQL
      *
     */
    CompletableFuture<RevokeOperatorPermissionResponse> revokeOperatorPermission(RevokeOperatorPermissionRequest request);

    CompletableFuture<StartDBInstanceResponse> startDBInstance(StartDBInstanceRequest request);

    /**
      * *   You cannot stop a serverless ApsaraDB RDS for MySQL instance because serverless instances support the automatic start and stop feature. For more information, see [Configure a serverless instance](~~421557~~).
      * *   For more information about how to stop an ApsaraDB RDS for MySQL instance, see [Suspend an instance](~~427093~~).
      * *   For more information about how to stop an ApsaraDB RDS for PostgreSQL instance, see [Suspend an instance](~~452314~~).
      * *   For more information about how to stop a ApsaraDB RDS for SQL Server instance, see [Suspend an instance](~~462504~~).
      * *   The following list describes the usage notes when you stop an instance that is created in a dedicated cluster:
      *     *   After you stop an instance, the computing resources of the instance are released. However, the data of the instance is retained. The retained data can be used to start the instance.
      *     *   When you stop an instance, all the read-only instances that are attached to the instance are stopped at the same time.
      *     *   After you stop an instance, the storage resources of the instance are still retained. You do not need to pay extra fees for the storage of the retained data.
      *
     */
    CompletableFuture<StopDBInstanceResponse> stopDBInstance(StopDBInstanceRequest request);

    /**
      * This operation switches workloads over between the primary and secondary instances that do not run RDS Basic Edition. After the switchover, the secondary instance serves as the primary instance.
      *
     */
    CompletableFuture<SwitchDBInstanceHAResponse> switchDBInstanceHA(SwitchDBInstanceHARequest request);

    /**
      * To save endpoint resources, you can call this operation to switch an instance between its internal and public endpoints. After the endpoint that is used to connect to the instance is changed, you must update the endpoint information in the code of your application and restart the application.
      * Before you call this operation, make sure that the following requirements are met:
      * *   The instance is connected by using its internal or public endpoint.
      * *   The instance is in the Running state.
      * *   The number of times that you have switched the instance between its internal and public endpoints within the last 24 hours does not reach 20.
      * *   The instance resides in the classic network.
      *
     */
    CompletableFuture<SwitchDBInstanceNetTypeResponse> switchDBInstanceNetType(SwitchDBInstanceNetTypeRequest request);

    /**
      * The instance must run one of the following database engines:
      * *   MySQL with local SSDs, standard SSDs, or enhanced ESSDs (ESSDs)
      * *   SQL Server with standard SSDs or ESSDs
      * *   MariaDB with standard SSDs or ESSDs
      * *   PostgreSQL with standard SSDs or ESSDs
      * For more information about the impact of VPC and vSwitch changes, see [Switch an ApsaraDB RDS for MySQL instance to a new VPC and a new vSwitch](~~137567~~).
      *
     */
    CompletableFuture<SwitchDBInstanceVpcResponse> switchDBInstanceVpc(SwitchDBInstanceVpcRequest request);

    CompletableFuture<SwitchGuardToMasterInstanceResponse> switchGuardToMasterInstance(SwitchGuardToMasterInstanceRequest request);

    /**
      * If you have a large number of instances, you can create multiple tags and add these tags to the instances. Then, you can filter these instances by tag.
      * *   A tag consists of a key and a value. Each key must be unique in a region for an Alibaba Cloud account. Different keys can be mapped to the same value.
      * *   If the tag that you specify does not exist, this tag is automatically created and added to the specified instance.
      * *   If the key of the specified tag is the same as that of an existing tag, the specified tag overwrites the existing tag.
      * *   You can add up to 20 tags to an instance.
      * *   You can add tags to up to 50 instances in each call.
      *
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<TerminateMigrateTaskResponse> terminateMigrateTask(TerminateMigrateTaskRequest request);

    /**
      * > 
      * *   If you change the billing method of an instance from subscription to pay-as-you-go, a refund may be provided. The refund amount is equal to the remaining subscription fee deducted by an amount of service fee. For more information, see [Switch an ApsaraDB RDS for MySQL instance from subscription to pay-as-you-go](~~161875~~).
      * *   If the balance of your Alibaba Cloud account is insufficient, you cannot change the billing method of an instance from pay-as-you-go to subscription.
      * *   This operation is not supported for instances whose specification change orders are not completed.
      * *   This operation is not supported for instances that are created in dedicated clusters.
      * ApsaraDB RDS supports the following two billing methods:
      * *   Subscription: A subscription instance is an instance for which you pay an upfront fee. For long-term use, the subscription billing method is more cost-effective than the pay-as-you-go billing method. You are offered lower prices for longer subscription durations.
      * *   Pay-as-you-go: A pay-as-you-go instance is an instance for which you are charged per hour based on your resource usage. The hourly fee is calculated based on the instance type that you specify in the purchase order and is deducted from the balance of your Alibaba Cloud account. We recommend that you select the pay-as-you-go billing method for short-term use. If you no longer need your pay-as-you-go instance, you can release the instance to reduce costs.
      * For more information about the billing methods, see [Pricing, billable items, and billing methods](~~45020~~).
      *
     */
    CompletableFuture<TransformDBInstancePayTypeResponse> transformDBInstancePayType(TransformDBInstancePayTypeRequest request);

    /**
      * You cannot use a locked account to log on to the corresponding instance. You must first unlock the account. For more information, see [Unlock and delete an account](~~147649~~).
      *
     */
    CompletableFuture<UnlockAccountResponse> unlockAccount(UnlockAccountRequest request);

    /**
      * > *   You can remove up to 20 tags at a time.
      * > *   If a tag is removed from an instance and is not added to other instances, the tag is automatically deleted.
      *
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
      * > A full backup file contains the data of a self-managed MySQL database. You can restore the data of a self-managed MySQL database from a full backup file to an ApsaraDB RDS for MySQL instance. For more information, see [Migrate the data of a self-managed MySQL 5.7 instance to the cloud](~~251779~~).
      *
     */
    CompletableFuture<UpdateUserBackupFileResponse> updateUserBackupFile(UpdateUserBackupFileRequest request);

    /**
      * > The fee that you must pay after the upgrade varies based on the instance types and storage types of the original instance and the new instance.
      * If the instance is a primary instance to which read-only instances or disaster recovery instances are attached, you must upgrade the major engine versions of the read-only instances or disaster recovery instances before you upgrade the major engine version of the primary instance.
      * Before you call this operation, make sure that the following requirements are met:
      * *   The instance is in the Running state.
      * *   The instance runs one of the following database versions:
      *     *   MySQL 5.7
      *     *   MySQL 5.6
      *     *   MySQL 5.5
      * You can call the [UpgradeDBInstanceMajorVersion](~~330972~~) operation to upgrade the major engine version of an ApsaraDB RDS for PostgreSQL instance.
      *
     */
    CompletableFuture<UpgradeDBInstanceEngineVersionResponse> upgradeDBInstanceEngineVersion(UpgradeDBInstanceEngineVersionRequest request);

    /**
      * An update to the minor engine version enhances performance, introduces new features, and fixes known bugs. For more information, see [Update the minor engine version of an ApsaraDB RDS for MySQL instance](~~96059~~), [Update the minor engine version of an ApsaraDB RDS for SQL Server instance](~~213582~~), and [Update the minor engine version of an ApsaraDB RDS for PostgreSQL instance](~~146895~~).
      * > This operation is supported for instances that run MySQL, SQL Server, or PostgreSQL.
      *
     */
    CompletableFuture<UpgradeDBInstanceKernelVersionResponse> upgradeDBInstanceKernelVersion(UpgradeDBInstanceKernelVersionRequest request);

    /**
      * During an upgrade, ApsaraDB RDS retains the original instance and creates an instance that runs the new major engine version. You are **charged** for the new instance based on the **pay-as-you-go** billing method after the instance is created. The new instance **does not inherit the discounts that are offered to the original instance**. Before you call this operation, make sure that you fully understand the billing methods and pricing of ApsaraDB RDS. You can decide whether to upgrade the major engine version based on your business requirements. For more information, see [Billable items, billing methods, and pricing](~~45020~~).
      * Before you upgrade the major engine version, you must call the [UpgradeDBInstanceMajorVersionPrecheck](~~330050~~) operation to perform an upgrade check and then call the [DescribeUpgradeMajorVersionPrecheckTask](~~330088~~) operation to query the upgrade check report. You can call the UpgradeDBInstanceMajorVersion operation only when the check result is **Success**.
      * Before you call this operation, make sure that the following requirements are met:
      * *   The original instance runs PostgreSQL 14, PostgreSQL 13, PostgreSQL 12, PostgreSQL 11, PostgreSQL 10, or PostgreSQL 9.4.
      * *   The instance runs RDS High-availability Edition or RDS Basic Edition.
      * *   The instance resides in a virtual private cloud (VPC). If the instance resides in the classic network, you must migrate the instance to a VPC before you call this operation. For more information about how to view or change the network type of an instance, see [Change the network type of an ApsaraDB RDS for PostgreSQL instance](~~96761~~).
      * *   The instance is not a read-only instance and is not created in a dedicated cluster.
      * An upgrade causes impacts such as a transient connection that lasts a few minutes. We recommend that you perform an upgrade during off-peak hours. Before you perform an upgrade, we recommend that you read the description in [Upgrade the major engine version of an ApsaraDB RDS for PostgreSQL instance](~~203309~~).
      *
     */
    CompletableFuture<UpgradeDBInstanceMajorVersionResponse> upgradeDBInstanceMajorVersion(UpgradeDBInstanceMajorVersionRequest request);

    /**
      * ApsaraDB RDS for PostgreSQL provides the major version upgrade feature. You can use this feature to upgrade the major engine version of an ApsaraDB RDS for PostgreSQL instance.
      * Before you perform an upgrade, you must perform an upgrade check and make sure that the check result is **Success**. You can call this operation to perform an upgrade check.
      * An upgrade brings impacts, such as a transient connection that lasts a few minutes. We recommend that you perform an upgrade during off-peak hours. Before you perform an upgrade, we recommend that you read [Upgrade the major engine version of an ApsaraDB RDS for PostgreSQL instance](~~203309~~).
      *
     */
    CompletableFuture<UpgradeDBInstanceMajorVersionPrecheckResponse> upgradeDBInstanceMajorVersionPrecheck(UpgradeDBInstanceMajorVersionPrecheckRequest request);

    /**
      * Before you call the ModifyDBProxyEndpoint operation, make sure that the [ModifyDBProxy](~~141054~~) operation is called to enable the database proxy feature for the instance.
      * *   The dedicated proxy feature of ApsaraDB RDS for MySQL provides capabilities such as read/write splitting and short-lived connection optimization. For more information, see [What are database proxies?](~~138705~~)
      * *   The database proxy feature of ApsaraDB RDS for PostgreSQL supports read/write splitting. For more information, see [What are database proxies?](~~412194~~)
      *
     */
    CompletableFuture<UpgradeDBProxyInstanceKernelVersionResponse> upgradeDBProxyInstanceKernelVersion(UpgradeDBProxyInstanceKernelVersionRequest request);

}
