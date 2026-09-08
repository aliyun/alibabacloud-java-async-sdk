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
     * <p>Before using this operation, make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/171758.html">pricing</a> of PAI-DLC.</p>
     * <blockquote>
     * <p>Notice: The total length of CreateJob operation parameters (including system-generated parameters) cannot exceed 65,536 bytes.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateJob  CreateJobRequest
     * @return CreateJobResponse
     */
    CompletableFuture<CreateJobResponse> createJob(CreateJobRequest request);

    /**
     * @param request the request parameters of CreateJobTemplate  CreateJobTemplateRequest
     * @return CreateJobTemplateResponse
     */
    CompletableFuture<CreateJobTemplateResponse> createJobTemplate(CreateJobTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>Before you use this operation, make sure that you are familiar with the billing of PAI-DLC and the <a href="https://help.aliyun.com/document_detail/171758.html">pricing</a>.</p>
     * <blockquote>
     * <p>Notice: The total length of CreateJob request parameters, including system-generated parameters, cannot exceed 65,536 bytes..</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateRayHistoryServer  CreateRayHistoryServerRequest
     * @return CreateRayHistoryServerResponse
     */
    CompletableFuture<CreateRayHistoryServerResponse> createRayHistoryServer(CreateRayHistoryServerRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API operation sends a specific signal to one or more Pods of a specified job.</li>
     * <li>After the signal is sent, the API immediately returns a <code>SignalId</code>. The actual signal delivery is processed by a background worker.</li>
     * <li>Query the signal status by calling the <code>GetSignal</code> or <code>ListSignals</code> operation.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateSignal  CreateSignalRequest
     * @return CreateSignalResponse
     */
    CompletableFuture<CreateSignalResponse> createSignal(CreateSignalRequest request);

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
     * @param request the request parameters of DeleteJobTemplate  DeleteJobTemplateRequest
     * @return DeleteJobTemplateResponse
     */
    CompletableFuture<DeleteJobTemplateResponse> deleteJobTemplate(DeleteJobTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this API, ensure you understand the billing methods and <a href="https://help.aliyun.com/document_detail/171758.html">Pricing</a> of PAI-DLC.</p>
     * 
     * @param request the request parameters of DeleteRayHistoryServer  DeleteRayHistoryServerRequest
     * @return DeleteRayHistoryServerResponse
     */
    CompletableFuture<DeleteRayHistoryServerResponse> deleteRayHistoryServer(DeleteRayHistoryServerRequest request);

    /**
     * @param request the request parameters of DeleteTensorboard  DeleteTensorboardRequest
     * @return DeleteTensorboardResponse
     */
    CompletableFuture<DeleteTensorboardResponse> deleteTensorboard(DeleteTensorboardRequest request);

    /**
     * <b>description</b> :
     * <p>Before using this API, review the billing methods and <a href="https://help.aliyun.com/document_detail/171758.html">pricing</a> for PAI-DLC.</p>
     * 
     * @param request the request parameters of GetDashboard  GetDashboardRequest
     * @return GetDashboardResponse
     */
    CompletableFuture<GetDashboardResponse> getDashboard(GetDashboardRequest request);

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
     * @param request the request parameters of GetJobTemplate  GetJobTemplateRequest
     * @return GetJobTemplateResponse
     */
    CompletableFuture<GetJobTemplateResponse> getJobTemplate(GetJobTemplateRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API retrieves monitoring metrics for a specific job (JobId) or dimensions under a given namespace.</li>
     * <li>It supports custom time ranges. By default, it returns data from the last hour.</li>
     * <li>Select different time intervals (Period) to obtain data points with finer or coarser granularity.</li>
     * <li>To paginate through large datasets, use the <code>NextToken</code> parameter.</li>
     * <li>The <code>MetricName</code> parameter is required and specifies the monitoring metric to query.</li>
     * <li>For advanced features or specific metric types, see the related documentation.</li>
     * </ul>
     * 
     * @param request the request parameters of GetMetrics  GetMetricsRequest
     * @return GetMetricsResponse
     */
    CompletableFuture<GetMetricsResponse> getMetrics(GetMetricsRequest request);

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
     * <p>Before you use this operation, review the PAI-DLC billing model and <a href="https://help.aliyun.com/document_detail/171758.html">pricing</a>.</p>
     * 
     * @param request the request parameters of GetRayDashboard  GetRayDashboardRequest
     * @return GetRayDashboardResponse
     */
    CompletableFuture<GetRayDashboardResponse> getRayDashboard(GetRayDashboardRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this API operation, make sure that you understand the billing methods and <a href="https://help.aliyun.com/document_detail/171758.html">pricing</a> of PAI-DLC.&gt;Notice: The total length of the parameters for the CreateJob API, including system-generated parameters, cannot exceed 65,536 bytes.</p>
     * 
     * @param request the request parameters of GetRayHistoryServer  GetRayHistoryServerRequest
     * @return GetRayHistoryServerResponse
     */
    CompletableFuture<GetRayHistoryServerResponse> getRayHistoryServer(GetRayHistoryServerRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This API allows you to retrieve the signal details for the specified <code>JobId</code> and <code>SignalId</code>, including the signal status and delivery scope. Note that the response no longer contains the raw result structure for each pod. Instead, the <code>Status</code>, <code>Reason</code>, and <code>Message</code> fields describe the overall signal processing status.</p>
     * 
     * @param request the request parameters of GetSignal  GetSignalRequest
     * @return GetSignalResponse
     */
    CompletableFuture<GetSignalResponse> getSignal(GetSignalRequest request);

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
     * @param request the request parameters of ListJobTemplates  ListJobTemplatesRequest
     * @return ListJobTemplatesResponse
     */
    CompletableFuture<ListJobTemplatesResponse> listJobTemplates(ListJobTemplatesRequest request);

    /**
     * @param request the request parameters of ListJobs  ListJobsRequest
     * @return ListJobsResponse
     */
    CompletableFuture<ListJobsResponse> listJobs(ListJobsRequest request);

    /**
     * <b>description</b> :
     * <p>Before you use this operation, make sure that you are familiar with the billing and <a href="https://help.aliyun.com/document_detail/171758.html">pricing</a> of Platform for AI - Deep Learning Containers (PAI-DLC).</p>
     * <blockquote>
     * <p>Notice: The total length of the CreateJob operation parameters, including system-generated parameters, cannot exceed 65,536 bytes..</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListRayHistoryServers  ListRayHistoryServersRequest
     * @return ListRayHistoryServersResponse
     */
    CompletableFuture<ListRayHistoryServersResponse> listRayHistoryServers(ListRayHistoryServersRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>You can call this API operation to retrieve the details of all signal records for a specific job, including signal IDs, statuses, and creation times. You can use query parameters to further filter or sort the results.</p>
     * 
     * @param request the request parameters of ListSignals  ListSignalsRequest
     * @return ListSignalsResponse
     */
    CompletableFuture<ListSignalsResponse> listSignals(ListSignalsRequest request);

    /**
     * @param request the request parameters of ListTensorboards  ListTensorboardsRequest
     * @return ListTensorboardsResponse
     */
    CompletableFuture<ListTensorboardsResponse> listTensorboards(ListTensorboardsRequest request);

    /**
     * @param request the request parameters of SetJobTemplateDefaultVersion  SetJobTemplateDefaultVersionRequest
     * @return SetJobTemplateDefaultVersionResponse
     */
    CompletableFuture<SetJobTemplateDefaultVersionResponse> setJobTemplateDefaultVersion(SetJobTemplateDefaultVersionRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, familiarize yourself with the billing methods and <a href="https://help.aliyun.com/document_detail/171758.html">pricing</a> of PAI-DLC.&gt;Notice: The total length of the API parameters for the CreateJob operation, including system-generated parameters, cannot exceed 65,536 bytes.</p>
     * 
     * @param request the request parameters of StartRayHistoryServer  StartRayHistoryServerRequest
     * @return StartRayHistoryServerResponse
     */
    CompletableFuture<StartRayHistoryServerResponse> startRayHistoryServer(StartRayHistoryServerRequest request);

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
     * <b>description</b> :
     * <p>Before calling this operation, ensure you understand the billing methods and <a href="https://help.aliyun.com/document_detail/171758.html">pricing</a> for PAI-DLC.&gt;Notice: The total length of the parameters for the CreateJob interface, including system-generated parameters, cannot exceed 65,536 bytes.</p>
     * 
     * @param request the request parameters of StopRayHistoryServer  StopRayHistoryServerRequest
     * @return StopRayHistoryServerResponse
     */
    CompletableFuture<StopRayHistoryServerResponse> stopRayHistoryServer(StopRayHistoryServerRequest request);

    /**
     * @param request the request parameters of StopTensorboard  StopTensorboardRequest
     * @return StopTensorboardResponse
     */
    CompletableFuture<StopTensorboardResponse> stopTensorboard(StopTensorboardRequest request);

    /**
     * <b>description</b> :
     * <p>Before attaching tags, Alibaba Cloud checks the number of existing tags on the resource. If the limit is exceeded, an error message is returned.</p>
     * 
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * @param request the request parameters of UpdateJob  UpdateJobRequest
     * @return UpdateJobResponse
     */
    CompletableFuture<UpdateJobResponse> updateJob(UpdateJobRequest request);

    /**
     * @param request the request parameters of UpdateJobTemplate  UpdateJobTemplateRequest
     * @return UpdateJobTemplateResponse
     */
    CompletableFuture<UpdateJobTemplateResponse> updateJobTemplate(UpdateJobTemplateRequest request);

    /**
     * @param request the request parameters of UpdateTensorboard  UpdateTensorboardRequest
     * @return UpdateTensorboardResponse
     */
    CompletableFuture<UpdateTensorboardResponse> updateTensorboard(UpdateTensorboardRequest request);

}
