// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeTablePartitionDiagnoseResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTablePartitionDiagnoseResponseBody</p>
 */
public class DescribeTablePartitionDiagnoseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("DetectionItems")
    private java.util.List < DetectionItems> detectionItems;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List < Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SuggestMaxRecordsPerPartition")
    private Long suggestMaxRecordsPerPartition;

    @com.aliyun.core.annotation.NameInMap("SuggestMinRecordsPerPartition")
    private Long suggestMinRecordsPerPartition;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeTablePartitionDiagnoseResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.detectionItems = builder.detectionItems;
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.suggestMaxRecordsPerPartition = builder.suggestMaxRecordsPerPartition;
        this.suggestMinRecordsPerPartition = builder.suggestMinRecordsPerPartition;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTablePartitionDiagnoseResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return detectionItems
     */
    public java.util.List < DetectionItems> getDetectionItems() {
        return this.detectionItems;
    }

    /**
     * @return items
     */
    public java.util.List < Items> getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return suggestMaxRecordsPerPartition
     */
    public Long getSuggestMaxRecordsPerPartition() {
        return this.suggestMaxRecordsPerPartition;
    }

    /**
     * @return suggestMinRecordsPerPartition
     */
    public Long getSuggestMinRecordsPerPartition() {
        return this.suggestMinRecordsPerPartition;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String DBClusterId; 
        private java.util.List < DetectionItems> detectionItems; 
        private java.util.List < Items> items; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Long suggestMaxRecordsPerPartition; 
        private Long suggestMinRecordsPerPartition; 
        private Integer totalCount; 

        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>am-bp1xxxxxxxx47</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The queried detection items and detection results.</p>
         */
        public Builder detectionItems(java.util.List < DetectionItems> detectionItems) {
            this.detectionItems = detectionItems;
            return this;
        }

        /**
         * <p>The table statistics.</p>
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The recommended maximum number of rows in each list partition.</p>
         * 
         * <strong>example:</strong>
         * <p>640000000</p>
         */
        public Builder suggestMaxRecordsPerPartition(Long suggestMaxRecordsPerPartition) {
            this.suggestMaxRecordsPerPartition = suggestMaxRecordsPerPartition;
            return this;
        }

        /**
         * <p>The recommended minimum number of rows in each list partition.</p>
         * 
         * <strong>example:</strong>
         * <p>64000000</p>
         */
        public Builder suggestMinRecordsPerPartition(Long suggestMinRecordsPerPartition) {
            this.suggestMinRecordsPerPartition = suggestMinRecordsPerPartition;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeTablePartitionDiagnoseResponseBody build() {
            return new DescribeTablePartitionDiagnoseResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTablePartitionDiagnoseResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTablePartitionDiagnoseResponseBody</p>
     */
    public static class DetectionItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private DetectionItems(Builder builder) {
            this.message = builder.message;
            this.name = builder.name;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetectionItems create() {
            return builder().build();
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String message; 
            private String name; 
            private String status; 

            /**
             * <p>The detection result.</p>
             * 
             * <strong>example:</strong>
             * <p>A total of 10 tables have an improper partition field</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The name of the detection item.</p>
             * 
             * <strong>example:</strong>
             * <p>Improper Partition Field Diagnosis</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The severity level of the detection result. Valid values:</p>
             * <ul>
             * <li>NORMAL</li>
             * <li>WARNING</li>
             * <li>CRITICAL</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>WARNING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DetectionItems build() {
                return new DetectionItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeTablePartitionDiagnoseResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTablePartitionDiagnoseResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PartitionDetail")
        private String partitionDetail;

        @com.aliyun.core.annotation.NameInMap("PartitionNumber")
        private Integer partitionNumber;

        @com.aliyun.core.annotation.NameInMap("SchemaName")
        private String schemaName;

        @com.aliyun.core.annotation.NameInMap("SpaceRatio")
        private Double spaceRatio;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("TotalSize")
        private Long totalSize;

        private Items(Builder builder) {
            this.partitionDetail = builder.partitionDetail;
            this.partitionNumber = builder.partitionNumber;
            this.schemaName = builder.schemaName;
            this.spaceRatio = builder.spaceRatio;
            this.tableName = builder.tableName;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return partitionDetail
         */
        public String getPartitionDetail() {
            return this.partitionDetail;
        }

        /**
         * @return partitionNumber
         */
        public Integer getPartitionNumber() {
            return this.partitionNumber;
        }

        /**
         * @return schemaName
         */
        public String getSchemaName() {
            return this.schemaName;
        }

        /**
         * @return spaceRatio
         */
        public Double getSpaceRatio() {
            return this.spaceRatio;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return totalSize
         */
        public Long getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private String partitionDetail; 
            private Integer partitionNumber; 
            private String schemaName; 
            private Double spaceRatio; 
            private String tableName; 
            private Long totalSize; 

            /**
             * <p>The information about inappropriate partitions.</p>
             * 
             * <strong>example:</strong>
             * <p>202005,202006</p>
             */
            public Builder partitionDetail(String partitionDetail) {
                this.partitionDetail = partitionDetail;
                return this;
            }

            /**
             * <p>The number of partitions.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder partitionNumber(Integer partitionNumber) {
                this.partitionNumber = partitionNumber;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>test_db</p>
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * <p>The storage percentage of the table. Unit: %.</p>
             * <blockquote>
             * <p> Formula: Table storage percentage = Total data size of a table/Total data size of the cluster × 100%.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>66.23</p>
             */
            public Builder spaceRatio(Double spaceRatio) {
                this.spaceRatio = spaceRatio;
                return this;
            }

            /**
             * <p>The name of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>test_table</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * <p>The total data size of the table. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>42949672960</p>
             */
            public Builder totalSize(Long totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
