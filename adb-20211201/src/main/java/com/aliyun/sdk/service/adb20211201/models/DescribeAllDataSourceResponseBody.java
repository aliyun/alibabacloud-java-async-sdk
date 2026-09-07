// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link DescribeAllDataSourceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAllDataSourceResponseBody</p>
 */
public class DescribeAllDataSourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Columns")
    private Columns columns;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Schemas")
    private Schemas schemas;

    @com.aliyun.core.annotation.NameInMap("Tables")
    private Tables tables;

    private DescribeAllDataSourceResponseBody(Builder builder) {
        this.columns = builder.columns;
        this.requestId = builder.requestId;
        this.schemas = builder.schemas;
        this.tables = builder.tables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAllDataSourceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeAllDataSourceResponseBody model) {
            this.columns = model.columns;
            this.requestId = model.requestId;
            this.schemas = model.schemas;
            this.tables = model.tables;
        } 

        /**
         * Columns.
         */
        public Builder columns(Columns columns) {
            this.columns = columns;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C7EDB8E4-9769-4233-88C7-DCA4C9******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Schemas.
         */
        public Builder schemas(Schemas schemas) {
            this.schemas = schemas;
            return this;
        }

        /**
         * Tables.
         */
        public Builder tables(Tables tables) {
            this.tables = tables;
            return this;
        }

        public DescribeAllDataSourceResponseBody build() {
            return new DescribeAllDataSourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAllDataSourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAllDataSourceResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Column model) {
                this.autoIncrementColumn = model.autoIncrementColumn;
                this.columnName = model.columnName;
                this.DBClusterId = model.DBClusterId;
                this.primaryKey = model.primaryKey;
                this.schemaName = model.schemaName;
                this.tableName = model.tableName;
                this.type = model.type;
            } 

            /**
             * AutoIncrementColumn.
             */
            public Builder autoIncrementColumn(Boolean autoIncrementColumn) {
                this.autoIncrementColumn = autoIncrementColumn;
                return this;
            }

            /**
             * ColumnName.
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * DBClusterId.
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * PrimaryKey.
             */
            public Builder primaryKey(Boolean primaryKey) {
                this.primaryKey = primaryKey;
                return this;
            }

            /**
             * SchemaName.
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * TableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * Type.
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
    /**
     * 
     * {@link DescribeAllDataSourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAllDataSourceResponseBody</p>
     */
    public static class Columns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Column")
        private java.util.List<Column> column;

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
        public java.util.List<Column> getColumn() {
            return this.column;
        }

        public static final class Builder {
            private java.util.List<Column> column; 

            private Builder() {
            } 

            private Builder(Columns model) {
                this.column = model.column;
            } 

            /**
             * Column.
             */
            public Builder column(java.util.List<Column> column) {
                this.column = column;
                return this;
            }

            public Columns build() {
                return new Columns(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAllDataSourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAllDataSourceResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Schema model) {
                this.DBClusterId = model.DBClusterId;
                this.schemaName = model.schemaName;
            } 

            /**
             * DBClusterId.
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * SchemaName.
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
    /**
     * 
     * {@link DescribeAllDataSourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAllDataSourceResponseBody</p>
     */
    public static class Schemas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Schema")
        private java.util.List<Schema> schema;

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
        public java.util.List<Schema> getSchema() {
            return this.schema;
        }

        public static final class Builder {
            private java.util.List<Schema> schema; 

            private Builder() {
            } 

            private Builder(Schemas model) {
                this.schema = model.schema;
            } 

            /**
             * Schema.
             */
            public Builder schema(java.util.List<Schema> schema) {
                this.schema = schema;
                return this;
            }

            public Schemas build() {
                return new Schemas(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAllDataSourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAllDataSourceResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Table model) {
                this.DBClusterId = model.DBClusterId;
                this.schemaName = model.schemaName;
                this.tableName = model.tableName;
            } 

            /**
             * DBClusterId.
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * SchemaName.
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * TableName.
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
    /**
     * 
     * {@link DescribeAllDataSourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAllDataSourceResponseBody</p>
     */
    public static class Tables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Table")
        private java.util.List<Table> table;

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
        public java.util.List<Table> getTable() {
            return this.table;
        }

        public static final class Builder {
            private java.util.List<Table> table; 

            private Builder() {
            } 

            private Builder(Tables model) {
                this.table = model.table;
            } 

            /**
             * Table.
             */
            public Builder table(java.util.List<Table> table) {
                this.table = table;
                return this;
            }

            public Tables build() {
                return new Tables(this);
            } 

        } 

    }
}
