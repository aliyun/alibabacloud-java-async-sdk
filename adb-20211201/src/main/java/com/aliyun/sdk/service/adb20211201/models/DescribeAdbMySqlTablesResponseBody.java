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
    private java.util.List<String> tables;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<String> getTables() {
        return this.tables;
    }

    public static final class Builder {
        private String message; 
        private String requestId; 
        private String schema; 
        private Boolean success; 
        private java.util.List<String> tables; 

        private Builder() {
        } 

        private Builder(DescribeAdbMySqlTablesResponseBody model) {
            this.message = model.message;
            this.requestId = model.requestId;
            this.schema = model.schema;
            this.success = model.success;
            this.tables = model.tables;
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
         * <p>7A7D49E3-5585-5DF8-B62C-75C46B4991DC</p>
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
         * <p>Indicates whether the call was successful. Valid values:</p>
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
         * <p>The table information.</p>
         */
        public Builder tables(java.util.List<String> tables) {
            this.tables = tables;
            return this;
        }

        public DescribeAdbMySqlTablesResponseBody build() {
            return new DescribeAdbMySqlTablesResponseBody(this);
        } 

    } 

}
