// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.opensearch20171225.models.*;
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

    CompletableFuture<BindESUserAnalyzerResponse> bindESUserAnalyzer(BindESUserAnalyzerRequest request);

    CompletableFuture<BindEsInstanceResponse> bindEsInstance(BindEsInstanceRequest request);

    CompletableFuture<CompileSortScriptResponse> compileSortScript(CompileSortScriptRequest request);

    CompletableFuture<CreateABTestExperimentResponse> createABTestExperiment(CreateABTestExperimentRequest request);

    CompletableFuture<CreateABTestGroupResponse> createABTestGroup(CreateABTestGroupRequest request);

    CompletableFuture<CreateABTestSceneResponse> createABTestScene(CreateABTestSceneRequest request);

    CompletableFuture<CreateAppResponse> createApp(CreateAppRequest request);

    CompletableFuture<CreateAppGroupResponse> createAppGroup(CreateAppGroupRequest request);

    CompletableFuture<CreateDataCollectionResponse> createDataCollection(CreateDataCollectionRequest request);

    CompletableFuture<CreateFirstRankResponse> createFirstRank(CreateFirstRankRequest request);

    CompletableFuture<CreateFunctionInstanceResponse> createFunctionInstance(CreateFunctionInstanceRequest request);

    CompletableFuture<CreateFunctionTaskResponse> createFunctionTask(CreateFunctionTaskRequest request);

    CompletableFuture<CreateInterventionDictionaryResponse> createInterventionDictionary(CreateInterventionDictionaryRequest request);

    CompletableFuture<CreateModelResponse> createModel(CreateModelRequest request);

    CompletableFuture<CreateQueryProcessorResponse> createQueryProcessor(CreateQueryProcessorRequest request);

    CompletableFuture<CreateScheduledTaskResponse> createScheduledTask(CreateScheduledTaskRequest request);

    CompletableFuture<CreateSearchStrategyResponse> createSearchStrategy(CreateSearchStrategyRequest request);

    CompletableFuture<CreateSecondRankResponse> createSecondRank(CreateSecondRankRequest request);

    CompletableFuture<CreateSortScriptResponse> createSortScript(CreateSortScriptRequest request);

    CompletableFuture<CreateUserAnalyzerResponse> createUserAnalyzer(CreateUserAnalyzerRequest request);

    CompletableFuture<DeleteABTestExperimentResponse> deleteABTestExperiment(DeleteABTestExperimentRequest request);

    CompletableFuture<DeleteABTestGroupResponse> deleteABTestGroup(DeleteABTestGroupRequest request);

    CompletableFuture<DeleteABTestSceneResponse> deleteABTestScene(DeleteABTestSceneRequest request);

    CompletableFuture<DeleteFunctionInstanceResponse> deleteFunctionInstance(DeleteFunctionInstanceRequest request);

    CompletableFuture<DeleteModelResponse> deleteModel(DeleteModelRequest request);

    CompletableFuture<DeleteSortScriptResponse> deleteSortScript(DeleteSortScriptRequest request);

    CompletableFuture<DeleteSortScriptFileResponse> deleteSortScriptFile(DeleteSortScriptFileRequest request);

    CompletableFuture<DescribeABTestExperimentResponse> describeABTestExperiment(DescribeABTestExperimentRequest request);

    CompletableFuture<DescribeABTestGroupResponse> describeABTestGroup(DescribeABTestGroupRequest request);

    CompletableFuture<DescribeABTestSceneResponse> describeABTestScene(DescribeABTestSceneRequest request);

    CompletableFuture<DescribeAppResponse> describeApp(DescribeAppRequest request);

    CompletableFuture<DescribeAppGroupResponse> describeAppGroup(DescribeAppGroupRequest request);

    CompletableFuture<DescribeAppGroupDataReportResponse> describeAppGroupDataReport(DescribeAppGroupDataReportRequest request);

    CompletableFuture<DescribeAppGroupStatisticsResponse> describeAppGroupStatistics(DescribeAppGroupStatisticsRequest request);

    CompletableFuture<DescribeAppStatisticsResponse> describeAppStatistics(DescribeAppStatisticsRequest request);

    CompletableFuture<DescribeAppsResponse> describeApps(DescribeAppsRequest request);

    CompletableFuture<DescribeDataCollctionResponse> describeDataCollction(DescribeDataCollctionRequest request);

    CompletableFuture<DescribeFirstRankResponse> describeFirstRank(DescribeFirstRankRequest request);

    CompletableFuture<DescribeInterventionDictionaryResponse> describeInterventionDictionary(DescribeInterventionDictionaryRequest request);

    CompletableFuture<DescribeModelResponse> describeModel(DescribeModelRequest request);

    CompletableFuture<DescribeQueryProcessorResponse> describeQueryProcessor(DescribeQueryProcessorRequest request);

    CompletableFuture<DescribeRegionResponse> describeRegion(DescribeRegionRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeScheduledTaskResponse> describeScheduledTask(DescribeScheduledTaskRequest request);

    CompletableFuture<DescribeSecondRankResponse> describeSecondRank(DescribeSecondRankRequest request);

    CompletableFuture<DescribeSlowQueryStatusResponse> describeSlowQueryStatus(DescribeSlowQueryStatusRequest request);

    CompletableFuture<DescribeUserAnalyzerResponse> describeUserAnalyzer(DescribeUserAnalyzerRequest request);

    CompletableFuture<DisableSlowQueryResponse> disableSlowQuery(DisableSlowQueryRequest request);

    CompletableFuture<EnableSlowQueryResponse> enableSlowQuery(EnableSlowQueryRequest request);

    CompletableFuture<GenerateMergedTableResponse> generateMergedTable(GenerateMergedTableRequest request);

    CompletableFuture<GetDomainResponse> getDomain(GetDomainRequest request);

    CompletableFuture<GetFunctionCurrentVersionResponse> getFunctionCurrentVersion(GetFunctionCurrentVersionRequest request);

    CompletableFuture<GetFunctionDefaultInstanceResponse> getFunctionDefaultInstance(GetFunctionDefaultInstanceRequest request);

    CompletableFuture<GetFunctionInstanceResponse> getFunctionInstance(GetFunctionInstanceRequest request);

    CompletableFuture<GetFunctionVersionResponse> getFunctionVersion(GetFunctionVersionRequest request);

    CompletableFuture<GetModelProgressResponse> getModelProgress(GetModelProgressRequest request);

    CompletableFuture<GetModelReportResponse> getModelReport(GetModelReportRequest request);

    CompletableFuture<GetScriptFileNamesResponse> getScriptFileNames(GetScriptFileNamesRequest request);

    CompletableFuture<GetSearchStrategyResponse> getSearchStrategy(GetSearchStrategyRequest request);

    CompletableFuture<GetSortScriptResponse> getSortScript(GetSortScriptRequest request);

    CompletableFuture<GetSortScriptFileResponse> getSortScriptFile(GetSortScriptFileRequest request);

    CompletableFuture<GetValidationErrorResponse> getValidationError(GetValidationErrorRequest request);

    CompletableFuture<GetValidationReportResponse> getValidationReport(GetValidationReportRequest request);

    CompletableFuture<ListABTestExperimentsResponse> listABTestExperiments(ListABTestExperimentsRequest request);

    CompletableFuture<ListABTestFixedFlowDividersResponse> listABTestFixedFlowDividers(ListABTestFixedFlowDividersRequest request);

    CompletableFuture<ListABTestGroupsResponse> listABTestGroups(ListABTestGroupsRequest request);

    CompletableFuture<ListABTestMetricsResponse> listABTestMetrics(ListABTestMetricsRequest request);

    CompletableFuture<ListABTestScenesResponse> listABTestScenes(ListABTestScenesRequest request);

    CompletableFuture<ListAppGroupErrorsResponse> listAppGroupErrors(ListAppGroupErrorsRequest request);

    CompletableFuture<ListAppGroupMetricsResponse> listAppGroupMetrics(ListAppGroupMetricsRequest request);

    CompletableFuture<ListAppGroupsResponse> listAppGroups(ListAppGroupsRequest request);

    CompletableFuture<ListAppsResponse> listApps(ListAppsRequest request);

    CompletableFuture<ListDataCollectionsResponse> listDataCollections(ListDataCollectionsRequest request);

    CompletableFuture<ListDataSourceTableFieldsResponse> listDataSourceTableFields(ListDataSourceTableFieldsRequest request);

    CompletableFuture<ListDataSourceTablesResponse> listDataSourceTables(ListDataSourceTablesRequest request);

    CompletableFuture<ListDeployedAlgorithmModelsResponse> listDeployedAlgorithmModels(ListDeployedAlgorithmModelsRequest request);

    CompletableFuture<ListFirstRanksResponse> listFirstRanks(ListFirstRanksRequest request);

    CompletableFuture<ListFunctionInstancesResponse> listFunctionInstances(ListFunctionInstancesRequest request);

    CompletableFuture<ListFunctionTasksResponse> listFunctionTasks(ListFunctionTasksRequest request);

    CompletableFuture<ListInterventionDictionariesResponse> listInterventionDictionaries(ListInterventionDictionariesRequest request);

    CompletableFuture<ListInterventionDictionaryEntriesResponse> listInterventionDictionaryEntries(ListInterventionDictionaryEntriesRequest request);

    CompletableFuture<ListInterventionDictionaryNerResultsResponse> listInterventionDictionaryNerResults(ListInterventionDictionaryNerResultsRequest request);

    CompletableFuture<ListInterventionDictionaryRelatedEntitiesResponse> listInterventionDictionaryRelatedEntities(ListInterventionDictionaryRelatedEntitiesRequest request);

    CompletableFuture<ListModelsResponse> listModels(ListModelsRequest request);

    CompletableFuture<ListProceedingsResponse> listProceedings(ListProceedingsRequest request);

    CompletableFuture<ListQueryProcessorAnalyzerResultsResponse> listQueryProcessorAnalyzerResults(ListQueryProcessorAnalyzerResultsRequest request);

    CompletableFuture<ListQueryProcessorNersResponse> listQueryProcessorNers(ListQueryProcessorNersRequest request);

    CompletableFuture<ListQueryProcessorsResponse> listQueryProcessors(ListQueryProcessorsRequest request);

    CompletableFuture<ListQuotaReviewTasksResponse> listQuotaReviewTasks(ListQuotaReviewTasksRequest request);

    CompletableFuture<ListRamRolesResponse> listRamRoles(ListRamRolesRequest request);

    CompletableFuture<ListScheduledTasksResponse> listScheduledTasks(ListScheduledTasksRequest request);

    CompletableFuture<ListSearchStrategiesResponse> listSearchStrategies(ListSearchStrategiesRequest request);

    CompletableFuture<ListSecondRanksResponse> listSecondRanks(ListSecondRanksRequest request);

    CompletableFuture<ListSlowQueryCategoriesResponse> listSlowQueryCategories(ListSlowQueryCategoriesRequest request);

    CompletableFuture<ListSlowQueryQueriesResponse> listSlowQueryQueries(ListSlowQueryQueriesRequest request);

    CompletableFuture<ListSortExpressionsResponse> listSortExpressions(ListSortExpressionsRequest request);

    CompletableFuture<ListSortScriptsResponse> listSortScripts(ListSortScriptsRequest request);

    CompletableFuture<ListStatisticLogsResponse> listStatisticLogs(ListStatisticLogsRequest request);

    CompletableFuture<ListStatisticReportResponse> listStatisticReport(ListStatisticReportRequest request);

    CompletableFuture<ListUserAnalyzerEntriesResponse> listUserAnalyzerEntries(ListUserAnalyzerEntriesRequest request);

    CompletableFuture<ListUserAnalyzersResponse> listUserAnalyzers(ListUserAnalyzersRequest request);

    CompletableFuture<ModifyAppGroupResponse> modifyAppGroup(ModifyAppGroupRequest request);

    CompletableFuture<ModifyAppGroupQuotaResponse> modifyAppGroupQuota(ModifyAppGroupQuotaRequest request);

    CompletableFuture<ModifyFirstRankResponse> modifyFirstRank(ModifyFirstRankRequest request);

    CompletableFuture<ModifyModelResponse> modifyModel(ModifyModelRequest request);

    CompletableFuture<ModifyQueryProcessorResponse> modifyQueryProcessor(ModifyQueryProcessorRequest request);

    CompletableFuture<ModifyScheduledTaskResponse> modifyScheduledTask(ModifyScheduledTaskRequest request);

    CompletableFuture<ModifySecondRankResponse> modifySecondRank(ModifySecondRankRequest request);

    CompletableFuture<PreviewModelResponse> previewModel(PreviewModelRequest request);

    CompletableFuture<PushInterventionDictionaryEntriesResponse> pushInterventionDictionaryEntries(PushInterventionDictionaryEntriesRequest request);

    CompletableFuture<PushUserAnalyzerEntriesResponse> pushUserAnalyzerEntries(PushUserAnalyzerEntriesRequest request);

    CompletableFuture<RankPreviewQueryResponse> rankPreviewQuery(RankPreviewQueryRequest request);

    CompletableFuture<ReleaseSortScriptResponse> releaseSortScript(ReleaseSortScriptRequest request);

    CompletableFuture<RemoveAppResponse> removeApp(RemoveAppRequest request);

    CompletableFuture<RemoveAppGroupResponse> removeAppGroup(RemoveAppGroupRequest request);

    CompletableFuture<RemoveDataCollectionResponse> removeDataCollection(RemoveDataCollectionRequest request);

    CompletableFuture<RemoveFirstRankResponse> removeFirstRank(RemoveFirstRankRequest request);

    CompletableFuture<RemoveInterventionDictionaryResponse> removeInterventionDictionary(RemoveInterventionDictionaryRequest request);

    CompletableFuture<RemoveQueryProcessorResponse> removeQueryProcessor(RemoveQueryProcessorRequest request);

    CompletableFuture<RemoveScheduledTaskResponse> removeScheduledTask(RemoveScheduledTaskRequest request);

    CompletableFuture<RemoveSearchStrategyResponse> removeSearchStrategy(RemoveSearchStrategyRequest request);

    CompletableFuture<RemoveSecondRankResponse> removeSecondRank(RemoveSecondRankRequest request);

    CompletableFuture<RemoveUserAnalyzerResponse> removeUserAnalyzer(RemoveUserAnalyzerRequest request);

    CompletableFuture<RenewAppGroupResponse> renewAppGroup(RenewAppGroupRequest request);

    CompletableFuture<ReplaceAppGroupCommodityCodeResponse> replaceAppGroupCommodityCode(ReplaceAppGroupCommodityCodeRequest request);

    CompletableFuture<SaveSortScriptFileResponse> saveSortScriptFile(SaveSortScriptFileRequest request);

    CompletableFuture<StartSlowQueryAnalyzerResponse> startSlowQueryAnalyzer(StartSlowQueryAnalyzerRequest request);

    CompletableFuture<TrainModelResponse> trainModel(TrainModelRequest request);

    CompletableFuture<UnbindESUserAnalyzerResponse> unbindESUserAnalyzer(UnbindESUserAnalyzerRequest request);

    CompletableFuture<UnbindEsInstanceResponse> unbindEsInstance(UnbindEsInstanceRequest request);

    CompletableFuture<UpdateABTestExperimentResponse> updateABTestExperiment(UpdateABTestExperimentRequest request);

    CompletableFuture<UpdateABTestFixedFlowDividersResponse> updateABTestFixedFlowDividers(UpdateABTestFixedFlowDividersRequest request);

    CompletableFuture<UpdateABTestGroupResponse> updateABTestGroup(UpdateABTestGroupRequest request);

    CompletableFuture<UpdateABTestSceneResponse> updateABTestScene(UpdateABTestSceneRequest request);

    CompletableFuture<UpdateFetchFieldsResponse> updateFetchFields(UpdateFetchFieldsRequest request);

    CompletableFuture<UpdateFunctionDefaultInstanceResponse> updateFunctionDefaultInstance(UpdateFunctionDefaultInstanceRequest request);

    CompletableFuture<UpdateFunctionInstanceResponse> updateFunctionInstance(UpdateFunctionInstanceRequest request);

    CompletableFuture<UpdateSearchStrategyResponse> updateSearchStrategy(UpdateSearchStrategyRequest request);

    CompletableFuture<UpdateSortScriptResponse> updateSortScript(UpdateSortScriptRequest request);

    CompletableFuture<UpdateSummariesResponse> updateSummaries(UpdateSummariesRequest request);

    CompletableFuture<ValidateDataSourcesResponse> validateDataSources(ValidateDataSourcesRequest request);

}
