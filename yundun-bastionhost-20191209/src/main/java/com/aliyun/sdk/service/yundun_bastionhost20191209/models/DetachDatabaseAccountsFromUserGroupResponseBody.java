// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DetachDatabaseAccountsFromUserGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DetachDatabaseAccountsFromUserGroupResponseBody</p>
 */
public class DetachDatabaseAccountsFromUserGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Results")
    private java.util.List < Results> results;

    private DetachDatabaseAccountsFromUserGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.results = builder.results;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachDatabaseAccountsFromUserGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return results
     */
    public java.util.List < Results> getResults() {
        return this.results;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Results> results; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AC528ED1-C302-56E5-9CB5-ADA625D64FF9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The result of the call.</p>
         */
        public Builder results(java.util.List < Results> results) {
            this.results = results;
            return this;
        }

        public DetachDatabaseAccountsFromUserGroupResponseBody build() {
            return new DetachDatabaseAccountsFromUserGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DetachDatabaseAccountsFromUserGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DetachDatabaseAccountsFromUserGroupResponseBody</p>
     */
    public static class DatabaseAccounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("DatabaseAccountId")
        private String databaseAccountId;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        private DatabaseAccounts(Builder builder) {
            this.code = builder.code;
            this.databaseAccountId = builder.databaseAccountId;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatabaseAccounts create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return databaseAccountId
         */
        public String getDatabaseAccountId() {
            return this.databaseAccountId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String code; 
            private String databaseAccountId; 
            private String message; 

            /**
             * <p>The error code that is returned. If OK is returned, the operation was successful. If other error codes are returned, the operation failed.</p>
             * 
             * <strong>example:</strong>
             * <p>OK</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The ID of the database account on which the permissions are revoked.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder databaseAccountId(String databaseAccountId) {
                this.databaseAccountId = databaseAccountId;
                return this;
            }

            /**
             * <p>The error message that is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>N/A</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public DatabaseAccounts build() {
                return new DatabaseAccounts(this);
            } 

        } 

    }
    /**
     * 
     * {@link DetachDatabaseAccountsFromUserGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DetachDatabaseAccountsFromUserGroupResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("DatabaseAccounts")
        private java.util.List < DatabaseAccounts> databaseAccounts;

        @com.aliyun.core.annotation.NameInMap("DatabaseId")
        private String databaseId;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("UserGroupId")
        private String userGroupId;

        private Results(Builder builder) {
            this.code = builder.code;
            this.databaseAccounts = builder.databaseAccounts;
            this.databaseId = builder.databaseId;
            this.message = builder.message;
            this.userGroupId = builder.userGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return databaseAccounts
         */
        public java.util.List < DatabaseAccounts> getDatabaseAccounts() {
            return this.databaseAccounts;
        }

        /**
         * @return databaseId
         */
        public String getDatabaseId() {
            return this.databaseId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return userGroupId
         */
        public String getUserGroupId() {
            return this.userGroupId;
        }

        public static final class Builder {
            private String code; 
            private java.util.List < DatabaseAccounts> databaseAccounts; 
            private String databaseId; 
            private String message; 
            private String userGroupId; 

            /**
             * <p>The error code that is returned. If OK is returned, the operation was successful. If other error codes are returned, the operation failed.</p>
             * 
             * <strong>example:</strong>
             * <p>OK</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>A list that shows the authorization results of the database accounts.</p>
             */
            public Builder databaseAccounts(java.util.List < DatabaseAccounts> databaseAccounts) {
                this.databaseAccounts = databaseAccounts;
                return this;
            }

            /**
             * <p>The ID of the database on which the permissions are revoked.</p>
             * 
             * <strong>example:</strong>
             * <p>27</p>
             */
            public Builder databaseId(String databaseId) {
                this.databaseId = databaseId;
                return this;
            }

            /**
             * <p>The error message that is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>N/A</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The user group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder userGroupId(String userGroupId) {
                this.userGroupId = userGroupId;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
