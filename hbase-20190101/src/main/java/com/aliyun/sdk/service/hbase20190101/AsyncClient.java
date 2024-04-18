// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.hbase20190101.models.*;
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

    CompletableFuture<AddUserHdfsInfoResponse> addUserHdfsInfo(AddUserHdfsInfoRequest request);

    CompletableFuture<AllocatePublicNetworkAddressResponse> allocatePublicNetworkAddress(AllocatePublicNetworkAddressRequest request);

    CompletableFuture<CancelActiveOperationTasksResponse> cancelActiveOperationTasks(CancelActiveOperationTasksRequest request);

    CompletableFuture<CheckComponentsVersionResponse> checkComponentsVersion(CheckComponentsVersionRequest request);

    CompletableFuture<CloseBackupResponse> closeBackup(CloseBackupRequest request);

    CompletableFuture<ConvertInstanceResponse> convertInstance(ConvertInstanceRequest request);

    CompletableFuture<CreateAccountResponse> createAccount(CreateAccountRequest request);

    CompletableFuture<CreateBackupPlanResponse> createBackupPlan(CreateBackupPlanRequest request);

    CompletableFuture<CreateClusterResponse> createCluster(CreateClusterRequest request);

    CompletableFuture<CreateGlobalResourceResponse> createGlobalResource(CreateGlobalResourceRequest request);

    CompletableFuture<CreateHBaseSlbServerResponse> createHBaseSlbServer(CreateHBaseSlbServerRequest request);

    CompletableFuture<CreateHbaseHaSlbResponse> createHbaseHaSlb(CreateHbaseHaSlbRequest request);

    CompletableFuture<CreateMultiZoneClusterResponse> createMultiZoneCluster(CreateMultiZoneClusterRequest request);

    CompletableFuture<CreateRestorePlanResponse> createRestorePlan(CreateRestorePlanRequest request);

    CompletableFuture<CreateServerlessClusterResponse> createServerlessCluster(CreateServerlessClusterRequest request);

    CompletableFuture<DeleteAccountResponse> deleteAccount(DeleteAccountRequest request);

    CompletableFuture<DeleteGlobalResourceResponse> deleteGlobalResource(DeleteGlobalResourceRequest request);

    CompletableFuture<DeleteHBaseHaDBResponse> deleteHBaseHaDB(DeleteHBaseHaDBRequest request);

    CompletableFuture<DeleteHBaseSlbServerResponse> deleteHBaseSlbServer(DeleteHBaseSlbServerRequest request);

    CompletableFuture<DeleteHbaseHaSlbResponse> deleteHbaseHaSlb(DeleteHbaseHaSlbRequest request);

    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    CompletableFuture<DeleteMultiZoneClusterResponse> deleteMultiZoneCluster(DeleteMultiZoneClusterRequest request);

    CompletableFuture<DeleteServerlessClusterResponse> deleteServerlessCluster(DeleteServerlessClusterRequest request);

    CompletableFuture<DeleteUserHdfsInfoResponse> deleteUserHdfsInfo(DeleteUserHdfsInfoRequest request);

    CompletableFuture<DescribeAccountsResponse> describeAccounts(DescribeAccountsRequest request);

    CompletableFuture<DescribeActiveOperationTaskTypeResponse> describeActiveOperationTaskType(DescribeActiveOperationTaskTypeRequest request);

    CompletableFuture<DescribeActiveOperationTasksResponse> describeActiveOperationTasks(DescribeActiveOperationTasksRequest request);

    CompletableFuture<DescribeAvailableResourceResponse> describeAvailableResource(DescribeAvailableResourceRequest request);

    CompletableFuture<DescribeBackupPlanConfigResponse> describeBackupPlanConfig(DescribeBackupPlanConfigRequest request);

    CompletableFuture<DescribeBackupPolicyResponse> describeBackupPolicy(DescribeBackupPolicyRequest request);

    CompletableFuture<DescribeBackupStatusResponse> describeBackupStatus(DescribeBackupStatusRequest request);

    CompletableFuture<DescribeBackupSummaryResponse> describeBackupSummary(DescribeBackupSummaryRequest request);

    CompletableFuture<DescribeBackupTablesResponse> describeBackupTables(DescribeBackupTablesRequest request);

    CompletableFuture<DescribeBackupsResponse> describeBackups(DescribeBackupsRequest request);

    CompletableFuture<DescribeClusterConnectionResponse> describeClusterConnection(DescribeClusterConnectionRequest request);

    CompletableFuture<DescribeColdStorageResponse> describeColdStorage(DescribeColdStorageRequest request);

    CompletableFuture<DescribeDBInstanceUsageResponse> describeDBInstanceUsage(DescribeDBInstanceUsageRequest request);

    CompletableFuture<DescribeDeletedInstancesResponse> describeDeletedInstances(DescribeDeletedInstancesRequest request);

    CompletableFuture<DescribeDiskWarningLineResponse> describeDiskWarningLine(DescribeDiskWarningLineRequest request);

    CompletableFuture<DescribeEndpointsResponse> describeEndpoints(DescribeEndpointsRequest request);

    CompletableFuture<DescribeInstanceResponse> describeInstance(DescribeInstanceRequest request);

    CompletableFuture<DescribeInstanceTypeResponse> describeInstanceType(DescribeInstanceTypeRequest request);

    CompletableFuture<DescribeInstancesResponse> describeInstances(DescribeInstancesRequest request);

    CompletableFuture<DescribeIpWhitelistResponse> describeIpWhitelist(DescribeIpWhitelistRequest request);

    CompletableFuture<DescribeMultiZoneAvailableRegionsResponse> describeMultiZoneAvailableRegions(DescribeMultiZoneAvailableRegionsRequest request);

    CompletableFuture<DescribeMultiZoneAvailableResourceResponse> describeMultiZoneAvailableResource(DescribeMultiZoneAvailableResourceRequest request);

    CompletableFuture<DescribeMultiZoneClusterResponse> describeMultiZoneCluster(DescribeMultiZoneClusterRequest request);

    CompletableFuture<DescribeRecoverableTimeRangeResponse> describeRecoverableTimeRange(DescribeRecoverableTimeRangeRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeRestoreFullDetailsResponse> describeRestoreFullDetails(DescribeRestoreFullDetailsRequest request);

    CompletableFuture<DescribeRestoreIncrDetailResponse> describeRestoreIncrDetail(DescribeRestoreIncrDetailRequest request);

    CompletableFuture<DescribeRestoreSchemaDetailsResponse> describeRestoreSchemaDetails(DescribeRestoreSchemaDetailsRequest request);

    CompletableFuture<DescribeRestoreSummaryResponse> describeRestoreSummary(DescribeRestoreSummaryRequest request);

    CompletableFuture<DescribeRestoreTablesResponse> describeRestoreTables(DescribeRestoreTablesRequest request);

    CompletableFuture<DescribeSecurityGroupsResponse> describeSecurityGroups(DescribeSecurityGroupsRequest request);

    CompletableFuture<DescribeServerlessClusterResponse> describeServerlessCluster(DescribeServerlessClusterRequest request);

    CompletableFuture<DescribeSubDomainResponse> describeSubDomain(DescribeSubDomainRequest request);

    CompletableFuture<EnableHBaseueBackupResponse> enableHBaseueBackup(EnableHBaseueBackupRequest request);

    CompletableFuture<EnableHBaseueModuleResponse> enableHBaseueModule(EnableHBaseueModuleRequest request);

    CompletableFuture<EvaluateMultiZoneResourceResponse> evaluateMultiZoneResource(EvaluateMultiZoneResourceRequest request);

    CompletableFuture<GetMultimodeCmsUrlResponse> getMultimodeCmsUrl(GetMultimodeCmsUrlRequest request);

    CompletableFuture<GrantResponse> grant(GrantRequest request);

    CompletableFuture<ListHBaseInstancesResponse> listHBaseInstances(ListHBaseInstancesRequest request);

    CompletableFuture<ListInstanceServiceConfigHistoriesResponse> listInstanceServiceConfigHistories(ListInstanceServiceConfigHistoriesRequest request);

    CompletableFuture<ListInstanceServiceConfigurationsResponse> listInstanceServiceConfigurations(ListInstanceServiceConfigurationsRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ListTagsResponse> listTags(ListTagsRequest request);

    CompletableFuture<ModifyAccountPasswordResponse> modifyAccountPassword(ModifyAccountPasswordRequest request);

    CompletableFuture<ModifyActiveOperationTasksResponse> modifyActiveOperationTasks(ModifyActiveOperationTasksRequest request);

    CompletableFuture<ModifyBackupPlanConfigResponse> modifyBackupPlanConfig(ModifyBackupPlanConfigRequest request);

    CompletableFuture<ModifyBackupPolicyResponse> modifyBackupPolicy(ModifyBackupPolicyRequest request);

    CompletableFuture<ModifyClusterDeletionProtectionResponse> modifyClusterDeletionProtection(ModifyClusterDeletionProtectionRequest request);

    CompletableFuture<ModifyDiskWarningLineResponse> modifyDiskWarningLine(ModifyDiskWarningLineRequest request);

    CompletableFuture<ModifyInstanceMaintainTimeResponse> modifyInstanceMaintainTime(ModifyInstanceMaintainTimeRequest request);

    CompletableFuture<ModifyInstanceNameResponse> modifyInstanceName(ModifyInstanceNameRequest request);

    CompletableFuture<ModifyInstanceServiceConfigResponse> modifyInstanceServiceConfig(ModifyInstanceServiceConfigRequest request);

    CompletableFuture<ModifyInstanceTypeResponse> modifyInstanceType(ModifyInstanceTypeRequest request);

    CompletableFuture<ModifyIpWhitelistResponse> modifyIpWhitelist(ModifyIpWhitelistRequest request);

    CompletableFuture<ModifyMultiZoneClusterNodeTypeResponse> modifyMultiZoneClusterNodeType(ModifyMultiZoneClusterNodeTypeRequest request);

    CompletableFuture<ModifySecurityGroupsResponse> modifySecurityGroups(ModifySecurityGroupsRequest request);

    CompletableFuture<ModifyUIAccountPasswordResponse> modifyUIAccountPassword(ModifyUIAccountPasswordRequest request);

    CompletableFuture<MoveResourceGroupResponse> moveResourceGroup(MoveResourceGroupRequest request);

    CompletableFuture<OpenBackupResponse> openBackup(OpenBackupRequest request);

    CompletableFuture<PurgeInstanceResponse> purgeInstance(PurgeInstanceRequest request);

    CompletableFuture<QueryHBaseHaDBResponse> queryHBaseHaDB(QueryHBaseHaDBRequest request);

    CompletableFuture<QueryXpackRelateDBResponse> queryXpackRelateDB(QueryXpackRelateDBRequest request);

    CompletableFuture<RelateDbForHBaseHaResponse> relateDbForHBaseHa(RelateDbForHBaseHaRequest request);

    CompletableFuture<ReleasePublicNetworkAddressResponse> releasePublicNetworkAddress(ReleasePublicNetworkAddressRequest request);

    CompletableFuture<RenewInstanceResponse> renewInstance(RenewInstanceRequest request);

    CompletableFuture<ResizeColdStorageSizeResponse> resizeColdStorageSize(ResizeColdStorageSizeRequest request);

    CompletableFuture<ResizeDiskSizeResponse> resizeDiskSize(ResizeDiskSizeRequest request);

    CompletableFuture<ResizeMultiZoneClusterDiskSizeResponse> resizeMultiZoneClusterDiskSize(ResizeMultiZoneClusterDiskSizeRequest request);

    CompletableFuture<ResizeMultiZoneClusterNodeCountResponse> resizeMultiZoneClusterNodeCount(ResizeMultiZoneClusterNodeCountRequest request);

    CompletableFuture<ResizeNodeCountResponse> resizeNodeCount(ResizeNodeCountRequest request);

    CompletableFuture<RestartInstanceResponse> restartInstance(RestartInstanceRequest request);

    CompletableFuture<RevokeResponse> revoke(RevokeRequest request);

    CompletableFuture<SwitchHbaseHaSlbResponse> switchHbaseHaSlb(SwitchHbaseHaSlbRequest request);

    CompletableFuture<SwitchServiceResponse> switchService(SwitchServiceRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UnTagResourcesResponse> unTagResources(UnTagResourcesRequest request);

    CompletableFuture<UpgradeMinorVersionResponse> upgradeMinorVersion(UpgradeMinorVersionRequest request);

    CompletableFuture<UpgradeMultiZoneClusterResponse> upgradeMultiZoneCluster(UpgradeMultiZoneClusterRequest request);

    CompletableFuture<XpackRelateDBResponse> xpackRelateDB(XpackRelateDBRequest request);

}
