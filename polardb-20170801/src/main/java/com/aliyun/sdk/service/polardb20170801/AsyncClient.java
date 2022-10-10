// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.polardb20170801.models.*;
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

    CompletableFuture<CloseAITaskResponse> closeAITask(CloseAITaskRequest request);

    CompletableFuture<CloseDBClusterMigrationResponse> closeDBClusterMigration(CloseDBClusterMigrationRequest request);

    CompletableFuture<CreateAccountResponse> createAccount(CreateAccountRequest request);

    CompletableFuture<CreateBackupResponse> createBackup(CreateBackupRequest request);

    CompletableFuture<CreateDBClusterResponse> createDBCluster(CreateDBClusterRequest request);

    CompletableFuture<CreateDBClusterEndpointResponse> createDBClusterEndpoint(CreateDBClusterEndpointRequest request);

    CompletableFuture<CreateDBEndpointAddressResponse> createDBEndpointAddress(CreateDBEndpointAddressRequest request);

    CompletableFuture<CreateDBLinkResponse> createDBLink(CreateDBLinkRequest request);

    CompletableFuture<CreateDBNodesResponse> createDBNodes(CreateDBNodesRequest request);

    CompletableFuture<CreateDatabaseResponse> createDatabase(CreateDatabaseRequest request);

    CompletableFuture<CreateGlobalDatabaseNetworkResponse> createGlobalDatabaseNetwork(CreateGlobalDatabaseNetworkRequest request);

    CompletableFuture<CreateParameterGroupResponse> createParameterGroup(CreateParameterGroupRequest request);

    CompletableFuture<CreateStoragePlanResponse> createStoragePlan(CreateStoragePlanRequest request);

    CompletableFuture<DeleteAccountResponse> deleteAccount(DeleteAccountRequest request);

    CompletableFuture<DeleteBackupResponse> deleteBackup(DeleteBackupRequest request);

    CompletableFuture<DeleteDBClusterResponse> deleteDBCluster(DeleteDBClusterRequest request);

    CompletableFuture<DeleteDBClusterEndpointResponse> deleteDBClusterEndpoint(DeleteDBClusterEndpointRequest request);

    CompletableFuture<DeleteDBEndpointAddressResponse> deleteDBEndpointAddress(DeleteDBEndpointAddressRequest request);

    CompletableFuture<DeleteDBLinkResponse> deleteDBLink(DeleteDBLinkRequest request);

    CompletableFuture<DeleteDBNodesResponse> deleteDBNodes(DeleteDBNodesRequest request);

    CompletableFuture<DeleteDatabaseResponse> deleteDatabase(DeleteDatabaseRequest request);

    CompletableFuture<DeleteGlobalDatabaseNetworkResponse> deleteGlobalDatabaseNetwork(DeleteGlobalDatabaseNetworkRequest request);

    CompletableFuture<DeleteMaskingRulesResponse> deleteMaskingRules(DeleteMaskingRulesRequest request);

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

    CompletableFuture<DescribeDBClusterEndpointsResponse> describeDBClusterEndpoints(DescribeDBClusterEndpointsRequest request);

    CompletableFuture<DescribeDBClusterMigrationResponse> describeDBClusterMigration(DescribeDBClusterMigrationRequest request);

    CompletableFuture<DescribeDBClusterMonitorResponse> describeDBClusterMonitor(DescribeDBClusterMonitorRequest request);

    CompletableFuture<DescribeDBClusterParametersResponse> describeDBClusterParameters(DescribeDBClusterParametersRequest request);

    CompletableFuture<DescribeDBClusterPerformanceResponse> describeDBClusterPerformance(DescribeDBClusterPerformanceRequest request);

    CompletableFuture<DescribeDBClusterSSLResponse> describeDBClusterSSL(DescribeDBClusterSSLRequest request);

    CompletableFuture<DescribeDBClusterTDEResponse> describeDBClusterTDE(DescribeDBClusterTDERequest request);

    CompletableFuture<DescribeDBClusterVersionResponse> describeDBClusterVersion(DescribeDBClusterVersionRequest request);

    CompletableFuture<DescribeDBClustersResponse> describeDBClusters(DescribeDBClustersRequest request);

    CompletableFuture<DescribeDBClustersWithBackupsResponse> describeDBClustersWithBackups(DescribeDBClustersWithBackupsRequest request);

    CompletableFuture<DescribeDBInitializeVariableResponse> describeDBInitializeVariable(DescribeDBInitializeVariableRequest request);

    CompletableFuture<DescribeDBLinksResponse> describeDBLinks(DescribeDBLinksRequest request);

    CompletableFuture<DescribeDBNodePerformanceResponse> describeDBNodePerformance(DescribeDBNodePerformanceRequest request);

    CompletableFuture<DescribeDBNodesParametersResponse> describeDBNodesParameters(DescribeDBNodesParametersRequest request);

    CompletableFuture<DescribeDBProxyPerformanceResponse> describeDBProxyPerformance(DescribeDBProxyPerformanceRequest request);

    CompletableFuture<DescribeDatabasesResponse> describeDatabases(DescribeDatabasesRequest request);

    CompletableFuture<DescribeDetachedBackupsResponse> describeDetachedBackups(DescribeDetachedBackupsRequest request);

    CompletableFuture<DescribeGlobalDatabaseNetworkResponse> describeGlobalDatabaseNetwork(DescribeGlobalDatabaseNetworkRequest request);

    CompletableFuture<DescribeGlobalDatabaseNetworksResponse> describeGlobalDatabaseNetworks(DescribeGlobalDatabaseNetworksRequest request);

    CompletableFuture<DescribeLogBackupPolicyResponse> describeLogBackupPolicy(DescribeLogBackupPolicyRequest request);

    CompletableFuture<DescribeMaskingRulesResponse> describeMaskingRules(DescribeMaskingRulesRequest request);

    CompletableFuture<DescribeMetaListResponse> describeMetaList(DescribeMetaListRequest request);

    CompletableFuture<DescribeParameterGroupResponse> describeParameterGroup(DescribeParameterGroupRequest request);

    CompletableFuture<DescribeParameterGroupsResponse> describeParameterGroups(DescribeParameterGroupsRequest request);

    CompletableFuture<DescribeParameterTemplatesResponse> describeParameterTemplates(DescribeParameterTemplatesRequest request);

    CompletableFuture<DescribePendingMaintenanceActionResponse> describePendingMaintenanceAction(DescribePendingMaintenanceActionRequest request);

    CompletableFuture<DescribePendingMaintenanceActionsResponse> describePendingMaintenanceActions(DescribePendingMaintenanceActionsRequest request);

    CompletableFuture<DescribePolarSQLCollectorPolicyResponse> describePolarSQLCollectorPolicy(DescribePolarSQLCollectorPolicyRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeScheduleTasksResponse> describeScheduleTasks(DescribeScheduleTasksRequest request);

    CompletableFuture<DescribeSlowLogRecordsResponse> describeSlowLogRecords(DescribeSlowLogRecordsRequest request);

    CompletableFuture<DescribeSlowLogsResponse> describeSlowLogs(DescribeSlowLogsRequest request);

    CompletableFuture<DescribeStoragePlanResponse> describeStoragePlan(DescribeStoragePlanRequest request);

    CompletableFuture<DescribeTasksResponse> describeTasks(DescribeTasksRequest request);

    CompletableFuture<EnableFirewallRulesResponse> enableFirewallRules(EnableFirewallRulesRequest request);

    CompletableFuture<EvaluateRegionResourceResponse> evaluateRegionResource(EvaluateRegionResourceRequest request);

    CompletableFuture<FailoverDBClusterResponse> failoverDBCluster(FailoverDBClusterRequest request);

    CompletableFuture<GrantAccountPrivilegeResponse> grantAccountPrivilege(GrantAccountPrivilegeRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ModifyAccountDescriptionResponse> modifyAccountDescription(ModifyAccountDescriptionRequest request);

    CompletableFuture<ModifyAccountPasswordResponse> modifyAccountPassword(ModifyAccountPasswordRequest request);

    CompletableFuture<ModifyAutoRenewAttributeResponse> modifyAutoRenewAttribute(ModifyAutoRenewAttributeRequest request);

    CompletableFuture<ModifyBackupPolicyResponse> modifyBackupPolicy(ModifyBackupPolicyRequest request);

    CompletableFuture<ModifyDBClusterAccessWhitelistResponse> modifyDBClusterAccessWhitelist(ModifyDBClusterAccessWhitelistRequest request);

    CompletableFuture<ModifyDBClusterAndNodesParametersResponse> modifyDBClusterAndNodesParameters(ModifyDBClusterAndNodesParametersRequest request);

    CompletableFuture<ModifyDBClusterAuditLogCollectorResponse> modifyDBClusterAuditLogCollector(ModifyDBClusterAuditLogCollectorRequest request);

    CompletableFuture<ModifyDBClusterDeletionResponse> modifyDBClusterDeletion(ModifyDBClusterDeletionRequest request);

    CompletableFuture<ModifyDBClusterDescriptionResponse> modifyDBClusterDescription(ModifyDBClusterDescriptionRequest request);

    CompletableFuture<ModifyDBClusterEndpointResponse> modifyDBClusterEndpoint(ModifyDBClusterEndpointRequest request);

    CompletableFuture<ModifyDBClusterMaintainTimeResponse> modifyDBClusterMaintainTime(ModifyDBClusterMaintainTimeRequest request);

    CompletableFuture<ModifyDBClusterMigrationResponse> modifyDBClusterMigration(ModifyDBClusterMigrationRequest request);

    CompletableFuture<ModifyDBClusterMonitorResponse> modifyDBClusterMonitor(ModifyDBClusterMonitorRequest request);

    CompletableFuture<ModifyDBClusterParametersResponse> modifyDBClusterParameters(ModifyDBClusterParametersRequest request);

    CompletableFuture<ModifyDBClusterPrimaryZoneResponse> modifyDBClusterPrimaryZone(ModifyDBClusterPrimaryZoneRequest request);

    CompletableFuture<ModifyDBClusterResourceGroupResponse> modifyDBClusterResourceGroup(ModifyDBClusterResourceGroupRequest request);

    CompletableFuture<ModifyDBClusterSSLResponse> modifyDBClusterSSL(ModifyDBClusterSSLRequest request);

    CompletableFuture<ModifyDBClusterTDEResponse> modifyDBClusterTDE(ModifyDBClusterTDERequest request);

    CompletableFuture<ModifyDBDescriptionResponse> modifyDBDescription(ModifyDBDescriptionRequest request);

    CompletableFuture<ModifyDBEndpointAddressResponse> modifyDBEndpointAddress(ModifyDBEndpointAddressRequest request);

    CompletableFuture<ModifyDBNodeClassResponse> modifyDBNodeClass(ModifyDBNodeClassRequest request);

    CompletableFuture<ModifyDBNodesClassResponse> modifyDBNodesClass(ModifyDBNodesClassRequest request);

    CompletableFuture<ModifyDBNodesParametersResponse> modifyDBNodesParameters(ModifyDBNodesParametersRequest request);

    CompletableFuture<ModifyGlobalDatabaseNetworkResponse> modifyGlobalDatabaseNetwork(ModifyGlobalDatabaseNetworkRequest request);

    CompletableFuture<ModifyLogBackupPolicyResponse> modifyLogBackupPolicy(ModifyLogBackupPolicyRequest request);

    CompletableFuture<ModifyMaskingRulesResponse> modifyMaskingRules(ModifyMaskingRulesRequest request);

    CompletableFuture<ModifyPendingMaintenanceActionResponse> modifyPendingMaintenanceAction(ModifyPendingMaintenanceActionRequest request);

    CompletableFuture<OpenAITaskResponse> openAITask(OpenAITaskRequest request);

    CompletableFuture<RefreshDBClusterStorageUsageResponse> refreshDBClusterStorageUsage(RefreshDBClusterStorageUsageRequest request);

    CompletableFuture<RemoveDBClusterFromGDNResponse> removeDBClusterFromGDN(RemoveDBClusterFromGDNRequest request);

    CompletableFuture<ResetAccountResponse> resetAccount(ResetAccountRequest request);

    CompletableFuture<RestartDBNodeResponse> restartDBNode(RestartDBNodeRequest request);

    CompletableFuture<RestoreTableResponse> restoreTable(RestoreTableRequest request);

    CompletableFuture<RevokeAccountPrivilegeResponse> revokeAccountPrivilege(RevokeAccountPrivilegeRequest request);

    CompletableFuture<SwitchOverGlobalDatabaseNetworkResponse> switchOverGlobalDatabaseNetwork(SwitchOverGlobalDatabaseNetworkRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<TempModifyDBNodeResponse> tempModifyDBNode(TempModifyDBNodeRequest request);

    CompletableFuture<TransformDBClusterPayTypeResponse> transformDBClusterPayType(TransformDBClusterPayTypeRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpgradeDBClusterMinorVersionResponse> upgradeDBClusterMinorVersion(UpgradeDBClusterMinorVersionRequest request);

    CompletableFuture<UpgradeDBClusterVersionResponse> upgradeDBClusterVersion(UpgradeDBClusterVersionRequest request);

}
