// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.elasticsearch20170613.models.*;
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

    /**
      * @deprecated
      * Before you call this operation, note that:
      * *   Currently, the one-click index migration feature only supports the China (Beijing) region.
      * *   The source and destination Elasticsearch clusters must meet the following requirements: a user-created or Alibaba Cloud Elasticsearch Elasticsearch cluster with a source of version 6.7.0 and a Alibaba Cloud Elasticsearch Elasticsearch cluster with a destination of version 6.3.2 or 6.7.0.
      *
     */
    CompletableFuture<CreateDataTasksResponse> createDataTasks(CreateDataTasksRequest request);

    CompletableFuture<CreateILMPolicyResponse> createILMPolicy(CreateILMPolicyRequest request);

    CompletableFuture<CreateIndexTemplateResponse> createIndexTemplate(CreateIndexTemplateRequest request);

    CompletableFuture<CreateLogstashResponse> createLogstash(CreateLogstashRequest request);

    CompletableFuture<CreatePipelinesResponse> createPipelines(CreatePipelinesRequest request);

    CompletableFuture<CreateSnapshotResponse> createSnapshot(CreateSnapshotRequest request);

    /**
      * 5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1D\\*\\*\\*
      *
     */
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

    /**
      * Before you call this operation, take note of the following information: After the cluster is released, the physical resources used by the cluster are reclaimed. The data stored in the cluster is deleted and cannot be recovered. The disks attached to the nodes in the cluster and the snapshots created for the cluster are released.
      *
     */
    CompletableFuture<DeleteLogstashResponse> deleteLogstash(DeleteLogstashRequest request);

    CompletableFuture<DeletePipelinesResponse> deletePipelines(DeletePipelinesRequest request);

    CompletableFuture<DeleteSnapshotRepoResponse> deleteSnapshotRepo(DeleteSnapshotRepoRequest request);

    CompletableFuture<DeleteVpcEndpointResponse> deleteVpcEndpoint(DeleteVpcEndpointRequest request);

    /**
      * > Before you install a shipper on an ACK cluster, you can call this operation to query the installation status of ES-operator for the ACK cluster.
      *
     */
    CompletableFuture<DescribeAckOperatorResponse> describeAckOperator(DescribeAckOperatorRequest request);

    CompletableFuture<DescribeApmResponse> describeApm(DescribeApmRequest request);

    CompletableFuture<DescribeCollectorResponse> describeCollector(DescribeCollectorRequest request);

    CompletableFuture<DescribeComponentIndexResponse> describeComponentIndex(DescribeComponentIndexRequest request);

    CompletableFuture<DescribeConnectableClustersResponse> describeConnectableClusters(DescribeConnectableClustersRequest request);

    CompletableFuture<DescribeDeprecatedTemplateResponse> describeDeprecatedTemplate(DescribeDeprecatedTemplateRequest request);

    CompletableFuture<DescribeDiagnoseReportResponse> describeDiagnoseReport(DescribeDiagnoseReportRequest request);

    CompletableFuture<DescribeDiagnosisSettingsResponse> describeDiagnosisSettings(DescribeDiagnosisSettingsRequest request);

    CompletableFuture<DescribeDynamicSettingsResponse> describeDynamicSettings(DescribeDynamicSettingsRequest request);

    /**
      * An Elasticsearch cluster can be in a health state indicated by one of the following colors:
      * *   GREEN: Primary shards and replica shards for the primary shards are normally allocated.
      * *   YELLOW: Primary shards are normally allocated, but replica shards for the primary shards are not normally allocated.
      * *   RED: Primary shards are not normally allocated.
      *
     */
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

    CompletableFuture<DisableKibanaPvlNetworkResponse> disableKibanaPvlNetwork(DisableKibanaPvlNetworkRequest request);

    CompletableFuture<EnableKibanaPvlNetworkResponse> enableKibanaPvlNetwork(EnableKibanaPvlNetworkRequest request);

    CompletableFuture<EstimatedLogstashRestartTimeResponse> estimatedLogstashRestartTime(EstimatedLogstashRestartTimeRequest request);

    CompletableFuture<EstimatedRestartTimeResponse> estimatedRestartTime(EstimatedRestartTimeRequest request);

    CompletableFuture<GetClusterDataInformationResponse> getClusterDataInformation(GetClusterDataInformationRequest request);

    CompletableFuture<GetElastictaskResponse> getElastictask(GetElastictaskRequest request);

    CompletableFuture<GetEmonGrafanaAlertsResponse> getEmonGrafanaAlerts(GetEmonGrafanaAlertsRequest request);

    CompletableFuture<GetEmonGrafanaDashboardsResponse> getEmonGrafanaDashboards(GetEmonGrafanaDashboardsRequest request);

    CompletableFuture<GetEmonMonitorDataResponse> getEmonMonitorData(GetEmonMonitorDataRequest request);

    CompletableFuture<GetOpenStoreUsageResponse> getOpenStoreUsage(GetOpenStoreUsageRequest request);

    CompletableFuture<GetRegionConfigurationResponse> getRegionConfiguration(GetRegionConfigurationRequest request);

    CompletableFuture<GetRegionalInstanceConfigResponse> getRegionalInstanceConfig(GetRegionalInstanceConfigRequest request);

    CompletableFuture<GetSuggestShrinkableNodesResponse> getSuggestShrinkableNodes(GetSuggestShrinkableNodesRequest request);

    CompletableFuture<GetTransferableNodesResponse> getTransferableNodes(GetTransferableNodesRequest request);

    /**
      * > Before you perform auto scaling for a cluster at the China site (aliyun.com) or you use shippers to collect logs, you must create a service-linked role.
      *
     */
    CompletableFuture<InitializeOperationRoleResponse> initializeOperationRole(InitializeOperationRoleRequest request);

    /**
      * > Before you install a shipper for an ACK cluster, you must call this operation to install ES-operator for the cluster.
      *
     */
    CompletableFuture<InstallAckOperatorResponse> installAckOperator(InstallAckOperatorRequest request);

    CompletableFuture<InstallKibanaSystemPluginResponse> installKibanaSystemPlugin(InstallKibanaSystemPluginRequest request);

    /**
      * ls-cn-oew1qbgl\\*\\*\\*\\*
      *
     */
    CompletableFuture<InstallLogstashSystemPluginResponse> installLogstashSystemPlugin(InstallLogstashSystemPluginRequest request);

    CompletableFuture<InstallSystemPluginResponse> installSystemPlugin(InstallSystemPluginRequest request);

    CompletableFuture<InstallUserPluginsResponse> installUserPlugins(InstallUserPluginsRequest request);

    CompletableFuture<InterruptElasticsearchTaskResponse> interruptElasticsearchTask(InterruptElasticsearchTaskRequest request);

    CompletableFuture<InterruptLogstashTaskResponse> interruptLogstashTask(InterruptLogstashTaskRequest request);

    CompletableFuture<ListAckClustersResponse> listAckClusters(ListAckClustersRequest request);

    /**
      * > When you install a shipper on an ACK cluster, you must specify a namespace. You can call this operation to query all namespaces in the ACK cluster, and select a namespace based on your business requirements.
      *
     */
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

    CompletableFuture<ListDiagnosisItemsResponse> listDiagnosisItems(ListDiagnosisItemsRequest request);

    CompletableFuture<ListDictInformationResponse> listDictInformation(ListDictInformationRequest request);

    CompletableFuture<ListDictsResponse> listDicts(ListDictsRequest request);

    /**
      * **Important** To call this operation, you must create the Aliyun Elasticsearch AccessingOOSRole and the system service role AliyunOOSAccessingECS 4ESRole to Elasticsearch the service account to obtain the ECS access permissions of the primary account. For more information, see [Collect ECS service logs](~~146446~~).
      *
     */
    CompletableFuture<ListEcsInstancesResponse> listEcsInstances(ListEcsInstancesRequest request);

    CompletableFuture<ListExtendfilesResponse> listExtendfiles(ListExtendfilesRequest request);

    CompletableFuture<ListILMPoliciesResponse> listILMPolicies(ListILMPoliciesRequest request);

    CompletableFuture<ListIndexTemplatesResponse> listIndexTemplates(ListIndexTemplatesRequest request);

    CompletableFuture<ListInstanceResponse> listInstance(ListInstanceRequest request);

    CompletableFuture<ListInstanceHistoryEventsResponse> listInstanceHistoryEvents(ListInstanceHistoryEventsRequest request);

    CompletableFuture<ListInstanceIndicesResponse> listInstanceIndices(ListInstanceIndicesRequest request);

    CompletableFuture<ListKibanaPluginsResponse> listKibanaPlugins(ListKibanaPluginsRequest request);

    CompletableFuture<ListKibanaPvlNetworkResponse> listKibanaPvlNetwork(ListKibanaPvlNetworkRequest request);

    CompletableFuture<ListLogstashResponse> listLogstash(ListLogstashRequest request);

    CompletableFuture<ListLogstashLogResponse> listLogstashLog(ListLogstashLogRequest request);

    CompletableFuture<ListLogstashPluginsResponse> listLogstashPlugins(ListLogstashPluginsRequest request);

    CompletableFuture<ListNodesResponse> listNodes(ListNodesRequest request);

    CompletableFuture<ListPipelineResponse> listPipeline(ListPipelineRequest request);

    CompletableFuture<ListPipelineIdsResponse> listPipelineIds(ListPipelineIdsRequest request);

    CompletableFuture<ListPluginsResponse> listPlugins(ListPluginsRequest request);

    CompletableFuture<ListSearchLogResponse> listSearchLog(ListSearchLogRequest request);

    /**
      * > The restoration of a shard is a process of synchronizing data from a primary shard to a replica shard. After the restoration is complete, the replica shard is available for data searches.
      *
     */
    CompletableFuture<ListShardRecoveriesResponse> listShardRecoveries(ListShardRecoveriesRequest request);

    CompletableFuture<ListSnapshotReposByInstanceIdResponse> listSnapshotReposByInstanceId(ListSnapshotReposByInstanceIdRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ListTagsResponse> listTags(ListTagsRequest request);

    CompletableFuture<ListVpcEndpointsResponse> listVpcEndpoints(ListVpcEndpointsRequest request);

    /**
      * If the specifications in your zone are insufficient, you can upgrade your instance to nodes in another zone. Before calling this interface, you must ensure that:
      * *   The error message returned because the current account is in a zone that has sufficient resources.
      *     After migrating nodes with current specifications to another zone, you need to manually [upgrade cluster](~~96650~~) because the cluster will not be upgraded during the migration process. Therefore, select a zone with sufficient resources to avoid cluster upgrade failure. We recommend that you choose new zones that are in lower alphabetical order. For example, for cn-hangzhou-e and cn-hangzhou-h zones, choose cn-hangzhou-h first.
      * *   The cluster is in the healthy state.
      *     Can be passed`  GET _cat/health?v  `command to view the health status of the cluster.
      *
     */
    CompletableFuture<MigrateToOtherZoneResponse> migrateToOtherZone(MigrateToOtherZoneRequest request);

    CompletableFuture<ModifyDeployMachineResponse> modifyDeployMachine(ModifyDeployMachineRequest request);

    CompletableFuture<ModifyElastictaskResponse> modifyElastictask(ModifyElastictaskRequest request);

    /**
      * es-cn-n6w1o1x0w001c\\*\\*\\*\\*
      *
     */
    CompletableFuture<ModifyInstanceMaintainTimeResponse> modifyInstanceMaintainTime(ModifyInstanceMaintainTimeRequest request);

    /**
      * The ID of the cluster.
      *
     */
    CompletableFuture<ModifyWhiteIpsResponse> modifyWhiteIps(ModifyWhiteIpsRequest request);

    CompletableFuture<MoveResourceGroupResponse> moveResourceGroup(MoveResourceGroupRequest request);

    CompletableFuture<OpenDiagnosisResponse> openDiagnosis(OpenDiagnosisRequest request);

    /**
      * >  To ensure data security, we recommend that you enable HTTPS.
      *
     */
    CompletableFuture<OpenHttpsResponse> openHttps(OpenHttpsRequest request);

    CompletableFuture<PostEmonTryAlarmRuleResponse> postEmonTryAlarmRule(PostEmonTryAlarmRuleRequest request);

    CompletableFuture<RecommendTemplatesResponse> recommendTemplates(RecommendTemplatesRequest request);

    CompletableFuture<ReinstallCollectorResponse> reinstallCollector(ReinstallCollectorRequest request);

    CompletableFuture<RemoveApmResponse> removeApm(RemoveApmRequest request);

    CompletableFuture<RenewInstanceResponse> renewInstance(RenewInstanceRequest request);

    CompletableFuture<RenewLogstashResponse> renewLogstash(RenewLogstashRequest request);

    CompletableFuture<RestartCollectorResponse> restartCollector(RestartCollectorRequest request);

    /**
      * >  After the instance is restarted, the instance enters the activating state. After the instance is restarted, its status changes to active. Alibaba Cloud Elasticsearch supports restarting a single node. Restarting a node can be divided into normal restart and blue-green restart.
      *
     */
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

    /**
      * When you call this operation, take note of the following items:
      * *   You can only delete user tags.
      * > User labels are manually added to instances by users. A system Tag is a tag that Alibaba Cloud services add to instances. System labels are divided into visible labels and invisible labels.
      * *   If you delete a resource tag relationship that is not associated with any resources, you must delete the tags.
      *
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
      * 5A2CFF0E-5718-45B5-9D4D-70B3FF\\*\\*\\*\\*
      *
     */
    CompletableFuture<UpdateAdminPasswordResponse> updateAdminPassword(UpdateAdminPasswordRequest request);

    CompletableFuture<UpdateAdvancedSettingResponse> updateAdvancedSetting(UpdateAdvancedSettingRequest request);

    /**
      * Before you call this operation, take note of the following items:
      * *   Elasticsearch V5.X clusters do not support the analysis-aliws plug-in.
      * *   If the dictionary file is stored in an Object Storage Service (OSS) bucket, you must make sure that the access control list (ACL) of the bucket is public read.
      * *   If you do not set sourceType to ORIGIN for an uploaded dictionary file, the file will be deleted after you call this operation.
      *
     */
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

    /**
      * Before you call this operation, take note of the following items:
      * *   If the dictionary file is stored in an Object Storage Service (OSS) bucket, you must make sure that the access control list (ACL) of the bucket is public read.
      * *   If you do not set sourceType to ORIGIN for an uploaded dictionary file, the file will be deleted after you call this operation.
      *
     */
    CompletableFuture<UpdateDictResponse> updateDict(UpdateDictRequest request);

    CompletableFuture<UpdateDynamicSettingsResponse> updateDynamicSettings(UpdateDynamicSettingsRequest request);

    CompletableFuture<UpdateExtendConfigResponse> updateExtendConfig(UpdateExtendConfigRequest request);

    /**
      * When you call this operation, take note of the following items: You can call this operation only to delete the driver files that are uploaded to a Logstash cluster in the Alibaba Cloud Management Console. You can add or modify driver files only in the Alibaba Cloud Management Console.
      *
     */
    CompletableFuture<UpdateExtendfilesResponse> updateExtendfiles(UpdateExtendfilesRequest request);

    /**
      * Before you call this operation, take note of the following items:
      * *   If the dictionary file is stored in an Object Storage Service (OSS) bucket, you must make sure that the access control list (ACL) of the bucket is public read.
      * *   If you do not set sourceType to ORIGIN for an uploaded dictionary file, the file will be deleted after you call this operation.
      *
     */
    CompletableFuture<UpdateHotIkDictsResponse> updateHotIkDicts(UpdateHotIkDictsRequest request);

    CompletableFuture<UpdateILMPolicyResponse> updateILMPolicy(UpdateILMPolicyRequest request);

    CompletableFuture<UpdateIndexTemplateResponse> updateIndexTemplate(UpdateIndexTemplateRequest request);

    /**
      * es-cn-n6w1ptcb30009\\*\\*\\*\\*
      *
     */
    CompletableFuture<UpdateInstanceResponse> updateInstance(UpdateInstanceRequest request);

    CompletableFuture<UpdateInstanceChargeTypeResponse> updateInstanceChargeType(UpdateInstanceChargeTypeRequest request);

    /**
      * When you call this operation, take note of the following items:
      * When the instance is in the activating, invalid, or inactive state, you cannot update the configuration.
      *
     */
    CompletableFuture<UpdateInstanceSettingsResponse> updateInstanceSettings(UpdateInstanceSettingsRequest request);

    CompletableFuture<UpdateKibanaPvlNetworkResponse> updateKibanaPvlNetwork(UpdateKibanaPvlNetworkRequest request);

    CompletableFuture<UpdateKibanaSettingsResponse> updateKibanaSettings(UpdateKibanaSettingsRequest request);

    /**
      * *   Before you call this operation, you must make sure that the cluster is not in the activating, invalid, or inactive state.
      * *   You can update an IP address whitelist by using the following parameters:
      *     *   kibanaIPWhitelist
      *     *   modifyMode and whiteIpGroup
      * *   You cannot specify private IP addresses for public IP address whitelists and cannot specify public IP addresses for private IP address whitelists.
      *
     */
    CompletableFuture<UpdateKibanaWhiteIpsResponse> updateKibanaWhiteIps(UpdateKibanaWhiteIpsRequest request);

    CompletableFuture<UpdateLogstashResponse> updateLogstash(UpdateLogstashRequest request);

    CompletableFuture<UpdateLogstashChargeTypeResponse> updateLogstashChargeType(UpdateLogstashChargeTypeRequest request);

    /**
      * When you call this operation, take note of the following items: You cannot change the name of a cluster that is in the activating, invalid, or inactive state.
      *
     */
    CompletableFuture<UpdateLogstashDescriptionResponse> updateLogstashDescription(UpdateLogstashDescriptionRequest request);

    /**
      * When you call this operation, take note of the following items:
      * If the instance is in the Active (activating), Invalid (invalid), and Inactive (inactive) state, the information cannot be updated.
      *
     */
    CompletableFuture<UpdateLogstashSettingsResponse> updateLogstashSettings(UpdateLogstashSettingsRequest request);

    CompletableFuture<UpdatePipelineManagementConfigResponse> updatePipelineManagementConfig(UpdatePipelineManagementConfigRequest request);

    CompletableFuture<UpdatePipelinesResponse> updatePipelines(UpdatePipelinesRequest request);

    /**
      * >  In the following returned example, only the parameters in the returned data list are guaranteed to be included, and the parameters not mentioned are for reference only. For more information about the parameters, see [ListInstance](~~142230~~). You cannot force a dependency in a program to get these parameters.
      *
     */
    CompletableFuture<UpdatePrivateNetworkWhiteIpsResponse> updatePrivateNetworkWhiteIps(UpdatePrivateNetworkWhiteIpsRequest request);

    /**
      * When you call this operation, take note of the following items:
      * When the instance is in the activating, invalid, or inactive state, its configuration cannot be updated.
      *
     */
    CompletableFuture<UpdatePublicNetworkResponse> updatePublicNetwork(UpdatePublicNetworkRequest request);

    /**
      * >  In the following example, only the parameters in the returned data list are guaranteed to be included. The parameters that are not mentioned are for reference only. For more information about the parameters, see [ListInstance](~~142230~~). You cannot force a dependency in a program to get these parameters.
      *
     */
    CompletableFuture<UpdatePublicWhiteIpsResponse> updatePublicWhiteIps(UpdatePublicWhiteIpsRequest request);

    CompletableFuture<UpdateReadWritePolicyResponse> updateReadWritePolicy(UpdateReadWritePolicyRequest request);

    CompletableFuture<UpdateSnapshotSettingResponse> updateSnapshotSetting(UpdateSnapshotSettingRequest request);

    /**
      * Before you call this operation, take note of the following items:
      * *   If the dictionary file is stored in an Object Storage Service (OSS) bucket, you must make sure that the access control list (ACL) of the bucket is public read.
      * *   If you do not set sourceType to ORIGIN for an uploaded dictionary file, the file will be deleted after you call this operation.
      *
     */
    CompletableFuture<UpdateSynonymsDictsResponse> updateSynonymsDicts(UpdateSynonymsDictsRequest request);

    CompletableFuture<UpdateTemplateResponse> updateTemplate(UpdateTemplateRequest request);

    /**
      * > For more information about the parameters displayed in the following sample code but not provided in the preceding tables, see [ListInstance](~~142230~~). You cannot force your program to obtain these parameters.
      *
     */
    CompletableFuture<UpdateWhiteIpsResponse> updateWhiteIps(UpdateWhiteIpsRequest request);

    CompletableFuture<UpdateXpackMonitorConfigResponse> updateXpackMonitorConfig(UpdateXpackMonitorConfigRequest request);

    /**
      * 5A2CFF0E-5718-45B5-9D4D-70B3FF\\*\\*\\*\\*
      *
     */
    CompletableFuture<UpgradeEngineVersionResponse> upgradeEngineVersion(UpgradeEngineVersionRequest request);

    /**
      * > Before you enable the X-Pack Monitoring feature for a Logstash cluster, you must associate the Logstash cluster with an Elasticsearch cluster. This way, you can view the monitoring data of the Logstash cluster in the Kibana console of the Elasticsearch cluster.
      *
     */
    CompletableFuture<ValidateConnectionResponse> validateConnection(ValidateConnectionRequest request);

    CompletableFuture<ValidateShrinkNodesResponse> validateShrinkNodes(ValidateShrinkNodesRequest request);

    CompletableFuture<ValidateSlrPermissionResponse> validateSlrPermission(ValidateSlrPermissionRequest request);

    CompletableFuture<ValidateTransferableNodesResponse> validateTransferableNodes(ValidateTransferableNodesRequest request);

    /**
      * The configurations of warm nodes.
      *
     */
    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

}
