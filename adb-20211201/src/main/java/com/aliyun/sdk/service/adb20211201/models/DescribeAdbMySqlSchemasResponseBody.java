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
 * {@link DescribeAdbMySqlSchemasResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAdbMySqlSchemasResponseBody</p>
 */
public class DescribeAdbMySqlSchemasResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Schemas")
    private java.util.List<String> schemas;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeAdbMySqlSchemasResponseBody(Builder builder) {
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.schemas = builder.schemas;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAdbMySqlSchemasResponseBody create() {
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
     * @return schemas
     */
    public java.util.List<String> getSchemas() {
        return this.schemas;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String message; 
        private String requestId; 
        private java.util.List<String> schemas; 
        private Boolean success; 

        /**
         * <p>The returned message.</p>
         * <ul>
         * <li>If the request was successful, a <strong>success</strong> message is returned.</li>
         * <li>If the request failed, an error message is returned.</li>
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
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The queried databases.</p>
         */
        public Builder schemas(java.util.List<String> schemas) {
            this.schemas = schemas;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeAdbMySqlSchemasResponseBody build() {
            return new DescribeAdbMySqlSchemasResponseBody(this);
        } 

    } 

}
