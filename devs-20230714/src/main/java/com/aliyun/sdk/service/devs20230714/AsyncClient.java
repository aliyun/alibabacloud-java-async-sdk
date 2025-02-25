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

    CompletableFuture<ActivateConnectionResponse> activateConnection(ActivateConnectionRequest request);

    CompletableFuture<CancelPipelineResponse> cancelPipeline(CancelPipelineRequest request);

    CompletableFuture<CancelTaskResponse> cancelTask(CancelTaskRequest request);

    CompletableFuture<CreateConnectionResponse> createConnection(CreateConnectionRequest request);

    CompletableFuture<CreateEnvironmentResponse> createEnvironment(CreateEnvironmentRequest request);

    CompletableFuture<CreatePipelineResponse> createPipeline(CreatePipelineRequest request);

    CompletableFuture<CreatePipelineTemplateResponse> createPipelineTemplate(CreatePipelineTemplateRequest request);

    CompletableFuture<CreatePipelineTriggerResponse> createPipelineTrigger(CreatePipelineTriggerRequest request);

    CompletableFuture<CreatePipelineTriggerEventResponse> createPipelineTriggerEvent(CreatePipelineTriggerEventRequest request);

    CompletableFuture<CreateProjectResponse> createProject(CreateProjectRequest request);

    CompletableFuture<CreateRepositoryResponse> createRepository(CreateRepositoryRequest request);

    CompletableFuture<CreateTaskResponse> createTask(CreateTaskRequest request);

    CompletableFuture<CreateTaskTemplateResponse> createTaskTemplate(CreateTaskTemplateRequest request);

    CompletableFuture<DeleteConnectionResponse> deleteConnection(DeleteConnectionRequest request);

    CompletableFuture<DeleteEnvironmentResponse> deleteEnvironment(DeleteEnvironmentRequest request);

    CompletableFuture<DeletePipelineTemplateResponse> deletePipelineTemplate(DeletePipelineTemplateRequest request);

    CompletableFuture<DeletePipelineTriggerResponse> deletePipelineTrigger(DeletePipelineTriggerRequest request);

    CompletableFuture<DeletePipelineTriggerEventResponse> deletePipelineTriggerEvent(DeletePipelineTriggerEventRequest request);

    CompletableFuture<DeleteProjectResponse> deleteProject(DeleteProjectRequest request);

    CompletableFuture<DeleteRepositoryResponse> deleteRepository(DeleteRepositoryRequest request);

    CompletableFuture<DeleteTaskTemplateResponse> deleteTaskTemplate(DeleteTaskTemplateRequest request);

    CompletableFuture<FetchConnectionCredentialResponse> fetchConnectionCredential(FetchConnectionCredentialRequest request);

    CompletableFuture<FetchRepositoryCheckoutResponse> fetchRepositoryCheckout(FetchRepositoryCheckoutRequest request);

    CompletableFuture<GetConnectionResponse> getConnection(GetConnectionRequest request);

    CompletableFuture<GetEnvironmentResponse> getEnvironment(GetEnvironmentRequest request);

    CompletableFuture<GetPipelineResponse> getPipeline(GetPipelineRequest request);

    CompletableFuture<GetPipelineTemplateResponse> getPipelineTemplate(GetPipelineTemplateRequest request);

    CompletableFuture<GetPipelineTriggerResponse> getPipelineTrigger(GetPipelineTriggerRequest request);

    CompletableFuture<GetPipelineTriggerEventResponse> getPipelineTriggerEvent(GetPipelineTriggerEventRequest request);

    CompletableFuture<GetProjectResponse> getProject(GetProjectRequest request);

    CompletableFuture<GetRepositoryResponse> getRepository(GetRepositoryRequest request);

    CompletableFuture<GetTaskResponse> getTask(GetTaskRequest request);

    CompletableFuture<GetTaskTemplateResponse> getTaskTemplate(GetTaskTemplateRequest request);

    CompletableFuture<ListConnectionsResponse> listConnections(ListConnectionsRequest request);

    CompletableFuture<ListEnvironmentsResponse> listEnvironments(ListEnvironmentsRequest request);

    CompletableFuture<ListPipelineTemplatesResponse> listPipelineTemplates(ListPipelineTemplatesRequest request);

    CompletableFuture<ListPipelineTriggerEventsResponse> listPipelineTriggerEvents(ListPipelineTriggerEventsRequest request);

    CompletableFuture<ListPipelineTriggersResponse> listPipelineTriggers(ListPipelineTriggersRequest request);

    CompletableFuture<ListPipelinesResponse> listPipelines(ListPipelinesRequest request);

    CompletableFuture<ListProjectsResponse> listProjects(ListProjectsRequest request);

    CompletableFuture<ListRepositoriesResponse> listRepositories(ListRepositoriesRequest request);

    CompletableFuture<ListTaskTemplatesResponse> listTaskTemplates(ListTaskTemplatesRequest request);

    CompletableFuture<ListTasksResponse> listTasks(ListTasksRequest request);

    CompletableFuture<PutEnvironmentResponse> putEnvironment(PutEnvironmentRequest request);

    CompletableFuture<PutPipelineStatusResponse> putPipelineStatus(PutPipelineStatusRequest request);

    CompletableFuture<PutPipelineTemplateResponse> putPipelineTemplate(PutPipelineTemplateRequest request);

    CompletableFuture<PutPipelineTriggerResponse> putPipelineTrigger(PutPipelineTriggerRequest request);

    CompletableFuture<PutProjectResponse> putProject(PutProjectRequest request);

    CompletableFuture<PutTaskStatusResponse> putTaskStatus(PutTaskStatusRequest request);

    CompletableFuture<PutTaskTemplateResponse> putTaskTemplate(PutTaskTemplateRequest request);

    CompletableFuture<RefreshConnectionResponse> refreshConnection(RefreshConnectionRequest request);

    CompletableFuture<ResumeTaskResponse> resumeTask(ResumeTaskRequest request);

    CompletableFuture<RetryTaskResponse> retryTask(RetryTaskRequest request);

    CompletableFuture<StartPipelineResponse> startPipeline(StartPipelineRequest request);

    CompletableFuture<StartTaskResponse> startTask(StartTaskRequest request);

    CompletableFuture<UpdateEnvironmentResponse> updateEnvironment(UpdateEnvironmentRequest request);

    CompletableFuture<UpdatePipelineTriggerResponse> updatePipelineTrigger(UpdatePipelineTriggerRequest request);

    CompletableFuture<UpdateProjectResponse> updateProject(UpdateProjectRequest request);

}
