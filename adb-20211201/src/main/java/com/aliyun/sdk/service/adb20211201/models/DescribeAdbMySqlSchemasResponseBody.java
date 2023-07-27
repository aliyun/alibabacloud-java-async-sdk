// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAdbMySqlSchemasResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAdbMySqlSchemasResponseBody</p>
 */
public class DescribeAdbMySqlSchemasResponseBody extends TeaModel {
    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Schemas")
    private java.util.List < String > schemas;

    @NameInMap("Success")
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
    public java.util.List < String > getSchemas() {
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
        private java.util.List < String > schemas; 
        private Boolean success; 

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
         * The names of databases.
         */
        public Builder schemas(java.util.List < String > schemas) {
            this.schemas = schemas;
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

        public DescribeAdbMySqlSchemasResponseBody build() {
            return new DescribeAdbMySqlSchemasResponseBody(this);
        } 

    } 

}
