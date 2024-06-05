// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.pds20220301.models.*;
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

    CompletableFuture<AddGroupMemberResponse> addGroupMember(AddGroupMemberRequest request);

    CompletableFuture<AddStoryFilesResponse> addStoryFiles(AddStoryFilesRequest request);

    /**
      * You can call this operation to assign a group administrator role to a user.
      *
     * @tags api
     */
    CompletableFuture<AssignRoleResponse> assignRole(AssignRoleRequest request);

    /**
      * For more information, see "OAuth 2.0 For Web Server Applications" at [OAuth 2.0 For Web Server Applications](https://www.alibabacloud.com/help/en/pds/drive-and-photo-service-dev/user-guide/oauth-2-0-access-process-for-web-server-applications) in User Guide.
      *
     * @tags api
     */
    CompletableFuture<AuthorizeResponse> authorize(AuthorizeRequest request);

<ReturnT> CompletableFuture<ReturnT> authorizeWithAsyncResponseHandler(AuthorizeRequest request, AsyncResponseHandler<AuthorizeResponse, ReturnT> responseHandler);

    CompletableFuture<BatchResponse> batch(BatchRequest request);

    /**
      * You can cancel only the group administrator role.
      *
     * @tags api
     */
    CompletableFuture<CancelAssignRoleResponse> cancelAssignRole(CancelAssignRoleRequest request);

    CompletableFuture<CancelShareLinkResponse> cancelShareLink(CancelShareLinkRequest request);

    CompletableFuture<ClearRecyclebinResponse> clearRecyclebin(ClearRecyclebinRequest request);

    CompletableFuture<CompleteFileResponse> completeFile(CompleteFileRequest request);

    CompletableFuture<CopyFileResponse> copyFile(CopyFileRequest request);

    CompletableFuture<CreateCustomizedStoryResponse> createCustomizedStory(CreateCustomizedStoryRequest request);

    /**
      * If you want to perform secondary operations based on Drive and Photo Service and perform fine-grained control on your tenants, you can use the parent-child domain feature of Drive and Photo Service. For more information, join the DingTalk group whose ID is 23146118.
      *
     * @tags admin
     */
    CompletableFuture<CreateDomainResponse> createDomain(CreateDomainRequest request);

    CompletableFuture<CreateDriveResponse> createDrive(CreateDriveRequest request);

    CompletableFuture<CreateFileResponse> createFile(CreateFileRequest request);

    CompletableFuture<CreateGroupResponse> createGroup(CreateGroupRequest request);

    /**
      * If you need to manage a large number of users based on Drive and Photo Service, you can control the features and quotas that users can use based on the benefits to which they are entitled. For more information, join the DingTalk group (ID 23146118).
      *
     * @tags api
     */
    CompletableFuture<CreateIdentityToBenefitPkgMappingResponse> createIdentityToBenefitPkgMapping(CreateIdentityToBenefitPkgMappingRequest request);

    CompletableFuture<CreateOrderResponse> createOrder(CreateOrderRequest request);

    /**
      * A share is a file view container. You can grant anonymous users the permissions to access files in the user drive by using the share URL. Anonymous users can access the files based on the granted permissions.
      *
     * @tags api
     */
    CompletableFuture<CreateShareLinkResponse> createShareLink(CreateShareLinkRequest request);

    CompletableFuture<CreateSimilarImageClusterTaskResponse> createSimilarImageClusterTask(CreateSimilarImageClusterTaskRequest request);

    CompletableFuture<CreateStoryResponse> createStory(CreateStoryRequest request);

    CompletableFuture<CreateUserResponse> createUser(CreateUserRequest request);

    CompletableFuture<CsiGetFileInfoResponse> csiGetFileInfo(CsiGetFileInfoRequest request);

    CompletableFuture<DeleteDomainResponse> deleteDomain(DeleteDomainRequest request);

    CompletableFuture<DeleteDriveResponse> deleteDrive(DeleteDriveRequest request);

    CompletableFuture<DeleteFileResponse> deleteFile(DeleteFileRequest request);

    CompletableFuture<DeleteGroupResponse> deleteGroup(DeleteGroupRequest request);

    CompletableFuture<DeleteRevisionResponse> deleteRevision(DeleteRevisionRequest request);

    CompletableFuture<DeleteStoryResponse> deleteStory(DeleteStoryRequest request);

    CompletableFuture<DeleteUserResponse> deleteUser(DeleteUserRequest request);

    CompletableFuture<DeltaGetLastCursorResponse> deltaGetLastCursor(DeltaGetLastCursorRequest request);

    /**
      * For information about best practices for downloading a file.
      *
     * @tags api
     */
    CompletableFuture<DownloadFileResponse> downloadFile(DownloadFileRequest request);

