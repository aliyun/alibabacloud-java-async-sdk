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

    CompletableFuture<CheckMonitorAlertResponse> checkMonitorAlert(CheckMonitorAlertRequest request);

    CompletableFuture<CheckScaleOutBalancedResponse> checkScaleOutBalanced(CheckScaleOutBalancedRequest request);

    CompletableFuture<CheckServiceLinkedRoleResponse> checkServiceLinkedRole(CheckServiceLinkedRoleRequest request);

    CompletableFuture<CheckVersionTransferResponse> checkVersionTransfer(CheckVersionTransferRequest request);

    CompletableFuture<CreateAccountResponse> createAccount(CreateAccountRequest request);

    CompletableFuture<CreateAccountAndAuthorityResponse> createAccountAndAuthority(CreateAccountAndAuthorityRequest request);

    CompletableFuture<CreateBackupPolicyResponse> createBackupPolicy(CreateBackupPolicyRequest request);

    CompletableFuture<CreateDBInstanceResponse> createDBInstance(CreateDBInstanceRequest request);

    CompletableFuture<CreateMonitorDataReportResponse> createMonitorDataReport(CreateMonitorDataReportRequest request);

    CompletableFuture<CreateOSSStorageResponse> createOSSStorage(CreateOSSStorageRequest request);

    CompletableFuture<CreatePortsForClickHouseResponse> createPortsForClickHouse(CreatePortsForClickHouseRequest request);

    CompletableFuture<CreateRDSToClickhouseDbResponse> createRDSToClickhouseDb(CreateRDSToClickhouseDbRequest request);

    CompletableFuture<CreateServiceLinkedRoleResponse> createServiceLinkedRole(CreateServiceLinkedRoleRequest request);

    CompletableFuture<DeleteAccountResponse> deleteAccount(DeleteAccountRequest request);

    CompletableFuture<DeleteDBClusterResponse> deleteDBCluster(DeleteDBClusterRequest request);

    CompletableFuture<DeleteLorneTaskResponse> deleteLorneTask(DeleteLorneTaskRequest request);

    CompletableFuture<DeleteSyndbResponse> deleteSyndb(DeleteSyndbRequest request);

    CompletableFuture<DescribeAccountAuthorityResponse> describeAccountAuthority(DescribeAccountAuthorityRequest request);

    CompletableFuture<DescribeAccountsResponse> describeAccounts(DescribeAccountsRequest request);

    CompletableFuture<DescribeAllDataSourceResponse> describeAllDataSource(DescribeAllDataSourceRequest request);

    CompletableFuture<DescribeAllDataSourcesResponse> describeAllDataSources(DescribeAllDataSourcesRequest request);

    CompletableFuture<DescribeAvailableResourceResponse> describeAvailableResource(DescribeAvailableResourceRequest request);

    CompletableFuture<DescribeBackupPolicyResponse> describeBackupPolicy(DescribeBackupPolicyRequest request);

    CompletableFuture<DescribeBackupsResponse> describeBackups(DescribeBackupsRequest request);

    CompletableFuture<DescribeColumnsResponse> describeColumns(DescribeColumnsRequest request);

    CompletableFuture<DescribeDBClusterAccessWhiteListResponse> describeDBClusterAccessWhiteList(DescribeDBClusterAccessWhiteListRequest request);

    CompletableFuture<DescribeDBClusterAttributeResponse> describeDBClusterAttribute(DescribeDBClusterAttributeRequest request);

    CompletableFuture<DescribeDBClusterConfigResponse> describeDBClusterConfig(DescribeDBClusterConfigRequest request);

    CompletableFuture<DescribeDBClusterNetInfoItemsResponse> describeDBClusterNetInfoItems(DescribeDBClusterNetInfoItemsRequest request);

    CompletableFuture<DescribeDBClusterPerformanceResponse> describeDBClusterPerformance(DescribeDBClusterPerformanceRequest request);

    CompletableFuture<DescribeDBClustersResponse> describeDBClusters(DescribeDBClustersRequest request);

    CompletableFuture<DescribeDBConfigResponse> describeDBConfig(DescribeDBConfigRequest request);

    CompletableFuture<DescribeLogHubAttributeResponse> describeLogHubAttribute(DescribeLogHubAttributeRequest request);

    CompletableFuture<DescribeLogStoreKeysResponse> describeLogStoreKeys(DescribeLogStoreKeysRequest request);

    CompletableFuture<DescribeLoghubDetailResponse> describeLoghubDetail(DescribeLoghubDetailRequest request);

    CompletableFuture<DescribeLorneLogResponse> describeLorneLog(DescribeLorneLogRequest request);

    CompletableFuture<DescribeLorneTasksResponse> describeLorneTasks(DescribeLorneTasksRequest request);

    CompletableFuture<DescribeLorneTasksMCountResponse> describeLorneTasksMCount(DescribeLorneTasksMCountRequest request);

    CompletableFuture<DescribeLorneTasksMetricsResponse> describeLorneTasksMetrics(DescribeLorneTasksMetricsRequest request);

    CompletableFuture<DescribeOSSStorageResponse> describeOSSStorage(DescribeOSSStorageRequest request);

    CompletableFuture<DescribeProcessListResponse> describeProcessList(DescribeProcessListRequest request);

    CompletableFuture<DescribeRDSTablesResponse> describeRDSTables(DescribeRDSTablesRequest request);

    CompletableFuture<DescribeRDSVpcResponse> describeRDSVpc(DescribeRDSVpcRequest request);

    CompletableFuture<DescribeRDSschemasResponse> describeRDSschemas(DescribeRDSschemasRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeSchemasResponse> describeSchemas(DescribeSchemasRequest request);

    CompletableFuture<DescribeSlowLogRecordsResponse> describeSlowLogRecords(DescribeSlowLogRecordsRequest request);

    CompletableFuture<DescribeSlowLogTrendResponse> describeSlowLogTrend(DescribeSlowLogTrendRequest request);

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

    CompletableFuture<ModifyDBClusterDescriptionResponse> modifyDBClusterDescription(ModifyDBClusterDescriptionRequest request);

    CompletableFuture<ModifyDBClusterMaintainTimeResponse> modifyDBClusterMaintainTime(ModifyDBClusterMaintainTimeRequest request);

    CompletableFuture<ModifyDBConfigResponse> modifyDBConfig(ModifyDBConfigRequest request);

    CompletableFuture<ModifyRDSToClickhouseDbResponse> modifyRDSToClickhouseDb(ModifyRDSToClickhouseDbRequest request);

    CompletableFuture<OperateLogHubResponse> operateLogHub(OperateLogHubRequest request);

    CompletableFuture<OperateLorneTaskStatusResponse> operateLorneTaskStatus(OperateLorneTaskStatusRequest request);

    CompletableFuture<ReleaseClusterPublicConnectionResponse> releaseClusterPublicConnection(ReleaseClusterPublicConnectionRequest request);

    CompletableFuture<ResetAccountPasswordResponse> resetAccountPassword(ResetAccountPasswordRequest request);

    CompletableFuture<RestartInstanceResponse> restartInstance(RestartInstanceRequest request);

    CompletableFuture<SearchRDSTablesResponse> searchRDSTables(SearchRDSTablesRequest request);

    CompletableFuture<TransferVersionResponse> transferVersion(TransferVersionRequest request);

}
