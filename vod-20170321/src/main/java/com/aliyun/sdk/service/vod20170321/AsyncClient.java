// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.vod20170321.models.*;
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
     * <p>  Regions that support this operation: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</p>
     * <ul>
     * <li>Before you add an AI template for automated review and smart thumbnail tasks, make sure that <a href="https://ai.aliyun.com/vi/censor">automated review</a> and <a href="https://ai.aliyun.com/vi/cover">smart thumbnail</a> are enabled.</li>
     * </ul>
     * 
     * @param request the request parameters of AddAITemplate  AddAITemplateRequest
     * @return AddAITemplateResponse
     */
    CompletableFuture<AddAITemplateResponse> addAITemplate(AddAITemplateRequest request);

    /**
     * <b>description</b> :
     * <p>  You can create a maximum of 3 levels of categories for audio, video, and image files and 2 levels of categories for short video materials. Each category level can contain a maximum of 100 subcategories. To create categories for audio and video files, set <code>Type</code> to <code>default</code>. To create categories for short video materials, set <code>Type</code> to <code>material</code>.</p>
     * <ul>
     * <li>After you create a category, you can categorize media resources during upload or categorize the uploaded media resources. For more information, see <a href="https://help.aliyun.com/document_detail/86070.html">Manage video categories</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of AddCategory  AddCategoryRequest
     * @return AddCategoryResponse
     */
    CompletableFuture<AddCategoryResponse> addCategory(AddCategoryRequest request);

    /**
     * <b>description</b> :
     * <p>  For more information about the online editing feature, see <a href="https://help.aliyun.com/document_detail/95482.html">Overview</a>.</p>
     * 
     * @param request the request parameters of AddEditingProject  AddEditingProjectRequest
     * @return AddEditingProjectResponse
     */
    CompletableFuture<AddEditingProjectResponse> addEditingProject(AddEditingProjectRequest request);

    /**
     * @param request the request parameters of AddEditingProjectMaterials  AddEditingProjectMaterialsRequest
     * @return AddEditingProjectMaterialsResponse
     */
    CompletableFuture<AddEditingProjectMaterialsResponse> addEditingProjectMaterials(AddEditingProjectMaterialsRequest request);

    /**
     * <b>description</b> :
     * <p>  You cannot perform custom operations on transcoding template groups that are <strong>locked</strong> in the ApsaraVideo VOD console. You can call the <a href="~~GetTranscodeTemplateGroup~~">GetTranscodeTemplateGroup</a> operation to query the information about a transcoding template group and check whether the transcoding template group is locked based on the value of the Locked parameter. You can call the <a href="~~UpdateTranscodeTemplateGroup~~">UpdateTranscodeTemplateGroup</a> operation to unlock a transcoding template group if it is locked. Then, you can perform custom operations on the transcoding template group.</p>
     * <ul>
     * <li>An Object Storage Service (OSS) bucket is required to store files that are used for transcoding. You cannot create a transcoding template group if no bucket is available. To activate a bucket, perform the following operations: Log on to the ApsaraVideo VOD console. In the left-side navigation pane, choose <strong>Configuration Management &gt; Media Management &gt; Storage</strong>. On the <strong>Storage</strong> page, activate the bucket that is allocated by ApsaraVideo VOD.</li>
     * <li>You cannot add transcoding templates to the <strong>No Transcoding</strong> template group.</li>
     * <li>You can create a maximum of 20 transcoding template groups.</li>
     * <li>You can add a maximum of 20 transcoding templates to a transcoding template group.</li>
     * <li>If you want to generate a URL for adaptive bitrate streaming, you can add video packaging templates to a transcoding template group. You can add a maximum of 10 video packaging templates to a transcoding template group. If you add more than 10 video packaging templates, URLs of the video transcoded based on the video packaging templates are generated but the URL for adaptive bitrate streaming is not generated.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to five times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of AddTranscodeTemplateGroup  AddTranscodeTemplateGroupRequest
     * @return AddTranscodeTemplateGroupResponse
     */
    CompletableFuture<AddTranscodeTemplateGroupResponse> addTranscodeTemplateGroup(AddTranscodeTemplateGroupRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>Before you add a domain name to accelerate, you must activate ApsaraVideo VOD and apply for an Internet content provider (ICP) filing for the domain name. For more information about how to activate ApsaraVideo VOD, see <a href="https://help.aliyun.com/document_detail/51512.html">Activate ApsaraVideo VOD</a>.</li>
     * <li>If the content on the origin server is not stored on Alibaba Cloud, the content must be reviewed by Alibaba Cloud. The review will be complete by the end of the next business day after you submit an application.</li>
     * <li>You can add only one domain name to accelerate in a request. You can add a maximum of 20 accelerated domain names within an Alibaba Cloud account.</li>
     * </ul>
     * 
     * @param request the request parameters of AddVodDomain  AddVodDomainRequest
     * @return AddVodDomainResponse
     */
    CompletableFuture<AddVodDomainResponse> addVodDomain(AddVodDomainRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to add a buckets to an ApsaraVideo VOD applications.</p>
     * <blockquote>
     * <p>You can add only one ApsaraVideo VOD bucket for each application. If you specify an AppId that does not exist or the ID of an application for which an VOD bucket is enabled, an error is returned.</p>
     * </blockquote>
     * 
     * @param request the request parameters of AddVodStorageForApp  AddVodStorageForAppRequest
     * @return AddVodStorageForAppResponse
     */
    CompletableFuture<AddVodStorageForAppResponse> addVodStorageForApp(AddVodStorageForAppRequest request);

    /**
     * <b>description</b> :
     * <p>  After you add a snapshot template, you can call the <a href="https://help.aliyun.com/document_detail/72213.html">SubmitSnapshotJob</a> operation and specify the template ID to submit a snapshot job.</p>
     * <ul>
     * <li>You can use the HTTP (HTTPS compatible) callback or MNS callback method to receive the <a href="https://help.aliyun.com/document_detail/57337.html">SnapshotComplete</a> callback. For more information, see <a href="https://help.aliyun.com/document_detail/55627.html">Overview</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of AddVodTemplate  AddVodTemplateRequest
     * @return AddVodTemplateResponse
     */
    CompletableFuture<AddVodTemplateResponse> addVodTemplate(AddVodTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation to create an <code>Image</code> watermark template or a <code>Text</code> watermark template. You can use static images in the PNG format or dynamic images in the GIF, APNG, and MOV formats as image watermarks.</p>
     * <ul>
     * <li>After you call this operation to create a watermark template, you must call the <a href="~~AddTranscodeTemplateGroup~~">AddTranscodeTemplateGroup</a> or <a href="~~UpdateTranscodeTemplateGroup~~">UpdateTranscodeTemplateGroup</a> operation to associate the watermark template with a transcoding template group. This way, you can add watermarks to videos during transcoding.</li>
     * <li>For more information, see <a href="https://help.aliyun.com/document_detail/99369.html">Video watermarks</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of AddWatermark  AddWatermarkRequest
     * @return AddWatermarkResponse
     */
    CompletableFuture<AddWatermarkResponse> addWatermark(AddWatermarkRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can grant a RAM user or RAM role permissions to access up to 10 applications.</p>
     * </blockquote>
     * 
     * @param request the request parameters of AttachAppPolicyToIdentity  AttachAppPolicyToIdentityRequest
     * @return AttachAppPolicyToIdentityResponse
     */
    CompletableFuture<AttachAppPolicyToIdentityResponse> attachAppPolicyToIdentity(AttachAppPolicyToIdentityRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * </blockquote>
     * 
     * @param request the request parameters of BatchSetVodDomainConfigs  BatchSetVodDomainConfigsRequest
     * @return BatchSetVodDomainConfigsResponse
     */
    CompletableFuture<BatchSetVodDomainConfigsResponse> batchSetVodDomainConfigs(BatchSetVodDomainConfigsRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>If the domain name that you want to enable is invalid or your Alibaba Cloud account has overdue payments, you cannot call this operation to enable the domain name.</li>
     * </ul>
     * 
     * @param request the request parameters of BatchStartVodDomain  BatchStartVodDomainRequest
     * @return BatchStartVodDomainResponse
     */
    CompletableFuture<BatchStartVodDomainResponse> batchStartVodDomain(BatchStartVodDomainRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>After you disable an accelerated domain name, the information about the domain name is retained. The system automatically reroutes all the requests that are destined for the domain name to the origin server.</li>
     * </ul>
     * 
     * @param request the request parameters of BatchStopVodDomain  BatchStopVodDomainRequest
     * @return BatchStopVodDomainResponse
     */
    CompletableFuture<BatchStopVodDomainResponse> batchStopVodDomain(BatchStopVodDomainRequest request);

    /**
     * <b>description</b> :
     * <p>  You can cancel only URL-based upload jobs in the <strong>Pending</strong> state. You can query the status of a URL-based upload job by calling the <a href="https://help.aliyun.com/document_detail/106830.html">GetURLUploadInfos</a> operation.</p>
     * <ul>
     * <li>You cannot cancel an upload job that already starts.</li>
     * <li>You must specify either JobIds or UploadUrls. If you specify both parameters, only JobIds takes effect.</li>
     * </ul>
     * 
     * @param request the request parameters of CancelUrlUploadJobs  CancelUrlUploadJobsRequest
     * @return CancelUrlUploadJobsResponse
     */
    CompletableFuture<CancelUrlUploadJobsResponse> cancelUrlUploadJobs(CancelUrlUploadJobsRequest request);

    /**
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>You can create up to 10 applications within an Alibaba Cloud account. For more information, see <a href="https://help.aliyun.com/document_detail/113600.html">Multi-application service</a>.</p>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limits on API operations in ApsaraVideo VOD</a>.</p>
     * 
     * @param request the request parameters of CreateAppInfo  CreateAppInfoRequest
     * @return CreateAppInfoResponse
     */
    CompletableFuture<CreateAppInfoResponse> createAppInfo(CreateAppInfoRequest request);

    /**
     * @param request the request parameters of CreateAudit  CreateAuditRequest
     * @return CreateAuditResponse
     */
    CompletableFuture<CreateAuditResponse> createAudit(CreateAuditRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>Make sure that you understand the billing method and prices of ApsaraVideo VOD before you call this operation. You are charged storage fees after you upload media files to ApsaraVideo VOD. For more information, see <a href="~~188308#section_e97_xrp_mzz~~">Billing of media asset storage</a>. If you have activated the acceleration service, you are charged acceleration fees when you upload media files to ApsaraVideo VOD. For more information, see <a href="~~188310#section_sta_zm2_tsv~~">Billing of acceleration traffic</a>.</strong></p>
     * <ul>
     * <li>You can call this operation only to obtain the upload URLs and credentials for media files and create media assets in ApsaraVideo VOD. You cannot call this operation to upload media files. For more information about how to upload media files by calling API operations, see <a href="https://help.aliyun.com/document_detail/476208.html">Upload media files by calling API operations</a>.</li>
     * <li>If the upload credential expires after 3,000 seconds, you can call the CreateUploadAttachedMedia operation again to obtain a new upload URL and a new upload credential.</li>
     * <li>You can configure a callback to receive an <a href="https://help.aliyun.com/document_detail/103250.html">AttachedMediaUploadComplete</a> event notification to determine whether the upload is successful.</li>
     * <li>You must obtain a URL and a credential before you upload a media file to ApsaraVideo VOD. ApsaraVideo VOD supports multiple upload methods. Each method has different requirements on upload URLs and credentials. For more information, see <a href="https://help.aliyun.com/document_detail/55397.html">Upload URLs and credentials</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateUploadAttachedMedia  CreateUploadAttachedMediaRequest
     * @return CreateUploadAttachedMediaResponse
     */
    CompletableFuture<CreateUploadAttachedMediaResponse> createUploadAttachedMedia(CreateUploadAttachedMediaRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>Make sure that you understand the billing method and price of ApsaraVideo VOD before you call this operation. You are charged storage fees after you upload media files to ApsaraVideo VOD. For more information, see <a href="~~188308#section_e97_xrp_mzz~~">Billing of media asset storage</a>. If you have activated the acceleration service, you are charged acceleration fees when you upload media files to ApsaraVideo VOD. For more information, see <a href="~~188310#section_sta_zm2_tsv~~">Billing of acceleration traffic</a>.</strong></p>
     * <ul>
     * <li>You must obtain a URL and a credential before you upload an image to ApsaraVideo VOD. ApsaraVideo VOD provides multiple upload methods. You can upload files by using server upload SDKs, client upload SDKs, URLs, Object Storage Service (OSS) API, or OSS SDKs. Each upload method has different requirements for obtaining upload URLs and credentials. For more information, see the &quot;Usage notes&quot; section of the <a href="https://help.aliyun.com/document_detail/55397.html">Upload URLs and credentials</a> topic.</li>
     * <li>You cannot refresh the upload URL or credential when you upload images. If the image upload credential expires, you can call this operation to obtain a new upload URL and credential. By default, the validity period of an image upload credential is 3,000 seconds.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/98467.html">CreateUploadAttachedMedia</a> operation to upload image watermarks.</li>
     * <li>You can configure a callback for <a href="https://help.aliyun.com/document_detail/91968.html">ImageUploadComplete</a> to receive notifications about the image upload status.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateUploadImage  CreateUploadImageRequest
     * @return CreateUploadImageResponse
     */
    CompletableFuture<CreateUploadImageResponse> createUploadImage(CreateUploadImageRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>Make sure that you understand the billing method and prices of ApsaraVideo VOD before you call this operation. You are charged storage fees after you upload media files to ApsaraVideo VOD. For more information, see <a href="~~188308#section_e97_xrp_mzz~~">Billing of media asset storage</a>. If you have activated the acceleration service, you are charged acceleration fees when you upload media files to ApsaraVideo VOD. For more information, see <a href="~~188310#section_sta_zm2_tsv~~">Billing of acceleration traffic</a>.</strong></p>
     * <ul>
     * <li>You can call this operation to obtain upload URLs and credentials for video and audio files. For more information, see <a href="https://help.aliyun.com/document_detail/55397.html">Upload URLs and credentials</a>.</li>
     * <li>You can call this operation only to obtain the upload URLs and credentials for media files and create media assets in ApsaraVideo VOD. You cannot call this operation to upload media files. For more information about how to upload media files by calling API operations, see <a href="https://help.aliyun.com/document_detail/476208.html">Upload media files by calling API operations</a>.</li>
     * <li>If the upload credential expires, call the <a href="~~RefreshUploadVideo~~">RefreshUploadVideo</a> operation to obtain a new upload credential. The default validity period of an upload credential is 3,000 seconds.</li>
     * <li>You can configure a callback to receive an event notification when an audio or video file is uploaded. Alternatively, after you upload an audio or video file, you can call the <a href="https://help.aliyun.com/document_detail/59624.html">GetMezzanineInfo</a> operation to determine whether the upload is successful. For more information, see <a href="https://help.aliyun.com/document_detail/55396.html">Overview</a>.</li>
     * <li>The value of the VideoId parameter that is returned after you call this operation can be used for media processing or the lifecycle management of media assets.</li>
     * <li>You must obtain a URL and a credential before you upload a media file to ApsaraVideo VOD. ApsaraVideo VOD supports multiple upload methods. Each method has different requirements on upload URLs and credentials. For more information, see <a href="https://help.aliyun.com/document_detail/55397.html">Upload URLs and credentials</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateUploadVideo  CreateUploadVideoRequest
     * @return CreateUploadVideoResponse
     */
    CompletableFuture<CreateUploadVideoResponse> createUploadVideo(CreateUploadVideoRequest request);

    /**
     * @param request the request parameters of DecryptKMSDataKey  DecryptKMSDataKeyRequest
     * @return DecryptKMSDataKeyResponse
     */
    CompletableFuture<DecryptKMSDataKeyResponse> decryptKMSDataKey(DecryptKMSDataKeyRequest request);

    /**
     * <b>description</b> :
     * <p>  Regions that support this operation: <strong>China (Beijing)</strong> and <strong>China (Shanghai)</strong>.</p>
     * <ul>
     * <li>This operation deletes only information about images that are submitted for AI processing. The image files are not deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteAIImageInfos  DeleteAIImageInfosRequest
     * @return DeleteAIImageInfosResponse
     */
    CompletableFuture<DeleteAIImageInfosResponse> deleteAIImageInfos(DeleteAIImageInfosRequest request);

    /**
     * <b>description</b> :
     * <p>  Regions that support this operation: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</p>
     * <ul>
     * <li>You cannot delete an AI template that is set as the default template.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteAITemplate  DeleteAITemplateRequest
     * @return DeleteAITemplateResponse
     */
    CompletableFuture<DeleteAITemplateResponse> deleteAITemplate(DeleteAITemplateRequest request);

    /**
     * <b>description</b> :
     * <p>Application with resources can not be deleted.</p>
     * 
     * @param request the request parameters of DeleteAppInfo  DeleteAppInfoRequest
     * @return DeleteAppInfoResponse
     */
    CompletableFuture<DeleteAppInfoResponse> deleteAppInfo(DeleteAppInfoRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>This operation physically deletes auxiliary media assets. You cannot recover the auxiliary media assets that you deleted. Exercise caution when you call this operation.</strong></p>
     * <ul>
     * <li>You can delete a maximum of 20 auxiliary media assets in one request.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteAttachedMedia  DeleteAttachedMediaRequest
     * @return DeleteAttachedMediaResponse
     */
    CompletableFuture<DeleteAttachedMediaResponse> deleteAttachedMedia(DeleteAttachedMediaRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>After you call this operation to delete a category, all subcategories including level 2 and level 3 categories are deleted at the same time. Exercise caution when you call this operation.</strong></p>
     * <ul>
     * <li>If you have classified specific media resources to a category, the category names labeled on these media resources are automatically deleted when you delete the category.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteCategory  DeleteCategoryRequest
     * @return DeleteCategoryResponse
     */
    CompletableFuture<DeleteCategoryResponse> deleteCategory(DeleteCategoryRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation deletes only the information about animated stickers, but not the animated stickers themselves.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteDynamicImage  DeleteDynamicImageRequest
     * @return DeleteDynamicImageResponse
     */
    CompletableFuture<DeleteDynamicImageResponse> deleteDynamicImage(DeleteDynamicImageRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation to delete multiple online editing projects at a time.</p>
     * 
     * @param request the request parameters of DeleteEditingProject  DeleteEditingProjectRequest
     * @return DeleteEditingProjectResponse
     */
    CompletableFuture<DeleteEditingProjectResponse> deleteEditingProject(DeleteEditingProjectRequest request);

    /**
     * @param request the request parameters of DeleteEditingProjectMaterials  DeleteEditingProjectMaterialsRequest
     * @return DeleteEditingProjectMaterialsResponse
     */
    CompletableFuture<DeleteEditingProjectMaterialsResponse> deleteEditingProjectMaterials(DeleteEditingProjectMaterialsRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>After you call this operation to delete an image, the source file is permanently deleted and cannot be recovered. Exercise caution when you call this operation.</strong></p>
     * <ul>
     * <li>If some images are cached on Alibaba Cloud CDN points of presence (POPs), the image URLs do not immediately become invalid.</li>
     * <li>You can call this operation to delete uploaded images and video snapshots.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteImage  DeleteImageRequest
     * @return DeleteImageResponse
     */
    CompletableFuture<DeleteImageResponse> deleteImage(DeleteImageRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/55627.html">Overview</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteMessageCallback  DeleteMessageCallbackRequest
     * @return DeleteMessageCallbackResponse
     */
    CompletableFuture<DeleteMessageCallbackResponse> deleteMessageCallback(DeleteMessageCallbackRequest request);

    /**
     * <b>description</b> :
     * <p>All media processing operations in ApsaraVideo VOD, such as transcoding, snapshot capture, and content moderation, are performed based on source files. If you delete the source files, you cannot perform media processing operations. Exercise caution when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteMezzanines  DeleteMezzaninesRequest
     * @return DeleteMezzaninesResponse
     */
    CompletableFuture<DeleteMezzaninesResponse> deleteMezzanines(DeleteMezzaninesRequest request);

    /**
     * <b>description</b> :
     * <p>  During multipart upload, useless parts may be retained if the upload fails. These useless parts are automatically deleted after 7 days. You can call this operation to delete the generated parts after the upload is successful or fails.</p>
     * <ul>
     * <li>This operation does not delete the source file or transcoded file, but deletes only the parts generated during the upload.</li>
     * <li>If you call the <a href="https://help.aliyun.com/document_detail/52837.html">DeleteVideo</a> operation, the entire video file is deleted, including the generated parts.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteMultipartUpload  DeleteMultipartUploadRequest
     * @return DeleteMultipartUploadResponse
     */
    CompletableFuture<DeleteMultipartUploadResponse> deleteMultipartUpload(DeleteMultipartUploadRequest request);

    /**
     * @param request the request parameters of DeleteStream  DeleteStreamRequest
     * @return DeleteStreamResponse
     */
    CompletableFuture<DeleteStreamResponse> deleteStream(DeleteStreamRequest request);

    /**
     * <b>description</b> :
     * <p>  You cannot call this operation to delete the default transcoding template. You can delete the transcoding template when it is no longer specified as the default one.</p>
     * <ul>
     * <li>For security purposes, you cannot add, modify, or delete transcoding templates in a transcoding template group that is locked. To check whether a transcoding template group is locked, call the <a href="~~GetTranscodeTemplateGroup~~">GetTranscodeTemplateGroup</a> operation and obtain the Locked parameter from the response. To modify transcoding templates within a locked transcoding template group, you must call the <a href="~~UpdateTranscodeTemplateGroup~~">UpdateTranscodeTemplateGroup</a> operation to unlock the transcoding template group first.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteTranscodeTemplateGroup  DeleteTranscodeTemplateGroupRequest
     * @return DeleteTranscodeTemplateGroupResponse
     */
    CompletableFuture<DeleteTranscodeTemplateGroupResponse> deleteTranscodeTemplateGroup(DeleteTranscodeTemplateGroupRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation physically deletes videos. Deleted videos cannot be recovered. Exercise caution when you call this operation.</p>
     * <ul>
     * <li>You can call this operation to delete multiple videos at a time.</li>
     * <li>When you delete a video, its source file, transcoded stream file, and thumbnail screenshot are also deleted. However, the Alibaba Cloud Content Delivery Network (CDN) cache is not refreshed simultaneously. You can use the refresh feature in the ApsaraVideo VOD console to clear garbage data on CDN nodes. For more information, see <a href="https://help.aliyun.com/document_detail/86098.html">Refresh and prefetch</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteVideo  DeleteVideoRequest
     * @return DeleteVideoResponse
     */
    CompletableFuture<DeleteVideoResponse> deleteVideo(DeleteVideoRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>This operation is available only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>After a domain name for CDN is removed from ApsaraVideo VOD, the domain name becomes unavailable. Proceed with caution. We recommend that you restore the A record at your DNS service provider before you remove the domain name for CDN.</li>
     * <li>After you call this operation to remove a domain name for CDN from ApsaraVideo VOD, all records that are related to the domain name are deleted. If you only want to disable a domain name for CDN, call the <a href="https://help.aliyun.com/document_detail/120208.html">BatchStopVodDomain</a> operation.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteVodDomain  DeleteVodDomainRequest
     * @return DeleteVodDomainResponse
     */
    CompletableFuture<DeleteVodDomainResponse> deleteVodDomain(DeleteVodDomainRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>This operation is available only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>After the configurations of a domain name for CDN are deleted, the domain name becomes unavailable. We recommend that you restore the A record at your DNS service provider before you delete the configurations of the domain name for CDN.</li>
     * <li>After you call this operation to remove a domain name for CDN from ApsaraVideo VOD, all records that are related to the domain name are deleted. If you only want to disable a domain name for CDN, call the <a href="https://help.aliyun.com/document_detail/120208.html">BatchStopVodDomain</a> operation.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteVodSpecificConfig  DeleteVodSpecificConfigRequest
     * @return DeleteVodSpecificConfigResponse
     */
    CompletableFuture<DeleteVodSpecificConfigResponse> deleteVodSpecificConfig(DeleteVodSpecificConfigRequest request);

    /**
     * @param request the request parameters of DeleteVodTemplate  DeleteVodTemplateRequest
     * @return DeleteVodTemplateResponse
     */
    CompletableFuture<DeleteVodTemplateResponse> deleteVodTemplate(DeleteVodTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>After you delete an image watermark template, the source watermark file is physically deleted and cannot be restored. Exercise caution when you call this operation.</strong></p>
     * <ul>
     * <li>You cannot delete the default watermark template. To delete a default watermark template, call the <a href="~~SetDefaultWatermark~~">SetDefaultWatermark</a> operation to set another watermark template as the default one.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteWatermark  DeleteWatermarkRequest
     * @return DeleteWatermarkResponse
     */
    CompletableFuture<DeleteWatermarkResponse> deleteWatermark(DeleteWatermarkRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can query playback statistics on top 1,000 videos at most on a specified day. By default, top videos are sorted in descending order based on video views.</li>
     * <li>You can call this operation to query only playback statistics collected on videos that are played by using ApsaraVideo Player SDKs.</li>
     * <li>Playback statistics for the previous day are generated at 09:00 on the current day, in UTC+8.</li>
     * <li>You can query data that is generated since January 1, 2018. The maximum time range to query is 180 days.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribePlayTopVideos  DescribePlayTopVideosRequest
     * @return DescribePlayTopVideosResponse
     */
    CompletableFuture<DescribePlayTopVideosResponse> describePlayTopVideos(DescribePlayTopVideosRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>This operation is available only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>You can call this operation to query only playback statistics collected on videos that are played by using ApsaraVideo Player SDKs.</li>
     * <li>Playback statistics for the previous day are generated at 09:00 on the current day, in UTC+8.</li>
     * <li>You can query data that is generated since January 1, 2018. The maximum time range to query is 180 days.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of DescribePlayUserAvg  DescribePlayUserAvgRequest
     * @return DescribePlayUserAvgResponse
     */
    CompletableFuture<DescribePlayUserAvgResponse> describePlayUserAvg(DescribePlayUserAvgRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can call this operation to query only playback statistics collected on videos that are played by using ApsaraVideo Player SDKs.</li>
     * <li>Playback statistics for the current day are generated at 09:00 (UTC+8) on the next day.</li>
     * <li>You can query data that is generated since January 1, 2018. The maximum time range to query is 180 days.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribePlayUserTotal  DescribePlayUserTotalRequest
     * @return DescribePlayUserTotalResponse
     */
    CompletableFuture<DescribePlayUserTotalResponse> describePlayUserTotal(DescribePlayUserTotalRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can call this operation to query only playback statistics collected on videos that are played by using ApsaraVideo Player SDKs.</li>
     * <li>Playback statistics for the current day are generated at 09:00 (UTC+8) on the next day.</li>
     * <li>You can query only data in the last 730 days. The maximum time range to query is 180 days.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribePlayVideoStatis  DescribePlayVideoStatisRequest
     * @return DescribePlayVideoStatisResponse
     */
    CompletableFuture<DescribePlayVideoStatisResponse> describePlayVideoStatis(DescribePlayVideoStatisRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>This operation is available only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>If the time range to query is less than or equal to seven days, the system returns the statistics collected on an hourly basis. If the time range to query is greater than seven days, the system returns the statistics collected on a daily basis. The maximum time range that you can specify to query is 31 days.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeVodAIData  DescribeVodAIDataRequest
     * @return DescribeVodAIDataResponse
     */
    CompletableFuture<DescribeVodAIDataResponse> describeVodAIData(DescribeVodAIDataRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeVodCertificateList  DescribeVodCertificateListRequest
     * @return DescribeVodCertificateListResponse
     */
    CompletableFuture<DescribeVodCertificateListResponse> describeVodCertificateList(DescribeVodCertificateListRequest request);

    /**
     * <b>description</b> :
     * <p>If you specify neither the StartTime parameter nor the EndTime parameter, the data in the last 24 hours is queried. Alternatively, you can specify both the StartTime and EndTime parameters to query data that is generated in the specified duration. You can query data for the last 90 days at most.</p>
     * 
     * @param request the request parameters of DescribeVodDomainBpsData  DescribeVodDomainBpsDataRequest
     * @return DescribeVodDomainBpsDataResponse
     */
    CompletableFuture<DescribeVodDomainBpsDataResponse> describeVodDomainBpsData(DescribeVodDomainBpsDataRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation up to 20 times per second per account. If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range. Time granularity
     * The time granularity supported by Interval, the maximum time period within which historical data is available, and the data delay vary based on the time range to query, as described in the following table.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>15 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>90 days</td>
     * <td>366 days</td>
     * <td>4 hours in most cases, not more than 24 hours</td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of DescribeVodDomainBpsDataByLayer  DescribeVodDomainBpsDataByLayerRequest
     * @return DescribeVodDomainBpsDataByLayerResponse
     */
    CompletableFuture<DescribeVodDomainBpsDataByLayerResponse> describeVodDomainBpsDataByLayer(DescribeVodDomainBpsDataByLayerRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * 
     * @param request the request parameters of DescribeVodDomainCertificateInfo  DescribeVodDomainCertificateInfoRequest
     * @return DescribeVodDomainCertificateInfoResponse
     */
    CompletableFuture<DescribeVodDomainCertificateInfoResponse> describeVodDomainCertificateInfo(DescribeVodDomainCertificateInfoRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeVodDomainConfigs  DescribeVodDomainConfigsRequest
     * @return DescribeVodDomainConfigsResponse
     */
    CompletableFuture<DescribeVodDomainConfigsResponse> describeVodDomainConfigs(DescribeVodDomainConfigsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeVodDomainDetail  DescribeVodDomainDetailRequest
     * @return DescribeVodDomainDetailResponse
     */
    CompletableFuture<DescribeVodDomainDetailResponse> describeVodDomainDetail(DescribeVodDomainDetailRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is supported only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can specify a maximum of 500 accelerated domain names.</li>
     * <li>If you specify neither <code>StartTime</code> nor <code>EndTime</code>, the data of the last 24 hours is queried. You can specify both <code>StartTime</code> and <code>EndTime</code> parameters to query data of a specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the <code>StartTime</code> and <code>EndTime</code> parameters. The following table describes the time period within which historical data is available and the data delay when you do not set <code>Interval</code>.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>Time range per query &#x3C; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time range per query &#x3C; 31 days</td>
     * <td>186 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>31 days ≤ Time span of a single query ≤ 366 days</td>
     * <td>366 days</td>
     * <td>4 hours in most cases, not more than 24 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodDomainHitRateData  DescribeVodDomainHitRateDataRequest
     * @return DescribeVodDomainHitRateDataResponse
     */
    CompletableFuture<DescribeVodDomainHitRateDataResponse> describeVodDomainHitRateData(DescribeVodDomainHitRateDataRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>For more information about the log format and latency, see <a href="https://help.aliyun.com/document_detail/86099.html">Download logs</a>.</li>
     * <li>If you specify neither the StartTime parameter nor the EndTime parameter, the log data in the last 24 hours is queried.</li>
     * <li>You can specify both the StartTime and EndTime parameters to query the log data that is generated in the specified time range.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodDomainLog  DescribeVodDomainLogRequest
     * @return DescribeVodDomainLogResponse
     */
    CompletableFuture<DescribeVodDomainLogResponse> describeVodDomainLog(DescribeVodDomainLogRequest request);

    /**
     * @param request the request parameters of DescribeVodDomainMax95BpsData  DescribeVodDomainMax95BpsDataRequest
     * @return DescribeVodDomainMax95BpsDataResponse
     */
    CompletableFuture<DescribeVodDomainMax95BpsDataResponse> describeVodDomainMax95BpsData(DescribeVodDomainMax95BpsDataRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is available only in the China (Shanghai) region.</p>
     * <ul>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>4 to 24 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * <hr>
     * 
     * @param request the request parameters of DescribeVodDomainQpsData  DescribeVodDomainQpsDataRequest
     * @return DescribeVodDomainQpsDataResponse
     */
    CompletableFuture<DescribeVodDomainQpsDataResponse> describeVodDomainQpsData(DescribeVodDomainQpsDataRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is supported only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can specify a maximum of 500 accelerated domain names.</li>
     * <li>If you specify neither <code>StartTime</code> nor <code>EndTime</code>, the data of the last 1 hour is queried. You can specify both <code>StartTime</code> and <code>EndTime</code> parameters to query data of a specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the <code>StartTime</code> and <code>EndTime</code> parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>Time range per query ≤ 1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>1 Hour &#x3C; Time range per query ≤ 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days &#x3C; Time range per query ≤ 31 days</td>
     * <td>186 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodDomainRealTimeBpsData  DescribeVodDomainRealTimeBpsDataRequest
     * @return DescribeVodDomainRealTimeBpsDataResponse
     */
    CompletableFuture<DescribeVodDomainRealTimeBpsDataResponse> describeVodDomainRealTimeBpsData(DescribeVodDomainRealTimeBpsDataRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is supported only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can specify a maximum of 100 accelerated domain names.</li>
     * <li>If you specify neither <code>StartTime</code> nor <code>EndTime</code>, the data of the last 1 hour is queried. You can specify both <code>StartTime</code> and <code>EndTime</code> parameters to query data of a specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the <code>StartTime</code> and <code>EndTime</code> parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>Time range per query ≤ 1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>1 Hour &#x3C; Time range per query ≤ 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days &#x3C; Time range per query ≤ 31 days</td>
     * <td>186 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodDomainRealTimeByteHitRateData  DescribeVodDomainRealTimeByteHitRateDataRequest
     * @return DescribeVodDomainRealTimeByteHitRateDataResponse
     */
    CompletableFuture<DescribeVodDomainRealTimeByteHitRateDataResponse> describeVodDomainRealTimeByteHitRateData(DescribeVodDomainRealTimeByteHitRateDataRequest request);

    /**
     * <b>description</b> :
     * <p>You can query data within the last seven days. Data is collected every minute. You can call this API operation up to 10 times per second per account.</p>
     * 
     * @param request the request parameters of DescribeVodDomainRealTimeDetailData  DescribeVodDomainRealTimeDetailDataRequest
     * @return DescribeVodDomainRealTimeDetailDataResponse
     */
    CompletableFuture<DescribeVodDomainRealTimeDetailDataResponse> describeVodDomainRealTimeDetailData(DescribeVodDomainRealTimeDetailDataRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is supported only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can specify a maximum of 100 accelerated domain names.</li>
     * <li>If you specify neither <code>StartTime</code> nor <code>EndTime</code>, the data of the last 1 hour is queried. You can specify both <code>StartTime</code> and <code>EndTime</code> parameters to query data of a specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the <code>StartTime</code> and <code>EndTime</code> parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Historical data available (days)</th>
     * <th>Data latency</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>Time range per query ≤ 1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>1 hour &#x3C; Time range per query &#x3C; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time range per query &#x3C; 31 days</td>
     * <td>186 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodDomainRealTimeHttpCodeData  DescribeVodDomainRealTimeHttpCodeDataRequest
     * @return DescribeVodDomainRealTimeHttpCodeDataResponse
     */
    CompletableFuture<DescribeVodDomainRealTimeHttpCodeDataResponse> describeVodDomainRealTimeHttpCodeData(DescribeVodDomainRealTimeHttpCodeDataRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is supported only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can specify a maximum of 500 accelerated domain names.</li>
     * <li>If you specify neither <code>StartTime</code> nor <code>EndTime</code>, the data of the last 1 hour is queried. You can specify both <code>StartTime</code> and <code>EndTime</code> parameters to query data of a specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the <code>StartTime</code> and <code>EndTime</code> parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>Time range per query ≤ 1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>1 Hour &#x3C; Time range per query ≤ 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days &#x3C; Time range per query ≤ 31 days</td>
     * <td>186 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodDomainRealTimeQpsData  DescribeVodDomainRealTimeQpsDataRequest
     * @return DescribeVodDomainRealTimeQpsDataResponse
     */
    CompletableFuture<DescribeVodDomainRealTimeQpsDataResponse> describeVodDomainRealTimeQpsData(DescribeVodDomainRealTimeQpsDataRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is supported only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can specify a maximum of 100 accelerated domain names.</li>
     * <li>If you specify neither <code>StartTime</code> nor <code>EndTime</code>, the data of the last 1 hour is queried. You can specify both <code>StartTime</code> and <code>EndTime</code> parameters to query data of a specified time range.</li>
     * <li>By default, the POST method is used for Go. To use the FET method, you must declare <code>request.Method=&quot;GET&quot;</code>.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the <code>StartTime</code> and <code>EndTime</code> parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>Time range per query ≤ 1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>1 hour &#x3C; Time range per query &#x3C; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time range per query &#x3C; 31 days</td>
     * <td>186 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodDomainRealTimeReqHitRateData  DescribeVodDomainRealTimeReqHitRateDataRequest
     * @return DescribeVodDomainRealTimeReqHitRateDataResponse
     */
    CompletableFuture<DescribeVodDomainRealTimeReqHitRateDataResponse> describeVodDomainRealTimeReqHitRateData(DescribeVodDomainRealTimeReqHitRateDataRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is supported only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can specify a maximum of 100 accelerated domain names.</li>
     * <li>If you specify neither <code>StartTime</code> nor <code>EndTime</code>, the data of the last 1 hour is queried. You can specify both <code>StartTime</code> and <code>EndTime</code> parameters to query data of a specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the <code>StartTime</code> and <code>EndTime</code> parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>Time range per query ≤ 1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>1 Hour &#x3C; Time range per query ≤ 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days &#x3C; Time range per query ≤ 31 days</td>
     * <td>186 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodDomainRealTimeTrafficData  DescribeVodDomainRealTimeTrafficDataRequest
     * @return DescribeVodDomainRealTimeTrafficDataResponse
     */
    CompletableFuture<DescribeVodDomainRealTimeTrafficDataResponse> describeVodDomainRealTimeTrafficData(DescribeVodDomainRealTimeTrafficDataRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is supported only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can specify a maximum of 500 accelerated domain names.</li>
     * <li>If you specify neither <code>StartTime</code> nor <code>EndTime</code>, the data of the last 24 hours is queried. You can specify both <code>StartTime</code> and <code>EndTime</code> parameters to query data of a specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the <code>StartTime</code> and <code>EndTime</code> parameters. The following table describes the time period within which historical data is available and the data delay when you do not set <code>Interval</code>.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>Time range per query &#x3C; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time range per query &#x3C; 31 days</td>
     * <td>186 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>31 days ≤ Time range per query ≤ 90 days</td>
     * <td>366 days</td>
     * <td>4 hours in most cases, not more than 24 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodDomainReqHitRateData  DescribeVodDomainReqHitRateDataRequest
     * @return DescribeVodDomainReqHitRateDataResponse
     */
    CompletableFuture<DescribeVodDomainReqHitRateDataResponse> describeVodDomainReqHitRateData(DescribeVodDomainReqHitRateDataRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is supported only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can specify a maximum of 500 accelerated domain names.</li>
     * <li>If you specify neither <code>StartTime</code> nor <code>EndTime</code>, the data of the last 24 hours is queried. You can specify both <code>StartTime</code> and <code>EndTime</code> parameters to query data of a specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the <code>StartTime</code> and <code>EndTime</code> parameters. The following table describes the time period within which historical data is available and the data delay when you do not set <code>Interval</code>.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>Time range per query &#x3C; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time range per query &#x3C; 31 days</td>
     * <td>186 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>31 days ≤ Time span of a single query ≤ 366 days</td>
     * <td>366 days</td>
     * <td>4 hours in most cases, not more than 24 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodDomainSrcBpsData  DescribeVodDomainSrcBpsDataRequest
     * @return DescribeVodDomainSrcBpsDataResponse
     */
    CompletableFuture<DescribeVodDomainSrcBpsDataResponse> describeVodDomainSrcBpsData(DescribeVodDomainSrcBpsDataRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>ApsaraVideo VOD stores the origin traffic data for 90 days before the data is deleted.</li>
     * <li>If you do not set the <code>StartTime</code> or <code>EndTime</code> parameter, the request returns the data collected in the last 24 hours. If you set both the <code>StartTime</code> and <code>EndTime</code> parameters, the request returns the data collected within the specified time range.</li>
     * <li>You can specify a maximum of 500 domain names in a request. Separate multiple domain names with commas (,). If you specify multiple domain names in a request, aggregation results are returned.</li>
     * </ul>
     * <h3>Time granularity</h3>
     * <p>The time granularity supported by the Interval parameter varies based on the time range per query specified by using <code>StartTime</code> and <code>EndTime</code>. The following table describes the time period within which historical data is available and the data delay.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query (days)</th>
     * <th>Historical data available (days)</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>(0, 3\]</td>
     * <td>93</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>(3, 31\]</td>
     * <td>186</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>(31, 366\]</td>
     * <td>366</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of DescribeVodDomainSrcTrafficData  DescribeVodDomainSrcTrafficDataRequest
     * @return DescribeVodDomainSrcTrafficDataResponse
     */
    CompletableFuture<DescribeVodDomainSrcTrafficDataResponse> describeVodDomainSrcTrafficData(DescribeVodDomainSrcTrafficDataRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is supported only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can specify a maximum of 500 accelerated domain names.</li>
     * <li>If you specify neither <code>StartTime</code> nor <code>EndTime</code>, the data of the last 24 hour is queried. You can specify both <code>StartTime</code> and <code>EndTime</code> parameters to query data of a specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the <code>StartTime</code> and <code>EndTime</code> parameters. The following table describes the time period within which historical data is available and the data delay when you do not set <code>Interval</code>.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>Time range per query &#x3C; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time range per query &#x3C; 31 days</td>
     * <td>186 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>31 days ≤ Time range per query ≤ 366 days</td>
     * <td>366 days</td>
     * <td>4 hours in most cases, not more than 24 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodDomainTrafficData  DescribeVodDomainTrafficDataRequest
     * @return DescribeVodDomainTrafficDataResponse
     */
    CompletableFuture<DescribeVodDomainTrafficDataResponse> describeVodDomainTrafficData(DescribeVodDomainTrafficDataRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can specify up to 100 accelerated domain names in a request. Separate multiple domain names with commas (,). If you do not specify an accelerated domain name, the data of all accelerated domain names within your Alibaba Cloud account is returned.</li>
     * <li>You can query data in the last year. The maximum time range that can be queried is three months. If you specify a time range of one to three days, the system returns data on an hourly basis. If you specify a time range of four days or more, the system returns data on a daily basis.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodDomainUsageData  DescribeVodDomainUsageDataRequest
     * @return DescribeVodDomainUsageDataResponse
     */
    CompletableFuture<DescribeVodDomainUsageDataResponse> describeVodDomainUsageData(DescribeVodDomainUsageDataRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>Only playback data in ApsaraVideo Player SDK is collected.</li>
     * <li>You can query only data within the last 30 days.</li>
     * <li>Before you call this operation, make sure that the following requirements are met:<ul>
     * <li>ApsaraVideo Player SDK for Android or iOS<ul>
     * <li>ApsaraVideo Player SDK for Android or iOS V5.4.9.2 or later is used.</li>
     * <li>A license for ApsaraVideo Player SDK is obtained. For more information, see <a href="https://help.aliyun.com/document_detail/469166.html">Manage licenses</a>.</li>
     * <li>The log reporting feature is enabled. By default, the feature is enabled for ApsaraVideo Player SDKs. For more information, see <a href="~~311525#section-dc4-gp6-xk2~~">Integrate ApsaraVideo Player SDK for Android</a> and <a href="~~313855#section-cmf-k7d-jg5~~">Integrate ApsaraVideo Player SDK for iOS</a>.</li>
     * </ul>
     * </li>
     * <li>ApsaraVideo Player SDK for Web<ul>
     * <li>ApsaraVideo Player SDK for Web V2.16.0 or later is used.</li>
     * <li>A license for <strong>playback quality monitoring</strong> is obtained. To apply for the license, <a href="https://yida.alibaba-inc.com/o/webplayer#/">submit a request on Yida to enable value-added features for ApsaraVideo Player SDK for Web</a>. For more information, see the description of the <code>license</code> parameter in the <a href="~~125572#section-3ty-gwp-6pa~~">API operations</a> topic.</li>
     * <li>The log reporting feature is enabled. By default, the feature is enabled for ApsaraVideo Player SDKs.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodMediaPlayData  DescribeVodMediaPlayDataRequest
     * @return DescribeVodMediaPlayDataResponse
     */
    CompletableFuture<DescribeVodMediaPlayDataResponse> describeVodMediaPlayData(DescribeVodMediaPlayDataRequest request);

    /**
     * <b>description</b> :
     * <p>The data is collected every 5 minutes. You can call this API operation up to 20 times per second per account. Time granularity
     * The time granularity supported by Interval, the maximum time period within which historical data is available, and the data delay vary based on the time range to query, as described in the following table.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>1 hour</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of DescribeVodRangeDataByLocateAndIspService  DescribeVodRangeDataByLocateAndIspServiceRequest
     * @return DescribeVodRangeDataByLocateAndIspServiceResponse
     */
    CompletableFuture<DescribeVodRangeDataByLocateAndIspServiceResponse> describeVodRangeDataByLocateAndIspService(DescribeVodRangeDataByLocateAndIspServiceRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>This operation is available only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/69215.html">RefreshVodObjectCaches</a> operation to refresh content and the <a href="https://help.aliyun.com/document_detail/69211.html">PreloadVodObjectCaches</a> operation to prefetch content.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeVodRefreshQuota  DescribeVodRefreshQuotaRequest
     * @return DescribeVodRefreshQuotaResponse
     */
    CompletableFuture<DescribeVodRefreshQuotaResponse> describeVodRefreshQuota(DescribeVodRefreshQuotaRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>If you do not specify the TaskId or ObjectPath parameter, the data in the last three days is returned on the first page. By default, one page displays a maximum of 20 entries. You can specify the TaskId and ObjectPath parameters at the same time.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodRefreshTasks  DescribeVodRefreshTasksRequest
     * @return DescribeVodRefreshTasksResponse
     */
    CompletableFuture<DescribeVodRefreshTasksResponse> describeVodRefreshTasks(DescribeVodRefreshTasksRequest request);

    /**
     * @param request the request parameters of DescribeVodSSLCertificateList  DescribeVodSSLCertificateListRequest
     * @return DescribeVodSSLCertificateListResponse
     */
    CompletableFuture<DescribeVodSSLCertificateListResponse> describeVodSSLCertificateList(DescribeVodSSLCertificateListRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>This operation is available only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>If the time range to query is less than or equal to seven days, the system returns the statistics collected on an hourly basis. If the time range to query is greater than seven days, the system returns the statistics collected on a daily basis. The maximum time range that you can specify to query is 31 days.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeVodStorageData  DescribeVodStorageDataRequest
     * @return DescribeVodStorageDataResponse
     */
    CompletableFuture<DescribeVodStorageDataResponse> describeVodStorageData(DescribeVodStorageDataRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>If you specify a time range within 7 days, the request returns the data based on hours. If you specify a time range longer than 7 days, the request returns the data based on days. The maximum time range is 31 days.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodTieringStorageData  DescribeVodTieringStorageDataRequest
     * @return DescribeVodTieringStorageDataResponse
     */
    CompletableFuture<DescribeVodTieringStorageDataResponse> describeVodTieringStorageData(DescribeVodTieringStorageDataRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>If you specify a time range within 7 days, the request returns the data based on hours. If you specify a time range longer than 7 days, the request returns the data based on days. The maximum time range is 31 days.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodTieringStorageRetrievalData  DescribeVodTieringStorageRetrievalDataRequest
     * @return DescribeVodTieringStorageRetrievalDataResponse
     */
    CompletableFuture<DescribeVodTieringStorageRetrievalDataResponse> describeVodTieringStorageRetrievalData(DescribeVodTieringStorageRetrievalDataRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>If the time range to query is less than or equal to seven days, the system returns the statistics collected on an hourly basis. If the time range to query is greater than seven days, the system returns the statistics collected on a daily basis. The maximum time range that you can specify to query is 31 days.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodTranscodeData  DescribeVodTranscodeDataRequest
     * @return DescribeVodTranscodeDataResponse
     */
    CompletableFuture<DescribeVodTranscodeDataResponse> describeVodTranscodeData(DescribeVodTranscodeDataRequest request);

    /**
     * <b>description</b> :
     * <p>  You can filter domain names by name and status. Fuzzy match is supported for domain name-based query.</p>
     * <ul>
     * <li>This operation is available only in the China (Shanghai) region.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodUserDomains  DescribeVodUserDomainsRequest
     * @return DescribeVodUserDomainsResponse
     */
    CompletableFuture<DescribeVodUserDomainsResponse> describeVodUserDomains(DescribeVodUserDomainsRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * 
     * @param request the request parameters of DescribeVodVerifyContent  DescribeVodVerifyContentRequest
     * @return DescribeVodVerifyContentResponse
     */
    CompletableFuture<DescribeVodVerifyContentResponse> describeVodVerifyContent(DescribeVodVerifyContentRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can grant a maximum of 10 application permissions to a RAM user or RAM role.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DetachAppPolicyFromIdentity  DetachAppPolicyFromIdentityRequest
     * @return DetachAppPolicyFromIdentityResponse
     */
    CompletableFuture<DetachAppPolicyFromIdentityResponse> detachAppPolicyFromIdentity(DetachAppPolicyFromIdentityRequest request);

    /**
     * <b>description</b> :
     * <p>  To use the secure download feature, you must enable the download feature in the ApsaraVideo VOD console and set the download method to secure download. For more information, see <a href="https://help.aliyun.com/document_detail/86107.html">Configure download settings</a>.</p>
     * <ul>
     * <li>After you generate a key for secure download, you must configure the key in ApsaraVideo Player SDK. For more information, see <a href="https://help.aliyun.com/document_detail/124735.html">Secure download</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of GenerateDownloadSecretKey  GenerateDownloadSecretKeyRequest
     * @return GenerateDownloadSecretKeyResponse
     */
    CompletableFuture<GenerateDownloadSecretKeyResponse> generateDownloadSecretKey(GenerateDownloadSecretKeyRequest request);

    /**
     * @param request the request parameters of GenerateKMSDataKey  GenerateKMSDataKeyRequest
     * @return GenerateKMSDataKeyResponse
     */
    CompletableFuture<GenerateKMSDataKeyResponse> generateKMSDataKey(GenerateKMSDataKeyRequest request);

    /**
     * <b>description</b> :
     * <p>  Regions that support this operation: <strong>China (Beijing)</strong> and <strong>China (Shanghai)</strong>.</p>
     * <ul>
     * <li>Call the <a href="~~SubmitAIImageJob~~">SubmitAIImageJob</a> operation to submit image AI processing jobs before you call this operation to query image AI processing jobs.</li>
     * <li>You can query a maximum of 10 jobs of image AI processing in one request.</li>
     * </ul>
     * 
     * @param request the request parameters of GetAIImageJobs  GetAIImageJobsRequest
     * @return GetAIImageJobsResponse
     */
    CompletableFuture<GetAIImageJobsResponse> getAIImageJobs(GetAIImageJobsRequest request);

    /**
     * <b>description</b> :
     * <p>ApsaraVideo VOD stores the snapshots of the intelligent review results free of charge for two weeks. After this period, the snapshots are automatically deleted.</p>
     * 
     * @param request the request parameters of GetAIMediaAuditJob  GetAIMediaAuditJobRequest
     * @return GetAIMediaAuditJobResponse
     */
    CompletableFuture<GetAIMediaAuditJobResponse> getAIMediaAuditJob(GetAIMediaAuditJobRequest request);

    /**
     * <b>description</b> :
     * <p>  Regions that support this operation: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</p>
     * <ul>
     * <li>Before you call this operation to query details of an AI template, you must obtain the ID of the AI template.</li>
     * </ul>
     * 
     * @param request the request parameters of GetAITemplate  GetAITemplateRequest
     * @return GetAITemplateResponse
     */
    CompletableFuture<GetAITemplateResponse> getAITemplate(GetAITemplateRequest request);

    /**
     * <b>description</b> :
     * <p>  Regions that support this operation: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</p>
     * <ul>
     * <li>You can obtain the smart tagging results by using the video ID.</li>
     * </ul>
     * 
     * @param request the request parameters of GetAIVideoTagResult  GetAIVideoTagResultRequest
     * @return GetAIVideoTagResultResponse
     */
    CompletableFuture<GetAIVideoTagResultResponse> getAIVideoTagResult(GetAIVideoTagResultRequest request);

    /**
     * <b>description</b> :
     * <p>You can specify multiple accelerated domain names in a request.</p>
     * 
     * @param request the request parameters of GetAppInfos  GetAppInfosRequest
     * @return GetAppInfosResponse
     */
    CompletableFuture<GetAppInfosResponse> getAppInfos(GetAppInfosRequest request);

    /**
     * <b>description</b> :
     * <p>You can query information about up to 20 auxiliary media assets in a request.</p>
     * 
     * @param request the request parameters of GetAttachedMediaInfo  GetAttachedMediaInfoRequest
     * @return GetAttachedMediaInfoResponse
     */
    CompletableFuture<GetAttachedMediaInfoResponse> getAttachedMediaInfo(GetAttachedMediaInfoRequest request);

    /**
     * @param request the request parameters of GetAuditHistory  GetAuditHistoryRequest
     * @return GetAuditHistoryResponse
     */
    CompletableFuture<GetAuditHistoryResponse> getAuditHistory(GetAuditHistoryRequest request);

    /**
     * @param request the request parameters of GetCategories  GetCategoriesRequest
     * @return GetCategoriesResponse
     */
    CompletableFuture<GetCategoriesResponse> getCategories(GetCategoriesRequest request);

    /**
     * <b>description</b> :
     * <p>  Regions that support this operation: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</p>
     * <ul>
     * <li>You can query information only about the default AI template for automated review.</li>
     * </ul>
     * 
     * @param request the request parameters of GetDefaultAITemplate  GetDefaultAITemplateRequest
     * @return GetDefaultAITemplateResponse
     */
    CompletableFuture<GetDefaultAITemplateResponse> getDefaultAITemplate(GetDefaultAITemplateRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is supported only in the China (Shanghai) and China (Beijing) regions.</p>
     * <ul>
     * <li>You can call this operation to query the watermark content after you call the <a href="~~SubmitDigitalWatermarkExtractJob~~">SubmitDigitalWatermarkExtractJob</a> operation to extract the copyright or user-tracing watermark in a video.</li>
     * <li>You can query watermark content extracted only from watermark extraction jobs that are submitted in the last 2 years.</li>
     * </ul>
     * 
     * @param request the request parameters of GetDigitalWatermarkExtractResult  GetDigitalWatermarkExtractResultRequest
     * @return GetDigitalWatermarkExtractResultResponse
     */
    CompletableFuture<GetDigitalWatermarkExtractResultResponse> getDigitalWatermarkExtractResult(GetDigitalWatermarkExtractResultRequest request);

    /**
     * @param request the request parameters of GetEditingProject  GetEditingProjectRequest
     * @return GetEditingProjectResponse
     */
    CompletableFuture<GetEditingProjectResponse> getEditingProject(GetEditingProjectRequest request);

    /**
     * <b>description</b> :
     * <p>During editing, you can add materials to the timeline, but some of them may not be used.</p>
     * 
     * @param request the request parameters of GetEditingProjectMaterials  GetEditingProjectMaterialsRequest
     * @return GetEditingProjectMaterialsResponse
     */
    CompletableFuture<GetEditingProjectMaterialsResponse> getEditingProjectMaterials(GetEditingProjectMaterialsRequest request);

    /**
     * @param request the request parameters of GetImageInfo  GetImageInfoRequest
     * @return GetImageInfoResponse
     */
    CompletableFuture<GetImageInfoResponse> getImageInfo(GetImageInfoRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call the <a href="~~CreateUploadImage~~">CreateUploadImage</a> operation to upload images to ApsaraVideo VOD and call this operation to query the basic information about multiple images at a time.</p>
     * <ul>
     * <li>To query information about video snapshots, call the <a href="~~ListSnapshots~~">ListSnapshots</a> operation.</li>
     * <li>You can specify up to 20 image IDs in one call.</li>
     * </ul>
     * 
     * @param request the request parameters of GetImageInfos  GetImageInfosRequest
     * @return GetImageInfosResponse
     */
    CompletableFuture<GetImageInfosResponse> getImageInfos(GetImageInfosRequest request);

    /**
     * @param request the request parameters of GetJobDetail  GetJobDetailRequest
     * @return GetJobDetailResponse
     */
    CompletableFuture<GetJobDetailResponse> getJobDetail(GetJobDetailRequest request);

    /**
     * <b>description</b> :
     * <p>If notifications for the <a href="https://help.aliyun.com/document_detail/89576.html">CreateAuditComplete</a> event are configured, event notifications are sent to the callback URL after automated review is complete. You can call this operation to query the details of audio review results.</p>
     * 
     * @param request the request parameters of GetMediaAuditAudioResultDetail  GetMediaAuditAudioResultDetailRequest
     * @return GetMediaAuditAudioResultDetailResponse
     */
    CompletableFuture<GetMediaAuditAudioResultDetailResponse> getMediaAuditAudioResultDetail(GetMediaAuditAudioResultDetailRequest request);

    /**
     * @param request the request parameters of GetMediaAuditResult  GetMediaAuditResultRequest
     * @return GetMediaAuditResultResponse
     */
    CompletableFuture<GetMediaAuditResultResponse> getMediaAuditResult(GetMediaAuditResultRequest request);

    /**
     * <b>description</b> :
     * <p>  By default, only details of snapshots that violate content regulations and potentially violate content regulations are returned.</p>
     * <ul>
     * <li>ApsaraVideo VOD stores the snapshots in the automated review results free of charge for two weeks. After this period, the snapshots are automatically deleted.</li>
     * <li>This operation is available only in the Singapore region.</li>
     * </ul>
     * 
     * @param request the request parameters of GetMediaAuditResultDetail  GetMediaAuditResultDetailRequest
     * @return GetMediaAuditResultDetailResponse
     */
    CompletableFuture<GetMediaAuditResultDetailResponse> getMediaAuditResultDetail(GetMediaAuditResultDetailRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> By default, only details of snapshots that violate content regulations and potentially violate content regulations are returned.
     * This operation is available only in the Singapore region.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetMediaAuditResultTimeline  GetMediaAuditResultTimelineRequest
     * @return GetMediaAuditResultTimelineResponse
     */
    CompletableFuture<GetMediaAuditResultTimelineResponse> getMediaAuditResultTimeline(GetMediaAuditResultTimelineRequest request);

    /**
     * <b>description</b> :
     * <p>Regions that support this operation: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</p>
     * 
     * @param request the request parameters of GetMediaDNAResult  GetMediaDNAResultRequest
     * @return GetMediaDNAResultResponse
     */
    CompletableFuture<GetMediaDNAResultResponse> getMediaDNAResult(GetMediaDNAResultRequest request);

    /**
     * <b>description</b> :
     * <p>You can query the information about all media files or a specific media file in a refresh or prefetch job.</p>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limits on API operations in ApsaraVideo VoD</a>.</p>
     * 
     * @param request the request parameters of GetMediaRefreshJobs  GetMediaRefreshJobsRequest
     * @return GetMediaRefreshJobsResponse
     */
    CompletableFuture<GetMediaRefreshJobsResponse> getMediaRefreshJobs(GetMediaRefreshJobsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/55627.html">Event notification</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetMessageCallback  GetMessageCallbackRequest
     * @return GetMessageCallbackResponse
     */
    CompletableFuture<GetMessageCallbackResponse> getMessageCallback(GetMessageCallbackRequest request);

    /**
     * <b>description</b> :
     * <p>You can obtain complete information about the source file only after a stream is transcoded.</p>
     * 
     * @param request the request parameters of GetMezzanineInfo  GetMezzanineInfoRequest
     * @return GetMezzanineInfoResponse
     */
    CompletableFuture<GetMezzanineInfoResponse> getMezzanineInfo(GetMezzanineInfoRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>Make sure that you understand the billing method and price of ApsaraVideo VOD before you call this operation. You are charged for outbound traffic when you download or play videos based on URLs in ApsaraVideo VOD. For more information about billing of outbound traffic, see <a href="~~188308#section-rwh-e88-f7j~~">Billing of outbound traffic</a>. If you have configured an accelerated domain name, see <a href="~~188308#section-c5t-oq9-15e~~">Billing of the acceleration service</a>. If you have activated the acceleration service, you are charged acceleration fees when you upload media files to ApsaraVideo VOD. For more information, see <a href="~~188310#section_sta_zm2_tsv~~">Billing of acceleration traffic</a>.</strong></p>
     * <ul>
     * <li>Only videos whose Status is Normal can be played. For more information, see <a href="https://help.aliyun.com/document_detail/57290.html">Overview</a>.</li>
     * <li>If video playback fails, you can call the <a href="~~GetMezzanineInfo~~">GetMezzanineInfo</a> operation to check whether the video source information is correct.</li>
     * </ul>
     * 
     * @param request the request parameters of GetPlayInfo  GetPlayInfoRequest
     * @return GetPlayInfoResponse
     */
    CompletableFuture<GetPlayInfoResponse> getPlayInfo(GetPlayInfoRequest request);

    /**
     * <b>description</b> :
     * <p>  An audio or video file may be transcoded multiple times. This operation returns only the latest transcoding summary.</p>
     * <ul>
     * <li>You can query transcoding summaries for a maximum of 10 audio and video files in one request.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/109120.html">ListTranscodeTask</a> operation to query historical transcoding tasks.</li>
     * <li>**You can call this operation to query information only about transcoding tasks created within the past year.</li>
     * </ul>
     * 
     * @param request the request parameters of GetTranscodeSummary  GetTranscodeSummaryRequest
     * @return GetTranscodeSummaryResponse
     */
    CompletableFuture<GetTranscodeSummaryResponse> getTranscodeSummary(GetTranscodeSummaryRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query only transcoding tasks created within the past year.</p>
     * 
     * @param request the request parameters of GetTranscodeTask  GetTranscodeTaskRequest
     * @return GetTranscodeTaskResponse
     */
    CompletableFuture<GetTranscodeTaskResponse> getTranscodeTask(GetTranscodeTaskRequest request);

    /**
     * <b>description</b> :
     * <p>This operation returns information about the specified transcoding template group and the configurations of all the transcoding templates in the group.</p>
     * 
     * @param request the request parameters of GetTranscodeTemplateGroup  GetTranscodeTemplateGroupRequest
     * @return GetTranscodeTemplateGroupResponse
     */
    CompletableFuture<GetTranscodeTemplateGroupResponse> getTranscodeTemplateGroup(GetTranscodeTemplateGroupRequest request);

    /**
     * <b>description</b> :
     * <p>You can query the information about a URL-based upload job by specifying the upload URL or using the job ID returned when you upload media files. The information includes the status of the upload job, custom configurations, the time when the job was created, and the time when the job was complete.
     * If the upload fails, you can view the error code and error message. If the upload is successful, you can obtain the video ID.</p>
     * 
     * @param request the request parameters of GetURLUploadInfos  GetURLUploadInfosRequest
     * @return GetURLUploadInfosResponse
     */
    CompletableFuture<GetURLUploadInfosResponse> getURLUploadInfos(GetURLUploadInfosRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation to obtain the upload details only about audio and video files.</p>
     * <ul>
     * <li>If you use the ApsaraVideo VOD console to upload audio and video files, you can call this operation to query information such as the upload ratio. If you use an upload SDK to upload audio and video files, make sure that the version of the <a href="https://help.aliyun.com/document_detail/52200.html">upload SDK</a> meets one of the following requirements:<ul>
     * <li>The version of the upload SDK for Java is 1.4.4 or later.</li>
     * <li>The version of the upload SDK for C++ is 1.0.0 or later.</li>
     * <li>The version of the upload SDK for PHP is 1.0.2 or later.</li>
     * <li>The version of the upload SDK for Python is 1.3.0 or later.</li>
     * <li>The version of the upload SDK for JavaScript is 1.4.0 or later.</li>
     * <li>The version of the upload SDK for Android is 1.5.0 or later.</li>
     * <li>The version of the upload SDK for iOS is 1.5.0 or later.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetUploadDetails  GetUploadDetailsRequest
     * @return GetUploadDetailsResponse
     */
    CompletableFuture<GetUploadDetailsResponse> getUploadDetails(GetUploadDetailsRequest request);

    /**
     * <b>description</b> :
     * <p>After a media file is uploaded, ApsaraVideo VOD processes the source file. Then, information about the media file is asynchronously generated. You can configure notifications for the <a href="https://help.aliyun.com/document_detail/99935.html">VideoAnalysisComplete</a> event and call this operation to query information about a media file after you receive notifications for the <a href="https://help.aliyun.com/document_detail/99935.html">VideoAnalysisComplete</a> event. For more information, see <a href="https://help.aliyun.com/document_detail/55627.html">Overview</a>.</p>
     * 
     * @param request the request parameters of GetVideoInfo  GetVideoInfoRequest
     * @return GetVideoInfoResponse
     */
    CompletableFuture<GetVideoInfoResponse> getVideoInfo(GetVideoInfoRequest request);

    /**
     * <b>description</b> :
     * <p>  You can specify up to 20 audio or video file IDs in each request.</p>
     * <ul>
     * <li>After a media file is uploaded, ApsaraVideo VOD processes the source file. Then, information about the media file is asynchronously generated. You can configure notifications for the <a href="https://help.aliyun.com/document_detail/99935.html">VideoAnalysisComplete</a> event and call this operation to query information about a media file after you receive notifications for the <a href="https://help.aliyun.com/document_detail/99935.html">VideoAnalysisComplete</a> event. For more information, see <a href="https://help.aliyun.com/document_detail/55627.html">Overview</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of GetVideoInfos  GetVideoInfosRequest
     * @return GetVideoInfosResponse
     */
    CompletableFuture<GetVideoInfosResponse> getVideoInfos(GetVideoInfosRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query information about media files based on the filter conditions that you specify, such as video status and category ID. Information about a maximum of <strong>5,000</strong> media files can be returned for each request. We recommend that you set the StartTime and EndTime parameters to specify a time range for each request. For more information about how to query information about more media files or even all media files, see <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a>.</p>
     * 
     * @param request the request parameters of GetVideoList  GetVideoListRequest
     * @return GetVideoListResponse
     */
    CompletableFuture<GetVideoListResponse> getVideoList(GetVideoListRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation to obtain a playback credential when you use ApsaraVideo Player SDK to play a media file based on PlayAuth. The credential is used to obtain the playback URL. For more information, see <a href="https://help.aliyun.com/document_detail/125579.html">ApsaraVideo Player SDK</a>.</p>
     * <ul>
     * <li>You cannot obtain the playback URL of a video by using a credential that has expired. A new credential is required.</li>
     * </ul>
     * 
     * @param request the request parameters of GetVideoPlayAuth  GetVideoPlayAuthRequest
     * @return GetVideoPlayAuthResponse
     */
    CompletableFuture<GetVideoPlayAuthResponse> getVideoPlayAuth(GetVideoPlayAuthRequest request);

    /**
     * @param request the request parameters of GetVodTemplate  GetVodTemplateRequest
     * @return GetVodTemplateResponse
     */
    CompletableFuture<GetVodTemplateResponse> getVodTemplate(GetVodTemplateRequest request);

    /**
     * @param request the request parameters of GetWatermark  GetWatermarkRequest
     * @return GetWatermarkResponse
     */
    CompletableFuture<GetWatermarkResponse> getWatermark(GetWatermarkRequest request);

    /**
     * <b>description</b> :
     * <p>  Regions that support this operation: <strong>China (Beijing)</strong> and <strong>China (Shanghai)</strong>.</p>
     * <ul>
     * <li>You can call this operation to query AI processing results about images of a specified video. Images of different videos cannot be queried in one request.</li>
     * </ul>
     * 
     * @param request the request parameters of ListAIImageInfo  ListAIImageInfoRequest
     * @return ListAIImageInfoResponse
     */
    CompletableFuture<ListAIImageInfoResponse> listAIImageInfo(ListAIImageInfoRequest request);

    /**
     * <b>description</b> :
     * <p>  Regions that support this operation: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</p>
     * <ul>
     * <li>You can call this operation to query video fingerprinting jobs and smart tagging jobs.</li>
     * </ul>
     * 
     * @param request the request parameters of ListAIJob  ListAIJobRequest
     * @return ListAIJobResponse
     */
    CompletableFuture<ListAIJobResponse> listAIJob(ListAIJobRequest request);

    /**
     * <b>description</b> :
     * <p>  Regions that support this operation: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</p>
     * <ul>
     * <li>You can call this operation to query AI templates of a specified type.</li>
     * </ul>
     * 
     * @param request the request parameters of ListAITemplate  ListAITemplateRequest
     * @return ListAITemplateResponse
     */
    CompletableFuture<ListAITemplateResponse> listAITemplate(ListAITemplateRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <p>You can query applications based on states.</p>
     * <h3><a href="#qps-"></a>QPS limit</h3>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limits on API operations</a>.</p>
     * 
     * @param request the request parameters of ListAppInfo  ListAppInfoRequest
     * @return ListAppInfoResponse
     */
    CompletableFuture<ListAppInfoResponse> listAppInfo(ListAppInfoRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The IdentityType and IdentityName parameters take effect only when an identity assumes the application administrator role to call this operation. Otherwise, only application policies that are attached to the current identity are returned.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListAppPoliciesForIdentity  ListAppPoliciesForIdentityRequest
     * @return ListAppPoliciesForIdentityResponse
     */
    CompletableFuture<ListAppPoliciesForIdentityResponse> listAppPoliciesForIdentity(ListAppPoliciesForIdentityRequest request);

    /**
     * @param request the request parameters of ListAuditSecurityIp  ListAuditSecurityIpRequest
     * @return ListAuditSecurityIpResponse
     */
    CompletableFuture<ListAuditSecurityIpResponse> listAuditSecurityIp(ListAuditSecurityIpRequest request);

    /**
     * @param request the request parameters of ListDynamicImage  ListDynamicImageRequest
     * @return ListDynamicImageResponse
     */
    CompletableFuture<ListDynamicImageResponse> listDynamicImage(ListDynamicImageRequest request);

    /**
     * @param request the request parameters of ListJobInfo  ListJobInfoRequest
     * @return ListJobInfoResponse
     */
    CompletableFuture<ListJobInfoResponse> listJobInfo(ListJobInfoRequest request);

    /**
     * <b>description</b> :
     * <p>You can query up to 5,000 videos based on the specified filter condition.</p>
     * 
     * @param request the request parameters of ListLiveRecordVideo  ListLiveRecordVideoRequest
     * @return ListLiveRecordVideoResponse
     */
    CompletableFuture<ListLiveRecordVideoResponse> listLiveRecordVideo(ListLiveRecordVideoRequest request);

    /**
     * <b>description</b> :
     * <p>If multiple snapshots exist for a video, you can call this operation to query information about the latest snapshot.</p>
     * 
     * @param request the request parameters of ListSnapshots  ListSnapshotsRequest
     * @return ListSnapshotsResponse
     */
    CompletableFuture<ListSnapshotsResponse> listSnapshots(ListSnapshotsRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call the <a href="https://help.aliyun.com/document_detail/109121.html">GetTranscodeTask</a> operation to query details about transcoding jobs.</p>
     * <ul>
     * <li><strong>You can call this operation to query only transcoding tasks created within the past year.</strong></li>
     * </ul>
     * 
     * @param request the request parameters of ListTranscodeTask  ListTranscodeTaskRequest
     * @return ListTranscodeTaskResponse
     */
    CompletableFuture<ListTranscodeTaskResponse> listTranscodeTask(ListTranscodeTaskRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation does not return the configurations of transcoding templates in each transcoding template group. To query the configurations of transcoding templates in a specific transcoding template group, call the <a href="https://help.aliyun.com/document_detail/102670.html">GetTranscodeTemplateGroup</a> operation.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListTranscodeTemplateGroup  ListTranscodeTemplateGroupRequest
     * @return ListTranscodeTemplateGroupResponse
     */
    CompletableFuture<ListTranscodeTemplateGroupResponse> listTranscodeTemplateGroup(ListTranscodeTemplateGroupRequest request);

    /**
     * @param request the request parameters of ListVodTemplate  ListVodTemplateRequest
     * @return ListVodTemplateResponse
     */
    CompletableFuture<ListVodTemplateResponse> listVodTemplate(ListVodTemplateRequest request);

    /**
     * @param request the request parameters of ListWatermark  ListWatermarkRequest
     * @return ListWatermarkResponse
     */
    CompletableFuture<ListWatermarkResponse> listWatermark(ListWatermarkRequest request);

    /**
     * @param request the request parameters of MoveAppResource  MoveAppResourceRequest
     * @return MoveAppResourceResponse
     */
    CompletableFuture<MoveAppResourceResponse> moveAppResource(MoveAppResourceRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>This operation is available only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>You can submit a maximum of 500 requests to prefetch resources based on URLs each day by using an Alibaba Cloud account. You cannot prefetch resources based on directories.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/69215.html">RefreshVodObjectCaches</a> operation to refresh content and the <a href="https://help.aliyun.com/document_detail/69211.htmll">PreloadVodObjectCaches</a> operation to prefetch content.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of PreloadVodObjectCaches  PreloadVodObjectCachesRequest
     * @return PreloadVodObjectCachesResponse
     */
    CompletableFuture<PreloadVodObjectCachesResponse> preloadVodObjectCaches(PreloadVodObjectCachesRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>Make sure that you understand the billing method and price of ApsaraVideo VOD before you call this operation. You are charged for using the online editing feature. For more information, see <a href="~~188310#section-pyv-b8h-bo7~~">Billing</a>.</strong></p>
     * <ul>
     * <li>This operation returns only the submission result of a video production task. When the submission result is returned, video production may still be in progress. After a video production task is submitted, the task is queued in the background for asynchronous processing.</li>
     * <li>The source files that are used in the timeline of an online editing project can be materials directly uploaded to the online project or selected from the media asset library. Only media assets that are in the Normal state can be used in the project.</li>
     * <li>Videos are produced based on ProjectId and Timeline. The following content describes the parameter configurations:<ul>
     * <li>You must specify ProjectId or Timeline. If you leave both parameters empty, the video cannot be produced.</li>
     * <li>If you specify Timeline and leave ProjectId empty, the system automatically creates an online editing project based on Timeline and adds the materials specified in the Timeline to the project to produce videos.</li>
     * <li>If you specify ProjectId and leave Timeline empty, the system automatically uses the latest timeline information of the project to produce videos.</li>
     * <li>If you specify both ProjectId and Timeline, the system automatically uses the timeline information that you specified to produce videos and updates the project timeline and materials. You can also specify other parameters to update the corresponding information about the online editing project.</li>
     * </ul>
     * </li>
     * <li>You can create up to 100 video tracks, 100 image tracks, and 100 subtitle tracks in a project.</li>
     * <li>The total size of material files cannot exceed 1 TB.</li>
     * <li>The buckets in which the materials reside and where the exported videos are stored must be in the same region as the region where ApsaraVideo VOD is activated.</li>
     * <li>The exported videos must meet the following requirements:<ul>
     * <li>The width and height of the video image cannot be less than 128 pixels.</li>
     * <li>The width and height of the video image cannot exceed 4,096 pixels.</li>
     * <li>The width cannot exceed 2,160 pixels.</li>
     * </ul>
     * </li>
     * <li>After a video is produced, the video is automatically uploaded to ApsaraVideo VOD. Then, the <strong>ProduceMediaComplete</strong> and <strong>FileUploadComplete</strong> event notifications are sent to you. After the produced video is transcoded, the <strong>StreamTranscodeComplete</strong> and <strong>TranscodeComplete</strong> event notifications are sent to you.</li>
     * <li>You can add special effects to the video. For more information, see <a href="https://help.aliyun.com/document_detail/69082.html">Special effects</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ProduceEditingProjectVideo  ProduceEditingProjectVideoRequest
     * @return ProduceEditingProjectVideoResponse
     */
    CompletableFuture<ProduceEditingProjectVideoResponse> produceEditingProjectVideo(ProduceEditingProjectVideoRequest request);

    /**
     * <b>description</b> :
     * <p>  ApsaraVideo VOD allows you to purge and prefetch resources. The purge feature forces the point of presence (POP) to clear cached resources and retrieve the latest resources from origin servers. The prefetch feature allows the POP to retrieve frequently accessed resources from origin servers during off-peak hours. This increases the cache hit ratio.</p>
     * <ul>
     * <li>You can call this operation to submit purge or prefetch tasks based on the media ID. You can also specify the format and resolution of the media streams to purge or prefetch based on your business requirements.</li>
     * <li>You can submit a maximum of 20 purge or prefetch tasks at a time.</li>
     * </ul>
     * 
     * @param request the request parameters of RefreshMediaPlayUrls  RefreshMediaPlayUrlsRequest
     * @return RefreshMediaPlayUrlsResponse
     */
    CompletableFuture<RefreshMediaPlayUrlsResponse> refreshMediaPlayUrls(RefreshMediaPlayUrlsRequest request);

    /**
     * <b>description</b> :
     * <p>You can also call this operation to overwrite the source file of an audio or video file. After you call this operation, the system obtains the upload URL and uploads a new source file without changing the ID of the audio or video file. If you have configured transcoding or snapshot capture for the upload, the transcoding or snapshot capture job is automatically triggered. For more information, see <a href="https://help.aliyun.com/document_detail/55397.html">Upload URLs and credentials</a>.</p>
     * 
     * @param request the request parameters of RefreshUploadVideo  RefreshUploadVideoRequest
     * @return RefreshUploadVideoResponse
     */
    CompletableFuture<RefreshUploadVideoResponse> refreshUploadVideo(RefreshUploadVideoRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can submit a maximum of 2,000 requests to refresh resources based on URLs and 100 requests to refresh resources based on directories each day by using an Alibaba Cloud account.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/69215.html">RefreshVodObjectCaches</a> operation to refresh content and the <a href="https://help.aliyun.com/document_detail/69211.html">PreloadVodObjectCaches</a> operation to prefetch content.</li>
     * </ul>
     * 
     * @param request the request parameters of RefreshVodObjectCaches  RefreshVodObjectCachesRequest
     * @return RefreshVodObjectCachesResponse
     */
    CompletableFuture<RefreshVodObjectCachesResponse> refreshVodObjectCaches(RefreshVodObjectCachesRequest request);

    /**
     * <b>description</b> :
     * <p>  After you add an OSS bucket to ApsaraVideo VOD, you must register media files in the OSS bucket to generate the required information. Then, you can use media IDs for features such as transcoding, snapshot capture, and AI processing.use features such as xxx on media files by specifying their IDs?</p>
     * <ul>
     * <li>You can register up to 10 media files in an OSS bucket in a request. The media files must be stored in the same bucket.</li>
     * <li>If you do not specify a transcoding template group ID when you upload a media file to ApsaraVideo VOD, the media file is automatically transcoded based on the default template group. If you do not specify a transcoding template group ID after you register a media file, the media file is not automatically transcoded. The registered media files are automatically transcoded only if you specify a transcoding template group ID.</li>
     * <li>If the media file that you want to register has been registered, this operation returns only the unique media ID that is associated with the media file. No further operation is performed.</li>
     * <li>Make sure that the media file that you want to register has a valid suffix. Otherwise, the registration fails.</li>
     * </ul>
     * 
     * @param request the request parameters of RegisterMedia  RegisterMediaRequest
     * @return RegisterMediaResponse
     */
    CompletableFuture<RegisterMediaResponse> registerMedia(RegisterMediaRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to restore only Archive and Cold Archive audio and video files. You can access the audio and video files after the files are restored. You cannot change the storage class of an audio or video file that is being restored. You are charged for the retrieval traffic generated during restoration. After a Cold Archive audio or video file is restored, a Standard replica of the file is generated for access. You are charged for the storage of the replica before the file returns to the frozen state.</p>
     * 
     * @param request the request parameters of RestoreMedia  RestoreMediaRequest
     * @return RestoreMediaResponse
     */
    CompletableFuture<RestoreMediaResponse> restoreMedia(RestoreMediaRequest request);

    /**
     * @param request the request parameters of SearchEditingProject  SearchEditingProjectRequest
     * @return SearchEditingProjectResponse
     */
    CompletableFuture<SearchEditingProjectResponse> searchEditingProject(SearchEditingProjectRequest request);

    /**
     * <b>description</b> :
     * <p>The maximum number of data records that you can query varies based on the method used to query the data. You can use the following methods to query data:</p>
     * <ul>
     * <li>Method 1: Traverse data by page
     * You can use the PageNo and PageSize parameters to traverse up to 5,000 data records that meet the specified filter condition. PageNo specifies the page number and PageSize specifies the number of data records displayed on a page. If the number of data records that meet the specified filter condition exceeds 5,000, change the filter conditions to narrow down the results. You cannot use this method to traverse all data records. If you want to traverse more data records, use Method 2.</li>
     * <li>Method 2: Traverse all data (available only for audio and video files)
     * You can use this method to traverse up to 2 million data records related to audio and video files. If the number of data records that meet the specified filter condition exceeds 2 million, change the filter conditions to narrow down the results. To traverse data page by page, you must set the PageNo, PageSize, and ScrollToken parameters. The total number of data records from the current page to the target page cannot exceed 100. For example, you set PageSize to 20. The following content describes the traverse logic:<ul>
     * <li>When the PageNo parameter is set to 1, you can traverse data records from page 1 to page 5.</li>
     * <li>When the PageNo parameter is set to 2, you can traverse data records from page 2 to page 6.
     * Make sure that you set the appropriate page number and page size, and use a traverse method based on the number of results that meet your filter condition.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of SearchMedia  SearchMediaRequest
     * @return SearchMediaResponse
     */
    CompletableFuture<SearchMediaResponse> searchMedia(SearchMediaRequest request);

    /**
     * <b>description</b> :
     * <p>You can play videos in the Checking or Blocked state only from the IP addresses that are added to review security groups.</p>
     * 
     * @param request the request parameters of SetAuditSecurityIp  SetAuditSecurityIpRequest
     * @return SetAuditSecurityIpResponse
     */
    CompletableFuture<SetAuditSecurityIpResponse> setAuditSecurityIp(SetAuditSecurityIpRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>After you use the cross-domain policy file to update the resources on the origin server, you must refresh the resources that are cached on Alibaba Cloud CDN nodes. You can use the ApsaraVideo VOD console to refresh resources. For more information, see <a href="https://help.aliyun.com/document_detail/86098.html">Refresh and prefetch</a>. Alternatively, you can call the <a href="https://help.aliyun.com/document_detail/69215.html">RefreshVodObjectCaches</a> operation to refresh resources.</p>
     * </blockquote>
     * 
     * @param request the request parameters of SetCrossdomainContent  SetCrossdomainContentRequest
     * @return SetCrossdomainContentResponse
     */
    CompletableFuture<SetCrossdomainContentResponse> setCrossdomainContent(SetCrossdomainContentRequest request);

    /**
     * <b>description</b> :
     * <p>Specifies an AI template as the default template.</p>
     * 
     * @param request the request parameters of SetDefaultAITemplate  SetDefaultAITemplateRequest
     * @return SetDefaultAITemplateResponse
     */
    CompletableFuture<SetDefaultAITemplateResponse> setDefaultAITemplate(SetDefaultAITemplateRequest request);

    /**
     * @param request the request parameters of SetDefaultTranscodeTemplateGroup  SetDefaultTranscodeTemplateGroupRequest
     * @return SetDefaultTranscodeTemplateGroupResponse
     */
    CompletableFuture<SetDefaultTranscodeTemplateGroupResponse> setDefaultTranscodeTemplateGroup(SetDefaultTranscodeTemplateGroupRequest request);

    /**
     * @param request the request parameters of SetDefaultWatermark  SetDefaultWatermarkRequest
     * @return SetDefaultWatermarkResponse
     */
    CompletableFuture<SetDefaultWatermarkResponse> setDefaultWatermark(SetDefaultWatermarkRequest request);

    /**
     * @param request the request parameters of SetEditingProjectMaterials  SetEditingProjectMaterialsRequest
     * @return SetEditingProjectMaterialsResponse
     */
    CompletableFuture<SetEditingProjectMaterialsResponse> setEditingProjectMaterials(SetEditingProjectMaterialsRequest request);

    /**
     * <b>description</b> :
     * <p>HTTP callbacks and MNS callbacks are supported. For more information, see <a href="https://help.aliyun.com/document_detail/55627.html">Overview</a>.</p>
     * 
     * @param request the request parameters of SetMessageCallback  SetMessageCallbackRequest
     * @return SetMessageCallbackResponse
     */
    CompletableFuture<SetMessageCallbackResponse> setMessageCallback(SetMessageCallbackRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * </blockquote>
     * 
     * @param request the request parameters of SetVodDomainCertificate  SetVodDomainCertificateRequest
     * @return SetVodDomainCertificateResponse
     */
    CompletableFuture<SetVodDomainCertificateResponse> setVodDomainCertificate(SetVodDomainCertificateRequest request);

    /**
     * @param request the request parameters of SetVodDomainSSLCertificate  SetVodDomainSSLCertificateRequest
     * @return SetVodDomainSSLCertificateResponse
     */
    CompletableFuture<SetVodDomainSSLCertificateResponse> setVodDomainSSLCertificate(SetVodDomainSSLCertificateRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is available only in the Singapore region.</p>
     * 
     * @param request the request parameters of SubmitAIImageAuditJob  SubmitAIImageAuditJobRequest
     * @return SubmitAIImageAuditJobResponse
     */
    CompletableFuture<SubmitAIImageAuditJobResponse> submitAIImageAuditJob(SubmitAIImageAuditJobRequest request);

    /**
     * <b>description</b> :
     * <p>  Regions that support this operation: <strong>China (Beijing)</strong> and <strong>China (Shanghai)</strong>.</p>
     * <ul>
     * <li>After you call this operation, you can call the <a href="https://help.aliyun.com/document_detail/186923.html">GetAIImageJobs</a> operation to query the job execution result.</li>
     * </ul>
     * 
     * @param request the request parameters of SubmitAIImageJob  SubmitAIImageJobRequest
     * @return SubmitAIImageJobResponse
     */
    CompletableFuture<SubmitAIImageJobResponse> submitAIImageJob(SubmitAIImageJobRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>Make sure that you understand the billing method and price of ApsaraVideo VOD before you call this operation. You are charged for using the smart tagging and video fingerprinting features. For more information, see <a href="~~188310#section-g7l-s3o-9ng~~">Billing of video AI</a>.</strong></p>
     * <ul>
     * <li>Regions that support the video fingerprinting feature: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>. Regions that support the smart tagging feature: <strong>China (Beijing)</strong> and <strong>China (Shanghai)</strong>.</li>
     * <li>You need to enable the video fingerprinting feature or the smart tagging feature before you can call this operation to submit jobs. For more information, see <a href="https://help.aliyun.com/document_detail/101148.html">Overview</a>.</li>
     * <li>If this is the first time you use the video fingerprinting feature, you must submit a ticket to apply for using the media fingerprint library for free. Otherwise, the video fingerprinting feature will be affected. For more information about how to submit a ticket, see <a href="https://help.aliyun.com/document_detail/464625.html">Contact us</a>.</li>
     * <li>After you submit an AI job, ApsaraVideo VOD asynchronously processes the job. The operation may return a response before the job is complete. You can configure the <a href="https://help.aliyun.com/document_detail/55627.html">Event Notification</a> feature and set the callback event to <strong>AI Processing Completed</strong>. After you receive the event notification, you can query the execution result of the AI job.</li>
     * </ul>
     * 
     * @param request the request parameters of SubmitAIJob  SubmitAIJobRequest
     * @return SubmitAIJobResponse
     */
    CompletableFuture<SubmitAIJobResponse> submitAIJob(SubmitAIJobRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>Make sure that you understand the billing methods and price of ApsaraVideo VOD before you call this operation. You are charged for using the automated review feature. For more information about billing, submit a ticket or contact your account manager.</strong></p>
     * <ul>
     * <li>You can call this operation only in the <strong>China (Shanghai)</strong>, <strong>China (Beijing)</strong>, and <strong>Singapore</strong> regions.</li>
     * <li>For more information, see <a href="https://help.aliyun.com/document_detail/101148.html">Automated review</a>.</li>
     * <li>After an automated review job is complete, the images generated during the review are stored in the VOD bucket for two weeks free of charge. The images are automatically deleted after two weeks.</li>
     * </ul>
     * 
     * @param request the request parameters of SubmitAIMediaAuditJob  SubmitAIMediaAuditJobRequest
     * @return SubmitAIMediaAuditJobResponse
     */
    CompletableFuture<SubmitAIMediaAuditJobResponse> submitAIMediaAuditJob(SubmitAIMediaAuditJobRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>Make sure that you understand the billing methods and price of ApsaraVideo VOD before you call this operation. You are charged for generating and extracting digital watermarks. For more information, see <a href="~~188310#62b9c940403se~~">Billing</a>.</strong></p>
     * <ul>
     * <li>This operation is supported only in the <strong>China (Shanghai)</strong> and <strong>China (Beijing)</strong> regions.</li>
     * <li>Before you submit a digital watermark extraction job, make sure that the following conditions are met:<ul>
     * <li>The video from which you want to extract the watermark is uploaded to the ApsaraVideo VOD.</li>
     * <li>The video from which you want to extract the watermark is longer than 6 minutes.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of SubmitDigitalWatermarkExtractJob  SubmitDigitalWatermarkExtractJobRequest
     * @return SubmitDigitalWatermarkExtractJobResponse
     */
    CompletableFuture<SubmitDigitalWatermarkExtractJobResponse> submitDigitalWatermarkExtractJob(SubmitDigitalWatermarkExtractJobRequest request);

    /**
     * <b>description</b> :
     * <p>  You can capture a part of a video and generate animated images only when the video is in the <strong>Uploaded</strong>, <strong>Transcoding</strong>, <strong>Normal</strong>, <strong>Reviewing</strong>, or <strong>Flagged</strong> state.</p>
     * <ul>
     * <li>The fees for frame animation are included in your video transcoding bill. You are charged based on the output resolution and the duration. For more information, see <a href="https://help.aliyun.com/document_detail/188308.html">Billing of basic services</a>.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit on API operations</a>.</p>
     * 
     * @param request the request parameters of SubmitDynamicImageJob  SubmitDynamicImageJobRequest
     * @return SubmitDynamicImageJobResponse
     */
    CompletableFuture<SubmitDynamicImageJobResponse> submitDynamicImageJob(SubmitDynamicImageJobRequest request);

    /**
     * <b>description</b> :
     * <p>Regions that support this operation: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</p>
     * 
     * @param request the request parameters of SubmitMediaDNADeleteJob  SubmitMediaDNADeleteJobRequest
     * @return SubmitMediaDNADeleteJobResponse
     */
    CompletableFuture<SubmitMediaDNADeleteJobResponse> submitMediaDNADeleteJob(SubmitMediaDNADeleteJobRequest request);

    /**
     * <b>description</b> :
     * <p>  During video preprocessing, videos are transcoded to meet the playback requirements of the production studio. Therefore, <strong>you are charged for video preprocessing</strong>. For more information about billing, see <a href="https://help.aliyun.com/document_detail/64531.html">Billing of production studios</a>.</p>
     * <ul>
     * <li>You can obtain the preprocessing result in the <a href="https://help.aliyun.com/document_detail/55638.html">TranscodeComplete</a> event notification. If <strong>Preprocess=true</strong> is returned in the event notification, the video is transcoded.</li>
     * </ul>
     * 
     * @param request the request parameters of SubmitPreprocessJobs  SubmitPreprocessJobsRequest
     * @return SubmitPreprocessJobsResponse
     */
    CompletableFuture<SubmitPreprocessJobsResponse> submitPreprocessJobs(SubmitPreprocessJobsRequest request);

    /**
     * <b>description</b> :
     * <p>  Only snapshots in the JPG format are generated.</p>
     * <ul>
     * <li>After a snapshot is captured, the <a href="https://help.aliyun.com/document_detail/57337.html">SnapshotComplete</a> callback is fired and EventType=SnapshotComplete, SubType=SpecifiedTime is returned.</li>
     * </ul>
     * <h3><a href="#qps-"></a>QPS limits</h3>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of SubmitSnapshotJob  SubmitSnapshotJobRequest
     * @return SubmitSnapshotJobResponse
     */
    CompletableFuture<SubmitSnapshotJobResponse> submitSnapshotJob(SubmitSnapshotJobRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li><strong>Make sure that you understand the billing methods and prices of ApsaraVideo VOD before you call this operation. For more information about billing of the transcoding feature, see <a href="~~188308#section-ejb-nii-nqa~~">Billing of basic services</a>.</strong></li>
     * <li>You can transcode a video only in the Uploaded, Normal, or Reviewing state.</li>
     * <li>You can obtain the transcoding results from the <a href="https://help.aliyun.com/document_detail/55636.html">StreamTranscodeComplete</a> or <a href="https://help.aliyun.com/document_detail/55638.html">TranscodeComplete</a> callback.</li>
     * <li>You can call this operation to dynamically override the subtitle URL in an HTTP Live Streaming (HLS) packaging task. If the packaging task does not contain subtitles, we recommend that you specify the ID of the specific packaging template group when you upload the video instead of calling this operation.</li>
     * </ul>
     * 
     * @param request the request parameters of SubmitTranscodeJobs  SubmitTranscodeJobsRequest
     * @return SubmitTranscodeJobsResponse
     */
    CompletableFuture<SubmitTranscodeJobsResponse> submitTranscodeJobs(SubmitTranscodeJobsRequest request);

    /**
     * <b>description</b> :
     * <p><strong>Make sure that you understand the billing method and price of ApsaraVideo VOD before you call this operation. When you use workflows to process videos, you may be charged for transcoding, encryption, and automated review. For more information, see <a href="https://help.aliyun.com/document_detail/188307.html">Billing overview</a>.</strong></p>
     * <ul>
     * <li>You can call this operation to initiate a VOD workflow to process media files. For more information, see <a href="https://help.aliyun.com/document_detail/115347.html">Workflows</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of SubmitWorkflowJob  SubmitWorkflowJobRequest
     * @return SubmitWorkflowJobResponse
     */
    CompletableFuture<SubmitWorkflowJobResponse> submitWorkflowJob(SubmitWorkflowJobRequest request);

    /**
     * <b>description</b> :
     * <p>  Regions that support this operation: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</p>
     * <ul>
     * <li>After you call the <a href="https://help.aliyun.com/document_detail/102930.html">AddAITemplate</a> operation to add an AI template, you can call this operation to modify the AI template.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateAITemplate  UpdateAITemplateRequest
     * @return UpdateAITemplateResponse
     */
    CompletableFuture<UpdateAITemplateResponse> updateAITemplate(UpdateAITemplateRequest request);

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>A single user can perform a maximum of 30 queries per second (QPS). Throttling is triggered when the number of calls per second exceeds the QPS limit. The throttling may affect your business. Thus, we recommend that you observe the QPS limit on this operation.</p>
     * 
     * @param request the request parameters of UpdateAppInfo  UpdateAppInfoRequest
     * @return UpdateAppInfoResponse
     */
    CompletableFuture<UpdateAppInfoResponse> updateAppInfo(UpdateAppInfoRequest request);

    /**
     * <b>description</b> :
     * <p>You can modify the information about up to 20 auxiliary media assets at a time.</p>
     * 
     * @param request the request parameters of UpdateAttachedMediaInfos  UpdateAttachedMediaInfosRequest
     * @return UpdateAttachedMediaInfosResponse
     */
    CompletableFuture<UpdateAttachedMediaInfosResponse> updateAttachedMediaInfos(UpdateAttachedMediaInfosRequest request);

    /**
     * <b>description</b> :
     * <p>After you create a category, you can call this operation to modify the name of the category. If you have classified specific media resources to this category, the category names that are labeled on the media resources are automatically updated.</p>
     * 
     * @param request the request parameters of UpdateCategory  UpdateCategoryRequest
     * @return UpdateCategoryResponse
     */
    CompletableFuture<UpdateCategoryResponse> updateCategory(UpdateCategoryRequest request);

    /**
     * @param request the request parameters of UpdateEditingProject  UpdateEditingProjectRequest
     * @return UpdateEditingProjectResponse
     */
    CompletableFuture<UpdateEditingProjectResponse> updateEditingProject(UpdateEditingProjectRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation to modify information such as the title, tags, description, and category about images based on image IDs. You must pass in the parameters that you want to modify. Otherwise, parameter configurations are not overwritten.</p>
     * <ul>
     * <li>You can modify the information about up to 20 images at a time.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateImageInfos  UpdateImageInfosRequest
     * @return UpdateImageInfosResponse
     */
    CompletableFuture<UpdateImageInfosResponse> updateImageInfos(UpdateImageInfosRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is an asynchronous operation. You can call this operation to modify the storage classes of media assets. After the storage class is modified, a callback notification is sent.</p>
     * <ul>
     * <li>If the storage class of the media asset is Archive or Cold Archive and you call this operation to modify the storage class of the media asset, the media asset is automatically restored before the storage class is modified. You do not need to call the RestoreMedia operation to restore the media asset. You must specify the restoration priority for Cold Archive objects. Default configuration: RestoreTier=Standard.</li>
     * <li>Media assets whose storage classes are being modified cannot be used or processed.</li>
     * <li>Non-Standard objects have minimum storage durations. If an object is stored for less than the minimum storage duration, the storage class of the object cannot be changed. The following content describes the minimum storage durations for objects in different storage classes: IA or IA storage for source files: 30 days, Archive or Archive storage for source files: 60 days, Cold Archive or Cold Archive for source files: 180 days.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateMediaStorageClass  UpdateMediaStorageClassRequest
     * @return UpdateMediaStorageClassResponse
     */
    CompletableFuture<UpdateMediaStorageClassResponse> updateMediaStorageClass(UpdateMediaStorageClassRequest request);

    /**
     * <b>description</b> :
     * <p>For security purposes, you cannot add, modify, or delete transcoding templates in a transcoding template group that is locked. You can call the <a href="~~GetTranscodeTemplateGroup~~">GetTranscodeTemplateGroup</a> operation to query the configurations of a transcoding template group, check whether the transcoding template group is locked by using the response parameter Locked, and unlock the transcoding template group before you perform operations such as add, modify, and delete transcoding templates.</p>
     * 
     * @param request the request parameters of UpdateTranscodeTemplateGroup  UpdateTranscodeTemplateGroupRequest
     * @return UpdateTranscodeTemplateGroupResponse
     */
    CompletableFuture<UpdateTranscodeTemplateGroupResponse> updateTranscodeTemplateGroup(UpdateTranscodeTemplateGroupRequest request);

    /**
     * <b>description</b> :
     * <p>The specific parameter of a video is updated only when a new value is passed in the parameter.</p>
     * 
     * @param request the request parameters of UpdateVideoInfo  UpdateVideoInfoRequest
     * @return UpdateVideoInfoResponse
     */
    CompletableFuture<UpdateVideoInfoResponse> updateVideoInfo(UpdateVideoInfoRequest request);

    /**
     * <b>description</b> :
     * <p>The specific parameter of a video is updated only when a new value is passed in the parameter.</p>
     * 
     * @param request the request parameters of UpdateVideoInfos  UpdateVideoInfosRequest
     * @return UpdateVideoInfosResponse
     */
    CompletableFuture<UpdateVideoInfosResponse> updateVideoInfos(UpdateVideoInfosRequest request);

    /**
     * <b>description</b> :
     * <p>UpdateVodDomain</p>
     * 
     * @param request the request parameters of UpdateVodDomain  UpdateVodDomainRequest
     * @return UpdateVodDomainResponse
     */
    CompletableFuture<UpdateVodDomainResponse> updateVodDomain(UpdateVodDomainRequest request);

    /**
     * @param request the request parameters of UpdateVodTemplate  UpdateVodTemplateRequest
     * @return UpdateVodTemplateResponse
     */
    CompletableFuture<UpdateVodTemplateResponse> updateVodTemplate(UpdateVodTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>  You can modify the name and configurations of the watermark template after you call the <a href="~~AddWatermark~~">AddWatermark</a> operation to create a watermark template.</p>
     * <ul>
     * <li>You cannot call this operation to change the image in an image watermark template.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateWatermark  UpdateWatermarkRequest
     * @return UpdateWatermarkResponse
     */
    CompletableFuture<UpdateWatermarkResponse> updateWatermark(UpdateWatermarkRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation to upload media files that are not stored on a local server or device and must be uploaded based on URLs over the Internet.</p>
     * <ul>
     * <li>The URL-based upload jobs are asynchronous. After you submit a URL-based upload job by calling this operation, it may take hours, even days to complete. If you require high timeliness, we recommend that you use the upload SDK.</li>
     * <li>If you configure callbacks, you can receive an <a href="https://help.aliyun.com/document_detail/86326.html">UploadByURLComplete</a> event notification after the media file is uploaded. You can query the upload status by calling the <a href="https://help.aliyun.com/document_detail/106830.html">GetURLUploadInfos</a> operation.</li>
     * <li>After you submit an upload job, the job is asynchronously processed on the cloud. All URL-based upload jobs that are submitted in each region are queued. The waiting time for the upload job depends on the number of queued jobs. After the upload job is complete, you can associate the playback URL included in the callback with the media ID.</li>
     * <li>You can call this operation only in the <strong>China (Shanghai)</strong> and <strong>Singapore</strong> regions.</li>
     * <li>Every time you submit a URL-based upload job, a new media ID is generated in ApsaraVideo VOD.</li>
     * </ul>
     * 
     * @param request the request parameters of UploadMediaByURL  UploadMediaByURLRequest
     * @return UploadMediaByURLResponse
     */
    CompletableFuture<UploadMediaByURLResponse> uploadMediaByURL(UploadMediaByURLRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>Make sure that you understand the billing method and price of ApsaraVideo VOD before you call this operation. You are charged storage fees after you upload media files to ApsaraVideo VOD. For more information, see <a href="~~188308#section_e97_xrp_mzz~~">Billing of media asset storage</a>. If you have activated the acceleration service, you are charged acceleration fees when you upload media files to ApsaraVideo VOD. For more information, see <a href="~~188310#section_sta_zm2_tsv~~">Billing of acceleration traffic</a>.</strong></p>
     * <ul>
     * <li>This operation is available only in the <strong>China (Shanghai)</strong> and <strong>Singapore</strong> regions.</li>
     * <li>You can call this operation to upload transcoded streams to ApsaraVideo VOD from external storage. The following HDR types of transcoded streams are supported: HDR, HDR 10, HLG, Dolby Vision, HDR Vivid, and SDR+.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/106830.html">GetURLUploadInfos</a> operation to query the upload status. After the upload is complete, the callback of the <a href="https://help.aliyun.com/document_detail/376427.html">UploadByURLComplete</a> event is returned.</li>
     * </ul>
     * 
     * @param request the request parameters of UploadStreamByURL  UploadStreamByURLRequest
     * @return UploadStreamByURLResponse
     */
    CompletableFuture<UploadStreamByURLResponse> uploadStreamByURL(UploadStreamByURLRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * 
     * @param request the request parameters of VerifyVodDomainOwner  VerifyVodDomainOwnerRequest
     * @return VerifyVodDomainOwnerResponse
     */
    CompletableFuture<VerifyVodDomainOwnerResponse> verifyVodDomainOwner(VerifyVodDomainOwnerRequest request);

}
