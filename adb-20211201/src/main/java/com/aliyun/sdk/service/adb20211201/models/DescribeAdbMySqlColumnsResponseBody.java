// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAdbMySqlColumnsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAdbMySqlColumnsResponseBody</p>
 */
public class DescribeAdbMySqlColumnsResponseBody extends TeaModel {
    @NameInMap("ColumnCount")
    private Integer columnCount;

    @NameInMap("Columns")
    private java.util.List < Columns> columns;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Schema")
    private String schema;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TableName")
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

    /**
     * @return columnCount
     */
    public Integer getColumnCount() {
        return this.columnCount;
    }

    /**
     * @return columns
     */
    public java.util.List < Columns> getColumns() {
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
        private java.util.List < Columns> columns; 
        private String message; 
        private String requestId; 
        private String schema; 
        private Boolean success; 
        private String tableName; 

        /**
         * The total number of columns.
         */
        public Builder columnCount(Integer columnCount) {
            this.columnCount = columnCount;
            return this;
        }

        /**
         * Details of the columns.
         */
        public Builder columns(java.util.List < Columns> columns) {
            this.columns = columns;
            return this;
        }

        /**
         * The message returned for the operation. Valid values:
         * <p>
         * 
         * *   **Success** is returned if the operation is successful.
         * *   An error message is returned if the operation fails.
         */
        public Builder message(String message) {
            this.message = message;
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
         * The name of the database.
         */
        public Builder schema(String schema) {
            this.schema = schema;
            return this;
        }

        /**
         * Indicates whether the operation is successful. Valid values:
         * <p>
         * 
         * *   **true**: The operation is successful.
         * *   **false**: The operation fails.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The name of the table.
         */
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            return this;
        }

        public DescribeAdbMySqlColumnsResponseBody build() {
            return new DescribeAdbMySqlColumnsResponseBody(this);
        } 

    } 

    public static class Columns extends TeaModel {
        @NameInMap("Comment")
        private String comment;

        @NameInMap("Name")
        private String name;

        @NameInMap("Type")
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

            /**
             * The comments of the column.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * The name of the column.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The data type of the column.
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
