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
     * @param request the request parameters of CheckVersionsOfComponents  CheckVersionsOfComponentsRequest
     * @return CheckVersionsOfComponentsResponse
     */
    CompletableFuture<CheckVersionsOfComponentsResponse> checkVersionsOfComponents(CheckVersionsOfComponentsRequest request);

    /**
     * @param request the request parameters of CloseBackup  CloseBackupRequest
     * @return CloseBackupResponse
     */
    CompletableFuture<CloseBackupResponse> closeBackup(CloseBackupRequest request);

    /**
     * @param request the request parameters of ConvertCluster  ConvertClusterRequest
     * @return ConvertClusterResponse
     */
    CompletableFuture<ConvertClusterResponse> convertCluster(ConvertClusterRequest request);

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
     * @param request the request parameters of CreateHbaseSlbServer  CreateHbaseSlbServerRequest
     * @return CreateHbaseSlbServerResponse
     */
    CompletableFuture<CreateHbaseSlbServerResponse> createHbaseSlbServer(CreateHbaseSlbServerRequest request);

    /**
     * @param request the request parameters of CreateSubscription  CreateSubscriptionRequest
     * @return CreateSubscriptionResponse
     */
    CompletableFuture<CreateSubscriptionResponse> createSubscription(CreateSubscriptionRequest request);

    /**
     * @param request the request parameters of DeleteCluster  DeleteClusterRequest
     * @return DeleteClusterResponse
     */
    CompletableFuture<DeleteClusterResponse> deleteCluster(DeleteClusterRequest request);

    /**
     * @param request the request parameters of DeleteGlobalResource  DeleteGlobalResourceRequest
     * @return DeleteGlobalResourceResponse
     */
    CompletableFuture<DeleteGlobalResourceResponse> deleteGlobalResource(DeleteGlobalResourceRequest request);

    /**
     * @param request the request parameters of DeleteHbaseSlbServer  DeleteHbaseSlbServerRequest
     * @return DeleteHbaseSlbServerResponse
     */
    CompletableFuture<DeleteHbaseSlbServerResponse> deleteHbaseSlbServer(DeleteHbaseSlbServerRequest request);

    /**
     * @param request the request parameters of DeleteServerlessInstance  DeleteServerlessInstanceRequest
     * @return DeleteServerlessInstanceResponse
     */
    CompletableFuture<DeleteServerlessInstanceResponse> deleteServerlessInstance(DeleteServerlessInstanceRequest request);

    /**
     * @param request the request parameters of DeleteUserHdfsInfo  DeleteUserHdfsInfoRequest
     * @return DeleteUserHdfsInfoResponse
     */
    CompletableFuture<DeleteUserHdfsInfoResponse> deleteUserHdfsInfo(DeleteUserHdfsInfoRequest request);

    /**
     * @param request the request parameters of DescribeBackupPolicy  DescribeBackupPolicyRequest
     * @return DescribeBackupPolicyResponse
     */
    CompletableFuture<DescribeBackupPolicyResponse> describeBackupPolicy(DescribeBackupPolicyRequest request);

    /**
     * @param request the request parameters of DescribeBackups  DescribeBackupsRequest
     * @return DescribeBackupsResponse
     */
    CompletableFuture<DescribeBackupsResponse> describeBackups(DescribeBackupsRequest request);

    /**
     * @param request the request parameters of DescribeClusterAttribute  DescribeClusterAttributeRequest
     * @return DescribeClusterAttributeResponse
     */
    CompletableFuture<DescribeClusterAttributeResponse> describeClusterAttribute(DescribeClusterAttributeRequest request);

    /**
     * @param request the request parameters of DescribeClusterConnectAddrs  DescribeClusterConnectAddrsRequest
     * @return DescribeClusterConnectAddrsResponse
     */
    CompletableFuture<DescribeClusterConnectAddrsResponse> describeClusterConnectAddrs(DescribeClusterConnectAddrsRequest request);

    /**
     * @param request the request parameters of DescribeClusterList  DescribeClusterListRequest
     * @return DescribeClusterListResponse
     */
    CompletableFuture<DescribeClusterListResponse> describeClusterList(DescribeClusterListRequest request);

    /**
     * @param request the request parameters of DescribeClusterModel  DescribeClusterModelRequest
     * @return DescribeClusterModelResponse
     */
    CompletableFuture<DescribeClusterModelResponse> describeClusterModel(DescribeClusterModelRequest request);

    /**
     * @param request the request parameters of DescribeClusterWhiteList  DescribeClusterWhiteListRequest
     * @return DescribeClusterWhiteListResponse
     */
    CompletableFuture<DescribeClusterWhiteListResponse> describeClusterWhiteList(DescribeClusterWhiteListRequest request);

    /**
     * @param request the request parameters of DescribeColdStorage  DescribeColdStorageRequest
     * @return DescribeColdStorageResponse
     */
    CompletableFuture<DescribeColdStorageResponse> describeColdStorage(DescribeColdStorageRequest request);

    /**
     * @param request the request parameters of DescribeMultiModDbAttribute  DescribeMultiModDbAttributeRequest
     * @return DescribeMultiModDbAttributeResponse
     */
    CompletableFuture<DescribeMultiModDbAttributeResponse> describeMultiModDbAttribute(DescribeMultiModDbAttributeRequest request);

    /**
     * @param request the request parameters of DescribeRdsVSwitchs  DescribeRdsVSwitchsRequest
     * @return DescribeRdsVSwitchsResponse
     */
    CompletableFuture<DescribeRdsVSwitchsResponse> describeRdsVSwitchs(DescribeRdsVSwitchsRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * @param request the request parameters of DescribeServerlessInstance  DescribeServerlessInstanceRequest
     * @return DescribeServerlessInstanceResponse
     */
    CompletableFuture<DescribeServerlessInstanceResponse> describeServerlessInstance(DescribeServerlessInstanceRequest request);

    /**
     * @param request the request parameters of DescribeSubscriptionInitializeProgress  DescribeSubscriptionInitializeProgressRequest
     * @return DescribeSubscriptionInitializeProgressResponse
     */
    CompletableFuture<DescribeSubscriptionInitializeProgressResponse> describeSubscriptionInitializeProgress(DescribeSubscriptionInitializeProgressRequest request);

    /**
     * @param request the request parameters of DescribeSubscriptionPerformance  DescribeSubscriptionPerformanceRequest
     * @return DescribeSubscriptionPerformanceResponse
     */
    CompletableFuture<DescribeSubscriptionPerformanceResponse> describeSubscriptionPerformance(DescribeSubscriptionPerformanceRequest request);

    /**
     * @param request the request parameters of DescribeSubscriptionPermission  DescribeSubscriptionPermissionRequest
     * @return DescribeSubscriptionPermissionResponse
     */
    CompletableFuture<DescribeSubscriptionPermissionResponse> describeSubscriptionPermission(DescribeSubscriptionPermissionRequest request);

    /**
     * @param request the request parameters of DescribeSubscriptions  DescribeSubscriptionsRequest
     * @return DescribeSubscriptionsResponse
     */
    CompletableFuture<DescribeSubscriptionsResponse> describeSubscriptions(DescribeSubscriptionsRequest request);

    /**
     * @param request the request parameters of EnableServerlessPublicConnection  EnableServerlessPublicConnectionRequest
     * @return EnableServerlessPublicConnectionResponse
     */
    CompletableFuture<EnableServerlessPublicConnectionResponse> enableServerlessPublicConnection(EnableServerlessPublicConnectionRequest request);

    /**
     * @param request the request parameters of GetMultimodeCmsUrl  GetMultimodeCmsUrlRequest
     * @return GetMultimodeCmsUrlResponse
     */
    CompletableFuture<GetMultimodeCmsUrlResponse> getMultimodeCmsUrl(GetMultimodeCmsUrlRequest request);

    /**
     * @param request the request parameters of ListClusterServiceConfig  ListClusterServiceConfigRequest
     * @return ListClusterServiceConfigResponse
     */
    CompletableFuture<ListClusterServiceConfigResponse> listClusterServiceConfig(ListClusterServiceConfigRequest request);

    /**
     * @param request the request parameters of ListClusterServiceConfigHistory  ListClusterServiceConfigHistoryRequest
     * @return ListClusterServiceConfigHistoryResponse
     */
    CompletableFuture<ListClusterServiceConfigHistoryResponse> listClusterServiceConfigHistory(ListClusterServiceConfigHistoryRequest request);

    /**
     * @param request the request parameters of ListHbaseInstances  ListHbaseInstancesRequest
     * @return ListHbaseInstancesResponse
     */
    CompletableFuture<ListHbaseInstancesResponse> listHbaseInstances(ListHbaseInstancesRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of ModifyBackupPolicy  ModifyBackupPolicyRequest
     * @return ModifyBackupPolicyResponse
     */
    CompletableFuture<ModifyBackupPolicyResponse> modifyBackupPolicy(ModifyBackupPolicyRequest request);

    /**
     * @param request the request parameters of ModifyClusterName  ModifyClusterNameRequest
     * @return ModifyClusterNameResponse
     */
    CompletableFuture<ModifyClusterNameResponse> modifyClusterName(ModifyClusterNameRequest request);

    /**
     * @param request the request parameters of ModifyClusterNetType  ModifyClusterNetTypeRequest
     * @return ModifyClusterNetTypeResponse
     */
    CompletableFuture<ModifyClusterNetTypeResponse> modifyClusterNetType(ModifyClusterNetTypeRequest request);

    /**
     * @param request the request parameters of ModifyClusterSecurityIpList  ModifyClusterSecurityIpListRequest
     * @return ModifyClusterSecurityIpListResponse
     */
    CompletableFuture<ModifyClusterSecurityIpListResponse> modifyClusterSecurityIpList(ModifyClusterSecurityIpListRequest request);

    /**
     * @param request the request parameters of ModifyClusterServiceConfig  ModifyClusterServiceConfigRequest
     * @return ModifyClusterServiceConfigResponse
     */
    CompletableFuture<ModifyClusterServiceConfigResponse> modifyClusterServiceConfig(ModifyClusterServiceConfigRequest request);

    /**
     * @param request the request parameters of ModifyHasRootPassword  ModifyHasRootPasswordRequest
     * @return ModifyHasRootPasswordResponse
     */
    CompletableFuture<ModifyHasRootPasswordResponse> modifyHasRootPassword(ModifyHasRootPasswordRequest request);

    /**
     * @param request the request parameters of ModifyRestartCluster  ModifyRestartClusterRequest
     * @return ModifyRestartClusterResponse
     */
    CompletableFuture<ModifyRestartClusterResponse> modifyRestartCluster(ModifyRestartClusterRequest request);

    /**
     * @param request the request parameters of ModifyRollbackHasForHbase  ModifyRollbackHasForHbaseRequest
     * @return ModifyRollbackHasForHbaseResponse
     */
    CompletableFuture<ModifyRollbackHasForHbaseResponse> modifyRollbackHasForHbase(ModifyRollbackHasForHbaseRequest request);

    /**
     * @param request the request parameters of ModifySubscriptionDescription  ModifySubscriptionDescriptionRequest
     * @return ModifySubscriptionDescriptionResponse
     */
    CompletableFuture<ModifySubscriptionDescriptionResponse> modifySubscriptionDescription(ModifySubscriptionDescriptionRequest request);

    /**
     * @param request the request parameters of ModifySubscriptionMapping  ModifySubscriptionMappingRequest
     * @return ModifySubscriptionMappingResponse
     */
    CompletableFuture<ModifySubscriptionMappingResponse> modifySubscriptionMapping(ModifySubscriptionMappingRequest request);

    /**
     * @param request the request parameters of ModifySubscriptionPermission  ModifySubscriptionPermissionRequest
     * @return ModifySubscriptionPermissionResponse
     */
    CompletableFuture<ModifySubscriptionPermissionResponse> modifySubscriptionPermission(ModifySubscriptionPermissionRequest request);

    /**
     * @param request the request parameters of ModifyUIProxyAccountPassword  ModifyUIProxyAccountPasswordRequest
     * @return ModifyUIProxyAccountPasswordResponse
     */
    CompletableFuture<ModifyUIProxyAccountPasswordResponse> modifyUIProxyAccountPassword(ModifyUIProxyAccountPasswordRequest request);

    /**
     * @param request the request parameters of ModifyUpgradeToHasForHbase  ModifyUpgradeToHasForHbaseRequest
     * @return ModifyUpgradeToHasForHbaseResponse
     */
    CompletableFuture<ModifyUpgradeToHasForHbaseResponse> modifyUpgradeToHasForHbase(ModifyUpgradeToHasForHbaseRequest request);

    /**
     * @param request the request parameters of MultimodAddComponents  MultimodAddComponentsRequest
     * @return MultimodAddComponentsResponse
     */
    CompletableFuture<MultimodAddComponentsResponse> multimodAddComponents(MultimodAddComponentsRequest request);

    /**
     * @param request the request parameters of OpenBackup  OpenBackupRequest
     * @return OpenBackupResponse
     */
    CompletableFuture<OpenBackupResponse> openBackup(OpenBackupRequest request);

    /**
     * @param request the request parameters of QueryHBaseHaDB  QueryHBaseHaDBRequest
     * @return QueryHBaseHaDBResponse
     */
    CompletableFuture<QueryHBaseHaDBResponse> queryHBaseHaDB(QueryHBaseHaDBRequest request);

    /**
     * @param request the request parameters of QuerySparkRelateHBase  QuerySparkRelateHBaseRequest
     * @return QuerySparkRelateHBaseResponse
     */
    CompletableFuture<QuerySparkRelateHBaseResponse> querySparkRelateHBase(QuerySparkRelateHBaseRequest request);

    /**
     * @param request the request parameters of QueryXpackRelatedDB  QueryXpackRelatedDBRequest
     * @return QueryXpackRelatedDBResponse
     */
    CompletableFuture<QueryXpackRelatedDBResponse> queryXpackRelatedDB(QueryXpackRelatedDBRequest request);

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
     * @param request the request parameters of ReleaseSubscription  ReleaseSubscriptionRequest
     * @return ReleaseSubscriptionResponse
     */
    CompletableFuture<ReleaseSubscriptionResponse> releaseSubscription(ReleaseSubscriptionRequest request);

    /**
     * @param request the request parameters of RenewCluster  RenewClusterRequest
     * @return RenewClusterResponse
     */
    CompletableFuture<RenewClusterResponse> renewCluster(RenewClusterRequest request);

    /**
     * @param request the request parameters of ResizeCluster  ResizeClusterRequest
     * @return ResizeClusterResponse
     */
    CompletableFuture<ResizeClusterResponse> resizeCluster(ResizeClusterRequest request);

    /**
     * @param request the request parameters of SparkRelateHBase  SparkRelateHBaseRequest
     * @return SparkRelateHBaseResponse
     */
    CompletableFuture<SparkRelateHBaseResponse> sparkRelateHBase(SparkRelateHBaseRequest request);

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
     * @param request the request parameters of UpgradeMinorVersion  UpgradeMinorVersionRequest
     * @return UpgradeMinorVersionResponse
     */
    CompletableFuture<UpgradeMinorVersionResponse> upgradeMinorVersion(UpgradeMinorVersionRequest request);

    /**
     * @param request the request parameters of XpackRelateDB  XpackRelateDBRequest
     * @return XpackRelateDBResponse
     */
    CompletableFuture<XpackRelateDBResponse> xpackRelateDB(XpackRelateDBRequest request);

}
