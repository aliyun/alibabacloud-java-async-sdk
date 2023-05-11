// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.quickbi_public20220101.models.*;
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
      * Indicates whether the request is successful. Valid values:
      * *   true: The request was successful.
      * *   false: The request failed.
      *
     */
    CompletableFuture<AddDataLevelPermissionRuleUsersResponse> addDataLevelPermissionRuleUsers(AddDataLevelPermissionRuleUsersRequest request);

    /**
      * ROW_LEVEL
      *
     */
    CompletableFuture<AddDataLevelPermissionWhiteListResponse> addDataLevelPermissionWhiteList(AddDataLevelPermissionWhiteListRequest request);

    CompletableFuture<AddShareReportResponse> addShareReport(AddShareReportRequest request);

    CompletableFuture<AddUserResponse> addUser(AddUserRequest request);

    CompletableFuture<AddUserGroupMemberResponse> addUserGroupMember(AddUserGroupMemberRequest request);

    CompletableFuture<AddUserGroupMembersResponse> addUserGroupMembers(AddUserGroupMembersRequest request);

    CompletableFuture<AddUserTagMetaResponse> addUserTagMeta(AddUserTagMetaRequest request);

    CompletableFuture<AddUserToWorkspaceResponse> addUserToWorkspace(AddUserToWorkspaceRequest request);

    CompletableFuture<AddWorkspaceUsersResponse> addWorkspaceUsers(AddWorkspaceUsersRequest request);

    CompletableFuture<AllotDatasetAccelerationTaskResponse> allotDatasetAccelerationTask(AllotDatasetAccelerationTaskRequest request);

    CompletableFuture<AuthorizeMenuResponse> authorizeMenu(AuthorizeMenuRequest request);

    CompletableFuture<BatchAddFeishuUsersResponse> batchAddFeishuUsers(BatchAddFeishuUsersRequest request);

    CompletableFuture<CancelAuthorizationMenuResponse> cancelAuthorizationMenu(CancelAuthorizationMenuRequest request);

    CompletableFuture<CancelCollectionResponse> cancelCollection(CancelCollectionRequest request);

    CompletableFuture<CancelReportShareResponse> cancelReportShare(CancelReportShareRequest request);

    CompletableFuture<ChangeVisibilityModelResponse> changeVisibilityModel(ChangeVisibilityModelRequest request);

    CompletableFuture<CheckReadableResponse> checkReadable(CheckReadableRequest request);

    CompletableFuture<CreateTicketResponse> createTicket(CreateTicketRequest request);

    CompletableFuture<CreateUserGroupResponse> createUserGroup(CreateUserGroupRequest request);

    CompletableFuture<DelayTicketExpireTimeResponse> delayTicketExpireTime(DelayTicketExpireTimeRequest request);

    /**
      * {"ruleId":"a5bb24da-***-a891683e14da","cubeId":"7c7223ae-***-3c744528014b","delModel":{"userGroups":["0d5fb19b-***-1248fc27ca51","3d2c23d4-***-f6390f325c2d"],"users":["4334***358","Huang***3fa822"]}}
      *
     */
    CompletableFuture<DeleteDataLevelPermissionRuleUsersResponse> deleteDataLevelPermissionRuleUsers(DeleteDataLevelPermissionRuleUsersRequest request);

    /**
      * The ID of the training dataset that you want to remove from the specified custom linguistic model.
      *
     */
    CompletableFuture<DeleteDataLevelRuleConfigResponse> deleteDataLevelRuleConfig(DeleteDataLevelRuleConfigRequest request);

    CompletableFuture<DeleteTicketResponse> deleteTicket(DeleteTicketRequest request);

    CompletableFuture<DeleteUserResponse> deleteUser(DeleteUserRequest request);

    CompletableFuture<DeleteUserFromWorkspaceResponse> deleteUserFromWorkspace(DeleteUserFromWorkspaceRequest request);

    CompletableFuture<DeleteUserGroupResponse> deleteUserGroup(DeleteUserGroupRequest request);

    CompletableFuture<DeleteUserGroupMemberResponse> deleteUserGroupMember(DeleteUserGroupMemberRequest request);

    CompletableFuture<DeleteUserGroupMembersResponse> deleteUserGroupMembers(DeleteUserGroupMembersRequest request);

    CompletableFuture<DeleteUserTagMetaResponse> deleteUserTagMeta(DeleteUserTagMetaRequest request);

    CompletableFuture<GetUserGroupInfoResponse> getUserGroupInfo(GetUserGroupInfoRequest request);

    CompletableFuture<ListApiDatasourceResponse> listApiDatasource(ListApiDatasourceRequest request);

    CompletableFuture<ListByUserGroupIdResponse> listByUserGroupId(ListByUserGroupIdRequest request);

    CompletableFuture<ListCollectionsResponse> listCollections(ListCollectionsRequest request);

    /**
      * > : You can only Quick BI the new row-column permission model. If you are still using the old row-column permission model, migrate to the new row-column permission model before you call this operation. To migrate row-level permissions to the new row-level permission model, perform the following steps: Choose Organizations> Security Configurations> Upgrade Row-Level Permissions. On the Upgrade Row-Level Permissions page, click **Upgrade**.
      *
     */
    CompletableFuture<ListCubeDataLevelPermissionConfigResponse> listCubeDataLevelPermissionConfig(ListCubeDataLevelPermissionConfigRequest request);

    CompletableFuture<ListDataLevelPermissionWhiteListResponse> listDataLevelPermissionWhiteList(ListDataLevelPermissionWhiteListRequest request);

    CompletableFuture<ListFavoriteReportsResponse> listFavoriteReports(ListFavoriteReportsRequest request);

    CompletableFuture<ListPortalMenuAuthorizationResponse> listPortalMenuAuthorization(ListPortalMenuAuthorizationRequest request);

    CompletableFuture<ListPortalMenusResponse> listPortalMenus(ListPortalMenusRequest request);

    CompletableFuture<ListRecentViewReportsResponse> listRecentViewReports(ListRecentViewReportsRequest request);

    CompletableFuture<ListSharedReportsResponse> listSharedReports(ListSharedReportsRequest request);

    CompletableFuture<ListUserGroupsByUserIdResponse> listUserGroupsByUserId(ListUserGroupsByUserIdRequest request);

    CompletableFuture<ModifyApiDatasourceParametersResponse> modifyApiDatasourceParameters(ModifyApiDatasourceParametersRequest request);

    /**
      * f4cc43bc3***
      *
     */
    CompletableFuture<QueryDataServiceResponse> queryDataService(QueryDataServiceRequest request);

    /**
      * The execution result of the interface is returned. Valid values:
      * *   true: The request was successful.
      * *   false: The request fails.
      *
     */
    CompletableFuture<QueryDatasetDetailInfoResponse> queryDatasetDetailInfo(QueryDatasetDetailInfoRequest request);

    CompletableFuture<QueryDatasetInfoResponse> queryDatasetInfo(QueryDatasetInfoRequest request);

    CompletableFuture<QueryDatasetListResponse> queryDatasetList(QueryDatasetListRequest request);

    CompletableFuture<QueryDatasetSwitchInfoResponse> queryDatasetSwitchInfo(QueryDatasetSwitchInfoRequest request);

    CompletableFuture<QueryEmbeddedInfoResponse> queryEmbeddedInfo(QueryEmbeddedInfoRequest request);

    CompletableFuture<QueryEmbeddedStatusResponse> queryEmbeddedStatus(QueryEmbeddedStatusRequest request);

    CompletableFuture<QueryOrganizationWorkspaceListResponse> queryOrganizationWorkspaceList(QueryOrganizationWorkspaceListRequest request);

    CompletableFuture<QueryReadableResourcesListByUserIdResponse> queryReadableResourcesListByUserId(QueryReadableResourcesListByUserIdRequest request);

    CompletableFuture<QueryShareListResponse> queryShareList(QueryShareListRequest request);

    CompletableFuture<QuerySharesToUserListResponse> querySharesToUserList(QuerySharesToUserListRequest request);

    CompletableFuture<QueryTicketInfoResponse> queryTicketInfo(QueryTicketInfoRequest request);

    CompletableFuture<QueryUserGroupListByParentIdResponse> queryUserGroupListByParentId(QueryUserGroupListByParentIdRequest request);

    CompletableFuture<QueryUserGroupMemberResponse> queryUserGroupMember(QueryUserGroupMemberRequest request);

    CompletableFuture<QueryUserInfoByAccountResponse> queryUserInfoByAccount(QueryUserInfoByAccountRequest request);

    CompletableFuture<QueryUserInfoByUserIdResponse> queryUserInfoByUserId(QueryUserInfoByUserIdRequest request);

    CompletableFuture<QueryUserListResponse> queryUserList(QueryUserListRequest request);

    CompletableFuture<QueryUserRoleInfoInWorkspaceResponse> queryUserRoleInfoInWorkspace(QueryUserRoleInfoInWorkspaceRequest request);

    CompletableFuture<QueryUserTagMetaListResponse> queryUserTagMetaList(QueryUserTagMetaListRequest request);

    CompletableFuture<QueryUserTagValueListResponse> queryUserTagValueList(QueryUserTagValueListRequest request);

    CompletableFuture<QueryWorksResponse> queryWorks(QueryWorksRequest request);

    CompletableFuture<QueryWorksBloodRelationshipResponse> queryWorksBloodRelationship(QueryWorksBloodRelationshipRequest request);

    CompletableFuture<QueryWorksByOrganizationResponse> queryWorksByOrganization(QueryWorksByOrganizationRequest request);

    CompletableFuture<QueryWorksByWorkspaceResponse> queryWorksByWorkspace(QueryWorksByWorkspaceRequest request);

    CompletableFuture<QueryWorkspaceUserListResponse> queryWorkspaceUserList(QueryWorkspaceUserListRequest request);

    CompletableFuture<ResultCallbackResponse> resultCallback(ResultCallbackRequest request);

    CompletableFuture<SaveFavoritesResponse> saveFavorites(SaveFavoritesRequest request);

    CompletableFuture<SetDataLevelPermissionExtraConfigResponse> setDataLevelPermissionExtraConfig(SetDataLevelPermissionExtraConfigRequest request);

    /**
      * Indicates whether the request is successful. Valid values:
      * *   true: The request was successful.
      * *   false: The request failed.
      *
     */
    CompletableFuture<SetDataLevelPermissionRuleConfigResponse> setDataLevelPermissionRuleConfig(SetDataLevelPermissionRuleConfigRequest request);

    /**
      * > : You can only Quick BI the new row-column permission model. If you are still using the old row-column permission model, migrate to the new row-column permission model before you call this operation. To migrate row-level permissions to the new row-level permission model, perform the following steps: Choose Organizations> Security Configurations> Upgrade Row-Level Permissions. On the Upgrade Row-Level Permissions page, click **Upgrade**.
      *
     */
    CompletableFuture<SetDataLevelPermissionWhiteListResponse> setDataLevelPermissionWhiteList(SetDataLevelPermissionWhiteListRequest request);

    /**
      * The execution result of the interface. Valid values:
      * *   true: The request was successful.
      * *   false: The request failed.
      *
     */
    CompletableFuture<UpdateDataLevelPermissionStatusResponse> updateDataLevelPermissionStatus(UpdateDataLevelPermissionStatusRequest request);

    CompletableFuture<UpdateEmbeddedStatusResponse> updateEmbeddedStatus(UpdateEmbeddedStatusRequest request);

    CompletableFuture<UpdateTicketNumResponse> updateTicketNum(UpdateTicketNumRequest request);

    CompletableFuture<UpdateUserResponse> updateUser(UpdateUserRequest request);

    CompletableFuture<UpdateUserGroupResponse> updateUserGroup(UpdateUserGroupRequest request);

    CompletableFuture<UpdateUserTagMetaResponse> updateUserTagMeta(UpdateUserTagMetaRequest request);

    CompletableFuture<UpdateUserTagValueResponse> updateUserTagValue(UpdateUserTagValueRequest request);

    CompletableFuture<UpdateWorkspaceUserRoleResponse> updateWorkspaceUserRole(UpdateWorkspaceUserRoleRequest request);

    CompletableFuture<UpdateWorkspaceUsersRoleResponse> updateWorkspaceUsersRole(UpdateWorkspaceUsersRoleRequest request);

    CompletableFuture<WithdrawAllUserGroupsResponse> withdrawAllUserGroups(WithdrawAllUserGroupsRequest request);

}
