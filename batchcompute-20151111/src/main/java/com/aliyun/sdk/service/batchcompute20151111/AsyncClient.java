// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.batchcompute20151111;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.batchcompute20151111.models.*;
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

    CompletableFuture<CancelImageResponse> cancelImage(CancelImageRequest request);

    CompletableFuture<ChangeJobPriorityResponse> changeJobPriority(ChangeJobPriorityRequest request);

    CompletableFuture<CreateAppResponse> createApp(CreateAppRequest request);

    CompletableFuture<CreateClusterResponse> createCluster(CreateClusterRequest request);

    CompletableFuture<CreateImageResponse> createImage(CreateImageRequest request);

    CompletableFuture<CreateJobResponse> createJob(CreateJobRequest request);

    CompletableFuture<DeleteAppResponse> deleteApp(DeleteAppRequest request);

    CompletableFuture<DeleteClusterResponse> deleteCluster(DeleteClusterRequest request);

    CompletableFuture<DeleteClusterInstanceResponse> deleteClusterInstance(DeleteClusterInstanceRequest request);

    CompletableFuture<DeleteImageResponse> deleteImage(DeleteImageRequest request);

    CompletableFuture<DeleteJobResponse> deleteJob(DeleteJobRequest request);

    CompletableFuture<DeleteProjectResponse> deleteProject(DeleteProjectRequest request);

    CompletableFuture<GetAppResponse> getApp(GetAppRequest request);

    CompletableFuture<GetClusterResponse> getCluster(GetClusterRequest request);

    CompletableFuture<GetClusterInstanceResponse> getClusterInstance(GetClusterInstanceRequest request);

    CompletableFuture<GetImageResponse> getImage(GetImageRequest request);

    CompletableFuture<GetInstanceResponse> getInstance(GetInstanceRequest request);

    CompletableFuture<GetJobResponse> getJob(GetJobRequest request);

    CompletableFuture<GetJobDescriptionResponse> getJobDescription(GetJobDescriptionRequest request);

    CompletableFuture<GetQuotaResponse> getQuota(GetQuotaRequest request);

    CompletableFuture<GetTaskResponse> getTask(GetTaskRequest request);

    CompletableFuture<ListAppsResponse> listApps(ListAppsRequest request);

    CompletableFuture<ListAvailableInstanceTypeResponse> listAvailableInstanceType(ListAvailableInstanceTypeRequest request);

    CompletableFuture<ListClusterInstancesResponse> listClusterInstances(ListClusterInstancesRequest request);

    CompletableFuture<ListClustersResponse> listClusters(ListClustersRequest request);

    CompletableFuture<ListImagesResponse> listImages(ListImagesRequest request);

    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    CompletableFuture<ListJobsResponse> listJobs(ListJobsRequest request);

    CompletableFuture<ListRegionsResponse> listRegions(ListRegionsRequest request);

    CompletableFuture<ListTasksResponse> listTasks(ListTasksRequest request);

    CompletableFuture<ModifyAppResponse> modifyApp(ModifyAppRequest request);

    CompletableFuture<ModifyClusterResponse> modifyCluster(ModifyClusterRequest request);

    CompletableFuture<PollForTaskResponse> pollForTask(PollForTaskRequest request);

    CompletableFuture<RecreateClusterInstanceResponse> recreateClusterInstance(RecreateClusterInstanceRequest request);

    CompletableFuture<RenewClusterInstanceResponse> renewClusterInstance(RenewClusterInstanceRequest request);

    CompletableFuture<ReportTaskStatusResponse> reportTaskStatus(ReportTaskStatusRequest request);

    CompletableFuture<ReportWorkerStatusResponse> reportWorkerStatus(ReportWorkerStatusRequest request);

    CompletableFuture<StartJobResponse> startJob(StartJobRequest request);

    CompletableFuture<StopJobResponse> stopJob(StopJobRequest request);

}
