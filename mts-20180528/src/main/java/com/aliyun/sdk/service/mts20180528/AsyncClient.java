// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20180528;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.mts20180528.models.*;
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

    CompletableFuture<ActivateMediaWorkflowResponse> activateMediaWorkflow(ActivateMediaWorkflowRequest request);

    CompletableFuture<AddCategoryResponse> addCategory(AddCategoryRequest request);

    CompletableFuture<AddMediaResponse> addMedia(AddMediaRequest request);

    CompletableFuture<AddMediaTagResponse> addMediaTag(AddMediaTagRequest request);

    CompletableFuture<AddMediaWorkflowResponse> addMediaWorkflow(AddMediaWorkflowRequest request);

    CompletableFuture<AddPipelineResponse> addPipeline(AddPipelineRequest request);

    CompletableFuture<AddTemplateResponse> addTemplate(AddTemplateRequest request);

    CompletableFuture<AddWaterMarkTemplateResponse> addWaterMarkTemplate(AddWaterMarkTemplateRequest request);

    CompletableFuture<BindInputBucketResponse> bindInputBucket(BindInputBucketRequest request);

    CompletableFuture<BindOutputBucketResponse> bindOutputBucket(BindOutputBucketRequest request);

    CompletableFuture<CancelJobResponse> cancelJob(CancelJobRequest request);

    CompletableFuture<CategoryTreeResponse> categoryTree(CategoryTreeRequest request);

    CompletableFuture<DeactivateMediaWorkflowResponse> deactivateMediaWorkflow(DeactivateMediaWorkflowRequest request);

    CompletableFuture<DeleteCategoryResponse> deleteCategory(DeleteCategoryRequest request);

    CompletableFuture<DeleteMediaResponse> deleteMedia(DeleteMediaRequest request);

    CompletableFuture<DeleteMediaTagResponse> deleteMediaTag(DeleteMediaTagRequest request);

    CompletableFuture<DeleteMediaWorkflowResponse> deleteMediaWorkflow(DeleteMediaWorkflowRequest request);

    CompletableFuture<DeletePipelineResponse> deletePipeline(DeletePipelineRequest request);

    CompletableFuture<DeleteTemplateResponse> deleteTemplate(DeleteTemplateRequest request);

    CompletableFuture<DeleteWaterMarkTemplateResponse> deleteWaterMarkTemplate(DeleteWaterMarkTemplateRequest request);

    CompletableFuture<DescribeMtsUserResourcePackageResponse> describeMtsUserResourcePackage(DescribeMtsUserResourcePackageRequest request);

    CompletableFuture<ListAllCategoryResponse> listAllCategory(ListAllCategoryRequest request);

    CompletableFuture<ListAllMediaBucketResponse> listAllMediaBucket(ListAllMediaBucketRequest request);

    CompletableFuture<ListJobResponse> listJob(ListJobRequest request);

    CompletableFuture<ListMediaResponse> listMedia(ListMediaRequest request);

    CompletableFuture<ListMediaWorkflowExecutionsResponse> listMediaWorkflowExecutions(ListMediaWorkflowExecutionsRequest request);

    CompletableFuture<QueryAnalysisJobListResponse> queryAnalysisJobList(QueryAnalysisJobListRequest request);

    CompletableFuture<QueryEditingJobListResponse> queryEditingJobList(QueryEditingJobListRequest request);

    CompletableFuture<QueryJobListResponse> queryJobList(QueryJobListRequest request);

    CompletableFuture<QueryMediaInfoJobListResponse> queryMediaInfoJobList(QueryMediaInfoJobListRequest request);

    CompletableFuture<QueryMediaListResponse> queryMediaList(QueryMediaListRequest request);

    CompletableFuture<QueryMediaListByURLResponse> queryMediaListByURL(QueryMediaListByURLRequest request);

    CompletableFuture<QueryMediaWorkflowExecutionListResponse> queryMediaWorkflowExecutionList(QueryMediaWorkflowExecutionListRequest request);

    CompletableFuture<QueryMediaWorkflowListResponse> queryMediaWorkflowList(QueryMediaWorkflowListRequest request);

    CompletableFuture<QueryPipelineListResponse> queryPipelineList(QueryPipelineListRequest request);

    CompletableFuture<QuerySnapshotJobListResponse> querySnapshotJobList(QuerySnapshotJobListRequest request);

    CompletableFuture<QueryTemplateListResponse> queryTemplateList(QueryTemplateListRequest request);

    CompletableFuture<QueryWaterMarkTemplateListResponse> queryWaterMarkTemplateList(QueryWaterMarkTemplateListRequest request);

    CompletableFuture<SearchMediaWorkflowResponse> searchMediaWorkflow(SearchMediaWorkflowRequest request);

    CompletableFuture<SearchPipelineResponse> searchPipeline(SearchPipelineRequest request);

    CompletableFuture<SearchTemplateResponse> searchTemplate(SearchTemplateRequest request);

    CompletableFuture<SearchWaterMarkTemplateResponse> searchWaterMarkTemplate(SearchWaterMarkTemplateRequest request);

    CompletableFuture<SubmitAnalysisJobResponse> submitAnalysisJob(SubmitAnalysisJobRequest request);

    CompletableFuture<SubmitEditingJobsResponse> submitEditingJobs(SubmitEditingJobsRequest request);

    CompletableFuture<SubmitJobsResponse> submitJobs(SubmitJobsRequest request);

    CompletableFuture<SubmitMediaInfoJobResponse> submitMediaInfoJob(SubmitMediaInfoJobRequest request);

    CompletableFuture<SubmitSnapshotJobResponse> submitSnapshotJob(SubmitSnapshotJobRequest request);

    CompletableFuture<UnbindInputBucketResponse> unbindInputBucket(UnbindInputBucketRequest request);

    CompletableFuture<UnbindOutputBucketResponse> unbindOutputBucket(UnbindOutputBucketRequest request);

    CompletableFuture<UpdateCategoryNameResponse> updateCategoryName(UpdateCategoryNameRequest request);

    CompletableFuture<UpdateMediaResponse> updateMedia(UpdateMediaRequest request);

    CompletableFuture<UpdateMediaCategoryResponse> updateMediaCategory(UpdateMediaCategoryRequest request);

    CompletableFuture<UpdateMediaCoverResponse> updateMediaCover(UpdateMediaCoverRequest request);

    CompletableFuture<UpdateMediaPublishStateResponse> updateMediaPublishState(UpdateMediaPublishStateRequest request);

    CompletableFuture<UpdateMediaWorkflowResponse> updateMediaWorkflow(UpdateMediaWorkflowRequest request);

    CompletableFuture<UpdateMediaWorkflowTriggerModeResponse> updateMediaWorkflowTriggerMode(UpdateMediaWorkflowTriggerModeRequest request);

    CompletableFuture<UpdatePipelineResponse> updatePipeline(UpdatePipelineRequest request);

    CompletableFuture<UpdateTemplateResponse> updateTemplate(UpdateTemplateRequest request);

    CompletableFuture<UpdateWaterMarkTemplateResponse> updateWaterMarkTemplate(UpdateWaterMarkTemplateRequest request);

}
