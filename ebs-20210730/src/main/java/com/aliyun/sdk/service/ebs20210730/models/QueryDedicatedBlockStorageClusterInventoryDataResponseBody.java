// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDedicatedBlockStorageClusterInventoryDataResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDedicatedBlockStorageClusterInventoryDataResponseBody</p>
 */
public class QueryDedicatedBlockStorageClusterInventoryDataResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("DbscId")
    private String dbscId;

    @NameInMap("DbscName")
    private String dbscName;

    @NameInMap("DiskCategory")
    private String diskCategory;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private QueryDedicatedBlockStorageClusterInventoryDataResponseBody(Builder builder) {
        this.data = builder.data;
        this.dbscId = builder.dbscId;
        this.dbscName = builder.dbscName;
        this.diskCategory = builder.diskCategory;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDedicatedBlockStorageClusterInventoryDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return dbscId
     */
    public String getDbscId() {
        return this.dbscId;
    }

    /**
     * @return dbscName
     */
    public String getDbscName() {
        return this.dbscName;
    }

    /**
     * @return diskCategory
     */
    public String getDiskCategory() {
        return this.diskCategory;
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
        private java.util.List < Data> data; 
        private String dbscId; 
        private String dbscName; 
        private String diskCategory; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The returned data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the dedicated block storage cluster.
         */
        public Builder dbscId(String dbscId) {
            this.dbscId = dbscId;
            return this;
        }

        /**
         * The name of the dedicated block storage cluster.
         */
        public Builder dbscName(String dbscName) {
            this.dbscName = dbscName;
            return this;
        }

        /**
         * The type of the disk. Valid values:
         * <p>
         * 
         * *   cloud_essd: enhanced SSD (ESSD).
         */
        public Builder diskCategory(String diskCategory) {
            this.diskCategory = diskCategory;
            return this;
        }

        /**
         * The ID of the request.
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

        public QueryDedicatedBlockStorageClusterInventoryDataResponseBody build() {
            return new QueryDedicatedBlockStorageClusterInventoryDataResponseBody(this);
        } 

    } 

    public static class MonitorItems extends TeaModel {
        @NameInMap("AvailableSize")
        private Long availableSize;

        @NameInMap("TotalSize")
        private Long totalSize;

        private MonitorItems(Builder builder) {
            this.availableSize = builder.availableSize;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MonitorItems create() {
            return builder().build();
        }

        /**
         * @return availableSize
         */
        public Long getAvailableSize() {
            return this.availableSize;
        }

        /**
         * @return totalSize
         */
        public Long getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private Long availableSize; 
            private Long totalSize; 

            /**
             * Available capacity size of the dedicated block storage cluster.
             */
            public Builder availableSize(Long availableSize) {
                this.availableSize = availableSize;
                return this;
            }

            /**
             * Total capacity size of the dedicated block storage cluster.
             */
            public Builder totalSize(Long totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public MonitorItems build() {
                return new MonitorItems(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("MonitorItems")
        private MonitorItems monitorItems;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("Timestamp")
        private String timestamp;

        private Data(Builder builder) {
            this.monitorItems = builder.monitorItems;
            this.resourceId = builder.resourceId;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return monitorItems
         */
        public MonitorItems getMonitorItems() {
            return this.monitorItems;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private MonitorItems monitorItems; 
            private String resourceId; 
            private String timestamp; 

            /**
             * The returned metrics.
             */
            public Builder monitorItems(MonitorItems monitorItems) {
                this.monitorItems = monitorItems;
                return this;
            }

            /**
             * The ID list of the resource.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * The timestamp when the data is collected.
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
