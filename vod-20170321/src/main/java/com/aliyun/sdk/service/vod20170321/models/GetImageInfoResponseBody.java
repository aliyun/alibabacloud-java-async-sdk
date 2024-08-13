// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetImageInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetImageInfoResponseBody</p>
 */
public class GetImageInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ImageInfo")
    private ImageInfo imageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetImageInfoResponseBody(Builder builder) {
        this.imageInfo = builder.imageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetImageInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return imageInfo
     */
    public ImageInfo getImageInfo() {
        return this.imageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ImageInfo imageInfo; 
        private String requestId; 

        /**
         * The information about the image.
         */
        public Builder imageInfo(ImageInfo imageInfo) {
            this.imageInfo = imageInfo;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetImageInfoResponseBody build() {
            return new GetImageInfoResponseBody(this);
        } 

    } 

    public static class Mezzanine extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileSize")
        private String fileSize;

        @com.aliyun.core.annotation.NameInMap("FileURL")
        private String fileURL;

        @com.aliyun.core.annotation.NameInMap("Height")
        private Integer height;

        @com.aliyun.core.annotation.NameInMap("OriginalFileName")
        private String originalFileName;

        @com.aliyun.core.annotation.NameInMap("Width")
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
             * The size of the image. Unit: bytes.
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
             * The URL of the source file.
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
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("CateId")
        private Long cateId;

        @com.aliyun.core.annotation.NameInMap("CateName")
        private String cateName;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageType")
        private String imageType;

        @com.aliyun.core.annotation.NameInMap("Mezzanine")
        private Mezzanine mezzanine;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StorageLocation")
        private String storageLocation;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private String tags;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("URL")
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
             * The ID of the category.
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
             * The ID of the image.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * The type of the image. Valid values:
             * <p>
             * 
             * *   **CoverSnapshot**: thumbnail snapshot.
             * *   **NormalSnapshot**: normal snapshot.
             * *   **SpriteSnapshot**: sprite snapshot.
             * *   **SpriteOriginSnapshot**: sprite source snapshot.
             * *   **All**: images of all the preceding types. Multiple types other than All can return for this parameter. Multiple types are separated by commas (,).
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
             * The status of the image. Valid values:
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
             * The tags of the image. Multiple tags are separated by commas (,).
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
