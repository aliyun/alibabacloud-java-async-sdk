// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.adb20190315.models.*;
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
     * @param request the request parameters of ApplyAdviceById  ApplyAdviceByIdRequest
     * @return ApplyAdviceByIdResponse
     */
    CompletableFuture<ApplyAdviceByIdResponse> applyAdviceById(ApplyAdviceByIdRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation only for AnalyticDB for MySQL Data Warehouse Edition (V3.0) clusters in elastic mode for Cluster Edition.</p>
     * 
     * @param request the request parameters of AttachUserENI  AttachUserENIRequest
     * @return AttachUserENIResponse
     */
    CompletableFuture<AttachUserENIResponse> attachUserENI(AttachUserENIRequest request);

    /**
     * @param request the request parameters of BatchApplyAdviceByIdList  BatchApplyAdviceByIdListRequest
     * @return BatchApplyAdviceByIdListResponse
     */
    CompletableFuture<BatchApplyAdviceByIdListResponse> batchApplyAdviceByIdList(BatchApplyAdviceByIdListRequest request);

    /**
     * <b>description</b> :
     * <h2>Precautions</h2>
     * <ul>
     * <li>This operation is applicable only for elastic clusters of 32 cores or more.</li>
     * <li>The default resource group USER_DEFAULT cannot be associated with a database account.</li>
     * </ul>
     * 
     * @param request the request parameters of BindDBResourceGroupWithUser  BindDBResourceGroupWithUserRequest
     * @return BindDBResourceGroupWithUserResponse
     */
    CompletableFuture<BindDBResourceGroupWithUserResponse> bindDBResourceGroupWithUser(BindDBResourceGroupWithUserRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is available only for AnalyticDB for MySQL clusters in elastic mode for Cluster Edition that have 32 cores or more.</p>
     * <ul>
     * <li>The default resource group USER_DEFAULT cannot be associated with a database account.</li>
     * </ul>
     * 
     * @param request the request parameters of BindDBResourcePoolWithUser  BindDBResourcePoolWithUserRequest
     * @return BindDBResourcePoolWithUserResponse
     */
    CompletableFuture<BindDBResourcePoolWithUserResponse> bindDBResourcePoolWithUser(BindDBResourcePoolWithUserRequest request);

    /**
     * @param request the request parameters of CancelActiveOperationTasks  CancelActiveOperationTasksRequest
     * @return CancelActiveOperationTasksResponse
     */
    CompletableFuture<CancelActiveOperationTasksResponse> cancelActiveOperationTasks(CancelActiveOperationTasksRequest request);

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
     * <p>After you create a cluster, you are billed for the cluster specifications that you select. For more information about the billable items and pricing for Data Warehouse Edition  clusters, see <a href="https://help.aliyun.com/document_detail/303131.html">Billable items of Data Warehouse Edition</a> and <a href="https://help.aliyun.com/document_detail/135229.html">Pricing for Data Warehouse Edition</a>.</p>
     * 
     * @param request the request parameters of CreateDBCluster  CreateDBClusterRequest
     * @return CreateDBClusterResponse
     */
    CompletableFuture<CreateDBClusterResponse> createDBCluster(CreateDBClusterRequest request);

    /**
     * <b>description</b> :
     * <h2>Precautions</h2>
     * <p>This operation is applicable only for elastic clusters of 32 cores or more.</p>
     * 
     * @param request the request parameters of CreateDBResourceGroup  CreateDBResourceGroupRequest
     * @return CreateDBResourceGroupResponse
     */
    CompletableFuture<CreateDBResourceGroupResponse> createDBResourceGroup(CreateDBResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is applicable only for elastic clusters of 32 cores or more.</p>
     * 
     * @param request the request parameters of CreateDBResourcePool  CreateDBResourcePoolRequest
     * @return CreateDBResourcePoolResponse
     */
    CompletableFuture<CreateDBResourcePoolResponse> createDBResourcePool(CreateDBResourcePoolRequest request);

    /**
     * <b>description</b> :
     * <h3></h3>
     * <p>You can call this operation only for AnalyticDB for MySQL Data Warehouse Edition (V3.0) clusters in elastic mode for Cluster Edition that have 32 cores or more.</p>
     * 
     * @param request the request parameters of CreateElasticPlan  CreateElasticPlanRequest
     * @return CreateElasticPlanResponse
     */
    CompletableFuture<CreateElasticPlanResponse> createElasticPlan(CreateElasticPlanRequest request);

    /**
     * @param request the request parameters of CreateServiceLinkedRole  CreateServiceLinkedRoleRequest
     * @return CreateServiceLinkedRoleResponse
     */
    CompletableFuture<CreateServiceLinkedRoleResponse> createServiceLinkedRole(CreateServiceLinkedRoleRequest request);

    /**
     * @param request the request parameters of DeleteAccount  DeleteAccountRequest
     * @return DeleteAccountResponse
     */
    CompletableFuture<DeleteAccountResponse> deleteAccount(DeleteAccountRequest request);

    /**
     * <b>description</b> :
     * <p>  Deleting backup sets is an asynchronous operation and may require 10 to 20 minutes to complete.</p>
     * <ul>
     * <li>You can delete up to 100 backup sets at a time. If you want to delete more than 100 backup sets, call this operation twice.</li>
     * <li>To ensure data security, the system forcibly retains one valid backup set. If you want to delete the last backup set, the system prohibits your operation.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteBackups  DeleteBackupsRequest
     * @return DeleteBackupsResponse
     */
    CompletableFuture<DeleteBackupsResponse> deleteBackups(DeleteBackupsRequest request);

    /**
     * <b>description</b> :
     * <p>  You cannot delete subscription clusters by calling API operations. After expiration, subscription clusters are automatically released. If you no longer need a cluster, you can unsubscribe from the cluster in the Expenses and Costs console. For information about cluster refunds, see <a href="https://help.aliyun.com/document_detail/471477.html">Refund policy</a>.</p>
     * <ul>
     * <li>After you delete a cluster, resources of the cluster are immediately released, and data of the cluster is no longer retained and cannot be restored. Proceed with caution.</li>
     * <li>The cluster that you want to delete must be in the Running state.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteDBCluster  DeleteDBClusterRequest
     * @return DeleteDBClusterResponse
     */
    CompletableFuture<DeleteDBClusterResponse> deleteDBCluster(DeleteDBClusterRequest request);

    /**
     * <b>description</b> :
     * <h3>Precautions</h3>
     * <ul>
     * <li>You can call this operation only for AnalyticDB for MySQL clusters in elastic mode for Cluster Edition that have 32 cores or more.</li>
     * <li>The default resource group USER_DEFAULT cannot be deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteDBResourceGroup  DeleteDBResourceGroupRequest
     * @return DeleteDBResourceGroupResponse
     */
    CompletableFuture<DeleteDBResourceGroupResponse> deleteDBResourceGroup(DeleteDBResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <p><em>Precautions</em>*</p>
     * <ul>
     * <li>This operation is available only for AnalyticDB for MySQL clusters in elastic mode for Cluster Edition that have 32 cores or more.</li>
     * <li>The default resource group USER_DEFAULT cannot be deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteDBResourcePool  DeleteDBResourcePoolRequest
     * @return DeleteDBResourcePoolResponse
     */
    CompletableFuture<DeleteDBResourcePoolResponse> deleteDBResourcePool(DeleteDBResourcePoolRequest request);

    /**
     * @param request the request parameters of DeleteElasticPlan  DeleteElasticPlanRequest
     * @return DeleteElasticPlanResponse
     */
    CompletableFuture<DeleteElasticPlanResponse> deleteElasticPlan(DeleteElasticPlanRequest request);

    /**
     * @param request the request parameters of DescribeAbnormalPatternDetection  DescribeAbnormalPatternDetectionRequest
     * @return DescribeAbnormalPatternDetectionResponse
     */
    CompletableFuture<DescribeAbnormalPatternDetectionResponse> describeAbnormalPatternDetection(DescribeAbnormalPatternDetectionRequest request);

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
     * @param request the request parameters of DescribeAdviceServiceEnabled  DescribeAdviceServiceEnabledRequest
     * @return DescribeAdviceServiceEnabledResponse
     */
    CompletableFuture<DescribeAdviceServiceEnabledResponse> describeAdviceServiceEnabled(DescribeAdviceServiceEnabledRequest request);

    /**
     * @param request the request parameters of DescribeAllAccounts  DescribeAllAccountsRequest
     * @return DescribeAllAccountsResponse
     */
    CompletableFuture<DescribeAllAccountsResponse> describeAllAccounts(DescribeAllAccountsRequest request);

    /**
     * @param request the request parameters of DescribeAllDataSource  DescribeAllDataSourceRequest
     * @return DescribeAllDataSourceResponse
     */
    CompletableFuture<DescribeAllDataSourceResponse> describeAllDataSource(DescribeAllDataSourceRequest request);

    /**
     * @param request the request parameters of DescribeAppliedAdvices  DescribeAppliedAdvicesRequest
     * @return DescribeAppliedAdvicesResponse
     */
    CompletableFuture<DescribeAppliedAdvicesResponse> describeAppliedAdvices(DescribeAppliedAdvicesRequest request);

    /**
     * @param request the request parameters of DescribeAuditLogConfig  DescribeAuditLogConfigRequest
     * @return DescribeAuditLogConfigResponse
     */
    CompletableFuture<DescribeAuditLogConfigResponse> describeAuditLogConfig(DescribeAuditLogConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call the DescribeAuditLogRecords operation to query the SQL audit logs of an AnalyticDB for MySQL cluster, you must enable SQL audit for the cluster. You can call the <a href="https://help.aliyun.com/document_detail/190628.html">DescribeAuditLogConfig</a> operation to query the status of SQL audit. If SQL audit is disabled, you can call the <a href="https://help.aliyun.com/document_detail/190629.html">ModifyAuditLogConfig</a> operation to enable SQL audit.
     * SQL audit logs can be queried only when SQL audit is enabled. Only SQL audit logs within the last 30 days can be queried. If SQL audit was disabled and re-enabled, only SQL audit logs from the time when SQL audit was re-enabled can be queried. The following operations are not recorded in SQL audit logs: <strong>INSERT INTO VALUES</strong>, <strong>REPLACE INTO VALUES</strong>, and <strong>UPSERT INTO VALUES</strong>.</p>
     * 
     * @param request the request parameters of DescribeAuditLogRecords  DescribeAuditLogRecordsRequest
     * @return DescribeAuditLogRecordsResponse
     */
    CompletableFuture<DescribeAuditLogRecordsResponse> describeAuditLogRecords(DescribeAuditLogRecordsRequest request);

    /**
     * @param request the request parameters of DescribeAutoRenewAttribute  DescribeAutoRenewAttributeRequest
     * @return DescribeAutoRenewAttributeResponse
     */
    CompletableFuture<DescribeAutoRenewAttributeResponse> describeAutoRenewAttribute(DescribeAutoRenewAttributeRequest request);

    /**
     * @param request the request parameters of DescribeAvailableAdvices  DescribeAvailableAdvicesRequest
     * @return DescribeAvailableAdvicesResponse
     */
    CompletableFuture<DescribeAvailableAdvicesResponse> describeAvailableAdvices(DescribeAvailableAdvicesRequest request);

    /**
     * @param request the request parameters of DescribeAvailableResource  DescribeAvailableResourceRequest
     * @return DescribeAvailableResourceResponse
     */
    CompletableFuture<DescribeAvailableResourceResponse> describeAvailableResource(DescribeAvailableResourceRequest request);

    /**
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
     * @param request the request parameters of DescribeBadSqlDetection  DescribeBadSqlDetectionRequest
     * @return DescribeBadSqlDetectionResponse
     */
    CompletableFuture<DescribeBadSqlDetectionResponse> describeBadSqlDetection(DescribeBadSqlDetectionRequest request);

    /**
     * @param request the request parameters of DescribeColumns  DescribeColumnsRequest
     * @return DescribeColumnsResponse
     */
    CompletableFuture<DescribeColumnsResponse> describeColumns(DescribeColumnsRequest request);

    /**
     * @param request the request parameters of DescribeComputeResource  DescribeComputeResourceRequest
     * @return DescribeComputeResourceResponse
     */
    CompletableFuture<DescribeComputeResourceResponse> describeComputeResource(DescribeComputeResourceRequest request);

    /**
     * @param request the request parameters of DescribeConnectionCountRecords  DescribeConnectionCountRecordsRequest
     * @return DescribeConnectionCountRecordsResponse
     */
    CompletableFuture<DescribeConnectionCountRecordsResponse> describeConnectionCountRecords(DescribeConnectionCountRecordsRequest request);

    /**
     * @param request the request parameters of DescribeControllerDetection  DescribeControllerDetectionRequest
     * @return DescribeControllerDetectionResponse
     */
    CompletableFuture<DescribeControllerDetectionResponse> describeControllerDetection(DescribeControllerDetectionRequest request);

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
     * @param request the request parameters of DescribeDBClusterHealthStatus  DescribeDBClusterHealthStatusRequest
     * @return DescribeDBClusterHealthStatusResponse
     */
    CompletableFuture<DescribeDBClusterHealthStatusResponse> describeDBClusterHealthStatus(DescribeDBClusterHealthStatusRequest request);

    /**
     * @param request the request parameters of DescribeDBClusterNetInfo  DescribeDBClusterNetInfoRequest
     * @return DescribeDBClusterNetInfoResponse
     */
    CompletableFuture<DescribeDBClusterNetInfoResponse> describeDBClusterNetInfo(DescribeDBClusterNetInfoRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the performance data of a cluster over a time range based on its performance metrics. The data is collected every 30 seconds. This operation allows you to query information about slow queries, such as the SQL query duration, number of scanned rows, and amount of scanned data.</p>
     * 
     * @param request the request parameters of DescribeDBClusterPerformance  DescribeDBClusterPerformanceRequest
     * @return DescribeDBClusterPerformanceResponse
     */
    CompletableFuture<DescribeDBClusterPerformanceResponse> describeDBClusterPerformance(DescribeDBClusterPerformanceRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can also view the monitoring information about resource groups within an AnalyticDB for MySQL cluster in elastic mode for Cluster Edition in the form of graphs in the console. For more information, see <a href="https://help.aliyun.com/document_detail/188721.html">View monitoring information</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDBClusterResourcePoolPerformance  DescribeDBClusterResourcePoolPerformanceRequest
     * @return DescribeDBClusterResourcePoolPerformanceResponse
     */
    CompletableFuture<DescribeDBClusterResourcePoolPerformanceResponse> describeDBClusterResourcePoolPerformance(DescribeDBClusterResourcePoolPerformanceRequest request);

    /**
     * @param request the request parameters of DescribeDBClusterSSL  DescribeDBClusterSSLRequest
     * @return DescribeDBClusterSSLResponse
     */
    CompletableFuture<DescribeDBClusterSSLResponse> describeDBClusterSSL(DescribeDBClusterSSLRequest request);

    /**
     * @param request the request parameters of DescribeDBClusterShardNumber  DescribeDBClusterShardNumberRequest
     * @return DescribeDBClusterShardNumberResponse
     */
    CompletableFuture<DescribeDBClusterShardNumberResponse> describeDBClusterShardNumber(DescribeDBClusterShardNumberRequest request);

    /**
     * @param request the request parameters of DescribeDBClusterSpaceSummary  DescribeDBClusterSpaceSummaryRequest
     * @return DescribeDBClusterSpaceSummaryResponse
     */
    CompletableFuture<DescribeDBClusterSpaceSummaryResponse> describeDBClusterSpaceSummary(DescribeDBClusterSpaceSummaryRequest request);

    /**
     * @param request the request parameters of DescribeDBClusterStatus  DescribeDBClusterStatusRequest
     * @return DescribeDBClusterStatusResponse
     */
    CompletableFuture<DescribeDBClusterStatusResponse> describeDBClusterStatus(DescribeDBClusterStatusRequest request);

    /**
     * @param request the request parameters of DescribeDBClusters  DescribeDBClustersRequest
     * @return DescribeDBClustersResponse
     */
    CompletableFuture<DescribeDBClustersResponse> describeDBClusters(DescribeDBClustersRequest request);

    /**
     * <b>description</b> :
     * <h3></h3>
     * <p>You can call this operation only for AnalyticDB for MySQL clusters in elastic mode for Cluster Edition that have 32 cores or more.</p>
     * 
     * @param request the request parameters of DescribeDBResourceGroup  DescribeDBResourceGroupRequest
     * @return DescribeDBResourceGroupResponse
     */
    CompletableFuture<DescribeDBResourceGroupResponse> describeDBResourceGroup(DescribeDBResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is applicable only for elastic clusters of 32 cores or more.</p>
     * 
     * @param request the request parameters of DescribeDBResourcePool  DescribeDBResourcePoolRequest
     * @return DescribeDBResourcePoolResponse
     */
    CompletableFuture<DescribeDBResourcePoolResponse> describeDBResourcePool(DescribeDBResourcePoolRequest request);

    /**
     * @param request the request parameters of DescribeDiagnosisDimensions  DescribeDiagnosisDimensionsRequest
     * @return DescribeDiagnosisDimensionsResponse
     */
    CompletableFuture<DescribeDiagnosisDimensionsResponse> describeDiagnosisDimensions(DescribeDiagnosisDimensionsRequest request);

    /**
     * @param request the request parameters of DescribeDiagnosisMonitorPerformance  DescribeDiagnosisMonitorPerformanceRequest
     * @return DescribeDiagnosisMonitorPerformanceResponse
     */
    CompletableFuture<DescribeDiagnosisMonitorPerformanceResponse> describeDiagnosisMonitorPerformance(DescribeDiagnosisMonitorPerformanceRequest request);

    /**
     * @param request the request parameters of DescribeDiagnosisRecords  DescribeDiagnosisRecordsRequest
     * @return DescribeDiagnosisRecordsResponse
     */
    CompletableFuture<DescribeDiagnosisRecordsResponse> describeDiagnosisRecords(DescribeDiagnosisRecordsRequest request);

    /**
     * @param request the request parameters of DescribeDiagnosisSQLInfo  DescribeDiagnosisSQLInfoRequest
     * @return DescribeDiagnosisSQLInfoResponse
     */
    CompletableFuture<DescribeDiagnosisSQLInfoResponse> describeDiagnosisSQLInfo(DescribeDiagnosisSQLInfoRequest request);

    /**
     * @param request the request parameters of DescribeDiagnosisTasks  DescribeDiagnosisTasksRequest
     * @return DescribeDiagnosisTasksResponse
     */
    CompletableFuture<DescribeDiagnosisTasksResponse> describeDiagnosisTasks(DescribeDiagnosisTasksRequest request);

    /**
     * @param request the request parameters of DescribeDownloadRecords  DescribeDownloadRecordsRequest
     * @return DescribeDownloadRecordsResponse
     */
    CompletableFuture<DescribeDownloadRecordsResponse> describeDownloadRecords(DescribeDownloadRecordsRequest request);

    /**
     * @param request the request parameters of DescribeEIURange  DescribeEIURangeRequest
     * @return DescribeEIURangeResponse
     */
    CompletableFuture<DescribeEIURangeResponse> describeEIURange(DescribeEIURangeRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is available only for AnalyticDB for MySQL Data Warehouse Edition (V3.0) clusters in elastic mode for Cluster Edition that have 32 cores or more.</p>
     * 
     * @param request the request parameters of DescribeElasticDailyPlan  DescribeElasticDailyPlanRequest
     * @return DescribeElasticDailyPlanResponse
     */
    CompletableFuture<DescribeElasticDailyPlanResponse> describeElasticDailyPlan(DescribeElasticDailyPlanRequest request);

    /**
     * <b>description</b> :
     * <h3></h3>
     * <p>You can call this operation only for AnalyticDB for MySQL Data Warehouse Edition (V3.0) clusters in elastic mode for Cluster Edition that have 32 cores or more.</p>
     * 
     * @param request the request parameters of DescribeElasticPlan  DescribeElasticPlanRequest
     * @return DescribeElasticPlanResponse
     */
    CompletableFuture<DescribeElasticPlanResponse> describeElasticPlan(DescribeElasticPlanRequest request);

    /**
     * @param request the request parameters of DescribeExcessivePrimaryKeys  DescribeExcessivePrimaryKeysRequest
     * @return DescribeExcessivePrimaryKeysResponse
     */
    CompletableFuture<DescribeExcessivePrimaryKeysResponse> describeExcessivePrimaryKeys(DescribeExcessivePrimaryKeysRequest request);

    /**
     * @param request the request parameters of DescribeExecutorDetection  DescribeExecutorDetectionRequest
     * @return DescribeExecutorDetectionResponse
     */
    CompletableFuture<DescribeExecutorDetectionResponse> describeExecutorDetection(DescribeExecutorDetectionRequest request);

    /**
     * @param request the request parameters of DescribeHistoryEventsStat  DescribeHistoryEventsStatRequest
     * @return DescribeHistoryEventsStatResponse
     */
    CompletableFuture<DescribeHistoryEventsStatResponse> describeHistoryEventsStat(DescribeHistoryEventsStatRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of DescribeInclinedNodes  DescribeInclinedNodesRequest
     * @return DescribeInclinedNodesResponse
     */
    CompletableFuture<DescribeInclinedNodesResponse> describeInclinedNodes(DescribeInclinedNodesRequest request);

    /**
     * @param request the request parameters of DescribeInclinedTables  DescribeInclinedTablesRequest
     * @return DescribeInclinedTablesResponse
     */
    CompletableFuture<DescribeInclinedTablesResponse> describeInclinedTables(DescribeInclinedTablesRequest request);

    /**
     * @param request the request parameters of DescribeKernelVersion  DescribeKernelVersionRequest
     * @return DescribeKernelVersionResponse
     */
    CompletableFuture<DescribeKernelVersionResponse> describeKernelVersion(DescribeKernelVersionRequest request);

    /**
     * @param request the request parameters of DescribeKmsKeys  DescribeKmsKeysRequest
     * @return DescribeKmsKeysResponse
     */
    CompletableFuture<DescribeKmsKeysResponse> describeKmsKeys(DescribeKmsKeysRequest request);

    /**
     * <b>description</b> :
     * <p>For information about how to asynchronously submit import and export tasks, see <a href="https://help.aliyun.com/document_detail/160291.html">Asynchronously submit an import or export task</a>.</p>
     * 
     * @param request the request parameters of DescribeLoadTasksRecords  DescribeLoadTasksRecordsRequest
     * @return DescribeLoadTasksRecordsResponse
     */
    CompletableFuture<DescribeLoadTasksRecordsResponse> describeLoadTasksRecords(DescribeLoadTasksRecordsRequest request);

    /**
     * @param request the request parameters of DescribeLogHubAttribute  DescribeLogHubAttributeRequest
     * @return DescribeLogHubAttributeResponse
     */
    CompletableFuture<DescribeLogHubAttributeResponse> describeLogHubAttribute(DescribeLogHubAttributeRequest request);

    /**
     * @param request the request parameters of DescribeLogStoreKeys  DescribeLogStoreKeysRequest
     * @return DescribeLogStoreKeysResponse
     */
    CompletableFuture<DescribeLogStoreKeysResponse> describeLogStoreKeys(DescribeLogStoreKeysRequest request);

    /**
     * @param request the request parameters of DescribeLoghubDetail  DescribeLoghubDetailRequest
     * @return DescribeLoghubDetailResponse
     */
    CompletableFuture<DescribeLoghubDetailResponse> describeLoghubDetail(DescribeLoghubDetailRequest request);

    /**
     * @param request the request parameters of DescribeMaintenanceAction  DescribeMaintenanceActionRequest
     * @return DescribeMaintenanceActionResponse
     */
    CompletableFuture<DescribeMaintenanceActionResponse> describeMaintenanceAction(DescribeMaintenanceActionRequest request);

    /**
     * @param request the request parameters of DescribeOperatorPermission  DescribeOperatorPermissionRequest
     * @return DescribeOperatorPermissionResponse
     */
    CompletableFuture<DescribeOperatorPermissionResponse> describeOperatorPermission(DescribeOperatorPermissionRequest request);

    /**
     * @param request the request parameters of DescribeOversizeNonPartitionTableInfos  DescribeOversizeNonPartitionTableInfosRequest
     * @return DescribeOversizeNonPartitionTableInfosResponse
     */
    CompletableFuture<DescribeOversizeNonPartitionTableInfosResponse> describeOversizeNonPartitionTableInfos(DescribeOversizeNonPartitionTableInfosRequest request);

    /**
     * @param request the request parameters of DescribePatternPerformance  DescribePatternPerformanceRequest
     * @return DescribePatternPerformanceResponse
     */
    CompletableFuture<DescribePatternPerformanceResponse> describePatternPerformance(DescribePatternPerformanceRequest request);

    /**
     * @param request the request parameters of DescribeProcessList  DescribeProcessListRequest
     * @return DescribeProcessListResponse
     */
    CompletableFuture<DescribeProcessListResponse> describeProcessList(DescribeProcessListRequest request);

    /**
     * @param request the request parameters of DescribeRdsAnalysisResourceQuotas  DescribeRdsAnalysisResourceQuotasRequest
     * @return DescribeRdsAnalysisResourceQuotasResponse
     */
    CompletableFuture<DescribeRdsAnalysisResourceQuotasResponse> describeRdsAnalysisResourceQuotas(DescribeRdsAnalysisResourceQuotasRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * @param request the request parameters of DescribeRegionsMixed  DescribeRegionsMixedRequest
     * @return DescribeRegionsMixedResponse
     */
    CompletableFuture<DescribeRegionsMixedResponse> describeRegionsMixed(DescribeRegionsMixedRequest request);

    /**
     * @param request the request parameters of DescribeResubmitConfig  DescribeResubmitConfigRequest
     * @return DescribeResubmitConfigResponse
     */
    CompletableFuture<DescribeResubmitConfigResponse> describeResubmitConfig(DescribeResubmitConfigRequest request);

    /**
     * @param request the request parameters of DescribeSQAConfig  DescribeSQAConfigRequest
     * @return DescribeSQAConfigResponse
     */
    CompletableFuture<DescribeSQAConfigResponse> describeSQAConfig(DescribeSQAConfigRequest request);

    /**
     * @param request the request parameters of DescribeSQLPatterns  DescribeSQLPatternsRequest
     * @return DescribeSQLPatternsResponse
     */
    CompletableFuture<DescribeSQLPatternsResponse> describeSQLPatterns(DescribeSQLPatternsRequest request);

    /**
     * @param request the request parameters of DescribeSQLPlan  DescribeSQLPlanRequest
     * @return DescribeSQLPlanResponse
     */
    CompletableFuture<DescribeSQLPlanResponse> describeSQLPlan(DescribeSQLPlanRequest request);

    /**
     * @param request the request parameters of DescribeSQLPlanTask  DescribeSQLPlanTaskRequest
     * @return DescribeSQLPlanTaskResponse
     */
    CompletableFuture<DescribeSQLPlanTaskResponse> describeSQLPlanTask(DescribeSQLPlanTaskRequest request);

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
     * @param request the request parameters of DescribeSqlPattern  DescribeSqlPatternRequest
     * @return DescribeSqlPatternResponse
     */
    CompletableFuture<DescribeSqlPatternResponse> describeSqlPattern(DescribeSqlPatternRequest request);

    /**
     * @param request the request parameters of DescribeSyncAvailableDBClusterList  DescribeSyncAvailableDBClusterListRequest
     * @return DescribeSyncAvailableDBClusterListResponse
     */
    CompletableFuture<DescribeSyncAvailableDBClusterListResponse> describeSyncAvailableDBClusterList(DescribeSyncAvailableDBClusterListRequest request);

    /**
     * @param request the request parameters of DescribeSyncJobList  DescribeSyncJobListRequest
     * @return DescribeSyncJobListResponse
     */
    CompletableFuture<DescribeSyncJobListResponse> describeSyncJobList(DescribeSyncJobListRequest request);

    /**
     * @param request the request parameters of DescribeTableAccessCount  DescribeTableAccessCountRequest
     * @return DescribeTableAccessCountResponse
     */
    CompletableFuture<DescribeTableAccessCountResponse> describeTableAccessCount(DescribeTableAccessCountRequest request);

    /**
     * @param request the request parameters of DescribeTableDetail  DescribeTableDetailRequest
     * @return DescribeTableDetailResponse
     */
    CompletableFuture<DescribeTableDetailResponse> describeTableDetail(DescribeTableDetailRequest request);

    /**
     * @param request the request parameters of DescribeTablePartitionDiagnose  DescribeTablePartitionDiagnoseRequest
     * @return DescribeTablePartitionDiagnoseResponse
     */
    CompletableFuture<DescribeTablePartitionDiagnoseResponse> describeTablePartitionDiagnose(DescribeTablePartitionDiagnoseRequest request);

    /**
     * @param request the request parameters of DescribeTableStatistics  DescribeTableStatisticsRequest
     * @return DescribeTableStatisticsResponse
     */
    CompletableFuture<DescribeTableStatisticsResponse> describeTableStatistics(DescribeTableStatisticsRequest request);

    /**
     * @param request the request parameters of DescribeTables  DescribeTablesRequest
     * @return DescribeTablesResponse
     */
    CompletableFuture<DescribeTablesResponse> describeTables(DescribeTablesRequest request);

    /**
     * @param request the request parameters of DescribeTaskInfo  DescribeTaskInfoRequest
     * @return DescribeTaskInfoResponse
     */
    CompletableFuture<DescribeTaskInfoResponse> describeTaskInfo(DescribeTaskInfoRequest request);

    /**
     * @param request the request parameters of DescribeVSwitches  DescribeVSwitchesRequest
     * @return DescribeVSwitchesResponse
     */
    CompletableFuture<DescribeVSwitchesResponse> describeVSwitches(DescribeVSwitchesRequest request);

    /**
     * @param request the request parameters of DescribeVSwitchs  DescribeVSwitchsRequest
     * @return DescribeVSwitchsResponse
     */
    CompletableFuture<DescribeVSwitchsResponse> describeVSwitchs(DescribeVSwitchsRequest request);

    /**
     * @param request the request parameters of DescribeVpcs  DescribeVpcsRequest
     * @return DescribeVpcsResponse
     */
    CompletableFuture<DescribeVpcsResponse> describeVpcs(DescribeVpcsRequest request);

    /**
     * @param request the request parameters of DescribeWorkerDetection  DescribeWorkerDetectionRequest
     * @return DescribeWorkerDetectionResponse
     */
    CompletableFuture<DescribeWorkerDetectionResponse> describeWorkerDetection(DescribeWorkerDetectionRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation only for AnalyticDB for MySQL Data Warehouse Edition (V3.0) clusters in elastic mode for Cluster Edition.</p>
     * 
     * @param request the request parameters of DetachUserENI  DetachUserENIRequest
     * @return DetachUserENIResponse
     */
    CompletableFuture<DetachUserENIResponse> detachUserENI(DetachUserENIRequest request);

    /**
     * @param request the request parameters of DisableAdviceService  DisableAdviceServiceRequest
     * @return DisableAdviceServiceResponse
     */
    CompletableFuture<DisableAdviceServiceResponse> disableAdviceService(DisableAdviceServiceRequest request);

    /**
     * @param request the request parameters of DownloadDiagnosisRecords  DownloadDiagnosisRecordsRequest
     * @return DownloadDiagnosisRecordsResponse
     */
    CompletableFuture<DownloadDiagnosisRecordsResponse> downloadDiagnosisRecords(DownloadDiagnosisRecordsRequest request);

    /**
     * @param request the request parameters of EnableAdviceService  EnableAdviceServiceRequest
     * @return EnableAdviceServiceResponse
     */
    CompletableFuture<EnableAdviceServiceResponse> enableAdviceService(EnableAdviceServiceRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request the request parameters of GetCreateTableSQL  GetCreateTableSQLRequest
     * @return GetCreateTableSQLResponse
     */
    CompletableFuture<GetCreateTableSQLResponse> getCreateTableSQL(GetCreateTableSQLRequest request);

    /**
     * <b>description</b> :
     * <h3></h3>
     * <p>If you need Alibaba Cloud technical support to perform operations on your AnalyticDB for MySQL cluster, you must grant permissions to the service account of your cluster. When the validity period of the authorization ends, the granted permissions are automatically revoked.</p>
     * 
     * @param request the request parameters of GrantOperatorPermission  GrantOperatorPermissionRequest
     * @return GrantOperatorPermissionResponse
     */
    CompletableFuture<GrantOperatorPermissionResponse> grantOperatorPermission(GrantOperatorPermissionRequest request);

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
     * @param request the request parameters of MigrateDBCluster  MigrateDBClusterRequest
     * @return MigrateDBClusterResponse
     */
    CompletableFuture<MigrateDBClusterResponse> migrateDBCluster(MigrateDBClusterRequest request);

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
     * @param request the request parameters of ModifyAuditLogConfig  ModifyAuditLogConfigRequest
     * @return ModifyAuditLogConfigResponse
     */
    CompletableFuture<ModifyAuditLogConfigResponse> modifyAuditLogConfig(ModifyAuditLogConfigRequest request);

    /**
     * @param request the request parameters of ModifyAutoRenewAttribute  ModifyAutoRenewAttributeRequest
     * @return ModifyAutoRenewAttributeResponse
     */
    CompletableFuture<ModifyAutoRenewAttributeResponse> modifyAutoRenewAttribute(ModifyAutoRenewAttributeRequest request);

    /**
     * @param request the request parameters of ModifyBackupPolicy  ModifyBackupPolicyRequest
     * @return ModifyBackupPolicyResponse
     */
    CompletableFuture<ModifyBackupPolicyResponse> modifyBackupPolicy(ModifyBackupPolicyRequest request);

    /**
     * @param request the request parameters of ModifyClusterConnectionString  ModifyClusterConnectionStringRequest
     * @return ModifyClusterConnectionStringResponse
     */
    CompletableFuture<ModifyClusterConnectionStringResponse> modifyClusterConnectionString(ModifyClusterConnectionStringRequest request);

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
     * @param request the request parameters of ModifyDBClusterPayType  ModifyDBClusterPayTypeRequest
     * @return ModifyDBClusterPayTypeResponse
     */
    CompletableFuture<ModifyDBClusterPayTypeResponse> modifyDBClusterPayType(ModifyDBClusterPayTypeRequest request);

    /**
     * <b>description</b> :
     * <p>Resource Management enables you to build an organizational structure for resources based on your business needs. You can use a resource directory, folders, accounts, and resource groups to hierarchically organize and manage resources. For more information, see <a href="~~94475#concept-zyn-3p1-dhb~~" title="Resource Management provides a collection of resource management services that support enterprise IT administration. The services include Resource Directory, Resource Group, and Tag. Resource Directory allows you to build an organizational structure for resources based on your business requirements. Resource Group and Tag allow you to hierarchically manage the resources. Resource Sharing allows you to share the resources among your accounts.">What is Resource Management?</a></p>
     * 
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
     * @param request the request parameters of ModifyDBClusterShardNumber  ModifyDBClusterShardNumberRequest
     * @return ModifyDBClusterShardNumberResponse
     */
    CompletableFuture<ModifyDBClusterShardNumberResponse> modifyDBClusterShardNumber(ModifyDBClusterShardNumberRequest request);

    /**
     * @param request the request parameters of ModifyDBClusterVip  ModifyDBClusterVipRequest
     * @return ModifyDBClusterVipResponse
     */
    CompletableFuture<ModifyDBClusterVipResponse> modifyDBClusterVip(ModifyDBClusterVipRequest request);

    /**
     * <b>description</b> :
     * <h2>Precautions</h2>
     * <ul>
     * <li>This operation is applicable only for elastic clusters of 32 cores or more.</li>
     * <li>The number of nodes cannot be changed for the default resource group USER_DEFAULT.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBResourceGroup  ModifyDBResourceGroupRequest
     * @return ModifyDBResourceGroupResponse
     */
    CompletableFuture<ModifyDBResourceGroupResponse> modifyDBResourceGroup(ModifyDBResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <h3></h3>
     * <ul>
     * <li>You can call this operation only for elastic clusters of 32 cores or more.</li>
     * <li>You cannot change the number of nodes for the USER_DEFAULT resource group.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDBResourcePool  ModifyDBResourcePoolRequest
     * @return ModifyDBResourcePoolResponse
     */
    CompletableFuture<ModifyDBResourcePoolResponse> modifyDBResourcePool(ModifyDBResourcePoolRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation only for AnalyticDB for MySQL Data Warehouse Edition (V3.0) clusters in elastic mode for Cluster Edition that have 32 cores or more.</p>
     * 
     * @param request the request parameters of ModifyElasticPlan  ModifyElasticPlanRequest
     * @return ModifyElasticPlanResponse
     */
    CompletableFuture<ModifyElasticPlanResponse> modifyElasticPlan(ModifyElasticPlanRequest request);

    /**
     * @param request the request parameters of ModifyLogBackupPolicy  ModifyLogBackupPolicyRequest
     * @return ModifyLogBackupPolicyResponse
     */
    CompletableFuture<ModifyLogBackupPolicyResponse> modifyLogBackupPolicy(ModifyLogBackupPolicyRequest request);

    /**
     * @param request the request parameters of ModifyLogHubStatus  ModifyLogHubStatusRequest
     * @return ModifyLogHubStatusResponse
     */
    CompletableFuture<ModifyLogHubStatusResponse> modifyLogHubStatus(ModifyLogHubStatusRequest request);

    /**
     * @param request the request parameters of ModifyMaintenanceAction  ModifyMaintenanceActionRequest
     * @return ModifyMaintenanceActionResponse
     */
    CompletableFuture<ModifyMaintenanceActionResponse> modifyMaintenanceAction(ModifyMaintenanceActionRequest request);

    /**
     * @param request the request parameters of ModifyResubmitConfig  ModifyResubmitConfigRequest
     * @return ModifyResubmitConfigResponse
     */
    CompletableFuture<ModifyResubmitConfigResponse> modifyResubmitConfig(ModifyResubmitConfigRequest request);

    /**
     * @param request the request parameters of ModifySQAConfig  ModifySQAConfigRequest
     * @return ModifySQAConfigResponse
     */
    CompletableFuture<ModifySQAConfigResponse> modifySQAConfig(ModifySQAConfigRequest request);

    /**
     * @param request the request parameters of ModifySyncJob  ModifySyncJobRequest
     * @return ModifySyncJobResponse
     */
    CompletableFuture<ModifySyncJobResponse> modifySyncJob(ModifySyncJobRequest request);

    /**
     * @param request the request parameters of OperateLogHub  OperateLogHubRequest
     * @return OperateLogHubResponse
     */
    CompletableFuture<OperateLogHubResponse> operateLogHub(OperateLogHubRequest request);

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
     * @param request the request parameters of RevokeOperatorPermission  RevokeOperatorPermissionRequest
     * @return RevokeOperatorPermissionResponse
     */
    CompletableFuture<RevokeOperatorPermissionResponse> revokeOperatorPermission(RevokeOperatorPermissionRequest request);

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @param request the request parameters of UnbindDBResourceGroupWithUser  UnbindDBResourceGroupWithUserRequest
     * @return UnbindDBResourceGroupWithUserResponse
     */
    CompletableFuture<UnbindDBResourceGroupWithUserResponse> unbindDBResourceGroupWithUser(UnbindDBResourceGroupWithUserRequest request);

    /**
     * @param request the request parameters of UnbindDBResourcePoolWithUser  UnbindDBResourcePoolWithUserRequest
     * @return UnbindDBResourcePoolWithUserResponse
     */
    CompletableFuture<UnbindDBResourcePoolWithUserResponse> unbindDBResourcePoolWithUser(UnbindDBResourcePoolWithUserRequest request);

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * @param request the request parameters of UpgradeKernelVersion  UpgradeKernelVersionRequest
     * @return UpgradeKernelVersionResponse
     */
    CompletableFuture<UpgradeKernelVersionResponse> upgradeKernelVersion(UpgradeKernelVersionRequest request);

}
