// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.opensearch20171225.models.*;
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
     * @param request the request parameters of BindESUserAnalyzer  BindESUserAnalyzerRequest
     * @return BindESUserAnalyzerResponse
     */
    CompletableFuture<BindESUserAnalyzerResponse> bindESUserAnalyzer(BindESUserAnalyzerRequest request);

    /**
     * @param request the request parameters of BindEsInstance  BindEsInstanceRequest
     * @return BindEsInstanceResponse
     */
    CompletableFuture<BindEsInstanceResponse> bindEsInstance(BindEsInstanceRequest request);

    /**
     * @param request the request parameters of CompileSortScript  CompileSortScriptRequest
     * @return CompileSortScriptResponse
     */
    CompletableFuture<CompileSortScriptResponse> compileSortScript(CompileSortScriptRequest request);

    /**
     * @param request the request parameters of CreateABTestExperiment  CreateABTestExperimentRequest
     * @return CreateABTestExperimentResponse
     */
    CompletableFuture<CreateABTestExperimentResponse> createABTestExperiment(CreateABTestExperimentRequest request);

    /**
     * @param request the request parameters of CreateABTestGroup  CreateABTestGroupRequest
     * @return CreateABTestGroupResponse
     */
    CompletableFuture<CreateABTestGroupResponse> createABTestGroup(CreateABTestGroupRequest request);

    /**
     * @param request the request parameters of CreateABTestScene  CreateABTestSceneRequest
     * @return CreateABTestSceneResponse
     */
    CompletableFuture<CreateABTestSceneResponse> createABTestScene(CreateABTestSceneRequest request);

    /**
     * <b>description</b> :
     * <p>  When you create a standard application, a new version of the application is created if the specified application name already exists.</p>
     * <ul>
     * <li>When you create a version of an existing application, you must specify the autoSwitch and realtimeShared parameters.</li>
     * <li>When you create a version of an existing application, the value of the quota parameter is the same as that of the quota parameter in the previous version of the application.</li>
     * <li>When you create a version of an existing application, the modification of the value of the quota parameter does not take effect.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateApp  CreateAppRequest
     * @return CreateAppResponse
     */
    CompletableFuture<CreateAppResponse> createApp(CreateAppRequest request);

    /**
     * @param request the request parameters of CreateAppGroup  CreateAppGroupRequest
     * @return CreateAppGroupResponse
     */
    CompletableFuture<CreateAppGroupResponse> createAppGroup(CreateAppGroupRequest request);

    /**
     * @param request the request parameters of CreateAppGroupCredentials  CreateAppGroupCredentialsRequest
     * @return CreateAppGroupCredentialsResponse
     */
    CompletableFuture<CreateAppGroupCredentialsResponse> createAppGroupCredentials(CreateAppGroupCredentialsRequest request);

    /**
     * @param request the request parameters of CreateFirstRank  CreateFirstRankRequest
     * @return CreateFirstRankResponse
     */
    CompletableFuture<CreateFirstRankResponse> createFirstRank(CreateFirstRankRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/421377.html">GetFunctionCurrentVersion</a> operation to query the latest version of a feature. The response of the operation includes the createParameters parameter that is used to create an algorithm instance, the usageParameters parameter, and the requirements for setting these parameters.</p>
     * 
     * @param request the request parameters of CreateFunctionInstance  CreateFunctionInstanceRequest
     * @return CreateFunctionInstanceResponse
     */
    CompletableFuture<CreateFunctionInstanceResponse> createFunctionInstance(CreateFunctionInstanceRequest request);

    /**
     * @param request the request parameters of CreateFunctionResource  CreateFunctionResourceRequest
     * @return CreateFunctionResourceResponse
     */
    CompletableFuture<CreateFunctionResourceResponse> createFunctionResource(CreateFunctionResourceRequest request);

    /**
     * @param request the request parameters of CreateFunctionTask  CreateFunctionTaskRequest
     * @return CreateFunctionTaskResponse
     */
    CompletableFuture<CreateFunctionTaskResponse> createFunctionTask(CreateFunctionTaskRequest request);

    /**
     * @param request the request parameters of CreateInterventionDictionary  CreateInterventionDictionaryRequest
     * @return CreateInterventionDictionaryResponse
     */
    CompletableFuture<CreateInterventionDictionaryResponse> createInterventionDictionary(CreateInterventionDictionaryRequest request);

    /**
     * @param request the request parameters of CreateQueryProcessor  CreateQueryProcessorRequest
     * @return CreateQueryProcessorResponse
     */
    CompletableFuture<CreateQueryProcessorResponse> createQueryProcessor(CreateQueryProcessorRequest request);

    /**
     * @param request the request parameters of CreateScheduledTask  CreateScheduledTaskRequest
     * @return CreateScheduledTaskResponse
     */
    CompletableFuture<CreateScheduledTaskResponse> createScheduledTask(CreateScheduledTaskRequest request);

    /**
     * @param request the request parameters of CreateSearchStrategy  CreateSearchStrategyRequest
     * @return CreateSearchStrategyResponse
     */
    CompletableFuture<CreateSearchStrategyResponse> createSearchStrategy(CreateSearchStrategyRequest request);

    /**
     * @param request the request parameters of CreateSecondRank  CreateSecondRankRequest
     * @return CreateSecondRankResponse
     */
    CompletableFuture<CreateSecondRankResponse> createSecondRank(CreateSecondRankRequest request);

    /**
     * @param request the request parameters of CreateSortScript  CreateSortScriptRequest
     * @return CreateSortScriptResponse
     */
    CompletableFuture<CreateSortScriptResponse> createSortScript(CreateSortScriptRequest request);

    /**
     * @param request the request parameters of CreateUserAnalyzer  CreateUserAnalyzerRequest
     * @return CreateUserAnalyzerResponse
     */
    CompletableFuture<CreateUserAnalyzerResponse> createUserAnalyzer(CreateUserAnalyzerRequest request);

    /**
     * @param request the request parameters of DeleteABTestExperiment  DeleteABTestExperimentRequest
     * @return DeleteABTestExperimentResponse
     */
    CompletableFuture<DeleteABTestExperimentResponse> deleteABTestExperiment(DeleteABTestExperimentRequest request);

    /**
     * @param request the request parameters of DeleteABTestGroup  DeleteABTestGroupRequest
     * @return DeleteABTestGroupResponse
     */
    CompletableFuture<DeleteABTestGroupResponse> deleteABTestGroup(DeleteABTestGroupRequest request);

    /**
     * @param request the request parameters of DeleteABTestScene  DeleteABTestSceneRequest
     * @return DeleteABTestSceneResponse
     */
    CompletableFuture<DeleteABTestSceneResponse> deleteABTestScene(DeleteABTestSceneRequest request);

    /**
     * @param request the request parameters of DeleteFunctionInstance  DeleteFunctionInstanceRequest
     * @return DeleteFunctionInstanceResponse
     */
    CompletableFuture<DeleteFunctionInstanceResponse> deleteFunctionInstance(DeleteFunctionInstanceRequest request);

    /**
     * @param request the request parameters of DeleteFunctionResource  DeleteFunctionResourceRequest
     * @return DeleteFunctionResourceResponse
     */
    CompletableFuture<DeleteFunctionResourceResponse> deleteFunctionResource(DeleteFunctionResourceRequest request);

    /**
     * @param request the request parameters of DeleteFunctionTask  DeleteFunctionTaskRequest
     * @return DeleteFunctionTaskResponse
     */
    CompletableFuture<DeleteFunctionTaskResponse> deleteFunctionTask(DeleteFunctionTaskRequest request);

    /**
     * @param request the request parameters of DeleteSortScript  DeleteSortScriptRequest
     * @return DeleteSortScriptResponse
     */
    CompletableFuture<DeleteSortScriptResponse> deleteSortScript(DeleteSortScriptRequest request);

    /**
     * @param request the request parameters of DeleteSortScriptFile  DeleteSortScriptFileRequest
     * @return DeleteSortScriptFileResponse
     */
    CompletableFuture<DeleteSortScriptFileResponse> deleteSortScriptFile(DeleteSortScriptFileRequest request);

    /**
     * @param request the request parameters of DescribeABTestExperiment  DescribeABTestExperimentRequest
     * @return DescribeABTestExperimentResponse
     */
    CompletableFuture<DescribeABTestExperimentResponse> describeABTestExperiment(DescribeABTestExperimentRequest request);

    /**
     * @param request the request parameters of DescribeABTestGroup  DescribeABTestGroupRequest
     * @return DescribeABTestGroupResponse
     */
    CompletableFuture<DescribeABTestGroupResponse> describeABTestGroup(DescribeABTestGroupRequest request);

    /**
     * @param request the request parameters of DescribeABTestScene  DescribeABTestSceneRequest
     * @return DescribeABTestSceneResponse
     */
    CompletableFuture<DescribeABTestSceneResponse> describeABTestScene(DescribeABTestSceneRequest request);

    /**
     * @param request the request parameters of DescribeApp  DescribeAppRequest
     * @return DescribeAppResponse
     */
    CompletableFuture<DescribeAppResponse> describeApp(DescribeAppRequest request);

    /**
     * @param request the request parameters of DescribeAppGroup  DescribeAppGroupRequest
     * @return DescribeAppGroupResponse
     */
    CompletableFuture<DescribeAppGroupResponse> describeAppGroup(DescribeAppGroupRequest request);

    /**
     * @param request the request parameters of DescribeAppStatistics  DescribeAppStatisticsRequest
     * @return DescribeAppStatisticsResponse
     */
    CompletableFuture<DescribeAppStatisticsResponse> describeAppStatistics(DescribeAppStatisticsRequest request);

    /**
     * <b>description</b> :
     * <p>  When you create a standard application, a new version of the application is created if the specified application name already exists.</p>
     * <ul>
     * <li>When you create a version of an existing application, you must specify the autoSwitch and realtimeShared parameters.</li>
     * <li>When you create a version of an existing application, the value of the quota parameter is the same as that of the quota parameter in the previous version of the application.</li>
     * <li>When you create a version of an existing application, the modification of the value of the quota parameter does not take effect.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeApps  DescribeAppsRequest
     * @return DescribeAppsResponse
     */
    CompletableFuture<DescribeAppsResponse> describeApps(DescribeAppsRequest request);

    /**
     * @param request the request parameters of DescribeDataCollction  DescribeDataCollctionRequest
     * @return DescribeDataCollctionResponse
     */
    CompletableFuture<DescribeDataCollctionResponse> describeDataCollction(DescribeDataCollctionRequest request);

    /**
     * @param request the request parameters of DescribeFirstRank  DescribeFirstRankRequest
     * @return DescribeFirstRankResponse
     */
    CompletableFuture<DescribeFirstRankResponse> describeFirstRank(DescribeFirstRankRequest request);

    /**
     * @param request the request parameters of DescribeInterventionDictionary  DescribeInterventionDictionaryRequest
     * @return DescribeInterventionDictionaryResponse
     */
    CompletableFuture<DescribeInterventionDictionaryResponse> describeInterventionDictionary(DescribeInterventionDictionaryRequest request);

    /**
     * @param request the request parameters of DescribeQueryProcessor  DescribeQueryProcessorRequest
     * @return DescribeQueryProcessorResponse
     */
    CompletableFuture<DescribeQueryProcessorResponse> describeQueryProcessor(DescribeQueryProcessorRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * @param request the request parameters of DescribeScheduledTask  DescribeScheduledTaskRequest
     * @return DescribeScheduledTaskResponse
     */
    CompletableFuture<DescribeScheduledTaskResponse> describeScheduledTask(DescribeScheduledTaskRequest request);

    /**
     * @param request the request parameters of DescribeSecondRank  DescribeSecondRankRequest
     * @return DescribeSecondRankResponse
     */
    CompletableFuture<DescribeSecondRankResponse> describeSecondRank(DescribeSecondRankRequest request);

    /**
     * @param request the request parameters of DescribeSlowQueryStatus  DescribeSlowQueryStatusRequest
     * @return DescribeSlowQueryStatusResponse
     */
    CompletableFuture<DescribeSlowQueryStatusResponse> describeSlowQueryStatus(DescribeSlowQueryStatusRequest request);

    /**
     * @param request the request parameters of DescribeUserAnalyzer  DescribeUserAnalyzerRequest
     * @return DescribeUserAnalyzerResponse
     */
    CompletableFuture<DescribeUserAnalyzerResponse> describeUserAnalyzer(DescribeUserAnalyzerRequest request);

    /**
     * @param request the request parameters of DisableSlowQuery  DisableSlowQueryRequest
     * @return DisableSlowQueryResponse
     */
    CompletableFuture<DisableSlowQueryResponse> disableSlowQuery(DisableSlowQueryRequest request);

    /**
     * @param request the request parameters of EnableSlowQuery  EnableSlowQueryRequest
     * @return EnableSlowQueryResponse
     */
    CompletableFuture<EnableSlowQueryResponse> enableSlowQuery(EnableSlowQueryRequest request);

    /**
     * @param request the request parameters of GenerateMergedTable  GenerateMergedTableRequest
     * @return GenerateMergedTableResponse
     */
    CompletableFuture<GenerateMergedTableResponse> generateMergedTable(GenerateMergedTableRequest request);

    /**
     * @param request the request parameters of GetDomain  GetDomainRequest
     * @return GetDomainResponse
     */
    CompletableFuture<GetDomainResponse> getDomain(GetDomainRequest request);

    /**
     * @param request the request parameters of GetFunctionCurrentVersion  GetFunctionCurrentVersionRequest
     * @return GetFunctionCurrentVersionResponse
     */
    CompletableFuture<GetFunctionCurrentVersionResponse> getFunctionCurrentVersion(GetFunctionCurrentVersionRequest request);

    /**
     * @param request the request parameters of GetFunctionDefaultInstance  GetFunctionDefaultInstanceRequest
     * @return GetFunctionDefaultInstanceResponse
     */
    CompletableFuture<GetFunctionDefaultInstanceResponse> getFunctionDefaultInstance(GetFunctionDefaultInstanceRequest request);

    /**
     * @param request the request parameters of GetFunctionInstance  GetFunctionInstanceRequest
     * @return GetFunctionInstanceResponse
     */
    CompletableFuture<GetFunctionInstanceResponse> getFunctionInstance(GetFunctionInstanceRequest request);

    /**
     * @param request the request parameters of GetFunctionResource  GetFunctionResourceRequest
     * @return GetFunctionResourceResponse
     */
    CompletableFuture<GetFunctionResourceResponse> getFunctionResource(GetFunctionResourceRequest request);

    /**
     * @param request the request parameters of GetFunctionTask  GetFunctionTaskRequest
     * @return GetFunctionTaskResponse
     */
    CompletableFuture<GetFunctionTaskResponse> getFunctionTask(GetFunctionTaskRequest request);

    /**
     * @param request the request parameters of GetFunctionVersion  GetFunctionVersionRequest
     * @return GetFunctionVersionResponse
     */
    CompletableFuture<GetFunctionVersionResponse> getFunctionVersion(GetFunctionVersionRequest request);

    /**
     * @param request the request parameters of GetScriptFileNames  GetScriptFileNamesRequest
     * @return GetScriptFileNamesResponse
     */
    CompletableFuture<GetScriptFileNamesResponse> getScriptFileNames(GetScriptFileNamesRequest request);

    /**
     * @param request the request parameters of GetSearchStrategy  GetSearchStrategyRequest
     * @return GetSearchStrategyResponse
     */
    CompletableFuture<GetSearchStrategyResponse> getSearchStrategy(GetSearchStrategyRequest request);

    /**
     * @param request the request parameters of GetSortScript  GetSortScriptRequest
     * @return GetSortScriptResponse
     */
    CompletableFuture<GetSortScriptResponse> getSortScript(GetSortScriptRequest request);

    /**
     * @param request the request parameters of GetSortScriptFile  GetSortScriptFileRequest
     * @return GetSortScriptFileResponse
     */
    CompletableFuture<GetSortScriptFileResponse> getSortScriptFile(GetSortScriptFileRequest request);

    /**
     * @param request the request parameters of ListABTestExperiments  ListABTestExperimentsRequest
     * @return ListABTestExperimentsResponse
     */
    CompletableFuture<ListABTestExperimentsResponse> listABTestExperiments(ListABTestExperimentsRequest request);

    /**
     * @param request the request parameters of ListABTestFixedFlowDividers  ListABTestFixedFlowDividersRequest
     * @return ListABTestFixedFlowDividersResponse
     */
    CompletableFuture<ListABTestFixedFlowDividersResponse> listABTestFixedFlowDividers(ListABTestFixedFlowDividersRequest request);

    /**
     * @param request the request parameters of ListABTestGroups  ListABTestGroupsRequest
     * @return ListABTestGroupsResponse
     */
    CompletableFuture<ListABTestGroupsResponse> listABTestGroups(ListABTestGroupsRequest request);

    /**
     * @param request the request parameters of ListABTestScenes  ListABTestScenesRequest
     * @return ListABTestScenesResponse
     */
    CompletableFuture<ListABTestScenesResponse> listABTestScenes(ListABTestScenesRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation allows you to query applications by application name, instance ID, and application type.</p>
     * <ul>
     * <li>This operation allows you to sort the applications based on their creation time.</li>
     * <li>This operation supports the parameters for paging.</li>
     * </ul>
     * 
     * @param request the request parameters of ListAppGroups  ListAppGroupsRequest
     * @return ListAppGroupsResponse
     */
    CompletableFuture<ListAppGroupsResponse> listAppGroups(ListAppGroupsRequest request);

    /**
     * @param request the request parameters of ListDataCollections  ListDataCollectionsRequest
     * @return ListDataCollectionsResponse
     */
    CompletableFuture<ListDataCollectionsResponse> listDataCollections(ListDataCollectionsRequest request);

    /**
     * @param request the request parameters of ListDataSourceTableFields  ListDataSourceTableFieldsRequest
     * @return ListDataSourceTableFieldsResponse
     */
    CompletableFuture<ListDataSourceTableFieldsResponse> listDataSourceTableFields(ListDataSourceTableFieldsRequest request);

    /**
     * @param request the request parameters of ListDataSourceTables  ListDataSourceTablesRequest
     * @return ListDataSourceTablesResponse
     */
    CompletableFuture<ListDataSourceTablesResponse> listDataSourceTables(ListDataSourceTablesRequest request);

    /**
     * @param request the request parameters of ListFirstRanks  ListFirstRanksRequest
     * @return ListFirstRanksResponse
     */
    CompletableFuture<ListFirstRanksResponse> listFirstRanks(ListFirstRanksRequest request);

    /**
     * @param request the request parameters of ListFunctionInstances  ListFunctionInstancesRequest
     * @return ListFunctionInstancesResponse
     */
    CompletableFuture<ListFunctionInstancesResponse> listFunctionInstances(ListFunctionInstancesRequest request);

    /**
     * @param request the request parameters of ListFunctionResources  ListFunctionResourcesRequest
     * @return ListFunctionResourcesResponse
     */
    CompletableFuture<ListFunctionResourcesResponse> listFunctionResources(ListFunctionResourcesRequest request);

    /**
     * @param request the request parameters of ListFunctionTasks  ListFunctionTasksRequest
     * @return ListFunctionTasksResponse
     */
    CompletableFuture<ListFunctionTasksResponse> listFunctionTasks(ListFunctionTasksRequest request);

    /**
     * @param request the request parameters of ListInterventionDictionaries  ListInterventionDictionariesRequest
     * @return ListInterventionDictionariesResponse
     */
    CompletableFuture<ListInterventionDictionariesResponse> listInterventionDictionaries(ListInterventionDictionariesRequest request);

    /**
     * @param request the request parameters of ListInterventionDictionaryEntries  ListInterventionDictionaryEntriesRequest
     * @return ListInterventionDictionaryEntriesResponse
     */
    CompletableFuture<ListInterventionDictionaryEntriesResponse> listInterventionDictionaryEntries(ListInterventionDictionaryEntriesRequest request);

    /**
     * @param request the request parameters of ListInterventionDictionaryNerResults  ListInterventionDictionaryNerResultsRequest
     * @return ListInterventionDictionaryNerResultsResponse
     */
    CompletableFuture<ListInterventionDictionaryNerResultsResponse> listInterventionDictionaryNerResults(ListInterventionDictionaryNerResultsRequest request);

    /**
     * @param request the request parameters of ListInterventionDictionaryRelatedEntities  ListInterventionDictionaryRelatedEntitiesRequest
     * @return ListInterventionDictionaryRelatedEntitiesResponse
     */
    CompletableFuture<ListInterventionDictionaryRelatedEntitiesResponse> listInterventionDictionaryRelatedEntities(ListInterventionDictionaryRelatedEntitiesRequest request);

    /**
     * @param request the request parameters of ListProceedings  ListProceedingsRequest
     * @return ListProceedingsResponse
     */
    CompletableFuture<ListProceedingsResponse> listProceedings(ListProceedingsRequest request);

    /**
     * @param request the request parameters of ListQueryProcessorAnalyzerResults  ListQueryProcessorAnalyzerResultsRequest
     * @return ListQueryProcessorAnalyzerResultsResponse
     */
    CompletableFuture<ListQueryProcessorAnalyzerResultsResponse> listQueryProcessorAnalyzerResults(ListQueryProcessorAnalyzerResultsRequest request);

    /**
     * @param request the request parameters of ListQueryProcessorNers  ListQueryProcessorNersRequest
     * @return ListQueryProcessorNersResponse
     */
    CompletableFuture<ListQueryProcessorNersResponse> listQueryProcessorNers(ListQueryProcessorNersRequest request);

    /**
     * @param request the request parameters of ListQueryProcessors  ListQueryProcessorsRequest
     * @return ListQueryProcessorsResponse
     */
    CompletableFuture<ListQueryProcessorsResponse> listQueryProcessors(ListQueryProcessorsRequest request);

    /**
     * @param request the request parameters of ListQuotaReviewTasks  ListQuotaReviewTasksRequest
     * @return ListQuotaReviewTasksResponse
     */
    CompletableFuture<ListQuotaReviewTasksResponse> listQuotaReviewTasks(ListQuotaReviewTasksRequest request);

    /**
     * @param request the request parameters of ListScheduledTasks  ListScheduledTasksRequest
     * @return ListScheduledTasksResponse
     */
    CompletableFuture<ListScheduledTasksResponse> listScheduledTasks(ListScheduledTasksRequest request);

    /**
     * @param request the request parameters of ListSearchStrategies  ListSearchStrategiesRequest
     * @return ListSearchStrategiesResponse
     */
    CompletableFuture<ListSearchStrategiesResponse> listSearchStrategies(ListSearchStrategiesRequest request);

    /**
     * @param request the request parameters of ListSecondRanks  ListSecondRanksRequest
     * @return ListSecondRanksResponse
     */
    CompletableFuture<ListSecondRanksResponse> listSecondRanks(ListSecondRanksRequest request);

    /**
     * @param request the request parameters of ListSlowQueryCategories  ListSlowQueryCategoriesRequest
     * @return ListSlowQueryCategoriesResponse
     */
    CompletableFuture<ListSlowQueryCategoriesResponse> listSlowQueryCategories(ListSlowQueryCategoriesRequest request);

    /**
     * @param request the request parameters of ListSlowQueryQueries  ListSlowQueryQueriesRequest
     * @return ListSlowQueryQueriesResponse
     */
    CompletableFuture<ListSlowQueryQueriesResponse> listSlowQueryQueries(ListSlowQueryQueriesRequest request);

    /**
     * @param request the request parameters of ListSortExpressions  ListSortExpressionsRequest
     * @return ListSortExpressionsResponse
     */
    CompletableFuture<ListSortExpressionsResponse> listSortExpressions(ListSortExpressionsRequest request);

    /**
     * @param request the request parameters of ListSortScripts  ListSortScriptsRequest
     * @return ListSortScriptsResponse
     */
    CompletableFuture<ListSortScriptsResponse> listSortScripts(ListSortScriptsRequest request);

    /**
     * @param request the request parameters of ListStatisticLogs  ListStatisticLogsRequest
     * @return ListStatisticLogsResponse
     */
    CompletableFuture<ListStatisticLogsResponse> listStatisticLogs(ListStatisticLogsRequest request);

    /**
     * @param request the request parameters of ListStatisticReport  ListStatisticReportRequest
     * @return ListStatisticReportResponse
     */
    CompletableFuture<ListStatisticReportResponse> listStatisticReport(ListStatisticReportRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of ListUserAnalyzerEntries  ListUserAnalyzerEntriesRequest
     * @return ListUserAnalyzerEntriesResponse
     */
    CompletableFuture<ListUserAnalyzerEntriesResponse> listUserAnalyzerEntries(ListUserAnalyzerEntriesRequest request);

    /**
     * @param request the request parameters of ListUserAnalyzers  ListUserAnalyzersRequest
     * @return ListUserAnalyzersResponse
     */
    CompletableFuture<ListUserAnalyzersResponse> listUserAnalyzers(ListUserAnalyzersRequest request);

    /**
     * @param request the request parameters of ModifyAppGroup  ModifyAppGroupRequest
     * @return ModifyAppGroupResponse
     */
    CompletableFuture<ModifyAppGroupResponse> modifyAppGroup(ModifyAppGroupRequest request);

    /**
     * @param request the request parameters of ModifyAppGroupQuota  ModifyAppGroupQuotaRequest
     * @return ModifyAppGroupQuotaResponse
     */
    CompletableFuture<ModifyAppGroupQuotaResponse> modifyAppGroupQuota(ModifyAppGroupQuotaRequest request);

    /**
     * @param request the request parameters of ModifyFirstRank  ModifyFirstRankRequest
     * @return ModifyFirstRankResponse
     */
    CompletableFuture<ModifyFirstRankResponse> modifyFirstRank(ModifyFirstRankRequest request);

    /**
     * @param request the request parameters of ModifyQueryProcessor  ModifyQueryProcessorRequest
     * @return ModifyQueryProcessorResponse
     */
    CompletableFuture<ModifyQueryProcessorResponse> modifyQueryProcessor(ModifyQueryProcessorRequest request);

    /**
     * @param request the request parameters of ModifyScheduledTask  ModifyScheduledTaskRequest
     * @return ModifyScheduledTaskResponse
     */
    CompletableFuture<ModifyScheduledTaskResponse> modifyScheduledTask(ModifyScheduledTaskRequest request);

    /**
     * @param request the request parameters of ModifySecondRank  ModifySecondRankRequest
     * @return ModifySecondRankResponse
     */
    CompletableFuture<ModifySecondRankResponse> modifySecondRank(ModifySecondRankRequest request);

    /**
     * @param request the request parameters of PushInterventionDictionaryEntries  PushInterventionDictionaryEntriesRequest
     * @return PushInterventionDictionaryEntriesResponse
     */
    CompletableFuture<PushInterventionDictionaryEntriesResponse> pushInterventionDictionaryEntries(PushInterventionDictionaryEntriesRequest request);

    /**
     * @param request the request parameters of PushUserAnalyzerEntries  PushUserAnalyzerEntriesRequest
     * @return PushUserAnalyzerEntriesResponse
     */
    CompletableFuture<PushUserAnalyzerEntriesResponse> pushUserAnalyzerEntries(PushUserAnalyzerEntriesRequest request);

    /**
     * @param request the request parameters of ReleaseSortScript  ReleaseSortScriptRequest
     * @return ReleaseSortScriptResponse
     */
    CompletableFuture<ReleaseSortScriptResponse> releaseSortScript(ReleaseSortScriptRequest request);

    /**
     * @param request the request parameters of RemoveApp  RemoveAppRequest
     * @return RemoveAppResponse
     */
    CompletableFuture<RemoveAppResponse> removeApp(RemoveAppRequest request);

    /**
     * <b>description</b> :
     * <p>You can delete only pay-as-you-go applications. You cannot delete subscription applications.</p>
     * 
     * @param request the request parameters of RemoveAppGroup  RemoveAppGroupRequest
     * @return RemoveAppGroupResponse
     */
    CompletableFuture<RemoveAppGroupResponse> removeAppGroup(RemoveAppGroupRequest request);

    /**
     * @param request the request parameters of RemoveDataCollection  RemoveDataCollectionRequest
     * @return RemoveDataCollectionResponse
     */
    CompletableFuture<RemoveDataCollectionResponse> removeDataCollection(RemoveDataCollectionRequest request);

    /**
     * @param request the request parameters of RemoveFirstRank  RemoveFirstRankRequest
     * @return RemoveFirstRankResponse
     */
    CompletableFuture<RemoveFirstRankResponse> removeFirstRank(RemoveFirstRankRequest request);

    /**
     * @param request the request parameters of RemoveInterventionDictionary  RemoveInterventionDictionaryRequest
     * @return RemoveInterventionDictionaryResponse
     */
    CompletableFuture<RemoveInterventionDictionaryResponse> removeInterventionDictionary(RemoveInterventionDictionaryRequest request);

    /**
     * @param request the request parameters of RemoveQueryProcessor  RemoveQueryProcessorRequest
     * @return RemoveQueryProcessorResponse
     */
    CompletableFuture<RemoveQueryProcessorResponse> removeQueryProcessor(RemoveQueryProcessorRequest request);

    /**
     * @param request the request parameters of RemoveScheduledTask  RemoveScheduledTaskRequest
     * @return RemoveScheduledTaskResponse
     */
    CompletableFuture<RemoveScheduledTaskResponse> removeScheduledTask(RemoveScheduledTaskRequest request);

    /**
     * @param request the request parameters of RemoveSearchStrategy  RemoveSearchStrategyRequest
     * @return RemoveSearchStrategyResponse
     */
    CompletableFuture<RemoveSearchStrategyResponse> removeSearchStrategy(RemoveSearchStrategyRequest request);

    /**
     * @param request the request parameters of RemoveSecondRank  RemoveSecondRankRequest
     * @return RemoveSecondRankResponse
     */
    CompletableFuture<RemoveSecondRankResponse> removeSecondRank(RemoveSecondRankRequest request);

    /**
     * @param request the request parameters of RemoveUserAnalyzer  RemoveUserAnalyzerRequest
     * @return RemoveUserAnalyzerResponse
     */
    CompletableFuture<RemoveUserAnalyzerResponse> removeUserAnalyzer(RemoveUserAnalyzerRequest request);

    /**
     * @param request the request parameters of RenewAppGroup  RenewAppGroupRequest
     * @return RenewAppGroupResponse
     */
    CompletableFuture<RenewAppGroupResponse> renewAppGroup(RenewAppGroupRequest request);

    /**
     * @param request the request parameters of ReplaceAppGroupCommodityCode  ReplaceAppGroupCommodityCodeRequest
     * @return ReplaceAppGroupCommodityCodeResponse
     */
    CompletableFuture<ReplaceAppGroupCommodityCodeResponse> replaceAppGroupCommodityCode(ReplaceAppGroupCommodityCodeRequest request);

    /**
     * @param request the request parameters of SaveSortScriptFile  SaveSortScriptFileRequest
     * @return SaveSortScriptFileResponse
     */
    CompletableFuture<SaveSortScriptFileResponse> saveSortScriptFile(SaveSortScriptFileRequest request);

    /**
     * @param request the request parameters of StartSlowQueryAnalyzer  StartSlowQueryAnalyzerRequest
     * @return StartSlowQueryAnalyzerResponse
     */
    CompletableFuture<StartSlowQueryAnalyzerResponse> startSlowQueryAnalyzer(StartSlowQueryAnalyzerRequest request);

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to unbind a custom analyzer from an Elasticsearch instance.</p>
     * 
     * @param request the request parameters of UnbindESUserAnalyzer  UnbindESUserAnalyzerRequest
     * @return UnbindESUserAnalyzerResponse
     */
    CompletableFuture<UnbindESUserAnalyzerResponse> unbindESUserAnalyzer(UnbindESUserAnalyzerRequest request);

    /**
     * @param request the request parameters of UnbindEsInstance  UnbindEsInstanceRequest
     * @return UnbindEsInstanceResponse
     */
    CompletableFuture<UnbindEsInstanceResponse> unbindEsInstance(UnbindEsInstanceRequest request);

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * @param request the request parameters of UpdateABTestExperiment  UpdateABTestExperimentRequest
     * @return UpdateABTestExperimentResponse
     */
    CompletableFuture<UpdateABTestExperimentResponse> updateABTestExperiment(UpdateABTestExperimentRequest request);

    /**
     * @param request the request parameters of UpdateABTestFixedFlowDividers  UpdateABTestFixedFlowDividersRequest
     * @return UpdateABTestFixedFlowDividersResponse
     */
    CompletableFuture<UpdateABTestFixedFlowDividersResponse> updateABTestFixedFlowDividers(UpdateABTestFixedFlowDividersRequest request);

    /**
     * @param request the request parameters of UpdateABTestGroup  UpdateABTestGroupRequest
     * @return UpdateABTestGroupResponse
     */
    CompletableFuture<UpdateABTestGroupResponse> updateABTestGroup(UpdateABTestGroupRequest request);

    /**
     * @param request the request parameters of UpdateABTestScene  UpdateABTestSceneRequest
     * @return UpdateABTestSceneResponse
     */
    CompletableFuture<UpdateABTestSceneResponse> updateABTestScene(UpdateABTestSceneRequest request);

    /**
     * @param request the request parameters of UpdateFetchFields  UpdateFetchFieldsRequest
     * @return UpdateFetchFieldsResponse
     */
    CompletableFuture<UpdateFetchFieldsResponse> updateFetchFields(UpdateFetchFieldsRequest request);

    /**
     * @param request the request parameters of UpdateFunctionDefaultInstance  UpdateFunctionDefaultInstanceRequest
     * @return UpdateFunctionDefaultInstanceResponse
     */
    CompletableFuture<UpdateFunctionDefaultInstanceResponse> updateFunctionDefaultInstance(UpdateFunctionDefaultInstanceRequest request);

    /**
     * @param request the request parameters of UpdateFunctionInstance  UpdateFunctionInstanceRequest
     * @return UpdateFunctionInstanceResponse
     */
    CompletableFuture<UpdateFunctionInstanceResponse> updateFunctionInstance(UpdateFunctionInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to update the information about resources by resource name. You can modify only the values of data and description.</p>
     * 
     * @param request the request parameters of UpdateFunctionResource  UpdateFunctionResourceRequest
     * @return UpdateFunctionResourceResponse
     */
    CompletableFuture<UpdateFunctionResourceResponse> updateFunctionResource(UpdateFunctionResourceRequest request);

    /**
     * @param request the request parameters of UpdateSearchStrategy  UpdateSearchStrategyRequest
     * @return UpdateSearchStrategyResponse
     */
    CompletableFuture<UpdateSearchStrategyResponse> updateSearchStrategy(UpdateSearchStrategyRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify the description of a sort script.</p>
     * 
     * @param request the request parameters of UpdateSortScript  UpdateSortScriptRequest
     * @return UpdateSortScriptResponse
     */
    CompletableFuture<UpdateSortScriptResponse> updateSortScript(UpdateSortScriptRequest request);

    /**
     * @param request the request parameters of UpdateSummaries  UpdateSummariesRequest
     * @return UpdateSummariesResponse
     */
    CompletableFuture<UpdateSummariesResponse> updateSummaries(UpdateSummariesRequest request);

    /**
     * @param request the request parameters of ValidateDataSources  ValidateDataSourcesRequest
     * @return ValidateDataSourcesResponse
     */
    CompletableFuture<ValidateDataSourcesResponse> validateDataSources(ValidateDataSourcesRequest request);

}
