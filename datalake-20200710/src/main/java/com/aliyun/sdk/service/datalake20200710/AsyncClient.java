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

    CompletableFuture<BatchUpdatePartitionsResponse> batchUpdatePartitions(BatchUpdatePartitionsRequest request);

    CompletableFuture<BatchUpdateTablesResponse> batchUpdateTables(BatchUpdateTablesRequest request);

    CompletableFuture<CancelQueryResponse> cancelQuery(CancelQueryRequest request);

    CompletableFuture<CheckBlueprintInstanceNameResponse> checkBlueprintInstanceName(CheckBlueprintInstanceNameRequest request);

    CompletableFuture<CheckConnectionResponse> checkConnection(CheckConnectionRequest request);

    CompletableFuture<CheckConnectivityResponse> checkConnectivity(CheckConnectivityRequest request);

    CompletableFuture<CheckPermissionsResponse> checkPermissions(CheckPermissionsRequest request);

    CompletableFuture<CreateBlueprintInstanceResponse> createBlueprintInstance(CreateBlueprintInstanceRequest request);

    CompletableFuture<CreateDataSourceResponse> createDataSource(CreateDataSourceRequest request);

    CompletableFuture<CreateDatabaseResponse> createDatabase(CreateDatabaseRequest request);

    CompletableFuture<CreateFunctionResponse> createFunction(CreateFunctionRequest request);

    CompletableFuture<CreateLockResponse> createLock(CreateLockRequest request);

    CompletableFuture<CreateMetastoreCrawlerResponse> createMetastoreCrawler(CreateMetastoreCrawlerRequest request);

    CompletableFuture<CreateMetastoreMigrationResponse> createMetastoreMigration(CreateMetastoreMigrationRequest request);

    CompletableFuture<CreatePartitionResponse> createPartition(CreatePartitionRequest request);

    CompletableFuture<CreateSavedQueryResponse> createSavedQuery(CreateSavedQueryRequest request);

    CompletableFuture<CreateStorageCollectorResponse> createStorageCollector(CreateStorageCollectorRequest request);

    CompletableFuture<CreateTableResponse> createTable(CreateTableRequest request);

    CompletableFuture<CreateTpcdsDatabaseResponse> createTpcdsDatabase(CreateTpcdsDatabaseRequest request);

    CompletableFuture<CreateUserFeedbackResponse> createUserFeedback(CreateUserFeedbackRequest request);

    CompletableFuture<DeleteBlueprintInstanceResponse> deleteBlueprintInstance(DeleteBlueprintInstanceRequest request);

    CompletableFuture<DeleteDataSourceResponse> deleteDataSource(DeleteDataSourceRequest request);

    CompletableFuture<DeleteDatabaseResponse> deleteDatabase(DeleteDatabaseRequest request);

    CompletableFuture<DeleteFunctionResponse> deleteFunction(DeleteFunctionRequest request);

    CompletableFuture<DeleteMetastoreCrawlerResponse> deleteMetastoreCrawler(DeleteMetastoreCrawlerRequest request);

    CompletableFuture<DeleteMetastoreMigrationResponse> deleteMetastoreMigration(DeleteMetastoreMigrationRequest request);

    CompletableFuture<DeletePartitionResponse> deletePartition(DeletePartitionRequest request);

    CompletableFuture<DeletePartitionColumnStatisticsResponse> deletePartitionColumnStatistics(DeletePartitionColumnStatisticsRequest request);

    CompletableFuture<DeleteSavedQueryResponse> deleteSavedQuery(DeleteSavedQueryRequest request);

    CompletableFuture<DeleteTableResponse> deleteTable(DeleteTableRequest request);

    CompletableFuture<DeleteTableColumnStatisticsResponse> deleteTableColumnStatistics(DeleteTableColumnStatisticsRequest request);

    CompletableFuture<DeleteTableVersionResponse> deleteTableVersion(DeleteTableVersionRequest request);

    CompletableFuture<DescribeBlueprintInstanceResponse> describeBlueprintInstance(DescribeBlueprintInstanceRequest request);

    CompletableFuture<DescribeDataSourceResponse> describeDataSource(DescribeDataSourceRequest request);

    CompletableFuture<DescribeMetastoreCrawlerResponse> describeMetastoreCrawler(DescribeMetastoreCrawlerRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<ExportQueryResultResponse> exportQueryResult(ExportQueryResultRequest request);

    CompletableFuture<GetAsyncTaskStatusResponse> getAsyncTaskStatus(GetAsyncTaskStatusRequest request);

    CompletableFuture<GetBlueprintInstanceResponse> getBlueprintInstance(GetBlueprintInstanceRequest request);

    CompletableFuture<GetDataSourceResponse> getDataSource(GetDataSourceRequest request);

    CompletableFuture<GetDatabaseResponse> getDatabase(GetDatabaseRequest request);

    CompletableFuture<GetEtlResourceUsagesResponse> getEtlResourceUsages(GetEtlResourceUsagesRequest request);

    CompletableFuture<GetFunctionResponse> getFunction(GetFunctionRequest request);

    CompletableFuture<GetIndicatorDetailsResponse> getIndicatorDetails(GetIndicatorDetailsRequest request);

    CompletableFuture<GetLatestDateResponse> getLatestDate(GetLatestDateRequest request);

    CompletableFuture<GetLockResponse> getLock(GetLockRequest request);

    CompletableFuture<GetMetaDataApiCallUsagesResponse> getMetaDataApiCallUsages(GetMetaDataApiCallUsagesRequest request);

    CompletableFuture<GetMetaDataStorageUsagesResponse> getMetaDataStorageUsages(GetMetaDataStorageUsagesRequest request);

    CompletableFuture<GetMetastoreMigrationResponse> getMetastoreMigration(GetMetastoreMigrationRequest request);

    CompletableFuture<GetMigrationWorkflowInstanceLogInfoResponse> getMigrationWorkflowInstanceLogInfo(GetMigrationWorkflowInstanceLogInfoRequest request);

    CompletableFuture<GetPartitionResponse> getPartition(GetPartitionRequest request);

    CompletableFuture<GetPartitionColumnStatisticsResponse> getPartitionColumnStatistics(GetPartitionColumnStatisticsRequest request);

    CompletableFuture<GetQueryResultResponse> getQueryResult(GetQueryResultRequest request);

    CompletableFuture<GetRdsDBInstanceAttributeResponse> getRdsDBInstanceAttribute(GetRdsDBInstanceAttributeRequest request);

    CompletableFuture<GetRegionClusterInfoResponse> getRegionClusterInfo(GetRegionClusterInfoRequest request);

    CompletableFuture<GetRegionStatusResponse> getRegionStatus(GetRegionStatusRequest request);

    CompletableFuture<GetServiceStatusResponse> getServiceStatus(GetServiceStatusRequest request);

    CompletableFuture<GetStatisticsResponse> getStatistics(GetStatisticsRequest request);

    CompletableFuture<GetStorageAnalysisResponse> getStorageAnalysis(GetStorageAnalysisRequest request);

    CompletableFuture<GetStorageRankResponse> getStorageRank(GetStorageRankRequest request);

    CompletableFuture<GetTableResponse> getTable(GetTableRequest request);

    CompletableFuture<GetTableColumnStatisticsResponse> getTableColumnStatistics(GetTableColumnStatisticsRequest request);

    CompletableFuture<GetTableProfileResponse> getTableProfile(GetTableProfileRequest request);

    CompletableFuture<GetTableVersionResponse> getTableVersion(GetTableVersionRequest request);

    CompletableFuture<GetWorkflowInstanceResponse> getWorkflowInstance(GetWorkflowInstanceRequest request);

    CompletableFuture<ListBlueprintInstanceCreatorsResponse> listBlueprintInstanceCreators(ListBlueprintInstanceCreatorsRequest request);

    CompletableFuture<ListBlueprintInstancesResponse> listBlueprintInstances(ListBlueprintInstancesRequest request);

    CompletableFuture<ListCatalogsResponse> listCatalogs(ListCatalogsRequest request);

    CompletableFuture<ListCrawlerWorkflowInstanceResponse> listCrawlerWorkflowInstance(ListCrawlerWorkflowInstanceRequest request);

    CompletableFuture<ListDataSourcesResponse> listDataSources(ListDataSourcesRequest request);

    CompletableFuture<ListDatabasesResponse> listDatabases(ListDatabasesRequest request);

    CompletableFuture<ListFunctionNamesResponse> listFunctionNames(ListFunctionNamesRequest request);

    CompletableFuture<ListFunctionsResponse> listFunctions(ListFunctionsRequest request);

    CompletableFuture<ListMetastoreCrawlerResponse> listMetastoreCrawler(ListMetastoreCrawlerRequest request);

    CompletableFuture<ListMetastoreCrawlerCreatorsResponse> listMetastoreCrawlerCreators(ListMetastoreCrawlerCreatorsRequest request);

    CompletableFuture<ListMetastoreMigrationsResponse> listMetastoreMigrations(ListMetastoreMigrationsRequest request);

    CompletableFuture<ListMigrationWorkflowInstancesResponse> listMigrationWorkflowInstances(ListMigrationWorkflowInstancesRequest request);

    CompletableFuture<ListPartitionNamesResponse> listPartitionNames(ListPartitionNamesRequest request);

    CompletableFuture<ListPartitionsResponse> listPartitions(ListPartitionsRequest request);

    CompletableFuture<ListPartitionsByExprResponse> listPartitionsByExpr(ListPartitionsByExprRequest request);

    CompletableFuture<ListPartitionsByFilterResponse> listPartitionsByFilter(ListPartitionsByFilterRequest request);

    CompletableFuture<ListQueryHistoryResponse> listQueryHistory(ListQueryHistoryRequest request);

    CompletableFuture<ListRdsDBInstancesResponse> listRdsDBInstances(ListRdsDBInstancesRequest request);

    CompletableFuture<ListSavedQueryResponse> listSavedQuery(ListSavedQueryRequest request);

    CompletableFuture<ListStorageCollectorResponse> listStorageCollector(ListStorageCollectorRequest request);

    CompletableFuture<ListTableNamesResponse> listTableNames(ListTableNamesRequest request);

    CompletableFuture<ListTableVersionsResponse> listTableVersions(ListTableVersionsRequest request);

    CompletableFuture<ListTablesResponse> listTables(ListTablesRequest request);

    CompletableFuture<ListWorkflowInstantencesResponse> listWorkflowInstantences(ListWorkflowInstantencesRequest request);

    CompletableFuture<ListWorkspacesResponse> listWorkspaces(ListWorkspacesRequest request);

    CompletableFuture<ModifyMetastoreCrawlerResponse> modifyMetastoreCrawler(ModifyMetastoreCrawlerRequest request);

    CompletableFuture<ModifyWorkflowExecuteInfoResponse> modifyWorkflowExecuteInfo(ModifyWorkflowExecuteInfoRequest request);

    CompletableFuture<PreviewMetastoreCrawlerResponse> previewMetastoreCrawler(PreviewMetastoreCrawlerRequest request);

    CompletableFuture<RefreshLockResponse> refreshLock(RefreshLockRequest request);

    CompletableFuture<RefreshUserSessionResponse> refreshUserSession(RefreshUserSessionRequest request);

    CompletableFuture<RenamePartitionResponse> renamePartition(RenamePartitionRequest request);

    CompletableFuture<RenameTableResponse> renameTable(RenameTableRequest request);

    CompletableFuture<RunBlueprintInstanceWorkflowResponse> runBlueprintInstanceWorkflow(RunBlueprintInstanceWorkflowRequest request);

    CompletableFuture<RunCrawlerWorkflowResponse> runCrawlerWorkflow(RunCrawlerWorkflowRequest request);

    CompletableFuture<RunMigrationWorkflowResponse> runMigrationWorkflow(RunMigrationWorkflowRequest request);

    CompletableFuture<SearchResponse> search(SearchRequest request);

    CompletableFuture<StopBlueprintInstanceWorkflowResponse> stopBlueprintInstanceWorkflow(StopBlueprintInstanceWorkflowRequest request);

    CompletableFuture<StopCrawlerWorkflowResponse> stopCrawlerWorkflow(StopCrawlerWorkflowRequest request);

    CompletableFuture<StopMigrationWorkflowResponse> stopMigrationWorkflow(StopMigrationWorkflowRequest request);

    CompletableFuture<SubmitQueryResponse> submitQuery(SubmitQueryRequest request);

    CompletableFuture<UnLockResponse> unLock(UnLockRequest request);

    CompletableFuture<UpdateBlueprintInstanceResponse> updateBlueprintInstance(UpdateBlueprintInstanceRequest request);

    CompletableFuture<UpdateDataSourceResponse> updateDataSource(UpdateDataSourceRequest request);

    CompletableFuture<UpdateDatabaseResponse> updateDatabase(UpdateDatabaseRequest request);

    CompletableFuture<UpdateFunctionResponse> updateFunction(UpdateFunctionRequest request);

    CompletableFuture<UpdateMetastoreMigrationResponse> updateMetastoreMigration(UpdateMetastoreMigrationRequest request);

    CompletableFuture<UpdatePartitionColumnStatisticsResponse> updatePartitionColumnStatistics(UpdatePartitionColumnStatisticsRequest request);

    CompletableFuture<UpdateTableResponse> updateTable(UpdateTableRequest request);

    CompletableFuture<UpdateTableColumnStatisticsResponse> updateTableColumnStatistics(UpdateTableColumnStatisticsRequest request);

    CompletableFuture<UpdateWorkflowExecuteInfoResponse> updateWorkflowExecuteInfo(UpdateWorkflowExecuteInfoRequest request);

    CompletableFuture<UpdateWorkflowScheduleStatusResponse> updateWorkflowScheduleStatus(UpdateWorkflowScheduleStatusRequest request);

    CompletableFuture<UpdateWorkspaceConfigResponse> updateWorkspaceConfig(UpdateWorkspaceConfigRequest request);

}
