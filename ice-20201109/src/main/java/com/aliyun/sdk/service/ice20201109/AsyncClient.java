// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ice20201109.models.*;
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

    CompletableFuture<AddCategoryResponse> addCategory(AddCategoryRequest request);

    CompletableFuture<AddEditingProjectMaterialsResponse> addEditingProjectMaterials(AddEditingProjectMaterialsRequest request);

    CompletableFuture<AddFavoritePublicMediaResponse> addFavoritePublicMedia(AddFavoritePublicMediaRequest request);

    CompletableFuture<AddMediaMarksResponse> addMediaMarks(AddMediaMarksRequest request);

    CompletableFuture<AddTemplateResponse> addTemplate(AddTemplateRequest request);

    CompletableFuture<AlterSearchIndexResponse> alterSearchIndex(AlterSearchIndexRequest request);

    CompletableFuture<BatchGetMediaInfosResponse> batchGetMediaInfos(BatchGetMediaInfosRequest request);

    CompletableFuture<CancelDNAJobResponse> cancelDNAJob(CancelDNAJobRequest request);

    CompletableFuture<CancelFavoritePublicMediaResponse> cancelFavoritePublicMedia(CancelFavoritePublicMediaRequest request);

    CompletableFuture<CreateAuditResponse> createAudit(CreateAuditRequest request);

    CompletableFuture<CreateAvatarTrainingJobResponse> createAvatarTrainingJob(CreateAvatarTrainingJobRequest request);

    CompletableFuture<CreateCustomTemplateResponse> createCustomTemplate(CreateCustomTemplateRequest request);

    CompletableFuture<CreateCustomizedVoiceJobResponse> createCustomizedVoiceJob(CreateCustomizedVoiceJobRequest request);

    CompletableFuture<CreateDNADBResponse> createDNADB(CreateDNADBRequest request);

    CompletableFuture<CreateEditingProjectResponse> createEditingProject(CreateEditingProjectRequest request);

    CompletableFuture<CreateLiveRecordTemplateResponse> createLiveRecordTemplate(CreateLiveRecordTemplateRequest request);

    CompletableFuture<CreateLiveSnapshotTemplateResponse> createLiveSnapshotTemplate(CreateLiveSnapshotTemplateRequest request);

    CompletableFuture<CreateLiveTranscodeTemplateResponse> createLiveTranscodeTemplate(CreateLiveTranscodeTemplateRequest request);

    CompletableFuture<CreatePipelineResponse> createPipeline(CreatePipelineRequest request);

    CompletableFuture<CreateSearchIndexResponse> createSearchIndex(CreateSearchIndexRequest request);

    CompletableFuture<CreateSearchLibResponse> createSearchLib(CreateSearchLibRequest request);

    CompletableFuture<CreateUploadMediaResponse> createUploadMedia(CreateUploadMediaRequest request);

    CompletableFuture<CreateUploadStreamResponse> createUploadStream(CreateUploadStreamRequest request);

    CompletableFuture<DecryptKMSDataKeyResponse> decryptKMSDataKey(DecryptKMSDataKeyRequest request);

    CompletableFuture<DeleteAvatarTrainingJobResponse> deleteAvatarTrainingJob(DeleteAvatarTrainingJobRequest request);

    CompletableFuture<DeleteCategoryResponse> deleteCategory(DeleteCategoryRequest request);

    CompletableFuture<DeleteCustomTemplateResponse> deleteCustomTemplate(DeleteCustomTemplateRequest request);

    CompletableFuture<DeleteCustomizedVoiceJobResponse> deleteCustomizedVoiceJob(DeleteCustomizedVoiceJobRequest request);

    CompletableFuture<DeleteDNADBResponse> deleteDNADB(DeleteDNADBRequest request);

    CompletableFuture<DeleteDNAFilesResponse> deleteDNAFiles(DeleteDNAFilesRequest request);

    CompletableFuture<DeleteEditingProjectMaterialsResponse> deleteEditingProjectMaterials(DeleteEditingProjectMaterialsRequest request);

    CompletableFuture<DeleteEditingProjectsResponse> deleteEditingProjects(DeleteEditingProjectsRequest request);

    CompletableFuture<DeleteLiveRecordFilesResponse> deleteLiveRecordFiles(DeleteLiveRecordFilesRequest request);

    CompletableFuture<DeleteLiveRecordTemplateResponse> deleteLiveRecordTemplate(DeleteLiveRecordTemplateRequest request);

    CompletableFuture<DeleteLiveSnapshotFilesResponse> deleteLiveSnapshotFiles(DeleteLiveSnapshotFilesRequest request);

    CompletableFuture<DeleteLiveSnapshotTemplateResponse> deleteLiveSnapshotTemplate(DeleteLiveSnapshotTemplateRequest request);

    CompletableFuture<DeleteLiveTranscodeJobResponse> deleteLiveTranscodeJob(DeleteLiveTranscodeJobRequest request);

    CompletableFuture<DeleteLiveTranscodeTemplateResponse> deleteLiveTranscodeTemplate(DeleteLiveTranscodeTemplateRequest request);

    CompletableFuture<DeleteMediaFromSearchLibResponse> deleteMediaFromSearchLib(DeleteMediaFromSearchLibRequest request);

    CompletableFuture<DeleteMediaInfosResponse> deleteMediaInfos(DeleteMediaInfosRequest request);

    CompletableFuture<DeleteMediaMarksResponse> deleteMediaMarks(DeleteMediaMarksRequest request);

    CompletableFuture<DeletePipelineResponse> deletePipeline(DeletePipelineRequest request);

    CompletableFuture<DeletePlayInfoResponse> deletePlayInfo(DeletePlayInfoRequest request);

    CompletableFuture<DeleteSmartJobResponse> deleteSmartJob(DeleteSmartJobRequest request);

    CompletableFuture<DeleteTemplateResponse> deleteTemplate(DeleteTemplateRequest request);

    CompletableFuture<DescribeMeterImsEditUsageResponse> describeMeterImsEditUsage(DescribeMeterImsEditUsageRequest request);

    CompletableFuture<DescribeMeterImsMediaConvertUHDUsageResponse> describeMeterImsMediaConvertUHDUsage(DescribeMeterImsMediaConvertUHDUsageRequest request);

    CompletableFuture<DescribeMeterImsMediaConvertUsageResponse> describeMeterImsMediaConvertUsage(DescribeMeterImsMediaConvertUsageRequest request);

    CompletableFuture<DescribeMeterImsMpsAiUsageResponse> describeMeterImsMpsAiUsage(DescribeMeterImsMpsAiUsageRequest request);

    CompletableFuture<DescribeMeterImsSummaryResponse> describeMeterImsSummary(DescribeMeterImsSummaryRequest request);

    CompletableFuture<DescribePlayListResponse> describePlayList(DescribePlayListRequest request);

    CompletableFuture<DetectAudioForCustomizedVoiceJobResponse> detectAudioForCustomizedVoiceJob(DetectAudioForCustomizedVoiceJobRequest request);

    CompletableFuture<DropSearchIndexResponse> dropSearchIndex(DropSearchIndexRequest request);

    CompletableFuture<DropSearchLibResponse> dropSearchLib(DropSearchLibRequest request);

    CompletableFuture<GenerateKMSDataKeyResponse> generateKMSDataKey(GenerateKMSDataKeyRequest request);

    CompletableFuture<GetAvatarResponse> getAvatar(GetAvatarRequest request);

    CompletableFuture<GetAvatarTrainingJobResponse> getAvatarTrainingJob(GetAvatarTrainingJobRequest request);

    CompletableFuture<GetBatchMediaProducingJobResponse> getBatchMediaProducingJob(GetBatchMediaProducingJobRequest request);

    CompletableFuture<GetCategoriesResponse> getCategories(GetCategoriesRequest request);

    CompletableFuture<GetContentAnalyzeConfigResponse> getContentAnalyzeConfig(GetContentAnalyzeConfigRequest request);

    CompletableFuture<GetCustomTemplateResponse> getCustomTemplate(GetCustomTemplateRequest request);

    CompletableFuture<GetCustomizedVoiceResponse> getCustomizedVoice(GetCustomizedVoiceRequest request);

    CompletableFuture<GetCustomizedVoiceJobResponse> getCustomizedVoiceJob(GetCustomizedVoiceJobRequest request);

    CompletableFuture<GetDefaultStorageLocationResponse> getDefaultStorageLocation(GetDefaultStorageLocationRequest request);

    CompletableFuture<GetDemonstrationForCustomizedVoiceJobResponse> getDemonstrationForCustomizedVoiceJob(GetDemonstrationForCustomizedVoiceJobRequest request);

    CompletableFuture<GetDynamicImageJobResponse> getDynamicImageJob(GetDynamicImageJobRequest request);

    CompletableFuture<GetEditingProjectResponse> getEditingProject(GetEditingProjectRequest request);

    CompletableFuture<GetEditingProjectMaterialsResponse> getEditingProjectMaterials(GetEditingProjectMaterialsRequest request);

    CompletableFuture<GetEventCallbackResponse> getEventCallback(GetEventCallbackRequest request);

    CompletableFuture<GetLiveEditingIndexFileResponse> getLiveEditingIndexFile(GetLiveEditingIndexFileRequest request);

    CompletableFuture<GetLiveEditingJobResponse> getLiveEditingJob(GetLiveEditingJobRequest request);

    CompletableFuture<GetLiveRecordJobResponse> getLiveRecordJob(GetLiveRecordJobRequest request);

    CompletableFuture<GetLiveRecordTemplateResponse> getLiveRecordTemplate(GetLiveRecordTemplateRequest request);

    CompletableFuture<GetLiveSnapshotJobResponse> getLiveSnapshotJob(GetLiveSnapshotJobRequest request);

    CompletableFuture<GetLiveSnapshotTemplateResponse> getLiveSnapshotTemplate(GetLiveSnapshotTemplateRequest request);

    CompletableFuture<GetLiveTranscodeJobResponse> getLiveTranscodeJob(GetLiveTranscodeJobRequest request);

    CompletableFuture<GetLiveTranscodeTemplateResponse> getLiveTranscodeTemplate(GetLiveTranscodeTemplateRequest request);

    CompletableFuture<GetMediaInfoResponse> getMediaInfo(GetMediaInfoRequest request);

    CompletableFuture<GetMediaInfoJobResponse> getMediaInfoJob(GetMediaInfoJobRequest request);

    CompletableFuture<GetMediaMarksResponse> getMediaMarks(GetMediaMarksRequest request);

    CompletableFuture<GetMediaProducingJobResponse> getMediaProducingJob(GetMediaProducingJobRequest request);

    CompletableFuture<GetPackageJobResponse> getPackageJob(GetPackageJobRequest request);

    CompletableFuture<GetPipelineResponse> getPipeline(GetPipelineRequest request);

    CompletableFuture<GetPlayInfoResponse> getPlayInfo(GetPlayInfoRequest request);

    CompletableFuture<GetPublicMediaInfoResponse> getPublicMediaInfo(GetPublicMediaInfoRequest request);

    CompletableFuture<GetSmartHandleJobResponse> getSmartHandleJob(GetSmartHandleJobRequest request);

    CompletableFuture<GetSnapshotJobResponse> getSnapshotJob(GetSnapshotJobRequest request);

    CompletableFuture<GetSnapshotUrlsResponse> getSnapshotUrls(GetSnapshotUrlsRequest request);

    CompletableFuture<GetSystemTemplateResponse> getSystemTemplate(GetSystemTemplateRequest request);

    CompletableFuture<GetTemplateResponse> getTemplate(GetTemplateRequest request);

    CompletableFuture<GetTemplateMaterialsResponse> getTemplateMaterials(GetTemplateMaterialsRequest request);

    CompletableFuture<GetTemplateParamsResponse> getTemplateParams(GetTemplateParamsRequest request);

    CompletableFuture<GetTranscodeJobResponse> getTranscodeJob(GetTranscodeJobRequest request);

    CompletableFuture<GetUrlUploadInfosResponse> getUrlUploadInfos(GetUrlUploadInfosRequest request);

    CompletableFuture<GetVideoListResponse> getVideoList(GetVideoListRequest request);

    CompletableFuture<GetWorkflowTaskResponse> getWorkflowTask(GetWorkflowTaskRequest request);

    CompletableFuture<InsertMediaToSearchLibResponse> insertMediaToSearchLib(InsertMediaToSearchLibRequest request);

    CompletableFuture<ListAllPublicMediaTagsResponse> listAllPublicMediaTags(ListAllPublicMediaTagsRequest request);

    CompletableFuture<ListAvatarTrainingJobsResponse> listAvatarTrainingJobs(ListAvatarTrainingJobsRequest request);

    CompletableFuture<ListAvatarsResponse> listAvatars(ListAvatarsRequest request);

    CompletableFuture<ListBatchMediaProducingJobsResponse> listBatchMediaProducingJobs(ListBatchMediaProducingJobsRequest request);

    CompletableFuture<ListCustomTemplatesResponse> listCustomTemplates(ListCustomTemplatesRequest request);

    CompletableFuture<ListCustomizedVoiceJobsResponse> listCustomizedVoiceJobs(ListCustomizedVoiceJobsRequest request);

    CompletableFuture<ListCustomizedVoicesResponse> listCustomizedVoices(ListCustomizedVoicesRequest request);

    CompletableFuture<ListDNADBResponse> listDNADB(ListDNADBRequest request);

    CompletableFuture<ListDNAFilesResponse> listDNAFiles(ListDNAFilesRequest request);

    CompletableFuture<ListDynamicImageJobsResponse> listDynamicImageJobs(ListDynamicImageJobsRequest request);

    CompletableFuture<ListLiveRecordFilesResponse> listLiveRecordFiles(ListLiveRecordFilesRequest request);

    CompletableFuture<ListLiveRecordJobsResponse> listLiveRecordJobs(ListLiveRecordJobsRequest request);

    CompletableFuture<ListLiveRecordTemplatesResponse> listLiveRecordTemplates(ListLiveRecordTemplatesRequest request);

    CompletableFuture<ListLiveSnapshotFilesResponse> listLiveSnapshotFiles(ListLiveSnapshotFilesRequest request);

    CompletableFuture<ListLiveSnapshotJobsResponse> listLiveSnapshotJobs(ListLiveSnapshotJobsRequest request);

    CompletableFuture<ListLiveSnapshotTemplatesResponse> listLiveSnapshotTemplates(ListLiveSnapshotTemplatesRequest request);

    CompletableFuture<ListLiveTranscodeJobsResponse> listLiveTranscodeJobs(ListLiveTranscodeJobsRequest request);

    CompletableFuture<ListLiveTranscodeTemplatesResponse> listLiveTranscodeTemplates(ListLiveTranscodeTemplatesRequest request);

    CompletableFuture<ListMediaBasicInfosResponse> listMediaBasicInfos(ListMediaBasicInfosRequest request);

    CompletableFuture<ListMediaInfoJobsResponse> listMediaInfoJobs(ListMediaInfoJobsRequest request);

    CompletableFuture<ListMediaMarksResponse> listMediaMarks(ListMediaMarksRequest request);

    CompletableFuture<ListMediaProducingJobsResponse> listMediaProducingJobs(ListMediaProducingJobsRequest request);

    CompletableFuture<ListPackageJobsResponse> listPackageJobs(ListPackageJobsRequest request);

    CompletableFuture<ListPipelinesResponse> listPipelines(ListPipelinesRequest request);

    CompletableFuture<ListPublicMediaBasicInfosResponse> listPublicMediaBasicInfos(ListPublicMediaBasicInfosRequest request);

    CompletableFuture<ListSmartJobsResponse> listSmartJobs(ListSmartJobsRequest request);

    CompletableFuture<ListSmartSysAvatarModelsResponse> listSmartSysAvatarModels(ListSmartSysAvatarModelsRequest request);

    CompletableFuture<ListSmartVoiceGroupsResponse> listSmartVoiceGroups(ListSmartVoiceGroupsRequest request);

    CompletableFuture<ListSnapshotJobsResponse> listSnapshotJobs(ListSnapshotJobsRequest request);

    CompletableFuture<ListSystemTemplatesResponse> listSystemTemplates(ListSystemTemplatesRequest request);

    CompletableFuture<ListTemplatesResponse> listTemplates(ListTemplatesRequest request);

    CompletableFuture<ListTranscodeJobsResponse> listTranscodeJobs(ListTranscodeJobsRequest request);

    CompletableFuture<QueryDNAJobListResponse> queryDNAJobList(QueryDNAJobListRequest request);

    CompletableFuture<QueryIProductionJobResponse> queryIProductionJob(QueryIProductionJobRequest request);

    CompletableFuture<QueryMediaCensorJobDetailResponse> queryMediaCensorJobDetail(QueryMediaCensorJobDetailRequest request);

    CompletableFuture<QueryMediaCensorJobListResponse> queryMediaCensorJobList(QueryMediaCensorJobListRequest request);

    CompletableFuture<QueryMediaIndexJobResponse> queryMediaIndexJob(QueryMediaIndexJobRequest request);

    CompletableFuture<QuerySearchIndexResponse> querySearchIndex(QuerySearchIndexRequest request);

    CompletableFuture<QuerySearchLibResponse> querySearchLib(QuerySearchLibRequest request);

    CompletableFuture<QuerySmarttagJobResponse> querySmarttagJob(QuerySmarttagJobRequest request);

    CompletableFuture<RefreshUploadMediaResponse> refreshUploadMedia(RefreshUploadMediaRequest request);

    CompletableFuture<RegisterMediaInfoResponse> registerMediaInfo(RegisterMediaInfoRequest request);

    CompletableFuture<RegisterMediaStreamResponse> registerMediaStream(RegisterMediaStreamRequest request);

    CompletableFuture<SearchEditingProjectResponse> searchEditingProject(SearchEditingProjectRequest request);

    CompletableFuture<SearchMediaResponse> searchMedia(SearchMediaRequest request);

    CompletableFuture<SearchMediaByAILabelResponse> searchMediaByAILabel(SearchMediaByAILabelRequest request);

    CompletableFuture<SearchMediaByFaceResponse> searchMediaByFace(SearchMediaByFaceRequest request);

    CompletableFuture<SearchMediaByHybridResponse> searchMediaByHybrid(SearchMediaByHybridRequest request);

    CompletableFuture<SearchMediaByMultimodalResponse> searchMediaByMultimodal(SearchMediaByMultimodalRequest request);

    CompletableFuture<SearchMediaClipByFaceResponse> searchMediaClipByFace(SearchMediaClipByFaceRequest request);

    CompletableFuture<SearchPublicMediaInfoResponse> searchPublicMediaInfo(SearchPublicMediaInfoRequest request);

    CompletableFuture<SendLiveSnapshotJobCommandResponse> sendLiveSnapshotJobCommand(SendLiveSnapshotJobCommandRequest request);

    CompletableFuture<SendLiveTranscodeJobCommandResponse> sendLiveTranscodeJobCommand(SendLiveTranscodeJobCommandRequest request);

    CompletableFuture<SetContentAnalyzeConfigResponse> setContentAnalyzeConfig(SetContentAnalyzeConfigRequest request);

    CompletableFuture<SetDefaultCustomTemplateResponse> setDefaultCustomTemplate(SetDefaultCustomTemplateRequest request);

    CompletableFuture<SetDefaultStorageLocationResponse> setDefaultStorageLocation(SetDefaultStorageLocationRequest request);

    CompletableFuture<SetEventCallbackResponse> setEventCallback(SetEventCallbackRequest request);

    CompletableFuture<StartWorkflowResponse> startWorkflow(StartWorkflowRequest request);

    CompletableFuture<SubmitASRJobResponse> submitASRJob(SubmitASRJobRequest request);

    CompletableFuture<SubmitAudioProduceJobResponse> submitAudioProduceJob(SubmitAudioProduceJobRequest request);

    CompletableFuture<SubmitAvatarTrainingJobResponse> submitAvatarTrainingJob(SubmitAvatarTrainingJobRequest request);

    CompletableFuture<SubmitAvatarVideoJobResponse> submitAvatarVideoJob(SubmitAvatarVideoJobRequest request);

    CompletableFuture<SubmitBatchMediaProducingJobResponse> submitBatchMediaProducingJob(SubmitBatchMediaProducingJobRequest request);

    CompletableFuture<SubmitCustomizedVoiceJobResponse> submitCustomizedVoiceJob(SubmitCustomizedVoiceJobRequest request);

    CompletableFuture<SubmitDNAJobResponse> submitDNAJob(SubmitDNAJobRequest request);

    CompletableFuture<SubmitDynamicChartJobResponse> submitDynamicChartJob(SubmitDynamicChartJobRequest request);

    CompletableFuture<SubmitDynamicImageJobResponse> submitDynamicImageJob(SubmitDynamicImageJobRequest request);

    CompletableFuture<SubmitIProductionJobResponse> submitIProductionJob(SubmitIProductionJobRequest request);

    CompletableFuture<SubmitLiveEditingJobResponse> submitLiveEditingJob(SubmitLiveEditingJobRequest request);

    CompletableFuture<SubmitLiveRecordJobResponse> submitLiveRecordJob(SubmitLiveRecordJobRequest request);

    CompletableFuture<SubmitLiveSnapshotJobResponse> submitLiveSnapshotJob(SubmitLiveSnapshotJobRequest request);

    CompletableFuture<SubmitLiveTranscodeJobResponse> submitLiveTranscodeJob(SubmitLiveTranscodeJobRequest request);

    CompletableFuture<SubmitMediaCensorJobResponse> submitMediaCensorJob(SubmitMediaCensorJobRequest request);

    CompletableFuture<SubmitMediaInfoJobResponse> submitMediaInfoJob(SubmitMediaInfoJobRequest request);

    CompletableFuture<SubmitMediaProducingJobResponse> submitMediaProducingJob(SubmitMediaProducingJobRequest request);

    CompletableFuture<SubmitPackageJobResponse> submitPackageJob(SubmitPackageJobRequest request);

    CompletableFuture<SubmitSmarttagJobResponse> submitSmarttagJob(SubmitSmarttagJobRequest request);

    CompletableFuture<SubmitSnapshotJobResponse> submitSnapshotJob(SubmitSnapshotJobRequest request);

    CompletableFuture<SubmitStandardCustomizedVoiceJobResponse> submitStandardCustomizedVoiceJob(SubmitStandardCustomizedVoiceJobRequest request);

    CompletableFuture<SubmitSyncMediaInfoJobResponse> submitSyncMediaInfoJob(SubmitSyncMediaInfoJobRequest request);

    CompletableFuture<SubmitTextGenerateJobResponse> submitTextGenerateJob(SubmitTextGenerateJobRequest request);

    CompletableFuture<SubmitTranscodeJobResponse> submitTranscodeJob(SubmitTranscodeJobRequest request);

    CompletableFuture<SubmitVideoTranslationJobResponse> submitVideoTranslationJob(SubmitVideoTranslationJobRequest request);

    CompletableFuture<UpdateAvatarTrainingJobResponse> updateAvatarTrainingJob(UpdateAvatarTrainingJobRequest request);

    CompletableFuture<UpdateCategoryResponse> updateCategory(UpdateCategoryRequest request);

    CompletableFuture<UpdateCustomTemplateResponse> updateCustomTemplate(UpdateCustomTemplateRequest request);

    CompletableFuture<UpdateCustomizedVoiceResponse> updateCustomizedVoice(UpdateCustomizedVoiceRequest request);

    CompletableFuture<UpdateEditingProjectResponse> updateEditingProject(UpdateEditingProjectRequest request);

    CompletableFuture<UpdateLiveRecordTemplateResponse> updateLiveRecordTemplate(UpdateLiveRecordTemplateRequest request);

    CompletableFuture<UpdateLiveSnapshotTemplateResponse> updateLiveSnapshotTemplate(UpdateLiveSnapshotTemplateRequest request);

    CompletableFuture<UpdateLiveTranscodeJobResponse> updateLiveTranscodeJob(UpdateLiveTranscodeJobRequest request);

    CompletableFuture<UpdateLiveTranscodeTemplateResponse> updateLiveTranscodeTemplate(UpdateLiveTranscodeTemplateRequest request);

    CompletableFuture<UpdateMediaInfoResponse> updateMediaInfo(UpdateMediaInfoRequest request);

    CompletableFuture<UpdateMediaMarksResponse> updateMediaMarks(UpdateMediaMarksRequest request);

    CompletableFuture<UpdateMediaToSearchLibResponse> updateMediaToSearchLib(UpdateMediaToSearchLibRequest request);

    CompletableFuture<UpdatePipelineResponse> updatePipeline(UpdatePipelineRequest request);

    CompletableFuture<UpdateTemplateResponse> updateTemplate(UpdateTemplateRequest request);

    CompletableFuture<UploadMediaByURLResponse> uploadMediaByURL(UploadMediaByURLRequest request);

    CompletableFuture<UploadStreamByURLResponse> uploadStreamByURL(UploadStreamByURLRequest request);

}
