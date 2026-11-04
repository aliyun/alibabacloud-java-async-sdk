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
     * <b>description</b> :
     * <p>Currently, only one VSC can be associated with multiple mount points. Specifically, the values of AttachInfos.InstanceId or AttachInfos.VscId must be equal.</p>
     * 
     * @param request the request parameters of AttachVscToMountPoints  AttachVscToMountPointsRequest
     * @return AttachVscToMountPointsResponse
     */
    CompletableFuture<AttachVscToMountPointsResponse> attachVscToMountPoints(AttachVscToMountPointsRequest request);

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
     * <b>description</b> :
     * <p>Before you create a file system, learn about the <a href="https://help.aliyun.com/document_detail/419020.html">billing methods</a> and <a href="https://www.aliyun.com/price/product?spm=a2c4g.11186623.0.0.476a13d7VQohVH#/alidfs/detail/alidfs">pricing of Apsara File Storage for HDFS</a>.</p>
     * 
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
     * <b>description</b> :
     * <ul>
     * <li>The user and group mapping feature is currently in invitational preview. To use this feature, <a href="https://smartservice.console.aliyun.com/service/create-ticket?spm=a2c4g.11186623.0.0.24241ee9gQPwnE">submit a ticket</a>.</li>
     * <li>File system permission management in Apsara File Storage for HDFS relies on the users and groups of files. You must manage user and group mappings by calling API operations. For more information about the directory and file access permissions of Apsara File Storage for HDFS file systems, see <a href="https://help.aliyun.com/document_detail/430865.html">Directory and file access permissions</a>.</li>
     * <li>The number of users and groups in a single file system is subject to the following limits:<ul>
     * <li>A single file system can have a maximum of 1,000 users.</li>
     * <li>A single file system can have a maximum of 30 groups.</li>
     * <li>Each user can belong to a maximum of 10 groups.</li>
     * </ul>
     * </li>
     * </ul>
     * 
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
     * <b>description</b> :
     * <p>The default VPC permission group (DefaultAccessGroupName) cannot be deleted.</p>
     * 
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
     * <b>description</b> :
     * <ul>
     * <li>You can delete a file system instance only when the number of mount targets for the file system is 0.</li>
     * <li>Once a file system instance is deleted, its data cannot be recovered. Proceed with caution.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteFileSystem  DeleteFileSystemRequest
     * @return DeleteFileSystemResponse
     */
    CompletableFuture<DeleteFileSystemResponse> deleteFileSystem(DeleteFileSystemRequest request);

    /**
     * <b>description</b> :
     * <h3>API Guide</h3>
     * <p>After a mount target is deleted, it cannot be recovered. Proceed with caution.</p>
     * 
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
     * <b>description</b> :
     * <ul>
     * <li>The user and group mapping feature is currently in invitational preview. To use this feature, <a href="https://smartservice.console.aliyun.com/service/create-ticket?spm=a2c4g.11186623.0.0.24241ee9gQPwnE">submit a ticket</a>.</li>
     * <li>Permission management for Apsara File Storage for HDFS file systems relies on file users and groups. You must manage user and group mappings by using OpenAPI. For more information about directory and file access permissions in Apsara File Storage for HDFS, see <a href="https://help.aliyun.com/document_detail/430865.html">Directory and file access permissions</a>.</li>
     * <li>You cannot delete users and groups from a file system. You can only delete the mappings between users and groups. Once a user or group is added to a file system in any way, it cannot be deleted.</li>
     * </ul>
     * 
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
     * <b>description</b> :
     * <p>Supports only one-to-many mappings from a storage resource (MountPointId) to multiple compute resources (InstanceId and VscId), and one-to-many mappings from a compute resource (InstanceId and VscId) to multiple storage resources (MountPointId).</p>
     * 
     * @param request the request parameters of DescribeMountPointsVscAttachInfo  DescribeMountPointsVscAttachInfoRequest
     * @return DescribeMountPointsVscAttachInfoResponse
     */
    CompletableFuture<DescribeMountPointsVscAttachInfoResponse> describeMountPointsVscAttachInfo(DescribeMountPointsVscAttachInfoRequest request);

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
     * @param request the request parameters of DetachVscFromMountPoints  DetachVscFromMountPointsRequest
     * @return DetachVscFromMountPointsResponse
     */
    CompletableFuture<DetachVscFromMountPointsResponse> detachVscFromMountPoints(DetachVscFromMountPointsRequest request);

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
     * <b>description</b> :
     * <p>The permission management of Apsara File Storage for HDFS file systems relies on file users and groups. You must manage user and group mappings by calling API operations. For more information about directory and file access permissions in Apsara File Storage for HDFS, see <a href="https://help.aliyun.com/document_detail/430865.html">Directory and file access permissions</a>.
     * The number of users and groups in a single file system is subject to the following limits:</p>
     * <ul>
     * <li>A single file system supports up to 1,000 users.</li>
     * <li>A single file system supports up to 30 groups.</li>
     * <li>Each user can belong to up to 10 groups.</li>
     * </ul>
     * 
     * @param request the request parameters of ListUserGroupsMappings  ListUserGroupsMappingsRequest
     * @return ListUserGroupsMappingsResponse
     */
    CompletableFuture<ListUserGroupsMappingsResponse> listUserGroupsMappings(ListUserGroupsMappingsRequest request);

    /**
     * <b>description</b> :
     * <p>The default VPC permission group (DefaultAccessGroupName) cannot be modified.</p>
     * 
     * @param request the request parameters of ModifyAccessGroup  ModifyAccessGroupRequest
     * @return ModifyAccessGroupResponse
     */
    CompletableFuture<ModifyAccessGroupResponse> modifyAccessGroup(ModifyAccessGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Rules in the default VPC permission group (DefaultAccessGroupName) cannot be modified.</p>
     * 
     * @param request the request parameters of ModifyAccessRule  ModifyAccessRuleRequest
     * @return ModifyAccessRuleResponse
     */
    CompletableFuture<ModifyAccessRuleResponse> modifyAccessRule(ModifyAccessRuleRequest request);

    /**
     * <b>description</b> :
     * <p>Before modifying a file system, review the <a href="https://help.aliyun.com/document_detail/419020.html">billing methods</a> and <a href="https://www.aliyun.com/price/product?spm=openapi-amp.newDocPublishment.0.0.3fbc281fRrtedx#/alidfs/detail/alidfs">pricing of Apsara File Storage for HDFS</a>.</p>
     * 
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
