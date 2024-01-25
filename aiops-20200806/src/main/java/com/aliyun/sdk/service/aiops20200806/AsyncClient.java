// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.aiops20200806.models.*;
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

    CompletableFuture<AddAlgorithmResponse> addAlgorithm(AddAlgorithmRequest request);

    CompletableFuture<AddBusinessGroupResponse> addBusinessGroup(AddBusinessGroupRequest request);

    CompletableFuture<AddBusinessGroupOneResponse> addBusinessGroupOne(AddBusinessGroupOneRequest request);

    CompletableFuture<AddScenarioResponse> addScenario(AddScenarioRequest request);

    CompletableFuture<AddSceneListResponse> addSceneList(AddSceneListRequest request);

    CompletableFuture<AddScriptResponse> addScript(AddScriptRequest request);

    CompletableFuture<AddTagInfoResponse> addTagInfo(AddTagInfoRequest request);

    CompletableFuture<AgainSubmitApplyPermissionResponse> againSubmitApplyPermission(AgainSubmitApplyPermissionRequest request);

    CompletableFuture<ApplyAuthorizationResponse> applyAuthorization(ApplyAuthorizationRequest request);

    CompletableFuture<CheckDataSourceLinkConnectionResponse> checkDataSourceLinkConnection(CheckDataSourceLinkConnectionRequest request);

    CompletableFuture<CheckLogResponse> checkLog(CheckLogRequest request);

    CompletableFuture<CloseEventResponse> closeEvent(CloseEventRequest request);

    CompletableFuture<ConfirmAuthorizationResponse> confirmAuthorization(ConfirmAuthorizationRequest request);

    CompletableFuture<CountLatestReportsResponse> countLatestReports(CountLatestReportsRequest request);

    CompletableFuture<CreateAlertContactResponse> createAlertContact(CreateAlertContactRequest request);

    CompletableFuture<CreateAlertContactGroupResponse> createAlertContactGroup(CreateAlertContactGroupRequest request);

    CompletableFuture<CreateCommandResponse> createCommand(CreateCommandRequest request);

    CompletableFuture<CreateDumpResponse> createDump(CreateDumpRequest request);

    CompletableFuture<CreateInspectionRecordResponse> createInspectionRecord(CreateInspectionRecordRequest request);

    CompletableFuture<CreateMessageResponse> createMessage(CreateMessageRequest request);

    CompletableFuture<CreateSceneResponse> createScene(CreateSceneRequest request);

    CompletableFuture<CreateSceneModelResponse> createSceneModel(CreateSceneModelRequest request);

    CompletableFuture<CreateSceneModelApplyResponse> createSceneModelApply(CreateSceneModelApplyRequest request);

    CompletableFuture<DelBusinessGroupResponse> delBusinessGroup(DelBusinessGroupRequest request);

    CompletableFuture<DeleteAlertContactResponse> deleteAlertContact(DeleteAlertContactRequest request);

    CompletableFuture<DeleteAlertContactFromGroupResponse> deleteAlertContactFromGroup(DeleteAlertContactFromGroupRequest request);

    CompletableFuture<DeleteAlertContactGroupResponse> deleteAlertContactGroup(DeleteAlertContactGroupRequest request);

    CompletableFuture<DeleteAlertSettingResponse> deleteAlertSetting(DeleteAlertSettingRequest request);

    CompletableFuture<DeleteAlertSettingListResponse> deleteAlertSettingList(DeleteAlertSettingListRequest request);

    CompletableFuture<DeleteAlgorithmInfoResponse> deleteAlgorithmInfo(DeleteAlgorithmInfoRequest request);

    CompletableFuture<DeleteBusinessGroupResponse> deleteBusinessGroup(DeleteBusinessGroupRequest request);

    CompletableFuture<DeleteBusinessResourceTagResponse> deleteBusinessResourceTag(DeleteBusinessResourceTagRequest request);

    CompletableFuture<DeleteDataSourceConfigResponse> deleteDataSourceConfig(DeleteDataSourceConfigRequest request);

    CompletableFuture<DeleteGroupTopologyTagLogResponse> deleteGroupTopologyTagLog(DeleteGroupTopologyTagLogRequest request);

    CompletableFuture<DeleteRealSceneInfoResponse> deleteRealSceneInfo(DeleteRealSceneInfoRequest request);

    CompletableFuture<DeleteReportEmailConfigResponse> deleteReportEmailConfig(DeleteReportEmailConfigRequest request);

    CompletableFuture<DeleteResourceWhitelistResponse> deleteResourceWhitelist(DeleteResourceWhitelistRequest request);

    CompletableFuture<DeleteScenarioResponse> deleteScenario(DeleteScenarioRequest request);

    CompletableFuture<DeleteSceneResponse> deleteScene(DeleteSceneRequest request);

    CompletableFuture<DeleteSceneListResponse> deleteSceneList(DeleteSceneListRequest request);

    CompletableFuture<DeleteSceneModelResponse> deleteSceneModel(DeleteSceneModelRequest request);

    CompletableFuture<DeleteTagInfoResponse> deleteTagInfo(DeleteTagInfoRequest request);

    CompletableFuture<DescribeAccountAlertEventResponse> describeAccountAlertEvent(DescribeAccountAlertEventRequest request);

    CompletableFuture<DescribeAdvisorInspectionProductsResponse> describeAdvisorInspectionProducts(DescribeAdvisorInspectionProductsRequest request);

    CompletableFuture<DescribeAlertBusinessGroupWithAlertSettingIdResponse> describeAlertBusinessGroupWithAlertSettingId(DescribeAlertBusinessGroupWithAlertSettingIdRequest request);

    CompletableFuture<DescribeAlertContactResponse> describeAlertContact(DescribeAlertContactRequest request);

    CompletableFuture<DescribeAlertContactGroupResponse> describeAlertContactGroup(DescribeAlertContactGroupRequest request);

    CompletableFuture<DescribeAlertContactWithAlertSettingIdResponse> describeAlertContactWithAlertSettingId(DescribeAlertContactWithAlertSettingIdRequest request);

    CompletableFuture<DescribeAlertContactWithGroupIdResponse> describeAlertContactWithGroupId(DescribeAlertContactWithGroupIdRequest request);

    CompletableFuture<DescribeAlertDetailDataResponse> describeAlertDetailData(DescribeAlertDetailDataRequest request);

    CompletableFuture<DescribeAlertDetailTrendDataResponse> describeAlertDetailTrendData(DescribeAlertDetailTrendDataRequest request);

    CompletableFuture<DescribeAlertEventResponse> describeAlertEvent(DescribeAlertEventRequest request);

    CompletableFuture<DescribeAlertFinalDataListResponse> describeAlertFinalDataList(DescribeAlertFinalDataListRequest request);

    CompletableFuture<DescribeAlertResourceResponse> describeAlertResource(DescribeAlertResourceRequest request);

    CompletableFuture<DescribeAlertSettingResponse> describeAlertSetting(DescribeAlertSettingRequest request);

    CompletableFuture<DescribeAlertSettingByIdResponse> describeAlertSettingById(DescribeAlertSettingByIdRequest request);

    CompletableFuture<DescribeAllAlertContactResponse> describeAllAlertContact(DescribeAllAlertContactRequest request);

    CompletableFuture<DescribeAllAlertContactGroupResponse> describeAllAlertContactGroup(DescribeAllAlertContactGroupRequest request);

    CompletableFuture<DescribeAllBusinessGroupInfoResponse> describeAllBusinessGroupInfo(DescribeAllBusinessGroupInfoRequest request);

    CompletableFuture<DescribeAllSceneModelResponse> describeAllSceneModel(DescribeAllSceneModelRequest request);

    CompletableFuture<DescribeAnalysisDataListResponse> describeAnalysisDataList(DescribeAnalysisDataListRequest request);

    CompletableFuture<DescribeBusinessAnalysisDataListResponse> describeBusinessAnalysisDataList(DescribeBusinessAnalysisDataListRequest request);

    CompletableFuture<DescribeDiagnoseResponse> describeDiagnose(DescribeDiagnoseRequest request);

    CompletableFuture<DescribeDiagnoseResultResponse> describeDiagnoseResult(DescribeDiagnoseResultRequest request);

    CompletableFuture<DescribeEventTopologyResponse> describeEventTopology(DescribeEventTopologyRequest request);

    CompletableFuture<DescribeEventTopologyDetailResponse> describeEventTopologyDetail(DescribeEventTopologyDetailRequest request);

    CompletableFuture<DescribeFcFunctionResponse> describeFcFunction(DescribeFcFunctionRequest request);

    CompletableFuture<DescribeFcRegionResponse> describeFcRegion(DescribeFcRegionRequest request);

    CompletableFuture<DescribeFcServiceResponse> describeFcService(DescribeFcServiceRequest request);

    CompletableFuture<DescribeHistoryRiskResponse> describeHistoryRisk(DescribeHistoryRiskRequest request);

    CompletableFuture<DescribeInspectionProgressResponse> describeInspectionProgress(DescribeInspectionProgressRequest request);

    CompletableFuture<DescribeInspectionResourcesResponse> describeInspectionResources(DescribeInspectionResourcesRequest request);

    CompletableFuture<DescribeInspectionResultResponse> describeInspectionResult(DescribeInspectionResultRequest request);

    CompletableFuture<DescribeInspectionSettingsResponse> describeInspectionSettings(DescribeInspectionSettingsRequest request);

    CompletableFuture<DescribeInspectionThresholdResponse> describeInspectionThreshold(DescribeInspectionThresholdRequest request);

    CompletableFuture<DescribeInspectionWhitelistsResponse> describeInspectionWhitelists(DescribeInspectionWhitelistsRequest request);

    CompletableFuture<DescribeInvocationResultsResponse> describeInvocationResults(DescribeInvocationResultsRequest request);

    CompletableFuture<DescribeLastInspectionSummaryResponse> describeLastInspectionSummary(DescribeLastInspectionSummaryRequest request);

    CompletableFuture<DescribeModelRelationScenesResponse> describeModelRelationScenes(DescribeModelRelationScenesRequest request);

    CompletableFuture<DescribeProductRiskPieResponse> describeProductRiskPie(DescribeProductRiskPieRequest request);

    CompletableFuture<DescribeReportDataResponse> describeReportData(DescribeReportDataRequest request);

    CompletableFuture<DescribeReportEmailConfigsResponse> describeReportEmailConfigs(DescribeReportEmailConfigsRequest request);

    CompletableFuture<DescribeReportSubscriptionsResponse> describeReportSubscriptions(DescribeReportSubscriptionsRequest request);

    CompletableFuture<DescribeResourceMetricResponse> describeResourceMetric(DescribeResourceMetricRequest request);

    CompletableFuture<DescribeRiskResponse> describeRisk(DescribeRiskRequest request);

    CompletableFuture<DescribeRiskConfigResponse> describeRiskConfig(DescribeRiskConfigRequest request);

    CompletableFuture<DescribeRiskEventDetailsResponse> describeRiskEventDetails(DescribeRiskEventDetailsRequest request);

    CompletableFuture<DescribeRiskEventListResponse> describeRiskEventList(DescribeRiskEventListRequest request);

    CompletableFuture<DescribeRiskEventTopologyResponse> describeRiskEventTopology(DescribeRiskEventTopologyRequest request);

    CompletableFuture<DescribeRiskResultSeveritySummaryResponse> describeRiskResultSeveritySummary(DescribeRiskResultSeveritySummaryRequest request);

    CompletableFuture<DescribeRiskResultStatisticalResponse> describeRiskResultStatistical(DescribeRiskResultStatisticalRequest request);

    CompletableFuture<DescribeSceneDetailResponse> describeSceneDetail(DescribeSceneDetailRequest request);

    CompletableFuture<DescribeSceneModelByTypeResponse> describeSceneModelByType(DescribeSceneModelByTypeRequest request);

    CompletableFuture<DescribeSceneModelDetailResponse> describeSceneModelDetail(DescribeSceneModelDetailRequest request);

    CompletableFuture<DescribeSceneModelVersionHistoryResponse> describeSceneModelVersionHistory(DescribeSceneModelVersionHistoryRequest request);

    CompletableFuture<DescribeSceneModelsResponse> describeSceneModels(DescribeSceneModelsRequest request);

    CompletableFuture<DescribeSceneSystemModelResponse> describeSceneSystemModel(DescribeSceneSystemModelRequest request);

    CompletableFuture<DescribeScenesResponse> describeScenes(DescribeScenesRequest request);

    CompletableFuture<DescribeStatisticalDataByProductResponse> describeStatisticalDataByProduct(DescribeStatisticalDataByProductRequest request);

    CompletableFuture<DescribeStatisticalDataByRiskCodeResponse> describeStatisticalDataByRiskCode(DescribeStatisticalDataByRiskCodeRequest request);

    CompletableFuture<DescribeWhitelistResourcesResponse> describeWhitelistResources(DescribeWhitelistResourcesRequest request);

    CompletableFuture<EndScriptListResponse> endScriptList(EndScriptListRequest request);

    CompletableFuture<FeedbackAlertAlgorithmResponse> feedbackAlertAlgorithm(FeedbackAlertAlgorithmRequest request);

    CompletableFuture<GetAiopsEventListResponse> getAiopsEventList(GetAiopsEventListRequest request);

    CompletableFuture<GetAiopsEventNewListResponse> getAiopsEventNewList(GetAiopsEventNewListRequest request);

    CompletableFuture<GetAlertDetailTrendDataResponse> getAlertDetailTrendData(GetAlertDetailTrendDataRequest request);

    CompletableFuture<GetAlertListResponse> getAlertList(GetAlertListRequest request);

    CompletableFuture<GetAlertTrentResponse> getAlertTrent(GetAlertTrentRequest request);

    CompletableFuture<GetAlgorithmResponse> getAlgorithm(GetAlgorithmRequest request);

    CompletableFuture<GetAlgorithmConfigResponse> getAlgorithmConfig(GetAlgorithmConfigRequest request);

    CompletableFuture<GetAlgorithmDataResponse> getAlgorithmData(GetAlgorithmDataRequest request);

    CompletableFuture<GetAlgorithmDetailsResponse> getAlgorithmDetails(GetAlgorithmDetailsRequest request);

    CompletableFuture<GetAlgorithmForecastDataResponse> getAlgorithmForecastData(GetAlgorithmForecastDataRequest request);

    CompletableFuture<GetAlgorithmForecastDetailsResponse> getAlgorithmForecastDetails(GetAlgorithmForecastDetailsRequest request);

    CompletableFuture<GetAlgorithmListResponse> getAlgorithmList(GetAlgorithmListRequest request);

    CompletableFuture<GetAllAlgorithmConfigResponse> getAllAlgorithmConfig(GetAllAlgorithmConfigRequest request);

    CompletableFuture<GetAllTagResourceNumListResponse> getAllTagResourceNumList(GetAllTagResourceNumListRequest request);

    CompletableFuture<GetAnalysisProcessResponse> getAnalysisProcess(GetAnalysisProcessRequest request);

    CompletableFuture<GetAuthorizationResponse> getAuthorization(GetAuthorizationRequest request);

    CompletableFuture<GetAvgRepairTimeResponse> getAvgRepairTime(GetAvgRepairTimeRequest request);

    CompletableFuture<GetBackScriptListResponse> getBackScriptList(GetBackScriptListRequest request);

    CompletableFuture<GetBusinessGroupResponse> getBusinessGroup(GetBusinessGroupRequest request);

    CompletableFuture<GetBusinessGroupAllResponse> getBusinessGroupAll(GetBusinessGroupAllRequest request);

    CompletableFuture<GetBusinessGroupIndexResponse> getBusinessGroupIndex(GetBusinessGroupIndexRequest request);

    CompletableFuture<GetBusinessGroupInfoResponse> getBusinessGroupInfo(GetBusinessGroupInfoRequest request);

    CompletableFuture<GetBusinessGroupOverviewListResponse> getBusinessGroupOverviewList(GetBusinessGroupOverviewListRequest request);

    CompletableFuture<GetBusinessLogAlertDetailResponse> getBusinessLogAlertDetail(GetBusinessLogAlertDetailRequest request);

    CompletableFuture<GetBusinessLogAlertListResponse> getBusinessLogAlertList(GetBusinessLogAlertListRequest request);

    CompletableFuture<GetBusinessLogAlertTopNResponse> getBusinessLogAlertTopN(GetBusinessLogAlertTopNRequest request);

    CompletableFuture<GetBusinessMetricAlertDetailListResponse> getBusinessMetricAlertDetailList(GetBusinessMetricAlertDetailListRequest request);

    CompletableFuture<GetBusinessMetricAlertListResponse> getBusinessMetricAlertList(GetBusinessMetricAlertListRequest request);

    CompletableFuture<GetBusinessMetricAlertTopNResponse> getBusinessMetricAlertTopN(GetBusinessMetricAlertTopNRequest request);

    CompletableFuture<GetBusinessMetricAllListResponse> getBusinessMetricAllList(GetBusinessMetricAllListRequest request);

    CompletableFuture<GetBusinessMetricForecastListResponse> getBusinessMetricForecastList(GetBusinessMetricForecastListRequest request);

    CompletableFuture<GetBusinessMetricResourceByMetricIdResponse> getBusinessMetricResourceByMetricId(GetBusinessMetricResourceByMetricIdRequest request);

    CompletableFuture<GetBusinessMetricSceneListResponse> getBusinessMetricSceneList(GetBusinessMetricSceneListRequest request);

    CompletableFuture<GetCidInfoResponse> getCidInfo(GetCidInfoRequest request);

    CompletableFuture<GetCloudAllResourceListResponse> getCloudAllResourceList(GetCloudAllResourceListRequest request);

    CompletableFuture<GetCloudResourceResponse> getCloudResource(GetCloudResourceRequest request);

    CompletableFuture<GetCloudResourceListResponse> getCloudResourceList(GetCloudResourceListRequest request);

    CompletableFuture<GetConnectInstancesResponse> getConnectInstances(GetConnectInstancesRequest request);

    CompletableFuture<GetDataSourceDetailResponse> getDataSourceDetail(GetDataSourceDetailRequest request);

    CompletableFuture<GetDataSourceListResponse> getDataSourceList(GetDataSourceListRequest request);

    CompletableFuture<GetDataSourceTargetParamListResponse> getDataSourceTargetParamList(GetDataSourceTargetParamListRequest request);

    CompletableFuture<GetDataVolumeResponse> getDataVolume(GetDataVolumeRequest request);

    CompletableFuture<GetDiagInfoResponse> getDiagInfo(GetDiagInfoRequest request);

    CompletableFuture<GetDomainConfigResponse> getDomainConfig(GetDomainConfigRequest request);

    CompletableFuture<GetEventAbNormalDetailResponse> getEventAbNormalDetail(GetEventAbNormalDetailRequest request);

    CompletableFuture<GetEventAbNormalDetailTrendDataResponse> getEventAbNormalDetailTrendData(GetEventAbNormalDetailTrendDataRequest request);

    CompletableFuture<GetEventAbNormalListResponse> getEventAbNormalList(GetEventAbNormalListRequest request);

    CompletableFuture<GetEventBusinessMetricListResponse> getEventBusinessMetricList(GetEventBusinessMetricListRequest request);

    CompletableFuture<GetEventDetailResponse> getEventDetail(GetEventDetailRequest request);

    CompletableFuture<GetEventRootCauseResponse> getEventRootCause(GetEventRootCauseRequest request);

    CompletableFuture<GetEventSequentialTrentResponse> getEventSequentialTrent(GetEventSequentialTrentRequest request);

    CompletableFuture<GetEventStatisticsResponse> getEventStatistics(GetEventStatisticsRequest request);

    CompletableFuture<GetEventTrentResponse> getEventTrent(GetEventTrentRequest request);

    CompletableFuture<GetEventTypeResponse> getEventType(GetEventTypeRequest request);

    CompletableFuture<GetExceptionsResponse> getExceptions(GetExceptionsRequest request);

    CompletableFuture<GetExtendResponse> getExtend(GetExtendRequest request);

    CompletableFuture<GetForecastBusinessMetricResponse> getForecastBusinessMetric(GetForecastBusinessMetricRequest request);

    CompletableFuture<GetFunctionValidInfoResponse> getFunctionValidInfo(GetFunctionValidInfoRequest request);

    CompletableFuture<GetGroupByDimensionDataResponse> getGroupByDimensionData(GetGroupByDimensionDataRequest request);

    CompletableFuture<GetGroupResourceNumResponse> getGroupResourceNum(GetGroupResourceNumRequest request);

    CompletableFuture<GetGroupTopologyTagResponse> getGroupTopologyTag(GetGroupTopologyTagRequest request);

    CompletableFuture<GetIncidentAllResponse> getIncidentAll(GetIncidentAllRequest request);

    CompletableFuture<GetIndexDialysisArrayResponse> getIndexDialysisArray(GetIndexDialysisArrayRequest request);

    CompletableFuture<GetIndexDialysisListResponse> getIndexDialysisList(GetIndexDialysisListRequest request);

    CompletableFuture<GetIndexDialysisListLineResponse> getIndexDialysisListLine(GetIndexDialysisListLineRequest request);

    CompletableFuture<GetInspectionReportDownloadUrlResponse> getInspectionReportDownloadUrl(GetInspectionReportDownloadUrlRequest request);

    CompletableFuture<GetInstancesNumResponse> getInstancesNum(GetInstancesNumRequest request);

    CompletableFuture<GetLogSampleResponse> getLogSample(GetLogSampleRequest request);

    CompletableFuture<GetLogSampleColumnResponse> getLogSampleColumn(GetLogSampleColumnRequest request);

    CompletableFuture<GetMetricEventSequentialTrentResponse> getMetricEventSequentialTrent(GetMetricEventSequentialTrentRequest request);

    CompletableFuture<GetNewOptimizationItemDataResponse> getNewOptimizationItemData(GetNewOptimizationItemDataRequest request);

    CompletableFuture<GetPatrolInspectionDetailListResponse> getPatrolInspectionDetailList(GetPatrolInspectionDetailListRequest request);

    CompletableFuture<GetPatrolInspectionDetailThrendDataResponse> getPatrolInspectionDetailThrendData(GetPatrolInspectionDetailThrendDataRequest request);

    CompletableFuture<GetPatrolInspectionItemsListResponse> getPatrolInspectionItemsList(GetPatrolInspectionItemsListRequest request);

    CompletableFuture<GetPatrolInspectionListResponse> getPatrolInspectionList(GetPatrolInspectionListRequest request);

    CompletableFuture<GetPatrolInspectionStatusResponse> getPatrolInspectionStatus(GetPatrolInspectionStatusRequest request);

    CompletableFuture<GetProductInstanceResponse> getProductInstance(GetProductInstanceRequest request);

    CompletableFuture<GetProductMetricListResponse> getProductMetricList(GetProductMetricListRequest request);

    CompletableFuture<GetRealDataResponse> getRealData(GetRealDataRequest request);

    CompletableFuture<GetRegionListResponse> getRegionList(GetRegionListRequest request);

    CompletableFuture<GetRepairScriptResponse> getRepairScript(GetRepairScriptRequest request);

    CompletableFuture<GetResourceListResponse> getResourceList(GetResourceListRequest request);

    CompletableFuture<GetResourceTagDropListResponse> getResourceTagDropList(GetResourceTagDropListRequest request);

    CompletableFuture<GetResourceTypeListResponse> getResourceTypeList(GetResourceTypeListRequest request);

    CompletableFuture<GetRiskInAllResponse> getRiskInAll(GetRiskInAllRequest request);

    CompletableFuture<GetRiskInspectStatisticsResponse> getRiskInspectStatistics(GetRiskInspectStatisticsRequest request);

    CompletableFuture<GetRiskInspectionTypeListResponse> getRiskInspectionTypeList(GetRiskInspectionTypeListRequest request);

    CompletableFuture<GetRiskPatrolDetailListResponse> getRiskPatrolDetailList(GetRiskPatrolDetailListRequest request);

    CompletableFuture<GetRiskPatrolListResponse> getRiskPatrolList(GetRiskPatrolListRequest request);

    CompletableFuture<GetRiskPatrolStatisticalTrendsResponse> getRiskPatrolStatisticalTrends(GetRiskPatrolStatisticalTrendsRequest request);

    CompletableFuture<GetRiskPatrolStatisticsResponse> getRiskPatrolStatistics(GetRiskPatrolStatisticsRequest request);

    CompletableFuture<GetRiskPatrolStatusResponse> getRiskPatrolStatus(GetRiskPatrolStatusRequest request);

    CompletableFuture<GetRoleResponse> getRole(GetRoleRequest request);

    CompletableFuture<GetRootCauseResponse> getRootCause(GetRootCauseRequest request);

    CompletableFuture<GetScenarioDetailResponse> getScenarioDetail(GetScenarioDetailRequest request);

    CompletableFuture<GetScenarioListResponse> getScenarioList(GetScenarioListRequest request);

    CompletableFuture<GetScenarioStatisticsListResponse> getScenarioStatisticsList(GetScenarioStatisticsListRequest request);

    CompletableFuture<GetSceneByIdResponse> getSceneById(GetSceneByIdRequest request);

    CompletableFuture<GetSceneDetailsListResponse> getSceneDetailsList(GetSceneDetailsListRequest request);

    CompletableFuture<GetSceneListResponse> getSceneList(GetSceneListRequest request);

    CompletableFuture<GetSceneMetricTableResponse> getSceneMetricTable(GetSceneMetricTableRequest request);

    CompletableFuture<GetScriptEventRootCauseResponse> getScriptEventRootCause(GetScriptEventRootCauseRequest request);

    CompletableFuture<GetSlsLogDataResponse> getSlsLogData(GetSlsLogDataRequest request);

    CompletableFuture<GetSynCloudResourceListResponse> getSynCloudResourceList(GetSynCloudResourceListRequest request);

    CompletableFuture<GetTagBusinessGroupListResponse> getTagBusinessGroupList(GetTagBusinessGroupListRequest request);

    CompletableFuture<GetTagDropListResponse> getTagDropList(GetTagDropListRequest request);

    CompletableFuture<GetTargetDimensionDataResponse> getTargetDimensionData(GetTargetDimensionDataRequest request);

    CompletableFuture<GetThresholdListResponse> getThresholdList(GetThresholdListRequest request);

    CompletableFuture<GetThroughPutResponse> getThroughPut(GetThroughPutRequest request);

    CompletableFuture<GetTrendSlsReportsResponse> getTrendSlsReports(GetTrendSlsReportsRequest request);

    CompletableFuture<GetUserInfoResponse> getUserInfo(GetUserInfoRequest request);

    CompletableFuture<GetUserLoginInfoResponse> getUserLoginInfo(GetUserLoginInfoRequest request);

    CompletableFuture<GetUserOrderConfigResponse> getUserOrderConfig(GetUserOrderConfigRequest request);

    CompletableFuture<IgnoreAlarmsResponse> ignoreAlarms(IgnoreAlarmsRequest request);

    CompletableFuture<ListApplyAuthorizationResponse> listApplyAuthorization(ListApplyAuthorizationRequest request);

    CompletableFuture<ListAuthResponse> listAuth(ListAuthRequest request);

    CompletableFuture<ListAuthorizedUidResponse> listAuthorizedUid(ListAuthorizedUidRequest request);

    CompletableFuture<ListCausePlanResponse> listCausePlan(ListCausePlanRequest request);

    CompletableFuture<ListConfirmAuthorizationResponse> listConfirmAuthorization(ListConfirmAuthorizationRequest request);

    CompletableFuture<ListEventResponse> listEvent(ListEventRequest request);

    CompletableFuture<ListNotAuthorizedUidResponse> listNotAuthorizedUid(ListNotAuthorizedUidRequest request);

    CompletableFuture<ListReportsResponse> listReports(ListReportsRequest request);

    CompletableFuture<ListRootCauseResponse> listRootCause(ListRootCauseRequest request);

    CompletableFuture<ListSlsReportsResponse> listSlsReports(ListSlsReportsRequest request);

    CompletableFuture<PutAlertContactResponse> putAlertContact(PutAlertContactRequest request);

    CompletableFuture<PutAlertContactGroupResponse> putAlertContactGroup(PutAlertContactGroupRequest request);

    CompletableFuture<PutAlertContactToGroupResponse> putAlertContactToGroup(PutAlertContactToGroupRequest request);

    CompletableFuture<PutAlertIgnoreResponse> putAlertIgnore(PutAlertIgnoreRequest request);

    CompletableFuture<PutAlertSettingResponse> putAlertSetting(PutAlertSettingRequest request);

    CompletableFuture<PutAlertSettingListResponse> putAlertSettingList(PutAlertSettingListRequest request);

    CompletableFuture<PutAlertSettingStatusResponse> putAlertSettingStatus(PutAlertSettingStatusRequest request);

    CompletableFuture<PutDataSourceConfigResponse> putDataSourceConfig(PutDataSourceConfigRequest request);

    CompletableFuture<PutGroupResourceTagResponse> putGroupResourceTag(PutGroupResourceTagRequest request);

    CompletableFuture<PutGroupTopologyTagLogResponse> putGroupTopologyTagLog(PutGroupTopologyTagLogRequest request);

    CompletableFuture<PutReportEmailConfigResponse> putReportEmailConfig(PutReportEmailConfigRequest request);

    CompletableFuture<PutResourceWhitelistResponse> putResourceWhitelist(PutResourceWhitelistRequest request);

    CompletableFuture<ReplaceScriptListResponse> replaceScriptList(ReplaceScriptListRequest request);

    CompletableFuture<RevokeSubmitApplyPermissionResponse> revokeSubmitApplyPermission(RevokeSubmitApplyPermissionRequest request);

    CompletableFuture<RunAnalysisProcessResponse> runAnalysisProcess(RunAnalysisProcessRequest request);

    CompletableFuture<RunCommandResponse> runCommand(RunCommandRequest request);

    CompletableFuture<RunForecastAnalyzeResponse> runForecastAnalyze(RunForecastAnalyzeRequest request);

    CompletableFuture<RunPatrolInspectionResponse> runPatrolInspection(RunPatrolInspectionRequest request);

    CompletableFuture<RunRepairScriptResponse> runRepairScript(RunRepairScriptRequest request);

    CompletableFuture<RunRiskPatrolResponse> runRiskPatrol(RunRiskPatrolRequest request);

    CompletableFuture<SwitchUserTopResponse> switchUserTop(SwitchUserTopRequest request);

    CompletableFuture<UpdBusinessGroupResponse> updBusinessGroup(UpdBusinessGroupRequest request);

    CompletableFuture<UpdateAuthorizationResponse> updateAuthorization(UpdateAuthorizationRequest request);

    CompletableFuture<UpdateBindMetricResponse> updateBindMetric(UpdateBindMetricRequest request);

    CompletableFuture<UpdateBusinessGroupResponse> updateBusinessGroup(UpdateBusinessGroupRequest request);

    CompletableFuture<UpdateBusinessMetricAlertConfigResponse> updateBusinessMetricAlertConfig(UpdateBusinessMetricAlertConfigRequest request);

    CompletableFuture<UpdateBusinessMetricResourceResponse> updateBusinessMetricResource(UpdateBusinessMetricResourceRequest request);

    CompletableFuture<UpdateDataSourceConfigResponse> updateDataSourceConfig(UpdateDataSourceConfigRequest request);

    CompletableFuture<UpdateHandleRiskResponse> updateHandleRisk(UpdateHandleRiskRequest request);

    CompletableFuture<UpdateHandleRiskBaseResponse> updateHandleRiskBase(UpdateHandleRiskBaseRequest request);

    CompletableFuture<UpdateIgnoreRiskResponse> updateIgnoreRisk(UpdateIgnoreRiskRequest request);

    CompletableFuture<UpdateIgnoreRiskBaseResponse> updateIgnoreRiskBase(UpdateIgnoreRiskBaseRequest request);

    CompletableFuture<UpdateInspectionSettingStatusResponse> updateInspectionSettingStatus(UpdateInspectionSettingStatusRequest request);

    CompletableFuture<UpdateInspectionThresholdResponse> updateInspectionThreshold(UpdateInspectionThresholdRequest request);

    CompletableFuture<UpdateOperationPermissionResponse> updateOperationPermission(UpdateOperationPermissionRequest request);

    CompletableFuture<UpdateReportEmailConfigStatusResponse> updateReportEmailConfigStatus(UpdateReportEmailConfigStatusRequest request);

    CompletableFuture<UpdateReportSubscriptionResponse> updateReportSubscription(UpdateReportSubscriptionRequest request);

    CompletableFuture<UpdateScenarioResponse> updateScenario(UpdateScenarioRequest request);

    CompletableFuture<UpdateSceneResponse> updateScene(UpdateSceneRequest request);

    CompletableFuture<UpdateSceneModelResponse> updateSceneModel(UpdateSceneModelRequest request);

    CompletableFuture<UpdateSceneModelApplyResponse> updateSceneModelApply(UpdateSceneModelApplyRequest request);

    CompletableFuture<UpdateSceneModelCurVersionResponse> updateSceneModelCurVersion(UpdateSceneModelCurVersionRequest request);

    CompletableFuture<UpdateSceneSystemModelStatusResponse> updateSceneSystemModelStatus(UpdateSceneSystemModelStatusRequest request);

    CompletableFuture<UpdateScenestatusResponse> updateScenestatus(UpdateScenestatusRequest request);

    CompletableFuture<UpdateScriptResponse> updateScript(UpdateScriptRequest request);

    CompletableFuture<UpdateStatusOfSceneResponse> updateStatusOfScene(UpdateStatusOfSceneRequest request);

    CompletableFuture<UpdateTagInfoResponse> updateTagInfo(UpdateTagInfoRequest request);

}
