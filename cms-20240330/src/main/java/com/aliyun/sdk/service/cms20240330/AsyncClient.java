// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cms20240330.models.*;
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
     * @param request the request parameters of AddContexts  AddContextsRequest
     * @return AddContextsResponse
     */
    CompletableFuture<AddContextsResponse> addContexts(AddContextsRequest request);

    /**
     * @param request the request parameters of AddMemories  AddMemoriesRequest
     * @return AddMemoriesResponse
     */
    CompletableFuture<AddMemoriesResponse> addMemories(AddMemoriesRequest request);

    /**
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a site monitoring task.</p>
     * 
     * @param request the request parameters of CreateAddonRelease  CreateAddonReleaseRequest
     * @return CreateAddonReleaseResponse
     */
    CompletableFuture<CreateAddonReleaseResponse> createAddonRelease(CreateAddonReleaseRequest request);

    /**
     * @param request the request parameters of CreateAggTaskGroup  CreateAggTaskGroupRequest
     * @return CreateAggTaskGroupResponse
     */
    CompletableFuture<CreateAggTaskGroupResponse> createAggTaskGroup(CreateAggTaskGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a webhook notification recipient.</p>
     * 
     * @param request the request parameters of CreateAlertWebhook  CreateAlertWebhookRequest
     * @return CreateAlertWebhookResponse
     */
    CompletableFuture<CreateAlertWebhookResponse> createAlertWebhook(CreateAlertWebhookRequest request);

    /**
     * @param request the request parameters of CreateBizTrace  CreateBizTraceRequest
     * @return CreateBizTraceResponse
     */
    CompletableFuture<CreateBizTraceResponse> createBizTrace(CreateBizTraceRequest request);

    /**
     * @param request the request parameters of CreateCloudResource  CreateCloudResourceRequest
     * @return CreateCloudResourceResponse
     */
    CompletableFuture<CreateCloudResourceResponse> createCloudResource(CreateCloudResourceRequest request);

    /**
     * @param request the request parameters of CreateContextStore  CreateContextStoreRequest
     * @return CreateContextStoreResponse
     */
    CompletableFuture<CreateContextStoreResponse> createContextStore(CreateContextStoreRequest request);

    /**
     * @param request the request parameters of CreateContextStoreAPIKey  CreateContextStoreAPIKeyRequest
     * @return CreateContextStoreAPIKeyResponse
     */
    CompletableFuture<CreateContextStoreAPIKeyResponse> createContextStoreAPIKey(CreateContextStoreAPIKeyRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a data pipeline in a specified workspace.</p>
     * 
     * @param request the request parameters of CreateDataPipeline  CreateDataPipelineRequest
     * @return CreateDataPipelineResponse
     */
    CompletableFuture<CreateDataPipelineResponse> createDataPipeline(CreateDataPipelineRequest request);

    /**
     * @param request the request parameters of CreateDataset  CreateDatasetRequest
     * @return CreateDatasetResponse
     */
    CompletableFuture<CreateDatasetResponse> createDataset(CreateDatasetRequest request);

    /**
     * @param request the request parameters of CreateDeliveryTask  CreateDeliveryTaskRequest
     * @return CreateDeliveryTaskResponse
     */
    CompletableFuture<CreateDeliveryTaskResponse> createDeliveryTask(CreateDeliveryTaskRequest request);

    /**
     * @param request the request parameters of CreateEntityStore  CreateEntityStoreRequest
     * @return CreateEntityStoreResponse
     */
    CompletableFuture<CreateEntityStoreResponse> createEntityStore(CreateEntityStoreRequest request);

    /**
     * <b>description</b> :
     * <p>This operation creates an event integration.</p>
     * 
     * @param request the request parameters of CreateIntegrationPolicy  CreateIntegrationPolicyRequest
     * @return CreateIntegrationPolicyResponse
     */
    CompletableFuture<CreateIntegrationPolicyResponse> createIntegrationPolicy(CreateIntegrationPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a silence policy in a specified workspace. A silence policy uses filterSetting to filter events. When the policy is enabled and the current time hits the configured effective rules, hit events do not trigger subscribe notifications, direct notifications, or global subscribe notifications. The events are still Normal and stored in the database.
     * When you create a silence policy, maintainWindowName and filterSetting are required. filterSetting must contain at least one condition. You do not have to configure any effective period. In this case, the policy does not hit any events. If you configure effective, you must also configure at least one of startTime, endTime, or effectTimeRange. Otherwise, the validation is failed. If a policy name already exists in the same workspace, the InvalidParameterValue error is returned. After the policy is created, the silence policy ID is returned.</p>
     * 
     * @param request the request parameters of CreateMaintainWindow  CreateMaintainWindowRequest
     * @return CreateMaintainWindowResponse
     */
    CompletableFuture<CreateMaintainWindowResponse> createMaintainWindow(CreateMaintainWindowRequest request);

    /**
     * @param request the request parameters of CreateMemoryStore  CreateMemoryStoreRequest
     * @return CreateMemoryStoreResponse
     */
    CompletableFuture<CreateMemoryStoreResponse> createMemoryStore(CreateMemoryStoreRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a notification policy in a specified workspace. The notifyStrategy field in the request body NotifyPolicyConfig is required, while subscription and responsePlan are optional. After the policy is created, the generated policy UUID and complete policy details are returned. If a policy with the same Policy Name already exists in the workspace, a ConflictName error is returned.</p>
     * 
     * @param request the request parameters of CreateNotifyPolicy  CreateNotifyPolicyRequest
     * @return CreateNotifyPolicyResponse
     */
    CompletableFuture<CreateNotifyPolicyResponse> createNotifyPolicy(CreateNotifyPolicyRequest request);

    /**
     * @param request the request parameters of CreatePipeline  CreatePipelineRequest
     * @return CreatePipelineResponse
     */
    CompletableFuture<CreatePipelineResponse> createPipeline(CreatePipelineRequest request);

    /**
     * @param request the request parameters of CreatePrometheusInstance  CreatePrometheusInstanceRequest
     * @return CreatePrometheusInstanceResponse
     */
    CompletableFuture<CreatePrometheusInstanceResponse> createPrometheusInstance(CreatePrometheusInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a site monitoring task.</p>
     * 
     * @param request the request parameters of CreatePrometheusView  CreatePrometheusViewRequest
     * @return CreatePrometheusViewResponse
     */
    CompletableFuture<CreatePrometheusViewResponse> createPrometheusView(CreatePrometheusViewRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a virtual instance for Prometheus monitoring.</p>
     * 
     * @param request the request parameters of CreatePrometheusVirtualInstance  CreatePrometheusVirtualInstanceRequest
     * @return CreatePrometheusVirtualInstanceResponse
     */
    CompletableFuture<CreatePrometheusVirtualInstanceResponse> createPrometheusVirtualInstance(CreatePrometheusVirtualInstanceRequest request);

    /**
     * @param request the request parameters of CreateService  CreateServiceRequest
     * @return CreateServiceResponse
     */
    CompletableFuture<CreateServiceResponse> createService(CreateServiceRequest request);

    /**
     * @param request the request parameters of CreateServiceObservability  CreateServiceObservabilityRequest
     * @return CreateServiceObservabilityResponse
     */
    CompletableFuture<CreateServiceObservabilityResponse> createServiceObservability(CreateServiceObservabilityRequest request);

    /**
     * @param request the request parameters of CreateServiceRecord  CreateServiceRecordRequest
     * @return CreateServiceRecordResponse
     */
    CompletableFuture<CreateServiceRecordResponse> createServiceRecord(CreateServiceRecordRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a service task for an application in a specified workspace.
     * Common use cases:</p>
     * <ul>
     * <li>heapdump: Triggers a JVM heap dump.</li>
     * <li>LiveDebug Probe: Dynamically instruments a target method (log, snapshot, metric, span, etc.).</li>
     * <li>LiveDebug Command: Performs a one-time active inspection (OGNL, decompilation, thread/memory information, etc.).</li>
     * <li>LiveDebug Code Replace: Performs hot code replacement.
     * After successful creation, a taskId is returned. You can manage the task by using GetServiceTask, ListServiceTask, or DeleteServiceTask. After a LiveDebug task is created, the configuration is synchronously delivered to ConfigServer.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateServiceTask  CreateServiceTaskRequest
     * @return CreateServiceTaskResponse
     */
    CompletableFuture<CreateServiceTaskResponse> createServiceTask(CreateServiceTaskRequest request);

    /**
     * @param request the request parameters of CreateTicket  CreateTicketRequest
     * @return CreateTicketResponse
     */
    CompletableFuture<CreateTicketResponse> createTicket(CreateTicketRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a Umodel configuration in a specified workspace.</p>
     * 
     * @param request the request parameters of CreateUmodel  CreateUmodelRequest
     * @return CreateUmodelResponse
     */
    CompletableFuture<CreateUmodelResponse> createUmodel(CreateUmodelRequest request);

    /**
     * @param request the request parameters of DeleteAddonRelease  DeleteAddonReleaseRequest
     * @return DeleteAddonReleaseResponse
     */
    CompletableFuture<DeleteAddonReleaseResponse> deleteAddonRelease(DeleteAddonReleaseRequest request);

    /**
     * @param request the request parameters of DeleteAggTaskGroup  DeleteAggTaskGroupRequest
     * @return DeleteAggTaskGroupResponse
     */
    CompletableFuture<DeleteAggTaskGroupResponse> deleteAggTaskGroup(DeleteAggTaskGroupRequest request);

    /**
     * @param request the request parameters of DeleteAlertWebhooks  DeleteAlertWebhooksRequest
     * @return DeleteAlertWebhooksResponse
     */
    CompletableFuture<DeleteAlertWebhooksResponse> deleteAlertWebhooks(DeleteAlertWebhooksRequest request);

    /**
     * @param request the request parameters of DeleteBizTrace  DeleteBizTraceRequest
     * @return DeleteBizTraceResponse
     */
    CompletableFuture<DeleteBizTraceResponse> deleteBizTrace(DeleteBizTraceRequest request);

    /**
     * @param request the request parameters of DeleteCloudResource  DeleteCloudResourceRequest
     * @return DeleteCloudResourceResponse
     */
    CompletableFuture<DeleteCloudResourceResponse> deleteCloudResource(DeleteCloudResourceRequest request);

    /**
     * @param request the request parameters of DeleteContext  DeleteContextRequest
     * @return DeleteContextResponse
     */
    CompletableFuture<DeleteContextResponse> deleteContext(DeleteContextRequest request);

    /**
     * @param request the request parameters of DeleteContextStore  DeleteContextStoreRequest
     * @return DeleteContextStoreResponse
     */
    CompletableFuture<DeleteContextStoreResponse> deleteContextStore(DeleteContextStoreRequest request);

    /**
     * @param request the request parameters of DeleteContextStoreAPIKey  DeleteContextStoreAPIKeyRequest
     * @return DeleteContextStoreAPIKeyResponse
     */
    CompletableFuture<DeleteContextStoreAPIKeyResponse> deleteContextStoreAPIKey(DeleteContextStoreAPIKeyRequest request);

    /**
     * @param request the request parameters of DeleteContexts  DeleteContextsRequest
     * @return DeleteContextsResponse
     */
    CompletableFuture<DeleteContextsResponse> deleteContexts(DeleteContextsRequest request);

    /**
     * <b>description</b> :
     * <p>Deletes a data pipeline from a specified workspace.</p>
     * 
     * @param request the request parameters of DeleteDataPipeline  DeleteDataPipelineRequest
     * @return DeleteDataPipelineResponse
     */
    CompletableFuture<DeleteDataPipelineResponse> deleteDataPipeline(DeleteDataPipelineRequest request);

    /**
     * @param request the request parameters of DeleteDataset  DeleteDatasetRequest
     * @return DeleteDatasetResponse
     */
    CompletableFuture<DeleteDatasetResponse> deleteDataset(DeleteDatasetRequest request);

    /**
     * @param request the request parameters of DeleteDeliveryTask  DeleteDeliveryTaskRequest
     * @return DeleteDeliveryTaskResponse
     */
    CompletableFuture<DeleteDeliveryTaskResponse> deleteDeliveryTask(DeleteDeliveryTaskRequest request);

    /**
     * @param request the request parameters of DeleteEntityStore  DeleteEntityStoreRequest
     * @return DeleteEntityStoreResponse
     */
    CompletableFuture<DeleteEntityStoreResponse> deleteEntityStore(DeleteEntityStoreRequest request);

    /**
     * @param request the request parameters of DeleteIntegrationPolicy  DeleteIntegrationPolicyRequest
     * @return DeleteIntegrationPolicyResponse
     */
    CompletableFuture<DeleteIntegrationPolicyResponse> deleteIntegrationPolicy(DeleteIntegrationPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>Deletes a specified silence policy. After the deletion succeeds, the service refreshes the runtime cache through asynchronous messages. Therefore, events may still be processed based on the deleted policy for a short period of time. If the specified silence policy does not exist, a ResourceNotFound error is returned.</p>
     * 
     * @param request the request parameters of DeleteMaintainWindow  DeleteMaintainWindowRequest
     * @return DeleteMaintainWindowResponse
     */
    CompletableFuture<DeleteMaintainWindowResponse> deleteMaintainWindow(DeleteMaintainWindowRequest request);

    /**
     * @param request the request parameters of DeleteMemories  DeleteMemoriesRequest
     * @return DeleteMemoriesResponse
     */
    CompletableFuture<DeleteMemoriesResponse> deleteMemories(DeleteMemoriesRequest request);

    /**
     * @param request the request parameters of DeleteMemory  DeleteMemoryRequest
     * @return DeleteMemoryResponse
     */
    CompletableFuture<DeleteMemoryResponse> deleteMemory(DeleteMemoryRequest request);

    /**
     * @param request the request parameters of DeleteMemoryStore  DeleteMemoryStoreRequest
     * @return DeleteMemoryStoreResponse
     */
    CompletableFuture<DeleteMemoryStoreResponse> deleteMemoryStore(DeleteMemoryStoreRequest request);

    /**
     * <b>description</b> :
     * <p>Deletes a notification policy by specifying the workspace and uuid. Returns success to indicate the deletion result and the uuid of the deleted policy.</p>
     * 
     * @param request the request parameters of DeleteNotifyPolicy  DeleteNotifyPolicyRequest
     * @return DeleteNotifyPolicyResponse
     */
    CompletableFuture<DeleteNotifyPolicyResponse> deleteNotifyPolicy(DeleteNotifyPolicyRequest request);

    /**
     * @param request the request parameters of DeletePipeline  DeletePipelineRequest
     * @return DeletePipelineResponse
     */
    CompletableFuture<DeletePipelineResponse> deletePipeline(DeletePipelineRequest request);

    /**
     * <b>description</b> :
     * <p>Deletes a Prometheus instance.</p>
     * 
     * @param request the request parameters of DeletePrometheusInstance  DeletePrometheusInstanceRequest
     * @return DeletePrometheusInstanceResponse
     */
    CompletableFuture<DeletePrometheusInstanceResponse> deletePrometheusInstance(DeletePrometheusInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>Deletes a Prometheus view instance.</p>
     * 
     * @param request the request parameters of DeletePrometheusView  DeletePrometheusViewRequest
     * @return DeletePrometheusViewResponse
     */
    CompletableFuture<DeletePrometheusViewResponse> deletePrometheusView(DeletePrometheusViewRequest request);

    /**
     * @param request the request parameters of DeletePrometheusVirtualInstance  DeletePrometheusVirtualInstanceRequest
     * @return DeletePrometheusVirtualInstanceResponse
     */
    CompletableFuture<DeletePrometheusVirtualInstanceResponse> deletePrometheusVirtualInstance(DeletePrometheusVirtualInstanceRequest request);

    /**
     * @param request the request parameters of DeleteService  DeleteServiceRequest
     * @return DeleteServiceResponse
     */
    CompletableFuture<DeleteServiceResponse> deleteService(DeleteServiceRequest request);

    /**
     * <b>description</b> :
     * <p>Deletes a created service association entry.</p>
     * 
     * @param request the request parameters of DeleteServiceRecord  DeleteServiceRecordRequest
     * @return DeleteServiceRecordResponse
     */
    CompletableFuture<DeleteServiceRecordResponse> deleteServiceRecord(DeleteServiceRecordRequest request);

    /**
     * <b>description</b> :
     * <p>Deletes a specified service task by taskId.
     * heapdump: Simultaneously deletes the corresponding heap dump record.
     * LiveDebug: After deleting the task record, synchronously updates the live_debug aggregation configuration on ConfigServer.</p>
     * 
     * @param request the request parameters of DeleteServiceTask  DeleteServiceTaskRequest
     * @return DeleteServiceTaskResponse
     */
    CompletableFuture<DeleteServiceTaskResponse> deleteServiceTask(DeleteServiceTaskRequest request);

    /**
     * <b>description</b> :
     * <p>Deletes a Umodel from a specified workspace.</p>
     * 
     * @param request the request parameters of DeleteUmodel  DeleteUmodelRequest
     * @return DeleteUmodelResponse
     */
    CompletableFuture<DeleteUmodelResponse> deleteUmodel(DeleteUmodelRequest request);

    /**
     * @param request the request parameters of DeleteUmodelCommonSchemaRef  DeleteUmodelCommonSchemaRefRequest
     * @return DeleteUmodelCommonSchemaRefResponse
     */
    CompletableFuture<DeleteUmodelCommonSchemaRefResponse> deleteUmodelCommonSchemaRef(DeleteUmodelCommonSchemaRefRequest request);

    /**
     * <b>description</b> :
     * <p>Deletes Umodel data from a specified workspace.</p>
     * 
     * @param request the request parameters of DeleteUmodelData  DeleteUmodelDataRequest
     * @return DeleteUmodelDataResponse
     */
    CompletableFuture<DeleteUmodelDataResponse> deleteUmodelData(DeleteUmodelDataRequest request);

    /**
     * @param request the request parameters of DeleteWorkspace  DeleteWorkspaceRequest
     * @return DeleteWorkspaceResponse
     */
    CompletableFuture<DeleteWorkspaceResponse> deleteWorkspace(DeleteWorkspaceRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the details of CloudMonitor monitoring metrics metadata.</p>
     * 
     * @param request the request parameters of DescribeMetricMetaList  DescribeMetricMetaListRequest
     * @return DescribeMetricMetaListResponse
     */
    CompletableFuture<DescribeMetricMetaListResponse> describeMetricMetaList(DescribeMetricMetaListRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * <b>description</b> :
     * <p>Pauses a specified silence policy. After the policy is paused, the service refreshes the runtime cache by using asynchronous messages. After the refresh is complete, the policy no longer participates in event silence evaluation. Events may still be processed based on the pre-pause state for a short period of time. If the specified silence policy does not exist, a ResourceNotFound error is returned.</p>
     * 
     * @param request the request parameters of DisableMaintainWindow  DisableMaintainWindowRequest
     * @return DisableMaintainWindowResponse
     */
    CompletableFuture<DisableMaintainWindowResponse> disableMaintainWindow(DisableMaintainWindowRequest request);

    /**
     * <b>description</b> :
     * <p>Disables a notification policy by specifying the workspace and uuid (path parameter). Returns success and the policy uuid.</p>
     * 
     * @param request the request parameters of DisableNotifyPolicy  DisableNotifyPolicyRequest
     * @return DisableNotifyPolicyResponse
     */
    CompletableFuture<DisableNotifyPolicyResponse> disableNotifyPolicy(DisableNotifyPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>Enables a specified silence policy. After the policy is enabled, the service refreshes the runtime cache through asynchronous messages. After the refresh is complete, events that match the filter conditions of the policy and fall within the effective period do not trigger notifications. Events may still be processed based on the pre-enablement state for a short period. If the specified silence policy does not exist, a ResourceNotFound error is returned.</p>
     * 
     * @param request the request parameters of EnableMaintainWindow  EnableMaintainWindowRequest
     * @return EnableMaintainWindowResponse
     */
    CompletableFuture<EnableMaintainWindowResponse> enableMaintainWindow(EnableMaintainWindowRequest request);

    /**
     * <b>description</b> :
     * <p>Enables a notification policy by specifying the workspace and uuid path parameters. Returns success and the policy uuid.</p>
     * 
     * @param request the request parameters of EnableNotifyPolicy  EnableNotifyPolicyRequest
     * @return EnableNotifyPolicyResponse
     */
    CompletableFuture<EnableNotifyPolicyResponse> enableNotifyPolicy(EnableNotifyPolicyRequest request);

    /**
     * @param request the request parameters of ExecuteQuery  ExecuteQueryRequest
     * @return ExecuteQueryResponse
     */
    CompletableFuture<ExecuteQueryResponse> executeQuery(ExecuteQueryRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the details of an add-on.</p>
     * 
     * @param request the request parameters of GetAddon  GetAddonRequest
     * @return GetAddonResponse
     */
    CompletableFuture<GetAddonResponse> getAddon(GetAddonRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example of how to modify version <code>1</code> of alert template <code>123456</code>. In this example, the alert level is set to <code>Critical</code>, the statistical method is set to <code>Average</code>, the comparison operator for the alert threshold is set to <code>GreaterThanOrEqualToThreshold</code>, the alert threshold is set to <code>90</code>, and the number of retries is set to <code>3</code>. The response indicates that the alert template was successfully modified.</p>
     * 
     * @param request the request parameters of GetAddonCodeTemplate  GetAddonCodeTemplateRequest
     * @return GetAddonCodeTemplateResponse
     */
    CompletableFuture<GetAddonCodeTemplateResponse> getAddonCodeTemplate(GetAddonCodeTemplateRequest request);

    /**
     * @param request the request parameters of GetAddonRelease  GetAddonReleaseRequest
     * @return GetAddonReleaseResponse
     */
    CompletableFuture<GetAddonReleaseResponse> getAddonRelease(GetAddonReleaseRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the schema of an add-on.</p>
     * 
     * @param request the request parameters of GetAddonSchema  GetAddonSchemaRequest
     * @return GetAddonSchemaResponse
     */
    CompletableFuture<GetAddonSchemaResponse> getAddonSchema(GetAddonSchemaRequest request);

    /**
     * @param request the request parameters of GetAggTaskGroup  GetAggTaskGroupRequest
     * @return GetAggTaskGroupResponse
     */
    CompletableFuture<GetAggTaskGroupResponse> getAggTaskGroup(GetAggTaskGroupRequest request);

    /**
     * @param request the request parameters of GetBizTrace  GetBizTraceRequest
     * @return GetBizTraceResponse
     */
    CompletableFuture<GetBizTraceResponse> getBizTrace(GetBizTraceRequest request);

    /**
     * @param request the request parameters of GetCloudResource  GetCloudResourceRequest
     * @return GetCloudResourceResponse
     */
    CompletableFuture<GetCloudResourceResponse> getCloudResource(GetCloudResourceRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation queries all entities of a specific cloud service within a specified time range.</li>
     * <li>The <code>from</code> and <code>to</code> parameters specify the time range of the query in seconds-level timestamps.</li>
     * <li>The <code>spl</code> parameter supports entityStore query statements to filter or select the required entities and their properties.</li>
     * <li>If you need only specific fields, use the <code>project</code> clause in <code>spl</code> to filter them.</li>
     * <li>The response contains the specific property values of each entity and the corresponding list of property names for easy parsing and processing.</li>
     * </ul>
     * 
     * @param request the request parameters of GetCloudResourceData  GetCloudResourceDataRequest
     * @return GetCloudResourceDataResponse
     */
    CompletableFuture<GetCloudResourceDataResponse> getCloudResourceData(GetCloudResourceDataRequest request);

    /**
     * <b>description</b> :
     * <p>The product and service request parameters cannot be specified in the same request.</p>
     * 
     * @param request the request parameters of GetCmsService  GetCmsServiceRequest
     * @return GetCmsServiceResponse
     */
    CompletableFuture<GetCmsServiceResponse> getCmsService(GetCmsServiceRequest request);

    /**
     * @param request the request parameters of GetContext  GetContextRequest
     * @return GetContextResponse
     */
    CompletableFuture<GetContextResponse> getContext(GetContextRequest request);

    /**
     * @param request the request parameters of GetContextStore  GetContextStoreRequest
     * @return GetContextStoreResponse
     */
    CompletableFuture<GetContextStoreResponse> getContextStore(GetContextStoreRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the configuration and running status of a data pipeline in a specified workspace.</p>
     * 
     * @param request the request parameters of GetDataPipeline  GetDataPipelineRequest
     * @return GetDataPipelineResponse
     */
    CompletableFuture<GetDataPipelineResponse> getDataPipeline(GetDataPipelineRequest request);

    /**
     * @param request the request parameters of GetDataset  GetDatasetRequest
     * @return GetDatasetResponse
     */
    CompletableFuture<GetDatasetResponse> getDataset(GetDatasetRequest request);

    /**
     * <b>description</b> :
     * <p>Deletes a specified site monitoring task.</p>
     * 
     * @param request the request parameters of GetDeliveryTask  GetDeliveryTaskRequest
     * @return GetDeliveryTaskResponse
     */
    CompletableFuture<GetDeliveryTaskResponse> getDeliveryTask(GetDeliveryTaskRequest request);

    /**
     * @param request the request parameters of GetEntityStore  GetEntityStoreRequest
     * @return GetEntityStoreResponse
     */
    CompletableFuture<GetEntityStoreResponse> getEntityStore(GetEntityStoreRequest request);

    /**
     * @param request the request parameters of GetEntityStoreData  GetEntityStoreDataRequest
     * @return GetEntityStoreDataResponse
     */
    CompletableFuture<GetEntityStoreDataResponse> getEntityStoreData(GetEntityStoreDataRequest request);

    /**
     * @param request the request parameters of GetIntegrationPolicy  GetIntegrationPolicyRequest
     * @return GetIntegrationPolicyResponse
     */
    CompletableFuture<GetIntegrationPolicyResponse> getIntegrationPolicy(GetIntegrationPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is not available in the API Explorer.</p>
     * 
     * @param request the request parameters of GetIntegrationVersionForCS  GetIntegrationVersionForCSRequest
     * @return GetIntegrationVersionForCSResponse
     */
    CompletableFuture<GetIntegrationVersionForCSResponse> getIntegrationVersionForCS(GetIntegrationVersionForCSRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the detailed configuration of a specified silence policy, including the policy name, description, enabled status, filter conditions, effective period configuration, creation time, and update time. The current query result does not return workspaceFilterSetting. If the specified silence policy does not exist, ResourceNotFound is returned.</p>
     * 
     * @param request the request parameters of GetMaintainWindow  GetMaintainWindowRequest
     * @return GetMaintainWindowResponse
     */
    CompletableFuture<GetMaintainWindowResponse> getMaintainWindow(GetMaintainWindowRequest request);

    /**
     * @param request the request parameters of GetMemories  GetMemoriesRequest
     * @return GetMemoriesResponse
     */
    CompletableFuture<GetMemoriesResponse> getMemories(GetMemoriesRequest request);

    /**
     * @param request the request parameters of GetMemory  GetMemoryRequest
     * @return GetMemoryResponse
     */
    CompletableFuture<GetMemoryResponse> getMemory(GetMemoryRequest request);

    /**
     * @param request the request parameters of GetMemoryHistory  GetMemoryHistoryRequest
     * @return GetMemoryHistoryResponse
     */
    CompletableFuture<GetMemoryHistoryResponse> getMemoryHistory(GetMemoryHistoryRequest request);

    /**
     * <b>description</b> :
     * <p>Typically used together with the QueryMetricMeta operation for querying metrics and the QueryMetricList/QueryMetricLast operation for querying monitoring data.</p>
     * <h2>Request type</h2>
     * <p>POST|GET.</p>
     * 
     * @param request the request parameters of GetMemoryStore  GetMemoryStoreRequest
     * @return GetMemoryStoreResponse
     */
    CompletableFuture<GetMemoryStoreResponse> getMemoryStore(GetMemoryStoreRequest request);

    /**
     * <b>description</b> :
     * <p>Queries a specified notification policy by workspace and UUID. If the UUID does not exist, a ResourceNotFound error is returned.</p>
     * 
     * @param request the request parameters of GetNotifyPolicy  GetNotifyPolicyRequest
     * @return GetNotifyPolicyResponse
     */
    CompletableFuture<GetNotifyPolicyResponse> getNotifyPolicy(GetNotifyPolicyRequest request);

    /**
     * @param request the request parameters of GetPipeline  GetPipelineRequest
     * @return GetPipelineResponse
     */
    CompletableFuture<GetPipelineResponse> getPipeline(GetPipelineRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the details of a Managed Service for Prometheus instance.</p>
     * 
     * @param request the request parameters of GetPrometheusInstance  GetPrometheusInstanceRequest
     * @return GetPrometheusInstanceResponse
     */
    CompletableFuture<GetPrometheusInstanceResponse> getPrometheusInstance(GetPrometheusInstanceRequest request);

    /**
     * @param request the request parameters of GetPrometheusUserSetting  GetPrometheusUserSettingRequest
     * @return GetPrometheusUserSettingResponse
     */
    CompletableFuture<GetPrometheusUserSettingResponse> getPrometheusUserSetting(GetPrometheusUserSettingRequest request);

    /**
     * <b>description</b> :
     * <p>Queries a specified Prometheus view instance.</p>
     * 
     * @param request the request parameters of GetPrometheusView  GetPrometheusViewRequest
     * @return GetPrometheusViewResponse
     */
    CompletableFuture<GetPrometheusViewResponse> getPrometheusView(GetPrometheusViewRequest request);

    /**
     * @param request the request parameters of GetService  GetServiceRequest
     * @return GetServiceResponse
     */
    CompletableFuture<GetServiceResponse> getService(GetServiceRequest request);

    /**
     * @param request the request parameters of GetServiceObservability  GetServiceObservabilityRequest
     * @return GetServiceObservabilityResponse
     */
    CompletableFuture<GetServiceObservabilityResponse> getServiceObservability(GetServiceObservabilityRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves a service-linked entry.</p>
     * 
     * @param request the request parameters of GetServiceRecord  GetServiceRecordRequest
     * @return GetServiceRecordResponse
     */
    CompletableFuture<GetServiceRecordResponse> getServiceRecord(GetServiceRecordRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the details of a single service task based on the taskId.
     * The response content varies depending on the type: heapdump returns heap dump task information; LiveDebug returns task records and fields such as taskConfig (extraInfo).</p>
     * 
     * @param request the request parameters of GetServiceTask  GetServiceTaskRequest
     * @return GetServiceTaskResponse
     */
    CompletableFuture<GetServiceTaskResponse> getServiceTask(GetServiceTaskRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the configuration of a Umodel.</p>
     * 
     * @param request the request parameters of GetUmodel  GetUmodelRequest
     * @return GetUmodelResponse
     */
    CompletableFuture<GetUmodelResponse> getUmodel(GetUmodelRequest request);

    /**
     * @param request the request parameters of GetUmodelCommonSchemaRef  GetUmodelCommonSchemaRefRequest
     * @return GetUmodelCommonSchemaRefResponse
     */
    CompletableFuture<GetUmodelCommonSchemaRefResponse> getUmodelCommonSchemaRef(GetUmodelCommonSchemaRefRequest request);

    /**
     * <b>description</b> :
     * <p>This operation retrieves the graph data associated with a Umodel.</p>
     * 
     * @param request the request parameters of GetUmodelData  GetUmodelDataRequest
     * @return GetUmodelDataResponse
     */
    CompletableFuture<GetUmodelDataResponse> getUmodelData(GetUmodelDataRequest request);

    /**
     * @param request the request parameters of GetWorkspace  GetWorkspaceRequest
     * @return GetWorkspaceResponse
     */
    CompletableFuture<GetWorkspaceResponse> getWorkspace(GetWorkspaceRequest request);

    /**
     * <b>description</b> :
     * <p>This operation retrieves a list of integration configurations.</p>
     * 
     * @param request the request parameters of ListAddonReleases  ListAddonReleasesRequest
     * @return ListAddonReleasesResponse
     */
    CompletableFuture<ListAddonReleasesResponse> listAddonReleases(ListAddonReleasesRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a site monitoring job.</p>
     * 
     * @param request the request parameters of ListAddons  ListAddonsRequest
     * @return ListAddonsResponse
     */
    CompletableFuture<ListAddonsResponse> listAddons(ListAddonsRequest request);

    /**
     * @param request the request parameters of ListAggTaskGroups  ListAggTaskGroupsRequest
     * @return ListAggTaskGroupsResponse
     */
    CompletableFuture<ListAggTaskGroupsResponse> listAggTaskGroups(ListAggTaskGroupsRequest request);

    /**
     * @param request the request parameters of ListAlertActions  ListAlertActionsRequest
     * @return ListAlertActionsResponse
     */
    CompletableFuture<ListAlertActionsResponse> listAlertActions(ListAlertActionsRequest request);

    /**
     * <b>description</b> :
     * <p>This operation can only query alert history from the last year.
     * This topic provides an example of querying the alert history of Elastic Computing Service from the <code>product</code> dimension of a cloud service.</p>
     * 
     * @param request the request parameters of ListAlertRobots  ListAlertRobotsRequest
     * @return ListAlertRobotsResponse
     */
    CompletableFuture<ListAlertRobotsResponse> listAlertRobots(ListAlertRobotsRequest request);

    /**
     * @param request the request parameters of ListAlertWebhooks  ListAlertWebhooksRequest
     * @return ListAlertWebhooksResponse
     */
    CompletableFuture<ListAlertWebhooksResponse> listAlertWebhooks(ListAlertWebhooksRequest request);

    /**
     * @param request the request parameters of ListBizTraces  ListBizTracesRequest
     * @return ListBizTracesResponse
     */
    CompletableFuture<ListBizTracesResponse> listBizTraces(ListBizTracesRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example of how to create an alert contact group named <code>ECS_Group</code>.</p>
     * 
     * @param request the request parameters of ListContactGroups  ListContactGroupsRequest
     * @return ListContactGroupsResponse
     */
    CompletableFuture<ListContactGroupsResponse> listContactGroups(ListContactGroupsRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example of how to create an alert contact group named <code>ECS_Group</code>.</p>
     * 
     * @param request the request parameters of ListContacts  ListContactsRequest
     * @return ListContactsResponse
     */
    CompletableFuture<ListContactsResponse> listContacts(ListContactsRequest request);

    /**
     * @param request the request parameters of ListContextStoreAPIKeys  ListContextStoreAPIKeysRequest
     * @return ListContextStoreAPIKeysResponse
     */
    CompletableFuture<ListContextStoreAPIKeysResponse> listContextStoreAPIKeys(ListContextStoreAPIKeysRequest request);

    /**
     * @param request the request parameters of ListContextStores  ListContextStoresRequest
     * @return ListContextStoresResponse
     */
    CompletableFuture<ListContextStoresResponse> listContextStores(ListContextStoresRequest request);

    /**
     * <b>description</b> :
     * <p>Uses a paged query to retrieve data stream pipelines in a specified workspace. Paging is supported.</p>
     * 
     * @param request the request parameters of ListDataPipelines  ListDataPipelinesRequest
     * @return ListDataPipelinesResponse
     */
    CompletableFuture<ListDataPipelinesResponse> listDataPipelines(ListDataPipelinesRequest request);

    /**
     * @param request the request parameters of ListDatasets  ListDatasetsRequest
     * @return ListDatasetsResponse
     */
    CompletableFuture<ListDatasetsResponse> listDatasets(ListDatasetsRequest request);

    /**
     * @param request the request parameters of ListDeliveryTasks  ListDeliveryTasksRequest
     * @return ListDeliveryTasksResponse
     */
    CompletableFuture<ListDeliveryTasksResponse> listDeliveryTasks(ListDeliveryTasksRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the integration list.</p>
     * 
     * @param request the request parameters of ListIntegrationPolicies  ListIntegrationPoliciesRequest
     * @return ListIntegrationPoliciesResponse
     */
    CompletableFuture<ListIntegrationPoliciesResponse> listIntegrationPolicies(ListIntegrationPoliciesRequest request);

    /**
     * <b>description</b> :
     * <p>Lists the add-ons that are installed for a specified policy.</p>
     * 
     * @param request the request parameters of ListIntegrationPolicyAddons  ListIntegrationPolicyAddonsRequest
     * @return ListIntegrationPolicyAddonsResponse
     */
    CompletableFuture<ListIntegrationPolicyAddonsResponse> listIntegrationPolicyAddons(ListIntegrationPolicyAddonsRequest request);

    /**
     * @param request the request parameters of ListIntegrationPolicyCollectors  ListIntegrationPolicyCollectorsRequest
     * @return ListIntegrationPolicyCollectorsResponse
     */
    CompletableFuture<ListIntegrationPolicyCollectorsResponse> listIntegrationPolicyCollectors(ListIntegrationPolicyCollectorsRequest request);

    /**
     * @param request the request parameters of ListIntegrationPolicyCustomScrapeJobRules  ListIntegrationPolicyCustomScrapeJobRulesRequest
     * @return ListIntegrationPolicyCustomScrapeJobRulesResponse
     */
    CompletableFuture<ListIntegrationPolicyCustomScrapeJobRulesResponse> listIntegrationPolicyCustomScrapeJobRules(ListIntegrationPolicyCustomScrapeJobRulesRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example of how to query a list of integration policy dashboards.</p>
     * 
     * @param request the request parameters of ListIntegrationPolicyDashboards  ListIntegrationPolicyDashboardsRequest
     * @return ListIntegrationPolicyDashboardsResponse
     */
    CompletableFuture<ListIntegrationPolicyDashboardsResponse> listIntegrationPolicyDashboards(ListIntegrationPolicyDashboardsRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the list of alert templates. The response shows that the alert template list contains two alert templates: <code>ECS_Template1</code> and <code>ECS_Template2</code>.</p>
     * 
     * @param request the request parameters of ListIntegrationPolicyPodMonitors  ListIntegrationPolicyPodMonitorsRequest
     * @return ListIntegrationPolicyPodMonitorsResponse
     */
    CompletableFuture<ListIntegrationPolicyPodMonitorsResponse> listIntegrationPolicyPodMonitors(ListIntegrationPolicyPodMonitorsRequest request);

    /**
     * @param request the request parameters of ListIntegrationPolicyServiceMonitors  ListIntegrationPolicyServiceMonitorsRequest
     * @return ListIntegrationPolicyServiceMonitorsResponse
     */
    CompletableFuture<ListIntegrationPolicyServiceMonitorsResponse> listIntegrationPolicyServiceMonitors(ListIntegrationPolicyServiceMonitorsRequest request);

    /**
     * <b>description</b> :
     * <p>When a policy is active, alert notifications are not sent for alerts that occur in the application group.
     * This topic provides an example of creating a policy named <code>PauseNotify</code>. This policy pauses alert notifications for application group <code>7301****</code> from <code>1622949300000</code> to <code>1623208500000</code> (from <code>2021-06-06 11:15:00</code> to <code>2021-06-09 11:15:00</code> UTC+8).</p>
     * 
     * @param request the request parameters of ListIntegrationPolicyStorageRequirements  ListIntegrationPolicyStorageRequirementsRequest
     * @return ListIntegrationPolicyStorageRequirementsResponse
     */
    CompletableFuture<ListIntegrationPolicyStorageRequirementsResponse> listIntegrationPolicyStorageRequirements(ListIntegrationPolicyStorageRequirementsRequest request);

    /**
     * <b>description</b> :
     * <p>Queries a paginated list of silence policies in a specified workspace. You can filter results by policy name (fuzzy match), policy ID (exact match), or enabled status. You can also sort results by creation time, update time, or enabled status. An empty list is returned when no matching items exist. The list items do not include workspaceFilterSetting.
     * When the number of returned items reaches maxResults, the response may contain a non-empty nextToken. A non-empty nextToken only indicates that more results may be available and does not guarantee that the next page contains data. An empty nextToken indicates the end of paging.</p>
     * 
     * @param request the request parameters of ListMaintainWindows  ListMaintainWindowsRequest
     * @return ListMaintainWindowsResponse
     */
    CompletableFuture<ListMaintainWindowsResponse> listMaintainWindows(ListMaintainWindowsRequest request);

    /**
     * @param request the request parameters of ListMemoryStores  ListMemoryStoresRequest
     * @return ListMemoryStoresResponse
     */
    CompletableFuture<ListMemoryStoresResponse> listMemoryStores(ListMemoryStoresRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the list of notify policies in a specified workspace with paging. You can filter results by name using fuzzy match. The response contains a list of NotifyPolicySummary lightweight views.</p>
     * 
     * @param request the request parameters of ListNotifyPolicies  ListNotifyPoliciesRequest
     * @return ListNotifyPoliciesResponse
     */
    CompletableFuture<ListNotifyPoliciesResponse> listNotifyPolicies(ListNotifyPoliciesRequest request);

    /**
     * @param request the request parameters of ListPipelines  ListPipelinesRequest
     * @return ListPipelinesResponse
     */
    CompletableFuture<ListPipelinesResponse> listPipelines(ListPipelinesRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the list of dashboards for a Managed Service for Prometheus instance.</p>
     * 
     * @param request the request parameters of ListPrometheusDashboards  ListPrometheusDashboardsRequest
     * @return ListPrometheusDashboardsResponse
     */
    CompletableFuture<ListPrometheusDashboardsResponse> listPrometheusDashboards(ListPrometheusDashboardsRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves a list of Managed Service for Prometheus instances.</p>
     * 
     * @param request the request parameters of ListPrometheusInstances  ListPrometheusInstancesRequest
     * @return ListPrometheusInstancesResponse
     */
    CompletableFuture<ListPrometheusInstancesResponse> listPrometheusInstances(ListPrometheusInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the list of Prometheus view instances.</p>
     * 
     * @param request the request parameters of ListPrometheusViews  ListPrometheusViewsRequest
     * @return ListPrometheusViewsResponse
     */
    CompletableFuture<ListPrometheusViewsResponse> listPrometheusViews(ListPrometheusViewsRequest request);

    /**
     * @param request the request parameters of ListPrometheusVirtualInstances  ListPrometheusVirtualInstancesRequest
     * @return ListPrometheusVirtualInstancesResponse
     */
    CompletableFuture<ListPrometheusVirtualInstancesResponse> listPrometheusVirtualInstances(ListPrometheusVirtualInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>Queries a paginated list of service-linked entries.</p>
     * 
     * @param request the request parameters of ListServiceRecords  ListServiceRecordsRequest
     * @return ListServiceRecordsResponse
     */
    CompletableFuture<ListServiceRecordsResponse> listServiceRecords(ListServiceRecordsRequest request);

    /**
     * <b>description</b> :
     * <p>Lists service tasks under an application by task type.</p>
     * <ul>
     * <li>type=heapdump: Returns the list of heap dump tasks.</li>
     * <li>type=pprof: Returns the list of pprof dumps (requires searchCondition).</li>
     * <li>type=live_debug_*: Returns the list of corresponding LiveDebug tasks.
     * Supports nextToken/maxResults pagination and searchCondition filtering.</li>
     * </ul>
     * 
     * @param request the request parameters of ListServiceTask  ListServiceTaskRequest
     * @return ListServiceTaskResponse
     */
    CompletableFuture<ListServiceTaskResponse> listServiceTask(ListServiceTaskRequest request);

    /**
     * @param request the request parameters of ListServices  ListServicesRequest
     * @return ListServicesResponse
     */
    CompletableFuture<ListServicesResponse> listServices(ListServicesRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of ListWorkspaces  ListWorkspacesRequest
     * @return ListWorkspacesResponse
     */
    CompletableFuture<ListWorkspacesResponse> listWorkspaces(ListWorkspacesRequest request);

    /**
     * @param request the request parameters of ManageAlertRules  ManageAlertRulesRequest
     * @return ManageAlertRulesResponse
     */
    CompletableFuture<ManageAlertRulesResponse> manageAlertRules(ManageAlertRulesRequest request);

    /**
     * @param request the request parameters of OpenCmsService  OpenCmsServiceRequest
     * @return OpenCmsServiceResponse
     */
    CompletableFuture<OpenCmsServiceResponse> openCmsService(OpenCmsServiceRequest request);

    /**
     * <b>description</b> :
     * <p>Compiles a candidate configuration and queries read-only samples grouped by dataset within a specified time window.</p>
     * 
     * @param request the request parameters of PreviewDataPipeline  PreviewDataPipelineRequest
     * @return PreviewDataPipelineResponse
     */
    CompletableFuture<PreviewDataPipelineResponse> previewDataPipeline(PreviewDataPipelineRequest request);

    /**
     * @param request the request parameters of PutWorkspace  PutWorkspaceRequest
     * @return PutWorkspaceResponse
     */
    CompletableFuture<PutWorkspaceResponse> putWorkspace(PutWorkspaceRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example of how to query a list of alert templates. The response shows that the alert template list contains two alert templates: <code>ECS_Template1</code> and <code>ECS_Template2</code>.</p>
     * 
     * @param request the request parameters of QueryAlertRules  QueryAlertRulesRequest
     * @return QueryAlertRulesResponse
     */
    CompletableFuture<QueryAlertRulesResponse> queryAlertRules(QueryAlertRulesRequest request);

    /**
     * @param request the request parameters of SearchContext  SearchContextRequest
     * @return SearchContextResponse
     */
    CompletableFuture<SearchContextResponse> searchContext(SearchContextRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create a threshold alert rule for the cpu_total metric of the Elastic Computing Service <code>acs_ecs_dashboard</code> instance <code>i-uf6j91r34rnwawoo****</code>. The alert contact group of the alert rule is <code>ECS_Group</code>, the alert rule name is <code>test123</code>, the alert rule ID is <code>a151cd6023eacee2f0978e03863cc1697c89508****</code>, the statistical method for the Critical level is <code>Average</code>, the comparison operator for the Critical level is <code>GreaterThanOrEqualToThreshold</code>, the threshold for the Critical level is <code>90</code>, and the retry count for the Critical level is <code>3</code>.</p>
     * <blockquote>
     * <p>2024-08-15: Statistics validation is added. Only the Statistics value that corresponds to the metric can be specified. For information about how to obtain the value of this parameter, see <a href="https://www.alibabacloud.com/help/en/cms/support/appendix-1-metrics">Cloud service monitoring metrics</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of SearchMemories  SearchMemoriesRequest
     * @return SearchMemoriesResponse
     */
    CompletableFuture<SearchMemoriesResponse> searchMemories(SearchMemoriesRequest request);

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * @param request the request parameters of UpdateAddonRelease  UpdateAddonReleaseRequest
     * @return UpdateAddonReleaseResponse
     */
    CompletableFuture<UpdateAddonReleaseResponse> updateAddonRelease(UpdateAddonReleaseRequest request);

    /**
     * @param request the request parameters of UpdateAggTaskGroup  UpdateAggTaskGroupRequest
     * @return UpdateAggTaskGroupResponse
     */
    CompletableFuture<UpdateAggTaskGroupResponse> updateAggTaskGroup(UpdateAggTaskGroupRequest request);

    /**
     * @param request the request parameters of UpdateAggTaskGroupStatus  UpdateAggTaskGroupStatusRequest
     * @return UpdateAggTaskGroupStatusResponse
     */
    CompletableFuture<UpdateAggTaskGroupStatusResponse> updateAggTaskGroupStatus(UpdateAggTaskGroupStatusRequest request);

    /**
     * @param request the request parameters of UpdateAlertWebhook  UpdateAlertWebhookRequest
     * @return UpdateAlertWebhookResponse
     */
    CompletableFuture<UpdateAlertWebhookResponse> updateAlertWebhook(UpdateAlertWebhookRequest request);

    /**
     * @param request the request parameters of UpdateBizTrace  UpdateBizTraceRequest
     * @return UpdateBizTraceResponse
     */
    CompletableFuture<UpdateBizTraceResponse> updateBizTrace(UpdateBizTraceRequest request);

    /**
     * @param request the request parameters of UpdateContext  UpdateContextRequest
     * @return UpdateContextResponse
     */
    CompletableFuture<UpdateContextResponse> updateContext(UpdateContextRequest request);

    /**
     * <b>description</b> :
     * <p>Only Alibaba Cloud accounts that have activated Network Analysis and Monitoring can create one-time detection tasks.
     * This topic provides an example of how to create a one-time detection task. The detection task is named <code>task1</code>, the detection address is <code>http://www.aliyun.com</code>, the detection type is <code>HTTP</code>, and the number of detection points is <code>1</code>.</p>
     * 
     * @param request the request parameters of UpdateContextStore  UpdateContextStoreRequest
     * @return UpdateContextStoreResponse
     */
    CompletableFuture<UpdateContextStoreResponse> updateContextStore(UpdateContextStoreRequest request);

    /**
     * <b>description</b> :
     * <p>Modifies a specified data pipeline by using a complete candidate configuration.</p>
     * 
     * @param request the request parameters of UpdateDataPipeline  UpdateDataPipelineRequest
     * @return UpdateDataPipelineResponse
     */
    CompletableFuture<UpdateDataPipelineResponse> updateDataPipeline(UpdateDataPipelineRequest request);

    /**
     * @param request the request parameters of UpdateDataset  UpdateDatasetRequest
     * @return UpdateDatasetResponse
     */
    CompletableFuture<UpdateDatasetResponse> updateDataset(UpdateDatasetRequest request);

    /**
     * @param request the request parameters of UpdateDeliveryTask  UpdateDeliveryTaskRequest
     * @return UpdateDeliveryTaskResponse
     */
    CompletableFuture<UpdateDeliveryTaskResponse> updateDeliveryTask(UpdateDeliveryTaskRequest request);

    /**
     * @param request the request parameters of UpdateIntegrationPolicy  UpdateIntegrationPolicyRequest
     * @return UpdateIntegrationPolicyResponse
     */
    CompletableFuture<UpdateIntegrationPolicyResponse> updateIntegrationPolicy(UpdateIntegrationPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>Updates the configuration of a specified silence policy. If maintainWindowName is left empty, the original name is retained. The description, filterSetting, effective, effectTimeRange, startTime, and endTime fields are updated based on the values in the request body. If these fields are not provided, they are set to empty. Before submitting changes, call GetMaintainWindow to retrieve the current configuration.
     * This operation does not modify the enabled status of the policy. To enable or pause a policy, call EnableMaintainWindow or DisableMaintainWindow. Time configuration validation is the same as that for CreateMaintainWindow. If a policy name already exists in the same workspace, the InvalidParameterValue error code is returned. If the specified silence policy does not exist, the ResourceNotFound error code is returned.</p>
     * 
     * @param request the request parameters of UpdateMaintainWindow  UpdateMaintainWindowRequest
     * @return UpdateMaintainWindowResponse
     */
    CompletableFuture<UpdateMaintainWindowResponse> updateMaintainWindow(UpdateMaintainWindowRequest request);

    /**
     * @param request the request parameters of UpdateMemory  UpdateMemoryRequest
     * @return UpdateMemoryResponse
     */
    CompletableFuture<UpdateMemoryResponse> updateMemory(UpdateMemoryRequest request);

    /**
     * @param request the request parameters of UpdateMemoryStore  UpdateMemoryStoreRequest
     * @return UpdateMemoryStoreResponse
     */
    CompletableFuture<UpdateMemoryStoreResponse> updateMemoryStore(UpdateMemoryStoreRequest request);

    /**
     * <b>description</b> :
     * <p>Updates a notification policy by workspace and body (containing uuid and version). The version field is an optimistic lock version number that must match the current record on the backend. Otherwise, OptimisticLockFailed is returned. After a successful update, the latest policy details are returned.</p>
     * 
     * @param request the request parameters of UpdateNotifyPolicy  UpdateNotifyPolicyRequest
     * @return UpdateNotifyPolicyResponse
     */
    CompletableFuture<UpdateNotifyPolicyResponse> updateNotifyPolicy(UpdateNotifyPolicyRequest request);

    /**
     * @param request the request parameters of UpdateNotifyStrategy  UpdateNotifyStrategyRequest
     * @return UpdateNotifyStrategyResponse
     */
    CompletableFuture<UpdateNotifyStrategyResponse> updateNotifyStrategy(UpdateNotifyStrategyRequest request);

    /**
     * @param request the request parameters of UpdatePipeline  UpdatePipelineRequest
     * @return UpdatePipelineResponse
     */
    CompletableFuture<UpdatePipelineResponse> updatePipeline(UpdatePipelineRequest request);

    /**
     * <b>description</b> :
     * <p>Updates the information of a Managed Service for Prometheus instance.</p>
     * 
     * @param request the request parameters of UpdatePrometheusInstance  UpdatePrometheusInstanceRequest
     * @return UpdatePrometheusInstanceResponse
     */
    CompletableFuture<UpdatePrometheusInstanceResponse> updatePrometheusInstance(UpdatePrometheusInstanceRequest request);

    /**
     * @param request the request parameters of UpdatePrometheusUserSetting  UpdatePrometheusUserSettingRequest
     * @return UpdatePrometheusUserSettingResponse
     */
    CompletableFuture<UpdatePrometheusUserSettingResponse> updatePrometheusUserSetting(UpdatePrometheusUserSettingRequest request);

    /**
     * <b>description</b> :
     * <p>Updates the information about a Prometheus view instance.</p>
     * 
     * @param request the request parameters of UpdatePrometheusView  UpdatePrometheusViewRequest
     * @return UpdatePrometheusViewResponse
     */
    CompletableFuture<UpdatePrometheusViewResponse> updatePrometheusView(UpdatePrometheusViewRequest request);

    /**
     * @param request the request parameters of UpdateService  UpdateServiceRequest
     * @return UpdateServiceResponse
     */
    CompletableFuture<UpdateServiceResponse> updateService(UpdateServiceRequest request);

    /**
     * <b>description</b> :
     * <p>Updates an existing service-linked entry.</p>
     * 
     * @param request the request parameters of UpdateServiceRecord  UpdateServiceRecordRequest
     * @return UpdateServiceRecordResponse
     */
    CompletableFuture<UpdateServiceRecordResponse> updateServiceRecord(UpdateServiceRecordRequest request);

    /**
     * @param request the request parameters of UpdateSubscription  UpdateSubscriptionRequest
     * @return UpdateSubscriptionResponse
     */
    CompletableFuture<UpdateSubscriptionResponse> updateSubscription(UpdateSubscriptionRequest request);

    /**
     * <b>description</b> :
     * <p>Updates the configuration of a Umodel.</p>
     * 
     * @param request the request parameters of UpdateUmodel  UpdateUmodelRequest
     * @return UpdateUmodelResponse
     */
    CompletableFuture<UpdateUmodelResponse> updateUmodel(UpdateUmodelRequest request);

    /**
     * @param request the request parameters of UpsertUmodelCommonSchemaRef  UpsertUmodelCommonSchemaRefRequest
     * @return UpsertUmodelCommonSchemaRefResponse
     */
    CompletableFuture<UpsertUmodelCommonSchemaRefResponse> upsertUmodelCommonSchemaRef(UpsertUmodelCommonSchemaRefRequest request);

    /**
     * @param request the request parameters of UpsertUmodelData  UpsertUmodelDataRequest
     * @return UpsertUmodelDataResponse
     */
    CompletableFuture<UpsertUmodelDataResponse> upsertUmodelData(UpsertUmodelDataRequest request);

}
