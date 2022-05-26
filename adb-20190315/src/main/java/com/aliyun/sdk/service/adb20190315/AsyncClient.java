// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.adb20190315.models.*;
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

    CompletableFuture<BindDBResourceGroupWithUserResponse> bindDBResourceGroupWithUser(BindDBResourceGroupWithUserRequest request);

    CompletableFuture<BindDBResourcePoolWithUserResponse> bindDBResourcePoolWithUser(BindDBResourcePoolWithUserRequest request);

    CompletableFuture<CreateAccountResponse> createAccount(CreateAccountRequest request);

    CompletableFuture<CreateDBClusterResponse> createDBCluster(CreateDBClusterRequest request);

    CompletableFuture<CreateDBResourceGroupResponse> createDBResourceGroup(CreateDBResourceGroupRequest request);

    CompletableFuture<CreateDBResourcePoolResponse> createDBResourcePool(CreateDBResourcePoolRequest request);

    CompletableFuture<CreateElasticPlanResponse> createElasticPlan(CreateElasticPlanRequest request);

    CompletableFuture<DeleteAccountResponse> deleteAccount(DeleteAccountRequest request);

    CompletableFuture<DeleteDBClusterResponse> deleteDBCluster(DeleteDBClusterRequest request);

    CompletableFuture<DeleteDBResourceGroupResponse> deleteDBResourceGroup(DeleteDBResourceGroupRequest request);

    CompletableFuture<DeleteDBResourcePoolResponse> deleteDBResourcePool(DeleteDBResourcePoolRequest request);

    CompletableFuture<DeleteElasticPlanResponse> deleteElasticPlan(DeleteElasticPlanRequest request);

    CompletableFuture<DescribeAccountsResponse> describeAccounts(DescribeAccountsRequest request);

    CompletableFuture<DescribeAllAccountsResponse> describeAllAccounts(DescribeAllAccountsRequest request);

    CompletableFuture<DescribeAllDataSourceResponse> describeAllDataSource(DescribeAllDataSourceRequest request);

    CompletableFuture<DescribeAuditLogConfigResponse> describeAuditLogConfig(DescribeAuditLogConfigRequest request);

    CompletableFuture<DescribeAuditLogRecordsResponse> describeAuditLogRecords(DescribeAuditLogRecordsRequest request);

    CompletableFuture<DescribeAutoRenewAttributeResponse> describeAutoRenewAttribute(DescribeAutoRenewAttributeRequest request);

    CompletableFuture<DescribeAvailableResourceResponse> describeAvailableResource(DescribeAvailableResourceRequest request);

    CompletableFuture<DescribeBackupPolicyResponse> describeBackupPolicy(DescribeBackupPolicyRequest request);

    CompletableFuture<DescribeBackupsResponse> describeBackups(DescribeBackupsRequest request);

    CompletableFuture<DescribeColumnsResponse> describeColumns(DescribeColumnsRequest request);

    CompletableFuture<DescribeConnectionCountRecordsResponse> describeConnectionCountRecords(DescribeConnectionCountRecordsRequest request);

    CompletableFuture<DescribeDBClusterAccessWhiteListResponse> describeDBClusterAccessWhiteList(DescribeDBClusterAccessWhiteListRequest request);

    CompletableFuture<DescribeDBClusterAttributeResponse> describeDBClusterAttribute(DescribeDBClusterAttributeRequest request);

    CompletableFuture<DescribeDBClusterForecastResponse> describeDBClusterForecast(DescribeDBClusterForecastRequest request);

    CompletableFuture<DescribeDBClusterHealthReportResponse> describeDBClusterHealthReport(DescribeDBClusterHealthReportRequest request);

    CompletableFuture<DescribeDBClusterNetInfoResponse> describeDBClusterNetInfo(DescribeDBClusterNetInfoRequest request);

    CompletableFuture<DescribeDBClusterPerformanceResponse> describeDBClusterPerformance(DescribeDBClusterPerformanceRequest request);

    CompletableFuture<DescribeDBClusterResourcePoolPerformanceResponse> describeDBClusterResourcePoolPerformance(DescribeDBClusterResourcePoolPerformanceRequest request);

    CompletableFuture<DescribeDBClustersResponse> describeDBClusters(DescribeDBClustersRequest request);

    CompletableFuture<DescribeDBResourceGroupResponse> describeDBResourceGroup(DescribeDBResourceGroupRequest request);

    CompletableFuture<DescribeDBResourcePoolResponse> describeDBResourcePool(DescribeDBResourcePoolRequest request);

    CompletableFuture<DescribeDiagnosisDimensionsResponse> describeDiagnosisDimensions(DescribeDiagnosisDimensionsRequest request);

    CompletableFuture<DescribeDiagnosisRecordsResponse> describeDiagnosisRecords(DescribeDiagnosisRecordsRequest request);

    CompletableFuture<DescribeDownloadRecordsResponse> describeDownloadRecords(DescribeDownloadRecordsRequest request);

    CompletableFuture<DescribeElasticDailyPlanResponse> describeElasticDailyPlan(DescribeElasticDailyPlanRequest request);

    CompletableFuture<DescribeElasticPlanResponse> describeElasticPlan(DescribeElasticPlanRequest request);

    CompletableFuture<DescribeInclinedTablesResponse> describeInclinedTables(DescribeInclinedTablesRequest request);

    CompletableFuture<DescribeLoadTasksRecordsResponse> describeLoadTasksRecords(DescribeLoadTasksRecordsRequest request);

    CompletableFuture<DescribeMaintenanceActionResponse> describeMaintenanceAction(DescribeMaintenanceActionRequest request);

    CompletableFuture<DescribeOperatorPermissionResponse> describeOperatorPermission(DescribeOperatorPermissionRequest request);

    CompletableFuture<DescribePatternPerformanceResponse> describePatternPerformance(DescribePatternPerformanceRequest request);

    CompletableFuture<DescribeProcessListResponse> describeProcessList(DescribeProcessListRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeSQLPatternAttributeResponse> describeSQLPatternAttribute(DescribeSQLPatternAttributeRequest request);

    CompletableFuture<DescribeSQLPatternsResponse> describeSQLPatterns(DescribeSQLPatternsRequest request);

    CompletableFuture<DescribeSQLPlanResponse> describeSQLPlan(DescribeSQLPlanRequest request);

    CompletableFuture<DescribeSQLPlanTaskResponse> describeSQLPlanTask(DescribeSQLPlanTaskRequest request);

    CompletableFuture<DescribeSchemasResponse> describeSchemas(DescribeSchemasRequest request);

    CompletableFuture<DescribeSlowLogRecordsResponse> describeSlowLogRecords(DescribeSlowLogRecordsRequest request);

    CompletableFuture<DescribeSlowLogTrendResponse> describeSlowLogTrend(DescribeSlowLogTrendRequest request);

    CompletableFuture<DescribeSqlPatternResponse> describeSqlPattern(DescribeSqlPatternRequest request);

    CompletableFuture<DescribeTableAccessCountResponse> describeTableAccessCount(DescribeTableAccessCountRequest request);

    CompletableFuture<DescribeTableDetailResponse> describeTableDetail(DescribeTableDetailRequest request);

    CompletableFuture<DescribeTablePartitionDiagnoseResponse> describeTablePartitionDiagnose(DescribeTablePartitionDiagnoseRequest request);

    CompletableFuture<DescribeTableStatisticsResponse> describeTableStatistics(DescribeTableStatisticsRequest request);

    CompletableFuture<DescribeTablesResponse> describeTables(DescribeTablesRequest request);

    CompletableFuture<DescribeTaskInfoResponse> describeTaskInfo(DescribeTaskInfoRequest request);

    CompletableFuture<DownloadDiagnosisRecordsResponse> downloadDiagnosisRecords(DownloadDiagnosisRecordsRequest request);

    CompletableFuture<GrantOperatorPermissionResponse> grantOperatorPermission(GrantOperatorPermissionRequest request);

    CompletableFuture<KillProcessResponse> killProcess(KillProcessRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ModifyAccountDescriptionResponse> modifyAccountDescription(ModifyAccountDescriptionRequest request);

    CompletableFuture<ModifyAuditLogConfigResponse> modifyAuditLogConfig(ModifyAuditLogConfigRequest request);

    CompletableFuture<ModifyAutoRenewAttributeResponse> modifyAutoRenewAttribute(ModifyAutoRenewAttributeRequest request);

    CompletableFuture<ModifyBackupPolicyResponse> modifyBackupPolicy(ModifyBackupPolicyRequest request);

    CompletableFuture<ModifyClusterConnectionStringResponse> modifyClusterConnectionString(ModifyClusterConnectionStringRequest request);

    CompletableFuture<ModifyDBClusterResponse> modifyDBCluster(ModifyDBClusterRequest request);

    CompletableFuture<ModifyDBClusterAccessWhiteListResponse> modifyDBClusterAccessWhiteList(ModifyDBClusterAccessWhiteListRequest request);

    CompletableFuture<ModifyDBClusterDescriptionResponse> modifyDBClusterDescription(ModifyDBClusterDescriptionRequest request);

    CompletableFuture<ModifyDBClusterMaintainTimeResponse> modifyDBClusterMaintainTime(ModifyDBClusterMaintainTimeRequest request);

    CompletableFuture<ModifyDBClusterPayTypeResponse> modifyDBClusterPayType(ModifyDBClusterPayTypeRequest request);

    CompletableFuture<ModifyDBClusterResourceGroupResponse> modifyDBClusterResourceGroup(ModifyDBClusterResourceGroupRequest request);

    CompletableFuture<ModifyDBResourceGroupResponse> modifyDBResourceGroup(ModifyDBResourceGroupRequest request);

    CompletableFuture<ModifyDBResourcePoolResponse> modifyDBResourcePool(ModifyDBResourcePoolRequest request);

    CompletableFuture<ModifyElasticPlanResponse> modifyElasticPlan(ModifyElasticPlanRequest request);

    CompletableFuture<ModifyLogBackupPolicyResponse> modifyLogBackupPolicy(ModifyLogBackupPolicyRequest request);

    CompletableFuture<ModifyMaintenanceActionResponse> modifyMaintenanceAction(ModifyMaintenanceActionRequest request);

    CompletableFuture<ReleaseClusterPublicConnectionResponse> releaseClusterPublicConnection(ReleaseClusterPublicConnectionRequest request);

    CompletableFuture<ResetAccountPasswordResponse> resetAccountPassword(ResetAccountPasswordRequest request);

    CompletableFuture<RevokeOperatorPermissionResponse> revokeOperatorPermission(RevokeOperatorPermissionRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UnbindDBResourceGroupWithUserResponse> unbindDBResourceGroupWithUser(UnbindDBResourceGroupWithUserRequest request);

    CompletableFuture<UnbindDBResourcePoolWithUserResponse> unbindDBResourcePoolWithUser(UnbindDBResourcePoolWithUserRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

}
