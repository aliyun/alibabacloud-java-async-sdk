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
         * <p>The ID of the application. Default value: <strong>app-1000000</strong>. If you have activated the multi-application service, specify the ID of the application to add the watermark template in the specified application. For more information, see <a href="https://help.aliyun.com/document_detail/113600.html">Overview</a>.</p>
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
         * <li><strong>watermark</strong></li>
         * <li><strong>subtitle</strong></li>
         * <li><strong>material</strong></li>
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
         * <p>The ID of the category. Separate multiple IDs with commas (,). You can specify up to five IDs. You can use one of the following methods to obtain the ID:</p>
         * <ul>
         * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>. In the left-side navigation pane, choose <strong>Configuration Management</strong> &gt; <strong>Media Management</strong> &gt; <strong>Categories</strong> to view the category ID of the media file.</li>
         * <li>Obtain the category ID from the response to the <a href="~~AddCategory~~">AddCategory</a> operation that you call to create a category.</li>
         * <li>Obtain the category ID from the response to the <a href="~~GetCategories~~">GetCategories</a> operation that you call to query categories.</li>
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
         * <p>The description of the auxiliary media asset. Take note of the following items:</p>
         * <ul>
         * <li>The description can be up to 1,024 bytes in length.</li>
         * <li>The value must be encoded in UTF-8.</li>
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
         * <p>The source file URL of the auxiliary media asset.</p>
         * <blockquote>
         * <p> The file name extension is optional. If the file name extension that you specified for this parameter is different from the value of MediaExt, the value of MediaExt takes effect.</p>
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
         * <p>The size of the auxiliary media asset. Unit: byte.</p>
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
         * <p>The file name extension of the auxiliary media asset.</p>
         * <ul>
         * <li>Valid values for watermarks: <strong>png, gif, apng, and mov</strong></li>
         * <li>Valid values for subtitles: <strong>srt, ass, stl, ttml, and vtt</strong></li>
         * <li>Valid values for materials: <strong>jpg, gif, png, mp4, mat, zip, and apk</strong></li>
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
         * <p>The storage address. Perform the following operations to obtain the storage address:</p>
         * <p>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>. In the left-side navigation pane, choose <strong>Configuration Management</strong> &gt; <strong>Media Management</strong> &gt; <strong>Storage</strong>. On the Storage page, view the storage address.</p>
         * <blockquote>
         * <p> If you leave this parameter empty, the auxiliary media asset is uploaded to the default storage address. If you specify this parameter, the auxiliary media asset is uploaded to the specified storage address.</p>
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
         * <p>The one or more tags of the auxiliary media asset. Take note of the following items:</p>
         * <ul>
         * <li>You can specify a maximum of 16 tags.</li>
         * <li>If you need to specify multiple tags, separate the tags with commas (,).</li>
         * <li>Each tag can be up to 32 characters in length.</li>
         * <li>The value must be encoded in UTF-8.</li>
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
         * <p>The title of the auxiliary media asset. The following rules apply:</p>
         * <ul>
         * <li>The title cannot exceed 128 bytes.</li>
         * <li>The title must be encoded in UTF-8.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>testTitle</p>
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * <p>The custom configurations. For example, you can specify callback configurations and upload acceleration configurations. The value must be a JSON string. For more information, see <a href="~~86952#section-6fg-qll-v3w~~">Request parameters</a>.</p>
         * <blockquote>
         * <ul>
         * <li>The callback configurations take effect only after you specify the HTTP callback URL and select the specific callback events in the ApsaraVideo VOD console. For more information about how to configure HTTP callback settings in the ApsaraVideo VOD console, see <a href="https://help.aliyun.com/document_detail/86071.html">Configure callback settings</a>.</li>
         * <li>If you want to enable the upload acceleration feature, submit a ticket. For more information, see <a href="https://help.aliyun.com/document_detail/55396.html">Overview</a>. For more information about how to submit a ticket, see <a href="https://help.aliyun.com/document_detail/464625.html">Contact us</a>.</li>
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
