// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageCachesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageCachesResponseBody</p>
 */
public class DescribeImageCachesResponseBody extends TeaModel {
    @NameInMap("ImageCaches")
    private ImageCaches imageCaches;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeImageCachesResponseBody(Builder builder) {
        this.imageCaches = builder.imageCaches;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageCachesResponseBody create() {
        return builder().build();
    }

    /**
     * @return imageCaches
     */
    public ImageCaches getImageCaches() {
        return this.imageCaches;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private ImageCaches imageCaches; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * ImageCaches.
         */
        public Builder imageCaches(ImageCaches imageCaches) {
            this.imageCaches = imageCaches;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeImageCachesResponseBody build() {
            return new DescribeImageCachesResponseBody(this);
        } 

    } 

    public static class ImageCache extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("Status")
        private String status;

        private ImageCache(Builder builder) {
            this.creationTime = builder.creationTime;
            this.imageId = builder.imageId;
            this.progress = builder.progress;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageCache create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String creationTime; 
            private String imageId; 
            private String progress; 
            private String status; 

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ImageCache build() {
                return new ImageCache(this);
            } 

        } 

    }
    public static class ImageCaches extends TeaModel {
        @NameInMap("ImageCache")
        private java.util.List < ImageCache> imageCache;

        private ImageCaches(Builder builder) {
            this.imageCache = builder.imageCache;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageCaches create() {
            return builder().build();
        }

        /**
         * @return imageCache
         */
        public java.util.List < ImageCache> getImageCache() {
            return this.imageCache;
        }

        public static final class Builder {
            private java.util.List < ImageCache> imageCache; 

            /**
             * ImageCache.
             */
            public Builder imageCache(java.util.List < ImageCache> imageCache) {
                this.imageCache = imageCache;
                return this;
            }

            public ImageCaches build() {
                return new ImageCaches(this);
            } 

        } 

    }
}
