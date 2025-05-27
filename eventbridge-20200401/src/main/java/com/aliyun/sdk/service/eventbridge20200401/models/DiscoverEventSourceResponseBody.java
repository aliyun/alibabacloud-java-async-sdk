// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link DiscoverEventSourceResponseBody} extends {@link TeaModel}
 *
 * <p>DiscoverEventSourceResponseBody</p>
 */
public class DiscoverEventSourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DiscoverEventSourceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DiscoverEventSourceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DiscoverEventSourceResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DiscoverEventSourceResponseBody build() {
            return new DiscoverEventSourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DiscoverEventSourceResponseBody} extends {@link TeaModel}
     *
     * <p>DiscoverEventSourceResponseBody</p>
     */
    public static class Columns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Extra")
        private String extra;

        @com.aliyun.core.annotation.NameInMap("Field")
        private String field;

        @com.aliyun.core.annotation.NameInMap("IsNull")
        private String isNull;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Columns(Builder builder) {
            this.extra = builder.extra;
            this.field = builder.field;
            this.isNull = builder.isNull;
            this.key = builder.key;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Columns create() {
            return builder().build();
        }

        /**
         * @return extra
         */
        public String getExtra() {
            return this.extra;
        }

        /**
         * @return field
         */
        public String getField() {
            return this.field;
        }

        /**
         * @return isNull
         */
        public String getIsNull() {
            return this.isNull;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String extra; 
            private String field; 
            private String isNull; 
            private String key; 
            private String type; 

            private Builder() {
            } 

            private Builder(Columns model) {
                this.extra = model.extra;
                this.field = model.field;
                this.isNull = model.isNull;
                this.key = model.key;
                this.type = model.type;
            } 

            /**
             * Extra.
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * Field.
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            /**
             * IsNull.
             */
            public Builder isNull(String isNull) {
                this.isNull = isNull;
                return this;
            }

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Columns build() {
                return new Columns(this);
            } 

        } 

    }
    /**
     * 
     * {@link DiscoverEventSourceResponseBody} extends {@link TeaModel}
     *
     * <p>DiscoverEventSourceResponseBody</p>
     */
    public static class TableSchema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Columns")
        private java.util.List<Columns> columns;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        private TableSchema(Builder builder) {
            this.columns = builder.columns;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableSchema create() {
            return builder().build();
        }

        /**
         * @return columns
         */
        public java.util.List<Columns> getColumns() {
            return this.columns;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private java.util.List<Columns> columns; 
            private String tableName; 

            private Builder() {
            } 

            private Builder(TableSchema model) {
                this.columns = model.columns;
                this.tableName = model.tableName;
            } 

            /**
             * Columns.
             */
            public Builder columns(java.util.List<Columns> columns) {
                this.columns = columns;
                return this;
            }

            /**
             * TableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public TableSchema build() {
                return new TableSchema(this);
            } 

        } 

    }
    /**
     * 
     * {@link DiscoverEventSourceResponseBody} extends {@link TeaModel}
     *
     * <p>DiscoverEventSourceResponseBody</p>
     */
    public static class SourceMySQLDiscovery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatabaseNames")
        private java.util.List<String> databaseNames;

        @com.aliyun.core.annotation.NameInMap("SimpleData")
        private String simpleData;

        @com.aliyun.core.annotation.NameInMap("TableNames")
        private java.util.List<String> tableNames;

        @com.aliyun.core.annotation.NameInMap("TableSchema")
        private TableSchema tableSchema;

        private SourceMySQLDiscovery(Builder builder) {
            this.databaseNames = builder.databaseNames;
            this.simpleData = builder.simpleData;
            this.tableNames = builder.tableNames;
            this.tableSchema = builder.tableSchema;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceMySQLDiscovery create() {
            return builder().build();
        }

        /**
         * @return databaseNames
         */
        public java.util.List<String> getDatabaseNames() {
            return this.databaseNames;
        }

        /**
         * @return simpleData
         */
        public String getSimpleData() {
            return this.simpleData;
        }

        /**
         * @return tableNames
         */
        public java.util.List<String> getTableNames() {
            return this.tableNames;
        }

        /**
         * @return tableSchema
         */
        public TableSchema getTableSchema() {
            return this.tableSchema;
        }

        public static final class Builder {
            private java.util.List<String> databaseNames; 
            private String simpleData; 
            private java.util.List<String> tableNames; 
            private TableSchema tableSchema; 

            private Builder() {
            } 

            private Builder(SourceMySQLDiscovery model) {
                this.databaseNames = model.databaseNames;
                this.simpleData = model.simpleData;
                this.tableNames = model.tableNames;
                this.tableSchema = model.tableSchema;
            } 

            /**
             * DatabaseNames.
             */
            public Builder databaseNames(java.util.List<String> databaseNames) {
                this.databaseNames = databaseNames;
                return this;
            }

            /**
             * SimpleData.
             */
            public Builder simpleData(String simpleData) {
                this.simpleData = simpleData;
                return this;
            }

            /**
             * TableNames.
             */
            public Builder tableNames(java.util.List<String> tableNames) {
                this.tableNames = tableNames;
                return this;
            }

            /**
             * TableSchema.
             */
            public Builder tableSchema(TableSchema tableSchema) {
                this.tableSchema = tableSchema;
                return this;
            }

            public SourceMySQLDiscovery build() {
                return new SourceMySQLDiscovery(this);
            } 

        } 

    }
    /**
     * 
     * {@link DiscoverEventSourceResponseBody} extends {@link TeaModel}
     *
     * <p>DiscoverEventSourceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SourceMySQLDiscovery")
        private SourceMySQLDiscovery sourceMySQLDiscovery;

        private Data(Builder builder) {
            this.sourceMySQLDiscovery = builder.sourceMySQLDiscovery;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return sourceMySQLDiscovery
         */
        public SourceMySQLDiscovery getSourceMySQLDiscovery() {
            return this.sourceMySQLDiscovery;
        }

        public static final class Builder {
            private SourceMySQLDiscovery sourceMySQLDiscovery; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.sourceMySQLDiscovery = model.sourceMySQLDiscovery;
            } 

            /**
             * SourceMySQLDiscovery.
             */
            public Builder sourceMySQLDiscovery(SourceMySQLDiscovery sourceMySQLDiscovery) {
                this.sourceMySQLDiscovery = sourceMySQLDiscovery;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
