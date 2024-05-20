// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAllDataSourcesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAllDataSourcesResponseBody</p>
 */
public class DescribeAllDataSourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Columns")
    private Columns columns;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Schemas")
    private Schemas schemas;

    @com.aliyun.core.annotation.NameInMap("Tables")
    private Tables tables;

    private DescribeAllDataSourcesResponseBody(Builder builder) {
        this.columns = builder.columns;
        this.requestId = builder.requestId;
        this.schemas = builder.schemas;
        this.tables = builder.tables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAllDataSourcesResponseBody create() {
        return builder().build();
    }

    /**
     * @return columns
     */
    public Columns getColumns() {
        return this.columns;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return schemas
     */
    public Schemas getSchemas() {
        return this.schemas;
    }

    /**
     * @return tables
     */
    public Tables getTables() {
        return this.tables;
    }

    public static final class Builder {
        private Columns columns; 
        private String requestId; 
        private Schemas schemas; 
        private Tables tables; 

        /**
         * Details of the columns.
         */
        public Builder columns(Columns columns) {
            this.columns = columns;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the databases.
         */
        public Builder schemas(Schemas schemas) {
            this.schemas = schemas;
            return this;
        }

        /**
         * The information about the tables.
         */
        public Builder tables(Tables tables) {
            this.tables = tables;
            return this;
        }

        public DescribeAllDataSourcesResponseBody build() {
            return new DescribeAllDataSourcesResponseBody(this);
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
             * *   **true**: The column is the primary key of the table.
             * *   **false**: The column is not the primary key of the table.
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
    public static class Columns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Column")
        private java.util.List < Column> column;

        private Columns(Builder builder) {
            this.column = builder.column;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Columns create() {
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

            public Columns build() {
                return new Columns(this);
            } 

        } 

    }
    public static class Schema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBClusterId")
        private String DBClusterId;

        @com.aliyun.core.annotation.NameInMap("SchemaName")
        private String schemaName;

        private Schema(Builder builder) {
            this.DBClusterId = builder.DBClusterId;
            this.schemaName = builder.schemaName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Schema create() {
            return builder().build();
        }

        /**
         * @return DBClusterId
         */
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        /**
         * @return schemaName
         */
        public String getSchemaName() {
            return this.schemaName;
        }

        public static final class Builder {
            private String DBClusterId; 
            private String schemaName; 

            /**
             * The cluster ID.
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * The database name.
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            public Schema build() {
                return new Schema(this);
            } 

        } 

    }
    public static class Schemas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Schema")
        private java.util.List < Schema> schema;

        private Schemas(Builder builder) {
            this.schema = builder.schema;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Schemas create() {
            return builder().build();
        }

        /**
         * @return schema
         */
        public java.util.List < Schema> getSchema() {
            return this.schema;
        }

        public static final class Builder {
            private java.util.List < Schema> schema; 

            /**
             * Schema.
             */
            public Builder schema(java.util.List < Schema> schema) {
                this.schema = schema;
                return this;
            }

            public Schemas build() {
                return new Schemas(this);
            } 

        } 

    }
    public static class Table extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBClusterId")
        private String DBClusterId;

        @com.aliyun.core.annotation.NameInMap("SchemaName")
        private String schemaName;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        private Table(Builder builder) {
            this.DBClusterId = builder.DBClusterId;
            this.schemaName = builder.schemaName;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Table create() {
            return builder().build();
        }

        /**
         * @return DBClusterId
         */
        public String getDBClusterId() {
            return this.DBClusterId;
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
            private String DBClusterId; 
            private String schemaName; 
            private String tableName; 

            /**
             * The cluster ID.
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
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

            public Table build() {
                return new Table(this);
            } 

        } 

    }
    public static class Tables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Table")
        private java.util.List < Table> table;

        private Tables(Builder builder) {
            this.table = builder.table;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tables create() {
            return builder().build();
        }

        /**
         * @return table
         */
        public java.util.List < Table> getTable() {
            return this.table;
        }

        public static final class Builder {
            private java.util.List < Table> table; 

            /**
             * Table.
             */
            public Builder table(java.util.List < Table> table) {
                this.table = table;
                return this;
            }

            public Tables build() {
                return new Tables(this);
            } 

        } 

    }
}
