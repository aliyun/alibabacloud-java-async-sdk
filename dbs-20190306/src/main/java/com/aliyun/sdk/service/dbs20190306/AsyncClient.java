// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dbs20190306.models.*;
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
     * @param request the request parameters of ConfigureBackupPlan  ConfigureBackupPlanRequest
     * @return ConfigureBackupPlanResponse
     */
    CompletableFuture<ConfigureBackupPlanResponse> configureBackupPlan(ConfigureBackupPlanRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/70005.html">pricing</a> of Database Backup (DBS).</p>
     * 
     * @param request the request parameters of CreateAndStartBackupPlan  CreateAndStartBackupPlanRequest
     * @return CreateAndStartBackupPlanResponse
     */
    CompletableFuture<CreateAndStartBackupPlanResponse> createAndStartBackupPlan(CreateAndStartBackupPlanRequest request);

    /**
     * <b>description</b> :
     * <p>For more information about how to create a backup schedule in the Database Backup (DBS) console, see <a href="https://help.aliyun.com/document_detail/65909.html">Purchase a backup schedule</a>.</p>
     * 
     * @param request the request parameters of CreateBackupPlan  CreateBackupPlanRequest
     * @return CreateBackupPlanResponse
     */
    CompletableFuture<CreateBackupPlanResponse> createBackupPlan(CreateBackupPlanRequest request);

    /**
     * @param request the request parameters of CreateFullBackupSetDownload  CreateFullBackupSetDownloadRequest
     * @return CreateFullBackupSetDownloadResponse
     */
    CompletableFuture<CreateFullBackupSetDownloadResponse> createFullBackupSetDownload(CreateFullBackupSetDownloadRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation returns a task ID. You can call the <a href="https://help.aliyun.com/document_detail/2869852.html">GetDBListFromAgent</a> operation to query the task result based on the task ID.</p>
     * 
     * @param request the request parameters of CreateGetDBListFromAgentTask  CreateGetDBListFromAgentTaskRequest
     * @return CreateGetDBListFromAgentTaskResponse
     */
    CompletableFuture<CreateGetDBListFromAgentTaskResponse> createGetDBListFromAgentTask(CreateGetDBListFromAgentTaskRequest request);

    /**
     * @param request the request parameters of CreateIncrementBackupSetDownload  CreateIncrementBackupSetDownloadRequest
     * @return CreateIncrementBackupSetDownloadResponse
     */
    CompletableFuture<CreateIncrementBackupSetDownloadResponse> createIncrementBackupSetDownload(CreateIncrementBackupSetDownloadRequest request);

    /**
     * @param request the request parameters of CreateRestoreTask  CreateRestoreTaskRequest
     * @return CreateRestoreTaskResponse
     */
    CompletableFuture<CreateRestoreTaskResponse> createRestoreTask(CreateRestoreTaskRequest request);

    /**
     * @param request the request parameters of DescribeBackupGatewayList  DescribeBackupGatewayListRequest
     * @return DescribeBackupGatewayListResponse
     */
    CompletableFuture<DescribeBackupGatewayListResponse> describeBackupGatewayList(DescribeBackupGatewayListRequest request);

    /**
     * @param request the request parameters of DescribeBackupPlanBilling  DescribeBackupPlanBillingRequest
     * @return DescribeBackupPlanBillingResponse
     */
    CompletableFuture<DescribeBackupPlanBillingResponse> describeBackupPlanBilling(DescribeBackupPlanBillingRequest request);

    /**
     * <b>description</b> :
     * <p>Before using this interface, please activate the OSS service in advance. For more information, see <a href="https://help.aliyun.com/document_detail/31817.html">Object Storage Service (OSS)</a>.</p>
     * 
     * @param request the request parameters of DescribeBackupPlanList  DescribeBackupPlanListRequest
     * @return DescribeBackupPlanListResponse
     */
    CompletableFuture<DescribeBackupPlanListResponse> describeBackupPlanList(DescribeBackupPlanListRequest request);

    /**
     * @param request the request parameters of DescribeBackupSetDownloadTaskList  DescribeBackupSetDownloadTaskListRequest
     * @return DescribeBackupSetDownloadTaskListResponse
     */
    CompletableFuture<DescribeBackupSetDownloadTaskListResponse> describeBackupSetDownloadTaskList(DescribeBackupSetDownloadTaskListRequest request);

    /**
     * @param request the request parameters of DescribeDLAService  DescribeDLAServiceRequest
     * @return DescribeDLAServiceResponse
     */
    CompletableFuture<DescribeDLAServiceResponse> describeDLAService(DescribeDLAServiceRequest request);

    /**
     * @param request the request parameters of DescribeFullBackupList  DescribeFullBackupListRequest
     * @return DescribeFullBackupListResponse
     */
    CompletableFuture<DescribeFullBackupListResponse> describeFullBackupList(DescribeFullBackupListRequest request);

    /**
     * @param request the request parameters of DescribeIncrementBackupList  DescribeIncrementBackupListRequest
     * @return DescribeIncrementBackupListResponse
     */
    CompletableFuture<DescribeIncrementBackupListResponse> describeIncrementBackupList(DescribeIncrementBackupListRequest request);

    /**
     * @param request the request parameters of DescribeJobErrorCode  DescribeJobErrorCodeRequest
     * @return DescribeJobErrorCodeResponse
     */
    CompletableFuture<DescribeJobErrorCodeResponse> describeJobErrorCode(DescribeJobErrorCodeRequest request);

    /**
     * @param request the request parameters of DescribeNodeCidrList  DescribeNodeCidrListRequest
     * @return DescribeNodeCidrListResponse
     */
    CompletableFuture<DescribeNodeCidrListResponse> describeNodeCidrList(DescribeNodeCidrListRequest request);

    /**
     * @param request the request parameters of DescribePreCheckProgressList  DescribePreCheckProgressListRequest
     * @return DescribePreCheckProgressListResponse
     */
    CompletableFuture<DescribePreCheckProgressListResponse> describePreCheckProgressList(DescribePreCheckProgressListRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * @param request the request parameters of DescribeRestoreRangeInfo  DescribeRestoreRangeInfoRequest
     * @return DescribeRestoreRangeInfoResponse
     */
    CompletableFuture<DescribeRestoreRangeInfoResponse> describeRestoreRangeInfo(DescribeRestoreRangeInfoRequest request);

    /**
     * @param request the request parameters of DescribeRestoreTaskList  DescribeRestoreTaskListRequest
     * @return DescribeRestoreTaskListResponse
     */
    CompletableFuture<DescribeRestoreTaskListResponse> describeRestoreTaskList(DescribeRestoreTaskListRequest request);

    /**
     * <b>description</b> :
     * <h3>Impact</h3>
     * <p>After you disable the incremental log backup feature, your backup schedule no longer performs incremental log backups.</p>
     * 
     * @param request the request parameters of DisableBackupLog  DisableBackupLogRequest
     * @return DisableBackupLogResponse
     */
    CompletableFuture<DisableBackupLogResponse> disableBackupLog(DisableBackupLogRequest request);

    /**
     * <b>description</b> :
     * <h2>Impact</h2>
     * <p>It is free to enable the incremental log backup feature. However, the backup traffic and storage capacity generated by the feature are billed in the same way as the full backup feature, and can be offset by the free quota of backup schedules or storage plans.</p>
     * 
     * @param request the request parameters of EnableBackupLog  EnableBackupLogRequest
     * @return EnableBackupLogResponse
     */
    CompletableFuture<EnableBackupLogResponse> enableBackupLog(EnableBackupLogRequest request);

    /**
     * @param request the request parameters of GetDBListFromAgent  GetDBListFromAgentRequest
     * @return GetDBListFromAgentResponse
     */
    CompletableFuture<GetDBListFromAgentResponse> getDBListFromAgent(GetDBListFromAgentRequest request);

    /**
     * @param request the request parameters of InitializeDbsServiceLinkedRole  InitializeDbsServiceLinkedRoleRequest
     * @return InitializeDbsServiceLinkedRoleResponse
     */
    CompletableFuture<InitializeDbsServiceLinkedRoleResponse> initializeDbsServiceLinkedRole(InitializeDbsServiceLinkedRoleRequest request);

    /**
     * @param request the request parameters of ModifyBackupObjects  ModifyBackupObjectsRequest
     * @return ModifyBackupObjectsResponse
     */
    CompletableFuture<ModifyBackupObjectsResponse> modifyBackupObjects(ModifyBackupObjectsRequest request);

    /**
     * @param request the request parameters of ModifyBackupPlanName  ModifyBackupPlanNameRequest
     * @return ModifyBackupPlanNameResponse
     */
    CompletableFuture<ModifyBackupPlanNameResponse> modifyBackupPlanName(ModifyBackupPlanNameRequest request);

    /**
     * @param request the request parameters of ModifyBackupSetDownloadRules  ModifyBackupSetDownloadRulesRequest
     * @return ModifyBackupSetDownloadRulesResponse
     */
    CompletableFuture<ModifyBackupSetDownloadRulesResponse> modifyBackupSetDownloadRules(ModifyBackupSetDownloadRulesRequest request);

    /**
     * @param request the request parameters of ModifyBackupSourceEndpoint  ModifyBackupSourceEndpointRequest
     * @return ModifyBackupSourceEndpointResponse
     */
    CompletableFuture<ModifyBackupSourceEndpointResponse> modifyBackupSourceEndpoint(ModifyBackupSourceEndpointRequest request);

    /**
     * @param request the request parameters of ModifyBackupStrategy  ModifyBackupStrategyRequest
     * @return ModifyBackupStrategyResponse
     */
    CompletableFuture<ModifyBackupStrategyResponse> modifyBackupStrategy(ModifyBackupStrategyRequest request);

    /**
     * @param request the request parameters of ModifyStorageStrategy  ModifyStorageStrategyRequest
     * @return ModifyStorageStrategyResponse
     */
    CompletableFuture<ModifyStorageStrategyResponse> modifyStorageStrategy(ModifyStorageStrategyRequest request);

    /**
     * <b>description</b> :
     * <h2>Impacts</h2>
     * <p>After a pay-as-you-go backup schedule is released, it stops providing services. Database Backup (DBS) no longer charges you fees for this backup schedule.</p>
     * 
     * @param request the request parameters of ReleaseBackupPlan  ReleaseBackupPlanRequest
     * @return ReleaseBackupPlanResponse
     */
    CompletableFuture<ReleaseBackupPlanResponse> releaseBackupPlan(ReleaseBackupPlanRequest request);

    /**
     * @param request the request parameters of RenewBackupPlan  RenewBackupPlanRequest
     * @return RenewBackupPlanResponse
     */
    CompletableFuture<RenewBackupPlanResponse> renewBackupPlan(RenewBackupPlanRequest request);

    /**
     * @param request the request parameters of StartBackupPlan  StartBackupPlanRequest
     * @return StartBackupPlanResponse
     */
    CompletableFuture<StartBackupPlanResponse> startBackupPlan(StartBackupPlanRequest request);

    /**
     * @param request the request parameters of StartRestoreTask  StartRestoreTaskRequest
     * @return StartRestoreTaskResponse
     */
    CompletableFuture<StartRestoreTaskResponse> startRestoreTask(StartRestoreTaskRequest request);

    /**
     * @param request the request parameters of StopBackupPlan  StopBackupPlanRequest
     * @return StopBackupPlanResponse
     */
    CompletableFuture<StopBackupPlanResponse> stopBackupPlan(StopBackupPlanRequest request);

    /**
     * @param request the request parameters of UpgradeBackupPlan  UpgradeBackupPlanRequest
     * @return UpgradeBackupPlanResponse
     */
    CompletableFuture<UpgradeBackupPlanResponse> upgradeBackupPlan(UpgradeBackupPlanRequest request);

}
