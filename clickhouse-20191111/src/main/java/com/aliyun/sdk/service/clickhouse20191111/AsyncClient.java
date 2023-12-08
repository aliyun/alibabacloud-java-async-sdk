// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.clickhouse20191111.models.*;
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

    CompletableFuture<CreateOSSStorageResponse> createOSSStorage(CreateOSSStorageRequest request);

    CompletableFuture<CreatePortsForClickHouseResponse> createPortsForClickHouse(CreatePortsForClickHouseRequest request);

    CompletableFuture<CreateRDSToClickhouseDbResponse> createRDSToClickhouseDb(CreateRDSToClickhouseDbRequest request);

    CompletableFuture<CreateSQLAccountResponse> createSQLAccount(CreateSQLAccountRequest request);

    CompletableFuture<CreateServiceLinkedRoleResponse> createServiceLinkedRole(CreateServiceLinkedRoleRequest request);

    CompletableFuture<DeleteAccountResponse> deleteAccount(DeleteAccountRequest request);

    CompletableFuture<DeleteDBClusterResponse> deleteDBCluster(DeleteDBClusterRequest request);

    CompletableFuture<DeleteSyndbResponse> deleteSyndb(DeleteSyndbRequest request);

    CompletableFuture<DescribeAccountAuthorityResponse> describeAccountAuthority(DescribeAccountAuthorityRequest request);

    CompletableFuture<DescribeAccountsResponse> describeAccounts(DescribeAccountsRequest request);

    CompletableFuture<DescribeAllDataSourceResponse> describeAllDataSource(DescribeAllDataSourceRequest request);

    CompletableFuture<DescribeAllDataSourcesResponse> describeAllDataSources(DescribeAllDataSourcesRequest request);

    CompletableFuture<DescribeBackupPolicyResponse> describeBackupPolicy(DescribeBackupPolicyRequest request);

    CompletableFuture<DescribeBackupsResponse> describeBackups(DescribeBackupsRequest request);

    CompletableFuture<DescribeColumnsResponse> describeColumns(DescribeColumnsRequest request);

    CompletableFuture<DescribeConfigHistoryResponse> describeConfigHistory(DescribeConfigHistoryRequest request);

    CompletableFuture<DescribeConfigVersionDifferenceResponse> describeConfigVersionDifference(DescribeConfigVersionDifferenceRequest request);

    CompletableFuture<DescribeDBClusterAccessWhiteListResponse> describeDBClusterAccessWhiteList(DescribeDBClusterAccessWhiteListRequest request);

    CompletableFuture<DescribeDBClusterAttributeResponse> describeDBClusterAttribute(DescribeDBClusterAttributeRequest request);

    CompletableFuture<DescribeDBClusterConfigResponse> describeDBClusterConfig(DescribeDBClusterConfigRequest request);

    CompletableFuture<DescribeDBClusterConfigInXMLResponse> describeDBClusterConfigInXML(DescribeDBClusterConfigInXMLRequest request);

    CompletableFuture<DescribeDBClusterNetInfoItemsResponse> describeDBClusterNetInfoItems(DescribeDBClusterNetInfoItemsRequest request);

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

    CompletableFuture<DescribeTransferHistoryResponse> describeTransferHistory(DescribeTransferHistoryRequest request);

    CompletableFuture<KillProcessResponse> killProcess(KillProcessRequest request);

    CompletableFuture<ModifyAccountAuthorityResponse> modifyAccountAuthority(ModifyAccountAuthorityRequest request);

    CompletableFuture<ModifyAccountDescriptionResponse> modifyAccountDescription(ModifyAccountDescriptionRequest request);

    CompletableFuture<ModifyBackupPolicyResponse> modifyBackupPolicy(ModifyBackupPolicyRequest request);

    CompletableFuture<ModifyDBClusterResponse> modifyDBCluster(ModifyDBClusterRequest request);

    CompletableFuture<ModifyDBClusterAccessWhiteListResponse> modifyDBClusterAccessWhiteList(ModifyDBClusterAccessWhiteListRequest request);

    CompletableFuture<ModifyDBClusterConfigResponse> modifyDBClusterConfig(ModifyDBClusterConfigRequest request);

    CompletableFuture<ModifyDBClusterConfigInXMLResponse> modifyDBClusterConfigInXML(ModifyDBClusterConfigInXMLRequest request);

    CompletableFuture<ModifyDBClusterDescriptionResponse> modifyDBClusterDescription(ModifyDBClusterDescriptionRequest request);

    CompletableFuture<ModifyDBClusterMaintainTimeResponse> modifyDBClusterMaintainTime(ModifyDBClusterMaintainTimeRequest request);

    CompletableFuture<ModifyDBConfigResponse> modifyDBConfig(ModifyDBConfigRequest request);

    CompletableFuture<ModifyMinorVersionGreadeTypeResponse> modifyMinorVersionGreadeType(ModifyMinorVersionGreadeTypeRequest request);

    CompletableFuture<ModifyRDSToClickhouseDbResponse> modifyRDSToClickhouseDb(ModifyRDSToClickhouseDbRequest request);

    CompletableFuture<ReleaseClusterPublicConnectionResponse> releaseClusterPublicConnection(ReleaseClusterPublicConnectionRequest request);

    CompletableFuture<ResetAccountPasswordResponse> resetAccountPassword(ResetAccountPasswordRequest request);

    CompletableFuture<RestartInstanceResponse> restartInstance(RestartInstanceRequest request);

    CompletableFuture<TransferVersionResponse> transferVersion(TransferVersionRequest request);

    CompletableFuture<UpgradeMinorVersionResponse> upgradeMinorVersion(UpgradeMinorVersionRequest request);

}
