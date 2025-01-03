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

    /**
     * @param request the request parameters of AddUserHdfsInfo  AddUserHdfsInfoRequest
     * @return AddUserHdfsInfoResponse
     */
    CompletableFuture<AddUserHdfsInfoResponse> addUserHdfsInfo(AddUserHdfsInfoRequest request);

    /**
     * @param request the request parameters of AllocatePublicNetworkAddress  AllocatePublicNetworkAddressRequest
     * @return AllocatePublicNetworkAddressResponse
     */
    CompletableFuture<AllocatePublicNetworkAddressResponse> allocatePublicNetworkAddress(AllocatePublicNetworkAddressRequest request);

    /**
     * @param request the request parameters of CancelActiveOperationTasks  CancelActiveOperationTasksRequest
     * @return CancelActiveOperationTasksResponse
     */
    CompletableFuture<CancelActiveOperationTasksResponse> cancelActiveOperationTasks(CancelActiveOperationTasksRequest request);

    /**
     * @param request the request parameters of CheckComponentsVersion  CheckComponentsVersionRequest
     * @return CheckComponentsVersionResponse
     */
    CompletableFuture<CheckComponentsVersionResponse> checkComponentsVersion(CheckComponentsVersionRequest request);

    /**
     * @param request the request parameters of CloseBackup  CloseBackupRequest
     * @return CloseBackupResponse
     */
    CompletableFuture<CloseBackupResponse> closeBackup(CloseBackupRequest request);

    /**
     * @param request the request parameters of ConvertInstance  ConvertInstanceRequest
     * @return ConvertInstanceResponse
     */
    CompletableFuture<ConvertInstanceResponse> convertInstance(ConvertInstanceRequest request);

    /**
     * @param request the request parameters of CreateAccount  CreateAccountRequest
     * @return CreateAccountResponse
     */
    CompletableFuture<CreateAccountResponse> createAccount(CreateAccountRequest request);

    /**
     * @param request the request parameters of CreateBackupPlan  CreateBackupPlanRequest
     * @return CreateBackupPlanResponse
     */
    CompletableFuture<CreateBackupPlanResponse> createBackupPlan(CreateBackupPlanRequest request);

    /**
     * @param request the request parameters of CreateCluster  CreateClusterRequest
     * @return CreateClusterResponse
     */
    CompletableFuture<CreateClusterResponse> createCluster(CreateClusterRequest request);

    /**
     * @param request the request parameters of CreateGlobalResource  CreateGlobalResourceRequest
     * @return CreateGlobalResourceResponse
     */
    CompletableFuture<CreateGlobalResourceResponse> createGlobalResource(CreateGlobalResourceRequest request);

    /**
     * @param request the request parameters of CreateHBaseSlbServer  CreateHBaseSlbServerRequest
     * @return CreateHBaseSlbServerResponse
     */
    CompletableFuture<CreateHBaseSlbServerResponse> createHBaseSlbServer(CreateHBaseSlbServerRequest request);

    /**
     * @param request the request parameters of CreateHbaseHaSlb  CreateHbaseHaSlbRequest
     * @return CreateHbaseHaSlbResponse
     */
    CompletableFuture<CreateHbaseHaSlbResponse> createHbaseHaSlb(CreateHbaseHaSlbRequest request);

    /**
     * @param request the request parameters of CreateMultiZoneCluster  CreateMultiZoneClusterRequest
     * @return CreateMultiZoneClusterResponse
     */
    CompletableFuture<CreateMultiZoneClusterResponse> createMultiZoneCluster(CreateMultiZoneClusterRequest request);

    /**
     * @param request the request parameters of CreateRestorePlan  CreateRestorePlanRequest
     * @return CreateRestorePlanResponse
     */
    CompletableFuture<CreateRestorePlanResponse> createRestorePlan(CreateRestorePlanRequest request);

    /**
     * @param request the request parameters of CreateServerlessCluster  CreateServerlessClusterRequest
     * @return CreateServerlessClusterResponse
     */
    CompletableFuture<CreateServerlessClusterResponse> createServerlessCluster(CreateServerlessClusterRequest request);

    /**
     * @param request the request parameters of DeleteAccount  DeleteAccountRequest
     * @return DeleteAccountResponse
     */
    CompletableFuture<DeleteAccountResponse> deleteAccount(DeleteAccountRequest request);

    /**
     * @param request the request parameters of DeleteGlobalResource  DeleteGlobalResourceRequest
     * @return DeleteGlobalResourceResponse
     */
    CompletableFuture<DeleteGlobalResourceResponse> deleteGlobalResource(DeleteGlobalResourceRequest request);

    /**
     * @param request the request parameters of DeleteHBaseHaDB  DeleteHBaseHaDBRequest
     * @return DeleteHBaseHaDBResponse
     */
    CompletableFuture<DeleteHBaseHaDBResponse> deleteHBaseHaDB(DeleteHBaseHaDBRequest request);

    /**
     * @param request the request parameters of DeleteHBaseSlbServer  DeleteHBaseSlbServerRequest
     * @return DeleteHBaseSlbServerResponse
     */
    CompletableFuture<DeleteHBaseSlbServerResponse> deleteHBaseSlbServer(DeleteHBaseSlbServerRequest request);

    /**
     * @param request the request parameters of DeleteHbaseHaSlb  DeleteHbaseHaSlbRequest
     * @return DeleteHbaseHaSlbResponse
     */
    CompletableFuture<DeleteHbaseHaSlbResponse> deleteHbaseHaSlb(DeleteHbaseHaSlbRequest request);

    /**
     * @param request the request parameters of DeleteInstance  DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    /**
     * @param request the request parameters of DeleteMultiZoneCluster  DeleteMultiZoneClusterRequest
     * @return DeleteMultiZoneClusterResponse
     */
    CompletableFuture<DeleteMultiZoneClusterResponse> deleteMultiZoneCluster(DeleteMultiZoneClusterRequest request);

    /**
     * @param request the request parameters of DeleteServerlessCluster  DeleteServerlessClusterRequest
     * @return DeleteServerlessClusterResponse
     */
    CompletableFuture<DeleteServerlessClusterResponse> deleteServerlessCluster(DeleteServerlessClusterRequest request);

    /**
     * @param request the request parameters of DeleteUserHdfsInfo  DeleteUserHdfsInfoRequest
     * @return DeleteUserHdfsInfoResponse
     */
    CompletableFuture<DeleteUserHdfsInfoResponse> deleteUserHdfsInfo(DeleteUserHdfsInfoRequest request);

    /**
     * @param request the request parameters of DescribeAccounts  DescribeAccountsRequest
     * @return DescribeAccountsResponse
     */
    CompletableFuture<DescribeAccountsResponse> describeAccounts(DescribeAccountsRequest request);

    /**
     * @param request the request parameters of DescribeActiveOperationTaskType  DescribeActiveOperationTaskTypeRequest
     * @return DescribeActiveOperationTaskTypeResponse
     */
    CompletableFuture<DescribeActiveOperationTaskTypeResponse> describeActiveOperationTaskType(DescribeActiveOperationTaskTypeRequest request);

    /**
     * @param request the request parameters of DescribeActiveOperationTasks  DescribeActiveOperationTasksRequest
     * @return DescribeActiveOperationTasksResponse
     */
    CompletableFuture<DescribeActiveOperationTasksResponse> describeActiveOperationTasks(DescribeActiveOperationTasksRequest request);

    /**
     * @param request the request parameters of DescribeAvailableResource  DescribeAvailableResourceRequest
     * @return DescribeAvailableResourceResponse
     */
    CompletableFuture<DescribeAvailableResourceResponse> describeAvailableResource(DescribeAvailableResourceRequest request);

    /**
     * @param request the request parameters of DescribeBackupPlanConfig  DescribeBackupPlanConfigRequest
     * @return DescribeBackupPlanConfigResponse
     */
    CompletableFuture<DescribeBackupPlanConfigResponse> describeBackupPlanConfig(DescribeBackupPlanConfigRequest request);

    /**
     * @param request the request parameters of DescribeBackupPolicy  DescribeBackupPolicyRequest
     * @return DescribeBackupPolicyResponse
     */
    CompletableFuture<DescribeBackupPolicyResponse> describeBackupPolicy(DescribeBackupPolicyRequest request);

    /**
     * @param request the request parameters of DescribeBackupStatus  DescribeBackupStatusRequest
     * @return DescribeBackupStatusResponse
     */
    CompletableFuture<DescribeBackupStatusResponse> describeBackupStatus(DescribeBackupStatusRequest request);

    /**
     * @param request the request parameters of DescribeBackupSummary  DescribeBackupSummaryRequest
     * @return DescribeBackupSummaryResponse
     */
    CompletableFuture<DescribeBackupSummaryResponse> describeBackupSummary(DescribeBackupSummaryRequest request);

    /**
     * @param request the request parameters of DescribeBackupTables  DescribeBackupTablesRequest
     * @return DescribeBackupTablesResponse
     */
    CompletableFuture<DescribeBackupTablesResponse> describeBackupTables(DescribeBackupTablesRequest request);

    /**
     * @param request the request parameters of DescribeBackups  DescribeBackupsRequest
     * @return DescribeBackupsResponse
     */
    CompletableFuture<DescribeBackupsResponse> describeBackups(DescribeBackupsRequest request);

    /**
     * @param request the request parameters of DescribeClusterConnection  DescribeClusterConnectionRequest
     * @return DescribeClusterConnectionResponse
     */
    CompletableFuture<DescribeClusterConnectionResponse> describeClusterConnection(DescribeClusterConnectionRequest request);

    /**
     * @param request the request parameters of DescribeColdStorage  DescribeColdStorageRequest
     * @return DescribeColdStorageResponse
     */
    CompletableFuture<DescribeColdStorageResponse> describeColdStorage(DescribeColdStorageRequest request);

    /**
     * @param request the request parameters of DescribeDBInstanceUsage  DescribeDBInstanceUsageRequest
     * @return DescribeDBInstanceUsageResponse
     */
    CompletableFuture<DescribeDBInstanceUsageResponse> describeDBInstanceUsage(DescribeDBInstanceUsageRequest request);

    /**
     * @param request the request parameters of DescribeDeletedInstances  DescribeDeletedInstancesRequest
     * @return DescribeDeletedInstancesResponse
     */
    CompletableFuture<DescribeDeletedInstancesResponse> describeDeletedInstances(DescribeDeletedInstancesRequest request);

    /**
     * @param request the request parameters of DescribeDiskWarningLine  DescribeDiskWarningLineRequest
     * @return DescribeDiskWarningLineResponse
     */
    CompletableFuture<DescribeDiskWarningLineResponse> describeDiskWarningLine(DescribeDiskWarningLineRequest request);

    /**
     * @param request the request parameters of DescribeEndpoints  DescribeEndpointsRequest
     * @return DescribeEndpointsResponse
     */
    CompletableFuture<DescribeEndpointsResponse> describeEndpoints(DescribeEndpointsRequest request);

    /**
     * @param request the request parameters of DescribeInstance  DescribeInstanceRequest
     * @return DescribeInstanceResponse
     */
    CompletableFuture<DescribeInstanceResponse> describeInstance(DescribeInstanceRequest request);

    /**
     * @param request the request parameters of DescribeInstanceType  DescribeInstanceTypeRequest
     * @return DescribeInstanceTypeResponse
     */
    CompletableFuture<DescribeInstanceTypeResponse> describeInstanceType(DescribeInstanceTypeRequest request);

    /**
     * @param request the request parameters of DescribeInstances  DescribeInstancesRequest
     * @return DescribeInstancesResponse
     */
    CompletableFuture<DescribeInstancesResponse> describeInstances(DescribeInstancesRequest request);

    /**
     * @param request the request parameters of DescribeIpWhitelist  DescribeIpWhitelistRequest
     * @return DescribeIpWhitelistResponse
     */
    CompletableFuture<DescribeIpWhitelistResponse> describeIpWhitelist(DescribeIpWhitelistRequest request);

    /**
     * @param request the request parameters of DescribeMultiZoneAvailableRegions  DescribeMultiZoneAvailableRegionsRequest
     * @return DescribeMultiZoneAvailableRegionsResponse
     */
    CompletableFuture<DescribeMultiZoneAvailableRegionsResponse> describeMultiZoneAvailableRegions(DescribeMultiZoneAvailableRegionsRequest request);

    /**
     * @param request the request parameters of DescribeMultiZoneAvailableResource  DescribeMultiZoneAvailableResourceRequest
     * @return DescribeMultiZoneAvailableResourceResponse
     */
    CompletableFuture<DescribeMultiZoneAvailableResourceResponse> describeMultiZoneAvailableResource(DescribeMultiZoneAvailableResourceRequest request);

    /**
     * @param request the request parameters of DescribeMultiZoneCluster  DescribeMultiZoneClusterRequest
     * @return DescribeMultiZoneClusterResponse
     */
    CompletableFuture<DescribeMultiZoneClusterResponse> describeMultiZoneCluster(DescribeMultiZoneClusterRequest request);

    /**
     * @param request the request parameters of DescribeRecoverableTimeRange  DescribeRecoverableTimeRangeRequest
     * @return DescribeRecoverableTimeRangeResponse
     */
    CompletableFuture<DescribeRecoverableTimeRangeResponse> describeRecoverableTimeRange(DescribeRecoverableTimeRangeRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * @param request the request parameters of DescribeRestoreFullDetails  DescribeRestoreFullDetailsRequest
     * @return DescribeRestoreFullDetailsResponse
     */
    CompletableFuture<DescribeRestoreFullDetailsResponse> describeRestoreFullDetails(DescribeRestoreFullDetailsRequest request);

    /**
     * @param request the request parameters of DescribeRestoreIncrDetail  DescribeRestoreIncrDetailRequest
     * @return DescribeRestoreIncrDetailResponse
     */
    CompletableFuture<DescribeRestoreIncrDetailResponse> describeRestoreIncrDetail(DescribeRestoreIncrDetailRequest request);

    /**
     * @param request the request parameters of DescribeRestoreSchemaDetails  DescribeRestoreSchemaDetailsRequest
     * @return DescribeRestoreSchemaDetailsResponse
     */
    CompletableFuture<DescribeRestoreSchemaDetailsResponse> describeRestoreSchemaDetails(DescribeRestoreSchemaDetailsRequest request);

    /**
     * @param request the request parameters of DescribeRestoreSummary  DescribeRestoreSummaryRequest
     * @return DescribeRestoreSummaryResponse
     */
    CompletableFuture<DescribeRestoreSummaryResponse> describeRestoreSummary(DescribeRestoreSummaryRequest request);

    /**
     * @param request the request parameters of DescribeRestoreTables  DescribeRestoreTablesRequest
     * @return DescribeRestoreTablesResponse
     */
    CompletableFuture<DescribeRestoreTablesResponse> describeRestoreTables(DescribeRestoreTablesRequest request);

    /**
     * @param request the request parameters of DescribeSecurityGroups  DescribeSecurityGroupsRequest
     * @return DescribeSecurityGroupsResponse
     */
    CompletableFuture<DescribeSecurityGroupsResponse> describeSecurityGroups(DescribeSecurityGroupsRequest request);

    /**
     * @param request the request parameters of DescribeServerlessCluster  DescribeServerlessClusterRequest
     * @return DescribeServerlessClusterResponse
     */
    CompletableFuture<DescribeServerlessClusterResponse> describeServerlessCluster(DescribeServerlessClusterRequest request);

    /**
     * @param request the request parameters of DescribeSubDomain  DescribeSubDomainRequest
     * @return DescribeSubDomainResponse
     */
    CompletableFuture<DescribeSubDomainResponse> describeSubDomain(DescribeSubDomainRequest request);

    /**
     * @param request the request parameters of EnableHBaseueBackup  EnableHBaseueBackupRequest
     * @return EnableHBaseueBackupResponse
     */
    CompletableFuture<EnableHBaseueBackupResponse> enableHBaseueBackup(EnableHBaseueBackupRequest request);

    /**
     * @param request the request parameters of EnableHBaseueModule  EnableHBaseueModuleRequest
     * @return EnableHBaseueModuleResponse
     */
    CompletableFuture<EnableHBaseueModuleResponse> enableHBaseueModule(EnableHBaseueModuleRequest request);

    /**
     * @param request the request parameters of EvaluateMultiZoneResource  EvaluateMultiZoneResourceRequest
     * @return EvaluateMultiZoneResourceResponse
     */
    CompletableFuture<EvaluateMultiZoneResourceResponse> evaluateMultiZoneResource(EvaluateMultiZoneResourceRequest request);

    /**
     * @param request the request parameters of GetMultimodeCmsUrl  GetMultimodeCmsUrlRequest
     * @return GetMultimodeCmsUrlResponse
     */
    CompletableFuture<GetMultimodeCmsUrlResponse> getMultimodeCmsUrl(GetMultimodeCmsUrlRequest request);

    /**
     * @param request the request parameters of Grant  GrantRequest
     * @return GrantResponse
     */
    CompletableFuture<GrantResponse> grant(GrantRequest request);

    /**
     * @param request the request parameters of ListHBaseInstances  ListHBaseInstancesRequest
     * @return ListHBaseInstancesResponse
     */
    CompletableFuture<ListHBaseInstancesResponse> listHBaseInstances(ListHBaseInstancesRequest request);

    /**
     * @param request the request parameters of ListInstanceServiceConfigHistories  ListInstanceServiceConfigHistoriesRequest
     * @return ListInstanceServiceConfigHistoriesResponse
     */
    CompletableFuture<ListInstanceServiceConfigHistoriesResponse> listInstanceServiceConfigHistories(ListInstanceServiceConfigHistoriesRequest request);

    /**
     * @param request the request parameters of ListInstanceServiceConfigurations  ListInstanceServiceConfigurationsRequest
     * @return ListInstanceServiceConfigurationsResponse
     */
    CompletableFuture<ListInstanceServiceConfigurationsResponse> listInstanceServiceConfigurations(ListInstanceServiceConfigurationsRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of ListTags  ListTagsRequest
     * @return ListTagsResponse
     */
    CompletableFuture<ListTagsResponse> listTags(ListTagsRequest request);

    /**
     * @param request the request parameters of ModifyAccountPassword  ModifyAccountPasswordRequest
     * @return ModifyAccountPasswordResponse
     */
    CompletableFuture<ModifyAccountPasswordResponse> modifyAccountPassword(ModifyAccountPasswordRequest request);

    /**
     * @param request the request parameters of ModifyActiveOperationTasks  ModifyActiveOperationTasksRequest
     * @return ModifyActiveOperationTasksResponse
     */
    CompletableFuture<ModifyActiveOperationTasksResponse> modifyActiveOperationTasks(ModifyActiveOperationTasksRequest request);

    /**
     * @param request the request parameters of ModifyBackupPlanConfig  ModifyBackupPlanConfigRequest
     * @return ModifyBackupPlanConfigResponse
     */
    CompletableFuture<ModifyBackupPlanConfigResponse> modifyBackupPlanConfig(ModifyBackupPlanConfigRequest request);

    /**
     * @param request the request parameters of ModifyBackupPolicy  ModifyBackupPolicyRequest
     * @return ModifyBackupPolicyResponse
     */
    CompletableFuture<ModifyBackupPolicyResponse> modifyBackupPolicy(ModifyBackupPolicyRequest request);

    /**
     * @param request the request parameters of ModifyClusterDeletionProtection  ModifyClusterDeletionProtectionRequest
     * @return ModifyClusterDeletionProtectionResponse
     */
    CompletableFuture<ModifyClusterDeletionProtectionResponse> modifyClusterDeletionProtection(ModifyClusterDeletionProtectionRequest request);

    /**
     * @param request the request parameters of ModifyDiskWarningLine  ModifyDiskWarningLineRequest
     * @return ModifyDiskWarningLineResponse
     */
    CompletableFuture<ModifyDiskWarningLineResponse> modifyDiskWarningLine(ModifyDiskWarningLineRequest request);

    /**
     * @param request the request parameters of ModifyInstanceMaintainTime  ModifyInstanceMaintainTimeRequest
     * @return ModifyInstanceMaintainTimeResponse
     */
    CompletableFuture<ModifyInstanceMaintainTimeResponse> modifyInstanceMaintainTime(ModifyInstanceMaintainTimeRequest request);

    /**
     * @param request the request parameters of ModifyInstanceName  ModifyInstanceNameRequest
     * @return ModifyInstanceNameResponse
     */
    CompletableFuture<ModifyInstanceNameResponse> modifyInstanceName(ModifyInstanceNameRequest request);

    /**
     * @param request the request parameters of ModifyInstanceServiceConfig  ModifyInstanceServiceConfigRequest
     * @return ModifyInstanceServiceConfigResponse
     */
    CompletableFuture<ModifyInstanceServiceConfigResponse> modifyInstanceServiceConfig(ModifyInstanceServiceConfigRequest request);

    /**
     * @param request the request parameters of ModifyInstanceType  ModifyInstanceTypeRequest
     * @return ModifyInstanceTypeResponse
     */
    CompletableFuture<ModifyInstanceTypeResponse> modifyInstanceType(ModifyInstanceTypeRequest request);

    /**
     * @param request the request parameters of ModifyIpWhitelist  ModifyIpWhitelistRequest
     * @return ModifyIpWhitelistResponse
     */
    CompletableFuture<ModifyIpWhitelistResponse> modifyIpWhitelist(ModifyIpWhitelistRequest request);

    /**
     * @param request the request parameters of ModifyMultiZoneClusterNodeType  ModifyMultiZoneClusterNodeTypeRequest
     * @return ModifyMultiZoneClusterNodeTypeResponse
     */
    CompletableFuture<ModifyMultiZoneClusterNodeTypeResponse> modifyMultiZoneClusterNodeType(ModifyMultiZoneClusterNodeTypeRequest request);

    /**
     * @param request the request parameters of ModifySecurityGroups  ModifySecurityGroupsRequest
     * @return ModifySecurityGroupsResponse
     */
    CompletableFuture<ModifySecurityGroupsResponse> modifySecurityGroups(ModifySecurityGroupsRequest request);

    /**
     * @param request the request parameters of ModifyUIAccountPassword  ModifyUIAccountPasswordRequest
     * @return ModifyUIAccountPasswordResponse
     */
    CompletableFuture<ModifyUIAccountPasswordResponse> modifyUIAccountPassword(ModifyUIAccountPasswordRequest request);

    /**
     * @param request the request parameters of MoveResourceGroup  MoveResourceGroupRequest
     * @return MoveResourceGroupResponse
     */
    CompletableFuture<MoveResourceGroupResponse> moveResourceGroup(MoveResourceGroupRequest request);

    /**
     * @param request the request parameters of OpenBackup  OpenBackupRequest
     * @return OpenBackupResponse
     */
    CompletableFuture<OpenBackupResponse> openBackup(OpenBackupRequest request);

    /**
     * @param request the request parameters of PurgeInstance  PurgeInstanceRequest
     * @return PurgeInstanceResponse
     */
    CompletableFuture<PurgeInstanceResponse> purgeInstance(PurgeInstanceRequest request);

    /**
     * @param request the request parameters of QueryHBaseHaDB  QueryHBaseHaDBRequest
     * @return QueryHBaseHaDBResponse
     */
    CompletableFuture<QueryHBaseHaDBResponse> queryHBaseHaDB(QueryHBaseHaDBRequest request);

    /**
     * @param request the request parameters of QueryXpackRelateDB  QueryXpackRelateDBRequest
     * @return QueryXpackRelateDBResponse
     */
    CompletableFuture<QueryXpackRelateDBResponse> queryXpackRelateDB(QueryXpackRelateDBRequest request);

    /**
     * @param request the request parameters of RelateDbForHBaseHa  RelateDbForHBaseHaRequest
     * @return RelateDbForHBaseHaResponse
     */
    CompletableFuture<RelateDbForHBaseHaResponse> relateDbForHBaseHa(RelateDbForHBaseHaRequest request);

    /**
     * @param request the request parameters of ReleasePublicNetworkAddress  ReleasePublicNetworkAddressRequest
     * @return ReleasePublicNetworkAddressResponse
     */
    CompletableFuture<ReleasePublicNetworkAddressResponse> releasePublicNetworkAddress(ReleasePublicNetworkAddressRequest request);

    /**
     * @param request the request parameters of RenewInstance  RenewInstanceRequest
     * @return RenewInstanceResponse
     */
    CompletableFuture<RenewInstanceResponse> renewInstance(RenewInstanceRequest request);

    /**
     * @param request the request parameters of ResizeColdStorageSize  ResizeColdStorageSizeRequest
     * @return ResizeColdStorageSizeResponse
     */
    CompletableFuture<ResizeColdStorageSizeResponse> resizeColdStorageSize(ResizeColdStorageSizeRequest request);

    /**
     * @param request the request parameters of ResizeDiskSize  ResizeDiskSizeRequest
     * @return ResizeDiskSizeResponse
     */
    CompletableFuture<ResizeDiskSizeResponse> resizeDiskSize(ResizeDiskSizeRequest request);

    /**
     * @param request the request parameters of ResizeMultiZoneClusterDiskSize  ResizeMultiZoneClusterDiskSizeRequest
     * @return ResizeMultiZoneClusterDiskSizeResponse
     */
    CompletableFuture<ResizeMultiZoneClusterDiskSizeResponse> resizeMultiZoneClusterDiskSize(ResizeMultiZoneClusterDiskSizeRequest request);

    /**
     * @param request the request parameters of ResizeMultiZoneClusterNodeCount  ResizeMultiZoneClusterNodeCountRequest
     * @return ResizeMultiZoneClusterNodeCountResponse
     */
    CompletableFuture<ResizeMultiZoneClusterNodeCountResponse> resizeMultiZoneClusterNodeCount(ResizeMultiZoneClusterNodeCountRequest request);

    /**
     * @param request the request parameters of ResizeNodeCount  ResizeNodeCountRequest
     * @return ResizeNodeCountResponse
     */
    CompletableFuture<ResizeNodeCountResponse> resizeNodeCount(ResizeNodeCountRequest request);

    /**
     * @param request the request parameters of RestartInstance  RestartInstanceRequest
     * @return RestartInstanceResponse
     */
    CompletableFuture<RestartInstanceResponse> restartInstance(RestartInstanceRequest request);

    /**
     * @param request the request parameters of Revoke  RevokeRequest
     * @return RevokeResponse
     */
    CompletableFuture<RevokeResponse> revoke(RevokeRequest request);

    /**
     * @param request the request parameters of SwitchHbaseHaSlb  SwitchHbaseHaSlbRequest
     * @return SwitchHbaseHaSlbResponse
     */
    CompletableFuture<SwitchHbaseHaSlbResponse> switchHbaseHaSlb(SwitchHbaseHaSlbRequest request);

    /**
     * @param request the request parameters of SwitchService  SwitchServiceRequest
     * @return SwitchServiceResponse
     */
    CompletableFuture<SwitchServiceResponse> switchService(SwitchServiceRequest request);

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @param request the request parameters of UnTagResources  UnTagResourcesRequest
     * @return UnTagResourcesResponse
     */
    CompletableFuture<UnTagResourcesResponse> unTagResources(UnTagResourcesRequest request);

    /**
     * @param request the request parameters of UpgradeMinorVersion  UpgradeMinorVersionRequest
     * @return UpgradeMinorVersionResponse
     */
    CompletableFuture<UpgradeMinorVersionResponse> upgradeMinorVersion(UpgradeMinorVersionRequest request);

    /**
     * @param request the request parameters of UpgradeMultiZoneCluster  UpgradeMultiZoneClusterRequest
     * @return UpgradeMultiZoneClusterResponse
     */
    CompletableFuture<UpgradeMultiZoneClusterResponse> upgradeMultiZoneCluster(UpgradeMultiZoneClusterRequest request);

    /**
     * @param request the request parameters of XpackRelateDB  XpackRelateDBRequest
     * @return XpackRelateDBResponse
     */
    CompletableFuture<XpackRelateDBResponse> xpackRelateDB(XpackRelateDBRequest request);

}
