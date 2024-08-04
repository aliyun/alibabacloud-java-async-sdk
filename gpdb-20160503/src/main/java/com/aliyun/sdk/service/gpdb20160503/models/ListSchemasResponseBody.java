// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSchemasResponseBody} extends {@link TeaModel}
 *
 * <p>ListSchemasResponseBody</p>
 */
public class ListSchemasResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Schemas")
    private Schemas schemas;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ListSchemasResponseBody(Builder builder) {
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.schemas = builder.schemas;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSchemasResponseBody create() {
        return builder().build();
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String message; 
        private String nextToken; 
        private String requestId; 
        private Schemas schemas; 
        private String status; 

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The queried schemas.
         */
        public Builder schemas(Schemas schemas) {
            this.schemas = schemas;
            return this;
        }

        /**
         * The status of the operation. Valid values:
         * <p>
         * 
         * *   **success**
         * *   **fail**
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public ListSchemasResponseBody build() {
            return new ListSchemasResponseBody(this);
        } 

    } 

    public static class Schemas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Schemas")
        private java.util.List < String > schemas;

        private Schemas(Builder builder) {
            this.schemas = builder.schemas;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Schemas create() {
            return builder().build();
        }

        /**
         * @return schemas
         */
        public java.util.List < String > getSchemas() {
            return this.schemas;
        }

        public static final class Builder {
            private java.util.List < String > schemas; 

            /**
             * The queried schemas.
             */
            public Builder schemas(java.util.List < String > schemas) {
                this.schemas = schemas;
                return this;
            }

            public Schemas build() {
                return new Schemas(this);
            } 

        } 

    }
}
