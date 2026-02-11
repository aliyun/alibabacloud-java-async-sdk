// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.arms20210422.models.*;
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
     * @param request the request parameters of AddGrafana  AddGrafanaRequest
     * @return AddGrafanaResponse
     */
    CompletableFuture<AddGrafanaResponse> addGrafana(AddGrafanaRequest request);

    /**
     * @param request the request parameters of AddIntegration  AddIntegrationRequest
     * @return AddIntegrationResponse
     */
    CompletableFuture<AddIntegrationResponse> addIntegration(AddIntegrationRequest request);

    /**
     * @param request the request parameters of ApplyScenario  ApplyScenarioRequest
     * @return ApplyScenarioResponse
     */
    CompletableFuture<ApplyScenarioResponse> applyScenario(ApplyScenarioRequest request);

    /**
     * @param request the request parameters of CheckDataConsistency  CheckDataConsistencyRequest
     * @return CheckDataConsistencyResponse
     */
    CompletableFuture<CheckDataConsistencyResponse> checkDataConsistency(CheckDataConsistencyRequest request);

    /**
     * @param request the request parameters of CheckServiceLinkedRoleForDeleting  CheckServiceLinkedRoleForDeletingRequest
     * @return CheckServiceLinkedRoleForDeletingResponse
     */
    CompletableFuture<CheckServiceLinkedRoleForDeletingResponse> checkServiceLinkedRoleForDeleting(CheckServiceLinkedRoleForDeletingRequest request);

    /**
     * @param request the request parameters of CheckServiceStatus  CheckServiceStatusRequest
     * @return CheckServiceStatusResponse
     */
    CompletableFuture<CheckServiceStatusResponse> checkServiceStatus(CheckServiceStatusRequest request);

    /**
     * @param request the request parameters of ConfigApp  ConfigAppRequest
     * @return ConfigAppResponse
     */
    CompletableFuture<ConfigAppResponse> configApp(ConfigAppRequest request);

    /**
     * @param request the request parameters of CreateAlertContact  CreateAlertContactRequest
     * @return CreateAlertContactResponse
     */
    CompletableFuture<CreateAlertContactResponse> createAlertContact(CreateAlertContactRequest request);

    /**
     * @param request the request parameters of CreateAlertContactGroup  CreateAlertContactGroupRequest
     * @return CreateAlertContactGroupResponse
     */
    CompletableFuture<CreateAlertContactGroupResponse> createAlertContactGroup(CreateAlertContactGroupRequest request);

    /**
     * @param request the request parameters of CreateAlertTemplate  CreateAlertTemplateRequest
     * @return CreateAlertTemplateResponse
     */
    CompletableFuture<CreateAlertTemplateResponse> createAlertTemplate(CreateAlertTemplateRequest request);

    /**
     * @param request the request parameters of CreateDispatchRule  CreateDispatchRuleRequest
     * @return CreateDispatchRuleResponse
     */
    CompletableFuture<CreateDispatchRuleResponse> createDispatchRule(CreateDispatchRuleRequest request);

    /**
     * @param request the request parameters of CreatePrometheusAlertRule  CreatePrometheusAlertRuleRequest
     * @return CreatePrometheusAlertRuleResponse
     */
    CompletableFuture<CreatePrometheusAlertRuleResponse> createPrometheusAlertRule(CreatePrometheusAlertRuleRequest request);

    /**
     * @param request the request parameters of CreateRetcodeApp  CreateRetcodeAppRequest
     * @return CreateRetcodeAppResponse
     */
    CompletableFuture<CreateRetcodeAppResponse> createRetcodeApp(CreateRetcodeAppRequest request);

    /**
     * @param request the request parameters of CreateWehook  CreateWehookRequest
     * @return CreateWehookResponse
     */
    CompletableFuture<CreateWehookResponse> createWehook(CreateWehookRequest request);

    /**
     * @param request the request parameters of DeleteAlertContact  DeleteAlertContactRequest
     * @return DeleteAlertContactResponse
     */
    CompletableFuture<DeleteAlertContactResponse> deleteAlertContact(DeleteAlertContactRequest request);

    /**
     * @param request the request parameters of DeleteAlertContactGroup  DeleteAlertContactGroupRequest
     * @return DeleteAlertContactGroupResponse
     */
    CompletableFuture<DeleteAlertContactGroupResponse> deleteAlertContactGroup(DeleteAlertContactGroupRequest request);

    /**
     * @param request the request parameters of DeleteAlertRules  DeleteAlertRulesRequest
     * @return DeleteAlertRulesResponse
     */
    CompletableFuture<DeleteAlertRulesResponse> deleteAlertRules(DeleteAlertRulesRequest request);

    /**
     * @param request the request parameters of DeleteAlertTemplate  DeleteAlertTemplateRequest
     * @return DeleteAlertTemplateResponse
     */
    CompletableFuture<DeleteAlertTemplateResponse> deleteAlertTemplate(DeleteAlertTemplateRequest request);

    /**
     * @param request the request parameters of DeleteDispatchRule  DeleteDispatchRuleRequest
     * @return DeleteDispatchRuleResponse
     */
    CompletableFuture<DeleteDispatchRuleResponse> deleteDispatchRule(DeleteDispatchRuleRequest request);

    /**
     * @param request the request parameters of DeleteGrafanaResource  DeleteGrafanaResourceRequest
     * @return DeleteGrafanaResourceResponse
     */
    CompletableFuture<DeleteGrafanaResourceResponse> deleteGrafanaResource(DeleteGrafanaResourceRequest request);

    /**
     * @param request the request parameters of DeletePrometheusAlertRule  DeletePrometheusAlertRuleRequest
     * @return DeletePrometheusAlertRuleResponse
     */
    CompletableFuture<DeletePrometheusAlertRuleResponse> deletePrometheusAlertRule(DeletePrometheusAlertRuleRequest request);

    /**
     * @param request the request parameters of DeleteRetcodeApp  DeleteRetcodeAppRequest
     * @return DeleteRetcodeAppResponse
     */
    CompletableFuture<DeleteRetcodeAppResponse> deleteRetcodeApp(DeleteRetcodeAppRequest request);

    /**
     * @param request the request parameters of DeleteScenario  DeleteScenarioRequest
     * @return DeleteScenarioResponse
     */
    CompletableFuture<DeleteScenarioResponse> deleteScenario(DeleteScenarioRequest request);

    /**
     * @param request the request parameters of DeleteTraceApp  DeleteTraceAppRequest
     * @return DeleteTraceAppResponse
     */
    CompletableFuture<DeleteTraceAppResponse> deleteTraceApp(DeleteTraceAppRequest request);

    /**
     * @param request the request parameters of DescribeDispatchRule  DescribeDispatchRuleRequest
     * @return DescribeDispatchRuleResponse
     */
    CompletableFuture<DescribeDispatchRuleResponse> describeDispatchRule(DescribeDispatchRuleRequest request);

    /**
     * @param request the request parameters of DescribePrometheusAlertRule  DescribePrometheusAlertRuleRequest
     * @return DescribePrometheusAlertRuleResponse
     */
    CompletableFuture<DescribePrometheusAlertRuleResponse> describePrometheusAlertRule(DescribePrometheusAlertRuleRequest request);

    /**
     * @param request the request parameters of DescribeTraceLicenseKey  DescribeTraceLicenseKeyRequest
     * @return DescribeTraceLicenseKeyResponse
     */
    CompletableFuture<DescribeTraceLicenseKeyResponse> describeTraceLicenseKey(DescribeTraceLicenseKeyRequest request);

    /**
     * @param request the request parameters of DescribeTraceLocation  DescribeTraceLocationRequest
     * @return DescribeTraceLocationResponse
     */
    CompletableFuture<DescribeTraceLocationResponse> describeTraceLocation(DescribeTraceLocationRequest request);

    /**
     * @param request the request parameters of DisableAlertTemplate  DisableAlertTemplateRequest
     * @return DisableAlertTemplateResponse
     */
    CompletableFuture<DisableAlertTemplateResponse> disableAlertTemplate(DisableAlertTemplateRequest request);

    /**
     * @param request the request parameters of EnableAlertTemplate  EnableAlertTemplateRequest
     * @return EnableAlertTemplateResponse
     */
    CompletableFuture<EnableAlertTemplateResponse> enableAlertTemplate(EnableAlertTemplateRequest request);

    /**
     * @param request the request parameters of ExportPrometheusRules  ExportPrometheusRulesRequest
     * @return ExportPrometheusRulesResponse
     */
    CompletableFuture<ExportPrometheusRulesResponse> exportPrometheusRules(ExportPrometheusRulesRequest request);

    /**
     * @param request the request parameters of GetAgentDownloadUrl  GetAgentDownloadUrlRequest
     * @return GetAgentDownloadUrlResponse
     */
    CompletableFuture<GetAgentDownloadUrlResponse> getAgentDownloadUrl(GetAgentDownloadUrlRequest request);

    /**
     * @param request the request parameters of GetAppApiByPage  GetAppApiByPageRequest
     * @return GetAppApiByPageResponse
     */
    CompletableFuture<GetAppApiByPageResponse> getAppApiByPage(GetAppApiByPageRequest request);

    /**
     * @param request the request parameters of GetConsistencySnapshot  GetConsistencySnapshotRequest
     * @return GetConsistencySnapshotResponse
     */
    CompletableFuture<GetConsistencySnapshotResponse> getConsistencySnapshot(GetConsistencySnapshotRequest request);

    /**
     * @param request the request parameters of GetIntegrationToken  GetIntegrationTokenRequest
     * @return GetIntegrationTokenResponse
     */
    CompletableFuture<GetIntegrationTokenResponse> getIntegrationToken(GetIntegrationTokenRequest request);

    /**
     * @param request the request parameters of GetMultipleTrace  GetMultipleTraceRequest
     * @return GetMultipleTraceResponse
     */
    CompletableFuture<GetMultipleTraceResponse> getMultipleTrace(GetMultipleTraceRequest request);

    /**
     * @param request the request parameters of GetPrometheusApiToken  GetPrometheusApiTokenRequest
     * @return GetPrometheusApiTokenResponse
     */
    CompletableFuture<GetPrometheusApiTokenResponse> getPrometheusApiToken(GetPrometheusApiTokenRequest request);

    /**
     * @param request the request parameters of GetRetcodeShareUrl  GetRetcodeShareUrlRequest
     * @return GetRetcodeShareUrlResponse
     */
    CompletableFuture<GetRetcodeShareUrlResponse> getRetcodeShareUrl(GetRetcodeShareUrlRequest request);

    /**
     * @param request the request parameters of GetStack  GetStackRequest
     * @return GetStackResponse
     */
    CompletableFuture<GetStackResponse> getStack(GetStackRequest request);

    /**
     * @param request the request parameters of GetTrace  GetTraceRequest
     * @return GetTraceResponse
     */
    CompletableFuture<GetTraceResponse> getTrace(GetTraceRequest request);

    /**
     * @param request the request parameters of GetTraceApp  GetTraceAppRequest
     * @return GetTraceAppResponse
     */
    CompletableFuture<GetTraceAppResponse> getTraceApp(GetTraceAppRequest request);

    /**
     * @param request the request parameters of ImportAppAlertRules  ImportAppAlertRulesRequest
     * @return ImportAppAlertRulesResponse
     */
    CompletableFuture<ImportAppAlertRulesResponse> importAppAlertRules(ImportAppAlertRulesRequest request);

    /**
     * @param request the request parameters of ImportCustomAlertRules  ImportCustomAlertRulesRequest
     * @return ImportCustomAlertRulesResponse
     */
    CompletableFuture<ImportCustomAlertRulesResponse> importCustomAlertRules(ImportCustomAlertRulesRequest request);

    /**
     * @param request the request parameters of ImportPrometheusRules  ImportPrometheusRulesRequest
     * @return ImportPrometheusRulesResponse
     */
    CompletableFuture<ImportPrometheusRulesResponse> importPrometheusRules(ImportPrometheusRulesRequest request);

    /**
     * @param request the request parameters of ListActivatedAlerts  ListActivatedAlertsRequest
     * @return ListActivatedAlertsResponse
     */
    CompletableFuture<ListActivatedAlertsResponse> listActivatedAlerts(ListActivatedAlertsRequest request);

    /**
     * @param request the request parameters of ListAlertTemplates  ListAlertTemplatesRequest
     * @return ListAlertTemplatesResponse
     */
    CompletableFuture<ListAlertTemplatesResponse> listAlertTemplates(ListAlertTemplatesRequest request);

    /**
     * @param request the request parameters of ListClusterFromGrafana  ListClusterFromGrafanaRequest
     * @return ListClusterFromGrafanaResponse
     */
    CompletableFuture<ListClusterFromGrafanaResponse> listClusterFromGrafana(ListClusterFromGrafanaRequest request);

    /**
     * @param request the request parameters of ListDashboards  ListDashboardsRequest
     * @return ListDashboardsResponse
     */
    CompletableFuture<ListDashboardsResponse> listDashboards(ListDashboardsRequest request);

    /**
     * @param request the request parameters of ListDispatchRule  ListDispatchRuleRequest
     * @return ListDispatchRuleResponse
     */
    CompletableFuture<ListDispatchRuleResponse> listDispatchRule(ListDispatchRuleRequest request);

    /**
     * @param request the request parameters of ListPromClusters  ListPromClustersRequest
     * @return ListPromClustersResponse
     */
    CompletableFuture<ListPromClustersResponse> listPromClusters(ListPromClustersRequest request);

    /**
     * @param request the request parameters of ListPrometheusAlertRules  ListPrometheusAlertRulesRequest
     * @return ListPrometheusAlertRulesResponse
     */
    CompletableFuture<ListPrometheusAlertRulesResponse> listPrometheusAlertRules(ListPrometheusAlertRulesRequest request);

    /**
     * @param request the request parameters of ListPrometheusAlertTemplates  ListPrometheusAlertTemplatesRequest
     * @return ListPrometheusAlertTemplatesResponse
     */
    CompletableFuture<ListPrometheusAlertTemplatesResponse> listPrometheusAlertTemplates(ListPrometheusAlertTemplatesRequest request);

    /**
     * @param request the request parameters of ListRetcodeApps  ListRetcodeAppsRequest
     * @return ListRetcodeAppsResponse
     */
    CompletableFuture<ListRetcodeAppsResponse> listRetcodeApps(ListRetcodeAppsRequest request);

    /**
     * @param request the request parameters of ListScenario  ListScenarioRequest
     * @return ListScenarioResponse
     */
    CompletableFuture<ListScenarioResponse> listScenario(ListScenarioRequest request);

    /**
     * @param request the request parameters of ListServerlessTopNApps  ListServerlessTopNAppsRequest
     * @return ListServerlessTopNAppsResponse
     */
    CompletableFuture<ListServerlessTopNAppsResponse> listServerlessTopNApps(ListServerlessTopNAppsRequest request);

    /**
     * @param request the request parameters of ListTraceApps  ListTraceAppsRequest
     * @return ListTraceAppsResponse
     */
    CompletableFuture<ListTraceAppsResponse> listTraceApps(ListTraceAppsRequest request);

    /**
     * @param request the request parameters of OpenArmsDefaultSLR  OpenArmsDefaultSLRRequest
     * @return OpenArmsDefaultSLRResponse
     */
    CompletableFuture<OpenArmsDefaultSLRResponse> openArmsDefaultSLR(OpenArmsDefaultSLRRequest request);

    /**
     * @param request the request parameters of OpenArmsService  OpenArmsServiceRequest
     * @return OpenArmsServiceResponse
     */
    CompletableFuture<OpenArmsServiceResponse> openArmsService(OpenArmsServiceRequest request);

    /**
     * @param request the request parameters of OpenVCluster  OpenVClusterRequest
     * @return OpenVClusterResponse
     */
    CompletableFuture<OpenVClusterResponse> openVCluster(OpenVClusterRequest request);

    /**
     * @param request the request parameters of OpenXtraceDefaultSLR  OpenXtraceDefaultSLRRequest
     * @return OpenXtraceDefaultSLRResponse
     */
    CompletableFuture<OpenXtraceDefaultSLRResponse> openXtraceDefaultSLR(OpenXtraceDefaultSLRRequest request);

    /**
     * @param request the request parameters of QueryDataset  QueryDatasetRequest
     * @return QueryDatasetResponse
     */
    CompletableFuture<QueryDatasetResponse> queryDataset(QueryDatasetRequest request);

    /**
     * @param request the request parameters of QueryMetric  QueryMetricRequest
     * @return QueryMetricResponse
     */
    CompletableFuture<QueryMetricResponse> queryMetric(QueryMetricRequest request);

    /**
     * @param request the request parameters of QueryMetricByPage  QueryMetricByPageRequest
     * @return QueryMetricByPageResponse
     */
    CompletableFuture<QueryMetricByPageResponse> queryMetricByPage(QueryMetricByPageRequest request);

    /**
     * @param request the request parameters of SaveTraceAppConfig  SaveTraceAppConfigRequest
     * @return SaveTraceAppConfigResponse
     */
    CompletableFuture<SaveTraceAppConfigResponse> saveTraceAppConfig(SaveTraceAppConfigRequest request);

    /**
     * @param request the request parameters of SearchAlertContact  SearchAlertContactRequest
     * @return SearchAlertContactResponse
     */
    CompletableFuture<SearchAlertContactResponse> searchAlertContact(SearchAlertContactRequest request);

    /**
     * @param request the request parameters of SearchAlertContactGroup  SearchAlertContactGroupRequest
     * @return SearchAlertContactGroupResponse
     */
    CompletableFuture<SearchAlertContactGroupResponse> searchAlertContactGroup(SearchAlertContactGroupRequest request);

    /**
     * @param request the request parameters of SearchAlertHistories  SearchAlertHistoriesRequest
     * @return SearchAlertHistoriesResponse
     */
    CompletableFuture<SearchAlertHistoriesResponse> searchAlertHistories(SearchAlertHistoriesRequest request);

    /**
     * @param request the request parameters of SearchAlertRules  SearchAlertRulesRequest
     * @return SearchAlertRulesResponse
     */
    CompletableFuture<SearchAlertRulesResponse> searchAlertRules(SearchAlertRulesRequest request);

    /**
     * @param request the request parameters of SearchEvents  SearchEventsRequest
     * @return SearchEventsResponse
     */
    CompletableFuture<SearchEventsResponse> searchEvents(SearchEventsRequest request);

    /**
     * @param request the request parameters of SearchRetcodeAppByPage  SearchRetcodeAppByPageRequest
     * @return SearchRetcodeAppByPageResponse
     */
    CompletableFuture<SearchRetcodeAppByPageResponse> searchRetcodeAppByPage(SearchRetcodeAppByPageRequest request);

    /**
     * @param request the request parameters of SearchTraceAppByName  SearchTraceAppByNameRequest
     * @return SearchTraceAppByNameResponse
     */
    CompletableFuture<SearchTraceAppByNameResponse> searchTraceAppByName(SearchTraceAppByNameRequest request);

    /**
     * @param request the request parameters of SearchTraceAppByPage  SearchTraceAppByPageRequest
     * @return SearchTraceAppByPageResponse
     */
    CompletableFuture<SearchTraceAppByPageResponse> searchTraceAppByPage(SearchTraceAppByPageRequest request);

    /**
     * @param request the request parameters of SearchTraces  SearchTracesRequest
     * @return SearchTracesResponse
     */
    CompletableFuture<SearchTracesResponse> searchTraces(SearchTracesRequest request);

    /**
     * @param request the request parameters of SearchTracesByPage  SearchTracesByPageRequest
     * @return SearchTracesByPageResponse
     */
    CompletableFuture<SearchTracesByPageResponse> searchTracesByPage(SearchTracesByPageRequest request);

    /**
     * @param request the request parameters of SendCustomIncidents  SendCustomIncidentsRequest
     * @return SendCustomIncidentsResponse
     */
    CompletableFuture<SendCustomIncidentsResponse> sendCustomIncidents(SendCustomIncidentsRequest request);

    /**
     * @param request the request parameters of SendMseIncident  SendMseIncidentRequest
     * @return SendMseIncidentResponse
     */
    CompletableFuture<SendMseIncidentResponse> sendMseIncident(SendMseIncidentRequest request);

    /**
     * @param request the request parameters of SetRetcodeShareStatus  SetRetcodeShareStatusRequest
     * @return SetRetcodeShareStatusResponse
     */
    CompletableFuture<SetRetcodeShareStatusResponse> setRetcodeShareStatus(SetRetcodeShareStatusRequest request);

    /**
     * @param request the request parameters of StartAlert  StartAlertRequest
     * @return StartAlertResponse
     */
    CompletableFuture<StartAlertResponse> startAlert(StartAlertRequest request);

    /**
     * @param request the request parameters of StopAlert  StopAlertRequest
     * @return StopAlertResponse
     */
    CompletableFuture<StopAlertResponse> stopAlert(StopAlertRequest request);

    /**
     * @param request the request parameters of UpdateAlertContact  UpdateAlertContactRequest
     * @return UpdateAlertContactResponse
     */
    CompletableFuture<UpdateAlertContactResponse> updateAlertContact(UpdateAlertContactRequest request);

    /**
     * @param request the request parameters of UpdateAlertContactGroup  UpdateAlertContactGroupRequest
     * @return UpdateAlertContactGroupResponse
     */
    CompletableFuture<UpdateAlertContactGroupResponse> updateAlertContactGroup(UpdateAlertContactGroupRequest request);

    /**
     * @param request the request parameters of UpdateAlertRule  UpdateAlertRuleRequest
     * @return UpdateAlertRuleResponse
     */
    CompletableFuture<UpdateAlertRuleResponse> updateAlertRule(UpdateAlertRuleRequest request);

    /**
     * @param request the request parameters of UpdateAlertTemplate  UpdateAlertTemplateRequest
     * @return UpdateAlertTemplateResponse
     */
    CompletableFuture<UpdateAlertTemplateResponse> updateAlertTemplate(UpdateAlertTemplateRequest request);

    /**
     * @param request the request parameters of UpdateDispatchRule  UpdateDispatchRuleRequest
     * @return UpdateDispatchRuleResponse
     */
    CompletableFuture<UpdateDispatchRuleResponse> updateDispatchRule(UpdateDispatchRuleRequest request);

    /**
     * @param request the request parameters of UpdatePrometheusAlertRule  UpdatePrometheusAlertRuleRequest
     * @return UpdatePrometheusAlertRuleResponse
     */
    CompletableFuture<UpdatePrometheusAlertRuleResponse> updatePrometheusAlertRule(UpdatePrometheusAlertRuleRequest request);

    /**
     * @param request the request parameters of UpdateWebhook  UpdateWebhookRequest
     * @return UpdateWebhookResponse
     */
    CompletableFuture<UpdateWebhookResponse> updateWebhook(UpdateWebhookRequest request);

}
