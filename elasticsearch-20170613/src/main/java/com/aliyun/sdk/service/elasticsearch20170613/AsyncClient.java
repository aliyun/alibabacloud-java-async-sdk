// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.elasticsearch20170613.models.*;
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

    CompletableFuture<ActivateZonesResponse> activateZones(ActivateZonesRequest request);

    CompletableFuture<AddConnectableClusterResponse> addConnectableCluster(AddConnectableClusterRequest request);

    CompletableFuture<AddSnapshotRepoResponse> addSnapshotRepo(AddSnapshotRepoRequest request);

    CompletableFuture<CancelDeletionResponse> cancelDeletion(CancelDeletionRequest request);

    CompletableFuture<CancelLogstashDeletionResponse> cancelLogstashDeletion(CancelLogstashDeletionRequest request);

    CompletableFuture<CancelTaskResponse> cancelTask(CancelTaskRequest request);

    CompletableFuture<CapacityPlanResponse> capacityPlan(CapacityPlanRequest request);

    CompletableFuture<CloseDiagnosisResponse> closeDiagnosis(CloseDiagnosisRequest request);

    CompletableFuture<CloseHttpsResponse> closeHttps(CloseHttpsRequest request);

    CompletableFuture<CloseManagedIndexResponse> closeManagedIndex(CloseManagedIndexRequest request);

    CompletableFuture<CreateCollectorResponse> createCollector(CreateCollectorRequest request);

    CompletableFuture<CreateComponentIndexResponse> createComponentIndex(CreateComponentIndexRequest request);

    CompletableFuture<CreateDataStreamResponse> createDataStream(CreateDataStreamRequest request);

    CompletableFuture<CreateDataTasksResponse> createDataTasks(CreateDataTasksRequest request);

    CompletableFuture<CreateILMPolicyResponse> createILMPolicy(CreateILMPolicyRequest request);

    CompletableFuture<CreateIndexTemplateResponse> createIndexTemplate(CreateIndexTemplateRequest request);

    CompletableFuture<CreateLogstashResponse> createLogstash(CreateLogstashRequest request);

    CompletableFuture<CreatePipelinesResponse> createPipelines(CreatePipelinesRequest request);

    CompletableFuture<CreateSnapshotResponse> createSnapshot(CreateSnapshotRequest request);

    CompletableFuture<CreateVpcEndpointResponse> createVpcEndpoint(CreateVpcEndpointRequest request);

    CompletableFuture<DeactivateZonesResponse> deactivateZones(DeactivateZonesRequest request);

    CompletableFuture<DeleteCollectorResponse> deleteCollector(DeleteCollectorRequest request);

    CompletableFuture<DeleteComponentIndexResponse> deleteComponentIndex(DeleteComponentIndexRequest request);

    CompletableFuture<DeleteConnectedClusterResponse> deleteConnectedCluster(DeleteConnectedClusterRequest request);

    CompletableFuture<DeleteDataStreamResponse> deleteDataStream(DeleteDataStreamRequest request);

    CompletableFuture<DeleteDataTaskResponse> deleteDataTask(DeleteDataTaskRequest request);

    CompletableFuture<DeleteDeprecatedTemplateResponse> deleteDeprecatedTemplate(DeleteDeprecatedTemplateRequest request);

    CompletableFuture<DeleteILMPolicyResponse> deleteILMPolicy(DeleteILMPolicyRequest request);

    CompletableFuture<DeleteIndexTemplateResponse> deleteIndexTemplate(DeleteIndexTemplateRequest request);

    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    CompletableFuture<DeleteLogstashResponse> deleteLogstash(DeleteLogstashRequest request);

    CompletableFuture<DeletePipelinesResponse> deletePipelines(DeletePipelinesRequest request);

    CompletableFuture<DeleteSnapshotRepoResponse> deleteSnapshotRepo(DeleteSnapshotRepoRequest request);

    CompletableFuture<DeleteVpcEndpointResponse> deleteVpcEndpoint(DeleteVpcEndpointRequest request);

    CompletableFuture<DescribeAckOperatorResponse> describeAckOperator(DescribeAckOperatorRequest request);

    CompletableFuture<DescribeApmResponse> describeApm(DescribeApmRequest request);

    CompletableFuture<DescribeCollectorResponse> describeCollector(DescribeCollectorRequest request);

    CompletableFuture<DescribeComponentIndexResponse> describeComponentIndex(DescribeComponentIndexRequest request);

    CompletableFuture<DescribeConnectableClustersResponse> describeConnectableClusters(DescribeConnectableClustersRequest request);

    CompletableFuture<DescribeDeprecatedTemplateResponse> describeDeprecatedTemplate(DescribeDeprecatedTemplateRequest request);

    CompletableFuture<DescribeDiagnoseReportResponse> describeDiagnoseReport(DescribeDiagnoseReportRequest request);

    CompletableFuture<DescribeDiagnosisSettingsResponse> describeDiagnosisSettings(DescribeDiagnosisSettingsRequest request);

    CompletableFuture<DescribeDynamicSettingsResponse> describeDynamicSettings(DescribeDynamicSettingsRequest request);

    CompletableFuture<DescribeElasticsearchHealthResponse> describeElasticsearchHealth(DescribeElasticsearchHealthRequest request);

    CompletableFuture<DescribeILMPolicyResponse> describeILMPolicy(DescribeILMPolicyRequest request);

    CompletableFuture<DescribeIndexTemplateResponse> describeIndexTemplate(DescribeIndexTemplateRequest request);

    CompletableFuture<DescribeInstanceResponse> describeInstance(DescribeInstanceRequest request);

    CompletableFuture<DescribeKibanaSettingsResponse> describeKibanaSettings(DescribeKibanaSettingsRequest request);

    CompletableFuture<DescribeLogstashResponse> describeLogstash(DescribeLogstashRequest request);

    CompletableFuture<DescribePipelineResponse> describePipeline(DescribePipelineRequest request);

    CompletableFuture<DescribePipelineManagementConfigResponse> describePipelineManagementConfig(DescribePipelineManagementConfigRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeSnapshotSettingResponse> describeSnapshotSetting(DescribeSnapshotSettingRequest request);

    CompletableFuture<DescribeTemplatesResponse> describeTemplates(DescribeTemplatesRequest request);

    CompletableFuture<DescribeXpackMonitorConfigResponse> describeXpackMonitorConfig(DescribeXpackMonitorConfigRequest request);

    CompletableFuture<DiagnoseInstanceResponse> diagnoseInstance(DiagnoseInstanceRequest request);

    CompletableFuture<EstimatedLogstashRestartTimeResponse> estimatedLogstashRestartTime(EstimatedLogstashRestartTimeRequest request);

    CompletableFuture<EstimatedRestartTimeResponse> estimatedRestartTime(EstimatedRestartTimeRequest request);

    CompletableFuture<GetClusterDataInformationResponse> getClusterDataInformation(GetClusterDataInformationRequest request);

    CompletableFuture<GetElastictaskResponse> getElastictask(GetElastictaskRequest request);

    CompletableFuture<GetEmonGrafanaAlertsResponse> getEmonGrafanaAlerts(GetEmonGrafanaAlertsRequest request);

    CompletableFuture<GetEmonGrafanaDashboardsResponse> getEmonGrafanaDashboards(GetEmonGrafanaDashboardsRequest request);

    CompletableFuture<GetEmonMonitorDataResponse> getEmonMonitorData(GetEmonMonitorDataRequest request);

    CompletableFuture<GetOpenStoreUsageResponse> getOpenStoreUsage(GetOpenStoreUsageRequest request);

    CompletableFuture<GetRegionConfigurationResponse> getRegionConfiguration(GetRegionConfigurationRequest request);

    CompletableFuture<GetSuggestShrinkableNodesResponse> getSuggestShrinkableNodes(GetSuggestShrinkableNodesRequest request);

    CompletableFuture<GetTransferableNodesResponse> getTransferableNodes(GetTransferableNodesRequest request);

    CompletableFuture<InitializeOperationRoleResponse> initializeOperationRole(InitializeOperationRoleRequest request);

    CompletableFuture<InstallAckOperatorResponse> installAckOperator(InstallAckOperatorRequest request);

    CompletableFuture<InstallKibanaSystemPluginResponse> installKibanaSystemPlugin(InstallKibanaSystemPluginRequest request);

    CompletableFuture<InstallLogstashSystemPluginResponse> installLogstashSystemPlugin(InstallLogstashSystemPluginRequest request);

    CompletableFuture<InstallSystemPluginResponse> installSystemPlugin(InstallSystemPluginRequest request);

    CompletableFuture<InstallUserPluginsResponse> installUserPlugins(InstallUserPluginsRequest request);

    CompletableFuture<InterruptElasticsearchTaskResponse> interruptElasticsearchTask(InterruptElasticsearchTaskRequest request);

    CompletableFuture<InterruptLogstashTaskResponse> interruptLogstashTask(InterruptLogstashTaskRequest request);

    CompletableFuture<ListAckClustersResponse> listAckClusters(ListAckClustersRequest request);

    CompletableFuture<ListAckNamespacesResponse> listAckNamespaces(ListAckNamespacesRequest request);

    CompletableFuture<ListActionRecordsResponse> listActionRecords(ListActionRecordsRequest request);

    CompletableFuture<ListAllNodeResponse> listAllNode(ListAllNodeRequest request);

    CompletableFuture<ListAlternativeSnapshotReposResponse> listAlternativeSnapshotRepos(ListAlternativeSnapshotReposRequest request);

    CompletableFuture<ListApmResponse> listApm(ListApmRequest request);

    CompletableFuture<ListAvailableEsInstanceIdsResponse> listAvailableEsInstanceIds(ListAvailableEsInstanceIdsRequest request);

    CompletableFuture<ListCollectorsResponse> listCollectors(ListCollectorsRequest request);

    CompletableFuture<ListComponentIndicesResponse> listComponentIndices(ListComponentIndicesRequest request);

    CompletableFuture<ListConnectedClustersResponse> listConnectedClusters(ListConnectedClustersRequest request);

    CompletableFuture<ListDataStreamsResponse> listDataStreams(ListDataStreamsRequest request);

    CompletableFuture<ListDataTasksResponse> listDataTasks(ListDataTasksRequest request);

    CompletableFuture<ListDefaultCollectorConfigurationsResponse> listDefaultCollectorConfigurations(ListDefaultCollectorConfigurationsRequest request);

    CompletableFuture<ListDeprecatedTemplatesResponse> listDeprecatedTemplates(ListDeprecatedTemplatesRequest request);

    CompletableFuture<ListDiagnoseIndicesResponse> listDiagnoseIndices(ListDiagnoseIndicesRequest request);

    CompletableFuture<ListDiagnoseReportResponse> listDiagnoseReport(ListDiagnoseReportRequest request);

    CompletableFuture<ListDiagnoseReportIdsResponse> listDiagnoseReportIds(ListDiagnoseReportIdsRequest request);

    CompletableFuture<ListDictInformationResponse> listDictInformation(ListDictInformationRequest request);

    CompletableFuture<ListDictsResponse> listDicts(ListDictsRequest request);

    CompletableFuture<ListEcsInstancesResponse> listEcsInstances(ListEcsInstancesRequest request);

    CompletableFuture<ListExtendfilesResponse> listExtendfiles(ListExtendfilesRequest request);

    CompletableFuture<ListILMPoliciesResponse> listILMPolicies(ListILMPoliciesRequest request);

    CompletableFuture<ListIndexTemplatesResponse> listIndexTemplates(ListIndexTemplatesRequest request);

    CompletableFuture<ListInstanceResponse> listInstance(ListInstanceRequest request);

    CompletableFuture<ListInstanceHistoryEventsResponse> listInstanceHistoryEvents(ListInstanceHistoryEventsRequest request);

    CompletableFuture<ListInstanceIndicesResponse> listInstanceIndices(ListInstanceIndicesRequest request);

    CompletableFuture<ListKibanaPluginsResponse> listKibanaPlugins(ListKibanaPluginsRequest request);

    CompletableFuture<ListLogstashResponse> listLogstash(ListLogstashRequest request);

    CompletableFuture<ListLogstashLogResponse> listLogstashLog(ListLogstashLogRequest request);

    CompletableFuture<ListLogstashPluginsResponse> listLogstashPlugins(ListLogstashPluginsRequest request);

    CompletableFuture<ListNodesResponse> listNodes(ListNodesRequest request);

    CompletableFuture<ListPipelineResponse> listPipeline(ListPipelineRequest request);

    CompletableFuture<ListPipelineIdsResponse> listPipelineIds(ListPipelineIdsRequest request);

    CompletableFuture<ListPluginsResponse> listPlugins(ListPluginsRequest request);

    CompletableFuture<ListSearchLogResponse> listSearchLog(ListSearchLogRequest request);

    CompletableFuture<ListShardRecoveriesResponse> listShardRecoveries(ListShardRecoveriesRequest request);

    CompletableFuture<ListSnapshotReposByInstanceIdResponse> listSnapshotReposByInstanceId(ListSnapshotReposByInstanceIdRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ListTagsResponse> listTags(ListTagsRequest request);

    CompletableFuture<ListVpcEndpointsResponse> listVpcEndpoints(ListVpcEndpointsRequest request);

    CompletableFuture<MigrateToOtherZoneResponse> migrateToOtherZone(MigrateToOtherZoneRequest request);

    CompletableFuture<ModifyDeployMachineResponse> modifyDeployMachine(ModifyDeployMachineRequest request);

    CompletableFuture<ModifyElastictaskResponse> modifyElastictask(ModifyElastictaskRequest request);

    CompletableFuture<ModifyInstanceMaintainTimeResponse> modifyInstanceMaintainTime(ModifyInstanceMaintainTimeRequest request);

    CompletableFuture<ModifyWhiteIpsResponse> modifyWhiteIps(ModifyWhiteIpsRequest request);

    CompletableFuture<MoveResourceGroupResponse> moveResourceGroup(MoveResourceGroupRequest request);

    CompletableFuture<OpenDiagnosisResponse> openDiagnosis(OpenDiagnosisRequest request);

    CompletableFuture<OpenHttpsResponse> openHttps(OpenHttpsRequest request);

    CompletableFuture<PostEmonTryAlarmRuleResponse> postEmonTryAlarmRule(PostEmonTryAlarmRuleRequest request);

    CompletableFuture<RecommendTemplatesResponse> recommendTemplates(RecommendTemplatesRequest request);

    CompletableFuture<ReinstallCollectorResponse> reinstallCollector(ReinstallCollectorRequest request);

    CompletableFuture<RemoveApmResponse> removeApm(RemoveApmRequest request);

    CompletableFuture<RenewInstanceResponse> renewInstance(RenewInstanceRequest request);

    CompletableFuture<RenewLogstashResponse> renewLogstash(RenewLogstashRequest request);

    CompletableFuture<RestartCollectorResponse> restartCollector(RestartCollectorRequest request);

    CompletableFuture<RestartInstanceResponse> restartInstance(RestartInstanceRequest request);

    CompletableFuture<RestartLogstashResponse> restartLogstash(RestartLogstashRequest request);

    CompletableFuture<ResumeElasticsearchTaskResponse> resumeElasticsearchTask(ResumeElasticsearchTaskRequest request);

    CompletableFuture<ResumeLogstashTaskResponse> resumeLogstashTask(ResumeLogstashTaskRequest request);

    CompletableFuture<RolloverDataStreamResponse> rolloverDataStream(RolloverDataStreamRequest request);

    CompletableFuture<RunPipelinesResponse> runPipelines(RunPipelinesRequest request);

    CompletableFuture<ShrinkNodeResponse> shrinkNode(ShrinkNodeRequest request);

    CompletableFuture<StartApmResponse> startApm(StartApmRequest request);

    CompletableFuture<StartCollectorResponse> startCollector(StartCollectorRequest request);

    CompletableFuture<StopApmResponse> stopApm(StopApmRequest request);

    CompletableFuture<StopCollectorResponse> stopCollector(StopCollectorRequest request);

    CompletableFuture<StopPipelinesResponse> stopPipelines(StopPipelinesRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<TransferNodeResponse> transferNode(TransferNodeRequest request);

    CompletableFuture<TriggerNetworkResponse> triggerNetwork(TriggerNetworkRequest request);

    CompletableFuture<UninstallKibanaPluginResponse> uninstallKibanaPlugin(UninstallKibanaPluginRequest request);

    CompletableFuture<UninstallLogstashPluginResponse> uninstallLogstashPlugin(UninstallLogstashPluginRequest request);

    CompletableFuture<UninstallPluginResponse> uninstallPlugin(UninstallPluginRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpdateAdminPasswordResponse> updateAdminPassword(UpdateAdminPasswordRequest request);

    CompletableFuture<UpdateAdvancedSettingResponse> updateAdvancedSetting(UpdateAdvancedSettingRequest request);

    CompletableFuture<UpdateAliwsDictResponse> updateAliwsDict(UpdateAliwsDictRequest request);

    CompletableFuture<UpdateApmResponse> updateApm(UpdateApmRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<UpdateBlackIpsResponse> updateBlackIps(UpdateBlackIpsRequest request);

    CompletableFuture<UpdateCollectorResponse> updateCollector(UpdateCollectorRequest request);

    CompletableFuture<UpdateCollectorNameResponse> updateCollectorName(UpdateCollectorNameRequest request);

    CompletableFuture<UpdateComponentIndexResponse> updateComponentIndex(UpdateComponentIndexRequest request);

    CompletableFuture<UpdateDescriptionResponse> updateDescription(UpdateDescriptionRequest request);

    CompletableFuture<UpdateDiagnosisSettingsResponse> updateDiagnosisSettings(UpdateDiagnosisSettingsRequest request);

    CompletableFuture<UpdateDictResponse> updateDict(UpdateDictRequest request);

    CompletableFuture<UpdateDynamicSettingsResponse> updateDynamicSettings(UpdateDynamicSettingsRequest request);

    CompletableFuture<UpdateExtendConfigResponse> updateExtendConfig(UpdateExtendConfigRequest request);

    CompletableFuture<UpdateExtendfilesResponse> updateExtendfiles(UpdateExtendfilesRequest request);

    CompletableFuture<UpdateHotIkDictsResponse> updateHotIkDicts(UpdateHotIkDictsRequest request);

    CompletableFuture<UpdateILMPolicyResponse> updateILMPolicy(UpdateILMPolicyRequest request);

    CompletableFuture<UpdateIndexTemplateResponse> updateIndexTemplate(UpdateIndexTemplateRequest request);

    CompletableFuture<UpdateInstanceResponse> updateInstance(UpdateInstanceRequest request);

    CompletableFuture<UpdateInstanceChargeTypeResponse> updateInstanceChargeType(UpdateInstanceChargeTypeRequest request);

    CompletableFuture<UpdateInstanceSettingsResponse> updateInstanceSettings(UpdateInstanceSettingsRequest request);

    CompletableFuture<UpdateKibanaSettingsResponse> updateKibanaSettings(UpdateKibanaSettingsRequest request);

    CompletableFuture<UpdateKibanaWhiteIpsResponse> updateKibanaWhiteIps(UpdateKibanaWhiteIpsRequest request);

    CompletableFuture<UpdateLogstashResponse> updateLogstash(UpdateLogstashRequest request);

    CompletableFuture<UpdateLogstashChargeTypeResponse> updateLogstashChargeType(UpdateLogstashChargeTypeRequest request);

    CompletableFuture<UpdateLogstashDescriptionResponse> updateLogstashDescription(UpdateLogstashDescriptionRequest request);

    CompletableFuture<UpdateLogstashSettingsResponse> updateLogstashSettings(UpdateLogstashSettingsRequest request);

    CompletableFuture<UpdatePipelineManagementConfigResponse> updatePipelineManagementConfig(UpdatePipelineManagementConfigRequest request);

    CompletableFuture<UpdatePipelinesResponse> updatePipelines(UpdatePipelinesRequest request);

    CompletableFuture<UpdatePrivateNetworkWhiteIpsResponse> updatePrivateNetworkWhiteIps(UpdatePrivateNetworkWhiteIpsRequest request);

    CompletableFuture<UpdatePublicNetworkResponse> updatePublicNetwork(UpdatePublicNetworkRequest request);

    CompletableFuture<UpdatePublicWhiteIpsResponse> updatePublicWhiteIps(UpdatePublicWhiteIpsRequest request);

    CompletableFuture<UpdateReadWritePolicyResponse> updateReadWritePolicy(UpdateReadWritePolicyRequest request);

    CompletableFuture<UpdateSnapshotSettingResponse> updateSnapshotSetting(UpdateSnapshotSettingRequest request);

    CompletableFuture<UpdateSynonymsDictsResponse> updateSynonymsDicts(UpdateSynonymsDictsRequest request);

    CompletableFuture<UpdateTemplateResponse> updateTemplate(UpdateTemplateRequest request);

    CompletableFuture<UpdateWhiteIpsResponse> updateWhiteIps(UpdateWhiteIpsRequest request);

    CompletableFuture<UpdateXpackMonitorConfigResponse> updateXpackMonitorConfig(UpdateXpackMonitorConfigRequest request);

    CompletableFuture<UpgradeEngineVersionResponse> upgradeEngineVersion(UpgradeEngineVersionRequest request);

    CompletableFuture<ValidateConnectionResponse> validateConnection(ValidateConnectionRequest request);

    CompletableFuture<ValidateShrinkNodesResponse> validateShrinkNodes(ValidateShrinkNodesRequest request);

    CompletableFuture<ValidateSlrPermissionResponse> validateSlrPermission(ValidateSlrPermissionRequest request);

    CompletableFuture<ValidateTransferableNodesResponse> validateTransferableNodes(ValidateTransferableNodesRequest request);

    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

}
