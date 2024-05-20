// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeColumnsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeColumnsResponseBody</p>
 */
public class DescribeColumnsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeColumnsResponseBody(Builder builder) {
        this.items = builder.items;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeColumnsResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Items items; 
        private String requestId; 

        /**
         * Details of the columns.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeColumnsResponseBody build() {
            return new DescribeColumnsResponseBody(this);
        } 

    } 

    public static class Column extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoIncrementColumn")
        private Boolean autoIncrementColumn;

        @com.aliyun.core.annotation.NameInMap("ColumnName")
        private String columnName;

        @com.aliyun.core.annotation.NameInMap("DBClusterId")
        private String DBClusterId;

        @com.aliyun.core.annotation.NameInMap("PrimaryKey")
        private Boolean primaryKey;

        @com.aliyun.core.annotation.NameInMap("SchemaName")
        private String schemaName;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Column(Builder builder) {
            this.autoIncrementColumn = builder.autoIncrementColumn;
            this.columnName = builder.columnName;
            this.DBClusterId = builder.DBClusterId;
            this.primaryKey = builder.primaryKey;
            this.schemaName = builder.schemaName;
            this.tableName = builder.tableName;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Column create() {
            return builder().build();
        }

        /**
         * @return autoIncrementColumn
         */
        public Boolean getAutoIncrementColumn() {
            return this.autoIncrementColumn;
        }

        /**
         * @return columnName
         */
        public String getColumnName() {
            return this.columnName;
        }

        /**
         * @return DBClusterId
         */
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        /**
         * @return primaryKey
         */
        public Boolean getPrimaryKey() {
            return this.primaryKey;
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
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Boolean autoIncrementColumn; 
            private String columnName; 
            private String DBClusterId; 
            private Boolean primaryKey; 
            private String schemaName; 
            private String tableName; 
            private String type; 

            /**
             * Indicates whether the column is an auto-increment column. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder autoIncrementColumn(Boolean autoIncrementColumn) {
                this.autoIncrementColumn = autoIncrementColumn;
                return this;
            }

            /**
             * The column name.
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * The cluster ID.
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * Indicates whether the column is the primary key of the table. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder primaryKey(Boolean primaryKey) {
                this.primaryKey = primaryKey;
                return this;
            }

            /**
             * The database name.
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

            /**
             * The column type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Column build() {
                return new Column(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Column")
        private java.util.List < Column> column;

        private Items(Builder builder) {
            this.column = builder.column;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return column
         */
        public java.util.List < Column> getColumn() {
            return this.column;
        }

        public static final class Builder {
            private java.util.List < Column> column; 

            /**
             * Column.
             */
            public Builder column(java.util.List < Column> column) {
                this.column = column;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
