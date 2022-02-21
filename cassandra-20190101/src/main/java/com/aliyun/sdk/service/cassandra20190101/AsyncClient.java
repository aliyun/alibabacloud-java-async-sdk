// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cassandra20190101.models.*;
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

    CompletableFuture<AllocatePublicContactPointsResponse> allocatePublicContactPoints(AllocatePublicContactPointsRequest request);

    CompletableFuture<CreateBackupPlanResponse> createBackupPlan(CreateBackupPlanRequest request);

    CompletableFuture<CreateClusterResponse> createCluster(CreateClusterRequest request);

    CompletableFuture<CreateDataCenterResponse> createDataCenter(CreateDataCenterRequest request);

    CompletableFuture<DeleteBackupPlanResponse> deleteBackupPlan(DeleteBackupPlanRequest request);

    CompletableFuture<DeleteClusterResponse> deleteCluster(DeleteClusterRequest request);

    CompletableFuture<DeleteDataCenterResponse> deleteDataCenter(DeleteDataCenterRequest request);

    CompletableFuture<DeleteNodeToolExecutionHistoryResponse> deleteNodeToolExecutionHistory(DeleteNodeToolExecutionHistoryRequest request);

    CompletableFuture<DescribeAccountsResponse> describeAccounts(DescribeAccountsRequest request);

    CompletableFuture<DescribeBackupResponse> describeBackup(DescribeBackupRequest request);

    CompletableFuture<DescribeBackupPlanResponse> describeBackupPlan(DescribeBackupPlanRequest request);

    CompletableFuture<DescribeBackupPlansResponse> describeBackupPlans(DescribeBackupPlansRequest request);

    CompletableFuture<DescribeBackupsResponse> describeBackups(DescribeBackupsRequest request);

    CompletableFuture<DescribeClusterResponse> describeCluster(DescribeClusterRequest request);

    CompletableFuture<DescribeClusterDashboardResponse> describeClusterDashboard(DescribeClusterDashboardRequest request);

    CompletableFuture<DescribeClusterStatusResponse> describeClusterStatus(DescribeClusterStatusRequest request);

    CompletableFuture<DescribeClustersResponse> describeClusters(DescribeClustersRequest request);

    CompletableFuture<DescribeContactPointsResponse> describeContactPoints(DescribeContactPointsRequest request);

    CompletableFuture<DescribeDataCenterResponse> describeDataCenter(DescribeDataCenterRequest request);

    CompletableFuture<DescribeDataCentersResponse> describeDataCenters(DescribeDataCentersRequest request);

    CompletableFuture<DescribeDeletedClustersResponse> describeDeletedClusters(DescribeDeletedClustersRequest request);

    CompletableFuture<DescribeInstanceTypeResponse> describeInstanceType(DescribeInstanceTypeRequest request);

    CompletableFuture<DescribeIpWhitelistResponse> describeIpWhitelist(DescribeIpWhitelistRequest request);

    CompletableFuture<DescribeIpWhitelistGroupsResponse> describeIpWhitelistGroups(DescribeIpWhitelistGroupsRequest request);

    CompletableFuture<DescribeNodeToolExecutionHistoriesResponse> describeNodeToolExecutionHistories(DescribeNodeToolExecutionHistoriesRequest request);

    CompletableFuture<DescribeNodeToolExecutionHistoryResponse> describeNodeToolExecutionHistory(DescribeNodeToolExecutionHistoryRequest request);

    CompletableFuture<DescribeParameterModificationHistoriesResponse> describeParameterModificationHistories(DescribeParameterModificationHistoriesRequest request);

    CompletableFuture<DescribeParametersResponse> describeParameters(DescribeParametersRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeSecurityGroupsResponse> describeSecurityGroups(DescribeSecurityGroupsRequest request);

    CompletableFuture<ExecuteNodeToolResponse> executeNodeTool(ExecuteNodeToolRequest request);

    CompletableFuture<GetCmsUrlResponse> getCmsUrl(GetCmsUrlRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ListTagsResponse> listTags(ListTagsRequest request);

    CompletableFuture<ModifyAccountPasswordResponse> modifyAccountPassword(ModifyAccountPasswordRequest request);

    CompletableFuture<ModifyBackupPlanResponse> modifyBackupPlan(ModifyBackupPlanRequest request);

    CompletableFuture<ModifyClusterResponse> modifyCluster(ModifyClusterRequest request);

    CompletableFuture<ModifyDataCenterResponse> modifyDataCenter(ModifyDataCenterRequest request);

    CompletableFuture<ModifyInstanceMaintainTimeResponse> modifyInstanceMaintainTime(ModifyInstanceMaintainTimeRequest request);

    CompletableFuture<ModifyInstanceTypeResponse> modifyInstanceType(ModifyInstanceTypeRequest request);

    CompletableFuture<ModifyIpWhitelistResponse> modifyIpWhitelist(ModifyIpWhitelistRequest request);

    CompletableFuture<ModifyIpWhitelistGroupResponse> modifyIpWhitelistGroup(ModifyIpWhitelistGroupRequest request);

    CompletableFuture<ModifyParameterResponse> modifyParameter(ModifyParameterRequest request);

    CompletableFuture<ModifySecurityGroupsResponse> modifySecurityGroups(ModifySecurityGroupsRequest request);

    CompletableFuture<MoveResourceGroupResponse> moveResourceGroup(MoveResourceGroupRequest request);

    CompletableFuture<PurgeClusterResponse> purgeCluster(PurgeClusterRequest request);

    CompletableFuture<RebootClusterResponse> rebootCluster(RebootClusterRequest request);

    CompletableFuture<ReleasePublicContactPointsResponse> releasePublicContactPoints(ReleasePublicContactPointsRequest request);

    CompletableFuture<ResizeDiskSizeResponse> resizeDiskSize(ResizeDiskSizeRequest request);

    CompletableFuture<ResizeNodeCountResponse> resizeNodeCount(ResizeNodeCountRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UnTagResourcesResponse> unTagResources(UnTagResourcesRequest request);

    CompletableFuture<UpgradeClusterVersionResponse> upgradeClusterVersion(UpgradeClusterVersionRequest request);

}
