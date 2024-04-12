// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDatabaseAccountsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDatabaseAccountsResponseBody</p>
 */
public class ListDatabaseAccountsResponseBody extends TeaModel {
    @NameInMap("DatabaseAccounts")
    private java.util.List < DatabaseAccounts> databaseAccounts;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListDatabaseAccountsResponseBody(Builder builder) {
        this.databaseAccounts = builder.databaseAccounts;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDatabaseAccountsResponseBody create() {
        return builder().build();
    }

    /**
     * @return databaseAccounts
     */
    public java.util.List < DatabaseAccounts> getDatabaseAccounts() {
        return this.databaseAccounts;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < DatabaseAccounts> databaseAccounts; 
        private String requestId; 
        private Long totalCount; 

        /**
         * DatabaseAccounts.
         */
        public Builder databaseAccounts(java.util.List < DatabaseAccounts> databaseAccounts) {
            this.databaseAccounts = databaseAccounts;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDatabaseAccountsResponseBody build() {
            return new ListDatabaseAccountsResponseBody(this);
        } 

    } 

    public static class DatabaseAccounts extends TeaModel {
        @NameInMap("DatabaseAccountId")
        private String databaseAccountId;

        @NameInMap("DatabaseAccountName")
        private String databaseAccountName;

        @NameInMap("DatabaseId")
        private String databaseId;

        @NameInMap("DatabaseSchema")
        private String databaseSchema;

        @NameInMap("HasPassword")
        private String hasPassword;

        private DatabaseAccounts(Builder builder) {
            this.databaseAccountId = builder.databaseAccountId;
            this.databaseAccountName = builder.databaseAccountName;
            this.databaseId = builder.databaseId;
            this.databaseSchema = builder.databaseSchema;
            this.hasPassword = builder.hasPassword;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatabaseAccounts create() {
            return builder().build();
        }

        /**
         * @return databaseAccountId
         */
        public String getDatabaseAccountId() {
            return this.databaseAccountId;
        }

        /**
         * @return databaseAccountName
         */
        public String getDatabaseAccountName() {
            return this.databaseAccountName;
        }

        /**
         * @return databaseId
         */
        public String getDatabaseId() {
            return this.databaseId;
        }

        /**
         * @return databaseSchema
         */
        public String getDatabaseSchema() {
            return this.databaseSchema;
        }

        /**
         * @return hasPassword
         */
        public String getHasPassword() {
            return this.hasPassword;
        }

        public static final class Builder {
            private String databaseAccountId; 
            private String databaseAccountName; 
            private String databaseId; 
            private String databaseSchema; 
            private String hasPassword; 

            /**
             * DatabaseAccountId.
             */
            public Builder databaseAccountId(String databaseAccountId) {
                this.databaseAccountId = databaseAccountId;
                return this;
            }

            /**
             * DatabaseAccountName.
             */
            public Builder databaseAccountName(String databaseAccountName) {
                this.databaseAccountName = databaseAccountName;
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
             * DatabaseSchema.
             */
            public Builder databaseSchema(String databaseSchema) {
                this.databaseSchema = databaseSchema;
                return this;
            }

            /**
             * HasPassword.
             */
            public Builder hasPassword(String hasPassword) {
                this.hasPassword = hasPassword;
                return this;
            }

            public DatabaseAccounts build() {
                return new DatabaseAccounts(this);
            } 

        } 

    }
}
