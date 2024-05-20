// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.clickhouse20191111.models.*;
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

    CompletableFuture<AllocateClusterPublicConnectionResponse> allocateClusterPublicConnection(AllocateClusterPublicConnectionRequest request);

    CompletableFuture<CheckClickhouseToRDSResponse> checkClickhouseToRDS(CheckClickhouseToRDSRequest request);

    /**
      * >  You can call this operation only for ApsaraDB for ClickHouse clusters that were created after December 1, 2021.
      *
     */
    CompletableFuture<CheckModifyConfigNeedRestartResponse> checkModifyConfigNeedRestart(CheckModifyConfigNeedRestartRequest request);

    CompletableFuture<CheckMonitorAlertResponse> checkMonitorAlert(CheckMonitorAlertRequest request);

    CompletableFuture<CheckScaleOutBalancedResponse> checkScaleOutBalanced(CheckScaleOutBalancedRequest request);

    CompletableFuture<CheckServiceLinkedRoleResponse> checkServiceLinkedRole(CheckServiceLinkedRoleRequest request);

    CompletableFuture<CreateAccountResponse> createAccount(CreateAccountRequest request);

    CompletableFuture<CreateAccountAndAuthorityResponse> createAccountAndAuthority(CreateAccountAndAuthorityRequest request);

    /**
      * >  This operation is available only for the ApsaraDB for ClickHouse clusters of versions 20.3, 20.8, and 21.8.
      *
     */
    CompletableFuture<CreateBackupPolicyResponse> createBackupPolicy(CreateBackupPolicyRequest request);

    CompletableFuture<CreateDBInstanceResponse> createDBInstance(CreateDBInstanceRequest request);

    CompletableFuture<CreateMonitorDataReportResponse> createMonitorDataReport(CreateMonitorDataReportRequest request);

    /**
      * Only an ApsaraDB for ClickHouse cluster of V20.8 or later supports tiered storage of hot data and cold data. If your data is in an ApsaraDB for ClickHouse cluster of a version earlier than V20.8 and you want to use tiered storage of hot data and cold data to store the data, you can migrate the data to an ApsaraDB for ClickHouse cluster of V20.8 or later and use tiered storage of hot data and cold data. For more information about how to migrate data between ApsaraDB for ClickHouse clusters, see [Migrate data between ApsaraDB for ClickHouse clusters](~~276926~~).
      *
     */
    CompletableFuture<CreateOSSStorageResponse> createOSSStorage(CreateOSSStorageRequest request);

    /**
      * >  For an ApsaraDB for ClickHouse cluster of V20.8 or later that was created before December 1, 2021, you must manually enable the MySQL port. For an ApsaraDB for ClickHouse cluster of V20.8 or later that was created after December 1, 2021, the MySQL port is automatically enabled.
      *
     */
    CompletableFuture<CreatePortsForClickHouseResponse> createPortsForClickHouse(CreatePortsForClickHouseRequest request);

    /**
      * >  This operation is only applicable to ApsaraDB for ClickHouse clusters.
      *
     */
    CompletableFuture<CreateRDSToClickhouseDbResponse> createRDSToClickhouseDb(CreateRDSToClickhouseDbRequest request);

    /**
      * >  This operation is applicable only to ApsaraDB for ClickHouse clusters of V20.8 or later that were created after December 1, 2021,
      *
     */
    CompletableFuture<CreateSQLAccountResponse> createSQLAccount(CreateSQLAccountRequest request);

    CompletableFuture<CreateServiceLinkedRoleResponse> createServiceLinkedRole(CreateServiceLinkedRoleRequest request);

    /**
      * >  After you delete a database account, you cannot use the account to log on to the ApsaraDB for ClickHouse cluster. Exercise caution when performing this operation.
      *
     */
    CompletableFuture<DeleteAccountResponse> deleteAccount(DeleteAccountRequest request);

    /**
      * **Warning** After an ApsaraDB for ClickHouse cluster is deleted, all data in the cluster is deleted and cannot be recovered. Exercise caution when performing this operation.
      *
     */
    CompletableFuture<DeleteDBClusterResponse> deleteDBCluster(DeleteDBClusterRequest request);

    CompletableFuture<DeleteSyndbResponse> deleteSyndb(DeleteSyndbRequest request);

    CompletableFuture<DescribeAccountAuthorityResponse> describeAccountAuthority(DescribeAccountAuthorityRequest request);

    CompletableFuture<DescribeAccountsResponse> describeAccounts(DescribeAccountsRequest request);

    CompletableFuture<DescribeAllDataSourceResponse> describeAllDataSource(DescribeAllDataSourceRequest request);

    CompletableFuture<DescribeAllDataSourcesResponse> describeAllDataSources(DescribeAllDataSourcesRequest request);

    /**
      * >  This operation is available only for the ApsaraDB for ClickHouse clusters of versions 20.3, 20.8, and 21.8.
      *
     */
    CompletableFuture<DescribeBackupPolicyResponse> describeBackupPolicy(DescribeBackupPolicyRequest request);

    CompletableFuture<DescribeBackupsResponse> describeBackups(DescribeBackupsRequest request);

    CompletableFuture<DescribeColumnsResponse> describeColumns(DescribeColumnsRequest request);

    /**
      * >  You can call this operation only for ApsaraDB for ClickHouse clusters that were created after December 1, 2021.
      *
     */
    CompletableFuture<DescribeConfigHistoryResponse> describeConfigHistory(DescribeConfigHistoryRequest request);

    /**
      * >  You can call this operation only for ApsaraDB for ClickHouse clusters that were created after December 1, 2021.
      *
     */
    CompletableFuture<DescribeConfigVersionDifferenceResponse> describeConfigVersionDifference(DescribeConfigVersionDifferenceRequest request);

    CompletableFuture<DescribeDBClusterAccessWhiteListResponse> describeDBClusterAccessWhiteList(DescribeDBClusterAccessWhiteListRequest request);

    CompletableFuture<DescribeDBClusterAttributeResponse> describeDBClusterAttribute(DescribeDBClusterAttributeRequest request);

    CompletableFuture<DescribeDBClusterConfigResponse> describeDBClusterConfig(DescribeDBClusterConfigRequest request);

    /**
      * >  You can call this operation only for ApsaraDB for ClickHouse clusters that were created after December 1, 2021.
      *
     */
    CompletableFuture<DescribeDBClusterConfigInXMLResponse> describeDBClusterConfigInXML(DescribeDBClusterConfigInXMLRequest request);

    CompletableFuture<DescribeDBClusterNetInfoItemsResponse> describeDBClusterNetInfoItems(DescribeDBClusterNetInfoItemsRequest request);

    /**
      * You can query the performance data of a specified cluster over a specific time range based on the performance metrics. The data is collected every 30 seconds.
      * >  You can call this operation only for ApsaraDB for ClickHouse clusters that were created before December 1, 2021.
      *
     */
    CompletableFuture<DescribeDBClusterPerformanceResponse> describeDBClusterPerformance(DescribeDBClusterPerformanceRequest request);

    CompletableFuture<DescribeDBClustersResponse> describeDBClusters(DescribeDBClustersRequest request);

    CompletableFuture<DescribeDBConfigResponse> describeDBConfig(DescribeDBConfigRequest request);

    CompletableFuture<DescribeOSSStorageResponse> describeOSSStorage(DescribeOSSStorageRequest request);

    CompletableFuture<DescribeProcessListResponse> describeProcessList(DescribeProcessListRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeSchemasResponse> describeSchemas(DescribeSchemasRequest request);

    CompletableFuture<DescribeSlowLogRecordsResponse> describeSlowLogRecords(DescribeSlowLogRecordsRequest request);

    CompletableFuture<DescribeSynDbTablesResponse> describeSynDbTables(DescribeSynDbTablesRequest request);

    CompletableFuture<DescribeSynDbsResponse> describeSynDbs(DescribeSynDbsRequest request);

    CompletableFuture<DescribeTablesResponse> describeTables(DescribeTablesRequest request);

    /**
      * >  You can call this operation to query information about only data migration from an ApsaraDB for ClickHouse cluster of an earlier version to an ApsaraDB for ClickHouse cluster of a later version.
      *
     */
    CompletableFuture<DescribeTransferHistoryResponse> describeTransferHistory(DescribeTransferHistoryRequest request);

    CompletableFuture<KillProcessResponse> killProcess(KillProcessRequest request);

    CompletableFuture<ModifyAccountAuthorityResponse> modifyAccountAuthority(ModifyAccountAuthorityRequest request);

    CompletableFuture<ModifyAccountDescriptionResponse> modifyAccountDescription(ModifyAccountDescriptionRequest request);

    /**
      * >  This operation is available only for the ApsaraDB for ClickHouse clusters of versions 20.3, 20.8, and 21.8.
      *
     */
    CompletableFuture<ModifyBackupPolicyResponse> modifyBackupPolicy(ModifyBackupPolicyRequest request);

    CompletableFuture<ModifyDBClusterResponse> modifyDBCluster(ModifyDBClusterRequest request);

    CompletableFuture<ModifyDBClusterAccessWhiteListResponse> modifyDBClusterAccessWhiteList(ModifyDBClusterAccessWhiteListRequest request);

    CompletableFuture<ModifyDBClusterConfigResponse> modifyDBClusterConfig(ModifyDBClusterConfigRequest request);

    /**
      * >  You can call this operation only for ApsaraDB for ClickHouse clusters that were created after December 1, 2021.
      *
     */
    CompletableFuture<ModifyDBClusterConfigInXMLResponse> modifyDBClusterConfigInXML(ModifyDBClusterConfigInXMLRequest request);

    CompletableFuture<ModifyDBClusterDescriptionResponse> modifyDBClusterDescription(ModifyDBClusterDescriptionRequest request);

    CompletableFuture<ModifyDBClusterMaintainTimeResponse> modifyDBClusterMaintainTime(ModifyDBClusterMaintainTimeRequest request);

    CompletableFuture<ModifyDBConfigResponse> modifyDBConfig(ModifyDBConfigRequest request);

    CompletableFuture<ModifyMinorVersionGreadeTypeResponse> modifyMinorVersionGreadeType(ModifyMinorVersionGreadeTypeRequest request);

    /**
      * >  This operation is applicable only to ApsaraDB for ClickHouse clusters.
      *
     */
    CompletableFuture<ModifyRDSToClickhouseDbResponse> modifyRDSToClickhouseDb(ModifyRDSToClickhouseDbRequest request);

    CompletableFuture<ReleaseClusterPublicConnectionResponse> releaseClusterPublicConnection(ReleaseClusterPublicConnectionRequest request);

    CompletableFuture<ResetAccountPasswordResponse> resetAccountPassword(ResetAccountPasswordRequest request);

    CompletableFuture<RestartInstanceResponse> restartInstance(RestartInstanceRequest request);

    /**
      * ## [](#)Prerequisites
      * *   The IP address of the source ApsaraDB for ClickHouse cluster is added to the IP address whitelist of the destination ApsaraDB for ClickHouse cluster.
      * *   The IP address of the destination ApsaraDB for ClickHouse cluster is added to the IP address whitelist of the source ApsaraDB for ClickHouse cluster.
      * >  You can execute the `select * from system.clusters;` statement to query the IP address of an ApsaraDB for ClickHouse cluster.
      *
     */
    CompletableFuture<TransferVersionResponse> transferVersion(TransferVersionRequest request);

    /**
      * >  You can call this operation only for ApsaraDB for ClickHouse clusters that were purchased after December 1, 2021.
      *
     */
    CompletableFuture<UpgradeMinorVersionResponse> upgradeMinorVersion(UpgradeMinorVersionRequest request);

}
