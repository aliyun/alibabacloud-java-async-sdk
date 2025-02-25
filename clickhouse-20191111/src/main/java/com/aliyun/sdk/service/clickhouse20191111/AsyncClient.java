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

    /**
     * @param request the request parameters of AllocateClusterPublicConnection  AllocateClusterPublicConnectionRequest
     * @return AllocateClusterPublicConnectionResponse
     */
    CompletableFuture<AllocateClusterPublicConnectionResponse> allocateClusterPublicConnection(AllocateClusterPublicConnectionRequest request);

    /**
     * @param request the request parameters of CheckClickhouseToRDS  CheckClickhouseToRDSRequest
     * @return CheckClickhouseToRDSResponse
     */
    CompletableFuture<CheckClickhouseToRDSResponse> checkClickhouseToRDS(CheckClickhouseToRDSRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this operation only for ApsaraDB for ClickHouse clusters that were created after December 1, 2021.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CheckModifyConfigNeedRestart  CheckModifyConfigNeedRestartRequest
     * @return CheckModifyConfigNeedRestartResponse
     */
    CompletableFuture<CheckModifyConfigNeedRestartResponse> checkModifyConfigNeedRestart(CheckModifyConfigNeedRestartRequest request);

    /**
     * @param request the request parameters of CheckMonitorAlert  CheckMonitorAlertRequest
     * @return CheckMonitorAlertResponse
     */
    CompletableFuture<CheckMonitorAlertResponse> checkMonitorAlert(CheckMonitorAlertRequest request);

    /**
     * @param request the request parameters of CheckScaleOutBalanced  CheckScaleOutBalancedRequest
     * @return CheckScaleOutBalancedResponse
     */
    CompletableFuture<CheckScaleOutBalancedResponse> checkScaleOutBalanced(CheckScaleOutBalancedRequest request);

    /**
     * @param request the request parameters of CheckServiceLinkedRole  CheckServiceLinkedRoleRequest
     * @return CheckServiceLinkedRoleResponse
     */
    CompletableFuture<CheckServiceLinkedRoleResponse> checkServiceLinkedRole(CheckServiceLinkedRoleRequest request);

    /**
     * @param request the request parameters of CreateAccount  CreateAccountRequest
     * @return CreateAccountResponse
     */
    CompletableFuture<CreateAccountResponse> createAccount(CreateAccountRequest request);

    /**
     * @param request the request parameters of CreateAccountAndAuthority  CreateAccountAndAuthorityRequest
     * @return CreateAccountAndAuthorityResponse
     */
    CompletableFuture<CreateAccountAndAuthorityResponse> createAccountAndAuthority(CreateAccountAndAuthorityRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> This operation is available only for the ApsaraDB for ClickHouse clusters of versions 20.3, 20.8, and 21.8.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateBackupPolicy  CreateBackupPolicyRequest
     * @return CreateBackupPolicyResponse
     */
    CompletableFuture<CreateBackupPolicyResponse> createBackupPolicy(CreateBackupPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you are familiar with the billing methods and <a href="https://help.aliyun.com/document_detail/167450.html">pricing</a> of ApsaraDB for ClickHouse.</p>
     * 
     * @param request the request parameters of CreateDBInstance  CreateDBInstanceRequest
     * @return CreateDBInstanceResponse
     */
    CompletableFuture<CreateDBInstanceResponse> createDBInstance(CreateDBInstanceRequest request);

    /**
     * @param request the request parameters of CreateMonitorDataReport  CreateMonitorDataReportRequest
     * @return CreateMonitorDataReportResponse
     */
    CompletableFuture<CreateMonitorDataReportResponse> createMonitorDataReport(CreateMonitorDataReportRequest request);

    /**
     * <b>description</b> :
     * <p>Only an ApsaraDB for ClickHouse cluster of V20.8 or later supports tiered storage of hot data and cold data. If your data is in an ApsaraDB for ClickHouse cluster of a version earlier than V20.8 and you want to use tiered storage of hot data and cold data to store the data, you can migrate the data to an ApsaraDB for ClickHouse cluster of V20.8 or later and use tiered storage of hot data and cold data. For more information about how to migrate data between ApsaraDB for ClickHouse clusters, see <a href="https://help.aliyun.com/document_detail/276926.html">Migrate data between ApsaraDB for ClickHouse clusters</a>.</p>
     * 
     * @param request the request parameters of CreateOSSStorage  CreateOSSStorageRequest
     * @return CreateOSSStorageResponse
     */
    CompletableFuture<CreateOSSStorageResponse> createOSSStorage(CreateOSSStorageRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> For an ApsaraDB for ClickHouse cluster of V20.8 or later that was created before December 1, 2021, you must manually enable the MySQL port. For an ApsaraDB for ClickHouse cluster of V20.8 or later that was created after December 1, 2021, the MySQL port is automatically enabled.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreatePortsForClickHouse  CreatePortsForClickHouseRequest
     * @return CreatePortsForClickHouseResponse
     */
    CompletableFuture<CreatePortsForClickHouseResponse> createPortsForClickHouse(CreatePortsForClickHouseRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> This operation is only applicable to ApsaraDB for ClickHouse clusters.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateRDSToClickhouseDb  CreateRDSToClickhouseDbRequest
     * @return CreateRDSToClickhouseDbResponse
     */
    CompletableFuture<CreateRDSToClickhouseDbResponse> createRDSToClickhouseDb(CreateRDSToClickhouseDbRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> This operation is applicable only to ApsaraDB for ClickHouse clusters of V20.8 or later that were created after December 1, 2021,</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateSQLAccount  CreateSQLAccountRequest
     * @return CreateSQLAccountResponse
     */
    CompletableFuture<CreateSQLAccountResponse> createSQLAccount(CreateSQLAccountRequest request);

    /**
     * @param request the request parameters of CreateServiceLinkedRole  CreateServiceLinkedRoleRequest
     * @return CreateServiceLinkedRoleResponse
     */
    CompletableFuture<CreateServiceLinkedRoleResponse> createServiceLinkedRole(CreateServiceLinkedRoleRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> After you delete a database account, you cannot use the account to log on to the ApsaraDB for ClickHouse cluster. Exercise caution when performing this operation.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteAccount  DeleteAccountRequest
     * @return DeleteAccountResponse
     */
    CompletableFuture<DeleteAccountResponse> deleteAccount(DeleteAccountRequest request);

    /**
     * <b>description</b> :
     * <p><em>Warning</em>* After an ApsaraDB for ClickHouse cluster is deleted, all data in the cluster is deleted and cannot be recovered. Exercise caution when performing this operation.</p>
     * 
     * @param request the request parameters of DeleteDBCluster  DeleteDBClusterRequest
     * @return DeleteDBClusterResponse
     */
    CompletableFuture<DeleteDBClusterResponse> deleteDBCluster(DeleteDBClusterRequest request);

    /**
     * @param request the request parameters of DeleteSyndb  DeleteSyndbRequest
     * @return DeleteSyndbResponse
     */
    CompletableFuture<DeleteSyndbResponse> deleteSyndb(DeleteSyndbRequest request);

    /**
     * @param request the request parameters of DescribeAccountAuthority  DescribeAccountAuthorityRequest
     * @return DescribeAccountAuthorityResponse
     */
    CompletableFuture<DescribeAccountAuthorityResponse> describeAccountAuthority(DescribeAccountAuthorityRequest request);

    /**
     * @param request the request parameters of DescribeAccounts  DescribeAccountsRequest
     * @return DescribeAccountsResponse
     */
    CompletableFuture<DescribeAccountsResponse> describeAccounts(DescribeAccountsRequest request);

    /**
     * @param request the request parameters of DescribeAllDataSource  DescribeAllDataSourceRequest
     * @return DescribeAllDataSourceResponse
     */
    CompletableFuture<DescribeAllDataSourceResponse> describeAllDataSource(DescribeAllDataSourceRequest request);

    /**
     * @param request the request parameters of DescribeAllDataSources  DescribeAllDataSourcesRequest
     * @return DescribeAllDataSourcesResponse
     */
    CompletableFuture<DescribeAllDataSourcesResponse> describeAllDataSources(DescribeAllDataSourcesRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> This operation is available only for the ApsaraDB for ClickHouse clusters of versions 20.3, 20.8, and 21.8.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeBackupPolicy  DescribeBackupPolicyRequest
     * @return DescribeBackupPolicyResponse
     */
    CompletableFuture<DescribeBackupPolicyResponse> describeBackupPolicy(DescribeBackupPolicyRequest request);

    /**
     * @param request the request parameters of DescribeBackups  DescribeBackupsRequest
     * @return DescribeBackupsResponse
     */
    CompletableFuture<DescribeBackupsResponse> describeBackups(DescribeBackupsRequest request);

    /**
     * @param request the request parameters of DescribeColumns  DescribeColumnsRequest
     * @return DescribeColumnsResponse
     */
    CompletableFuture<DescribeColumnsResponse> describeColumns(DescribeColumnsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this operation only for ApsaraDB for ClickHouse clusters that were created after December 1, 2021.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeConfigHistory  DescribeConfigHistoryRequest
     * @return DescribeConfigHistoryResponse
     */
    CompletableFuture<DescribeConfigHistoryResponse> describeConfigHistory(DescribeConfigHistoryRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this operation only for ApsaraDB for ClickHouse clusters that were created after December 1, 2021.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeConfigVersionDifference  DescribeConfigVersionDifferenceRequest
     * @return DescribeConfigVersionDifferenceResponse
     */
    CompletableFuture<DescribeConfigVersionDifferenceResponse> describeConfigVersionDifference(DescribeConfigVersionDifferenceRequest request);

    /**
     * @param request the request parameters of DescribeDBClusterAccessWhiteList  DescribeDBClusterAccessWhiteListRequest
     * @return DescribeDBClusterAccessWhiteListResponse
     */
    CompletableFuture<DescribeDBClusterAccessWhiteListResponse> describeDBClusterAccessWhiteList(DescribeDBClusterAccessWhiteListRequest request);

    /**
     * @param request the request parameters of DescribeDBClusterAttribute  DescribeDBClusterAttributeRequest
     * @return DescribeDBClusterAttributeResponse
     */
    CompletableFuture<DescribeDBClusterAttributeResponse> describeDBClusterAttribute(DescribeDBClusterAttributeRequest request);

    /**
     * @param request the request parameters of DescribeDBClusterConfig  DescribeDBClusterConfigRequest
     * @return DescribeDBClusterConfigResponse
     */
    CompletableFuture<DescribeDBClusterConfigResponse> describeDBClusterConfig(DescribeDBClusterConfigRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this operation only for ApsaraDB for ClickHouse clusters that were created after December 1, 2021.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDBClusterConfigInXML  DescribeDBClusterConfigInXMLRequest
     * @return DescribeDBClusterConfigInXMLResponse
     */
    CompletableFuture<DescribeDBClusterConfigInXMLResponse> describeDBClusterConfigInXML(DescribeDBClusterConfigInXMLRequest request);

    /**
     * @param request the request parameters of DescribeDBClusterNetInfoItems  DescribeDBClusterNetInfoItemsRequest
     * @return DescribeDBClusterNetInfoItemsResponse
     */
    CompletableFuture<DescribeDBClusterNetInfoItemsResponse> describeDBClusterNetInfoItems(DescribeDBClusterNetInfoItemsRequest request);

    /**
     * <b>description</b> :
     * <p>You can query the performance data of a specified cluster over a specific time range based on the performance metrics. The data is collected every 30 seconds.</p>
     * <blockquote>
     * <p> You can call this operation only for ApsaraDB for ClickHouse clusters that were created before December 1, 2021.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDBClusterPerformance  DescribeDBClusterPerformanceRequest
     * @return DescribeDBClusterPerformanceResponse
     */
    CompletableFuture<DescribeDBClusterPerformanceResponse> describeDBClusterPerformance(DescribeDBClusterPerformanceRequest request);

    /**
     * @param request the request parameters of DescribeDBClusters  DescribeDBClustersRequest
     * @return DescribeDBClustersResponse
     */
    CompletableFuture<DescribeDBClustersResponse> describeDBClusters(DescribeDBClustersRequest request);

    /**
     * @param request the request parameters of DescribeDBConfig  DescribeDBConfigRequest
     * @return DescribeDBConfigResponse
     */
    CompletableFuture<DescribeDBConfigResponse> describeDBConfig(DescribeDBConfigRequest request);

    /**
     * @param request the request parameters of DescribeOSSStorage  DescribeOSSStorageRequest
     * @return DescribeOSSStorageResponse
     */
    CompletableFuture<DescribeOSSStorageResponse> describeOSSStorage(DescribeOSSStorageRequest request);

    /**
     * @param request the request parameters of DescribeProcessList  DescribeProcessListRequest
     * @return DescribeProcessListResponse
     */
    CompletableFuture<DescribeProcessListResponse> describeProcessList(DescribeProcessListRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * @param request the request parameters of DescribeSchemas  DescribeSchemasRequest
     * @return DescribeSchemasResponse
     */
    CompletableFuture<DescribeSchemasResponse> describeSchemas(DescribeSchemasRequest request);

    /**
     * @param request the request parameters of DescribeSlowLogRecords  DescribeSlowLogRecordsRequest
     * @return DescribeSlowLogRecordsResponse
     */
    CompletableFuture<DescribeSlowLogRecordsResponse> describeSlowLogRecords(DescribeSlowLogRecordsRequest request);

    /**
     * @param request the request parameters of DescribeSynDbTables  DescribeSynDbTablesRequest
     * @return DescribeSynDbTablesResponse
     */
    CompletableFuture<DescribeSynDbTablesResponse> describeSynDbTables(DescribeSynDbTablesRequest request);

    /**
     * @param request the request parameters of DescribeSynDbs  DescribeSynDbsRequest
     * @return DescribeSynDbsResponse
     */
    CompletableFuture<DescribeSynDbsResponse> describeSynDbs(DescribeSynDbsRequest request);

    /**
     * @param request the request parameters of DescribeTables  DescribeTablesRequest
     * @return DescribeTablesResponse
     */
    CompletableFuture<DescribeTablesResponse> describeTables(DescribeTablesRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this operation to query information about only data migration from an ApsaraDB for ClickHouse cluster of an earlier version to an ApsaraDB for ClickHouse cluster of a later version.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeTransferHistory  DescribeTransferHistoryRequest
     * @return DescribeTransferHistoryResponse
     */
    CompletableFuture<DescribeTransferHistoryResponse> describeTransferHistory(DescribeTransferHistoryRequest request);

    /**
     * @param request the request parameters of KillProcess  KillProcessRequest
     * @return KillProcessResponse
     */
    CompletableFuture<KillProcessResponse> killProcess(KillProcessRequest request);

    /**
     * @param request the request parameters of ModifyAccountAuthority  ModifyAccountAuthorityRequest
     * @return ModifyAccountAuthorityResponse
     */
    CompletableFuture<ModifyAccountAuthorityResponse> modifyAccountAuthority(ModifyAccountAuthorityRequest request);

    /**
     * @param request the request parameters of ModifyAccountDescription  ModifyAccountDescriptionRequest
     * @return ModifyAccountDescriptionResponse
     */
    CompletableFuture<ModifyAccountDescriptionResponse> modifyAccountDescription(ModifyAccountDescriptionRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> This operation is available only for the ApsaraDB for ClickHouse clusters of versions 20.3, 20.8, and 21.8.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyBackupPolicy  ModifyBackupPolicyRequest
     * @return ModifyBackupPolicyResponse
     */
    CompletableFuture<ModifyBackupPolicyResponse> modifyBackupPolicy(ModifyBackupPolicyRequest request);

    /**
     * @param request the request parameters of ModifyDBCluster  ModifyDBClusterRequest
     * @return ModifyDBClusterResponse
     */
    CompletableFuture<ModifyDBClusterResponse> modifyDBCluster(ModifyDBClusterRequest request);

    /**
     * @param request the request parameters of ModifyDBClusterAccessWhiteList  ModifyDBClusterAccessWhiteListRequest
     * @return ModifyDBClusterAccessWhiteListResponse
     */
    CompletableFuture<ModifyDBClusterAccessWhiteListResponse> modifyDBClusterAccessWhiteList(ModifyDBClusterAccessWhiteListRequest request);

    /**
     * @param request the request parameters of ModifyDBClusterConfig  ModifyDBClusterConfigRequest
     * @return ModifyDBClusterConfigResponse
     */
    CompletableFuture<ModifyDBClusterConfigResponse> modifyDBClusterConfig(ModifyDBClusterConfigRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this operation only for ApsaraDB for ClickHouse clusters that were created after December 1, 2021.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyDBClusterConfigInXML  ModifyDBClusterConfigInXMLRequest
     * @return ModifyDBClusterConfigInXMLResponse
     */
    CompletableFuture<ModifyDBClusterConfigInXMLResponse> modifyDBClusterConfigInXML(ModifyDBClusterConfigInXMLRequest request);

    /**
     * @param request the request parameters of ModifyDBClusterDescription  ModifyDBClusterDescriptionRequest
     * @return ModifyDBClusterDescriptionResponse
     */
    CompletableFuture<ModifyDBClusterDescriptionResponse> modifyDBClusterDescription(ModifyDBClusterDescriptionRequest request);

    /**
     * @param request the request parameters of ModifyDBClusterMaintainTime  ModifyDBClusterMaintainTimeRequest
     * @return ModifyDBClusterMaintainTimeResponse
     */
    CompletableFuture<ModifyDBClusterMaintainTimeResponse> modifyDBClusterMaintainTime(ModifyDBClusterMaintainTimeRequest request);

    /**
     * @param request the request parameters of ModifyDBConfig  ModifyDBConfigRequest
     * @return ModifyDBConfigResponse
     */
    CompletableFuture<ModifyDBConfigResponse> modifyDBConfig(ModifyDBConfigRequest request);

    /**
     * @param request the request parameters of ModifyMinorVersionGreadeType  ModifyMinorVersionGreadeTypeRequest
     * @return ModifyMinorVersionGreadeTypeResponse
     */
    CompletableFuture<ModifyMinorVersionGreadeTypeResponse> modifyMinorVersionGreadeType(ModifyMinorVersionGreadeTypeRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> This operation is applicable only to ApsaraDB for ClickHouse clusters.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyRDSToClickhouseDb  ModifyRDSToClickhouseDbRequest
     * @return ModifyRDSToClickhouseDbResponse
     */
    CompletableFuture<ModifyRDSToClickhouseDbResponse> modifyRDSToClickhouseDb(ModifyRDSToClickhouseDbRequest request);

    /**
     * @param request the request parameters of ReleaseClusterPublicConnection  ReleaseClusterPublicConnectionRequest
     * @return ReleaseClusterPublicConnectionResponse
     */
    CompletableFuture<ReleaseClusterPublicConnectionResponse> releaseClusterPublicConnection(ReleaseClusterPublicConnectionRequest request);

    /**
     * @param request the request parameters of ResetAccountPassword  ResetAccountPasswordRequest
     * @return ResetAccountPasswordResponse
     */
    CompletableFuture<ResetAccountPasswordResponse> resetAccountPassword(ResetAccountPasswordRequest request);

    /**
     * @param request the request parameters of RestartInstance  RestartInstanceRequest
     * @return RestartInstanceResponse
     */
    CompletableFuture<RestartInstanceResponse> restartInstance(RestartInstanceRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Prerequisites</h2>
     * <ul>
     * <li>The IP address of the source ApsaraDB for ClickHouse cluster is added to the IP address whitelist of the destination ApsaraDB for ClickHouse cluster.</li>
     * <li>The IP address of the destination ApsaraDB for ClickHouse cluster is added to the IP address whitelist of the source ApsaraDB for ClickHouse cluster.<blockquote>
     * <p> You can execute the <code>select * from system.clusters;</code> statement to query the IP address of an ApsaraDB for ClickHouse cluster.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of TransferVersion  TransferVersionRequest
     * @return TransferVersionResponse
     */
    CompletableFuture<TransferVersionResponse> transferVersion(TransferVersionRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this operation only for ApsaraDB for ClickHouse clusters that were purchased after December 1, 2021.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpgradeMinorVersion  UpgradeMinorVersionRequest
     * @return UpgradeMinorVersionResponse
     */
    CompletableFuture<UpgradeMinorVersionResponse> upgradeMinorVersion(UpgradeMinorVersionRequest request);

}
