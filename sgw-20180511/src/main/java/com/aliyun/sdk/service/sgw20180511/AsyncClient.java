// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.sgw20180511.models.*;
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

    CompletableFuture<ActivateAllInOneGatewayResponse> activateAllInOneGateway(ActivateAllInOneGatewayRequest request);

    CompletableFuture<ActivateGatewayResponse> activateGateway(ActivateGatewayRequest request);

    CompletableFuture<AddSharesToExpressSyncResponse> addSharesToExpressSync(AddSharesToExpressSyncRequest request);

    CompletableFuture<AddTagsToGatewayResponse> addTagsToGateway(AddTagsToGatewayRequest request);

    CompletableFuture<CheckActivationKeyResponse> checkActivationKey(CheckActivationKeyRequest request);

    CompletableFuture<CheckBlockVolumeNameResponse> checkBlockVolumeName(CheckBlockVolumeNameRequest request);

    CompletableFuture<CheckGatewayEssdSupportResponse> checkGatewayEssdSupport(CheckGatewayEssdSupportRequest request);

    CompletableFuture<CheckMnsServiceResponse> checkMnsService(CheckMnsServiceRequest request);

    CompletableFuture<CheckRoleResponse> checkRole(CheckRoleRequest request);

    CompletableFuture<CheckSlrRoleResponse> checkSlrRole(CheckSlrRoleRequest request);

    CompletableFuture<CheckUpgradeVersionResponse> checkUpgradeVersion(CheckUpgradeVersionRequest request);

    CompletableFuture<CreateCacheResponse> createCache(CreateCacheRequest request);

    CompletableFuture<CreateElasticGatewayPrivateZoneResponse> createElasticGatewayPrivateZone(CreateElasticGatewayPrivateZoneRequest request);

    CompletableFuture<CreateExpressSyncResponse> createExpressSync(CreateExpressSyncRequest request);

    CompletableFuture<CreateGatewayResponse> createGateway(CreateGatewayRequest request);

    CompletableFuture<CreateGatewayBlockVolumeResponse> createGatewayBlockVolume(CreateGatewayBlockVolumeRequest request);

    CompletableFuture<CreateGatewayCacheDiskResponse> createGatewayCacheDisk(CreateGatewayCacheDiskRequest request);

    CompletableFuture<CreateGatewayFileShareResponse> createGatewayFileShare(CreateGatewayFileShareRequest request);

    CompletableFuture<CreateGatewayLoggingResponse> createGatewayLogging(CreateGatewayLoggingRequest request);

    CompletableFuture<CreateGatewaySMBUserResponse> createGatewaySMBUser(CreateGatewaySMBUserRequest request);

    CompletableFuture<CreateStorageBundleResponse> createStorageBundle(CreateStorageBundleRequest request);

    CompletableFuture<DeleteCSGClientsResponse> deleteCSGClients(DeleteCSGClientsRequest request);

    CompletableFuture<DeleteElasticGatewayPrivateZoneResponse> deleteElasticGatewayPrivateZone(DeleteElasticGatewayPrivateZoneRequest request);

    CompletableFuture<DeleteExpressSyncResponse> deleteExpressSync(DeleteExpressSyncRequest request);

    CompletableFuture<DeleteGatewayResponse> deleteGateway(DeleteGatewayRequest request);

    CompletableFuture<DeleteGatewayBlockVolumesResponse> deleteGatewayBlockVolumes(DeleteGatewayBlockVolumesRequest request);

    CompletableFuture<DeleteGatewayCacheDiskResponse> deleteGatewayCacheDisk(DeleteGatewayCacheDiskRequest request);

    CompletableFuture<DeleteGatewayFileSharesResponse> deleteGatewayFileShares(DeleteGatewayFileSharesRequest request);

    CompletableFuture<DeleteGatewayLoggingResponse> deleteGatewayLogging(DeleteGatewayLoggingRequest request);

    CompletableFuture<DeleteGatewaySMBUserResponse> deleteGatewaySMBUser(DeleteGatewaySMBUserRequest request);

    CompletableFuture<DeleteStorageBundleResponse> deleteStorageBundle(DeleteStorageBundleRequest request);

    CompletableFuture<DeployCSGClientsResponse> deployCSGClients(DeployCSGClientsRequest request);

    CompletableFuture<DeployCacheDiskResponse> deployCacheDisk(DeployCacheDiskRequest request);

    CompletableFuture<DeployGatewayResponse> deployGateway(DeployGatewayRequest request);

    CompletableFuture<DescribeAccountConfigResponse> describeAccountConfig(DescribeAccountConfigRequest request);

    CompletableFuture<DescribeBlockVolumeSnapshotsResponse> describeBlockVolumeSnapshots(DescribeBlockVolumeSnapshotsRequest request);

    CompletableFuture<DescribeCSGClientTasksResponse> describeCSGClientTasks(DescribeCSGClientTasksRequest request);

    CompletableFuture<DescribeCSGClientsResponse> describeCSGClients(DescribeCSGClientsRequest request);

    CompletableFuture<DescribeDashboardResponse> describeDashboard(DescribeDashboardRequest request);

    CompletableFuture<DescribeExpireCachesResponse> describeExpireCaches(DescribeExpireCachesRequest request);

    CompletableFuture<DescribeExpressSyncSharesResponse> describeExpressSyncShares(DescribeExpressSyncSharesRequest request);

    CompletableFuture<DescribeExpressSyncsResponse> describeExpressSyncs(DescribeExpressSyncsRequest request);

    CompletableFuture<DescribeGatewayResponse> describeGateway(DescribeGatewayRequest request);

    CompletableFuture<DescribeGatewayADInfoResponse> describeGatewayADInfo(DescribeGatewayADInfoRequest request);

    CompletableFuture<DescribeGatewayActionsResponse> describeGatewayActions(DescribeGatewayActionsRequest request);

    CompletableFuture<DescribeGatewayAuthInfoResponse> describeGatewayAuthInfo(DescribeGatewayAuthInfoRequest request);

    CompletableFuture<DescribeGatewayAutoPlansResponse> describeGatewayAutoPlans(DescribeGatewayAutoPlansRequest request);

    CompletableFuture<DescribeGatewayAutoUpgradeConfigurationResponse> describeGatewayAutoUpgradeConfiguration(DescribeGatewayAutoUpgradeConfigurationRequest request);

    /**
      * ****
      *
     */
    CompletableFuture<DescribeGatewayBlockVolumesResponse> describeGatewayBlockVolumes(DescribeGatewayBlockVolumesRequest request);

    CompletableFuture<DescribeGatewayBucketCachesResponse> describeGatewayBucketCaches(DescribeGatewayBucketCachesRequest request);

    CompletableFuture<DescribeGatewayCachesResponse> describeGatewayCaches(DescribeGatewayCachesRequest request);

    CompletableFuture<DescribeGatewayCapacityLimitResponse> describeGatewayCapacityLimit(DescribeGatewayCapacityLimitRequest request);

    CompletableFuture<DescribeGatewayCategoriesResponse> describeGatewayCategories(DescribeGatewayCategoriesRequest request);

    CompletableFuture<DescribeGatewayClassesResponse> describeGatewayClasses(DescribeGatewayClassesRequest request);

    CompletableFuture<DescribeGatewayCredentialResponse> describeGatewayCredential(DescribeGatewayCredentialRequest request);

    CompletableFuture<DescribeGatewayDNSResponse> describeGatewayDNS(DescribeGatewayDNSRequest request);

    CompletableFuture<DescribeGatewayFileSharesResponse> describeGatewayFileShares(DescribeGatewayFileSharesRequest request);

    CompletableFuture<DescribeGatewayFileStatusResponse> describeGatewayFileStatus(DescribeGatewayFileStatusRequest request);

    CompletableFuture<DescribeGatewayImagesResponse> describeGatewayImages(DescribeGatewayImagesRequest request);

    CompletableFuture<DescribeGatewayInfoResponse> describeGatewayInfo(DescribeGatewayInfoRequest request);

    CompletableFuture<DescribeGatewayLDAPInfoResponse> describeGatewayLDAPInfo(DescribeGatewayLDAPInfoRequest request);

    CompletableFuture<DescribeGatewayLocationsResponse> describeGatewayLocations(DescribeGatewayLocationsRequest request);

    CompletableFuture<DescribeGatewayLoggingResponse> describeGatewayLogging(DescribeGatewayLoggingRequest request);

    CompletableFuture<DescribeGatewayLogsResponse> describeGatewayLogs(DescribeGatewayLogsRequest request);

    CompletableFuture<DescribeGatewayModificationClassesResponse> describeGatewayModificationClasses(DescribeGatewayModificationClassesRequest request);

    CompletableFuture<DescribeGatewayNFSClientsResponse> describeGatewayNFSClients(DescribeGatewayNFSClientsRequest request);

    CompletableFuture<DescribeGatewaySMBUsersResponse> describeGatewaySMBUsers(DescribeGatewaySMBUsersRequest request);

    CompletableFuture<DescribeGatewayStatisticsResponse> describeGatewayStatistics(DescribeGatewayStatisticsRequest request);

    CompletableFuture<DescribeGatewayStockResponse> describeGatewayStock(DescribeGatewayStockRequest request);

    CompletableFuture<DescribeGatewayTypesResponse> describeGatewayTypes(DescribeGatewayTypesRequest request);

    CompletableFuture<DescribeGatewaysResponse> describeGateways(DescribeGatewaysRequest request);

    CompletableFuture<DescribeGatewaysForCmsResponse> describeGatewaysForCms(DescribeGatewaysForCmsRequest request);

    CompletableFuture<DescribeGatewaysTagsResponse> describeGatewaysTags(DescribeGatewaysTagsRequest request);

    CompletableFuture<DescribeKmsKeyResponse> describeKmsKey(DescribeKmsKeyRequest request);

    CompletableFuture<DescribeMqttConfigResponse> describeMqttConfig(DescribeMqttConfigRequest request);

    CompletableFuture<DescribeOssBucketInfoResponse> describeOssBucketInfo(DescribeOssBucketInfoRequest request);

    CompletableFuture<DescribeOssBucketsResponse> describeOssBuckets(DescribeOssBucketsRequest request);

    CompletableFuture<DescribePayAsYouGoPriceResponse> describePayAsYouGoPrice(DescribePayAsYouGoPriceRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeSharesBucketInfoForExpressSyncResponse> describeSharesBucketInfoForExpressSync(DescribeSharesBucketInfoForExpressSyncRequest request);

    CompletableFuture<DescribeStorageBundleResponse> describeStorageBundle(DescribeStorageBundleRequest request);

    CompletableFuture<DescribeStorageBundlesResponse> describeStorageBundles(DescribeStorageBundlesRequest request);

    CompletableFuture<DescribeSubscriptionPriceResponse> describeSubscriptionPrice(DescribeSubscriptionPriceRequest request);

    CompletableFuture<DescribeTasksResponse> describeTasks(DescribeTasksRequest request);

    CompletableFuture<DescribeUserBusinessStatusResponse> describeUserBusinessStatus(DescribeUserBusinessStatusRequest request);

    CompletableFuture<DescribeVSwitchesResponse> describeVSwitches(DescribeVSwitchesRequest request);

    CompletableFuture<DescribeVpcsResponse> describeVpcs(DescribeVpcsRequest request);

    CompletableFuture<DescribeZonesResponse> describeZones(DescribeZonesRequest request);

    CompletableFuture<DisableGatewayLoggingResponse> disableGatewayLogging(DisableGatewayLoggingRequest request);

    CompletableFuture<DisableGatewayNFSVersionResponse> disableGatewayNFSVersion(DisableGatewayNFSVersionRequest request);

    CompletableFuture<EnableGatewayIpv6Response> enableGatewayIpv6(EnableGatewayIpv6Request request);

    CompletableFuture<EnableGatewayLoggingResponse> enableGatewayLogging(EnableGatewayLoggingRequest request);

    CompletableFuture<ExpandCacheDiskResponse> expandCacheDisk(ExpandCacheDiskRequest request);

    CompletableFuture<ExpandGatewayFileShareResponse> expandGatewayFileShare(ExpandGatewayFileShareRequest request);

    CompletableFuture<ExpandGatewayNetworkBandwidthResponse> expandGatewayNetworkBandwidth(ExpandGatewayNetworkBandwidthRequest request);

    CompletableFuture<GenerateGatewayTokenResponse> generateGatewayToken(GenerateGatewayTokenRequest request);

    CompletableFuture<GenerateMqttTokenResponse> generateMqttToken(GenerateMqttTokenRequest request);

    CompletableFuture<GenerateStsTokenResponse> generateStsToken(GenerateStsTokenRequest request);

    CompletableFuture<HandleGatewayAutoPlanResponse> handleGatewayAutoPlan(HandleGatewayAutoPlanRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ModifyGatewayResponse> modifyGateway(ModifyGatewayRequest request);

    CompletableFuture<ModifyGatewayBlockVolumeResponse> modifyGatewayBlockVolume(ModifyGatewayBlockVolumeRequest request);

    CompletableFuture<ModifyGatewayClassResponse> modifyGatewayClass(ModifyGatewayClassRequest request);

    CompletableFuture<ModifyGatewayFileShareResponse> modifyGatewayFileShare(ModifyGatewayFileShareRequest request);

    CompletableFuture<ModifyGatewayFileShareWatermarkResponse> modifyGatewayFileShareWatermark(ModifyGatewayFileShareWatermarkRequest request);

    CompletableFuture<ModifyStorageBundleResponse> modifyStorageBundle(ModifyStorageBundleRequest request);

    CompletableFuture<OpenSgwServiceResponse> openSgwService(OpenSgwServiceRequest request);

    CompletableFuture<OperateGatewayResponse> operateGateway(OperateGatewayRequest request);

    CompletableFuture<ReleaseServiceResponse> releaseService(ReleaseServiceRequest request);

    CompletableFuture<RemoveSharesFromExpressSyncResponse> removeSharesFromExpressSync(RemoveSharesFromExpressSyncRequest request);

    CompletableFuture<RemoveTagsFromGatewayResponse> removeTagsFromGateway(RemoveTagsFromGatewayRequest request);

    CompletableFuture<ReportBlockVolumesResponse> reportBlockVolumes(ReportBlockVolumesRequest request);

    CompletableFuture<ReportFileSharesResponse> reportFileShares(ReportFileSharesRequest request);

    CompletableFuture<ReportGatewayInfoResponse> reportGatewayInfo(ReportGatewayInfoRequest request);

    CompletableFuture<ReportGatewayUsageResponse> reportGatewayUsage(ReportGatewayUsageRequest request);

    CompletableFuture<ResetGatewayPasswordResponse> resetGatewayPassword(ResetGatewayPasswordRequest request);

    CompletableFuture<RestartFileSharesResponse> restartFileShares(RestartFileSharesRequest request);

    CompletableFuture<SetGatewayADInfoResponse> setGatewayADInfo(SetGatewayADInfoRequest request);

    CompletableFuture<SetGatewayAutoUpgradeConfigurationResponse> setGatewayAutoUpgradeConfiguration(SetGatewayAutoUpgradeConfigurationRequest request);

    CompletableFuture<SetGatewayDNSResponse> setGatewayDNS(SetGatewayDNSRequest request);

    CompletableFuture<SetGatewayLDAPInfoResponse> setGatewayLDAPInfo(SetGatewayLDAPInfoRequest request);

    CompletableFuture<SwitchCSGClientsReverseSyncConfigurationResponse> switchCSGClientsReverseSyncConfiguration(SwitchCSGClientsReverseSyncConfigurationRequest request);

    CompletableFuture<SwitchGatewayExpirationPolicyResponse> switchGatewayExpirationPolicy(SwitchGatewayExpirationPolicyRequest request);

    CompletableFuture<SwitchToSubscriptionResponse> switchToSubscription(SwitchToSubscriptionRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<TriggerGatewayRemoteSyncResponse> triggerGatewayRemoteSync(TriggerGatewayRemoteSyncRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpdateGatewayBlockVolumeResponse> updateGatewayBlockVolume(UpdateGatewayBlockVolumeRequest request);

    CompletableFuture<UpdateGatewayFileShareResponse> updateGatewayFileShare(UpdateGatewayFileShareRequest request);

    CompletableFuture<UpgradeGatewayResponse> upgradeGateway(UpgradeGatewayRequest request);

    CompletableFuture<UploadCSGClientLogResponse> uploadCSGClientLog(UploadCSGClientLogRequest request);

    CompletableFuture<UploadGatewayLogResponse> uploadGatewayLog(UploadGatewayLogRequest request);

    CompletableFuture<ValidateExpressSyncConfigResponse> validateExpressSyncConfig(ValidateExpressSyncConfigRequest request);

    CompletableFuture<ValidateGatewayNameResponse> validateGatewayName(ValidateGatewayNameRequest request);

}
