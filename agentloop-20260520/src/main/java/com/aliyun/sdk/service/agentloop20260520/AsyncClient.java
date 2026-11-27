// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.agentloop20260520.models.*;
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
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>PUT /agentspace/{agentSpace}/audit/sources/{type}/{instanceID} contains only three required path parameters and no JSON request body or query parameters.</li>
     * <li>Data is isolated by the complete tenant key consisting of user_id, agent_space, and region_id. The agentSpace parameter is obtained from the path. The user ID and region are obtained from the trusted identity headers of the gateway. The region header is X-Acs-System-Region-Id and cannot be overridden by the request body or query parameters. The service verifies the access permissions for the AgentSpace and the region matching.</li>
     * <li>If type is set to gateway, only configJson.audit_enabled_gateway_instances is modified. If type is set to trace, only configJson.audit_enabled_trace_apps is modified. Other fields in the configuration remain unchanged.</li>
     * <li>Each list can contain a maximum of 100 distinct objects. The total number of UTF-8 bytes for all IDs after normalization cannot exceed 8,192. If the list limit is exceeded after the addition, a 400 InvalidParameter.Config error is returned. This limit is verified by the backend.</li>
     * <li>An HTTP 204 response with no response body indicates that the member is already in the selected state. The configuration is written upon the first addition. Repeated additions also return a 204 response without duplicate writes.</li>
     * <li>The addition operation only modifies the list membership and does not synchronously start the transformation task. The coordinator processes task changes asynchronously afterward. A 204 response does not indicate that the task has been started or is running properly.</li>
     * <li>The error response is an ErrorResponse object that includes requestId (the value of the request ID header, which may be an empty string if missing), code, and message. The HTTP status code and response body for errors are passed through exactly as returned by the backend.</li>
     * </ul>
     * 
     * @param request the request parameters of AddAuditConversionSource  AddAuditConversionSourceRequest
     * @return AddAuditConversionSourceResponse
     */
    CompletableFuture<AddAuditConversionSourceResponse> addAuditConversionSource(AddAuditConversionSourceRequest request);

    /**
     * @param request the request parameters of AddDatasetData  AddDatasetDataRequest
     * @return AddDatasetDataResponse
     */
    CompletableFuture<AddDatasetDataResponse> addDatasetData(AddDatasetDataRequest request);

    /**
     * @param request the request parameters of CancelPipelineRun  CancelPipelineRunRequest
     * @return CancelPipelineRunResponse
     */
    CompletableFuture<CancelPipelineRunResponse> cancelPipelineRun(CancelPipelineRunRequest request);

    /**
     * @param request the request parameters of CreateAgentSpace  CreateAgentSpaceRequest
     * @return CreateAgentSpaceResponse
     */
    CompletableFuture<CreateAgentSpaceResponse> createAgentSpace(CreateAgentSpaceRequest request);

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
     * @param request the request parameters of CreateDataset  CreateDatasetRequest
     * @return CreateDatasetResponse
     */
    CompletableFuture<CreateDatasetResponse> createDataset(CreateDatasetRequest request);

    /**
     * @param request the request parameters of CreateDatasetVersion  CreateDatasetVersionRequest
     * @return CreateDatasetVersionResponse
     */
    CompletableFuture<CreateDatasetVersionResponse> createDatasetVersion(CreateDatasetVersionRequest request);

    /**
     * <b>description</b> :
     * <p>Calls the CreateEvaluationTask operation to create an evaluation task under a specified AgentSpace. The server validates AgentSpace permissions, initializes evaluation result storage, checks task name uniqueness, and asynchronously creates and executes an EvaluationRun based on <code>taskMode</code> and <code>runStrategies</code>.
     * This operation is applicable to running built-in or custom evaluators on Trace, Dataset, or SLS Log data. It supports two execution strategies: historical backfill and continuous evaluation.</p>
     * 
     * @param request the request parameters of CreateEvaluationTask  CreateEvaluationTaskRequest
     * @return CreateEvaluationTaskResponse
     */
    CompletableFuture<CreateEvaluationTaskResponse> createEvaluationTask(CreateEvaluationTaskRequest request);

    /**
     * @param request the request parameters of CreateEvaluator  CreateEvaluatorRequest
     * @return CreateEvaluatorResponse
     */
    CompletableFuture<CreateEvaluatorResponse> createEvaluator(CreateEvaluatorRequest request);

    /**
     * @param request the request parameters of CreateEvaluatorSkill  CreateEvaluatorSkillRequest
     * @return CreateEvaluatorSkillResponse
     */
    CompletableFuture<CreateEvaluatorSkillResponse> createEvaluatorSkill(CreateEvaluatorSkillRequest request);

    /**
     * <b>description</b> :
     * <p>Calls CreateExperimentPlan to create an experiment plan in a specified AgentSpace. This operation is used to define the configuration for an offline or online experiment, including the data source, optional evaluators, and experiment groups required for online experiments. After the plan is created, call CreateExperimentRun to initiate the execution.</p>
     * 
     * @param request the request parameters of CreateExperimentPlan  CreateExperimentPlanRequest
     * @return CreateExperimentPlanResponse
     */
    CompletableFuture<CreateExperimentPlanResponse> createExperimentPlan(CreateExperimentPlanRequest request);

    /**
     * <b>description</b> :
     * <p>Calls CreateExperimentRun to initiate an experiment run based on an existing experiment plan. For online experiments, you typically only need to pass <code>experimentPlanId</code>. For offline experiments, you must pass <code>offlineExperiments</code> (1 to 5).</p>
     * 
     * @param request the request parameters of CreateExperimentRun  CreateExperimentRunRequest
     * @return CreateExperimentRunResponse
     */
    CompletableFuture<CreateExperimentRunResponse> createExperimentRun(CreateExperimentRunRequest request);

    /**
     * @param request the request parameters of CreateMultiModalTask  CreateMultiModalTaskRequest
     * @return CreateMultiModalTaskResponse
     */
    CompletableFuture<CreateMultiModalTaskResponse> createMultiModalTask(CreateMultiModalTaskRequest request);

    /**
     * @param request the request parameters of CreateOptimizeRun  CreateOptimizeRunRequest
     * @return CreateOptimizeRunResponse
     */
    CompletableFuture<CreateOptimizeRunResponse> createOptimizeRun(CreateOptimizeRunRequest request);

    /**
     * @param request the request parameters of CreateOptimizeTask  CreateOptimizeTaskRequest
     * @return CreateOptimizeTaskResponse
     */
    CompletableFuture<CreateOptimizeTaskResponse> createOptimizeTask(CreateOptimizeTaskRequest request);

    /**
     * @param request the request parameters of CreatePipeline  CreatePipelineRequest
     * @return CreatePipelineResponse
     */
    CompletableFuture<CreatePipelineResponse> createPipeline(CreatePipelineRequest request);

    /**
     * @param request the request parameters of DeleteAgentSpace  DeleteAgentSpaceRequest
     * @return DeleteAgentSpaceResponse
     */
    CompletableFuture<DeleteAgentSpaceResponse> deleteAgentSpace(DeleteAgentSpaceRequest request);

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
     * @param request the request parameters of DeleteDataset  DeleteDatasetRequest
     * @return DeleteDatasetResponse
     */
    CompletableFuture<DeleteDatasetResponse> deleteDataset(DeleteDatasetRequest request);

    /**
     * @param request the request parameters of DeleteDatasetVersion  DeleteDatasetVersionRequest
     * @return DeleteDatasetVersionResponse
     */
    CompletableFuture<DeleteDatasetVersionResponse> deleteDatasetVersion(DeleteDatasetVersionRequest request);

    /**
     * @param request the request parameters of DeleteEvaluationRun  DeleteEvaluationRunRequest
     * @return DeleteEvaluationRunResponse
     */
    CompletableFuture<DeleteEvaluationRunResponse> deleteEvaluationRun(DeleteEvaluationRunRequest request);

    /**
     * @param request the request parameters of DeleteEvaluationTask  DeleteEvaluationTaskRequest
     * @return DeleteEvaluationTaskResponse
     */
    CompletableFuture<DeleteEvaluationTaskResponse> deleteEvaluationTask(DeleteEvaluationTaskRequest request);

    /**
     * @param request the request parameters of DeleteEvaluator  DeleteEvaluatorRequest
     * @return DeleteEvaluatorResponse
     */
    CompletableFuture<DeleteEvaluatorResponse> deleteEvaluator(DeleteEvaluatorRequest request);

    /**
     * @param request the request parameters of DeleteEvaluatorSkill  DeleteEvaluatorSkillRequest
     * @return DeleteEvaluatorSkillResponse
     */
    CompletableFuture<DeleteEvaluatorSkillResponse> deleteEvaluatorSkill(DeleteEvaluatorSkillRequest request);

    /**
     * <b>description</b> :
     * <p>Calls DeleteExperimentPlan to delete a specified experiment plan. After deletion, no new executions can be initiated based on this plan. Existing experiment records can still be queried.</p>
     * 
     * @param request the request parameters of DeleteExperimentPlan  DeleteExperimentPlanRequest
     * @return DeleteExperimentPlanResponse
     */
    CompletableFuture<DeleteExperimentPlanResponse> deleteExperimentPlan(DeleteExperimentPlanRequest request);

    /**
     * <b>description</b> :
     * <p>Calls DeleteExperimentRun to delete a specified experiment run record. Deleting a record does not delete the experiment plan to which it belongs.</p>
     * 
     * @param request the request parameters of DeleteExperimentRun  DeleteExperimentRunRequest
     * @return DeleteExperimentRunResponse
     */
    CompletableFuture<DeleteExperimentRunResponse> deleteExperimentRun(DeleteExperimentRunRequest request);

    /**
     * @param request the request parameters of DeleteOptimizeTask  DeleteOptimizeTaskRequest
     * @return DeleteOptimizeTaskResponse
     */
    CompletableFuture<DeleteOptimizeTaskResponse> deleteOptimizeTask(DeleteOptimizeTaskRequest request);

    /**
     * @param request the request parameters of DeletePipeline  DeletePipelineRequest
     * @return DeletePipelineResponse
     */
    CompletableFuture<DeletePipelineResponse> deletePipeline(DeletePipelineRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * <b>description</b> :
     * <p>Calls CreateEvaluationTask to create an evaluation task in a specified AgentSpace. The server validates AgentSpace permissions, initializes evaluation result storage, checks task name uniqueness, and asynchronously creates and executes an EvaluationRun based on <code>taskMode</code> and <code>runStrategies</code>.
     * This operation is applicable to running built-in or custom evaluators on Trace, Dataset, or SLS Log data. It supports two execution strategies: historical backfill and continuous evaluation.</p>
     * 
     * @param request the request parameters of ExecuteQuery  ExecuteQueryRequest
     * @return ExecuteQueryResponse
     */
    CompletableFuture<ExecuteQueryResponse> executeQuery(ExecuteQueryRequest request);

    /**
     * @param request the request parameters of GetAgentSpace  GetAgentSpaceRequest
     * @return GetAgentSpaceResponse
     */
    CompletableFuture<GetAgentSpaceResponse> getAgentSpace(GetAgentSpaceRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>GET /agentspace/{agentSpace}/audit/sources/{type}/{instanceID} contains only three required path parameters, with no JSON request body or query parameters.</li>
     * <li>Isolated by the complete tenant key of user_id + agent_space + region_id. The agentSpace parameter comes from the path. The user ID and region come from the trusted identity headers of the gateway. The region header is X-Acs-System-Region-Id and cannot be overridden by the request body or query parameters. The service verifies the AgentSpace access permissions and region matching.</li>
     * <li>Reads only the transformation list of the corresponding type. It does not create audit configurations or check whether the transformation object is online or the transformation task is healthy.</li>
     * <li>An HTTP 200 response returns id and selected, excluding requestId. If the object is not selected or the current AgentSpace has no audit configuration, selected is false, and a 404 error is not returned.</li>
     * <li>The error response is ErrorResponse: requestId (the value of the request ID header, which may be an empty string if missing), code, and message. Error HTTP status codes and response bodies are passed through as-is from the backend.</li>
     * </ul>
     * 
     * @param request the request parameters of GetAuditConversionSource  GetAuditConversionSourceRequest
     * @return GetAuditConversionSourceResponse
     */
    CompletableFuture<GetAuditConversionSourceResponse> getAuditConversionSource(GetAuditConversionSourceRequest request);

    /**
     * @param request the request parameters of GetContextStore  GetContextStoreRequest
     * @return GetContextStoreResponse
     */
    CompletableFuture<GetContextStoreResponse> getContextStore(GetContextStoreRequest request);

    /**
     * @param request the request parameters of GetContextStoreAPIKey  GetContextStoreAPIKeyRequest
     * @return GetContextStoreAPIKeyResponse
     */
    CompletableFuture<GetContextStoreAPIKeyResponse> getContextStoreAPIKey(GetContextStoreAPIKeyRequest request);

    /**
     * @param request the request parameters of GetDataset  GetDatasetRequest
     * @return GetDatasetResponse
     */
    CompletableFuture<GetDatasetResponse> getDataset(GetDatasetRequest request);

    /**
     * @param request the request parameters of GetEvaluationRun  GetEvaluationRunRequest
     * @return GetEvaluationRunResponse
     */
    CompletableFuture<GetEvaluationRunResponse> getEvaluationRun(GetEvaluationRunRequest request);

    /**
     * @param request the request parameters of GetEvaluationTask  GetEvaluationTaskRequest
     * @return GetEvaluationTaskResponse
     */
    CompletableFuture<GetEvaluationTaskResponse> getEvaluationTask(GetEvaluationTaskRequest request);

    /**
     * @param request the request parameters of GetEvaluator  GetEvaluatorRequest
     * @return GetEvaluatorResponse
     */
    CompletableFuture<GetEvaluatorResponse> getEvaluator(GetEvaluatorRequest request);

    /**
     * @param request the request parameters of GetEvaluatorSkill  GetEvaluatorSkillRequest
     * @return GetEvaluatorSkillResponse
     */
    CompletableFuture<GetEvaluatorSkillResponse> getEvaluatorSkill(GetEvaluatorSkillRequest request);

    /**
     * <b>description</b> :
     * <p>Calls GetExperimentPlan to query the complete configuration of a specified experiment plan, including experiment groups, data sources, evaluators, and timestamps.</p>
     * 
     * @param request the request parameters of GetExperimentPlan  GetExperimentPlanRequest
     * @return GetExperimentPlanResponse
     */
    CompletableFuture<GetExperimentPlanResponse> getExperimentPlan(GetExperimentPlanRequest request);

    /**
     * <b>description</b> :
     * <p>Calls the GetExperimentRun operation to query the details of an experiment run, including the status, progress, configuration snapshot, and associated evaluation task ID.</p>
     * 
     * @param request the request parameters of GetExperimentRun  GetExperimentRunRequest
     * @return GetExperimentRunResponse
     */
    CompletableFuture<GetExperimentRunResponse> getExperimentRun(GetExperimentRunRequest request);

    /**
     * @param request the request parameters of GetOptimizeRun  GetOptimizeRunRequest
     * @return GetOptimizeRunResponse
     */
    CompletableFuture<GetOptimizeRunResponse> getOptimizeRun(GetOptimizeRunRequest request);

    /**
     * @param request the request parameters of GetOptimizeTask  GetOptimizeTaskRequest
     * @return GetOptimizeTaskResponse
     */
    CompletableFuture<GetOptimizeTaskResponse> getOptimizeTask(GetOptimizeTaskRequest request);

    /**
     * @param request the request parameters of GetPipeline  GetPipelineRequest
     * @return GetPipelineResponse
     */
    CompletableFuture<GetPipelineResponse> getPipeline(GetPipelineRequest request);

    /**
     * <b>description</b> :
     * <p>Invokes GetPipelineRun to retrieve the details of a single pipeline run, including the data window, execute status, retry information, run statistics, and the error message for the fault.</p>
     * 
     * @param request the request parameters of GetPipelineRun  GetPipelineRunRequest
     * @return GetPipelineRunResponse
     */
    CompletableFuture<GetPipelineRunResponse> getPipelineRun(GetPipelineRunRequest request);

    /**
     * @param request the request parameters of GetPipelineStats  GetPipelineStatsRequest
     * @return GetPipelineStatsResponse
     */
    CompletableFuture<GetPipelineStatsResponse> getPipelineStats(GetPipelineStatsRequest request);

    /**
     * <b>description</b> :
     * <p>Supports filtering by region.</p>
     * 
     * @param request the request parameters of ListAgentSpaces  ListAgentSpacesRequest
     * @return ListAgentSpacesResponse
     */
    CompletableFuture<ListAgentSpacesResponse> listAgentSpaces(ListAgentSpacesRequest request);

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
     * @param request the request parameters of ListDatasetVersions  ListDatasetVersionsRequest
     * @return ListDatasetVersionsResponse
     */
    CompletableFuture<ListDatasetVersionsResponse> listDatasetVersions(ListDatasetVersionsRequest request);

    /**
     * @param request the request parameters of ListDatasets  ListDatasetsRequest
     * @return ListDatasetsResponse
     */
    CompletableFuture<ListDatasetsResponse> listDatasets(ListDatasetsRequest request);

    /**
     * @param request the request parameters of ListEvaluationRuns  ListEvaluationRunsRequest
     * @return ListEvaluationRunsResponse
     */
    CompletableFuture<ListEvaluationRunsResponse> listEvaluationRuns(ListEvaluationRunsRequest request);

    /**
     * @param request the request parameters of ListEvaluationTasks  ListEvaluationTasksRequest
     * @return ListEvaluationTasksResponse
     */
    CompletableFuture<ListEvaluationTasksResponse> listEvaluationTasks(ListEvaluationTasksRequest request);

    /**
     * @param request the request parameters of ListEvaluatorSkills  ListEvaluatorSkillsRequest
     * @return ListEvaluatorSkillsResponse
     */
    CompletableFuture<ListEvaluatorSkillsResponse> listEvaluatorSkills(ListEvaluatorSkillsRequest request);

    /**
     * @param request the request parameters of ListEvaluators  ListEvaluatorsRequest
     * @return ListEvaluatorsResponse
     */
    CompletableFuture<ListEvaluatorsResponse> listEvaluators(ListEvaluatorsRequest request);

    /**
     * <b>description</b> :
     * <p>Calls ListExperimentPlans to query the list of experiment plans under a specified AgentSpace for the current account. This operation supports fuzzy match by plan name, filtering by status, and pagination by using <code>offset</code> and <code>limit</code>.</p>
     * 
     * @param request the request parameters of ListExperimentPlans  ListExperimentPlansRequest
     * @return ListExperimentPlansResponse
     */
    CompletableFuture<ListExperimentPlansResponse> listExperimentPlans(ListExperimentPlansRequest request);

    /**
     * <b>description</b> :
     * <p>Calls the ListExperimentRuns operation to query the experiment execution records of the current account in a specified AgentSpace. You can filter records by status, dataset, plan name, and experiment name, and paginate results by using page and pageSize.</p>
     * 
     * @param request the request parameters of ListExperimentRuns  ListExperimentRunsRequest
     * @return ListExperimentRunsResponse
     */
    CompletableFuture<ListExperimentRunsResponse> listExperimentRuns(ListExperimentRunsRequest request);

    /**
     * @param request the request parameters of ListOptimizeRuns  ListOptimizeRunsRequest
     * @return ListOptimizeRunsResponse
     */
    CompletableFuture<ListOptimizeRunsResponse> listOptimizeRuns(ListOptimizeRunsRequest request);

    /**
     * @param request the request parameters of ListOptimizeTasks  ListOptimizeTasksRequest
     * @return ListOptimizeTasksResponse
     */
    CompletableFuture<ListOptimizeTasksResponse> listOptimizeTasks(ListOptimizeTasksRequest request);

    /**
     * <b>description</b> :
     * <p>Calls ListPipelineRuns to query the pipeline run history. Supports filtering by status, trigger type, and time range, and uses cursor-based pagination.</p>
     * 
     * @param request the request parameters of ListPipelineRuns  ListPipelineRunsRequest
     * @return ListPipelineRunsResponse
     */
    CompletableFuture<ListPipelineRunsResponse> listPipelineRuns(ListPipelineRunsRequest request);

    /**
     * @param request the request parameters of ListPipelines  ListPipelinesRequest
     * @return ListPipelinesResponse
     */
    CompletableFuture<ListPipelinesResponse> listPipelines(ListPipelinesRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of PausePipeline  PausePipelineRequest
     * @return PausePipelineResponse
     */
    CompletableFuture<PausePipelineResponse> pausePipeline(PausePipelineRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li><strong>agentSpace</strong> must be an existing AgentSpace instance under the current account.</li>
     * <li><strong>source.type</strong> currently supports only the <code>logstore</code> type. The <code>logstore.project</code> and <code>logstore.logstore</code> must be authorized within the AgentSpace and reside in the same region.</li>
     * <li><strong>pipeline.nodes</strong> must contain at least one <code>Source</code> node and cannot be empty.</li>
     * <li><strong>fromTime</strong> and <strong>toTime</strong> are UNIX timestamps in seconds. <strong>fromTime</strong> must be earlier than <strong>toTime</strong>.</li>
     * <li>A maximum of 5 records are returned, and internal fields of the data source system are automatically filtered out.</li>
     * </ul>
     * 
     * @param request the request parameters of PreviewPipeline  PreviewPipelineRequest
     * @return PreviewPipelineResponse
     */
    CompletableFuture<PreviewPipelineResponse> previewPipeline(PreviewPipelineRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>The DELETE /agentspace/{agentSpace}/audit/sources/{type}/{instanceID} operation includes only three required path parameters and does not contain a JSON request body or query parameters.</li>
     * <li>Isolation is based on the complete tenant key that consists of user_id, agent_space, and region_id. The agentSpace parameter is obtained from the path. The user ID and region are obtained from the trusted identity headers of the gateway. The region header is X-Acs-System-Region-Id and cannot be overridden by the request body or query parameters. The service verifies the access permissions and region matching for the AgentSpace.</li>
     * <li>If type is set to gateway, only the ID in configJson.audit_enabled_gateway_instances is removed. If type is set to trace, only the ID in configJson.audit_enabled_trace_apps is removed, and other configuration fields are retained.</li>
     * <li>An HTTP 204 response with no response body indicates that the member is already in the unselected state. Repeated calls when the member is unselected also return 204 instead of 404. If the current AgentSpace does not have an audit configuration, no new configuration is created for the delete operation.</li>
     * <li>The removal operation only modifies the list membership and does not synchronously stop the transformation task. After the actual change occurs, the coordinator asynchronously processes the task changes.</li>
     * <li>The error response is an ErrorResponse object, which includes requestId (the value of the request ID header, which may be an empty string if missing), code, and message. Error HTTP status codes and response bodies are passed through as-is from the backend.</li>
     * </ul>
     * 
     * @param request the request parameters of RemoveAuditConversionSource  RemoveAuditConversionSourceRequest
     * @return RemoveAuditConversionSourceResponse
     */
    CompletableFuture<RemoveAuditConversionSourceResponse> removeAuditConversionSource(RemoveAuditConversionSourceRequest request);

    /**
     * @param request the request parameters of ResumePipeline  ResumePipelineRequest
     * @return ResumePipelineResponse
     */
    CompletableFuture<ResumePipelineResponse> resumePipeline(ResumePipelineRequest request);

    /**
     * @param request the request parameters of RunPipeline  RunPipelineRequest
     * @return RunPipelineResponse
     */
    CompletableFuture<RunPipelineResponse> runPipeline(RunPipelineRequest request);

    /**
     * @param request the request parameters of SearchContext  SearchContextRequest
     * @return SearchContextResponse
     */
    CompletableFuture<SearchContextResponse> searchContext(SearchContextRequest request);

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @param request the request parameters of TerminatePipeline  TerminatePipelineRequest
     * @return TerminatePipelineResponse
     */
    CompletableFuture<TerminatePipelineResponse> terminatePipeline(TerminatePipelineRequest request);

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * @param request the request parameters of UpdateAgentSpace  UpdateAgentSpaceRequest
     * @return UpdateAgentSpaceResponse
     */
    CompletableFuture<UpdateAgentSpaceResponse> updateAgentSpace(UpdateAgentSpaceRequest request);

    /**
     * @param request the request parameters of UpdateContextStore  UpdateContextStoreRequest
     * @return UpdateContextStoreResponse
     */
    CompletableFuture<UpdateContextStoreResponse> updateContextStore(UpdateContextStoreRequest request);

    /**
     * @param request the request parameters of UpdateDataset  UpdateDatasetRequest
     * @return UpdateDatasetResponse
     */
    CompletableFuture<UpdateDatasetResponse> updateDataset(UpdateDatasetRequest request);

    /**
     * @param request the request parameters of UpdateEvaluationRun  UpdateEvaluationRunRequest
     * @return UpdateEvaluationRunResponse
     */
    CompletableFuture<UpdateEvaluationRunResponse> updateEvaluationRun(UpdateEvaluationRunRequest request);

    /**
     * @param request the request parameters of UpdateEvaluationTask  UpdateEvaluationTaskRequest
     * @return UpdateEvaluationTaskResponse
     */
    CompletableFuture<UpdateEvaluationTaskResponse> updateEvaluationTask(UpdateEvaluationTaskRequest request);

    /**
     * @param request the request parameters of UpdateEvaluator  UpdateEvaluatorRequest
     * @return UpdateEvaluatorResponse
     */
    CompletableFuture<UpdateEvaluatorResponse> updateEvaluator(UpdateEvaluatorRequest request);

    /**
     * @param request the request parameters of UpdateEvaluatorSkill  UpdateEvaluatorSkillRequest
     * @return UpdateEvaluatorSkillResponse
     */
    CompletableFuture<UpdateEvaluatorSkillResponse> updateEvaluatorSkill(UpdateEvaluatorSkillRequest request);

    /**
     * <b>description</b> :
     * <p>Publishes a saved evaluator draft, takes a published version offline, or brings an offline version back online.</p>
     * 
     * @param request the request parameters of UpdateEvaluatorVersionStatus  UpdateEvaluatorVersionStatusRequest
     * @return UpdateEvaluatorVersionStatusResponse
     */
    CompletableFuture<UpdateEvaluatorVersionStatusResponse> updateEvaluatorVersionStatus(UpdateEvaluatorVersionStatusRequest request);

    /**
     * <b>description</b> :
     * <p>Updates a specified experiment plan. Unspecified fields remain unchanged. Only plans created by the current account can be updated.</p>
     * 
     * @param request the request parameters of UpdateExperimentPlan  UpdateExperimentPlanRequest
     * @return UpdateExperimentPlanResponse
     */
    CompletableFuture<UpdateExperimentPlanResponse> updateExperimentPlan(UpdateExperimentPlanRequest request);

    /**
     * <b>description</b> :
     * <p>Calls UpdateExperimentRun to update the name, status, and task counts of an experiment record. Fields that are not specified remain unchanged. Typical sequence for an offline experiment: running → progress writeback → completed.</p>
     * 
     * @param request the request parameters of UpdateExperimentRun  UpdateExperimentRunRequest
     * @return UpdateExperimentRunResponse
     */
    CompletableFuture<UpdateExperimentRunResponse> updateExperimentRun(UpdateExperimentRunRequest request);

    /**
     * @param request the request parameters of UpdateOptimizeRun  UpdateOptimizeRunRequest
     * @return UpdateOptimizeRunResponse
     */
    CompletableFuture<UpdateOptimizeRunResponse> updateOptimizeRun(UpdateOptimizeRunRequest request);

    /**
     * @param request the request parameters of UpdateOptimizeTask  UpdateOptimizeTaskRequest
     * @return UpdateOptimizeTaskResponse
     */
    CompletableFuture<UpdateOptimizeTaskResponse> updateOptimizeTask(UpdateOptimizeTaskRequest request);

    /**
     * @param request the request parameters of UpdatePipeline  UpdatePipelineRequest
     * @return UpdatePipelineResponse
     */
    CompletableFuture<UpdatePipelineResponse> updatePipeline(UpdatePipelineRequest request);

}
