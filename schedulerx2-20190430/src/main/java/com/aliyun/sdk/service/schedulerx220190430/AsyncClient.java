// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.schedulerx220190430.models.*;
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

    CompletableFuture<BatchDeleteJobResponse> batchDeleteJob(BatchDeleteJobRequest request);

    CompletableFuture<BatchDeleteJobsResponse> batchDeleteJobs(BatchDeleteJobsRequest request);

    CompletableFuture<BatchDisableJobResponse> batchDisableJob(BatchDisableJobRequest request);

    CompletableFuture<BatchDisableJobsResponse> batchDisableJobs(BatchDisableJobsRequest request);

    CompletableFuture<BatchEnableJobResponse> batchEnableJob(BatchEnableJobRequest request);

    CompletableFuture<BatchEnableJobsResponse> batchEnableJobs(BatchEnableJobsRequest request);

    CompletableFuture<CreateAppGroupResponse> createAppGroup(CreateAppGroupRequest request);

    CompletableFuture<CreateJobResponse> createJob(CreateJobRequest request);

    CompletableFuture<DeleteJobResponse> deleteJob(DeleteJobRequest request);

    CompletableFuture<DeleteWorkflowResponse> deleteWorkflow(DeleteWorkflowRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DesignateWorkersResponse> designateWorkers(DesignateWorkersRequest request);

    CompletableFuture<DisableJobResponse> disableJob(DisableJobRequest request);

    CompletableFuture<DisableWorkflowResponse> disableWorkflow(DisableWorkflowRequest request);

    CompletableFuture<EnableJobResponse> enableJob(EnableJobRequest request);

    CompletableFuture<EnableWorkflowResponse> enableWorkflow(EnableWorkflowRequest request);

    CompletableFuture<ExecuteJobResponse> executeJob(ExecuteJobRequest request);

    CompletableFuture<ExecuteWorkflowResponse> executeWorkflow(ExecuteWorkflowRequest request);

    CompletableFuture<GetJobInfoResponse> getJobInfo(GetJobInfoRequest request);

    CompletableFuture<GetJobInstanceResponse> getJobInstance(GetJobInstanceRequest request);

    CompletableFuture<GetJobInstanceListResponse> getJobInstanceList(GetJobInstanceListRequest request);

    CompletableFuture<GetWorkFlowResponse> getWorkFlow(GetWorkFlowRequest request);

    CompletableFuture<GetWorkerListResponse> getWorkerList(GetWorkerListRequest request);

    CompletableFuture<GrantPermissionResponse> grantPermission(GrantPermissionRequest request);

    CompletableFuture<ListGroupsResponse> listGroups(ListGroupsRequest request);

    CompletableFuture<ListJobsResponse> listJobs(ListJobsRequest request);

    CompletableFuture<ListNamespacesResponse> listNamespaces(ListNamespacesRequest request);

    CompletableFuture<RevokePermissionResponse> revokePermission(RevokePermissionRequest request);

    CompletableFuture<StopInstanceResponse> stopInstance(StopInstanceRequest request);

    CompletableFuture<UpdateJobResponse> updateJob(UpdateJobRequest request);

}
