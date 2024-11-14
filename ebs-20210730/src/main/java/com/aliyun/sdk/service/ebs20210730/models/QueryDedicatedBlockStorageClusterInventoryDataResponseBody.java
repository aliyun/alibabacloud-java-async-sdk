// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryDedicatedBlockStorageClusterInventoryDataResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDedicatedBlockStorageClusterInventoryDataResponseBody</p>
 */
public class QueryDedicatedBlockStorageClusterInventoryDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("DbscId")
    private String dbscId;

    @com.aliyun.core.annotation.NameInMap("DbscName")
    private String dbscName;

    @com.aliyun.core.annotation.NameInMap("DiskCategory")
    private String diskCategory;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>The returned data.</p>
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the dedicated block storage cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>dbsc-xxx</p>
         */
        public Builder dbscId(String dbscId) {
            this.dbscId = dbscId;
            return this;
        }

        /**
         * <p>The name of the dedicated block storage cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>myDBSCCluster</p>
         */
        public Builder dbscName(String dbscName) {
            this.dbscName = dbscName;
            return this;
        }

        /**
         * <p>The type of the disk. Valid values:</p>
         * <ul>
         * <li>cloud_essd: enhanced SSD (ESSD).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        public Builder diskCategory(String diskCategory) {
            this.diskCategory = diskCategory;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F1A4258A-0C8C-5329-B495-BC5AD7AD****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public QueryDedicatedBlockStorageClusterInventoryDataResponseBody build() {
            return new QueryDedicatedBlockStorageClusterInventoryDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDedicatedBlockStorageClusterInventoryDataResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDedicatedBlockStorageClusterInventoryDataResponseBody</p>
     */
    public static class MonitorItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableSize")
        private Long availableSize;

        @com.aliyun.core.annotation.NameInMap("TotalSize")
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
             * <p>Available capacity size of the dedicated block storage cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>61360</p>
             */
            public Builder availableSize(Long availableSize) {
                this.availableSize = availableSize;
                return this;
            }

            /**
             * <p>Total capacity size of the dedicated block storage cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>61440</p>
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
    /**
     * 
     * {@link QueryDedicatedBlockStorageClusterInventoryDataResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDedicatedBlockStorageClusterInventoryDataResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MonitorItems")
        private MonitorItems monitorItems;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
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
             * <p>The returned metrics.</p>
             */
            public Builder monitorItems(MonitorItems monitorItems) {
                this.monitorItems = monitorItems;
                return this;
            }

            /**
             * <p>The ID list of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>dbsc-xxx</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The timestamp when the data is collected.</p>
             * 
             * <strong>example:</strong>
             * <p>1606403800</p>
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
