// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.arms20190808.models.*;
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

    CompletableFuture<AddAliClusterIdsToPrometheusGlobalViewResponse> addAliClusterIdsToPrometheusGlobalView(AddAliClusterIdsToPrometheusGlobalViewRequest request);

    CompletableFuture<AddGrafanaResponse> addGrafana(AddGrafanaRequest request);

    CompletableFuture<AddIntegrationResponse> addIntegration(AddIntegrationRequest request);

    CompletableFuture<AddPrometheusGlobalViewResponse> addPrometheusGlobalView(AddPrometheusGlobalViewRequest request);

    CompletableFuture<AddPrometheusGlobalViewByAliClusterIdsResponse> addPrometheusGlobalViewByAliClusterIds(AddPrometheusGlobalViewByAliClusterIdsRequest request);

    CompletableFuture<AddPrometheusInstanceResponse> addPrometheusInstance(AddPrometheusInstanceRequest request);

    CompletableFuture<AddRecordingRuleResponse> addRecordingRule(AddRecordingRuleRequest request);

    CompletableFuture<AppendInstancesToPrometheusGlobalViewResponse> appendInstancesToPrometheusGlobalView(AppendInstancesToPrometheusGlobalViewRequest request);

    CompletableFuture<ApplyScenarioResponse> applyScenario(ApplyScenarioRequest request);

    CompletableFuture<CheckServiceStatusResponse> checkServiceStatus(CheckServiceStatusRequest request);

    CompletableFuture<ConfigAppResponse> configApp(ConfigAppRequest request);

    CompletableFuture<CreateAlertContactResponse> createAlertContact(CreateAlertContactRequest request);

    CompletableFuture<CreateAlertContactGroupResponse> createAlertContactGroup(CreateAlertContactGroupRequest request);

    CompletableFuture<CreateDispatchRuleResponse> createDispatchRule(CreateDispatchRuleRequest request);

    CompletableFuture<CreateIntegrationResponse> createIntegration(CreateIntegrationRequest request);

    CompletableFuture<CreateOrUpdateAlertRuleResponse> createOrUpdateAlertRule(CreateOrUpdateAlertRuleRequest request);

    CompletableFuture<CreateOrUpdateContactResponse> createOrUpdateContact(CreateOrUpdateContactRequest request);

    CompletableFuture<CreateOrUpdateContactGroupResponse> createOrUpdateContactGroup(CreateOrUpdateContactGroupRequest request);

    CompletableFuture<CreateOrUpdateEventBridgeIntegrationResponse> createOrUpdateEventBridgeIntegration(CreateOrUpdateEventBridgeIntegrationRequest request);

    CompletableFuture<CreateOrUpdateIMRobotResponse> createOrUpdateIMRobot(CreateOrUpdateIMRobotRequest request);

    CompletableFuture<CreateOrUpdateNotificationPolicyResponse> createOrUpdateNotificationPolicy(CreateOrUpdateNotificationPolicyRequest request);

    CompletableFuture<CreateOrUpdateSilencePolicyResponse> createOrUpdateSilencePolicy(CreateOrUpdateSilencePolicyRequest request);

    CompletableFuture<CreateOrUpdateWebhookContactResponse> createOrUpdateWebhookContact(CreateOrUpdateWebhookContactRequest request);

    CompletableFuture<CreatePrometheusAlertRuleResponse> createPrometheusAlertRule(CreatePrometheusAlertRuleRequest request);

    CompletableFuture<CreateRetcodeAppResponse> createRetcodeApp(CreateRetcodeAppRequest request);

    CompletableFuture<CreateSyntheticTaskResponse> createSyntheticTask(CreateSyntheticTaskRequest request);

    CompletableFuture<CreateWebhookResponse> createWebhook(CreateWebhookRequest request);

    CompletableFuture<DelAuthTokenResponse> delAuthToken(DelAuthTokenRequest request);

    CompletableFuture<DeleteAlertContactResponse> deleteAlertContact(DeleteAlertContactRequest request);

    CompletableFuture<DeleteAlertContactGroupResponse> deleteAlertContactGroup(DeleteAlertContactGroupRequest request);

    CompletableFuture<DeleteAlertRuleResponse> deleteAlertRule(DeleteAlertRuleRequest request);

    CompletableFuture<DeleteAlertRulesResponse> deleteAlertRules(DeleteAlertRulesRequest request);

    CompletableFuture<DeleteCmsExporterResponse> deleteCmsExporter(DeleteCmsExporterRequest request);

    CompletableFuture<DeleteContactResponse> deleteContact(DeleteContactRequest request);

    CompletableFuture<DeleteContactGroupResponse> deleteContactGroup(DeleteContactGroupRequest request);

    CompletableFuture<DeleteDispatchRuleResponse> deleteDispatchRule(DeleteDispatchRuleRequest request);

    CompletableFuture<DeleteEventBridgeIntegrationResponse> deleteEventBridgeIntegration(DeleteEventBridgeIntegrationRequest request);

    CompletableFuture<DeleteGrafanaResourceResponse> deleteGrafanaResource(DeleteGrafanaResourceRequest request);

    CompletableFuture<DeleteIMRobotResponse> deleteIMRobot(DeleteIMRobotRequest request);

    CompletableFuture<DeleteIntegrationResponse> deleteIntegration(DeleteIntegrationRequest request);

    CompletableFuture<DeleteIntegrationsResponse> deleteIntegrations(DeleteIntegrationsRequest request);

    CompletableFuture<DeleteNotificationPolicyResponse> deleteNotificationPolicy(DeleteNotificationPolicyRequest request);

    CompletableFuture<DeletePrometheusAlertRuleResponse> deletePrometheusAlertRule(DeletePrometheusAlertRuleRequest request);

    CompletableFuture<DeletePrometheusGlobalViewResponse> deletePrometheusGlobalView(DeletePrometheusGlobalViewRequest request);

    CompletableFuture<DeleteRetcodeAppResponse> deleteRetcodeApp(DeleteRetcodeAppRequest request);

    CompletableFuture<DeleteScenarioResponse> deleteScenario(DeleteScenarioRequest request);

    CompletableFuture<DeleteSilencePolicyResponse> deleteSilencePolicy(DeleteSilencePolicyRequest request);

    CompletableFuture<DeleteSourceMapResponse> deleteSourceMap(DeleteSourceMapRequest request);

    CompletableFuture<DeleteSyntheticTaskResponse> deleteSyntheticTask(DeleteSyntheticTaskRequest request);

    CompletableFuture<DeleteTraceAppResponse> deleteTraceApp(DeleteTraceAppRequest request);

    CompletableFuture<DeleteWebhookContactResponse> deleteWebhookContact(DeleteWebhookContactRequest request);

    CompletableFuture<DescribeContactGroupsResponse> describeContactGroups(DescribeContactGroupsRequest request);

    CompletableFuture<DescribeContactsResponse> describeContacts(DescribeContactsRequest request);

    CompletableFuture<DescribeDispatchRuleResponse> describeDispatchRule(DescribeDispatchRuleRequest request);

    CompletableFuture<DescribeIMRobotsResponse> describeIMRobots(DescribeIMRobotsRequest request);

    CompletableFuture<DescribePrometheusAlertRuleResponse> describePrometheusAlertRule(DescribePrometheusAlertRuleRequest request);

    CompletableFuture<DescribeTraceLicenseKeyResponse> describeTraceLicenseKey(DescribeTraceLicenseKeyRequest request);

    CompletableFuture<DescribeWebhookContactsResponse> describeWebhookContacts(DescribeWebhookContactsRequest request);

    CompletableFuture<GetAgentDownloadUrlResponse> getAgentDownloadUrl(GetAgentDownloadUrlRequest request);

    CompletableFuture<GetAlertRulesResponse> getAlertRules(GetAlertRulesRequest request);

    CompletableFuture<GetAppApiByPageResponse> getAppApiByPage(GetAppApiByPageRequest request);

    CompletableFuture<GetAuthTokenResponse> getAuthToken(GetAuthTokenRequest request);

    CompletableFuture<GetClusterAllUrlResponse> getClusterAllUrl(GetClusterAllUrlRequest request);

    CompletableFuture<GetExploreUrlResponse> getExploreUrl(GetExploreUrlRequest request);

    CompletableFuture<GetIntegrationStateResponse> getIntegrationState(GetIntegrationStateRequest request);

    CompletableFuture<GetManagedPrometheusStatusResponse> getManagedPrometheusStatus(GetManagedPrometheusStatusRequest request);

    CompletableFuture<GetMultipleTraceResponse> getMultipleTrace(GetMultipleTraceRequest request);

    CompletableFuture<GetOnCallSchedulesDetailResponse> getOnCallSchedulesDetail(GetOnCallSchedulesDetailRequest request);

    CompletableFuture<GetPrometheusApiTokenResponse> getPrometheusApiToken(GetPrometheusApiTokenRequest request);

    CompletableFuture<GetPrometheusGlobalViewResponse> getPrometheusGlobalView(GetPrometheusGlobalViewRequest request);

    CompletableFuture<GetRecordingRuleResponse> getRecordingRule(GetRecordingRuleRequest request);

    CompletableFuture<GetRetcodeDataByQueryResponse> getRetcodeDataByQuery(GetRetcodeDataByQueryRequest request);

    CompletableFuture<GetRetcodeLogstoreResponse> getRetcodeLogstore(GetRetcodeLogstoreRequest request);

    CompletableFuture<GetRetcodeShareUrlResponse> getRetcodeShareUrl(GetRetcodeShareUrlRequest request);

    CompletableFuture<GetSourceMapInfoResponse> getSourceMapInfo(GetSourceMapInfoRequest request);

    CompletableFuture<GetStackResponse> getStack(GetStackRequest request);

    CompletableFuture<GetSyntheticTaskDetailResponse> getSyntheticTaskDetail(GetSyntheticTaskDetailRequest request);

    CompletableFuture<GetSyntheticTaskListResponse> getSyntheticTaskList(GetSyntheticTaskListRequest request);

    CompletableFuture<GetSyntheticTaskMonitorsResponse> getSyntheticTaskMonitors(GetSyntheticTaskMonitorsRequest request);

    CompletableFuture<GetTraceResponse> getTrace(GetTraceRequest request);

    CompletableFuture<GetTraceAppResponse> getTraceApp(GetTraceAppRequest request);

    CompletableFuture<ImportAppAlertRulesResponse> importAppAlertRules(ImportAppAlertRulesRequest request);

    CompletableFuture<InstallCmsExporterResponse> installCmsExporter(InstallCmsExporterRequest request);

    CompletableFuture<InstallManagedPrometheusResponse> installManagedPrometheus(InstallManagedPrometheusRequest request);

    CompletableFuture<ListActivatedAlertsResponse> listActivatedAlerts(ListActivatedAlertsRequest request);

    CompletableFuture<ListAlertEventsResponse> listAlertEvents(ListAlertEventsRequest request);

    CompletableFuture<ListAlertsResponse> listAlerts(ListAlertsRequest request);

    CompletableFuture<ListClusterFromGrafanaResponse> listClusterFromGrafana(ListClusterFromGrafanaRequest request);

    CompletableFuture<ListCmsInstancesResponse> listCmsInstances(ListCmsInstancesRequest request);

    CompletableFuture<ListDashboardsResponse> listDashboards(ListDashboardsRequest request);

    CompletableFuture<ListDashboardsByNameResponse> listDashboardsByName(ListDashboardsByNameRequest request);

    CompletableFuture<ListDispatchRuleResponse> listDispatchRule(ListDispatchRuleRequest request);

    CompletableFuture<ListEscalationPoliciesResponse> listEscalationPolicies(ListEscalationPoliciesRequest request);

    CompletableFuture<ListEventBridgeIntegrationsResponse> listEventBridgeIntegrations(ListEventBridgeIntegrationsRequest request);

    CompletableFuture<ListInsightsEventsResponse> listInsightsEvents(ListInsightsEventsRequest request);

    CompletableFuture<ListIntegrationResponse> listIntegration(ListIntegrationRequest request);

    CompletableFuture<ListNotificationPoliciesResponse> listNotificationPolicies(ListNotificationPoliciesRequest request);

    CompletableFuture<ListOnCallSchedulesResponse> listOnCallSchedules(ListOnCallSchedulesRequest request);

    CompletableFuture<ListPrometheusAlertRulesResponse> listPrometheusAlertRules(ListPrometheusAlertRulesRequest request);

    CompletableFuture<ListPrometheusAlertTemplatesResponse> listPrometheusAlertTemplates(ListPrometheusAlertTemplatesRequest request);

    CompletableFuture<ListPrometheusGlobalViewResponse> listPrometheusGlobalView(ListPrometheusGlobalViewRequest request);

    CompletableFuture<ListPrometheusInstancesResponse> listPrometheusInstances(ListPrometheusInstancesRequest request);

    CompletableFuture<ListRetcodeAppsResponse> listRetcodeApps(ListRetcodeAppsRequest request);

    CompletableFuture<ListScenarioResponse> listScenario(ListScenarioRequest request);

    CompletableFuture<ListSilencePoliciesResponse> listSilencePolicies(ListSilencePoliciesRequest request);

    CompletableFuture<ListTraceAppsResponse> listTraceApps(ListTraceAppsRequest request);

    CompletableFuture<ManageGetRecordingRuleResponse> manageGetRecordingRule(ManageGetRecordingRuleRequest request);

    CompletableFuture<ManageRecordingRuleResponse> manageRecordingRule(ManageRecordingRuleRequest request);

    CompletableFuture<OpenArmsDefaultSLRResponse> openArmsDefaultSLR(OpenArmsDefaultSLRRequest request);

    CompletableFuture<OpenArmsServiceSecondVersionResponse> openArmsServiceSecondVersion(OpenArmsServiceSecondVersionRequest request);

    CompletableFuture<OpenVClusterResponse> openVCluster(OpenVClusterRequest request);

    CompletableFuture<OpenXtraceDefaultSLRResponse> openXtraceDefaultSLR(OpenXtraceDefaultSLRRequest request);

    CompletableFuture<QueryMetricByPageResponse> queryMetricByPage(QueryMetricByPageRequest request);

    CompletableFuture<QueryPromInstallStatusResponse> queryPromInstallStatus(QueryPromInstallStatusRequest request);

    CompletableFuture<QueryReleaseMetricResponse> queryReleaseMetric(QueryReleaseMetricRequest request);

    CompletableFuture<RemoveAliClusterIdsFromPrometheusGlobalViewResponse> removeAliClusterIdsFromPrometheusGlobalView(RemoveAliClusterIdsFromPrometheusGlobalViewRequest request);

    CompletableFuture<RemoveSourcesFromPrometheusGlobalViewResponse> removeSourcesFromPrometheusGlobalView(RemoveSourcesFromPrometheusGlobalViewRequest request);

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

    CompletableFuture<SendTTSVerifyLinkResponse> sendTTSVerifyLink(SendTTSVerifyLinkRequest request);

    CompletableFuture<SetRetcodeShareStatusResponse> setRetcodeShareStatus(SetRetcodeShareStatusRequest request);

    CompletableFuture<StartAlertResponse> startAlert(StartAlertRequest request);

    CompletableFuture<StopAlertResponse> stopAlert(StopAlertRequest request);

    CompletableFuture<SwitchSyntheticTaskStatusResponse> switchSyntheticTaskStatus(SwitchSyntheticTaskStatusRequest request);

    CompletableFuture<SyncRecordingRulesResponse> syncRecordingRules(SyncRecordingRulesRequest request);

    CompletableFuture<TurnOnSecondSwitchResponse> turnOnSecondSwitch(TurnOnSecondSwitchRequest request);

    CompletableFuture<UninstallManagedPrometheusResponse> uninstallManagedPrometheus(UninstallManagedPrometheusRequest request);

    CompletableFuture<UninstallPromClusterResponse> uninstallPromCluster(UninstallPromClusterRequest request);

    CompletableFuture<UpdateAlertContactResponse> updateAlertContact(UpdateAlertContactRequest request);

    CompletableFuture<UpdateAlertContactGroupResponse> updateAlertContactGroup(UpdateAlertContactGroupRequest request);

    CompletableFuture<UpdateAlertRuleResponse> updateAlertRule(UpdateAlertRuleRequest request);

    CompletableFuture<UpdateDispatchRuleResponse> updateDispatchRule(UpdateDispatchRuleRequest request);

    CompletableFuture<UpdateIntegrationResponse> updateIntegration(UpdateIntegrationRequest request);

    CompletableFuture<UpdatePrometheusAlertRuleResponse> updatePrometheusAlertRule(UpdatePrometheusAlertRuleRequest request);

    CompletableFuture<UpdateWebhookResponse> updateWebhook(UpdateWebhookRequest request);

    CompletableFuture<UploadResponse> upload(UploadRequest request);

}
