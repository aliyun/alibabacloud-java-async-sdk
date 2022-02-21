// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.airec20181012.models.*;
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

    CompletableFuture<AttachDatasetResponse> attachDataset(AttachDatasetRequest request);

    CompletableFuture<CreateDiversifyResponse> createDiversify(CreateDiversifyRequest request);

    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    CompletableFuture<CreateMixResponse> createMix(CreateMixRequest request);

    CompletableFuture<CreateRuleResponse> createRule(CreateRuleRequest request);

    CompletableFuture<CreateSceneResponse> createScene(CreateSceneRequest request);

    CompletableFuture<DeleteDataSetResponse> deleteDataSet(DeleteDataSetRequest request);

    CompletableFuture<DeleteDiversifyResponse> deleteDiversify(DeleteDiversifyRequest request);

    CompletableFuture<DeleteMixResponse> deleteMix(DeleteMixRequest request);

    CompletableFuture<DeleteSceneResponse> deleteScene(DeleteSceneRequest request);

    CompletableFuture<DescribeDataSetMessageResponse> describeDataSetMessage(DescribeDataSetMessageRequest request);

    CompletableFuture<DescribeDataSetReportResponse> describeDataSetReport(DescribeDataSetReportRequest request);

    CompletableFuture<DescribeDiversifyResponse> describeDiversify(DescribeDiversifyRequest request);

    CompletableFuture<DescribeExposureSettingsResponse> describeExposureSettings(DescribeExposureSettingsRequest request);

    CompletableFuture<DescribeInstanceResponse> describeInstance(DescribeInstanceRequest request);

    CompletableFuture<DescribeMixResponse> describeMix(DescribeMixRequest request);

    CompletableFuture<DescribeQuotaResponse> describeQuota(DescribeQuotaRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeRuleResponse> describeRule(DescribeRuleRequest request);

    CompletableFuture<DescribeSceneResponse> describeScene(DescribeSceneRequest request);

    CompletableFuture<DescribeSceneThroughputResponse> describeSceneThroughput(DescribeSceneThroughputRequest request);

    CompletableFuture<DescribeSyncReportDetailResponse> describeSyncReportDetail(DescribeSyncReportDetailRequest request);

    CompletableFuture<DescribeSyncReportOutliersResponse> describeSyncReportOutliers(DescribeSyncReportOutliersRequest request);

    CompletableFuture<DescribeUserMetricsResponse> describeUserMetrics(DescribeUserMetricsRequest request);

    CompletableFuture<DowngradeInstanceResponse> downgradeInstance(DowngradeInstanceRequest request);

    CompletableFuture<ListDashboardResponse> listDashboard(ListDashboardRequest request);

    CompletableFuture<ListDashboardDetailsResponse> listDashboardDetails(ListDashboardDetailsRequest request);

    CompletableFuture<ListDashboardDetailsFlowsResponse> listDashboardDetailsFlows(ListDashboardDetailsFlowsRequest request);

    CompletableFuture<ListDashboardMetricsResponse> listDashboardMetrics(ListDashboardMetricsRequest request);

    CompletableFuture<ListDashboardMetricsFlowsResponse> listDashboardMetricsFlows(ListDashboardMetricsFlowsRequest request);

    CompletableFuture<ListDashboardParametersResponse> listDashboardParameters(ListDashboardParametersRequest request);

    CompletableFuture<ListDashboardUidResponse> listDashboardUid(ListDashboardUidRequest request);

    CompletableFuture<ListDataSetResponse> listDataSet(ListDataSetRequest request);

    CompletableFuture<ListDataSourceResponse> listDataSource(ListDataSourceRequest request);

    CompletableFuture<ListDiversifyResponse> listDiversify(ListDiversifyRequest request);

    CompletableFuture<ListInstanceResponse> listInstance(ListInstanceRequest request);

    CompletableFuture<ListInstanceTaskResponse> listInstanceTask(ListInstanceTaskRequest request);

    CompletableFuture<ListItemsResponse> listItems(ListItemsRequest request);

    CompletableFuture<ListLogsResponse> listLogs(ListLogsRequest request);

    CompletableFuture<ListMixResponse> listMix(ListMixRequest request);

    CompletableFuture<ListRuleConditionsResponse> listRuleConditions(ListRuleConditionsRequest request);

    CompletableFuture<ListRuleTasksResponse> listRuleTasks(ListRuleTasksRequest request);

    CompletableFuture<ListRulesResponse> listRules(ListRulesRequest request);

    CompletableFuture<ListSceneItemsResponse> listSceneItems(ListSceneItemsRequest request);

    CompletableFuture<ListScenesResponse> listScenes(ListScenesRequest request);

    CompletableFuture<ListUmengAppkeysResponse> listUmengAppkeys(ListUmengAppkeysRequest request);

    CompletableFuture<ModifyDataSourceResponse> modifyDataSource(ModifyDataSourceRequest request);

    CompletableFuture<ModifyDiversifyResponse> modifyDiversify(ModifyDiversifyRequest request);

    CompletableFuture<ModifyExposureSettingsResponse> modifyExposureSettings(ModifyExposureSettingsRequest request);

    CompletableFuture<ModifyInstanceResponse> modifyInstance(ModifyInstanceRequest request);

    CompletableFuture<ModifyItemsResponse> modifyItems(ModifyItemsRequest request);

    CompletableFuture<ModifyMixResponse> modifyMix(ModifyMixRequest request);

    CompletableFuture<ModifyRuleResponse> modifyRule(ModifyRuleRequest request);

    CompletableFuture<ModifySceneResponse> modifyScene(ModifySceneRequest request);

    CompletableFuture<PublishRuleResponse> publishRule(PublishRuleRequest request);

    CompletableFuture<PushDocumentResponse> pushDocument(PushDocumentRequest request);

    CompletableFuture<PushInterventionResponse> pushIntervention(PushInterventionRequest request);

    CompletableFuture<QueryDataMessageResponse> queryDataMessage(QueryDataMessageRequest request);

    CompletableFuture<QueryDataMessageStatisticsResponse> queryDataMessageStatistics(QueryDataMessageStatisticsRequest request);

    CompletableFuture<QueryExceptionHistoryResponse> queryExceptionHistory(QueryExceptionHistoryRequest request);

    CompletableFuture<QueryRawDataResponse> queryRawData(QueryRawDataRequest request);

    CompletableFuture<QuerySingleAggregationReportResponse> querySingleAggregationReport(QuerySingleAggregationReportRequest request);

    CompletableFuture<QuerySingleReportResponse> querySingleReport(QuerySingleReportRequest request);

    CompletableFuture<QuerySyncReportAggregationResponse> querySyncReportAggregation(QuerySyncReportAggregationRequest request);

    CompletableFuture<RecommendResponse> recommend(RecommendRequest request);

    CompletableFuture<RunInstanceResponse> runInstance(RunInstanceRequest request);

    CompletableFuture<StopDataSetResponse> stopDataSet(StopDataSetRequest request);

    CompletableFuture<UpgradeInstanceResponse> upgradeInstance(UpgradeInstanceRequest request);

    CompletableFuture<ValidateInstanceResponse> validateInstance(ValidateInstanceRequest request);

}
