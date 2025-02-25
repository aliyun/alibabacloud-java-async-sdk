// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20220101;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.clickhouse20220101.models.*;
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
     * @param request the request parameters of AllocateVirtualWareHousePublicConnection  AllocateVirtualWareHousePublicConnectionRequest
     * @return AllocateVirtualWareHousePublicConnectionResponse
     */
    CompletableFuture<AllocateVirtualWareHousePublicConnectionResponse> allocateVirtualWareHousePublicConnection(AllocateVirtualWareHousePublicConnectionRequest request);

    /**
     * @param request the request parameters of CheckCreateCluster  CheckCreateClusterRequest
     * @return CheckCreateClusterResponse
     */
    CompletableFuture<CheckCreateClusterResponse> checkCreateCluster(CheckCreateClusterRequest request);

    /**
     * @param request the request parameters of CheckCreateVirtualWareHouse  CheckCreateVirtualWareHouseRequest
     * @return CheckCreateVirtualWareHouseResponse
     */
    CompletableFuture<CheckCreateVirtualWareHouseResponse> checkCreateVirtualWareHouse(CheckCreateVirtualWareHouseRequest request);

    /**
     * @param request the request parameters of CheckDeleteVirtualWareHouse  CheckDeleteVirtualWareHouseRequest
     * @return CheckDeleteVirtualWareHouseResponse
     */
    CompletableFuture<CheckDeleteVirtualWareHouseResponse> checkDeleteVirtualWareHouse(CheckDeleteVirtualWareHouseRequest request);

    /**
     * @param request the request parameters of CheckModifyVirtualWareHouseResource  CheckModifyVirtualWareHouseResourceRequest
     * @return CheckModifyVirtualWareHouseResourceResponse
     */
    CompletableFuture<CheckModifyVirtualWareHouseResourceResponse> checkModifyVirtualWareHouseResource(CheckModifyVirtualWareHouseResourceRequest request);

    /**
     * @param request the request parameters of CreateAccount  CreateAccountRequest
     * @return CreateAccountResponse
     */
    CompletableFuture<CreateAccountResponse> createAccount(CreateAccountRequest request);

    /**
     * @param request the request parameters of CreateCluster  CreateClusterRequest
     * @return CreateClusterResponse
     */
    CompletableFuture<CreateClusterResponse> createCluster(CreateClusterRequest request);

    /**
     * @param request the request parameters of CreateVirtualWareHouse  CreateVirtualWareHouseRequest
     * @return CreateVirtualWareHouseResponse
     */
    CompletableFuture<CreateVirtualWareHouseResponse> createVirtualWareHouse(CreateVirtualWareHouseRequest request);

    /**
     * @param request the request parameters of DeleteAccount  DeleteAccountRequest
     * @return DeleteAccountResponse
     */
    CompletableFuture<DeleteAccountResponse> deleteAccount(DeleteAccountRequest request);

    /**
     * @param request the request parameters of DeleteCluster  DeleteClusterRequest
     * @return DeleteClusterResponse
     */
    CompletableFuture<DeleteClusterResponse> deleteCluster(DeleteClusterRequest request);

    /**
     * @param request the request parameters of DeleteClusterSecurityIPGroup  DeleteClusterSecurityIPGroupRequest
     * @return DeleteClusterSecurityIPGroupResponse
     */
    CompletableFuture<DeleteClusterSecurityIPGroupResponse> deleteClusterSecurityIPGroup(DeleteClusterSecurityIPGroupRequest request);

    /**
     * @param request the request parameters of DeleteVirtualWareHouse  DeleteVirtualWareHouseRequest
     * @return DeleteVirtualWareHouseResponse
     */
    CompletableFuture<DeleteVirtualWareHouseResponse> deleteVirtualWareHouse(DeleteVirtualWareHouseRequest request);

    /**
     * @param request the request parameters of DescribeAccount  DescribeAccountRequest
     * @return DescribeAccountResponse
     */
    CompletableFuture<DescribeAccountResponse> describeAccount(DescribeAccountRequest request);

    /**
     * @param request the request parameters of DescribeCluster  DescribeClusterRequest
     * @return DescribeClusterResponse
     */
    CompletableFuture<DescribeClusterResponse> describeCluster(DescribeClusterRequest request);

    /**
     * @param request the request parameters of DescribeClusterSecurityInfo  DescribeClusterSecurityInfoRequest
     * @return DescribeClusterSecurityInfoResponse
     */
    CompletableFuture<DescribeClusterSecurityInfoResponse> describeClusterSecurityInfo(DescribeClusterSecurityInfoRequest request);

    /**
     * @param request the request parameters of DescribeClusterStatusSet  DescribeClusterStatusSetRequest
     * @return DescribeClusterStatusSetResponse
     */
    CompletableFuture<DescribeClusterStatusSetResponse> describeClusterStatusSet(DescribeClusterStatusSetRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * @param request the request parameters of DescribeRunningQuery  DescribeRunningQueryRequest
     * @return DescribeRunningQueryResponse
     */
    CompletableFuture<DescribeRunningQueryResponse> describeRunningQuery(DescribeRunningQueryRequest request);

    /**
     * @param request the request parameters of DescribeSlowQuery  DescribeSlowQueryRequest
     * @return DescribeSlowQueryResponse
     */
    CompletableFuture<DescribeSlowQueryResponse> describeSlowQuery(DescribeSlowQueryRequest request);

    /**
     * @param request the request parameters of DescribeSlowQueryTrend  DescribeSlowQueryTrendRequest
     * @return DescribeSlowQueryTrendResponse
     */
    CompletableFuture<DescribeSlowQueryTrendResponse> describeSlowQueryTrend(DescribeSlowQueryTrendRequest request);

    /**
     * @param request the request parameters of DescribeVirtualWareHouse  DescribeVirtualWareHouseRequest
     * @return DescribeVirtualWareHouseResponse
     */
    CompletableFuture<DescribeVirtualWareHouseResponse> describeVirtualWareHouse(DescribeVirtualWareHouseRequest request);

    /**
     * @param request the request parameters of DescribeVirtualWareHouseClassSet  DescribeVirtualWareHouseClassSetRequest
     * @return DescribeVirtualWareHouseClassSetResponse
     */
    CompletableFuture<DescribeVirtualWareHouseClassSetResponse> describeVirtualWareHouseClassSet(DescribeVirtualWareHouseClassSetRequest request);

    /**
     * @param request the request parameters of DescribeVirtualWareHouseEndpointInfo  DescribeVirtualWareHouseEndpointInfoRequest
     * @return DescribeVirtualWareHouseEndpointInfoResponse
     */
    CompletableFuture<DescribeVirtualWareHouseEndpointInfoResponse> describeVirtualWareHouseEndpointInfo(DescribeVirtualWareHouseEndpointInfoRequest request);

    /**
     * @param request the request parameters of DescribeVirtualWareHouseStatusSet  DescribeVirtualWareHouseStatusSetRequest
     * @return DescribeVirtualWareHouseStatusSetResponse
     */
    CompletableFuture<DescribeVirtualWareHouseStatusSetResponse> describeVirtualWareHouseStatusSet(DescribeVirtualWareHouseStatusSetRequest request);

    /**
     * @param request the request parameters of GetDistributedTablesBufferSize  GetDistributedTablesBufferSizeRequest
     * @return GetDistributedTablesBufferSizeResponse
     */
    CompletableFuture<GetDistributedTablesBufferSizeResponse> getDistributedTablesBufferSize(GetDistributedTablesBufferSizeRequest request);

    /**
     * @param request the request parameters of KillQuery  KillQueryRequest
     * @return KillQueryResponse
     */
    CompletableFuture<KillQueryResponse> killQuery(KillQueryRequest request);

    /**
     * @param request the request parameters of ListAccounts  ListAccountsRequest
     * @return ListAccountsResponse
     */
    CompletableFuture<ListAccountsResponse> listAccounts(ListAccountsRequest request);

    /**
     * @param request the request parameters of ListClusters  ListClustersRequest
     * @return ListClustersResponse
     */
    CompletableFuture<ListClustersResponse> listClusters(ListClustersRequest request);

    /**
     * @param request the request parameters of ListVirtualWareHouseConfigs  ListVirtualWareHouseConfigsRequest
     * @return ListVirtualWareHouseConfigsResponse
     */
    CompletableFuture<ListVirtualWareHouseConfigsResponse> listVirtualWareHouseConfigs(ListVirtualWareHouseConfigsRequest request);

    /**
     * @param request the request parameters of ListVirtualWareHouses  ListVirtualWareHousesRequest
     * @return ListVirtualWareHousesResponse
     */
    CompletableFuture<ListVirtualWareHousesResponse> listVirtualWareHouses(ListVirtualWareHousesRequest request);

    /**
     * @param request the request parameters of ModifyAccountDescription  ModifyAccountDescriptionRequest
     * @return ModifyAccountDescriptionResponse
     */
    CompletableFuture<ModifyAccountDescriptionResponse> modifyAccountDescription(ModifyAccountDescriptionRequest request);

    /**
     * @param request the request parameters of ModifyAccountPrivilege  ModifyAccountPrivilegeRequest
     * @return ModifyAccountPrivilegeResponse
     */
    CompletableFuture<ModifyAccountPrivilegeResponse> modifyAccountPrivilege(ModifyAccountPrivilegeRequest request);

    /**
     * @param request the request parameters of ModifyClusterDescription  ModifyClusterDescriptionRequest
     * @return ModifyClusterDescriptionResponse
     */
    CompletableFuture<ModifyClusterDescriptionResponse> modifyClusterDescription(ModifyClusterDescriptionRequest request);

    /**
     * @param request the request parameters of ModifyVirtualWareHouseConfig  ModifyVirtualWareHouseConfigRequest
     * @return ModifyVirtualWareHouseConfigResponse
     */
    CompletableFuture<ModifyVirtualWareHouseConfigResponse> modifyVirtualWareHouseConfig(ModifyVirtualWareHouseConfigRequest request);

    /**
     * @param request the request parameters of ModifyVirtualWareHouseDescription  ModifyVirtualWareHouseDescriptionRequest
     * @return ModifyVirtualWareHouseDescriptionResponse
     */
    CompletableFuture<ModifyVirtualWareHouseDescriptionResponse> modifyVirtualWareHouseDescription(ModifyVirtualWareHouseDescriptionRequest request);

    /**
     * @param request the request parameters of ModifyVirtualWareHouseResource  ModifyVirtualWareHouseResourceRequest
     * @return ModifyVirtualWareHouseResourceResponse
     */
    CompletableFuture<ModifyVirtualWareHouseResourceResponse> modifyVirtualWareHouseResource(ModifyVirtualWareHouseResourceRequest request);

    /**
     * @param request the request parameters of PatchClusterSecurityIPGroup  PatchClusterSecurityIPGroupRequest
     * @return PatchClusterSecurityIPGroupResponse
     */
    CompletableFuture<PatchClusterSecurityIPGroupResponse> patchClusterSecurityIPGroup(PatchClusterSecurityIPGroupRequest request);

    /**
     * @param request the request parameters of ReleaseVirtualWareHousePublicConnection  ReleaseVirtualWareHousePublicConnectionRequest
     * @return ReleaseVirtualWareHousePublicConnectionResponse
     */
    CompletableFuture<ReleaseVirtualWareHousePublicConnectionResponse> releaseVirtualWareHousePublicConnection(ReleaseVirtualWareHousePublicConnectionRequest request);

    /**
     * @param request the request parameters of ResetAccountPassword  ResetAccountPasswordRequest
     * @return ResetAccountPasswordResponse
     */
    CompletableFuture<ResetAccountPasswordResponse> resetAccountPassword(ResetAccountPasswordRequest request);

    /**
     * @param request the request parameters of RestartVirtualWareHouse  RestartVirtualWareHouseRequest
     * @return RestartVirtualWareHouseResponse
     */
    CompletableFuture<RestartVirtualWareHouseResponse> restartVirtualWareHouse(RestartVirtualWareHouseRequest request);

    /**
     * @param request the request parameters of UpgradeCluster  UpgradeClusterRequest
     * @return UpgradeClusterResponse
     */
    CompletableFuture<UpgradeClusterResponse> upgradeCluster(UpgradeClusterRequest request);

    /**
     * @param request the request parameters of UpsertClusterSecurityIPGroup  UpsertClusterSecurityIPGroupRequest
     * @return UpsertClusterSecurityIPGroupResponse
     */
    CompletableFuture<UpsertClusterSecurityIPGroupResponse> upsertClusterSecurityIPGroup(UpsertClusterSecurityIPGroupRequest request);

}
