// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachDatabaseAccountsFromUserGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DetachDatabaseAccountsFromUserGroupResponseBody</p>
 */
public class DetachDatabaseAccountsFromUserGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Results")
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Results.
         */
        public Builder results(java.util.List < Results> results) {
            this.results = results;
            return this;
        }

        public DetachDatabaseAccountsFromUserGroupResponseBody build() {
            return new DetachDatabaseAccountsFromUserGroupResponseBody(this);
        } 

    } 

    public static class DatabaseAccounts extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("DatabaseAccountId")
        private String databaseAccountId;

        @NameInMap("Message")
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
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * DatabaseAccountId.
             */
            public Builder databaseAccountId(String databaseAccountId) {
                this.databaseAccountId = databaseAccountId;
                return this;
            }

            /**
             * Message.
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
    public static class Results extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("DatabaseAccounts")
        private java.util.List < DatabaseAccounts> databaseAccounts;

        @NameInMap("DatabaseId")
        private String databaseId;

        @NameInMap("Message")
        private String message;

        @NameInMap("UserGroupId")
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
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * DatabaseAccounts.
             */
            public Builder databaseAccounts(java.util.List < DatabaseAccounts> databaseAccounts) {
                this.databaseAccounts = databaseAccounts;
                return this;
            }

            /**
             * DatabaseId.
             */
            public Builder databaseId(String databaseId) {
                this.databaseId = databaseId;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * UserGroupId.
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
