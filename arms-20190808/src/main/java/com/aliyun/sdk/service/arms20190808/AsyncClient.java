// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.arms20190808.models.*;
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

    CompletableFuture<AddAliClusterIdsToPrometheusGlobalViewResponse> addAliClusterIdsToPrometheusGlobalView(AddAliClusterIdsToPrometheusGlobalViewRequest request);

    CompletableFuture<AddGrafanaResponse> addGrafana(AddGrafanaRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<AddIntegrationResponse> addIntegration(AddIntegrationRequest request);

    CompletableFuture<AddPrometheusGlobalViewResponse> addPrometheusGlobalView(AddPrometheusGlobalViewRequest request);

    CompletableFuture<AddPrometheusGlobalViewByAliClusterIdsResponse> addPrometheusGlobalViewByAliClusterIds(AddPrometheusGlobalViewByAliClusterIdsRequest request);

    CompletableFuture<AddPrometheusInstanceResponse> addPrometheusInstance(AddPrometheusInstanceRequest request);

    CompletableFuture<AddPrometheusIntegrationResponse> addPrometheusIntegration(AddPrometheusIntegrationRequest request);

    CompletableFuture<AddRecordingRuleResponse> addRecordingRule(AddRecordingRuleRequest request);

    CompletableFuture<AddTagToFlinkClusterResponse> addTagToFlinkCluster(AddTagToFlinkClusterRequest request);

    CompletableFuture<AppendInstancesToPrometheusGlobalViewResponse> appendInstancesToPrometheusGlobalView(AppendInstancesToPrometheusGlobalViewRequest request);

    CompletableFuture<ApplyScenarioResponse> applyScenario(ApplyScenarioRequest request);

    CompletableFuture<BindPrometheusGrafanaInstanceResponse> bindPrometheusGrafanaInstance(BindPrometheusGrafanaInstanceRequest request);

    CompletableFuture<BlockAlarmNotificationResponse> blockAlarmNotification(BlockAlarmNotificationRequest request);

    CompletableFuture<ChangeAlarmSeverityResponse> changeAlarmSeverity(ChangeAlarmSeverityRequest request);

    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
      * You can call this operation to check whether ARMS is available for commercial use in a region.
      *
     */
    CompletableFuture<CheckCommercialStatusResponse> checkCommercialStatus(CheckCommercialStatusRequest request);

    CompletableFuture<CheckServiceStatusResponse> checkServiceStatus(CheckServiceStatusRequest request);

    CompletableFuture<ClaimAlarmResponse> claimAlarm(ClaimAlarmRequest request);

    CompletableFuture<CloseAlarmResponse> closeAlarm(CloseAlarmRequest request);

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

    /**
      * ************
      *
     */
    CompletableFuture<CreateAlertContactGroupResponse> createAlertContactGroup(CreateAlertContactGroupRequest request);

    CompletableFuture<CreateDispatchRuleResponse> createDispatchRule(CreateDispatchRuleRequest request);

    CompletableFuture<CreateEnvCustomJobResponse> createEnvCustomJob(CreateEnvCustomJobRequest request);

    CompletableFuture<CreateEnvPodMonitorResponse> createEnvPodMonitor(CreateEnvPodMonitorRequest request);

    CompletableFuture<CreateEnvServiceMonitorResponse> createEnvServiceMonitor(CreateEnvServiceMonitorRequest request);

    CompletableFuture<CreateEnvironmentResponse> createEnvironment(CreateEnvironmentRequest request);

    /**
      * Before you call the operation, make sure that you have learned about the billing methods and [pricing](https://www.alibabacloud.com/help/zh/grafana/product-overview/billing-4?spm=a2c4g.11186623.0.0.14c2d253B3SDbt) of Managed Service for Grafana.
      * > 
      * *   To create workspaces, you must complete real-name verification.
      * *   Regular users can create workspaces only in Managed Service for Grafana Developer Edition, Pro Edition, and Advanced Edition. `These editions charge fees.`
      * *   Internal users can create workspaces only in Managed Service for Grafana Beta Edition and Standard Edition. `These editions do not charge fees.`
      *
     */
    CompletableFuture<CreateGrafanaWorkspaceResponse> createGrafanaWorkspace(CreateGrafanaWorkspaceRequest request);

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

    CompletableFuture<CreateRumAppResponse> createRumApp(CreateRumAppRequest request);

    /**
      * This operation returns a file upload URL. You can use the file upload URL to upload files. For more information, see [Use a URL to upload files](https://help.aliyun.com/zh/oss/user-guide/upload-a-file-using-a-file-url).
      *
     */
    CompletableFuture<CreateRumUploadFileUrlResponse> createRumUploadFileUrl(CreateRumUploadFileUrlRequest request);

    CompletableFuture<CreateSyntheticTaskResponse> createSyntheticTask(CreateSyntheticTaskRequest request);

    CompletableFuture<CreateTimingSyntheticTaskResponse> createTimingSyntheticTask(CreateTimingSyntheticTaskRequest request);

    CompletableFuture<CreateWebhookResponse> createWebhook(CreateWebhookRequest request);

    CompletableFuture<DelAuthTokenResponse> delAuthToken(DelAuthTokenRequest request);

    CompletableFuture<DeleteAddonReleaseResponse> deleteAddonRelease(DeleteAddonReleaseRequest request);

    /**
      * ********
      *
     */
    CompletableFuture<DeleteAlertContactResponse> deleteAlertContact(DeleteAlertContactRequest request);

    CompletableFuture<DeleteAlertContactGroupResponse> deleteAlertContactGroup(DeleteAlertContactGroupRequest request);

    CompletableFuture<DeleteAlertRuleResponse> deleteAlertRule(DeleteAlertRuleRequest request);

    /**
      * The current operation is no longer maintained. Call the DeleteAlertRule operation of Alert Management (New) to delete alert rules.
      *
     */
    CompletableFuture<DeleteAlertRulesResponse> deleteAlertRules(DeleteAlertRulesRequest request);

    CompletableFuture<DeleteAppListResponse> deleteAppList(DeleteAppListRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DeleteCmsExporterResponse> deleteCmsExporter(DeleteCmsExporterRequest request);

    CompletableFuture<DeleteContactResponse> deleteContact(DeleteContactRequest request);

    CompletableFuture<DeleteContactGroupResponse> deleteContactGroup(DeleteContactGroupRequest request);

    CompletableFuture<DeleteDispatchRuleResponse> deleteDispatchRule(DeleteDispatchRuleRequest request);

    CompletableFuture<DeleteEnvCustomJobResponse> deleteEnvCustomJob(DeleteEnvCustomJobRequest request);

    CompletableFuture<DeleteEnvPodMonitorResponse> deleteEnvPodMonitor(DeleteEnvPodMonitorRequest request);

    CompletableFuture<DeleteEnvServiceMonitorResponse> deleteEnvServiceMonitor(DeleteEnvServiceMonitorRequest request);

    CompletableFuture<DeleteEnvironmentResponse> deleteEnvironment(DeleteEnvironmentRequest request);

    CompletableFuture<DeleteEnvironmentFeatureResponse> deleteEnvironmentFeature(DeleteEnvironmentFeatureRequest request);

    CompletableFuture<DeleteEventBridgeIntegrationResponse> deleteEventBridgeIntegration(DeleteEventBridgeIntegrationRequest request);

    CompletableFuture<DeleteGrafanaResourceResponse> deleteGrafanaResource(DeleteGrafanaResourceRequest request);

    /**
      * *   You can delete workspaces only in Managed Service for Prometheus Beta Edition, which is `free of charge`.
      * *   You cannot delete workspaces in Managed Service for Prometheus Developer Edition, Pro Edition, and Advanced Edition. You can go to the [User Center](https://usercenter2.aliyun.com/refund/refund) to unsubscribe from workspaces.
      *
     */
    CompletableFuture<DeleteGrafanaWorkspaceResponse> deleteGrafanaWorkspace(DeleteGrafanaWorkspaceRequest request);

    CompletableFuture<DeleteIMRobotResponse> deleteIMRobot(DeleteIMRobotRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DeleteIntegrationResponse> deleteIntegration(DeleteIntegrationRequest request);

    CompletableFuture<DeleteIntegrationsResponse> deleteIntegrations(DeleteIntegrationsRequest request);

    CompletableFuture<DeleteNotificationPolicyResponse> deleteNotificationPolicy(DeleteNotificationPolicyRequest request);

    CompletableFuture<DeletePrometheusAlertRuleResponse> deletePrometheusAlertRule(DeletePrometheusAlertRuleRequest request);

    CompletableFuture<DeletePrometheusGlobalViewResponse> deletePrometheusGlobalView(DeletePrometheusGlobalViewRequest request);

    CompletableFuture<DeletePrometheusIntegrationResponse> deletePrometheusIntegration(DeletePrometheusIntegrationRequest request);

    CompletableFuture<DeletePrometheusMonitoringResponse> deletePrometheusMonitoring(DeletePrometheusMonitoringRequest request);

    CompletableFuture<DeleteRetcodeAppResponse> deleteRetcodeApp(DeleteRetcodeAppRequest request);

    CompletableFuture<DeleteRumAppResponse> deleteRumApp(DeleteRumAppRequest request);

    /**
      * Real User Monitoring (RUM) is available only in the China (Hangzhou), Singapore, and US (Silicon Valley) regions. Select the correct endpoint.
      *
     */
    CompletableFuture<DeleteRumUploadFileResponse> deleteRumUploadFile(DeleteRumUploadFileRequest request);

    CompletableFuture<DeleteScenarioResponse> deleteScenario(DeleteScenarioRequest request);

    CompletableFuture<DeleteSilencePolicyResponse> deleteSilencePolicy(DeleteSilencePolicyRequest request);

    CompletableFuture<DeleteSourceMapResponse> deleteSourceMap(DeleteSourceMapRequest request);

    CompletableFuture<DeleteSyntheticTaskResponse> deleteSyntheticTask(DeleteSyntheticTaskRequest request);

    CompletableFuture<DeleteTimingSyntheticTaskResponse> deleteTimingSyntheticTask(DeleteTimingSyntheticTaskRequest request);

    CompletableFuture<DeleteTraceAppResponse> deleteTraceApp(DeleteTraceAppRequest request);

    CompletableFuture<DeleteWebhookContactResponse> deleteWebhookContact(DeleteWebhookContactRequest request);

    CompletableFuture<DescribeAddonReleaseResponse> describeAddonRelease(DescribeAddonReleaseRequest request);

    CompletableFuture<DescribeContactGroupsResponse> describeContactGroups(DescribeContactGroupsRequest request);

    CompletableFuture<DescribeContactsResponse> describeContacts(DescribeContactsRequest request);

    CompletableFuture<DescribeDispatchRuleResponse> describeDispatchRule(DescribeDispatchRuleRequest request);

    CompletableFuture<DescribeEnvCustomJobResponse> describeEnvCustomJob(DescribeEnvCustomJobRequest request);

    CompletableFuture<DescribeEnvPodMonitorResponse> describeEnvPodMonitor(DescribeEnvPodMonitorRequest request);

    CompletableFuture<DescribeEnvServiceMonitorResponse> describeEnvServiceMonitor(DescribeEnvServiceMonitorRequest request);

    CompletableFuture<DescribeEnvironmentResponse> describeEnvironment(DescribeEnvironmentRequest request);

    CompletableFuture<DescribeEnvironmentFeatureResponse> describeEnvironmentFeature(DescribeEnvironmentFeatureRequest request);

    CompletableFuture<DescribeIMRobotsResponse> describeIMRobots(DescribeIMRobotsRequest request);

    CompletableFuture<DescribePrometheusAlertRuleResponse> describePrometheusAlertRule(DescribePrometheusAlertRuleRequest request);

    CompletableFuture<DescribeTraceLicenseKeyResponse> describeTraceLicenseKey(DescribeTraceLicenseKeyRequest request);

    CompletableFuture<DescribeWebhookContactsResponse> describeWebhookContacts(DescribeWebhookContactsRequest request);

    CompletableFuture<DoInsightsActionResponse> doInsightsAction(DoInsightsActionRequest request);

    CompletableFuture<EnableMetricResponse> enableMetric(EnableMetricRequest request);

    CompletableFuture<GetAgentDownloadUrlResponse> getAgentDownloadUrl(GetAgentDownloadUrlRequest request);

    CompletableFuture<GetAlertRulesResponse> getAlertRules(GetAlertRulesRequest request);

    CompletableFuture<GetAppApiByPageResponse> getAppApiByPage(GetAppApiByPageRequest request);

    CompletableFuture<GetAppJVMConfigResponse> getAppJVMConfig(GetAppJVMConfigRequest request);

    CompletableFuture<GetAuthTokenResponse> getAuthToken(GetAuthTokenRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<GetCloudClusterAllUrlResponse> getCloudClusterAllUrl(GetCloudClusterAllUrlRequest request);

    CompletableFuture<GetClusterAllUrlResponse> getClusterAllUrl(GetClusterAllUrlRequest request);

    CompletableFuture<GetCommercialStatusResponse> getCommercialStatus(GetCommercialStatusRequest request);

    CompletableFuture<GetExploreUrlResponse> getExploreUrl(GetExploreUrlRequest request);

    /**
      * Note: The list returned by this operation includes the workspaces of Developer Edition, Expert Edition, and Advanced Edition. The list does not include the workspaces of Shared Edition.
      *
     */
    CompletableFuture<GetGrafanaWorkspaceResponse> getGrafanaWorkspace(GetGrafanaWorkspaceRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<GetIntegrationStateResponse> getIntegrationState(GetIntegrationStateRequest request);

    /**
      * @deprecated
      *
     */
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

    CompletableFuture<GetRecordingRuleResponse> getRecordingRule(GetRecordingRuleRequest request);

    CompletableFuture<GetRetcodeAppByPidResponse> getRetcodeAppByPid(GetRetcodeAppByPidRequest request);

    CompletableFuture<GetRetcodeDataByQueryResponse> getRetcodeDataByQuery(GetRetcodeDataByQueryRequest request);

    CompletableFuture<GetRetcodeLogstoreResponse> getRetcodeLogstore(GetRetcodeLogstoreRequest request);

    CompletableFuture<GetRetcodeShareUrlResponse> getRetcodeShareUrl(GetRetcodeShareUrlRequest request);

    /**
      * Real User Monitoring (RUM) is available only in the China (Hangzhou), Singapore, and US (Silicon Valley) regions. Select the correct endpoint.
      *
     */
    CompletableFuture<GetRumAppInfoResponse> getRumAppInfo(GetRumAppInfoRequest request);

    /**
      * Real User Monitoring (RUM) is available only in the China (Hangzhou), Singapore, and US (Silicon Valley) regions. Select the correct endpoint.
      *
     */
    CompletableFuture<GetRumAppsResponse> getRumApps(GetRumAppsRequest request);

    /**
      * Real User Monitoring (RUM) is available only in the China (Hangzhou), Singapore, and US (Silicon Valley) regions. Select the correct endpoint.
      *
     */
    CompletableFuture<GetRumDataForPageResponse> getRumDataForPage(GetRumDataForPageRequest request);

    /**
      * Real User Monitoring (RUM) is available only in the China (Hangzhou), Singapore, and US (Silicon Valley) regions. Select the correct endpoint.
      *
     */
    CompletableFuture<GetRumExceptionStackResponse> getRumExceptionStack(GetRumExceptionStackRequest request);

    /**
      * You can query the usage data for the current day at any time. You can query the usage data for the previous day only after 8:00 today.
      *
     */
    CompletableFuture<GetRumOcuStatisticDataResponse> getRumOcuStatisticData(GetRumOcuStatisticDataRequest request);

    /**
      * Real User Monitoring (RUM) is available only in the China (Hangzhou), Singapore, and US (Silicon Valley) regions. Select the correct endpoint.
      *
     */
    CompletableFuture<GetRumUploadFilesResponse> getRumUploadFiles(GetRumUploadFilesRequest request);

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

    CompletableFuture<GetTraceAppConfigResponse> getTraceAppConfig(GetTraceAppConfigRequest request);

    /**
      * >  You can call the **ImportAppAlertRules** operation to import only the alert rules that are generated by Application Real-Time Monitoring Service (ARMS) for application monitoring and browser monitoring. This operation cannot be used to import custom alert rules, alert rules for Prometheus monitoring, or default emergency alert rules.
      *
     */
    CompletableFuture<ImportAppAlertRulesResponse> importAppAlertRules(ImportAppAlertRulesRequest request);

    CompletableFuture<InitEnvironmentResponse> initEnvironment(InitEnvironmentRequest request);

    CompletableFuture<InstallAddonResponse> installAddon(InstallAddonRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<InstallCmsExporterResponse> installCmsExporter(InstallCmsExporterRequest request);

    CompletableFuture<InstallEnvironmentFeatureResponse> installEnvironmentFeature(InstallEnvironmentFeatureRequest request);

    /**
      * @deprecated
      * You can call this operation only if the following conditions are met: The resources that you want to monitor are ASK clusters or ECS clusters. No Prometheus agents are installed in the ASK or ECS clusters. Take note that Prometheus agents can be installed only on the cloud service side, not in user clusters.
      *
     */
    CompletableFuture<InstallManagedPrometheusResponse> installManagedPrometheus(InstallManagedPrometheusRequest request);

    CompletableFuture<ListActivatedAlertsResponse> listActivatedAlerts(ListActivatedAlertsRequest request);

    CompletableFuture<ListAddonReleasesResponse> listAddonReleases(ListAddonReleasesRequest request);

    CompletableFuture<ListAddonsResponse> listAddons(ListAddonsRequest request);

    CompletableFuture<ListAlertEventsResponse> listAlertEvents(ListAlertEventsRequest request);

    CompletableFuture<ListAlertsResponse> listAlerts(ListAlertsRequest request);

    CompletableFuture<ListClusterFromGrafanaResponse> listClusterFromGrafana(ListClusterFromGrafanaRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ListCmsInstancesResponse> listCmsInstances(ListCmsInstancesRequest request);

    /**
      * None.
      *
     */
    CompletableFuture<ListDashboardsResponse> listDashboards(ListDashboardsRequest request);

    CompletableFuture<ListDashboardsByNameResponse> listDashboardsByName(ListDashboardsByNameRequest request);

    CompletableFuture<ListDispatchRuleResponse> listDispatchRule(ListDispatchRuleRequest request);

    CompletableFuture<ListEnvCustomJobsResponse> listEnvCustomJobs(ListEnvCustomJobsRequest request);

    CompletableFuture<ListEnvPodMonitorsResponse> listEnvPodMonitors(ListEnvPodMonitorsRequest request);

    CompletableFuture<ListEnvServiceMonitorsResponse> listEnvServiceMonitors(ListEnvServiceMonitorsRequest request);

    CompletableFuture<ListEnvironmentDashboardsResponse> listEnvironmentDashboards(ListEnvironmentDashboardsRequest request);

    CompletableFuture<ListEnvironmentFeaturesResponse> listEnvironmentFeatures(ListEnvironmentFeaturesRequest request);

    CompletableFuture<ListEnvironmentsResponse> listEnvironments(ListEnvironmentsRequest request);

    CompletableFuture<ListEscalationPoliciesResponse> listEscalationPolicies(ListEscalationPoliciesRequest request);

    CompletableFuture<ListEventBridgeIntegrationsResponse> listEventBridgeIntegrations(ListEventBridgeIntegrationsRequest request);

    /**
      * >The list returned by this operation includes the workspaces of Developer Edition, Expert Edition, and Advanced Edition. The list does not include the workspaces of Shared Edition.
      *
     */
    CompletableFuture<ListGrafanaWorkspaceResponse> listGrafanaWorkspace(ListGrafanaWorkspaceRequest request);

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

    /**
      * ****
      *
     */
    CompletableFuture<ListRetcodeAppsResponse> listRetcodeApps(ListRetcodeAppsRequest request);

    CompletableFuture<ListScenarioResponse> listScenario(ListScenarioRequest request);

    CompletableFuture<ListSilencePoliciesResponse> listSilencePolicies(ListSilencePoliciesRequest request);

    CompletableFuture<ListSyntheticDetailResponse> listSyntheticDetail(ListSyntheticDetailRequest request);

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

    CompletableFuture<QueryAppTopologyResponse> queryAppTopology(QueryAppTopologyRequest request);

    CompletableFuture<QueryCommercialUsageResponse> queryCommercialUsage(QueryCommercialUsageRequest request);

    CompletableFuture<QueryMetricByPageResponse> queryMetricByPage(QueryMetricByPageRequest request);

    CompletableFuture<QueryPromInstallStatusResponse> queryPromInstallStatus(QueryPromInstallStatusRequest request);

    CompletableFuture<QueryReleaseMetricResponse> queryReleaseMetric(QueryReleaseMetricRequest request);

    CompletableFuture<RemoveAliClusterIdsFromPrometheusGlobalViewResponse> removeAliClusterIdsFromPrometheusGlobalView(RemoveAliClusterIdsFromPrometheusGlobalViewRequest request);

    CompletableFuture<RemoveSourcesFromPrometheusGlobalViewResponse> removeSourcesFromPrometheusGlobalView(RemoveSourcesFromPrometheusGlobalViewRequest request);

    CompletableFuture<RestartEnvironmentFeatureResponse> restartEnvironmentFeature(RestartEnvironmentFeatureRequest request);

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
      * @deprecated
      * This operation is available only for ASK, ECS, and ACK One clusters. Before you call this operation, make sure that a managed Prometheus agent is installed for your cluster.
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

    CompletableFuture<UpdateEnvCustomJobResponse> updateEnvCustomJob(UpdateEnvCustomJobRequest request);

    CompletableFuture<UpdateEnvPodMonitorResponse> updateEnvPodMonitor(UpdateEnvPodMonitorRequest request);

    CompletableFuture<UpdateEnvServiceMonitorResponse> updateEnvServiceMonitor(UpdateEnvServiceMonitorRequest request);

    CompletableFuture<UpdateEnvironmentResponse> updateEnvironment(UpdateEnvironmentRequest request);

    CompletableFuture<UpdateGrafanaWorkspaceResponse> updateGrafanaWorkspace(UpdateGrafanaWorkspaceRequest request);

    /**
      * Note: The list returned by this operation includes the workspaces of Developer Edition, Expert Edition, and Advanced Edition. The list does not include the workspaces of Shared Edition.
      *
     */
    CompletableFuture<UpdateGrafanaWorkspaceVersionResponse> updateGrafanaWorkspaceVersion(UpdateGrafanaWorkspaceVersionRequest request);

    CompletableFuture<UpdateIntegrationResponse> updateIntegration(UpdateIntegrationRequest request);

    CompletableFuture<UpdateMetricDropResponse> updateMetricDrop(UpdateMetricDropRequest request);

    CompletableFuture<UpdatePrometheusAlertRuleResponse> updatePrometheusAlertRule(UpdatePrometheusAlertRuleRequest request);

    CompletableFuture<UpdatePrometheusGlobalViewResponse> updatePrometheusGlobalView(UpdatePrometheusGlobalViewRequest request);

    CompletableFuture<UpdatePrometheusInstanceResponse> updatePrometheusInstance(UpdatePrometheusInstanceRequest request);

    CompletableFuture<UpdatePrometheusIntegrationResponse> updatePrometheusIntegration(UpdatePrometheusIntegrationRequest request);

    CompletableFuture<UpdatePrometheusMonitoringResponse> updatePrometheusMonitoring(UpdatePrometheusMonitoringRequest request);

    CompletableFuture<UpdatePrometheusMonitoringStatusResponse> updatePrometheusMonitoringStatus(UpdatePrometheusMonitoringStatusRequest request);

    /**
      * Real User Monitoring (RUM) is available only in the China (Hangzhou), Singapore, and US (Silicon Valley) regions. Select the correct endpoint.
      *
     */
    CompletableFuture<UpdateRumAppResponse> updateRumApp(UpdateRumAppRequest request);

    /**
      * Real User Monitoring (RUM) is available only in the China (Hangzhou), Singapore, and US (Silicon Valley) regions. Select the correct endpoint.
      *
     */
    CompletableFuture<UpdateRumFileStatusResponse> updateRumFileStatus(UpdateRumFileStatusRequest request);

    CompletableFuture<UpdateTimingSyntheticTaskResponse> updateTimingSyntheticTask(UpdateTimingSyntheticTaskRequest request);

    /**
      * This operation is no longer maintained. Call the CreateOrUpdateWebhookContact operation in the new alter management module to create or modify a webhook alert contact.
      *
     */
    CompletableFuture<UpdateWebhookResponse> updateWebhook(UpdateWebhookRequest request);

    CompletableFuture<UpgradeAddonReleaseResponse> upgradeAddonRelease(UpgradeAddonReleaseRequest request);

    CompletableFuture<UpgradeEnvironmentFeatureResponse> upgradeEnvironmentFeature(UpgradeEnvironmentFeatureRequest request);

    CompletableFuture<UploadResponse> upload(UploadRequest request);

}
