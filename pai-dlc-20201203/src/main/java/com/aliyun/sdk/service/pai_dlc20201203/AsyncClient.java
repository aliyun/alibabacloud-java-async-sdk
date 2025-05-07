// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.pai_dlc20201203.models.*;
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
     * <p>Before you call this operation, make sure that you understand the billing methods and <a href="https://help.aliyun.com/document_detail/171758.html">pricing</a> of Deep Learning Containers (DLC) of Platform for AI (PAI).</p>
     * 
     * @param request the request parameters of CreateJob  CreateJobRequest
     * @return CreateJobResponse
     */
    CompletableFuture<CreateJobResponse> createJob(CreateJobRequest request);

    /**
     * @param request the request parameters of CreateTensorboard  CreateTensorboardRequest
     * @return CreateTensorboardResponse
     */
    CompletableFuture<CreateTensorboardResponse> createTensorboard(CreateTensorboardRequest request);

    /**
     * @param request the request parameters of DeleteJob  DeleteJobRequest
     * @return DeleteJobResponse
     */
    CompletableFuture<DeleteJobResponse> deleteJob(DeleteJobRequest request);

    /**
     * @param request the request parameters of DeleteTensorboard  DeleteTensorboardRequest
     * @return DeleteTensorboardResponse
     */
    CompletableFuture<DeleteTensorboardResponse> deleteTensorboard(DeleteTensorboardRequest request);

    /**
     * @param request the request parameters of GetJob  GetJobRequest
     * @return GetJobResponse
     */
    CompletableFuture<GetJobResponse> getJob(GetJobRequest request);

    /**
     * @param request the request parameters of GetJobEvents  GetJobEventsRequest
     * @return GetJobEventsResponse
     */
    CompletableFuture<GetJobEventsResponse> getJobEvents(GetJobEventsRequest request);

    /**
     * @param request the request parameters of GetJobMetrics  GetJobMetricsRequest
     * @return GetJobMetricsResponse
     */
    CompletableFuture<GetJobMetricsResponse> getJobMetrics(GetJobMetricsRequest request);

    /**
     * @param request the request parameters of GetJobSanityCheckResult  GetJobSanityCheckResultRequest
     * @return GetJobSanityCheckResultResponse
     */
    CompletableFuture<GetJobSanityCheckResultResponse> getJobSanityCheckResult(GetJobSanityCheckResultRequest request);

    /**
     * @param request the request parameters of GetPodEvents  GetPodEventsRequest
     * @return GetPodEventsResponse
     */
    CompletableFuture<GetPodEventsResponse> getPodEvents(GetPodEventsRequest request);

    /**
     * @param request the request parameters of GetPodLogs  GetPodLogsRequest
     * @return GetPodLogsResponse
     */
    CompletableFuture<GetPodLogsResponse> getPodLogs(GetPodLogsRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and <a href="https://help.aliyun.com/document_detail/171758.html">pricing</a> of Deep Learning Containers (DLC) of Platform for AI (PAI).</p>
     * 
     * @param request the request parameters of GetRayDashboard  GetRayDashboardRequest
     * @return GetRayDashboardResponse
     */
    CompletableFuture<GetRayDashboardResponse> getRayDashboard(GetRayDashboardRequest request);

    /**
     * @param request the request parameters of GetTensorboard  GetTensorboardRequest
     * @return GetTensorboardResponse
     */
    CompletableFuture<GetTensorboardResponse> getTensorboard(GetTensorboardRequest request);

    /**
     * @param request the request parameters of GetTensorboardSharedUrl  GetTensorboardSharedUrlRequest
     * @return GetTensorboardSharedUrlResponse
     */
    CompletableFuture<GetTensorboardSharedUrlResponse> getTensorboardSharedUrl(GetTensorboardSharedUrlRequest request);

    /**
     * @param request the request parameters of GetToken  GetTokenRequest
     * @return GetTokenResponse
     */
    CompletableFuture<GetTokenResponse> getToken(GetTokenRequest request);

    /**
     * @param request the request parameters of GetWebTerminal  GetWebTerminalRequest
     * @return GetWebTerminalResponse
     */
    CompletableFuture<GetWebTerminalResponse> getWebTerminal(GetWebTerminalRequest request);

    /**
     * @param request the request parameters of ListEcsSpecs  ListEcsSpecsRequest
     * @return ListEcsSpecsResponse
     */
    CompletableFuture<ListEcsSpecsResponse> listEcsSpecs(ListEcsSpecsRequest request);

    /**
     * @param request the request parameters of ListJobSanityCheckResults  ListJobSanityCheckResultsRequest
     * @return ListJobSanityCheckResultsResponse
     */
    CompletableFuture<ListJobSanityCheckResultsResponse> listJobSanityCheckResults(ListJobSanityCheckResultsRequest request);

    /**
     * @param request the request parameters of ListJobs  ListJobsRequest
     * @return ListJobsResponse
     */
    CompletableFuture<ListJobsResponse> listJobs(ListJobsRequest request);

    /**
     * @param request the request parameters of ListTensorboards  ListTensorboardsRequest
     * @return ListTensorboardsResponse
     */
    CompletableFuture<ListTensorboardsResponse> listTensorboards(ListTensorboardsRequest request);

    /**
     * @param request the request parameters of StartTensorboard  StartTensorboardRequest
     * @return StartTensorboardResponse
     */
    CompletableFuture<StartTensorboardResponse> startTensorboard(StartTensorboardRequest request);

    /**
     * @param request the request parameters of StopJob  StopJobRequest
     * @return StopJobResponse
     */
    CompletableFuture<StopJobResponse> stopJob(StopJobRequest request);

    /**
     * @param request the request parameters of StopTensorboard  StopTensorboardRequest
     * @return StopTensorboardResponse
     */
    CompletableFuture<StopTensorboardResponse> stopTensorboard(StopTensorboardRequest request);

    /**
     * @param request the request parameters of UpdateJob  UpdateJobRequest
     * @return UpdateJobResponse
     */
    CompletableFuture<UpdateJobResponse> updateJob(UpdateJobRequest request);

    /**
     * @param request the request parameters of UpdateTensorboard  UpdateTensorboardRequest
     * @return UpdateTensorboardResponse
     */
    CompletableFuture<UpdateTensorboardResponse> updateTensorboard(UpdateTensorboardRequest request);

}
