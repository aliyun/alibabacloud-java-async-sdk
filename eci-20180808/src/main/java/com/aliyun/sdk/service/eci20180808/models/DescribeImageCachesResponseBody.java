// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

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
    private java.util.List < ImageCaches> imageCaches;

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
         * The information about image caches.
         */
        public Builder imageCaches(java.util.List < ImageCaches> imageCaches) {
            this.imageCaches = imageCaches;
            return this;
        }

        /**
         * The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeImageCachesResponseBody build() {
            return new DescribeImageCachesResponseBody(this);
        } 

    } 

    public static class Events extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("FirstTimestamp")
        private String firstTimestamp;

        @NameInMap("LastTimestamp")
        private String lastTimestamp;

        @NameInMap("Message")
        private String message;

        @NameInMap("Name")
        private String name;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("Type")
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
             * The number of events.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The time when the event started.
             */
            public Builder firstTimestamp(String firstTimestamp) {
                this.firstTimestamp = firstTimestamp;
                return this;
            }

            /**
             * The time when the event ended.
             */
            public Builder lastTimestamp(String lastTimestamp) {
                this.lastTimestamp = lastTimestamp;
                return this;
            }

            /**
             * The message about the event.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The name of the event.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The cause of the event.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * The type of the event. Valid values:
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
    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
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
    public static class ImageCaches extends TeaModel {
        @NameInMap("ContainerGroupId")
        private String containerGroupId;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("EliminationStrategy")
        private String eliminationStrategy;

        @NameInMap("Events")
        private java.util.List < Events> events;

        @NameInMap("ExpireDateTime")
        private String expireDateTime;

        @NameInMap("FlashSnapshotId")
        private String flashSnapshotId;

        @NameInMap("ImageCacheId")
        private String imageCacheId;

        @NameInMap("ImageCacheName")
        private String imageCacheName;

        @NameInMap("ImageCacheSize")
        private Integer imageCacheSize;

        @NameInMap("Images")
        private java.util.List < String > images;

        @NameInMap("LastMatchedTime")
        private String lastMatchedTime;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("SnapshotId")
        private String snapshotId;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tags")
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
             * The ID of the elastic container instance.
             */
            public Builder containerGroupId(String containerGroupId) {
                this.containerGroupId = containerGroupId;
                return this;
            }

            /**
             * The time when the image cache was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The elimination policy of the image cache. This parameter is empty by default, which indicates that the image cache is always retained.
             * <p>
             * 
             * You can set this parameter to LRU, which indicates that the image cache can be automatically deleted. When the number of image caches reaches the quota, the system automatically deletes the image caches whose EliminationStrategy parameter is set to LRU and that are least regularly used.
             */
            public Builder eliminationStrategy(String eliminationStrategy) {
                this.eliminationStrategy = eliminationStrategy;
                return this;
            }

            /**
             * The events of pulling an image to create the image cache.
             */
            public Builder events(java.util.List < Events> events) {
                this.events = events;
                return this;
            }

            /**
             * The time when the image cache expires.
             */
            public Builder expireDateTime(String expireDateTime) {
                this.expireDateTime = expireDateTime;
                return this;
            }

            /**
             * The ID of the local snapshot. A temporary local snapshot is created if the instant image cache feature is enabled.
             */
            public Builder flashSnapshotId(String flashSnapshotId) {
                this.flashSnapshotId = flashSnapshotId;
                return this;
            }

            /**
             * The ID of the image cache.
             */
            public Builder imageCacheId(String imageCacheId) {
                this.imageCacheId = imageCacheId;
                return this;
            }

            /**
             * The name of the image cache.
             */
            public Builder imageCacheName(String imageCacheName) {
                this.imageCacheName = imageCacheName;
                return this;
            }

            /**
             * The size of the image cache. Unit: GiB.
             */
            public Builder imageCacheSize(Integer imageCacheSize) {
                this.imageCacheSize = imageCacheSize;
                return this;
            }

            /**
             * The images contained in the image cache.
             */
            public Builder images(java.util.List < String > images) {
                this.images = images;
                return this;
            }

            /**
             * The time when the image cache was last matched.
             */
            public Builder lastMatchedTime(String lastMatchedTime) {
                this.lastMatchedTime = lastMatchedTime;
                return this;
            }

            /**
             * The progress of creating the snapshot that is used to create the image cache.
             * <p>
             * 
             * >  If the instant image cache feature is enabled, the system creates a temporary local snapshot and then a regular snapshot. In this case, this parameter indicates the progress of creating the regular snapshot.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The region ID of the image cache.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the resource group to which the image cache belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The ID of the snapshot that corresponds to the image cache.
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            /**
             * The status of the image cache. Valid values:
             * <p>
             * 
             * *   Preparing: The image cache is being prepared.
             * *   Creating: The image is being created.
             * *   Ready: The image cache is created.
             * *   Failed: The image cache failed to be created.
             * *   Updating: The image cache is being updated.
             * *   UpdateFailed: The image cache failed to be updated.
             * 
             * The image cache is ready for use when it is in the Ready state.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The tags of the image cache.
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
