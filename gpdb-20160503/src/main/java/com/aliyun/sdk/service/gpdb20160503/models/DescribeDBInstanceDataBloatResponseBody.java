// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstanceDataBloatResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceDataBloatResponseBody</p>
 */
public class DescribeDBInstanceDataBloatResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List < Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDBInstanceDataBloatResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceDataBloatResponseBody create() {
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
         * The queried data bloat.
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

        public DescribeDBInstanceDataBloatResponseBody build() {
            return new DescribeDBInstanceDataBloatResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BloatCeoff")
        private String bloatCeoff;

        @com.aliyun.core.annotation.NameInMap("BloatSize")
        private String bloatSize;

        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("ExpectTableSize")
        private String expectTableSize;

        @com.aliyun.core.annotation.NameInMap("RealTableSize")
        private String realTableSize;

        @com.aliyun.core.annotation.NameInMap("SchemaName")
        private String schemaName;

        @com.aliyun.core.annotation.NameInMap("Sequence")
        private Integer sequence;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        @com.aliyun.core.annotation.NameInMap("SuggestedAction")
        private String suggestedAction;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("TimeLastUpdated")
        private String timeLastUpdated;

        @com.aliyun.core.annotation.NameInMap("TimeLastVacuumed")
        private String timeLastVacuumed;

        private Items(Builder builder) {
            this.bloatCeoff = builder.bloatCeoff;
            this.bloatSize = builder.bloatSize;
            this.databaseName = builder.databaseName;
            this.expectTableSize = builder.expectTableSize;
            this.realTableSize = builder.realTableSize;
            this.schemaName = builder.schemaName;
            this.sequence = builder.sequence;
            this.storageType = builder.storageType;
            this.suggestedAction = builder.suggestedAction;
            this.tableName = builder.tableName;
            this.timeLastUpdated = builder.timeLastUpdated;
            this.timeLastVacuumed = builder.timeLastVacuumed;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return bloatCeoff
         */
        public String getBloatCeoff() {
            return this.bloatCeoff;
        }

        /**
         * @return bloatSize
         */
        public String getBloatSize() {
            return this.bloatSize;
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return expectTableSize
         */
        public String getExpectTableSize() {
            return this.expectTableSize;
        }

        /**
         * @return realTableSize
         */
        public String getRealTableSize() {
            return this.realTableSize;
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
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        /**
         * @return suggestedAction
         */
        public String getSuggestedAction() {
            return this.suggestedAction;
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

        /**
         * @return timeLastVacuumed
         */
        public String getTimeLastVacuumed() {
            return this.timeLastVacuumed;
        }

        public static final class Builder {
            private String bloatCeoff; 
            private String bloatSize; 
            private String databaseName; 
            private String expectTableSize; 
            private String realTableSize; 
            private String schemaName; 
            private Integer sequence; 
            private String storageType; 
            private String suggestedAction; 
            private String tableName; 
            private String timeLastUpdated; 
            private String timeLastVacuumed; 

            /**
             * The coefficient of data bloat. It is calculated by using the following formula:
             * <p>
             * 
             * Bloat coefficient = Number of dead rows/Number of active rows.
             */
            public Builder bloatCeoff(String bloatCeoff) {
                this.bloatCeoff = bloatCeoff;
                return this;
            }

            /**
             * The bloat size of the table. It indicates the amount of space that can be released.
             */
            public Builder bloatSize(String bloatSize) {
                this.bloatSize = bloatSize;
                return this;
            }

            /**
             * The name of the database.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * The expected size of the table.
             * <p>
             * 
             * It indicates the size of the table that has no data bloat.
             */
            public Builder expectTableSize(String expectTableSize) {
                this.expectTableSize = expectTableSize;
                return this;
            }

            /**
             * The actual size of the table.
             */
            public Builder realTableSize(String realTableSize) {
                this.realTableSize = realTableSize;
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
             * The sequence number.
             */
            public Builder sequence(Integer sequence) {
                this.sequence = sequence;
                return this;
            }

            /**
             * The storage type of the table. Valid values:
             * <p>
             * 
             * *   **Heap Table**
             * *   **Append-Only Heap Table**
             * *   **Append-Only Columnar Table**
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * This parameter is not returned.
             */
            public Builder suggestedAction(String suggestedAction) {
                this.suggestedAction = suggestedAction;
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

            /**
             * The time when the table was last vacuumed. The time is displayed in UTC.
             */
            public Builder timeLastVacuumed(String timeLastVacuumed) {
                this.timeLastVacuumed = timeLastVacuumed;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
