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
 * {@link DescribeDBInstanceDataSkewResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceDataSkewResponseBody</p>
 */
public class DescribeDBInstanceDataSkewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDBInstanceDataSkewResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>Details about data skew.</p>
         */
        public Builder items(java.util.List<Items> items) {
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
         * <p>The ID of the request.</p>
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
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDBInstanceDataSkewResponseBody build() {
            return new DescribeDBInstanceDataSkewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBInstanceDataSkewResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceDataSkewResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Items model) {
                this.databaseName = model.databaseName;
                this.distributeKey = model.distributeKey;
                this.owner = model.owner;
                this.schemaName = model.schemaName;
                this.sequence = model.sequence;
                this.tableName = model.tableName;
                this.tableSize = model.tableSize;
                this.tableSkew = model.tableSkew;
                this.timeLastUpdated = model.timeLastUpdated;
            } 

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
             * <p>The distribution key of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>ItemId</p>
             */
            public Builder distributeKey(String distributeKey) {
                this.distributeKey = distributeKey;
                return this;
            }

            /**
             * <p>The owner of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>adbpguser</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
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
             * <p>The sequence number of the data skew case. All data skew cases are sorted by severity in descending order.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sequence(Integer sequence) {
                this.sequence = sequence;
                return this;
            }

            /**
             * <p>The name of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>tab1</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * <p>The total number of rows in the table.</p>
             * 
             * <strong>example:</strong>
             * <p>100000</p>
             */
            public Builder tableSize(String tableSize) {
                this.tableSize = tableSize;
                return this;
            }

            /**
             * <p>The skew ratio of the table. Valid values: 0 to 100. Unit: %. A greater value indicates that the table is more severely skewed. A smaller value indicates less impact on query performance. A value of 0 indicates no data skew.</p>
             * 
             * <strong>example:</strong>
             * <p>10.23</p>
             */
            public Builder tableSkew(String tableSkew) {
                this.tableSkew = tableSkew;
                return this;
            }

            /**
             * <p>The time when the table was last deleted, inserted, or updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-09-08T20:00:00Z</p>
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
