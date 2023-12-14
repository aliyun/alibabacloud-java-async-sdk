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

    CompletableFuture<AddDataSourceResponse> addDataSource(AddDataSourceRequest request);

    CompletableFuture<AddDataSourceLogResponse> addDataSourceLog(AddDataSourceLogRequest request);

    CompletableFuture<AddUserResponse> addUser(AddUserRequest request);

    CompletableFuture<AddUserSourceLogConfigResponse> addUserSourceLogConfig(AddUserSourceLogConfigRequest request);

    CompletableFuture<BatchJobCheckResponse> batchJobCheck(BatchJobCheckRequest request);

    CompletableFuture<BatchJobSubmitResponse> batchJobSubmit(BatchJobSubmitRequest request);

    CompletableFuture<BindAccountResponse> bindAccount(BindAccountRequest request);

    CompletableFuture<CloseDeliveryResponse> closeDelivery(CloseDeliveryRequest request);

    CompletableFuture<DeleteAutomateResponseConfigResponse> deleteAutomateResponseConfig(DeleteAutomateResponseConfigRequest request);

    CompletableFuture<DeleteBindAccountResponse> deleteBindAccount(DeleteBindAccountRequest request);

    CompletableFuture<DeleteCustomizeRuleResponse> deleteCustomizeRule(DeleteCustomizeRuleRequest request);

    CompletableFuture<DeleteDataSourceResponse> deleteDataSource(DeleteDataSourceRequest request);

    CompletableFuture<DeleteDataSourceLogResponse> deleteDataSourceLog(DeleteDataSourceLogRequest request);

    CompletableFuture<DeleteQuickQueryResponse> deleteQuickQuery(DeleteQuickQueryRequest request);

    CompletableFuture<DeleteUserResponse> deleteUser(DeleteUserRequest request);

    CompletableFuture<DeleteWhiteRuleListResponse> deleteWhiteRuleList(DeleteWhiteRuleListRequest request);

    CompletableFuture<DescribeAggregateFunctionResponse> describeAggregateFunction(DescribeAggregateFunctionRequest request);

    CompletableFuture<DescribeAlertSceneResponse> describeAlertScene(DescribeAlertSceneRequest request);

    CompletableFuture<DescribeAlertSceneByEventResponse> describeAlertSceneByEvent(DescribeAlertSceneByEventRequest request);

    CompletableFuture<DescribeAlertSourceResponse> describeAlertSource(DescribeAlertSourceRequest request);

    CompletableFuture<DescribeAlertSourceWithEventResponse> describeAlertSourceWithEvent(DescribeAlertSourceWithEventRequest request);

    CompletableFuture<DescribeAlertTypeResponse> describeAlertType(DescribeAlertTypeRequest request);

    CompletableFuture<DescribeAlertsResponse> describeAlerts(DescribeAlertsRequest request);

    CompletableFuture<DescribeAlertsCountResponse> describeAlertsCount(DescribeAlertsCountRequest request);

    CompletableFuture<DescribeAlertsWithEntityResponse> describeAlertsWithEntity(DescribeAlertsWithEntityRequest request);

    CompletableFuture<DescribeAlertsWithEventResponse> describeAlertsWithEvent(DescribeAlertsWithEventRequest request);

    CompletableFuture<DescribeAttackTimeLineResponse> describeAttackTimeLine(DescribeAttackTimeLineRequest request);

    CompletableFuture<DescribeAuthResponse> describeAuth(DescribeAuthRequest request);

    CompletableFuture<DescribeAutomateResponseConfigCounterResponse> describeAutomateResponseConfigCounter(DescribeAutomateResponseConfigCounterRequest request);

    CompletableFuture<DescribeAutomateResponseConfigFeatureResponse> describeAutomateResponseConfigFeature(DescribeAutomateResponseConfigFeatureRequest request);

    CompletableFuture<DescribeAutomateResponseConfigPlayBooksResponse> describeAutomateResponseConfigPlayBooks(DescribeAutomateResponseConfigPlayBooksRequest request);

    CompletableFuture<DescribeCloudSiemAssetsResponse> describeCloudSiemAssets(DescribeCloudSiemAssetsRequest request);

    CompletableFuture<DescribeCloudSiemAssetsCounterResponse> describeCloudSiemAssetsCounter(DescribeCloudSiemAssetsCounterRequest request);

    CompletableFuture<DescribeCloudSiemEventDetailResponse> describeCloudSiemEventDetail(DescribeCloudSiemEventDetailRequest request);

    CompletableFuture<DescribeCloudSiemEventsResponse> describeCloudSiemEvents(DescribeCloudSiemEventsRequest request);

    CompletableFuture<DescribeCsImportedProdStatusByUserResponse> describeCsImportedProdStatusByUser(DescribeCsImportedProdStatusByUserRequest request);

    CompletableFuture<DescribeCustomizeRuleResponse> describeCustomizeRule(DescribeCustomizeRuleRequest request);

    CompletableFuture<DescribeCustomizeRuleCountResponse> describeCustomizeRuleCount(DescribeCustomizeRuleCountRequest request);

    CompletableFuture<DescribeCustomizeRuleTestResponse> describeCustomizeRuleTest(DescribeCustomizeRuleTestRequest request);

    CompletableFuture<DescribeCustomizeRuleTestHistogramResponse> describeCustomizeRuleTestHistogram(DescribeCustomizeRuleTestHistogramRequest request);

    CompletableFuture<DescribeDataSourceInstanceResponse> describeDataSourceInstance(DescribeDataSourceInstanceRequest request);

    CompletableFuture<DescribeDataSourceParametersResponse> describeDataSourceParameters(DescribeDataSourceParametersRequest request);

    CompletableFuture<DescribeDisposeAndPlaybookResponse> describeDisposeAndPlaybook(DescribeDisposeAndPlaybookRequest request);

    CompletableFuture<DescribeDisposeStrategyPlaybookResponse> describeDisposeStrategyPlaybook(DescribeDisposeStrategyPlaybookRequest request);

    CompletableFuture<DescribeEntityInfoResponse> describeEntityInfo(DescribeEntityInfoRequest request);

    CompletableFuture<DescribeEventCountByThreatLevelResponse> describeEventCountByThreatLevel(DescribeEventCountByThreatLevelRequest request);

    CompletableFuture<DescribeEventDisposeResponse> describeEventDispose(DescribeEventDisposeRequest request);

    CompletableFuture<DescribeImportedLogCountResponse> describeImportedLogCount(DescribeImportedLogCountRequest request);

    CompletableFuture<DescribeJobStatusResponse> describeJobStatus(DescribeJobStatusRequest request);

    CompletableFuture<DescribeLogFieldsResponse> describeLogFields(DescribeLogFieldsRequest request);

    CompletableFuture<DescribeLogSourceResponse> describeLogSource(DescribeLogSourceRequest request);

    CompletableFuture<DescribeLogStoreResponse> describeLogStore(DescribeLogStoreRequest request);

    CompletableFuture<DescribeLogTypeResponse> describeLogType(DescribeLogTypeRequest request);

    CompletableFuture<DescribeOperatorsResponse> describeOperators(DescribeOperatorsRequest request);

    CompletableFuture<DescribeProdCountResponse> describeProdCount(DescribeProdCountRequest request);

    CompletableFuture<DescribeScopeUsersResponse> describeScopeUsers(DescribeScopeUsersRequest request);

    CompletableFuture<DescribeServiceStatusResponse> describeServiceStatus(DescribeServiceStatusRequest request);

    CompletableFuture<DescribeStorageResponse> describeStorage(DescribeStorageRequest request);

    CompletableFuture<DescribeUserBuyStatusResponse> describeUserBuyStatus(DescribeUserBuyStatusRequest request);

    CompletableFuture<DescribeWafScopeResponse> describeWafScope(DescribeWafScopeRequest request);

    CompletableFuture<DescribeWhiteRuleListResponse> describeWhiteRuleList(DescribeWhiteRuleListRequest request);

    CompletableFuture<DoQuickFieldResponse> doQuickField(DoQuickFieldRequest request);

    CompletableFuture<DoSelfDelegateResponse> doSelfDelegate(DoSelfDelegateRequest request);

    CompletableFuture<EnableAccessForCloudSiemResponse> enableAccessForCloudSiem(EnableAccessForCloudSiemRequest request);

    CompletableFuture<EnableServiceForCloudSiemResponse> enableServiceForCloudSiem(EnableServiceForCloudSiemRequest request);

    CompletableFuture<GetCapacityResponse> getCapacity(GetCapacityRequest request);

    CompletableFuture<GetHistogramsResponse> getHistograms(GetHistogramsRequest request);

    CompletableFuture<GetLogsResponse> getLogs(GetLogsRequest request);

    CompletableFuture<GetQuickQueryResponse> getQuickQuery(GetQuickQueryRequest request);

    CompletableFuture<GetStorageResponse> getStorage(GetStorageRequest request);

    CompletableFuture<ListAccountAccessIdResponse> listAccountAccessId(ListAccountAccessIdRequest request);

    CompletableFuture<ListAccountsByLogResponse> listAccountsByLog(ListAccountsByLogRequest request);

    CompletableFuture<ListAllProdsResponse> listAllProds(ListAllProdsRequest request);

    CompletableFuture<ListAutomateResponseConfigsResponse> listAutomateResponseConfigs(ListAutomateResponseConfigsRequest request);

    CompletableFuture<ListBindAccountResponse> listBindAccount(ListBindAccountRequest request);

    CompletableFuture<ListBindDataSourcesResponse> listBindDataSources(ListBindDataSourcesRequest request);

    CompletableFuture<ListCloudSiemCustomizeRulesResponse> listCloudSiemCustomizeRules(ListCloudSiemCustomizeRulesRequest request);

    CompletableFuture<ListCloudSiemPredefinedRulesResponse> listCloudSiemPredefinedRules(ListCloudSiemPredefinedRulesRequest request);

    CompletableFuture<ListCustomizeRuleTestResultResponse> listCustomizeRuleTestResult(ListCustomizeRuleTestResultRequest request);

    CompletableFuture<ListDataSourceLogsResponse> listDataSourceLogs(ListDataSourceLogsRequest request);

    CompletableFuture<ListDataSourceTypesResponse> listDataSourceTypes(ListDataSourceTypesRequest request);

    CompletableFuture<ListDeliveryResponse> listDelivery(ListDeliveryRequest request);

    CompletableFuture<ListDisposeStrategyResponse> listDisposeStrategy(ListDisposeStrategyRequest request);

    CompletableFuture<ListImportedLogsByProdResponse> listImportedLogsByProd(ListImportedLogsByProdRequest request);

    CompletableFuture<ListOperationResponse> listOperation(ListOperationRequest request);

    CompletableFuture<ListProjectLogStoresResponse> listProjectLogStores(ListProjectLogStoresRequest request);

    CompletableFuture<ListQuickQueryResponse> listQuickQuery(ListQuickQueryRequest request);

    CompletableFuture<ListRdUsersResponse> listRdUsers(ListRdUsersRequest request);

    CompletableFuture<ListUserProdLogsResponse> listUserProdLogs(ListUserProdLogsRequest request);

    CompletableFuture<ListUsersByProdResponse> listUsersByProd(ListUsersByProdRequest request);

    CompletableFuture<ModifyBindAccountResponse> modifyBindAccount(ModifyBindAccountRequest request);

    CompletableFuture<ModifyDataSourceResponse> modifyDataSource(ModifyDataSourceRequest request);

    CompletableFuture<ModifyDataSourceLogResponse> modifyDataSourceLog(ModifyDataSourceLogRequest request);

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

    CompletableFuture<SubmitImportLogTasksResponse> submitImportLogTasks(SubmitImportLogTasksRequest request);

    CompletableFuture<SubmitJobsResponse> submitJobs(SubmitJobsRequest request);

    CompletableFuture<UpdateAutomateResponseConfigStatusResponse> updateAutomateResponseConfigStatus(UpdateAutomateResponseConfigStatusRequest request);

    CompletableFuture<UpdateWhiteRuleListResponse> updateWhiteRuleList(UpdateWhiteRuleListRequest request);

}
