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
      * > This operation is available only in the **China (Shanghai)** region.
      *
     */
    CompletableFuture<BatchSetVodDomainConfigsResponse> batchSetVodDomainConfigs(BatchSetVodDomainConfigsRequest request);

    /**
      * The operation that you want to perform. Set the value to **BatchStartVodDomain**.
      *
     */
    CompletableFuture<BatchStartVodDomainResponse> batchStartVodDomain(BatchStartVodDomainRequest request);

    /**
      * > *   This operation is available only in the **China (Shanghai)** region.
      * > *   After you disable a domain name for CDN, the information about the domain name is retained. The system automatically reroutes all the requests that are destined for the domain name for CDN to the origin server.
      *
     */
    CompletableFuture<BatchStopVodDomainResponse> batchStopVodDomain(BatchStopVodDomainRequest request);

    /**
      * *   You can cancel only a URL-based upload job in the **Pending** state. You can query the status of a URL-based upload job by calling the [GetURLUploadInfos](~~106830~~) operation.
      * *   You cannot cancel an upload job that already starts.
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
      * > If a video category is deleted, its subcategories, including level 2 and level 3 categories, are also deleted. Exercise caution when you call this operation.
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
      * > For more information, see [Overview](~~55627~~).
      *
     */
    CompletableFuture<DeleteMessageCallbackResponse> deleteMessageCallback(DeleteMessageCallbackRequest request);

    /**
      * The IDs of the videos that do not exist.
      *
     */
    CompletableFuture<DeleteMezzaninesResponse> deleteMezzanines(DeleteMezzaninesRequest request);

    /**
      * * In a multipart upload, fragments may be generated if the upload fails. In most cases, the fragments are automatically deleted after seven days. You can call this operation to delete the generated fragments after the upload is successful or fails.
      * * This operation does not delete the source file or transcoded file, but deletes only the fragments generated during the upload.
      * * If you call the [DeleteVideo](~~52837~~) operation, the entire video file is deleted, including the generated fragments.
      *
     */
    CompletableFuture<DeleteMultipartUploadResponse> deleteMultipartUpload(DeleteMultipartUploadRequest request);

    CompletableFuture<DeleteStreamResponse> deleteStream(DeleteStreamRequest request);

    /**
      * *   You cannot remove the default transcoding template. You can remove it only after it is no longer specified as the default.
      * *   For security purposes, you cannot add, modify, or remove transcoding templates in a transcoding template group that is locked in the ApsaraVideo VOD console. To manage such transcoding template groups, contact the ApsaraVideo VOD technical support.
      * *   You can call the GetTranscodeTemplateGroup operation to query the configurations of a transcoding template group and check whether the transcoding template group is locked by using the response parameter Locked.
      *
     */
    CompletableFuture<DeleteTranscodeTemplateGroupResponse> deleteTranscodeTemplateGroup(DeleteTranscodeTemplateGroupRequest request);

    /**
      * *   This operation physically deletes videos. Deleted videos cannot be recovered. Exercise caution when you call this operation.
      * *   You can call this operation to delete multiple videos at a time.
      * *   When you delete a video, its source file, transcoded stream file, and thumbnail screenshot are also deleted. However, the Alibaba Cloud Content Delivery Network (CDN) cache is not refreshed simultaneously. You can use the refresh feature in the ApsaraVideo VOD console to clear garbage data on CDN nodes. For more information, see [Refresh and prefetch](~~86098~~).
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
      * > *   This operation is available only in the **China (Shanghai)** region.
      * > *   You can call this operation to query only playback statistics collected on videos that are played by using ApsaraVideo Player SDKs.
      * > *   Playback statistics for the previous day are generated at 09:00 on the current day, in UTC+8.
      * > *   You can query data that is generated since January 1, 2018. The maximum time range to query is 180 days.
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
      * If you specify neither the StartTime parameter nor the EndTime parameter, the data in the last 24 hours is queried. Alternatively, you can specify both the StartTime and EndTime parameters to query data that is generated in the specified duration. You can query data for the last 90 days at most.
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

    /**
      * * This operation is available only in the **China (Shanghai)** region.
      * * ApsaraVideo VOD stores the origin traffic data for 90 days before the data is deleted.
      * * If you do not set the `StartTime` or `EndTime` parameter, the request returns the data collected in the last 24 hours. If you set both the `StartTime` and `EndTime` parameters, the request returns the data collected within the specified time range.
      * * You can specify a maximum of 500 domain names in a request. Separate multiple domain names with commas (,). If you specify multiple domain names in a request, aggregation results are returned.
      * ### Time granularity
      * The time granularity supported by the Interval parameter varies based on the time range per query specified by using `StartTime` and `EndTime`. The following table describes the time period within which historical data is available and the data delay.
      * |Time granularity|Time range per query (days)|Historical data available (days)|Data delay|
      * |---|---|---|---|
      * |5 minutes|(0, 3\\]|93|15 minutes|
      * |1 hour|(3, 31\\]|186|4 hours|
      * |1 day|(31, 366\\]|366|04:00 on the next day|
      *
     */
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
      * > -   This operation is available only in the **China (Shanghai)** region.
      * >-  You can specify a maximum of 100 accelerated domain names in a request. Separate multiple domain names with commas (,). If you do not specify an accelerated domain name, the data of all accelerated domain names within your Alibaba Cloud account is returned.
      * >-  You can query data in the last year. The maximum time range that can be queried is three months. If you specify a time range of one to three days, the system returns data on an hourly basis. If you specify a time range of four days or more, the system returns data on a daily basis.
      *
     */
    CompletableFuture<DescribeVodDomainUsageDataResponse> describeVodDomainUsageData(DescribeVodDomainUsageDataRequest request);

    /**
      * > *   This operation is available only in the **China (Shanghai)** region.
      * > *   You can call the [RefreshVodObjectCaches](~~69215~~) operation to refresh content and the [PreloadVodObjectCaches](~~69211~~) operation to prefetch content.
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
      * > For more information, see [Overview](~~55627~~).
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
      * In a single request, you can obtain the information about a maximum of first **5,000** video records that meet the specified filter criteria, such as the video status and category. We recommend that you set the StartTime and EndTime parameters to narrow down the time range for queries and perform multiple queries. For more information about how to query the information about more videos or even all videos, see [SearchMedia](~~86044~~).
      *
     */
    CompletableFuture<GetVideoListResponse> getVideoList(GetVideoListRequest request);

    /**
      * *   You can call this operation to obtain a playback credential when you use ApsaraVideo Player SDK to play a media file based on PlayAuth. The credential is used to obtain the playback URL.
      * *   You cannot obtain the playback URL of a video by using a credential that has expired. A new credential is required.
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
      * You can query a maximum of 5,000 videos based on the specified filter condition.
      *
     */
    CompletableFuture<ListLiveRecordVideoResponse> listLiveRecordVideo(ListLiveRecordVideoRequest request);

    /**
      * If multiple snapshots of a video exist, the data of the latest snapshot is returned.
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
      * After you store an audio or video file in an Object Storage Service (OSS) bucket that is used for ApsaraVideo VOD, you can call the RegisterMedia operation to register the media file. After the media file is registered, you can use the media ID associated with the media file to submit transcoding jobs and snapshot jobs in ApsaraVideo VOD. For more information, see [SubmitTranscodeJobs](~~68570~~) and [SubmitSnapshotJob](~~72213~~).
      * > *   You can register up to 10 OSS media files that have the same storage location at a time.
      * > *   If you use the ApsaraVideo VOD console to upload a media file and do not specify a transcoding template group ID, ApsaraVideo VOD uses the default transcoding template group to transcode the media file. However, if you do not specify a transcoding template group ID when you call the RegisterMedia operation, ApsaraVideo VOD does not automatically transcode the media file after the media file is registered. If you specify a transcoding template group ID, ApsaraVideo VOD uses the specified transcoding template group to transcode the media file.
      * > *   If the media file that you want to register is registered before, this operation returns only the unique media ID that is associated with the media file. No further processing is performed.
      *
     */
    CompletableFuture<RegisterMediaResponse> registerMedia(RegisterMediaRequest request);

    CompletableFuture<SearchEditingProjectResponse> searchEditingProject(SearchEditingProjectRequest request);

    /**
      * The preprocessing status. Valid values:
      * *   **UnPreprocess**
      * *   **Preprocessing**
      * *   **PreprocessSucceed**
      * *   **PreprocessFailed**
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
      * ## Usage note
      * ApsaraVideo VOD supports the HTTP and MNS callback methods. For more information, see [Event notification](~~55627~~).
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
      * The specific parameter of a video is updated only when a new value is passed in the parameter.
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
      * You can modify only the name and configurations of a watermark.
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
