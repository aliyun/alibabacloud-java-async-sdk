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
 * {@link DescribeAdbMySqlColumnsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAdbMySqlColumnsResponseBody</p>
 */
public class DescribeAdbMySqlColumnsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ColumnCount")
    private Integer columnCount;

    @com.aliyun.core.annotation.NameInMap("Columns")
    private java.util.List<Columns> columns;

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

    private DescribeAdbMySqlColumnsResponseBody(Builder builder) {
        this.columnCount = builder.columnCount;
        this.columns = builder.columns;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.schema = builder.schema;
        this.success = builder.success;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAdbMySqlColumnsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return columnCount
     */
    public Integer getColumnCount() {
        return this.columnCount;
    }

    /**
     * @return columns
     */
    public java.util.List<Columns> getColumns() {
        return this.columns;
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
        private Integer columnCount; 
        private java.util.List<Columns> columns; 
        private String message; 
        private String requestId; 
        private String schema; 
        private Boolean success; 
        private String tableName; 

        private Builder() {
        } 

        private Builder(DescribeAdbMySqlColumnsResponseBody model) {
            this.columnCount = model.columnCount;
            this.columns = model.columns;
            this.message = model.message;
            this.requestId = model.requestId;
            this.schema = model.schema;
            this.success = model.success;
            this.tableName = model.tableName;
        } 

        /**
         * <p>The total number of columns.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder columnCount(Integer columnCount) {
            this.columnCount = columnCount;
            return this;
        }

        /**
         * <p>The column information.</p>
         */
        public Builder columns(java.util.List<Columns> columns) {
            this.columns = columns;
            return this;
        }

        /**
         * <p>The additional information about the call result. Valid values:</p>
         * <ul>
         * <li>If the request was successful, <strong>Success</strong> is returned. </li>
         * <li>If the request failed, a specific error code is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A9F013CD-0222-595E-8157-445969B97F03</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The database name.</p>
         * 
         * <strong>example:</strong>
         * <p>adb_demo</p>
         */
        public Builder schema(String schema) {
            this.schema = schema;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful.</li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The table name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            return this;
        }

        public DescribeAdbMySqlColumnsResponseBody build() {
            return new DescribeAdbMySqlColumnsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAdbMySqlColumnsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAdbMySqlColumnsResponseBody</p>
     */
    public static class Columns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Columns(Builder builder) {
            this.comment = builder.comment;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Columns create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
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
            private String comment; 
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(Columns model) {
                this.comment = model.comment;
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * <p>The column comment.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The column name.</p>
             * 
             * <strong>example:</strong>
             * <p>id</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The data type of the column.</p>
             * 
             * <strong>example:</strong>
             * <p>bigint</p>
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
}
