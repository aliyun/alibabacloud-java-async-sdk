// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpcinstant20230701;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ehpcinstant20230701.models.*;
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
     * @param request the request parameters of AddImage  AddImageRequest
     * @return AddImageResponse
     */
    CompletableFuture<AddImageResponse> addImage(AddImageRequest request);

    /**
     * @param request the request parameters of CreateJob  CreateJobRequest
     * @return CreateJobResponse
     */
    CompletableFuture<CreateJobResponse> createJob(CreateJobRequest request);

    /**
     * @param request the request parameters of DeleteJobs  DeleteJobsRequest
     * @return DeleteJobsResponse
     */
    CompletableFuture<DeleteJobsResponse> deleteJobs(DeleteJobsRequest request);

    /**
     * @param request the request parameters of DescribeJobMetricData  DescribeJobMetricDataRequest
     * @return DescribeJobMetricDataResponse
     */
    CompletableFuture<DescribeJobMetricDataResponse> describeJobMetricData(DescribeJobMetricDataRequest request);

    /**
     * @param request the request parameters of DescribeJobMetricLast  DescribeJobMetricLastRequest
     * @return DescribeJobMetricLastResponse
     */
    CompletableFuture<DescribeJobMetricLastResponse> describeJobMetricLast(DescribeJobMetricLastRequest request);

    /**
     * @param request the request parameters of GetAppVersions  GetAppVersionsRequest
     * @return GetAppVersionsResponse
     */
    CompletableFuture<GetAppVersionsResponse> getAppVersions(GetAppVersionsRequest request);

    /**
     * @param request the request parameters of GetImage  GetImageRequest
     * @return GetImageResponse
     */
    CompletableFuture<GetImageResponse> getImage(GetImageRequest request);

    /**
     * @param request the request parameters of GetJob  GetJobRequest
     * @return GetJobResponse
     */
    CompletableFuture<GetJobResponse> getJob(GetJobRequest request);

    /**
     * @param request the request parameters of ListExecutors  ListExecutorsRequest
     * @return ListExecutorsResponse
     */
    CompletableFuture<ListExecutorsResponse> listExecutors(ListExecutorsRequest request);

    /**
     * @param request the request parameters of ListImages  ListImagesRequest
     * @return ListImagesResponse
     */
    CompletableFuture<ListImagesResponse> listImages(ListImagesRequest request);

    /**
     * @param request the request parameters of ListJobExecutors  ListJobExecutorsRequest
     * @return ListJobExecutorsResponse
     */
    CompletableFuture<ListJobExecutorsResponse> listJobExecutors(ListJobExecutorsRequest request);

    /**
     * @param request the request parameters of ListJobs  ListJobsRequest
     * @return ListJobsResponse
     */
    CompletableFuture<ListJobsResponse> listJobs(ListJobsRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of RemoveImage  RemoveImageRequest
     * @return RemoveImageResponse
     */
    CompletableFuture<RemoveImageResponse> removeImage(RemoveImageRequest request);

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @param request the request parameters of UnTagResources  UnTagResourcesRequest
     * @return UnTagResourcesResponse
     */
    CompletableFuture<UnTagResourcesResponse> unTagResources(UnTagResourcesRequest request);

}
