// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dbs20190306.models.*;
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

    CompletableFuture<ConfigureBackupPlanResponse> configureBackupPlan(ConfigureBackupPlanRequest request);

    CompletableFuture<CreateAndStartBackupPlanResponse> createAndStartBackupPlan(CreateAndStartBackupPlanRequest request);

    CompletableFuture<CreateBackupPlanResponse> createBackupPlan(CreateBackupPlanRequest request);

    CompletableFuture<CreateFullBackupSetDownloadResponse> createFullBackupSetDownload(CreateFullBackupSetDownloadRequest request);

    CompletableFuture<CreateGetDBListFromAgentTaskResponse> createGetDBListFromAgentTask(CreateGetDBListFromAgentTaskRequest request);

    CompletableFuture<CreateIncrementBackupSetDownloadResponse> createIncrementBackupSetDownload(CreateIncrementBackupSetDownloadRequest request);

    CompletableFuture<CreateRestoreTaskResponse> createRestoreTask(CreateRestoreTaskRequest request);

    CompletableFuture<DescribeBackupGatewayListResponse> describeBackupGatewayList(DescribeBackupGatewayListRequest request);

    CompletableFuture<DescribeBackupPlanBillingResponse> describeBackupPlanBilling(DescribeBackupPlanBillingRequest request);

    CompletableFuture<DescribeBackupPlanListResponse> describeBackupPlanList(DescribeBackupPlanListRequest request);

    CompletableFuture<DescribeBackupSetDownloadTaskListResponse> describeBackupSetDownloadTaskList(DescribeBackupSetDownloadTaskListRequest request);

    CompletableFuture<DescribeDLAServiceResponse> describeDLAService(DescribeDLAServiceRequest request);

    CompletableFuture<DescribeFullBackupListResponse> describeFullBackupList(DescribeFullBackupListRequest request);

    CompletableFuture<DescribeIncrementBackupListResponse> describeIncrementBackupList(DescribeIncrementBackupListRequest request);

    CompletableFuture<DescribeJobErrorCodeResponse> describeJobErrorCode(DescribeJobErrorCodeRequest request);

    CompletableFuture<DescribeNodeCidrListResponse> describeNodeCidrList(DescribeNodeCidrListRequest request);

    CompletableFuture<DescribePreCheckProgressListResponse> describePreCheckProgressList(DescribePreCheckProgressListRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeRestoreRangeInfoResponse> describeRestoreRangeInfo(DescribeRestoreRangeInfoRequest request);

    CompletableFuture<DescribeRestoreTaskListResponse> describeRestoreTaskList(DescribeRestoreTaskListRequest request);

    CompletableFuture<DisableBackupLogResponse> disableBackupLog(DisableBackupLogRequest request);

    CompletableFuture<EnableBackupLogResponse> enableBackupLog(EnableBackupLogRequest request);

    CompletableFuture<GetDBListFromAgentResponse> getDBListFromAgent(GetDBListFromAgentRequest request);

    CompletableFuture<InitializeDbsServiceLinkedRoleResponse> initializeDbsServiceLinkedRole(InitializeDbsServiceLinkedRoleRequest request);

    CompletableFuture<ModifyBackupObjectsResponse> modifyBackupObjects(ModifyBackupObjectsRequest request);

    CompletableFuture<ModifyBackupPlanNameResponse> modifyBackupPlanName(ModifyBackupPlanNameRequest request);

    CompletableFuture<ModifyBackupSetDownloadRulesResponse> modifyBackupSetDownloadRules(ModifyBackupSetDownloadRulesRequest request);

    CompletableFuture<ModifyBackupSourceEndpointResponse> modifyBackupSourceEndpoint(ModifyBackupSourceEndpointRequest request);

    CompletableFuture<ModifyBackupStrategyResponse> modifyBackupStrategy(ModifyBackupStrategyRequest request);

    CompletableFuture<ModifyStorageStrategyResponse> modifyStorageStrategy(ModifyStorageStrategyRequest request);

    CompletableFuture<ReleaseBackupPlanResponse> releaseBackupPlan(ReleaseBackupPlanRequest request);

    CompletableFuture<RenewBackupPlanResponse> renewBackupPlan(RenewBackupPlanRequest request);

    CompletableFuture<StartBackupPlanResponse> startBackupPlan(StartBackupPlanRequest request);

    CompletableFuture<StartRestoreTaskResponse> startRestoreTask(StartRestoreTaskRequest request);

    CompletableFuture<StopBackupPlanResponse> stopBackupPlan(StopBackupPlanRequest request);

    CompletableFuture<UpgradeBackupPlanResponse> upgradeBackupPlan(UpgradeBackupPlanRequest request);

}
