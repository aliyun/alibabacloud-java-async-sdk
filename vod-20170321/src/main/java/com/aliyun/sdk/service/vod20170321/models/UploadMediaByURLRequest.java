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
         * The ID of the application. Default value: **app-1000000**. For more information, see [Overview](~~113600~~).
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The storage location of the media file.
         * <p>
         * 
         * Log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com/?spm=a2c4g.11186623.2.15.6948257eaZ4m54#/vod/settings/censored). In the left-side navigation pane, choose **Configuration Management** > **Media Management** > **Storage**. On the Storage page, you can view the storage location. If you do not specify the storage location, the default storage location is used.
         */
        public Builder storageLocation(String storageLocation) {
            this.putQueryParameter("StorageLocation", storageLocation);
            this.storageLocation = storageLocation;
            return this;
        }

        /**
         * The ID of the transcoding template group. You can use one of the following methods to obtain the ID of the transcoding template group:
         * <p>
         * * Log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Configuration Management** > **Media Processing** > **Transcoding Template Groups**. On the Transcoding Template Groups page, you can view the ID of the transcoding template group.
         * * View the value of the TranscodeTemplateGroupId parameter returned by the [AddTranscodeTemplateGroup](~~102665~~) operation that you called to create a transcoding template group.
         * * View the value of the TranscodeTemplateGroupId parameter returned by the [ListTranscodeTemplateGroup](~~102669~~) operation that you called to query a transcoding template group.
         * > * If this parameter is left empty, the default transcoding template group is used for transcoding. If this parameter is set to a specific value, the specified transcoding template group is used for transcoding.
         * > * You can also specify the ID of the transcoding template group by using the nested TemplateGroupId parameter under the `UploadMetadatas` parameter. If you set this parameter and the nested TemplateGroupId parameter, the value of the nested TemplateGroupId parameter takes effect.
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
         * The URL of the source file.
         * <p>
         * * The URL must contain a file name extension, such as mp4 in `https://****.mp4`.
         *     * If the URL does not contain a file name extension, you can specify one by setting the `FileExtension` parameter under the `UploadMetadatas` parameter.
         *     * If the URL contains a file name extension and the `FileExtension` parameter is set, the value of the `FileExtension` parameter is used.
         *     * For more information about file name extensions supported by ApsaraVideo VOD, see [Overview](~~55396~~).
         * * URL encoding is required. Separate multiple URLs with commas (,). You can specify a maximum of 20 URLs.
         * * Special characters may cause upload failures. Therefore, encode URLs before you separate them with commas (,).
         */
        public Builder uploadURLs(String uploadURLs) {
            this.putQueryParameter("UploadURLs", uploadURLs);
            this.uploadURLs = uploadURLs;
            return this;
        }

        /**
         * The custom configurations, including callback configurations and upload acceleration configurations. The value is a JSON string. For more information, see the "UserData: specifies the custom configurations for media upload" section of the [Request parameters](~~86952#UserData~~) topic.
         * <p>
         * > * The callback configurations take effect only if you specify the HTTP callback URL and select the specific callback events in the ApsaraVideo VOD console. For more information about how to configure HTTP callback settings in the ApsaraVideo VOD console, see [Configure callback settings](~~86071~~).
         * > * To use the upload acceleration feature, submit a [ticket](https://ticket-intl.console.aliyun.com/#/ticket/createIndex) to enable this feature. For more information, see [Overview](~~55396~~).
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * The ID of the workflow. To view the ID of the workflow, log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Configuration Management** > **Media Processing** > **Workflows**.
         * <p>
         * > If both the WorkflowId and TemplateGroupId parameters are set, the value of the WorkflowId parameter takes effect. For more information, see [Workflows](~~115347~~).
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