<ReturnT> CompletableFuture<ReturnT> downloadFileWithAsyncResponseHandler(DownloadFileRequest request, AsyncResponseHandler<DownloadFileResponse, ReturnT> responseHandler);

    CompletableFuture<FileAddPermissionResponse> fileAddPermission(FileAddPermissionRequest request);

    CompletableFuture<FileDeleteUserTagsResponse> fileDeleteUserTags(FileDeleteUserTagsRequest request);

    CompletableFuture<FileListPermissionResponse> fileListPermission(FileListPermissionRequest request);

    /**
      * This operation is an incremental update operation. Take note of the following items:
      * *   If a tag name specified in the request is the same as an existing tag name, the existing tag is overwritten.
      * *   If a tag name specified in the request is different from the existing tag names, the specified tag is added.
      * *   The existing tags with unique names are not affected.
      *
     * @tags api
     */
    CompletableFuture<FilePutUserTagsResponse> filePutUserTags(FilePutUserTagsRequest request);

    CompletableFuture<FileRemovePermissionResponse> fileRemovePermission(FileRemovePermissionRequest request);

    CompletableFuture<GetAsyncTaskResponse> getAsyncTask(GetAsyncTaskRequest request);

    CompletableFuture<GetDefaultDriveResponse> getDefaultDrive(GetDefaultDriveRequest request);

    CompletableFuture<GetDomainResponse> getDomain(GetDomainRequest request);

    CompletableFuture<GetDomainQuotaResponse> getDomainQuota(GetDomainQuotaRequest request);

    CompletableFuture<GetDownloadUrlResponse> getDownloadUrl(GetDownloadUrlRequest request);

    CompletableFuture<GetDriveResponse> getDrive(GetDriveRequest request);

    CompletableFuture<GetFileResponse> getFile(GetFileRequest request);

    CompletableFuture<GetGroupResponse> getGroup(GetGroupRequest request);

    CompletableFuture<GetIdentityToBenefitPkgMappingResponse> getIdentityToBenefitPkgMapping(GetIdentityToBenefitPkgMappingRequest request);

    CompletableFuture<GetLinkInfoResponse> getLinkInfo(GetLinkInfoRequest request);

    CompletableFuture<GetLinkInfoByUserIdResponse> getLinkInfoByUserId(GetLinkInfoByUserIdRequest request);

    CompletableFuture<GetRevisionResponse> getRevision(GetRevisionRequest request);

    CompletableFuture<GetShareLinkResponse> getShareLink(GetShareLinkRequest request);

    CompletableFuture<GetShareLinkByAnonymousResponse> getShareLinkByAnonymous(GetShareLinkByAnonymousRequest request);

    /**
      * To access a file by using a share link, you must first obtain a share token, even if the value of share_pwd of this share is an empty string, which specifies that the share is not private.
      *
     * @tags api
     */
    CompletableFuture<GetShareLinkTokenResponse> getShareLinkToken(GetShareLinkTokenRequest request);

    CompletableFuture<GetStoryResponse> getStory(GetStoryRequest request);

    /**
      * **Before you call this operation, make sure that you are familiar with the [billing](~~425220~~) of Drive and Photo Service**.
      * To call this operation, make sure that the value-added image processing feature is enabled.
      * Before you call this operation, a value-added asynchronous task must be created. For example, you can call the CreateSimilarImageClusterTask operation to create an asynchronous task. Then, you can call this operation to query the execution status of the asynchronous task based on the task ID.
      *
     * @tags api
     */
    CompletableFuture<GetTaskStatusResponse> getTaskStatus(GetTaskStatusRequest request);

    CompletableFuture<GetUploadUrlResponse> getUploadUrl(GetUploadUrlRequest request);

    CompletableFuture<GetUserResponse> getUser(GetUserRequest request);

    /**
      * For more information about best practices, see [Preview videos online](~~427477~~).
      *
     * @tags api
     */
    CompletableFuture<GetVideoPreviewPlayInfoResponse> getVideoPreviewPlayInfo(GetVideoPreviewPlayInfoRequest request);

    /**
      * For more information about best practices, see [Preview videos online](~~427477~~).
      *
     * @tags api
     */
    CompletableFuture<GetVideoPreviewPlayMetaResponse> getVideoPreviewPlayMeta(GetVideoPreviewPlayMetaRequest request);

    CompletableFuture<GroupUpdateNameResponse> groupUpdateName(GroupUpdateNameRequest request);

    CompletableFuture<ImportUserResponse> importUser(ImportUserRequest request);

    CompletableFuture<InvestigateFileResponse> investigateFile(InvestigateFileRequest request);

    CompletableFuture<LinkAccountResponse> linkAccount(LinkAccountRequest request);

    CompletableFuture<ListAddressGroupsResponse> listAddressGroups(ListAddressGroupsRequest request);

    CompletableFuture<ListAssignmentResponse> listAssignment(ListAssignmentRequest request);

    CompletableFuture<ListDeltaResponse> listDelta(ListDeltaRequest request);

    CompletableFuture<ListDomainsResponse> listDomains(ListDomainsRequest request);

    CompletableFuture<ListDriveResponse> listDrive(ListDriveRequest request);

    CompletableFuture<ListFacegroupsResponse> listFacegroups(ListFacegroupsRequest request);

    CompletableFuture<ListFileResponse> listFile(ListFileRequest request);

    CompletableFuture<ListGroupResponse> listGroup(ListGroupRequest request);

    CompletableFuture<ListGroupMemberResponse> listGroupMember(ListGroupMemberRequest request);

    CompletableFuture<ListIdentityRoleResponse> listIdentityRole(ListIdentityRoleRequest request);

    CompletableFuture<ListIdentityToBenefitPkgMappingResponse> listIdentityToBenefitPkgMapping(ListIdentityToBenefitPkgMappingRequest request);

    CompletableFuture<ListMyDrivesResponse> listMyDrives(ListMyDrivesRequest request);

    CompletableFuture<ListMyGroupDriveResponse> listMyGroupDrive(ListMyGroupDriveRequest request);

    CompletableFuture<ListReceivedFileResponse> listReceivedFile(ListReceivedFileRequest request);

    CompletableFuture<ListRecyclebinResponse> listRecyclebin(ListRecyclebinRequest request);

    CompletableFuture<ListRevisionResponse> listRevision(ListRevisionRequest request);

    /**
      * This operation is discontinued. To query shares, you can call the SearchShareLink operation.
      *
     * @tags api
     */
    CompletableFuture<ListShareLinkResponse> listShareLink(ListShareLinkRequest request);

    /**
      * You can call this operation to query the tags within the specified drive at a time. The top 2,000 tags of the images are returned.
      *
     * @tags api
     */
    CompletableFuture<ListTagsResponse> listTags(ListTagsRequest request);

    CompletableFuture<ListUploadedPartsResponse> listUploadedParts(ListUploadedPartsRequest request);

    CompletableFuture<ListUserResponse> listUser(ListUserRequest request);

    CompletableFuture<MoveFileResponse> moveFile(MoveFileRequest request);

    CompletableFuture<QueryOrderPriceResponse> queryOrderPrice(QueryOrderPriceRequest request);

    CompletableFuture<RemoveFaceGroupFileResponse> removeFaceGroupFile(RemoveFaceGroupFileRequest request);

    CompletableFuture<RemoveGroupMemberResponse> removeGroupMember(RemoveGroupMemberRequest request);

    CompletableFuture<RemoveStoryFilesResponse> removeStoryFiles(RemoveStoryFilesRequest request);

    CompletableFuture<RestoreFileResponse> restoreFile(RestoreFileRequest request);

    CompletableFuture<RestoreRevisionResponse> restoreRevision(RestoreRevisionRequest request);

    CompletableFuture<ScanFileResponse> scanFile(ScanFileRequest request);

    CompletableFuture<SearchAddressGroupsResponse> searchAddressGroups(SearchAddressGroupsRequest request);

    CompletableFuture<SearchDomainsResponse> searchDomains(SearchDomainsRequest request);

    CompletableFuture<SearchDriveResponse> searchDrive(SearchDriveRequest request);

    CompletableFuture<SearchFileResponse> searchFile(SearchFileRequest request);

    CompletableFuture<SearchShareLinkResponse> searchShareLink(SearchShareLinkRequest request);

    CompletableFuture<SearchSimilarImageClustersResponse> searchSimilarImageClusters(SearchSimilarImageClustersRequest request);

    CompletableFuture<SearchStoriesResponse> searchStories(SearchStoriesRequest request);

    CompletableFuture<SearchUserResponse> searchUser(SearchUserRequest request);

    /**
      * For more information about how to access Drive and Photo Service from a web server application by using OAuth 2.0, visit [OAuth 2.0 For Web Server Applications](https://www.alibabacloud.com/help/zh/pds/drive-and-photo-service-dev/user-guide/oauth-2-0-access-process-for-web-server-applications).
      * For more information about how to access Drive and Photo Service by using a JSON Web Token (JWT) application, visit [Access process for JWT applications](https://www.alibabacloud.com/help/zh/pds/drive-and-photo-service-dev/user-guide/access-process-for-jwt-applications).
      *
     * @tags api
     */
    CompletableFuture<TokenResponse> token(TokenRequest request);

    CompletableFuture<TrashFileResponse> trashFile(TrashFileRequest request);

    CompletableFuture<UnLinkAccountResponse> unLinkAccount(UnLinkAccountRequest request);

    CompletableFuture<UpdateDomainResponse> updateDomain(UpdateDomainRequest request);

    CompletableFuture<UpdateDriveResponse> updateDrive(UpdateDriveRequest request);

    CompletableFuture<UpdateFacegroupResponse> updateFacegroup(UpdateFacegroupRequest request);

    CompletableFuture<UpdateFileResponse> updateFile(UpdateFileRequest request);

    CompletableFuture<UpdateGroupResponse> updateGroup(UpdateGroupRequest request);

    CompletableFuture<UpdateIdentityToBenefitPkgMappingResponse> updateIdentityToBenefitPkgMapping(UpdateIdentityToBenefitPkgMappingRequest request);

    CompletableFuture<UpdateRevisionResponse> updateRevision(UpdateRevisionRequest request);

    CompletableFuture<UpdateShareLinkResponse> updateShareLink(UpdateShareLinkRequest request);

    CompletableFuture<UpdateStoryResponse> updateStory(UpdateStoryRequest request);

    CompletableFuture<UpdateUserResponse> updateUser(UpdateUserRequest request);

}
