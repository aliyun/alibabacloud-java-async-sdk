// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDBInstanceIndexUsageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceIndexUsageResponseBody</p>
 */
public class DescribeDBInstanceIndexUsageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
    public java.util.List<Items> getItems() {
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
        private java.util.List<Items> items; 
        private Integer pageNumber; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The queried index usage.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDBInstanceIndexUsageResponseBody build() {
            return new DescribeDBInstanceIndexUsageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBInstanceIndexUsageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceIndexUsageResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("IndexDef")
        private String indexDef;

        @com.aliyun.core.annotation.NameInMap("IndexName")
        private String indexName;

        @com.aliyun.core.annotation.NameInMap("IndexScanTimes")
        private Long indexScanTimes;

        @com.aliyun.core.annotation.NameInMap("IndexSize")
        private String indexSize;

        @com.aliyun.core.annotation.NameInMap("IsPartitionTable")
        private Boolean isPartitionTable;

        @com.aliyun.core.annotation.NameInMap("ParentTableName")
        private String parentTableName;

        @com.aliyun.core.annotation.NameInMap("SchemaName")
        private String schemaName;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("TimeLastUpdated")
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
        public Long getIndexScanTimes() {
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
            private Long indexScanTimes; 
            private String indexSize; 
            private Boolean isPartitionTable; 
            private String parentTableName; 
            private String schemaName; 
            private String tableName; 
            private String timeLastUpdated; 

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>adbtest</p>
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * <p>The definition of the index.</p>
             * 
             * <strong>example:</strong>
             * <p>CREATE INDEX idx1 ON schema1.tab1_ptr_2010</p>
             */
            public Builder indexDef(String indexDef) {
                this.indexDef = indexDef;
                return this;
            }

            /**
             * <p>The name of the index.</p>
             * 
             * <strong>example:</strong>
             * <p>idx1</p>
             */
            public Builder indexName(String indexName) {
                this.indexName = indexName;
                return this;
            }

            /**
             * <p>The number of index scans.</p>
             * 
             * <strong>example:</strong>
             * <p>50000</p>
             */
            public Builder indexScanTimes(Long indexScanTimes) {
                this.indexScanTimes = indexScanTimes;
                return this;
            }

            /**
             * <p>The size of the index. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder indexSize(String indexSize) {
                this.indexSize = indexSize;
                return this;
            }

            /**
             * <p>Indicates whether the table is a partitioned table. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The table is a partitioned table.</li>
             * <li><strong>false</strong>: The table is not a partitioned table.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isPartitionTable(Boolean isPartitionTable) {
                this.isPartitionTable = isPartitionTable;
                return this;
            }

            /**
             * <p>The name of the parent table.</p>
             * 
             * <strong>example:</strong>
             * <p>tab1</p>
             */
            public Builder parentTableName(String parentTableName) {
                this.parentTableName = parentTableName;
                return this;
            }

            /**
             * <p>The name of the schema.</p>
             * 
             * <strong>example:</strong>
             * <p>schema1</p>
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * <p>The name of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>tab1_ptr_2010</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * <p>The time when the table was last deleted, inserted, or updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-08-08T20:00:00Z</p>
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
