// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20170115;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.hbase20170115.models.*;
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

    CompletableFuture<CheckVersionsOfComponentsResponse> checkVersionsOfComponents(CheckVersionsOfComponentsRequest request);

    CompletableFuture<CloseBackupResponse> closeBackup(CloseBackupRequest request);

    CompletableFuture<ConvertClusterResponse> convertCluster(ConvertClusterRequest request);

    CompletableFuture<CreateClusterResponse> createCluster(CreateClusterRequest request);

    CompletableFuture<CreateGlobalResourceResponse> createGlobalResource(CreateGlobalResourceRequest request);

    CompletableFuture<CreateHbaseSlbServerResponse> createHbaseSlbServer(CreateHbaseSlbServerRequest request);

    CompletableFuture<CreateSubscriptionResponse> createSubscription(CreateSubscriptionRequest request);

    CompletableFuture<DeleteClusterResponse> deleteCluster(DeleteClusterRequest request);

    CompletableFuture<DeleteGlobalResourceResponse> deleteGlobalResource(DeleteGlobalResourceRequest request);

    CompletableFuture<DeleteHbaseSlbServerResponse> deleteHbaseSlbServer(DeleteHbaseSlbServerRequest request);

    CompletableFuture<DeleteServerlessInstanceResponse> deleteServerlessInstance(DeleteServerlessInstanceRequest request);

    CompletableFuture<DeleteUserHdfsInfoResponse> deleteUserHdfsInfo(DeleteUserHdfsInfoRequest request);

    CompletableFuture<DescribeBackupPolicyResponse> describeBackupPolicy(DescribeBackupPolicyRequest request);

    CompletableFuture<DescribeBackupsResponse> describeBackups(DescribeBackupsRequest request);

    CompletableFuture<DescribeClusterAttributeResponse> describeClusterAttribute(DescribeClusterAttributeRequest request);

    CompletableFuture<DescribeClusterConnectAddrsResponse> describeClusterConnectAddrs(DescribeClusterConnectAddrsRequest request);

    CompletableFuture<DescribeClusterListResponse> describeClusterList(DescribeClusterListRequest request);

    CompletableFuture<DescribeClusterModelResponse> describeClusterModel(DescribeClusterModelRequest request);

    CompletableFuture<DescribeClusterWhiteListResponse> describeClusterWhiteList(DescribeClusterWhiteListRequest request);

    CompletableFuture<DescribeColdStorageResponse> describeColdStorage(DescribeColdStorageRequest request);

    CompletableFuture<DescribeMultiModDbAttributeResponse> describeMultiModDbAttribute(DescribeMultiModDbAttributeRequest request);

    CompletableFuture<DescribeRdsVSwitchsResponse> describeRdsVSwitchs(DescribeRdsVSwitchsRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeServerlessInstanceResponse> describeServerlessInstance(DescribeServerlessInstanceRequest request);

    CompletableFuture<DescribeSubscriptionInitializeProgressResponse> describeSubscriptionInitializeProgress(DescribeSubscriptionInitializeProgressRequest request);

    CompletableFuture<DescribeSubscriptionPerformanceResponse> describeSubscriptionPerformance(DescribeSubscriptionPerformanceRequest request);

    CompletableFuture<DescribeSubscriptionPermissionResponse> describeSubscriptionPermission(DescribeSubscriptionPermissionRequest request);

    CompletableFuture<DescribeSubscriptionsResponse> describeSubscriptions(DescribeSubscriptionsRequest request);

    CompletableFuture<EnableServerlessPublicConnectionResponse> enableServerlessPublicConnection(EnableServerlessPublicConnectionRequest request);

    CompletableFuture<GetMultimodeCmsUrlResponse> getMultimodeCmsUrl(GetMultimodeCmsUrlRequest request);

    CompletableFuture<ListClusterServiceConfigResponse> listClusterServiceConfig(ListClusterServiceConfigRequest request);

    CompletableFuture<ListClusterServiceConfigHistoryResponse> listClusterServiceConfigHistory(ListClusterServiceConfigHistoryRequest request);

    CompletableFuture<ListHbaseInstancesResponse> listHbaseInstances(ListHbaseInstancesRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ModifyBackupPolicyResponse> modifyBackupPolicy(ModifyBackupPolicyRequest request);

    CompletableFuture<ModifyClusterNameResponse> modifyClusterName(ModifyClusterNameRequest request);

    CompletableFuture<ModifyClusterNetTypeResponse> modifyClusterNetType(ModifyClusterNetTypeRequest request);

    CompletableFuture<ModifyClusterSecurityIpListResponse> modifyClusterSecurityIpList(ModifyClusterSecurityIpListRequest request);

    CompletableFuture<ModifyClusterServiceConfigResponse> modifyClusterServiceConfig(ModifyClusterServiceConfigRequest request);

    CompletableFuture<ModifyHasRootPasswordResponse> modifyHasRootPassword(ModifyHasRootPasswordRequest request);

    CompletableFuture<ModifyRestartClusterResponse> modifyRestartCluster(ModifyRestartClusterRequest request);

    CompletableFuture<ModifyRollbackHasForHbaseResponse> modifyRollbackHasForHbase(ModifyRollbackHasForHbaseRequest request);

    CompletableFuture<ModifySubscriptionDescriptionResponse> modifySubscriptionDescription(ModifySubscriptionDescriptionRequest request);

    CompletableFuture<ModifySubscriptionMappingResponse> modifySubscriptionMapping(ModifySubscriptionMappingRequest request);

    CompletableFuture<ModifySubscriptionPermissionResponse> modifySubscriptionPermission(ModifySubscriptionPermissionRequest request);

    CompletableFuture<ModifyUIProxyAccountPasswordResponse> modifyUIProxyAccountPassword(ModifyUIProxyAccountPasswordRequest request);

    CompletableFuture<ModifyUpgradeToHasForHbaseResponse> modifyUpgradeToHasForHbase(ModifyUpgradeToHasForHbaseRequest request);

    CompletableFuture<MultimodAddComponentsResponse> multimodAddComponents(MultimodAddComponentsRequest request);

    CompletableFuture<OpenBackupResponse> openBackup(OpenBackupRequest request);

    CompletableFuture<QueryHBaseHaDBResponse> queryHBaseHaDB(QueryHBaseHaDBRequest request);

    CompletableFuture<QuerySparkRelateHBaseResponse> querySparkRelateHBase(QuerySparkRelateHBaseRequest request);

    CompletableFuture<QueryXpackRelatedDBResponse> queryXpackRelatedDB(QueryXpackRelatedDBRequest request);

    CompletableFuture<RelateDbForHBaseHaResponse> relateDbForHBaseHa(RelateDbForHBaseHaRequest request);

    CompletableFuture<ReleasePublicNetworkAddressResponse> releasePublicNetworkAddress(ReleasePublicNetworkAddressRequest request);

    CompletableFuture<ReleaseSubscriptionResponse> releaseSubscription(ReleaseSubscriptionRequest request);

    CompletableFuture<RenewClusterResponse> renewCluster(RenewClusterRequest request);

    CompletableFuture<ResizeClusterResponse> resizeCluster(ResizeClusterRequest request);

    CompletableFuture<SparkRelateHBaseResponse> sparkRelateHBase(SparkRelateHBaseRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpgradeMinorVersionResponse> upgradeMinorVersion(UpgradeMinorVersionRequest request);

    CompletableFuture<XpackRelateDBResponse> xpackRelateDB(XpackRelateDBRequest request);

}
