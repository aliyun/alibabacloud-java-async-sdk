// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dlfnext20250310.models.*;
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
     * @param request the request parameters of AlterCatalog  AlterCatalogRequest
     * @return AlterCatalogResponse
     */
    CompletableFuture<AlterCatalogResponse> alterCatalog(AlterCatalogRequest request);

    /**
     * @param request the request parameters of BatchGrantPermissions  BatchGrantPermissionsRequest
     * @return BatchGrantPermissionsResponse
     */
    CompletableFuture<BatchGrantPermissionsResponse> batchGrantPermissions(BatchGrantPermissionsRequest request);

    /**
     * @param request the request parameters of BatchRevokePermissions  BatchRevokePermissionsRequest
     * @return BatchRevokePermissionsResponse
     */
    CompletableFuture<BatchRevokePermissionsResponse> batchRevokePermissions(BatchRevokePermissionsRequest request);

    /**
     * @param request the request parameters of CreateCatalog  CreateCatalogRequest
     * @return CreateCatalogResponse
     */
    CompletableFuture<CreateCatalogResponse> createCatalog(CreateCatalogRequest request);

    /**
     * @param request the request parameters of CreateRole  CreateRoleRequest
     * @return CreateRoleResponse
     */
    CompletableFuture<CreateRoleResponse> createRole(CreateRoleRequest request);

    /**
     * @param request the request parameters of DeleteRole  DeleteRoleRequest
     * @return DeleteRoleResponse
     */
    CompletableFuture<DeleteRoleResponse> deleteRole(DeleteRoleRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * @param request the request parameters of DropCatalog  DropCatalogRequest
     * @return DropCatalogResponse
     */
    CompletableFuture<DropCatalogResponse> dropCatalog(DropCatalogRequest request);

    /**
     * @param request the request parameters of GetCatalog  GetCatalogRequest
     * @return GetCatalogResponse
     */
    CompletableFuture<GetCatalogResponse> getCatalog(GetCatalogRequest request);

    /**
     * @param request the request parameters of GetRegionStatus  GetRegionStatusRequest
     * @return GetRegionStatusResponse
     */
    CompletableFuture<GetRegionStatusResponse> getRegionStatus(GetRegionStatusRequest request);

    /**
     * @param request the request parameters of GetRole  GetRoleRequest
     * @return GetRoleResponse
     */
    CompletableFuture<GetRoleResponse> getRole(GetRoleRequest request);

    /**
     * @param request the request parameters of GetUser  GetUserRequest
     * @return GetUserResponse
     */
    CompletableFuture<GetUserResponse> getUser(GetUserRequest request);

    /**
     * @param request the request parameters of GrantRoleToUsers  GrantRoleToUsersRequest
     * @return GrantRoleToUsersResponse
     */
    CompletableFuture<GrantRoleToUsersResponse> grantRoleToUsers(GrantRoleToUsersRequest request);

    /**
     * @param request the request parameters of ListCatalogs  ListCatalogsRequest
     * @return ListCatalogsResponse
     */
    CompletableFuture<ListCatalogsResponse> listCatalogs(ListCatalogsRequest request);

    /**
     * @param request the request parameters of ListPermissions  ListPermissionsRequest
     * @return ListPermissionsResponse
     */
    CompletableFuture<ListPermissionsResponse> listPermissions(ListPermissionsRequest request);

    /**
     * @param request the request parameters of ListRoleUsers  ListRoleUsersRequest
     * @return ListRoleUsersResponse
     */
    CompletableFuture<ListRoleUsersResponse> listRoleUsers(ListRoleUsersRequest request);

    /**
     * @param request the request parameters of ListRoles  ListRolesRequest
     * @return ListRolesResponse
     */
    CompletableFuture<ListRolesResponse> listRoles(ListRolesRequest request);

    /**
     * @param request the request parameters of ListUserRoles  ListUserRolesRequest
     * @return ListUserRolesResponse
     */
    CompletableFuture<ListUserRolesResponse> listUserRoles(ListUserRolesRequest request);

    /**
     * @param request the request parameters of ListUsers  ListUsersRequest
     * @return ListUsersResponse
     */
    CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request);

    /**
     * @param request the request parameters of RevokeRoleFromUsers  RevokeRoleFromUsersRequest
     * @return RevokeRoleFromUsersResponse
     */
    CompletableFuture<RevokeRoleFromUsersResponse> revokeRoleFromUsers(RevokeRoleFromUsersRequest request);

    /**
     * @param request the request parameters of Subscribe  SubscribeRequest
     * @return SubscribeResponse
     */
    CompletableFuture<SubscribeResponse> subscribe(SubscribeRequest request);

    /**
     * @param request the request parameters of UpdateRole  UpdateRoleRequest
     * @return UpdateRoleResponse
     */
    CompletableFuture<UpdateRoleResponse> updateRole(UpdateRoleRequest request);

    /**
     * @param request the request parameters of UpdateRoleUsers  UpdateRoleUsersRequest
     * @return UpdateRoleUsersResponse
     */
    CompletableFuture<UpdateRoleUsersResponse> updateRoleUsers(UpdateRoleUsersRequest request);

}
