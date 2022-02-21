// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.drds20190123.models.*;
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

    CompletableFuture<ChangeAccountPasswordResponse> changeAccountPassword(ChangeAccountPasswordRequest request);

    CompletableFuture<ChangeInstanceAzoneResponse> changeInstanceAzone(ChangeInstanceAzoneRequest request);

    CompletableFuture<CheckDrdsDbNameResponse> checkDrdsDbName(CheckDrdsDbNameRequest request);

    CompletableFuture<CheckExpandStatusResponse> checkExpandStatus(CheckExpandStatusRequest request);

    CompletableFuture<CheckSqlAuditEnableStatusResponse> checkSqlAuditEnableStatus(CheckSqlAuditEnableStatusRequest request);

    CompletableFuture<CreateDrdsDBResponse> createDrdsDB(CreateDrdsDBRequest request);

    CompletableFuture<CreateDrdsInstanceResponse> createDrdsInstance(CreateDrdsInstanceRequest request);

    CompletableFuture<CreateInstanceAccountResponse> createInstanceAccount(CreateInstanceAccountRequest request);

    CompletableFuture<CreateInstanceInternetAddressResponse> createInstanceInternetAddress(CreateInstanceInternetAddressRequest request);

    CompletableFuture<CreateOrderForRdsResponse> createOrderForRds(CreateOrderForRdsRequest request);

    CompletableFuture<CreateShardTaskResponse> createShardTask(CreateShardTaskRequest request);

    CompletableFuture<DescribeBackMenuResponse> describeBackMenu(DescribeBackMenuRequest request);

    CompletableFuture<DescribeBackupDbsResponse> describeBackupDbs(DescribeBackupDbsRequest request);

    CompletableFuture<DescribeBackupLocalResponse> describeBackupLocal(DescribeBackupLocalRequest request);

    CompletableFuture<DescribeBackupPolicyResponse> describeBackupPolicy(DescribeBackupPolicyRequest request);

    CompletableFuture<DescribeBackupSetsResponse> describeBackupSets(DescribeBackupSetsRequest request);

    CompletableFuture<DescribeBackupTimesResponse> describeBackupTimes(DescribeBackupTimesRequest request);

    CompletableFuture<DescribeBroadcastTablesResponse> describeBroadcastTables(DescribeBroadcastTablesRequest request);

    CompletableFuture<DescribeDbInstanceDbsResponse> describeDbInstanceDbs(DescribeDbInstanceDbsRequest request);

    CompletableFuture<DescribeDbInstancesResponse> describeDbInstances(DescribeDbInstancesRequest request);

    CompletableFuture<DescribeDrdsDBResponse> describeDrdsDB(DescribeDrdsDBRequest request);

    CompletableFuture<DescribeDrdsDBClusterResponse> describeDrdsDBCluster(DescribeDrdsDBClusterRequest request);

    CompletableFuture<DescribeDrdsDBIpWhiteListResponse> describeDrdsDBIpWhiteList(DescribeDrdsDBIpWhiteListRequest request);

    CompletableFuture<DescribeDrdsDBsResponse> describeDrdsDBs(DescribeDrdsDBsRequest request);

    CompletableFuture<DescribeDrdsDbInstanceResponse> describeDrdsDbInstance(DescribeDrdsDbInstanceRequest request);

    CompletableFuture<DescribeDrdsDbInstancesResponse> describeDrdsDbInstances(DescribeDrdsDbInstancesRequest request);

    CompletableFuture<DescribeDrdsDbRdsNameListResponse> describeDrdsDbRdsNameList(DescribeDrdsDbRdsNameListRequest request);

    CompletableFuture<DescribeDrdsInstanceResponse> describeDrdsInstance(DescribeDrdsInstanceRequest request);

    CompletableFuture<DescribeDrdsInstanceDbMonitorResponse> describeDrdsInstanceDbMonitor(DescribeDrdsInstanceDbMonitorRequest request);

    CompletableFuture<DescribeDrdsInstanceLevelTasksResponse> describeDrdsInstanceLevelTasks(DescribeDrdsInstanceLevelTasksRequest request);

    CompletableFuture<DescribeDrdsInstanceMonitorResponse> describeDrdsInstanceMonitor(DescribeDrdsInstanceMonitorRequest request);

    CompletableFuture<DescribeDrdsInstanceVersionResponse> describeDrdsInstanceVersion(DescribeDrdsInstanceVersionRequest request);

    CompletableFuture<DescribeDrdsInstancesResponse> describeDrdsInstances(DescribeDrdsInstancesRequest request);

    CompletableFuture<DescribeDrdsParamsResponse> describeDrdsParams(DescribeDrdsParamsRequest request);

    CompletableFuture<DescribeDrdsRdsInstancesResponse> describeDrdsRdsInstances(DescribeDrdsRdsInstancesRequest request);

    CompletableFuture<DescribeDrdsShardingDbsResponse> describeDrdsShardingDbs(DescribeDrdsShardingDbsRequest request);

    CompletableFuture<DescribeDrdsSlowSqlsResponse> describeDrdsSlowSqls(DescribeDrdsSlowSqlsRequest request);

    CompletableFuture<DescribeDrdsSqlAuditStatusResponse> describeDrdsSqlAuditStatus(DescribeDrdsSqlAuditStatusRequest request);

    CompletableFuture<DescribeDrdsTasksResponse> describeDrdsTasks(DescribeDrdsTasksRequest request);

    CompletableFuture<DescribeExpandLogicTableInfoListResponse> describeExpandLogicTableInfoList(DescribeExpandLogicTableInfoListRequest request);

    CompletableFuture<DescribeHotDbListResponse> describeHotDbList(DescribeHotDbListRequest request);

    CompletableFuture<DescribeInstDbLogInfoResponse> describeInstDbLogInfo(DescribeInstDbLogInfoRequest request);

    CompletableFuture<DescribeInstDbSlsInfoResponse> describeInstDbSlsInfo(DescribeInstDbSlsInfoRequest request);

    CompletableFuture<DescribeInstanceAccountsResponse> describeInstanceAccounts(DescribeInstanceAccountsRequest request);

    CompletableFuture<DescribeInstanceSwitchAzoneResponse> describeInstanceSwitchAzone(DescribeInstanceSwitchAzoneRequest request);

    CompletableFuture<DescribeInstanceSwitchNetworkResponse> describeInstanceSwitchNetwork(DescribeInstanceSwitchNetworkRequest request);

    CompletableFuture<DescribePreCheckResultResponse> describePreCheckResult(DescribePreCheckResultRequest request);

    CompletableFuture<DescribeRDSPerformanceResponse> describeRDSPerformance(DescribeRDSPerformanceRequest request);

    CompletableFuture<DescribeRdsCommodityResponse> describeRdsCommodity(DescribeRdsCommodityRequest request);

    CompletableFuture<DescribeRdsPerformanceSummaryResponse> describeRdsPerformanceSummary(DescribeRdsPerformanceSummaryRequest request);

    CompletableFuture<DescribeRdsSuperAccountInstancesResponse> describeRdsSuperAccountInstances(DescribeRdsSuperAccountInstancesRequest request);

    CompletableFuture<DescribeRecycleBinStatusResponse> describeRecycleBinStatus(DescribeRecycleBinStatusRequest request);

    CompletableFuture<DescribeRecycleBinTablesResponse> describeRecycleBinTables(DescribeRecycleBinTablesRequest request);

    CompletableFuture<DescribeRestoreOrderResponse> describeRestoreOrder(DescribeRestoreOrderRequest request);

    CompletableFuture<DescribeShardTaskInfoResponse> describeShardTaskInfo(DescribeShardTaskInfoRequest request);

    CompletableFuture<DescribeSqlFlashbakTaskResponse> describeSqlFlashbakTask(DescribeSqlFlashbakTaskRequest request);

    CompletableFuture<DescribeTableResponse> describeTable(DescribeTableRequest request);

    CompletableFuture<DescribeTableListByTypeResponse> describeTableListByType(DescribeTableListByTypeRequest request);

    CompletableFuture<DescribeTablesResponse> describeTables(DescribeTablesRequest request);

    CompletableFuture<DisableSqlAuditResponse> disableSqlAudit(DisableSqlAuditRequest request);

    CompletableFuture<EnableInstanceIpv6AddressResponse> enableInstanceIpv6Address(EnableInstanceIpv6AddressRequest request);

    CompletableFuture<EnableSqlAuditResponse> enableSqlAudit(EnableSqlAuditRequest request);

    CompletableFuture<EnableSqlFlashbackMatchSwitchResponse> enableSqlFlashbackMatchSwitch(EnableSqlFlashbackMatchSwitchRequest request);

    CompletableFuture<FlashbackRecycleBinTableResponse> flashbackRecycleBinTable(FlashbackRecycleBinTableRequest request);

    CompletableFuture<GetDrdsDbRdsRelationInfoResponse> getDrdsDbRdsRelationInfo(GetDrdsDbRdsRelationInfoRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ManagePrivateRdsResponse> managePrivateRds(ManagePrivateRdsRequest request);

    CompletableFuture<ModifyAccountDescriptionResponse> modifyAccountDescription(ModifyAccountDescriptionRequest request);

    CompletableFuture<ModifyAccountPrivilegeResponse> modifyAccountPrivilege(ModifyAccountPrivilegeRequest request);

    CompletableFuture<ModifyDrdsInstanceDescriptionResponse> modifyDrdsInstanceDescription(ModifyDrdsInstanceDescriptionRequest request);

    CompletableFuture<ModifyDrdsIpWhiteListResponse> modifyDrdsIpWhiteList(ModifyDrdsIpWhiteListRequest request);

    CompletableFuture<ModifyPolarDbReadWeightResponse> modifyPolarDbReadWeight(ModifyPolarDbReadWeightRequest request);

    CompletableFuture<ModifyRdsReadWeightResponse> modifyRdsReadWeight(ModifyRdsReadWeightRequest request);

    CompletableFuture<PutStartBackupResponse> putStartBackup(PutStartBackupRequest request);

    CompletableFuture<RefreshDrdsAtomUrlResponse> refreshDrdsAtomUrl(RefreshDrdsAtomUrlRequest request);

    CompletableFuture<ReleaseInstanceInternetAddressResponse> releaseInstanceInternetAddress(ReleaseInstanceInternetAddressRequest request);

    CompletableFuture<RemoveBackupsSetResponse> removeBackupsSet(RemoveBackupsSetRequest request);

    CompletableFuture<RemoveDrdsDbResponse> removeDrdsDb(RemoveDrdsDbRequest request);

    CompletableFuture<RemoveDrdsDbFailedRecordResponse> removeDrdsDbFailedRecord(RemoveDrdsDbFailedRecordRequest request);

    CompletableFuture<RemoveDrdsInstanceResponse> removeDrdsInstance(RemoveDrdsInstanceRequest request);

    CompletableFuture<RemoveInstanceAccountResponse> removeInstanceAccount(RemoveInstanceAccountRequest request);

    CompletableFuture<RemoveRecycleBinTableResponse> removeRecycleBinTable(RemoveRecycleBinTableRequest request);

    CompletableFuture<RestartDrdsInstanceResponse> restartDrdsInstance(RestartDrdsInstanceRequest request);

    CompletableFuture<RollbackInstanceVersionResponse> rollbackInstanceVersion(RollbackInstanceVersionRequest request);

    CompletableFuture<SetBackupLocalResponse> setBackupLocal(SetBackupLocalRequest request);

    CompletableFuture<SetBackupPolicyResponse> setBackupPolicy(SetBackupPolicyRequest request);

    CompletableFuture<SetupBroadcastTablesResponse> setupBroadcastTables(SetupBroadcastTablesRequest request);

    CompletableFuture<SetupDrdsParamsResponse> setupDrdsParams(SetupDrdsParamsRequest request);

    CompletableFuture<SetupRecycleBinStatusResponse> setupRecycleBinStatus(SetupRecycleBinStatusRequest request);

    CompletableFuture<SetupTableResponse> setupTable(SetupTableRequest request);

    CompletableFuture<StartRestoreResponse> startRestore(StartRestoreRequest request);

    CompletableFuture<SubmitCleanTaskResponse> submitCleanTask(SubmitCleanTaskRequest request);

    CompletableFuture<SubmitHotExpandPreCheckTaskResponse> submitHotExpandPreCheckTask(SubmitHotExpandPreCheckTaskRequest request);

    CompletableFuture<SubmitHotExpandTaskResponse> submitHotExpandTask(SubmitHotExpandTaskRequest request);

    CompletableFuture<SubmitSmoothExpandPreCheckResponse> submitSmoothExpandPreCheck(SubmitSmoothExpandPreCheckRequest request);

    CompletableFuture<SubmitSmoothExpandPreCheckTaskResponse> submitSmoothExpandPreCheckTask(SubmitSmoothExpandPreCheckTaskRequest request);

    CompletableFuture<SubmitSqlFlashbackTaskResponse> submitSqlFlashbackTask(SubmitSqlFlashbackTaskRequest request);

    CompletableFuture<SwitchGlobalBroadcastTypeResponse> switchGlobalBroadcastType(SwitchGlobalBroadcastTypeRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpdateInstanceNetworkResponse> updateInstanceNetwork(UpdateInstanceNetworkRequest request);

    CompletableFuture<UpdatePrivateRdsClassResponse> updatePrivateRdsClass(UpdatePrivateRdsClassRequest request);

    CompletableFuture<UpdateResourceGroupAttributeResponse> updateResourceGroupAttribute(UpdateResourceGroupAttributeRequest request);

    CompletableFuture<UpgradeHiStoreInstanceResponse> upgradeHiStoreInstance(UpgradeHiStoreInstanceRequest request);

    CompletableFuture<UpgradeInstanceVersionResponse> upgradeInstanceVersion(UpgradeInstanceVersionRequest request);

    CompletableFuture<ValidateShardTaskResponse> validateShardTask(ValidateShardTaskRequest request);

}
