// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstanceIndexUsageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceIndexUsageResponseBody</p>
 */
public class DescribeDBInstanceIndexUsageResponseBody extends TeaModel {
    @NameInMap("Items")
    private java.util.List < Items> items;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDBInstanceIndexUsageResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceIndexUsageResponseBody create() {
        return builder().build();
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
        private java.util.List < Items> items; 
        private Integer pageNumber; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Details of index usage.
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDBInstanceIndexUsageResponseBody build() {
            return new DescribeDBInstanceIndexUsageResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("DatabaseName")
        private String databaseName;

        @NameInMap("IndexDef")
        private String indexDef;

        @NameInMap("IndexName")
        private String indexName;

        @NameInMap("IndexScanTimes")
        private Integer indexScanTimes;

        @NameInMap("IndexSize")
        private String indexSize;

        @NameInMap("IsPartitionTable")
        private Boolean isPartitionTable;

        @NameInMap("ParentTableName")
        private String parentTableName;

        @NameInMap("SchemaName")
        private String schemaName;

        @NameInMap("TableName")
        private String tableName;

        @NameInMap("TimeLastUpdated")
        private String timeLastUpdated;

        private Items(Builder builder) {
            this.databaseName = builder.databaseName;
            this.indexDef = builder.indexDef;
            this.indexName = builder.indexName;
            this.indexScanTimes = builder.indexScanTimes;
            this.indexSize = builder.indexSize;
            this.isPartitionTable = builder.isPartitionTable;
            this.parentTableName = builder.parentTableName;
            this.schemaName = builder.schemaName;
            this.tableName = builder.tableName;
            this.timeLastUpdated = builder.timeLastUpdated;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return indexDef
         */
        public String getIndexDef() {
            return this.indexDef;
        }

        /**
         * @return indexName
         */
        public String getIndexName() {
            return this.indexName;
        }

        /**
         * @return indexScanTimes
         */
        public Integer getIndexScanTimes() {
            return this.indexScanTimes;
        }

        /**
         * @return indexSize
         */
        public String getIndexSize() {
            return this.indexSize;
        }

        /**
         * @return isPartitionTable
         */
        public Boolean getIsPartitionTable() {
            return this.isPartitionTable;
        }

        /**
         * @return parentTableName
         */
        public String getParentTableName() {
            return this.parentTableName;
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

        /**
         * @return timeLastUpdated
         */
        public String getTimeLastUpdated() {
            return this.timeLastUpdated;
        }

        public static final class Builder {
            private String databaseName; 
            private String indexDef; 
            private String indexName; 
            private Integer indexScanTimes; 
            private String indexSize; 
            private Boolean isPartitionTable; 
            private String parentTableName; 
            private String schemaName; 
            private String tableName; 
            private String timeLastUpdated; 

            /**
             * The name of the database.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * The definition of the index.
             */
            public Builder indexDef(String indexDef) {
                this.indexDef = indexDef;
                return this;
            }

            /**
             * The name of the index.
             */
            public Builder indexName(String indexName) {
                this.indexName = indexName;
                return this;
            }

            /**
             * The number of index scans.
             */
            public Builder indexScanTimes(Integer indexScanTimes) {
                this.indexScanTimes = indexScanTimes;
                return this;
            }

            /**
             * The size of the index. Unit: bytes.
             */
            public Builder indexSize(String indexSize) {
                this.indexSize = indexSize;
                return this;
            }

            /**
             * Indicates whether the table is a partitioned table. Valid values:
             * <p>
             * 
             * *   **true**: The table is a partitioned table.
             * *   **false**: The table is not a partitioned table.
             */
            public Builder isPartitionTable(Boolean isPartitionTable) {
                this.isPartitionTable = isPartitionTable;
                return this;
            }

            /**
             * The name of the parent table.
             */
            public Builder parentTableName(String parentTableName) {
                this.parentTableName = parentTableName;
                return this;
            }

            /**
             * The name of the schema.
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * The name of the table.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * The time when the table was last deleted, inserted, or updated.
             */
            public Builder timeLastUpdated(String timeLastUpdated) {
                this.timeLastUpdated = timeLastUpdated;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
