// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataCachesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataCachesResponseBody</p>
 */
public class DescribeDataCachesResponseBody extends TeaModel {
    @NameInMap("DataCaches")
    private java.util.List < DataCaches> dataCaches;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDataCachesResponseBody(Builder builder) {
        this.dataCaches = builder.dataCaches;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataCachesResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataCaches
     */
    public java.util.List < DataCaches> getDataCaches() {
        return this.dataCaches;
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
        private java.util.List < DataCaches> dataCaches; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The information about the data caches.
         */
        public Builder dataCaches(java.util.List < DataCaches> dataCaches) {
            this.dataCaches = dataCaches;
            return this;
        }

        /**
         * The query token. Set the value to the NextToken value that is returned in the previous call.
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
         * The number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDataCachesResponseBody build() {
            return new DescribeDataCachesResponseBody(this);
        } 

    } 

    public static class DataSource extends TeaModel {
        @NameInMap("Options")
        private String options;

        @NameInMap("Type")
        private String type;

        private DataSource(Builder builder) {
            this.options = builder.options;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSource create() {
            return builder().build();
        }

        /**
         * @return options
         */
        public String getOptions() {
            return this.options;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String options; 
            private String type; 

            /**
             * The parameters that are configured for the data source.
             */
            public Builder options(String options) {
                this.options = options;
                return this;
            }

            /**
             * The type of the data source. Valid values:
             * <p>
             * 
             * *   NAS
             * *   OSS
             * *   URL
             * *   SNAPSHOT
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DataSource build() {
                return new DataSource(this);
            } 

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
             * The number of times that the event occurred.
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
             * The event name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The reason for the transition into the current status of the event.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * The type of the event. Valid values:
             * <p>
             * 
             * *   Normal
             * *   Warning
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
    public static class DataCaches extends TeaModel {
        @NameInMap("Bucket")
        private String bucket;

        @NameInMap("ContainerGroupId")
        private String containerGroupId;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("DataCacheId")
        private String dataCacheId;

        @NameInMap("DataSource")
        private DataSource dataSource;

        @NameInMap("Events")
        private java.util.List < Events> events;

        @NameInMap("ExpireDateTime")
        private String expireDateTime;

        @NameInMap("FlashSnapshotId")
        private String flashSnapshotId;

        @NameInMap("LastMatchedTime")
        private String lastMatchedTime;

        @NameInMap("Name")
        private String name;

        @NameInMap("Path")
        private String path;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Size")
        private Integer size;

        @NameInMap("SnapshotId")
        private String snapshotId;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        private DataCaches(Builder builder) {
            this.bucket = builder.bucket;
            this.containerGroupId = builder.containerGroupId;
            this.creationTime = builder.creationTime;
            this.dataCacheId = builder.dataCacheId;
            this.dataSource = builder.dataSource;
            this.events = builder.events;
            this.expireDateTime = builder.expireDateTime;
            this.flashSnapshotId = builder.flashSnapshotId;
            this.lastMatchedTime = builder.lastMatchedTime;
            this.name = builder.name;
            this.path = builder.path;
            this.progress = builder.progress;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.size = builder.size;
            this.snapshotId = builder.snapshotId;
            this.status = builder.status;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataCaches create() {
            return builder().build();
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
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
         * @return dataCacheId
         */
        public String getDataCacheId() {
            return this.dataCacheId;
        }

        /**
         * @return dataSource
         */
        public DataSource getDataSource() {
            return this.dataSource;
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
         * @return lastMatchedTime
         */
        public String getLastMatchedTime() {
            return this.lastMatchedTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
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
         * @return size
         */
        public Integer getSize() {
            return this.size;
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
            private String bucket; 
            private String containerGroupId; 
            private String creationTime; 
            private String dataCacheId; 
            private DataSource dataSource; 
            private java.util.List < Events> events; 
            private String expireDateTime; 
            private String flashSnapshotId; 
            private String lastMatchedTime; 
            private String name; 
            private String path; 
            private String progress; 
            private String regionId; 
            private String resourceGroupId; 
            private Integer size; 
            private String snapshotId; 
            private String status; 
            private java.util.List < Tags> tags; 

            /**
             * The bucket that stores the data cache.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * The ID of the elastic container instance that was generated when the data cache was created.
             */
            public Builder containerGroupId(String containerGroupId) {
                this.containerGroupId = containerGroupId;
                return this;
            }

            /**
             * The time when the data cache was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The ID of the data cache.
             */
            public Builder dataCacheId(String dataCacheId) {
                this.dataCacheId = dataCacheId;
                return this;
            }

            /**
             * The information about the data source.
             */
            public Builder dataSource(DataSource dataSource) {
                this.dataSource = dataSource;
                return this;
            }

            /**
             * The events.
             */
            public Builder events(java.util.List < Events> events) {
                this.events = events;
                return this;
            }

            /**
             * The time when the data cache expires.
             */
            public Builder expireDateTime(String expireDateTime) {
                this.expireDateTime = expireDateTime;
                return this;
            }

            /**
             * The ID of the on-premises snapshot.
             */
            public Builder flashSnapshotId(String flashSnapshotId) {
                this.flashSnapshotId = flashSnapshotId;
                return this;
            }

            /**
             * The time when the data cache was last matched.
             */
            public Builder lastMatchedTime(String lastMatchedTime) {
                this.lastMatchedTime = lastMatchedTime;
                return this;
            }

            /**
             * The name of the data cache.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The directory in which the virtual host of the data cache resides.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * The creation progress of the data cache.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The size of the data cache. Unit: GiB.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * The snapshot ID.
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            /**
             * The status of the data cache. Valid values:
             * <p>
             * 
             * *   Loading: The data cache is loading data.
             * *   Creating: The data cache is being created.
             * *   Available: The data cache is created.
             * *   Failed: The data cache failed to be created.
             * *   Updating: The data cache is being updated.
             * *   UpdateFailed: The data cache failed to be updated.
             * 
             * If the data cache is in the Available state, the data cache can be used.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The tags that are attached to the data cache.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            public DataCaches build() {
                return new DataCaches(this);
            } 

        } 

    }
}
