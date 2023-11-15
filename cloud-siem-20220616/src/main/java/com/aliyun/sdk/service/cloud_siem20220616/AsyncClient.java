// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cloud_siem20220616.models.*;
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

    CompletableFuture<BatchJobCheckResponse> batchJobCheck(BatchJobCheckRequest request);

    CompletableFuture<BatchJobSubmitResponse> batchJobSubmit(BatchJobSubmitRequest request);

    CompletableFuture<CloseDeliveryResponse> closeDelivery(CloseDeliveryRequest request);

    CompletableFuture<DeleteAutomateResponseConfigResponse> deleteAutomateResponseConfig(DeleteAutomateResponseConfigRequest request);

    CompletableFuture<DeleteCustomizeRuleResponse> deleteCustomizeRule(DeleteCustomizeRuleRequest request);

    CompletableFuture<DeleteQuickQueryResponse> deleteQuickQuery(DeleteQuickQueryRequest request);

    CompletableFuture<DeleteWhiteRuleListResponse> deleteWhiteRuleList(DeleteWhiteRuleListRequest request);

    CompletableFuture<DescribeAggregateFunctionResponse> describeAggregateFunction(DescribeAggregateFunctionRequest request);

    CompletableFuture<DescribeAlertSceneByEventResponse> describeAlertSceneByEvent(DescribeAlertSceneByEventRequest request);

    CompletableFuture<DescribeAlertSourceResponse> describeAlertSource(DescribeAlertSourceRequest request);

    CompletableFuture<DescribeAlertSourceWithEventResponse> describeAlertSourceWithEvent(DescribeAlertSourceWithEventRequest request);

    CompletableFuture<DescribeAlertTypeResponse> describeAlertType(DescribeAlertTypeRequest request);

    CompletableFuture<DescribeAlertsResponse> describeAlerts(DescribeAlertsRequest request);

    CompletableFuture<DescribeAlertsCountResponse> describeAlertsCount(DescribeAlertsCountRequest request);

    CompletableFuture<DescribeAlertsWithEntityResponse> describeAlertsWithEntity(DescribeAlertsWithEntityRequest request);

    CompletableFuture<DescribeAlertsWithEventResponse> describeAlertsWithEvent(DescribeAlertsWithEventRequest request);

    CompletableFuture<DescribeAttackTimeLineResponse> describeAttackTimeLine(DescribeAttackTimeLineRequest request);

    CompletableFuture<DescribeAutomateResponseConfigCounterResponse> describeAutomateResponseConfigCounter(DescribeAutomateResponseConfigCounterRequest request);

    CompletableFuture<DescribeAutomateResponseConfigFeatureResponse> describeAutomateResponseConfigFeature(DescribeAutomateResponseConfigFeatureRequest request);

    CompletableFuture<DescribeAutomateResponseConfigPlayBooksResponse> describeAutomateResponseConfigPlayBooks(DescribeAutomateResponseConfigPlayBooksRequest request);

    CompletableFuture<DescribeCloudSiemAssetsResponse> describeCloudSiemAssets(DescribeCloudSiemAssetsRequest request);

    CompletableFuture<DescribeCloudSiemAssetsCounterResponse> describeCloudSiemAssetsCounter(DescribeCloudSiemAssetsCounterRequest request);

    CompletableFuture<DescribeCloudSiemEventDetailResponse> describeCloudSiemEventDetail(DescribeCloudSiemEventDetailRequest request);

    CompletableFuture<DescribeCloudSiemEventsResponse> describeCloudSiemEvents(DescribeCloudSiemEventsRequest request);

    CompletableFuture<DescribeCustomizeRuleResponse> describeCustomizeRule(DescribeCustomizeRuleRequest request);

    CompletableFuture<DescribeCustomizeRuleCountResponse> describeCustomizeRuleCount(DescribeCustomizeRuleCountRequest request);

    CompletableFuture<DescribeCustomizeRuleTestResponse> describeCustomizeRuleTest(DescribeCustomizeRuleTestRequest request);

    CompletableFuture<DescribeCustomizeRuleTestHistogramResponse> describeCustomizeRuleTestHistogram(DescribeCustomizeRuleTestHistogramRequest request);

    CompletableFuture<DescribeDisposeAndPlaybookResponse> describeDisposeAndPlaybook(DescribeDisposeAndPlaybookRequest request);

    CompletableFuture<DescribeDisposeStrategyPlaybookResponse> describeDisposeStrategyPlaybook(DescribeDisposeStrategyPlaybookRequest request);

    CompletableFuture<DescribeEntityInfoResponse> describeEntityInfo(DescribeEntityInfoRequest request);

    CompletableFuture<DescribeEventCountByThreatLevelResponse> describeEventCountByThreatLevel(DescribeEventCountByThreatLevelRequest request);

    CompletableFuture<DescribeEventDisposeResponse> describeEventDispose(DescribeEventDisposeRequest request);

    CompletableFuture<DescribeJobStatusResponse> describeJobStatus(DescribeJobStatusRequest request);

    CompletableFuture<DescribeLogFieldsResponse> describeLogFields(DescribeLogFieldsRequest request);

    CompletableFuture<DescribeLogSourceResponse> describeLogSource(DescribeLogSourceRequest request);

    CompletableFuture<DescribeLogStoreResponse> describeLogStore(DescribeLogStoreRequest request);

    CompletableFuture<DescribeLogTypeResponse> describeLogType(DescribeLogTypeRequest request);

    CompletableFuture<DescribeOperatorsResponse> describeOperators(DescribeOperatorsRequest request);

    CompletableFuture<DescribeScopeUsersResponse> describeScopeUsers(DescribeScopeUsersRequest request);

    CompletableFuture<DescribeStorageResponse> describeStorage(DescribeStorageRequest request);

    CompletableFuture<DescribeWafScopeResponse> describeWafScope(DescribeWafScopeRequest request);

    CompletableFuture<DoQuickFieldResponse> doQuickField(DoQuickFieldRequest request);

    CompletableFuture<DoSelfDelegateResponse> doSelfDelegate(DoSelfDelegateRequest request);

    CompletableFuture<GetCapacityResponse> getCapacity(GetCapacityRequest request);

    CompletableFuture<GetHistogramsResponse> getHistograms(GetHistogramsRequest request);

    CompletableFuture<GetLogsResponse> getLogs(GetLogsRequest request);

    CompletableFuture<GetQuickQueryResponse> getQuickQuery(GetQuickQueryRequest request);

    CompletableFuture<GetStorageResponse> getStorage(GetStorageRequest request);

    CompletableFuture<ListAutomateResponseConfigsResponse> listAutomateResponseConfigs(ListAutomateResponseConfigsRequest request);

    CompletableFuture<ListCloudSiemCustomizeRulesResponse> listCloudSiemCustomizeRules(ListCloudSiemCustomizeRulesRequest request);

    CompletableFuture<ListCloudSiemPredefinedRulesResponse> listCloudSiemPredefinedRules(ListCloudSiemPredefinedRulesRequest request);

    CompletableFuture<ListCustomizeRuleTestResultResponse> listCustomizeRuleTestResult(ListCustomizeRuleTestResultRequest request);

    CompletableFuture<ListDeliveryResponse> listDelivery(ListDeliveryRequest request);

    CompletableFuture<ListDisposeStrategyResponse> listDisposeStrategy(ListDisposeStrategyRequest request);

    CompletableFuture<ListOperationResponse> listOperation(ListOperationRequest request);

    CompletableFuture<ListQuickQueryResponse> listQuickQuery(ListQuickQueryRequest request);

    CompletableFuture<OpenDeliveryResponse> openDelivery(OpenDeliveryRequest request);

    CompletableFuture<PostAutomateResponseConfigResponse> postAutomateResponseConfig(PostAutomateResponseConfigRequest request);

    CompletableFuture<PostCustomizeRuleResponse> postCustomizeRule(PostCustomizeRuleRequest request);

    CompletableFuture<PostCustomizeRuleTestResponse> postCustomizeRuleTest(PostCustomizeRuleTestRequest request);

    CompletableFuture<PostEventDisposeAndWhiteruleListResponse> postEventDisposeAndWhiteruleList(PostEventDisposeAndWhiteruleListRequest request);

    CompletableFuture<PostEventWhiteruleListResponse> postEventWhiteruleList(PostEventWhiteruleListRequest request);

    CompletableFuture<PostFinishCustomizeRuleTestResponse> postFinishCustomizeRuleTest(PostFinishCustomizeRuleTestRequest request);

    CompletableFuture<PostRuleStatusChangeResponse> postRuleStatusChange(PostRuleStatusChangeRequest request);

    CompletableFuture<RestoreCapacityResponse> restoreCapacity(RestoreCapacityRequest request);

    CompletableFuture<SaveQuickQueryResponse> saveQuickQuery(SaveQuickQueryRequest request);

    CompletableFuture<SetStorageResponse> setStorage(SetStorageRequest request);

    CompletableFuture<ShowQuickAnalysisResponse> showQuickAnalysis(ShowQuickAnalysisRequest request);

    CompletableFuture<UpdateAutomateResponseConfigStatusResponse> updateAutomateResponseConfigStatus(UpdateAutomateResponseConfigStatusRequest request);

    CompletableFuture<UpdateWhiteRuleListResponse> updateWhiteRuleList(UpdateWhiteRuleListRequest request);

}
