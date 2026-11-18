// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link CreateUploadAttachedMediaRequest} extends {@link RequestModel}
 *
 * <p>CreateUploadAttachedMediaRequest</p>
 */
public class CreateUploadAttachedMediaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String businessType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CateIds")
    private String cateIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileName")
    private String fileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSize")
    private String fileSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaExt")
    private String mediaExt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageLocation")
    private String storageLocation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private String tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private CreateUploadAttachedMediaRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.businessType = builder.businessType;
        this.cateIds = builder.cateIds;
        this.description = builder.description;
        this.fileName = builder.fileName;
        this.fileSize = builder.fileSize;
        this.mediaExt = builder.mediaExt;
        this.storageLocation = builder.storageLocation;
        this.tags = builder.tags;
        this.title = builder.title;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUploadAttachedMediaRequest create() {
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
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
    }

    /**
     * @return cateIds
     */
    public String getCateIds() {
        return this.cateIds;
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
    public String getFileSize() {
        return this.fileSize;
    }

    /**
     * @return mediaExt
     */
    public String getMediaExt() {
        return this.mediaExt;
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

    public static final class Builder extends Request.Builder<CreateUploadAttachedMediaRequest, Builder> {
        private String appId; 
        private String businessType; 
        private String cateIds; 
        private String description; 
        private String fileName; 
        private String fileSize; 
        private String mediaExt; 
        private String storageLocation; 
        private String tags; 
        private String title; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(CreateUploadAttachedMediaRequest request) {
            super(request);
            this.appId = request.appId;
            this.businessType = request.businessType;
            this.cateIds = request.cateIds;
            this.description = request.description;
            this.fileName = request.fileName;
            this.fileSize = request.fileSize;
            this.mediaExt = request.mediaExt;
            this.storageLocation = request.storageLocation;
            this.tags = request.tags;
            this.title = request.title;
            this.userData = request.userData;
        } 

        /**
         * <p>The application ID. Default value: <strong>app-1000000</strong>. If the multi-application system is enabled, you can specify an application ID to upload the auxiliary media asset to the specified application. For more information, see <a href="https://help.aliyun.com/document_detail/113600.html">Multi-application</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>app-****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The type of the auxiliary media asset. Valid values:</p>
         * <ul>
         * <li><strong>watermark</strong>: watermark</li>
         * <li><strong>subtitle</strong>: subtitle</li>
         * <li><strong>material</strong>: material</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>watermark</p>
         */
        public Builder businessType(String businessType) {
            this.putQueryParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * <p>The category IDs. Separate multiple IDs with commas (,). A maximum of five IDs are supported. You can obtain the IDs by using the following methods:</p>
         * <ul>
         * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Configuration Management</strong> &gt; <strong>Media Asset Management Configuration</strong> &gt; <strong>Category Management</strong> to view the category IDs.</li>
         * <li>Call the <a href="~~AddCategory~~">AddCategory</a> operation to create a category. The category ID is returned in the response.</li>
         * <li>Call the <a href="~~GetCategories~~">GetCategories</a> operation to query categories. The category IDs are returned in the response.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1298****,0813****</p>
         */
        public Builder cateIds(String cateIds) {
            this.putQueryParameter("CateIds", cateIds);
            this.cateIds = cateIds;
            return this;
        }

        /**
         * <p>The media asset description. Rules:</p>
         * <ul>
         * <li>The length cannot exceed 1,024 bytes.</li>
         * <li>The description must be encoded in UTF-8.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>uploadTest</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The source file URL of the auxiliary media asset to be uploaded.</p>
         * <blockquote>
         * <p>The file name extension is optional. If a file name extension is included and it is different from the file name extension specified in MediaExt, the value of MediaExt prevails.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>D:\test.png</p>
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>The file size. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder fileSize(String fileSize) {
            this.putQueryParameter("FileSize", fileSize);
            this.fileSize = fileSize;
            return this;
        }

        /**
         * <p>The file name extension of the resource file of the auxiliary media asset to be uploaded. Valid values:</p>
         * <ul>
         * <li>Watermark: <strong>png, gif, apng, and mov</strong></li>
         * <li>Subtitle: <strong>srt, ass, stl, ttml, and vtt</strong></li>
         * <li>Material: <strong>jpg, gif, png, mp4, mat, zip, and apk</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>png</p>
         */
        public Builder mediaExt(String mediaExt) {
            this.putQueryParameter("MediaExt", mediaExt);
            this.mediaExt = mediaExt;
            return this;
        }

        /**
         * <p>The storage address. You can obtain it by using the following method:</p>
         * <p>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Configuration Management</strong> &gt; <strong>Media Asset Management Configuration</strong> &gt; <strong>Storage Management</strong> to view the storage address.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the auxiliary media asset is uploaded to the default storage address. If you specify this parameter, the auxiliary media asset is uploaded to the specified storage address.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>out-****.oss-cn-shanghai.aliyuncs.com</p>
         */
        public Builder storageLocation(String storageLocation) {
            this.putQueryParameter("StorageLocation", storageLocation);
            this.storageLocation = storageLocation;
            return this;
        }

        /**
         * <p>The tags. Rules:</p>
         * <ul>
         * <li>A maximum of 16 tags can be set.</li>
         * <li>Separate multiple tags with commas (,).</li>
         * <li>A single tag cannot exceed 32 characters.</li>
         * <li>The tags must be encoded in UTF-8.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tag1,tag2</p>
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The title of the auxiliary media asset. Rules:</p>
         * <ul>
         * <li>The length cannot exceed 128 bytes.</li>
         * <li>The title must be encoded in UTF-8.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * <p>The custom settings. The value is a JSON string that supports settings such as message callback and upload acceleration. For more information, see <a href="~~86952#section-6fg-qll-v3w~~">UserData</a>.</p>
         * <blockquote>
         * <ul>
         * <li>To use the message callback feature in this parameter, you must configure an HTTP callback URL in the console and select the corresponding callback event type. Otherwise, the callback settings do not take effect. For more information about how to configure HTTP callbacks in the console, see <a href="https://help.aliyun.com/document_detail/86071.html">Callback settings</a>.</li>
         * <li>To use the upload acceleration feature, submit a ticket to apply for activation. For more information, see <a href="https://help.aliyun.com/document_detail/55396.html">Upload instructions</a>. For more information about how to submit a ticket, see <a href="https://help.aliyun.com/document_detail/464625.html">Contact us</a>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;MessageCallback&quot;:{&quot;CallbackURL&quot;:&quot;<a href="http://example.aliyundoc.com%22%7D,%22Extend%22:%7B%22localId%22:%22xxx%22,%22test%22:%22www%22%7D%7D">http://example.aliyundoc.com&quot;},&quot;Extend&quot;:{&quot;localId&quot;:&quot;xxx&quot;,&quot;test&quot;:&quot;www&quot;}}</a></p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public CreateUploadAttachedMediaRequest build() {
            return new CreateUploadAttachedMediaRequest(this);
        } 

    } 

}
