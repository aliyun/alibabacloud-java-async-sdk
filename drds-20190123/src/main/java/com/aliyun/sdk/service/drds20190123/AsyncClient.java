// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.drds20190123.models.*;
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
     * @param request the request parameters of ChangeAccountPassword  ChangeAccountPasswordRequest
     * @return ChangeAccountPasswordResponse
     */
    CompletableFuture<ChangeAccountPasswordResponse> changeAccountPassword(ChangeAccountPasswordRequest request);

    /**
     * @param request the request parameters of ChangeInstanceAzone  ChangeInstanceAzoneRequest
     * @return ChangeInstanceAzoneResponse
     */
    CompletableFuture<ChangeInstanceAzoneResponse> changeInstanceAzone(ChangeInstanceAzoneRequest request);

    /**
     * @param request the request parameters of CheckDrdsDbName  CheckDrdsDbNameRequest
     * @return CheckDrdsDbNameResponse
     */
    CompletableFuture<CheckDrdsDbNameResponse> checkDrdsDbName(CheckDrdsDbNameRequest request);

    /**
     * @param request the request parameters of CheckExpandStatus  CheckExpandStatusRequest
     * @return CheckExpandStatusResponse
     */
    CompletableFuture<CheckExpandStatusResponse> checkExpandStatus(CheckExpandStatusRequest request);

    /**
     * @param request the request parameters of CheckSqlAuditEnableStatus  CheckSqlAuditEnableStatusRequest
     * @return CheckSqlAuditEnableStatusResponse
     */
    CompletableFuture<CheckSqlAuditEnableStatusResponse> checkSqlAuditEnableStatus(CheckSqlAuditEnableStatusRequest request);

    /**
     * @param request the request parameters of CreateDrdsDB  CreateDrdsDBRequest
     * @return CreateDrdsDBResponse
     */
    CompletableFuture<CreateDrdsDBResponse> createDrdsDB(CreateDrdsDBRequest request);

    /**
     * @param request the request parameters of CreateDrdsInstance  CreateDrdsInstanceRequest
     * @return CreateDrdsInstanceResponse
     */
    CompletableFuture<CreateDrdsInstanceResponse> createDrdsInstance(CreateDrdsInstanceRequest request);

    /**
     * @param request the request parameters of CreateInstanceAccount  CreateInstanceAccountRequest
     * @return CreateInstanceAccountResponse
     */
    CompletableFuture<CreateInstanceAccountResponse> createInstanceAccount(CreateInstanceAccountRequest request);

    /**
     * @param request the request parameters of CreateInstanceInternetAddress  CreateInstanceInternetAddressRequest
     * @return CreateInstanceInternetAddressResponse
     */
    CompletableFuture<CreateInstanceInternetAddressResponse> createInstanceInternetAddress(CreateInstanceInternetAddressRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and pricing of PolarDB-X 1.0. For more information, visit the <a href="https://www.aliyun.com/price/product#/rds/detail">pricing page</a>.</p>
     * 
     * @param request the request parameters of CreateOrderForRds  CreateOrderForRdsRequest
     * @return CreateOrderForRdsResponse
     */
    CompletableFuture<CreateOrderForRdsResponse> createOrderForRds(CreateOrderForRdsRequest request);

    /**
     * @param request the request parameters of CreateShardTask  CreateShardTaskRequest
     * @return CreateShardTaskResponse
     */
    CompletableFuture<CreateShardTaskResponse> createShardTask(CreateShardTaskRequest request);

    /**
     * @param request the request parameters of DescribeBackMenu  DescribeBackMenuRequest
     * @return DescribeBackMenuResponse
     */
    CompletableFuture<DescribeBackMenuResponse> describeBackMenu(DescribeBackMenuRequest request);

    /**
     * @param request the request parameters of DescribeBackupDbs  DescribeBackupDbsRequest
     * @return DescribeBackupDbsResponse
     */
    CompletableFuture<DescribeBackupDbsResponse> describeBackupDbs(DescribeBackupDbsRequest request);

    /**
     * @param request the request parameters of DescribeBackupLocal  DescribeBackupLocalRequest
     * @return DescribeBackupLocalResponse
     */
    CompletableFuture<DescribeBackupLocalResponse> describeBackupLocal(DescribeBackupLocalRequest request);

    /**
     * @param request the request parameters of DescribeBackupPolicy  DescribeBackupPolicyRequest
     * @return DescribeBackupPolicyResponse
     */
    CompletableFuture<DescribeBackupPolicyResponse> describeBackupPolicy(DescribeBackupPolicyRequest request);

    /**
     * @param request the request parameters of DescribeBackupSets  DescribeBackupSetsRequest
     * @return DescribeBackupSetsResponse
     */
    CompletableFuture<DescribeBackupSetsResponse> describeBackupSets(DescribeBackupSetsRequest request);

    /**
     * @param request the request parameters of DescribeBackupTimes  DescribeBackupTimesRequest
     * @return DescribeBackupTimesResponse
     */
    CompletableFuture<DescribeBackupTimesResponse> describeBackupTimes(DescribeBackupTimesRequest request);

    /**
     * @param request the request parameters of DescribeBroadcastTables  DescribeBroadcastTablesRequest
     * @return DescribeBroadcastTablesResponse
     */
    CompletableFuture<DescribeBroadcastTablesResponse> describeBroadcastTables(DescribeBroadcastTablesRequest request);

    /**
     * @param request the request parameters of DescribeDbInstanceDbs  DescribeDbInstanceDbsRequest
     * @return DescribeDbInstanceDbsResponse
     */
    CompletableFuture<DescribeDbInstanceDbsResponse> describeDbInstanceDbs(DescribeDbInstanceDbsRequest request);

    /**
     * @param request the request parameters of DescribeDbInstances  DescribeDbInstancesRequest
     * @return DescribeDbInstancesResponse
     */
    CompletableFuture<DescribeDbInstancesResponse> describeDbInstances(DescribeDbInstancesRequest request);

    /**
     * @param request the request parameters of DescribeDrdsDB  DescribeDrdsDBRequest
     * @return DescribeDrdsDBResponse
     */
    CompletableFuture<DescribeDrdsDBResponse> describeDrdsDB(DescribeDrdsDBRequest request);

    /**
     * @param request the request parameters of DescribeDrdsDBCluster  DescribeDrdsDBClusterRequest
     * @return DescribeDrdsDBClusterResponse
     */
    CompletableFuture<DescribeDrdsDBClusterResponse> describeDrdsDBCluster(DescribeDrdsDBClusterRequest request);

    /**
     * @param request the request parameters of DescribeDrdsDBIpWhiteList  DescribeDrdsDBIpWhiteListRequest
     * @return DescribeDrdsDBIpWhiteListResponse
     */
    CompletableFuture<DescribeDrdsDBIpWhiteListResponse> describeDrdsDBIpWhiteList(DescribeDrdsDBIpWhiteListRequest request);

    /**
     * @param request the request parameters of DescribeDrdsDBs  DescribeDrdsDBsRequest
     * @return DescribeDrdsDBsResponse
     */
    CompletableFuture<DescribeDrdsDBsResponse> describeDrdsDBs(DescribeDrdsDBsRequest request);

    /**
     * @param request the request parameters of DescribeDrdsDbInstance  DescribeDrdsDbInstanceRequest
     * @return DescribeDrdsDbInstanceResponse
     */
    CompletableFuture<DescribeDrdsDbInstanceResponse> describeDrdsDbInstance(DescribeDrdsDbInstanceRequest request);

    /**
     * @param request the request parameters of DescribeDrdsDbInstances  DescribeDrdsDbInstancesRequest
     * @return DescribeDrdsDbInstancesResponse
     */
    CompletableFuture<DescribeDrdsDbInstancesResponse> describeDrdsDbInstances(DescribeDrdsDbInstancesRequest request);

    /**
     * @param request the request parameters of DescribeDrdsDbRdsNameList  DescribeDrdsDbRdsNameListRequest
     * @return DescribeDrdsDbRdsNameListResponse
     */
    CompletableFuture<DescribeDrdsDbRdsNameListResponse> describeDrdsDbRdsNameList(DescribeDrdsDbRdsNameListRequest request);

    /**
     * @param request the request parameters of DescribeDrdsInstance  DescribeDrdsInstanceRequest
     * @return DescribeDrdsInstanceResponse
     */
    CompletableFuture<DescribeDrdsInstanceResponse> describeDrdsInstance(DescribeDrdsInstanceRequest request);

    /**
     * @param request the request parameters of DescribeDrdsInstanceDbMonitor  DescribeDrdsInstanceDbMonitorRequest
     * @return DescribeDrdsInstanceDbMonitorResponse
     */
    CompletableFuture<DescribeDrdsInstanceDbMonitorResponse> describeDrdsInstanceDbMonitor(DescribeDrdsInstanceDbMonitorRequest request);

    /**
     * @param request the request parameters of DescribeDrdsInstanceLevelTasks  DescribeDrdsInstanceLevelTasksRequest
     * @return DescribeDrdsInstanceLevelTasksResponse
     */
    CompletableFuture<DescribeDrdsInstanceLevelTasksResponse> describeDrdsInstanceLevelTasks(DescribeDrdsInstanceLevelTasksRequest request);

    /**
     * @param request the request parameters of DescribeDrdsInstanceMonitor  DescribeDrdsInstanceMonitorRequest
     * @return DescribeDrdsInstanceMonitorResponse
     */
    CompletableFuture<DescribeDrdsInstanceMonitorResponse> describeDrdsInstanceMonitor(DescribeDrdsInstanceMonitorRequest request);

    /**
     * @param request the request parameters of DescribeDrdsInstanceVersion  DescribeDrdsInstanceVersionRequest
     * @return DescribeDrdsInstanceVersionResponse
     */
    CompletableFuture<DescribeDrdsInstanceVersionResponse> describeDrdsInstanceVersion(DescribeDrdsInstanceVersionRequest request);

    /**
     * @param request the request parameters of DescribeDrdsInstances  DescribeDrdsInstancesRequest
     * @return DescribeDrdsInstancesResponse
     */
    CompletableFuture<DescribeDrdsInstancesResponse> describeDrdsInstances(DescribeDrdsInstancesRequest request);

    /**
     * @param request the request parameters of DescribeDrdsParams  DescribeDrdsParamsRequest
     * @return DescribeDrdsParamsResponse
     */
    CompletableFuture<DescribeDrdsParamsResponse> describeDrdsParams(DescribeDrdsParamsRequest request);

    /**
     * @param request the request parameters of DescribeDrdsRdsInstances  DescribeDrdsRdsInstancesRequest
     * @return DescribeDrdsRdsInstancesResponse
     */
    CompletableFuture<DescribeDrdsRdsInstancesResponse> describeDrdsRdsInstances(DescribeDrdsRdsInstancesRequest request);

    /**
     * @param request the request parameters of DescribeDrdsShardingDbs  DescribeDrdsShardingDbsRequest
     * @return DescribeDrdsShardingDbsResponse
     */
    CompletableFuture<DescribeDrdsShardingDbsResponse> describeDrdsShardingDbs(DescribeDrdsShardingDbsRequest request);

    /**
     * @param request the request parameters of DescribeDrdsSlowSqls  DescribeDrdsSlowSqlsRequest
     * @return DescribeDrdsSlowSqlsResponse
     */
    CompletableFuture<DescribeDrdsSlowSqlsResponse> describeDrdsSlowSqls(DescribeDrdsSlowSqlsRequest request);

    /**
     * @param request the request parameters of DescribeDrdsSqlAuditStatus  DescribeDrdsSqlAuditStatusRequest
     * @return DescribeDrdsSqlAuditStatusResponse
     */
    CompletableFuture<DescribeDrdsSqlAuditStatusResponse> describeDrdsSqlAuditStatus(DescribeDrdsSqlAuditStatusRequest request);

    /**
     * @param request the request parameters of DescribeDrdsTasks  DescribeDrdsTasksRequest
     * @return DescribeDrdsTasksResponse
     */
    CompletableFuture<DescribeDrdsTasksResponse> describeDrdsTasks(DescribeDrdsTasksRequest request);

    /**
     * @param request the request parameters of DescribeExpandLogicTableInfoList  DescribeExpandLogicTableInfoListRequest
     * @return DescribeExpandLogicTableInfoListResponse
     */
    CompletableFuture<DescribeExpandLogicTableInfoListResponse> describeExpandLogicTableInfoList(DescribeExpandLogicTableInfoListRequest request);

    /**
     * @param request the request parameters of DescribeHotDbList  DescribeHotDbListRequest
     * @return DescribeHotDbListResponse
     */
    CompletableFuture<DescribeHotDbListResponse> describeHotDbList(DescribeHotDbListRequest request);

    /**
     * @param request the request parameters of DescribeInstDbLogInfo  DescribeInstDbLogInfoRequest
     * @return DescribeInstDbLogInfoResponse
     */
    CompletableFuture<DescribeInstDbLogInfoResponse> describeInstDbLogInfo(DescribeInstDbLogInfoRequest request);

    /**
     * @param request the request parameters of DescribeInstDbSlsInfo  DescribeInstDbSlsInfoRequest
     * @return DescribeInstDbSlsInfoResponse
     */
    CompletableFuture<DescribeInstDbSlsInfoResponse> describeInstDbSlsInfo(DescribeInstDbSlsInfoRequest request);

    /**
     * @param request the request parameters of DescribeInstanceAccounts  DescribeInstanceAccountsRequest
     * @return DescribeInstanceAccountsResponse
     */
    CompletableFuture<DescribeInstanceAccountsResponse> describeInstanceAccounts(DescribeInstanceAccountsRequest request);

    /**
     * @param request the request parameters of DescribeInstanceSwitchAzone  DescribeInstanceSwitchAzoneRequest
     * @return DescribeInstanceSwitchAzoneResponse
     */
    CompletableFuture<DescribeInstanceSwitchAzoneResponse> describeInstanceSwitchAzone(DescribeInstanceSwitchAzoneRequest request);

    /**
     * <b>description</b> :
     * <hr>
     * 
     * @param request the request parameters of DescribeInstanceSwitchNetwork  DescribeInstanceSwitchNetworkRequest
     * @return DescribeInstanceSwitchNetworkResponse
     */
    CompletableFuture<DescribeInstanceSwitchNetworkResponse> describeInstanceSwitchNetwork(DescribeInstanceSwitchNetworkRequest request);

    /**
     * @param request the request parameters of DescribePreCheckResult  DescribePreCheckResultRequest
     * @return DescribePreCheckResultResponse
     */
    CompletableFuture<DescribePreCheckResultResponse> describePreCheckResult(DescribePreCheckResultRequest request);

    /**
     * @param request the request parameters of DescribeRDSPerformance  DescribeRDSPerformanceRequest
     * @return DescribeRDSPerformanceResponse
     */
    CompletableFuture<DescribeRDSPerformanceResponse> describeRDSPerformance(DescribeRDSPerformanceRequest request);

    /**
     * @param request the request parameters of DescribeRdsCommodity  DescribeRdsCommodityRequest
     * @return DescribeRdsCommodityResponse
     */
    CompletableFuture<DescribeRdsCommodityResponse> describeRdsCommodity(DescribeRdsCommodityRequest request);

    /**
     * @param request the request parameters of DescribeRdsPerformanceSummary  DescribeRdsPerformanceSummaryRequest
     * @return DescribeRdsPerformanceSummaryResponse
     */
    CompletableFuture<DescribeRdsPerformanceSummaryResponse> describeRdsPerformanceSummary(DescribeRdsPerformanceSummaryRequest request);

    /**
     * @param request the request parameters of DescribeRdsSuperAccountInstances  DescribeRdsSuperAccountInstancesRequest
     * @return DescribeRdsSuperAccountInstancesResponse
     */
    CompletableFuture<DescribeRdsSuperAccountInstancesResponse> describeRdsSuperAccountInstances(DescribeRdsSuperAccountInstancesRequest request);

    /**
     * @param request the request parameters of DescribeRecycleBinStatus  DescribeRecycleBinStatusRequest
     * @return DescribeRecycleBinStatusResponse
     */
    CompletableFuture<DescribeRecycleBinStatusResponse> describeRecycleBinStatus(DescribeRecycleBinStatusRequest request);

    /**
     * @param request the request parameters of DescribeRecycleBinTables  DescribeRecycleBinTablesRequest
     * @return DescribeRecycleBinTablesResponse
     */
    CompletableFuture<DescribeRecycleBinTablesResponse> describeRecycleBinTables(DescribeRecycleBinTablesRequest request);

    /**
     * @param request the request parameters of DescribeRestoreOrder  DescribeRestoreOrderRequest
     * @return DescribeRestoreOrderResponse
     */
    CompletableFuture<DescribeRestoreOrderResponse> describeRestoreOrder(DescribeRestoreOrderRequest request);

    /**
     * @param request the request parameters of DescribeShardTaskInfo  DescribeShardTaskInfoRequest
     * @return DescribeShardTaskInfoResponse
     */
    CompletableFuture<DescribeShardTaskInfoResponse> describeShardTaskInfo(DescribeShardTaskInfoRequest request);

    /**
     * @param request the request parameters of DescribeSqlFlashbakTask  DescribeSqlFlashbakTaskRequest
     * @return DescribeSqlFlashbakTaskResponse
     */
    CompletableFuture<DescribeSqlFlashbakTaskResponse> describeSqlFlashbakTask(DescribeSqlFlashbakTaskRequest request);

    /**
     * @param request the request parameters of DescribeTable  DescribeTableRequest
     * @return DescribeTableResponse
     */
    CompletableFuture<DescribeTableResponse> describeTable(DescribeTableRequest request);

    /**
     * @param request the request parameters of DescribeTableListByType  DescribeTableListByTypeRequest
     * @return DescribeTableListByTypeResponse
     */
    CompletableFuture<DescribeTableListByTypeResponse> describeTableListByType(DescribeTableListByTypeRequest request);

    /**
     * @param request the request parameters of DescribeTables  DescribeTablesRequest
     * @return DescribeTablesResponse
     */
    CompletableFuture<DescribeTablesResponse> describeTables(DescribeTablesRequest request);

    /**
     * @param request the request parameters of DisableSqlAudit  DisableSqlAuditRequest
     * @return DisableSqlAuditResponse
     */
    CompletableFuture<DisableSqlAuditResponse> disableSqlAudit(DisableSqlAuditRequest request);

    /**
     * @param request the request parameters of EnableInstanceIpv6Address  EnableInstanceIpv6AddressRequest
     * @return EnableInstanceIpv6AddressResponse
     */
    CompletableFuture<EnableInstanceIpv6AddressResponse> enableInstanceIpv6Address(EnableInstanceIpv6AddressRequest request);

    /**
     * @param request the request parameters of EnableSqlAudit  EnableSqlAuditRequest
     * @return EnableSqlAuditResponse
     */
    CompletableFuture<EnableSqlAuditResponse> enableSqlAudit(EnableSqlAuditRequest request);

    /**
     * @param request the request parameters of EnableSqlFlashbackMatchSwitch  EnableSqlFlashbackMatchSwitchRequest
     * @return EnableSqlFlashbackMatchSwitchResponse
     */
    CompletableFuture<EnableSqlFlashbackMatchSwitchResponse> enableSqlFlashbackMatchSwitch(EnableSqlFlashbackMatchSwitchRequest request);

    /**
     * @param request the request parameters of FlashbackRecycleBinTable  FlashbackRecycleBinTableRequest
     * @return FlashbackRecycleBinTableResponse
     */
    CompletableFuture<FlashbackRecycleBinTableResponse> flashbackRecycleBinTable(FlashbackRecycleBinTableRequest request);

    /**
     * @param request the request parameters of GetDrdsDbRdsRelationInfo  GetDrdsDbRdsRelationInfoRequest
     * @return GetDrdsDbRdsRelationInfoResponse
     */
    CompletableFuture<GetDrdsDbRdsRelationInfoResponse> getDrdsDbRdsRelationInfo(GetDrdsDbRdsRelationInfoRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of ManagePrivateRds  ManagePrivateRdsRequest
     * @return ManagePrivateRdsResponse
     */
    CompletableFuture<ManagePrivateRdsResponse> managePrivateRds(ManagePrivateRdsRequest request);

    /**
     * @param request the request parameters of ModifyAccountDescription  ModifyAccountDescriptionRequest
     * @return ModifyAccountDescriptionResponse
     */
    CompletableFuture<ModifyAccountDescriptionResponse> modifyAccountDescription(ModifyAccountDescriptionRequest request);

    /**
     * @param request the request parameters of ModifyAccountPrivilege  ModifyAccountPrivilegeRequest
     * @return ModifyAccountPrivilegeResponse
     */
    CompletableFuture<ModifyAccountPrivilegeResponse> modifyAccountPrivilege(ModifyAccountPrivilegeRequest request);

    /**
     * @param request the request parameters of ModifyDrdsInstanceDescription  ModifyDrdsInstanceDescriptionRequest
     * @return ModifyDrdsInstanceDescriptionResponse
     */
    CompletableFuture<ModifyDrdsInstanceDescriptionResponse> modifyDrdsInstanceDescription(ModifyDrdsInstanceDescriptionRequest request);

    /**
     * @param request the request parameters of ModifyDrdsIpWhiteList  ModifyDrdsIpWhiteListRequest
     * @return ModifyDrdsIpWhiteListResponse
     */
    CompletableFuture<ModifyDrdsIpWhiteListResponse> modifyDrdsIpWhiteList(ModifyDrdsIpWhiteListRequest request);

    /**
     * @param request the request parameters of ModifyPolarDbReadWeight  ModifyPolarDbReadWeightRequest
     * @return ModifyPolarDbReadWeightResponse
     */
    CompletableFuture<ModifyPolarDbReadWeightResponse> modifyPolarDbReadWeight(ModifyPolarDbReadWeightRequest request);

    /**
     * @param request the request parameters of ModifyRdsReadWeight  ModifyRdsReadWeightRequest
     * @return ModifyRdsReadWeightResponse
     */
    CompletableFuture<ModifyRdsReadWeightResponse> modifyRdsReadWeight(ModifyRdsReadWeightRequest request);

    /**
     * @param request the request parameters of PutStartBackup  PutStartBackupRequest
     * @return PutStartBackupResponse
     */
    CompletableFuture<PutStartBackupResponse> putStartBackup(PutStartBackupRequest request);

    /**
     * @param request the request parameters of RefreshDrdsAtomUrl  RefreshDrdsAtomUrlRequest
     * @return RefreshDrdsAtomUrlResponse
     */
    CompletableFuture<RefreshDrdsAtomUrlResponse> refreshDrdsAtomUrl(RefreshDrdsAtomUrlRequest request);

    /**
     * @param request the request parameters of ReleaseInstanceInternetAddress  ReleaseInstanceInternetAddressRequest
     * @return ReleaseInstanceInternetAddressResponse
     */
    CompletableFuture<ReleaseInstanceInternetAddressResponse> releaseInstanceInternetAddress(ReleaseInstanceInternetAddressRequest request);

    /**
     * @param request the request parameters of RemoveBackupsSet  RemoveBackupsSetRequest
     * @return RemoveBackupsSetResponse
     */
    CompletableFuture<RemoveBackupsSetResponse> removeBackupsSet(RemoveBackupsSetRequest request);

    /**
     * @param request the request parameters of RemoveDrdsDb  RemoveDrdsDbRequest
     * @return RemoveDrdsDbResponse
     */
    CompletableFuture<RemoveDrdsDbResponse> removeDrdsDb(RemoveDrdsDbRequest request);

    /**
     * @param request the request parameters of RemoveDrdsDbFailedRecord  RemoveDrdsDbFailedRecordRequest
     * @return RemoveDrdsDbFailedRecordResponse
     */
    CompletableFuture<RemoveDrdsDbFailedRecordResponse> removeDrdsDbFailedRecord(RemoveDrdsDbFailedRecordRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>You can call this operation to release an instance that is charged based on only the pay-as-you-go billing method.</li>
     * <li>If the specifications of the instance are being changed, or one or more databases exist in the instance, you cannot call this operation to release the instance.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of RemoveDrdsInstance  RemoveDrdsInstanceRequest
     * @return RemoveDrdsInstanceResponse
     */
    CompletableFuture<RemoveDrdsInstanceResponse> removeDrdsInstance(RemoveDrdsInstanceRequest request);

    /**
     * @param request the request parameters of RemoveInstanceAccount  RemoveInstanceAccountRequest
     * @return RemoveInstanceAccountResponse
     */
    CompletableFuture<RemoveInstanceAccountResponse> removeInstanceAccount(RemoveInstanceAccountRequest request);

    /**
     * @param request the request parameters of RemoveRecycleBinTable  RemoveRecycleBinTableRequest
     * @return RemoveRecycleBinTableResponse
     */
    CompletableFuture<RemoveRecycleBinTableResponse> removeRecycleBinTable(RemoveRecycleBinTableRequest request);

    /**
     * @param request the request parameters of RestartDrdsInstance  RestartDrdsInstanceRequest
     * @return RestartDrdsInstanceResponse
     */
    CompletableFuture<RestartDrdsInstanceResponse> restartDrdsInstance(RestartDrdsInstanceRequest request);

    /**
     * @param request the request parameters of RollbackInstanceVersion  RollbackInstanceVersionRequest
     * @return RollbackInstanceVersionResponse
     */
    CompletableFuture<RollbackInstanceVersionResponse> rollbackInstanceVersion(RollbackInstanceVersionRequest request);

    /**
     * @param request the request parameters of SetBackupLocal  SetBackupLocalRequest
     * @return SetBackupLocalResponse
     */
    CompletableFuture<SetBackupLocalResponse> setBackupLocal(SetBackupLocalRequest request);

    /**
     * @param request the request parameters of SetBackupPolicy  SetBackupPolicyRequest
     * @return SetBackupPolicyResponse
     */
    CompletableFuture<SetBackupPolicyResponse> setBackupPolicy(SetBackupPolicyRequest request);

    /**
     * @param request the request parameters of SetupBroadcastTables  SetupBroadcastTablesRequest
     * @return SetupBroadcastTablesResponse
     */
    CompletableFuture<SetupBroadcastTablesResponse> setupBroadcastTables(SetupBroadcastTablesRequest request);

    /**
     * @param request the request parameters of SetupDrdsParams  SetupDrdsParamsRequest
     * @return SetupDrdsParamsResponse
     */
    CompletableFuture<SetupDrdsParamsResponse> setupDrdsParams(SetupDrdsParamsRequest request);

    /**
     * @param request the request parameters of SetupRecycleBinStatus  SetupRecycleBinStatusRequest
     * @return SetupRecycleBinStatusResponse
     */
    CompletableFuture<SetupRecycleBinStatusResponse> setupRecycleBinStatus(SetupRecycleBinStatusRequest request);

    /**
     * @param request the request parameters of SetupTable  SetupTableRequest
     * @return SetupTableResponse
     */
    CompletableFuture<SetupTableResponse> setupTable(SetupTableRequest request);

    /**
     * @param request the request parameters of StartRestore  StartRestoreRequest
     * @return StartRestoreResponse
     */
    CompletableFuture<StartRestoreResponse> startRestore(StartRestoreRequest request);

    /**
     * @param request the request parameters of SubmitCleanTask  SubmitCleanTaskRequest
     * @return SubmitCleanTaskResponse
     */
    CompletableFuture<SubmitCleanTaskResponse> submitCleanTask(SubmitCleanTaskRequest request);

    /**
     * @param request the request parameters of SubmitHotExpandPreCheckTask  SubmitHotExpandPreCheckTaskRequest
     * @return SubmitHotExpandPreCheckTaskResponse
     */
    CompletableFuture<SubmitHotExpandPreCheckTaskResponse> submitHotExpandPreCheckTask(SubmitHotExpandPreCheckTaskRequest request);

    /**
     * @param request the request parameters of SubmitHotExpandTask  SubmitHotExpandTaskRequest
     * @return SubmitHotExpandTaskResponse
     */
    CompletableFuture<SubmitHotExpandTaskResponse> submitHotExpandTask(SubmitHotExpandTaskRequest request);

    /**
     * @param request the request parameters of SubmitSmoothExpandPreCheck  SubmitSmoothExpandPreCheckRequest
     * @return SubmitSmoothExpandPreCheckResponse
     */
    CompletableFuture<SubmitSmoothExpandPreCheckResponse> submitSmoothExpandPreCheck(SubmitSmoothExpandPreCheckRequest request);

    /**
     * @param request the request parameters of SubmitSmoothExpandPreCheckTask  SubmitSmoothExpandPreCheckTaskRequest
     * @return SubmitSmoothExpandPreCheckTaskResponse
     */
    CompletableFuture<SubmitSmoothExpandPreCheckTaskResponse> submitSmoothExpandPreCheckTask(SubmitSmoothExpandPreCheckTaskRequest request);

    /**
     * @param request the request parameters of SubmitSqlFlashbackTask  SubmitSqlFlashbackTaskRequest
     * @return SubmitSqlFlashbackTaskResponse
     */
    CompletableFuture<SubmitSqlFlashbackTaskResponse> submitSqlFlashbackTask(SubmitSqlFlashbackTaskRequest request);

    /**
     * @param request the request parameters of SwitchGlobalBroadcastType  SwitchGlobalBroadcastTypeRequest
     * @return SwitchGlobalBroadcastTypeResponse
     */
    CompletableFuture<SwitchGlobalBroadcastTypeResponse> switchGlobalBroadcastType(SwitchGlobalBroadcastTypeRequest request);

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * @param request the request parameters of UpdateInstanceNetwork  UpdateInstanceNetworkRequest
     * @return UpdateInstanceNetworkResponse
     */
    CompletableFuture<UpdateInstanceNetworkResponse> updateInstanceNetwork(UpdateInstanceNetworkRequest request);

    /**
     * @param request the request parameters of UpdatePrivateRdsClass  UpdatePrivateRdsClassRequest
     * @return UpdatePrivateRdsClassResponse
     */
    CompletableFuture<UpdatePrivateRdsClassResponse> updatePrivateRdsClass(UpdatePrivateRdsClassRequest request);

    /**
     * @param request the request parameters of UpdateResourceGroupAttribute  UpdateResourceGroupAttributeRequest
     * @return UpdateResourceGroupAttributeResponse
     */
    CompletableFuture<UpdateResourceGroupAttributeResponse> updateResourceGroupAttribute(UpdateResourceGroupAttributeRequest request);

    /**
     * @param request the request parameters of UpgradeHiStoreInstance  UpgradeHiStoreInstanceRequest
     * @return UpgradeHiStoreInstanceResponse
     */
    CompletableFuture<UpgradeHiStoreInstanceResponse> upgradeHiStoreInstance(UpgradeHiStoreInstanceRequest request);

    /**
     * @param request the request parameters of UpgradeInstanceVersion  UpgradeInstanceVersionRequest
     * @return UpgradeInstanceVersionResponse
     */
    CompletableFuture<UpgradeInstanceVersionResponse> upgradeInstanceVersion(UpgradeInstanceVersionRequest request);

    /**
     * @param request the request parameters of ValidateShardTask  ValidateShardTaskRequest
     * @return ValidateShardTaskResponse
     */
    CompletableFuture<ValidateShardTaskResponse> validateShardTask(ValidateShardTaskRequest request);

}
