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

    /**
     * @param request the request parameters of AddGroupMember  AddGroupMemberRequest
     * @return AddGroupMemberResponse
     */
    CompletableFuture<AddGroupMemberResponse> addGroupMember(AddGroupMemberRequest request);

    /**
     * @param request the request parameters of AddStoryFiles  AddStoryFilesRequest
     * @return AddStoryFilesResponse
     */
    CompletableFuture<AddStoryFilesResponse> addStoryFiles(AddStoryFilesRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to assign a group administrator role to a user.</p>
     * 
     * @param request the request parameters of AssignRole  AssignRoleRequest
     * @return AssignRoleResponse
     */
    CompletableFuture<AssignRoleResponse> assignRole(AssignRoleRequest request);

    /**
     * @param request the request parameters of AuditLogExport  AuditLogExportRequest
     * @return AuditLogExportResponse
     */
    CompletableFuture<AuditLogExportResponse> auditLogExport(AuditLogExportRequest request);

    /**
     * <b>description</b> :
     * <p>For more information, see &quot;OAuth 2.0 For Web Server Applications&quot; at <a href="https://www.alibabacloud.com/help/en/pds/drive-and-photo-service-dev/user-guide/oauth-2-0-access-process-for-web-server-applications">OAuth 2.0 For Web Server Applications</a> in User Guide.</p>
     * 
     * @param request the request parameters of Authorize  AuthorizeRequest
     * @return AuthorizeResponse
     */
    CompletableFuture<AuthorizeResponse> authorize(AuthorizeRequest request);

<ReturnT> CompletableFuture<ReturnT> authorizeWithAsyncResponseHandler(AuthorizeRequest request, AsyncResponseHandler<AuthorizeResponse, ReturnT> responseHandler);

    /**
     * @param request the request parameters of Batch  BatchRequest
     * @return BatchResponse
     */
    CompletableFuture<BatchResponse> batch(BatchRequest request);

    /**
     * <b>description</b> :
     * <p>You can cancel only the group administrator role.</p>
     * 
     * @param request the request parameters of CancelAssignRole  CancelAssignRoleRequest
     * @return CancelAssignRoleResponse
     */
    CompletableFuture<CancelAssignRoleResponse> cancelAssignRole(CancelAssignRoleRequest request);

    /**
     * @param request the request parameters of CancelShareLink  CancelShareLinkRequest
     * @return CancelShareLinkResponse
     */
    CompletableFuture<CancelShareLinkResponse> cancelShareLink(CancelShareLinkRequest request);

    /**
     * @param request the request parameters of ClearRecyclebin  ClearRecyclebinRequest
     * @return ClearRecyclebinResponse
     */
    CompletableFuture<ClearRecyclebinResponse> clearRecyclebin(ClearRecyclebinRequest request);

    /**
     * @param request the request parameters of CompleteFile  CompleteFileRequest
     * @return CompleteFileResponse
     */
    CompletableFuture<CompleteFileResponse> completeFile(CompleteFileRequest request);

    /**
     * @param request the request parameters of CopyFile  CopyFileRequest
     * @return CopyFileResponse
     */
    CompletableFuture<CopyFileResponse> copyFile(CopyFileRequest request);

    /**
     * @param request the request parameters of CreateCustomizedStory  CreateCustomizedStoryRequest
     * @return CreateCustomizedStoryResponse
     */
    CompletableFuture<CreateCustomizedStoryResponse> createCustomizedStory(CreateCustomizedStoryRequest request);

    /**
     * <b>description</b> :
     * <p>The description of the domain.</p>
     * 
     * @param request the request parameters of CreateDomain  CreateDomainRequest
     * @return CreateDomainResponse
     */
    CompletableFuture<CreateDomainResponse> createDomain(CreateDomainRequest request);

    /**
     * @param request the request parameters of CreateDrive  CreateDriveRequest
     * @return CreateDriveResponse
     */
    CompletableFuture<CreateDriveResponse> createDrive(CreateDriveRequest request);

    /**
     * @param request the request parameters of CreateFile  CreateFileRequest
     * @return CreateFileResponse
     */
    CompletableFuture<CreateFileResponse> createFile(CreateFileRequest request);

    /**
     * @param request the request parameters of CreateGroup  CreateGroupRequest
     * @return CreateGroupResponse
     */
    CompletableFuture<CreateGroupResponse> createGroup(CreateGroupRequest request);

    /**
     * <b>description</b> :
     * <p>If you need to manage a large number of users based on Drive and Photo Service, you can control the features and quotas that users can use based on the benefits to which they are entitled. For more information, join the DingTalk group (ID 23146118).</p>
     * 
     * @param request the request parameters of CreateIdentityToBenefitPkgMapping  CreateIdentityToBenefitPkgMappingRequest
     * @return CreateIdentityToBenefitPkgMappingResponse
     */
    CompletableFuture<CreateIdentityToBenefitPkgMappingResponse> createIdentityToBenefitPkgMapping(CreateIdentityToBenefitPkgMappingRequest request);

    /**
     * @param request the request parameters of CreateOrder  CreateOrderRequest
     * @return CreateOrderResponse
     */
    CompletableFuture<CreateOrderResponse> createOrder(CreateOrderRequest request);

    /**
     * <b>description</b> :
     * <p>A share is a file view container. You can grant anonymous users the permissions to access files in the user drive by using the share URL. Anonymous users can access the files based on the granted permissions.</p>
     * 
     * @param request the request parameters of CreateShareLink  CreateShareLinkRequest
     * @return CreateShareLinkResponse
     */
    CompletableFuture<CreateShareLinkResponse> createShareLink(CreateShareLinkRequest request);

    /**
     * @param request the request parameters of CreateSimilarImageClusterTask  CreateSimilarImageClusterTaskRequest
     * @return CreateSimilarImageClusterTaskResponse
     */
    CompletableFuture<CreateSimilarImageClusterTaskResponse> createSimilarImageClusterTask(CreateSimilarImageClusterTaskRequest request);

    /**
     * @param request the request parameters of CreateStory  CreateStoryRequest
     * @return CreateStoryResponse
     */
    CompletableFuture<CreateStoryResponse> createStory(CreateStoryRequest request);

    /**
     * @param request the request parameters of CreateUser  CreateUserRequest
     * @return CreateUserResponse
     */
    CompletableFuture<CreateUserResponse> createUser(CreateUserRequest request);

    /**
     * @param request the request parameters of CsiGetFileInfo  CsiGetFileInfoRequest
     * @return CsiGetFileInfoResponse
     */
    CompletableFuture<CsiGetFileInfoResponse> csiGetFileInfo(CsiGetFileInfoRequest request);

    /**
     * @param request the request parameters of DeleteDomain  DeleteDomainRequest
     * @return DeleteDomainResponse
     */
    CompletableFuture<DeleteDomainResponse> deleteDomain(DeleteDomainRequest request);

    /**
     * @param request the request parameters of DeleteDrive  DeleteDriveRequest
     * @return DeleteDriveResponse
     */
    CompletableFuture<DeleteDriveResponse> deleteDrive(DeleteDriveRequest request);

    /**
     * @param request the request parameters of DeleteFile  DeleteFileRequest
     * @return DeleteFileResponse
     */
    CompletableFuture<DeleteFileResponse> deleteFile(DeleteFileRequest request);

    /**
     * @param request the request parameters of DeleteGroup  DeleteGroupRequest
     * @return DeleteGroupResponse
     */
    CompletableFuture<DeleteGroupResponse> deleteGroup(DeleteGroupRequest request);

    /**
     * @param request the request parameters of DeleteRevision  DeleteRevisionRequest
     * @return DeleteRevisionResponse
     */
    CompletableFuture<DeleteRevisionResponse> deleteRevision(DeleteRevisionRequest request);

    /**
     * @param request the request parameters of DeleteStory  DeleteStoryRequest
     * @return DeleteStoryResponse
     */
    CompletableFuture<DeleteStoryResponse> deleteStory(DeleteStoryRequest request);

    /**
     * @param request the request parameters of DeleteUser  DeleteUserRequest
     * @return DeleteUserResponse
     */
    CompletableFuture<DeleteUserResponse> deleteUser(DeleteUserRequest request);

    /**
     * @param request the request parameters of DeltaGetLastCursor  DeltaGetLastCursorRequest
     * @return DeltaGetLastCursorResponse
     */
    CompletableFuture<DeltaGetLastCursorResponse> deltaGetLastCursor(DeltaGetLastCursorRequest request);

    /**
     * <b>description</b> :
     * <p>For information about best practices for downloading a file.</p>
     * 
     * @param request the request parameters of DownloadFile  DownloadFileRequest
     * @return DownloadFileResponse
     */
    CompletableFuture<DownloadFileResponse> downloadFile(DownloadFileRequest request);

<ReturnT> CompletableFuture<ReturnT> downloadFileWithAsyncResponseHandler(DownloadFileRequest request, AsyncResponseHandler<DownloadFileResponse, ReturnT> responseHandler);

    /**
     * @param request the request parameters of FileAddPermission  FileAddPermissionRequest
     * @return FileAddPermissionResponse
     */
    CompletableFuture<FileAddPermissionResponse> fileAddPermission(FileAddPermissionRequest request);

    /**
     * @param request the request parameters of FileDeleteUserTags  FileDeleteUserTagsRequest
     * @return FileDeleteUserTagsResponse
     */
    CompletableFuture<FileDeleteUserTagsResponse> fileDeleteUserTags(FileDeleteUserTagsRequest request);

    /**
     * @param request the request parameters of FileListPermission  FileListPermissionRequest
     * @return FileListPermissionResponse
     */
    CompletableFuture<FileListPermissionResponse> fileListPermission(FileListPermissionRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is an incremental update operation. Take note of the following items:</p>
     * <ul>
     * <li>If a tag name specified in the request is the same as an existing tag name, the existing tag is overwritten.</li>
     * <li>If a tag name specified in the request is different from the existing tag names, the specified tag is added.</li>
     * <li>The existing tags with unique names are not affected.</li>
     * </ul>
     * 
     * @param request the request parameters of FilePutUserTags  FilePutUserTagsRequest
     * @return FilePutUserTagsResponse
     */
    CompletableFuture<FilePutUserTagsResponse> filePutUserTags(FilePutUserTagsRequest request);

    /**
     * @param request the request parameters of FileRemovePermission  FileRemovePermissionRequest
     * @return FileRemovePermissionResponse
     */
    CompletableFuture<FileRemovePermissionResponse> fileRemovePermission(FileRemovePermissionRequest request);

    /**
     * @param request the request parameters of GetAsyncTask  GetAsyncTaskRequest
     * @return GetAsyncTaskResponse
     */
    CompletableFuture<GetAsyncTaskResponse> getAsyncTask(GetAsyncTaskRequest request);

    /**
     * @param request the request parameters of GetDefaultDrive  GetDefaultDriveRequest
     * @return GetDefaultDriveResponse
     */
    CompletableFuture<GetDefaultDriveResponse> getDefaultDrive(GetDefaultDriveRequest request);

    /**
     * @param request the request parameters of GetDomain  GetDomainRequest
     * @return GetDomainResponse
     */
    CompletableFuture<GetDomainResponse> getDomain(GetDomainRequest request);

    /**
     * @param request the request parameters of GetDomainQuota  GetDomainQuotaRequest
     * @return GetDomainQuotaResponse
     */
    CompletableFuture<GetDomainQuotaResponse> getDomainQuota(GetDomainQuotaRequest request);

    /**
     * @param request the request parameters of GetDownloadUrl  GetDownloadUrlRequest
     * @return GetDownloadUrlResponse
     */
    CompletableFuture<GetDownloadUrlResponse> getDownloadUrl(GetDownloadUrlRequest request);

    /**
     * @param request the request parameters of GetDrive  GetDriveRequest
     * @return GetDriveResponse
     */
    CompletableFuture<GetDriveResponse> getDrive(GetDriveRequest request);

    /**
     * @param request the request parameters of GetFile  GetFileRequest
     * @return GetFileResponse
     */
    CompletableFuture<GetFileResponse> getFile(GetFileRequest request);

    /**
     * @param request the request parameters of GetGroup  GetGroupRequest
     * @return GetGroupResponse
     */
    CompletableFuture<GetGroupResponse> getGroup(GetGroupRequest request);

    /**
     * @param request the request parameters of GetIdentityToBenefitPkgMapping  GetIdentityToBenefitPkgMappingRequest
     * @return GetIdentityToBenefitPkgMappingResponse
     */
    CompletableFuture<GetIdentityToBenefitPkgMappingResponse> getIdentityToBenefitPkgMapping(GetIdentityToBenefitPkgMappingRequest request);

    /**
     * @param request the request parameters of GetLinkInfo  GetLinkInfoRequest
     * @return GetLinkInfoResponse
     */
    CompletableFuture<GetLinkInfoResponse> getLinkInfo(GetLinkInfoRequest request);

    /**
     * @param request the request parameters of GetLinkInfoByUserId  GetLinkInfoByUserIdRequest
     * @return GetLinkInfoByUserIdResponse
     */
    CompletableFuture<GetLinkInfoByUserIdResponse> getLinkInfoByUserId(GetLinkInfoByUserIdRequest request);

    /**
     * @param request the request parameters of GetRevision  GetRevisionRequest
     * @return GetRevisionResponse
     */
    CompletableFuture<GetRevisionResponse> getRevision(GetRevisionRequest request);

    /**
     * @param request the request parameters of GetShareLink  GetShareLinkRequest
     * @return GetShareLinkResponse
     */
    CompletableFuture<GetShareLinkResponse> getShareLink(GetShareLinkRequest request);

    /**
     * @param request the request parameters of GetShareLinkByAnonymous  GetShareLinkByAnonymousRequest
     * @return GetShareLinkByAnonymousResponse
     */
    CompletableFuture<GetShareLinkByAnonymousResponse> getShareLinkByAnonymous(GetShareLinkByAnonymousRequest request);

    /**
     * <b>description</b> :
     * <p>To access a file by using a share link, you must first obtain a share token, even if the value of share_pwd of this share is an empty string, which specifies that the share is not private.</p>
     * 
     * @param request the request parameters of GetShareLinkToken  GetShareLinkTokenRequest
     * @return GetShareLinkTokenResponse
     */
    CompletableFuture<GetShareLinkTokenResponse> getShareLinkToken(GetShareLinkTokenRequest request);

    /**
     * @param request the request parameters of GetStory  GetStoryRequest
     * @return GetStoryResponse
     */
    CompletableFuture<GetStoryResponse> getStory(GetStoryRequest request);

    /**
     * <b>description</b> :
     * <p><em>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/425220.html">billing</a> of Drive and Photo Service</em>*.
     * To call this operation, make sure that the value-added image processing feature is enabled.
     * Before you call this operation, a value-added asynchronous task must be created. For example, you can call the CreateSimilarImageClusterTask operation to create an asynchronous task. Then, you can call this operation to query the execution status of the asynchronous task based on the task ID.</p>
     * 
     * @param request the request parameters of GetTaskStatus  GetTaskStatusRequest
     * @return GetTaskStatusResponse
     */
    CompletableFuture<GetTaskStatusResponse> getTaskStatus(GetTaskStatusRequest request);

    /**
     * @param request the request parameters of GetUploadUrl  GetUploadUrlRequest
     * @return GetUploadUrlResponse
     */
    CompletableFuture<GetUploadUrlResponse> getUploadUrl(GetUploadUrlRequest request);

    /**
     * @param request the request parameters of GetUser  GetUserRequest
     * @return GetUserResponse
     */
    CompletableFuture<GetUserResponse> getUser(GetUserRequest request);

    /**
     * <b>description</b> :
     * <p>For more information about best practices, see <a href="https://help.aliyun.com/document_detail/427477.html">Preview videos online</a>.</p>
     * 
     * @param request the request parameters of GetVideoPreviewPlayInfo  GetVideoPreviewPlayInfoRequest
     * @return GetVideoPreviewPlayInfoResponse
     */
    CompletableFuture<GetVideoPreviewPlayInfoResponse> getVideoPreviewPlayInfo(GetVideoPreviewPlayInfoRequest request);

    /**
     * <b>description</b> :
     * <p>For more information about best practices, see <a href="https://help.aliyun.com/document_detail/427477.html">Preview videos online</a>.</p>
     * 
     * @param request the request parameters of GetVideoPreviewPlayMeta  GetVideoPreviewPlayMetaRequest
     * @return GetVideoPreviewPlayMetaResponse
     */
    CompletableFuture<GetVideoPreviewPlayMetaResponse> getVideoPreviewPlayMeta(GetVideoPreviewPlayMetaRequest request);

    /**
     * @param request the request parameters of GroupUpdateName  GroupUpdateNameRequest
     * @return GroupUpdateNameResponse
     */
    CompletableFuture<GroupUpdateNameResponse> groupUpdateName(GroupUpdateNameRequest request);

    /**
     * @param request the request parameters of ImportUser  ImportUserRequest
     * @return ImportUserResponse
     */
    CompletableFuture<ImportUserResponse> importUser(ImportUserRequest request);

    /**
     * @param request the request parameters of InvestigateFile  InvestigateFileRequest
     * @return InvestigateFileResponse
     */
    CompletableFuture<InvestigateFileResponse> investigateFile(InvestigateFileRequest request);

    /**
     * @param request the request parameters of LinkAccount  LinkAccountRequest
     * @return LinkAccountResponse
     */
    CompletableFuture<LinkAccountResponse> linkAccount(LinkAccountRequest request);

    /**
     * @param request the request parameters of ListAddressGroups  ListAddressGroupsRequest
     * @return ListAddressGroupsResponse
     */
    CompletableFuture<ListAddressGroupsResponse> listAddressGroups(ListAddressGroupsRequest request);

    /**
     * @param request the request parameters of ListAssignment  ListAssignmentRequest
     * @return ListAssignmentResponse
     */
    CompletableFuture<ListAssignmentResponse> listAssignment(ListAssignmentRequest request);

    /**
     * @param request the request parameters of ListDelta  ListDeltaRequest
     * @return ListDeltaResponse
     */
    CompletableFuture<ListDeltaResponse> listDelta(ListDeltaRequest request);

    /**
     * @param request the request parameters of ListDomains  ListDomainsRequest
     * @return ListDomainsResponse
     */
    CompletableFuture<ListDomainsResponse> listDomains(ListDomainsRequest request);

    /**
     * @param request the request parameters of ListDrive  ListDriveRequest
     * @return ListDriveResponse
     */
    CompletableFuture<ListDriveResponse> listDrive(ListDriveRequest request);

    /**
     * @param request the request parameters of ListFacegroups  ListFacegroupsRequest
     * @return ListFacegroupsResponse
     */
    CompletableFuture<ListFacegroupsResponse> listFacegroups(ListFacegroupsRequest request);

    /**
     * @param request the request parameters of ListFile  ListFileRequest
     * @return ListFileResponse
     */
    CompletableFuture<ListFileResponse> listFile(ListFileRequest request);

    /**
     * @param request the request parameters of ListGroup  ListGroupRequest
     * @return ListGroupResponse
     */
    CompletableFuture<ListGroupResponse> listGroup(ListGroupRequest request);

    /**
     * @param request the request parameters of ListGroupMember  ListGroupMemberRequest
     * @return ListGroupMemberResponse
     */
    CompletableFuture<ListGroupMemberResponse> listGroupMember(ListGroupMemberRequest request);

    /**
     * @param request the request parameters of ListIdentityRole  ListIdentityRoleRequest
     * @return ListIdentityRoleResponse
     */
    CompletableFuture<ListIdentityRoleResponse> listIdentityRole(ListIdentityRoleRequest request);

    /**
     * @param request the request parameters of ListIdentityToBenefitPkgMapping  ListIdentityToBenefitPkgMappingRequest
     * @return ListIdentityToBenefitPkgMappingResponse
     */
    CompletableFuture<ListIdentityToBenefitPkgMappingResponse> listIdentityToBenefitPkgMapping(ListIdentityToBenefitPkgMappingRequest request);

    /**
     * @param request the request parameters of ListMyDrives  ListMyDrivesRequest
     * @return ListMyDrivesResponse
     */
    CompletableFuture<ListMyDrivesResponse> listMyDrives(ListMyDrivesRequest request);

    /**
     * @param request the request parameters of ListMyGroupDrive  ListMyGroupDriveRequest
     * @return ListMyGroupDriveResponse
     */
    CompletableFuture<ListMyGroupDriveResponse> listMyGroupDrive(ListMyGroupDriveRequest request);

    /**
     * @param request the request parameters of ListReceivedFile  ListReceivedFileRequest
     * @return ListReceivedFileResponse
     */
    CompletableFuture<ListReceivedFileResponse> listReceivedFile(ListReceivedFileRequest request);

    /**
     * @param request the request parameters of ListRecyclebin  ListRecyclebinRequest
     * @return ListRecyclebinResponse
     */
    CompletableFuture<ListRecyclebinResponse> listRecyclebin(ListRecyclebinRequest request);

    /**
     * @param request the request parameters of ListRevision  ListRevisionRequest
     * @return ListRevisionResponse
     */
    CompletableFuture<ListRevisionResponse> listRevision(ListRevisionRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is discontinued. To query shares, you can call the SearchShareLink operation.</p>
     * 
     * @param request the request parameters of ListShareLink  ListShareLinkRequest
     * @return ListShareLinkResponse
     */
    CompletableFuture<ListShareLinkResponse> listShareLink(ListShareLinkRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the tags within the specified drive at a time. The top 2,000 tags of the images are returned.</p>
     * 
     * @param request the request parameters of ListTags  ListTagsRequest
     * @return ListTagsResponse
     */
    CompletableFuture<ListTagsResponse> listTags(ListTagsRequest request);

    /**
     * @param request the request parameters of ListUploadedParts  ListUploadedPartsRequest
     * @return ListUploadedPartsResponse
     */
    CompletableFuture<ListUploadedPartsResponse> listUploadedParts(ListUploadedPartsRequest request);

    /**
     * @param request the request parameters of ListUser  ListUserRequest
     * @return ListUserResponse
     */
    CompletableFuture<ListUserResponse> listUser(ListUserRequest request);

    /**
     * @param request the request parameters of MoveFile  MoveFileRequest
     * @return MoveFileResponse
     */
    CompletableFuture<MoveFileResponse> moveFile(MoveFileRequest request);

    /**
     * @param request the request parameters of QueryOrderPrice  QueryOrderPriceRequest
     * @return QueryOrderPriceResponse
     */
    CompletableFuture<QueryOrderPriceResponse> queryOrderPrice(QueryOrderPriceRequest request);

    /**
     * @param request the request parameters of RemoveFaceGroupFile  RemoveFaceGroupFileRequest
     * @return RemoveFaceGroupFileResponse
     */
    CompletableFuture<RemoveFaceGroupFileResponse> removeFaceGroupFile(RemoveFaceGroupFileRequest request);

    /**
     * @param request the request parameters of RemoveGroupMember  RemoveGroupMemberRequest
     * @return RemoveGroupMemberResponse
     */
    CompletableFuture<RemoveGroupMemberResponse> removeGroupMember(RemoveGroupMemberRequest request);

    /**
     * @param request the request parameters of RemoveStoryFiles  RemoveStoryFilesRequest
     * @return RemoveStoryFilesResponse
     */
    CompletableFuture<RemoveStoryFilesResponse> removeStoryFiles(RemoveStoryFilesRequest request);

    /**
     * @param request the request parameters of RestoreFile  RestoreFileRequest
     * @return RestoreFileResponse
     */
    CompletableFuture<RestoreFileResponse> restoreFile(RestoreFileRequest request);

    /**
     * @param request the request parameters of RestoreRevision  RestoreRevisionRequest
     * @return RestoreRevisionResponse
     */
    CompletableFuture<RestoreRevisionResponse> restoreRevision(RestoreRevisionRequest request);

    /**
     * @param request the request parameters of ScanFile  ScanFileRequest
     * @return ScanFileResponse
     */
    CompletableFuture<ScanFileResponse> scanFile(ScanFileRequest request);

    /**
     * @param request the request parameters of SearchAddressGroups  SearchAddressGroupsRequest
     * @return SearchAddressGroupsResponse
     */
    CompletableFuture<SearchAddressGroupsResponse> searchAddressGroups(SearchAddressGroupsRequest request);

    /**
     * @param request the request parameters of SearchDomains  SearchDomainsRequest
     * @return SearchDomainsResponse
     */
    CompletableFuture<SearchDomainsResponse> searchDomains(SearchDomainsRequest request);

    /**
     * @param request the request parameters of SearchDrive  SearchDriveRequest
     * @return SearchDriveResponse
     */
    CompletableFuture<SearchDriveResponse> searchDrive(SearchDriveRequest request);

    /**
     * @param request the request parameters of SearchFile  SearchFileRequest
     * @return SearchFileResponse
     */
    CompletableFuture<SearchFileResponse> searchFile(SearchFileRequest request);

    /**
     * @param request the request parameters of SearchShareLink  SearchShareLinkRequest
     * @return SearchShareLinkResponse
     */
    CompletableFuture<SearchShareLinkResponse> searchShareLink(SearchShareLinkRequest request);

    /**
     * @param request the request parameters of SearchSimilarImageClusters  SearchSimilarImageClustersRequest
     * @return SearchSimilarImageClustersResponse
     */
    CompletableFuture<SearchSimilarImageClustersResponse> searchSimilarImageClusters(SearchSimilarImageClustersRequest request);

    /**
     * @param request the request parameters of SearchStories  SearchStoriesRequest
     * @return SearchStoriesResponse
     */
    CompletableFuture<SearchStoriesResponse> searchStories(SearchStoriesRequest request);

    /**
     * @param request the request parameters of SearchUser  SearchUserRequest
     * @return SearchUserResponse
     */
    CompletableFuture<SearchUserResponse> searchUser(SearchUserRequest request);

    /**
     * <b>description</b> :
     * <p>For more information about how to access Drive and Photo Service from a web server application by using OAuth 2.0, visit <a href="https://www.alibabacloud.com/help/zh/pds/drive-and-photo-service-dev/user-guide/oauth-2-0-access-process-for-web-server-applications">OAuth 2.0 For Web Server Applications</a>.
     * For more information about how to access Drive and Photo Service by using a JSON Web Token (JWT) application, visit <a href="https://www.alibabacloud.com/help/zh/pds/drive-and-photo-service-dev/user-guide/access-process-for-jwt-applications">Access process for JWT applications</a>.</p>
     * 
     * @param request the request parameters of Token  TokenRequest
     * @return TokenResponse
     */
    CompletableFuture<TokenResponse> token(TokenRequest request);

    /**
     * @param request the request parameters of TrashFile  TrashFileRequest
     * @return TrashFileResponse
     */
    CompletableFuture<TrashFileResponse> trashFile(TrashFileRequest request);

    /**
     * @param request the request parameters of UnLinkAccount  UnLinkAccountRequest
     * @return UnLinkAccountResponse
     */
    CompletableFuture<UnLinkAccountResponse> unLinkAccount(UnLinkAccountRequest request);

    /**
     * @param request the request parameters of UpdateDomain  UpdateDomainRequest
     * @return UpdateDomainResponse
     */
    CompletableFuture<UpdateDomainResponse> updateDomain(UpdateDomainRequest request);

    /**
     * @param request the request parameters of UpdateDrive  UpdateDriveRequest
     * @return UpdateDriveResponse
     */
    CompletableFuture<UpdateDriveResponse> updateDrive(UpdateDriveRequest request);

    /**
     * @param request the request parameters of UpdateFacegroup  UpdateFacegroupRequest
     * @return UpdateFacegroupResponse
     */
    CompletableFuture<UpdateFacegroupResponse> updateFacegroup(UpdateFacegroupRequest request);

    /**
     * @param request the request parameters of UpdateFile  UpdateFileRequest
     * @return UpdateFileResponse
     */
    CompletableFuture<UpdateFileResponse> updateFile(UpdateFileRequest request);

    /**
     * @param request the request parameters of UpdateGroup  UpdateGroupRequest
     * @return UpdateGroupResponse
     */
    CompletableFuture<UpdateGroupResponse> updateGroup(UpdateGroupRequest request);

    /**
     * @param request the request parameters of UpdateIdentityToBenefitPkgMapping  UpdateIdentityToBenefitPkgMappingRequest
     * @return UpdateIdentityToBenefitPkgMappingResponse
     */
    CompletableFuture<UpdateIdentityToBenefitPkgMappingResponse> updateIdentityToBenefitPkgMapping(UpdateIdentityToBenefitPkgMappingRequest request);

    /**
     * @param request the request parameters of UpdateRevision  UpdateRevisionRequest
     * @return UpdateRevisionResponse
     */
    CompletableFuture<UpdateRevisionResponse> updateRevision(UpdateRevisionRequest request);

    /**
     * @param request the request parameters of UpdateShareLink  UpdateShareLinkRequest
     * @return UpdateShareLinkResponse
     */
    CompletableFuture<UpdateShareLinkResponse> updateShareLink(UpdateShareLinkRequest request);

    /**
     * @param request the request parameters of UpdateStory  UpdateStoryRequest
     * @return UpdateStoryResponse
     */
    CompletableFuture<UpdateStoryResponse> updateStory(UpdateStoryRequest request);

    /**
     * @param request the request parameters of UpdateUser  UpdateUserRequest
     * @return UpdateUserResponse
     */
    CompletableFuture<UpdateUserResponse> updateUser(UpdateUserRequest request);

    /**
     * @param request the request parameters of VideoDRMLicense  VideoDRMLicenseRequest
     * @return VideoDRMLicenseResponse
     */
    CompletableFuture<VideoDRMLicenseResponse> videoDRMLicense(VideoDRMLicenseRequest request);

}
