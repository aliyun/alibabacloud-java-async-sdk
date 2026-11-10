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
     * <p>Before you call this operation, ensure that you understand the <a href="https://help.aliyun.com/document_detail/70005.html">billing methods and pricing</a> of Database Backup (DBS).</p>
     * 
     * @param request the request parameters of CreateAndStartBackupPlan  CreateAndStartBackupPlanRequest
     * @return CreateAndStartBackupPlanResponse
     */
    CompletableFuture<CreateAndStartBackupPlanResponse> createAndStartBackupPlan(CreateAndStartBackupPlanRequest request);

    /**
     * <b>description</b> :
     * <p>To perform this operation in the console, see <a href="https://help.aliyun.com/document_detail/65909.html">Purchase a backup plan</a>.</p>
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
     * <p>This API operation returns a TaskId. You can call the <a href="https://help.aliyun.com/document_detail/2869852.html">GetDBListFromAgent</a> operation to query the result.</p>
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
     * <b>description</b> :
     * <h3>Related operations</h3>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/85543.html">Restore a database</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/197144.html">Restore configuration tutorials for various databases</a></li>
     * </ul>
     * 
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
     * <p>Ensure Object Storage Service (OSS) is enabled before you use this operation. For more information, see <a href="https://help.aliyun.com/document_detail/31817.html">Object Storage Service</a>.</p>
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
     * <h2>Impact</h2>
     * <p>Calling this operation stops the specified backup plan from creating new incremental backups.</p>
     * 
     * @param request the request parameters of DisableBackupLog  DisableBackupLogRequest
     * @return DisableBackupLogResponse
     */
    CompletableFuture<DisableBackupLogResponse> disableBackupLog(DisableBackupLogRequest request);

    /**
     * <b>description</b> :
     * <h2>Impact</h2>
     * <p>Enabling log backup does not incur direct charges. However, log backups generate backup traffic and storage usage. These resources are billed at the same rate as full backups. You can use the free quota from your backup plan or storage plan to offset these charges.</p>
     * 
     * @param request the request parameters of EnableBackupLog  EnableBackupLogRequest
     * @return EnableBackupLogResponse
     */
    CompletableFuture<EnableBackupLogResponse> enableBackupLog(EnableBackupLogRequest request);

    /**
     * <b>description</b> :
     * <p>You must call the <a href="https://help.aliyun.com/document_detail/2869847.html">CreateGetDBListFromAgentTask</a> operation to create an asynchronous task and obtain the TaskId (asynchronous task ID). Pass the TaskId to the GetDBListFromAgent operation to retrieve the database and table data of physical backups.</p>
     * 
     * @param request the request parameters of GetDBListFromAgent  GetDBListFromAgentRequest
     * @return GetDBListFromAgentResponse
     */
    CompletableFuture<GetDBListFromAgentResponse> getDBListFromAgent(GetDBListFromAgentRequest request);

    /**
     * <b>description</b> :
     * <p>DBS uses the service-linked role (AliyunServiceRoleForDBS) to obtain the required access permissions to connect to ApsaraDB databases, such as RDS, MongoDB, Redis, and PolarDB, or self-managed databases on ECS instances. For more information, see <a href="https://help.aliyun.com/document_detail/162603.html">Activate the Database Backup service</a>.</p>
     * 
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
     * <b>description</b> :
     * <p>Before calling this operation, verify whether the backup data is stored in the built-in OSS of DBS. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to check the value of BackupStorageType.</p>
     * 
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
     * <h2>Impact</h2>
     * <p>After you release a backup plan, the service for the backup instance is stopped and you are no longer charged for the instance.</p>
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
