// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAdbMySqlTablesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAdbMySqlTablesResponseBody</p>
 */
public class DescribeAdbMySqlTablesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Schema")
    private String schema;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Tables")
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
         * <p>The message returned for the operation. Valid values:</p>
         * <ul>
         * <li><strong>Success</strong> is returned if the operation is successful.</li>
         * <li>An error message is returned if the operation fails.</li>
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7A7D49E3-5585-5DF8-B62C-75C46B4991DC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>adb_demo</p>
         */
        public Builder schema(String schema) {
            this.schema = schema;
            return this;
        }

        /**
         * <p>Indicates whether the operation is successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The operation is successful.</li>
         * <li><strong>false</strong>: The operation fails.</li>
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
         * <p>The names of tables.</p>
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
