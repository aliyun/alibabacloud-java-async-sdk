// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddi20200617;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ddi20200617.models.*;
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

    CompletableFuture<CloneFlowJobResponse> cloneFlowJob(CloneFlowJobRequest request);

    CompletableFuture<CreateClusterV2Response> createClusterV2(CreateClusterV2Request request);

    CompletableFuture<CreateFlowResponse> createFlow(CreateFlowRequest request);

    CompletableFuture<CreateFlowCategoryResponse> createFlowCategory(CreateFlowCategoryRequest request);

    CompletableFuture<CreateFlowJobResponse> createFlowJob(CreateFlowJobRequest request);

    CompletableFuture<CreateFlowProjectResponse> createFlowProject(CreateFlowProjectRequest request);

    CompletableFuture<CreateFlowProjectUserResponse> createFlowProjectUser(CreateFlowProjectUserRequest request);

    CompletableFuture<CreateLibraryResponse> createLibrary(CreateLibraryRequest request);

    CompletableFuture<DeleteFlowResponse> deleteFlow(DeleteFlowRequest request);

    CompletableFuture<DeleteFlowCategoryResponse> deleteFlowCategory(DeleteFlowCategoryRequest request);

    CompletableFuture<DeleteFlowProjectResponse> deleteFlowProject(DeleteFlowProjectRequest request);

    CompletableFuture<DeleteFlowProjectUserResponse> deleteFlowProjectUser(DeleteFlowProjectUserRequest request);

    CompletableFuture<DescribeClusterV2Response> describeClusterV2(DescribeClusterV2Request request);

    CompletableFuture<DescribeFlowResponse> describeFlow(DescribeFlowRequest request);

    CompletableFuture<DescribeFlowCategoryTreeResponse> describeFlowCategoryTree(DescribeFlowCategoryTreeRequest request);

    CompletableFuture<DescribeFlowJobResponse> describeFlowJob(DescribeFlowJobRequest request);

    CompletableFuture<DescribeFlowNodeInstanceResponse> describeFlowNodeInstance(DescribeFlowNodeInstanceRequest request);

    CompletableFuture<DescribeFlowProjectResponse> describeFlowProject(DescribeFlowProjectRequest request);

    CompletableFuture<DescribeLibraryDetailResponse> describeLibraryDetail(DescribeLibraryDetailRequest request);

    CompletableFuture<DescribeLibraryInstallTaskDetailResponse> describeLibraryInstallTaskDetail(DescribeLibraryInstallTaskDetailRequest request);

    CompletableFuture<KillFlowJobResponse> killFlowJob(KillFlowJobRequest request);

    CompletableFuture<ListClustersResponse> listClusters(ListClustersRequest request);

    CompletableFuture<ListFlowResponse> listFlow(ListFlowRequest request);

    CompletableFuture<ListFlowJobHistoryResponse> listFlowJobHistory(ListFlowJobHistoryRequest request);

    CompletableFuture<ListFlowJobsResponse> listFlowJobs(ListFlowJobsRequest request);

    CompletableFuture<ListFlowProjectUserResponse> listFlowProjectUser(ListFlowProjectUserRequest request);

    CompletableFuture<ListFlowProjectsResponse> listFlowProjects(ListFlowProjectsRequest request);

    CompletableFuture<ListLibraryInstallTasksResponse> listLibraryInstallTasks(ListLibraryInstallTasksRequest request);

    CompletableFuture<ListLibraryStatusResponse> listLibraryStatus(ListLibraryStatusRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ModifyFlowForWebResponse> modifyFlowForWeb(ModifyFlowForWebRequest request);

    CompletableFuture<ModifyFlowJobResponse> modifyFlowJob(ModifyFlowJobRequest request);

    CompletableFuture<ModifyFlowProjectResponse> modifyFlowProject(ModifyFlowProjectRequest request);

    CompletableFuture<ReleaseClusterResponse> releaseCluster(ReleaseClusterRequest request);

    CompletableFuture<RerunFlowResponse> rerunFlow(RerunFlowRequest request);

    CompletableFuture<ResumeFlowResponse> resumeFlow(ResumeFlowRequest request);

    CompletableFuture<SubmitFlowResponse> submitFlow(SubmitFlowRequest request);

    CompletableFuture<SubmitFlowJobResponse> submitFlowJob(SubmitFlowJobRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpdateLibraryInstallTaskStatusResponse> updateLibraryInstallTaskStatus(UpdateLibraryInstallTaskStatusRequest request);

}
