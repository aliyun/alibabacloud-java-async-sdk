// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20230701;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ehpc20230701.models.*;
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

    CompletableFuture<AddImageResponse> addImage(AddImageRequest request);

    CompletableFuture<CreateJobResponse> createJob(CreateJobRequest request);

    CompletableFuture<DeleteJobsResponse> deleteJobs(DeleteJobsRequest request);

    CompletableFuture<DescribeJobMetricDataResponse> describeJobMetricData(DescribeJobMetricDataRequest request);

    CompletableFuture<DescribeJobMetricLastResponse> describeJobMetricLast(DescribeJobMetricLastRequest request);

    CompletableFuture<GetImageResponse> getImage(GetImageRequest request);

    CompletableFuture<GetJobResponse> getJob(GetJobRequest request);

    CompletableFuture<ListExecutorsResponse> listExecutors(ListExecutorsRequest request);

    CompletableFuture<ListImagesResponse> listImages(ListImagesRequest request);

    CompletableFuture<ListJobExecutorsResponse> listJobExecutors(ListJobExecutorsRequest request);

    CompletableFuture<ListJobsResponse> listJobs(ListJobsRequest request);

    CompletableFuture<RemoveImageResponse> removeImage(RemoveImageRequest request);

}
