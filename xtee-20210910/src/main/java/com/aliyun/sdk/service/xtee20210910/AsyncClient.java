// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.xtee20210910.models.*;
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

    CompletableFuture<BindVariableResponse> bindVariable(BindVariableRequest request);

    CompletableFuture<CheckCustVariableLimitResponse> checkCustVariableLimit(CheckCustVariableLimitRequest request);

    CompletableFuture<CheckExpressionVariableLimitResponse> checkExpressionVariableLimit(CheckExpressionVariableLimitRequest request);

    CompletableFuture<CheckFieldLimitResponse> checkFieldLimit(CheckFieldLimitRequest request);

    CompletableFuture<CheckPermissionResponse> checkPermission(CheckPermissionRequest request);

    CompletableFuture<CheckUsageVariableResponse> checkUsageVariable(CheckUsageVariableRequest request);

    CompletableFuture<ClearNameListResponse> clearNameList(ClearNameListRequest request);

    CompletableFuture<CreateAnalysisConditionFavoriteResponse> createAnalysisConditionFavorite(CreateAnalysisConditionFavoriteRequest request);

    CompletableFuture<CreateAnalysisExportTaskResponse> createAnalysisExportTask(CreateAnalysisExportTaskRequest request);

    CompletableFuture<CreateAppKeyResponse> createAppKey(CreateAppKeyRequest request);

    CompletableFuture<CreateAuthorizationUserResponse> createAuthorizationUser(CreateAuthorizationUserRequest request);

    CompletableFuture<CreateCustVariableResponse> createCustVariable(CreateCustVariableRequest request);

    CompletableFuture<CreateDataSourceResponse> createDataSource(CreateDataSourceRequest request);

    CompletableFuture<CreateEventResponse> createEvent(CreateEventRequest request);

    CompletableFuture<CreateExpressionVariableResponse> createExpressionVariable(CreateExpressionVariableRequest request);

    CompletableFuture<CreateFieldResponse> createField(CreateFieldRequest request);

    CompletableFuture<CreateGroupSignResponse> createGroupSign(CreateGroupSignRequest request);

    CompletableFuture<CreateMonitorTaskResponse> createMonitorTask(CreateMonitorTaskRequest request);

    CompletableFuture<CreatePocResponse> createPoc(CreatePocRequest request);

    CompletableFuture<CreatePocEvResponse> createPocEv(CreatePocEvRequest request);

    CompletableFuture<CreateQueryVariableResponse> createQueryVariable(CreateQueryVariableRequest request);

    CompletableFuture<CreateRecommendEventRuleResponse> createRecommendEventRule(CreateRecommendEventRuleRequest request);

    CompletableFuture<CreateRecommendTaskResponse> createRecommendTask(CreateRecommendTaskRequest request);

    CompletableFuture<CreateReplenishTaskResponse> createReplenishTask(CreateReplenishTaskRequest request);

    CompletableFuture<CreateRuleResponse> createRule(CreateRuleRequest request);

    CompletableFuture<CreateSampleResponse> createSample(CreateSampleRequest request);

    CompletableFuture<CreateSampleApiResponse> createSampleApi(CreateSampleApiRequest request);

    CompletableFuture<CreateSampleDataResponse> createSampleData(CreateSampleDataRequest request);

    CompletableFuture<CreateSimulationTaskResponse> createSimulationTask(CreateSimulationTaskRequest request);

    CompletableFuture<CreateTaskResponse> createTask(CreateTaskRequest request);

    CompletableFuture<CreateTemplateResponse> createTemplate(CreateTemplateRequest request);

    CompletableFuture<DeleteAnalysisConditionFavoriteResponse> deleteAnalysisConditionFavorite(DeleteAnalysisConditionFavoriteRequest request);

    CompletableFuture<DeleteAuthUserResponse> deleteAuthUser(DeleteAuthUserRequest request);

    CompletableFuture<DeleteByPassShuntEventResponse> deleteByPassShuntEvent(DeleteByPassShuntEventRequest request);

    CompletableFuture<DeleteCustVariableResponse> deleteCustVariable(DeleteCustVariableRequest request);

    CompletableFuture<DeleteDataSourceResponse> deleteDataSource(DeleteDataSourceRequest request);

    CompletableFuture<DeleteExpressionVariableResponse> deleteExpressionVariable(DeleteExpressionVariableRequest request);

    CompletableFuture<DeleteFieldResponse> deleteField(DeleteFieldRequest request);

    CompletableFuture<DeleteNameListResponse> deleteNameList(DeleteNameListRequest request);

    CompletableFuture<DeleteNameListDataResponse> deleteNameListData(DeleteNameListDataRequest request);

    CompletableFuture<DeleteQueryVariableResponse> deleteQueryVariable(DeleteQueryVariableRequest request);

    CompletableFuture<DeleteRuleResponse> deleteRule(DeleteRuleRequest request);

    CompletableFuture<DeleteSampleBatchResponse> deleteSampleBatch(DeleteSampleBatchRequest request);

    CompletableFuture<DeleteSampleDataResponse> deleteSampleData(DeleteSampleDataRequest request);

    CompletableFuture<DeleteTaskResponse> deleteTask(DeleteTaskRequest request);

    CompletableFuture<DescribeAdvanceSearchLeftVariableListResponse> describeAdvanceSearchLeftVariableList(DescribeAdvanceSearchLeftVariableListRequest request);

    CompletableFuture<DescribeAdvanceSearchPageListResponse> describeAdvanceSearchPageList(DescribeAdvanceSearchPageListRequest request);

    CompletableFuture<DescribeAllDataSourceResponse> describeAllDataSource(DescribeAllDataSourceRequest request);

    CompletableFuture<DescribeAllEventNameAndCodeResponse> describeAllEventNameAndCode(DescribeAllEventNameAndCodeRequest request);

    CompletableFuture<DescribeAllRootVariableResponse> describeAllRootVariable(DescribeAllRootVariableRequest request);

    CompletableFuture<DescribeAnalysisColumnFieldListResponse> describeAnalysisColumnFieldList(DescribeAnalysisColumnFieldListRequest request);

    CompletableFuture<DescribeAnalysisColumnListResponse> describeAnalysisColumnList(DescribeAnalysisColumnListRequest request);

    CompletableFuture<DescribeAnalysisConditionFavoriteListResponse> describeAnalysisConditionFavoriteList(DescribeAnalysisConditionFavoriteListRequest request);

    CompletableFuture<DescribeAnalysisExportTaskDownloadUrlResponse> describeAnalysisExportTaskDownloadUrl(DescribeAnalysisExportTaskDownloadUrlRequest request);

    CompletableFuture<DescribeApiResponse> describeApi(DescribeApiRequest request);

    CompletableFuture<DescribeApiGroupsResponse> describeApiGroups(DescribeApiGroupsRequest request);

    CompletableFuture<DescribeApiLimitResponse> describeApiLimit(DescribeApiLimitRequest request);

    CompletableFuture<DescribeApiNameListResponse> describeApiNameList(DescribeApiNameListRequest request);

    CompletableFuture<DescribeApiVariableResponse> describeApiVariable(DescribeApiVariableRequest request);

    CompletableFuture<DescribeApisResponse> describeApis(DescribeApisRequest request);

    CompletableFuture<DescribeAppKeyPageResponse> describeAppKeyPage(DescribeAppKeyPageRequest request);

    CompletableFuture<DescribeAuditConfigResponse> describeAuditConfig(DescribeAuditConfigRequest request);

    CompletableFuture<DescribeAuditDetailsResponse> describeAuditDetails(DescribeAuditDetailsRequest request);

    CompletableFuture<DescribeAuditPageListResponse> describeAuditPageList(DescribeAuditPageListRequest request);

    CompletableFuture<DescribeAuthEventNameListResponse> describeAuthEventNameList(DescribeAuthEventNameListRequest request);

    CompletableFuture<DescribeAuthRulePageListResponse> describeAuthRulePageList(DescribeAuthRulePageListRequest request);

    CompletableFuture<DescribeAuthSceneListResponse> describeAuthSceneList(DescribeAuthSceneListRequest request);

    CompletableFuture<DescribeAuthScenePageListResponse> describeAuthScenePageList(DescribeAuthScenePageListRequest request);

    CompletableFuture<DescribeAuthStatusResponse> describeAuthStatus(DescribeAuthStatusRequest request);

    CompletableFuture<DescribeAvgExecuteCostReportResponse> describeAvgExecuteCostReport(DescribeAvgExecuteCostReportRequest request);

    CompletableFuture<DescribeBasicSearchPageListResponse> describeBasicSearchPageList(DescribeBasicSearchPageListRequest request);

    CompletableFuture<DescribeBasicStartResponse> describeBasicStart(DescribeBasicStartRequest request);

    CompletableFuture<DescribeByPassShuntEventResponse> describeByPassShuntEvent(DescribeByPassShuntEventRequest request);

    CompletableFuture<DescribeCustVariableConfigListResponse> describeCustVariableConfigList(DescribeCustVariableConfigListRequest request);

    CompletableFuture<DescribeCustVariableDetailResponse> describeCustVariableDetail(DescribeCustVariableDetailRequest request);

    CompletableFuture<DescribeCustVariablePageResponse> describeCustVariablePage(DescribeCustVariablePageRequest request);

    CompletableFuture<DescribeDataSourceDataDownloadUrlResponse> describeDataSourceDataDownloadUrl(DescribeDataSourceDataDownloadUrlRequest request);

    CompletableFuture<DescribeDataSourceFieldsResponse> describeDataSourceFields(DescribeDataSourceFieldsRequest request);

    CompletableFuture<DescribeDataSourcePageListResponse> describeDataSourcePageList(DescribeDataSourcePageListRequest request);

    CompletableFuture<DescribeDecisionResultFluctuationResponse> describeDecisionResultFluctuation(DescribeDecisionResultFluctuationRequest request);

    CompletableFuture<DescribeDecisionResultTrendResponse> describeDecisionResultTrend(DescribeDecisionResultTrendRequest request);

    CompletableFuture<DescribeDetailStartResponse> describeDetailStart(DescribeDetailStartRequest request);

    CompletableFuture<DescribeDownloadUrlResponse> describeDownloadUrl(DescribeDownloadUrlRequest request);

    CompletableFuture<DescribeEventBaseInfoByEventCodeResponse> describeEventBaseInfoByEventCode(DescribeEventBaseInfoByEventCodeRequest request);

    CompletableFuture<DescribeEventCountResponse> describeEventCount(DescribeEventCountRequest request);

    CompletableFuture<DescribeEventDetailByRequestIdResponse> describeEventDetailByRequestId(DescribeEventDetailByRequestIdRequest request);

    CompletableFuture<DescribeEventLogDetailResponse> describeEventLogDetail(DescribeEventLogDetailRequest request);

    CompletableFuture<DescribeEventLogPageResponse> describeEventLogPage(DescribeEventLogPageRequest request);

    CompletableFuture<DescribeEventPageListResponse> describeEventPageList(DescribeEventPageListRequest request);

    CompletableFuture<DescribeEventResultBarChartResponse> describeEventResultBarChart(DescribeEventResultBarChartRequest request);

    CompletableFuture<DescribeEventResultListResponse> describeEventResultList(DescribeEventResultListRequest request);

    CompletableFuture<DescribeEventTaskHistoryResponse> describeEventTaskHistory(DescribeEventTaskHistoryRequest request);

    CompletableFuture<DescribeEventTotalCountReportResponse> describeEventTotalCountReport(DescribeEventTotalCountReportRequest request);

    CompletableFuture<DescribeEventUploadPolicyResponse> describeEventUploadPolicy(DescribeEventUploadPolicyRequest request);

    CompletableFuture<DescribeEventVariableListResponse> describeEventVariableList(DescribeEventVariableListRequest request);

    CompletableFuture<DescribeEventVariableTemplateBindResponse> describeEventVariableTemplateBind(DescribeEventVariableTemplateBindRequest request);

    CompletableFuture<DescribeEventVariableTemplateListResponse> describeEventVariableTemplateList(DescribeEventVariableTemplateListRequest request);

    CompletableFuture<DescribeEventsVariableListResponse> describeEventsVariableList(DescribeEventsVariableListRequest request);

    CompletableFuture<DescribeExcuteNumResponse> describeExcuteNum(DescribeExcuteNumRequest request);

    CompletableFuture<DescribeExistNameResponse> describeExistName(DescribeExistNameRequest request);

    CompletableFuture<DescribeExistSceneResponse> describeExistScene(DescribeExistSceneRequest request);

    CompletableFuture<DescribeExpressionVariableDetailResponse> describeExpressionVariableDetail(DescribeExpressionVariableDetailRequest request);

    CompletableFuture<DescribeExpressionVariableFunctionListResponse> describeExpressionVariableFunctionList(DescribeExpressionVariableFunctionListRequest request);

    CompletableFuture<DescribeExpressionVariablePageResponse> describeExpressionVariablePage(DescribeExpressionVariablePageRequest request);

    CompletableFuture<DescribeFieldByIdResponse> describeFieldById(DescribeFieldByIdRequest request);

    CompletableFuture<DescribeFieldListResponse> describeFieldList(DescribeFieldListRequest request);

    CompletableFuture<DescribeFieldPageResponse> describeFieldPage(DescribeFieldPageRequest request);

    CompletableFuture<DescribeGroupAccountPageResponse> describeGroupAccountPage(DescribeGroupAccountPageRequest request);

    CompletableFuture<DescribeGroupConditionListResponse> describeGroupConditionList(DescribeGroupConditionListRequest request);

    CompletableFuture<DescribeGroupPageResponse> describeGroupPage(DescribeGroupPageRequest request);

    CompletableFuture<DescribeGroupStatisticsByTodayResponse> describeGroupStatisticsByToday(DescribeGroupStatisticsByTodayRequest request);

    CompletableFuture<DescribeGroupTrendResponse> describeGroupTrend(DescribeGroupTrendRequest request);

    CompletableFuture<DescribeHasRuleNameByEventCodeResponse> describeHasRuleNameByEventCode(DescribeHasRuleNameByEventCodeRequest request);

    CompletableFuture<DescribeHighRiskPieChartResponse> describeHighRiskPieChart(DescribeHighRiskPieChartRequest request);

    CompletableFuture<DescribeHitRuleFluctuationResponse> describeHitRuleFluctuation(DescribeHitRuleFluctuationRequest request);

    CompletableFuture<DescribeHitRuleListResponse> describeHitRuleList(DescribeHitRuleListRequest request);

    CompletableFuture<DescribeHitRuleTrendResponse> describeHitRuleTrend(DescribeHitRuleTrendRequest request);

    CompletableFuture<DescribeInputFeildCountByEventCodeResponse> describeInputFeildCountByEventCode(DescribeInputFeildCountByEventCodeRequest request);

    CompletableFuture<DescribeListPocResponse> describeListPoc(DescribeListPocRequest request);

    CompletableFuture<DescribeLoanExecListResponse> describeLoanExecList(DescribeLoanExecListRequest request);

    CompletableFuture<DescribeLoanTaskListResponse> describeLoanTaskList(DescribeLoanTaskListRequest request);

    CompletableFuture<DescribeMarkPageResponse> describeMarkPage(DescribeMarkPageRequest request);

    CompletableFuture<DescribeMenuPermissionResponse> describeMenuPermission(DescribeMenuPermissionRequest request);

    CompletableFuture<DescribeMonitorTaskLimitResponse> describeMonitorTaskLimit(DescribeMonitorTaskLimitRequest request);

    CompletableFuture<DescribeNameListResponse> describeNameList(DescribeNameListRequest request);

    CompletableFuture<DescribeNameListDownloadUrlResponse> describeNameListDownloadUrl(DescribeNameListDownloadUrlRequest request);

    CompletableFuture<DescribeNameListLimitResponse> describeNameListLimit(DescribeNameListLimitRequest request);

    CompletableFuture<DescribeNameListPageListResponse> describeNameListPageList(DescribeNameListPageListRequest request);

    CompletableFuture<DescribeNameListTypeListResponse> describeNameListTypeList(DescribeNameListTypeListRequest request);

    CompletableFuture<DescribeNameListVariablePageListResponse> describeNameListVariablePageList(DescribeNameListVariablePageListRequest request);

    CompletableFuture<DescribeOperationLogPageListResponse> describeOperationLogPageList(DescribeOperationLogPageListRequest request);

    CompletableFuture<DescribeOperatorListResponse> describeOperatorList(DescribeOperatorListRequest request);

    CompletableFuture<DescribeOperatorListBySceneResponse> describeOperatorListByScene(DescribeOperatorListBySceneRequest request);

    CompletableFuture<DescribeOperatorListByTypeResponse> describeOperatorListByType(DescribeOperatorListByTypeRequest request);

    CompletableFuture<DescribeOssAuthStatusResponse> describeOssAuthStatus(DescribeOssAuthStatusRequest request);

    CompletableFuture<DescribeOssPolicyResponse> describeOssPolicy(DescribeOssPolicyRequest request);

    CompletableFuture<DescribeOssTokenResponse> describeOssToken(DescribeOssTokenRequest request);

    CompletableFuture<DescribeParamByEventCodesResponse> describeParamByEventCodes(DescribeParamByEventCodesRequest request);

    CompletableFuture<DescribeParamListResponse> describeParamList(DescribeParamListRequest request);

    CompletableFuture<DescribePocDetailResponse> describePocDetail(DescribePocDetailRequest request);

    CompletableFuture<DescribePocOssTokenResponse> describePocOssToken(DescribePocOssTokenRequest request);

    CompletableFuture<DescribePocTaskListResponse> describePocTaskList(DescribePocTaskListRequest request);

    CompletableFuture<DescribePrivateStackResponse> describePrivateStack(DescribePrivateStackRequest request);

    CompletableFuture<DescribeQueryVariableDetailResponse> describeQueryVariableDetail(DescribeQueryVariableDetailRequest request);

    CompletableFuture<DescribeQueryVariablePageListResponse> describeQueryVariablePageList(DescribeQueryVariablePageListRequest request);

    CompletableFuture<DescribeRecommendSceneVariablesResponse> describeRecommendSceneVariables(DescribeRecommendSceneVariablesRequest request);

    CompletableFuture<DescribeRecommendTaskDetailResponse> describeRecommendTaskDetail(DescribeRecommendTaskDetailRequest request);

    CompletableFuture<DescribeRecommendTaskPageListResponse> describeRecommendTaskPageList(DescribeRecommendTaskPageListRequest request);

    CompletableFuture<DescribeRecommendVariablesVelocityResponse> describeRecommendVariablesVelocity(DescribeRecommendVariablesVelocityRequest request);

    CompletableFuture<DescribeRecommendVelocitiesResponse> describeRecommendVelocities(DescribeRecommendVelocitiesRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeRequestHitResponse> describeRequestHit(DescribeRequestHitRequest request);

    CompletableFuture<DescribeRequestPeakReportResponse> describeRequestPeakReport(DescribeRequestPeakReportRequest request);

    CompletableFuture<DescribeResultCountResponse> describeResultCount(DescribeResultCountRequest request);

    CompletableFuture<DescribeRiskLineChartResponse> describeRiskLineChart(DescribeRiskLineChartRequest request);

    CompletableFuture<DescribeRuleBarChartResponse> describeRuleBarChart(DescribeRuleBarChartRequest request);

    CompletableFuture<DescribeRuleCountByUserIdResponse> describeRuleCountByUserId(DescribeRuleCountByUserIdRequest request);

    CompletableFuture<DescribeRuleDetailByRuleIdResponse> describeRuleDetailByRuleId(DescribeRuleDetailByRuleIdRequest request);

    CompletableFuture<DescribeRuleHitResponse> describeRuleHit(DescribeRuleHitRequest request);

    CompletableFuture<DescribeRuleListByEventCodesListResponse> describeRuleListByEventCodesList(DescribeRuleListByEventCodesListRequest request);

    CompletableFuture<DescribeRulePageListResponse> describeRulePageList(DescribeRulePageListRequest request);

    CompletableFuture<DescribeRuleSnapshotResponse> describeRuleSnapshot(DescribeRuleSnapshotRequest request);

    CompletableFuture<DescribeRuleVersionListResponse> describeRuleVersionList(DescribeRuleVersionListRequest request);

    CompletableFuture<DescribeSDKDownloadListResponse> describeSDKDownloadList(DescribeSDKDownloadListRequest request);

    CompletableFuture<DescribeSafConsoleResponse> describeSafConsole(DescribeSafConsoleRequest request);

    CompletableFuture<DescribeSafDeOrderResponse> describeSafDeOrder(DescribeSafDeOrderRequest request);

    CompletableFuture<DescribeSafOrderResponse> describeSafOrder(DescribeSafOrderRequest request);

    CompletableFuture<DescribeSafStartConfigResponse> describeSafStartConfig(DescribeSafStartConfigRequest request);

    CompletableFuture<DescribeSafStartStepsResponse> describeSafStartSteps(DescribeSafStartStepsRequest request);

    CompletableFuture<DescribeSafTagListResponse> describeSafTagList(DescribeSafTagListRequest request);

    CompletableFuture<DescribeSampleDataListResponse> describeSampleDataList(DescribeSampleDataListRequest request);

    CompletableFuture<DescribeSampleDemoDownloadUrlResponse> describeSampleDemoDownloadUrl(DescribeSampleDemoDownloadUrlRequest request);

    CompletableFuture<DescribeSampleDownloadUrlResponse> describeSampleDownloadUrl(DescribeSampleDownloadUrlRequest request);

    CompletableFuture<DescribeSampleInfoResponse> describeSampleInfo(DescribeSampleInfoRequest request);

    CompletableFuture<DescribeSampleListResponse> describeSampleList(DescribeSampleListRequest request);

    CompletableFuture<DescribeSampleSceneListResponse> describeSampleSceneList(DescribeSampleSceneListRequest request);

    CompletableFuture<DescribeSampleTagListResponse> describeSampleTagList(DescribeSampleTagListRequest request);

    CompletableFuture<DescribeSampleUploadPolicyResponse> describeSampleUploadPolicy(DescribeSampleUploadPolicyRequest request);

    CompletableFuture<DescribeSceneAllEventNameCodeListResponse> describeSceneAllEventNameCodeList(DescribeSceneAllEventNameCodeListRequest request);

    CompletableFuture<DescribeSceneEventPageListResponse> describeSceneEventPageList(DescribeSceneEventPageListRequest request);

    CompletableFuture<DescribeSceneRulePageListResponse> describeSceneRulePageList(DescribeSceneRulePageListRequest request);

    CompletableFuture<DescribeScoreSectionNumLineChartResponse> describeScoreSectionNumLineChart(DescribeScoreSectionNumLineChartRequest request);

    CompletableFuture<DescribeScoreSectionPieChartResponse> describeScoreSectionPieChart(DescribeScoreSectionPieChartRequest request);

    CompletableFuture<DescribeScoreSectionRatioLineChartResponse> describeScoreSectionRatioLineChart(DescribeScoreSectionRatioLineChartRequest request);

    CompletableFuture<DescribeSelectItemResponse> describeSelectItem(DescribeSelectItemRequest request);

    CompletableFuture<DescribeServiceAppKeyResponse> describeServiceAppKey(DescribeServiceAppKeyRequest request);

    CompletableFuture<DescribeServiceConsumeResponse> describeServiceConsume(DescribeServiceConsumeRequest request);

    CompletableFuture<DescribeServiceConsumeDownloadUrlResponse> describeServiceConsumeDownloadUrl(DescribeServiceConsumeDownloadUrlRequest request);

    CompletableFuture<DescribeServiceListResponse> describeServiceList(DescribeServiceListRequest request);

    CompletableFuture<DescribeSimulationPreditInfoResponse> describeSimulationPreditInfo(DescribeSimulationPreditInfoRequest request);

    CompletableFuture<DescribeSimulationTaskCountResponse> describeSimulationTaskCount(DescribeSimulationTaskCountRequest request);

    CompletableFuture<DescribeSimulationTaskListResponse> describeSimulationTaskList(DescribeSimulationTaskListRequest request);

    CompletableFuture<DescribeSlsUrlConfigResponse> describeSlsUrlConfig(DescribeSlsUrlConfigRequest request);

    CompletableFuture<DescribeSupportRuleListResponse> describeSupportRuleList(DescribeSupportRuleListRequest request);

    CompletableFuture<DescribeTagListResponse> describeTagList(DescribeTagListRequest request);

    CompletableFuture<DescribeTagsBarChartResponse> describeTagsBarChart(DescribeTagsBarChartRequest request);

    CompletableFuture<DescribeTagsFluctuationResponse> describeTagsFluctuation(DescribeTagsFluctuationRequest request);

    CompletableFuture<DescribeTagsListResponse> describeTagsList(DescribeTagsListRequest request);

    CompletableFuture<DescribeTagsNumLineChartResponse> describeTagsNumLineChart(DescribeTagsNumLineChartRequest request);

    CompletableFuture<DescribeTagsRatioLineChartResponse> describeTagsRatioLineChart(DescribeTagsRatioLineChartRequest request);

    CompletableFuture<DescribeTagsTrendResponse> describeTagsTrend(DescribeTagsTrendRequest request);

    CompletableFuture<DescribeTaskListResponse> describeTaskList(DescribeTaskListRequest request);

    CompletableFuture<DescribeTaskLogListResponse> describeTaskLogList(DescribeTaskLogListRequest request);

    CompletableFuture<DescribeTemplateBaseInfoByTemplateIdResponse> describeTemplateBaseInfoByTemplateId(DescribeTemplateBaseInfoByTemplateIdRequest request);

    CompletableFuture<DescribeTemplateCountResponse> describeTemplateCount(DescribeTemplateCountRequest request);

    CompletableFuture<DescribeTemplateDownloadResponse> describeTemplateDownload(DescribeTemplateDownloadRequest request);

    CompletableFuture<DescribeTemplatePageListResponse> describeTemplatePageList(DescribeTemplatePageListRequest request);

    CompletableFuture<DescribeUsedServiceResponse> describeUsedService(DescribeUsedServiceRequest request);

    CompletableFuture<DescribeUserInfoResponse> describeUserInfo(DescribeUserInfoRequest request);

    CompletableFuture<DescribeVariableBindDetailResponse> describeVariableBindDetail(DescribeVariableBindDetailRequest request);

    CompletableFuture<DescribeVariableDetailResponse> describeVariableDetail(DescribeVariableDetailRequest request);

    CompletableFuture<DescribeVariableFeeResponse> describeVariableFee(DescribeVariableFeeRequest request);

    CompletableFuture<DescribeVariableListResponse> describeVariableList(DescribeVariableListRequest request);

    CompletableFuture<DescribeVariableMarketListResponse> describeVariableMarketList(DescribeVariableMarketListRequest request);

    CompletableFuture<DescribeVariableSceneListResponse> describeVariableSceneList(DescribeVariableSceneListRequest request);

    CompletableFuture<ExpressionTestResponse> expressionTest(ExpressionTestRequest request);

    CompletableFuture<FileUploadResponse> fileUpload(FileUploadRequest request);

    CompletableFuture<ImportNameListResponse> importNameList(ImportNameListRequest request);

    CompletableFuture<ImportTemplateEventResponse> importTemplateEvent(ImportTemplateEventRequest request);

    CompletableFuture<ModifyAppKeyResponse> modifyAppKey(ModifyAppKeyRequest request);

    CompletableFuture<ModifyCustVariableResponse> modifyCustVariable(ModifyCustVariableRequest request);

    CompletableFuture<ModifyEventResponse> modifyEvent(ModifyEventRequest request);

    CompletableFuture<ModifyEventStatusResponse> modifyEventStatus(ModifyEventStatusRequest request);

    CompletableFuture<ModifyExpressionVariableResponse> modifyExpressionVariable(ModifyExpressionVariableRequest request);

    CompletableFuture<ModifyFieldResponse> modifyField(ModifyFieldRequest request);

    CompletableFuture<ModifyPocTaskResponse> modifyPocTask(ModifyPocTaskRequest request);

    CompletableFuture<ModifyRulePriorityResponse> modifyRulePriority(ModifyRulePriorityRequest request);

    CompletableFuture<ModifyRuleStatusResponse> modifyRuleStatus(ModifyRuleStatusRequest request);

    CompletableFuture<ModifyTemplateResponse> modifyTemplate(ModifyTemplateRequest request);

    CompletableFuture<ModifyTemplateStatusResponse> modifyTemplateStatus(ModifyTemplateStatusRequest request);

    CompletableFuture<ModifyVariableResponse> modifyVariable(ModifyVariableRequest request);

    CompletableFuture<OpenConsoleSlsResponse> openConsoleSls(OpenConsoleSlsRequest request);

    CompletableFuture<OperateFavoriteVariableResponse> operateFavoriteVariable(OperateFavoriteVariableRequest request);

    CompletableFuture<PermissionCheckResponse> permissionCheck(PermissionCheckRequest request);

    CompletableFuture<QueryAuthRuleDetailByRuleIdResponse> queryAuthRuleDetailByRuleId(QueryAuthRuleDetailByRuleIdRequest request);

    CompletableFuture<QueryAuthUserNameResponse> queryAuthUserName(QueryAuthUserNameRequest request);

    CompletableFuture<QueryAuthorizationUserListResponse> queryAuthorizationUserList(QueryAuthorizationUserListRequest request);

    CompletableFuture<RecallRuleAuditResponse> recallRuleAudit(RecallRuleAuditRequest request);

    CompletableFuture<RemoveEventResponse> removeEvent(RemoveEventRequest request);

    CompletableFuture<RemoveTemplateResponse> removeTemplate(RemoveTemplateRequest request);

    CompletableFuture<SampleFileDownloadResponse> sampleFileDownload(SampleFileDownloadRequest request);

    CompletableFuture<SaveAnalysisColumnResponse> saveAnalysisColumn(SaveAnalysisColumnRequest request);

    CompletableFuture<SaveByPassOrShuntEventResponse> saveByPassOrShuntEvent(SaveByPassOrShuntEventRequest request);

    CompletableFuture<StartOrStopByPassShuntEventResponse> startOrStopByPassShuntEvent(StartOrStopByPassShuntEventRequest request);

    CompletableFuture<StartSimulationTaskResponse> startSimulationTask(StartSimulationTaskRequest request);

    CompletableFuture<StopSimulationTaskResponse> stopSimulationTask(StopSimulationTaskRequest request);

    CompletableFuture<SubmitImportTaskResponse> submitImportTask(SubmitImportTaskRequest request);

    CompletableFuture<SwitchExpressionVariableResponse> switchExpressionVariable(SwitchExpressionVariableRequest request);

    CompletableFuture<SwitchFieldResponse> switchField(SwitchFieldRequest request);

    CompletableFuture<SwitchQueryVariableResponse> switchQueryVariable(SwitchQueryVariableRequest request);

    CompletableFuture<SwitchToOnlineResponse> switchToOnline(SwitchToOnlineRequest request);

    CompletableFuture<SwitchVariableResponse> switchVariable(SwitchVariableRequest request);

    CompletableFuture<TaskNameByUserIdResponse> taskNameByUserId(TaskNameByUserIdRequest request);

    CompletableFuture<UpdateAnalysisConditionFavoriteResponse> updateAnalysisConditionFavorite(UpdateAnalysisConditionFavoriteRequest request);

    CompletableFuture<UpdateAuditResponse> updateAudit(UpdateAuditRequest request);

    CompletableFuture<UpdateAuthRuleResponse> updateAuthRule(UpdateAuthRuleRequest request);

    CompletableFuture<UpdateByPassShuntEventResponse> updateByPassShuntEvent(UpdateByPassShuntEventRequest request);

    CompletableFuture<UpdateDataSourceResponse> updateDataSource(UpdateDataSourceRequest request);

    CompletableFuture<UpdateQueryVariableResponse> updateQueryVariable(UpdateQueryVariableRequest request);

    CompletableFuture<UpdateRuleResponse> updateRule(UpdateRuleRequest request);

    CompletableFuture<UpdateRuleBaseResponse> updateRuleBase(UpdateRuleBaseRequest request);

    CompletableFuture<UpdateSampleBatchResponse> updateSampleBatch(UpdateSampleBatchRequest request);

    CompletableFuture<UploadSampleApiResponse> uploadSampleApi(UploadSampleApiRequest request);

}
