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
     * <p>Calls CreateExperimentPlan to create an experiment plan under a specified AgentSpace. This operation defines the configuration for an offline or online experiment, including the data source, optional evaluators, and experiment groups required for online experiments. After the plan is created, call CreateExperimentRun to start the execution.</p>
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
     * <p>Calls GetExperimentRun to query the details of a specific experiment run record, including the status, progress, configuration snapshot, and associated evaluation task ID.</p>
     * 
     * @param request the request parameters of GetExperimentRun  GetExperimentRunRequest
     * @return GetExperimentRunResponse
     */
    CompletableFuture<GetExperimentRunResponse> getExperimentRun(GetExperimentRunRequest request);

    /**
     * @param request the request parameters of GetPipeline  GetPipelineRequest
     * @return GetPipelineResponse
     */
    CompletableFuture<GetPipelineResponse> getPipeline(GetPipelineRequest request);

    /**
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
     * <p>Calls ListExperimentPlans to query the list of experiment plans under a specified AgentSpace for the current account. Supports fuzzy match by plan name, filtering by status, and pagination by using <code>offset</code>/<code>limit</code>.</p>
     * 
     * @param request the request parameters of ListExperimentPlans  ListExperimentPlansRequest
     * @return ListExperimentPlansResponse
     */
    CompletableFuture<ListExperimentPlansResponse> listExperimentPlans(ListExperimentPlansRequest request);

    /**
     * <b>description</b> :
     * <p>Calls ListExperimentRuns to query experiment run records under a specified AgentSpace for the current account. You can filter results by status, dataset, plan name, or experiment name, and use <code>page</code>/<code>pageSize</code> for pagination.</p>
     * 
     * @param request the request parameters of ListExperimentRuns  ListExperimentRunsRequest
     * @return ListExperimentRunsResponse
     */
    CompletableFuture<ListExperimentRunsResponse> listExperimentRuns(ListExperimentRunsRequest request);

    /**
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
     * @param request the request parameters of PausePipeline  PausePipelineRequest
     * @return PausePipelineResponse
     */
    CompletableFuture<PausePipelineResponse> pausePipeline(PausePipelineRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li><strong>agentSpace</strong> must be an AgentSpace instance that has been created under the current account.</li>
     * <li><strong>source.type</strong> currently supports only the <code>logstore</code> type. The <code>logstore.project</code> and <code>logstore.logstore</code> must be authorized within the AgentSpace and located in the same region.</li>
     * <li><strong>pipeline.nodes</strong> must contain at least one node of the <code>Source</code> type and cannot be empty.</li>
     * <li><strong>fromTime</strong> and <strong>toTime</strong> are UNIX timestamps in seconds. <strong>fromTime</strong> must be earlier than <strong>toTime</strong>.</li>
     * <li>A maximum of 5 records are returned. Internal fields of the data source system are automatically filtered out.</li>
     * </ul>
     * 
     * @param request the request parameters of PreviewPipeline  PreviewPipelineRequest
     * @return PreviewPipelineResponse
     */
    CompletableFuture<PreviewPipelineResponse> previewPipeline(PreviewPipelineRequest request);

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
     * @param request the request parameters of TerminatePipeline  TerminatePipelineRequest
     * @return TerminatePipelineResponse
     */
    CompletableFuture<TerminatePipelineResponse> terminatePipeline(TerminatePipelineRequest request);

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
     * <p>Calls UpdateExperimentPlan to update a specified experiment plan. Fields that are not included in the request remain unchanged. You can update only plans created by the current account.</p>
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
     * @param request the request parameters of UpdatePipeline  UpdatePipelineRequest
     * @return UpdatePipelineResponse
     */
    CompletableFuture<UpdatePipelineResponse> updatePipeline(UpdatePipelineRequest request);

}
