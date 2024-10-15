// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.schedulerx220190430.models.*;
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
     * <b>description</b> :
     * <p>Before you call this operation, you must add the following dependency to the pom.xml file:</p>
     * <pre><code class="language-xml">&lt;dependency&gt;
     *     &lt;groupId&gt;com.aliyun&lt;/groupId&gt;
     *     &lt;artifactId&gt;aliyun-java-sdk-schedulerx2&lt;/artifactId&gt;
     *     &lt;version&gt;1.0.4&lt;/version&gt;
     * &lt;/dependency&gt;
     * </code></pre>
     * 
     * @param request the request parameters of BatchDeleteJobs  BatchDeleteJobsRequest
     * @return BatchDeleteJobsResponse
     */
    CompletableFuture<BatchDeleteJobsResponse> batchDeleteJobs(BatchDeleteJobsRequest request);

    /**
     * @param request the request parameters of BatchDeleteRouteStrategy  BatchDeleteRouteStrategyRequest
     * @return BatchDeleteRouteStrategyResponse
     */
    CompletableFuture<BatchDeleteRouteStrategyResponse> batchDeleteRouteStrategy(BatchDeleteRouteStrategyRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, you must add the following dependency to the pom.xml file:</p>
     * <pre><code class="language-xml">&lt;dependency&gt;
     *     &lt;groupId&gt;com.aliyun&lt;/groupId&gt;
     *     &lt;artifactId&gt;aliyun-java-sdk-schedulerx2&lt;/artifactId&gt;
     *     &lt;version&gt;1.0.4&lt;/version&gt;
     * &lt;/dependency&gt;
     * </code></pre>
     * 
     * @param request the request parameters of BatchDisableJobs  BatchDisableJobsRequest
     * @return BatchDisableJobsResponse
     */
    CompletableFuture<BatchDisableJobsResponse> batchDisableJobs(BatchDisableJobsRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, you must add the following dependency to the pom.xml file:</p>
     * <pre><code class="language-xml">&lt;dependency&gt;
     *     &lt;groupId&gt;com.aliyun&lt;/groupId&gt;
     *     &lt;artifactId&gt;aliyun-java-sdk-schedulerx2&lt;/artifactId&gt;
     *     &lt;version&gt;1.0.4&lt;/version&gt;
     * &lt;/dependency&gt;
     * </code></pre>
     * 
     * @param request the request parameters of BatchEnableJobs  BatchEnableJobsRequest
     * @return BatchEnableJobsResponse
     */
    CompletableFuture<BatchEnableJobsResponse> batchEnableJobs(BatchEnableJobsRequest request);

    /**
     * @param request the request parameters of CreateAppGroup  CreateAppGroupRequest
     * @return CreateAppGroupResponse
     */
    CompletableFuture<CreateAppGroupResponse> createAppGroup(CreateAppGroupRequest request);

    /**
     * @param request the request parameters of CreateJob  CreateJobRequest
     * @return CreateJobResponse
     */
    CompletableFuture<CreateJobResponse> createJob(CreateJobRequest request);

    /**
     * @param request the request parameters of CreateNamespace  CreateNamespaceRequest
     * @return CreateNamespaceResponse
     */
    CompletableFuture<CreateNamespaceResponse> createNamespace(CreateNamespaceRequest request);

    /**
     * @param request the request parameters of CreateRouteStrategy  CreateRouteStrategyRequest
     * @return CreateRouteStrategyResponse
     */
    CompletableFuture<CreateRouteStrategyResponse> createRouteStrategy(CreateRouteStrategyRequest request);

    /**
     * @param request the request parameters of CreateWorkflow  CreateWorkflowRequest
     * @return CreateWorkflowResponse
     */
    CompletableFuture<CreateWorkflowResponse> createWorkflow(CreateWorkflowRequest request);

    /**
     * @param request the request parameters of DeleteAppGroup  DeleteAppGroupRequest
     * @return DeleteAppGroupResponse
     */
    CompletableFuture<DeleteAppGroupResponse> deleteAppGroup(DeleteAppGroupRequest request);

    /**
     * @param request the request parameters of DeleteJob  DeleteJobRequest
     * @return DeleteJobResponse
     */
    CompletableFuture<DeleteJobResponse> deleteJob(DeleteJobRequest request);

    /**
     * @param request the request parameters of DeleteRouteStrategy  DeleteRouteStrategyRequest
     * @return DeleteRouteStrategyResponse
     */
    CompletableFuture<DeleteRouteStrategyResponse> deleteRouteStrategy(DeleteRouteStrategyRequest request);

    /**
     * @param request the request parameters of DeleteWorkflow  DeleteWorkflowRequest
     * @return DeleteWorkflowResponse
     */
    CompletableFuture<DeleteWorkflowResponse> deleteWorkflow(DeleteWorkflowRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * @param request the request parameters of DesignateWorkers  DesignateWorkersRequest
     * @return DesignateWorkersResponse
     */
    CompletableFuture<DesignateWorkersResponse> designateWorkers(DesignateWorkersRequest request);

    /**
     * @param request the request parameters of DisableJob  DisableJobRequest
     * @return DisableJobResponse
     */
    CompletableFuture<DisableJobResponse> disableJob(DisableJobRequest request);

    /**
     * @param request the request parameters of DisableWorkflow  DisableWorkflowRequest
     * @return DisableWorkflowResponse
     */
    CompletableFuture<DisableWorkflowResponse> disableWorkflow(DisableWorkflowRequest request);

    /**
     * @param request the request parameters of EnableJob  EnableJobRequest
     * @return EnableJobResponse
     */
    CompletableFuture<EnableJobResponse> enableJob(EnableJobRequest request);

    /**
     * @param request the request parameters of EnableWorkflow  EnableWorkflowRequest
     * @return EnableWorkflowResponse
     */
    CompletableFuture<EnableWorkflowResponse> enableWorkflow(EnableWorkflowRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The combination of the <code>JobID</code> and <code>ScheduleTime</code> parameters serves as a unique index. Therefore, after the ExecuteJob operation is called to run a job once, a sleep for one second is required before the ExecuteJob operation is called to run the job again. Otherwise, the job may fail.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ExecuteJob  ExecuteJobRequest
     * @return ExecuteJobResponse
     */
    CompletableFuture<ExecuteJobResponse> executeJob(ExecuteJobRequest request);

    /**
     * @param request the request parameters of ExecuteWorkflow  ExecuteWorkflowRequest
     * @return ExecuteWorkflowResponse
     */
    CompletableFuture<ExecuteWorkflowResponse> executeWorkflow(ExecuteWorkflowRequest request);

    /**
     * @param request the request parameters of GetAppGroup  GetAppGroupRequest
     * @return GetAppGroupResponse
     */
    CompletableFuture<GetAppGroupResponse> getAppGroup(GetAppGroupRequest request);

    /**
     * @param request the request parameters of GetJobInfo  GetJobInfoRequest
     * @return GetJobInfoResponse
     */
    CompletableFuture<GetJobInfoResponse> getJobInfo(GetJobInfoRequest request);

    /**
     * @param request the request parameters of GetJobInstance  GetJobInstanceRequest
     * @return GetJobInstanceResponse
     */
    CompletableFuture<GetJobInstanceResponse> getJobInstance(GetJobInstanceRequest request);

    /**
     * @param request the request parameters of GetJobInstanceList  GetJobInstanceListRequest
     * @return GetJobInstanceListResponse
     */
    CompletableFuture<GetJobInstanceListResponse> getJobInstanceList(GetJobInstanceListRequest request);

    /**
     * @param request the request parameters of GetLog  GetLogRequest
     * @return GetLogResponse
     */
    CompletableFuture<GetLogResponse> getLog(GetLogRequest request);

    /**
     * @param request the request parameters of GetOverview  GetOverviewRequest
     * @return GetOverviewResponse
     */
    CompletableFuture<GetOverviewResponse> getOverview(GetOverviewRequest request);

    /**
     * @param request the request parameters of GetWorkFlow  GetWorkFlowRequest
     * @return GetWorkFlowResponse
     */
    CompletableFuture<GetWorkFlowResponse> getWorkFlow(GetWorkFlowRequest request);

    /**
     * @param request the request parameters of GetWorkerList  GetWorkerListRequest
     * @return GetWorkerListResponse
     */
    CompletableFuture<GetWorkerListResponse> getWorkerList(GetWorkerListRequest request);

    /**
     * @param request the request parameters of GetWorkflowInstance  GetWorkflowInstanceRequest
     * @return GetWorkflowInstanceResponse
     */
    CompletableFuture<GetWorkflowInstanceResponse> getWorkflowInstance(GetWorkflowInstanceRequest request);

    /**
     * @param request the request parameters of GrantPermission  GrantPermissionRequest
     * @return GrantPermissionResponse
     */
    CompletableFuture<GrantPermissionResponse> grantPermission(GrantPermissionRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, you must add the following dependency to the pom.xml file:</p>
     * <pre><code class="language-xml">&lt;dependency&gt;
     *     &lt;groupId&gt;com.aliyun&lt;/groupId&gt;
     *     &lt;artifactId&gt;aliyun-java-sdk-schedulerx2&lt;/artifactId&gt;
     *     &lt;version&gt;1.0.5&lt;/version&gt;
     * &lt;/dependency&gt;
     * </code></pre>
     * 
     * @param request the request parameters of ListGroups  ListGroupsRequest
     * @return ListGroupsResponse
     */
    CompletableFuture<ListGroupsResponse> listGroups(ListGroupsRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, you must add the following dependency to the pom.xml file:
     *     <dependency>
     *           <groupId>com.aliyun</groupId>
     *           <artifactId>aliyun-java-sdk-schedulerx2</artifactId>
     *           <version>1.0.5</version>
     *     </dependency></p>
     * 
     * @param request the request parameters of ListJobs  ListJobsRequest
     * @return ListJobsResponse
     */
    CompletableFuture<ListJobsResponse> listJobs(ListJobsRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, you must add the following dependency to the pom.xml file:
     *     <dependency>
     *         <groupId>com.aliyun</groupId>
     *         <artifactId>aliyun-java-sdk-schedulerx2</artifactId>
     *         <version>1.0.5</version>
     *     </dependency></p>
     * 
     * @param request the request parameters of ListNamespaces  ListNamespacesRequest
     * @return ListNamespacesResponse
     */
    CompletableFuture<ListNamespacesResponse> listNamespaces(ListNamespacesRequest request);

    /**
     * @param request the request parameters of ListWorkflowInstance  ListWorkflowInstanceRequest
     * @return ListWorkflowInstanceResponse
     */
    CompletableFuture<ListWorkflowInstanceResponse> listWorkflowInstance(ListWorkflowInstanceRequest request);

    /**
     * @param request the request parameters of RerunJob  RerunJobRequest
     * @return RerunJobResponse
     */
    CompletableFuture<RerunJobResponse> rerunJob(RerunJobRequest request);

    /**
     * @param request the request parameters of RetryJobInstance  RetryJobInstanceRequest
     * @return RetryJobInstanceResponse
     */
    CompletableFuture<RetryJobInstanceResponse> retryJobInstance(RetryJobInstanceRequest request);

    /**
     * @param request the request parameters of RevokePermission  RevokePermissionRequest
     * @return RevokePermissionResponse
     */
    CompletableFuture<RevokePermissionResponse> revokePermission(RevokePermissionRequest request);

    /**
     * @param request the request parameters of SetJobInstanceSuccess  SetJobInstanceSuccessRequest
     * @return SetJobInstanceSuccessResponse
     */
    CompletableFuture<SetJobInstanceSuccessResponse> setJobInstanceSuccess(SetJobInstanceSuccessRequest request);

    /**
     * @param request the request parameters of SetWfInstanceSuccess  SetWfInstanceSuccessRequest
     * @return SetWfInstanceSuccessResponse
     */
    CompletableFuture<SetWfInstanceSuccessResponse> setWfInstanceSuccess(SetWfInstanceSuccessRequest request);

    /**
     * @param request the request parameters of StopInstance  StopInstanceRequest
     * @return StopInstanceResponse
     */
    CompletableFuture<StopInstanceResponse> stopInstance(StopInstanceRequest request);

    /**
     * @param request the request parameters of UpdateAppGroup  UpdateAppGroupRequest
     * @return UpdateAppGroupResponse
     */
    CompletableFuture<UpdateAppGroupResponse> updateAppGroup(UpdateAppGroupRequest request);

    /**
     * @param request the request parameters of UpdateJob  UpdateJobRequest
     * @return UpdateJobResponse
     */
    CompletableFuture<UpdateJobResponse> updateJob(UpdateJobRequest request);

    /**
     * @param request the request parameters of UpdateWorkflow  UpdateWorkflowRequest
     * @return UpdateWorkflowResponse
     */
    CompletableFuture<UpdateWorkflowResponse> updateWorkflow(UpdateWorkflowRequest request);

    /**
     * @param request the request parameters of UpdateWorkflowDag  UpdateWorkflowDagRequest
     * @return UpdateWorkflowDagResponse
     */
    CompletableFuture<UpdateWorkflowDagResponse> updateWorkflowDag(UpdateWorkflowDagRequest request);

}
