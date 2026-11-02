// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateUploadMediaRequest} extends {@link RequestModel}
 *
 * <p>CreateUploadMediaRequest</p>
 */
public class CreateUploadMediaRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntityId")
    private String entityId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileInfo")
    private String fileInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaMetaData")
    private String mediaMetaData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PostProcessConfig")
    private String postProcessConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UploadTargetConfig")
    private String uploadTargetConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private CreateUploadMediaRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.entityId = builder.entityId;
        this.fileInfo = builder.fileInfo;
        this.mediaMetaData = builder.mediaMetaData;
        this.postProcessConfig = builder.postProcessConfig;
        this.uploadTargetConfig = builder.uploadTargetConfig;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUploadMediaRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return entityId
     */
    public String getEntityId() {
        return this.entityId;
    }

    /**
     * @return fileInfo
     */
    public String getFileInfo() {
        return this.fileInfo;
    }

    /**
     * @return mediaMetaData
     */
    public String getMediaMetaData() {
        return this.mediaMetaData;
    }

    /**
     * @return postProcessConfig
     */
    public String getPostProcessConfig() {
        return this.postProcessConfig;
    }

    /**
     * @return uploadTargetConfig
     */
    public String getUploadTargetConfig() {
        return this.uploadTargetConfig;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<CreateUploadMediaRequest, Builder> {
        private String regionId; 
        private String appId; 
        private String entityId; 
        private String fileInfo; 
        private String mediaMetaData; 
        private String postProcessConfig; 
        private String uploadTargetConfig; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(CreateUploadMediaRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.entityId = request.entityId;
            this.fileInfo = request.fileInfo;
            this.mediaMetaData = request.mediaMetaData;
            this.postProcessConfig = request.postProcessConfig;
            this.uploadTargetConfig = request.uploadTargetConfig;
            this.userData = request.userData;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The application ID. Default value: app-1000000.</p>
         * 
         * <strong>example:</strong>
         * <p>app-1000000</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The entity ID. You can call the CreateEntity operation to create an entity and customize the dynamic metadata structure.</p>
         * 
         * <strong>example:</strong>
         * <p>9e177cac2fb44f8b8c67b199fcc7bffd</p>
         */
        public Builder entityId(String entityId) {
            this.putQueryParameter("EntityId", entityId);
            this.entityId = entityId;
            return this;
        }

        /**
         * <p>The file information in JSON format. This parameter contains the following fields:</p>
         * <ul>
         * <li>Type (required): the file type. Valid values: video, image, audio, text, and other.</li>
         * <li>Name (required): the file name without the file name extension.</li>
         * <li>Size (optional): the file size.</li>
         * <li>Ext (required): the file name extension.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;Type\&quot;:\&quot;video\&quot;,\&quot;Name\&quot;:\&quot;test\&quot;,\&quot;Size\&quot;:108078336,\&quot;Ext\&quot;:\&quot;mp4\&quot;}</p>
         */
        public Builder fileInfo(String fileInfo) {
            this.putQueryParameter("FileInfo", fileInfo);
            this.fileInfo = fileInfo;
            return this;
        }

        /**
         * <p>The metadata of the media asset to upload, in JSON format.</p>
         * <p>Title (required):</p>
         * <ul>
         * <li>The maximum length is 128 characters.</li>
         * <li>UTF-8 encoded.</li>
         * </ul>
         * <p>Description (optional):</p>
         * <ul>
         * <li>The maximum length is 1024 characters.</li>
         * <li>UTF-8 encoded.</li>
         * </ul>
         * <p>CateId (optional): the category ID.</p>
         * <p>Tags (optional): the tags.</p>
         * <p>BusinessType (required): the business type. Valid values:</p>
         * <ul>
         * <li>When Type = video:
         * opening: opening credits. ending: ending credits.</li>
         * <li>When Type = image:
         * default: default.
         * cover: cover image.</li>
         * <li>When Type = text:
         * subtitles: subtitles.
         * font: font.</li>
         * <li>When Type = material:
         * watermark: watermark.</li>
         * <li>general: general-purpose.</li>
         * </ul>
         * <p>CoverURL (optional): the cover URL.</p>
         * <p>DynamicMetaData: the dynamic metadata. The value is a string.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;Title\&quot;: \&quot;UploadTest\&quot;, \&quot;Description\&quot;: \&quot;UploadImageTest\&quot;, \&quot;Tags\&quot;: \&quot;tag1,tag2\&quot;,\&quot;BusinessType\&quot;:\&quot;cover\&quot;}</p>
         */
        public Builder mediaMetaData(String mediaMetaData) {
            this.putQueryParameter("MediaMetaData", mediaMetaData);
            this.mediaMetaData = mediaMetaData;
            return this;
        }

        /**
         * <p>Specifies the post-upload processing action when Type = video or audio.</p>
         * <p>ProcessType: set to Workflow.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter triggers an <a href="https://help.aliyun.com/document_detail/3027141.html">asynchronous task</a>. After submission, the task is not immediately completed and enters a background queue for asynchronous execution.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;ProcessType\&quot;:\&quot;Workflow\&quot;,\&quot;ProcessID\&quot;:\&quot;74ba870f1a4873a3ba238e0bf6fa9***\&quot;}</p>
         */
        public Builder postProcessConfig(String postProcessConfig) {
            this.putQueryParameter("PostProcessConfig", postProcessConfig);
            this.postProcessConfig = postProcessConfig;
            return this;
        }

        /**
         * <p>The destination storage address.</p>
         * <ul>
         * <li>StorageType: only oss is supported.</li>
         * <li>StorageLocation: only VOD storage is supported. User-owned OSS storage is not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;StorageType\&quot;:\&quot;oss\&quot;,\&quot;StorageLocation\&quot;:\&quot;outin-***.oss-cn-shanghai.aliyuncs.com\&quot;}</p>
         */
        public Builder uploadTargetConfig(String uploadTargetConfig) {
            this.putQueryParameter("UploadTargetConfig", uploadTargetConfig);
            this.uploadTargetConfig = uploadTargetConfig;
            return this;
        }

        /**
         * <p>The custom settings. The value is a JSON string that supports settings such as message callbacks.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;MessageCallback&quot;:{&quot;CallbackURL&quot;:&quot;<a href="http://example.aliyundoc.com%22%7D,%22Extend%22:%7B%22localId%22:%22*****%22,%22test%22:%22www%22%7D%7D">http://example.aliyundoc.com&quot;},&quot;Extend&quot;:{&quot;localId&quot;:&quot;*****&quot;,&quot;test&quot;:&quot;www&quot;}}</a></p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public CreateUploadMediaRequest build() {
            return new CreateUploadMediaRequest(this);
        } 

    } 

}
