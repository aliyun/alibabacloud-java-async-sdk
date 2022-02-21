// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.gpdb20160503.models.*;
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

    CompletableFuture<AddBuDBInstanceRelationResponse> addBuDBInstanceRelation(AddBuDBInstanceRelationRequest request);

    CompletableFuture<AllocateInstancePublicConnectionResponse> allocateInstancePublicConnection(AllocateInstancePublicConnectionRequest request);

    CompletableFuture<CheckServiceLinkedRoleResponse> checkServiceLinkedRole(CheckServiceLinkedRoleRequest request);

    CompletableFuture<CreateAccountResponse> createAccount(CreateAccountRequest request);

    CompletableFuture<CreateDBInstanceResponse> createDBInstance(CreateDBInstanceRequest request);

    CompletableFuture<CreateECSDBInstanceResponse> createECSDBInstance(CreateECSDBInstanceRequest request);

    CompletableFuture<CreateServiceLinkedRoleResponse> createServiceLinkedRole(CreateServiceLinkedRoleRequest request);

    CompletableFuture<DeleteDBInstanceResponse> deleteDBInstance(DeleteDBInstanceRequest request);

    CompletableFuture<DeleteDatabaseResponse> deleteDatabase(DeleteDatabaseRequest request);

    CompletableFuture<DeleteInstanceSPInfoResponse> deleteInstanceSPInfo(DeleteInstanceSPInfoRequest request);

    CompletableFuture<DescribeAccountsResponse> describeAccounts(DescribeAccountsRequest request);

    CompletableFuture<DescribeAvailableResourcesResponse> describeAvailableResources(DescribeAvailableResourcesRequest request);

    CompletableFuture<DescribeBackupPolicyResponse> describeBackupPolicy(DescribeBackupPolicyRequest request);

    CompletableFuture<DescribeDBClusterNodeResponse> describeDBClusterNode(DescribeDBClusterNodeRequest request);

    CompletableFuture<DescribeDBClusterNodesResponse> describeDBClusterNodes(DescribeDBClusterNodesRequest request);

    CompletableFuture<DescribeDBClusterPerformanceResponse> describeDBClusterPerformance(DescribeDBClusterPerformanceRequest request);

    CompletableFuture<DescribeDBInstanceAttributeResponse> describeDBInstanceAttribute(DescribeDBInstanceAttributeRequest request);

    CompletableFuture<DescribeDBInstanceIPArrayListResponse> describeDBInstanceIPArrayList(DescribeDBInstanceIPArrayListRequest request);

    CompletableFuture<DescribeDBInstanceNetInfoResponse> describeDBInstanceNetInfo(DescribeDBInstanceNetInfoRequest request);

    CompletableFuture<DescribeDBInstanceOnECSAttributeResponse> describeDBInstanceOnECSAttribute(DescribeDBInstanceOnECSAttributeRequest request);

    CompletableFuture<DescribeDBInstancePerformanceResponse> describeDBInstancePerformance(DescribeDBInstancePerformanceRequest request);

    CompletableFuture<DescribeDBInstanceSQLPatternsResponse> describeDBInstanceSQLPatterns(DescribeDBInstanceSQLPatternsRequest request);

    CompletableFuture<DescribeDBInstanceSSLResponse> describeDBInstanceSSL(DescribeDBInstanceSSLRequest request);

    CompletableFuture<DescribeDBInstancesResponse> describeDBInstances(DescribeDBInstancesRequest request);

    CompletableFuture<DescribeDataBackupsResponse> describeDataBackups(DescribeDataBackupsRequest request);

    CompletableFuture<DescribeDataShareInstancesResponse> describeDataShareInstances(DescribeDataShareInstancesRequest request);

    CompletableFuture<DescribeHealthStatusResponse> describeHealthStatus(DescribeHealthStatusRequest request);

    CompletableFuture<DescribeLogBackupsResponse> describeLogBackups(DescribeLogBackupsRequest request);

    CompletableFuture<DescribeModifyParameterLogResponse> describeModifyParameterLog(DescribeModifyParameterLogRequest request);

    CompletableFuture<DescribeParametersResponse> describeParameters(DescribeParametersRequest request);

    CompletableFuture<DescribeRdsVSwitchsResponse> describeRdsVSwitchs(DescribeRdsVSwitchsRequest request);

    CompletableFuture<DescribeRdsVpcsResponse> describeRdsVpcs(DescribeRdsVpcsRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeResourceUsageResponse> describeResourceUsage(DescribeResourceUsageRequest request);

    CompletableFuture<DescribeSQLCollectorPolicyResponse> describeSQLCollectorPolicy(DescribeSQLCollectorPolicyRequest request);

    CompletableFuture<DescribeSQLLogResponse> describeSQLLog(DescribeSQLLogRequest request);

    CompletableFuture<DescribeSQLLogByQueryIdResponse> describeSQLLogByQueryId(DescribeSQLLogByQueryIdRequest request);

    CompletableFuture<DescribeSQLLogCountResponse> describeSQLLogCount(DescribeSQLLogCountRequest request);

    CompletableFuture<DescribeSQLLogFilesResponse> describeSQLLogFiles(DescribeSQLLogFilesRequest request);

    CompletableFuture<DescribeSQLLogRecordsResponse> describeSQLLogRecords(DescribeSQLLogRecordsRequest request);

    CompletableFuture<DescribeSQLLogsResponse> describeSQLLogs(DescribeSQLLogsRequest request);

    CompletableFuture<DescribeSQLLogsOnSliceResponse> describeSQLLogsOnSlice(DescribeSQLLogsOnSliceRequest request);

    CompletableFuture<DescribeSlowLogRecordsResponse> describeSlowLogRecords(DescribeSlowLogRecordsRequest request);

    CompletableFuture<DescribeSlowSQLLogsResponse> describeSlowSQLLogs(DescribeSlowSQLLogsRequest request);

    CompletableFuture<DescribeSpecificationResponse> describeSpecification(DescribeSpecificationRequest request);

    CompletableFuture<DescribeTagsResponse> describeTags(DescribeTagsRequest request);

    CompletableFuture<DescribeUserEncryptionKeyListResponse> describeUserEncryptionKeyList(DescribeUserEncryptionKeyListRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ModifyAccountDescriptionResponse> modifyAccountDescription(ModifyAccountDescriptionRequest request);

    CompletableFuture<ModifyBackupPolicyResponse> modifyBackupPolicy(ModifyBackupPolicyRequest request);

    CompletableFuture<ModifyDBInstanceConnectionModeResponse> modifyDBInstanceConnectionMode(ModifyDBInstanceConnectionModeRequest request);

    CompletableFuture<ModifyDBInstanceConnectionStringResponse> modifyDBInstanceConnectionString(ModifyDBInstanceConnectionStringRequest request);

    CompletableFuture<ModifyDBInstanceDescriptionResponse> modifyDBInstanceDescription(ModifyDBInstanceDescriptionRequest request);

    CompletableFuture<ModifyDBInstanceMaintainTimeResponse> modifyDBInstanceMaintainTime(ModifyDBInstanceMaintainTimeRequest request);

    CompletableFuture<ModifyDBInstanceNetworkTypeResponse> modifyDBInstanceNetworkType(ModifyDBInstanceNetworkTypeRequest request);

    CompletableFuture<ModifyDBInstanceSSLResponse> modifyDBInstanceSSL(ModifyDBInstanceSSLRequest request);

    CompletableFuture<ModifyParametersResponse> modifyParameters(ModifyParametersRequest request);

    CompletableFuture<ModifySQLCollectorPolicyResponse> modifySQLCollectorPolicy(ModifySQLCollectorPolicyRequest request);

    CompletableFuture<ModifySecurityIpsResponse> modifySecurityIps(ModifySecurityIpsRequest request);

    CompletableFuture<ReleaseInstancePublicConnectionResponse> releaseInstancePublicConnection(ReleaseInstancePublicConnectionRequest request);

    CompletableFuture<ResetAccountPasswordResponse> resetAccountPassword(ResetAccountPasswordRequest request);

    CompletableFuture<RestartDBInstanceResponse> restartDBInstance(RestartDBInstanceRequest request);

    CompletableFuture<SetDataShareInstanceResponse> setDataShareInstance(SetDataShareInstanceRequest request);

    CompletableFuture<SwitchDBInstanceNetTypeResponse> switchDBInstanceNetType(SwitchDBInstanceNetTypeRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpgradeDBInstanceResponse> upgradeDBInstance(UpgradeDBInstanceRequest request);

    CompletableFuture<UpgradeDBVersionResponse> upgradeDBVersion(UpgradeDBVersionRequest request);

}
