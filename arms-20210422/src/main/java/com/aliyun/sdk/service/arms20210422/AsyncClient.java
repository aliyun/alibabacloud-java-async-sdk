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

    CompletableFuture<AddGrafanaResponse> addGrafana(AddGrafanaRequest request);

    CompletableFuture<AddIntegrationResponse> addIntegration(AddIntegrationRequest request);

    CompletableFuture<ApplyScenarioResponse> applyScenario(ApplyScenarioRequest request);

    CompletableFuture<CheckDataConsistencyResponse> checkDataConsistency(CheckDataConsistencyRequest request);

    CompletableFuture<CheckServiceLinkedRoleForDeletingResponse> checkServiceLinkedRoleForDeleting(CheckServiceLinkedRoleForDeletingRequest request);

    CompletableFuture<CheckServiceStatusResponse> checkServiceStatus(CheckServiceStatusRequest request);

    CompletableFuture<ConfigAppResponse> configApp(ConfigAppRequest request);

    CompletableFuture<CreateAlertContactResponse> createAlertContact(CreateAlertContactRequest request);

    CompletableFuture<CreateAlertContactGroupResponse> createAlertContactGroup(CreateAlertContactGroupRequest request);

    CompletableFuture<CreateAlertTemplateResponse> createAlertTemplate(CreateAlertTemplateRequest request);

    CompletableFuture<CreateDispatchRuleResponse> createDispatchRule(CreateDispatchRuleRequest request);

    CompletableFuture<CreatePrometheusAlertRuleResponse> createPrometheusAlertRule(CreatePrometheusAlertRuleRequest request);

    CompletableFuture<CreateRetcodeAppResponse> createRetcodeApp(CreateRetcodeAppRequest request);

    CompletableFuture<CreateWehookResponse> createWehook(CreateWehookRequest request);

    CompletableFuture<DeleteAlertContactResponse> deleteAlertContact(DeleteAlertContactRequest request);

    CompletableFuture<DeleteAlertContactGroupResponse> deleteAlertContactGroup(DeleteAlertContactGroupRequest request);

    CompletableFuture<DeleteAlertRulesResponse> deleteAlertRules(DeleteAlertRulesRequest request);

    CompletableFuture<DeleteAlertTemplateResponse> deleteAlertTemplate(DeleteAlertTemplateRequest request);

    CompletableFuture<DeleteDispatchRuleResponse> deleteDispatchRule(DeleteDispatchRuleRequest request);

    CompletableFuture<DeleteGrafanaResourceResponse> deleteGrafanaResource(DeleteGrafanaResourceRequest request);

    CompletableFuture<DeletePrometheusAlertRuleResponse> deletePrometheusAlertRule(DeletePrometheusAlertRuleRequest request);

    CompletableFuture<DeleteRetcodeAppResponse> deleteRetcodeApp(DeleteRetcodeAppRequest request);

    CompletableFuture<DeleteScenarioResponse> deleteScenario(DeleteScenarioRequest request);

    CompletableFuture<DeleteTraceAppResponse> deleteTraceApp(DeleteTraceAppRequest request);

    CompletableFuture<DescribeDispatchRuleResponse> describeDispatchRule(DescribeDispatchRuleRequest request);

    CompletableFuture<DescribePrometheusAlertRuleResponse> describePrometheusAlertRule(DescribePrometheusAlertRuleRequest request);

    CompletableFuture<DescribeTraceLicenseKeyResponse> describeTraceLicenseKey(DescribeTraceLicenseKeyRequest request);

    CompletableFuture<DescribeTraceLocationResponse> describeTraceLocation(DescribeTraceLocationRequest request);

    CompletableFuture<DisableAlertTemplateResponse> disableAlertTemplate(DisableAlertTemplateRequest request);

    CompletableFuture<EnableAlertTemplateResponse> enableAlertTemplate(EnableAlertTemplateRequest request);

    CompletableFuture<ExportPrometheusRulesResponse> exportPrometheusRules(ExportPrometheusRulesRequest request);

    CompletableFuture<GetAgentDownloadUrlResponse> getAgentDownloadUrl(GetAgentDownloadUrlRequest request);

    CompletableFuture<GetAppApiByPageResponse> getAppApiByPage(GetAppApiByPageRequest request);

    CompletableFuture<GetConsistencySnapshotResponse> getConsistencySnapshot(GetConsistencySnapshotRequest request);

    CompletableFuture<GetIntegrationTokenResponse> getIntegrationToken(GetIntegrationTokenRequest request);

    CompletableFuture<GetMultipleTraceResponse> getMultipleTrace(GetMultipleTraceRequest request);

    CompletableFuture<GetPrometheusApiTokenResponse> getPrometheusApiToken(GetPrometheusApiTokenRequest request);

    CompletableFuture<GetRetcodeShareUrlResponse> getRetcodeShareUrl(GetRetcodeShareUrlRequest request);

    CompletableFuture<GetStackResponse> getStack(GetStackRequest request);

    CompletableFuture<GetTraceResponse> getTrace(GetTraceRequest request);

    CompletableFuture<GetTraceAppResponse> getTraceApp(GetTraceAppRequest request);

    CompletableFuture<ImportAppAlertRulesResponse> importAppAlertRules(ImportAppAlertRulesRequest request);

    CompletableFuture<ImportCustomAlertRulesResponse> importCustomAlertRules(ImportCustomAlertRulesRequest request);

    CompletableFuture<ImportPrometheusRulesResponse> importPrometheusRules(ImportPrometheusRulesRequest request);

    CompletableFuture<ListActivatedAlertsResponse> listActivatedAlerts(ListActivatedAlertsRequest request);

    CompletableFuture<ListAlertTemplatesResponse> listAlertTemplates(ListAlertTemplatesRequest request);

    CompletableFuture<ListClusterFromGrafanaResponse> listClusterFromGrafana(ListClusterFromGrafanaRequest request);

    CompletableFuture<ListDashboardsResponse> listDashboards(ListDashboardsRequest request);

    CompletableFuture<ListDispatchRuleResponse> listDispatchRule(ListDispatchRuleRequest request);

    CompletableFuture<ListPromClustersResponse> listPromClusters(ListPromClustersRequest request);

    CompletableFuture<ListPrometheusAlertRulesResponse> listPrometheusAlertRules(ListPrometheusAlertRulesRequest request);

    CompletableFuture<ListPrometheusAlertTemplatesResponse> listPrometheusAlertTemplates(ListPrometheusAlertTemplatesRequest request);

    CompletableFuture<ListRetcodeAppsResponse> listRetcodeApps(ListRetcodeAppsRequest request);

    CompletableFuture<ListScenarioResponse> listScenario(ListScenarioRequest request);

    CompletableFuture<ListServerlessTopNAppsResponse> listServerlessTopNApps(ListServerlessTopNAppsRequest request);

    CompletableFuture<ListTraceAppsResponse> listTraceApps(ListTraceAppsRequest request);

    CompletableFuture<OpenArmsDefaultSLRResponse> openArmsDefaultSLR(OpenArmsDefaultSLRRequest request);

    CompletableFuture<OpenArmsServiceResponse> openArmsService(OpenArmsServiceRequest request);

    CompletableFuture<OpenVClusterResponse> openVCluster(OpenVClusterRequest request);

    CompletableFuture<OpenXtraceDefaultSLRResponse> openXtraceDefaultSLR(OpenXtraceDefaultSLRRequest request);

    CompletableFuture<QueryDatasetResponse> queryDataset(QueryDatasetRequest request);

    CompletableFuture<QueryMetricResponse> queryMetric(QueryMetricRequest request);

    CompletableFuture<QueryMetricByPageResponse> queryMetricByPage(QueryMetricByPageRequest request);

    CompletableFuture<SaveTraceAppConfigResponse> saveTraceAppConfig(SaveTraceAppConfigRequest request);

    CompletableFuture<SearchAlertContactResponse> searchAlertContact(SearchAlertContactRequest request);

    CompletableFuture<SearchAlertContactGroupResponse> searchAlertContactGroup(SearchAlertContactGroupRequest request);

    CompletableFuture<SearchAlertHistoriesResponse> searchAlertHistories(SearchAlertHistoriesRequest request);

    CompletableFuture<SearchAlertRulesResponse> searchAlertRules(SearchAlertRulesRequest request);

    CompletableFuture<SearchEventsResponse> searchEvents(SearchEventsRequest request);

    CompletableFuture<SearchRetcodeAppByPageResponse> searchRetcodeAppByPage(SearchRetcodeAppByPageRequest request);

    CompletableFuture<SearchTraceAppByNameResponse> searchTraceAppByName(SearchTraceAppByNameRequest request);

    CompletableFuture<SearchTraceAppByPageResponse> searchTraceAppByPage(SearchTraceAppByPageRequest request);

    CompletableFuture<SearchTracesResponse> searchTraces(SearchTracesRequest request);

    CompletableFuture<SearchTracesByPageResponse> searchTracesByPage(SearchTracesByPageRequest request);

    CompletableFuture<SendCustomIncidentsResponse> sendCustomIncidents(SendCustomIncidentsRequest request);

    CompletableFuture<SendMseIncidentResponse> sendMseIncident(SendMseIncidentRequest request);

    CompletableFuture<SetRetcodeShareStatusResponse> setRetcodeShareStatus(SetRetcodeShareStatusRequest request);

    CompletableFuture<StartAlertResponse> startAlert(StartAlertRequest request);

    CompletableFuture<StopAlertResponse> stopAlert(StopAlertRequest request);

    CompletableFuture<UpdateAlertContactResponse> updateAlertContact(UpdateAlertContactRequest request);

    CompletableFuture<UpdateAlertContactGroupResponse> updateAlertContactGroup(UpdateAlertContactGroupRequest request);

    CompletableFuture<UpdateAlertRuleResponse> updateAlertRule(UpdateAlertRuleRequest request);

    CompletableFuture<UpdateAlertTemplateResponse> updateAlertTemplate(UpdateAlertTemplateRequest request);

    CompletableFuture<UpdateDispatchRuleResponse> updateDispatchRule(UpdateDispatchRuleRequest request);

    CompletableFuture<UpdatePrometheusAlertRuleResponse> updatePrometheusAlertRule(UpdatePrometheusAlertRuleRequest request);

    CompletableFuture<UpdateWebhookResponse> updateWebhook(UpdateWebhookRequest request);

}
