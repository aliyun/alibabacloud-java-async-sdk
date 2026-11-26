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
     * <p>Make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/171758.html">pricing</a> of PAI-DLC before you call this operation.</p>
     * <blockquote>
     * <p>Notice: The total length of the parameters for the CreateJob operation, including system-generated parameters, cannot exceed 65,536 bytes.</p>
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
     * <p>Make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/171758.html">pricing</a> of PAI-DLC before you call this operation. &gt;Notice: The total length of the parameters in the CreateJob operation, including system-generated parameters, cannot exceed 65,536 bytes.</p>
     * 
     * @param request the request parameters of CreateRayHistoryServer  CreateRayHistoryServerRequest
     * @return CreateRayHistoryServerResponse
     */
    CompletableFuture<CreateRayHistoryServerResponse> createRayHistoryServer(CreateRayHistoryServerRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API operation sends a specific signal to one or more pods of a specified job.</li>
     * <li>After the signal is sent, the API operation immediately returns a <code>SignalId</code>. The actual signal delivery is handled by background workers.</li>
     * <li>You can query the status of the signal by calling the <code>GetSignal</code> or <code>ListSignals</code> API operation.</li>
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
     * <p>Before you call this operation, make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/171758.html">pricing</a> of PAI-DLC.</p>
     * <blockquote>
     * <p>Notice: The total length of the parameters in the CreateJob operation, including system-generated parameters, cannot exceed 65,536 bytes.</p>
     * </blockquote>
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
     * <p>Before you call this API operation, make sure that you fully understand the billing method and <a href="https://help.aliyun.com/document_detail/171758.html">pricing</a> of PAI-DLC.</p>
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
     * <li>This operation queries the monitoring metrics for a specific job (JobId) or dimension (Dimensions) under a specified namespace.</li>
     * <li>Supports a custom query time range. The default is the data from the last hour.</li>
     * <li>You can select different time intervals (Period) to obtain data points with finer or coarser granularity.</li>
     * <li>If you need to retrieve a large amount of data through paging, you can use the <code>NextToken</code> parameter for paging.</li>
     * <li><code>MetricName</code> is required and specifies the name of the specific monitoring metrics to query.</li>
     * <li>For advanced features or specific types of monitoring metrics, refer to the relevant documentation for more information.</li>
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
     * <p>获取DLC作业RL轨迹流转分析</p>
     * 
     * @param request the request parameters of GetRLFlowAnalysis  GetRLFlowAnalysisRequest
     * @return GetRLFlowAnalysisResponse
     */
    CompletableFuture<GetRLFlowAnalysisResponse> getRLFlowAnalysis(GetRLFlowAnalysisRequest request);

    /**
     * <b>description</b> :
     * <p>获取DLC作业某条异常日志的上下文</p>
     * 
     * @param request the request parameters of GetRLLogContext  GetRLLogContextRequest
     * @return GetRLLogContextResponse
     */
    CompletableFuture<GetRLLogContextResponse> getRLLogContext(GetRLLogContextRequest request);

    /**
     * <b>description</b> :
     * <p>Queries a single reinforcement learning (RL) trajectory and sample-level events for the same sample based on JobId, PromptUid, and SampleIndex, and returns an event stream sorted by event time and collection time.</p>
     * 
     * @param request the request parameters of GetRLSample  GetRLSampleRequest
     * @return GetRLSampleResponse
     */
    CompletableFuture<GetRLSampleResponse> getRLSample(GetRLSampleRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the RL training progress of a DLC job.</p>
     * 
     * @param request the request parameters of GetRLTrainingProgress  GetRLTrainingProgressRequest
     * @return GetRLTrainingProgressResponse
     */
    CompletableFuture<GetRLTrainingProgressResponse> getRLTrainingProgress(GetRLTrainingProgressRequest request);

    /**
     * <b>description</b> :
     * <p>Make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/171758.html">pricing</a> of PAI-DLC before you call this operation.</p>
     * 
     * @param request the request parameters of GetRayDashboard  GetRayDashboardRequest
     * @return GetRayDashboardResponse
     */
    CompletableFuture<GetRayDashboardResponse> getRayDashboard(GetRayDashboardRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/171758.html">pricing</a> of PAI-DLC.&gt;Notice: The total length of parameters for the CreateJob operation, including system-generated parameters, cannot exceed 65,536 bytes.</p>
     * 
     * @param request the request parameters of GetRayHistoryServer  GetRayHistoryServerRequest
     * @return GetRayHistoryServerResponse
     */
    CompletableFuture<GetRayHistoryServerResponse> getRayHistoryServer(GetRayHistoryServerRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API allows you to retrieve the details of a signal corresponding to a specified <code>JobId</code> and <code>SignalId</code>, including the signal status and delivery scope. Note that the returned results no longer include the raw result structure for each Pod. Instead, the overall signal processing status is expressed through the <code>Status</code>, <code>Reason</code>, and <code>Message</code> fields.</p>
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
     * <p>分页获取DLC作业的RL轨迹样本列表</p>
     * 
     * @param request the request parameters of ListRLSamples  ListRLSamplesRequest
     * @return ListRLSamplesResponse
     */
    CompletableFuture<ListRLSamplesResponse> listRLSamples(ListRLSamplesRequest request);

    /**
     * <b>description</b> :
     * <p>分页获取DLC作业某个uid下的RL轨迹列表</p>
     * 
     * @param request the request parameters of ListRLTrajectories  ListRLTrajectoriesRequest
     * @return ListRLTrajectoriesResponse
     */
    CompletableFuture<ListRLTrajectoriesResponse> listRLTrajectories(ListRLTrajectoriesRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/171758.html">pricing</a> of PAI-DLC.&gt;Notice: The total length of parameters for the CreateJob operation, including system-generated parameters, cannot exceed 65,536 bytes.</p>
     * 
     * @param request the request parameters of ListRayHistoryServers  ListRayHistoryServersRequest
     * @return ListRayHistoryServersResponse
     */
    CompletableFuture<ListRayHistoryServersResponse> listRayHistoryServers(ListRayHistoryServersRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>You can use this API to retrieve the details of all signal records for a specific job, including the signal ID, status, and creation time. You can further filter or sort the results by using query parameters.</p>
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
     * <p>Make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/171758.html">pricing</a> of PAI-DLC before you call this operation.</p>
     * <blockquote>
     * <p>Notice: The total length of the request parameters for the CreateJob operation, including system-generated parameters, cannot exceed 65,536 bytes.</p>
     * </blockquote>
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
     * <p>Before you call this operation, make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/171758.html">pricing</a> of PAI-DLC.</p>
     * <blockquote>
     * <p>Notice: The total length of the parameters in the CreateJob operation, including system-generated parameters, cannot exceed 65,536 bytes.</p>
     * </blockquote>
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
     * <p>Before attaching tags, Alibaba Cloud checks the number of existing tags on the resources. If the limit is exceeded, an error message is returned.</p>
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
