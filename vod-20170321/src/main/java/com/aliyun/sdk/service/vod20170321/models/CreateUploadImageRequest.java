// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUploadImageRequest} extends {@link RequestModel}
 *
 * <p>CreateUploadImageRequest</p>
 */
public class CreateUploadImageRequest extends Request {
    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("CateId")
    private Long cateId;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("ImageExt")
    private String imageExt;

    @Query
    @NameInMap("ImageType")
    @Validation(required = true)
    private String imageType;

    @Query
    @NameInMap("OriginalFileName")
    private String originalFileName;

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
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * CateId.
         */
        public Builder cateId(Long cateId) {
            this.putQueryParameter("CateId", cateId);
            this.cateId = cateId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * ImageExt.
         */
        public Builder imageExt(String imageExt) {
            this.putQueryParameter("ImageExt", imageExt);
            this.imageExt = imageExt;
            return this;
        }

        /**
         * ImageType.
         */
        public Builder imageType(String imageType) {
            this.putQueryParameter("ImageType", imageType);
            this.imageType = imageType;
            return this;
        }

        /**
         * 图片源文件名称。
         * <p>
         * 
         * > 必须带扩展名，且扩展名不区分大小写。
         */
        public Builder originalFileName(String originalFileName) {
            this.putQueryParameter("OriginalFileName", originalFileName);
            this.originalFileName = originalFileName;
            return this;
        }

        /**
         * StorageLocation.
         */
        public Builder storageLocation(String storageLocation) {
            this.putQueryParameter("StorageLocation", storageLocation);
            this.storageLocation = storageLocation;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * UserData.
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
