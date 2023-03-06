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

    /**
      * Before you call this operation, note that:
      * *   Currently, the one-click index migration feature only supports the China (Beijing) region.
      * *   The source and destination Elasticsearch clusters must meet the following requirements: a user-created or Alibaba Cloud Elasticsearch Elasticsearch cluster with a source of version 6.7.0 and a Alibaba Cloud Elasticsearch Elasticsearch cluster with a destination of version 6.3.2 or 6.7.0.
      *
     */
    CompletableFuture<CreateDataTasksResponse> createDataTasks(CreateDataTasksRequest request);

    CompletableFuture<CreateILMPolicyResponse> createILMPolicy(CreateILMPolicyRequest request);

    CompletableFuture<CreateIndexTemplateResponse> createIndexTemplate(CreateIndexTemplateRequest request);

    /**
      * Before you call the API operation, note that:
      * *   Before you call this operation, make sure that you have fully understood the payment method and price of Logstash.
      * *   Before you create an instance, you must complete real-name verification.
      *
     */
    CompletableFuture<CreateLogstashResponse> createLogstash(CreateLogstashRequest request);

    CompletableFuture<CreatePipelinesResponse> createPipelines(CreatePipelinesRequest request);

    CompletableFuture<CreateSnapshotResponse> createSnapshot(CreateSnapshotRequest request);

    /**
      * For more information about this API operation, see [Configure a private connection to an instance](~~279559~~).
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
      * Before you call an interface, note the following:
      * After an instance is released, the physical resources used by the instance are recycled. All related data is lost and cannot be recovered. The Cloud disks attached to the instance nodes are also released. The corresponding snapshots are deleted.
      *
     */
    CompletableFuture<DeleteLogstashResponse> deleteLogstash(DeleteLogstashRequest request);

    CompletableFuture<DeletePipelinesResponse> deletePipelines(DeletePipelinesRequest request);

    CompletableFuture<DeleteSnapshotRepoResponse> deleteSnapshotRepo(DeleteSnapshotRepoRequest request);

    CompletableFuture<DeleteVpcEndpointResponse> deleteVpcEndpoint(DeleteVpcEndpointRequest request);

    /**
      * >  Before installing the collector on the ACK cluster, you can call this interface to view the installation status of the Elasticsearch Operator on the target cluster.
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
      * The instance health condition supports the following three states:
      * *   GREEN: The distribution of primary and secondary shards is normal.
      * *   YELLOW: The primary shard is normally allocated, but the replica is not normally allocated.
      * *   RED: The primary shard is not normally allocated.
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

    /**
      * >  When using a collector to collect logs from different data sources or performing elastic cluster scaling tasks (for the China site), you must first grant permissions to create service linked roles.
      *
     */
    CompletableFuture<InitializeOperationRoleResponse> initializeOperationRole(InitializeOperationRoleRequest request);

    /**
      * >  Before installing the collector on the ACK cluster, you need to call this interface and install the Elasticsearch Operator. on the target cluster.
      *
     */
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

    CompletableFuture<ListLogstashResponse> listLogstash(ListLogstashRequest request);

    CompletableFuture<ListLogstashLogResponse> listLogstashLog(ListLogstashLogRequest request);

    CompletableFuture<ListLogstashPluginsResponse> listLogstashPlugins(ListLogstashPluginsRequest request);

    CompletableFuture<ListNodesResponse> listNodes(ListNodesRequest request);

    CompletableFuture<ListPipelineResponse> listPipeline(ListPipelineRequest request);

    /**
      * >  Pipeline management is divided into configuration file management and Kibana pipeline management. Kibana pipeline management is not open in some regional consoles.
      *
     */
    CompletableFuture<ListPipelineIdsResponse> listPipelineIds(ListPipelineIdsRequest request);

    CompletableFuture<ListPluginsResponse> listPlugins(ListPluginsRequest request);

    CompletableFuture<ListSearchLogResponse> listSearchLog(ListSearchLogRequest request);

    /**
      * >  Shard recovery is the process of synchronizing from primary to secondary shards. After the restoration is complete, the secondary parts are available for searching.
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
      * Before you call this operation, note that:
      * *   Before maintenance is performed, the system sends SMS messages and emails to the contacts listed in your Alibaba Cloud account.
      * *   On the day of instance maintenance, to ensure the stability of the entire maintenance process, the instance enters the Active state before it can be maintenance window. In this case, you can still access the cluster and perform query operations such as performance monitoring. However, you cannot perform modification operations such as restart and configuration upgrades for the cluster.
      * *   The instance connection may be disconnected within the available maintenance window. Make sure that the application has a reconnection mechanism.
      *
     */
    CompletableFuture<ModifyInstanceMaintainTimeResponse> modifyInstanceMaintainTime(ModifyInstanceMaintainTimeRequest request);

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

    /**
      * When you call this operation, take note of the following items:
      * Before you remove data nodes, you must migrate the data stored on them to other nodes.
      *
     */
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
      * When you call this operation, take note of the following limits:
      * If the instance is in the Activating, Invalid, or Inactive state, the information cannot be updated.
      *
     */
    CompletableFuture<UpdateAdminPasswordResponse> updateAdminPassword(UpdateAdminPasswordRequest request);

    CompletableFuture<UpdateAdvancedSettingResponse> updateAdvancedSetting(UpdateAdvancedSettingRequest request);

    /**
      * Note the following when calling this interface:
      * *   Alibaba Cloud Elasticsearch V5.0 clusters do not support the analysis-aliws plug-in.
      * *   If the dictionary file is obtained from OSS, make sure that the OSS bucket is public-readable.
      * *   If the ORIGIN configuration is not added to an uploaded dictionary file, the dictionary file is deleted after you call this operation.
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
      * When calling this interface, note:
      * *   If the dictionary file comes from OSS, make sure that the OSS storage space is publicly readable.
      * *   If the uploaded dictionary is not configured with ORIGIN, the dictionary file will be deleted after this interface is called.
      *
     */
    CompletableFuture<UpdateDictResponse> updateDict(UpdateDictRequest request);

    CompletableFuture<UpdateDynamicSettingsResponse> updateDynamicSettings(UpdateDynamicSettingsRequest request);

    CompletableFuture<UpdateExtendConfigResponse> updateExtendConfig(UpdateExtendConfigRequest request);

    /**
      * Note the following when calling this interface:
      * Currently, this operation only allows you to delete Logstash extension files that have been uploaded in the console. If you want to add or modify an identifier, perform the operations in the console.
      *
     */
    CompletableFuture<UpdateExtendfilesResponse> updateExtendfiles(UpdateExtendfilesRequest request);

    /**
      * Note the following when calling this interface:
      * *   If the dictionary file is obtained from OSS, make sure that the OSS bucket is public-readable.
      * *   If the ORIGIN configuration is not added to an uploaded dictionary file, the dictionary file is deleted after you call this operation.
      *
     */
    CompletableFuture<UpdateHotIkDictsResponse> updateHotIkDicts(UpdateHotIkDictsRequest request);

    CompletableFuture<UpdateILMPolicyResponse> updateILMPolicy(UpdateILMPolicyRequest request);

    CompletableFuture<UpdateIndexTemplateResponse> updateIndexTemplate(UpdateIndexTemplateRequest request);

    /**
      * When you call this operation, take note of the following items:
      * *   If the instance is in the Activating, Invalid, or Inactive state, you cannot change the configurations.
      * *   If the indexes of your cluster do not have replica shards, the load of the cluster is excessively high, and large amounts of data are written to or queried in your cluster, access to the cluster may time out during a cluster configuration upgrade or downgrade. We recommend that you configure an access retry mechanism for your client before you upgrade the configuration of your cluster. This reduces the impact on your business.
      * *   You can change the configurations of only one type of node at a time (data node, dedicated master node, cold data node, coordinator node, Kibana node, and elastic node).
      * *   Due to the health and stability of your cluster, Alibaba Cloud Elasticsearch does not support the purchase of 1-core 2 GB instances, 2-core 2 GB instances for dedicated master nodes, and 7.4 instances since May 2021. If you have confirmed that the purchased specifications are no longer available for sale, you must perform the following operations:
      *     *   For the 1-core 2 GB and 2-core 2 GB specifications, we recommend that you upgrade to the stable sales specifications that are available on the buy page in advance. For more information about the sales specifications available on the buy page, see [Purchase page parameters](~~163243~~).
      *     *   If your cluster is of V7.4, purchase a V7.10 cluster and migrate data from the original cluster to the V7.10 cluster.
      * For more information, see [Upgrade a cluster](~~96650~~) and [Downgrade a cluster](~~198887~~).
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

    CompletableFuture<UpdateKibanaSettingsResponse> updateKibanaSettings(UpdateKibanaSettingsRequest request);

    /**
      * *   Before you call this operation, make sure that the instance is not in the activating, invalid, or inactive state.
      * *   You can update the whitelist in two ways: IP address whitelist list and IP address whitelist group. The two methods cannot be used at the same time. In addition to InstanceId and clientToken, the two methods support different parameters, as follows:
      *     *   IP address whitelist list: kibanaIPWhitelist
      *     *   IP address whitelist groups: modifyMode and whiteIpGroup
      * *   Public network access whitelists do not support configuring private IP addresses. Private network access whitelists do not support configuring public IP addresses.
      *
     */
    CompletableFuture<UpdateKibanaWhiteIpsResponse> updateKibanaWhiteIps(UpdateKibanaWhiteIpsRequest request);

    /**
      * When you call this operation, take note of the following limits:
      * If the instance is in the Activating, Invalid, or Inactive state, you cannot modify the instance information.
      *
     */
    CompletableFuture<UpdateLogstashResponse> updateLogstash(UpdateLogstashRequest request);

    CompletableFuture<UpdateLogstashChargeTypeResponse> updateLogstashChargeType(UpdateLogstashChargeTypeRequest request);

    /**
      * When you call this operation, take note of the following items:
      * The instance name cannot be modified when the instance is in the activating, invalid, or inactive state.
      *
     */
    CompletableFuture<UpdateLogstashDescriptionResponse> updateLogstashDescription(UpdateLogstashDescriptionRequest request);

    /**
      * When you call this operation, take note of the following items:
      * If the instance is in the Active (activating), Invalid (invalid), and Inactive (inactive) state, the information cannot be updated.
      *
     */
    CompletableFuture<UpdateLogstashSettingsResponse> updateLogstashSettings(UpdateLogstashSettingsRequest request);

    /**
      * >  Pipeline management methods include configuration file management and Kibana pipeline management. Currently, Kibana pipeline management is no longer supported in the console. You can only use this feature through APIs.
      *
     */
    CompletableFuture<UpdatePipelineManagementConfigResponse> updatePipelineManagementConfig(UpdatePipelineManagementConfigRequest request);

    CompletableFuture<UpdatePipelinesResponse> updatePipelines(UpdatePipelinesRequest request);

    /**
      * *   If the instance is in the Active (activating), Invalid (invalid), or Inactive (inactive) state, you cannot update the VPC whitelist of the instance.
      * *   You can update the whitelist in two ways: IP address whitelist list and IP address whitelist group. The two methods cannot be used at the same time. In addition to InstanceId and clientToken, the two methods support different parameters, as follows:
      *     *   IP address whitelist list: privateNetworkIpWhiteList
      *     *   IP address whitelist groups: modifyMode and whiteIpGroup
      * *   Public network access whitelists do not support configuring private IP addresses. Private network access whitelists do not support configuring public IP addresses.
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
      * *   If the instance is in the Activating, Invalid, or Inactive state, the public endpoint whitelist of the instance cannot be updated.
      * *   You can update the whitelist in two ways: IP address whitelist list and IP address whitelist group. The two methods cannot be used at the same time. In addition to InstanceId and clientToken, the two methods support different parameters, as follows:
      *     *   IP address whitelist list: publicIpWhitelist
      *     *   IP address whitelist groups: modifyMode and whiteIpGroup
      * *   Public network access whitelists do not support configuring private IP addresses. Private network access whitelists do not support configuring public IP addresses.
      *
     */
    CompletableFuture<UpdatePublicWhiteIpsResponse> updatePublicWhiteIps(UpdatePublicWhiteIpsRequest request);

    CompletableFuture<UpdateReadWritePolicyResponse> updateReadWritePolicy(UpdateReadWritePolicyRequest request);

    CompletableFuture<UpdateSnapshotSettingResponse> updateSnapshotSetting(UpdateSnapshotSettingRequest request);

    /**
      * Note the following when calling this interface:
      * *   If the dictionary file is obtained from OSS, make sure that the OSS bucket is public-readable.
      * *   If the ORIGIN configuration is not added to an uploaded dictionary file, the dictionary file is deleted after you call this operation.
      *
     */
    CompletableFuture<UpdateSynonymsDictsResponse> updateSynonymsDicts(UpdateSynonymsDictsRequest request);

    CompletableFuture<UpdateTemplateResponse> updateTemplate(UpdateTemplateRequest request);

    /**
      * *   If the instance is in the Activating, Invalid, or Inactive state, the information cannot be updated.
      * *   You can update the whitelist in two ways: IP address whitelist list and IP address whitelist group. The two methods cannot be used at the same time. In addition to InstanceId and clientToken, the two methods support different parameters, as follows:
      *     *   IP address whitelist: esIPWhitelist
      *     *   IP address whitelist groups: modifyMode and whiteIpGroup
      * *   Public network access whitelists do not support configuring private IP addresses. Private network access whitelists do not support configuring public IP addresses.
      *
     */
    CompletableFuture<UpdateWhiteIpsResponse> updateWhiteIps(UpdateWhiteIpsRequest request);

    CompletableFuture<UpdateXpackMonitorConfigResponse> updateXpackMonitorConfig(UpdateXpackMonitorConfigRequest request);

    CompletableFuture<UpgradeEngineVersionResponse> upgradeEngineVersion(UpgradeEngineVersionRequest request);

    /**
      * >  To monitor X-Pack for Logstash, you must configure Elasticsearch instance. After the configuration, you can monitor the Logstash instance in Kibana of the corresponding Elasticsearch instance.
      *
     */
    CompletableFuture<ValidateConnectionResponse> validateConnection(ValidateConnectionRequest request);

    CompletableFuture<ValidateShrinkNodesResponse> validateShrinkNodes(ValidateShrinkNodesRequest request);

    /**
      * >  Before you use the collector tool to collect logs from different data sources, you must be authorized to create service linked roles. You can call this operation to verify that it has been created.
      *
     */
    CompletableFuture<ValidateSlrPermissionResponse> validateSlrPermission(ValidateSlrPermissionRequest request);

    CompletableFuture<ValidateTransferableNodesResponse> validateTransferableNodes(ValidateTransferableNodesRequest request);

    /**
      * Before you call the API operation, note that:
      * *   Make sure that you have read and understand the billing and pricing standards of Alibaba Cloud Elasticsearch.
      *     For more information, see [Alibaba Cloud Elasticsearch pricing](https://www.aliyun.com/price/product?spm=a2c4g.11186623.2.7.657d2cbeRoSPCd#/elasticsearch/detail).
      * *   Before you create an instance, you must complete real-name verification.
      *     .
      * *   You do not need to specify a zone when you create an instance. By default, the instance is in the same zone as the selected VPC.
      *
     */
    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

}
