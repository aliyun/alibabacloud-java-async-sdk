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

    @NameInMap("RequestId")
    private String requestId;

    private DescribeImageCachesResponseBody(Builder builder) {
        this.imageCaches = builder.imageCaches;
        this.requestId = builder.requestId;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ImageCaches> imageCaches; 
        private String requestId; 

        /**
         * ImageCaches.
         */
        public Builder imageCaches(java.util.List < ImageCaches> imageCaches) {
            this.imageCaches = imageCaches;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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

        @NameInMap("Type")
        private String type;

        private Events(Builder builder) {
            this.count = builder.count;
            this.firstTimestamp = builder.firstTimestamp;
            this.lastTimestamp = builder.lastTimestamp;
            this.message = builder.message;
            this.name = builder.name;
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
            private String type; 

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * FirstTimestamp.
             */
            public Builder firstTimestamp(String firstTimestamp) {
                this.firstTimestamp = firstTimestamp;
                return this;
            }

            /**
             * LastTimestamp.
             */
            public Builder lastTimestamp(String lastTimestamp) {
                this.lastTimestamp = lastTimestamp;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Type.
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
             * ContainerGroupId.
             */
            public Builder containerGroupId(String containerGroupId) {
                this.containerGroupId = containerGroupId;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * Events.
             */
            public Builder events(java.util.List < Events> events) {
                this.events = events;
                return this;
            }

            /**
             * ExpireDateTime.
             */
            public Builder expireDateTime(String expireDateTime) {
                this.expireDateTime = expireDateTime;
                return this;
            }

            /**
             * FlashSnapshotId.
             */
            public Builder flashSnapshotId(String flashSnapshotId) {
                this.flashSnapshotId = flashSnapshotId;
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
             * ImageCacheSize.
             */
            public Builder imageCacheSize(Integer imageCacheSize) {
                this.imageCacheSize = imageCacheSize;
                return this;
            }

            /**
             * Images.
             */
            public Builder images(java.util.List < String > images) {
                this.images = images;
                return this;
            }

            /**
             * LastMatchedTime.
             */
            public Builder lastMatchedTime(String lastMatchedTime) {
                this.lastMatchedTime = lastMatchedTime;
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
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
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
             * SnapshotId.
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Tags.
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
