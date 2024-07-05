// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUploadVideoRequest} extends {@link RequestModel}
 *
 * <p>CreateUploadVideoRequest</p>
 */
public class CreateUploadVideoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CateId")
    private Long cateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoverURL")
    private String coverURL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSize")
    private Long fileSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageLocation")
    private String storageLocation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private String tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateGroupId")
    private String templateGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    @com.aliyun.core.annotation.Validation(required = true)
    private String title;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkflowId")
    private String workflowId;

    private CreateUploadVideoRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.cateId = builder.cateId;
        this.coverURL = builder.coverURL;
        this.description = builder.description;
        this.fileName = builder.fileName;
        this.fileSize = builder.fileSize;
        this.storageLocation = builder.storageLocation;
        this.tags = builder.tags;
        this.templateGroupId = builder.templateGroupId;
        this.title = builder.title;
        this.userData = builder.userData;
        this.workflowId = builder.workflowId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUploadVideoRequest create() {
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
     * @return cateId
     */
    public Long getCateId() {
        return this.cateId;
    }

    /**
     * @return coverURL
     */
    public String getCoverURL() {
        return this.coverURL;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return fileSize
     */
    public Long getFileSize() {
        return this.fileSize;
    }

    /**
     * @return storageLocation
     */
    public String getStorageLocation() {
        return this.storageLocation;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    /**
     * @return templateGroupId
     */
    public String getTemplateGroupId() {
        return this.templateGroupId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
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

    public static final class Builder extends Request.Builder<CreateUploadVideoRequest, Builder> {
        private String appId; 
        private Long cateId; 
        private String coverURL; 
        private String description; 
        private String fileName; 
        private Long fileSize; 
        private String storageLocation; 
        private String tags; 
        private String templateGroupId; 
        private String title; 
        private String userData; 
        private String workflowId; 

        private Builder() {
            super();
        } 

        private Builder(CreateUploadVideoRequest request) {
            super(request);
            this.appId = request.appId;
            this.cateId = request.cateId;
            this.coverURL = request.coverURL;
            this.description = request.description;
            this.fileName = request.fileName;
            this.fileSize = request.fileSize;
            this.storageLocation = request.storageLocation;
            this.tags = request.tags;
            this.templateGroupId = request.templateGroupId;
            this.title = request.title;
            this.userData = request.userData;
            this.workflowId = request.workflowId;
        } 

        /**
         * The ID of the application. Default value: **app-1000000**. For more information, see [Overview](~~113600~~).
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The category ID of the media file. You can use one of the following methods to obtain the category ID:
         * <p>
         * 
         * *   Log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Configuration Management** > **Media Management** > **Categories** to view the category ID of the media file.
         * *   Obtain the value of CateId from the response to the [AddCategory](~~56401~~) operation.
         * *   Obtain the value of CateId from the response to the [GetCategories](~~56406~~) operation.
         */
        public Builder cateId(Long cateId) {
            this.putQueryParameter("CateId", cateId);
            this.cateId = cateId;
            return this;
        }

        /**
         * The URL of the custom video thumbnail.
         */
        public Builder coverURL(String coverURL) {
            this.putQueryParameter("CoverURL", coverURL);
            this.coverURL = coverURL;
            return this;
        }

        /**
         * The description of the audio or video file.
         * <p>
         * 
         * *   The value can be up to 1,024 characters in length.
         * *   The value must be encoded in UTF-8.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The name of the audio or video file.
         * <p>
         * 
         * *   The name must contain a file name extension, which is not case-sensitive.
         * *   For more information about file name extensions supported by ApsaraVideo VOD, see [Overview](~~55396~~).
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * The size of the source file. Unit: bytes.
         */
        public Builder fileSize(Long fileSize) {
            this.putQueryParameter("FileSize", fileSize);
            this.fileSize = fileSize;
            return this;
        }

        /**
         * The storage address. To obtain the storage address, log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Configuration Management** > **Media Management** > **Storage**.
         * <p>
         * 
         * > If you specify a storage address, media files are uploaded to the specified address.
         */
        public Builder storageLocation(String storageLocation) {
            this.putQueryParameter("StorageLocation", storageLocation);
            this.storageLocation = storageLocation;
            return this;
        }

        /**
         * The tags of the audio or video file.
         * <p>
         * 
         * *   You can specify a maximum of 16 tags.
         * *   If you want to specify multiple tags, separate the tags with commas (,).
         * *   Each tag can be up to 32 characters in length.
         * *   The value must be encoded in UTF-8.
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * The ID of the transcoding template group. You can use one of the following methods to obtain the ID of the transcoding template group:
         * <p>
         * 
         * *   Log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Configuration Management** > **Media Processing** > **Transcoding Template Groups** to view the ID of the transcoding template group.
         * *   Obtain the value of TranscodeTemplateGroupId in the response to the [AddTranscodeTemplateGroup](~~102665~~) operation.
         * *   Obtain the value of TranscodeTemplateGroupId in the response to the [ListTranscodeTemplateGroup](~~102669~~) operation.
         * 
         * > If you leave this parameter empty, the default transcoding template group is used. If you specify this parameter, the specified transcoding template group is used for transcoding.
         */
        public Builder templateGroupId(String templateGroupId) {
            this.putQueryParameter("TemplateGroupId", templateGroupId);
            this.templateGroupId = templateGroupId;
            return this;
        }

        /**
         * The title of the audio or video file.
         * <p>
         * 
         * *   The title can be up to 128 characters in length.
         * *   The value must be encoded in UTF-8.
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * The custom configurations such as callback configurations and upload acceleration configurations. The value must be a JSON string. For more information, see [Request parameters](~~86952~~).
         * <p>
         * 
         * > *   The callback configurations take effect only after you specify the HTTP callback URL and select specific callback events in the ApsaraVideo VOD console. For more information about how to configure HTTP callback settings in the ApsaraVideo VOD console, see [Configure callback settings](~~86071~~).
         * >*   If you want to enable the upload acceleration feature, [submit a request on Yida](https://yida.alibaba-inc.com/o/ticketapply). For more information, see [Overview](~~55396~~).
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * The ID of the workflow. To view the ID of the workflow, log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Configuration Management** > **Media Processing** > **Workflows**.
         * <p>
         * 
         * > If you specify the WorkflowId and TemplateGroupId parameters, the value of the WorkflowId parameter takes effect. For more information, see [Workflows](~~115347~~).
         */
        public Builder workflowId(String workflowId) {
            this.putQueryParameter("WorkflowId", workflowId);
            this.workflowId = workflowId;
            return this;
        }

        @Override
        public CreateUploadVideoRequest build() {
            return new CreateUploadVideoRequest(this);
        } 

    } 

}
