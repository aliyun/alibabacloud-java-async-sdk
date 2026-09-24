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
     * <b>description</b> :
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/317694.html">Store massive amounts of data through OpenStore</a>.</p>
     * 
     * @param request the request parameters of CreateComponentIndex  CreateComponentIndexRequest
     * @return CreateComponentIndexResponse
     */
    CompletableFuture<CreateComponentIndexResponse> createComponentIndex(CreateComponentIndexRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The data stream name you create must correspond one-to-one with the index pattern in the index template, and the index template must have data stream enabled. For example, if the index pattern in the index template is ds-*, the corresponding data stream name should be ds-.</p>
     * </blockquote>
     * 
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
     * <b>description</b> :
     * <p>Before calling this operation, note the following:</p>
     * <ul>
     * <li>Make sure that you are familiar with the billing methods and pricing of Logstash. &lt;props=&quot;china&quot;&gt;<ph>For more information, see <a href="https://help.aliyun.com/document_detail/260882.html">Billing overview</a>.</ph></li>
     * <li>To create an instance, complete real-name verification. &lt;props=&quot;china&quot;&gt;<ph>For more information, see <a href="https://help.aliyun.com/document_detail/37175.html">Real-name verification</a>.</ph></li>
     * </ul>
     * 
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
     * <p>For more information about this API, see <a href="https://help.aliyun.com/document_detail/279559.html">Configure private network connectivity for an instance</a>.</p>
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
     * <b>description</b> :
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/317694.html">Implement massive data storage through OpenStore</a>.</p>
     * 
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
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>Deleting a data stream also deletes its backing indexes. Proceed with caution.- To delete an index template that has associated data streams, delete the associated data streams first. On the data stream list page, view the data stream details to find the index template that the data stream matches.</li>
     * </ul>
     * </blockquote>
     * 
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
     * <b>description</b> :
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/317694.html">Store massive amounts of data through OpenStore</a>.</p>
     * 
     * @param request the request parameters of DeleteDeprecatedTemplate  DeleteDeprecatedTemplateRequest
     * @return DeleteDeprecatedTemplateResponse
     */
    CompletableFuture<DeleteDeprecatedTemplateResponse> deleteDeprecatedTemplate(DeleteDeprecatedTemplateRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You cannot delete a policy that is currently in use. If the policy is being used to manage any index, the request fails and returns an error.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteILMPolicy  DeleteILMPolicyRequest
     * @return DeleteILMPolicyResponse
     */
    CompletableFuture<DeleteILMPolicyResponse> deleteILMPolicy(DeleteILMPolicyRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Before deleting an index template, delete the data streams associated with the index template. Otherwise, the index template cannot be deleted.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteIndexTemplate  DeleteIndexTemplateRequest
     * @return DeleteIndexTemplateResponse
     */
    CompletableFuture<DeleteIndexTemplateResponse> deleteIndexTemplate(DeleteIndexTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>Before you invoke this operation, note the following:
     * Data cannot be recovered after the instance is released. Back up your data before releasing the instance. For more information, see <a href="https://help.aliyun.com/document_detail/65675.html">Snapshot backup and recovery commands</a>.</p>
     * 
     * @param request the request parameters of DeleteInstance  DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, note the following:
     * After the instance is released, all physical resources used by the instance are reclaimed, all related data is permanently lost and cannot be recovered, cloud disks mounted to the instance nodes are also released, and the corresponding snapshots are deleted.</p>
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
     * <p>Before installing a collector on an ACK cluster, call this operation to check the installation status of the Elasticsearch Operator on the target cluster.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeAckOperator  DescribeAckOperatorRequest
     * @return DescribeAckOperatorResponse
     */
    CompletableFuture<DescribeAckOperatorResponse> describeAckOperator(DescribeAckOperatorRequest request);

    /**
     * @param request the request parameters of DescribeCollector  DescribeCollectorRequest
     * @return DescribeCollectorResponse
     */
    CompletableFuture<DescribeCollectorResponse> describeCollector(DescribeCollectorRequest request);

    /**
     * <b>description</b> :
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/317694.html">Use OpenStore to store massive amounts of data</a>.</p>
     * 
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
     * <p>The instance health status. The following three states are supported:</p>
     * <ul>
     * <li>GREEN: Primary and replica shards are allocated normally.</li>
     * <li>YELLOW: Primary shards are allocated normally, but replica shards are not allocated normally.</li>
     * <li>RED: Primary shards are not allocated normally.</li>
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
     * <b>description</b> :
     * <p>This API operation is supported only for cloud-native instances. For legacy architecture instances, use the TriggerNetwork method.</p>
     * 
     * @param request the request parameters of DisableKibanaPvlNetwork  DisableKibanaPvlNetworkRequest
     * @return DisableKibanaPvlNetworkResponse
     */
    CompletableFuture<DisableKibanaPvlNetworkResponse> disableKibanaPvlNetwork(DisableKibanaPvlNetworkRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>This API operation is supported only for cloud-native instances. For legacy architecture instances, use the TriggerNetwork method.</li>
     * <li>The Kibana specifications must be greater than 1 vCPU and 2 GB of memory.</li>
     * </ol>
     * 
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
     * @param request the request parameters of GetEmonAlarmRecordStatisticsDistribute  GetEmonAlarmRecordStatisticsDistributeRequest
     * @return GetEmonAlarmRecordStatisticsDistributeResponse
     */
    CompletableFuture<GetEmonAlarmRecordStatisticsDistributeResponse> getEmonAlarmRecordStatisticsDistribute(GetEmonAlarmRecordStatisticsDistributeRequest request);

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
     * @param request the request parameters of GetKeystores  GetKeystoresRequest
     * @return GetKeystoresResponse
     */
    CompletableFuture<GetKeystoresResponse> getKeystores(GetKeystoresRequest request);

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
     * @param request the request parameters of GrayPublish  GrayPublishRequest
     * @return GrayPublishResponse
     */
    CompletableFuture<GrayPublishResponse> grayPublish(GrayPublishRequest request);

    /**
     * @param request the request parameters of InitModel  InitModelRequest
     * @return InitModelResponse
     */
    CompletableFuture<InitModelResponse> initModel(InitModelRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Before using a collector to collect logs from different data sources or performing cluster elastic scaling tasks (applicable to the China site), you must create a service-linked role.</p>
     * </blockquote>
     * 
     * @param request the request parameters of InitializeOperationRole  InitializeOperationRoleRequest
     * @return InitializeOperationRoleResponse
     */
    CompletableFuture<InitializeOperationRoleResponse> initializeOperationRole(InitializeOperationRoleRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Before installing a collector on an ACK cluster, call this operation to install Elasticsearch Operator on the target cluster.</p>
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
     * <p>Before calling this operation, note the following:
     * The plugins to be installed must be included in the Alibaba Cloud Logstash <a href="https://help.aliyun.com/document_detail/139626.html">default system plugin list</a>. External open source plugins are not supported.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>The custom plugin installation feature is undergoing an internal upgrade and is temporarily unavailable. If you urgently need this feature, submit a ticket to contact us.</p>
     * </blockquote>
     * 
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
     * @param request the request parameters of InvokeEsAgent  InvokeEsAgentRequest
     * @return InvokeEsAgentResponse
     */
    CompletableFuture<InvokeEsAgentResponse> invokeEsAgent(InvokeEsAgentRequest request);

<ReturnT> CompletableFuture<ReturnT> invokeEsAgentWithAsyncResponseHandler(InvokeEsAgentRequest request, AsyncResponseHandler<InvokeEsAgentResponse, ReturnT> responseHandler);

    ResponseIterable<InvokeEsAgentResponseBody> invokeEsAgentWithResponseIterable(InvokeEsAgentRequest request);

    /**
     * <b>description</b> :
     * <p>Refer to the following example for RAM user authorization. Replace the region, account, and other information as needed.</p>
     * <pre><code>{
     *     &quot;Version&quot;: &quot;1&quot;,
     *     &quot;Statement&quot;: [
     *         {
     *             &quot;Effect&quot;: &quot;Allow&quot;,
     *             &quot;Action&quot;: &quot;elasticsearch:InvokeEsRequest&quot;,
     *             &quot;Resource&quot;: &quot;*&quot;
     *         },
     *         {
     *             &quot;Effect&quot;: &quot;Allow&quot;,
     *             &quot;Action&quot;: &quot;elasticsearch:UseCredential&quot;,
     *             &quot;Resource&quot;: &quot;acs:elasticsearch:{#regionId}:{#accountId}:instances/{#instanceId}/credentials/{#credentialId}&quot;
     *         }
     *     ]
     * }
     * </code></pre>
     * 
     * @param request the request parameters of InvokeEsRequest  InvokeEsRequestRequest
     * @return InvokeEsRequestResponse
     */
    CompletableFuture<InvokeEsRequestResponse> invokeEsRequest(InvokeEsRequestRequest request);

    /**
     * @param request the request parameters of ListAckClusters  ListAckClustersRequest
     * @return ListAckClustersResponse
     */
    CompletableFuture<ListAckClustersResponse> listAckClusters(ListAckClustersRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is not recommended and will be taken offline soon.</p>
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
     * <b>description</b> :
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/317694.html">Store massive amounts of data through OpenStore</a>.</p>
     * 
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
     * <b>description</b> :
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/317694.html">Store massive amounts of data through OpenStore</a>.</p>
     * 
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
     * <blockquote>
     * <p>Notice:  Before calling this operation, create the AliyunElasticsearchAccessingOOSRole and AliyunOOSAccessingECS4ESRole service-linked roles. These roles allow the Elasticsearch service account to obtain ECS access permissions of the Alibaba Cloud account. For more information, see <a href="https://help.aliyun.com/document_detail/146446.html">Collect ECS service logs</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListEcsInstances  ListEcsInstancesRequest
     * @return ListEcsInstancesResponse
     */
    CompletableFuture<ListEcsInstancesResponse> listEcsInstances(ListEcsInstancesRequest request);

    /**
     * @param request the request parameters of ListEventRecords  ListEventRecordsRequest
     * @return ListEventRecordsResponse
     */
    CompletableFuture<ListEventRecordsResponse> listEventRecords(ListEventRecordsRequest request);

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
     * <b>description</b> :
     * <p>The ListInstanceIndices operation is applicable only to Elasticsearch instances that have indexing service enabled. We recommend that you use the Elasticsearch API to query index information. For more information, see <a href="https://www.elastic.co/guide/en/elasticsearch/reference/current/cat-indices.html">cat indices API</a>.</p>
     * 
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
     * <b>description</b> :
     * <p>This API operation supports only cloud-native instances.</p>
     * 
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
     * <b>description</b> :
     * <blockquote>
     * <p>Pipeline management is divided into configuration file management and Kibana pipeline management. Kibana pipeline management is not available in the console for some regions.</p>
     * </blockquote>
     * 
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
     * <p>Shard recovery is the process of synchronizing data from a primary shard to a replica shard. After recovery is complete, the replica shard is available for search.</p>
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
     * @param request the request parameters of ListStatsEventRecords  ListStatsEventRecordsRequest
     * @return ListStatsEventRecordsResponse
     */
    CompletableFuture<ListStatsEventRecordsResponse> listStatsEventRecords(ListStatsEventRecordsRequest request);

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
     * @param request the request parameters of ListUserPlugin  ListUserPluginRequest
     * @return ListUserPluginResponse
     */
    CompletableFuture<ListUserPluginResponse> listUserPlugin(ListUserPluginRequest request);

    /**
     * @param request the request parameters of ListVpcEndpoints  ListVpcEndpointsRequest
     * @return ListVpcEndpointsResponse
     */
    CompletableFuture<ListVpcEndpointsResponse> listVpcEndpoints(ListVpcEndpointsRequest request);

    /**
     * <b>description</b> :
     * <p>When you upgrade an instance and encounter insufficient inventory for the instance type in the current zone, you can resolve this issue by migrating zone nodes. Before calling this operation, ensure the following:</p>
     * <ul>
     * <li>Your account has a zone with sufficient resources.
     *  After migrating nodes of the current specifications to another zone, you need to manually <a href="https://help.aliyun.com/document_detail/96650.html">upgrade the cluster</a>. The cluster is not upgraded during the migration process. Therefore, select a zone with sufficient resources to avoid cluster upgrade failures. Select a zone with a later alphabetical order (for example, between cn-hangzhou-e and cn-hangzhou-h, select cn-hangzhou-h).</li>
     * <li>The cluster is in a healthy state.
     *  You can run the <code>GET _cat/health?v</code> command to check the cluster health status.</li>
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
     * <p>Before calling this operation, note the following information:</p>
     * <ul>
     * <li>Before formal maintenance begins, Alibaba Cloud sends SMS messages and emails to the contacts configured in your Alibaba Cloud account. Check your messages promptly.</li>
     * <li>On the day of instance maintenance, to ensure stability throughout the maintenance process, the instance enters an active state before the maintenance window. When the instance is in this state, access to the cluster and query operations (such as performance monitoring) are not affected, but cluster change operations (such as cluster upgrades and restarts) are temporarily unavailable.</li>
     * <li>During the maintenance window, transient disconnections may occur on the instance. Ensure that your application has a reconnection mechanism.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyInstanceMaintainTime  ModifyInstanceMaintainTimeRequest
     * @return ModifyInstanceMaintainTimeResponse
     */
    CompletableFuture<ModifyInstanceMaintainTimeResponse> modifyInstanceMaintainTime(ModifyInstanceMaintainTimeRequest request);

    /**
     * @param request the request parameters of ModifyScheduleExecuteTime  ModifyScheduleExecuteTimeRequest
     * @return ModifyScheduleExecuteTimeResponse
     */
    CompletableFuture<ModifyScheduleExecuteTimeResponse> modifyScheduleExecuteTime(ModifyScheduleExecuteTimeRequest request);

    /**
     * <b>description</b> :
     * <h2>Before you begin</h2>
     * <ul>
     * <li>You cannot update information for an instance whose instance status is activating, invalid, or freeze (inactive).</li>
     * <li>You can update the whitelist in two ways: IP whitelist list and IP whitelist group. The two methods cannot be used at the same time, and they support different parameters (except for InstanceId and clientToken):<ul>
     * <li>IP whitelist list: whiteIpList, nodeType, networkType</li>
     * <li>IP whitelist group: modifyMode, whiteIpGroup</li>
     * </ul>
     * </li>
     * <li>The public access whitelist does not support private IP addresses, and the private network access whitelist does not support public IP addresses.</li>
     * </ul>
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
     * <ul>
     * <li>To ensure data security, enable the HTTPS protocol.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>Except for versions 8.5, 7.16, &lt;props=&quot;china&quot;&gt;<ph>and version 7.10 in some regions</ph>, ensure that you have purchased client nodes before enabling HTTPS.</li>
     * </ul>
     * 
     * @param request the request parameters of OpenHttps  OpenHttpsRequest
     * @return OpenHttpsResponse
     */
    CompletableFuture<OpenHttpsResponse> openHttps(OpenHttpsRequest request);

    /**
     * @param request the request parameters of PluginAnalysis  PluginAnalysisRequest
     * @return PluginAnalysisResponse
     */
    CompletableFuture<PluginAnalysisResponse> pluginAnalysis(PluginAnalysisRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This API operation can be called up to 10 times per hour.</p>
     * </blockquote>
     * 
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
     * @param request the request parameters of RemovePlugin  RemovePluginRequest
     * @return RemovePluginResponse
     */
    CompletableFuture<RemovePluginResponse> removePlugin(RemovePluginRequest request);

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
     * <p>After the restart, the instance enters the activating state. After the restart is complete, the instance status changes to active. Alibaba Cloud Elasticsearch supports single-node restart. Node restart is classified into normal restart and blue-green restart.</p>
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
     * <b>description</b> :
     * <p>Note the following when you invoke this operation:
     * Before shrinking data nodes from a cluster, perform data migration from the nodes to be removed to other nodes. After you confirm that the nodes to be removed contain no data, proceed with the node shrinking operation.</p>
     * 
     * @param request the request parameters of ShrinkNode  ShrinkNodeRequest
     * @return ShrinkNodeResponse
     */
    CompletableFuture<ShrinkNodeResponse> shrinkNode(ShrinkNodeRequest request);

    /**
     * @param request the request parameters of StartCollector  StartCollectorRequest
     * @return StartCollectorResponse
     */
    CompletableFuture<StartCollectorResponse> startCollector(StartCollectorRequest request);

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
     * <b>description</b> :
     * <p>Disables an existing zone for a multi-zone instance. This operation is intended only for disaster recovery drills. Exercise caution when performing this operation.</p>
     * 
     * @param request the request parameters of TurnOffZone  TurnOffZoneRequest
     * @return TurnOffZoneResponse
     */
    CompletableFuture<TurnOffZoneResponse> turnOffZone(TurnOffZoneRequest request);

    /**
     * <b>description</b> :
     * <p>Reopens a zone that has been taken offline for a multi-zone instance. This operation is intended only for disaster recovery drills. Exercise caution when performing this operation.</p>
     * 
     * @param request the request parameters of TurnOnZone  TurnOnZoneRequest
     * @return TurnOnZoneResponse
     */
    CompletableFuture<TurnOnZoneResponse> turnOnZone(TurnOnZoneRequest request);

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
     * <p>When calling this operation, note the following:</p>
     * <ul>
     * <li><p>Only user tags can be deleted.</p>
     * <blockquote>
     * <p>User tags are tags that users manually add to instances. System tags are tags that Alibaba Cloud services add to user instances. System tags are classified into visible tags and invisible tags.</p>
     * </blockquote>
     * </li>
     * <li><p>If a tag is not associated with any resource after the tag relationship is deleted, the tag is also deleted.</p>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>When you invoke this operation, note the following:
     * You cannot update information when the instance status is activating, invalid, or freeze (inactive).</p>
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
     * <p>When calling this operation, note the following:</p>
     * <ul>
     * <li>Instances of version 5.x do not support the AliNLP tokenizer plugin.</li>
     * <li>If the dictionary file is sourced from OSS, ensure that the OSS bucket has public-read permission.</li>
     * <li>If a previously uploaded dictionary does not have the ORIGIN configuration, calling this operation will delete the dictionary file.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateAliwsDict  UpdateAliwsDictRequest
     * @return UpdateAliwsDictResponse
     */
    CompletableFuture<UpdateAliwsDictResponse> updateAliwsDict(UpdateAliwsDictRequest request);

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
     * <b>description</b> :
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/317694.html">Store massive amounts of data through OpenStore</a>.</p>
     * 
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
     * <p>When calling this operation, note the following:</p>
     * <ul>
     * <li>If the dictionary file is sourced from OSS, ensure that the OSS bucket has public-read permission.</li>
     * <li>If a previously uploaded dictionary is not configured with ORIGIN, the dictionary file will be deleted after this operation is called.</li>
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
     * <p>When calling this operation, note the following: Currently, this operation only supports deleting extension files that have been uploaded through the console. To add or modify extension files, perform the operations in the console.</p>
     * 
     * @param request the request parameters of UpdateExtendfiles  UpdateExtendfilesRequest
     * @return UpdateExtendfilesResponse
     */
    CompletableFuture<UpdateExtendfilesResponse> updateExtendfiles(UpdateExtendfilesRequest request);

    /**
     * @param request the request parameters of UpdateFalconSeek  UpdateFalconSeekRequest
     * @return UpdateFalconSeekResponse
     */
    CompletableFuture<UpdateFalconSeekResponse> updateFalconSeek(UpdateFalconSeekRequest request);

    /**
     * <b>description</b> :
     * <p>When calling this operation, note the following:</p>
     * <ul>
     * <li>If the dictionary file is sourced from OSS, ensure that the OSS bucket has public-read permission.</li>
     * <li>If a previously uploaded dictionary is not configured with ORIGIN, the dictionary file will be deleted after this operation is called.</li>
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
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You cannot change the configuration when the instance status is activating, invalid, or inactive (freeze).</li>
     * <li>If the cluster has a high load and indexes have no replicas, and a large number of write or query requests exist during the upgrade or decrease the quota procedure, occasional access timeout may occur. Configure a retry mechanism on the client before you change the cluster configuration to reduce the impact on your business.</li>
     * <li>You can change the configuration of only one type of node at a time (data node, dedicated master node, warm node, client node, Kibana node, or elastic node).</li>
     * <li>For the health and stability of your cluster, since May 2021, Alibaba Cloud Elasticsearch no longer supports the purchase of 1-vCPU 2 GiB instances, 2-vCPU 2 GiB dedicated master nodes, or version 7.4 instances. If you have confirmed that the purchased specifications are no longer available for sale, perform the following operations first:<ul>
     * <li>For 1-vCPU 2 GiB and 2-vCPU 2 GiB specifications, upgrade to a stable specification available on the buy page in advance. For available specifications on the buy page, see &lt;props=&quot;china&quot;&gt;<ph><a href="https://help.aliyun.com/document_detail/97672.html">Buy page parameters (commercial edition)</a> or <a href="https://help.aliyun.com/document_detail/143091.html">Buy page parameters (Advanced Edition)</a></ph>&lt;props=&quot;intl&quot;&gt;<a href="https://help.aliyun.com/document_detail/163243.html">Buy page parameters</a>.</li>
     * <li>For version 7.4, purchase a version 7.10 instance and then migrate data. &lt;props=&quot;china&quot;&gt;<ph>For data migration, see <a href="https://help.aliyun.com/document_detail/96650.html">Migration solution selection guide</a>.</ph>
     * For more precautions, see <a href="https://help.aliyun.com/document_detail/96650.html">Upgrade cluster configuration</a> and <a href="https://help.aliyun.com/document_detail/198887.html">Downgrade cluster configuration</a>.</li>
     * </ul>
     * </li>
     * </ul>
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
     * <p>When you invoke this operation, note the following:
     * You cannot update the configuration when the instance status is activating, invalid, or inactive (freeze).</p>
     * 
     * @param request the request parameters of UpdateInstanceSettings  UpdateInstanceSettingsRequest
     * @return UpdateInstanceSettingsResponse
     */
    CompletableFuture<UpdateInstanceSettingsResponse> updateInstanceSettings(UpdateInstanceSettingsRequest request);

    /**
     * @param request the request parameters of UpdateKeystores  UpdateKeystoresRequest
     * @return UpdateKeystoresResponse
     */
    CompletableFuture<UpdateKeystoresResponse> updateKeystores(UpdateKeystoresRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>This API operation supports only cloud-native instances. For legacy architecture instances, use the TriggerNetwork method.</li>
     * <li>The Kibana specifications must be greater than 1 vCPU and 2 GB of memory.</li>
     * </ol>
     * 
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
     * @param request the request parameters of UpdateKibanaSso  UpdateKibanaSsoRequest
     * @return UpdateKibanaSsoResponse
     */
    CompletableFuture<UpdateKibanaSsoResponse> updateKibanaSso(UpdateKibanaSsoRequest request);

    /**
     * <b>description</b> :
     * <h2>Before you begin</h2>
     * <ul>
     * <li>When you invoke this operation, you cannot update information when the instance status is activating, invalid, or freeze (inactive).</li>
     * <li>You can update the whitelist in two ways: IP whitelist list and IP whitelist group. The two methods cannot be used simultaneously, and apart from InstanceId and clientToken, the two methods support different parameters as follows: <ul>
     * <li>IP whitelist list: kibanaIPWhitelist</li>
     * <li>IP whitelist group: modifyMode, whiteIpGroup</li>
     * </ul>
     * </li>
     * <li>The public access whitelist does not support private IP addresses, and the internal-facing access whitelist does not support public IP addresses.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateKibanaWhiteIps  UpdateKibanaWhiteIpsRequest
     * @return UpdateKibanaWhiteIpsResponse
     */
    CompletableFuture<UpdateKibanaWhiteIpsResponse> updateKibanaWhiteIps(UpdateKibanaWhiteIpsRequest request);

    /**
     * <b>description</b> :
     * <h3>Before you begin</h3>
     * <p>You cannot modify instance information when the instance status is activating, invalid, or freeze (inactive).</p>
     * 
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
     * <p>When you invoke this operation, note the following: The instance name cannot be modified when the instance status is activating, invalid, or freeze (inactive).</p>
     * 
     * @param request the request parameters of UpdateLogstashDescription  UpdateLogstashDescriptionRequest
     * @return UpdateLogstashDescriptionResponse
     */
    CompletableFuture<UpdateLogstashDescriptionResponse> updateLogstashDescription(UpdateLogstashDescriptionRequest request);

    /**
     * <b>description</b> :
     * <p>When you invoke this operation, note the following: The instance configuration cannot be updated when the instance status is activating, invalid, or freeze (inactive).</p>
     * 
     * @param request the request parameters of UpdateLogstashSettings  UpdateLogstashSettingsRequest
     * @return UpdateLogstashSettingsResponse
     */
    CompletableFuture<UpdateLogstashSettingsResponse> updateLogstashSettings(UpdateLogstashSettingsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Pipeline management methods include configuration file management and Kibana pipeline management. The console no longer supports Kibana pipeline management. You can use this feature only through the API.</p>
     * </blockquote>
     * 
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
     * <h2>Before you begin</h2>
     * <ul>
     * <li>You cannot update the VPC private network access whitelist of an instance when the instance status is Activating (activating), Invalid (invalid), or Freeze (inactive).</li>
     * <li>You can update the whitelist in two ways: IP whitelist list and IP whitelist group. The two methods cannot be used at the same time, and they support different parameters (except for InstanceId and clientToken):<ul>
     * <li>IP whitelist list: privateNetworkIpWhiteList</li>
     * <li>IP whitelist group: modifyMode, whiteIpGroup</li>
     * </ul>
     * </li>
     * <li>The public network access whitelist does not support private IP addresses, and the private network access whitelist does not support public IP addresses.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdatePrivateNetworkWhiteIps  UpdatePrivateNetworkWhiteIpsRequest
     * @return UpdatePrivateNetworkWhiteIpsResponse
     */
    CompletableFuture<UpdatePrivateNetworkWhiteIpsResponse> updatePrivateNetworkWhiteIps(UpdatePrivateNetworkWhiteIpsRequest request);

    /**
     * <b>description</b> :
     * <p>When you invoke this operation, note the following:
     * You cannot update information when the instance status is activating, invalid, or freeze (inactive).</p>
     * 
     * @param request the request parameters of UpdatePublicNetwork  UpdatePublicNetworkRequest
     * @return UpdatePublicNetworkResponse
     */
    CompletableFuture<UpdatePublicNetworkResponse> updatePublicNetwork(UpdatePublicNetworkRequest request);

    /**
     * <b>description</b> :
     * <h2>Before you begin</h2>
     * <ul>
     * <li>You cannot update the public access whitelist of an instance when the instance status is activating, invalid, or inactive (freeze).</li>
     * <li>You can update the whitelist in two ways: IP whitelist list and IP whitelist group. The two methods cannot be used at the same time, and they support different parameters (except for InstanceId and clientToken). The details are as follows:   <ul>
     * <li>IP whitelist list: publicIpWhitelist</li>
     * <li>IP whitelist group: modifyMode, whiteIpGroup</li>
     * </ul>
     * </li>
     * <li>The public access whitelist does not support private IP addresses, and the internal-facing access whitelist does not support public IP addresses.</li>
     * </ul>
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
     * <p>When calling this operation, note the following:</p>
     * <ul>
     * <li>If the dictionary file is sourced from OSS, ensure that the OSS bucket has public-read permission.</li>
     * <li>If a previously uploaded dictionary is not configured with ORIGIN, the dictionary file will be deleted after this operation is called.</li>
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
     * <h2>Before you begin</h2>
     * <ul>
     * <li>You cannot update information when the instance status is activating, invalid, or freeze (inactive).</li>
     * <li>You can update the whitelist in two ways: IP whitelist list and IP whitelist group. The two methods cannot be used simultaneously, and they support different parameters (except for InstanceId and clientToken). The details are as follows: <ul>
     * <li>IP whitelist list: esIPWhitelist</li>
     * <li>IP whitelist group: modifyMode, whiteIpGroup</li>
     * </ul>
     * </li>
     * <li>The public access whitelist does not support private IP addresses, and the private network access whitelist does not support public IP addresses.</li>
     * </ul>
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
     * <blockquote>
     * <p>The instance version upgrade feature currently supports only upgrading from version 5.5.3 to 5.6.16, from version 5.6.16 to 6.3.2, and from version 6.3.2 to 6.7.0. Upgrades between other versions are not supported. For more information, see <a href="https://help.aliyun.com/document_detail/148786.html">Upgrade version</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpgradeEngineVersion  UpgradeEngineVersionRequest
     * @return UpgradeEngineVersionResponse
     */
    CompletableFuture<UpgradeEngineVersionResponse> upgradeEngineVersion(UpgradeEngineVersionRequest request);

    /**
     * @param request the request parameters of UpgradeInfo  UpgradeInfoRequest
     * @return UpgradeInfoResponse
     */
    CompletableFuture<UpgradeInfoResponse> upgradeInfo(UpgradeInfoRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>To enable X-Pack monitoring for Logstash, configure an Elasticsearch instance. After the configuration, you can monitor the Logstash instance in the Kibana console of the corresponding Elasticsearch instance.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>Before you use a collector to collect logs from different data sources, you must authorize the creation of a service-linked role. Call this operation to check whether the service-linked role has been created.</p>
     * </blockquote>
     * 
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
     * <h3>Precautions</h3>
     * <ul>
     * <li>Before using this operation, make sure that you fully understand the billing methods and pricing of Elasticsearch. For more information, see <a href="https://help.aliyun.com/document_detail/260947.html">Alibaba Cloud Elasticsearch billing rules</a>.</li>
     * <li>You must complete real-name verification before creating an instance.&lt;props=&quot;china&quot;&gt;<ph> For more information, see <a href="https://help.aliyun.com/document_detail/37175.html">Real-name verification</a>.</ph></li>
     * <li>You do not need to specify a zone when creating an instance. The instance is created in the same zone as the selected VPC by default.</li>
     * </ul>
     * 
     * @param request the request parameters of createInstance  CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

}
