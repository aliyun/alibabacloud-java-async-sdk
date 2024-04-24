// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.polardb20170801.models.*;
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

    CompletableFuture<CancelScheduleTasksResponse> cancelScheduleTasks(CancelScheduleTasksRequest request);

    CompletableFuture<CheckAccountNameResponse> checkAccountName(CheckAccountNameRequest request);

    CompletableFuture<CheckDBNameResponse> checkDBName(CheckDBNameRequest request);

    CompletableFuture<CheckKMSAuthorizedResponse> checkKMSAuthorized(CheckKMSAuthorizedRequest request);

    CompletableFuture<CheckServiceLinkedRoleResponse> checkServiceLinkedRole(CheckServiceLinkedRoleRequest request);

    CompletableFuture<CloseAITaskResponse> closeAITask(CloseAITaskRequest request);

    /**
      * *   You can call this operation to cancel the migration task before data migration.
      * *   You can call this operation to perform the migration task after data migration.
      * > Before you call this operation, ensure that a one-click upgrade task has been created for the cluster. You can call the [CreateDBCluster](~~98169~~) operation to create an upgrade task. Set the **CreationOption** parameter to **MigrationFromRDS**. For more information, see [Create a PolarDB for MySQL cluster by using the Migration from RDS method](~~121582~~).
      *
     */
    CompletableFuture<CloseDBClusterMigrationResponse> closeDBClusterMigration(CloseDBClusterMigrationRequest request);

    CompletableFuture<CreateAccountResponse> createAccount(CreateAccountRequest request);

    /**
      * > 
      * *   You can manually create up to three backups for each cluster.
      * *   The `Exceeding the daily backup times of this DB cluster` error message indicates that three manual backups already exist in your cluster. You must delete existing backups before you call this operation to manually create backups. For more information about how to delete backups, see [Delete backups](~~98101~~).
      * *   After you call this operation, a backup task is created in the backend. The task may be time-consuming if you want to back up large amounts of data.
      *
     */
    CompletableFuture<CreateBackupResponse> createBackup(CreateBackupRequest request);

    CompletableFuture<CreateColdStorageInstanceResponse> createColdStorageInstance(CreateColdStorageInstanceRequest request);

    CompletableFuture<CreateDBClusterResponse> createDBCluster(CreateDBClusterRequest request);

    CompletableFuture<CreateDBClusterEndpointResponse> createDBClusterEndpoint(CreateDBClusterEndpointRequest request);

    /**
      * > You can create a public endpoint for the primary endpoint, the default cluster endpoint, or a custom cluster endpoint.
      *
     */
    CompletableFuture<CreateDBEndpointAddressResponse> createDBEndpointAddress(CreateDBEndpointAddressRequest request);

    /**
      * A database link can be used to connect two PolarDB for PostgreSQL(Compatible with Oracle) clusters, or connect a PolarDB for PostgreSQL(Compatible with Oracle) cluster to a user-created PostgreSQL database that is hosted on an Elastic Compute Service (ECS) instance. You can use database links to query data across clusters.
      * > *   You can create up to 10 database links for a cluster.
      * > *   Each database link connects a source cluster and a destination cluster.
      * > *   The source cluster and the destination cluster or the destination ECS instance must be located in the same region.
      *
     */
    CompletableFuture<CreateDBLinkResponse> createDBLink(CreateDBLinkRequest request);

    CompletableFuture<CreateDBNodesResponse> createDBNodes(CreateDBNodesRequest request);

    /**
      * Before you call this operation, make sure that the following requirements are met:
      * *   The cluster is in the Running state.
      * *   The cluster is unlocked.
      *
     */
    CompletableFuture<CreateDatabaseResponse> createDatabase(CreateDatabaseRequest request);

    /**
      * >  A cluster belongs to only one GDN.
      *
     */
    CompletableFuture<CreateGlobalDatabaseNetworkResponse> createGlobalDatabaseNetwork(CreateGlobalDatabaseNetworkRequest request);

    CompletableFuture<CreateGlobalSecurityIPGroupResponse> createGlobalSecurityIPGroup(CreateGlobalSecurityIPGroupRequest request);

    /**
      * You can use parameter templates to manage multiple parameters at a time and apply existing parameters to a PolarDB cluster. For more information, see [Use a parameter template](~~207009~~).
      * > You can call this operation only on a PolarDB for MySQL cluster.
      *
     */
    CompletableFuture<CreateParameterGroupResponse> createParameterGroup(CreateParameterGroupRequest request);

    CompletableFuture<CreateServiceLinkedRoleResponse> createServiceLinkedRole(CreateServiceLinkedRoleRequest request);

    CompletableFuture<CreateStoragePlanResponse> createStoragePlan(CreateStoragePlanRequest request);

    /**
      * > Before you call this operation, make sure that the cluster is in the Running state. Otherwise, the operation fails.
      *
     */
    CompletableFuture<DeleteAccountResponse> deleteAccount(DeleteAccountRequest request);

    /**
      * Before you call this operation, make sure that the cluster meets the following requirements:
      * *   The cluster is in the Running state.
      * *   The backup sets are in the Success state.
      * > *   You can call the [DescribeBackups](~~98102~~) operation to query the status of backup sets.
      * >*   After you delete the backup set file, the storage space that is occupied by the file is released. The released storage space is smaller than the size of the file because your snapshots share some data blocks
      *
     */
    CompletableFuture<DeleteBackupResponse> deleteBackup(DeleteBackupRequest request);

    CompletableFuture<DeleteDBClusterResponse> deleteDBCluster(DeleteDBClusterRequest request);

    CompletableFuture<DeleteDBClusterEndpointResponse> deleteDBClusterEndpoint(DeleteDBClusterEndpointRequest request);

    /**
      * > *   You can delete a public-facing or classic network endpoint of the primary endpoint, the default cluster endpoint, or a custom cluster endpoint.
      * > *   Classic network endpoints are supported only on the China site (aliyun.com). Therefore, you do not need to delete classic network endpoints on the International site (alibabacloud.com).
      *
     */
    CompletableFuture<DeleteDBEndpointAddressResponse> deleteDBEndpointAddress(DeleteDBEndpointAddressRequest request);

    CompletableFuture<DeleteDBLinkResponse> deleteDBLink(DeleteDBLinkRequest request);

    CompletableFuture<DeleteDBNodesResponse> deleteDBNodes(DeleteDBNodesRequest request);

    /**
      * >- The cluster must be in the Running state and unlocked. Otherwise, the specified database cannot be deleted.
      * >- The delete operation is performed in an asynchronous manner. A long period of time may be required to delete a large database. A success response for this operation only indicates that the request to delete the database is sent. You must query the database to check whether the database is deleted.
      *
     */
    CompletableFuture<DeleteDatabaseResponse> deleteDatabase(DeleteDatabaseRequest request);

    /**
      * >  You can delete a GDN only when the GDN includes only a primary cluster.
      *
     */
    CompletableFuture<DeleteGlobalDatabaseNetworkResponse> deleteGlobalDatabaseNetwork(DeleteGlobalDatabaseNetworkRequest request);

    CompletableFuture<DeleteGlobalSecurityIPGroupResponse> deleteGlobalSecurityIPGroup(DeleteGlobalSecurityIPGroupRequest request);

    CompletableFuture<DeleteMaskingRulesResponse> deleteMaskingRules(DeleteMaskingRulesRequest request);

    /**
      * You can use parameter templates to manage multiple parameters at a time and quickly apply existing parameters to a PolarDB cluster. For more information, see [Use a parameter template](~~207009~~).
      * >  When you delete a parameter template, the parameter settings that are applied to PolarDB clusters are not affected.
      *
     */
    CompletableFuture<DeleteParameterGroupResponse> deleteParameterGroup(DeleteParameterGroupRequest request);

    CompletableFuture<DescribeAITaskStatusResponse> describeAITaskStatus(DescribeAITaskStatusRequest request);

    CompletableFuture<DescribeAccountsResponse> describeAccounts(DescribeAccountsRequest request);

    CompletableFuture<DescribeAutoRenewAttributeResponse> describeAutoRenewAttribute(DescribeAutoRenewAttributeRequest request);

    CompletableFuture<DescribeBackupLogsResponse> describeBackupLogs(DescribeBackupLogsRequest request);

    CompletableFuture<DescribeBackupPolicyResponse> describeBackupPolicy(DescribeBackupPolicyRequest request);

    CompletableFuture<DescribeBackupTasksResponse> describeBackupTasks(DescribeBackupTasksRequest request);

    CompletableFuture<DescribeBackupsResponse> describeBackups(DescribeBackupsRequest request);

    CompletableFuture<DescribeCharacterSetNameResponse> describeCharacterSetName(DescribeCharacterSetNameRequest request);

    CompletableFuture<DescribeClassListResponse> describeClassList(DescribeClassListRequest request);

    CompletableFuture<DescribeDBClusterAccessWhitelistResponse> describeDBClusterAccessWhitelist(DescribeDBClusterAccessWhitelistRequest request);

    CompletableFuture<DescribeDBClusterAttributeResponse> describeDBClusterAttribute(DescribeDBClusterAttributeRequest request);

    CompletableFuture<DescribeDBClusterAuditLogCollectorResponse> describeDBClusterAuditLogCollector(DescribeDBClusterAuditLogCollectorRequest request);

    CompletableFuture<DescribeDBClusterAvailableResourcesResponse> describeDBClusterAvailableResources(DescribeDBClusterAvailableResourcesRequest request);

    CompletableFuture<DescribeDBClusterConnectivityResponse> describeDBClusterConnectivity(DescribeDBClusterConnectivityRequest request);

    CompletableFuture<DescribeDBClusterEndpointsResponse> describeDBClusterEndpoints(DescribeDBClusterEndpointsRequest request);

    /**
      * *   You can call this operation to query the status of data migration from an ApsaraDB RDS instance to a PolarDB cluster. For more information, see [Upgrade ApsaraDB RDS for MySQL to PolarDB for MySQL with one click](~~121582~~).
      * *   Before you call this operation, make sure that a one-click upgrade task has been created for the cluster. You can call the [CreateDBCluster](~~98169~~) operation to create an upgrade task. Set the **CreationOption** parameter to **MigrationFromRDS**.
      *
     */
    CompletableFuture<DescribeDBClusterMigrationResponse> describeDBClusterMigration(DescribeDBClusterMigrationRequest request);

    CompletableFuture<DescribeDBClusterMonitorResponse> describeDBClusterMonitor(DescribeDBClusterMonitorRequest request);

    CompletableFuture<DescribeDBClusterParametersResponse> describeDBClusterParameters(DescribeDBClusterParametersRequest request);

    /**
      * *   When the monitoring data is collected every 5 seconds:
      *     *   If the query time range is less than or equal to 1 hour, the data is displayed at intervals of 5 seconds.
      *     *   If the query time range is less than or equal to one day, the data is displayed at intervals of 1 minute.
      *     *   If the query time range is less than or equal to seven days, the data is displayed at intervals of 10 minutes.
      *     *   If the query time range is less than or equal to 30 days, the data is displayed at intervals of 1 hour.
      *     *   When the query time range is greater than 30 days, the data is displayed at intervals of 1 day.
      * *   When the monitoring data is collected every 60 seconds:
      *     *   If the query time range is less than or equal to one day, the data is displayed at intervals of 1 minute.
      *     *   If the query time range is less than or equal to seven days, the data is displayed at intervals of 10 minutes.
      *     *   If the query time range is less than or equal to 30 days, the data is displayed at intervals of 1 hour.
      *     *   When the query time range is greater than 30 days, the data is displayed at intervals of 1 day.
      * >  By default, the monitoring data is collected once every 60 seconds. You can call the [ModifyDBClusterMonitor](~~159557~~) operation to set the data collection interval to every 5 seconds.
      *
     */
    CompletableFuture<DescribeDBClusterPerformanceResponse> describeDBClusterPerformance(DescribeDBClusterPerformanceRequest request);

    CompletableFuture<DescribeDBClusterSSLResponse> describeDBClusterSSL(DescribeDBClusterSSLRequest request);

    CompletableFuture<DescribeDBClusterServerlessConfResponse> describeDBClusterServerlessConf(DescribeDBClusterServerlessConfRequest request);

    CompletableFuture<DescribeDBClusterTDEResponse> describeDBClusterTDE(DescribeDBClusterTDERequest request);

    CompletableFuture<DescribeDBClusterVersionResponse> describeDBClusterVersion(DescribeDBClusterVersionRequest request);

    CompletableFuture<DescribeDBClustersResponse> describeDBClusters(DescribeDBClustersRequest request);

    CompletableFuture<DescribeDBClustersWithBackupsResponse> describeDBClustersWithBackups(DescribeDBClustersWithBackupsRequest request);

    CompletableFuture<DescribeDBInitializeVariableResponse> describeDBInitializeVariable(DescribeDBInitializeVariableRequest request);

    /**
      * > You can query only the database links that use a PolarDB for Oracle cluster as the source.
      *
     */
    CompletableFuture<DescribeDBLinksResponse> describeDBLinks(DescribeDBLinksRequest request);

    /**
      * *   When the monitoring data is collected every 5 seconds:
      *     *   If the query time range is less than or equal to 1 hour, the data is displayed at intervals of 5 seconds.
      *     *   If the query time range is less than or equal to one day, the data is displayed at intervals of 1 minute.
      *     *   If the query time range is less than or equal to seven days, the data is displayed at intervals of 10 minutes.
      *     *   If the query time range is less than or equal to 30 days, the data is displayed at intervals of 1 hour.
      *     *   When the query time range is greater than 30 days, the data is displayed at intervals of 1 day.
      * *   When the monitoring data is collected every 60 seconds:
      *     *   If the query time range is less than or equal to one day, the data is displayed at intervals of 1 minute.
      *     *   If the query time range is less than or equal to seven days, the data is displayed at intervals of 10 minutes.
      *     *   If the query time range is less than or equal to 30 days, the data is displayed at intervals of 1 hour.
      *     *   When the query time range is greater than 30 days, the data is displayed at intervals of 1 day.
      * >  By default, the monitoring data is collected once every 60 seconds. You can call the [ModifyDBClusterMonitor](~~159557~~) operation to set the data collection interval to every 5 seconds.
      *
     */
    CompletableFuture<DescribeDBNodePerformanceResponse> describeDBNodePerformance(DescribeDBNodePerformanceRequest request);

    CompletableFuture<DescribeDBNodesParametersResponse> describeDBNodesParameters(DescribeDBNodesParametersRequest request);

    /**
      * > This operation is applicable only to PolarDB for MySQL clusters.
      *
     */
    CompletableFuture<DescribeDBProxyPerformanceResponse> describeDBProxyPerformance(DescribeDBProxyPerformanceRequest request);

    CompletableFuture<DescribeDasConfigResponse> describeDasConfig(DescribeDasConfigRequest request);

    CompletableFuture<DescribeDatabasesResponse> describeDatabases(DescribeDatabasesRequest request);

    /**
      * Before you call this operation, make sure that the PolarDB cluster is in the **Released** state. You must also confirm that the **Retain All Backups Permanently** or **Retain Last Automatic Backup Permanently** backup retention policy takes effect after you release the cluster. If you delete all backup sets after the cluster is released, you cannot use this API operation to query the cluster.
      * > You can call the [DescribeDBClusterAttribute](~~98181~~) operation to query the cluster status.
      *
     */
    CompletableFuture<DescribeDetachedBackupsResponse> describeDetachedBackups(DescribeDetachedBackupsRequest request);

    CompletableFuture<DescribeGlobalDatabaseNetworkResponse> describeGlobalDatabaseNetwork(DescribeGlobalDatabaseNetworkRequest request);

    CompletableFuture<DescribeGlobalDatabaseNetworksResponse> describeGlobalDatabaseNetworks(DescribeGlobalDatabaseNetworksRequest request);

    CompletableFuture<DescribeGlobalSecurityIPGroupResponse> describeGlobalSecurityIPGroup(DescribeGlobalSecurityIPGroupRequest request);

    CompletableFuture<DescribeGlobalSecurityIPGroupRelationResponse> describeGlobalSecurityIPGroupRelation(DescribeGlobalSecurityIPGroupRelationRequest request);

    CompletableFuture<DescribeLogBackupPolicyResponse> describeLogBackupPolicy(DescribeLogBackupPolicyRequest request);

    CompletableFuture<DescribeMaskingRulesResponse> describeMaskingRules(DescribeMaskingRulesRequest request);

    CompletableFuture<DescribeMetaListResponse> describeMetaList(DescribeMetaListRequest request);

    /**
      * You can use parameter templates to manage multiple parameters at a time and apply existing parameters to a PolarDB cluster. For more information, see [Use a parameter template](~~207009~~).
      * > This parameter is valid only for a PolarDB for MySQL cluster.
      *
     */
    CompletableFuture<DescribeParameterGroupResponse> describeParameterGroup(DescribeParameterGroupRequest request);

    /**
      * You can use parameter templates to manage multiple parameters at a time and apply existing parameters to a PolarDB cluster. For more information, see [Use a parameter template](~~207009~~).
      * > This operation is applicable only to PolarDB for MySQL clusters.
      *
     */
    CompletableFuture<DescribeParameterGroupsResponse> describeParameterGroups(DescribeParameterGroupsRequest request);

    CompletableFuture<DescribeParameterTemplatesResponse> describeParameterTemplates(DescribeParameterTemplatesRequest request);

    CompletableFuture<DescribePendingMaintenanceActionResponse> describePendingMaintenanceAction(DescribePendingMaintenanceActionRequest request);

    CompletableFuture<DescribePendingMaintenanceActionsResponse> describePendingMaintenanceActions(DescribePendingMaintenanceActionsRequest request);

    CompletableFuture<DescribePolarSQLCollectorPolicyResponse> describePolarSQLCollectorPolicy(DescribePolarSQLCollectorPolicyRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeScheduleTasksResponse> describeScheduleTasks(DescribeScheduleTasksRequest request);

    /**
      * > This operation is applicable only to PolarDB for MySQL clusters.
      *
     */
    CompletableFuture<DescribeSlowLogRecordsResponse> describeSlowLogRecords(DescribeSlowLogRecordsRequest request);

    /**
      * > This operation is applicable only to PolarDB for MySQL clusters.
      *
     */
    CompletableFuture<DescribeSlowLogsResponse> describeSlowLogs(DescribeSlowLogsRequest request);

    /**
      * *   You can call this operation to view the details of a task that is generated by a specific API operation or in the console. The system calls the specific API operation when you perform an operation in the console. For example, you can view the details of the task when you call the [CreateDBCluster](~~98169~~) operation or [create a cluster](~~58769~~) in the console.
      * *   You can view the details of tasks that are generated only when you call the [CreateDBCluster](~~98169~~) operation to create a cluster and `CreationOption` is not set to `CreateGdnStandby`.
      *
     */
    CompletableFuture<DescribeTasksResponse> describeTasks(DescribeTasksRequest request);

    CompletableFuture<DescribeUserEncryptionKeyListResponse> describeUserEncryptionKeyList(DescribeUserEncryptionKeyListRequest request);

    CompletableFuture<DescribeVSwitchesResponse> describeVSwitches(DescribeVSwitchesRequest request);

    CompletableFuture<DisableDBClusterServerlessResponse> disableDBClusterServerless(DisableDBClusterServerlessRequest request);

    CompletableFuture<EnableDBClusterServerlessResponse> enableDBClusterServerless(EnableDBClusterServerlessRequest request);

    CompletableFuture<EnableFirewallRulesResponse> enableFirewallRules(EnableFirewallRulesRequest request);

    CompletableFuture<EvaluateRegionResourceResponse> evaluateRegionResource(EvaluateRegionResourceRequest request);

    CompletableFuture<FailoverDBClusterResponse> failoverDBCluster(FailoverDBClusterRequest request);

    /**
      * > *   An account can be authorized to access one or more databases.
      * > *   If the specified account already has the access permissions on the specified databases, the operation returns a successful response.
      * > *   Before you call this operation, make sure that the cluster is in the Running state. Otherwise, the operation fails.
      * > *   You can call this operation only on a PolarDB for MySQL cluster.
      * > *   By default, a privileged account for a cluster has all the permissions on the databases in the cluster.
      *
     */
    CompletableFuture<GrantAccountPrivilegeResponse> grantAccountPrivilege(GrantAccountPrivilegeRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ManuallyStartDBClusterResponse> manuallyStartDBCluster(ManuallyStartDBClusterRequest request);

    CompletableFuture<ModifyAccountDescriptionResponse> modifyAccountDescription(ModifyAccountDescriptionRequest request);

    CompletableFuture<ModifyAccountPasswordResponse> modifyAccountPassword(ModifyAccountPasswordRequest request);

    CompletableFuture<ModifyAutoRenewAttributeResponse> modifyAutoRenewAttribute(ModifyAutoRenewAttributeRequest request);

    /**
      * > You can also modify the automatic backup policy of a PolarDB cluster in the console. For more information, see [Backup settings](~~280422~~).
      *
     */
    CompletableFuture<ModifyBackupPolicyResponse> modifyBackupPolicy(ModifyBackupPolicyRequest request);

    CompletableFuture<ModifyDBClusterResponse> modifyDBCluster(ModifyDBClusterRequest request);

    CompletableFuture<ModifyDBClusterAccessWhitelistResponse> modifyDBClusterAccessWhitelist(ModifyDBClusterAccessWhitelistRequest request);

    CompletableFuture<ModifyDBClusterAndNodesParametersResponse> modifyDBClusterAndNodesParameters(ModifyDBClusterAndNodesParametersRequest request);

    CompletableFuture<ModifyDBClusterAuditLogCollectorResponse> modifyDBClusterAuditLogCollector(ModifyDBClusterAuditLogCollectorRequest request);

    CompletableFuture<ModifyDBClusterDeletionResponse> modifyDBClusterDeletion(ModifyDBClusterDeletionRequest request);

    CompletableFuture<ModifyDBClusterDescriptionResponse> modifyDBClusterDescription(ModifyDBClusterDescriptionRequest request);

    CompletableFuture<ModifyDBClusterEndpointResponse> modifyDBClusterEndpoint(ModifyDBClusterEndpointRequest request);

    /**
      * >  We recommend that you set the routine maintenance window to off-peak hours. Alibaba Cloud maintains your cluster within the specified maintenance window to minimize the negative impacts on your business.
      *
     */
    CompletableFuture<ModifyDBClusterMaintainTimeResponse> modifyDBClusterMaintainTime(ModifyDBClusterMaintainTimeRequest request);

    /**
      * *   You can call this operation to switch the task that migrates data from ApsaraDB for RDS to PolarDB.
      * *   You can call this operation to roll back the task that migrates data from ApsaraDB for RDS to PolarDB.
      * > Before you call this operation, ensure that a one-click upgrade task has been created for the cluster. You can call the [CreateDBCluster](~~98169~~) operation to create an upgrade task. Set the **CreationOption** parameter to **MigrationFromRDS**. For more information, see [Create a PolarDB for MySQL cluster by using the Migration from RDS method](~~121582~~).
      *
     */
    CompletableFuture<ModifyDBClusterMigrationResponse> modifyDBClusterMigration(ModifyDBClusterMigrationRequest request);

    /**
      * *   When the monitoring data is collected every 5 seconds:
      *     *   If the query time range is less than or equal to 1 hour, the data is displayed at intervals of 5 seconds.
      *     *   If the query time range is less than or equal to one day, the data is displayed at intervals of 1 minute.
      *     *   If the query time range is less than or equal to seven days, the data is displayed at intervals of 10 minutes.
      *     *   If the query time range is less than or equal to 30 days, the data is displayed at intervals of 1 hour.
      *     *   When the query time range is greater than 30 days, the data is displayed at intervals of 1 day.
      * *   When the monitoring data is collected every 60 seconds:
      *     *   If the query time range is less than or equal to one day, the data is displayed at intervals of 1 minute.
      *     *   If the query time range is less than or equal to seven days, the data is displayed at intervals of 10 minutes.
      *     *   If the query time range is less than or equal to 30 days, the data is displayed at intervals of 1 hour.
      *     *   When the query time range is greater than 30 days, the data is displayed at intervals of 1 day.
      *
     */
    CompletableFuture<ModifyDBClusterMonitorResponse> modifyDBClusterMonitor(ModifyDBClusterMonitorRequest request);

    /**
      * PolarDB supports the parameter template feature to centrally manage clusters. You can configure a number of parameters at a time by using a parameter template and apply the template to a PolarDB cluster. For more information, see [Use a parameter template](~~207009~~).
      * **
      * **Only PolarDB for MySQL clusters support parameter templates.
      *
     */
    CompletableFuture<ModifyDBClusterParametersResponse> modifyDBClusterParameters(ModifyDBClusterParametersRequest request);

    CompletableFuture<ModifyDBClusterPrimaryZoneResponse> modifyDBClusterPrimaryZone(ModifyDBClusterPrimaryZoneRequest request);

    CompletableFuture<ModifyDBClusterResourceGroupResponse> modifyDBClusterResourceGroup(ModifyDBClusterResourceGroupRequest request);

    CompletableFuture<ModifyDBClusterSSLResponse> modifyDBClusterSSL(ModifyDBClusterSSLRequest request);

    CompletableFuture<ModifyDBClusterServerlessConfResponse> modifyDBClusterServerlessConf(ModifyDBClusterServerlessConfRequest request);

    CompletableFuture<ModifyDBClusterStorageSpaceResponse> modifyDBClusterStorageSpace(ModifyDBClusterStorageSpaceRequest request);

    /**
      * > *   To perform this operation, you must activate KMS first. For more information, see [Purchase a dedicated KMS instance](~~153781~~).
      * > *   After TDE is enabled, you cannot disable TDE.
      *
     */
    CompletableFuture<ModifyDBClusterTDEResponse> modifyDBClusterTDE(ModifyDBClusterTDERequest request);

    CompletableFuture<ModifyDBDescriptionResponse> modifyDBDescription(ModifyDBDescriptionRequest request);

    CompletableFuture<ModifyDBEndpointAddressResponse> modifyDBEndpointAddress(ModifyDBEndpointAddressRequest request);

    CompletableFuture<ModifyDBNodeClassResponse> modifyDBNodeClass(ModifyDBNodeClassRequest request);

    CompletableFuture<ModifyDBNodeHotReplicaModeResponse> modifyDBNodeHotReplicaMode(ModifyDBNodeHotReplicaModeRequest request);

    CompletableFuture<ModifyDBNodesClassResponse> modifyDBNodesClass(ModifyDBNodesClassRequest request);

    CompletableFuture<ModifyDBNodesParametersResponse> modifyDBNodesParameters(ModifyDBNodesParametersRequest request);

    CompletableFuture<ModifyGlobalDatabaseNetworkResponse> modifyGlobalDatabaseNetwork(ModifyGlobalDatabaseNetworkRequest request);

    CompletableFuture<ModifyGlobalSecurityIPGroupResponse> modifyGlobalSecurityIPGroup(ModifyGlobalSecurityIPGroupRequest request);

    CompletableFuture<ModifyGlobalSecurityIPGroupNameResponse> modifyGlobalSecurityIPGroupName(ModifyGlobalSecurityIPGroupNameRequest request);

    CompletableFuture<ModifyGlobalSecurityIPGroupRelationResponse> modifyGlobalSecurityIPGroupRelation(ModifyGlobalSecurityIPGroupRelationRequest request);

    CompletableFuture<ModifyLogBackupPolicyResponse> modifyLogBackupPolicy(ModifyLogBackupPolicyRequest request);

    CompletableFuture<ModifyMaskingRulesResponse> modifyMaskingRules(ModifyMaskingRulesRequest request);

    CompletableFuture<ModifyPendingMaintenanceActionResponse> modifyPendingMaintenanceAction(ModifyPendingMaintenanceActionRequest request);

    CompletableFuture<OpenAITaskResponse> openAITask(OpenAITaskRequest request);

    CompletableFuture<RefreshDBClusterStorageUsageResponse> refreshDBClusterStorageUsage(RefreshDBClusterStorageUsageRequest request);

    /**
      * >  You cannot remove the primary cluster from a GDN.
      *
     */
    CompletableFuture<RemoveDBClusterFromGDNResponse> removeDBClusterFromGDN(RemoveDBClusterFromGDNRequest request);

    /**
      * >- Only PolarDB for MySQL clusters support this operation.
      * >- If the privileged account of your cluster encounters exceptions, you can call this operation to reset the permissions. For example, the permissions are accidentally revoked.
      *
     */
    CompletableFuture<ResetAccountResponse> resetAccount(ResetAccountRequest request);

    CompletableFuture<ResetGlobalDatabaseNetworkResponse> resetGlobalDatabaseNetwork(ResetGlobalDatabaseNetworkRequest request);

    CompletableFuture<RestartDBLinkResponse> restartDBLink(RestartDBLinkRequest request);

    CompletableFuture<RestartDBNodeResponse> restartDBNode(RestartDBNodeRequest request);

    CompletableFuture<RestoreTableResponse> restoreTable(RestoreTableRequest request);

    CompletableFuture<RevokeAccountPrivilegeResponse> revokeAccountPrivilege(RevokeAccountPrivilegeRequest request);

    CompletableFuture<SwitchOverGlobalDatabaseNetworkResponse> switchOverGlobalDatabaseNetwork(SwitchOverGlobalDatabaseNetworkRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<TempModifyDBNodeResponse> tempModifyDBNode(TempModifyDBNodeRequest request);

    /**
      * > *   PolarDB clusters support the subscription and pay-as-you-go billing methods. You can change the billing method from subscription to pay-as-you-go or from pay-as-you-go to subscription based on your business requirements. For more information, see [Change the billing method from subscription to pay-as-you-go](~~172886~~) and [Change the billing method from pay-as-you-go to subscription](~~84076~~).
      * >*   You cannot change the billing method from pay-as-you-go to subscription if your account balance is insufficient.
      * >*   If you change the billing method from subscription to pay-as-you-go, the system automatically refunds the balance of the prepaid subscription fees.
      *
     */
    CompletableFuture<TransformDBClusterPayTypeResponse> transformDBClusterPayType(TransformDBClusterPayTypeRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
      * > *  You can update only the revision version of a PolarDB for MySQL cluster, for example, from 8.0.1.1.3 to 8.0.1.1.4.
      * >*   You can use only your Alibaba Cloud account to create scheduled tasks that update the kernel version of a PolarDB for MySQL cluster. RAM users are not authorized to update the kernel version of a PolarDB for MySQL cluster.
      *
     */
    CompletableFuture<UpgradeDBClusterVersionResponse> upgradeDBClusterVersion(UpgradeDBClusterVersionRequest request);

}
