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

    /**
     * @param request the request parameters of CancelActiveOperationTasks  CancelActiveOperationTasksRequest
     * @return CancelActiveOperationTasksResponse
     */
    CompletableFuture<CancelActiveOperationTasksResponse> cancelActiveOperationTasks(CancelActiveOperationTasksRequest request);

    /**
     * @param request the request parameters of CancelScheduleTasks  CancelScheduleTasksRequest
     * @return CancelScheduleTasksResponse
     */
    CompletableFuture<CancelScheduleTasksResponse> cancelScheduleTasks(CancelScheduleTasksRequest request);

    /**
     * @param request the request parameters of CheckAccountName  CheckAccountNameRequest
     * @return CheckAccountNameResponse
     */
    CompletableFuture<CheckAccountNameResponse> checkAccountName(CheckAccountNameRequest request);

    /**
     * @param request the request parameters of CheckDBName  CheckDBNameRequest
     * @return CheckDBNameResponse
     */
    CompletableFuture<CheckDBNameResponse> checkDBName(CheckDBNameRequest request);

    /**
     * @param request the request parameters of CheckKMSAuthorized  CheckKMSAuthorizedRequest
     * @return CheckKMSAuthorizedResponse
     */
    CompletableFuture<CheckKMSAuthorizedResponse> checkKMSAuthorized(CheckKMSAuthorizedRequest request);

    /**
     * @param request the request parameters of CheckServiceLinkedRole  CheckServiceLinkedRoleRequest
     * @return CheckServiceLinkedRoleResponse
     */
    CompletableFuture<CheckServiceLinkedRoleResponse> checkServiceLinkedRole(CheckServiceLinkedRoleRequest request);

    /**
     * @param request the request parameters of CloseAITask  CloseAITaskRequest
     * @return CloseAITaskResponse
     */
    CompletableFuture<CloseAITaskResponse> closeAITask(CloseAITaskRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation to cancel the migration task before data migration.</p>
     * <ul>
     * <li>You can call this operation to perform the migration task after data migration.<blockquote>
     * <p>Before you call this operation, ensure that a one-click upgrade task has been created for the cluster. You can call the <a href="https://help.aliyun.com/document_detail/98169.html">CreateDBCluster</a> operation to create an upgrade task. Set the <strong>CreationOption</strong> parameter to <strong>MigrationFromRDS</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/121582.html">Create a PolarDB for MySQL cluster by using the Migration from RDS method</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CloseDBClusterMigration  CloseDBClusterMigrationRequest
     * @return CloseDBClusterMigrationResponse
     */
    CompletableFuture<CloseDBClusterMigrationResponse> closeDBClusterMigration(CloseDBClusterMigrationRequest request);

    /**
     * @param request the request parameters of CreateAccount  CreateAccountRequest
     * @return CreateAccountResponse
     */
    CompletableFuture<CreateAccountResponse> createAccount(CreateAccountRequest request);

    /**
     * @param request the request parameters of CreateActivationCode  CreateActivationCodeRequest
     * @return CreateActivationCodeResponse
     */
    CompletableFuture<CreateActivationCodeResponse> createActivationCode(CreateActivationCodeRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>You can manually create up to three backups for each cluster.</li>
     * <li>The <code>Exceeding the daily backup times of this DB cluster</code> error message indicates that three manual backups already exist in your cluster. You must delete existing backups before you call this operation to manually create backups. For more information about how to delete backups, see <a href="https://help.aliyun.com/document_detail/98101.html">Delete backups</a>.</li>
     * <li>After you call this operation, a backup task is created in the backend. The task may be time-consuming if you want to back up large amounts of data.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateBackup  CreateBackupRequest
     * @return CreateBackupResponse
     */
    CompletableFuture<CreateBackupResponse> createBackup(CreateBackupRequest request);

    /**
     * @param request the request parameters of CreateColdStorageInstance  CreateColdStorageInstanceRequest
     * @return CreateColdStorageInstanceResponse
     */
    CompletableFuture<CreateColdStorageInstanceResponse> createColdStorageInstance(CreateColdStorageInstanceRequest request);

    /**
     * @param request the request parameters of CreateDBCluster  CreateDBClusterRequest
     * @return CreateDBClusterResponse
     */
    CompletableFuture<CreateDBClusterResponse> createDBCluster(CreateDBClusterRequest request);

    /**
     * @param request the request parameters of CreateDBClusterEndpoint  CreateDBClusterEndpointRequest
     * @return CreateDBClusterEndpointResponse
     */
    CompletableFuture<CreateDBClusterEndpointResponse> createDBClusterEndpoint(CreateDBClusterEndpointRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can create a public endpoint for the primary endpoint, the default cluster endpoint, or a custom cluster endpoint.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateDBEndpointAddress  CreateDBEndpointAddressRequest
     * @return CreateDBEndpointAddressResponse
     */
    CompletableFuture<CreateDBEndpointAddressResponse> createDBEndpointAddress(CreateDBEndpointAddressRequest request);

    /**
     * <b>description</b> :
     * <p>A database link can be used to connect two PolarDB for PostgreSQL(Compatible with Oracle) clusters, or connect a PolarDB for PostgreSQL(Compatible with Oracle) cluster to a user-created PostgreSQL database that is hosted on an Elastic Compute Service (ECS) instance. You can use database links to query data across clusters.</p>
     * <blockquote>
     * <ul>
     * <li>You can create up to 10 database links for a cluster.</li>
     * <li>Each database link connects a source cluster and a destination cluster.</li>
     * <li>The source cluster and the destination cluster or the destination ECS instance must be located in the same region.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of CreateDBLink  CreateDBLinkRequest
     * @return CreateDBLinkResponse
     */
    CompletableFuture<CreateDBLinkResponse> createDBLink(CreateDBLinkRequest request);

    /**
     * @param request the request parameters of CreateDBNodes  CreateDBNodesRequest
     * @return CreateDBNodesResponse
     */
    CompletableFuture<CreateDBNodesResponse> createDBNodes(CreateDBNodesRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that the following requirements are met:</p>
     * <ul>
     * <li>The cluster is in the Running state.</li>
     * <li>The cluster is unlocked.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateDatabase  CreateDatabaseRequest
     * @return CreateDatabaseResponse
     */
    CompletableFuture<CreateDatabaseResponse> createDatabase(CreateDatabaseRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> A cluster belongs to only one GDN.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateGlobalDatabaseNetwork  CreateGlobalDatabaseNetworkRequest
     * @return CreateGlobalDatabaseNetworkResponse
     */
    CompletableFuture<CreateGlobalDatabaseNetworkResponse> createGlobalDatabaseNetwork(CreateGlobalDatabaseNetworkRequest request);

    /**
     * @param request the request parameters of CreateGlobalSecurityIPGroup  CreateGlobalSecurityIPGroupRequest
     * @return CreateGlobalSecurityIPGroupResponse
     */
    CompletableFuture<CreateGlobalSecurityIPGroupResponse> createGlobalSecurityIPGroup(CreateGlobalSecurityIPGroupRequest request);

    /**
     * @param request the request parameters of CreateOrGetVirtualLicenseOrder  CreateOrGetVirtualLicenseOrderRequest
     * @return CreateOrGetVirtualLicenseOrderResponse
     */
    CompletableFuture<CreateOrGetVirtualLicenseOrderResponse> createOrGetVirtualLicenseOrder(CreateOrGetVirtualLicenseOrderRequest request);

    /**
     * <b>description</b> :
     * <p>You can use parameter templates to manage multiple parameters at a time and apply existing parameters to a PolarDB cluster. For more information, see <a href="https://help.aliyun.com/document_detail/207009.html">Use a parameter template</a>.</p>
     * <blockquote>
     * <p>You can call this operation only on a PolarDB for MySQL cluster.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateParameterGroup  CreateParameterGroupRequest
     * @return CreateParameterGroupResponse
     */
    CompletableFuture<CreateParameterGroupResponse> createParameterGroup(CreateParameterGroupRequest request);

    /**
     * @param request the request parameters of CreateServiceLinkedRole  CreateServiceLinkedRoleRequest
     * @return CreateServiceLinkedRoleResponse
     */
    CompletableFuture<CreateServiceLinkedRoleResponse> createServiceLinkedRole(CreateServiceLinkedRoleRequest request);

    /**
     * @param request the request parameters of CreateStoragePlan  CreateStoragePlanRequest
     * @return CreateStoragePlanResponse
     */
    CompletableFuture<CreateStoragePlanResponse> createStoragePlan(CreateStoragePlanRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Before you call this operation, make sure that the cluster is in the Running state. Otherwise, the operation fails.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteAccount  DeleteAccountRequest
     * @return DeleteAccountResponse
     */
    CompletableFuture<DeleteAccountResponse> deleteAccount(DeleteAccountRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that the cluster meets the following requirements:</p>
     * <ul>
     * <li>The cluster is in the Running state.</li>
     * <li>The backup sets are in the Success state.<blockquote>
     * <ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/98102.html">DescribeBackups</a> operation to query the status of backup sets.</li>
     * <li>After you delete the backup set file, the storage space that is occupied by the file is released. The released storage space is smaller than the size of the file because your snapshots share some data blocks</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteBackup  DeleteBackupRequest
     * @return DeleteBackupResponse
     */
    CompletableFuture<DeleteBackupResponse> deleteBackup(DeleteBackupRequest request);

    /**
     * @param request the request parameters of DeleteDBCluster  DeleteDBClusterRequest
     * @return DeleteDBClusterResponse
     */
    CompletableFuture<DeleteDBClusterResponse> deleteDBCluster(DeleteDBClusterRequest request);

    /**
     * @param request the request parameters of DeleteDBClusterEndpoint  DeleteDBClusterEndpointRequest
     * @return DeleteDBClusterEndpointResponse
     */
    CompletableFuture<DeleteDBClusterEndpointResponse> deleteDBClusterEndpoint(DeleteDBClusterEndpointRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>You can delete a public-facing or classic network endpoint of the primary endpoint, the default cluster endpoint, or a custom cluster endpoint.</li>
     * <li>Classic network endpoints are supported only on the China site (aliyun.com). Therefore, you do not need to delete classic network endpoints on the International site (alibabacloud.com).</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteDBEndpointAddress  DeleteDBEndpointAddressRequest
     * @return DeleteDBEndpointAddressResponse
     */
    CompletableFuture<DeleteDBEndpointAddressResponse> deleteDBEndpointAddress(DeleteDBEndpointAddressRequest request);

    /**
     * @param request the request parameters of DeleteDBLink  DeleteDBLinkRequest
     * @return DeleteDBLinkResponse
     */
    CompletableFuture<DeleteDBLinkResponse> deleteDBLink(DeleteDBLinkRequest request);

    /**
     * @param request the request parameters of DeleteDBNodes  DeleteDBNodesRequest
     * @return DeleteDBNodesResponse
     */
    CompletableFuture<DeleteDBNodesResponse> deleteDBNodes(DeleteDBNodesRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>The cluster must be in the Running state and unlocked. Otherwise, the specified database cannot be deleted.</li>
     * <li>The delete operation is performed in an asynchronous manner. A long period of time may be required to delete a large database. A success response for this operation only indicates that the request to delete the database is sent. You must query the database to check whether the database is deleted.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteDatabase  DeleteDatabaseRequest
     * @return DeleteDatabaseResponse
     */
    CompletableFuture<DeleteDatabaseResponse> deleteDatabase(DeleteDatabaseRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can delete a GDN only when the GDN includes only a primary cluster.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteGlobalDatabaseNetwork  DeleteGlobalDatabaseNetworkRequest
     * @return DeleteGlobalDatabaseNetworkResponse
     */
    CompletableFuture<DeleteGlobalDatabaseNetworkResponse> deleteGlobalDatabaseNetwork(DeleteGlobalDatabaseNetworkRequest request);

    /**
     * @param request the request parameters of DeleteGlobalSecurityIPGroup  DeleteGlobalSecurityIPGroupRequest
     * @return DeleteGlobalSecurityIPGroupResponse
     */
    CompletableFuture<DeleteGlobalSecurityIPGroupResponse> deleteGlobalSecurityIPGroup(DeleteGlobalSecurityIPGroupRequest request);

    /**
     * @param request the request parameters of DeleteMaskingRules  DeleteMaskingRulesRequest
     * @return DeleteMaskingRulesResponse
     */
    CompletableFuture<DeleteMaskingRulesResponse> deleteMaskingRules(DeleteMaskingRulesRequest request);

    /**
     * <b>description</b> :
     * <p>You can use parameter templates to manage multiple parameters at a time and quickly apply existing parameters to a PolarDB cluster. For more information, see <a href="https://help.aliyun.com/document_detail/207009.html">Use a parameter template</a>.</p>
     * <blockquote>
     * <p> When you delete a parameter template, the parameter settings that are applied to PolarDB clusters are not affected.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteParameterGroup  DeleteParameterGroupRequest
     * @return DeleteParameterGroupResponse
     */
    CompletableFuture<DeleteParameterGroupResponse> deleteParameterGroup(DeleteParameterGroupRequest request);

    /**
     * @param request the request parameters of DescribeAITaskStatus  DescribeAITaskStatusRequest
     * @return DescribeAITaskStatusResponse
     */
    CompletableFuture<DescribeAITaskStatusResponse> describeAITaskStatus(DescribeAITaskStatusRequest request);

    /**
     * @param request the request parameters of DescribeAccounts  DescribeAccountsRequest
     * @return DescribeAccountsResponse
     */
    CompletableFuture<DescribeAccountsResponse> describeAccounts(DescribeAccountsRequest request);

    /**
     * @param request the request parameters of DescribeActivationCodeDetails  DescribeActivationCodeDetailsRequest
     * @return DescribeActivationCodeDetailsResponse
     */
    CompletableFuture<DescribeActivationCodeDetailsResponse> describeActivationCodeDetails(DescribeActivationCodeDetailsRequest request);

    /**
     * @param request the request parameters of DescribeActivationCodes  DescribeActivationCodesRequest
     * @return DescribeActivationCodesResponse
     */
    CompletableFuture<DescribeActivationCodesResponse> describeActivationCodes(DescribeActivationCodesRequest request);

    /**
     * @param request the request parameters of DescribeActiveOperationTasks  DescribeActiveOperationTasksRequest
     * @return DescribeActiveOperationTasksResponse
     */
    CompletableFuture<DescribeActiveOperationTasksResponse> describeActiveOperationTasks(DescribeActiveOperationTasksRequest request);

    /**
     * @param request the request parameters of DescribeAutoRenewAttribute  DescribeAutoRenewAttributeRequest
     * @return DescribeAutoRenewAttributeResponse
     */
    CompletableFuture<DescribeAutoRenewAttributeResponse> describeAutoRenewAttribute(DescribeAutoRenewAttributeRequest request);

    /**
     * @param request the request parameters of DescribeBackupLogs  DescribeBackupLogsRequest
     * @return DescribeBackupLogsResponse
     */
    CompletableFuture<DescribeBackupLogsResponse> describeBackupLogs(DescribeBackupLogsRequest request);

    /**
     * @param request the request parameters of DescribeBackupPolicy  DescribeBackupPolicyRequest
     * @return DescribeBackupPolicyResponse
     */
    CompletableFuture<DescribeBackupPolicyResponse> describeBackupPolicy(DescribeBackupPolicyRequest request);

    /**
     * @param request the request parameters of DescribeBackupTasks  DescribeBackupTasksRequest
     * @return DescribeBackupTasksResponse
     */
    CompletableFuture<DescribeBackupTasksResponse> describeBackupTasks(DescribeBackupTasksRequest request);

    /**
     * @param request the request parameters of DescribeBackups  DescribeBackupsRequest
     * @return DescribeBackupsResponse
     */
    CompletableFuture<DescribeBackupsResponse> describeBackups(DescribeBackupsRequest request);

    /**
     * @param request the request parameters of DescribeCharacterSetName  DescribeCharacterSetNameRequest
     * @return DescribeCharacterSetNameResponse
     */
    CompletableFuture<DescribeCharacterSetNameResponse> describeCharacterSetName(DescribeCharacterSetNameRequest request);

    /**
     * @param request the request parameters of DescribeClassList  DescribeClassListRequest
     * @return DescribeClassListResponse
     */
    CompletableFuture<DescribeClassListResponse> describeClassList(DescribeClassListRequest request);

    /**
     * @param request the request parameters of DescribeDBClusterAccessWhitelist  DescribeDBClusterAccessWhitelistRequest
     * @return DescribeDBClusterAccessWhitelistResponse
     */
    CompletableFuture<DescribeDBClusterAccessWhitelistResponse> describeDBClusterAccessWhitelist(DescribeDBClusterAccessWhitelistRequest request);

    /**
     * @param request the request parameters of DescribeDBClusterAttribute  DescribeDBClusterAttributeRequest
     * @return DescribeDBClusterAttributeResponse
     */
    CompletableFuture<DescribeDBClusterAttributeResponse> describeDBClusterAttribute(DescribeDBClusterAttributeRequest request);

    /**
     * @param request the request parameters of DescribeDBClusterAuditLogCollector  DescribeDBClusterAuditLogCollectorRequest
     * @return DescribeDBClusterAuditLogCollectorResponse
     */
    CompletableFuture<DescribeDBClusterAuditLogCollectorResponse> describeDBClusterAuditLogCollector(DescribeDBClusterAuditLogCollectorRequest request);

    /**
     * @param request the request parameters of DescribeDBClusterAvailableResources  DescribeDBClusterAvailableResourcesRequest
     * @return DescribeDBClusterAvailableResourcesResponse
     */
    CompletableFuture<DescribeDBClusterAvailableResourcesResponse> describeDBClusterAvailableResources(DescribeDBClusterAvailableResourcesRequest request);

    /**
     * @param request the request parameters of DescribeDBClusterConnectivity  DescribeDBClusterConnectivityRequest
     * @return DescribeDBClusterConnectivityResponse
     */
    CompletableFuture<DescribeDBClusterConnectivityResponse> describeDBClusterConnectivity(DescribeDBClusterConnectivityRequest request);

    /**
     * @param request the request parameters of DescribeDBClusterEndpoints  DescribeDBClusterEndpointsRequest
     * @return DescribeDBClusterEndpointsResponse
     */
    CompletableFuture<DescribeDBClusterEndpointsResponse> describeDBClusterEndpoints(DescribeDBClusterEndpointsRequest request);

    /**
     * <b>description</b> :
     * <p>The ID of the request.</p>
     * 
     * @param request the request parameters of DescribeDBClusterMigration  DescribeDBClusterMigrationRequest
     * @return DescribeDBClusterMigrationResponse
     */
    CompletableFuture<DescribeDBClusterMigrationResponse> describeDBClusterMigration(DescribeDBClusterMigrationRequest request);

    /**
     * @param request the request parameters of DescribeDBClusterMonitor  DescribeDBClusterMonitorRequest
     * @return DescribeDBClusterMonitorResponse
     */
    CompletableFuture<DescribeDBClusterMonitorResponse> describeDBClusterMonitor(DescribeDBClusterMonitorRequest request);

    /**
     * @param request the request parameters of DescribeDBClusterParameters  DescribeDBClusterParametersRequest
     * @return DescribeDBClusterParametersResponse
     */
    CompletableFuture<DescribeDBClusterParametersResponse> describeDBClusterParameters(DescribeDBClusterParametersRequest request);

    /**
     * <b>description</b> :
     * <p>  When the monitoring data is collected every 5 seconds:
     *     *   If the query time range is less than or equal to 1 hour, the data is displayed at intervals of 5 seconds.
     *     *   If the query time range is less than or equal to one day, the data is displayed at intervals of 1 minute.
     *     *   If the query time range is less than or equal to seven days, the data is displayed at intervals of 10 minutes.
     *     *   If the query time range is less than or equal to 30 days, the data is displayed at intervals of 1 hour.
     *     *   When the query time range is greater than 30 days, the data is displayed at intervals of 1 day.</p>
     * <ul>
     * <li>When the monitoring data is collected every 60 seconds:<ul>
     * <li>If the query time range is less than or equal to one day, the data is displayed at intervals of 1 minute.</li>
     * <li>If the query time range is less than or equal to seven days, the data is displayed at intervals of 10 minutes.</li>
     * <li>If the query time range is less than or equal to 30 days, the data is displayed at intervals of 1 hour.</li>
     * <li>When the query time range is greater than 30 days, the data is displayed at intervals of 1 day.<blockquote>
     * <p> By default, the monitoring data is collected once every 60 seconds. You can call the <a href="https://help.aliyun.com/document_detail/159557.html">ModifyDBClusterMonitor</a> operation to set the data collection interval to every 5 seconds.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDBClusterPerformance  DescribeDBClusterPerformanceRequest
     * @return DescribeDBClusterPerformanceResponse
     */
    CompletableFuture<DescribeDBClusterPerformanceResponse> describeDBClusterPerformance(DescribeDBClusterPerformanceRequest request);

    /**
     * @param request the request parameters of DescribeDBClusterSSL  DescribeDBClusterSSLRequest
     * @return DescribeDBClusterSSLResponse
     */
    CompletableFuture<DescribeDBClusterSSLResponse> describeDBClusterSSL(DescribeDBClusterSSLRequest request);

    /**
     * @param request the request parameters of DescribeDBClusterServerlessConf  DescribeDBClusterServerlessConfRequest
     * @return DescribeDBClusterServerlessConfResponse
     */
    CompletableFuture<DescribeDBClusterServerlessConfResponse> describeDBClusterServerlessConf(DescribeDBClusterServerlessConfRequest request);

    /**
     * @param request the request parameters of DescribeDBClusterTDE  DescribeDBClusterTDERequest
     * @return DescribeDBClusterTDEResponse
     */
    CompletableFuture<DescribeDBClusterTDEResponse> describeDBClusterTDE(DescribeDBClusterTDERequest request);

    /**
     * @param request the request parameters of DescribeDBClusterVersion  DescribeDBClusterVersionRequest
     * @return DescribeDBClusterVersionResponse
     */
    CompletableFuture<DescribeDBClusterVersionResponse> describeDBClusterVersion(DescribeDBClusterVersionRequest request);

    /**
     * @param request the request parameters of DescribeDBClusters  DescribeDBClustersRequest
     * @return DescribeDBClustersResponse
     */
    CompletableFuture<DescribeDBClustersResponse> describeDBClusters(DescribeDBClustersRequest request);

    /**
     * @param request the request parameters of DescribeDBClustersWithBackups  DescribeDBClustersWithBackupsRequest
     * @return DescribeDBClustersWithBackupsResponse
     */
    CompletableFuture<DescribeDBClustersWithBackupsResponse> describeDBClustersWithBackups(DescribeDBClustersWithBackupsRequest request);

    /**
     * @param request the request parameters of DescribeDBInitializeVariable  DescribeDBInitializeVariableRequest
     * @return DescribeDBInitializeVariableResponse
     */
    CompletableFuture<DescribeDBInitializeVariableResponse> describeDBInitializeVariable(DescribeDBInitializeVariableRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can query only the database links that use a PolarDB for Oracle cluster as the source.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDBLinks  DescribeDBLinksRequest
     * @return DescribeDBLinksResponse
     */
    CompletableFuture<DescribeDBLinksResponse> describeDBLinks(DescribeDBLinksRequest request);

    /**
     * <b>description</b> :
     * <p>  When the monitoring data is collected every 5 seconds:
     *     *   If the query time range is less than or equal to 1 hour, the data is displayed at intervals of 5 seconds.
     *     *   If the query time range is less than or equal to one day, the data is displayed at intervals of 1 minute.
     *     *   If the query time range is less than or equal to seven days, the data is displayed at intervals of 10 minutes.
     *     *   If the query time range is less than or equal to 30 days, the data is displayed at intervals of 1 hour.
     *     *   When the query time range is greater than 30 days, the data is displayed at intervals of 1 day.</p>
     * <ul>
     * <li>When the monitoring data is collected every 60 seconds:<ul>
     * <li>If the query time range is less than or equal to one day, the data is displayed at intervals of 1 minute.</li>
     * <li>If the query time range is less than or equal to seven days, the data is displayed at intervals of 10 minutes.</li>
     * <li>If the query time range is less than or equal to 30 days, the data is displayed at intervals of 1 hour.</li>
     * <li>When the query time range is greater than 30 days, the data is displayed at intervals of 1 day.<blockquote>
     * <p> By default, the monitoring data is collected once every 60 seconds. You can call the <a href="https://help.aliyun.com/document_detail/159557.html">ModifyDBClusterMonitor</a> operation to set the data collection interval to every 5 seconds.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDBNodePerformance  DescribeDBNodePerformanceRequest
     * @return DescribeDBNodePerformanceResponse
     */
    CompletableFuture<DescribeDBNodePerformanceResponse> describeDBNodePerformance(DescribeDBNodePerformanceRequest request);

    /**
     * @param request the request parameters of DescribeDBNodesParameters  DescribeDBNodesParametersRequest
     * @return DescribeDBNodesParametersResponse
     */
    CompletableFuture<DescribeDBNodesParametersResponse> describeDBNodesParameters(DescribeDBNodesParametersRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is applicable only to PolarDB for MySQL clusters.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDBProxyPerformance  DescribeDBProxyPerformanceRequest
     * @return DescribeDBProxyPerformanceResponse
     */
    CompletableFuture<DescribeDBProxyPerformanceResponse> describeDBProxyPerformance(DescribeDBProxyPerformanceRequest request);

    /**
     * @param request the request parameters of DescribeDasConfig  DescribeDasConfigRequest
     * @return DescribeDasConfigResponse
     */
    CompletableFuture<DescribeDasConfigResponse> describeDasConfig(DescribeDasConfigRequest request);

    /**
     * @param request the request parameters of DescribeDatabases  DescribeDatabasesRequest
     * @return DescribeDatabasesResponse
     */
    CompletableFuture<DescribeDatabasesResponse> describeDatabases(DescribeDatabasesRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that the PolarDB cluster is in the <strong>Released</strong> state. You must also confirm that the <strong>Retain All Backups Permanently</strong> or <strong>Retain Last Automatic Backup Permanently</strong> backup retention policy takes effect after you release the cluster. If you delete all backup sets after the cluster is released, you cannot use this API operation to query the cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/98181.html">DescribeDBClusterAttribute</a> operation to query the cluster status.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDetachedBackups  DescribeDetachedBackupsRequest
     * @return DescribeDetachedBackupsResponse
     */
    CompletableFuture<DescribeDetachedBackupsResponse> describeDetachedBackups(DescribeDetachedBackupsRequest request);

    /**
     * @param request the request parameters of DescribeGlobalDatabaseNetwork  DescribeGlobalDatabaseNetworkRequest
     * @return DescribeGlobalDatabaseNetworkResponse
     */
    CompletableFuture<DescribeGlobalDatabaseNetworkResponse> describeGlobalDatabaseNetwork(DescribeGlobalDatabaseNetworkRequest request);

    /**
     * @param request the request parameters of DescribeGlobalDatabaseNetworks  DescribeGlobalDatabaseNetworksRequest
     * @return DescribeGlobalDatabaseNetworksResponse
     */
    CompletableFuture<DescribeGlobalDatabaseNetworksResponse> describeGlobalDatabaseNetworks(DescribeGlobalDatabaseNetworksRequest request);

    /**
     * @param request the request parameters of DescribeGlobalSecurityIPGroup  DescribeGlobalSecurityIPGroupRequest
     * @return DescribeGlobalSecurityIPGroupResponse
     */
    CompletableFuture<DescribeGlobalSecurityIPGroupResponse> describeGlobalSecurityIPGroup(DescribeGlobalSecurityIPGroupRequest request);

    /**
     * @param request the request parameters of DescribeGlobalSecurityIPGroupRelation  DescribeGlobalSecurityIPGroupRelationRequest
     * @return DescribeGlobalSecurityIPGroupRelationResponse
     */
    CompletableFuture<DescribeGlobalSecurityIPGroupRelationResponse> describeGlobalSecurityIPGroupRelation(DescribeGlobalSecurityIPGroupRelationRequest request);

    /**
     * @param request the request parameters of DescribeLicenseOrderDetails  DescribeLicenseOrderDetailsRequest
     * @return DescribeLicenseOrderDetailsResponse
     */
    CompletableFuture<DescribeLicenseOrderDetailsResponse> describeLicenseOrderDetails(DescribeLicenseOrderDetailsRequest request);

    /**
     * @param request the request parameters of DescribeLicenseOrders  DescribeLicenseOrdersRequest
     * @return DescribeLicenseOrdersResponse
     */
    CompletableFuture<DescribeLicenseOrdersResponse> describeLicenseOrders(DescribeLicenseOrdersRequest request);

    /**
     * @param request the request parameters of DescribeLogBackupPolicy  DescribeLogBackupPolicyRequest
     * @return DescribeLogBackupPolicyResponse
     */
    CompletableFuture<DescribeLogBackupPolicyResponse> describeLogBackupPolicy(DescribeLogBackupPolicyRequest request);

    /**
     * @param request the request parameters of DescribeMaskingRules  DescribeMaskingRulesRequest
     * @return DescribeMaskingRulesResponse
     */
    CompletableFuture<DescribeMaskingRulesResponse> describeMaskingRules(DescribeMaskingRulesRequest request);

    /**
     * @param request the request parameters of DescribeMetaList  DescribeMetaListRequest
     * @return DescribeMetaListResponse
     */
    CompletableFuture<DescribeMetaListResponse> describeMetaList(DescribeMetaListRequest request);

    /**
     * <b>description</b> :
     * <p>You can use parameter templates to manage multiple parameters at a time and apply existing parameters to a PolarDB cluster. For more information, see <a href="https://help.aliyun.com/document_detail/207009.html">Use a parameter template</a>.</p>
     * <blockquote>
     * <p>This parameter is valid only for a PolarDB for MySQL cluster.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeParameterGroup  DescribeParameterGroupRequest
     * @return DescribeParameterGroupResponse
     */
    CompletableFuture<DescribeParameterGroupResponse> describeParameterGroup(DescribeParameterGroupRequest request);

    /**
     * <b>description</b> :
     * <p>You can use parameter templates to manage multiple parameters at a time and apply existing parameters to a PolarDB cluster. For more information, see <a href="https://help.aliyun.com/document_detail/207009.html">Use a parameter template</a>.</p>
     * <blockquote>
     * <p>This operation is applicable only to PolarDB for MySQL clusters.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeParameterGroups  DescribeParameterGroupsRequest
     * @return DescribeParameterGroupsResponse
     */
    CompletableFuture<DescribeParameterGroupsResponse> describeParameterGroups(DescribeParameterGroupsRequest request);

    /**
     * @param request the request parameters of DescribeParameterTemplates  DescribeParameterTemplatesRequest
     * @return DescribeParameterTemplatesResponse
     */
    CompletableFuture<DescribeParameterTemplatesResponse> describeParameterTemplates(DescribeParameterTemplatesRequest request);

    /**
     * @param request the request parameters of DescribePendingMaintenanceAction  DescribePendingMaintenanceActionRequest
     * @return DescribePendingMaintenanceActionResponse
     */
    CompletableFuture<DescribePendingMaintenanceActionResponse> describePendingMaintenanceAction(DescribePendingMaintenanceActionRequest request);

    /**
     * @param request the request parameters of DescribePendingMaintenanceActions  DescribePendingMaintenanceActionsRequest
     * @return DescribePendingMaintenanceActionsResponse
     */
    CompletableFuture<DescribePendingMaintenanceActionsResponse> describePendingMaintenanceActions(DescribePendingMaintenanceActionsRequest request);

    /**
     * @param request the request parameters of DescribePolarSQLCollectorPolicy  DescribePolarSQLCollectorPolicyRequest
     * @return DescribePolarSQLCollectorPolicyResponse
     */
    CompletableFuture<DescribePolarSQLCollectorPolicyResponse> describePolarSQLCollectorPolicy(DescribePolarSQLCollectorPolicyRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * @param request the request parameters of DescribeScheduleTasks  DescribeScheduleTasksRequest
     * @return DescribeScheduleTasksResponse
     */
    CompletableFuture<DescribeScheduleTasksResponse> describeScheduleTasks(DescribeScheduleTasksRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>Only PolarDB MySQL Edition clusters support calling this interface.</li>
     * <li>Starting from September 1, 2024, due to the optimization of the SQL template algorithm, when calling this interface, the value of the SQLHash field will change. For more details, please refer to [Notice] Optimization of Slow SQL Template Algorithm (<del>2845725</del>).</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeSlowLogRecords  DescribeSlowLogRecordsRequest
     * @return DescribeSlowLogRecordsResponse
     */
    CompletableFuture<DescribeSlowLogRecordsResponse> describeSlowLogRecords(DescribeSlowLogRecordsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is applicable only to PolarDB for MySQL clusters.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeSlowLogs  DescribeSlowLogsRequest
     * @return DescribeSlowLogsResponse
     */
    CompletableFuture<DescribeSlowLogsResponse> describeSlowLogs(DescribeSlowLogsRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation to view the details of a task that is generated by a specific API operation or in the PolarDB console. The system calls the specific API operation when you perform an operation in the PolarDB console. For example, you can view the details of the task when you call the <a href="https://help.aliyun.com/document_detail/98169.html">CreateDBCluster</a> operation or <a href="https://help.aliyun.com/document_detail/58769.html">create a cluster</a> in the PolarDB console.</p>
     * <ul>
     * <li>You can view the details of tasks that are generated only when you call the <a href="https://help.aliyun.com/document_detail/98169.html">CreateDBCluster</a> operation to create a cluster and <code>CreationOption</code> is not set to <code>CreateGdnStandby</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeTasks  DescribeTasksRequest
     * @return DescribeTasksResponse
     */
    CompletableFuture<DescribeTasksResponse> describeTasks(DescribeTasksRequest request);

    /**
     * @param request the request parameters of DescribeUserEncryptionKeyList  DescribeUserEncryptionKeyListRequest
     * @return DescribeUserEncryptionKeyListResponse
     */
    CompletableFuture<DescribeUserEncryptionKeyListResponse> describeUserEncryptionKeyList(DescribeUserEncryptionKeyListRequest request);

    /**
     * @param request the request parameters of DescribeVSwitches  DescribeVSwitchesRequest
     * @return DescribeVSwitchesResponse
     */
    CompletableFuture<DescribeVSwitchesResponse> describeVSwitches(DescribeVSwitchesRequest request);

    /**
     * @param request the request parameters of DisableDBClusterServerless  DisableDBClusterServerlessRequest
     * @return DisableDBClusterServerlessResponse
     */
    CompletableFuture<DisableDBClusterServerlessResponse> disableDBClusterServerless(DisableDBClusterServerlessRequest request);

    /**
     * @param request the request parameters of EnableDBClusterServerless  EnableDBClusterServerlessRequest
     * @return EnableDBClusterServerlessResponse
     */
    CompletableFuture<EnableDBClusterServerlessResponse> enableDBClusterServerless(EnableDBClusterServerlessRequest request);

    /**
     * @param request the request parameters of EnableFirewallRules  EnableFirewallRulesRequest
     * @return EnableFirewallRulesResponse
     */
    CompletableFuture<EnableFirewallRulesResponse> enableFirewallRules(EnableFirewallRulesRequest request);

    /**
     * @param request the request parameters of EvaluateRegionResource  EvaluateRegionResourceRequest
     * @return EvaluateRegionResourceResponse
     */
    CompletableFuture<EvaluateRegionResourceResponse> evaluateRegionResource(EvaluateRegionResourceRequest request);

    /**
     * @param request the request parameters of FailoverDBCluster  FailoverDBClusterRequest
     * @return FailoverDBClusterResponse
     */
    CompletableFuture<FailoverDBClusterResponse> failoverDBCluster(FailoverDBClusterRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>An account can be authorized to access one or more databases.</li>
     * <li>If the specified account already has the access permissions on the specified databases, the operation returns a successful response.</li>
     * <li>Before you call this operation, make sure that the cluster is in the Running state. Otherwise, the operation fails.</li>
     * <li>You can call this operation only on a PolarDB for MySQL cluster.</li>
     * <li>By default, a privileged account for a cluster has all the permissions on the databases in the cluster.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of GrantAccountPrivilege  GrantAccountPrivilegeRequest
     * @return GrantAccountPrivilegeResponse
     */
    CompletableFuture<GrantAccountPrivilegeResponse> grantAccountPrivilege(GrantAccountPrivilegeRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of ManuallyStartDBCluster  ManuallyStartDBClusterRequest
     * @return ManuallyStartDBClusterResponse
     */
    CompletableFuture<ManuallyStartDBClusterResponse> manuallyStartDBCluster(ManuallyStartDBClusterRequest request);

    /**
     * @param request the request parameters of ModifyAccountDescription  ModifyAccountDescriptionRequest
     * @return ModifyAccountDescriptionResponse
     */
    CompletableFuture<ModifyAccountDescriptionResponse> modifyAccountDescription(ModifyAccountDescriptionRequest request);

    /**
     * @param request the request parameters of ModifyAccountPassword  ModifyAccountPasswordRequest
     * @return ModifyAccountPasswordResponse
     */
    CompletableFuture<ModifyAccountPasswordResponse> modifyAccountPassword(ModifyAccountPasswordRequest request);

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
     * <p>You can also modify the automatic backup policy of a PolarDB cluster in the console. For more information, see <a href="https://help.aliyun.com/document_detail/280422.html">Backup settings</a>.</p>
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
     * @param request the request parameters of ModifyDBClusterAccessWhitelist  ModifyDBClusterAccessWhitelistRequest
     * @return ModifyDBClusterAccessWhitelistResponse
     */
    CompletableFuture<ModifyDBClusterAccessWhitelistResponse> modifyDBClusterAccessWhitelist(ModifyDBClusterAccessWhitelistRequest request);

    /**
     * @param request the request parameters of ModifyDBClusterAndNodesParameters  ModifyDBClusterAndNodesParametersRequest
     * @return ModifyDBClusterAndNodesParametersResponse
     */
    CompletableFuture<ModifyDBClusterAndNodesParametersResponse> modifyDBClusterAndNodesParameters(ModifyDBClusterAndNodesParametersRequest request);

    /**
     * @param request the request parameters of ModifyDBClusterAuditLogCollector  ModifyDBClusterAuditLogCollectorRequest
     * @return ModifyDBClusterAuditLogCollectorResponse
     */
    CompletableFuture<ModifyDBClusterAuditLogCollectorResponse> modifyDBClusterAuditLogCollector(ModifyDBClusterAuditLogCollectorRequest request);

    /**
     * @param request the request parameters of ModifyDBClusterDeletion  ModifyDBClusterDeletionRequest
     * @return ModifyDBClusterDeletionResponse
     */
    CompletableFuture<ModifyDBClusterDeletionResponse> modifyDBClusterDeletion(ModifyDBClusterDeletionRequest request);

    /**
     * @param request the request parameters of ModifyDBClusterDescription  ModifyDBClusterDescriptionRequest
     * @return ModifyDBClusterDescriptionResponse
     */
    CompletableFuture<ModifyDBClusterDescriptionResponse> modifyDBClusterDescription(ModifyDBClusterDescriptionRequest request);

    /**
     * @param request the request parameters of ModifyDBClusterEndpoint  ModifyDBClusterEndpointRequest
     * @return ModifyDBClusterEndpointResponse
     */
    CompletableFuture<ModifyDBClusterEndpointResponse> modifyDBClusterEndpoint(ModifyDBClusterEndpointRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> We recommend that you set the routine maintenance window to off-peak hours. Alibaba Cloud maintains your cluster within the specified maintenance window to minimize the negative impacts on your business.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyDBClusterMaintainTime  ModifyDBClusterMaintainTimeRequest
     * @return ModifyDBClusterMaintainTimeResponse
     */
    CompletableFuture<ModifyDBClusterMaintainTimeResponse> modifyDBClusterMaintainTime(ModifyDBClusterMaintainTimeRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation to switch the task that migrates data from ApsaraDB for RDS to PolarDB.</p>
     * <ul>
     * <li>You can call this operation to roll back the task that migrates data from ApsaraDB for RDS to PolarDB.<blockquote>
     * <p>Before you call this operation, ensure that a one-click upgrade task has been created for the cluster. You can call the <a href="https://help.aliyun.com/document_detail/98169.html">CreateDBCluster</a> operation to create an upgrade task. Set the <strong>CreationOption</strong> parameter to <strong>MigrationFromRDS</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/121582.html">Create a PolarDB for MySQL cluster by using the Migration from RDS method</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBClusterMigration  ModifyDBClusterMigrationRequest
     * @return ModifyDBClusterMigrationResponse
     */
    CompletableFuture<ModifyDBClusterMigrationResponse> modifyDBClusterMigration(ModifyDBClusterMigrationRequest request);

    /**
     * <b>description</b> :
     * <p>  When the monitoring data is collected every 5 seconds:
     *     *   If the query time range is less than or equal to 1 hour, the data is displayed at intervals of 5 seconds.
     *     *   If the query time range is less than or equal to one day, the data is displayed at intervals of 1 minute.
     *     *   If the query time range is less than or equal to seven days, the data is displayed at intervals of 10 minutes.
     *     *   If the query time range is less than or equal to 30 days, the data is displayed at intervals of 1 hour.
     *     *   When the query time range is greater than 30 days, the data is displayed at intervals of 1 day.</p>
     * <ul>
     * <li>When the monitoring data is collected every 60 seconds:<ul>
     * <li>If the query time range is less than or equal to one day, the data is displayed at intervals of 1 minute.</li>
     * <li>If the query time range is less than or equal to seven days, the data is displayed at intervals of 10 minutes.</li>
     * <li>If the query time range is less than or equal to 30 days, the data is displayed at intervals of 1 hour.</li>
     * <li>When the query time range is greater than 30 days, the data is displayed at intervals of 1 day.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBClusterMonitor  ModifyDBClusterMonitorRequest
     * @return ModifyDBClusterMonitorResponse
     */
    CompletableFuture<ModifyDBClusterMonitorResponse> modifyDBClusterMonitor(ModifyDBClusterMonitorRequest request);

    /**
     * <b>description</b> :
     * <p>PolarDB supports the parameter template feature to centrally manage clusters. You can configure a number of parameters at a time by using a parameter template and apply the template to a PolarDB cluster. For more information, see <a href="https://help.aliyun.com/document_detail/207009.html">Use a parameter template</a>.
     * **
     * **Only PolarDB for MySQL clusters support parameter templates.</p>
     * 
     * @param request the request parameters of ModifyDBClusterParameters  ModifyDBClusterParametersRequest
     * @return ModifyDBClusterParametersResponse
     */
    CompletableFuture<ModifyDBClusterParametersResponse> modifyDBClusterParameters(ModifyDBClusterParametersRequest request);

    /**
     * @param request the request parameters of ModifyDBClusterPrimaryZone  ModifyDBClusterPrimaryZoneRequest
     * @return ModifyDBClusterPrimaryZoneResponse
     */
    CompletableFuture<ModifyDBClusterPrimaryZoneResponse> modifyDBClusterPrimaryZone(ModifyDBClusterPrimaryZoneRequest request);

    /**
     * @param request the request parameters of ModifyDBClusterResourceGroup  ModifyDBClusterResourceGroupRequest
     * @return ModifyDBClusterResourceGroupResponse
     */
    CompletableFuture<ModifyDBClusterResourceGroupResponse> modifyDBClusterResourceGroup(ModifyDBClusterResourceGroupRequest request);

    /**
     * @param request the request parameters of ModifyDBClusterSSL  ModifyDBClusterSSLRequest
     * @return ModifyDBClusterSSLResponse
     */
    CompletableFuture<ModifyDBClusterSSLResponse> modifyDBClusterSSL(ModifyDBClusterSSLRequest request);

    /**
     * @param request the request parameters of ModifyDBClusterServerlessConf  ModifyDBClusterServerlessConfRequest
     * @return ModifyDBClusterServerlessConfResponse
     */
    CompletableFuture<ModifyDBClusterServerlessConfResponse> modifyDBClusterServerlessConf(ModifyDBClusterServerlessConfRequest request);

    /**
     * @param request the request parameters of ModifyDBClusterStorageSpace  ModifyDBClusterStorageSpaceRequest
     * @return ModifyDBClusterStorageSpaceResponse
     */
    CompletableFuture<ModifyDBClusterStorageSpaceResponse> modifyDBClusterStorageSpace(ModifyDBClusterStorageSpaceRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>To perform this operation, you must activate KMS first. For more information, see <a href="https://help.aliyun.com/document_detail/153781.html">Purchase a dedicated KMS instance</a>.</li>
     * <li>After TDE is enabled, you cannot disable TDE.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyDBClusterTDE  ModifyDBClusterTDERequest
     * @return ModifyDBClusterTDEResponse
     */
    CompletableFuture<ModifyDBClusterTDEResponse> modifyDBClusterTDE(ModifyDBClusterTDERequest request);

    /**
     * @param request the request parameters of ModifyDBDescription  ModifyDBDescriptionRequest
     * @return ModifyDBDescriptionResponse
     */
    CompletableFuture<ModifyDBDescriptionResponse> modifyDBDescription(ModifyDBDescriptionRequest request);

    /**
     * @param request the request parameters of ModifyDBEndpointAddress  ModifyDBEndpointAddressRequest
     * @return ModifyDBEndpointAddressResponse
     */
    CompletableFuture<ModifyDBEndpointAddressResponse> modifyDBEndpointAddress(ModifyDBEndpointAddressRequest request);

    /**
     * @param request the request parameters of ModifyDBNodeClass  ModifyDBNodeClassRequest
     * @return ModifyDBNodeClassResponse
     */
    CompletableFuture<ModifyDBNodeClassResponse> modifyDBNodeClass(ModifyDBNodeClassRequest request);

    /**
     * @param request the request parameters of ModifyDBNodeHotReplicaMode  ModifyDBNodeHotReplicaModeRequest
     * @return ModifyDBNodeHotReplicaModeResponse
     */
    CompletableFuture<ModifyDBNodeHotReplicaModeResponse> modifyDBNodeHotReplicaMode(ModifyDBNodeHotReplicaModeRequest request);

    /**
     * @param request the request parameters of ModifyDBNodesClass  ModifyDBNodesClassRequest
     * @return ModifyDBNodesClassResponse
     */
    CompletableFuture<ModifyDBNodesClassResponse> modifyDBNodesClass(ModifyDBNodesClassRequest request);

    /**
     * @param request the request parameters of ModifyDBNodesParameters  ModifyDBNodesParametersRequest
     * @return ModifyDBNodesParametersResponse
     */
    CompletableFuture<ModifyDBNodesParametersResponse> modifyDBNodesParameters(ModifyDBNodesParametersRequest request);

    /**
     * @param request the request parameters of ModifyGlobalDatabaseNetwork  ModifyGlobalDatabaseNetworkRequest
     * @return ModifyGlobalDatabaseNetworkResponse
     */
    CompletableFuture<ModifyGlobalDatabaseNetworkResponse> modifyGlobalDatabaseNetwork(ModifyGlobalDatabaseNetworkRequest request);

    /**
     * @param request the request parameters of ModifyGlobalSecurityIPGroup  ModifyGlobalSecurityIPGroupRequest
     * @return ModifyGlobalSecurityIPGroupResponse
     */
    CompletableFuture<ModifyGlobalSecurityIPGroupResponse> modifyGlobalSecurityIPGroup(ModifyGlobalSecurityIPGroupRequest request);

    /**
     * @param request the request parameters of ModifyGlobalSecurityIPGroupName  ModifyGlobalSecurityIPGroupNameRequest
     * @return ModifyGlobalSecurityIPGroupNameResponse
     */
    CompletableFuture<ModifyGlobalSecurityIPGroupNameResponse> modifyGlobalSecurityIPGroupName(ModifyGlobalSecurityIPGroupNameRequest request);

    /**
     * @param request the request parameters of ModifyGlobalSecurityIPGroupRelation  ModifyGlobalSecurityIPGroupRelationRequest
     * @return ModifyGlobalSecurityIPGroupRelationResponse
     */
    CompletableFuture<ModifyGlobalSecurityIPGroupRelationResponse> modifyGlobalSecurityIPGroupRelation(ModifyGlobalSecurityIPGroupRelationRequest request);

    /**
     * @param request the request parameters of ModifyLogBackupPolicy  ModifyLogBackupPolicyRequest
     * @return ModifyLogBackupPolicyResponse
     */
    CompletableFuture<ModifyLogBackupPolicyResponse> modifyLogBackupPolicy(ModifyLogBackupPolicyRequest request);

    /**
     * @param request the request parameters of ModifyMaskingRules  ModifyMaskingRulesRequest
     * @return ModifyMaskingRulesResponse
     */
    CompletableFuture<ModifyMaskingRulesResponse> modifyMaskingRules(ModifyMaskingRulesRequest request);

    /**
     * @param request the request parameters of ModifyPendingMaintenanceAction  ModifyPendingMaintenanceActionRequest
     * @return ModifyPendingMaintenanceActionResponse
     */
    CompletableFuture<ModifyPendingMaintenanceActionResponse> modifyPendingMaintenanceAction(ModifyPendingMaintenanceActionRequest request);

    /**
     * @param request the request parameters of OpenAITask  OpenAITaskRequest
     * @return OpenAITaskResponse
     */
    CompletableFuture<OpenAITaskResponse> openAITask(OpenAITaskRequest request);

    /**
     * @param request the request parameters of RefreshDBClusterStorageUsage  RefreshDBClusterStorageUsageRequest
     * @return RefreshDBClusterStorageUsageResponse
     */
    CompletableFuture<RefreshDBClusterStorageUsageResponse> refreshDBClusterStorageUsage(RefreshDBClusterStorageUsageRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You cannot remove the primary cluster from a GDN.</p>
     * </blockquote>
     * 
     * @param request the request parameters of RemoveDBClusterFromGDN  RemoveDBClusterFromGDNRequest
     * @return RemoveDBClusterFromGDNResponse
     */
    CompletableFuture<RemoveDBClusterFromGDNResponse> removeDBClusterFromGDN(RemoveDBClusterFromGDNRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>Only PolarDB for MySQL clusters support this operation.</li>
     * <li>If the privileged account of your cluster encounters exceptions, you can call this operation to reset the permissions. For example, the permissions are accidentally revoked.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of ResetAccount  ResetAccountRequest
     * @return ResetAccountResponse
     */
    CompletableFuture<ResetAccountResponse> resetAccount(ResetAccountRequest request);

    /**
     * @param request the request parameters of ResetGlobalDatabaseNetwork  ResetGlobalDatabaseNetworkRequest
     * @return ResetGlobalDatabaseNetworkResponse
     */
    CompletableFuture<ResetGlobalDatabaseNetworkResponse> resetGlobalDatabaseNetwork(ResetGlobalDatabaseNetworkRequest request);

    /**
     * @param request the request parameters of RestartDBLink  RestartDBLinkRequest
     * @return RestartDBLinkResponse
     */
    CompletableFuture<RestartDBLinkResponse> restartDBLink(RestartDBLinkRequest request);

    /**
     * @param request the request parameters of RestartDBNode  RestartDBNodeRequest
     * @return RestartDBNodeResponse
     */
    CompletableFuture<RestartDBNodeResponse> restartDBNode(RestartDBNodeRequest request);

    /**
     * @param request the request parameters of RestoreTable  RestoreTableRequest
     * @return RestoreTableResponse
     */
    CompletableFuture<RestoreTableResponse> restoreTable(RestoreTableRequest request);

    /**
     * @param request the request parameters of RevokeAccountPrivilege  RevokeAccountPrivilegeRequest
     * @return RevokeAccountPrivilegeResponse
     */
    CompletableFuture<RevokeAccountPrivilegeResponse> revokeAccountPrivilege(RevokeAccountPrivilegeRequest request);

    /**
     * @param request the request parameters of SwitchOverGlobalDatabaseNetwork  SwitchOverGlobalDatabaseNetworkRequest
     * @return SwitchOverGlobalDatabaseNetworkResponse
     */
    CompletableFuture<SwitchOverGlobalDatabaseNetworkResponse> switchOverGlobalDatabaseNetwork(SwitchOverGlobalDatabaseNetworkRequest request);

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @param request the request parameters of TempModifyDBNode  TempModifyDBNodeRequest
     * @return TempModifyDBNodeResponse
     */
    CompletableFuture<TempModifyDBNodeResponse> tempModifyDBNode(TempModifyDBNodeRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>PolarDB clusters support the subscription and pay-as-you-go billing methods. You can change the billing method from subscription to pay-as-you-go or from pay-as-you-go to subscription based on your business requirements. For more information, see <a href="https://help.aliyun.com/document_detail/172886.html">Change the billing method from subscription to pay-as-you-go</a> and <a href="https://help.aliyun.com/document_detail/84076.html">Change the billing method from pay-as-you-go to subscription</a>.</li>
     * <li>You cannot change the billing method from pay-as-you-go to subscription if your account balance is insufficient.</li>
     * <li>If you change the billing method from subscription to pay-as-you-go, the system automatically refunds the balance of the prepaid subscription fees.</li>
     * </ul>
     * 
     * @param request the request parameters of TransformDBClusterPayType  TransformDBClusterPayTypeRequest
     * @return TransformDBClusterPayTypeResponse
     */
    CompletableFuture<TransformDBClusterPayTypeResponse> transformDBClusterPayType(TransformDBClusterPayTypeRequest request);

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>You can update only the revision version of a PolarDB for MySQL cluster, for example, from 8.0.1.1.3 to 8.0.1.1.4.</li>
     * <li>You can use only your Alibaba Cloud account to create scheduled tasks that update the kernel version of a PolarDB for MySQL cluster. RAM users are not authorized to update the kernel version of a PolarDB for MySQL cluster.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of UpgradeDBClusterVersion  UpgradeDBClusterVersionRequest
     * @return UpgradeDBClusterVersionResponse
     */
    CompletableFuture<UpgradeDBClusterVersionResponse> upgradeDBClusterVersion(UpgradeDBClusterVersionRequest request);

}
