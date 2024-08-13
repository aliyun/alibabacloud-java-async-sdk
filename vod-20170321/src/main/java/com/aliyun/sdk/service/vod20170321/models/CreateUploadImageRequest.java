// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUploadImageRequest} extends {@link RequestModel}
 *
 * <p>CreateUploadImageRequest</p>
 */
public class CreateUploadImageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CateId")
    private Long cateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageExt")
    private String imageExt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OriginalFileName")
    private String originalFileName;

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

    private CreateUploadImageRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.cateId = builder.cateId;
        this.description = builder.description;
        this.imageExt = builder.imageExt;
        this.imageType = builder.imageType;
        this.originalFileName = builder.originalFileName;
        this.storageLocation = builder.storageLocation;
        this.tags = builder.tags;
        this.title = builder.title;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUploadImageRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return imageExt
     */
    public String getImageExt() {
        return this.imageExt;
    }

    /**
     * @return imageType
     */
    public String getImageType() {
        return this.imageType;
    }

    /**
     * @return originalFileName
     */
    public String getOriginalFileName() {
        return this.originalFileName;
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

    public static final class Builder extends Request.Builder<CreateUploadImageRequest, Builder> {
        private String appId; 
        private Long cateId; 
        private String description; 
        private String imageExt; 
        private String imageType; 
        private String originalFileName; 
        private String storageLocation; 
        private String tags; 
        private String title; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(CreateUploadImageRequest request) {
            super(request);
            this.appId = request.appId;
            this.cateId = request.cateId;
            this.description = request.description;
            this.imageExt = request.imageExt;
            this.imageType = request.imageType;
            this.originalFileName = request.originalFileName;
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
         * The category ID of the image. You can use one of the following methods to obtain the category ID:
         * <p>
         * 
         * *   Log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Configuration Management** > **Media Management** > **Categories**. On the Categories page, you can view the category ID of the image.
         * *   Obtain the value of CateId from the response to the [AddCategory](~~56401~~) operation.
         * *   Obtain the value of CateId from the response to the [GetCategories](~~56406~~) operation.
         */
        public Builder cateId(Long cateId) {
            this.putQueryParameter("CateId", cateId);
            this.cateId = cateId;
            return this;
        }

        /**
         * The description of the image.
         * <p>
         * 
         * *   The description can be up to 1,024 characters in length.
         * *   The value must be encoded in UTF-8.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The file name extension of the image. Valid values:
         * <p>
         * 
         * *   **png** (default)
         * *   **jpg**
         * *   **jpeg**
         * *   **gif**
         */
        public Builder imageExt(String imageExt) {
            this.putQueryParameter("ImageExt", imageExt);
            this.imageExt = imageExt;
            return this;
        }

        /**
         * The type of the image. Valid values:
         * <p>
         * 
         * *   **default**: the default image type.
         * *   **cover**: the thumbnail.
         * 
         * > You can manage only images of the **default** type in the ApsaraVideo VOD console.
         */
        public Builder imageType(String imageType) {
            this.putQueryParameter("ImageType", imageType);
            this.imageType = imageType;
            return this;
        }

        /**
         * The name of the source file.
         * <p>
         * 
         * > The name must contain a file name extension. The file name extension is not case-sensitive.
         */
        public Builder originalFileName(String originalFileName) {
            this.putQueryParameter("OriginalFileName", originalFileName);
            this.originalFileName = originalFileName;
            return this;
        }

        /**
         * The storage address. Perform the following operations to obtain the storage address: Log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Configuration Management** > **Media Management** > **Storage**. On the Storage page, view the storage address.
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
         * The tags of the image. The following rules apply:
         * <p>
         * 
         * *   Each tag can be up to 32 characters in length.
         * *   You can specify a maximum of 16 tags for an image.
         * *   Separate multiple tags with commas (,).
         * *   The value must be encoded in UTF-8.
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * The title of the image. The following rules apply:
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
         * The custom configurations, including callback configurations and upload acceleration configurations. The value must be a JSON string. For more information, see the "UserData: specifies the custom configurations for media upload" section of the [Request parameters](~~86952~~) topic.
         * <p>
         * 
         * > *   The callback configurations take effect only after you specify the HTTP callback URL and select specific callback events in the ApsaraVideo VOD console. For more information about how to configure HTTP callback settings in the ApsaraVideo VOD console, see [Configure callback settings](~~86071~~).
         * > *   If you want to enable the upload acceleration feature, submit a ticket. For more information, see [Overview](~~55396~~). For more information about how to submit a ticket, see [Contact us](~~464625~~).
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public CreateUploadImageRequest build() {
            return new CreateUploadImageRequest(this);
        } 

    } 

}
