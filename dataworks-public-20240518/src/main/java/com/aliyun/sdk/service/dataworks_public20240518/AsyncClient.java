// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dataworks_public20240518.models.*;
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
     * @param request the request parameters of AbolishDeployment  AbolishDeploymentRequest
     * @return AbolishDeploymentResponse
     */
    CompletableFuture<AbolishDeploymentResponse> abolishDeployment(AbolishDeploymentRequest request);

    /**
     * @param request the request parameters of CloneDataSource  CloneDataSourceRequest
     * @return CloneDataSourceResponse
     */
    CompletableFuture<CloneDataSourceResponse> cloneDataSource(CloneDataSourceRequest request);

    /**
     * @param request the request parameters of CreateDIJob  CreateDIJobRequest
     * @return CreateDIJobResponse
     */
    CompletableFuture<CreateDIJobResponse> createDIJob(CreateDIJobRequest request);

    /**
     * @param request the request parameters of CreateDataSource  CreateDataSourceRequest
     * @return CreateDataSourceResponse
     */
    CompletableFuture<CreateDataSourceResponse> createDataSource(CreateDataSourceRequest request);

    /**
     * @param request the request parameters of CreateDataSourceSharedRule  CreateDataSourceSharedRuleRequest
     * @return CreateDataSourceSharedRuleResponse
     */
    CompletableFuture<CreateDataSourceSharedRuleResponse> createDataSourceSharedRule(CreateDataSourceSharedRuleRequest request);

    /**
     * @param request the request parameters of CreateDeployment  CreateDeploymentRequest
     * @return CreateDeploymentResponse
     */
    CompletableFuture<CreateDeploymentResponse> createDeployment(CreateDeploymentRequest request);

    /**
     * @param request the request parameters of CreateFunction  CreateFunctionRequest
     * @return CreateFunctionResponse
     */
    CompletableFuture<CreateFunctionResponse> createFunction(CreateFunctionRequest request);

    /**
     * @param request the request parameters of CreateNode  CreateNodeRequest
     * @return CreateNodeResponse
     */
    CompletableFuture<CreateNodeResponse> createNode(CreateNodeRequest request);

    /**
     * @param request the request parameters of CreateProject  CreateProjectRequest
     * @return CreateProjectResponse
     */
    CompletableFuture<CreateProjectResponse> createProject(CreateProjectRequest request);

    /**
     * @param request the request parameters of CreateResource  CreateResourceRequest
     * @return CreateResourceResponse
     */
    CompletableFuture<CreateResourceResponse> createResource(CreateResourceRequest request);

    /**
     * @param request the request parameters of CreateWorkflowDefinition  CreateWorkflowDefinitionRequest
     * @return CreateWorkflowDefinitionResponse
     */
    CompletableFuture<CreateWorkflowDefinitionResponse> createWorkflowDefinition(CreateWorkflowDefinitionRequest request);

    /**
     * @param request the request parameters of DeleteDIJob  DeleteDIJobRequest
     * @return DeleteDIJobResponse
     */
    CompletableFuture<DeleteDIJobResponse> deleteDIJob(DeleteDIJobRequest request);

    /**
     * @param request the request parameters of DeleteDataSource  DeleteDataSourceRequest
     * @return DeleteDataSourceResponse
     */
    CompletableFuture<DeleteDataSourceResponse> deleteDataSource(DeleteDataSourceRequest request);

    /**
     * @param request the request parameters of DeleteDataSourceSharedRule  DeleteDataSourceSharedRuleRequest
     * @return DeleteDataSourceSharedRuleResponse
     */
    CompletableFuture<DeleteDataSourceSharedRuleResponse> deleteDataSourceSharedRule(DeleteDataSourceSharedRuleRequest request);

    /**
     * @param request the request parameters of DeleteFunction  DeleteFunctionRequest
     * @return DeleteFunctionResponse
     */
    CompletableFuture<DeleteFunctionResponse> deleteFunction(DeleteFunctionRequest request);

    /**
     * @param request the request parameters of DeleteNode  DeleteNodeRequest
     * @return DeleteNodeResponse
     */
    CompletableFuture<DeleteNodeResponse> deleteNode(DeleteNodeRequest request);

    /**
     * @param request the request parameters of DeleteProject  DeleteProjectRequest
     * @return DeleteProjectResponse
     */
    CompletableFuture<DeleteProjectResponse> deleteProject(DeleteProjectRequest request);

    /**
     * @param request the request parameters of DeleteResource  DeleteResourceRequest
     * @return DeleteResourceResponse
     */
    CompletableFuture<DeleteResourceResponse> deleteResource(DeleteResourceRequest request);

    /**
     * @param request the request parameters of DeleteWorkflowDefinition  DeleteWorkflowDefinitionRequest
     * @return DeleteWorkflowDefinitionResponse
     */
    CompletableFuture<DeleteWorkflowDefinitionResponse> deleteWorkflowDefinition(DeleteWorkflowDefinitionRequest request);

    /**
     * @param request the request parameters of ExecDeploymentStage  ExecDeploymentStageRequest
     * @return ExecDeploymentStageResponse
     */
    CompletableFuture<ExecDeploymentStageResponse> execDeploymentStage(ExecDeploymentStageRequest request);

    /**
     * @param request the request parameters of GetDIJob  GetDIJobRequest
     * @return GetDIJobResponse
     */
    CompletableFuture<GetDIJobResponse> getDIJob(GetDIJobRequest request);

    /**
     * @param request the request parameters of GetDIJobLog  GetDIJobLogRequest
     * @return GetDIJobLogResponse
     */
    CompletableFuture<GetDIJobLogResponse> getDIJobLog(GetDIJobLogRequest request);

    /**
     * @param request the request parameters of GetDataSource  GetDataSourceRequest
     * @return GetDataSourceResponse
     */
    CompletableFuture<GetDataSourceResponse> getDataSource(GetDataSourceRequest request);

    /**
     * @param request the request parameters of GetDeployment  GetDeploymentRequest
     * @return GetDeploymentResponse
     */
    CompletableFuture<GetDeploymentResponse> getDeployment(GetDeploymentRequest request);

    /**
     * @param request the request parameters of GetFunction  GetFunctionRequest
     * @return GetFunctionResponse
     */
    CompletableFuture<GetFunctionResponse> getFunction(GetFunctionRequest request);

    /**
     * @param request the request parameters of GetNode  GetNodeRequest
     * @return GetNodeResponse
     */
    CompletableFuture<GetNodeResponse> getNode(GetNodeRequest request);

    /**
     * @param request the request parameters of GetProject  GetProjectRequest
     * @return GetProjectResponse
     */
    CompletableFuture<GetProjectResponse> getProject(GetProjectRequest request);

    /**
     * @param request the request parameters of GetResource  GetResourceRequest
     * @return GetResourceResponse
     */
    CompletableFuture<GetResourceResponse> getResource(GetResourceRequest request);

    /**
     * @param request the request parameters of GetWorkflowDefinition  GetWorkflowDefinitionRequest
     * @return GetWorkflowDefinitionResponse
     */
    CompletableFuture<GetWorkflowDefinitionResponse> getWorkflowDefinition(GetWorkflowDefinitionRequest request);

    /**
     * @param request the request parameters of ListDIJobEvents  ListDIJobEventsRequest
     * @return ListDIJobEventsResponse
     */
    CompletableFuture<ListDIJobEventsResponse> listDIJobEvents(ListDIJobEventsRequest request);

    /**
     * @param request the request parameters of ListDIJobMetrics  ListDIJobMetricsRequest
     * @return ListDIJobMetricsResponse
     */
    CompletableFuture<ListDIJobMetricsResponse> listDIJobMetrics(ListDIJobMetricsRequest request);

    /**
     * @param request the request parameters of ListDIJobs  ListDIJobsRequest
     * @return ListDIJobsResponse
     */
    CompletableFuture<ListDIJobsResponse> listDIJobs(ListDIJobsRequest request);

    /**
     * @param request the request parameters of ListDataSourceSharedRules  ListDataSourceSharedRulesRequest
     * @return ListDataSourceSharedRulesResponse
     */
    CompletableFuture<ListDataSourceSharedRulesResponse> listDataSourceSharedRules(ListDataSourceSharedRulesRequest request);

    /**
     * @param request the request parameters of ListDataSources  ListDataSourcesRequest
     * @return ListDataSourcesResponse
     */
    CompletableFuture<ListDataSourcesResponse> listDataSources(ListDataSourcesRequest request);

    /**
     * @param request the request parameters of ListDeployments  ListDeploymentsRequest
     * @return ListDeploymentsResponse
     */
    CompletableFuture<ListDeploymentsResponse> listDeployments(ListDeploymentsRequest request);

    /**
     * @param request the request parameters of ListFunctions  ListFunctionsRequest
     * @return ListFunctionsResponse
     */
    CompletableFuture<ListFunctionsResponse> listFunctions(ListFunctionsRequest request);

    /**
     * @param request the request parameters of ListNodeDependencies  ListNodeDependenciesRequest
     * @return ListNodeDependenciesResponse
     */
    CompletableFuture<ListNodeDependenciesResponse> listNodeDependencies(ListNodeDependenciesRequest request);

    /**
     * @param request the request parameters of ListNodes  ListNodesRequest
     * @return ListNodesResponse
     */
    CompletableFuture<ListNodesResponse> listNodes(ListNodesRequest request);

    /**
     * @param request the request parameters of ListProjects  ListProjectsRequest
     * @return ListProjectsResponse
     */
    CompletableFuture<ListProjectsResponse> listProjects(ListProjectsRequest request);

    /**
     * @param request the request parameters of ListResources  ListResourcesRequest
     * @return ListResourcesResponse
     */
    CompletableFuture<ListResourcesResponse> listResources(ListResourcesRequest request);

    /**
     * @param request the request parameters of ListWorkflowDefinitions  ListWorkflowDefinitionsRequest
     * @return ListWorkflowDefinitionsResponse
     */
    CompletableFuture<ListWorkflowDefinitionsResponse> listWorkflowDefinitions(ListWorkflowDefinitionsRequest request);

    /**
     * @param request the request parameters of MoveFunction  MoveFunctionRequest
     * @return MoveFunctionResponse
     */
    CompletableFuture<MoveFunctionResponse> moveFunction(MoveFunctionRequest request);

    /**
     * @param request the request parameters of MoveNode  MoveNodeRequest
     * @return MoveNodeResponse
     */
    CompletableFuture<MoveNodeResponse> moveNode(MoveNodeRequest request);

    /**
     * @param request the request parameters of MoveResource  MoveResourceRequest
     * @return MoveResourceResponse
     */
    CompletableFuture<MoveResourceResponse> moveResource(MoveResourceRequest request);

    /**
     * @param request the request parameters of MoveWorkflowDefinition  MoveWorkflowDefinitionRequest
     * @return MoveWorkflowDefinitionResponse
     */
    CompletableFuture<MoveWorkflowDefinitionResponse> moveWorkflowDefinition(MoveWorkflowDefinitionRequest request);

    /**
     * @param request the request parameters of RenameFunction  RenameFunctionRequest
     * @return RenameFunctionResponse
     */
    CompletableFuture<RenameFunctionResponse> renameFunction(RenameFunctionRequest request);

    /**
     * @param request the request parameters of RenameNode  RenameNodeRequest
     * @return RenameNodeResponse
     */
    CompletableFuture<RenameNodeResponse> renameNode(RenameNodeRequest request);

    /**
     * @param request the request parameters of RenameResource  RenameResourceRequest
     * @return RenameResourceResponse
     */
    CompletableFuture<RenameResourceResponse> renameResource(RenameResourceRequest request);

    /**
     * @param request the request parameters of RenameWorkflowDefinition  RenameWorkflowDefinitionRequest
     * @return RenameWorkflowDefinitionResponse
     */
    CompletableFuture<RenameWorkflowDefinitionResponse> renameWorkflowDefinition(RenameWorkflowDefinitionRequest request);

    /**
     * @param request the request parameters of StartDIJob  StartDIJobRequest
     * @return StartDIJobResponse
     */
    CompletableFuture<StartDIJobResponse> startDIJob(StartDIJobRequest request);

    /**
     * @param request the request parameters of UpdateDIJob  UpdateDIJobRequest
     * @return UpdateDIJobResponse
     */
    CompletableFuture<UpdateDIJobResponse> updateDIJob(UpdateDIJobRequest request);

    /**
     * @param request the request parameters of UpdateDataSource  UpdateDataSourceRequest
     * @return UpdateDataSourceResponse
     */
    CompletableFuture<UpdateDataSourceResponse> updateDataSource(UpdateDataSourceRequest request);

    /**
     * @param request the request parameters of UpdateFunction  UpdateFunctionRequest
     * @return UpdateFunctionResponse
     */
    CompletableFuture<UpdateFunctionResponse> updateFunction(UpdateFunctionRequest request);

    /**
     * @param request the request parameters of UpdateNode  UpdateNodeRequest
     * @return UpdateNodeResponse
     */
    CompletableFuture<UpdateNodeResponse> updateNode(UpdateNodeRequest request);

    /**
     * @param request the request parameters of UpdateProject  UpdateProjectRequest
     * @return UpdateProjectResponse
     */
    CompletableFuture<UpdateProjectResponse> updateProject(UpdateProjectRequest request);

    /**
     * @param request the request parameters of UpdateResource  UpdateResourceRequest
     * @return UpdateResourceResponse
     */
    CompletableFuture<UpdateResourceResponse> updateResource(UpdateResourceRequest request);

    /**
     * @param request the request parameters of UpdateWorkflowDefinition  UpdateWorkflowDefinitionRequest
     * @return UpdateWorkflowDefinitionResponse
     */
    CompletableFuture<UpdateWorkflowDefinitionResponse> updateWorkflowDefinition(UpdateWorkflowDefinitionRequest request);

}
