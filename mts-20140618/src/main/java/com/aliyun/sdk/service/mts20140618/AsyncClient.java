// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.mts20140618.models.*;
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

    CompletableFuture<AddCensorPipelineResponse> addCensorPipeline(AddCensorPipelineRequest request);

    CompletableFuture<AddMediaResponse> addMedia(AddMediaRequest request);

    CompletableFuture<AddMediaTagResponse> addMediaTag(AddMediaTagRequest request);

    CompletableFuture<AddMediaWorkflowResponse> addMediaWorkflow(AddMediaWorkflowRequest request);

    CompletableFuture<AddPipelineResponse> addPipeline(AddPipelineRequest request);

    CompletableFuture<AddSmarttagTemplateResponse> addSmarttagTemplate(AddSmarttagTemplateRequest request);

    CompletableFuture<AddTemplateResponse> addTemplate(AddTemplateRequest request);

    CompletableFuture<AddWaterMarkTemplateResponse> addWaterMarkTemplate(AddWaterMarkTemplateRequest request);

    CompletableFuture<BindInputBucketResponse> bindInputBucket(BindInputBucketRequest request);

    CompletableFuture<BindOutputBucketResponse> bindOutputBucket(BindOutputBucketRequest request);

    CompletableFuture<CancelJobResponse> cancelJob(CancelJobRequest request);

    CompletableFuture<CategoryTreeResponse> categoryTree(CategoryTreeRequest request);

    CompletableFuture<CreateFpShotDBResponse> createFpShotDB(CreateFpShotDBRequest request);

    CompletableFuture<DeactivateMediaWorkflowResponse> deactivateMediaWorkflow(DeactivateMediaWorkflowRequest request);

    CompletableFuture<DeleteCategoryResponse> deleteCategory(DeleteCategoryRequest request);

    CompletableFuture<DeleteMediaResponse> deleteMedia(DeleteMediaRequest request);

    CompletableFuture<DeleteMediaTagResponse> deleteMediaTag(DeleteMediaTagRequest request);

    CompletableFuture<DeleteMediaWorkflowResponse> deleteMediaWorkflow(DeleteMediaWorkflowRequest request);

    CompletableFuture<DeletePipelineResponse> deletePipeline(DeletePipelineRequest request);

    CompletableFuture<DeleteSmarttagTemplateResponse> deleteSmarttagTemplate(DeleteSmarttagTemplateRequest request);

    CompletableFuture<DeleteTemplateResponse> deleteTemplate(DeleteTemplateRequest request);

    CompletableFuture<DeleteWaterMarkTemplateResponse> deleteWaterMarkTemplate(DeleteWaterMarkTemplateRequest request);

    CompletableFuture<DescribeMtsUserResourcePackageResponse> describeMtsUserResourcePackage(DescribeMtsUserResourcePackageRequest request);

    CompletableFuture<DetectImageSyncResponse> detectImageSync(DetectImageSyncRequest request);

    CompletableFuture<GetJobInfoResponse> getJobInfo(GetJobInfoRequest request);

    CompletableFuture<ImAuditResponse> imAudit(ImAuditRequest request);

    CompletableFuture<ImportFpShotJobResponse> importFpShotJob(ImportFpShotJobRequest request);

    CompletableFuture<ListAllCategoryResponse> listAllCategory(ListAllCategoryRequest request);

    CompletableFuture<ListAllMediaBucketResponse> listAllMediaBucket(ListAllMediaBucketRequest request);

    CompletableFuture<ListCensorPipelineResponse> listCensorPipeline(ListCensorPipelineRequest request);

    CompletableFuture<ListCustomPersonsResponse> listCustomPersons(ListCustomPersonsRequest request);

    CompletableFuture<ListFpShotDBResponse> listFpShotDB(ListFpShotDBRequest request);

    CompletableFuture<ListFpShotFilesResponse> listFpShotFiles(ListFpShotFilesRequest request);

    CompletableFuture<ListJobResponse> listJob(ListJobRequest request);

    CompletableFuture<ListMediaResponse> listMedia(ListMediaRequest request);

    CompletableFuture<ListMediaWorkflowExecutionsResponse> listMediaWorkflowExecutions(ListMediaWorkflowExecutionsRequest request);

    CompletableFuture<LogicalDeleteResourceResponse> logicalDeleteResource(LogicalDeleteResourceRequest request);

    CompletableFuture<PhysicalDeleteResourceResponse> physicalDeleteResource(PhysicalDeleteResourceRequest request);

    CompletableFuture<PlayInfoResponse> playInfo(PlayInfoRequest request);

    CompletableFuture<PlayerAuthResponse> playerAuth(PlayerAuthRequest request);

    CompletableFuture<QueryAnalysisJobListResponse> queryAnalysisJobList(QueryAnalysisJobListRequest request);

    CompletableFuture<QueryAuthConfigResponse> queryAuthConfig(QueryAuthConfigRequest request);

    CompletableFuture<QueryCensorJobListResponse> queryCensorJobList(QueryCensorJobListRequest request);

    CompletableFuture<QueryCensorPipelineListResponse> queryCensorPipelineList(QueryCensorPipelineListRequest request);

    CompletableFuture<QueryComplexJobListResponse> queryComplexJobList(QueryComplexJobListRequest request);

    CompletableFuture<QueryEditingJobListResponse> queryEditingJobList(QueryEditingJobListRequest request);

    CompletableFuture<QueryFpDBDeleteJobListResponse> queryFpDBDeleteJobList(QueryFpDBDeleteJobListRequest request);

    CompletableFuture<QueryFpFileDeleteJobListResponse> queryFpFileDeleteJobList(QueryFpFileDeleteJobListRequest request);

    CompletableFuture<QueryFpShotJobListResponse> queryFpShotJobList(QueryFpShotJobListRequest request);

    CompletableFuture<QueryIProductionJobResponse> queryIProductionJob(QueryIProductionJobRequest request);

    CompletableFuture<QueryInnerJobResponse> queryInnerJob(QueryInnerJobRequest request);

    CompletableFuture<QueryJobListResponse> queryJobList(QueryJobListRequest request);

    CompletableFuture<QueryMediaCensorJobDetailResponse> queryMediaCensorJobDetail(QueryMediaCensorJobDetailRequest request);

    CompletableFuture<QueryMediaCensorJobListResponse> queryMediaCensorJobList(QueryMediaCensorJobListRequest request);

    CompletableFuture<QueryMediaInfoJobListResponse> queryMediaInfoJobList(QueryMediaInfoJobListRequest request);

    CompletableFuture<QueryMediaListResponse> queryMediaList(QueryMediaListRequest request);

    CompletableFuture<QueryMediaListByURLResponse> queryMediaListByURL(QueryMediaListByURLRequest request);

    CompletableFuture<QueryMediaWorkflowExecutionListResponse> queryMediaWorkflowExecutionList(QueryMediaWorkflowExecutionListRequest request);

    CompletableFuture<QueryMediaWorkflowListResponse> queryMediaWorkflowList(QueryMediaWorkflowListRequest request);

    CompletableFuture<QueryPipelineListResponse> queryPipelineList(QueryPipelineListRequest request);

    CompletableFuture<QuerySmarttagJobResponse> querySmarttagJob(QuerySmarttagJobRequest request);

    CompletableFuture<QuerySmarttagTemplateListResponse> querySmarttagTemplateList(QuerySmarttagTemplateListRequest request);

    CompletableFuture<QuerySnapshotJobListResponse> querySnapshotJobList(QuerySnapshotJobListRequest request);

    CompletableFuture<QuerySubtitleJobListResponse> querySubtitleJobList(QuerySubtitleJobListRequest request);

    CompletableFuture<QueryTemplateListResponse> queryTemplateList(QueryTemplateListRequest request);

    CompletableFuture<QueryVideoQualityJobResponse> queryVideoQualityJob(QueryVideoQualityJobRequest request);

    CompletableFuture<QueryWaterMarkTemplateListResponse> queryWaterMarkTemplateList(QueryWaterMarkTemplateListRequest request);

    CompletableFuture<RefreshCdnDomainConfigsCacheResponse> refreshCdnDomainConfigsCache(RefreshCdnDomainConfigsCacheRequest request);

    CompletableFuture<RegisterCustomFaceResponse> registerCustomFace(RegisterCustomFaceRequest request);

    CompletableFuture<ReportCensorJobResultResponse> reportCensorJobResult(ReportCensorJobResultRequest request);

    CompletableFuture<ReportFpShotJobResultResponse> reportFpShotJobResult(ReportFpShotJobResultRequest request);

    CompletableFuture<SearchMediaResponse> searchMedia(SearchMediaRequest request);

    CompletableFuture<SearchMediaWorkflowResponse> searchMediaWorkflow(SearchMediaWorkflowRequest request);

    CompletableFuture<SearchPipelineResponse> searchPipeline(SearchPipelineRequest request);

    CompletableFuture<SearchTemplateResponse> searchTemplate(SearchTemplateRequest request);

    CompletableFuture<SearchWaterMarkTemplateResponse> searchWaterMarkTemplate(SearchWaterMarkTemplateRequest request);

    CompletableFuture<SetAuthConfigResponse> setAuthConfig(SetAuthConfigRequest request);

    CompletableFuture<SubmitAnalysisJobResponse> submitAnalysisJob(SubmitAnalysisJobRequest request);

    CompletableFuture<SubmitComplexJobResponse> submitComplexJob(SubmitComplexJobRequest request);

    CompletableFuture<SubmitEditingJobsResponse> submitEditingJobs(SubmitEditingJobsRequest request);

    CompletableFuture<SubmitFpDBDeleteJobResponse> submitFpDBDeleteJob(SubmitFpDBDeleteJobRequest request);

    CompletableFuture<SubmitFpFileDeleteJobResponse> submitFpFileDeleteJob(SubmitFpFileDeleteJobRequest request);

    CompletableFuture<SubmitFpShotJobResponse> submitFpShotJob(SubmitFpShotJobRequest request);

    CompletableFuture<SubmitIProductionJobResponse> submitIProductionJob(SubmitIProductionJobRequest request);

    CompletableFuture<SubmitInnerJobResponse> submitInnerJob(SubmitInnerJobRequest request);

    CompletableFuture<SubmitJobsResponse> submitJobs(SubmitJobsRequest request);

    CompletableFuture<SubmitMediaCensorJobResponse> submitMediaCensorJob(SubmitMediaCensorJobRequest request);

    CompletableFuture<SubmitMediaInfoJobResponse> submitMediaInfoJob(SubmitMediaInfoJobRequest request);

    CompletableFuture<SubmitOssFileCopyJobResponse> submitOssFileCopyJob(SubmitOssFileCopyJobRequest request);

    CompletableFuture<SubmitPornJobResponse> submitPornJob(SubmitPornJobRequest request);

    CompletableFuture<SubmitSmarttagJobResponse> submitSmarttagJob(SubmitSmarttagJobRequest request);

    CompletableFuture<SubmitSnapshotJobResponse> submitSnapshotJob(SubmitSnapshotJobRequest request);

    CompletableFuture<SubmitSubtitleJobResponse> submitSubtitleJob(SubmitSubtitleJobRequest request);

    CompletableFuture<SubmitURLUploadJobResponse> submitURLUploadJob(SubmitURLUploadJobRequest request);

    CompletableFuture<SubmitVideoQualityJobResponse> submitVideoQualityJob(SubmitVideoQualityJobRequest request);

    CompletableFuture<TagCustomPersonResponse> tagCustomPerson(TagCustomPersonRequest request);

    CompletableFuture<UnbindInputBucketResponse> unbindInputBucket(UnbindInputBucketRequest request);

    CompletableFuture<UnbindOutputBucketResponse> unbindOutputBucket(UnbindOutputBucketRequest request);

    CompletableFuture<UnregisterCustomFaceResponse> unregisterCustomFace(UnregisterCustomFaceRequest request);

    CompletableFuture<UpdateCategoryNameResponse> updateCategoryName(UpdateCategoryNameRequest request);

    CompletableFuture<UpdateCensorPipelineResponse> updateCensorPipeline(UpdateCensorPipelineRequest request);

    CompletableFuture<UpdateMediaResponse> updateMedia(UpdateMediaRequest request);

    CompletableFuture<UpdateMediaCategoryResponse> updateMediaCategory(UpdateMediaCategoryRequest request);

    CompletableFuture<UpdateMediaCoverResponse> updateMediaCover(UpdateMediaCoverRequest request);

    CompletableFuture<UpdateMediaPublishStateResponse> updateMediaPublishState(UpdateMediaPublishStateRequest request);

    CompletableFuture<UpdateMediaWorkflowResponse> updateMediaWorkflow(UpdateMediaWorkflowRequest request);

    CompletableFuture<UpdateMediaWorkflowTriggerModeResponse> updateMediaWorkflowTriggerMode(UpdateMediaWorkflowTriggerModeRequest request);

    CompletableFuture<UpdatePipelineResponse> updatePipeline(UpdatePipelineRequest request);

    CompletableFuture<UpdateSmarttagTemplateResponse> updateSmarttagTemplate(UpdateSmarttagTemplateRequest request);

    CompletableFuture<UpdateTemplateResponse> updateTemplate(UpdateTemplateRequest request);

    CompletableFuture<UpdateWaterMarkTemplateResponse> updateWaterMarkTemplate(UpdateWaterMarkTemplateRequest request);

}
