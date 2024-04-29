// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstanceDataSkewResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceDataSkewResponseBody</p>
 */
public class DescribeDBInstanceDataSkewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List < Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDBInstanceDataSkewResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceDataSkewResponseBody create() {
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
         * Details about data skew.
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
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDBInstanceDataSkewResponseBody build() {
            return new DescribeDBInstanceDataSkewResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("DistributeKey")
        private String distributeKey;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("SchemaName")
        private String schemaName;

        @com.aliyun.core.annotation.NameInMap("Sequence")
        private Integer sequence;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("TableSize")
        private String tableSize;

        @com.aliyun.core.annotation.NameInMap("TableSkew")
        private String tableSkew;

        @com.aliyun.core.annotation.NameInMap("TimeLastUpdated")
        private String timeLastUpdated;

        private Items(Builder builder) {
            this.databaseName = builder.databaseName;
            this.distributeKey = builder.distributeKey;
            this.owner = builder.owner;
            this.schemaName = builder.schemaName;
            this.sequence = builder.sequence;
            this.tableName = builder.tableName;
            this.tableSize = builder.tableSize;
            this.tableSkew = builder.tableSkew;
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
         * @return distributeKey
         */
        public String getDistributeKey() {
            return this.distributeKey;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return schemaName
         */
        public String getSchemaName() {
            return this.schemaName;
        }

        /**
         * @return sequence
         */
        public Integer getSequence() {
            return this.sequence;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return tableSize
         */
        public String getTableSize() {
            return this.tableSize;
        }

        /**
         * @return tableSkew
         */
        public String getTableSkew() {
            return this.tableSkew;
        }

        /**
         * @return timeLastUpdated
         */
        public String getTimeLastUpdated() {
            return this.timeLastUpdated;
        }

        public static final class Builder {
            private String databaseName; 
            private String distributeKey; 
            private String owner; 
            private String schemaName; 
            private Integer sequence; 
            private String tableName; 
            private String tableSize; 
            private String tableSkew; 
            private String timeLastUpdated; 

            /**
             * The name of the database.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * The distribution key of the table.
             */
            public Builder distributeKey(String distributeKey) {
                this.distributeKey = distributeKey;
                return this;
            }

            /**
             * The owner of the table.
             */
            public Builder owner(String owner) {
                this.owner = owner;
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
             * The sequence number of the data skew case. All data skew cases are sorted by severity in descending order.
             */
            public Builder sequence(Integer sequence) {
                this.sequence = sequence;
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
             * The total number of rows in the table.
             */
            public Builder tableSize(String tableSize) {
                this.tableSize = tableSize;
                return this;
            }

            /**
             * The skew ratio of the table. Valid values: 0 to 100. Unit: %. A greater value indicates that the table is more severely skewed. A smaller value indicates less impact on query performance. A value of 0 indicates no data skew.
             */
            public Builder tableSkew(String tableSkew) {
                this.tableSkew = tableSkew;
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
