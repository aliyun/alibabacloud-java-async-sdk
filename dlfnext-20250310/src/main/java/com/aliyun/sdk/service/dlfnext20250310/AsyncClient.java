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
     * @param request the request parameters of AlterDatabase  AlterDatabaseRequest
     * @return AlterDatabaseResponse
     */
    CompletableFuture<AlterDatabaseResponse> alterDatabase(AlterDatabaseRequest request);

    /**
     * @param request the request parameters of AlterReceiver  AlterReceiverRequest
     * @return AlterReceiverResponse
     */
    CompletableFuture<AlterReceiverResponse> alterReceiver(AlterReceiverRequest request);

    /**
     * @param request the request parameters of AlterShare  AlterShareRequest
     * @return AlterShareResponse
     */
    CompletableFuture<AlterShareResponse> alterShare(AlterShareRequest request);

    /**
     * @param request the request parameters of AlterShareReceivers  AlterShareReceiversRequest
     * @return AlterShareReceiversResponse
     */
    CompletableFuture<AlterShareReceiversResponse> alterShareReceivers(AlterShareReceiversRequest request);

    /**
     * @param request the request parameters of AlterShareResources  AlterShareResourcesRequest
     * @return AlterShareResourcesResponse
     */
    CompletableFuture<AlterShareResourcesResponse> alterShareResources(AlterShareResourcesRequest request);

    /**
     * @param request the request parameters of AlterTable  AlterTableRequest
     * @return AlterTableResponse
     */
    CompletableFuture<AlterTableResponse> alterTable(AlterTableRequest request);

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
     * @param request the request parameters of CreateDatabase  CreateDatabaseRequest
     * @return CreateDatabaseResponse
     */
    CompletableFuture<CreateDatabaseResponse> createDatabase(CreateDatabaseRequest request);

    /**
     * @param request the request parameters of CreateReceiver  CreateReceiverRequest
     * @return CreateReceiverResponse
     */
    CompletableFuture<CreateReceiverResponse> createReceiver(CreateReceiverRequest request);

    /**
     * @param request the request parameters of CreateRole  CreateRoleRequest
     * @return CreateRoleResponse
     */
    CompletableFuture<CreateRoleResponse> createRole(CreateRoleRequest request);

    /**
     * @param request the request parameters of CreateShare  CreateShareRequest
     * @return CreateShareResponse
     */
    CompletableFuture<CreateShareResponse> createShare(CreateShareRequest request);

    /**
     * @param request the request parameters of CreateTable  CreateTableRequest
     * @return CreateTableResponse
     */
    CompletableFuture<CreateTableResponse> createTable(CreateTableRequest request);

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
     * @param request the request parameters of DropDatabase  DropDatabaseRequest
     * @return DropDatabaseResponse
     */
    CompletableFuture<DropDatabaseResponse> dropDatabase(DropDatabaseRequest request);

    /**
     * @param request the request parameters of DropReceiver  DropReceiverRequest
     * @return DropReceiverResponse
     */
    CompletableFuture<DropReceiverResponse> dropReceiver(DropReceiverRequest request);

    /**
     * @param request the request parameters of DropShare  DropShareRequest
     * @return DropShareResponse
     */
    CompletableFuture<DropShareResponse> dropShare(DropShareRequest request);

    /**
     * @param request the request parameters of DropTable  DropTableRequest
     * @return DropTableResponse
     */
    CompletableFuture<DropTableResponse> dropTable(DropTableRequest request);

    /**
     * @param request the request parameters of GetCatalog  GetCatalogRequest
     * @return GetCatalogResponse
     */
    CompletableFuture<GetCatalogResponse> getCatalog(GetCatalogRequest request);

    /**
     * @param request the request parameters of GetCatalogById  GetCatalogByIdRequest
     * @return GetCatalogByIdResponse
     */
    CompletableFuture<GetCatalogByIdResponse> getCatalogById(GetCatalogByIdRequest request);

    /**
     * @param request the request parameters of GetCatalogSummary  GetCatalogSummaryRequest
     * @return GetCatalogSummaryResponse
     */
    CompletableFuture<GetCatalogSummaryResponse> getCatalogSummary(GetCatalogSummaryRequest request);

    /**
     * @param request the request parameters of GetCatalogSummaryTrend  GetCatalogSummaryTrendRequest
     * @return GetCatalogSummaryTrendResponse
     */
    CompletableFuture<GetCatalogSummaryTrendResponse> getCatalogSummaryTrend(GetCatalogSummaryTrendRequest request);

    /**
     * @param request the request parameters of GetCatalogToken  GetCatalogTokenRequest
     * @return GetCatalogTokenResponse
     */
    CompletableFuture<GetCatalogTokenResponse> getCatalogToken(GetCatalogTokenRequest request);

    /**
     * @param request the request parameters of GetDatabase  GetDatabaseRequest
     * @return GetDatabaseResponse
     */
    CompletableFuture<GetDatabaseResponse> getDatabase(GetDatabaseRequest request);

    /**
     * @param request the request parameters of GetDatabaseSummary  GetDatabaseSummaryRequest
     * @return GetDatabaseSummaryResponse
     */
    CompletableFuture<GetDatabaseSummaryResponse> getDatabaseSummary(GetDatabaseSummaryRequest request);

    /**
     * @param request the request parameters of GetIcebergNamespace  GetIcebergNamespaceRequest
     * @return GetIcebergNamespaceResponse
     */
    CompletableFuture<GetIcebergNamespaceResponse> getIcebergNamespace(GetIcebergNamespaceRequest request);

    /**
     * @param request the request parameters of GetIcebergTable  GetIcebergTableRequest
     * @return GetIcebergTableResponse
     */
    CompletableFuture<GetIcebergTableResponse> getIcebergTable(GetIcebergTableRequest request);

    /**
     * @param request the request parameters of GetReceiver  GetReceiverRequest
     * @return GetReceiverResponse
     */
    CompletableFuture<GetReceiverResponse> getReceiver(GetReceiverRequest request);

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
     * @param request the request parameters of GetShare  GetShareRequest
     * @return GetShareResponse
     */
    CompletableFuture<GetShareResponse> getShare(GetShareRequest request);

    /**
     * @param request the request parameters of GetTable  GetTableRequest
     * @return GetTableResponse
     */
    CompletableFuture<GetTableResponse> getTable(GetTableRequest request);

    /**
     * @param request the request parameters of GetTableCompaction  GetTableCompactionRequest
     * @return GetTableCompactionResponse
     */
    CompletableFuture<GetTableCompactionResponse> getTableCompaction(GetTableCompactionRequest request);

    /**
     * @param request the request parameters of GetTableSnapshot  GetTableSnapshotRequest
     * @return GetTableSnapshotResponse
     */
    CompletableFuture<GetTableSnapshotResponse> getTableSnapshot(GetTableSnapshotRequest request);

    /**
     * @param request the request parameters of GetTableSummary  GetTableSummaryRequest
     * @return GetTableSummaryResponse
     */
    CompletableFuture<GetTableSummaryResponse> getTableSummary(GetTableSummaryRequest request);

    /**
     * @param request the request parameters of GetTableToken  GetTableTokenRequest
     * @return GetTableTokenResponse
     */
    CompletableFuture<GetTableTokenResponse> getTableToken(GetTableTokenRequest request);

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
     * @param request the request parameters of ListDatabaseDetails  ListDatabaseDetailsRequest
     * @return ListDatabaseDetailsResponse
     */
    CompletableFuture<ListDatabaseDetailsResponse> listDatabaseDetails(ListDatabaseDetailsRequest request);

    /**
     * @param request the request parameters of ListDatabases  ListDatabasesRequest
     * @return ListDatabasesResponse
     */
    CompletableFuture<ListDatabasesResponse> listDatabases(ListDatabasesRequest request);

    /**
     * @param request the request parameters of ListIcebergNamespaceDetails  ListIcebergNamespaceDetailsRequest
     * @return ListIcebergNamespaceDetailsResponse
     */
    CompletableFuture<ListIcebergNamespaceDetailsResponse> listIcebergNamespaceDetails(ListIcebergNamespaceDetailsRequest request);

    /**
     * @param request the request parameters of ListIcebergSnapshots  ListIcebergSnapshotsRequest
     * @return ListIcebergSnapshotsResponse
     */
    CompletableFuture<ListIcebergSnapshotsResponse> listIcebergSnapshots(ListIcebergSnapshotsRequest request);

    /**
     * @param request the request parameters of ListIcebergTableDetails  ListIcebergTableDetailsRequest
     * @return ListIcebergTableDetailsResponse
     */
    CompletableFuture<ListIcebergTableDetailsResponse> listIcebergTableDetails(ListIcebergTableDetailsRequest request);

    /**
     * @param request the request parameters of ListPartitionSummaries  ListPartitionSummariesRequest
     * @return ListPartitionSummariesResponse
     */
    CompletableFuture<ListPartitionSummariesResponse> listPartitionSummaries(ListPartitionSummariesRequest request);

    /**
     * @param request the request parameters of ListPartitions  ListPartitionsRequest
     * @return ListPartitionsResponse
     */
    CompletableFuture<ListPartitionsResponse> listPartitions(ListPartitionsRequest request);

    /**
     * @param request the request parameters of ListPermissions  ListPermissionsRequest
     * @return ListPermissionsResponse
     */
    CompletableFuture<ListPermissionsResponse> listPermissions(ListPermissionsRequest request);

    /**
     * @param request the request parameters of ListProvidedShares  ListProvidedSharesRequest
     * @return ListProvidedSharesResponse
     */
    CompletableFuture<ListProvidedSharesResponse> listProvidedShares(ListProvidedSharesRequest request);

    /**
     * @param request the request parameters of ListReceivedShares  ListReceivedSharesRequest
     * @return ListReceivedSharesResponse
     */
    CompletableFuture<ListReceivedSharesResponse> listReceivedShares(ListReceivedSharesRequest request);

    /**
     * @param request the request parameters of ListReceivers  ListReceiversRequest
     * @return ListReceiversResponse
     */
    CompletableFuture<ListReceiversResponse> listReceivers(ListReceiversRequest request);

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
     * @param request the request parameters of ListShareReceivers  ListShareReceiversRequest
     * @return ListShareReceiversResponse
     */
    CompletableFuture<ListShareReceiversResponse> listShareReceivers(ListShareReceiversRequest request);

    /**
     * @param request the request parameters of ListShareResources  ListShareResourcesRequest
     * @return ListShareResourcesResponse
     */
    CompletableFuture<ListShareResourcesResponse> listShareResources(ListShareResourcesRequest request);

    /**
     * @param request the request parameters of ListSnapshots  ListSnapshotsRequest
     * @return ListSnapshotsResponse
     */
    CompletableFuture<ListSnapshotsResponse> listSnapshots(ListSnapshotsRequest request);

    /**
     * @param request the request parameters of ListTableDetails  ListTableDetailsRequest
     * @return ListTableDetailsResponse
     */
    CompletableFuture<ListTableDetailsResponse> listTableDetails(ListTableDetailsRequest request);

    /**
     * @param request the request parameters of ListTables  ListTablesRequest
     * @return ListTablesResponse
     */
    CompletableFuture<ListTablesResponse> listTables(ListTablesRequest request);

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
     * @param request the request parameters of RefreshUserSync  RefreshUserSyncRequest
     * @return RefreshUserSyncResponse
     */
    CompletableFuture<RefreshUserSyncResponse> refreshUserSync(RefreshUserSyncRequest request);

    /**
     * @param request the request parameters of RevokeRoleFromUsers  RevokeRoleFromUsersRequest
     * @return RevokeRoleFromUsersResponse
     */
    CompletableFuture<RevokeRoleFromUsersResponse> revokeRoleFromUsers(RevokeRoleFromUsersRequest request);

    /**
     * @param request the request parameters of RollbackTable  RollbackTableRequest
     * @return RollbackTableResponse
     */
    CompletableFuture<RollbackTableResponse> rollbackTable(RollbackTableRequest request);

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
