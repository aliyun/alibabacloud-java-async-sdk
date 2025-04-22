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
     * <b>description</b> :
     * <hr>
     * 
     * @param request the request parameters of AttachVscMountPoint  AttachVscMountPointRequest
     * @return AttachVscMountPointResponse
     */
    CompletableFuture<AttachVscMountPointResponse> attachVscMountPoint(AttachVscMountPointRequest request);

    /**
     * @param request the request parameters of BindVscMountPointAlias  BindVscMountPointAliasRequest
     * @return BindVscMountPointAliasResponse
     */
    CompletableFuture<BindVscMountPointAliasResponse> bindVscMountPointAlias(BindVscMountPointAliasRequest request);

    /**
     * @param request the request parameters of CreateAccessGroup  CreateAccessGroupRequest
     * @return CreateAccessGroupResponse
     */
    CompletableFuture<CreateAccessGroupResponse> createAccessGroup(CreateAccessGroupRequest request);

    /**
     * @param request the request parameters of CreateAccessRule  CreateAccessRuleRequest
     * @return CreateAccessRuleResponse
     */
    CompletableFuture<CreateAccessRuleResponse> createAccessRule(CreateAccessRuleRequest request);

    /**
     * @param request the request parameters of CreateFileSystem  CreateFileSystemRequest
     * @return CreateFileSystemResponse
     */
    CompletableFuture<CreateFileSystemResponse> createFileSystem(CreateFileSystemRequest request);

    /**
     * @param request the request parameters of CreateMountPoint  CreateMountPointRequest
     * @return CreateMountPointResponse
     */
    CompletableFuture<CreateMountPointResponse> createMountPoint(CreateMountPointRequest request);

    /**
     * @param request the request parameters of CreateQosPolicy  CreateQosPolicyRequest
     * @return CreateQosPolicyResponse
     */
    CompletableFuture<CreateQosPolicyResponse> createQosPolicy(CreateQosPolicyRequest request);

    /**
     * @param request the request parameters of CreateUserGroupsMapping  CreateUserGroupsMappingRequest
     * @return CreateUserGroupsMappingResponse
     */
    CompletableFuture<CreateUserGroupsMappingResponse> createUserGroupsMapping(CreateUserGroupsMappingRequest request);

    /**
     * @param request the request parameters of CreateVscMountPoint  CreateVscMountPointRequest
     * @return CreateVscMountPointResponse
     */
    CompletableFuture<CreateVscMountPointResponse> createVscMountPoint(CreateVscMountPointRequest request);

    /**
     * @param request the request parameters of DeleteAccessGroup  DeleteAccessGroupRequest
     * @return DeleteAccessGroupResponse
     */
    CompletableFuture<DeleteAccessGroupResponse> deleteAccessGroup(DeleteAccessGroupRequest request);

    /**
     * @param request the request parameters of DeleteAccessRule  DeleteAccessRuleRequest
     * @return DeleteAccessRuleResponse
     */
    CompletableFuture<DeleteAccessRuleResponse> deleteAccessRule(DeleteAccessRuleRequest request);

    /**
     * @param request the request parameters of DeleteFileSystem  DeleteFileSystemRequest
     * @return DeleteFileSystemResponse
     */
    CompletableFuture<DeleteFileSystemResponse> deleteFileSystem(DeleteFileSystemRequest request);

    /**
     * @param request the request parameters of DeleteMountPoint  DeleteMountPointRequest
     * @return DeleteMountPointResponse
     */
    CompletableFuture<DeleteMountPointResponse> deleteMountPoint(DeleteMountPointRequest request);

    /**
     * @param request the request parameters of DeleteQosPolicy  DeleteQosPolicyRequest
     * @return DeleteQosPolicyResponse
     */
    CompletableFuture<DeleteQosPolicyResponse> deleteQosPolicy(DeleteQosPolicyRequest request);

    /**
     * @param request the request parameters of DeleteUserGroupsMapping  DeleteUserGroupsMappingRequest
     * @return DeleteUserGroupsMappingResponse
     */
    CompletableFuture<DeleteUserGroupsMappingResponse> deleteUserGroupsMapping(DeleteUserGroupsMappingRequest request);

    /**
     * @param request the request parameters of DeleteVscMountPoint  DeleteVscMountPointRequest
     * @return DeleteVscMountPointResponse
     */
    CompletableFuture<DeleteVscMountPointResponse> deleteVscMountPoint(DeleteVscMountPointRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * @param request the request parameters of DescribeVscMountPoints  DescribeVscMountPointsRequest
     * @return DescribeVscMountPointsResponse
     */
    CompletableFuture<DescribeVscMountPointsResponse> describeVscMountPoints(DescribeVscMountPointsRequest request);

    /**
     * @param request the request parameters of DetachVscMountPoint  DetachVscMountPointRequest
     * @return DetachVscMountPointResponse
     */
    CompletableFuture<DetachVscMountPointResponse> detachVscMountPoint(DetachVscMountPointRequest request);

    /**
     * @param request the request parameters of GetAccessGroup  GetAccessGroupRequest
     * @return GetAccessGroupResponse
     */
    CompletableFuture<GetAccessGroupResponse> getAccessGroup(GetAccessGroupRequest request);

    /**
     * @param request the request parameters of GetAccessRule  GetAccessRuleRequest
     * @return GetAccessRuleResponse
     */
    CompletableFuture<GetAccessRuleResponse> getAccessRule(GetAccessRuleRequest request);

    /**
     * @param request the request parameters of GetFileSystem  GetFileSystemRequest
     * @return GetFileSystemResponse
     */
    CompletableFuture<GetFileSystemResponse> getFileSystem(GetFileSystemRequest request);

    /**
     * @param request the request parameters of GetMountPoint  GetMountPointRequest
     * @return GetMountPointResponse
     */
    CompletableFuture<GetMountPointResponse> getMountPoint(GetMountPointRequest request);

    /**
     * @param request the request parameters of GetRegion  GetRegionRequest
     * @return GetRegionResponse
     */
    CompletableFuture<GetRegionResponse> getRegion(GetRegionRequest request);

    /**
     * @param request the request parameters of ListAccessGroups  ListAccessGroupsRequest
     * @return ListAccessGroupsResponse
     */
    CompletableFuture<ListAccessGroupsResponse> listAccessGroups(ListAccessGroupsRequest request);

    /**
     * @param request the request parameters of ListAccessRules  ListAccessRulesRequest
     * @return ListAccessRulesResponse
     */
    CompletableFuture<ListAccessRulesResponse> listAccessRules(ListAccessRulesRequest request);

    /**
     * @param request the request parameters of ListFederations  ListFederationsRequest
     * @return ListFederationsResponse
     */
    CompletableFuture<ListFederationsResponse> listFederations(ListFederationsRequest request);

    /**
     * @param request the request parameters of ListFileSystems  ListFileSystemsRequest
     * @return ListFileSystemsResponse
     */
    CompletableFuture<ListFileSystemsResponse> listFileSystems(ListFileSystemsRequest request);

    /**
     * @param request the request parameters of ListMountPoints  ListMountPointsRequest
     * @return ListMountPointsResponse
     */
    CompletableFuture<ListMountPointsResponse> listMountPoints(ListMountPointsRequest request);

    /**
     * @param request the request parameters of ListQosPolicies  ListQosPoliciesRequest
     * @return ListQosPoliciesResponse
     */
    CompletableFuture<ListQosPoliciesResponse> listQosPolicies(ListQosPoliciesRequest request);

    /**
     * @param request the request parameters of ListUserGroupsMappings  ListUserGroupsMappingsRequest
     * @return ListUserGroupsMappingsResponse
     */
    CompletableFuture<ListUserGroupsMappingsResponse> listUserGroupsMappings(ListUserGroupsMappingsRequest request);

    /**
     * @param request the request parameters of ModifyAccessGroup  ModifyAccessGroupRequest
     * @return ModifyAccessGroupResponse
     */
    CompletableFuture<ModifyAccessGroupResponse> modifyAccessGroup(ModifyAccessGroupRequest request);

    /**
     * @param request the request parameters of ModifyAccessRule  ModifyAccessRuleRequest
     * @return ModifyAccessRuleResponse
     */
    CompletableFuture<ModifyAccessRuleResponse> modifyAccessRule(ModifyAccessRuleRequest request);

    /**
     * @param request the request parameters of ModifyFileSystem  ModifyFileSystemRequest
     * @return ModifyFileSystemResponse
     */
    CompletableFuture<ModifyFileSystemResponse> modifyFileSystem(ModifyFileSystemRequest request);

    /**
     * @param request the request parameters of ModifyMountPoint  ModifyMountPointRequest
     * @return ModifyMountPointResponse
     */
    CompletableFuture<ModifyMountPointResponse> modifyMountPoint(ModifyMountPointRequest request);

    /**
     * @param request the request parameters of ModifyQosPolicy  ModifyQosPolicyRequest
     * @return ModifyQosPolicyResponse
     */
    CompletableFuture<ModifyQosPolicyResponse> modifyQosPolicy(ModifyQosPolicyRequest request);

}
