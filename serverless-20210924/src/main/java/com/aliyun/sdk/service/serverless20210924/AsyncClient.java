// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.serverless20210924.models.*;
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

    CompletableFuture<CreateApplicationResponse> createApplication(CreateApplicationRequest request);

    CompletableFuture<CreatePipelineResponse> createPipeline(CreatePipelineRequest request);

    CompletableFuture<CreatePipelineTemplateResponse> createPipelineTemplate(CreatePipelineTemplateRequest request);

    CompletableFuture<CreateReleaseResponse> createRelease(CreateReleaseRequest request);

    CompletableFuture<CreateTaskResponse> createTask(CreateTaskRequest request);

    CompletableFuture<CreateTaskTemplateResponse> createTaskTemplate(CreateTaskTemplateRequest request);

    CompletableFuture<DeleteApplicationResponse> deleteApplication(DeleteApplicationRequest request);

    CompletableFuture<DeleteEnvironmentResponse> deleteEnvironment(DeleteEnvironmentRequest request);

    CompletableFuture<DeletePipelineTemplateResponse> deletePipelineTemplate(DeletePipelineTemplateRequest request);

    CompletableFuture<DeleteTaskTemplateResponse> deleteTaskTemplate(DeleteTaskTemplateRequest request);

    CompletableFuture<DeleteTemplateResponse> deleteTemplate(DeleteTemplateRequest request);

    CompletableFuture<GetApplicationResponse> getApplication(GetApplicationRequest request);

    CompletableFuture<GetEnvironmentResponse> getEnvironment(GetEnvironmentRequest request);

    CompletableFuture<GetPipelineResponse> getPipeline(GetPipelineRequest request);

    CompletableFuture<GetPipelineTemplateResponse> getPipelineTemplate(GetPipelineTemplateRequest request);

    CompletableFuture<GetReleaseResponse> getRelease(GetReleaseRequest request);

    CompletableFuture<GetServiceResponse> getService(GetServiceRequest request);

    CompletableFuture<GetTaskResponse> getTask(GetTaskRequest request);

    CompletableFuture<GetTaskTemplateResponse> getTaskTemplate(GetTaskTemplateRequest request);

    CompletableFuture<GetTemplateResponse> getTemplate(GetTemplateRequest request);

    CompletableFuture<ListEnvironmentRevisionsResponse> listEnvironmentRevisions(ListEnvironmentRevisionsRequest request);

    CompletableFuture<ListEnvironmentsResponse> listEnvironments(ListEnvironmentsRequest request);

    CompletableFuture<ListPipelineTemplatesResponse> listPipelineTemplates(ListPipelineTemplatesRequest request);

    CompletableFuture<ListPipelinesResponse> listPipelines(ListPipelinesRequest request);

    CompletableFuture<ListServiceRevisionsResponse> listServiceRevisions(ListServiceRevisionsRequest request);

    CompletableFuture<ListServicesResponse> listServices(ListServicesRequest request);

    CompletableFuture<ListTaskTemplatesResponse> listTaskTemplates(ListTaskTemplatesRequest request);

    CompletableFuture<ListTasksResponse> listTasks(ListTasksRequest request);

    CompletableFuture<ListTemplateRevisionsResponse> listTemplateRevisions(ListTemplateRevisionsRequest request);

    CompletableFuture<ListTemplatesResponse> listTemplates(ListTemplatesRequest request);

    CompletableFuture<PutEnvironmentResponse> putEnvironment(PutEnvironmentRequest request);

    CompletableFuture<PutPipelineStatusResponse> putPipelineStatus(PutPipelineStatusRequest request);

    CompletableFuture<PutPipelineTemplateResponse> putPipelineTemplate(PutPipelineTemplateRequest request);

    CompletableFuture<PutServiceResponse> putService(PutServiceRequest request);

    CompletableFuture<PutTaskStatusResponse> putTaskStatus(PutTaskStatusRequest request);

    CompletableFuture<PutTaskTemplateResponse> putTaskTemplate(PutTaskTemplateRequest request);

    CompletableFuture<PutTemplateResponse> putTemplate(PutTemplateRequest request);

    CompletableFuture<ResumeTaskResponse> resumeTask(ResumeTaskRequest request);

    CompletableFuture<StartPipelineResponse> startPipeline(StartPipelineRequest request);

    CompletableFuture<StartTaskResponse> startTask(StartTaskRequest request);

    CompletableFuture<UpdateApplicationResponse> updateApplication(UpdateApplicationRequest request);

}
