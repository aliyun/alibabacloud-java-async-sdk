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
     * @param request the request parameters of CancelActiveOperationTasks  CancelActiveOperationTasksRequest
     * @return CancelActiveOperationTasksResponse
     */
    CompletableFuture<CancelActiveOperationTasksResponse> cancelActiveOperationTasks(CancelActiveOperationTasksRequest request);

    /**
     * @param request the request parameters of CancelAppointmentElectZookeeperLeader  CancelAppointmentElectZookeeperLeaderRequest
     * @return CancelAppointmentElectZookeeperLeaderResponse
     */
    CompletableFuture<CancelAppointmentElectZookeeperLeaderResponse> cancelAppointmentElectZookeeperLeader(CancelAppointmentElectZookeeperLeaderRequest request);

    /**
     * @param request the request parameters of CancelAppointmentRestartInstanceNodeList  CancelAppointmentRestartInstanceNodeListRequest
     * @return CancelAppointmentRestartInstanceNodeListResponse
     */
    CompletableFuture<CancelAppointmentRestartInstanceNodeListResponse> cancelAppointmentRestartInstanceNodeList(CancelAppointmentRestartInstanceNodeListRequest request);

    /**
     * @param request the request parameters of CancelRestartInstance  CancelRestartInstanceRequest
     * @return CancelRestartInstanceResponse
     */
    CompletableFuture<CancelRestartInstanceResponse> cancelRestartInstance(CancelRestartInstanceRequest request);

    /**
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
     * @param request the request parameters of CheckClickhouseToRDS  CheckClickhouseToRDSRequest
     * @return CheckClickhouseToRDSResponse
     */
    CompletableFuture<CheckClickhouseToRDSResponse> checkClickhouseToRDS(CheckClickhouseToRDSRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is supported only for Community-compatible clusters created after December 1, 2021.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CheckModifyConfigNeedRestart  CheckModifyConfigNeedRestartRequest
     * @return CheckModifyConfigNeedRestartResponse
     */
    CompletableFuture<CheckModifyConfigNeedRestartResponse> checkModifyConfigNeedRestart(CheckModifyConfigNeedRestartRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is applicable only to Community-compatible clusters of version 20.8 or later that were created after December 1, 2021.</p>
     * </blockquote>
     * 
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
     * <b>description</b> :
     * <p>This operation is applicable only to version 21.8 and earlier. For versions later than 21.8, you must use a privileged account to execute SQL statements to modify the permissions of a standard user.</p>
     * 
     * @param request the request parameters of CreateAccountAndAuthority  CreateAccountAndAuthorityRequest
     * @return CreateAccountAndAuthorityResponse
     */
    CompletableFuture<CreateAccountAndAuthorityResponse> createAccountAndAuthority(CreateAccountAndAuthorityRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>ApsaraDB for ClickHouse clusters running version 20.3, 20.8, or 21.8 support data backup.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateBackupPolicy  CreateBackupPolicyRequest
     * @return CreateBackupPolicyResponse
     */
    CompletableFuture<CreateBackupPolicyResponse> createBackupPolicy(CreateBackupPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>Make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/167450.html">pricing</a> of ApsaraDB for ClickHouse before you call this operation.</p>
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
     * <p>Only Community-compatible clusters of version 20.8 and later support the tiered storage of hot and cold data feature. For unsupported earlier versions, you can first perform data migration to a cluster of version 20.8 or later before configuring tiered storage of hot and cold data. For more information about how to perform data migration, see <a href="https://help.aliyun.com/document_detail/276926.html">Data migration between ApsaraDB for ClickHouse database instances</a>.</p>
     * 
     * @param request the request parameters of CreateOSSStorage  CreateOSSStorageRequest
     * @return CreateOSSStorageResponse
     */
    CompletableFuture<CreateOSSStorageResponse> createOSSStorage(CreateOSSStorageRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>For Community-compatible Edition clusters of version 20.8 and later that were created before December 1, 2021, you must manually enable the MySQL port. For clusters created on or after this date, the MySQL port is automatically enabled.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreatePortsForClickHouse  CreatePortsForClickHouseRequest
     * @return CreatePortsForClickHouseResponse
     */
    CompletableFuture<CreatePortsForClickHouseResponse> createPortsForClickHouse(CreatePortsForClickHouseRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is applicable only to ApsaraDB for ClickHouse Community-Compatible Edition clusters.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateRDSToClickhouseDb  CreateRDSToClickhouseDbRequest
     * @return CreateRDSToClickhouseDbResponse
     */
    CompletableFuture<CreateRDSToClickhouseDbResponse> createRDSToClickhouseDb(CreateRDSToClickhouseDbRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>SLB is a network-layer dependency. It provides external connection services by binding the IP addresses of ClickHouse nodes to a domain name and supports failover. It evenly forwards cluster requests to internal nodes for multi-node traffic distribution and performs health checks on backend nodes. If a node becomes unavailable, SLB checks the node health status and automatically isolates abnormal nodes to ensure that request traffic is distributed only to available nodes.</p>
     * 
     * @param request the request parameters of CreateSLB  CreateSLBRequest
     * @return CreateSLBResponse
     */
    CompletableFuture<CreateSLBResponse> createSLB(CreateSLBRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is applicable only to Community-compatible clusters of version 20.8 or later that were created after December 1, 2021.</p>
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
     * <p>After you delete a specified database account, you cannot use the account to connect to ApsaraDB for ClickHouse. Proceed with caution.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteAccount  DeleteAccountRequest
     * @return DeleteAccountResponse
     */
    CompletableFuture<DeleteAccountResponse> deleteAccount(DeleteAccountRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Only ApsaraDB for ClickHouse clusters of version 21.8 or later support the data backup feature.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteBackupPolicy  DeleteBackupPolicyRequest
     * @return DeleteBackupPolicyResponse
     */
    CompletableFuture<DeleteBackupPolicyResponse> deleteBackupPolicy(DeleteBackupPolicyRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Warning: After the cluster is deleted, all data in the cluster is deleted and cannot be recovered. Proceed with caution.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteDBCluster  DeleteDBClusterRequest
     * @return DeleteDBClusterResponse
     */
    CompletableFuture<DeleteDBClusterResponse> deleteDBCluster(DeleteDBClusterRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>After the SLB instance is released, simple load balancing is performed directly based on domain names, and the node health check at the request routing layer is no longer available. This may cause normal requests to be routed to unavailable nodes, resulting in read and write failures for some requests.</p>
     * 
     * @param request the request parameters of DeleteSLB  DeleteSLBRequest
     * @return DeleteSLBResponse
     */
    CompletableFuture<DeleteSLBResponse> deleteSLB(DeleteSLBRequest request);

    /**
     * @param request the request parameters of DeleteSyndb  DeleteSyndbRequest
     * @return DeleteSyndbResponse
     */
    CompletableFuture<DeleteSyndbResponse> deleteSyndb(DeleteSyndbRequest request);

    /**
     * <b>description</b> :
     * <p>This operation applies only to version 21.8 and earlier. To modify the permissions of a standard user in versions later than 21.8, use a privileged account to execute SQL statements.</p>
     * 
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
     * @param request the request parameters of DescribeActiveOperationMaintainConf  DescribeActiveOperationMaintainConfRequest
     * @return DescribeActiveOperationMaintainConfResponse
     */
    CompletableFuture<DescribeActiveOperationMaintainConfResponse> describeActiveOperationMaintainConf(DescribeActiveOperationMaintainConfRequest request);

    /**
     * @param request the request parameters of DescribeActiveOperationTasks  DescribeActiveOperationTasksRequest
     * @return DescribeActiveOperationTasksResponse
     */
    CompletableFuture<DescribeActiveOperationTasksResponse> describeActiveOperationTasks(DescribeActiveOperationTasksRequest request);

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
     * @param request the request parameters of DescribeAutoRenewAttribute  DescribeAutoRenewAttributeRequest
     * @return DescribeAutoRenewAttributeResponse
     */
    CompletableFuture<DescribeAutoRenewAttributeResponse> describeAutoRenewAttribute(DescribeAutoRenewAttributeRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>ApsaraDB for ClickHouse clusters of versions 20.3, 20.8, and 21.8 support data backup.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeBackupPolicy  DescribeBackupPolicyRequest
     * @return DescribeBackupPolicyResponse
     */
    CompletableFuture<DescribeBackupPolicyResponse> describeBackupPolicy(DescribeBackupPolicyRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Only ApsaraDB for ClickHouse clusters of version 21.8 and later support the data backup feature.</p>
     * </blockquote>
     * 
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
     * <p>This operation is supported only by Community-compatible Edition clusters created after December 1, 2021.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeConfigHistory  DescribeConfigHistoryRequest
     * @return DescribeConfigHistoryResponse
     */
    CompletableFuture<DescribeConfigHistoryResponse> describeConfigHistory(DescribeConfigHistoryRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is supported only for Community-compatible Edition clusters created after December 1, 2021.</p>
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
     * <p>This operation is supported only for Community-Compatible Edition clusters created after December 1, 2021.</p>
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
     * @param request the request parameters of DescribeDBClusterNodeInfos  DescribeDBClusterNodeInfosRequest
     * @return DescribeDBClusterNodeInfosResponse
     */
    CompletableFuture<DescribeDBClusterNodeInfosResponse> describeDBClusterNodeInfos(DescribeDBClusterNodeInfosRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the performance monitoring data of a specified cluster within a specific time range based on performance metrics. The collection granularity is 30 seconds.</p>
     * <blockquote>
     * <p>This operation is supported only for ApsaraDB for ClickHouse Community-compatible Edition clusters that were created before December 1, 2021.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDBClusterPerformance  DescribeDBClusterPerformanceRequest
     * @return DescribeDBClusterPerformanceResponse
     */
    CompletableFuture<DescribeDBClusterPerformanceResponse> describeDBClusterPerformance(DescribeDBClusterPerformanceRequest request);

    /**
     * @param request the request parameters of DescribeDBClusterStatusSet  DescribeDBClusterStatusSetRequest
     * @return DescribeDBClusterStatusSetResponse
     */
    CompletableFuture<DescribeDBClusterStatusSetResponse> describeDBClusterStatusSet(DescribeDBClusterStatusSetRequest request);

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
     * @param request the request parameters of DescribeEventMetaInfo  DescribeEventMetaInfoRequest
     * @return DescribeEventMetaInfoResponse
     */
    CompletableFuture<DescribeEventMetaInfoResponse> describeEventMetaInfo(DescribeEventMetaInfoRequest request);

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
     * @param request the request parameters of DescribeSlowLogTrend  DescribeSlowLogTrendRequest
     * @return DescribeSlowLogTrendResponse
     */
    CompletableFuture<DescribeSlowLogTrendResponse> describeSlowLogTrend(DescribeSlowLogTrendRequest request);

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
     * <p>This operation can only query data migration information from a lower version to a higher version between ApsaraDB for ClickHouse clusters.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeTransferHistory  DescribeTransferHistoryRequest
     * @return DescribeTransferHistoryResponse
     */
    CompletableFuture<DescribeTransferHistoryResponse> describeTransferHistory(DescribeTransferHistoryRequest request);

    /**
     * @param request the request parameters of DescribeUserEncryptionKeyList  DescribeUserEncryptionKeyListRequest
     * @return DescribeUserEncryptionKeyListResponse
     */
    CompletableFuture<DescribeUserEncryptionKeyListResponse> describeUserEncryptionKeyList(DescribeUserEncryptionKeyListRequest request);

    /**
     * @param request the request parameters of ElectZookeeperLeader  ElectZookeeperLeaderRequest
     * @return ElectZookeeperLeaderResponse
     */
    CompletableFuture<ElectZookeeperLeaderResponse> electZookeeperLeader(ElectZookeeperLeaderRequest request);

    /**
     * @param request the request parameters of KillProcess  KillProcessRequest
     * @return KillProcessResponse
     */
    CompletableFuture<KillProcessResponse> killProcess(KillProcessRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is applicable only to version 21.8 and earlier. To modify the permissions of a standard user in versions later than 21.8, use a privileged account to execute SQL statements.</p>
     * 
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
     * @param request the request parameters of ModifyActiveOperationMaintainConf  ModifyActiveOperationMaintainConfRequest
     * @return ModifyActiveOperationMaintainConfResponse
     */
    CompletableFuture<ModifyActiveOperationMaintainConfResponse> modifyActiveOperationMaintainConf(ModifyActiveOperationMaintainConfRequest request);

    /**
     * @param request the request parameters of ModifyActiveOperationTasks  ModifyActiveOperationTasksRequest
     * @return ModifyActiveOperationTasksResponse
     */
    CompletableFuture<ModifyActiveOperationTasksResponse> modifyActiveOperationTasks(ModifyActiveOperationTasksRequest request);

    /**
     * @param request the request parameters of ModifyAutoRenewAttribute  ModifyAutoRenewAttributeRequest
     * @return ModifyAutoRenewAttributeResponse
     */
    CompletableFuture<ModifyAutoRenewAttributeResponse> modifyAutoRenewAttribute(ModifyAutoRenewAttributeRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>ApsaraDB for ClickHouse clusters running version 20.3, 20.8, or 21.8 support data backup.</p>
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
     * <p>This operation is supported only for Community-compatible Edition clusters created after December 1, 2021.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: This API operation is applicable only to clusters whose kernel version is 20.8 or earlier.</p>
     * </blockquote>
     * 
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
     * <p>This operation is applicable only to ApsaraDB for ClickHouse Community-Compatible Edition clusters.</p>
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
     * @param request the request parameters of RestartInstanceNodeList  RestartInstanceNodeListRequest
     * @return RestartInstanceNodeListResponse
     */
    CompletableFuture<RestartInstanceNodeListResponse> restartInstanceNodeList(RestartInstanceNodeListRequest request);

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * <b>description</b> :
     * <h2>Before you begin</h2>
     * <ul>
     * <li>Add the IP address of the source cluster to the whitelist of the destination cluster.</li>
     * <li>Add the IP address of the destination cluster to the whitelist of the source cluster.<blockquote>
     * <p>You can run the <code>select * from system.clusters;</code> statement to view the IP addresses of an ApsaraDB for ClickHouse cluster.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of TransferVersion  TransferVersionRequest
     * @return TransferVersionResponse
     */
    CompletableFuture<TransferVersionResponse> transferVersion(TransferVersionRequest request);

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Only Community-compatible Edition clusters purchased after December 1, 2021 support minor engine version upgrades.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpgradeMinorVersion  UpgradeMinorVersionRequest
     * @return UpgradeMinorVersionResponse
     */
    CompletableFuture<UpgradeMinorVersionResponse> upgradeMinorVersion(UpgradeMinorVersionRequest request);

}
