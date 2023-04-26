// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadMediaByURLRequest} extends {@link RequestModel}
 *
 * <p>UploadMediaByURLRequest</p>
 */
public class UploadMediaByURLRequest extends Request {
    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("StorageLocation")
    private String storageLocation;

    @Query
    @NameInMap("TemplateGroupId")
    private String templateGroupId;

    @Query
    @NameInMap("UploadMetadatas")
    private String uploadMetadatas;

    @Query
    @NameInMap("UploadURLs")
    @Validation(required = true)
    private String uploadURLs;

    @Query
    @NameInMap("UserData")
    private String userData;

    @Query
    @NameInMap("WorkflowId")
    private String workflowId;

    private UploadMediaByURLRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.storageLocation = builder.storageLocation;
        this.templateGroupId = builder.templateGroupId;
        this.uploadMetadatas = builder.uploadMetadatas;
        this.uploadURLs = builder.uploadURLs;
        this.userData = builder.userData;
        this.workflowId = builder.workflowId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadMediaByURLRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return storageLocation
     */
    public String getStorageLocation() {
        return this.storageLocation;
    }

    /**
     * @return templateGroupId
     */
    public String getTemplateGroupId() {
        return this.templateGroupId;
    }

    /**
     * @return uploadMetadatas
     */
    public String getUploadMetadatas() {
        return this.uploadMetadatas;
    }

