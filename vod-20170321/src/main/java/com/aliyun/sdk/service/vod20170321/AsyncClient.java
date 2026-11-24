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
     * <ul>
     * <li>Currently, this operation is supported in the following regions: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</li>
     * <li>&lt;props=&quot;china&quot;&gt;Before adding an AI template for automated review and smart thumbnail tasks, make sure that you have activated <a href="https://ai.aliyun.com/vi/censor">automated review</a> or <a href="https://ai.aliyun.com/vi/cover">smart thumbnail</a>.</li>
     * <li>&lt;props=&quot;intl&quot;&gt;Before adding an AI template for automated review and smart thumbnail tasks, make sure that you have activated automated review or smart thumbnail.</li>
     * </ul>
     * 
     * @param request the request parameters of AddAITemplate  AddAITemplateRequest
     * @return AddAITemplateResponse
     */
    CompletableFuture<AddAITemplateResponse> addAITemplate(AddAITemplateRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Audio, video, and image categories (where <code>Type</code> is <code>default</code>) support up to three levels, with a maximum of 100 subcategories per level. Short video material categories (where <code>Type</code> is <code>material</code>) support up to two levels, with a maximum of 100 subcategories per level.</li>
     * <li>After you create a category, you can classify media assets during or after upload. For more information, see <a href="https://help.aliyun.com/document_detail/86070.html">Media asset categories</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of AddCategory  AddCategoryRequest
     * @return AddCategoryResponse
     */
    CompletableFuture<AddCategoryResponse> addCategory(AddCategoryRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>For more information about online editing, see <a href="https://help.aliyun.com/document_detail/95482.html">Online editing</a>.</li>
     * </ul>
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
     * <h2>Request description</h2>
     * <ul>
     * <li>The <code>Name</code> parameter is required and must pass the <code>COMPLEX_STRING_SPACE_ALLOWED</code> format validation.</li>
     * <li>Other parameters are optional, but if provided, they must meet the corresponding format requirements.</li>
     * <li>The encryption type <code>EncryptType</code> supports a combination of multiple encryption methods. For more information, see the valid values.</li>
     * <li>When HLS encryption is used, <code>EncryptConfig</code> must include information such as <code>DecryptKeyUri</code>, <code>KeyServiceType</code>, <code>CipherText</code>, and <code>MasterKeyId</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of AddManifestEditTemplate  AddManifestEditTemplateRequest
     * @return AddManifestEditTemplateResponse
     */
    CompletableFuture<AddManifestEditTemplateResponse> addManifestEditTemplate(AddManifestEditTemplateRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Transcoding template groups that are <strong>locked</strong> by the ApsaraVideo VOD backend do not support custom operations. You can call the <a href="~~GetTranscodeTemplateGroup~~">GetTranscodeTemplateGroup</a> operation to query the template configuration and check whether the template group is locked based on the Locked response parameter. You can call the <a href="~~UpdateTranscodeTemplateGroup~~">UpdateTranscodeTemplateGroup</a> operation to unlock the template before you modify it.</li>
     * <li>Because transcoding involves storage addresses of files, you cannot add a transcoding template group if no storage address is available. You can activate a <strong>VOD system bucket</strong> in the <strong>ApsaraVideo VOD console &gt; Configuration Management &gt; Media Asset Management Configuration &gt; Storage Management</strong> to obtain an available storage address.</li>
     * <li>You cannot add transcoding template configurations to a <strong>No Transcoding</strong> template group.</li>
     * <li>You must specify either <strong>TranscodeTemplateGroupId</strong> or <strong>Name</strong>.</li>
     * <li>You can create a maximum of 20 transcoding template groups.</li>
     * <li>You can add a maximum of 20 transcoding template configurations to a transcoding template group.</li>
     * <li>To generate adaptive bitrate streaming addresses through transcoding, you can add a maximum of 10 video packaging templates to a transcoding template group. If more than 10 templates are added, only individual stream addresses are generated instead of adaptive bitrate streaming addresses.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The maximum number of queries per second (QPS) per user for this operation is 5. If the number of calls per second exceeds the limit, throttling is triggered. This may affect your business. Manage your calls appropriately. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of AddTranscodeTemplateGroup  AddTranscodeTemplateGroupRequest
     * @return AddTranscodeTemplateGroupResponse
     */
    CompletableFuture<AddTranscodeTemplateGroupResponse> addTranscodeTemplateGroup(AddTranscodeTemplateGroupRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Currently, the service endpoint supports only <strong>China (Shanghai)</strong>.</li>
     * <li>Before you create an accelerated domain name, you must activate <a href="https://help.aliyun.com/document_detail/51512.html">ApsaraVideo VOD</a> and complete the ICP filing for the accelerated domain name. </li>
     * <li>When you add a new domain name for the first time, you must verify the ownership of the domain name. To verify the ownership by using DNS records, call the DescribeVodVerifyContent operation to obtain the record value, add a TXT record in the DNS settings of the domain name, and wait for the DNS record to take effect. Then, call this operation to add the domain name. You can also verify the ownership by using a verification file. For more information, see the domain name ownership verification documentation.</li>
     * <li>Origin server content. If the content is not hosted on Alibaba Cloud, it must be reviewed. The review will be completed by the next business day.</li>
     * <li>You can submit only one accelerated domain name at a time. Each user can add up to 20 domain names.</li>
     * </ul>
     * 
     * @param request the request parameters of AddVodDomain  AddVodDomainRequest
     * @return AddVodDomainResponse
     */
    CompletableFuture<AddVodDomainResponse> addVodDomain(AddVodDomainRequest request);

    /**
     * <b>description</b> :
     * <p>Calls AddVodStorageForApp to enable a VOD system bucket for a sub-application of ApsaraVideo VOD.
     * <notice>Each sub-application can have at most one VOD system bucket enabled. If the specified AppId does not exist or already has a VOD system bucket enabled, the request fails.</notice>
     * <notice>To call this operation, the caller must have the application administrator permissions (VODAppAdministratorAccess). An Alibaba Cloud account has these permissions by default. An application administrator can call AttachAppPolicyToIdentity to grant application permissions to a RAM user or role.</notice></p>
     * 
     * @param request the request parameters of AddVodStorageForApp  AddVodStorageForAppRequest
     * @return AddVodStorageForAppResponse
     */
    CompletableFuture<AddVodStorageForAppResponse> addVodStorageForApp(AddVodStorageForAppRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>After you create a template, you can pass the ID of the snapshot or animated image template to the <a href="~~SubmitSnapshotJob~~">SubmitSnapshotJob</a> or <a href="~~SubmitDynamicImageJob~~">SubmitDynamicImageJob</a> operation to initiate a snapshot or animated image job.</li>
     * <li>You can receive <a href="https://help.aliyun.com/document_detail/57337.html">video snapshot completion</a> and <a href="https://help.aliyun.com/document_detail/143490.html">video animated image completion</a> callback messages by using HTTP callbacks (HTTPS-compatible) or MNS callbacks. For more information, see <a href="https://help.aliyun.com/document_detail/55627.html">Callback methods</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of AddVodTemplate  AddVodTemplateRequest
     * @return AddVodTemplateResponse
     */
    CompletableFuture<AddVodTemplateResponse> addVodTemplate(AddVodTemplateRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to add an image watermark template (<code>Image</code>) or a text watermark template (<code>Text</code>). Image watermark templates support the following formats: static images (PNG) and animated images (GIF, APNG, and MOV).</li>
     * <li>After you add an image or text watermark template, you must call the <a href="~~AddTranscodeTemplateGroup~~">AddTranscodeTemplateGroup</a> or <a href="~~UpdateTranscodeTemplateGroup~~">UpdateTranscodeTemplateGroup</a> operation to associate the watermark template with a transcoding template group for subsequent watermark transcoding.</li>
     * <li>For more information about adding image and text watermarks to videos, see <a href="https://help.aliyun.com/document_detail/99369.html">Image and text watermarks</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of AddWatermark  AddWatermarkRequest
     * @return AddWatermarkResponse
     */
    CompletableFuture<AddWatermarkResponse> addWatermark(AddWatermarkRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice:  You can grant a maximum of 10 application permissions to each Resource Access Management (RAM) user or RAM role.
     * Notice:  You must have application administrator permissions to invoke this operation. We recommend that you use your Alibaba Cloud account to invoke this operation for the first time.</p>
     * </blockquote>
     * <ul>
     * <li>If the policy name is VODAppAdministratorAccess, AppId is optional. For other policies, AppId is required.</li>
     * </ul>
     * 
     * @param request the request parameters of AttachAppPolicyToIdentity  AttachAppPolicyToIdentityRequest
     * @return AttachAppPolicyToIdentityResponse
     */
    CompletableFuture<AttachAppPolicyToIdentityResponse> attachAppPolicyToIdentity(AttachAppPolicyToIdentityRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can retrieve the information of up to 20 audio and video files at a time.</li>
     * <li>After an audio or video file is uploaded, ApsaraVideo VOD analyzes the uploaded source file. Therefore, media asset information is generated asynchronously. You can configure <a href="https://help.aliyun.com/document_detail/55627.html">event notifications</a> for <a href="https://help.aliyun.com/document_detail/99935.html">Audio and Video Analysis Completed</a>. After receiving the <a href="https://help.aliyun.com/document_detail/99935.html">Audio and Video Analysis Completed</a> event notification, call this operation to retrieve the audio and video information.</li>
     * </ul>
     * 
     * @param request the request parameters of BatchGetMediaInfos  BatchGetMediaInfosRequest
     * @return BatchGetMediaInfosResponse
     */
    CompletableFuture<BatchGetMediaInfosResponse> batchGetMediaInfos(BatchGetMediaInfosRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Currently, the only supported service region is <strong>China (Shanghai)</strong>.</li>
     * <li>You can configure up to 50 domain names at a time.</li>
     * <li>After you call this operation to configure certain features for domain names, a unique ConfigId is generated. You can use the ConfigId to update or delete domain name configurations. This operation does not return the ConfigId. To obtain the ConfigId, call the <a href="~~DescribeVodDomainConfigs~~">DescribeVodDomainConfigs</a> operation.</li>
     * </ul>
     * 
     * @param request the request parameters of BatchSetVodDomainConfigs  BatchSetVodDomainConfigsRequest
     * @return BatchSetVodDomainConfigsResponse
     */
    CompletableFuture<BatchSetVodDomainConfigsResponse> batchSetVodDomainConfigs(BatchSetVodDomainConfigsRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Currently, only the following endpoint is supported: <strong>China (Shanghai)</strong>.</li>
     * <li>If the account to which the domain name belongs has an overdue payment or the domain name is in an invalid state, you cannot call this operation to enable the ApsaraVideo VOD domain name.</li>
     * </ul>
     * 
     * @param request the request parameters of BatchStartVodDomain  BatchStartVodDomainRequest
     * @return BatchStartVodDomainResponse
     */
    CompletableFuture<BatchStartVodDomainResponse> batchStartVodDomain(BatchStartVodDomainRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>The service endpoint is supported only in <strong>China (Shanghai)</strong>.</li>
     * <li>After the accelerated domain name is disabled, the domain name information is retained. The system automatically routes requests for the accelerated domain name back to the origin.</li>
     * </ul>
     * 
     * @param request the request parameters of BatchStopVodDomain  BatchStopVodDomainRequest
     * @return BatchStopVodDomainResponse
     */
    CompletableFuture<BatchStopVodDomainResponse> batchStopVodDomain(BatchStopVodDomainRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only URL upload nodes in the <strong>Pending</strong> state can be canceled. You can query the node status by calling the <a href="https://help.aliyun.com/document_detail/106830.html">GetURLUploadInfos</a> operation.</li>
     * <li>You cannot cancel upload nodes that have already started to execute.</li>
     * <li>You must specify either the JobIds or UploadUrls request parameter. If both are specified, only JobIds is processed.</li>
     * </ul>
     * 
     * @param request the request parameters of CancelUrlUploadJobs  CancelUrlUploadJobsRequest
     * @return CancelUrlUploadJobsResponse
     */
    CompletableFuture<CancelUrlUploadJobsResponse> cancelUrlUploadJobs(CancelUrlUploadJobsRequest request);

    /**
     * <b>description</b> :
     * <p>Transfers resources to another resource group.</p>
     * 
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Each account can create up to 10 applications. For more information, see <a href="https://help.aliyun.com/document_detail/113600.html">Multi-application development guide</a>.</p>
     * <h3>QPS limits</h3>
     * <p>The QPS limit per user for this API operation is 50 calls per second. If this limit is exceeded, API calls are throttled, which may affect your services. Call this API operation at a reasonable frequency. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limits</a>.</p>
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
     * <ul>
     * <li><strong>Before calling this operation, ensure that you fully understand the billing methods and pricing of ApsaraVideo VOD. Uploading media asset files to ApsaraVideo VOD incurs storage fees. For billing details, see <a href="~~188308#section_e97_xrp_mzz~~">Media asset storage billing</a>. If you have enabled storage transfer acceleration, uploading media asset files to ApsaraVideo VOD also incurs upload acceleration fees. For billing details, see <a href="~~188310#section_sta_zm2_tsv~~">Storage transfer acceleration billing</a>.</strong></li>
     * <li>This operation is only used to obtain the upload URL and credential and create basic media asset information. It does not upload files. For a complete example of uploading files by calling the operation, see <a href="https://help.aliyun.com/document_detail/476208.html">Upload media asset files by using the ApsaraVideo VOD API</a>.</li>
     * <li>If the upload credential expires (valid for 3,000 seconds), call this operation again to obtain the upload URL and credential.</li>
     * <li>You can configure a callback to receive the <a href="https://help.aliyun.com/document_detail/103250.html">Auxiliary media asset upload completion</a> event notification to determine whether the upload is successful.</li>
     * <li>Obtaining the upload URL and credential is the core foundation of ApsaraVideo VOD and a required process for every upload operation. ApsaraVideo VOD provides various upload methods, and each method has different requirements for obtaining the upload URL and credential. For details, see the usage instructions in <a href="https://help.aliyun.com/document_detail/55397.html">Upload URLs and credentials</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateUploadAttachedMedia  CreateUploadAttachedMediaRequest
     * @return CreateUploadAttachedMediaResponse
     */
    CompletableFuture<CreateUploadAttachedMediaResponse> createUploadAttachedMedia(CreateUploadAttachedMediaRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Make sure that you fully understand the billing methods and pricing of ApsaraVideo VOD before calling this operation. Uploading media assets to ApsaraVideo VOD incurs storage fees. For billing details, see <a href="~~188308#section_e97_xrp_mzz~~">Media asset storage billing</a>. If you have enabled storage transfer acceleration, uploading media assets to ApsaraVideo VOD also incurs upload acceleration fees. For billing details, see <a href="~~188310#section_sta_zm2_tsv~~">Storage transfer acceleration billing</a>.</strong></li>
     * <li>This operation is only used to obtain the upload URL and credential and create basic media asset information. It does not upload files. For a complete example of uploading files by calling API operations, see <a href="https://help.aliyun.com/document_detail/476208.html">Upload media assets by using the ApsaraVideo VOD API</a>.</li>
     * <li>Refreshing the upload URL and credential is not supported for image uploads. If the upload credential for an image expires (the default validity period is 3,000 seconds), call this operation again to obtain the upload URL and credential.</li>
     * <li>You can configure callbacks to receive the event notification for <a href="https://help.aliyun.com/document_detail/91968.html">image upload complete</a> to determine whether the upload is successful.</li>
     * <li>Obtaining the upload URL and credential is the core foundation of ApsaraVideo VOD and a required step for every upload operation. ApsaraVideo VOD provides various upload methods, each with different requirements for obtaining the upload URL and credential. For details, see the usage notes in <a href="https://help.aliyun.com/document_detail/55397.html">Upload URLs and credentials</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateUploadImage  CreateUploadImageRequest
     * @return CreateUploadImageResponse
     */
    CompletableFuture<CreateUploadImageResponse> createUploadImage(CreateUploadImageRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Before you call this operation, make sure that you fully understand the billing methods and pricing of ApsaraVideo VOD. Uploading media assets to ApsaraVideo VOD incurs storage fees. For more information about billing, see <a href="~~188308#section_e97_xrp_mzz~~">Media asset storage billing</a>. If you have enabled storage and transmission acceleration, uploading media assets to ApsaraVideo VOD also incurs upload acceleration fees. For more information about billing, see <a href="~~188310#section_sta_zm2_tsv~~">Storage and transmission acceleration billing</a>. Storage fees are calculated from the time when the file is uploaded. Acceleration fees are calculated when you upload files after enabling the feature. Calling this operation alone does not incur fees.</strong></li>
     * <li>Obtaining the upload URL and credential is the core foundation of ApsaraVideo VOD and a required step for every upload operation. ApsaraVideo VOD provides various upload methods, each with different requirements for obtaining the upload URL and credential. For more information, see <a href="https://help.aliyun.com/document_detail/55397.html">Upload URLs and credentials</a>.</li>
     * <li>This operation is used only to obtain the upload URL and credential and create basic media asset information. It does not upload files. For a complete example of uploading files by calling API operations, see <a href="https://help.aliyun.com/document_detail/476208.html">Upload media asset files by using the ApsaraVideo VOD API</a>.</li>
     * <li>This operation supports obtaining the upload URL and credential for both video and audio files. For more information, see <a href="https://help.aliyun.com/document_detail/55397.html">Upload URLs and credentials</a>.</li>
     * <li>If the video upload credential expires (the default validity period is 3,000 seconds), call the <a href="~~RefreshUploadVideo~~">RefreshUploadVideo</a> operation to obtain a new upload credential.</li>
     * <li>After the upload, you can configure a callback to receive <a href="https://help.aliyun.com/document_detail/55396.html">upload event notifications</a> or call the <a href="https://help.aliyun.com/document_detail/59624.html">GetMezzanineInfo</a> operation to check the file status in the response to determine whether the upload is successful.</li>
     * <li>The VideoId parameter returned by this operation can be used for media asset lifecycle management or media processing.</li>
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
     * <ul>
     * <li>Currently, this operation is supported in the following regions: <strong>China (Beijing)</strong> and <strong>China (Shanghai)</strong>.</li>
     * <li><strong>This operation only deletes AI image information and does not actually delete image files</strong>.</li>
     * <li>A maximum of 10 IDs can be deleted at a time.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteAIImageInfos  DeleteAIImageInfosRequest
     * @return DeleteAIImageInfosResponse
     */
    CompletableFuture<DeleteAIImageInfosResponse> deleteAIImageInfos(DeleteAIImageInfosRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Currently, this operation is supported in the following regions: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</li>
     * <li>An AI template that is set as the default template cannot be deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteAITemplate  DeleteAITemplateRequest
     * @return DeleteAITemplateResponse
     */
    CompletableFuture<DeleteAITemplateResponse> deleteAITemplate(DeleteAITemplateRequest request);

    /**
     * <b>description</b> :
     * <p>An application cannot be deleted if it contains resources.</p>
     * <h3>QPS limits</h3>
     * <p>The QPS limit per user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call this API operation at a reasonable frequency. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of DeleteAppInfo  DeleteAppInfoRequest
     * @return DeleteAppInfoResponse
     */
    CompletableFuture<DeleteAppInfoResponse> deleteAppInfo(DeleteAppInfoRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>This operation physically deletes auxiliary media assets. Once deleted, they cannot be recovered. Proceed with caution.</strong></li>
     * <li>You can delete up to 20 auxiliary media assets at a time.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteAttachedMedia  DeleteAttachedMediaRequest
     * @return DeleteAttachedMediaResponse
     */
    CompletableFuture<DeleteAttachedMediaResponse> deleteAttachedMedia(DeleteAttachedMediaRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>This operation deletes the category and its subcategories, including level-2 and level-3 subcategories. Proceed with caution.</strong></li>
     * <li>If a category is assigned to media assets, deleting the category also removes the category from these media assets.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteCategory  DeleteCategoryRequest
     * @return DeleteCategoryResponse
     */
    CompletableFuture<DeleteCategoryResponse> deleteCategory(DeleteCategoryRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation only deletes the association between animated stickers and videos. It does not delete the actual animated sticker files.</li>
     * <li>After the association is deleted, the deleted animated sticker information can no longer be queried by calling the <a href="https://help.aliyun.com/document_detail/180958.html">ListDynamicImage</a> operation.</li>
     * <li>If you do not specify <strong>DynamicImageIds</strong>, all animated stickers associated with the specified VideoId are deleted. However, if the video has more than 10 animated stickers, the deletion request is rejected.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The maximum queries per second (QPS) per user for this operation is 10. If the number of calls exceeds the limit, throttling is triggered. This may affect your business. Call this operation as needed. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of DeleteDynamicImage  DeleteDynamicImageRequest
     * @return DeleteDynamicImageResponse
     */
    CompletableFuture<DeleteDynamicImageResponse> deleteDynamicImage(DeleteDynamicImageRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Supports batch deletion.</li>
     * </ul>
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
     * <ul>
     * <li><strong>When you call this operation to delete images, the source files are permanently deleted. This action is irreversible. Once deleted, the images cannot be recovered. Proceed with caution.</strong></li>
     * <li>When <strong>DeleteImageType</strong> is set to <strong>VideoId</strong>, <strong>VideoId</strong> and <strong>ImageType</strong> are available and required. </li>
     * <li>When <strong>DeleteImageType</strong> is set to <strong>ImageURL</strong>, <strong>ImageIds</strong> and <strong>ImageURLs</strong> are available and required. </li>
     * <li>After you call this operation to delete images, CDN caches may still exist in some cases, which means the image URLs may not become invalid immediately.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteImage  DeleteImageRequest
     * @return DeleteImageResponse
     */
    CompletableFuture<DeleteImageResponse> deleteImage(DeleteImageRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>After deletion, the template and its track configurations cannot be recovered. Submitted jobs are not affected, but resubmitting a SubmitEditMediaManifestJob job with the deleted template ID will fail.</li>
     * <li>The custom transcoding template configurations associated with the template in the MediaConvert pipeline will also be cleared (preset templates are not affected).</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteManifestEditTemplate  DeleteManifestEditTemplateRequest
     * @return DeleteManifestEditTemplateResponse
     */
    CompletableFuture<DeleteManifestEditTemplateResponse> deleteManifestEditTemplate(DeleteManifestEditTemplateRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/55627.html">Event notification development guide</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteMessageCallback  DeleteMessageCallbackRequest
     * @return DeleteMessageCallbackResponse
     */
    CompletableFuture<DeleteMessageCallbackResponse> deleteMessageCallback(DeleteMessageCallbackRequest request);

    /**
     * <b>description</b> :
     * <p>Media processing operations in ApsaraVideo VOD (transcoding, snapshots, automated review, etc.) are performed on source files. Once a source file is deleted, subsequent media processing operations cannot be performed. Proceed with caution.</p>
     * 
     * @param request the request parameters of DeleteMezzanines  DeleteMezzaninesRequest
     * @return DeleteMezzaninesResponse
     */
    CompletableFuture<DeleteMezzaninesResponse> deleteMezzanines(DeleteMezzaninesRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>When you use multipart upload, fragment files may be generated if the upload fails. These fragment files are automatically cleared after 7 days. After the upload is complete or fails, you can call this operation to manually clear the fragment files.</li>
     * <li>Calling this operation does not delete the original file or transcoded files. It only deletes fragment files generated during the upload process.</li>
     * <li>Calling the <a href="https://help.aliyun.com/document_detail/52837.html">DeleteVideo</a> operation deletes the complete video file, including fragment files.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteMultipartUpload  DeleteMultipartUploadRequest
     * @return DeleteMultipartUploadResponse
     */
    CompletableFuture<DeleteMultipartUploadResponse> deleteMultipartUpload(DeleteMultipartUploadRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>Batch deletion is supported.</p>
     * <h3>QPS limit</h3>
     * <p>A single user can perform a maximum of 50 queries per second (QPS). Throttling is triggered when the QPS limit is exceeded, which may affect your business. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of DeleteStream  DeleteStreamRequest
     * @return DeleteStreamResponse
     */
    CompletableFuture<DeleteStreamResponse> deleteStream(DeleteStreamRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Default transcoding templates cannot be deleted. Remove the default designation before deleting them.</li>
     * <li>For security protection purposes, a locked transcoding template group cannot be added to, modified, or deleted. Call the <a href="~~GetTranscodeTemplateGroup~~">GetTranscodeTemplateGroup</a> operation to query the template configuration and check the Locked response parameter to determine whether the template group is locked. Call the <a href="~~UpdateTranscodeTemplateGroup~~">UpdateTranscodeTemplateGroup</a> operation to unlock the template before making changes.</li>
     * <li>If the ForceDelGroup parameter is empty or set to false, the TranscodeTemplateIds parameter is required.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteTranscodeTemplateGroup  DeleteTranscodeTemplateGroupRequest
     * @return DeleteTranscodeTemplateGroupResponse
     */
    CompletableFuture<DeleteTranscodeTemplateGroupResponse> deleteTranscodeTemplateGroup(DeleteTranscodeTemplateGroupRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li><strong>This operation physically deletes videos. Deleted videos cannot be recovered. Proceed with caution.</strong></li>
     * <li>Batch deletion is supported.</li>
     * <li>When you delete a video, the source files are deleted, including the video source file, transcoded stream files, and thumbnails. However, the CDN cache is not refreshed through synchronization. If your business requires it, use the purge feature in the ApsaraVideo VOD console to clear stale data from the point of presence. Related operations: see <a href="https://help.aliyun.com/document_detail/86098.html">Purge and prefetch</a>.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 30 calls per second. If the limit is exceeded, the API invoke is throttled, which may affect your business. Invoke this operation appropriately. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of DeleteVideo  DeleteVideoRequest
     * @return DeleteVideoResponse
     */
    CompletableFuture<DeleteVideoResponse> deleteVideo(DeleteVideoRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>Currently, the only supported service region is <strong>China (Shanghai)</strong>.</li>
     * <li>This operation makes the domain name inaccessible. Proceed with caution. Before deleting the domain name, restore the A record of the domain name at your DNS service provider.</li>
     * <li>After the domain name is successfully deleted, all related records of the ApsaraVideo VOD domain name are deleted. If you only want to temporarily disable the domain name, use the <a href="https://help.aliyun.com/document_detail/120208.html">DisableVodDomainOffline</a> operation.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteVodDomain  DeleteVodDomainRequest
     * @return DeleteVodDomainResponse
     */
    CompletableFuture<DeleteVodDomainResponse> deleteVodDomain(DeleteVodDomainRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Currently, the only supported service region is <strong>China (Shanghai)</strong>.</li>
     * <li>This operation causes the domain name to become inaccessible. Before deleting the domain name, restore the A record of the domain name at your DNS service provider.</li>
     * <li>After the domain name is successfully deleted, all related records of the ApsaraVideo VOD domain name are removed. If you only want to temporarily disable the domain name, use the <a href="https://help.aliyun.com/document_detail/120208.html">DisableVodRealtimeLogDelivery</a> operation.</li>
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
     * <ul>
     * <li><strong>When you delete an image watermark template, the watermark source file is physically deleted and cannot be recovered. Proceed with caution.</strong></li>
     * <li>A watermark template that has been set as the default watermark template cannot be deleted. To delete it, call <a href="~~SetDefaultWatermark~~">SetDefaultWatermark</a> to set another watermark template as the default template to remove the default status, and then delete it.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteWatermark  DeleteWatermarkRequest
     * @return DeleteWatermarkResponse
     */
    CompletableFuture<DeleteWatermarkResponse> deleteWatermark(DeleteWatermarkRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Currently, the endpoint for this API operation supports only China (Shanghai).</li>
     * <li>If you do not specify StartTime and EndTime, this API operation returns data for the past 7 days by default. If you specify StartTime and EndTime, this API operation returns data for the specified time period.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeMediaDistribution  DescribeMediaDistributionRequest
     * @return DescribeMediaDistributionResponse
     */
    CompletableFuture<DescribeMediaDistributionResponse> describeMediaDistribution(DescribeMediaDistributionRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Currently, the only supported service region is <strong>China (Shanghai)</strong>.</li>
     * <li>You can query playback statistics for up to the top 1000 videos per day. The top video list is sorted in descending order by the number of views by default.</li>
     * <li>Only playback data collected through ApsaraVideo Player SDK is supported.</li>
     * <li>Based on UTC+8, playback statistics for the previous day are generated at 9:00 AM each day.</li>
     * <li>You can query data generated after January 1, 2018. The maximum time range for a query is 180 days.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribePlayTopVideos  DescribePlayTopVideosRequest
     * @return DescribePlayTopVideosResponse
     */
    CompletableFuture<DescribePlayTopVideosResponse> describePlayTopVideos(DescribePlayTopVideosRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Currently, the only supported service region is <strong>China (Shanghai)</strong>.</li>
     * <li>Only playback data collected through ApsaraVideo Player SDK is supported.</li>
     * <li>Playback statistics for the previous day are generated at 9:00 AM (UTC+8) each day.</li>
     * <li>You can query data generated after 2018-01-01. The maximum time range between the start time and end time is 180 days.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribePlayUserAvg  DescribePlayUserAvgRequest
     * @return DescribePlayUserAvgResponse
     */
    CompletableFuture<DescribePlayUserAvgResponse> describePlayUserAvg(DescribePlayUserAvgRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Currently, the only supported service region is <strong>China (Shanghai)</strong>.</li>
     * <li>Only playback data from ApsaraVideo Player SDK is supported.</li>
     * <li>Based on UTC+8, playback statistics for the previous day are generated at 9:00 AM each day.</li>
     * <li>Data after 2018-01-01 can be queried. The maximum time span between the start time and end time is 180 days.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribePlayUserTotal  DescribePlayUserTotalRequest
     * @return DescribePlayUserTotalResponse
     */
    CompletableFuture<DescribePlayUserTotalResponse> describePlayUserTotal(DescribePlayUserTotalRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Currently, the service address supports only <strong>China (Shanghai)</strong>.</li>
     * <li>Only playback data of videos that use ApsaraVideo Player SDK and rank in the top 1,000 by daily playback count is supported.</li>
     * <li>Based on UTC+8, playback statistics for the previous day are generated at 9:00 AM each day.</li>
     * <li>Only data within the last 2 years (730 days) can be queried, and the maximum time span between the start time and end time is 180 days.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribePlayVideoStatis  DescribePlayVideoStatisRequest
     * @return DescribePlayVideoStatisResponse
     */
    CompletableFuture<DescribePlayVideoStatisResponse> describePlayVideoStatis(DescribePlayVideoStatisRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Currently, the service address supports only <strong>China (Shanghai)</strong>.</li>
     * <li>If the interval between the start time and end time is within 7 days, hourly data is returned. If the interval is greater than 7 days, daily data is returned. The maximum interval is 31 days.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodAIData  DescribeVodAIDataRequest
     * @return DescribeVodAIDataResponse
     */
    CompletableFuture<DescribeVodAIDataResponse> describeVodAIData(DescribeVodAIDataRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>The service endpoint currently supports only <strong>China (Shanghai)</strong>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodCertificateList  DescribeVodCertificateListRequest
     * @return DescribeVodCertificateListResponse
     */
    CompletableFuture<DescribeVodCertificateListResponse> describeVodCertificateList(DescribeVodCertificateListRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>The service endpoint for this operation supports only <strong>China East 2 (Shanghai)</strong>.</li>
     * <li>Batch queries are supported. You can query data for up to 500 domain names at a time.</li>
     * <li>If you do not specify StartTime and EndTime, the operation returns data for the last 24 hours by default. If you specify StartTime and EndTime, the operation returns data for the specified time range.
     * <strong>Time granularity of returned data</strong>
     * Based on the time span specified by <code>StartTime</code> and <code>EndTime</code>, if <code>Interval</code> is not specified at the same time, the default time granularity of the returned data, the corresponding time range for querying historical data, and the data latency are as follows:<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range for a single query</th>
     * <th>Time range for querying historical data</th>
     * <th>Data latency</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>Time range for a single query &lt; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time range for a single query &lt; 31 days</td>
     * <td>186 days</td>
     * <td>Generally 3 to 4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>31 days ≤ Time range for a single query ≤ 90 days</td>
     * <td>366 days</td>
     * <td>Generally 4 hours, up to 24 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodDomainBpsData  DescribeVodDomainBpsDataRequest
     * @return DescribeVodDomainBpsDataResponse
     */
    CompletableFuture<DescribeVodDomainBpsDataResponse> describeVodDomainBpsData(DescribeVodDomainBpsDataRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Currently, this operation is supported only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>Batch queries are supported. You can query data of up to 500 domain names at a time.</li>
     * <li>If you do not specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data of the last 24 hours by default. If you specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data of the specified time range.
     * <strong>Time granularity of returned data</strong>
     * If you specify <code>StartTime</code> and <code>EndTime</code> without configuring <code>Interval</code>, the default time granularity, the maximum time range for historical data queries, and the data delay are as follows:<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Maximum time range for historical data queries</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>Time range per query &lt; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time range per query &lt; 31 days</td>
     * <td>186 days</td>
     * <td>Typically 3 to 4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>31 days ≤ Time range per query ≤ 366 days</td>
     * <td>366 days</td>
     * <td>Typically 4 hours, up to 24 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodDomainBpsDataByLayer  DescribeVodDomainBpsDataByLayerRequest
     * @return DescribeVodDomainBpsDataByLayerResponse
     */
    CompletableFuture<DescribeVodDomainBpsDataByLayerResponse> describeVodDomainBpsDataByLayer(DescribeVodDomainBpsDataByLayerRequest request);

    /**
     * <b>description</b> :
     * <p>Currently, the only supported region is <strong>China (Shanghai)</strong>.</p>
     * 
     * @param request the request parameters of DescribeVodDomainCertificateInfo  DescribeVodDomainCertificateInfoRequest
     * @return DescribeVodDomainCertificateInfoResponse
     */
    CompletableFuture<DescribeVodDomainCertificateInfoResponse> describeVodDomainCertificateInfo(DescribeVodDomainCertificateInfoRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Currently, the service address supports only <strong>China (Shanghai)</strong>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodDomainConfigs  DescribeVodDomainConfigsRequest
     * @return DescribeVodDomainConfigsResponse
     */
    CompletableFuture<DescribeVodDomainConfigsResponse> describeVodDomainConfigs(DescribeVodDomainConfigsRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Currently, the service endpoint supports only <strong>China (Shanghai)</strong>.</li>
     * <li>DomainName must be an ApsaraVideo VOD accelerated domain name added to the current account. You can call DescribeVodUserDomains to query the accelerated domain names under the current account. When you add a new domain name for the first time, you must complete DNS or file verification based on the domain ownership verification documentation, and then call AddVodDomain to add the domain name. After the domain name is added, you can call this operation to query the domain name configuration.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodDomainDetail  DescribeVodDomainDetailRequest
     * @return DescribeVodDomainDetailResponse
     */
    CompletableFuture<DescribeVodDomainDetailResponse> describeVodDomainDetail(DescribeVodDomainDetailRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Currently, the endpoint for this API operation supports only <strong>China (Shanghai)</strong>.</li>
     * <li>Batch queries are supported. You can query data for up to 500 domain names at a time.</li>
     * <li>If you do not specify <code>StartTime</code> and <code>EndTime</code>, the API operation returns data for the last 24 hours by default. If you specify <code>StartTime</code> and <code>EndTime</code>, the API operation returns data for the specified time range.
     * <strong>Time granularity of returned data</strong>
     * Based on the time range specified by <code>StartTime</code> and <code>EndTime</code>, if <code>Interval</code> is not specified, the default time granularity of the returned data, the corresponding time range of historical data that can be queried, and the data delay are as follows:<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range for a single query</th>
     * <th>Time range of historical data that can be queried</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>Time range for a single query &lt; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time range for a single query &lt; 31 days</td>
     * <td>186 days</td>
     * <td>Generally 3 to 4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>31 days ≤ Time range for a single query ≤ 366 days</td>
     * <td>366 days</td>
     * <td>Generally 4 hours, up to 24 hours</td>
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
     * <ul>
     * <li>Currently, the only supported service region is <strong>China (Shanghai)</strong>.</li>
     * <li>For details about log formats and latency, refer to <a href="https://help.aliyun.com/document_detail/86099.html">Log Management</a>.</li>
     * <li>If you do not specify StartTime and EndTime, log data from the past 24 hours is returned by default.</li>
     * <li>StartTime and EndTime must be specified together to query logs within the specified time range.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodDomainLog  DescribeVodDomainLogRequest
     * @return DescribeVodDomainLogResponse
     */
    CompletableFuture<DescribeVodDomainLogResponse> describeVodDomainLog(DescribeVodDomainLogRequest request);

    /**
     * <b>description</b> :
     * <p><em>Three query methods:</em>*</p>
     * <ul>
     * <li>If both StartTime and EndTime are specified and the difference between EndTime and StartTime is within 24 hours, the 95th percentile bandwidth for the day of StartTime is queried. Otherwise, the 95th percentile bandwidth for the month of StartTime is queried.</li>
     * <li>If both TimePoint and Cycle are specified, the 95th percentile bandwidth for the cycle of TimePoint is returned.</li>
     * <li>If StartTime and EndTime are specified along with Cycle, the 95th percentile bandwidth for all specified cycles within the query range is returned.
     * If none of these three methods are specified, the 95th percentile bandwidth for the past 24 hours is returned by default.</li>
     * <li>Maximum query time span: 90 days.</li>
     * <li>Minimum query granularity: 1 day.</li>
     * <li>Maximum query time range: 90 days.</li>
     * <li>Rate limit per user: 100 calls per second.</li>
     * <li>Data unit: bit/s.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodDomainMax95BpsData  DescribeVodDomainMax95BpsDataRequest
     * @return DescribeVodDomainMax95BpsDataResponse
     */
    CompletableFuture<DescribeVodDomainMax95BpsDataResponse> describeVodDomainMax95BpsData(DescribeVodDomainMax95BpsDataRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Currently, this operation is supported only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>Maximum call frequency per user: 100 calls per second.</li>
     * <li>If you do not specify StartTime and EndTime, this operation returns data from the last 24 hours. If you specify StartTime and EndTime, this operation returns data for the specified time range.
     * <strong>Supported time granularities</strong>
     * The Interval request parameter supports different data time granularities based on the maximum time range per query. The following table describes the queryable historical data time range and data latency for each time granularity:<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Queryable historical data time range</th>
     * <th>Data latency</th>
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
     * <td>Typically 3-4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>Typically 4 hours, no more than 24 hours</td>
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
     * <ul>
     * <li>Currently, this operation is supported only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>Batch queries are supported. You can query data for up to 500 domain names at a time.</li>
     * <li>If you do not specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data for the last hour by default. If you specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data for the specified time range.
     * <strong>Time granularity of returned data</strong>
     * The time granularity of returned data varies based on the time range specified by <code>StartTime</code> and <code>EndTime</code>. The following table describes the queryable historical data time range and data latency for each time granularity:<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Queryable historical data time range</th>
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
     * <td>1 hour &lt; Time range per query &lt; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time range per query &lt; 31 days</td>
     * <td>186 days</td>
     * <td>Generally 3 to 4 hours</td>
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
     * <ul>
     * <li>Currently, this operation is supported only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>Batch queries are supported. You can query data for up to 100 domain names at a time.</li>
     * <li>If you do not specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data from the last hour by default. If you specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data for the specified time range.
     * <strong>Time granularity of returned data</strong>
     * The time granularity of returned data varies based on the time range specified by <code>StartTime</code> and <code>EndTime</code>. The following table describes the queryable historical data range and data delay for each time granularity:<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Queryable historical data range</th>
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
     * <td>1 hour &lt; Time range per query &lt; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time range per query &lt; 31 days</td>
     * <td>186 days</td>
     * <td>Typically 3 to 4 hours</td>
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
     * <ul>
     * <li>Currently, this operation is available only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>Batch queries are supported. You can query data for up to 20 domain names at a time.</li>
     * <li>The maximum time range per query (the time range between StartTime and EndTime) is 10 minutes, and data is returned at a time granularity of 1 minute.</li>
     * <li>Only data within the last 7 days can be queried.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodDomainRealTimeDetailData  DescribeVodDomainRealTimeDetailDataRequest
     * @return DescribeVodDomainRealTimeDetailDataResponse
     */
    CompletableFuture<DescribeVodDomainRealTimeDetailDataResponse> describeVodDomainRealTimeDetailData(DescribeVodDomainRealTimeDetailDataRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>The endpoint for this operation currently supports only <strong>China (Shanghai)</strong>.</li>
     * <li>Batch queries are supported. You can query data for up to 100 domain names at a time.</li>
     * <li>If you do not specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data for the last hour by default. If you specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data for the specified time range.
     * <strong>Time granularity of returned data</strong>
     * The time granularity of the returned data varies based on the time range specified by <code>StartTime</code> and <code>EndTime</code>. The corresponding queryable historical data range and data latency are as follows:<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range for a single query</th>
     * <th>Queryable historical data range</th>
     * <th>Data latency</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>Time range for a single query ≤ 1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>1 hour &lt; Time range for a single query &lt; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time range for a single query &lt; 31 days</td>
     * <td>186 days</td>
     * <td>Generally 3 to 4 hours</td>
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
     * <ul>
     * <li>Currently, this operation is available only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>Batch queries are supported. You can query data for up to 500 domain names at a time.</li>
     * <li>If you do not specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data from the last hour by default. If you specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data for the specified time range.
     * <strong>Time granularity of returned data</strong>
     * The time granularity of returned data varies based on the time range specified by <code>StartTime</code> and <code>EndTime</code>. The following table describes the queryable historical data range and data delay for each time granularity:<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Queryable historical data range</th>
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
     * <td>1 hour &lt; Time range per query &lt; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time range per query &lt; 31 days</td>
     * <td>186 days</td>
     * <td>Typically 3 to 4 hours</td>
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
     * <ul>
     * <li>Currently, this operation is supported only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>Batch queries are supported. You can query data for up to 100 domain names at a time.</li>
     * <li>If you do not specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data for the last 1 hour by default. If you specify <code>StartTime</code> and <code>EndTime</code>, this operation returns data for the specified time range.</li>
     * <li>The Go language uses the POST method by default. Manually change the request method to GET by declaring <code>request.Method=&quot;GET&quot;</code>.
     * <strong>Time granularity of returned data</strong>
     * The time granularity of returned data varies based on the time range specified by <code>StartTime</code> and <code>EndTime</code>. The following table describes the queryable historical data range and data latency for each time granularity:<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Queryable historical data range</th>
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
     * <td>1 hour &lt; Time range per query &lt; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time range per query &lt; 31 days</td>
     * <td>186 days</td>
     * <td>Typically 3 to 4 hours</td>
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
     * <ul>
     * <li>Currently, the endpoint for this operation only supports <strong>China (Shanghai)</strong>.</li>
     * <li>Supports batch queries. You can query the data of up to 100 domain names at a time.</li>
     * <li>If you do not specify <code>StartTime</code> and <code>EndTime</code>, this operation returns the data of the last hour by default. If you specify <code>StartTime</code> and <code>EndTime</code>, this operation returns the data within the specified time range.
     * <strong>Time granularity of returned data</strong>
     * The time granularity of the returned data varies based on the time range specified by <code>StartTime</code> and <code>EndTime</code>. The corresponding historical data time range and data latency are as follows:<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range for a single query</th>
     * <th>Historical data time range</th>
     * <th>Data latency</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>Time range for a single query ≤ 1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>1 hour &lt; Time range for a single query &lt; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time range for a single query &lt; 31 days</td>
     * <td>186 days</td>
     * <td>Generally 3 to 4 hours</td>
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
     * <ul>
     * <li>Currently, the endpoint for this API operation supports only <strong>China (Shanghai)</strong>.</li>
     * <li>Batch queries are supported. You can query data for up to 500 domain names at a time.</li>
     * <li>If you do not specify StartTime and EndTime, this API operation returns data for the last 24 hours by default. If you specify StartTime and EndTime, this API operation returns data for the specified time range.
     * <strong>Returned data time granularity</strong>
     * Based on the time span specified by <code>StartTime</code> and <code>EndTime</code>, if <code>Interval</code> is not specified, the default data time granularity, the corresponding time range of historical data that can be queried, and the data delay are as follows:<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time span for a single query</th>
     * <th>Time range of historical data that can be queried</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>Time span for a single query &lt; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time span for a single query &lt; 31 days</td>
     * <td>186 days</td>
     * <td>Generally 3 to 4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>31 days ≤ Time span for a single query ≤ 90 days</td>
     * <td>366 days</td>
     * <td>Generally 4 hours, up to 24 hours</td>
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
     * <ul>
     * <li>Currently, the endpoint for this API operation only supports <strong>China (Shanghai)</strong>.</li>
     * <li>Supports batch queries. You can query data for up to 500 domain names at a time.</li>
     * <li>If you do not specify StartTime and EndTime, this API operation returns data for the last 24 hours by default. If you specify StartTime and EndTime, this API operation returns data for the specified time period.
     * <strong>Time granularity of the returned data timestamp</strong>
     * If you do not specify the Interval Settings, the default time granularity of the returned data timestamp, the queryable time range of historical data, and the data delay vary based on the time span specified by StartTime and EndTime. The details are as follows:<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time span for a single query</th>
     * <th>Time range of queryable historical data</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>Time span for a single query &lt; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time span for a single query &lt; 31 days</td>
     * <td>186 days</td>
     * <td>Generally 3 to 4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>31 days ≤ Time span for a single query ≤ 366 days</td>
     * <td>366 days</td>
     * <td>Generally 4 hours, up to 24 hours</td>
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
     * <ul>
     * <li>Currently, the endpoint for this API operation supports only <strong>China (Shanghai)</strong>.</li>
     * <li>Batch queries are supported. You can query data for up to 500 domain names at a time.</li>
     * <li>If you do not specify StartTime and EndTime, this API operation returns data for the last 24 hours by default. If you specify StartTime and EndTime, this API operation returns data for the specified time range.
     * <strong>Time granularity of returned data timestamps</strong>
     * If you do not specify the Interval Settings, the default time granularity of the returned data timestamps, the time range of historical data that can be queried, and the data delay vary based on the time span between StartTime and EndTime. The details are as follows:<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time span per query</th>
     * <th>Time range of queryable historical data</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>Time span per query &lt; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time span per query &lt; 31 days</td>
     * <td>186 days</td>
     * <td>Typically 3 to 4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>31 days ≤ Time span per query ≤ 366 days</td>
     * <td>366 days</td>
     * <td>Typically 4 hours, up to 24 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodDomainSrcTrafficData  DescribeVodDomainSrcTrafficDataRequest
     * @return DescribeVodDomainSrcTrafficDataResponse
     */
    CompletableFuture<DescribeVodDomainSrcTrafficDataResponse> describeVodDomainSrcTrafficData(DescribeVodDomainSrcTrafficDataRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Currently, the endpoint for this operation is supported only in <strong>China (Shanghai)</strong>.</li>
     * <li>Batch queries are supported. You can query data for up to 500 domain names at a time.</li>
     * <li>If you do not specify StartTime and EndTime, this operation returns data for the last 24 hours by default. If you specify StartTime and EndTime, this operation returns data for the specified time range.
     * <strong>Time granularity of returned data</strong>
     * Based on the time span between the specified <code>StartTime</code> and <code>EndTime</code>, and when <code>Interval</code> is not specified, the default time granularity of the returned data, the corresponding time range for querying historical data, and the data latency are as follows:<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time span per query</th>
     * <th>Time range for querying historical data</th>
     * <th>Data latency</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>Time span per query &lt; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time span per query &lt; 31 days</td>
     * <td>186 days</td>
     * <td>Typically 3 to 4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>31 days ≤ Time span per query ≤ 366 days</td>
     * <td>366 days</td>
     * <td>Typically 4 hours, up to 24 hours</td>
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
     * <ul>
     * <li>Currently, the only supported service region is <strong>China (Shanghai)</strong>.</li>
     * <li>Batch domain name queries are supported. Separate multiple domain names with commas (,). You can query up to 100 domain names at a time. If this parameter is left empty, data for all domain names under the account is returned.</li>
     * <li>You can query data for up to the last year. The maximum time span for a single query is 3 months. If the query time range is 1 to 3 days, data is returned at hourly granularity. If the query time range is 4 days or more, data is returned at daily granularity.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodDomainUsageData  DescribeVodDomainUsageDataRequest
     * @return DescribeVodDomainUsageDataResponse
     */
    CompletableFuture<DescribeVodDomainUsageDataResponse> describeVodDomainUsageData(DescribeVodDomainUsageDataRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Single user call frequency: 10 calls per second.
     * <strong>Supported time granularities</strong>:
     * The adaptive time granularity and the maximum time range for historical data queries vary based on the maximum time span per query.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time span per query</th>
     * <th>Maximum time range for historical data queries</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 hour</td>
     * <td>7 days</td>
     * <td>31 days</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>31 days</td>
     * <td>366 days</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodEditingUsageData  DescribeVodEditingUsageDataRequest
     * @return DescribeVodEditingUsageDataResponse
     */
    CompletableFuture<DescribeVodEditingUsageDataResponse> describeVodEditingUsageData(DescribeVodEditingUsageDataRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Currently, this operation is available only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>Only playback data collected by ApsaraVideo Player SDK is supported. Traffic statistics for audio-only streams are not supported.</li>
     * <li>Only data within the last 30 days can be queried.<blockquote>
     * <p>Notice: - Before calling this operation, make sure that ApsaraVideo Player SDK meets the following conditions:</p>
     * </blockquote>
     * <ul>
     * <li>Android Player SDK or iOS Player SDK<ul>
     * <li>The Player SDK version is 5.4.9.2 or later.</li>
     * <li>A License for the Player SDK has been obtained and integrated. For more information, see <a href="https://help.aliyun.com/document_detail/469166.html">License management</a>.</li>
     * <li>The event tracking log reporting feature of the Player SDK is enabled. By default, this feature is enabled in ApsaraVideo Player SDK. For more information, see <a href="~~311525#section-dc4-gp6-xk2~~">Create a player for Android</a> and <a href="~~313855#section-cmf-k7d-jg5~~">Create a player for iOS</a>.</li>
     * </ul>
     * </li>
     * <li>Web Player SDK<ul>
     * <li>The Player SDK version is 2.16.0 or later.</li>
     * <li>A License for <strong>Playback Quality Monitoring</strong> has been obtained and integrated. Submit the <a href="https://yida.alibaba-inc.com/o/webplayer#/">Web Player SDK value-added service application form</a> to apply. For the License integration method, see the <code>license</code> property in <a href="~~125572#section-3ty-gwp-6pa~~">Web SDK API reference</a>.</li>
     * <li>The event tracking log reporting feature of the Player SDK is enabled. By default, this feature is enabled in ApsaraVideo Player SDK.</li>
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
     * @param request the request parameters of DescribeVodPlayerCollectData  DescribeVodPlayerCollectDataRequest
     * @return DescribeVodPlayerCollectDataResponse
     */
    CompletableFuture<DescribeVodPlayerCollectDataResponse> describeVodPlayerCollectData(DescribeVodPlayerCollectDataRequest request);

    /**
     * @param request the request parameters of DescribeVodPlayerDimensionData  DescribeVodPlayerDimensionDataRequest
     * @return DescribeVodPlayerDimensionDataResponse
     */
    CompletableFuture<DescribeVodPlayerDimensionDataResponse> describeVodPlayerDimensionData(DescribeVodPlayerDimensionDataRequest request);

    /**
     * @param request the request parameters of DescribeVodPlayerMetricData  DescribeVodPlayerMetricDataRequest
     * @return DescribeVodPlayerMetricDataResponse
     */
    CompletableFuture<DescribeVodPlayerMetricDataResponse> describeVodPlayerMetricData(DescribeVodPlayerMetricDataRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Currently, this operation is supported only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>The maximum time range for a single query (the time range between StartTime and EndTime) is 1 hour.
     * <strong>Supported time granularities</strong>
     * Based on the time range specified by <code>StartTime</code> and <code>EndTime</code>, the default data timestamp granularity, queryable historical data range, and data latency are as follows:<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Queryable historical data range</th>
     * <th>Data latency</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>≤ 1 hour</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodRangeDataByLocateAndIspService  DescribeVodRangeDataByLocateAndIspServiceRequest
     * @return DescribeVodRangeDataByLocateAndIspServiceResponse
     */
    CompletableFuture<DescribeVodRangeDataByLocateAndIspServiceResponse> describeVodRangeDataByLocateAndIspService(DescribeVodRangeDataByLocateAndIspServiceRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Currently, the service address supports only <strong>China (Shanghai)</strong>.</li>
     * <li>Purge and prefetch operations include the <a href="https://help.aliyun.com/document_detail/69215.html">RefreshVodObjectCaches</a> purge operation and the <a href="https://help.aliyun.com/document_detail/69211.html">PreloadVodObjectCaches</a> prefetch operation.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodRefreshQuota  DescribeVodRefreshQuotaRequest
     * @return DescribeVodRefreshQuotaResponse
     */
    CompletableFuture<DescribeVodRefreshQuotaResponse> describeVodRefreshQuota(DescribeVodRefreshQuotaRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Currently, the service endpoint supports only <strong>China (Shanghai)</strong>.</li>
     * <li>If neither TaskId nor ObjectPath is specified, the system queries the first page of data (20 entries) generated within the last three days by default. You can specify both TaskId and ObjectPath at the same time.</li>
     * <li>If you specify DomainName or Status, ObjectType is required.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodRefreshTasks  DescribeVodRefreshTasksRequest
     * @return DescribeVodRefreshTasksResponse
     */
    CompletableFuture<DescribeVodRefreshTasksResponse> describeVodRefreshTasks(DescribeVodRefreshTasksRequest request);

    /**
     * <b>description</b> :
     * <p>This operation currently supports only the <strong>China (Shanghai)</strong> region.</p>
     * 
     * @param request the request parameters of DescribeVodSSLCertificateList  DescribeVodSSLCertificateListRequest
     * @return DescribeVodSSLCertificateListResponse
     */
    CompletableFuture<DescribeVodSSLCertificateListResponse> describeVodSSLCertificateList(DescribeVodSSLCertificateListRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Currently, the service address supports only <strong>China (Shanghai)</strong>.</li>
     * <li>If the interval between the start time and end time is within 7 days, hourly data is returned. If the interval is greater than 7 days, daily data is returned. The maximum interval is 31 days.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodStorageData  DescribeVodStorageDataRequest
     * @return DescribeVodStorageDataResponse
     */
    CompletableFuture<DescribeVodStorageDataResponse> describeVodStorageData(DescribeVodStorageDataRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Currently, the service is available only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>If the query time range is within 7 days, hourly data is returned. If the query time range is greater than 7 days, daily data is returned. The maximum time range is 31 days.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodTieringStorageData  DescribeVodTieringStorageDataRequest
     * @return DescribeVodTieringStorageDataResponse
     */
    CompletableFuture<DescribeVodTieringStorageDataResponse> describeVodTieringStorageData(DescribeVodTieringStorageDataRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>Currently, the service address supports only <strong>China (Shanghai)</strong>.</li>
     * <li>If the query time interval is within 7 days, data at the hour granularity is returned. If the query time interval is greater than 7 days, data at the day granularity is returned. The maximum interval is 31 days.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeVodTieringStorageRetrievalData  DescribeVodTieringStorageRetrievalDataRequest
     * @return DescribeVodTieringStorageRetrievalDataResponse
     */
    CompletableFuture<DescribeVodTieringStorageRetrievalDataResponse> describeVodTieringStorageRetrievalData(DescribeVodTieringStorageRetrievalDataRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Currently, the only supported service region is <strong>China (Shanghai)</strong>.</li>
     * <li>If the interval between the start time and end time is within 7 days, hourly data is returned. If the interval is greater than 7 days, daily data is returned. The maximum interval is 31 days.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodTranscodeData  DescribeVodTranscodeDataRequest
     * @return DescribeVodTranscodeDataResponse
     */
    CompletableFuture<DescribeVodTranscodeDataResponse> describeVodTranscodeData(DescribeVodTranscodeDataRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Supports fuzzy match filtering and domain name status filtering.</li>
     * <li>This operation is currently available only in the following region: <strong>China (Shanghai)</strong>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodUserDomains  DescribeVodUserDomainsRequest
     * @return DescribeVodUserDomainsResponse
     */
    CompletableFuture<DescribeVodUserDomainsResponse> describeVodUserDomains(DescribeVodUserDomainsRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is supported only in the China (Shanghai) region.</p>
     * 
     * @param request the request parameters of DescribeVodUserVipsByDomain  DescribeVodUserVipsByDomainRequest
     * @return DescribeVodUserVipsByDomainResponse
     */
    CompletableFuture<DescribeVodUserVipsByDomainResponse> describeVodUserVipsByDomain(DescribeVodUserVipsByDomainRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Currently, this operation is supported only in the <strong>China (Shanghai)</strong> region.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodVerifyContent  DescribeVodVerifyContentRequest
     * @return DescribeVodVerifyContentResponse
     */
    CompletableFuture<DescribeVodVerifyContentResponse> describeVodVerifyContent(DescribeVodVerifyContentRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: Each Resource Access Management (RAM) user or RAM role can be granted permissions for up to 10 applications.</p>
     * </blockquote>
     * <ul>
     * <li>If the policy name is <strong>VODAppAdministratorAccess</strong>, <strong>AppId</strong> is optional. For other policies, <strong>AppId</strong> is required.</li>
     * </ul>
     * 
     * @param request the request parameters of DetachAppPolicyFromIdentity  DetachAppPolicyFromIdentityRequest
     * @return DetachAppPolicyFromIdentityResponse
     */
    CompletableFuture<DetachAppPolicyFromIdentityResponse> detachAppPolicyFromIdentity(DetachAppPolicyFromIdentityRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>To use the secure download feature, you must first enable the download feature and set the download method to secure download in the ApsaraVideo VOD console. For more information, see <a href="https://help.aliyun.com/document_detail/86107.html">Download settings</a>.</li>
     * <li>After generating a key for secure download, you must configure the key in ApsaraVideo Player SDK. For more information, see <a href="https://help.aliyun.com/document_detail/124735.html">Secure download</a>.</li>
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
     * <ul>
     * <li>This operation is supported in the following regions: <strong>China (Beijing)</strong> and <strong>China (Shanghai)</strong>.</li>
     * <li>Submit an AI image processing task by calling the <a href="~~SubmitAIImageJob~~">SubmitAIImageJob</a> operation, and then call this operation to query the list of AI image tasks.</li>
     * <li>You can query up to 10 AI image processing tasks at a time.</li>
     * </ul>
     * 
     * @param request the request parameters of GetAIImageJobs  GetAIImageJobsRequest
     * @return GetAIImageJobsResponse
     */
    CompletableFuture<GetAIImageJobsResponse> getAIImageJobs(GetAIImageJobsRequest request);

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li>This operation is supported only in the Singapore region.</li>
     * <li>Image resources in the results of automated review jobs are retained in the free storage provided by ApsaraVideo VOD for only two weeks. They are automatically deleted after two weeks.</li>
     * </ul>
     * 
     * @param request the request parameters of GetAIMediaAuditJob  GetAIMediaAuditJobRequest
     * @return GetAIMediaAuditJobResponse
     */
    CompletableFuture<GetAIMediaAuditJobResponse> getAIMediaAuditJob(GetAIMediaAuditJobRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Currently, this operation is supported in the following regions: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</li>
     * <li>Obtain the AI template ID first, and then call this operation to query the configuration information of the AI template.</li>
     * </ul>
     * 
     * @param request the request parameters of GetAITemplate  GetAITemplateRequest
     * @return GetAITemplateResponse
     */
    CompletableFuture<GetAITemplateResponse> getAITemplate(GetAITemplateRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is supported in the following regions: <strong>China (Beijing)</strong> and <strong>China (Shanghai)</strong>.</li>
     * <li>Retrieves smart tagging results by video ID.</li>
     * </ul>
     * 
     * @param request the request parameters of GetAIVideoTagResult  GetAIVideoTagResultRequest
     * @return GetAIVideoTagResultResponse
     */
    CompletableFuture<GetAIVideoTagResultResponse> getAIVideoTagResult(GetAIVideoTagResultRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Batch queries are supported.</li>
     * <li>AppIds supports a maximum of 10 IDs.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 100 calls per second. If the limit is exceeded, the API call is throttled, which may affect your business. Call this operation appropriately. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of GetAppInfos  GetAppInfosRequest
     * @return GetAppInfosResponse
     */
    CompletableFuture<GetAppInfosResponse> getAppInfos(GetAppInfosRequest request);

    /**
     * @param request the request parameters of GetAppPlayKey  GetAppPlayKeyRequest
     * @return GetAppPlayKeyResponse
     */
    CompletableFuture<GetAppPlayKeyResponse> getAppPlayKey(GetAppPlayKeyRequest request);

    /**
     * <b>description</b> :
     * <p>You can retrieve the information of up to 20 auxiliary media assets at a time.</p>
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
     * <ul>
     * <li>Currently, the service address of this operation only supports: <strong>China (Shanghai)</strong>.</li>
     * <li>Only data within the past 90 days can be queried (data starts from April 29, 2025).</li>
     * <li>The traffic data provided by this operation is raw traffic data. To align with billing traffic, multiply the data by a TCP coefficient of 1.1.</li>
     * </ul>
     * 
     * @param request the request parameters of GetDailyPlayRegionStatis  GetDailyPlayRegionStatisRequest
     * @return GetDailyPlayRegionStatisResponse
     */
    CompletableFuture<GetDailyPlayRegionStatisResponse> getDailyPlayRegionStatis(GetDailyPlayRegionStatisRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This API operation is supported in the following regions: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</li>
     * <li>Currently, you can only query the default AI template for automated review.</li>
     * </ul>
     * 
     * @param request the request parameters of GetDefaultAITemplate  GetDefaultAITemplateRequest
     * @return GetDefaultAITemplateResponse
     */
    CompletableFuture<GetDefaultAITemplateResponse> getDefaultAITemplate(GetDefaultAITemplateRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This API operation is available only in the China (Shanghai) and China (Beijing) regions.</li>
     * <li>After you invoke the <a href="~~SubmitDigitalWatermarkExtractJob~~">SubmitDigitalWatermarkExtractJob</a> operation to extract the copyright watermark or tracing watermark from a video, invoke this operation to query the extracted watermark text.</li>
     * <li>You can query only the watermark extraction jobs created within the last two years.</li>
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
     * <p>During the editing process, materials can be added to the timeline, but they are not necessarily fully used.</p>
     * 
     * @param request the request parameters of GetEditingProjectMaterials  GetEditingProjectMaterialsRequest
     * @return GetEditingProjectMaterialsResponse
     */
    CompletableFuture<GetEditingProjectMaterialsResponse> getEditingProjectMaterials(GetEditingProjectMaterialsRequest request);

    /**
     * <b>description</b> :
     * <p>This operation only supports querying image information for images uploaded to ApsaraVideo VOD. To query snapshot information generated from video snapshots, call the <a href="~~ListSnapshots~~">ListSnapshots</a> operation.</p>
     * 
     * @param request the request parameters of GetImageInfo  GetImageInfoRequest
     * @return GetImageInfoResponse
     */
    CompletableFuture<GetImageInfoResponse> getImageInfo(GetImageInfoRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation only supports querying image information for images uploaded to ApsaraVideo VOD. To query snapshot information generated from video snapshots, call the <a href="~~ListSnapshots~~">ListSnapshots</a> operation.</li>
     * <li>You can query information about up to 20 images at a time.</li>
     * </ul>
     * 
     * @param request the request parameters of GetImageInfos  GetImageInfosRequest
     * @return GetImageInfosResponse
     */
    CompletableFuture<GetImageInfosResponse> getImageInfos(GetImageInfosRequest request);

    /**
     * <b>description</b> :
     * <p><em>Usage notes</em>*
     * This operation only supports querying asynchronous task data within the last 6 months. Queryable task types include transcoding tasks, snapshot tasks, AI tasks, and workflow tasks.
     * <strong>QPS limit</strong>
     * The QPS limit for a single user calling this operation is 15 queries per second. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable frequency. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of GetJobDetail  GetJobDetailRequest
     * @return GetJobDetailResponse
     */
    CompletableFuture<GetJobDetailResponse> getJobDetail(GetJobDetailRequest request);

    /**
     * @param request the request parameters of GetMediaAiAnalysis  GetMediaAiAnalysisRequest
     * @return GetMediaAiAnalysisResponse
     */
    CompletableFuture<GetMediaAiAnalysisResponse> getMediaAiAnalysis(GetMediaAiAnalysisRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>&lt;props=&quot;china&quot;&gt;After the automated review is completed, if you have configured the <a href="https://help.aliyun.com/document_detail/89576.html">Automated review completed</a> event notification, the system sends a callback notification to the callback URL. You can call this operation to query the details of the audio review results.
     * &lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li>This operation is supported only in the Singapore region.</li>
     * <li>After the automated review is completed, if you have configured the <a href="https://help.aliyun.com/document_detail/89576.html">Automated review completed</a> event notification, the system sends a callback notification to the callback URL. You can call this operation to query the details of the audio review results.</li>
     * </ul>
     * 
     * @param request the request parameters of GetMediaAuditAudioResultDetail  GetMediaAuditAudioResultDetailRequest
     * @return GetMediaAuditAudioResultDetailResponse
     */
    CompletableFuture<GetMediaAuditAudioResultDetailResponse> getMediaAuditAudioResultDetail(GetMediaAuditAudioResultDetailRequest request);

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <h3>Usage notes</h3>
     * <p>This operation is supported only in the Singapore region.</p>
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit per user for this operation is 20. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable rate. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of GetMediaAuditResult  GetMediaAuditResultRequest
     * @return GetMediaAuditResultResponse
     */
    CompletableFuture<GetMediaAuditResultResponse> getMediaAuditResult(GetMediaAuditResultRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>By default, only the details of snapshots that are flagged as violations or suspected violations are returned. Results cannot be queried for videos and images that do not contain violations.</li>
     * <li>Image resources in review results are retained in the free storage provided by ApsaraVideo VOD for only two weeks. They are automatically deleted after two weeks.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>This operation is supported only in the Singapore region.</li>
     * </ul>
     * 
     * @param request the request parameters of GetMediaAuditResultDetail  GetMediaAuditResultDetailRequest
     * @return GetMediaAuditResultDetailResponse
     */
    CompletableFuture<GetMediaAuditResultDetailResponse> getMediaAuditResultDetail(GetMediaAuditResultDetailRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>By default, only screenshot details for violations and suspected violations are returned. No results are returned for compliant videos and images.
     * &lt;props=&quot;intl&quot;&gt;
     * This operation is supported only in the Singapore region.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetMediaAuditResultTimeline  GetMediaAuditResultTimelineRequest
     * @return GetMediaAuditResultTimelineResponse
     */
    CompletableFuture<GetMediaAuditResultTimelineResponse> getMediaAuditResultTimeline(GetMediaAuditResultTimelineRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is supported in the following regions: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</p>
     * 
     * @param request the request parameters of GetMediaDNAResult  GetMediaDNAResultRequest
     * @return GetMediaDNAResultResponse
     */
    CompletableFuture<GetMediaDNAResultResponse> getMediaDNAResult(GetMediaDNAResultRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>You can query the task information of all audio and video files under a refresh or prefetch task, or specify a single audio or video file to query its task information.</p>
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit for a single user calling this API operation is 50. If the limit is exceeded, API calls are throttled, which may affect your services. Make API calls at a reasonable rate. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of GetMediaRefreshJobs  GetMediaRefreshJobsRequest
     * @return GetMediaRefreshJobsResponse
     */
    CompletableFuture<GetMediaRefreshJobsResponse> getMediaRefreshJobs(GetMediaRefreshJobsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/55627.html">Event notification development guide</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetMessageCallback  GetMessageCallbackRequest
     * @return GetMessageCallbackResponse
     */
    CompletableFuture<GetMessageCallbackResponse> getMessageCallback(GetMessageCallbackRequest request);

    /**
     * <b>description</b> :
     * <p>You can retrieve the complete source file information only after a video or audio stream is transcoded.</p>
     * 
     * @param request the request parameters of GetMezzanineInfo  GetMezzanineInfoRequest
     * @return GetMezzanineInfoResponse
     */
    CompletableFuture<GetMezzanineInfoResponse> getMezzanineInfo(GetMezzanineInfoRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Before you invoke this operation, make sure that you fully understand the billing methods and pricing of ApsaraVideo VOD. Downloading or playing videos directly from the playback URL of ApsaraVideo VOD incurs outbound traffic fees. If no accelerated domain name is configured, refer to <a href="~~188308#section-rwh-e88-f7j~~">Billing of storage outbound traffic</a>. If an accelerated domain name is configured, refer to <a href="~~188308#section-c5t-oq9-15e~~">Billing of acceleration services</a>. If you have enabled storage transfer acceleration, downloading or playing videos directly from the playback URL of ApsaraVideo VOD also incurs download acceleration fees. For billing details, refer to <a href="~~188310#section_sta_zm2_tsv~~">Billing of storage transfer acceleration</a>.</strong></li>
     * <li>Only videos in the Normal status (the value of the Status field is Normal) can be played normally. For more information about the playback instructions and limits of playback URLs, refer to <a href="https://help.aliyun.com/document_detail/57290.html">Media playback</a>.</li>
     * <li>When the <a href="https://help.aliyun.com/document_detail/2392368.html">media asset storage</a> type is non-standard storage, you must configure the StorageClass field in the PlayConfig parameter accordingly. For more information, refer to <a href="~~86952#section-9g7-s9b-v7z~~">PlayConfig</a>.</li>
     * <li>If video playback is abnormal, you can invoke the <a href="~~GetMezzanineInfo~~">GetMezzanineInfo</a> operation to check whether the information about the video source file is correct.
     * &lt;props=&quot;china&quot;&gt;</li>
     * <li>To invoke this operation to generate an m3u8 tracing watermark video stream, submit a ticket to apply for activation. For more information about how to submit a ticket, refer to <a href="https://help.aliyun.com/document_detail/464625.html">Contact us</a>. For more information about tracing watermarks, refer to <a href="https://help.aliyun.com/document_detail/2527021.html">Digital watermarking</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of GetPlayInfo  GetPlayInfoRequest
     * @return GetPlayInfoResponse
     */
    CompletableFuture<GetPlayInfoResponse> getPlayInfo(GetPlayInfoRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Because an audio or video file may be transcoded multiple times, this operation returns only the most recent transcoding summary.</li>
     * <li>Batch queries are supported. You can query the transcoding summaries of up to 10 audio or video files at a time.</li>
     * <li>To query historical transcoding task information, call the <a href="https://help.aliyun.com/document_detail/109120.html">ListTranscodeTask</a> operation.</li>
     * <li><strong>This operation supports querying transcoding task data only within the last year.</strong></li>
     * </ul>
     * 
     * @param request the request parameters of GetTranscodeSummary  GetTranscodeSummaryRequest
     * @return GetTranscodeSummaryResponse
     */
    CompletableFuture<GetTranscodeSummaryResponse> getTranscodeSummary(GetTranscodeSummaryRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p><strong>This operation only supports querying transcoding task data within the last year.</strong></p>
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit for a single user calling this operation is 15. If the limit is exceeded, API calls are throttled, which may affect your services. Make API calls at a reasonable rate. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of GetTranscodeTask  GetTranscodeTaskRequest
     * @return GetTranscodeTaskResponse
     */
    CompletableFuture<GetTranscodeTaskResponse> getTranscodeTask(GetTranscodeTaskRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the information about a single template group and returns the configuration information of all transcoding templates in the template group.</p>
     * 
     * @param request the request parameters of GetTranscodeTemplateGroup  GetTranscodeTemplateGroupRequest
     * @return GetTranscodeTemplateGroupResponse
     */
    CompletableFuture<GetTranscodeTemplateGroupResponse> getTranscodeTemplateGroup(GetTranscodeTemplateGroupRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Retrieves URL upload information by using the JobId returned during URL upload or the URL used for upload. The information includes the URL upload status, UserData, creation time, and completion time.</li>
     * <li><strong>This operation only supports querying upload task data within the last year.</strong></li>
     * <li>This operation is currently available only in the following regions: <strong>China (Shanghai)</strong> and <strong>Singapore</strong>.</li>
     * <li>After you call the <a href="~~UploadMediaByURL~~">UploadMediaByURL</a> operation to upload media files to ApsaraVideo VOD, you can call this operation to query the upload information of specified media files by using the URL pull upload task IDs (JobIds) or the media source file URLs (UploadURLs).</li>
     * <li>When you call this operation, you must specify either JobIds or UploadURLs. If both are specified, only JobIds is processed.</li>
     * <li>If a media file fails to be uploaded, you can call this operation to view the error code and error message. If a media file is uploaded, you can call this operation to view the corresponding media ID.</li>
     * </ul>
     * 
     * @param request the request parameters of GetURLUploadInfos  GetURLUploadInfosRequest
     * @return GetURLUploadInfosResponse
     */
    CompletableFuture<GetURLUploadInfosResponse> getURLUploadInfos(GetURLUploadInfosRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation only supports querying the upload details of audio and video files.</li>
     * <li>If the audio or video file is uploaded through the ApsaraVideo VOD console, you can obtain information such as the upload ratio by calling this operation. If the audio or video file is uploaded by using an SDK, you can obtain the upload details only if the <a href="https://help.aliyun.com/document_detail/52200.html">upload SDK</a> meets the following requirements.<blockquote>
     * <p>Only server-the upload SDKs support this operation. Client-the upload SDKs do not support this operation. The server-the upload SDK versions that support this operation are as follows:</p>
     * <ul>
     * <li>Java upload SDK: 1.4.4 or later</li>
     * <li>C++ upload SDK: 1.0.0 or later</li>
     * <li>PHP upload SDK: 1.0.2 or later</li>
     * <li>Python upload SDK: 1.3.0 or later</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user is 100 calls per second. If the number of calls per second exceeds the limit, throttling is triggered, which may affect your business. Call this operation at a reasonable frequency. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of GetUploadDetails  GetUploadDetailsRequest
     * @return GetUploadDetailsResponse
     */
    CompletableFuture<GetUploadDetailsResponse> getUploadDetails(GetUploadDetailsRequest request);

    /**
     * <b>description</b> :
     * <p>After an audio or video file is uploaded, ApsaraVideo VOD analyzes the uploaded source file. Therefore, media asset information is generated asynchronously. You can configure <a href="https://help.aliyun.com/document_detail/55627.html">event notifications</a> for <a href="https://help.aliyun.com/document_detail/99935.html">audio and video analysis completion</a>. After receiving the event notification for <a href="https://help.aliyun.com/document_detail/99935.html">audio and video analysis completion</a>, call this operation to retrieve the audio or video information.</p>
     * 
     * @param request the request parameters of GetVideoInfo  GetVideoInfoRequest
     * @return GetVideoInfoResponse
     */
    CompletableFuture<GetVideoInfoResponse> getVideoInfo(GetVideoInfoRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can retrieve information about up to 20 audio and video files at a time.</li>
     * <li>After an audio or video file is uploaded, ApsaraVideo VOD analyzes the uploaded source file. Therefore, media asset information is generated asynchronously. You can configure the <a href="https://help.aliyun.com/document_detail/99935.html">AudioVideoAnalysisComplete</a> <a href="https://help.aliyun.com/document_detail/55627.html">event notification</a>. After you receive the <a href="https://help.aliyun.com/document_detail/99935.html">AudioVideoAnalysisComplete</a> event notification, call this operation to retrieve the audio and video information.</li>
     * </ul>
     * 
     * @param request the request parameters of GetVideoInfos  GetVideoInfosRequest
     * @return GetVideoInfosResponse
     */
    CompletableFuture<GetVideoInfosResponse> getVideoInfos(GetVideoInfosRequest request);

    /**
     * <b>description</b> :
     * <p>This operation retrieves up to the first <strong>5,000</strong> audio and video assets that match specified filter conditions, such as video status and category ID. Specify StartTime and EndTime to retrieve data in batches. To query more audio and video assets or traverse all audio and video information, refer to <a href="https://help.aliyun.com/document_detail/86044.html">Search for media assets</a>.</p>
     * 
     * @param request the request parameters of GetVideoList  GetVideoListRequest
     * @return GetVideoListResponse
     */
    CompletableFuture<GetVideoListResponse> getVideoList(GetVideoListRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>When using ApsaraVideo Player SDK (applicable to the PlayAuth playback method), call this operation to obtain the playback credential. ApsaraVideo Player SDK uses the playback credential to automatically obtain the playback URL for playback. For more information, see <a href="https://help.aliyun.com/document_detail/125579.html">ApsaraVideo Player SDK</a>.</li>
     * <li>If the playback credential expires, the playback URL cannot be obtained. You must obtain a new playback credential.</li>
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
     * <ul>
     * <li><strong>Before calling this operation, make sure that you fully understand the billing methods and pricing of ApsaraVideo VOD. Using workflows may incur fees for transcoding, encryption, and automated review. For more information, see <a href="https://help.aliyun.com/document_detail/188307.html">ApsaraVideo VOD billing overview</a>.</strong></li>
     * <li>After you call the SubmitWorkflowJob operation to submit a workflow task, you can pass the returned task ID to this operation to query the execution status and result of the task.</li>
     * <li>This operation currently supports only querying video understanding workflow tasks. Querying tasks of other workflow versions is not supported.</li>
     * </ul>
     * 
     * @param request the request parameters of GetWorkflowTask  GetWorkflowTaskRequest
     * @return GetWorkflowTaskResponse
     */
    CompletableFuture<GetWorkflowTaskResponse> getWorkflowTask(GetWorkflowTaskRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Currently, this operation is supported in the following regions: <strong>China (Beijing)</strong> and <strong>China (Shanghai)</strong>.</li>
     * <li>This operation can query AI image information of only a single video. <strong>Batch queries are not supported</strong>.</li>
     * </ul>
     * 
     * @param request the request parameters of ListAIImageInfo  ListAIImageInfoRequest
     * @return ListAIImageInfoResponse
     */
    CompletableFuture<ListAIImageInfoResponse> listAIImageInfo(ListAIImageInfoRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Regions supported by media fingerprint: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</li>
     * <li>Regions supported by smart tagging: <strong>China (Beijing)</strong> and <strong>China (Shanghai)</strong>.</li>
     * </ul>
     * 
     * @param request the request parameters of ListAIJob  ListAIJobRequest
     * @return ListAIJobResponse
     */
    CompletableFuture<ListAIJobResponse> listAIJob(ListAIJobRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Currently, this operation is supported in the following regions: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</li>
     * <li>You can call this operation to query the list of AI templates of a specified type.</li>
     * </ul>
     * 
     * @param request the request parameters of ListAITemplate  ListAITemplateRequest
     * @return ListAITemplateResponse
     */
    CompletableFuture<ListAITemplateResponse> listAITemplate(ListAITemplateRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>You can filter applications by application status.</p>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 30 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call this operation properly. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of ListAppInfo  ListAppInfoRequest
     * @return ListAppInfoResponse
     */
    CompletableFuture<ListAppInfoResponse> listAppInfo(ListAppInfoRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>The <strong>IdentityType</strong> and <strong>IdentityName</strong> parameters take effect only when the caller invokes this operation with administrator permissions. Otherwise, only the application access policies granted to the current account identity are returned.</li>
     * </ul>
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
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>After animated image capturing for a video is complete, call this operation to obtain the animated image information of the video.</li>
     * <li>Animated image tasks can be initiated by calling an API operation (<a href="https://help.aliyun.com/document_detail/186842.html">SubmitDynamicImageJob</a>) or by using the console. For more information, see <a href="https://help.aliyun.com/document_detail/177484.html">Animated images</a>.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user for this operation is 100 calls per second. If the limit is exceeded, the API call is throttled, which may affect your business. Call this operation appropriately. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of ListDynamicImage  ListDynamicImageRequest
     * @return ListDynamicImageResponse
     */
    CompletableFuture<ListDynamicImageResponse> listDynamicImage(ListDynamicImageRequest request);

    /**
     * <b>description</b> :
     * <p><em>Usage notes</em>*</p>
     * <ul>
     * <li>To query detailed task information, call the <a href="https://help.aliyun.com/document_detail/2861326.html">GetJobDetail</a> operation.</li>
     * <li>This operation only supports querying asynchronous task data within the last 6 months. Queryable task types include transcoding tasks, snapshot tasks, and AI tasks.
     * <strong>QPS limit</strong>
     * The QPS limit for a single user calling this operation is 15 queries per second. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable frequency. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limits</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ListJobInfo  ListJobInfoRequest
     * @return ListJobInfoResponse
     */
    CompletableFuture<ListJobInfoResponse> listJobInfo(ListJobInfoRequest request);

    /**
     * <b>description</b> :
     * <p>You can retrieve up to 5,000 records that match the specified filter conditions.</p>
     * 
     * @param request the request parameters of ListLiveRecordVideo  ListLiveRecordVideoRequest
     * @return ListLiveRecordVideoResponse
     */
    CompletableFuture<ListLiveRecordVideoResponse> listLiveRecordVideo(ListLiveRecordVideoRequest request);

    /**
     * @param request the request parameters of ListManifestEditTemplate  ListManifestEditTemplateRequest
     * @return ListManifestEditTemplateResponse
     */
    CompletableFuture<ListManifestEditTemplateResponse> listManifestEditTemplate(ListManifestEditTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>If multiple snapshot jobs have been initiated for a video, this operation returns only the data of the most recent successful snapshot job.</p>
     * 
     * @param request the request parameters of ListSnapshots  ListSnapshotsRequest
     * @return ListSnapshotsResponse
     */
    CompletableFuture<ListSnapshotsResponse> listSnapshots(ListSnapshotsRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>To query detailed transcoding job information, call the <a href="https://help.aliyun.com/document_detail/109121.html">GetTranscodeTask</a> operation.</li>
     * <li><strong>This operation supports only querying transcoding task data within the last year.</strong></li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 15 calls per second. If the limit is exceeded, the API call is throttled, which may affect your business. Call this operation appropriately. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of ListTranscodeTask  ListTranscodeTaskRequest
     * @return ListTranscodeTaskResponse
     */
    CompletableFuture<ListTranscodeTaskResponse> listTranscodeTask(ListTranscodeTaskRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation does not return the transcoding template configuration information under each transcoding template group. You can call the <a href="https://help.aliyun.com/document_detail/102670.html">GetTranscodeTemplateGroup</a> operation to obtain the information.</p>
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
     * <ul>
     * <li>Currently, the service endpoint only supports <strong>China (Shanghai)</strong>.</li>
     * <li>Each account can submit up to 500 prefetch URL requests per day. Directory-level prefetching is not supported.</li>
     * <li>The purge and prefetch operations include the <a href="~~RefreshVodObjectCaches~~">RefreshVodObjectCaches</a> purge operation and the <a href="~~PreloadVodObjectCaches~~">PreloadVodObjectCaches</a> prefetch operation.</li>
     * </ul>
     * 
     * @param request the request parameters of PreloadVodObjectCaches  PreloadVodObjectCachesRequest
     * @return PreloadVodObjectCachesResponse
     */
    CompletableFuture<PreloadVodObjectCachesResponse> preloadVodObjectCaches(PreloadVodObjectCachesRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Before you use this operation, make sure that you are familiar with the billing methods and pricing of ApsaraVideo VOD. Online editing is a paid feature. For more information about billing, see <a href="~~188310#section-pyv-b8h-bo7~~">Video editing and production billing</a>.</strong></li>
     * <li>This is an <a href="https://help.aliyun.com/document_detail/3027551.html">asynchronous operation</a>. After you submit a task, the online editing project ID is returned (the video has not been produced yet, and the task enters a queue for asynchronous execution). The final result is sent through a callback notification. You can also call <a href="https://help.aliyun.com/document_detail/69052.html">GetEditingProject</a> to query the task status.</li>
     * <li>The video resources used in the online editing timeline can be materials in the material library or videos in the media library. If you use videos from the media library, make sure that their status is Normal.</li>
     * <li>Videos are produced based on ProjectId and Timeline. The logic is as follows:<ul>
     * <li>ProjectId and Timeline cannot both be empty. Otherwise, no basis exists to produce videos.</li>
     * <li>If ProjectId is empty and Timeline is not empty, an online editing project is automatically created with the specified Timeline. The materials referenced in the Timeline are extracted and set as the project materials. Then, video production begins.</li>
     * <li>If ProjectId is not empty and Timeline is empty, the most recently saved Timeline is retrieved based on ProjectId and used to produce videos.</li>
     * <li>If both ProjectId and Timeline are not empty, the specified Timeline is used to produce videos, and the corresponding online editing project is updated (Timeline and project materials). If other fields are specified, the corresponding project fields are also updated.</li>
     * </ul>
     * </li>
     * <li>The maximum number of tracks for video tracks, image tracks, and subtitle tracks is 100 each.</li>
     * <li>The total number of materials cannot exceed 200, and the total file size of materials cannot exceed 1 TB.</li>
     * <li>The region of the input or output bucket must be the same as the region where the ApsaraVideo VOD service is used.</li>
     * <li>When the output is a video, the following resolution limits apply to the finished video:<ul>
     * <li>Both the width and height must be at least 128 px.</li>
     * <li>Both the width and height must be at most 4096 px.</li>
     * <li>The short side must be at most 2160 px.</li>
     * </ul>
     * </li>
     * <li>After video production is complete, the video is automatically uploaded to ApsaraVideo VOD. Therefore, after video production is complete, ApsaraVideo VOD sends the <strong>ProduceMediaComplete</strong> and <strong>FileUploadComplete</strong> event notifications. After the produced video transcoding is complete, the <strong>single definition video transcoding complete</strong> and <strong>all definition video transcoding complete</strong> event notifications are sent.</li>
     * <li>You can also add effects to the produced video. For more details, see <a href="https://help.aliyun.com/document_detail/69082.html">Effects</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ProduceEditingProjectVideo  ProduceEditingProjectVideoRequest
     * @return ProduceEditingProjectVideoResponse
     */
    CompletableFuture<ProduceEditingProjectVideoResponse> produceEditingProjectVideo(ProduceEditingProjectVideoRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>ApsaraVideo VOD provides resource purge and prefetch features. The purge feature deletes cached resources on points of presence and forces the points of presence to retrieve the latest resources from the origin server through back-to-origin requests. The prefetch feature allows you to download and cache popular resources to points of presence before peak hours to improve access efficiency.</li>
     * <li>This operation directly submits a refresh or prefetch node by audio or video ID and supports filtering by streaming format and definition, which allows you to refresh or prefetch specific streams as needed.</li>
     * <li>You can submit a refresh or prefetch node for up to 20 audio or video files at a time.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user for this operation is 50 calls per second. If the limit is exceeded, the API invocation is throttled, which may affect your business. Invoke this operation properly. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of RefreshMediaPlayUrls  RefreshMediaPlayUrlsRequest
     * @return RefreshMediaPlayUrlsResponse
     */
    CompletableFuture<RefreshMediaPlayUrlsResponse> refreshMediaPlayUrls(RefreshMediaPlayUrlsRequest request);

    /**
     * <b>description</b> :
     * <p>This operation can also be used to overwrite the source file of a video or audio file. This means that after you obtain the upload URL of the source file, you can upload the file again while keeping the audio or video ID unchanged. However, this may automatically trigger transcoding and snapshot capture if you have configured transcoding or snapshot capture upon upload. For more information, see <a href="https://help.aliyun.com/document_detail/55397.html">Upload URLs and credentials</a>.</p>
     * 
     * @param request the request parameters of RefreshUploadVideo  RefreshUploadVideoRequest
     * @return RefreshUploadVideoResponse
     */
    CompletableFuture<RefreshUploadVideoResponse> refreshUploadVideo(RefreshUploadVideoRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Currently, the only supported service region is <strong>China (Shanghai)</strong>.</li>
     * <li>Each account can submit up to 2,000 URL purge requests and 100 directory purge requests per day.</li>
     * <li>Purge and prefetch operations include the <a href="https://help.aliyun.com/document_detail/69215.html">RefreshVodObjectCaches</a> purge operation and the <a href="https://help.aliyun.com/document_detail/69211.html">PreloadVodObjectCaches</a> prefetch operation.</li>
     * </ul>
     * 
     * @param request the request parameters of RefreshVodObjectCaches  RefreshVodObjectCachesRequest
     * @return RefreshVodObjectCachesResponse
     */
    CompletableFuture<RefreshVodObjectCachesResponse> refreshVodObjectCaches(RefreshVodObjectCachesRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>For audio and video media files already stored in OSS buckets integrated with ApsaraVideo VOD, you must call the media asset registration operation to generate the associated data required by ApsaraVideo VOD. Then, you can initiate transcoding, snapshot generation, and AI processing for these media files by using their media IDs in ApsaraVideo VOD.</li>
     * <li>You can register up to <strong>10 OSS media files</strong> at a time, and the storage addresses of the media files submitted at a time must be the same.</li>
     * <li>For media files uploaded to ApsaraVideo VOD, if no transcoding template group ID is specified, the default template group is used for transcoding. In contrast, after you register media assets, if no transcoding template group ID is specified, transcoding is not automatically triggered. If a transcoding template group ID is specified, the specified template group is used for transcoding.</li>
     * <li>For repeatedly registered media files, only the <strong>unique media ID associated</strong> with the file is returned, and no other processing is performed.</li>
     * <li>Make sure that the media asset files you want to register have valid file name extensions. Otherwise, the registration fails.</li>
     * </ul>
     * 
     * @param request the request parameters of RegisterMedia  RegisterMediaRequest
     * @return RegisterMediaResponse
     */
    CompletableFuture<RegisterMediaResponse> registerMedia(RegisterMediaRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Make sure that you are familiar with the billing methods and pricing of ApsaraVideo VOD before you call this operation. Restoring media assets incurs storage fees. For more information, see <a href="~~188308#section-e97-xrp-mzz~~">Media asset storage billing</a>.</li>
     * <li>This operation applies only to Archive and Cold Archive audio and video files. After a file is restored, it can be accessed. The storage class of an audio or video file that is being restored cannot be changed.
     * Restoration generates retrieval traffic. After a Cold Archive audio or video file is restored, a Standard storage copy of the file is generated for access. The file copy incurs Standard storage fees until the restoration period ends.</li>
     * </ul>
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
     * <p>For fields that support exact matching and fuzzy matching, when other query methods are used, the returned results follow the query method supported by the field. For example, if a field supports only fuzzy matching, results obtained through multi-value queries are also based on fuzzy matching.
     * The following describes the limits on the number of data records that can be retrieved:</p>
     * <ul>
     * <li>Method 1: Paged traversal
     *   For matched search results, you can set the pagination parameters PageNo (page number) and PageSize (number of records per page) to traverse up to 5,000 records. If the search results exceed 5,000 records, adjust the search conditions to narrow the result range. This method cannot traverse the complete dataset. To traverse more data, refer to Method 2.</li>
     * <li>Method 2: Full traversal (for audio and video searches only)
     * This method applies to video and audio content searches and supports traversing up to 2 million search results. If the number of search results exceeds 2 million, add more filter conditions to reduce the result count. When using this method, in addition to PageNo and PageSize, you must use the ScrollToken parameter for pagination. Each request supports traversing up to 100 records forward.
     * Using a PageSize of 20 as an example, the pagination logic is as follows:<ul>
     * <li>If PageNo is 1, you can query up to the next 5 pages of data.</li>
     * <li>If PageNo is 2, you can query up to the next 6 pages of data.
     * Set pagination parameters properly and choose the appropriate traversal method based on the result set size. If you need to page through more than 1,000 records, use Method 2 for faster and more convenient data processing.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of SearchMedia  SearchMediaRequest
     * @return SearchMediaResponse
     */
    CompletableFuture<SearchMediaResponse> searchMedia(SearchMediaRequest request);

    /**
     * @param request the request parameters of SetAppPlayKey  SetAppPlayKeyRequest
     * @return SetAppPlayKeyResponse
     */
    CompletableFuture<SetAppPlayKeyResponse> setAppPlayKey(SetAppPlayKeyRequest request);

    /**
     * <b>description</b> :
     * <p>When a video is in the Checking or Blocked state, only requests from review security IP addresses can play the video.</p>
     * 
     * @param request the request parameters of SetAuditSecurityIp  SetAuditSecurityIpRequest
     * @return SetAuditSecurityIpResponse
     */
    CompletableFuture<SetAuditSecurityIpResponse> setAuditSecurityIp(SetAuditSecurityIpRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: If you access the cross-domain file through a domain name, purge the CDN cache for the update to take effect immediately. You can logon to the console to <a href="https://help.aliyun.com/document_detail/86098.html">purge files</a> or invoke the <a href="https://help.aliyun.com/document_detail/69215.html">Refresh Cache operation</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of SetCrossdomainContent  SetCrossdomainContentRequest
     * @return SetCrossdomainContentResponse
     */
    CompletableFuture<SetCrossdomainContentResponse> setCrossdomainContent(SetCrossdomainContentRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Currently, this operation is supported in the following regions: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</li>
     * <li>Obtain the AI template ID first, and then call this operation to set the template as the default AI template. A default AI template cannot be deleted.</li>
     * </ul>
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
     * <p>Supports HTTP callbacks and Simple Message Queue (formerly MNS) callbacks. For more information, see <a href="https://help.aliyun.com/document_detail/55627.html">Event notifications</a>.</p>
     * <h3>QPS limits</h3>
     * <p>The QPS limit for a single user calling this API operation is 15 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call the API operation at a reasonable rate. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of SetMessageCallback  SetMessageCallbackRequest
     * @return SetMessageCallbackResponse
     */
    CompletableFuture<SetMessageCallbackResponse> setMessageCallback(SetMessageCallbackRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Currently, the service address supports only <strong>China (Shanghai)</strong>.</li>
     * </ul>
     * 
     * @param request the request parameters of SetVodDomainCertificate  SetVodDomainCertificateRequest
     * @return SetVodDomainCertificateResponse
     */
    CompletableFuture<SetVodDomainCertificateResponse> setVodDomainCertificate(SetVodDomainCertificateRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is currently supported only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>Rate limit per user: 30 calls per second.</li>
     * <li>Request method: POST.</li>
     * </ul>
     * 
     * @param request the request parameters of SetVodDomainSSLCertificate  SetVodDomainSSLCertificateRequest
     * @return SetVodDomainSSLCertificateResponse
     */
    CompletableFuture<SetVodDomainSSLCertificateResponse> setVodDomainSSLCertificate(SetVodDomainSSLCertificateRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Before you use this operation, make sure that you are familiar with the billing methods and pricing of ApsaraVideo VOD. Automated review is a paid feature. For billing details, &lt;props=&quot;china&quot;&gt;see <a href="~~188310#section-g7l-s3o-9ng~~">Automated review billing</a>.&lt;props=&quot;intl&quot;&gt;submit a ticket or contact your Alibaba Cloud account manager.</strong></li>
     * <li>&lt;props=&quot;china&quot;&gt;This operation is supported only in the <strong>China (Shanghai), China (Beijing), and Singapore</strong> regions.&lt;props=&quot;intl&quot;&gt;This operation is supported only in the Singapore region.</li>
     * <li>This is an <a href="https://help.aliyun.com/document_detail/3027551.html">asynchronous operation</a>. After you submit a task, the task ID is returned. At this point, the task is not complete and enters a queue for asynchronous execution. The final result is sent through a callback notification. You can also call <a href="https://help.aliyun.com/document_detail/454959.html">Query automated review job</a> to query the task status.</li>
     * <li>The size of a single image cannot exceed 20 MB. The height or width cannot exceed 30,000 px. The total number of pixels cannot exceed 250 million px.</li>
     * <li>(Recommended) The image resolution is at least 256 × 256 px. A lower resolution may affect the review results.</li>
     * </ul>
     * 
     * @param request the request parameters of SubmitAIImageAuditJob  SubmitAIImageAuditJobRequest
     * @return SubmitAIImageAuditJobResponse
     */
    CompletableFuture<SubmitAIImageAuditJobResponse> submitAIImageAuditJob(SubmitAIImageAuditJobRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is supported in the following regions: <strong>China (Beijing)</strong> and <strong>China (Shanghai)</strong>.</li>
     * <li>This operation is an <a href="https://help.aliyun.com/document_detail/3027551.html">asynchronous operation</a>. After you submit a task, a task ID is returned. The task is not completed at this time and enters the background queue for asynchronous execution. The final result is notified through a callback. You can also call <a href="https://help.aliyun.com/document_detail/186923.html">GetAIImageJobs</a> to query the task execution result.</li>
     * </ul>
     * 
     * @param request the request parameters of SubmitAIImageJob  SubmitAIImageJobRequest
     * @return SubmitAIImageJobResponse
     */
    CompletableFuture<SubmitAIImageJobResponse> submitAIImageJob(SubmitAIImageJobRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Before using this operation, make sure that you fully understand the billing methods and pricing of ApsaraVideo VOD. Intelligent tagging and media fingerprint are paid features. For billing details, see <a href="~~188310#section-g7l-s3o-9ng~~">Video AI billing</a>.</strong></li>
     * <li>Regions supported by media fingerprint: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>. Regions supported by intelligent tagging: <strong>China (Beijing)</strong> and <strong>China (Shanghai)</strong>.</li>
     * <li>This is an <a href="https://help.aliyun.com/document_detail/3027551.html">asynchronous operation</a>. After you submit an AI job, the job ID is returned. The job is not yet complete at this point and enters a queue for asynchronous execution. We recommend that you configure the <a href="https://help.aliyun.com/document_detail/55627.html">event notification</a> feature and set the callback event to <strong>Video AI Processing Complete</strong> to obtain the final processing result. You can also call <a href="https://help.aliyun.com/document_detail/2861326.html">GetTaskDetail</a> to query the job status.</li>
     * <li>You must activate the media fingerprint or intelligent tagging service before you can call this operation to submit AI jobs. For more information, see <a href="https://help.aliyun.com/document_detail/101148.html">Video AI</a>.</li>
     * <li>When you use media fingerprint for the first time, provide your UID and region information and submit a ticket to apply for free activation of the fingerprint library. Otherwise, the media fingerprint feature will not work properly. For more information about how to submit a ticket, see <a href="https://help.aliyun.com/document_detail/464625.html">Contact us</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of SubmitAIJob  SubmitAIJobRequest
     * @return SubmitAIJobResponse
     */
    CompletableFuture<SubmitAIJobResponse> submitAIJob(SubmitAIJobRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Before using this operation, make sure that you are familiar with the billing methods and pricing of ApsaraVideo VOD. Automated review is a paid feature. For billing details, &lt;props=&quot;china&quot;&gt;refer to <a href="~~188310#section-g7l-s3o-9ng~~">Automated review billing</a>.&lt;props=&quot;intl&quot;&gt;submit a ticket or contact your Alibaba Cloud account manager.</strong></li>
     * <li>This operation currently supports only the <strong>Shanghai</strong>, <strong>Beijing</strong>, and <strong>Singapore</strong> regions.</li>
     * <li>This is an <a href="https://help.aliyun.com/document_detail/3027551.html">asynchronous operation</a>. After you submit a task, a task ID is returned. The task is not yet complete at this point and enters a queue for asynchronous execution. The final result is sent through a callback notification. You can also call <a href="https://help.aliyun.com/document_detail/454959.html">Query automated review job</a> to query the task status.</li>
     * <li>For the development guide on submitting automated review jobs, refer to <a href="https://help.aliyun.com/document_detail/101148.html">Automated review</a>.</li>
     * <li>After an automated review job is complete, the image resources generated during the job are retained for free for only two weeks in the VOD system bucket allocated by ApsaraVideo VOD. The images are automatically deleted after two weeks.</li>
     * </ul>
     * 
     * @param request the request parameters of SubmitAIMediaAuditJob  SubmitAIMediaAuditJobRequest
     * @return SubmitAIMediaAuditJobResponse
     */
    CompletableFuture<SubmitAIMediaAuditJobResponse> submitAIMediaAuditJob(SubmitAIMediaAuditJobRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Before you call this operation, make sure that you fully understand the billing methods and pricing of ApsaraVideo VOD. Digital watermarking is a paid feature. Both the generation and extraction of digital watermarks incur fees. For more information, see <a href="~~188310#62b9c940403se~~">Billing of digital watermarks</a>.</strong></li>
     * <li>Currently, this operation is supported only in the <strong>China (Shanghai)</strong> and <strong>China (Beijing)</strong> regions.</li>
     * <li>&lt;props=&quot;china&quot;&gt;For more information about the generation and extraction of digital watermarks, see <a href="https://help.aliyun.com/document_detail/2527021.html">Digital watermarks</a>. Before you submit a digital watermark extraction job, make sure that the following conditions are met:<ul>
     * <li>The video from which you want to extract the watermark is uploaded to ApsaraVideo VOD.</li>
     * <li>The duration of the video from which you want to extract the watermark exceeds 6 minutes.</li>
     * </ul>
     * </li>
     * <li>After the digital watermark extraction job is submitted, call the <a href="https://help.aliyun.com/document_detail/2587769.html">GetDigitalWatermarkExtractResult</a> operation to query the job result.</li>
     * </ul>
     * 
     * @param request the request parameters of SubmitDigitalWatermarkExtractJob  SubmitDigitalWatermarkExtractJobRequest
     * @return SubmitDigitalWatermarkExtractJobResponse
     */
    CompletableFuture<SubmitDigitalWatermarkExtractJobResponse> submitDigitalWatermarkExtractJob(SubmitDigitalWatermarkExtractJobRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>This operation is an <a href="https://help.aliyun.com/document_detail/3027551.html">asynchronous operation</a>. After you submit a task, a task ID is returned. The task is not completed at this time and enters the background queue for asynchronous execution. The final result is notified through a callback. You can also call the <a href="https://help.aliyun.com/document_detail/2861326.html">Get task details</a> operation to actively query the task status.</li>
     * <li>You can initiate an animated image job only for videos whose status is <strong>Upload Complete</strong>, <strong>Transcoding</strong>, <strong>Normal</strong>, <strong>Under Review</strong>, or <strong>Blocked</strong>.</li>
     * <li>Animated image production is billed as video transcoding and follows the same billing standards, which are based on resolution and duration. For more information about billing, see <a href="https://help.aliyun.com/document_detail/188308.html">Billing of media asset transcoding</a>.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <p>The QPS limit for a single user is 30 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call the operation properly. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of SubmitDynamicImageJob  SubmitDynamicImageJobRequest
     * @return SubmitDynamicImageJobResponse
     */
    CompletableFuture<SubmitDynamicImageJobResponse> submitDynamicImageJob(SubmitDynamicImageJobRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API operation incrementally edits the manifest of an existing HLS/DASH AUTO stream (definition=7) without re-transcoding.</li>
     * <li><code>VideoId</code> and <code>JobId</code> are required parameters used for authentication isolation and consistency verification.</li>
     * <li>You can specify <code>TemplateId</code> to apply a predefined manifest editing template.</li>
     * <li>This operation supports appending, removing, and replacing audio, subtitle, and video tracks.</li>
     * <li>The <code>OutputConfig</code> parameter specifies the storage location of the edited manifest.</li>
     * <li>You can pass custom data in <code>UserData</code> as pass-through information.</li>
     * </ul>
     * 
     * @param request the request parameters of SubmitEditMediaManifestJob  SubmitEditMediaManifestJobRequest
     * @return SubmitEditMediaManifestJobResponse
     */
    CompletableFuture<SubmitEditMediaManifestJobResponse> submitEditMediaManifestJob(SubmitEditMediaManifestJobRequest request);

    /**
     * <b>description</b> :
     * <p>Currently, this operation is supported in the following regions: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</p>
     * 
     * @param request the request parameters of SubmitMediaDNADeleteJob  SubmitMediaDNADeleteJobRequest
     * @return SubmitMediaDNADeleteJobResponse
     */
    CompletableFuture<SubmitMediaDNADeleteJobResponse> submitMediaDNADeleteJob(SubmitMediaDNADeleteJobRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This is an <a href="https://help.aliyun.com/document_detail/3027551.html">asynchronous operation</a>. After you submit a task, the task ID is returned. The task is queued for asynchronous execution in the background. The final result is sent through a callback notification. You can also call <a href="https://help.aliyun.com/document_detail/2861326.html">GetTaskDetail</a> to query the task status.</li>
     * <li>Video preprocessing is essentially a transcoding process that generates videos that meet the playback requirements of the China Production Studio. Therefore, <strong>metering and billing</strong> information is generated. For billing details, see <a href="https://help.aliyun.com/document_detail/64531.html">China Production Studio fees</a>.</li>
     * <li>To meet the quality requirements of the China Production Studio for materials, videos in MP4 format with a short side of 360 must meet at least one of the following conditions before preprocessing can be initiated: the resolution exceeds 1920, the bit rate exceeds 6000 kbps, or the frame rate exceeds 25.</li>
     * <li>You can receive the <a href="https://help.aliyun.com/document_detail/55638.html">TranscodeComplete</a> callback message to obtain the processing result. When the callback message contains <strong>Preprocess=true</strong>, it indicates that the preprocessing is complete.</li>
     * </ul>
     * 
     * @param request the request parameters of SubmitPreprocessJobs  SubmitPreprocessJobsRequest
     * @return SubmitPreprocessJobsResponse
     */
    CompletableFuture<SubmitPreprocessJobsResponse> submitPreprocessJobs(SubmitPreprocessJobsRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This is an <a href="https://help.aliyun.com/document_detail/3027551.html">asynchronous operation</a>. After you submit a task, the task ID is returned (the task is not yet complete and enters a queue for asynchronous execution). The final result is sent through a callback notification. You can also proactively query the task status by calling <a href="https://help.aliyun.com/document_detail/2861326.html">Get task details</a>.</li>
     * <li>Only JPG images are supported.</li>
     * <li>When the snapshot is complete, an event notification of <a href="https://help.aliyun.com/document_detail/57337.html">Video snapshot complete</a> with EventType=SnapshotComplete and SubType=SpecifiedTime is sent.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user on this operation is 30 calls per second. If this limit is exceeded, the API call is throttled, which may affect your business. Call this operation appropriately. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit</a>.</p>
     * 
     * @param request the request parameters of SubmitSnapshotJob  SubmitSnapshotJobRequest
     * @return SubmitSnapshotJobResponse
     */
    CompletableFuture<SubmitSnapshotJobResponse> submitSnapshotJob(SubmitSnapshotJobRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li><strong>Before you call this operation, make sure that you fully understand the billing methods and pricing of ApsaraVideo VOD. Transcoding is a paid feature. For billing details, see <a href="~~188308#section-ejb-nii-nqa~~">Billing of media asset transcoding</a>.</strong></li>
     * <li>This operation is an <a href="https://help.aliyun.com/document_detail/3027551.html">asynchronous operation</a>. After you submit a job, a job ID is returned. The job is not completed at this time and enters the background queue for asynchronous execution. The final result is notified through a callback. You can also call the <a href="https://help.aliyun.com/document_detail/454946.html">Get job details</a> operation to actively query the job status.</li>
     * <li>Only videos in the <strong>Upload Completed</strong>, <strong>Normal</strong>, or <strong>Under Review</strong> state can be transcoded.</li>
     * <li>To obtain the transcoding result, you can receive callback messages: <a href="https://help.aliyun.com/document_detail/55636.html">Transcoding completed for a single definition</a> and <a href="https://help.aliyun.com/document_detail/55638.html">All transcoding completed</a>.</li>
     * <li>This operation supports dynamic replacement of subtitle URLs in HLS adaptive bitrate streaming packaging jobs. If the packaging job does not involve subtitle packaging, we do not recommend using this operation to initiate the job. Instead, we recommend setting the corresponding packaging template group ID when uploading the video to automatically initiate the packaging process.</li>
     * </ul>
     * 
     * @param request the request parameters of SubmitTranscodeJobs  SubmitTranscodeJobsRequest
     * @return SubmitTranscodeJobsResponse
     */
    CompletableFuture<SubmitTranscodeJobsResponse> submitTranscodeJobs(SubmitTranscodeJobsRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Before you call this operation, make sure that you fully understand the billing methods and pricing of ApsaraVideo VOD. Using a workflow may incur fees for transcoding, encryption, automated review, and other services. For more information about billing, see <a href="https://help.aliyun.com/document_detail/188307.html">Billing overview of ApsaraVideo VOD</a>.</strong></li>
     * <li>This operation is an <a href="https://help.aliyun.com/document_detail/3027551.html">asynchronous operation</a>. After you submit a job, a job ID is returned. The job is not completed at this time and enters the background queue for asynchronous execution. The final result is notified by a callback. You can also call the <a href="https://help.aliyun.com/document_detail/2861326.html">Get job details</a> operation to query the job status.</li>
     * <li>You can call this operation to initiate a workflow processing job for a video. For more information about workflows, see <a href="https://help.aliyun.com/document_detail/115347.html">Workflows</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of SubmitWorkflowJob  SubmitWorkflowJobRequest
     * @return SubmitWorkflowJobResponse
     */
    CompletableFuture<SubmitWorkflowJobResponse> submitWorkflowJob(SubmitWorkflowJobRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Currently, this operation is supported in the following regions: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</li>
     * <li>After you call the <a href="https://help.aliyun.com/document_detail/102930.html">AddAITemplate</a> operation to add an AI template, you can call this operation to modify the AI template.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateAITemplate  UpdateAITemplateRequest
     * @return UpdateAITemplateResponse
     */
    CompletableFuture<UpdateAITemplateResponse> updateAITemplate(UpdateAITemplateRequest request);

    /**
     * <b>description</b> :
     * <p>After you create an application, you can call this operation to locate the application by its ID and modify the name, description, and status of the application.</p>
     * <h3>QPS limits</h3>
     * <p>The QPS limit for a single user is 30 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable rate. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of UpdateAppInfo  UpdateAppInfoRequest
     * @return UpdateAppInfoResponse
     */
    CompletableFuture<UpdateAppInfoResponse> updateAppInfo(UpdateAppInfoRequest request);

    /**
     * <b>description</b> :
     * <p>You can update the information of up to 20 auxiliary media assets at a time.</p>
     * 
     * @param request the request parameters of UpdateAttachedMediaInfos  UpdateAttachedMediaInfosRequest
     * @return UpdateAttachedMediaInfosResponse
     */
    CompletableFuture<UpdateAttachedMediaInfosResponse> updateAttachedMediaInfos(UpdateAttachedMediaInfosRequest request);

    /**
     * <b>description</b> :
     * <p>After you create a category, you can call this operation to update the category name. If the category is already tagged on media assets, the category name tagged on these media assets is automatically updated.</p>
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
     * <ul>
     * <li>This operation only supports modifying uploaded images and does not support modifying images generated from video snapshots.</li>
     * <li>You can modify the information of up to 20 images at a time.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateImageInfos  UpdateImageInfosRequest
     * @return UpdateImageInfosResponse
     */
    CompletableFuture<UpdateImageInfosResponse> updateImageInfos(UpdateImageInfosRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before calling this operation, make sure that you fully understand the billing methods and pricing of ApsaraVideo VOD. Modifying the storage class of a media asset in ApsaraVideo VOD incurs storage fees. For billing details, see <a href="~~188308#section-e97-xrp-mzz~~">Media asset storage billing</a>.</li>
     * <li>Modifying the storage class of a media asset is an <strong>asynchronous operation</strong>. A callback is sent to you after the operation is complete.</li>
     * <li>If the current storage class of the media asset is Archive or Cold Archive, calling this operation automatically triggers restoration. The storage class is modified after the restoration is complete. You do not need to manually call the RestoreMedia operation to restore the media asset. For Cold Archive media assets, you must specify the restoration priority. The default value is RestoreTier=Standard.</li>
     * <li>You cannot initiate another modification task for a media asset that is being modified, nor can you produce or process it.</li>
     * <li>Media assets in non-standard storage classes have minimum storage duration requirements. Infrequent Access (IA) and Source File IA require a minimum storage duration of 30 days. Archive and Source File Archive require a minimum storage duration of 60 days. Cold Archive and Source File Cold Archive require a minimum storage duration of 180 days. If the storage duration does not meet the requirement when you modify the storage class of a media asset, you are charged for the remaining days of the minimum storage duration. For example, if you change the storage class of a media asset from IA to Standard after 10 days of IA storage, you are charged for the remaining 20 days of IA storage at a time, resulting in a total charge for 30 days of IA storage.</li>
     * <li><strong>Modifying the storage class of media assets in your own buckets is not supported.</strong></li>
     * </ul>
     * 
     * @param request the request parameters of UpdateMediaStorageClass  UpdateMediaStorageClassRequest
     * @return UpdateMediaStorageClassResponse
     */
    CompletableFuture<UpdateMediaStorageClassResponse> updateMediaStorageClass(UpdateMediaStorageClassRequest request);

    /**
     * <b>description</b> :
     * <p>For security purposes, you cannot add, modify, or delete transcoding template groups that are in the locked state. You can call the <a href="~~GetTranscodeTemplateGroup~~">GetTranscodeTemplateGroup</a> operation to query the template configuration and check whether the template group is locked based on the Locked response parameter. Alternatively, you can call this operation to unlock the template group before you add, modify, or delete templates.</p>
     * 
     * @param request the request parameters of UpdateTranscodeTemplateGroup  UpdateTranscodeTemplateGroupRequest
     * @return UpdateTranscodeTemplateGroupResponse
     */
    CompletableFuture<UpdateTranscodeTemplateGroupResponse> updateTranscodeTemplateGroup(UpdateTranscodeTemplateGroupRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>Locates an audio or video file by video ID. You can modify the title, tags, description, and other information of the audio or video file. If a parameter is passed, the corresponding field is updated. Otherwise, the field is not overwritten or updated.</p>
     * <h3>QPS limits</h3>
     * <p>The queries per second (QPS) limit per user for this API operation is 100. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable rate. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of UpdateVideoInfo  UpdateVideoInfoRequest
     * @return UpdateVideoInfoResponse
     */
    CompletableFuture<UpdateVideoInfoResponse> updateVideoInfo(UpdateVideoInfoRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>You can locate an audio or video file by its ID. You can modify the title, tags, description, and other information of the audio or video file. If a parameter is passed, the corresponding field is updated. Otherwise, the field is not overwritten or updated.</li>
     * <li>You can modify the information of up to 20 audio or video files at a time.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit on a single user for this API operation is 30. If the number of calls per second exceeds the limit, throttling is triggered. This may affect your business. Call this operation at a reasonable rate. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of UpdateVideoInfos  UpdateVideoInfosRequest
     * @return UpdateVideoInfosResponse
     */
    CompletableFuture<UpdateVideoInfosResponse> updateVideoInfos(UpdateVideoInfosRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * </blockquote>
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
     * <ul>
     * <li>After you invoke <a href="~~AddWatermark~~">AddWatermark</a> to add an image and text watermark template, you can invoke this operation to modify the name and watermark configuration of the template.</li>
     * <li>This operation does not support replacing the image in an image watermark template or modifying the template across templatetypes (such as changing an image watermark template to a text watermark template).</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateWatermark  UpdateWatermarkRequest
     * @return UpdateWatermarkResponse
     */
    CompletableFuture<UpdateWatermarkResponse> updateWatermark(UpdateWatermarkRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Before you call this operation, make sure that you fully understand the billing methods and pricing of ApsaraVideo VOD. Uploading media assets to ApsaraVideo VOD incurs storage fees. For billing details, see <a href="~~188308#section_e97_xrp_mzz~~">Media asset storage billing</a>. If you have enabled storage transfer acceleration, uploading media assets to ApsaraVideo VOD also incurs upload acceleration fees. For billing details, see <a href="~~188310#section_sta_zm2_tsv~~">Storage transfer acceleration billing</a>.</strong></li>
     * <li>For the media file formats supported by this operation, see <a href="~~55396#section-e27-2rj-mde~~">Media formats</a>.</li>
     * <li>This operation is mainly applicable to scenarios where files are not stored on local servers or terminals and need to be uploaded through URLs with public network access.</li>
     * <li>This operation is an <a href="https://help.aliyun.com/document_detail/3027551.html">asynchronous upload operation</a>. It is not real-time and does not guarantee timeliness. Generally, the migration and upload are completed within hours or even days after submission. If you have high requirements for timeliness, use the upload SDK.</li>
     * <li>If a callback is configured, you will receive a <a href="https://help.aliyun.com/document_detail/86326.html">URL-based video upload complete</a> event notification after the upload is complete. You can query the upload status by calling the <a href="https://help.aliyun.com/document_detail/106830.html">Get URL upload information</a> operation.</li>
     * <li>After an upload task is submitted, an asynchronously executed task is generated in the cloud. URL upload tasks submitted by all users in the corresponding service region are queued for execution. The completion time is affected by the number of existing tasks. After the upload is complete, you can associate the task based on the URL and video ID returned in the event notification (message callback).</li>
     * <li>This operation is currently supported only in the <strong>China (Shanghai)</strong>, <strong>China (Beijing)</strong>, <strong>China (Shenzhen)</strong>, <strong>Singapore</strong>, and <strong>US</strong> (<strong>Silicon Valley</strong>) regions.</li>
     * <li>For the same media file URL, each submitted upload task generates a new media asset in ApsaraVideo VOD (that is, a new media ID is generated).</li>
     * <li>If a single file exceeds 20 GB, it will result in a failed upload. If you need to upload a single file larger than 20 GB, use the upload SDK. For more information, see <a href="https://help.aliyun.com/document_detail/52200.html">Overview of the upload SDK</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of UploadMediaByURL  UploadMediaByURLRequest
     * @return UploadMediaByURLResponse
     */
    CompletableFuture<UploadMediaByURLResponse> uploadMediaByURL(UploadMediaByURLRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Before you use this operation, make sure that you fully understand the billing methods and pricing of ApsaraVideo VOD. Uploading media files to ApsaraVideo VOD incurs storage fees. For more information, see <a href="~~188308#section_e97_xrp_mzz~~">Media asset storage billing</a>. If you have enabled storage and transfer acceleration, uploading media files to ApsaraVideo VOD also incurs upload acceleration fees. For more information, see <a href="~~188310#section_sta_zm2_tsv~~">Storage and transfer acceleration billing</a>.</strong></li>
     * <li>This operation is currently supported only in the China (Shanghai), China (Beijing), China (Shenzhen), Singapore, and US (Silicon Valley) regions.</li>
     * <li>Call this operation to upload a transcoded stream file from external storage and attach it to the corresponding ApsaraVideo VOD media asset. The supported HDR types for transcoded streams are HDR, HDR10, HLG, DolbyVision, HDRVivid, and SDR+.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/106830.html">GetURLUploadInfos</a> operation to query the upload status. After the upload is complete, you receive the <a href="https://help.aliyun.com/document_detail/376427.html">URL Upload Transcoded Stream Complete</a> event notification.</li>
     * </ul>
     * 
     * @param request the request parameters of UploadStreamByURL  UploadStreamByURLRequest
     * @return UploadStreamByURLResponse
     */
    CompletableFuture<UploadStreamByURLResponse> uploadStreamByURL(UploadStreamByURLRequest request);

    /**
     * <b>description</b> :
     * <p>Currently, the service is supported only in the <strong>China (Shanghai)</strong> region.</p>
     * 
     * @param request the request parameters of VerifyVodDomainOwner  VerifyVodDomainOwnerRequest
     * @return VerifyVodDomainOwnerResponse
     */
    CompletableFuture<VerifyVodDomainOwnerResponse> verifyVodDomainOwner(VerifyVodDomainOwnerRequest request);

}
