// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.pai_dlc20201203.models.*;
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

    CompletableFuture<CreateJobResponse> createJob(CreateJobRequest request);

    CompletableFuture<CreateTensorboardResponse> createTensorboard(CreateTensorboardRequest request);

    CompletableFuture<DeleteJobResponse> deleteJob(DeleteJobRequest request);

    CompletableFuture<DeleteTensorboardResponse> deleteTensorboard(DeleteTensorboardRequest request);

    CompletableFuture<GetJobResponse> getJob(GetJobRequest request);

    CompletableFuture<GetJobEventsResponse> getJobEvents(GetJobEventsRequest request);

    CompletableFuture<GetJobMetricsResponse> getJobMetrics(GetJobMetricsRequest request);

    CompletableFuture<GetPodEventsResponse> getPodEvents(GetPodEventsRequest request);

    CompletableFuture<GetPodLogsResponse> getPodLogs(GetPodLogsRequest request);

    CompletableFuture<GetTensorboardResponse> getTensorboard(GetTensorboardRequest request);

    CompletableFuture<ListEcsSpecsResponse> listEcsSpecs(ListEcsSpecsRequest request);

    CompletableFuture<ListJobsResponse> listJobs(ListJobsRequest request);

    CompletableFuture<ListTensorboardsResponse> listTensorboards(ListTensorboardsRequest request);

    CompletableFuture<StartTensorboardResponse> startTensorboard(StartTensorboardRequest request);

    CompletableFuture<StopJobResponse> stopJob(StopJobRequest request);

    CompletableFuture<StopTensorboardResponse> stopTensorboard(StopTensorboardRequest request);

    CompletableFuture<UpdateJobResponse> updateJob(UpdateJobRequest request);

    CompletableFuture<UpdateTensorboardResponse> updateTensorboard(UpdateTensorboardRequest request);

}
