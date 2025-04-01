// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.devs20230714.models.*;
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
     * @param request the request parameters of ActivateConnection  ActivateConnectionRequest
     * @return ActivateConnectionResponse
     */
    CompletableFuture<ActivateConnectionResponse> activateConnection(ActivateConnectionRequest request);

    /**
     * @param request the request parameters of CancelPipeline  CancelPipelineRequest
     * @return CancelPipelineResponse
     */
    CompletableFuture<CancelPipelineResponse> cancelPipeline(CancelPipelineRequest request);

    /**
     * @param request the request parameters of CancelTask  CancelTaskRequest
     * @return CancelTaskResponse
     */
    CompletableFuture<CancelTaskResponse> cancelTask(CancelTaskRequest request);

    /**
     * @param request the request parameters of CreateArtifact  CreateArtifactRequest
     * @return CreateArtifactResponse
     */
    CompletableFuture<CreateArtifactResponse> createArtifact(CreateArtifactRequest request);

    /**
     * @param request the request parameters of CreateEnvironment  CreateEnvironmentRequest
     * @return CreateEnvironmentResponse
     */
    CompletableFuture<CreateEnvironmentResponse> createEnvironment(CreateEnvironmentRequest request);

    /**
     * @param request the request parameters of CreatePipeline  CreatePipelineRequest
     * @return CreatePipelineResponse
     */
    CompletableFuture<CreatePipelineResponse> createPipeline(CreatePipelineRequest request);

    /**
     * @param request the request parameters of CreateProject  CreateProjectRequest
     * @return CreateProjectResponse
     */
    CompletableFuture<CreateProjectResponse> createProject(CreateProjectRequest request);

    /**
     * @param request the request parameters of CreateTask  CreateTaskRequest
     * @return CreateTaskResponse
     */
    CompletableFuture<CreateTaskResponse> createTask(CreateTaskRequest request);

    /**
     * @param request the request parameters of DeleteArtifact  DeleteArtifactRequest
     * @return DeleteArtifactResponse
     */
    CompletableFuture<DeleteArtifactResponse> deleteArtifact(DeleteArtifactRequest request);

    /**
     * @param request the request parameters of DeleteConnection  DeleteConnectionRequest
     * @return DeleteConnectionResponse
     */
    CompletableFuture<DeleteConnectionResponse> deleteConnection(DeleteConnectionRequest request);

    /**
     * @param request the request parameters of DeleteEnvironment  DeleteEnvironmentRequest
     * @return DeleteEnvironmentResponse
     */
    CompletableFuture<DeleteEnvironmentResponse> deleteEnvironment(DeleteEnvironmentRequest request);

    /**
     * @param request the request parameters of DeleteProject  DeleteProjectRequest
     * @return DeleteProjectResponse
     */
    CompletableFuture<DeleteProjectResponse> deleteProject(DeleteProjectRequest request);

    /**
     * @param request the request parameters of DeployEnvironment  DeployEnvironmentRequest
     * @return DeployEnvironmentResponse
     */
    CompletableFuture<DeployEnvironmentResponse> deployEnvironment(DeployEnvironmentRequest request);

    /**
     * @param request the request parameters of FetchArtifactDownloadUrl  FetchArtifactDownloadUrlRequest
     * @return FetchArtifactDownloadUrlResponse
     */
    CompletableFuture<FetchArtifactDownloadUrlResponse> fetchArtifactDownloadUrl(FetchArtifactDownloadUrlRequest request);

    /**
     * @param request the request parameters of FetchArtifactTempBucketToken  FetchArtifactTempBucketTokenRequest
     * @return FetchArtifactTempBucketTokenResponse
     */
    CompletableFuture<FetchArtifactTempBucketTokenResponse> fetchArtifactTempBucketToken(FetchArtifactTempBucketTokenRequest request);

    /**
     * @param request the request parameters of FetchConnectionCredential  FetchConnectionCredentialRequest
     * @return FetchConnectionCredentialResponse
     */
    CompletableFuture<FetchConnectionCredentialResponse> fetchConnectionCredential(FetchConnectionCredentialRequest request);

    /**
     * @param request the request parameters of GetArtifact  GetArtifactRequest
     * @return GetArtifactResponse
     */
    CompletableFuture<GetArtifactResponse> getArtifact(GetArtifactRequest request);

    /**
     * @param request the request parameters of GetEnvironment  GetEnvironmentRequest
     * @return GetEnvironmentResponse
     */
    CompletableFuture<GetEnvironmentResponse> getEnvironment(GetEnvironmentRequest request);

    /**
     * @param request the request parameters of GetEnvironmentDeployment  GetEnvironmentDeploymentRequest
     * @return GetEnvironmentDeploymentResponse
     */
    CompletableFuture<GetEnvironmentDeploymentResponse> getEnvironmentDeployment(GetEnvironmentDeploymentRequest request);

    /**
     * @param request the request parameters of GetPipeline  GetPipelineRequest
     * @return GetPipelineResponse
     */
    CompletableFuture<GetPipelineResponse> getPipeline(GetPipelineRequest request);

    /**
     * @param request the request parameters of GetProject  GetProjectRequest
     * @return GetProjectResponse
     */
    CompletableFuture<GetProjectResponse> getProject(GetProjectRequest request);

    /**
     * @param request the request parameters of GetRepository  GetRepositoryRequest
     * @return GetRepositoryResponse
     */
    CompletableFuture<GetRepositoryResponse> getRepository(GetRepositoryRequest request);

    /**
     * @param request the request parameters of GetServiceDeployment  GetServiceDeploymentRequest
     * @return GetServiceDeploymentResponse
     */
    CompletableFuture<GetServiceDeploymentResponse> getServiceDeployment(GetServiceDeploymentRequest request);

    /**
     * @param request the request parameters of GetTask  GetTaskRequest
     * @return GetTaskResponse
     */
    CompletableFuture<GetTaskResponse> getTask(GetTaskRequest request);

    /**
     * @param request the request parameters of ListConnections  ListConnectionsRequest
     * @return ListConnectionsResponse
     */
    CompletableFuture<ListConnectionsResponse> listConnections(ListConnectionsRequest request);

    /**
     * @param request the request parameters of ListEnvironments  ListEnvironmentsRequest
     * @return ListEnvironmentsResponse
     */
    CompletableFuture<ListEnvironmentsResponse> listEnvironments(ListEnvironmentsRequest request);

    /**
     * @param request the request parameters of ListPipelines  ListPipelinesRequest
     * @return ListPipelinesResponse
     */
    CompletableFuture<ListPipelinesResponse> listPipelines(ListPipelinesRequest request);

    /**
     * @param request the request parameters of ListProjects  ListProjectsRequest
     * @return ListProjectsResponse
     */
    CompletableFuture<ListProjectsResponse> listProjects(ListProjectsRequest request);

    /**
     * @param request the request parameters of ListServiceDeployments  ListServiceDeploymentsRequest
     * @return ListServiceDeploymentsResponse
     */
    CompletableFuture<ListServiceDeploymentsResponse> listServiceDeployments(ListServiceDeploymentsRequest request);

    /**
     * @param request the request parameters of ListTasks  ListTasksRequest
     * @return ListTasksResponse
     */
    CompletableFuture<ListTasksResponse> listTasks(ListTasksRequest request);

    /**
     * @param request the request parameters of PreviewEnvironment  PreviewEnvironmentRequest
     * @return PreviewEnvironmentResponse
     */
    CompletableFuture<PreviewEnvironmentResponse> previewEnvironment(PreviewEnvironmentRequest request);

    /**
     * @param request the request parameters of PutArtifact  PutArtifactRequest
     * @return PutArtifactResponse
     */
    CompletableFuture<PutArtifactResponse> putArtifact(PutArtifactRequest request);

    /**
     * @param request the request parameters of PutPipelineStatus  PutPipelineStatusRequest
     * @return PutPipelineStatusResponse
     */
    CompletableFuture<PutPipelineStatusResponse> putPipelineStatus(PutPipelineStatusRequest request);

    /**
     * @param request the request parameters of PutTaskStatus  PutTaskStatusRequest
     * @return PutTaskStatusResponse
     */
    CompletableFuture<PutTaskStatusResponse> putTaskStatus(PutTaskStatusRequest request);

    /**
     * @param request the request parameters of RenderServicesByTemplate  RenderServicesByTemplateRequest
     * @return RenderServicesByTemplateResponse
     */
    CompletableFuture<RenderServicesByTemplateResponse> renderServicesByTemplate(RenderServicesByTemplateRequest request);

    /**
     * @param request the request parameters of ResumeTask  ResumeTaskRequest
     * @return ResumeTaskResponse
     */
    CompletableFuture<ResumeTaskResponse> resumeTask(ResumeTaskRequest request);

    /**
     * @param request the request parameters of RetryTask  RetryTaskRequest
     * @return RetryTaskResponse
     */
    CompletableFuture<RetryTaskResponse> retryTask(RetryTaskRequest request);

    /**
     * @param request the request parameters of StartPipeline  StartPipelineRequest
     * @return StartPipelineResponse
     */
    CompletableFuture<StartPipelineResponse> startPipeline(StartPipelineRequest request);

    /**
     * @param request the request parameters of StartTask  StartTaskRequest
     * @return StartTaskResponse
     */
    CompletableFuture<StartTaskResponse> startTask(StartTaskRequest request);

    /**
     * @param request the request parameters of UpdateEnvironment  UpdateEnvironmentRequest
     * @return UpdateEnvironmentResponse
     */
    CompletableFuture<UpdateEnvironmentResponse> updateEnvironment(UpdateEnvironmentRequest request);

    /**
     * @param request the request parameters of UpdateProject  UpdateProjectRequest
     * @return UpdateProjectResponse
     */
    CompletableFuture<UpdateProjectResponse> updateProject(UpdateProjectRequest request);

}
