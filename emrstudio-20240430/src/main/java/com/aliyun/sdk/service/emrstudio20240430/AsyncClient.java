// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emrstudio20240430;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.emrstudio20240430.models.*;
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
     * @param request the request parameters of CreateWorkflow  CreateWorkflowRequest
     * @return CreateWorkflowResponse
     */
    CompletableFuture<CreateWorkflowResponse> createWorkflow(CreateWorkflowRequest request);

    /**
     * @param request the request parameters of DeleteWorkflow  DeleteWorkflowRequest
     * @return DeleteWorkflowResponse
     */
    CompletableFuture<DeleteWorkflowResponse> deleteWorkflow(DeleteWorkflowRequest request);

    /**
     * @param request the request parameters of DescribeId  DescribeIdRequest
     * @return DescribeIdResponse
     */
    CompletableFuture<DescribeIdResponse> describeId(DescribeIdRequest request);

    /**
     * @param request the request parameters of DescribeManualTask  DescribeManualTaskRequest
     * @return DescribeManualTaskResponse
     */
    CompletableFuture<DescribeManualTaskResponse> describeManualTask(DescribeManualTaskRequest request);

    /**
     * @param request the request parameters of DescribeManualTaskInstance  DescribeManualTaskInstanceRequest
     * @return DescribeManualTaskInstanceResponse
     */
    CompletableFuture<DescribeManualTaskInstanceResponse> describeManualTaskInstance(DescribeManualTaskInstanceRequest request);

    /**
     * @param request the request parameters of DescribeProject  DescribeProjectRequest
     * @return DescribeProjectResponse
     */
    CompletableFuture<DescribeProjectResponse> describeProject(DescribeProjectRequest request);

    /**
     * @param request the request parameters of DescribeTask  DescribeTaskRequest
     * @return DescribeTaskResponse
     */
    CompletableFuture<DescribeTaskResponse> describeTask(DescribeTaskRequest request);

    /**
     * @param request the request parameters of DescribeTaskInstance  DescribeTaskInstanceRequest
     * @return DescribeTaskInstanceResponse
     */
    CompletableFuture<DescribeTaskInstanceResponse> describeTaskInstance(DescribeTaskInstanceRequest request);

    /**
     * @param request the request parameters of DescribeWorkflow  DescribeWorkflowRequest
     * @return DescribeWorkflowResponse
     */
    CompletableFuture<DescribeWorkflowResponse> describeWorkflow(DescribeWorkflowRequest request);

    /**
     * @param request the request parameters of DescribeWorkflowInstance  DescribeWorkflowInstanceRequest
     * @return DescribeWorkflowInstanceResponse
     */
    CompletableFuture<DescribeWorkflowInstanceResponse> describeWorkflowInstance(DescribeWorkflowInstanceRequest request);

    /**
     * @param request the request parameters of GetInstanceLog  GetInstanceLogRequest
     * @return GetInstanceLogResponse
     */
    CompletableFuture<GetInstanceLogResponse> getInstanceLog(GetInstanceLogRequest request);

    /**
     * @param request the request parameters of ListAlertGroups  ListAlertGroupsRequest
     * @return ListAlertGroupsResponse
     */
    CompletableFuture<ListAlertGroupsResponse> listAlertGroups(ListAlertGroupsRequest request);

    /**
     * @param request the request parameters of ListManualTaskInstances  ListManualTaskInstancesRequest
     * @return ListManualTaskInstancesResponse
     */
    CompletableFuture<ListManualTaskInstancesResponse> listManualTaskInstances(ListManualTaskInstancesRequest request);

    /**
     * @param request the request parameters of ListManualTasks  ListManualTasksRequest
     * @return ListManualTasksResponse
     */
    CompletableFuture<ListManualTasksResponse> listManualTasks(ListManualTasksRequest request);

    /**
     * @param request the request parameters of ListProjects  ListProjectsRequest
     * @return ListProjectsResponse
     */
    CompletableFuture<ListProjectsResponse> listProjects(ListProjectsRequest request);

    /**
     * @param request the request parameters of ListResourceGroups  ListResourceGroupsRequest
     * @return ListResourceGroupsResponse
     */
    CompletableFuture<ListResourceGroupsResponse> listResourceGroups(ListResourceGroupsRequest request);

    /**
     * @param request the request parameters of ListTaskInstances  ListTaskInstancesRequest
     * @return ListTaskInstancesResponse
     */
    CompletableFuture<ListTaskInstancesResponse> listTaskInstances(ListTaskInstancesRequest request);

    /**
     * @param request the request parameters of ListTasks  ListTasksRequest
     * @return ListTasksResponse
     */
    CompletableFuture<ListTasksResponse> listTasks(ListTasksRequest request);

    /**
     * @param request the request parameters of ListWorkflowDirectories  ListWorkflowDirectoriesRequest
     * @return ListWorkflowDirectoriesResponse
     */
    CompletableFuture<ListWorkflowDirectoriesResponse> listWorkflowDirectories(ListWorkflowDirectoriesRequest request);

    /**
     * @param request the request parameters of ListWorkflowInstances  ListWorkflowInstancesRequest
     * @return ListWorkflowInstancesResponse
     */
    CompletableFuture<ListWorkflowInstancesResponse> listWorkflowInstances(ListWorkflowInstancesRequest request);

    /**
     * @param request the request parameters of ListWorkflows  ListWorkflowsRequest
     * @return ListWorkflowsResponse
     */
    CompletableFuture<ListWorkflowsResponse> listWorkflows(ListWorkflowsRequest request);

    /**
     * @param request the request parameters of OperateWorkflowInstance  OperateWorkflowInstanceRequest
     * @return OperateWorkflowInstanceResponse
     */
    CompletableFuture<OperateWorkflowInstanceResponse> operateWorkflowInstance(OperateWorkflowInstanceRequest request);

    /**
     * @param request the request parameters of RunWorkflow  RunWorkflowRequest
     * @return RunWorkflowResponse
     */
    CompletableFuture<RunWorkflowResponse> runWorkflow(RunWorkflowRequest request);

    /**
     * @param request the request parameters of UpdateWorkflow  UpdateWorkflowRequest
     * @return UpdateWorkflowResponse
     */
    CompletableFuture<UpdateWorkflowResponse> updateWorkflow(UpdateWorkflowRequest request);

}
