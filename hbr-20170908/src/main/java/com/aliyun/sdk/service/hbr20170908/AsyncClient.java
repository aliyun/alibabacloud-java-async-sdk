// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.hbr20170908.models.*;
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

    CompletableFuture<CancelBackupJobResponse> cancelBackupJob(CancelBackupJobRequest request);

    CompletableFuture<CancelRestoreJobResponse> cancelRestoreJob(CancelRestoreJobRequest request);

    CompletableFuture<CreateBackupPlanResponse> createBackupPlan(CreateBackupPlanRequest request);

    CompletableFuture<CreateReplicationVaultResponse> createReplicationVault(CreateReplicationVaultRequest request);

    CompletableFuture<CreateRestoreJobResponse> createRestoreJob(CreateRestoreJobRequest request);

    CompletableFuture<CreateVaultResponse> createVault(CreateVaultRequest request);

    CompletableFuture<DeleteBackupClientResponse> deleteBackupClient(DeleteBackupClientRequest request);

    CompletableFuture<DeleteBackupClientResourceResponse> deleteBackupClientResource(DeleteBackupClientResourceRequest request);

    CompletableFuture<DeleteBackupPlanResponse> deleteBackupPlan(DeleteBackupPlanRequest request);

    CompletableFuture<DeleteSnapshotResponse> deleteSnapshot(DeleteSnapshotRequest request);

    CompletableFuture<DeleteVaultResponse> deleteVault(DeleteVaultRequest request);

    CompletableFuture<DescribeBackupClientsResponse> describeBackupClients(DescribeBackupClientsRequest request);

    CompletableFuture<DescribeBackupJobs2Response> describeBackupJobs2(DescribeBackupJobs2Request request);

    CompletableFuture<DescribeBackupPlansResponse> describeBackupPlans(DescribeBackupPlansRequest request);

    CompletableFuture<DescribeOtsTableSnapshotsResponse> describeOtsTableSnapshots(DescribeOtsTableSnapshotsRequest request);

    CompletableFuture<DescribeRecoverableOtsInstancesResponse> describeRecoverableOtsInstances(DescribeRecoverableOtsInstancesRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeRestoreJobs2Response> describeRestoreJobs2(DescribeRestoreJobs2Request request);

    CompletableFuture<DescribeTaskResponse> describeTask(DescribeTaskRequest request);

    CompletableFuture<DescribeVaultReplicationRegionsResponse> describeVaultReplicationRegions(DescribeVaultReplicationRegionsRequest request);

    CompletableFuture<DescribeVaultsResponse> describeVaults(DescribeVaultsRequest request);

    CompletableFuture<DetachNasFileSystemResponse> detachNasFileSystem(DetachNasFileSystemRequest request);

    CompletableFuture<DisableBackupPlanResponse> disableBackupPlan(DisableBackupPlanRequest request);

    CompletableFuture<EnableBackupPlanResponse> enableBackupPlan(EnableBackupPlanRequest request);

    CompletableFuture<ExecuteBackupPlanResponse> executeBackupPlan(ExecuteBackupPlanRequest request);

    CompletableFuture<GenerateRamPolicyResponse> generateRamPolicy(GenerateRamPolicyRequest request);

    CompletableFuture<InstallBackupClientsResponse> installBackupClients(InstallBackupClientsRequest request);

    CompletableFuture<SearchHistoricalSnapshotsResponse> searchHistoricalSnapshots(SearchHistoricalSnapshotsRequest request);

    CompletableFuture<UninstallBackupClientsResponse> uninstallBackupClients(UninstallBackupClientsRequest request);

    CompletableFuture<UpdateBackupPlanResponse> updateBackupPlan(UpdateBackupPlanRequest request);

    CompletableFuture<UpdateClientSettingsResponse> updateClientSettings(UpdateClientSettingsRequest request);

    CompletableFuture<UpdateVaultResponse> updateVault(UpdateVaultRequest request);

    CompletableFuture<UpgradeBackupClientsResponse> upgradeBackupClients(UpgradeBackupClientsRequest request);

}
