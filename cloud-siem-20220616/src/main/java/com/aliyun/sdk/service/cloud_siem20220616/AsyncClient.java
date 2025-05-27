// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cloud_siem20220616.models.*;
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
     * @param request the request parameters of AddDataSource  AddDataSourceRequest
     * @return AddDataSourceResponse
     */
    CompletableFuture<AddDataSourceResponse> addDataSource(AddDataSourceRequest request);

    /**
     * @param request the request parameters of AddDataSourceLog  AddDataSourceLogRequest
     * @return AddDataSourceLogResponse
     */
    CompletableFuture<AddDataSourceLogResponse> addDataSourceLog(AddDataSourceLogRequest request);

    /**
     * @param request the request parameters of AddUserSourceLogConfig  AddUserSourceLogConfigRequest
     * @return AddUserSourceLogConfigResponse
     */
    CompletableFuture<AddUserSourceLogConfigResponse> addUserSourceLogConfig(AddUserSourceLogConfigRequest request);

    /**
     * @param request the request parameters of BindAccount  BindAccountRequest
     * @return BindAccountResponse
     */
    CompletableFuture<BindAccountResponse> bindAccount(BindAccountRequest request);

    /**
     * @param request the request parameters of CloseDelivery  CloseDeliveryRequest
     * @return CloseDeliveryResponse
     */
    CompletableFuture<CloseDeliveryResponse> closeDelivery(CloseDeliveryRequest request);

    /**
     * @param request the request parameters of DeleteAutomateResponseConfig  DeleteAutomateResponseConfigRequest
     * @return DeleteAutomateResponseConfigResponse
     */
    CompletableFuture<DeleteAutomateResponseConfigResponse> deleteAutomateResponseConfig(DeleteAutomateResponseConfigRequest request);

    /**
     * @param request the request parameters of DeleteBindAccount  DeleteBindAccountRequest
     * @return DeleteBindAccountResponse
     */
    CompletableFuture<DeleteBindAccountResponse> deleteBindAccount(DeleteBindAccountRequest request);

    /**
     * @param request the request parameters of DeleteCustomizeRule  DeleteCustomizeRuleRequest
     * @return DeleteCustomizeRuleResponse
     */
    CompletableFuture<DeleteCustomizeRuleResponse> deleteCustomizeRule(DeleteCustomizeRuleRequest request);

    /**
     * @param request the request parameters of DeleteDataSource  DeleteDataSourceRequest
     * @return DeleteDataSourceResponse
     */
    CompletableFuture<DeleteDataSourceResponse> deleteDataSource(DeleteDataSourceRequest request);

    /**
     * @param request the request parameters of DeleteDataSourceLog  DeleteDataSourceLogRequest
     * @return DeleteDataSourceLogResponse
     */
    CompletableFuture<DeleteDataSourceLogResponse> deleteDataSourceLog(DeleteDataSourceLogRequest request);

    /**
     * @param request the request parameters of DeleteWhiteRuleList  DeleteWhiteRuleListRequest
     * @return DeleteWhiteRuleListResponse
     */
    CompletableFuture<DeleteWhiteRuleListResponse> deleteWhiteRuleList(DeleteWhiteRuleListRequest request);

    /**
     * @param request the request parameters of DescribeAggregateFunction  DescribeAggregateFunctionRequest
     * @return DescribeAggregateFunctionResponse
     */
    CompletableFuture<DescribeAggregateFunctionResponse> describeAggregateFunction(DescribeAggregateFunctionRequest request);

    /**
     * @param request the request parameters of DescribeAlertScene  DescribeAlertSceneRequest
     * @return DescribeAlertSceneResponse
     */
    CompletableFuture<DescribeAlertSceneResponse> describeAlertScene(DescribeAlertSceneRequest request);

    /**
     * @param request the request parameters of DescribeAlertSceneByEvent  DescribeAlertSceneByEventRequest
     * @return DescribeAlertSceneByEventResponse
     */
    CompletableFuture<DescribeAlertSceneByEventResponse> describeAlertSceneByEvent(DescribeAlertSceneByEventRequest request);

    /**
     * @param request the request parameters of DescribeAlertSource  DescribeAlertSourceRequest
     * @return DescribeAlertSourceResponse
     */
    CompletableFuture<DescribeAlertSourceResponse> describeAlertSource(DescribeAlertSourceRequest request);

    /**
     * @param request the request parameters of DescribeAlertSourceWithEvent  DescribeAlertSourceWithEventRequest
     * @return DescribeAlertSourceWithEventResponse
     */
    CompletableFuture<DescribeAlertSourceWithEventResponse> describeAlertSourceWithEvent(DescribeAlertSourceWithEventRequest request);

    /**
     * @param request the request parameters of DescribeAlertType  DescribeAlertTypeRequest
     * @return DescribeAlertTypeResponse
     */
    CompletableFuture<DescribeAlertTypeResponse> describeAlertType(DescribeAlertTypeRequest request);

    /**
     * @param request the request parameters of DescribeAlerts  DescribeAlertsRequest
     * @return DescribeAlertsResponse
     */
    CompletableFuture<DescribeAlertsResponse> describeAlerts(DescribeAlertsRequest request);

    /**
     * @param request the request parameters of DescribeAlertsCount  DescribeAlertsCountRequest
     * @return DescribeAlertsCountResponse
     */
    CompletableFuture<DescribeAlertsCountResponse> describeAlertsCount(DescribeAlertsCountRequest request);

    /**
     * @param request the request parameters of DescribeAlertsWithEntity  DescribeAlertsWithEntityRequest
     * @return DescribeAlertsWithEntityResponse
     */
    CompletableFuture<DescribeAlertsWithEntityResponse> describeAlertsWithEntity(DescribeAlertsWithEntityRequest request);

    /**
     * @param request the request parameters of DescribeAlertsWithEvent  DescribeAlertsWithEventRequest
     * @return DescribeAlertsWithEventResponse
     */
    CompletableFuture<DescribeAlertsWithEventResponse> describeAlertsWithEvent(DescribeAlertsWithEventRequest request);

    /**
     * @param request the request parameters of DescribeAuth  DescribeAuthRequest
     * @return DescribeAuthResponse
     */
    CompletableFuture<DescribeAuthResponse> describeAuth(DescribeAuthRequest request);

    /**
     * @param request the request parameters of DescribeAutomateResponseConfigCounter  DescribeAutomateResponseConfigCounterRequest
     * @return DescribeAutomateResponseConfigCounterResponse
     */
    CompletableFuture<DescribeAutomateResponseConfigCounterResponse> describeAutomateResponseConfigCounter(DescribeAutomateResponseConfigCounterRequest request);

    /**
     * @param request the request parameters of DescribeAutomateResponseConfigFeature  DescribeAutomateResponseConfigFeatureRequest
     * @return DescribeAutomateResponseConfigFeatureResponse
     */
    CompletableFuture<DescribeAutomateResponseConfigFeatureResponse> describeAutomateResponseConfigFeature(DescribeAutomateResponseConfigFeatureRequest request);

    /**
     * @param request the request parameters of DescribeAutomateResponseConfigPlayBooks  DescribeAutomateResponseConfigPlayBooksRequest
     * @return DescribeAutomateResponseConfigPlayBooksResponse
     */
    CompletableFuture<DescribeAutomateResponseConfigPlayBooksResponse> describeAutomateResponseConfigPlayBooks(DescribeAutomateResponseConfigPlayBooksRequest request);

    /**
     * @param request the request parameters of DescribeCloudSiemAssets  DescribeCloudSiemAssetsRequest
     * @return DescribeCloudSiemAssetsResponse
     */
    CompletableFuture<DescribeCloudSiemAssetsResponse> describeCloudSiemAssets(DescribeCloudSiemAssetsRequest request);

    /**
     * @param request the request parameters of DescribeCloudSiemAssetsCounter  DescribeCloudSiemAssetsCounterRequest
     * @return DescribeCloudSiemAssetsCounterResponse
     */
    CompletableFuture<DescribeCloudSiemAssetsCounterResponse> describeCloudSiemAssetsCounter(DescribeCloudSiemAssetsCounterRequest request);

    /**
     * @param request the request parameters of DescribeCloudSiemEventDetail  DescribeCloudSiemEventDetailRequest
     * @return DescribeCloudSiemEventDetailResponse
     */
    CompletableFuture<DescribeCloudSiemEventDetailResponse> describeCloudSiemEventDetail(DescribeCloudSiemEventDetailRequest request);

    /**
     * @param request the request parameters of DescribeCloudSiemEvents  DescribeCloudSiemEventsRequest
     * @return DescribeCloudSiemEventsResponse
     */
    CompletableFuture<DescribeCloudSiemEventsResponse> describeCloudSiemEvents(DescribeCloudSiemEventsRequest request);

    /**
     * @param request the request parameters of DescribeCustomizeRuleCount  DescribeCustomizeRuleCountRequest
     * @return DescribeCustomizeRuleCountResponse
     */
    CompletableFuture<DescribeCustomizeRuleCountResponse> describeCustomizeRuleCount(DescribeCustomizeRuleCountRequest request);

    /**
     * @param request the request parameters of DescribeCustomizeRuleTest  DescribeCustomizeRuleTestRequest
     * @return DescribeCustomizeRuleTestResponse
     */
    CompletableFuture<DescribeCustomizeRuleTestResponse> describeCustomizeRuleTest(DescribeCustomizeRuleTestRequest request);

    /**
     * @param request the request parameters of DescribeCustomizeRuleTestHistogram  DescribeCustomizeRuleTestHistogramRequest
     * @return DescribeCustomizeRuleTestHistogramResponse
     */
    CompletableFuture<DescribeCustomizeRuleTestHistogramResponse> describeCustomizeRuleTestHistogram(DescribeCustomizeRuleTestHistogramRequest request);

    /**
     * @param request the request parameters of DescribeDataSourceInstance  DescribeDataSourceInstanceRequest
     * @return DescribeDataSourceInstanceResponse
     */
    CompletableFuture<DescribeDataSourceInstanceResponse> describeDataSourceInstance(DescribeDataSourceInstanceRequest request);

    /**
     * @param request the request parameters of DescribeDataSourceParameters  DescribeDataSourceParametersRequest
     * @return DescribeDataSourceParametersResponse
     */
    CompletableFuture<DescribeDataSourceParametersResponse> describeDataSourceParameters(DescribeDataSourceParametersRequest request);

    /**
     * @param request the request parameters of DescribeDisposeAndPlaybook  DescribeDisposeAndPlaybookRequest
     * @return DescribeDisposeAndPlaybookResponse
     */
    CompletableFuture<DescribeDisposeAndPlaybookResponse> describeDisposeAndPlaybook(DescribeDisposeAndPlaybookRequest request);

    /**
     * @param request the request parameters of DescribeDisposeStrategyPlaybook  DescribeDisposeStrategyPlaybookRequest
     * @return DescribeDisposeStrategyPlaybookResponse
     */
    CompletableFuture<DescribeDisposeStrategyPlaybookResponse> describeDisposeStrategyPlaybook(DescribeDisposeStrategyPlaybookRequest request);

    /**
     * @param request the request parameters of DescribeEntityInfo  DescribeEntityInfoRequest
     * @return DescribeEntityInfoResponse
     */
    CompletableFuture<DescribeEntityInfoResponse> describeEntityInfo(DescribeEntityInfoRequest request);

    /**
     * @param request the request parameters of DescribeEventCountByThreatLevel  DescribeEventCountByThreatLevelRequest
     * @return DescribeEventCountByThreatLevelResponse
     */
    CompletableFuture<DescribeEventCountByThreatLevelResponse> describeEventCountByThreatLevel(DescribeEventCountByThreatLevelRequest request);

    /**
     * @param request the request parameters of DescribeEventDispose  DescribeEventDisposeRequest
     * @return DescribeEventDisposeResponse
     */
    CompletableFuture<DescribeEventDisposeResponse> describeEventDispose(DescribeEventDisposeRequest request);

    /**
     * @param request the request parameters of DescribeImportedLogCount  DescribeImportedLogCountRequest
     * @return DescribeImportedLogCountResponse
     */
    CompletableFuture<DescribeImportedLogCountResponse> describeImportedLogCount(DescribeImportedLogCountRequest request);

    /**
     * @param request the request parameters of DescribeLogFields  DescribeLogFieldsRequest
     * @return DescribeLogFieldsResponse
     */
    CompletableFuture<DescribeLogFieldsResponse> describeLogFields(DescribeLogFieldsRequest request);

    /**
     * @param request the request parameters of DescribeLogSource  DescribeLogSourceRequest
     * @return DescribeLogSourceResponse
     */
    CompletableFuture<DescribeLogSourceResponse> describeLogSource(DescribeLogSourceRequest request);

    /**
     * @param request the request parameters of DescribeLogType  DescribeLogTypeRequest
     * @return DescribeLogTypeResponse
     */
    CompletableFuture<DescribeLogTypeResponse> describeLogType(DescribeLogTypeRequest request);

    /**
     * @param request the request parameters of DescribeOperators  DescribeOperatorsRequest
     * @return DescribeOperatorsResponse
     */
    CompletableFuture<DescribeOperatorsResponse> describeOperators(DescribeOperatorsRequest request);

    /**
     * @param request the request parameters of DescribeProdCount  DescribeProdCountRequest
     * @return DescribeProdCountResponse
     */
    CompletableFuture<DescribeProdCountResponse> describeProdCount(DescribeProdCountRequest request);

    /**
     * @param request the request parameters of DescribeScopeUsers  DescribeScopeUsersRequest
     * @return DescribeScopeUsersResponse
     */
    CompletableFuture<DescribeScopeUsersResponse> describeScopeUsers(DescribeScopeUsersRequest request);

    /**
     * @param request the request parameters of DescribeServiceStatus  DescribeServiceStatusRequest
     * @return DescribeServiceStatusResponse
     */
    CompletableFuture<DescribeServiceStatusResponse> describeServiceStatus(DescribeServiceStatusRequest request);

    /**
     * @param request the request parameters of DescribeStorage  DescribeStorageRequest
     * @return DescribeStorageResponse
     */
    CompletableFuture<DescribeStorageResponse> describeStorage(DescribeStorageRequest request);

    /**
     * @param request the request parameters of DescribeUserBuyStatus  DescribeUserBuyStatusRequest
     * @return DescribeUserBuyStatusResponse
     */
    CompletableFuture<DescribeUserBuyStatusResponse> describeUserBuyStatus(DescribeUserBuyStatusRequest request);

    /**
     * @param request the request parameters of DescribeWafScope  DescribeWafScopeRequest
     * @return DescribeWafScopeResponse
     */
    CompletableFuture<DescribeWafScopeResponse> describeWafScope(DescribeWafScopeRequest request);

    /**
     * @param request the request parameters of DescribeWhiteRuleList  DescribeWhiteRuleListRequest
     * @return DescribeWhiteRuleListResponse
     */
    CompletableFuture<DescribeWhiteRuleListResponse> describeWhiteRuleList(DescribeWhiteRuleListRequest request);

    /**
     * @param request the request parameters of EnableAccessForCloudSiem  EnableAccessForCloudSiemRequest
     * @return EnableAccessForCloudSiemResponse
     */
    CompletableFuture<EnableAccessForCloudSiemResponse> enableAccessForCloudSiem(EnableAccessForCloudSiemRequest request);

    /**
     * @param request the request parameters of EnableServiceForCloudSiem  EnableServiceForCloudSiemRequest
     * @return EnableServiceForCloudSiemResponse
     */
    CompletableFuture<EnableServiceForCloudSiemResponse> enableServiceForCloudSiem(EnableServiceForCloudSiemRequest request);

    /**
     * @param request the request parameters of GetCapacity  GetCapacityRequest
     * @return GetCapacityResponse
     */
    CompletableFuture<GetCapacityResponse> getCapacity(GetCapacityRequest request);

    /**
     * @param request the request parameters of GetStorage  GetStorageRequest
     * @return GetStorageResponse
     */
    CompletableFuture<GetStorageResponse> getStorage(GetStorageRequest request);

    /**
     * @param request the request parameters of ListAccountAccessId  ListAccountAccessIdRequest
     * @return ListAccountAccessIdResponse
     */
    CompletableFuture<ListAccountAccessIdResponse> listAccountAccessId(ListAccountAccessIdRequest request);

    /**
     * @param request the request parameters of ListAccountsByLog  ListAccountsByLogRequest
     * @return ListAccountsByLogResponse
     */
    CompletableFuture<ListAccountsByLogResponse> listAccountsByLog(ListAccountsByLogRequest request);

    /**
     * @param request the request parameters of ListAllProds  ListAllProdsRequest
     * @return ListAllProdsResponse
     */
    CompletableFuture<ListAllProdsResponse> listAllProds(ListAllProdsRequest request);

    /**
     * @param request the request parameters of ListAutomateResponseConfigs  ListAutomateResponseConfigsRequest
     * @return ListAutomateResponseConfigsResponse
     */
    CompletableFuture<ListAutomateResponseConfigsResponse> listAutomateResponseConfigs(ListAutomateResponseConfigsRequest request);

    /**
     * @param request the request parameters of ListBindAccount  ListBindAccountRequest
     * @return ListBindAccountResponse
     */
    CompletableFuture<ListBindAccountResponse> listBindAccount(ListBindAccountRequest request);

    /**
     * @param request the request parameters of ListBindDataSources  ListBindDataSourcesRequest
     * @return ListBindDataSourcesResponse
     */
    CompletableFuture<ListBindDataSourcesResponse> listBindDataSources(ListBindDataSourcesRequest request);

    /**
     * @param request the request parameters of ListCloudSiemCustomizeRules  ListCloudSiemCustomizeRulesRequest
     * @return ListCloudSiemCustomizeRulesResponse
     */
    CompletableFuture<ListCloudSiemCustomizeRulesResponse> listCloudSiemCustomizeRules(ListCloudSiemCustomizeRulesRequest request);

    /**
     * @param request the request parameters of ListCloudSiemPredefinedRules  ListCloudSiemPredefinedRulesRequest
     * @return ListCloudSiemPredefinedRulesResponse
     */
    CompletableFuture<ListCloudSiemPredefinedRulesResponse> listCloudSiemPredefinedRules(ListCloudSiemPredefinedRulesRequest request);

    /**
     * @param request the request parameters of ListCustomizeRuleTestResult  ListCustomizeRuleTestResultRequest
     * @return ListCustomizeRuleTestResultResponse
     */
    CompletableFuture<ListCustomizeRuleTestResultResponse> listCustomizeRuleTestResult(ListCustomizeRuleTestResultRequest request);

    /**
     * @param request the request parameters of ListDataSourceLogs  ListDataSourceLogsRequest
     * @return ListDataSourceLogsResponse
     */
    CompletableFuture<ListDataSourceLogsResponse> listDataSourceLogs(ListDataSourceLogsRequest request);

    /**
     * @param request the request parameters of ListDataSourceTypes  ListDataSourceTypesRequest
     * @return ListDataSourceTypesResponse
     */
    CompletableFuture<ListDataSourceTypesResponse> listDataSourceTypes(ListDataSourceTypesRequest request);

    /**
     * @param request the request parameters of ListDelivery  ListDeliveryRequest
     * @return ListDeliveryResponse
     */
    CompletableFuture<ListDeliveryResponse> listDelivery(ListDeliveryRequest request);

    /**
     * @param request the request parameters of ListDisposeStrategy  ListDisposeStrategyRequest
     * @return ListDisposeStrategyResponse
     */
    CompletableFuture<ListDisposeStrategyResponse> listDisposeStrategy(ListDisposeStrategyRequest request);

    /**
     * @param request the request parameters of ListEntities  ListEntitiesRequest
     * @return ListEntitiesResponse
     */
    CompletableFuture<ListEntitiesResponse> listEntities(ListEntitiesRequest request);

    /**
     * @param request the request parameters of ListImportedLogsByProd  ListImportedLogsByProdRequest
     * @return ListImportedLogsByProdResponse
     */
    CompletableFuture<ListImportedLogsByProdResponse> listImportedLogsByProd(ListImportedLogsByProdRequest request);

    /**
     * @param request the request parameters of ListProjectLogStores  ListProjectLogStoresRequest
     * @return ListProjectLogStoresResponse
     */
    CompletableFuture<ListProjectLogStoresResponse> listProjectLogStores(ListProjectLogStoresRequest request);

    /**
     * @param request the request parameters of ListRdUsers  ListRdUsersRequest
     * @return ListRdUsersResponse
     */
    CompletableFuture<ListRdUsersResponse> listRdUsers(ListRdUsersRequest request);

    /**
     * @param request the request parameters of ModifyBindAccount  ModifyBindAccountRequest
     * @return ModifyBindAccountResponse
     */
    CompletableFuture<ModifyBindAccountResponse> modifyBindAccount(ModifyBindAccountRequest request);

    /**
     * @param request the request parameters of ModifyDataSource  ModifyDataSourceRequest
     * @return ModifyDataSourceResponse
     */
    CompletableFuture<ModifyDataSourceResponse> modifyDataSource(ModifyDataSourceRequest request);

    /**
     * @param request the request parameters of ModifyDataSourceLog  ModifyDataSourceLogRequest
     * @return ModifyDataSourceLogResponse
     */
    CompletableFuture<ModifyDataSourceLogResponse> modifyDataSourceLog(ModifyDataSourceLogRequest request);

    /**
     * @param request the request parameters of OpenDelivery  OpenDeliveryRequest
     * @return OpenDeliveryResponse
     */
    CompletableFuture<OpenDeliveryResponse> openDelivery(OpenDeliveryRequest request);

    /**
     * @param request the request parameters of PostAutomateResponseConfig  PostAutomateResponseConfigRequest
     * @return PostAutomateResponseConfigResponse
     */
    CompletableFuture<PostAutomateResponseConfigResponse> postAutomateResponseConfig(PostAutomateResponseConfigRequest request);

    /**
     * @param request the request parameters of PostCustomizeRule  PostCustomizeRuleRequest
     * @return PostCustomizeRuleResponse
     */
    CompletableFuture<PostCustomizeRuleResponse> postCustomizeRule(PostCustomizeRuleRequest request);

    /**
     * @param request the request parameters of PostCustomizeRuleTest  PostCustomizeRuleTestRequest
     * @return PostCustomizeRuleTestResponse
     */
    CompletableFuture<PostCustomizeRuleTestResponse> postCustomizeRuleTest(PostCustomizeRuleTestRequest request);

    /**
     * @param request the request parameters of PostEventDisposeAndWhiteruleList  PostEventDisposeAndWhiteruleListRequest
     * @return PostEventDisposeAndWhiteruleListResponse
     */
    CompletableFuture<PostEventDisposeAndWhiteruleListResponse> postEventDisposeAndWhiteruleList(PostEventDisposeAndWhiteruleListRequest request);

    /**
     * @param request the request parameters of PostEventWhiteruleList  PostEventWhiteruleListRequest
     * @return PostEventWhiteruleListResponse
     */
    CompletableFuture<PostEventWhiteruleListResponse> postEventWhiteruleList(PostEventWhiteruleListRequest request);

    /**
     * @param request the request parameters of PostFinishCustomizeRuleTest  PostFinishCustomizeRuleTestRequest
     * @return PostFinishCustomizeRuleTestResponse
     */
    CompletableFuture<PostFinishCustomizeRuleTestResponse> postFinishCustomizeRuleTest(PostFinishCustomizeRuleTestRequest request);

    /**
     * @param request the request parameters of PostRuleStatusChange  PostRuleStatusChangeRequest
     * @return PostRuleStatusChangeResponse
     */
    CompletableFuture<PostRuleStatusChangeResponse> postRuleStatusChange(PostRuleStatusChangeRequest request);

    /**
     * @param request the request parameters of RestoreCapacity  RestoreCapacityRequest
     * @return RestoreCapacityResponse
     */
    CompletableFuture<RestoreCapacityResponse> restoreCapacity(RestoreCapacityRequest request);

    /**
     * @param request the request parameters of SetStorage  SetStorageRequest
     * @return SetStorageResponse
     */
    CompletableFuture<SetStorageResponse> setStorage(SetStorageRequest request);

    /**
     * @param request the request parameters of SubmitImportLogTasks  SubmitImportLogTasksRequest
     * @return SubmitImportLogTasksResponse
     */
    CompletableFuture<SubmitImportLogTasksResponse> submitImportLogTasks(SubmitImportLogTasksRequest request);

    /**
     * @param request the request parameters of UpdateAutomateResponseConfigStatus  UpdateAutomateResponseConfigStatusRequest
     * @return UpdateAutomateResponseConfigStatusResponse
     */
    CompletableFuture<UpdateAutomateResponseConfigStatusResponse> updateAutomateResponseConfigStatus(UpdateAutomateResponseConfigStatusRequest request);

    /**
     * @param request the request parameters of UpdateWhiteRuleList  UpdateWhiteRuleListRequest
     * @return UpdateWhiteRuleListResponse
     */
    CompletableFuture<UpdateWhiteRuleListResponse> updateWhiteRuleList(UpdateWhiteRuleListRequest request);

}
