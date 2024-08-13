// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The ID of the application. Default value: **app-1000000**. If you have activated the multi-application service, specify the ID of the application to add the watermark template in the specified application. For more information, see [Overview](~~113600~~).
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The type of the auxiliary media asset. Valid values:
         * <p>
         * 
         * *   **watermark**
         * *   **subtitle**
         * *   **material**
         */
        public Builder businessType(String businessType) {
            this.putQueryParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * The ID of the category. Separate multiple IDs with commas (,). You can specify up to five IDs. You can use one of the following methods to obtain the ID:
         * <p>
         * 
         * *   Log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Configuration Management** > **Media Management** > **Categories** to view the category ID of the media file.
         * *   Obtain the category ID from the response to the [AddCategory](~~AddCategory~~) operation that you call to create a category.
         * *   Obtain the category ID from the response to the [GetCategories](~~GetCategories~~) operation that you call to query categories.
         */
        public Builder cateIds(String cateIds) {
            this.putQueryParameter("CateIds", cateIds);
            this.cateIds = cateIds;
            return this;
        }

        /**
         * The description of the auxiliary media asset. Take note of the following items:
         * <p>
         * 
         * *   The description can be up to 1,024 bytes in length.
         * *   The value must be encoded in UTF-8.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The source file URL of the auxiliary media asset.
         * <p>
         * 
         * >  The file name extension is optional. If the file name extension that you specified for this parameter is different from the value of MediaExt, the value of MediaExt takes effect.
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * The size of the auxiliary media asset. Unit: byte.
         */
        public Builder fileSize(String fileSize) {
            this.putQueryParameter("FileSize", fileSize);
            this.fileSize = fileSize;
            return this;
        }

        /**
         * The file name extension of the auxiliary media asset.
         * <p>
         * 
         * *   Valid values for watermarks: **png, gif, apng, and mov**
         * *   Valid values for subtitles: **srt, ass, stl, ttml, and vtt**
         * *   Valid values for materials: **jpg, gif, png, mp4, mat, zip, and apk**
         */
        public Builder mediaExt(String mediaExt) {
            this.putQueryParameter("MediaExt", mediaExt);
            this.mediaExt = mediaExt;
            return this;
        }

        /**
         * The storage address. Perform the following operations to obtain the storage address:
         * <p>
         * 
         * Log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Configuration Management** > **Media Management** > **Storage**. On the Storage page, view the storage address.
         * 
         * >  If you leave this parameter empty, the auxiliary media asset is uploaded to the default storage address. If you specify this parameter, the auxiliary media asset is uploaded to the specified storage address.
         */
        public Builder storageLocation(String storageLocation) {
            this.putQueryParameter("StorageLocation", storageLocation);
            this.storageLocation = storageLocation;
            return this;
        }

        /**
         * The one or more tags of the auxiliary media asset. Take note of the following items:
         * <p>
         * 
         * *   You can specify a maximum of 16 tags.
         * *   If you need to specify multiple tags, separate the tags with commas (,).
         * *   Each tag can be up to 32 characters in length.
         * *   The value must be encoded in UTF-8.
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * The title of the auxiliary media asset. The following rules apply:
         * <p>
         * 
         * *   The title cannot exceed 128 bytes.
         * *   The title must be encoded in UTF-8.
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * The custom configurations. For example, you can specify callback configurations and upload acceleration configurations. The value must be a JSON string. For more information, see [Request parameters](~~86952#section-6fg-qll-v3w~~).
         * <p>
         * 
         * > *   The callback configurations take effect only after you specify the HTTP callback URL and select the specific callback events in the ApsaraVideo VOD console. For more information about how to configure HTTP callback settings in the ApsaraVideo VOD console, see [Configure callback settings](~~86071~~).
         * > *   If you want to enable the upload acceleration feature, submit a ticket. For more information, see [Overview](~~55396~~). For more information about how to submit a ticket, see [Contact us](~~464625~~).
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
