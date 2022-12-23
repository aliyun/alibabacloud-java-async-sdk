// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetImageInfosResponseBody} extends {@link TeaModel}
 *
 * <p>GetImageInfosResponseBody</p>
 */
public class GetImageInfosResponseBody extends TeaModel {
    @NameInMap("ImageInfo")
    private java.util.List < ImageInfo> imageInfo;

    @NameInMap("NonExistImageIds")
    private java.util.List < String > nonExistImageIds;

    @NameInMap("RequestId")
    private String requestId;

    private GetImageInfosResponseBody(Builder builder) {
        this.imageInfo = builder.imageInfo;
        this.nonExistImageIds = builder.nonExistImageIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetImageInfosResponseBody create() {
        return builder().build();
    }

    /**
     * @return imageInfo
     */
    public java.util.List < ImageInfo> getImageInfo() {
        return this.imageInfo;
    }

    /**
     * @return nonExistImageIds
     */
    public java.util.List < String > getNonExistImageIds() {
        return this.nonExistImageIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ImageInfo> imageInfo; 
        private java.util.List < String > nonExistImageIds; 
        private String requestId; 

        /**
         * The image information.
         */
        public Builder imageInfo(java.util.List < ImageInfo> imageInfo) {
            this.imageInfo = imageInfo;
            return this;
        }

        /**
         * The IDs of the images that do not exist.
         */
        public Builder nonExistImageIds(java.util.List < String > nonExistImageIds) {
            this.nonExistImageIds = nonExistImageIds;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetImageInfosResponseBody build() {
            return new GetImageInfosResponseBody(this);
        } 

    } 

    public static class Mezzanine extends TeaModel {
        @NameInMap("FileSize")
        private String fileSize;

        @NameInMap("FileURL")
        private String fileURL;

        @NameInMap("Height")
        private Integer height;

        @NameInMap("OriginalFileName")
        private String originalFileName;

        @NameInMap("Width")
        private Integer width;

        private Mezzanine(Builder builder) {
            this.fileSize = builder.fileSize;
            this.fileURL = builder.fileURL;
            this.height = builder.height;
            this.originalFileName = builder.originalFileName;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Mezzanine create() {
            return builder().build();
        }

        /**
         * @return fileSize
         */
        public String getFileSize() {
            return this.fileSize;
        }

        /**
         * @return fileURL
         */
        public String getFileURL() {
            return this.fileURL;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return originalFileName
         */
        public String getOriginalFileName() {
            return this.originalFileName;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String fileSize; 
            private String fileURL; 
            private Integer height; 
            private String originalFileName; 
            private Integer width; 

            /**
             * The size of the image file. Unit: bytes.
             */
            public Builder fileSize(String fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * The OSS URL of the image file.
             */
            public Builder fileURL(String fileURL) {
                this.fileURL = fileURL;
                return this;
            }

            /**
             * The height of the image. Unit: pixels.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * The name of the source file.
             */
            public Builder originalFileName(String originalFileName) {
                this.originalFileName = originalFileName;
                return this;
            }

            /**
             * The width of the image. Unit: pixels.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public Mezzanine build() {
                return new Mezzanine(this);
            } 

        } 

    }
    public static class ImageInfo extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("CateId")
        private Long cateId;

        @NameInMap("CateName")
        private String cateName;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("ImageType")
        private String imageType;

        @NameInMap("Mezzanine")
        private Mezzanine mezzanine;

        @NameInMap("Status")
        private String status;

        @NameInMap("StorageLocation")
        private String storageLocation;

        @NameInMap("Tags")
        private String tags;

        @NameInMap("Title")
        private String title;

        @NameInMap("URL")
        private String URL;

        private ImageInfo(Builder builder) {
            this.appId = builder.appId;
            this.cateId = builder.cateId;
            this.cateName = builder.cateName;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.imageId = builder.imageId;
            this.imageType = builder.imageType;
            this.mezzanine = builder.mezzanine;
            this.status = builder.status;
            this.storageLocation = builder.storageLocation;
            this.tags = builder.tags;
            this.title = builder.title;
            this.URL = builder.URL;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageInfo create() {
            return builder().build();
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
         * @return cateName
         */
        public String getCateName() {
            return this.cateName;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return imageType
         */
        public String getImageType() {
            return this.imageType;
        }

        /**
         * @return mezzanine
         */
        public Mezzanine getMezzanine() {
            return this.mezzanine;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
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
         * @return URL
         */
        public String getURL() {
            return this.URL;
        }

        public static final class Builder {
            private String appId; 
            private Long cateId; 
            private String cateName; 
            private String creationTime; 
            private String description; 
            private String imageId; 
            private String imageType; 
            private Mezzanine mezzanine; 
            private String status; 
            private String storageLocation; 
            private String tags; 
            private String title; 
            private String URL; 

            /**
             * The ID of the application.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The ID of the category to which the image belongs.
             */
            public Builder cateId(Long cateId) {
                this.cateId = cateId;
                return this;
            }

            /**
             * The name of the category.
             */
            public Builder cateName(String cateName) {
                this.cateName = cateName;
                return this;
            }

            /**
             * The time when the image was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The description of the image.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the image file.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * The type of the image. Valid values:
             * <p>
             * 
             * *   **CoverSnapshot**: thumbnail snapshot
             * *   **NormalSnapshot**: normal snapshot
             * *   **SpriteSnapshot**: sprite snapshot
             * *   **SpriteOriginSnapshot**: sprite source snapshot
             * *   **All**: images of all the preceding types. If this parameter is not set to All, you can specify multiple types and separate the types with commas (,).
             */
            public Builder imageType(String imageType) {
                this.imageType = imageType;
                return this;
            }

            /**
             * The source information about the image.
             */
            public Builder mezzanine(Mezzanine mezzanine) {
                this.mezzanine = mezzanine;
                return this;
            }

            /**
             * The status of the image file. Valid values:
             * <p>
             * 
             * *   **Uploading**: The image is being uploaded. This is the initial status.
             * *   **Normal**: The image is uploaded.
             * *   **UploadFail**: The image fails to be uploaded.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The bucket in which the image is stored.
             */
            public Builder storageLocation(String storageLocation) {
                this.storageLocation = storageLocation;
                return this;
            }

            /**
             * The tags of the image. Separate multiple tags with commas (,).
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The title of the image.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * The image URL. If a domain name for CDN is specified, a CDN URL is returned. Otherwise, an OSS URL is returned.
             */
            public Builder URL(String URL) {
                this.URL = URL;
                return this;
            }

            public ImageInfo build() {
                return new ImageInfo(this);
            } 

        } 

    }
}
