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

    /**
     * @param request the request parameters of AddWorkNodeWorkforce  AddWorkNodeWorkforceRequest
     * @return AddWorkNodeWorkforceResponse
     */
    CompletableFuture<AddWorkNodeWorkforceResponse> addWorkNodeWorkforce(AddWorkNodeWorkforceRequest request);

    /**
     * @param request the request parameters of AppendAllDataToTask  AppendAllDataToTaskRequest
     * @return AppendAllDataToTaskResponse
     */
    CompletableFuture<AppendAllDataToTaskResponse> appendAllDataToTask(AppendAllDataToTaskRequest request);

    /**
     * @param request the request parameters of CreateTask  CreateTaskRequest
     * @return CreateTaskResponse
     */
    CompletableFuture<CreateTaskResponse> createTask(CreateTaskRequest request);

    /**
     * @param request the request parameters of CreateTemplate  CreateTemplateRequest
     * @return CreateTemplateResponse
     */
    CompletableFuture<CreateTemplateResponse> createTemplate(CreateTemplateRequest request);

    /**
     * @param request the request parameters of CreateUser  CreateUserRequest
     * @return CreateUserResponse
     */
    CompletableFuture<CreateUserResponse> createUser(CreateUserRequest request);

    /**
     * @param request the request parameters of DeleteTask  DeleteTaskRequest
     * @return DeleteTaskResponse
     */
    CompletableFuture<DeleteTaskResponse> deleteTask(DeleteTaskRequest request);

    /**
     * @param request the request parameters of DeleteTemplate  DeleteTemplateRequest
     * @return DeleteTemplateResponse
     */
    CompletableFuture<DeleteTemplateResponse> deleteTemplate(DeleteTemplateRequest request);

    /**
     * @param request the request parameters of DeleteUser  DeleteUserRequest
     * @return DeleteUserResponse
     */
    CompletableFuture<DeleteUserResponse> deleteUser(DeleteUserRequest request);

    /**
     * @param request the request parameters of ExportAnnotations  ExportAnnotationsRequest
     * @return ExportAnnotationsResponse
     */
    CompletableFuture<ExportAnnotationsResponse> exportAnnotations(ExportAnnotationsRequest request);

    /**
     * @param request the request parameters of GetJob  GetJobRequest
     * @return GetJobResponse
     */
    CompletableFuture<GetJobResponse> getJob(GetJobRequest request);

    /**
     * @param request the request parameters of GetSubtask  GetSubtaskRequest
     * @return GetSubtaskResponse
     */
    CompletableFuture<GetSubtaskResponse> getSubtask(GetSubtaskRequest request);

    /**
     * @param request the request parameters of GetSubtaskItem  GetSubtaskItemRequest
     * @return GetSubtaskItemResponse
     */
    CompletableFuture<GetSubtaskItemResponse> getSubtaskItem(GetSubtaskItemRequest request);

    /**
     * @param request the request parameters of GetTask  GetTaskRequest
     * @return GetTaskResponse
     */
    CompletableFuture<GetTaskResponse> getTask(GetTaskRequest request);

    /**
     * @param request the request parameters of GetTaskStatistics  GetTaskStatisticsRequest
     * @return GetTaskStatisticsResponse
     */
    CompletableFuture<GetTaskStatisticsResponse> getTaskStatistics(GetTaskStatisticsRequest request);

    /**
     * @param request the request parameters of GetTaskStatus  GetTaskStatusRequest
     * @return GetTaskStatusResponse
     */
    CompletableFuture<GetTaskStatusResponse> getTaskStatus(GetTaskStatusRequest request);

    /**
     * @param request the request parameters of GetTaskTemplate  GetTaskTemplateRequest
     * @return GetTaskTemplateResponse
     */
    CompletableFuture<GetTaskTemplateResponse> getTaskTemplate(GetTaskTemplateRequest request);

    /**
     * @param request the request parameters of GetTaskTemplateQuestions  GetTaskTemplateQuestionsRequest
     * @return GetTaskTemplateQuestionsResponse
     */
    CompletableFuture<GetTaskTemplateQuestionsResponse> getTaskTemplateQuestions(GetTaskTemplateQuestionsRequest request);

    /**
     * @param request the request parameters of GetTaskTemplateViews  GetTaskTemplateViewsRequest
     * @return GetTaskTemplateViewsResponse
     */
    CompletableFuture<GetTaskTemplateViewsResponse> getTaskTemplateViews(GetTaskTemplateViewsRequest request);

    /**
     * @param request the request parameters of GetTaskWorkforce  GetTaskWorkforceRequest
     * @return GetTaskWorkforceResponse
     */
    CompletableFuture<GetTaskWorkforceResponse> getTaskWorkforce(GetTaskWorkforceRequest request);

    /**
     * @param request the request parameters of GetTaskWorkforceStatistic  GetTaskWorkforceStatisticRequest
     * @return GetTaskWorkforceStatisticResponse
     */
    CompletableFuture<GetTaskWorkforceStatisticResponse> getTaskWorkforceStatistic(GetTaskWorkforceStatisticRequest request);

    /**
     * @param request the request parameters of GetTemplate  GetTemplateRequest
     * @return GetTemplateResponse
     */
    CompletableFuture<GetTemplateResponse> getTemplate(GetTemplateRequest request);

    /**
     * @param request the request parameters of GetTemplateQuestions  GetTemplateQuestionsRequest
     * @return GetTemplateQuestionsResponse
     */
    CompletableFuture<GetTemplateQuestionsResponse> getTemplateQuestions(GetTemplateQuestionsRequest request);

    /**
     * @param request the request parameters of GetTemplateView  GetTemplateViewRequest
     * @return GetTemplateViewResponse
     */
    CompletableFuture<GetTemplateViewResponse> getTemplateView(GetTemplateViewRequest request);

    /**
     * @param request the request parameters of GetTenant  GetTenantRequest
     * @return GetTenantResponse
     */
    CompletableFuture<GetTenantResponse> getTenant(GetTenantRequest request);

    /**
     * @param request the request parameters of GetUser  GetUserRequest
     * @return GetUserResponse
     */
    CompletableFuture<GetUserResponse> getUser(GetUserRequest request);

    /**
     * @param request the request parameters of ListJobs  ListJobsRequest
     * @return ListJobsResponse
     */
    CompletableFuture<ListJobsResponse> listJobs(ListJobsRequest request);

    /**
     * @param request the request parameters of ListSubtaskItems  ListSubtaskItemsRequest
     * @return ListSubtaskItemsResponse
     */
    CompletableFuture<ListSubtaskItemsResponse> listSubtaskItems(ListSubtaskItemsRequest request);

    /**
     * @param request the request parameters of ListSubtasks  ListSubtasksRequest
     * @return ListSubtasksResponse
     */
    CompletableFuture<ListSubtasksResponse> listSubtasks(ListSubtasksRequest request);

    /**
     * @param request the request parameters of ListTasks  ListTasksRequest
     * @return ListTasksResponse
     */
    CompletableFuture<ListTasksResponse> listTasks(ListTasksRequest request);

    /**
     * @param request the request parameters of ListTemplates  ListTemplatesRequest
     * @return ListTemplatesResponse
     */
    CompletableFuture<ListTemplatesResponse> listTemplates(ListTemplatesRequest request);

    /**
     * @param request the request parameters of ListTenants  ListTenantsRequest
     * @return ListTenantsResponse
     */
    CompletableFuture<ListTenantsResponse> listTenants(ListTenantsRequest request);

    /**
     * @param request the request parameters of ListUsers  ListUsersRequest
     * @return ListUsersResponse
     */
    CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request);

    /**
     * @param request the request parameters of RemoveWorkNodeWorkforce  RemoveWorkNodeWorkforceRequest
     * @return RemoveWorkNodeWorkforceResponse
     */
    CompletableFuture<RemoveWorkNodeWorkforceResponse> removeWorkNodeWorkforce(RemoveWorkNodeWorkforceRequest request);

    /**
     * @param request the request parameters of UpdateTask  UpdateTaskRequest
     * @return UpdateTaskResponse
     */
    CompletableFuture<UpdateTaskResponse> updateTask(UpdateTaskRequest request);

    /**
     * @param request the request parameters of UpdateTaskWorkforce  UpdateTaskWorkforceRequest
     * @return UpdateTaskWorkforceResponse
     */
    CompletableFuture<UpdateTaskWorkforceResponse> updateTaskWorkforce(UpdateTaskWorkforceRequest request);

    /**
     * @param request the request parameters of UpdateTemplate  UpdateTemplateRequest
     * @return UpdateTemplateResponse
     */
    CompletableFuture<UpdateTemplateResponse> updateTemplate(UpdateTemplateRequest request);

    /**
     * @param request the request parameters of UpdateTenant  UpdateTenantRequest
     * @return UpdateTenantResponse
     */
    CompletableFuture<UpdateTenantResponse> updateTenant(UpdateTenantRequest request);

    /**
     * @param request the request parameters of UpdateUser  UpdateUserRequest
     * @return UpdateUserResponse
     */
    CompletableFuture<UpdateUserResponse> updateUser(UpdateUserRequest request);

}
