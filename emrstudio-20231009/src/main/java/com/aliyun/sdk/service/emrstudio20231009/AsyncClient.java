// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emrstudio20231009;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.emrstudio20231009.models.*;
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

    CompletableFuture<DescribeManualTaskResponse> describeManualTask(DescribeManualTaskRequest request);

    CompletableFuture<DescribeManualTaskInstanceResponse> describeManualTaskInstance(DescribeManualTaskInstanceRequest request);

    CompletableFuture<DescribeProjectResponse> describeProject(DescribeProjectRequest request);

    CompletableFuture<DescribeTaskResponse> describeTask(DescribeTaskRequest request);

    CompletableFuture<DescribeTaskInstanceResponse> describeTaskInstance(DescribeTaskInstanceRequest request);

    CompletableFuture<DescribeWorkflowResponse> describeWorkflow(DescribeWorkflowRequest request);

    CompletableFuture<DescribeWorkflowInstanceResponse> describeWorkflowInstance(DescribeWorkflowInstanceRequest request);

    CompletableFuture<ListManualTaskInstancesResponse> listManualTaskInstances(ListManualTaskInstancesRequest request);

    CompletableFuture<ListManualTasksResponse> listManualTasks(ListManualTasksRequest request);

    CompletableFuture<ListProjectsResponse> listProjects(ListProjectsRequest request);

    CompletableFuture<ListTaskInstancesResponse> listTaskInstances(ListTaskInstancesRequest request);

    CompletableFuture<ListTasksResponse> listTasks(ListTasksRequest request);

    CompletableFuture<ListWorkflowInstancesResponse> listWorkflowInstances(ListWorkflowInstancesRequest request);

    CompletableFuture<ListWorkflowsResponse> listWorkflows(ListWorkflowsRequest request);

}
