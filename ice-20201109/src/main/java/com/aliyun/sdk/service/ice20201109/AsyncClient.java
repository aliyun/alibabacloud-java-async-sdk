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

    /**
     * <b>description</b> :
     * <p>You can create at most three levels of categories. Each category level can contain a maximum of 100 subcategories.</p>
     * 
     * @param request the request parameters of AddCategory  AddCategoryRequest
     * @return AddCategoryResponse
     */
    CompletableFuture<AddCategoryResponse> addCategory(AddCategoryRequest request);

    /**
     * @param request the request parameters of AddEditingProjectMaterials  AddEditingProjectMaterialsRequest
     * @return AddEditingProjectMaterialsResponse
     */
    CompletableFuture<AddEditingProjectMaterialsResponse> addEditingProjectMaterials(AddEditingProjectMaterialsRequest request);

    /**
     * @param request the request parameters of AddFavoritePublicMedia  AddFavoritePublicMediaRequest
     * @return AddFavoritePublicMediaResponse
     */
    CompletableFuture<AddFavoritePublicMediaResponse> addFavoritePublicMedia(AddFavoritePublicMediaRequest request);

    /**
     * @param request the request parameters of AddMediaConnectFlowInput  AddMediaConnectFlowInputRequest
     * @return AddMediaConnectFlowInputResponse
     */
    CompletableFuture<AddMediaConnectFlowInputResponse> addMediaConnectFlowInput(AddMediaConnectFlowInputRequest request);

    /**
     * @param request the request parameters of AddMediaConnectFlowOutput  AddMediaConnectFlowOutputRequest
     * @return AddMediaConnectFlowOutputResponse
     */
    CompletableFuture<AddMediaConnectFlowOutputResponse> addMediaConnectFlowOutput(AddMediaConnectFlowOutputRequest request);

    /**
     * @param request the request parameters of AddMediaMarks  AddMediaMarksRequest
     * @return AddMediaMarksResponse
     */
    CompletableFuture<AddMediaMarksResponse> addMediaMarks(AddMediaMarksRequest request);

    /**
     * <b>description</b> :
     * <p>  For more information about how to use a regular template, see <a href="https://help.aliyun.com/document_detail/445399.html">Create and use a regular template</a>.</p>
     * <ul>
     * <li>For more information about how to use an advanced template, see <a href="https://help.aliyun.com/document_detail/445389.html">Create and use advanced templates</a>.</li>
     * <li>After an advanced template is created, it enters the Processing state. In this case, the template is unavailable. The template can be used only when it is in the Available state. The time required for template processing varies based on the size of the template file. Generally, it ranges from 10 seconds to 5 minutes.</li>
     * </ul>
     * 
     * @param request the request parameters of AddTemplate  AddTemplateRequest
     * @return AddTemplateResponse
     */
    CompletableFuture<AddTemplateResponse> addTemplate(AddTemplateRequest request);

    /**
     * @param request the request parameters of AlterSearchIndex  AlterSearchIndexRequest
     * @return AlterSearchIndexResponse
     */
    CompletableFuture<AlterSearchIndexResponse> alterSearchIndex(AlterSearchIndexRequest request);

    /**
     * @param request the request parameters of BatchGetMediaInfos  BatchGetMediaInfosRequest
     * @return BatchGetMediaInfosResponse
     */
    CompletableFuture<BatchGetMediaInfosResponse> batchGetMediaInfos(BatchGetMediaInfosRequest request);

    /**
     * <b>description</b> :
     * <p>  You can cancel a media fingerprint analysis job only if the job is in the Queuing state.</p>
     * <ul>
     * <li>We recommend that you call the <strong>UpdatePipeline</strong> operation to set the status of the ApsaraVideo Media Processing (MPS) queue to Paused before you cancel a job. This suspends job scheduling in the MPS queue. After the job is canceled, you must set the status of the MPS queue back to Active so that the other jobs in the MPS queue can be scheduled.</li>
     * </ul>
     * 
     * @param request the request parameters of CancelDNAJob  CancelDNAJobRequest
     * @return CancelDNAJobResponse
     */
    CompletableFuture<CancelDNAJobResponse> cancelDNAJob(CancelDNAJobRequest request);

    /**
     * @param request the request parameters of CancelFavoritePublicMedia  CancelFavoritePublicMediaRequest
     * @return CancelFavoritePublicMediaResponse
     */
    CompletableFuture<CancelFavoritePublicMediaResponse> cancelFavoritePublicMedia(CancelFavoritePublicMediaRequest request);

    /**
     * @param request the request parameters of CreateAudit  CreateAuditRequest
     * @return CreateAuditResponse
     */
    CompletableFuture<CreateAuditResponse> createAudit(CreateAuditRequest request);

    /**
     * @param request the request parameters of CreateAvatarTrainingJob  CreateAvatarTrainingJobRequest
     * @return CreateAvatarTrainingJobResponse
     */
    CompletableFuture<CreateAvatarTrainingJobResponse> createAvatarTrainingJob(CreateAvatarTrainingJobRequest request);

    /**
     * @param request the request parameters of CreateChannel  CreateChannelRequest
     * @return CreateChannelResponse
     */
    CompletableFuture<CreateChannelResponse> createChannel(CreateChannelRequest request);

    /**
     * @param request the request parameters of CreateCustomTemplate  CreateCustomTemplateRequest
     * @return CreateCustomTemplateResponse
     */
    CompletableFuture<CreateCustomTemplateResponse> createCustomTemplate(CreateCustomTemplateRequest request);

    /**
     * @param request the request parameters of CreateCustomizedVoiceJob  CreateCustomizedVoiceJobRequest
     * @return CreateCustomizedVoiceJobResponse
     */
    CompletableFuture<CreateCustomizedVoiceJobResponse> createCustomizedVoiceJob(CreateCustomizedVoiceJobRequest request);

    /**
     * <b>description</b> :
     * <p>  You can create up to five media fingerprint libraries within an account. To increase the quota, submit a ticket. You can call the DeleteDNADB operation to delete the fingerprint libraries that you no longer need.</p>
     * 
     * @param request the request parameters of CreateDNADB  CreateDNADBRequest
     * @return CreateDNADBResponse
     */
    CompletableFuture<CreateDNADBResponse> createDNADB(CreateDNADBRequest request);

    /**
     * @param request the request parameters of CreateEditingProject  CreateEditingProjectRequest
     * @return CreateEditingProjectResponse
     */
    CompletableFuture<CreateEditingProjectResponse> createEditingProject(CreateEditingProjectRequest request);

    /**
     * @param request the request parameters of CreateLivePackageChannel  CreateLivePackageChannelRequest
     * @return CreateLivePackageChannelResponse
     */
    CompletableFuture<CreateLivePackageChannelResponse> createLivePackageChannel(CreateLivePackageChannelRequest request);

    /**
     * @param request the request parameters of CreateLivePackageChannelGroup  CreateLivePackageChannelGroupRequest
     * @return CreateLivePackageChannelGroupResponse
     */
    CompletableFuture<CreateLivePackageChannelGroupResponse> createLivePackageChannelGroup(CreateLivePackageChannelGroupRequest request);

    /**
     * @param request the request parameters of CreateLivePackageOriginEndpoint  CreateLivePackageOriginEndpointRequest
     * @return CreateLivePackageOriginEndpointResponse
     */
    CompletableFuture<CreateLivePackageOriginEndpointResponse> createLivePackageOriginEndpoint(CreateLivePackageOriginEndpointRequest request);

    /**
     * <b>description</b> :
     * <p>You must specify a recording template for live stream recording. You can configure information such as the format and duration of a recording in a recording template. The recording format can be M3U8, MP4, or FLV.</p>
     * 
     * @param request the request parameters of CreateLiveRecordTemplate  CreateLiveRecordTemplateRequest
     * @return CreateLiveRecordTemplateResponse
     */
    CompletableFuture<CreateLiveRecordTemplateResponse> createLiveRecordTemplate(CreateLiveRecordTemplateRequest request);

    /**
     * @param request the request parameters of CreateLiveSnapshotTemplate  CreateLiveSnapshotTemplateRequest
     * @return CreateLiveSnapshotTemplateResponse
     */
    CompletableFuture<CreateLiveSnapshotTemplateResponse> createLiveSnapshotTemplate(CreateLiveSnapshotTemplateRequest request);

    /**
     * @param request the request parameters of CreateLiveTranscodeTemplate  CreateLiveTranscodeTemplateRequest
     * @return CreateLiveTranscodeTemplateResponse
     */
    CompletableFuture<CreateLiveTranscodeTemplateResponse> createLiveTranscodeTemplate(CreateLiveTranscodeTemplateRequest request);

    /**
     * @param request the request parameters of CreateMediaConnectFlow  CreateMediaConnectFlowRequest
     * @return CreateMediaConnectFlowResponse
     */
    CompletableFuture<CreateMediaConnectFlowResponse> createMediaConnectFlow(CreateMediaConnectFlowRequest request);

    /**
     * @param request the request parameters of CreatePipeline  CreatePipelineRequest
     * @return CreatePipelineResponse
     */
    CompletableFuture<CreatePipelineResponse> createPipeline(CreatePipelineRequest request);

    /**
     * @param request the request parameters of CreateProgram  CreateProgramRequest
     * @return CreateProgramResponse
     */
    CompletableFuture<CreateProgramResponse> createProgram(CreateProgramRequest request);

    /**
     * <b>description</b> :
     * <p>The large visual model feature is still in the public preview phase. You can use this feature for free for 1,000 hours of videos.</p>
     * 
     * @param request the request parameters of CreateSearchIndex  CreateSearchIndexRequest
     * @return CreateSearchIndexResponse
     */
    CompletableFuture<CreateSearchIndexResponse> createSearchIndex(CreateSearchIndexRequest request);

    /**
     * @param request the request parameters of CreateSearchLib  CreateSearchLibRequest
     * @return CreateSearchLibResponse
     */
    CompletableFuture<CreateSearchLibResponse> createSearchLib(CreateSearchLibRequest request);

    /**
     * @param request the request parameters of CreateSource  CreateSourceRequest
     * @return CreateSourceResponse
     */
    CompletableFuture<CreateSourceResponse> createSource(CreateSourceRequest request);

    /**
     * @param request the request parameters of CreateSourceLocation  CreateSourceLocationRequest
     * @return CreateSourceLocationResponse
     */
    CompletableFuture<CreateSourceLocationResponse> createSourceLocation(CreateSourceLocationRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation to obtain the upload URLs and credentials of audio and video files. You can also call this operation to obtain the upload URLs and credentials of images and auxiliary media assets.</p>
     * <ul>
     * <li>Obtaining an upload URL and credential is essential for Intelligent Media Services (IMS) and is required in each upload operation.</li>
     * <li>If the video upload credential expires, you can call the RefreshUploadMedia operation to obtain a new upload credential. The default validity period of a video upload credential is 3,000 seconds.</li>
     * <li>After you upload a media asset, you can configure a callback to receive upload event notifications or call the GetMediaInfo operation to determine whether the media asset is uploaded based on the returned status.</li>
     * <li>The MediaId parameter returned by this operation can be used for media asset lifecycle management or media processing.</li>
     * <li>You can call this operation to upload media assets only to ApsaraVideo VOD, but not to your own Object Storage Service (OSS) buckets. To upload a media asset to your own OSS bucket, you can upload the file to your OSS bucket by using <a href="https://help.aliyun.com/document_detail/32006.html">OSS SDK</a>, and then call the <a href="https://help.aliyun.com/document_detail/441152.html">RegisterMediaInfo</a> operation to register the file in the OSS bucket with the media asset library.</li>
     * <li>This operation is available only in the China (Shanghai), China (Beijing), and China (Shenzhen) regions.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateUploadMedia  CreateUploadMediaRequest
     * @return CreateUploadMediaResponse
     */
    CompletableFuture<CreateUploadMediaResponse> createUploadMedia(CreateUploadMediaRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation to upload only a local media stream. After the media stream is uploaded, it is associated with the specified media asset ID.</p>
     * <ul>
     * <li>You can call this operation to upload media streams only to ApsaraVideo VOD, but not to your own Object Storage Service (OSS) buckets. To upload a media stream to your own OSS bucket, you can upload the file to your OSS bucket by using <a href="https://help.aliyun.com/document_detail/32006.html">OSS SDK</a>, and then call the <a href="https://help.aliyun.com/document_detail/440765.html">RegisterMediaStream</a> operation to associate the media stream with the specified media asset ID.</li>
     * <li>This operation is available only in the China (Shanghai), China (Beijing), and China (Shenzhen) regions.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateUploadStream  CreateUploadStreamRequest
     * @return CreateUploadStreamResponse
     */
    CompletableFuture<CreateUploadStreamResponse> createUploadStream(CreateUploadStreamRequest request);

    /**
     * @param request the request parameters of DecryptKMSDataKey  DecryptKMSDataKeyRequest
     * @return DecryptKMSDataKeyResponse
     */
    CompletableFuture<DecryptKMSDataKeyResponse> decryptKMSDataKey(DecryptKMSDataKeyRequest request);

    /**
     * @param request the request parameters of DeleteAvatarTrainingJob  DeleteAvatarTrainingJobRequest
     * @return DeleteAvatarTrainingJobResponse
     */
    CompletableFuture<DeleteAvatarTrainingJobResponse> deleteAvatarTrainingJob(DeleteAvatarTrainingJobRequest request);

    /**
     * <b>description</b> :
     * <p>This operation also deletes the subcategories, including the level-2 and level-3 categories, of the category.</p>
     * 
     * @param request the request parameters of DeleteCategory  DeleteCategoryRequest
     * @return DeleteCategoryResponse
     */
    CompletableFuture<DeleteCategoryResponse> deleteCategory(DeleteCategoryRequest request);

    /**
     * @param request the request parameters of DeleteChannel  DeleteChannelRequest
     * @return DeleteChannelResponse
     */
    CompletableFuture<DeleteChannelResponse> deleteChannel(DeleteChannelRequest request);

    /**
     * @param request the request parameters of DeleteCustomTemplate  DeleteCustomTemplateRequest
     * @return DeleteCustomTemplateResponse
     */
    CompletableFuture<DeleteCustomTemplateResponse> deleteCustomTemplate(DeleteCustomTemplateRequest request);

    /**
     * @param request the request parameters of DeleteCustomizedVoiceJob  DeleteCustomizedVoiceJobRequest
     * @return DeleteCustomizedVoiceJobResponse
     */
    CompletableFuture<DeleteCustomizedVoiceJobResponse> deleteCustomizedVoiceJob(DeleteCustomizedVoiceJobRequest request);

    /**
     * @param request the request parameters of DeleteDNADB  DeleteDNADBRequest
     * @return DeleteDNADBResponse
     */
    CompletableFuture<DeleteDNADBResponse> deleteDNADB(DeleteDNADBRequest request);

    /**
     * @param request the request parameters of DeleteDNAFiles  DeleteDNAFilesRequest
     * @return DeleteDNAFilesResponse
     */
    CompletableFuture<DeleteDNAFilesResponse> deleteDNAFiles(DeleteDNAFilesRequest request);

    /**
     * @param request the request parameters of DeleteEditingProjectMaterials  DeleteEditingProjectMaterialsRequest
     * @return DeleteEditingProjectMaterialsResponse
     */
    CompletableFuture<DeleteEditingProjectMaterialsResponse> deleteEditingProjectMaterials(DeleteEditingProjectMaterialsRequest request);

    /**
     * @param request the request parameters of DeleteEditingProjects  DeleteEditingProjectsRequest
     * @return DeleteEditingProjectsResponse
     */
    CompletableFuture<DeleteEditingProjectsResponse> deleteEditingProjects(DeleteEditingProjectsRequest request);

    /**
     * @param request the request parameters of DeleteLivePackageChannel  DeleteLivePackageChannelRequest
     * @return DeleteLivePackageChannelResponse
     */
    CompletableFuture<DeleteLivePackageChannelResponse> deleteLivePackageChannel(DeleteLivePackageChannelRequest request);

    /**
     * @param request the request parameters of DeleteLivePackageChannelGroup  DeleteLivePackageChannelGroupRequest
     * @return DeleteLivePackageChannelGroupResponse
     */
    CompletableFuture<DeleteLivePackageChannelGroupResponse> deleteLivePackageChannelGroup(DeleteLivePackageChannelGroupRequest request);

    /**
     * @param request the request parameters of DeleteLivePackageOriginEndpoint  DeleteLivePackageOriginEndpointRequest
     * @return DeleteLivePackageOriginEndpointResponse
     */
    CompletableFuture<DeleteLivePackageOriginEndpointResponse> deleteLivePackageOriginEndpoint(DeleteLivePackageOriginEndpointRequest request);

    /**
     * @param request the request parameters of DeleteLiveRecordFiles  DeleteLiveRecordFilesRequest
     * @return DeleteLiveRecordFilesResponse
     */
    CompletableFuture<DeleteLiveRecordFilesResponse> deleteLiveRecordFiles(DeleteLiveRecordFilesRequest request);

    /**
     * @param request the request parameters of DeleteLiveRecordTemplate  DeleteLiveRecordTemplateRequest
     * @return DeleteLiveRecordTemplateResponse
     */
    CompletableFuture<DeleteLiveRecordTemplateResponse> deleteLiveRecordTemplate(DeleteLiveRecordTemplateRequest request);

    /**
     * @param request the request parameters of DeleteLiveSnapshotFiles  DeleteLiveSnapshotFilesRequest
     * @return DeleteLiveSnapshotFilesResponse
     */
    CompletableFuture<DeleteLiveSnapshotFilesResponse> deleteLiveSnapshotFiles(DeleteLiveSnapshotFilesRequest request);

    /**
     * @param request the request parameters of DeleteLiveSnapshotTemplate  DeleteLiveSnapshotTemplateRequest
     * @return DeleteLiveSnapshotTemplateResponse
     */
    CompletableFuture<DeleteLiveSnapshotTemplateResponse> deleteLiveSnapshotTemplate(DeleteLiveSnapshotTemplateRequest request);

    /**
     * @param request the request parameters of DeleteLiveTranscodeJob  DeleteLiveTranscodeJobRequest
     * @return DeleteLiveTranscodeJobResponse
     */
    CompletableFuture<DeleteLiveTranscodeJobResponse> deleteLiveTranscodeJob(DeleteLiveTranscodeJobRequest request);

    /**
     * @param request the request parameters of DeleteLiveTranscodeTemplate  DeleteLiveTranscodeTemplateRequest
     * @return DeleteLiveTranscodeTemplateResponse
     */
    CompletableFuture<DeleteLiveTranscodeTemplateResponse> deleteLiveTranscodeTemplate(DeleteLiveTranscodeTemplateRequest request);

    /**
     * @param request the request parameters of DeleteMediaConnectFlow  DeleteMediaConnectFlowRequest
     * @return DeleteMediaConnectFlowResponse
     */
    CompletableFuture<DeleteMediaConnectFlowResponse> deleteMediaConnectFlow(DeleteMediaConnectFlowRequest request);

    /**
     * @param request the request parameters of DeleteMediaFromSearchLib  DeleteMediaFromSearchLibRequest
     * @return DeleteMediaFromSearchLibResponse
     */
    CompletableFuture<DeleteMediaFromSearchLibResponse> deleteMediaFromSearchLib(DeleteMediaFromSearchLibRequest request);

    /**
     * @param request the request parameters of DeleteMediaInfos  DeleteMediaInfosRequest
     * @return DeleteMediaInfosResponse
     */
    CompletableFuture<DeleteMediaInfosResponse> deleteMediaInfos(DeleteMediaInfosRequest request);

    /**
     * @param request the request parameters of DeleteMediaMarks  DeleteMediaMarksRequest
     * @return DeleteMediaMarksResponse
     */
    CompletableFuture<DeleteMediaMarksResponse> deleteMediaMarks(DeleteMediaMarksRequest request);

    /**
     * @param request the request parameters of DeletePipeline  DeletePipelineRequest
     * @return DeletePipelineResponse
     */
    CompletableFuture<DeletePipelineResponse> deletePipeline(DeletePipelineRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to delete multiple media streams at a time.</p>
     * 
     * @param request the request parameters of DeletePlayInfo  DeletePlayInfoRequest
     * @return DeletePlayInfoResponse
     */
    CompletableFuture<DeletePlayInfoResponse> deletePlayInfo(DeletePlayInfoRequest request);

    /**
     * @param request the request parameters of DeleteProgram  DeleteProgramRequest
     * @return DeleteProgramResponse
     */
    CompletableFuture<DeleteProgramResponse> deleteProgram(DeleteProgramRequest request);

    /**
     * @param request the request parameters of DeleteSmartJob  DeleteSmartJobRequest
     * @return DeleteSmartJobResponse
     */
    CompletableFuture<DeleteSmartJobResponse> deleteSmartJob(DeleteSmartJobRequest request);

    /**
     * @param request the request parameters of DeleteSource  DeleteSourceRequest
     * @return DeleteSourceResponse
     */
    CompletableFuture<DeleteSourceResponse> deleteSource(DeleteSourceRequest request);

    /**
     * @param request the request parameters of DeleteSourceLocation  DeleteSourceLocationRequest
     * @return DeleteSourceLocationResponse
     */
    CompletableFuture<DeleteSourceLocationResponse> deleteSourceLocation(DeleteSourceLocationRequest request);

    /**
     * <b>description</b> :
     * <p>A template is an encapsulation of the timeline of a media editing and production job. You can define a common timeline as a template. When you have the same requirements, you need to only specify key parameters and materials to produce videos.</p>
     * <ul>
     * <li>For more information about how to use a regular template, see <a href="https://help.aliyun.com/document_detail/445399.html">Create and use a regular template</a>.</li>
     * <li>For more information about how to use an advanced template, see <a href="https://help.aliyun.com/document_detail/445389.html">Create and use advanced templates</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteTemplate  DeleteTemplateRequest
     * @return DeleteTemplateResponse
     */
    CompletableFuture<DeleteTemplateResponse> deleteTemplate(DeleteTemplateRequest request);

    /**
     * @param request the request parameters of DescribeAIAgentInstance  DescribeAIAgentInstanceRequest
     * @return DescribeAIAgentInstanceResponse
     */
    CompletableFuture<DescribeAIAgentInstanceResponse> describeAIAgentInstance(DescribeAIAgentInstanceRequest request);

    /**
     * @param request the request parameters of DescribeMeterImsEditUsage  DescribeMeterImsEditUsageRequest
     * @return DescribeMeterImsEditUsageResponse
     */
    CompletableFuture<DescribeMeterImsEditUsageResponse> describeMeterImsEditUsage(DescribeMeterImsEditUsageRequest request);

    /**
     * @param request the request parameters of DescribeMeterImsMediaConvertUHDUsage  DescribeMeterImsMediaConvertUHDUsageRequest
     * @return DescribeMeterImsMediaConvertUHDUsageResponse
     */
    CompletableFuture<DescribeMeterImsMediaConvertUHDUsageResponse> describeMeterImsMediaConvertUHDUsage(DescribeMeterImsMediaConvertUHDUsageRequest request);

    /**
     * @param request the request parameters of DescribeMeterImsMediaConvertUsage  DescribeMeterImsMediaConvertUsageRequest
     * @return DescribeMeterImsMediaConvertUsageResponse
     */
    CompletableFuture<DescribeMeterImsMediaConvertUsageResponse> describeMeterImsMediaConvertUsage(DescribeMeterImsMediaConvertUsageRequest request);

    /**
     * @param request the request parameters of DescribeMeterImsMpsAiUsage  DescribeMeterImsMpsAiUsageRequest
     * @return DescribeMeterImsMpsAiUsageResponse
     */
    CompletableFuture<DescribeMeterImsMpsAiUsageResponse> describeMeterImsMpsAiUsage(DescribeMeterImsMpsAiUsageRequest request);

    /**
     * @param request the request parameters of DescribeMeterImsSummary  DescribeMeterImsSummaryRequest
     * @return DescribeMeterImsSummaryResponse
     */
    CompletableFuture<DescribeMeterImsSummaryResponse> describeMeterImsSummary(DescribeMeterImsSummaryRequest request);

    /**
     * @param request the request parameters of DescribeNotifyConfig  DescribeNotifyConfigRequest
     * @return DescribeNotifyConfigResponse
     */
    CompletableFuture<DescribeNotifyConfigResponse> describeNotifyConfig(DescribeNotifyConfigRequest request);

    /**
     * @param request the request parameters of DescribePlayList  DescribePlayListRequest
     * @return DescribePlayListResponse
     */
    CompletableFuture<DescribePlayListResponse> describePlayList(DescribePlayListRequest request);

    /**
     * @param request the request parameters of DescribeRtcRobotInstance  DescribeRtcRobotInstanceRequest
     * @return DescribeRtcRobotInstanceResponse
     */
    CompletableFuture<DescribeRtcRobotInstanceResponse> describeRtcRobotInstance(DescribeRtcRobotInstanceRequest request);

    /**
     * @param request the request parameters of DetectAudioForCustomizedVoiceJob  DetectAudioForCustomizedVoiceJobRequest
     * @return DetectAudioForCustomizedVoiceJobResponse
     */
    CompletableFuture<DetectAudioForCustomizedVoiceJobResponse> detectAudioForCustomizedVoiceJob(DetectAudioForCustomizedVoiceJobRequest request);

    /**
     * @param request the request parameters of DropSearchIndex  DropSearchIndexRequest
     * @return DropSearchIndexResponse
     */
    CompletableFuture<DropSearchIndexResponse> dropSearchIndex(DropSearchIndexRequest request);

    /**
     * @param request the request parameters of DropSearchLib  DropSearchLibRequest
     * @return DropSearchLibResponse
     */
    CompletableFuture<DropSearchLibResponse> dropSearchLib(DropSearchLibRequest request);

    /**
     * @param request the request parameters of GenerateAIAgentCall  GenerateAIAgentCallRequest
     * @return GenerateAIAgentCallResponse
     */
    CompletableFuture<GenerateAIAgentCallResponse> generateAIAgentCall(GenerateAIAgentCallRequest request);

    /**
     * @param request the request parameters of GenerateKMSDataKey  GenerateKMSDataKeyRequest
     * @return GenerateKMSDataKeyResponse
     */
    CompletableFuture<GenerateKMSDataKeyResponse> generateKMSDataKey(GenerateKMSDataKeyRequest request);

    /**
     * @param request the request parameters of GetAvatar  GetAvatarRequest
     * @return GetAvatarResponse
     */
    CompletableFuture<GetAvatarResponse> getAvatar(GetAvatarRequest request);

    /**
     * @param request the request parameters of GetAvatarTrainingJob  GetAvatarTrainingJobRequest
     * @return GetAvatarTrainingJobResponse
     */
    CompletableFuture<GetAvatarTrainingJobResponse> getAvatarTrainingJob(GetAvatarTrainingJobRequest request);

    /**
     * @param request the request parameters of GetBatchMediaProducingJob  GetBatchMediaProducingJobRequest
     * @return GetBatchMediaProducingJobResponse
     */
    CompletableFuture<GetBatchMediaProducingJobResponse> getBatchMediaProducingJob(GetBatchMediaProducingJobRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the information about a category and its subcategories based on the category ID and category type.</p>
     * 
     * @param request the request parameters of GetCategories  GetCategoriesRequest
     * @return GetCategoriesResponse
     */
    CompletableFuture<GetCategoriesResponse> getCategories(GetCategoriesRequest request);

    /**
     * @param request the request parameters of GetChannel  GetChannelRequest
     * @return GetChannelResponse
     */
    CompletableFuture<GetChannelResponse> getChannel(GetChannelRequest request);

    /**
     * @param request the request parameters of GetContentAnalyzeConfig  GetContentAnalyzeConfigRequest
     * @return GetContentAnalyzeConfigResponse
     */
    CompletableFuture<GetContentAnalyzeConfigResponse> getContentAnalyzeConfig(GetContentAnalyzeConfigRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the information about a template with the ID specified by the TemplateId parameter. You can also query the information about the default template. If TemplateId is specified, other parameters are ignored and the template whose ID is specified is queried. If TemplateId is not specified, the default template is queried based on other parameters. In this case, Type is required.
     * Template types:</p>
     * <ol>
     * <li>1: transcoding template.</li>
     * <li>2: snapshot template.</li>
     * <li>3: animated image template.</li>
     * <li>4\. image watermark template.</li>
     * <li>5: text watermark template.</li>
     * <li>6: subtitle template.</li>
     * <li>7: AI-assisted content moderation template.</li>
     * <li>8: AI-assisted intelligent thumbnail template.</li>
     * <li>9: AI-assisted intelligent erasure template.
     * Subtypes of transcoding templates:</li>
     * <li>1 (Normal): regular template.</li>
     * <li>2 (AudioTranscode): audio transcoding template.</li>
     * <li>3 (Remux): container format conversion template.</li>
     * <li>4 (NarrowBandV1): Narrowband HD 1.0 template.</li>
     * <li>5 (NarrowBandV2): Narrowband HD 2.0 template.
     * Subtypes of snapshot templates:</li>
     * <li>1 (Normal): regular template.</li>
     * <li>2 (Sprite): sprite template.</li>
     * <li>3 (WebVtt): WebVTT template.
     * Subtypes of AI-assisted content moderation templates:</li>
     * <li>1 (Video): video moderation template.</li>
     * <li>2 (Audio): audio moderation template.</li>
     * <li>3 (Image): image moderation template.
     * Subtypes of AI-assisted intelligent erasure templates:</li>
     * <li>1 (VideoDelogo): logo erasure template.</li>
     * <li>2 (VideoDetext): subtitle erasure template.</li>
     * </ol>
     * 
     * @param request the request parameters of GetCustomTemplate  GetCustomTemplateRequest
     * @return GetCustomTemplateResponse
     */
    CompletableFuture<GetCustomTemplateResponse> getCustomTemplate(GetCustomTemplateRequest request);

    /**
     * @param request the request parameters of GetCustomizedVoice  GetCustomizedVoiceRequest
     * @return GetCustomizedVoiceResponse
     */
    CompletableFuture<GetCustomizedVoiceResponse> getCustomizedVoice(GetCustomizedVoiceRequest request);

    /**
     * @param request the request parameters of GetCustomizedVoiceJob  GetCustomizedVoiceJobRequest
     * @return GetCustomizedVoiceJobResponse
     */
    CompletableFuture<GetCustomizedVoiceJobResponse> getCustomizedVoiceJob(GetCustomizedVoiceJobRequest request);

    /**
     * @param request the request parameters of GetDefaultStorageLocation  GetDefaultStorageLocationRequest
     * @return GetDefaultStorageLocationResponse
     */
    CompletableFuture<GetDefaultStorageLocationResponse> getDefaultStorageLocation(GetDefaultStorageLocationRequest request);

    /**
     * @param request the request parameters of GetDemonstrationForCustomizedVoiceJob  GetDemonstrationForCustomizedVoiceJobRequest
     * @return GetDemonstrationForCustomizedVoiceJobResponse
     */
    CompletableFuture<GetDemonstrationForCustomizedVoiceJobResponse> getDemonstrationForCustomizedVoiceJob(GetDemonstrationForCustomizedVoiceJobRequest request);

    /**
     * @param request the request parameters of GetDynamicImageJob  GetDynamicImageJobRequest
     * @return GetDynamicImageJobResponse
     */
    CompletableFuture<GetDynamicImageJobResponse> getDynamicImageJob(GetDynamicImageJobRequest request);

    /**
     * @param request the request parameters of GetEditingProject  GetEditingProjectRequest
     * @return GetEditingProjectResponse
     */
    CompletableFuture<GetEditingProjectResponse> getEditingProject(GetEditingProjectRequest request);

    /**
     * @param request the request parameters of GetEditingProjectMaterials  GetEditingProjectMaterialsRequest
     * @return GetEditingProjectMaterialsResponse
     */
    CompletableFuture<GetEditingProjectMaterialsResponse> getEditingProjectMaterials(GetEditingProjectMaterialsRequest request);

    /**
     * @param request the request parameters of GetEventCallback  GetEventCallbackRequest
     * @return GetEventCallbackResponse
     */
    CompletableFuture<GetEventCallbackResponse> getEventCallback(GetEventCallbackRequest request);

    /**
     * @param request the request parameters of GetLiveEditingIndexFile  GetLiveEditingIndexFileRequest
     * @return GetLiveEditingIndexFileResponse
     */
    CompletableFuture<GetLiveEditingIndexFileResponse> getLiveEditingIndexFile(GetLiveEditingIndexFileRequest request);

    /**
     * @param request the request parameters of GetLiveEditingJob  GetLiveEditingJobRequest
     * @return GetLiveEditingJobResponse
     */
    CompletableFuture<GetLiveEditingJobResponse> getLiveEditingJob(GetLiveEditingJobRequest request);

    /**
     * @param request the request parameters of GetLivePackageChannel  GetLivePackageChannelRequest
     * @return GetLivePackageChannelResponse
     */
    CompletableFuture<GetLivePackageChannelResponse> getLivePackageChannel(GetLivePackageChannelRequest request);

    /**
     * @param request the request parameters of GetLivePackageChannelGroup  GetLivePackageChannelGroupRequest
     * @return GetLivePackageChannelGroupResponse
     */
    CompletableFuture<GetLivePackageChannelGroupResponse> getLivePackageChannelGroup(GetLivePackageChannelGroupRequest request);

    /**
     * @param request the request parameters of GetLivePackageOriginEndpoint  GetLivePackageOriginEndpointRequest
     * @return GetLivePackageOriginEndpointResponse
     */
    CompletableFuture<GetLivePackageOriginEndpointResponse> getLivePackageOriginEndpoint(GetLivePackageOriginEndpointRequest request);

    /**
     * @param request the request parameters of GetLiveRecordJob  GetLiveRecordJobRequest
     * @return GetLiveRecordJobResponse
     */
    CompletableFuture<GetLiveRecordJobResponse> getLiveRecordJob(GetLiveRecordJobRequest request);

    /**
     * @param request the request parameters of GetLiveRecordTemplate  GetLiveRecordTemplateRequest
     * @return GetLiveRecordTemplateResponse
     */
    CompletableFuture<GetLiveRecordTemplateResponse> getLiveRecordTemplate(GetLiveRecordTemplateRequest request);

    /**
     * @param request the request parameters of GetLiveSnapshotJob  GetLiveSnapshotJobRequest
     * @return GetLiveSnapshotJobResponse
     */
    CompletableFuture<GetLiveSnapshotJobResponse> getLiveSnapshotJob(GetLiveSnapshotJobRequest request);

    /**
     * @param request the request parameters of GetLiveSnapshotTemplate  GetLiveSnapshotTemplateRequest
     * @return GetLiveSnapshotTemplateResponse
     */
    CompletableFuture<GetLiveSnapshotTemplateResponse> getLiveSnapshotTemplate(GetLiveSnapshotTemplateRequest request);

    /**
     * @param request the request parameters of GetLiveTranscodeJob  GetLiveTranscodeJobRequest
     * @return GetLiveTranscodeJobResponse
     */
    CompletableFuture<GetLiveTranscodeJobResponse> getLiveTranscodeJob(GetLiveTranscodeJobRequest request);

    /**
     * @param request the request parameters of GetLiveTranscodeTemplate  GetLiveTranscodeTemplateRequest
     * @return GetLiveTranscodeTemplateResponse
     */
    CompletableFuture<GetLiveTranscodeTemplateResponse> getLiveTranscodeTemplate(GetLiveTranscodeTemplateRequest request);

    /**
     * @param request the request parameters of GetMediaConnectFlow  GetMediaConnectFlowRequest
     * @return GetMediaConnectFlowResponse
     */
    CompletableFuture<GetMediaConnectFlowResponse> getMediaConnectFlow(GetMediaConnectFlowRequest request);

    /**
     * @param request the request parameters of GetMediaConvertJob  GetMediaConvertJobRequest
     * @return GetMediaConvertJobResponse
     */
    CompletableFuture<GetMediaConvertJobResponse> getMediaConvertJob(GetMediaConvertJobRequest request);

    /**
     * <b>description</b> :
     * <p>If the MediaId parameter is specified, the MediaId parameter is preferentially used for the query. If the MediaId parameter is left empty, the InputURL parameter must be specified.</p>
     * 
     * @param request the request parameters of GetMediaInfo  GetMediaInfoRequest
     * @return GetMediaInfoResponse
     */
    CompletableFuture<GetMediaInfoResponse> getMediaInfo(GetMediaInfoRequest request);

    /**
     * @param request the request parameters of GetMediaInfoJob  GetMediaInfoJobRequest
     * @return GetMediaInfoJobResponse
     */
    CompletableFuture<GetMediaInfoJobResponse> getMediaInfoJob(GetMediaInfoJobRequest request);

    /**
     * @param request the request parameters of GetMediaMarks  GetMediaMarksRequest
     * @return GetMediaMarksResponse
     */
    CompletableFuture<GetMediaMarksResponse> getMediaMarks(GetMediaMarksRequest request);

    /**
     * @param request the request parameters of GetMediaProducingJob  GetMediaProducingJobRequest
     * @return GetMediaProducingJobResponse
     */
    CompletableFuture<GetMediaProducingJobResponse> getMediaProducingJob(GetMediaProducingJobRequest request);

    /**
     * @param request the request parameters of GetPackageJob  GetPackageJobRequest
     * @return GetPackageJobResponse
     */
    CompletableFuture<GetPackageJobResponse> getPackageJob(GetPackageJobRequest request);

    /**
     * @param request the request parameters of GetPipeline  GetPipelineRequest
     * @return GetPipelineResponse
     */
    CompletableFuture<GetPipelineResponse> getPipeline(GetPipelineRequest request);

    /**
     * <b>description</b> :
     * <p>You use the ID of a video or audio file to query the playback URL of the file. Then, you can use the playback URL to play the audio or video in ApsaraVideo Player SDK (for URL-based playback) or a third-party player.</p>
     * 
     * @param request the request parameters of GetPlayInfo  GetPlayInfoRequest
     * @return GetPlayInfoResponse
     */
    CompletableFuture<GetPlayInfoResponse> getPlayInfo(GetPlayInfoRequest request);

    /**
     * @param request the request parameters of GetProgram  GetProgramRequest
     * @return GetProgramResponse
     */
    CompletableFuture<GetProgramResponse> getProgram(GetProgramRequest request);

    /**
     * @param request the request parameters of GetProjectExportJob  GetProjectExportJobRequest
     * @return GetProjectExportJobResponse
     */
    CompletableFuture<GetProjectExportJobResponse> getProjectExportJob(GetProjectExportJobRequest request);

    /**
     * @param request the request parameters of GetPublicMediaInfo  GetPublicMediaInfoRequest
     * @return GetPublicMediaInfoResponse
     */
    CompletableFuture<GetPublicMediaInfoResponse> getPublicMediaInfo(GetPublicMediaInfoRequest request);

    /**
     * @param request the request parameters of GetSmartHandleJob  GetSmartHandleJobRequest
     * @return GetSmartHandleJobResponse
     */
    CompletableFuture<GetSmartHandleJobResponse> getSmartHandleJob(GetSmartHandleJobRequest request);

    /**
     * @param request the request parameters of GetSnapshotJob  GetSnapshotJobRequest
     * @return GetSnapshotJobResponse
     */
    CompletableFuture<GetSnapshotJobResponse> getSnapshotJob(GetSnapshotJobRequest request);

    /**
     * @param request the request parameters of GetSnapshotUrls  GetSnapshotUrlsRequest
     * @return GetSnapshotUrlsResponse
     */
    CompletableFuture<GetSnapshotUrlsResponse> getSnapshotUrls(GetSnapshotUrlsRequest request);

    /**
     * @param request the request parameters of GetSource  GetSourceRequest
     * @return GetSourceResponse
     */
    CompletableFuture<GetSourceResponse> getSource(GetSourceRequest request);

    /**
     * @param request the request parameters of GetSourceLocation  GetSourceLocationRequest
     * @return GetSourceLocationResponse
     */
    CompletableFuture<GetSourceLocationResponse> getSourceLocation(GetSourceLocationRequest request);

    /**
     * @param request the request parameters of GetStorageList  GetStorageListRequest
     * @return GetStorageListResponse
     */
    CompletableFuture<GetStorageListResponse> getStorageList(GetStorageListRequest request);

    /**
     * @param request the request parameters of GetSystemTemplate  GetSystemTemplateRequest
     * @return GetSystemTemplateResponse
     */
    CompletableFuture<GetSystemTemplateResponse> getSystemTemplate(GetSystemTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>A template is an encapsulation of the timeline of a media editing and production job. You can define a common timeline as a template. When you have the same requirements, you need to only specify key parameters and materials to produce videos.</p>
     * <ul>
     * <li>For more information about how to use a regular template, see <a href="https://help.aliyun.com/document_detail/445399.html">Create and use a regular template</a>.</li>
     * <li>For more information about how to use an advanced template, see <a href="https://help.aliyun.com/document_detail/445389.html">Create and use advanced templates</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of GetTemplate  GetTemplateRequest
     * @return GetTemplateResponse
     */
    CompletableFuture<GetTemplateResponse> getTemplate(GetTemplateRequest request);

    /**
     * @param request the request parameters of GetTemplateMaterials  GetTemplateMaterialsRequest
     * @return GetTemplateMaterialsResponse
     */
    CompletableFuture<GetTemplateMaterialsResponse> getTemplateMaterials(GetTemplateMaterialsRequest request);

    /**
     * @param request the request parameters of GetTemplateParams  GetTemplateParamsRequest
     * @return GetTemplateParamsResponse
     */
    CompletableFuture<GetTemplateParamsResponse> getTemplateParams(GetTemplateParamsRequest request);

    /**
     * @param request the request parameters of GetTranscodeJob  GetTranscodeJobRequest
     * @return GetTranscodeJobResponse
     */
    CompletableFuture<GetTranscodeJobResponse> getTranscodeJob(GetTranscodeJobRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the information, including the upload status, user data, creation time, and completion time, about URL-based upload jobs based on the returned job IDs or the URLs used during the upload.
     * If an upload job fails, you can view the error code and error message. If an upload job is successful, you can obtain the video ID.</p>
     * 
     * @param request the request parameters of GetUrlUploadInfos  GetUrlUploadInfosRequest
     * @return GetUrlUploadInfosResponse
     */
    CompletableFuture<GetUrlUploadInfosResponse> getUrlUploadInfos(GetUrlUploadInfosRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query information about up to the first 5,000 audio and video files based on the filter condition, such as the status or category ID of the file. We recommend that you set the StartTime and EndTime parameters to narrow down the time range and perform multiple queries to obtain data.</p>
     * 
     * @param request the request parameters of GetVideoList  GetVideoListRequest
     * @return GetVideoListResponse
     */
    CompletableFuture<GetVideoListResponse> getVideoList(GetVideoListRequest request);

    /**
     * @param request the request parameters of GetWorkflowTask  GetWorkflowTaskRequest
     * @return GetWorkflowTaskResponse
     */
    CompletableFuture<GetWorkflowTaskResponse> getWorkflowTask(GetWorkflowTaskRequest request);

    /**
     * @param request the request parameters of InsertMediaToSearchLib  InsertMediaToSearchLibRequest
     * @return InsertMediaToSearchLibResponse
     */
    CompletableFuture<InsertMediaToSearchLibResponse> insertMediaToSearchLib(InsertMediaToSearchLibRequest request);

    /**
     * @param request the request parameters of ListAIAgentInstance  ListAIAgentInstanceRequest
     * @return ListAIAgentInstanceResponse
     */
    CompletableFuture<ListAIAgentInstanceResponse> listAIAgentInstance(ListAIAgentInstanceRequest request);

    /**
     * @param request the request parameters of ListAlerts  ListAlertsRequest
     * @return ListAlertsResponse
     */
    CompletableFuture<ListAlertsResponse> listAlerts(ListAlertsRequest request);

    /**
     * @param request the request parameters of ListAllPublicMediaTags  ListAllPublicMediaTagsRequest
     * @return ListAllPublicMediaTagsResponse
     */
    CompletableFuture<ListAllPublicMediaTagsResponse> listAllPublicMediaTags(ListAllPublicMediaTagsRequest request);

    /**
     * @param request the request parameters of ListAvatarTrainingJobs  ListAvatarTrainingJobsRequest
     * @return ListAvatarTrainingJobsResponse
     */
    CompletableFuture<ListAvatarTrainingJobsResponse> listAvatarTrainingJobs(ListAvatarTrainingJobsRequest request);

    /**
     * @param request the request parameters of ListAvatars  ListAvatarsRequest
     * @return ListAvatarsResponse
     */
    CompletableFuture<ListAvatarsResponse> listAvatars(ListAvatarsRequest request);

    /**
     * @param request the request parameters of ListBatchMediaProducingJobs  ListBatchMediaProducingJobsRequest
     * @return ListBatchMediaProducingJobsResponse
     */
    CompletableFuture<ListBatchMediaProducingJobsResponse> listBatchMediaProducingJobs(ListBatchMediaProducingJobsRequest request);

    /**
     * @param request the request parameters of ListChannelAlerts  ListChannelAlertsRequest
     * @return ListChannelAlertsResponse
     */
    CompletableFuture<ListChannelAlertsResponse> listChannelAlerts(ListChannelAlertsRequest request);

    /**
     * @param request the request parameters of ListChannels  ListChannelsRequest
     * @return ListChannelsResponse
     */
    CompletableFuture<ListChannelsResponse> listChannels(ListChannelsRequest request);

    /**
     * @param request the request parameters of ListCustomTemplates  ListCustomTemplatesRequest
     * @return ListCustomTemplatesResponse
     */
    CompletableFuture<ListCustomTemplatesResponse> listCustomTemplates(ListCustomTemplatesRequest request);

    /**
     * @param request the request parameters of ListCustomizedVoiceJobs  ListCustomizedVoiceJobsRequest
     * @return ListCustomizedVoiceJobsResponse
     */
    CompletableFuture<ListCustomizedVoiceJobsResponse> listCustomizedVoiceJobs(ListCustomizedVoiceJobsRequest request);

    /**
     * @param request the request parameters of ListCustomizedVoices  ListCustomizedVoicesRequest
     * @return ListCustomizedVoicesResponse
     */
    CompletableFuture<ListCustomizedVoicesResponse> listCustomizedVoices(ListCustomizedVoicesRequest request);

    /**
     * @param request the request parameters of ListDNADB  ListDNADBRequest
     * @return ListDNADBResponse
     */
    CompletableFuture<ListDNADBResponse> listDNADB(ListDNADBRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query files in a media fingerprint library based on the library ID. The queried results can be paginated.</p>
     * 
     * @param request the request parameters of ListDNAFiles  ListDNAFilesRequest
     * @return ListDNAFilesResponse
     */
    CompletableFuture<ListDNAFilesResponse> listDNAFiles(ListDNAFilesRequest request);

    /**
     * @param request the request parameters of ListDynamicImageJobs  ListDynamicImageJobsRequest
     * @return ListDynamicImageJobsResponse
     */
    CompletableFuture<ListDynamicImageJobsResponse> listDynamicImageJobs(ListDynamicImageJobsRequest request);

    /**
     * @param request the request parameters of ListEditingProjects  ListEditingProjectsRequest
     * @return ListEditingProjectsResponse
     */
    CompletableFuture<ListEditingProjectsResponse> listEditingProjects(ListEditingProjectsRequest request);

    /**
     * @param request the request parameters of ListLivePackageChannelGroups  ListLivePackageChannelGroupsRequest
     * @return ListLivePackageChannelGroupsResponse
     */
    CompletableFuture<ListLivePackageChannelGroupsResponse> listLivePackageChannelGroups(ListLivePackageChannelGroupsRequest request);

    /**
     * @param request the request parameters of ListLivePackageChannels  ListLivePackageChannelsRequest
     * @return ListLivePackageChannelsResponse
     */
    CompletableFuture<ListLivePackageChannelsResponse> listLivePackageChannels(ListLivePackageChannelsRequest request);

    /**
     * @param request the request parameters of ListLivePackageOriginEndpoints  ListLivePackageOriginEndpointsRequest
     * @return ListLivePackageOriginEndpointsResponse
     */
    CompletableFuture<ListLivePackageOriginEndpointsResponse> listLivePackageOriginEndpoints(ListLivePackageOriginEndpointsRequest request);

    /**
     * @param request the request parameters of ListLiveRecordFiles  ListLiveRecordFilesRequest
     * @return ListLiveRecordFilesResponse
     */
    CompletableFuture<ListLiveRecordFilesResponse> listLiveRecordFiles(ListLiveRecordFilesRequest request);

    /**
     * @param request the request parameters of ListLiveRecordJobs  ListLiveRecordJobsRequest
     * @return ListLiveRecordJobsResponse
     */
    CompletableFuture<ListLiveRecordJobsResponse> listLiveRecordJobs(ListLiveRecordJobsRequest request);

    /**
     * @param request the request parameters of ListLiveRecordTemplates  ListLiveRecordTemplatesRequest
     * @return ListLiveRecordTemplatesResponse
     */
    CompletableFuture<ListLiveRecordTemplatesResponse> listLiveRecordTemplates(ListLiveRecordTemplatesRequest request);

    /**
     * @param request the request parameters of ListLiveSnapshotFiles  ListLiveSnapshotFilesRequest
     * @return ListLiveSnapshotFilesResponse
     */
    CompletableFuture<ListLiveSnapshotFilesResponse> listLiveSnapshotFiles(ListLiveSnapshotFilesRequest request);

    /**
     * @param request the request parameters of ListLiveSnapshotJobs  ListLiveSnapshotJobsRequest
     * @return ListLiveSnapshotJobsResponse
     */
    CompletableFuture<ListLiveSnapshotJobsResponse> listLiveSnapshotJobs(ListLiveSnapshotJobsRequest request);

    /**
     * @param request the request parameters of ListLiveSnapshotTemplates  ListLiveSnapshotTemplatesRequest
     * @return ListLiveSnapshotTemplatesResponse
     */
    CompletableFuture<ListLiveSnapshotTemplatesResponse> listLiveSnapshotTemplates(ListLiveSnapshotTemplatesRequest request);

    /**
     * @param request the request parameters of ListLiveTranscodeJobs  ListLiveTranscodeJobsRequest
     * @return ListLiveTranscodeJobsResponse
     */
    CompletableFuture<ListLiveTranscodeJobsResponse> listLiveTranscodeJobs(ListLiveTranscodeJobsRequest request);

    /**
     * @param request the request parameters of ListLiveTranscodeTemplates  ListLiveTranscodeTemplatesRequest
     * @return ListLiveTranscodeTemplatesResponse
     */
    CompletableFuture<ListLiveTranscodeTemplatesResponse> listLiveTranscodeTemplates(ListLiveTranscodeTemplatesRequest request);

    /**
     * <b>description</b> :
     * <p>If includeFileBasicInfo is set to true, the basic information, such as the duration and file size, of the source file is also returned. At most the first 100 entries that meet the specified conditions are returned. All media assets must exactly match all non-empty fields. The fields that support exact match include MediaType, Source, BusinessType, Category, and Status. If all information cannot be returned at a time, you can use NextToken to initiate a request to retrieve a new page of results.</p>
     * 
     * @param request the request parameters of ListMediaBasicInfos  ListMediaBasicInfosRequest
     * @return ListMediaBasicInfosResponse
     */
    CompletableFuture<ListMediaBasicInfosResponse> listMediaBasicInfos(ListMediaBasicInfosRequest request);

    /**
     * @param request the request parameters of ListMediaInfoJobs  ListMediaInfoJobsRequest
     * @return ListMediaInfoJobsResponse
     */
    CompletableFuture<ListMediaInfoJobsResponse> listMediaInfoJobs(ListMediaInfoJobsRequest request);

    /**
     * @param request the request parameters of ListMediaMarks  ListMediaMarksRequest
     * @return ListMediaMarksResponse
     */
    CompletableFuture<ListMediaMarksResponse> listMediaMarks(ListMediaMarksRequest request);

    /**
     * @param request the request parameters of ListMediaProducingJobs  ListMediaProducingJobsRequest
     * @return ListMediaProducingJobsResponse
     */
    CompletableFuture<ListMediaProducingJobsResponse> listMediaProducingJobs(ListMediaProducingJobsRequest request);

    /**
     * @param request the request parameters of ListPackageJobs  ListPackageJobsRequest
     * @return ListPackageJobsResponse
     */
    CompletableFuture<ListPackageJobsResponse> listPackageJobs(ListPackageJobsRequest request);

    /**
     * @param request the request parameters of ListPipelines  ListPipelinesRequest
     * @return ListPipelinesResponse
     */
    CompletableFuture<ListPipelinesResponse> listPipelines(ListPipelinesRequest request);

    /**
     * @param request the request parameters of ListPrograms  ListProgramsRequest
     * @return ListProgramsResponse
     */
    CompletableFuture<ListProgramsResponse> listPrograms(ListProgramsRequest request);

    /**
     * @param request the request parameters of ListPublicMediaBasicInfos  ListPublicMediaBasicInfosRequest
     * @return ListPublicMediaBasicInfosResponse
     */
    CompletableFuture<ListPublicMediaBasicInfosResponse> listPublicMediaBasicInfos(ListPublicMediaBasicInfosRequest request);

    /**
     * @param request the request parameters of ListSchedules  ListSchedulesRequest
     * @return ListSchedulesResponse
     */
    CompletableFuture<ListSchedulesResponse> listSchedules(ListSchedulesRequest request);

    /**
     * @param request the request parameters of ListSearchLib  ListSearchLibRequest
     * @return ListSearchLibResponse
     */
    CompletableFuture<ListSearchLibResponse> listSearchLib(ListSearchLibRequest request);

    /**
     * @param request the request parameters of ListSmartJobs  ListSmartJobsRequest
     * @return ListSmartJobsResponse
     */
    CompletableFuture<ListSmartJobsResponse> listSmartJobs(ListSmartJobsRequest request);

    /**
     * @param request the request parameters of ListSmartSysAvatarModels  ListSmartSysAvatarModelsRequest
     * @return ListSmartSysAvatarModelsResponse
     */
    CompletableFuture<ListSmartSysAvatarModelsResponse> listSmartSysAvatarModels(ListSmartSysAvatarModelsRequest request);

    /**
     * @param request the request parameters of ListSmartVoiceGroups  ListSmartVoiceGroupsRequest
     * @return ListSmartVoiceGroupsResponse
     */
    CompletableFuture<ListSmartVoiceGroupsResponse> listSmartVoiceGroups(ListSmartVoiceGroupsRequest request);

    /**
     * @param request the request parameters of ListSnapshotJobs  ListSnapshotJobsRequest
     * @return ListSnapshotJobsResponse
     */
    CompletableFuture<ListSnapshotJobsResponse> listSnapshotJobs(ListSnapshotJobsRequest request);

    /**
     * @param request the request parameters of ListSourceLocations  ListSourceLocationsRequest
     * @return ListSourceLocationsResponse
     */
    CompletableFuture<ListSourceLocationsResponse> listSourceLocations(ListSourceLocationsRequest request);

    /**
     * @param request the request parameters of ListSources  ListSourcesRequest
     * @return ListSourcesResponse
     */
    CompletableFuture<ListSourcesResponse> listSources(ListSourcesRequest request);

    /**
     * <b>description</b> :
     * <p>Template types:</p>
     * <ol>
     * <li>1: transcoding template.</li>
     * <li>2: snapshot template.</li>
     * <li>3: animated image template.</li>
     * <li>4\. image watermark template.</li>
     * <li>5: text watermark template.</li>
     * <li>6: subtitle template.</li>
     * <li>7: AI-assisted content moderation template.</li>
     * <li>8: AI-assisted intelligent thumbnail template.</li>
     * <li>9: AI-assisted intelligent erasure template.
     * Subtypes of transcoding templates:</li>
     * <li>1 (Normal): regular template.</li>
     * <li>2 (AudioTranscode): audio transcoding template.</li>
     * <li>3 (Remux): container format conversion template.</li>
     * <li>4 (NarrowBandV1): Narrowband HD 1.0 template.</li>
     * <li>5 (NarrowBandV2): Narrowband HD 2.0 template.
     * Subtypes of snapshot templates:</li>
     * <li>1 (Normal): regular template.</li>
     * <li>2 (Sprite): sprite template.</li>
     * <li>3 (WebVtt): WebVTT template.
     * Subtypes of AI-assisted content moderation templates:</li>
     * <li>1 (Video): video moderation template.</li>
     * <li>2 (Audio): audio moderation template.</li>
     * <li>3 (Image): image moderation template.
     * Subtypes of AI-assisted intelligent erasure templates:</li>
     * <li>1 (VideoDelogo): logo erasure template.</li>
     * <li>2 (VideoDetext): subtitle erasure template.</li>
     * </ol>
     * 
     * @param request the request parameters of ListSystemTemplates  ListSystemTemplatesRequest
     * @return ListSystemTemplatesResponse
     */
    CompletableFuture<ListSystemTemplatesResponse> listSystemTemplates(ListSystemTemplatesRequest request);

    /**
     * <b>description</b> :
     * <p>A template is an encapsulation of the timeline of a media editing and production job. You can define a common timeline as a template. When you have the same requirements, you need to only specify key parameters and materials to produce videos.</p>
     * <ul>
     * <li>For more information about how to use a regular template, see <a href="https://help.aliyun.com/document_detail/445399.html">Create and use a regular template</a>.</li>
     * <li>For more information about how to use an advanced template, see <a href="https://help.aliyun.com/document_detail/445389.html">Create and use advanced templates</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ListTemplates  ListTemplatesRequest
     * @return ListTemplatesResponse
     */
    CompletableFuture<ListTemplatesResponse> listTemplates(ListTemplatesRequest request);

    /**
     * @param request the request parameters of ListTranscodeJobs  ListTranscodeJobsRequest
     * @return ListTranscodeJobsResponse
     */
    CompletableFuture<ListTranscodeJobsResponse> listTranscodeJobs(ListTranscodeJobsRequest request);

    /**
     * @param request the request parameters of QueryCopyrightExtractJob  QueryCopyrightExtractJobRequest
     * @return QueryCopyrightExtractJobResponse
     */
    CompletableFuture<QueryCopyrightExtractJobResponse> queryCopyrightExtractJob(QueryCopyrightExtractJobRequest request);

    /**
     * @param request the request parameters of QueryCopyrightJobList  QueryCopyrightJobListRequest
     * @return QueryCopyrightJobListResponse
     */
    CompletableFuture<QueryCopyrightJobListResponse> queryCopyrightJobList(QueryCopyrightJobListRequest request);

    /**
     * @param request the request parameters of QueryDNAJobList  QueryDNAJobListRequest
     * @return QueryDNAJobListResponse
     */
    CompletableFuture<QueryDNAJobListResponse> queryDNAJobList(QueryDNAJobListRequest request);

    /**
     * @param request the request parameters of QueryIProductionJob  QueryIProductionJobRequest
     * @return QueryIProductionJobResponse
     */
    CompletableFuture<QueryIProductionJobResponse> queryIProductionJob(QueryIProductionJobRequest request);

    /**
     * <b>description</b> :
     * <p>In the content moderation results, the moderation results of the video are sorted in ascending order by time into a timeline. If the video is long, the content moderation results are paginated, and the first page is returned. You can call this operation again to query the remaining moderation results of the video.</p>
     * 
     * @param request the request parameters of QueryMediaCensorJobDetail  QueryMediaCensorJobDetailRequest
     * @return QueryMediaCensorJobDetailResponse
     */
    CompletableFuture<QueryMediaCensorJobDetailResponse> queryMediaCensorJobDetail(QueryMediaCensorJobDetailRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query only the content moderation jobs within the most recent three months.</p>
     * 
     * @param request the request parameters of QueryMediaCensorJobList  QueryMediaCensorJobListRequest
     * @return QueryMediaCensorJobListResponse
     */
    CompletableFuture<QueryMediaCensorJobListResponse> queryMediaCensorJobList(QueryMediaCensorJobListRequest request);

    /**
     * @param request the request parameters of QueryMediaIndexJob  QueryMediaIndexJobRequest
     * @return QueryMediaIndexJobResponse
     */
    CompletableFuture<QueryMediaIndexJobResponse> queryMediaIndexJob(QueryMediaIndexJobRequest request);

    /**
     * @param request the request parameters of QuerySearchIndex  QuerySearchIndexRequest
     * @return QuerySearchIndexResponse
     */
    CompletableFuture<QuerySearchIndexResponse> querySearchIndex(QuerySearchIndexRequest request);

    /**
     * @param request the request parameters of QuerySearchLib  QuerySearchLibRequest
     * @return QuerySearchLibResponse
     */
    CompletableFuture<QuerySearchLibResponse> querySearchLib(QuerySearchLibRequest request);

    /**
     * @param request the request parameters of QuerySmarttagJob  QuerySmarttagJobRequest
     * @return QuerySmarttagJobResponse
     */
    CompletableFuture<QuerySmarttagJobResponse> querySmarttagJob(QuerySmarttagJobRequest request);

    /**
     * @param request the request parameters of QueryTraceAbJobList  QueryTraceAbJobListRequest
     * @return QueryTraceAbJobListResponse
     */
    CompletableFuture<QueryTraceAbJobListResponse> queryTraceAbJobList(QueryTraceAbJobListRequest request);

    /**
     * @param request the request parameters of QueryTraceExtractJob  QueryTraceExtractJobRequest
     * @return QueryTraceExtractJobResponse
     */
    CompletableFuture<QueryTraceExtractJobResponse> queryTraceExtractJob(QueryTraceExtractJobRequest request);

    /**
     * @param request the request parameters of QueryTraceM3u8JobList  QueryTraceM3u8JobListRequest
     * @return QueryTraceM3u8JobListResponse
     */
    CompletableFuture<QueryTraceM3u8JobListResponse> queryTraceM3u8JobList(QueryTraceM3u8JobListRequest request);

    /**
     * <b>description</b> :
     * <p>You can also call this operation to overwrite media files. After you obtain the upload URL of a media file, you can upload the media file again without changing the audio or video ID.</p>
     * 
     * @param request the request parameters of RefreshUploadMedia  RefreshUploadMediaRequest
     * @return RefreshUploadMediaResponse
     */
    CompletableFuture<RefreshUploadMediaResponse> refreshUploadMedia(RefreshUploadMediaRequest request);

    /**
     * <b>description</b> :
     * <p>Registering a media asset is an asynchronous job that takes 2 to 3 seconds. When the operation returns the ID of the media asset, the registration may have not be completed. If you call the GetMediaInfo operation at this time, you may fail to obtain the information about the media asset.</p>
     * 
     * @param request the request parameters of RegisterMediaInfo  RegisterMediaInfoRequest
     * @return RegisterMediaInfoResponse
     */
    CompletableFuture<RegisterMediaInfoResponse> registerMediaInfo(RegisterMediaInfoRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to register a media stream file in an Object Storage Service (OSS) bucket with Intelligent Media Services (IMS) and associate the media stream with the specified media asset ID.</p>
     * 
     * @param request the request parameters of RegisterMediaStream  RegisterMediaStreamRequest
     * @return RegisterMediaStreamResponse
     */
    CompletableFuture<RegisterMediaStreamResponse> registerMediaStream(RegisterMediaStreamRequest request);

    /**
     * @param request the request parameters of SearchEditingProject  SearchEditingProjectRequest
     * @return SearchEditingProjectResponse
     */
    CompletableFuture<SearchEditingProjectResponse> searchEditingProject(SearchEditingProjectRequest request);

    /**
     * @param request the request parameters of SearchIndexJobRerun  SearchIndexJobRerunRequest
     * @return SearchIndexJobRerunResponse
     */
    CompletableFuture<SearchIndexJobRerunResponse> searchIndexJobRerun(SearchIndexJobRerunRequest request);

    /**
     * <b>description</b> :
     * <p>If you have questions about how to use the media asset search feature in Intelligent Media Services (IMS), contact technical support in the DingTalk group (ID 30415005038).</p>
     * 
     * @param request the request parameters of SearchMedia  SearchMediaRequest
     * @return SearchMediaResponse
     */
    CompletableFuture<SearchMediaResponse> searchMedia(SearchMediaRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query media assets or media asset clips based on character names, subtitles, or AI categories.</p>
     * 
     * @param request the request parameters of SearchMediaByAILabel  SearchMediaByAILabelRequest
     * @return SearchMediaByAILabelResponse
     */
    CompletableFuture<SearchMediaByAILabelResponse> searchMediaByAILabel(SearchMediaByAILabelRequest request);

    /**
     * <b>description</b> :
     * <p>If you have questions about how to use the media asset search feature in Intelligent Media Services (IMS), contact technical support in the DingTalk group (ID 30415005038).</p>
     * 
     * @param request the request parameters of SearchMediaByFace  SearchMediaByFaceRequest
     * @return SearchMediaByFaceResponse
     */
    CompletableFuture<SearchMediaByFaceResponse> searchMediaByFace(SearchMediaByFaceRequest request);

    /**
     * @param request the request parameters of SearchMediaByHybrid  SearchMediaByHybridRequest
     * @return SearchMediaByHybridResponse
     */
    CompletableFuture<SearchMediaByHybridResponse> searchMediaByHybrid(SearchMediaByHybridRequest request);

    /**
     * <b>description</b> :
     * <p>If you have questions about how to use the media asset search feature in Intelligent Media Services (IMS), contact technical support in the DingTalk group (ID 30415005038).</p>
     * 
     * @param request the request parameters of SearchMediaByMultimodal  SearchMediaByMultimodalRequest
     * @return SearchMediaByMultimodalResponse
     */
    CompletableFuture<SearchMediaByMultimodalResponse> searchMediaByMultimodal(SearchMediaByMultimodalRequest request);

    /**
     * <b>description</b> :
     * <p>If you have questions about how to use the media asset search feature in Intelligent Media Services (IMS), contact technical support in the DingTalk group (ID 30415005038).</p>
     * 
     * @param request the request parameters of SearchMediaClipByFace  SearchMediaClipByFaceRequest
     * @return SearchMediaClipByFaceResponse
     */
    CompletableFuture<SearchMediaClipByFaceResponse> searchMediaClipByFace(SearchMediaClipByFaceRequest request);

    /**
     * @param request the request parameters of SearchPublicMediaInfo  SearchPublicMediaInfoRequest
     * @return SearchPublicMediaInfoResponse
     */
    CompletableFuture<SearchPublicMediaInfoResponse> searchPublicMediaInfo(SearchPublicMediaInfoRequest request);

    /**
     * @param request the request parameters of SendAIAgentDataChannelMessage  SendAIAgentDataChannelMessageRequest
     * @return SendAIAgentDataChannelMessageResponse
     */
    CompletableFuture<SendAIAgentDataChannelMessageResponse> sendAIAgentDataChannelMessage(SendAIAgentDataChannelMessageRequest request);

    /**
     * @param request the request parameters of SendAIAgentSpeech  SendAIAgentSpeechRequest
     * @return SendAIAgentSpeechResponse
     */
    CompletableFuture<SendAIAgentSpeechResponse> sendAIAgentSpeech(SendAIAgentSpeechRequest request);

    /**
     * @param request the request parameters of SendLiveSnapshotJobCommand  SendLiveSnapshotJobCommandRequest
     * @return SendLiveSnapshotJobCommandResponse
     */
    CompletableFuture<SendLiveSnapshotJobCommandResponse> sendLiveSnapshotJobCommand(SendLiveSnapshotJobCommandRequest request);

    /**
     * @param request the request parameters of SendLiveTranscodeJobCommand  SendLiveTranscodeJobCommandRequest
     * @return SendLiveTranscodeJobCommandResponse
     */
    CompletableFuture<SendLiveTranscodeJobCommandResponse> sendLiveTranscodeJobCommand(SendLiveTranscodeJobCommandRequest request);

    /**
     * @param request the request parameters of SetContentAnalyzeConfig  SetContentAnalyzeConfigRequest
     * @return SetContentAnalyzeConfigResponse
     */
    CompletableFuture<SetContentAnalyzeConfigResponse> setContentAnalyzeConfig(SetContentAnalyzeConfigRequest request);

    /**
     * @param request the request parameters of SetDefaultCustomTemplate  SetDefaultCustomTemplateRequest
     * @return SetDefaultCustomTemplateResponse
     */
    CompletableFuture<SetDefaultCustomTemplateResponse> setDefaultCustomTemplate(SetDefaultCustomTemplateRequest request);

    /**
     * @param request the request parameters of SetDefaultStorageLocation  SetDefaultStorageLocationRequest
     * @return SetDefaultStorageLocationResponse
     */
    CompletableFuture<SetDefaultStorageLocationResponse> setDefaultStorageLocation(SetDefaultStorageLocationRequest request);

    /**
     * @param request the request parameters of SetEventCallback  SetEventCallbackRequest
     * @return SetEventCallbackResponse
     */
    CompletableFuture<SetEventCallbackResponse> setEventCallback(SetEventCallbackRequest request);

    /**
     * @param request the request parameters of SetNotifyConfig  SetNotifyConfigRequest
     * @return SetNotifyConfigResponse
     */
    CompletableFuture<SetNotifyConfigResponse> setNotifyConfig(SetNotifyConfigRequest request);

    /**
     * @param request the request parameters of StartAIAgentInstance  StartAIAgentInstanceRequest
     * @return StartAIAgentInstanceResponse
     */
    CompletableFuture<StartAIAgentInstanceResponse> startAIAgentInstance(StartAIAgentInstanceRequest request);

    /**
     * @param request the request parameters of StartChannel  StartChannelRequest
     * @return StartChannelResponse
     */
    CompletableFuture<StartChannelResponse> startChannel(StartChannelRequest request);

    /**
     * @param request the request parameters of StartRtcRobotInstance  StartRtcRobotInstanceRequest
     * @return StartRtcRobotInstanceResponse
     */
    CompletableFuture<StartRtcRobotInstanceResponse> startRtcRobotInstance(StartRtcRobotInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>  Only media assets from Intelligent Media Services (IMS) or ApsaraVideo VOD can be used as the input of a workflow.</p>
     * <ul>
     * <li>When you submit a workflow task, you must specify a workflow template. You can create a workflow template in the <a href="https://ims.console.aliyun.com/settings/workflow/list">IMS console</a> or use a preset workflow template.</li>
     * </ul>
     * 
     * @param request the request parameters of StartWorkflow  StartWorkflowRequest
     * @return StartWorkflowResponse
     */
    CompletableFuture<StartWorkflowResponse> startWorkflow(StartWorkflowRequest request);

    /**
     * @param request the request parameters of StopAIAgentInstance  StopAIAgentInstanceRequest
     * @return StopAIAgentInstanceResponse
     */
    CompletableFuture<StopAIAgentInstanceResponse> stopAIAgentInstance(StopAIAgentInstanceRequest request);

    /**
     * @param request the request parameters of StopChannel  StopChannelRequest
     * @return StopChannelResponse
     */
    CompletableFuture<StopChannelResponse> stopChannel(StopChannelRequest request);

    /**
     * @param request the request parameters of StopRtcRobotInstance  StopRtcRobotInstanceRequest
     * @return StopRtcRobotInstanceResponse
     */
    CompletableFuture<StopRtcRobotInstanceResponse> stopRtcRobotInstance(StopRtcRobotInstanceRequest request);

    /**
     * @param request the request parameters of SubmitASRJob  SubmitASRJobRequest
     * @return SubmitASRJobResponse
     */
    CompletableFuture<SubmitASRJobResponse> submitASRJob(SubmitASRJobRequest request);

    /**
     * @param request the request parameters of SubmitAudioProduceJob  SubmitAudioProduceJobRequest
     * @return SubmitAudioProduceJobResponse
     */
    CompletableFuture<SubmitAudioProduceJobResponse> submitAudioProduceJob(SubmitAudioProduceJobRequest request);

    /**
     * @param request the request parameters of SubmitAvatarTrainingJob  SubmitAvatarTrainingJobRequest
     * @return SubmitAvatarTrainingJobResponse
     */
    CompletableFuture<SubmitAvatarTrainingJobResponse> submitAvatarTrainingJob(SubmitAvatarTrainingJobRequest request);

    /**
     * @param request the request parameters of SubmitAvatarVideoJob  SubmitAvatarVideoJobRequest
     * @return SubmitAvatarVideoJobResponse
     */
    CompletableFuture<SubmitAvatarVideoJobResponse> submitAvatarVideoJob(SubmitAvatarVideoJobRequest request);

    /**
     * @param request the request parameters of SubmitBatchMediaProducingJob  SubmitBatchMediaProducingJobRequest
     * @return SubmitBatchMediaProducingJobResponse
     */
    CompletableFuture<SubmitBatchMediaProducingJobResponse> submitBatchMediaProducingJob(SubmitBatchMediaProducingJobRequest request);

    /**
     * @param request the request parameters of SubmitCopyrightExtractJob  SubmitCopyrightExtractJobRequest
     * @return SubmitCopyrightExtractJobResponse
     */
    CompletableFuture<SubmitCopyrightExtractJobResponse> submitCopyrightExtractJob(SubmitCopyrightExtractJobRequest request);

    /**
     * @param request the request parameters of SubmitCopyrightJob  SubmitCopyrightJobRequest
     * @return SubmitCopyrightJobResponse
     */
    CompletableFuture<SubmitCopyrightJobResponse> submitCopyrightJob(SubmitCopyrightJobRequest request);

    /**
     * @param request the request parameters of SubmitCustomizedVoiceJob  SubmitCustomizedVoiceJobRequest
     * @return SubmitCustomizedVoiceJobResponse
     */
    CompletableFuture<SubmitCustomizedVoiceJobResponse> submitCustomizedVoiceJob(SubmitCustomizedVoiceJobRequest request);

    /**
     * <b>description</b> :
     * <p>  SubmitDNAJob is an asynchronous operation. After a request is sent, the system returns a request ID and a job ID and runs the task in the background.</p>
     * <ul>
     * <li>You can call this operation only in the China (Beijing), China (Hangzhou), and China (Shanghai) regions.</li>
     * <li>You can submit a text fingerprint analysis job only in the China (Shanghai) region.</li>
     * </ul>
     * 
     * @param request the request parameters of SubmitDNAJob  SubmitDNAJobRequest
     * @return SubmitDNAJobResponse
     */
    CompletableFuture<SubmitDNAJobResponse> submitDNAJob(SubmitDNAJobRequest request);

    /**
     * <b>description</b> :
     * <p>This feature is available only in the China (Shanghai) region.</p>
     * <ul>
     * <li>You can add a title, subtitle, data source, and unit to a chart and specify the font and font size. For supported fonts, see <a href="https://help.aliyun.com/document_detail/449567.html">Fonts</a>.</li>
     * <li>This feature provides five styles of animated charts: normal, mystery, lively, business, and green.</li>
     * <li>You can set the background color or image.</li>
     * <li>You can set the animation duration, size, and bitrate.
     * Examples</li>
     * <li>Line chart: <a href="https://ice-public-media.oss-cn-shanghai.aliyuncs.com/smart/dynamicChart/line.xlsx">Sample datasheet</a>, <a href="https://ice-public-media.oss-cn-shanghai.aliyuncs.com/smart/dynamicChart/line.mp4">Effect</a></li>
     * <li>Bar chart: <a href="https://ice-public-media.oss-cn-shanghai.aliyuncs.com/smart/dynamicChart/histgram.xlsx">Sample datasheet</a>, <a href="https://ice-public-media.oss-cn-shanghai.aliyuncs.com/smart/dynamicChart/histgram.mp4">Effect</a></li>
     * <li>Pie chart: <a href="https://ice-public-media.oss-cn-shanghai.aliyuncs.com/smart/dynamicChart/pie.xlsx">Sample datasheet</a>, <a href="https://ice-public-media.oss-cn-shanghai.aliyuncs.com/smart/dynamicChart/pie.mp4">Effect</a></li>
     * <li>Normal: <a href="https://ice-public-media.oss-cn-shanghai.aliyuncs.com/smart/dynamicChart/Normal.mp4">Effect</a></li>
     * <li>Mystery: <a href="https://ice-public-media.oss-cn-shanghai.aliyuncs.com/smart/dynamicChart/Mystery.mp4">Effect</a></li>
     * <li>Lively: <a href="https://ice-public-media.oss-cn-shanghai.aliyuncs.com/smart/dynamicChart/Lively.mp4">Effect</a></li>
     * <li>Business: <a href="https://ice-public-media.oss-cn-shanghai.aliyuncs.com/smart/dynamicChart/Business.mp4">Effect</a></li>
     * <li>Green: <a href="https://ice-public-media.oss-cn-shanghai.aliyuncs.com/smart/dynamicChart/Green.mp4">Effect</a></li>
     * </ul>
     * 
     * @param request the request parameters of SubmitDynamicChartJob  SubmitDynamicChartJobRequest
     * @return SubmitDynamicChartJobResponse
     */
    CompletableFuture<SubmitDynamicChartJobResponse> submitDynamicChartJob(SubmitDynamicChartJobRequest request);

    /**
     * @param request the request parameters of SubmitDynamicImageJob  SubmitDynamicImageJobRequest
     * @return SubmitDynamicImageJobResponse
     */
    CompletableFuture<SubmitDynamicImageJobResponse> submitDynamicImageJob(SubmitDynamicImageJobRequest request);

    /**
     * @param request the request parameters of SubmitIProductionJob  SubmitIProductionJobRequest
     * @return SubmitIProductionJobResponse
     */
    CompletableFuture<SubmitIProductionJobResponse> submitIProductionJob(SubmitIProductionJobRequest request);

    /**
     * <b>description</b> :
     * <p>Live editing is supported for live streams that are recorded and stored in Object Storage Service (OSS) and ApsaraVideo VOD. If multiple live streams are involved in a single job, only those recorded within the same application are supported for mixed editing. The streams must all be recorded either in OSS or ApsaraVideo VOD.</p>
     * 
     * @param request the request parameters of SubmitLiveEditingJob  SubmitLiveEditingJobRequest
     * @return SubmitLiveEditingJobResponse
     */
    CompletableFuture<SubmitLiveEditingJobResponse> submitLiveEditingJob(SubmitLiveEditingJobRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to record live streams of ApsaraVideo Live or third-party Real-Time Messaging Protocol (RTMP) live streams. We recommend that you ingest a stream before you call this operation to submit a recording job. If no stream is pulled from the streaming URL, the job attempts to pull a stream for 3 minutes. If the attempt times out, the recording service stops.
     * Before you submit a recording job, you must prepare an Object Storage Service (OSS) or ApsaraVideo VOD bucket. We recommend that you use a storage address configured in Intelligent Media Services (IMS) to facilitate the management and processing of generated recording files.
     * If the preset recording template does not meet your requirements, you can create a custom recording template.</p>
     * 
     * @param request the request parameters of SubmitLiveRecordJob  SubmitLiveRecordJobRequest
     * @return SubmitLiveRecordJobResponse
     */
    CompletableFuture<SubmitLiveRecordJobResponse> submitLiveRecordJob(SubmitLiveRecordJobRequest request);

    /**
     * @param request the request parameters of SubmitLiveSnapshotJob  SubmitLiveSnapshotJobRequest
     * @return SubmitLiveSnapshotJobResponse
     */
    CompletableFuture<SubmitLiveSnapshotJobResponse> submitLiveSnapshotJob(SubmitLiveSnapshotJobRequest request);

    /**
     * <b>description</b> :
     * <p>  When you submit a transcoding job that immediately takes effect, make sure that the input stream can be streamed.</p>
     * <ul>
     * <li>When you submit a timed transcoding job, make sure that the input stream can be streamed before the specified time.</li>
     * </ul>
     * 
     * @param request the request parameters of SubmitLiveTranscodeJob  SubmitLiveTranscodeJobRequest
     * @return SubmitLiveTranscodeJobResponse
     */
    CompletableFuture<SubmitLiveTranscodeJobResponse> submitLiveTranscodeJob(SubmitLiveTranscodeJobRequest request);

    /**
     * @param request the request parameters of SubmitMediaAiAnalysisJob  SubmitMediaAiAnalysisJobRequest
     * @return SubmitMediaAiAnalysisJobResponse
     */
    CompletableFuture<SubmitMediaAiAnalysisJobResponse> submitMediaAiAnalysisJob(SubmitMediaAiAnalysisJobRequest request);

    /**
     * <b>description</b> :
     * <p>The job that you submit by calling this operation is run in asynchronous mode. The job is added to an ApsaraVideo Media Processing (MPS) queue to be scheduled and run. You can call the <a href="https://help.aliyun.com/document_detail/444847.html">QueryMediaCensorJobDetail</a> operation or configure an asynchronous notification to obtain the job results.</p>
     * 
     * @param request the request parameters of SubmitMediaCensorJob  SubmitMediaCensorJobRequest
     * @return SubmitMediaCensorJobResponse
     */
    CompletableFuture<SubmitMediaCensorJobResponse> submitMediaCensorJob(SubmitMediaCensorJobRequest request);

    /**
     * @param request the request parameters of SubmitMediaConvertJob  SubmitMediaConvertJobRequest
     * @return SubmitMediaConvertJobResponse
     */
    CompletableFuture<SubmitMediaConvertJobResponse> submitMediaConvertJob(SubmitMediaConvertJobRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to analyze an input media file by using a callback mechanism or initiating subsequent queries. This operation is suitable for scenarios in which real-time performance is less critical and high concurrency is expected.</p>
     * 
     * @param request the request parameters of SubmitMediaInfoJob  SubmitMediaInfoJobRequest
     * @return SubmitMediaInfoJobResponse
     */
    CompletableFuture<SubmitMediaInfoJobResponse> submitMediaInfoJob(SubmitMediaInfoJobRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation returns only the submission result of a media editing and production job. When the submission result is returned, the job may still be in progress. After a media editing and production job is submitted, the job is queued in the background for asynchronous processing.</p>
     * <ul>
     * <li>The materials referenced in the timeline of an online editing project can be media assets in the media asset library or Object Storage Service (OSS) objects. External URLs or Alibaba Cloud Content Delivery Network (CDN) URLs are not supported. To use an OSS object as a material, you must set MediaUrl to an OSS URL, such as <a href="https://your-bucket.oss-region-name.aliyuncs.com/your-object.ext">https://your-bucket.oss-region-name.aliyuncs.com/your-object.ext</a>.</li>
     * <li>After the production is complete, the output file is automatically registered as a media asset. The media asset first needs to be analyzed. After the media asset is analyzed, you can query the duration and resolution information based on the media asset ID.</li>
     * </ul>
     * <h2><a href="#"></a>Limits</h2>
     * <ul>
     * <li>The throttling threshold of this operation is 30 queries per second (QPS).
     * **
     * <strong>Note</strong> If the threshold is exceeded, a &quot;Throttling.User&quot; error is returned when you submit an editing job. For more information about how to resolve this issue, see the <a href="https://help.aliyun.com/document_detail/453484.html">FAQ</a>.</li>
     * <li>You can create up to 100 video tracks, 100 image tracks, and 100 subtitle tracks in a project.</li>
     * <li>The total size of material files cannot exceed 1 TB.</li>
     * <li>The OSS buckets in which the materials reside and where the output media assets are stored must be in the same region as the region in which Intelligent Media Services (IMS) is activated.</li>
     * <li>An output video must meet the following requirements:<ul>
     * <li>Both the width and height must be at least 128 pixels.</li>
     * <li>Both the width and height cannot exceed 4,096 pixels.</li>
     * <li>The shorter side of the video cannot exceed 2,160 pixels.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of SubmitMediaProducingJob  SubmitMediaProducingJobRequest
     * @return SubmitMediaProducingJobResponse
     */
    CompletableFuture<SubmitMediaProducingJobResponse> submitMediaProducingJob(SubmitMediaProducingJobRequest request);

    /**
     * @param request the request parameters of SubmitPackageJob  SubmitPackageJobRequest
     * @return SubmitPackageJobResponse
     */
    CompletableFuture<SubmitPackageJobResponse> submitPackageJob(SubmitPackageJobRequest request);

    /**
     * @param request the request parameters of SubmitProjectExportJob  SubmitProjectExportJobRequest
     * @return SubmitProjectExportJobResponse
     */
    CompletableFuture<SubmitProjectExportJobResponse> submitProjectExportJob(SubmitProjectExportJobRequest request);

    /**
     * @param request the request parameters of SubmitScreenMediaHighlightsJob  SubmitScreenMediaHighlightsJobRequest
     * @return SubmitScreenMediaHighlightsJobResponse
     */
    CompletableFuture<SubmitScreenMediaHighlightsJobResponse> submitScreenMediaHighlightsJob(SubmitScreenMediaHighlightsJobRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation to submit a smart tagging job, you must add a smart tagging template and specify the analysis types that you want to use in the template. For more information, see CreateCustomTemplate. You can use the smart tagging feature only in the China (Beijing), China (Shanghai), and China (Hangzhou) regions. By default, an ApsaraVideo Media Processing (MPS) queue can process a maximum of two concurrent smart tagging jobs. If you need to process more concurrent smart tagging jobs, submit a ticket to contact Alibaba Cloud Technical Support for evaluation and configuration.</p>
     * 
     * @param request the request parameters of SubmitSmarttagJob  SubmitSmarttagJobRequest
     * @return SubmitSmarttagJobResponse
     */
    CompletableFuture<SubmitSmarttagJobResponse> submitSmarttagJob(SubmitSmarttagJobRequest request);

    /**
     * @param request the request parameters of SubmitSnapshotJob  SubmitSnapshotJobRequest
     * @return SubmitSnapshotJobResponse
     */
    CompletableFuture<SubmitSnapshotJobResponse> submitSnapshotJob(SubmitSnapshotJobRequest request);

    /**
     * @param request the request parameters of SubmitSportsHighlightsJob  SubmitSportsHighlightsJobRequest
     * @return SubmitSportsHighlightsJobResponse
     */
    CompletableFuture<SubmitSportsHighlightsJobResponse> submitSportsHighlightsJob(SubmitSportsHighlightsJobRequest request);

    /**
     * @param request the request parameters of SubmitStandardCustomizedVoiceJob  SubmitStandardCustomizedVoiceJobRequest
     * @return SubmitStandardCustomizedVoiceJobResponse
     */
    CompletableFuture<SubmitStandardCustomizedVoiceJobResponse> submitStandardCustomizedVoiceJob(SubmitStandardCustomizedVoiceJobRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to analyze an input media file in synchronous mode. This operation is suitable for scenarios that require high real-time performance and low concurrency. If it takes an extended period of time to obtain the media information about the input media file, the request may time out or the obtained information may be inaccurate. We recommend that you call the <a href="https://help.aliyun.com/document_detail/441222.html">SubmitMediaInfoJob</a> operation to obtain media information.</p>
     * 
     * @param request the request parameters of SubmitSyncMediaInfoJob  SubmitSyncMediaInfoJobRequest
     * @return SubmitSyncMediaInfoJobResponse
     */
    CompletableFuture<SubmitSyncMediaInfoJobResponse> submitSyncMediaInfoJob(SubmitSyncMediaInfoJobRequest request);

    /**
     * @param request the request parameters of SubmitTextGenerateJob  SubmitTextGenerateJobRequest
     * @return SubmitTextGenerateJobResponse
     */
    CompletableFuture<SubmitTextGenerateJobResponse> submitTextGenerateJob(SubmitTextGenerateJobRequest request);

    /**
     * @param request the request parameters of SubmitTraceAbJob  SubmitTraceAbJobRequest
     * @return SubmitTraceAbJobResponse
     */
    CompletableFuture<SubmitTraceAbJobResponse> submitTraceAbJob(SubmitTraceAbJobRequest request);

    /**
     * @param request the request parameters of SubmitTraceExtractJob  SubmitTraceExtractJobRequest
     * @return SubmitTraceExtractJobResponse
     */
    CompletableFuture<SubmitTraceExtractJobResponse> submitTraceExtractJob(SubmitTraceExtractJobRequest request);

    /**
     * @param request the request parameters of SubmitTraceM3u8Job  SubmitTraceM3u8JobRequest
     * @return SubmitTraceM3u8JobResponse
     */
    CompletableFuture<SubmitTraceM3u8JobResponse> submitTraceM3u8Job(SubmitTraceM3u8JobRequest request);

    /**
     * @param request the request parameters of SubmitTranscodeJob  SubmitTranscodeJobRequest
     * @return SubmitTranscodeJobResponse
     */
    CompletableFuture<SubmitTranscodeJobResponse> submitTranscodeJob(SubmitTranscodeJobRequest request);

    /**
     * <b>description</b> :
     * <p>After you call this operation to submit a video translation job, the system returns a job ID. You can call the GetSmartHandleJob operation based on the job ID to obtain the status and result information of the job.</p>
     * 
     * @param request the request parameters of SubmitVideoTranslationJob  SubmitVideoTranslationJobRequest
     * @return SubmitVideoTranslationJobResponse
     */
    CompletableFuture<SubmitVideoTranslationJobResponse> submitVideoTranslationJob(SubmitVideoTranslationJobRequest request);

    /**
     * @param request the request parameters of TakeoverAIAgentCall  TakeoverAIAgentCallRequest
     * @return TakeoverAIAgentCallResponse
     */
    CompletableFuture<TakeoverAIAgentCallResponse> takeoverAIAgentCall(TakeoverAIAgentCallRequest request);

    /**
     * @param request the request parameters of UpdateAIAgentInstance  UpdateAIAgentInstanceRequest
     * @return UpdateAIAgentInstanceResponse
     */
    CompletableFuture<UpdateAIAgentInstanceResponse> updateAIAgentInstance(UpdateAIAgentInstanceRequest request);

    /**
     * @param request the request parameters of UpdateAvatarTrainingJob  UpdateAvatarTrainingJobRequest
     * @return UpdateAvatarTrainingJobResponse
     */
    CompletableFuture<UpdateAvatarTrainingJobResponse> updateAvatarTrainingJob(UpdateAvatarTrainingJobRequest request);

    /**
     * <b>description</b> :
     * <p>After you create a media asset category, you can call this operation to find the category based on the category ID and change the name of the category.</p>
     * 
     * @param request the request parameters of UpdateCategory  UpdateCategoryRequest
     * @return UpdateCategoryResponse
     */
    CompletableFuture<UpdateCategoryResponse> updateCategory(UpdateCategoryRequest request);

    /**
     * @param request the request parameters of UpdateChannel  UpdateChannelRequest
     * @return UpdateChannelResponse
     */
    CompletableFuture<UpdateChannelResponse> updateChannel(UpdateChannelRequest request);

    /**
     * @param request the request parameters of UpdateCustomTemplate  UpdateCustomTemplateRequest
     * @return UpdateCustomTemplateResponse
     */
    CompletableFuture<UpdateCustomTemplateResponse> updateCustomTemplate(UpdateCustomTemplateRequest request);

    /**
     * @param request the request parameters of UpdateCustomizedVoice  UpdateCustomizedVoiceRequest
     * @return UpdateCustomizedVoiceResponse
     */
    CompletableFuture<UpdateCustomizedVoiceResponse> updateCustomizedVoice(UpdateCustomizedVoiceRequest request);

    /**
     * @param request the request parameters of UpdateEditingProject  UpdateEditingProjectRequest
     * @return UpdateEditingProjectResponse
     */
    CompletableFuture<UpdateEditingProjectResponse> updateEditingProject(UpdateEditingProjectRequest request);

    /**
     * @param request the request parameters of UpdateLivePackageChannel  UpdateLivePackageChannelRequest
     * @return UpdateLivePackageChannelResponse
     */
    CompletableFuture<UpdateLivePackageChannelResponse> updateLivePackageChannel(UpdateLivePackageChannelRequest request);

    /**
     * @param request the request parameters of UpdateLivePackageChannelCredentials  UpdateLivePackageChannelCredentialsRequest
     * @return UpdateLivePackageChannelCredentialsResponse
     */
    CompletableFuture<UpdateLivePackageChannelCredentialsResponse> updateLivePackageChannelCredentials(UpdateLivePackageChannelCredentialsRequest request);

    /**
     * @param request the request parameters of UpdateLivePackageChannelGroup  UpdateLivePackageChannelGroupRequest
     * @return UpdateLivePackageChannelGroupResponse
     */
    CompletableFuture<UpdateLivePackageChannelGroupResponse> updateLivePackageChannelGroup(UpdateLivePackageChannelGroupRequest request);

    /**
     * @param request the request parameters of UpdateLivePackageOriginEndpoint  UpdateLivePackageOriginEndpointRequest
     * @return UpdateLivePackageOriginEndpointResponse
     */
    CompletableFuture<UpdateLivePackageOriginEndpointResponse> updateLivePackageOriginEndpoint(UpdateLivePackageOriginEndpointRequest request);

    /**
     * <b>description</b> :
     * <p>Only user-created templates can be updated. The preset template cannot be updated.</p>
     * 
     * @param request the request parameters of UpdateLiveRecordTemplate  UpdateLiveRecordTemplateRequest
     * @return UpdateLiveRecordTemplateResponse
     */
    CompletableFuture<UpdateLiveRecordTemplateResponse> updateLiveRecordTemplate(UpdateLiveRecordTemplateRequest request);

    /**
     * @param request the request parameters of UpdateLiveSnapshotTemplate  UpdateLiveSnapshotTemplateRequest
     * @return UpdateLiveSnapshotTemplateResponse
     */
    CompletableFuture<UpdateLiveSnapshotTemplateResponse> updateLiveSnapshotTemplate(UpdateLiveSnapshotTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>  For a non-timed transcoding job, you can modify the Name parameter of the job, regardless of the job state.</p>
     * <ul>
     * <li>For a timed job, you can modify the Name, StreamInput, TranscodeOutput, and TimedConfig parameters. However, the StreamInput, TranscodeOutput, and TimedConfig parameters can be modified only when the job is not started.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateLiveTranscodeJob  UpdateLiveTranscodeJobRequest
     * @return UpdateLiveTranscodeJobResponse
     */
    CompletableFuture<UpdateLiveTranscodeJobResponse> updateLiveTranscodeJob(UpdateLiveTranscodeJobRequest request);

    /**
     * @param request the request parameters of UpdateLiveTranscodeTemplate  UpdateLiveTranscodeTemplateRequest
     * @return UpdateLiveTranscodeTemplateResponse
     */
    CompletableFuture<UpdateLiveTranscodeTemplateResponse> updateLiveTranscodeTemplate(UpdateLiveTranscodeTemplateRequest request);

    /**
     * @param request the request parameters of UpdateMediaConnectFlowStatus  UpdateMediaConnectFlowStatusRequest
     * @return UpdateMediaConnectFlowStatusResponse
     */
    CompletableFuture<UpdateMediaConnectFlowStatusResponse> updateMediaConnectFlowStatus(UpdateMediaConnectFlowStatusRequest request);

    /**
     * <b>description</b> :
     * <p>If the MediaId parameter is specified, the MediaId parameter is preferentially used for the query. If the MediaId parameter is left empty, the InputURL parameter must be specified. The request ID and media asset ID are returned. You cannot modify the input URL of a media asset by specifying the ID of the media asset.</p>
     * 
     * @param request the request parameters of UpdateMediaInfo  UpdateMediaInfoRequest
     * @return UpdateMediaInfoResponse
     */
    CompletableFuture<UpdateMediaInfoResponse> updateMediaInfo(UpdateMediaInfoRequest request);

    /**
     * @param request the request parameters of UpdateMediaMarks  UpdateMediaMarksRequest
     * @return UpdateMediaMarksResponse
     */
    CompletableFuture<UpdateMediaMarksResponse> updateMediaMarks(UpdateMediaMarksRequest request);

    /**
     * @param request the request parameters of UpdateMediaToSearchLib  UpdateMediaToSearchLibRequest
     * @return UpdateMediaToSearchLibResponse
     */
    CompletableFuture<UpdateMediaToSearchLibResponse> updateMediaToSearchLib(UpdateMediaToSearchLibRequest request);

    /**
     * @param request the request parameters of UpdatePipeline  UpdatePipelineRequest
     * @return UpdatePipelineResponse
     */
    CompletableFuture<UpdatePipelineResponse> updatePipeline(UpdatePipelineRequest request);

    /**
     * @param request the request parameters of UpdateProgram  UpdateProgramRequest
     * @return UpdateProgramResponse
     */
    CompletableFuture<UpdateProgramResponse> updateProgram(UpdateProgramRequest request);

    /**
     * @param request the request parameters of UpdateRtcRobotInstance  UpdateRtcRobotInstanceRequest
     * @return UpdateRtcRobotInstanceResponse
     */
    CompletableFuture<UpdateRtcRobotInstanceResponse> updateRtcRobotInstance(UpdateRtcRobotInstanceRequest request);

    /**
     * @param request the request parameters of UpdateSource  UpdateSourceRequest
     * @return UpdateSourceResponse
     */
    CompletableFuture<UpdateSourceResponse> updateSource(UpdateSourceRequest request);

    /**
     * @param request the request parameters of UpdateSourceLocation  UpdateSourceLocationRequest
     * @return UpdateSourceLocationResponse
     */
    CompletableFuture<UpdateSourceLocationResponse> updateSourceLocation(UpdateSourceLocationRequest request);

    /**
     * <b>description</b> :
     * <p>  For more information about how to use a regular template, see <a href="https://help.aliyun.com/document_detail/445399.html">Create and use a regular template</a>.</p>
     * <ul>
     * <li>For more information about how to use an advanced template, see <a href="https://help.aliyun.com/document_detail/445389.html">Create and use advanced templates</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateTemplate  UpdateTemplateRequest
     * @return UpdateTemplateResponse
     */
    CompletableFuture<UpdateTemplateResponse> updateTemplate(UpdateTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>  If a callback is configured, you will receive an UploadByURLComplete event notification after the file is uploaded. You can query the upload status by calling the GetURLUploadInfos operation.</p>
     * <ul>
     * <li>After a request is submitted, the upload job is queued as an asynchronous job in the cloud. You can query the status of the upload job based on information such as the URL and media asset ID that are returned in the event notification.</li>
     * <li>You can call this operation to upload media files that are not stored on a local server or device and must be uploaded by using URLs that are accessible over the Internet.</li>
     * <li>You can call this operation to upload media files only to ApsaraVideo VOD, but not to your own Object Storage Service (OSS) buckets. To upload a media file to an OSS bucket, pull the file to a local directory, use <a href="https://help.aliyun.com/document_detail/32006.html">OSS SDK</a> to upload the file to an OSS bucket, and then call the <a href="https://help.aliyun.com/document_detail/441152.html">RegisterMediaInfo</a> operation to register the file in the OSS bucket with the media asset library.</li>
     * <li>This operation is available only in the China (Shanghai), China (Beijing), and China (Shenzhen) regions.</li>
     * <li>You can call this operation to upload only audio and video files.</li>
     * </ul>
     * 
     * @param request the request parameters of UploadMediaByURL  UploadMediaByURLRequest
     * @return UploadMediaByURLResponse
     */
    CompletableFuture<UploadMediaByURLResponse> uploadMediaByURL(UploadMediaByURLRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation to pull a media stream file based on a URL and upload the file. After the media stream file is uploaded, the media stream is associated with the specified media asset ID.</p>
     * <ul>
     * <li>You can call this operation to upload media stream files only to ApsaraVideo VOD, but not to your own Object Storage Service (OSS) buckets. To upload a media stream file to an OSS bucket, pull the file to a local directory, use <a href="https://help.aliyun.com/document_detail/32006.html">OSS SDK</a> to upload the file to an OSS bucket, and then call the <a href="https://help.aliyun.com/document_detail/440765.html">RegisterMediaStream</a> operation to associate the media stream with the specified media asset ID.</li>
     * <li>This operation is available only in the China (Shanghai), China (Beijing), and China (Shenzhen) regions.</li>
     * </ul>
     * 
     * @param request the request parameters of UploadStreamByURL  UploadStreamByURLRequest
     * @return UploadStreamByURLResponse
     */
    CompletableFuture<UploadStreamByURLResponse> uploadStreamByURL(UploadStreamByURLRequest request);

}
