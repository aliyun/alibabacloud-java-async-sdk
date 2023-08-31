// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTablePartitionDiagnoseResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTablePartitionDiagnoseResponseBody</p>
 */
public class DescribeTablePartitionDiagnoseResponseBody extends TeaModel {
    @NameInMap("DBClusterId")
    private String DBClusterId;

    @NameInMap("Items")
    private java.util.List < Items> items;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SuggestMaxRecordsPerPartition")
    private Long suggestMaxRecordsPerPartition;

    @NameInMap("SuggestMinRecordsPerPartition")
    private Long suggestMinRecordsPerPartition;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeTablePartitionDiagnoseResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
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
        private java.util.List < Items> items; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Long suggestMaxRecordsPerPartition; 
        private Long suggestMinRecordsPerPartition; 
        private Integer totalCount; 

        /**
         * The ID of the cluster.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The information of tables.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * The recommended maximum number of rows in each list partition.
         */
        public Builder suggestMaxRecordsPerPartition(Long suggestMaxRecordsPerPartition) {
            this.suggestMaxRecordsPerPartition = suggestMaxRecordsPerPartition;
            return this;
        }

        /**
         * The recommended minimum number of rows in each list partition.
         */
        public Builder suggestMinRecordsPerPartition(Long suggestMinRecordsPerPartition) {
            this.suggestMinRecordsPerPartition = suggestMinRecordsPerPartition;
            return this;
        }

        /**
         * The total number of entries.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeTablePartitionDiagnoseResponseBody build() {
            return new DescribeTablePartitionDiagnoseResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("PartitionDetail")
        private String partitionDetail;

        @NameInMap("PartitionNumber")
        private Integer partitionNumber;

        @NameInMap("SchemaName")
        private String schemaName;

        @NameInMap("TableName")
        private String tableName;

        private Items(Builder builder) {
            this.partitionDetail = builder.partitionDetail;
            this.partitionNumber = builder.partitionNumber;
            this.schemaName = builder.schemaName;
            this.tableName = builder.tableName;
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
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private String partitionDetail; 
            private Integer partitionNumber; 
            private String schemaName; 
            private String tableName; 

            /**
             * Details of the inappropriate partitions.
             */
            public Builder partitionDetail(String partitionDetail) {
                this.partitionDetail = partitionDetail;
                return this;
            }

            /**
             * The number of partitions.
             */
            public Builder partitionNumber(Integer partitionNumber) {
                this.partitionNumber = partitionNumber;
                return this;
            }

            /**
             * The name of the database.
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * The table name.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
