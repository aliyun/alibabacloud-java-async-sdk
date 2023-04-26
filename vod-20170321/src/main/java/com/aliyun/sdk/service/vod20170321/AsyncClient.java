// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.vod20170321.models.*;
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
      * The type of the AI template. Valid values:
      * *   **AIMediaAudit**: automated review
      * *   **AIImage**: smart thumbnail
      *
     */
    CompletableFuture<AddAITemplateResponse> addAITemplate(AddAITemplateRequest request);

    /**
      * The level of the category. A value of **0** indicates a level 1 category.
      *
     */
    CompletableFuture<AddCategoryResponse> addCategory(AddCategoryRequest request);

    CompletableFuture<AddEditingProjectResponse> addEditingProject(AddEditingProjectRequest request);

    /**
      * The ID of the transcoding template group.
      *
     */
    CompletableFuture<AddTranscodeTemplateGroupResponse> addTranscodeTemplateGroup(AddTranscodeTemplateGroupRequest request);

    /**
      * The ID of the request.
      *
     */
    CompletableFuture<AddVodDomainResponse> addVodDomain(AddVodDomainRequest request);

    /**
      * The type of the template. Set the value to **Snapshot**.
      *
     */
    CompletableFuture<AddVodTemplateResponse> addVodTemplate(AddVodTemplateRequest request);

    /**
      * The name of the watermark. Only letters and digits are supported.
      * *   The name can be up to 128 bytes in length.
      * *   The value must be encoded in UTF-8.
      *
     */
    CompletableFuture<AddWatermarkResponse> addWatermark(AddWatermarkRequest request);

    /**
      * The name of the policy that was not found.
      *
     */
    CompletableFuture<AttachAppPolicyToIdentityResponse> attachAppPolicyToIdentity(AttachAppPolicyToIdentityRequest request);

    /**
      * The ID of the request.
      *
     */
    CompletableFuture<BatchSetVodDomainConfigsResponse> batchSetVodDomainConfigs(BatchSetVodDomainConfigsRequest request);

    /**
      * The operation that you want to perform. Set the value to **BatchStartVodDomain**.
      *
     */
    CompletableFuture<BatchStartVodDomainResponse> batchStartVodDomain(BatchStartVodDomainRequest request);

    /**
      * The operation that you want to perform. Set the value to **BatchStopVodDomain**.
      *
     */
    CompletableFuture<BatchStopVodDomainResponse> batchStopVodDomain(BatchStopVodDomainRequest request);

    /**
      * The upload URLs of source files. Separate multiple URLs with commas (,). You can specify a maximum of 10 URLs.
      * > *   You must encode the URLs before you use the URLs.
      * > *   You must set one of the JobIds and the UploadUrls parameters. If you set both the JobIds and UploadUrls parameters, only the value of the JobIds parameter takes effect.
      *
     */
    CompletableFuture<CancelUrlUploadJobsResponse> cancelUrlUploadJobs(CancelUrlUploadJobsRequest request);

    /**
      * The description of the application. 
      * - The description can contain up to 512 characters in length.
      * - The description can contain only UTF-8 characters.
      *
     */
    CompletableFuture<CreateAppInfoResponse> createAppInfo(CreateAppInfoRequest request);

    CompletableFuture<CreateAuditResponse> createAudit(CreateAuditRequest request);

    /**
      * The type of the media asset. Valid values:
      * *   **watermark**
      * *   **subtitle**
      * *   **material**
      *
     */
    CompletableFuture<CreateUploadAttachedMediaResponse> createUploadAttachedMedia(CreateUploadAttachedMediaRequest request);

    /**
      * The custom configurations. For example, you can specify callback configurations and upload acceleration configurations. The value is a JSON string. For more information, see the "UserData: specifies the custom configurations for media upload" section of the [Request parameters](~~86952~~) topic.
      * > *   The callback configurations take effect only after you specify the HTTP callback URL and select specific callback events in the ApsaraVideo VOD console. For more information about how to configure HTTP callback settings in the ApsaraVideo VOD console, see [Configure callback settings](~~86071~~).
      * > *   To use the upload acceleration feature, submit a [ticket](https://ticket-intl.console.aliyun.com/#/ticket/createIndex) to enable this feature. For more information, see [Overview](~~55396~~).
      *
     */
    CompletableFuture<CreateUploadImageResponse> createUploadImage(CreateUploadImageRequest request);

    /**
      * Obtains the upload URLs and credentials for media files and creates media assets in ApsaraVideo VOD.
      *
     */
    CompletableFuture<CreateUploadVideoResponse> createUploadVideo(CreateUploadVideoRequest request);

    CompletableFuture<DecryptKMSDataKeyResponse> decryptKMSDataKey(DecryptKMSDataKeyRequest request);

    /**
      * This operation deletes only information about images that are submitted for AI processing. The image files are not deleted.
      * - The smart thumbnail feature is not supported. You cannot call this operation.
      * - This operation deletes only information about images that are submitted for AI processing. The image files are not deleted.
      * ### QPS limit
      * You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits on API operations in ApsaraVideo VoD](~~342790~~).
      *
     */
    CompletableFuture<DeleteAIImageInfosResponse> deleteAIImageInfos(DeleteAIImageInfosRequest request);

    /**
      * The ID of the AI template. You can use one of the following methods to obtain the ID of the AI template:
      * *   Call the [AddAITemplate](~~102930~~) operation to add an AI template if no AI template exists. The value of TemplateId from the response is the ID of the AI template.
      * *   Call the [ListAITemplate](~~102936~~) operation if the template already exists. The value of TemplateId from the response is the ID of the AI template.
      *
     */
    CompletableFuture<DeleteAITemplateResponse> deleteAITemplate(DeleteAITemplateRequest request);

    /**
      * The ID of the request.
      *
     */
    CompletableFuture<DeleteAppInfoResponse> deleteAppInfo(DeleteAppInfoRequest request);

    /**
      * The ID of the request.
      *
     */
    CompletableFuture<DeleteAttachedMediaResponse> deleteAttachedMedia(DeleteAttachedMediaRequest request);

    /**
      * The ID of the request.
      *
     */
    CompletableFuture<DeleteCategoryResponse> deleteCategory(DeleteCategoryRequest request);

    CompletableFuture<DeleteDynamicImageResponse> deleteDynamicImage(DeleteDynamicImageRequest request);

    CompletableFuture<DeleteEditingProjectResponse> deleteEditingProject(DeleteEditingProjectRequest request);

    /**
      * The URL of the image.
      * *   This parameter only takes effect when the **DeleteImageType** parameter is set to **ImageURL**. In this case, you must set this parameter.
      * *   Encode multiple image URLs and separate them with commas (,).
      * *   The use of special characters in image URLs may lead to the failure to delete the images. To prevent such failure, you must encode the image URLs before you concatenate them into a string with commas (,).
      *
     */
    CompletableFuture<DeleteImageResponse> deleteImage(DeleteImageRequest request);

    /**
      * The operation that you want to perform. Set the value to **DeleteMessageCallback**.
      *
     */
    CompletableFuture<DeleteMessageCallbackResponse> deleteMessageCallback(DeleteMessageCallbackRequest request);

    /**
      * The IDs of the videos that do not exist.
      *
     */
    CompletableFuture<DeleteMezzaninesResponse> deleteMezzanines(DeleteMezzaninesRequest request);

    /**
      * The ID of the request.
      *
     */
    CompletableFuture<DeleteMultipartUploadResponse> deleteMultipartUpload(DeleteMultipartUploadRequest request);

    CompletableFuture<DeleteStreamResponse> deleteStream(DeleteStreamRequest request);

    /**
      * Specifies whether to forcibly delete the entire transcoding template group. Valid values:
      * *   **true**: deletes the entire transcoding template group and its transcoding templates.
      * *   **false**: removes the specified transcoding templates from the transcoding template group. This is the default value.
      *
     */
    CompletableFuture<DeleteTranscodeTemplateGroupResponse> deleteTranscodeTemplateGroup(DeleteTranscodeTemplateGroupRequest request);

    /**
      * The list of video IDs. Separate multiple IDs with commas (,). A maximum of 20 IDs can be specified. You can obtain a video ID in one of the following ways:
      * *   If the video is uploaded by using the [ApsaraVideo VOD console](https://vod.console.aliyun.com), log on to the console and choose **Media Files** > **Audio/Video** to view the ID of the video.
      * *   If the video is uploaded by calling the [CreateUploadVideo](~~55407~~) operation, the video ID is the VideoId value in the response.
      * *   You can also call the [SearchMedia](~~86044~~) operation to obtain the video ID, which is the VideoId value in the response.
      *
     */
    CompletableFuture<DeleteVideoResponse> deleteVideo(DeleteVideoRequest request);

    /**
      * The ID of the request.
      *
     */
    CompletableFuture<DeleteVodDomainResponse> deleteVodDomain(DeleteVodDomainRequest request);

    /**
      * The ID of the request.
      *
     */
    CompletableFuture<DeleteVodSpecificConfigResponse> deleteVodSpecificConfig(DeleteVodSpecificConfigRequest request);

    CompletableFuture<DeleteVodTemplateResponse> deleteVodTemplate(DeleteVodTemplateRequest request);

    /**
      * The ID of the request.
      *
     */
    CompletableFuture<DeleteWatermarkResponse> deleteWatermark(DeleteWatermarkRequest request);

    /**
      * The number of entries to return on each page. Default value: **100**. Maximum value: **1000**.
      *
     */
    CompletableFuture<DescribePlayTopVideosResponse> describePlayTopVideos(DescribePlayTopVideosRequest request);

    /**
      * The beginning of the time range to query. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.
      *
     */
    CompletableFuture<DescribePlayUserAvgResponse> describePlayUserAvg(DescribePlayUserAvgRequest request);

    /**
      * The total number of unique visitors who use ApsaraVideo Player SDK for Flash.
      *
     */
    CompletableFuture<DescribePlayUserTotalResponse> describePlayUserTotal(DescribePlayUserTotalRequest request);

    /**
      * The beginning of the time range to query. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.
      *
     */
    CompletableFuture<DescribePlayVideoStatisResponse> describePlayVideoStatis(DescribePlayVideoStatisRequest request);

    /**
      * > *   This operation is available only in the **China (Shanghai)** region.
      * >*   If the time range to query is less than or equal to seven days, the system returns the statistics collected on an hourly basis. If the time range to query is greater than seven days, the system returns the statistics collected on a daily basis. The maximum time range that you can specify to query is 31 days.
      *
     */
    CompletableFuture<DescribeVodAIDataResponse> describeVodAIData(DescribeVodAIDataRequest request);

    /**
      * The domain name for CDN.
      *
     */
    CompletableFuture<DescribeVodCertificateListResponse> describeVodCertificateList(DescribeVodCertificateListRequest request);

    /**
      * The domain name for CDN.
      *
     */
    CompletableFuture<DescribeVodDomainBpsDataResponse> describeVodDomainBpsData(DescribeVodDomainBpsDataRequest request);

    CompletableFuture<DescribeVodDomainCertificateInfoResponse> describeVodDomainCertificateInfo(DescribeVodDomainCertificateInfoRequest request);

    /**
      * The name of the function.
      *
     */
    CompletableFuture<DescribeVodDomainConfigsResponse> describeVodDomainConfigs(DescribeVodDomainConfigsRequest request);

    /**
      * The description of the domain name for CDN.
      *
     */
    CompletableFuture<DescribeVodDomainDetailResponse> describeVodDomainDetail(DescribeVodDomainDetailRequest request);

    /**
      * The total number of entries returned on the current page.
      *
     */
    CompletableFuture<DescribeVodDomainLogResponse> describeVodDomainLog(DescribeVodDomainLogRequest request);

    CompletableFuture<DescribeVodDomainSrcBpsDataResponse> describeVodDomainSrcBpsData(DescribeVodDomainSrcBpsDataRequest request);

    CompletableFuture<DescribeVodDomainSrcTrafficDataResponse> describeVodDomainSrcTrafficData(DescribeVodDomainSrcTrafficDataRequest request);

    /**
      * *   This operation is available only in the **China (Shanghai)** region.
      * *   You can specify multiple accelerated domain names in a request.
      * *   If you do not specify the StartTime or EndTime parameter, data of the last 24 hours is returned. You can specify the StartTime and EndTime parameters to query data that is generated in the specified time range. You can query data of the last 90 days.
      * ### QPS limit
      * You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limit on API operations](~~342790~~).
      *
     */
    CompletableFuture<DescribeVodDomainTrafficDataResponse> describeVodDomainTrafficData(DescribeVodDomainTrafficDataRequest request);

    /**
      * > 
      * *   This operation is available only in the **China (Shanghai)** region.
      * *   You can specify up to 100 accelerated domain names in a request. Separate multiple domain names with commas (,). If you do not specify an accelerated domain name, the data of all accelerated domain names within your Alibaba Cloud account is returned.
      * *   You can query data in the last year. The maximum time range that can be queried is three months. If you specify a time range of one to three days, the system returns data on an hourly basis. If you specify a time range of four days or more, the system returns data on a daily basis.
      *
     */
    CompletableFuture<DescribeVodDomainUsageDataResponse> describeVodDomainUsageData(DescribeVodDomainUsageDataRequest request);

    /**
      * The maximum number of URLs of files that can be refreshed each day.
      *
     */
    CompletableFuture<DescribeVodRefreshQuotaResponse> describeVodRefreshQuota(DescribeVodRefreshQuotaRequest request);

    /**
      * > *   This operation is available only in the **China (Shanghai)** region.
      * >*   If you do not specify the TaskId or ObjectPath parameter, the data in the last three days is returned on the first page. By default, one page displays a maximum of 20 entries. You can specify the TaskId and ObjectPath parameters at the same time.
      *
     */
    CompletableFuture<DescribeVodRefreshTasksResponse> describeVodRefreshTasks(DescribeVodRefreshTasksRequest request);

    /**
      * > *   This operation is available only in the **China (Shanghai)** region.
      * >*   If the time range to query is less than or equal to seven days, the system returns the statistics collected on an hourly basis. If the time range to query is greater than seven days, the system returns the statistics collected on a daily basis. The maximum time range that you can specify to query is 31 days.
      *
     */
    CompletableFuture<DescribeVodStorageDataResponse> describeVodStorageData(DescribeVodStorageDataRequest request);

    /**
      * *   This operation is available only in the **China (Shanghai)** region.
      * *   If the time range to query is less than or equal to seven days, the system returns the statistics collected on an hourly basis. If the time range to query is greater than seven days, the system returns the statistics collected on a daily basis. The maximum time range that you can specify to query is 31 days.
      *
     */
    CompletableFuture<DescribeVodTranscodeDataResponse> describeVodTranscodeData(DescribeVodTranscodeDataRequest request);

    CompletableFuture<DescribeVodUserDomainsResponse> describeVodUserDomains(DescribeVodUserDomainsRequest request);

    CompletableFuture<DescribeVodVerifyContentResponse> describeVodVerifyContent(DescribeVodVerifyContentRequest request);

    /**
      * The name of the policy that was not found.
      *
     */
    CompletableFuture<DetachAppPolicyFromIdentityResponse> detachAppPolicyFromIdentity(DetachAppPolicyFromIdentityRequest request);

    CompletableFuture<GenerateKMSDataKeyResponse> generateKMSDataKey(GenerateKMSDataKeyRequest request);

    /**
      * The image AI processing jobs.
      *
     */
    CompletableFuture<GetAIImageJobsResponse> getAIImageJobs(GetAIImageJobsRequest request);

    /**
      * The recommendation for review results. Valid values:
      * *   **block**: The content violates the regulations.
      * *   **review**: The content may violate the regulations.
      * *   **pass**: The content passes the review.
      *
     */
    CompletableFuture<GetAIMediaAuditJobResponse> getAIMediaAuditJob(GetAIMediaAuditJobRequest request);

    /**
      * The detailed configurations of the AI template. The value is a JSON string. For more information, see [AITemplateConfig](https://help.aliyun.com/document_detail/89863.html#title-vd3-499-o36).
      *
     */
    CompletableFuture<GetAITemplateResponse> getAITemplate(GetAITemplateRequest request);

    /**
      * Milliseconds
      *
     */
    CompletableFuture<GetAIVideoTagResultResponse> getAIVideoTagResult(GetAIVideoTagResultRequest request);

    /**
      * The description of the application.
      *
     */
    CompletableFuture<GetAppInfosResponse> getAppInfos(GetAppInfosRequest request);

    CompletableFuture<GetAttachedMediaInfoResponse> getAttachedMediaInfo(GetAttachedMediaInfoRequest request);

    CompletableFuture<GetAuditHistoryResponse> getAuditHistory(GetAuditHistoryRequest request);

    CompletableFuture<GetCategoriesResponse> getCategories(GetCategoriesRequest request);

    /**
      * The detailed configurations of the AI template. The value is a JSON string. For more information, see [AITemplateConfig](https://help.aliyun.com/document_detail/89863.html#title-vd3-499-o36).
      *
     */
    CompletableFuture<GetDefaultAITemplateResponse> getDefaultAITemplate(GetDefaultAITemplateRequest request);

    CompletableFuture<GetEditingProjectResponse> getEditingProject(GetEditingProjectRequest request);

    /**
      * The time when the material was last updated. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
      *
     */
    CompletableFuture<GetEditingProjectMaterialsResponse> getEditingProjectMaterials(GetEditingProjectMaterialsRequest request);

    CompletableFuture<GetImageInfoResponse> getImageInfo(GetImageInfoRequest request);

    /**
      * You can call this operation to query the basic information about multiple images at a time, such as the image title, type, creation time, tags, and URL.
      * ### Limits
      * You can call this operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limit on an API operation in ApsaraVideo Live](~~342790~~).
      *
     */
    CompletableFuture<GetImageInfosResponse> getImageInfos(GetImageInfosRequest request);

    /**
      * The start time of the audio that failed the review. Unit: seconds.
      *
     */
    CompletableFuture<GetMediaAuditAudioResultDetailResponse> getMediaAuditAudioResultDetail(GetMediaAuditAudioResultDetailRequest request);

    CompletableFuture<GetMediaAuditResultResponse> getMediaAuditResult(GetMediaAuditResultRequest request);

    /**
      * Details about review results.
      *
     */
    CompletableFuture<GetMediaAuditResultDetailResponse> getMediaAuditResultDetail(GetMediaAuditResultDetailRequest request);

    CompletableFuture<GetMediaAuditResultTimelineResponse> getMediaAuditResultTimeline(GetMediaAuditResultTimelineRequest request);

    /**
      * The details of the matched video. Information such as the location and duration of the video is returned.
      *
     */
    CompletableFuture<GetMediaDNAResultResponse> getMediaDNAResult(GetMediaDNAResultRequest request);

    /**
      * You can query the information about all media files or a specific media file in a refresh or prefetch job.
      * ### QPS limits
      * You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits on API operations in ApsaraVideo VoD](~~342790~~).
      *
     */
    CompletableFuture<GetMediaRefreshJobsResponse> getMediaRefreshJobs(GetMediaRefreshJobsRequest request);

    /**
      * The type of the callback event.
      *
     */
    CompletableFuture<GetMessageCallbackResponse> getMessageCallback(GetMessageCallbackRequest request);

    /**
      * The sampling format.
      *
     */
    CompletableFuture<GetMezzanineInfoResponse> getMezzanineInfo(GetMezzanineInfoRequest request);

    /**
      * The ID of the media file.
      *
     */
    CompletableFuture<GetPlayInfoResponse> getPlayInfo(GetPlayInfoRequest request);

    /**
      * *   A media file may be transcoded multiple times. This operation returns only the latest transcoding summary.
      * *   You can query transcoding summaries for a maximum of 10 media files in one request.
      * *   You can call the [ListTranscodeTask](~~109120~~) operation to query historical transcoding tasks.
      * *   **You can call this operation to query information only about transcoding tasks created within the past year.**
      *
     */
    CompletableFuture<GetTranscodeSummaryResponse> getTranscodeSummary(GetTranscodeSummaryRequest request);

    /**
      * The video resolution. Valid values:
      * *   **LD**: low definition
      * *   **SD**: standard definition
      * *   **HD**: high definition
      * *   **FHD**: ultra high definition
      * *   **OD**: original definition
      * *   **2K**: 2K
      * *   **4K**: 4K
      * *   **SQ**: standard sound quality
      * *   **HQ**: high sound quality
      * *   **AUTO**: adaptive bitrate Adaptive bitrate streams are returned only if PackageSetting is set in the transcoding template. For more information, see [Basic structures](~~52839~~).
      * > This parameter indicates the definition that is configured in the transcoding template and does not indicate the actual resolution of the output video.
      *
     */
    CompletableFuture<GetTranscodeTaskResponse> getTranscodeTask(GetTranscodeTaskRequest request);

    /**
      * Valid values for the definition of a common transcoding template:
      * *   **LD**: low definition.
      * *   **SD**: standard definition.
      * *   **HD**: high definition.
      * *   **FHD**: ultra high definition.
      * *   **OD**: original quality.
      * *   **2K**
      * *   **4K**
      * *   **SQ**: standard sound quality.
      * *   **HQ**: high sound quality.
      * Valid values for the definition of a Narrowband HD™ 1.0 transcoding template:
      * *   **LD-NBV1**: low definition.
      * *   **SD-NBV1**: standard definition.
      * *   **HD-NBV1**: high definition.
      * *   **FHD-NBV1**: ultra high definition.
      * *   **2K-NBV1**
      * *   **4K-NBV1**
      * >*   You cannot modify the definition of transcoding templates.
      * >*   You cannot modify the system parameters, such as the video resolution, audio resolution, and bitrate, of Narrowband HD™ 1.0 transcoding templates.
      * >*   You can create only Narrowband HD™ 1.0 transcoding templates that support the FLV, M3U8 (HLS), and MP4 output formats.
      *
     */
    CompletableFuture<GetTranscodeTemplateGroupResponse> getTranscodeTemplateGroup(GetTranscodeTemplateGroupRequest request);

    /**
      * The size of the uploaded media file. Unit: byte.
      *
     */
    CompletableFuture<GetURLUploadInfosResponse> getURLUploadInfos(GetURLUploadInfosRequest request);

    /**
      * The type of the media file. Set the value to **video**, which indicates audio and video files.
      *
     */
    CompletableFuture<GetUploadDetailsResponse> getUploadDetails(GetUploadDetailsRequest request);

    /**
      * The video snapshot URLs.
      *
     */
    CompletableFuture<GetVideoInfoResponse> getVideoInfo(GetVideoInfoRequest request);

    /**
      * The duration of the video. Unit: seconds.
      *
     */
    CompletableFuture<GetVideoInfosResponse> getVideoInfos(GetVideoInfosRequest request);

    /**
      * You can call this operation to query information about media files based on the filter conditions that you specify, such as video status and category ID. Information about a maximum of **5,000** media files can be returned for each request. We recommend that you set the StartTime and EndTime parameters to specify a time range for each request. For more information about how to query information about more media files or even all media files, see [SearchMedia](~~86044~~).
      *
     */
    CompletableFuture<GetVideoListResponse> getVideoList(GetVideoListRequest request);

    /**
      * The thumbnail URL of the audio or video file.
      *
     */
    CompletableFuture<GetVideoPlayAuthResponse> getVideoPlayAuth(GetVideoPlayAuthRequest request);

    CompletableFuture<GetVodTemplateResponse> getVodTemplate(GetVodTemplateRequest request);

    CompletableFuture<GetWatermarkResponse> getWatermark(GetWatermarkRequest request);

    /**
      * You can call this operation to query AI processing results about images of a specified video. Images of different videos cannot be queried in one request.
      * - The smart thumbnail feature is not supported. You cannot call this operation.
      * - You can call this operation to query AI processing results about images of a specified video. Images of different videos cannot be queried in one request.
      * ### QPS limit
      * You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits on API operations in ApsaraVideo VoD](~~342790~~).
      *
     */
    CompletableFuture<ListAIImageInfoResponse> listAIImageInfo(ListAIImageInfoRequest request);

    /**
      * The IDs of the jobs that do not exist.
      *
     */
    CompletableFuture<ListAIJobResponse> listAIJob(ListAIJobRequest request);

    /**
      * The returned result.
      *
     */
    CompletableFuture<ListAITemplateResponse> listAITemplate(ListAITemplateRequest request);

    /**
      * The description of the application.
      *
     */
    CompletableFuture<ListAppInfoResponse> listAppInfo(ListAppInfoRequest request);

    /**
      * The name of the identity.
      * *   Specifies the ID of the RAM user when the IdentityType parameter is set to RamUser.
      * *   Specifies the name of the RAM role when the IdentityType parameter is set to RamRole.
      *
     */
    CompletableFuture<ListAppPoliciesForIdentityResponse> listAppPoliciesForIdentity(ListAppPoliciesForIdentityRequest request);

    CompletableFuture<ListAuditSecurityIpResponse> listAuditSecurityIp(ListAuditSecurityIpRequest request);

    CompletableFuture<ListDynamicImageResponse> listDynamicImage(ListDynamicImageRequest request);

    /**
      * The ID of the video category.
      *
     */
    CompletableFuture<ListLiveRecordVideoResponse> listLiveRecordVideo(ListLiveRecordVideoRequest request);

    /**
      * The type of snapshots that are returned. Valid values:
      * *   **CoverSnapshot**: thumbnail snapshot
      * *   **NormalSnapshot**: normal snapshot
      * *   **SpriteSnapshot**: sprite snapshot
      * *   **SpriteOriginSnapshot**: sprite source snapshot
      * *   **WebVttSnapshot**: WebVTT snapshot
      *
     */
    CompletableFuture<ListSnapshotsResponse> listSnapshots(ListSnapshotsRequest request);

    /**
      * The time when the transcoding task was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
      *
     */
    CompletableFuture<ListTranscodeTaskResponse> listTranscodeTask(ListTranscodeTaskRequest request);

    /**
      * The ID of the application. Default value: **app-1000000**. For more information, see [Overview](~~113600~~).
      *
     */
    CompletableFuture<ListTranscodeTemplateGroupResponse> listTranscodeTemplateGroup(ListTranscodeTemplateGroupRequest request);

    CompletableFuture<ListVodTemplateResponse> listVodTemplate(ListVodTemplateRequest request);

    CompletableFuture<ListWatermarkResponse> listWatermark(ListWatermarkRequest request);

    CompletableFuture<MoveAppResourceResponse> moveAppResource(MoveAppResourceRequest request);

    /**
      * The operation that you want to perform. Set the value to **PreloadVodObjectCaches**.
      *
     */
    CompletableFuture<PreloadVodObjectCachesResponse> preloadVodObjectCaches(PreloadVodObjectCachesRequest request);

    /**
      * The title of the online editing project.
      *
     */
    CompletableFuture<ProduceEditingProjectVideoResponse> produceEditingProjectVideo(ProduceEditingProjectVideoRequest request);

    /**
      * The formats of the media streams you want to refresh or prefetch. You can specify multiple formats. Separate multiple formats with commas (,). If you leave this parameter empty, media streams in all formats are refreshed or prefetched by default. Valid values:
      * *   **mp4**
      * *   **m3u8**
      * *   **mp3**
      * *   **flv**
      * *   **webm**
      * *   **ts**
      *
     */
    CompletableFuture<RefreshMediaPlayUrlsResponse> refreshMediaPlayUrls(RefreshMediaPlayUrlsRequest request);

    /**
      * The upload credential.
      * > The upload credential returned by this operation is Base64-encoded. Before you can use an SDK or an API operation to upload a media asset based on the upload credential, you must decode the upload credential by using the Base64 algorithm. You must parse the upload credential only if you use native OSS SDKs or OSS API for uploads.
      *
     */
    CompletableFuture<RefreshUploadVideoResponse> refreshUploadVideo(RefreshUploadVideoRequest request);

    /**
      * The ID of the refresh task. Separate multiple task IDs with commas (,).
      *
     */
    CompletableFuture<RefreshVodObjectCachesResponse> refreshVodObjectCaches(RefreshVodObjectCachesRequest request);

    /**
      * The media files that are registered, including newly registered and repeatedly registered media files.
      *
     */
    CompletableFuture<RegisterMediaResponse> registerMedia(RegisterMediaRequest request);

    CompletableFuture<RestoreMediaResponse> restoreMedia(RestoreMediaRequest request);

    CompletableFuture<SearchEditingProjectResponse> searchEditingProject(SearchEditingProjectRequest request);

    /**
      * The ID of the parent category.
      *
     */
    CompletableFuture<SearchMediaResponse> searchMedia(SearchMediaRequest request);

    /**
      * The name of the review security group. Default value: **Default**. You can specify a maximum of 10 review security groups.
      *
     */
    CompletableFuture<SetAuditSecurityIpResponse> setAuditSecurityIp(SetAuditSecurityIpRequest request);

    /**
      * The ID of the request.
      *
     */
    CompletableFuture<SetCrossdomainContentResponse> setCrossdomainContent(SetCrossdomainContentRequest request);

    /**
      * The ID of the request.
      *
     */
    CompletableFuture<SetDefaultAITemplateResponse> setDefaultAITemplate(SetDefaultAITemplateRequest request);

    CompletableFuture<SetDefaultTranscodeTemplateGroupResponse> setDefaultTranscodeTemplateGroup(SetDefaultTranscodeTemplateGroupRequest request);

    CompletableFuture<SetDefaultWatermarkResponse> setDefaultWatermark(SetDefaultWatermarkRequest request);

    CompletableFuture<SetEditingProjectMaterialsResponse> setEditingProjectMaterials(SetEditingProjectMaterialsRequest request);

    /**
      * The ID of the application. If you do not set this parameter, the default value **app-1000000** is used.
      *
     */
    CompletableFuture<SetMessageCallbackResponse> setMessageCallback(SetMessageCallbackRequest request);

    /**
      * > This operation is available only in the **China (Shanghai)** region.
      *
     */
    CompletableFuture<SetVodDomainCertificateResponse> setVodDomainCertificate(SetVodDomainCertificateRequest request);

    CompletableFuture<SubmitAIImageAuditJobResponse> submitAIImageAuditJob(SubmitAIImageAuditJobRequest request);

    /**
      * The returned data.
      *
     */
    CompletableFuture<SubmitAIImageJobResponse> submitAIImageJob(SubmitAIImageJobRequest request);

    /**
      * The returned data.
      *
     */
    CompletableFuture<SubmitAIJobResponse> submitAIJob(SubmitAIJobRequest request);

    CompletableFuture<SubmitAIMediaAuditJobResponse> submitAIMediaAuditJob(SubmitAIMediaAuditJobRequest request);

    /**
      * The ID of the video.
      *
     */
    CompletableFuture<SubmitDynamicImageJobResponse> submitDynamicImageJob(SubmitDynamicImageJobRequest request);

    /**
      * The ID of the request.
      *
     */
    CompletableFuture<SubmitMediaDNADeleteJobResponse> submitMediaDNADeleteJob(SubmitMediaDNADeleteJobRequest request);

    /**
      * The ID of the job.
      *
     */
    CompletableFuture<SubmitPreprocessJobsResponse> submitPreprocessJobs(SubmitPreprocessJobsRequest request);

    /**
      * The ID of the snapshot template.
      * *   We recommend that you create a snapshot template before you specify the ID of the snapshot template.
      * *   If you set the SnapshotTemplateId parameter, all the other request parameters except the Action and VideoId parameters are ignored.
      * *   For more information about how to create a snapshot template, see [AddVodTemplate](~~99406~~).
      *
     */
    CompletableFuture<SubmitSnapshotJobResponse> submitSnapshotJob(SubmitSnapshotJobRequest request);

    /**
      * The ID of the transcoding template group used when the video is transcoded. To specify a transcoding template group, you can log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com/?spm=a2c4g.11186623.2.18.2f1a2267jCybwh#/vod/settings/transcode/vod) and view the ID of the transcoding template group on the Transcode page.
      *
     */
    CompletableFuture<SubmitTranscodeJobsResponse> submitTranscodeJobs(SubmitTranscodeJobsRequest request);

    CompletableFuture<SubmitWorkflowJobResponse> submitWorkflowJob(SubmitWorkflowJobRequest request);

    /**
      * The returned result.
      *
     */
    CompletableFuture<UpdateAITemplateResponse> updateAITemplate(UpdateAITemplateRequest request);

    /**
      * The ID of the request.
      *
     */
    CompletableFuture<UpdateAppInfoResponse> updateAppInfo(UpdateAppInfoRequest request);

    /**
      * The ID of the request.
      *
     */
    CompletableFuture<UpdateAttachedMediaInfosResponse> updateAttachedMediaInfos(UpdateAttachedMediaInfosRequest request);

    CompletableFuture<UpdateCategoryResponse> updateCategory(UpdateCategoryRequest request);

    CompletableFuture<UpdateEditingProjectResponse> updateEditingProject(UpdateEditingProjectRequest request);

    CompletableFuture<UpdateImageInfosResponse> updateImageInfos(UpdateImageInfosRequest request);

    CompletableFuture<UpdateMediaStorageClassResponse> updateMediaStorageClass(UpdateMediaStorageClassRequest request);

    /**
      * The ID of the transcoding template group.
      *
     */
    CompletableFuture<UpdateTranscodeTemplateGroupResponse> updateTranscodeTemplateGroup(UpdateTranscodeTemplateGroupRequest request);

    /**
      * The ID of the video.
      *
     */
    CompletableFuture<UpdateVideoInfoResponse> updateVideoInfo(UpdateVideoInfoRequest request);

    /**
      * The IDs of the videos that do not exist.
      *
     */
    CompletableFuture<UpdateVideoInfosResponse> updateVideoInfos(UpdateVideoInfosRequest request);

    /**
      * > This operation is available only in the **China (Shanghai)** region.
      *
     */
    CompletableFuture<UpdateVodDomainResponse> updateVodDomain(UpdateVodDomainRequest request);

    CompletableFuture<UpdateVodTemplateResponse> updateVodTemplate(UpdateVodTemplateRequest request);

    /**
      * The configurations such as the position and effect of the text watermark or image watermark. The value is a JSON-formatted string.
      * > The value of this parameter varies with the watermark type. For more information about the data structure, see the "WatermarkConfig" section of the [Media processing parameters](~~98618~~) topic.
      *
     */
    CompletableFuture<UpdateWatermarkResponse> updateWatermark(UpdateWatermarkRequest request);

    /**
      * The ID of the workflow. To view the ID of the workflow, log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Configuration Management** > **Media Processing** > **Workflows**.
      * > If both the WorkflowId and TemplateGroupId parameters are set, the value of the WorkflowId parameter takes effect. For more information, see [Workflows](~~115347~~).
      *
     */
    CompletableFuture<UploadMediaByURLResponse> uploadMediaByURL(UploadMediaByURLRequest request);

    /**
      * The URL of the transcoded stream.
      * If URL authentication is required, you must pass authentication information in this parameter and make sure that the URL can be accessed over the Internet.
      *
     */
    CompletableFuture<UploadStreamByURLResponse> uploadStreamByURL(UploadStreamByURLRequest request);

    CompletableFuture<VerifyVodDomainOwnerResponse> verifyVodDomainOwner(VerifyVodDomainOwnerRequest request);

}
