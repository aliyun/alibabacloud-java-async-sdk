// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.acc20240402.models;

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
 * {@link ListImageCachesResponseBody} extends {@link TeaModel}
 *
 * <p>ListImageCachesResponseBody</p>
 */
public class ListImageCachesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ImageCaches")
    private java.util.List<ImageCaches> imageCaches;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListImageCachesResponseBody(Builder builder) {
        this.imageCaches = builder.imageCaches;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListImageCachesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageCaches
     */
    public java.util.List<ImageCaches> getImageCaches() {
        return this.imageCaches;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
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
        private java.util.List<ImageCaches> imageCaches; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListImageCachesResponseBody model) {
            this.imageCaches = model.imageCaches;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * ImageCaches.
         */
        public Builder imageCaches(java.util.List<ImageCaches> imageCaches) {
            this.imageCaches = imageCaches;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
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

        public ListImageCachesResponseBody build() {
            return new ListImageCachesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListImageCachesResponseBody} extends {@link TeaModel}
     *
     * <p>ListImageCachesResponseBody</p>
     */
    public static class ImageCaches extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ImageCacheId")
        private String imageCacheId;

        @com.aliyun.core.annotation.NameInMap("ImageCacheName")
        private String imageCacheName;

        @com.aliyun.core.annotation.NameInMap("Images")
        private java.util.List<String> images;

        @com.aliyun.core.annotation.NameInMap("ReadyTime")
        private String readyTime;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ImageCaches(Builder builder) {
            this.createTime = builder.createTime;
            this.imageCacheId = builder.imageCacheId;
            this.imageCacheName = builder.imageCacheName;
            this.images = builder.images;
            this.readyTime = builder.readyTime;
            this.resourceGroupId = builder.resourceGroupId;
            this.size = builder.size;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageCaches create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return imageCacheId
         */
        public String getImageCacheId() {
            return this.imageCacheId;
        }

        /**
         * @return imageCacheName
         */
        public String getImageCacheName() {
            return this.imageCacheName;
        }

        /**
         * @return images
         */
        public java.util.List<String> getImages() {
            return this.images;
        }

        /**
         * @return readyTime
         */
        public String getReadyTime() {
            return this.readyTime;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String createTime; 
            private String imageCacheId; 
            private String imageCacheName; 
            private java.util.List<String> images; 
            private String readyTime; 
            private String resourceGroupId; 
            private Integer size; 
            private String status; 

            private Builder() {
            } 

            private Builder(ImageCaches model) {
                this.createTime = model.createTime;
                this.imageCacheId = model.imageCacheId;
                this.imageCacheName = model.imageCacheName;
                this.images = model.images;
                this.readyTime = model.readyTime;
                this.resourceGroupId = model.resourceGroupId;
                this.size = model.size;
                this.status = model.status;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ImageCacheId.
             */
            public Builder imageCacheId(String imageCacheId) {
                this.imageCacheId = imageCacheId;
                return this;
            }

            /**
             * ImageCacheName.
             */
            public Builder imageCacheName(String imageCacheName) {
                this.imageCacheName = imageCacheName;
                return this;
            }

            /**
             * Images.
             */
            public Builder images(java.util.List<String> images) {
                this.images = images;
                return this;
            }

            /**
             * ReadyTime.
             */
            public Builder readyTime(String readyTime) {
                this.readyTime = readyTime;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ImageCaches build() {
                return new ImageCaches(this);
            } 

        } 

    }
}
