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
 * {@link DescribeAdbMySqlIndexesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAdbMySqlIndexesResponseBody</p>
 */
public class DescribeAdbMySqlIndexesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IndexCount")
    private Integer indexCount;

    @com.aliyun.core.annotation.NameInMap("Indexes")
    private java.util.List<Indexes> indexes;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Schema")
    private String schema;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TableName")
    private String tableName;

    private DescribeAdbMySqlIndexesResponseBody(Builder builder) {
        this.indexCount = builder.indexCount;
        this.indexes = builder.indexes;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.schema = builder.schema;
        this.success = builder.success;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAdbMySqlIndexesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return indexCount
     */
    public Integer getIndexCount() {
        return this.indexCount;
    }

    /**
     * @return indexes
     */
    public java.util.List<Indexes> getIndexes() {
        return this.indexes;
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
     * @return schema
     */
    public String getSchema() {
        return this.schema;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    public static final class Builder {
        private Integer indexCount; 
        private java.util.List<Indexes> indexes; 
        private String message; 
        private String requestId; 
        private String schema; 
        private Boolean success; 
        private String tableName; 

        private Builder() {
        } 

        private Builder(DescribeAdbMySqlIndexesResponseBody model) {
            this.indexCount = model.indexCount;
            this.indexes = model.indexes;
            this.message = model.message;
            this.requestId = model.requestId;
            this.schema = model.schema;
            this.success = model.success;
            this.tableName = model.tableName;
        } 

        /**
         * IndexCount.
         */
        public Builder indexCount(Integer indexCount) {
            this.indexCount = indexCount;
            return this;
        }

        /**
         * Indexes.
         */
        public Builder indexes(java.util.List<Indexes> indexes) {
            this.indexes = indexes;
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
         * Schema.
         */
        public Builder schema(String schema) {
            this.schema = schema;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TableName.
         */
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            return this;
        }

        public DescribeAdbMySqlIndexesResponseBody build() {
            return new DescribeAdbMySqlIndexesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAdbMySqlIndexesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAdbMySqlIndexesResponseBody</p>
     */
    public static class Indexes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Column")
        private String column;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Indexes(Builder builder) {
            this.column = builder.column;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Indexes create() {
            return builder().build();
        }

        /**
         * @return column
         */
        public String getColumn() {
            return this.column;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String column; 
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(Indexes model) {
                this.column = model.column;
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * Column.
             */
            public Builder column(String column) {
                this.column = column;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Indexes build() {
                return new Indexes(this);
            } 

        } 

    }
}
