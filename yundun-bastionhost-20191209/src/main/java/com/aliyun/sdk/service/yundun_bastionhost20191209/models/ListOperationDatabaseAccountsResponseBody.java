// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOperationDatabaseAccountsResponseBody} extends {@link TeaModel}
 *
 * <p>ListOperationDatabaseAccountsResponseBody</p>
 */
public class ListOperationDatabaseAccountsResponseBody extends TeaModel {
    @NameInMap("DatabaseAccounts")
    private java.util.List < DatabaseAccounts> databaseAccounts;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListOperationDatabaseAccountsResponseBody(Builder builder) {
        this.databaseAccounts = builder.databaseAccounts;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOperationDatabaseAccountsResponseBody create() {
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

        public ListOperationDatabaseAccountsResponseBody build() {
            return new ListOperationDatabaseAccountsResponseBody(this);
        } 

    } 

    public static class DatabaseAccounts extends TeaModel {
        @NameInMap("DBName")
        private String DBName;

        @NameInMap("DatabaseAccountId")
        private String databaseAccountId;

        @NameInMap("DatabaseAccountName")
        private String databaseAccountName;

        @NameInMap("DatabaseId")
        private String databaseId;

        @NameInMap("HasPassword")
        private String hasPassword;

        @NameInMap("LoginAttribute")
        private String loginAttribute;

        @NameInMap("ProtocolName")
        private String protocolName;

        private DatabaseAccounts(Builder builder) {
            this.DBName = builder.DBName;
            this.databaseAccountId = builder.databaseAccountId;
            this.databaseAccountName = builder.databaseAccountName;
            this.databaseId = builder.databaseId;
            this.hasPassword = builder.hasPassword;
            this.loginAttribute = builder.loginAttribute;
            this.protocolName = builder.protocolName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatabaseAccounts create() {
            return builder().build();
        }

        /**
         * @return DBName
         */
        public String getDBName() {
            return this.DBName;
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
         * @return hasPassword
         */
        public String getHasPassword() {
            return this.hasPassword;
        }

        /**
         * @return loginAttribute
         */
        public String getLoginAttribute() {
            return this.loginAttribute;
        }

        /**
         * @return protocolName
         */
        public String getProtocolName() {
            return this.protocolName;
        }

        public static final class Builder {
            private String DBName; 
            private String databaseAccountId; 
            private String databaseAccountName; 
            private String databaseId; 
            private String hasPassword; 
            private String loginAttribute; 
            private String protocolName; 

            /**
             * DBName.
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
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
             * HasPassword.
             */
            public Builder hasPassword(String hasPassword) {
                this.hasPassword = hasPassword;
                return this;
            }

            /**
             * LoginAttribute.
             */
            public Builder loginAttribute(String loginAttribute) {
                this.loginAttribute = loginAttribute;
                return this;
            }

            /**
             * ProtocolName.
             */
            public Builder protocolName(String protocolName) {
                this.protocolName = protocolName;
                return this;
            }

            public DatabaseAccounts build() {
                return new DatabaseAccounts(this);
            } 

        } 

    }
}
