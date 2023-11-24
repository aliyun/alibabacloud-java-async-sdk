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

    /**
      * *   When you create a standard application, a new version of the application is created if the specified application name already exists.
      * *   When you create a version of an existing application, you must specify the autoSwitch and realtimeShared parameters.
      * *   When you create a version of an existing application, the value of the quota parameter is the same as that of the quota parameter in the previous version of the application.
      * *   When you create a version of an existing application, the modification of the value of the quota parameter does not take effect.
      *
     */
    CompletableFuture<CreateAppResponse> createApp(CreateAppRequest request);

    CompletableFuture<CreateAppGroupResponse> createAppGroup(CreateAppGroupRequest request);

    CompletableFuture<CreateFirstRankResponse> createFirstRank(CreateFirstRankRequest request);

    /**
      * You can call the [GetFunctionCurrentVersion](~~421377~~) operation to query the latest version of the current feature. The response of the operation includes the createParameters parameter that is used to create an algorithm instance, the usageParameters parameter, and the requirements for setting these parameters.
      *
     */
    CompletableFuture<CreateFunctionInstanceResponse> createFunctionInstance(CreateFunctionInstanceRequest request);

    CompletableFuture<CreateFunctionResourceResponse> createFunctionResource(CreateFunctionResourceRequest request);

    CompletableFuture<CreateFunctionTaskResponse> createFunctionTask(CreateFunctionTaskRequest request);

    CompletableFuture<CreateInterventionDictionaryResponse> createInterventionDictionary(CreateInterventionDictionaryRequest request);

    CompletableFuture<CreateQueryProcessorResponse> createQueryProcessor(CreateQueryProcessorRequest request);

    CompletableFuture<CreateScheduledTaskResponse> createScheduledTask(CreateScheduledTaskRequest request);

    CompletableFuture<CreateSearchStrategyResponse> createSearchStrategy(CreateSearchStrategyRequest request);

    CompletableFuture<CreateSecondRankResponse> createSecondRank(CreateSecondRankRequest request);

    CompletableFuture<CreateSortScriptResponse> createSortScript(CreateSortScriptRequest request);

    /**
      * ## Debugging
      * [OpenAPI Explorer automatically calculates the signature value. For your convenience, we recommend that you call this operation in OpenAPI Explorer. OpenAPI Explorer dynamically generates the sample code of the operation for different SDKs.](https://api.aliyun.com/#product=OpenSearch\\&api=CreateUserAnalyzer\\&type=ROA\\&version=2017-12-25)
      *
     */
    CompletableFuture<CreateUserAnalyzerResponse> createUserAnalyzer(CreateUserAnalyzerRequest request);

    CompletableFuture<DeleteABTestExperimentResponse> deleteABTestExperiment(DeleteABTestExperimentRequest request);

    CompletableFuture<DeleteABTestGroupResponse> deleteABTestGroup(DeleteABTestGroupRequest request);

    CompletableFuture<DeleteABTestSceneResponse> deleteABTestScene(DeleteABTestSceneRequest request);

    CompletableFuture<DeleteFunctionInstanceResponse> deleteFunctionInstance(DeleteFunctionInstanceRequest request);

    CompletableFuture<DeleteFunctionResourceResponse> deleteFunctionResource(DeleteFunctionResourceRequest request);

    CompletableFuture<DeleteFunctionTaskResponse> deleteFunctionTask(DeleteFunctionTaskRequest request);

    CompletableFuture<DeleteSortScriptResponse> deleteSortScript(DeleteSortScriptRequest request);

    CompletableFuture<DeleteSortScriptFileResponse> deleteSortScriptFile(DeleteSortScriptFileRequest request);

    CompletableFuture<DescribeABTestExperimentResponse> describeABTestExperiment(DescribeABTestExperimentRequest request);

    CompletableFuture<DescribeABTestGroupResponse> describeABTestGroup(DescribeABTestGroupRequest request);

    CompletableFuture<DescribeABTestSceneResponse> describeABTestScene(DescribeABTestSceneRequest request);

    CompletableFuture<DescribeAppResponse> describeApp(DescribeAppRequest request);

    CompletableFuture<DescribeAppGroupResponse> describeAppGroup(DescribeAppGroupRequest request);

    CompletableFuture<DescribeAppStatisticsResponse> describeAppStatistics(DescribeAppStatisticsRequest request);

    CompletableFuture<DescribeAppsResponse> describeApps(DescribeAppsRequest request);

    CompletableFuture<DescribeDataCollctionResponse> describeDataCollction(DescribeDataCollctionRequest request);

    CompletableFuture<DescribeFirstRankResponse> describeFirstRank(DescribeFirstRankRequest request);

    CompletableFuture<DescribeInterventionDictionaryResponse> describeInterventionDictionary(DescribeInterventionDictionaryRequest request);

    CompletableFuture<DescribeQueryProcessorResponse> describeQueryProcessor(DescribeQueryProcessorRequest request);

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

    CompletableFuture<GetFunctionResourceResponse> getFunctionResource(GetFunctionResourceRequest request);

    CompletableFuture<GetFunctionTaskResponse> getFunctionTask(GetFunctionTaskRequest request);

    CompletableFuture<GetFunctionVersionResponse> getFunctionVersion(GetFunctionVersionRequest request);

    CompletableFuture<GetScriptFileNamesResponse> getScriptFileNames(GetScriptFileNamesRequest request);

    CompletableFuture<GetSearchStrategyResponse> getSearchStrategy(GetSearchStrategyRequest request);

    CompletableFuture<GetSortScriptResponse> getSortScript(GetSortScriptRequest request);

    CompletableFuture<GetSortScriptFileResponse> getSortScriptFile(GetSortScriptFileRequest request);

    CompletableFuture<ListABTestExperimentsResponse> listABTestExperiments(ListABTestExperimentsRequest request);

    CompletableFuture<ListABTestFixedFlowDividersResponse> listABTestFixedFlowDividers(ListABTestFixedFlowDividersRequest request);

    CompletableFuture<ListABTestGroupsResponse> listABTestGroups(ListABTestGroupsRequest request);

    CompletableFuture<ListABTestScenesResponse> listABTestScenes(ListABTestScenesRequest request);

    /**
      * *   This operation allows you to query applications by application name, instance ID, and application type.
      * *   This operation can sort the applications based on their creation time.
      * *   This operation supports the parameters for paging.
      *
     */
    CompletableFuture<ListAppGroupsResponse> listAppGroups(ListAppGroupsRequest request);

    CompletableFuture<ListDataCollectionsResponse> listDataCollections(ListDataCollectionsRequest request);

    CompletableFuture<ListDataSourceTableFieldsResponse> listDataSourceTableFields(ListDataSourceTableFieldsRequest request);

    CompletableFuture<ListDataSourceTablesResponse> listDataSourceTables(ListDataSourceTablesRequest request);

    CompletableFuture<ListFirstRanksResponse> listFirstRanks(ListFirstRanksRequest request);

    CompletableFuture<ListFunctionInstancesResponse> listFunctionInstances(ListFunctionInstancesRequest request);

    CompletableFuture<ListFunctionResourcesResponse> listFunctionResources(ListFunctionResourcesRequest request);

    CompletableFuture<ListFunctionTasksResponse> listFunctionTasks(ListFunctionTasksRequest request);

    CompletableFuture<ListInterventionDictionariesResponse> listInterventionDictionaries(ListInterventionDictionariesRequest request);

    CompletableFuture<ListInterventionDictionaryEntriesResponse> listInterventionDictionaryEntries(ListInterventionDictionaryEntriesRequest request);

    CompletableFuture<ListInterventionDictionaryNerResultsResponse> listInterventionDictionaryNerResults(ListInterventionDictionaryNerResultsRequest request);

    CompletableFuture<ListInterventionDictionaryRelatedEntitiesResponse> listInterventionDictionaryRelatedEntities(ListInterventionDictionaryRelatedEntitiesRequest request);

    CompletableFuture<ListProceedingsResponse> listProceedings(ListProceedingsRequest request);

    CompletableFuture<ListQueryProcessorAnalyzerResultsResponse> listQueryProcessorAnalyzerResults(ListQueryProcessorAnalyzerResultsRequest request);

    CompletableFuture<ListQueryProcessorNersResponse> listQueryProcessorNers(ListQueryProcessorNersRequest request);

    CompletableFuture<ListQueryProcessorsResponse> listQueryProcessors(ListQueryProcessorsRequest request);

    CompletableFuture<ListQuotaReviewTasksResponse> listQuotaReviewTasks(ListQuotaReviewTasksRequest request);

    CompletableFuture<ListScheduledTasksResponse> listScheduledTasks(ListScheduledTasksRequest request);

    CompletableFuture<ListSearchStrategiesResponse> listSearchStrategies(ListSearchStrategiesRequest request);

    CompletableFuture<ListSecondRanksResponse> listSecondRanks(ListSecondRanksRequest request);

    CompletableFuture<ListSlowQueryCategoriesResponse> listSlowQueryCategories(ListSlowQueryCategoriesRequest request);

    CompletableFuture<ListSlowQueryQueriesResponse> listSlowQueryQueries(ListSlowQueryQueriesRequest request);

    CompletableFuture<ListSortExpressionsResponse> listSortExpressions(ListSortExpressionsRequest request);

    CompletableFuture<ListSortScriptsResponse> listSortScripts(ListSortScriptsRequest request);

    CompletableFuture<ListStatisticLogsResponse> listStatisticLogs(ListStatisticLogsRequest request);

    CompletableFuture<ListStatisticReportResponse> listStatisticReport(ListStatisticReportRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ListUserAnalyzerEntriesResponse> listUserAnalyzerEntries(ListUserAnalyzerEntriesRequest request);

    CompletableFuture<ListUserAnalyzersResponse> listUserAnalyzers(ListUserAnalyzersRequest request);

    CompletableFuture<ModifyAppGroupResponse> modifyAppGroup(ModifyAppGroupRequest request);

    CompletableFuture<ModifyAppGroupQuotaResponse> modifyAppGroupQuota(ModifyAppGroupQuotaRequest request);

    CompletableFuture<ModifyFirstRankResponse> modifyFirstRank(ModifyFirstRankRequest request);

    CompletableFuture<ModifyQueryProcessorResponse> modifyQueryProcessor(ModifyQueryProcessorRequest request);

    CompletableFuture<ModifyScheduledTaskResponse> modifyScheduledTask(ModifyScheduledTaskRequest request);

    CompletableFuture<ModifySecondRankResponse> modifySecondRank(ModifySecondRankRequest request);

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

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
      * The ID of the request.
      *
     */
    CompletableFuture<UnbindESUserAnalyzerResponse> unbindESUserAnalyzer(UnbindESUserAnalyzerRequest request);

    CompletableFuture<UnbindEsInstanceResponse> unbindEsInstance(UnbindEsInstanceRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpdateABTestExperimentResponse> updateABTestExperiment(UpdateABTestExperimentRequest request);

    CompletableFuture<UpdateABTestFixedFlowDividersResponse> updateABTestFixedFlowDividers(UpdateABTestFixedFlowDividersRequest request);

    CompletableFuture<UpdateABTestGroupResponse> updateABTestGroup(UpdateABTestGroupRequest request);

    CompletableFuture<UpdateABTestSceneResponse> updateABTestScene(UpdateABTestSceneRequest request);

    CompletableFuture<UpdateFetchFieldsResponse> updateFetchFields(UpdateFetchFieldsRequest request);

    CompletableFuture<UpdateFunctionDefaultInstanceResponse> updateFunctionDefaultInstance(UpdateFunctionDefaultInstanceRequest request);

    CompletableFuture<UpdateFunctionInstanceResponse> updateFunctionInstance(UpdateFunctionInstanceRequest request);

    CompletableFuture<UpdateFunctionResourceResponse> updateFunctionResource(UpdateFunctionResourceRequest request);

    CompletableFuture<UpdateSearchStrategyResponse> updateSearchStrategy(UpdateSearchStrategyRequest request);

    /**
      * You can call this operation to modify the description of a sort script.
      *
     */
    CompletableFuture<UpdateSortScriptResponse> updateSortScript(UpdateSortScriptRequest request);

    CompletableFuture<UpdateSummariesResponse> updateSummaries(UpdateSummariesRequest request);

    CompletableFuture<ValidateDataSourcesResponse> validateDataSources(ValidateDataSourcesRequest request);

}
