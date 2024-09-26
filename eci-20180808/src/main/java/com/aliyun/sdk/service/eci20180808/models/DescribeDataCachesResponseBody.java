// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDataCachesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataCachesResponseBody</p>
 */
public class DescribeDataCachesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataCaches")
    private java.util.List < DataCaches> dataCaches;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>The information about the data caches.</p>
         */
        public Builder dataCaches(java.util.List < DataCaches> dataCaches) {
            this.dataCaches = dataCaches;
            return this;
        }

        /**
         * <p>The query token. Set the value to the NextToken value that is returned in the previous call.</p>
         * 
         * <strong>example:</strong>
         * <p>d78f2dd8-5979-42fe-xaee-b16db43be5bc</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B8756BA0-6452-419C-9727-37A6209C85E0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDataCachesResponseBody build() {
            return new DescribeDataCachesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDataCachesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataCachesResponseBody</p>
     */
    public static class DataSource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Options")
        private String options;

        @com.aliyun.core.annotation.NameInMap("Type")
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
             * <p>The parameters that are configured for the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *       &quot;options&quot;: {
             *             &quot;path&quot;: &quot;/&quot;,
             *             &quot;server&quot;: &quot;0ce1f4****-or***.cn-hangzhou.nas.aliyuncs.com&quot;,
             *             &quot;vers&quot;: &quot;3&quot;,
             *             &quot;options&quot;: &quot;nolock,proto=tcp,rsize=1048576,wsize=1048576,hard,timeo=600,retrans=2,noresvport&quot;
             *       },
             *       &quot;type&quot;: &quot;NAS&quot;
             * }</p>
             */
            public Builder options(String options) {
                this.options = options;
                return this;
            }

            /**
             * <p>The type of the data source. Valid values:</p>
             * <ul>
             * <li>NAS</li>
             * <li>OSS</li>
             * <li>URL</li>
             * <li>SNAPSHOT</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>URL</p>
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
    /**
     * 
     * {@link DescribeDataCachesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataCachesResponseBody</p>
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
             * <p>The number of times that the event occurred.</p>
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
             * <p>2021-06-16T02:14:48Z</p>
             */
            public Builder firstTimestamp(String firstTimestamp) {
                this.firstTimestamp = firstTimestamp;
                return this;
            }

            /**
             * <p>The time when the event ended.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-16T02:24:48Z</p>
             */
            public Builder lastTimestamp(String lastTimestamp) {
                this.lastTimestamp = lastTimestamp;
                return this;
            }

            /**
             * <p>The message about the event.</p>
             * 
             * <strong>example:</strong>
             * <p>Successfully check data cache resource.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The event name.</p>
             * 
             * <strong>example:</strong>
             * <p>datacache</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The reason for the transition into the current status of the event.</p>
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
             * <ul>
             * <li>Normal</li>
             * <li>Warning</li>
             * </ul>
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
     * {@link DescribeDataCachesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataCachesResponseBody</p>
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
             * <p>testkey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>testvalue</p>
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
     * {@link DescribeDataCachesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataCachesResponseBody</p>
     */
    public static class DataCaches extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bucket")
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("ContainerGroupId")
        private String containerGroupId;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DataCacheId")
        private String dataCacheId;

        @com.aliyun.core.annotation.NameInMap("DataSource")
        private DataSource dataSource;

        @com.aliyun.core.annotation.NameInMap("Events")
        private java.util.List < Events> events;

        @com.aliyun.core.annotation.NameInMap("ExpireDateTime")
        private String expireDateTime;

        @com.aliyun.core.annotation.NameInMap("FlashSnapshotId")
        private String flashSnapshotId;

        @com.aliyun.core.annotation.NameInMap("LastMatchedTime")
        private String lastMatchedTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        @com.aliyun.core.annotation.NameInMap("SnapshotId")
        private String snapshotId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
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
             * <p>The bucket that stores the data cache.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>The ID of the elastic container instance that was generated when the data cache was created.</p>
             * 
             * <strong>example:</strong>
             * <p>eci-8vb1y2w1dv7zeirn****</p>
             */
            public Builder containerGroupId(String containerGroupId) {
                this.containerGroupId = containerGroupId;
                return this;
            }

            /**
             * <p>The time when the data cache was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-06-16T02:43Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The ID of the data cache.</p>
             * 
             * <strong>example:</strong>
             * <p>edc-bp15l4vvys94oo******</p>
             */
            public Builder dataCacheId(String dataCacheId) {
                this.dataCacheId = dataCacheId;
                return this;
            }

            /**
             * <p>The information about the data source.</p>
             */
            public Builder dataSource(DataSource dataSource) {
                this.dataSource = dataSource;
                return this;
            }

            /**
             * <p>The events.</p>
             */
            public Builder events(java.util.List < Events> events) {
                this.events = events;
                return this;
            }

            /**
             * <p>The time when the data cache expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-06-26T02:43Z</p>
             */
            public Builder expireDateTime(String expireDateTime) {
                this.expireDateTime = expireDateTime;
                return this;
            }

            /**
             * <p>The ID of the on-premises snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>s-bp12w3v37sit96t6****</p>
             */
            public Builder flashSnapshotId(String flashSnapshotId) {
                this.flashSnapshotId = flashSnapshotId;
                return this;
            }

            /**
             * <p>The time when the data cache was last matched.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-06-18T02:43Z</p>
             */
            public Builder lastMatchedTime(String lastMatchedTime) {
                this.lastMatchedTime = lastMatchedTime;
                return this;
            }

            /**
             * <p>The name of the data cache.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The directory in which the virtual host of the data cache resides.</p>
             * 
             * <strong>example:</strong>
             * <p>/data/models/</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The creation progress of the data cache.</p>
             * 
             * <strong>example:</strong>
             * <p>100%</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aek2hlt3ux4****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The size of the data cache. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The snapshot ID.</p>
             * 
             * <strong>example:</strong>
             * <p>s-2zec5oj8e1yhxijt****</p>
             */
            public Builder snapshotId(String snapshotId) {
                this.snapshotId = snapshotId;
                return this;
            }

            /**
             * <p>The status of the data cache. Valid values:</p>
             * <ul>
             * <li>Loading: The data cache is loading data.</li>
             * <li>Creating: The data cache is being created.</li>
             * <li>Available: The data cache is created.</li>
             * <li>Failed: The data cache failed to be created.</li>
             * <li>Updating: The data cache is being updated.</li>
             * <li>UpdateFailed: The data cache failed to be updated.</li>
             * </ul>
             * <p>If the data cache is in the Available state, the data cache can be used.</p>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tags that are attached to the data cache.</p>
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
