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
     * @param request the request parameters of UpdatePipeline  UpdatePipelineRequest
     * @return UpdatePipelineResponse
     */
    CompletableFuture<UpdatePipelineResponse> updatePipeline(UpdatePipelineRequest request);

}
