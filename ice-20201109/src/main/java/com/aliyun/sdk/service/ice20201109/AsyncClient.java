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
     * <h2>Request description</h2>
     * <p>This operation activates a specific Real-time Conversational AI service license by providing the batch ID (<code>LicenseItemId</code>), authorization code (<code>AuthCode</code>), and device ID (<code>DeviceId</code>). Upon successful activation, the response includes the request ID, error code, request status, HTTP status code, and activated license information.
     * <strong>Note</strong>: Ensure that the provided batch ID, authorization code, and device ID are accurate. Otherwise, the activation may fail.</p>
     * 
     * @param request the request parameters of ActiveAiRtcLicense  ActiveAiRtcLicenseRequest
     * @return ActiveAiRtcLicenseResponse
     */
    CompletableFuture<ActiveAiRtcLicenseResponse> activeAiRtcLicense(ActiveAiRtcLicenseRequest request);

    /**
     * @param request the request parameters of AddAdInsertion  AddAdInsertionRequest
     * @return AddAdInsertionResponse
     */
    CompletableFuture<AddAdInsertionResponse> addAdInsertion(AddAdInsertionRequest request);

    /**
     * <b>description</b> :
     * <p>Categories support up to three levels, and each level supports up to 100 subcategories.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>If the specified flow instance ID does not exist, the API returns an error.</li>
     * <li>By default, a flow can have only one input. After you enable dual-stream disaster recovery, you can add another input.</li>
     * </ul>
     * <h3>Input type descriptions</h3>
     * <ul>
     * <li>RTMP-PUSH: Creates an RTMP listener input. You can push streams to the URL returned by the API by using the RTMP protocol.</li>
     * <li>RTMP-PULL: Creates an RTMP back-to-origin pull input. The flow pulls RTMP live streams from the origin server that you specify.</li>
     * <li>SRT-Listener: Creates an SRT listener input. You can push streams to the URL returned by the API by using the SRT protocol.</li>
     * <li>SRT-Caller: Creates an SRT back-to-origin pull input. The flow pulls SRT live streams from the origin server that you specify.</li>
     * <li>Flow: Uses the output of another upstream flow instance as the input. You must specify both the instance ID and the output name of the peer flow. The output of the upstream flow instance must be of the SRT-Listener or RTMP-PULL type. When flow instances are cascaded, Express Connect circuits are used by default. This can be used for cross-region distribution among multiple flows.</li>
     * </ul>
     * 
     * @param request the request parameters of AddMediaConnectFlowInput  AddMediaConnectFlowInputRequest
     * @return AddMediaConnectFlowInputResponse
     */
    CompletableFuture<AddMediaConnectFlowInputResponse> addMediaConnectFlowInput(AddMediaConnectFlowInputRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>If the specified flow instance ID does not exist, the API returns an error.</li>
     * <li>A flow instance can have up to four outputs.</li>
     * <li>Output names within the same flow instance must be unique.</li>
     * <li>You can set a limit on the number of concurrent players for each output. New playback requests fail if the limit is exceeded. Each output supports up to five concurrent playback streams.</li>
     * </ul>
     * <h3>Output type descriptions</h3>
     * <ul>
     * <li>RTMP-PUSH: Creates an RTMP push output. The flow uses the RTMP protocol to push the live stream to the origin server in Settings.</li>
     * <li>RTMP-PULL: Creates an RTMP pull output. You can use the RTMP protocol to pull the stream from the URL returned in the API response.</li>
     * <li>SRT-Caller: Creates an SRT push output. The flow uses the SRT protocol to push the live stream to the origin server in Settings.</li>
     * <li>SRT-Listener: Creates an SRT pull output. You can use the SRT protocol to pull the stream from the URL returned in the API response.</li>
     * <li>Flow: Uses the input of another downstream flow instance as the output. You must specify both the instance ID and the input name of the peer flow. The input type of the downstream flow instance must be a listener type, such as SRT-Listener or RTMP-PUSH. This instance pushes the live stream to the downstream flow. When flow instances are cascaded, Express Connect circuits are used by default, which is active for cross-area distribution among multiple flows.</li>
     * </ul>
     * 
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
     * <p>Tags media assets created from live streams.</p>
     * 
     * @param request the request parameters of AddStreamTagToSearchLib  AddStreamTagToSearchLibRequest
     * @return AddStreamTagToSearchLibResponse
     */
    CompletableFuture<AddStreamTagToSearchLibResponse> addStreamTagToSearchLib(AddStreamTagToSearchLibRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>To use standard templates, refer to <a href="https://help.aliyun.com/document_detail/445399.html">Quick start for standard templates</a>.</li>
     * <li>To use advanced templates, refer to <a href="https://help.aliyun.com/document_detail/445389.html">Create and use advanced templates</a>.</li>
     * </ul>
     * <h3>Limits</h3>
     * <p>After an advanced template is created, it requires parsing time and its status is Processing. During this period, the template is unavailable. You can use the template only when its status changes to Available. The parsing time depends on the template file size and typically ranges from 10 seconds to 5 minutes.</p>
     * 
     * @param request the request parameters of AddTemplate  AddTemplateRequest
     * @return AddTemplateResponse
     */
    CompletableFuture<AddTemplateResponse> addTemplate(AddTemplateRequest request);

    /**
     * @param request the request parameters of AddYikeUserCredit  AddYikeUserCreditRequest
     * @return AddYikeUserCreditResponse
     */
    CompletableFuture<AddYikeUserCreditResponse> addYikeUserCredit(AddYikeUserCreditRequest request);

    /**
     * @param request the request parameters of AlterSearchIndex  AlterSearchIndexRequest
     * @return AlterSearchIndexResponse
     */
    CompletableFuture<AlterSearchIndexResponse> alterSearchIndex(AlterSearchIndexRequest request);

    /**
     * @param request the request parameters of AlterSearchLib  AlterSearchLibRequest
     * @return AlterSearchLibResponse
     */
    CompletableFuture<AlterSearchLibResponse> alterSearchLib(AlterSearchLibRequest request);

    /**
     * @param request the request parameters of BatchCreateVodPackagingAsset  BatchCreateVodPackagingAssetRequest
     * @return BatchCreateVodPackagingAssetResponse
     */
    CompletableFuture<BatchCreateVodPackagingAssetResponse> batchCreateVodPackagingAsset(BatchCreateVodPackagingAssetRequest request);

    /**
     * @param request the request parameters of BatchGetMediaInfos  BatchGetMediaInfosRequest
     * @return BatchGetMediaInfosResponse
     */
    CompletableFuture<BatchGetMediaInfosResponse> batchGetMediaInfos(BatchGetMediaInfosRequest request);

    /**
     * @param request the request parameters of BatchGetYikeAIAppJob  BatchGetYikeAIAppJobRequest
     * @return BatchGetYikeAIAppJobResponse
     */
    CompletableFuture<BatchGetYikeAIAppJobResponse> batchGetYikeAIAppJob(BatchGetYikeAIAppJobRequest request);

    /**
     * @param request the request parameters of BatchGetYikeAssetMediaInfos  BatchGetYikeAssetMediaInfosRequest
     * @return BatchGetYikeAssetMediaInfosResponse
     */
    CompletableFuture<BatchGetYikeAssetMediaInfosResponse> batchGetYikeAssetMediaInfos(BatchGetYikeAssetMediaInfosRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation can only cancel jobs that are in the <strong>Queued</strong> state.</li>
     * <li>Set the pipeline status to Paused by calling the <strong>UpdatePipeline</strong> operation to pause job scheduling before you call this operation to cancel a job. After the job is canceled, set the pipeline status back to Active so that jobs in the pipeline can be scheduled and executed.</li>
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
     * @param request the request parameters of CancelIProductionJob  CancelIProductionJobRequest
     * @return CancelIProductionJobResponse
     */
    CompletableFuture<CancelIProductionJobResponse> cancelIProductionJob(CancelIProductionJobRequest request);

    /**
     * @param request the request parameters of ClearAIAgentVoiceprint  ClearAIAgentVoiceprintRequest
     * @return ClearAIAgentVoiceprintResponse
     */
    CompletableFuture<ClearAIAgentVoiceprintResponse> clearAIAgentVoiceprint(ClearAIAgentVoiceprintRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>If the instance has two inputs, you cannot disable dual-stream disaster recovery. You must delete one input before the call can succeed.</li>
     * </ul>
     * 
     * @param request the request parameters of CloseMediaConnectFlowFailover  CloseMediaConnectFlowFailoverRequest
     * @return CloseMediaConnectFlowFailoverResponse
     */
    CompletableFuture<CloseMediaConnectFlowFailoverResponse> closeMediaConnectFlowFailover(CloseMediaConnectFlowFailoverRequest request);

    /**
     * @param request the request parameters of CloseStreamToSearchLib  CloseStreamToSearchLibRequest
     * @return CloseStreamToSearchLibResponse
     */
    CompletableFuture<CloseStreamToSearchLibResponse> closeStreamToSearchLib(CloseStreamToSearchLibRequest request);

    /**
     * @param request the request parameters of CreateAudit  CreateAuditRequest
     * @return CreateAuditResponse
     */
    CompletableFuture<CreateAuditResponse> createAudit(CreateAuditRequest request);

    /**
     * <b>description</b> :
     * <p>This operation only initializes the training task information and does not submit the training. To formally submit the training, call the <a href="https://help.aliyun.com/document_detail/2526196.html">SubmitAvatarTrainingJob</a> operation.</p>
     * 
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
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;- Voice cloning billing is divided into two dimensions: customization and usage. For more information, see <a href="~~2399891#section-gy3-80e-clt~~">Voice cloning billing</a>.</p>
     * <ul>
     * <li>To achieve entertainment-level effects, call this operation. When using it, you need to record 20 fixed script texts. The system extracts key voiceprint features, enabling quick and low-cost voice cloning customization.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateCustomizedVoiceJob  CreateCustomizedVoiceJobRequest
     * @return CreateCustomizedVoiceJobResponse
     */
    CompletableFuture<CreateCustomizedVoiceJobResponse> createCustomizedVoiceJob(CreateCustomizedVoiceJobRequest request);

    /**
     * <b>description</b> :
     * <p>By default, each user can create up to 5 media fingerprint libraries. To increase the quota, <a href="https://smartservice.console.aliyun.com/service/create-ticket?spm=a2c4g.11186623.0.0.645019b6Btnu4q">submit a ticket</a>. You can call the DeleteDNADB operation to delete unused media fingerprint libraries.</p>
     * 
     * @param request the request parameters of CreateDNADB  CreateDNADBRequest
     * @return CreateDNADBResponse
     */
    CompletableFuture<CreateDNADBResponse> createDNADB(CreateDNADBRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Billing is based on the duration of the produced video. For details, see <a href="https://help.aliyun.com/document_detail/2840899.html">video clip</a>&lt;props=&quot;china&quot;&gt; and <a href="https://help.aliyun.com/document_detail/2840900.html">live streaming editing</a>. If the processing failed, no fees are charged.</li>
     * <li>After you create an editing project, you can invoke the <a href="https://help.aliyun.com/document_detail/441147.html">SubmitMediaProducingJob - commit a media editing and producing job</a> operation to commit a media editing and producing node. You can also invoke the <a href="https://help.aliyun.com/document_detail/441148.html">SubmitLiveEditingJob - commit a live streaming editing node</a> operation to commit a live streaming editing node.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateEditingProject  CreateEditingProjectRequest
     * @return CreateEditingProjectResponse
     */
    CompletableFuture<CreateEditingProjectResponse> createEditingProject(CreateEditingProjectRequest request);

    /**
     * <b>description</b> :
     * <p>Calls the CreateHotwordLibrary operation to create a hotword library.</p>
     * 
     * @param request the request parameters of CreateHotwordLibrary  CreateHotwordLibraryRequest
     * @return CreateHotwordLibraryResponse
     */
    CompletableFuture<CreateHotwordLibraryResponse> createHotwordLibrary(CreateHotwordLibraryRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/3004591.html">billing methods and pricing of IPC</a>.</p>
     * 
     * @param request the request parameters of CreateIpcOrder  CreateIpcOrderRequest
     * @return CreateIpcOrderResponse
     */
    CompletableFuture<CreateIpcOrderResponse> createIpcOrder(CreateIpcOrderRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation creates a live video packaging service channel and currently supports the HLS protocol. The system automatically generates the ingest endpoint URLs and the username and password required for authentication.</p>
     * <h3>Precautions</h3>
     * <ul>
     * <li>The channel group name and channel name can only contain uppercase and lowercase letters, digits, underscores, and hyphens.</li>
     * <li>Currently, only the <code>HLS</code> protocol is supported.</li>
     * <li>The segment duration must be set to a value between 1 and 30 seconds.</li>
     * <li>The number of m3u8 segments must be between 2 and 100.
     * A successful response returns the details of the newly created channel, including the channel name, creation time, modification time, and ingest endpoint details.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateLivePackageChannel  CreateLivePackageChannelRequest
     * @return CreateLivePackageChannelResponse
     */
    CompletableFuture<CreateLivePackageChannelResponse> createLivePackageChannel(CreateLivePackageChannelRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a channel group for the live packaging service. The assigned origin domain name is returned after the channel group is created.</p>
     * 
     * @param request the request parameters of CreateLivePackageChannelGroup  CreateLivePackageChannelGroupRequest
     * @return CreateLivePackageChannelGroupResponse
     */
    CompletableFuture<CreateLivePackageChannelGroupResponse> createLivePackageChannelGroup(CreateLivePackageChannelGroupRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation allows you to create an origin endpoint for a real-time packaging service. It is mainly used to configure the back-to-origin settings, security policy (such as IP blacklists and whitelists, and authorization codes), and time-shift features for a channel. Currently, only HLS protocol playback is supported. Before creating an origin endpoint, you must create a real-time packaging channel group and channel. After the endpoint is created, the endpoint playback URL and other configuration details are returned.</p>
     * 
     * @param request the request parameters of CreateLivePackageOriginEndpoint  CreateLivePackageOriginEndpointRequest
     * @return CreateLivePackageOriginEndpointResponse
     */
    CompletableFuture<CreateLivePackageOriginEndpointResponse> createLivePackageOriginEndpoint(CreateLivePackageOriginEndpointRequest request);

    /**
     * <b>description</b> :
     * <p>A recording template must be specified for live recording. The recording template allows you to configure information such as the output format of the recording file (m3u8, mp4, or flv) and the duration of the recording file.</p>
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
     * <b>description</b> :
     * <p>Real-time media transcoding is supported only in the Shanghai region.</p>
     * 
     * @param request the request parameters of CreateLiveTranscodeTemplate  CreateLiveTranscodeTemplateRequest
     * @return CreateLiveTranscodeTemplateResponse
     */
    CompletableFuture<CreateLiveTranscodeTemplateResponse> createLiveTranscodeTemplate(CreateLiveTranscodeTemplateRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>The flow names cannot be duplicated in the same region.</li>
     * <li>Take note of the returned flow ID. You may reference it in other API operations.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateMediaConnectFlow  CreateMediaConnectFlowRequest
     * @return CreateMediaConnectFlowResponse
     */
    CompletableFuture<CreateMediaConnectFlowResponse> createMediaConnectFlow(CreateMediaConnectFlowRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>This operation can be called up to 50 times per second for each Alibaba Cloud account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreateMediaLiveChannel  CreateMediaLiveChannelRequest
     * @return CreateMediaLiveChannelResponse
     */
    CompletableFuture<CreateMediaLiveChannelResponse> createMediaLiveChannel(CreateMediaLiveChannelRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Create a live media input.</li>
     * </ul>
     * <h2>Queries per second (QPS) limit</h2>
     * <p>The queries per second (QPS) limit for this API is 50 requests per second per user. If the limit is exceeded, API calls will be subject to Rate Limiting, which may Impact your business. Please invoke the API appropriately.</p>
     * 
     * @param request the request parameters of CreateMediaLiveInput  CreateMediaLiveInputRequest
     * @return CreateMediaLiveInputResponse
     */
    CompletableFuture<CreateMediaLiveInputResponse> createMediaLiveInput(CreateMediaLiveInputRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>This operation can be called up to 50 times per second for each Alibaba Cloud account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreateMediaLiveInputSecurityGroup  CreateMediaLiveInputSecurityGroupRequest
     * @return CreateMediaLiveInputSecurityGroupResponse
     */
    CompletableFuture<CreateMediaLiveInputSecurityGroupResponse> createMediaLiveInputSecurityGroup(CreateMediaLiveInputSecurityGroupRequest request);

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
     * <ul>
     * <li>This operation is currently supported in the China (Beijing), China (Shanghai), China (Hangzhou), and China (Shenzhen) regions. Other regions are not supported.</li>
     * <li>The queries per second (QPS) limit per user for this operation is 50. If the limit is exceeded, API calls are throttled, which may affect your business. Call this operation at a reasonable frequency. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limits</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateRecognitionEntity  CreateRecognitionEntityRequest
     * @return CreateRecognitionEntityResponse
     */
    CompletableFuture<CreateRecognitionEntityResponse> createRecognitionEntity(CreateRecognitionEntityRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This API operation is currently supported only in the China (Beijing), China (Shanghai), China (Hangzhou), and China (Shenzhen) regions.</li>
     * <li>Usage of a self-registered recognition library (using object as an example): Create a custom object library and a custom object entity. After the creation, register images for the custom object entity. After the registration, create Template A that includes the self-registered object library, use Template A to submit an analysis task, and then query the results.</li>
     * <li>The queries per second (QPS) limit per user is 50. If this limit is exceeded, API calls are throttled, which may affect your services. Call this API operation at a reasonable rate. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limits</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateRecognitionLib  CreateRecognitionLibRequest
     * @return CreateRecognitionLibResponse
     */
    CompletableFuture<CreateRecognitionLibResponse> createRecognitionLib(CreateRecognitionLibRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is currently supported only in the China (Beijing), China (Shanghai), China (Hangzhou), and China (Shenzhen) regions.</li>
     * <li>The QPS limit per user for this operation is 50. If this limit is exceeded, API calls are throttled, which may affect your services. Make API calls at a reasonable frequency. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limits</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateRecognitionSample  CreateRecognitionSampleRequest
     * @return CreateRecognitionSampleResponse
     */
    CompletableFuture<CreateRecognitionSampleResponse> createRecognitionSample(CreateRecognitionSampleRequest request);

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;Before using this operation, make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/2840897.html">billing</a> methods and pricing of intelligent retrieval.</p>
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
     * @param request the request parameters of CreateStreamToSearchLib  CreateStreamToSearchLibRequest
     * @return CreateStreamToSearchLibResponse
     */
    CompletableFuture<CreateStreamToSearchLibResponse> createStreamToSearchLib(CreateStreamToSearchLibRequest request);

    /**
     * <b>description</b> :
     * <h3>Operation description</h3>
     * <ul>
     * <li>Retrieving the upload URL and credential is a core foundation of Intelligent Media Services and a required procedure for every upload operation.</li>
     * <li>If the video upload credential expires (the default validity epoch is 3000 seconds), invoke the refresh video upload credential operation to obtain a new upload credential.</li>
     * <li>After the upload, you can configure callbacks to accept upload event notifications, or invoke the GetMediaInfo operation to check the returned media asset status to determine whether the upload is successful.</li>
     * <li>The MediaId parameter returned by this operation can be used for media asset lifecycle management or media processing.</li>
     * </ul>
     * <h3>Limits</h3>
     * <ul>
     * <li>This operation supports uploads only to VOD storage. Uploads to user-owned OSS storage are not supported. If you use your own OSS storage, upload files to OSS by using the <a href="https://help.aliyun.com/document_detail/32006.html">OSS SDK</a>, and then invoke the <a href="https://help.aliyun.com/document_detail/441152.html">RegisterMediaInfo</a> operation to register the OSS file in the media library.</li>
     * <li>This operation currently supports only the China (Shanghai), China (Beijing), and China (Shenzhen) regions.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateUploadMedia  CreateUploadMediaRequest
     * @return CreateUploadMediaResponse
     */
    CompletableFuture<CreateUploadMediaResponse> createUploadMedia(CreateUploadMediaRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Upload only a local media stream. After the media stream is uploaded, it is associated with the specified media asset ID.</li>
     * <li>Upload media streams only to ApsaraVideo VOD, but not to your own Object Storage Service (OSS) buckets. To upload a media stream to your own OSS bucket, you can upload the file to your OSS bucket by using <a href="https://help.aliyun.com/document_detail/32006.html">OSS SDK</a>, and then call the <a href="https://help.aliyun.com/document_detail/440765.html">RegisterMediaStream</a> operation to associate the media stream with the specified media asset ID.</li>
     * <li>This operation is available only in the China (Shanghai), China (Beijing), and China (Shenzhen) regions.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateUploadStream  CreateUploadStreamRequest
     * @return CreateUploadStreamResponse
     */
    CompletableFuture<CreateUploadStreamResponse> createUploadStream(CreateUploadStreamRequest request);

    /**
     * @param request the request parameters of CreateVodPackagingAsset  CreateVodPackagingAssetRequest
     * @return CreateVodPackagingAssetResponse
     */
    CompletableFuture<CreateVodPackagingAssetResponse> createVodPackagingAsset(CreateVodPackagingAssetRequest request);

    /**
     * @param request the request parameters of CreateVodPackagingConfiguration  CreateVodPackagingConfigurationRequest
     * @return CreateVodPackagingConfigurationResponse
     */
    CompletableFuture<CreateVodPackagingConfigurationResponse> createVodPackagingConfiguration(CreateVodPackagingConfigurationRequest request);

    /**
     * @param request the request parameters of CreateVodPackagingGroup  CreateVodPackagingGroupRequest
     * @return CreateVodPackagingGroupResponse
     */
    CompletableFuture<CreateVodPackagingGroupResponse> createVodPackagingGroup(CreateVodPackagingGroupRequest request);

    /**
     * @param request the request parameters of CreateYikeAssetUpload  CreateYikeAssetUploadRequest
     * @return CreateYikeAssetUploadResponse
     */
    CompletableFuture<CreateYikeAssetUploadResponse> createYikeAssetUpload(CreateYikeAssetUploadRequest request);

    /**
     * @param request the request parameters of CreateYikeProduction  CreateYikeProductionRequest
     * @return CreateYikeProductionResponse
     */
    CompletableFuture<CreateYikeProductionResponse> createYikeProduction(CreateYikeProductionRequest request);

    /**
     * @param request the request parameters of CreateYikeUser  CreateYikeUserRequest
     * @return CreateYikeUserResponse
     */
    CompletableFuture<CreateYikeUserResponse> createYikeUser(CreateYikeUserRequest request);

    /**
     * @param request the request parameters of CreateYikeWorkspace  CreateYikeWorkspaceRequest
     * @return CreateYikeWorkspaceResponse
     */
    CompletableFuture<CreateYikeWorkspaceResponse> createYikeWorkspace(CreateYikeWorkspaceRequest request);

    /**
     * @param request the request parameters of DecryptKMSDataKey  DecryptKMSDataKeyRequest
     * @return DecryptKMSDataKeyResponse
     */
    CompletableFuture<DecryptKMSDataKeyResponse> decryptKMSDataKey(DecryptKMSDataKeyRequest request);

    /**
     * @param request the request parameters of DeleteAIAgentDialogue  DeleteAIAgentDialogueRequest
     * @return DeleteAIAgentDialogueResponse
     */
    CompletableFuture<DeleteAIAgentDialogueResponse> deleteAIAgentDialogue(DeleteAIAgentDialogueRequest request);

    /**
     * @param request the request parameters of DeleteAdInsertion  DeleteAdInsertionRequest
     * @return DeleteAdInsertionResponse
     */
    CompletableFuture<DeleteAdInsertionResponse> deleteAdInsertion(DeleteAdInsertionRequest request);

    /**
     * @param request the request parameters of DeleteAvatarTrainingJob  DeleteAvatarTrainingJobRequest
     * @return DeleteAvatarTrainingJobResponse
     */
    CompletableFuture<DeleteAvatarTrainingJobResponse> deleteAvatarTrainingJob(DeleteAvatarTrainingJobRequest request);

    /**
     * <b>description</b> :
     * <p>This operation also deletes all subcategories, including level-2 and level-3 categories. Proceed with caution.</p>
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
     * <b>description</b> :
     * <h2><a href="#"></a></h2>
     * <ul>
     * <li>Delete a specified hotword library.</li>
     * <li>The delete operation is irreversible.</li>
     * <li>You can create up to 100 hotword libraries in an account.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteHotwordLibrary  DeleteHotwordLibraryRequest
     * @return DeleteHotwordLibraryResponse
     */
    CompletableFuture<DeleteHotwordLibraryResponse> deleteHotwordLibrary(DeleteHotwordLibraryRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>You need to provide GroupName and ChannelName as parameters to specify exactly which channel to delete. Before you delete a channel, you must delete the origin endpoints associated with the channel.</p>
     * 
     * @param request the request parameters of DeleteLivePackageChannel  DeleteLivePackageChannelRequest
     * @return DeleteLivePackageChannelResponse
     */
    CompletableFuture<DeleteLivePackageChannelResponse> deleteLivePackageChannel(DeleteLivePackageChannelRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Make sure that no channels are included in the channel group before you delete it.</p>
     * 
     * @param request the request parameters of DeleteLivePackageChannelGroup  DeleteLivePackageChannelGroupRequest
     * @return DeleteLivePackageChannelGroupResponse
     */
    CompletableFuture<DeleteLivePackageChannelGroupResponse> deleteLivePackageChannelGroup(DeleteLivePackageChannelGroupRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>This API operation is used to delete an origin endpoint associated with a live package channel by specifying <code>GroupName</code>, <code>ChannelName</code>, and <code>EndpointName</code>. This operation will permanently delete the relevant configurations. Exercise caution when you perform this operation.</p>
     * 
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
     * <b>description</b> :
     * <ul>
     * <li>When the specified flow ID is not available, an error code is returned.</li>
     * <li>When a flow is deleted, its source and outputs are also deleted.</li>
     * <li>When a flow is in the online state, it cannot be deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteMediaConnectFlow  DeleteMediaConnectFlowRequest
     * @return DeleteMediaConnectFlowResponse
     */
    CompletableFuture<DeleteMediaConnectFlowResponse> deleteMediaConnectFlow(DeleteMediaConnectFlowRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>If the provided Flow instance ID does not exist, the interface will return an error.</li>
     * <li>When the Flow instance status is online, the input cannot be deleted.</li>
     * <li>Only after all outputs under the Flow instance have been deleted can the input be deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteMediaConnectFlowInput  DeleteMediaConnectFlowInputRequest
     * @return DeleteMediaConnectFlowInputResponse
     */
    CompletableFuture<DeleteMediaConnectFlowInputResponse> deleteMediaConnectFlowInput(DeleteMediaConnectFlowInputRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>When the specified flow ID is not available, an error code is returned.</li>
     * <li>When a flow is in the online state, its outputs cannot be deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteMediaConnectFlowOutput  DeleteMediaConnectFlowOutputRequest
     * @return DeleteMediaConnectFlowOutputResponse
     */
    CompletableFuture<DeleteMediaConnectFlowOutputResponse> deleteMediaConnectFlowOutput(DeleteMediaConnectFlowOutputRequest request);

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
     * <b>description</b> :
     * <ul>
     * <li>You can only delete a channel that is not running.</li>
     * </ul>
     * <h2>QPS limit</h2>
     * <p>This operation can be called up to 50 times per second for each Alibaba Cloud account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteMediaLiveChannel  DeleteMediaLiveChannelRequest
     * @return DeleteMediaLiveChannelResponse
     */
    CompletableFuture<DeleteMediaLiveChannelResponse> deleteMediaLiveChannel(DeleteMediaLiveChannelRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can delete an input only when it is not associated with a MediaLive channel.</li>
     * </ul>
     * <h2>QPS limit</h2>
     * <p>This operation can be called up to 50 times per second for each Alibaba Cloud account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteMediaLiveInput  DeleteMediaLiveInputRequest
     * @return DeleteMediaLiveInputResponse
     */
    CompletableFuture<DeleteMediaLiveInputResponse> deleteMediaLiveInput(DeleteMediaLiveInputRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can only delete a security group not associated with an input.</li>
     * </ul>
     * <h2>QPS limit</h2>
     * <p>This operation can be called up to 50 times per second for each Alibaba Cloud account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteMediaLiveInputSecurityGroup  DeleteMediaLiveInputSecurityGroupRequest
     * @return DeleteMediaLiveInputSecurityGroupResponse
     */
    CompletableFuture<DeleteMediaLiveInputSecurityGroupResponse> deleteMediaLiveInputSecurityGroup(DeleteMediaLiveInputSecurityGroupRequest request);

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
     * <p>Delete multiple media streams at a time.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>This operation is supported only in the China (Beijing), China (Shanghai), China (Hangzhou), and China (Shenzhen) regions.</li>
     * <li>Callable up to 50 times per second per account. Requests that exceed this limit are dropped and you may experience service interruptions. For more information, see <a href="https://help.aliyun.com/zh/mps/developer-reference/qps-limits?spm=a2c4g.11186623.0.0.647e1081YGcerb">QPS limits</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteRecognitionEntity  DeleteRecognitionEntityRequest
     * @return DeleteRecognitionEntityResponse
     */
    CompletableFuture<DeleteRecognitionEntityResponse> deleteRecognitionEntity(DeleteRecognitionEntityRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is currently supported only in the China (Beijing), China (Shanghai), China (Hangzhou), and China (Shenzhen) regions.</li>
     * <li>The queries per second (QPS) limit per user for this operation is 50. If the limit is exceeded, API calls are throttled, which may affect your business. Call the operation at a reasonable frequency. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limits</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteRecognitionLib  DeleteRecognitionLibRequest
     * @return DeleteRecognitionLibResponse
     */
    CompletableFuture<DeleteRecognitionLibResponse> deleteRecognitionLib(DeleteRecognitionLibRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is supported only in the China (Beijing), China (Shanghai), China (Hangzhou), and China (Shenzhen) regions.</li>
     * <li>Callable up to 50 times per second per account. Requests that exceed this limit are dropped and you may experience service interruptions. For more information, see <a href="https://help.aliyun.com/zh/mps/developer-reference/qps-limits?spm=a2c4g.11186623.0.0.647e1081YGcerb">QPS limits</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteRecognitionSample  DeleteRecognitionSampleRequest
     * @return DeleteRecognitionSampleResponse
     */
    CompletableFuture<DeleteRecognitionSampleResponse> deleteRecognitionSample(DeleteRecognitionSampleRequest request);

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
     * <b>description</b> :
     * <p>Calls the DeleteSourceLocation operation to delete a source location.</p>
     * 
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
     * @param request the request parameters of DeleteVodPackagingAsset  DeleteVodPackagingAssetRequest
     * @return DeleteVodPackagingAssetResponse
     */
    CompletableFuture<DeleteVodPackagingAssetResponse> deleteVodPackagingAsset(DeleteVodPackagingAssetRequest request);

    /**
     * @param request the request parameters of DeleteVodPackagingConfiguration  DeleteVodPackagingConfigurationRequest
     * @return DeleteVodPackagingConfigurationResponse
     */
    CompletableFuture<DeleteVodPackagingConfigurationResponse> deleteVodPackagingConfiguration(DeleteVodPackagingConfigurationRequest request);

    /**
     * @param request the request parameters of DeleteVodPackagingGroup  DeleteVodPackagingGroupRequest
     * @return DeleteVodPackagingGroupResponse
     */
    CompletableFuture<DeleteVodPackagingGroupResponse> deleteVodPackagingGroup(DeleteVodPackagingGroupRequest request);

    /**
     * @param request the request parameters of DeleteYikeAssetMediaInfos  DeleteYikeAssetMediaInfosRequest
     * @return DeleteYikeAssetMediaInfosResponse
     */
    CompletableFuture<DeleteYikeAssetMediaInfosResponse> deleteYikeAssetMediaInfos(DeleteYikeAssetMediaInfosRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Feature description</strong>: This operation queries the details of a specified agent instance.</li>
     * <li><strong>Scenarios</strong>: Call this operation to obtain the required data when you need to monitor or analyze the performance of an agent during a call, or debug the configuration effects of the agent.</li>
     * </ul>
     * 
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
     * <b>description</b> :
     * <p>Retrieves the event callback configuration for a specified AIAgent.</p>
     * 
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
     * @param request the request parameters of ForbidMediaConnectFlowOutput  ForbidMediaConnectFlowOutputRequest
     * @return ForbidMediaConnectFlowOutputResponse
     */
    CompletableFuture<ForbidMediaConnectFlowOutputResponse> forbidMediaConnectFlowOutput(ForbidMediaConnectFlowOutputRequest request);

    /**
     * @param request the request parameters of ForwardAIAgentCall  ForwardAIAgentCallRequest
     * @return ForwardAIAgentCallResponse
     */
    CompletableFuture<ForwardAIAgentCallResponse> forwardAIAgentCall(ForwardAIAgentCallRequest request);

    /**
     * <b>description</b> :
     * <p>This API allows you to create an agent instance based on the provided AI agent ID (AIAgentId). You can use the information in the API response to join the corresponding room and converse with the agent.</p>
     * <blockquote>
     * <p>Notice: Ensure that the provided AI agent ID is valid and configure optional parameters based on common scenarios.</notice></p>
     * </blockquote>
     * 
     * @param request the request parameters of GenerateAIAgentCall  GenerateAIAgentCallRequest
     * @return GenerateAIAgentCallResponse
     */
    CompletableFuture<GenerateAIAgentCallResponse> generateAIAgentCall(GenerateAIAgentCallRequest request);

    /**
     * <b>description</b> :
     * <h2>Before you begin</h2>
     * <p>You must <a href="https://smartservice.console.aliyun.com/service/create-ticket?spm=a2c63.p38356.0.0.583760760aj80E">submit a ticket</a> to create a customer master key (CMK) in KMS before you call this operation.</p>
     * 
     * @param request the request parameters of GenerateKMSDataKey  GenerateKMSDataKeyRequest
     * @return GenerateKMSDataKeyResponse
     */
    CompletableFuture<GenerateKMSDataKeyResponse> generateKMSDataKey(GenerateKMSDataKeyRequest request);

    /**
     * @param request the request parameters of GenerateMessageChatToken  GenerateMessageChatTokenRequest
     * @return GenerateMessageChatTokenResponse
     */
    CompletableFuture<GenerateMessageChatTokenResponse> generateMessageChatToken(GenerateMessageChatTokenRequest request);

    /**
     * @param request the request parameters of GetAIAgentConcurrency  GetAIAgentConcurrencyRequest
     * @return GetAIAgentConcurrencyResponse
     */
    CompletableFuture<GetAIAgentConcurrencyResponse> getAIAgentConcurrency(GetAIAgentConcurrencyRequest request);

    /**
     * @param request the request parameters of GetAIWorkflowTask  GetAIWorkflowTaskRequest
     * @return GetAIWorkflowTaskResponse
     */
    CompletableFuture<GetAIWorkflowTaskResponse> getAIWorkflowTask(GetAIWorkflowTaskRequest request);

    /**
     * @param request the request parameters of GetAdInsertion  GetAdInsertionRequest
     * @return GetAdInsertionResponse
     */
    CompletableFuture<GetAdInsertionResponse> getAdInsertion(GetAdInsertionRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>This API retrieves a list of authorization codes for a specific batch ID. You can filter the results by status and type.</li>
     * <li>Pagination is supported via the <code>PageNo</code> and <code>PageSize</code> parameters.</li>
     * <li>By default, the <code>NeedTotalCount</code> parameter is set to <code>true</code>, indicating that the response includes the total count of matching records.</li>
     * <li><code>LicenseItemId</code> is a required parameter that specifies the batch to query.</li>
     * </ul>
     * 
     * @param request the request parameters of GetAiRtcAuthCodeList  GetAiRtcAuthCodeListRequest
     * @return GetAiRtcAuthCodeListResponse
     */
    CompletableFuture<GetAiRtcAuthCodeListResponse> getAiRtcAuthCodeList(GetAiRtcAuthCodeListRequest request);

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <ul>
     * <li>Retrieve AI Real-Time Communication license batches based on filter criteria such as License Item ID, Status, and Type.</li>
     * <li>The <code>NeedTotalCount</code> parameter defaults to <code>true</code>. When set to true, the response includes the total count of matching entries. To exclude the total count, set this parameter to <code>false</code>.</li>
     * <li>If you do not specify any filter criteria, the operation returns the details for all license batches by default.</li>
     * </ul>
     * 
     * @param request the request parameters of GetAiRtcLicenseInfoList  GetAiRtcLicenseInfoListRequest
     * @return GetAiRtcLicenseInfoListResponse
     */
    CompletableFuture<GetAiRtcLicenseInfoListResponse> getAiRtcLicenseInfoList(GetAiRtcLicenseInfoListRequest request);

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
     * <p>Query the information about a category and its subcategories based on the category ID and category type.</p>
     * 
     * @param request the request parameters of GetCategories  GetCategoriesRequest
     * @return GetCategoriesResponse
     */
    CompletableFuture<GetCategoriesResponse> getCategories(GetCategoriesRequest request);

    /**
     * <b>description</b> :
     * <p>Calls the GetChannel operation to retrieve and assemble channel information.</p>
     * 
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
     * <p>This operation queries the information about a template with a specified ID based on TemplateId, or queries the information about the default template. If TemplateId is not empty, other parameters are ignored and the information about the template with the specified TemplateId is queried. If TemplateId is empty, the default template of the user is queried based on other parameters. In this case, Type is required.
     * templatetype (Type):</p>
     * <ol>
     * <li>1: Transcoding template</li>
     * <li>2: Snapshot template</li>
     * <li>3: Animated image template</li>
     * <li>4: Image watermark template</li>
     * <li>5: Text watermark template</li>
     * <li>6: Subtitle template</li>
     * <li>7: AI content moderation</li>
     * <li>8: AI smart cover</li>
     * <li>9: AI smart erasure
     * Subtype of the transcoding template (Subtype):</li>
     * <li>1: Normal transcoding template (Normal)</li>
     * <li>2: Audio transcoding template (AudioTranscode)</li>
     * <li>3: Remuxing (Remux)</li>
     * <li>4: Narrowband HD 1.0 (NarrowBandV1)</li>
     * <li>5: Narrowband HD 2.0 (NarrowBandV2)
     * Subtype of the snapshot template (Subtype):</li>
     * <li>1: Normal snapshot/Static snapshot (Normal)</li>
     * <li>2: Sprite snapshot (Sprite)</li>
     * <li>3: WebVTT snapshot (WebVtt)
     * Subtype of the AI content moderation template (Subtype):</li>
     * <li>1: Video moderation (Video) </li>
     * <li>2: Audio moderation (Audio)</li>
     * <li>3: Image moderation (Image)
     * Subtype of the AI smart erasure template (Subtype):</li>
     * <li>1: Icon erasure (VideoDelogo)</li>
     * <li>2: Subtitle erasure (VideoDetext)</li>
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
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Provide a library ID to retrieve the details of the hotword library, including the library name, description, and all hotwords with their properties. This operation is primarily used to manage and view the content of existing hotword libraries.</p>
     * 
     * @param request the request parameters of GetHotwordLibrary  GetHotwordLibraryRequest
     * @return GetHotwordLibraryResponse
     */
    CompletableFuture<GetHotwordLibraryResponse> getHotwordLibrary(GetHotwordLibraryRequest request);

    /**
     * @param request the request parameters of GetIpcDeviceInfo  GetIpcDeviceInfoRequest
     * @return GetIpcDeviceInfoResponse
     */
    CompletableFuture<GetIpcDeviceInfoResponse> getIpcDeviceInfo(GetIpcDeviceInfoRequest request);

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
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>You can use this API to query the details of a real-time packaging channel under a specified channel, including but not limited to the channel creation time, description, ingest endpoints, protocol, segment count, and segment duration.</p>
     * 
     * @param request the request parameters of GetLivePackageChannel  GetLivePackageChannelRequest
     * @return GetLivePackageChannelResponse
     */
    CompletableFuture<GetLivePackageChannelResponse> getLivePackageChannel(GetLivePackageChannelRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This API operation queries the detailed configurations of a specified channel group, including the channel group name, description, origin domain name, and the creation and last modification timestamps.</p>
     * 
     * @param request the request parameters of GetLivePackageChannelGroup  GetLivePackageChannelGroupRequest
     * @return GetLivePackageChannelGroupResponse
     */
    CompletableFuture<GetLivePackageChannelGroupResponse> getLivePackageChannelGroup(GetLivePackageChannelGroupRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description.</h2>
     * 
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
     * @param request the request parameters of GetMediaConnectAvailableRegion  GetMediaConnectAvailableRegionRequest
     * @return GetMediaConnectAvailableRegionResponse
     */
    CompletableFuture<GetMediaConnectAvailableRegionResponse> getMediaConnectAvailableRegion(GetMediaConnectAvailableRegionRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>If the specified flow instance ID does not exist, the API returns an error.</li>
     * <li>The StartTime returned by the API is valid only when the flow status is online.</li>
     * </ul>
     * 
     * @param request the request parameters of GetMediaConnectFlow  GetMediaConnectFlowRequest
     * @return GetMediaConnectFlowResponse
     */
    CompletableFuture<GetMediaConnectFlowResponse> getMediaConnectFlow(GetMediaConnectFlowRequest request);

    /**
     * @param request the request parameters of GetMediaConnectFlowAllOutputName  GetMediaConnectFlowAllOutputNameRequest
     * @return GetMediaConnectFlowAllOutputNameResponse
     */
    CompletableFuture<GetMediaConnectFlowAllOutputNameResponse> getMediaConnectFlowAllOutputName(GetMediaConnectFlowAllOutputNameRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>If the specified flow instance ID does not exist, the API returns an error.</li>
     * </ul>
     * 
     * @param request the request parameters of GetMediaConnectFlowInput  GetMediaConnectFlowInputRequest
     * @return GetMediaConnectFlowInputResponse
     */
    CompletableFuture<GetMediaConnectFlowInputResponse> getMediaConnectFlowInput(GetMediaConnectFlowInputRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>If the specified flow instance ID does not exist, the API operation returns an error.</li>
     * </ul>
     * 
     * @param request the request parameters of GetMediaConnectFlowOutput  GetMediaConnectFlowOutputRequest
     * @return GetMediaConnectFlowOutputResponse
     */
    CompletableFuture<GetMediaConnectFlowOutputResponse> getMediaConnectFlowOutput(GetMediaConnectFlowOutputRequest request);

    /**
     * @param request the request parameters of GetMediaConvertJob  GetMediaConvertJobRequest
     * @return GetMediaConvertJobResponse
     */
    CompletableFuture<GetMediaConvertJobResponse> getMediaConvertJob(GetMediaConvertJobRequest request);

    /**
     * <b>description</b> :
     * <p>If MediaId is not empty, it takes precedence. If MediaId is empty, InputURL must be specified.</p>
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
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>This operation can be called up to 50 times per second for each Alibaba Cloud account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of GetMediaLiveChannel  GetMediaLiveChannelRequest
     * @return GetMediaLiveChannelResponse
     */
    CompletableFuture<GetMediaLiveChannelResponse> getMediaLiveChannel(GetMediaLiveChannelRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Query the details of a media live input.</li>
     * </ul>
     * <h2>Queries per second (QPS) limit</h2>
     * <p>The queries per second (QPS) limit for this API is 50 requests per second per user. If this limit is exceeded, API calls will be subject to rate limiting, which may impact your business. Please invoke the API appropriately.</p>
     * 
     * @param request the request parameters of GetMediaLiveInput  GetMediaLiveInputRequest
     * @return GetMediaLiveInputResponse
     */
    CompletableFuture<GetMediaLiveInputResponse> getMediaLiveInput(GetMediaLiveInputRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>This operation can be called up to 50 times per second for each Alibaba Cloud account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of GetMediaLiveInputSecurityGroup  GetMediaLiveInputSecurityGroupRequest
     * @return GetMediaLiveInputSecurityGroupResponse
     */
    CompletableFuture<GetMediaLiveInputSecurityGroupResponse> getMediaLiveInputSecurityGroup(GetMediaLiveInputSecurityGroupRequest request);

    /**
     * @param request the request parameters of GetMediaMarks  GetMediaMarksRequest
     * @return GetMediaMarksResponse
     */
    CompletableFuture<GetMediaMarksResponse> getMediaMarks(GetMediaMarksRequest request);

    /**
     * <b>description</b> :
     * <h3>Limits</h3>
     * <p>This operation supports querying data of video editing tasks from the last three months.</p>
     * 
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
     * @param request the request parameters of GetStreamTagList  GetStreamTagListRequest
     * @return GetStreamTagListResponse
     */
    CompletableFuture<GetStreamTagListResponse> getStreamTagList(GetStreamTagListRequest request);

    /**
     * @param request the request parameters of GetSystemTemplate  GetSystemTemplateRequest
     * @return GetSystemTemplateResponse
     */
    CompletableFuture<GetSystemTemplateResponse> getSystemTemplate(GetSystemTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>The template factory encapsulates the editing and synthesis timeline. You can define commonly used timelines as templates. When similar requirements arise, you only need to pass key parameters and media assets to produce videos.</p>
     * <ul>
     * <li>To use standard templates, refer to <a href="https://help.aliyun.com/document_detail/445399.html">Quick start for standard templates</a>.</li>
     * <li>To use advanced templates, refer to <a href="https://help.aliyun.com/document_detail/445389.html">Create and use advanced templates</a>.</li>
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
     * <b>description</b> :
     * <p>&lt;props=&quot;intl&quot;&gt;This API operation will be deprecated soon. Call <a href="https://help.aliyun.com/document_detail/2867675.html">GetMediaConvertJob - Query a media transcoding job</a>.</p>
     * 
     * @param request the request parameters of GetTranscodeJob  GetTranscodeJobRequest
     * @return GetTranscodeJobResponse
     */
    CompletableFuture<GetTranscodeJobResponse> getTranscodeJob(GetTranscodeJobRequest request);

    /**
     * <b>description</b> :
     * <p>Query the information, including the upload status, user data, creation time, and completion time, about URL-based upload jobs based on the returned job IDs or the URLs used during the upload.
     * If an upload job fails, you can view the error code and error message. If an upload job is successful, you can obtain the video ID.</p>
     * 
     * @param request the request parameters of GetUrlUploadInfos  GetUrlUploadInfosRequest
     * @return GetUrlUploadInfosResponse
     */
    CompletableFuture<GetUrlUploadInfosResponse> getUrlUploadInfos(GetUrlUploadInfosRequest request);

    /**
     * <b>description</b> :
     * <p>This operation retrieves up to 5,000 audio and video files that meet specified filter conditions, such as video status and category ID. Specify StartTime and EndTime to retrieve data in batches.</p>
     * 
     * @param request the request parameters of GetVideoList  GetVideoListRequest
     * @return GetVideoListResponse
     */
    CompletableFuture<GetVideoListResponse> getVideoList(GetVideoListRequest request);

    /**
     * @param request the request parameters of GetVodPackagingAsset  GetVodPackagingAssetRequest
     * @return GetVodPackagingAssetResponse
     */
    CompletableFuture<GetVodPackagingAssetResponse> getVodPackagingAsset(GetVodPackagingAssetRequest request);

    /**
     * @param request the request parameters of GetVodPackagingConfiguration  GetVodPackagingConfigurationRequest
     * @return GetVodPackagingConfigurationResponse
     */
    CompletableFuture<GetVodPackagingConfigurationResponse> getVodPackagingConfiguration(GetVodPackagingConfigurationRequest request);

    /**
     * @param request the request parameters of GetVodPackagingGroup  GetVodPackagingGroupRequest
     * @return GetVodPackagingGroupResponse
     */
    CompletableFuture<GetVodPackagingGroupResponse> getVodPackagingGroup(GetVodPackagingGroupRequest request);

    /**
     * @param request the request parameters of GetWorkflowTask  GetWorkflowTaskRequest
     * @return GetWorkflowTaskResponse
     */
    CompletableFuture<GetWorkflowTaskResponse> getWorkflowTask(GetWorkflowTaskRequest request);

    /**
     * @param request the request parameters of GetYikeAIAppJob  GetYikeAIAppJobRequest
     * @return GetYikeAIAppJobResponse
     */
    CompletableFuture<GetYikeAIAppJobResponse> getYikeAIAppJob(GetYikeAIAppJobRequest request);

    /**
     * @param request the request parameters of GetYikeAssetMediaInfo  GetYikeAssetMediaInfoRequest
     * @return GetYikeAssetMediaInfoResponse
     */
    CompletableFuture<GetYikeAssetMediaInfoResponse> getYikeAssetMediaInfo(GetYikeAssetMediaInfoRequest request);

    /**
     * @param request the request parameters of GetYikeStoryboardJob  GetYikeStoryboardJobRequest
     * @return GetYikeStoryboardJobResponse
     */
    CompletableFuture<GetYikeStoryboardJobResponse> getYikeStoryboardJob(GetYikeStoryboardJobRequest request);

    /**
     * @param request the request parameters of GetYikeUser  GetYikeUserRequest
     * @return GetYikeUserResponse
     */
    CompletableFuture<GetYikeUserResponse> getYikeUser(GetYikeUserRequest request);

    /**
     * @param request the request parameters of GetYikeUserCredit  GetYikeUserCreditRequest
     * @return GetYikeUserCreditResponse
     */
    CompletableFuture<GetYikeUserCreditResponse> getYikeUserCredit(GetYikeUserCreditRequest request);

    /**
     * <b>description</b> :
     * <h3>Prerequisites</h3>
     * <p>Before inserting a media asset into the search library, you must call the <a href="https://help.aliyun.com/document_detail/2584454.html">CreateSearchLib</a> API to create the search library.</p>
     * 
     * @param request the request parameters of InsertMediaToSearchLib  InsertMediaToSearchLibRequest
     * @return InsertMediaToSearchLibResponse
     */
    CompletableFuture<InsertMediaToSearchLibResponse> insertMediaToSearchLib(InsertMediaToSearchLibRequest request);

    /**
     * @param request the request parameters of ListAIAgentDialogues  ListAIAgentDialoguesRequest
     * @return ListAIAgentDialoguesResponse
     */
    CompletableFuture<ListAIAgentDialoguesResponse> listAIAgentDialogues(ListAIAgentDialoguesRequest request);

    /**
     * <b>description</b> :
     * <p>This operation allows you to query a list of AI agent instances based on a specified agent ID (<code>AIAgentId</code>), and optional parameters such as the time range (<code>StartTime</code> and <code>EndTime</code>), number of entries per page (<code>PageSize</code>), and current page number (<code>PageNumber</code>). The response includes the status, runtime configuration, template configuration, user-defined data, and the download URL for the conversation call logs of each instance.</p>
     * <blockquote>
     * <p>Notice: Default values for pagination parameters: PageSize is 10, and PageNumber is 1.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListAIAgentInstance  ListAIAgentInstanceRequest
     * @return ListAIAgentInstanceResponse
     */
    CompletableFuture<ListAIAgentInstanceResponse> listAIAgentInstance(ListAIAgentInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>This operation allows you to query user phone number resources by specifying the number of records per page (PageSize) and the current page number (PageNumber). The response includes phone numbers and their corresponding statuses.</p>
     * 
     * @param request the request parameters of ListAIAgentPhoneNumber  ListAIAgentPhoneNumberRequest
     * @return ListAIAgentPhoneNumberResponse
     */
    CompletableFuture<ListAIAgentPhoneNumberResponse> listAIAgentPhoneNumber(ListAIAgentPhoneNumberRequest request);

    /**
     * @param request the request parameters of ListAIAgentVoiceprints  ListAIAgentVoiceprintsRequest
     * @return ListAIAgentVoiceprintsResponse
     */
    CompletableFuture<ListAIAgentVoiceprintsResponse> listAIAgentVoiceprints(ListAIAgentVoiceprintsRequest request);

    /**
     * @param request the request parameters of ListAdInsertions  ListAdInsertionsRequest
     * @return ListAdInsertionsResponse
     */
    CompletableFuture<ListAdInsertionsResponse> listAdInsertions(ListAdInsertionsRequest request);

    /**
     * <b>description</b> :
     * <p>Calls the ListAlerts operation to retrieve source alert information.</p>
     * 
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
     * <b>description</b> :
     * <p>Calls the ListChannelAlerts operation to retrieve the alert information of resources in a channel.</p>
     * 
     * @param request the request parameters of ListChannelAlerts  ListChannelAlertsRequest
     * @return ListChannelAlertsResponse
     */
    CompletableFuture<ListChannelAlertsResponse> listChannelAlerts(ListChannelAlertsRequest request);

    /**
     * <b>description</b> :
     * <p>Calls the ListChannels operation to list and assemble channels.</p>
     * 
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
     * <p>This operation queries the file list by DNA library ID and supports paging.</p>
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation queries the list of all hotword libraries created by users.</li>
     * <li>You can use the <code>Name</code> parameter for fuzzy search. Pagination and time range filtering are supported.</li>
     * <li>By default, the results are sorted in descending order of creation time. You can use the <code>SortBy</code> parameter to adjust the sorting method.</li>
     * <li>The maximum number of records returned per request is 100. The default value is 10.</li>
     * <li>You can use the <code>NextToken</code> parameter to read data in pages.</li>
     * </ul>
     * 
     * @param request the request parameters of ListHotwordLibraries  ListHotwordLibrariesRequest
     * @return ListHotwordLibrariesResponse
     */
    CompletableFuture<ListHotwordLibrariesResponse> listHotwordLibraries(ListHotwordLibrariesRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description.</h2>
     * 
     * @param request the request parameters of ListLivePackageChannelGroups  ListLivePackageChannelGroupsRequest
     * @return ListLivePackageChannelGroupsResponse
     */
    CompletableFuture<ListLivePackageChannelGroupsResponse> listLivePackageChannelGroups(ListLivePackageChannelGroupsRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation allows you to query the list of real-time packaging channels based on the specified <strong>GroupName</strong> and an optional <strong>Keyword</strong>. The results can be sorted in ascending or descending order by creation time, and paged query is supported to facilitate management and retrieve a large amount of channel information.</p>
     * <ul>
     * <li><strong>GroupName</strong> is required and specifies the channel group to which the channels belong.</li>
     * <li><strong>Keyword</strong> supports fuzzy match for channel names or descriptions, which helps quickly filter the required channels.</li>
     * <li>The <strong>PageNo</strong> and <strong>PageSize</strong> parameters help control the paging of returned results, facilitating batch data processing.</li>
     * <li>The <strong>SortBy</strong> parameter allows you to customize the sorting order of the results. The default value is descending order.
     * Check the returned <strong>RequestId</strong> for subsequent troubleshooting, and pay attention to <strong>TotalCount</strong> to understand the total number of channels that meet the conditional requirements.</li>
     * </ul>
     * 
     * @param request the request parameters of ListLivePackageChannels  ListLivePackageChannelsRequest
     * @return ListLivePackageChannelsResponse
     */
    CompletableFuture<ListLivePackageChannelsResponse> listLivePackageChannels(ListLivePackageChannelsRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This operation allows you to query the origin endpoints in the real-time packaging service based on a specified channel. The response includes detailed configuration information about the origin endpoints, such as the access URL, protocol type, and security policy. In addition, paging and sorting by creation time are supported.</p>
     * 
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
     * <ul>
     * <li>If the includeFileBasicInfo field is set to true, the basic information of the source file, such as the duration and file size, is also returned.</li>
     * <li>A maximum of 100 matching records are returned.</li>
     * <li>All matching media assets must exactly match all non-empty fields. The fields that support exact match include the media type, source, business type, category, and resource status of the media asset.</li>
     * <li>If all information cannot be returned at a time, you can use nextToken to query the next page.</li>
     * </ul>
     * 
     * @param request the request parameters of ListMediaBasicInfos  ListMediaBasicInfosRequest
     * @return ListMediaBasicInfosResponse
     */
    CompletableFuture<ListMediaBasicInfosResponse> listMediaBasicInfos(ListMediaBasicInfosRequest request);

    /**
     * @param request the request parameters of ListMediaConvertJobs  ListMediaConvertJobsRequest
     * @return ListMediaConvertJobsResponse
     */
    CompletableFuture<ListMediaConvertJobsResponse> listMediaConvertJobs(ListMediaConvertJobsRequest request);

    /**
     * @param request the request parameters of ListMediaInfoJobs  ListMediaInfoJobsRequest
     * @return ListMediaInfoJobsResponse
     */
    CompletableFuture<ListMediaInfoJobsResponse> listMediaInfoJobs(ListMediaInfoJobsRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Call this operation to query a list of media live channels.</li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>The queries per second (QPS) limit per user is 50. If the limit is exceeded, API calls are throttled, which may affect your services. Make API calls at a reasonable rate.</p>
     * 
     * @param request the request parameters of ListMediaLiveChannels  ListMediaLiveChannelsRequest
     * @return ListMediaLiveChannelsResponse
     */
    CompletableFuture<ListMediaLiveChannelsResponse> listMediaLiveChannels(ListMediaLiveChannelsRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>This operation can be called up to 50 times per second for each Alibaba Cloud account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of ListMediaLiveInputSecurityGroups  ListMediaLiveInputSecurityGroupsRequest
     * @return ListMediaLiveInputSecurityGroupsResponse
     */
    CompletableFuture<ListMediaLiveInputSecurityGroupsResponse> listMediaLiveInputSecurityGroups(ListMediaLiveInputSecurityGroupsRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can invoke this API to query the list of media live inputs.</li>
     * </ul>
     * <h2>QPS Limit</h2>
     * <p>The queries per second (QPS) limit for this API is 50 requests per second per user. If the limit is exceeded, API calls will be subject to rate limiting, which may impact your business. Please invoke the API appropriately.</p>
     * 
     * @param request the request parameters of ListMediaLiveInputs  ListMediaLiveInputsRequest
     * @return ListMediaLiveInputsResponse
     */
    CompletableFuture<ListMediaLiveInputsResponse> listMediaLiveInputs(ListMediaLiveInputsRequest request);

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
     * <b>description</b> :
     * <ul>
     * <li>This API operation is currently supported only in the China (Beijing), China (Shanghai), China (Hangzhou), and China (Shenzhen) regions.</li>
     * <li>The queries per second (QPS) limit per user is 50. If you exceed the limit, API calls are throttled, which may affect your services. Make API calls at a reasonable frequency. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limits</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ListRecognitionEntities  ListRecognitionEntitiesRequest
     * @return ListRecognitionEntitiesResponse
     */
    CompletableFuture<ListRecognitionEntitiesResponse> listRecognitionEntities(ListRecognitionEntitiesRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This API operation currently supports the China (Beijing), China (Shanghai), China (Hangzhou), and China (Shenzhen) regions. Other regions are not supported.</li>
     * <li>The queries per second (QPS) limit for a single user is 50. If the limit is exceeded, API calls are throttled, which may affect your business. Call this operation properly. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limits</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ListRecognitionLibs  ListRecognitionLibsRequest
     * @return ListRecognitionLibsResponse
     */
    CompletableFuture<ListRecognitionLibsResponse> listRecognitionLibs(ListRecognitionLibsRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This API operation is currently available in the China (Beijing), China (Shanghai), China (Hangzhou), and China (Shenzhen) regions. Other regions are not supported.</li>
     * <li>The queries per second (QPS) limit per user is 50. If this limit is exceeded, API calls are throttled, which may affect your services. Call the API operation at a reasonable frequency. For more information, see <a href="https://help.aliyun.com/document_detail/342832.html">QPS limits</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ListRecognitionSamples  ListRecognitionSamplesRequest
     * @return ListRecognitionSamplesResponse
     */
    CompletableFuture<ListRecognitionSamplesResponse> listRecognitionSamples(ListRecognitionSamplesRequest request);

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
     * <p>Template Factory encapsulates editing and synthesis timelines. You can define commonly used timelines as templates. When similar requirements arise, you only need to pass key parameters and media assets to produce videos.</p>
     * <ul>
     * <li>To use standard templates, refer to <a href="https://help.aliyun.com/document_detail/270942.html">Quick start for standard templates</a>.</li>
     * <li>To use advanced templates, refer to <a href="https://help.aliyun.com/document_detail/291418.html">Create and use advanced templates</a>.</li>
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
     * @param request the request parameters of ListVodPackagingAssets  ListVodPackagingAssetsRequest
     * @return ListVodPackagingAssetsResponse
     */
    CompletableFuture<ListVodPackagingAssetsResponse> listVodPackagingAssets(ListVodPackagingAssetsRequest request);

    /**
     * @param request the request parameters of ListVodPackagingConfigurations  ListVodPackagingConfigurationsRequest
     * @return ListVodPackagingConfigurationsResponse
     */
    CompletableFuture<ListVodPackagingConfigurationsResponse> listVodPackagingConfigurations(ListVodPackagingConfigurationsRequest request);

    /**
     * @param request the request parameters of ListVodPackagingGroups  ListVodPackagingGroupsRequest
     * @return ListVodPackagingGroupsResponse
     */
    CompletableFuture<ListVodPackagingGroupsResponse> listVodPackagingGroups(ListVodPackagingGroupsRequest request);

    /**
     * <b>description</b> :
     * <p>This operation returns only the instances executed within the last 90 days.</p>
     * 
     * @param request the request parameters of ListWorkflowTasks  ListWorkflowTasksRequest
     * @return ListWorkflowTasksResponse
     */
    CompletableFuture<ListWorkflowTasksResponse> listWorkflowTasks(ListWorkflowTasksRequest request);

    /**
     * @param request the request parameters of ListYikeAssetFolders  ListYikeAssetFoldersRequest
     * @return ListYikeAssetFoldersResponse
     */
    CompletableFuture<ListYikeAssetFoldersResponse> listYikeAssetFolders(ListYikeAssetFoldersRequest request);

    /**
     * @param request the request parameters of ListYikeProductions  ListYikeProductionsRequest
     * @return ListYikeProductionsResponse
     */
    CompletableFuture<ListYikeProductionsResponse> listYikeProductions(ListYikeProductionsRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before this operation, you must add a source to the flow.</li>
     * <li>After Source Failover is enabled, you can add an additional source. The input type of the two sources must be identical.</li>
     * </ul>
     * 
     * @param request the request parameters of OpenMediaConnectFlowFailover  OpenMediaConnectFlowFailoverRequest
     * @return OpenMediaConnectFlowFailoverResponse
     */
    CompletableFuture<OpenMediaConnectFlowFailoverResponse> openMediaConnectFlowFailover(OpenMediaConnectFlowFailoverRequest request);

    /**
     * @param request the request parameters of PrecheckYikeAIAppJob  PrecheckYikeAIAppJobRequest
     * @return PrecheckYikeAIAppJobResponse
     */
    CompletableFuture<PrecheckYikeAIAppJobResponse> precheckYikeAIAppJob(PrecheckYikeAIAppJobRequest request);

    /**
     * @param request the request parameters of QueryCopyrightExtractJob  QueryCopyrightExtractJobRequest
     * @return QueryCopyrightExtractJobResponse
     */
    CompletableFuture<QueryCopyrightExtractJobResponse> queryCopyrightExtractJob(QueryCopyrightExtractJobRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is supported only in the China (Shanghai) and China (Beijing) regions.</li>
     * </ul>
     * 
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
     * @param request the request parameters of QueryIpcQuota  QueryIpcQuotaRequest
     * @return QueryIpcQuotaResponse
     */
    CompletableFuture<QueryIpcQuotaResponse> queryIpcQuota(QueryIpcQuotaRequest request);

    /**
     * <b>description</b> :
     * <p>In the content moderation results, the video section forms a timeline sorted by time in ascending order. If the video is very long, the query returns the first page of information by default. To query the full results of the video section in detail, you can call this operation separately.</p>
     * 
     * @param request the request parameters of QueryMediaCensorJobDetail  QueryMediaCensorJobDetailRequest
     * @return QueryMediaCensorJobDetailResponse
     */
    CompletableFuture<QueryMediaCensorJobDetailResponse> queryMediaCensorJobDetail(QueryMediaCensorJobDetailRequest request);

    /**
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
     * <b>description</b> :
     * <ul>
     * <li>This operation is supported only in the China (Shanghai) and China (Beijing) regions.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryTraceAbJobList  QueryTraceAbJobListRequest
     * @return QueryTraceAbJobListResponse
     */
    CompletableFuture<QueryTraceAbJobListResponse> queryTraceAbJobList(QueryTraceAbJobListRequest request);

    /**
     * <b>description</b> :
     * <p>Currently, digital watermarking API operations are supported only in the China (Shanghai) and China (Beijing) regions.</p>
     * 
     * @param request the request parameters of QueryTraceExtractJob  QueryTraceExtractJobRequest
     * @return QueryTraceExtractJobResponse
     */
    CompletableFuture<QueryTraceExtractJobResponse> queryTraceExtractJob(QueryTraceExtractJobRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Currently, API operations related to digital watermarking are only supported in the China (Shanghai) and China (Beijing) regions.</li>
     * <li>The signature authentication for the absolute path of the m3u8 file generated by the video tracing watermark m3u8 job is valid for 24 hours (starting from the completion of processing). Query it promptly. After the signature authentication expires, the m3u8 file generated by the job cannot be accessed. If you need the file after expiration, commit the video tracing watermark m3u8 job again.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryTraceM3u8JobList  QueryTraceM3u8JobListRequest
     * @return QueryTraceM3u8JobListResponse
     */
    CompletableFuture<QueryTraceM3u8JobListResponse> queryTraceM3u8JobList(QueryTraceM3u8JobListRequest request);

    /**
     * @param request the request parameters of QueryVideoCognitionJob  QueryVideoCognitionJobRequest
     * @return QueryVideoCognitionJobResponse
     */
    CompletableFuture<QueryVideoCognitionJobResponse> queryVideoCognitionJob(QueryVideoCognitionJobRequest request);

    /**
     * @param request the request parameters of RefreshUploadMedia  RefreshUploadMediaRequest
     * @return RefreshUploadMediaResponse
     */
    CompletableFuture<RefreshUploadMediaResponse> refreshUploadMedia(RefreshUploadMediaRequest request);

    /**
     * <b>description</b> :
     * <p>Media asset registration is an asynchronous task that typically takes 2 to 3 seconds to complete. When the registration operation returns a mediaId, the media asset may not have been fully registered. In this case, calling <a href="https://help.aliyun.com/document_detail/441155.html">GetMediaInfo</a> may not return the file information of the media asset.</p>
     * 
     * @param request the request parameters of RegisterMediaInfo  RegisterMediaInfoRequest
     * @return RegisterMediaInfoResponse
     */
    CompletableFuture<RegisterMediaInfoResponse> registerMediaInfo(RegisterMediaInfoRequest request);

    /**
     * @param request the request parameters of RegisterMediaStream  RegisterMediaStreamRequest
     * @return RegisterMediaStreamResponse
     */
    CompletableFuture<RegisterMediaStreamResponse> registerMediaStream(RegisterMediaStreamRequest request);

    /**
     * @param request the request parameters of RegisterYikeAssetMediaInfo  RegisterYikeAssetMediaInfoRequest
     * @return RegisterYikeAssetMediaInfoResponse
     */
    CompletableFuture<RegisterYikeAssetMediaInfoResponse> registerYikeAssetMediaInfo(RegisterYikeAssetMediaInfoRequest request);

    /**
     * @param request the request parameters of ResumeMediaConnectFlowOutput  ResumeMediaConnectFlowOutputRequest
     * @return ResumeMediaConnectFlowOutputResponse
     */
    CompletableFuture<ResumeMediaConnectFlowOutputResponse> resumeMediaConnectFlowOutput(ResumeMediaConnectFlowOutputRequest request);

    /**
     * @param request the request parameters of ResumeYikeStoryboardJob  ResumeYikeStoryboardJobRequest
     * @return ResumeYikeStoryboardJobResponse
     */
    CompletableFuture<ResumeYikeStoryboardJobResponse> resumeYikeStoryboardJob(ResumeYikeStoryboardJobRequest request);

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
     * <p>For usage inquiries or consultations regarding the intelligent media asset search feature of Intelligent Media Services, search for the DingTalk group ID 30415005038 to join the IMS Multimodal Search Customer Support group and contact us.</p>
     * 
     * @param request the request parameters of SearchMedia  SearchMediaRequest
     * @return SearchMediaResponse
     */
    CompletableFuture<SearchMediaResponse> searchMedia(SearchMediaRequest request);

    /**
     * <b>description</b> :
     * <p>Performs a multimodal search based on person names, subtitles, and AI categories. Coarse search returns results at the media asset granularity, while precise search returns matched segment information within the media asset.</p>
     * 
     * @param request the request parameters of SearchMediaByAILabel  SearchMediaByAILabelRequest
     * @return SearchMediaByAILabelResponse
     */
    CompletableFuture<SearchMediaByAILabelResponse> searchMediaByAILabel(SearchMediaByAILabelRequest request);

    /**
     * <b>description</b> :
     * <p>To use the intelligent media asset search feature of Alibaba Cloud Intelligent Media Services or to consult about related issues, search for DingTalk group (30415005038) to join the Intelligent Media Services multimodal search customer support group and contact us.</p>
     * 
     * @param request the request parameters of SearchMediaByFace  SearchMediaByFaceRequest
     * @return SearchMediaByFaceResponse
     */
    CompletableFuture<SearchMediaByFaceResponse> searchMediaByFace(SearchMediaByFaceRequest request);

    /**
     * <b>description</b> :
     * <p>For usage inquiries or consultations regarding the intelligent media asset search feature of Alibaba Cloud Intelligent Media Services, search for the DingTalk group (30415005038) to join the Intelligent Media Services multimodal search customer support group and contact us.</p>
     * 
     * @param request the request parameters of SearchMediaByHybrid  SearchMediaByHybridRequest
     * @return SearchMediaByHybridResponse
     */
    CompletableFuture<SearchMediaByHybridResponse> searchMediaByHybrid(SearchMediaByHybridRequest request);

    /**
     * <b>description</b> :
     * <p>For usage inquiries or consultations regarding the intelligent media asset search feature of Alibaba Cloud Intelligent Media Services, search for the DingTalk group 30415005038 to join the Intelligent Media Services multimodal search customer support group and contact us.</p>
     * 
     * @param request the request parameters of SearchMediaByMultimodal  SearchMediaByMultimodalRequest
     * @return SearchMediaByMultimodalResponse
     */
    CompletableFuture<SearchMediaByMultimodalResponse> searchMediaByMultimodal(SearchMediaByMultimodalRequest request);

    /**
     * <b>description</b> :
     * <p>For usage inquiries or consultations regarding the intelligent media asset search feature of Alibaba Cloud Intelligent Media Services, search for the DingTalk group 30415005038 to join the Intelligent Media Services multimodal search customer support group and contact us.</p>
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
     * <b>description</b> :
     * <p>Use this operation to immediately instruct an AI agent instance to broadcast a voice message by passing specified text content. You can optionally allow this broadcast to interrupt the current voice playback. By default, interruption is allowed.
     * <strong>Note:</strong></p>
     * <ul>
     * <li>InstanceId must be valid and correspond to an existing agent instance.</li>
     * <li>The content of Text must comply with specifications and avoid sensitive or inappropriate information.</li>
     * <li>To prevent the new broadcast from interrupting the current voice, explicitly set EnableInterrupt to false.</li>
     * </ul>
     * 
     * @param request the request parameters of SendAIAgentSpeech  SendAIAgentSpeechRequest
     * @return SendAIAgentSpeechResponse
     */
    CompletableFuture<SendAIAgentSpeechResponse> sendAIAgentSpeech(SendAIAgentSpeechRequest request);

    /**
     * @param request the request parameters of SendAIAgentText  SendAIAgentTextRequest
     * @return SendAIAgentTextResponse
     */
    CompletableFuture<SendAIAgentTextResponse> sendAIAgentText(SendAIAgentTextRequest request);

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
     * @param request the request parameters of SendMessageChatText  SendMessageChatTextRequest
     * @return SendMessageChatTextResponse
     */
    CompletableFuture<SendMessageChatTextResponse> sendMessageChatText(SendMessageChatTextRequest request);

    /**
     * @param request the request parameters of SetAIAgentVoiceprint  SetAIAgentVoiceprintRequest
     * @return SetAIAgentVoiceprintResponse
     */
    CompletableFuture<SetAIAgentVoiceprintResponse> setAIAgentVoiceprint(SetAIAgentVoiceprintRequest request);

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
     * <b>description</b> :
     * <p>-Intelligent Media Services can use Object Storage Service (OSS) or ApsaraVideo VOD storage. Activate the corresponding service based on the storage type you need. The differences are as follows:</p>
     * <ul>
     * <li>ApsaraVideo VOD storage: ApsaraVideo VOD provides a one-stop audio and video Solutions that includes video storage, media asset management, and CDN playback services. When you store media assets in ApsaraVideo VOD, Intelligent Media Services enhances VOD capabilities, enabling rapid development and launch of video services based on the APIs provided by ApsaraVideo VOD.</li>
     * <li>Object Storage Service: OSS is a massive, secure, low-cost, and highly durable cloud storage service provided by Alibaba Cloud. You can develop multi-scenario audio and video services based on the capabilities of Intelligent Media Services and OSS.
     * -You can also configure the storage address in the console. For details, see <a href="https://help.aliyun.com/document_detail/609918.html">Configure storage address</a>.
     * -Storage fees are billed in OSS or ApsaraVideo VOD based on the storage address you configure. For details, see <a href="https://help.aliyun.com/document_detail/440701.html">Media asset storage billing</a>.</li>
     * </ul>
     * 
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
     * <b>description</b> :
     * <h2>Description</h2>
     * <p>This operation configures event notification settings for an AI Agent instance. You can enable or disable event notifications, specify the Callback URL, and define the Event Types to subscribe to. You can also provide an Authentication Token for enhanced security. A successful request returns a unique Request ID for tracking and troubleshooting.</p>
     * 
     * @param request the request parameters of SetNotifyConfig  SetNotifyConfigRequest
     * @return SetNotifyConfigResponse
     */
    CompletableFuture<SetNotifyConfigResponse> setNotifyConfig(SetNotifyConfigRequest request);

    /**
     * @param request the request parameters of SetYikeUserRole  SetYikeUserRoleRequest
     * @return SetYikeUserRoleResponse
     */
    CompletableFuture<SetYikeUserRoleResponse> setYikeUserRole(SetYikeUserRoleRequest request);

    /**
     * <b>description</b> :
     * <p>Use this API to start a configured AI agent instance and engage it in a conversation. You must provide the agent ID (<code>AIAgentId</code>) and runtime configuration (<code>RuntimeConfig</code>). Optional parameters include the template configuration (<code>TemplateConfig</code>) and user-defined information (<code>UserData</code>). After the agent instance is successfully started, a unique <code>InstanceId</code> is returned for subsequent tracking or operations.</p>
     * 
     * @param request the request parameters of StartAIAgentInstance  StartAIAgentInstanceRequest
     * @return StartAIAgentInstanceResponse
     */
    CompletableFuture<StartAIAgentInstanceResponse> startAIAgentInstance(StartAIAgentInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>You can use this API operation to start a configured AI agent instance and initiate an outbound call to a specified callee number. After the agent instance is started, a unique <code>InstanceId</code> is returned for subsequent tracking or operations. Each caller number <strong>supports up to 15 concurrent calls</strong>.</p>
     * 
     * @param request the request parameters of StartAIAgentOutboundCall  StartAIAgentOutboundCallRequest
     * @return StartAIAgentOutboundCallResponse
     */
    CompletableFuture<StartAIAgentOutboundCallResponse> startAIAgentOutboundCall(StartAIAgentOutboundCallRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>When you initiate an intelligent workflow task, you must specify an intelligent workflow template. You can create an intelligent workflow template in the <a href="https://ims.console.aliyun.com/ai-workflow/template">Intelligent Media Services console</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of StartAIWorkflow  StartAIWorkflowRequest
     * @return StartAIWorkflowResponse
     */
    CompletableFuture<StartAIWorkflowResponse> startAIWorkflow(StartAIWorkflowRequest request);

    /**
     * @param request the request parameters of StartChannel  StartChannelRequest
     * @return StartChannelResponse
     */
    CompletableFuture<StartChannelResponse> startChannel(StartChannelRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Starts a channel only when the channel is idle. You cannot start a channel repeatedly.</li>
     * </ul>
     * <h2>QPS limit</h2>
     * <p>This operation can be called up to 50 times per second for each Alibaba Cloud account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of StartMediaLiveChannel  StartMediaLiveChannelRequest
     * @return StartMediaLiveChannelResponse
     */
    CompletableFuture<StartMediaLiveChannelResponse> startMediaLiveChannel(StartMediaLiveChannelRequest request);

    /**
     * @param request the request parameters of StartRtcRobotInstance  StartRtcRobotInstanceRequest
     * @return StartRtcRobotInstanceResponse
     */
    CompletableFuture<StartRtcRobotInstanceResponse> startRtcRobotInstance(StartRtcRobotInstanceRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Currently, only Intelligent Media Services (IMS) media assets and ApsaraVideo VOD media assets are supported as workflow inputs.</li>
     * <li>When you initiate a workflow task, specify a workflow template. You can create a workflow template in the <a href="https://ims.console.aliyun.com/settings/workflow/list">Intelligent Media Services console</a> or use a preset template.</li>
     * </ul>
     * 
     * @param request the request parameters of StartWorkflow  StartWorkflowRequest
     * @return StartWorkflowResponse
     */
    CompletableFuture<StartWorkflowResponse> startWorkflow(StartWorkflowRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Feature description</strong>: This operation stops and terminates a running agent instance and releases related resources.</li>
     * <li><strong>Parameter notes</strong>: You must provide the unique ID (InstanceId) of the instance to be stopped as a query parameter.</li>
     * <li><strong>Common scenarios</strong>: Invoke this operation to end the running of an agent when the agent is no longer needed for a call or node.</li>
     * </ul>
     * 
     * @param request the request parameters of StopAIAgentInstance  StopAIAgentInstanceRequest
     * @return StopAIAgentInstanceResponse
     */
    CompletableFuture<StopAIAgentInstanceResponse> stopAIAgentInstance(StopAIAgentInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>This operation stops intelligent workflow tasks only in real-time scenarios such as live streaming and RTC, and does not support stopping tasks in offline scenarios.</p>
     * 
     * @param request the request parameters of StopAIWorkflowTask  StopAIWorkflowTaskRequest
     * @return StopAIWorkflowTaskResponse
     */
    CompletableFuture<StopAIWorkflowTaskResponse> stopAIWorkflowTask(StopAIWorkflowTaskRequest request);

    /**
     * <b>description</b> :
     * <p>Calls the StopChannel operation to stop a channel.</p>
     * 
     * @param request the request parameters of StopChannel  StopChannelRequest
     * @return StopChannelResponse
     */
    CompletableFuture<StopChannelResponse> stopChannel(StopChannelRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Call this operation to stop a media live channel.</li>
     * <li>You can call this operation to stop a media live channel only after it is started. You cannot stop a channel that is not started.</li>
     * </ul>
     * <h2>QPS limits</h2>
     * <p>The QPS limit per user is 50 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Make API calls at a reasonable rate.</p>
     * 
     * @param request the request parameters of StopMediaLiveChannel  StopMediaLiveChannelRequest
     * @return StopMediaLiveChannelResponse
     */
    CompletableFuture<StopMediaLiveChannelResponse> stopMediaLiveChannel(StopMediaLiveChannelRequest request);

    /**
     * @param request the request parameters of StopRtcRobotInstance  StopRtcRobotInstanceRequest
     * @return StopRtcRobotInstanceResponse
     */
    CompletableFuture<StopRtcRobotInstanceResponse> stopRtcRobotInstance(StopRtcRobotInstanceRequest request);

    /**
     * @param request the request parameters of SubYikeUserCredit  SubYikeUserCreditRequest
     * @return SubYikeUserCreditResponse
     */
    CompletableFuture<SubYikeUserCreditResponse> subYikeUserCredit(SubYikeUserCreditRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the SubmitAIAgentVideoAuditTask operation to submit a moderation task with configurations such as the video URL, frame capture policy, and moderation interval. The system returns a unique JobId for task tracking. After the task is completed, the system pushes the moderation results, including the moderation status and AI evaluation content, to your configured callback URL. Only OSS video URLs are supported. Multimodal large language models (MLLMs) support only the non-streaming OpenAI protocol. For more information about the response of the non-streaming OpenAI protocol, refer to <a href="https://help.aliyun.com/document_detail/2839094.html">Standard API reference for self-developed models</a>.</p>
     * 
     * @param request the request parameters of SubmitAIAgentVideoAuditTask  SubmitAIAgentVideoAuditTaskRequest
     * @return SubmitAIAgentVideoAuditTaskResponse
     */
    CompletableFuture<SubmitAIAgentVideoAuditTaskResponse> submitAIAgentVideoAuditTask(SubmitAIAgentVideoAuditTaskRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is an <a href="https://help.aliyun.com/document_detail/3027141.html">asynchronous operation</a>. After you commit a node, a node ID is returned. The node is not completed at this time, enters the background queue, and will execute asynchronously. The final result is notified through a callback. You can also call the <a href="https://help.aliyun.com/document_detail/441172.html">Retrieve smart task result</a> operation to actively query the node status.</p>
     * 
     * @param request the request parameters of SubmitASRJob  SubmitASRJobRequest
     * @return SubmitASRJobResponse
     */
    CompletableFuture<SubmitASRJobResponse> submitASRJob(SubmitASRJobRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is an <a href="https://help.aliyun.com/document_detail/3027141.html">asynchronous operation</a>. After a task is submitted, a task ID is returned. The task is not completed at this point and enters a background queue for asynchronous execution. The final result is delivered through a callback notification. You can also proactively query the task status by calling the <a href="https://help.aliyun.com/document_detail/441172.html">Query intelligent task results</a> operation.</p>
     * 
     * @param request the request parameters of SubmitAudioProduceJob  SubmitAudioProduceJobRequest
     * @return SubmitAudioProduceJobResponse
     */
    CompletableFuture<SubmitAudioProduceJobResponse> submitAudioProduceJob(SubmitAudioProduceJobRequest request);

    /**
     * <b>description</b> :
     * <p>This is an <a href="https://help.aliyun.com/document_detail/3027141.html">asynchronous API</a>. When you call this operation, it returns a JobId and queues the training job for background processing. The initial response confirms the job submission, not its completion. The final result is sent via a callback notification, or you can check the job\&quot;s status by <a href="https://help.aliyun.com/document_detail/2526661.html">querying the details of an avatar training job</a>.</p>
     * 
     * @param request the request parameters of SubmitAvatarTrainingJob  SubmitAvatarTrainingJobRequest
     * @return SubmitAvatarTrainingJobResponse
     */
    CompletableFuture<SubmitAvatarTrainingJobResponse> submitAvatarTrainingJob(SubmitAvatarTrainingJobRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is an <a href="https://help.aliyun.com/document_detail/3027141.html">asynchronous operation</a>. After a node is committed, a node ID is returned. The node is not completed immediately and enters a background queue to execute asynchronously. The final result is sent through a callback notification. You can also call the <a href="https://help.aliyun.com/document_detail/441172.html">Get smart node task result</a> operation to query the node status.</li>
     * <li>Currently, only text or human voice audio is supported as input. Audio files support only the MP3 or WAV format.</li>
     * <li>Both MP4 and WebM output formats are supported. When the output format is MP4, the final video has a green screen background, and a mask video of the virtual human is also generated for subsequent use. This method is recommended. When the output format is WebM, the final video is a WebM file with a transparent channel, which is active for frontend display. However, the synthesis is slower due to WebM encoding issues.</li>
     * <li>The output result includes sentence UNIX timestamps of the human voice for subsequent use in editing.</li>
     * </ul>
     * 
     * @param request the request parameters of SubmitAvatarVideoJob  SubmitAvatarVideoJobRequest
     * @return SubmitAvatarVideoJobResponse
     */
    CompletableFuture<SubmitAvatarVideoJobResponse> submitAvatarVideoJob(SubmitAvatarVideoJobRequest request);

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>To use intelligent one-click video production, you must first purchase the [IMS subscription service]. For more information, see <a href="~~439260#3285adfad70dw~~">Subscription billing</a>.
     * &lt;props=&quot;china&quot;&gt;</li>
     * <li>For the billing rules of intelligent one-click video production, see <a href="https://help.aliyun.com/document_detail/2840901.html">Intelligent one-click video production</a>.</li>
     * <li>Intelligent one-click video production is an <a href="https://help.aliyun.com/document_detail/3027141.html">asynchronous operation</a>. After you submit a task, a task ID is returned. The task is not yet complete at this point and enters a queue for asynchronous execution. The final result is delivered through a callback notification. You can also proactively query the task status by calling <a href="https://help.aliyun.com/document_detail/2693269.html">GetBatchMediaProducingJob</a>.</li>
     * <li>Intelligent one-click video production provides multiple solutions, including [Scripted automatic video production], [Intelligent text-image matching video production - General scenario], [Intelligent text-image matching video production - Film highlights], [Sports event highlights production], and [High-energy remix production]. For more information about the features, see <a href="https://help.aliyun.com/document_detail/2689046.html">Intelligent one-click video production</a>.</li>
     * <li>Scripted automatic video production and intelligent text-image matching video production share the same task submission API. For information about how to distinguish between them by using parameters, see <a href="https://help.aliyun.com/document_detail/2846101.html">Parameter differences for intelligent one-click video production</a>.</li>
     * <li>After you submit a batch intelligent one-click video production task, you can call <a href="https://help.aliyun.com/document_detail/2803751.html">ListBatchMediaProducingJob</a> to obtain a list of all eligible one-click video production tasks. Call <a href="https://help.aliyun.com/document_detail/2693269.html">GetBatchMediaProducingJob</a> to obtain detailed task information, including the task status, produced media asset IDs, and URLs.</li>
     * </ul>
     * 
     * @param request the request parameters of SubmitBatchMediaProducingJob  SubmitBatchMediaProducingJobRequest
     * @return SubmitBatchMediaProducingJobResponse
     */
    CompletableFuture<SubmitBatchMediaProducingJobResponse> submitBatchMediaProducingJob(SubmitBatchMediaProducingJobRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Digital watermarking API operations are currently supported only in the China (Shanghai) and China (Beijing) regions.</li>
     * <li>This is an <a href="https://help.aliyun.com/document_detail/3027141.html">asynchronous API operation</a>. After you submit a job, a job ID is returned. The job is not completed immediately and is queued for asynchronous execution in the background. The final result is sent through a callback notification. You can also actively query the job status by calling the <a href="https://help.aliyun.com/document_detail/2862132.html">Query a copyright watermark extraction job</a> operation.</li>
     * </ul>
     * 
     * @param request the request parameters of SubmitCopyrightExtractJob  SubmitCopyrightExtractJobRequest
     * @return SubmitCopyrightExtractJobResponse
     */
    CompletableFuture<SubmitCopyrightExtractJobResponse> submitCopyrightExtractJob(SubmitCopyrightExtractJobRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>By default, committing a video copyright watermark job supports only videos that are 3 minutes or longer. If the video is too short, it may result in a failed API invocation or no output. To add a copyright watermark to a short video of less than 3 minutes, specify the parameter in Params. For more information, see the parameter description.</li>
     * <li>Each time you invoke the API to commit a video copyright watermark job, a watermark is added to a single video. Committing multiple videos at the same time is not supported.</li>
     * <li>Currently, API operations related to digital watermarking are supported only in the China (Shanghai) and China (Beijing) regions.</li>
     * <li>This is an <a href="https://help.aliyun.com/document_detail/3027141.html">asynchronous API operation</a>. After you commit the node, a node ID is returned. The node is not completed at this time and enters the background queue to execute asynchronously. The final result is notified by a callback. You can also actively query the node status by calling the <a href="https://help.aliyun.com/document_detail/2862135.html">List video copyright watermark jobs</a> operation.</li>
     * </ul>
     * 
     * @param request the request parameters of SubmitCopyrightJob  SubmitCopyrightJobRequest
     * @return SubmitCopyrightJobResponse
     */
    CompletableFuture<SubmitCopyrightJobResponse> submitCopyrightJob(SubmitCopyrightJobRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>During training, you can call the <a href="https://help.aliyun.com/document_detail/2384473.html">GetCustomizedVoiceJob - Query a voice cloning job</a> operation to check the job completion and training status.</li>
     * <li>This operation is an <a href="https://help.aliyun.com/document_detail/3027141.html">asynchronous operation</a>. After you submit the job, a job ID is returned. The job is not completed immediately and is queued for asynchronous execution in the background. You can call <a href="https://help.aliyun.com/document_detail/2384473.html">Query a voice cloning job</a> to query the job status and obtain the final result.</li>
     * <li>Note that each account supports a maximum of 30 cloned voices per region. Quota increases are not supported at this time.</li>
     * </ul>
     * 
     * @param request the request parameters of SubmitCosyVoiceCustomizedVoiceJob  SubmitCosyVoiceCustomizedVoiceJobRequest
     * @return SubmitCosyVoiceCustomizedVoiceJobResponse
     */
    CompletableFuture<SubmitCosyVoiceCustomizedVoiceJobResponse> submitCosyVoiceCustomizedVoiceJob(SubmitCosyVoiceCustomizedVoiceJobRequest request);

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;- Voice cloning billing is divided into two dimensions: customization and usage. For more information, see <a href="~~2399891#section-gy3-80e-clt~~">Voice cloning billing</a>.</p>
     * <ul>
     * <li>When submitting a voice cloning task, the VoiceId must be the same as the one used during audio detection. The cloud relies on this parameter to locate the staged audio for training.  </li>
     * <li>During training, you can call the <a href="https://help.aliyun.com/document_detail/2384473.html">GetCustomizedVoiceJob</a> operation to check whether the current task is completed or to obtain the training status.</li>
     * <li>This is an <a href="https://help.aliyun.com/document_detail/3027141.html">asynchronous operation</a>. After you submit the task, a task ID is returned (the task is not yet completed at this point and enters a background queue for asynchronous execution). The final result is delivered through a callback notification. You can also proactively query the task status by calling <a href="https://help.aliyun.com/document_detail/2384473.html">GetCustomizedVoiceJob</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of SubmitCustomizedVoiceJob  SubmitCustomizedVoiceJobRequest
     * @return SubmitCustomizedVoiceJobResponse
     */
    CompletableFuture<SubmitCustomizedVoiceJobResponse> submitCustomizedVoiceJob(SubmitCustomizedVoiceJobRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is an <a href="https://help.aliyun.com/document_detail/3027141.html">asynchronous operation</a>. After you submit a task, a task ID is returned. The task is not completed at this time and enters the background queue for asynchronous execution. The final result is notified through a callback. You can also call the <a href="https://help.aliyun.com/document_detail/479279.html">List DNA jobs</a> operation to query the task status.</li>
     * <li>This operation is currently supported in the China (Beijing), China (Hangzhou), and China (Shanghai) regions.</li>
     * <li>Submitting text DNA jobs is currently supported only in the China (Shanghai) region.</li>
     * </ul>
     * 
     * @param request the request parameters of SubmitDNAJob  SubmitDNAJobRequest
     * @return SubmitDNAJobResponse
     */
    CompletableFuture<SubmitDNAJobResponse> submitDNAJob(SubmitDNAJobRequest request);

    /**
     * <b>description</b> :
     * <p>Generates chart videos based on Excel data. Line charts, bar charts, and pie charts are supported. This feature is available only in the China (Shanghai) region.</p>
     * <ul>
     * <li>Supports setting text such as the chart title, subtitle, data source, and unit, and allows you to set the font and font size of the text. For supported fonts, see <a href="https://help.aliyun.com/document_detail/449567.html">Font list</a>.</li>
     * <li>Supports five built-in styles. Valid values: Normal, Mystery, Lively, Business, and Green.</li>
     * <li>Supports setting the background color and background image.</li>
     * <li>Supports setting the video duration, dimensions, and bitrate.
     * Examples:</li>
     * <li>Line chart: <a href="https://ice-public-media.oss-cn-shanghai.aliyuncs.com/smart/dynamicChart/line.xlsx">Excel sample</a>, <a href="https://ice-public-media.oss-cn-shanghai.aliyuncs.com/smart/dynamicChart/line.mp4">Generated video</a>.</li>
     * <li>Bar chart: <a href="https://ice-public-media.oss-cn-shanghai.aliyuncs.com/smart/dynamicChart/histgram.xlsx">Excel sample</a>, <a href="https://ice-public-media.oss-cn-shanghai.aliyuncs.com/smart/dynamicChart/histgram.mp4">Generated video</a>.</li>
     * <li>Pie chart: <a href="https://ice-public-media.oss-cn-shanghai.aliyuncs.com/smart/dynamicChart/pie.xlsx">Excel sample</a>, <a href="https://ice-public-media.oss-cn-shanghai.aliyuncs.com/smart/dynamicChart/pie.mp4">Generated video</a>.</li>
     * <li>Normal style: <a href="https://ice-public-media.oss-cn-shanghai.aliyuncs.com/smart/dynamicChart/Normal.mp4">Generated video</a>.</li>
     * <li>Mystery style: <a href="https://ice-public-media.oss-cn-shanghai.aliyuncs.com/smart/dynamicChart/Mystery.mp4">Generated video</a>.</li>
     * <li>Lively style: <a href="https://ice-public-media.oss-cn-shanghai.aliyuncs.com/smart/dynamicChart/Lively.mp4">Generated video</a>.</li>
     * <li>Business style: <a href="https://ice-public-media.oss-cn-shanghai.aliyuncs.com/smart/dynamicChart/Business.mp4">Generated video</a>.</li>
     * <li>Green style: <a href="https://ice-public-media.oss-cn-shanghai.aliyuncs.com/smart/dynamicChart/Green.mp4">Generated video</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of SubmitDynamicChartJob  SubmitDynamicChartJobRequest
     * @return SubmitDynamicChartJobResponse
     */
    CompletableFuture<SubmitDynamicChartJobResponse> submitDynamicChartJob(SubmitDynamicChartJobRequest request);

    /**
     * <b>description</b> :
     * <p>This is an <a href="https://help.aliyun.com/document_detail/3027141.html">asynchronous operation</a>. After you submit a task, a task ID is returned. At this point, the task is not yet complete and enters a background queue for asynchronous execution. The final result is delivered through a callback notification. You can also proactively query the task status by calling <a href="https://help.aliyun.com/document_detail/441199.html">Query animated image task details</a>.</p>
     * 
     * @param request the request parameters of SubmitDynamicImageJob  SubmitDynamicImageJobRequest
     * @return SubmitDynamicImageJobResponse
     */
    CompletableFuture<SubmitDynamicImageJobResponse> submitDynamicImageJob(SubmitDynamicImageJobRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is an <a href="https://help.aliyun.com/document_detail/3027141.html">asynchronous operation</a>. After the task is submitted, a task ID is returned. The task is not completed immediately and enters a background queue for asynchronous execution. The final result is sent through a callback notification. You can also call the <a href="https://help.aliyun.com/document_detail/441172.html">Query intelligent task results</a> operation to query the task status.</p>
     * 
     * @param request the request parameters of SubmitHighlightExtractionJob  SubmitHighlightExtractionJobRequest
     * @return SubmitHighlightExtractionJobResponse
     */
    CompletableFuture<SubmitHighlightExtractionJobResponse> submitHighlightExtractionJob(SubmitHighlightExtractionJobRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is an <a href="https://help.aliyun.com/document_detail/3027141.html">asynchronous operation</a>. After the job is submitted, a job ID is returned. The job is not yet complete and is queued for asynchronous execution in the background. The final result is sent through a callback notification. You can also call the <a href="https://help.aliyun.com/document_detail/441215.html">Query intelligent production job</a> operation to query the job status.</p>
     * 
     * @param request the request parameters of SubmitIProductionJob  SubmitIProductionJobRequest
     * @return SubmitIProductionJobResponse
     */
    CompletableFuture<SubmitIProductionJobResponse> submitIProductionJob(SubmitIProductionJobRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This is an <a href="https://help.aliyun.com/document_detail/3027141.html">asynchronous operation</a>. After you submit a task, a task ID is returned (the task is not yet complete and enters a background queue for asynchronous execution). The final result is delivered through a callback notification. You can also proactively query the task status by calling <a href="https://help.aliyun.com/document_detail/441150.html">GetLiveEditingJob</a>.</li>
     * <li>Live editing is supported for live streams recorded to OSS and VOD. When mixing multiple live streams, all streams must be recorded to OSS or all streams must be recorded to VOD.</li>
     * </ul>
     * 
     * @param request the request parameters of SubmitLiveEditingJob  SubmitLiveEditingJobRequest
     * @return SubmitLiveEditingJobResponse
     */
    CompletableFuture<SubmitLiveEditingJobResponse> submitLiveEditingJob(SubmitLiveEditingJobRequest request);

    /**
     * <b>description</b> :
     * <p>This operation supports recording live streams from ApsaraVideo Live or third-party RTMP live streams. Ingest the stream before calling this operation to submit a recording task. If no stream is available at the live stream URL, the task attempts to pull the stream for 3 minutes. After the timeout period elapses, the recording service stops recording.
     * Before you submit a recording task, prepare an Alibaba Cloud OSS bucket or ApsaraVideo VOD storage space. Use the storage address configured in Intelligent Media Services to facilitate the management and processing of the recorded files.
     * If the preset recording templates do not meet your requirements, you can create a custom recording template.</p>
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
     * <ul>
     * <li>When submitting a transcoding task that takes effect immediately, ensure that the input source stream is playable.</li>
     * <li>When submitting a delayed transcoding task, ensure that the source stream is playable before the specified time.</li>
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
     * <p>This is an <a href="https://help.aliyun.com/document_detail/3027141.html">asynchronous API</a>. After you submit a job, the service returns a job ID and processes the job in the background. You receive the final result through a callback notification. You can also check the job status by calling the <a href="https://help.aliyun.com/document_detail/444847.html">QueryMediaCensorJob</a> API.</p>
     * 
     * @param request the request parameters of SubmitMediaCensorJob  SubmitMediaCensorJobRequest
     * @return SubmitMediaCensorJobResponse
     */
    CompletableFuture<SubmitMediaCensorJobResponse> submitMediaCensorJob(SubmitMediaCensorJobRequest request);

    /**
     * <b>description</b> :
     * <p>This is an <a href="https://help.aliyun.com/document_detail/3027141.html">asynchronous operation</a>. After you submit a task, a task ID is returned. The task is not yet complete at this point and enters a queue for asynchronous execution in the background. The final result is delivered through a callback notification. You can also proactively query the task status by calling <a href="https://help.aliyun.com/document_detail/2867675.html">Query media transcoding task</a>.</p>
     * 
     * @param request the request parameters of SubmitMediaConvertJob  SubmitMediaConvertJobRequest
     * @return SubmitMediaConvertJobResponse
     */
    CompletableFuture<SubmitMediaConvertJobResponse> submitMediaConvertJob(SubmitMediaConvertJobRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is an <a href="https://help.aliyun.com/document_detail/3027141.html">asynchronous operation</a>. After you submit a task, a task ID is returned. The task is not completed immediately and enters a background queue for asynchronous execution. The final result is sent through a callback notification. You can also call the <a href="https://help.aliyun.com/document_detail/441200.html">media information task query</a> operation to query the task status.</li>
     * <li>You can call this operation to perform media analysis on input files by using callbacks or re-querying the task status. This operation is suitable for scenarios where timeliness requirements are relatively low or concurrency is high.</li>
     * </ul>
     * 
     * @param request the request parameters of SubmitMediaInfoJob  SubmitMediaInfoJobRequest
     * @return SubmitMediaInfoJobResponse
     */
    CompletableFuture<SubmitMediaInfoJobResponse> submitMediaInfoJob(SubmitMediaInfoJobRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li><p><strong>Billing: Video editing is billed based on the duration of the produced video. For more information, see <a href="https://help.aliyun.com/document_detail/2840899.html">Video editing</a>. No fees are charged if the processing fails.</strong></p>
     * </li>
     * <li><p>Diverse editing capabilities: Invoke this API operation when you need to arrange and design materials based on personalized ideas. This API operation supports flexible <a href="https://help.aliyun.com/document_detail/198823.html">timeline configurations</a> to meet complex video editing requirements.</p>
     * </li>
     * <li><p>Material reference rules: Materials referenced in the cloud editing timeline can be media assets in the media asset library, OSS files (recommended), or other public URLs. If the material is an OSS file, MediaUrl only supports the OSS address format, such as <a href="https://your-bucket.oss-region-name.aliyuncs.com/your-object.ext">https://your-bucket.oss-region-name.aliyuncs.com/your-object.ext</a>. If the material is another public URL, the task duration increases.</p>
     * </li>
     * <li><p>Asynchronously execute tasks: - This API operation is an <a href="https://help.aliyun.com/document_detail/3027141.html">asynchronous task</a>. After you submit the task, a task ID is returned (the task is not completed at this time and enters the background queue to execute asynchronously). The final result is notified through a callback. You can also invoke the <a href="https://help.aliyun.com/document_detail/441149.html">query media editing and producing jobs</a> operation to actively query the task status. </p>
     * </li>
     * <li><p>Task status query:</p>
     * <ol>
     * <li>Invoke the <a href="https://help.aliyun.com/document_detail/441149.html">query media editing and producing jobs</a> operation and pass the JobId parameter to query the task status and result.</li>
     * <li>When submitting a media editing and producing job, you can set <strong>UserData</strong> in the request parameters to include a callback URL. When the editing task is completed or fails, the system sends a notification to this callback URL. You can process the callback data to obtain the task status.</li>
     * </ol>
     * </li>
     * <li><p>Media asset registration and analysis: After the video is produced, the media asset is automatically registered. At this time, the media asset is in the analyzing state. After the analysis is completed, you can obtain the duration and resolution information of the produced video based on the MediaId.</p>
     * </li>
     * </ul>
     * <h2>Limits</h2>
     * <ul>
     * <li>The rate limit for this API operation is 30 QPS (requests per second for submitting tasks). Submitted tasks enter the background queue and are processed asynchronously.<blockquote>
     * <p>If this limit is exceeded, you may encounter the &quot;Throttling.User&quot; error. For more information, see <a href="https://help.aliyun.com/document_detail/453484.html">Throttling.User error when submitting an editing task</a>.</p>
     * </blockquote>
     * </li>
     * <li>When you submit a large number of tasks (such as 1,000 or 10,000), the system dynamically scales out, but a certain queue time may be required.</li>
     * <li>The maximum number of tracks for video, image, and subtitle tracks is 100 each.    </li>
     * <li>There is no limit on the number of materials, but the total size of material files cannot exceed 1 TB.  </li>
     * <li>The region of the input or output OSS bucket must be the same as the region where Intelligent Media Services (IMS) is used.   </li>
     * <li>When the output is a video, the resolution of the produced video has the following limits:<ul>
     * <li>The width and height cannot be less than 128 pixels.</li>
     * <li>The width and height cannot be greater than 4,096 pixels.</li>
     * <li>The short side cannot be greater than 2,160 pixels.</li>
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
     * <b>description</b> :
     * <ul>
     * <li>After submitting a job, you can call ListBatchMediaProducingJob to retrieve all matching jobs. To get detailed information for a specific job, including its status, output media asset IDs, and URLs, call GetBatchMediaProducingJob.</li>
     * </ul>
     * 
     * @param request the request parameters of SubmitSceneBatchEditingJob  SubmitSceneBatchEditingJobRequest
     * @return SubmitSceneBatchEditingJobResponse
     */
    CompletableFuture<SubmitSceneBatchEditingJobResponse> submitSceneBatchEditingJob(SubmitSceneBatchEditingJobRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>After you submit a scenario-based material selection task, you can call <a href="https://help.aliyun.com/document_detail/2803751.html">ListBatchMediaProducingJob</a> to obtain a list of all matching tasks. Call <a href="https://help.aliyun.com/document_detail/2693269.html">GetBatchMediaProducingJob</a> to obtain the task details, including the task status, synthesized media asset ID, and URL.</li>
     * <li>This feature is in public preview and is free of charge.</li>
     * </ul>
     * 
     * @param request the request parameters of SubmitSceneMediaSelectionJob  SubmitSceneMediaSelectionJobRequest
     * @return SubmitSceneMediaSelectionJobResponse
     */
    CompletableFuture<SubmitSceneMediaSelectionJobResponse> submitSceneMediaSelectionJob(SubmitSceneMediaSelectionJobRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>After you submit a scenario-based timeline orchestration task, you can call <a href="https://help.aliyun.com/document_detail/2803751.html">ListBatchMediaProducingJob</a> to obtain a list of all matching tasks. Call <a href="https://help.aliyun.com/document_detail/2693269.html">GetBatchMediaProducingJob</a> to obtain the task details, including the task status, synthesized media asset ID, and URL.</li>
     * <li>This feature is in public preview and is free of charge.</li>
     * </ul>
     * 
     * @param request the request parameters of SubmitSceneTimelineOrganizationJob  SubmitSceneTimelineOrganizationJobRequest
     * @return SubmitSceneTimelineOrganizationJobResponse
     */
    CompletableFuture<SubmitSceneTimelineOrganizationJobResponse> submitSceneTimelineOrganizationJob(SubmitSceneTimelineOrganizationJobRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is an <a href="https://help.aliyun.com/document_detail/3027141.html">asynchronous operation</a>. After a task is submitted, a task ID is returned. The task is not completed immediately and enters a background queue for asynchronous execution. The final result is delivered through a callback notification.</p>
     * 
     * @param request the request parameters of SubmitScreenMediaHighlightsJob  SubmitScreenMediaHighlightsJobRequest
     * @return SubmitScreenMediaHighlightsJobResponse
     */
    CompletableFuture<SubmitScreenMediaHighlightsJobResponse> submitScreenMediaHighlightsJob(SubmitScreenMediaHighlightsJobRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is an <a href="https://help.aliyun.com/document_detail/3027141.html">asynchronous operation</a>. After you submit a task, a task ID is returned. The task is not completed at this time and enters the background queue for asynchronous execution. The final result is notified through a callback. You can also proactively query the task status by calling the <a href="https://help.aliyun.com/document_detail/441172.html">Query intelligent task results</a> operation.</p>
     * 
     * @param request the request parameters of SubmitSegmentationJob  SubmitSegmentationJobRequest
     * @return SubmitSegmentationJobResponse
     */
    CompletableFuture<SubmitSegmentationJobResponse> submitSegmentationJob(SubmitSegmentationJobRequest request);

    /**
     * <b>description</b> :
     * <h3>Before you begin</h3>
     * <p>To submit a smart tagging job by calling this operation, you must first configure the analysis type by using a template. For more information, see <a href="https://help.aliyun.com/document_detail/441184.html">CreateCustomTemplate</a>.</p>
     * <h3>Limits</h3>
     * <ul>
     * <li>The smart tagging feature is available only in the China (Beijing), China (Shanghai), and China (Hangzhou) regions.</li>
     * <li>The default concurrency of smart tagging pipelines is 2. If you require a higher concurrency, <a href="https://smartservice.console.aliyun.com/service/create-ticket?spm=a2c4g.11186623.0.0.645019b6Btnu4q">submit a ticket</a> to contact Alibaba Cloud technical support for evaluation and configuration.</li>
     * <li>Smart tagging jobs and related results are retained for 180 days and are automatically deleted after the retention period expires.</li>
     * </ul>
     * 
     * @param request the request parameters of SubmitSmarttagJob  SubmitSmarttagJobRequest
     * @return SubmitSmarttagJobResponse
     */
    CompletableFuture<SubmitSmarttagJobResponse> submitSmarttagJob(SubmitSmarttagJobRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is an <a href="https://help.aliyun.com/document_detail/3027141.html">asynchronous operation</a>. After you submit a job, a job ID is returned. The job is not completed immediately and enters a background queue for asynchronous execution. The final result is sent through a callback notification. You can also call the operation to <a href="https://help.aliyun.com/document_detail/441203.html">query the details of a snapshot job</a> to actively query the job status.</p>
     * 
     * @param request the request parameters of SubmitSnapshotJob  SubmitSnapshotJobRequest
     * @return SubmitSnapshotJobResponse
     */
    CompletableFuture<SubmitSnapshotJobResponse> submitSnapshotJob(SubmitSnapshotJobRequest request);

    /**
     * <b>description</b> :
     * <p>This is an <a href="https://help.aliyun.com/document_detail/3027141.html">asynchronous operation</a>. After you submit a task, a task ID is returned. The task is not yet complete at this point and enters a background queue for asynchronous execution. The final result is returned through a callback notification.</p>
     * 
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
     * <p>You can call this operation to analyze input files in synchronous mode. This operation is suitable for scenarios that require high real-time performance and have low concurrency. If obtaining media information from the source file takes a long time, the request may time out, resulting in missing or inaccurate information. In this case, call the <a href="https://help.aliyun.com/document_detail/441222.html">SubmitMediaInfoJob - Submit an asynchronous media information job</a> operation to obtain media information.</p>
     * 
     * @param request the request parameters of SubmitSyncMediaInfoJob  SubmitSyncMediaInfoJobRequest
     * @return SubmitSyncMediaInfoJobResponse
     */
    CompletableFuture<SubmitSyncMediaInfoJobResponse> submitSyncMediaInfoJob(SubmitSyncMediaInfoJobRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you call this operation, you must purchase the Enterprise Subscription Service to obtain the permissions to use this feature&lt;props=&quot;china&quot;&gt;. For more information, see <a href="~~439260#3285adfad70dw~~">Subscription billing</a>.</li>
     * <li>This operation is billed based on the number of tokens in the generated content. The number of tokens is positively correlated with the word count of the generated text. For more information, see <a href="https://help.aliyun.com/document_detail/2840901.html">Intelligent one-click video generation</a>. If the synthesis task fails, no fees are incurred.</li>
     * <li>This operation is an <a href="https://help.aliyun.com/document_detail/3027141.html">asynchronous operation</a>. After you submit a task, a task ID is returned. The task is not completed at this time and is queued for asynchronous execution in the background. The final result is notified through a callback. You can also call the <a href="https://help.aliyun.com/document_detail/441172.html">Obtain intelligent task results</a> operation to actively query the task status.</li>
     * </ul>
     * 
     * @param request the request parameters of SubmitTextGenerateJob  SubmitTextGenerateJobRequest
     * @return SubmitTextGenerateJobResponse
     */
    CompletableFuture<SubmitTextGenerateJobResponse> submitTextGenerateJob(SubmitTextGenerateJobRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation supports only videos that are three minutes or longer. Submitting a job for a shorter video may cause the API call to fail or produce no output.</li>
     * <li>This is an <a href="https://help.aliyun.com/document_detail/3027141.html">asynchronous interface</a>. After you submit a job, the system returns a job ID and processes the job asynchronously. You can obtain the processing result through a callback or by <a href="https://help.aliyun.com/document_detail/2862133.html">querying the list of A/B stream forensic watermarking jobs</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of SubmitTraceAbJob  SubmitTraceAbJobRequest
     * @return SubmitTraceAbJobResponse
     */
    CompletableFuture<SubmitTraceAbJobResponse> submitTraceAbJob(SubmitTraceAbJobRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>The digital watermarking APIs are available only in the China (Shanghai) and China (Beijing) regions.</li>
     * <li>Trace watermark extraction is supported only for videos that are 3 minutes or longer. Jobs for shorter videos will fail.</li>
     * <li>This is an <a href="https://help.aliyun.com/document_detail/3027141.html">asynchronous API</a>. After you submit a job, a job ID is returned. The job is not immediately complete and is queued for asynchronous processing. You can get the final result through a callback notification or check the job status by calling the <a href="https://help.aliyun.com/document_detail/2862130.html">GetTraceExtractJob</a> operation.</li>
     * </ul>
     * 
     * @param request the request parameters of SubmitTraceExtractJob  SubmitTraceExtractJobRequest
     * @return SubmitTraceExtractJobResponse
     */
    CompletableFuture<SubmitTraceExtractJobResponse> submitTraceExtractJob(SubmitTraceExtractJobRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this operation, invoke the operation to commit a video tracing watermark AB stream job to obtain the media ID of the processed AB stream, and then invoke this operation.</li>
     * <li>Digital watermarking-related operations are supported only in the China (Shanghai) and China (Beijing) regions.</li>
     * <li>This operation is an <a href="https://help.aliyun.com/document_detail/3027141.html">asynchronous operation</a>. After a node is committed, a node ID is returned. The node is not completed immediately and enters a background queue to be executed asynchronously. The final result is sent through a callback notification. You can also invoke the <a href="https://help.aliyun.com/document_detail/2862136.html">List video tracing watermark m3u8 jobs</a> operation to query the node status.</li>
     * <li>The signature authentication for the m3u8 file generated by the video tracing watermark m3u8 job is valid for 24 hours starting from the completion of the processing. Query the result promptly. After the signature authentication expires, the watermark information of the job cannot be queried. If you need the information after the expiration, recommit the video tracing watermark m3u8 job.</li>
     * </ul>
     * 
     * @param request the request parameters of SubmitTraceM3u8Job  SubmitTraceM3u8JobRequest
     * @return SubmitTraceM3u8JobResponse
     */
    CompletableFuture<SubmitTraceM3u8JobResponse> submitTraceM3u8Job(SubmitTraceM3u8JobRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>&lt;props=&quot;intl&quot;&gt;This operation will be retired on December 31, 2025. Call <a href="https://help.aliyun.com/document_detail/2867673.html">SubmitMediaConvertJob - Submit a media transcoding job</a> instead.</li>
     * <li>This is an <a href="https://help.aliyun.com/document_detail/3027141.html">asynchronous operation</a>. After you submit the job, a job ID is returned. The job is not completed at this time and enters the background queue for asynchronous execution. The final result is notified through a callback. You can also call <a href="https://help.aliyun.com/document_detail/441206.html">Query a transcoding job</a> to actively query the job status.</li>
     * </ul>
     * 
     * @param request the request parameters of SubmitTranscodeJob  SubmitTranscodeJobRequest
     * @return SubmitTranscodeJobResponse
     */
    CompletableFuture<SubmitTranscodeJobResponse> submitTranscodeJob(SubmitTranscodeJobRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is an <a href="https://help.aliyun.com/document_detail/3027141.html">asynchronous operation</a>. After you submit a task, a task ID is returned. The task is not completed immediately and is queued for asynchronous execution in the background. The final result is delivered through a callback notification. You can also query the task status by calling the <a href="https://help.aliyun.com/document_detail/2975154.html">Query intelligent content understanding tasks</a> operation.</p>
     * 
     * @param request the request parameters of SubmitVideoCognitionJob  SubmitVideoCognitionJobRequest
     * @return SubmitVideoCognitionJobResponse
     */
    CompletableFuture<SubmitVideoCognitionJobResponse> submitVideoCognitionJob(SubmitVideoCognitionJobRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>For this operation, the region in the OSS URL of all media assets must match the region of the OpenAPI endpoint.</li>
     * <li>This operation supports 30 queries per second (QPS). When a large number of tasks are submitted, they are automatically queued and processed with dynamic scaling. There is no limit on the number of concurrent executions.</li>
     * <li>This is an <a href="https://help.aliyun.com/document_detail/3027141.html">asynchronous operation</a>. After a task is submitted, a task ID is returned. The task is not completed at this point and enters a background queue for asynchronous execution. The final result is sent through a callback notification. You can also call <a href="https://help.aliyun.com/document_detail/441172.html">Get intelligent task results</a> to proactively query the task status.<blockquote>
     * <p>Notice: For detailed metric descriptions and examples of this operation, refer to the following document: &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/en/ims/use-cases/introduction-and-examples-of-video-translation-parameters">Introduction and examples of video translation parameters</a>
     * &lt;props=&quot;intl&quot;&gt;<a href="https://help.aliyun.com/document_detail/2852702.html">Introduction and examples of video translation parameters</a></p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of SubmitVideoTranslationJob  SubmitVideoTranslationJobRequest
     * @return SubmitVideoTranslationJobResponse
     */
    CompletableFuture<SubmitVideoTranslationJobResponse> submitVideoTranslationJob(SubmitVideoTranslationJobRequest request);

    /**
     * @param request the request parameters of SubmitYikeAIAppJob  SubmitYikeAIAppJobRequest
     * @return SubmitYikeAIAppJobResponse
     */
    CompletableFuture<SubmitYikeAIAppJobResponse> submitYikeAIAppJob(SubmitYikeAIAppJobRequest request);

    /**
     * @param request the request parameters of SubmitYikeStoryboardJob  SubmitYikeStoryboardJobRequest
     * @return SubmitYikeStoryboardJobResponse
     */
    CompletableFuture<SubmitYikeStoryboardJobResponse> submitYikeStoryboardJob(SubmitYikeStoryboardJobRequest request);

    /**
     * @param request the request parameters of TakeoverAIAgentCall  TakeoverAIAgentCallRequest
     * @return TakeoverAIAgentCallResponse
     */
    CompletableFuture<TakeoverAIAgentCallResponse> takeoverAIAgentCall(TakeoverAIAgentCallRequest request);

    /**
     * <b>description</b> :
     * <p>Allows you to specify an agent instance ID and configuration to update the agent configuration, such as the voice.</p>
     * 
     * @param request the request parameters of UpdateAIAgentInstance  UpdateAIAgentInstanceRequest
     * @return UpdateAIAgentInstanceResponse
     */
    CompletableFuture<UpdateAIAgentInstanceResponse> updateAIAgentInstance(UpdateAIAgentInstanceRequest request);

    /**
     * @param request the request parameters of UpdateAdInsertion  UpdateAdInsertionRequest
     * @return UpdateAdInsertionResponse
     */
    CompletableFuture<UpdateAdInsertionResponse> updateAdInsertion(UpdateAdInsertionRequest request);

    /**
     * @param request the request parameters of UpdateAvatarTrainingJob  UpdateAvatarTrainingJobRequest
     * @return UpdateAvatarTrainingJobResponse
     */
    CompletableFuture<UpdateAvatarTrainingJobResponse> updateAvatarTrainingJob(UpdateAvatarTrainingJobRequest request);

    /**
     * <b>description</b> :
     * <p>After you create a media asset category, you can call this operation to locate and update the name of the category by its ID.</p>
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
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation allows you to update the information of an existing hotword library.</li>
     * <li>You must provide the hotword library ID (<code>HotwordLibraryId</code>), which is a required parameter.</li>
     * <li>You can simultaneously update the name (<code>Name</code>), description (<code>Description</code>), and hotword list (<code>HotWords</code>) of the hotword library.</li>
     * <li>For each hotword in the hotword list, you can set its text content (<code>Text</code>), weight (<code>Weight</code>), language (<code>Language</code>), and translation and transposition results (<code>TranspositionResultList</code>).</li>
     * <li>Note: You can create up to 100 hotword libraries under a single account, and add up to 300 hotwords to a single hotword library. Within a single hotword library, the combination of <code>language</code> and <code>text</code> for a hotword must be unique. In addition, within a single hotword library, the combination of <code>TranslatedText</code> and <code>TargetLanguage</code> in the <code>TranspositionResultList</code> of a hotword must also be unique.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateHotwordLibrary  UpdateHotwordLibraryRequest
     * @return UpdateHotwordLibraryResponse
     */
    CompletableFuture<UpdateHotwordLibraryResponse> updateHotwordLibrary(UpdateHotwordLibraryRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>You can use this API to update the configurations of a specified channel in the live packaging service. You must provide the name of the channel group to which the channel belongs, the channel name, and the protocol type, segment duration, and segment count to be updated. You can also optionally add or modify the description of the channel. Make sure that the provided channel group name and channel name meet the format requirements.</p>
     * 
     * @param request the request parameters of UpdateLivePackageChannel  UpdateLivePackageChannelRequest
     * @return UpdateLivePackageChannelResponse
     */
    CompletableFuture<UpdateLivePackageChannelResponse> updateLivePackageChannel(UpdateLivePackageChannelRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>You can choose to update the primary endpoint, secondary endpoint, or both. The response includes the updated ingest endpoint URL, username, and password for the ingest device to reconfigure.</p>
     * 
     * @param request the request parameters of UpdateLivePackageChannelCredentials  UpdateLivePackageChannelCredentialsRequest
     * @return UpdateLivePackageChannelCredentialsResponse
     */
    CompletableFuture<UpdateLivePackageChannelCredentialsResponse> updateLivePackageChannelCredentials(UpdateLivePackageChannelCredentialsRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>You can use this API operation to update the name and description of an existing channel group in the Live Packaging service. The channel group name must comply with specific character rules, and the description cannot exceed 1,000 characters in length. The API response returns the updated channel group details and the unique identifier (RequestId) of the operation request.</p>
     * 
     * @param request the request parameters of UpdateLivePackageChannelGroup  UpdateLivePackageChannelGroupRequest
     * @return UpdateLivePackageChannelGroupResponse
     */
    CompletableFuture<UpdateLivePackageChannelGroupResponse> updateLivePackageChannelGroup(UpdateLivePackageChannelGroupRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This operation updates the origin endpoint configuration of the live packaging service for a specified channel group. You can use this operation to adjust the back-to-origin protocol, set the time-shift days, define the playlist name, and configure IP blacklists and whitelists to achieve fine-grained management of live streaming distribution. Note that some parameters are required, and you must specify at least one of the IP whitelist and the back-to-origin authorization code.</p>
     * 
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
     * <ul>
     * <li>For a non-timed transcoding job, you can modify the Name parameter of the job, regardless of the job state.</li>
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
     * <b>description</b> :
     * <ul>
     * <li>The input can only be modified when the Flow instance status is offline.</li>
     * <li>The input type cannot be modified.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateMediaConnectFlowInput  UpdateMediaConnectFlowInputRequest
     * @return UpdateMediaConnectFlowInputResponse
     */
    CompletableFuture<UpdateMediaConnectFlowInputResponse> updateMediaConnectFlowInput(UpdateMediaConnectFlowInputRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can modify an output only when the flow is in the offline state.</li>
     * <li>The output type cannot be modified.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateMediaConnectFlowOutput  UpdateMediaConnectFlowOutputRequest
     * @return UpdateMediaConnectFlowOutputResponse
     */
    CompletableFuture<UpdateMediaConnectFlowOutputResponse> updateMediaConnectFlowOutput(UpdateMediaConnectFlowOutputRequest request);

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
     * <b>description</b> :
     * <ul>
     * <li>Call this operation to update a media live channel.</li>
     * <li>You can update a channel only when it is not started. You cannot update a running channel.</li>
     * </ul>
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit per user for this API operation is 50. If the limit is exceeded, API calls are throttled, which may affect your services. Call this API operation at a reasonable frequency.</p>
     * 
     * @param request the request parameters of UpdateMediaLiveChannel  UpdateMediaLiveChannelRequest
     * @return UpdateMediaLiveChannelResponse
     */
    CompletableFuture<UpdateMediaLiveChannelResponse> updateMediaLiveChannel(UpdateMediaLiveChannelRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Invoke this API to update a media live input.</li>
     * <li>You can update an input only when it is not attached to any media live channel. Inputs that are already attached to a channel cannot be updated.</li>
     * </ul>
     * <h2>Queries per second (QPS) limit</h2>
     * <p>The QPS limit for this API is 50 queries per second per user. If the limit is exceeded, Rate Limiting will be applied to your API calls, which may impact your business. Make sure to call this API appropriately.</p>
     * 
     * @param request the request parameters of UpdateMediaLiveInput  UpdateMediaLiveInputRequest
     * @return UpdateMediaLiveInputResponse
     */
    CompletableFuture<UpdateMediaLiveInputResponse> updateMediaLiveInput(UpdateMediaLiveInputRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can modify a security group only when it is not associated with a MediaLive input.</li>
     * </ul>
     * <h2>QPS limit</h2>
     * <p>This operation can be called up to 50 times per second for each Alibaba Cloud account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of UpdateMediaLiveInputSecurityGroup  UpdateMediaLiveInputSecurityGroupRequest
     * @return UpdateMediaLiveInputSecurityGroupResponse
     */
    CompletableFuture<UpdateMediaLiveInputSecurityGroupResponse> updateMediaLiveInputSecurityGroup(UpdateMediaLiveInputSecurityGroupRequest request);

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
     * <b>description</b> :
     * <p>Calls the UpdateProgram API operation to create a program.</p>
     * 
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
     * <ul>
     * <li>To use common templates, refer to <a href="https://help.aliyun.com/document_detail/270942.html">Quick start for common templates</a>.</li>
     * <li>To use advanced templates, refer to <a href="https://help.aliyun.com/document_detail/291418.html">Create and use advanced templates</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateTemplate  UpdateTemplateRequest
     * @return UpdateTemplateResponse
     */
    CompletableFuture<UpdateTemplateResponse> updateTemplate(UpdateTemplateRequest request);

    /**
     * <b>description</b> :
     * <h3>Operation description</h3>
     * <ul>
     * <li>If a callback is configured, you receive an event notification about the completion of URL-based video upload after the upload is complete. You can invoke the operation for obtaining URL upload information to query the upload status.</li>
     * <li>After an upload task is submitted successfully, an asynchronous task is generated in the cloud and queued for execution. After the upload is complete, you can associate the URL with the video ID based on the information returned in the event notification (message callback).</li>
     * </ul>
     * <h3>Limits</h3>
     * <ul>
     * <li>This operation supports uploading only to VOD storage, not to user-owned Object Storage Service (OSS) storage. If you use your own OSS storage, pull the file to a local device first, upload the file to OSS by using <a href="https://help.aliyun.com/document_detail/32006.html">OSS SDK</a>, and then invoke the <a href="https://help.aliyun.com/document_detail/441152.html">RegisterMediaInfo</a> operation to register the OSS file in the media asset library.</li>
     * <li>This operation is currently supported only in the China (Shanghai), China (Beijing), and China (Shenzhen) regions.</li>
     * <li>This operation supports uploading only audio and video files.</li>
     * </ul>
     * 
     * @param request the request parameters of UploadMediaByURL  UploadMediaByURLRequest
     * @return UploadMediaByURLResponse
     */
    CompletableFuture<UploadMediaByURLResponse> uploadMediaByURL(UploadMediaByURLRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Pull a media stream file based on a URL and upload the file. After the media stream file is uploaded, the media stream is associated with the specified media asset ID.</li>
     * <li>Upload media stream files only to ApsaraVideo VOD, but not to your own Object Storage Service (OSS) buckets. To upload a media stream file to an OSS bucket, pull the file to a local directory, use <a href="https://help.aliyun.com/document_detail/32006.html">OSS SDK</a> to upload the file to an OSS bucket, and then call the <a href="https://help.aliyun.com/document_detail/440765.html">RegisterMediaStream</a> operation to associate the media stream with the specified media asset ID.</li>
     * <li>This operation is available only in the China (Shanghai), China (Beijing), and China (Shenzhen) regions.</li>
     * </ul>
     * 
     * @param request the request parameters of UploadStreamByURL  UploadStreamByURLRequest
     * @return UploadStreamByURLResponse
     */
    CompletableFuture<UploadStreamByURLResponse> uploadStreamByURL(UploadStreamByURLRequest request);

}
