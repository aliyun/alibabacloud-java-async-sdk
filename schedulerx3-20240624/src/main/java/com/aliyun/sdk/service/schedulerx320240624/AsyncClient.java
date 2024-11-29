// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx320240624;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.schedulerx320240624.models.*;
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
     * @param request the request parameters of CreateApp  CreateAppRequest
     * @return CreateAppResponse
     */
    CompletableFuture<CreateAppResponse> createApp(CreateAppRequest request);

    /**
     * @param request the request parameters of CreateCluster  CreateClusterRequest
     * @return CreateClusterResponse
     */
    CompletableFuture<CreateClusterResponse> createCluster(CreateClusterRequest request);

    /**
     * @param request the request parameters of CreateJob  CreateJobRequest
     * @return CreateJobResponse
     */
    CompletableFuture<CreateJobResponse> createJob(CreateJobRequest request);

    /**
     * @param request the request parameters of DeleteApp  DeleteAppRequest
     * @return DeleteAppResponse
     */
    CompletableFuture<DeleteAppResponse> deleteApp(DeleteAppRequest request);

    /**
     * @param request the request parameters of DeleteCluster  DeleteClusterRequest
     * @return DeleteClusterResponse
     */
    CompletableFuture<DeleteClusterResponse> deleteCluster(DeleteClusterRequest request);

    /**
     * @param request the request parameters of DeleteJobs  DeleteJobsRequest
     * @return DeleteJobsResponse
     */
    CompletableFuture<DeleteJobsResponse> deleteJobs(DeleteJobsRequest request);

    /**
     * @param request the request parameters of ExportJobs  ExportJobsRequest
     * @return ExportJobsResponse
     */
    CompletableFuture<ExportJobsResponse> exportJobs(ExportJobsRequest request);

    /**
     * @param request the request parameters of GetCluster  GetClusterRequest
     * @return GetClusterResponse
     */
    CompletableFuture<GetClusterResponse> getCluster(GetClusterRequest request);

    /**
     * @param request the request parameters of GetDesigateInfo  GetDesigateInfoRequest
     * @return GetDesigateInfoResponse
     */
    CompletableFuture<GetDesigateInfoResponse> getDesigateInfo(GetDesigateInfoRequest request);

    /**
     * @param request the request parameters of GetJobExecutionProgress  GetJobExecutionProgressRequest
     * @return GetJobExecutionProgressResponse
     */
    CompletableFuture<GetJobExecutionProgressResponse> getJobExecutionProgress(GetJobExecutionProgressRequest request);

    /**
     * @param request the request parameters of GetLog  GetLogRequest
     * @return GetLogResponse
     */
    CompletableFuture<GetLogResponse> getLog(GetLogRequest request);

    /**
     * @param request the request parameters of ImportCalendar  ImportCalendarRequest
     * @return ImportCalendarResponse
     */
    CompletableFuture<ImportCalendarResponse> importCalendar(ImportCalendarRequest request);

    /**
     * @param request the request parameters of ImportJobs  ImportJobsRequest
     * @return ImportJobsResponse
     */
    CompletableFuture<ImportJobsResponse> importJobs(ImportJobsRequest request);

    /**
     * @param request the request parameters of ListAlarmEvent  ListAlarmEventRequest
     * @return ListAlarmEventResponse
     */
    CompletableFuture<ListAlarmEventResponse> listAlarmEvent(ListAlarmEventRequest request);

    /**
     * @param request the request parameters of ListAppNames  ListAppNamesRequest
     * @return ListAppNamesResponse
     */
    CompletableFuture<ListAppNamesResponse> listAppNames(ListAppNamesRequest request);

    /**
     * @param request the request parameters of ListApps  ListAppsRequest
     * @return ListAppsResponse
     */
    CompletableFuture<ListAppsResponse> listApps(ListAppsRequest request);

    /**
     * @param request the request parameters of ListCalendarNames  ListCalendarNamesRequest
     * @return ListCalendarNamesResponse
     */
    CompletableFuture<ListCalendarNamesResponse> listCalendarNames(ListCalendarNamesRequest request);

    /**
     * @param request the request parameters of ListClusters  ListClustersRequest
     * @return ListClustersResponse
     */
    CompletableFuture<ListClustersResponse> listClusters(ListClustersRequest request);

    /**
     * @param request the request parameters of ListExecutors  ListExecutorsRequest
     * @return ListExecutorsResponse
     */
    CompletableFuture<ListExecutorsResponse> listExecutors(ListExecutorsRequest request);

    /**
     * @param request the request parameters of ListJobExecutions  ListJobExecutionsRequest
     * @return ListJobExecutionsResponse
     */
    CompletableFuture<ListJobExecutionsResponse> listJobExecutions(ListJobExecutionsRequest request);

    /**
     * @param request the request parameters of ListJobs  ListJobsRequest
     * @return ListJobsResponse
     */
    CompletableFuture<ListJobsResponse> listJobs(ListJobsRequest request);

    /**
     * @param request the request parameters of ListLables  ListLablesRequest
     * @return ListLablesResponse
     */
    CompletableFuture<ListLablesResponse> listLables(ListLablesRequest request);

    /**
     * @param request the request parameters of ListRegionZone  ListRegionZoneRequest
     * @return ListRegionZoneResponse
     */
    CompletableFuture<ListRegionZoneResponse> listRegionZone(ListRegionZoneRequest request);

    /**
     * @param request the request parameters of ListRegions  ListRegionsRequest
     * @return ListRegionsResponse
     */
    CompletableFuture<ListRegionsResponse> listRegions(ListRegionsRequest request);

    /**
     * @param request the request parameters of ListScheduleEvent  ListScheduleEventRequest
     * @return ListScheduleEventResponse
     */
    CompletableFuture<ListScheduleEventResponse> listScheduleEvent(ListScheduleEventRequest request);

    /**
     * @param request the request parameters of ListScheduleTimes  ListScheduleTimesRequest
     * @return ListScheduleTimesResponse
     */
    CompletableFuture<ListScheduleTimesResponse> listScheduleTimes(ListScheduleTimesRequest request);

    /**
     * @param request the request parameters of OperateDesignateExecutors  OperateDesignateExecutorsRequest
     * @return OperateDesignateExecutorsResponse
     */
    CompletableFuture<OperateDesignateExecutorsResponse> operateDesignateExecutors(OperateDesignateExecutorsRequest request);

    /**
     * @param request the request parameters of OperateDisableJobs  OperateDisableJobsRequest
     * @return OperateDisableJobsResponse
     */
    CompletableFuture<OperateDisableJobsResponse> operateDisableJobs(OperateDisableJobsRequest request);

    /**
     * @param request the request parameters of OperateEnableJobs  OperateEnableJobsRequest
     * @return OperateEnableJobsResponse
     */
    CompletableFuture<OperateEnableJobsResponse> operateEnableJobs(OperateEnableJobsRequest request);

    /**
     * @param request the request parameters of OperateExecuteJob  OperateExecuteJobRequest
     * @return OperateExecuteJobResponse
     */
    CompletableFuture<OperateExecuteJobResponse> operateExecuteJob(OperateExecuteJobRequest request);

    /**
     * @param request the request parameters of OperateRerunJob  OperateRerunJobRequest
     * @return OperateRerunJobResponse
     */
    CompletableFuture<OperateRerunJobResponse> operateRerunJob(OperateRerunJobRequest request);

    /**
     * @param request the request parameters of OperateRetryJobExecution  OperateRetryJobExecutionRequest
     * @return OperateRetryJobExecutionResponse
     */
    CompletableFuture<OperateRetryJobExecutionResponse> operateRetryJobExecution(OperateRetryJobExecutionRequest request);

    /**
     * @param request the request parameters of OperateStopJobExecution  OperateStopJobExecutionRequest
     * @return OperateStopJobExecutionResponse
     */
    CompletableFuture<OperateStopJobExecutionResponse> operateStopJobExecution(OperateStopJobExecutionRequest request);

    /**
     * @param request the request parameters of UpdateApp  UpdateAppRequest
     * @return UpdateAppResponse
     */
    CompletableFuture<UpdateAppResponse> updateApp(UpdateAppRequest request);

    /**
     * @param request the request parameters of UpdateCluster  UpdateClusterRequest
     * @return UpdateClusterResponse
     */
    CompletableFuture<UpdateClusterResponse> updateCluster(UpdateClusterRequest request);

    /**
     * @param request the request parameters of UpdateJob  UpdateJobRequest
     * @return UpdateJobResponse
     */
    CompletableFuture<UpdateJobResponse> updateJob(UpdateJobRequest request);

}
