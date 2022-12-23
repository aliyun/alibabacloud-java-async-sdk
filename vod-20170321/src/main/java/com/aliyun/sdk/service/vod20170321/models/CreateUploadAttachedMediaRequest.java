// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUploadAttachedMediaRequest} extends {@link RequestModel}
 *
 * <p>CreateUploadAttachedMediaRequest</p>
 */
public class CreateUploadAttachedMediaRequest extends Request {
    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("BusinessType")
    @Validation(required = true)
    private String businessType;

    @Query
    @NameInMap("CateIds")
    private String cateIds;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("FileName")
    private String fileName;

    @Query
    @NameInMap("FileSize")
    private String fileSize;

    @Query
    @NameInMap("MediaExt")
    private String mediaExt;

    @Query
    @NameInMap("StorageLocation")
    private String storageLocation;

    @Query
    @NameInMap("Tags")
    private String tags;

    @Query
    @NameInMap("Title")
    private String title;

    @Query
    @NameInMap("UserData")
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
         * The ID of the application. Default value: **app-1000000**. For more information, see [Overview](~~113600~~).
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The type of the media asset. Valid values:
         * <p>
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
         * The one or more category IDs of the auxiliary media asset. Separate multiple category IDs with commas (,). A maximum of five category IDs can be specified. You can use one of the following methods to obtain the category ID:
         * <p>
         * *   Log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Configuration Management** > **Media Management** > **Categories**. On the Categories page, you can view the category ID.
         * *   View the value of the CateId parameter returned by the [AddCategory](~~56401~~) operation that you called to create a category.
         * *   View the value of the CateId parameter returned by the [GetCategories](~~56406~~) operation that you called to query a category.
         */
        public Builder cateIds(String cateIds) {
            this.putQueryParameter("CateIds", cateIds);
            this.cateIds = cateIds;
            return this;
        }

        /**
         * The description of the auxiliary media asset. Take note of the following items:
         * <p>
         * *   The description can be up to 1,024 bytes in length.
         * *   The value must be encoded in UTF-8.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The name of the source file.
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
         * The file name extension. Valid values:
         * <p>
         * *   Valid values for watermarks: **png, gif, apng, and mov**
         * *   Valid values for subtitles: **srt, ass, stl, ttml, and vtt**
         * *   Valid values for materials: **jpg, gif, png, mp4, mat, and zip**
         */
        public Builder mediaExt(String mediaExt) {
            this.putQueryParameter("MediaExt", mediaExt);
            this.mediaExt = mediaExt;
            return this;
        }

        /**
         * The storage location. You can use one of the following methods to obtain the storage location:
         * <p>
         * 
         * Log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Configuration Management** > **Media Management** > **Storage**. On the Storage page, you can view the storage location.
         * > If this parameter is set to a specific value, the auxiliary media asset is uploaded to the specified storage location.
         */
        public Builder storageLocation(String storageLocation) {
            this.putQueryParameter("StorageLocation", storageLocation);
            this.storageLocation = storageLocation;
            return this;
        }

        /**
         * The one or more tags of the auxiliary media asset. Take note of the following items:
         * <p>
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
         * The title of the media asset. Take note of the following items:
         * <p>
         * *   The title can be up to 128 bytes in length.
         * *   The value must be encoded in UTF-8.
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * The custom configurations, including callback configurations and upload acceleration configurations. The value is a JSON string. For more information, see the "UserData: specifies the custom configurations for media upload" section of the [Request parameters](~~86952~~) topic.
         * <p>
         * > *   The callback configurations take effect only after you specify the HTTP callback URL and select the specific callback events in the ApsaraVideo VOD console. For more information about how to configure an HTTP callback in the ApsaraVideo VOD console, see [Configure callback settings](~~86071~~).
         * > *   To use the upload acceleration feature, submit a [ticket](https://ticket-intl.console.aliyun.com/#/ticket/createIndex) to enable this feature. For more information, see [Overview](~~55396~~).
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
