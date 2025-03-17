// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.quickbi_public20220101.models.*;
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
     * <blockquote>
     * <p>: You can only Quick BI the new row-column permission model. If you are still using the old row-column permission model, migrate to the new row-column permission model before you call this operation. To migrate row-level permissions to the new row-level permission model, perform the following steps: Choose Organizations&gt; Security Configurations&gt; Upgrade Row-Level Permissions. On the Upgrade Row-Level Permissions page, click <strong>Upgrade</strong>.\n</p>
     * </blockquote>
     * 
     * @param request the request parameters of AddDataLevelPermissionRuleUsers  AddDataLevelPermissionRuleUsersRequest
     * @return AddDataLevelPermissionRuleUsersResponse
     */
    CompletableFuture<AddDataLevelPermissionRuleUsersResponse> addDataLevelPermissionRuleUsers(AddDataLevelPermissionRuleUsersRequest request);

    /**
     * <b>description</b> :
     * <p>ROW_LEVEL</p>
     * 
     * @param request the request parameters of AddDataLevelPermissionWhiteList  AddDataLevelPermissionWhiteListRequest
     * @return AddDataLevelPermissionWhiteListResponse
     */
    CompletableFuture<AddDataLevelPermissionWhiteListResponse> addDataLevelPermissionWhiteList(AddDataLevelPermissionWhiteListRequest request);

    /**
     * @param request the request parameters of AddShareReport  AddShareReportRequest
     * @return AddShareReportResponse
     */
    CompletableFuture<AddShareReportResponse> addShareReport(AddShareReportRequest request);

    /**
     * @param request the request parameters of AddUser  AddUserRequest
     * @return AddUserResponse
     */
    CompletableFuture<AddUserResponse> addUser(AddUserRequest request);

    /**
     * @param request the request parameters of AddUserGroupMember  AddUserGroupMemberRequest
     * @return AddUserGroupMemberResponse
     */
    CompletableFuture<AddUserGroupMemberResponse> addUserGroupMember(AddUserGroupMemberRequest request);

    /**
     * @param request the request parameters of AddUserGroupMembers  AddUserGroupMembersRequest
     * @return AddUserGroupMembersResponse
     */
    CompletableFuture<AddUserGroupMembersResponse> addUserGroupMembers(AddUserGroupMembersRequest request);

    /**
     * @param request the request parameters of AddUserTagMeta  AddUserTagMetaRequest
     * @return AddUserTagMetaResponse
     */
    CompletableFuture<AddUserTagMetaResponse> addUserTagMeta(AddUserTagMetaRequest request);

    /**
     * @param request the request parameters of AddUserToWorkspace  AddUserToWorkspaceRequest
     * @return AddUserToWorkspaceResponse
     */
    CompletableFuture<AddUserToWorkspaceResponse> addUserToWorkspace(AddUserToWorkspaceRequest request);

    /**
     * @param request the request parameters of AddWorkspaceUsers  AddWorkspaceUsersRequest
     * @return AddWorkspaceUsersResponse
     */
    CompletableFuture<AddWorkspaceUsersResponse> addWorkspaceUsers(AddWorkspaceUsersRequest request);

    /**
     * @param request the request parameters of AllotDatasetAccelerationTask  AllotDatasetAccelerationTaskRequest
     * @return AllotDatasetAccelerationTaskResponse
     */
    CompletableFuture<AllotDatasetAccelerationTaskResponse> allotDatasetAccelerationTask(AllotDatasetAccelerationTaskRequest request);

    /**
     * @param request the request parameters of AuthorizeMenu  AuthorizeMenuRequest
     * @return AuthorizeMenuResponse
     */
    CompletableFuture<AuthorizeMenuResponse> authorizeMenu(AuthorizeMenuRequest request);

    /**
     * @param request the request parameters of BatchAddFeishuUsers  BatchAddFeishuUsersRequest
     * @return BatchAddFeishuUsersResponse
     */
    CompletableFuture<BatchAddFeishuUsersResponse> batchAddFeishuUsers(BatchAddFeishuUsersRequest request);

    /**
     * @param request the request parameters of CancelAuthorizationMenu  CancelAuthorizationMenuRequest
     * @return CancelAuthorizationMenuResponse
     */
    CompletableFuture<CancelAuthorizationMenuResponse> cancelAuthorizationMenu(CancelAuthorizationMenuRequest request);

    /**
     * @param request the request parameters of CancelCollection  CancelCollectionRequest
     * @return CancelCollectionResponse
     */
    CompletableFuture<CancelCollectionResponse> cancelCollection(CancelCollectionRequest request);

    /**
     * @param request the request parameters of CancelReportShare  CancelReportShareRequest
     * @return CancelReportShareResponse
     */
    CompletableFuture<CancelReportShareResponse> cancelReportShare(CancelReportShareRequest request);

    /**
     * @param request the request parameters of ChangeVisibilityModel  ChangeVisibilityModelRequest
     * @return ChangeVisibilityModelResponse
     */
    CompletableFuture<ChangeVisibilityModelResponse> changeVisibilityModel(ChangeVisibilityModelRequest request);

    /**
     * @param request the request parameters of CheckReadable  CheckReadableRequest
     * @return CheckReadableResponse
     */
    CompletableFuture<CheckReadableResponse> checkReadable(CheckReadableRequest request);

    /**
     * <b>description</b> :
     * <p>For detailed usage, please refer to the <a href="https://help.aliyun.com/document_detail/391291.html">Report Embedding Data Permission Control and Parameter Passing Security Enhancement Solution</a>.</p>
     * 
     * @param request the request parameters of CreateTicket  CreateTicketRequest
     * @return CreateTicketResponse
     */
    CompletableFuture<CreateTicketResponse> createTicket(CreateTicketRequest request);

    /**
     * @param request the request parameters of CreateTicket4Copilot  CreateTicket4CopilotRequest
     * @return CreateTicket4CopilotResponse
     */
    CompletableFuture<CreateTicket4CopilotResponse> createTicket4Copilot(CreateTicket4CopilotRequest request);

    /**
     * @param request the request parameters of CreateUserGroup  CreateUserGroupRequest
     * @return CreateUserGroupResponse
     */
    CompletableFuture<CreateUserGroupResponse> createUserGroup(CreateUserGroupRequest request);

    /**
     * @param request the request parameters of DataSetBlood  DataSetBloodRequest
     * @return DataSetBloodResponse
     */
    CompletableFuture<DataSetBloodResponse> dataSetBlood(DataSetBloodRequest request);

    /**
     * @param request the request parameters of DataSourceBlood  DataSourceBloodRequest
     * @return DataSourceBloodResponse
     */
    CompletableFuture<DataSourceBloodResponse> dataSourceBlood(DataSourceBloodRequest request);

    /**
     * @param request the request parameters of DelayTicketExpireTime  DelayTicketExpireTimeRequest
     * @return DelayTicketExpireTimeResponse
     */
    CompletableFuture<DelayTicketExpireTimeResponse> delayTicketExpireTime(DelayTicketExpireTimeRequest request);

    /**
     * <b>description</b> :
     * <p>{&quot;ruleId&quot;:&quot;a5bb24da-<em><strong>-a891683e14da&quot;,&quot;cubeId&quot;:&quot;7c7223ae-</strong></em>-3c744528014b&quot;,&quot;delModel&quot;:{&quot;userGroups&quot;:[&quot;0d5fb19b-<em><strong>-1248fc27ca51&quot;,&quot;3d2c23d4-</strong></em>-f6390f325c2d&quot;],&quot;users&quot;:[&quot;4334<em><strong>358&quot;,&quot;Huang</strong></em>3fa822&quot;]}}</p>
     * 
     * @param request the request parameters of DeleteDataLevelPermissionRuleUsers  DeleteDataLevelPermissionRuleUsersRequest
     * @return DeleteDataLevelPermissionRuleUsersResponse
     */
    CompletableFuture<DeleteDataLevelPermissionRuleUsersResponse> deleteDataLevelPermissionRuleUsers(DeleteDataLevelPermissionRuleUsersRequest request);

    /**
     * <b>description</b> :
     * <p>The ID of the training dataset that you want to remove from the specified custom linguistic model.</p>
     * 
     * @param request the request parameters of DeleteDataLevelRuleConfig  DeleteDataLevelRuleConfigRequest
     * @return DeleteDataLevelRuleConfigResponse
     */
    CompletableFuture<DeleteDataLevelRuleConfigResponse> deleteDataLevelRuleConfig(DeleteDataLevelRuleConfigRequest request);

    /**
     * @param request the request parameters of DeleteTicket  DeleteTicketRequest
     * @return DeleteTicketResponse
     */
    CompletableFuture<DeleteTicketResponse> deleteTicket(DeleteTicketRequest request);

    /**
     * @param request the request parameters of DeleteUser  DeleteUserRequest
     * @return DeleteUserResponse
     */
    CompletableFuture<DeleteUserResponse> deleteUser(DeleteUserRequest request);

    /**
     * @param request the request parameters of DeleteUserFromWorkspace  DeleteUserFromWorkspaceRequest
     * @return DeleteUserFromWorkspaceResponse
     */
    CompletableFuture<DeleteUserFromWorkspaceResponse> deleteUserFromWorkspace(DeleteUserFromWorkspaceRequest request);

    /**
     * @param request the request parameters of DeleteUserGroup  DeleteUserGroupRequest
     * @return DeleteUserGroupResponse
     */
    CompletableFuture<DeleteUserGroupResponse> deleteUserGroup(DeleteUserGroupRequest request);

    /**
     * @param request the request parameters of DeleteUserGroupMember  DeleteUserGroupMemberRequest
     * @return DeleteUserGroupMemberResponse
     */
    CompletableFuture<DeleteUserGroupMemberResponse> deleteUserGroupMember(DeleteUserGroupMemberRequest request);

    /**
     * @param request the request parameters of DeleteUserGroupMembers  DeleteUserGroupMembersRequest
     * @return DeleteUserGroupMembersResponse
     */
    CompletableFuture<DeleteUserGroupMembersResponse> deleteUserGroupMembers(DeleteUserGroupMembersRequest request);

    /**
     * @param request the request parameters of DeleteUserTagMeta  DeleteUserTagMetaRequest
     * @return DeleteUserTagMetaResponse
     */
    CompletableFuture<DeleteUserTagMetaResponse> deleteUserTagMeta(DeleteUserTagMetaRequest request);

    /**
     * @param request the request parameters of GetDataSourceConnectionInfo  GetDataSourceConnectionInfoRequest
     * @return GetDataSourceConnectionInfoResponse
     */
    CompletableFuture<GetDataSourceConnectionInfoResponse> getDataSourceConnectionInfo(GetDataSourceConnectionInfoRequest request);

    /**
     * @param request the request parameters of GetMailTaskStatus  GetMailTaskStatusRequest
     * @return GetMailTaskStatusResponse
     */
    CompletableFuture<GetMailTaskStatusResponse> getMailTaskStatus(GetMailTaskStatusRequest request);

    /**
     * @param request the request parameters of GetUserGroupInfo  GetUserGroupInfoRequest
     * @return GetUserGroupInfoResponse
     */
    CompletableFuture<GetUserGroupInfoResponse> getUserGroupInfo(GetUserGroupInfoRequest request);

    /**
     * @param request the request parameters of GetWorksEmbedList  GetWorksEmbedListRequest
     * @return GetWorksEmbedListResponse
     */
    CompletableFuture<GetWorksEmbedListResponse> getWorksEmbedList(GetWorksEmbedListRequest request);

    /**
     * <b>description</b> :
     * <p>For more information about the parameters, see <a href="https://help.aliyun.com/document_detail/409330.html">Create an API data source</a>.</p>
     * 
     * @param request the request parameters of ListApiDatasource  ListApiDatasourceRequest
     * @return ListApiDatasourceResponse
     */
    CompletableFuture<ListApiDatasourceResponse> listApiDatasource(ListApiDatasourceRequest request);

    /**
     * @param request the request parameters of ListByUserGroupId  ListByUserGroupIdRequest
     * @return ListByUserGroupIdResponse
     */
    CompletableFuture<ListByUserGroupIdResponse> listByUserGroupId(ListByUserGroupIdRequest request);

    /**
     * @param request the request parameters of ListCollections  ListCollectionsRequest
     * @return ListCollectionsResponse
     */
    CompletableFuture<ListCollectionsResponse> listCollections(ListCollectionsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>: You can only Quick BI the new row-column permission model. If you are still using the old row-column permission model, migrate to the new row-column permission model before you call this operation. To migrate row-level permissions to the new row-level permission model, perform the following steps: Choose Organizations&gt; Security Configurations&gt; Upgrade Row-Level Permissions. On the Upgrade Row-Level Permissions page, click <strong>Upgrade</strong>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListCubeDataLevelPermissionConfig  ListCubeDataLevelPermissionConfigRequest
     * @return ListCubeDataLevelPermissionConfigResponse
     */
    CompletableFuture<ListCubeDataLevelPermissionConfigResponse> listCubeDataLevelPermissionConfig(ListCubeDataLevelPermissionConfigRequest request);

    /**
     * @param request the request parameters of ListDataLevelPermissionWhiteList  ListDataLevelPermissionWhiteListRequest
     * @return ListDataLevelPermissionWhiteListResponse
     */
    CompletableFuture<ListDataLevelPermissionWhiteListResponse> listDataLevelPermissionWhiteList(ListDataLevelPermissionWhiteListRequest request);

    /**
     * @param request the request parameters of ListDataSource  ListDataSourceRequest
     * @return ListDataSourceResponse
     */
    CompletableFuture<ListDataSourceResponse> listDataSource(ListDataSourceRequest request);

    /**
     * @param request the request parameters of ListFavoriteReports  ListFavoriteReportsRequest
     * @return ListFavoriteReportsResponse
     */
    CompletableFuture<ListFavoriteReportsResponse> listFavoriteReports(ListFavoriteReportsRequest request);

    /**
     * @param request the request parameters of ListOrganizationRoleUsers  ListOrganizationRoleUsersRequest
     * @return ListOrganizationRoleUsersResponse
     */
    CompletableFuture<ListOrganizationRoleUsersResponse> listOrganizationRoleUsers(ListOrganizationRoleUsersRequest request);

    /**
     * @param request the request parameters of ListOrganizationRoles  ListOrganizationRolesRequest
     * @return ListOrganizationRolesResponse
     */
    CompletableFuture<ListOrganizationRolesResponse> listOrganizationRoles(ListOrganizationRolesRequest request);

    /**
     * @param request the request parameters of ListPortalMenuAuthorization  ListPortalMenuAuthorizationRequest
     * @return ListPortalMenuAuthorizationResponse
     */
    CompletableFuture<ListPortalMenuAuthorizationResponse> listPortalMenuAuthorization(ListPortalMenuAuthorizationRequest request);

    /**
     * @param request the request parameters of ListPortalMenus  ListPortalMenusRequest
     * @return ListPortalMenusResponse
     */
    CompletableFuture<ListPortalMenusResponse> listPortalMenus(ListPortalMenusRequest request);

    /**
     * @param request the request parameters of ListRecentViewReports  ListRecentViewReportsRequest
     * @return ListRecentViewReportsResponse
     */
    CompletableFuture<ListRecentViewReportsResponse> listRecentViewReports(ListRecentViewReportsRequest request);

    /**
     * @param request the request parameters of ListSharedReports  ListSharedReportsRequest
     * @return ListSharedReportsResponse
     */
    CompletableFuture<ListSharedReportsResponse> listSharedReports(ListSharedReportsRequest request);

    /**
     * @param request the request parameters of ListUserGroupsByUserId  ListUserGroupsByUserIdRequest
     * @return ListUserGroupsByUserIdResponse
     */
    CompletableFuture<ListUserGroupsByUserIdResponse> listUserGroupsByUserId(ListUserGroupsByUserIdRequest request);

    /**
     * @param request the request parameters of ListWorkspaceRoleUsers  ListWorkspaceRoleUsersRequest
     * @return ListWorkspaceRoleUsersResponse
     */
    CompletableFuture<ListWorkspaceRoleUsersResponse> listWorkspaceRoleUsers(ListWorkspaceRoleUsersRequest request);

    /**
     * @param request the request parameters of ListWorkspaceRoles  ListWorkspaceRolesRequest
     * @return ListWorkspaceRolesResponse
     */
    CompletableFuture<ListWorkspaceRolesResponse> listWorkspaceRoles(ListWorkspaceRolesRequest request);

    /**
     * @param request the request parameters of ManualRunMailTask  ManualRunMailTaskRequest
     * @return ManualRunMailTaskResponse
     */
    CompletableFuture<ManualRunMailTaskResponse> manualRunMailTask(ManualRunMailTaskRequest request);

    /**
     * <b>description</b> :
     * <p>When you modify a query statement, you can modify only the top-level JsonObject. You cannot modify parameters that are nested in multiple layers. For more information about the parameters, see <a href="https://help.aliyun.com/document_detail/409330.html">Create an API data source</a>.</p>
     * 
     * @param request the request parameters of ModifyApiDatasourceParameters  ModifyApiDatasourceParametersRequest
     * @return ModifyApiDatasourceParametersResponse
     */
    CompletableFuture<ModifyApiDatasourceParametersResponse> modifyApiDatasourceParameters(ModifyApiDatasourceParametersRequest request);

    /**
     * @param request the request parameters of ModifyCopilotEmbedConfig  ModifyCopilotEmbedConfigRequest
     * @return ModifyCopilotEmbedConfigResponse
     */
    CompletableFuture<ModifyCopilotEmbedConfigResponse> modifyCopilotEmbedConfig(ModifyCopilotEmbedConfigRequest request);

    /**
     * @param request the request parameters of QueryApprovalInfo  QueryApprovalInfoRequest
     * @return QueryApprovalInfoResponse
     */
    CompletableFuture<QueryApprovalInfoResponse> queryApprovalInfo(QueryApprovalInfoRequest request);

    /**
     * @param request the request parameters of QueryAuditLog  QueryAuditLogRequest
     * @return QueryAuditLogResponse
     */
    CompletableFuture<QueryAuditLogResponse> queryAuditLog(QueryAuditLogRequest request);

    /**
     * @param request the request parameters of QueryComponentPerformance  QueryComponentPerformanceRequest
     * @return QueryComponentPerformanceResponse
     */
    CompletableFuture<QueryComponentPerformanceResponse> queryComponentPerformance(QueryComponentPerformanceRequest request);

    /**
     * @param request the request parameters of QueryCopilotEmbedConfig  QueryCopilotEmbedConfigRequest
     * @return QueryCopilotEmbedConfigResponse
     */
    CompletableFuture<QueryCopilotEmbedConfigResponse> queryCopilotEmbedConfig(QueryCopilotEmbedConfigRequest request);

    /**
     * @param request the request parameters of QueryCubeOptimization  QueryCubeOptimizationRequest
     * @return QueryCubeOptimizationResponse
     */
    CompletableFuture<QueryCubeOptimizationResponse> queryCubeOptimization(QueryCubeOptimizationRequest request);

    /**
     * @param request the request parameters of QueryCubePerformance  QueryCubePerformanceRequest
     * @return QueryCubePerformanceResponse
     */
    CompletableFuture<QueryCubePerformanceResponse> queryCubePerformance(QueryCubePerformanceRequest request);

    /**
     * <b>description</b> :
     * <h3>Prerequisites</h3>
     * <p>You need to create a data service API through Quick BI\&quot;s data service. For more details, see: <a href="https://help.aliyun.com/document_detail/144980.html">Data Service</a>.</p>
     * <h3>Usage Restrictions</h3>
     * <ul>
     * <li>The data service feature is only available to professional edition customers.</li>
     * <li>The timeout for data service API calls is 60s, and the QPS for a single API is 10 times/second.</li>
     * <li>If row-level permissions are enabled on the dataset referenced by the data service API, the API call will also be intercepted by the row-level permission policy.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryData  QueryDataRequest
     * @return QueryDataResponse
     */
    CompletableFuture<QueryDataResponse> queryData(QueryDataRequest request);

    /**
     * @param request the request parameters of QueryDataRange  QueryDataRangeRequest
     * @return QueryDataRangeResponse
     */
    CompletableFuture<QueryDataRangeResponse> queryDataRange(QueryDataRangeRequest request);

    /**
     * <b>description</b> :
     * <h4>Prerequisites</h4>
     * <p>You create the data service API through Quick BI\&quot;s data service. For more details, see <a href="https://help.aliyun.com/document_detail/144980.html">Data Service</a>.</p>
     * <h4>Usage Restrictions</h4>
     * <ul>
     * <li>The data service feature is only available to professional edition customers. </li>
     * <li>The timeout for data service API calls is 60s, and the QPS for a single API is 10 times/second.</li>
     * <li>If row-level permissions are enabled on the dataset referenced by the data service API, the API call may be intercepted by the row-level permission policy.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryDataService  QueryDataServiceRequest
     * @return QueryDataServiceResponse
     */
    CompletableFuture<QueryDataServiceResponse> queryDataService(QueryDataServiceRequest request);

    /**
     * @param request the request parameters of QueryDataServiceList  QueryDataServiceListRequest
     * @return QueryDataServiceListResponse
     */
    CompletableFuture<QueryDataServiceListResponse> queryDataServiceList(QueryDataServiceListRequest request);

    /**
     * <b>description</b> :
     * <p>The data source, directory, and dataset model (including dimensions, measures, physical fields, custom SQL text, and association relationships).</p>
     * 
     * @param request the request parameters of QueryDatasetDetailInfo  QueryDatasetDetailInfoRequest
     * @return QueryDatasetDetailInfoResponse
     */
    CompletableFuture<QueryDatasetDetailInfoResponse> queryDatasetDetailInfo(QueryDatasetDetailInfoRequest request);

    /**
     * @param request the request parameters of QueryDatasetInfo  QueryDatasetInfoRequest
     * @return QueryDatasetInfoResponse
     */
    CompletableFuture<QueryDatasetInfoResponse> queryDatasetInfo(QueryDatasetInfoRequest request);

    /**
     * @param request the request parameters of QueryDatasetList  QueryDatasetListRequest
     * @return QueryDatasetListResponse
     */
    CompletableFuture<QueryDatasetListResponse> queryDatasetList(QueryDatasetListRequest request);

    /**
     * @param request the request parameters of QueryDatasetSmartqStatus  QueryDatasetSmartqStatusRequest
     * @return QueryDatasetSmartqStatusResponse
     */
    CompletableFuture<QueryDatasetSmartqStatusResponse> queryDatasetSmartqStatus(QueryDatasetSmartqStatusRequest request);

    /**
     * @param request the request parameters of QueryDatasetSwitchInfo  QueryDatasetSwitchInfoRequest
     * @return QueryDatasetSwitchInfoResponse
     */
    CompletableFuture<QueryDatasetSwitchInfoResponse> queryDatasetSwitchInfo(QueryDatasetSwitchInfoRequest request);

    /**
     * @param request the request parameters of QueryEmbeddedInfo  QueryEmbeddedInfoRequest
     * @return QueryEmbeddedInfoResponse
     */
    CompletableFuture<QueryEmbeddedInfoResponse> queryEmbeddedInfo(QueryEmbeddedInfoRequest request);

    /**
     * @param request the request parameters of QueryEmbeddedStatus  QueryEmbeddedStatusRequest
     * @return QueryEmbeddedStatusResponse
     */
    CompletableFuture<QueryEmbeddedStatusResponse> queryEmbeddedStatus(QueryEmbeddedStatusRequest request);

    /**
     * @param request the request parameters of QueryLlmCubeWithThemeListByUserId  QueryLlmCubeWithThemeListByUserIdRequest
     * @return QueryLlmCubeWithThemeListByUserIdResponse
     */
    CompletableFuture<QueryLlmCubeWithThemeListByUserIdResponse> queryLlmCubeWithThemeListByUserId(QueryLlmCubeWithThemeListByUserIdRequest request);

    /**
     * @param request the request parameters of QueryOrganizationRoleConfig  QueryOrganizationRoleConfigRequest
     * @return QueryOrganizationRoleConfigResponse
     */
    CompletableFuture<QueryOrganizationRoleConfigResponse> queryOrganizationRoleConfig(QueryOrganizationRoleConfigRequest request);

    /**
     * @param request the request parameters of QueryOrganizationWorkspaceList  QueryOrganizationWorkspaceListRequest
     * @return QueryOrganizationWorkspaceListResponse
     */
    CompletableFuture<QueryOrganizationWorkspaceListResponse> queryOrganizationWorkspaceList(QueryOrganizationWorkspaceListRequest request);

    /**
     * @param request the request parameters of QueryReadableResourcesListByUserId  QueryReadableResourcesListByUserIdRequest
     * @return QueryReadableResourcesListByUserIdResponse
     */
    CompletableFuture<QueryReadableResourcesListByUserIdResponse> queryReadableResourcesListByUserId(QueryReadableResourcesListByUserIdRequest request);

    /**
     * @param request the request parameters of QueryReportPerformance  QueryReportPerformanceRequest
     * @return QueryReportPerformanceResponse
     */
    CompletableFuture<QueryReportPerformanceResponse> queryReportPerformance(QueryReportPerformanceRequest request);

    /**
     * @param request the request parameters of QueryShareList  QueryShareListRequest
     * @return QueryShareListResponse
     */
    CompletableFuture<QueryShareListResponse> queryShareList(QueryShareListRequest request);

    /**
     * @param request the request parameters of QuerySharesToUserList  QuerySharesToUserListRequest
     * @return QuerySharesToUserListResponse
     */
    CompletableFuture<QuerySharesToUserListResponse> querySharesToUserList(QuerySharesToUserListRequest request);

    /**
     * @param request the request parameters of QuerySmartqPermissionByCubeId  QuerySmartqPermissionByCubeIdRequest
     * @return QuerySmartqPermissionByCubeIdResponse
     */
    CompletableFuture<QuerySmartqPermissionByCubeIdResponse> querySmartqPermissionByCubeId(QuerySmartqPermissionByCubeIdRequest request);

    /**
     * @param request the request parameters of QueryTicketInfo  QueryTicketInfoRequest
     * @return QueryTicketInfoResponse
     */
    CompletableFuture<QueryTicketInfoResponse> queryTicketInfo(QueryTicketInfoRequest request);

    /**
     * @param request the request parameters of QueryUserGroupListByParentId  QueryUserGroupListByParentIdRequest
     * @return QueryUserGroupListByParentIdResponse
     */
    CompletableFuture<QueryUserGroupListByParentIdResponse> queryUserGroupListByParentId(QueryUserGroupListByParentIdRequest request);

    /**
     * @param request the request parameters of QueryUserGroupMember  QueryUserGroupMemberRequest
     * @return QueryUserGroupMemberResponse
     */
    CompletableFuture<QueryUserGroupMemberResponse> queryUserGroupMember(QueryUserGroupMemberRequest request);

    /**
     * @param request the request parameters of QueryUserInfoByAccount  QueryUserInfoByAccountRequest
     * @return QueryUserInfoByAccountResponse
     */
    CompletableFuture<QueryUserInfoByAccountResponse> queryUserInfoByAccount(QueryUserInfoByAccountRequest request);

    /**
     * @param request the request parameters of QueryUserInfoByUserId  QueryUserInfoByUserIdRequest
     * @return QueryUserInfoByUserIdResponse
     */
    CompletableFuture<QueryUserInfoByUserIdResponse> queryUserInfoByUserId(QueryUserInfoByUserIdRequest request);

    /**
     * @param request the request parameters of QueryUserList  QueryUserListRequest
     * @return QueryUserListResponse
     */
    CompletableFuture<QueryUserListResponse> queryUserList(QueryUserListRequest request);

    /**
     * @param request the request parameters of QueryUserRoleInfoInWorkspace  QueryUserRoleInfoInWorkspaceRequest
     * @return QueryUserRoleInfoInWorkspaceResponse
     */
    CompletableFuture<QueryUserRoleInfoInWorkspaceResponse> queryUserRoleInfoInWorkspace(QueryUserRoleInfoInWorkspaceRequest request);

    /**
     * @param request the request parameters of QueryUserTagMetaList  QueryUserTagMetaListRequest
     * @return QueryUserTagMetaListResponse
     */
    CompletableFuture<QueryUserTagMetaListResponse> queryUserTagMetaList(QueryUserTagMetaListRequest request);

    /**
     * @param request the request parameters of QueryUserTagValueList  QueryUserTagValueListRequest
     * @return QueryUserTagValueListResponse
     */
    CompletableFuture<QueryUserTagValueListResponse> queryUserTagValueList(QueryUserTagValueListRequest request);

    /**
     * @param request the request parameters of QueryWorks  QueryWorksRequest
     * @return QueryWorksResponse
     */
    CompletableFuture<QueryWorksResponse> queryWorks(QueryWorksRequest request);

    /**
     * @param request the request parameters of QueryWorksBloodRelationship  QueryWorksBloodRelationshipRequest
     * @return QueryWorksBloodRelationshipResponse
     */
    CompletableFuture<QueryWorksBloodRelationshipResponse> queryWorksBloodRelationship(QueryWorksBloodRelationshipRequest request);

    /**
     * @param request the request parameters of QueryWorksByOrganization  QueryWorksByOrganizationRequest
     * @return QueryWorksByOrganizationResponse
     */
    CompletableFuture<QueryWorksByOrganizationResponse> queryWorksByOrganization(QueryWorksByOrganizationRequest request);

    /**
     * @param request the request parameters of QueryWorksByWorkspace  QueryWorksByWorkspaceRequest
     * @return QueryWorksByWorkspaceResponse
     */
    CompletableFuture<QueryWorksByWorkspaceResponse> queryWorksByWorkspace(QueryWorksByWorkspaceRequest request);

    /**
     * @param request the request parameters of QueryWorkspaceRoleConfig  QueryWorkspaceRoleConfigRequest
     * @return QueryWorkspaceRoleConfigResponse
     */
    CompletableFuture<QueryWorkspaceRoleConfigResponse> queryWorkspaceRoleConfig(QueryWorkspaceRoleConfigRequest request);

    /**
     * @param request the request parameters of QueryWorkspaceUserList  QueryWorkspaceUserListRequest
     * @return QueryWorkspaceUserListResponse
     */
    CompletableFuture<QueryWorkspaceUserListResponse> queryWorkspaceUserList(QueryWorkspaceUserListRequest request);

    /**
     * @param request the request parameters of ResultCallback  ResultCallbackRequest
     * @return ResultCallbackResponse
     */
    CompletableFuture<ResultCallbackResponse> resultCallback(ResultCallbackRequest request);

    /**
     * @param request the request parameters of SaveFavorites  SaveFavoritesRequest
     * @return SaveFavoritesResponse
     */
    CompletableFuture<SaveFavoritesResponse> saveFavorites(SaveFavoritesRequest request);

    /**
     * @param request the request parameters of SetDataLevelPermissionExtraConfig  SetDataLevelPermissionExtraConfigRequest
     * @return SetDataLevelPermissionExtraConfigResponse
     */
    CompletableFuture<SetDataLevelPermissionExtraConfigResponse> setDataLevelPermissionExtraConfig(SetDataLevelPermissionExtraConfigRequest request);

    /**
     * @param request the request parameters of SetDataLevelPermissionRuleConfig  SetDataLevelPermissionRuleConfigRequest
     * @return SetDataLevelPermissionRuleConfigResponse
     */
    CompletableFuture<SetDataLevelPermissionRuleConfigResponse> setDataLevelPermissionRuleConfig(SetDataLevelPermissionRuleConfigRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>: You can only Quick BI the new row-column permission model. If you are still using the old row-column permission model, migrate to the new row-column permission model before you call this operation. To migrate row-level permissions to the new row-level permission model, perform the following steps: Choose Organizations&gt; Security Configurations&gt; Upgrade Row-Level Permissions. On the Upgrade Row-Level Permissions page, click <strong>Upgrade</strong>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of SetDataLevelPermissionWhiteList  SetDataLevelPermissionWhiteListRequest
     * @return SetDataLevelPermissionWhiteListResponse
     */
    CompletableFuture<SetDataLevelPermissionWhiteListResponse> setDataLevelPermissionWhiteList(SetDataLevelPermissionWhiteListRequest request);

    /**
     * @param request the request parameters of SmartqAuthTransfer  SmartqAuthTransferRequest
     * @return SmartqAuthTransferResponse
     */
    CompletableFuture<SmartqAuthTransferResponse> smartqAuthTransfer(SmartqAuthTransferRequest request);

    /**
     * @param request the request parameters of SmartqAuthorize  SmartqAuthorizeRequest
     * @return SmartqAuthorizeResponse
     */
    CompletableFuture<SmartqAuthorizeResponse> smartqAuthorize(SmartqAuthorizeRequest request);

    /**
     * @param request the request parameters of SmartqQueryAbility  SmartqQueryAbilityRequest
     * @return SmartqQueryAbilityResponse
     */
    CompletableFuture<SmartqQueryAbilityResponse> smartqQueryAbility(SmartqQueryAbilityRequest request);

    /**
     * <b>description</b> :
     * <p>The execution result of the interface. Valid values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false: The request failed.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateDataLevelPermissionStatus  UpdateDataLevelPermissionStatusRequest
     * @return UpdateDataLevelPermissionStatusResponse
     */
    CompletableFuture<UpdateDataLevelPermissionStatusResponse> updateDataLevelPermissionStatus(UpdateDataLevelPermissionStatusRequest request);

    /**
     * @param request the request parameters of UpdateEmbeddedStatus  UpdateEmbeddedStatusRequest
     * @return UpdateEmbeddedStatusResponse
     */
    CompletableFuture<UpdateEmbeddedStatusResponse> updateEmbeddedStatus(UpdateEmbeddedStatusRequest request);

    /**
     * @param request the request parameters of UpdateTicketNum  UpdateTicketNumRequest
     * @return UpdateTicketNumResponse
     */
    CompletableFuture<UpdateTicketNumResponse> updateTicketNum(UpdateTicketNumRequest request);

    /**
     * @param request the request parameters of UpdateUser  UpdateUserRequest
     * @return UpdateUserResponse
     */
    CompletableFuture<UpdateUserResponse> updateUser(UpdateUserRequest request);

    /**
     * @param request the request parameters of UpdateUserGroup  UpdateUserGroupRequest
     * @return UpdateUserGroupResponse
     */
    CompletableFuture<UpdateUserGroupResponse> updateUserGroup(UpdateUserGroupRequest request);

    /**
     * @param request the request parameters of UpdateUserTagMeta  UpdateUserTagMetaRequest
     * @return UpdateUserTagMetaResponse
     */
    CompletableFuture<UpdateUserTagMetaResponse> updateUserTagMeta(UpdateUserTagMetaRequest request);

    /**
     * @param request the request parameters of UpdateUserTagValue  UpdateUserTagValueRequest
     * @return UpdateUserTagValueResponse
     */
    CompletableFuture<UpdateUserTagValueResponse> updateUserTagValue(UpdateUserTagValueRequest request);

    /**
     * @param request the request parameters of UpdateWorkspaceUserRole  UpdateWorkspaceUserRoleRequest
     * @return UpdateWorkspaceUserRoleResponse
     */
    CompletableFuture<UpdateWorkspaceUserRoleResponse> updateWorkspaceUserRole(UpdateWorkspaceUserRoleRequest request);

    /**
     * @param request the request parameters of UpdateWorkspaceUsersRole  UpdateWorkspaceUsersRoleRequest
     * @return UpdateWorkspaceUsersRoleResponse
     */
    CompletableFuture<UpdateWorkspaceUsersRoleResponse> updateWorkspaceUsersRole(UpdateWorkspaceUsersRoleRequest request);

    /**
     * @param request the request parameters of WithdrawAllUserGroups  WithdrawAllUserGroupsRequest
     * @return WithdrawAllUserGroupsResponse
     */
    CompletableFuture<WithdrawAllUserGroupsResponse> withdrawAllUserGroups(WithdrawAllUserGroupsRequest request);

}
