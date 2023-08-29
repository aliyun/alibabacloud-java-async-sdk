// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.datalake20200710.models.*;
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

    CompletableFuture<AbortLockResponse> abortLock(AbortLockRequest request);

    CompletableFuture<BatchCreatePartitionsResponse> batchCreatePartitions(BatchCreatePartitionsRequest request);

    CompletableFuture<BatchCreateTablesResponse> batchCreateTables(BatchCreateTablesRequest request);

    CompletableFuture<BatchDeletePartitionsResponse> batchDeletePartitions(BatchDeletePartitionsRequest request);

    CompletableFuture<BatchDeleteTableVersionsResponse> batchDeleteTableVersions(BatchDeleteTableVersionsRequest request);

    CompletableFuture<BatchDeleteTablesResponse> batchDeleteTables(BatchDeleteTablesRequest request);

    CompletableFuture<BatchGetPartitionColumnStatisticsResponse> batchGetPartitionColumnStatistics(BatchGetPartitionColumnStatisticsRequest request);

    CompletableFuture<BatchGetPartitionsResponse> batchGetPartitions(BatchGetPartitionsRequest request);

    CompletableFuture<BatchGetTablesResponse> batchGetTables(BatchGetTablesRequest request);

    CompletableFuture<BatchGrantPermissionsResponse> batchGrantPermissions(BatchGrantPermissionsRequest request);

    CompletableFuture<BatchRevokePermissionsResponse> batchRevokePermissions(BatchRevokePermissionsRequest request);

    CompletableFuture<BatchUpdatePartitionsResponse> batchUpdatePartitions(BatchUpdatePartitionsRequest request);

    CompletableFuture<BatchUpdateTablesResponse> batchUpdateTables(BatchUpdateTablesRequest request);

    CompletableFuture<CancelQueryResponse> cancelQuery(CancelQueryRequest request);

    CompletableFuture<CheckPermissionsResponse> checkPermissions(CheckPermissionsRequest request);

    CompletableFuture<CreateCatalogResponse> createCatalog(CreateCatalogRequest request);

    CompletableFuture<CreateDatabaseResponse> createDatabase(CreateDatabaseRequest request);

    CompletableFuture<CreateFunctionResponse> createFunction(CreateFunctionRequest request);

    CompletableFuture<CreateLockResponse> createLock(CreateLockRequest request);

    CompletableFuture<CreatePartitionResponse> createPartition(CreatePartitionRequest request);

    CompletableFuture<CreateRoleResponse> createRole(CreateRoleRequest request);

    CompletableFuture<CreateTableResponse> createTable(CreateTableRequest request);

    CompletableFuture<DeleteCatalogResponse> deleteCatalog(DeleteCatalogRequest request);

    CompletableFuture<DeleteDatabaseResponse> deleteDatabase(DeleteDatabaseRequest request);

    CompletableFuture<DeleteFunctionResponse> deleteFunction(DeleteFunctionRequest request);

    CompletableFuture<DeletePartitionResponse> deletePartition(DeletePartitionRequest request);

    CompletableFuture<DeletePartitionColumnStatisticsResponse> deletePartitionColumnStatistics(DeletePartitionColumnStatisticsRequest request);

    CompletableFuture<DeleteRoleResponse> deleteRole(DeleteRoleRequest request);

    CompletableFuture<DeleteTableResponse> deleteTable(DeleteTableRequest request);

    CompletableFuture<DeleteTableColumnStatisticsResponse> deleteTableColumnStatistics(DeleteTableColumnStatisticsRequest request);

    CompletableFuture<DeleteTableVersionResponse> deleteTableVersion(DeleteTableVersionRequest request);

    CompletableFuture<DeregisterLocationResponse> deregisterLocation(DeregisterLocationRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<GetAsyncTaskStatusResponse> getAsyncTaskStatus(GetAsyncTaskStatusRequest request);

    CompletableFuture<GetCatalogResponse> getCatalog(GetCatalogRequest request);

    CompletableFuture<GetCatalogSettingsResponse> getCatalogSettings(GetCatalogSettingsRequest request);

    CompletableFuture<GetDatabaseResponse> getDatabase(GetDatabaseRequest request);

    CompletableFuture<GetFunctionResponse> getFunction(GetFunctionRequest request);

    CompletableFuture<GetLifecycleRuleResponse> getLifecycleRule(GetLifecycleRuleRequest request);

    CompletableFuture<GetLockResponse> getLock(GetLockRequest request);

    CompletableFuture<GetPartitionResponse> getPartition(GetPartitionRequest request);

    CompletableFuture<GetPartitionColumnStatisticsResponse> getPartitionColumnStatistics(GetPartitionColumnStatisticsRequest request);

    CompletableFuture<GetQueryResultResponse> getQueryResult(GetQueryResultRequest request);

    CompletableFuture<GetRegionStatusResponse> getRegionStatus(GetRegionStatusRequest request);

    CompletableFuture<GetRoleResponse> getRole(GetRoleRequest request);

    CompletableFuture<GetServiceStatusResponse> getServiceStatus(GetServiceStatusRequest request);

    CompletableFuture<GetTableResponse> getTable(GetTableRequest request);

    CompletableFuture<GetTableColumnStatisticsResponse> getTableColumnStatistics(GetTableColumnStatisticsRequest request);

    CompletableFuture<GetTableProfileResponse> getTableProfile(GetTableProfileRequest request);

    CompletableFuture<GetTableVersionResponse> getTableVersion(GetTableVersionRequest request);

    CompletableFuture<GrantPermissionsResponse> grantPermissions(GrantPermissionsRequest request);

    CompletableFuture<GrantRoleToUsersResponse> grantRoleToUsers(GrantRoleToUsersRequest request);

    CompletableFuture<GrantRolesToUserResponse> grantRolesToUser(GrantRolesToUserRequest request);

    CompletableFuture<ListCatalogsResponse> listCatalogs(ListCatalogsRequest request);

    CompletableFuture<ListDatabasesResponse> listDatabases(ListDatabasesRequest request);

    CompletableFuture<ListFunctionNamesResponse> listFunctionNames(ListFunctionNamesRequest request);

    CompletableFuture<ListFunctionsResponse> listFunctions(ListFunctionsRequest request);

    CompletableFuture<ListPartitionNamesResponse> listPartitionNames(ListPartitionNamesRequest request);

    CompletableFuture<ListPartitionsResponse> listPartitions(ListPartitionsRequest request);

    CompletableFuture<ListPartitionsByExprResponse> listPartitionsByExpr(ListPartitionsByExprRequest request);

    CompletableFuture<ListPartitionsByFilterResponse> listPartitionsByFilter(ListPartitionsByFilterRequest request);

    CompletableFuture<ListPermissionsResponse> listPermissions(ListPermissionsRequest request);

    CompletableFuture<ListRoleUsersResponse> listRoleUsers(ListRoleUsersRequest request);

    CompletableFuture<ListRolesResponse> listRoles(ListRolesRequest request);

    CompletableFuture<ListTableNamesResponse> listTableNames(ListTableNamesRequest request);

    CompletableFuture<ListTableVersionsResponse> listTableVersions(ListTableVersionsRequest request);

    CompletableFuture<ListTablesResponse> listTables(ListTablesRequest request);

    CompletableFuture<ListUserRolesResponse> listUserRoles(ListUserRolesRequest request);

    CompletableFuture<RefreshLockResponse> refreshLock(RefreshLockRequest request);

    CompletableFuture<RegisterLocationResponse> registerLocation(RegisterLocationRequest request);

    CompletableFuture<RenamePartitionResponse> renamePartition(RenamePartitionRequest request);

    CompletableFuture<RenameTableResponse> renameTable(RenameTableRequest request);

    CompletableFuture<RevokePermissionsResponse> revokePermissions(RevokePermissionsRequest request);

    CompletableFuture<RevokeRoleFromUsersResponse> revokeRoleFromUsers(RevokeRoleFromUsersRequest request);

    CompletableFuture<RevokeRolesFromUserResponse> revokeRolesFromUser(RevokeRolesFromUserRequest request);

    CompletableFuture<RunMigrationWorkflowResponse> runMigrationWorkflow(RunMigrationWorkflowRequest request);

    CompletableFuture<SearchResponse> search(SearchRequest request);

    CompletableFuture<SearchAcrossCatalogResponse> searchAcrossCatalog(SearchAcrossCatalogRequest request);

    CompletableFuture<StopMigrationWorkflowResponse> stopMigrationWorkflow(StopMigrationWorkflowRequest request);

    CompletableFuture<SubmitQueryResponse> submitQuery(SubmitQueryRequest request);

    CompletableFuture<UnLockResponse> unLock(UnLockRequest request);

    CompletableFuture<UpdateCatalogResponse> updateCatalog(UpdateCatalogRequest request);

    CompletableFuture<UpdateCatalogSettingsResponse> updateCatalogSettings(UpdateCatalogSettingsRequest request);

    CompletableFuture<UpdateDatabaseResponse> updateDatabase(UpdateDatabaseRequest request);

    CompletableFuture<UpdateFunctionResponse> updateFunction(UpdateFunctionRequest request);

    CompletableFuture<UpdatePartitionColumnStatisticsResponse> updatePartitionColumnStatistics(UpdatePartitionColumnStatisticsRequest request);

    CompletableFuture<UpdatePermissionsResponse> updatePermissions(UpdatePermissionsRequest request);

    CompletableFuture<UpdateRegisteredLocationResponse> updateRegisteredLocation(UpdateRegisteredLocationRequest request);

    CompletableFuture<UpdateRoleResponse> updateRole(UpdateRoleRequest request);

    CompletableFuture<UpdateRoleUsersResponse> updateRoleUsers(UpdateRoleUsersRequest request);

    CompletableFuture<UpdateTableResponse> updateTable(UpdateTableRequest request);

    CompletableFuture<UpdateTableColumnStatisticsResponse> updateTableColumnStatistics(UpdateTableColumnStatisticsRequest request);

}
