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

    /**
     * @param request the request parameters of AddSampleDataByCsv  AddSampleDataByCsvRequest
     * @return AddSampleDataByCsvResponse
     */
    CompletableFuture<AddSampleDataByCsvResponse> addSampleDataByCsv(AddSampleDataByCsvRequest request);

    /**
     * @param request the request parameters of AddSampleDataByText  AddSampleDataByTextRequest
     * @return AddSampleDataByTextResponse
     */
    CompletableFuture<AddSampleDataByTextResponse> addSampleDataByText(AddSampleDataByTextRequest request);

    /**
     * @param request the request parameters of BatchDeleteSampleData  BatchDeleteSampleDataRequest
     * @return BatchDeleteSampleDataResponse
     */
    CompletableFuture<BatchDeleteSampleDataResponse> batchDeleteSampleData(BatchDeleteSampleDataRequest request);

    /**
     * @param request the request parameters of BindVariable  BindVariableRequest
     * @return BindVariableResponse
     */
    CompletableFuture<BindVariableResponse> bindVariable(BindVariableRequest request);

    /**
     * @param request the request parameters of CheckCopyRuleVariable  CheckCopyRuleVariableRequest
     * @return CheckCopyRuleVariableResponse
     */
    CompletableFuture<CheckCopyRuleVariableResponse> checkCopyRuleVariable(CheckCopyRuleVariableRequest request);

    /**
     * @param request the request parameters of CheckCustVariableLimit  CheckCustVariableLimitRequest
     * @return CheckCustVariableLimitResponse
     */
    CompletableFuture<CheckCustVariableLimitResponse> checkCustVariableLimit(CheckCustVariableLimitRequest request);

    /**
     * @param request the request parameters of CheckExpressionVariableLimit  CheckExpressionVariableLimitRequest
     * @return CheckExpressionVariableLimitResponse
     */
    CompletableFuture<CheckExpressionVariableLimitResponse> checkExpressionVariableLimit(CheckExpressionVariableLimitRequest request);

    /**
     * @param request the request parameters of CheckFieldLimit  CheckFieldLimitRequest
     * @return CheckFieldLimitResponse
     */
    CompletableFuture<CheckFieldLimitResponse> checkFieldLimit(CheckFieldLimitRequest request);

    /**
     * @param request the request parameters of CheckUsageVariable  CheckUsageVariableRequest
     * @return CheckUsageVariableResponse
     */
    CompletableFuture<CheckUsageVariableResponse> checkUsageVariable(CheckUsageVariableRequest request);

    /**
     * @param request the request parameters of CompareCopyRuleVariable  CompareCopyRuleVariableRequest
     * @return CompareCopyRuleVariableResponse
     */
    CompletableFuture<CompareCopyRuleVariableResponse> compareCopyRuleVariable(CompareCopyRuleVariableRequest request);

    /**
     * @param request the request parameters of CreateAnalysisConditionFavorite  CreateAnalysisConditionFavoriteRequest
     * @return CreateAnalysisConditionFavoriteResponse
     */
    CompletableFuture<CreateAnalysisConditionFavoriteResponse> createAnalysisConditionFavorite(CreateAnalysisConditionFavoriteRequest request);

    /**
     * @param request the request parameters of CreateAnalysisExportTask  CreateAnalysisExportTaskRequest
     * @return CreateAnalysisExportTaskResponse
     */
    CompletableFuture<CreateAnalysisExportTaskResponse> createAnalysisExportTask(CreateAnalysisExportTaskRequest request);

    /**
     * @param request the request parameters of CreateAppKey  CreateAppKeyRequest
     * @return CreateAppKeyResponse
     */
    CompletableFuture<CreateAppKeyResponse> createAppKey(CreateAppKeyRequest request);

    /**
     * @param request the request parameters of CreateCustVariable  CreateCustVariableRequest
     * @return CreateCustVariableResponse
     */
    CompletableFuture<CreateCustVariableResponse> createCustVariable(CreateCustVariableRequest request);

    /**
     * @param request the request parameters of CreateDataSource  CreateDataSourceRequest
     * @return CreateDataSourceResponse
     */
    CompletableFuture<CreateDataSourceResponse> createDataSource(CreateDataSourceRequest request);

    /**
     * @param request the request parameters of CreateEvent  CreateEventRequest
     * @return CreateEventResponse
     */
    CompletableFuture<CreateEventResponse> createEvent(CreateEventRequest request);

    /**
     * @param request the request parameters of CreateExpressionVariable  CreateExpressionVariableRequest
     * @return CreateExpressionVariableResponse
     */
    CompletableFuture<CreateExpressionVariableResponse> createExpressionVariable(CreateExpressionVariableRequest request);

    /**
     * @param request the request parameters of CreateField  CreateFieldRequest
     * @return CreateFieldResponse
     */
    CompletableFuture<CreateFieldResponse> createField(CreateFieldRequest request);

    /**
     * @param request the request parameters of CreateModel  CreateModelRequest
     * @return CreateModelResponse
     */
    CompletableFuture<CreateModelResponse> createModel(CreateModelRequest request);

    /**
     * @param request the request parameters of CreatePocEv  CreatePocEvRequest
     * @return CreatePocEvResponse
     */
    CompletableFuture<CreatePocEvResponse> createPocEv(CreatePocEvRequest request);

    /**
     * @param request the request parameters of CreateQueryVariable  CreateQueryVariableRequest
     * @return CreateQueryVariableResponse
     */
    CompletableFuture<CreateQueryVariableResponse> createQueryVariable(CreateQueryVariableRequest request);

    /**
     * @param request the request parameters of CreateRecommendEventRule  CreateRecommendEventRuleRequest
     * @return CreateRecommendEventRuleResponse
     */
    CompletableFuture<CreateRecommendEventRuleResponse> createRecommendEventRule(CreateRecommendEventRuleRequest request);

    /**
     * @param request the request parameters of CreateRecommendTask  CreateRecommendTaskRequest
     * @return CreateRecommendTaskResponse
     */
    CompletableFuture<CreateRecommendTaskResponse> createRecommendTask(CreateRecommendTaskRequest request);

    /**
     * @param request the request parameters of CreateRule  CreateRuleRequest
     * @return CreateRuleResponse
     */
    CompletableFuture<CreateRuleResponse> createRule(CreateRuleRequest request);

    /**
     * @param request the request parameters of CreateSample  CreateSampleRequest
     * @return CreateSampleResponse
     */
    CompletableFuture<CreateSampleResponse> createSample(CreateSampleRequest request);

    /**
     * @param request the request parameters of CreateSampleApi  CreateSampleApiRequest
     * @return CreateSampleApiResponse
     */
    CompletableFuture<CreateSampleApiResponse> createSampleApi(CreateSampleApiRequest request);

    /**
     * @param request the request parameters of CreateSampleBatch  CreateSampleBatchRequest
     * @return CreateSampleBatchResponse
     */
    CompletableFuture<CreateSampleBatchResponse> createSampleBatch(CreateSampleBatchRequest request);

    /**
     * @param request the request parameters of CreateSampleData  CreateSampleDataRequest
     * @return CreateSampleDataResponse
     */
    CompletableFuture<CreateSampleDataResponse> createSampleData(CreateSampleDataRequest request);

    /**
     * @param request the request parameters of CreateSimulationTask  CreateSimulationTaskRequest
     * @return CreateSimulationTaskResponse
     */
    CompletableFuture<CreateSimulationTaskResponse> createSimulationTask(CreateSimulationTaskRequest request);

    /**
     * @param request the request parameters of DeepCopyRule  DeepCopyRuleRequest
     * @return DeepCopyRuleResponse
     */
    CompletableFuture<DeepCopyRuleResponse> deepCopyRule(DeepCopyRuleRequest request);

    /**
     * @param request the request parameters of DeleteAnalysisConditionFavorite  DeleteAnalysisConditionFavoriteRequest
     * @return DeleteAnalysisConditionFavoriteResponse
     */
    CompletableFuture<DeleteAnalysisConditionFavoriteResponse> deleteAnalysisConditionFavorite(DeleteAnalysisConditionFavoriteRequest request);

    /**
     * @param request the request parameters of DeleteByPassShuntEvent  DeleteByPassShuntEventRequest
     * @return DeleteByPassShuntEventResponse
     */
    CompletableFuture<DeleteByPassShuntEventResponse> deleteByPassShuntEvent(DeleteByPassShuntEventRequest request);

    /**
     * @param request the request parameters of DeleteCustVariable  DeleteCustVariableRequest
     * @return DeleteCustVariableResponse
     */
    CompletableFuture<DeleteCustVariableResponse> deleteCustVariable(DeleteCustVariableRequest request);

    /**
     * @param request the request parameters of DeleteDataSource  DeleteDataSourceRequest
     * @return DeleteDataSourceResponse
     */
    CompletableFuture<DeleteDataSourceResponse> deleteDataSource(DeleteDataSourceRequest request);

    /**
     * @param request the request parameters of DeleteEventField  DeleteEventFieldRequest
     * @return DeleteEventFieldResponse
     */
    CompletableFuture<DeleteEventFieldResponse> deleteEventField(DeleteEventFieldRequest request);

    /**
     * @param request the request parameters of DeleteExpressionVariable  DeleteExpressionVariableRequest
     * @return DeleteExpressionVariableResponse
     */
    CompletableFuture<DeleteExpressionVariableResponse> deleteExpressionVariable(DeleteExpressionVariableRequest request);

    /**
     * @param request the request parameters of DeleteField  DeleteFieldRequest
     * @return DeleteFieldResponse
     */
    CompletableFuture<DeleteFieldResponse> deleteField(DeleteFieldRequest request);

    /**
     * @param request the request parameters of DeleteNameList  DeleteNameListRequest
     * @return DeleteNameListResponse
     */
    CompletableFuture<DeleteNameListResponse> deleteNameList(DeleteNameListRequest request);

    /**
     * @param request the request parameters of DeleteNameListData  DeleteNameListDataRequest
     * @return DeleteNameListDataResponse
     */
    CompletableFuture<DeleteNameListDataResponse> deleteNameListData(DeleteNameListDataRequest request);

    /**
     * @param request the request parameters of DeleteQueryVariable  DeleteQueryVariableRequest
     * @return DeleteQueryVariableResponse
     */
    CompletableFuture<DeleteQueryVariableResponse> deleteQueryVariable(DeleteQueryVariableRequest request);

    /**
     * @param request the request parameters of DeleteRule  DeleteRuleRequest
     * @return DeleteRuleResponse
     */
    CompletableFuture<DeleteRuleResponse> deleteRule(DeleteRuleRequest request);

    /**
     * @param request the request parameters of DeleteSampleBatch  DeleteSampleBatchRequest
     * @return DeleteSampleBatchResponse
     */
    CompletableFuture<DeleteSampleBatchResponse> deleteSampleBatch(DeleteSampleBatchRequest request);

    /**
     * @param request the request parameters of DeleteSampleBatchMeta  DeleteSampleBatchMetaRequest
     * @return DeleteSampleBatchMetaResponse
     */
    CompletableFuture<DeleteSampleBatchMetaResponse> deleteSampleBatchMeta(DeleteSampleBatchMetaRequest request);

    /**
     * @param request the request parameters of DeleteSampleData  DeleteSampleDataRequest
     * @return DeleteSampleDataResponse
     */
    CompletableFuture<DeleteSampleDataResponse> deleteSampleData(DeleteSampleDataRequest request);

    /**
     * @param request the request parameters of DeleteSelfBindVariable  DeleteSelfBindVariableRequest
     * @return DeleteSelfBindVariableResponse
     */
    CompletableFuture<DeleteSelfBindVariableResponse> deleteSelfBindVariable(DeleteSelfBindVariableRequest request);

    /**
     * @param request the request parameters of DescribeAdvanceSearchLeftVariableList  DescribeAdvanceSearchLeftVariableListRequest
     * @return DescribeAdvanceSearchLeftVariableListResponse
     */
    CompletableFuture<DescribeAdvanceSearchLeftVariableListResponse> describeAdvanceSearchLeftVariableList(DescribeAdvanceSearchLeftVariableListRequest request);

    /**
     * @param request the request parameters of DescribeAdvanceSearchPageList  DescribeAdvanceSearchPageListRequest
     * @return DescribeAdvanceSearchPageListResponse
     */
    CompletableFuture<DescribeAdvanceSearchPageListResponse> describeAdvanceSearchPageList(DescribeAdvanceSearchPageListRequest request);

    /**
     * @param request the request parameters of DescribeAllDataSource  DescribeAllDataSourceRequest
     * @return DescribeAllDataSourceResponse
     */
    CompletableFuture<DescribeAllDataSourceResponse> describeAllDataSource(DescribeAllDataSourceRequest request);

    /**
     * @param request the request parameters of DescribeAllEventNameAndCode  DescribeAllEventNameAndCodeRequest
     * @return DescribeAllEventNameAndCodeResponse
     */
    CompletableFuture<DescribeAllEventNameAndCodeResponse> describeAllEventNameAndCode(DescribeAllEventNameAndCodeRequest request);

    /**
     * @param request the request parameters of DescribeAllRootVariable  DescribeAllRootVariableRequest
     * @return DescribeAllRootVariableResponse
     */
    CompletableFuture<DescribeAllRootVariableResponse> describeAllRootVariable(DescribeAllRootVariableRequest request);

    /**
     * @param request the request parameters of DescribeAnalysisColumnFieldList  DescribeAnalysisColumnFieldListRequest
     * @return DescribeAnalysisColumnFieldListResponse
     */
    CompletableFuture<DescribeAnalysisColumnFieldListResponse> describeAnalysisColumnFieldList(DescribeAnalysisColumnFieldListRequest request);

    /**
     * @param request the request parameters of DescribeAnalysisColumnList  DescribeAnalysisColumnListRequest
     * @return DescribeAnalysisColumnListResponse
     */
    CompletableFuture<DescribeAnalysisColumnListResponse> describeAnalysisColumnList(DescribeAnalysisColumnListRequest request);

    /**
     * @param request the request parameters of DescribeAnalysisConditionFavoriteList  DescribeAnalysisConditionFavoriteListRequest
     * @return DescribeAnalysisConditionFavoriteListResponse
     */
    CompletableFuture<DescribeAnalysisConditionFavoriteListResponse> describeAnalysisConditionFavoriteList(DescribeAnalysisConditionFavoriteListRequest request);

    /**
     * @param request the request parameters of DescribeAnalysisExportTaskDownloadUrl  DescribeAnalysisExportTaskDownloadUrlRequest
     * @return DescribeAnalysisExportTaskDownloadUrlResponse
     */
    CompletableFuture<DescribeAnalysisExportTaskDownloadUrlResponse> describeAnalysisExportTaskDownloadUrl(DescribeAnalysisExportTaskDownloadUrlRequest request);

    /**
     * @param request the request parameters of DescribeApi  DescribeApiRequest
     * @return DescribeApiResponse
     */
    CompletableFuture<DescribeApiResponse> describeApi(DescribeApiRequest request);

    /**
     * @param request the request parameters of DescribeApiGroups  DescribeApiGroupsRequest
     * @return DescribeApiGroupsResponse
     */
    CompletableFuture<DescribeApiGroupsResponse> describeApiGroups(DescribeApiGroupsRequest request);

    /**
     * @param request the request parameters of DescribeApiLimit  DescribeApiLimitRequest
     * @return DescribeApiLimitResponse
     */
    CompletableFuture<DescribeApiLimitResponse> describeApiLimit(DescribeApiLimitRequest request);

    /**
     * @param request the request parameters of DescribeApiNameList  DescribeApiNameListRequest
     * @return DescribeApiNameListResponse
     */
    CompletableFuture<DescribeApiNameListResponse> describeApiNameList(DescribeApiNameListRequest request);

    /**
     * @param request the request parameters of DescribeApiVariable  DescribeApiVariableRequest
     * @return DescribeApiVariableResponse
     */
    CompletableFuture<DescribeApiVariableResponse> describeApiVariable(DescribeApiVariableRequest request);

    /**
     * @param request the request parameters of DescribeApis  DescribeApisRequest
     * @return DescribeApisResponse
     */
    CompletableFuture<DescribeApisResponse> describeApis(DescribeApisRequest request);

    /**
     * @param request the request parameters of DescribeAppKeyPage  DescribeAppKeyPageRequest
     * @return DescribeAppKeyPageResponse
     */
    CompletableFuture<DescribeAppKeyPageResponse> describeAppKeyPage(DescribeAppKeyPageRequest request);

    /**
     * @param request the request parameters of DescribeAuditConfig  DescribeAuditConfigRequest
     * @return DescribeAuditConfigResponse
     */
    CompletableFuture<DescribeAuditConfigResponse> describeAuditConfig(DescribeAuditConfigRequest request);

    /**
     * @param request the request parameters of DescribeAuditDetails  DescribeAuditDetailsRequest
     * @return DescribeAuditDetailsResponse
     */
    CompletableFuture<DescribeAuditDetailsResponse> describeAuditDetails(DescribeAuditDetailsRequest request);

    /**
     * @param request the request parameters of DescribeAuditPageList  DescribeAuditPageListRequest
     * @return DescribeAuditPageListResponse
     */
    CompletableFuture<DescribeAuditPageListResponse> describeAuditPageList(DescribeAuditPageListRequest request);

    /**
     * @param request the request parameters of DescribeAuthEventNameList  DescribeAuthEventNameListRequest
     * @return DescribeAuthEventNameListResponse
     */
    CompletableFuture<DescribeAuthEventNameListResponse> describeAuthEventNameList(DescribeAuthEventNameListRequest request);

    /**
     * @param request the request parameters of DescribeAuthRulePageList  DescribeAuthRulePageListRequest
     * @return DescribeAuthRulePageListResponse
     */
    CompletableFuture<DescribeAuthRulePageListResponse> describeAuthRulePageList(DescribeAuthRulePageListRequest request);

    /**
     * @param request the request parameters of DescribeAuthSceneList  DescribeAuthSceneListRequest
     * @return DescribeAuthSceneListResponse
     */
    CompletableFuture<DescribeAuthSceneListResponse> describeAuthSceneList(DescribeAuthSceneListRequest request);

    /**
     * @param request the request parameters of DescribeAuthScenePageList  DescribeAuthScenePageListRequest
     * @return DescribeAuthScenePageListResponse
     */
    CompletableFuture<DescribeAuthScenePageListResponse> describeAuthScenePageList(DescribeAuthScenePageListRequest request);

    /**
     * @param request the request parameters of DescribeAuthStatus  DescribeAuthStatusRequest
     * @return DescribeAuthStatusResponse
     */
    CompletableFuture<DescribeAuthStatusResponse> describeAuthStatus(DescribeAuthStatusRequest request);

    /**
     * @param request the request parameters of DescribeAvgExecuteCostReport  DescribeAvgExecuteCostReportRequest
     * @return DescribeAvgExecuteCostReportResponse
     */
    CompletableFuture<DescribeAvgExecuteCostReportResponse> describeAvgExecuteCostReport(DescribeAvgExecuteCostReportRequest request);

    /**
     * @param request the request parameters of DescribeBasicSearchPageList  DescribeBasicSearchPageListRequest
     * @return DescribeBasicSearchPageListResponse
     */
    CompletableFuture<DescribeBasicSearchPageListResponse> describeBasicSearchPageList(DescribeBasicSearchPageListRequest request);

    /**
     * @param request the request parameters of DescribeBasicStart  DescribeBasicStartRequest
     * @return DescribeBasicStartResponse
     */
    CompletableFuture<DescribeBasicStartResponse> describeBasicStart(DescribeBasicStartRequest request);

    /**
     * @param request the request parameters of DescribeByPassShuntEvent  DescribeByPassShuntEventRequest
     * @return DescribeByPassShuntEventResponse
     */
    CompletableFuture<DescribeByPassShuntEventResponse> describeByPassShuntEvent(DescribeByPassShuntEventRequest request);

    /**
     * @param request the request parameters of DescribeCustVariableConfigList  DescribeCustVariableConfigListRequest
     * @return DescribeCustVariableConfigListResponse
     */
    CompletableFuture<DescribeCustVariableConfigListResponse> describeCustVariableConfigList(DescribeCustVariableConfigListRequest request);

    /**
     * @param request the request parameters of DescribeCustVariableDetail  DescribeCustVariableDetailRequest
     * @return DescribeCustVariableDetailResponse
     */
    CompletableFuture<DescribeCustVariableDetailResponse> describeCustVariableDetail(DescribeCustVariableDetailRequest request);

    /**
     * <b>description</b> :
     * <p>List Query of Accumulated Variables</p>
     * 
     * @param request the request parameters of DescribeCustVariablePage  DescribeCustVariablePageRequest
     * @return DescribeCustVariablePageResponse
     */
    CompletableFuture<DescribeCustVariablePageResponse> describeCustVariablePage(DescribeCustVariablePageRequest request);

    /**
     * @param request the request parameters of DescribeDataSourceDataDownloadUrl  DescribeDataSourceDataDownloadUrlRequest
     * @return DescribeDataSourceDataDownloadUrlResponse
     */
    CompletableFuture<DescribeDataSourceDataDownloadUrlResponse> describeDataSourceDataDownloadUrl(DescribeDataSourceDataDownloadUrlRequest request);

    /**
     * @param request the request parameters of DescribeDataSourceFields  DescribeDataSourceFieldsRequest
     * @return DescribeDataSourceFieldsResponse
     */
    CompletableFuture<DescribeDataSourceFieldsResponse> describeDataSourceFields(DescribeDataSourceFieldsRequest request);

    /**
     * @param request the request parameters of DescribeDataSourcePageList  DescribeDataSourcePageListRequest
     * @return DescribeDataSourcePageListResponse
     */
    CompletableFuture<DescribeDataSourcePageListResponse> describeDataSourcePageList(DescribeDataSourcePageListRequest request);

    /**
     * @param request the request parameters of DescribeDecisionResultFluctuation  DescribeDecisionResultFluctuationRequest
     * @return DescribeDecisionResultFluctuationResponse
     */
    CompletableFuture<DescribeDecisionResultFluctuationResponse> describeDecisionResultFluctuation(DescribeDecisionResultFluctuationRequest request);

    /**
     * @param request the request parameters of DescribeDecisionResultTrend  DescribeDecisionResultTrendRequest
     * @return DescribeDecisionResultTrendResponse
     */
    CompletableFuture<DescribeDecisionResultTrendResponse> describeDecisionResultTrend(DescribeDecisionResultTrendRequest request);

    /**
     * @param request the request parameters of DescribeDetailStart  DescribeDetailStartRequest
     * @return DescribeDetailStartResponse
     */
    CompletableFuture<DescribeDetailStartResponse> describeDetailStart(DescribeDetailStartRequest request);

    /**
     * @param request the request parameters of DescribeDownloadUrl  DescribeDownloadUrlRequest
     * @return DescribeDownloadUrlResponse
     */
    CompletableFuture<DescribeDownloadUrlResponse> describeDownloadUrl(DescribeDownloadUrlRequest request);

    /**
     * @param request the request parameters of DescribeEventBaseInfoByEventCode  DescribeEventBaseInfoByEventCodeRequest
     * @return DescribeEventBaseInfoByEventCodeResponse
     */
    CompletableFuture<DescribeEventBaseInfoByEventCodeResponse> describeEventBaseInfoByEventCode(DescribeEventBaseInfoByEventCodeRequest request);

    /**
     * @param request the request parameters of DescribeEventCount  DescribeEventCountRequest
     * @return DescribeEventCountResponse
     */
    CompletableFuture<DescribeEventCountResponse> describeEventCount(DescribeEventCountRequest request);

    /**
     * @param request the request parameters of DescribeEventDetailByRequestId  DescribeEventDetailByRequestIdRequest
     * @return DescribeEventDetailByRequestIdResponse
     */
    CompletableFuture<DescribeEventDetailByRequestIdResponse> describeEventDetailByRequestId(DescribeEventDetailByRequestIdRequest request);

    /**
     * @param request the request parameters of DescribeEventLogDetail  DescribeEventLogDetailRequest
     * @return DescribeEventLogDetailResponse
     */
    CompletableFuture<DescribeEventLogDetailResponse> describeEventLogDetail(DescribeEventLogDetailRequest request);

    /**
     * @param request the request parameters of DescribeEventLogPage  DescribeEventLogPageRequest
     * @return DescribeEventLogPageResponse
     */
    CompletableFuture<DescribeEventLogPageResponse> describeEventLogPage(DescribeEventLogPageRequest request);

    /**
     * @param request the request parameters of DescribeEventPageList  DescribeEventPageListRequest
     * @return DescribeEventPageListResponse
     */
    CompletableFuture<DescribeEventPageListResponse> describeEventPageList(DescribeEventPageListRequest request);

    /**
     * @param request the request parameters of DescribeEventResultBarChart  DescribeEventResultBarChartRequest
     * @return DescribeEventResultBarChartResponse
     */
    CompletableFuture<DescribeEventResultBarChartResponse> describeEventResultBarChart(DescribeEventResultBarChartRequest request);

    /**
     * @param request the request parameters of DescribeEventResultList  DescribeEventResultListRequest
     * @return DescribeEventResultListResponse
     */
    CompletableFuture<DescribeEventResultListResponse> describeEventResultList(DescribeEventResultListRequest request);

    /**
     * @param request the request parameters of DescribeEventTaskHistory  DescribeEventTaskHistoryRequest
     * @return DescribeEventTaskHistoryResponse
     */
    CompletableFuture<DescribeEventTaskHistoryResponse> describeEventTaskHistory(DescribeEventTaskHistoryRequest request);

    /**
     * @param request the request parameters of DescribeEventTotalCountReport  DescribeEventTotalCountReportRequest
     * @return DescribeEventTotalCountReportResponse
     */
    CompletableFuture<DescribeEventTotalCountReportResponse> describeEventTotalCountReport(DescribeEventTotalCountReportRequest request);

    /**
     * @param request the request parameters of DescribeEventUploadPolicy  DescribeEventUploadPolicyRequest
     * @return DescribeEventUploadPolicyResponse
     */
    CompletableFuture<DescribeEventUploadPolicyResponse> describeEventUploadPolicy(DescribeEventUploadPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>Cumulative Variable List Query</p>
     * 
     * @param request the request parameters of DescribeEventVariableList  DescribeEventVariableListRequest
     * @return DescribeEventVariableListResponse
     */
    CompletableFuture<DescribeEventVariableListResponse> describeEventVariableList(DescribeEventVariableListRequest request);

    /**
     * @param request the request parameters of DescribeEventVariableTemplateBind  DescribeEventVariableTemplateBindRequest
     * @return DescribeEventVariableTemplateBindResponse
     */
    CompletableFuture<DescribeEventVariableTemplateBindResponse> describeEventVariableTemplateBind(DescribeEventVariableTemplateBindRequest request);

    /**
     * @param request the request parameters of DescribeEventVariableTemplateList  DescribeEventVariableTemplateListRequest
     * @return DescribeEventVariableTemplateListResponse
     */
    CompletableFuture<DescribeEventVariableTemplateListResponse> describeEventVariableTemplateList(DescribeEventVariableTemplateListRequest request);

    /**
     * @param request the request parameters of DescribeEventsVariableList  DescribeEventsVariableListRequest
     * @return DescribeEventsVariableListResponse
     */
    CompletableFuture<DescribeEventsVariableListResponse> describeEventsVariableList(DescribeEventsVariableListRequest request);

    /**
     * @param request the request parameters of DescribeExcuteNum  DescribeExcuteNumRequest
     * @return DescribeExcuteNumResponse
     */
    CompletableFuture<DescribeExcuteNumResponse> describeExcuteNum(DescribeExcuteNumRequest request);

    /**
     * @param request the request parameters of DescribeExistName  DescribeExistNameRequest
     * @return DescribeExistNameResponse
     */
    CompletableFuture<DescribeExistNameResponse> describeExistName(DescribeExistNameRequest request);

    /**
     * @param request the request parameters of DescribeExistScene  DescribeExistSceneRequest
     * @return DescribeExistSceneResponse
     */
    CompletableFuture<DescribeExistSceneResponse> describeExistScene(DescribeExistSceneRequest request);

    /**
     * @param request the request parameters of DescribeExpressionVariableDetail  DescribeExpressionVariableDetailRequest
     * @return DescribeExpressionVariableDetailResponse
     */
    CompletableFuture<DescribeExpressionVariableDetailResponse> describeExpressionVariableDetail(DescribeExpressionVariableDetailRequest request);

    /**
     * @param request the request parameters of DescribeExpressionVariableFunctionList  DescribeExpressionVariableFunctionListRequest
     * @return DescribeExpressionVariableFunctionListResponse
     */
    CompletableFuture<DescribeExpressionVariableFunctionListResponse> describeExpressionVariableFunctionList(DescribeExpressionVariableFunctionListRequest request);

    /**
     * @param request the request parameters of DescribeExpressionVariablePage  DescribeExpressionVariablePageRequest
     * @return DescribeExpressionVariablePageResponse
     */
    CompletableFuture<DescribeExpressionVariablePageResponse> describeExpressionVariablePage(DescribeExpressionVariablePageRequest request);

    /**
     * @param request the request parameters of DescribeFieldById  DescribeFieldByIdRequest
     * @return DescribeFieldByIdResponse
     */
    CompletableFuture<DescribeFieldByIdResponse> describeFieldById(DescribeFieldByIdRequest request);

    /**
     * @param request the request parameters of DescribeFieldList  DescribeFieldListRequest
     * @return DescribeFieldListResponse
     */
    CompletableFuture<DescribeFieldListResponse> describeFieldList(DescribeFieldListRequest request);

    /**
     * @param request the request parameters of DescribeFieldPage  DescribeFieldPageRequest
     * @return DescribeFieldPageResponse
     */
    CompletableFuture<DescribeFieldPageResponse> describeFieldPage(DescribeFieldPageRequest request);

    /**
     * @param request the request parameters of DescribeGroupAccountPage  DescribeGroupAccountPageRequest
     * @return DescribeGroupAccountPageResponse
     */
    CompletableFuture<DescribeGroupAccountPageResponse> describeGroupAccountPage(DescribeGroupAccountPageRequest request);

    /**
     * @param request the request parameters of DescribeGroupConditionList  DescribeGroupConditionListRequest
     * @return DescribeGroupConditionListResponse
     */
    CompletableFuture<DescribeGroupConditionListResponse> describeGroupConditionList(DescribeGroupConditionListRequest request);

    /**
     * @param request the request parameters of DescribeGroupPage  DescribeGroupPageRequest
     * @return DescribeGroupPageResponse
     */
    CompletableFuture<DescribeGroupPageResponse> describeGroupPage(DescribeGroupPageRequest request);

    /**
     * @param request the request parameters of DescribeGroupStatisticsByToday  DescribeGroupStatisticsByTodayRequest
     * @return DescribeGroupStatisticsByTodayResponse
     */
    CompletableFuture<DescribeGroupStatisticsByTodayResponse> describeGroupStatisticsByToday(DescribeGroupStatisticsByTodayRequest request);

    /**
     * @param request the request parameters of DescribeGroupTrend  DescribeGroupTrendRequest
     * @return DescribeGroupTrendResponse
     */
    CompletableFuture<DescribeGroupTrendResponse> describeGroupTrend(DescribeGroupTrendRequest request);

    /**
     * @param request the request parameters of DescribeHasRuleNameByEventCode  DescribeHasRuleNameByEventCodeRequest
     * @return DescribeHasRuleNameByEventCodeResponse
     */
    CompletableFuture<DescribeHasRuleNameByEventCodeResponse> describeHasRuleNameByEventCode(DescribeHasRuleNameByEventCodeRequest request);

    /**
     * @param request the request parameters of DescribeHighRiskPieChart  DescribeHighRiskPieChartRequest
     * @return DescribeHighRiskPieChartResponse
     */
    CompletableFuture<DescribeHighRiskPieChartResponse> describeHighRiskPieChart(DescribeHighRiskPieChartRequest request);

    /**
     * @param request the request parameters of DescribeHitRuleFluctuation  DescribeHitRuleFluctuationRequest
     * @return DescribeHitRuleFluctuationResponse
     */
    CompletableFuture<DescribeHitRuleFluctuationResponse> describeHitRuleFluctuation(DescribeHitRuleFluctuationRequest request);

    /**
     * @param request the request parameters of DescribeHitRuleList  DescribeHitRuleListRequest
     * @return DescribeHitRuleListResponse
     */
    CompletableFuture<DescribeHitRuleListResponse> describeHitRuleList(DescribeHitRuleListRequest request);

    /**
     * @param request the request parameters of DescribeHitRuleTrend  DescribeHitRuleTrendRequest
     * @return DescribeHitRuleTrendResponse
     */
    CompletableFuture<DescribeHitRuleTrendResponse> describeHitRuleTrend(DescribeHitRuleTrendRequest request);

    /**
     * <b>description</b> :
     * <p>Add prompt information in BOPS, POC new page initialization popup prompts this information</p>
     * 
     * @param request the request parameters of DescribeInitDig  DescribeInitDigRequest
     * @return DescribeInitDigResponse
     */
    CompletableFuture<DescribeInitDigResponse> describeInitDig(DescribeInitDigRequest request);

    /**
     * @param request the request parameters of DescribeInputFeildCountByEventCode  DescribeInputFeildCountByEventCodeRequest
     * @return DescribeInputFeildCountByEventCodeResponse
     */
    CompletableFuture<DescribeInputFeildCountByEventCodeResponse> describeInputFeildCountByEventCode(DescribeInputFeildCountByEventCodeRequest request);

    /**
     * @param request the request parameters of DescribeListModel  DescribeListModelRequest
     * @return DescribeListModelResponse
     */
    CompletableFuture<DescribeListModelResponse> describeListModel(DescribeListModelRequest request);

    /**
     * @param request the request parameters of DescribeListPoc  DescribeListPocRequest
     * @return DescribeListPocResponse
     */
    CompletableFuture<DescribeListPocResponse> describeListPoc(DescribeListPocRequest request);

    /**
     * @param request the request parameters of DescribeLoanExecList  DescribeLoanExecListRequest
     * @return DescribeLoanExecListResponse
     */
    CompletableFuture<DescribeLoanExecListResponse> describeLoanExecList(DescribeLoanExecListRequest request);

    /**
     * @param request the request parameters of DescribeLoanTaskList  DescribeLoanTaskListRequest
     * @return DescribeLoanTaskListResponse
     */
    CompletableFuture<DescribeLoanTaskListResponse> describeLoanTaskList(DescribeLoanTaskListRequest request);

    /**
     * @param request the request parameters of DescribeMarkPage  DescribeMarkPageRequest
     * @return DescribeMarkPageResponse
     */
    CompletableFuture<DescribeMarkPageResponse> describeMarkPage(DescribeMarkPageRequest request);

    /**
     * @param request the request parameters of DescribeMenuPermission  DescribeMenuPermissionRequest
     * @return DescribeMenuPermissionResponse
     */
    CompletableFuture<DescribeMenuPermissionResponse> describeMenuPermission(DescribeMenuPermissionRequest request);

    /**
     * @param request the request parameters of DescribeModelDetailsById  DescribeModelDetailsByIdRequest
     * @return DescribeModelDetailsByIdResponse
     */
    CompletableFuture<DescribeModelDetailsByIdResponse> describeModelDetailsById(DescribeModelDetailsByIdRequest request);

    /**
     * @param request the request parameters of DescribeModelOssPolicy  DescribeModelOssPolicyRequest
     * @return DescribeModelOssPolicyResponse
     */
    CompletableFuture<DescribeModelOssPolicyResponse> describeModelOssPolicy(DescribeModelOssPolicyRequest request);

    /**
     * @param request the request parameters of DescribeMonitorTaskLimit  DescribeMonitorTaskLimitRequest
     * @return DescribeMonitorTaskLimitResponse
     */
    CompletableFuture<DescribeMonitorTaskLimitResponse> describeMonitorTaskLimit(DescribeMonitorTaskLimitRequest request);

    /**
     * @param request the request parameters of DescribeNameList  DescribeNameListRequest
     * @return DescribeNameListResponse
     */
    CompletableFuture<DescribeNameListResponse> describeNameList(DescribeNameListRequest request);

    /**
     * @param request the request parameters of DescribeNameListDownloadUrl  DescribeNameListDownloadUrlRequest
     * @return DescribeNameListDownloadUrlResponse
     */
    CompletableFuture<DescribeNameListDownloadUrlResponse> describeNameListDownloadUrl(DescribeNameListDownloadUrlRequest request);

    /**
     * @param request the request parameters of DescribeNameListLimit  DescribeNameListLimitRequest
     * @return DescribeNameListLimitResponse
     */
    CompletableFuture<DescribeNameListLimitResponse> describeNameListLimit(DescribeNameListLimitRequest request);

    /**
     * @param request the request parameters of DescribeNameListPageList  DescribeNameListPageListRequest
     * @return DescribeNameListPageListResponse
     */
    CompletableFuture<DescribeNameListPageListResponse> describeNameListPageList(DescribeNameListPageListRequest request);

    /**
     * @param request the request parameters of DescribeNameListTypeList  DescribeNameListTypeListRequest
     * @return DescribeNameListTypeListResponse
     */
    CompletableFuture<DescribeNameListTypeListResponse> describeNameListTypeList(DescribeNameListTypeListRequest request);

    /**
     * @param request the request parameters of DescribeNameListVariablePageList  DescribeNameListVariablePageListRequest
     * @return DescribeNameListVariablePageListResponse
     */
    CompletableFuture<DescribeNameListVariablePageListResponse> describeNameListVariablePageList(DescribeNameListVariablePageListRequest request);

    /**
     * @param request the request parameters of DescribeOperationLogMonitoring  DescribeOperationLogMonitoringRequest
     * @return DescribeOperationLogMonitoringResponse
     */
    CompletableFuture<DescribeOperationLogMonitoringResponse> describeOperationLogMonitoring(DescribeOperationLogMonitoringRequest request);

    /**
     * @param request the request parameters of DescribeOperationLogPageList  DescribeOperationLogPageListRequest
     * @return DescribeOperationLogPageListResponse
     */
    CompletableFuture<DescribeOperationLogPageListResponse> describeOperationLogPageList(DescribeOperationLogPageListRequest request);

    /**
     * @param request the request parameters of DescribeOperatorList  DescribeOperatorListRequest
     * @return DescribeOperatorListResponse
     */
    CompletableFuture<DescribeOperatorListResponse> describeOperatorList(DescribeOperatorListRequest request);

    /**
     * @param request the request parameters of DescribeOperatorListByScene  DescribeOperatorListBySceneRequest
     * @return DescribeOperatorListBySceneResponse
     */
    CompletableFuture<DescribeOperatorListBySceneResponse> describeOperatorListByScene(DescribeOperatorListBySceneRequest request);

    /**
     * @param request the request parameters of DescribeOperatorListByType  DescribeOperatorListByTypeRequest
     * @return DescribeOperatorListByTypeResponse
     */
    CompletableFuture<DescribeOperatorListByTypeResponse> describeOperatorListByType(DescribeOperatorListByTypeRequest request);

    /**
     * @param request the request parameters of DescribeOssAuthStatus  DescribeOssAuthStatusRequest
     * @return DescribeOssAuthStatusResponse
     */
    CompletableFuture<DescribeOssAuthStatusResponse> describeOssAuthStatus(DescribeOssAuthStatusRequest request);

    /**
     * @param request the request parameters of DescribeOssPolicy  DescribeOssPolicyRequest
     * @return DescribeOssPolicyResponse
     */
    CompletableFuture<DescribeOssPolicyResponse> describeOssPolicy(DescribeOssPolicyRequest request);

    /**
     * @param request the request parameters of DescribeOssToken  DescribeOssTokenRequest
     * @return DescribeOssTokenResponse
     */
    CompletableFuture<DescribeOssTokenResponse> describeOssToken(DescribeOssTokenRequest request);

    /**
     * @param request the request parameters of DescribeParamByEventCodes  DescribeParamByEventCodesRequest
     * @return DescribeParamByEventCodesResponse
     */
    CompletableFuture<DescribeParamByEventCodesResponse> describeParamByEventCodes(DescribeParamByEventCodesRequest request);

    /**
     * @param request the request parameters of DescribePocOssToken  DescribePocOssTokenRequest
     * @return DescribePocOssTokenResponse
     */
    CompletableFuture<DescribePocOssTokenResponse> describePocOssToken(DescribePocOssTokenRequest request);

    /**
     * @param request the request parameters of DescribePocTaskList  DescribePocTaskListRequest
     * @return DescribePocTaskListResponse
     */
    CompletableFuture<DescribePocTaskListResponse> describePocTaskList(DescribePocTaskListRequest request);

    /**
     * @param request the request parameters of DescribePrivateStack  DescribePrivateStackRequest
     * @return DescribePrivateStackResponse
     */
    CompletableFuture<DescribePrivateStackResponse> describePrivateStack(DescribePrivateStackRequest request);

    /**
     * @param request the request parameters of DescribeQueryVariableDetail  DescribeQueryVariableDetailRequest
     * @return DescribeQueryVariableDetailResponse
     */
    CompletableFuture<DescribeQueryVariableDetailResponse> describeQueryVariableDetail(DescribeQueryVariableDetailRequest request);

    /**
     * @param request the request parameters of DescribeQueryVariablePageList  DescribeQueryVariablePageListRequest
     * @return DescribeQueryVariablePageListResponse
     */
    CompletableFuture<DescribeQueryVariablePageListResponse> describeQueryVariablePageList(DescribeQueryVariablePageListRequest request);

    /**
     * @param request the request parameters of DescribeRecommendSceneVariables  DescribeRecommendSceneVariablesRequest
     * @return DescribeRecommendSceneVariablesResponse
     */
    CompletableFuture<DescribeRecommendSceneVariablesResponse> describeRecommendSceneVariables(DescribeRecommendSceneVariablesRequest request);

    /**
     * @param request the request parameters of DescribeRecommendTaskDetail  DescribeRecommendTaskDetailRequest
     * @return DescribeRecommendTaskDetailResponse
     */
    CompletableFuture<DescribeRecommendTaskDetailResponse> describeRecommendTaskDetail(DescribeRecommendTaskDetailRequest request);

    /**
     * @param request the request parameters of DescribeRecommendTaskPageList  DescribeRecommendTaskPageListRequest
     * @return DescribeRecommendTaskPageListResponse
     */
    CompletableFuture<DescribeRecommendTaskPageListResponse> describeRecommendTaskPageList(DescribeRecommendTaskPageListRequest request);

    /**
     * @param request the request parameters of DescribeRecommendVariablesVelocity  DescribeRecommendVariablesVelocityRequest
     * @return DescribeRecommendVariablesVelocityResponse
     */
    CompletableFuture<DescribeRecommendVariablesVelocityResponse> describeRecommendVariablesVelocity(DescribeRecommendVariablesVelocityRequest request);

    /**
     * @param request the request parameters of DescribeRecommendVelocities  DescribeRecommendVelocitiesRequest
     * @return DescribeRecommendVelocitiesResponse
     */
    CompletableFuture<DescribeRecommendVelocitiesResponse> describeRecommendVelocities(DescribeRecommendVelocitiesRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * @param request the request parameters of DescribeRequestHit  DescribeRequestHitRequest
     * @return DescribeRequestHitResponse
     */
    CompletableFuture<DescribeRequestHitResponse> describeRequestHit(DescribeRequestHitRequest request);

    /**
     * @param request the request parameters of DescribeRequestPeakReport  DescribeRequestPeakReportRequest
     * @return DescribeRequestPeakReportResponse
     */
    CompletableFuture<DescribeRequestPeakReportResponse> describeRequestPeakReport(DescribeRequestPeakReportRequest request);

    /**
     * @param request the request parameters of DescribeResultCount  DescribeResultCountRequest
     * @return DescribeResultCountResponse
     */
    CompletableFuture<DescribeResultCountResponse> describeResultCount(DescribeResultCountRequest request);

    /**
     * @param request the request parameters of DescribeRiskLineChart  DescribeRiskLineChartRequest
     * @return DescribeRiskLineChartResponse
     */
    CompletableFuture<DescribeRiskLineChartResponse> describeRiskLineChart(DescribeRiskLineChartRequest request);

    /**
     * @param request the request parameters of DescribeRiskTagsLineChart  DescribeRiskTagsLineChartRequest
     * @return DescribeRiskTagsLineChartResponse
     */
    CompletableFuture<DescribeRiskTagsLineChartResponse> describeRiskTagsLineChart(DescribeRiskTagsLineChartRequest request);

    /**
     * @param request the request parameters of DescribeRuleBarChart  DescribeRuleBarChartRequest
     * @return DescribeRuleBarChartResponse
     */
    CompletableFuture<DescribeRuleBarChartResponse> describeRuleBarChart(DescribeRuleBarChartRequest request);

    /**
     * @param request the request parameters of DescribeRuleCountByUserId  DescribeRuleCountByUserIdRequest
     * @return DescribeRuleCountByUserIdResponse
     */
    CompletableFuture<DescribeRuleCountByUserIdResponse> describeRuleCountByUserId(DescribeRuleCountByUserIdRequest request);

    /**
     * @param request the request parameters of DescribeRuleDetailByRuleId  DescribeRuleDetailByRuleIdRequest
     * @return DescribeRuleDetailByRuleIdResponse
     */
    CompletableFuture<DescribeRuleDetailByRuleIdResponse> describeRuleDetailByRuleId(DescribeRuleDetailByRuleIdRequest request);

    /**
     * @param request the request parameters of DescribeRuleHit  DescribeRuleHitRequest
     * @return DescribeRuleHitResponse
     */
    CompletableFuture<DescribeRuleHitResponse> describeRuleHit(DescribeRuleHitRequest request);

    /**
     * @param request the request parameters of DescribeRuleListByEventCodesList  DescribeRuleListByEventCodesListRequest
     * @return DescribeRuleListByEventCodesListResponse
     */
    CompletableFuture<DescribeRuleListByEventCodesListResponse> describeRuleListByEventCodesList(DescribeRuleListByEventCodesListRequest request);

    /**
     * @param request the request parameters of DescribeRulePageList  DescribeRulePageListRequest
     * @return DescribeRulePageListResponse
     */
    CompletableFuture<DescribeRulePageListResponse> describeRulePageList(DescribeRulePageListRequest request);

    /**
     * @param request the request parameters of DescribeRuleSnapshot  DescribeRuleSnapshotRequest
     * @return DescribeRuleSnapshotResponse
     */
    CompletableFuture<DescribeRuleSnapshotResponse> describeRuleSnapshot(DescribeRuleSnapshotRequest request);

    /**
     * @param request the request parameters of DescribeRuleVersionList  DescribeRuleVersionListRequest
     * @return DescribeRuleVersionListResponse
     */
    CompletableFuture<DescribeRuleVersionListResponse> describeRuleVersionList(DescribeRuleVersionListRequest request);

    /**
     * @param request the request parameters of DescribeSDKDownloadList  DescribeSDKDownloadListRequest
     * @return DescribeSDKDownloadListResponse
     */
    CompletableFuture<DescribeSDKDownloadListResponse> describeSDKDownloadList(DescribeSDKDownloadListRequest request);

    /**
     * @param request the request parameters of DescribeSafConsole  DescribeSafConsoleRequest
     * @return DescribeSafConsoleResponse
     */
    CompletableFuture<DescribeSafConsoleResponse> describeSafConsole(DescribeSafConsoleRequest request);

    /**
     * @param request the request parameters of DescribeSafDeOrder  DescribeSafDeOrderRequest
     * @return DescribeSafDeOrderResponse
     */
    CompletableFuture<DescribeSafDeOrderResponse> describeSafDeOrder(DescribeSafDeOrderRequest request);

    /**
     * @param request the request parameters of DescribeSafOrder  DescribeSafOrderRequest
     * @return DescribeSafOrderResponse
     */
    CompletableFuture<DescribeSafOrderResponse> describeSafOrder(DescribeSafOrderRequest request);

    /**
     * @param request the request parameters of DescribeSafStartConfig  DescribeSafStartConfigRequest
     * @return DescribeSafStartConfigResponse
     */
    CompletableFuture<DescribeSafStartConfigResponse> describeSafStartConfig(DescribeSafStartConfigRequest request);

    /**
     * @param request the request parameters of DescribeSafStartSteps  DescribeSafStartStepsRequest
     * @return DescribeSafStartStepsResponse
     */
    CompletableFuture<DescribeSafStartStepsResponse> describeSafStartSteps(DescribeSafStartStepsRequest request);

    /**
     * @param request the request parameters of DescribeSafTagList  DescribeSafTagListRequest
     * @return DescribeSafTagListResponse
     */
    CompletableFuture<DescribeSafTagListResponse> describeSafTagList(DescribeSafTagListRequest request);

    /**
     * @param request the request parameters of DescribeSampleBatchOssPolicy  DescribeSampleBatchOssPolicyRequest
     * @return DescribeSampleBatchOssPolicyResponse
     */
    CompletableFuture<DescribeSampleBatchOssPolicyResponse> describeSampleBatchOssPolicy(DescribeSampleBatchOssPolicyRequest request);

    /**
     * @param request the request parameters of DescribeSampleDataByBatchUUidPage  DescribeSampleDataByBatchUUidPageRequest
     * @return DescribeSampleDataByBatchUUidPageResponse
     */
    CompletableFuture<DescribeSampleDataByBatchUUidPageResponse> describeSampleDataByBatchUUidPage(DescribeSampleDataByBatchUUidPageRequest request);

    /**
     * @param request the request parameters of DescribeSampleDataList  DescribeSampleDataListRequest
     * @return DescribeSampleDataListResponse
     */
    CompletableFuture<DescribeSampleDataListResponse> describeSampleDataList(DescribeSampleDataListRequest request);

    /**
     * @param request the request parameters of DescribeSampleDataPage  DescribeSampleDataPageRequest
     * @return DescribeSampleDataPageResponse
     */
    CompletableFuture<DescribeSampleDataPageResponse> describeSampleDataPage(DescribeSampleDataPageRequest request);

    /**
     * @param request the request parameters of DescribeSampleDemoDownloadUrl  DescribeSampleDemoDownloadUrlRequest
     * @return DescribeSampleDemoDownloadUrlResponse
     */
    CompletableFuture<DescribeSampleDemoDownloadUrlResponse> describeSampleDemoDownloadUrl(DescribeSampleDemoDownloadUrlRequest request);

    /**
     * @param request the request parameters of DescribeSampleDownloadUrl  DescribeSampleDownloadUrlRequest
     * @return DescribeSampleDownloadUrlResponse
     */
    CompletableFuture<DescribeSampleDownloadUrlResponse> describeSampleDownloadUrl(DescribeSampleDownloadUrlRequest request);

    /**
     * @param request the request parameters of DescribeSampleInfo  DescribeSampleInfoRequest
     * @return DescribeSampleInfoResponse
     */
    CompletableFuture<DescribeSampleInfoResponse> describeSampleInfo(DescribeSampleInfoRequest request);

    /**
     * @param request the request parameters of DescribeSampleList  DescribeSampleListRequest
     * @return DescribeSampleListResponse
     */
    CompletableFuture<DescribeSampleListResponse> describeSampleList(DescribeSampleListRequest request);

    /**
     * @param request the request parameters of DescribeSampleSceneList  DescribeSampleSceneListRequest
     * @return DescribeSampleSceneListResponse
     */
    CompletableFuture<DescribeSampleSceneListResponse> describeSampleSceneList(DescribeSampleSceneListRequest request);

    /**
     * @param request the request parameters of DescribeSampleTagList  DescribeSampleTagListRequest
     * @return DescribeSampleTagListResponse
     */
    CompletableFuture<DescribeSampleTagListResponse> describeSampleTagList(DescribeSampleTagListRequest request);

    /**
     * @param request the request parameters of DescribeSampleUploadPolicy  DescribeSampleUploadPolicyRequest
     * @return DescribeSampleUploadPolicyResponse
     */
    CompletableFuture<DescribeSampleUploadPolicyResponse> describeSampleUploadPolicy(DescribeSampleUploadPolicyRequest request);

    /**
     * @param request the request parameters of DescribeSamplebatchPage  DescribeSamplebatchPageRequest
     * @return DescribeSamplebatchPageResponse
     */
    CompletableFuture<DescribeSamplebatchPageResponse> describeSamplebatchPage(DescribeSamplebatchPageRequest request);

    /**
     * <b>description</b> :
     * <p>Dropdown list for scenario-based risk control events</p>
     * 
     * @param request the request parameters of DescribeSceneAllEventNameCodeList  DescribeSceneAllEventNameCodeListRequest
     * @return DescribeSceneAllEventNameCodeListResponse
     */
    CompletableFuture<DescribeSceneAllEventNameCodeListResponse> describeSceneAllEventNameCodeList(DescribeSceneAllEventNameCodeListRequest request);

    /**
     * @param request the request parameters of DescribeSceneEventPageList  DescribeSceneEventPageListRequest
     * @return DescribeSceneEventPageListResponse
     */
    CompletableFuture<DescribeSceneEventPageListResponse> describeSceneEventPageList(DescribeSceneEventPageListRequest request);

    /**
     * <b>description</b> :
     * <p>Query the list of scenarized risk control event strategies</p>
     * 
     * @param request the request parameters of DescribeSceneRulePageList  DescribeSceneRulePageListRequest
     * @return DescribeSceneRulePageListResponse
     */
    CompletableFuture<DescribeSceneRulePageListResponse> describeSceneRulePageList(DescribeSceneRulePageListRequest request);

    /**
     * @param request the request parameters of DescribeScoreList  DescribeScoreListRequest
     * @return DescribeScoreListResponse
     */
    CompletableFuture<DescribeScoreListResponse> describeScoreList(DescribeScoreListRequest request);

    /**
     * @param request the request parameters of DescribeScoreSectionNumLineChart  DescribeScoreSectionNumLineChartRequest
     * @return DescribeScoreSectionNumLineChartResponse
     */
    CompletableFuture<DescribeScoreSectionNumLineChartResponse> describeScoreSectionNumLineChart(DescribeScoreSectionNumLineChartRequest request);

    /**
     * @param request the request parameters of DescribeScoreSectionPieChart  DescribeScoreSectionPieChartRequest
     * @return DescribeScoreSectionPieChartResponse
     */
    CompletableFuture<DescribeScoreSectionPieChartResponse> describeScoreSectionPieChart(DescribeScoreSectionPieChartRequest request);

    /**
     * @param request the request parameters of DescribeScoreSectionRatioLineChart  DescribeScoreSectionRatioLineChartRequest
     * @return DescribeScoreSectionRatioLineChartResponse
     */
    CompletableFuture<DescribeScoreSectionRatioLineChartResponse> describeScoreSectionRatioLineChart(DescribeScoreSectionRatioLineChartRequest request);

    /**
     * @param request the request parameters of DescribeSelectItem  DescribeSelectItemRequest
     * @return DescribeSelectItemResponse
     */
    CompletableFuture<DescribeSelectItemResponse> describeSelectItem(DescribeSelectItemRequest request);

    /**
     * @param request the request parameters of DescribeServiceAppKey  DescribeServiceAppKeyRequest
     * @return DescribeServiceAppKeyResponse
     */
    CompletableFuture<DescribeServiceAppKeyResponse> describeServiceAppKey(DescribeServiceAppKeyRequest request);

    /**
     * @param request the request parameters of DescribeServiceCodeName  DescribeServiceCodeNameRequest
     * @return DescribeServiceCodeNameResponse
     */
    CompletableFuture<DescribeServiceCodeNameResponse> describeServiceCodeName(DescribeServiceCodeNameRequest request);

    /**
     * @param request the request parameters of DescribeServiceList  DescribeServiceListRequest
     * @return DescribeServiceListResponse
     */
    CompletableFuture<DescribeServiceListResponse> describeServiceList(DescribeServiceListRequest request);

    /**
     * @param request the request parameters of DescribeSimulationPreditInfo  DescribeSimulationPreditInfoRequest
     * @return DescribeSimulationPreditInfoResponse
     */
    CompletableFuture<DescribeSimulationPreditInfoResponse> describeSimulationPreditInfo(DescribeSimulationPreditInfoRequest request);

    /**
     * @param request the request parameters of DescribeSimulationTaskCount  DescribeSimulationTaskCountRequest
     * @return DescribeSimulationTaskCountResponse
     */
    CompletableFuture<DescribeSimulationTaskCountResponse> describeSimulationTaskCount(DescribeSimulationTaskCountRequest request);

    /**
     * @param request the request parameters of DescribeSimulationTaskList  DescribeSimulationTaskListRequest
     * @return DescribeSimulationTaskListResponse
     */
    CompletableFuture<DescribeSimulationTaskListResponse> describeSimulationTaskList(DescribeSimulationTaskListRequest request);

    /**
     * @param request the request parameters of DescribeSlsUrlConfig  DescribeSlsUrlConfigRequest
     * @return DescribeSlsUrlConfigResponse
     */
    CompletableFuture<DescribeSlsUrlConfigResponse> describeSlsUrlConfig(DescribeSlsUrlConfigRequest request);

    /**
     * @param request the request parameters of DescribeSupportRuleList  DescribeSupportRuleListRequest
     * @return DescribeSupportRuleListResponse
     */
    CompletableFuture<DescribeSupportRuleListResponse> describeSupportRuleList(DescribeSupportRuleListRequest request);

    /**
     * @param request the request parameters of DescribeTagList  DescribeTagListRequest
     * @return DescribeTagListResponse
     */
    CompletableFuture<DescribeTagListResponse> describeTagList(DescribeTagListRequest request);

    /**
     * @param request the request parameters of DescribeTagsBarChart  DescribeTagsBarChartRequest
     * @return DescribeTagsBarChartResponse
     */
    CompletableFuture<DescribeTagsBarChartResponse> describeTagsBarChart(DescribeTagsBarChartRequest request);

    /**
     * @param request the request parameters of DescribeTagsFluctuation  DescribeTagsFluctuationRequest
     * @return DescribeTagsFluctuationResponse
     */
    CompletableFuture<DescribeTagsFluctuationResponse> describeTagsFluctuation(DescribeTagsFluctuationRequest request);

    /**
     * @param request the request parameters of DescribeTagsList  DescribeTagsListRequest
     * @return DescribeTagsListResponse
     */
    CompletableFuture<DescribeTagsListResponse> describeTagsList(DescribeTagsListRequest request);

    /**
     * @param request the request parameters of DescribeTagsNumLineChart  DescribeTagsNumLineChartRequest
     * @return DescribeTagsNumLineChartResponse
     */
    CompletableFuture<DescribeTagsNumLineChartResponse> describeTagsNumLineChart(DescribeTagsNumLineChartRequest request);

    /**
     * @param request the request parameters of DescribeTagsRatioLineChart  DescribeTagsRatioLineChartRequest
     * @return DescribeTagsRatioLineChartResponse
     */
    CompletableFuture<DescribeTagsRatioLineChartResponse> describeTagsRatioLineChart(DescribeTagsRatioLineChartRequest request);

    /**
     * @param request the request parameters of DescribeTagsTrend  DescribeTagsTrendRequest
     * @return DescribeTagsTrendResponse
     */
    CompletableFuture<DescribeTagsTrendResponse> describeTagsTrend(DescribeTagsTrendRequest request);

    /**
     * @param request the request parameters of DescribeTaskList  DescribeTaskListRequest
     * @return DescribeTaskListResponse
     */
    CompletableFuture<DescribeTaskListResponse> describeTaskList(DescribeTaskListRequest request);

    /**
     * @param request the request parameters of DescribeTaskLogList  DescribeTaskLogListRequest
     * @return DescribeTaskLogListResponse
     */
    CompletableFuture<DescribeTaskLogListResponse> describeTaskLogList(DescribeTaskLogListRequest request);

    /**
     * @param request the request parameters of DescribeTemplateCount  DescribeTemplateCountRequest
     * @return DescribeTemplateCountResponse
     */
    CompletableFuture<DescribeTemplateCountResponse> describeTemplateCount(DescribeTemplateCountRequest request);

    /**
     * @param request the request parameters of DescribeTemplateDownload  DescribeTemplateDownloadRequest
     * @return DescribeTemplateDownloadResponse
     */
    CompletableFuture<DescribeTemplateDownloadResponse> describeTemplateDownload(DescribeTemplateDownloadRequest request);

    /**
     * @param request the request parameters of DescribeTemplatePageList  DescribeTemplatePageListRequest
     * @return DescribeTemplatePageListResponse
     */
    CompletableFuture<DescribeTemplatePageListResponse> describeTemplatePageList(DescribeTemplatePageListRequest request);

    /**
     * @param request the request parameters of DescribeUsedService  DescribeUsedServiceRequest
     * @return DescribeUsedServiceResponse
     */
    CompletableFuture<DescribeUsedServiceResponse> describeUsedService(DescribeUsedServiceRequest request);

    /**
     * @param request the request parameters of DescribeUserInfo  DescribeUserInfoRequest
     * @return DescribeUserInfoResponse
     */
    CompletableFuture<DescribeUserInfoResponse> describeUserInfo(DescribeUserInfoRequest request);

    /**
     * @param request the request parameters of DescribeVariableBindDetail  DescribeVariableBindDetailRequest
     * @return DescribeVariableBindDetailResponse
     */
    CompletableFuture<DescribeVariableBindDetailResponse> describeVariableBindDetail(DescribeVariableBindDetailRequest request);

    /**
     * @param request the request parameters of DescribeVariableDetail  DescribeVariableDetailRequest
     * @return DescribeVariableDetailResponse
     */
    CompletableFuture<DescribeVariableDetailResponse> describeVariableDetail(DescribeVariableDetailRequest request);

    /**
     * @param request the request parameters of DescribeVariableFee  DescribeVariableFeeRequest
     * @return DescribeVariableFeeResponse
     */
    CompletableFuture<DescribeVariableFeeResponse> describeVariableFee(DescribeVariableFeeRequest request);

    /**
     * @param request the request parameters of DescribeVariableList  DescribeVariableListRequest
     * @return DescribeVariableListResponse
     */
    CompletableFuture<DescribeVariableListResponse> describeVariableList(DescribeVariableListRequest request);

    /**
     * @param request the request parameters of DescribeVariableMarketList  DescribeVariableMarketListRequest
     * @return DescribeVariableMarketListResponse
     */
    CompletableFuture<DescribeVariableMarketListResponse> describeVariableMarketList(DescribeVariableMarketListRequest request);

    /**
     * @param request the request parameters of DescribeVariableSceneList  DescribeVariableSceneListRequest
     * @return DescribeVariableSceneListResponse
     */
    CompletableFuture<DescribeVariableSceneListResponse> describeVariableSceneList(DescribeVariableSceneListRequest request);

    /**
     * @param request the request parameters of DescribeVersionPageList  DescribeVersionPageListRequest
     * @return DescribeVersionPageListResponse
     */
    CompletableFuture<DescribeVersionPageListResponse> describeVersionPageList(DescribeVersionPageListRequest request);

    /**
     * @param request the request parameters of DownloadSmapleBatch  DownloadSmapleBatchRequest
     * @return DownloadSmapleBatchResponse
     */
    CompletableFuture<DownloadSmapleBatchResponse> downloadSmapleBatch(DownloadSmapleBatchRequest request);

    /**
     * @param request the request parameters of ExpressionTest  ExpressionTestRequest
     * @return ExpressionTestResponse
     */
    CompletableFuture<ExpressionTestResponse> expressionTest(ExpressionTestRequest request);

    /**
     * @param request the request parameters of FileUpload  FileUploadRequest
     * @return FileUploadResponse
     */
    CompletableFuture<FileUploadResponse> fileUpload(FileUploadRequest request);

    /**
     * @param request the request parameters of ImportField  ImportFieldRequest
     * @return ImportFieldResponse
     */
    CompletableFuture<ImportFieldResponse> importField(ImportFieldRequest request);

    /**
     * @param request the request parameters of ImportNameList  ImportNameListRequest
     * @return ImportNameListResponse
     */
    CompletableFuture<ImportNameListResponse> importNameList(ImportNameListRequest request);

    /**
     * @param request the request parameters of ImportTemplateEvent  ImportTemplateEventRequest
     * @return ImportTemplateEventResponse
     */
    CompletableFuture<ImportTemplateEventResponse> importTemplateEvent(ImportTemplateEventRequest request);

    /**
     * @param request the request parameters of ListVariableDefine  ListVariableDefineRequest
     * @return ListVariableDefineResponse
     */
    CompletableFuture<ListVariableDefineResponse> listVariableDefine(ListVariableDefineRequest request);

    /**
     * @param request the request parameters of ModelDelete  ModelDeleteRequest
     * @return ModelDeleteResponse
     */
    CompletableFuture<ModelDeleteResponse> modelDelete(ModelDeleteRequest request);

    /**
     * @param request the request parameters of ModelFileUpload  ModelFileUploadRequest
     * @return ModelFileUploadResponse
     */
    CompletableFuture<ModelFileUploadResponse> modelFileUpload(ModelFileUploadRequest request);

    /**
     * @param request the request parameters of ModelIsUsing  ModelIsUsingRequest
     * @return ModelIsUsingResponse
     */
    CompletableFuture<ModelIsUsingResponse> modelIsUsing(ModelIsUsingRequest request);

    /**
     * @param request the request parameters of ModelNameIsDuplication  ModelNameIsDuplicationRequest
     * @return ModelNameIsDuplicationResponse
     */
    CompletableFuture<ModelNameIsDuplicationResponse> modelNameIsDuplication(ModelNameIsDuplicationRequest request);

    /**
     * @param request the request parameters of ModelSampleDownload  ModelSampleDownloadRequest
     * @return ModelSampleDownloadResponse
     */
    CompletableFuture<ModelSampleDownloadResponse> modelSampleDownload(ModelSampleDownloadRequest request);

    /**
     * @param request the request parameters of ModifyAppKey  ModifyAppKeyRequest
     * @return ModifyAppKeyResponse
     */
    CompletableFuture<ModifyAppKeyResponse> modifyAppKey(ModifyAppKeyRequest request);

    /**
     * @param request the request parameters of ModifyCustVariable  ModifyCustVariableRequest
     * @return ModifyCustVariableResponse
     */
    CompletableFuture<ModifyCustVariableResponse> modifyCustVariable(ModifyCustVariableRequest request);

    /**
     * @param request the request parameters of ModifyEvent  ModifyEventRequest
     * @return ModifyEventResponse
     */
    CompletableFuture<ModifyEventResponse> modifyEvent(ModifyEventRequest request);

    /**
     * @param request the request parameters of ModifyEventStatus  ModifyEventStatusRequest
     * @return ModifyEventStatusResponse
     */
    CompletableFuture<ModifyEventStatusResponse> modifyEventStatus(ModifyEventStatusRequest request);

    /**
     * @param request the request parameters of ModifyExpressionVariable  ModifyExpressionVariableRequest
     * @return ModifyExpressionVariableResponse
     */
    CompletableFuture<ModifyExpressionVariableResponse> modifyExpressionVariable(ModifyExpressionVariableRequest request);

    /**
     * @param request the request parameters of ModifyField  ModifyFieldRequest
     * @return ModifyFieldResponse
     */
    CompletableFuture<ModifyFieldResponse> modifyField(ModifyFieldRequest request);

    /**
     * @param request the request parameters of ModifyRulePriority  ModifyRulePriorityRequest
     * @return ModifyRulePriorityResponse
     */
    CompletableFuture<ModifyRulePriorityResponse> modifyRulePriority(ModifyRulePriorityRequest request);

    /**
     * @param request the request parameters of ModifyRuleStatus  ModifyRuleStatusRequest
     * @return ModifyRuleStatusResponse
     */
    CompletableFuture<ModifyRuleStatusResponse> modifyRuleStatus(ModifyRuleStatusRequest request);

    /**
     * @param request the request parameters of OpenConsoleSls  OpenConsoleSlsRequest
     * @return OpenConsoleSlsResponse
     */
    CompletableFuture<OpenConsoleSlsResponse> openConsoleSls(OpenConsoleSlsRequest request);

    /**
     * @param request the request parameters of OperateFavoriteVariable  OperateFavoriteVariableRequest
     * @return OperateFavoriteVariableResponse
     */
    CompletableFuture<OperateFavoriteVariableResponse> operateFavoriteVariable(OperateFavoriteVariableRequest request);

    /**
     * @param request the request parameters of PermissionCheck  PermissionCheckRequest
     * @return PermissionCheckResponse
     */
    CompletableFuture<PermissionCheckResponse> permissionCheck(PermissionCheckRequest request);

    /**
     * @param request the request parameters of PocCreateTask  PocCreateTaskRequest
     * @return PocCreateTaskResponse
     */
    CompletableFuture<PocCreateTaskResponse> pocCreateTask(PocCreateTaskRequest request);

    /**
     * @param request the request parameters of PocGetDownloadUrl  PocGetDownloadUrlRequest
     * @return PocGetDownloadUrlResponse
     */
    CompletableFuture<PocGetDownloadUrlResponse> pocGetDownloadUrl(PocGetDownloadUrlRequest request);

    /**
     * @param request the request parameters of PocGetToken  PocGetTokenRequest
     * @return PocGetTokenResponse
     */
    CompletableFuture<PocGetTokenResponse> pocGetToken(PocGetTokenRequest request);

    /**
     * @param request the request parameters of PocSendData  PocSendDataRequest
     * @return PocSendDataResponse
     */
    CompletableFuture<PocSendDataResponse> pocSendData(PocSendDataRequest request);

    /**
     * @param request the request parameters of QueryAuthRuleDetailByRuleId  QueryAuthRuleDetailByRuleIdRequest
     * @return QueryAuthRuleDetailByRuleIdResponse
     */
    CompletableFuture<QueryAuthRuleDetailByRuleIdResponse> queryAuthRuleDetailByRuleId(QueryAuthRuleDetailByRuleIdRequest request);

    /**
     * @param request the request parameters of RecallRuleAudit  RecallRuleAuditRequest
     * @return RecallRuleAuditResponse
     */
    CompletableFuture<RecallRuleAuditResponse> recallRuleAudit(RecallRuleAuditRequest request);

    /**
     * @param request the request parameters of RemoveEvent  RemoveEventRequest
     * @return RemoveEventResponse
     */
    CompletableFuture<RemoveEventResponse> removeEvent(RemoveEventRequest request);

    /**
     * @param request the request parameters of SampleFileDownload  SampleFileDownloadRequest
     * @return SampleFileDownloadResponse
     */
    CompletableFuture<SampleFileDownloadResponse> sampleFileDownload(SampleFileDownloadRequest request);

    /**
     * @param request the request parameters of SaveAnalysisColumn  SaveAnalysisColumnRequest
     * @return SaveAnalysisColumnResponse
     */
    CompletableFuture<SaveAnalysisColumnResponse> saveAnalysisColumn(SaveAnalysisColumnRequest request);

    /**
     * @param request the request parameters of SaveByPassOrShuntEvent  SaveByPassOrShuntEventRequest
     * @return SaveByPassOrShuntEventResponse
     */
    CompletableFuture<SaveByPassOrShuntEventResponse> saveByPassOrShuntEvent(SaveByPassOrShuntEventRequest request);

    /**
     * @param request the request parameters of StartOrStopByPassShuntEvent  StartOrStopByPassShuntEventRequest
     * @return StartOrStopByPassShuntEventResponse
     */
    CompletableFuture<StartOrStopByPassShuntEventResponse> startOrStopByPassShuntEvent(StartOrStopByPassShuntEventRequest request);

    /**
     * @param request the request parameters of StartSimulationTask  StartSimulationTaskRequest
     * @return StartSimulationTaskResponse
     */
    CompletableFuture<StartSimulationTaskResponse> startSimulationTask(StartSimulationTaskRequest request);

    /**
     * @param request the request parameters of StopSimulationTask  StopSimulationTaskRequest
     * @return StopSimulationTaskResponse
     */
    CompletableFuture<StopSimulationTaskResponse> stopSimulationTask(StopSimulationTaskRequest request);

    /**
     * @param request the request parameters of SwitchExpressionVariable  SwitchExpressionVariableRequest
     * @return SwitchExpressionVariableResponse
     */
    CompletableFuture<SwitchExpressionVariableResponse> switchExpressionVariable(SwitchExpressionVariableRequest request);

    /**
     * @param request the request parameters of SwitchField  SwitchFieldRequest
     * @return SwitchFieldResponse
     */
    CompletableFuture<SwitchFieldResponse> switchField(SwitchFieldRequest request);

    /**
     * @param request the request parameters of SwitchQueryVariable  SwitchQueryVariableRequest
     * @return SwitchQueryVariableResponse
     */
    CompletableFuture<SwitchQueryVariableResponse> switchQueryVariable(SwitchQueryVariableRequest request);

    /**
     * @param request the request parameters of SwitchToOnline  SwitchToOnlineRequest
     * @return SwitchToOnlineResponse
     */
    CompletableFuture<SwitchToOnlineResponse> switchToOnline(SwitchToOnlineRequest request);

    /**
     * @param request the request parameters of SwitchVariable  SwitchVariableRequest
     * @return SwitchVariableResponse
     */
    CompletableFuture<SwitchVariableResponse> switchVariable(SwitchVariableRequest request);

    /**
     * @param request the request parameters of TaskNameByUserId  TaskNameByUserIdRequest
     * @return TaskNameByUserIdResponse
     */
    CompletableFuture<TaskNameByUserIdResponse> taskNameByUserId(TaskNameByUserIdRequest request);

    /**
     * @param request the request parameters of UpdateAnalysisConditionFavorite  UpdateAnalysisConditionFavoriteRequest
     * @return UpdateAnalysisConditionFavoriteResponse
     */
    CompletableFuture<UpdateAnalysisConditionFavoriteResponse> updateAnalysisConditionFavorite(UpdateAnalysisConditionFavoriteRequest request);

    /**
     * @param request the request parameters of UpdateAudit  UpdateAuditRequest
     * @return UpdateAuditResponse
     */
    CompletableFuture<UpdateAuditResponse> updateAudit(UpdateAuditRequest request);

    /**
     * @param request the request parameters of UpdateAuthRule  UpdateAuthRuleRequest
     * @return UpdateAuthRuleResponse
     */
    CompletableFuture<UpdateAuthRuleResponse> updateAuthRule(UpdateAuthRuleRequest request);

    /**
     * @param request the request parameters of UpdateByPassShuntEvent  UpdateByPassShuntEventRequest
     * @return UpdateByPassShuntEventResponse
     */
    CompletableFuture<UpdateByPassShuntEventResponse> updateByPassShuntEvent(UpdateByPassShuntEventRequest request);

    /**
     * @param request the request parameters of UpdateDataSource  UpdateDataSourceRequest
     * @return UpdateDataSourceResponse
     */
    CompletableFuture<UpdateDataSourceResponse> updateDataSource(UpdateDataSourceRequest request);

    /**
     * @param request the request parameters of UpdateQueryVariable  UpdateQueryVariableRequest
     * @return UpdateQueryVariableResponse
     */
    CompletableFuture<UpdateQueryVariableResponse> updateQueryVariable(UpdateQueryVariableRequest request);

    /**
     * @param request the request parameters of UpdateRule  UpdateRuleRequest
     * @return UpdateRuleResponse
     */
    CompletableFuture<UpdateRuleResponse> updateRule(UpdateRuleRequest request);

    /**
     * @param request the request parameters of UpdateRuleBase  UpdateRuleBaseRequest
     * @return UpdateRuleBaseResponse
     */
    CompletableFuture<UpdateRuleBaseResponse> updateRuleBase(UpdateRuleBaseRequest request);

    /**
     * @param request the request parameters of UpdateSampleBatch  UpdateSampleBatchRequest
     * @return UpdateSampleBatchResponse
     */
    CompletableFuture<UpdateSampleBatchResponse> updateSampleBatch(UpdateSampleBatchRequest request);

    /**
     * @param request the request parameters of UploadFileCheck  UploadFileCheckRequest
     * @return UploadFileCheckResponse
     */
    CompletableFuture<UploadFileCheckResponse> uploadFileCheck(UploadFileCheckRequest request);

}
