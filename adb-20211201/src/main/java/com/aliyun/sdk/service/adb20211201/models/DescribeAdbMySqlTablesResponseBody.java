// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAdbMySqlTablesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAdbMySqlTablesResponseBody</p>
 */
public class DescribeAdbMySqlTablesResponseBody extends TeaModel {
    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Schema")
    private String schema;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Tables")
    private java.util.List < String > tables;

    private DescribeAdbMySqlTablesResponseBody(Builder builder) {
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.schema = builder.schema;
        this.success = builder.success;
        this.tables = builder.tables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAdbMySqlTablesResponseBody create() {
        return builder().build();
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
     * @return tables
     */
    public java.util.List < String > getTables() {
        return this.tables;
    }

    public static final class Builder {
        private String message; 
        private String requestId; 
        private String schema; 
        private Boolean success; 
        private java.util.List < String > tables; 

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
         * The names of tables.
         */
        public Builder tables(java.util.List < String > tables) {
            this.tables = tables;
            return this;
        }

        public DescribeAdbMySqlTablesResponseBody build() {
            return new DescribeAdbMySqlTablesResponseBody(this);
        } 

    } 

}
