// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openitag20220616;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.openitag20220616.models.*;
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

    CompletableFuture<AddWorkNodeWorkforceResponse> addWorkNodeWorkforce(AddWorkNodeWorkforceRequest request);

    CompletableFuture<AppendAllDataToTaskResponse> appendAllDataToTask(AppendAllDataToTaskRequest request);

    CompletableFuture<CreateTaskResponse> createTask(CreateTaskRequest request);

    CompletableFuture<CreateTemplateResponse> createTemplate(CreateTemplateRequest request);

    CompletableFuture<CreateUserResponse> createUser(CreateUserRequest request);

    CompletableFuture<DeleteTaskResponse> deleteTask(DeleteTaskRequest request);

    CompletableFuture<DeleteTemplateResponse> deleteTemplate(DeleteTemplateRequest request);

    CompletableFuture<DeleteUserResponse> deleteUser(DeleteUserRequest request);

    CompletableFuture<ExportAnnotationsResponse> exportAnnotations(ExportAnnotationsRequest request);

    CompletableFuture<GetJobResponse> getJob(GetJobRequest request);

    CompletableFuture<GetSubtaskResponse> getSubtask(GetSubtaskRequest request);

    CompletableFuture<GetSubtaskItemResponse> getSubtaskItem(GetSubtaskItemRequest request);

    CompletableFuture<GetTaskResponse> getTask(GetTaskRequest request);

    CompletableFuture<GetTaskStatisticsResponse> getTaskStatistics(GetTaskStatisticsRequest request);

    CompletableFuture<GetTaskStatusResponse> getTaskStatus(GetTaskStatusRequest request);

    CompletableFuture<GetTaskTemplateResponse> getTaskTemplate(GetTaskTemplateRequest request);

    CompletableFuture<GetTaskTemplateQuestionsResponse> getTaskTemplateQuestions(GetTaskTemplateQuestionsRequest request);

    CompletableFuture<GetTaskTemplateViewsResponse> getTaskTemplateViews(GetTaskTemplateViewsRequest request);

    CompletableFuture<GetTaskWorkforceResponse> getTaskWorkforce(GetTaskWorkforceRequest request);

    CompletableFuture<GetTaskWorkforceStatisticResponse> getTaskWorkforceStatistic(GetTaskWorkforceStatisticRequest request);

    CompletableFuture<GetTemplateResponse> getTemplate(GetTemplateRequest request);

    CompletableFuture<GetTemplateQuestionsResponse> getTemplateQuestions(GetTemplateQuestionsRequest request);

    CompletableFuture<GetTemplateViewResponse> getTemplateView(GetTemplateViewRequest request);

    CompletableFuture<GetTenantResponse> getTenant(GetTenantRequest request);

    CompletableFuture<GetUserResponse> getUser(GetUserRequest request);

    CompletableFuture<ListJobsResponse> listJobs(ListJobsRequest request);

    CompletableFuture<ListSubtaskItemsResponse> listSubtaskItems(ListSubtaskItemsRequest request);

    CompletableFuture<ListSubtasksResponse> listSubtasks(ListSubtasksRequest request);

    CompletableFuture<ListTasksResponse> listTasks(ListTasksRequest request);

    CompletableFuture<ListTemplatesResponse> listTemplates(ListTemplatesRequest request);

    CompletableFuture<ListTenantsResponse> listTenants(ListTenantsRequest request);

    CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request);

    CompletableFuture<RemoveWorkNodeWorkforceResponse> removeWorkNodeWorkforce(RemoveWorkNodeWorkforceRequest request);

    CompletableFuture<UpdateTaskResponse> updateTask(UpdateTaskRequest request);

    CompletableFuture<UpdateTaskWorkforceResponse> updateTaskWorkforce(UpdateTaskWorkforceRequest request);

    CompletableFuture<UpdateTemplateResponse> updateTemplate(UpdateTemplateRequest request);

    CompletableFuture<UpdateTenantResponse> updateTenant(UpdateTenantRequest request);

    CompletableFuture<UpdateUserResponse> updateUser(UpdateUserRequest request);

}
