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

    /**
     * @param request the request parameters of AddAliClusterIdsToPrometheusGlobalView  AddAliClusterIdsToPrometheusGlobalViewRequest
     * @return AddAliClusterIdsToPrometheusGlobalViewResponse
     */
    CompletableFuture<AddAliClusterIdsToPrometheusGlobalViewResponse> addAliClusterIdsToPrometheusGlobalView(AddAliClusterIdsToPrometheusGlobalViewRequest request);

    /**
     * @param request the request parameters of AddGrafana  AddGrafanaRequest
     * @return AddGrafanaResponse
     */
    CompletableFuture<AddGrafanaResponse> addGrafana(AddGrafanaRequest request);

    /**
     * @deprecated OpenAPI AddIntegration is deprecated, please use ARMS::2019-08-08::InstallAddon instead.  * @param request  the request parameters of AddIntegration  AddIntegrationRequest
     * @return AddIntegrationResponse
     */
    @Deprecated
    CompletableFuture<AddIntegrationResponse> addIntegration(AddIntegrationRequest request);

    /**
     * @param request the request parameters of AddPrometheusGlobalView  AddPrometheusGlobalViewRequest
     * @return AddPrometheusGlobalViewResponse
     */
    CompletableFuture<AddPrometheusGlobalViewResponse> addPrometheusGlobalView(AddPrometheusGlobalViewRequest request);

    /**
     * @param request the request parameters of AddPrometheusGlobalViewByAliClusterIds  AddPrometheusGlobalViewByAliClusterIdsRequest
     * @return AddPrometheusGlobalViewByAliClusterIdsResponse
     */
    CompletableFuture<AddPrometheusGlobalViewByAliClusterIdsResponse> addPrometheusGlobalViewByAliClusterIds(AddPrometheusGlobalViewByAliClusterIdsRequest request);

    /**
     * @deprecated OpenAPI AddPrometheusInstance is deprecated, please use ARMS::2019-08-08::CreatePrometheusInstance instead.  * @param request  the request parameters of AddPrometheusInstance  AddPrometheusInstanceRequest
     * @return AddPrometheusInstanceResponse
     */
    @Deprecated
    CompletableFuture<AddPrometheusInstanceResponse> addPrometheusInstance(AddPrometheusInstanceRequest request);

    /**
     * @param request the request parameters of AddPrometheusIntegration  AddPrometheusIntegrationRequest
     * @return AddPrometheusIntegrationResponse
     */
    CompletableFuture<AddPrometheusIntegrationResponse> addPrometheusIntegration(AddPrometheusIntegrationRequest request);

    /**
     * @param request the request parameters of AddRecordingRule  AddRecordingRuleRequest
     * @return AddRecordingRuleResponse
     */
    CompletableFuture<AddRecordingRuleResponse> addRecordingRule(AddRecordingRuleRequest request);

    /**
     * @param request the request parameters of AddTagToFlinkCluster  AddTagToFlinkClusterRequest
     * @return AddTagToFlinkClusterResponse
     */
    CompletableFuture<AddTagToFlinkClusterResponse> addTagToFlinkCluster(AddTagToFlinkClusterRequest request);

    /**
     * @param request the request parameters of AppendInstancesToPrometheusGlobalView  AppendInstancesToPrometheusGlobalViewRequest
     * @return AppendInstancesToPrometheusGlobalViewResponse
     */
    CompletableFuture<AppendInstancesToPrometheusGlobalViewResponse> appendInstancesToPrometheusGlobalView(AppendInstancesToPrometheusGlobalViewRequest request);

    /**
     * @param request the request parameters of ApplyScenario  ApplyScenarioRequest
     * @return ApplyScenarioResponse
     */
    CompletableFuture<ApplyScenarioResponse> applyScenario(ApplyScenarioRequest request);

    /**
     * @param request the request parameters of BindPrometheusGrafanaInstance  BindPrometheusGrafanaInstanceRequest
     * @return BindPrometheusGrafanaInstanceResponse
     */
    CompletableFuture<BindPrometheusGrafanaInstanceResponse> bindPrometheusGrafanaInstance(BindPrometheusGrafanaInstanceRequest request);

    /**
     * @param request the request parameters of BlockAlarmNotification  BlockAlarmNotificationRequest
     * @return BlockAlarmNotificationResponse
     */
    CompletableFuture<BlockAlarmNotificationResponse> blockAlarmNotification(BlockAlarmNotificationRequest request);

    /**
     * @param request the request parameters of ChangeAlarmSeverity  ChangeAlarmSeverityRequest
     * @return ChangeAlarmSeverityResponse
     */
    CompletableFuture<ChangeAlarmSeverityResponse> changeAlarmSeverity(ChangeAlarmSeverityRequest request);

    /**
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to check whether ARMS is available for commercial use in a region.</p>
     * 
     * @param request the request parameters of CheckCommercialStatus  CheckCommercialStatusRequest
     * @return CheckCommercialStatusResponse
     */
    CompletableFuture<CheckCommercialStatusResponse> checkCommercialStatus(CheckCommercialStatusRequest request);

    /**
     * @param request the request parameters of CheckServiceStatus  CheckServiceStatusRequest
     * @return CheckServiceStatusResponse
     */
    CompletableFuture<CheckServiceStatusResponse> checkServiceStatus(CheckServiceStatusRequest request);

    /**
     * @param request the request parameters of ClaimAlarm  ClaimAlarmRequest
     * @return ClaimAlarmResponse
     */
    CompletableFuture<ClaimAlarmResponse> claimAlarm(ClaimAlarmRequest request);

    /**
     * @param request the request parameters of CloseAlarm  CloseAlarmRequest
     * @return CloseAlarmResponse
     */
    CompletableFuture<CloseAlarmResponse> closeAlarm(CloseAlarmRequest request);

    /**
     * <b>description</b> :
     * <hr>
     * 
     * @param request the request parameters of ConfigApp  ConfigAppRequest
     * @return ConfigAppResponse
     */
    CompletableFuture<ConfigAppResponse> configApp(ConfigAppRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is no longer maintained. To create or modify an alert contact, call the CreateOrUpdateContact operation provided by the new version of the Alert Management module.</p>
     * 
     * @param request the request parameters of CreateAlertContact  CreateAlertContactRequest
     * @return CreateAlertContactResponse
     */
    CompletableFuture<CreateAlertContactResponse> createAlertContact(CreateAlertContactRequest request);

    /**
     * <b>description</b> :
     * <p>The current API operation is no longer maintained. Call the CreateOrUpdateContactGroup operation of the new Alert Management module to create or modify alert contact groups.</p>
     * 
     * @param request the request parameters of CreateAlertContactGroup  CreateAlertContactGroupRequest
     * @return CreateAlertContactGroupResponse
     */
    CompletableFuture<CreateAlertContactGroupResponse> createAlertContactGroup(CreateAlertContactGroupRequest request);

    /**
     * @param request the request parameters of CreateDispatchRule  CreateDispatchRuleRequest
     * @return CreateDispatchRuleResponse
     */
    CompletableFuture<CreateDispatchRuleResponse> createDispatchRule(CreateDispatchRuleRequest request);

    /**
     * @param request the request parameters of CreateEnvCustomJob  CreateEnvCustomJobRequest
     * @return CreateEnvCustomJobResponse
     */
    CompletableFuture<CreateEnvCustomJobResponse> createEnvCustomJob(CreateEnvCustomJobRequest request);

    /**
     * @param request the request parameters of CreateEnvPodMonitor  CreateEnvPodMonitorRequest
     * @return CreateEnvPodMonitorResponse
     */
    CompletableFuture<CreateEnvPodMonitorResponse> createEnvPodMonitor(CreateEnvPodMonitorRequest request);

    /**
     * @param request the request parameters of CreateEnvServiceMonitor  CreateEnvServiceMonitorRequest
     * @return CreateEnvServiceMonitorResponse
     */
    CompletableFuture<CreateEnvServiceMonitorResponse> createEnvServiceMonitor(CreateEnvServiceMonitorRequest request);

    /**
     * @param request the request parameters of CreateEnvironment  CreateEnvironmentRequest
     * @return CreateEnvironmentResponse
     */
    CompletableFuture<CreateEnvironmentResponse> createEnvironment(CreateEnvironmentRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call the operation, make sure that you have learned about the billing methods and <a href="https://www.alibabacloud.com/help/zh/grafana/product-overview/billing-4?spm=a2c4g.11186623.0.0.14c2d253B3SDbt">pricing</a> of Managed Service for Grafana.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>To create workspaces, you must complete real-name verification.</li>
     * <li>Regular users can create workspaces only in Managed Service for Grafana Developer Edition, Pro Edition, and Advanced Edition. <code>These editions charge fees.</code></li>
     * <li>Internal users can create workspaces only in Managed Service for Grafana Beta Edition and Standard Edition. <code>These editions do not charge fees.</code></li>
     * </ul>
     * 
     * @param request the request parameters of CreateGrafanaWorkspace  CreateGrafanaWorkspaceRequest
     * @return CreateGrafanaWorkspaceResponse
     */
    CompletableFuture<CreateGrafanaWorkspaceResponse> createGrafanaWorkspace(CreateGrafanaWorkspaceRequest request);

    /**
     * @param request the request parameters of CreateIntegration  CreateIntegrationRequest
     * @return CreateIntegrationResponse
     */
    CompletableFuture<CreateIntegrationResponse> createIntegration(CreateIntegrationRequest request);

    /**
     * @param request the request parameters of CreateOrUpdateAlertRule  CreateOrUpdateAlertRuleRequest
     * @return CreateOrUpdateAlertRuleResponse
     */
    CompletableFuture<CreateOrUpdateAlertRuleResponse> createOrUpdateAlertRule(CreateOrUpdateAlertRuleRequest request);

    /**
     * @param request the request parameters of CreateOrUpdateContact  CreateOrUpdateContactRequest
     * @return CreateOrUpdateContactResponse
     */
    CompletableFuture<CreateOrUpdateContactResponse> createOrUpdateContact(CreateOrUpdateContactRequest request);

    /**
     * @param request the request parameters of CreateOrUpdateContactGroup  CreateOrUpdateContactGroupRequest
     * @return CreateOrUpdateContactGroupResponse
     */
    CompletableFuture<CreateOrUpdateContactGroupResponse> createOrUpdateContactGroup(CreateOrUpdateContactGroupRequest request);

    /**
     * @param request the request parameters of CreateOrUpdateEventBridgeIntegration  CreateOrUpdateEventBridgeIntegrationRequest
     * @return CreateOrUpdateEventBridgeIntegrationResponse
     */
    CompletableFuture<CreateOrUpdateEventBridgeIntegrationResponse> createOrUpdateEventBridgeIntegration(CreateOrUpdateEventBridgeIntegrationRequest request);

    /**
     * @param request the request parameters of CreateOrUpdateIMRobot  CreateOrUpdateIMRobotRequest
     * @return CreateOrUpdateIMRobotResponse
     */
    CompletableFuture<CreateOrUpdateIMRobotResponse> createOrUpdateIMRobot(CreateOrUpdateIMRobotRequest request);

    /**
     * @param request the request parameters of CreateOrUpdateNotificationPolicy  CreateOrUpdateNotificationPolicyRequest
     * @return CreateOrUpdateNotificationPolicyResponse
     */
    CompletableFuture<CreateOrUpdateNotificationPolicyResponse> createOrUpdateNotificationPolicy(CreateOrUpdateNotificationPolicyRequest request);

    /**
     * @param request the request parameters of CreateOrUpdateSilencePolicy  CreateOrUpdateSilencePolicyRequest
     * @return CreateOrUpdateSilencePolicyResponse
     */
    CompletableFuture<CreateOrUpdateSilencePolicyResponse> createOrUpdateSilencePolicy(CreateOrUpdateSilencePolicyRequest request);

    /**
     * @param request the request parameters of CreateOrUpdateWebhookContact  CreateOrUpdateWebhookContactRequest
     * @return CreateOrUpdateWebhookContactResponse
     */
    CompletableFuture<CreateOrUpdateWebhookContactResponse> createOrUpdateWebhookContact(CreateOrUpdateWebhookContactRequest request);

    /**
     * @param request the request parameters of CreatePrometheusAlertRule  CreatePrometheusAlertRuleRequest
     * @return CreatePrometheusAlertRuleResponse
     */
    CompletableFuture<CreatePrometheusAlertRuleResponse> createPrometheusAlertRule(CreatePrometheusAlertRuleRequest request);

    /**
     * @param request the request parameters of CreatePrometheusInstance  CreatePrometheusInstanceRequest
     * @return CreatePrometheusInstanceResponse
     */
    CompletableFuture<CreatePrometheusInstanceResponse> createPrometheusInstance(CreatePrometheusInstanceRequest request);

    /**
     * @param request the request parameters of CreatePrometheusMonitoring  CreatePrometheusMonitoringRequest
     * @return CreatePrometheusMonitoringResponse
     */
    CompletableFuture<CreatePrometheusMonitoringResponse> createPrometheusMonitoring(CreatePrometheusMonitoringRequest request);

    /**
     * @param request the request parameters of CreateRetcodeApp  CreateRetcodeAppRequest
     * @return CreateRetcodeAppResponse
     */
    CompletableFuture<CreateRetcodeAppResponse> createRetcodeApp(CreateRetcodeAppRequest request);

    /**
     * @param request the request parameters of CreateRumApp  CreateRumAppRequest
     * @return CreateRumAppResponse
     */
    CompletableFuture<CreateRumAppResponse> createRumApp(CreateRumAppRequest request);

    /**
     * <b>description</b> :
     * <p>This operation returns a URL. You can upload files to the URL. For more information, see <a href="https://help.aliyun.com/document_detail/2579659.html">Upload local files with signed URLs</a>.</p>
     * 
     * @param request the request parameters of CreateRumUploadFileUrl  CreateRumUploadFileUrlRequest
     * @return CreateRumUploadFileUrlResponse
     */
    CompletableFuture<CreateRumUploadFileUrlResponse> createRumUploadFileUrl(CreateRumUploadFileUrlRequest request);

    /**
     * @param request the request parameters of CreateSyntheticTask  CreateSyntheticTaskRequest
     * @return CreateSyntheticTaskResponse
     */
    CompletableFuture<CreateSyntheticTaskResponse> createSyntheticTask(CreateSyntheticTaskRequest request);

    /**
     * @param request the request parameters of CreateTimingSyntheticTask  CreateTimingSyntheticTaskRequest
     * @return CreateTimingSyntheticTaskResponse
     */
    CompletableFuture<CreateTimingSyntheticTaskResponse> createTimingSyntheticTask(CreateTimingSyntheticTaskRequest request);

    /**
     * @param request the request parameters of CreateWebhook  CreateWebhookRequest
     * @return CreateWebhookResponse
     */
    CompletableFuture<CreateWebhookResponse> createWebhook(CreateWebhookRequest request);

    /**
     * @param request the request parameters of DelAuthToken  DelAuthTokenRequest
     * @return DelAuthTokenResponse
     */
    CompletableFuture<DelAuthTokenResponse> delAuthToken(DelAuthTokenRequest request);

    /**
     * @param request the request parameters of DeleteAddonRelease  DeleteAddonReleaseRequest
     * @return DeleteAddonReleaseResponse
     */
    CompletableFuture<DeleteAddonReleaseResponse> deleteAddonRelease(DeleteAddonReleaseRequest request);

    /**
     * <b>description</b> :
     * <hr>
     * 
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
     * @param request the request parameters of DeleteAlertRule  DeleteAlertRuleRequest
     * @return DeleteAlertRuleResponse
     */
    CompletableFuture<DeleteAlertRuleResponse> deleteAlertRule(DeleteAlertRuleRequest request);

    /**
     * <b>description</b> :
     * <p>The current operation is no longer maintained. Call the DeleteAlertRule operation of Alert Management (New) to delete alert rules.</p>
     * 
     * @param request the request parameters of DeleteAlertRules  DeleteAlertRulesRequest
     * @return DeleteAlertRulesResponse
     */
    CompletableFuture<DeleteAlertRulesResponse> deleteAlertRules(DeleteAlertRulesRequest request);

    /**
     * @param request the request parameters of DeleteAppList  DeleteAppListRequest
     * @return DeleteAppListResponse
     */
    CompletableFuture<DeleteAppListResponse> deleteAppList(DeleteAppListRequest request);

    /**
     * @deprecated OpenAPI DeleteCmsExporter is deprecated, please use ARMS::2019-08-08::DeleteAddonRelease instead.  * @param request  the request parameters of DeleteCmsExporter  DeleteCmsExporterRequest
     * @return DeleteCmsExporterResponse
     */
    @Deprecated
    CompletableFuture<DeleteCmsExporterResponse> deleteCmsExporter(DeleteCmsExporterRequest request);

    /**
     * @param request the request parameters of DeleteContact  DeleteContactRequest
     * @return DeleteContactResponse
     */
    CompletableFuture<DeleteContactResponse> deleteContact(DeleteContactRequest request);

    /**
     * @param request the request parameters of DeleteContactGroup  DeleteContactGroupRequest
     * @return DeleteContactGroupResponse
     */
    CompletableFuture<DeleteContactGroupResponse> deleteContactGroup(DeleteContactGroupRequest request);

    /**
     * @param request the request parameters of DeleteDispatchRule  DeleteDispatchRuleRequest
     * @return DeleteDispatchRuleResponse
     */
    CompletableFuture<DeleteDispatchRuleResponse> deleteDispatchRule(DeleteDispatchRuleRequest request);

    /**
     * @param request the request parameters of DeleteEnvCustomJob  DeleteEnvCustomJobRequest
     * @return DeleteEnvCustomJobResponse
     */
    CompletableFuture<DeleteEnvCustomJobResponse> deleteEnvCustomJob(DeleteEnvCustomJobRequest request);

    /**
     * @param request the request parameters of DeleteEnvPodMonitor  DeleteEnvPodMonitorRequest
     * @return DeleteEnvPodMonitorResponse
     */
    CompletableFuture<DeleteEnvPodMonitorResponse> deleteEnvPodMonitor(DeleteEnvPodMonitorRequest request);

    /**
     * @param request the request parameters of DeleteEnvServiceMonitor  DeleteEnvServiceMonitorRequest
     * @return DeleteEnvServiceMonitorResponse
     */
    CompletableFuture<DeleteEnvServiceMonitorResponse> deleteEnvServiceMonitor(DeleteEnvServiceMonitorRequest request);

    /**
     * @param request the request parameters of DeleteEnvironment  DeleteEnvironmentRequest
     * @return DeleteEnvironmentResponse
     */
    CompletableFuture<DeleteEnvironmentResponse> deleteEnvironment(DeleteEnvironmentRequest request);

    /**
     * @param request the request parameters of DeleteEnvironmentFeature  DeleteEnvironmentFeatureRequest
     * @return DeleteEnvironmentFeatureResponse
     */
    CompletableFuture<DeleteEnvironmentFeatureResponse> deleteEnvironmentFeature(DeleteEnvironmentFeatureRequest request);

    /**
     * @param request the request parameters of DeleteEventBridgeIntegration  DeleteEventBridgeIntegrationRequest
     * @return DeleteEventBridgeIntegrationResponse
     */
    CompletableFuture<DeleteEventBridgeIntegrationResponse> deleteEventBridgeIntegration(DeleteEventBridgeIntegrationRequest request);

    /**
     * @param request the request parameters of DeleteGrafanaResource  DeleteGrafanaResourceRequest
     * @return DeleteGrafanaResourceResponse
     */
    CompletableFuture<DeleteGrafanaResourceResponse> deleteGrafanaResource(DeleteGrafanaResourceRequest request);

    /**
     * <b>description</b> :
     * <p>  You can delete workspaces only in Managed Service for Prometheus Beta Edition, which is <code>free of charge</code>.</p>
     * <ul>
     * <li>You cannot delete workspaces in Managed Service for Prometheus Developer Edition, Pro Edition, and Advanced Edition. You can go to the <a href="https://usercenter2.aliyun.com/refund/refund">User Center</a> to unsubscribe from workspaces.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteGrafanaWorkspace  DeleteGrafanaWorkspaceRequest
     * @return DeleteGrafanaWorkspaceResponse
     */
    CompletableFuture<DeleteGrafanaWorkspaceResponse> deleteGrafanaWorkspace(DeleteGrafanaWorkspaceRequest request);

    /**
     * @param request the request parameters of DeleteIMRobot  DeleteIMRobotRequest
     * @return DeleteIMRobotResponse
     */
    CompletableFuture<DeleteIMRobotResponse> deleteIMRobot(DeleteIMRobotRequest request);

    /**
     * @deprecated OpenAPI DeleteIntegration is deprecated, please use ARMS::2019-08-08::DeleteAddonRelease instead.  * @param request  the request parameters of DeleteIntegration  DeleteIntegrationRequest
     * @return DeleteIntegrationResponse
     */
    @Deprecated
    CompletableFuture<DeleteIntegrationResponse> deleteIntegration(DeleteIntegrationRequest request);

    /**
     * @param request the request parameters of DeleteIntegrations  DeleteIntegrationsRequest
     * @return DeleteIntegrationsResponse
     */
    CompletableFuture<DeleteIntegrationsResponse> deleteIntegrations(DeleteIntegrationsRequest request);

    /**
     * @param request the request parameters of DeleteNotificationPolicy  DeleteNotificationPolicyRequest
     * @return DeleteNotificationPolicyResponse
     */
    CompletableFuture<DeleteNotificationPolicyResponse> deleteNotificationPolicy(DeleteNotificationPolicyRequest request);

    /**
     * @param request the request parameters of DeletePrometheusAlertRule  DeletePrometheusAlertRuleRequest
     * @return DeletePrometheusAlertRuleResponse
     */
    CompletableFuture<DeletePrometheusAlertRuleResponse> deletePrometheusAlertRule(DeletePrometheusAlertRuleRequest request);

    /**
     * @param request the request parameters of DeletePrometheusGlobalView  DeletePrometheusGlobalViewRequest
     * @return DeletePrometheusGlobalViewResponse
     */
    CompletableFuture<DeletePrometheusGlobalViewResponse> deletePrometheusGlobalView(DeletePrometheusGlobalViewRequest request);

    /**
     * @param request the request parameters of DeletePrometheusIntegration  DeletePrometheusIntegrationRequest
     * @return DeletePrometheusIntegrationResponse
     */
    CompletableFuture<DeletePrometheusIntegrationResponse> deletePrometheusIntegration(DeletePrometheusIntegrationRequest request);

    /**
     * @param request the request parameters of DeletePrometheusMonitoring  DeletePrometheusMonitoringRequest
     * @return DeletePrometheusMonitoringResponse
     */
    CompletableFuture<DeletePrometheusMonitoringResponse> deletePrometheusMonitoring(DeletePrometheusMonitoringRequest request);

    /**
     * @param request the request parameters of DeleteRetcodeApp  DeleteRetcodeAppRequest
     * @return DeleteRetcodeAppResponse
     */
    CompletableFuture<DeleteRetcodeAppResponse> deleteRetcodeApp(DeleteRetcodeAppRequest request);

    /**
     * @param request the request parameters of DeleteRumApp  DeleteRumAppRequest
     * @return DeleteRumAppResponse
     */
    CompletableFuture<DeleteRumAppResponse> deleteRumApp(DeleteRumAppRequest request);

    /**
     * <b>description</b> :
     * <p>Real User Monitoring (RUM) is available only in the China (Hangzhou), Singapore, and US (Silicon Valley) regions. Select the correct endpoint.</p>
     * 
     * @param request the request parameters of DeleteRumUploadFile  DeleteRumUploadFileRequest
     * @return DeleteRumUploadFileResponse
     */
    CompletableFuture<DeleteRumUploadFileResponse> deleteRumUploadFile(DeleteRumUploadFileRequest request);

    /**
     * @param request the request parameters of DeleteScenario  DeleteScenarioRequest
     * @return DeleteScenarioResponse
     */
    CompletableFuture<DeleteScenarioResponse> deleteScenario(DeleteScenarioRequest request);

    /**
     * @param request the request parameters of DeleteSilencePolicy  DeleteSilencePolicyRequest
     * @return DeleteSilencePolicyResponse
     */
    CompletableFuture<DeleteSilencePolicyResponse> deleteSilencePolicy(DeleteSilencePolicyRequest request);

    /**
     * @param request the request parameters of DeleteSourceMap  DeleteSourceMapRequest
     * @return DeleteSourceMapResponse
     */
    CompletableFuture<DeleteSourceMapResponse> deleteSourceMap(DeleteSourceMapRequest request);

    /**
     * @param request the request parameters of DeleteSyntheticTask  DeleteSyntheticTaskRequest
     * @return DeleteSyntheticTaskResponse
     */
    CompletableFuture<DeleteSyntheticTaskResponse> deleteSyntheticTask(DeleteSyntheticTaskRequest request);

    /**
     * @param request the request parameters of DeleteTimingSyntheticTask  DeleteTimingSyntheticTaskRequest
     * @return DeleteTimingSyntheticTaskResponse
     */
    CompletableFuture<DeleteTimingSyntheticTaskResponse> deleteTimingSyntheticTask(DeleteTimingSyntheticTaskRequest request);

    /**
     * @param request the request parameters of DeleteTraceApp  DeleteTraceAppRequest
     * @return DeleteTraceAppResponse
     */
    CompletableFuture<DeleteTraceAppResponse> deleteTraceApp(DeleteTraceAppRequest request);

    /**
     * @param request the request parameters of DeleteWebhookContact  DeleteWebhookContactRequest
     * @return DeleteWebhookContactResponse
     */
    CompletableFuture<DeleteWebhookContactResponse> deleteWebhookContact(DeleteWebhookContactRequest request);

    /**
     * @param request the request parameters of DescribeAddonMetrics  DescribeAddonMetricsRequest
     * @return DescribeAddonMetricsResponse
     */
    CompletableFuture<DescribeAddonMetricsResponse> describeAddonMetrics(DescribeAddonMetricsRequest request);

    /**
     * @param request the request parameters of DescribeAddonRelease  DescribeAddonReleaseRequest
     * @return DescribeAddonReleaseResponse
     */
    CompletableFuture<DescribeAddonReleaseResponse> describeAddonRelease(DescribeAddonReleaseRequest request);

    /**
     * @param request the request parameters of DescribeContactGroups  DescribeContactGroupsRequest
     * @return DescribeContactGroupsResponse
     */
    CompletableFuture<DescribeContactGroupsResponse> describeContactGroups(DescribeContactGroupsRequest request);

    /**
     * @param request the request parameters of DescribeContacts  DescribeContactsRequest
     * @return DescribeContactsResponse
     */
    CompletableFuture<DescribeContactsResponse> describeContacts(DescribeContactsRequest request);

    /**
     * @param request the request parameters of DescribeDispatchRule  DescribeDispatchRuleRequest
     * @return DescribeDispatchRuleResponse
     */
    CompletableFuture<DescribeDispatchRuleResponse> describeDispatchRule(DescribeDispatchRuleRequest request);

    /**
     * @param request the request parameters of DescribeEnvCustomJob  DescribeEnvCustomJobRequest
     * @return DescribeEnvCustomJobResponse
     */
    CompletableFuture<DescribeEnvCustomJobResponse> describeEnvCustomJob(DescribeEnvCustomJobRequest request);

    /**
     * @param request the request parameters of DescribeEnvPodMonitor  DescribeEnvPodMonitorRequest
     * @return DescribeEnvPodMonitorResponse
     */
    CompletableFuture<DescribeEnvPodMonitorResponse> describeEnvPodMonitor(DescribeEnvPodMonitorRequest request);

    /**
     * @param request the request parameters of DescribeEnvServiceMonitor  DescribeEnvServiceMonitorRequest
     * @return DescribeEnvServiceMonitorResponse
     */
    CompletableFuture<DescribeEnvServiceMonitorResponse> describeEnvServiceMonitor(DescribeEnvServiceMonitorRequest request);

    /**
     * @param request the request parameters of DescribeEnvironment  DescribeEnvironmentRequest
     * @return DescribeEnvironmentResponse
     */
    CompletableFuture<DescribeEnvironmentResponse> describeEnvironment(DescribeEnvironmentRequest request);

    /**
     * @param request the request parameters of DescribeEnvironmentFeature  DescribeEnvironmentFeatureRequest
     * @return DescribeEnvironmentFeatureResponse
     */
    CompletableFuture<DescribeEnvironmentFeatureResponse> describeEnvironmentFeature(DescribeEnvironmentFeatureRequest request);

    /**
     * @param request the request parameters of DescribeIMRobots  DescribeIMRobotsRequest
     * @return DescribeIMRobotsResponse
     */
    CompletableFuture<DescribeIMRobotsResponse> describeIMRobots(DescribeIMRobotsRequest request);

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
     * @param request the request parameters of DescribeWebhookContacts  DescribeWebhookContactsRequest
     * @return DescribeWebhookContactsResponse
     */
    CompletableFuture<DescribeWebhookContactsResponse> describeWebhookContacts(DescribeWebhookContactsRequest request);

    /**
     * @param request the request parameters of DoInsightsAction  DoInsightsActionRequest
     * @return DoInsightsActionResponse
     */
    CompletableFuture<DoInsightsActionResponse> doInsightsAction(DoInsightsActionRequest request);

    /**
     * @param request the request parameters of EnableMetric  EnableMetricRequest
     * @return EnableMetricResponse
     */
    CompletableFuture<EnableMetricResponse> enableMetric(EnableMetricRequest request);

    /**
     * @param request the request parameters of GetAgentDownloadUrl  GetAgentDownloadUrlRequest
     * @return GetAgentDownloadUrlResponse
     */
    CompletableFuture<GetAgentDownloadUrlResponse> getAgentDownloadUrl(GetAgentDownloadUrlRequest request);

    /**
     * @param request the request parameters of GetAgentDownloadUrlV2  GetAgentDownloadUrlV2Request
     * @return GetAgentDownloadUrlV2Response
     */
    CompletableFuture<GetAgentDownloadUrlV2Response> getAgentDownloadUrlV2(GetAgentDownloadUrlV2Request request);

    /**
     * @param request the request parameters of GetAlertRules  GetAlertRulesRequest
     * @return GetAlertRulesResponse
     */
    CompletableFuture<GetAlertRulesResponse> getAlertRules(GetAlertRulesRequest request);

    /**
     * @param request the request parameters of GetAppApiByPage  GetAppApiByPageRequest
     * @return GetAppApiByPageResponse
     */
    CompletableFuture<GetAppApiByPageResponse> getAppApiByPage(GetAppApiByPageRequest request);

    /**
     * @param request the request parameters of GetAppJVMConfig  GetAppJVMConfigRequest
     * @return GetAppJVMConfigResponse
     */
    CompletableFuture<GetAppJVMConfigResponse> getAppJVMConfig(GetAppJVMConfigRequest request);

    /**
     * @param request the request parameters of GetAuthToken  GetAuthTokenRequest
     * @return GetAuthTokenResponse
     */
    CompletableFuture<GetAuthTokenResponse> getAuthToken(GetAuthTokenRequest request);

    /**
     * @deprecated OpenAPI GetCloudClusterAllUrl is deprecated, please use ARMS::2019-08-08::GetRemoteWriteUrl instead.  * @param request  the request parameters of GetCloudClusterAllUrl  GetCloudClusterAllUrlRequest
     * @return GetCloudClusterAllUrlResponse
     */
    @Deprecated
    CompletableFuture<GetCloudClusterAllUrlResponse> getCloudClusterAllUrl(GetCloudClusterAllUrlRequest request);

    /**
     * @deprecated OpenAPI GetClusterAllUrl is deprecated, please use ARMS::2019-08-08::GetPrometheusInstance instead.  * @param request  the request parameters of GetClusterAllUrl  GetClusterAllUrlRequest
     * @return GetClusterAllUrlResponse
     */
    @Deprecated
    CompletableFuture<GetClusterAllUrlResponse> getClusterAllUrl(GetClusterAllUrlRequest request);

    /**
     * @param request the request parameters of GetCommercialStatus  GetCommercialStatusRequest
     * @return GetCommercialStatusResponse
     */
    CompletableFuture<GetCommercialStatusResponse> getCommercialStatus(GetCommercialStatusRequest request);

    /**
     * @param request the request parameters of GetExploreUrl  GetExploreUrlRequest
     * @return GetExploreUrlResponse
     */
    CompletableFuture<GetExploreUrlResponse> getExploreUrl(GetExploreUrlRequest request);

    /**
     * <b>description</b> :
     * <p>Note: The list returned by this operation includes the workspaces of Developer Edition, Expert Edition, and Advanced Edition. The list does not include the workspaces of Shared Edition.</p>
     * 
     * @param request the request parameters of GetGrafanaWorkspace  GetGrafanaWorkspaceRequest
     * @return GetGrafanaWorkspaceResponse
     */
    CompletableFuture<GetGrafanaWorkspaceResponse> getGrafanaWorkspace(GetGrafanaWorkspaceRequest request);

    /**
     * @deprecated OpenAPI GetIntegrationState is deprecated, please use ARMS::2019-08-08::DescribeAddonRelease instead.  * @param request  the request parameters of GetIntegrationState  GetIntegrationStateRequest
     * @return GetIntegrationStateResponse
     */
    @Deprecated
    CompletableFuture<GetIntegrationStateResponse> getIntegrationState(GetIntegrationStateRequest request);

    /**
     * @deprecated OpenAPI GetManagedPrometheusStatus is deprecated  * @param request  the request parameters of GetManagedPrometheusStatus  GetManagedPrometheusStatusRequest
     * @return GetManagedPrometheusStatusResponse
     */
    @Deprecated
    CompletableFuture<GetManagedPrometheusStatusResponse> getManagedPrometheusStatus(GetManagedPrometheusStatusRequest request);

    /**
     * @param request the request parameters of GetMultipleTrace  GetMultipleTraceRequest
     * @return GetMultipleTraceResponse
     */
    CompletableFuture<GetMultipleTraceResponse> getMultipleTrace(GetMultipleTraceRequest request);

    /**
     * @param request the request parameters of GetOnCallSchedulesDetail  GetOnCallSchedulesDetailRequest
     * @return GetOnCallSchedulesDetailResponse
     */
    CompletableFuture<GetOnCallSchedulesDetailResponse> getOnCallSchedulesDetail(GetOnCallSchedulesDetailRequest request);

    /**
     * <b>description</b> :
     * <p>None.</p>
     * 
     * @param request the request parameters of GetPrometheusApiToken  GetPrometheusApiTokenRequest
     * @return GetPrometheusApiTokenResponse
     */
    CompletableFuture<GetPrometheusApiTokenResponse> getPrometheusApiToken(GetPrometheusApiTokenRequest request);

    /**
     * @param request the request parameters of GetPrometheusGlobalView  GetPrometheusGlobalViewRequest
     * @return GetPrometheusGlobalViewResponse
     */
    CompletableFuture<GetPrometheusGlobalViewResponse> getPrometheusGlobalView(GetPrometheusGlobalViewRequest request);

    /**
     * @param request the request parameters of GetPrometheusInstance  GetPrometheusInstanceRequest
     * @return GetPrometheusInstanceResponse
     */
    CompletableFuture<GetPrometheusInstanceResponse> getPrometheusInstance(GetPrometheusInstanceRequest request);

    /**
     * @param request the request parameters of GetPrometheusIntegration  GetPrometheusIntegrationRequest
     * @return GetPrometheusIntegrationResponse
     */
    CompletableFuture<GetPrometheusIntegrationResponse> getPrometheusIntegration(GetPrometheusIntegrationRequest request);

    /**
     * @param request the request parameters of GetPrometheusMonitoring  GetPrometheusMonitoringRequest
     * @return GetPrometheusMonitoringResponse
     */
    CompletableFuture<GetPrometheusMonitoringResponse> getPrometheusMonitoring(GetPrometheusMonitoringRequest request);

    /**
     * @param request the request parameters of GetRecordingRule  GetRecordingRuleRequest
     * @return GetRecordingRuleResponse
     */
    CompletableFuture<GetRecordingRuleResponse> getRecordingRule(GetRecordingRuleRequest request);

    /**
     * @param request the request parameters of GetRetcodeAppByPid  GetRetcodeAppByPidRequest
     * @return GetRetcodeAppByPidResponse
     */
    CompletableFuture<GetRetcodeAppByPidResponse> getRetcodeAppByPid(GetRetcodeAppByPidRequest request);

    /**
     * @param request the request parameters of GetRetcodeDataByQuery  GetRetcodeDataByQueryRequest
     * @return GetRetcodeDataByQueryResponse
     */
    CompletableFuture<GetRetcodeDataByQueryResponse> getRetcodeDataByQuery(GetRetcodeDataByQueryRequest request);

    /**
     * @param request the request parameters of GetRetcodeLogstore  GetRetcodeLogstoreRequest
     * @return GetRetcodeLogstoreResponse
     */
    CompletableFuture<GetRetcodeLogstoreResponse> getRetcodeLogstore(GetRetcodeLogstoreRequest request);

    /**
     * @param request the request parameters of GetRetcodeShareUrl  GetRetcodeShareUrlRequest
     * @return GetRetcodeShareUrlResponse
     */
    CompletableFuture<GetRetcodeShareUrlResponse> getRetcodeShareUrl(GetRetcodeShareUrlRequest request);

    /**
     * <b>description</b> :
     * <p>Real User Monitoring (RUM) is available only in the China (Hangzhou), Singapore, and US (Silicon Valley) regions. Select the correct endpoint.</p>
     * 
     * @param request the request parameters of GetRumAppInfo  GetRumAppInfoRequest
     * @return GetRumAppInfoResponse
     */
    CompletableFuture<GetRumAppInfoResponse> getRumAppInfo(GetRumAppInfoRequest request);

    /**
     * <b>description</b> :
     * <p>Real User Monitoring (RUM) is available only in the China (Hangzhou), Singapore, and US (Silicon Valley) regions. Select the correct endpoint.</p>
     * 
     * @param request the request parameters of GetRumApps  GetRumAppsRequest
     * @return GetRumAppsResponse
     */
    CompletableFuture<GetRumAppsResponse> getRumApps(GetRumAppsRequest request);

    /**
     * <b>description</b> :
     * <p>Real User Monitoring (RUM) is available only in the China (Hangzhou), Singapore, and US (Silicon Valley) regions. Select the correct endpoint.</p>
     * 
     * @param request the request parameters of GetRumDataForPage  GetRumDataForPageRequest
     * @return GetRumDataForPageResponse
     */
    CompletableFuture<GetRumDataForPageResponse> getRumDataForPage(GetRumDataForPageRequest request);

    /**
     * <b>description</b> :
     * <p>Real User Monitoring (RUM) is available only in the China (Hangzhou), Singapore, and US (Silicon Valley) regions. Select the correct endpoint.</p>
     * 
     * @param request the request parameters of GetRumExceptionStack  GetRumExceptionStackRequest
     * @return GetRumExceptionStackResponse
     */
    CompletableFuture<GetRumExceptionStackResponse> getRumExceptionStack(GetRumExceptionStackRequest request);

    /**
     * <b>description</b> :
     * <p>You can query the usage data for the current day at any time. You can query the usage data for the previous day only after 8:00 today.</p>
     * 
     * @param request the request parameters of GetRumOcuStatisticData  GetRumOcuStatisticDataRequest
     * @return GetRumOcuStatisticDataResponse
     */
    CompletableFuture<GetRumOcuStatisticDataResponse> getRumOcuStatisticData(GetRumOcuStatisticDataRequest request);

    /**
     * <b>description</b> :
     * <p>Real User Monitoring (RUM) is available only in the China (Hangzhou), Singapore, and US (Silicon Valley) regions. Select the correct endpoint.</p>
     * 
     * @param request the request parameters of GetRumUploadFiles  GetRumUploadFilesRequest
     * @return GetRumUploadFilesResponse
     */
    CompletableFuture<GetRumUploadFilesResponse> getRumUploadFiles(GetRumUploadFilesRequest request);

    /**
     * @param request the request parameters of GetSourceMapInfo  GetSourceMapInfoRequest
     * @return GetSourceMapInfoResponse
     */
    CompletableFuture<GetSourceMapInfoResponse> getSourceMapInfo(GetSourceMapInfoRequest request);

    /**
     * @param request the request parameters of GetStack  GetStackRequest
     * @return GetStackResponse
     */
    CompletableFuture<GetStackResponse> getStack(GetStackRequest request);

    /**
     * @param request the request parameters of GetSyntheticMonitors  GetSyntheticMonitorsRequest
     * @return GetSyntheticMonitorsResponse
     */
    CompletableFuture<GetSyntheticMonitorsResponse> getSyntheticMonitors(GetSyntheticMonitorsRequest request);

    /**
     * @param request the request parameters of GetSyntheticTaskDetail  GetSyntheticTaskDetailRequest
     * @return GetSyntheticTaskDetailResponse
     */
    CompletableFuture<GetSyntheticTaskDetailResponse> getSyntheticTaskDetail(GetSyntheticTaskDetailRequest request);

    /**
     * @param request the request parameters of GetSyntheticTaskList  GetSyntheticTaskListRequest
     * @return GetSyntheticTaskListResponse
     */
    CompletableFuture<GetSyntheticTaskListResponse> getSyntheticTaskList(GetSyntheticTaskListRequest request);

    /**
     * @param request the request parameters of GetSyntheticTaskMonitors  GetSyntheticTaskMonitorsRequest
     * @return GetSyntheticTaskMonitorsResponse
     */
    CompletableFuture<GetSyntheticTaskMonitorsResponse> getSyntheticTaskMonitors(GetSyntheticTaskMonitorsRequest request);

    /**
     * @param request the request parameters of GetTimingSyntheticTask  GetTimingSyntheticTaskRequest
     * @return GetTimingSyntheticTaskResponse
     */
    CompletableFuture<GetTimingSyntheticTaskResponse> getTimingSyntheticTask(GetTimingSyntheticTaskRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You must use Application Real-Time Monitoring Service (ARMS) SDK for Java V2.7.24.</p>
     * </blockquote>
     * 
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
     * @param request the request parameters of GetTraceAppConfig  GetTraceAppConfigRequest
     * @return GetTraceAppConfigResponse
     */
    CompletableFuture<GetTraceAppConfigResponse> getTraceAppConfig(GetTraceAppConfigRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call the <strong>ImportAppAlertRules</strong> operation to import only the alert rules that are generated by Application Real-Time Monitoring Service (ARMS) for application monitoring and browser monitoring. This operation cannot be used to import custom alert rules, alert rules for Prometheus monitoring, or default emergency alert rules.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ImportAppAlertRules  ImportAppAlertRulesRequest
     * @return ImportAppAlertRulesResponse
     */
    CompletableFuture<ImportAppAlertRulesResponse> importAppAlertRules(ImportAppAlertRulesRequest request);

    /**
     * @param request the request parameters of InitEnvironment  InitEnvironmentRequest
     * @return InitEnvironmentResponse
     */
    CompletableFuture<InitEnvironmentResponse> initEnvironment(InitEnvironmentRequest request);

    /**
     * @param request the request parameters of InstallAddon  InstallAddonRequest
     * @return InstallAddonResponse
     */
    CompletableFuture<InstallAddonResponse> installAddon(InstallAddonRequest request);

    /**
     * @deprecated OpenAPI InstallCmsExporter is deprecated, please use ARMS::2019-08-08::InstallAddon instead.  * @param request  the request parameters of InstallCmsExporter  InstallCmsExporterRequest
     * @return InstallCmsExporterResponse
     */
    @Deprecated
    CompletableFuture<InstallCmsExporterResponse> installCmsExporter(InstallCmsExporterRequest request);

    /**
     * @param request the request parameters of InstallEnvironmentFeature  InstallEnvironmentFeatureRequest
     * @return InstallEnvironmentFeatureResponse
     */
    CompletableFuture<InstallEnvironmentFeatureResponse> installEnvironmentFeature(InstallEnvironmentFeatureRequest request);

    /**
     * @deprecated OpenAPI InstallManagedPrometheus is deprecated  * @description You can call this operation only if the following conditions are met: The resources that you want to monitor are ASK clusters or ECS clusters. No Prometheus agents are installed in the ASK or ECS clusters. Take note that Prometheus agents can be installed only on the cloud service side, not in user clusters.
     * 
     * @param request the request parameters of InstallManagedPrometheus  InstallManagedPrometheusRequest
     * @return InstallManagedPrometheusResponse
     */
    @Deprecated
    CompletableFuture<InstallManagedPrometheusResponse> installManagedPrometheus(InstallManagedPrometheusRequest request);

    /**
     * @param request the request parameters of ListActivatedAlerts  ListActivatedAlertsRequest
     * @return ListActivatedAlertsResponse
     */
    CompletableFuture<ListActivatedAlertsResponse> listActivatedAlerts(ListActivatedAlertsRequest request);

    /**
     * @param request the request parameters of ListAddonReleases  ListAddonReleasesRequest
     * @return ListAddonReleasesResponse
     */
    CompletableFuture<ListAddonReleasesResponse> listAddonReleases(ListAddonReleasesRequest request);

    /**
     * @param request the request parameters of ListAddons  ListAddonsRequest
     * @return ListAddonsResponse
     */
    CompletableFuture<ListAddonsResponse> listAddons(ListAddonsRequest request);

    /**
     * @param request the request parameters of ListAlertEvents  ListAlertEventsRequest
     * @return ListAlertEventsResponse
     */
    CompletableFuture<ListAlertEventsResponse> listAlertEvents(ListAlertEventsRequest request);

    /**
     * @param request the request parameters of ListAlerts  ListAlertsRequest
     * @return ListAlertsResponse
     */
    CompletableFuture<ListAlertsResponse> listAlerts(ListAlertsRequest request);

    /**
     * @param request the request parameters of ListClusterFromGrafana  ListClusterFromGrafanaRequest
     * @return ListClusterFromGrafanaResponse
     */
    CompletableFuture<ListClusterFromGrafanaResponse> listClusterFromGrafana(ListClusterFromGrafanaRequest request);

    /**
     * @deprecated OpenAPI ListCmsInstances is deprecated, please use ARMS::2019-08-08::ListEnvironmentAddons instead.  * @param request  the request parameters of ListCmsInstances  ListCmsInstancesRequest
     * @return ListCmsInstancesResponse
     */
    @Deprecated
    CompletableFuture<ListCmsInstancesResponse> listCmsInstances(ListCmsInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>None.</p>
     * 
     * @param request the request parameters of ListDashboards  ListDashboardsRequest
     * @return ListDashboardsResponse
     */
    CompletableFuture<ListDashboardsResponse> listDashboards(ListDashboardsRequest request);

    /**
     * @param request the request parameters of ListDashboardsByName  ListDashboardsByNameRequest
     * @return ListDashboardsByNameResponse
     */
    CompletableFuture<ListDashboardsByNameResponse> listDashboardsByName(ListDashboardsByNameRequest request);

    /**
     * <b>description</b> :
     * <p>The current API operation is no longer maintained. To query the notification policy information, call the ListNotificationPolicies operation instead.</p>
     * 
     * @param request the request parameters of ListDispatchRule  ListDispatchRuleRequest
     * @return ListDispatchRuleResponse
     */
    CompletableFuture<ListDispatchRuleResponse> listDispatchRule(ListDispatchRuleRequest request);

    /**
     * @param request the request parameters of ListEnvCustomJobs  ListEnvCustomJobsRequest
     * @return ListEnvCustomJobsResponse
     */
    CompletableFuture<ListEnvCustomJobsResponse> listEnvCustomJobs(ListEnvCustomJobsRequest request);

    /**
     * @param request the request parameters of ListEnvPodMonitors  ListEnvPodMonitorsRequest
     * @return ListEnvPodMonitorsResponse
     */
    CompletableFuture<ListEnvPodMonitorsResponse> listEnvPodMonitors(ListEnvPodMonitorsRequest request);

    /**
     * @param request the request parameters of ListEnvServiceMonitors  ListEnvServiceMonitorsRequest
     * @return ListEnvServiceMonitorsResponse
     */
    CompletableFuture<ListEnvServiceMonitorsResponse> listEnvServiceMonitors(ListEnvServiceMonitorsRequest request);

    /**
     * @param request the request parameters of ListEnvironmentAddons  ListEnvironmentAddonsRequest
     * @return ListEnvironmentAddonsResponse
     */
    CompletableFuture<ListEnvironmentAddonsResponse> listEnvironmentAddons(ListEnvironmentAddonsRequest request);

    /**
     * @param request the request parameters of ListEnvironmentAlertRules  ListEnvironmentAlertRulesRequest
     * @return ListEnvironmentAlertRulesResponse
     */
    CompletableFuture<ListEnvironmentAlertRulesResponse> listEnvironmentAlertRules(ListEnvironmentAlertRulesRequest request);

    /**
     * @param request the request parameters of ListEnvironmentDashboards  ListEnvironmentDashboardsRequest
     * @return ListEnvironmentDashboardsResponse
     */
    CompletableFuture<ListEnvironmentDashboardsResponse> listEnvironmentDashboards(ListEnvironmentDashboardsRequest request);

    /**
     * @param request the request parameters of ListEnvironmentFeatures  ListEnvironmentFeaturesRequest
     * @return ListEnvironmentFeaturesResponse
     */
    CompletableFuture<ListEnvironmentFeaturesResponse> listEnvironmentFeatures(ListEnvironmentFeaturesRequest request);

    /**
     * @param request the request parameters of ListEnvironmentKubeResources  ListEnvironmentKubeResourcesRequest
     * @return ListEnvironmentKubeResourcesResponse
     */
    CompletableFuture<ListEnvironmentKubeResourcesResponse> listEnvironmentKubeResources(ListEnvironmentKubeResourcesRequest request);

    /**
     * @param request the request parameters of ListEnvironmentMetricTargets  ListEnvironmentMetricTargetsRequest
     * @return ListEnvironmentMetricTargetsResponse
     */
    CompletableFuture<ListEnvironmentMetricTargetsResponse> listEnvironmentMetricTargets(ListEnvironmentMetricTargetsRequest request);

    /**
     * @param request the request parameters of ListEnvironments  ListEnvironmentsRequest
     * @return ListEnvironmentsResponse
     */
    CompletableFuture<ListEnvironmentsResponse> listEnvironments(ListEnvironmentsRequest request);

    /**
     * @param request the request parameters of ListEscalationPolicies  ListEscalationPoliciesRequest
     * @return ListEscalationPoliciesResponse
     */
    CompletableFuture<ListEscalationPoliciesResponse> listEscalationPolicies(ListEscalationPoliciesRequest request);

    /**
     * @param request the request parameters of ListEventBridgeIntegrations  ListEventBridgeIntegrationsRequest
     * @return ListEventBridgeIntegrationsResponse
     */
    CompletableFuture<ListEventBridgeIntegrationsResponse> listEventBridgeIntegrations(ListEventBridgeIntegrationsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The list returned by this operation includes the workspaces of Developer Edition, Expert Edition, and Advanced Edition. The list does not include the workspaces of Shared Edition.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListGrafanaWorkspace  ListGrafanaWorkspaceRequest
     * @return ListGrafanaWorkspaceResponse
     */
    CompletableFuture<ListGrafanaWorkspaceResponse> listGrafanaWorkspace(ListGrafanaWorkspaceRequest request);

    /**
     * @param request the request parameters of ListInsightsEvents  ListInsightsEventsRequest
     * @return ListInsightsEventsResponse
     */
    CompletableFuture<ListInsightsEventsResponse> listInsightsEvents(ListInsightsEventsRequest request);

    /**
     * @param request the request parameters of ListIntegration  ListIntegrationRequest
     * @return ListIntegrationResponse
     */
    CompletableFuture<ListIntegrationResponse> listIntegration(ListIntegrationRequest request);

    /**
     * @param request the request parameters of ListNotificationPolicies  ListNotificationPoliciesRequest
     * @return ListNotificationPoliciesResponse
     */
    CompletableFuture<ListNotificationPoliciesResponse> listNotificationPolicies(ListNotificationPoliciesRequest request);

    /**
     * @param request the request parameters of ListOnCallSchedules  ListOnCallSchedulesRequest
     * @return ListOnCallSchedulesResponse
     */
    CompletableFuture<ListOnCallSchedulesResponse> listOnCallSchedules(ListOnCallSchedulesRequest request);

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
     * @param request the request parameters of ListPrometheusGlobalView  ListPrometheusGlobalViewRequest
     * @return ListPrometheusGlobalViewResponse
     */
    CompletableFuture<ListPrometheusGlobalViewResponse> listPrometheusGlobalView(ListPrometheusGlobalViewRequest request);

    /**
     * @param request the request parameters of ListPrometheusInstanceByTagAndResourceGroupId  ListPrometheusInstanceByTagAndResourceGroupIdRequest
     * @return ListPrometheusInstanceByTagAndResourceGroupIdResponse
     */
    CompletableFuture<ListPrometheusInstanceByTagAndResourceGroupIdResponse> listPrometheusInstanceByTagAndResourceGroupId(ListPrometheusInstanceByTagAndResourceGroupIdRequest request);

    /**
     * @param request the request parameters of ListPrometheusInstances  ListPrometheusInstancesRequest
     * @return ListPrometheusInstancesResponse
     */
    CompletableFuture<ListPrometheusInstancesResponse> listPrometheusInstances(ListPrometheusInstancesRequest request);

    /**
     * @param request the request parameters of ListPrometheusIntegration  ListPrometheusIntegrationRequest
     * @return ListPrometheusIntegrationResponse
     */
    CompletableFuture<ListPrometheusIntegrationResponse> listPrometheusIntegration(ListPrometheusIntegrationRequest request);

    /**
     * @param request the request parameters of ListPrometheusMonitoring  ListPrometheusMonitoringRequest
     * @return ListPrometheusMonitoringResponse
     */
    CompletableFuture<ListPrometheusMonitoringResponse> listPrometheusMonitoring(ListPrometheusMonitoringRequest request);

    /**
     * <b>description</b> :
     * <hr>
     * 
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
     * @param request the request parameters of ListSilencePolicies  ListSilencePoliciesRequest
     * @return ListSilencePoliciesResponse
     */
    CompletableFuture<ListSilencePoliciesResponse> listSilencePolicies(ListSilencePoliciesRequest request);

    /**
     * @param request the request parameters of ListSyntheticDetail  ListSyntheticDetailRequest
     * @return ListSyntheticDetailResponse
     */
    CompletableFuture<ListSyntheticDetailResponse> listSyntheticDetail(ListSyntheticDetailRequest request);

    /**
     * @param request the request parameters of ListTimingSyntheticTasks  ListTimingSyntheticTasksRequest
     * @return ListTimingSyntheticTasksResponse
     */
    CompletableFuture<ListTimingSyntheticTasksResponse> listTimingSyntheticTasks(ListTimingSyntheticTasksRequest request);

    /**
     * @param request the request parameters of ListTraceApps  ListTraceAppsRequest
     * @return ListTraceAppsResponse
     */
    CompletableFuture<ListTraceAppsResponse> listTraceApps(ListTraceAppsRequest request);

    /**
     * @param request the request parameters of ManageGetRecordingRule  ManageGetRecordingRuleRequest
     * @return ManageGetRecordingRuleResponse
     */
    CompletableFuture<ManageGetRecordingRuleResponse> manageGetRecordingRule(ManageGetRecordingRuleRequest request);

    /**
     * @param request the request parameters of ManageRecordingRule  ManageRecordingRuleRequest
     * @return ManageRecordingRuleResponse
     */
    CompletableFuture<ManageRecordingRuleResponse> manageRecordingRule(ManageRecordingRuleRequest request);

    /**
     * @param request the request parameters of OpenArmsDefaultSLR  OpenArmsDefaultSLRRequest
     * @return OpenArmsDefaultSLRResponse
     */
    CompletableFuture<OpenArmsDefaultSLRResponse> openArmsDefaultSLR(OpenArmsDefaultSLRRequest request);

    /**
     * <b>description</b> :
     * <p>The <strong>OpenArmsServiceSecondVersion</strong> operation supports the following sub-service editions:</p>
     * <ul>
     * <li>Application Monitoring: Basic Edition</li>
     * <li>Browser Monitoring: Basic Edition</li>
     * <li>Synthetic Monitoring: Pro Edition (pay-as-you-go)</li>
     * <li>Prometheus Service: Pro Edition</li>
     * </ul>
     * 
     * @param request the request parameters of OpenArmsServiceSecondVersion  OpenArmsServiceSecondVersionRequest
     * @return OpenArmsServiceSecondVersionResponse
     */
    CompletableFuture<OpenArmsServiceSecondVersionResponse> openArmsServiceSecondVersion(OpenArmsServiceSecondVersionRequest request);

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
     * @param request the request parameters of QueryAppMetadata  QueryAppMetadataRequest
     * @return QueryAppMetadataResponse
     */
    CompletableFuture<QueryAppMetadataResponse> queryAppMetadata(QueryAppMetadataRequest request);

    /**
     * @param request the request parameters of QueryAppTopology  QueryAppTopologyRequest
     * @return QueryAppTopologyResponse
     */
    CompletableFuture<QueryAppTopologyResponse> queryAppTopology(QueryAppTopologyRequest request);

    /**
     * @param request the request parameters of QueryCommercialUsage  QueryCommercialUsageRequest
     * @return QueryCommercialUsageResponse
     */
    CompletableFuture<QueryCommercialUsageResponse> queryCommercialUsage(QueryCommercialUsageRequest request);

    /**
     * @param request the request parameters of QueryMetricByPage  QueryMetricByPageRequest
     * @return QueryMetricByPageResponse
     */
    CompletableFuture<QueryMetricByPageResponse> queryMetricByPage(QueryMetricByPageRequest request);

    /**
     * @param request the request parameters of QueryPromInstallStatus  QueryPromInstallStatusRequest
     * @return QueryPromInstallStatusResponse
     */
    CompletableFuture<QueryPromInstallStatusResponse> queryPromInstallStatus(QueryPromInstallStatusRequest request);

    /**
     * @param request the request parameters of QueryReleaseMetric  QueryReleaseMetricRequest
     * @return QueryReleaseMetricResponse
     */
    CompletableFuture<QueryReleaseMetricResponse> queryReleaseMetric(QueryReleaseMetricRequest request);

    /**
     * @param request the request parameters of RemoveAliClusterIdsFromPrometheusGlobalView  RemoveAliClusterIdsFromPrometheusGlobalViewRequest
     * @return RemoveAliClusterIdsFromPrometheusGlobalViewResponse
     */
    CompletableFuture<RemoveAliClusterIdsFromPrometheusGlobalViewResponse> removeAliClusterIdsFromPrometheusGlobalView(RemoveAliClusterIdsFromPrometheusGlobalViewRequest request);

    /**
     * @param request the request parameters of RemoveSourcesFromPrometheusGlobalView  RemoveSourcesFromPrometheusGlobalViewRequest
     * @return RemoveSourcesFromPrometheusGlobalViewResponse
     */
    CompletableFuture<RemoveSourcesFromPrometheusGlobalViewResponse> removeSourcesFromPrometheusGlobalView(RemoveSourcesFromPrometheusGlobalViewRequest request);

    /**
     * @param request the request parameters of RestartEnvironmentFeature  RestartEnvironmentFeatureRequest
     * @return RestartEnvironmentFeatureResponse
     */
    CompletableFuture<RestartEnvironmentFeatureResponse> restartEnvironmentFeature(RestartEnvironmentFeatureRequest request);

    /**
     * @param request the request parameters of SaveTraceAppConfig  SaveTraceAppConfigRequest
     * @return SaveTraceAppConfigResponse
     */
    CompletableFuture<SaveTraceAppConfigResponse> saveTraceAppConfig(SaveTraceAppConfigRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is no longer maintained. To query alert contacts, call the DescribeContacts operation provided by the new version of Alert Management.</p>
     * 
     * @param request the request parameters of SearchAlertContact  SearchAlertContactRequest
     * @return SearchAlertContactResponse
     */
    CompletableFuture<SearchAlertContactResponse> searchAlertContact(SearchAlertContactRequest request);

    /**
     * <b>description</b> :
     * <p>The operation is no longer maintained. Call the DescribeContactGroups operation in the alert management module to query alert contact groups.</p>
     * 
     * @param request the request parameters of SearchAlertContactGroup  SearchAlertContactGroupRequest
     * @return SearchAlertContactGroupResponse
     */
    CompletableFuture<SearchAlertContactGroupResponse> searchAlertContactGroup(SearchAlertContactGroupRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is no longer maintained. To query alert records, call the ListAlerts operation provided by the new version of Alert Management.</p>
     * 
     * @param request the request parameters of SearchAlertHistories  SearchAlertHistoriesRequest
     * @return SearchAlertHistoriesResponse
     */
    CompletableFuture<SearchAlertHistoriesResponse> searchAlertHistories(SearchAlertHistoriesRequest request);

    /**
     * <b>description</b> :
     * <p>The current operation is no longer maintained. You can call the GetAlertRules operation of Alert Management (New) to query existing alert rules.</p>
     * 
     * @param request the request parameters of SearchAlertRules  SearchAlertRulesRequest
     * @return SearchAlertRulesResponse
     */
    CompletableFuture<SearchAlertRulesResponse> searchAlertRules(SearchAlertRulesRequest request);

    /**
     * <b>description</b> :
     * <p>Alert event records are different from alert notification records. Alert events are recorded every minute after an alert rule filters data. Alert events can be classified based on whether they are triggered or not. If a triggered event is not in the silence period, an alert notification is sent.</p>
     * 
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
     * <b>description</b> :
     * <blockquote>
     * <p>A maximum of 100 data entries can be returned each time this operation is called. If you want to query all existing traces, we recommend that you call the SearchTracesByPage operation. For more information, see <a href="https://help.aliyun.com/document_detail/175866.html">SearchTracesByPage</a>.</p>
     * </blockquote>
     * 
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
     * <b>description</b> :
     * <p>After you receive the text message, verify the mobile number as prompted. Before you can specify a mobile phone number in a notification policy, you must verify the mobile phone number.</p>
     * 
     * @param request the request parameters of SendTTSVerifyLink  SendTTSVerifyLinkRequest
     * @return SendTTSVerifyLinkResponse
     */
    CompletableFuture<SendTTSVerifyLinkResponse> sendTTSVerifyLink(SendTTSVerifyLinkRequest request);

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
     * @param request the request parameters of StartTimingSyntheticTask  StartTimingSyntheticTaskRequest
     * @return StartTimingSyntheticTaskResponse
     */
    CompletableFuture<StartTimingSyntheticTaskResponse> startTimingSyntheticTask(StartTimingSyntheticTaskRequest request);

    /**
     * @param request the request parameters of StopAlert  StopAlertRequest
     * @return StopAlertResponse
     */
    CompletableFuture<StopAlertResponse> stopAlert(StopAlertRequest request);

    /**
     * @param request the request parameters of StopTimingSyntheticTask  StopTimingSyntheticTaskRequest
     * @return StopTimingSyntheticTaskResponse
     */
    CompletableFuture<StopTimingSyntheticTaskResponse> stopTimingSyntheticTask(StopTimingSyntheticTaskRequest request);

    /**
     * @param request the request parameters of SwitchSyntheticTaskStatus  SwitchSyntheticTaskStatusRequest
     * @return SwitchSyntheticTaskStatusResponse
     */
    CompletableFuture<SwitchSyntheticTaskStatusResponse> switchSyntheticTaskStatus(SwitchSyntheticTaskStatusRequest request);

    /**
     * @param request the request parameters of SyncRecordingRules  SyncRecordingRulesRequest
     * @return SyncRecordingRulesResponse
     */
    CompletableFuture<SyncRecordingRulesResponse> syncRecordingRules(SyncRecordingRulesRequest request);

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @deprecated OpenAPI UninstallManagedPrometheus is deprecated  * @description This operation is available only for ASK, ECS, and ACK One clusters. Before you call this operation, make sure that a managed Prometheus agent is installed for your cluster.
     * 
     * @param request the request parameters of UninstallManagedPrometheus  UninstallManagedPrometheusRequest
     * @return UninstallManagedPrometheusResponse
     */
    @Deprecated
    CompletableFuture<UninstallManagedPrometheusResponse> uninstallManagedPrometheus(UninstallManagedPrometheusRequest request);

    /**
     * @param request the request parameters of UninstallPromCluster  UninstallPromClusterRequest
     * @return UninstallPromClusterResponse
     */
    CompletableFuture<UninstallPromClusterResponse> uninstallPromCluster(UninstallPromClusterRequest request);

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is no longer maintained. To create or modify an alert contact, call the CreateOrUpdateContact operation provided by the new version of Alert Management.</p>
     * 
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
     * @param request the request parameters of UpdateDispatchRule  UpdateDispatchRuleRequest
     * @return UpdateDispatchRuleResponse
     */
    CompletableFuture<UpdateDispatchRuleResponse> updateDispatchRule(UpdateDispatchRuleRequest request);

    /**
     * @param request the request parameters of UpdateEnvCustomJob  UpdateEnvCustomJobRequest
     * @return UpdateEnvCustomJobResponse
     */
    CompletableFuture<UpdateEnvCustomJobResponse> updateEnvCustomJob(UpdateEnvCustomJobRequest request);

    /**
     * @param request the request parameters of UpdateEnvPodMonitor  UpdateEnvPodMonitorRequest
     * @return UpdateEnvPodMonitorResponse
     */
    CompletableFuture<UpdateEnvPodMonitorResponse> updateEnvPodMonitor(UpdateEnvPodMonitorRequest request);

    /**
     * @param request the request parameters of UpdateEnvServiceMonitor  UpdateEnvServiceMonitorRequest
     * @return UpdateEnvServiceMonitorResponse
     */
    CompletableFuture<UpdateEnvServiceMonitorResponse> updateEnvServiceMonitor(UpdateEnvServiceMonitorRequest request);

    /**
     * @param request the request parameters of UpdateEnvironment  UpdateEnvironmentRequest
     * @return UpdateEnvironmentResponse
     */
    CompletableFuture<UpdateEnvironmentResponse> updateEnvironment(UpdateEnvironmentRequest request);

    /**
     * @param request the request parameters of UpdateGrafanaWorkspace  UpdateGrafanaWorkspaceRequest
     * @return UpdateGrafanaWorkspaceResponse
     */
    CompletableFuture<UpdateGrafanaWorkspaceResponse> updateGrafanaWorkspace(UpdateGrafanaWorkspaceRequest request);

    /**
     * <b>description</b> :
     * <p>Note: The list returned by this operation includes the workspaces of Developer Edition, Expert Edition, and Advanced Edition. The list does not include the workspaces of Shared Edition.</p>
     * 
     * @param request the request parameters of UpdateGrafanaWorkspaceVersion  UpdateGrafanaWorkspaceVersionRequest
     * @return UpdateGrafanaWorkspaceVersionResponse
     */
    CompletableFuture<UpdateGrafanaWorkspaceVersionResponse> updateGrafanaWorkspaceVersion(UpdateGrafanaWorkspaceVersionRequest request);

    /**
     * @param request the request parameters of UpdateIntegration  UpdateIntegrationRequest
     * @return UpdateIntegrationResponse
     */
    CompletableFuture<UpdateIntegrationResponse> updateIntegration(UpdateIntegrationRequest request);

    /**
     * @param request the request parameters of UpdateMetricDrop  UpdateMetricDropRequest
     * @return UpdateMetricDropResponse
     */
    CompletableFuture<UpdateMetricDropResponse> updateMetricDrop(UpdateMetricDropRequest request);

    /**
     * @param request the request parameters of UpdatePrometheusAlertRule  UpdatePrometheusAlertRuleRequest
     * @return UpdatePrometheusAlertRuleResponse
     */
    CompletableFuture<UpdatePrometheusAlertRuleResponse> updatePrometheusAlertRule(UpdatePrometheusAlertRuleRequest request);

    /**
     * @param request the request parameters of UpdatePrometheusGlobalView  UpdatePrometheusGlobalViewRequest
     * @return UpdatePrometheusGlobalViewResponse
     */
    CompletableFuture<UpdatePrometheusGlobalViewResponse> updatePrometheusGlobalView(UpdatePrometheusGlobalViewRequest request);

    /**
     * @param request the request parameters of UpdatePrometheusInstance  UpdatePrometheusInstanceRequest
     * @return UpdatePrometheusInstanceResponse
     */
    CompletableFuture<UpdatePrometheusInstanceResponse> updatePrometheusInstance(UpdatePrometheusInstanceRequest request);

    /**
     * @param request the request parameters of UpdatePrometheusIntegration  UpdatePrometheusIntegrationRequest
     * @return UpdatePrometheusIntegrationResponse
     */
    CompletableFuture<UpdatePrometheusIntegrationResponse> updatePrometheusIntegration(UpdatePrometheusIntegrationRequest request);

    /**
     * @param request the request parameters of UpdatePrometheusMonitoring  UpdatePrometheusMonitoringRequest
     * @return UpdatePrometheusMonitoringResponse
     */
    CompletableFuture<UpdatePrometheusMonitoringResponse> updatePrometheusMonitoring(UpdatePrometheusMonitoringRequest request);

    /**
     * @param request the request parameters of UpdatePrometheusMonitoringStatus  UpdatePrometheusMonitoringStatusRequest
     * @return UpdatePrometheusMonitoringStatusResponse
     */
    CompletableFuture<UpdatePrometheusMonitoringStatusResponse> updatePrometheusMonitoringStatus(UpdatePrometheusMonitoringStatusRequest request);

    /**
     * <b>description</b> :
     * <p>Real User Monitoring (RUM) is available only in the China (Hangzhou), Singapore, and US (Silicon Valley) regions. Select the correct endpoint.</p>
     * 
     * @param request the request parameters of UpdateRumApp  UpdateRumAppRequest
     * @return UpdateRumAppResponse
     */
    CompletableFuture<UpdateRumAppResponse> updateRumApp(UpdateRumAppRequest request);

    /**
     * <b>description</b> :
     * <p>Real User Monitoring (RUM) is available only in the China (Hangzhou), Singapore, and US (Silicon Valley) regions. Select the correct endpoint.</p>
     * 
     * @param request the request parameters of UpdateRumFileStatus  UpdateRumFileStatusRequest
     * @return UpdateRumFileStatusResponse
     */
    CompletableFuture<UpdateRumFileStatusResponse> updateRumFileStatus(UpdateRumFileStatusRequest request);

    /**
     * @param request the request parameters of UpdateTimingSyntheticTask  UpdateTimingSyntheticTaskRequest
     * @return UpdateTimingSyntheticTaskResponse
     */
    CompletableFuture<UpdateTimingSyntheticTaskResponse> updateTimingSyntheticTask(UpdateTimingSyntheticTaskRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is no longer maintained. Call the CreateOrUpdateWebhookContact operation in the new alter management module to create or modify a webhook alert contact.</p>
     * 
     * @param request the request parameters of UpdateWebhook  UpdateWebhookRequest
     * @return UpdateWebhookResponse
     */
    CompletableFuture<UpdateWebhookResponse> updateWebhook(UpdateWebhookRequest request);

    /**
     * @param request the request parameters of UpgradeAddonRelease  UpgradeAddonReleaseRequest
     * @return UpgradeAddonReleaseResponse
     */
    CompletableFuture<UpgradeAddonReleaseResponse> upgradeAddonRelease(UpgradeAddonReleaseRequest request);

    /**
     * @param request the request parameters of UpgradeEnvironmentFeature  UpgradeEnvironmentFeatureRequest
     * @return UpgradeEnvironmentFeatureResponse
     */
    CompletableFuture<UpgradeEnvironmentFeatureResponse> upgradeEnvironmentFeature(UpgradeEnvironmentFeatureRequest request);

    /**
     * @param request the request parameters of Upload  UploadRequest
     * @return UploadResponse
     */
    CompletableFuture<UploadResponse> upload(UploadRequest request);

}
