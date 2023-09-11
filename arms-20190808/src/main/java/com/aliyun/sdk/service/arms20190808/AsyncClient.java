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

    CompletableFuture<AddPrometheusIntegrationResponse> addPrometheusIntegration(AddPrometheusIntegrationRequest request);

    CompletableFuture<AddPrometheusRemoteWriteResponse> addPrometheusRemoteWrite(AddPrometheusRemoteWriteRequest request);

    CompletableFuture<AddRecordingRuleResponse> addRecordingRule(AddRecordingRuleRequest request);

    CompletableFuture<AppendInstancesToPrometheusGlobalViewResponse> appendInstancesToPrometheusGlobalView(AppendInstancesToPrometheusGlobalViewRequest request);

    CompletableFuture<ApplyScenarioResponse> applyScenario(ApplyScenarioRequest request);

    CompletableFuture<BindPrometheusGrafanaInstanceResponse> bindPrometheusGrafanaInstance(BindPrometheusGrafanaInstanceRequest request);

    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    CompletableFuture<CheckServiceStatusResponse> checkServiceStatus(CheckServiceStatusRequest request);

    /**
      * ****
      *
     */
    CompletableFuture<ConfigAppResponse> configApp(ConfigAppRequest request);

    /**
      * This operation is no longer maintained. To create or modify an alert contact, call the CreateOrUpdateContact operation provided by the new version of the Alert Management module.
      *
     */
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

    CompletableFuture<CreatePrometheusInstanceResponse> createPrometheusInstance(CreatePrometheusInstanceRequest request);

    CompletableFuture<CreatePrometheusMonitoringResponse> createPrometheusMonitoring(CreatePrometheusMonitoringRequest request);

    CompletableFuture<CreateRetcodeAppResponse> createRetcodeApp(CreateRetcodeAppRequest request);

    CompletableFuture<CreateSyntheticTaskResponse> createSyntheticTask(CreateSyntheticTaskRequest request);

    CompletableFuture<CreateTimingSyntheticTaskResponse> createTimingSyntheticTask(CreateTimingSyntheticTaskRequest request);

    CompletableFuture<CreateWebhookResponse> createWebhook(CreateWebhookRequest request);

    CompletableFuture<DelAuthTokenResponse> delAuthToken(DelAuthTokenRequest request);

    /**
      * ********
      *
     */
    CompletableFuture<DeleteAlertContactResponse> deleteAlertContact(DeleteAlertContactRequest request);

    CompletableFuture<DeleteAlertContactGroupResponse> deleteAlertContactGroup(DeleteAlertContactGroupRequest request);

    CompletableFuture<DeleteAlertRuleResponse> deleteAlertRule(DeleteAlertRuleRequest request);

    CompletableFuture<DeleteAlertRulesResponse> deleteAlertRules(DeleteAlertRulesRequest request);

    CompletableFuture<DeleteAppListResponse> deleteAppList(DeleteAppListRequest request);

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

    CompletableFuture<DeletePrometheusIntegrationResponse> deletePrometheusIntegration(DeletePrometheusIntegrationRequest request);

    CompletableFuture<DeletePrometheusMonitoringResponse> deletePrometheusMonitoring(DeletePrometheusMonitoringRequest request);

    CompletableFuture<DeletePrometheusRemoteWriteResponse> deletePrometheusRemoteWrite(DeletePrometheusRemoteWriteRequest request);

    CompletableFuture<DeleteRetcodeAppResponse> deleteRetcodeApp(DeleteRetcodeAppRequest request);

    CompletableFuture<DeleteScenarioResponse> deleteScenario(DeleteScenarioRequest request);

    CompletableFuture<DeleteSilencePolicyResponse> deleteSilencePolicy(DeleteSilencePolicyRequest request);

    CompletableFuture<DeleteSourceMapResponse> deleteSourceMap(DeleteSourceMapRequest request);

    CompletableFuture<DeleteSyntheticTaskResponse> deleteSyntheticTask(DeleteSyntheticTaskRequest request);

    CompletableFuture<DeleteTimingSyntheticTaskResponse> deleteTimingSyntheticTask(DeleteTimingSyntheticTaskRequest request);

    CompletableFuture<DeleteTraceAppResponse> deleteTraceApp(DeleteTraceAppRequest request);

    CompletableFuture<DeleteWebhookContactResponse> deleteWebhookContact(DeleteWebhookContactRequest request);

    CompletableFuture<DescribeContactGroupsResponse> describeContactGroups(DescribeContactGroupsRequest request);

    CompletableFuture<DescribeContactsResponse> describeContacts(DescribeContactsRequest request);

    CompletableFuture<DescribeDispatchRuleResponse> describeDispatchRule(DescribeDispatchRuleRequest request);

    CompletableFuture<DescribeIMRobotsResponse> describeIMRobots(DescribeIMRobotsRequest request);

    CompletableFuture<DescribePrometheusAlertRuleResponse> describePrometheusAlertRule(DescribePrometheusAlertRuleRequest request);

    CompletableFuture<DescribeTraceLicenseKeyResponse> describeTraceLicenseKey(DescribeTraceLicenseKeyRequest request);

    CompletableFuture<DescribeWebhookContactsResponse> describeWebhookContacts(DescribeWebhookContactsRequest request);

    CompletableFuture<EnableMetricResponse> enableMetric(EnableMetricRequest request);

    CompletableFuture<GetAgentDownloadUrlResponse> getAgentDownloadUrl(GetAgentDownloadUrlRequest request);

    CompletableFuture<GetAlertRulesResponse> getAlertRules(GetAlertRulesRequest request);

    CompletableFuture<GetAppApiByPageResponse> getAppApiByPage(GetAppApiByPageRequest request);

    CompletableFuture<GetAuthTokenResponse> getAuthToken(GetAuthTokenRequest request);

    CompletableFuture<GetCloudClusterAllUrlResponse> getCloudClusterAllUrl(GetCloudClusterAllUrlRequest request);

    CompletableFuture<GetClusterAllUrlResponse> getClusterAllUrl(GetClusterAllUrlRequest request);

    CompletableFuture<GetExploreUrlResponse> getExploreUrl(GetExploreUrlRequest request);

    CompletableFuture<GetIntegrationStateResponse> getIntegrationState(GetIntegrationStateRequest request);

    CompletableFuture<GetManagedPrometheusStatusResponse> getManagedPrometheusStatus(GetManagedPrometheusStatusRequest request);

    CompletableFuture<GetMultipleTraceResponse> getMultipleTrace(GetMultipleTraceRequest request);

    CompletableFuture<GetOnCallSchedulesDetailResponse> getOnCallSchedulesDetail(GetOnCallSchedulesDetailRequest request);

    /**
      * None.
      *
     */
    CompletableFuture<GetPrometheusApiTokenResponse> getPrometheusApiToken(GetPrometheusApiTokenRequest request);

    CompletableFuture<GetPrometheusGlobalViewResponse> getPrometheusGlobalView(GetPrometheusGlobalViewRequest request);

    CompletableFuture<GetPrometheusInstanceResponse> getPrometheusInstance(GetPrometheusInstanceRequest request);

    CompletableFuture<GetPrometheusIntegrationResponse> getPrometheusIntegration(GetPrometheusIntegrationRequest request);

    CompletableFuture<GetPrometheusMonitoringResponse> getPrometheusMonitoring(GetPrometheusMonitoringRequest request);

    CompletableFuture<GetPrometheusRemoteWriteResponse> getPrometheusRemoteWrite(GetPrometheusRemoteWriteRequest request);

    CompletableFuture<GetRecordingRuleResponse> getRecordingRule(GetRecordingRuleRequest request);

    CompletableFuture<GetRetcodeAppByPidResponse> getRetcodeAppByPid(GetRetcodeAppByPidRequest request);

    CompletableFuture<GetRetcodeDataByQueryResponse> getRetcodeDataByQuery(GetRetcodeDataByQueryRequest request);

    CompletableFuture<GetRetcodeLogstoreResponse> getRetcodeLogstore(GetRetcodeLogstoreRequest request);

    CompletableFuture<GetRetcodeShareUrlResponse> getRetcodeShareUrl(GetRetcodeShareUrlRequest request);

    CompletableFuture<GetSourceMapInfoResponse> getSourceMapInfo(GetSourceMapInfoRequest request);

    CompletableFuture<GetStackResponse> getStack(GetStackRequest request);

    CompletableFuture<GetSyntheticMonitorsResponse> getSyntheticMonitors(GetSyntheticMonitorsRequest request);

    CompletableFuture<GetSyntheticTaskDetailResponse> getSyntheticTaskDetail(GetSyntheticTaskDetailRequest request);

    CompletableFuture<GetSyntheticTaskListResponse> getSyntheticTaskList(GetSyntheticTaskListRequest request);

    CompletableFuture<GetSyntheticTaskMonitorsResponse> getSyntheticTaskMonitors(GetSyntheticTaskMonitorsRequest request);

    CompletableFuture<GetTimingSyntheticTaskResponse> getTimingSyntheticTask(GetTimingSyntheticTaskRequest request);

    /**
      * > You must use Application Real-Time Monitoring Service (ARMS) SDK for Java V2.7.24.
      *
     */
    CompletableFuture<GetTraceResponse> getTrace(GetTraceRequest request);

    CompletableFuture<GetTraceAppResponse> getTraceApp(GetTraceAppRequest request);

    /**
      * >  You can call the **ImportAppAlertRules** operation to import only the alert rules that are generated by Application Real-Time Monitoring Service (ARMS) for application monitoring and browser monitoring. This operation cannot be used to import custom alert rules, alert rules for Prometheus monitoring, or default emergency alert rules.
      *
     */
    CompletableFuture<ImportAppAlertRulesResponse> importAppAlertRules(ImportAppAlertRulesRequest request);

    CompletableFuture<InstallCmsExporterResponse> installCmsExporter(InstallCmsExporterRequest request);

    /**
      * If you call the operation to monitor an ASK cluster or an ECS instance, a Prometheus agent is installed in the ASK cluster or ECS instance. Make sure that the ASK cluster or ECS instance has no Prometheus agent installed in advance.
      *
     */
    CompletableFuture<InstallManagedPrometheusResponse> installManagedPrometheus(InstallManagedPrometheusRequest request);

    CompletableFuture<ListActivatedAlertsResponse> listActivatedAlerts(ListActivatedAlertsRequest request);

    CompletableFuture<ListAlertEventsResponse> listAlertEvents(ListAlertEventsRequest request);

    CompletableFuture<ListAlertsResponse> listAlerts(ListAlertsRequest request);

    CompletableFuture<ListClusterFromGrafanaResponse> listClusterFromGrafana(ListClusterFromGrafanaRequest request);

    CompletableFuture<ListCmsInstancesResponse> listCmsInstances(ListCmsInstancesRequest request);

    /**
      * None.
      *
     */
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

    CompletableFuture<ListPrometheusInstanceByTagAndResourceGroupIdResponse> listPrometheusInstanceByTagAndResourceGroupId(ListPrometheusInstanceByTagAndResourceGroupIdRequest request);

    CompletableFuture<ListPrometheusInstancesResponse> listPrometheusInstances(ListPrometheusInstancesRequest request);

    CompletableFuture<ListPrometheusIntegrationResponse> listPrometheusIntegration(ListPrometheusIntegrationRequest request);

    CompletableFuture<ListPrometheusMonitoringResponse> listPrometheusMonitoring(ListPrometheusMonitoringRequest request);

    CompletableFuture<ListPrometheusRemoteWritesResponse> listPrometheusRemoteWrites(ListPrometheusRemoteWritesRequest request);

    /**
      * ****
      *
     */
    CompletableFuture<ListRetcodeAppsResponse> listRetcodeApps(ListRetcodeAppsRequest request);

    CompletableFuture<ListScenarioResponse> listScenario(ListScenarioRequest request);

    CompletableFuture<ListSilencePoliciesResponse> listSilencePolicies(ListSilencePoliciesRequest request);

    CompletableFuture<ListTimingSyntheticTasksResponse> listTimingSyntheticTasks(ListTimingSyntheticTasksRequest request);

    CompletableFuture<ListTraceAppsResponse> listTraceApps(ListTraceAppsRequest request);

    CompletableFuture<ManageGetRecordingRuleResponse> manageGetRecordingRule(ManageGetRecordingRuleRequest request);

    CompletableFuture<ManageRecordingRuleResponse> manageRecordingRule(ManageRecordingRuleRequest request);

    CompletableFuture<OpenArmsDefaultSLRResponse> openArmsDefaultSLR(OpenArmsDefaultSLRRequest request);

    /**
      * The **OpenArmsServiceSecondVersion** operation supports the following sub-service editions:
      * *   Application Monitoring: Basic Edition
      * *   Browser Monitoring: Basic Edition
      * *   Synthetic Monitoring: Pro Edition (pay-as-you-go)
      * *   Prometheus Service: Pro Edition
      *
     */
    CompletableFuture<OpenArmsServiceSecondVersionResponse> openArmsServiceSecondVersion(OpenArmsServiceSecondVersionRequest request);

    CompletableFuture<OpenVClusterResponse> openVCluster(OpenVClusterRequest request);

    CompletableFuture<OpenXtraceDefaultSLRResponse> openXtraceDefaultSLR(OpenXtraceDefaultSLRRequest request);

    CompletableFuture<QueryAppMetadataResponse> queryAppMetadata(QueryAppMetadataRequest request);

    CompletableFuture<QueryMetricByPageResponse> queryMetricByPage(QueryMetricByPageRequest request);

    CompletableFuture<QueryPromInstallStatusResponse> queryPromInstallStatus(QueryPromInstallStatusRequest request);

    CompletableFuture<QueryReleaseMetricResponse> queryReleaseMetric(QueryReleaseMetricRequest request);

    CompletableFuture<RemoveAliClusterIdsFromPrometheusGlobalViewResponse> removeAliClusterIdsFromPrometheusGlobalView(RemoveAliClusterIdsFromPrometheusGlobalViewRequest request);

    CompletableFuture<RemoveSourcesFromPrometheusGlobalViewResponse> removeSourcesFromPrometheusGlobalView(RemoveSourcesFromPrometheusGlobalViewRequest request);

    CompletableFuture<SaveTraceAppConfigResponse> saveTraceAppConfig(SaveTraceAppConfigRequest request);

    /**
      * This operation is no longer maintained. To query alert contacts, call the DescribeContacts operation provided by the new version of Alert Management.
      *
     */
    CompletableFuture<SearchAlertContactResponse> searchAlertContact(SearchAlertContactRequest request);

    /**
      * The operation is no longer maintained. Call the DescribeContactGroups operation in the alert management module to query alert contact groups.
      *
     */
    CompletableFuture<SearchAlertContactGroupResponse> searchAlertContactGroup(SearchAlertContactGroupRequest request);

    /**
      * This operation is no longer maintained. To query alert records, call the ListAlerts operation provided by the new version of Alert Management.
      *
     */
    CompletableFuture<SearchAlertHistoriesResponse> searchAlertHistories(SearchAlertHistoriesRequest request);

    /**
      * The current operation is no longer maintained. You can call the GetAlertRules operation of Alert Management (New) to query existing alert rules.
      *
     */
    CompletableFuture<SearchAlertRulesResponse> searchAlertRules(SearchAlertRulesRequest request);

    /**
      * Alert event records are different from alert notification records. Alert events are recorded every minute after an alert rule filters data. Alert events can be classified based on whether they are triggered or not. If a triggered event is not in the silence period, an alert notification is sent.
      *
     */
    CompletableFuture<SearchEventsResponse> searchEvents(SearchEventsRequest request);

    CompletableFuture<SearchRetcodeAppByPageResponse> searchRetcodeAppByPage(SearchRetcodeAppByPageRequest request);

    CompletableFuture<SearchTraceAppByNameResponse> searchTraceAppByName(SearchTraceAppByNameRequest request);

    CompletableFuture<SearchTraceAppByPageResponse> searchTraceAppByPage(SearchTraceAppByPageRequest request);

    /**
      * > A maximum of 100 data entries can be returned each time this operation is called. If you want to query all existing traces, we recommend that you call the SearchTracesByPage operation. For more information, see [SearchTracesByPage](~~175866~~).
      *
     */
    CompletableFuture<SearchTracesResponse> searchTraces(SearchTracesRequest request);

    CompletableFuture<SearchTracesByPageResponse> searchTracesByPage(SearchTracesByPageRequest request);

    /**
      * After you receive the text message, verify the mobile number as prompted. Before you can specify a mobile phone number in a notification policy, you must verify the mobile phone number.
      *
     */
    CompletableFuture<SendTTSVerifyLinkResponse> sendTTSVerifyLink(SendTTSVerifyLinkRequest request);

    CompletableFuture<SetRetcodeShareStatusResponse> setRetcodeShareStatus(SetRetcodeShareStatusRequest request);

    CompletableFuture<StartAlertResponse> startAlert(StartAlertRequest request);

    CompletableFuture<StartTimingSyntheticTaskResponse> startTimingSyntheticTask(StartTimingSyntheticTaskRequest request);

    CompletableFuture<StopAlertResponse> stopAlert(StopAlertRequest request);

    CompletableFuture<StopTimingSyntheticTaskResponse> stopTimingSyntheticTask(StopTimingSyntheticTaskRequest request);

    CompletableFuture<SwitchSyntheticTaskStatusResponse> switchSyntheticTaskStatus(SwitchSyntheticTaskStatusRequest request);

    CompletableFuture<SyncRecordingRulesResponse> syncRecordingRules(SyncRecordingRulesRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
      * Make sure that the ASK cluster or ECS instance is monitored in Managed Service for Prometheus.
      *
     */
    CompletableFuture<UninstallManagedPrometheusResponse> uninstallManagedPrometheus(UninstallManagedPrometheusRequest request);

    CompletableFuture<UninstallPromClusterResponse> uninstallPromCluster(UninstallPromClusterRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
      * This operation is no longer maintained. To create or modify an alert contact, call the CreateOrUpdateContact operation provided by the new version of Alert Management.
      *
     */
    CompletableFuture<UpdateAlertContactResponse> updateAlertContact(UpdateAlertContactRequest request);

    CompletableFuture<UpdateAlertContactGroupResponse> updateAlertContactGroup(UpdateAlertContactGroupRequest request);

    CompletableFuture<UpdateAlertRuleResponse> updateAlertRule(UpdateAlertRuleRequest request);

    CompletableFuture<UpdateDispatchRuleResponse> updateDispatchRule(UpdateDispatchRuleRequest request);

    CompletableFuture<UpdateIntegrationResponse> updateIntegration(UpdateIntegrationRequest request);

    CompletableFuture<UpdatePrometheusAlertRuleResponse> updatePrometheusAlertRule(UpdatePrometheusAlertRuleRequest request);

    CompletableFuture<UpdatePrometheusGlobalViewResponse> updatePrometheusGlobalView(UpdatePrometheusGlobalViewRequest request);

    CompletableFuture<UpdatePrometheusIntegrationResponse> updatePrometheusIntegration(UpdatePrometheusIntegrationRequest request);

    CompletableFuture<UpdatePrometheusMonitoringResponse> updatePrometheusMonitoring(UpdatePrometheusMonitoringRequest request);

    CompletableFuture<UpdatePrometheusMonitoringStatusResponse> updatePrometheusMonitoringStatus(UpdatePrometheusMonitoringStatusRequest request);

    CompletableFuture<UpdatePrometheusRemoteWriteResponse> updatePrometheusRemoteWrite(UpdatePrometheusRemoteWriteRequest request);

    CompletableFuture<UpdateTimingSyntheticTaskResponse> updateTimingSyntheticTask(UpdateTimingSyntheticTaskRequest request);

    /**
      * This operation is no longer maintained. Call the CreateOrUpdateWebhookContact operation in the new alter management module to create or modify a webhook alert contact.
      *
     */
    CompletableFuture<UpdateWebhookResponse> updateWebhook(UpdateWebhookRequest request);

    CompletableFuture<UploadResponse> upload(UploadRequest request);

}
