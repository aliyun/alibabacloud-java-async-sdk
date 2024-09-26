// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeImageCachesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageCachesResponseBody</p>
 */
public class DescribeImageCachesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ImageCaches")
    private java.util.List < ImageCaches> imageCaches;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
    public java.util.List < ImageCaches> getImageCaches() {
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
        private java.util.List < ImageCaches> imageCaches; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The information about image caches.</p>
         */
        public Builder imageCaches(java.util.List < ImageCaches> imageCaches) {
            this.imageCaches = imageCaches;
            return this;
        }

        /**
         * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAdDWBF2****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>39FC2E43-3DD7-4CEF-9EF4-E4AD6E635301</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeImageCachesResponseBody build() {
            return new DescribeImageCachesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeImageCachesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageCachesResponseBody</p>
     */
    public static class Events extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("FirstTimestamp")
        private String firstTimestamp;

        @com.aliyun.core.annotation.NameInMap("LastTimestamp")
        private String lastTimestamp;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Events(Builder builder) {
            this.count = builder.count;
            this.firstTimestamp = builder.firstTimestamp;
            this.lastTimestamp = builder.lastTimestamp;
            this.message = builder.message;
            this.name = builder.name;
            this.reason = builder.reason;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Events create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return firstTimestamp
         */
        public String getFirstTimestamp() {
            return this.firstTimestamp;
        }

        /**
         * @return lastTimestamp
         */
        public String getLastTimestamp() {
            return this.lastTimestamp;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer count; 
            private String firstTimestamp; 
            private String lastTimestamp; 
            private String message; 
            private String name; 
            private String reason; 
            private String type; 

            /**
             * <p>The number of events.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The time when the event started.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-02-09T02:24:48Z</p>
             */
            public Builder firstTimestamp(String firstTimestamp) {
                this.firstTimestamp = firstTimestamp;
                return this;
            }

            /**
             * <p>The time when the event ended.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-02-09T02:24:48Z</p>
             */
            public Builder lastTimestamp(String lastTimestamp) {
                this.lastTimestamp = lastTimestamp;
                return this;
            }

            /**
             * <p>The message about the event.</p>
             * 
             * <strong>example:</strong>
             * <p>Successfully check image cache resource.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The name of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>imagetest.1661f31f851a****</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The cause of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>Started</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The type of the event. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Events build() {
                return new Events(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeImageCachesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageCachesResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>imc</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeImageCachesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageCachesResponseBody</p>
     */
    public static class ImageCaches extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContainerGroupId")
        private String containerGroupId;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("EliminationStrategy")
        private String eliminationStrategy;

        @com.aliyun.core.annotation.NameInMap("Events")
        private java.util.List < Events> events;

        @com.aliyun.core.annotation.NameInMap("ExpireDateTime")
        private String expireDateTime;

        @com.aliyun.core.annotation.NameInMap("FlashSnapshotId")
        private String flashSnapshotId;

        @com.aliyun.core.annotation.NameInMap("ImageCacheId")
        private String imageCacheId;

        @com.aliyun.core.annotation.NameInMap("ImageCacheName")
        private String imageCacheName;

        @com.aliyun.core.annotation.NameInMap("ImageCacheSize")
        private Integer imageCacheSize;

        @com.aliyun.core.annotation.NameInMap("Images")
        private java.util.List < String > images;

        @com.aliyun.core.annotation.NameInMap("LastMatchedTime")
        private String lastMatchedTime;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SnapshotId")
        private String snapshotId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        private ImageCaches(Builder builder) {
            this.containerGroupId = builder.containerGroupId;
            this.creationTime = builder.creationTime;
            this.eliminationStrategy = builder.eliminationStrategy;
            this.events = builder.events;
            this.expireDateTime = builder.expireDateTime;
            this.flashSnapshotId = builder.flashSnapshotId;
            this.imageCacheId = builder.imageCacheId;
            this.imageCacheName = builder.imageCacheName;
            this.imageCacheSize = builder.imageCacheSize;
            this.images = builder.images;
            this.lastMatchedTime = builder.lastMatchedTime;
            this.progress = builder.progress;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.snapshotId = builder.snapshotId;
            this.status = builder.status;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageCaches create() {
            return builder().build();
        }

        /**
         * @return containerGroupId
         */
        public String getContainerGroupId() {
            return this.containerGroupId;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return eliminationStrategy
         */
        public String getEliminationStrategy() {
            return this.eliminationStrategy;
        }

        /**
         * @return events
         */
        public java.util.List < Events> getEvents() {
            return this.events;
        }

        /**
         * @return expireDateTime
         */
        public String getExpireDateTime() {
            return this.expireDateTime;
        }

        /**
         * @return flashSnapshotId
         */
        public String getFlashSnapshotId() {
            return this.flashSnapshotId;
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
         * @return imageCacheSize
         */
        public Integer getImageCacheSize() {
            return this.imageCacheSize;
        }

        /**
         * @return images
         */
        public java.util.List < String > getImages() {
            return this.images;
        }

        /**
         * @return lastMatchedTime
         */
        public String getLastMatchedTime() {
            return this.lastMatchedTime;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return snapshotId
         */
        public String getSnapshotId() {
            return this.snapshotId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String containerGroupId; 
            private String creationTime; 
            private String eliminationStrategy; 
            private java.util.List < Events> events; 
            private String expireDateTime; 
            private String flashSnapshotId; 
            private String imageCacheId; 
            private String imageCacheName; 
            private Integer imageCacheSize; 
            private java.util.List < String > images; 
            private String lastMatchedTime; 
            private String progress; 
            private String regionId; 
            private String resourceGroupId; 
            private String snapshotId; 
            private String status; 
            private java.util.List < Tags> tags; 

            /**
             * <p>The ID of the elastic container instance.</p>
             * 
             * <strong>example:</strong>
             * <p>eci-bp18oq3m15prd9jb****</p>
             */
            public Builder containerGroupId(String containerGroupId) {
                this.containerGroupId = containerGroupId;
                return this;
            }

            /**
             * <p>The time when the image cache was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-02-09T02:24:07Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The elimination policy of the image cache. This parameter is empty by default, which indicates that the image cache is always retained.</p>
             * <p>You can set this parameter to LRU, which indicates that the image cache can be automatically deleted. When the number of image caches reaches the quota, the system automatically deletes the image caches whose EliminationStrategy parameter is set to LRU and that are least regularly used.</p>
             * 
             * <strong>example:</strong>
             * <p>LRU</p>
             */
            public Builder eliminationStrategy(String eliminationStrategy) {
                this.eliminationStrategy = eliminationStrategy;
                return this;
            }

            /**
             * <p>The events of pulling an image to create the image cache.</p>
             */
            public Builder events(java.util.List < Events> events) {
                this.events = events;
                return this;
            }

            /**
             * <p>The time when the image cache expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-11-10T09:00:48Z</p>
             */
            public Builder expireDateTime(String expireDateTime) {
                this.expireDateTime = expireDateTime;
                return this;
            }

            /**
             * <p>The ID of the local snapshot. A temporary local snapshot is created if the instant image cache feature is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>s-bp12w3v37sit96t6****</p>
             */
            public Builder flashSnapshotId(String flashSnapshotId) {
                this.flashSnapshotId = flashSnapshotId;
                return this;
            }

            /**
             * <p>The ID of the image cache.</p>
             * 
             * <strong>example:</strong>
             * <p>imc-bp195erqe9o2pb09****</p>
             */
            public Builder imageCacheId(String imageCacheId) {
                this.imageCacheId = imageCacheId;
                return this;
            }

            /**
             * <p>The name of the image cache.</p>
             * 
             * <strong>example:</strong>
             * <p>imagetest</p>
             */
            public Builder imageCacheName(String imageCacheName) {
                this.imageCacheName = imageCacheName;
                return this;
            }

            /**
             * <p>The size of the image cache. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder imageCacheSize(Integer imageCacheSize) {
                this.imageCacheSize = imageCacheSize;
                return this;
            }

            /**
             * <p>The images contained in the image cache.</p>
             */
            public Builder images(java.util.List < String > images) {
                this.images = images;
                return this;
            }

            /**
             * <p>The time when the image cache was last matched.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-08-18T03:48:10Z</p>
             */
            public Builder lastMatchedTime(String lastMatchedTime) {
                this.lastMatchedTime = lastMatchedTime;
                return this;
            }

            /**
             * <p>The progress of creating the snapshot that is used to create the image cache.</p>
             * <blockquote>
             * <p> If the instant image cache feature is enabled, the system creates a temporary local snapshot and then a regular snapshot. In this case, this parameter indicates the progress of creating the regular snapshot.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>100%</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The region ID of the image cache.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the image cache belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-2df3isufhi38****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The ID of the snapshot that corresponds to the image cache.</p>
             * 
             * <strong>example:</strong>
             * <p>s-2zec5oj8e1yhxijt****</p>
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            /**
             * <p>The status of the image cache. Valid values:</p>
             * <ul>
             * <li>Preparing: The image cache is being prepared.</li>
             * <li>Creating: The image is being created.</li>
             * <li>Ready: The image cache is created.</li>
             * <li>Failed: The image cache failed to be created.</li>
             * <li>Updating: The image cache is being updated.</li>
             * <li>UpdateFailed: The image cache failed to be updated.</li>
             * </ul>
             * <p>The image cache is ready for use when it is in the Ready state.</p>
             * 
             * <strong>example:</strong>
             * <p>Ready</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tags of the image cache.</p>
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            public ImageCaches build() {
                return new ImageCaches(this);
            } 

        } 

    }
}
