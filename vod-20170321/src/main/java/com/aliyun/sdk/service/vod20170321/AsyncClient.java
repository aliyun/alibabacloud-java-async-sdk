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
      * *   Regions that support this operation: **China (Beijing)**, **China (Shanghai)**, and **Singapore**.
      * *   Before you add an AI template for automated review and smart thumbnail tasks, make sure that [automated review](https://ai.aliyun.com/vi/censor) and [smart thumbnail](https://ai.aliyun.com/vi/cover) are enabled.
      *
     */
    CompletableFuture<AddAITemplateResponse> addAITemplate(AddAITemplateRequest request);

    /**
      * A maximum of three category levels can be created. Each category can contain up to 100 subcategories.
      *
     */
    CompletableFuture<AddCategoryResponse> addCategory(AddCategoryRequest request);

    CompletableFuture<AddEditingProjectResponse> addEditingProject(AddEditingProjectRequest request);

    CompletableFuture<AddEditingProjectMaterialsResponse> addEditingProjectMaterials(AddEditingProjectMaterialsRequest request);

    /**
      * *   You cannot perform custom operations on transcoding template groups that are **locked** in the ApsaraVideo VOD console. You can call the [GetTranscodeTemplateGroup](~~GetTranscodeTemplateGroup~~) operation to query the information about a transcoding template group and check whether the transcoding template group is locked based on the value of the Locked parameter. You can call the [UpdateTranscodeTemplateGroup](~~UpdateTranscodeTemplateGroup~~) operation to unlock a transcoding template group if it is locked. Then, you can perform custom operations on the transcoding template group.
      * *   An Object Storage Service (OSS) bucket is required to store files that are used for transcoding. You cannot create a transcoding template group if no bucket is available. To activate a bucket, perform the following operations: Log on to the ApsaraVideo VOD console. In the left-side navigation pane, choose **Configuration Management > Media Management > Storage**. On the **Storage** page, activate the bucket that is allocated by ApsaraVideo VOD.
      * *   You cannot add transcoding templates to the **No Transcoding** template group.
      * *   You can create a maximum of 20 transcoding template groups.
      * *   You can add a maximum of 20 transcoding templates to a transcoding template group.
      * *   If you want to generate a URL for adaptive bitrate streaming, you can add video packaging templates to a transcoding template group. You can add a maximum of 10 video packaging templates to a transcoding template group. If you add more than 10 video packaging templates, URLs of the video transcoded based on the video packaging templates are generated but the URL for adaptive bitrate streaming is not generated.
      * ### QPS limits
      * You can call this operation up to five times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits](~~342790~~).
      *
     */
    CompletableFuture<AddTranscodeTemplateGroupResponse> addTranscodeTemplateGroup(AddTranscodeTemplateGroupRequest request);

    /**
      * *   This operation is available only in the **China (Shanghai)** region.
      * *   Before you add a domain name to accelerate, you must activate ApsaraVideo VOD and apply for an Internet content provider (ICP) filing for the domain name. For more information about how to activate ApsaraVideo VOD, see [Activate ApsaraVideo VOD](~~51512~~).
      * *   If the content on the origin server is not stored on Alibaba Cloud, the content must be reviewed by Alibaba Cloud. The review will be complete by the end of the next business day after you submit an application.
      * *   You can add only one domain name to accelerate in a request. You can add a maximum of 20 accelerated domain names within an Alibaba Cloud account.
      *
     */
    CompletableFuture<AddVodDomainResponse> addVodDomain(AddVodDomainRequest request);

    /**
      * > *   After you create a snapshot template, you can specify the ID of the snapshot template in the request of the [SubmitSnapshotJob](~~72213~~) operation to take snapshots.
      * > *   You can receive the [SnapshotComplete](~~57337~~) event notification by using an HTTP or HTTPS URL or in Message Service (MNS). For more information, see [Overview](~~55627~~).
      *
     */
    CompletableFuture<AddVodTemplateResponse> addVodTemplate(AddVodTemplateRequest request);

    /**
      * > ApsaraVideo VOD supports static image watermarks such as PNG files and dynamic image watermarks such as GIF, APNG, and MOV files.
      *
     */
    CompletableFuture<AddWatermarkResponse> addWatermark(AddWatermarkRequest request);

    /**
      * > You can grant a RAM user or RAM role permissions to access up to 10 applications.
      *
     */
    CompletableFuture<AttachAppPolicyToIdentityResponse> attachAppPolicyToIdentity(AttachAppPolicyToIdentityRequest request);

    /**
      * > This operation is available only in the **China (Shanghai)** region.
      *
     */
    CompletableFuture<BatchSetVodDomainConfigsResponse> batchSetVodDomainConfigs(BatchSetVodDomainConfigsRequest request);

    /**
      * *   This operation is available only in the **China (Shanghai)** region.
      * *   If the domain name that you want to enable is invalid or your Alibaba Cloud account has overdue payments, you cannot call this operation to enable the domain name.
      *
     */
    CompletableFuture<BatchStartVodDomainResponse> batchStartVodDomain(BatchStartVodDomainRequest request);

    /**
      * *   This operation is available only in the **China (Shanghai)** region.
      * *   After you disable an accelerated domain name, the information about the domain name is retained. The system automatically reroutes all the requests that are destined for the domain name to the origin server.
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
      * You can create up to 10 applications within an Alibaba Cloud account. For more information, see [Multi-application service](~~113600~~).
      * ### QPS limits
      * You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits on API operations in ApsaraVideo VOD](~~342790~~).
      *
     */
    CompletableFuture<CreateAppInfoResponse> createAppInfo(CreateAppInfoRequest request);

    CompletableFuture<CreateAuditResponse> createAudit(CreateAuditRequest request);

    /**
      * *   The process of obtaining upload URLs and credentials is a core process in ApsaraVideo VOD and is required for each upload operation. ApsaraVideo VOD provides multiple upload methods. You can upload auxiliary media assets by using server upload SDKs, client upload SDKs, URLs of auxiliary media assets, Object Storage Service (OSS) API, or native OSS SDKs. Each upload method has different requirements for obtaining upload URLs and credentials. For more information, see the "Usage notes" section of the [Upload URLs and credentials](~~55397~~) topic.
      * *   If the upload credential expires, you can call this operation to obtain a new upload URL and credential. The default validity period of an upload credential is 3,000 seconds.
      * *   You can configure a callback to receive an [AttachedMediaUploadComplete](~~103250~~) event notification to determine whether the upload is successful.
      *
     */
    CompletableFuture<CreateUploadAttachedMediaResponse> createUploadAttachedMedia(CreateUploadAttachedMediaRequest request);

    /**
      * *   You must obtain a URL and a credential before you upload an image to ApsaraVideo VOD. ApsaraVideo VOD provides multiple upload methods. You can upload files by using server upload SDKs, client upload SDKs, URLs, Object Storage Service (OSS) API, or OSS SDKs. Each upload method has different requirements for obtaining upload URLs and credentials. For more information, see the "Usage notes" section of the [Upload URLs and credentials](~~55397~~) topic.
      * *   You cannot refresh the upload URL or credential when you upload images. If the image upload credential expires, you can call this operation to obtain a new upload URL and credential. By default, the validity period of an image upload credential is 3,000 seconds.
      * *   You can call the [CreateUploadAttachedMedia](~~98467~~) operation to upload image watermarks.
      * *   You can configure a callback for [ImageUploadComplete](~~91968~~) to receive notifications about the image upload status.
      *
     */
    CompletableFuture<CreateUploadImageResponse> createUploadImage(CreateUploadImageRequest request);

    /**
      * *   You can call this operation to obtain upload URLs and credentials for video and audio files. For more information, see [Upload URLs and credentials](~~55397~~).
      * *   You can call this operation only to obtain the upload URLs and credentials for media files and create media assets in ApsaraVideo VOD. You cannot call this operation to upload media files. For more information about how to upload media files by calling API operations, see [Upload media files by calling API operations](~~476208~~).
      * *   If the upload credential expires, call the [RefreshUploadVideo](~~55408~~) operation to obtain a new upload credential. The default validity period of an upload credential is 3,000 seconds.
      * *   You can configure a callback to receive an [event notification](~~55396~~) when an audio or video file is uploaded. Alternatively, after you upload an audio or video file, you can call the [GetMezzanineInfo](~~59624~~) operation to determine whether the upload is successful based on the value of the Status response parameter.
      * *   The VideoId parameter that is returned after you call this operation can be used for media processing or lifecycle management of media assets.
      * *   You must obtain a URL and a credential before you upload a media file to ApsaraVideo VOD. ApsaraVideo VOD supports multiple upload methods. Each method has different requirements on upload URLs and credentials. For more information, see [Upload URLs and credentials](~~55397~~).
      *
     */
    CompletableFuture<CreateUploadVideoResponse> createUploadVideo(CreateUploadVideoRequest request);

    CompletableFuture<DecryptKMSDataKeyResponse> decryptKMSDataKey(DecryptKMSDataKeyRequest request);

    /**
      * *   Regions that support this operation: **China (Beijing)** and **China (Shanghai)**.
      * *   This operation deletes only information about images that are submitted for AI processing. The image files are not deleted.
      *
     */
    CompletableFuture<DeleteAIImageInfosResponse> deleteAIImageInfos(DeleteAIImageInfosRequest request);

    /**
      * *   Regions that support this operation: **China (Beijing)**, **China (Shanghai)**, and **Singapore**.
      * *   You cannot delete an AI template that is set as the default template.
      *
     */
    CompletableFuture<DeleteAITemplateResponse> deleteAITemplate(DeleteAITemplateRequest request);

    /**
      * ## Usage note
      * Application with resources can not be deleted.
      *
     */
    CompletableFuture<DeleteAppInfoResponse> deleteAppInfo(DeleteAppInfoRequest request);

    /**
      * This operation physically deletes auxiliary media assets. Deleted auxiliary media assets cannot be recovered. Exercise caution when you call this operation.
      *
     */
    CompletableFuture<DeleteAttachedMediaResponse> deleteAttachedMedia(DeleteAttachedMediaRequest request);

    /**
      * > If a video category is deleted, its subcategories, including level 2 and level 3 categories, are also deleted. Exercise caution when you call this operation.
      *
     */
    CompletableFuture<DeleteCategoryResponse> deleteCategory(DeleteCategoryRequest request);

    /**
      * > This operation deletes only the information about animated stickers, but not the animated stickers themselves.
      *
     */
    CompletableFuture<DeleteDynamicImageResponse> deleteDynamicImage(DeleteDynamicImageRequest request);

    /**
      * You can call this operation to delete multiple online editing projects at a time.
      * ### QPS limits
      * You can call this operation up to 20 times per second per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits on API operations in ApsaraVideo VOD](~~342790~~).
      *
     */
    CompletableFuture<DeleteEditingProjectResponse> deleteEditingProject(DeleteEditingProjectRequest request);

    CompletableFuture<DeleteEditingProjectMaterialsResponse> deleteEditingProjectMaterials(DeleteEditingProjectMaterialsRequest request);

    /**
      * *   After you call this operation to delete an image, the source file is permanently deleted and cannot be recovered. If some images are cached on Alibaba Cloud CDN points of presence (POPs), the image URLs do not immediately become invalid.
      * *   You can call this operation to delete uploaded images and video snapshots.
      * ### QPS limits
      * You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits on API operations in ApsaraVideo VOD](~~342790~~).
      *
     */
    CompletableFuture<DeleteImageResponse> deleteImage(DeleteImageRequest request);

    /**
      * > For more information, see [Overview](~~55627~~).
      *
     */
    CompletableFuture<DeleteMessageCallbackResponse> deleteMessageCallback(DeleteMessageCallbackRequest request);

    /**
      * All media processing operations in ApsaraVideo VOD, such as transcoding, snapshot capture, and content moderation, are performed on mezzanine files. If you delete the mezzanine files, you cannot perform follow-up media processing operations. Exercise caution when you call this operation.
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
      * *   You cannot call this operation to delete the default transcoding template. You can delete the transcoding template when it is no longer specified as the default one.
      * *   For security purposes, you cannot add, modify, or delete transcoding templates in a transcoding template group that is locked. To check whether a transcoding template group is locked, call the [GetTranscodeTemplateGroup](~~GetTranscodeTemplateGroup~~) operation and obtain the Locked parameter from the response. To modify transcoding templates within a locked transcoding template group, you must call the [UpdateTranscodeTemplateGroup](~~UpdateTranscodeTemplateGroup~~) operation to unlock the transcoding template group first.
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
      * > *   This operation is available only in the **China (Shanghai)** region.
      * > *   After a domain name for CDN is removed from ApsaraVideo VOD, the domain name becomes unavailable. Proceed with caution. We recommend that you restore the A record at your DNS service provider before you remove the domain name for CDN.
      * > *   After you call this operation to remove a domain name for CDN from ApsaraVideo VOD, all records that are related to the domain name are deleted. If you only want to disable a domain name for CDN, call the [BatchStopVodDomain](~~120208~~) operation.
      *
     */
    CompletableFuture<DeleteVodDomainResponse> deleteVodDomain(DeleteVodDomainRequest request);

    /**
      * > *   This operation is available only in the **China (Shanghai)** region.
      * > *   After the configurations of a domain name for CDN are deleted, the domain name becomes unavailable. We recommend that you restore the A record at your DNS service provider before you delete the configurations of the domain name for CDN.
      * > *   After you call this operation to delete the configurations of a domain name for CDN, all records that are related to the domain name are deleted. If you only want to disable a domain name for CDN, call the [BatchStopVodDomain](~~120208~~) operation.
      *
     */
    CompletableFuture<DeleteVodSpecificConfigResponse> deleteVodSpecificConfig(DeleteVodSpecificConfigRequest request);

    CompletableFuture<DeleteVodTemplateResponse> deleteVodTemplate(DeleteVodTemplateRequest request);

    /**
      * > *   The default watermark cannot be deleted.
      * > *   If you delete a watermark, its mezzanine file is also physically deleted and cannot be recovered.
      *
     */
    CompletableFuture<DeleteWatermarkResponse> deleteWatermark(DeleteWatermarkRequest request);

    /**
      * > *   This operation is available only in the **China (Shanghai)** region.
      * > *   You can query playback statistics on top 1,000 videos at most on a specified day. By default, top videos are sorted in descending order based on video views.
      * > *   You can call this operation to query only playback statistics collected on videos that are played by using ApsaraVideo Player SDKs.
      * > *   Playback statistics for the previous day are generated at 09:00 on the current day, in UTC+8.
      * > *   You can query data that is generated since January 1, 2018. The maximum time range to query is 180 days.
      *
     */
    CompletableFuture<DescribePlayTopVideosResponse> describePlayTopVideos(DescribePlayTopVideosRequest request);

    /**
      * > *   This operation is available only in the **China (Shanghai)** region.
      * > *   You can call this operation to query only playback statistics collected on videos that are played by using ApsaraVideo Player SDKs.
      * > *   Playback statistics for the previous day are generated at 09:00 on the current day, in UTC+8.
      * > *   You can query data that is generated since January 1, 2018. The maximum time range to query is 180 days.
      *
     */
    CompletableFuture<DescribePlayUserAvgResponse> describePlayUserAvg(DescribePlayUserAvgRequest request);

    /**
      * *   This operation is available only in the **China (Shanghai)** region.
      * *   You can call this operation to query only playback statistics collected on videos that are played by using ApsaraVideo Player SDKs.
      * *   Playback statistics for the current day are generated at 09:00 (UTC+8) on the next day.
      * *   You can query data that is generated since January 1, 2018. The maximum time range to query is 180 days.
      *
     */
    CompletableFuture<DescribePlayUserTotalResponse> describePlayUserTotal(DescribePlayUserTotalRequest request);

    /**
      * *   This operation is available only in the **China (Shanghai)** region.
      * *   You can call this operation to query only playback statistics collected on videos that are played by using ApsaraVideo Player SDKs.
      * *   Playback statistics for the current day are generated at 09:00 (UTC+8) on the next day.
      * *   You can query only data in the last 730 days. The maximum time range to query is 180 days.
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
      * > This operation is available only in the **China (Shanghai)** region.
      *
     */
    CompletableFuture<DescribeVodCertificateListResponse> describeVodCertificateList(DescribeVodCertificateListRequest request);

    /**
      * If you specify neither the StartTime parameter nor the EndTime parameter, the data in the last 24 hours is queried. Alternatively, you can specify both the StartTime and EndTime parameters to query data that is generated in the specified duration. You can query data for the last 90 days at most.
      *
     */
    CompletableFuture<DescribeVodDomainBpsDataResponse> describeVodDomainBpsData(DescribeVodDomainBpsDataRequest request);

    /**
      * > This operation is available only in the **China (Shanghai)** region.
      *
     */
    CompletableFuture<DescribeVodDomainCertificateInfoResponse> describeVodDomainCertificateInfo(DescribeVodDomainCertificateInfoRequest request);

    /**
      * > This operation is available only in the **China (Shanghai)** region.
      *
     */
    CompletableFuture<DescribeVodDomainConfigsResponse> describeVodDomainConfigs(DescribeVodDomainConfigsRequest request);

    /**
      * > This operation is available only in the **China (Shanghai)** region.
      *
     */
    CompletableFuture<DescribeVodDomainDetailResponse> describeVodDomainDetail(DescribeVodDomainDetailRequest request);

    /**
      * *   This operation is available only in the **China (Shanghai)** region.
      * *   For more information about the log format and latency, see [Download logs](~~86099~~).
      * *   If you specify neither StartTime nor EndTime, the log data in the previous 24 hours is queried.
      * *   You can specify both StartTime and EndTime to query the log data that is generated in the specified time range.
      * ### [](#qps)QPS limits
      * You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits on API operations](~~342790~~).
      *
     */
    CompletableFuture<DescribeVodDomainLogResponse> describeVodDomainLog(DescribeVodDomainLogRequest request);

    /**
      * * This operation is available only in the **China (Shanghai)** region.
      * * ApsaraVideo VOD stores the origin bandwidth data for 90 days before the data is deleted.
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
      * *   This operation is available only in the **China (Shanghai)** region.
      * *   You can specify up to 100 accelerated domain names in a request. Separate multiple domain names with commas (,). If you do not specify an accelerated domain name, the data of all accelerated domain names within your Alibaba Cloud account is returned.
      * *   You can query data in the last year. The maximum time range that can be queried is three months. If you specify a time range of one to three days, the system returns data on an hourly basis. If you specify a time range of four days or more, the system returns data on a daily basis.
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
      * You can grant a maximum of 10 application permissions to a RAM user or RAM role.
      *
     */
    CompletableFuture<DetachAppPolicyFromIdentityResponse> detachAppPolicyFromIdentity(DetachAppPolicyFromIdentityRequest request);

    CompletableFuture<GenerateKMSDataKeyResponse> generateKMSDataKey(GenerateKMSDataKeyRequest request);

    /**
      * *   Regions that support this operation: **China (Beijing)** and **China (Shanghai)**.
      * *   Call the [SubmitAIImageJob](~~SubmitAIImageJob~~) operation to submit image AI processing jobs before you call this operation to query image AI processing jobs.
      * *   You can query a maximum of 10 jobs of image AI processing in one request.
      *
     */
    CompletableFuture<GetAIImageJobsResponse> getAIImageJobs(GetAIImageJobsRequest request);

    /**
      * ApsaraVideo VOD stores the snapshots of the intelligent review results free of charge for two weeks. After this period, the snapshots are automatically deleted.
      *
     */
    CompletableFuture<GetAIMediaAuditJobResponse> getAIMediaAuditJob(GetAIMediaAuditJobRequest request);

    /**
      * *   Regions that support this operation: **China (Beijing)**, **China (Shanghai)**, and **Singapore**.
      * *   Before you call this operation to query details of an AI template, you must obtain the ID of the AI template.
      *
     */
    CompletableFuture<GetAITemplateResponse> getAITemplate(GetAITemplateRequest request);

    /**
      * *   Regions that support this operation: **China (Beijing)**, **China (Shanghai)**, and **Singapore**.
      * *   You can obtain the smart tagging results by using the video ID.
      *
     */
    CompletableFuture<GetAIVideoTagResultResponse> getAIVideoTagResult(GetAIVideoTagResultRequest request);

    /**
      * Supports batch query.
      *
     */
    CompletableFuture<GetAppInfosResponse> getAppInfos(GetAppInfosRequest request);

    CompletableFuture<GetAttachedMediaInfoResponse> getAttachedMediaInfo(GetAttachedMediaInfoRequest request);

    CompletableFuture<GetAuditHistoryResponse> getAuditHistory(GetAuditHistoryRequest request);

    CompletableFuture<GetCategoriesResponse> getCategories(GetCategoriesRequest request);

    /**
      * *   Regions that support this operation: **China (Beijing)**, **China (Shanghai)**, and **Singapore**.
      * *   You can query information only about the default AI template for automated review.
      *
     */
    CompletableFuture<GetDefaultAITemplateResponse> getDefaultAITemplate(GetDefaultAITemplateRequest request);

    CompletableFuture<GetDigitalWatermarkExtractResultResponse> getDigitalWatermarkExtractResult(GetDigitalWatermarkExtractResultRequest request);

    CompletableFuture<GetEditingProjectResponse> getEditingProject(GetEditingProjectRequest request);

    /**
      * During editing, you can add materials to the timeline, but some of them may not be used.
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
      * If notifications for the [CreateAuditComplete](~~89576~~) event are configured, event notifications are sent to the callback URL after automated review is complete. You can call this operation to query the details of audio review results.
      *
     */
    CompletableFuture<GetMediaAuditAudioResultDetailResponse> getMediaAuditAudioResultDetail(GetMediaAuditAudioResultDetailRequest request);

    CompletableFuture<GetMediaAuditResultResponse> getMediaAuditResult(GetMediaAuditResultRequest request);

    /**
      * - By default, only details of snapshots that violate content regulations and potentially violate content regulations are returned.
      * - ApsaraVideo VOD stores the snapshots in the automated review results free of charge for two weeks. After this period, the snapshots are automatically deleted.
      *
     */
    CompletableFuture<GetMediaAuditResultDetailResponse> getMediaAuditResultDetail(GetMediaAuditResultDetailRequest request);

    CompletableFuture<GetMediaAuditResultTimelineResponse> getMediaAuditResultTimeline(GetMediaAuditResultTimelineRequest request);

    /**
      * Regions that support this operation: **China (Beijing)**, **China (Shanghai)**, and **Singapore**.
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
      * > For more information, see [Event notification](~~55627~~).
      *
     */
    CompletableFuture<GetMessageCallbackResponse> getMessageCallback(GetMessageCallbackRequest request);

    /**
      * > You can obtain the complete mezzanine file information only after a stream is transcoded.
      *
     */
    CompletableFuture<GetMezzanineInfoResponse> getMezzanineInfo(GetMezzanineInfoRequest request);

    /**
      * *   You can use the ID of a media file to query the playback URL of the file. After you integrate ApsaraVideo Player SDK for URL-based playback or a third-party player, you can use the obtained playback URLs to play audio and video files.
      * *   Only videos whose Status is Normal can be played. The Status parameter in the response indicates the status of the video. For more information, see [Overview](~~57290~~).
      * *   If video playback fails, you can call the [GetMezzanineInfo](~~GetMezzanineInfo~~) operation to check whether the video source information is correct.
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
      * You can call this operation to query only transcoding tasks created within the past year.
      *
     */
    CompletableFuture<GetTranscodeTaskResponse> getTranscodeTask(GetTranscodeTaskRequest request);

    /**
      * This operation returns the information about the specified transcoding template group and the configurations of all the transcoding templates in the group.
      *
     */
    CompletableFuture<GetTranscodeTemplateGroupResponse> getTranscodeTemplateGroup(GetTranscodeTemplateGroupRequest request);

    /**
      * You can query the information about a URL-based upload job by specifying the upload URL or using the job ID returned when you upload media files. The information includes the status of the upload job, custom configurations, the time when the job was created, and the time when the job was complete.
      * If the upload fails, you can view the error code and error message. If the upload is successful, you can obtain the video ID.
      *
     */
    CompletableFuture<GetURLUploadInfosResponse> getURLUploadInfos(GetURLUploadInfosRequest request);

    /**
      * *   You can call this operation to obtain the upload details only about audio and video files.
      * *   If you use the ApsaraVideo VOD console to upload audio and video files, you can call this operation to query information such as the upload ratio. If you use an upload SDK to upload audio and video files, make sure that the version of the [upload SDK](~~52200~~) meets one of the following requirements:
      *     *   The version of the upload SDK for Java is 1.4.4 or later.
      *     *   The version of the upload SDK for C++ is 1.0.0 or later.
      *     *   The version of the upload SDK for PHP is 1.0.2 or later.
      *     *   The version of the upload SDK for Python is 1.3.0 or later.
      *     *   The version of the upload SDK for JavaScript is 1.4.0 or later.
      *     *   The version of the upload SDK for Android is 1.5.0 or later.
      *     *   The version of the upload SDK for iOS is 1.5.0 or later.
      *
     */
    CompletableFuture<GetUploadDetailsResponse> getUploadDetails(GetUploadDetailsRequest request);

    /**
      * The video snapshot URLs.
      * > This operation returns only data about the snapshots that are captured when you upload a video. The snapshot data includes data of the thumbnail and snapshot data that is generated based on the workflow setting. To query the snapshot data that is generated after the video is uploaded, call the [ListSnapshots](~~ListSnapshots~~) operation. For more information, see [Video snapshots](~~99368~~).
      *
     */
    CompletableFuture<GetVideoInfoResponse> getVideoInfo(GetVideoInfoRequest request);

    /**
      * You can call this operation to obtain the basic information about multiple videos at a time based on video IDs. The basic information includes the title, description, duration, thumbnail URL, status, creation time, size, snapshots, category, and tags of each video.
      *
     */
    CompletableFuture<GetVideoInfosResponse> getVideoInfos(GetVideoInfosRequest request);

    /**
      * You can call this operation to query information about media files based on the filter conditions that you specify, such as video status and category ID. Information about a maximum of **5,000** media files can be returned for each request. We recommend that you set the StartTime and EndTime parameters to specify a time range for each request. For more information about how to query information about more media files or even all media files, see [SearchMedia](~~86044~~).
      *
     */
    CompletableFuture<GetVideoListResponse> getVideoList(GetVideoListRequest request);

    /**
      * ###
      * *   You can call this operation to obtain a playback credential when you use ApsaraVideo Player SDK to play a media file based on PlayAuth. The credential is used to obtain the playback URL.
      * *   You cannot obtain the playback URL of a video by using a credential that has expired. A new credential is required.
      * ### QPS limit
      * You can call this operation up to 360 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limit on API operations](~~342790~~).
      *
     */
    CompletableFuture<GetVideoPlayAuthResponse> getVideoPlayAuth(GetVideoPlayAuthRequest request);

    CompletableFuture<GetVodTemplateResponse> getVodTemplate(GetVodTemplateRequest request);

    CompletableFuture<GetWatermarkResponse> getWatermark(GetWatermarkRequest request);

    /**
      * *   Regions that support this operation: **China (Beijing)** and **China (Shanghai)**.
      * *   You can call this operation to query AI processing results about images of a specified video. Images of different videos cannot be queried in one request.
      *
     */
    CompletableFuture<ListAIImageInfoResponse> listAIImageInfo(ListAIImageInfoRequest request);

    /**
      * *   Regions that support this operation: **China (Beijing)**, **China (Shanghai)**, and **Singapore**.
      * *   You can call this operation to query video fingerprinting jobs and smart tagging jobs.
      *
     */
    CompletableFuture<ListAIJobResponse> listAIJob(ListAIJobRequest request);

    /**
      * *   Regions that support this operation: **China (Beijing)**, **China (Shanghai)**, and **Singapore**.
      * *   You can call this operation to query AI templates of a specified type.
      *
     */
    CompletableFuture<ListAITemplateResponse> listAITemplate(ListAITemplateRequest request);

    /**
      * Supports filtering queries by application status.
      *
     */
    CompletableFuture<ListAppInfoResponse> listAppInfo(ListAppInfoRequest request);

    /**
      * > The IdentityType and IdentityName parameters take effect only when an identity assumes the application administrator role to call this operation. Otherwise, only application policies that are attached to the current identity are returned.
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
      * *   You can call the [GetTranscodeTask](~~109121~~) operation to query details about transcoding jobs.
      * *   **You can call this operation to query only transcoding tasks created within the past year.**
      *
     */
    CompletableFuture<ListTranscodeTaskResponse> listTranscodeTask(ListTranscodeTaskRequest request);

    /**
      * > This operation does not return the configurations of transcoding templates in each transcoding template group. To query the configurations of transcoding templates in a specific transcoding template group, call the [GetTranscodeTemplateGroup](~~102670~~) operation.
      *
     */
    CompletableFuture<ListTranscodeTemplateGroupResponse> listTranscodeTemplateGroup(ListTranscodeTemplateGroupRequest request);

    CompletableFuture<ListVodTemplateResponse> listVodTemplate(ListVodTemplateRequest request);

    CompletableFuture<ListWatermarkResponse> listWatermark(ListWatermarkRequest request);

    CompletableFuture<MoveAppResourceResponse> moveAppResource(MoveAppResourceRequest request);

    /**
      * > *   This operation is available only in the **China (Shanghai)** region.
      * > *   You can submit a maximum of 500 requests to prefetch resources based on URLs each day by using an Alibaba Cloud account. You cannot prefetch resources based on directories.
      * > *   You can call the [RefreshVodObjectCaches](~~69215~~) operation to refresh content and the [PreloadVodObjectCaches](~~69211~~l) operation to prefetch content.
      *
     */
    CompletableFuture<PreloadVodObjectCachesResponse> preloadVodObjectCaches(PreloadVodObjectCachesRequest request);

    /**
      * *   This operation returns only the submission result of a video production task. When the submission result is returned, video production may still be in progress. After a video production task is submitted, the task is queued in the background for asynchronous processing.
      * *   The source files that are used in the timeline of an online editing project can be materials directly uploaded to the online project or selected from the media asset library.
      * *   Videos are produced based on ProjectId and Timeline. The following rules apply when you specify the parameters:
      *     *   You must specify at least one of the ProjectId and Timeline parameters. Otherwise, video production fails.
      *     *   If you specify only the Timeline parameter, the system automatically creates an online editing project based on the specified timeline. Then, the system uses the source files specified in the timeline to produce videos.
      *     *   If you specify only the ProjectId parameter, the system obtains the latest timeline data of the specified project to produce videos.
      *     *   If you specify both the ProjectId and Timeline parameters, the system produces videos based on the specified timeline and updates the timeline data for the specified online editing project. You can also specify other parameters to update the corresponding information about the online editing project.
      * *   After a video is produced, the video is automatically uploaded to ApsaraVideo VOD. Then, the **ProduceMediaComplete** and **FileUploadComplete** event notifications are sent to you. After the produced video is transcoded, the **StreamTranscodeComplete** and **TranscodeComplete** event notifications are sent to you.
      * *   You can add special effects to the video. For more information, see [Special effects](~~69082~~).
      * ### QPS limits
      * You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits on API operations in ApsaraVideo VOD](~~342790~~).
      *
     */
    CompletableFuture<ProduceEditingProjectVideoResponse> produceEditingProjectVideo(ProduceEditingProjectVideoRequest request);

    /**
      * - ApsaraVideo VOD allows you to refresh and prefetch resources. The refresh feature forces the point of presence (POP) to clear cached resources and retrieve the latest resources from origin servers. The prefetch feature allows the POP to retrieve frequently accessed resources from origin servers during off-peak hours. This increases the cache hit ratio.
      * - You can call this operation to submit refresh or prefetch tasks based on the media ID. You can also specify the format and resolution of the media streams to refresh or prefetch based on your business requirements.
      * - You can submit a maximum of 20 refresh or prefetch tasks at a time.
      * ### QPS limits
      * You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limits on API operations in ApsaraVideo VoD](~~342790~~).
      *
     */
    CompletableFuture<RefreshMediaPlayUrlsResponse> refreshMediaPlayUrls(RefreshMediaPlayUrlsRequest request);

    /**
      * If you want to overwrite a video or audio source file, you can obtain the upload URL of the source file by calling this operation. Then, you can upload a new source file without changing the video or audio ID. However, the file overwriting may automatically trigger transcoding and snapshot jobs if these jobs are configured. For more information, see [Upload URLs and credentials](~~55397~~).
      *
     */
    CompletableFuture<RefreshUploadVideoResponse> refreshUploadVideo(RefreshUploadVideoRequest request);

    /**
      * *   This operation is available only in the **China (Shanghai)** region.
      * *   You can submit a maximum of 2,000 requests to refresh resources based on URLs and 100 requests to refresh resources based on directories each day by using an Alibaba Cloud account.
      * *   You can call the [RefreshVodObjectCaches](~~69215~~) operation to refresh content and the [PreloadVodObjectCaches](~~69211~~) operation to prefetch content.
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

    /**
      * You can call this operation to restore only Archive and Cold Archive audio and video files. You can access the audio and video files after the files are restored. You cannot change the storage class of an audio or video file that is being restored. You are charged for the retrieval traffic generated during restoration. After a Cold Archive audio or video file is restored, a Standard replica of the file is generated for access. You are charged for the storage of the replica before the file returns to the frozen state.
      *
     */
    CompletableFuture<RestoreMediaResponse> restoreMedia(RestoreMediaRequest request);

    CompletableFuture<SearchEditingProjectResponse> searchEditingProject(SearchEditingProjectRequest request);

    /**
      * The maximum number of data records that you can query is limited based on the method used to query the data. You can use the following methods to query data:
      * *   Method 1: You must use the PageNo and PageSize parameters for the first 5,000 data records that meet the specified filter criteria. This allows you to traverse data page by page. If the number of data records that meet the specified filter criteria exceeds 5,000, use Method 2.
      * *   Method 2: This method applies only to the data of video and audio files. To traverse all the data records that meet the specified filter criteria, you must set the PageNo, PageSize, and ScrollToken parameters to traverse data page by page. The total number of data records from the current page to the desired page cannot exceed 1,200. Assume that the PageSize parameter is set to **20**:
      *     *   When the PageNo parameter is set to **1**, you can scroll forward to traverse data records from page 1 to page **60** at most.
      *     *   When the PageNo parameter is set to **2**, you can scroll forward to traverse data records from page 2 to page **61** at most.
      *     *   When the PageNo parameter is set to **61**, you can scroll backward to traverse data records from page 61 to page **2** at most or scroll forward to traverse data records from page 61 to page **120** at most.
      *
     */
    CompletableFuture<SearchMediaResponse> searchMedia(SearchMediaRequest request);

    /**
      * > You can play videos in the Checking or Blocked state only from the IP addresses that are added to review security groups.
      *
     */
    CompletableFuture<SetAuditSecurityIpResponse> setAuditSecurityIp(SetAuditSecurityIpRequest request);

    /**
      * > After you use the cross-domain policy file to update the resources on the origin server, you must refresh the resources that are cached on Alibaba Cloud CDN nodes. You can use the ApsaraVideo VOD console to refresh resources. For more information, see [Refresh and prefetch](~~86098~~). Alternatively, you can call the [RefreshVodObjectCaches](~~69215~~) operation to refresh resources.
      *
     */
    CompletableFuture<SetCrossdomainContentResponse> setCrossdomainContent(SetCrossdomainContentRequest request);

    /**
      * *   Regions that support this operation: **China (Beijing)**, **China (Shanghai)**, and **Singapore**.
      * *   Before you can call this operation to specify an AI template as the default template, you must obtain the ID of the AI template. You cannot delete an AI template that is set as the default template.
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
      * *   Regions that support this operation: **China (Beijing)** and **China (Shanghai)**.
      * *   After you call this operation, you can call the [GetAIImageJobs](~~186923~~) operation to query the job execution result.
      *
     */
    CompletableFuture<SubmitAIImageJobResponse> submitAIImageJob(SubmitAIImageJobRequest request);

    /**
      * *   Regions that support the video fingerprinting feature: **China (Beijing)**, **China (Shanghai)**, and **Singapore**. Regions that support the smart tagging feature: **China (Beijing)** and **China (Shanghai)**.
      * *   You need to enable the video fingerprinting feature or the smart tagging feature before you can call this operation to submit jobs. For more information, see [Video AI](~~101148~~).
      * *   If this is the first time you use the video fingerprinting feature, you must [submit a ticket](https://yida.alibaba-inc.com/o/ticketapply) to apply for using the media fingerprint library for free. Otherwise, the video fingerprinting feature will be affected.
      * *   After you submit an AI job, ApsaraVideo VOD asynchronously processes the job. The operation may return a response before the job is complete. You can configure the [Event Notification](~~55627~~) feature and set the callback event to **AI Processing Completed**. After you receive the event notification, you can query the execution result of the AI job.
      *
     */
    CompletableFuture<SubmitAIJobResponse> submitAIJob(SubmitAIJobRequest request);

    CompletableFuture<SubmitAIMediaAuditJobResponse> submitAIMediaAuditJob(SubmitAIMediaAuditJobRequest request);

    CompletableFuture<SubmitDigitalWatermarkExtractJobResponse> submitDigitalWatermarkExtractJob(SubmitDigitalWatermarkExtractJobRequest request);

    /**
      * *   You can capture a part of a video and generate animated images only when the video is in the **Uploaded**, **Transcoding**, **Normal**, **Reviewing**, or **Flagged** state.
      * *   The fees for frame animation are included in your video transcoding bill. You are charged based on the output resolution and the duration. For more information, see [Billing of basic services](~~188308~~).
      * ### QPS limits
      * You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see [QPS limit on API operations](~~342790~~).
      *
     */
    CompletableFuture<SubmitDynamicImageJobResponse> submitDynamicImageJob(SubmitDynamicImageJobRequest request);

    /**
      * Regions that support this operation: **China (Beijing)**, **China (Shanghai)**, and **Singapore**.
      *
     */
    CompletableFuture<SubmitMediaDNADeleteJobResponse> submitMediaDNADeleteJob(SubmitMediaDNADeleteJobRequest request);

    /**
      * *   During video preprocessing, videos are transcoded to meet the playback requirements of the production studio. Therefore, you are **charged** for video preprocessing. You can submit a ticket for information about the **production studio** service.
      *  *   You can obtain the preprocessing result in the [TranscodeComplete](~~55638~~) event notification. If the value of the **Preprocess** parameter is true in the event notification, the video is preprocessed.
      *
     */
    CompletableFuture<SubmitPreprocessJobsResponse> submitPreprocessJobs(SubmitPreprocessJobsRequest request);

    /**
      * > *   Only snapshots in the JPG format are generated.
      * > *   After a snapshot job is complete, ApsaraVideo VOD sends a [SnapshotComplete](~~57337~~) event notification that contains EventType=SnapshotComplete and SubType=SpecifiedTime.
      *
     */
    CompletableFuture<SubmitSnapshotJobResponse> submitSnapshotJob(SubmitSnapshotJobRequest request);

    /**
      * *   You can transcode a video only in the UploadSucc, Normal, or Checking state.
      *  *   You can obtain the transcoding result in the [StreamTranscodeComplete](~~55636~~) or [TranscodeComplete](~~55638~~) event notification.
      *  *   If you initiate an HTTP Live Streaming (HLS) packaging task, you can call this operation to dynamically override the subtitle. If the packaging task does not contain subtitles, we recommend that you do not call this operation to initiate the packaging task. Instead, you can specify the ID of the specific template group when you upload the video. The packaging process is automatically initiated.
      *
     */
    CompletableFuture<SubmitTranscodeJobsResponse> submitTranscodeJobs(SubmitTranscodeJobsRequest request);

    CompletableFuture<SubmitWorkflowJobResponse> submitWorkflowJob(SubmitWorkflowJobRequest request);

    /**
      * *   Regions that support this operation: **China (Beijing)**, **China (Shanghai)**, and **Singapore**.
      * *   After you call the [AddAITemplate](~~102930~~) operation to add an AI template, you can call this operation to modify the AI template.
      *
     */
    CompletableFuture<UpdateAITemplateResponse> updateAITemplate(UpdateAITemplateRequest request);

    /**
      * ## QPS limit
      * A single user can perform a maximum of 30 queries per second (QPS). Throttling is triggered when the number of calls per second exceeds the QPS limit. The throttling may affect your business. Thus, we recommend that you observe the QPS limit on this operation.
      *
     */
    CompletableFuture<UpdateAppInfoResponse> updateAppInfo(UpdateAppInfoRequest request);

    /**
      * The specific parameter of an auxiliary media asset is updated only when a new value is passed in the parameter.
      *
     */
    CompletableFuture<UpdateAttachedMediaInfosResponse> updateAttachedMediaInfos(UpdateAttachedMediaInfosRequest request);

    CompletableFuture<UpdateCategoryResponse> updateCategory(UpdateCategoryRequest request);

    CompletableFuture<UpdateEditingProjectResponse> updateEditingProject(UpdateEditingProjectRequest request);

    CompletableFuture<UpdateImageInfosResponse> updateImageInfos(UpdateImageInfosRequest request);

    /**
      * UpdateMediaStorageClass is an asynchronous operation. You can call this operation to modify the storage classes of media assets. After the storage class is modified, a callback notification is sent.
      * If the storage class of a media asset is Archive or Cold Archive, the media asset is automatically restored when you call this operation. After the media asset is restored, the storage class is modified. To restore the media asset, you do not need to call the RestoreMedia operation. To modify the storage class of a Cold Archive media asset, you must specify the restoration priority. By default, the restoration priority is set to Standard.
      * Media assets whose storage classes are being modified cannot be used or processed.
      * The media assets that are not of the Standard storage class have a limit on storage duration. If the storage duration does not meet the following requirements, you cannot change the storage classes: Infrequent Access (IA) media assets or source files are stored for at least 30 days, Archive media assets or source files are stored for at least 60 days, and Cold Archive media assets or source files are stored for at least 180 days.
      *
     */
    CompletableFuture<UpdateMediaStorageClassResponse> updateMediaStorageClass(UpdateMediaStorageClassRequest request);

    /**
      * > *   You cannot add, modify, or remove transcoding templates in a transcoding template group that is locked in the ApsaraVideo VOD console. To manage such transcoding template groups, contact the ApsaraVideo VOD technical support.
      * > *   You can call the GetTranscodeTemplateGroup operation to query the configurations of a transcoding template group and check whether the transcoding template group is locked by using the response parameter Locked.
      *
     */
    CompletableFuture<UpdateTranscodeTemplateGroupResponse> updateTranscodeTemplateGroup(UpdateTranscodeTemplateGroupRequest request);

    /**
      * The specific parameter of a video is updated only when a new value is passed in the parameter.
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
      * *   You can call this operation to upload media files that are not stored on a local server or device and must be uploaded based on URLs over the Internet.
      * *   The URL-based upload jobs are asynchronous. After you submit a URL-based upload job by calling this operation, it may take hours, even days to complete. If you require high timeliness, we recommend that you use the upload SDK.
      * *   If you configure callbacks, you can receive an [UploadByURLComplete](~~86326~~) event notification after the media file is uploaded. You can query the upload status by calling the [GetURLUploadInfos](~~106830~~) operation.
      * *   After you submit an upload job, the job is asynchronously processed on the cloud. All URL-based upload jobs that are submitted in each region are queued. The waiting time for the upload job depends on the number of queued jobs. After the upload job is complete, you can associate the playback URL included in the callback with the media ID.
      * *   You can call this operation only in the **China (Shanghai)** and **Singapore** regions.
      * *   Every time you submit a URL-based upload job, a new media ID is generated in ApsaraVideo VOD.
      *
     */
    CompletableFuture<UploadMediaByURLResponse> uploadMediaByURL(UploadMediaByURLRequest request);

    /**
      * You can call this operation to upload transcoded streams to ApsaraVideo VOD from external storage. The following HDR types of transcoded streams are supported: HDR, HDR 10, HLG, Dolby Vision, HDR Vivid, and SDR+. You can call the [GetURLUploadInfos](~~106830~~) operation to query the upload status. After the upload is complete, the callback of the UploadByURLComplete event is returned.
      * >  This operation is available only in the Singapore (Singapore) region.
      *
     */
    CompletableFuture<UploadStreamByURLResponse> uploadStreamByURL(UploadStreamByURLRequest request);

    CompletableFuture<VerifyVodDomainOwnerResponse> verifyVodDomainOwner(VerifyVodDomainOwnerRequest request);

}
