// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dfs20180620;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dfs20180620.models.*;
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
      * ****
      *
     */
    CompletableFuture<AttachVscMountPointResponse> attachVscMountPoint(AttachVscMountPointRequest request);

    CompletableFuture<BindVscMountPointAliasResponse> bindVscMountPointAlias(BindVscMountPointAliasRequest request);

    CompletableFuture<CreateAccessGroupResponse> createAccessGroup(CreateAccessGroupRequest request);

    CompletableFuture<CreateAccessRuleResponse> createAccessRule(CreateAccessRuleRequest request);

    CompletableFuture<CreateFileSystemResponse> createFileSystem(CreateFileSystemRequest request);

    CompletableFuture<CreateMountPointResponse> createMountPoint(CreateMountPointRequest request);

    CompletableFuture<CreateUserGroupsMappingResponse> createUserGroupsMapping(CreateUserGroupsMappingRequest request);

    CompletableFuture<CreateVscMountPointResponse> createVscMountPoint(CreateVscMountPointRequest request);

    CompletableFuture<DeleteAccessGroupResponse> deleteAccessGroup(DeleteAccessGroupRequest request);

    CompletableFuture<DeleteAccessRuleResponse> deleteAccessRule(DeleteAccessRuleRequest request);

    CompletableFuture<DeleteFileSystemResponse> deleteFileSystem(DeleteFileSystemRequest request);

    CompletableFuture<DeleteMountPointResponse> deleteMountPoint(DeleteMountPointRequest request);

    CompletableFuture<DeleteUserGroupsMappingResponse> deleteUserGroupsMapping(DeleteUserGroupsMappingRequest request);

    CompletableFuture<DeleteVscMountPointResponse> deleteVscMountPoint(DeleteVscMountPointRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeVscMountPointsResponse> describeVscMountPoints(DescribeVscMountPointsRequest request);

    CompletableFuture<DetachVscMountPointResponse> detachVscMountPoint(DetachVscMountPointRequest request);

    CompletableFuture<GetAccessGroupResponse> getAccessGroup(GetAccessGroupRequest request);

    CompletableFuture<GetAccessRuleResponse> getAccessRule(GetAccessRuleRequest request);

    CompletableFuture<GetFileSystemResponse> getFileSystem(GetFileSystemRequest request);

    CompletableFuture<GetMountPointResponse> getMountPoint(GetMountPointRequest request);

    CompletableFuture<GetRegionResponse> getRegion(GetRegionRequest request);

    CompletableFuture<ListAccessGroupsResponse> listAccessGroups(ListAccessGroupsRequest request);

    CompletableFuture<ListAccessRulesResponse> listAccessRules(ListAccessRulesRequest request);

    CompletableFuture<ListFileSystemsResponse> listFileSystems(ListFileSystemsRequest request);

    CompletableFuture<ListMountPointsResponse> listMountPoints(ListMountPointsRequest request);

    CompletableFuture<ListUserGroupsMappingsResponse> listUserGroupsMappings(ListUserGroupsMappingsRequest request);

    CompletableFuture<ModifyAccessGroupResponse> modifyAccessGroup(ModifyAccessGroupRequest request);

    CompletableFuture<ModifyAccessRuleResponse> modifyAccessRule(ModifyAccessRuleRequest request);

    CompletableFuture<ModifyFileSystemResponse> modifyFileSystem(ModifyFileSystemRequest request);

    CompletableFuture<ModifyMountPointResponse> modifyMountPoint(ModifyMountPointRequest request);

}