    /**
     * @return uploadURLs
     */
    public String getUploadURLs() {
        return this.uploadURLs;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    /**
     * @return workflowId
     */
    public String getWorkflowId() {
        return this.workflowId;
    }

    public static final class Builder extends Request.Builder<UploadMediaByURLRequest, Builder> {
        private String appId; 
        private String storageLocation; 
        private String templateGroupId; 
        private String uploadMetadatas; 
        private String uploadURLs; 
        private String userData; 
        private String workflowId; 

        private Builder() {
            super();
        } 

        private Builder(UploadMediaByURLRequest request) {
            super(request);
            this.appId = request.appId;
            this.storageLocation = request.storageLocation;
            this.templateGroupId = request.templateGroupId;
            this.uploadMetadatas = request.uploadMetadatas;
            this.uploadURLs = request.uploadURLs;
            this.userData = request.userData;
            this.workflowId = request.workflowId;
        } 

        /**
         * ## UploadMetadata
         * <p>
         * 
         * | Parameter | Type | Required | Description |
         * | --------- | ---- | -------- | ----------- |
         * | SourceURL | String | Yes | The URL of the source file to be uploaded. |
         * | Title | String | Yes | The title of the media file. The title can be up to 128 bytes in length. The value must be encoded in UTF-8. |
         * | FileSize | String | No | The size of the media file. |
         * | Description | String | No | The description of the media file. The description can be up to 1,024 bytes in length. The value must be encoded in UTF-8. |
         * | CoverURL | String | No | The URL of the custom thumbnail of the media file. |
         * | CateId | String | No | The category ID of the media file. To view the category ID of the media file, log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com/). In the left-side navigation pane, choose **Configuration Management** > **Media Management** > **Categories**. |
         * | Tags | String | No | The one or more tags of the media file. Each tag can be up to 32 bytes in length. You can set a maximum of 16 tags. Separate multiple tags with commas (,). The value must be encoded in UTF-8. |
         * | TemplateGroupId | String | No | The ID of the transcoding template group. If both the request parameter TemplateGroupId and the nested parameter TemplateGroupId are set, the value of the nested parameter takes effect. |
         * | WorkflowId | String | No | The ID of the workflow. If both the WorkflowId and TemplateGroupId parameters are set, the value of the WorkflowId parameter takes effect. For more information, see [Workflows](https://www.alibabacloud.com/help/en/apsaravideo-for-vod/latest/workflows). |
         * | FileExtension | String | No | The file name extension of the media file. For more information about file name extensions supported by ApsaraVideo VOD, see [Overview](https://www.alibabacloud.com/help/en/apsaravideo-for-vod/latest/upload-medias-overview). |
         * > - Do not include emoticons in the nested parameters, such as Title, Description, and Tags, under the UploadMetadata parameter.
         * - If you set the TemplateGroupId parameter to VOD_NO_TRANSCODE to upload videos, only the videos in the format of MP4, FLV, MP3, M3U8, or WebM can be played. Videos in the other formats are supported only for storage. You can identify the video format based on the file name extension. If you want to use ApsaraVideo Player, the version must be 3.1.0 or later.
         * - If you set the TemplateGroupId parameter to VOD_NO_TRANSCODE, only the [FileUploadComplete](https://www.alibabacloud.com/help/en/apsaravideo-for-vod/latest/fileuploadcomplete) but not the [StreamTranscodeComplete](https://www.alibabacloud.com/help/en/apsaravideo-for-vod/latest/streamtranscodecomplete) event notification is returned after the media file is uploaded.
         * - If a callback is configured, ApsaraVideo VOD sends an [UploadByURLComplete](https://www.alibabacloud.com/help/en/apsaravideo-for-vod/latest/uploadbyurlcomplete) event notification after the media file is uploaded, in addition to the FileUploadComplete and StreamTranscodeComplete event notifications.
         * - If you specify multiple media files at a time, ApsaraVideo VOD sends an event notification for each media file after the media file is uploaded.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The URL of the source file.
         * <p>
         * * The URL must contain a file name extension, such as mp4 in `https://****.mp4`.
         *     * If the URL does not contain a file name extension, you can specify one by setting the `FileExtension` parameter under the `UploadMetadatas` parameter.
         *     * If the URL contains a file name extension and the `FileExtension` parameter is set, the value of the `FileExtension` parameter is used.
         *     * For more information about file name extensions supported by ApsaraVideo VOD, see [Overview](~~55396~~).
         * * URL encoding is required. Separate multiple URLs with commas (,). You can specify a maximum of 20 URLs.
         * * Special characters may cause upload failures. Therefore, encode URLs before you separate them with commas (,).
         */
        public Builder storageLocation(String storageLocation) {
            this.putQueryParameter("StorageLocation", storageLocation);
            this.storageLocation = storageLocation;
            return this;
        }

        /**
         * The information about one or more upload jobs.
         */
        public Builder templateGroupId(String templateGroupId) {
            this.putQueryParameter("TemplateGroupId", templateGroupId);
            this.templateGroupId = templateGroupId;
            return this;
        }

        /**
         * The metadata of the media file to be uploaded. The value is a JSON string.
         * <p>
         * * This parameter takes effect only if the value of the SourceURL parameter matches the URL that is specified by the UploadURLs parameter.
         * * The JSON-formatted data, such as `[UploadMetadata, UploadMetadata,…]`, must be converted into a JSON string.
         * * For more information, see the **UploadMetadata** section.
         */
        public Builder uploadMetadatas(String uploadMetadatas) {
            this.putQueryParameter("UploadMetadatas", uploadMetadatas);
            this.uploadMetadatas = uploadMetadatas;
            return this;
        }

        /**
         * The ID of the application. Default value: **app-1000000**. For more information, see [Overview](~~113600~~).
         */
        public Builder uploadURLs(String uploadURLs) {
            this.putQueryParameter("UploadURLs", uploadURLs);
            this.uploadURLs = uploadURLs;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * > This operation is used to asynchronously upload media files. Upload jobs are queued for execution after they are submitted. The completion time of an upload job varies with the number of jobs in the queue.
         */
        public Builder workflowId(String workflowId) {
            this.putQueryParameter("WorkflowId", workflowId);
            this.workflowId = workflowId;
            return this;
        }

        @Override
        public UploadMediaByURLRequest build() {
            return new UploadMediaByURLRequest(this);
        } 

    } 

}
