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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetImageInfoResponseBody model) {
            this.imageInfo = model.imageInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the image.</p>
         */
        public Builder imageInfo(ImageInfo imageInfo) {
            this.imageInfo = imageInfo;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>AB99D4DF-FAFA-49DC-9C548C1E261E****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetImageInfoResponseBody build() {
            return new GetImageInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetImageInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageInfoResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Mezzanine model) {
                this.fileSize = model.fileSize;
                this.fileURL = model.fileURL;
                this.height = model.height;
                this.originalFileName = model.originalFileName;
                this.width = model.width;
            } 

            /**
             * <p>The size of the image. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>8932</p>
             */
            public Builder fileSize(String fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * <p>The OSS URL of the image file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://outin-bfefbb*****163e1c7426.oss-cn-XXXXXXXX.aliyuncs.com/image/default/5E84CD536*****D4DAD.png?Expires=1590982353&OSSAccessKeyId=*****&Signature=ALPET74o*****c%3D">https://outin-bfefbb*****163e1c7426.oss-cn-XXXXXXXX.aliyuncs.com/image/default/5E84CD536*****D4DAD.png?Expires=1590982353&amp;OSSAccessKeyId=*****&amp;Signature=ALPET74o*****c%3D</a></p>
             */
            public Builder fileURL(String fileURL) {
                this.fileURL = fileURL;
                return this;
            }

            /**
             * <p>The height of the image. Unit: pixels.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The URL of the source file.</p>
             * 
             * <strong>example:</strong>
             * <p>****.gif</p>
             */
            public Builder originalFileName(String originalFileName) {
                this.originalFileName = originalFileName;
                return this;
            }

            /**
             * <p>The width of the image. Unit: pixels.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
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
    /**
     * 
     * {@link GetImageInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageInfoResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ImageInfo model) {
                this.appId = model.appId;
                this.cateId = model.cateId;
                this.cateName = model.cateName;
                this.creationTime = model.creationTime;
                this.description = model.description;
                this.imageId = model.imageId;
                this.imageType = model.imageType;
                this.mezzanine = model.mezzanine;
                this.status = model.status;
                this.storageLocation = model.storageLocation;
                this.tags = model.tags;
                this.title = model.title;
                this.URL = model.URL;
            } 

            /**
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>app-****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The ID of the category.</p>
             * 
             * <strong>example:</strong>
             * <p>254766071</p>
             */
            public Builder cateId(Long cateId) {
                this.cateId = cateId;
                return this;
            }

            /**
             * <p>The name of the category.</p>
             * 
             * <strong>example:</strong>
             * <p>test name</p>
             */
            public Builder cateName(String cateName) {
                this.cateName = cateName;
                return this;
            }

            /**
             * <p>The time when the image was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-11-21T02:37:23Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>test description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>bbc65bba53f9*****ed90de118a7849</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The type of the image. Valid values:</p>
             * <ul>
             * <li><strong>CoverSnapshot</strong>: thumbnail snapshot.</li>
             * <li><strong>NormalSnapshot</strong>: normal snapshot.</li>
             * <li><strong>SpriteSnapshot</strong>: sprite snapshot.</li>
             * <li><strong>SpriteOriginSnapshot</strong>: sprite source snapshot.</li>
             * <li><strong>All</strong>: images of all the preceding types. Multiple types other than All can return for this parameter. Multiple types are separated by commas (,).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NormalSnapshot</p>
             */
            public Builder imageType(String imageType) {
                this.imageType = imageType;
                return this;
            }

            /**
             * <p>The source information about the image.</p>
             */
            public Builder mezzanine(Mezzanine mezzanine) {
                this.mezzanine = mezzanine;
                return this;
            }

            /**
             * <p>The status of the image. Valid values:</p>
             * <ul>
             * <li><strong>Uploading</strong>: The image is being uploaded. This is the initial status.</li>
             * <li><strong>Normal</strong>: The image is uploaded.</li>
             * <li><strong>UploadFail</strong>: The image fails to be uploaded.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Uploading</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The bucket in which the image is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>outin-****..oss-cn-shanghai.aliyuncs.com</p>
             */
            public Builder storageLocation(String storageLocation) {
                this.storageLocation = storageLocation;
                return this;
            }

            /**
             * <p>The tags of the image. Multiple tags are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>tag1,tag2,tag3</p>
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The title of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>this is a sample</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The image URL. If a domain name for CDN is specified, a CDN URL is returned. Otherwise, an OSS URL is returned.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example.aliyundoc.com/image/default/****.gif?auth_key=">http://example.aliyundoc.com/image/default/****.gif?auth_key=</a>****</p>
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
