// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDatabasesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDatabasesResponseBody</p>
 */
public class ListDatabasesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Databases")
    private Databases databases;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ListDatabasesResponseBody(Builder builder) {
        this.databases = builder.databases;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDatabasesResponseBody create() {
        return builder().build();
    }

    /**
     * @return databases
     */
    public Databases getDatabases() {
        return this.databases;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private Databases databases; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private String status; 

        /**
         * The queried databases.
         */
        public Builder databases(Databases databases) {
            this.databases = databases;
            return this;
        }

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

        public ListDatabasesResponseBody build() {
            return new ListDatabasesResponseBody(this);
        } 

    } 

    public static class Databases extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Databases")
        private java.util.List < String > databases;

        private Databases(Builder builder) {
            this.databases = builder.databases;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Databases create() {
            return builder().build();
        }

        /**
         * @return databases
         */
        public java.util.List < String > getDatabases() {
            return this.databases;
        }

        public static final class Builder {
            private java.util.List < String > databases; 

            /**
             * The queried databases.
             */
            public Builder databases(java.util.List < String > databases) {
                this.databases = databases;
                return this;
            }

            public Databases build() {
                return new Databases(this);
            } 

        } 

    }
}
