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

    /**
     * @param request the request parameters of ActivateZones  ActivateZonesRequest
     * @return ActivateZonesResponse
     */
    CompletableFuture<ActivateZonesResponse> activateZones(ActivateZonesRequest request);

    /**
     * @param request the request parameters of AddConnectableCluster  AddConnectableClusterRequest
     * @return AddConnectableClusterResponse
     */
    CompletableFuture<AddConnectableClusterResponse> addConnectableCluster(AddConnectableClusterRequest request);

    /**
     * @param request the request parameters of AddSnapshotRepo  AddSnapshotRepoRequest
     * @return AddSnapshotRepoResponse
     */
    CompletableFuture<AddSnapshotRepoResponse> addSnapshotRepo(AddSnapshotRepoRequest request);

    /**
     * @param request the request parameters of CancelDeletion  CancelDeletionRequest
     * @return CancelDeletionResponse
     */
    CompletableFuture<CancelDeletionResponse> cancelDeletion(CancelDeletionRequest request);

    /**
     * @param request the request parameters of CancelLogstashDeletion  CancelLogstashDeletionRequest
     * @return CancelLogstashDeletionResponse
     */
    CompletableFuture<CancelLogstashDeletionResponse> cancelLogstashDeletion(CancelLogstashDeletionRequest request);

    /**
     * @param request the request parameters of CancelTask  CancelTaskRequest
     * @return CancelTaskResponse
     */
    CompletableFuture<CancelTaskResponse> cancelTask(CancelTaskRequest request);

    /**
     * @param request the request parameters of CapacityPlan  CapacityPlanRequest
     * @return CapacityPlanResponse
     */
    CompletableFuture<CapacityPlanResponse> capacityPlan(CapacityPlanRequest request);

    /**
     * @param request the request parameters of CloseDiagnosis  CloseDiagnosisRequest
     * @return CloseDiagnosisResponse
     */
    CompletableFuture<CloseDiagnosisResponse> closeDiagnosis(CloseDiagnosisRequest request);

    /**
     * @param request the request parameters of CloseHttps  CloseHttpsRequest
     * @return CloseHttpsResponse
     */
    CompletableFuture<CloseHttpsResponse> closeHttps(CloseHttpsRequest request);

    /**
     * @param request the request parameters of CloseManagedIndex  CloseManagedIndexRequest
     * @return CloseManagedIndexResponse
     */
    CompletableFuture<CloseManagedIndexResponse> closeManagedIndex(CloseManagedIndexRequest request);

    /**
     * @param request the request parameters of CreateCollector  CreateCollectorRequest
     * @return CreateCollectorResponse
     */
    CompletableFuture<CreateCollectorResponse> createCollector(CreateCollectorRequest request);

    /**
     * @param request the request parameters of CreateComponentIndex  CreateComponentIndexRequest
     * @return CreateComponentIndexResponse
     */
    CompletableFuture<CreateComponentIndexResponse> createComponentIndex(CreateComponentIndexRequest request);

    /**
     * @param request the request parameters of CreateDataStream  CreateDataStreamRequest
     * @return CreateDataStreamResponse
     */
    CompletableFuture<CreateDataStreamResponse> createDataStream(CreateDataStreamRequest request);

    /**
     * @param request the request parameters of CreateILMPolicy  CreateILMPolicyRequest
     * @return CreateILMPolicyResponse
     */
    CompletableFuture<CreateILMPolicyResponse> createILMPolicy(CreateILMPolicyRequest request);

    /**
     * @param request the request parameters of CreateIndexTemplate  CreateIndexTemplateRequest
     * @return CreateIndexTemplateResponse
     */
    CompletableFuture<CreateIndexTemplateResponse> createIndexTemplate(CreateIndexTemplateRequest request);

    /**
     * @param request the request parameters of CreateLogstash  CreateLogstashRequest
     * @return CreateLogstashResponse
     */
    CompletableFuture<CreateLogstashResponse> createLogstash(CreateLogstashRequest request);

    /**
     * @param request the request parameters of CreatePipelines  CreatePipelinesRequest
     * @return CreatePipelinesResponse
     */
    CompletableFuture<CreatePipelinesResponse> createPipelines(CreatePipelinesRequest request);

    /**
     * @param request the request parameters of CreateSnapshot  CreateSnapshotRequest
     * @return CreateSnapshotResponse
     */
    CompletableFuture<CreateSnapshotResponse> createSnapshot(CreateSnapshotRequest request);

    /**
     * <b>description</b> :
     * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1D\<em>\</em>\*</p>
     * 
     * @param request the request parameters of CreateVpcEndpoint  CreateVpcEndpointRequest
     * @return CreateVpcEndpointResponse
     */
    CompletableFuture<CreateVpcEndpointResponse> createVpcEndpoint(CreateVpcEndpointRequest request);

    /**
     * @param request the request parameters of DeactivateZones  DeactivateZonesRequest
     * @return DeactivateZonesResponse
     */
    CompletableFuture<DeactivateZonesResponse> deactivateZones(DeactivateZonesRequest request);

    /**
     * @param request the request parameters of DeleteCollector  DeleteCollectorRequest
     * @return DeleteCollectorResponse
     */
    CompletableFuture<DeleteCollectorResponse> deleteCollector(DeleteCollectorRequest request);

    /**
     * @param request the request parameters of DeleteComponentIndex  DeleteComponentIndexRequest
     * @return DeleteComponentIndexResponse
     */
    CompletableFuture<DeleteComponentIndexResponse> deleteComponentIndex(DeleteComponentIndexRequest request);

    /**
     * @param request the request parameters of DeleteConnectedCluster  DeleteConnectedClusterRequest
     * @return DeleteConnectedClusterResponse
     */
    CompletableFuture<DeleteConnectedClusterResponse> deleteConnectedCluster(DeleteConnectedClusterRequest request);

    /**
     * @param request the request parameters of DeleteDataStream  DeleteDataStreamRequest
     * @return DeleteDataStreamResponse
     */
    CompletableFuture<DeleteDataStreamResponse> deleteDataStream(DeleteDataStreamRequest request);

    /**
     * @param request the request parameters of DeleteDataTask  DeleteDataTaskRequest
     * @return DeleteDataTaskResponse
     */
    CompletableFuture<DeleteDataTaskResponse> deleteDataTask(DeleteDataTaskRequest request);

    /**
     * @param request the request parameters of DeleteDeprecatedTemplate  DeleteDeprecatedTemplateRequest
     * @return DeleteDeprecatedTemplateResponse
     */
    CompletableFuture<DeleteDeprecatedTemplateResponse> deleteDeprecatedTemplate(DeleteDeprecatedTemplateRequest request);

    /**
     * @param request the request parameters of DeleteILMPolicy  DeleteILMPolicyRequest
     * @return DeleteILMPolicyResponse
     */
    CompletableFuture<DeleteILMPolicyResponse> deleteILMPolicy(DeleteILMPolicyRequest request);

    /**
     * @param request the request parameters of DeleteIndexTemplate  DeleteIndexTemplateRequest
     * @return DeleteIndexTemplateResponse
     */
    CompletableFuture<DeleteIndexTemplateResponse> deleteIndexTemplate(DeleteIndexTemplateRequest request);

    /**
     * @param request the request parameters of DeleteInstance  DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following information: After the cluster is released, the physical resources used by the cluster are reclaimed. The data stored in the cluster is deleted and cannot be recovered. The disks attached to the nodes in the cluster and the snapshots created for the cluster are released.</p>
     * 
     * @param request the request parameters of DeleteLogstash  DeleteLogstashRequest
     * @return DeleteLogstashResponse
     */
    CompletableFuture<DeleteLogstashResponse> deleteLogstash(DeleteLogstashRequest request);

    /**
     * @param request the request parameters of DeletePipelines  DeletePipelinesRequest
     * @return DeletePipelinesResponse
     */
    CompletableFuture<DeletePipelinesResponse> deletePipelines(DeletePipelinesRequest request);

    /**
     * @param request the request parameters of DeleteSnapshotRepo  DeleteSnapshotRepoRequest
     * @return DeleteSnapshotRepoResponse
     */
    CompletableFuture<DeleteSnapshotRepoResponse> deleteSnapshotRepo(DeleteSnapshotRepoRequest request);

    /**
     * @param request the request parameters of DeleteVpcEndpoint  DeleteVpcEndpointRequest
     * @return DeleteVpcEndpointResponse
     */
    CompletableFuture<DeleteVpcEndpointResponse> deleteVpcEndpoint(DeleteVpcEndpointRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Before you install a shipper on an ACK cluster, you can call this operation to query the installation status of ES-operator for the ACK cluster.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeAckOperator  DescribeAckOperatorRequest
     * @return DescribeAckOperatorResponse
     */
    CompletableFuture<DescribeAckOperatorResponse> describeAckOperator(DescribeAckOperatorRequest request);

    /**
     * @param request the request parameters of DescribeApm  DescribeApmRequest
     * @return DescribeApmResponse
     */
    CompletableFuture<DescribeApmResponse> describeApm(DescribeApmRequest request);

    /**
     * @param request the request parameters of DescribeCollector  DescribeCollectorRequest
     * @return DescribeCollectorResponse
     */
    CompletableFuture<DescribeCollectorResponse> describeCollector(DescribeCollectorRequest request);

    /**
     * @param request the request parameters of DescribeComponentIndex  DescribeComponentIndexRequest
     * @return DescribeComponentIndexResponse
     */
    CompletableFuture<DescribeComponentIndexResponse> describeComponentIndex(DescribeComponentIndexRequest request);

    /**
     * @param request the request parameters of DescribeConnectableClusters  DescribeConnectableClustersRequest
     * @return DescribeConnectableClustersResponse
     */
    CompletableFuture<DescribeConnectableClustersResponse> describeConnectableClusters(DescribeConnectableClustersRequest request);

    /**
     * @param request the request parameters of DescribeDeprecatedTemplate  DescribeDeprecatedTemplateRequest
     * @return DescribeDeprecatedTemplateResponse
     */
    CompletableFuture<DescribeDeprecatedTemplateResponse> describeDeprecatedTemplate(DescribeDeprecatedTemplateRequest request);

    /**
     * @param request the request parameters of DescribeDiagnoseReport  DescribeDiagnoseReportRequest
     * @return DescribeDiagnoseReportResponse
     */
    CompletableFuture<DescribeDiagnoseReportResponse> describeDiagnoseReport(DescribeDiagnoseReportRequest request);

    /**
     * @param request the request parameters of DescribeDiagnosisSettings  DescribeDiagnosisSettingsRequest
     * @return DescribeDiagnosisSettingsResponse
     */
    CompletableFuture<DescribeDiagnosisSettingsResponse> describeDiagnosisSettings(DescribeDiagnosisSettingsRequest request);

    /**
     * @param request the request parameters of DescribeDynamicSettings  DescribeDynamicSettingsRequest
     * @return DescribeDynamicSettingsResponse
     */
    CompletableFuture<DescribeDynamicSettingsResponse> describeDynamicSettings(DescribeDynamicSettingsRequest request);

    /**
     * <b>description</b> :
     * <p>An Elasticsearch cluster can be in a health state indicated by one of the following colors:</p>
     * <ul>
     * <li>GREEN: Primary shards and replica shards for the primary shards are normally allocated.</li>
     * <li>YELLOW: Primary shards are normally allocated, but replica shards for the primary shards are not normally allocated.</li>
     * <li>RED: Primary shards are not normally allocated.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeElasticsearchHealth  DescribeElasticsearchHealthRequest
     * @return DescribeElasticsearchHealthResponse
     */
    CompletableFuture<DescribeElasticsearchHealthResponse> describeElasticsearchHealth(DescribeElasticsearchHealthRequest request);

    /**
     * @param request the request parameters of DescribeILMPolicy  DescribeILMPolicyRequest
     * @return DescribeILMPolicyResponse
     */
    CompletableFuture<DescribeILMPolicyResponse> describeILMPolicy(DescribeILMPolicyRequest request);

    /**
     * @param request the request parameters of DescribeIndexTemplate  DescribeIndexTemplateRequest
     * @return DescribeIndexTemplateResponse
     */
    CompletableFuture<DescribeIndexTemplateResponse> describeIndexTemplate(DescribeIndexTemplateRequest request);

    /**
     * @param request the request parameters of DescribeInstance  DescribeInstanceRequest
     * @return DescribeInstanceResponse
     */
    CompletableFuture<DescribeInstanceResponse> describeInstance(DescribeInstanceRequest request);

    /**
     * @param request the request parameters of DescribeKibanaSettings  DescribeKibanaSettingsRequest
     * @return DescribeKibanaSettingsResponse
     */
    CompletableFuture<DescribeKibanaSettingsResponse> describeKibanaSettings(DescribeKibanaSettingsRequest request);

    /**
     * @param request the request parameters of DescribeLogstash  DescribeLogstashRequest
     * @return DescribeLogstashResponse
     */
    CompletableFuture<DescribeLogstashResponse> describeLogstash(DescribeLogstashRequest request);

    /**
     * @param request the request parameters of DescribePipeline  DescribePipelineRequest
     * @return DescribePipelineResponse
     */
    CompletableFuture<DescribePipelineResponse> describePipeline(DescribePipelineRequest request);

    /**
     * @param request the request parameters of DescribePipelineManagementConfig  DescribePipelineManagementConfigRequest
     * @return DescribePipelineManagementConfigResponse
     */
    CompletableFuture<DescribePipelineManagementConfigResponse> describePipelineManagementConfig(DescribePipelineManagementConfigRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * @param request the request parameters of DescribeSnapshotSetting  DescribeSnapshotSettingRequest
     * @return DescribeSnapshotSettingResponse
     */
    CompletableFuture<DescribeSnapshotSettingResponse> describeSnapshotSetting(DescribeSnapshotSettingRequest request);

    /**
     * @param request the request parameters of DescribeTemplates  DescribeTemplatesRequest
     * @return DescribeTemplatesResponse
     */
    CompletableFuture<DescribeTemplatesResponse> describeTemplates(DescribeTemplatesRequest request);

    /**
     * @param request the request parameters of DescribeXpackMonitorConfig  DescribeXpackMonitorConfigRequest
     * @return DescribeXpackMonitorConfigResponse
     */
    CompletableFuture<DescribeXpackMonitorConfigResponse> describeXpackMonitorConfig(DescribeXpackMonitorConfigRequest request);

    /**
     * @param request the request parameters of DiagnoseInstance  DiagnoseInstanceRequest
     * @return DiagnoseInstanceResponse
     */
    CompletableFuture<DiagnoseInstanceResponse> diagnoseInstance(DiagnoseInstanceRequest request);

    /**
     * @param request the request parameters of DisableKibanaPvlNetwork  DisableKibanaPvlNetworkRequest
     * @return DisableKibanaPvlNetworkResponse
     */
    CompletableFuture<DisableKibanaPvlNetworkResponse> disableKibanaPvlNetwork(DisableKibanaPvlNetworkRequest request);

    /**
     * @param request the request parameters of EnableKibanaPvlNetwork  EnableKibanaPvlNetworkRequest
     * @return EnableKibanaPvlNetworkResponse
     */
    CompletableFuture<EnableKibanaPvlNetworkResponse> enableKibanaPvlNetwork(EnableKibanaPvlNetworkRequest request);

    /**
     * @param request the request parameters of EstimatedLogstashRestartTime  EstimatedLogstashRestartTimeRequest
     * @return EstimatedLogstashRestartTimeResponse
     */
    CompletableFuture<EstimatedLogstashRestartTimeResponse> estimatedLogstashRestartTime(EstimatedLogstashRestartTimeRequest request);

    /**
     * @param request the request parameters of EstimatedRestartTime  EstimatedRestartTimeRequest
     * @return EstimatedRestartTimeResponse
     */
    CompletableFuture<EstimatedRestartTimeResponse> estimatedRestartTime(EstimatedRestartTimeRequest request);

    /**
     * @param request the request parameters of GetClusterDataInformation  GetClusterDataInformationRequest
     * @return GetClusterDataInformationResponse
     */
    CompletableFuture<GetClusterDataInformationResponse> getClusterDataInformation(GetClusterDataInformationRequest request);

    /**
     * @param request the request parameters of GetElastictask  GetElastictaskRequest
     * @return GetElastictaskResponse
     */
    CompletableFuture<GetElastictaskResponse> getElastictask(GetElastictaskRequest request);

    /**
     * @param request the request parameters of GetEmonGrafanaAlerts  GetEmonGrafanaAlertsRequest
     * @return GetEmonGrafanaAlertsResponse
     */
    CompletableFuture<GetEmonGrafanaAlertsResponse> getEmonGrafanaAlerts(GetEmonGrafanaAlertsRequest request);

    /**
     * @param request the request parameters of GetEmonGrafanaDashboards  GetEmonGrafanaDashboardsRequest
     * @return GetEmonGrafanaDashboardsResponse
     */
    CompletableFuture<GetEmonGrafanaDashboardsResponse> getEmonGrafanaDashboards(GetEmonGrafanaDashboardsRequest request);

    /**
     * @param request the request parameters of GetEmonMonitorData  GetEmonMonitorDataRequest
     * @return GetEmonMonitorDataResponse
     */
    CompletableFuture<GetEmonMonitorDataResponse> getEmonMonitorData(GetEmonMonitorDataRequest request);

    /**
     * @param request the request parameters of GetOpenStoreUsage  GetOpenStoreUsageRequest
     * @return GetOpenStoreUsageResponse
     */
    CompletableFuture<GetOpenStoreUsageResponse> getOpenStoreUsage(GetOpenStoreUsageRequest request);

    /**
     * @param request the request parameters of GetRegionConfiguration  GetRegionConfigurationRequest
     * @return GetRegionConfigurationResponse
     */
    CompletableFuture<GetRegionConfigurationResponse> getRegionConfiguration(GetRegionConfigurationRequest request);

    /**
     * @param request the request parameters of GetRegionalInstanceConfig  GetRegionalInstanceConfigRequest
     * @return GetRegionalInstanceConfigResponse
     */
    CompletableFuture<GetRegionalInstanceConfigResponse> getRegionalInstanceConfig(GetRegionalInstanceConfigRequest request);

    /**
     * @param request the request parameters of GetSuggestShrinkableNodes  GetSuggestShrinkableNodesRequest
     * @return GetSuggestShrinkableNodesResponse
     */
    CompletableFuture<GetSuggestShrinkableNodesResponse> getSuggestShrinkableNodes(GetSuggestShrinkableNodesRequest request);

    /**
     * @param request the request parameters of GetTransferableNodes  GetTransferableNodesRequest
     * @return GetTransferableNodesResponse
     */
    CompletableFuture<GetTransferableNodesResponse> getTransferableNodes(GetTransferableNodesRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Before you perform auto scaling for a cluster at the China site (aliyun.com) or you use shippers to collect logs, you must create a service-linked role.</p>
     * </blockquote>
     * 
     * @param request the request parameters of InitializeOperationRole  InitializeOperationRoleRequest
     * @return InitializeOperationRoleResponse
     */
    CompletableFuture<InitializeOperationRoleResponse> initializeOperationRole(InitializeOperationRoleRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Before you install a shipper for an ACK cluster, you must call this operation to install ES-operator for the cluster.</p>
     * </blockquote>
     * 
     * @param request the request parameters of InstallAckOperator  InstallAckOperatorRequest
     * @return InstallAckOperatorResponse
     */
    CompletableFuture<InstallAckOperatorResponse> installAckOperator(InstallAckOperatorRequest request);

    /**
     * @param request the request parameters of InstallKibanaSystemPlugin  InstallKibanaSystemPluginRequest
     * @return InstallKibanaSystemPluginResponse
     */
    CompletableFuture<InstallKibanaSystemPluginResponse> installKibanaSystemPlugin(InstallKibanaSystemPluginRequest request);

    /**
     * <b>description</b> :
     * <p>ls-cn-oew1qbgl\<em>\</em>\<em>\</em></p>
     * 
     * @param request the request parameters of InstallLogstashSystemPlugin  InstallLogstashSystemPluginRequest
     * @return InstallLogstashSystemPluginResponse
     */
    CompletableFuture<InstallLogstashSystemPluginResponse> installLogstashSystemPlugin(InstallLogstashSystemPluginRequest request);

    /**
     * @param request the request parameters of InstallSystemPlugin  InstallSystemPluginRequest
     * @return InstallSystemPluginResponse
     */
    CompletableFuture<InstallSystemPluginResponse> installSystemPlugin(InstallSystemPluginRequest request);

    /**
     * @param request the request parameters of InstallUserPlugins  InstallUserPluginsRequest
     * @return InstallUserPluginsResponse
     */
    CompletableFuture<InstallUserPluginsResponse> installUserPlugins(InstallUserPluginsRequest request);

    /**
     * @param request the request parameters of InterruptElasticsearchTask  InterruptElasticsearchTaskRequest
     * @return InterruptElasticsearchTaskResponse
     */
    CompletableFuture<InterruptElasticsearchTaskResponse> interruptElasticsearchTask(InterruptElasticsearchTaskRequest request);

    /**
     * @param request the request parameters of InterruptLogstashTask  InterruptLogstashTaskRequest
     * @return InterruptLogstashTaskResponse
     */
    CompletableFuture<InterruptLogstashTaskResponse> interruptLogstashTask(InterruptLogstashTaskRequest request);

    /**
     * @param request the request parameters of ListAckClusters  ListAckClustersRequest
     * @return ListAckClustersResponse
     */
    CompletableFuture<ListAckClustersResponse> listAckClusters(ListAckClustersRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>When you install a shipper on an ACK cluster, you must specify a namespace. You can call this operation to query all namespaces in the ACK cluster, and select a namespace based on your business requirements.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListAckNamespaces  ListAckNamespacesRequest
     * @return ListAckNamespacesResponse
     */
    CompletableFuture<ListAckNamespacesResponse> listAckNamespaces(ListAckNamespacesRequest request);

    /**
     * @param request the request parameters of ListActionRecords  ListActionRecordsRequest
     * @return ListActionRecordsResponse
     */
    CompletableFuture<ListActionRecordsResponse> listActionRecords(ListActionRecordsRequest request);

    /**
     * @param request the request parameters of ListAllNode  ListAllNodeRequest
     * @return ListAllNodeResponse
     */
    CompletableFuture<ListAllNodeResponse> listAllNode(ListAllNodeRequest request);

    /**
     * @param request the request parameters of ListAlternativeSnapshotRepos  ListAlternativeSnapshotReposRequest
     * @return ListAlternativeSnapshotReposResponse
     */
    CompletableFuture<ListAlternativeSnapshotReposResponse> listAlternativeSnapshotRepos(ListAlternativeSnapshotReposRequest request);

    /**
     * @param request the request parameters of ListApm  ListApmRequest
     * @return ListApmResponse
     */
    CompletableFuture<ListApmResponse> listApm(ListApmRequest request);

    /**
     * @param request the request parameters of ListAvailableEsInstanceIds  ListAvailableEsInstanceIdsRequest
     * @return ListAvailableEsInstanceIdsResponse
     */
    CompletableFuture<ListAvailableEsInstanceIdsResponse> listAvailableEsInstanceIds(ListAvailableEsInstanceIdsRequest request);

    /**
     * @param request the request parameters of ListCollectors  ListCollectorsRequest
     * @return ListCollectorsResponse
     */
    CompletableFuture<ListCollectorsResponse> listCollectors(ListCollectorsRequest request);

    /**
     * @param request the request parameters of ListComponentIndices  ListComponentIndicesRequest
     * @return ListComponentIndicesResponse
     */
    CompletableFuture<ListComponentIndicesResponse> listComponentIndices(ListComponentIndicesRequest request);

    /**
     * @param request the request parameters of ListConnectedClusters  ListConnectedClustersRequest
     * @return ListConnectedClustersResponse
     */
    CompletableFuture<ListConnectedClustersResponse> listConnectedClusters(ListConnectedClustersRequest request);

    /**
     * @param request the request parameters of ListDataStreams  ListDataStreamsRequest
     * @return ListDataStreamsResponse
     */
    CompletableFuture<ListDataStreamsResponse> listDataStreams(ListDataStreamsRequest request);

    /**
     * @param request the request parameters of ListDataTasks  ListDataTasksRequest
     * @return ListDataTasksResponse
     */
    CompletableFuture<ListDataTasksResponse> listDataTasks(ListDataTasksRequest request);

    /**
     * @param request the request parameters of ListDefaultCollectorConfigurations  ListDefaultCollectorConfigurationsRequest
     * @return ListDefaultCollectorConfigurationsResponse
     */
    CompletableFuture<ListDefaultCollectorConfigurationsResponse> listDefaultCollectorConfigurations(ListDefaultCollectorConfigurationsRequest request);

    /**
     * @param request the request parameters of ListDeprecatedTemplates  ListDeprecatedTemplatesRequest
     * @return ListDeprecatedTemplatesResponse
     */
    CompletableFuture<ListDeprecatedTemplatesResponse> listDeprecatedTemplates(ListDeprecatedTemplatesRequest request);

    /**
     * @param request the request parameters of ListDiagnoseIndices  ListDiagnoseIndicesRequest
     * @return ListDiagnoseIndicesResponse
     */
    CompletableFuture<ListDiagnoseIndicesResponse> listDiagnoseIndices(ListDiagnoseIndicesRequest request);

    /**
     * @param request the request parameters of ListDiagnoseReport  ListDiagnoseReportRequest
     * @return ListDiagnoseReportResponse
     */
    CompletableFuture<ListDiagnoseReportResponse> listDiagnoseReport(ListDiagnoseReportRequest request);

    /**
     * @param request the request parameters of ListDiagnoseReportIds  ListDiagnoseReportIdsRequest
     * @return ListDiagnoseReportIdsResponse
     */
    CompletableFuture<ListDiagnoseReportIdsResponse> listDiagnoseReportIds(ListDiagnoseReportIdsRequest request);

    /**
     * @param request the request parameters of ListDiagnosisItems  ListDiagnosisItemsRequest
     * @return ListDiagnosisItemsResponse
     */
    CompletableFuture<ListDiagnosisItemsResponse> listDiagnosisItems(ListDiagnosisItemsRequest request);

    /**
     * @param request the request parameters of ListDictInformation  ListDictInformationRequest
     * @return ListDictInformationResponse
     */
    CompletableFuture<ListDictInformationResponse> listDictInformation(ListDictInformationRequest request);

    /**
     * @param request the request parameters of ListDicts  ListDictsRequest
     * @return ListDictsResponse
     */
    CompletableFuture<ListDictsResponse> listDicts(ListDictsRequest request);

    /**
     * <b>description</b> :
     * <p><em>Important</em>* To call this operation, you must create the Aliyun Elasticsearch AccessingOOSRole and the system service role AliyunOOSAccessingECS 4ESRole to Elasticsearch the service account to obtain the ECS access permissions of the primary account. For more information, see <a href="https://help.aliyun.com/document_detail/146446.html">Collect ECS service logs</a>.</p>
     * 
     * @param request the request parameters of ListEcsInstances  ListEcsInstancesRequest
     * @return ListEcsInstancesResponse
     */
    CompletableFuture<ListEcsInstancesResponse> listEcsInstances(ListEcsInstancesRequest request);

    /**
     * @param request the request parameters of ListExtendfiles  ListExtendfilesRequest
     * @return ListExtendfilesResponse
     */
    CompletableFuture<ListExtendfilesResponse> listExtendfiles(ListExtendfilesRequest request);

    /**
     * @param request the request parameters of ListILMPolicies  ListILMPoliciesRequest
     * @return ListILMPoliciesResponse
     */
    CompletableFuture<ListILMPoliciesResponse> listILMPolicies(ListILMPoliciesRequest request);

    /**
     * @param request the request parameters of ListIndexTemplates  ListIndexTemplatesRequest
     * @return ListIndexTemplatesResponse
     */
    CompletableFuture<ListIndexTemplatesResponse> listIndexTemplates(ListIndexTemplatesRequest request);

    /**
     * @param request the request parameters of ListInstance  ListInstanceRequest
     * @return ListInstanceResponse
     */
    CompletableFuture<ListInstanceResponse> listInstance(ListInstanceRequest request);

    /**
     * @param request the request parameters of ListInstanceHistoryEvents  ListInstanceHistoryEventsRequest
     * @return ListInstanceHistoryEventsResponse
     */
    CompletableFuture<ListInstanceHistoryEventsResponse> listInstanceHistoryEvents(ListInstanceHistoryEventsRequest request);

    /**
     * @param request the request parameters of ListInstanceIndices  ListInstanceIndicesRequest
     * @return ListInstanceIndicesResponse
     */
    CompletableFuture<ListInstanceIndicesResponse> listInstanceIndices(ListInstanceIndicesRequest request);

    /**
     * @param request the request parameters of ListKibanaPlugins  ListKibanaPluginsRequest
     * @return ListKibanaPluginsResponse
     */
    CompletableFuture<ListKibanaPluginsResponse> listKibanaPlugins(ListKibanaPluginsRequest request);

    /**
     * @param request the request parameters of ListKibanaPvlNetwork  ListKibanaPvlNetworkRequest
     * @return ListKibanaPvlNetworkResponse
     */
    CompletableFuture<ListKibanaPvlNetworkResponse> listKibanaPvlNetwork(ListKibanaPvlNetworkRequest request);

    /**
     * @param request the request parameters of ListLogstash  ListLogstashRequest
     * @return ListLogstashResponse
     */
    CompletableFuture<ListLogstashResponse> listLogstash(ListLogstashRequest request);

    /**
     * @param request the request parameters of ListLogstashLog  ListLogstashLogRequest
     * @return ListLogstashLogResponse
     */
    CompletableFuture<ListLogstashLogResponse> listLogstashLog(ListLogstashLogRequest request);

    /**
     * @param request the request parameters of ListLogstashPlugins  ListLogstashPluginsRequest
     * @return ListLogstashPluginsResponse
     */
    CompletableFuture<ListLogstashPluginsResponse> listLogstashPlugins(ListLogstashPluginsRequest request);

    /**
     * @param request the request parameters of ListNodes  ListNodesRequest
     * @return ListNodesResponse
     */
    CompletableFuture<ListNodesResponse> listNodes(ListNodesRequest request);

    /**
     * @param request the request parameters of ListPipeline  ListPipelineRequest
     * @return ListPipelineResponse
     */
    CompletableFuture<ListPipelineResponse> listPipeline(ListPipelineRequest request);

    /**
     * @param request the request parameters of ListPipelineIds  ListPipelineIdsRequest
     * @return ListPipelineIdsResponse
     */
    CompletableFuture<ListPipelineIdsResponse> listPipelineIds(ListPipelineIdsRequest request);

    /**
     * @param request the request parameters of ListPlugins  ListPluginsRequest
     * @return ListPluginsResponse
     */
    CompletableFuture<ListPluginsResponse> listPlugins(ListPluginsRequest request);

    /**
     * @param request the request parameters of ListSearchLog  ListSearchLogRequest
     * @return ListSearchLogResponse
     */
    CompletableFuture<ListSearchLogResponse> listSearchLog(ListSearchLogRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The restoration of a shard is a process of synchronizing data from a primary shard to a replica shard. After the restoration is complete, the replica shard is available for data searches.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListShardRecoveries  ListShardRecoveriesRequest
     * @return ListShardRecoveriesResponse
     */
    CompletableFuture<ListShardRecoveriesResponse> listShardRecoveries(ListShardRecoveriesRequest request);

    /**
     * @param request the request parameters of ListSnapshotReposByInstanceId  ListSnapshotReposByInstanceIdRequest
     * @return ListSnapshotReposByInstanceIdResponse
     */
    CompletableFuture<ListSnapshotReposByInstanceIdResponse> listSnapshotReposByInstanceId(ListSnapshotReposByInstanceIdRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of ListTags  ListTagsRequest
     * @return ListTagsResponse
     */
    CompletableFuture<ListTagsResponse> listTags(ListTagsRequest request);

    /**
     * @param request the request parameters of ListVpcEndpoints  ListVpcEndpointsRequest
     * @return ListVpcEndpointsResponse
     */
    CompletableFuture<ListVpcEndpointsResponse> listVpcEndpoints(ListVpcEndpointsRequest request);

    /**
     * <b>description</b> :
     * <p>If the specifications in your zone are insufficient, you can upgrade your instance to nodes in another zone. Before calling this interface, you must ensure that:</p>
     * <ul>
     * <li>The error message returned because the current account is in a zone that has sufficient resources.
     * After migrating nodes with current specifications to another zone, you need to manually <a href="https://help.aliyun.com/document_detail/96650.html">upgrade cluster</a> because the cluster will not be upgraded during the migration process. Therefore, select a zone with sufficient resources to avoid cluster upgrade failure. We recommend that you choose new zones that are in lower alphabetical order. For example, for cn-hangzhou-e and cn-hangzhou-h zones, choose cn-hangzhou-h first.</li>
     * <li>The cluster is in the healthy state.
     * Can be passed<code> GET _cat/health?v </code>command to view the health status of the cluster.</li>
     * </ul>
     * 
     * @param request the request parameters of MigrateToOtherZone  MigrateToOtherZoneRequest
     * @return MigrateToOtherZoneResponse
     */
    CompletableFuture<MigrateToOtherZoneResponse> migrateToOtherZone(MigrateToOtherZoneRequest request);

    /**
     * @param request the request parameters of ModifyDeployMachine  ModifyDeployMachineRequest
     * @return ModifyDeployMachineResponse
     */
    CompletableFuture<ModifyDeployMachineResponse> modifyDeployMachine(ModifyDeployMachineRequest request);

    /**
     * @param request the request parameters of ModifyElastictask  ModifyElastictaskRequest
     * @return ModifyElastictaskResponse
     */
    CompletableFuture<ModifyElastictaskResponse> modifyElastictask(ModifyElastictaskRequest request);

    /**
     * <b>description</b> :
     * <p>es-cn-n6w1o1x0w001c\<em>\</em>\<em>\</em></p>
     * 
     * @param request the request parameters of ModifyInstanceMaintainTime  ModifyInstanceMaintainTimeRequest
     * @return ModifyInstanceMaintainTimeResponse
     */
    CompletableFuture<ModifyInstanceMaintainTimeResponse> modifyInstanceMaintainTime(ModifyInstanceMaintainTimeRequest request);

    /**
     * <b>description</b> :
     * <p>The ID of the cluster.</p>
     * 
     * @param request the request parameters of ModifyWhiteIps  ModifyWhiteIpsRequest
     * @return ModifyWhiteIpsResponse
     */
    CompletableFuture<ModifyWhiteIpsResponse> modifyWhiteIps(ModifyWhiteIpsRequest request);

    /**
     * @param request the request parameters of MoveResourceGroup  MoveResourceGroupRequest
     * @return MoveResourceGroupResponse
     */
    CompletableFuture<MoveResourceGroupResponse> moveResourceGroup(MoveResourceGroupRequest request);

    /**
     * @param request the request parameters of OpenDiagnosis  OpenDiagnosisRequest
     * @return OpenDiagnosisResponse
     */
    CompletableFuture<OpenDiagnosisResponse> openDiagnosis(OpenDiagnosisRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> To ensure data security, we recommend that you enable HTTPS.</p>
     * </blockquote>
     * 
     * @param request the request parameters of OpenHttps  OpenHttpsRequest
     * @return OpenHttpsResponse
     */
    CompletableFuture<OpenHttpsResponse> openHttps(OpenHttpsRequest request);

    /**
     * @param request the request parameters of PostEmonTryAlarmRule  PostEmonTryAlarmRuleRequest
     * @return PostEmonTryAlarmRuleResponse
     */
    CompletableFuture<PostEmonTryAlarmRuleResponse> postEmonTryAlarmRule(PostEmonTryAlarmRuleRequest request);

    /**
     * @param request the request parameters of RecommendTemplates  RecommendTemplatesRequest
     * @return RecommendTemplatesResponse
     */
    CompletableFuture<RecommendTemplatesResponse> recommendTemplates(RecommendTemplatesRequest request);

    /**
     * @param request the request parameters of ReinstallCollector  ReinstallCollectorRequest
     * @return ReinstallCollectorResponse
     */
    CompletableFuture<ReinstallCollectorResponse> reinstallCollector(ReinstallCollectorRequest request);

    /**
     * @param request the request parameters of RemoveApm  RemoveApmRequest
     * @return RemoveApmResponse
     */
    CompletableFuture<RemoveApmResponse> removeApm(RemoveApmRequest request);

    /**
     * @param request the request parameters of RenewInstance  RenewInstanceRequest
     * @return RenewInstanceResponse
     */
    CompletableFuture<RenewInstanceResponse> renewInstance(RenewInstanceRequest request);

    /**
     * @param request the request parameters of RenewLogstash  RenewLogstashRequest
     * @return RenewLogstashResponse
     */
    CompletableFuture<RenewLogstashResponse> renewLogstash(RenewLogstashRequest request);

    /**
     * @param request the request parameters of RestartCollector  RestartCollectorRequest
     * @return RestartCollectorResponse
     */
    CompletableFuture<RestartCollectorResponse> restartCollector(RestartCollectorRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> After the instance is restarted, the instance enters the activating state. After the instance is restarted, its status changes to active. Alibaba Cloud Elasticsearch supports restarting a single node. Restarting a node can be divided into normal restart and blue-green restart.</p>
     * </blockquote>
     * 
     * @param request the request parameters of RestartInstance  RestartInstanceRequest
     * @return RestartInstanceResponse
     */
    CompletableFuture<RestartInstanceResponse> restartInstance(RestartInstanceRequest request);

    /**
     * @param request the request parameters of RestartLogstash  RestartLogstashRequest
     * @return RestartLogstashResponse
     */
    CompletableFuture<RestartLogstashResponse> restartLogstash(RestartLogstashRequest request);

    /**
     * @param request the request parameters of ResumeElasticsearchTask  ResumeElasticsearchTaskRequest
     * @return ResumeElasticsearchTaskResponse
     */
    CompletableFuture<ResumeElasticsearchTaskResponse> resumeElasticsearchTask(ResumeElasticsearchTaskRequest request);

    /**
     * @param request the request parameters of ResumeLogstashTask  ResumeLogstashTaskRequest
     * @return ResumeLogstashTaskResponse
     */
    CompletableFuture<ResumeLogstashTaskResponse> resumeLogstashTask(ResumeLogstashTaskRequest request);

    /**
     * @param request the request parameters of RolloverDataStream  RolloverDataStreamRequest
     * @return RolloverDataStreamResponse
     */
    CompletableFuture<RolloverDataStreamResponse> rolloverDataStream(RolloverDataStreamRequest request);

    /**
     * @param request the request parameters of RunPipelines  RunPipelinesRequest
     * @return RunPipelinesResponse
     */
    CompletableFuture<RunPipelinesResponse> runPipelines(RunPipelinesRequest request);

    /**
     * @param request the request parameters of ShrinkNode  ShrinkNodeRequest
     * @return ShrinkNodeResponse
     */
    CompletableFuture<ShrinkNodeResponse> shrinkNode(ShrinkNodeRequest request);

    /**
     * @param request the request parameters of StartApm  StartApmRequest
     * @return StartApmResponse
     */
    CompletableFuture<StartApmResponse> startApm(StartApmRequest request);

    /**
     * @param request the request parameters of StartCollector  StartCollectorRequest
     * @return StartCollectorResponse
     */
    CompletableFuture<StartCollectorResponse> startCollector(StartCollectorRequest request);

    /**
     * @param request the request parameters of StopApm  StopApmRequest
     * @return StopApmResponse
     */
    CompletableFuture<StopApmResponse> stopApm(StopApmRequest request);

    /**
     * @param request the request parameters of StopCollector  StopCollectorRequest
     * @return StopCollectorResponse
     */
    CompletableFuture<StopCollectorResponse> stopCollector(StopCollectorRequest request);

    /**
     * @param request the request parameters of StopPipelines  StopPipelinesRequest
     * @return StopPipelinesResponse
     */
    CompletableFuture<StopPipelinesResponse> stopPipelines(StopPipelinesRequest request);

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @param request the request parameters of TransferNode  TransferNodeRequest
     * @return TransferNodeResponse
     */
    CompletableFuture<TransferNodeResponse> transferNode(TransferNodeRequest request);

    /**
     * @param request the request parameters of TriggerNetwork  TriggerNetworkRequest
     * @return TriggerNetworkResponse
     */
    CompletableFuture<TriggerNetworkResponse> triggerNetwork(TriggerNetworkRequest request);

    /**
     * @param request the request parameters of UninstallKibanaPlugin  UninstallKibanaPluginRequest
     * @return UninstallKibanaPluginResponse
     */
    CompletableFuture<UninstallKibanaPluginResponse> uninstallKibanaPlugin(UninstallKibanaPluginRequest request);

    /**
     * @param request the request parameters of UninstallLogstashPlugin  UninstallLogstashPluginRequest
     * @return UninstallLogstashPluginResponse
     */
    CompletableFuture<UninstallLogstashPluginResponse> uninstallLogstashPlugin(UninstallLogstashPluginRequest request);

    /**
     * @param request the request parameters of UninstallPlugin  UninstallPluginRequest
     * @return UninstallPluginResponse
     */
    CompletableFuture<UninstallPluginResponse> uninstallPlugin(UninstallPluginRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You can only delete user tags.<blockquote>
     * <p>User labels are manually added to instances by users. A system Tag is a tag that Alibaba Cloud services add to instances. System labels are divided into visible labels and invisible labels.</p>
     * </blockquote>
     * </li>
     * <li>If you delete a resource tag relationship that is not associated with any resources, you must delete the tags.</li>
     * </ul>
     * 
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF\<em>\</em>\<em>\</em></p>
     * 
     * @param request the request parameters of UpdateAdminPassword  UpdateAdminPasswordRequest
     * @return UpdateAdminPasswordResponse
     */
    CompletableFuture<UpdateAdminPasswordResponse> updateAdminPassword(UpdateAdminPasswordRequest request);

    /**
     * @param request the request parameters of UpdateAdvancedSetting  UpdateAdvancedSettingRequest
     * @return UpdateAdvancedSettingResponse
     */
    CompletableFuture<UpdateAdvancedSettingResponse> updateAdvancedSetting(UpdateAdvancedSettingRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>Elasticsearch V5.X clusters do not support the analysis-aliws plug-in.</li>
     * <li>If the dictionary file is stored in an Object Storage Service (OSS) bucket, you must make sure that the access control list (ACL) of the bucket is public read.</li>
     * <li>If you do not set sourceType to ORIGIN for an uploaded dictionary file, the file will be deleted after you call this operation.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateAliwsDict  UpdateAliwsDictRequest
     * @return UpdateAliwsDictResponse
     */
    CompletableFuture<UpdateAliwsDictResponse> updateAliwsDict(UpdateAliwsDictRequest request);

    /**
     * @param request the request parameters of UpdateApm  UpdateApmRequest
     * @return UpdateApmResponse
     */
    CompletableFuture<UpdateApmResponse> updateApm(UpdateApmRequest request);

    /**
     * @deprecated OpenAPI UpdateBlackIps is deprecated  * @param request  the request parameters of UpdateBlackIps  UpdateBlackIpsRequest
     * @return UpdateBlackIpsResponse
     */
    @Deprecated
    CompletableFuture<UpdateBlackIpsResponse> updateBlackIps(UpdateBlackIpsRequest request);

    /**
     * @param request the request parameters of UpdateCollector  UpdateCollectorRequest
     * @return UpdateCollectorResponse
     */
    CompletableFuture<UpdateCollectorResponse> updateCollector(UpdateCollectorRequest request);

    /**
     * @param request the request parameters of UpdateCollectorName  UpdateCollectorNameRequest
     * @return UpdateCollectorNameResponse
     */
    CompletableFuture<UpdateCollectorNameResponse> updateCollectorName(UpdateCollectorNameRequest request);

    /**
     * @param request the request parameters of UpdateComponentIndex  UpdateComponentIndexRequest
     * @return UpdateComponentIndexResponse
     */
    CompletableFuture<UpdateComponentIndexResponse> updateComponentIndex(UpdateComponentIndexRequest request);

    /**
     * @param request the request parameters of UpdateDescription  UpdateDescriptionRequest
     * @return UpdateDescriptionResponse
     */
    CompletableFuture<UpdateDescriptionResponse> updateDescription(UpdateDescriptionRequest request);

    /**
     * @param request the request parameters of UpdateDiagnosisSettings  UpdateDiagnosisSettingsRequest
     * @return UpdateDiagnosisSettingsResponse
     */
    CompletableFuture<UpdateDiagnosisSettingsResponse> updateDiagnosisSettings(UpdateDiagnosisSettingsRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If the dictionary file is stored in an Object Storage Service (OSS) bucket, you must make sure that the access control list (ACL) of the bucket is public read.</li>
     * <li>If you do not set sourceType to ORIGIN for an uploaded dictionary file, the file will be deleted after you call this operation.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateDict  UpdateDictRequest
     * @return UpdateDictResponse
     */
    CompletableFuture<UpdateDictResponse> updateDict(UpdateDictRequest request);

    /**
     * @param request the request parameters of UpdateDynamicSettings  UpdateDynamicSettingsRequest
     * @return UpdateDynamicSettingsResponse
     */
    CompletableFuture<UpdateDynamicSettingsResponse> updateDynamicSettings(UpdateDynamicSettingsRequest request);

    /**
     * @param request the request parameters of UpdateExtendConfig  UpdateExtendConfigRequest
     * @return UpdateExtendConfigResponse
     */
    CompletableFuture<UpdateExtendConfigResponse> updateExtendConfig(UpdateExtendConfigRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items: You can call this operation only to delete the driver files that are uploaded to a Logstash cluster in the Alibaba Cloud Management Console. You can add or modify driver files only in the Alibaba Cloud Management Console.</p>
     * 
     * @param request the request parameters of UpdateExtendfiles  UpdateExtendfilesRequest
     * @return UpdateExtendfilesResponse
     */
    CompletableFuture<UpdateExtendfilesResponse> updateExtendfiles(UpdateExtendfilesRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If the dictionary file is stored in an Object Storage Service (OSS) bucket, you must make sure that the access control list (ACL) of the bucket is public read.</li>
     * <li>If you do not set sourceType to ORIGIN for an uploaded dictionary file, the file will be deleted after you call this operation.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateHotIkDicts  UpdateHotIkDictsRequest
     * @return UpdateHotIkDictsResponse
     */
    CompletableFuture<UpdateHotIkDictsResponse> updateHotIkDicts(UpdateHotIkDictsRequest request);

    /**
     * @param request the request parameters of UpdateILMPolicy  UpdateILMPolicyRequest
     * @return UpdateILMPolicyResponse
     */
    CompletableFuture<UpdateILMPolicyResponse> updateILMPolicy(UpdateILMPolicyRequest request);

    /**
     * @param request the request parameters of UpdateIndexTemplate  UpdateIndexTemplateRequest
     * @return UpdateIndexTemplateResponse
     */
    CompletableFuture<UpdateIndexTemplateResponse> updateIndexTemplate(UpdateIndexTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>es-cn-n6w1ptcb30009\<em>\</em>\<em>\</em></p>
     * 
     * @param request the request parameters of UpdateInstance  UpdateInstanceRequest
     * @return UpdateInstanceResponse
     */
    CompletableFuture<UpdateInstanceResponse> updateInstance(UpdateInstanceRequest request);

    /**
     * @param request the request parameters of UpdateInstanceChargeType  UpdateInstanceChargeTypeRequest
     * @return UpdateInstanceChargeTypeResponse
     */
    CompletableFuture<UpdateInstanceChargeTypeResponse> updateInstanceChargeType(UpdateInstanceChargeTypeRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:
     * When the instance is in the activating, invalid, or inactive state, you cannot update the configuration.</p>
     * 
     * @param request the request parameters of UpdateInstanceSettings  UpdateInstanceSettingsRequest
     * @return UpdateInstanceSettingsResponse
     */
    CompletableFuture<UpdateInstanceSettingsResponse> updateInstanceSettings(UpdateInstanceSettingsRequest request);

    /**
     * @param request the request parameters of UpdateKibanaPvlNetwork  UpdateKibanaPvlNetworkRequest
     * @return UpdateKibanaPvlNetworkResponse
     */
    CompletableFuture<UpdateKibanaPvlNetworkResponse> updateKibanaPvlNetwork(UpdateKibanaPvlNetworkRequest request);

    /**
     * @param request the request parameters of UpdateKibanaSettings  UpdateKibanaSettingsRequest
     * @return UpdateKibanaSettingsResponse
     */
    CompletableFuture<UpdateKibanaSettingsResponse> updateKibanaSettings(UpdateKibanaSettingsRequest request);

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, you must make sure that the cluster is not in the activating, invalid, or inactive state.</p>
     * <ul>
     * <li>You can update an IP address whitelist by using the following parameters:<ul>
     * <li>kibanaIPWhitelist</li>
     * <li>modifyMode and whiteIpGroup</li>
     * </ul>
     * </li>
     * <li>You cannot specify private IP addresses for public IP address whitelists and cannot specify public IP addresses for private IP address whitelists.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateKibanaWhiteIps  UpdateKibanaWhiteIpsRequest
     * @return UpdateKibanaWhiteIpsResponse
     */
    CompletableFuture<UpdateKibanaWhiteIpsResponse> updateKibanaWhiteIps(UpdateKibanaWhiteIpsRequest request);

    /**
     * @param request the request parameters of UpdateLogstash  UpdateLogstashRequest
     * @return UpdateLogstashResponse
     */
    CompletableFuture<UpdateLogstashResponse> updateLogstash(UpdateLogstashRequest request);

    /**
     * @param request the request parameters of UpdateLogstashChargeType  UpdateLogstashChargeTypeRequest
     * @return UpdateLogstashChargeTypeResponse
     */
    CompletableFuture<UpdateLogstashChargeTypeResponse> updateLogstashChargeType(UpdateLogstashChargeTypeRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items: You cannot change the name of a cluster that is in the activating, invalid, or inactive state.</p>
     * 
     * @param request the request parameters of UpdateLogstashDescription  UpdateLogstashDescriptionRequest
     * @return UpdateLogstashDescriptionResponse
     */
    CompletableFuture<UpdateLogstashDescriptionResponse> updateLogstashDescription(UpdateLogstashDescriptionRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:
     * If the instance is in the Active (activating), Invalid (invalid), and Inactive (inactive) state, the information cannot be updated.</p>
     * 
     * @param request the request parameters of UpdateLogstashSettings  UpdateLogstashSettingsRequest
     * @return UpdateLogstashSettingsResponse
     */
    CompletableFuture<UpdateLogstashSettingsResponse> updateLogstashSettings(UpdateLogstashSettingsRequest request);

    /**
     * @param request the request parameters of UpdatePipelineManagementConfig  UpdatePipelineManagementConfigRequest
     * @return UpdatePipelineManagementConfigResponse
     */
    CompletableFuture<UpdatePipelineManagementConfigResponse> updatePipelineManagementConfig(UpdatePipelineManagementConfigRequest request);

    /**
     * @param request the request parameters of UpdatePipelines  UpdatePipelinesRequest
     * @return UpdatePipelinesResponse
     */
    CompletableFuture<UpdatePipelinesResponse> updatePipelines(UpdatePipelinesRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> In the following returned example, only the parameters in the returned data list are guaranteed to be included, and the parameters not mentioned are for reference only. For more information about the parameters, see <a href="https://help.aliyun.com/document_detail/142230.html">ListInstance</a>. You cannot force a dependency in a program to get these parameters.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdatePrivateNetworkWhiteIps  UpdatePrivateNetworkWhiteIpsRequest
     * @return UpdatePrivateNetworkWhiteIpsResponse
     */
    CompletableFuture<UpdatePrivateNetworkWhiteIpsResponse> updatePrivateNetworkWhiteIps(UpdatePrivateNetworkWhiteIpsRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:
     * When the instance is in the activating, invalid, or inactive state, its configuration cannot be updated.</p>
     * 
     * @param request the request parameters of UpdatePublicNetwork  UpdatePublicNetworkRequest
     * @return UpdatePublicNetworkResponse
     */
    CompletableFuture<UpdatePublicNetworkResponse> updatePublicNetwork(UpdatePublicNetworkRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> In the following example, only the parameters in the returned data list are guaranteed to be included. The parameters that are not mentioned are for reference only. For more information about the parameters, see <a href="https://help.aliyun.com/document_detail/142230.html">ListInstance</a>. You cannot force a dependency in a program to get these parameters.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdatePublicWhiteIps  UpdatePublicWhiteIpsRequest
     * @return UpdatePublicWhiteIpsResponse
     */
    CompletableFuture<UpdatePublicWhiteIpsResponse> updatePublicWhiteIps(UpdatePublicWhiteIpsRequest request);

    /**
     * @param request the request parameters of UpdateReadWritePolicy  UpdateReadWritePolicyRequest
     * @return UpdateReadWritePolicyResponse
     */
    CompletableFuture<UpdateReadWritePolicyResponse> updateReadWritePolicy(UpdateReadWritePolicyRequest request);

    /**
     * @param request the request parameters of UpdateSnapshotSetting  UpdateSnapshotSettingRequest
     * @return UpdateSnapshotSettingResponse
     */
    CompletableFuture<UpdateSnapshotSettingResponse> updateSnapshotSetting(UpdateSnapshotSettingRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If the dictionary file is stored in an Object Storage Service (OSS) bucket, you must make sure that the access control list (ACL) of the bucket is public read.</li>
     * <li>If you do not set sourceType to ORIGIN for an uploaded dictionary file, the file will be deleted after you call this operation.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateSynonymsDicts  UpdateSynonymsDictsRequest
     * @return UpdateSynonymsDictsResponse
     */
    CompletableFuture<UpdateSynonymsDictsResponse> updateSynonymsDicts(UpdateSynonymsDictsRequest request);

    /**
     * @param request the request parameters of UpdateTemplate  UpdateTemplateRequest
     * @return UpdateTemplateResponse
     */
    CompletableFuture<UpdateTemplateResponse> updateTemplate(UpdateTemplateRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>For more information about the parameters displayed in the following sample code but not provided in the preceding tables, see <a href="https://help.aliyun.com/document_detail/142230.html">ListInstance</a>. You cannot force your program to obtain these parameters.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateWhiteIps  UpdateWhiteIpsRequest
     * @return UpdateWhiteIpsResponse
     */
    CompletableFuture<UpdateWhiteIpsResponse> updateWhiteIps(UpdateWhiteIpsRequest request);

    /**
     * @param request the request parameters of UpdateXpackMonitorConfig  UpdateXpackMonitorConfigRequest
     * @return UpdateXpackMonitorConfigResponse
     */
    CompletableFuture<UpdateXpackMonitorConfigResponse> updateXpackMonitorConfig(UpdateXpackMonitorConfigRequest request);

    /**
     * <b>description</b> :
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF\<em>\</em>\<em>\</em></p>
     * 
     * @param request the request parameters of UpgradeEngineVersion  UpgradeEngineVersionRequest
     * @return UpgradeEngineVersionResponse
     */
    CompletableFuture<UpgradeEngineVersionResponse> upgradeEngineVersion(UpgradeEngineVersionRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Before you enable the X-Pack Monitoring feature for a Logstash cluster, you must associate the Logstash cluster with an Elasticsearch cluster. This way, you can view the monitoring data of the Logstash cluster in the Kibana console of the Elasticsearch cluster.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ValidateConnection  ValidateConnectionRequest
     * @return ValidateConnectionResponse
     */
    CompletableFuture<ValidateConnectionResponse> validateConnection(ValidateConnectionRequest request);

    /**
     * @param request the request parameters of ValidateShrinkNodes  ValidateShrinkNodesRequest
     * @return ValidateShrinkNodesResponse
     */
    CompletableFuture<ValidateShrinkNodesResponse> validateShrinkNodes(ValidateShrinkNodesRequest request);

    /**
     * @param request the request parameters of ValidateSlrPermission  ValidateSlrPermissionRequest
     * @return ValidateSlrPermissionResponse
     */
    CompletableFuture<ValidateSlrPermissionResponse> validateSlrPermission(ValidateSlrPermissionRequest request);

    /**
     * @param request the request parameters of ValidateTransferableNodes  ValidateTransferableNodesRequest
     * @return ValidateTransferableNodesResponse
     */
    CompletableFuture<ValidateTransferableNodesResponse> validateTransferableNodes(ValidateTransferableNodesRequest request);

    /**
     * <b>description</b> :
     * <p>The configurations of warm nodes.</p>
     * 
     * @param request the request parameters of createInstance  CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

}
