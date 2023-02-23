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

    /**
      * Before you call this operation, you must add the following dependency to the pom.xml file:
      * ```xml
      * <dependency>
      *     <groupId>com.aliyun</groupId>
      *     <artifactId>aliyun-java-sdk-schedulerx2</artifactId>
      *     <version>1.0.4</version>
      * </dependency>
      * ```
      *
     */
    CompletableFuture<BatchDeleteJobsResponse> batchDeleteJobs(BatchDeleteJobsRequest request);

    CompletableFuture<BatchDeleteRouteStrategyResponse> batchDeleteRouteStrategy(BatchDeleteRouteStrategyRequest request);

    /**
      * Before you call this operation, you must add the following dependency to the pom.xml file:
      * ```xml
      * <dependency>
      *     <groupId>com.aliyun</groupId>
      *     <artifactId>aliyun-java-sdk-schedulerx2</artifactId>
      *     <version>1.0.4</version>
      * </dependency>
      * ```
      *
     */
    CompletableFuture<BatchDisableJobsResponse> batchDisableJobs(BatchDisableJobsRequest request);

    /**
      * Before you call this operation, you must add the following dependency to the pom.xml file:
      * ```xml
      * <dependency>
      *     <groupId>com.aliyun</groupId>
      *     <artifactId>aliyun-java-sdk-schedulerx2</artifactId>
      *     <version>1.0.4</version>
      * </dependency>
      * ```
      *
     */
    CompletableFuture<BatchEnableJobsResponse> batchEnableJobs(BatchEnableJobsRequest request);

    CompletableFuture<CreateAppGroupResponse> createAppGroup(CreateAppGroupRequest request);

    CompletableFuture<CreateJobResponse> createJob(CreateJobRequest request);

    CompletableFuture<CreateNamespaceResponse> createNamespace(CreateNamespaceRequest request);

    CompletableFuture<CreateRouteStrategyResponse> createRouteStrategy(CreateRouteStrategyRequest request);

    CompletableFuture<CreateWorkflowResponse> createWorkflow(CreateWorkflowRequest request);

    CompletableFuture<DeleteAppGroupResponse> deleteAppGroup(DeleteAppGroupRequest request);

    CompletableFuture<DeleteJobResponse> deleteJob(DeleteJobRequest request);

    CompletableFuture<DeleteRouteStrategyResponse> deleteRouteStrategy(DeleteRouteStrategyRequest request);

    CompletableFuture<DeleteWorkflowResponse> deleteWorkflow(DeleteWorkflowRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DesignateWorkersResponse> designateWorkers(DesignateWorkersRequest request);

    CompletableFuture<DisableJobResponse> disableJob(DisableJobRequest request);

    CompletableFuture<DisableWorkflowResponse> disableWorkflow(DisableWorkflowRequest request);

    CompletableFuture<EnableJobResponse> enableJob(EnableJobRequest request);

    CompletableFuture<EnableWorkflowResponse> enableWorkflow(EnableWorkflowRequest request);

    /**
      * > : The combination of the `JobID` and `ScheduleTime` parameters serves as a unique index. Therefore, after the ExecuteJob operation is called to run a job once, a sleep for one second is required before the ExecuteJob operation is called to run the job again. Otherwise, the job may fail.
      *
     */
    CompletableFuture<ExecuteJobResponse> executeJob(ExecuteJobRequest request);

    CompletableFuture<ExecuteWorkflowResponse> executeWorkflow(ExecuteWorkflowRequest request);

    CompletableFuture<GetAppGroupResponse> getAppGroup(GetAppGroupRequest request);

    CompletableFuture<GetJobInfoResponse> getJobInfo(GetJobInfoRequest request);

    CompletableFuture<GetJobInstanceResponse> getJobInstance(GetJobInstanceRequest request);

    CompletableFuture<GetJobInstanceListResponse> getJobInstanceList(GetJobInstanceListRequest request);

    CompletableFuture<GetLogResponse> getLog(GetLogRequest request);

    CompletableFuture<GetWorkFlowResponse> getWorkFlow(GetWorkFlowRequest request);

    CompletableFuture<GetWorkerListResponse> getWorkerList(GetWorkerListRequest request);

    CompletableFuture<GetWorkflowInstanceResponse> getWorkflowInstance(GetWorkflowInstanceRequest request);

    CompletableFuture<GrantPermissionResponse> grantPermission(GrantPermissionRequest request);

    /**
      * >  Before you call this operation, you must add the following dependency to the pom.xml file:
      *       <groupId>com.aliyun</groupId>
      *       <artifactId>aliyun-java-sdk-schedulerx2</artifactId>
      *       <version>1.0.5</version>
      *
     */
    CompletableFuture<ListGroupsResponse> listGroups(ListGroupsRequest request);

    /**
      * Before you call this operation, you must add the following dependency to the pom.xml file:
      *     <dependency>
      *           <groupId>com.aliyun</groupId>
      *           <artifactId>aliyun-java-sdk-schedulerx2</artifactId>
      *           <version>1.0.5</version>
      *     </dependency>
      *
     */
    CompletableFuture<ListJobsResponse> listJobs(ListJobsRequest request);

    /**
      * Before you call this operation, you must add the following dependency to the pom.xml file:
      *     <dependency>
      *         <groupId>com.aliyun</groupId>
      *         <artifactId>aliyun-java-sdk-schedulerx2</artifactId>
      *         <version>1.0.5</version>
      *     </dependency>
      *
     */
    CompletableFuture<ListNamespacesResponse> listNamespaces(ListNamespacesRequest request);

    CompletableFuture<ListWorkflowInstanceResponse> listWorkflowInstance(ListWorkflowInstanceRequest request);

    CompletableFuture<RerunJobResponse> rerunJob(RerunJobRequest request);

    CompletableFuture<RetryJobInstanceResponse> retryJobInstance(RetryJobInstanceRequest request);

    CompletableFuture<RevokePermissionResponse> revokePermission(RevokePermissionRequest request);

    CompletableFuture<SetJobInstanceSuccessResponse> setJobInstanceSuccess(SetJobInstanceSuccessRequest request);

    CompletableFuture<SetWfInstanceSuccessResponse> setWfInstanceSuccess(SetWfInstanceSuccessRequest request);

    CompletableFuture<StopInstanceResponse> stopInstance(StopInstanceRequest request);

    CompletableFuture<UpdateAppGroupResponse> updateAppGroup(UpdateAppGroupRequest request);

    CompletableFuture<UpdateJobResponse> updateJob(UpdateJobRequest request);

    CompletableFuture<UpdateWorkflowResponse> updateWorkflow(UpdateWorkflowRequest request);

    CompletableFuture<UpdateWorkflowDagResponse> updateWorkflowDag(UpdateWorkflowDagRequest request);

}
