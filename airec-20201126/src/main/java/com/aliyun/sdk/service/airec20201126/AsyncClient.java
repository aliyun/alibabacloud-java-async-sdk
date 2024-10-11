// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.airec20201126.models.*;
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
     * @param request the request parameters of AttachDataset  AttachDatasetRequest
     * @return AttachDatasetResponse
     */
    CompletableFuture<AttachDatasetResponse> attachDataset(AttachDatasetRequest request);

    /**
     * @param request the request parameters of AttachIndexVersion  AttachIndexVersionRequest
     * @return AttachIndexVersionResponse
     */
    CompletableFuture<AttachIndexVersionResponse> attachIndexVersion(AttachIndexVersionRequest request);

    /**
     * @param request the request parameters of CheckRankingModelReachable  CheckRankingModelReachableRequest
     * @return CheckRankingModelReachableResponse
     */
    CompletableFuture<CheckRankingModelReachableResponse> checkRankingModelReachable(CheckRankingModelReachableRequest request);

    /**
     * @param request the request parameters of CloneExperiment  CloneExperimentRequest
     * @return CloneExperimentResponse
     */
    CompletableFuture<CloneExperimentResponse> cloneExperiment(CloneExperimentRequest request);

    /**
     * @param request the request parameters of CloneSample  CloneSampleRequest
     * @return CloneSampleResponse
     */
    CompletableFuture<CloneSampleResponse> cloneSample(CloneSampleRequest request);

    /**
     * @param request the request parameters of ColdStartRank  ColdStartRankRequest
     * @return ColdStartRankResponse
     */
    CompletableFuture<ColdStartRankResponse> coldStartRank(ColdStartRankRequest request);

    /**
     * @param request the request parameters of CreateCustomAnalysisTask  CreateCustomAnalysisTaskRequest
     * @return CreateCustomAnalysisTaskResponse
     */
    CompletableFuture<CreateCustomAnalysisTaskResponse> createCustomAnalysisTask(CreateCustomAnalysisTaskRequest request);

    /**
     * @param request the request parameters of CreateCustomSample  CreateCustomSampleRequest
     * @return CreateCustomSampleResponse
     */
    CompletableFuture<CreateCustomSampleResponse> createCustomSample(CreateCustomSampleRequest request);

    /**
     * @param request the request parameters of CreateDataDiagnoseTask  CreateDataDiagnoseTaskRequest
     * @return CreateDataDiagnoseTaskResponse
     */
    CompletableFuture<CreateDataDiagnoseTaskResponse> createDataDiagnoseTask(CreateDataDiagnoseTaskRequest request);

    /**
     * @param request the request parameters of CreateExtraDataSource  CreateExtraDataSourceRequest
     * @return CreateExtraDataSourceResponse
     */
    CompletableFuture<CreateExtraDataSourceResponse> createExtraDataSource(CreateExtraDataSourceRequest request);

    /**
     * @param request the request parameters of CreateFilteringAlgorithm  CreateFilteringAlgorithmRequest
     * @return CreateFilteringAlgorithmResponse
     */
    CompletableFuture<CreateFilteringAlgorithmResponse> createFilteringAlgorithm(CreateFilteringAlgorithmRequest request);

    /**
     * @param request the request parameters of CreateFlowControlTask  CreateFlowControlTaskRequest
     * @return CreateFlowControlTaskResponse
     */
    CompletableFuture<CreateFlowControlTaskResponse> createFlowControlTask(CreateFlowControlTaskRequest request);

    /**
     * @param request the request parameters of CreateInstance  CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    /**
     * @param request the request parameters of CreateRankingModel  CreateRankingModelRequest
     * @return CreateRankingModelResponse
     */
    CompletableFuture<CreateRankingModelResponse> createRankingModel(CreateRankingModelRequest request);

    /**
     * @param request the request parameters of CreateRankingModelTemplate  CreateRankingModelTemplateRequest
     * @return CreateRankingModelTemplateResponse
     */
    CompletableFuture<CreateRankingModelTemplateResponse> createRankingModelTemplate(CreateRankingModelTemplateRequest request);

    /**
     * @param request the request parameters of CreateRankingSystem  CreateRankingSystemRequest
     * @return CreateRankingSystemResponse
     */
    CompletableFuture<CreateRankingSystemResponse> createRankingSystem(CreateRankingSystemRequest request);

    /**
     * @param request the request parameters of CreateRule  CreateRuleRequest
     * @return CreateRuleResponse
     */
    CompletableFuture<CreateRuleResponse> createRule(CreateRuleRequest request);

    /**
     * @param request the request parameters of CreateSampleFormatConfig  CreateSampleFormatConfigRequest
     * @return CreateSampleFormatConfigResponse
     */
    CompletableFuture<CreateSampleFormatConfigResponse> createSampleFormatConfig(CreateSampleFormatConfigRequest request);

    /**
     * <b>description</b> :
     * <p>We recommend that you do not call an API operation to manage scenes. We recommend that you go to the Scenario Building page in the Artificial Intelligence Recommendation (AIRec) console to manage scenes.</p>
     * 
     * @param request the request parameters of CreateScene  CreateSceneRequest
     * @return CreateSceneResponse
     */
    CompletableFuture<CreateSceneResponse> createScene(CreateSceneRequest request);

    /**
     * @param request the request parameters of CreateUmengToken  CreateUmengTokenRequest
     * @return CreateUmengTokenResponse
     */
    CompletableFuture<CreateUmengTokenResponse> createUmengToken(CreateUmengTokenRequest request);

    /**
     * @param request the request parameters of DecribeRankingModel  DecribeRankingModelRequest
     * @return DecribeRankingModelResponse
     */
    CompletableFuture<DecribeRankingModelResponse> decribeRankingModel(DecribeRankingModelRequest request);

    /**
     * @param request the request parameters of DeleteDataSet  DeleteDataSetRequest
     * @return DeleteDataSetResponse
     */
    CompletableFuture<DeleteDataSetResponse> deleteDataSet(DeleteDataSetRequest request);

    /**
     * @param request the request parameters of DeleteExperiment  DeleteExperimentRequest
     * @return DeleteExperimentResponse
     */
    CompletableFuture<DeleteExperimentResponse> deleteExperiment(DeleteExperimentRequest request);

    /**
     * @param request the request parameters of DeleteExtraDataSource  DeleteExtraDataSourceRequest
     * @return DeleteExtraDataSourceResponse
     */
    CompletableFuture<DeleteExtraDataSourceResponse> deleteExtraDataSource(DeleteExtraDataSourceRequest request);

    /**
     * @param request the request parameters of DeleteFilteringAlgorithm  DeleteFilteringAlgorithmRequest
     * @return DeleteFilteringAlgorithmResponse
     */
    CompletableFuture<DeleteFilteringAlgorithmResponse> deleteFilteringAlgorithm(DeleteFilteringAlgorithmRequest request);

    /**
     * @param request the request parameters of DeleteFlowControlTask  DeleteFlowControlTaskRequest
     * @return DeleteFlowControlTaskResponse
     */
    CompletableFuture<DeleteFlowControlTaskResponse> deleteFlowControlTask(DeleteFlowControlTaskRequest request);

    /**
     * @param request the request parameters of DeleteRankingModel  DeleteRankingModelRequest
     * @return DeleteRankingModelResponse
     */
    CompletableFuture<DeleteRankingModelResponse> deleteRankingModel(DeleteRankingModelRequest request);

    /**
     * @param request the request parameters of DeleteRankingModelTemplate  DeleteRankingModelTemplateRequest
     * @return DeleteRankingModelTemplateResponse
     */
    CompletableFuture<DeleteRankingModelTemplateResponse> deleteRankingModelTemplate(DeleteRankingModelTemplateRequest request);

    /**
     * @param request the request parameters of DeleteRankingModelVersion  DeleteRankingModelVersionRequest
     * @return DeleteRankingModelVersionResponse
     */
    CompletableFuture<DeleteRankingModelVersionResponse> deleteRankingModelVersion(DeleteRankingModelVersionRequest request);

    /**
     * @param request the request parameters of DeleteRankingSystem  DeleteRankingSystemRequest
     * @return DeleteRankingSystemResponse
     */
    CompletableFuture<DeleteRankingSystemResponse> deleteRankingSystem(DeleteRankingSystemRequest request);

    /**
     * @param request the request parameters of DeleteSample  DeleteSampleRequest
     * @return DeleteSampleResponse
     */
    CompletableFuture<DeleteSampleResponse> deleteSample(DeleteSampleRequest request);

    /**
     * <b>description</b> :
     * <p>We recommend that you do not call an API operation to manage scenes. We recommend that you go to the Scenario Building page in the Artificial Intelligence Recommendation (AIRec) console to manage scenes.</p>
     * 
     * @param request the request parameters of DeleteScene  DeleteSceneRequest
     * @return DeleteSceneResponse
     */
    CompletableFuture<DeleteSceneResponse> deleteScene(DeleteSceneRequest request);

    /**
     * @param request the request parameters of DeployRankingSystem  DeployRankingSystemRequest
     * @return DeployRankingSystemResponse
     */
    CompletableFuture<DeployRankingSystemResponse> deployRankingSystem(DeployRankingSystemRequest request);

    /**
     * @param request the request parameters of DescribeBaseExperiment  DescribeBaseExperimentRequest
     * @return DescribeBaseExperimentResponse
     */
    CompletableFuture<DescribeBaseExperimentResponse> describeBaseExperiment(DescribeBaseExperimentRequest request);

    /**
     * @param request the request parameters of DescribeCustomAnalysisTask  DescribeCustomAnalysisTaskRequest
     * @return DescribeCustomAnalysisTaskResponse
     */
    CompletableFuture<DescribeCustomAnalysisTaskResponse> describeCustomAnalysisTask(DescribeCustomAnalysisTaskRequest request);

    /**
     * @param request the request parameters of DescribeDataSetMessage  DescribeDataSetMessageRequest
     * @return DescribeDataSetMessageResponse
     */
    CompletableFuture<DescribeDataSetMessageResponse> describeDataSetMessage(DescribeDataSetMessageRequest request);

    /**
     * @param request the request parameters of DescribeDefaultAlgorithms  DescribeDefaultAlgorithmsRequest
     * @return DescribeDefaultAlgorithmsResponse
     */
    CompletableFuture<DescribeDefaultAlgorithmsResponse> describeDefaultAlgorithms(DescribeDefaultAlgorithmsRequest request);

    /**
     * @param request the request parameters of DescribeExperiment  DescribeExperimentRequest
     * @return DescribeExperimentResponse
     */
    CompletableFuture<DescribeExperimentResponse> describeExperiment(DescribeExperimentRequest request);

    /**
     * @param request the request parameters of DescribeExperimentEnv  DescribeExperimentEnvRequest
     * @return DescribeExperimentEnvResponse
     */
    CompletableFuture<DescribeExperimentEnvResponse> describeExperimentEnv(DescribeExperimentEnvRequest request);

    /**
     * @param request the request parameters of DescribeExperimentEnvProgress  DescribeExperimentEnvProgressRequest
     * @return DescribeExperimentEnvProgressResponse
     */
    CompletableFuture<DescribeExperimentEnvProgressResponse> describeExperimentEnvProgress(DescribeExperimentEnvProgressRequest request);

    /**
     * @param request the request parameters of DescribeFilteringAlgorithm  DescribeFilteringAlgorithmRequest
     * @return DescribeFilteringAlgorithmResponse
     */
    CompletableFuture<DescribeFilteringAlgorithmResponse> describeFilteringAlgorithm(DescribeFilteringAlgorithmRequest request);

    /**
     * @param request the request parameters of DescribeInstance  DescribeInstanceRequest
     * @return DescribeInstanceResponse
     */
    CompletableFuture<DescribeInstanceResponse> describeInstance(DescribeInstanceRequest request);

    /**
     * @param request the request parameters of DescribeLatestTask  DescribeLatestTaskRequest
     * @return DescribeLatestTaskResponse
     */
    CompletableFuture<DescribeLatestTaskResponse> describeLatestTask(DescribeLatestTaskRequest request);

    /**
     * @param request the request parameters of DescribeQuota  DescribeQuotaRequest
     * @return DescribeQuotaResponse
     */
    CompletableFuture<DescribeQuotaResponse> describeQuota(DescribeQuotaRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * @param request the request parameters of DescribeRule  DescribeRuleRequest
     * @return DescribeRuleResponse
     */
    CompletableFuture<DescribeRuleResponse> describeRule(DescribeRuleRequest request);

    /**
     * <b>description</b> :
     * <p>We recommend that you do not call an API operation to manage scenes. We recommend that you go to the Scenario Building page in the Artificial Intelligence Recommendation (AIRec) console to manage scenes.</p>
     * 
     * @param request the request parameters of DescribeScene  DescribeSceneRequest
     * @return DescribeSceneResponse
     */
    CompletableFuture<DescribeSceneResponse> describeScene(DescribeSceneRequest request);

    /**
     * @param request the request parameters of DescribeSceneBucket  DescribeSceneBucketRequest
     * @return DescribeSceneBucketResponse
     */
    CompletableFuture<DescribeSceneBucketResponse> describeSceneBucket(DescribeSceneBucketRequest request);

    /**
     * <b>description</b> :
     * <p><strong>null</strong></p>
     * 
     * @param request the request parameters of DescribeSceneThroughput  DescribeSceneThroughputRequest
     * @return DescribeSceneThroughputResponse
     */
    CompletableFuture<DescribeSceneThroughputResponse> describeSceneThroughput(DescribeSceneThroughputRequest request);

    /**
     * @param request the request parameters of DescribeSyncReportDetail  DescribeSyncReportDetailRequest
     * @return DescribeSyncReportDetailResponse
     */
    CompletableFuture<DescribeSyncReportDetailResponse> describeSyncReportDetail(DescribeSyncReportDetailRequest request);

    /**
     * @param request the request parameters of DescribeSyncReportOutliers  DescribeSyncReportOutliersRequest
     * @return DescribeSyncReportOutliersResponse
     */
    CompletableFuture<DescribeSyncReportOutliersResponse> describeSyncReportOutliers(DescribeSyncReportOutliersRequest request);

    /**
     * @param request the request parameters of DescribeUserMetrics  DescribeUserMetricsRequest
     * @return DescribeUserMetricsResponse
     */
    CompletableFuture<DescribeUserMetricsResponse> describeUserMetrics(DescribeUserMetricsRequest request);

    /**
     * <b>description</b> :
     * <p>The returned results.</p>
     * 
     * @param request the request parameters of DowngradeInstance  DowngradeInstanceRequest
     * @return DowngradeInstanceResponse
     */
    CompletableFuture<DowngradeInstanceResponse> downgradeInstance(DowngradeInstanceRequest request);

    /**
     * @param request the request parameters of EnableExperiment  EnableExperimentRequest
     * @return EnableExperimentResponse
     */
    CompletableFuture<EnableExperimentResponse> enableExperiment(EnableExperimentRequest request);

    /**
     * @param request the request parameters of GenerateSample  GenerateSampleRequest
     * @return GenerateSampleResponse
     */
    CompletableFuture<GenerateSampleResponse> generateSample(GenerateSampleRequest request);

    /**
     * @param request the request parameters of GetExtraDataSource  GetExtraDataSourceRequest
     * @return GetExtraDataSourceResponse
     */
    CompletableFuture<GetExtraDataSourceResponse> getExtraDataSource(GetExtraDataSourceRequest request);

    /**
     * @param request the request parameters of GetFlowControlTask  GetFlowControlTaskRequest
     * @return GetFlowControlTaskResponse
     */
    CompletableFuture<GetFlowControlTaskResponse> getFlowControlTask(GetFlowControlTaskRequest request);

    /**
     * @param request the request parameters of GetLatestDataDiagnoseTaskStatus  GetLatestDataDiagnoseTaskStatusRequest
     * @return GetLatestDataDiagnoseTaskStatusResponse
     */
    CompletableFuture<GetLatestDataDiagnoseTaskStatusResponse> getLatestDataDiagnoseTaskStatus(GetLatestDataDiagnoseTaskStatusRequest request);

    /**
     * @param request the request parameters of GetRankingModelTemplate  GetRankingModelTemplateRequest
     * @return GetRankingModelTemplateResponse
     */
    CompletableFuture<GetRankingModelTemplateResponse> getRankingModelTemplate(GetRankingModelTemplateRequest request);

    /**
     * @param request the request parameters of GetRankingModelVersion  GetRankingModelVersionRequest
     * @return GetRankingModelVersionResponse
     */
    CompletableFuture<GetRankingModelVersionResponse> getRankingModelVersion(GetRankingModelVersionRequest request);

    /**
     * @param request the request parameters of GetRankingSystem  GetRankingSystemRequest
     * @return GetRankingSystemResponse
     */
    CompletableFuture<GetRankingSystemResponse> getRankingSystem(GetRankingSystemRequest request);

    /**
     * @param request the request parameters of GetRankingSystemHistory  GetRankingSystemHistoryRequest
     * @return GetRankingSystemHistoryResponse
     */
    CompletableFuture<GetRankingSystemHistoryResponse> getRankingSystemHistory(GetRankingSystemHistoryRequest request);

    /**
     * @param request the request parameters of GetSample  GetSampleRequest
     * @return GetSampleResponse
     */
    CompletableFuture<GetSampleResponse> getSample(GetSampleRequest request);

    /**
     * @param request the request parameters of InitComputingResource  InitComputingResourceRequest
     * @return InitComputingResourceResponse
     */
    CompletableFuture<InitComputingResourceResponse> initComputingResource(InitComputingResourceRequest request);

    /**
     * @param request the request parameters of ListDashboardDetails  ListDashboardDetailsRequest
     * @return ListDashboardDetailsResponse
     */
    CompletableFuture<ListDashboardDetailsResponse> listDashboardDetails(ListDashboardDetailsRequest request);

    /**
     * @param request the request parameters of ListDashboardDetailsFlows  ListDashboardDetailsFlowsRequest
     * @return ListDashboardDetailsFlowsResponse
     */
    CompletableFuture<ListDashboardDetailsFlowsResponse> listDashboardDetailsFlows(ListDashboardDetailsFlowsRequest request);

    /**
     * @param request the request parameters of ListDashboardMetrics  ListDashboardMetricsRequest
     * @return ListDashboardMetricsResponse
     */
    CompletableFuture<ListDashboardMetricsResponse> listDashboardMetrics(ListDashboardMetricsRequest request);

    /**
     * @param request the request parameters of ListDashboardMetricsFlows  ListDashboardMetricsFlowsRequest
     * @return ListDashboardMetricsFlowsResponse
     */
    CompletableFuture<ListDashboardMetricsFlowsResponse> listDashboardMetricsFlows(ListDashboardMetricsFlowsRequest request);

    /**
     * @param request the request parameters of ListDataDiagnoseReports  ListDataDiagnoseReportsRequest
     * @return ListDataDiagnoseReportsResponse
     */
    CompletableFuture<ListDataDiagnoseReportsResponse> listDataDiagnoseReports(ListDataDiagnoseReportsRequest request);

    /**
     * @param request the request parameters of ListDataDiagnoseSampleDetails  ListDataDiagnoseSampleDetailsRequest
     * @return ListDataDiagnoseSampleDetailsResponse
     */
    CompletableFuture<ListDataDiagnoseSampleDetailsResponse> listDataDiagnoseSampleDetails(ListDataDiagnoseSampleDetailsRequest request);

    /**
     * @param request the request parameters of ListDataSet  ListDataSetRequest
     * @return ListDataSetResponse
     */
    CompletableFuture<ListDataSetResponse> listDataSet(ListDataSetRequest request);

    /**
     * @param request the request parameters of ListDataSource  ListDataSourceRequest
     * @return ListDataSourceResponse
     */
    CompletableFuture<ListDataSourceResponse> listDataSource(ListDataSourceRequest request);

    /**
     * @param request the request parameters of ListExperiments  ListExperimentsRequest
     * @return ListExperimentsResponse
     */
    CompletableFuture<ListExperimentsResponse> listExperiments(ListExperimentsRequest request);

    /**
     * @param request the request parameters of ListExtraDataSources  ListExtraDataSourcesRequest
     * @return ListExtraDataSourcesResponse
     */
    CompletableFuture<ListExtraDataSourcesResponse> listExtraDataSources(ListExtraDataSourcesRequest request);

    /**
     * @param request the request parameters of ListFeatureTables  ListFeatureTablesRequest
     * @return ListFeatureTablesResponse
     */
    CompletableFuture<ListFeatureTablesResponse> listFeatureTables(ListFeatureTablesRequest request);

    /**
     * @param request the request parameters of ListFilteringAlgorithms  ListFilteringAlgorithmsRequest
     * @return ListFilteringAlgorithmsResponse
     */
    CompletableFuture<ListFilteringAlgorithmsResponse> listFilteringAlgorithms(ListFilteringAlgorithmsRequest request);

    /**
     * @param request the request parameters of ListFlowControlTask  ListFlowControlTaskRequest
     * @return ListFlowControlTaskResponse
     */
    CompletableFuture<ListFlowControlTaskResponse> listFlowControlTask(ListFlowControlTaskRequest request);

    /**
     * @param request the request parameters of ListFlowControlTaskInvalidItems  ListFlowControlTaskInvalidItemsRequest
     * @return ListFlowControlTaskInvalidItemsResponse
     */
    CompletableFuture<ListFlowControlTaskInvalidItemsResponse> listFlowControlTaskInvalidItems(ListFlowControlTaskInvalidItemsRequest request);

    /**
     * @param request the request parameters of ListFlowControlTaskItemReports  ListFlowControlTaskItemReportsRequest
     * @return ListFlowControlTaskItemReportsResponse
     */
    CompletableFuture<ListFlowControlTaskItemReportsResponse> listFlowControlTaskItemReports(ListFlowControlTaskItemReportsRequest request);

    /**
     * @param request the request parameters of ListFlowControlTaskItems  ListFlowControlTaskItemsRequest
     * @return ListFlowControlTaskItemsResponse
     */
    CompletableFuture<ListFlowControlTaskItemsResponse> listFlowControlTaskItems(ListFlowControlTaskItemsRequest request);

    /**
     * @param request the request parameters of ListFlowControlTaskReference  ListFlowControlTaskReferenceRequest
     * @return ListFlowControlTaskReferenceResponse
     */
    CompletableFuture<ListFlowControlTaskReferenceResponse> listFlowControlTaskReference(ListFlowControlTaskReferenceRequest request);

    /**
     * @param request the request parameters of ListFlowControlTaskReports  ListFlowControlTaskReportsRequest
     * @return ListFlowControlTaskReportsResponse
     */
    CompletableFuture<ListFlowControlTaskReportsResponse> listFlowControlTaskReports(ListFlowControlTaskReportsRequest request);

    /**
     * @param request the request parameters of ListIndexVersions  ListIndexVersionsRequest
     * @return ListIndexVersionsResponse
     */
    CompletableFuture<ListIndexVersionsResponse> listIndexVersions(ListIndexVersionsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation to query the list of instances. The returned instances are ranked in descending order based on the values of GmtCreate. You can specify multiple request parameters. These request parameters can be used to filter query results. The request parameters that you specify have logical AND relations. Only the specified parameters can be used to filter query results.</p>
     * 
     * @param request the request parameters of ListInstance  ListInstanceRequest
     * @return ListInstanceResponse
     */
    CompletableFuture<ListInstanceResponse> listInstance(ListInstanceRequest request);

    /**
     * @param request the request parameters of ListInstanceTask  ListInstanceTaskRequest
     * @return ListInstanceTaskResponse
     */
    CompletableFuture<ListInstanceTaskResponse> listInstanceTask(ListInstanceTaskRequest request);

    /**
     * @param request the request parameters of ListItems  ListItemsRequest
     * @return ListItemsResponse
     */
    CompletableFuture<ListItemsResponse> listItems(ListItemsRequest request);

    /**
     * @param request the request parameters of ListLogs  ListLogsRequest
     * @return ListLogsResponse
     */
    CompletableFuture<ListLogsResponse> listLogs(ListLogsRequest request);

    /**
     * @param request the request parameters of ListMixCategories  ListMixCategoriesRequest
     * @return ListMixCategoriesResponse
     */
    CompletableFuture<ListMixCategoriesResponse> listMixCategories(ListMixCategoriesRequest request);

    /**
     * @param request the request parameters of ListOfflineStorages  ListOfflineStoragesRequest
     * @return ListOfflineStoragesResponse
     */
    CompletableFuture<ListOfflineStoragesResponse> listOfflineStorages(ListOfflineStoragesRequest request);

    /**
     * @param request the request parameters of ListRankingModelTemplates  ListRankingModelTemplatesRequest
     * @return ListRankingModelTemplatesResponse
     */
    CompletableFuture<ListRankingModelTemplatesResponse> listRankingModelTemplates(ListRankingModelTemplatesRequest request);

    /**
     * @param request the request parameters of ListRankingModelVersions  ListRankingModelVersionsRequest
     * @return ListRankingModelVersionsResponse
     */
    CompletableFuture<ListRankingModelVersionsResponse> listRankingModelVersions(ListRankingModelVersionsRequest request);

    /**
     * @param request the request parameters of ListRankingModels  ListRankingModelsRequest
     * @return ListRankingModelsResponse
     */
    CompletableFuture<ListRankingModelsResponse> listRankingModels(ListRankingModelsRequest request);

    /**
     * @param request the request parameters of ListRankingSystemHistories  ListRankingSystemHistoriesRequest
     * @return ListRankingSystemHistoriesResponse
     */
    CompletableFuture<ListRankingSystemHistoriesResponse> listRankingSystemHistories(ListRankingSystemHistoriesRequest request);

    /**
     * @param request the request parameters of ListRankingSystems  ListRankingSystemsRequest
     * @return ListRankingSystemsResponse
     */
    CompletableFuture<ListRankingSystemsResponse> listRankingSystems(ListRankingSystemsRequest request);

    /**
     * @param request the request parameters of ListRuleConditions  ListRuleConditionsRequest
     * @return ListRuleConditionsResponse
     */
    CompletableFuture<ListRuleConditionsResponse> listRuleConditions(ListRuleConditionsRequest request);

    /**
     * @param request the request parameters of ListRuleTasks  ListRuleTasksRequest
     * @return ListRuleTasksResponse
     */
    CompletableFuture<ListRuleTasksResponse> listRuleTasks(ListRuleTasksRequest request);

    /**
     * @param request the request parameters of ListRules  ListRulesRequest
     * @return ListRulesResponse
     */
    CompletableFuture<ListRulesResponse> listRules(ListRulesRequest request);

    /**
     * @param request the request parameters of ListSampleFormatConfigs  ListSampleFormatConfigsRequest
     * @return ListSampleFormatConfigsResponse
     */
    CompletableFuture<ListSampleFormatConfigsResponse> listSampleFormatConfigs(ListSampleFormatConfigsRequest request);

    /**
     * @param request the request parameters of ListSamples  ListSamplesRequest
     * @return ListSamplesResponse
     */
    CompletableFuture<ListSamplesResponse> listSamples(ListSamplesRequest request);

    /**
     * <b>description</b> :
     * <p>We recommend that you do not call an API operation to manage scenes. We recommend that you go to the Scenario Building page in the Artificial Intelligence Recommendation (AIRec) console to manage scenes.</p>
     * 
     * @param request the request parameters of ListSceneItems  ListSceneItemsRequest
     * @return ListSceneItemsResponse
     */
    CompletableFuture<ListSceneItemsResponse> listSceneItems(ListSceneItemsRequest request);

    /**
     * @param request the request parameters of ListSceneParameters  ListSceneParametersRequest
     * @return ListSceneParametersResponse
     */
    CompletableFuture<ListSceneParametersResponse> listSceneParameters(ListSceneParametersRequest request);

    /**
     * <b>description</b> :
     * <p>We recommend that you do not call an API operation to manage scenes. Go to the Scenario Building page in the AIRec console to manage scenes.</p>
     * 
     * @param request the request parameters of ListScenes  ListScenesRequest
     * @return ListScenesResponse
     */
    CompletableFuture<ListScenesResponse> listScenes(ListScenesRequest request);

    /**
     * @param request the request parameters of ListUmengAppkeys  ListUmengAppkeysRequest
     * @return ListUmengAppkeysResponse
     */
    CompletableFuture<ListUmengAppkeysResponse> listUmengAppkeys(ListUmengAppkeysRequest request);

    /**
     * @param request the request parameters of ListUserClusters  ListUserClustersRequest
     * @return ListUserClustersResponse
     */
    CompletableFuture<ListUserClustersResponse> listUserClusters(ListUserClustersRequest request);

    /**
     * @param request the request parameters of ModifyDataSource  ModifyDataSourceRequest
     * @return ModifyDataSourceResponse
     */
    CompletableFuture<ModifyDataSourceResponse> modifyDataSource(ModifyDataSourceRequest request);

    /**
     * @param request the request parameters of ModifyFeatureTable  ModifyFeatureTableRequest
     * @return ModifyFeatureTableResponse
     */
    CompletableFuture<ModifyFeatureTableResponse> modifyFeatureTable(ModifyFeatureTableRequest request);

    /**
     * <b>description</b> :
     * <p>The name of the filtering algorithm.</p>
     * 
     * @param request the request parameters of ModifyFilteringAlgorithmMeta  ModifyFilteringAlgorithmMetaRequest
     * @return ModifyFilteringAlgorithmMetaResponse
     */
    CompletableFuture<ModifyFilteringAlgorithmMetaResponse> modifyFilteringAlgorithmMeta(ModifyFilteringAlgorithmMetaRequest request);

    /**
     * @param request the request parameters of ModifyFlowControlTask  ModifyFlowControlTaskRequest
     * @return ModifyFlowControlTaskResponse
     */
    CompletableFuture<ModifyFlowControlTaskResponse> modifyFlowControlTask(ModifyFlowControlTaskRequest request);

    /**
     * @param request the request parameters of ModifyInstance  ModifyInstanceRequest
     * @return ModifyInstanceResponse
     */
    CompletableFuture<ModifyInstanceResponse> modifyInstance(ModifyInstanceRequest request);

    /**
     * @param request the request parameters of ModifyItems  ModifyItemsRequest
     * @return ModifyItemsResponse
     */
    CompletableFuture<ModifyItemsResponse> modifyItems(ModifyItemsRequest request);

    /**
     * @param request the request parameters of ModifyOfflineStorages  ModifyOfflineStoragesRequest
     * @return ModifyOfflineStoragesResponse
     */
    CompletableFuture<ModifyOfflineStoragesResponse> modifyOfflineStorages(ModifyOfflineStoragesRequest request);

    /**
     * @param request the request parameters of ModifyRankingModel  ModifyRankingModelRequest
     * @return ModifyRankingModelResponse
     */
    CompletableFuture<ModifyRankingModelResponse> modifyRankingModel(ModifyRankingModelRequest request);

    /**
     * @param request the request parameters of ModifyRankingModelTemplate  ModifyRankingModelTemplateRequest
     * @return ModifyRankingModelTemplateResponse
     */
    CompletableFuture<ModifyRankingModelTemplateResponse> modifyRankingModelTemplate(ModifyRankingModelTemplateRequest request);

    /**
     * @param request the request parameters of ModifyRankingSystem  ModifyRankingSystemRequest
     * @return ModifyRankingSystemResponse
     */
    CompletableFuture<ModifyRankingSystemResponse> modifyRankingSystem(ModifyRankingSystemRequest request);

    /**
     * @param request the request parameters of ModifyRule  ModifyRuleRequest
     * @return ModifyRuleResponse
     */
    CompletableFuture<ModifyRuleResponse> modifyRule(ModifyRuleRequest request);

    /**
     * @param request the request parameters of ModifySample  ModifySampleRequest
     * @return ModifySampleResponse
     */
    CompletableFuture<ModifySampleResponse> modifySample(ModifySampleRequest request);

    /**
     * <b>description</b> :
     * <p>We recommend that you do not call an API operation to manage scenes. We recommend that you go to the Scenario Building page in the Artificial Intelligence Recommendation (AIRec) console to manage scenes.</p>
     * 
     * @param request the request parameters of ModifyScene  ModifySceneRequest
     * @return ModifySceneResponse
     */
    CompletableFuture<ModifySceneResponse> modifyScene(ModifySceneRequest request);

    /**
     * @param request the request parameters of OfflineFilteringAlgorithm  OfflineFilteringAlgorithmRequest
     * @return OfflineFilteringAlgorithmResponse
     */
    CompletableFuture<OfflineFilteringAlgorithmResponse> offlineFilteringAlgorithm(OfflineFilteringAlgorithmRequest request);

    /**
     * @param request the request parameters of PublishFlowControlTask  PublishFlowControlTaskRequest
     * @return PublishFlowControlTaskResponse
     */
    CompletableFuture<PublishFlowControlTaskResponse> publishFlowControlTask(PublishFlowControlTaskRequest request);

    /**
     * @param request the request parameters of PublishRule  PublishRuleRequest
     * @return PublishRuleResponse
     */
    CompletableFuture<PublishRuleResponse> publishRule(PublishRuleRequest request);

    /**
     * @param request the request parameters of PushColdStartDocument  PushColdStartDocumentRequest
     * @return PushColdStartDocumentResponse
     */
    CompletableFuture<PushColdStartDocumentResponse> pushColdStartDocument(PushColdStartDocumentRequest request);

    /**
     * @param request the request parameters of PushDocument  PushDocumentRequest
     * @return PushDocumentResponse
     */
    CompletableFuture<PushDocumentResponse> pushDocument(PushDocumentRequest request);

    /**
     * @param request the request parameters of PushIntervention  PushInterventionRequest
     * @return PushInterventionResponse
     */
    CompletableFuture<PushInterventionResponse> pushIntervention(PushInterventionRequest request);

    /**
     * @param request the request parameters of QueryDataMessage  QueryDataMessageRequest
     * @return QueryDataMessageResponse
     */
    CompletableFuture<QueryDataMessageResponse> queryDataMessage(QueryDataMessageRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation to query statistics on update messages in a specified data table of a specified instance.</p>
     * 
     * @param request the request parameters of QueryDataMessageStatistics  QueryDataMessageStatisticsRequest
     * @return QueryDataMessageStatisticsResponse
     */
    CompletableFuture<QueryDataMessageStatisticsResponse> queryDataMessageStatistics(QueryDataMessageStatisticsRequest request);

    /**
     * @param request the request parameters of QueryExceptionHistory  QueryExceptionHistoryRequest
     * @return QueryExceptionHistoryResponse
     */
    CompletableFuture<QueryExceptionHistoryResponse> queryExceptionHistory(QueryExceptionHistoryRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query raw data in a specific data table of an instance by using the primary key. The returned results need to be confirmed by customers.</p>
     * 
     * @param request the request parameters of QueryRawData  QueryRawDataRequest
     * @return QueryRawDataResponse
     */
    CompletableFuture<QueryRawDataResponse> queryRawData(QueryRawDataRequest request);

    /**
     * @param request the request parameters of QuerySingleAggregationReport  QuerySingleAggregationReportRequest
     * @return QuerySingleAggregationReportResponse
     */
    CompletableFuture<QuerySingleAggregationReportResponse> querySingleAggregationReport(QuerySingleAggregationReportRequest request);

    /**
     * @param request the request parameters of QuerySingleReport  QuerySingleReportRequest
     * @return QuerySingleReportResponse
     */
    CompletableFuture<QuerySingleReportResponse> querySingleReport(QuerySingleReportRequest request);

    /**
     * @param request the request parameters of QuerySyncReportAggregation  QuerySyncReportAggregationRequest
     * @return QuerySyncReportAggregationResponse
     */
    CompletableFuture<QuerySyncReportAggregationResponse> querySyncReportAggregation(QuerySyncReportAggregationRequest request);

    /**
     * @param request the request parameters of RebuildIndex  RebuildIndexRequest
     * @return RebuildIndexResponse
     */
    CompletableFuture<RebuildIndexResponse> rebuildIndex(RebuildIndexRequest request);

    /**
     * @param request the request parameters of Recommend  RecommendRequest
     * @return RecommendResponse
     */
    CompletableFuture<RecommendResponse> recommend(RecommendRequest request);

    /**
     * @param request the request parameters of RefreshFeatureTable  RefreshFeatureTableRequest
     * @return RefreshFeatureTableResponse
     */
    CompletableFuture<RefreshFeatureTableResponse> refreshFeatureTable(RefreshFeatureTableRequest request);

    /**
     * @param request the request parameters of RollbackRankingSystem  RollbackRankingSystemRequest
     * @return RollbackRankingSystemResponse
     */
    CompletableFuture<RollbackRankingSystemResponse> rollbackRankingSystem(RollbackRankingSystemRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation to run an instance to start a full data import task. After you call this API operation, the system creates a dataset. Then, the system imports all data from your data sources into the dataset for data training.</p>
     * 
     * @param request the request parameters of RunInstance  RunInstanceRequest
     * @return RunInstanceResponse
     */
    CompletableFuture<RunInstanceResponse> runInstance(RunInstanceRequest request);

    /**
     * @param request the request parameters of RunRankingModelTemplate  RunRankingModelTemplateRequest
     * @return RunRankingModelTemplateResponse
     */
    CompletableFuture<RunRankingModelTemplateResponse> runRankingModelTemplate(RunRankingModelTemplateRequest request);

    /**
     * @param request the request parameters of RunSampleFormatConfig  RunSampleFormatConfigRequest
     * @return RunSampleFormatConfigResponse
     */
    CompletableFuture<RunSampleFormatConfigResponse> runSampleFormatConfig(RunSampleFormatConfigRequest request);

    /**
     * @param request the request parameters of StopDataSet  StopDataSetRequest
     * @return StopDataSetResponse
     */
    CompletableFuture<StopDataSetResponse> stopDataSet(StopDataSetRequest request);

    /**
     * @param request the request parameters of StopFlowControlTask  StopFlowControlTaskRequest
     * @return StopFlowControlTaskResponse
     */
    CompletableFuture<StopFlowControlTaskResponse> stopFlowControlTask(StopFlowControlTaskRequest request);

    /**
     * @param request the request parameters of UnLockIndexVersion  UnLockIndexVersionRequest
     * @return UnLockIndexVersionResponse
     */
    CompletableFuture<UnLockIndexVersionResponse> unLockIndexVersion(UnLockIndexVersionRequest request);

    /**
     * @param request the request parameters of UpdateExperimentBasicInfo  UpdateExperimentBasicInfoRequest
     * @return UpdateExperimentBasicInfoResponse
     */
    CompletableFuture<UpdateExperimentBasicInfoResponse> updateExperimentBasicInfo(UpdateExperimentBasicInfoRequest request);

    /**
     * @param request the request parameters of UpdateExperimentConfig  UpdateExperimentConfigRequest
     * @return UpdateExperimentConfigResponse
     */
    CompletableFuture<UpdateExperimentConfigResponse> updateExperimentConfig(UpdateExperimentConfigRequest request);

    /**
     * @param request the request parameters of UpdateExperimentStatus  UpdateExperimentStatusRequest
     * @return UpdateExperimentStatusResponse
     */
    CompletableFuture<UpdateExperimentStatusResponse> updateExperimentStatus(UpdateExperimentStatusRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify the quotas of a specified instance.
     * The limits on the number of users: 1,000,000 to 10,000,000. The limits on the number of items: 1,000,000 to 10,000,000. The limits on the queries per second (QPS) for recommendation requests: 10 to 500.</p>
     * 
     * @param request the request parameters of UpgradeInstance  UpgradeInstanceRequest
     * @return UpgradeInstanceResponse
     */
    CompletableFuture<UpgradeInstanceResponse> upgradeInstance(UpgradeInstanceRequest request);

    /**
     * @param request the request parameters of ValidateInstance  ValidateInstanceRequest
     * @return ValidateInstanceResponse
     */
    CompletableFuture<ValidateInstanceResponse> validateInstance(ValidateInstanceRequest request);

    /**
     * @param request the request parameters of VerifyRankingSystem  VerifyRankingSystemRequest
     * @return VerifyRankingSystemResponse
     */
    CompletableFuture<VerifyRankingSystemResponse> verifyRankingSystem(VerifyRankingSystemRequest request);

}
